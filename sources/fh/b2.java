package fh;

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
import org.telegram.ui.Components.gr;
public final class b2 extends Drawable {
    public static j2 C = new j2();
    public Paint A;
    public int B;
    public final ViewGroup f6360a;
    public final org.telegram.ui.ActionBar.b6 f6361b;
    public final Paint f6362c;
    public final Paint d;
    public final RectF f6363e;
    public final Path f6364f;
    public final boolean f6365g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f6366i;
    public RadialGradient f6367j;
    public final Matrix f6368k;
    public final a2 f6369l;
    public int[] f6370m;
    public LinearGradient f6371n;
    public final Matrix f6372o;
    public boolean f6373p;
    public final Paint f6374q;
    public final org.telegram.ui.Components.y5 f6375r;
    public float f6376s;
    public boolean f6377t;
    public boolean f6378u;
    public int v;
    public int f6379w;
    public Integer f6380x;
    public long f6381y;
    public Bitmap f6382z;

    public b2(ViewGroup viewGroup, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f6362c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f6363e = new RectF();
        this.f6364f = new Path();
        this.f6368k = new Matrix();
        new Path();
        this.f6372o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f6374q = paint3;
        this.f6375r = new org.telegram.ui.Components.y5(new o1(this, 1), 320L, gr.h);
        this.f6376s = AndroidUtilities.dp(11.0f);
        this.f6378u = true;
        this.v = 0;
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        this.f6379w = i9;
        this.f6360a = viewGroup;
        this.f6361b = b6Var;
        a2 a2Var = new a2(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f6369l = a2Var;
        viewGroup.addOnAttachStateChangeListener(new af.b(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            a2Var.a();
        }
        this.f6365g = z10;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f6377t != z10) {
            this.f6377t = z10;
            Paint paint = this.f6362c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22946a6, this.f6361b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: fh.b2.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f6360a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f6367j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f6381y = 0L;
        a2 a2Var = this.f6369l;
        if (stargiftattributepattern == null) {
            a2Var.g(null, false);
            return;
        }
        a2Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f6381y = document.f22386id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f6373p == z10) {
            return;
        }
        this.f6373p = z10;
        if (!z11) {
            this.f6375r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f6370m == iArr) {
            return;
        }
        this.f6370m = iArr;
        this.f6371n = null;
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
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
