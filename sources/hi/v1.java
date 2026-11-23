package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.i10;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lq;
public final class v1 extends View {
    public lq f15541a;
    public boolean f15542b;
    public final int f15543c;
    public org.telegram.ui.Components.o5 d;
    public final w1 f15544e;
    public ImageReceiver f15545f;
    public long h;
    public final org.telegram.messenger.gc[] f15546n;
    public ImageReceiver f15547r;
    public final org.telegram.ui.Components.lc f15548s;
    public boolean f15549w;

    public v1(Context context, w1 w1Var) {
        super(context);
        this.f15543c = i10.f24637t0;
        this.f15546n = new org.telegram.messenger.gc[2];
        this.f15548s = new org.telegram.ui.Components.lc(this);
        setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        this.f15544e = w1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j3;
        int i7;
        long j10 = this.h;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28498id;
        }
        if (j10 != j3) {
            org.telegram.ui.Components.o5 o5Var = this.d;
            if (o5Var != null) {
                o5Var.n(this);
            }
            if (document != null) {
                int i10 = 1;
                this.f15542b = true;
                this.h = document.f28498id;
                int i11 = r2.D1;
                if (!z10) {
                    i10 = 16388;
                }
                if (pc.e(i10)) {
                    i7 = 3;
                } else {
                    i7 = 13;
                }
                org.telegram.ui.Components.o5 l10 = org.telegram.ui.Components.o5.l(this.f15543c, i7, document);
                this.d = l10;
                if (this.f15549w) {
                    l10.a(this);
                    return;
                }
                return;
            }
            this.f15542b = false;
            this.h = 0L;
            this.d = null;
        }
    }

    public float getScale() {
        return this.f15548s.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.f15544e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15549w = true;
        org.telegram.ui.Components.o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f15545f;
        if (imageReceiver != null) {
            imageReceiver.Q();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15549w = false;
        org.telegram.ui.Components.o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.n(this);
        }
        ImageReceiver imageReceiver = this.f15545f;
        if (imageReceiver != null) {
            imageReceiver.S();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f15545f;
        if (imageReceiver != null) {
            imageReceiver.z0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f15545f.h(canvas, null);
            return;
        }
        org.telegram.ui.Components.o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.n(this);
        }
        this.d = null;
        this.h = 0L;
        this.f15542b = false;
        if (this.f15545f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f15545f = imageReceiver;
            imageReceiver.F0(7);
            ImageReceiver imageReceiver2 = this.f15545f;
            imageReceiver2.S0 = true;
            if (this.f15549w) {
                imageReceiver2.Q();
            }
        }
        this.f15545f.x0(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f15548s.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f15542b = false;
        if (document != null) {
            long j3 = this.h;
            long j10 = document.f28498id;
            if (j3 != j10) {
                this.h = j10;
                if (this.f15545f == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    this.f15545f = imageReceiver;
                    imageReceiver.F0(7);
                    ImageReceiver imageReceiver2 = this.f15545f;
                    imageReceiver2.S0 = true;
                    if (this.f15549w) {
                        imageReceiver2.Q();
                    }
                }
                ImageReceiver imageReceiver3 = this.f15545f;
                if (!this.f15542b) {
                    view = this;
                } else {
                    view = this.f15544e;
                }
                imageReceiver3.I0(view);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    str = "80_80_g";
                } else {
                    str = "80_80";
                }
                if (!pc.e(1)) {
                    str = str.concat("_firstframe");
                }
                this.f15545f.s0(org.telegram.messenger.fc.b(document), str, org.telegram.messenger.fc.c(w10, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver4 = this.f15545f;
        if (imageReceiver4 != null) {
            this.h = 0L;
            imageReceiver4.f();
        }
    }
}
