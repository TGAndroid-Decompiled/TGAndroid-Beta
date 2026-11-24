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
public final class dm0 extends n5c {
    public cb f;
    public final ts h;
    public final ws n;
    public r7 r;
    public r7 s;
    public String w;
    public NumberTextView x;
    public final cb e = new cb(null, this.currentAccount, new zl0(this, (byte) 0));
    public final HashSet y = new HashSet();
    public final HashSet E = new HashSet();

    public dm0(ts tsVar, ws wsVar) {
        this.h = tsVar;
        this.n = wsVar;
    }

    public static boolean j0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !de9.t(" ", lowerCase2, lowerCase) && !de9.t(".", lowerCase2, lowerCase)) {
            String I3 = gl.I3(lowerCase);
            String I32 = gl.I3(lowerCase2);
            if (!I3.startsWith(I32) && !I3.contains(" ".concat(I32)) && !I3.contains(".".concat(I32))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void Y(ArrayList arrayList, l5c l5cVar) {
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
                k27 k27Var = (k27) obj;
                String a = eb.a(k27Var);
                if (!TextUtils.isEmpty(a) && !a.startsWith("#") && !a.startsWith("$") && !a.startsWith("@")) {
                    hashSet.add(a);
                    int i2 = ab.b;
                    c4c K = c4c.K(ab.class);
                    K.A = 3;
                    K.r = false;
                    K.I = k27Var;
                    K.L(h0(k27Var));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!cbVar.f) {
                arrayList.add(c4c.q(arrayList.size(), 32));
                arrayList.add(c4c.q(arrayList.size(), 32));
                arrayList.add(c4c.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = cbVar.a;
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                k27 k27Var2 = (k27) obj2;
                String a2 = eb.a(k27Var2);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    String J0 = gl.J0(a2, true);
                    htc b = o74.c().b(J0);
                    TLRPC.Message message = k27Var2.k;
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
                    if (j0(J0, this.w) || j0(str, this.w) || j0(str2, this.w)) {
                        String str3 = this.w;
                        int i4 = ab.b;
                        c4c K2 = c4c.K(ab.class);
                        K2.A = 3;
                        K2.r = false;
                        K2.I = k27Var2;
                        K2.n = str3;
                        K2.L(h0(k27Var2));
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
                k27 k27Var3 = (k27) obj3;
                String a3 = eb.a(k27Var3);
                if (!TextUtils.isEmpty(a3) && !a3.startsWith("#") && !a3.startsWith("$") && !a3.startsWith("@")) {
                    hashSet.add(a3);
                    String str4 = this.w;
                    int i6 = ab.b;
                    c4c K3 = c4c.K(ab.class);
                    K3.A = 3;
                    K3.r = false;
                    K3.I = k27Var3;
                    K3.n = str4;
                    K3.L(h0(k27Var3));
                    arrayList.add(K3);
                }
            }
            if (!this.f.f) {
                arrayList.add(c4c.q(arrayList.size(), 32));
                arrayList.add(c4c.q(arrayList.size(), 32));
                arrayList.add(c4c.q(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(c4c.C(charSequence));
        }
    }

    @Override
    public final CharSequence Z() {
        return k96.M0(2131742676, null);
    }

    @Override
    public final void a0(c4c c4cVar, View view) {
        if (c4cVar.H(ab.class)) {
            if (this.actionBar.y()) {
                f0(c4cVar, view);
                return;
            }
            finishFragment();
            this.n.a(eb.a((k27) c4cVar.I));
        }
    }

    @Override
    public final boolean b0(c4c c4cVar, View view) {
        if (c4cVar.H(ab.class)) {
            f0(c4cVar, view);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        a aVar = this.actionBar;
        int i = bkb.c6;
        zkb.h(i, getResourceProvider(), aVar);
        this.actionBar.setActionModeColor(bkb.w0(null, i, false));
        this.actionBar.setBackButtonImage(2131231243);
        a aVar2 = this.actionBar;
        int i2 = bkb.F6;
        zkb.l(aVar2, 5, i2, getResourceProvider());
        zkb.l(this.actionBar, 3, bkb.y8, getResourceProvider());
        zkb.l(this.actionBar, 1, i2, getResourceProvider());
        zkb.b(this.actionBar, i2, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 7));
        r6 q = this.actionBar.q(null);
        NumberTextView numberTextView = new NumberTextView(q.getContext());
        this.x = numberTextView;
        numberTextView.setTextSize(18);
        this.x.setTypeface(gl.o());
        this.x.setTextColor(getThemedColor(bkb.x8));
        this.x.setOnTouchListener(new p8((byte) 16));
        q.addView(this.x, nme.m(1.0f, 0, -1, 65, 0, 0));
        this.s = q.h(2131296500, 2131232229, gl.L(54.0f), k96.M0(2131754877, null));
        q.h(2131296496, 2131232113, gl.L(54.0f), k96.M0(2131751586, null));
        r7 b = this.actionBar.t().b(0, 2131232491, getResourceProvider());
        b.N();
        b.I = new cm0(this);
        this.r = b;
        b.setSearchFieldHint(k96.M0(2131745644, null));
        this.r.setContentDescription(k96.M0(2131745644, null));
        EditTextBoldCursor searchField = this.r.getSearchField();
        zkb.X(searchField, i2, getResourceProvider());
        zkb.D(searchField, bkb.Ij, getResourceProvider());
        zkb.v(searchField, i2, getResourceProvider());
        this.a.j(new y(this, (byte) 6));
        zya zyaVar = new zya(context, null, 1, null);
        zyaVar.d.setText(k96.M0(2131742656, null));
        zyaVar.e.setVisibility(8);
        zyaVar.e(false, false);
        zyaVar.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(zyaVar, nme.c(-1.0f, -1));
        this.a.setEmptyView(zyaVar);
        return this.fragmentView;
    }

    public final void f0(c4c c4cVar, View view) {
        bb bbVar = (bb) view;
        k27 k27Var = (k27) c4cVar.I;
        boolean h0 = h0(k27Var);
        HashSet hashSet = this.y;
        boolean z = false;
        if (h0) {
            if (k27Var != null) {
                hashSet.remove(Integer.valueOf(k27Var.e1()));
            }
            bbVar.setChecked(false);
        } else {
            if (k27Var != null) {
                hashSet.add(Integer.valueOf(k27Var.e1()));
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
        gl.P3(r7Var, z, true);
    }

    public final void g0() {
        HashSet hashSet = this.y;
        if (hashSet.size() != 1) {
            return;
        }
        long e = y6c.h(this.currentAccount).e();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        ts tsVar = this.h;
        if (tsVar != null) {
            tsVar.run();
        }
        gl.d3(new am0(e, intValue, (byte) 0), 80L);
    }

    public final boolean h0(k27 k27Var) {
        if (k27Var != null) {
            if (this.y.contains(Integer.valueOf(k27Var.e1()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i0(HashSet hashSet) {
        na7.q1(this.currentAccount).V(new ArrayList(hashSet), null, null, y6c.h(this.currentAccount).e(), 0, true, 0);
        this.e.b(new ArrayList(hashSet));
        cb cbVar = this.f;
        if (cbVar != null) {
            cbVar.b(new ArrayList(hashSet));
        }
        this.y.clear();
        this.actionBar.x();
        this.a.g3.O(true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (gl.B(getThemedColor(bkb.c6)) > 0.721f) {
            return true;
        }
        return false;
    }

    public final void k0() {
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
                aVar.setActionModeColor(bkb.w0(null, bkb.c6, false));
            }
            NumberTextView numberTextView = this.x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(bkb.x8));
            }
            r7 r7Var = this.r;
            if (r7Var != null && r7Var.getSearchField() != null) {
                this.r.getSearchField().setCursorColor(getThemedColor(bkb.F6));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
