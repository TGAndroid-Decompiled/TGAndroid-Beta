package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.x4;
import bi.z4;
import c8.ja;
import di.z6;
import hi.q4;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class y1 extends e2 implements is {
    public u41 f18147a;
    public LinearLayout f18148b;
    public ai.u1 f18149c;
    public boolean d;
    public String f18150e;
    public String f18151f;
    public boolean h;
    public String f18152n;

    public static void Z(y1 y1Var, b41 b41Var, View view) {
        if (b41Var.d == -1) {
            boolean z10 = y1Var.h;
            y1Var.h = !z10;
            if (!z10) {
                String str = y1Var.f18151f;
                y1Var.f18152n = str;
                ai.u1 u1Var = y1Var.f18149c;
                if (u1Var != null) {
                    u1Var.a(str);
                }
            }
            ((q8) view).setChecked(y1Var.h);
            y1Var.f18147a.f39895g3.O(true);
        } else if (view.isEnabled()) {
            z1 b10 = z1.b(y1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i7 = b41Var.d;
            if (i7 >= 0) {
                b10.g();
                if (i7 < arrayList.size()) {
                    b10.g();
                    y1Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(b41Var.d)).f28191id;
                    y1Var.f18152n = str2;
                    ai.u1 u1Var2 = y1Var.f18149c;
                    if (u1Var2 != null) {
                        u1Var2.a(str2);
                    }
                    if (y1Var.d) {
                        y1Var.simpleActionBar.m(true);
                    }
                    y1Var.f18147a.f39895g3.O(true);
                }
            }
        }
    }

    public static void a0(y1 y1Var, ArrayList arrayList, p41 p41Var) {
        boolean z10;
        boolean z11;
        if (y1Var.d && !TextUtils.isEmpty(y1Var.f18150e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        z1 b10 = z1.b(y1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            p41Var.V();
            String M0 = hd.M0(2131744120, null);
            b41 b41Var = new b41(9);
            b41Var.d = -1;
            b41Var.f33181l = M0;
            b41Var.L(y1Var.h);
            arrayList.add(b41Var);
            p41Var.U();
            arrayList.add(b41.C(hd.a0(null, null, 2131744119, b10.d(y1Var.f18152n, true))));
        }
        p41Var.V();
        if (!z10) {
            arrayList.add(b41.u(hd.M0(2131744118, null)));
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
                String replace = org.telegram.messenger.g0.N3(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = org.telegram.messenger.g0.N3(y1Var.f18150e).toLowerCase();
                if (i5.c.A(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = org.telegram.messenger.g0.w1(e10, y1Var.f18150e, y1Var.resourceProvider);
                } else {
                    i7++;
                }
            }
            String f10 = z1.f(tL_timezone);
            b41 b41Var2 = new b41(10);
            b41Var2.d = i7;
            b41Var2.f33181l = e10;
            b41Var2.f33183n = f10;
            b41Var2.L(TextUtils.equals(tL_timezone.f28191id, y1Var.f18152n));
            if (y1Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            b41Var2.f33177g = z11;
            arrayList.add(b41Var2);
            z12 = false;
            i7++;
        }
        p41Var.U();
        if (z12) {
            arrayList.add(b41.m(y1Var.f18148b));
        } else {
            arrayList.add(b41.C(null));
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(hd.M0(2131744116, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 12));
        d5 b10 = this.simpleActionBar.r().b(1, 2131232487);
        b10.O();
        b10.C0 = new x1(this, 0);
        b10.setSearchFieldHint(hd.M0(2131745836, null));
        FrameLayout frameLayout = new FrameLayout(context);
        u41 u41Var = new u41(this, new q4(this, 15), new z6(this, 28), null);
        this.f18147a = u41Var;
        u41Var.r1();
        this.f18147a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18147a, ja.c(-1.0f, -1));
        this.f18147a.setOnScrollListener(new z4(this, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f18148b = linearLayout;
        linearLayout.setOrientation(1);
        this.f18148b.setMinimumHeight(org.telegram.messenger.g0.L(500.0f));
        i9 i9Var = new i9(context);
        i9Var.getImageReceiver().A1 = false;
        si.b0(this.currentAccount).c2(i9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f18148b.addView(i9Var, ja.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131744117, null));
        q6.U(textView, j6.f29241y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.f18148b.addView(textView, ja.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        u41 u41Var;
        p41 p41Var;
        if (i7 == ns.f25563r3 && (u41Var = this.f18147a) != null && (p41Var = u41Var.f39895g3) != null) {
            p41Var.O(true);
        }
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
        return this.f18147a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = z1.b(this.currentAccount).c();
        this.f18151f = c10;
        this.h = TextUtils.equals(c10, this.f18152n);
        getNotificationCenter().c(this, ns.f25563r3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ns.f25563r3);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
