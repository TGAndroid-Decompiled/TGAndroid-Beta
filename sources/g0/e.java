package g0;

import a8.r7;
import android.content.pm.ShortcutManager;
import android.util.Log;
import c8.g0;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import da.u2;
import g9.k;
import gb.l;
import gb.m;
import gb.n;
import gb.o0;
import gb.p0;
import gb.r;
import hi.d3;
import java.nio.charset.Charset;
import kotlin.jvm.internal.j;
import org.telegram.messenger.b20;
import org.telegram.messenger.hd;
import org.telegram.messenger.j9;
import org.telegram.messenger.qc;
import org.telegram.messenger.t10;
import org.telegram.messenger.ve;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public final class e implements k, l5.e, u9.d, gh.d, j9, t10, b20 {
    public final int f12759a;

    public e(int i7) {
        this.f12759a = i7;
    }

    public static ShortcutManager a(Object obj) {
        return (ShortcutManager) obj;
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f12759a) {
            case 2:
                return Integer.valueOf(((g2.b) obj).f12803r);
            case 3:
                o0 o0Var = (o0) obj;
                String o4 = p0.f13082b.o(o0Var);
                j.d(o4, "encode(...)");
                o0Var.getClass();
                m mVar = m.f13068b;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = o4.getBytes(xd.a.f59875a);
                j.d(bytes, "getBytes(...)");
                return bytes;
            default:
                ha.a.f13785b.getClass();
                return ea.a.f10562a.o((u2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            if (num.intValue() == 0) {
                return hd.M0(2131748805, null);
            }
            return hd.H(',', "Stars", num.intValue());
        }
        return "" + num;
    }

    @Override
    public Object i(r7 r7Var) {
        n components$lambda$0;
        r components$lambda$1;
        switch (this.f12759a) {
            case 5:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(r7Var);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(r7Var);
                return components$lambda$1;
        }
    }

    @Override
    public int j(e6 e6Var, boolean z10) {
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
        switch (this.f12759a) {
            case 8:
                if (qc.e(262144)) {
                    f10 = 0.82f;
                } else {
                    f10 = 0.76f;
                }
                int w02 = j6.w0(j6.f28849d6, e6Var);
                if (z10) {
                    return j6.r1(0.9f, -15658735);
                }
                return g0.m(f10, w02, -14145496);
            case 9:
                if (!qc.e(256)) {
                    return j6.x0(null, j6.G8, false);
                }
                int x02 = j6.x0(null, j6.G8, false);
                if (z10) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.825f;
                }
                return j6.r1(f11, x02);
            case 10:
                if (qc.e(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return g0.m(f12, j6.w0(j6.f28849d6, e6Var), j6.w0(j6.Ql, e6Var));
            case 11:
                if (qc.e(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.76f;
                }
                return j6.r1(f13, j6.w0(j6.wj, e6Var));
            case 12:
                if (qc.e(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return g0.m(f14, j6.w0(j6.f28849d6, e6Var), j6.w0(j6.Je, e6Var));
            case 13:
                if (qc.e(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.8f;
                }
                return g0.m(f15, j6.w0(j6.f28792a7, e6Var), j6.w0(j6.f28849d6, e6Var));
            case 14:
                return 855638016;
            case 15:
                return 1073741824;
            case 16:
                int w03 = j6.w0(j6.f28922h5, e6Var);
                if (z10) {
                    f16 = 0.82f;
                } else {
                    f16 = 0.78f;
                }
                return j6.r1(f16, w03);
            case 17:
                return j6.r1(0.075f, -16777216);
            case 18:
                int w04 = j6.w0(j6.G8, e6Var);
                if (z10) {
                    f17 = 0.85f;
                } else {
                    f17 = 0.825f;
                }
                return j6.r1(f17, w04);
            case 19:
                return j6.r1(0.88f, j6.w0(j6.f28849d6, e6Var));
            case 20:
                if (qc.e(262144)) {
                    f18 = 0.85f;
                } else {
                    f18 = 0.76f;
                }
                return g0.m(f18, j6.w0(j6.f28849d6, e6Var), j6.w0(j6.Pl, e6Var));
            case 21:
                if (qc.e(262144)) {
                    f19 = 0.85f;
                } else {
                    f19 = 0.76f;
                }
                return j6.r1(f19, j6.w0(j6.f28849d6, e6Var));
            case 22:
                return j6.r1(0.78f, j6.w0(j6.f28922h5, e6Var));
            case 23:
                return j6.r1(0.7f, j6.w0(j6.f28849d6, e6Var));
            case 24:
                qc.e(262144);
                return 0;
            default:
                if (qc.e(262144)) {
                    f20 = 0.85f;
                } else {
                    f20 = 0.76f;
                }
                return j6.r1(f20, j6.w0(j6.f28849d6, e6Var));
        }
    }

    @Override
    public Object o(Object obj) {
        Integer num = (Integer) obj;
        ve veVar = d3.f14098k0;
        return 0;
    }

    public e(l lVar) {
        this.f12759a = 3;
    }
}
