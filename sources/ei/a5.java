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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.z6;
public final class a5 extends Drawable implements z6, NotificationCenter.NotificationCenterDelegate {
    public final Paint f8943a;
    public final Paint f8944b;
    public final ImageReceiver f8945c;
    public final ImageReceiver d;
    public int f8946e;
    public final s5[] f8947f;
    public final l11 h;
    public final RectF f8948n;
    public final boolean f8949r;
    public final g6 f8950s;
    public boolean v;
    public boolean f8951w;
    public View f8952x;

    public a5(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f8943a = paint;
        Paint paint2 = new Paint(1);
        this.f8944b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f8945c = imageReceiver;
        this.d = new ImageReceiver();
        this.f8946e = 1;
        this.f8947f = new s5[2];
        this.f8948n = new RectF();
        this.f8950s = new g6(new z4(this, 1), 320L, hs.h, 0);
        this.f8949r = false;
        int i10 = i6.f20797d6;
        paint.setColor(i6.x0(null, i10, false));
        paint2.setColor(i6.x0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), i6.m1(0.18f, -16777216));
        j9 j9Var = new j9((e6) null);
        j9Var.r(user);
        imageReceiver.setForUserOrChat(user, j9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        d();
        this.h = new l11(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void a(fk0 fk0Var) {
        this.f8952x = fk0Var;
        this.d.setParentView(fk0Var);
        this.f8945c.setParentView(fk0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f8951w = false;
        this.f8945c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        s5[] s5VarArr = this.f8947f;
        s5 s5Var = s5VarArr[0];
        if (s5Var != null) {
            s5Var.o(this.f8952x);
        }
        s5 s5Var2 = s5VarArr[1];
        if (s5Var2 != null) {
            s5Var2.o(this.f8952x);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f8951w = true;
        this.f8945c.onAttachedToWindow();
        this.d.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        s5[] s5VarArr = this.f8947f;
        s5 s5Var = s5VarArr[0];
        if (s5Var != null) {
            s5Var.a(this.f8952x);
        }
        s5 s5Var2 = s5VarArr[1];
        if (s5Var2 != null) {
            s5Var2.a(this.f8952x);
        }
    }

    public final void d() {
        s5 s5Var;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (stickerSet != null && !stickerSet.documents.isEmpty()) {
            TLRPC.Document document = stickerSet.documents.get((int) Math.floor(Math.random() * stickerSet.documents.size()));
            int i10 = 1 - this.f8946e;
            this.f8946e = i10;
            s5[] s5VarArr = this.f8947f;
            s5 s5Var2 = s5VarArr[i10];
            if (s5Var2 != null) {
                s5Var2.o(this.f8952x);
            }
            s5VarArr[this.f8946e] = s5.m(UserConfig.selectedAccount, 9, document);
            s5VarArr[this.f8946e].setColorFilter(new PorterDuffColorFilter(i6.x0(null, i6.Oh, false), PorterDuff.Mode.SRC_IN));
            if (this.f8951w && (s5Var = s5VarArr[this.f8946e]) != null) {
                s5Var.a(this.f8952x);
            }
            AndroidUtilities.runOnUIThread(new z4(this, 0), 2500L);
            return;
        }
        this.v = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad && this.v && this.f8951w) {
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
        boolean z10 = this.f8949r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 28;
        }
        float dp = (AndroidUtilities.dp((i10 + 38) + 6.66f) + this.h.f28222c) / 2.0f;
        float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
        RectF rectF = this.f8948n;
        rectF.set(bounds.centerX() - dp, bounds.centerY() - dp2, bounds.centerX() + dp, bounds.centerY() + dp2);
        canvas.drawRoundRect(rectF, dp2, dp2, this.f8943a);
        ImageReceiver imageReceiver = this.f8945c;
        imageReceiver.setImageCoords(rectF.left, rectF.top, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        imageReceiver.draw(canvas);
        this.h.c(AndroidUtilities.dp(36.0f) + rectF.left, rectF.centerY(), 1.0f, i6.x0(null, i6.G6, false), canvas);
        if (z10) {
            float dp3 = rectF.right - AndroidUtilities.dp(22.66f);
            canvas.drawCircle(dp3, rectF.centerY(), AndroidUtilities.dp(24.0f), this.f8944b);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.setImageCoords(dp3 - AndroidUtilities.dp(16.0f), rectF.centerY() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
            imageReceiver2.draw(canvas);
            return;
        }
        float d = this.f8950s.d(this.f8946e, false);
        canvas.save();
        canvas.translate((int) (rectF.right - AndroidUtilities.dp(30.66f)), (int) (rectF.centerY() - AndroidUtilities.dp(12.0f)));
        int i12 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        int i13 = -1;
        s5[] s5VarArr = this.f8947f;
        if (i12 < 0 && (s5Var2 = s5VarArr[0]) != null) {
            canvas.save();
            f7 = 24.0f;
            if (this.f8946e == 0) {
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
            if (this.f8946e != 1) {
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
        this.f8943a = paint;
        Paint paint2 = new Paint(1);
        this.f8944b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f8945c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.d = imageReceiver2;
        this.f8946e = 1;
        this.f8947f = new s5[2];
        this.f8948n = new RectF();
        this.f8950s = new g6(new z4(this, 1), 320L, hs.h, 0);
        this.f8949r = true;
        int i10 = i6.f20797d6;
        paint.setColor(i6.x0(null, i10, false));
        paint2.setColor(i6.x0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), i6.m1(0.18f, -16777216));
        j9 j9Var = new j9((e6) null);
        j9Var.r(user);
        imageReceiver.setForUserOrChat(user, j9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120);
        imageReceiver2.setImage(ImageLocation.getForDocument(document), "120_120", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "120_120", DocumentObject.getSvgThumb(document.thumbs, i6.f20741a7, 0.35f), 0L, null, null, 0);
        this.h = new l11(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
