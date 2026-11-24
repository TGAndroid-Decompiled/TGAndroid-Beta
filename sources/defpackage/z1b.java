package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class z1b extends w44 {
    public final TLRPC.Document s0;
    public final Object t0;
    public final int u0;
    public boolean v0;
    public final ln w0;
    public final xka x0;
    public final ne6 y0;
    public final ImageReceiver z0;

    public z1b(Context context, PointF pointF, float f, float f2, xka xkaVar, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.u0 = -1;
        this.v0 = false;
        this.z0 = new ImageReceiver(null);
        setRotation(f);
        setScale(f2);
        this.s0 = document;
        this.x0 = xkaVar;
        this.t0 = obj;
        int i = 0;
        while (true) {
            if (i >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.u0 = tL_maskCoords.n;
                }
            } else {
                i++;
            }
        }
        ne6 ne6Var = new ne6(this, context);
        this.y0 = ne6Var;
        addView(ne6Var, qoe.c(-1.0f, -1));
        this.w0 = new ln(ne6Var, 0L, 500L, d53.h);
        ImageReceiver imageReceiver = this.z0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.p0(ne6Var);
        this.z0.b0(gn5.b(document), null, gn5.c(bc4.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.z0.h1 = new wta(this, (byte) 5);
        k();
    }

    @Override
    public final v44 a() {
        f29 f29Var = new f29(this, getContext(), (byte) 2);
        f29Var.r = new RectF();
        return f29Var;
    }

    public int getAnchor() {
        return this.u0;
    }

    public xka getBaseSize() {
        return this.x0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.z0;
        p09 y = imageReceiver.y();
        if (y != null) {
            return y.m();
        }
        kn m = imageReceiver.m();
        if (m != null) {
            return m.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.t0;
    }

    @Override
    public o49 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f = scale / 2.0f;
        float f2 = scale * scaleX;
        return new o49((getPositionX() - f) * scaleX, (getPositionY() - f) * scaleX, f2, f2);
    }

    public TLRPC.Document getSticker() {
        return this.s0;
    }

    @Override
    public final void k() {
        xka xkaVar = this.x0;
        setX(getPositionX() - (xkaVar.a / 2.0f));
        setY(getPositionY() - (xkaVar.b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z0.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z0.K();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        xka xkaVar = this.x0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) xkaVar.a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) xkaVar.b, 1073741824));
    }

    public final void r(boolean z) {
        boolean z2 = !this.v0;
        this.v0 = z2;
        if (!z) {
            this.w0.f(z2, true);
        }
        this.y0.invalidate();
    }

    public void q(p09 p09Var) {
    }

    public z1b(Context context, z1b z1bVar, PointF pointF) {
        this(context, pointF, z1bVar.getRotation(), z1bVar.getScale(), z1bVar.x0, z1bVar.s0, z1bVar.t0);
        if (z1bVar.v0) {
            r(false);
        }
    }
}
