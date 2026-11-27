package defpackage;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class xe2 implements RequestDelegate {
    public final byte a;

    public xe2(byte b) {
        this.a = b;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                hl.c3(new kc((byte) 10));
                return;
            case 2:
                hl.c3(new ti1(tL_error, (byte) 1));
                return;
            case 3:
                hl.c3(new d87(tLObject, (byte) 1));
                return;
            case 4:
                RectF rectF = ProfileActivity.Z6;
                return;
            case 5:
                hl.c3(new kc((byte) 10));
                return;
            case 6:
                hl.c3(new kc((byte) 10));
                return;
            case 7:
                hl.c3(new kc((byte) 10));
                return;
            case 8:
                hl.c3(new kc((byte) 10));
                return;
            case 9:
                hl.c3(new kc((byte) 10));
                return;
            case 10:
                hl.c3(new kc((byte) 10));
                return;
            case 11:
                hl.c3(new kc((byte) 10));
                return;
            case 12:
                VoIPService.lambda$createGroupInstance$71(tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$callFailed$111(tLObject, tL_error);
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
