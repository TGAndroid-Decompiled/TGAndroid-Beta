package ei;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v6;
public final class b5 extends Drawable implements v6, NotificationCenter.NotificationCenterDelegate {
    public final Paint f8253a;
    public final Paint f8254b;
    public final ImageReceiver f8255c;
    public final ImageReceiver d;
    public int e;
    public final o5[] f8256f;
    public final g01 h;
    public final RectF f8257n;
    public final boolean f8258r;
    public final c6 f8259s;
    public boolean v;
    public boolean f8260w;
    public View f8261x;

    public b5(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f8253a = paint;
        Paint paint2 = new Paint(1);
        this.f8254b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f8255c = imageReceiver;
        this.d = new ImageReceiver();
        this.e = 1;
        this.f8256f = new o5[2];
        this.f8257n = new RectF();
        this.f8259s = new c6(new a5(this, 1), 320L, qr.h, 0);
        this.f8258r = false;
        int i10 = i6.f18836d6;
        paint.setColor(i6.w0(null, i10, false));
        paint2.setColor(i6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), i6.l1(0.18f, -16777216));
        f9 f9Var = new f9((e6) null);
        f9Var.r(user);
        imageReceiver.setForUserOrChat(user, f9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        d();
        this.h = new g01(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void a(aj0 aj0Var) {
        this.f8261x = aj0Var;
        this.d.setParentView(aj0Var);
        this.f8255c.setParentView(aj0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f8260w = false;
        this.f8255c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        o5[] o5VarArr = this.f8256f;
        o5 o5Var = o5VarArr[0];
        if (o5Var != null) {
            o5Var.o(this.f8261x);
        }
        o5 o5Var2 = o5VarArr[1];
        if (o5Var2 != null) {
            o5Var2.o(this.f8261x);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f8260w = true;
        this.f8255c.onAttachedToWindow();
        this.d.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        o5[] o5VarArr = this.f8256f;
        o5 o5Var = o5VarArr[0];
        if (o5Var != null) {
            o5Var.a(this.f8261x);
        }
        o5 o5Var2 = o5VarArr[1];
        if (o5Var2 != null) {
            o5Var2.a(this.f8261x);
        }
    }

    public final void d() {
        o5 o5Var;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (stickerSet != null && !stickerSet.documents.isEmpty()) {
            TLRPC.Document document = stickerSet.documents.get((int) Math.floor(Math.random() * stickerSet.documents.size()));
            int i10 = 1 - this.e;
            this.e = i10;
            o5[] o5VarArr = this.f8256f;
            o5 o5Var2 = o5VarArr[i10];
            if (o5Var2 != null) {
                o5Var2.o(this.f8261x);
            }
            o5VarArr[this.e] = o5.m(UserConfig.selectedAccount, 9, document);
            o5VarArr[this.e].setColorFilter(new PorterDuffColorFilter(i6.w0(null, i6.Oh, false), PorterDuff.Mode.SRC_IN));
            if (this.f8260w && (o5Var = o5VarArr[this.e]) != null) {
                o5Var.a(this.f8261x);
            }
            AndroidUtilities.runOnUIThread(new a5(this, 0), 2500L);
            return;
        }
        this.v = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad && this.v && this.f8260w) {
            this.v = false;
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        o5 o5Var;
        o5 o5Var2;
        int i11;
        Rect bounds = getBounds();
        boolean z10 = this.f8258r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 28;
        }
        float dp = (AndroidUtilities.dp((i10 + 38) + 6.66f) + this.h.f24149c) / 2.0f;
        float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
        RectF rectF = this.f8257n;
        rectF.set(bounds.centerX() - dp, bounds.centerY() - dp2, bounds.centerX() + dp, bounds.centerY() + dp2);
        canvas.drawRoundRect(rectF, dp2, dp2, this.f8253a);
        ImageReceiver imageReceiver = this.f8255c;
        imageReceiver.setImageCoords(rectF.left, rectF.top, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        imageReceiver.draw(canvas);
        this.h.c(AndroidUtilities.dp(36.0f) + rectF.left, rectF.centerY(), 1.0f, i6.w0(null, i6.G6, false), canvas);
        if (z10) {
            float dp3 = rectF.right - AndroidUtilities.dp(22.66f);
            canvas.drawCircle(dp3, rectF.centerY(), AndroidUtilities.dp(24.0f), this.f8254b);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.setImageCoords(dp3 - AndroidUtilities.dp(16.0f), rectF.centerY() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
            imageReceiver2.draw(canvas);
            return;
        }
        float d = this.f8259s.d(this.e, false);
        canvas.save();
        canvas.translate((int) (rectF.right - AndroidUtilities.dp(30.66f)), (int) (rectF.centerY() - AndroidUtilities.dp(12.0f)));
        int i12 = -1;
        o5[] o5VarArr = this.f8256f;
        if (d < 1.0f && (o5Var2 = o5VarArr[0]) != null) {
            canvas.save();
            f7 = 24.0f;
            if (this.e == 0) {
                i11 = -1;
            } else {
                i11 = 1;
            }
            canvas.translate(0.0f, i11 * AndroidUtilities.dp(9.0f) * d);
            float f13 = 1.0f - d;
            f11 = 255.0f;
            float f14 = (f13 * 0.4f) + 0.6f;
            f10 = 0.4f;
            f12 = 12.0f;
            canvas.scale(f14, f14, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            o5Var2.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            o5Var2.setAlpha((int) (f13 * 255.0f));
            o5Var2.draw(canvas);
            canvas.restore();
        } else {
            f7 = 24.0f;
            f10 = 0.4f;
            f11 = 255.0f;
            f12 = 12.0f;
        }
        if (d > 0.0f && (o5Var = o5VarArr[1]) != null) {
            canvas.save();
            if (this.e != 1) {
                i12 = 1;
            }
            canvas.translate(0.0f, (1.0f - d) * AndroidUtilities.dp(9.0f) * i12);
            float f15 = (d * f10) + 0.6f;
            canvas.scale(f15, f15, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12));
            o5Var.setBounds(0, 0, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
            o5Var.setAlpha((int) (d * f11));
            o5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public b5(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.f8253a = paint;
        Paint paint2 = new Paint(1);
        this.f8254b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f8255c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.d = imageReceiver2;
        this.e = 1;
        this.f8256f = new o5[2];
        this.f8257n = new RectF();
        this.f8259s = new c6(new a5(this, 1), 320L, qr.h, 0);
        this.f8258r = true;
        int i10 = i6.f18836d6;
        paint.setColor(i6.w0(null, i10, false));
        paint2.setColor(i6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), i6.l1(0.18f, -16777216));
        f9 f9Var = new f9((e6) null);
        f9Var.r(user);
        imageReceiver.setForUserOrChat(user, f9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120);
        imageReceiver2.setImage(ImageLocation.getForDocument(document), "120_120", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "120_120", DocumentObject.getSvgThumb(document.thumbs, i6.f18780a7, 0.35f), 0L, null, null, 0);
        this.h = new g01(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
