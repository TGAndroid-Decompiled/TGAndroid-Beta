package org.telegram.messenger.voip;

import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.VoIPHelper;

public class VoIPDebugToSend {
    private final int currentAccount;
    private final HashMap<Long, Data> pending = new HashMap<>();

    public VoIPDebugToSend(int i) {
        this.currentAccount = i;
    }

    final class Data {
        long access_hash;
        long callId;
        String logPath;
        Instance.FinalState state;

        private Data() {
        }
    }

    public void push(long j, long j2, Instance.FinalState finalState, String str) {
        if (TextUtils.isEmpty(finalState.debugLog)) {
            try {
                finalState.debugLog = VoIPService.getStringFromFile(VoIPHelper.getLogFilePath("" + j, true));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Data data = new Data();
        data.callId = j;
        data.access_hash = j2;
        data.state = finalState;
        data.logPath = str;
        this.pending.put(Long.valueOf(j), data);
    }

    public void done(long j, boolean z) {
        final Data dataRemove = this.pending.remove(Long.valueOf(j));
        if (dataRemove == null || !z) {
            return;
        }
        final TL_phone.saveCallDebug savecalldebug = new TL_phone.saveCallDebug();
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        savecalldebug.debug = tL_dataJSON;
        tL_dataJSON.data = dataRemove.state.debugLog;
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        savecalldebug.peer = tL_inputPhoneCall;
        tL_inputPhoneCall.access_hash = dataRemove.access_hash;
        tL_inputPhoneCall.id = dataRemove.callId;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savecalldebug, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPDebugToSend.$r8$lambda$KDN788lan_fwQMs6aUn8wDUC3Zs(this.f$0, dataRemove, savecalldebug, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$KDN788lan_fwQMs6aUn8wDUC3Zs(final VoIPDebugToSend voIPDebugToSend, final Data data, final TL_phone.saveCallDebug savecalldebug, TLObject tLObject, TLRPC.TL_error tL_error) {
        voIPDebugToSend.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Sent debug logs, response = " + tLObject);
        }
        if (!(tLObject instanceof TLRPC.TL_boolFalse) || TextUtils.isEmpty(data.logPath)) {
            return;
        }
        final File file = new File(data.logPath + ".gzip");
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VoIPDebugToSend.m1174$r8$lambda$we_Hd6reQlC4bpQw3SW3N7tMqQ(this.f$0, data, file, savecalldebug);
            }
        });
    }

    public static void m1174$r8$lambda$we_Hd6reQlC4bpQw3SW3N7tMqQ(final VoIPDebugToSend voIPDebugToSend, Data data, final File file, final TL_phone.saveCallDebug savecalldebug) {
        voIPDebugToSend.getClass();
        if (AndroidUtilities.gzip(new File(data.logPath), file)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VoIPDebugToSend voIPDebugToSend2 = this.f$0;
                    FileLoader.getInstance(voIPDebugToSend2.currentAccount).uploadFile(file.getAbsolutePath(), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            VoIPDebugToSend.$r8$lambda$mUK38SKbO7DmRgx1xlWGZA_RuWs(this.f$0, savecalldebug, (TLRPC.InputFile) obj);
                        }
                    });
                }
            });
        }
    }

    public static void $r8$lambda$mUK38SKbO7DmRgx1xlWGZA_RuWs(VoIPDebugToSend voIPDebugToSend, TL_phone.saveCallDebug savecalldebug, TLRPC.InputFile inputFile) {
        voIPDebugToSend.getClass();
        if (inputFile == null) {
            return;
        }
        TL_phone.saveCallLog savecalllog = new TL_phone.saveCallLog();
        savecalllog.peer = savecalldebug.peer;
        savecalllog.file = inputFile;
        ConnectionsManager.getInstance(voIPDebugToSend.currentAccount).sendRequest(savecalllog, null);
    }
}
