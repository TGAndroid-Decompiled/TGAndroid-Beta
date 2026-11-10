package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import di.r4;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
public final class w1 extends f2 implements ls {
    public r41 f17573a;
    public LinearLayout f17574b;
    public ai.f1 f17575c;
    public boolean d;
    public String f17576e;
    public String f17577f;
    public boolean h;
    public String f17578n;

    public static void Z(w1 w1Var, x31 x31Var, View view) {
        if (x31Var.d == -1) {
            boolean z9 = w1Var.h;
            w1Var.h = !z9;
            if (!z9) {
                String str = w1Var.f17577f;
                w1Var.f17578n = str;
                ai.f1 f1Var = w1Var.f17575c;
                if (f1Var != null) {
                    f1Var.a(str);
                }
            }
            ((r8) view).setChecked(w1Var.h);
            w1Var.f17573a.f37496f3.O(true);
        } else if (view.isEnabled()) {
            x1 b10 = x1.b(w1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i7 = x31Var.d;
            if (i7 >= 0) {
                b10.g();
                if (i7 < arrayList.size()) {
                    b10.g();
                    w1Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(x31Var.d)).f27100id;
                    w1Var.f17578n = str2;
                    ai.f1 f1Var2 = w1Var.f17575c;
                    if (f1Var2 != null) {
                        f1Var2.a(str2);
                    }
                    if (w1Var.d) {
                        w1Var.simpleActionBar.l(true);
                    }
                    w1Var.f17573a.f37496f3.O(true);
                }
            }
        }
    }

    public static void a0(w1 w1Var, ArrayList arrayList, m41 m41Var) {
        boolean z9;
        boolean z10;
        if (w1Var.d && !TextUtils.isEmpty(w1Var.f17576e)) {
            z9 = true;
        } else {
            z9 = false;
        }
        x1 b10 = x1.b(w1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z9) {
            m41Var.V();
            String M0 = id.M0(2131744120, null);
            x31 x31Var = new x31(9);
            x31Var.d = -1;
            x31Var.f40156l = M0;
            x31Var.L(w1Var.h);
            arrayList.add(x31Var);
            m41Var.U();
            arrayList.add(x31.C(id.a0(null, null, 2131744119, b10.d(w1Var.f17578n, true))));
        }
        m41Var.V();
        if (!z9) {
            arrayList.add(x31.u(id.M0(2131744118, null)));
        }
        boolean z11 = true;
        int i7 = 0;
        while (true) {
            b10.g();
            if (i7 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i7);
            CharSequence e10 = x1.e(tL_timezone, false);
            if (z9) {
                String replace = org.telegram.messenger.g0.O3(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = org.telegram.messenger.g0.O3(w1Var.f17576e).toLowerCase();
                if (jg.g.A(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = org.telegram.messenger.g0.w1(e10, w1Var.f17576e, w1Var.resourceProvider);
                } else {
                    i7++;
                }
            }
            String f10 = x1.f(tL_timezone);
            x31 x31Var2 = new x31(10);
            x31Var2.d = i7;
            x31Var2.f40156l = e10;
            x31Var2.f40158n = f10;
            x31Var2.L(TextUtils.equals(tL_timezone.f27100id, w1Var.f17578n));
            if (w1Var.h && !z9) {
                z10 = false;
            } else {
                z10 = true;
            }
            x31Var2.f40152g = z10;
            arrayList.add(x31Var2);
            z11 = false;
            i7++;
        }
        m41Var.U();
        if (z11) {
            arrayList.add(x31.m(w1Var.f17574b));
        } else {
            arrayList.add(x31.C(null));
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(id.M0(2131744116, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 19));
        g5 b10 = this.simpleActionBar.q().b(1, 2131232486);
        b10.N();
        b10.B0 = new v1(this, 0);
        b10.setSearchFieldHint(id.M0(2131745836, null));
        FrameLayout frameLayout = new FrameLayout(context);
        r41 r41Var = new r41(this, new hi.u1(this, 13), new r4(this, 27), null);
        this.f17573a = r41Var;
        r41Var.r1();
        this.f17573a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f17573a, ha.c(-1.0f, -1));
        this.f17573a.setOnScrollListener(new ai.b(this, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f17574b = linearLayout;
        linearLayout.setOrientation(1);
        this.f17574b.setMinimumHeight(org.telegram.messenger.g0.L(500.0f));
        k9 k9Var = new k9(context);
        k9Var.getImageReceiver().f21241z1 = false;
        ui.b0(this.currentAccount).c2(k9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f17574b.addView(k9Var, ha.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131744117, null));
        t6.U(textView, m6.f28282y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.f17574b.addView(textView, ha.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        r41 r41Var;
        m41 m41Var;
        if (i7 == qs.f25071r3 && (r41Var = this.f17573a) != null && (m41Var = r41Var.f37496f3) != null) {
            m41Var.O(true);
        }
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.f17573a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = x1.b(this.currentAccount).c();
        this.f17577f = c10;
        this.h = TextUtils.equals(c10, this.f17578n);
        getNotificationCenter().c(this, qs.f25071r3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.f25071r3);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
