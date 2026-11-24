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
public abstract class anb {
    public static final zmb a = new zmb();
    public static int b = 1;
    public static long c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i, ylb ylbVar) {
        l(editTextBoldCursor, 34, i, ylbVar);
    }

    public static void B(View view, Drawable drawable, wmb wmbVar, ylb ylbVar) {
        view.setBackground(drawable);
        j(view, drawable, wmbVar, null, ylbVar);
    }

    public static void C(TextView textView, int i, ylb ylbVar) {
        n(textView, 3, i, -1, 0, 0.0f, ylbVar);
    }

    public static void D(TextView textView, int i, ylb ylbVar) {
        n(textView, 1, i, -1, 0, 0.0f, ylbVar);
    }

    public static void E(EditTextBoldCursor editTextBoldCursor, int i) {
        D(editTextBoldCursor, i, null);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i, int i2, int i3, ylb ylbVar) {
        editTextBoldCursor.u(cmb.v0(i, ylbVar), cmb.v0(i2, ylbVar), cmb.v0(i3, ylbVar));
        T(editTextBoldCursor, 31, i, ylbVar).g = editTextBoldCursor.getLineColor();
        T(editTextBoldCursor, 32, i2, ylbVar).g = editTextBoldCursor.getActiveLineColor();
        T(editTextBoldCursor, 33, i3, ylbVar).g = editTextBoldCursor.getErrorLineColor();
    }

    public static void G(TextView textView, int i, ylb ylbVar) {
        n(textView, 2, i, -1, 0, 0.0f, ylbVar);
    }

    public static void H(RecyclerView recyclerView, int i, ylb ylbVar) {
        l(recyclerView, 21, i, ylbVar);
    }

    public static void I(int i, p85 p85Var) {
        l(p85Var, 20, i, null);
    }

    public static void J(r59 r59Var, int i, ylb ylbVar) {
        l(r59Var, 20, i, ylbVar);
    }

    public static wmb K(float f, int i) {
        return new wmb(i, -1, f, 2);
    }

    public static zmb L(boolean z, int i, HashSet hashSet) {
        zmb zmbVar = a;
        if (zmbVar.e) {
            zmbVar = new zmb();
        }
        zmbVar.e = true;
        zmbVar.b = z;
        zmbVar.c = i;
        zmbVar.d = hashSet;
        zmbVar.a.clear();
        return zmbVar;
    }

    public static wmb M(int i) {
        return new wmb(i, -1, 0.0f, 0);
    }

    public static umb N(View view, int i, int i2, int i3, int i4, float f, ylb ylbVar, int i5, PorterDuffColorFilter porterDuffColorFilter) {
        umb[] umbVarArr = o(view, true).a;
        umb umbVar = umbVarArr[i];
        if (umbVar == null) {
            umbVar = new umb();
            umbVarArr[i] = umbVar;
        }
        umb umbVar2 = umbVar;
        umbVar2.c(i2, i3, i4, f, ylbVar);
        umbVar2.g = i5;
        umbVar2.i = porterDuffColorFilter;
        return umbVar2;
    }

    public static void O(RadioButton radioButton, int i, int i2, ylb ylbVar) {
        radioButton.b(cmb.v0(i, ylbVar), cmb.v0(i2, ylbVar));
        l(radioButton, 23, i, ylbVar);
        l(radioButton, 24, i2, ylbVar);
    }

    public static int P(int i, int i2, int i3, float f, ylb ylbVar) {
        int v0 = cmb.v0(i, ylbVar);
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return v0;
                        }
                        return ulb.b(v0);
                    }
                    return cmb.v(v0, cmb.v0(i2, ylbVar));
                }
                return on2.f(f, v0, cmb.v0(i2, ylbVar));
            }
            return cmb.p1(f, v0);
        }
        return on2.p(v0, (int) f);
    }

    public static void Q(View view, fg0 fg0Var, wmb wmbVar, wmb wmbVar2) {
        R(view, fg0Var, wmbVar, wmbVar2, null);
    }

    public static void R(View view, Drawable drawable, wmb wmbVar, wmb wmbVar2, ylb ylbVar) {
        view.setBackground(drawable);
        j(view, drawable, wmbVar, wmbVar2, ylbVar);
    }

    public static void S(View view, umb umbVar, int i) {
        Drawable drawable;
        byte b2 = umbVar.l;
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
                        if (view instanceof r59) {
                            ((r59) view).setSelectorDrawableColor(i);
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
                        WeakReference weakReference = umbVar.j;
                        if (weakReference != null) {
                            drawable = (Drawable) weakReference.get();
                        } else {
                            drawable = null;
                        }
                        if (drawable != null && i != umbVar.g) {
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

    public static umb T(View view, int i, int i2, ylb ylbVar) {
        umb w = w(i, view);
        w.c(i2, -1, 0, 0.0f, ylbVar);
        w.n = null;
        w.o = null;
        w.m = true;
        return w;
    }

    public static void U(io ioVar, int i, ylb ylbVar) {
        m(ioVar, i, -1, 0, 0.0f, ylbVar);
    }

    public static void V(lka lkaVar, int i) {
        W(lkaVar, i, null);
    }

    public static void W(lka lkaVar, int i, ylb ylbVar) {
        m(lkaVar, i, -1, 0, 0.0f, ylbVar);
    }

    public static void X(TextView textView, int i, ylb ylbVar) {
        m(textView, i, -1, 0, 0.0f, ylbVar);
    }

    public static void Y(TextView textView, wmb wmbVar, ylb ylbVar) {
        m(textView, wmbVar.a, wmbVar.b, wmbVar.c, wmbVar.d, ylbVar);
    }

    public static void Z(View view, Context context, int i, int i2) {
        Drawable V0 = cmb.V0(context, i, cmb.v0(i2, null));
        view.setBackground(V0);
        if (V0 == null) {
            return;
        }
        umb T = T(view, 22, i2, null);
        T.j = new WeakReference(V0);
        T.g = cmb.w0(null, i2, false);
    }

    public static void a(a aVar, int i, ylb ylbVar, boolean z) {
        int i2;
        if (z) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        l(aVar, i2, i, ylbVar);
    }

    public static void a0(android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anb.a0(android.view.View):void");
    }

    public static void b(a aVar, int i, ylb ylbVar, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        l(aVar, i2, i, ylbVar);
    }

    public static void b0(ActionBarLayout actionBarLayout, boolean z) {
        b++;
        zmb L = L(z, 0, null);
        try {
            List j = gm.j();
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

    public static void c(a85 a85Var, int i) {
        l(a85Var, 5, i, null);
    }

    public static void c0(FrameLayout frameLayout, boolean z) {
        zmb L = L(z, 0, null);
        try {
            L.b(frameLayout);
        } finally {
            L.a();
        }
    }

    public static void d(a aVar, int i, ylb ylbVar) {
        l(aVar, 5, i, ylbVar);
    }

    public static wmb e(int i) {
        return new wmb(i, -1, 0.0f, 5);
    }

    public static void f(umb umbVar, HashSet hashSet) {
        hashSet.add(Integer.valueOf(umbVar.a));
        int i = umbVar.b;
        if (i >= 0) {
            hashSet.add(Integer.valueOf(i));
        }
    }

    public static wmb g(int i, int i2) {
        return new wmb(i, -1, i2, 1);
    }

    public static void h(int i, ylb ylbVar, View view) {
        int P = P(i, -1, 0, 0.0f, ylbVar);
        view.setBackgroundColor(P);
        N(view, 4, i, -1, 0, 0.0f, ylbVar, P, null);
    }

    public static void i(View view, wmb wmbVar, ylb ylbVar) {
        int i = wmbVar.a;
        int i2 = wmbVar.b;
        byte b2 = wmbVar.c;
        float f = wmbVar.d;
        int P = P(i, i2, b2, f, ylbVar);
        view.setBackgroundColor(P);
        N(view, 4, i, i2, b2, f, ylbVar, P, null);
    }

    public static void j(View view, Drawable drawable, wmb wmbVar, wmb wmbVar2, ylb ylbVar) {
        vmb o = o(view, true);
        o.d = drawable;
        o.e = null;
        o.f = null;
        if (drawable != null) {
            if (wmbVar != null) {
                umb umbVar = new umb();
                o.e = umbVar;
                umbVar.c(wmbVar.a, wmbVar.b, wmbVar.c, wmbVar.d, ylbVar);
                umbVar.g = t(drawable);
            }
            if (wmbVar2 != null) {
                umb umbVar2 = new umb();
                o.f = umbVar2;
                umbVar2.c(wmbVar2.a, wmbVar2.b, wmbVar2.c, wmbVar2.d, ylbVar);
                umbVar2.g = umbVar2.b();
            }
        }
    }

    public static void k(View view, Drawable drawable, int i, int i2, int i3, float f, ylb ylbVar, PorterDuff.Mode mode) {
        int P = P(i, i2, i3, f, ylbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        boolean z = true;
        vmb o = o(view, true);
        ArrayList arrayList = o.b;
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            o.b = arrayList;
        }
        umb umbVar = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            umb umbVar2 = (umb) o.b.get(size);
            Drawable drawable2 = (Drawable) umbVar2.j.get();
            if (drawable2 == drawable) {
                umbVar = umbVar2;
            } else if (drawable2 == null || (!umbVar2.k && drawable2.getColorFilter() != umbVar2.i)) {
                o.b.remove(size);
            }
        }
        if (umbVar == null) {
            umbVar = new umb();
            umbVar.j = new WeakReference(drawable);
            o.b.add(umbVar);
        }
        umb umbVar3 = umbVar;
        umbVar3.c(i, i2, i3, f, ylbVar);
        umbVar3.g = P;
        umbVar3.i = porterDuffColorFilter;
        umbVar3.h = mode;
        if (drawable.getColorFilter() == porterDuffColorFilter) {
            z = false;
        }
        umbVar3.k = z;
    }

    public static void l(View view, int i, int i2, ylb ylbVar) {
        umb T = T(view, i, i2, ylbVar);
        int b2 = T.b();
        S(view, T, b2);
        T.g = b2;
    }

    public static void m(View view, int i, int i2, int i3, float f, ylb ylbVar) {
        int P = P(i, i2, i3, f, ylbVar);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(P);
        } else if (view instanceof lka) {
            ((lka) view).setTextColor(P);
        } else {
            ((io) view).setTextColor(P);
        }
        N(view, 0, i, i2, i3, f, ylbVar, P, null);
    }

    public static void n(TextView textView, int i, int i2, int i3, int i4, float f, ylb ylbVar) {
        int P = P(i2, i3, i4, f, ylbVar);
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
        N(textView, i, i2, i3, i4, f, ylbVar, P, null);
    }

    public static vmb o(View view, boolean z) {
        Object tag = view.getTag(2131296711);
        if (tag instanceof vmb) {
            return (vmb) tag;
        }
        if (!z) {
            return null;
        }
        vmb vmbVar = new vmb();
        view.setTag(2131296711, vmbVar);
        return vmbVar;
    }

    public static wmb p(int i, int i2) {
        return new wmb(i, i2, 0.0f, 4);
    }

    public static void q(View view) {
        if (view != null) {
            view.setTag(2131296711, null);
        }
    }

    public static HashSet r() {
        HashSet hashSet = new HashSet();
        zmb L = L(true, 1, hashSet);
        try {
            List j = gm.j();
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

    public static void s(ImageView imageView, int i, ylb ylbVar, PorterDuff.Mode mode) {
        int P = P(i, -1, 0, 0.0f, ylbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        N(imageView, 5, i, -1, 0, 0.0f, ylbVar, P, porterDuffColorFilter).h = mode;
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

    public static void v(EditTextBoldCursor editTextBoldCursor, int i, ylb ylbVar) {
        l(editTextBoldCursor, 30, i, ylbVar);
    }

    public static umb w(int i, View view) {
        vmb o = o(view, true);
        if (o.c == null) {
            o.c = new ArrayList(2);
        }
        for (int i2 = 0; i2 < o.c.size(); i2++) {
            if (((umb) o.c.get(i2)).l == i) {
                return (umb) o.c.get(i2);
            }
        }
        umb umbVar = new umb();
        umbVar.l = i;
        o.c.add(umbVar);
        return umbVar;
    }

    public static void x(View view, Drawable drawable, int i, ylb ylbVar, PorterDuff.Mode mode) {
        k(view, drawable, i, -1, 0, 0.0f, ylbVar, mode);
    }

    public static void y(EditTextBoldCursor editTextBoldCursor, int i, ylb ylbVar) {
        l(editTextBoldCursor, 36, i, ylbVar);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i, ylb ylbVar) {
        l(editTextBoldCursor, 35, i, ylbVar);
    }
}
