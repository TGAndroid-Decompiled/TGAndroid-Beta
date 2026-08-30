package m;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
import ph.ga;
public final class t2 implements View.OnLayoutChangeListener {
    public final int f13647a;
    public final Object f13648b;

    public t2(Object obj, int i10) {
        this.f13647a = i10;
        this.f13648b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19 = this.f13647a;
        int i20 = 0;
        Object obj = this.f13648b;
        switch (i19) {
            case 0:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.C;
                View view2 = searchView.K;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.E.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = v3.a(searchView);
                    if (searchView.f416c0) {
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
            case 1:
                view.removeOnLayoutChangeListener(this);
                rh.q2 q2Var = (rh.q2) obj;
                BotFullscreenButtons botFullscreenButtons = q2Var.f43691j0;
                rh.h2 h2Var = q2Var.v;
                h2Var.setSwipeOffsetY(h2Var.getHeight());
                q2Var.e.setAlpha(1.0f);
                if (q2Var.D0 != Float.MAX_VALUE) {
                    h2Var.setSwipeOffsetAnimationDisallowed(true);
                    h2Var.setOffsetY(q2Var.D0);
                    h2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                q2Var.f43708x.n(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (!q2Var.C0 && !q2Var.m()) {
                    o1.j jVar = new o1.j(h2Var, rh.n3.V, 0.0f);
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.75f);
                    kVar.b(500.0f);
                    jVar.f16198u = kVar;
                    jVar.a(new o1.f() {
                        @Override
                        public final void a(o1.h hVar, boolean z4, float f10, float f11) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    jVar.f();
                } else {
                    h2Var.f(h2Var.getTopActionBarOffsetY() + (-h2Var.getOffsetY()), false, new ga(animationNotificationsLocker, 12));
                }
                h2Var.H = true;
                if (q2Var.f43679a0 && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    return;
                }
                return;
            default:
                uf.k.b0((uf.k) obj);
                return;
        }
    }
}
