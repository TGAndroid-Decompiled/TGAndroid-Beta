package ig;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import jh.y2;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k5;

public final class h0 {

    public final ImageReceiver f11310a;

    public k5 f11311b;

    public q0 f11313e;

    public View f11314f;

    public boolean f11315g;

    public boolean f11316i;

    public int f11317j;

    public PorterDuffColorFilter f11318k;

    public final Rect f11312c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public h0(View view) {
        this.f11314f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f11310a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        k5 k5Var = this.f11311b;
        Rect rect = this.f11312c;
        if (k5Var != null) {
            y2 y2Var = k5Var.f29961k;
            if (y2Var != null) {
                y2Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f11311b.setColorFilter(this.f11318k);
            this.f11311b.setBounds(rect);
            this.f11311b.setAlpha((int) (this.h * 255.0f));
            this.f11311b.draw(canvas);
            return;
        }
        float f10 = rect.left;
        float f11 = rect.top;
        float fWidth = rect.width();
        float fHeight = rect.height();
        ImageReceiver imageReceiver = this.f11310a;
        imageReceiver.setImageCoords(f10, f11, fWidth, fHeight);
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f11315g = z10;
        ImageReceiver imageReceiver = this.f11310a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            k5 k5Var = this.f11311b;
            if (k5Var != null) {
                k5Var.a(this.f11314f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        k5 k5Var2 = this.f11311b;
        if (k5Var2 != null) {
            k5Var2.o(this.f11314f);
        }
    }

    public final void c(Rect rect) {
        this.f11312c.set(rect);
    }

    public final void d(int i10) {
        if (this.f11317j != i10) {
            this.f11317j = i10;
            this.f11318k = new PorterDuffColorFilter(this.f11317j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f11314f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(q0 q0Var) {
        if (Objects.equals(this.f11313e, q0Var)) {
            return;
        }
        ImageReceiver imageReceiver = this.f11310a;
        imageReceiver.clearImage();
        k5 k5Var = this.f11311b;
        if (k5Var != null) {
            k5Var.o(this.f11314f);
            this.f11311b = null;
        }
        this.f11313e = q0Var;
        boolean z10 = this.f11316i;
        String str = z10 ? "60_60_firstframe" : "60_60";
        if (q0Var.f11412f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(q0Var.f11412f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, g6.f23215m6, 0.2f), 0L, "tgs", q0Var, 0);
                return;
            }
            return;
        }
        k5 k5Var2 = new k5(z10 ? 13 : 1, UserConfig.selectedAccount, q0Var.f11413g);
        this.f11311b = k5Var2;
        if (this.f11315g) {
            k5Var2.a(this.f11314f);
        }
        k5 k5Var3 = this.f11311b;
        this.f11317j = -16777216;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.f11318k = porterDuffColorFilter;
        k5Var3.setColorFilter(porterDuffColorFilter);
    }
}
