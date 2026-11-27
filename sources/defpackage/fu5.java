package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.ProfileActivity;
public final class fu5 {
    public ViewGroup A;
    public final LinearLayout B;
    public int C;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public byte M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public ArrayList R;
    public ArrayList S;
    public boolean T;
    public float U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public short Z;
    public final ViewGroup a;
    public boolean a0;
    public ViewGroup b;
    public boolean b0;
    public final e c;
    public boolean c0;
    public final vnb d;
    public int d0;
    public final Context e;
    public boolean e0;
    public final View f;
    public boolean f0;
    public Drawable g;
    public float g0;
    public int h;
    public float h0;
    public byte i;
    public boolean i0;
    public boolean j;
    public boolean j0;
    public int k;
    public View k0;
    public int l;
    public cd l0;
    public zt5 m;
    public pk1 m0;
    public nz4 n;
    public final int[] n0;
    public final float[] o;
    public Integer o0;
    public Runnable p;
    public Integer p0;
    public float q;
    public Integer q0;
    public float r;
    public Integer r0;
    public short s;
    public ValueAnimator s0;
    public boolean t;
    public boolean t0;
    public boolean u;
    public b7 u0;
    public boolean v;
    public View v0;
    public boolean w;
    public final int[] w0;
    public bu5 x;
    public es1 y;
    public final Rect z;

    public fu5(e eVar, View view, boolean z, boolean z2) {
        short s;
        wk5 parentLayout;
        this.i = (byte) 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.U = 1.0f;
        this.n0 = new int[2];
        this.w0 = new int[2];
        if (eVar.getContext() == null) {
            return;
        }
        if ((((eVar instanceof ProfileActivity) && ((ProfileActivity) eVar).J0) || (((eVar instanceof uj3) && ((uj3) eVar).X) || (((eVar instanceof ContactsActivity) && ((ContactsActivity) eVar).H) || ((eVar instanceof uba) && ((uba) eVar).O)))) && (parentLayout = eVar.getParentLayout()) != null) {
            e safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof fj6) {
                eVar = safeLastFragment;
            }
        }
        this.c = eVar;
        vnb resourceProvider = eVar.getResourceProvider();
        this.d = resourceProvider;
        this.e = eVar.getContext();
        this.f = view;
        if (hl.B(aob.v0(aob.d6, resourceProvider)) > 0.705d) {
            s = 102;
        } else {
            s = 51;
        }
        this.s = s;
        this.E = z;
        this.G = z2;
        this.F = false;
        C();
    }

    public static void B(View view, ViewGroup viewGroup, float[] fArr) {
        if (view != null && viewGroup != null) {
            float f = 0.0f;
            float f2 = 0.0f;
            while (view != viewGroup) {
                float y = view.getY() + f;
                float x = view.getX() + f2;
                if ((view instanceof ScrollView) || (view instanceof HorizontalScrollView)) {
                    x -= view.getScrollX();
                    y -= view.getScrollY();
                }
                f2 = x;
                f = y;
                if (!(view.getParent() instanceof View)) {
                    break;
                }
                view = (View) view.getParent();
                if (!(view instanceof ViewGroup)) {
                    return;
                }
            }
            fArr[0] = f2 - viewGroup.getPaddingLeft();
            fArr[1] = f - viewGroup.getPaddingTop();
        }
    }

    public static fu5 G(ViewGroup viewGroup, vnb vnbVar, View view) {
        return new fu5(viewGroup, vnbVar, view, false, false, false);
    }

    public static fu5 H(ViewGroup viewGroup, vnb vnbVar, View view, boolean z) {
        return new fu5(viewGroup, vnbVar, view, z, false, false);
    }

    public static fu5 I(e eVar, View view) {
        return new fu5(eVar, view, false, true);
    }

    public static fu5 J(e eVar, View view) {
        return new fu5(eVar, view, true, true);
    }

    public static void V(ViewGroup viewGroup, int i) {
        if (viewGroup != null) {
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof k8) {
                    ((k8) childAt).setColor(i);
                } else if (childAt instanceof ViewGroup) {
                    V((ViewGroup) childAt, i);
                }
            }
        }
    }

    public static void e(fu5 fu5Var, r5b r5bVar, final HashSet hashSet, boolean z, Runnable runnable, final pcc pccVar) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = fu5Var.e;
        ti3 ti3Var = new ti3(context, (byte) 3);
        LinearLayout linearLayout = new LinearLayout(context);
        ti3Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        fu5Var.q(ti3Var, tre.o(-1, -2));
        float f = 0.12f;
        float f2 = 18.0f;
        if (z && runnable != null) {
            b8 b8Var = new b8(2, fu5Var.d, fu5Var.e, false, false);
            b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
            int i = aob.E8;
            b8Var.c(i, aob.F8);
            b8Var.h(0.12f, i);
            b8Var.j(ob6.M0(2131744442, null), 2131231769, null);
            b8Var.setOnClickListener(new el3(runnable, (byte) 3));
            linearLayout.addView(b8Var, tre.o(-1, -2));
        }
        ArrayList arrayList2 = r5bVar.h;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            final w5b w5bVar = (w5b) obj;
            final int i3 = w5bVar.a;
            final boolean contains = hashSet.contains(Integer.valueOf(i3));
            float f3 = f2;
            b8 b8Var2 = new b8(2, fu5Var.d, fu5Var.e, false, false);
            b8Var2.setChecked(contains);
            b8Var2.setPadding(hl.L(f3), 0, hl.L(f3), 0);
            int i4 = aob.E8;
            b8Var2.c(i4, aob.F8);
            b8Var2.h(f, i4);
            TLRPC.Photo photo = w5bVar.c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                b8Var2.k(w5bVar.b, jn5.f(xb4.w(w5bVar.c.sizes, hl.L(24.0f), false, xb4.w(arrayList, 50, false, null, false), true), w5bVar.c), "50_50", null, null);
            } else {
                b8Var2.j(w5bVar.b, 2131232161, null);
            }
            b8Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    boolean z2 = contains;
                    HashSet hashSet2 = hashSet;
                    int i5 = i3;
                    if (z2) {
                        hashSet2.remove(Integer.valueOf(i5));
                    } else {
                        hashSet2.add(Integer.valueOf(i5));
                    }
                    pccVar.a(w5bVar);
                }
            });
            linearLayout.addView(b8Var2, tre.o(-1, -2));
            f2 = f3;
            f = 0.12f;
        }
    }

    public static void s(View view, ArrayList arrayList, ArrayList arrayList2) {
        if (view.getVisibility() == 0) {
            if (view instanceof cu5) {
                arrayList.add(view);
            }
            if (view instanceof du5) {
                arrayList2.add(view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    s(viewGroup.getChildAt(i), arrayList, arrayList2);
                }
            }
        }
    }

    public static View w(View view, int i, int i2) {
        if (view != null && view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            int width = view.getWidth() + i3;
            int height = view.getHeight() + i4;
            if (i >= i3 && i < width && i2 >= i4 && i2 < height) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View w = w(viewGroup.getChildAt(childCount), i, i2);
                        if (w != null) {
                            return w;
                        }
                    }
                }
                if (view.isClickable() && view.isEnabled() && !(view instanceof k8)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final View A() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                return linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
            return actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
        }
        return null;
    }

    public final void C() {
        int i;
        int i2 = 0;
        if (this.F) {
            i = 2;
        } else {
            i = 0;
        }
        int i3 = (this.E ? 1 : 0) | i;
        if (!this.G) {
            i2 = 4;
        }
        mc2 mc2Var = new mc2(this, this.e, this.d, i3 | i2);
        this.D = mc2Var;
        mc2Var.setDispatchKeyEventListener(new vt5(this, (byte) 0));
        this.A = this.D;
    }

    public final void D() {
        O();
        View view = this.f;
        if (view == null) {
            return;
        }
        this.k0 = view;
        view.getLocationOnScreen(this.n0);
        this.l0 = new cd(this, (byte) 2);
        this.k0.getViewTreeObserver().addOnScrollChangedListener(this.l0);
        pk1 pk1Var = new pk1(this, (byte) 3);
        this.m0 = pk1Var;
        this.k0.addOnLayoutChangeListener(pk1Var);
    }

    public final boolean E() {
        zt5 zt5Var = this.m;
        if (zt5Var != null && zt5Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void F() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof b8) {
                ((b8) childAt).setMultiline(false);
            }
        }
    }

    public final fu5 K() {
        fu5 fu5Var = new fu5(this.D, this.d);
        fu5Var.C = this.D.b(fu5Var.B);
        return fu5Var;
    }

    public final void L(fu5 fu5Var) {
        this.t0 = true;
        this.D.getSwipeBack().e(fu5Var.C);
    }

    public final void M() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof b8) {
                b8 b8Var = (b8) childAt;
                b8Var.setRightIcon(2131232403);
                b8Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                b8Var.getRightIcon().setScaleX(0.85f);
                b8Var.getRightIcon().setScaleY(0.85f);
            }
        }
    }

    public final void N(Runnable runnable) {
        if (runnable != null && this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof b8) {
                b8 b8Var = (b8) childAt;
                b8Var.setRightIcon(2131232248);
                b8Var.getRightIcon().setAlpha(0.4f);
                b8Var.setOnClickListener(new wt5(this, runnable, (byte) 2));
            }
        }
    }

    public final void O() {
        View view = this.k0;
        if (view != null) {
            if (this.l0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.l0);
                }
            }
            pk1 pk1Var = this.m0;
            if (pk1Var != null) {
                this.k0.removeOnLayoutChangeListener(pk1Var);
            }
        }
        this.l0 = null;
        this.m0 = null;
        this.k0 = null;
    }

    public final void P() {
        View view;
        ViewGroup viewGroup;
        int i;
        int x;
        float width;
        float f;
        float height;
        int y;
        int[] iArr;
        zt5 zt5Var = this.m;
        if (zt5Var != null && zt5Var.isShowing() && (view = this.f) != null && (viewGroup = this.b) != null && this.A != null && this.D != null) {
            float[] fArr = this.o;
            B(view, viewGroup, fArr);
            float f2 = fArr[1];
            float f3 = fArr[0];
            if (this.i0) {
                viewGroup.getLocationOnScreen(new int[2]);
                f3 += iArr[0];
                f2 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof eu5) {
                ((eu5) view).e(rectF);
            } else {
                int i2 = this.N;
                if (i2 != 0 && (i = this.O) != 0) {
                    rectF.set(0.0f, 0.0f, i2, i);
                } else {
                    rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
            }
            float f4 = f3 + rectF.left;
            float f5 = f2 + rectF.top;
            if (this.j) {
                fArr[0] = 0.0f;
                f4 = 0.0f;
            }
            this.A.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), Integer.MIN_VALUE));
            RectF rectF2 = new RectF();
            Rect padding = this.D.getPadding();
            rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
            if (hl.O1()) {
                f5 += viewGroup.getPaddingTop();
                f4 -= viewGroup.getPaddingLeft();
            }
            byte b = this.i;
            if (b == 3) {
                x = (int) (viewGroup.getX() + f4);
            } else {
                if (b == 5) {
                    width = rectF.width() + viewGroup.getX() + f4;
                    f = rectF2.right;
                } else if (b == 1) {
                    width = (rectF.width() / 2.0f) + viewGroup.getX() + f4;
                    f = this.A.getMeasuredWidth() / 2.0f;
                } else if (rectF2.width() + f4 > viewGroup.getWidth()) {
                    width = rectF.width() + viewGroup.getX() + f4;
                    f = rectF2.right;
                } else {
                    x = (int) ((viewGroup.getX() + f4) - rectF2.left);
                }
                x = (int) (width - f);
            }
            if (this.e0) {
                height = 0.0f;
            } else {
                height = rectF.height();
            }
            if (this.c0) {
                y = (int) (viewGroup.getY() + (Math.min(f5 + height, hl.q.y) - this.A.getMeasuredHeight()));
            } else {
                if (this.a0 || f5 + height + this.A.getMeasuredHeight() + hl.L(16.0f) > hl.q.y - hl.n) {
                    f5 = (f5 - height) - this.A.getMeasuredHeight();
                    if (this.b0 && Math.max(0.0f, f5 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                        f5 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                    }
                }
                y = (int) (viewGroup.getY() + f5 + height);
            }
            float f6 = x + this.q;
            this.g0 = f6;
            float f7 = y + this.r;
            this.h0 = f7;
            this.m.update((int) f6, (int) f7, -1, -1);
        }
    }

    public final void Q(int i) {
        View childAt;
        for (int i2 = 0; i2 < this.A.getChildCount(); i2++) {
            if (i2 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i2);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i);
            }
        }
    }

    public final void R(ll0 ll0Var, ol0 ol0Var, boolean z) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            jl0 c = ll0Var.c(view, null, z);
            c.p(ol0Var);
            c.q(hl.L(8.0f));
            c.S.e = true;
            c.r(hl.L(12.0f));
            view.setBackground(c);
        }
    }

    public final void S(tl0 tl0Var, float f, float f2) {
        Drawable e = c00.e(this.e, 2131232583);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new wl0(new xl0(tl0Var, viewGroup, 5, false), this.A.getX() + this.g0 + f, this.A.getY() + this.h0 + f2, e, hl.L(12.0f)));
            return;
        }
        for (int i = 0; i < this.A.getChildCount(); i++) {
            View childAt = this.A.getChildAt(i);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new wl0(new xl0(tl0Var, childAt, 5, false), this.A.getX() + this.g0 + f + childAt.getX(), this.A.getY() + this.h0 + f2 + childAt.getY(), e, hl.L(12.0f)));
            }
        }
    }

    public final void T(int i, int i2) {
        View childAt;
        this.p0 = Integer.valueOf(i);
        this.q0 = Integer.valueOf(i2);
        for (int i3 = 0; i3 < this.A.getChildCount(); i3++) {
            if (i3 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i3);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i4 = 0; i4 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i4++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i4);
                    if (childAt2 instanceof b8) {
                        ((b8) childAt2).d(i, i2);
                    }
                }
            } else if (childAt instanceof b8) {
                ((b8) childAt).d(i, i2);
            }
        }
    }

    public final void U(int i) {
        View childAt;
        this.o0 = Integer.valueOf(i);
        if (this.A != null) {
            for (int i2 = 0; i2 < this.A.getChildCount(); i2++) {
                if (i2 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i2);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i3 = 0; i3 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i3++) {
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                        if (childAt2 instanceof k8) {
                            ((k8) childAt2).setColor(i);
                        }
                    }
                } else if (childAt instanceof k8) {
                    ((k8) childAt).setColor(i);
                }
            }
        }
    }

    public final void W(int i) {
        this.i = i;
        if (i == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).c = true;
            }
        }
    }

    public final void X(Drawable drawable) {
        this.g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void Y(float f) {
        zt5 zt5Var = this.m;
        if (zt5Var != null) {
            zt5Var.update((int) this.g0, (int) (this.h0 + f), -1, -1);
        }
    }

    public final void Z() {
        View childAt;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        if (this.A != null) {
            for (int i5 = 0; i5 < this.A.getChildCount(); i5++) {
                if (i5 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i5);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    oob oobVar = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = oobVar.getChildAt(0);
                        View childAt3 = oobVar.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z3 = childAt2 instanceof b8;
                        vnb vnbVar = this.d;
                        if (z3) {
                            b8 b8Var = (b8) childAt2;
                            if (childAt2 == childAt3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            b8Var.n(true, z2);
                        } else if (!(childAt2 instanceof r57) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int i6 = aob.I5;
                                int v0 = aob.v0(i6, vnbVar);
                                if (childAt2 == childAt3) {
                                    i2 = 12;
                                } else {
                                    i2 = 0;
                                }
                                hf0 Y = aob.Y(v0, 12, i2);
                                uob M = yob.M(i6);
                                childAt2.setBackground(Y);
                                yob.j(childAt2, Y, null, M, vnbVar);
                            }
                        } else {
                            int i7 = aob.I5;
                            int v02 = aob.v0(i7, vnbVar);
                            if (childAt2 == childAt3) {
                                i = 12;
                            } else {
                                i = 0;
                            }
                            yob.R(childAt2, aob.Y(v02, 12, i), null, yob.M(i7), vnbVar);
                        }
                        if (childAt3 instanceof b8) {
                            b8 b8Var2 = (b8) childAt3;
                            if (childAt3 == childAt2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            b8Var2.n(z, true);
                        } else if (!(childAt3 instanceof r57) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int i8 = aob.I5;
                                int v03 = aob.v0(i8, vnbVar);
                                if (childAt2 == childAt3) {
                                    i4 = 12;
                                } else {
                                    i4 = 0;
                                }
                                hf0 Y2 = aob.Y(v03, i4, 12);
                                uob M2 = yob.M(i8);
                                childAt3.setBackground(Y2);
                                yob.j(childAt3, Y2, null, M2, vnbVar);
                            }
                        } else {
                            int i9 = aob.I5;
                            int v04 = aob.v0(i9, vnbVar);
                            if (childAt2 == childAt3) {
                                i3 = 12;
                            } else {
                                i3 = 0;
                            }
                            yob.R(childAt3, aob.Y(v04, i3, 12), null, yob.M(i9), vnbVar);
                        }
                    }
                }
            }
        }
    }

    public final void a(int r8, android.graphics.drawable.Drawable r9, java.lang.CharSequence r10, java.lang.String r11, int r12, int r13, java.lang.Runnable r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu5.a(int, android.graphics.drawable.Drawable, java.lang.CharSequence, java.lang.String, int, int, java.lang.Runnable):void");
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu5.a0():void");
    }

    public final void b(int i, CharSequence charSequence, Runnable runnable, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = aob.p7;
            i3 = i2;
        } else {
            i2 = aob.F8;
            i3 = aob.E8;
        }
        a(i, null, charSequence, null, i2, i3, runnable);
    }

    public final void b0(float f, float f2) {
        this.q += f;
        this.r += f2;
    }

    public final void c(defpackage.b8 r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu5.c(b8):void");
    }

    public final void c0(int i, int i2) {
        View w = w(this.A, i, i2);
        View view = this.v0;
        if (w != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.v0 = w;
            if (w != null) {
                w.setPressed(true);
            }
        }
        View view2 = this.v0;
        if (view2 != null) {
            int[] iArr = this.w0;
            view2.getLocationOnScreen(iArr);
            this.v0.drawableHotspotChanged(i - iArr[0], i2 - iArr[1]);
        }
    }

    public final void d(int r19, boolean r20, java.lang.Runnable r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu5.d(int, boolean, java.lang.Runnable):void");
    }

    public final void f(org.telegram.tgnet.TLObject r18, boolean r19, java.lang.Runnable r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu5.f(org.telegram.tgnet.TLObject, boolean, java.lang.Runnable):void");
    }

    public final defpackage.b8 g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu5.g():b8");
    }

    public final void h(Runnable runnable, String str, boolean z) {
        i(z, 0, null, str, runnable);
    }

    public final void i(boolean r9, int r10, defpackage.wg9 r11, java.lang.String r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu5.i(boolean, int, wg9, java.lang.String, java.lang.Runnable):void");
    }

    public final void j() {
        k8 k8Var = new k8(this.e, this.d);
        k8Var.setTag(2131296439, 1);
        Integer num = this.o0;
        if (num != null) {
            k8Var.setColor(num.intValue());
        }
        q(k8Var, tre.o(-1, 8));
    }

    public final void k(int i, CharSequence charSequence, Runnable runnable, boolean z) {
        if (!z) {
            return;
        }
        a(i, null, charSequence, null, aob.F8, aob.E8, runnable);
    }

    public final void l(int i, Runnable runnable, String str, boolean z, boolean z2) {
        if (!z) {
            return;
        }
        b(i, str, runnable, z2);
    }

    public final void m(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i = aob.i6;
        vnb vnbVar = this.d;
        hf0 Y = aob.Y(aob.v0(i, vnbVar), 0, 12);
        uob M = yob.M(i);
        frameLayout.setBackground(Y);
        yob.j(frameLayout, Y, null, M, vnbVar);
        de0 de0Var = new de0(context);
        de0Var.setRoundRadius(hl.L(17.0f));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(tLObject);
        de0Var.f(tLObject, rb0Var);
        frameLayout.addView(de0Var, tre.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        yob.X(textView, aob.j5, vnbVar);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(lbc.r((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView l = ik8.l(frameLayout, textView, tre.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        yob.X(l, aob.q5, vnbVar);
        l.setTextSize(1, 13.0f);
        l.setText(hl.E2(str, false, hl.L(1.0f), hl.L(0.66f)));
        frameLayout.addView(l, tre.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new wt5(this, runnable, (byte) 1));
        q(frameLayout, tre.o(-1, 52));
    }

    public final void n(boolean z) {
        int i;
        int i2;
        int i3;
        float f;
        boolean z2 = this.A instanceof LinearLayout;
        Context context = this.e;
        if (!z2) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(z ? 1 : 0);
            ViewGroup viewGroup = this.A;
            View view = this.D;
            int i4 = this.d0;
            if (i4 > 0) {
                f = i4 / hl.p;
            } else {
                f = -2.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tre.z(-1.0f), tre.z(f));
            layoutParams.gravity = 48;
            viewGroup.addView(view, layoutParams);
        }
        if (!z) {
            i = 4;
        } else {
            i = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232583, i, this.d, context);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new vt5(this, (byte) 1));
        ViewGroup viewGroup2 = this.A;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
        if (!z) {
            i3 = -8;
            i2 = 0;
        } else {
            i2 = -8;
            i3 = 0;
        }
        viewGroup2.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, tre.t(-1, -2, 48, i3, i2, 0, 0));
    }

    public final void o(int i, int i2, CharSequence charSequence) {
        xb xbVar = new xb(this.e, (byte) 22);
        xbVar.setTextSize(1, i);
        yob.X(xbVar, aob.j5, this.d);
        xbVar.setPadding(hl.L(13.0f), hl.L(8.0f), hl.L(13.0f), hl.L(8.0f));
        xbVar.setText(pv3.m(charSequence, xbVar.getPaint().getFontMetricsInt(), false, null, 0));
        xbVar.setTag(2131296439, 1);
        xbVar.setTypeface(null);
        jn7.i(xbVar);
        if (i2 > 0) {
            xbVar.setMaxWidth(i2);
        }
        q(xbVar, tre.o(-1, -2));
    }

    public final void p(View view) {
        if (view == null) {
            return;
        }
        view.setTag(2131296439, 1);
        q(view, tre.o(-1, -2));
    }

    public final void q(View view, LinearLayout.LayoutParams layoutParams) {
        if (view == null) {
            return;
        }
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            linearLayout.addView(view, layoutParams);
        } else {
            this.D.a(view, layoutParams);
        }
    }

    public final void r() {
        this.t0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof b8) {
                gm textView = ((b8) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + kg5.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.t0) {
            this.t0 = false;
            return;
        }
        zt5 zt5Var = this.m;
        if (zt5Var != null) {
            zt5Var.dismiss();
            return;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void v(ViewGroup viewGroup) {
        bu5 bu5Var = this.x;
        if (bu5Var == null) {
            return;
        }
        this.x = null;
        ValueAnimator valueAnimator = this.s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(bu5Var.x, 0.0f);
        this.s0 = ofFloat;
        ofFloat.addUpdateListener(new ch4(bu5Var, (byte) 15));
        this.s0.addListener(new j8(this, bu5Var, viewGroup, (byte) 8));
        boolean z = this.L;
        ValueAnimator valueAnimator2 = this.s0;
        if (z) {
            valueAnimator2.setDuration(380L);
            this.s0.setInterpolator(k43.h);
        } else {
            valueAnimator2.setDuration(150L);
        }
        this.s0.start();
    }

    public final View x(int i) {
        View childAt;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null || this.A != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
                return actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i);
            }
            for (int i2 = 0; i2 < this.A.getChildCount() - 1; i2++) {
                if (i2 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i2);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i);
                    if (childAt2 != null) {
                        return childAt2;
                    }
                    i -= actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount();
                }
            }
            return null;
        }
        return null;
    }

    public final int y() {
        View childAt;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.A.getChildCount() - 1; i2++) {
            if (i2 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i2);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                i = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt).getItemsCount() + i;
            }
        }
        return i;
    }

    public final b8 z() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
                if (childAt instanceof b8) {
                    return (b8) childAt;
                }
                return null;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
            View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
            if (childAt2 instanceof b8) {
                return (b8) childAt2;
            }
            return null;
        }
        return null;
    }

    public fu5(ViewGroup viewGroup, vnb vnbVar, View view, boolean z, boolean z2, boolean z3) {
        this.i = (byte) 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.U = 1.0f;
        this.n0 = new int[2];
        this.w0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.a = viewGroup;
        this.d = vnbVar;
        this.e = viewGroup.getContext();
        this.f = view;
        this.s = ((double) hl.B(aob.v0(aob.d6, vnbVar))) > 0.705d ? (short) 102 : (short) 51;
        this.E = z;
        this.F = z2;
        this.G = z3;
        C();
    }

    public fu5(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, vnb vnbVar) {
        this.i = (byte) 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.U = 1.0f;
        this.n0 = new int[2];
        this.w0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = vnbVar;
    }
}
