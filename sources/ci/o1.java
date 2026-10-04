package ci;

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
public final class o1 extends View {
    public boolean f5641a;
    public final int f5642b;
    public org.telegram.ui.Components.q5 f5643c;
    public final p1 d;
    public ImageReceiver f5644e;
    public long f5645f;
    public final ImageReceiver.BackgroundThreadDrawHolder[] h;
    public ImageReceiver f5646n;
    public final org.telegram.ui.Components.zc f5647r;
    public boolean f5648s;

    public o1(Context context, p1 p1Var) {
        super(context);
        this.f5642b = UserConfig.selectedAccount;
        this.h = new ImageReceiver.BackgroundThreadDrawHolder[2];
        this.f5647r = new org.telegram.ui.Components.zc(this);
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.d = p1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j3;
        int i10;
        long j10 = this.f5645f;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20048id;
        }
        if (j10 != j3) {
            org.telegram.ui.Components.q5 q5Var = this.f5643c;
            if (q5Var != null) {
                q5Var.o(this);
            }
            if (document != null) {
                int i11 = 1;
                this.f5641a = true;
                this.f5645f = document.f20048id;
                int i12 = s2.G;
                if (!z10) {
                    i11 = 16388;
                }
                if (LiteMode.isEnabled(i11)) {
                    i10 = 3;
                } else {
                    i10 = 13;
                }
                org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(this.f5642b, i10, document);
                this.f5643c = m10;
                if (this.f5648s) {
                    m10.a(this);
                    return;
                }
                return;
            }
            this.f5641a = false;
            this.f5645f = 0L;
            this.f5643c = null;
        }
    }

    public float getScale() {
        return this.f5647r.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.d.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5648s = true;
        org.telegram.ui.Components.q5 q5Var = this.f5643c;
        if (q5Var != null) {
            q5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f5644e;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5648s = false;
        org.telegram.ui.Components.q5 q5Var = this.f5643c;
        if (q5Var != null) {
            q5Var.o(this);
        }
        ImageReceiver imageReceiver = this.f5644e;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f5644e;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f5644e.draw(canvas);
            return;
        }
        org.telegram.ui.Components.q5 q5Var = this.f5643c;
        if (q5Var != null) {
            q5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f5643c.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.q5 q5Var = this.f5643c;
        if (q5Var != null) {
            q5Var.o(this);
        }
        this.f5643c = null;
        this.f5645f = 0L;
        this.f5641a = false;
        if (this.f5644e == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.f5644e = imageReceiver;
            imageReceiver.setLayerNum(7);
            this.f5644e.setAspectFit(true);
            if (this.f5648s) {
                this.f5644e.onAttachedToWindow();
            }
        }
        this.f5644e.setImageBitmap(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f5647r.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f5641a = false;
        if (document != null) {
            long j3 = this.f5645f;
            long j10 = document.f20048id;
            if (j3 != j10) {
                this.f5645f = j10;
                if (this.f5644e == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    this.f5644e = imageReceiver;
                    imageReceiver.setLayerNum(7);
                    this.f5644e.setAspectFit(true);
                    if (this.f5648s) {
                        this.f5644e.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver2 = this.f5644e;
                if (!this.f5641a) {
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
                this.f5644e.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver3 = this.f5644e;
        if (imageReceiver3 != null) {
            this.f5645f = 0L;
            imageReceiver3.clearImage();
        }
    }
}
