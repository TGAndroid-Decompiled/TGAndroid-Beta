package bg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import i7.f6;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xi0;
public class v3 extends k {
    public final TLRPC.Document m0;
    public final Object f2577n0;
    public final int f2578o0;
    public boolean f2579p0;
    public final d6 f2580q0;
    public final bv0 f2581r0;
    public final x2 f2582s0;
    public final ImageReceiver f2583t0;

    public v3(Context context, PointF pointF, float f9, float f10, bv0 bv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f2578o0 = -1;
        int i10 = 0;
        this.f2579p0 = false;
        this.f2583t0 = new ImageReceiver();
        setRotation(f9);
        setScale(f10);
        this.m0 = document;
        this.f2581r0 = bv0Var;
        this.f2577n0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f2578o0 = tL_maskCoords.f22467n;
                }
            } else {
                i10++;
            }
        }
        x2 x2Var = new x2(this, context);
        this.f2582s0 = x2Var;
        addView(x2Var, f6.c(-1.0f, -1));
        this.f2580q0 = new d6(x2Var, 0L, 500L, jr.h);
        this.f2583t0.setAspectFit(true);
        this.f2583t0.setInvalidateAll(true);
        this.f2583t0.setParentView(x2Var);
        this.f2583t0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f2583t0.setDelegate(new a1.c(this, 11));
        k();
    }

    @Override
    public final j a() {
        d3 d3Var = new d3(this, getContext(), 2);
        d3Var.f2162r = new RectF();
        return d3Var;
    }

    public int getAnchor() {
        return this.f2578o0;
    }

    public bv0 getBaseSize() {
        return this.f2581r0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f2583t0;
        xi0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.p();
        }
        c6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            return animation.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f2577n0;
    }

    @Override
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f9 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new hk0((getPositionX() - f9) * scaleX, (getPositionY() - f9) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.m0;
    }

    @Override
    public final void k() {
        bv0 bv0Var = this.f2581r0;
        setX(getPositionX() - (bv0Var.f27238a / 2.0f));
        setY(getPositionY() - (bv0Var.f27239b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2583t0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2583t0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bv0 bv0Var = this.f2581r0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) bv0Var.f27238a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) bv0Var.f27239b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f2579p0;
        this.f2579p0 = z11;
        if (!z10) {
            this.f2580q0.f(z11, true);
        }
        this.f2582s0.invalidate();
    }

    public v3(Context context, v3 v3Var, PointF pointF) {
        this(context, pointF, v3Var.getRotation(), v3Var.getScale(), v3Var.f2581r0, v3Var.m0, v3Var.f2577n0);
        if (v3Var.f2579p0) {
            r(false);
        }
    }

    public void q(xi0 xi0Var) {
    }
}
