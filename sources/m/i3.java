package m;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.s6;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.z50;
import org.telegram.ui.Components.zq;
import org.telegram.ui.dw;
import org.telegram.ui.ei;
import org.telegram.ui.qn;
public final class i3 implements Runnable {
    public final int f16976a;
    public final Object f16977b;

    public i3(Object obj, int i9) {
        this.f16976a = i9;
        this.f16977b = obj;
    }

    @Override
    public final void run() {
        i iVar;
        int n10;
        int i9;
        int q10;
        long j10;
        float f10;
        boolean z10;
        float f11;
        int dp;
        int i10 = this.f16976a;
        long j11 = 17;
        Object obj = this.f16977b;
        switch (i10) {
            case 0:
                ActionMenuView actionMenuView = ((Toolbar) obj).f512a;
                if (actionMenuView != null && (iVar = actionMenuView.F) != null) {
                    iVar.l();
                    return;
                }
                return;
            case 1:
                m2.g gVar = (m2.g) obj;
                gVar.setScrollState(0);
                gVar.s();
                return;
            case 2:
                n2.t tVar = (n2.t) obj;
                n2.b bVar = tVar.d;
                bVar.k(0);
                n2.g gVar2 = n2.b0.f18295i;
                bVar.j(24, gVar2);
                tVar.c(gVar2);
                return;
            case 3:
                Object obj2 = ((k5.i) obj).f14659b;
                return;
            case 4:
                org.telegram.ui.Cells.a0 a0Var = (org.telegram.ui.Cells.a0) obj;
                if (a0Var.f24042b == null) {
                    a0Var.f24042b = new androidx.emoji2.text.i(a0Var, 2);
                }
                androidx.emoji2.text.i iVar2 = a0Var.f24042b;
                int i11 = a0Var.f24043c + 1;
                a0Var.f24043c = i11;
                iVar2.f853b = i11;
                a0Var.postDelayed(iVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 5:
                v5 v5Var = (v5) obj;
                TextView textView = v5Var.f25793b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                v5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(v5Var.f25792a, property, 1.0f));
                v5Var.d.setDuration(250L);
                v5Var.d.setInterpolator(new DecelerateInterpolator());
                v5Var.d.addListener(new mh.x(this, 15));
                v5Var.d.start();
                return;
            case 6:
                s6 s6Var = (s6) obj;
                s6Var.a();
                RectF rectF = s6Var.f25273f;
                s6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(s6Var.v, 1000L);
                return;
            case 7:
                l7 l7Var = (l7) obj;
                if (l7Var.f24654b == null) {
                    l7Var.f24654b = new androidx.emoji2.text.i(l7Var, 3);
                }
                androidx.emoji2.text.i iVar3 = l7Var.f24654b;
                int i12 = l7Var.f24656c + 1;
                l7Var.f24656c = i12;
                iVar3.f853b = i12;
                l7Var.postDelayed(iVar3, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 8:
                u7 u7Var = (u7) obj;
                RectF rectF2 = u7Var.f25754n;
                u7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(u7Var.f25759y, 1000L);
                return;
            case 9:
                aa aaVar = (aa) obj;
                if (aaVar.N && aaVar.E != null) {
                    if (aaVar.Z && aaVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (aaVar.W != null) {
                        n10 = aaVar.n() >> 1;
                    } else {
                        return;
                    }
                    if (!aaVar.Z && !aaVar.f24090k0) {
                        if (aaVar.O) {
                            if (aaVar.W.getBottom() - n10 < aaVar.F.getMeasuredHeight() - aaVar.p()) {
                                i9 = aaVar.W.getBottom() - aaVar.F.getMeasuredHeight();
                                q10 = aaVar.p();
                                n10 = i9 + q10;
                            }
                        } else if (aaVar.W.getTop() + n10 > aaVar.q()) {
                            i9 = -aaVar.W.getTop();
                            q10 = aaVar.q();
                            n10 = i9 + q10;
                        }
                    }
                    wk0 wk0Var = aaVar.E;
                    if (wk0Var != null) {
                        if (!aaVar.O) {
                            n10 = -n10;
                        }
                        wk0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.l7 l7Var2 = (org.telegram.ui.Components.l7) obj;
                c8 c8Var = l7Var2.f30390y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i13 = c8Var.F0 + 1;
                    c8Var.F0 = i13;
                    if (i13 == 1) {
                        l7Var2.v = true;
                        c8Var.D0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            c8Var.B0();
                        } else if (c8Var.D0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(c8Var.J0);
                            c8Var.H0 = 0L;
                        }
                        MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        return;
                    } else if (i13 == 2) {
                        MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        return;
                    } else {
                        MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                        return;
                    }
                }
                return;
            case 11:
                c8 c8Var2 = (c8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f12 = c8Var2.E0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j12 = currentTimeMillis - c8Var2.G0;
                    c8Var2.G0 = currentTimeMillis;
                    long j13 = currentTimeMillis - c8Var2.H0;
                    int i14 = c8Var2.F0;
                    if (i14 == 1) {
                        j10 = 3;
                    } else if (i14 == 2) {
                        j10 = 6;
                    } else {
                        j10 = 12;
                    }
                    float f13 = ((f12 * f10) + ((float) ((j10 * j12) - j12))) / ((float) duration);
                    if (f13 < 0.0f) {
                        f13 = 0.0f;
                    }
                    c8Var2.E0 = f13;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = c8Var2.E0;
                        }
                        c8Var2.F0(playingMessageObject, false);
                    }
                    if (c8Var2.D0 == 1 && c8Var2.F0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j13 > 200 || c8Var2.E0 == 0.0f) {
                            c8Var2.H0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f13);
                        }
                        if (c8Var2.F0 > 0 && c8Var2.E0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(c8Var2.J0, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                c8Var2.G0 = System.currentTimeMillis();
                return;
            case 12:
                wc wcVar = (wc) obj;
                wcVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                wcVar.f34191f.performHapticFeedback(0);
                Runnable runnable = wcVar.f34194j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                ek ekVar = (ek) obj;
                if (ekVar.O) {
                    ekVar.J.clear();
                    ekVar.L.clear();
                    ekVar.M.clear();
                    ekVar.l();
                    return;
                }
                return;
            case 14:
                gm gmVar = (gm) obj;
                hm hmVar = gmVar.L;
                if (hmVar.F != null && !hmVar.G) {
                    int computeVerticalScrollOffset = hmVar.f29124r.computeVerticalScrollOffset();
                    if (hmVar.f29124r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (gmVar.e() - gmVar.f28803r) + gmVar.f28802n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (hmVar.A - Math.max(0, computeVerticalScrollOffset - hmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((hmVar.f29124r.getMeasuredHeight() - (hmVar.A - computeVerticalScrollOffset)) - hmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > hmVar.getListTopPadding()) {
                        f11 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f11 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f11 = 0.0f;
                    }
                    int i15 = (int) f11;
                    if (Math.abs(i15) > 0 && hmVar.f29124r.canScrollVertically(i15) && (f11 <= 0.0f || !z10)) {
                        hmVar.A += f11;
                        hmVar.f29124r.scrollBy(0, i15);
                        gmVar.invalidate();
                    }
                    gmVar.H = true;
                    gmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 15:
                jn jnVar = (jn) obj;
                i3 i3Var = jnVar.Q0;
                c6 c6Var = jnVar.f29769c1;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!jnVar.D && editField != null && jnVar.C && !jnVar.f29765a1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(i3Var);
                        AndroidUtilities.runOnUIThread(i3Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ut utVar = (ut) obj;
                i3 i3Var2 = utVar.L;
                pt ptVar = utVar.f33121a;
                if (!utVar.f33131y && ptVar != null && utVar.J && !utVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    ptVar.requestFocus();
                    AndroidUtilities.showKeyboard(ptVar);
                    AndroidUtilities.cancelRunOnUIThread(i3Var2);
                    AndroidUtilities.runOnUIThread(i3Var2, 100L);
                    return;
                }
                return;
            case 17:
                com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) ((ih.j3) obj).d;
                if (lVar.f4157a && !((ArrayList) lVar.d).isEmpty() && !((AnimatorSet) lVar.f4159c).isRunning()) {
                    try {
                        ((AnimatorSet) lVar.f4159c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 18:
                wy wyVar = (wy) obj;
                if (wyVar.f34459x0.f32514s == null) {
                    wyVar.T1 = false;
                    wyVar.Z();
                    return;
                }
                return;
            case 19:
                vz vzVar = (vz) obj;
                if (vzVar.K) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 17) {
                        j11 = elapsedRealtime;
                    }
                    float f14 = vzVar.f34046l0 + (((float) j11) / 320.0f);
                    vzVar.f34046l0 = f14;
                    vzVar.setAnimationIdicatorProgress(vzVar.f34038e0.getInterpolation(f14));
                    if (vzVar.f34046l0 > 1.0f) {
                        vzVar.f34046l0 = 1.0f;
                    }
                    if (vzVar.f34046l0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(vzVar.f34053r0);
                        return;
                    }
                    vzVar.K = false;
                    vzVar.setEnabled(true);
                    qz qzVar = vzVar.F;
                    if (qzVar != null) {
                        ((dw) qzVar).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.I0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f26393o0, 1000L);
                return;
            case 21:
                TextureView textureView = ((e50) obj).D0.f28284h0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new zq(20, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            case 22:
                z50 z50Var = (z50) obj;
                a60 a60Var = z50Var.f35198x;
                n50 n50Var = a60Var.R;
                if (n50Var != null && n50Var.getAdapter() != null) {
                    a60Var.R.getClass();
                    int R = RecyclerView.R(z50Var);
                    if (R >= 0) {
                        a60Var.P.v(a60Var.R.T(z50Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 23:
                cb0 cb0Var = (cb0) obj;
                ValueAnimator valueAnimator = cb0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    cb0Var.h.start();
                    return;
                }
                return;
            case 24:
                yc0 yc0Var = (yc0) obj;
                yc0Var.e();
                AndroidUtilities.runOnUIThread(yc0Var.N, 100L);
                return;
            case 25:
                uh0 uh0Var = (uh0) obj;
                uh0Var.f33027y = true;
                ValueAnimator valueAnimator2 = uh0Var.f33028z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                uh0Var.f33026x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                uh0Var.f33028z = ofFloat;
                ofFloat.addUpdateListener(uh0Var.f33004b0);
                uh0Var.f33028z.setInterpolator(new LinearInterpolator());
                uh0Var.f33028z.setDuration(150L);
                uh0Var.f33028z.start();
                return;
            case 26:
                wk0 wk0Var2 = (wk0) obj;
                ei eiVar = wk0Var2.f34245d2;
                int[] iArr = wk0Var2.f34255i2;
                qn qnVar = eiVar.d;
                iArr[0] = (int) qnVar.o9;
                iArr[1] = qnVar.f42123wa;
                if (wk0Var2.f34249f2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    wk0Var2.L0(0.0f, wk0Var2.f34255i2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    wk0Var2.L0(0.0f, wk0Var2.getMeasuredHeight() - wk0Var2.f34255i2[1]);
                }
                wk0Var2.f34245d2.d.f42077t0.scrollBy(0, dp);
                if (wk0Var2.f34247e2) {
                    AndroidUtilities.runOnUIThread(wk0Var2.f34288z2);
                    return;
                }
                return;
            case 27:
                fk0 fk0Var = (fk0) obj;
                i3 i3Var3 = fk0Var.f28472e0;
                if (fk0Var.f28480n) {
                    AndroidUtilities.cancelRunOnUIThread(i3Var3);
                    AndroidUtilities.runOnUIThread(i3Var3, 4000L);
                    return;
                }
                fk0Var.Q = false;
                fk0Var.invalidate();
                return;
            case 28:
                yk0 yk0Var = (yk0) obj;
                RecyclerView recyclerView = yk0Var.f34988a;
                if (recyclerView != null) {
                    if (yk0Var.f34993g) {
                        recyclerView.scrollBy(0, -yk0Var.f34994i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (yk0Var.h) {
                        recyclerView.scrollBy(0, yk0Var.f34994i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                if (scrollSlidingTextTabStrip.D) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 <= 17) {
                        j11 = elapsedRealtime2;
                    }
                    float f15 = scrollSlidingTextTabStrip.O + (((float) j11) / ((float) scrollSlidingTextTabStrip.U));
                    scrollSlidingTextTabStrip.O = f15;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.J.getInterpolation(f15));
                    if (scrollSlidingTextTabStrip.O > 1.0f) {
                        scrollSlidingTextTabStrip.O = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.O < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.W);
                        return;
                    }
                    scrollSlidingTextTabStrip.D = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    wl0 wl0Var = scrollSlidingTextTabStrip.f26514b;
                    if (wl0Var != null) {
                        wl0Var.v0(1.0f);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public i3(k5.i iVar, int i9) {
        this.f16976a = 3;
        this.f16977b = iVar;
    }
}
