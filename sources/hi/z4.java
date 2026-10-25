package hi;

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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.a7;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.t5;
public final class z4 extends Drawable implements a7, NotificationCenter.NotificationCenterDelegate {
    public final Paint f13401a;
    public final Paint f13402b;
    public final ImageReceiver f13403c;
    public final ImageReceiver d;
    public int e;
    public final t5[] f13404f;
    public final q11 h;
    public final RectF f13405n;
    public final boolean f13406r;
    public final h6 f13407s;
    public boolean v;
    public boolean f13408w;
    public View f13409x;

    public z4(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f13401a = paint;
        Paint paint2 = new Paint(1);
        this.f13402b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f13403c = imageReceiver;
        this.d = new ImageReceiver();
        this.e = 1;
        this.f13404f = new t5[2];
        this.f13405n = new RectF();
        this.f13407s = new h6(new y4(this, 1), 320L, ds.h, 0);
        this.f13406r = false;
        int i10 = y6.f23354d6;
        paint.setColor(y6.x0(null, i10, false));
        paint2.setColor(y6.x0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), y6.o1(0.18f, -16777216));
        j9 j9Var = new j9((u6) null);
        j9Var.r(user);
        imageReceiver.setForUserOrChat(user, j9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        d();
        this.h = new q11(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void a(ak0 ak0Var) {
        this.f13409x = ak0Var;
        this.d.setParentView(ak0Var);
        this.f13403c.setParentView(ak0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f13408w = false;
        this.f13403c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        t5[] t5VarArr = this.f13404f;
        t5 t5Var = t5VarArr[0];
        if (t5Var != null) {
            t5Var.o(this.f13409x);
        }
        t5 t5Var2 = t5VarArr[1];
        if (t5Var2 != null) {
            t5Var2.o(this.f13409x);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f13408w = true;
        this.f13403c.onAttachedToWindow();
        this.d.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        t5[] t5VarArr = this.f13404f;
        t5 t5Var = t5VarArr[0];
        if (t5Var != null) {
            t5Var.a(this.f13409x);
        }
        t5 t5Var2 = t5VarArr[1];
        if (t5Var2 != null) {
            t5Var2.a(this.f13409x);
        }
    }

    public final void d() {
        t5 t5Var;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (stickerSet != null && !stickerSet.documents.isEmpty()) {
            TLRPC.Document document = stickerSet.documents.get((int) Math.floor(Math.random() * stickerSet.documents.size()));
            int i10 = 1 - this.e;
            this.e = i10;
            t5[] t5VarArr = this.f13404f;
            t5 t5Var2 = t5VarArr[i10];
            if (t5Var2 != null) {
                t5Var2.o(this.f13409x);
            }
            t5VarArr[this.e] = t5.m(UserConfig.selectedAccount, 9, document);
            t5VarArr[this.e].setColorFilter(new PorterDuffColorFilter(y6.x0(null, y6.Oh, false), PorterDuff.Mode.SRC_IN));
            if (this.f13408w && (t5Var = t5VarArr[this.e]) != null) {
                t5Var.a(this.f13409x);
            }
            AndroidUtilities.runOnUIThread(new y4(this, 0), 2500L);
            return;
        }
        this.v = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad && this.v && this.f13408w) {
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
        t5 t5Var;
        t5 t5Var2;
        int i11;
        Rect bounds = getBounds();
        int x02 = y6.x0(null, y6.f23354d6, false);
        Paint paint = this.f13401a;
        if (paint.getColor() != x02) {
            paint.setColor(x02);
        }
        Paint paint2 = this.f13402b;
        if (paint2.getColor() != x02) {
            paint2.setColor(x02);
        }
        boolean z10 = this.f13406r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 28;
        }
        float dp = (AndroidUtilities.dp((i10 + 38) + 6.66f) + this.h.f31788c) / 2.0f;
        float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
        RectF rectF = this.f13405n;
        rectF.set(bounds.centerX() - dp, bounds.centerY() - dp2, bounds.centerX() + dp, bounds.centerY() + dp2);
        canvas.drawRoundRect(rectF, dp2, dp2, paint);
        ImageReceiver imageReceiver = this.f13403c;
        imageReceiver.setImageCoords(rectF.left, rectF.top, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        imageReceiver.draw(canvas);
        this.h.c(AndroidUtilities.dp(36.0f) + rectF.left, rectF.centerY(), 1.0f, y6.x0(null, y6.G6, false), canvas);
        if (z10) {
            float dp3 = rectF.right - AndroidUtilities.dp(22.66f);
            canvas.drawCircle(dp3, rectF.centerY(), AndroidUtilities.dp(24.0f), paint2);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.setImageCoords(dp3 - AndroidUtilities.dp(16.0f), rectF.centerY() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
            imageReceiver2.draw(canvas);
            return;
        }
        float d = this.f13407s.d(this.e, false);
        canvas.save();
        canvas.translate((int) (rectF.right - AndroidUtilities.dp(30.66f)), (int) (rectF.centerY() - AndroidUtilities.dp(12.0f)));
        int i12 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        int i13 = -1;
        t5[] t5VarArr = this.f13404f;
        if (i12 < 0 && (t5Var2 = t5VarArr[0]) != null) {
            canvas.save();
            f7 = 24.0f;
            if (this.e == 0) {
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
            t5Var2.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            t5Var2.setAlpha((int) (f13 * 255.0f));
            t5Var2.draw(canvas);
            canvas.restore();
        } else {
            f7 = 24.0f;
            f10 = 1.0f;
            f11 = 12.0f;
            f12 = 255.0f;
        }
        if (d > 0.0f && (t5Var = t5VarArr[1]) != null) {
            canvas.save();
            if (this.e != 1) {
                i13 = 1;
            }
            canvas.translate(0.0f, (f10 - d) * AndroidUtilities.dp(9.0f) * i13);
            float f15 = (0.4f * d) + 0.6f;
            canvas.scale(f15, f15, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
            t5Var.setBounds(0, 0, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
            t5Var.setAlpha((int) (d * f12));
            t5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public z4(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.f13401a = paint;
        Paint paint2 = new Paint(1);
        this.f13402b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f13403c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.d = imageReceiver2;
        this.e = 1;
        this.f13404f = new t5[2];
        this.f13405n = new RectF();
        this.f13407s = new h6(new y4(this, 1), 320L, ds.h, 0);
        this.f13406r = true;
        int i10 = y6.f23354d6;
        paint.setColor(y6.x0(null, i10, false));
        paint2.setColor(y6.x0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), y6.o1(0.18f, -16777216));
        j9 j9Var = new j9((u6) null);
        j9Var.r(user);
        imageReceiver.setForUserOrChat(user, j9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120);
        imageReceiver2.setImage(ImageLocation.getForDocument(document), "120_120", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "120_120", DocumentObject.getSvgThumb(document.thumbs, y6.f23297a7, 0.35f), 0L, null, null, 0);
        this.h = new q11(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
