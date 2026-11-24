package defpackage;

import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ll9 implements jm7 {
    public final int a;
    public final String b;
    public boolean c;

    public ll9(String str, int i) {
        this.a = i;
        this.b = str;
        nm7.f(i).a(this, nm7.U1);
        nm7.f(i).a(this, nm7.V1);
        bc4.G(i).h0(false, 50331648, str, true);
    }

    public final void a() {
        int i = this.a;
        nm7.f(i).n(this, nm7.U1);
        nm7.f(i).n(this, nm7.V1);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.U1) {
            String str = (String) objArr[0];
            if (!this.c && str.equals(this.b)) {
                TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
                TL_account.uploadRingtone uploadringtone = new TL_account.uploadRingtone();
                uploadringtone.file = inputFile;
                uploadringtone.file_name = inputFile.name;
                String D = bc4.D(new File(inputFile.name));
                uploadringtone.mime_type = D;
                if ("ogg".equals(D)) {
                    uploadringtone.mime_type = "audio/ogg";
                } else {
                    uploadringtone.mime_type = "audio/mpeg";
                }
                ConnectionsManager.getInstance(this.a).sendRequest(uploadringtone, new r15(this, (byte) 29));
            }
        }
    }
}
