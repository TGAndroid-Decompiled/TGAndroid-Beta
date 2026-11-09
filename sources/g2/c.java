package g2;

import a8.r7;
import android.util.Log;
import android.view.View;
import c8.g0;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import da.u2;
import g9.k;
import gb.n;
import gb.p0;
import gb.q0;
import hi.a3;
import hi.b4;
import hi.v3;
import java.nio.charset.Charset;
import kotlin.jvm.internal.j;
import org.telegram.messenger.b20;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.y31;
public final class c implements k, l5.e, u9.d, gh.d, b20, lt0, mt0 {
    public final int f13452a;

    public c(int i7) {
        this.f13452a = i7;
    }

    @Override
    public Boolean a(y31 y31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f13452a) {
            case 0:
                return Integer.valueOf(((b) obj).f13451r);
            case 1:
                p0 p0Var = (p0) obj;
                String u10 = q0.f13745b.u(p0Var);
                j.d(u10, "encode(...)");
                p0Var.getClass();
                n nVar = n.f13731b;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = u10.getBytes(xd.a.f58693a);
                j.d(bytes, "getBytes(...)");
                return bytes;
            default:
                ha.a.f14425b.getClass();
                return ea.a.f10726a.u((u2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override
    public Object e(r7 r7Var) {
        switch (this.f13452a) {
            case 3:
                return FirebaseSessionsRegistrar.b(r7Var);
            default:
                return FirebaseSessionsRegistrar.a(r7Var);
        }
    }

    @Override
    public void f(Object obj, float f10) {
        switch (this.f13452a) {
            case 26:
                a3 a3Var = (a3) obj;
                a3Var.f14514c = f10;
                a3Var.f14519f.invalidate();
                a3Var.X.setAlpha(f10);
                a3Var.J();
                a3Var.H();
                return;
            default:
                ((v3) obj).setLoadProgress(f10);
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f13452a) {
            case 25:
                return ((a3) obj).f14514c;
            case 26:
            default:
                return ((b4) obj).getSwipeOffsetY();
            case 27:
                return ((v3) obj).f15008c;
        }
    }

    @Override
    public int k(g6 g6Var, boolean z9) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        switch (this.f13452a) {
            case 6:
                if (sc.e(262144)) {
                    f10 = 0.82f;
                } else {
                    f10 = 0.76f;
                }
                int w02 = l6.w0(l6.f27865d6, g6Var);
                if (z9) {
                    return l6.r1(0.9f, -15658735);
                }
                return g0.m(f10, w02, -14145496);
            case 7:
                if (!sc.e(256)) {
                    return l6.x0(null, l6.G8, false);
                }
                int x02 = l6.x0(null, l6.G8, false);
                if (z9) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.825f;
                }
                return l6.r1(f11, x02);
            case 8:
                if (sc.e(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return g0.m(f12, l6.w0(l6.f27865d6, g6Var), l6.w0(l6.Nl, g6Var));
            case 9:
                if (sc.e(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.76f;
                }
                return l6.r1(f13, l6.w0(l6.tj, g6Var));
            case 10:
                if (sc.e(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return g0.m(f14, l6.w0(l6.f27865d6, g6Var), l6.w0(l6.Ge, g6Var));
            case 11:
                if (sc.e(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.8f;
                }
                return g0.m(f15, l6.w0(l6.f27809a7, g6Var), l6.w0(l6.f27865d6, g6Var));
            case 12:
                return 855638016;
            case 13:
                return 1073741824;
            case 14:
                int w03 = l6.w0(l6.f27938h5, g6Var);
                if (z9) {
                    f16 = 0.82f;
                } else {
                    f16 = 0.78f;
                }
                return l6.r1(f16, w03);
            case 15:
                return l6.r1(0.075f, -16777216);
            case 16:
                int w04 = l6.w0(l6.G8, g6Var);
                if (z9) {
                    f17 = 0.85f;
                } else {
                    f17 = 0.825f;
                }
                return l6.r1(f17, w04);
            case 17:
                return l6.r1(0.88f, l6.w0(l6.f27865d6, g6Var));
            case 18:
                if (sc.e(262144)) {
                    f18 = 0.85f;
                } else {
                    f18 = 0.76f;
                }
                return g0.m(f18, l6.w0(l6.f27865d6, g6Var), l6.w0(l6.Ml, g6Var));
            case 19:
                if (sc.e(262144)) {
                    f19 = 0.85f;
                } else {
                    f19 = 0.76f;
                }
                return l6.r1(f19, l6.w0(l6.f27865d6, g6Var));
            case 20:
                return l6.r1(0.78f, l6.w0(l6.f27938h5, g6Var));
            case 21:
                return l6.r1(0.7f, l6.w0(l6.f27865d6, g6Var));
            case 22:
                sc.e(262144);
                return 0;
            default:
                if (sc.e(262144)) {
                    f20 = 0.85f;
                } else {
                    f20 = 0.76f;
                }
                return l6.r1(f20, l6.w0(l6.f27865d6, g6Var));
        }
    }

    public c(Object obj, int i7) {
        this.f13452a = i7;
    }
}
