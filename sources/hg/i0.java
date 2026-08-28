package hg;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import ih.z2;
import j$.util.Objects;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k5;
public final class i0 {
    public final ImageReceiver f10616a;
    public k5 f10617b;
    public r0 f10619e;
    public View f10620f;
    public boolean f10621g;
    public boolean f10622i;
    public int f10623j;
    public PorterDuffColorFilter f10624k;
    public final Rect f10618c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public i0(View view) {
        this.f10620f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f10616a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        k5 k5Var = this.f10617b;
        Rect rect = this.f10618c;
        if (k5Var != null) {
            z2 z2Var = k5Var.f29951k;
            if (z2Var != null) {
                z2Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f10617b.setColorFilter(this.f10624k);
            this.f10617b.setBounds(rect);
            this.f10617b.setAlpha((int) (this.h * 255.0f));
            this.f10617b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f10616a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f10621g = z10;
        ImageReceiver imageReceiver = this.f10616a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            k5 k5Var = this.f10617b;
            if (k5Var != null) {
                k5Var.a(this.f10620f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        k5 k5Var2 = this.f10617b;
        if (k5Var2 != null) {
            k5Var2.o(this.f10620f);
        }
    }

    public final void c(Rect rect) {
        this.f10618c.set(rect);
    }

    public final void d(int i9) {
        if (this.f10623j != i9) {
            this.f10623j = i9;
            this.f10624k = new PorterDuffColorFilter(this.f10623j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f10620f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(r0 r0Var) {
        String str;
        int i9;
        if (!Objects.equals(this.f10619e, r0Var)) {
            ImageReceiver imageReceiver = this.f10616a;
            imageReceiver.clearImage();
            k5 k5Var = this.f10617b;
            if (k5Var != null) {
                k5Var.o(this.f10620f);
                this.f10617b = null;
            }
            this.f10619e = r0Var;
            boolean z10 = this.f10622i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (r0Var.f10717f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(r0Var.f10717f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, f6.f23162m6, 0.2f), 0L, "tgs", r0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i9 = 13;
            } else {
                i9 = 1;
            }
            k5 k5Var2 = new k5(i9, UserConfig.selectedAccount, r0Var.f10718g);
            this.f10617b = k5Var2;
            if (this.f10621g) {
                k5Var2.a(this.f10620f);
            }
            k5 k5Var3 = this.f10617b;
            this.f10623j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f10624k = porterDuffColorFilter;
            k5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
