package di;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.bc;
import org.telegram.messenger.dt;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ak0;
import org.telegram.ui.hf0;
import org.telegram.ui.ho;
import org.telegram.ui.jd0;
import org.telegram.ui.kl0;
import org.telegram.ui.la;
import org.telegram.ui.o21;
public final class v5 implements RequestDelegate {
    public final int f9869a;

    public v5(int i7) {
        this.f9869a = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9869a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.m0(8));
                return;
            case 1:
                Comparator comparator = z6.X;
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ai.m0(24));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ai.m0(24));
                return;
            case 4:
                int[] iArr = fi.b1.f11640a0;
                return;
            case 5:
                org.telegram.messenger.g0.h3(new ai.m0(17));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new ai.m0(17));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new ai.m0(17));
                return;
            case 8:
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.f21981s;
                return;
            case 9:
                return;
            case 10:
                int i7 = bc.f21639i;
                return;
            case 11:
                Pattern pattern = ui.R1;
                return;
            case 12:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.a(tL_error, 25));
                return;
            case 13:
                int i10 = qp.C8;
                return;
            case 14:
                String str = dt.f22079j0;
                return;
            case 15:
                Paint paint = la.H;
                return;
            case 16:
                int i11 = ho.f46398i3;
                return;
            case 17:
                org.telegram.messenger.g0.h3(new ai.m0(24));
                return;
            case 18:
                Pattern pattern2 = org.telegram.ui.Components.u4.f38507a;
                return;
            case 19:
                int i12 = tv.H0;
                return;
            case 20:
                int i13 = ez.A0;
                return;
            case 21:
                org.telegram.messenger.g0.h3(new ai.m0(24));
                return;
            case 22:
                int i14 = ly0.f35761e;
                return;
            case 23:
                int i15 = jd0.f46957v0;
                return;
            case 24:
                org.telegram.messenger.g0.h3(new hf0(tLObject, 5));
                return;
            case 25:
                int i16 = ak0.R;
                return;
            case 26:
                List list = kl0.f47323g1;
                return;
            case 27:
                RectF rectF = ProfileActivity.V6;
                return;
            default:
                int i17 = o21.f48378o1;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
