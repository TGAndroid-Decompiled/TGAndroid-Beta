package dg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import k7.b6;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.z5;
public class r3 extends j {
    public final TLRPC.Document f4776n0;
    public final Object f4777o0;
    public final int f4778p0;
    public boolean f4779q0;
    public final z5 f4780r0;
    public final jv0 f4781s0;
    public final u2 f4782t0;
    public final ImageReceiver f4783u0;

    public r3(Context context, PointF pointF, float f10, float f11, jv0 jv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f4778p0 = -1;
        int i10 = 0;
        this.f4779q0 = false;
        this.f4783u0 = new ImageReceiver();
        setRotation(f10);
        setScale(f11);
        this.f4776n0 = document;
        this.f4781s0 = jv0Var;
        this.f4777o0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f4778p0 = tL_maskCoords.f19234n;
                }
            } else {
                i10++;
            }
        }
        u2 u2Var = new u2(this, context);
        this.f4782t0 = u2Var;
        addView(u2Var, b6.c(-1.0f, -1));
        this.f4780r0 = new z5(u2Var, 0L, 500L, mr.h);
        this.f4783u0.setAspectFit(true);
        this.f4783u0.setInvalidateAll(true);
        this.f4783u0.setParentView(u2Var);
        this.f4783u0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f4783u0.setDelegate(new a1.c(this, 19));
        k();
    }

    @Override
    public final i a() {
        z2 z2Var = new z2(this, getContext(), 2);
        z2Var.f4884r = new RectF();
        return z2Var;
    }

    public int getAnchor() {
        return this.f4778p0;
    }

    public jv0 getBaseSize() {
        return this.f4781s0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f4783u0;
        gj0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.p();
        }
        y5 animation = imageReceiver.getAnimation();
        if (animation != null) {
            return animation.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f4777o0;
    }

    @Override
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new rk0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.f4776n0;
    }

    @Override
    public final void k() {
        jv0 jv0Var = this.f4781s0;
        setX(getPositionX() - (jv0Var.f26062a / 2.0f));
        setY(getPositionY() - (jv0Var.f26063b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4783u0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4783u0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        jv0 jv0Var = this.f4781s0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) jv0Var.f26062a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) jv0Var.f26063b, 1073741824));
    }

    public final void r(boolean z4) {
        boolean z10 = !this.f4779q0;
        this.f4779q0 = z10;
        if (!z4) {
            this.f4780r0.f(z10, true);
        }
        this.f4782t0.invalidate();
    }

    public r3(Context context, r3 r3Var, PointF pointF) {
        this(context, pointF, r3Var.getRotation(), r3Var.getScale(), r3Var.f4781s0, r3Var.f4776n0, r3Var.f4777o0);
        if (r3Var.f4779q0) {
            r(false);
        }
    }

    public void q(gj0 gj0Var) {
    }
}
