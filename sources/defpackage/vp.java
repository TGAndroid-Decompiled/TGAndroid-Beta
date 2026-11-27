package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ExternalActionActivity;
public final class vp implements ViewTreeObserver.OnGlobalLayoutListener {
    public final byte a;
    public final Object b;

    public vp(Object obj, byte b) {
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
                gq gqVar = (gq) obj;
                if (!gqVar.getInternalPopup().a()) {
                    gqVar.f.l(xp.b(gqVar), xp.a(gqVar));
                }
                ViewTreeObserver viewTreeObserver = gqVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    wp.a(viewTreeObserver, this);
                    return;
                }
                return;
            case 1:
                dq dqVar = (dq) obj;
                gq gqVar2 = dqVar.X;
                WeakHashMap weakHashMap = ihc.a;
                if (gqVar2.isAttachedToWindow() && gqVar2.getGlobalVisibleRect(dqVar.V)) {
                    dqVar.q();
                    dqVar.g();
                    return;
                }
                dqVar.dismiss();
                return;
            case 2:
                fd1 fd1Var = (fd1) obj;
                ArrayList arrayList = fd1Var.n;
                if (fd1Var.a() && arrayList.size() > 0 && !((ed1) arrayList.get(0)).a.O) {
                    View view = fd1Var.F;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            ((ed1) obj2).a.g();
                        }
                        return;
                    }
                    fd1Var.dismiss();
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
                bv6 bv6Var = (bv6) obj;
                bv6Var.V.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = bv6Var.Y;
                if (hashSet != null && hashSet.size() != 0) {
                    ru6 ru6Var = new ru6(bv6Var, (byte) 0);
                    int firstVisiblePosition = bv6Var.V.getFirstVisiblePosition();
                    boolean z = false;
                    while (i < bv6Var.V.getChildCount()) {
                        View childAt = bv6Var.V.getChildAt(i);
                        if (bv6Var.Y.contains((jw6) bv6Var.W.getItem(firstVisiblePosition + i))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(bv6Var.z0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z) {
                                alphaAnimation.setAnimationListener(ru6Var);
                                z = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                        i++;
                    }
                    return;
                }
                bv6Var.j(true);
                return;
            case 5:
                yu7 yu7Var = (yu7) obj;
                yu7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int currentItem = yu7Var.e.getCurrentItem();
                yu7Var.h = currentItem;
                yu7Var.d(currentItem, 0);
                return;
            default:
                vqa vqaVar = (vqa) obj;
                x27 x27Var = vqaVar.n;
                if (vqaVar.a() && !x27Var.O) {
                    View view2 = vqaVar.y;
                    if (view2 != null && view2.isShown()) {
                        x27Var.g();
                        return;
                    } else {
                        vqaVar.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
