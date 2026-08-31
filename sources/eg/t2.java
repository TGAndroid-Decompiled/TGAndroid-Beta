package eg;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.z5;
import qh.s6;
public final class t2 extends j {
    public final Rect A0;
    public final Rect B0;
    public final Paint C0;
    public MediaController.CropState D0;
    public final TLObject f5482n0;
    public final String f5483o0;
    public final int f5484p0;
    public boolean f5485q0;
    public final z5 f5486r0;
    public final kv0 f5487s0;
    public final int f5488t0;
    public boolean f5489u0;
    public final z5 f5490v0;
    public final s2 f5491w0;
    public final Bitmap f5492x0;
    public boolean f5493y0;
    public boolean f5494z0;

    public t2(Context context, PointF pointF, kv0 kv0Var, String str, int i10) {
        super(context, pointF);
        this.f5484p0 = -1;
        this.f5485q0 = false;
        this.f5489u0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.A0 = new Rect();
        this.B0 = new Rect();
        this.C0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f5483o0 = str;
        this.f5487s0 = kv0Var;
        s2 s2Var = new s2(this, context);
        this.f5491w0 = s2Var;
        addView(s2Var, c6.c(-1.0f, -1));
        pr prVar = pr.h;
        this.f5486r0 = new z5(s2Var, 0L, 500L, prVar);
        this.f5490v0 = new z5(s2Var, 0L, 350L, prVar);
        this.f5488t0 = i10;
        Bitmap q10 = s6.q(new a1.c(str, 20), 1920, 1920, 0, false);
        this.f5492x0 = q10;
        if (q10 != null) {
            s(q10);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return e2.c.h(round, "_", round);
    }

    @Override
    public final i a() {
        return new f1(this, getContext());
    }

    public int getAnchor() {
        return this.f5484p0;
    }

    public kv0 getBaseSize() {
        return this.f5487s0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.f5492x0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.f5492x0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.f5488t0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public tk0 getSelectionBounds() {
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
        return new tk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((((AndroidUtilities.dp(64.0f) / scaleX) + scale2) * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override
    public final void k() {
        kv0 kv0Var = this.f5487s0;
        float f10 = kv0Var.f28463a / 2.0f;
        float f11 = kv0Var.f28464b / 2.0f;
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            f10 *= cropState.cropPw;
            f11 *= cropState.cropPh;
        }
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
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
        kv0 kv0Var = this.f5487s0;
        float f10 = kv0Var.f28463a;
        float f11 = kv0Var.f28464b;
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            f10 *= cropState.cropPw;
            f11 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824));
    }

    public final String q(int i10) {
        TLObject tLObject = this.f5482n0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f5483o0;
    }

    public final void r(boolean z4) {
        boolean z10 = !this.f5485q0;
        this.f5485q0 = z10;
        if (!z4) {
            this.f5486r0.f(z10, true);
        }
        s2 s2Var = this.f5491w0;
        if (s2Var != null) {
            s2Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.f5494z0 && !this.f5493y0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            mb.d dVar = new mb.d();
            dVar.f13622a = true;
            zzd a2 = k7.r.a(new mb.e(dVar));
            this.f5493y0 = true;
            a2.g(hb.a.a(bitmap, this.f5488t0)).addOnSuccessListener(new a1.c(this, 21)).addOnFailureListener(new c1.b(7, this, bitmap));
        }
    }

    public final void t(boolean z4) {
        boolean z10 = !this.f5489u0;
        this.f5489u0 = z10;
        if (!z4) {
            this.f5490v0.f(z10, true);
        }
        s2 s2Var = this.f5491w0;
        if (s2Var != null) {
            s2Var.invalidate();
        }
    }

    public t2(Context context, PointF pointF, kv0 kv0Var, TLObject tLObject) {
        super(context, pointF);
        this.f5484p0 = -1;
        this.f5485q0 = false;
        this.f5489u0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.A0 = new Rect();
        this.B0 = new Rect();
        this.C0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f5482n0 = tLObject;
        this.f5487s0 = kv0Var;
        s2 s2Var = new s2(this, context);
        this.f5491w0 = s2Var;
        addView(s2Var, c6.c(-1.0f, -1));
        pr prVar = pr.h;
        this.f5486r0 = new z5(s2Var, 0L, 500L, prVar);
        this.f5490v0 = new z5(s2Var, 0L, 350L, prVar);
        k();
    }
}
