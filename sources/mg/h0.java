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
    public final ImageReceiver f14010a;
    public l5 f14011b;
    public q0 e;
    public View f14013f;
    public boolean f14014g;
    public boolean f14015i;
    public int f14016j;
    public PorterDuffColorFilter f14017k;
    public final Rect f14012c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public h0(View view) {
        this.f14013f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f14010a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        l5 l5Var = this.f14011b;
        Rect rect = this.f14012c;
        if (l5Var != null) {
            y2 y2Var = l5Var.f26569k;
            if (y2Var != null) {
                y2Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f14011b.setColorFilter(this.f14017k);
            this.f14011b.setBounds(rect);
            this.f14011b.setAlpha((int) (this.h * 255.0f));
            this.f14011b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f14010a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z4) {
        this.f14014g = z4;
        ImageReceiver imageReceiver = this.f14010a;
        if (z4) {
            imageReceiver.onAttachedToWindow();
            l5 l5Var = this.f14011b;
            if (l5Var != null) {
                l5Var.a(this.f14013f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        l5 l5Var2 = this.f14011b;
        if (l5Var2 != null) {
            l5Var2.o(this.f14013f);
        }
    }

    public final void c(Rect rect) {
        this.f14012c.set(rect);
    }

    public final void d(int i10) {
        if (this.f14016j != i10) {
            this.f14016j = i10;
            this.f14017k = new PorterDuffColorFilter(this.f14016j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f14013f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(q0 q0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, q0Var)) {
            ImageReceiver imageReceiver = this.f14010a;
            imageReceiver.clearImage();
            l5 l5Var = this.f14011b;
            if (l5Var != null) {
                l5Var.o(this.f14013f);
                this.f14011b = null;
            }
            this.e = q0Var;
            boolean z4 = this.f14015i;
            if (z4) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (q0Var.f14107f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(q0Var.f14107f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, j6.f20067m6, 0.2f), 0L, "tgs", q0Var, 0);
                    return;
                }
                return;
            }
            if (z4) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            l5 l5Var2 = new l5(i10, UserConfig.selectedAccount, q0Var.f14108g);
            this.f14011b = l5Var2;
            if (this.f14014g) {
                l5Var2.a(this.f14013f);
            }
            l5 l5Var3 = this.f14011b;
            this.f14016j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f14017k = porterDuffColorFilter;
            l5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
