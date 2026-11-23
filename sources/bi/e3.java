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
import org.telegram.ui.Components.kr;
public final class e3 extends Drawable {
    public static m3 E = new m3();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup f3481a;
    public final org.telegram.ui.ActionBar.i6 f3482b;
    public final Paint f3483c;
    public final Paint d;
    public final RectF f3484e;
    public final Path f3485f;
    public final boolean f3486g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f3487i;
    public RadialGradient f3488j;
    public final Matrix f3489k;
    public final d3 f3490l;
    public int[] f3491m;
    public LinearGradient f3492n;
    public final Matrix f3493o;
    public boolean f3494p;
    public final Paint f3495q;
    public final org.telegram.ui.Components.c6 f3496r;
    public float f3497s;
    public boolean f3498t;
    public int f3499u;
    public boolean v;
    public int f3500w;
    public int f3501x;
    public int f3502y;
    public Integer f3503z;

    public e3(ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f3483c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f3484e = new RectF();
        this.f3485f = new Path();
        this.f3489k = new Matrix();
        new Path();
        this.f3493o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f3495q = paint3;
        this.f3496r = new org.telegram.ui.Components.c6(new a3.f(this, 21), 320L, kr.h);
        this.f3497s = org.telegram.messenger.g0.L(11.0f);
        this.v = true;
        this.f3500w = 0;
        int i7 = org.telegram.ui.ActionBar.n6.f29451d6;
        this.f3502y = i7;
        this.f3481a = viewGroup;
        this.f3482b = i6Var;
        d3 d3Var = new d3(this, viewGroup, org.telegram.messenger.g0.L(28.0f));
        this.f3490l = d3Var;
        viewGroup.addOnAttachStateChangeListener(new x2(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            d3Var.a();
        }
        this.f3486g = z10;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        this.f3501x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int i7;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29393a6, this.f3482b);
        } else {
            i7 = 0;
        }
        if (this.f3498t == z10 && (!z10 || this.f3499u == i7)) {
            return;
        }
        this.f3498t = z10;
        Paint paint = this.f3483c;
        if (z10) {
            this.f3499u = i7;
            paint.setShadowLayer(org.telegram.messenger.g0.L(1.66f), 0.0f, org.telegram.messenger.g0.L(0.33f), i7);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.e3.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f3481a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f3488j = null;
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
        d3 d3Var = this.f3490l;
        if (stargiftattributepattern == null) {
            d3Var.g(null, false);
            return;
        }
        d3Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f28498id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f3494p == z10) {
            return;
        }
        this.f3494p = z10;
        if (!z11) {
            this.f3496r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f3491m == iArr) {
            return;
        }
        this.f3491m = iArr;
        this.f3492n = null;
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
