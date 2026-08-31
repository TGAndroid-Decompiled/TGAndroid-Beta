package eg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import k7.c6;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.z5;
public class p3 extends j {
    public final TLRPC.Document f5432n0;
    public final Object f5433o0;
    public final int f5434p0;
    public boolean f5435q0;
    public final z5 f5436r0;
    public final kv0 f5437s0;
    public final s2 f5438t0;
    public final ImageReceiver f5439u0;

    public p3(Context context, PointF pointF, float f10, float f11, kv0 kv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f5434p0 = -1;
        int i10 = 0;
        this.f5435q0 = false;
        this.f5439u0 = new ImageReceiver();
        setRotation(f10);
        setScale(f11);
        this.f5432n0 = document;
        this.f5437s0 = kv0Var;
        this.f5433o0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f5434p0 = tL_maskCoords.f20918n;
                }
            } else {
                i10++;
            }
        }
        s2 s2Var = new s2(this, context);
        this.f5438t0 = s2Var;
        addView(s2Var, c6.c(-1.0f, -1));
        this.f5436r0 = new z5(s2Var, 0L, 500L, pr.h);
        this.f5439u0.setAspectFit(true);
        this.f5439u0.setInvalidateAll(true);
        this.f5439u0.setParentView(s2Var);
        this.f5439u0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f5439u0.setDelegate(new a1.c(this, 24));
        k();
    }

    @Override
    public final i a() {
        x2 x2Var = new x2(this, getContext(), 2);
        x2Var.f5546r = new RectF();
        return x2Var;
    }

    public int getAnchor() {
        return this.f5434p0;
    }

    public kv0 getBaseSize() {
        return this.f5437s0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f5439u0;
        ij0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        return this.f5433o0;
    }

    @Override
    public tk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new tk0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.f5432n0;
    }

    @Override
    public final void k() {
        kv0 kv0Var = this.f5437s0;
        setX(getPositionX() - (kv0Var.f28463a / 2.0f));
        setY(getPositionY() - (kv0Var.f28464b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5439u0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5439u0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        kv0 kv0Var = this.f5437s0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) kv0Var.f28463a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) kv0Var.f28464b, 1073741824));
    }

    public final void r(boolean z4) {
        boolean z10 = !this.f5435q0;
        this.f5435q0 = z10;
        if (!z4) {
            this.f5436r0.f(z10, true);
        }
        this.f5438t0.invalidate();
    }

    public p3(Context context, p3 p3Var, PointF pointF) {
        this(context, pointF, p3Var.getRotation(), p3Var.getScale(), p3Var.f5437s0, p3Var.f5432n0, p3Var.f5433o0);
        if (p3Var.f5435q0) {
            r(false);
        }
    }

    public void q(ij0 ij0Var) {
    }
}
