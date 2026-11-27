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
public final class wd8 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;
    public final Object c;

    public wd8(i69 i69Var, tk4 tk4Var, q79 q79Var) {
        this.a = (byte) 7;
        this.c = i69Var;
        this.b = tk4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 21:
                ((cjc) this.b).a();
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
                ((xd8) obj).h = null;
                ((Runnable) obj2).run();
                return;
            case 1:
                ((xk8) obj).v1 = false;
                ((lk8) obj2).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 2:
                kl8 kl8Var = (kl8) obj;
                kl8Var.C2 = false;
                kl8Var.B2 = 1.0f;
                kl8Var.n2.invalidate();
                Drawable drawable = (Drawable) obj2;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new lk(this, drawable, (byte) 20));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 3:
                rl8 rl8Var = (rl8) obj;
                PremiumPreviewFragment premiumPreviewFragment = rl8Var.n;
                ((jd8) obj2).setVisibility(8);
                for (int i = 0; i < premiumPreviewFragment.V.getChildCount(); i++) {
                    View childAt = premiumPreviewFragment.V.getChildAt(i);
                    if (childAt != rl8Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 4:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                boolean[] zArr = (boolean[]) obj2;
                if (!zArr[0]) {
                    zArr[0] = true;
                    int i2 = ProfileStoriesView.t0;
                    if (xea.o() > 0) {
                        hl.W3(profileStoriesView);
                        hl.d3(new uk8(profileStoriesView, (byte) 17), 180L);
                    }
                }
                profileStoriesView.a0 = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 5:
                s39 s39Var = (s39) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    s39Var.t0.b(s39Var.A0, false);
                }
                s39Var.setRotationY(0.0f);
                s39Var.B0 = 1.0f;
                return;
            case 6:
                f69 f69Var = (f69) obj;
                hw6 hw6Var = f69Var.e;
                if (((ValueAnimator) hw6Var.h) != null) {
                    ((d79) hw6Var.e).W1 = false;
                    ArrayList arrayList = f69Var.b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        View view = (View) obj3;
                        if (view instanceof pk5) {
                            ((pk5) view).b(false, true);
                        }
                        view.setTranslationY(0.0f);
                        ((x46) hw6Var.f).getClass();
                        q79.w0(view);
                        ((d79) hw6Var.e).removeView(view);
                        cxe cxeVar = (cxe) hw6Var.r;
                        if (cxeVar != null) {
                            cxeVar.d(view);
                        }
                    }
                    ((d79) hw6Var.e).setScrollEnabled(true);
                    ((d79) hw6Var.e).setVerticalScrollBarEnabled(true);
                    boolean z = f11.a;
                    int childCount = ((d79) hw6Var.e).getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt2 = ((d79) hw6Var.e).getChildAt(i4);
                        if (childAt2 instanceof pk5) {
                            ((pk5) childAt2).b(false, false);
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
                        if (view2 instanceof pk5) {
                            ((pk5) view2).b(false, false);
                        }
                        view2.setTranslationY(0.0f);
                    }
                    g69 g69Var = f69Var.d;
                    if (g69Var != null) {
                        g69Var.E();
                    }
                    cxe cxeVar2 = (cxe) hw6Var.r;
                    if (cxeVar2 != null) {
                        cxeVar2.a();
                    }
                    ((SparseArray) hw6Var.s).clear();
                    hw6Var.h = null;
                    return;
                }
                return;
            case 7:
                tk4 tk4Var = (tk4) obj2;
                tk4Var.setAlpha(1.0f);
                q79.w0(tk4Var);
                i69 i69Var = (i69) obj;
                i69Var.c.remove(tk4Var);
                i69Var.a.removeView(tk4Var);
                return;
            case 8:
                super.onAnimationEnd(animator);
                i69 i69Var2 = (i69) ((r32) obj).d;
                i69Var2.g.remove((AnimatorSet) obj2);
                if (i69Var2.g.isEmpty()) {
                    i69Var2.b.clear();
                    i69Var2.d = true;
                    i69Var2.a.invalidate();
                    return;
                }
                return;
            case 9:
                yg9 yg9Var = (yg9) obj;
                yg9Var.F = false;
                yg9Var.w.setAlpha(1.0f);
                yg9Var.w.p2.setVisibility(0);
                yg9Var.y.r(hl.L(22.0f));
                yg9Var.y.setAlpha(255);
                z92 z92Var = yg9Var.s;
                z92Var.e = true;
                z92Var.invalidate();
                ((Runnable) obj2).run();
                return;
            case 10:
                dl9 dl9Var = (dl9) obj;
                dl9Var.b = true;
                dl9Var.f = null;
                View view3 = (View) obj2;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            case 11:
                li3 li3Var = (li3) obj;
                if (li3Var.h != null) {
                    li3Var.h = null;
                    li3Var.n.e();
                    ((si3) obj2).onTransitionAnimationEnd(true, false);
                    li3Var.e = 1.0f;
                    li3Var.g();
                    li3Var.d(false);
                    return;
                }
                return;
            case 12:
                xb1 xb1Var = (xb1) obj;
                ((pp9) obj2).setDraw(true);
                if (xb1Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) xb1Var.getParent()).removeView(xb1Var);
                    return;
                }
                return;
            case 13:
                fd8 fd8Var = (fd8) obj2;
                if (fd8Var != null) {
                    fd8Var.a.v0(true, true);
                }
                ((SecretMediaViewer) obj).s = false;
                hl.c3(new ux9(this, (byte) 1));
                return;
            case 14:
                ((c1a) obj2).run();
                n1a n1aVar = (n1a) obj;
                c0a c0aVar = n1aVar.Y0;
                if (c0aVar != null) {
                    c0aVar.dismiss();
                    n1aVar.Y0 = null;
                    return;
                }
                return;
            case 15:
                a3a a3aVar = (a3a) obj;
                a3aVar.removeView((zc5) obj2);
                a3aVar.h.clear();
                a3aVar.b = null;
                a3aVar.c = false;
                ((b3a) a3aVar.n).b.setAllowDrawCursor(true);
                return;
            case 16:
                b8a b8aVar = (b8a) obj;
                try {
                    ((WindowManager) obj2).removeViewImmediate(b8aVar.B);
                } catch (Exception unused) {
                }
                en9 en9Var = b8aVar.C;
                if (en9Var != null) {
                    hl.r(en9Var);
                    return;
                }
                return;
            case 17:
                u3b u3bVar = (u3b) obj;
                u3bVar.b = 0.0f;
                u3bVar.invalidate();
                ((xu9) obj2).invalidate();
                return;
            case 18:
                a3a a3aVar2 = (a3a) obj;
                a3aVar2.removeView((zc5) obj2);
                a3aVar2.h.clear();
                a3aVar2.b = null;
                a3aVar2.c = false;
                t9b t9bVar = (t9b) a3aVar2.n;
                t9bVar.b.setAllowDrawCursor(true);
                i9b i9bVar = t9bVar.h;
                if (i9bVar != null) {
                    i9bVar.run();
                }
                if (t9bVar.M) {
                    t9bVar.fullScroll(130);
                    t9bVar.M = false;
                    return;
                }
                return;
            case 19:
                kfb kfbVar = (kfb) obj;
                kfbVar.b.remove((jfb) obj2);
                kfbVar.i();
                return;
            case 20:
                ccc cccVar = (ccc) obj;
                cccVar.removeView((zc5) obj2);
                cccVar.e = null;
                cccVar.a = null;
                cccVar.b = false;
                UsersSelectActivity usersSelectActivity = cccVar.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.Q.isEmpty()) {
                    usersSelectActivity.c.t(true, true);
                    return;
                }
                return;
            case 21:
                ((cjc) obj2).c();
                return;
            case 22:
                ((Runnable) obj2).run();
                mkc mkcVar = (mkc) obj;
                mkcVar.f0.setScaleX(1.15f);
                mkcVar.f0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mkcVar.f0.getLayoutParams();
                marginLayoutParams.leftMargin = hl.L(10.0f);
                marginLayoutParams.rightMargin = hl.L(10.0f);
                mkcVar.f0.setVisibility(8);
                return;
            case 23:
                TextView textView = ((dnc) obj).d;
                textView.setText((String) obj2);
                textView.setTranslationY(0.0f);
                textView.setAlpha(1.0f);
                return;
            case 24:
                ((dnc) obj).removeView((cnc) obj2);
                return;
            default:
                ((w1d) obj2).a.d(1.0f);
                s1d.e((View) obj);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 21:
                ((cjc) this.b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public wd8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public wd8(Object obj, View view, byte b) {
        this.a = b;
        this.b = obj;
        this.c = view;
    }
}
