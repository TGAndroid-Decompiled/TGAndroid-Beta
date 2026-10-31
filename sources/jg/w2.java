package jg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.ic;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.t5;
import w7.b6;
public class w2 extends j {
    public final TLRPC.Document f10343q0;
    public final Object f10344r0;
    public final int f10345s0;
    public boolean f10346t0;
    public final t5 f10347u0;
    public final pu0 f10348v0;
    public final l0 f10349w0;
    public final ImageReceiver f10350x0;

    public w2(Context context, PointF pointF, float f7, float f10, pu0 pu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f10345s0 = -1;
        this.f10346t0 = false;
        this.f10350x0 = new ImageReceiver(null);
        setRotation(f7);
        setScale(f10);
        this.f10343q0 = document;
        this.f10348v0 = pu0Var;
        this.f10344r0 = obj;
        int i10 = 0;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f10345s0 = tL_maskCoords.f19868n;
                }
            } else {
                i10++;
            }
        }
        l0 l0Var = new l0(this, context);
        this.f10349w0 = l0Var;
        addView(l0Var, b6.c(-1.0f, -1));
        this.f10347u0 = new t5(l0Var, 0L, 500L, gr.h);
        ImageReceiver imageReceiver = this.f10350x0;
        imageReceiver.R0 = true;
        imageReceiver.J0 = true;
        imageReceiver.H0(l0Var);
        this.f10350x0.t0(ic.b(document), null, ic.c(b8.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.f10350x0.f14382g1 = new ig.c0(this, 16);
        k();
    }

    @Override
    public final i a() {
        g2 g2Var = new g2(this, getContext(), 2);
        g2Var.f9982r = new RectF();
        return g2Var;
    }

    public int getAnchor() {
        return this.f10345s0;
    }

    public pu0 getBaseSize() {
        return this.f10348v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f10350x0;
        bi0 B = imageReceiver.B();
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
        return this.f10344r0;
    }

    @Override
    public oj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new oj0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f10343q0;
    }

    @Override
    public final void k() {
        pu0 pu0Var = this.f10348v0;
        setX(getPositionX() - (pu0Var.f29435a / 2.0f));
        setY(getPositionY() - (pu0Var.f29436b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10350x0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10350x0.R();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        pu0 pu0Var = this.f10348v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) pu0Var.f29435a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) pu0Var.f29436b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f10346t0;
        this.f10346t0 = z11;
        if (!z10) {
            this.f10347u0.f(z11, true);
        }
        this.f10349w0.invalidate();
    }

    public void q(bi0 bi0Var) {
    }

    public w2(Context context, w2 w2Var, PointF pointF) {
        this(context, pointF, w2Var.getRotation(), w2Var.getScale(), w2Var.f10348v0, w2Var.f10343q0, w2Var.f10344r0);
        if (w2Var.f10346t0) {
            r(false);
        }
    }
}
