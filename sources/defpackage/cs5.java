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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.ProfileActivity;
public final class cs5 {
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
    public ArrayList P;
    public ArrayList Q;
    public final float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public short W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final ViewGroup a;
    public int a0;
    public ViewGroup b;
    public boolean b0;
    public final d c;
    public boolean c0;
    public final wjb d;
    public float d0;
    public final Context e;
    public float e0;
    public final View f;
    public boolean f0;
    public Drawable g;
    public boolean g0;
    public int h;
    public View h0;
    public byte i;
    public bd i0;
    public boolean j;
    public gk1 j0;
    public int k;
    public final int[] k0;
    public int l;
    public Integer l0;
    public xr5 m;
    public Integer m0;
    public hx4 n;
    public Integer n0;
    public final float[] o;
    public Integer o0;
    public Runnable p;
    public ValueAnimator p0;
    public float q;
    public boolean q0;
    public float r;
    public a7 r0;
    public short s;
    public View s0;
    public boolean t;
    public final int[] t0;
    public boolean u;
    public boolean v;
    public boolean w;
    public zr5 x;
    public qr1 y;
    public final Rect z;

    public cs5(d dVar, View view, boolean z, boolean z2) {
        short s;
        ui5 parentLayout;
        this.i = (byte) 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.k0 = new int[2];
        this.t0 = new int[2];
        if (dVar.getContext() == null) {
            return;
        }
        if ((((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).J0) || (((dVar instanceof cj3) && ((cj3) dVar).X) || (((dVar instanceof ContactsActivity) && ((ContactsActivity) dVar).H) || ((dVar instanceof d8a) && ((d8a) dVar).O)))) && (parentLayout = dVar.getParentLayout()) != null) {
            d safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof ah6) {
                dVar = safeLastFragment;
            }
        }
        this.c = dVar;
        wjb resourceProvider = dVar.getResourceProvider();
        this.d = resourceProvider;
        this.e = dVar.getContext();
        this.f = view;
        if (gl.B(bkb.v0(bkb.c6, resourceProvider)) > 0.705d) {
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

    public static cs5 G(ViewGroup viewGroup, wjb wjbVar, View view) {
        return new cs5(viewGroup, wjbVar, view, false, false, false);
    }

    public static cs5 H(ViewGroup viewGroup, wjb wjbVar, View view, boolean z) {
        return new cs5(viewGroup, wjbVar, view, z, false, false);
    }

    public static cs5 I(d dVar, View view) {
        return new cs5(dVar, view, false, true);
    }

    public static cs5 J(d dVar, View view) {
        return new cs5(dVar, view, true, true);
    }

    public static void V(ViewGroup viewGroup, int i) {
        if (viewGroup != null) {
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof j8) {
                    ((j8) childAt).setColor(i);
                } else if (childAt instanceof ViewGroup) {
                    V((ViewGroup) childAt, i);
                }
            }
        }
    }

    public static void e(cs5 cs5Var, u1b u1bVar, final HashSet hashSet, boolean z, Runnable runnable, final p8c p8cVar) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = cs5Var.e;
        zh3 zh3Var = new zh3(context, (byte) 3);
        LinearLayout linearLayout = new LinearLayout(context);
        zh3Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        cs5Var.q(zh3Var, nme.o(-1, -2));
        float f = 0.12f;
        float f2 = 18.0f;
        if (z && runnable != null) {
            a8 a8Var = new a8(2, cs5Var.d, cs5Var.e, false, false);
            a8Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
            int i = bkb.D8;
            a8Var.c(i, bkb.E8);
            a8Var.h(0.12f, i);
            a8Var.j(k96.M0(2131744548, null), 2131231769, null);
            a8Var.setOnClickListener(new nk3(runnable, (byte) 3));
            linearLayout.addView(a8Var, nme.o(-1, -2));
        }
        ArrayList arrayList2 = u1bVar.h;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            final z1b z1bVar = (z1b) obj;
            final int i3 = z1bVar.a;
            final boolean contains = hashSet.contains(Integer.valueOf(i3));
            float f3 = f2;
            a8 a8Var2 = new a8(2, cs5Var.d, cs5Var.e, false, false);
            a8Var2.setChecked(contains);
            a8Var2.setPadding(gl.L(f3), 0, gl.L(f3), 0);
            int i4 = bkb.D8;
            a8Var2.c(i4, bkb.E8);
            a8Var2.h(f, i4);
            TLRPC.Photo photo = z1bVar.c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                a8Var2.k(z1bVar.b, gl5.f(ba4.w(z1bVar.c.sizes, gl.L(24.0f), false, ba4.w(arrayList, 50, false, null, false), true), z1bVar.c), "50_50", null, null);
            } else {
                a8Var2.j(z1bVar.b, 2131232161, null);
            }
            a8Var2.setOnClickListener(new View.OnClickListener() {
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
                    p8cVar.a(z1bVar);
                }
            });
            linearLayout.addView(a8Var2, nme.o(-1, -2));
            f2 = f3;
            f = 0.12f;
        }
    }

    public static void s(View view, ArrayList arrayList, ArrayList arrayList2) {
        if (view.getVisibility() == 0) {
            if (view instanceof as5) {
                arrayList.add(view);
            }
            if (view instanceof xg6) {
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
                if (view.isClickable() && view.isEnabled() && !(view instanceof j8)) {
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
        wb2 wb2Var = new wb2(this, this.e, this.d, i3 | i2);
        this.D = wb2Var;
        wb2Var.setDispatchKeyEventListener(new tr5(this, (byte) 0));
        this.A = this.D;
    }

    public final void D() {
        O();
        View view = this.f;
        if (view == null) {
            return;
        }
        this.h0 = view;
        view.getLocationOnScreen(this.k0);
        this.i0 = new bd(this, (byte) 2);
        this.h0.getViewTreeObserver().addOnScrollChangedListener(this.i0);
        gk1 gk1Var = new gk1(this, (byte) 3);
        this.j0 = gk1Var;
        this.h0.addOnLayoutChangeListener(gk1Var);
    }

    public final boolean E() {
        xr5 xr5Var = this.m;
        if (xr5Var != null && xr5Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void F() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof a8) {
                ((a8) childAt).setMultiline(false);
            }
        }
    }

    public final cs5 K() {
        cs5 cs5Var = new cs5(this.D, this.d);
        cs5Var.C = this.D.b(cs5Var.B);
        return cs5Var;
    }

    public final void L(cs5 cs5Var) {
        this.q0 = true;
        this.D.getSwipeBack().e(cs5Var.C);
    }

    public final void M() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof a8) {
                a8 a8Var = (a8) childAt;
                a8Var.setRightIcon(2131232403);
                a8Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                a8Var.getRightIcon().setScaleX(0.85f);
                a8Var.getRightIcon().setScaleY(0.85f);
            }
        }
    }

    public final void N(Runnable runnable) {
        if (runnable != null && this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof a8) {
                a8 a8Var = (a8) childAt;
                a8Var.setRightIcon(2131232248);
                a8Var.getRightIcon().setAlpha(0.4f);
                a8Var.setOnClickListener(new ur5(this, runnable, (byte) 3));
            }
        }
    }

    public final void O() {
        View view = this.h0;
        if (view != null) {
            if (this.i0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.i0);
                }
            }
            gk1 gk1Var = this.j0;
            if (gk1Var != null) {
                this.h0.removeOnLayoutChangeListener(gk1Var);
            }
        }
        this.i0 = null;
        this.j0 = null;
        this.h0 = null;
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
        xr5 xr5Var = this.m;
        if (xr5Var != null && xr5Var.isShowing() && (view = this.f) != null && (viewGroup = this.b) != null && this.A != null && this.D != null) {
            float[] fArr = this.o;
            B(view, viewGroup, fArr);
            float f2 = fArr[1];
            float f3 = fArr[0];
            if (this.f0) {
                viewGroup.getLocationOnScreen(new int[2]);
                f3 += iArr[0];
                f2 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof bs5) {
                ((bs5) view).e(rectF);
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
            if (gl.O1()) {
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
            if (this.b0) {
                height = 0.0f;
            } else {
                height = rectF.height();
            }
            if (this.Z) {
                y = (int) (viewGroup.getY() + (Math.min(f5 + height, gl.q.y) - this.A.getMeasuredHeight()));
            } else {
                if (this.X || f5 + height + this.A.getMeasuredHeight() + gl.L(16.0f) > gl.q.y - gl.n) {
                    f5 = (f5 - height) - this.A.getMeasuredHeight();
                    if (this.Y && Math.max(0.0f, f5 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                        f5 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                    }
                }
                y = (int) (viewGroup.getY() + f5 + height);
            }
            float f6 = x + this.q;
            this.d0 = f6;
            float f7 = y + this.r;
            this.e0 = f7;
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

    public final void R(kl0 kl0Var, nl0 nl0Var, boolean z) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            il0 c = kl0Var.c(view, null, z);
            c.p(nl0Var);
            c.q(gl.L(8.0f));
            c.S.e = true;
            c.r(gl.L(12.0f));
            view.setBackground(c);
        }
    }

    public final void S(sl0 sl0Var, float f, float f2) {
        Drawable d = b00.d(this.e, 2131232572);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new vl0(new wl0(sl0Var, viewGroup, 5, false), this.A.getX() + this.d0 + f, this.A.getY() + this.e0 + f2, d, gl.L(12.0f)));
            return;
        }
        for (int i = 0; i < this.A.getChildCount(); i++) {
            View childAt = this.A.getChildAt(i);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new vl0(new wl0(sl0Var, childAt, 5, false), this.A.getX() + this.d0 + f + childAt.getX(), this.A.getY() + this.e0 + f2 + childAt.getY(), d, gl.L(12.0f)));
            }
        }
    }

    public final void T(int i, int i2) {
        View childAt;
        this.m0 = Integer.valueOf(i);
        this.n0 = Integer.valueOf(i2);
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
                    if (childAt2 instanceof a8) {
                        ((a8) childAt2).d(i, i2);
                    }
                }
            } else if (childAt instanceof a8) {
                ((a8) childAt).d(i, i2);
            }
        }
    }

    public final void U(int i) {
        View childAt;
        this.l0 = Integer.valueOf(i);
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
                        if (childAt2 instanceof j8) {
                            ((j8) childAt2).setColor(i);
                        }
                    }
                } else if (childAt instanceof j8) {
                    ((j8) childAt).setColor(i);
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
        xr5 xr5Var = this.m;
        if (xr5Var != null) {
            xr5Var.update((int) this.d0, (int) (this.e0 + f), -1, -1);
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
                    pkb pkbVar = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = pkbVar.getChildAt(0);
                        View childAt3 = pkbVar.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z3 = childAt2 instanceof a8;
                        wjb wjbVar = this.d;
                        if (z3) {
                            a8 a8Var = (a8) childAt2;
                            if (childAt2 == childAt3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            a8Var.n(true, z2);
                        } else if (!(childAt2 instanceof k37) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int i6 = bkb.H5;
                                int v0 = bkb.v0(i6, wjbVar);
                                if (childAt2 == childAt3) {
                                    i2 = 12;
                                } else {
                                    i2 = 0;
                                }
                                ff0 Y = bkb.Y(v0, 12, i2);
                                vkb M = zkb.M(i6);
                                childAt2.setBackground(Y);
                                zkb.j(childAt2, Y, null, M, wjbVar);
                            }
                        } else {
                            int i7 = bkb.H5;
                            int v02 = bkb.v0(i7, wjbVar);
                            if (childAt2 == childAt3) {
                                i = 12;
                            } else {
                                i = 0;
                            }
                            zkb.R(childAt2, bkb.Y(v02, 12, i), null, zkb.M(i7), wjbVar);
                        }
                        if (childAt3 instanceof a8) {
                            a8 a8Var2 = (a8) childAt3;
                            if (childAt3 == childAt2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            a8Var2.n(z, true);
                        } else if (!(childAt3 instanceof k37) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int i8 = bkb.H5;
                                int v03 = bkb.v0(i8, wjbVar);
                                if (childAt2 == childAt3) {
                                    i4 = 12;
                                } else {
                                    i4 = 0;
                                }
                                ff0 Y2 = bkb.Y(v03, i4, 12);
                                vkb M2 = zkb.M(i8);
                                childAt3.setBackground(Y2);
                                zkb.j(childAt3, Y2, null, M2, wjbVar);
                            }
                        } else {
                            int i9 = bkb.H5;
                            int v04 = bkb.v0(i9, wjbVar);
                            if (childAt2 == childAt3) {
                                i3 = 12;
                            } else {
                                i3 = 0;
                            }
                            zkb.R(childAt3, bkb.Y(v04, i3, 12), null, zkb.M(i9), wjbVar);
                        }
                    }
                }
            }
        }
    }

    public final void a(int r8, android.graphics.drawable.Drawable r9, java.lang.CharSequence r10, int r11, int r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.a(int, android.graphics.drawable.Drawable, java.lang.CharSequence, int, int, java.lang.Runnable):void");
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.a0():void");
    }

    public final void b(int i, CharSequence charSequence, Runnable runnable, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = bkb.o7;
            i3 = i2;
        } else {
            i2 = bkb.E8;
            i3 = bkb.D8;
        }
        a(i, null, charSequence, i2, i3, runnable);
    }

    public final void b0(float f, float f2) {
        this.q += f;
        this.r += f2;
    }

    public final void c(defpackage.a8 r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.c(a8):void");
    }

    public final void c0(int i, int i2) {
        View w = w(this.A, i, i2);
        View view = this.s0;
        if (w != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.s0 = w;
            if (w != null) {
                w.setPressed(true);
            }
        }
        View view2 = this.s0;
        if (view2 != null) {
            int[] iArr = this.t0;
            view2.getLocationOnScreen(iArr);
            this.s0.drawableHotspotChanged(i - iArr[0], i2 - iArr[1]);
        }
    }

    public final void d(int r18, boolean r19, java.lang.Runnable r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.d(int, boolean, java.lang.Runnable):void");
    }

    public final void f(org.telegram.tgnet.TLObject r18, boolean r19, java.lang.Runnable r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.f(org.telegram.tgnet.TLObject, boolean, java.lang.Runnable):void");
    }

    public final defpackage.a8 g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.g():a8");
    }

    public final void h(Runnable runnable, String str, boolean z) {
        i(z, 0, null, str, runnable);
    }

    public final void i(boolean r9, int r10, defpackage.fd9 r11, java.lang.String r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.i(boolean, int, fd9, java.lang.String, java.lang.Runnable):void");
    }

    public final void j() {
        j8 j8Var = new j8(this.e, this.d);
        j8Var.setTag(2131296439, 1);
        Integer num = this.l0;
        if (num != null) {
            j8Var.setColor(num.intValue());
        }
        q(j8Var, nme.o(-1, 8));
    }

    public final void k(int i, CharSequence charSequence, Runnable runnable, boolean z) {
        if (!z) {
            return;
        }
        a(i, null, charSequence, bkb.E8, bkb.D8, runnable);
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
        int i = bkb.h6;
        wjb wjbVar = this.d;
        ff0 Y = bkb.Y(bkb.v0(i, wjbVar), 0, 12);
        vkb M = zkb.M(i);
        frameLayout.setBackground(Y);
        zkb.j(frameLayout, Y, null, M, wjbVar);
        be0 be0Var = new be0(context);
        be0Var.setRoundRadius(gl.L(17.0f));
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(tLObject);
        be0Var.f(tLObject, pb0Var);
        frameLayout.addView(be0Var, nme.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        zkb.X(textView, bkb.i5, wjbVar);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(l7c.r((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView l = ug8.l(frameLayout, textView, nme.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        zkb.X(l, bkb.p5, wjbVar);
        l.setTextSize(1, 13.0f);
        l.setText(gl.E2(str, false, gl.L(1.0f), gl.L(0.66f)));
        frameLayout.addView(l, nme.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new ur5(this, runnable, (byte) 0));
        q(frameLayout, nme.o(-1, 52));
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
            int i4 = this.a0;
            if (i4 > 0) {
                f = i4 / gl.p;
            } else {
                f = -2.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(nme.z(-1.0f), nme.z(f));
            layoutParams.gravity = 48;
            viewGroup.addView(view, layoutParams);
        }
        if (!z) {
            i = 4;
        } else {
            i = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232572, i, this.d, context);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new tr5(this, (byte) 1));
        ViewGroup viewGroup2 = this.A;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
        if (!z) {
            i3 = -8;
            i2 = 0;
        } else {
            i2 = -8;
            i3 = 0;
        }
        viewGroup2.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, nme.t(-1, -2, 48, i3, i2, 0, 0));
    }

    public final void o(int i, int i2, CharSequence charSequence) {
        wb wbVar = new wb(this.e, (byte) 22);
        wbVar.setTextSize(1, i);
        zkb.X(wbVar, bkb.i5, this.d);
        wbVar.setPadding(gl.L(13.0f), gl.L(8.0f), gl.L(13.0f), gl.L(8.0f));
        wbVar.setText(vu3.m(charSequence, wbVar.getPaint().getFontMetricsInt(), false, null, 0));
        wbVar.setTag(2131296439, 1);
        wbVar.setTypeface(null);
        kk7.i(wbVar);
        if (i2 > 0) {
            wbVar.setMaxWidth(i2);
        }
        q(wbVar, nme.o(-1, -2));
    }

    public final void p(View view) {
        if (view == null) {
            return;
        }
        view.setTag(2131296439, 1);
        q(view, nme.o(-1, -2));
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
        this.q0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof a8) {
                fm textView = ((a8) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + je5.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.q0) {
            this.q0 = false;
            return;
        }
        xr5 xr5Var = this.m;
        if (xr5Var != null) {
            xr5Var.dismiss();
            return;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void v(ViewGroup viewGroup) {
        zr5 zr5Var = this.x;
        if (zr5Var == null) {
            return;
        }
        this.x = null;
        ValueAnimator valueAnimator = this.p0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(zr5Var.x, 0.0f);
        this.p0 = ofFloat;
        ofFloat.addUpdateListener(new ni4(zr5Var, (byte) 14));
        this.p0.addListener(new i8(this, zr5Var, viewGroup, (byte) 7));
        boolean z = this.L;
        ValueAnimator valueAnimator2 = this.p0;
        if (z) {
            valueAnimator2.setDuration(380L);
            this.p0.setInterpolator(s33.h);
        } else {
            valueAnimator2.setDuration(150L);
        }
        this.p0.start();
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

    public final a8 z() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
                if (childAt instanceof a8) {
                    return (a8) childAt;
                }
                return null;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
            View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
            if (childAt2 instanceof a8) {
                return (a8) childAt2;
            }
            return null;
        }
        return null;
    }

    public cs5(ViewGroup viewGroup, wjb wjbVar, View view, boolean z, boolean z2, boolean z3) {
        this.i = (byte) 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.k0 = new int[2];
        this.t0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.a = viewGroup;
        this.d = wjbVar;
        this.e = viewGroup.getContext();
        this.f = view;
        this.s = ((double) gl.B(bkb.v0(bkb.c6, wjbVar))) > 0.705d ? (short) 102 : (short) 51;
        this.E = z;
        this.F = z2;
        this.G = z3;
        C();
    }

    public cs5(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, wjb wjbVar) {
        this.i = (byte) 5;
        this.o = new float[2];
        this.t = true;
        this.w = true;
        this.z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.k0 = new int[2];
        this.t0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = wjbVar;
    }
}
