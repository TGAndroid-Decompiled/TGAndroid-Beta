package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.webrtc.RendererCommon;
public final class oa1 extends ViewGroup {
    public final na1 E;
    public final FrameLayout a;
    public final akc b;
    public final int c;
    public final int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public float n;
    public volatile long r;
    public volatile int s;
    public volatile int w;
    public volatile boolean x;
    public final ma1 y;

    public oa1(LaunchActivity launchActivity) {
        super(launchActivity);
        this.c = gm.L(6.0f);
        this.d = gm.L(6.0f);
        this.h = true;
        this.y = new ma1(this, (byte) 0);
        this.E = new na1(this, (byte) 0);
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.a = frameLayout;
        frameLayout.setBackgroundColor(-14999773);
        frameLayout.setOutlineProvider(new cm0(this, (byte) 2));
        frameLayout.setClipToOutline(true);
        frameLayout.setElevation(gm.L(2.0f));
        akc akcVar = new akc(launchActivity, false, true, false, false);
        this.b = akcVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        zjc zjcVar = akcVar.d;
        zjcVar.setScalingType(scalingType);
        zjcVar.setEnableHardwareScaler(true);
        zjcVar.setMirror(true);
        akcVar.b0 = (byte) 0;
        View view = akcVar.h;
        if (view != null) {
            view.setVisibility(8);
        }
        frameLayout.addView(akcVar);
        frameLayout.setAlpha(0.0f);
        frameLayout.setScaleX(0.6f);
        frameLayout.setScaleY(0.6f);
        frameLayout.setVisibility(4);
        addView(frameLayout);
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.addExtraLocalSink(this.E);
        }
        c();
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        this.e = false;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.removeExtraLocalSink(this.E);
        }
        gm.r(this.y);
        this.x = false;
        this.b.d.release();
    }

    public final void c() {
        boolean z;
        boolean z2;
        float f;
        boolean z3;
        if (this.e) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && sharedInstance.getVideoState(false) == 2 && !sharedInstance.isScreencast()) {
                z = true;
            } else {
                z = false;
            }
            if (SystemClock.elapsedRealtime() - this.r < 1000) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (sharedInstance != null && this.h != sharedInstance.isFrontFaceCamera()) {
                boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
                this.h = isFrontFaceCamera;
                this.b.d.setMirror(isFrontFaceCamera);
            }
            int i = this.s;
            int i2 = this.w;
            if (i > 0 && i2 > 0) {
                f = i / i2;
            } else {
                f = 0.0f;
            }
            if (f > 0.0f && Math.abs(f - this.n) > 0.01f) {
                this.n = f;
                requestLayout();
            }
            if (z && z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            FrameLayout frameLayout = this.a;
            if (this.f == z3) {
                return;
            }
            this.f = z3;
            frameLayout.animate().cancel();
            if (z3) {
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(220L).setInterpolator(d53.h).withEndAction(null).start();
                return;
            }
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setDuration(180L).setInterpolator(d53.g).withEndAction(new ma1(this, (byte) 1)).start();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.c;
        int i6 = (i3 - i) - i5;
        FrameLayout frameLayout = this.a;
        frameLayout.layout(i6 - frameLayout.getMeasuredWidth(), i5, i6, frameLayout.getMeasuredHeight() + i5);
        frameLayout.setPivotX(frameLayout.getMeasuredWidth());
        frameLayout.setPivotY(0.0f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        float f3 = this.n;
        if (f3 <= 0.0f) {
            f3 = 0.75f;
        }
        float sqrt = (float) Math.sqrt(((0.1f * f) * f2) / f3);
        float f4 = f3 * sqrt;
        float min = Math.min(1.0f, Math.min((size * 0.42f) / Math.max(1.0f, f4), (size2 * 0.42f) / Math.max(1.0f, sqrt)));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round(f4 * min)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round(sqrt * min)), 1073741824));
    }
}
