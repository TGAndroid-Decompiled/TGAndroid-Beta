package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class iv3 extends View {
    public fm2 a;
    public boolean b;
    public final int c;
    public vl d;
    public final jv3 e;
    public ImageReceiver f;
    public long h;
    public final il5[] n;
    public ImageReceiver r;
    public final n41 s;
    public boolean w;

    public iv3(Context context, jv3 jv3Var) {
        super(context);
        this.c = y6c.t0;
        this.n = new il5[2];
        this.s = new n41(this);
        setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
        this.e = jv3Var;
    }

    public final void a(TLRPC.Document document, boolean z) {
        long j;
        int i;
        long j2 = this.h;
        if (document == null) {
            j = 0;
        } else {
            j = document.id;
        }
        if (j2 != j) {
            vl vlVar = this.d;
            if (vlVar != null) {
                vlVar.o(this);
            }
            if (document != null) {
                int i2 = 1;
                this.b = true;
                this.h = document.id;
                int i3 = ew3.C1;
                if (!z) {
                    i2 = 16388;
                }
                if (e66.e(i2)) {
                    i = 3;
                } else {
                    i = 13;
                }
                vl l = vl.l(this.c, i, document);
                this.d = l;
                if (this.w) {
                    l.b(this);
                    return;
                }
                return;
            }
            this.b = false;
            this.h = 0L;
            this.d = null;
        }
    }

    public float getScale() {
        return this.s.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = true;
        vl vlVar = this.d;
        if (vlVar != null) {
            vlVar.b(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w = false;
        vl vlVar = this.d;
        if (vlVar != null) {
            vlVar.o(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.i0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f.h(canvas, null);
            return;
        }
        vl vlVar = this.d;
        if (vlVar != null) {
            vlVar.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        vl vlVar = this.d;
        if (vlVar != null) {
            vlVar.o(this);
        }
        this.d = null;
        this.h = 0L;
        this.b = false;
        if (this.f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f = imageReceiver;
            imageReceiver.m0(7);
            ImageReceiver imageReceiver2 = this.f;
            imageReceiver2.S0 = true;
            if (this.w) {
                imageReceiver2.I();
            }
        }
        this.f.g0(drawable);
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.s.c(z);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.b = false;
        if (document != null) {
            long j = this.h;
            long j2 = document.id;
            if (j != j2) {
                this.h = j2;
                if (this.f == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    this.f = imageReceiver;
                    imageReceiver.m0(7);
                    ImageReceiver imageReceiver2 = this.f;
                    imageReceiver2.S0 = true;
                    if (this.w) {
                        imageReceiver2.I();
                    }
                }
                ImageReceiver imageReceiver3 = this.f;
                if (!this.b) {
                    view = this;
                } else {
                    view = this.e;
                }
                imageReceiver3.p0(view);
                TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    str = "80_80_g";
                } else {
                    str = "80_80";
                }
                if (!e66.e(1)) {
                    str = str.concat("_firstframe");
                }
                this.f.Z(gl5.b(document), str, gl5.c(w, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver4 = this.f;
        if (imageReceiver4 != null) {
            this.h = 0L;
            imageReceiver4.f();
        }
    }
}
