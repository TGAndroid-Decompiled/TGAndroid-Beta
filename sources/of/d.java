package of;

import java.io.File;
import org.telegram.messenger.b8;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d implements us {
    public final int f14162a;
    public final String f14163b;
    public boolean f14164c;

    public d(String str, int i10) {
        this.f14162a = i10;
        this.f14163b = str;
        zs.f(i10).b(this, zs.U1);
        zs.f(i10).b(this, zs.V1);
        b8.G(i10).i0(false, 50331648, str, true);
    }

    public final void a() {
        int i10 = this.f14162a;
        zs.f(i10).n(this, zs.U1);
        zs.f(i10).n(this, zs.V1);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.U1) {
            String str = (String) objArr[0];
            if (!this.f14164c && str.equals(this.f14163b)) {
                TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
                TL_account.uploadRingtone uploadringtone = new TL_account.uploadRingtone();
                uploadringtone.file = inputFile;
                uploadringtone.file_name = inputFile.name;
                String D = b8.D(new File(inputFile.name));
                uploadringtone.mime_type = D;
                if ("ogg".equals(D)) {
                    uploadringtone.mime_type = "audio/ogg";
                } else {
                    uploadringtone.mime_type = "audio/mpeg";
                }
                ConnectionsManager.getInstance(this.f14162a).sendRequest(uploadringtone, new ag.c(this, 12));
            }
        }
    }
}
