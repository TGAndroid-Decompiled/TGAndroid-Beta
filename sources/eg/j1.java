package eg;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.z5;
public class j1 extends View {
    public float B;
    public StaticLayout C;
    public float D;
    public float E;
    public final int F;
    public final int G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public final RectF L;
    public final z5 M;
    public int f5295a;
    public String f5296b;
    public boolean f5297c;
    public final RectF d;
    public final TextPaint f5298e;
    public final Paint f5299f;
    public final Drawable h;
    public boolean f5300n;
    public final ImageReceiver f5301r;
    public final ImageReceiver f5302s;
    public TLRPC.Document v;
    public TLRPC.Document f5303w;
    public boolean f5304x;
    public final float f5305y;

    public j1(Context context, float f10) {
        super(context);
        this.f5296b = "";
        this.d = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f5298e = textPaint;
        this.f5299f = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f5301r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f5302s = imageReceiver2;
        this.B = 1.0f;
        this.L = new RectF();
        new Path();
        this.M = new z5(this, 350L, pr.h);
        this.f5305y = f10;
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver2.setCrossfadeWithOldImage(true);
        imageReceiver2.setInvalidateAll(true);
        int i10 = (int) (3.0f * f10);
        this.F = i10;
        int i11 = (int) (1.0f * f10);
        this.G = i11;
        setPadding(i10, i11, i10, i11);
        this.h = context.getResources().getDrawable(R.drawable.map_pin3).mutate();
        textPaint.setTextSize(f10 * 24.0f);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        NotificationCenter.listenEmojiLoading(this);
    }

    public static org.telegram.tgnet.TLRPC.Document b(java.lang.String r8, org.telegram.tgnet.TLRPC.TL_messages_stickerSet r9) {
        throw new UnsupportedOperationException("Method not decompiled: eg.j1.b(java.lang.String, org.telegram.tgnet.TLRPC$TL_messages_stickerSet):org.telegram.tgnet.TLRPC$Document");
    }

    public static i1 c(String str) {
        Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
        if (emojiBigDrawable instanceof Emoji.SimpleEmojiDrawable) {
            ((Emoji.SimpleEmojiDrawable) emojiBigDrawable).fullSize = false;
        }
        if (emojiBigDrawable == null) {
            return null;
        }
        return new i1(emojiBigDrawable, 0);
    }

    public final void a(Canvas canvas) {
        float f10;
        f();
        if (this.C == null) {
            return;
        }
        int i10 = this.F;
        float f11 = i10;
        int i11 = this.G;
        float f12 = i11;
        RectF rectF = this.L;
        rectF.set(f11, f12, this.J + f11, this.K + f12);
        float f13 = this.K * 0.2f;
        canvas.drawRoundRect(rectF, f13, f13, this.f5299f);
        boolean z4 = this.f5300n;
        float f14 = this.f5305y;
        RectF rectF2 = this.d;
        if (z4) {
            float e6 = this.M.e(this.I);
            if (e6 > 0.0f) {
                float f15 = f14 * 21.33f;
                float x10 = e2.c.x(this.K, f15, 2.0f, f12);
                ImageReceiver imageReceiver = this.f5302s;
                imageReceiver.setImageCoords(((rectF2.left + 2.25f) * f14) + f11, x10, f15, f15);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                imageReceiver.setAlpha(e6);
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (e6 < 1.0f) {
                float f16 = f14 * 21.33f;
                float x11 = e2.c.x(this.K, f16, 2.0f, f12);
                ImageReceiver imageReceiver2 = this.f5301r;
                imageReceiver2.setImageCoords(((rectF2.left + 2.25f) * f14) + f11, x11, f16, f16);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                imageReceiver2.setAlpha(1.0f - e6);
                imageReceiver2.draw(canvas);
                canvas.restore();
            }
        } else if (!this.f5304x) {
            float f17 = rectF2.left;
            float f18 = this.K;
            float f19 = f14 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f17 * f14)) + i10, ((int) ((f18 - f19) / 2.0f)) + i11, i10 + ((int) ((f17 + 21.33f) * f14)), i11 + ((int) ((f19 + f18) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        float f20 = rectF2.left;
        if (!this.f5300n && !this.f5304x) {
            f10 = 0.0f;
        } else {
            f10 = 2.25f;
        }
        canvas.translate(((f20 + f10 + 21.33f + 3.25f) * f14) + f11, (this.K / 2.0f) + f12);
        float f21 = this.B;
        canvas.scale(f21, f21);
        canvas.translate(-this.E, (-this.C.getHeight()) / 2.0f);
        this.C.draw(canvas);
        canvas.restore();
    }

    public final void d(int i10, final String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.f5302s;
        ImageReceiver imageReceiver2 = this.f5301r;
        if (isEmpty) {
            this.f5300n = false;
            this.v = null;
            this.f5303w = null;
            imageReceiver2.clearImage();
            imageReceiver.clearImage();
        } else {
            this.f5300n = true;
            this.v = null;
            this.f5303w = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new Utilities.Callback(this) {
                public final j1 f5232b;

                {
                    this.f5232b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r3) {
                        case 0:
                            j1 j1Var = this.f5232b;
                            j1Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = j1.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            j1Var.v = b10;
                            j1Var.f5301r.setImage(ImageLocation.getForDocument(b10), "80_80", j1.c(str2), null, null, 0);
                            j1Var.f5302s.setImage(ImageLocation.getForDocument(j1Var.f5303w), "80_80", ImageLocation.getForDocument(j1Var.v), "80_80", null, null, j1.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            j1 j1Var2 = this.f5232b;
                            j1Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = j1.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            j1Var2.f5303w = b11;
                            if (b11 != null) {
                                j1Var2.f5302s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(j1Var2.v), "80_80", null, null, j1.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new Utilities.Callback(this) {
                public final j1 f5232b;

                {
                    this.f5232b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r3) {
                        case 0:
                            j1 j1Var = this.f5232b;
                            j1Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = j1.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            j1Var.v = b10;
                            j1Var.f5301r.setImage(ImageLocation.getForDocument(b10), "80_80", j1.c(str2), null, null, 0);
                            j1Var.f5302s.setImage(ImageLocation.getForDocument(j1Var.f5303w), "80_80", ImageLocation.getForDocument(j1Var.v), "80_80", null, null, j1.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            j1 j1Var2 = this.f5232b;
                            j1Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = j1.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            j1Var2.f5303w = b11;
                            if (b11 != null) {
                                j1Var2.f5302s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(j1Var2.v), "80_80", null, null, j1.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            imageReceiver2.setImage(ImageLocation.getForDocument(this.v), "80_80", c(str), null, null, 0);
            imageReceiver.setImage(ImageLocation.getForDocument(this.f5303w), "80_80", ImageLocation.getForDocument(this.v), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.f5297c = true;
        requestLayout();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i10, int i11) {
        int i12 = -16777216;
        Drawable drawable = this.h;
        TextPaint textPaint = this.f5298e;
        Paint paint = this.f5299f;
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
        float f10;
        float f11;
        if (!this.f5297c) {
            return;
        }
        String str = this.f5296b;
        TextPaint textPaint = this.f5298e;
        float measureText = textPaint.measureText(str);
        int i10 = this.f5295a;
        int i11 = this.F;
        float f12 = (i10 - i11) - i11;
        RectF rectF = this.d;
        float f13 = rectF.left;
        float f14 = 2.25f;
        if (!this.f5300n && !this.f5304x) {
            f10 = 0.0f;
        } else {
            f10 = 2.25f;
        }
        float f15 = this.f5305y;
        float f16 = f12 - (((((f13 + f10) + 21.33f) + 3.25f) + rectF.right) * f15);
        float min = Math.min(1.0f, f16 / measureText);
        this.B = min;
        if (min < 0.4f) {
            f11 = 1.0f;
            String str2 = this.f5296b;
            this.C = new StaticLayout(str2, textPaint, qh.e3.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } else {
            f11 = 1.0f;
            this.C = new StaticLayout(this.f5296b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.D = 0.0f;
        this.E = Float.MAX_VALUE;
        for (int i12 = 0; i12 < this.C.getLineCount(); i12++) {
            this.D = Math.max(this.D, this.C.getLineWidth(i12));
            this.E = Math.min(this.E, this.C.getLineLeft(i12));
        }
        if (this.C.getLineCount() > 2) {
            this.B = 0.3f;
        } else {
            this.B = Math.min(f11, f16 / this.D);
        }
        float f17 = rectF.left;
        if (!this.f5300n && !this.f5304x) {
            f14 = 0.0f;
        }
        this.J = (this.D * this.B) + ((f17 + f14 + 21.33f + 3.25f + rectF.right) * f15);
        this.K = Math.max(f15 * 21.33f, this.C.getHeight() * this.B) + ((rectF.top + rectF.bottom) * f15);
        this.f5297c = false;
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        if (this.I && (document = this.f5303w) != null) {
            return document;
        }
        return this.v;
    }

    public int getHeightInternal() {
        int round = Math.round(this.K);
        int i10 = this.G;
        return round + i10 + i10;
    }

    public float getRadius() {
        return this.K * 0.2f;
    }

    public String getText() {
        return this.f5296b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.J);
        int i10 = this.F;
        return round + i10 + i10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = true;
        if (this.I) {
            this.f5302s.onAttachedToWindow();
        } else {
            this.f5301r.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H = false;
        this.f5301r.onDetachedFromWindow();
        this.f5302s.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z4) {
        if (this.I != z4 && this.H) {
            ImageReceiver imageReceiver = this.f5302s;
            ImageReceiver imageReceiver2 = this.f5301r;
            if (z4) {
                imageReceiver2.onDetachedFromWindow();
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onDetachedFromWindow();
            }
        }
        this.I = z4;
        invalidate();
    }

    public void setMaxWidth(int i10) {
        this.f5295a = i10;
        this.f5297c = true;
    }

    public void setText(String str) {
        this.f5296b = str;
        this.f5297c = true;
        requestLayout();
    }
}
