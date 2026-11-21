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
import org.telegram.ui.Components.nr;
public final class c3 extends Drawable {
    public static k3 E = new k3();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup f3455a;
    public final org.telegram.ui.ActionBar.h6 f3456b;
    public final Paint f3457c;
    public final Paint d;
    public final RectF f3458e;
    public final Path f3459f;
    public final boolean f3460g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f3461i;
    public RadialGradient f3462j;
    public final Matrix f3463k;
    public final b3 f3464l;
    public int[] f3465m;
    public LinearGradient f3466n;
    public final Matrix f3467o;
    public boolean f3468p;
    public final Paint f3469q;
    public final org.telegram.ui.Components.d6 f3470r;
    public float f3471s;
    public boolean f3472t;
    public int f3473u;
    public boolean v;
    public int f3474w;
    public int f3475x;
    public int f3476y;
    public Integer f3477z;

    public c3(ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f3457c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f3458e = new RectF();
        this.f3459f = new Path();
        this.f3463k = new Matrix();
        new Path();
        this.f3467o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f3469q = paint3;
        this.f3470r = new org.telegram.ui.Components.d6(new a3.f(this, 22), 320L, nr.h);
        this.f3471s = org.telegram.messenger.g0.L(11.0f);
        this.v = true;
        this.f3474w = 0;
        int i7 = org.telegram.ui.ActionBar.m6.f29378d6;
        this.f3476y = i7;
        this.f3455a = viewGroup;
        this.f3456b = h6Var;
        b3 b3Var = new b3(this, viewGroup, org.telegram.messenger.g0.L(28.0f));
        this.f3464l = b3Var;
        viewGroup.addOnAttachStateChangeListener(new v2(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            b3Var.a();
        }
        this.f3460g = z10;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        this.f3475x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int i7;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29320a6, this.f3456b);
        } else {
            i7 = 0;
        }
        if (this.f3472t == z10 && (!z10 || this.f3473u == i7)) {
            return;
        }
        this.f3472t = z10;
        Paint paint = this.f3457c;
        if (z10) {
            this.f3473u = i7;
            paint.setShadowLayer(org.telegram.messenger.g0.L(1.66f), 0.0f, org.telegram.messenger.g0.L(0.33f), i7);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.c3.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f3455a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f3462j = null;
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
        b3 b3Var = this.f3464l;
        if (stargiftattributepattern == null) {
            b3Var.g(null, false);
            return;
        }
        b3Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f28437id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f3468p == z10) {
            return;
        }
        this.f3468p = z10;
        if (!z11) {
            this.f3470r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f3465m == iArr) {
            return;
        }
        this.f3465m = iArr;
        this.f3466n = null;
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
