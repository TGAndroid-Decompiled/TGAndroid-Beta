package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class yza extends l34 {
    public final TLRPC.Document s0;
    public final Object t0;
    public final int u0;
    public boolean v0;
    public final lm w0;
    public final via x0;
    public final oc6 y0;
    public final ImageReceiver z0;

    public yza(Context context, PointF pointF, float f, float f2, via viaVar, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.u0 = -1;
        this.v0 = false;
        this.z0 = new ImageReceiver(null);
        setRotation(f);
        setScale(f2);
        this.s0 = document;
        this.x0 = viaVar;
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
        oc6 oc6Var = new oc6(this, context);
        this.y0 = oc6Var;
        addView(oc6Var, nme.c(-1.0f, -1));
        this.w0 = new lm(oc6Var, 0L, 500L, s33.h);
        ImageReceiver imageReceiver = this.z0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.p0(oc6Var);
        this.z0.b0(gl5.b(document), null, gl5.c(ba4.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.z0.h1 = new hza(this, (byte) 1);
        k();
    }

    @Override
    public final k34 a() {
        d09 d09Var = new d09(this, getContext(), (byte) 2);
        d09Var.r = new RectF();
        return d09Var;
    }

    public int getAnchor() {
        return this.u0;
    }

    public via getBaseSize() {
        return this.x0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.z0;
        oy8 y = imageReceiver.y();
        if (y != null) {
            return y.m();
        }
        km m = imageReceiver.m();
        if (m != null) {
            return m.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.t0;
    }

    @Override
    public l29 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f = scale / 2.0f;
        float f2 = scale * scaleX;
        return new l29((getPositionX() - f) * scaleX, (getPositionY() - f) * scaleX, f2, f2);
    }

    public TLRPC.Document getSticker() {
        return this.s0;
    }

    @Override
    public final void k() {
        via viaVar = this.x0;
        setX(getPositionX() - (viaVar.a / 2.0f));
        setY(getPositionY() - (viaVar.b / 2.0f));
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
        via viaVar = this.x0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) viaVar.a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) viaVar.b, 1073741824));
    }

    public final void r(boolean z) {
        boolean z2 = !this.v0;
        this.v0 = z2;
        if (!z) {
            this.w0.f(z2, true);
        }
        this.y0.invalidate();
    }

    public void q(oy8 oy8Var) {
    }

    public yza(Context context, yza yzaVar, PointF pointF) {
        this(context, pointF, yzaVar.getRotation(), yzaVar.getScale(), yzaVar.x0, yzaVar.s0, yzaVar.t0);
        if (yzaVar.v0) {
            r(false);
        }
    }
}
