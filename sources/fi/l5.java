package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.xs;
import org.telegram.messenger.zb;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hw;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dk0;
import org.telegram.ui.gd0;
import org.telegram.ui.hf0;
import org.telegram.ui.io;
import org.telegram.ui.la;
import org.telegram.ui.ml0;
import org.telegram.ui.n21;
public final class l5 implements RequestDelegate {
    public final int f12262a;

    public l5(int i7) {
        this.f12262a = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12262a) {
            case 0:
                org.telegram.messenger.g0.g3(new ai.n(14));
                return;
            case 1:
                Comparator comparator = p6.X;
                return;
            case 2:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(0));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(0));
                return;
            case 4:
                int[] iArr = hi.d1.f14460b0;
                return;
            case 5:
                org.telegram.messenger.g0.g3(new ai.n(21));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new ai.n(21));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new ai.n(21));
                return;
            case 8:
                org.telegram.messenger.q5 q5Var = org.telegram.messenger.f4.f23856s;
                return;
            case 9:
                return;
            case 10:
                int i7 = zb.f28303i;
                return;
            case 11:
                Pattern pattern = ri.U1;
                return;
            case 12:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.a(tL_error, 25));
                return;
            case 13:
                int i10 = mp.I8;
                return;
            case 14:
                String str = xs.f27984k0;
                return;
            case 15:
                Paint paint = la.I;
                return;
            case 16:
                int i11 = io.j3;
                return;
            case 17:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(0));
                return;
            case 18:
                Pattern pattern2 = org.telegram.ui.Components.c5.f34019a;
                return;
            case 19:
                int i12 = hw.I0;
                return;
            case 20:
                int i13 = rz.H0;
                return;
            case 21:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(0));
                return;
            case 22:
                int i14 = wy0.f41921e;
                return;
            case 23:
                int i15 = gd0.f48051w0;
                return;
            case 24:
                org.telegram.messenger.g0.g3(new hf0(tLObject, 5));
                return;
            case 25:
                int i16 = dk0.S;
                return;
            case 26:
                List list = ml0.f49892h1;
                return;
            case 27:
                RectF rectF = ProfileActivity.Z6;
                return;
            default:
                int i17 = n21.f50070p1;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
