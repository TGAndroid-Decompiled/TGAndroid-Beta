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
import m.s3;
import n7.fd;
import n7.gb;
import n7.i1;
import n7.ib;
import n7.j1;
import n7.ma;
import n7.mg;
import n7.xf;
import nh.d4;
import nh.g3;
import nh.i9;
import nh.s7;
import nh.y8;
import nh.z8;
import o5.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Cells.k7;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.u5;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m7;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xt;
import org.telegram.ui.oi;
import org.telegram.ui.qw;
import org.telegram.ui.zn;
public final class b implements Runnable {
    public final int f13697a;
    public final Object f13698b;

    public b(Object obj, int i10) {
        this.f13697a = i10;
        this.f13698b = obj;
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
        int i11 = this.f13697a;
        l7.e eVar2 = null;
        int i12 = 3;
        long j11 = 0;
        Object obj = this.f13698b;
        switch (i11) {
            case 0:
                h hVar = (h) obj;
                hVar.setScrollState(0);
                hVar.s();
                return;
            case 1:
                xf xfVar = (xf) obj;
                ib ibVar = ib.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap hashMap = xfVar.f14799j;
                mg mgVar = (mg) hashMap.get(ibVar);
                if (mgVar != null) {
                    mg mgVar2 = mgVar;
                    fd fdVar = mgVar2.f14637a;
                    if (fdVar == null) {
                        mg mgVar3 = mgVar2;
                        fd fdVar2 = new fd(mgVar3, mgVar3.f14651c);
                        mgVar2.f14637a = fdVar2;
                        fdVar = fdVar2;
                    }
                    Iterator it = fdVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj2 = (Collection) mgVar.f14651c.get(next);
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
                        obj3.f11574c = Long.valueOf((j12 / arrayList.size()) & Long.MAX_VALUE);
                        obj3.f11572a = Long.valueOf(xf.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        obj3.f11575f = Long.valueOf(xf.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        obj3.e = Long.valueOf(xf.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        obj3.d = Long.valueOf(xf.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        obj3.f11573b = Long.valueOf(xf.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(obj3);
                        int size2 = arrayList.size();
                        ?? obj5 = new Object();
                        obj5.f13627c = gb.TYPE_THIN;
                        w0 w0Var = new w0(8, false);
                        w0Var.f11787c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        w0Var.f11786b = (i1) next;
                        w0Var.d = maVar;
                        obj5.h = new j1(w0Var);
                        o.f2260a.execute(new p(xfVar, new e0((s3) obj5, 0), ibVar, xfVar.c(), false, 7));
                        eVar2 = null;
                        i12 = 3;
                        j11 = 0;
                    }
                    hashMap.remove(ibVar);
                    return;
                }
                return;
            case 2:
                d4 d4Var = (d4) obj;
                if (d4Var.H1 && d4Var.Y0) {
                    i9 i9Var = ((z8) d4Var.N1).d;
                    i9Var.f15449i1 = false;
                    i9Var.P();
                    return;
                }
                return;
            case 3:
                ((y8) obj).I0 = false;
                return;
            case 4:
                s7 s7Var = (s7) obj;
                s7Var.f15872b = false;
                s7Var.invalidate();
                return;
            case 5:
                Object obj6 = ((i) obj).f16439b;
                return;
            case 6:
                a0 a0Var = (a0) obj;
                if (a0Var.f20787b == null) {
                    a0Var.f20787b = new j(a0Var, 2);
                }
                j jVar = a0Var.f20787b;
                int i14 = a0Var.f20788c + 1;
                a0Var.f20788c = i14;
                jVar.f776b = i14;
                a0Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 7:
                u5 u5Var = (u5) obj;
                TextView textView = u5Var.f22375b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                u5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(u5Var.f22374a, property, 1.0f));
                u5Var.d.setDuration(250L);
                u5Var.d.setInterpolator(new DecelerateInterpolator());
                u5Var.d.addListener(new org.telegram.ui.u5(this, 8));
                u5Var.d.start();
                return;
            case 8:
                r6 r6Var = (r6) obj;
                r6Var.a();
                RectF rectF = r6Var.f21869f;
                r6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(r6Var.v, 1000L);
                return;
            case 9:
                k7 k7Var = (k7) obj;
                if (k7Var.f21276b == null) {
                    k7Var.f21276b = new j(k7Var, 3);
                }
                j jVar2 = k7Var.f21276b;
                int i15 = k7Var.f21278c + 1;
                k7Var.f21278c = i15;
                jVar2.f776b = i15;
                k7Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 10:
                t7 t7Var = (t7) obj;
                RectF rectF2 = t7Var.f22341n;
                t7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(t7Var.f22346y, 1000L);
                return;
            case 11:
                y9 y9Var = (y9) obj;
                if (y9Var.N && y9Var.E != null) {
                    if (y9Var.Z && y9Var.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (y9Var.W != null) {
                        n10 = y9Var.n() >> 1;
                    } else {
                        return;
                    }
                    if (!y9Var.Z && !y9Var.f22619k0) {
                        if (y9Var.O) {
                            if (y9Var.W.getBottom() - n10 < y9Var.F.getMeasuredHeight() - y9Var.p()) {
                                i10 = y9Var.W.getBottom() - y9Var.F.getMeasuredHeight();
                                q10 = y9Var.p();
                                n10 = i10 + q10;
                            }
                        } else if (y9Var.W.getTop() + n10 > y9Var.q()) {
                            i10 = -y9Var.W.getTop();
                            q10 = y9Var.q();
                            n10 = i10 + q10;
                        }
                    }
                    rl0 rl0Var = y9Var.E;
                    if (rl0Var != null) {
                        if (!y9Var.O) {
                            n10 = -n10;
                        }
                        rl0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            case 12:
                m7 m7Var = (m7) obj;
                c8 c8Var = m7Var.f26979y;
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
                xcVar.f30587f.performHapticFeedback(0);
                Runnable runnable = xcVar.f30590j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                gk gkVar = (gk) obj;
                if (gkVar.P) {
                    gkVar.K.clear();
                    gkVar.M.clear();
                    gkVar.N.clear();
                    gkVar.l();
                    return;
                }
                return;
            case 16:
                mm mmVar = (mm) obj;
                nm nmVar = mmVar.M;
                if (nmVar.G != null && !nmVar.H) {
                    int computeVerticalScrollOffset = nmVar.f27299r.computeVerticalScrollOffset();
                    if (nmVar.f27299r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (mmVar.e() - mmVar.f27093r) + mmVar.f27092n) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    float max = Math.max(0.0f, (nmVar.B - Math.max(0, computeVerticalScrollOffset - nmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((nmVar.f27299r.getMeasuredHeight() - (nmVar.B - computeVerticalScrollOffset)) - nmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > nmVar.getListTopPadding()) {
                        f11 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f11 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f11 = 0.0f;
                    }
                    int i18 = (int) f11;
                    if (Math.abs(i18) > 0 && nmVar.f27299r.canScrollVertically(i18) && (f11 <= 0.0f || !z4)) {
                        nmVar.B += f11;
                        nmVar.f27299r.scrollBy(0, i18);
                        mmVar.invalidate();
                    }
                    mmVar.I = true;
                    mmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 17:
                pn pnVar = (pn) obj;
                b bVar = pnVar.R0;
                b6 b6Var = pnVar.f27939d1;
                if (b6Var != null) {
                    EditTextBoldCursor editField = b6Var.getEditField();
                    if (!pnVar.E && editField != null && pnVar.D && !pnVar.f27935b1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                cu cuVar = (cu) obj;
                b bVar2 = cuVar.M;
                xt xtVar = cuVar.f24030a;
                if (!cuVar.f24039y && xtVar != null && cuVar.K && !cuVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    xtVar.requestFocus();
                    AndroidUtilities.showKeyboard(xtVar);
                    AndroidUtilities.cancelRunOnUIThread(bVar2);
                    AndroidUtilities.runOnUIThread(bVar2, 100L);
                    return;
                }
                return;
            case 19:
                m mVar = (m) ((g3) obj).d;
                if (mVar.f2255a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f2257c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f2257c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 20:
                kz kzVar = (kz) obj;
                if (kzVar.f26500y0.f27615s == null) {
                    kzVar.U1 = false;
                    kzVar.a0();
                    return;
                }
                return;
            case 21:
                k00 k00Var = (k00) obj;
                if (k00Var.L) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f14 = k00Var.m0 + (((float) elapsedRealtime) / 320.0f);
                    k00Var.m0 = f14;
                    k00Var.setAnimationIdicatorProgress(k00Var.f26099f0.getInterpolation(f14));
                    if (k00Var.m0 > 1.0f) {
                        k00Var.m0 = 1.0f;
                    }
                    if (k00Var.m0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k00Var.f26114s0);
                        return;
                    }
                    k00Var.L = false;
                    k00Var.setEnabled(true);
                    f00 f00Var = k00Var.G;
                    if (f00Var != null) {
                        ((qw) f00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.J0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f23015p0, 1000L);
                return;
            case 23:
                TextureView textureView = ((x50) obj).E0.f30883i0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new em(25, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 24:
                s60 s60Var = (s60) obj;
                t60 t60Var = s60Var.f28674x;
                g60 g60Var = t60Var.S;
                if (g60Var != null && g60Var.getAdapter() != null) {
                    t60Var.S.getClass();
                    int R = RecyclerView.R(s60Var);
                    if (R >= 0) {
                        t60Var.Q.v(t60Var.S.T(s60Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 25:
                xb0 xb0Var = (xb0) obj;
                ValueAnimator valueAnimator = xb0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    xb0Var.h.start();
                    return;
                }
                return;
            case 26:
                wd0 wd0Var = (wd0) obj;
                wd0Var.e();
                AndroidUtilities.runOnUIThread(wd0Var.O, 100L);
                return;
            case 27:
                qi0 qi0Var = (qi0) obj;
                qi0Var.f28190y = true;
                ValueAnimator valueAnimator2 = qi0Var.f28191z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                qi0Var.f28189x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qi0Var.f28191z = ofFloat;
                ofFloat.addUpdateListener(qi0Var.f28168b0);
                qi0Var.f28191z.setInterpolator(new LinearInterpolator());
                qi0Var.f28191z.setDuration(150L);
                qi0Var.f28191z.start();
                return;
            case 28:
                rl0 rl0Var2 = (rl0) obj;
                oi oiVar = rl0Var2.f28496e2;
                int[] iArr = rl0Var2.f28506j2;
                zn znVar = oiVar.d;
                iArr[0] = (int) znVar.f40707p9;
                iArr[1] = znVar.f40810xa;
                if (rl0Var2.f28500g2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    rl0Var2.L0(0.0f, rl0Var2.f28506j2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    rl0Var2.L0(0.0f, rl0Var2.getMeasuredHeight() - rl0Var2.f28506j2[1]);
                }
                rl0Var2.f28496e2.d.f40759u0.scrollBy(0, dp);
                if (rl0Var2.f28498f2) {
                    AndroidUtilities.runOnUIThread(rl0Var2.A2);
                    return;
                }
                return;
            default:
                al0 al0Var = (al0) obj;
                b bVar3 = al0Var.f23439f0;
                if (al0Var.f23446n) {
                    AndroidUtilities.cancelRunOnUIThread(bVar3);
                    AndroidUtilities.runOnUIThread(bVar3, 4000L);
                    return;
                }
                al0Var.R = false;
                al0Var.invalidate();
                return;
        }
    }

    public b(xf xfVar) {
        this.f13697a = 1;
        ib ibVar = ib.UNKNOWN_EVENT;
        this.f13698b = xfVar;
    }

    public b(i iVar, int i10) {
        this.f13697a = 5;
        this.f13698b = iVar;
    }
}
