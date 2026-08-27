package hh;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.gy;
import org.telegram.ui.rn;
import org.telegram.ui.yw;

public final class y9 implements Runnable {

    public final int f10393a;

    public final Object f10394b;

    public y9(Object obj, int i10) {
        this.f10393a = i10;
        this.f10394b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f10393a;
        boolean z10 = false;
        Object obj = this.f10394b;
        switch (i10) {
            case 0:
                z9 z9Var = (z9) obj;
                z9Var.getClass();
                try {
                    zk0 currentListView = ((oa) z9Var.I0).N.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 1:
                we.e.s(((ea) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 2:
                we.e.s(((fa) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 3:
                i3.f fVar = (i3.f) obj;
                i3.a aVarA = fVar.a();
                fVar.l(aVarA, 1028, new i3.d(aVarA));
                fVar.f10534f.d();
                break;
            case 4:
                ig.v vVar = (ig.v) ((ga.c) obj).f6834b;
                ig.u uVar = vVar.f11458b;
                if (uVar != null) {
                    uVar.d();
                }
                vVar.f11457a.z7(true);
                break;
            case 5:
                ((ValueAnimator) obj).start();
                break;
            case 6:
                org.telegram.ui.ActionBar.n2 n2Var = ((ig.z) obj).f11475b2.f11283r;
                if (!(n2Var instanceof rn)) {
                    org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                    if (n2VarR != null) {
                        n2VarR.showDialog(new ag.g2(n2Var, 11, false));
                    }
                } else {
                    n2Var.showDialog(new ag.g2(n2Var, 11, false));
                }
                break;
            case 7:
                gy gyVar = ((yw) obj).K0;
                if (gyVar.H && gyVar.X3().G()) {
                    gyVar.A0.h();
                } else {
                    gyVar.x4(true, true);
                }
                break;
            case 8:
                ((jh.b1) obj).f13075a.t(false);
                break;
            case 9:
                jh.d1 d1Var = ((jh.c1) obj).f13136a;
                NotificationCenter.getInstance(d1Var.f13177e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var.g()));
                break;
            case 10:
                jh.i1 i1Var = (jh.i1) obj;
                i1Var.D = false;
                i1Var.p(false);
                i1Var.P = false;
                break;
            case 11:
                ((jh.e3) obj).f13218a.Q0();
                break;
            case 12:
                jh.e4 e4Var = ((jh.j3) obj).f13531x;
                jh.y3 y3Var = e4Var.M1;
                if (y3Var != null) {
                    if (e4Var.P1 || e4Var.Q1 || e4Var.R1) {
                        if (!e4Var.K1.f13144e) {
                            e4Var.S0 = 0L;
                        } else {
                            e4Var.I2.f13192b.loopBack();
                        }
                        break;
                    } else {
                        jh.i9 i9Var = ((jh.z8) y3Var).d;
                        if (!i9Var.f13487j0.getCurrentPeerView().d1(true) && !i9Var.f13487j0.E(true)) {
                            i9Var.q(true);
                            break;
                        }
                    }
                }
                break;
            case 13:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                }
                break;
            case 14:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                int i11 = ProfileStoriesView.f36200o0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                break;
            case 15:
                jh.c5.a(((jh.y4) obj).d);
                break;
            case 16:
                jh.o5 o5Var = (jh.o5) obj;
                if (o5Var.isShowing()) {
                    o5Var.r(true);
                }
                break;
            case 17:
                ((lh.z8) obj).run();
                break;
            case 18:
                lh.a1 a1Var = (lh.a1) obj;
                a1Var.b(a1Var.f15625b);
                a1Var.f15626c = false;
                break;
            case 19:
                jh.w6 w6Var = (jh.w6) obj;
                w6Var.c();
                w6Var.a(true);
                break;
            case 20:
                ((jh.u5) obj).accept(null);
                break;
            case 21:
                ((jh.g7) obj).onDetachedFromWindow();
                break;
            case 22:
                jh.p7 p7Var = (jh.p7) obj;
                ArrayList arrayList = p7Var.f13830c;
                if (arrayList != null) {
                    p7Var.f13828a.f13283v1 = arrayList;
                }
                jh.e4 e4Var2 = p7Var.f13828a;
                long j10 = p7Var.f13829b;
                if (e4Var2.f13291x1 != j10 || e4Var2.f13283v1 != null) {
                    e4Var2.f13291x1 = j10;
                    e4Var2.j1();
                    e4Var2.i1();
                    e4Var2.f1(true);
                    TL_stories.PeerStories peerStories = e4Var2.F0.M0;
                    if (peerStories == null) {
                        jh.s6 s6Var = e4Var2.O1;
                        TL_stories.PeerStories peerStoriesY = s6Var.y(j10);
                        if (peerStoriesY == null) {
                            peerStoriesY = s6Var.z(j10);
                            z10 = true;
                        }
                        s6Var.S(peerStoriesY, z10);
                    } else {
                        e4Var2.O1.S(peerStories, true);
                    }
                }
                break;
            case 23:
                ((m80) obj).d(true);
                break;
            case 24:
                ((jh.d8) obj).requestLayout();
                break;
            case 25:
                jh.m8 m8Var = (jh.m8) obj;
                lh.w3 w3Var = m8Var.f13660c;
                if (w3Var != null) {
                    w3Var.e(true);
                    m8Var.f13660c = null;
                }
                m8Var.b(false);
                break;
            case 26:
                jh.k8 k8Var = (jh.k8) obj;
                if (k8Var.v) {
                    k8Var.A = true;
                    k8Var.B = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    k8Var.f13595e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.f13596f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.invalidate();
                    break;
                }
                break;
            case 27:
                jh.i9 i9Var2 = ((jh.r8) obj).f13922b;
                try {
                    jh.w8 w8Var = i9Var2.f13505s;
                    if (w8Var != null) {
                        if (i9Var2.f13467b) {
                            AndroidUtilities.removeFromParent(w8Var);
                        } else {
                            i9Var2.f13493n.removeView(w8Var);
                        }
                        i9Var2.f13505s = null;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            case 28:
                ((jh.w8) obj).E0.K(true);
                break;
            default:
                ((jh.r9) obj).c();
                break;
        }
    }
}
