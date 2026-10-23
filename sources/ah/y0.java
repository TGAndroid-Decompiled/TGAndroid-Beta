package ah;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import ci.f3;
import j$.util.Objects;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.r5;
public final class y0 {
    public final ImageReceiver f908a;
    public r5 f909b;
    public i1 e;
    public View f911f;
    public boolean f912g;
    public boolean f913i;
    public int f914j;
    public PorterDuffColorFilter f915k;
    public final Rect f910c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public y0(View view) {
        this.f911f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f908a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        r5 r5Var = this.f909b;
        Rect rect = this.f910c;
        if (r5Var != null) {
            f3 f3Var = r5Var.f30098k;
            if (f3Var != null) {
                f3Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f909b.setColorFilter(this.f915k);
            this.f909b.setBounds(rect);
            this.f909b.setAlpha((int) (this.h * 255.0f));
            this.f909b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f908a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f912g = z10;
        ImageReceiver imageReceiver = this.f908a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            r5 r5Var = this.f909b;
            if (r5Var != null) {
                r5Var.a(this.f911f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        r5 r5Var2 = this.f909b;
        if (r5Var2 != null) {
            r5Var2.o(this.f911f);
        }
    }

    public final void c(Rect rect) {
        this.f910c.set(rect);
    }

    public final void d(int i10) {
        if (this.f914j != i10) {
            this.f914j = i10;
            this.f915k = new PorterDuffColorFilter(this.f914j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f911f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(i1 i1Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, i1Var)) {
            ImageReceiver imageReceiver = this.f908a;
            imageReceiver.clearImage();
            r5 r5Var = this.f909b;
            if (r5Var != null) {
                r5Var.o(this.f911f);
                this.f909b = null;
            }
            this.e = i1Var;
            boolean z10 = this.f913i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (i1Var.f784f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(i1Var.f784f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, k6.f21346m6, 0.2f), 0L, "tgs", i1Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            r5 r5Var2 = new r5(i10, UserConfig.selectedAccount, i1Var.f785g);
            this.f909b = r5Var2;
            if (this.f912g) {
                r5Var2.a(this.f911f);
            }
            r5 r5Var3 = this.f909b;
            this.f914j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f915k = porterDuffColorFilter;
            r5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
