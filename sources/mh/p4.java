package mh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.z8;
public final class p4 extends Drawable implements r6, NotificationCenter.NotificationCenterDelegate {
    public final Paint f18036a;
    public final Paint f18037b;
    public final ImageReceiver f18038c;
    public final ImageReceiver d;
    public int f18039e;
    public final k5[] f18040f;
    public final nz0 h;
    public final RectF f18041n;
    public final boolean f18042r;
    public final y5 f18043s;
    public boolean v;
    public boolean f18044w;
    public View f18045x;

    public p4(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f18036a = paint;
        Paint paint2 = new Paint(1);
        this.f18037b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f18038c = imageReceiver;
        this.d = new ImageReceiver();
        this.f18039e = 1;
        this.f18040f = new k5[2];
        this.f18041n = new RectF();
        this.f18043s = new y5(new o4(this, 1), 320L, gr.h, 0);
        this.f18042r = false;
        int i9 = f6.f23001d6;
        paint.setColor(f6.w0(null, i9, false));
        paint2.setColor(f6.w0(null, i9, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), f6.l1(0.18f, -16777216));
        z8 z8Var = new z8((b6) null);
        z8Var.r(user);
        imageReceiver.setForUserOrChat(user, z8Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        d();
        this.h = new nz0(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void a(pi0 pi0Var) {
        this.f18045x = pi0Var;
        this.d.setParentView(pi0Var);
        this.f18038c.setParentView(pi0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f18044w = false;
        this.f18038c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        k5[] k5VarArr = this.f18040f;
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.o(this.f18045x);
        }
        k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.o(this.f18045x);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f18044w = true;
        this.f18038c.onAttachedToWindow();
        this.d.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        k5[] k5VarArr = this.f18040f;
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.a(this.f18045x);
        }
        k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.a(this.f18045x);
        }
    }

    public final void d() {
        k5 k5Var;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (stickerSet != null && !stickerSet.documents.isEmpty()) {
            TLRPC.Document document = stickerSet.documents.get((int) Math.floor(Math.random() * stickerSet.documents.size()));
            int i9 = 1 - this.f18039e;
            this.f18039e = i9;
            k5[] k5VarArr = this.f18040f;
            k5 k5Var2 = k5VarArr[i9];
            if (k5Var2 != null) {
                k5Var2.o(this.f18045x);
            }
            k5VarArr[this.f18039e] = k5.m(UserConfig.selectedAccount, 9, document);
            k5VarArr[this.f18039e].setColorFilter(new PorterDuffColorFilter(f6.w0(null, f6.Oh, false), PorterDuff.Mode.SRC_IN));
            if (this.f18044w && (k5Var = k5VarArr[this.f18039e]) != null) {
                k5Var.a(this.f18045x);
            }
            AndroidUtilities.runOnUIThread(new o4(this, 0), 2500L);
            return;
        }
        this.v = true;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.groupStickersDidLoad && this.v && this.f18044w) {
            this.v = false;
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int i9;
        float f10;
        float f11;
        float f12;
        float f13;
        k5 k5Var;
        k5 k5Var2;
        int i10;
        Rect bounds = getBounds();
        boolean z10 = this.f18042r;
        if (z10) {
            i9 = 48;
        } else {
            i9 = 28;
        }
        float dp = (AndroidUtilities.dp((i9 + 38) + 6.66f) + this.h.f31223c) / 2.0f;
        float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
        RectF rectF = this.f18041n;
        rectF.set(bounds.centerX() - dp, bounds.centerY() - dp2, bounds.centerX() + dp, bounds.centerY() + dp2);
        canvas.drawRoundRect(rectF, dp2, dp2, this.f18036a);
        ImageReceiver imageReceiver = this.f18038c;
        imageReceiver.setImageCoords(rectF.left, rectF.top, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        imageReceiver.draw(canvas);
        this.h.c(AndroidUtilities.dp(36.0f) + rectF.left, rectF.centerY(), 1.0f, f6.w0(null, f6.G6, false), canvas);
        if (z10) {
            float dp3 = rectF.right - AndroidUtilities.dp(22.66f);
            canvas.drawCircle(dp3, rectF.centerY(), AndroidUtilities.dp(24.0f), this.f18037b);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.setImageCoords(dp3 - AndroidUtilities.dp(16.0f), rectF.centerY() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
            imageReceiver2.draw(canvas);
            return;
        }
        float d = this.f18043s.d(this.f18039e, false);
        canvas.save();
        canvas.translate((int) (rectF.right - AndroidUtilities.dp(30.66f)), (int) (rectF.centerY() - AndroidUtilities.dp(12.0f)));
        int i11 = -1;
        k5[] k5VarArr = this.f18040f;
        if (d < 1.0f && (k5Var2 = k5VarArr[0]) != null) {
            canvas.save();
            f10 = 24.0f;
            if (this.f18039e == 0) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            canvas.translate(0.0f, i10 * AndroidUtilities.dp(9.0f) * d);
            float f14 = 1.0f - d;
            f12 = 255.0f;
            float f15 = (f14 * 0.4f) + 0.6f;
            f11 = 0.4f;
            f13 = 12.0f;
            canvas.scale(f15, f15, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            k5Var2.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            k5Var2.setAlpha((int) (f14 * 255.0f));
            k5Var2.draw(canvas);
            canvas.restore();
        } else {
            f10 = 24.0f;
            f11 = 0.4f;
            f12 = 255.0f;
            f13 = 12.0f;
        }
        if (d > 0.0f && (k5Var = k5VarArr[1]) != null) {
            canvas.save();
            if (this.f18039e != 1) {
                i11 = 1;
            }
            canvas.translate(0.0f, (1.0f - d) * AndroidUtilities.dp(9.0f) * i11);
            float f16 = (d * f11) + 0.6f;
            canvas.scale(f16, f16, AndroidUtilities.dp(f13), AndroidUtilities.dp(f13));
            k5Var.setBounds(0, 0, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            k5Var.setAlpha((int) (d * f12));
            k5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public p4(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.f18036a = paint;
        Paint paint2 = new Paint(1);
        this.f18037b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f18038c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.d = imageReceiver2;
        this.f18039e = 1;
        this.f18040f = new k5[2];
        this.f18041n = new RectF();
        this.f18043s = new y5(new o4(this, 1), 320L, gr.h, 0);
        this.f18042r = true;
        int i9 = f6.f23001d6;
        paint.setColor(f6.w0(null, i9, false));
        paint2.setColor(f6.w0(null, i9, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), f6.l1(0.18f, -16777216));
        z8 z8Var = new z8((b6) null);
        z8Var.r(user);
        imageReceiver.setForUserOrChat(user, z8Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120);
        imageReceiver2.setImage(ImageLocation.getForDocument(document), "120_120", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "120_120", DocumentObject.getSvgThumb(document.thumbs, f6.f22947a7, 0.35f), 0L, null, null, 0);
        this.h = new nz0(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
