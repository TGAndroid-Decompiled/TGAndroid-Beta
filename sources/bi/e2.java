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
import org.telegram.ui.Components.er;
public final class e2 extends Drawable {
    public static m2 E = new m2();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup f3456a;
    public final org.telegram.ui.ActionBar.e6 f3457b;
    public final Paint f3458c;
    public final Paint d;
    public final RectF f3459e;
    public final Path f3460f;
    public final boolean f3461g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f3462i;
    public RadialGradient f3463j;
    public final Matrix f3464k;
    public final d2 f3465l;
    public int[] f3466m;
    public LinearGradient f3467n;
    public final Matrix f3468o;
    public boolean f3469p;
    public final Paint f3470q;
    public final org.telegram.ui.Components.u5 f3471r;
    public float f3472s;
    public boolean f3473t;
    public int f3474u;
    public boolean v;
    public int f3475w;
    public int f3476x;
    public int f3477y;
    public Integer f3478z;

    public e2(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f3458c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f3459e = new RectF();
        this.f3460f = new Path();
        this.f3464k = new Matrix();
        new Path();
        this.f3468o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f3470q = paint3;
        this.f3471r = new org.telegram.ui.Components.u5(new a3.f(this, 21), 320L, er.h);
        this.f3472s = org.telegram.messenger.g0.L(11.0f);
        this.v = true;
        this.f3475w = 0;
        int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
        this.f3477y = i7;
        this.f3456a = viewGroup;
        this.f3457b = e6Var;
        d2 d2Var = new d2(this, viewGroup, org.telegram.messenger.g0.L(28.0f));
        this.f3465l = d2Var;
        viewGroup.addOnAttachStateChangeListener(new x1(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            d2Var.a();
        }
        this.f3461g = z10;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        this.f3476x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int i7;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28791a6, this.f3457b);
        } else {
            i7 = 0;
        }
        if (this.f3473t == z10 && (!z10 || this.f3474u == i7)) {
            return;
        }
        this.f3473t = z10;
        Paint paint = this.f3458c;
        if (z10) {
            this.f3474u = i7;
            paint.setShadowLayer(org.telegram.messenger.g0.L(1.66f), 0.0f, org.telegram.messenger.g0.L(0.33f), i7);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.e2.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f3456a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f3463j = null;
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
        d2 d2Var = this.f3465l;
        if (stargiftattributepattern == null) {
            d2Var.g(null, false);
            return;
        }
        d2Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f28057id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f3469p == z10) {
            return;
        }
        this.f3469p = z10;
        if (!z11) {
            this.f3471r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f3466m == iArr) {
            return;
        }
        this.f3466m = iArr;
        this.f3467n = null;
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
