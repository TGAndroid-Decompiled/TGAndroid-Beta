package nh;

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
import org.telegram.ui.Components.uc;
public final class m1 extends View {
    public boolean f18114a;
    public final int f18115b;
    public org.telegram.ui.Components.p5 f18116c;
    public final n1 d;
    public ImageReceiver f18117e;
    public long f18118f;
    public final ImageReceiver.BackgroundThreadDrawHolder[] h;
    public ImageReceiver f18119n;
    public final uc f18120r;
    public boolean f18121s;

    public m1(Context context, n1 n1Var) {
        super(context);
        this.f18115b = UserConfig.selectedAccount;
        this.h = new ImageReceiver.BackgroundThreadDrawHolder[2];
        this.f18120r = new uc(this);
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.d = n1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j10;
        int i10;
        long j11 = this.f18118f;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f22398id;
        }
        if (j11 != j10) {
            org.telegram.ui.Components.p5 p5Var = this.f18116c;
            if (p5Var != null) {
                p5Var.o(this);
            }
            if (document != null) {
                int i11 = 1;
                this.f18114a = true;
                this.f18118f = document.f22398id;
                int i12 = k2.C;
                if (!z10) {
                    i11 = 16388;
                }
                if (LiteMode.isEnabled(i11)) {
                    i10 = 3;
                } else {
                    i10 = 13;
                }
                org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(this.f18115b, i10, document);
                this.f18116c = m10;
                if (this.f18121s) {
                    m10.a(this);
                    return;
                }
                return;
            }
            this.f18114a = false;
            this.f18118f = 0L;
            this.f18116c = null;
        }
    }

    public float getScale() {
        return this.f18120r.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.d.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18121s = true;
        org.telegram.ui.Components.p5 p5Var = this.f18116c;
        if (p5Var != null) {
            p5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f18117e;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18121s = false;
        org.telegram.ui.Components.p5 p5Var = this.f18116c;
        if (p5Var != null) {
            p5Var.o(this);
        }
        ImageReceiver imageReceiver = this.f18117e;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f18117e;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f18117e.draw(canvas);
            return;
        }
        org.telegram.ui.Components.p5 p5Var = this.f18116c;
        if (p5Var != null) {
            p5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f18116c.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.p5 p5Var = this.f18116c;
        if (p5Var != null) {
            p5Var.o(this);
        }
        this.f18116c = null;
        this.f18118f = 0L;
        this.f18114a = false;
        if (this.f18117e == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.f18117e = imageReceiver;
            imageReceiver.setLayerNum(7);
            this.f18117e.setAspectFit(true);
            if (this.f18121s) {
                this.f18117e.onAttachedToWindow();
            }
        }
        this.f18117e.setImageBitmap(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f18120r.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f18114a = false;
        if (document != null) {
            long j10 = this.f18118f;
            long j11 = document.f22398id;
            if (j10 != j11) {
                this.f18118f = j11;
                if (this.f18117e == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    this.f18117e = imageReceiver;
                    imageReceiver.setLayerNum(7);
                    this.f18117e.setAspectFit(true);
                    if (this.f18121s) {
                        this.f18117e.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver2 = this.f18117e;
                if (!this.f18114a) {
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
                this.f18117e.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver3 = this.f18117e;
        if (imageReceiver3 != null) {
            this.f18118f = 0L;
            imageReceiver3.clearImage();
        }
    }
}
