package di;

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
    public boolean f7739a;
    public final int f7740b;
    public org.telegram.ui.Components.q5 f7741c;
    public final p1 d;
    public ImageReceiver f7742e;
    public long f7743f;
    public final ImageReceiver.BackgroundThreadDrawHolder[] h;
    public ImageReceiver f7744n;
    public final org.telegram.ui.Components.zc f7745r;
    public boolean f7746s;

    public o1(Context context, p1 p1Var) {
        super(context);
        this.f7740b = UserConfig.selectedAccount;
        this.h = new ImageReceiver.BackgroundThreadDrawHolder[2];
        this.f7745r = new org.telegram.ui.Components.zc(this);
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.d = p1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j3;
        int i10;
        long j10 = this.f7743f;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f19902id;
        }
        if (j10 != j3) {
            org.telegram.ui.Components.q5 q5Var = this.f7741c;
            if (q5Var != null) {
                q5Var.o(this);
            }
            if (document != null) {
                int i11 = 1;
                this.f7739a = true;
                this.f7743f = document.f19902id;
                int i12 = t2.G;
                if (!z10) {
                    i11 = 16388;
                }
                if (LiteMode.isEnabled(i11)) {
                    i10 = 3;
                } else {
                    i10 = 13;
                }
                org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(this.f7740b, i10, document);
                this.f7741c = m10;
                if (this.f7746s) {
                    m10.a(this);
                    return;
                }
                return;
            }
            this.f7739a = false;
            this.f7743f = 0L;
            this.f7741c = null;
        }
    }

    public float getScale() {
        return this.f7745r.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.d.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7746s = true;
        org.telegram.ui.Components.q5 q5Var = this.f7741c;
        if (q5Var != null) {
            q5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f7742e;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7746s = false;
        org.telegram.ui.Components.q5 q5Var = this.f7741c;
        if (q5Var != null) {
            q5Var.o(this);
        }
        ImageReceiver imageReceiver = this.f7742e;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f7742e;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f7742e.draw(canvas);
            return;
        }
        org.telegram.ui.Components.q5 q5Var = this.f7741c;
        if (q5Var != null) {
            q5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f7741c.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.q5 q5Var = this.f7741c;
        if (q5Var != null) {
            q5Var.o(this);
        }
        this.f7741c = null;
        this.f7743f = 0L;
        this.f7739a = false;
        if (this.f7742e == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.f7742e = imageReceiver;
            imageReceiver.setLayerNum(7);
            this.f7742e.setAspectFit(true);
            if (this.f7746s) {
                this.f7742e.onAttachedToWindow();
            }
        }
        this.f7742e.setImageBitmap(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f7745r.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f7739a = false;
        if (document != null) {
            long j3 = this.f7743f;
            long j10 = document.f19902id;
            if (j3 != j10) {
                this.f7743f = j10;
                if (this.f7742e == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    this.f7742e = imageReceiver;
                    imageReceiver.setLayerNum(7);
                    this.f7742e.setAspectFit(true);
                    if (this.f7746s) {
                        this.f7742e.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver2 = this.f7742e;
                if (!this.f7739a) {
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
                this.f7742e.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver3 = this.f7742e;
        if (imageReceiver3 != null) {
            this.f7743f = 0L;
            imageReceiver3.clearImage();
        }
    }
}
