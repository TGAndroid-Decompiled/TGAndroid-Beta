package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class itc extends FrameLayout {
    public final ImageView a;
    public final yoc b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int h;
    public float n;
    public float r;
    public boolean s;
    public ValueAnimator w;
    public vpa x;

    public itc(Context context) {
        super(context);
        this.e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(2131231961);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, tre.c(-1.0f, -1));
        yoc yocVar = new yoc(this, context, new olc(this, (byte) 12));
        this.b = yocVar;
        addView(yocVar, tre.c(-1.0f, -1));
    }

    public final void a(float f) {
        if (this.x == null) {
            vpa vpaVar = new vpa(new xk4(this.e));
            this.x = vpaVar;
            wpa wpaVar = new wpa(f);
            wpaVar.a(0.55f);
            wpaVar.b(280.0f);
            vpaVar.m = wpaVar;
            this.x.f(0.001f);
            this.x.b(new i10(this, (byte) 20));
        }
        this.x.c(f);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f = (float) Math.IEEEremainder((this.f + this.c) - c(), 6.283185307179586d);
        this.s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.w = ofFloat;
        ofFloat.setDuration(350L);
        this.w.setInterpolator(k43.h);
        this.w.addUpdateListener(new qm1(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), (byte) 9));
        this.w.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.b.setPaused(true);
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        vpa vpaVar = this.x;
        if (vpaVar != null) {
            vpaVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yoc yocVar = this.b;
        int i = 0;
        if (yocVar.n && yocVar.getVisibility() == 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.h != -1) {
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.h) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i = 1;
                                }
                                this.h = motionEvent.getPointerId(i);
                                this.n = motionEvent.getX(i);
                                this.r = motionEvent.getY(i);
                                return true;
                            }
                            return true;
                        }
                    } else {
                        int i2 = this.h;
                        if (i2 != -1) {
                            int findPointerIndex = motionEvent.findPointerIndex(i2);
                            if (findPointerIndex < 0) {
                                b();
                                return true;
                            }
                            float f = 0.013962634f / hl.p;
                            this.c = qd4.A(motionEvent.getX(findPointerIndex), this.n, f, this.c);
                            this.d = qd4.A(motionEvent.getY(findPointerIndex), this.r, f, this.d);
                            this.n = motionEvent.getX(findPointerIndex);
                            this.r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.s && this.e <= 1.001f) {
                this.c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            this.s = false;
            this.h = motionEvent.getPointerId(0);
            this.n = motionEvent.getX();
            this.r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
