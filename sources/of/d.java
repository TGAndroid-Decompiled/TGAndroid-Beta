package of;

import java.io.File;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.vs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d implements vs {
    public final int f14163a;
    public final String f14164b;
    public boolean f14165c;

    public d(String str, int i10) {
        this.f14163a = i10;
        this.f14164b = str;
        at.f(i10).b(this, at.U1);
        at.f(i10).b(this, at.V1);
        b8.G(i10).i0(false, 50331648, str, true);
    }

    public final void a() {
        int i10 = this.f14163a;
        at.f(i10).n(this, at.U1);
        at.f(i10).n(this, at.V1);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.U1) {
            String str = (String) objArr[0];
            if (!this.f14165c && str.equals(this.f14164b)) {
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
                ConnectionsManager.getInstance(this.f14163a).sendRequest(uploadringtone, new ag.c(this, 12));
            }
        }
    }
}
