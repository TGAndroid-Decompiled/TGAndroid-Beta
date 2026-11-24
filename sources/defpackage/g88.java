package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g88 extends w44 {
    public final ln A0;
    public final ne6 B0;
    public final Bitmap C0;
    public boolean D0;
    public boolean E0;
    public final Rect F0;
    public final Rect G0;
    public final Paint H0;
    public ao6 I0;
    public final TLObject s0;
    public final String t0;
    public final int u0;
    public boolean v0;
    public final ln w0;
    public final xka x0;
    public final int y0;
    public boolean z0;

    public g88(Context context, PointF pointF, xka xkaVar, String str, int i) {
        super(context, pointF);
        this.u0 = -1;
        this.v0 = false;
        this.z0 = false;
        new Paint(3);
        this.F0 = new Rect();
        this.G0 = new Rect();
        this.H0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.t0 = str;
        this.x0 = xkaVar;
        ne6 ne6Var = new ne6(this, context);
        this.B0 = ne6Var;
        addView(ne6Var, qoe.c(-1.0f, -1));
        d53 d53Var = d53.h;
        this.w0 = new ln(ne6Var, 0L, 500L, d53Var);
        this.A0 = new ln(ne6Var, 0L, 350L, d53Var);
        this.y0 = i;
        Bitmap q = g6b.q(new ca4(str, (byte) 3), 1920, 1920, 0, false);
        this.C0 = q;
        if (q != null) {
            s(q);
        }
        k();
    }

    private String getImageFilter() {
        Point point = gm.q;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / gm.p);
        return td4.n(round, round, "_");
    }

    @Override
    public final v44 a() {
        return new n66(this, getContext());
    }

    public int getAnchor() {
        return this.u0;
    }

    public xka getBaseSize() {
        return this.x0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.C0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.C0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.y0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public o49 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (gm.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float L2 = (gm.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float scale2 = getScale() * getMeasuredWidth();
        getMeasuredHeight();
        getScale();
        gm.L(64.0f);
        float e = hg9.e(L, 2.0f, getPositionX(), scaleX);
        return new o49(e, hg9.e(L2, 2.0f, getPositionY(), scaleX), ((((gm.L(64.0f) / scaleX) + scale2) * scaleX) + e) - e, L2 * scaleX);
    }

    @Override
    public final void k() {
        xka xkaVar = this.x0;
        float f = xkaVar.a / 2.0f;
        float f2 = xkaVar.b / 2.0f;
        ao6 ao6Var = this.I0;
        if (ao6Var != null) {
            f *= ao6Var.e;
            f2 *= ao6Var.f;
        }
        setX(getPositionX() - f);
        setY(getPositionY() - f2);
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        xka xkaVar = this.x0;
        float f = xkaVar.a;
        float f2 = xkaVar.b;
        ao6 ao6Var = this.I0;
        if (ao6Var != null) {
            f *= ao6Var.e;
            f2 *= ao6Var.f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f2, 1073741824));
    }

    public final String q(int i) {
        TLObject tLObject = this.s0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w = bc4.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                bc4.G(i);
                return bc4.J(w, null, true, true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.t0;
    }

    public final void r(boolean z) {
        boolean z2 = !this.v0;
        this.v0 = z2;
        if (!z) {
            this.w0.f(z2, true);
        }
        ne6 ne6Var = this.B0;
        if (ne6Var != null) {
            ne6Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.E0 && !this.D0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            j10 j10Var = new j10();
            j10Var.a = true;
            npd a = wwe.a(new hcb(j10Var));
            this.D0 = true;
            a.c(gq5.a(this.y0, bitmap)).addOnSuccessListener(new h68(this, (byte) 2)).addOnFailureListener(new cz6(this, bitmap, (byte) 17));
        }
    }

    public final void t(boolean z) {
        boolean z2 = !this.z0;
        this.z0 = z2;
        if (!z) {
            this.A0.f(z2, true);
        }
        ne6 ne6Var = this.B0;
        if (ne6Var != null) {
            ne6Var.invalidate();
        }
    }

    public g88(Context context, PointF pointF, xka xkaVar, TLObject tLObject) {
        super(context, pointF);
        this.u0 = -1;
        this.v0 = false;
        this.z0 = false;
        new Paint(3);
        this.F0 = new Rect();
        this.G0 = new Rect();
        this.H0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.s0 = tLObject;
        this.x0 = xkaVar;
        ne6 ne6Var = new ne6(this, context);
        this.B0 = ne6Var;
        addView(ne6Var, qoe.c(-1.0f, -1));
        d53 d53Var = d53.h;
        this.w0 = new ln(ne6Var, 0L, 500L, d53Var);
        this.A0 = new ln(ne6Var, 0L, 350L, d53Var);
        k();
    }
}
