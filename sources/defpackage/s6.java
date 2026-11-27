package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
public class s6 extends LinearLayout {
    public boolean a;
    public final a b;
    public boolean c;
    public boolean d;
    public ArrayList e;
    public Runnable f;

    public s6(Context context, a aVar) {
        super(context);
        this.a = true;
        setOrientation(0);
        this.b = aVar;
    }

    public final s7 a(int i, int i2) {
        int i3;
        boolean z = this.c;
        a aVar = this.b;
        if (z) {
            i3 = aVar.r0;
        } else {
            i3 = aVar.q0;
        }
        return c(i, i2, null, i3, null, hl.L(48.0f), null, null);
    }

    public final s7 b(int i, int i2, vnb vnbVar) {
        int i3;
        boolean z = this.c;
        a aVar = this.b;
        if (z) {
            i3 = aVar.r0;
        } else {
            i3 = aVar.q0;
        }
        return c(i, i2, null, i3, null, hl.L(48.0f), null, vnbVar);
    }

    public final s7 c(int i, int i2, String str, int i3, Drawable drawable, int i4, String str2, vnb vnbVar) {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.e = arrayList;
        }
        arrayList.add(Integer.valueOf(i));
        return f(-1, i, i2, str, i3, drawable, i4, str2, vnbVar);
    }

    public final s7 d(int i, Drawable drawable) {
        int i2;
        boolean z = this.c;
        a aVar = this.b;
        if (z) {
            i2 = aVar.r0;
        } else {
            i2 = aVar.q0;
        }
        return c(i, 0, null, i2, drawable, hl.L(48.0f), null, null);
    }

    public final s7 e(int i, String str) {
        int i2;
        boolean z = this.c;
        a aVar = this.b;
        if (z) {
            i2 = aVar.r0;
        } else {
            i2 = aVar.q0;
        }
        return c(i, 0, str, i2, null, 0, str, null);
    }

    public final s7 f(int i, int i2, int i3, String str, int i4, Drawable drawable, int i5, String str2, vnb vnbVar) {
        int i6;
        boolean z;
        int i7;
        Context context = getContext();
        boolean z2 = this.c;
        a aVar = this.b;
        if (z2) {
            i6 = aVar.t0;
        } else {
            i6 = aVar.s0;
        }
        int i8 = i6;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        s7 s7Var = new s7(context, this, i4, i8, z, vnbVar);
        s7Var.setTag(Integer.valueOf(i2));
        if (str != null) {
            s7Var.F.setText(str);
            if (i5 != 0) {
                i7 = i5;
            } else {
                i7 = -2;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i7, -1);
            int L = hl.L(14.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
            addView(s7Var, i, layoutParams);
        } else {
            e29 e29Var = s7Var.y;
            if (drawable != null) {
                if (drawable instanceof b29) {
                    e29Var.setAnimation((b29) drawable);
                } else {
                    e29Var.setImageDrawable(drawable);
                }
            } else if (i3 != 0) {
                e29Var.setImageResource(i3);
            }
            addView(s7Var, i, new LinearLayout.LayoutParams(i5, -1));
        }
        s7Var.setOnClickListener(new k1(this, (byte) 3));
        if (str2 != null) {
            s7Var.setContentDescription(str2);
        }
        return s7Var;
    }

    public final s7 g(int i, int i2, int i3) {
        int i4;
        boolean z = this.c;
        a aVar = this.b;
        if (z) {
            i4 = aVar.r0;
        } else {
            i4 = aVar.q0;
        }
        return c(i, i2, null, i4, null, i3, null, null);
    }

    public int getClosingSearchFieldWidth() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.v() && s7Var.w() && !s7Var.x()) {
                    View searchContainer = s7Var.getSearchContainer();
                    while (true) {
                        if (searchContainer == null) {
                            break;
                        } else if (searchContainer.getParent() != this) {
                            if (searchContainer.getParent() instanceof View) {
                                searchContainer = (View) searchContainer.getParent();
                            } else {
                                searchContainer = null;
                            }
                        } else if (searchContainer.getVisibility() != 8) {
                            int measuredWidth = searchContainer.getMeasuredWidth() + i;
                            if (searchContainer.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) searchContainer.getLayoutParams();
                                i = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + measuredWidth;
                            } else {
                                i = measuredWidth;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float f = Float.POSITIVE_INFINITY;
        float f2 = Float.NEGATIVE_INFINITY;
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof s7) && childAt.getVisibility() == 0) {
                float x = childAt.getX();
                f = Math.min(f, x);
                f2 = Math.max(f2, childAt.getWidth() + x);
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        return (int) (f2 - f);
    }

    public int getVisibleItemsMeasuredWidth() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof s7) && childAt.getVisibility() != 8) {
                i = childAt.getMeasuredWidth() + i;
            }
        }
        return i;
    }

    public int getVisibleItemsMeasuredWidthWithAlpha() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof s7) && childAt.getVisibility() == 0) {
                f = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f;
            }
        }
        return (int) f;
    }

    public final s7 h(int i, int i2, int i3, String str) {
        int i4;
        boolean z = this.c;
        a aVar = this.b;
        if (z) {
            i4 = aVar.r0;
        } else {
            i4 = aVar.q0;
        }
        return c(i, i2, null, i4, null, i3, str, null);
    }

    public final void i(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.v() && s7Var.w()) {
                    o7 o7Var = s7Var.I;
                    if (o7Var == null || o7Var.b()) {
                        this.b.C(false);
                        s7Var.T(z);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final s7 j(int i) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i));
        if (findViewWithTag instanceof s7) {
            return (s7) findViewWithTag;
        }
        return null;
    }

    public final int k() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof s7) {
                i = childAt.getMeasuredWidth() + i;
            }
        }
        return i;
    }

    public final r6 l(int i, int i2, int i3, Drawable drawable, int i4, vnb vnbVar) {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.e = arrayList;
        }
        arrayList.add(Integer.valueOf(i));
        ?? obj = new Object();
        obj.i = 1.0f;
        obj.l = (byte) 8;
        obj.a = this;
        obj.b = i;
        obj.c = i2;
        obj.e = i3;
        obj.f = drawable;
        obj.g = i4;
        obj.h = vnbVar;
        return obj;
    }

    public final r6 m(vnb vnbVar) {
        int i;
        boolean z = this.c;
        a aVar = this.b;
        if (z) {
            i = aVar.r0;
        } else {
            i = aVar.q0;
        }
        return l(32, 2131230911, i, null, hl.L(48.0f), vnbVar);
    }

    public final r6 n(Drawable drawable, vnb vnbVar) {
        int i;
        boolean z = this.c;
        a aVar = this.b;
        if (z) {
            i = aVar.r0;
        } else {
            i = aVar.q0;
        }
        return l(14, 0, i, drawable, hl.L(48.0f), vnbVar);
    }

    public final void o(int i) {
        d6 d6Var = this.b.v0;
        if (d6Var != null) {
            d6Var.b(i);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.n();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.d) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof s7) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = -hl.L(5.0f);
                        marginLayoutParams.rightMargin = -hl.L(5.0f);
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public final boolean p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.getSearchContainer() != null && s7Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i, int i2) {
        s7 j = j(i);
        if (j != null) {
            j.setVisibility(i2);
        }
    }

    public final void r(float f) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s7) {
                ((s7) childAt).setTransitionOffset(f);
            }
        }
    }

    public final void s() {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof s7) {
                boolean z = this.c;
                a aVar = this.b;
                if (z) {
                    i = aVar.r0;
                } else {
                    i = aVar.q0;
                }
                childAt.setBackgroundDrawable(aob.f0(i, 1, -1));
            }
        }
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public void setFilter(ph4 ph4Var) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.v()) {
                    ArrayList arrayList = s7Var.h0;
                    arrayList.add(ph4Var);
                    if (s7Var.G.getTag() != null) {
                        s7Var.i0 = arrayList.size() - 1;
                    }
                    s7Var.E();
                    return;
                }
            }
        }
    }

    public void setGlassMode(boolean z) {
        this.d = z;
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.f = runnable;
    }

    public void setPopupItemsSelectorColor(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof s7) {
                ((s7) childAt).setPopupItemsSelectorColor(i);
            }
        }
    }

    public void setSearchCursorColor(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.v()) {
                    s7Var.getSearchField().setCursorColor(i);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.v()) {
                    s7Var.P(str, false);
                    s7Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                boolean z = this.c;
                a aVar = this.b;
                if (z) {
                    i = aVar.t0;
                } else {
                    i = aVar.s0;
                }
                s7Var.setIconColor(i);
            }
        }
    }
}
