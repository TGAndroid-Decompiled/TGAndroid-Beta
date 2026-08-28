package ih;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dy;
import org.telegram.ui.vw;
public final class g implements Runnable {
    public final int f11458a;
    public final Object f11459b;

    public g(Object obj, int i9) {
        this.f11458a = i9;
        this.f11459b = obj;
    }

    @Override
    public final void run() {
        String str;
        boolean z10 = false;
        switch (this.f11458a) {
            case 0:
                dy dyVar = ((vw) this.f11459b).K0;
                if (dyVar.H && dyVar.X3().G()) {
                    dyVar.A0.h();
                    return;
                } else {
                    dyVar.x4(true, true);
                    return;
                }
            case 1:
                ((d1) this.f11459b).f11319a.t(false);
                return;
            case 2:
                f1 f1Var = ((e1) this.f11459b).f11347a;
                NotificationCenter.getInstance(f1Var.f11401e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(f1Var.g()));
                return;
            case 3:
                k1 k1Var = (k1) this.f11459b;
                k1Var.D = false;
                k1Var.p(false);
                k1Var.P = false;
                return;
            case 4:
                ((f3) this.f11459b).f11412a.Q0();
                return;
            case 5:
                i4 i4Var = ((l3) this.f11459b).f11705x;
                c4 c4Var = i4Var.M1;
                if (c4Var != null) {
                    if (!i4Var.P1 && !i4Var.Q1 && !i4Var.R1) {
                        m9 m9Var = ((d9) c4Var).d;
                        if (!m9Var.f11806j0.getCurrentPeerView().d1(true) && !m9Var.f11806j0.E(true)) {
                            m9Var.q(true);
                            return;
                        }
                        return;
                    } else if (i4Var.K1.f11469e) {
                        i4Var.I2.f11501b.loopBack();
                        return;
                    } else {
                        i4Var.S0 = 0L;
                        return;
                    }
                }
                return;
            case 6:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f11459b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 7:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f11459b;
                int i9 = ProfileStoriesView.f36197o0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                return;
            case 8:
                g5.a(((c5) this.f11459b).d);
                return;
            case 9:
                s5 s5Var = (s5) this.f11459b;
                if (s5Var.isShowing()) {
                    s5Var.q(true);
                    return;
                }
                return;
            case 10:
                ((kh.c9) this.f11459b).run();
                return;
            case 11:
                kh.b1 b1Var = (kh.b1) this.f11459b;
                b1Var.b(b1Var.f14977b);
                b1Var.f14978c = false;
                return;
            case 12:
                z6 z6Var = (z6) this.f11459b;
                z6Var.c();
                z6Var.a(true);
                return;
            case 13:
                ((y5) this.f11459b).accept(null);
                return;
            case 14:
                ((k7) this.f11459b).onDetachedFromWindow();
                return;
            case 15:
                t7 t7Var = (t7) this.f11459b;
                ArrayList arrayList = t7Var.f12171c;
                if (arrayList != null) {
                    t7Var.f12169a.f11596v1 = arrayList;
                }
                i4 i4Var2 = t7Var.f12169a;
                long j10 = t7Var.f12170b;
                if (i4Var2.f11604x1 != j10 || i4Var2.f11596v1 != null) {
                    i4Var2.f11604x1 = j10;
                    i4Var2.j1();
                    i4Var2.i1();
                    i4Var2.f1(true);
                    TL_stories.PeerStories peerStories = i4Var2.F0.M0;
                    if (peerStories != null) {
                        i4Var2.O1.S(peerStories, true);
                        return;
                    }
                    v6 v6Var = i4Var2.O1;
                    TL_stories.PeerStories y10 = v6Var.y(j10);
                    if (y10 == null) {
                        y10 = v6Var.z(j10);
                        z10 = true;
                    }
                    v6Var.S(y10, z10);
                    return;
                }
                return;
            case 16:
                ((i80) this.f11459b).d(true);
                return;
            case 17:
                ((h8) this.f11459b).requestLayout();
                return;
            case 18:
                q8 q8Var = (q8) this.f11459b;
                kh.x3 x3Var = q8Var.f12006c;
                if (x3Var != null) {
                    x3Var.e(true);
                    q8Var.f12006c = null;
                }
                q8Var.b(false);
                return;
            case 19:
                o8 o8Var = (o8) this.f11459b;
                if (o8Var.v) {
                    o8Var.A = true;
                    o8Var.B = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    o8Var.f11908e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    o8Var.f11909f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    o8Var.invalidate();
                    return;
                }
                return;
            case 20:
                m9 m9Var2 = ((v8) this.f11459b).f12265b;
                try {
                    a9 a9Var = m9Var2.f11824s;
                    if (a9Var != null) {
                        if (m9Var2.f11786b) {
                            AndroidUtilities.removeFromParent(a9Var);
                        } else {
                            m9Var2.f11812n.removeView(a9Var);
                        }
                        m9Var2.f11824s = null;
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 21:
                ((a9) this.f11459b).E0.K(true);
                return;
            case 22:
                ((v9) this.f11459b).c();
                return;
            case 23:
                ((ki) this.f11459b).hide();
                return;
            case 24:
                jh.q qVar = (jh.q) this.f11459b;
                uq0 uq0Var = qVar.S;
                f6 f6Var = qVar.f14363a;
                if (f6Var == null) {
                    str = "";
                } else {
                    str = f6Var.E;
                }
                uq0Var.a(str);
                return;
            case 25:
                ((kh.h) this.f11459b).f15385c.S = false;
                return;
            case 26:
                ((kh.l) this.f11459b).invalidateSelf();
                return;
            case 27:
                ((kh.e0) this.f11459b).f15134g = -1L;
                return;
            case 28:
                kh.n0 n0Var = (kh.n0) this.f11459b;
                yf.i iVar = n0Var.f15721b.D;
                if (iVar != null) {
                    iVar.b();
                }
                n0Var.f15721b.k();
                return;
            default:
                ((kh.w0) this.f11459b).a(false);
                return;
        }
    }
}
