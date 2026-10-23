package ah;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import ci.g3;
import j$.util.Objects;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.r5;
public final class y0 {
    public final ImageReceiver f907a;
    public r5 f908b;
    public i1 e;
    public View f910f;
    public boolean f911g;
    public boolean f912i;
    public int f913j;
    public PorterDuffColorFilter f914k;
    public final Rect f909c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public y0(View view) {
        this.f910f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f907a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        r5 r5Var = this.f908b;
        Rect rect = this.f909c;
        if (r5Var != null) {
            g3 g3Var = r5Var.f29842k;
            if (g3Var != null) {
                g3Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f908b.setColorFilter(this.f914k);
            this.f908b.setBounds(rect);
            this.f908b.setAlpha((int) (this.h * 255.0f));
            this.f908b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f907a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f911g = z10;
        ImageReceiver imageReceiver = this.f907a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            r5 r5Var = this.f908b;
            if (r5Var != null) {
                r5Var.a(this.f910f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        r5 r5Var2 = this.f908b;
        if (r5Var2 != null) {
            r5Var2.o(this.f910f);
        }
    }

    public final void c(Rect rect) {
        this.f909c.set(rect);
    }

    public final void d(int i10) {
        if (this.f913j != i10) {
            this.f913j = i10;
            this.f914k = new PorterDuffColorFilter(this.f913j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f910f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(i1 i1Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, i1Var)) {
            ImageReceiver imageReceiver = this.f907a;
            imageReceiver.clearImage();
            r5 r5Var = this.f908b;
            if (r5Var != null) {
                r5Var.o(this.f910f);
                this.f908b = null;
            }
            this.e = i1Var;
            boolean z10 = this.f912i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (i1Var.f783f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(i1Var.f783f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, h6.f21157m6, 0.2f), 0L, "tgs", i1Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            r5 r5Var2 = new r5(i10, UserConfig.selectedAccount, i1Var.f784g);
            this.f908b = r5Var2;
            if (this.f911g) {
                r5Var2.a(this.f910f);
            }
            r5 r5Var3 = this.f908b;
            this.f913j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f914k = porterDuffColorFilter;
            r5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
