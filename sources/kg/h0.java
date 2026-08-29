package kg;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import lh.x2;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.p5;
public final class h0 {
    public final ImageReceiver f13723a;
    public p5 f13724b;
    public q0 f13726e;
    public View f13727f;
    public boolean f13728g;
    public boolean f13729i;
    public int f13730j;
    public PorterDuffColorFilter f13731k;
    public final Rect f13725c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public h0(View view) {
        this.f13727f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f13723a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        p5 p5Var = this.f13724b;
        Rect rect = this.f13725c;
        if (p5Var != null) {
            x2 x2Var = p5Var.f31593k;
            if (x2Var != null) {
                x2Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f13724b.setColorFilter(this.f13731k);
            this.f13724b.setBounds(rect);
            this.f13724b.setAlpha((int) (this.h * 255.0f));
            this.f13724b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f13723a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f13728g = z10;
        ImageReceiver imageReceiver = this.f13723a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            p5 p5Var = this.f13724b;
            if (p5Var != null) {
                p5Var.a(this.f13727f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        p5 p5Var2 = this.f13724b;
        if (p5Var2 != null) {
            p5Var2.o(this.f13727f);
        }
    }

    public final void c(Rect rect) {
        this.f13725c.set(rect);
    }

    public final void d(int i10) {
        if (this.f13730j != i10) {
            this.f13730j = i10;
            this.f13731k = new PorterDuffColorFilter(this.f13730j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f13727f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(q0 q0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.f13726e, q0Var)) {
            ImageReceiver imageReceiver = this.f13723a;
            imageReceiver.clearImage();
            p5 p5Var = this.f13724b;
            if (p5Var != null) {
                p5Var.o(this.f13727f);
                this.f13724b = null;
            }
            this.f13726e = q0Var;
            boolean z10 = this.f13729i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (q0Var.f13825f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(q0Var.f13825f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, g6.f23223m6, 0.2f), 0L, "tgs", q0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            p5 p5Var2 = new p5(i10, UserConfig.selectedAccount, q0Var.f13826g);
            this.f13724b = p5Var2;
            if (this.f13728g) {
                p5Var2.a(this.f13727f);
            }
            p5 p5Var3 = this.f13724b;
            this.f13730j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f13731k = porterDuffColorFilter;
            p5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
