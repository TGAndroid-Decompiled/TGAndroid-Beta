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
public final class w0a extends View {
    public boolean E;
    public Drawable F;
    public Rect G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public v0a K;
    public lv3 L;
    public boolean M;
    public boolean N;
    public float O;
    public float P;
    public int Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public final jb2 V;
    public final n1a W;
    public boolean a;
    public boolean b;
    public int c;
    public TLRPC.Document d;
    public hm e;
    public final ln5[] f;
    public ImageReceiver h;
    public final ImageReceiver n;
    public ImageReceiver r;
    public boolean s;
    public TL_stars.TL_starGiftUnique w;
    public Integer x;
    public w49 y;

    public w0a(n1a n1aVar, Context context) {
        super(context);
        this.W = n1aVar;
        this.a = false;
        this.b = false;
        this.f = new ln5[2];
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.n = imageReceiver;
        this.U = 1.0f;
        this.V = new jb2(this, (byte) 2);
        imageReceiver.y = true;
        setFocusable(true);
    }

    public final void a(p0a p0aVar) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(p0aVar);
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
        v0a v0aVar = this.K;
        if (v0aVar == null) {
            Context context = getContext();
            int i = cl8.M;
            this.K = new v0a(this, context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hl.L(16.66f), 1073741824);
            this.K.measure(makeMeasureSpec, makeMeasureSpec);
            v0a v0aVar2 = this.K;
            v0aVar2.layout(0, 0, v0aVar2.getMeasuredWidth(), this.K.getMeasuredHeight());
            return;
        }
        v0aVar.h = false;
        v0aVar.n = -1;
        if (v0aVar.a == 2 && (paint = v0aVar.y) != null) {
            paint.setColor(aob.w0(null, aob.a7, false));
        }
    }

    public final void c(TLRPC.Document document, p0a p0aVar) {
        String str;
        this.d = document;
        a(p0aVar);
        ggb f = lp3.f(document, aob.m6, 0.2f, null);
        int i = this.W.a0;
        ImageReceiver imageReceiver = this.h;
        if (i == 6) {
            jn5 b = jn5.b(document);
            if (!i86.e(16388)) {
                str = "34_34_firstframe";
            } else {
                str = "34_34";
            }
            imageReceiver.Z(b, str, null, null, f, document.size, null, document, 0);
        } else {
            imageReceiver.Z(jn5.b(document), "100_100_firstframe", null, null, f, 0L, "tgs", document, 0);
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
            ofFloat.addUpdateListener(new t0a(this, (byte) 1));
            this.J.addListener(new u0a(this, (byte) 2));
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
            ofFloat.addUpdateListener(new t0a(this, (byte) 2));
            this.J.addListener(new u0a(this, (byte) 1));
            c00.o(5.0f, this.J);
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
        if (!ri5.b && getParent() != null) {
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
        if (drawable instanceof wl) {
            ((wl) drawable).a(this.V);
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
        if (drawable instanceof wl) {
            ((wl) drawable).n(this.V);
            nl nlVar = ((wl) this.F).k;
            if (nlVar != null) {
                nlVar.S(false);
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
        hm hmVar;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str2 = null;
        if (this.a) {
            str2 = ob6.M0(2131746015, null);
        } else {
            w49 w49Var = this.y;
            if (w49Var != null && (str = w49Var.f) != null) {
                str2 = str;
            } else {
                TLRPC.Document document = this.d;
                if (document == null && (hmVar = this.e) != null && (document = hmVar.document) == null) {
                    document = wl.e(this.W.W, hmVar.getDocumentId());
                }
                if (document != null) {
                    str2 = r47.V(document, null, null);
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
            jb2 jb2Var = this.V;
            if (z && drawable2 != null && (drawable2 instanceof wl)) {
                ((wl) drawable2).n(jb2Var);
            }
            this.F = drawable;
            if (this.I && (drawable instanceof wl)) {
                ((wl) drawable).a(jb2Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.L = null;
        } else {
            this.L = pv3.g(str);
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
                    ofFloat.addUpdateListener(new t0a(this, (byte) 0));
                    this.J.addListener(new u0a(this, (byte) 0));
                    c00.o(5.0f, this.J);
                    this.J.setDuration(350L);
                    this.J.start();
                }
            }
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (ri5.b) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }
}
