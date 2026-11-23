package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.k10;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oq;
public final class n1 extends View {
    public oq f15064a;
    public boolean f15065b;
    public final int f15066c;
    public org.telegram.ui.Components.p5 d;
    public final o1 f15067e;
    public ImageReceiver f15068f;
    public long h;
    public final hc[] f15069n;
    public ImageReceiver f15070r;
    public final mc f15071s;
    public boolean f15072w;

    public n1(Context context, o1 o1Var) {
        super(context);
        this.f15066c = k10.f24968t0;
        this.f15069n = new hc[2];
        this.f15071s = new mc(this);
        setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        this.f15067e = o1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j3;
        int i7;
        long j10 = this.h;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28440id;
        }
        if (j10 != j3) {
            org.telegram.ui.Components.p5 p5Var = this.d;
            if (p5Var != null) {
                p5Var.n(this);
            }
            if (document != null) {
                int i10 = 1;
                this.f15065b = true;
                this.h = document.f28440id;
                int i11 = i2.C1;
                if (!z10) {
                    i10 = 16388;
                }
                if (qc.e(i10)) {
                    i7 = 3;
                } else {
                    i7 = 13;
                }
                org.telegram.ui.Components.p5 l10 = org.telegram.ui.Components.p5.l(this.f15066c, i7, document);
                this.d = l10;
                if (this.f15072w) {
                    l10.a(this);
                    return;
                }
                return;
            }
            this.f15065b = false;
            this.h = 0L;
            this.d = null;
        }
    }

    public float getScale() {
        return this.f15071s.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.f15067e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15072w = true;
        org.telegram.ui.Components.p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f15068f;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15072w = false;
        org.telegram.ui.Components.p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.n(this);
        }
        ImageReceiver imageReceiver = this.f15068f;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f15068f;
        if (imageReceiver != null) {
            imageReceiver.y0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f15068f.h(canvas, null);
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
        this.f15065b = false;
        if (this.f15068f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f15068f = imageReceiver;
            imageReceiver.E0(7);
            ImageReceiver imageReceiver2 = this.f15068f;
            imageReceiver2.S0 = true;
            if (this.f15072w) {
                imageReceiver2.P();
            }
        }
        this.f15068f.w0(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f15071s.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f15065b = false;
        if (document != null) {
            long j3 = this.h;
            long j10 = document.f28440id;
            if (j3 != j10) {
                this.h = j10;
                if (this.f15068f == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    this.f15068f = imageReceiver;
                    imageReceiver.E0(7);
                    ImageReceiver imageReceiver2 = this.f15068f;
                    imageReceiver2.S0 = true;
                    if (this.f15072w) {
                        imageReceiver2.P();
                    }
                }
                ImageReceiver imageReceiver3 = this.f15068f;
                if (!this.f15065b) {
                    view = this;
                } else {
                    view = this.f15067e;
                }
                imageReceiver3.H0(view);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    str = "80_80_g";
                } else {
                    str = "80_80";
                }
                if (!qc.e(1)) {
                    str = str.concat("_firstframe");
                }
                this.f15068f.r0(gc.b(document), str, gc.c(w10, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver4 = this.f15068f;
        if (imageReceiver4 != null) {
            this.h = 0L;
            imageReceiver4.f();
        }
    }
}
