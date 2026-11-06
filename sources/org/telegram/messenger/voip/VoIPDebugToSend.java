package org.telegram.messenger.voip;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.y1;
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

    public VoIPDebugToSend(int i7) {
        this.currentAccount = i7;
    }

    public static void b(VoIPDebugToSend voIPDebugToSend, TL_phone.saveCallDebug savecalldebug, TLRPC.InputFile inputFile) {
        voIPDebugToSend.lambda$done$0(savecalldebug, inputFile);
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
        w7.G(this.currentAccount).g0(file.getAbsolutePath(), new k(0, this, savecalldebug));
    }

    public void lambda$done$2(Data data, File file, TL_phone.saveCallDebug savecalldebug) {
        File file2 = new File(data.logPath);
        Typeface typeface = org.telegram.messenger.g0.f22509a;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            byte[] bArr = new byte[8192];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    gZIPOutputStream.write(bArr, 0, read);
                } else {
                    gZIPOutputStream.close();
                    bufferedInputStream.close();
                    org.telegram.messenger.g0.h3(new m(this, file, savecalldebug, 0));
                    return;
                }
            }
        } catch (FileNotFoundException e10) {
            a8.g(e10, true);
        } catch (IOException e11) {
            a8.g(e11, true);
        }
    }

    public void lambda$done$3(Data data, TL_phone.saveCallDebug savecalldebug, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (r2.f25191a) {
            a8.b("Sent debug logs, response = " + tLObject);
        }
        if ((tLObject instanceof TLRPC.TL_boolFalse) && !TextUtils.isEmpty(data.logPath)) {
            Utilities.f21335g.c(new l(this, data, new File(a8.p0.s(new StringBuilder(), data.logPath, ".gzip")), savecalldebug, 0));
        }
    }

    public void done(long j3, boolean z9) {
        Data remove = this.pending.remove(Long.valueOf(j3));
        if (remove != null && z9) {
            TL_phone.saveCallDebug savecalldebug = new TL_phone.saveCallDebug();
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            savecalldebug.debug = tL_dataJSON;
            tL_dataJSON.data = remove.state.debugLog;
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            savecalldebug.peer = tL_inputPhoneCall;
            tL_inputPhoneCall.access_hash = remove.access_hash;
            tL_inputPhoneCall.f27017id = remove.callId;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(savecalldebug, new n(this, remove, savecalldebug, 0));
        }
    }

    public void push(long j3, long j10, Instance.FinalState finalState, String str) {
        if (TextUtils.isEmpty(finalState.debugLog)) {
            try {
                finalState.debugLog = VoIPService.getStringFromFile(y1.e("" + j3));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        Data data = new Data();
        data.callId = j3;
        data.access_hash = j10;
        data.state = finalState;
        data.logPath = str;
        this.pending.put(Long.valueOf(j3), data);
    }
}
