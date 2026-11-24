package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ExternalActionActivity;
public final class up implements ViewTreeObserver.OnGlobalLayoutListener {
    public final byte a;
    public final Object b;

    public up(Object obj, byte b) {
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
                fq fqVar = (fq) obj;
                if (!fqVar.getInternalPopup().a()) {
                    fqVar.f.m(wp.b(fqVar), wp.a(fqVar));
                }
                ViewTreeObserver viewTreeObserver = fqVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    vp.a(viewTreeObserver, this);
                    return;
                }
                return;
            case 1:
                cq cqVar = (cq) obj;
                fq fqVar2 = cqVar.X;
                WeakHashMap weakHashMap = jdc.a;
                if (fqVar2.isAttachedToWindow() && fqVar2.getGlobalVisibleRect(cqVar.V)) {
                    cqVar.s();
                    cqVar.f();
                    return;
                }
                cqVar.dismiss();
                return;
            case 2:
                xc1 xc1Var = (xc1) obj;
                ArrayList arrayList = xc1Var.n;
                if (xc1Var.a() && arrayList.size() > 0 && !((wc1) arrayList.get(0)).a.O) {
                    View view = xc1Var.F;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            ((wc1) obj2).a.f();
                        }
                        return;
                    }
                    xc1Var.dismiss();
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
                ws6 ws6Var = (ws6) obj;
                ws6Var.V.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = ws6Var.Y;
                if (hashSet != null && hashSet.size() != 0) {
                    ms6 ms6Var = new ms6(ws6Var, (byte) 0);
                    int firstVisiblePosition = ws6Var.V.getFirstVisiblePosition();
                    boolean z = false;
                    while (i < ws6Var.V.getChildCount()) {
                        View childAt = ws6Var.V.getChildAt(i);
                        if (ws6Var.Y.contains((eu6) ws6Var.W.getItem(firstVisiblePosition + i))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(ws6Var.z0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z) {
                                alphaAnimation.setAnimationListener(ms6Var);
                                z = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                        i++;
                    }
                    return;
                }
                ws6Var.j(true);
                return;
            case 5:
                sr7 sr7Var = (sr7) obj;
                sr7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int currentItem = sr7Var.e.getCurrentItem();
                sr7Var.h = currentItem;
                sr7Var.d(currentItem, 0);
                return;
            default:
                yma ymaVar = (yma) obj;
                q07 q07Var = ymaVar.n;
                if (ymaVar.a() && !q07Var.O) {
                    View view2 = ymaVar.y;
                    if (view2 != null && view2.isShown()) {
                        q07Var.f();
                        return;
                    } else {
                        ymaVar.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
