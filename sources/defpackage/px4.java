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
public final class px4 extends Drawable {
    public static wx4 E = new wx4();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup a;
    public final vnb b;
    public final Paint c;
    public final Paint d;
    public final RectF e;
    public final Path f;
    public final boolean g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int i;
    public RadialGradient j;
    public final Matrix k;
    public final ox4 l;
    public int[] m;
    public LinearGradient n;
    public final Matrix o;
    public boolean p;
    public final Paint q;
    public final mm r;
    public float s;
    public boolean t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public Integer z;

    public px4(ViewGroup viewGroup, vnb vnbVar, boolean z) {
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
        this.r = new mm(new rj4(this, (byte) 16), 320L, k43.h);
        this.s = hl.L(11.0f);
        this.v = true;
        this.w = false;
        int i = aob.d6;
        this.y = i;
        this.a = viewGroup;
        this.b = vnbVar;
        ox4 ox4Var = new ox4(this, viewGroup, hl.L(28.0f));
        this.l = ox4Var;
        viewGroup.addOnAttachStateChangeListener(new xc(this, (byte) 9));
        if (viewGroup.isAttachedToWindow()) {
            ox4Var.a();
        }
        this.g = z;
        int v0 = aob.v0(i, vnbVar);
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
            i = aob.v0(aob.a6, this.b);
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
            paint.setShadowLayer(hl.L(1.66f), 0.0f, hl.L(0.33f), i);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px4.b(android.graphics.Canvas, float):void");
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
        ox4 ox4Var = this.l;
        if (stargiftattributepattern == null) {
            ox4Var.g(null, false);
            return;
        }
        ox4Var.i(stargiftattributepattern.document, false);
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
        rect.set(hl.L(3.33f), hl.L(4.0f), hl.L(3.33f), hl.L(4.0f));
        return true;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
