package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class w3b extends h44 {
    public final TLRPC.Document s0;
    public final Object t0;
    public final int u0;
    public boolean v0;
    public final mm w0;
    public final qma x0;
    public final d26 y0;
    public final ImageReceiver z0;

    public w3b(Context context, PointF pointF, float f, float f2, qma qmaVar, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.u0 = -1;
        this.v0 = false;
        this.z0 = new ImageReceiver(null);
        setRotation(f);
        setScale(f2);
        this.s0 = document;
        this.x0 = qmaVar;
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
        d26 d26Var = new d26(this, context);
        this.y0 = d26Var;
        addView(d26Var, tre.c(-1.0f, -1));
        this.w0 = new mm(d26Var, 0L, 500L, k43.h);
        ImageReceiver imageReceiver = this.z0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.p0(d26Var);
        this.z0.b0(jn5.b(document), null, jn5.c(xb4.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.z0.h1 = new hja(this, (byte) 14);
        k();
    }

    @Override
    public final g44 a() {
        r39 r39Var = new r39(this, getContext(), (byte) 2);
        r39Var.r = new RectF();
        return r39Var;
    }

    public int getAnchor() {
        return this.u0;
    }

    public qma getBaseSize() {
        return this.x0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.z0;
        b29 y = imageReceiver.y();
        if (y != null) {
            return y.m();
        }
        lm m = imageReceiver.m();
        if (m != null) {
            return m.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.t0;
    }

    @Override
    public a69 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f = scale / 2.0f;
        float f2 = scale * scaleX;
        return new a69((getPositionX() - f) * scaleX, (getPositionY() - f) * scaleX, f2, f2);
    }

    public TLRPC.Document getSticker() {
        return this.s0;
    }

    @Override
    public final void k() {
        qma qmaVar = this.x0;
        setX(getPositionX() - (qmaVar.a / 2.0f));
        setY(getPositionY() - (qmaVar.b / 2.0f));
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
        qma qmaVar = this.x0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) qmaVar.a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) qmaVar.b, 1073741824));
    }

    public final void r(boolean z) {
        boolean z2 = !this.v0;
        this.v0 = z2;
        if (!z) {
            this.w0.f(z2, true);
        }
        this.y0.invalidate();
    }

    public void q(b29 b29Var) {
    }

    public w3b(Context context, w3b w3bVar, PointF pointF) {
        this(context, pointF, w3bVar.getRotation(), w3bVar.getScale(), w3bVar.x0, w3bVar.s0, w3bVar.t0);
        if (w3bVar.v0) {
            r(false);
        }
    }
}
