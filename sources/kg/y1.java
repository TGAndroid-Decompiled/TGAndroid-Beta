package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import di.c7;
import hi.e7;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.z41;
public final class y1 extends h2 implements fs {
    public e51 f18543a;
    public LinearLayout f18544b;
    public ai.v1 f18545c;
    public boolean d;
    public String f18546e;
    public String f18547f;
    public boolean h;
    public String f18548n;

    public static void Z(y1 y1Var, l41 l41Var, View view) {
        if (l41Var.d == -1) {
            boolean z10 = y1Var.h;
            y1Var.h = !z10;
            if (!z10) {
                String str = y1Var.f18547f;
                y1Var.f18548n = str;
                ai.v1 v1Var = y1Var.f18545c;
                if (v1Var != null) {
                    v1Var.a(str);
                }
            }
            ((r8) view).setChecked(y1Var.h);
            y1Var.f18543a.f34607g3.O(true);
        } else if (view.isEnabled()) {
            z1 b10 = z1.b(y1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i7 = l41Var.d;
            if (i7 >= 0) {
                b10.g();
                if (i7 < arrayList.size()) {
                    b10.g();
                    y1Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(l41Var.d)).f28545id;
                    y1Var.f18548n = str2;
                    ai.v1 v1Var2 = y1Var.f18545c;
                    if (v1Var2 != null) {
                        v1Var2.a(str2);
                    }
                    if (y1Var.d) {
                        y1Var.simpleActionBar.o(true);
                    }
                    y1Var.f18543a.f34607g3.O(true);
                }
            }
        }
    }

    public static void a0(y1 y1Var, ArrayList arrayList, z41 z41Var) {
        boolean z10;
        boolean z11;
        if (y1Var.d && !TextUtils.isEmpty(y1Var.f18546e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        z1 b10 = z1.b(y1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            z41Var.V();
            String M0 = gd.M0(2131743885, null);
            l41 l41Var = new l41(9);
            l41Var.d = -1;
            l41Var.f37018m = M0;
            l41Var.L(y1Var.h);
            arrayList.add(l41Var);
            z41Var.U();
            arrayList.add(l41.C(gd.a0(null, null, 2131743884, b10.d(y1Var.f18548n, true))));
        }
        z41Var.V();
        if (!z10) {
            i5.c.s(2131743883, null, arrayList);
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
                String lowerCase = org.telegram.messenger.g0.M3(y1Var.f18546e).toLowerCase();
                if (i5.c.B(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = org.telegram.messenger.g0.w1(e10, y1Var.f18546e, y1Var.resourceProvider);
                } else {
                    i7++;
                }
            }
            String f10 = z1.f(tL_timezone);
            l41 l41Var2 = new l41(10);
            l41Var2.d = i7;
            l41Var2.f37018m = e10;
            l41Var2.f37020o = f10;
            l41Var2.L(TextUtils.equals(tL_timezone.f28545id, y1Var.f18548n));
            if (y1Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            l41Var2.f37013g = z11;
            arrayList.add(l41Var2);
            z12 = false;
            i7++;
        }
        z41Var.U();
        if (z12) {
            arrayList.add(l41.m(y1Var.f18544b));
        } else {
            arrayList.add(l41.C(null));
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(gd.M0(2131743881, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 14));
        h5 b10 = this.simpleActionBar.t().b(1, 2131232488);
        b10.O();
        b10.C0 = new bi.s1(this, 1);
        b10.setSearchFieldHint(gd.M0(2131745641, null));
        FrameLayout frameLayout = new FrameLayout(context);
        e51 e51Var = new e51(this, new e7(this, 15), new c7(this, 29), null);
        this.f18543a = e51Var;
        e51Var.r1();
        this.f18543a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18543a, ma.c(-1.0f, -1));
        this.f18543a.setOnScrollListener(new bi.q1(this, 20));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f18544b = linearLayout;
        linearLayout.setOrientation(1);
        this.f18544b.setMinimumHeight(org.telegram.messenger.g0.L(500.0f));
        q9 q9Var = new q9(context);
        q9Var.getImageReceiver().A1 = false;
        ri.d0(this.currentAccount).h2(q9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f18544b.addView(q9Var, ma.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(gd.M0(2131743882, null));
        u6.U(textView, n6.f29788y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.f18544b.addView(textView, ma.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        e51 e51Var;
        z41 z41Var;
        if (i7 == ks.f25196t3 && (e51Var = this.f18543a) != null && (z41Var = e51Var.f34607g3) != null) {
            z41Var.O(true);
        }
    }

    @Override
    public final ck0 getListViewForSimpleGlass() {
        return this.f18543a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = z1.b(this.currentAccount).c();
        this.f18547f = c10;
        this.h = TextUtils.equals(c10, this.f18548n);
        getNotificationCenter().c(this, ks.f25196t3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.f25196t3);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
