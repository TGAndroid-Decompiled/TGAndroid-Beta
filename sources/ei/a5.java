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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.z6;
public final class a5 extends Drawable implements z6, NotificationCenter.NotificationCenterDelegate {
    public final Paint f8942a;
    public final Paint f8943b;
    public final ImageReceiver f8944c;
    public final ImageReceiver d;
    public int f8945e;
    public final s5[] f8946f;
    public final n11 h;
    public final RectF f8947n;
    public final boolean f8948r;
    public final g6 f8949s;
    public boolean v;
    public boolean f8950w;
    public View f8951x;

    public a5(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f8942a = paint;
        Paint paint2 = new Paint(1);
        this.f8943b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f8944c = imageReceiver;
        this.d = new ImageReceiver();
        this.f8945e = 1;
        this.f8946f = new s5[2];
        this.f8947n = new RectF();
        this.f8949s = new g6(new z4(this, 1), 320L, is.h, 0);
        this.f8948r = false;
        int i10 = h6.f20786d6;
        paint.setColor(h6.x0(null, i10, false));
        paint2.setColor(h6.x0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), h6.m1(0.18f, -16777216));
        j9 j9Var = new j9((d6) null);
        j9Var.r(user);
        imageReceiver.setForUserOrChat(user, j9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        d();
        this.h = new n11(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void a(hk0 hk0Var) {
        this.f8951x = hk0Var;
        this.d.setParentView(hk0Var);
        this.f8944c.setParentView(hk0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f8950w = false;
        this.f8944c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        s5[] s5VarArr = this.f8946f;
        s5 s5Var = s5VarArr[0];
        if (s5Var != null) {
            s5Var.o(this.f8951x);
        }
        s5 s5Var2 = s5VarArr[1];
        if (s5Var2 != null) {
            s5Var2.o(this.f8951x);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f8950w = true;
        this.f8944c.onAttachedToWindow();
        this.d.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        s5[] s5VarArr = this.f8946f;
        s5 s5Var = s5VarArr[0];
        if (s5Var != null) {
            s5Var.a(this.f8951x);
        }
        s5 s5Var2 = s5VarArr[1];
        if (s5Var2 != null) {
            s5Var2.a(this.f8951x);
        }
    }

    public final void d() {
        s5 s5Var;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (stickerSet != null && !stickerSet.documents.isEmpty()) {
            TLRPC.Document document = stickerSet.documents.get((int) Math.floor(Math.random() * stickerSet.documents.size()));
            int i10 = 1 - this.f8945e;
            this.f8945e = i10;
            s5[] s5VarArr = this.f8946f;
            s5 s5Var2 = s5VarArr[i10];
            if (s5Var2 != null) {
                s5Var2.o(this.f8951x);
            }
            s5VarArr[this.f8945e] = s5.m(UserConfig.selectedAccount, 9, document);
            s5VarArr[this.f8945e].setColorFilter(new PorterDuffColorFilter(h6.x0(null, h6.Oh, false), PorterDuff.Mode.SRC_IN));
            if (this.f8950w && (s5Var = s5VarArr[this.f8945e]) != null) {
                s5Var.a(this.f8951x);
            }
            AndroidUtilities.runOnUIThread(new z4(this, 0), 2500L);
            return;
        }
        this.v = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad && this.v && this.f8950w) {
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
        s5 s5Var;
        s5 s5Var2;
        int i11;
        Rect bounds = getBounds();
        boolean z10 = this.f8948r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 28;
        }
        float dp = (AndroidUtilities.dp((i10 + 38) + 6.66f) + this.h.f28902c) / 2.0f;
        float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
        RectF rectF = this.f8947n;
        rectF.set(bounds.centerX() - dp, bounds.centerY() - dp2, bounds.centerX() + dp, bounds.centerY() + dp2);
        canvas.drawRoundRect(rectF, dp2, dp2, this.f8942a);
        ImageReceiver imageReceiver = this.f8944c;
        imageReceiver.setImageCoords(rectF.left, rectF.top, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        imageReceiver.draw(canvas);
        this.h.c(AndroidUtilities.dp(36.0f) + rectF.left, rectF.centerY(), 1.0f, h6.x0(null, h6.G6, false), canvas);
        if (z10) {
            float dp3 = rectF.right - AndroidUtilities.dp(22.66f);
            canvas.drawCircle(dp3, rectF.centerY(), AndroidUtilities.dp(24.0f), this.f8943b);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.setImageCoords(dp3 - AndroidUtilities.dp(16.0f), rectF.centerY() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
            imageReceiver2.draw(canvas);
            return;
        }
        float d = this.f8949s.d(this.f8945e, false);
        canvas.save();
        canvas.translate((int) (rectF.right - AndroidUtilities.dp(30.66f)), (int) (rectF.centerY() - AndroidUtilities.dp(12.0f)));
        int i12 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        int i13 = -1;
        s5[] s5VarArr = this.f8946f;
        if (i12 < 0 && (s5Var2 = s5VarArr[0]) != null) {
            canvas.save();
            f7 = 24.0f;
            if (this.f8945e == 0) {
                i11 = -1;
            } else {
                i11 = 1;
            }
            canvas.translate(0.0f, i11 * AndroidUtilities.dp(9.0f) * d);
            float f13 = 1.0f - d;
            f10 = 1.0f;
            float f14 = (f13 * 0.4f) + 0.6f;
            f11 = 12.0f;
            f12 = 255.0f;
            canvas.scale(f14, f14, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            s5Var2.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            s5Var2.setAlpha((int) (f13 * 255.0f));
            s5Var2.draw(canvas);
            canvas.restore();
        } else {
            f7 = 24.0f;
            f10 = 1.0f;
            f11 = 12.0f;
            f12 = 255.0f;
        }
        if (d > 0.0f && (s5Var = s5VarArr[1]) != null) {
            canvas.save();
            if (this.f8945e != 1) {
                i13 = 1;
            }
            canvas.translate(0.0f, (f10 - d) * AndroidUtilities.dp(9.0f) * i13);
            float f15 = (0.4f * d) + 0.6f;
            canvas.scale(f15, f15, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
            s5Var.setBounds(0, 0, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
            s5Var.setAlpha((int) (d * f12));
            s5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public a5(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.f8942a = paint;
        Paint paint2 = new Paint(1);
        this.f8943b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f8944c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.d = imageReceiver2;
        this.f8945e = 1;
        this.f8946f = new s5[2];
        this.f8947n = new RectF();
        this.f8949s = new g6(new z4(this, 1), 320L, is.h, 0);
        this.f8948r = true;
        int i10 = h6.f20786d6;
        paint.setColor(h6.x0(null, i10, false));
        paint2.setColor(h6.x0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), h6.m1(0.18f, -16777216));
        j9 j9Var = new j9((d6) null);
        j9Var.r(user);
        imageReceiver.setForUserOrChat(user, j9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120);
        imageReceiver2.setImage(ImageLocation.getForDocument(document), "120_120", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "120_120", DocumentObject.getSvgThumb(document.thumbs, h6.f20730a7, 0.35f), 0L, null, null, 0);
        this.h = new n11(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
