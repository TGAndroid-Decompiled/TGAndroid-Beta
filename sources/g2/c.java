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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.x31;
public final class c implements k, l5.e, u9.d, gh.d, b20, jt0, kt0 {
    public final int f13452a;

    public c(int i7) {
        this.f13452a = i7;
    }

    @Override
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
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
                byte[] bytes = u10.getBytes(xd.a.f58684a);
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
    public int k(f6 f6Var, boolean z9) {
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
                int w02 = k6.w0(k6.f27852d6, f6Var);
                if (z9) {
                    return k6.r1(0.9f, -15658735);
                }
                return g0.n(f10, w02, -14145496);
            case 7:
                if (!sc.e(256)) {
                    return k6.x0(null, k6.G8, false);
                }
                int x02 = k6.x0(null, k6.G8, false);
                if (z9) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.825f;
                }
                return k6.r1(f11, x02);
            case 8:
                if (sc.e(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return g0.n(f12, k6.w0(k6.f27852d6, f6Var), k6.w0(k6.Nl, f6Var));
            case 9:
                if (sc.e(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.76f;
                }
                return k6.r1(f13, k6.w0(k6.tj, f6Var));
            case 10:
                if (sc.e(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return g0.n(f14, k6.w0(k6.f27852d6, f6Var), k6.w0(k6.Ge, f6Var));
            case 11:
                if (sc.e(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.8f;
                }
                return g0.n(f15, k6.w0(k6.f27796a7, f6Var), k6.w0(k6.f27852d6, f6Var));
            case 12:
                return 855638016;
            case 13:
                return 1073741824;
            case 14:
                int w03 = k6.w0(k6.f27925h5, f6Var);
                if (z9) {
                    f16 = 0.82f;
                } else {
                    f16 = 0.78f;
                }
                return k6.r1(f16, w03);
            case 15:
                return k6.r1(0.075f, -16777216);
            case 16:
                int w04 = k6.w0(k6.G8, f6Var);
                if (z9) {
                    f17 = 0.85f;
                } else {
                    f17 = 0.825f;
                }
                return k6.r1(f17, w04);
            case 17:
                return k6.r1(0.88f, k6.w0(k6.f27852d6, f6Var));
            case 18:
                if (sc.e(262144)) {
                    f18 = 0.85f;
                } else {
                    f18 = 0.76f;
                }
                return g0.n(f18, k6.w0(k6.f27852d6, f6Var), k6.w0(k6.Ml, f6Var));
            case 19:
                if (sc.e(262144)) {
                    f19 = 0.85f;
                } else {
                    f19 = 0.76f;
                }
                return k6.r1(f19, k6.w0(k6.f27852d6, f6Var));
            case 20:
                return k6.r1(0.78f, k6.w0(k6.f27925h5, f6Var));
            case 21:
                return k6.r1(0.7f, k6.w0(k6.f27852d6, f6Var));
            case 22:
                sc.e(262144);
                return 0;
            default:
                if (sc.e(262144)) {
                    f20 = 0.85f;
                } else {
                    f20 = 0.76f;
                }
                return k6.r1(f20, k6.w0(k6.f27852d6, f6Var));
        }
    }

    public c(Object obj, int i7) {
        this.f13452a = i7;
    }
}
