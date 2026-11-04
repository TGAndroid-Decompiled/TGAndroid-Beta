package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bc;
import org.telegram.messenger.h10;
import org.telegram.messenger.lc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xp;
public final class l1 extends View {
    public xp f13068a;
    public boolean f13069b;
    public final int f13070c;
    public org.telegram.ui.Components.g5 d;
    public final m1 f13071e;
    public ImageReceiver f13072f;
    public long h;
    public final bc[] f13073n;
    public ImageReceiver f13074r;
    public final gc f13075s;
    public boolean f13076w;

    public l1(Context context, m1 m1Var) {
        super(context);
        this.f13070c = h10.f22829t0;
        this.f13073n = new bc[2];
        this.f13075s = new gc(this);
        setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        this.f13071e = m1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j10;
        int i3;
        long j11 = this.h;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f27007id;
        }
        if (j11 != j10) {
            org.telegram.ui.Components.g5 g5Var = this.d;
            if (g5Var != null) {
                g5Var.n(this);
            }
            if (document != null) {
                int i10 = 1;
                this.f13069b = true;
                this.h = document.f27007id;
                int i11 = i2.f12950z1;
                if (!z10) {
                    i10 = 16388;
                }
                if (lc.e(i10)) {
                    i3 = 3;
                } else {
                    i3 = 13;
                }
                org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(this.f13070c, i3, document);
                this.d = l10;
                if (this.f13076w) {
                    l10.a(this);
                    return;
                }
                return;
            }
            this.f13069b = false;
            this.h = 0L;
            this.d = null;
        }
    }

    public float getScale() {
        return this.f13075s.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.f13071e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13076w = true;
        org.telegram.ui.Components.g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f13072f;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13076w = false;
        org.telegram.ui.Components.g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.n(this);
        }
        ImageReceiver imageReceiver = this.f13072f;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f13072f;
        if (imageReceiver != null) {
            imageReceiver.y0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f13072f.h(canvas, null);
            return;
        }
        org.telegram.ui.Components.g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.n(this);
        }
        this.d = null;
        this.h = 0L;
        this.f13069b = false;
        if (this.f13072f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f13072f = imageReceiver;
            imageReceiver.E0(7);
            ImageReceiver imageReceiver2 = this.f13072f;
            imageReceiver2.S0 = true;
            if (this.f13076w) {
                imageReceiver2.P();
            }
        }
        this.f13072f.w0(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f13075s.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f13069b = false;
        if (document != null) {
            long j10 = this.h;
            long j11 = document.f27007id;
            if (j10 != j11) {
                this.h = j11;
                if (this.f13072f == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    this.f13072f = imageReceiver;
                    imageReceiver.E0(7);
                    ImageReceiver imageReceiver2 = this.f13072f;
                    imageReceiver2.S0 = true;
                    if (this.f13076w) {
                        imageReceiver2.P();
                    }
                }
                ImageReceiver imageReceiver3 = this.f13072f;
                if (!this.f13069b) {
                    view = this;
                } else {
                    view = this.f13071e;
                }
                imageReceiver3.H0(view);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    str = "80_80_g";
                } else {
                    str = "80_80";
                }
                if (!lc.e(1)) {
                    str = str.concat("_firstframe");
                }
                this.f13072f.r0(ac.b(document), str, ac.c(w10, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver4 = this.f13072f;
        if (imageReceiver4 != null) {
            this.h = 0L;
            imageReceiver4.f();
        }
    }
}
