package g0;

import a8.r7;
import android.content.pm.ShortcutManager;
import android.util.Log;
import c8.i0;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import da.u2;
import g9.k;
import gb.l;
import gb.m;
import gb.n;
import gb.o0;
import gb.p0;
import gb.r;
import hi.e3;
import java.nio.charset.Charset;
import kotlin.jvm.internal.j;
import org.telegram.messenger.gd;
import org.telegram.messenger.i9;
import org.telegram.messenger.pc;
import org.telegram.messenger.r10;
import org.telegram.messenger.ue;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class e implements k, l5.e, u9.d, gh.d, i9, r10 {
    public final int f13073a;

    public e(int i7) {
        this.f13073a = i7;
    }

    public static ShortcutManager a(Object obj) {
        return (ShortcutManager) obj;
    }

    public static Class b() {
        return ShortcutManager.class;
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f13073a) {
            case 3:
                return Integer.valueOf(((g2.b) obj).f13117r);
            case 4:
                o0 o0Var = (o0) obj;
                String v = p0.f13396b.v(o0Var);
                j.d(v, "encode(...)");
                o0Var.getClass();
                m mVar = m.f13382b;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = v.getBytes(xd.a.f60445a);
                j.d(bytes, "getBytes(...)");
                return bytes;
            default:
                ha.a.f14099b.getClass();
                return ea.a.f10877a.v((u2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override
    public Object e(r7 r7Var) {
        n components$lambda$0;
        r components$lambda$1;
        switch (this.f13073a) {
            case 6:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(r7Var);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(r7Var);
                return components$lambda$1;
        }
    }

    @Override
    public Object g(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            if (num.intValue() == 0) {
                return gd.M0(2131748613, null);
            }
            return gd.H(',', "Stars", num.intValue());
        }
        return "" + num;
    }

    @Override
    public int j(i6 i6Var, boolean z10) {
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
        switch (this.f13073a) {
            case 9:
                if (pc.e(262144)) {
                    f10 = 0.82f;
                } else {
                    f10 = 0.76f;
                }
                int w02 = n6.w0(n6.f29394d6, i6Var);
                if (z10) {
                    return n6.r1(0.9f, -15658735);
                }
                return i0.n(f10, w02, -14145496);
            case 10:
                if (pc.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return n6.r1(f11, n6.w0(n6.f29394d6, i6Var));
            case 11:
                if (!pc.e(256)) {
                    return n6.x0(null, n6.G8, false);
                }
                int x02 = n6.x0(null, n6.G8, false);
                if (z10) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.825f;
                }
                return n6.r1(f12, x02);
            case 12:
                if (pc.e(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.76f;
                }
                return i0.n(f13, n6.w0(n6.f29394d6, i6Var), n6.w0(n6.Ql, i6Var));
            case 13:
                if (pc.e(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return i0.n(f14, n6.w0(n6.f29394d6, i6Var), n6.w0(n6.Je, i6Var));
            case 14:
                if (pc.e(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.8f;
                }
                return i0.n(f15, n6.w0(n6.f29337a7, i6Var), n6.w0(n6.f29394d6, i6Var));
            case 15:
                return 855638016;
            case 16:
                return 1073741824;
            case 17:
                int w03 = n6.w0(n6.f29467h5, i6Var);
                if (z10) {
                    f16 = 0.82f;
                } else {
                    f16 = 0.78f;
                }
                return n6.r1(f16, w03);
            case 18:
                return n6.r1(0.075f, -16777216);
            case 19:
                if (pc.e(262144)) {
                    f17 = 0.85f;
                } else {
                    f17 = 0.76f;
                }
                return n6.r1(f17, n6.w0(n6.wj, i6Var));
            case 20:
                return n6.r1(0.88f, n6.w0(n6.f29394d6, i6Var));
            case 21:
                int w04 = n6.w0(n6.G8, i6Var);
                if (z10) {
                    f18 = 0.85f;
                } else {
                    f18 = 0.825f;
                }
                return n6.r1(f18, w04);
            case 22:
                if (pc.e(262144)) {
                    f19 = 0.85f;
                } else {
                    f19 = 0.76f;
                }
                return i0.n(f19, n6.w0(n6.f29394d6, i6Var), n6.w0(n6.Pl, i6Var));
            case 23:
                if (pc.e(262144)) {
                    f20 = 0.85f;
                } else {
                    f20 = 0.76f;
                }
                return n6.r1(f20, n6.w0(n6.f29394d6, i6Var));
            case 24:
                return n6.r1(0.78f, n6.w0(n6.f29467h5, i6Var));
            case 25:
                return n6.r1(0.7f, n6.w0(n6.f29394d6, i6Var));
            default:
                pc.e(262144);
                return 0;
        }
    }

    @Override
    public Object m(Object obj) {
        Integer num = (Integer) obj;
        ue ueVar = e3.f14532k0;
        return 0;
    }

    public e(l lVar) {
        this.f13073a = 4;
    }
}
