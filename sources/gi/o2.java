package gi;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import ei.bc;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
public final class o2 implements View.OnLayoutChangeListener {
    public final int f11370a;
    public final Object f11371b;

    public o2(Object obj, int i10) {
        this.f11370a = i10;
        this.f11371b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19 = this.f11370a;
        int i20 = 0;
        Object obj = this.f11371b;
        switch (i19) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                d3 d3Var = (d3) obj;
                BotFullscreenButtons botFullscreenButtons = d3Var.m0;
                u2 u2Var = d3Var.v;
                u2Var.setSwipeOffsetY(u2Var.getHeight());
                d3Var.e.setAlpha(1.0f);
                if (d3Var.G0 != Float.MAX_VALUE) {
                    u2Var.setSwipeOffsetAnimationDisallowed(true);
                    u2Var.setOffsetY(d3Var.G0);
                    u2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                d3Var.f11165x.n(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (!d3Var.F0 && !d3Var.n()) {
                    o1.k kVar = new o1.k(u2Var, e4.f11181b0, 0.0f);
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.75f);
                    lVar.b(500.0f);
                    kVar.f17555u = lVar;
                    kVar.a(new o1.f() {
                        @Override
                        public final void a(o1.h hVar, boolean z10, float f7, float f10) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    kVar.h();
                } else {
                    u2Var.f(u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY()), false, new bc(animationNotificationsLocker, 10));
                }
                u2Var.K = true;
                if (d3Var.f11141d0 && botFullscreenButtons != null) {
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
                    boolean a2 = m.v3.a(searchView);
                    if (searchView.f2772f0) {
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
