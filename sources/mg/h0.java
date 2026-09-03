package mg;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import nh.y2;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l5;
public final class h0 {
    public final ImageReceiver f13998a;
    public l5 f13999b;
    public q0 e;
    public View f14001f;
    public boolean f14002g;
    public boolean f14003i;
    public int f14004j;
    public PorterDuffColorFilter f14005k;
    public final Rect f14000c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public h0(View view) {
        this.f14001f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f13998a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        l5 l5Var = this.f13999b;
        Rect rect = this.f14000c;
        if (l5Var != null) {
            y2 y2Var = l5Var.f26587k;
            if (y2Var != null) {
                y2Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f13999b.setColorFilter(this.f14005k);
            this.f13999b.setBounds(rect);
            this.f13999b.setAlpha((int) (this.h * 255.0f));
            this.f13999b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f13998a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z4) {
        this.f14002g = z4;
        ImageReceiver imageReceiver = this.f13998a;
        if (z4) {
            imageReceiver.onAttachedToWindow();
            l5 l5Var = this.f13999b;
            if (l5Var != null) {
                l5Var.a(this.f14001f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        l5 l5Var2 = this.f13999b;
        if (l5Var2 != null) {
            l5Var2.o(this.f14001f);
        }
    }

    public final void c(Rect rect) {
        this.f14000c.set(rect);
    }

    public final void d(int i10) {
        if (this.f14004j != i10) {
            this.f14004j = i10;
            this.f14005k = new PorterDuffColorFilter(this.f14004j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f14001f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(q0 q0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, q0Var)) {
            ImageReceiver imageReceiver = this.f13998a;
            imageReceiver.clearImage();
            l5 l5Var = this.f13999b;
            if (l5Var != null) {
                l5Var.o(this.f14001f);
                this.f13999b = null;
            }
            this.e = q0Var;
            boolean z4 = this.f14003i;
            if (z4) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (q0Var.f14095f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(q0Var.f14095f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, j6.f20042m6, 0.2f), 0L, "tgs", q0Var, 0);
                    return;
                }
                return;
            }
            if (z4) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            l5 l5Var2 = new l5(i10, UserConfig.selectedAccount, q0Var.f14096g);
            this.f13999b = l5Var2;
            if (this.f14002g) {
                l5Var2.a(this.f14001f);
            }
            l5 l5Var3 = this.f13999b;
            this.f14004j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f14005k = porterDuffColorFilter;
            l5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
