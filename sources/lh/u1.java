package lh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
public final class u1 extends Drawable {
    public static b2 C = new b2();
    public Paint A;
    public int B;
    public final ViewGroup f12992a;
    public final g6 f12993b;
    public final Paint f12994c;
    public final Paint d;
    public final RectF f12995e;
    public final Path f12996f;
    public final boolean f12997g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f12998i;
    public RadialGradient f12999j;
    public final Matrix f13000k;
    public final t1 f13001l;
    public int[] f13002m;
    public LinearGradient f13003n;
    public final Matrix f13004o;
    public boolean f13005p;
    public final Paint f13006q;
    public final org.telegram.ui.Components.z5 f13007r;
    public float f13008s;
    public boolean f13009t;
    public boolean f13010u;
    public int v;
    public int f13011w;
    public Integer f13012x;
    public long f13013y;
    public Bitmap f13014z;

    public u1(ViewGroup viewGroup, g6 g6Var, boolean z4) {
        Paint paint = new Paint(1);
        this.f12994c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f12995e = new RectF();
        this.f12996f = new Path();
        this.f13000k = new Matrix();
        new Path();
        this.f13004o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f13006q = paint3;
        this.f13007r = new org.telegram.ui.Components.z5(new eh.m(this, 28), 320L, pr.h);
        this.f13008s = AndroidUtilities.dp(11.0f);
        this.f13010u = true;
        this.v = 0;
        int i10 = k6.f21659d6;
        this.f13011w = i10;
        this.f12992a = viewGroup;
        this.f12993b = g6Var;
        t1 t1Var = new t1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f13001l = t1Var;
        viewGroup.addOnAttachStateChangeListener(new ff.b(this, 3));
        if (viewGroup.isAttachedToWindow()) {
            t1Var.a();
        }
        this.f12997g = z4;
        paint.setColor(k6.v0(i10, g6Var));
        a(z4);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z4) {
        if (this.f13009t != z4) {
            this.f13009t = z4;
            Paint paint = this.f12994c;
            if (z4) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), k6.v0(k6.f21604a6, this.f12993b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: lh.u1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f12992a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f12999j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f13013y = 0L;
        t1 t1Var = this.f13001l;
        if (stargiftattributepattern == null) {
            t1Var.g(null, false);
            return;
        }
        t1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f13013y = document.f20849id;
        }
    }

    public final void f(boolean z4, boolean z10) {
        if (this.f13005p == z4) {
            return;
        }
        this.f13005p = z4;
        if (!z10) {
            this.f13007r.a(z4);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f13002m == iArr) {
            return;
        }
        this.f13002m = iArr;
        this.f13003n = null;
        c();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        rect.set(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        return true;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
