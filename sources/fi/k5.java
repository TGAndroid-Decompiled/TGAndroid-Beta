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
import org.telegram.ui.Components.fw;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dk0;
import org.telegram.ui.gd0;
import org.telegram.ui.hf0;
import org.telegram.ui.io;
import org.telegram.ui.la;
import org.telegram.ui.m21;
import org.telegram.ui.ml0;
public final class k5 implements RequestDelegate {
    public final int f12186a;

    public k5(int i7) {
        this.f12186a = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12186a) {
            case 0:
                org.telegram.messenger.g0.g3(new ai.o(14));
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
                int[] iArr = hi.d1.f14359b0;
                return;
            case 5:
                org.telegram.messenger.g0.g3(new ai.o(21));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new ai.o(21));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new ai.o(21));
                return;
            case 8:
                org.telegram.messenger.q5 q5Var = org.telegram.messenger.f4.f23831s;
                return;
            case 9:
                return;
            case 10:
                int i7 = zb.f28277i;
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
                String str = xs.f27958k0;
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
                Pattern pattern2 = org.telegram.ui.Components.b5.f33529a;
                return;
            case 19:
                int i12 = fw.I0;
                return;
            case 20:
                int i13 = pz.H0;
                return;
            case 21:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(0));
                return;
            case 22:
                int i14 = uy0.f40437e;
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
                List list = ml0.f49877h1;
                return;
            case 27:
                RectF rectF = ProfileActivity.Z6;
                return;
            default:
                int i17 = m21.f49739p1;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
