package dg;

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
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.z5;
public class l1 extends View {
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
    public int f4646a;
    public String f4647b;
    public boolean f4648c;
    public final RectF d;
    public final TextPaint e;
    public final Paint f4649f;
    public final Drawable h;
    public boolean f4650n;
    public final ImageReceiver f4651r;
    public final ImageReceiver f4652s;
    public TLRPC.Document v;
    public TLRPC.Document f4653w;
    public boolean f4654x;
    public final float f4655y;

    public l1(Context context, float f10) {
        super(context);
        this.f4647b = "";
        this.d = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        this.f4649f = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f4651r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f4652s = imageReceiver2;
        this.B = 1.0f;
        this.L = new RectF();
        new Path();
        this.M = new z5(this, 350L, mr.h);
        this.f4655y = f10;
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
        throw new UnsupportedOperationException("Method not decompiled: dg.l1.b(java.lang.String, org.telegram.tgnet.TLRPC$TL_messages_stickerSet):org.telegram.tgnet.TLRPC$Document");
    }

    public static k1 c(String str) {
        Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
        if (emojiBigDrawable instanceof Emoji.SimpleEmojiDrawable) {
            ((Emoji.SimpleEmojiDrawable) emojiBigDrawable).fullSize = false;
        }
        if (emojiBigDrawable == null) {
            return null;
        }
        return new k1(emojiBigDrawable, 0);
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
        canvas.drawRoundRect(rectF, f13, f13, this.f4649f);
        boolean z4 = this.f4650n;
        float f14 = this.f4655y;
        RectF rectF2 = this.d;
        if (z4) {
            float e = this.M.e(this.I);
            if (e > 0.0f) {
                float f15 = f14 * 21.33f;
                float x10 = e2.c.x(this.K, f15, 2.0f, f12);
                ImageReceiver imageReceiver = this.f4652s;
                imageReceiver.setImageCoords(((rectF2.left + 2.25f) * f14) + f11, x10, f15, f15);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (e < 1.0f) {
                float f16 = f14 * 21.33f;
                float x11 = e2.c.x(this.K, f16, 2.0f, f12);
                ImageReceiver imageReceiver2 = this.f4651r;
                imageReceiver2.setImageCoords(((rectF2.left + 2.25f) * f14) + f11, x11, f16, f16);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                imageReceiver2.setAlpha(1.0f - e);
                imageReceiver2.draw(canvas);
                canvas.restore();
            }
        } else if (!this.f4654x) {
            float f17 = rectF2.left;
            float f18 = this.K;
            float f19 = f14 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f17 * f14)) + i10, ((int) ((f18 - f19) / 2.0f)) + i11, i10 + ((int) ((f17 + 21.33f) * f14)), i11 + ((int) ((f19 + f18) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        float f20 = rectF2.left;
        if (!this.f4650n && !this.f4654x) {
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
        ImageReceiver imageReceiver = this.f4652s;
        ImageReceiver imageReceiver2 = this.f4651r;
        if (isEmpty) {
            this.f4650n = false;
            this.v = null;
            this.f4653w = null;
            imageReceiver2.clearImage();
            imageReceiver.clearImage();
        } else {
            this.f4650n = true;
            this.v = null;
            this.f4653w = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new Utilities.Callback(this) {
                public final l1 f4610b;

                {
                    this.f4610b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r3) {
                        case 0:
                            l1 l1Var = this.f4610b;
                            l1Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = l1.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            l1Var.v = b10;
                            l1Var.f4651r.setImage(ImageLocation.getForDocument(b10), "80_80", l1.c(str2), null, null, 0);
                            l1Var.f4652s.setImage(ImageLocation.getForDocument(l1Var.f4653w), "80_80", ImageLocation.getForDocument(l1Var.v), "80_80", null, null, l1.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            l1 l1Var2 = this.f4610b;
                            l1Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = l1.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            l1Var2.f4653w = b11;
                            if (b11 != null) {
                                l1Var2.f4652s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(l1Var2.v), "80_80", null, null, l1.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new Utilities.Callback(this) {
                public final l1 f4610b;

                {
                    this.f4610b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r3) {
                        case 0:
                            l1 l1Var = this.f4610b;
                            l1Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = l1.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            l1Var.v = b10;
                            l1Var.f4651r.setImage(ImageLocation.getForDocument(b10), "80_80", l1.c(str2), null, null, 0);
                            l1Var.f4652s.setImage(ImageLocation.getForDocument(l1Var.f4653w), "80_80", ImageLocation.getForDocument(l1Var.v), "80_80", null, null, l1.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            l1 l1Var2 = this.f4610b;
                            l1Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = l1.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            l1Var2.f4653w = b11;
                            if (b11 != null) {
                                l1Var2.f4652s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(l1Var2.v), "80_80", null, null, l1.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            imageReceiver2.setImage(ImageLocation.getForDocument(this.v), "80_80", c(str), null, null, 0);
            imageReceiver.setImage(ImageLocation.getForDocument(this.f4653w), "80_80", ImageLocation.getForDocument(this.v), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.f4648c = true;
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
        Paint paint = this.f4649f;
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
        if (!this.f4648c) {
            return;
        }
        String str = this.f4647b;
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText(str);
        int i10 = this.f4646a;
        int i11 = this.F;
        float f12 = (i10 - i11) - i11;
        RectF rectF = this.d;
        float f13 = rectF.left;
        float f14 = 2.25f;
        if (!this.f4650n && !this.f4654x) {
            f10 = 0.0f;
        } else {
            f10 = 2.25f;
        }
        float f15 = this.f4655y;
        float f16 = f12 - (((((f13 + f10) + 21.33f) + 3.25f) + rectF.right) * f15);
        float min = Math.min(1.0f, f16 / measureText);
        this.B = min;
        if (min < 0.4f) {
            f11 = 1.0f;
            String str2 = this.f4647b;
            this.C = new StaticLayout(str2, textPaint, ph.f3.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } else {
            f11 = 1.0f;
            this.C = new StaticLayout(this.f4647b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
        if (!this.f4650n && !this.f4654x) {
            f14 = 0.0f;
        }
        this.J = (this.D * this.B) + ((f17 + f14 + 21.33f + 3.25f + rectF.right) * f15);
        this.K = Math.max(f15 * 21.33f, this.C.getHeight() * this.B) + ((rectF.top + rectF.bottom) * f15);
        this.f4648c = false;
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        if (this.I && (document = this.f4653w) != null) {
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
        return this.f4647b;
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
            this.f4652s.onAttachedToWindow();
        } else {
            this.f4651r.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H = false;
        this.f4651r.onDetachedFromWindow();
        this.f4652s.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z4) {
        if (this.I != z4 && this.H) {
            ImageReceiver imageReceiver = this.f4652s;
            ImageReceiver imageReceiver2 = this.f4651r;
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
        this.f4646a = i10;
        this.f4648c = true;
    }

    public void setText(String str) {
        this.f4647b = str;
        this.f4648c = true;
        requestLayout();
    }
}
