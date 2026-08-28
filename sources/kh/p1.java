package kh;

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
public final class p1 extends View {
    public boolean f15816a;
    public final int f15817b;
    public org.telegram.ui.Components.k5 f15818c;
    public final q1 d;
    public ImageReceiver f15819e;
    public long f15820f;
    public final ImageReceiver.BackgroundThreadDrawHolder[] h;
    public ImageReceiver f15821n;
    public final org.telegram.ui.Components.pc f15822r;
    public boolean f15823s;

    public p1(Context context, q1 q1Var) {
        super(context);
        this.f15817b = UserConfig.selectedAccount;
        this.h = new ImageReceiver.BackgroundThreadDrawHolder[2];
        this.f15822r = new org.telegram.ui.Components.pc(this);
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.d = q1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j10;
        int i9;
        long j11 = this.f15820f;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f22386id;
        }
        if (j11 != j10) {
            org.telegram.ui.Components.k5 k5Var = this.f15818c;
            if (k5Var != null) {
                k5Var.o(this);
            }
            if (document != null) {
                int i10 = 1;
                this.f15816a = true;
                this.f15820f = document.f22386id;
                int i11 = n2.C;
                if (!z10) {
                    i10 = 16388;
                }
                if (LiteMode.isEnabled(i10)) {
                    i9 = 3;
                } else {
                    i9 = 13;
                }
                org.telegram.ui.Components.k5 m10 = org.telegram.ui.Components.k5.m(this.f15817b, i9, document);
                this.f15818c = m10;
                if (this.f15823s) {
                    m10.a(this);
                    return;
                }
                return;
            }
            this.f15816a = false;
            this.f15820f = 0L;
            this.f15818c = null;
        }
    }

    public float getScale() {
        return this.f15822r.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.d.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15823s = true;
        org.telegram.ui.Components.k5 k5Var = this.f15818c;
        if (k5Var != null) {
            k5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f15819e;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15823s = false;
        org.telegram.ui.Components.k5 k5Var = this.f15818c;
        if (k5Var != null) {
            k5Var.o(this);
        }
        ImageReceiver imageReceiver = this.f15819e;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f15819e;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f15819e.draw(canvas);
            return;
        }
        org.telegram.ui.Components.k5 k5Var = this.f15818c;
        if (k5Var != null) {
            k5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f15818c.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.k5 k5Var = this.f15818c;
        if (k5Var != null) {
            k5Var.o(this);
        }
        this.f15818c = null;
        this.f15820f = 0L;
        this.f15816a = false;
        if (this.f15819e == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.f15819e = imageReceiver;
            imageReceiver.setLayerNum(7);
            this.f15819e.setAspectFit(true);
            if (this.f15823s) {
                this.f15819e.onAttachedToWindow();
            }
        }
        this.f15819e.setImageBitmap(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f15822r.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f15816a = false;
        if (document != null) {
            long j10 = this.f15820f;
            long j11 = document.f22386id;
            if (j10 != j11) {
                this.f15820f = j11;
                if (this.f15819e == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    this.f15819e = imageReceiver;
                    imageReceiver.setLayerNum(7);
                    this.f15819e.setAspectFit(true);
                    if (this.f15823s) {
                        this.f15819e.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver2 = this.f15819e;
                if (!this.f15816a) {
                    view = this;
                } else {
                    view = this.d;
                }
                imageReceiver2.setParentView(view);
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if ("video/webm".equals(document.mime_type)) {
                    str = "80_80_g";
                } else {
                    str = "80_80";
                }
                if (!LiteMode.isEnabled(1)) {
                    str = str.concat("_firstframe");
                }
                this.f15819e.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver3 = this.f15819e;
        if (imageReceiver3 != null) {
            this.f15820f = 0L;
            imageReceiver3.clearImage();
        }
    }
}
