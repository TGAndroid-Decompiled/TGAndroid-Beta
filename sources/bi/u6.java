package bi;

import a8.me;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cy;
import org.telegram.ui.qw;
public final class u6 implements Runnable {
    public final int f5517a;
    public final Object f5518b;

    public u6(com.google.firebase.messaging.j jVar, Intent intent) {
        this.f5517a = 10;
        this.f5518b = intent;
    }

    @Override
    public final void run() {
        boolean z10 = false;
        switch (this.f5517a) {
            case 0:
                b7 b7Var = (b7) this.f5518b;
                u6 u6Var = b7Var.f4358l0;
                org.telegram.ui.Components.y9[] y9VarArr = b7Var.d;
                if (y9VarArr[2 - b7Var.f4369u0].getImageReceiver().hasImageLoaded()) {
                    c6 c6Var = b7Var.f4344a0;
                    if (c6Var != null && c6Var.f4432c == 1 && b7Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(u6Var);
                        ValueAnimator valueAnimator = b7Var.f4357k0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            b7Var.f4357k0 = null;
                        }
                        int i10 = 1 - b7Var.f4369u0;
                        b7Var.f4369u0 = i10;
                        xj0 lottieAnimation = y9VarArr[2 - i10].getImageReceiver().getLottieAnimation();
                        xj0 lottieAnimation2 = y9VarArr[b7Var.f4369u0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        b7Var.f4348c0.c();
                        int i11 = b7Var.f4369u0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = b7Var.f4346b0;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) b7Var.f4350e0.c();
                        stargiftattributebackdropArr[i11] = stargiftattributebackdrop;
                        b7Var.e(i11, stargiftattributebackdrop);
                        b7Var.g(1, (TL_stars.starGiftAttributePattern) b7Var.f4349d0.c(), true);
                        b7Var.a();
                        float f7 = b7Var.f4369u0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                        b7Var.f4357k0 = ofFloat;
                        ofFloat.addUpdateListener(new x6(b7Var, 2));
                        b7Var.f4357k0.addListener(new a7(b7Var));
                        b7Var.f4357k0.setDuration(320L);
                        b7Var.f4357k0.setInterpolator(ds.h);
                        b7Var.f4357k0.start();
                        return;
                    }
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(u6Var);
                AndroidUtilities.runOnUIThread(u6Var, 150L);
                return;
            case 1:
                dd ddVar = (dd) this.f5518b;
                if (ddVar.U != null && ddVar.f4513a0 != -1) {
                    ddVar.j1("POSTED_ALIGN");
                    ddVar.U.a();
                    return;
                }
                return;
            case 2:
                ((ug.n) this.f5518b).setPaused(true);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) this.f5518b);
                return;
            case 4:
                ((k1[]) this.f5518b)[0].dismiss();
                return;
            case 5:
                qf.d.r(((tc) this.f5518b).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 6:
                qf.d.r(((uc) this.f5518b).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 7:
                ((c1.e) this.f5518b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 8:
                c2.b bVar = (c2.b) this.f5518b;
                ((Context) bVar.f5930b).unregisterReceiver((c2.a) bVar.f5931c);
                return;
            case 9:
                c2.a aVar = (c2.a) this.f5518b;
                if (aVar.f5928c.f5929a) {
                    aVar.f5926a.f13509a.C1(3, false);
                    return;
                }
                return;
            case 10:
                com.google.firebase.messaging.j.a((Intent) this.f5518b);
                return;
            case 11:
                me meVar = (me) this.f5518b;
                synchronized (((ArrayDeque) meVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) meVar.f614a).edit();
                    String str = (String) meVar.f615b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) meVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) meVar.f616c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 12:
                com.google.firebase.messaging.b0 b0Var = (com.google.firebase.messaging.b0) this.f5518b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + b0Var.f7727a.getAction() + " finishing.");
                b0Var.f7728b.trySetResult(null);
                return;
            case 13:
                cy cyVar = ((qw) this.f5518b).O0;
                if (cyVar.L && cyVar.f4().G()) {
                    cyVar.E0.h();
                    return;
                } else {
                    cyVar.F4(true, true);
                    return;
                }
            case 14:
                ((di.f1) this.f5518b).f8547a.t(false);
                return;
            case 15:
                di.h1 h1Var = ((di.g1) this.f5518b).f8573a;
                NotificationCenter.getInstance(h1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1Var.g()));
                return;
            case 16:
                di.o1 o1Var = (di.o1) this.f5518b;
                o1Var.H = false;
                o1Var.o(false);
                o1Var.T = false;
                return;
            case 17:
                ((di.l3) this.f5518b).f8756a.O0();
                return;
            case 18:
                di.q4 q4Var = ((di.q3) this.f5518b).f8964x;
                di.j4 j4Var = q4Var.F1;
                if (j4Var != null) {
                    if (!q4Var.I1 && !q4Var.J1 && !q4Var.K1) {
                        di.y9 y9Var = ((di.p9) j4Var).d;
                        if (!y9Var.f9445n0.getCurrentPeerView().b1(true) && !y9Var.f9445n0.E(true)) {
                            y9Var.q(true);
                            return;
                        }
                        return;
                    } else if (q4Var.D1.e) {
                        ((di.x9) q4Var.B2.f8902c).loopBack();
                        return;
                    } else {
                        q4Var.L0 = 0L;
                        return;
                    }
                }
                return;
            case 19:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f5518b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 20:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f5518b;
                int i12 = ProfileStoriesView.f36229s0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                return;
            case 21:
                di.t5.a(((di.o5) this.f5518b).d);
                return;
            case 22:
                di.f6 f6Var = (di.f6) this.f5518b;
                if (f6Var.isShowing()) {
                    f6Var.q(true);
                    return;
                }
                return;
            case 23:
                ((fi.w8) this.f5518b).run();
                return;
            case 24:
                fi.a1 a1Var = (fi.a1) this.f5518b;
                a1Var.c(a1Var.f10498b);
                a1Var.f10499c = false;
                return;
            case 25:
                di.l7 l7Var = (di.l7) this.f5518b;
                l7Var.c();
                l7Var.a(true);
                return;
            case 26:
                ((di.h6) this.f5518b).run(null);
                return;
            case 27:
                ((di.v7) this.f5518b).onDetachedFromWindow();
                return;
            case 28:
                di.e8 e8Var = (di.e8) this.f5518b;
                ArrayList arrayList = e8Var.f8528c;
                if (arrayList != null) {
                    e8Var.f8526a.f9008o1 = arrayList;
                }
                di.q4 q4Var2 = e8Var.f8526a;
                long j10 = e8Var.f8527b;
                if (q4Var2.f9016q1 != j10 || q4Var2.f9008o1 != null) {
                    q4Var2.f9016q1 = j10;
                    q4Var2.h1();
                    q4Var2.g1();
                    q4Var2.d1(true);
                    TL_stories.PeerStories peerStories = q4Var2.f9047y0.Q0;
                    if (peerStories != null) {
                        q4Var2.H1.S(peerStories, true);
                        return;
                    }
                    di.h7 h7Var = q4Var2.H1;
                    TL_stories.PeerStories y3 = h7Var.y(j10);
                    if (y3 == null) {
                        y3 = h7Var.z(j10);
                        z10 = true;
                    }
                    h7Var.S(y3, z10);
                    return;
                }
                return;
            default:
                ((w90) this.f5518b).d(true);
                return;
        }
    }

    public u6(Object obj, int i10) {
        this.f5517a = i10;
        this.f5518b = obj;
    }
}
