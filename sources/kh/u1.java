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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mr;
public final class u1 extends Drawable {
    public static b2 C = new b2();
    public Paint A;
    public int B;
    public final ViewGroup f10952a;
    public final f6 f10953b;
    public final Paint f10954c;
    public final Paint d;
    public final RectF e;
    public final Path f10955f;
    public final boolean f10956g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f10957i;
    public RadialGradient f10958j;
    public final Matrix f10959k;
    public final t1 f10960l;
    public int[] f10961m;
    public LinearGradient f10962n;
    public final Matrix f10963o;
    public boolean f10964p;
    public final Paint f10965q;
    public final org.telegram.ui.Components.z5 f10966r;
    public float f10967s;
    public boolean f10968t;
    public boolean f10969u;
    public int v;
    public int f10970w;
    public Integer f10971x;
    public long f10972y;
    public Bitmap f10973z;

    public u1(ViewGroup viewGroup, f6 f6Var, boolean z4) {
        Paint paint = new Paint(1);
        this.f10954c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f10955f = new Path();
        this.f10959k = new Matrix();
        new Path();
        this.f10963o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f10965q = paint3;
        this.f10966r = new org.telegram.ui.Components.z5(new e3.h(this, 27), 320L, mr.h);
        this.f10967s = AndroidUtilities.dp(11.0f);
        this.f10969u = true;
        this.v = 0;
        int i10 = j6.f19881d6;
        this.f10970w = i10;
        this.f10952a = viewGroup;
        this.f10953b = f6Var;
        t1 t1Var = new t1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f10960l = t1Var;
        viewGroup.addOnAttachStateChangeListener(new ef.b(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            t1Var.a();
        }
        this.f10956g = z4;
        paint.setColor(j6.v0(i10, f6Var));
        a(z4);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z4) {
        if (this.f10968t != z4) {
            this.f10968t = z4;
            Paint paint = this.f10954c;
            if (z4) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), j6.v0(j6.f19826a6, this.f10953b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: kh.u1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f10952a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f10958j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f10972y = 0L;
        t1 t1Var = this.f10960l;
        if (stargiftattributepattern == null) {
            t1Var.g(null, false);
            return;
        }
        t1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f10972y = document.f19165id;
        }
    }

    public final void f(boolean z4, boolean z10) {
        if (this.f10964p == z4) {
            return;
        }
        this.f10964p = z4;
        if (!z10) {
            this.f10966r.a(z4);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f10961m == iArr) {
            return;
        }
        this.f10961m = iArr;
        this.f10962n = null;
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
