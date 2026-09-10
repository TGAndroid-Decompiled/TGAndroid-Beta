package di;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import bi.wc;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
public final class x2 implements View.OnLayoutChangeListener {
    public final int f6999a;
    public final Object f7000b;

    public x2(Object obj, int i10) {
        this.f6999a = i10;
        this.f7000b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19 = this.f6999a;
        int i20 = 0;
        Object obj = this.f7000b;
        switch (i19) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                n3 n3Var = (n3) obj;
                BotFullscreenButtons botFullscreenButtons = n3Var.m0;
                d3 d3Var = n3Var.v;
                d3Var.setSwipeOffsetY(d3Var.getHeight());
                n3Var.e.setAlpha(1.0f);
                if (n3Var.G0 != Float.MAX_VALUE) {
                    d3Var.setSwipeOffsetAnimationDisallowed(true);
                    d3Var.setOffsetY(n3Var.G0);
                    d3Var.setSwipeOffsetAnimationDisallowed(false);
                }
                n3Var.f6812x.o(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (!n3Var.F0 && !n3Var.m()) {
                    o1.k kVar = new o1.k(d3Var, t4.f6914b0, 0.0f);
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.75f);
                    lVar.b(500.0f);
                    kVar.f14134u = lVar;
                    kVar.a(new o1.f() {
                        @Override
                        public final void a(o1.h hVar, boolean z10, float f7, float f10) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    kVar.f();
                } else {
                    d3Var.f(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()), false, new wc(animationNotificationsLocker, 20));
                }
                d3Var.K = true;
                if (n3Var.f6788d0 && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    return;
                }
                return;
            case 1:
                gg.n.b0((gg.n) obj);
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
                    if (searchView.f692f0) {
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
