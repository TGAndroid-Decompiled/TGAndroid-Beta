package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
public final class lg5 extends n7c {
    public final qac e;
    public boolean n;
    public String r;
    public NumberTextView s;
    public r7 x;
    public a1b y;
    public ArrayList f = crd.a(new sk3(this, (byte) 18));
    public final ArrayList h = new ArrayList();
    public final HashSet w = new HashSet();

    public lg5(ut utVar, qac qacVar) {
        this.e = qacVar;
    }

    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i = 5;
        int i2 = 2;
        if (TextUtils.isEmpty(this.r)) {
            ArrayList arrayList2 = this.f;
            if (arrayList2 != null) {
                int i3 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    m11 m11Var = (m11) this.f.get(size);
                    calendar.setTimeInMillis(m11Var.b);
                    int i4 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i3 != i4) {
                        arrayList.add(c6c.r(jb6.u(m11Var.b / 1000, false)));
                        i3 = i4;
                    }
                    String str = this.r;
                    int i5 = ab.b;
                    c6c K = c6c.K(ab.class);
                    K.A = 3;
                    K.r = false;
                    K.I = m11Var;
                    K.n = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i6 = 0;
            while (size2 >= 0) {
                m11 m11Var2 = (m11) arrayList3.get(size2);
                calendar.setTimeInMillis(m11Var2.b);
                int i7 = calendar.get(i) + (calendar.get(i2) * 100) + (calendar.get(1) * 10000);
                if (i6 != i7) {
                    arrayList.add(c6c.r(jb6.u(m11Var2.b / 1000, false)));
                    i6 = i7;
                }
                String str2 = this.r;
                int i8 = ab.b;
                c6c K2 = c6c.K(ab.class);
                K2.A = 3;
                K2.r = false;
                K2.I = m11Var2;
                K2.n = str2;
                arrayList.add(K2);
                size2--;
                i = 5;
                i2 = 2;
            }
            if (this.n) {
                arrayList.add(c6c.p(32));
                arrayList.add(c6c.p(32));
                arrayList.add(c6c.p(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(c6c.C(null));
        }
    }

    @Override
    public final CharSequence a0() {
        return jb6.M0(2131742583, null);
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
        if (c6cVar.H(ab.class) && !this.actionBar.y()) {
            finishFragment();
            this.e.a((m11) c6cVar.I);
        }
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i;
        this.fragmentView = super.createView(context);
        a aVar = this.actionBar;
        int i2 = cmb.c6;
        anb.h(i2, getResourceProvider(), aVar);
        this.actionBar.setActionModeColor(cmb.w0(null, i2, false));
        this.actionBar.setBackButtonImage(2131231244);
        a aVar2 = this.actionBar;
        int i3 = cmb.F6;
        anb.l(aVar2, 5, i3, getResourceProvider());
        anb.l(this.actionBar, 3, cmb.y8, getResourceProvider());
        anb.l(this.actionBar, 1, i3, getResourceProvider());
        anb.b(this.actionBar, i3, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 29));
        r6 q = this.actionBar.q(null);
        NumberTextView numberTextView = new NumberTextView(q.getContext());
        this.s = numberTextView;
        numberTextView.setTextSize(18);
        this.s.setTypeface(gm.o());
        this.s.setTextColor(getThemedColor(cmb.x8));
        this.s.setOnTouchListener(new w02((byte) 11));
        q.addView(this.s, qoe.m(1.0f, 0, -1, 65, 0, 0));
        r7 b = this.actionBar.t().b(0, 2131232503, getResourceProvider());
        b.N();
        b.I = new cn0(this);
        this.x = b;
        b.setSearchFieldHint(jb6.M0(2131745570, null));
        this.x.setContentDescription(jb6.M0(2131745570, null));
        EditTextBoldCursor searchField = this.x.getSearchField();
        anb.X(searchField, i3, getResourceProvider());
        anb.D(searchField, cmb.Ij, getResourceProvider());
        anb.v(searchField, i3, getResourceProvider());
        a1b a1bVar = new a1b(context, null, 1, null);
        this.y = a1bVar;
        if (TextUtils.isEmpty(this.r)) {
            i = 2131742581;
        } else {
            i = 2131742580;
        }
        a1bVar.d.setText(jb6.M0(i, null));
        this.y.e.setVisibility(8);
        this.y.e(false, false);
        this.y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.y, qoe.c(-1.0f, -1));
        this.a.setEmptyView(this.y);
        this.a.j(new ip2(this, (byte) 21));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (gm.B(getThemedColor(cmb.c6)) > 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.setActionModeColor(cmb.w0(null, cmb.c6, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            NumberTextView numberTextView = this.s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(cmb.x8));
            }
            r7 r7Var = this.x;
            if (r7Var != null && r7Var.getSearchField() != null) {
                this.x.getSearchField().setCursorColor(getThemedColor(cmb.F6));
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }
}
