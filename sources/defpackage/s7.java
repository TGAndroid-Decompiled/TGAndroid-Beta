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
public class s7 extends FrameLayout {
    public int E;
    public final TextView F;
    public l7 G;
    public boolean H;
    public o7 I;
    public Rect J;
    public int[] K;
    public View L;
    public xac M;
    public int N;
    public int O;
    public int P;
    public n7 Q;
    public p7 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public FrameLayout a;
    public e7 a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public int b0;
    public final s6 c;
    public int c0;
    public n8 d;
    public boolean d0;
    public m7 e;
    public boolean e0;
    public LinearLayout f;
    public boolean f0;
    public boolean g0;
    public TextView h;
    public final ArrayList h0;
    public int i0;
    public final pn j0;
    public float k0;
    public float l0;
    public s7 m0;
    public CharSequence n;
    public final vnb n0;
    public int o0;
    public View.OnClickListener p0;
    public boolean q0;
    public CharSequence r;
    public boolean r0;
    public d7 s;
    public PorterDuffColorFilter s0;
    public int t0;
    public ll0 u0;
    public ol0 v0;
    public AnimatorSet w;
    public hcc w0;
    public View x;
    public AnimatorSet x0;
    public final e29 y;
    public ArrayList y0;
    public HashMap z0;

    public s7(Context context, s6 s6Var, int i, int i2, boolean z, vnb vnbVar) {
        super(context);
        int i3;
        this.S = true;
        this.W = true;
        this.e0 = true;
        this.g0 = true;
        this.h0 = new ArrayList();
        this.i0 = -1;
        this.j0 = new pn(null);
        this.n0 = vnbVar;
        if (i != 0) {
            if (z) {
                i3 = 5;
            } else {
                i3 = 1;
            }
            setBackgroundDrawable(aob.f0(i, i3, -1));
        }
        this.c = s6Var;
        if (z) {
            TextView textView = new TextView(context);
            this.F = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(hl.o());
            textView.setGravity(17);
            textView.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i2 != 0) {
                textView.setTextColor(i2);
            }
            addView(textView, tre.c(-1.0f, -2));
            return;
        }
        ?? imageView = new ImageView(context);
        this.y = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, tre.c(-1.0f, -1));
        if (i2 != 0) {
            imageView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
    }

    public static b8 c(boolean z, boolean z2, ViewGroup viewGroup, int i, CharSequence charSequence, boolean z3, vnb vnbVar) {
        b8 b8Var = new b8(z3 ? 1 : 0, vnbVar, viewGroup.getContext(), z, z2);
        b8Var.j(charSequence, i, null);
        b8Var.setMinimumWidth(hl.L(196.0f));
        viewGroup.addView(b8Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b8Var.getLayoutParams();
        if (ob6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = hl.L(48.0f);
        b8Var.setLayoutParams(layoutParams);
        return b8Var;
    }

    private ula getShownSubMenuOverlay() {
        ula ulaVar;
        o27 subMenuOverlayHost = getSubMenuOverlayHost();
        if (subMenuOverlayHost != null) {
            ulaVar = subMenuOverlayHost.getOpenMenuOverlay();
        } else {
            ulaVar = null;
        }
        if (ulaVar == null || ulaVar.e != this || (!ulaVar.I && !ulaVar.U)) {
            return null;
        }
        return ulaVar;
    }

    public final q7 A(int i, int i2, String str) {
        q7 q7Var = new q7(0);
        q7Var.b = i;
        q7Var.c = i2;
        q7Var.d = null;
        q7Var.e = str;
        q7Var.f = true;
        H(q7Var);
        return q7Var;
    }

    public final void B(b29 b29Var, String str) {
        q7 q7Var = new q7(0);
        q7Var.b = (byte) 29;
        q7Var.c = 0;
        q7Var.d = b29Var;
        q7Var.e = str;
        q7Var.f = true;
        H(q7Var);
    }

    public final q7 C(vo1 vo1Var) {
        q7 q7Var = new q7(2);
        q7Var.c = 2131232261;
        q7Var.d = null;
        q7Var.e = null;
        q7Var.g = null;
        q7Var.h = vo1Var;
        H(q7Var);
        return q7Var;
    }

    public final q7 D() {
        q7 q7Var = new q7(3);
        q7Var.e = "";
        q7Var.i = (byte) 13;
        H(q7Var);
        return q7Var;
    }

    public final void E() {
        Integer num;
        boolean z;
        ArrayList arrayList = this.h0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        l7 l7Var = this.G;
        if (l7Var != null && l7Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new i7((byte) 0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) k43.g);
            transitionSet.addListener((Transition.TransitionListener) new j7(this, (byte) 0));
            TransitionManager.beginDelayedTransition(this.f, transitionSet);
        }
        if (this.f != null) {
            int i = 0;
            while (i < this.f.getChildCount()) {
                if (!arrayList2.remove(((r7) this.f.getChildAt(i)).getFilter())) {
                    this.f.removeViewAt(i);
                    i--;
                }
                i++;
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ph4 ph4Var = (ph4) arrayList2.get(i2);
            ph4Var.getClass();
            r7 r7Var = new r7(getContext(), this.n0);
            r7Var.setData(ph4Var);
            r7Var.setOnClickListener(new t(this, r7Var, (byte) 4));
            this.f.addView(r7Var, tre.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f != null) {
            for (int i3 = 0; i3 < this.f.getChildCount(); i3++) {
                r7 r7Var2 = (r7) this.f.getChildAt(i3);
                if (i3 == this.i0) {
                    z = true;
                } else {
                    z = false;
                }
                r7Var2.setExpanded(z);
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
            this.e.getViewTreeObserver().addOnPreDrawListener(new k7(this, x));
        }
        k();
    }

    public void F() {
        o7 o7Var = this.I;
        if (o7Var != null) {
            o7Var.k(this.e);
        }
    }

    public void G(boolean z) {
        s6 s6Var;
        l();
        l7 l7Var = this.G;
        if (l7Var != null && l7Var.getVisibility() != 0 && (s6Var = this.c) != null) {
            s6Var.b.C(T(z));
        }
    }

    public final q7 H(q7 q7Var) {
        ArrayList arrayList = this.y0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.y0 = arrayList;
        }
        arrayList.add(q7Var);
        HashMap hashMap = this.z0;
        if (hashMap == null) {
            hashMap = new HashMap();
            this.z0 = hashMap;
        }
        hashMap.put(Integer.valueOf(q7Var.b), q7Var);
        return q7Var;
    }

    public final void I(int i) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() != i) {
            this.b.setBackgroundColor(i);
            n8 n8Var = this.d;
            if (n8Var != null && n8Var.isShowing()) {
                this.b.invalidate();
            }
        }
    }

    public final void J(ph4 ph4Var) {
        if (!ph4Var.h) {
            return;
        }
        ArrayList arrayList = this.h0;
        arrayList.remove(ph4Var);
        int i = this.i0;
        if (i < 0 || i > arrayList.size() - 1) {
            this.i0 = arrayList.size() - 1;
        }
        E();
        this.e.m();
    }

    public s7 K(o7 o7Var) {
        this.I = o7Var;
        return this;
    }

    public final void L(ll0 ll0Var, ol0 ol0Var) {
        this.u0 = ll0Var;
        this.v0 = ol0Var;
        View view = this.b;
        if (view != null && ll0Var != null) {
            jl0 c = ll0Var.c(view, null, true);
            c.p(ol0Var);
            c.r(hl.L(12.0f));
            c.q(hl.L(8.0f));
            view.setBackground(c);
        }
    }

    public s7 M() {
        return N();
    }

    public s7 N() {
        if (this.c == null) {
            return this;
        }
        this.H = true;
        return this;
    }

    public final void O(int i, boolean z) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            oob oobVar = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
            int childCount = oobVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = oobVar.getChildAt(i2);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(i);
                } else if (childAt instanceof b8) {
                    if (z) {
                        ((b8) childAt).setIconColor(i);
                    } else {
                        ((b8) childAt).setTextColor(i);
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
        q7 q7Var;
        View findViewWithTag;
        HashMap hashMap = this.z0;
        if (hashMap == null) {
            q7Var = null;
        } else {
            q7Var = (q7) hashMap.get(Integer.valueOf(i));
        }
        if (q7Var != null) {
            q7Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i))) != null && findViewWithTag.getVisibility() != 0) {
            findViewWithTag.setAlpha(0.0f);
            ik8.t(findViewWithTag.animate().alpha(1.0f), k43.f, 150L);
            findViewWithTag.setVisibility(0);
        }
    }

    public boolean T(boolean z) {
        s6 s6Var;
        AnimatorSet animatorSet;
        e29 iconView;
        Animator e;
        l();
        o7 o7Var = this.I;
        if (this.G == null || (o7Var != null && !o7Var.c())) {
            return false;
        }
        o7 o7Var2 = this.I;
        if (o7Var2 != null && (e = o7Var2.e()) != null) {
            e.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            s6Var = this.c;
            if (i >= s6Var.getChildCount()) {
                break;
            }
            View childAt = s6Var.getChildAt(i);
            if ((childAt instanceof s7) && (iconView = ((s7) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i++;
        }
        Object tag = this.G.getTag();
        l7 l7Var = this.G;
        Property property = View.ALPHA;
        if (tag != null) {
            l7Var.setTag(null);
            AnimatorSet animatorSet2 = this.x0;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
                this.x0.cancel();
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.x0 = animatorSet3;
            l7 l7Var2 = this.G;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(l7Var2, property, l7Var2.getAlpha(), 0.0f));
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((View) arrayList.get(i2)).setAlpha(0.0f);
                this.x0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i2), property, ((View) arrayList.get(i2)).getAlpha(), 1.0f));
            }
            this.x0.setDuration(150L);
            this.x0.addListener(new h7(this, arrayList, (byte) 0));
            this.x0.start();
            this.e.clearFocus();
            setVisibility(0);
            ArrayList arrayList2 = this.h0;
            if (!arrayList2.isEmpty() && this.I != null) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (((ph4) arrayList2.get(i3)).h) {
                        this.I.j((ph4) arrayList2.get(i3));
                    }
                }
            }
            o7 o7Var3 = this.I;
            if (o7Var3 != null) {
                o7Var3.h();
            }
            if (z) {
                hl.t1(this.e);
            }
            s6Var.requestLayout();
            requestLayout();
            return false;
        }
        l7Var.setVisibility(0);
        this.G.setAlpha(0.0f);
        AnimatorSet animatorSet4 = this.x0;
        if (animatorSet4 != null) {
            animatorSet4.removeAllListeners();
            this.x0.cancel();
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.x0 = animatorSet5;
        l7 l7Var3 = this.G;
        animatorSet5.playTogether(ObjectAnimator.ofFloat(l7Var3, property, l7Var3.getAlpha(), 1.0f));
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
        this.x0.addListener(new h7(this, arrayList, (byte) 1));
        this.x0.start();
        setVisibility(8);
        n();
        this.e.setText("");
        this.e.requestFocus();
        if (z) {
            hl.E3(this.e);
        }
        this.G.setTag(1);
        o7 o7Var4 = this.I;
        if (o7Var4 != null) {
            o7Var4.i();
        }
        return true;
    }

    public final void U(View view, s7 s7Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        boolean z;
        View childAt;
        long j;
        a aVar;
        ula ulaVar;
        n8 n8Var;
        boolean z2;
        FrameLayout frameLayout = null;
        if (view == null) {
            o27 subMenuOverlayHost = getSubMenuOverlayHost();
            if (subMenuOverlayHost != null) {
                ulaVar = getSubMenuOverlay();
            } else {
                ulaVar = null;
            }
            if (ulaVar != null && ((n8Var = this.d) == null || !n8Var.isShowing())) {
                z();
                if (t() && j()) {
                    if (ulaVar.e == this && (((z2 = ulaVar.I) || ulaVar.U) && z2)) {
                        ulaVar.a(true);
                        return;
                    }
                    this.U = false;
                    p7 p7Var = this.R;
                    if (p7Var != null) {
                        p7Var.W();
                    }
                    ulaVar.e(subMenuOverlayHost, this, getPopupLayout());
                    return;
                }
                return;
            }
        }
        n8 n8Var2 = this.d;
        if (n8Var2 == null || !n8Var2.isShowing()) {
            z();
        }
        if (this.b != null) {
            s6 s6Var = this.c;
            if (s6Var == null || !s6Var.c || (aVar = s6Var.b) == null || aVar.z()) {
                xac xacVar = this.M;
                if (xacVar != null) {
                    hl.r(xacVar);
                    this.M = null;
                }
                n8 n8Var3 = this.d;
                if (n8Var3 != null && n8Var3.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.m0 = s7Var;
                p7 p7Var2 = this.R;
                if (p7Var2 != null) {
                    p7Var2.W();
                }
                if (this.b.getParent() != null) {
                    ((ViewGroup) this.b.getParent()).removeView(this.b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.b;
                if (view != null) {
                    ?? g7Var = new g7(this, getContext(), view);
                    g7Var.setOrientation(1);
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
                    if ((view instanceof b8) || (view instanceof LinearLayout)) {
                        ll0 ll0Var = this.u0;
                        if (ll0Var != null) {
                            jl0 c = ll0Var.c(this.b, null, true);
                            c.p(this.v0);
                            ik8.r(c, hl.L(12.0f), 8.0f);
                            c.S.e = true;
                            frameLayout2.setBackground(c);
                        } else {
                            Drawable mutate = getContext().getDrawable(2131232581).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout2.setBackground(mutate);
                        }
                    }
                    frameLayout2.addView(view, tre.c(-2.0f, -1));
                    g7Var.addView(frameLayout2, tre.o(-1, -2));
                    g7Var.addView(this.b, tre.t(-2, -2, 0, 0, -10, 0, 0));
                    this.b.setTopView(frameLayout2);
                    frameLayout = frameLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = g7Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.u0 != null) {
                    fu5.V(this.b, aob.p1(0.06f, aob.v0(aob.E8, this.n0)));
                }
                n8 n8Var4 = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = n8Var4;
                if (this.W) {
                    n8Var4.setAnimationStyle(0);
                } else {
                    n8Var4.setAnimationStyle(2131755191);
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
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new x6(this, (byte) 0));
                this.d.setOnDismissListener(new y6(this, (byte) 0));
                Point point = hl.q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(ik8.f(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.b.getSwipeBack() != null && (childAt = this.b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = hl.L(16.0f) + childAt.getMeasuredWidth();
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
                if (this.f.getChildAt(i) instanceof r7) {
                    ((r7) this.f.getChildAt(i)).updateColors();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        vnb vnbVar = this.n0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i2 = 0; i2 < this.b.getItemsCount(); i2++) {
                if (this.b.M.getChildAt(i2) instanceof b8) {
                    ((b8) this.b.M.getChildAt(i2)).setSelectorColor(aob.v0(aob.I5, vnbVar));
                }
            }
        }
        m7 m7Var = this.e;
        if (m7Var != null) {
            int i3 = aob.C8;
            yob.l(m7Var, 30, i3, vnbVar);
            yob.D(this.e, aob.D8, vnbVar);
            yob.X(this.e, i3, vnbVar);
            yob.C(this.e, aob.lg, vnbVar);
            yob.y(this.e, aob.mg, vnbVar);
        }
    }

    public final void W(boolean z, boolean z2) {
        float f;
        int i;
        int i2;
        ScrollView scrollView;
        s6 s6Var = this.c;
        if (s6Var != null) {
            i2 = s6Var.getTop() + (-s6Var.b.getMeasuredHeight());
            i = s6Var.getPaddingTop();
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
        s7 s7Var = this.m0;
        if (s7Var == null) {
            s7Var = this;
        }
        if (s6Var != null) {
            a aVar = s6Var.b;
            if (this.N == 0) {
                if (z) {
                    this.d.showAsDropDown(aVar, ((s7Var.getMeasuredWidth() + (s6Var.getLeft() + s7Var.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i3);
                }
                if (z2) {
                    this.d.update(aVar, ((s7Var.getMeasuredWidth() + (s6Var.getLeft() + s7Var.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i3, -1, -1);
                    return;
                }
                return;
            }
            if (z) {
                boolean z3 = this.f0;
                n8 n8Var = this.d;
                if (z3) {
                    n8Var.showAtLocation(aVar, 51, (getLeft() - hl.L(8.0f)) + ((int) getTranslationX()) + this.P, i3);
                } else {
                    n8Var.showAsDropDown(aVar, (getLeft() - hl.L(8.0f)) + ((int) getTranslationX()) + this.P, i3);
                }
            }
            if (z2) {
                this.d.update(aVar, (getLeft() - hl.L(8.0f)) + ((int) getTranslationX()) + this.P, i3, -1, -1);
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
                this.d.showAsDropDown(this, (-hl.L(8.0f)) + this.c0 + this.P, i3);
            }
            if (z2) {
                this.d.update(this, (-hl.L(8.0f)) + this.c0 + this.P, i3, -1, -1);
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

    public final k8 a(int i) {
        q();
        Context context = getContext();
        k8 k8Var = new k8(aob.H8, this.n0, context);
        if (i != -1) {
            k8Var.setTag(Integer.valueOf(i));
        }
        k8Var.setTag(2131296439, 1);
        this.b.a(k8Var, tre.o(-1, 8));
        return k8Var;
    }

    public final TextView b(int i) {
        q();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i);
        textView.setMinimumWidth(hl.L(196.0f));
        this.b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int L = hl.L(3.0f);
        layoutParams.bottomMargin = L;
        layoutParams.topMargin = L;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final b8 d(int i, int i2, Drawable drawable, String str, boolean z, boolean z2, vnb vnbVar) {
        q();
        b8 b8Var = new b8(z2 ? 1 : 0, vnbVar, getContext(), false, false);
        b8Var.j(str, i2, drawable);
        b8Var.setMinimumWidth(hl.L(196.0f));
        b8Var.setTag(Integer.valueOf(i));
        this.b.addView(b8Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b8Var.getLayoutParams();
        if (ob6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = hl.L(48.0f);
        b8Var.setLayoutParams(layoutParams);
        b8Var.setOnClickListener(new w6((byte) 0, this, z));
        return b8Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.q0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final b8 e(int i, int i2, String str) {
        return d(i, i2, null, str, true, false, this.n0);
    }

    public final b8 f(Drawable drawable, String str, int i, boolean z, int i2) {
        return d(i, i2, drawable, str, z, false, this.n0);
    }

    public final void g(int i, String str) {
        q();
        TextView textView = new TextView(getContext());
        yob.X(textView, aob.E8, this.n0);
        textView.setBackgroundDrawable(aob.L0(false));
        if (!ob6.a0) {
            textView.setGravity(16);
        } else {
            textView.setGravity(21);
        }
        textView.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        textView.setTextSize(1, 16.0f);
        textView.setMinWidth(hl.L(196.0f));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTag(Integer.valueOf(i));
        textView.setText(str);
        this.b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (ob6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = hl.L(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new t6(this, (byte) 2));
    }

    public View getContentView() {
        e29 e29Var = this.y;
        if (e29Var != null) {
            return e29Var;
        }
        return this.F;
    }

    public e29 getIconView() {
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

    public ula getSubMenuOverlay() {
        hcc hccVar = this.w0;
        if (hccVar != null) {
            return (ula) hccVar.run();
        }
        return null;
    }

    public o27 getSubMenuOverlayHost() {
        s6 s6Var;
        if (this.w0 != null && (s6Var = this.c) != null) {
            return s6Var.b;
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

    public final void h(l5 l5Var, int i) {
        q();
        l5Var.setLayoutParams(new LinearLayout.LayoutParams(-2, i));
        this.b.addView(l5Var);
        l5Var.setTag(8);
        l5Var.setOnClickListener(new t6(this, (byte) 1));
        l5Var.setBackgroundDrawable(aob.L0(false));
    }

    public final b8 i(int i, rsb rsbVar, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        q();
        b8 b8Var = new b8(0, this.n0, getContext(), false, false);
        b8Var.j(str, i, rsbVar);
        b8Var.setMinimumWidth(hl.L(196.0f));
        b8Var.setRightIcon(2131232064);
        this.b.addView(b8Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b8Var.getLayoutParams();
        if (ob6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = hl.L(48.0f);
        b8Var.setLayoutParams(layoutParams);
        b8Var.Q = new z6(this, this.b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), (byte) 0);
        b8Var.setOnClickListener(new a7(b8Var, (byte) 0));
        this.b.c = true;
        return b8Var;
    }

    public boolean j() {
        a aVar;
        s6 s6Var = this.c;
        if (s6Var != null && s6Var.c && (aVar = s6Var.b) != null && !aVar.z()) {
            return false;
        }
        return true;
    }

    public final void k() {
        o7 o7Var;
        TextView textView;
        o7 o7Var2;
        if (this.s != null) {
            boolean s = s();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!s && TextUtils.isEmpty(this.e.getText()) && (((o7Var = this.I) == null || !o7Var.d()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((o7Var2 = this.I) != null && !o7Var2.m())))) {
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
                            public final s7 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                s7 s7Var = this.b;
                                switch (b) {
                                    case 0:
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view = s7Var.x;
                                        if (view != null) {
                                            view.setTranslationX(hl.L(32.0f) * floatValue);
                                            return;
                                        }
                                        return;
                                    default:
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view2 = s7Var.x;
                                        if (view2 != null) {
                                            view2.setTranslationX(hl.L(32.0f) * floatValue2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        duration.playTogether(ObjectAnimator.ofFloat(this.s, property4, 0.0f), ObjectAnimator.ofFloat(this.s, property3, 0.0f), ObjectAnimator.ofFloat(this.s, property2, 0.0f), ObjectAnimator.ofFloat(this.s, property, 45.0f), ofFloat);
                        duration.addListener(new f7(this, (byte) 0));
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
                        public final s7 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            s7 s7Var = this.b;
                            switch (b) {
                                case 0:
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = s7Var.x;
                                    if (view != null) {
                                        view.setTranslationX(hl.L(32.0f) * floatValue);
                                        return;
                                    }
                                    return;
                                default:
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = s7Var.x;
                                    if (view2 != null) {
                                        view2.setTranslationX(hl.L(32.0f) * floatValue2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.s, property4, 1.0f), ObjectAnimator.ofFloat(this.s, property3, 1.0f), ObjectAnimator.ofFloat(this.s, property2, 1.0f), ObjectAnimator.ofFloat(this.s, property, 0.0f), ofFloat2);
                    duration2.addListener(new f7(this, (byte) 1));
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
            l7 l7Var = new l7((byte) 0, getContext(), this);
            this.G = l7Var;
            if (this.o0 != 0) {
                z = true;
            } else {
                z = false;
            }
            l7Var.setClipChildren(z);
            this.a = null;
            l7 l7Var2 = this.G;
            LinearLayout.LayoutParams m = tre.m(1.0f, 0, -1, this.o0 + 6, 0, 0);
            s6 s6Var = this.c;
            s6Var.addView(l7Var2, 0, m);
            this.G.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i2 = aob.C8;
            vnb vnbVar = this.n0;
            yob.X(textView2, i2, vnbVar);
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            TextView textView3 = this.h;
            if (ob6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            textView3.setGravity(i);
            m7 m7Var = new m7((byte) 0, getContext(), this);
            this.e = m7Var;
            m7Var.setScrollContainer(false);
            this.e.setCursorWidth(1.5f);
            yob.v(this.e, i2, vnbVar);
            this.e.setTextSize(1, 18.0f);
            yob.D(this.e, aob.D8, vnbVar);
            yob.X(this.e, i2, vnbVar);
            this.e.setSingleLine(true);
            this.e.setBackgroundResource(0);
            this.e.setPadding(0, 0, 0, 0);
            this.e.setInputType(this.e.getInputType() | 524288);
            this.e.setOnEditorActionListener(new j(this, (byte) 1));
            this.e.addTextChangedListener(new c7(this, (byte) 0));
            this.e.setImeOptions(234881027);
            this.e.setTextIsSelectable(false);
            yob.C(this.e, aob.lg, vnbVar);
            yob.y(this.e, aob.mg, vnbVar);
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
            boolean z2 = ob6.a0;
            l7 l7Var3 = this.G;
            if (!z2) {
                l7Var3.addView(this.h, tre.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.G.addView(this.e, tre.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.f, tre.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            } else {
                l7Var3.addView(this.f, tre.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.e, tre.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.h, tre.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            }
            this.f.setClipChildren(false);
            d7 d7Var = new d7((byte) 0, getContext(), this);
            this.s = d7Var;
            e7 e7Var = new e7(this, (byte) 0);
            this.a0 = e7Var;
            d7Var.setImageDrawable(e7Var);
            this.s.setBackground(aob.f0(s6Var.b.r0, 1, -1));
            this.s.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setAlpha(0.0f);
            this.s.setRotation(45.0f);
            this.s.setScaleX(0.0f);
            this.s.setScaleY(0.0f);
            this.s.setOnClickListener(new t6(this, (byte) 0));
            this.s.setContentDescription(ob6.M0(2131752064, null));
            this.G.addView(this.s, tre.e(48, -1, 21));
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
                if (((ph4) arrayList.get(i)).h) {
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
        m7 m7Var = this.e;
        if (m7Var == null) {
            return;
        }
        m7Var.setText("");
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
        n8 n8Var = this.d;
        if (n8Var != null && n8Var.isShowing()) {
            W(false, true);
        }
        o7 o7Var = this.I;
        if (o7Var != null) {
            o7Var.g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        xac xacVar;
        xac xacVar2;
        long j;
        ula shownSubMenuOverlay = getShownSubMenuOverlay();
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
        n8 n8Var = this.d;
        if (n8Var != null && n8Var.isShowing()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.r0 = false;
            if ((this.d0 || z2) && t() && !z3 && !z) {
                xac xacVar3 = this.M;
                if (xacVar3 != null) {
                    hl.r(xacVar3);
                    this.M = null;
                }
                xac xacVar4 = new xac((byte) 2, this, z2);
                this.M = xacVar4;
                if (z2) {
                    j = ViewConfiguration.getLongPressTimeout();
                } else {
                    j = 200;
                }
                hl.d3(xacVar4, j);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.M != null) {
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                float f = -scaledTouchSlop;
                if ((motionEvent.getX() < f || motionEvent.getY() < f || motionEvent.getX() >= getWidth() + scaledTouchSlop || motionEvent.getY() >= getHeight() + scaledTouchSlop) && (xacVar2 = this.M) != null) {
                    hl.r(xacVar2);
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
            xac xacVar5 = this.M;
            if (xacVar5 != null) {
                hl.r(xacVar5);
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
                    s6 s6Var = this.c;
                    if (s6Var != null) {
                        s6Var.o(((Integer) tag2).intValue());
                    } else {
                        n7 n7Var = this.Q;
                        if (n7Var != null) {
                            n7Var.g(((Integer) tag2).intValue());
                        }
                    }
                    if (z) {
                        shownSubMenuOverlay.a(true);
                    } else {
                        n8 n8Var2 = this.d;
                        if (n8Var2 != null) {
                            n8Var2.d(this.S);
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
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (xacVar = this.M) != null) {
                hl.r(xacVar);
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
        ula shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        n8 n8Var = this.d;
        if (n8Var != null && n8Var.isShowing()) {
            this.d.dismiss();
        }
    }

    public final void q() {
        if (this.b != null) {
            return;
        }
        this.J = new Rect();
        this.K = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232583, 1, this.n0, getContext());
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        ll0 ll0Var = this.u0;
        if (ll0Var != null) {
            jl0 c = ll0Var.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c.p(this.v0);
            c.r(hl.L(12.0f));
            c.q(hl.L(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c);
        }
        this.b.setOnTouchListener(new b7(this, (byte) 0));
        this.b.setDispatchKeyEventListener(new m0(this, (byte) 2));
    }

    public final void r() {
        ula shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        n8 n8Var = this.d;
        if (n8Var != null) {
            n8Var.d(this.S);
        }
    }

    public final boolean s() {
        ArrayList arrayList = this.h0;
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (((ph4) arrayList.get(i)).h) {
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

    public void setDelegate(n7 n7Var) {
        this.Q = n7Var;
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
        e29 e29Var = this.y;
        if (e29Var == null) {
            return;
        }
        if (drawable instanceof b29) {
            e29Var.setAnimation((b29) drawable);
        } else {
            e29Var.setImageDrawable(drawable);
        }
        this.E = 0;
    }

    public void setIconColor(int i) {
        if (this.s0 == null || this.t0 != i) {
            this.s0 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.t0 = i;
        }
        e29 e29Var = this.y;
        if (e29Var != null) {
            ColorFilter colorFilter = e29Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.s0;
            if (colorFilter != porterDuffColorFilter) {
                e29Var.setColorFilter(porterDuffColorFilter);
            }
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setTextColor(i);
        }
        d7 d7Var = this.s;
        if (d7Var != null) {
            ColorFilter colorFilter2 = d7Var.getColorFilter();
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

    public void setOnMenuDismiss(final pcc pccVar) {
        n8 n8Var = this.d;
        if (n8Var != null) {
            n8Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    pcc pccVar2 = pccVar;
                    if (pccVar2 != null) {
                        pccVar2.a(Boolean.valueOf(s7.this.U));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z) {
        n8 n8Var = this.d;
        if (n8Var != null) {
            n8Var.b = z;
        }
        this.W = z;
    }

    public void setPopupItemsSelectorColor(int i) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            oob oobVar = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
            int childCount = oobVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = oobVar.getChildAt(i2);
                if (childAt instanceof b8) {
                    ((b8) childAt).setSelectorColor(i);
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
        l7 l7Var = this.G;
        if (l7Var != null) {
            ((ViewGroup.MarginLayoutParams) l7Var.getLayoutParams()).leftMargin = hl.L(i);
            l7 l7Var2 = this.G;
            if (this.o0 != 0) {
                z = true;
            } else {
                z = false;
            }
            l7Var2.setClipChildren(z);
            l7 l7Var3 = this.G;
            l7Var3.setLayoutParams(l7Var3.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z) {
        e7 e7Var = this.a0;
        if (e7Var == null) {
            return;
        }
        if (z) {
            e7Var.e = true;
            e7Var.b = System.currentTimeMillis();
            e7Var.invalidateSelf();
            return;
        }
        e7Var.e = false;
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

    public void setSubMenuDelegate(p7 p7Var) {
        this.R = p7Var;
    }

    public void setSubMenuOpenSide(int i) {
        this.N = i;
    }

    public void setSubMenuOverlayProvider(hcc hccVar) {
        this.w0 = hccVar;
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
        q7 q7Var;
        View findViewWithTag;
        HashMap hashMap = this.z0;
        if (hashMap == null) {
            q7Var = null;
        } else {
            q7Var = (q7) hashMap.get(Integer.valueOf(i));
        }
        if (q7Var != null) {
            q7Var.e(8);
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
        l7 l7Var = this.G;
        if (l7Var != null && l7Var.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean x() {
        l7 l7Var = this.G;
        if (l7Var != null && l7Var.getTag() != null) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        ula shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            return shownSubMenuOverlay.I;
        }
        n8 n8Var = this.d;
        if (n8Var != null && n8Var.isShowing()) {
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
                q7 q7Var = (q7) arrayList.get(i);
                q7Var.getClass();
                q();
                View view = q7Var.j;
                if (view != null) {
                    this.b.addView(view);
                } else {
                    byte b = q7Var.a;
                    if (b == 0) {
                        b8 b8Var = new b8(0, this.n0, getContext(), false, false);
                        b8Var.j(q7Var.e, q7Var.c, q7Var.d);
                        b8Var.setMinimumWidth(hl.L(196.0f));
                        b8Var.setTag(Integer.valueOf(q7Var.b));
                        this.b.addView(b8Var);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b8Var.getLayoutParams();
                        if (ob6.a0) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = hl.L(48.0f);
                        b8Var.setLayoutParams(layoutParams);
                        b8Var.setOnClickListener(new t(q7Var, this, (byte) 5));
                        Integer num = q7Var.n;
                        if (num != null && q7Var.o != null) {
                            b8Var.d(num.intValue(), q7Var.o.intValue());
                        }
                        q7Var.j = b8Var;
                    } else if (b == 1) {
                        k8 k8Var = new k8(aob.H8, this.n0, getContext());
                        k8Var.setTag(2131296439, 1);
                        this.b.a(k8Var, tre.o(-1, 8));
                        q7Var.j = k8Var;
                    } else if (b == 2) {
                        b8 b8Var2 = new b8(0, this.n0, getContext(), false, false);
                        b8Var2.j(q7Var.e, q7Var.c, q7Var.d);
                        b8Var2.setMinimumWidth(hl.L(196.0f));
                        b8Var2.setRightIcon(2131232064);
                        b8Var2.getRightIcon().setVisibility(q7Var.m);
                        this.b.addView(b8Var2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b8Var2.getLayoutParams();
                        if (ob6.a0) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = hl.L(48.0f);
                        b8Var2.setLayoutParams(layoutParams2);
                        vo1 vo1Var = q7Var.h;
                        if (vo1Var != null) {
                            q7Var.g = (View) vo1Var.run();
                            q7Var.h = null;
                        }
                        b8Var2.Q = new z6(this, this.b.b(q7Var.g), (byte) 1);
                        b8Var2.setOnClickListener(new a7(b8Var2, (byte) 1));
                        this.b.c = true;
                        Integer num2 = q7Var.n;
                        if (num2 != null && q7Var.o != null) {
                            b8Var2.d(num2.intValue(), q7Var.o.intValue());
                        }
                        q7Var.j = b8Var2;
                    } else if (b == 3) {
                        p66 p66Var = new p66(getContext(), null);
                        p66Var.setTag(2131296439, 1);
                        p66Var.setPadding(hl.L(13.0f), 0, hl.L(13.0f), hl.L(8.0f));
                        p66Var.setTextSize(1, q7Var.i);
                        yob.X(p66Var, aob.E8, null);
                        p66Var.setMovementMethod(LinkMovementMethod.getInstance());
                        yob.G(p66Var, aob.J6, null);
                        p66Var.setText(q7Var.e);
                        p66Var.setMaxWidth(hl.L(200.0f));
                        this.b.a(p66Var, tre.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        q7Var.j = p66Var;
                    }
                }
                View view2 = q7Var.j;
                if (view2 != null) {
                    view2.setVisibility(q7Var.l);
                    po1 po1Var = q7Var.k;
                    if (po1Var != null) {
                        q7Var.j.setOnClickListener(po1Var);
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
        e29 e29Var = this.y;
        if (e29Var == null) {
            return;
        }
        this.E = i;
        e29Var.setImageResource(i);
    }

    public s7(Context context, s6 s6Var, int i) {
        this(context, s6Var, 0, i, false, null);
    }

    public s7(Context context, int i, int i2) {
        this(context, null, i, i2, true, null);
    }
}
