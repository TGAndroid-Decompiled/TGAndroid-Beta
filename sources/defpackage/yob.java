package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;
public abstract class yob {
    public static final xob a = new xob();
    public static int b = 1;
    public static long c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i, vnb vnbVar) {
        l(editTextBoldCursor, 34, i, vnbVar);
    }

    public static void B(View view, Drawable drawable, uob uobVar, vnb vnbVar) {
        view.setBackground(drawable);
        j(view, drawable, uobVar, null, vnbVar);
    }

    public static void C(TextView textView, int i, vnb vnbVar) {
        n(textView, 3, i, -1, 0, 0.0f, vnbVar);
    }

    public static void D(TextView textView, int i, vnb vnbVar) {
        n(textView, 1, i, -1, 0, 0.0f, vnbVar);
    }

    public static void E(EditTextBoldCursor editTextBoldCursor, int i) {
        D(editTextBoldCursor, i, null);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i, int i2, int i3, vnb vnbVar) {
        editTextBoldCursor.u(aob.v0(i, vnbVar), aob.v0(i2, vnbVar), aob.v0(i3, vnbVar));
        T(editTextBoldCursor, 31, i, vnbVar).g = editTextBoldCursor.getLineColor();
        T(editTextBoldCursor, 32, i2, vnbVar).g = editTextBoldCursor.getActiveLineColor();
        T(editTextBoldCursor, 33, i3, vnbVar).g = editTextBoldCursor.getErrorLineColor();
    }

    public static void G(TextView textView, int i, vnb vnbVar) {
        n(textView, 2, i, -1, 0, 0.0f, vnbVar);
    }

    public static void H(RecyclerView recyclerView, int i, vnb vnbVar) {
        l(recyclerView, 21, i, vnbVar);
    }

    public static void I(int i, t85 t85Var) {
        l(t85Var, 20, i, null);
    }

    public static void J(d79 d79Var, int i, vnb vnbVar) {
        l(d79Var, 20, i, vnbVar);
    }

    public static uob K(float f, int i) {
        return new uob(i, -1, f, 2);
    }

    public static xob L(boolean z, int i, HashSet hashSet) {
        xob xobVar = a;
        if (xobVar.e) {
            xobVar = new xob();
        }
        xobVar.e = true;
        xobVar.b = z;
        xobVar.c = i;
        xobVar.d = hashSet;
        xobVar.a.clear();
        return xobVar;
    }

    public static uob M(int i) {
        return new uob(i, -1, 0.0f, 0);
    }

    public static sob N(View view, int i, int i2, int i3, int i4, float f, vnb vnbVar, int i5, PorterDuffColorFilter porterDuffColorFilter) {
        sob[] sobVarArr = o(view, true).a;
        sob sobVar = sobVarArr[i];
        if (sobVar == null) {
            sobVar = new sob();
            sobVarArr[i] = sobVar;
        }
        sob sobVar2 = sobVar;
        sobVar2.c(i2, i3, i4, f, vnbVar);
        sobVar2.g = i5;
        sobVar2.i = porterDuffColorFilter;
        return sobVar2;
    }

    public static void O(RadioButton radioButton, int i, int i2, vnb vnbVar) {
        radioButton.b(aob.v0(i, vnbVar), aob.v0(i2, vnbVar));
        l(radioButton, 23, i, vnbVar);
        l(radioButton, 24, i2, vnbVar);
    }

    public static int P(int i, int i2, int i3, float f, vnb vnbVar) {
        int v0 = aob.v0(i, vnbVar);
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return v0;
                        }
                        return rnb.b(v0);
                    }
                    return aob.v(v0, aob.v0(i2, vnbVar));
                }
                return vm2.f(f, v0, aob.v0(i2, vnbVar));
            }
            return aob.p1(f, v0);
        }
        return vm2.o(v0, (int) f);
    }

    public static void Q(View view, hf0 hf0Var, uob uobVar, uob uobVar2) {
        R(view, hf0Var, uobVar, uobVar2, null);
    }

    public static void R(View view, Drawable drawable, uob uobVar, uob uobVar2, vnb vnbVar) {
        view.setBackground(drawable);
        j(view, drawable, uobVar, uobVar2, vnbVar);
    }

    public static void S(View view, sob sobVar, int i) {
        Drawable drawable;
        byte b2 = sobVar.l;
        boolean z = false;
        switch (b2) {
            case 1:
            case 2:
                if (view instanceof a) {
                    a aVar = (a) view;
                    if (b2 == 2) {
                        z = true;
                    }
                    aVar.H(i, z);
                    return;
                }
                return;
            case 3:
            case 4:
                if (view instanceof a) {
                    a aVar2 = (a) view;
                    if (b2 == 4) {
                        z = true;
                    }
                    aVar2.G(i, z);
                    return;
                }
                return;
            case 5:
                if (view instanceof a) {
                    ((a) view).setTitleColor(i);
                    return;
                }
                return;
            case 6:
                if (view instanceof a) {
                    ((a) view).setSubtitleColor(i);
                    return;
                }
                return;
            default:
                switch (b2) {
                    case 20:
                        if (view instanceof d79) {
                            ((d79) view).setSelectorDrawableColor(i);
                            return;
                        }
                        return;
                    case 21:
                        if (view instanceof RecyclerView) {
                            ((RecyclerView) view).setGlowColor(i);
                            return;
                        }
                        return;
                    case 22:
                        WeakReference weakReference = sobVar.j;
                        if (weakReference != null) {
                            drawable = (Drawable) weakReference.get();
                        } else {
                            drawable = null;
                        }
                        if (drawable != null && i != sobVar.g) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                            view.invalidate();
                            return;
                        }
                        return;
                    case 23:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setBackgroundColor(i);
                            return;
                        }
                        return;
                    case 24:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setCheckedColor(i);
                            return;
                        }
                        return;
                    default:
                        if (view instanceof EditTextBoldCursor) {
                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                            switch (b2) {
                                case 30:
                                    editTextBoldCursor.setCursorColor(i);
                                    return;
                                case 31:
                                    editTextBoldCursor.setLineColor(i);
                                    return;
                                case 32:
                                    editTextBoldCursor.setActiveLineColor(i);
                                    return;
                                case 33:
                                    editTextBoldCursor.setErrorLineColor(i);
                                    return;
                                case 34:
                                    editTextBoldCursor.setHintColor(i);
                                    return;
                                case 35:
                                    editTextBoldCursor.setHeaderHintColor(i);
                                    return;
                                case 36:
                                    editTextBoldCursor.setHandlesColor(i);
                                    return;
                                default:
                                    return;
                            }
                        }
                        return;
                }
        }
    }

    public static sob T(View view, int i, int i2, vnb vnbVar) {
        sob w = w(i, view);
        w.c(i2, -1, 0, 0.0f, vnbVar);
        w.n = null;
        w.o = null;
        w.m = true;
        return w;
    }

    public static void U(in inVar, int i, vnb vnbVar) {
        m(inVar, i, -1, 0, 0.0f, vnbVar);
    }

    public static void V(ema emaVar, int i) {
        W(emaVar, i, null);
    }

    public static void W(ema emaVar, int i, vnb vnbVar) {
        m(emaVar, i, -1, 0, 0.0f, vnbVar);
    }

    public static void X(TextView textView, int i, vnb vnbVar) {
        m(textView, i, -1, 0, 0.0f, vnbVar);
    }

    public static void Y(TextView textView, uob uobVar, vnb vnbVar) {
        m(textView, uobVar.a, uobVar.b, uobVar.c, uobVar.d, vnbVar);
    }

    public static void Z(View view, Context context, int i, int i2) {
        Drawable V0 = aob.V0(context, i, aob.v0(i2, null));
        view.setBackground(V0);
        if (V0 == null) {
            return;
        }
        sob T = T(view, 22, i2, null);
        T.j = new WeakReference(V0);
        T.g = aob.w0(null, i2, false);
    }

    public static void a(a aVar, int i, vnb vnbVar, boolean z) {
        int i2;
        if (z) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        l(aVar, i2, i, vnbVar);
    }

    public static void a0(android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yob.a0(android.view.View):void");
    }

    public static void b(a aVar, int i, vnb vnbVar, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        l(aVar, i2, i, vnbVar);
    }

    public static void b0(ActionBarLayout actionBarLayout, boolean z) {
        b++;
        xob L = L(z, 0, null);
        try {
            List j = hl.j();
            if (j == null) {
                j = new ArrayList();
            }
            for (int i = 0; i < j.size(); i++) {
                L.b((View) j.get(i));
            }
            L.b(actionBarLayout);
        } finally {
            L.a();
        }
    }

    public static void c(e85 e85Var, int i) {
        l(e85Var, 5, i, null);
    }

    public static void c0(FrameLayout frameLayout, boolean z) {
        xob L = L(z, 0, null);
        try {
            L.b(frameLayout);
        } finally {
            L.a();
        }
    }

    public static void d(a aVar, int i, vnb vnbVar) {
        l(aVar, 5, i, vnbVar);
    }

    public static uob e(int i) {
        return new uob(i, -1, 0.0f, 5);
    }

    public static void f(sob sobVar, HashSet hashSet) {
        hashSet.add(Integer.valueOf(sobVar.a));
        int i = sobVar.b;
        if (i >= 0) {
            hashSet.add(Integer.valueOf(i));
        }
    }

    public static uob g(int i, int i2) {
        return new uob(i, -1, i2, 1);
    }

    public static void h(int i, vnb vnbVar, View view) {
        int P = P(i, -1, 0, 0.0f, vnbVar);
        view.setBackgroundColor(P);
        N(view, 4, i, -1, 0, 0.0f, vnbVar, P, null);
    }

    public static void i(View view, uob uobVar, vnb vnbVar) {
        int i = uobVar.a;
        int i2 = uobVar.b;
        byte b2 = uobVar.c;
        float f = uobVar.d;
        int P = P(i, i2, b2, f, vnbVar);
        view.setBackgroundColor(P);
        N(view, 4, i, i2, b2, f, vnbVar, P, null);
    }

    public static void j(View view, Drawable drawable, uob uobVar, uob uobVar2, vnb vnbVar) {
        tob o = o(view, true);
        o.d = drawable;
        o.e = null;
        o.f = null;
        if (drawable != null) {
            if (uobVar != null) {
                sob sobVar = new sob();
                o.e = sobVar;
                sobVar.c(uobVar.a, uobVar.b, uobVar.c, uobVar.d, vnbVar);
                sobVar.g = t(drawable);
            }
            if (uobVar2 != null) {
                sob sobVar2 = new sob();
                o.f = sobVar2;
                sobVar2.c(uobVar2.a, uobVar2.b, uobVar2.c, uobVar2.d, vnbVar);
                sobVar2.g = sobVar2.b();
            }
        }
    }

    public static void k(View view, Drawable drawable, int i, int i2, int i3, float f, vnb vnbVar, PorterDuff.Mode mode) {
        int P = P(i, i2, i3, f, vnbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        boolean z = true;
        tob o = o(view, true);
        ArrayList arrayList = o.b;
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            o.b = arrayList;
        }
        sob sobVar = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sob sobVar2 = (sob) o.b.get(size);
            Drawable drawable2 = (Drawable) sobVar2.j.get();
            if (drawable2 == drawable) {
                sobVar = sobVar2;
            } else if (drawable2 == null || (!sobVar2.k && drawable2.getColorFilter() != sobVar2.i)) {
                o.b.remove(size);
            }
        }
        if (sobVar == null) {
            sobVar = new sob();
            sobVar.j = new WeakReference(drawable);
            o.b.add(sobVar);
        }
        sob sobVar3 = sobVar;
        sobVar3.c(i, i2, i3, f, vnbVar);
        sobVar3.g = P;
        sobVar3.i = porterDuffColorFilter;
        sobVar3.h = mode;
        if (drawable.getColorFilter() == porterDuffColorFilter) {
            z = false;
        }
        sobVar3.k = z;
    }

    public static void l(View view, int i, int i2, vnb vnbVar) {
        sob T = T(view, i, i2, vnbVar);
        int b2 = T.b();
        S(view, T, b2);
        T.g = b2;
    }

    public static void m(View view, int i, int i2, int i3, float f, vnb vnbVar) {
        int P = P(i, i2, i3, f, vnbVar);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(P);
        } else if (view instanceof ema) {
            ((ema) view).setTextColor(P);
        } else {
            ((in) view).setTextColor(P);
        }
        N(view, 0, i, i2, i3, f, vnbVar, P, null);
    }

    public static void n(TextView textView, int i, int i2, int i3, int i4, float f, vnb vnbVar) {
        int P = P(i2, i3, i4, f, vnbVar);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    textView.setHighlightColor(P);
                }
            } else {
                textView.setLinkTextColor(P);
            }
        } else {
            textView.setHintTextColor(P);
        }
        N(textView, i, i2, i3, i4, f, vnbVar, P, null);
    }

    public static tob o(View view, boolean z) {
        Object tag = view.getTag(2131296711);
        if (tag instanceof tob) {
            return (tob) tag;
        }
        if (!z) {
            return null;
        }
        tob tobVar = new tob();
        view.setTag(2131296711, tobVar);
        return tobVar;
    }

    public static uob p(int i, int i2) {
        return new uob(i, i2, 0.0f, 4);
    }

    public static void q(View view) {
        if (view != null) {
            view.setTag(2131296711, null);
        }
    }

    public static HashSet r() {
        HashSet hashSet = new HashSet();
        xob L = L(true, 1, hashSet);
        try {
            List j = hl.j();
            if (j == null) {
                j = new ArrayList();
            }
            for (int i = 0; i < j.size(); i++) {
                L.b((View) j.get(i));
            }
            return hashSet;
        } finally {
            L.a();
        }
    }

    public static void s(ImageView imageView, int i, vnb vnbVar, PorterDuff.Mode mode) {
        int P = P(i, -1, 0, 0.0f, vnbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        N(imageView, 5, i, -1, 0, 0.0f, vnbVar, P, porterDuffColorFilter).h = mode;
    }

    public static int t(Drawable drawable) {
        if (drawable instanceof InsetDrawable) {
            drawable = ((InsetDrawable) drawable).getDrawable();
        }
        if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334) {
                drawable = rippleDrawable.getDrawable(0);
            } else {
                drawable = null;
            }
        }
        if (drawable instanceof ShapeDrawable) {
            return ((ShapeDrawable) drawable).getPaint().getColor();
        }
        if (!(drawable instanceof ColorDrawable)) {
            return 0;
        }
        return ((ColorDrawable) drawable).getColor();
    }

    public static void u(EditTextBoldCursor editTextBoldCursor, int i) {
        v(editTextBoldCursor, i, null);
    }

    public static void v(EditTextBoldCursor editTextBoldCursor, int i, vnb vnbVar) {
        l(editTextBoldCursor, 30, i, vnbVar);
    }

    public static sob w(int i, View view) {
        tob o = o(view, true);
        if (o.c == null) {
            o.c = new ArrayList(2);
        }
        for (int i2 = 0; i2 < o.c.size(); i2++) {
            if (((sob) o.c.get(i2)).l == i) {
                return (sob) o.c.get(i2);
            }
        }
        sob sobVar = new sob();
        sobVar.l = i;
        o.c.add(sobVar);
        return sobVar;
    }

    public static void x(View view, Drawable drawable, int i, vnb vnbVar, PorterDuff.Mode mode) {
        k(view, drawable, i, -1, 0, 0.0f, vnbVar, mode);
    }

    public static void y(EditTextBoldCursor editTextBoldCursor, int i, vnb vnbVar) {
        l(editTextBoldCursor, 36, i, vnbVar);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i, vnb vnbVar) {
        l(editTextBoldCursor, 35, i, vnbVar);
    }
}
