package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lr;
public final class y2 extends Drawable {
    public static g3 E = new g3();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup f4220a;
    public final org.telegram.ui.ActionBar.i6 f4221b;
    public final Paint f4222c;
    public final Paint d;
    public final RectF f4223e;
    public final Path f4224f;
    public final boolean f4225g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f4226i;
    public RadialGradient f4227j;
    public final Matrix f4228k;
    public final x2 f4229l;
    public int[] f4230m;
    public LinearGradient f4231n;
    public final Matrix f4232o;
    public boolean f4233p;
    public final Paint f4234q;
    public final org.telegram.ui.Components.c6 f4235r;
    public float f4236s;
    public boolean f4237t;
    public int f4238u;
    public boolean v;
    public int f4239w;
    public int f4240x;
    public int f4241y;
    public Integer f4242z;

    public y2(ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f4222c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f4223e = new RectF();
        this.f4224f = new Path();
        this.f4228k = new Matrix();
        new Path();
        this.f4232o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f4234q = paint3;
        this.f4235r = new org.telegram.ui.Components.c6(new a3.f(this, 22), 320L, lr.h);
        this.f4236s = org.telegram.messenger.g0.L(11.0f);
        this.v = true;
        this.f4239w = 0;
        int i7 = org.telegram.ui.ActionBar.n6.f29394d6;
        this.f4241y = i7;
        this.f4220a = viewGroup;
        this.f4221b = i6Var;
        x2 x2Var = new x2(this, viewGroup, org.telegram.messenger.g0.L(28.0f));
        this.f4229l = x2Var;
        viewGroup.addOnAttachStateChangeListener(new r2(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            x2Var.a();
        }
        this.f4225g = z10;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        this.f4240x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int i7;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29336a6, this.f4221b);
        } else {
            i7 = 0;
        }
        if (this.f4237t == z10 && (!z10 || this.f4238u == i7)) {
            return;
        }
        this.f4237t = z10;
        Paint paint = this.f4222c;
        if (z10) {
            this.f4238u = i7;
            paint.setShadowLayer(org.telegram.messenger.g0.L(1.66f), 0.0f, org.telegram.messenger.g0.L(0.33f), i7);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.y2.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f4220a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f4227j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.A = 0L;
        x2 x2Var = this.f4229l;
        if (stargiftattributepattern == null) {
            x2Var.g(null, false);
            return;
        }
        x2Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f28409id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f4233p == z10) {
            return;
        }
        this.f4233p = z10;
        if (!z11) {
            this.f4235r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f4230m == iArr) {
            return;
        }
        this.f4230m = iArr;
        this.f4231n = null;
        c();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        rect.set(org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f));
        return true;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
