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
    public boolean f5229a;
    public final int f5230b;
    public org.telegram.ui.Components.q5 f5231c;
    public final p1 d;
    public ImageReceiver e;
    public long f5232f;
    public final ImageReceiver.BackgroundThreadDrawHolder[] h;
    public ImageReceiver f5233n;
    public final org.telegram.ui.Components.yc f5234r;
    public boolean f5235s;

    public o1(Context context, p1 p1Var) {
        super(context);
        this.f5230b = UserConfig.selectedAccount;
        this.h = new ImageReceiver.BackgroundThreadDrawHolder[2];
        this.f5234r = new org.telegram.ui.Components.yc(this);
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.d = p1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j3;
        int i10;
        long j10 = this.f5232f;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18341id;
        }
        if (j10 != j3) {
            org.telegram.ui.Components.q5 q5Var = this.f5231c;
            if (q5Var != null) {
                q5Var.o(this);
            }
            if (document != null) {
                int i11 = 1;
                this.f5229a = true;
                this.f5232f = document.f18341id;
                int i12 = s2.G;
                if (!z10) {
                    i11 = 16388;
                }
                if (LiteMode.isEnabled(i11)) {
                    i10 = 3;
                } else {
                    i10 = 13;
                }
                org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(this.f5230b, i10, document);
                this.f5231c = m10;
                if (this.f5235s) {
                    m10.a(this);
                    return;
                }
                return;
            }
            this.f5229a = false;
            this.f5232f = 0L;
            this.f5231c = null;
        }
    }

    public float getScale() {
        return this.f5234r.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.d.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5235s = true;
        org.telegram.ui.Components.q5 q5Var = this.f5231c;
        if (q5Var != null) {
            q5Var.a(this);
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5235s = false;
        org.telegram.ui.Components.q5 q5Var = this.f5231c;
        if (q5Var != null) {
            q5Var.o(this);
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
        org.telegram.ui.Components.q5 q5Var = this.f5231c;
        if (q5Var != null) {
            q5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f5231c.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.q5 q5Var = this.f5231c;
        if (q5Var != null) {
            q5Var.o(this);
        }
        this.f5231c = null;
        this.f5232f = 0L;
        this.f5229a = false;
        if (this.e == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.e = imageReceiver;
            imageReceiver.setLayerNum(7);
            this.e.setAspectFit(true);
            if (this.f5235s) {
                this.e.onAttachedToWindow();
            }
        }
        this.e.setImageBitmap(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f5234r.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f5229a = false;
        if (document != null) {
            long j3 = this.f5232f;
            long j10 = document.f18341id;
            if (j3 != j10) {
                this.f5232f = j10;
                if (this.e == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    this.e = imageReceiver;
                    imageReceiver.setLayerNum(7);
                    this.e.setAspectFit(true);
                    if (this.f5235s) {
                        this.e.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver2 = this.e;
                if (!this.f5229a) {
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
            this.f5232f = 0L;
            imageReceiver3.clearImage();
        }
    }
}
