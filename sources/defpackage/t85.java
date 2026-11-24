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
public final class t85 extends FrameLayout implements gk7, VoIPService.StateListener {
    public float E;
    public final int F;
    public final ry8 G;
    public final oy8 H;
    public boolean I;
    public final s85[] J;
    public boolean K;
    public float L;
    public float M;
    public final OvershootInterpolator N;
    public float O;
    public final Paint a;
    public final fk0 b;
    public final fk0 c;
    public float d;
    public float e;
    public float f;
    public s85 h;
    public s85 n;
    public float r;
    public boolean s;
    public float w;
    public final LinearGradient x;
    public final Matrix y;

    public t85(Context context, int i) {
        super(context);
        this.a = new Paint(1);
        this.b = new fk0(8);
        this.c = new fk0(9);
        this.r = 1.0f;
        this.y = new Matrix();
        this.E = 0.0f;
        this.J = new s85[4];
        this.N = new OvershootInterpolator();
        this.F = i;
        for (int i2 = 0; i2 < 4; i2++) {
            this.J[i2] = new s85(i2);
        }
        this.b.b = gl.L(37.0f);
        this.b.a = gl.L(32.0f);
        this.c.b = gl.L(37.0f);
        this.c.a = gl.L(32.0f);
        this.b.b();
        this.c.b();
        oy8 oy8Var = new oy8(2131624329, gl.L(22.0f), gl.L(30.0f), true, null);
        this.H = oy8Var;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.G = imageView;
        imageView.setAnimation(oy8Var);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        this.x = new LinearGradient(0.0f, 0.0f, gl.L(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
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
                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, sharedInstance.getChat())) {
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
        if (i == kk7.P4) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i == kk7.v2) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z;
        int i;
        super.onAttachedToWindow();
        setAmplitude(0.0d);
        kk7.e().b(this, kk7.P4);
        kk7.f(this.F).b(this, kk7.v2);
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
        oy8 oy8Var = this.H;
        oy8Var.K(i);
        oy8Var.I(oy8Var.f - 1, false, true);
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
        oy8 oy8Var = this.H;
        if (oy8Var.K(i)) {
            if (z) {
                oy8Var.H(0);
            } else {
                oy8Var.H(12);
            }
        }
        this.G.d();
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.P4);
        kk7.f(this.F).n(this, kk7.v2);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t85.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        o85 o85Var = o85.f0;
        if (o85Var != null) {
            if (o85Var.y) {
                i = 2131754901;
            } else {
                i = 2131754815;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, k96.M0(i, null)));
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
        s85 s85Var = this.h;
        if (s85Var != null && s85Var.i == i) {
            return;
        }
        this.n = s85Var;
        s85 s85Var2 = this.J[i];
        this.h = s85Var2;
        float f = 0.0f;
        if (s85Var != null) {
            this.r = 0.0f;
        } else {
            this.r = 1.0f;
            int i2 = s85Var2.i;
            if (i2 != 3 && i2 != 2) {
                f = 1.0f;
            }
            this.E = f;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && hc2.W(sharedInstance.getChat())) {
            M0 = k96.M0(2131743205, null);
        } else {
            M0 = k96.M0(2131743064, null);
        }
        if (i == 0) {
            StringBuilder k = b00.k(M0, ", ");
            k.append(k96.M0(2131742991, null));
            M0 = k.toString();
        } else if (i == 2) {
            StringBuilder k2 = b00.k(M0, ", ");
            k2.append(k96.M0(2131751797, null));
            M0 = k2.toString();
        } else if (i == 3) {
            StringBuilder k3 = b00.k(M0, ", ");
            k3.append(k96.M0(2131743050, null));
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
