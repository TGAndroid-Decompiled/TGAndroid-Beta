package defpackage;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class ta5 extends FrameLayout implements jm7, VoIPService.StateListener {
    public float E;
    public final int F;
    public final s09 G;
    public final p09 H;
    public boolean I;
    public final sa5[] J;
    public boolean K;
    public float L;
    public float M;
    public final OvershootInterpolator N;
    public float O;
    public final Paint a;
    public final fl0 b;
    public final fl0 c;
    public float d;
    public float e;
    public float f;
    public sa5 h;
    public sa5 n;
    public float r;
    public boolean s;
    public float w;
    public final LinearGradient x;
    public final Matrix y;

    public ta5(Context context, int i) {
        super(context);
        this.a = new Paint(1);
        this.b = new fl0(8);
        this.c = new fl0(9);
        this.r = 1.0f;
        this.y = new Matrix();
        this.E = 0.0f;
        this.J = new sa5[4];
        this.N = new OvershootInterpolator();
        this.F = i;
        for (int i2 = 0; i2 < 4; i2++) {
            this.J[i2] = new sa5(i2);
        }
        this.b.b = gm.L(37.0f);
        this.b.a = gm.L(32.0f);
        this.c.b = gm.L(37.0f);
        this.c.a = gm.L(32.0f);
        this.b.b();
        this.c.b();
        p09 p09Var = new p09(2131624329, gm.L(22.0f), gm.L(30.0f), true, null);
        this.H = p09Var;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.G = imageView;
        imageView.setAnimation(p09Var);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        this.x = new LinearGradient(0.0f, 0.0f, gm.L(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.e = min;
        this.f = (min - this.d) / 265.0f;
    }

    public final void a() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            int callState = sharedInstance.getCallState();
            if (callState != 1 && callState != 2 && callState != 6 && callState != 5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !sd2.w(14, sharedInstance.getChat())) {
                    if (!sharedInstance.isMicMute()) {
                        sharedInstance.setMicMute(true, false, false);
                    }
                    setState(3);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    if (getParent() != null) {
                        ((View) getParent()).dispatchTouchEvent(obtain);
                        return;
                    }
                    return;
                }
                setState(sharedInstance.isMicMute() ? 1 : 0);
                return;
            }
            setState(2);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.R4) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i == nm7.w2) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z;
        int i;
        super.onAttachedToWindow();
        setAmplitude(0.0d);
        nm7.e().b(this, nm7.R4);
        nm7.f(this.F).b(this, nm7.w2);
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z = true;
        } else {
            z = false;
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        if (z) {
            i = 13;
        } else {
            i = 24;
        }
        p09 p09Var = this.H;
        p09Var.K(i);
        p09Var.I(p09Var.f - 1, false, true);
        a();
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z;
        int i;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 13;
        } else {
            i = 24;
        }
        p09 p09Var = this.H;
        if (p09Var.K(i)) {
            if (z) {
                p09Var.H(0);
            } else {
                p09Var.H(12);
            }
        }
        this.G.d();
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.R4);
        nm7.f(this.F).n(this, nm7.w2);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        oa5 oa5Var = oa5.f0;
        if (oa5Var != null) {
            if (oa5Var.y) {
                i = 2131754901;
            } else {
                i = 2131754815;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, jb6.M0(i, null)));
        }
    }

    @Override
    public final void onStateChanged(int i) {
        a();
    }

    public void setPinnedProgress(float f) {
        this.M = f;
    }

    public void setPressedState(boolean z) {
        this.K = z;
    }

    public void setRemoveAngle(double d) {
        this.O = (float) d;
    }

    public void setState(int i) {
        String M0;
        sa5 sa5Var = this.h;
        if (sa5Var != null && sa5Var.i == i) {
            return;
        }
        this.n = sa5Var;
        sa5 sa5Var2 = this.J[i];
        this.h = sa5Var2;
        float f = 0.0f;
        if (sa5Var != null) {
            this.r = 0.0f;
        } else {
            this.r = 1.0f;
            int i2 = sa5Var2.i;
            if (i2 != 3 && i2 != 2) {
                f = 1.0f;
            }
            this.E = f;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sd2.W(sharedInstance.getChat())) {
            M0 = jb6.M0(2131743131, null);
        } else {
            M0 = jb6.M0(2131742990, null);
        }
        if (i == 0) {
            StringBuilder k = b10.k(M0, ", ");
            k.append(jb6.M0(2131742917, null));
            M0 = k.toString();
        } else if (i == 2) {
            StringBuilder k2 = b10.k(M0, ", ");
            k2.append(jb6.M0(2131751746, null));
            M0 = k2.toString();
        } else if (i == 3) {
            StringBuilder k3 = b10.k(M0, ", ");
            k3.append(jb6.M0(2131742976, null));
            M0 = k3.toString();
        }
        setContentDescription(M0);
        invalidate();
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
    }

    @Override
    public final void onCameraSwitch(boolean z) {
    }

    @Override
    public final void onScreenOnChange(boolean z) {
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
    }
}
