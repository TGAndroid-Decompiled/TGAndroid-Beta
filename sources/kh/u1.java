package kh;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr;
public final class u1 extends Drawable {
    public static c2 C = new c2();
    public Paint A;
    public int B;
    public final ViewGroup f10845a;
    public final org.telegram.ui.ActionBar.f6 f10846b;
    public final Paint f10847c;
    public final Paint d;
    public final RectF e;
    public final Path f10848f;
    public final boolean f10849g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f10850i;
    public RadialGradient f10851j;
    public final Matrix f10852k;
    public final t1 f10853l;
    public int[] f10854m;
    public LinearGradient f10855n;
    public final Matrix f10856o;
    public boolean f10857p;
    public final Paint f10858q;
    public final org.telegram.ui.Components.z5 f10859r;
    public float f10860s;
    public boolean f10861t;
    public boolean f10862u;
    public int v;
    public int f10863w;
    public Integer f10864x;
    public long f10865y;
    public Bitmap f10866z;

    public u1(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        Paint paint = new Paint(1);
        this.f10847c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f10848f = new Path();
        this.f10852k = new Matrix();
        new Path();
        this.f10856o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f10858q = paint3;
        this.f10859r = new org.telegram.ui.Components.z5(new ef.e(this, 25), 320L, nr.h);
        this.f10860s = AndroidUtilities.dp(11.0f);
        this.f10862u = true;
        this.v = 0;
        int i10 = j6.f19906d6;
        this.f10863w = i10;
        this.f10845a = viewGroup;
        this.f10846b = f6Var;
        t1 t1Var = new t1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f10853l = t1Var;
        viewGroup.addOnAttachStateChangeListener(new ff.b(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            t1Var.a();
        }
        this.f10849g = z4;
        paint.setColor(j6.v0(i10, f6Var));
        a(z4);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z4) {
        if (this.f10861t != z4) {
            this.f10861t = z4;
            Paint paint = this.f10847c;
            if (z4) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), j6.v0(j6.f19851a6, this.f10846b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: kh.u1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f10845a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f10851j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f10865y = 0L;
        t1 t1Var = this.f10853l;
        if (stargiftattributepattern == null) {
            t1Var.g(null, false);
            return;
        }
        t1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f10865y = document.f19190id;
        }
    }

    public final void f(boolean z4, boolean z10) {
        if (this.f10857p == z4) {
            return;
        }
        this.f10857p = z4;
        if (!z10) {
            this.f10859r.a(z4);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f10854m == iArr) {
            return;
        }
        this.f10854m = iArr;
        this.f10855n = null;
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
