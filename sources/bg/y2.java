package bg;

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
import i7.f6;
import nh.o7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jr;
public final class y2 extends k {
    public final Rect A0;
    public final Paint B0;
    public MediaController.CropState C0;
    public final TLObject m0;
    public final String f2617n0;
    public final int f2618o0;
    public boolean f2619p0;
    public final d6 f2620q0;
    public final bv0 f2621r0;
    public final int f2622s0;
    public boolean f2623t0;
    public final d6 f2624u0;
    public final x2 f2625v0;
    public final Bitmap f2626w0;
    public boolean f2627x0;
    public boolean f2628y0;
    public final Rect f2629z0;

    public y2(Context context, PointF pointF, bv0 bv0Var, String str, int i10) {
        super(context, pointF);
        this.f2618o0 = -1;
        this.f2619p0 = false;
        this.f2623t0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.f2629z0 = new Rect();
        this.A0 = new Rect();
        this.B0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f2617n0 = str;
        this.f2621r0 = bv0Var;
        x2 x2Var = new x2(this, context);
        this.f2625v0 = x2Var;
        addView(x2Var, f6.c(-1.0f, -1));
        jr jrVar = jr.h;
        this.f2620q0 = new d6(x2Var, 0L, 500L, jrVar);
        this.f2624u0 = new d6(x2Var, 0L, 350L, jrVar);
        this.f2622s0 = i10;
        Bitmap q6 = o7.q(new a1.c(str, 7), 1920, 1920, 0, false);
        this.f2626w0 = q6;
        if (q6 != null) {
            s(q6);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return com.google.android.recaptcha.internal.a.k(round, "_", round);
    }

    @Override
    public final j a() {
        return new j1(this, getContext());
    }

    public int getAnchor() {
        return this.f2618o0;
    }

    public bv0 getBaseSize() {
        return this.f2621r0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.f2626w0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.f2626w0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.f2622s0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float scale2 = getScale() * getMeasuredWidth();
        getMeasuredHeight();
        getScale();
        AndroidUtilities.dp(64.0f);
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        return new hk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((((AndroidUtilities.dp(64.0f) / scaleX) + scale2) * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override
    public final void k() {
        bv0 bv0Var = this.f2621r0;
        float f9 = bv0Var.f27238a / 2.0f;
        float f10 = bv0Var.f27239b / 2.0f;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f9 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        setX(getPositionX() - f9);
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
        bv0 bv0Var = this.f2621r0;
        float f9 = bv0Var.f27238a;
        float f10 = bv0Var.f27239b;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f9 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f9, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824));
    }

    public final String q(int i10) {
        TLObject tLObject = this.m0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f2617n0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f2619p0;
        this.f2619p0 = z11;
        if (!z10) {
            this.f2620q0.f(z11, true);
        }
        x2 x2Var = this.f2625v0;
        if (x2Var != null) {
            x2Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.f2628y0 && !this.f2627x0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            kb.d dVar = new kb.d();
            dVar.f13606a = true;
            zzd a2 = i7.g.a(new kb.e(dVar));
            this.f2627x0 = true;
            a2.g(fb.a.a(bitmap, this.f2622s0)).addOnSuccessListener(new a1.c(this, 8)).addOnFailureListener(new a9.s(1, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f2623t0;
        this.f2623t0 = z11;
        if (!z10) {
            this.f2624u0.f(z11, true);
        }
        x2 x2Var = this.f2625v0;
        if (x2Var != null) {
            x2Var.invalidate();
        }
    }

    public y2(Context context, PointF pointF, bv0 bv0Var, TLObject tLObject) {
        super(context, pointF);
        this.f2618o0 = -1;
        this.f2619p0 = false;
        this.f2623t0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.f2629z0 = new Rect();
        this.A0 = new Rect();
        this.B0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.m0 = tLObject;
        this.f2621r0 = bv0Var;
        x2 x2Var = new x2(this, context);
        this.f2625v0 = x2Var;
        addView(x2Var, f6.c(-1.0f, -1));
        jr jrVar = jr.h;
        this.f2620q0 = new d6(x2Var, 0L, 500L, jrVar);
        this.f2624u0 = new d6(x2Var, 0L, 350L, jrVar);
        k();
    }
}
