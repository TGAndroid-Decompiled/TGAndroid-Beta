package m;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import mh.f4;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
public final class t2 implements View.OnLayoutChangeListener {
    public final int f17096a;
    public final Object f17097b;

    public t2(Object obj, int i9) {
        this.f17096a = i9;
        this.f17097b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int i18 = this.f17096a;
        int i19 = 0;
        Object obj = this.f17097b;
        switch (i18) {
            case 0:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.B;
                View view2 = searchView.J;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.D.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = w3.a(searchView);
                    if (searchView.f493b0) {
                        i19 = resources.getDimensionPixelSize(2131165225) + resources.getDimensionPixelSize(2131165226);
                    }
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    if (a2) {
                        i17 = -rect.left;
                    } else {
                        i17 = paddingLeft - (rect.left + i19);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i17);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i19) - paddingLeft);
                    return;
                }
                return;
            case 1:
                view.removeOnLayoutChangeListener(this);
                mh.c3 c3Var = (mh.c3) obj;
                BotFullscreenButtons botFullscreenButtons = c3Var.f17760i0;
                mh.t2 t2Var = c3Var.v;
                t2Var.setSwipeOffsetY(t2Var.getHeight());
                c3Var.f17754e.setAlpha(1.0f);
                if (c3Var.C0 != Float.MAX_VALUE) {
                    t2Var.setSwipeOffsetAnimationDisallowed(true);
                    t2Var.setOffsetY(c3Var.C0);
                    t2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                c3Var.f17778x.n(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (!c3Var.B0 && !c3Var.m()) {
                    o1.j jVar = new o1.j(t2Var, f4.U, 0.0f);
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.75f);
                    kVar.b(500.0f);
                    jVar.f18800u = kVar;
                    jVar.a(new o1.f() {
                        @Override
                        public final void a(o1.h hVar, boolean z10, float f10, float f11) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    jVar.f();
                } else {
                    t2Var.f(t2Var.getTopActionBarOffsetY() + (-t2Var.getOffsetY()), false, new mh.m2(animationNotificationsLocker, 0));
                }
                t2Var.G = true;
                if (c3Var.Z && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    return;
                }
                return;
            default:
                pf.l.a0((pf.l) obj);
                return;
        }
    }
}
