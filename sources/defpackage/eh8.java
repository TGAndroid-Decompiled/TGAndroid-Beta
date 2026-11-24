package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.UsersSelectActivity;
public final class eh8 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;
    public final Object c;

    public eh8(t29 t29Var, pi4 pi4Var, d49 d49Var) {
        this.a = (byte) 6;
        this.c = t29Var;
        this.b = pi4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 20:
                ((dfc) this.b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((jh8) obj).v1 = false;
                ((xg8) obj2).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 1:
                xh8 xh8Var = (xh8) obj;
                xh8Var.C2 = false;
                xh8Var.B2 = 1.0f;
                xh8Var.n2.invalidate();
                Drawable drawable = (Drawable) obj2;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new pk(this, drawable, (byte) 20));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 2:
                ei8 ei8Var = (ei8) obj;
                PremiumPreviewFragment premiumPreviewFragment = ei8Var.n;
                ((t98) obj2).setVisibility(8);
                for (int i = 0; i < premiumPreviewFragment.V.getChildCount(); i++) {
                    View childAt = premiumPreviewFragment.V.getChildAt(i);
                    if (childAt != ei8Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                boolean[] zArr = (boolean[]) obj2;
                if (!zArr[0]) {
                    zArr[0] = true;
                    int i2 = ProfileStoriesView.t0;
                    if (gba.o() > 0) {
                        gl.W3(profileStoriesView);
                        gl.d3(new sr8(profileStoriesView, (byte) 1), 180L);
                    }
                }
                profileStoriesView.a0 = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 4:
                e09 e09Var = (e09) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    e09Var.t0.b(e09Var.A0, false);
                }
                e09Var.setRotationY(0.0f);
                e09Var.B0 = 1.0f;
                return;
            case 5:
                q29 q29Var = (q29) obj;
                cu6 cu6Var = q29Var.e;
                if (((ValueAnimator) cu6Var.h) != null) {
                    ((o39) cu6Var.e).W1 = false;
                    ArrayList arrayList = q29Var.b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        View view = (View) obj3;
                        if (view instanceof ni5) {
                            ((ni5) view).b(false, true);
                        }
                        view.setTranslationY(0.0f);
                        ((t26) cu6Var.f).getClass();
                        d49.w0(view);
                        ((o39) cu6Var.e).removeView(view);
                        kse kseVar = (kse) cu6Var.r;
                        if (kseVar != null) {
                            kseVar.d(view);
                        }
                    }
                    ((o39) cu6Var.e).setScrollEnabled(true);
                    ((o39) cu6Var.e).setVerticalScrollBarEnabled(true);
                    boolean z = w01.a;
                    int childCount = ((o39) cu6Var.e).getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt2 = ((o39) cu6Var.e).getChildAt(i4);
                        if (childAt2 instanceof ni5) {
                            ((ni5) childAt2).b(false, false);
                        }
                        childAt2.setTranslationY(0.0f);
                    }
                    ArrayList arrayList2 = (ArrayList) obj2;
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj4 = arrayList2.get(i5);
                        i5++;
                        View view2 = (View) obj4;
                        if (view2 instanceof ni5) {
                            ((ni5) view2).b(false, false);
                        }
                        view2.setTranslationY(0.0f);
                    }
                    r29 r29Var = q29Var.d;
                    if (r29Var != null) {
                        r29Var.E();
                    }
                    kse kseVar2 = (kse) cu6Var.r;
                    if (kseVar2 != null) {
                        kseVar2.a();
                    }
                    ((SparseArray) cu6Var.s).clear();
                    cu6Var.h = null;
                    return;
                }
                return;
            case 6:
                pi4 pi4Var = (pi4) obj2;
                pi4Var.setAlpha(1.0f);
                d49.w0(pi4Var);
                t29 t29Var = (t29) obj;
                t29Var.c.remove(pi4Var);
                t29Var.a.removeView(pi4Var);
                return;
            case 7:
                super.onAnimationEnd(animator);
                t29 t29Var2 = (t29) ((a32) obj).d;
                t29Var2.g.remove((AnimatorSet) obj2);
                if (t29Var2.g.isEmpty()) {
                    t29Var2.b.clear();
                    t29Var2.d = true;
                    t29Var2.a.invalidate();
                    return;
                }
                return;
            case 8:
                hd9 hd9Var = (hd9) obj;
                hd9Var.F = false;
                hd9Var.w.setAlpha(1.0f);
                hd9Var.w.q2.setVisibility(0);
                hd9Var.y.r(gl.L(22.0f));
                hd9Var.y.setAlpha(255);
                j92 j92Var = hd9Var.s;
                j92Var.e = true;
                j92Var.invalidate();
                ((Runnable) obj2).run();
                return;
            case 9:
                nh9 nh9Var = (nh9) obj;
                nh9Var.b = true;
                nh9Var.f = null;
                View view3 = (View) obj2;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            case 10:
                rh3 rh3Var = (rh3) obj;
                if (rh3Var.h != null) {
                    rh3Var.h = null;
                    rh3Var.n.e();
                    ((yh3) obj2).onTransitionAnimationEnd(true, false);
                    rh3Var.e = 1.0f;
                    rh3Var.g();
                    rh3Var.d(false);
                    return;
                }
                return;
            case 11:
                pb1 pb1Var = (pb1) obj;
                ((am9) obj2).setDraw(true);
                if (pb1Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pb1Var.getParent()).removeView(pb1Var);
                    return;
                }
                return;
            case 12:
                p98 p98Var = (p98) obj2;
                if (p98Var != null) {
                    p98Var.a.v0(true, true);
                }
                ((SecretMediaViewer) obj).s = false;
                gl.c3(new zk9(this, (byte) 15));
                return;
            case 13:
                ((jx9) obj2).run();
                tx9 tx9Var = (tx9) obj;
                jw9 jw9Var = tx9Var.Y0;
                if (jw9Var != null) {
                    jw9Var.dismiss();
                    tx9Var.Y0 = null;
                    return;
                }
                return;
            case 14:
                gz9 gz9Var = (gz9) obj;
                gz9Var.removeView((ya5) obj2);
                gz9Var.h.clear();
                gz9Var.b = null;
                gz9Var.c = false;
                ((hz9) gz9Var.n).b.setAllowDrawCursor(true);
                return;
            case 15:
                j4a j4aVar = (j4a) obj;
                try {
                    ((WindowManager) obj2).removeViewImmediate(j4aVar.B);
                } catch (Exception unused) {
                }
                tj9 tj9Var = j4aVar.C;
                if (tj9Var != null) {
                    gl.r(tj9Var);
                    return;
                }
                return;
            case 16:
                xza xzaVar = (xza) obj;
                xzaVar.b = 0.0f;
                xzaVar.invalidate();
                ((er9) obj2).invalidate();
                return;
            case 17:
                gz9 gz9Var2 = (gz9) obj;
                gz9Var2.removeView((ya5) obj2);
                gz9Var2.h.clear();
                gz9Var2.b = null;
                gz9Var2.c = false;
                v5b v5bVar = (v5b) gz9Var2.n;
                v5bVar.b.setAllowDrawCursor(true);
                l5b l5bVar = v5bVar.h;
                if (l5bVar != null) {
                    l5bVar.run();
                }
                if (v5bVar.M) {
                    v5bVar.fullScroll(130);
                    v5bVar.M = false;
                    return;
                }
                return;
            case 18:
                obb obbVar = (obb) obj;
                obbVar.b.remove((nbb) obj2);
                obbVar.i();
                return;
            case 19:
                c8c c8cVar = (c8c) obj;
                c8cVar.removeView((ya5) obj2);
                c8cVar.e = null;
                c8cVar.a = null;
                c8cVar.b = false;
                UsersSelectActivity usersSelectActivity = c8cVar.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.Q.isEmpty()) {
                    usersSelectActivity.c.t(true, true);
                    return;
                }
                return;
            case 20:
                ((dfc) obj2).c();
                return;
            case 21:
                ((Runnable) obj2).run();
                hgc hgcVar = (hgc) obj;
                hgcVar.f0.setScaleX(1.15f);
                hgcVar.f0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hgcVar.f0.getLayoutParams();
                marginLayoutParams.leftMargin = gl.L(10.0f);
                marginLayoutParams.rightMargin = gl.L(10.0f);
                hgcVar.f0.setVisibility(8);
                return;
            case 22:
                TextView textView = ((ric) obj).d;
                textView.setText((String) obj2);
                textView.setTranslationY(0.0f);
                textView.setAlpha(1.0f);
                return;
            case 23:
                ((ric) obj).removeView((qic) obj2);
                return;
            default:
                ((gxc) obj2).a.d(1.0f);
                cxc.e((View) obj);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 20:
                ((dfc) this.b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public eh8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public eh8(Object obj, View view, byte b) {
        this.a = b;
        this.b = obj;
        this.c = view;
    }
}
