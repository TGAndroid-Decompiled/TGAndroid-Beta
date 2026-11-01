package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.g6;
import org.telegram.messenger.j6;
import org.telegram.messenger.jc;
import org.telegram.messenger.k6;
import org.telegram.messenger.r20;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;
public class y0 extends View {
    public final float D;
    public float E;
    public StaticLayout F;
    public float G;
    public float H;
    public final int I;
    public final int J;
    public boolean K;
    public boolean L;
    public float M;
    public float N;
    public final RectF O;
    public final t5 P;
    public int f10362a;
    public String f10363b;
    public boolean f10364c;
    public final RectF d;
    public final TextPaint e;
    public final Paint f10365f;
    public final Drawable h;
    public boolean f10366n;
    public final ImageReceiver f10367r;
    public final ImageReceiver f10368s;
    public TLRPC.Document f10369w;
    public TLRPC.Document f10370x;
    public boolean f10371y;

    public y0(Context context, float f7) {
        super(context);
        this.f10363b = "";
        this.d = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        this.f10365f = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f10367r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f10368s = imageReceiver2;
        this.E = 1.0f;
        this.O = new RectF();
        new Path();
        this.P = new t5(this, 350L, gr.h);
        this.D = f7;
        imageReceiver.A0 = true;
        imageReceiver.J0 = true;
        imageReceiver2.A0 = true;
        imageReceiver2.J0 = true;
        int i10 = (int) (3.0f * f7);
        this.I = i10;
        int i11 = (int) (1.0f * f7);
        this.J = i11;
        setPadding(i10, i11, i10, i11);
        this.h = i0.a.f(context, 2131231647);
        textPaint.setTextSize(f7 * 24.0f);
        textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
        at.i(this);
    }

    public static org.telegram.tgnet.TLRPC.Document b(org.telegram.tgnet.TLRPC.TL_messages_stickerSet r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: jg.y0.b(org.telegram.tgnet.TLRPC$TL_messages_stickerSet, java.lang.String):org.telegram.tgnet.TLRPC$Document");
    }

    public static x0 c(String str) {
        g6 f7 = k6.f(str);
        if (f7 instanceof j6) {
            ((j6) f7).f15863a = false;
        }
        if (f7 == null) {
            return null;
        }
        return new x0(f7, 0);
    }

    public final void a(Canvas canvas) {
        float f7;
        f();
        if (this.F == null) {
            return;
        }
        int i10 = this.I;
        float f10 = i10;
        int i11 = this.J;
        float f11 = i11;
        RectF rectF = this.O;
        rectF.set(f10, f11, this.M + f10, this.N + f11);
        float f12 = this.N * 0.2f;
        canvas.drawRoundRect(rectF, f12, f12, this.f10365f);
        boolean z10 = this.f10366n;
        float f13 = this.D;
        RectF rectF2 = this.d;
        if (z10) {
            float d = this.P.d(this.L);
            if (d > 0.0f) {
                float b10 = a30.b(rectF2.left, 2.25f, f13, f10);
                float f14 = f13 * 21.33f;
                float B = c3.i0.B(this.N, f14, 2.0f, f11);
                ImageReceiver imageReceiver = this.f10368s;
                imageReceiver.y0(b10, B, f14, f14);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.r(), imageReceiver.s());
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                canvas.restore();
            }
            if (d < 1.0f) {
                float b11 = a30.b(rectF2.left, 2.25f, f13, f10);
                float f15 = f13 * 21.33f;
                float B2 = c3.i0.B(this.N, f15, 2.0f, f11);
                ImageReceiver imageReceiver2 = this.f10367r;
                imageReceiver2.y0(b11, B2, f15, f15);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.r(), imageReceiver2.s());
                imageReceiver2.setAlpha(1.0f - d);
                imageReceiver2.h(canvas, null);
                canvas.restore();
            }
        } else if (!this.f10371y) {
            float f16 = rectF2.left;
            float f17 = this.N;
            float f18 = f13 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f16 * f13)) + i10, ((int) ((f17 - f18) / 2.0f)) + i11, i10 + ((int) ((f16 + 21.33f) * f13)), i11 + ((int) ((f18 + f17) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        float f19 = rectF2.left;
        if (!this.f10366n && !this.f10371y) {
            f7 = 0.0f;
        } else {
            f7 = 2.25f;
        }
        canvas.translate(((f19 + f7 + 21.33f + 3.25f) * f13) + f10, (this.N / 2.0f) + f11);
        float f20 = this.E;
        canvas.scale(f20, f20);
        canvas.translate(-this.H, (-this.F.getHeight()) / 2.0f);
        this.F.draw(canvas);
        canvas.restore();
    }

    public final void d(int i10, final String str) {
        boolean z10;
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.f10368s;
        ImageReceiver imageReceiver2 = this.f10367r;
        if (isEmpty) {
            this.f10366n = false;
            this.f10369w = null;
            this.f10370x = null;
            imageReceiver2.f();
            imageReceiver.f();
            z10 = true;
        } else {
            this.f10366n = true;
            this.f10369w = null;
            this.f10370x = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            vi.b0(i10).l0(tL_inputStickerSetShortName, 0, false, false, new r20(this) {
                public final y0 f10339b;

                {
                    this.f10339b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r3) {
                        case 0:
                            y0 y0Var = this.f10339b;
                            y0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = y0.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            y0Var.f10369w = b10;
                            y0Var.f10367r.q0(jc.b(b10), "80_80", y0.c(str2), null, null, 0);
                            y0Var.f10368s.u0(jc.b(y0Var.f10370x), "80_80", jc.b(y0Var.f10369w), "80_80", null, null, y0.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            y0 y0Var2 = this.f10339b;
                            y0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = y0.b((TLRPC.TL_messages_stickerSet) obj, str3);
                            y0Var2.f10370x = b11;
                            if (b11 != null) {
                                y0Var2.f10368s.u0(jc.b(b11), "80_80", jc.b(y0Var2.f10369w), "80_80", null, null, y0.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            vi.b0(i10).l0(tL_inputStickerSetShortName2, 0, false, false, new r20(this) {
                public final y0 f10339b;

                {
                    this.f10339b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r3) {
                        case 0:
                            y0 y0Var = this.f10339b;
                            y0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = y0.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            y0Var.f10369w = b10;
                            y0Var.f10367r.q0(jc.b(b10), "80_80", y0.c(str2), null, null, 0);
                            y0Var.f10368s.u0(jc.b(y0Var.f10370x), "80_80", jc.b(y0Var.f10369w), "80_80", null, null, y0.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            y0 y0Var2 = this.f10339b;
                            y0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = y0.b((TLRPC.TL_messages_stickerSet) obj, str3);
                            y0Var2.f10370x = b11;
                            if (b11 != null) {
                                y0Var2.f10368s.u0(jc.b(b11), "80_80", jc.b(y0Var2.f10369w), "80_80", null, null, y0.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            z10 = true;
            imageReceiver2.q0(jc.b(this.f10369w), "80_80", c(str), null, null, 0);
            imageReceiver.u0(jc.b(this.f10370x), "80_80", jc.b(this.f10369w), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.f10364c = z10;
        requestLayout();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i10, int i11) {
        int i12 = -16777216;
        Drawable drawable = this.h;
        TextPaint textPaint = this.e;
        Paint paint = this.f10365f;
        if (i10 == 0) {
            paint.setColor(-16777216);
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            paint.setColor(1275068416);
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else if (i10 == 2) {
            paint.setColor(-1);
            textPaint.setColor(-16777216);
            drawable.setColorFilter(null);
        } else {
            paint.setColor(i11);
            if (org.telegram.messenger.i0.B(i11) < 0.721f) {
                i12 = -1;
            }
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void f() {
        float f7;
        float f10;
        if (!this.f10364c) {
            return;
        }
        String str = this.f10363b;
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText(str);
        int i10 = this.f10362a;
        int i11 = this.I;
        float f11 = (i10 - i11) - i11;
        RectF rectF = this.d;
        float f12 = rectF.left;
        float f13 = 2.25f;
        if (!this.f10366n && !this.f10371y) {
            f7 = 0.0f;
        } else {
            f7 = 2.25f;
        }
        float f14 = this.D;
        float f15 = f11 - (((((f12 + f7) + 21.33f) + 3.25f) + rectF.right) * f14);
        float min = Math.min(1.0f, f15 / measureText);
        this.E = min;
        if (min < 0.4f) {
            f10 = 1.0f;
            String str2 = this.f10363b;
            this.F = new StaticLayout(str2, textPaint, vh.p2.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } else {
            f10 = 1.0f;
            this.F = new StaticLayout(this.f10363b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.G = 0.0f;
        this.H = Float.MAX_VALUE;
        for (int i12 = 0; i12 < this.F.getLineCount(); i12++) {
            this.G = Math.max(this.G, this.F.getLineWidth(i12));
            this.H = Math.min(this.H, this.F.getLineLeft(i12));
        }
        if (this.F.getLineCount() > 2) {
            this.E = 0.3f;
        } else {
            this.E = Math.min(f10, f15 / this.G);
        }
        float f16 = rectF.left;
        if (!this.f10366n && !this.f10371y) {
            f13 = 0.0f;
        }
        this.M = (this.G * this.E) + ((f16 + f13 + 21.33f + 3.25f + rectF.right) * f14);
        this.N = Math.max(f14 * 21.33f, this.F.getHeight() * this.E) + ((rectF.top + rectF.bottom) * f14);
        this.f10364c = false;
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        if (this.L && (document = this.f10370x) != null) {
            return document;
        }
        return this.f10369w;
    }

    public int getHeightInternal() {
        int round = Math.round(this.N);
        int i10 = this.J;
        return round + i10 + i10;
    }

    public float getRadius() {
        return this.N * 0.2f;
    }

    public String getText() {
        return this.f10363b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.M);
        int i10 = this.I;
        return round + i10 + i10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        if (this.L) {
            this.f10368s.P();
        } else {
            this.f10367r.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        this.f10367r.R();
        this.f10368s.R();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z10) {
        if (this.L != z10 && this.K) {
            ImageReceiver imageReceiver = this.f10368s;
            ImageReceiver imageReceiver2 = this.f10367r;
            if (z10) {
                imageReceiver2.R();
                imageReceiver.P();
            } else {
                imageReceiver2.P();
                imageReceiver.R();
            }
        }
        this.L = z10;
        invalidate();
    }

    public void setMaxWidth(int i10) {
        this.f10362a = i10;
        this.f10364c = true;
    }

    public void setText(String str) {
        this.f10363b = str;
        this.f10364c = true;
        requestLayout();
    }
}
