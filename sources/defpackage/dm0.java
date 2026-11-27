package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
public final class dm0 extends n9c {
    public db f;
    public final ys h;
    public final vs n;
    public s7 r;
    public s7 s;
    public String w;
    public NumberTextView x;
    public final db e = new db(null, this.currentAccount, new pz(this, (byte) 13));
    public final HashSet y = new HashSet();
    public final HashSet E = new HashSet();

    public dm0(ys ysVar, vs vsVar) {
        this.h = ysVar;
        this.n = vsVar;
    }

    public static boolean j0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !uh9.t(" ", lowerCase2, lowerCase) && !uh9.t(".", lowerCase2, lowerCase)) {
            String I3 = hl.I3(lowerCase);
            String I32 = hl.I3(lowerCase2);
            if (!I3.startsWith(I32) && !I3.contains(" ".concat(I32)) && !I3.contains(".".concat(I32))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.E;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.w);
        db dbVar = this.e;
        if (isEmpty) {
            ArrayList arrayList2 = dbVar.a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                r47 r47Var = (r47) obj;
                String a = fb.a(r47Var);
                if (!TextUtils.isEmpty(a) && !a.startsWith("#") && !a.startsWith("$") && !a.startsWith("@")) {
                    hashSet.add(a);
                    int i2 = bb.b;
                    b8c K = b8c.K(bb.class);
                    K.A = 3;
                    K.r = false;
                    K.I = r47Var;
                    K.L(h0(r47Var));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!dbVar.f) {
                arrayList.add(b8c.q(arrayList.size(), 32));
                arrayList.add(b8c.q(arrayList.size(), 32));
                arrayList.add(b8c.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = dbVar.a;
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                r47 r47Var2 = (r47) obj2;
                String a2 = fb.a(r47Var2);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    String J0 = hl.J0(a2, true);
                    wxc b = j84.c().b(J0);
                    TLRPC.Message message = r47Var2.k;
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
                        int i4 = bb.b;
                        b8c K2 = b8c.K(bb.class);
                        K2.A = 3;
                        K2.r = false;
                        K2.I = r47Var2;
                        K2.n = str3;
                        K2.L(h0(r47Var2));
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
                r47 r47Var3 = (r47) obj3;
                String a3 = fb.a(r47Var3);
                if (!TextUtils.isEmpty(a3) && !a3.startsWith("#") && !a3.startsWith("$") && !a3.startsWith("@")) {
                    hashSet.add(a3);
                    String str4 = this.w;
                    int i6 = bb.b;
                    b8c K3 = b8c.K(bb.class);
                    K3.A = 3;
                    K3.r = false;
                    K3.I = r47Var3;
                    K3.n = str4;
                    K3.L(h0(r47Var3));
                    arrayList.add(K3);
                }
            }
            if (!this.f.f) {
                arrayList.add(b8c.q(arrayList.size(), 32));
                arrayList.add(b8c.q(arrayList.size(), 32));
                arrayList.add(b8c.q(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(b8c.C(charSequence));
        }
    }

    @Override
    public final CharSequence Z() {
        return ob6.M0(2131742570, null);
    }

    @Override
    public final void a0(b8c b8cVar, View view) {
        if (b8cVar.H(bb.class)) {
            if (this.actionBar.z()) {
                f0(b8cVar, view);
                return;
            }
            finishFragment();
            this.n.a(fb.a((r47) b8cVar.I));
        }
    }

    @Override
    public final boolean b0(b8c b8cVar, View view) {
        if (b8cVar.H(bb.class)) {
            f0(b8cVar, view);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        a aVar = this.actionBar;
        int i = aob.d6;
        yob.h(i, getResourceProvider(), aVar);
        this.actionBar.setActionModeColor(aob.w0(null, i, false));
        this.actionBar.setBackButtonImage(2131231243);
        a aVar2 = this.actionBar;
        int i2 = aob.G6;
        yob.l(aVar2, 5, i2, getResourceProvider());
        yob.l(this.actionBar, 3, aob.z8, getResourceProvider());
        yob.l(this.actionBar, 1, i2, getResourceProvider());
        yob.b(this.actionBar, i2, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 7));
        s6 q = this.actionBar.q(null);
        NumberTextView numberTextView = new NumberTextView(q.getContext());
        this.x = numberTextView;
        numberTextView.setTextSize(18);
        this.x.setTypeface(hl.o());
        this.x.setTextColor(getThemedColor(aob.y8));
        this.x.setOnTouchListener(new q8((byte) 16));
        q.addView(this.x, tre.m(1.0f, 0, -1, 65, 0, 0));
        this.s = q.h(2131296500, 2131232229, hl.L(54.0f), ob6.M0(2131754873, null));
        q.h(2131296496, 2131232113, hl.L(54.0f), ob6.M0(2131751563, null));
        s7 b = this.actionBar.u().b(0, 2131232502, getResourceProvider());
        b.N();
        b.I = new cm0(this);
        this.r = b;
        b.setSearchFieldHint(ob6.M0(2131745564, null));
        this.r.setContentDescription(ob6.M0(2131745564, null));
        EditTextBoldCursor searchField = this.r.getSearchField();
        yob.X(searchField, i2, getResourceProvider());
        yob.D(searchField, aob.Jj, getResourceProvider());
        yob.v(searchField, i2, getResourceProvider());
        this.a.j(new y(this, (byte) 6));
        z2b z2bVar = new z2b(context, null, 1, null);
        z2bVar.d.setText(ob6.M0(2131742550, null));
        z2bVar.e.setVisibility(8);
        z2bVar.e(false, false);
        z2bVar.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(z2bVar, tre.c(-1.0f, -1));
        this.a.setEmptyView(z2bVar);
        return this.fragmentView;
    }

    public final void f0(b8c b8cVar, View view) {
        cb cbVar = (cb) view;
        r47 r47Var = (r47) b8cVar.I;
        boolean h0 = h0(r47Var);
        HashSet hashSet = this.y;
        boolean z = false;
        if (h0) {
            if (r47Var != null) {
                hashSet.remove(Integer.valueOf(r47Var.e1()));
            }
            cbVar.setChecked(false);
        } else {
            if (r47Var != null) {
                hashSet.add(Integer.valueOf(r47Var.e1()));
            }
            cbVar.setChecked(true);
        }
        this.x.a(hashSet.size(), true);
        boolean isEmpty = hashSet.isEmpty();
        a aVar = this.actionBar;
        if (isEmpty) {
            aVar.y();
        } else {
            aVar.R(null, null);
        }
        s7 s7Var = this.s;
        if (hashSet.size() == 1) {
            z = true;
        }
        hl.P3(s7Var, z, true);
    }

    public final void g0() {
        HashSet hashSet = this.y;
        if (hashSet.size() != 1) {
            return;
        }
        long e = yac.h(this.currentAccount).e();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        ys ysVar = this.h;
        if (ysVar != null) {
            ysVar.run();
        }
        hl.d3(new am0(e, intValue, (byte) 0), 80L);
    }

    public final boolean h0(r47 r47Var) {
        if (r47Var != null) {
            if (this.y.contains(Integer.valueOf(r47Var.e1()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i0(HashSet hashSet) {
        uc7.s1(this.currentAccount).X(new ArrayList(hashSet), null, null, yac.h(this.currentAccount).e(), 0, true, 0);
        this.e.b(new ArrayList(hashSet));
        db dbVar = this.f;
        if (dbVar != null) {
            dbVar.b(new ArrayList(hashSet));
        }
        this.y.clear();
        this.actionBar.y();
        this.a.g3.O(true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (hl.B(getThemedColor(aob.d6)) > 0.721f) {
            return true;
        }
        return false;
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
                aVar.setActionModeColor(aob.w0(null, aob.d6, false));
            }
            NumberTextView numberTextView = this.x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(aob.y8));
            }
            s7 s7Var = this.r;
            if (s7Var != null && s7Var.getSearchField() != null) {
                this.r.getSearchField().setCursorColor(getThemedColor(aob.G6));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
