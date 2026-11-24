package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fz9 extends View {
    public boolean E;
    public Drawable F;
    public Rect G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public ez9 K;
    public cw3 L;
    public boolean M;
    public boolean N;
    public float O;
    public float P;
    public int Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public final ec2 V;
    public final vz9 W;
    public boolean a;
    public boolean b;
    public int c;
    public TLRPC.Document d;
    public gn e;
    public final in5[] f;
    public ImageReceiver h;
    public final ImageReceiver n;
    public ImageReceiver r;
    public boolean s;
    public TL_stars.TL_starGiftUnique w;
    public Integer x;
    public k39 y;

    public fz9(vz9 vz9Var, Context context) {
        super(context);
        this.W = vz9Var;
        this.a = false;
        this.b = false;
        this.f = new in5[2];
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.n = imageReceiver;
        this.U = 1.0f;
        this.V = new ec2(this, (byte) 2);
        imageReceiver.y = true;
        setFocusable(true);
    }

    public final void a(yy9 yy9Var) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(yy9Var);
            this.h = imageReceiver;
            imageReceiver.m0(7);
            if (this.I) {
                this.h.I();
            }
            this.h.S0 = true;
        }
    }

    public final void b() {
        Paint paint;
        ez9 ez9Var = this.K;
        if (ez9Var == null) {
            Context context = getContext();
            int i = pj8.M;
            this.K = new ez9(this, context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm.L(16.66f), 1073741824);
            this.K.measure(makeMeasureSpec, makeMeasureSpec);
            ez9 ez9Var2 = this.K;
            ez9Var2.layout(0, 0, ez9Var2.getMeasuredWidth(), this.K.getMeasuredHeight());
            return;
        }
        ez9Var.h = false;
        ez9Var.n = -1;
        if (ez9Var.a == 2 && (paint = ez9Var.y) != null) {
            paint.setColor(cmb.w0(null, cmb.Z6, false));
        }
    }

    public final void c(TLRPC.Document document, yy9 yy9Var) {
        String str;
        this.d = document;
        a(yy9Var);
        meb f = eq3.f(document, cmb.l6, 0.2f, null);
        int i = this.W.a0;
        ImageReceiver imageReceiver = this.h;
        if (i == 6) {
            gn5 b = gn5.b(document);
            if (!e86.e(16388)) {
                str = "34_34_firstframe";
            } else {
                str = "34_34";
            }
            imageReceiver.Z(b, str, null, null, f, document.size, null, document, 0);
        } else {
            imageReceiver.Z(gn5.b(document), "100_100_firstframe", null, null, f, 0L, "tgs", document, 0);
        }
        this.R = true;
        this.e = null;
    }

    public final void d(boolean z, boolean z2) {
        float f;
        if (this.M != z) {
            this.M = z;
            if (!z2) {
                float f2 = 0.0f;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                this.S = f;
                if (z) {
                    f2 = 1.0f;
                }
                this.T = f2;
            }
        }
    }

    public final void e(boolean z, boolean z2) {
        if (!this.M && z && z2 && this.W.a0 != 14) {
            this.N = true;
            this.T = 1.0f;
            this.S = 1.0f;
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O, 1.6f, 0.7f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new cz9(this, (byte) 2));
            this.J.addListener(new dz9(this, (byte) 2));
            this.J.setInterpolator(new LinearInterpolator());
            this.J.setDuration(200L);
            this.J.start();
            return;
        }
        this.N = false;
        d(z, z2);
    }

    public final void f() {
        if (this.M && this.W.a0 != 14) {
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
            }
            this.O = 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new cz9(this, (byte) 1));
            this.J.addListener(new dz9(this, (byte) 1));
            b10.n(5.0f, this.J);
            this.J.setDuration(350L);
            this.J.start();
            d(false, true);
        }
    }

    public float getAnimatedScale() {
        return this.U;
    }

    @Override
    public final void invalidate() {
        if (!oi5.b && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I) {
            return;
        }
        this.I = true;
        Drawable drawable = this.F;
        if (drawable instanceof vm) {
            ((vm) drawable).a(this.V);
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.p0((View) getParent());
            this.h.I();
        }
        this.n.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.I) {
            return;
        }
        this.I = false;
        Drawable drawable = this.F;
        if (drawable instanceof vm) {
            ((vm) drawable).n(this.V);
            mm mmVar = ((vm) this.F).k;
            if (mmVar != null) {
                mmVar.S(false);
            }
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.K();
            this.h.S(false);
        }
        this.n.K();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        gn gnVar;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str2 = null;
        if (this.a) {
            str2 = jb6.M0(2131746021, null);
        } else {
            k39 k39Var = this.y;
            if (k39Var != null && (str = k39Var.f) != null) {
                str2 = str;
            } else {
                TLRPC.Document document = this.d;
                if (document == null && (gnVar = this.e) != null && (document = gnVar.document) == null) {
                    document = vm.e(this.W.W, gnVar.getDocumentId());
                }
                if (document != null) {
                    str2 = k47.V(document, null, null);
                }
            }
        }
        if (str2 != null) {
            accessibilityNodeInfo.setContentDescription(str2);
        }
        accessibilityNodeInfo.setSelected(this.M);
        accessibilityNodeInfo.setClickable(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824));
    }

    public void setAnimatedScale(float f) {
        this.U = f;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.F;
        if (drawable2 != drawable) {
            boolean z = this.I;
            ec2 ec2Var = this.V;
            if (z && drawable2 != null && (drawable2 instanceof vm)) {
                ((vm) drawable2).n(ec2Var);
            }
            this.F = drawable;
            if (this.I && (drawable instanceof vm)) {
                ((vm) drawable).a(ec2Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.L = null;
        } else {
            this.L = gw3.g(str);
        }
    }

    @Override
    public void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (isPressed() != z) {
            super.setPressed(z);
            invalidate();
            if (z && (valueAnimator = this.J) != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
            }
            if (!z) {
                float f = this.O;
                if (f != 0.0f && this.W.a0 != 14) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.J = ofFloat;
                    ofFloat.addUpdateListener(new cz9(this, (byte) 0));
                    this.J.addListener(new dz9(this, (byte) 0));
                    b10.n(5.0f, this.J);
                    this.J.setDuration(350L);
                    this.J.start();
                }
            }
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (oi5.b) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }
}
