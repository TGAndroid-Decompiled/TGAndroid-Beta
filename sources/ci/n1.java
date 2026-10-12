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
public final class n1 extends View {
    public boolean f5620a;
    public final int f5621b;
    public org.telegram.ui.Components.s5 f5622c;
    public final o1 d;
    public ImageReceiver f5623e;
    public long f5624f;
    public final ImageReceiver.BackgroundThreadDrawHolder[] h;
    public ImageReceiver f5625n;
    public final org.telegram.ui.Components.ad f5626r;
    public boolean f5627s;

    public n1(Context context, o1 o1Var) {
        super(context);
        this.f5621b = UserConfig.selectedAccount;
        this.h = new ImageReceiver.BackgroundThreadDrawHolder[2];
        this.f5626r = new org.telegram.ui.Components.ad(this);
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.d = o1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j3;
        int i10;
        long j10 = this.f5624f;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f19809id;
        }
        if (j10 != j3) {
            org.telegram.ui.Components.s5 s5Var = this.f5622c;
            if (s5Var != null) {
                s5Var.o(this);
            }
            if (document != null) {
                int i11 = 1;
                this.f5620a = true;
                this.f5624f = document.f19809id;
                int i12 = r2.G;
                if (!z10) {
                    i11 = 16388;
                }
                if (LiteMode.isEnabled(i11)) {
                    i10 = 3;
                } else {
                    i10 = 13;
                }
                org.telegram.ui.Components.s5 m10 = org.telegram.ui.Components.s5.m(this.f5621b, i10, document);
                this.f5622c = m10;
                if (this.f5627s) {
                    m10.a(this);
                    return;
                }
                return;
            }
            this.f5620a = false;
            this.f5624f = 0L;
            this.f5622c = null;
        }
    }

    public float getScale() {
        return this.f5626r.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.d.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5627s = true;
        org.telegram.ui.Components.s5 s5Var = this.f5622c;
        if (s5Var != null) {
            s5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f5623e;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5627s = false;
        org.telegram.ui.Components.s5 s5Var = this.f5622c;
        if (s5Var != null) {
            s5Var.o(this);
        }
        ImageReceiver imageReceiver = this.f5623e;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f5623e;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f5623e.draw(canvas);
            return;
        }
        org.telegram.ui.Components.s5 s5Var = this.f5622c;
        if (s5Var != null) {
            s5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f5622c.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.s5 s5Var = this.f5622c;
        if (s5Var != null) {
            s5Var.o(this);
        }
        this.f5622c = null;
        this.f5624f = 0L;
        this.f5620a = false;
        if (this.f5623e == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.f5623e = imageReceiver;
            imageReceiver.setLayerNum(7);
            this.f5623e.setAspectFit(true);
            if (this.f5627s) {
                this.f5623e.onAttachedToWindow();
            }
        }
        this.f5623e.setImageBitmap(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f5626r.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f5620a = false;
        if (document != null) {
            long j3 = this.f5624f;
            long j10 = document.f19809id;
            if (j3 != j10) {
                this.f5624f = j10;
                if (this.f5623e == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    this.f5623e = imageReceiver;
                    imageReceiver.setLayerNum(7);
                    this.f5623e.setAspectFit(true);
                    if (this.f5627s) {
                        this.f5623e.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver2 = this.f5623e;
                if (!this.f5620a) {
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
                this.f5623e.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver3 = this.f5623e;
        if (imageReceiver3 != null) {
            this.f5624f = 0L;
            imageReceiver3.clearImage();
        }
    }
}
