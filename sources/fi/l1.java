package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.p10;
import org.telegram.messenger.rc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xp;
public final class l1 extends View {
    public xp f12302a;
    public boolean f12303b;
    public final int f12304c;
    public org.telegram.ui.Components.i5 d;
    public final m1 f12305e;
    public ImageReceiver f12306f;
    public long h;
    public final ic[] f12307n;
    public ImageReceiver f12308r;
    public final org.telegram.ui.Components.ic f12309s;
    public boolean f12310w;

    public l1(Context context, m1 m1Var) {
        super(context);
        this.f12304c = p10.f24459s0;
        this.f12307n = new ic[2];
        this.f12309s = new org.telegram.ui.Components.ic(this);
        setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        this.f12305e = m1Var;
    }

    public final void a(TLRPC.Document document, boolean z9) {
        long j3;
        int i7;
        long j10 = this.h;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f26958id;
        }
        if (j10 != j3) {
            org.telegram.ui.Components.i5 i5Var = this.d;
            if (i5Var != null) {
                i5Var.n(this);
            }
            if (document != null) {
                int i10 = 1;
                this.f12303b = true;
                this.h = document.f26958id;
                int i11 = k2.f12251y1;
                if (!z9) {
                    i10 = 16388;
                }
                if (rc.e(i10)) {
                    i7 = 3;
                } else {
                    i7 = 13;
                }
                org.telegram.ui.Components.i5 l10 = org.telegram.ui.Components.i5.l(this.f12304c, i7, document);
                this.d = l10;
                if (this.f12310w) {
                    l10.a(this);
                    return;
                }
                return;
            }
            this.f12303b = false;
            this.h = 0L;
            this.d = null;
        }
    }

    public float getScale() {
        return this.f12309s.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.f12305e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12310w = true;
        org.telegram.ui.Components.i5 i5Var = this.d;
        if (i5Var != null) {
            i5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f12306f;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12310w = false;
        org.telegram.ui.Components.i5 i5Var = this.d;
        if (i5Var != null) {
            i5Var.n(this);
        }
        ImageReceiver imageReceiver = this.f12306f;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f12306f;
        if (imageReceiver != null) {
            imageReceiver.y0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f12306f.h(canvas, null);
            return;
        }
        org.telegram.ui.Components.i5 i5Var = this.d;
        if (i5Var != null) {
            i5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.i5 i5Var = this.d;
        if (i5Var != null) {
            i5Var.n(this);
        }
        this.d = null;
        this.h = 0L;
        this.f12303b = false;
        if (this.f12306f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f12306f = imageReceiver;
            imageReceiver.E0(7);
            ImageReceiver imageReceiver2 = this.f12306f;
            imageReceiver2.R0 = true;
            if (this.f12310w) {
                imageReceiver2.P();
            }
        }
        this.f12306f.w0(drawable);
    }

    @Override
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        this.f12309s.c(z9);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f12303b = false;
        if (document != null) {
            long j3 = this.h;
            long j10 = document.f26958id;
            if (j3 != j10) {
                this.h = j10;
                if (this.f12306f == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    this.f12306f = imageReceiver;
                    imageReceiver.E0(7);
                    ImageReceiver imageReceiver2 = this.f12306f;
                    imageReceiver2.R0 = true;
                    if (this.f12310w) {
                        imageReceiver2.P();
                    }
                }
                ImageReceiver imageReceiver3 = this.f12306f;
                if (!this.f12303b) {
                    view = this;
                } else {
                    view = this.f12305e;
                }
                imageReceiver3.H0(view);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    str = "80_80_g";
                } else {
                    str = "80_80";
                }
                if (!rc.e(1)) {
                    str = str.concat("_firstframe");
                }
                this.f12306f.r0(hc.b(document), str, hc.c(w10, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver4 = this.f12306f;
        if (imageReceiver4 != null) {
            this.h = 0L;
            imageReceiver4.f();
        }
    }
}
