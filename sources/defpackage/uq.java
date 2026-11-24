package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ExternalActionActivity;
public final class uq implements ViewTreeObserver.OnGlobalLayoutListener {
    public final byte a;
    public final Object b;

    public uq(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                fr frVar = (fr) obj;
                if (!frVar.getInternalPopup().a()) {
                    frVar.f.l(wq.b(frVar), wq.a(frVar));
                }
                ViewTreeObserver viewTreeObserver = frVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    vq.a(viewTreeObserver, this);
                    return;
                }
                return;
            case 1:
                cr crVar = (cr) obj;
                fr frVar2 = crVar.X;
                WeakHashMap weakHashMap = kfc.a;
                if (frVar2.isAttachedToWindow() && frVar2.getGlobalVisibleRect(crVar.V)) {
                    crVar.q();
                    crVar.f();
                    return;
                }
                crVar.dismiss();
                return;
            case 2:
                fe1 fe1Var = (fe1) obj;
                ArrayList arrayList = fe1Var.n;
                if (fe1Var.a() && arrayList.size() > 0 && !((ee1) arrayList.get(0)).a.O) {
                    View view = fe1Var.F;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            ((ee1) obj2).a.f();
                        }
                        return;
                    }
                    fe1Var.dismiss();
                    return;
                }
                return;
            case 3:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                externalActionActivity.f();
                ActionBarLayout actionBarLayout = externalActionActivity.c;
                if (actionBarLayout != null) {
                    actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 4:
                wu6 wu6Var = (wu6) obj;
                wu6Var.V.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = wu6Var.Y;
                if (hashSet != null && hashSet.size() != 0) {
                    mu6 mu6Var = new mu6(wu6Var, (byte) 0);
                    int firstVisiblePosition = wu6Var.V.getFirstVisiblePosition();
                    boolean z = false;
                    while (i < wu6Var.V.getChildCount()) {
                        View childAt = wu6Var.V.getChildAt(i);
                        if (wu6Var.Y.contains((ew6) wu6Var.W.getItem(firstVisiblePosition + i))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(wu6Var.z0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z) {
                                alphaAnimation.setAnimationListener(mu6Var);
                                z = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                        i++;
                    }
                    return;
                }
                wu6Var.j(true);
                return;
            case 5:
                tt7 tt7Var = (tt7) obj;
                tt7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int currentItem = tt7Var.e.getCurrentItem();
                tt7Var.h = currentItem;
                tt7Var.d(currentItem, 0);
                return;
            default:
                zoa zoaVar = (zoa) obj;
                q27 q27Var = zoaVar.n;
                if (zoaVar.a() && !q27Var.O) {
                    View view2 = zoaVar.y;
                    if (view2 != null && view2.isShown()) {
                        q27Var.f();
                        return;
                    } else {
                        zoaVar.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
