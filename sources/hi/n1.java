package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.j10;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oq;
public final class n1 extends View {
    public oq f15061a;
    public boolean f15062b;
    public final int f15063c;
    public org.telegram.ui.Components.p5 d;
    public final o1 f15064e;
    public ImageReceiver f15065f;
    public long h;
    public final gc[] f15066n;
    public ImageReceiver f15067r;
    public final mc f15068s;
    public boolean f15069w;

    public n1(Context context, o1 o1Var) {
        super(context);
        this.f15063c = j10.f24798t0;
        this.f15066n = new gc[2];
        this.f15068s = new mc(this);
        setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        this.f15064e = o1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j3;
        int i7;
        long j10 = this.h;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28437id;
        }
        if (j10 != j3) {
            org.telegram.ui.Components.p5 p5Var = this.d;
            if (p5Var != null) {
                p5Var.n(this);
            }
            if (document != null) {
                int i10 = 1;
                this.f15062b = true;
                this.h = document.f28437id;
                int i11 = i2.C1;
                if (!z10) {
                    i10 = 16388;
                }
                if (pc.e(i10)) {
                    i7 = 3;
                } else {
                    i7 = 13;
                }
                org.telegram.ui.Components.p5 l10 = org.telegram.ui.Components.p5.l(this.f15063c, i7, document);
                this.d = l10;
                if (this.f15069w) {
                    l10.a(this);
                    return;
                }
                return;
            }
            this.f15062b = false;
            this.h = 0L;
            this.d = null;
        }
    }

    public float getScale() {
        return this.f15068s.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.f15064e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15069w = true;
        org.telegram.ui.Components.p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f15065f;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15069w = false;
        org.telegram.ui.Components.p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.n(this);
        }
        ImageReceiver imageReceiver = this.f15065f;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f15065f;
        if (imageReceiver != null) {
            imageReceiver.y0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f15065f.h(canvas, null);
            return;
        }
        org.telegram.ui.Components.p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.n(this);
        }
        this.d = null;
        this.h = 0L;
        this.f15062b = false;
        if (this.f15065f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f15065f = imageReceiver;
            imageReceiver.E0(7);
            ImageReceiver imageReceiver2 = this.f15065f;
            imageReceiver2.S0 = true;
            if (this.f15069w) {
                imageReceiver2.P();
            }
        }
        this.f15065f.w0(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f15068s.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f15062b = false;
        if (document != null) {
            long j3 = this.h;
            long j10 = document.f28437id;
            if (j3 != j10) {
                this.h = j10;
                if (this.f15065f == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    this.f15065f = imageReceiver;
                    imageReceiver.E0(7);
                    ImageReceiver imageReceiver2 = this.f15065f;
                    imageReceiver2.S0 = true;
                    if (this.f15069w) {
                        imageReceiver2.P();
                    }
                }
                ImageReceiver imageReceiver3 = this.f15065f;
                if (!this.f15062b) {
                    view = this;
                } else {
                    view = this.f15064e;
                }
                imageReceiver3.H0(view);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    str = "80_80_g";
                } else {
                    str = "80_80";
                }
                if (!pc.e(1)) {
                    str = str.concat("_firstframe");
                }
                this.f15065f.r0(fc.b(document), str, fc.c(w10, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver4 = this.f15065f;
        if (imageReceiver4 != null) {
            this.h = 0L;
            imageReceiver4.f();
        }
    }
}
