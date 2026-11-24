package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
public final class dn0 extends n7c {
    public cb f;
    public final ut h;
    public final xt n;
    public r7 r;
    public r7 s;
    public String w;
    public NumberTextView x;
    public final cb e = new cb(null, this.currentAccount, new zm0(this, (byte) 0));
    public final HashSet y = new HashSet();
    public final HashSet E = new HashSet();

    public dn0(ut utVar, xt xtVar) {
        this.h = utVar;
        this.n = xtVar;
    }

    public static boolean k0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !hg9.s(" ", lowerCase2, lowerCase) && !hg9.s(".", lowerCase2, lowerCase)) {
            String I3 = gm.I3(lowerCase);
            String I32 = gm.I3(lowerCase2);
            if (!I3.startsWith(I32) && !I3.contains(" ".concat(I32)) && !I3.contains(".".concat(I32))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.E;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.w);
        cb cbVar = this.e;
        if (isEmpty) {
            ArrayList arrayList2 = cbVar.a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                k47 k47Var = (k47) obj;
                String a = eb.a(k47Var);
                if (!TextUtils.isEmpty(a) && !a.startsWith("#") && !a.startsWith("$") && !a.startsWith("@")) {
                    hashSet.add(a);
                    int i2 = ab.b;
                    c6c K = c6c.K(ab.class);
                    K.A = 3;
                    K.r = false;
                    K.I = k47Var;
                    K.L(i0(k47Var));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!cbVar.f) {
                arrayList.add(c6c.q(arrayList.size(), 32));
                arrayList.add(c6c.q(arrayList.size(), 32));
                arrayList.add(c6c.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = cbVar.a;
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                k47 k47Var2 = (k47) obj2;
                String a2 = eb.a(k47Var2);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    String J0 = gm.J0(a2, true);
                    ivc b = x84.c().b(J0);
                    TLRPC.Message message = k47Var2.k;
                    if (message != null && (messageMedia = message.media) != null) {
                        webPage = messageMedia.webpage;
                    } else {
                        webPage = null;
                    }
                    if (webPage != null && !TextUtils.isEmpty(webPage.site_name)) {
                        str = webPage.site_name;
                    } else if (b != null && !TextUtils.isEmpty(b.d)) {
                        str = b.d;
                    } else {
                        str = null;
                    }
                    if (webPage != null && !TextUtils.isEmpty(webPage.title)) {
                        str2 = webPage.title;
                    } else {
                        str2 = null;
                    }
                    if (k0(J0, this.w) || k0(str, this.w) || k0(str2, this.w)) {
                        String str3 = this.w;
                        int i4 = ab.b;
                        c6c K2 = c6c.K(ab.class);
                        K2.A = 3;
                        K2.r = false;
                        K2.I = k47Var2;
                        K2.n = str3;
                        K2.L(i0(k47Var2));
                        arrayList.add(K2);
                    }
                }
            }
            ArrayList arrayList4 = this.f.a;
            int size3 = arrayList4.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList4.get(i5);
                i5++;
                k47 k47Var3 = (k47) obj3;
                String a3 = eb.a(k47Var3);
                if (!TextUtils.isEmpty(a3) && !a3.startsWith("#") && !a3.startsWith("$") && !a3.startsWith("@")) {
                    hashSet.add(a3);
                    String str4 = this.w;
                    int i6 = ab.b;
                    c6c K3 = c6c.K(ab.class);
                    K3.A = 3;
                    K3.r = false;
                    K3.I = k47Var3;
                    K3.n = str4;
                    K3.L(i0(k47Var3));
                    arrayList.add(K3);
                }
            }
            if (!this.f.f) {
                arrayList.add(c6c.q(arrayList.size(), 32));
                arrayList.add(c6c.q(arrayList.size(), 32));
                arrayList.add(c6c.q(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(c6c.C(charSequence));
        }
    }

    @Override
    public final CharSequence a0() {
        return jb6.M0(2131742602, null);
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
        if (c6cVar.H(ab.class)) {
            if (this.actionBar.y()) {
                g0(c6cVar, view);
                return;
            }
            finishFragment();
            this.n.a(eb.a((k47) c6cVar.I));
        }
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
        if (c6cVar.H(ab.class)) {
            g0(c6cVar, view);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        a aVar = this.actionBar;
        int i = cmb.c6;
        anb.h(i, getResourceProvider(), aVar);
        this.actionBar.setActionModeColor(cmb.w0(null, i, false));
        this.actionBar.setBackButtonImage(2131231244);
        a aVar2 = this.actionBar;
        int i2 = cmb.F6;
        anb.l(aVar2, 5, i2, getResourceProvider());
        anb.l(this.actionBar, 3, cmb.y8, getResourceProvider());
        anb.l(this.actionBar, 1, i2, getResourceProvider());
        anb.b(this.actionBar, i2, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 7));
        r6 q = this.actionBar.q(null);
        NumberTextView numberTextView = new NumberTextView(q.getContext());
        this.x = numberTextView;
        numberTextView.setTextSize(18);
        this.x.setTypeface(gm.o());
        this.x.setTextColor(getThemedColor(cmb.x8));
        this.x.setOnTouchListener(new p8((byte) 16));
        q.addView(this.x, qoe.m(1.0f, 0, -1, 65, 0, 0));
        this.s = q.h(2131296500, 2131232230, gm.L(54.0f), jb6.M0(2131754877, null));
        q.h(2131296496, 2131232114, gm.L(54.0f), jb6.M0(2131751535, null));
        r7 b = this.actionBar.t().b(0, 2131232503, getResourceProvider());
        b.N();
        b.I = new cn0(this);
        this.r = b;
        b.setSearchFieldHint(jb6.M0(2131745570, null));
        this.r.setContentDescription(jb6.M0(2131745570, null));
        EditTextBoldCursor searchField = this.r.getSearchField();
        anb.X(searchField, i2, getResourceProvider());
        anb.D(searchField, cmb.Ij, getResourceProvider());
        anb.v(searchField, i2, getResourceProvider());
        this.a.j(new y(this, (byte) 7));
        a1b a1bVar = new a1b(context, null, 1, null);
        a1bVar.d.setText(jb6.M0(2131742582, null));
        a1bVar.e.setVisibility(8);
        a1bVar.e(false, false);
        a1bVar.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(a1bVar, qoe.c(-1.0f, -1));
        this.a.setEmptyView(a1bVar);
        return this.fragmentView;
    }

    public final void g0(c6c c6cVar, View view) {
        bb bbVar = (bb) view;
        k47 k47Var = (k47) c6cVar.I;
        boolean i0 = i0(k47Var);
        HashSet hashSet = this.y;
        boolean z = false;
        if (i0) {
            if (k47Var != null) {
                hashSet.remove(Integer.valueOf(k47Var.e1()));
            }
            bbVar.setChecked(false);
        } else {
            if (k47Var != null) {
                hashSet.add(Integer.valueOf(k47Var.e1()));
            }
            bbVar.setChecked(true);
        }
        this.x.a(hashSet.size(), true);
        boolean isEmpty = hashSet.isEmpty();
        a aVar = this.actionBar;
        if (isEmpty) {
            aVar.x();
        } else {
            aVar.R(null, null);
        }
        r7 r7Var = this.s;
        if (hashSet.size() == 1) {
            z = true;
        }
        gm.P3(r7Var, z, true);
    }

    public final void h0() {
        HashSet hashSet = this.y;
        if (hashSet.size() != 1) {
            return;
        }
        long e = z8c.h(this.currentAccount).e();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        ut utVar = this.h;
        if (utVar != null) {
            utVar.run();
        }
        gm.d3(new an0(e, intValue, (byte) 0), 80L);
    }

    public final boolean i0(k47 k47Var) {
        if (k47Var != null) {
            if (this.y.contains(Integer.valueOf(k47Var.e1()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (gm.B(getThemedColor(cmb.c6)) > 0.721f) {
            return true;
        }
        return false;
    }

    public final void j0(HashSet hashSet) {
        oc7.r1(this.currentAccount).V(new ArrayList(hashSet), null, null, z8c.h(this.currentAccount).e(), 0, true, 0);
        this.e.b(new ArrayList(hashSet));
        cb cbVar = this.f;
        if (cbVar != null) {
            cbVar.b(new ArrayList(hashSet));
        }
        this.y.clear();
        this.actionBar.x();
        this.a.g3.O(true);
    }

    public final void l0() {
        int i;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 < this.a.getChildCount()) {
                View childAt = this.a.getChildAt(i3);
                this.a.getClass();
                int R = RecyclerView.R(childAt);
                if (R < 0) {
                    i3++;
                    i2 = R;
                } else {
                    i = childAt.getTop();
                    i2 = R;
                    break;
                }
            } else {
                i = 0;
                break;
            }
        }
        this.a.g3.O(true);
        va vaVar = this.a;
        if (i2 >= 0) {
            vaVar.f3.g1(i2, i);
        } else {
            vaVar.f3.g1(0, 0);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.e.a();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.e.c();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.setActionModeColor(cmb.w0(null, cmb.c6, false));
            }
            NumberTextView numberTextView = this.x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(cmb.x8));
            }
            r7 r7Var = this.r;
            if (r7Var != null && r7Var.getSearchField() != null) {
                this.r.getSearchField().setCursorColor(getThemedColor(cmb.F6));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
