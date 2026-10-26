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
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.vh;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cn;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.so;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rx;
import org.telegram.ui.ti;
import org.telegram.ui.un;
public final class g3 implements Runnable {
    public final int f17724a;
    public final Object f17725b;

    public g3(Object obj, int i10) {
        this.f17724a = i10;
        this.f17725b = obj;
    }

    @Override
    public final void run() {
        h hVar;
        long j10;
        float f7;
        boolean z10;
        float f10;
        int dp;
        boolean z11;
        boolean z12;
        int i10 = this.f17724a;
        Object obj = this.f17725b;
        switch (i10) {
            case 0:
                ActionMenuView actionMenuView = ((Toolbar) obj).f2240a;
                if (actionMenuView != null && (hVar = actionMenuView.J) != null) {
                    hVar.l();
                    return;
                }
                return;
            case 1:
                mg.e eVar = (mg.e) obj;
                eVar.f18458f.animate().setDuration(120L).alpha(0.0f);
                eVar.h.animate().setListener(null).start();
                if (eVar.h.getVisibility() != 0) {
                    eVar.h.setVisibility(0);
                    eVar.h.setAlpha(0.0f);
                }
                eVar.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 2:
                Object obj2 = ((b6.i) obj).f3670b;
                return;
            case 3:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) obj;
                if (zVar.f25772b == null) {
                    zVar.f25772b = new androidx.emoji2.text.j(zVar, 3);
                }
                androidx.emoji2.text.j jVar = zVar.f25772b;
                int i11 = zVar.f25773c + 1;
                zVar.f25773c = i11;
                jVar.f2552b = i11;
                zVar.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 4:
                z5 z5Var = (z5) obj;
                TextView textView = z5Var.f25789b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                z5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(z5Var.f25788a, property, 1.0f));
                z5Var.d.setDuration(250L);
                z5Var.d.setInterpolator(new DecelerateInterpolator());
                z5Var.d.addListener(new kg.e(this, 16));
                z5Var.d.start();
                return;
            case 5:
                x6 x6Var = (x6) obj;
                x6Var.a();
                RectF rectF = x6Var.f25714r;
                x6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(x6Var.f25718y, 1000L);
                return;
            case 6:
                r7 r7Var = (r7) obj;
                if (r7Var.f24976b == null) {
                    r7Var.f24976b = new androidx.emoji2.text.j(r7Var, 4);
                }
                androidx.emoji2.text.j jVar2 = r7Var.f24976b;
                int i12 = r7Var.f24978c + 1;
                r7Var.f24978c = i12;
                jVar2.f2552b = i12;
                r7Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 7:
                z7 z7Var = (z7) obj;
                RectF rectF2 = z7Var.f25805s;
                z7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(z7Var.F, 1000L);
                return;
            case 8:
                v7 v7Var = (v7) obj;
                m8 m8Var = v7Var.f33591y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i13 = m8Var.I0 + 1;
                    m8Var.I0 = i13;
                    if (i13 == 1) {
                        v7Var.v = true;
                        m8Var.G0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            m8Var.J0();
                        } else if (m8Var.G0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(m8Var.N0);
                            m8Var.K0 = 0L;
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
            case 9:
                m8 m8Var2 = (m8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f11 = m8Var2.H0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - m8Var2.J0;
                    m8Var2.J0 = currentTimeMillis;
                    long j12 = currentTimeMillis - m8Var2.K0;
                    int i14 = m8Var2.I0;
                    if (i14 == 1) {
                        j10 = 3;
                    } else if (i14 == 2) {
                        j10 = 6;
                    } else {
                        j10 = 12;
                    }
                    float f12 = ((f11 * f7) + ((float) ((j10 * j11) - j11))) / ((float) duration);
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    m8Var2.H0 = f12;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = m8Var2.H0;
                        }
                        m8Var2.M0(playingMessageObject, false);
                    }
                    if (m8Var2.G0 == 1 && m8Var2.I0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j12 > 200 || m8Var2.H0 == 0.0f) {
                            m8Var2.K0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f12);
                        }
                        if (m8Var2.I0 > 0 && m8Var2.H0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(m8Var2.N0, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                m8Var2.J0 = System.currentTimeMillis();
                return;
            case 10:
                ed edVar = (ed) obj;
                edVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                edVar.f27805f.performHapticFeedback(0);
                Runnable runnable = edVar.f27808j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 11:
                mk mkVar = (mk) obj;
                if (mkVar.S) {
                    mkVar.N.clear();
                    mkVar.P.clear();
                    mkVar.Q.clear();
                    mkVar.l();
                    return;
                }
                return;
            case 12:
                bn bnVar = (bn) obj;
                cn cnVar = bnVar.P;
                if (cnVar.J != null && !cnVar.K) {
                    int computeVerticalScrollOffset = cnVar.f27201r.computeVerticalScrollOffset();
                    if (cnVar.f27201r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (bnVar.e() - bnVar.f26911r) + bnVar.f26910n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (cnVar.E - Math.max(0, computeVerticalScrollOffset - cnVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((cnVar.f27201r.getMeasuredHeight() - (cnVar.E - computeVerticalScrollOffset)) - cnVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > cnVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i15 = (int) f10;
                    if (Math.abs(i15) > 0 && cnVar.f27201r.canScrollVertically(i15) && (f10 <= 0.0f || !z10)) {
                        cnVar.E += f10;
                        cnVar.f27201r.scrollBy(0, i15);
                        bnVar.invalidate();
                    }
                    bnVar.L = true;
                    bnVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 13:
                go goVar = (go) obj;
                g3 g3Var = goVar.U0;
                h6 h6Var = goVar.f28627g1;
                if (h6Var != null) {
                    EditTextBoldCursor editField = h6Var.getEditField();
                    if (!goVar.H && editField != null && goVar.G && !goVar.f28623e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(g3Var);
                        AndroidUtilities.runOnUIThread(g3Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ru ruVar = (ru) obj;
                g3 g3Var2 = ruVar.P;
                mu muVar = ruVar.f32325a;
                if (!ruVar.f32334y && muVar != null && ruVar.N && !ruVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    muVar.requestFocus();
                    AndroidUtilities.showKeyboard(muVar);
                    AndroidUtilities.cancelRunOnUIThread(g3Var2);
                    AndroidUtilities.runOnUIThread(g3Var2, 100L);
                    return;
                }
                return;
            case 15:
                c2.b bVar = (c2.b) ((di.o3) obj).d;
                if (bVar.f5929a && !((ArrayList) bVar.d).isEmpty() && !((AnimatorSet) bVar.f5931c).isRunning()) {
                    try {
                        ((AnimatorSet) bVar.f5931c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 16:
                sz szVar = (sz) obj;
                if (szVar.B0.f31634s == null) {
                    szVar.X1 = false;
                    szVar.Y();
                    return;
                }
                return;
            case 17:
                s00 s00Var = (s00) obj;
                if (s00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f13 = s00Var.f32380p0 + (((float) elapsedRealtime) / 320.0f);
                    s00Var.f32380p0 = f13;
                    s00Var.setAnimationIdicatorProgress(s00Var.f32373i0.getInterpolation(f13));
                    if (s00Var.f32380p0 > 1.0f) {
                        s00Var.f32380p0 = 1.0f;
                    }
                    if (s00Var.f32380p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(s00Var.f32388v0);
                        return;
                    }
                    s00Var.O = false;
                    s00Var.setEnabled(true);
                    n00 n00Var = s00Var.J;
                    if (n00Var != null) {
                        ((rx) n00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f26175t0, 1000L);
                return;
            case 19:
                TextureView textureView = ((h60) obj).H0.f31196q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new so(25, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 20:
                m70 m70Var = (m70) obj;
                n70 n70Var = m70Var.f30418y;
                a70 a70Var = n70Var.V;
                if (a70Var != null && a70Var.getAdapter() != null) {
                    n70Var.V.getClass();
                    int R = RecyclerView.R(m70Var);
                    if (R >= 0) {
                        n70Var.T.v(n70Var.V.T(m70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 21:
                nc0 nc0Var = (nc0) obj;
                ValueAnimator valueAnimator = nc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    nc0Var.h.start();
                    return;
                }
                return;
            case 22:
                ((le0) obj).e();
                return;
            case 23:
                hj0 hj0Var = (hj0) obj;
                hj0Var.f29000y = true;
                ValueAnimator valueAnimator2 = hj0Var.f29001z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                hj0Var.f28999x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                hj0Var.f29001z = ofFloat;
                ofFloat.addUpdateListener(hj0Var.f28978b0);
                hj0Var.f29001z.setInterpolator(new LinearInterpolator());
                hj0Var.f29001z.setDuration(150L);
                hj0Var.f29001z.start();
                return;
            case 24:
                mm0 mm0Var = (mm0) obj;
                ti tiVar = mm0Var.f30631f2;
                int[] iArr = mm0Var.f30641k2;
                un unVar = tiVar.d;
                iArr[0] = (int) unVar.E9;
                iArr[1] = unVar.Na;
                if (mm0Var.f30635h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    mm0Var.M0(0.0f, mm0Var.f30641k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    mm0Var.M0(0.0f, mm0Var.getMeasuredHeight() - mm0Var.f30641k2[1]);
                }
                mm0Var.f30631f2.d.f44471x0.scrollBy(0, dp);
                if (mm0Var.f30633g2) {
                    AndroidUtilities.runOnUIThread(mm0Var.C2);
                    return;
                }
                return;
            case 25:
                sl0 sl0Var = (sl0) obj;
                g3 g3Var3 = sl0Var.f32636i0;
                if (sl0Var.f32640n) {
                    AndroidUtilities.cancelRunOnUIThread(g3Var3);
                    AndroidUtilities.runOnUIThread(g3Var3, 4000L);
                    return;
                }
                sl0Var.U = false;
                sl0Var.invalidate();
                return;
            case 26:
                qm0 qm0Var = (qm0) obj;
                RecyclerView recyclerView = qm0Var.f31960a;
                if (recyclerView != null) {
                    if (qm0Var.f31964g) {
                        recyclerView.scrollBy(0, -qm0Var.f31965i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (qm0Var.h) {
                        recyclerView.scrollBy(0, qm0Var.f31965i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 27:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f14 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f26287b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f26290d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    sn0 sn0Var = scrollSlidingTextTabStrip.f26286b;
                    if (sn0Var != null) {
                        sn0Var.z0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ShutterButton shutterButton = (ShutterButton) obj;
                fw0 fw0Var = shutterButton.e;
                if (fw0Var != null) {
                    final dm dmVar = (dm) fw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = dmVar.e;
                    org.telegram.ui.Components.ti tiVar2 = chatAttachAlertPhotoLayout.f30215b;
                    nm nmVar = chatAttachAlertPhotoLayout.R;
                    int i16 = tiVar2.T0;
                    org.telegram.ui.ActionBar.r2 r2Var = tiVar2.f33021f0;
                    if ((i16 == 2 || (r2Var instanceof un)) && !chatAttachAlertPhotoLayout.f26055s0 && !tiVar2.V && chatAttachAlertPhotoLayout.P != null && !tiVar2.G) {
                        if (r2Var == null) {
                            r2Var = LaunchActivity.R();
                        }
                        if (r2Var != null && r2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f26060w0) {
                                vh.n(R.string.GlobalAttachVideoRestricted, new wc(chatAttachAlertPhotoLayout.P, dmVar.f27562c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                r2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i17 = 0; i17 < 2; i17++) {
                                    chatAttachAlertPhotoLayout.S[i17].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(ds.f27586f).start();
                                }
                                ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.f26053r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                ds dsVar = ds.f27586f;
                                duration2.setInterpolator(dsVar).start();
                                chatAttachAlertPhotoLayout.f26051q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                                org.telegram.ui.ActionBar.r2 r2Var2 = tiVar2.f33021f0;
                                if ((r2Var2 instanceof un) && ((un) r2Var2).w()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                dmVar.f27560a = AndroidUtilities.generateVideoPath(z11);
                                AndroidUtilities.updateViewVisibilityAnimated(nmVar, true);
                                nmVar.setText(AndroidUtilities.formatLongDuration(0));
                                chatAttachAlertPhotoLayout.f26032g0 = 0;
                                chatAttachAlertPhotoLayout.f26034h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = dmVar.e;
                                                if (chatAttachAlertPhotoLayout2.f26034h0 != null) {
                                                    int i18 = chatAttachAlertPhotoLayout2.f26032g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f26032g0 = i18;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i18));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f26034h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(dmVar.e.f26034h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                AndroidUtilities.lockOrientation(r2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = dmVar.f27560a;
                                if (tiVar2.T0 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z12, new org.telegram.ui.Components.s(dmVar, 21), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = dmVar.e;
                                                if (chatAttachAlertPhotoLayout2.f26034h0 != null) {
                                                    int i18 = chatAttachAlertPhotoLayout2.f26032g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f26032g0 = i18;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i18));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f26034h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(dmVar.e.f26034h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f26040k0.a(gw0.f28734b);
                                chatAttachAlertPhotoLayout.P.runHaptic();
                                return;
                            }
                        }
                    }
                    shutterButton.v = false;
                    return;
                }
                return;
            default:
                System.currentTimeMillis();
                throw null;
        }
    }

    public g3(b6.i iVar, int i10) {
        this.f17724a = 2;
        this.f17725b = iVar;
    }
}
