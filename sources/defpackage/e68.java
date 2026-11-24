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
public final class e68 extends l34 {
    public final lm A0;
    public final oc6 B0;
    public final Bitmap C0;
    public boolean D0;
    public boolean E0;
    public final Rect F0;
    public final Rect G0;
    public final Paint H0;
    public zl6 I0;
    public final TLObject s0;
    public final String t0;
    public final int u0;
    public boolean v0;
    public final lm w0;
    public final via x0;
    public final int y0;
    public boolean z0;

    public e68(Context context, PointF pointF, via viaVar, String str, int i) {
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
        this.x0 = viaVar;
        oc6 oc6Var = new oc6(this, context);
        this.B0 = oc6Var;
        addView(oc6Var, nme.c(-1.0f, -1));
        s33 s33Var = s33.h;
        this.w0 = new lm(oc6Var, 0L, 500L, s33Var);
        this.A0 = new lm(oc6Var, 0L, 350L, s33Var);
        this.y0 = i;
        Bitmap q = f4b.q(new zx4(str, (byte) 2), 1920, 1920, 0, false);
        this.C0 = q;
        if (q != null) {
            s(q);
        }
        k();
    }

    private String getImageFilter() {
        Point point = gl.q;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / gl.p);
        return tb4.m(round, round, "_");
    }

    @Override
    public final k34 a() {
        return new n46(this, getContext());
    }

    public int getAnchor() {
        return this.u0;
    }

    public via getBaseSize() {
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
    public l29 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (gl.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float L2 = (gl.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float scale2 = getScale() * getMeasuredWidth();
        getMeasuredHeight();
        getScale();
        gl.L(64.0f);
        float e = de9.e(L, 2.0f, getPositionX(), scaleX);
        return new l29(e, de9.e(L2, 2.0f, getPositionY(), scaleX), ((((gl.L(64.0f) / scaleX) + scale2) * scaleX) + e) - e, L2 * scaleX);
    }

    @Override
    public final void k() {
        via viaVar = this.x0;
        float f = viaVar.a / 2.0f;
        float f2 = viaVar.b / 2.0f;
        zl6 zl6Var = this.I0;
        if (zl6Var != null) {
            f *= zl6Var.e;
            f2 *= zl6Var.f;
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
        via viaVar = this.x0;
        float f = viaVar.a;
        float f2 = viaVar.b;
        zl6 zl6Var = this.I0;
        if (zl6Var != null) {
            f *= zl6Var.e;
            f2 *= zl6Var.f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f2, 1073741824));
    }

    public final String q(int i) {
        TLObject tLObject = this.s0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w = ba4.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                ba4.G(i);
                return ba4.J(w, null, true, true).getAbsolutePath();
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
        oc6 oc6Var = this.B0;
        if (oc6Var != null) {
            oc6Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.E0 && !this.D0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            j00 j00Var = new j00();
            j00Var.a = true;
            knd a = uue.a(new fab(j00Var));
            this.D0 = true;
            a.c(go5.a(this.y0, bitmap)).addOnSuccessListener(new im6(this, (byte) 29)).addOnFailureListener(new dx6(this, bitmap, (byte) 16));
        }
    }

    public final void t(boolean z) {
        boolean z2 = !this.z0;
        this.z0 = z2;
        if (!z) {
            this.A0.f(z2, true);
        }
        oc6 oc6Var = this.B0;
        if (oc6Var != null) {
            oc6Var.invalidate();
        }
    }

    public e68(Context context, PointF pointF, via viaVar, TLObject tLObject) {
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
        this.x0 = viaVar;
        oc6 oc6Var = new oc6(this, context);
        this.B0 = oc6Var;
        addView(oc6Var, nme.c(-1.0f, -1));
        s33 s33Var = s33.h;
        this.w0 = new lm(oc6Var, 0L, 500L, s33Var);
        this.A0 = new lm(oc6Var, 0L, 350L, s33Var);
        k();
    }
}
