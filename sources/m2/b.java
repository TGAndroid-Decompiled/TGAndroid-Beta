package m2;

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
import androidx.emoji2.text.j;
import androidx.recyclerview.widget.RecyclerView;
import b4.e0;
import c2.p;
import cb.m;
import cb.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import l7.w0;
import m.r3;
import n7.fd;
import n7.gb;
import n7.i1;
import n7.ib;
import n7.j1;
import n7.ma;
import n7.mg;
import n7.xf;
import oh.f4;
import oh.h3;
import oh.i9;
import oh.s7;
import oh.y8;
import oh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.s6;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.m7;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.mi;
import org.telegram.ui.pw;
import org.telegram.ui.s5;
import org.telegram.ui.xn;
public final class b implements Runnable {
    public final int f13420a;
    public final Object f13421b;

    public b(Object obj, int i10) {
        this.f13420a = i10;
        this.f13421b = obj;
    }

    @Override
    public final void run() {
        l7.e eVar;
        int n10;
        int i10;
        int q10;
        long j10;
        float f10;
        boolean z4;
        float f11;
        int dp;
        int i11 = this.f13420a;
        l7.e eVar2 = null;
        int i12 = 3;
        long j11 = 0;
        Object obj = this.f13421b;
        switch (i11) {
            case 0:
                h hVar = (h) obj;
                hVar.setScrollState(0);
                hVar.s();
                return;
            case 1:
                xf xfVar = (xf) obj;
                ib ibVar = ib.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap hashMap = xfVar.f15820j;
                mg mgVar = (mg) hashMap.get(ibVar);
                if (mgVar != null) {
                    mg mgVar2 = mgVar;
                    fd fdVar = mgVar2.f15645a;
                    if (fdVar == null) {
                        mg mgVar3 = mgVar2;
                        fd fdVar2 = new fd(mgVar3, mgVar3.f15661c);
                        mgVar2.f15645a = fdVar2;
                        fdVar = fdVar2;
                    }
                    Iterator it = fdVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj2 = (Collection) mgVar.f15661c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(i12);
                        }
                        List list = (List) obj2;
                        if (list instanceof RandomAccess) {
                            eVar = new l7.e(mgVar, next, list, eVar2);
                        } else {
                            eVar = new l7.e(mgVar, next, list, eVar2);
                        }
                        ArrayList arrayList = new ArrayList(eVar);
                        Collections.sort(arrayList);
                        ?? obj3 = new Object();
                        int size = arrayList.size();
                        long j12 = j11;
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj4 = arrayList.get(i13);
                            i13++;
                            j12 = ((Long) obj4).longValue() + j12;
                        }
                        obj3.f11848c = Long.valueOf((j12 / arrayList.size()) & Long.MAX_VALUE);
                        obj3.f11846a = Long.valueOf(xf.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        obj3.f11850f = Long.valueOf(xf.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        obj3.f11849e = Long.valueOf(xf.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        obj3.d = Long.valueOf(xf.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        obj3.f11847b = Long.valueOf(xf.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(obj3);
                        int size2 = arrayList.size();
                        ?? obj5 = new Object();
                        obj5.f13329c = gb.TYPE_THIN;
                        w0 w0Var = new w0(8, false);
                        w0Var.f12081c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        w0Var.f12080b = (i1) next;
                        w0Var.d = maVar;
                        obj5.h = new j1(w0Var);
                        o.f2429a.execute(new p(xfVar, new e0((r3) obj5, 0), ibVar, xfVar.c(), false, 7));
                        eVar2 = null;
                        i12 = 3;
                        j11 = 0;
                    }
                    hashMap.remove(ibVar);
                    return;
                }
                return;
            case 2:
                Object obj6 = ((y5.h) obj).f50776b;
                return;
            case 3:
                f4 f4Var = (f4) obj;
                if (f4Var.H1 && f4Var.Y0) {
                    i9 i9Var = ((z8) f4Var.N1).d;
                    i9Var.f17274i1 = false;
                    i9Var.P();
                    return;
                }
                return;
            case 4:
                ((y8) obj).I0 = false;
                return;
            case 5:
                s7 s7Var = (s7) obj;
                s7Var.f17747b = false;
                s7Var.invalidate();
                return;
            case 6:
                a0 a0Var = (a0) obj;
                if (a0Var.f22532b == null) {
                    a0Var.f22532b = new j(a0Var, 2);
                }
                j jVar = a0Var.f22532b;
                int i14 = a0Var.f22533c + 1;
                a0Var.f22533c = i14;
                jVar.f831b = i14;
                a0Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 7:
                v5 v5Var = (v5) obj;
                TextView textView = v5Var.f24314b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                v5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(v5Var.f24313a, property, 1.0f));
                v5Var.d.setDuration(250L);
                v5Var.d.setInterpolator(new DecelerateInterpolator());
                v5Var.d.addListener(new s5(this, 8));
                v5Var.d.start();
                return;
            case 8:
                s6 s6Var = (s6) obj;
                s6Var.a();
                RectF rectF = s6Var.f23735f;
                s6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(s6Var.v, 1000L);
                return;
            case 9:
                l7 l7Var = (l7) obj;
                if (l7Var.f23114b == null) {
                    l7Var.f23114b = new j(l7Var, 3);
                }
                j jVar2 = l7Var.f23114b;
                int i15 = l7Var.f23116c + 1;
                l7Var.f23116c = i15;
                jVar2.f831b = i15;
                l7Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 10:
                u7 u7Var = (u7) obj;
                RectF rectF2 = u7Var.f24217n;
                u7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(u7Var.f24222y, 1000L);
                return;
            case 11:
                z9 z9Var = (z9) obj;
                if (z9Var.N && z9Var.E != null) {
                    if (z9Var.Z && z9Var.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (z9Var.W != null) {
                        n10 = z9Var.n() >> 1;
                    } else {
                        return;
                    }
                    if (!z9Var.Z && !z9Var.f24519k0) {
                        if (z9Var.O) {
                            if (z9Var.W.getBottom() - n10 < z9Var.F.getMeasuredHeight() - z9Var.p()) {
                                i10 = z9Var.W.getBottom() - z9Var.F.getMeasuredHeight();
                                q10 = z9Var.p();
                                n10 = i10 + q10;
                            }
                        } else if (z9Var.W.getTop() + n10 > z9Var.q()) {
                            i10 = -z9Var.W.getTop();
                            q10 = z9Var.q();
                            n10 = i10 + q10;
                        }
                    }
                    tl0 tl0Var = z9Var.E;
                    if (tl0Var != null) {
                        if (!z9Var.O) {
                            n10 = -n10;
                        }
                        tl0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            case 12:
                m7 m7Var = (m7) obj;
                c8 c8Var = m7Var.f28954y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i16 = c8Var.G0 + 1;
                    c8Var.G0 = i16;
                    if (i16 == 1) {
                        m7Var.v = true;
                        c8Var.E0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            c8Var.C0();
                        } else if (c8Var.E0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(c8Var.K0);
                            c8Var.I0 = 0L;
                        }
                        MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        return;
                    } else if (i16 == 2) {
                        MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        return;
                    } else {
                        MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                        return;
                    }
                }
                return;
            case 13:
                c8 c8Var2 = (c8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f12 = c8Var2.F0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j13 = currentTimeMillis - c8Var2.H0;
                    c8Var2.H0 = currentTimeMillis;
                    long j14 = currentTimeMillis - c8Var2.I0;
                    int i17 = c8Var2.G0;
                    if (i17 == 1) {
                        j10 = 3;
                    } else if (i17 == 2) {
                        j10 = 6;
                    } else {
                        j10 = 12;
                    }
                    float f13 = ((f12 * f10) + ((float) ((j10 * j13) - j13))) / ((float) duration);
                    if (f13 < 0.0f) {
                        f13 = 0.0f;
                    }
                    c8Var2.F0 = f13;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = c8Var2.F0;
                        }
                        c8Var2.G0(playingMessageObject, false);
                    }
                    if (c8Var2.E0 == 1 && c8Var2.G0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j14 > 200 || c8Var2.F0 == 0.0f) {
                            c8Var2.I0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f13);
                        }
                        if (c8Var2.G0 > 0 && c8Var2.F0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(c8Var2.K0, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                c8Var2.H0 = System.currentTimeMillis();
                return;
            case 14:
                xc xcVar = (xc) obj;
                xcVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                xcVar.f33027f.performHapticFeedback(0);
                Runnable runnable = xcVar.f33030j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                ik ikVar = (ik) obj;
                if (ikVar.P) {
                    ikVar.K.clear();
                    ikVar.M.clear();
                    ikVar.N.clear();
                    ikVar.l();
                    return;
                }
                return;
            case 16:
                pm pmVar = (pm) obj;
                qm qmVar = pmVar.M;
                if (qmVar.G != null && !qmVar.H) {
                    int computeVerticalScrollOffset = qmVar.f30416r.computeVerticalScrollOffset();
                    if (qmVar.f30416r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (pmVar.e() - pmVar.f30120r) + pmVar.f30119n) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    float max = Math.max(0.0f, (qmVar.B - Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((qmVar.f30416r.getMeasuredHeight() - (qmVar.B - computeVerticalScrollOffset)) - qmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > qmVar.getListTopPadding()) {
                        f11 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f11 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f11 = 0.0f;
                    }
                    int i18 = (int) f11;
                    if (Math.abs(i18) > 0 && qmVar.f30416r.canScrollVertically(i18) && (f11 <= 0.0f || !z4)) {
                        qmVar.B += f11;
                        qmVar.f30416r.scrollBy(0, i18);
                        pmVar.invalidate();
                    }
                    pmVar.I = true;
                    pmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 17:
                sn snVar = (sn) obj;
                b bVar = snVar.R0;
                c6 c6Var = snVar.f31101d1;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!snVar.E && editField != null && snVar.D && !snVar.f31097b1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        AndroidUtilities.runOnUIThread(bVar, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                fu fuVar = (fu) obj;
                b bVar2 = fuVar.M;
                au auVar = fuVar.f27001a;
                if (!fuVar.f27011y && auVar != null && fuVar.K && !fuVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    auVar.requestFocus();
                    AndroidUtilities.showKeyboard(auVar);
                    AndroidUtilities.cancelRunOnUIThread(bVar2);
                    AndroidUtilities.runOnUIThread(bVar2, 100L);
                    return;
                }
                return;
            case 19:
                m mVar = (m) ((h3) obj).d;
                if (mVar.f2424a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f2426c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f2426c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 20:
                mz mzVar = (mz) obj;
                if (mzVar.f29343y0.f30444s == null) {
                    mzVar.U1 = false;
                    mzVar.a0();
                    return;
                }
                return;
            case 21:
                l00 l00Var = (l00) obj;
                if (l00Var.L) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f14 = l00Var.m0 + (((float) elapsedRealtime) / 320.0f);
                    l00Var.m0 = f14;
                    l00Var.setAnimationIdicatorProgress(l00Var.f28496f0.getInterpolation(f14));
                    if (l00Var.m0 > 1.0f) {
                        l00Var.m0 = 1.0f;
                    }
                    if (l00Var.m0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(l00Var.f28511s0);
                        return;
                    }
                    l00Var.L = false;
                    l00Var.setEnabled(true);
                    g00 g00Var = l00Var.G;
                    if (g00Var != null) {
                        ((pw) g00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.J0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f24891p0, 1000L);
                return;
            case 23:
                TextureView textureView = ((y50) obj).E0.f33745i0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new gm(25, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                return;
            case 24:
                t60 t60Var = (t60) obj;
                u60 u60Var = t60Var.f31273x;
                h60 h60Var = u60Var.S;
                if (h60Var != null && h60Var.getAdapter() != null) {
                    u60Var.S.getClass();
                    int R = RecyclerView.R(t60Var);
                    if (R >= 0) {
                        u60Var.Q.v(u60Var.S.T(t60Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 25:
                yb0 yb0Var = (yb0) obj;
                ValueAnimator valueAnimator = yb0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    yb0Var.h.start();
                    return;
                }
                return;
            case 26:
                xd0 xd0Var = (xd0) obj;
                xd0Var.e();
                AndroidUtilities.runOnUIThread(xd0Var.O, 100L);
                return;
            case 27:
                ri0 ri0Var = (ri0) obj;
                ri0Var.f30732y = true;
                ValueAnimator valueAnimator2 = ri0Var.f30733z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ri0Var.f30731x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ri0Var.f30733z = ofFloat;
                ofFloat.addUpdateListener(ri0Var.f30709b0);
                ri0Var.f30733z.setInterpolator(new LinearInterpolator());
                ri0Var.f30733z.setDuration(150L);
                ri0Var.f30733z.start();
                return;
            case 28:
                tl0 tl0Var2 = (tl0) obj;
                mi miVar = tl0Var2.f31368e2;
                int[] iArr = tl0Var2.f31378j2;
                xn xnVar = miVar.d;
                iArr[0] = (int) xnVar.f43310p9;
                iArr[1] = xnVar.f43413xa;
                if (tl0Var2.f31372g2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    tl0Var2.L0(0.0f, tl0Var2.f31378j2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    tl0Var2.L0(0.0f, tl0Var2.getMeasuredHeight() - tl0Var2.f31378j2[1]);
                }
                tl0Var2.f31368e2.d.f43362u0.scrollBy(0, dp);
                if (tl0Var2.f31370f2) {
                    AndroidUtilities.runOnUIThread(tl0Var2.A2);
                    return;
                }
                return;
            default:
                cl0 cl0Var = (cl0) obj;
                b bVar3 = cl0Var.f26037f0;
                if (cl0Var.f26044n) {
                    AndroidUtilities.cancelRunOnUIThread(bVar3);
                    AndroidUtilities.runOnUIThread(bVar3, 4000L);
                    return;
                }
                cl0Var.R = false;
                cl0Var.invalidate();
                return;
        }
    }

    public b(xf xfVar) {
        this.f13420a = 1;
        ib ibVar = ib.UNKNOWN_EVENT;
        this.f13421b = xfVar;
    }

    public b(y5.h hVar, int i10) {
        this.f13420a = 2;
        this.f13421b = hVar;
    }
}
