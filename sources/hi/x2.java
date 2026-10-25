package hi;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import fi.ua;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
public final class x2 implements View.OnLayoutChangeListener {
    public final int f13359a;
    public final Object f13360b;

    public x2(Object obj, int i10) {
        this.f13359a = i10;
        this.f13360b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19 = this.f13359a;
        int i20 = 0;
        Object obj = this.f13360b;
        switch (i19) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                m3 m3Var = (m3) obj;
                BotFullscreenButtons botFullscreenButtons = m3Var.f13118n0;
                d3 d3Var = m3Var.f13129w;
                d3Var.setSwipeOffsetY(d3Var.getHeight());
                m3Var.f13109f.setAlpha(1.0f);
                if (m3Var.H0 != Float.MAX_VALUE) {
                    d3Var.setSwipeOffsetAnimationDisallowed(true);
                    d3Var.setOffsetY(m3Var.H0);
                    d3Var.setSwipeOffsetAnimationDisallowed(false);
                }
                m3Var.f13133y.n(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (!m3Var.G0 && !m3Var.n()) {
                    o1.j jVar = new o1.j(d3Var, n4.f13153b0, 0.0f);
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.75f);
                    kVar.b(500.0f);
                    jVar.f18969u = kVar;
                    jVar.a(new o1.f() {
                        @Override
                        public final void a(o1.h hVar, boolean z10, float f7, float f10) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    jVar.h();
                } else {
                    d3Var.f(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()), false, new ua(animationNotificationsLocker, 15));
                }
                d3Var.K = true;
                if (m3Var.f13108e0 && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    return;
                }
                return;
            case 1:
                jg.n.c0((jg.n) obj);
                return;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.F;
                View view2 = searchView.N;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.H.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = m.u3.a(searchView);
                    if (searchView.f2222f0) {
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
