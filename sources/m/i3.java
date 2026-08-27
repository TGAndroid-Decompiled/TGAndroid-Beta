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
import lh.h9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.i7;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.l7;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.yz;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.gi;
import org.telegram.ui.gw;
import org.telegram.ui.rn;

public final class i3 implements Runnable {

    public final int f17351a;

    public final Object f17352b;

    public i3(Object obj, int i10) {
        this.f17351a = i10;
        this.f17352b = obj;
    }

    @Override
    public final void run() {
        i iVar;
        int iN;
        int bottom;
        int iQ;
        int iDp;
        int i10 = this.f17351a;
        int i11 = 2;
        Object obj = this.f17352b;
        switch (i10) {
            case 0:
                ActionMenuView actionMenuView = ((Toolbar) obj).f1018a;
                if (actionMenuView != null && (iVar = actionMenuView.F) != null) {
                    iVar.l();
                    break;
                }
                break;
            case 1:
                m2.g gVar = (m2.g) obj;
                gVar.setScrollState(0);
                gVar.s();
                break;
            case 2:
                n2.s sVar = (n2.s) obj;
                n2.b bVar = sVar.d;
                bVar.k(0);
                n2.g gVar2 = n2.a0.f18098i;
                bVar.j(24, gVar2);
                sVar.c(gVar2);
                break;
            case 3:
                Object obj2 = ((a9.i) obj).f181b;
                break;
            case 4:
                org.telegram.ui.Cells.a0 a0Var = (org.telegram.ui.Cells.a0) obj;
                if (a0Var.f24049b == null) {
                    a0Var.f24049b = new androidx.emoji2.text.j(a0Var, i11);
                }
                androidx.emoji2.text.j jVar = a0Var.f24049b;
                int i12 = a0Var.f24050c + 1;
                a0Var.f24050c = i12;
                jVar.f1355b = i12;
                a0Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                break;
            case 5:
                s5 s5Var = (s5) obj;
                TextView textView = s5Var.f25634b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                s5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(s5Var.f25633a, (Property<TextView, Float>) property, 1.0f));
                s5Var.d.setDuration(250L);
                s5Var.d.setInterpolator(new DecelerateInterpolator());
                s5Var.d.addListener(new h9(this, 17));
                s5Var.d.start();
                break;
            case 6:
                p6 p6Var = (p6) obj;
                p6Var.a();
                RectF rectF = p6Var.f24985f;
                p6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(p6Var.v, 1000L);
                break;
            case 7:
                i7 i7Var = (i7) obj;
                if (i7Var.f24480b == null) {
                    i7Var.f24480b = new androidx.emoji2.text.j(i7Var, 3);
                }
                androidx.emoji2.text.j jVar2 = i7Var.f24480b;
                int i13 = i7Var.f24482c + 1;
                i7Var.f24482c = i13;
                jVar2.f1355b = i13;
                i7Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                break;
            case 8:
                r7 r7Var = (r7) obj;
                RectF rectF2 = r7Var.f25226n;
                r7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(r7Var.f25231y, 1000L);
                break;
            case 9:
                w9 w9Var = (w9) obj;
                if (w9Var.N && w9Var.E != null) {
                    if (w9Var.Z && w9Var.W == null) {
                        iN = AndroidUtilities.dp(8.0f);
                    } else if (w9Var.W != null) {
                        iN = w9Var.n() >> 1;
                    }
                    if (!w9Var.Z && !w9Var.f25877k0) {
                        if (w9Var.O) {
                            if (w9Var.W.getBottom() - iN < w9Var.F.getMeasuredHeight() - w9Var.p()) {
                                bottom = w9Var.W.getBottom() - w9Var.F.getMeasuredHeight();
                                iQ = w9Var.p();
                                iN = bottom + iQ;
                            }
                        } else if (w9Var.W.getTop() + iN > w9Var.q()) {
                            bottom = -w9Var.W.getTop();
                            iQ = w9Var.q();
                            iN = bottom + iQ;
                        }
                    }
                    zk0 zk0Var = w9Var.E;
                    if (zk0Var != null) {
                        if (!w9Var.O) {
                            iN = -iN;
                        }
                        zk0Var.scrollBy(0, iN);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    break;
                }
                break;
            case 10:
                l7 l7Var = (l7) obj;
                b8 b8Var = l7Var.f30315y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i14 = b8Var.F0 + 1;
                    b8Var.F0 = i14;
                    if (i14 == 1) {
                        l7Var.v = true;
                        b8Var.D0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            b8Var.C0();
                        } else if (b8Var.D0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(b8Var.J0);
                            b8Var.H0 = 0L;
                        }
                        MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                    } else if (i14 != 2) {
                        MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                    } else {
                        MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                    }
                    break;
                }
                break;
            case 11:
                b8 b8Var2 = (b8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration == 0 || duration == -9223372036854775807L) {
                    b8Var2.G0 = System.currentTimeMillis();
                    break;
                } else {
                    float f10 = b8Var2.E0;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j10 = jCurrentTimeMillis - b8Var2.G0;
                    b8Var2.G0 = jCurrentTimeMillis;
                    long j11 = jCurrentTimeMillis - b8Var2.H0;
                    int i15 = b8Var2.F0;
                    float f11 = duration;
                    float f12 = ((long) ((f10 * f11) + (((i15 == 1 ? 3L : i15 == 2 ? 6L : 12L) * j10) - j10))) / f11;
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    b8Var2.E0 = f12;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = b8Var2.E0;
                        }
                        b8Var2.G0(playingMessageObject, false);
                    }
                    if (b8Var2.D0 == 1 && b8Var2.F0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j11 > 200 || b8Var2.E0 == 0.0f) {
                            b8Var2.H0 = jCurrentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f12);
                        }
                        if (b8Var2.F0 > 0 && b8Var2.E0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(b8Var2.J0, 16L);
                            break;
                        }
                    }
                }
                break;
            case 12:
                tc tcVar = (tc) obj;
                tcVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                tcVar.f32733f.performHapticFeedback(0);
                Runnable runnable = tcVar.f32736j;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 13:
                ak akVar = (ak) obj;
                if (akVar.O) {
                    akVar.J.clear();
                    akVar.L.clear();
                    akVar.M.clear();
                    akVar.l();
                }
                break;
            case 14:
                dm dmVar = (dm) obj;
                em emVar = dmVar.L;
                if (emVar.F != null && !emVar.G) {
                    int iComputeVerticalScrollOffset = emVar.f28087r.computeVerticalScrollOffset();
                    boolean z10 = emVar.f28087r.computeVerticalScrollExtent() + iComputeVerticalScrollOffset >= (dmVar.e() - dmVar.f27804r) + dmVar.f27803n;
                    float fMax = Math.max(0.0f, (emVar.A - Math.max(0, iComputeVerticalScrollOffset - emVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float fMax2 = Math.max(0.0f, ((emVar.f28087r.getMeasuredHeight() - (emVar.A - iComputeVerticalScrollOffset)) - emVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float fDp = AndroidUtilities.dp(32.0f);
                    float fDp2 = (fMax >= fDp || iComputeVerticalScrollOffset <= emVar.getListTopPadding()) ? fMax2 < fDp ? AndroidUtilities.dp(6.0f) * (1.0f - (fMax2 / fDp)) : 0.0f : (-(1.0f - (fMax / fDp))) * AndroidUtilities.dp(6.0f);
                    int i16 = (int) fDp2;
                    if (Math.abs(i16) > 0 && emVar.f28087r.canScrollVertically(i16) && (fDp2 <= 0.0f || !z10)) {
                        emVar.A += fDp2;
                        emVar.f28087r.scrollBy(0, i16);
                        dmVar.invalidate();
                    }
                    dmVar.H = true;
                    dmVar.postDelayed(this, 15L);
                    break;
                }
                break;
            case 15:
                in inVar = (in) obj;
                i3 i3Var = inVar.Q0;
                z5 z5Var = inVar.f29415c1;
                if (z5Var != null) {
                    EditTextBoldCursor editField = z5Var.getEditField();
                    if (!inVar.D && editField != null && inVar.C && !inVar.f29411a1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(i3Var);
                        AndroidUtilities.runOnUIThread(i3Var, 100L);
                        break;
                    }
                }
                break;
            case 16:
                tt ttVar = (tt) obj;
                i3 i3Var2 = ttVar.L;
                ot otVar = ttVar.f32875a;
                if (!ttVar.f32885y && otVar != null && ttVar.J && !ttVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    otVar.requestFocus();
                    AndroidUtilities.showKeyboard(otVar);
                    AndroidUtilities.cancelRunOnUIThread(i3Var2);
                    AndroidUtilities.runOnUIThread(i3Var2, 100L);
                    break;
                }
                break;
            case 17:
                com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) ((jh.h3) obj).d;
                if (lVar.f4599a && !((ArrayList) lVar.d).isEmpty() && !((AnimatorSet) lVar.f4601c).isRunning()) {
                    try {
                        ((AnimatorSet) lVar.f4601c).start();
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 18:
                yy yyVar = (yy) obj;
                if (yyVar.f35052x0.f33462s == null) {
                    yyVar.T1 = false;
                    yyVar.a0();
                    break;
                }
                break;
            case 19:
                yz yzVar = (yz) obj;
                if (yzVar.K) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    float f13 = yzVar.f35084l0 + ((jElapsedRealtime <= 17 ? jElapsedRealtime : 17L) / 320.0f);
                    yzVar.f35084l0 = f13;
                    yzVar.setAnimationIdicatorProgress(yzVar.f35076e0.getInterpolation(f13));
                    if (yzVar.f35084l0 > 1.0f) {
                        yzVar.f35084l0 = 1.0f;
                    }
                    if (yzVar.f35084l0 >= 1.0f) {
                        yzVar.K = false;
                        yzVar.setEnabled(true);
                        tz tzVar = yzVar.F;
                        if (tzVar != null) {
                            ((gw) tzVar).b(1.0f);
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(yzVar.f35091r0);
                    }
                    break;
                }
                break;
            case 20:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.I0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f26389o0, 1000L);
                break;
            case 21:
                TextureView textureView = ((j50) obj).D0.f29979h0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new xq(20, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                break;
            case 22:
                e60 e60Var = (e60) obj;
                f60 f60Var = e60Var.f27959x;
                s50 s50Var = f60Var.R;
                if (s50Var != null && s50Var.getAdapter() != null) {
                    f60Var.R.getClass();
                    int iR = RecyclerView.R(e60Var);
                    if (iR >= 0) {
                        f60Var.P.v(f60Var.R.T(e60Var), iR);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                break;
            case 23:
                gb0 gb0Var = (gb0) obj;
                ValueAnimator valueAnimator = gb0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    gb0Var.h.start();
                    break;
                }
                break;
            case 24:
                dd0 dd0Var = (dd0) obj;
                dd0Var.e();
                AndroidUtilities.runOnUIThread(dd0Var.N, 100L);
                break;
            case 25:
                wh0 wh0Var = (wh0) obj;
                wh0Var.f34209y = true;
                ValueAnimator valueAnimator2 = wh0Var.f34210z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                wh0Var.f34208x = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                wh0Var.f34210z = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(wh0Var.f34186b0);
                wh0Var.f34210z.setInterpolator(new LinearInterpolator());
                wh0Var.f34210z.setDuration(150L);
                wh0Var.f34210z.start();
                break;
            case 26:
                zk0 zk0Var2 = (zk0) obj;
                gi giVar = zk0Var2.f35262d2;
                int[] iArr = zk0Var2.f35272i2;
                rn rnVar = giVar.d;
                iArr[0] = (int) rnVar.f42160o9;
                iArr[1] = rnVar.wa;
                if (zk0Var2.f35266f2) {
                    iDp = -AndroidUtilities.dp(12.0f);
                    zk0Var2.L0(0.0f, zk0Var2.f35272i2[0]);
                } else {
                    iDp = AndroidUtilities.dp(12.0f);
                    zk0Var2.L0(0.0f, zk0Var2.getMeasuredHeight() - zk0Var2.f35272i2[1]);
                }
                zk0Var2.f35262d2.d.f42213t0.scrollBy(0, iDp);
                if (zk0Var2.f35264e2) {
                    AndroidUtilities.runOnUIThread(zk0Var2.f35305z2);
                }
                break;
            case 27:
                ik0 ik0Var = (ik0) obj;
                i3 i3Var3 = ik0Var.f29388e0;
                if (!ik0Var.f29396n) {
                    ik0Var.Q = false;
                    ik0Var.invalidate();
                } else {
                    AndroidUtilities.cancelRunOnUIThread(i3Var3);
                    AndroidUtilities.runOnUIThread(i3Var3, 4000L);
                }
                break;
            case 28:
                bl0 bl0Var = (bl0) obj;
                RecyclerView recyclerView = bl0Var.f27127a;
                if (recyclerView != null) {
                    if (bl0Var.f27132g) {
                        recyclerView.scrollBy(0, -bl0Var.f27133i);
                        AndroidUtilities.runOnUIThread(this);
                    } else if (bl0Var.h) {
                        recyclerView.scrollBy(0, bl0Var.f27133i);
                        AndroidUtilities.runOnUIThread(this);
                    }
                    break;
                }
                break;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                if (scrollSlidingTextTabStrip.D) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    float f14 = scrollSlidingTextTabStrip.O + ((jElapsedRealtime2 <= 17 ? jElapsedRealtime2 : 17L) / scrollSlidingTextTabStrip.U);
                    scrollSlidingTextTabStrip.O = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.J.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.O > 1.0f) {
                        scrollSlidingTextTabStrip.O = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.O >= 1.0f) {
                        scrollSlidingTextTabStrip.D = false;
                        scrollSlidingTextTabStrip.setEnabled(true);
                        zl0 zl0Var = scrollSlidingTextTabStrip.f26510b;
                        if (zl0Var != null) {
                            zl0Var.o0(1.0f);
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.W);
                    }
                    break;
                }
                break;
        }
    }

    public i3(a9.i iVar, int i10) {
        this.f17351a = 3;
        this.f17352b = iVar;
    }
}
