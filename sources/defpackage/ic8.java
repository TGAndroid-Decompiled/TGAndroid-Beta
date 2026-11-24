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
public final class ic8 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;
    public final Object c;

    public ic8(w49 w49Var, tk4 tk4Var, f69 f69Var) {
        this.a = (byte) 7;
        this.c = w49Var;
        this.b = tk4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 21:
                ((dhc) this.b).a();
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
                ((jc8) obj).h = null;
                ((Runnable) obj2).run();
                return;
            case 1:
                ((kj8) obj).v1 = false;
                ((zi8) obj2).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 2:
                yj8 yj8Var = (yj8) obj;
                yj8Var.C2 = false;
                yj8Var.B2 = 1.0f;
                yj8Var.n2.invalidate();
                Drawable drawable = (Drawable) obj2;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new pl(this, drawable, (byte) 20));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 3:
                gk8 gk8Var = (gk8) obj;
                PremiumPreviewFragment premiumPreviewFragment = gk8Var.n;
                ((ub8) obj2).setVisibility(8);
                for (int i = 0; i < premiumPreviewFragment.V.getChildCount(); i++) {
                    View childAt = premiumPreviewFragment.V.getChildAt(i);
                    if (childAt != gk8Var.e) {
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
                    if (gda.o() > 0) {
                        gm.W3(profileStoriesView);
                        gm.d3(new pp8(profileStoriesView, (byte) 9), 180L);
                    }
                }
                profileStoriesView.a0 = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 5:
                g29 g29Var = (g29) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    g29Var.t0.b(g29Var.A0, false);
                }
                g29Var.setRotationY(0.0f);
                g29Var.B0 = 1.0f;
                return;
            case 6:
                t49 t49Var = (t49) obj;
                cw6 cw6Var = t49Var.e;
                if (((ValueAnimator) cw6Var.h) != null) {
                    ((r59) cw6Var.e).W1 = false;
                    ArrayList arrayList = t49Var.b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        View view = (View) obj3;
                        if (view instanceof mk5) {
                            ((mk5) view).b(false, true);
                        }
                        view.setTranslationY(0.0f);
                        ((u46) cw6Var.f).getClass();
                        f69.w0(view);
                        ((r59) cw6Var.e).removeView(view);
                        nue nueVar = (nue) cw6Var.r;
                        if (nueVar != null) {
                            nueVar.d(view);
                        }
                    }
                    ((r59) cw6Var.e).setScrollEnabled(true);
                    ((r59) cw6Var.e).setVerticalScrollBarEnabled(true);
                    boolean z = e21.a;
                    int childCount = ((r59) cw6Var.e).getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt2 = ((r59) cw6Var.e).getChildAt(i4);
                        if (childAt2 instanceof mk5) {
                            ((mk5) childAt2).b(false, false);
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
                        if (view2 instanceof mk5) {
                            ((mk5) view2).b(false, false);
                        }
                        view2.setTranslationY(0.0f);
                    }
                    u49 u49Var = t49Var.d;
                    if (u49Var != null) {
                        u49Var.E();
                    }
                    nue nueVar2 = (nue) cw6Var.r;
                    if (nueVar2 != null) {
                        nueVar2.a();
                    }
                    ((SparseArray) cw6Var.s).clear();
                    cw6Var.h = null;
                    return;
                }
                return;
            case 7:
                tk4 tk4Var = (tk4) obj2;
                tk4Var.setAlpha(1.0f);
                f69.w0(tk4Var);
                w49 w49Var = (w49) obj;
                w49Var.c.remove(tk4Var);
                w49Var.a.removeView(tk4Var);
                return;
            case 8:
                super.onAnimationEnd(animator);
                w49 w49Var2 = (w49) ((m42) obj).d;
                w49Var2.g.remove((AnimatorSet) obj2);
                if (w49Var2.g.isEmpty()) {
                    w49Var2.b.clear();
                    w49Var2.d = true;
                    w49Var2.a.invalidate();
                    return;
                }
                return;
            case 9:
                jf9 jf9Var = (jf9) obj;
                jf9Var.F = false;
                jf9Var.w.setAlpha(1.0f);
                jf9Var.w.q2.setVisibility(0);
                jf9Var.y.r(gm.L(22.0f));
                jf9Var.y.setAlpha(255);
                va2 va2Var = jf9Var.s;
                va2Var.e = true;
                va2Var.invalidate();
                ((Runnable) obj2).run();
                return;
            case 10:
                qj9 qj9Var = (qj9) obj;
                qj9Var.b = true;
                qj9Var.f = null;
                View view3 = (View) obj2;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            case 11:
                dj3 dj3Var = (dj3) obj;
                if (dj3Var.h != null) {
                    dj3Var.h = null;
                    dj3Var.n.e();
                    ((kj3) obj2).onTransitionAnimationEnd(true, false);
                    dj3Var.e = 1.0f;
                    dj3Var.g();
                    dj3Var.d(false);
                    return;
                }
                return;
            case 12:
                wc1 wc1Var = (wc1) obj;
                ((ao9) obj2).setDraw(true);
                if (wc1Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) wc1Var.getParent()).removeView(wc1Var);
                    return;
                }
                return;
            case 13:
                qb8 qb8Var = (qb8) obj2;
                if (qb8Var != null) {
                    qb8Var.a.v0(true, true);
                }
                ((SecretMediaViewer) obj).s = false;
                gm.c3(new kf9(this, (byte) 23));
                return;
            case 14:
                ((lz9) obj2).run();
                vz9 vz9Var = (vz9) obj;
                ly9 ly9Var = vz9Var.Y0;
                if (ly9Var != null) {
                    ly9Var.dismiss();
                    vz9Var.Y0 = null;
                    return;
                }
                return;
            case 15:
                i1a i1aVar = (i1a) obj;
                i1aVar.removeView((wc5) obj2);
                i1aVar.h.clear();
                i1aVar.b = null;
                i1aVar.c = false;
                ((j1a) i1aVar.n).b.setAllowDrawCursor(true);
                return;
            case 16:
                l6a l6aVar = (l6a) obj;
                try {
                    ((WindowManager) obj2).removeViewImmediate(l6aVar.B);
                } catch (Exception unused) {
                }
                e6a e6aVar = l6aVar.C;
                if (e6aVar != null) {
                    gm.r(e6aVar);
                    return;
                }
                return;
            case 17:
                y1b y1bVar = (y1b) obj;
                y1bVar.b = 0.0f;
                y1bVar.invalidate();
                ((gt9) obj2).invalidate();
                return;
            case 18:
                i1a i1aVar2 = (i1a) obj;
                i1aVar2.removeView((wc5) obj2);
                i1aVar2.h.clear();
                i1aVar2.b = null;
                i1aVar2.c = false;
                x7b x7bVar = (x7b) i1aVar2.n;
                x7bVar.b.setAllowDrawCursor(true);
                m7b m7bVar = x7bVar.h;
                if (m7bVar != null) {
                    m7bVar.run();
                }
                if (x7bVar.M) {
                    x7bVar.fullScroll(130);
                    x7bVar.M = false;
                    return;
                }
                return;
            case 19:
                qdb qdbVar = (qdb) obj;
                qdbVar.b.remove((pdb) obj2);
                qdbVar.i();
                return;
            case 20:
                dac dacVar = (dac) obj;
                dacVar.removeView((wc5) obj2);
                dacVar.e = null;
                dacVar.a = null;
                dacVar.b = false;
                UsersSelectActivity usersSelectActivity = dacVar.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.Q.isEmpty()) {
                    usersSelectActivity.c.t(true, true);
                    return;
                }
                return;
            case 21:
                ((dhc) obj2).c();
                return;
            case 22:
                ((Runnable) obj2).run();
                iic iicVar = (iic) obj;
                iicVar.f0.setScaleX(1.15f);
                iicVar.f0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iicVar.f0.getLayoutParams();
                marginLayoutParams.leftMargin = gm.L(10.0f);
                marginLayoutParams.rightMargin = gm.L(10.0f);
                iicVar.f0.setVisibility(8);
                return;
            case 23:
                TextView textView = ((rkc) obj).d;
                textView.setText((String) obj2);
                textView.setTranslationY(0.0f);
                textView.setAlpha(1.0f);
                return;
            case 24:
                ((rkc) obj).removeView((qkc) obj2);
                return;
            default:
                ((hzc) obj2).a.d(1.0f);
                dzc.e((View) obj);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 21:
                ((dhc) this.b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ic8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public ic8(Object obj, View view, byte b) {
        this.a = b;
        this.b = obj;
        this.c = view;
    }
}
