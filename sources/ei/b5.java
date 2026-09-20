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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.w6;
public final class b5 extends Drawable implements w6, NotificationCenter.NotificationCenterDelegate {
    public final Paint f8258a;
    public final Paint f8259b;
    public final ImageReceiver f8260c;
    public final ImageReceiver d;
    public int e;
    public final p5[] f8261f;
    public final u01 h;
    public final RectF f8262n;
    public final boolean f8263r;
    public final d6 f8264s;
    public boolean v;
    public boolean f8265w;
    public View f8266x;

    public b5(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f8258a = paint;
        Paint paint2 = new Paint(1);
        this.f8259b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f8260c = imageReceiver;
        this.d = new ImageReceiver();
        this.e = 1;
        this.f8261f = new p5[2];
        this.f8262n = new RectF();
        this.f8264s = new d6(new a5(this, 1), 320L, qr.h, 0);
        this.f8263r = false;
        int i10 = j6.f19094d6;
        paint.setColor(j6.w0(null, i10, false));
        paint2.setColor(j6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), j6.l1(0.18f, -16777216));
        g9 g9Var = new g9((f6) null);
        g9Var.r(user);
        imageReceiver.setForUserOrChat(user, g9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        d();
        this.h = new u01(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void a(kj0 kj0Var) {
        this.f8266x = kj0Var;
        this.d.setParentView(kj0Var);
        this.f8260c.setParentView(kj0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f8265w = false;
        this.f8260c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        p5[] p5VarArr = this.f8261f;
        p5 p5Var = p5VarArr[0];
        if (p5Var != null) {
            p5Var.o(this.f8266x);
        }
        p5 p5Var2 = p5VarArr[1];
        if (p5Var2 != null) {
            p5Var2.o(this.f8266x);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f8265w = true;
        this.f8260c.onAttachedToWindow();
        this.d.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        p5[] p5VarArr = this.f8261f;
        p5 p5Var = p5VarArr[0];
        if (p5Var != null) {
            p5Var.a(this.f8266x);
        }
        p5 p5Var2 = p5VarArr[1];
        if (p5Var2 != null) {
            p5Var2.a(this.f8266x);
        }
    }

    public final void d() {
        p5 p5Var;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (stickerSet != null && !stickerSet.documents.isEmpty()) {
            TLRPC.Document document = stickerSet.documents.get((int) Math.floor(Math.random() * stickerSet.documents.size()));
            int i10 = 1 - this.e;
            this.e = i10;
            p5[] p5VarArr = this.f8261f;
            p5 p5Var2 = p5VarArr[i10];
            if (p5Var2 != null) {
                p5Var2.o(this.f8266x);
            }
            p5VarArr[this.e] = p5.m(UserConfig.selectedAccount, 9, document);
            p5VarArr[this.e].setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Oh, false), PorterDuff.Mode.SRC_IN));
            if (this.f8265w && (p5Var = p5VarArr[this.e]) != null) {
                p5Var.a(this.f8266x);
            }
            AndroidUtilities.runOnUIThread(new a5(this, 0), 2500L);
            return;
        }
        this.v = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad && this.v && this.f8265w) {
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
        p5 p5Var;
        p5 p5Var2;
        int i11;
        Rect bounds = getBounds();
        boolean z10 = this.f8263r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 28;
        }
        float dp = (AndroidUtilities.dp((i10 + 38) + 6.66f) + this.h.f28493c) / 2.0f;
        float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
        RectF rectF = this.f8262n;
        rectF.set(bounds.centerX() - dp, bounds.centerY() - dp2, bounds.centerX() + dp, bounds.centerY() + dp2);
        canvas.drawRoundRect(rectF, dp2, dp2, this.f8258a);
        ImageReceiver imageReceiver = this.f8260c;
        imageReceiver.setImageCoords(rectF.left, rectF.top, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        imageReceiver.draw(canvas);
        this.h.c(AndroidUtilities.dp(36.0f) + rectF.left, rectF.centerY(), 1.0f, j6.w0(null, j6.G6, false), canvas);
        if (z10) {
            float dp3 = rectF.right - AndroidUtilities.dp(22.66f);
            canvas.drawCircle(dp3, rectF.centerY(), AndroidUtilities.dp(24.0f), this.f8259b);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.setImageCoords(dp3 - AndroidUtilities.dp(16.0f), rectF.centerY() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
            imageReceiver2.draw(canvas);
            return;
        }
        float d = this.f8264s.d(this.e, false);
        canvas.save();
        canvas.translate((int) (rectF.right - AndroidUtilities.dp(30.66f)), (int) (rectF.centerY() - AndroidUtilities.dp(12.0f)));
        int i12 = -1;
        p5[] p5VarArr = this.f8261f;
        if (d < 1.0f && (p5Var2 = p5VarArr[0]) != null) {
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
            p5Var2.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            p5Var2.setAlpha((int) (f13 * 255.0f));
            p5Var2.draw(canvas);
            canvas.restore();
        } else {
            f7 = 24.0f;
            f10 = 0.4f;
            f11 = 255.0f;
            f12 = 12.0f;
        }
        if (d > 0.0f && (p5Var = p5VarArr[1]) != null) {
            canvas.save();
            if (this.e != 1) {
                i12 = 1;
            }
            canvas.translate(0.0f, (1.0f - d) * AndroidUtilities.dp(9.0f) * i12);
            float f15 = (d * f10) + 0.6f;
            canvas.scale(f15, f15, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12));
            p5Var.setBounds(0, 0, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
            p5Var.setAlpha((int) (d * f11));
            p5Var.draw(canvas);
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
        this.f8258a = paint;
        Paint paint2 = new Paint(1);
        this.f8259b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f8260c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.d = imageReceiver2;
        this.e = 1;
        this.f8261f = new p5[2];
        this.f8262n = new RectF();
        this.f8264s = new d6(new a5(this, 1), 320L, qr.h, 0);
        this.f8263r = true;
        int i10 = j6.f19094d6;
        paint.setColor(j6.w0(null, i10, false));
        paint2.setColor(j6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), j6.l1(0.18f, -16777216));
        g9 g9Var = new g9((f6) null);
        g9Var.r(user);
        imageReceiver.setForUserOrChat(user, g9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120);
        imageReceiver2.setImage(ImageLocation.getForDocument(document), "120_120", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "120_120", DocumentObject.getSvgThumb(document.thumbs, j6.f19038a7, 0.35f), 0L, null, null, 0);
        this.h = new u01(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
