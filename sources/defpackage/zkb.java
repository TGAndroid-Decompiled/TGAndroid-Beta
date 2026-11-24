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
public abstract class zkb {
    public static final ykb a = new ykb();
    public static int b = 1;
    public static long c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i, wjb wjbVar) {
        l(editTextBoldCursor, 34, i, wjbVar);
    }

    public static void B(View view, Drawable drawable, vkb vkbVar, wjb wjbVar) {
        view.setBackground(drawable);
        j(view, drawable, vkbVar, null, wjbVar);
    }

    public static void C(TextView textView, int i, wjb wjbVar) {
        n(textView, 3, i, -1, 0, 0.0f, wjbVar);
    }

    public static void D(TextView textView, int i, wjb wjbVar) {
        n(textView, 1, i, -1, 0, 0.0f, wjbVar);
    }

    public static void E(EditTextBoldCursor editTextBoldCursor, int i) {
        D(editTextBoldCursor, i, null);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i, int i2, int i3, wjb wjbVar) {
        editTextBoldCursor.u(bkb.v0(i, wjbVar), bkb.v0(i2, wjbVar), bkb.v0(i3, wjbVar));
        T(editTextBoldCursor, 31, i, wjbVar).g = editTextBoldCursor.getLineColor();
        T(editTextBoldCursor, 32, i2, wjbVar).g = editTextBoldCursor.getActiveLineColor();
        T(editTextBoldCursor, 33, i3, wjbVar).g = editTextBoldCursor.getErrorLineColor();
    }

    public static void G(TextView textView, int i, wjb wjbVar) {
        n(textView, 2, i, -1, 0, 0.0f, wjbVar);
    }

    public static void H(RecyclerView recyclerView, int i, wjb wjbVar) {
        l(recyclerView, 21, i, wjbVar);
    }

    public static void I(int i, r65 r65Var) {
        l(r65Var, 20, i, null);
    }

    public static void J(o39 o39Var, int i, wjb wjbVar) {
        l(o39Var, 20, i, wjbVar);
    }

    public static vkb K(float f, int i) {
        return new vkb(i, -1, f, 2);
    }

    public static ykb L(boolean z, int i, HashSet hashSet) {
        ykb ykbVar = a;
        if (ykbVar.e) {
            ykbVar = new ykb();
        }
        ykbVar.e = true;
        ykbVar.b = z;
        ykbVar.c = i;
        ykbVar.d = hashSet;
        ykbVar.a.clear();
        return ykbVar;
    }

    public static vkb M(int i) {
        return new vkb(i, -1, 0.0f, 0);
    }

    public static tkb N(View view, int i, int i2, int i3, int i4, float f, wjb wjbVar, int i5, PorterDuffColorFilter porterDuffColorFilter) {
        tkb[] tkbVarArr = o(view, true).a;
        tkb tkbVar = tkbVarArr[i];
        if (tkbVar == null) {
            tkbVar = new tkb();
            tkbVarArr[i] = tkbVar;
        }
        tkb tkbVar2 = tkbVar;
        tkbVar2.c(i2, i3, i4, f, wjbVar);
        tkbVar2.g = i5;
        tkbVar2.i = porterDuffColorFilter;
        return tkbVar2;
    }

    public static void O(RadioButton radioButton, int i, int i2, wjb wjbVar) {
        radioButton.b(bkb.v0(i, wjbVar), bkb.v0(i2, wjbVar));
        l(radioButton, 23, i, wjbVar);
        l(radioButton, 24, i2, wjbVar);
    }

    public static int P(int i, int i2, int i3, float f, wjb wjbVar) {
        int v0 = bkb.v0(i, wjbVar);
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return v0;
                        }
                        return sjb.b(v0);
                    }
                    return bkb.v(v0, bkb.v0(i2, wjbVar));
                }
                return bm2.f(f, v0, bkb.v0(i2, wjbVar));
            }
            return bkb.p1(f, v0);
        }
        return bm2.o(v0, (int) f);
    }

    public static void Q(View view, ff0 ff0Var, vkb vkbVar, vkb vkbVar2) {
        R(view, ff0Var, vkbVar, vkbVar2, null);
    }

    public static void R(View view, Drawable drawable, vkb vkbVar, vkb vkbVar2, wjb wjbVar) {
        view.setBackground(drawable);
        j(view, drawable, vkbVar, vkbVar2, wjbVar);
    }

    public static void S(View view, tkb tkbVar, int i) {
        Drawable drawable;
        byte b2 = tkbVar.l;
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
                        if (view instanceof o39) {
                            ((o39) view).setSelectorDrawableColor(i);
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
                        WeakReference weakReference = tkbVar.j;
                        if (weakReference != null) {
                            drawable = (Drawable) weakReference.get();
                        } else {
                            drawable = null;
                        }
                        if (drawable != null && i != tkbVar.g) {
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

    public static tkb T(View view, int i, int i2, wjb wjbVar) {
        tkb w = w(i, view);
        w.c(i2, -1, 0, 0.0f, wjbVar);
        w.n = null;
        w.o = null;
        w.m = true;
        return w;
    }

    public static void U(hn hnVar, int i, wjb wjbVar) {
        m(hnVar, i, -1, 0, 0.0f, wjbVar);
    }

    public static void V(jia jiaVar, int i) {
        W(jiaVar, i, null);
    }

    public static void W(jia jiaVar, int i, wjb wjbVar) {
        m(jiaVar, i, -1, 0, 0.0f, wjbVar);
    }

    public static void X(TextView textView, int i, wjb wjbVar) {
        m(textView, i, -1, 0, 0.0f, wjbVar);
    }

    public static void Y(TextView textView, vkb vkbVar, wjb wjbVar) {
        m(textView, vkbVar.a, vkbVar.b, vkbVar.c, vkbVar.d, wjbVar);
    }

    public static void Z(View view, Context context, int i, int i2) {
        Drawable V0 = bkb.V0(context, i, bkb.v0(i2, null));
        view.setBackground(V0);
        if (V0 == null) {
            return;
        }
        tkb T = T(view, 22, i2, null);
        T.j = new WeakReference(V0);
        T.g = bkb.w0(null, i2, false);
    }

    public static void a(a aVar, int i, wjb wjbVar, boolean z) {
        int i2;
        if (z) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        l(aVar, i2, i, wjbVar);
    }

    public static void a0(android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkb.a0(android.view.View):void");
    }

    public static void b(a aVar, int i, wjb wjbVar, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        l(aVar, i2, i, wjbVar);
    }

    public static void b0(ActionBarLayout actionBarLayout, boolean z) {
        b++;
        ykb L = L(z, 0, null);
        try {
            List j = gl.j();
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

    public static void c(c65 c65Var, int i) {
        l(c65Var, 5, i, null);
    }

    public static void c0(FrameLayout frameLayout, boolean z) {
        ykb L = L(z, 0, null);
        try {
            L.b(frameLayout);
        } finally {
            L.a();
        }
    }

    public static void d(a aVar, int i, wjb wjbVar) {
        l(aVar, 5, i, wjbVar);
    }

    public static vkb e(int i) {
        return new vkb(i, -1, 0.0f, 5);
    }

    public static void f(tkb tkbVar, HashSet hashSet) {
        hashSet.add(Integer.valueOf(tkbVar.a));
        int i = tkbVar.b;
        if (i >= 0) {
            hashSet.add(Integer.valueOf(i));
        }
    }

    public static vkb g(int i, int i2) {
        return new vkb(i, -1, i2, 1);
    }

    public static void h(int i, wjb wjbVar, View view) {
        int P = P(i, -1, 0, 0.0f, wjbVar);
        view.setBackgroundColor(P);
        N(view, 4, i, -1, 0, 0.0f, wjbVar, P, null);
    }

    public static void i(View view, vkb vkbVar, wjb wjbVar) {
        int i = vkbVar.a;
        int i2 = vkbVar.b;
        byte b2 = vkbVar.c;
        float f = vkbVar.d;
        int P = P(i, i2, b2, f, wjbVar);
        view.setBackgroundColor(P);
        N(view, 4, i, i2, b2, f, wjbVar, P, null);
    }

    public static void j(View view, Drawable drawable, vkb vkbVar, vkb vkbVar2, wjb wjbVar) {
        ukb o = o(view, true);
        o.d = drawable;
        o.e = null;
        o.f = null;
        if (drawable != null) {
            if (vkbVar != null) {
                tkb tkbVar = new tkb();
                o.e = tkbVar;
                tkbVar.c(vkbVar.a, vkbVar.b, vkbVar.c, vkbVar.d, wjbVar);
                tkbVar.g = t(drawable);
            }
            if (vkbVar2 != null) {
                tkb tkbVar2 = new tkb();
                o.f = tkbVar2;
                tkbVar2.c(vkbVar2.a, vkbVar2.b, vkbVar2.c, vkbVar2.d, wjbVar);
                tkbVar2.g = tkbVar2.b();
            }
        }
    }

    public static void k(View view, Drawable drawable, int i, int i2, int i3, float f, wjb wjbVar, PorterDuff.Mode mode) {
        int P = P(i, i2, i3, f, wjbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        boolean z = true;
        ukb o = o(view, true);
        ArrayList arrayList = o.b;
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            o.b = arrayList;
        }
        tkb tkbVar = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            tkb tkbVar2 = (tkb) o.b.get(size);
            Drawable drawable2 = (Drawable) tkbVar2.j.get();
            if (drawable2 == drawable) {
                tkbVar = tkbVar2;
            } else if (drawable2 == null || (!tkbVar2.k && drawable2.getColorFilter() != tkbVar2.i)) {
                o.b.remove(size);
            }
        }
        if (tkbVar == null) {
            tkbVar = new tkb();
            tkbVar.j = new WeakReference(drawable);
            o.b.add(tkbVar);
        }
        tkb tkbVar3 = tkbVar;
        tkbVar3.c(i, i2, i3, f, wjbVar);
        tkbVar3.g = P;
        tkbVar3.i = porterDuffColorFilter;
        tkbVar3.h = mode;
        if (drawable.getColorFilter() == porterDuffColorFilter) {
            z = false;
        }
        tkbVar3.k = z;
    }

    public static void l(View view, int i, int i2, wjb wjbVar) {
        tkb T = T(view, i, i2, wjbVar);
        int b2 = T.b();
        S(view, T, b2);
        T.g = b2;
    }

    public static void m(View view, int i, int i2, int i3, float f, wjb wjbVar) {
        int P = P(i, i2, i3, f, wjbVar);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(P);
        } else if (view instanceof jia) {
            ((jia) view).setTextColor(P);
        } else {
            ((hn) view).setTextColor(P);
        }
        N(view, 0, i, i2, i3, f, wjbVar, P, null);
    }

    public static void n(TextView textView, int i, int i2, int i3, int i4, float f, wjb wjbVar) {
        int P = P(i2, i3, i4, f, wjbVar);
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
        N(textView, i, i2, i3, i4, f, wjbVar, P, null);
    }

    public static ukb o(View view, boolean z) {
        Object tag = view.getTag(2131296711);
        if (tag instanceof ukb) {
            return (ukb) tag;
        }
        if (!z) {
            return null;
        }
        ukb ukbVar = new ukb();
        view.setTag(2131296711, ukbVar);
        return ukbVar;
    }

    public static vkb p(int i, int i2) {
        return new vkb(i, i2, 0.0f, 4);
    }

    public static void q(View view) {
        if (view != null) {
            view.setTag(2131296711, null);
        }
    }

    public static HashSet r() {
        HashSet hashSet = new HashSet();
        ykb L = L(true, 1, hashSet);
        try {
            List j = gl.j();
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

    public static void s(ImageView imageView, int i, wjb wjbVar, PorterDuff.Mode mode) {
        int P = P(i, -1, 0, 0.0f, wjbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        N(imageView, 5, i, -1, 0, 0.0f, wjbVar, P, porterDuffColorFilter).h = mode;
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

    public static void v(EditTextBoldCursor editTextBoldCursor, int i, wjb wjbVar) {
        l(editTextBoldCursor, 30, i, wjbVar);
    }

    public static tkb w(int i, View view) {
        ukb o = o(view, true);
        if (o.c == null) {
            o.c = new ArrayList(2);
        }
        for (int i2 = 0; i2 < o.c.size(); i2++) {
            if (((tkb) o.c.get(i2)).l == i) {
                return (tkb) o.c.get(i2);
            }
        }
        tkb tkbVar = new tkb();
        tkbVar.l = i;
        o.c.add(tkbVar);
        return tkbVar;
    }

    public static void x(View view, Drawable drawable, int i, wjb wjbVar, PorterDuff.Mode mode) {
        k(view, drawable, i, -1, 0, 0.0f, wjbVar, mode);
    }

    public static void y(EditTextBoldCursor editTextBoldCursor, int i, wjb wjbVar) {
        l(editTextBoldCursor, 36, i, wjbVar);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i, wjb wjbVar) {
        l(editTextBoldCursor, 35, i, wjbVar);
    }
}
