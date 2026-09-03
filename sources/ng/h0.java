package ng;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import oh.z2;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l5;
public final class h0 {
    public final ImageReceiver f16077a;
    public l5 f16078b;
    public q0 f16080e;
    public View f16081f;
    public boolean f16082g;
    public boolean f16083i;
    public int f16084j;
    public PorterDuffColorFilter f16085k;
    public final Rect f16079c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public h0(View view) {
        this.f16081f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f16077a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        l5 l5Var = this.f16078b;
        Rect rect = this.f16079c;
        if (l5Var != null) {
            z2 z2Var = l5Var.f28637k;
            if (z2Var != null) {
                z2Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f16078b.setColorFilter(this.f16085k);
            this.f16078b.setBounds(rect);
            this.f16078b.setAlpha((int) (this.h * 255.0f));
            this.f16078b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f16077a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z4) {
        this.f16082g = z4;
        ImageReceiver imageReceiver = this.f16077a;
        if (z4) {
            imageReceiver.onAttachedToWindow();
            l5 l5Var = this.f16078b;
            if (l5Var != null) {
                l5Var.a(this.f16081f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        l5 l5Var2 = this.f16078b;
        if (l5Var2 != null) {
            l5Var2.o(this.f16081f);
        }
    }

    public final void c(Rect rect) {
        this.f16079c.set(rect);
    }

    public final void d(int i10) {
        if (this.f16084j != i10) {
            this.f16084j = i10;
            this.f16085k = new PorterDuffColorFilter(this.f16084j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f16081f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(q0 q0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.f16080e, q0Var)) {
            ImageReceiver imageReceiver = this.f16077a;
            imageReceiver.clearImage();
            l5 l5Var = this.f16078b;
            if (l5Var != null) {
                l5Var.o(this.f16081f);
                this.f16078b = null;
            }
            this.f16080e = q0Var;
            boolean z4 = this.f16083i;
            if (z4) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (q0Var.f16180f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(q0Var.f16180f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, k6.f21823m6, 0.2f), 0L, "tgs", q0Var, 0);
                    return;
                }
                return;
            }
            if (z4) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            l5 l5Var2 = new l5(i10, UserConfig.selectedAccount, q0Var.f16181g);
            this.f16078b = l5Var2;
            if (this.f16082g) {
                l5Var2.a(this.f16081f);
            }
            l5 l5Var3 = this.f16078b;
            this.f16084j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f16085k = porterDuffColorFilter;
            l5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
