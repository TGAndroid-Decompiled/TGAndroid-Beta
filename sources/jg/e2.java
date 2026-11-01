package jg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import org.telegram.messenger.a30;
import org.telegram.messenger.b8;
import org.telegram.messenger.ze;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.t5;
import vh.n5;
import w7.b6;
import w7.w7;
public final class e2 extends j {
    public final Bitmap A0;
    public boolean B0;
    public boolean C0;
    public final Rect D0;
    public final Rect E0;
    public final Paint F0;
    public ze G0;
    public final TLObject f9951q0;
    public final String f9952r0;
    public final int f9953s0;
    public boolean f9954t0;
    public final t5 f9955u0;
    public final qu0 f9956v0;
    public final int f9957w0;
    public boolean f9958x0;
    public final t5 f9959y0;
    public final l0 f9960z0;

    public e2(Context context, PointF pointF, qu0 qu0Var, String str, int i10) {
        super(context, pointF);
        this.f9953s0 = -1;
        this.f9954t0 = false;
        this.f9958x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f9952r0 = str;
        this.f9956v0 = qu0Var;
        l0 l0Var = new l0(this, context);
        this.f9960z0 = l0Var;
        addView(l0Var, b6.c(-1.0f, -1));
        gr grVar = gr.h;
        this.f9955u0 = new t5(l0Var, 0L, 500L, grVar);
        this.f9959y0 = new t5(l0Var, 0L, 350L, grVar);
        this.f9957w0 = i10;
        Bitmap q6 = n5.q(new ig.c0(str, 12), 1920, 1920, 0, false);
        this.A0 = q6;
        if (q6 != null) {
            s(q6);
        }
        k();
    }

    private String getImageFilter() {
        Point point = org.telegram.messenger.i0.f16172q;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / org.telegram.messenger.i0.f16171p);
        return a1.g.i(round, round, "_");
    }

    @Override
    public final i a() {
        return new u0(this, getContext());
    }

    public int getAnchor() {
        return this.f9953s0;
    }

    public qu0 getBaseSize() {
        return this.f9956v0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.A0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.A0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.f9957w0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public pj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float L2 = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float scale2 = getScale() * getMeasuredWidth();
        getMeasuredHeight();
        getScale();
        org.telegram.messenger.i0.L(64.0f);
        float x10 = a30.x(L, 2.0f, getPositionX(), scaleX);
        return new pj0(x10, a30.x(L2, 2.0f, getPositionY(), scaleX), ((((org.telegram.messenger.i0.L(64.0f) / scaleX) + scale2) * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public final void k() {
        qu0 qu0Var = this.f9956v0;
        float f7 = qu0Var.f29808a / 2.0f;
        float f10 = qu0Var.f29809b / 2.0f;
        ze zeVar = this.G0;
        if (zeVar != null) {
            f7 *= zeVar.e;
            f10 *= zeVar.f19695f;
        }
        setX(getPositionX() - f7);
        setY(getPositionY() - f10);
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
    public final void onMeasure(int i10, int i11) {
        qu0 qu0Var = this.f9956v0;
        float f7 = qu0Var.f29808a;
        float f10 = qu0Var.f29809b;
        ze zeVar = this.G0;
        if (zeVar != null) {
            f7 *= zeVar.e;
            f10 *= zeVar.f19695f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f7, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824));
    }

    public final String q(int i10) {
        TLObject tLObject = this.f9951q0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w9 = b8.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                b8.G(i10);
                return b8.K(w9, null, true, true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f9952r0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f9954t0;
        this.f9954t0 = z11;
        if (!z10) {
            this.f9955u0.f(z11, true);
        }
        l0 l0Var = this.f9960z0;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.C0 && !this.B0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            ea.b bVar = new ea.b();
            bVar.f6459a = true;
            zzd a2 = w7.a(new tb.d(bVar));
            this.B0 = true;
            a2.g(ob.a.a(bitmap, this.f9957w0)).addOnSuccessListener(new ig.c0(this, 13)).addOnFailureListener(new ag.m(15, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f9958x0;
        this.f9958x0 = z11;
        if (!z10) {
            this.f9959y0.f(z11, true);
        }
        l0 l0Var = this.f9960z0;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    public e2(Context context, PointF pointF, qu0 qu0Var, TLObject tLObject) {
        super(context, pointF);
        this.f9953s0 = -1;
        this.f9954t0 = false;
        this.f9958x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f9951q0 = tLObject;
        this.f9956v0 = qu0Var;
        l0 l0Var = new l0(this, context);
        this.f9960z0 = l0Var;
        addView(l0Var, b6.c(-1.0f, -1));
        gr grVar = gr.h;
        this.f9955u0 = new t5(l0Var, 0L, 500L, grVar);
        this.f9959y0 = new t5(l0Var, 0L, 350L, grVar);
        k();
    }
}
