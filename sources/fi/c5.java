package fi;

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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.y6;
public final class c5 extends Drawable implements y6, NotificationCenter.NotificationCenterDelegate {
    public final Paint f9625a;
    public final Paint f9626b;
    public final ImageReceiver f9627c;
    public final ImageReceiver d;
    public int f9628e;
    public final q5[] f9629f;
    public final f01 h;
    public final RectF f9630n;
    public final boolean f9631r;
    public final e6 f9632s;
    public boolean v;
    public boolean f9633w;
    public View f9634x;

    public c5(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f9625a = paint;
        Paint paint2 = new Paint(1);
        this.f9626b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f9627c = imageReceiver;
        this.d = new ImageReceiver();
        this.f9628e = 1;
        this.f9629f = new q5[2];
        this.f9630n = new RectF();
        this.f9632s = new e6(new b5(this, 1), 320L, pr.h, 0);
        this.f9631r = false;
        int i10 = j6.f20690d6;
        paint.setColor(j6.w0(null, i10, false));
        paint2.setColor(j6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), j6.l1(0.18f, -16777216));
        i9 i9Var = new i9((f6) null);
        i9Var.r(user);
        imageReceiver.setForUserOrChat(user, i9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        d();
        this.h = new f01(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void a(aj0 aj0Var) {
        this.f9634x = aj0Var;
        this.d.setParentView(aj0Var);
        this.f9627c.setParentView(aj0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f9633w = false;
        this.f9627c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        q5[] q5VarArr = this.f9629f;
        q5 q5Var = q5VarArr[0];
        if (q5Var != null) {
            q5Var.o(this.f9634x);
        }
        q5 q5Var2 = q5VarArr[1];
        if (q5Var2 != null) {
            q5Var2.o(this.f9634x);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f9633w = true;
        this.f9627c.onAttachedToWindow();
        this.d.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        q5[] q5VarArr = this.f9629f;
        q5 q5Var = q5VarArr[0];
        if (q5Var != null) {
            q5Var.a(this.f9634x);
        }
        q5 q5Var2 = q5VarArr[1];
        if (q5Var2 != null) {
            q5Var2.a(this.f9634x);
        }
    }

    public final void d() {
        q5 q5Var;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (stickerSet != null && !stickerSet.documents.isEmpty()) {
            TLRPC.Document document = stickerSet.documents.get((int) Math.floor(Math.random() * stickerSet.documents.size()));
            int i10 = 1 - this.f9628e;
            this.f9628e = i10;
            q5[] q5VarArr = this.f9629f;
            q5 q5Var2 = q5VarArr[i10];
            if (q5Var2 != null) {
                q5Var2.o(this.f9634x);
            }
            q5VarArr[this.f9628e] = q5.m(UserConfig.selectedAccount, 9, document);
            q5VarArr[this.f9628e].setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Oh, false), PorterDuff.Mode.SRC_IN));
            if (this.f9633w && (q5Var = q5VarArr[this.f9628e]) != null) {
                q5Var.a(this.f9634x);
            }
            AndroidUtilities.runOnUIThread(new b5(this, 0), 2500L);
            return;
        }
        this.v = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad && this.v && this.f9633w) {
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
        boolean z10 = this.f9631r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 28;
        }
        float dp = (AndroidUtilities.dp((i10 + 38) + 6.66f) + this.h.f25874c) / 2.0f;
        float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
        RectF rectF = this.f9630n;
        rectF.set(bounds.centerX() - dp, bounds.centerY() - dp2, bounds.centerX() + dp, bounds.centerY() + dp2);
        canvas.drawRoundRect(rectF, dp2, dp2, this.f9625a);
        ImageReceiver imageReceiver = this.f9627c;
        imageReceiver.setImageCoords(rectF.left, rectF.top, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        imageReceiver.draw(canvas);
        this.h.c(AndroidUtilities.dp(36.0f) + rectF.left, rectF.centerY(), 1.0f, j6.w0(null, j6.G6, false), canvas);
        if (z10) {
            float dp3 = rectF.right - AndroidUtilities.dp(22.66f);
            canvas.drawCircle(dp3, rectF.centerY(), AndroidUtilities.dp(24.0f), this.f9626b);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.setImageCoords(dp3 - AndroidUtilities.dp(16.0f), rectF.centerY() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
            imageReceiver2.draw(canvas);
            return;
        }
        float d = this.f9632s.d(this.f9628e, false);
        canvas.save();
        canvas.translate((int) (rectF.right - AndroidUtilities.dp(30.66f)), (int) (rectF.centerY() - AndroidUtilities.dp(12.0f)));
        int i12 = -1;
        q5[] q5VarArr = this.f9629f;
        if (d < 1.0f && (q5Var2 = q5VarArr[0]) != null) {
            canvas.save();
            f7 = 24.0f;
            if (this.f9628e == 0) {
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
            if (this.f9628e != 1) {
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
        this.f9625a = paint;
        Paint paint2 = new Paint(1);
        this.f9626b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f9627c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.d = imageReceiver2;
        this.f9628e = 1;
        this.f9629f = new q5[2];
        this.f9630n = new RectF();
        this.f9632s = new e6(new b5(this, 1), 320L, pr.h, 0);
        this.f9631r = true;
        int i10 = j6.f20690d6;
        paint.setColor(j6.w0(null, i10, false));
        paint2.setColor(j6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), j6.l1(0.18f, -16777216));
        i9 i9Var = new i9((f6) null);
        i9Var.r(user);
        imageReceiver.setForUserOrChat(user, i9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120);
        imageReceiver2.setImage(ImageLocation.getForDocument(document), "120_120", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "120_120", DocumentObject.getSvgThumb(document.thumbs, j6.f20634a7, 0.35f), 0L, null, null, 0);
        this.h = new f01(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
