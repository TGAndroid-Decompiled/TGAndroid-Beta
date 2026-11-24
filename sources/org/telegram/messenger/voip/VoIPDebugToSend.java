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
import org.telegram.messenger.voip.Instance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
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

    public VoIPDebugToSend(int i) {
        this.currentAccount = i;
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
        ba4.G(this.currentAccount).f0(new nu9(this, savecalldebug, (byte) 19), file.getAbsolutePath());
    }

    public void lambda$done$2(Data data, File file, TL_phone.saveCallDebug savecalldebug) {
        File file2 = new File(data.logPath);
        Typeface typeface = gl.a;
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
                    gl.d3(new wbc(this, file, savecalldebug, (byte) 4));
                    return;
                }
            }
        } catch (FileNotFoundException e) {
            fa4.g(e, true);
        } catch (IOException e2) {
            fa4.g(e2, true);
        }
    }

    public void lambda$done$3(final Data data, final TL_phone.saveCallDebug savecalldebug, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (w01.a) {
            fa4.b("Sent debug logs, response = " + tLObject);
        }
        if ((tLObject instanceof TLRPC.TL_boolFalse) && !TextUtils.isEmpty(data.logPath)) {
            final File file = new File(b00.j(new StringBuilder(), data.logPath, ".gzip"));
            Utilities.g.c(new Runnable() {
                @Override
                public final void run() {
                    VoIPDebugToSend.this.lambda$done$2(data, file, savecalldebug);
                }
            });
        }
    }

    public void done(long j, boolean z) {
        final Data remove = this.pending.remove(Long.valueOf(j));
        if (remove != null && z) {
            final TL_phone.saveCallDebug savecalldebug = new TL_phone.saveCallDebug();
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            savecalldebug.debug = tL_dataJSON;
            tL_dataJSON.data = remove.state.debugLog;
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            savecalldebug.peer = tL_inputPhoneCall;
            tL_inputPhoneCall.access_hash = remove.access_hash;
            tL_inputPhoneCall.id = remove.callId;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(savecalldebug, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    VoIPDebugToSend.this.lambda$done$3(remove, savecalldebug, tLObject, tL_error);
                }
            });
        }
    }

    public void push(long j, long j2, Instance.FinalState finalState, String str) {
        if (TextUtils.isEmpty(finalState.debugLog)) {
            try {
                finalState.debugLog = VoIPService.getStringFromFile(rgc.e(String.valueOf(j)));
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
}
