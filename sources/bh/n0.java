package bh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import di.f3;
import j$.util.Objects;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.t5;
public final class n0 {
    public final ImageReceiver f4089a;
    public t5 f4090b;
    public x0 e;
    public View f4092f;
    public boolean f4093g;
    public boolean f4094i;
    public int f4095j;
    public PorterDuffColorFilter f4096k;
    public final Rect f4091c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public n0(View view) {
        this.f4092f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f4089a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        t5 t5Var = this.f4090b;
        Rect rect = this.f4091c;
        if (t5Var != null) {
            f3 f3Var = t5Var.f32852k;
            if (f3Var != null) {
                f3Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f4090b.setColorFilter(this.f4096k);
            this.f4090b.setBounds(rect);
            this.f4090b.setAlpha((int) (this.h * 255.0f));
            this.f4090b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f4089a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f4093g = z10;
        ImageReceiver imageReceiver = this.f4089a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            t5 t5Var = this.f4090b;
            if (t5Var != null) {
                t5Var.a(this.f4092f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        t5 t5Var2 = this.f4090b;
        if (t5Var2 != null) {
            t5Var2.o(this.f4092f);
        }
    }

    public final void c(Rect rect) {
        this.f4091c.set(rect);
    }

    public final void d(int i10) {
        if (this.f4095j != i10) {
            this.f4095j = i10;
            this.f4096k = new PorterDuffColorFilter(this.f4095j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f4092f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(x0 x0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, x0Var)) {
            ImageReceiver imageReceiver = this.f4089a;
            imageReceiver.clearImage();
            t5 t5Var = this.f4090b;
            if (t5Var != null) {
                t5Var.o(this.f4092f);
                this.f4090b = null;
            }
            this.e = x0Var;
            boolean z10 = this.f4094i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (x0Var.f4208f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(x0Var.f4208f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, y6.f23520m6, 0.2f), 0L, "tgs", x0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            t5 t5Var2 = new t5(i10, UserConfig.selectedAccount, x0Var.f4209g);
            this.f4090b = t5Var2;
            if (this.f4093g) {
                t5Var2.a(this.f4092f);
            }
            t5 t5Var3 = this.f4090b;
            this.f4095j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f4096k = porterDuffColorFilter;
            t5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
