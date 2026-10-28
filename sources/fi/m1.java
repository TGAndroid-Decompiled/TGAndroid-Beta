package fi;

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
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.xc;
public final class m1 extends View {
    public ar f11235a;
    public boolean f11236b;
    public final int f11237c;
    public org.telegram.ui.Components.t5 d;
    public final n1 e;
    public ImageReceiver f11238f;
    public long h;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f11239n;
    public ImageReceiver f11240r;
    public final xc f11241s;
    public boolean v;

    public m1(Context context, n1 n1Var) {
        super(context);
        this.f11237c = UserConfig.selectedAccount;
        this.f11239n = new ImageReceiver.BackgroundThreadDrawHolder[2];
        this.f11241s = new xc(this);
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.e = n1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j10;
        int i10;
        long j11 = this.h;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f22034id;
        }
        if (j11 != j10) {
            org.telegram.ui.Components.t5 t5Var = this.d;
            if (t5Var != null) {
                t5Var.o(this);
            }
            if (document != null) {
                int i11 = 1;
                this.f11236b = true;
                this.h = document.f22034id;
                int i12 = l2.H;
                if (!z10) {
                    i11 = 16388;
                }
                if (LiteMode.isEnabled(i11)) {
                    i10 = 3;
                } else {
                    i10 = 13;
                }
                org.telegram.ui.Components.t5 m10 = org.telegram.ui.Components.t5.m(this.f11237c, i10, document);
                this.d = m10;
                if (this.v) {
                    m10.a(this);
                    return;
                }
                return;
            }
            this.f11236b = false;
            this.h = 0L;
            this.d = null;
        }
    }

    public float getScale() {
        return this.f11241s.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v = true;
        org.telegram.ui.Components.t5 t5Var = this.d;
        if (t5Var != null) {
            t5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f11238f;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v = false;
        org.telegram.ui.Components.t5 t5Var = this.d;
        if (t5Var != null) {
            t5Var.o(this);
        }
        ImageReceiver imageReceiver = this.f11238f;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f11238f;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f11238f.draw(canvas);
            return;
        }
        org.telegram.ui.Components.t5 t5Var = this.d;
        if (t5Var != null) {
            t5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.t5 t5Var = this.d;
        if (t5Var != null) {
            t5Var.o(this);
        }
        this.d = null;
        this.h = 0L;
        this.f11236b = false;
        if (this.f11238f == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.f11238f = imageReceiver;
            imageReceiver.setLayerNum(7);
            this.f11238f.setAspectFit(true);
            if (this.v) {
                this.f11238f.onAttachedToWindow();
            }
        }
        this.f11238f.setImageBitmap(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f11241s.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f11236b = false;
        if (document != null) {
            long j10 = this.h;
            long j11 = document.f22034id;
            if (j10 != j11) {
                this.h = j11;
                if (this.f11238f == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    this.f11238f = imageReceiver;
                    imageReceiver.setLayerNum(7);
                    this.f11238f.setAspectFit(true);
                    if (this.v) {
                        this.f11238f.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver2 = this.f11238f;
                if (!this.f11236b) {
                    view = this;
                } else {
                    view = this.e;
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
                this.f11238f.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver3 = this.f11238f;
        if (imageReceiver3 != null) {
            this.h = 0L;
            imageReceiver3.clearImage();
        }
    }
}
