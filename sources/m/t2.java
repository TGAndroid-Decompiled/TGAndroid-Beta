package m;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
public final class t2 implements View.OnLayoutChangeListener {
    public final int f16698a;
    public final Object f16699b;

    public t2(Object obj, int i10) {
        this.f16698a = i10;
        this.f16699b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19 = this.f16698a;
        int i20 = 0;
        Object obj = this.f16699b;
        switch (i19) {
            case 0:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.B;
                View view2 = searchView.J;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.D.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = v3.a(searchView);
                    if (searchView.f985b0) {
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
                ph.p2 p2Var = (ph.p2) obj;
                BotFullscreenButtons botFullscreenButtons = p2Var.f45969i0;
                ph.g2 g2Var = p2Var.v;
                g2Var.setSwipeOffsetY(g2Var.getHeight());
                p2Var.f45963e.setAlpha(1.0f);
                if (p2Var.C0 != Float.MAX_VALUE) {
                    g2Var.setSwipeOffsetAnimationDisallowed(true);
                    g2Var.setOffsetY(p2Var.C0);
                    g2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                p2Var.f45987x.n(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (!p2Var.B0 && !p2Var.m()) {
                    o1.k kVar = new o1.k(g2Var, ph.m3.U, 0.0f);
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.75f);
                    lVar.b(500.0f);
                    kVar.f19045u = lVar;
                    kVar.a(new o1.g() {
                        @Override
                        public final void a(o1.i iVar, boolean z10, float f9, float f10) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    kVar.f();
                } else {
                    g2Var.f(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()), false, new org.telegram.ui.web.t1(animationNotificationsLocker, 10));
                }
                g2Var.G = true;
                if (p2Var.Z && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    return;
                }
                return;
            default:
                sf.l.b0((sf.l) obj);
                return;
        }
    }
}
