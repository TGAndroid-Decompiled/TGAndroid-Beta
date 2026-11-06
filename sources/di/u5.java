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
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ef0;
import org.telegram.ui.fo;
import org.telegram.ui.gd0;
import org.telegram.ui.hl0;
import org.telegram.ui.l21;
import org.telegram.ui.la;
import org.telegram.ui.xj0;
public final class u5 implements RequestDelegate {
    public final int f9836a;

    public u5(int i7) {
        this.f9836a = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9836a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.m0(8));
                return;
            case 1:
                Comparator comparator = y6.X;
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ai.m0(22));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ai.m0(22));
                return;
            case 4:
                int[] iArr = fi.b1.f11635a0;
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
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.f21947s;
                return;
            case 9:
                return;
            case 10:
                int i7 = bc.f21606i;
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
                String str = dt.f22050j0;
                return;
            case 15:
                Paint paint = la.H;
                return;
            case 16:
                int i11 = fo.f45674i3;
                return;
            case 17:
                org.telegram.messenger.g0.h3(new ai.m0(22));
                return;
            case 18:
                Pattern pattern2 = org.telegram.ui.Components.v4.f38823a;
                return;
            case 19:
                int i12 = tv.H0;
                return;
            case 20:
                int i13 = ez.A0;
                return;
            case 21:
                org.telegram.messenger.g0.h3(new ai.m0(22));
                return;
            case 22:
                int i14 = ky0.f35437e;
                return;
            case 23:
                int i15 = gd0.f45926v0;
                return;
            case 24:
                org.telegram.messenger.g0.h3(new ef0(tLObject, 5));
                return;
            case 25:
                int i16 = xj0.R;
                return;
            case 26:
                List list = hl0.f46385g1;
                return;
            case 27:
                RectF rectF = ProfileActivity.S6;
                return;
            default:
                int i17 = l21.l1;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
