package fi;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import di.nb;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
public final class u2 implements View.OnLayoutChangeListener {
    public final int f10023a;
    public final Object f10024b;

    public u2(Object obj, int i10) {
        this.f10023a = i10;
        this.f10024b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19 = this.f10023a;
        int i20 = 0;
        Object obj = this.f10024b;
        switch (i19) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                k3 k3Var = (k3) obj;
                BotFullscreenButtons botFullscreenButtons = k3Var.m0;
                a3 a3Var = k3Var.v;
                a3Var.setSwipeOffsetY(a3Var.getHeight());
                k3Var.f9793e.setAlpha(1.0f);
                if (k3Var.G0 != Float.MAX_VALUE) {
                    a3Var.setSwipeOffsetAnimationDisallowed(true);
                    a3Var.setOffsetY(k3Var.G0);
                    a3Var.setSwipeOffsetAnimationDisallowed(false);
                }
                k3Var.f9817x.o(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (!k3Var.F0 && !k3Var.m()) {
                    o1.k kVar = new o1.k(a3Var, q4.f9930b0, 0.0f);
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.75f);
                    lVar.b(500.0f);
                    kVar.f16852u = lVar;
                    kVar.a(new o1.f() {
                        @Override
                        public final void a(o1.h hVar, boolean z10, float f7, float f10) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    kVar.f();
                } else {
                    a3Var.f(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()), false, new nb(animationNotificationsLocker, 18));
                }
                a3Var.K = true;
                if (k3Var.f9792d0 && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    return;
                }
                return;
            case 1:
                ig.m.b0((ig.m) obj);
                return;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.F;
                View view2 = searchView.N;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.H.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = m.s3.a(searchView);
                    if (searchView.f1003f0) {
                        i20 = resources.getDimensionPixelSize(2131165225) + resources.getDimensionPixelSize(2131165226);
                    }
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    if (a2) {
                        i18 = -rect.left;
                    } else {
                        i18 = paddingLeft - (rect.left + i20);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i18);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i20) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
