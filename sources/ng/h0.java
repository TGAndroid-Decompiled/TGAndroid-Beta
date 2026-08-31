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
    public final ImageReceiver f16075a;
    public l5 f16076b;
    public q0 f16078e;
    public View f16079f;
    public boolean f16080g;
    public boolean f16081i;
    public int f16082j;
    public PorterDuffColorFilter f16083k;
    public final Rect f16077c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public h0(View view) {
        this.f16079f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f16075a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        l5 l5Var = this.f16076b;
        Rect rect = this.f16077c;
        if (l5Var != null) {
            z2 z2Var = l5Var.f28604k;
            if (z2Var != null) {
                z2Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f16076b.setColorFilter(this.f16083k);
            this.f16076b.setBounds(rect);
            this.f16076b.setAlpha((int) (this.h * 255.0f));
            this.f16076b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f16075a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z4) {
        this.f16080g = z4;
        ImageReceiver imageReceiver = this.f16075a;
        if (z4) {
            imageReceiver.onAttachedToWindow();
            l5 l5Var = this.f16076b;
            if (l5Var != null) {
                l5Var.a(this.f16079f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        l5 l5Var2 = this.f16076b;
        if (l5Var2 != null) {
            l5Var2.o(this.f16079f);
        }
    }

    public final void c(Rect rect) {
        this.f16077c.set(rect);
    }

    public final void d(int i10) {
        if (this.f16082j != i10) {
            this.f16082j = i10;
            this.f16083k = new PorterDuffColorFilter(this.f16082j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f16079f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(q0 q0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.f16078e, q0Var)) {
            ImageReceiver imageReceiver = this.f16075a;
            imageReceiver.clearImage();
            l5 l5Var = this.f16076b;
            if (l5Var != null) {
                l5Var.o(this.f16079f);
                this.f16076b = null;
            }
            this.f16078e = q0Var;
            boolean z4 = this.f16081i;
            if (z4) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (q0Var.f16178f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(q0Var.f16178f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, k6.f21821m6, 0.2f), 0L, "tgs", q0Var, 0);
                    return;
                }
                return;
            }
            if (z4) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            l5 l5Var2 = new l5(i10, UserConfig.selectedAccount, q0Var.f16179g);
            this.f16076b = l5Var2;
            if (this.f16080g) {
                l5Var2.a(this.f16079f);
            }
            l5 l5Var3 = this.f16076b;
            this.f16082j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f16083k = porterDuffColorFilter;
            l5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
