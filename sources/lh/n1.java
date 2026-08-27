package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class n1 extends View {

    public boolean f16413a;

    public final int f16414b;

    public org.telegram.ui.Components.k5 f16415c;
    public final o1 d;

    public ImageReceiver f16416e;

    public long f16417f;
    public final ImageReceiver.BackgroundThreadDrawHolder[] h;

    public ImageReceiver f16418n;

    public final org.telegram.ui.Components.nc f16419r;

    public boolean f16420s;

    public n1(Context context, o1 o1Var) {
        super(context);
        this.f16414b = UserConfig.selectedAccount;
        this.h = new ImageReceiver.BackgroundThreadDrawHolder[2];
        this.f16419r = new org.telegram.ui.Components.nc(this);
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.d = o1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        if (this.f16417f == (document == null ? 0L : document.f22386id)) {
            return;
        }
        org.telegram.ui.Components.k5 k5Var = this.f16415c;
        if (k5Var != null) {
            k5Var.o(this);
        }
        if (document == null) {
            this.f16413a = false;
            this.f16417f = 0L;
            this.f16415c = null;
            return;
        }
        this.f16413a = true;
        this.f16417f = document.f22386id;
        int i10 = l2.C;
        org.telegram.ui.Components.k5 k5VarM = org.telegram.ui.Components.k5.m(this.f16414b, LiteMode.isEnabled(z10 ? 1 : 16388) ? 3 : 13, document);
        this.f16415c = k5VarM;
        if (this.f16420s) {
            k5VarM.a(this);
        }
    }

    public float getScale() {
        return this.f16419r.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.d.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16420s = true;
        org.telegram.ui.Components.k5 k5Var = this.f16415c;
        if (k5Var != null) {
            k5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f16416e;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16420s = false;
        org.telegram.ui.Components.k5 k5Var = this.f16415c;
        if (k5Var != null) {
            k5Var.o(this);
        }
        ImageReceiver imageReceiver = this.f16416e;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f16416e;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f16416e.draw(canvas);
            return;
        }
        org.telegram.ui.Components.k5 k5Var = this.f16415c;
        if (k5Var != null) {
            k5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f16415c.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.k5 k5Var = this.f16415c;
        if (k5Var != null) {
            k5Var.o(this);
        }
        this.f16415c = null;
        this.f16417f = 0L;
        this.f16413a = false;
        if (this.f16416e == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.f16416e = imageReceiver;
            imageReceiver.setLayerNum(7);
            this.f16416e.setAspectFit(true);
            if (this.f16420s) {
                this.f16416e.onAttachedToWindow();
            }
        }
        this.f16416e.setImageBitmap(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f16419r.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        this.f16413a = false;
        if (document == null) {
            ImageReceiver imageReceiver = this.f16416e;
            if (imageReceiver != null) {
                this.f16417f = 0L;
                imageReceiver.clearImage();
                return;
            }
            return;
        }
        long j10 = this.f16417f;
        long j11 = document.f22386id;
        if (j10 == j11) {
            return;
        }
        this.f16417f = j11;
        if (this.f16416e == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver();
            this.f16416e = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            this.f16416e.setAspectFit(true);
            if (this.f16420s) {
                this.f16416e.onAttachedToWindow();
            }
        }
        this.f16416e.setParentView(!this.f16413a ? this : this.d);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        String strConcat = "video/webm".equals(document.mime_type) ? "80_80_g" : "80_80";
        if (!LiteMode.isEnabled(1)) {
            strConcat = strConcat.concat("_firstframe");
        }
        this.f16416e.setImage(ImageLocation.getForDocument(document), strConcat, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80", null, 0L, null, document, 0);
    }
}
