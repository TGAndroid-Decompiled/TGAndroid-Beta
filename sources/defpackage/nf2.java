package defpackage;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class nf2 implements RequestDelegate {
    public final byte a;

    public nf2(byte b) {
        this.a = b;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                gm.c3(new jd((byte) 10));
                return;
            case 2:
                gm.c3(new sj1(tL_error, (byte) 1));
                return;
            case 3:
                gm.c3(new m87(tLObject, (byte) 1));
                return;
            case 4:
                RectF rectF = ProfileActivity.e7;
                return;
            case 5:
                gm.c3(new jd((byte) 10));
                return;
            case 6:
                gm.c3(new jd((byte) 10));
                return;
            case 7:
                gm.c3(new jd((byte) 10));
                return;
            case 8:
                gm.c3(new jd((byte) 10));
                return;
            case 9:
                gm.c3(new jd((byte) 10));
                return;
            case 10:
                gm.c3(new jd((byte) 10));
                return;
            case 11:
                gm.c3(new jd((byte) 10));
                return;
            case 12:
                VoIPService.lambda$callFailed$110(tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$createGroupInstance$70(tLObject, tL_error);
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
