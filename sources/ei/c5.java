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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.x6;
public final class c5 extends Drawable implements x6, NotificationCenter.NotificationCenterDelegate {
    public final Paint f8966a;
    public final Paint f8967b;
    public final ImageReceiver f8968c;
    public final ImageReceiver d;
    public int f8969e;
    public final q5[] f8970f;
    public final e11 h;
    public final RectF f8971n;
    public final boolean f8972r;
    public final e6 f8973s;
    public boolean v;
    public boolean f8974w;
    public View f8975x;

    public c5(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f8966a = paint;
        Paint paint2 = new Paint(1);
        this.f8967b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f8968c = imageReceiver;
        this.d = new ImageReceiver();
        this.f8969e = 1;
        this.f8970f = new q5[2];
        this.f8971n = new RectF();
        this.f8973s = new e6(new b5(this, 1), 320L, tr.h, 0);
        this.f8972r = false;
        int i10 = i6.f20818d6;
        paint.setColor(i6.w0(null, i10, false));
        paint2.setColor(i6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), i6.l1(0.18f, -16777216));
        h9 h9Var = new h9((d6) null);
        h9Var.r(user);
        imageReceiver.setForUserOrChat(user, h9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        d();
        this.h = new e11(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void a(nj0 nj0Var) {
        this.f8975x = nj0Var;
        this.d.setParentView(nj0Var);
        this.f8968c.setParentView(nj0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f8974w = false;
        this.f8968c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        q5[] q5VarArr = this.f8970f;
        q5 q5Var = q5VarArr[0];
        if (q5Var != null) {
            q5Var.o(this.f8975x);
        }
        q5 q5Var2 = q5VarArr[1];
        if (q5Var2 != null) {
            q5Var2.o(this.f8975x);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f8974w = true;
        this.f8968c.onAttachedToWindow();
        this.d.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        q5[] q5VarArr = this.f8970f;
        q5 q5Var = q5VarArr[0];
        if (q5Var != null) {
            q5Var.a(this.f8975x);
        }
        q5 q5Var2 = q5VarArr[1];
        if (q5Var2 != null) {
            q5Var2.a(this.f8975x);
        }
    }

    public final void d() {
        q5 q5Var;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (stickerSet != null && !stickerSet.documents.isEmpty()) {
            TLRPC.Document document = stickerSet.documents.get((int) Math.floor(Math.random() * stickerSet.documents.size()));
            int i10 = 1 - this.f8969e;
            this.f8969e = i10;
            q5[] q5VarArr = this.f8970f;
            q5 q5Var2 = q5VarArr[i10];
            if (q5Var2 != null) {
                q5Var2.o(this.f8975x);
            }
            q5VarArr[this.f8969e] = q5.m(UserConfig.selectedAccount, 9, document);
            q5VarArr[this.f8969e].setColorFilter(new PorterDuffColorFilter(i6.w0(null, i6.Oh, false), PorterDuff.Mode.SRC_IN));
            if (this.f8974w && (q5Var = q5VarArr[this.f8969e]) != null) {
                q5Var.a(this.f8975x);
            }
            AndroidUtilities.runOnUIThread(new b5(this, 0), 2500L);
            return;
        }
        this.v = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad && this.v && this.f8974w) {
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
        q5 q5Var;
        q5 q5Var2;
        int i11;
        Rect bounds = getBounds();
        boolean z10 = this.f8972r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 28;
        }
        float dp = (AndroidUtilities.dp((i10 + 38) + 6.66f) + this.h.f25879c) / 2.0f;
        float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
        RectF rectF = this.f8971n;
        rectF.set(bounds.centerX() - dp, bounds.centerY() - dp2, bounds.centerX() + dp, bounds.centerY() + dp2);
        canvas.drawRoundRect(rectF, dp2, dp2, this.f8966a);
        ImageReceiver imageReceiver = this.f8968c;
        imageReceiver.setImageCoords(rectF.left, rectF.top, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        imageReceiver.draw(canvas);
        this.h.c(AndroidUtilities.dp(36.0f) + rectF.left, rectF.centerY(), 1.0f, i6.w0(null, i6.G6, false), canvas);
        if (z10) {
            float dp3 = rectF.right - AndroidUtilities.dp(22.66f);
            canvas.drawCircle(dp3, rectF.centerY(), AndroidUtilities.dp(24.0f), this.f8967b);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.setImageCoords(dp3 - AndroidUtilities.dp(16.0f), rectF.centerY() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
            imageReceiver2.draw(canvas);
            return;
        }
        float d = this.f8973s.d(this.f8969e, false);
        canvas.save();
        canvas.translate((int) (rectF.right - AndroidUtilities.dp(30.66f)), (int) (rectF.centerY() - AndroidUtilities.dp(12.0f)));
        int i12 = -1;
        q5[] q5VarArr = this.f8970f;
        if (d < 1.0f && (q5Var2 = q5VarArr[0]) != null) {
            canvas.save();
            f7 = 24.0f;
            if (this.f8969e == 0) {
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
            q5Var2.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            q5Var2.setAlpha((int) (f13 * 255.0f));
            q5Var2.draw(canvas);
            canvas.restore();
        } else {
            f7 = 24.0f;
            f10 = 0.4f;
            f11 = 255.0f;
            f12 = 12.0f;
        }
        if (d > 0.0f && (q5Var = q5VarArr[1]) != null) {
            canvas.save();
            if (this.f8969e != 1) {
                i12 = 1;
            }
            canvas.translate(0.0f, (1.0f - d) * AndroidUtilities.dp(9.0f) * i12);
            float f15 = (d * f10) + 0.6f;
            canvas.scale(f15, f15, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12));
            q5Var.setBounds(0, 0, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
            q5Var.setAlpha((int) (d * f11));
            q5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public c5(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.f8966a = paint;
        Paint paint2 = new Paint(1);
        this.f8967b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f8968c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.d = imageReceiver2;
        this.f8969e = 1;
        this.f8970f = new q5[2];
        this.f8971n = new RectF();
        this.f8973s = new e6(new b5(this, 1), 320L, tr.h, 0);
        this.f8972r = true;
        int i10 = i6.f20818d6;
        paint.setColor(i6.w0(null, i10, false));
        paint2.setColor(i6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), i6.l1(0.18f, -16777216));
        h9 h9Var = new h9((d6) null);
        h9Var.r(user);
        imageReceiver.setForUserOrChat(user, h9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120);
        imageReceiver2.setImage(ImageLocation.getForDocument(document), "120_120", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "120_120", DocumentObject.getSvgThumb(document.thumbs, i6.f20762a7, 0.35f), 0L, null, null, 0);
        this.h = new e11(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
