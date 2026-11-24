package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;
public class r7 extends FrameLayout {
    public int E;
    public final TextView F;
    public k7 G;
    public boolean H;
    public n7 I;
    public Rect J;
    public int[] K;
    public View L;
    public y8c M;
    public int N;
    public int O;
    public int P;
    public m7 Q;
    public o7 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public FrameLayout a;
    public d7 a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public int b0;
    public final r6 c;
    public int c0;
    public m8 d;
    public boolean d0;
    public l7 e;
    public boolean e0;
    public LinearLayout f;
    public boolean f0;
    public boolean g0;
    public TextView h;
    public final ArrayList h0;
    public int i0;
    public final po j0;
    public float k0;
    public float l0;
    public r7 m0;
    public CharSequence n;
    public final ylb n0;
    public int o0;
    public View.OnClickListener p0;
    public boolean q0;
    public CharSequence r;
    public boolean r0;
    public c7 s;
    public PorterDuffColorFilter s0;
    public int t0;
    public km0 u0;
    public nm0 v0;
    public AnimatorSet w;
    public iac w0;
    public View x;
    public AnimatorSet x0;
    public final s09 y;
    public ArrayList y0;
    public HashMap z0;

    public r7(Context context, r6 r6Var, int i, int i2, boolean z, ylb ylbVar) {
        super(context);
        int i3;
        this.S = true;
        this.W = true;
        this.e0 = true;
        this.g0 = true;
        this.h0 = new ArrayList();
        this.i0 = -1;
        this.j0 = new po(null);
        this.n0 = ylbVar;
        if (i != 0) {
            if (z) {
                i3 = 5;
            } else {
                i3 = 1;
            }
            setBackgroundDrawable(cmb.f0(i, i3, -1));
        }
        this.c = r6Var;
        if (z) {
            TextView textView = new TextView(context);
            this.F = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(gm.o());
            textView.setGravity(17);
            textView.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i2 != 0) {
                textView.setTextColor(i2);
            }
            addView(textView, qoe.c(-1.0f, -2));
            return;
        }
        ?? imageView = new ImageView(context);
        this.y = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, qoe.c(-1.0f, -1));
        if (i2 != 0) {
            imageView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
    }

    public static a8 c(boolean z, boolean z2, ViewGroup viewGroup, int i, CharSequence charSequence, boolean z3, ylb ylbVar) {
        a8 a8Var = new a8(z3 ? 1 : 0, ylbVar, viewGroup.getContext(), z, z2);
        a8Var.j(charSequence, i, null);
        a8Var.setMinimumWidth(gm.L(196.0f));
        viewGroup.addView(a8Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a8Var.getLayoutParams();
        if (jb6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = gm.L(48.0f);
        a8Var.setLayoutParams(layoutParams);
        return a8Var;
    }

    private bka getShownSubMenuOverlay() {
        bka bkaVar;
        h27 subMenuOverlayHost = getSubMenuOverlayHost();
        if (subMenuOverlayHost != null) {
            bkaVar = subMenuOverlayHost.getOpenMenuOverlay();
        } else {
            bkaVar = null;
        }
        if (bkaVar == null || bkaVar.e != this || (!bkaVar.I && !bkaVar.U)) {
            return null;
        }
        return bkaVar;
    }

    public final p7 A(int i, int i2, String str) {
        p7 p7Var = new p7(0);
        p7Var.b = i;
        p7Var.c = i2;
        p7Var.d = null;
        p7Var.e = str;
        p7Var.f = true;
        H(p7Var);
        return p7Var;
    }

    public final void B(p09 p09Var, String str) {
        p7 p7Var = new p7(0);
        p7Var.b = (byte) 29;
        p7Var.c = 0;
        p7Var.d = p09Var;
        p7Var.e = str;
        p7Var.f = true;
        H(p7Var);
    }

    public final p7 C(sp1 sp1Var) {
        p7 p7Var = new p7(2);
        p7Var.c = 2131232262;
        p7Var.d = null;
        p7Var.e = null;
        p7Var.g = null;
        p7Var.h = sp1Var;
        H(p7Var);
        return p7Var;
    }

    public final p7 D() {
        p7 p7Var = new p7(3);
        p7Var.e = "";
        p7Var.i = (byte) 13;
        H(p7Var);
        return p7Var;
    }

    public final void E() {
        Integer num;
        boolean z;
        ArrayList arrayList = this.h0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        k7 k7Var = this.G;
        if (k7Var != null && k7Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new h7((byte) 0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) d53.g);
            transitionSet.addListener((Transition.TransitionListener) new i7(this, (byte) 0));
            TransitionManager.beginDelayedTransition(this.f, transitionSet);
        }
        if (this.f != null) {
            int i = 0;
            while (i < this.f.getChildCount()) {
                if (!arrayList2.remove(((q7) this.f.getChildAt(i)).getFilter())) {
                    this.f.removeViewAt(i);
                    i--;
                }
                i++;
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            sh4 sh4Var = (sh4) arrayList2.get(i2);
            sh4Var.getClass();
            q7 q7Var = new q7(getContext(), this.n0);
            q7Var.setData(sh4Var);
            q7Var.setOnClickListener(new t(this, q7Var, (byte) 4));
            this.f.addView(q7Var, qoe.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f != null) {
            for (int i3 = 0; i3 < this.f.getChildCount(); i3++) {
                q7 q7Var2 = (q7) this.f.getChildAt(i3);
                if (i3 == this.i0) {
                    z = true;
                } else {
                    z = false;
                }
                q7Var2.setExpanded(z);
            }
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            if (!isEmpty) {
                num = 1;
            } else {
                num = null;
            }
            linearLayout.setTag(num);
        }
        float x = this.e.getX();
        if (this.G.getTag() != null) {
            this.e.getViewTreeObserver().addOnPreDrawListener(new j7(this, x));
        }
        k();
    }

    public void F() {
        n7 n7Var = this.I;
        if (n7Var != null) {
            n7Var.k(this.e);
        }
    }

    public void G(boolean z) {
        r6 r6Var;
        l();
        k7 k7Var = this.G;
        if (k7Var != null && k7Var.getVisibility() != 0 && (r6Var = this.c) != null) {
            r6Var.b.B(T(z));
        }
    }

    public final p7 H(p7 p7Var) {
        ArrayList arrayList = this.y0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.y0 = arrayList;
        }
        arrayList.add(p7Var);
        HashMap hashMap = this.z0;
        if (hashMap == null) {
            hashMap = new HashMap();
            this.z0 = hashMap;
        }
        hashMap.put(Integer.valueOf(p7Var.b), p7Var);
        return p7Var;
    }

    public final void I(int i) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() != i) {
            this.b.setBackgroundColor(i);
            m8 m8Var = this.d;
            if (m8Var != null && m8Var.isShowing()) {
                this.b.invalidate();
            }
        }
    }

    public final void J(sh4 sh4Var) {
        if (!sh4Var.h) {
            return;
        }
        ArrayList arrayList = this.h0;
        arrayList.remove(sh4Var);
        int i = this.i0;
        if (i < 0 || i > arrayList.size() - 1) {
            this.i0 = arrayList.size() - 1;
        }
        E();
        this.e.m();
    }

    public r7 K(n7 n7Var) {
        this.I = n7Var;
        return this;
    }

    public final void L(km0 km0Var, nm0 nm0Var) {
        this.u0 = km0Var;
        this.v0 = nm0Var;
        View view = this.b;
        if (view != null && km0Var != null) {
            im0 c = km0Var.c(view, null, true);
            c.p(nm0Var);
            c.r(gm.L(12.0f));
            c.q(gm.L(8.0f));
            view.setBackground(c);
        }
    }

    public r7 M() {
        return N();
    }

    public r7 N() {
        if (this.c == null) {
            return this;
        }
        this.H = true;
        return this;
    }

    public final void O(int i, boolean z) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            qmb qmbVar = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
            int childCount = qmbVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = qmbVar.getChildAt(i2);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(i);
                } else if (childAt instanceof a8) {
                    if (z) {
                        ((a8) childAt).setIconColor(i);
                    } else {
                        ((a8) childAt).setTextColor(i);
                    }
                }
            }
        }
    }

    public void P(CharSequence charSequence, boolean z) {
        this.r = charSequence;
        if (this.h != null) {
            this.e0 = z;
            this.e.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.e.setSelection(charSequence.length());
            }
        }
    }

    public final void Q(int i, boolean z) {
        if (z) {
            S(i);
        } else {
            u(i);
        }
    }

    public final void R(int i) {
        S(i);
    }

    public final void S(int i) {
        p7 p7Var;
        View findViewWithTag;
        HashMap hashMap = this.z0;
        if (hashMap == null) {
            p7Var = null;
        } else {
            p7Var = (p7) hashMap.get(Integer.valueOf(i));
        }
        if (p7Var != null) {
            p7Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i))) != null && findViewWithTag.getVisibility() != 0) {
            findViewWithTag.setAlpha(0.0f);
            wi8.t(findViewWithTag.animate().alpha(1.0f), d53.f, 150L);
            findViewWithTag.setVisibility(0);
        }
    }

    public boolean T(boolean z) {
        r6 r6Var;
        AnimatorSet animatorSet;
        s09 iconView;
        Animator e;
        l();
        n7 n7Var = this.I;
        if (this.G == null || (n7Var != null && !n7Var.c())) {
            return false;
        }
        n7 n7Var2 = this.I;
        if (n7Var2 != null && (e = n7Var2.e()) != null) {
            e.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            r6Var = this.c;
            if (i >= r6Var.getChildCount()) {
                break;
            }
            View childAt = r6Var.getChildAt(i);
            if ((childAt instanceof r7) && (iconView = ((r7) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i++;
        }
        Object tag = this.G.getTag();
        k7 k7Var = this.G;
        Property property = View.ALPHA;
        if (tag != null) {
            k7Var.setTag(null);
            AnimatorSet animatorSet2 = this.x0;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
                this.x0.cancel();
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.x0 = animatorSet3;
            k7 k7Var2 = this.G;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(k7Var2, property, k7Var2.getAlpha(), 0.0f));
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((View) arrayList.get(i2)).setAlpha(0.0f);
                this.x0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i2), property, ((View) arrayList.get(i2)).getAlpha(), 1.0f));
            }
            this.x0.setDuration(150L);
            this.x0.addListener(new g7(this, arrayList, (byte) 0));
            this.x0.start();
            this.e.clearFocus();
            setVisibility(0);
            ArrayList arrayList2 = this.h0;
            if (!arrayList2.isEmpty() && this.I != null) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (((sh4) arrayList2.get(i3)).h) {
                        this.I.j((sh4) arrayList2.get(i3));
                    }
                }
            }
            n7 n7Var3 = this.I;
            if (n7Var3 != null) {
                n7Var3.h();
            }
            if (z) {
                gm.t1(this.e);
            }
            r6Var.requestLayout();
            requestLayout();
            return false;
        }
        k7Var.setVisibility(0);
        this.G.setAlpha(0.0f);
        AnimatorSet animatorSet4 = this.x0;
        if (animatorSet4 != null) {
            animatorSet4.removeAllListeners();
            this.x0.cancel();
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.x0 = animatorSet5;
        k7 k7Var3 = this.G;
        animatorSet5.playTogether(ObjectAnimator.ofFloat(k7Var3, property, k7Var3.getAlpha(), 1.0f));
        int i4 = 0;
        while (true) {
            int size = arrayList.size();
            animatorSet = this.x0;
            if (i4 >= size) {
                break;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i4), property, ((View) arrayList.get(i4)).getAlpha(), 0.0f));
            i4++;
        }
        animatorSet.setDuration(150L);
        this.x0.addListener(new g7(this, arrayList, (byte) 1));
        this.x0.start();
        setVisibility(8);
        n();
        this.e.setText("");
        this.e.requestFocus();
        if (z) {
            gm.E3(this.e);
        }
        this.G.setTag(1);
        n7 n7Var4 = this.I;
        if (n7Var4 != null) {
            n7Var4.i();
        }
        return true;
    }

    public final void U(View view, r7 r7Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        boolean z;
        View childAt;
        long j;
        a aVar;
        bka bkaVar;
        m8 m8Var;
        boolean z2;
        FrameLayout frameLayout = null;
        if (view == null) {
            h27 subMenuOverlayHost = getSubMenuOverlayHost();
            if (subMenuOverlayHost != null) {
                bkaVar = getSubMenuOverlay();
            } else {
                bkaVar = null;
            }
            if (bkaVar != null && ((m8Var = this.d) == null || !m8Var.isShowing())) {
                z();
                if (t() && j()) {
                    if (bkaVar.e == this && (((z2 = bkaVar.I) || bkaVar.U) && z2)) {
                        bkaVar.a(true);
                        return;
                    }
                    this.U = false;
                    o7 o7Var = this.R;
                    if (o7Var != null) {
                        o7Var.h2();
                    }
                    bkaVar.e(subMenuOverlayHost, this, getPopupLayout());
                    return;
                }
                return;
            }
        }
        m8 m8Var2 = this.d;
        if (m8Var2 == null || !m8Var2.isShowing()) {
            z();
        }
        if (this.b != null) {
            r6 r6Var = this.c;
            if (r6Var == null || !r6Var.c || (aVar = r6Var.b) == null || aVar.y()) {
                y8c y8cVar = this.M;
                if (y8cVar != null) {
                    gm.r(y8cVar);
                    this.M = null;
                }
                m8 m8Var3 = this.d;
                if (m8Var3 != null && m8Var3.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.m0 = r7Var;
                o7 o7Var2 = this.R;
                if (o7Var2 != null) {
                    o7Var2.h2();
                }
                if (this.b.getParent() != null) {
                    ((ViewGroup) this.b.getParent()).removeView(this.b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.b;
                if (view != null) {
                    ?? f7Var = new f7(this, getContext(), view);
                    f7Var.setOrientation(1);
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    frameLayout2.setAlpha(0.0f);
                    ViewPropertyAnimator duration = frameLayout2.animate().alpha(1.0f).setDuration(100L);
                    if (this.b.w) {
                        j = 165;
                    } else {
                        j = 0;
                    }
                    duration.setStartDelay(j).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof a8) || (view instanceof LinearLayout)) {
                        km0 km0Var = this.u0;
                        if (km0Var != null) {
                            im0 c = km0Var.c(this.b, null, true);
                            c.p(this.v0);
                            wi8.r(c, gm.L(12.0f), 8.0f);
                            c.S.e = true;
                            frameLayout2.setBackground(c);
                        } else {
                            Drawable mutate = getContext().getDrawable(2131232582).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout2.setBackground(mutate);
                        }
                    }
                    frameLayout2.addView(view, qoe.c(-2.0f, -1));
                    f7Var.addView(frameLayout2, qoe.o(-1, -2));
                    f7Var.addView(this.b, qoe.t(-2, -2, 0, 0, -10, 0, 0));
                    this.b.setTopView(frameLayout2);
                    frameLayout = frameLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = f7Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.u0 != null) {
                    bu5.V(this.b, cmb.p1(0.06f, cmb.v0(cmb.D8, this.n0)));
                }
                m8 m8Var4 = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = m8Var4;
                if (this.W) {
                    m8Var4.setAnimationStyle(0);
                } else {
                    m8Var4.setAnimationStyle(2131755191);
                }
                boolean z3 = this.W;
                if (!z3) {
                    this.d.b = z3;
                }
                this.d.setOutsideTouchable(true);
                this.d.setClippingEnabled(true);
                if (this.V) {
                    this.d.g();
                }
                this.d.setInputMethodMode(2);
                this.d.setSoftInputMode(0);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFocusableInTouchMode(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new w6(this, (byte) 0));
                this.d.setOnDismissListener(new x6(this, (byte) 0));
                Point point = gm.q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(wi8.f(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.b.getSwipeBack() != null && (childAt = this.b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = gm.L(16.0f) + childAt.getMeasuredWidth();
                }
                this.U = false;
                this.d.setFocusable(true);
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                W(true, z);
                this.b.f();
                if (this.b.getSwipeBack() != null) {
                    this.b.getSwipeBack().b(false);
                }
                this.d.h();
                float f = this.k0;
                if (f > 0.0f) {
                    this.d.c(f);
                }
            }
        }
    }

    public final void V() {
        if (this.f != null) {
            for (int i = 0; i < this.f.getChildCount(); i++) {
                if (this.f.getChildAt(i) instanceof q7) {
                    ((q7) this.f.getChildAt(i)).updateColors();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        ylb ylbVar = this.n0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i2 = 0; i2 < this.b.getItemsCount(); i2++) {
                if (this.b.M.getChildAt(i2) instanceof a8) {
                    ((a8) this.b.M.getChildAt(i2)).setSelectorColor(cmb.v0(cmb.H5, ylbVar));
                }
            }
        }
        l7 l7Var = this.e;
        if (l7Var != null) {
            int i3 = cmb.B8;
            anb.l(l7Var, 30, i3, ylbVar);
            anb.D(this.e, cmb.C8, ylbVar);
            anb.X(this.e, i3, ylbVar);
            anb.C(this.e, cmb.kg, ylbVar);
            anb.y(this.e, cmb.lg, ylbVar);
        }
    }

    public final void W(boolean z, boolean z2) {
        float f;
        int i;
        int i2;
        ScrollView scrollView;
        r6 r6Var = this.c;
        if (r6Var != null) {
            i2 = r6Var.getTop() + (-r6Var.b.getMeasuredHeight());
            i = r6Var.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            float measuredHeight = getMeasuredHeight() * scaleY;
            if (this.N != 2) {
                f = getTranslationY();
            } else {
                f = 0.0f;
            }
            i = -((int) (measuredHeight - (f / scaleY)));
            i2 = this.b0;
        }
        int i3 = i + i2 + this.O;
        if (z && (scrollView = this.b.L) != null) {
            scrollView.scrollTo(0, 0);
        }
        r7 r7Var = this.m0;
        if (r7Var == null) {
            r7Var = this;
        }
        if (r6Var != null) {
            a aVar = r6Var.b;
            if (this.N == 0) {
                if (z) {
                    this.d.showAsDropDown(aVar, ((r7Var.getMeasuredWidth() + (r6Var.getLeft() + r7Var.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i3);
                }
                if (z2) {
                    this.d.update(aVar, ((r7Var.getMeasuredWidth() + (r6Var.getLeft() + r7Var.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i3, -1, -1);
                    return;
                }
                return;
            }
            if (z) {
                boolean z3 = this.f0;
                m8 m8Var = this.d;
                if (z3) {
                    m8Var.showAtLocation(aVar, 51, (getLeft() - gm.L(8.0f)) + ((int) getTranslationX()) + this.P, i3);
                } else {
                    m8Var.showAsDropDown(aVar, (getLeft() - gm.L(8.0f)) + ((int) getTranslationX()) + this.P, i3);
                }
            }
            if (z2) {
                this.d.update(aVar, (getLeft() - gm.L(8.0f)) + ((int) getTranslationX()) + this.P, i3, -1, -1);
                return;
            }
            return;
        }
        int i4 = this.N;
        if (i4 == 0) {
            if (getParent() != null) {
                View view = (View) getParent();
                if (z) {
                    this.d.showAsDropDown(view, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.c0 + this.P, i3);
                }
                if (z2) {
                    this.d.update(view, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.c0 + this.P, i3, -1, -1);
                }
            }
        } else if (i4 == 1) {
            if (z) {
                this.d.showAsDropDown(this, (-gm.L(8.0f)) + this.c0 + this.P, i3);
            }
            if (z2) {
                this.d.update(this, (-gm.L(8.0f)) + this.c0 + this.P, i3, -1, -1);
            }
        } else {
            if (z) {
                this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.c0 + this.P, i3);
            }
            if (z2) {
                this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.c0 + this.P, i3, -1, -1);
            }
        }
    }

    public final j8 a(int i) {
        q();
        Context context = getContext();
        j8 j8Var = new j8(cmb.G8, this.n0, context);
        if (i != -1) {
            j8Var.setTag(Integer.valueOf(i));
        }
        j8Var.setTag(2131296439, 1);
        this.b.a(j8Var, qoe.o(-1, 8));
        return j8Var;
    }

    public final TextView b(int i) {
        q();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i);
        textView.setMinimumWidth(gm.L(196.0f));
        this.b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int L = gm.L(3.0f);
        layoutParams.bottomMargin = L;
        layoutParams.topMargin = L;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final a8 d(int i, int i2, Drawable drawable, String str, boolean z, boolean z2, ylb ylbVar) {
        q();
        a8 a8Var = new a8(z2 ? 1 : 0, ylbVar, getContext(), false, false);
        a8Var.j(str, i2, drawable);
        a8Var.setMinimumWidth(gm.L(196.0f));
        a8Var.setTag(Integer.valueOf(i));
        this.b.addView(a8Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a8Var.getLayoutParams();
        if (jb6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = gm.L(48.0f);
        a8Var.setLayoutParams(layoutParams);
        a8Var.setOnClickListener(new v6((byte) 0, this, z));
        return a8Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.q0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final a8 e(int i, int i2, String str) {
        return d(i, i2, null, str, true, false, this.n0);
    }

    public final a8 f(Drawable drawable, String str, int i, boolean z, int i2) {
        return d(i, i2, drawable, str, z, false, this.n0);
    }

    public final void g(int i, String str) {
        q();
        TextView textView = new TextView(getContext());
        anb.X(textView, cmb.D8, this.n0);
        textView.setBackgroundDrawable(cmb.L0(false));
        if (!jb6.a0) {
            textView.setGravity(16);
        } else {
            textView.setGravity(21);
        }
        textView.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        textView.setTextSize(1, 16.0f);
        textView.setMinWidth(gm.L(196.0f));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTag(Integer.valueOf(i));
        textView.setText(str);
        this.b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (jb6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = gm.L(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new s6(this, (byte) 3));
    }

    public View getContentView() {
        s09 s09Var = this.y;
        if (s09Var != null) {
            return s09Var;
        }
        return this.F;
    }

    public s09 getIconView() {
        return this.y;
    }

    public View.OnClickListener getOnClickListener() {
        return this.p0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.b == null) {
            q();
        }
        return this.b;
    }

    public ImageView getSearchClearButton() {
        return this.s;
    }

    public FrameLayout getSearchContainer() {
        return this.G;
    }

    public EditTextBoldCursor getSearchField() {
        l();
        return this.e;
    }

    public bka getSubMenuOverlay() {
        iac iacVar = this.w0;
        if (iacVar != null) {
            return (bka) iacVar.run();
        }
        return null;
    }

    public h27 getSubMenuOverlayHost() {
        r6 r6Var;
        if (this.w0 != null && (r6Var = this.c) != null) {
            return r6Var.b;
        }
        return null;
    }

    public TextView getTextView() {
        return this.F;
    }

    public int getVisibleSubItemsCount() {
        int i = 0;
        for (int i2 = 0; i2 < this.b.getItemsCount(); i2++) {
            View childAt = this.b.M.getChildAt(i2);
            if (childAt != null && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public final void h(k5 k5Var, int i) {
        q();
        k5Var.setLayoutParams(new LinearLayout.LayoutParams(-2, i));
        this.b.addView(k5Var);
        k5Var.setTag(8);
        k5Var.setOnClickListener(new s6(this, (byte) 1));
        k5Var.setBackgroundDrawable(cmb.L0(false));
    }

    public final a8 i(int i, sqb sqbVar, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        q();
        a8 a8Var = new a8(0, this.n0, getContext(), false, false);
        a8Var.j(str, i, sqbVar);
        a8Var.setMinimumWidth(gm.L(196.0f));
        a8Var.setRightIcon(2131232065);
        this.b.addView(a8Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a8Var.getLayoutParams();
        if (jb6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = gm.L(48.0f);
        a8Var.setLayoutParams(layoutParams);
        a8Var.Q = new y6(this, this.b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), (byte) 0);
        a8Var.setOnClickListener(new z6(a8Var, (byte) 0));
        this.b.c = true;
        return a8Var;
    }

    public boolean j() {
        a aVar;
        r6 r6Var = this.c;
        if (r6Var != null && r6Var.c && (aVar = r6Var.b) != null && !aVar.y()) {
            return false;
        }
        return true;
    }

    public final void k() {
        n7 n7Var;
        TextView textView;
        n7 n7Var2;
        if (this.s != null) {
            boolean s = s();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!s && TextUtils.isEmpty(this.e.getText()) && (((n7Var = this.I) == null || !n7Var.d()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((n7Var2 = this.I) != null && !n7Var2.m())))) {
                if (this.s.getTag() != null) {
                    this.s.setTag(null);
                    AnimatorSet animatorSet = this.w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (this.e0) {
                        AnimatorSet duration = new AnimatorSet().setDuration(180L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final r7 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                r7 r7Var = this.b;
                                switch (b) {
                                    case 0:
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view = r7Var.x;
                                        if (view != null) {
                                            view.setTranslationX(gm.L(32.0f) * floatValue);
                                            return;
                                        }
                                        return;
                                    default:
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view2 = r7Var.x;
                                        if (view2 != null) {
                                            view2.setTranslationX(gm.L(32.0f) * floatValue2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        duration.playTogether(ObjectAnimator.ofFloat(this.s, property4, 0.0f), ObjectAnimator.ofFloat(this.s, property3, 0.0f), ObjectAnimator.ofFloat(this.s, property2, 0.0f), ObjectAnimator.ofFloat(this.s, property, 45.0f), ofFloat);
                        duration.addListener(new e7(this, (byte) 0));
                        duration.start();
                        this.w = duration;
                        return;
                    }
                    this.s.setAlpha(0.0f);
                    this.s.setRotation(45.0f);
                    this.s.setScaleX(0.0f);
                    this.s.setScaleY(0.0f);
                    this.s.setVisibility(4);
                    this.e0 = true;
                }
            } else if (this.s.getTag() == null) {
                this.s.setTag(1);
                AnimatorSet animatorSet2 = this.w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.s.setVisibility(0);
                if (this.e0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final r7 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            r7 r7Var = this.b;
                            switch (b) {
                                case 0:
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = r7Var.x;
                                    if (view != null) {
                                        view.setTranslationX(gm.L(32.0f) * floatValue);
                                        return;
                                    }
                                    return;
                                default:
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = r7Var.x;
                                    if (view2 != null) {
                                        view2.setTranslationX(gm.L(32.0f) * floatValue2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.s, property4, 1.0f), ObjectAnimator.ofFloat(this.s, property3, 1.0f), ObjectAnimator.ofFloat(this.s, property2, 1.0f), ObjectAnimator.ofFloat(this.s, property, 0.0f), ofFloat2);
                    duration2.addListener(new e7(this, (byte) 1));
                    duration2.start();
                    this.w = duration2;
                    return;
                }
                this.s.setAlpha(1.0f);
                this.s.setRotation(0.0f);
                this.s.setScaleX(1.0f);
                this.s.setScaleY(1.0f);
                View view = this.x;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.e0 = true;
            }
        }
    }

    public final void l() {
        boolean z;
        int i;
        if (this.G == null && this.H) {
            k7 k7Var = new k7((byte) 0, getContext(), this);
            this.G = k7Var;
            if (this.o0 != 0) {
                z = true;
            } else {
                z = false;
            }
            k7Var.setClipChildren(z);
            this.a = null;
            k7 k7Var2 = this.G;
            LinearLayout.LayoutParams m = qoe.m(1.0f, 0, -1, this.o0 + 6, 0, 0);
            r6 r6Var = this.c;
            r6Var.addView(k7Var2, 0, m);
            this.G.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i2 = cmb.B8;
            ylb ylbVar = this.n0;
            anb.X(textView2, i2, ylbVar);
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            TextView textView3 = this.h;
            if (jb6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            textView3.setGravity(i);
            l7 l7Var = new l7((byte) 0, getContext(), this);
            this.e = l7Var;
            l7Var.setScrollContainer(false);
            this.e.setCursorWidth(1.5f);
            anb.v(this.e, i2, ylbVar);
            this.e.setTextSize(1, 18.0f);
            anb.D(this.e, cmb.C8, ylbVar);
            anb.X(this.e, i2, ylbVar);
            this.e.setSingleLine(true);
            this.e.setBackgroundResource(0);
            this.e.setPadding(0, 0, 0, 0);
            this.e.setInputType(this.e.getInputType() | 524288);
            this.e.setOnEditorActionListener(new j(this, (byte) 1));
            this.e.addTextChangedListener(new b7(this, (byte) 0));
            this.e.setImeOptions(234881027);
            this.e.setTextIsSelectable(false);
            anb.C(this.e, cmb.kg, ylbVar);
            anb.y(this.e, cmb.lg, ylbVar);
            CharSequence charSequence = this.n;
            if (charSequence != null) {
                this.e.setHint(charSequence);
                setContentDescription(this.n);
            }
            CharSequence charSequence2 = this.r;
            if (charSequence2 != null) {
                this.e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            this.f.setVisibility(0);
            boolean z2 = jb6.a0;
            k7 k7Var3 = this.G;
            if (!z2) {
                k7Var3.addView(this.h, qoe.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.G.addView(this.e, qoe.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.f, qoe.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            } else {
                k7Var3.addView(this.f, qoe.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.e, qoe.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.h, qoe.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            }
            this.f.setClipChildren(false);
            c7 c7Var = new c7((byte) 0, getContext(), this);
            this.s = c7Var;
            d7 d7Var = new d7(this, (byte) 0);
            this.a0 = d7Var;
            c7Var.setImageDrawable(d7Var);
            this.s.setBackground(cmb.f0(r6Var.b.r0, 1, -1));
            this.s.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setAlpha(0.0f);
            this.s.setRotation(45.0f);
            this.s.setScaleX(0.0f);
            this.s.setScaleY(0.0f);
            this.s.setOnClickListener(new s6(this, (byte) 0));
            this.s.setContentDescription(jb6.M0(2131752036, null));
            this.G.addView(this.s, qoe.e(48, -1, 21));
        }
    }

    public final void m() {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < this.b.getItemsCount()) {
                if (this.b.M.getChildAt(i2).getVisibility() == 0) {
                    break;
                }
                i2++;
            } else {
                i = 8;
                break;
            }
        }
        if (i != getVisibility()) {
            setVisibility(i);
        }
    }

    public final void n() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h0;
            if (i < arrayList.size()) {
                if (((sh4) arrayList.get(i)).h) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            } else {
                E();
                return;
            }
        }
    }

    public void o() {
        this.r = null;
        l7 l7Var = this.e;
        if (l7Var == null) {
            return;
        }
        l7Var.setText("");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.y != null) {
            accessibilityNodeInfo.setClassName("android.widget.ImageButton");
            return;
        }
        TextView textView = this.F;
        if (textView != null) {
            accessibilityNodeInfo.setClassName("android.widget.Button");
            if (TextUtils.isEmpty(accessibilityNodeInfo.getText())) {
                accessibilityNodeInfo.setText(textView.getText());
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m8 m8Var = this.d;
        if (m8Var != null && m8Var.isShowing()) {
            W(false, true);
        }
        n7 n7Var = this.I;
        if (n7Var != null) {
            n7Var.g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        y8c y8cVar;
        y8c y8cVar2;
        long j;
        bka shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null && shownSubMenuOverlay.I) {
            z = true;
        } else {
            z = false;
        }
        if (getSubMenuOverlayHost() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        m8 m8Var = this.d;
        if (m8Var != null && m8Var.isShowing()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.r0 = false;
            if ((this.d0 || z2) && t() && !z3 && !z) {
                y8c y8cVar3 = this.M;
                if (y8cVar3 != null) {
                    gm.r(y8cVar3);
                    this.M = null;
                }
                y8c y8cVar4 = new y8c((byte) 2, this, z2);
                this.M = y8cVar4;
                if (z2) {
                    j = ViewConfiguration.getLongPressTimeout();
                } else {
                    j = 200;
                }
                gm.d3(y8cVar4, j);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.M != null) {
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                float f = -scaledTouchSlop;
                if ((motionEvent.getX() < f || motionEvent.getY() < f || motionEvent.getX() >= getWidth() + scaledTouchSlop || motionEvent.getY() >= getHeight() + scaledTouchSlop) && (y8cVar2 = this.M) != null) {
                    gm.r(y8cVar2);
                    this.M = null;
                }
            }
            if (this.g0 && !z2 && t() && !z3) {
                if (motionEvent.getY() > getHeight()) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    U(null, null);
                    this.r0 = true;
                    return true;
                }
            } else if ((this.g0 || this.r0) && (z3 || z)) {
                getLocationOnScreen(this.K);
                float x = motionEvent.getX() + this.K[0];
                float y = motionEvent.getY() + this.K[1];
                this.L = null;
                for (int i = 0; i < this.b.getItemsCount(); i++) {
                    View childAt = this.b.M.getChildAt(i);
                    Object tag = childAt.getTag();
                    if (tag instanceof Integer) {
                        if (((Integer) tag).intValue() >= 100) {
                        }
                        ((View) childAt.getParent()).getLocationOnScreen(this.K);
                        int[] iArr = this.K;
                        float f2 = x - iArr[0];
                        float f3 = y - iArr[1];
                        childAt.getHitRect(this.J);
                        if (childAt.getVisibility() != 0 && this.J.contains((int) f2, (int) f3)) {
                            childAt.setPressed(true);
                            childAt.setSelected(true);
                            childAt.drawableHotspotChanged(f2 - childAt.getLeft(), f3 - childAt.getTop());
                            this.L = childAt;
                        } else {
                            childAt.setPressed(false);
                            childAt.setSelected(false);
                        }
                    } else {
                        if (!childAt.hasOnClickListeners()) {
                        }
                        ((View) childAt.getParent()).getLocationOnScreen(this.K);
                        int[] iArr2 = this.K;
                        float f22 = x - iArr2[0];
                        float f32 = y - iArr2[1];
                        childAt.getHitRect(this.J);
                        if (childAt.getVisibility() != 0) {
                        }
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                    }
                }
            }
        } else if (motionEvent.getActionMasked() == 1 && (z3 || z)) {
            y8c y8cVar5 = this.M;
            if (y8cVar5 != null) {
                gm.r(y8cVar5);
                this.M = null;
            }
            View view = this.L;
            if (view != null) {
                view.setSelected(false);
                this.L.setPressed(false);
                View view2 = this.L;
                Object tag2 = view2.getTag();
                this.L = null;
                if (!(tag2 instanceof Integer)) {
                    view2.performClick();
                } else {
                    r6 r6Var = this.c;
                    if (r6Var != null) {
                        r6Var.o(((Integer) tag2).intValue());
                    } else {
                        m7 m7Var = this.Q;
                        if (m7Var != null) {
                            m7Var.h(((Integer) tag2).intValue());
                        }
                    }
                    if (z) {
                        shownSubMenuOverlay.a(true);
                    } else {
                        m8 m8Var2 = this.d;
                        if (m8Var2 != null) {
                            m8Var2.d(this.S);
                        }
                    }
                }
            } else if (this.g0 && !z) {
                this.d.d(true);
            }
            if (this.r0) {
                this.r0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        } else {
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (y8cVar = this.M) != null) {
                gm.r(y8cVar);
                this.M = null;
            }
            View view3 = this.L;
            if (view3 != null) {
                view3.setSelected(false);
                this.L.setPressed(false);
                this.L = null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        bka shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        m8 m8Var = this.d;
        if (m8Var != null && m8Var.isShowing()) {
            this.d.dismiss();
        }
    }

    public final void q() {
        if (this.b != null) {
            return;
        }
        this.J = new Rect();
        this.K = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232584, 1, this.n0, getContext());
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        km0 km0Var = this.u0;
        if (km0Var != null) {
            im0 c = km0Var.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c.p(this.v0);
            c.r(gm.L(12.0f));
            c.q(gm.L(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c);
        }
        this.b.setOnTouchListener(new a7(this, (byte) 0));
        this.b.setDispatchKeyEventListener(new l0(this, (byte) 2));
    }

    public final void r() {
        bka shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        m8 m8Var = this.d;
        if (m8Var != null) {
            m8Var.d(this.S);
        }
    }

    public final boolean s() {
        ArrayList arrayList = this.h0;
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (((sh4) arrayList.get(i)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setAdditionalXOffset(int i) {
        this.c0 = i;
    }

    public void setAdditionalYOffset(int i) {
        this.b0 = i;
    }

    public void setDelegate(m7 m7Var) {
        this.Q = m7Var;
    }

    public void setDimMenu(float f) {
        this.k0 = f;
    }

    public void setFitSubItems(boolean z) {
        this.b.setFitItems(z);
    }

    public void setFixBackground(boolean z) {
        this.q0 = z;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z) {
        this.f0 = z;
    }

    public void setIcon(Drawable drawable) {
        s09 s09Var = this.y;
        if (s09Var == null) {
            return;
        }
        if (drawable instanceof p09) {
            s09Var.setAnimation((p09) drawable);
        } else {
            s09Var.setImageDrawable(drawable);
        }
        this.E = 0;
    }

    public void setIconColor(int i) {
        if (this.s0 == null || this.t0 != i) {
            this.s0 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.t0 = i;
        }
        s09 s09Var = this.y;
        if (s09Var != null) {
            ColorFilter colorFilter = s09Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.s0;
            if (colorFilter != porterDuffColorFilter) {
                s09Var.setColorFilter(porterDuffColorFilter);
            }
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setTextColor(i);
        }
        c7 c7Var = this.s;
        if (c7Var != null) {
            ColorFilter colorFilter2 = c7Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.s0;
            if (colorFilter2 != porterDuffColorFilter2) {
                this.s.setColorFilter(porterDuffColorFilter2);
            }
        }
    }

    public void setLayoutInScreen(boolean z) {
        this.V = z;
    }

    public void setLongClickEnabled(boolean z) {
        this.d0 = z;
    }

    public void setMenuXOffset(int i) {
        this.P = i;
    }

    public void setMenuYOffset(int i) {
        this.O = i;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.p0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final qac qacVar) {
        m8 m8Var = this.d;
        if (m8Var != null) {
            m8Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    qac qacVar2 = qacVar;
                    if (qacVar2 != null) {
                        qacVar2.a(Boolean.valueOf(r7.this.U));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z) {
        m8 m8Var = this.d;
        if (m8Var != null) {
            m8Var.b = z;
        }
        this.W = z;
    }

    public void setPopupItemsSelectorColor(int i) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            qmb qmbVar = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
            int childCount = qmbVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = qmbVar.getChildAt(i2);
                if (childAt instanceof a8) {
                    ((a8) childAt).setSelectorColor(i);
                }
            }
        }
    }

    public void setSearchAdditionalButton(View view) {
        this.x = view;
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        if (this.h == null) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.h;
        if (isEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        this.h.setText(charSequence);
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.n = charSequence;
        if (this.h == null) {
            return;
        }
        this.e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i) {
        boolean z;
        this.o0 = i;
        k7 k7Var = this.G;
        if (k7Var != null) {
            ((ViewGroup.MarginLayoutParams) k7Var.getLayoutParams()).leftMargin = gm.L(i);
            k7 k7Var2 = this.G;
            if (this.o0 != 0) {
                z = true;
            } else {
                z = false;
            }
            k7Var2.setClipChildren(z);
            k7 k7Var3 = this.G;
            k7Var3.setLayoutParams(k7Var3.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z) {
        d7 d7Var = this.a0;
        if (d7Var == null) {
            return;
        }
        if (z) {
            d7Var.e = true;
            d7Var.b = System.currentTimeMillis();
            d7Var.invalidateSelf();
            return;
        }
        d7Var.e = false;
    }

    public void setShowSubmenuByMove(boolean z) {
        this.g0 = z;
    }

    public void setShowedFromBottom(boolean z) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z);
    }

    public void setSubMenuDelegate(o7 o7Var) {
        this.R = o7Var;
    }

    public void setSubMenuOpenSide(int i) {
        this.N = i;
    }

    public void setSubMenuOverlayProvider(iac iacVar) {
        this.w0 = iacVar;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.F;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f) {
        this.l0 = f;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f) {
        super.setTranslationX(f + this.l0);
    }

    public void setupPopupRadialSelectors(int i) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i);
        }
    }

    public final boolean t() {
        if (this.b == null) {
            ArrayList arrayList = this.y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void u(int i) {
        p7 p7Var;
        View findViewWithTag;
        HashMap hashMap = this.z0;
        if (hashMap == null) {
            p7Var = null;
        } else {
            p7Var = (p7) hashMap.get(Integer.valueOf(i));
        }
        if (p7Var != null) {
            p7Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i))) != null && findViewWithTag.getVisibility() != 8) {
            findViewWithTag.setVisibility(8);
        }
    }

    public boolean v() {
        return this.H;
    }

    public boolean w() {
        k7 k7Var = this.G;
        if (k7Var != null && k7Var.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean x() {
        k7 k7Var = this.G;
        if (k7Var != null && k7Var.getTag() != null) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        bka shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            return shownSubMenuOverlay.I;
        }
        m8 m8Var = this.d;
        if (m8Var != null && m8Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void z() {
        if (this.y0 == null) {
            return;
        }
        int i = 0;
        while (true) {
            int size = this.y0.size();
            ArrayList arrayList = this.y0;
            if (i < size) {
                p7 p7Var = (p7) arrayList.get(i);
                p7Var.getClass();
                q();
                View view = p7Var.j;
                if (view != null) {
                    this.b.addView(view);
                } else {
                    byte b = p7Var.a;
                    if (b == 0) {
                        a8 a8Var = new a8(0, this.n0, getContext(), false, false);
                        a8Var.j(p7Var.e, p7Var.c, p7Var.d);
                        a8Var.setMinimumWidth(gm.L(196.0f));
                        a8Var.setTag(Integer.valueOf(p7Var.b));
                        this.b.addView(a8Var);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a8Var.getLayoutParams();
                        if (jb6.a0) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = gm.L(48.0f);
                        a8Var.setLayoutParams(layoutParams);
                        a8Var.setOnClickListener(new t(p7Var, this, (byte) 5));
                        Integer num = p7Var.n;
                        if (num != null && p7Var.o != null) {
                            a8Var.d(num.intValue(), p7Var.o.intValue());
                        }
                        p7Var.j = a8Var;
                    } else if (b == 1) {
                        j8 j8Var = new j8(cmb.G8, this.n0, getContext());
                        j8Var.setTag(2131296439, 1);
                        this.b.a(j8Var, qoe.o(-1, 8));
                        p7Var.j = j8Var;
                    } else if (b == 2) {
                        a8 a8Var2 = new a8(0, this.n0, getContext(), false, false);
                        a8Var2.j(p7Var.e, p7Var.c, p7Var.d);
                        a8Var2.setMinimumWidth(gm.L(196.0f));
                        a8Var2.setRightIcon(2131232065);
                        a8Var2.getRightIcon().setVisibility(p7Var.m);
                        this.b.addView(a8Var2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a8Var2.getLayoutParams();
                        if (jb6.a0) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = gm.L(48.0f);
                        a8Var2.setLayoutParams(layoutParams2);
                        sp1 sp1Var = p7Var.h;
                        if (sp1Var != null) {
                            p7Var.g = (View) sp1Var.run();
                            p7Var.h = null;
                        }
                        a8Var2.Q = new y6(this, this.b.b(p7Var.g), (byte) 1);
                        a8Var2.setOnClickListener(new z6(a8Var2, (byte) 1));
                        this.b.c = true;
                        Integer num2 = p7Var.n;
                        if (num2 != null && p7Var.o != null) {
                            a8Var2.d(num2.intValue(), p7Var.o.intValue());
                        }
                        p7Var.j = a8Var2;
                    } else if (b == 3) {
                        l66 l66Var = new l66(getContext(), null);
                        l66Var.setTag(2131296439, 1);
                        l66Var.setPadding(gm.L(13.0f), 0, gm.L(13.0f), gm.L(8.0f));
                        l66Var.setTextSize(1, p7Var.i);
                        anb.X(l66Var, cmb.D8, null);
                        l66Var.setMovementMethod(LinkMovementMethod.getInstance());
                        anb.G(l66Var, cmb.I6, null);
                        l66Var.setText(p7Var.e);
                        l66Var.setMaxWidth(gm.L(200.0f));
                        this.b.a(l66Var, qoe.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        p7Var.j = l66Var;
                    }
                }
                View view2 = p7Var.j;
                if (view2 != null) {
                    view2.setVisibility(p7Var.l);
                    qp1 qp1Var = p7Var.k;
                    if (qp1Var != null) {
                        p7Var.j.setOnClickListener(qp1Var);
                    }
                }
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public void setIcon(int i) {
        s09 s09Var = this.y;
        if (s09Var == null) {
            return;
        }
        this.E = i;
        s09Var.setImageResource(i);
    }

    public r7(Context context, r6 r6Var, int i) {
        this(context, r6Var, 0, i, false, null);
    }

    public r7(Context context, int i, int i2) {
        this(context, null, i, i2, true, null);
    }
}
