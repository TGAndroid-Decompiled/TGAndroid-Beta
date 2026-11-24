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
public final class me5 extends n5c {
    public final p8c e;
    public boolean n;
    public String r;
    public NumberTextView s;
    public r7 x;
    public zya y;
    public ArrayList f = zod.a(new hj3(this, (byte) 18));
    public final ArrayList h = new ArrayList();
    public final HashSet w = new HashSet();

    public me5(ts tsVar, p8c p8cVar) {
        this.e = p8cVar;
    }

    @Override
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i = 5;
        int i2 = 2;
        if (TextUtils.isEmpty(this.r)) {
            ArrayList arrayList2 = this.f;
            if (arrayList2 != null) {
                int i3 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    e01 e01Var = (e01) this.f.get(size);
                    calendar.setTimeInMillis(e01Var.b);
                    int i4 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i3 != i4) {
                        arrayList.add(c4c.r(k96.u(e01Var.b / 1000, false)));
                        i3 = i4;
                    }
                    String str = this.r;
                    int i5 = ab.b;
                    c4c K = c4c.K(ab.class);
                    K.A = 3;
                    K.r = false;
                    K.I = e01Var;
                    K.n = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i6 = 0;
            while (size2 >= 0) {
                e01 e01Var2 = (e01) arrayList3.get(size2);
                calendar.setTimeInMillis(e01Var2.b);
                int i7 = calendar.get(i) + (calendar.get(i2) * 100) + (calendar.get(1) * 10000);
                if (i6 != i7) {
                    arrayList.add(c4c.r(k96.u(e01Var2.b / 1000, false)));
                    i6 = i7;
                }
                String str2 = this.r;
                int i8 = ab.b;
                c4c K2 = c4c.K(ab.class);
                K2.A = 3;
                K2.r = false;
                K2.I = e01Var2;
                K2.n = str2;
                arrayList.add(K2);
                size2--;
                i = 5;
                i2 = 2;
            }
            if (this.n) {
                arrayList.add(c4c.p(32));
                arrayList.add(c4c.p(32));
                arrayList.add(c4c.p(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(c4c.C(null));
        }
    }

    @Override
    public final CharSequence Z() {
        return k96.M0(2131742657, null);
    }

    @Override
    public final void a0(c4c c4cVar, View view) {
        if (c4cVar.H(ab.class) && !this.actionBar.y()) {
            finishFragment();
            this.e.a((e01) c4cVar.I);
        }
    }

    @Override
    public final boolean b0(c4c c4cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i;
        this.fragmentView = super.createView(context);
        a aVar = this.actionBar;
        int i2 = bkb.c6;
        zkb.h(i2, getResourceProvider(), aVar);
        this.actionBar.setActionModeColor(bkb.w0(null, i2, false));
        this.actionBar.setBackButtonImage(2131231243);
        a aVar2 = this.actionBar;
        int i3 = bkb.F6;
        zkb.l(aVar2, 5, i3, getResourceProvider());
        zkb.l(this.actionBar, 3, bkb.y8, getResourceProvider());
        zkb.l(this.actionBar, 1, i3, getResourceProvider());
        zkb.b(this.actionBar, i3, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 28));
        r6 q = this.actionBar.q(null);
        NumberTextView numberTextView = new NumberTextView(q.getContext());
        this.s = numberTextView;
        numberTextView.setTextSize(18);
        this.s.setTypeface(gl.o());
        this.s.setTextColor(getThemedColor(bkb.x8));
        this.s.setOnTouchListener(new jz1((byte) 11));
        q.addView(this.s, nme.m(1.0f, 0, -1, 65, 0, 0));
        r7 b = this.actionBar.t().b(0, 2131232491, getResourceProvider());
        b.N();
        b.I = new cm0(this);
        this.x = b;
        b.setSearchFieldHint(k96.M0(2131745644, null));
        this.x.setContentDescription(k96.M0(2131745644, null));
        EditTextBoldCursor searchField = this.x.getSearchField();
        zkb.X(searchField, i3, getResourceProvider());
        zkb.D(searchField, bkb.Ij, getResourceProvider());
        zkb.v(searchField, i3, getResourceProvider());
        zya zyaVar = new zya(context, null, 1, null);
        this.y = zyaVar;
        if (TextUtils.isEmpty(this.r)) {
            i = 2131742655;
        } else {
            i = 2131742654;
        }
        zyaVar.d.setText(k96.M0(i, null));
        this.y.e.setVisibility(8);
        this.y.e(false, false);
        this.y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.y, nme.c(-1.0f, -1));
        this.a.setEmptyView(this.y);
        this.a.j(new ao2(this, (byte) 20));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (gl.B(getThemedColor(bkb.c6)) > 0.721f) {
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
                aVar.setActionModeColor(bkb.w0(null, bkb.c6, false));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            NumberTextView numberTextView = this.s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(bkb.x8));
            }
            r7 r7Var = this.x;
            if (r7Var != null && r7Var.getSearchField() != null) {
                this.x.getSearchField().setCursorColor(getThemedColor(bkb.F6));
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }
}
