package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.m10;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.fq;
public final class n1 extends View {
    public fq f14730a;
    public boolean f14731b;
    public final int f14732c;
    public org.telegram.ui.Components.g5 d;
    public final o1 f14733e;
    public ImageReceiver f14734f;
    public long h;
    public final hc[] f14735n;
    public ImageReceiver f14736r;
    public final dc f14737s;
    public boolean f14738w;

    public n1(Context context, o1 o1Var) {
        super(context);
        this.f14732c = m10.f24934t0;
        this.f14735n = new hc[2];
        this.f14737s = new dc(this);
        setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        this.f14733e = o1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j3;
        int i7;
        long j10 = this.h;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28057id;
        }
        if (j10 != j3) {
            org.telegram.ui.Components.g5 g5Var = this.d;
            if (g5Var != null) {
                g5Var.n(this);
            }
            if (document != null) {
                int i10 = 1;
                this.f14731b = true;
                this.h = document.f28057id;
                int i11 = i2.C1;
                if (!z10) {
                    i10 = 16388;
                }
                if (qc.e(i10)) {
                    i7 = 3;
                } else {
                    i7 = 13;
                }
                org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(this.f14732c, i7, document);
                this.d = l10;
                if (this.f14738w) {
                    l10.a(this);
                    return;
                }
                return;
            }
            this.f14731b = false;
            this.h = 0L;
            this.d = null;
        }
    }

    public float getScale() {
        return this.f14737s.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.f14733e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14738w = true;
        org.telegram.ui.Components.g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f14734f;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14738w = false;
        org.telegram.ui.Components.g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.n(this);
        }
        ImageReceiver imageReceiver = this.f14734f;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f14734f;
        if (imageReceiver != null) {
            imageReceiver.y0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f14734f.h(canvas, null);
            return;
        }
        org.telegram.ui.Components.g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.n(this);
        }
        this.d = null;
        this.h = 0L;
        this.f14731b = false;
        if (this.f14734f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f14734f = imageReceiver;
            imageReceiver.E0(7);
            ImageReceiver imageReceiver2 = this.f14734f;
            imageReceiver2.S0 = true;
            if (this.f14738w) {
                imageReceiver2.P();
            }
        }
        this.f14734f.w0(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f14737s.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f14731b = false;
        if (document != null) {
            long j3 = this.h;
            long j10 = document.f28057id;
            if (j3 != j10) {
                this.h = j10;
                if (this.f14734f == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    this.f14734f = imageReceiver;
                    imageReceiver.E0(7);
                    ImageReceiver imageReceiver2 = this.f14734f;
                    imageReceiver2.S0 = true;
                    if (this.f14738w) {
                        imageReceiver2.P();
                    }
                }
                ImageReceiver imageReceiver3 = this.f14734f;
                if (!this.f14731b) {
                    view = this;
                } else {
                    view = this.f14733e;
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
                this.f14734f.r0(gc.b(document), str, gc.c(w10, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver4 = this.f14734f;
        if (imageReceiver4 != null) {
            this.h = 0L;
            imageReceiver4.f();
        }
    }
}
