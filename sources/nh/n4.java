package nh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.y8;

public final class n4 extends Drawable implements r6, NotificationCenter.NotificationCenterDelegate {

    public final Paint f18839a;

    public final Paint f18840b;

    public final ImageReceiver f18841c;
    public final ImageReceiver d;

    public int f18842e;

    public final k5[] f18843f;
    public final pz0 h;

    public final RectF f18844n;

    public final boolean f18845r;

    public final y5 f18846s;
    public boolean v;

    public boolean f18847w;

    public View f18848x;

    public n4(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f18839a = paint;
        Paint paint2 = new Paint(1);
        this.f18840b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f18841c = imageReceiver;
        this.d = new ImageReceiver();
        this.f18842e = 1;
        this.f18843f = new k5[2];
        this.f18844n = new RectF();
        this.f18846s = new y5(new m4(this, 1), 320L, er.h, 0);
        this.f18845r = false;
        int i10 = g6.f23053d6;
        paint.setColor(g6.w0(null, i10, false));
        paint2.setColor(g6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), g6.l1(0.18f, -16777216));
        y8 y8Var = new y8((c6) null);
        y8Var.r(user);
        imageReceiver.setForUserOrChat(user, y8Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        d();
        this.h = new pz0(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void a(ri0 ri0Var) {
        this.f18848x = ri0Var;
        this.d.setParentView(ri0Var);
        this.f18841c.setParentView(ri0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f18847w = false;
        this.f18841c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        k5[] k5VarArr = this.f18843f;
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.o(this.f18848x);
        }
        k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.o(this.f18848x);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f18847w = true;
        this.f18841c.onAttachedToWindow();
        this.d.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        k5[] k5VarArr = this.f18843f;
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.a(this.f18848x);
        }
        k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.a(this.f18848x);
        }
    }

    public final void d() {
        k5 k5Var;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (stickerSet == null || stickerSet.documents.isEmpty()) {
            this.v = true;
            return;
        }
        TLRPC.Document document = stickerSet.documents.get((int) Math.floor(Math.random() * ((double) stickerSet.documents.size())));
        int i10 = 1 - this.f18842e;
        this.f18842e = i10;
        k5[] k5VarArr = this.f18843f;
        k5 k5Var2 = k5VarArr[i10];
        if (k5Var2 != null) {
            k5Var2.o(this.f18848x);
        }
        k5VarArr[this.f18842e] = k5.m(UserConfig.selectedAccount, 9, document);
        k5VarArr[this.f18842e].setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.Oh, false), PorterDuff.Mode.SRC_IN));
        if (this.f18847w && (k5Var = k5VarArr[this.f18842e]) != null) {
            k5Var.a(this.f18848x);
        }
        AndroidUtilities.runOnUIThread(new m4(this, 0), 2500L);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad && this.v && this.f18847w) {
            this.v = false;
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        k5 k5Var;
        k5 k5Var2;
        Rect bounds = getBounds();
        boolean z10 = this.f18845r;
        float fDp = AndroidUtilities.dp((z10 ? 48 : 28) + 38 + 6.66f) + this.h.f31697c;
        float fDp2 = AndroidUtilities.dp(32.0f);
        float f14 = fDp / 2.0f;
        float fCenterX = bounds.centerX() - f14;
        float f15 = fDp2 / 2.0f;
        float fCenterY = bounds.centerY() - f15;
        float fCenterX2 = bounds.centerX() + f14;
        float fCenterY2 = bounds.centerY() + f15;
        RectF rectF = this.f18844n;
        rectF.set(fCenterX, fCenterY, fCenterX2, fCenterY2);
        canvas.drawRoundRect(rectF, f15, f15, this.f18839a);
        float f16 = rectF.left;
        float f17 = rectF.top;
        float fDp3 = AndroidUtilities.dp(32.0f);
        float fDp4 = AndroidUtilities.dp(32.0f);
        ImageReceiver imageReceiver = this.f18841c;
        imageReceiver.setImageCoords(f16, f17, fDp3, fDp4);
        imageReceiver.draw(canvas);
        this.h.c(AndroidUtilities.dp(36.0f) + rectF.left, rectF.centerY(), 1.0f, g6.w0(null, g6.G6, false), canvas);
        if (z10) {
            float fDp5 = rectF.right - AndroidUtilities.dp(22.66f);
            canvas.drawCircle(fDp5, rectF.centerY(), AndroidUtilities.dp(24.0f), this.f18840b);
            float fDp6 = fDp5 - AndroidUtilities.dp(16.0f);
            float fCenterY3 = rectF.centerY() - AndroidUtilities.dp(16.0f);
            float fDp7 = AndroidUtilities.dp(32.0f);
            float fDp8 = AndroidUtilities.dp(32.0f);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.setImageCoords(fDp6, fCenterY3, fDp7, fDp8);
            imageReceiver2.draw(canvas);
            return;
        }
        float fD = this.f18846s.d(this.f18842e, false);
        canvas.save();
        canvas.translate((int) (rectF.right - AndroidUtilities.dp(30.66f)), (int) (rectF.centerY() - AndroidUtilities.dp(12.0f)));
        k5[] k5VarArr = this.f18843f;
        if (fD >= 1.0f || (k5Var2 = k5VarArr[0]) == null) {
            f10 = 24.0f;
            f11 = 0.4f;
            f12 = 255.0f;
            f13 = 12.0f;
        } else {
            canvas.save();
            f10 = 24.0f;
            canvas.translate(0.0f, (this.f18842e == 0 ? -1 : 1) * AndroidUtilities.dp(9.0f) * fD);
            float f18 = 1.0f - fD;
            f12 = 255.0f;
            float f19 = (f18 * 0.4f) + 0.6f;
            f11 = 0.4f;
            f13 = 12.0f;
            canvas.scale(f19, f19, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            k5Var2.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            k5Var2.setAlpha((int) (f18 * 255.0f));
            k5Var2.draw(canvas);
            canvas.restore();
        }
        if (fD > 0.0f && (k5Var = k5VarArr[1]) != null) {
            canvas.save();
            canvas.translate(0.0f, (1.0f - fD) * AndroidUtilities.dp(9.0f) * (this.f18842e != 1 ? 1 : -1));
            float f20 = (fD * f11) + 0.6f;
            canvas.scale(f20, f20, AndroidUtilities.dp(f13), AndroidUtilities.dp(f13));
            k5Var.setBounds(0, 0, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            k5Var.setAlpha((int) (fD * f12));
            k5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public n4(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.f18839a = paint;
        Paint paint2 = new Paint(1);
        this.f18840b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f18841c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.d = imageReceiver2;
        this.f18842e = 1;
        this.f18843f = new k5[2];
        this.f18844n = new RectF();
        this.f18846s = new y5(new m4(this, 1), 320L, er.h, 0);
        this.f18845r = true;
        int i10 = g6.f23053d6;
        paint.setColor(g6.w0(null, i10, false));
        paint2.setColor(g6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), g6.l1(0.18f, -16777216));
        y8 y8Var = new y8((c6) null);
        y8Var.r(user);
        imageReceiver.setForUserOrChat(user, y8Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        imageReceiver2.setImage(ImageLocation.getForDocument(document), "120_120", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document), "120_120", DocumentObject.getSvgThumb(document.thumbs, g6.f22999a7, 0.35f), 0L, null, null, 0);
        this.h = new pz0(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
