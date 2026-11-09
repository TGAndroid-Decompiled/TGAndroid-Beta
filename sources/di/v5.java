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
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.uv;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gf0;
import org.telegram.ui.ho;
import org.telegram.ui.id0;
import org.telegram.ui.jl0;
import org.telegram.ui.la;
import org.telegram.ui.n21;
import org.telegram.ui.zj0;
public final class v5 implements RequestDelegate {
    public final int f9864a;

    public v5(int i7) {
        this.f9864a = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9864a) {
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
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.f21977s;
                return;
            case 9:
                return;
            case 10:
                int i7 = bc.f21634i;
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
                String str = dt.f22075j0;
                return;
            case 15:
                Paint paint = la.H;
                return;
            case 16:
                int i11 = ho.f46358i3;
                return;
            case 17:
                org.telegram.messenger.g0.h3(new ai.m0(24));
                return;
            case 18:
                Pattern pattern2 = org.telegram.ui.Components.v4.f38913a;
                return;
            case 19:
                int i12 = uv.H0;
                return;
            case 20:
                int i13 = fz.A0;
                return;
            case 21:
                org.telegram.messenger.g0.h3(new ai.m0(24));
                return;
            case 22:
                int i14 = my0.f36168e;
                return;
            case 23:
                int i15 = id0.f46621v0;
                return;
            case 24:
                org.telegram.messenger.g0.h3(new gf0(tLObject, 5));
                return;
            case 25:
                int i16 = zj0.R;
                return;
            case 26:
                List list = jl0.f46991g1;
                return;
            case 27:
                RectF rectF = ProfileActivity.V6;
                return;
            default:
                int i17 = n21.l1;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
