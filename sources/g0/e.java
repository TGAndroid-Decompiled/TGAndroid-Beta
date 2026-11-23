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
import hi.d3;
import java.nio.charset.Charset;
import kotlin.jvm.internal.j;
import org.telegram.messenger.hd;
import org.telegram.messenger.j9;
import org.telegram.messenger.qc;
import org.telegram.messenger.s10;
import org.telegram.messenger.ve;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class e implements k, l5.e, u9.d, gh.d, j9, s10 {
    public final int f13105a;

    public e(int i7) {
        this.f13105a = i7;
    }

    public static ShortcutManager a(Object obj) {
        return (ShortcutManager) obj;
    }

    public static Class b() {
        return ShortcutManager.class;
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f13105a) {
            case 3:
                return Integer.valueOf(((g2.b) obj).f13149r);
            case 4:
                o0 o0Var = (o0) obj;
                String v = p0.f13428b.v(o0Var);
                j.d(v, "encode(...)");
                o0Var.getClass();
                m mVar = m.f13414b;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = v.getBytes(xd.a.f60490a);
                j.d(bytes, "getBytes(...)");
                return bytes;
            default:
                ha.a.f14131b.getClass();
                return ea.a.f10909a.v((u2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override
    public Object e(r7 r7Var) {
        n components$lambda$0;
        r components$lambda$1;
        switch (this.f13105a) {
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
                return hd.N0(2131748612, null);
            }
            return hd.H(',', "Stars", num.intValue());
        }
        return "" + num;
    }

    @Override
    public int j(h6 h6Var, boolean z10) {
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
        switch (this.f13105a) {
            case 9:
                if (qc.e(262144)) {
                    f10 = 0.82f;
                } else {
                    f10 = 0.76f;
                }
                int w02 = m6.w0(m6.f29381d6, h6Var);
                if (z10) {
                    return m6.r1(0.9f, -15658735);
                }
                return i0.n(f10, w02, -14145496);
            case 10:
                if (qc.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return m6.r1(f11, m6.w0(m6.f29381d6, h6Var));
            case 11:
                if (!qc.e(256)) {
                    return m6.x0(null, m6.G8, false);
                }
                int x02 = m6.x0(null, m6.G8, false);
                if (z10) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.825f;
                }
                return m6.r1(f12, x02);
            case 12:
                if (qc.e(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.76f;
                }
                return i0.n(f13, m6.w0(m6.f29381d6, h6Var), m6.w0(m6.Ql, h6Var));
            case 13:
                if (qc.e(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return i0.n(f14, m6.w0(m6.f29381d6, h6Var), m6.w0(m6.Je, h6Var));
            case 14:
                if (qc.e(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.8f;
                }
                return i0.n(f15, m6.w0(m6.f29324a7, h6Var), m6.w0(m6.f29381d6, h6Var));
            case 15:
                return 855638016;
            case 16:
                return 1073741824;
            case 17:
                int w03 = m6.w0(m6.f29454h5, h6Var);
                if (z10) {
                    f16 = 0.82f;
                } else {
                    f16 = 0.78f;
                }
                return m6.r1(f16, w03);
            case 18:
                return m6.r1(0.075f, -16777216);
            case 19:
                if (qc.e(262144)) {
                    f17 = 0.85f;
                } else {
                    f17 = 0.76f;
                }
                return m6.r1(f17, m6.w0(m6.wj, h6Var));
            case 20:
                return m6.r1(0.88f, m6.w0(m6.f29381d6, h6Var));
            case 21:
                int w04 = m6.w0(m6.G8, h6Var);
                if (z10) {
                    f18 = 0.85f;
                } else {
                    f18 = 0.825f;
                }
                return m6.r1(f18, w04);
            case 22:
                if (qc.e(262144)) {
                    f19 = 0.85f;
                } else {
                    f19 = 0.76f;
                }
                return i0.n(f19, m6.w0(m6.f29381d6, h6Var), m6.w0(m6.Pl, h6Var));
            case 23:
                if (qc.e(262144)) {
                    f20 = 0.85f;
                } else {
                    f20 = 0.76f;
                }
                return m6.r1(f20, m6.w0(m6.f29381d6, h6Var));
            case 24:
                return m6.r1(0.78f, m6.w0(m6.f29454h5, h6Var));
            case 25:
                return m6.r1(0.7f, m6.w0(m6.f29381d6, h6Var));
            default:
                qc.e(262144);
                return 0;
        }
    }

    @Override
    public Object m(Object obj) {
        Integer num = (Integer) obj;
        ve veVar = d3.f14486k0;
        return 0;
    }

    public e(l lVar) {
        this.f13105a = 4;
    }
}
