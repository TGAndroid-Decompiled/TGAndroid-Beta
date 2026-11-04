package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.ub;
import org.telegram.messenger.us;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ao;
import org.telegram.ui.b21;
import org.telegram.ui.dd0;
import org.telegram.ui.dl0;
import org.telegram.ui.ka;
import org.telegram.ui.sg0;
import org.telegram.ui.uj0;
public final class u5 implements RequestDelegate {
    public final int f11089a;

    public u5(int i3) {
        this.f11089a = i3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11089a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.y1(12));
                return;
            case 1:
                Comparator comparator = z6.X;
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ai.y1(26));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ai.y1(26));
                return;
            case 4:
                int[] iArr = gi.b1.f12428b0;
                return;
            case 5:
                org.telegram.messenger.g0.h3(new ai.y1(21));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new ai.y1(21));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new ai.y1(21));
                return;
            case 8:
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.f22138s;
                return;
            case 9:
                return;
            case 10:
                int i3 = ub.f25666i;
                return;
            case 11:
                Pattern pattern = li.S1;
                return;
            case 12:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.a(tL_error, 24));
                return;
            case 13:
                int i10 = hp.C8;
                return;
            case 14:
                String str = us.f25747k0;
                return;
            case 15:
                Paint paint = ka.I;
                return;
            case 16:
                int i11 = ao.f43814j3;
                return;
            case 17:
                org.telegram.messenger.g0.h3(new ai.y1(26));
                return;
            case 18:
                Pattern pattern2 = org.telegram.ui.Components.t4.f38241a;
                return;
            case 19:
                int i12 = sv.I0;
                return;
            case 20:
                int i13 = bz.B0;
                return;
            case 21:
                org.telegram.messenger.g0.h3(new ai.y1(26));
                return;
            case 22:
                int i14 = ky0.f35509e;
                return;
            case 23:
                int i15 = dd0.f44634w0;
                return;
            case 24:
                org.telegram.messenger.g0.h3(new sg0(tLObject, 4));
                return;
            case 25:
                int i16 = uj0.S;
                return;
            case 26:
                List list = dl0.f44734h1;
                return;
            case 27:
                RectF rectF = ProfileActivity.T6;
                return;
            default:
                int i17 = b21.m1;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
