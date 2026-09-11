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
    public final ImageReceiver f727a;
    public q5 f728b;
    public j1 f730e;
    public View f731f;
    public boolean f732g;
    public boolean f733i;
    public int f734j;
    public PorterDuffColorFilter f735k;
    public final Rect f729c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public z0(View view) {
        this.f731f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f727a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f728b;
        Rect rect = this.f729c;
        if (q5Var != null) {
            y3 y3Var = q5Var.f29584k;
            if (y3Var != null) {
                y3Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f728b.setColorFilter(this.f735k);
            this.f728b.setBounds(rect);
            this.f728b.setAlpha((int) (this.h * 255.0f));
            this.f728b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f727a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f732g = z10;
        ImageReceiver imageReceiver = this.f727a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            q5 q5Var = this.f728b;
            if (q5Var != null) {
                q5Var.a(this.f731f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        q5 q5Var2 = this.f728b;
        if (q5Var2 != null) {
            q5Var2.o(this.f731f);
        }
    }

    public final void c(Rect rect) {
        this.f729c.set(rect);
    }

    public final void d(int i10) {
        if (this.f734j != i10) {
            this.f734j = i10;
            this.f735k = new PorterDuffColorFilter(this.f734j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f731f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(j1 j1Var) {
        String str;
        int i10;
        if (!Objects.equals(this.f730e, j1Var)) {
            ImageReceiver imageReceiver = this.f727a;
            imageReceiver.clearImage();
            q5 q5Var = this.f728b;
            if (q5Var != null) {
                q5Var.o(this.f731f);
                this.f728b = null;
            }
            this.f730e = j1Var;
            boolean z10 = this.f733i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (j1Var.f597f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(j1Var.f597f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, j6.f20827m6, 0.2f), 0L, "tgs", j1Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            q5 q5Var2 = new q5(i10, UserConfig.selectedAccount, j1Var.f598g);
            this.f728b = q5Var2;
            if (this.f732g) {
                q5Var2.a(this.f731f);
            }
            q5 q5Var3 = this.f728b;
            this.f734j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f735k = porterDuffColorFilter;
            q5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
