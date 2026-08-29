package bg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
public class n1 extends View {
    public float A;
    public StaticLayout B;
    public float C;
    public float D;
    public final int E;
    public final int F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public final RectF K;
    public final d6 L;
    public int f2405a;
    public String f2406b;
    public boolean f2407c;
    public final RectF d;
    public final TextPaint f2408e;
    public final Paint f2409f;
    public final Drawable h;
    public boolean f2410n;
    public final ImageReceiver f2411r;
    public final ImageReceiver f2412s;
    public TLRPC.Document v;
    public TLRPC.Document f2413w;
    public boolean f2414x;
    public final float f2415y;

    public n1(Context context, float f9) {
        super(context);
        this.f2406b = "";
        this.d = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f2408e = textPaint;
        this.f2409f = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f2411r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f2412s = imageReceiver2;
        this.A = 1.0f;
        this.K = new RectF();
        new Path();
        this.L = new d6(this, 350L, jr.h);
        this.f2415y = f9;
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver2.setCrossfadeWithOldImage(true);
        imageReceiver2.setInvalidateAll(true);
        int i10 = (int) (3.0f * f9);
        this.E = i10;
        int i11 = (int) (1.0f * f9);
        this.F = i11;
        setPadding(i10, i11, i10, i11);
        this.h = context.getResources().getDrawable(R.drawable.map_pin3).mutate();
        textPaint.setTextSize(f9 * 24.0f);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        NotificationCenter.listenEmojiLoading(this);
    }

    public static org.telegram.tgnet.TLRPC.Document b(java.lang.String r8, org.telegram.tgnet.TLRPC.TL_messages_stickerSet r9) {
        throw new UnsupportedOperationException("Method not decompiled: bg.n1.b(java.lang.String, org.telegram.tgnet.TLRPC$TL_messages_stickerSet):org.telegram.tgnet.TLRPC$Document");
    }

    public static m1 c(String str) {
        Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
        if (emojiBigDrawable instanceof Emoji.SimpleEmojiDrawable) {
            ((Emoji.SimpleEmojiDrawable) emojiBigDrawable).fullSize = false;
        }
        if (emojiBigDrawable == null) {
            return null;
        }
        return new m1(emojiBigDrawable, 0);
    }

    public final void a(Canvas canvas) {
        float f9;
        f();
        if (this.B == null) {
            return;
        }
        int i10 = this.E;
        float f10 = i10;
        int i11 = this.F;
        float f11 = i11;
        RectF rectF = this.K;
        rectF.set(f10, f11, this.I + f10, this.J + f11);
        float f12 = this.J * 0.2f;
        canvas.drawRoundRect(rectF, f12, f12, this.f2409f);
        boolean z10 = this.f2410n;
        float f13 = this.f2415y;
        RectF rectF2 = this.d;
        if (z10) {
            float e10 = this.L.e(this.H);
            if (e10 > 0.0f) {
                float f14 = f13 * 21.33f;
                float A = com.google.android.recaptcha.internal.a.A(this.J, f14, 2.0f, f11);
                ImageReceiver imageReceiver = this.f2412s;
                imageReceiver.setImageCoords(((rectF2.left + 2.25f) * f13) + f10, A, f14, f14);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                imageReceiver.setAlpha(e10);
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (e10 < 1.0f) {
                float f15 = f13 * 21.33f;
                float A2 = com.google.android.recaptcha.internal.a.A(this.J, f15, 2.0f, f11);
                ImageReceiver imageReceiver2 = this.f2411r;
                imageReceiver2.setImageCoords(((rectF2.left + 2.25f) * f13) + f10, A2, f15, f15);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                imageReceiver2.setAlpha(1.0f - e10);
                imageReceiver2.draw(canvas);
                canvas.restore();
            }
        } else if (!this.f2414x) {
            float f16 = rectF2.left;
            float f17 = this.J;
            float f18 = f13 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f16 * f13)) + i10, ((int) ((f17 - f18) / 2.0f)) + i11, i10 + ((int) ((f16 + 21.33f) * f13)), i11 + ((int) ((f18 + f17) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        float f19 = rectF2.left;
        if (!this.f2410n && !this.f2414x) {
            f9 = 0.0f;
        } else {
            f9 = 2.25f;
        }
        canvas.translate(((f19 + f9 + 21.33f + 3.25f) * f13) + f10, (this.J / 2.0f) + f11);
        float f20 = this.A;
        canvas.scale(f20, f20);
        canvas.translate(-this.D, (-this.B.getHeight()) / 2.0f);
        this.B.draw(canvas);
        canvas.restore();
    }

    public final void d(int i10, final String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.f2412s;
        ImageReceiver imageReceiver2 = this.f2411r;
        if (isEmpty) {
            this.f2410n = false;
            this.v = null;
            this.f2413w = null;
            imageReceiver2.clearImage();
            imageReceiver.clearImage();
        } else {
            this.f2410n = true;
            this.v = null;
            this.f2413w = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new Utilities.Callback(this) {
                public final n1 f2384b;

                {
                    this.f2384b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r3) {
                        case 0:
                            n1 n1Var = this.f2384b;
                            n1Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = n1.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            n1Var.v = b10;
                            n1Var.f2411r.setImage(ImageLocation.getForDocument(b10), "80_80", n1.c(str2), null, null, 0);
                            n1Var.f2412s.setImage(ImageLocation.getForDocument(n1Var.f2413w), "80_80", ImageLocation.getForDocument(n1Var.v), "80_80", null, null, n1.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            n1 n1Var2 = this.f2384b;
                            n1Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = n1.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            n1Var2.f2413w = b11;
                            if (b11 != null) {
                                n1Var2.f2412s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(n1Var2.v), "80_80", null, null, n1.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new Utilities.Callback(this) {
                public final n1 f2384b;

                {
                    this.f2384b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r3) {
                        case 0:
                            n1 n1Var = this.f2384b;
                            n1Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = n1.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            n1Var.v = b10;
                            n1Var.f2411r.setImage(ImageLocation.getForDocument(b10), "80_80", n1.c(str2), null, null, 0);
                            n1Var.f2412s.setImage(ImageLocation.getForDocument(n1Var.f2413w), "80_80", ImageLocation.getForDocument(n1Var.v), "80_80", null, null, n1.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            n1 n1Var2 = this.f2384b;
                            n1Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = n1.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            n1Var2.f2413w = b11;
                            if (b11 != null) {
                                n1Var2.f2412s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(n1Var2.v), "80_80", null, null, n1.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            imageReceiver2.setImage(ImageLocation.getForDocument(this.v), "80_80", c(str), null, null, 0);
            imageReceiver.setImage(ImageLocation.getForDocument(this.f2413w), "80_80", ImageLocation.getForDocument(this.v), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.f2407c = true;
        requestLayout();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i10, int i11) {
        int i12 = -16777216;
        Drawable drawable = this.h;
        TextPaint textPaint = this.f2408e;
        Paint paint = this.f2409f;
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
            if (AndroidUtilities.computePerceivedBrightness(i11) < 0.721f) {
                i12 = -1;
            }
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void f() {
        float f9;
        float f10;
        if (!this.f2407c) {
            return;
        }
        String str = this.f2406b;
        TextPaint textPaint = this.f2408e;
        float measureText = textPaint.measureText(str);
        int i10 = this.f2405a;
        int i11 = this.E;
        float f11 = (i10 - i11) - i11;
        RectF rectF = this.d;
        float f12 = rectF.left;
        float f13 = 2.25f;
        if (!this.f2410n && !this.f2414x) {
            f9 = 0.0f;
        } else {
            f9 = 2.25f;
        }
        float f14 = this.f2415y;
        float f15 = f11 - (((((f12 + f9) + 21.33f) + 3.25f) + rectF.right) * f14);
        float min = Math.min(1.0f, f15 / measureText);
        this.A = min;
        if (min < 0.4f) {
            f10 = 1.0f;
            String str2 = this.f2406b;
            this.B = new StaticLayout(str2, textPaint, nh.t3.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } else {
            f10 = 1.0f;
            this.B = new StaticLayout(this.f2406b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.C = 0.0f;
        this.D = Float.MAX_VALUE;
        for (int i12 = 0; i12 < this.B.getLineCount(); i12++) {
            this.C = Math.max(this.C, this.B.getLineWidth(i12));
            this.D = Math.min(this.D, this.B.getLineLeft(i12));
        }
        if (this.B.getLineCount() > 2) {
            this.A = 0.3f;
        } else {
            this.A = Math.min(f10, f15 / this.C);
        }
        float f16 = rectF.left;
        if (!this.f2410n && !this.f2414x) {
            f13 = 0.0f;
        }
        this.I = (this.C * this.A) + ((f16 + f13 + 21.33f + 3.25f + rectF.right) * f14);
        this.J = Math.max(f14 * 21.33f, this.B.getHeight() * this.A) + ((rectF.top + rectF.bottom) * f14);
        this.f2407c = false;
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        if (this.H && (document = this.f2413w) != null) {
            return document;
        }
        return this.v;
    }

    public int getHeightInternal() {
        int round = Math.round(this.J);
        int i10 = this.F;
        return round + i10 + i10;
    }

    public float getRadius() {
        return this.J * 0.2f;
    }

    public String getText() {
        return this.f2406b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.I);
        int i10 = this.E;
        return round + i10 + i10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        if (this.H) {
            this.f2412s.onAttachedToWindow();
        } else {
            this.f2411r.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        this.f2411r.onDetachedFromWindow();
        this.f2412s.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z10) {
        if (this.H != z10 && this.G) {
            ImageReceiver imageReceiver = this.f2412s;
            ImageReceiver imageReceiver2 = this.f2411r;
            if (z10) {
                imageReceiver2.onDetachedFromWindow();
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onDetachedFromWindow();
            }
        }
        this.H = z10;
        invalidate();
    }

    public void setMaxWidth(int i10) {
        this.f2405a = i10;
        this.f2407c = true;
    }

    public void setText(String str) {
        this.f2406b = str;
        this.f2407c = true;
        requestLayout();
    }
}
