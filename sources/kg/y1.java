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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
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
public final class y1 extends g2 implements fs {
    public h51 f18567a;
    public LinearLayout f18568b;
    public ai.x1 f18569c;
    public boolean d;
    public String f18570e;
    public String f18571f;
    public boolean h;
    public String f18572n;

    public static void Z(y1 y1Var, o41 o41Var, View view) {
        if (o41Var.d == -1) {
            boolean z10 = y1Var.h;
            y1Var.h = !z10;
            if (!z10) {
                String str = y1Var.f18571f;
                y1Var.f18572n = str;
                ai.x1 x1Var = y1Var.f18569c;
                if (x1Var != null) {
                    x1Var.a(str);
                }
            }
            ((s8) view).setChecked(y1Var.h);
            y1Var.f18567a.f35796g3.O(true);
        } else if (view.isEnabled()) {
            z1 b10 = z1.b(y1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i7 = o41Var.d;
            if (i7 >= 0) {
                b10.g();
                if (i7 < arrayList.size()) {
                    b10.g();
                    y1Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(o41Var.d)).f28571id;
                    y1Var.f18572n = str2;
                    ai.x1 x1Var2 = y1Var.f18569c;
                    if (x1Var2 != null) {
                        x1Var2.a(str2);
                    }
                    if (y1Var.d) {
                        y1Var.simpleActionBar.o(true);
                    }
                    y1Var.f18567a.f35796g3.O(true);
                }
            }
        }
    }

    public static void a0(y1 y1Var, ArrayList arrayList, c51 c51Var) {
        boolean z10;
        boolean z11;
        if (y1Var.d && !TextUtils.isEmpty(y1Var.f18570e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        z1 b10 = z1.b(y1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            c51Var.V();
            String N0 = gd.N0(2131743879, null);
            o41 o41Var = new o41(9);
            o41Var.d = -1;
            o41Var.f38098m = N0;
            o41Var.L(y1Var.h);
            arrayList.add(o41Var);
            c51Var.U();
            arrayList.add(o41.C(gd.a0(null, null, 2131743878, b10.d(y1Var.f18572n, true))));
        }
        c51Var.V();
        if (!z10) {
            i5.c.s(2131743877, null, arrayList);
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
                String lowerCase = org.telegram.messenger.g0.M3(y1Var.f18570e).toLowerCase();
                if (i5.c.B(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = org.telegram.messenger.g0.w1(e10, y1Var.f18570e, y1Var.resourceProvider);
                } else {
                    i7++;
                }
            }
            String f10 = z1.f(tL_timezone);
            o41 o41Var2 = new o41(10);
            o41Var2.d = i7;
            o41Var2.f38098m = e10;
            o41Var2.f38100o = f10;
            o41Var2.L(TextUtils.equals(tL_timezone.f28571id, y1Var.f18572n));
            if (y1Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            o41Var2.f38093g = z11;
            arrayList.add(o41Var2);
            z12 = false;
            i7++;
        }
        c51Var.U();
        if (z12) {
            arrayList.add(o41.m(y1Var.f18568b));
        } else {
            arrayList.add(o41.C(null));
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(gd.N0(2131743875, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 14));
        g5 b10 = this.simpleActionBar.t().b(1, 2131232488);
        b10.O();
        b10.C0 = new bi.w1(this, 1);
        b10.setSearchFieldHint(gd.N0(2131745640, null));
        FrameLayout frameLayout = new FrameLayout(context);
        h51 h51Var = new h51(this, new d7(this, 15), new x1(this, 0), null);
        this.f18567a = h51Var;
        h51Var.r1();
        this.f18567a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18567a, ma.c(-1.0f, -1));
        this.f18567a.setOnScrollListener(new bi.u1(this, 20));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f18568b = linearLayout;
        linearLayout.setOrientation(1);
        this.f18568b.setMinimumHeight(org.telegram.messenger.g0.L(500.0f));
        q9 q9Var = new q9(context);
        q9Var.getImageReceiver().A1 = false;
        ri.d0(this.currentAccount).h2(q9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f18568b.addView(q9Var, ma.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131743876, null));
        t6.U(textView, m6.f29770y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.f18568b.addView(textView, ma.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h51 h51Var;
        c51 c51Var;
        if (i7 == ks.f25222t3 && (h51Var = this.f18567a) != null && (c51Var = h51Var.f35796g3) != null) {
            c51Var.O(true);
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18567a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = z1.b(this.currentAccount).c();
        this.f18571f = c10;
        this.h = TextUtils.equals(c10, this.f18572n);
        getNotificationCenter().c(this, ks.f25222t3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.f25222t3);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
