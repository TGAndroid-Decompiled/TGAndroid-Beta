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
    public final ViewGroup f3460a;
    public final org.telegram.ui.ActionBar.h6 f3461b;
    public final Paint f3462c;
    public final Paint d;
    public final RectF f3463e;
    public final Path f3464f;
    public final boolean f3465g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f3466i;
    public RadialGradient f3467j;
    public final Matrix f3468k;
    public final b3 f3469l;
    public int[] f3470m;
    public LinearGradient f3471n;
    public final Matrix f3472o;
    public boolean f3473p;
    public final Paint f3474q;
    public final org.telegram.ui.Components.d6 f3475r;
    public float f3476s;
    public boolean f3477t;
    public int f3478u;
    public boolean v;
    public int f3479w;
    public int f3480x;
    public int f3481y;
    public Integer f3482z;

    public c3(ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f3462c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f3463e = new RectF();
        this.f3464f = new Path();
        this.f3468k = new Matrix();
        new Path();
        this.f3472o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f3474q = paint3;
        this.f3475r = new org.telegram.ui.Components.d6(new a3.f(this, 22), 320L, nr.h);
        this.f3476s = org.telegram.messenger.g0.L(11.0f);
        this.v = true;
        this.f3479w = 0;
        int i7 = org.telegram.ui.ActionBar.m6.f29381d6;
        this.f3481y = i7;
        this.f3460a = viewGroup;
        this.f3461b = h6Var;
        b3 b3Var = new b3(this, viewGroup, org.telegram.messenger.g0.L(28.0f));
        this.f3469l = b3Var;
        viewGroup.addOnAttachStateChangeListener(new v2(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            b3Var.a();
        }
        this.f3465g = z10;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        this.f3480x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int i7;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29323a6, this.f3461b);
        } else {
            i7 = 0;
        }
        if (this.f3477t == z10 && (!z10 || this.f3478u == i7)) {
            return;
        }
        this.f3477t = z10;
        Paint paint = this.f3462c;
        if (z10) {
            this.f3478u = i7;
            paint.setShadowLayer(org.telegram.messenger.g0.L(1.66f), 0.0f, org.telegram.messenger.g0.L(0.33f), i7);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.c3.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f3460a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f3467j = null;
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
        b3 b3Var = this.f3469l;
        if (stargiftattributepattern == null) {
            b3Var.g(null, false);
            return;
        }
        b3Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f28440id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f3473p == z10) {
            return;
        }
        this.f3473p = z10;
        if (!z11) {
            this.f3475r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f3470m == iArr) {
            return;
        }
        this.f3470m = iArr;
        this.f3471n = null;
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
