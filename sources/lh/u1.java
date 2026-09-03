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
    public final ViewGroup f12994a;
    public final g6 f12995b;
    public final Paint f12996c;
    public final Paint d;
    public final RectF f12997e;
    public final Path f12998f;
    public final boolean f12999g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f13000i;
    public RadialGradient f13001j;
    public final Matrix f13002k;
    public final t1 f13003l;
    public int[] f13004m;
    public LinearGradient f13005n;
    public final Matrix f13006o;
    public boolean f13007p;
    public final Paint f13008q;
    public final org.telegram.ui.Components.z5 f13009r;
    public float f13010s;
    public boolean f13011t;
    public boolean f13012u;
    public int v;
    public int f13013w;
    public Integer f13014x;
    public long f13015y;
    public Bitmap f13016z;

    public u1(ViewGroup viewGroup, g6 g6Var, boolean z4) {
        Paint paint = new Paint(1);
        this.f12996c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f12997e = new RectF();
        this.f12998f = new Path();
        this.f13002k = new Matrix();
        new Path();
        this.f13006o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f13008q = paint3;
        this.f13009r = new org.telegram.ui.Components.z5(new eh.m(this, 28), 320L, pr.h);
        this.f13010s = AndroidUtilities.dp(11.0f);
        this.f13012u = true;
        this.v = 0;
        int i10 = k6.f21661d6;
        this.f13013w = i10;
        this.f12994a = viewGroup;
        this.f12995b = g6Var;
        t1 t1Var = new t1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f13003l = t1Var;
        viewGroup.addOnAttachStateChangeListener(new ff.b(this, 3));
        if (viewGroup.isAttachedToWindow()) {
            t1Var.a();
        }
        this.f12999g = z4;
        paint.setColor(k6.v0(i10, g6Var));
        a(z4);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z4) {
        if (this.f13011t != z4) {
            this.f13011t = z4;
            Paint paint = this.f12996c;
            if (z4) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), k6.v0(k6.f21606a6, this.f12995b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: lh.u1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f12994a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f13001j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f13015y = 0L;
        t1 t1Var = this.f13003l;
        if (stargiftattributepattern == null) {
            t1Var.g(null, false);
            return;
        }
        t1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f13015y = document.f20851id;
        }
    }

    public final void f(boolean z4, boolean z10) {
        if (this.f13007p == z4) {
            return;
        }
        this.f13007p = z4;
        if (!z10) {
            this.f13009r.a(z4);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f13004m == iArr) {
            return;
        }
        this.f13004m = iArr;
        this.f13005n = null;
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
