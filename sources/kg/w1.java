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
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.y31;
public final class w1 extends f2 implements ls {
    public r41 f17570a;
    public LinearLayout f17571b;
    public ai.f1 f17572c;
    public boolean d;
    public String f17573e;
    public String f17574f;
    public boolean h;
    public String f17575n;

    public static void Z(w1 w1Var, y31 y31Var, View view) {
        if (y31Var.d == -1) {
            boolean z9 = w1Var.h;
            w1Var.h = !z9;
            if (!z9) {
                String str = w1Var.f17574f;
                w1Var.f17575n = str;
                ai.f1 f1Var = w1Var.f17572c;
                if (f1Var != null) {
                    f1Var.a(str);
                }
            }
            ((r8) view).setChecked(w1Var.h);
            w1Var.f17570a.f37556f3.O(true);
        } else if (view.isEnabled()) {
            x1 b10 = x1.b(w1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i7 = y31Var.d;
            if (i7 >= 0) {
                b10.g();
                if (i7 < arrayList.size()) {
                    b10.g();
                    w1Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(y31Var.d)).f27096id;
                    w1Var.f17575n = str2;
                    ai.f1 f1Var2 = w1Var.f17572c;
                    if (f1Var2 != null) {
                        f1Var2.a(str2);
                    }
                    if (w1Var.d) {
                        w1Var.simpleActionBar.k(true);
                    }
                    w1Var.f17570a.f37556f3.O(true);
                }
            }
        }
    }

    public static void a0(w1 w1Var, ArrayList arrayList, m41 m41Var) {
        boolean z9;
        boolean z10;
        if (w1Var.d && !TextUtils.isEmpty(w1Var.f17573e)) {
            z9 = true;
        } else {
            z9 = false;
        }
        x1 b10 = x1.b(w1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z9) {
            m41Var.V();
            String M0 = id.M0(2131744120, null);
            y31 y31Var = new y31(9);
            y31Var.d = -1;
            y31Var.f40568l = M0;
            y31Var.L(w1Var.h);
            arrayList.add(y31Var);
            m41Var.U();
            arrayList.add(y31.C(id.a0(null, null, 2131744119, b10.d(w1Var.f17575n, true))));
        }
        m41Var.V();
        if (!z9) {
            arrayList.add(y31.u(id.M0(2131744118, null)));
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
                String lowerCase = org.telegram.messenger.g0.O3(w1Var.f17573e).toLowerCase();
                if (jg.g.A(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = org.telegram.messenger.g0.w1(e10, w1Var.f17573e, w1Var.resourceProvider);
                } else {
                    i7++;
                }
            }
            String f10 = x1.f(tL_timezone);
            y31 y31Var2 = new y31(10);
            y31Var2.d = i7;
            y31Var2.f40568l = e10;
            y31Var2.f40570n = f10;
            y31Var2.L(TextUtils.equals(tL_timezone.f27096id, w1Var.f17575n));
            if (w1Var.h && !z9) {
                z10 = false;
            } else {
                z10 = true;
            }
            y31Var2.f40564g = z10;
            arrayList.add(y31Var2);
            z11 = false;
            i7++;
        }
        m41Var.U();
        if (z11) {
            arrayList.add(y31.m(w1Var.f17571b));
        } else {
            arrayList.add(y31.C(null));
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(id.M0(2131744116, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 19));
        f5 b10 = this.simpleActionBar.p().b(1, 2131232486);
        b10.N();
        b10.B0 = new v1(this, 0);
        b10.setSearchFieldHint(id.M0(2131745836, null));
        FrameLayout frameLayout = new FrameLayout(context);
        r41 r41Var = new r41(this, new hi.u1(this, 13), new r4(this, 27), null);
        this.f17570a = r41Var;
        r41Var.r1();
        this.f17570a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f17570a, ha.c(-1.0f, -1));
        this.f17570a.setOnScrollListener(new ai.b(this, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f17571b = linearLayout;
        linearLayout.setOrientation(1);
        this.f17571b.setMinimumHeight(org.telegram.messenger.g0.L(500.0f));
        l9 l9Var = new l9(context);
        l9Var.getImageReceiver().f21236z1 = false;
        ui.b0(this.currentAccount).c2(l9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f17571b.addView(l9Var, ha.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131744117, null));
        s6.U(textView, l6.f28257y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.f17571b.addView(textView, ha.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        r41 r41Var;
        m41 m41Var;
        if (i7 == qs.f25067r3 && (r41Var = this.f17570a) != null && (m41Var = r41Var.f37556f3) != null) {
            m41Var.O(true);
        }
    }

    @Override
    public final qj0 getListViewForSimpleGlass() {
        return this.f17570a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = x1.b(this.currentAccount).c();
        this.f17574f = c10;
        this.h = TextUtils.equals(c10, this.f17575n);
        getNotificationCenter().c(this, qs.f25067r3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.f25067r3);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
