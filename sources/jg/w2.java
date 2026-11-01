package jg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.jc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.t5;
import w7.b6;
public class w2 extends j {
    public final TLRPC.Document f10344q0;
    public final Object f10345r0;
    public final int f10346s0;
    public boolean f10347t0;
    public final t5 f10348u0;
    public final qu0 f10349v0;
    public final l0 f10350w0;
    public final ImageReceiver f10351x0;

    public w2(Context context, PointF pointF, float f7, float f10, qu0 qu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f10346s0 = -1;
        this.f10347t0 = false;
        this.f10351x0 = new ImageReceiver(null);
        setRotation(f7);
        setScale(f10);
        this.f10344q0 = document;
        this.f10349v0 = qu0Var;
        this.f10345r0 = obj;
        int i10 = 0;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f10346s0 = tL_maskCoords.f19869n;
                }
            } else {
                i10++;
            }
        }
        l0 l0Var = new l0(this, context);
        this.f10350w0 = l0Var;
        addView(l0Var, b6.c(-1.0f, -1));
        this.f10348u0 = new t5(l0Var, 0L, 500L, gr.h);
        ImageReceiver imageReceiver = this.f10351x0;
        imageReceiver.R0 = true;
        imageReceiver.J0 = true;
        imageReceiver.H0(l0Var);
        this.f10351x0.t0(jc.b(document), null, jc.c(b8.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.f10351x0.f14383g1 = new ig.c0(this, 16);
        k();
    }

    @Override
    public final i a() {
        g2 g2Var = new g2(this, getContext(), 2);
        g2Var.f9983r = new RectF();
        return g2Var;
    }

    public int getAnchor() {
        return this.f10346s0;
    }

    public qu0 getBaseSize() {
        return this.f10349v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f10351x0;
        ci0 B = imageReceiver.B();
        if (B != null) {
            return B.r();
        }
        s5 m10 = imageReceiver.m();
        if (m10 != null) {
            return m10.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f10345r0;
    }

    @Override
    public pj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new pj0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f10344q0;
    }

    @Override
    public final void k() {
        qu0 qu0Var = this.f10349v0;
        setX(getPositionX() - (qu0Var.f29808a / 2.0f));
        setY(getPositionY() - (qu0Var.f29809b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10351x0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10351x0.R();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qu0 qu0Var = this.f10349v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) qu0Var.f29808a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) qu0Var.f29809b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f10347t0;
        this.f10347t0 = z11;
        if (!z10) {
            this.f10348u0.f(z11, true);
        }
        this.f10350w0.invalidate();
    }

    public void q(ci0 ci0Var) {
    }

    public w2(Context context, w2 w2Var, PointF pointF) {
        this(context, pointF, w2Var.getRotation(), w2Var.getScale(), w2Var.f10349v0, w2Var.f10344q0, w2Var.f10345r0);
        if (w2Var.f10347t0) {
            r(false);
        }
    }
}
