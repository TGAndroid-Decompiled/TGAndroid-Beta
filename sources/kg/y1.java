package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import hi.d7;
import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.q9;
public final class y1 extends g2 implements gs {
    public h51 f18570a;
    public LinearLayout f18571b;
    public ai.y1 f18572c;
    public boolean d;
    public String f18573e;
    public String f18574f;
    public boolean h;
    public String f18575n;

    public static void Z(y1 y1Var, o41 o41Var, View view) {
        if (o41Var.d == -1) {
            boolean z10 = y1Var.h;
            y1Var.h = !z10;
            if (!z10) {
                String str = y1Var.f18574f;
                y1Var.f18575n = str;
                ai.y1 y1Var2 = y1Var.f18572c;
                if (y1Var2 != null) {
                    y1Var2.a(str);
                }
            }
            ((s8) view).setChecked(y1Var.h);
            y1Var.f18570a.f35790g3.O(true);
        } else if (view.isEnabled()) {
            z1 b10 = z1.b(y1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i7 = o41Var.d;
            if (i7 >= 0) {
                b10.g();
                if (i7 < arrayList.size()) {
                    b10.g();
                    y1Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(o41Var.d)).f28574id;
                    y1Var.f18575n = str2;
                    ai.y1 y1Var3 = y1Var.f18572c;
                    if (y1Var3 != null) {
                        y1Var3.a(str2);
                    }
                    if (y1Var.d) {
                        y1Var.simpleActionBar.o(true);
                    }
                    y1Var.f18570a.f35790g3.O(true);
                }
            }
        }
    }

    public static void a0(y1 y1Var, ArrayList arrayList, c51 c51Var) {
        boolean z10;
        boolean z11;
        if (y1Var.d && !TextUtils.isEmpty(y1Var.f18573e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        z1 b10 = z1.b(y1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            c51Var.V();
            String N0 = hd.N0(2131743877, null);
            o41 o41Var = new o41(9);
            o41Var.d = -1;
            o41Var.f38092m = N0;
            o41Var.L(y1Var.h);
            arrayList.add(o41Var);
            c51Var.U();
            arrayList.add(o41.C(hd.a0(null, null, 2131743876, b10.d(y1Var.f18575n, true))));
        }
        c51Var.V();
        if (!z10) {
            i5.c.s(2131743875, null, arrayList);
        }
        boolean z12 = true;
        int i7 = 0;
        while (true) {
            b10.g();
            if (i7 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i7);
            CharSequence e10 = z1.e(tL_timezone, false);
            if (z10) {
                String replace = org.telegram.messenger.g0.M3(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = org.telegram.messenger.g0.M3(y1Var.f18573e).toLowerCase();
                if (i5.c.B(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = org.telegram.messenger.g0.w1(e10, y1Var.f18573e, y1Var.resourceProvider);
                } else {
                    i7++;
                }
            }
            String f10 = z1.f(tL_timezone);
            o41 o41Var2 = new o41(10);
            o41Var2.d = i7;
            o41Var2.f38092m = e10;
            o41Var2.f38094o = f10;
            o41Var2.L(TextUtils.equals(tL_timezone.f28574id, y1Var.f18575n));
            if (y1Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            o41Var2.f38087g = z11;
            arrayList.add(o41Var2);
            z12 = false;
            i7++;
        }
        c51Var.U();
        if (z12) {
            arrayList.add(o41.m(y1Var.f18571b));
        } else {
            arrayList.add(o41.C(null));
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(hd.N0(2131743873, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 14));
        g5 b10 = this.simpleActionBar.t().b(1, 2131232488);
        b10.O();
        b10.C0 = new bi.w1(this, 1);
        b10.setSearchFieldHint(hd.N0(2131745640, null));
        FrameLayout frameLayout = new FrameLayout(context);
        h51 h51Var = new h51(this, new d7(this, 15), new x1(this, 0), null);
        this.f18570a = h51Var;
        h51Var.r1();
        this.f18570a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18570a, ma.c(-1.0f, -1));
        this.f18570a.setOnScrollListener(new bi.u1(this, 20));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f18571b = linearLayout;
        linearLayout.setOrientation(1);
        this.f18571b.setMinimumHeight(org.telegram.messenger.g0.L(500.0f));
        q9 q9Var = new q9(context);
        q9Var.getImageReceiver().A1 = false;
        si.d0(this.currentAccount).h2(q9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f18571b.addView(q9Var, ma.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(hd.N0(2131743874, null));
        t6.U(textView, m6.f29773y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.f18571b.addView(textView, ma.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h51 h51Var;
        c51 c51Var;
        if (i7 == ls.f25388t3 && (h51Var = this.f18570a) != null && (c51Var = h51Var.f35790g3) != null) {
            c51Var.O(true);
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18570a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = z1.b(this.currentAccount).c();
        this.f18574f = c10;
        this.h = TextUtils.equals(c10, this.f18575n);
        getNotificationCenter().c(this, ls.f25388t3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ls.f25388t3);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
