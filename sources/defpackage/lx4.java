package defpackage;

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
public final class lx4 extends Drawable {
    public static sx4 E = new sx4();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup a;
    public final ylb b;
    public final Paint c;
    public final Paint d;
    public final RectF e;
    public final Path f;
    public final boolean g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int i;
    public RadialGradient j;
    public final Matrix k;
    public final kx4 l;
    public int[] m;
    public LinearGradient n;
    public final Matrix o;
    public boolean p;
    public final Paint q;
    public final ln r;
    public float s;
    public boolean t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public Integer z;

    public lx4(ViewGroup viewGroup, ylb ylbVar, boolean z) {
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f = new Path();
        this.k = new Matrix();
        this.o = new Matrix();
        Paint paint3 = new Paint(1);
        this.q = paint3;
        this.r = new ln(new qn4(this, (byte) 9), 320L, d53.h);
        this.s = gm.L(11.0f);
        this.v = true;
        this.w = false;
        int i = cmb.c6;
        this.y = i;
        this.a = viewGroup;
        this.b = ylbVar;
        kx4 kx4Var = new kx4(this, viewGroup, gm.L(28.0f));
        this.l = kx4Var;
        viewGroup.addOnAttachStateChangeListener(new wd(this, (byte) 9));
        if (viewGroup.isAttachedToWindow()) {
            kx4Var.a();
        }
        this.g = z;
        int v0 = cmb.v0(i, ylbVar);
        this.x = v0;
        paint.setColor(v0);
        a(z);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z) {
        int i;
        if (z) {
            i = cmb.v0(cmb.Z5, this.b);
        } else {
            i = 0;
        }
        if (this.t == z && (!z || this.u == i)) {
            return;
        }
        this.t = z;
        Paint paint = this.c;
        if (z) {
            this.u = i;
            paint.setShadowLayer(gm.L(1.66f), 0.0f, gm.L(0.33f), i);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx4.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.j = null;
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
        kx4 kx4Var = this.l;
        if (stargiftattributepattern == null) {
            kx4Var.g(null, false);
            return;
        }
        kx4Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.id;
        }
    }

    public final void f(boolean z, boolean z2) {
        if (this.p == z) {
            return;
        }
        this.p = z;
        if (!z2) {
            this.r.a(z);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.m == iArr) {
            return;
        }
        this.m = iArr;
        this.n = null;
        c();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        rect.set(gm.L(3.33f), gm.L(4.0f), gm.L(3.33f), gm.L(4.0f));
        return true;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
