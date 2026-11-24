package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.OrientationHelper;
public abstract class ekc extends FrameLayout {
    public Activity a;
    public boolean b;
    public po c;
    public VelocityTracker d;
    public boolean e;
    public boolean f;
    public float h;
    public float n;
    public boolean r;

    public static WindowManager.LayoutParams a() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.format = -2;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.screenOrientation = 1;
        gm.m(layoutParams);
        layoutParams.flags = -2144665216;
        return layoutParams;
    }

    public final void b() {
        c(330L);
    }

    public final void c(long j) {
        if (!this.f) {
            this.f = true;
            if (iic.m1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = iic.m1.u0.getMeasuredHeight();
                    if (iic.m1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        iic iicVar = iic.m1;
                        yic.f(iicVar.b, iicVar.a, iicVar.u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = iic.m1.r0;
                        if (windowInsets != null) {
                            yic.W = windowInsets.getSystemWindowInsetTop();
                            iic.m1.r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                iic.m1.d0.d.release();
                iic.m1.e0.d.release();
                iic.m1.c0.release();
                iic.m1.b();
            }
            iic.m1 = null;
            zic.b();
            if (this.b) {
                try {
                    ((WindowManager) this.a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.c.d();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new q7b(this, (byte) 24)).setDuration(j).setInterpolator(d53.f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            gm.K3(this.a);
            setVisibility(8);
            ((WindowManager) this.a.getSystemService("window")).removeView(this);
            OrientationHelper.cameraRotationDisabled = false;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.e) {
            this.e = true;
            if (!this.b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(d53.f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.n = motionEvent.getY();
                VelocityTracker velocityTracker = this.d;
                if (velocityTracker == null) {
                    velocityTracker = VelocityTracker.obtain();
                    this.d = velocityTracker;
                }
                velocityTracker.clear();
                return false;
            }
            float f = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x = motionEvent.getX() - this.h;
                float y = motionEvent.getY() - this.n;
                if (!this.r && Math.abs(y) > gm.Z0(true, 0.4f) && Math.abs(y) / 3.0f > x) {
                    this.n = motionEvent.getY();
                    this.r = true;
                    y = 0.0f;
                }
                if (this.r) {
                    if (y >= 0.0f) {
                        f = y;
                    }
                    VelocityTracker velocityTracker2 = this.d;
                    if (velocityTracker2 == null) {
                        velocityTracker2 = VelocityTracker.obtain();
                        this.d = velocityTracker2;
                    }
                    velocityTracker2.addMovement(motionEvent);
                    setTranslationY(f);
                }
                return this.r;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                float translationY = getTranslationY();
                VelocityTracker velocityTracker3 = this.d;
                if (velocityTracker3 == null) {
                    velocityTracker3 = VelocityTracker.obtain();
                    this.d = velocityTracker3;
                }
                velocityTracker3.computeCurrentVelocity(1000);
                float xVelocity = this.d.getXVelocity();
                float yVelocity = this.d.getYVelocity();
                if (translationY < getMeasuredHeight() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                    animate().translationY(0.0f).start();
                } else {
                    c(Math.max((int) ((200.0f / getMeasuredHeight()) * (getMeasuredHeight() - getTranslationY())), 50));
                }
                this.r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z) {
        this.b = z;
    }
}
