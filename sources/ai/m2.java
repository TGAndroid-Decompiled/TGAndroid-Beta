package ai;

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
import org.telegram.ui.Components.xq;
public final class m2 extends Drawable {
    public static u2 E = new u2();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup f798a;
    public final org.telegram.ui.ActionBar.e6 f799b;
    public final Paint f800c;
    public final Paint d;
    public final RectF f801e;
    public final Path f802f;
    public final boolean f803g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f804i;
    public RadialGradient f805j;
    public final Matrix f806k;
    public final l2 f807l;
    public int[] f808m;
    public LinearGradient f809n;
    public final Matrix f810o;
    public boolean f811p;
    public final Paint f812q;
    public final org.telegram.ui.Components.u5 f813r;
    public float f814s;
    public boolean f815t;
    public int f816u;
    public boolean v;
    public int f817w;
    public int f818x;
    public int f819y;
    public Integer f820z;

    public m2(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f800c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f801e = new RectF();
        this.f802f = new Path();
        this.f806k = new Matrix();
        new Path();
        this.f810o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f812q = paint3;
        this.f813r = new org.telegram.ui.Components.u5(new s(this, 3), 320L, xq.h);
        this.f814s = org.telegram.messenger.g0.L(11.0f);
        this.v = true;
        this.f817w = 0;
        int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        this.f819y = i3;
        this.f798a = viewGroup;
        this.f799b = e6Var;
        l2 l2Var = new l2(this, viewGroup, org.telegram.messenger.g0.L(28.0f));
        this.f807l = l2Var;
        viewGroup.addOnAttachStateChangeListener(new f2(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            l2Var.a();
        }
        this.f803g = z10;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        this.f818x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int i3;
        if (z10) {
            i3 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27823a6, this.f799b);
        } else {
            i3 = 0;
        }
        if (this.f815t == z10 && (!z10 || this.f816u == i3)) {
            return;
        }
        this.f815t = z10;
        Paint paint = this.f800c;
        if (z10) {
            this.f816u = i3;
            paint.setShadowLayer(org.telegram.messenger.g0.L(1.66f), 0.0f, org.telegram.messenger.g0.L(0.33f), i3);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: ai.m2.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f798a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f805j = null;
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
        l2 l2Var = this.f807l;
        if (stargiftattributepattern == null) {
            l2Var.g(null, false);
            return;
        }
        l2Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f27007id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f811p == z10) {
            return;
        }
        this.f811p = z10;
        if (!z11) {
            this.f813r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f808m == iArr) {
            return;
        }
        this.f808m = iArr;
        this.f809n = null;
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
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
