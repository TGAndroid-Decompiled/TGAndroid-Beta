package ei;

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
import org.telegram.ui.Components.yc;
public final class n1 extends View {
    public boolean f9493a;
    public final int f9494b;
    public org.telegram.ui.Components.r5 f9495c;
    public final o1 d;
    public ImageReceiver e;
    public long f9496f;
    public final ImageReceiver.BackgroundThreadDrawHolder[] h;
    public ImageReceiver f9497n;
    public final yc f9498r;
    public boolean f9499s;

    public n1(Context context, o1 o1Var) {
        super(context);
        this.f9494b = UserConfig.selectedAccount;
        this.h = new ImageReceiver.BackgroundThreadDrawHolder[2];
        this.f9498r = new yc(this);
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.d = o1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j10;
        int i10;
        long j11 = this.f9496f;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f20278id;
        }
        if (j11 != j10) {
            org.telegram.ui.Components.r5 r5Var = this.f9495c;
            if (r5Var != null) {
                r5Var.o(this);
            }
            if (document != null) {
                int i11 = 1;
                this.f9493a = true;
                this.f9496f = document.f20278id;
                int i12 = n2.G;
                if (!z10) {
                    i11 = 16388;
                }
                if (LiteMode.isEnabled(i11)) {
                    i10 = 3;
                } else {
                    i10 = 13;
                }
                org.telegram.ui.Components.r5 m10 = org.telegram.ui.Components.r5.m(this.f9494b, i10, document);
                this.f9495c = m10;
                if (this.f9499s) {
                    m10.a(this);
                    return;
                }
                return;
            }
            this.f9493a = false;
            this.f9496f = 0L;
            this.f9495c = null;
        }
    }

    public float getScale() {
        return this.f9498r.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.d.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9499s = true;
        org.telegram.ui.Components.r5 r5Var = this.f9495c;
        if (r5Var != null) {
            r5Var.a(this);
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9499s = false;
        org.telegram.ui.Components.r5 r5Var = this.f9495c;
        if (r5Var != null) {
            r5Var.o(this);
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.e.draw(canvas);
            return;
        }
        org.telegram.ui.Components.r5 r5Var = this.f9495c;
        if (r5Var != null) {
            r5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f9495c.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.r5 r5Var = this.f9495c;
        if (r5Var != null) {
            r5Var.o(this);
        }
        this.f9495c = null;
        this.f9496f = 0L;
        this.f9493a = false;
        if (this.e == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.e = imageReceiver;
            imageReceiver.setLayerNum(7);
            this.e.setAspectFit(true);
            if (this.f9499s) {
                this.e.onAttachedToWindow();
            }
        }
        this.e.setImageBitmap(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f9498r.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f9493a = false;
        if (document != null) {
            long j10 = this.f9496f;
            long j11 = document.f20278id;
            if (j10 != j11) {
                this.f9496f = j11;
                if (this.e == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    this.e = imageReceiver;
                    imageReceiver.setLayerNum(7);
                    this.e.setAspectFit(true);
                    if (this.f9499s) {
                        this.e.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver2 = this.e;
                if (!this.f9493a) {
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
                this.e.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver3 = this.e;
        if (imageReceiver3 != null) {
            this.f9496f = 0L;
            imageReceiver3.clearImage();
        }
    }
}
