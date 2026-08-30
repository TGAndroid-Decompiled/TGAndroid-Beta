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
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.s6;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m7;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yt;
import org.telegram.ui.mi;
import org.telegram.ui.ow;
import org.telegram.ui.s5;
import org.telegram.ui.xn;
public final class b implements Runnable {
    public final int f13713a;
    public final Object f13714b;

    public b(Object obj, int i10) {
        this.f13713a = i10;
        this.f13714b = obj;
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
        int i11 = this.f13713a;
        l7.e eVar2 = null;
        int i12 = 3;
        long j11 = 0;
        Object obj = this.f13714b;
        switch (i11) {
            case 0:
                h hVar = (h) obj;
                hVar.setScrollState(0);
                hVar.s();
                return;
            case 1:
                xf xfVar = (xf) obj;
                ib ibVar = ib.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap hashMap = xfVar.f14814j;
                mg mgVar = (mg) hashMap.get(ibVar);
                if (mgVar != null) {
                    mg mgVar2 = mgVar;
                    fd fdVar = mgVar2.f14652a;
                    if (fdVar == null) {
                        mg mgVar3 = mgVar2;
                        fd fdVar2 = new fd(mgVar3, mgVar3.f14666c);
                        mgVar2.f14652a = fdVar2;
                        fdVar = fdVar2;
                    }
                    Iterator it = fdVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj2 = (Collection) mgVar.f14666c.get(next);
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
                        obj3.f11464c = Long.valueOf((j12 / arrayList.size()) & Long.MAX_VALUE);
                        obj3.f11462a = Long.valueOf(xf.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        obj3.f11465f = Long.valueOf(xf.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        obj3.e = Long.valueOf(xf.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        obj3.d = Long.valueOf(xf.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        obj3.f11463b = Long.valueOf(xf.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(obj3);
                        int size2 = arrayList.size();
                        ?? obj5 = new Object();
                        obj5.f13643c = gb.TYPE_THIN;
                        w0 w0Var = new w0(8, false);
                        w0Var.f11677c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        w0Var.f11676b = (i1) next;
                        w0Var.d = maVar;
                        obj5.h = new j1(w0Var);
                        o.f2237a.execute(new p(xfVar, new e0((s3) obj5, 0), ibVar, xfVar.c(), false, 7));
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
                    i9Var.f15469i1 = false;
                    i9Var.P();
                    return;
                }
                return;
            case 3:
                ((y8) obj).I0 = false;
                return;
            case 4:
                s7 s7Var = (s7) obj;
                s7Var.f15892b = false;
                s7Var.invalidate();
                return;
            case 5:
                Object obj6 = ((i) obj).f16457b;
                return;
            case 6:
                a0 a0Var = (a0) obj;
                if (a0Var.f20812b == null) {
                    a0Var.f20812b = new j(a0Var, 2);
                }
                j jVar = a0Var.f20812b;
                int i14 = a0Var.f20813c + 1;
                a0Var.f20813c = i14;
                jVar.f764b = i14;
                a0Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 7:
                v5 v5Var = (v5) obj;
                TextView textView = v5Var.f22501b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                v5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(v5Var.f22500a, property, 1.0f));
                v5Var.d.setDuration(250L);
                v5Var.d.setInterpolator(new DecelerateInterpolator());
                v5Var.d.addListener(new s5(this, 8));
                v5Var.d.start();
                return;
            case 8:
                s6 s6Var = (s6) obj;
                s6Var.a();
                RectF rectF = s6Var.f21938f;
                s6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(s6Var.v, 1000L);
                return;
            case 9:
                l7 l7Var = (l7) obj;
                if (l7Var.f21345b == null) {
                    l7Var.f21345b = new j(l7Var, 3);
                }
                j jVar2 = l7Var.f21345b;
                int i15 = l7Var.f21347c + 1;
                l7Var.f21347c = i15;
                jVar2.f764b = i15;
                l7Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 10:
                u7 u7Var = (u7) obj;
                RectF rectF2 = u7Var.f22407n;
                u7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(u7Var.f22412y, 1000L);
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
                    if (!z9Var.Z && !z9Var.f22683k0) {
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
                    sl0 sl0Var = z9Var.E;
                    if (sl0Var != null) {
                        if (!z9Var.O) {
                            n10 = -n10;
                        }
                        sl0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            case 12:
                m7 m7Var = (m7) obj;
                c8 c8Var = m7Var.f26960y;
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
                xcVar.f30651f.performHapticFeedback(0);
                Runnable runnable = xcVar.f30654j;
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
                nm nmVar = (nm) obj;
                om omVar = nmVar.M;
                if (omVar.G != null && !omVar.H) {
                    int computeVerticalScrollOffset = omVar.f27591r.computeVerticalScrollOffset();
                    if (omVar.f27591r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (nmVar.e() - nmVar.f27319r) + nmVar.f27318n) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    float max = Math.max(0.0f, (omVar.B - Math.max(0, computeVerticalScrollOffset - omVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((omVar.f27591r.getMeasuredHeight() - (omVar.B - computeVerticalScrollOffset)) - omVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > omVar.getListTopPadding()) {
                        f11 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f11 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f11 = 0.0f;
                    }
                    int i18 = (int) f11;
                    if (Math.abs(i18) > 0 && omVar.f27591r.canScrollVertically(i18) && (f11 <= 0.0f || !z4)) {
                        omVar.B += f11;
                        omVar.f27591r.scrollBy(0, i18);
                        nmVar.invalidate();
                    }
                    nmVar.I = true;
                    nmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 17:
                qn qnVar = (qn) obj;
                b bVar = qnVar.R0;
                c6 c6Var = qnVar.f28167d1;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!qnVar.E && editField != null && qnVar.D && !qnVar.f28163b1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                du duVar = (du) obj;
                b bVar2 = duVar.M;
                yt ytVar = duVar.f24367a;
                if (!duVar.f24376y && ytVar != null && duVar.K && !duVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    ytVar.requestFocus();
                    AndroidUtilities.showKeyboard(ytVar);
                    AndroidUtilities.cancelRunOnUIThread(bVar2);
                    AndroidUtilities.runOnUIThread(bVar2, 100L);
                    return;
                }
                return;
            case 19:
                m mVar = (m) ((g3) obj).d;
                if (mVar.f2232a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f2234c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f2234c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 20:
                kz kzVar = (kz) obj;
                if (kzVar.f26488y0.f27955s == null) {
                    kzVar.U1 = false;
                    kzVar.a0();
                    return;
                }
                return;
            case 21:
                j00 j00Var = (j00) obj;
                if (j00Var.L) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f14 = j00Var.m0 + (((float) elapsedRealtime) / 320.0f);
                    j00Var.m0 = f14;
                    j00Var.setAnimationIdicatorProgress(j00Var.f25823f0.getInterpolation(f14));
                    if (j00Var.m0 > 1.0f) {
                        j00Var.m0 = 1.0f;
                    }
                    if (j00Var.m0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(j00Var.f25838s0);
                        return;
                    }
                    j00Var.L = false;
                    j00Var.setEnabled(true);
                    e00 e00Var = j00Var.G;
                    if (e00Var != null) {
                        ((ow) e00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.J0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f23042p0, 1000L);
                return;
            case 23:
                TextureView textureView = ((w50) obj).E0.f30558i0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new il(26, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 24:
                r60 r60Var = (r60) obj;
                s60 s60Var = r60Var.f28396x;
                f60 f60Var = s60Var.S;
                if (f60Var != null && f60Var.getAdapter() != null) {
                    s60Var.S.getClass();
                    int R = RecyclerView.R(r60Var);
                    if (R >= 0) {
                        s60Var.Q.v(s60Var.S.T(r60Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 25:
                wb0 wb0Var = (wb0) obj;
                ValueAnimator valueAnimator = wb0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    wb0Var.h.start();
                    return;
                }
                return;
            case 26:
                vd0 vd0Var = (vd0) obj;
                vd0Var.e();
                AndroidUtilities.runOnUIThread(vd0Var.O, 100L);
                return;
            case 27:
                pi0 pi0Var = (pi0) obj;
                pi0Var.f27866y = true;
                ValueAnimator valueAnimator2 = pi0Var.f27867z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                pi0Var.f27865x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                pi0Var.f27867z = ofFloat;
                ofFloat.addUpdateListener(pi0Var.f27844b0);
                pi0Var.f27867z.setInterpolator(new LinearInterpolator());
                pi0Var.f27867z.setDuration(150L);
                pi0Var.f27867z.start();
                return;
            case 28:
                sl0 sl0Var2 = (sl0) obj;
                mi miVar = sl0Var2.f28735e2;
                int[] iArr = sl0Var2.f28745j2;
                xn xnVar = miVar.d;
                iArr[0] = (int) xnVar.f40141p9;
                iArr[1] = xnVar.f40244xa;
                if (sl0Var2.f28739g2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    sl0Var2.L0(0.0f, sl0Var2.f28745j2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    sl0Var2.L0(0.0f, sl0Var2.getMeasuredHeight() - sl0Var2.f28745j2[1]);
                }
                sl0Var2.f28735e2.d.f40193u0.scrollBy(0, dp);
                if (sl0Var2.f28737f2) {
                    AndroidUtilities.runOnUIThread(sl0Var2.A2);
                    return;
                }
                return;
            default:
                bl0 bl0Var = (bl0) obj;
                b bVar3 = bl0Var.f23706f0;
                if (bl0Var.f23713n) {
                    AndroidUtilities.cancelRunOnUIThread(bVar3);
                    AndroidUtilities.runOnUIThread(bVar3, 4000L);
                    return;
                }
                bl0Var.R = false;
                bl0Var.invalidate();
                return;
        }
    }

    public b(xf xfVar) {
        this.f13713a = 1;
        ib ibVar = ib.UNKNOWN_EVENT;
        this.f13714b = xfVar;
    }

    public b(i iVar, int i10) {
        this.f13713a = 5;
        this.f13714b = iVar;
    }
}
