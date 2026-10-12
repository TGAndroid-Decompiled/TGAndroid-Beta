package ah;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import bi.b4;
import j$.util.Objects;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.s5;
public final class y0 {
    public final ImageReceiver f903a;
    public s5 f904b;
    public i1 e;
    public View f906f;
    public boolean f907g;
    public boolean f908i;
    public int f909j;
    public PorterDuffColorFilter f910k;
    public final Rect f905c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public y0(View view) {
        this.f906f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f903a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        s5 s5Var = this.f904b;
        Rect rect = this.f905c;
        if (s5Var != null) {
            b4 b4Var = s5Var.f29031k;
            if (b4Var != null) {
                b4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f904b.setColorFilter(this.f910k);
            this.f904b.setBounds(rect);
            this.f904b.setAlpha((int) (this.h * 255.0f));
            this.f904b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f903a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f907g = z10;
        ImageReceiver imageReceiver = this.f903a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            s5 s5Var = this.f904b;
            if (s5Var != null) {
                s5Var.a(this.f906f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        s5 s5Var2 = this.f904b;
        if (s5Var2 != null) {
            s5Var2.o(this.f906f);
        }
    }

    public final void c(Rect rect) {
        this.f905c.set(rect);
    }

    public final void d(int i10) {
        if (this.f909j != i10) {
            this.f909j = i10;
            this.f910k = new PorterDuffColorFilter(this.f909j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f906f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(i1 i1Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, i1Var)) {
            ImageReceiver imageReceiver = this.f903a;
            imageReceiver.clearImage();
            s5 s5Var = this.f904b;
            if (s5Var != null) {
                s5Var.o(this.f906f);
                this.f904b = null;
            }
            this.e = i1Var;
            boolean z10 = this.f908i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (i1Var.f779f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(i1Var.f779f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, g6.f20064m6, 0.2f), 0L, "tgs", i1Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            s5 s5Var2 = new s5(i10, UserConfig.selectedAccount, i1Var.f780g);
            this.f904b = s5Var2;
            if (this.f907g) {
                s5Var2.a(this.f906f);
            }
            s5 s5Var3 = this.f904b;
            this.f909j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f910k = porterDuffColorFilter;
            s5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
