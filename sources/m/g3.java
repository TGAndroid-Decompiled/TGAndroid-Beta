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
import org.telegram.messenger.wh;
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
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cn;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.so;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ux;
import org.telegram.ui.wi;
import org.telegram.ui.wn;
public final class g3 implements Runnable {
    public final int f17723a;
    public final Object f17724b;

    public g3(Object obj, int i10) {
        this.f17723a = i10;
        this.f17724b = obj;
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
        int i10 = this.f17723a;
        Object obj = this.f17724b;
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
                eVar.f18457f.animate().setDuration(120L).alpha(0.0f);
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
                if (zVar.f25774b == null) {
                    zVar.f25774b = new androidx.emoji2.text.j(zVar, 3);
                }
                androidx.emoji2.text.j jVar = zVar.f25774b;
                int i11 = zVar.f25775c + 1;
                zVar.f25775c = i11;
                jVar.f2552b = i11;
                zVar.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 4:
                z5 z5Var = (z5) obj;
                TextView textView = z5Var.f25791b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                z5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(z5Var.f25790a, property, 1.0f));
                z5Var.d.setDuration(250L);
                z5Var.d.setInterpolator(new DecelerateInterpolator());
                z5Var.d.addListener(new kg.e(this, 16));
                z5Var.d.start();
                return;
            case 5:
                x6 x6Var = (x6) obj;
                x6Var.a();
                RectF rectF = x6Var.f25716r;
                x6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(x6Var.f25720y, 1000L);
                return;
            case 6:
                r7 r7Var = (r7) obj;
                if (r7Var.f24978b == null) {
                    r7Var.f24978b = new androidx.emoji2.text.j(r7Var, 4);
                }
                androidx.emoji2.text.j jVar2 = r7Var.f24978b;
                int i12 = r7Var.f24980c + 1;
                r7Var.f24980c = i12;
                jVar2.f2552b = i12;
                r7Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 7:
                z7 z7Var = (z7) obj;
                RectF rectF2 = z7Var.f25807s;
                z7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(z7Var.F, 1000L);
                return;
            case 8:
                v7 v7Var = (v7) obj;
                m8 m8Var = v7Var.f33579y;
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
                edVar.f27826f.performHapticFeedback(0);
                Runnable runnable = edVar.f27829j;
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
                    int computeVerticalScrollOffset = cnVar.f27210r.computeVerticalScrollOffset();
                    if (cnVar.f27210r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (bnVar.e() - bnVar.f26861r) + bnVar.f26860n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (cnVar.E - Math.max(0, computeVerticalScrollOffset - cnVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((cnVar.f27210r.getMeasuredHeight() - (cnVar.E - computeVerticalScrollOffset)) - cnVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > cnVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i15 = (int) f10;
                    if (Math.abs(i15) > 0 && cnVar.f27210r.canScrollVertically(i15) && (f10 <= 0.0f || !z10)) {
                        cnVar.E += f10;
                        cnVar.f27210r.scrollBy(0, i15);
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
                h6 h6Var = goVar.f28674g1;
                if (h6Var != null) {
                    EditTextBoldCursor editField = h6Var.getEditField();
                    if (!goVar.H && editField != null && goVar.G && !goVar.f28670e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                mu muVar = ruVar.f32365a;
                if (!ruVar.f32374y && muVar != null && ruVar.N && !ruVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                if (szVar.B0.f31970s == null) {
                    szVar.X1 = false;
                    szVar.Z();
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
                    float f13 = s00Var.f32435p0 + (((float) elapsedRealtime) / 320.0f);
                    s00Var.f32435p0 = f13;
                    s00Var.setAnimationIdicatorProgress(s00Var.f32428i0.getInterpolation(f13));
                    if (s00Var.f32435p0 > 1.0f) {
                        s00Var.f32435p0 = 1.0f;
                    }
                    if (s00Var.f32435p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(s00Var.f32443v0);
                        return;
                    }
                    s00Var.O = false;
                    s00Var.setEnabled(true);
                    n00 n00Var = s00Var.J;
                    if (n00Var != null) {
                        ((ux) n00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f26177t0, 1000L);
                return;
            case 19:
                TextureView textureView = ((h60) obj).H0.f31494p0;
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
                n70 n70Var = (n70) obj;
                o70 o70Var = n70Var.f30763y;
                b70 b70Var = o70Var.V;
                if (b70Var != null && b70Var.getAdapter() != null) {
                    o70Var.V.getClass();
                    int R = RecyclerView.R(n70Var);
                    if (R >= 0) {
                        o70Var.T.v(o70Var.V.T(n70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 21:
                oc0 oc0Var = (oc0) obj;
                ValueAnimator valueAnimator = oc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    oc0Var.h.start();
                    return;
                }
                return;
            case 22:
                ((me0) obj).e();
                return;
            case 23:
                ij0 ij0Var = (ij0) obj;
                ij0Var.f29370y = true;
                ValueAnimator valueAnimator2 = ij0Var.f29371z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ij0Var.f29369x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ij0Var.f29371z = ofFloat;
                ofFloat.addUpdateListener(ij0Var.f29348b0);
                ij0Var.f29371z.setInterpolator(new LinearInterpolator());
                ij0Var.f29371z.setDuration(150L);
                ij0Var.f29371z.start();
                return;
            case 24:
                nm0 nm0Var = (nm0) obj;
                wi wiVar = nm0Var.f30973f2;
                int[] iArr = nm0Var.f30983k2;
                wn wnVar = wiVar.d;
                iArr[0] = (int) wnVar.I9;
                iArr[1] = wnVar.Ra;
                if (nm0Var.f30977h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    nm0Var.M0(0.0f, nm0Var.f30983k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    nm0Var.M0(0.0f, nm0Var.getMeasuredHeight() - nm0Var.f30983k2[1]);
                }
                nm0Var.f30973f2.d.f45339x0.scrollBy(0, dp);
                if (nm0Var.f30975g2) {
                    AndroidUtilities.runOnUIThread(nm0Var.C2);
                    return;
                }
                return;
            case 25:
                tl0 tl0Var = (tl0) obj;
                g3 g3Var3 = tl0Var.f33092i0;
                if (tl0Var.f33096n) {
                    AndroidUtilities.cancelRunOnUIThread(g3Var3);
                    AndroidUtilities.runOnUIThread(g3Var3, 4000L);
                    return;
                }
                tl0Var.U = false;
                tl0Var.invalidate();
                return;
            case 26:
                rm0 rm0Var = (rm0) obj;
                RecyclerView recyclerView = rm0Var.f32280a;
                if (recyclerView != null) {
                    if (rm0Var.f32284g) {
                        recyclerView.scrollBy(0, -rm0Var.f32285i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (rm0Var.h) {
                        recyclerView.scrollBy(0, rm0Var.f32285i);
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
                    float f14 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f26289b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f26292d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    tn0 tn0Var = scrollSlidingTextTabStrip.f26288b;
                    if (tn0Var != null) {
                        tn0Var.z0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ShutterButton shutterButton = (ShutterButton) obj;
                gw0 gw0Var = shutterButton.e;
                if (gw0Var != null) {
                    final dm dmVar = (dm) gw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = dmVar.e;
                    ti tiVar = chatAttachAlertPhotoLayout.f30254b;
                    nm nmVar = chatAttachAlertPhotoLayout.R;
                    int i16 = tiVar.T0;
                    org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
                    if ((i16 == 2 || (r2Var instanceof wn)) && !chatAttachAlertPhotoLayout.f26057s0 && !tiVar.V && chatAttachAlertPhotoLayout.P != null && !tiVar.G) {
                        if (r2Var == null) {
                            r2Var = LaunchActivity.R();
                        }
                        if (r2Var != null && r2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f26062w0) {
                                wh.n(R.string.GlobalAttachVideoRestricted, new wc(chatAttachAlertPhotoLayout.P, dmVar.f27485c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                r2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i17 = 0; i17 < 2; i17++) {
                                    chatAttachAlertPhotoLayout.S[i17].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(ds.f27530f).start();
                                }
                                ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.f26055r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                ds dsVar = ds.f27530f;
                                duration2.setInterpolator(dsVar).start();
                                chatAttachAlertPhotoLayout.f26053q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                                org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f32990f0;
                                if ((r2Var2 instanceof wn) && ((wn) r2Var2).w()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                dmVar.f27483a = AndroidUtilities.generateVideoPath(z11);
                                AndroidUtilities.updateViewVisibilityAnimated(nmVar, true);
                                nmVar.setText(AndroidUtilities.formatLongDuration(0));
                                chatAttachAlertPhotoLayout.f26034g0 = 0;
                                chatAttachAlertPhotoLayout.f26036h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = dmVar.e;
                                                if (chatAttachAlertPhotoLayout2.f26036h0 != null) {
                                                    int i18 = chatAttachAlertPhotoLayout2.f26034g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f26034g0 = i18;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i18));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f26036h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(dmVar.e.f26036h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                AndroidUtilities.lockOrientation(r2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = dmVar.f27483a;
                                if (tiVar.T0 != 0) {
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
                                                if (chatAttachAlertPhotoLayout2.f26036h0 != null) {
                                                    int i18 = chatAttachAlertPhotoLayout2.f26034g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f26034g0 = i18;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i18));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f26036h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(dmVar.e.f26036h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f26042k0.a(hw0.f29087b);
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
        this.f17723a = 2;
        this.f17724b = iVar;
    }
}
