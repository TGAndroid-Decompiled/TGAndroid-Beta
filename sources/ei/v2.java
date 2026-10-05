package ei;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import ci.qc;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
public final class v2 implements View.OnLayoutChangeListener {
    public final int f9390a;
    public final Object f9391b;

    public v2(Object obj, int i10) {
        this.f9390a = i10;
        this.f9391b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19 = this.f9390a;
        int i20 = 0;
        Object obj = this.f9391b;
        switch (i19) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                l3 l3Var = (l3) obj;
                BotFullscreenButtons botFullscreenButtons = l3Var.m0;
                b3 b3Var = l3Var.v;
                b3Var.setSwipeOffsetY(b3Var.getHeight());
                l3Var.f9157e.setAlpha(1.0f);
                if (l3Var.G0 != Float.MAX_VALUE) {
                    b3Var.setSwipeOffsetAnimationDisallowed(true);
                    b3Var.setOffsetY(l3Var.G0);
                    b3Var.setSwipeOffsetAnimationDisallowed(false);
                }
                l3Var.f9181x.o(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (!l3Var.F0 && !l3Var.m()) {
                    o1.k kVar = new o1.k(b3Var, q4.f9281b0, 0.0f);
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.75f);
                    lVar.b(500.0f);
                    kVar.f16993u = lVar;
                    kVar.a(new o1.f() {
                        @Override
                        public final void a(o1.h hVar, boolean z10, float f7, float f10) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    kVar.f();
                } else {
                    b3Var.f(b3Var.getTopActionBarOffsetY() + (-b3Var.getOffsetY()), false, new qc(animationNotificationsLocker, 14));
                }
                b3Var.K = true;
                if (l3Var.f9156d0 && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    return;
                }
                return;
            case 1:
                hg.n.b0((hg.n) obj);
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
                    if (searchView.f2175f0) {
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
