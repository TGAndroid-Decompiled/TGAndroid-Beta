package m;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import nh.d4;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;

public final class t2 implements View.OnLayoutChangeListener {

    public final int f17471a;

    public final Object f17472b;

    public t2(Object obj, int i10) {
        this.f17471a = i10;
        this.f17472b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f17471a) {
            case 0:
                SearchView searchView = (SearchView) this.f17472b;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.B;
                View view2 = searchView.J;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.D.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean zA = w3.a(searchView);
                    int dimensionPixelSize = searchView.f999b0 ? resources.getDimensionPixelSize(2131165226) + resources.getDimensionPixelSize(2131165225) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(zA ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                }
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                nh.b3 b3Var = (nh.b3) this.f17472b;
                BotFullscreenButtons botFullscreenButtons = b3Var.f18581i0;
                nh.s2 s2Var = b3Var.v;
                s2Var.setSwipeOffsetY(s2Var.getHeight());
                b3Var.f18575e.setAlpha(1.0f);
                if (b3Var.C0 != Float.MAX_VALUE) {
                    s2Var.setSwipeOffsetAnimationDisallowed(true);
                    s2Var.setOffsetY(b3Var.C0);
                    s2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                b3Var.f18599x.n(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (b3Var.B0 || b3Var.m()) {
                    s2Var.f(s2Var.getTopActionBarOffsetY() + (-s2Var.getOffsetY()), false, new nh.f0(animationNotificationsLocker, 7));
                } else {
                    o1.j jVar = new o1.j(s2Var, d4.U, 0.0f);
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.75f);
                    kVar.b(500.0f);
                    jVar.f19147u = kVar;
                    jVar.a(new o1.f() {
                        @Override
                        public final void a(o1.h hVar, boolean z10, float f10, float f11) {
                            animationNotificationsLocker.unlock();
                        }
                    });
                    jVar.f();
                }
                s2Var.G = true;
                if (b3Var.Z && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            default:
                qf.m.b0((qf.m) this.f17472b);
                break;
        }
    }
}
