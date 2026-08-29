package org.telegram.messenger.voip;

import android.text.TextUtils;
import ih.b1;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.Instance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.h2;
public class VoIPDebugToSend {
    private final int currentAccount;
    private final HashMap<Long, Data> pending = new HashMap<>();

    public final class Data {
        long access_hash;
        long callId;
        String logPath;
        Instance.FinalState state;

        private Data() {
            VoIPDebugToSend.this = r1;
        }
    }

    public VoIPDebugToSend(int i10) {
        this.currentAccount = i10;
    }

    public void lambda$done$0(TL_phone.saveCallDebug savecalldebug, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            return;
        }
        TL_phone.saveCallLog savecalllog = new TL_phone.saveCallLog();
        savecalllog.peer = savecalldebug.peer;
        savecalllog.file = inputFile;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savecalllog, null);
    }

    public void lambda$done$1(File file, TL_phone.saveCallDebug savecalldebug) {
        FileLoader.getInstance(this.currentAccount).uploadFile(file.getAbsolutePath(), new b1(17, this, savecalldebug));
    }

    public void lambda$done$2(Data data, File file, TL_phone.saveCallDebug savecalldebug) {
        if (!AndroidUtilities.gzip(new File(data.logPath), file)) {
            return;
        }
        AndroidUtilities.runOnUIThread(new l(this, file, savecalldebug, 0));
    }

    public void lambda$done$3(Data data, TL_phone.saveCallDebug savecalldebug, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Sent debug logs, response = " + tLObject);
        }
        if ((tLObject instanceof TLRPC.TL_boolFalse) && !TextUtils.isEmpty(data.logPath)) {
            Utilities.searchQueue.postRunnable(new k(this, data, new File(a4.w.q(new StringBuilder(), data.logPath, ".gzip")), savecalldebug, 0));
        }
    }

    public void done(long j10, boolean z10) {
        Data remove = this.pending.remove(Long.valueOf(j10));
        if (remove != null && z10) {
            TL_phone.saveCallDebug savecalldebug = new TL_phone.saveCallDebug();
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            savecalldebug.debug = tL_dataJSON;
            tL_dataJSON.data = remove.state.debugLog;
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            savecalldebug.peer = tL_inputPhoneCall;
            tL_inputPhoneCall.access_hash = remove.access_hash;
            tL_inputPhoneCall.f22457id = remove.callId;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(savecalldebug, new m(this, remove, savecalldebug, 0));
        }
    }

    public void push(long j10, long j11, Instance.FinalState finalState, String str) {
        if (TextUtils.isEmpty(finalState.debugLog)) {
            try {
                finalState.debugLog = VoIPService.getStringFromFile(h2.e("" + j10, true));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        Data data = new Data();
        data.callId = j10;
        data.access_hash = j11;
        data.state = finalState;
        data.logPath = str;
        this.pending.put(Long.valueOf(j10), data);
    }
}
