package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.ac;
import org.telegram.messenger.at;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.zv;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ak0;
import org.telegram.ui.ed0;
import org.telegram.ui.ef0;
import org.telegram.ui.go;
import org.telegram.ui.i21;
import org.telegram.ui.jl0;
import org.telegram.ui.la;
public final class m5 implements RequestDelegate {
    public final int f12031a;

    public m5(int i7) {
        this.f12031a = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12031a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.o(12));
                return;
            case 1:
                Comparator comparator = s6.X;
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ai.o(28));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ai.o(28));
                return;
            case 4:
                int[] iArr = hi.c1.f13957b0;
                return;
            case 5:
                org.telegram.messenger.g0.h3(new ai.o(19));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new ai.o(19));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new ai.o(19));
                return;
            case 8:
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.f23022s;
                return;
            case 9:
                return;
            case 10:
                int i7 = ac.f22485i;
                return;
            case 11:
                Pattern pattern = si.S1;
                return;
            case 12:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.a(tL_error, 25));
                return;
            case 13:
                int i10 = np.D8;
                return;
            case 14:
                String str = at.f22557k0;
                return;
            case 15:
                Paint paint = la.I;
                return;
            case 16:
                int i11 = go.j3;
                return;
            case 17:
                org.telegram.messenger.g0.h3(new ai.o(28));
                return;
            case 18:
                Pattern pattern2 = org.telegram.ui.Components.t4.f39507a;
                return;
            case 19:
                int i12 = zv.I0;
                return;
            case 20:
                int i13 = iz.B0;
                return;
            case 21:
                org.telegram.messenger.g0.h3(new ai.o(28));
                return;
            case 22:
                int i14 = ny0.f37753e;
                return;
            case 23:
                int i15 = ed0.f46730w0;
                return;
            case 24:
                org.telegram.messenger.g0.h3(new ef0(tLObject, 5));
                return;
            case 25:
                int i16 = ak0.S;
                return;
            case 26:
                List list = jl0.f48380h1;
                return;
            case 27:
                RectF rectF = ProfileActivity.X6;
                return;
            default:
                int i17 = i21.f47886p1;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
