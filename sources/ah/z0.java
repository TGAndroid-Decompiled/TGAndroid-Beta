package ah;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import bi.y3;
import j$.util.Objects;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.q5;
public final class z0 {
    public final ImageReceiver f739a;
    public q5 f740b;
    public j1 f742e;
    public View f743f;
    public boolean f744g;
    public boolean f745i;
    public int f746j;
    public PorterDuffColorFilter f747k;
    public final Rect f741c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public z0(View view) {
        this.f743f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f739a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f740b;
        Rect rect = this.f741c;
        if (q5Var != null) {
            y3 y3Var = q5Var.f29611k;
            if (y3Var != null) {
                y3Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f740b.setColorFilter(this.f747k);
            this.f740b.setBounds(rect);
            this.f740b.setAlpha((int) (this.h * 255.0f));
            this.f740b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f739a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f744g = z10;
        ImageReceiver imageReceiver = this.f739a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            q5 q5Var = this.f740b;
            if (q5Var != null) {
                q5Var.a(this.f743f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        q5 q5Var2 = this.f740b;
        if (q5Var2 != null) {
            q5Var2.o(this.f743f);
        }
    }

    public final void c(Rect rect) {
        this.f741c.set(rect);
    }

    public final void d(int i10) {
        if (this.f746j != i10) {
            this.f746j = i10;
            this.f747k = new PorterDuffColorFilter(this.f746j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f743f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(j1 j1Var) {
        String str;
        int i10;
        if (!Objects.equals(this.f742e, j1Var)) {
            ImageReceiver imageReceiver = this.f739a;
            imageReceiver.clearImage();
            q5 q5Var = this.f740b;
            if (q5Var != null) {
                q5Var.o(this.f743f);
                this.f740b = null;
            }
            this.f742e = j1Var;
            boolean z10 = this.f745i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (j1Var.f609f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(j1Var.f609f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, j6.f20854m6, 0.2f), 0L, "tgs", j1Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            q5 q5Var2 = new q5(i10, UserConfig.selectedAccount, j1Var.f610g);
            this.f740b = q5Var2;
            if (this.f744g) {
                q5Var2.a(this.f743f);
            }
            q5 q5Var3 = this.f740b;
            this.f746j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f747k = porterDuffColorFilter;
            q5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
