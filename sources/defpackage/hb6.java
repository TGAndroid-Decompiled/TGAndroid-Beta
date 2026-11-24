package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.tgnet.TLRPC;
public class hb6 extends View {
    public final float E;
    public float F;
    public StaticLayout G;
    public float H;
    public float I;
    public final int J;
    public final int K;
    public boolean L;
    public boolean M;
    public float N;
    public float O;
    public final RectF P;
    public final lm Q;
    public int a;
    public String b;
    public boolean c;
    public final RectF d;
    public final TextPaint e;
    public final Paint f;
    public final Drawable h;
    public boolean n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public TLRPC.Document w;
    public TLRPC.Document x;
    public boolean y;

    public hb6(Context context, float f) {
        super(context);
        this.b = "";
        this.d = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        this.f = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.F = 1.0f;
        this.P = new RectF();
        this.Q = new lm(350L, this, s33.h);
        this.E = f;
        imageReceiver.B0 = true;
        imageReceiver.K0 = true;
        imageReceiver2.B0 = true;
        imageReceiver2.K0 = true;
        int i = (int) (3.0f * f);
        this.J = i;
        int i2 = (int) (1.0f * f);
        this.K = i2;
        setPadding(i, i2, i, i2);
        this.h = b00.d(context, 2131231652);
        textPaint.setTextSize(f * 24.0f);
        textPaint.setTypeface(gl.n1("fonts/rcondensedbold.ttf"));
        kk7.i(this);
    }

    public static org.telegram.tgnet.TLRPC.Document b(org.telegram.tgnet.TLRPC.TL_messages_stickerSet r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb6.b(org.telegram.tgnet.TLRPC$TL_messages_stickerSet, java.lang.String):org.telegram.tgnet.TLRPC$Document");
    }

    public static f6 c(String str) {
        ru3 f = vu3.f(str);
        if (f instanceof uu3) {
            ((uu3) f).a = false;
        }
        if (f == null) {
            return null;
        }
        return new f6(f, (byte) 5);
    }

    public final void a(Canvas canvas) {
        float f;
        f();
        if (this.G == null) {
            return;
        }
        int i = this.J;
        float f2 = i;
        int i2 = this.K;
        float f3 = i2;
        RectF rectF = this.P;
        rectF.set(f2, f3, this.N + f2, this.O + f3);
        float f4 = this.O * 0.2f;
        canvas.drawRoundRect(rectF, f4, f4, this.f);
        boolean z = this.n;
        float f5 = this.E;
        RectF rectF2 = this.d;
        if (z) {
            float d = this.Q.d(this.M);
            if (d > 0.0f) {
                float v = de9.v(rectF2.left, 2.25f, f5, f2);
                float f6 = f5 * 21.33f;
                float z2 = oo1.z(this.O, f6, 2.0f, f3);
                ImageReceiver imageReceiver = this.s;
                imageReceiver.i0(v, z2, f6, f6);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.r(), imageReceiver.s());
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                canvas.restore();
            }
            if (d < 1.0f) {
                float v2 = de9.v(rectF2.left, 2.25f, f5, f2);
                float f7 = f5 * 21.33f;
                float z3 = oo1.z(this.O, f7, 2.0f, f3);
                ImageReceiver imageReceiver2 = this.r;
                imageReceiver2.i0(v2, z3, f7, f7);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.r(), imageReceiver2.s());
                imageReceiver2.setAlpha(1.0f - d);
                imageReceiver2.h(canvas, null);
                canvas.restore();
            }
        } else if (!this.y) {
            float f8 = rectF2.left;
            float f9 = this.O;
            float f10 = f5 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f8 * f5)) + i, ((int) ((f9 - f10) / 2.0f)) + i2, i + ((int) ((f8 + 21.33f) * f5)), i2 + ((int) ((f10 + f9) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        float f11 = rectF2.left;
        if (!this.n && !this.y) {
            f = 0.0f;
        } else {
            f = 2.25f;
        }
        canvas.translate(((f11 + f + 21.33f + 3.25f) * f5) + f2, (this.O / 2.0f) + f3);
        float f12 = this.F;
        canvas.scale(f12, f12);
        canvas.translate(-this.I, (-this.G.getHeight()) / 2.0f);
        this.G.draw(canvas);
        canvas.restore();
    }

    public final void d(int i, final String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.s;
        ImageReceiver imageReceiver2 = this.r;
        if (isEmpty) {
            this.n = false;
            this.w = null;
            this.x = null;
            imageReceiver2.f();
            imageReceiver.f();
        } else {
            this.n = true;
            this.w = null;
            this.x = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            hq6.d0(i).m0(tL_inputStickerSetShortName, 0, false, false, new p8c(this) {
                public final hb6 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r3;
                    String str2 = str;
                    hb6 hb6Var = this.b;
                    switch (b) {
                        case 0:
                            hb6Var.getClass();
                            TLRPC.Document b2 = hb6.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            hb6Var.w = b2;
                            hb6Var.r.d0(gl5.b(b2), "80_80", hb6.c(str2), null, null, 0);
                            hb6Var.s.Y(gl5.b(hb6Var.x), "80_80", gl5.b(hb6Var.w), "80_80", null, null, hb6.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            hb6Var.getClass();
                            TLRPC.Document b3 = hb6.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            hb6Var.x = b3;
                            if (b3 != null) {
                                hb6Var.s.Y(gl5.b(b3), "80_80", gl5.b(hb6Var.w), "80_80", null, null, hb6.c(str2), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            hq6.d0(i).m0(tL_inputStickerSetShortName2, 0, false, false, new p8c(this) {
                public final hb6 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r3;
                    String str2 = str;
                    hb6 hb6Var = this.b;
                    switch (b) {
                        case 0:
                            hb6Var.getClass();
                            TLRPC.Document b2 = hb6.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            hb6Var.w = b2;
                            hb6Var.r.d0(gl5.b(b2), "80_80", hb6.c(str2), null, null, 0);
                            hb6Var.s.Y(gl5.b(hb6Var.x), "80_80", gl5.b(hb6Var.w), "80_80", null, null, hb6.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            hb6Var.getClass();
                            TLRPC.Document b3 = hb6.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            hb6Var.x = b3;
                            if (b3 != null) {
                                hb6Var.s.Y(gl5.b(b3), "80_80", gl5.b(hb6Var.w), "80_80", null, null, hb6.c(str2), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            imageReceiver2.d0(gl5.b(this.w), "80_80", c(str), null, null, 0);
            imageReceiver.Y(gl5.b(this.x), "80_80", gl5.b(this.w), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.c = true;
        requestLayout();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i, int i2) {
        int i3 = -16777216;
        Paint paint = this.f;
        Drawable drawable = this.h;
        TextPaint textPaint = this.e;
        if (i == 0) {
            paint.setColor(-16777216);
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i == 1) {
            paint.setColor(1275068416);
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else if (i == 2) {
            paint.setColor(-1);
            textPaint.setColor(-16777216);
            drawable.setColorFilter(null);
        } else {
            paint.setColor(i2);
            if (gl.B(i2) < 0.721f) {
                i3 = -1;
            }
            textPaint.setColor(i3);
            drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void f() {
        float f;
        float f2;
        float min;
        if (!this.c) {
            return;
        }
        String str = this.b;
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText(str);
        int i = this.a;
        int i2 = this.J;
        float f3 = (i - i2) - i2;
        RectF rectF = this.d;
        float f4 = rectF.left;
        float f5 = 2.25f;
        if (!this.n && !this.y) {
            f = 0.0f;
        } else {
            f = 2.25f;
        }
        float f6 = this.E;
        float f7 = f3 - (((((f4 + f) + 21.33f) + 3.25f) + rectF.right) * f6);
        float min2 = Math.min(1.0f, f7 / measureText);
        this.F = min2;
        if (min2 < 0.4f) {
            f2 = 1.0f;
            String str2 = this.b;
            this.G = new StaticLayout(str2, textPaint, je5.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } else {
            f2 = 1.0f;
            this.G = new StaticLayout(this.b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.H = 0.0f;
        this.I = Float.MAX_VALUE;
        for (int i3 = 0; i3 < this.G.getLineCount(); i3++) {
            this.H = Math.max(this.H, this.G.getLineWidth(i3));
            this.I = Math.min(this.I, this.G.getLineLeft(i3));
        }
        if (this.G.getLineCount() > 2) {
            min = 0.3f;
            this.F = 0.3f;
        } else {
            min = Math.min(f2, f7 / this.H);
            this.F = min;
        }
        float f8 = rectF.left;
        if (!this.n && !this.y) {
            f5 = 0.0f;
        }
        this.N = (this.H * min) + ((f8 + f5 + 21.33f + 3.25f + rectF.right) * f6);
        this.O = Math.max(f6 * 21.33f, this.G.getHeight() * this.F) + ((rectF.top + rectF.bottom) * f6);
        this.c = false;
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        if (this.M && (document = this.x) != null) {
            return document;
        }
        return this.w;
    }

    public int getHeightInternal() {
        int round = Math.round(this.O);
        int i = this.K;
        return round + i + i;
    }

    public float getRadius() {
        return this.O * 0.2f;
    }

    public String getText() {
        return this.b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.N);
        int i = this.J;
        return round + i + i;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
        if (this.M) {
            this.s.I();
        } else {
            this.r.I();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L = false;
        this.r.K();
        this.s.K();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z) {
        if (this.M != z && this.L) {
            ImageReceiver imageReceiver = this.s;
            ImageReceiver imageReceiver2 = this.r;
            if (z) {
                imageReceiver2.K();
                imageReceiver.I();
            } else {
                imageReceiver2.I();
                imageReceiver.K();
            }
        }
        this.M = z;
        invalidate();
    }

    public void setMaxWidth(int i) {
        this.a = i;
        this.c = true;
    }

    public void setText(String str) {
        this.b = str;
        this.c = true;
        requestLayout();
    }
}
