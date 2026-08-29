package ih;

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
import org.telegram.ui.Components.jr;
public final class v1 extends Drawable {
    public static c2 C = new c2();
    public Paint A;
    public int B;
    public final ViewGroup f9434a;
    public final org.telegram.ui.ActionBar.c6 f9435b;
    public final Paint f9436c;
    public final Paint d;
    public final RectF f9437e;
    public final Path f9438f;
    public final boolean f9439g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f9440i;
    public RadialGradient f9441j;
    public final Matrix f9442k;
    public final u1 f9443l;
    public int[] f9444m;
    public LinearGradient f9445n;
    public final Matrix f9446o;
    public boolean f9447p;
    public final Paint f9448q;
    public final org.telegram.ui.Components.d6 f9449r;
    public float f9450s;
    public boolean f9451t;
    public boolean f9452u;
    public int v;
    public int f9453w;
    public Integer f9454x;
    public long f9455y;
    public Bitmap f9456z;

    public v1(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f9436c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f9437e = new RectF();
        this.f9438f = new Path();
        this.f9442k = new Matrix();
        new Path();
        this.f9446o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f9448q = paint3;
        this.f9449r = new org.telegram.ui.Components.d6(new cg.m2(this, 21), 320L, jr.h);
        this.f9450s = AndroidUtilities.dp(11.0f);
        this.f9452u = true;
        this.v = 0;
        int i10 = g6.f23062d6;
        this.f9453w = i10;
        this.f9434a = viewGroup;
        this.f9435b = c6Var;
        u1 u1Var = new u1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f9443l = u1Var;
        viewGroup.addOnAttachStateChangeListener(new df.b(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            u1Var.a();
        }
        this.f9439g = z10;
        paint.setColor(g6.v0(i10, c6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f9451t != z10) {
            this.f9451t = z10;
            Paint paint = this.f9436c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), g6.v0(g6.f23008a6, this.f9435b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: ih.v1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f9434a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f9441j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f9455y = 0L;
        u1 u1Var = this.f9443l;
        if (stargiftattributepattern == null) {
            u1Var.g(null, false);
            return;
        }
        u1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f9455y = document.f22398id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f9447p == z10) {
            return;
        }
        this.f9447p = z10;
        if (!z11) {
            this.f9449r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f9444m == iArr) {
            return;
        }
        this.f9444m = iArr;
        this.f9445n = null;
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
