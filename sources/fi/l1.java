package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.messenger.p10;
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.xp;
public final class l1 extends View {
    public xp f12304a;
    public boolean f12305b;
    public final int f12306c;
    public org.telegram.ui.Components.h5 d;
    public final m1 f12307e;
    public ImageReceiver f12308f;
    public long h;
    public final ic[] f12309n;
    public ImageReceiver f12310r;
    public final hc f12311s;
    public boolean f12312w;

    public l1(Context context, m1 m1Var) {
        super(context);
        this.f12306c = p10.f24474s0;
        this.f12309n = new ic[2];
        this.f12311s = new hc(this);
        setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        this.f12307e = m1Var;
    }

    public final void a(TLRPC.Document document, boolean z9) {
        long j3;
        int i7;
        long j10 = this.h;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f26966id;
        }
        if (j10 != j3) {
            org.telegram.ui.Components.h5 h5Var = this.d;
            if (h5Var != null) {
                h5Var.n(this);
            }
            if (document != null) {
                int i10 = 1;
                this.f12305b = true;
                this.h = document.f26966id;
                int i11 = k2.B1;
                if (!z9) {
                    i10 = 16388;
                }
                if (sc.e(i10)) {
                    i7 = 3;
                } else {
                    i7 = 13;
                }
                org.telegram.ui.Components.h5 l10 = org.telegram.ui.Components.h5.l(this.f12306c, i7, document);
                this.d = l10;
                if (this.f12312w) {
                    l10.a(this);
                    return;
                }
                return;
            }
            this.f12305b = false;
            this.h = 0L;
            this.d = null;
        }
    }

    public float getScale() {
        return this.f12311s.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.f12307e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12312w = true;
        org.telegram.ui.Components.h5 h5Var = this.d;
        if (h5Var != null) {
            h5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f12308f;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12312w = false;
        org.telegram.ui.Components.h5 h5Var = this.d;
        if (h5Var != null) {
            h5Var.n(this);
        }
        ImageReceiver imageReceiver = this.f12308f;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f12308f;
        if (imageReceiver != null) {
            imageReceiver.y0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f12308f.h(canvas, null);
            return;
        }
        org.telegram.ui.Components.h5 h5Var = this.d;
        if (h5Var != null) {
            h5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.h5 h5Var = this.d;
        if (h5Var != null) {
            h5Var.n(this);
        }
        this.d = null;
        this.h = 0L;
        this.f12305b = false;
        if (this.f12308f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f12308f = imageReceiver;
            imageReceiver.E0(7);
            ImageReceiver imageReceiver2 = this.f12308f;
            imageReceiver2.R0 = true;
            if (this.f12312w) {
                imageReceiver2.P();
            }
        }
        this.f12308f.w0(drawable);
    }

    @Override
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        this.f12311s.c(z9);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f12305b = false;
        if (document != null) {
            long j3 = this.h;
            long j10 = document.f26966id;
            if (j3 != j10) {
                this.h = j10;
                if (this.f12308f == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    this.f12308f = imageReceiver;
                    imageReceiver.E0(7);
                    ImageReceiver imageReceiver2 = this.f12308f;
                    imageReceiver2.R0 = true;
                    if (this.f12312w) {
                        imageReceiver2.P();
                    }
                }
                ImageReceiver imageReceiver3 = this.f12308f;
                if (!this.f12305b) {
                    view = this;
                } else {
                    view = this.f12307e;
                }
                imageReceiver3.H0(view);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    str = "80_80_g";
                } else {
                    str = "80_80";
                }
                if (!sc.e(1)) {
                    str = str.concat("_firstframe");
                }
                this.f12308f.r0(org.telegram.messenger.hc.b(document), str, org.telegram.messenger.hc.c(w10, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver4 = this.f12308f;
        if (imageReceiver4 != null) {
            this.h = 0L;
            imageReceiver4.f();
        }
    }
}
