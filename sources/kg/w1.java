package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import di.q4;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w31;
public final class w1 extends f2 implements ls {
    public p41 f17567a;
    public LinearLayout f17568b;
    public ai.f1 f17569c;
    public boolean d;
    public String f17570e;
    public String f17571f;
    public boolean h;
    public String f17572n;

    public static void Z(w1 w1Var, w31 w31Var, View view) {
        if (w31Var.d == -1) {
            boolean z9 = w1Var.h;
            w1Var.h = !z9;
            if (!z9) {
                String str = w1Var.f17571f;
                w1Var.f17572n = str;
                ai.f1 f1Var = w1Var.f17569c;
                if (f1Var != null) {
                    f1Var.a(str);
                }
            }
            ((r8) view).setChecked(w1Var.h);
            w1Var.f17567a.f36781f3.O(true);
        } else if (view.isEnabled()) {
            x1 b10 = x1.b(w1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i7 = w31Var.d;
            if (i7 >= 0) {
                b10.g();
                if (i7 < arrayList.size()) {
                    b10.g();
                    w1Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(w31Var.d)).f27092id;
                    w1Var.f17572n = str2;
                    ai.f1 f1Var2 = w1Var.f17569c;
                    if (f1Var2 != null) {
                        f1Var2.a(str2);
                    }
                    if (w1Var.d) {
                        w1Var.simpleActionBar.j(true);
                    }
                    w1Var.f17567a.f36781f3.O(true);
                }
            }
        }
    }

    public static void a0(w1 w1Var, ArrayList arrayList, k41 k41Var) {
        boolean z9;
        boolean z10;
        if (w1Var.d && !TextUtils.isEmpty(w1Var.f17570e)) {
            z9 = true;
        } else {
            z9 = false;
        }
        x1 b10 = x1.b(w1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z9) {
            k41Var.V();
            String M0 = hd.M0(2131744121, null);
            w31 w31Var = new w31(9);
            w31Var.d = -1;
            w31Var.f39830l = M0;
            w31Var.L(w1Var.h);
            arrayList.add(w31Var);
            k41Var.U();
            arrayList.add(w31.C(hd.a0(null, null, 2131744120, b10.d(w1Var.f17572n, true))));
        }
        k41Var.V();
        if (!z9) {
            arrayList.add(w31.u(hd.M0(2131744119, null)));
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
                String lowerCase = org.telegram.messenger.g0.O3(w1Var.f17570e).toLowerCase();
                if (jg.g.A(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = org.telegram.messenger.g0.w1(e10, w1Var.f17570e, w1Var.resourceProvider);
                } else {
                    i7++;
                }
            }
            String f10 = x1.f(tL_timezone);
            w31 w31Var2 = new w31(10);
            w31Var2.d = i7;
            w31Var2.f39830l = e10;
            w31Var2.f39832n = f10;
            w31Var2.L(TextUtils.equals(tL_timezone.f27092id, w1Var.f17572n));
            if (w1Var.h && !z9) {
                z10 = false;
            } else {
                z10 = true;
            }
            w31Var2.f39826g = z10;
            arrayList.add(w31Var2);
            z11 = false;
            i7++;
        }
        k41Var.U();
        if (z11) {
            arrayList.add(w31.m(w1Var.f17568b));
        } else {
            arrayList.add(w31.C(null));
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(hd.M0(2131744117, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 19));
        f5 b10 = this.simpleActionBar.o().b(1, 2131232486);
        b10.N();
        b10.B0 = new v1(this, 0);
        b10.setSearchFieldHint(hd.M0(2131745837, null));
        FrameLayout frameLayout = new FrameLayout(context);
        p41 p41Var = new p41(this, new hi.u1(this, 13), new q4(this, 27), null);
        this.f17567a = p41Var;
        p41Var.r1();
        this.f17567a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f17567a, ha.c(-1.0f, -1));
        this.f17567a.setOnScrollListener(new ai.b(this, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f17568b = linearLayout;
        linearLayout.setOrientation(1);
        this.f17568b.setMinimumHeight(org.telegram.messenger.g0.L(500.0f));
        l9 l9Var = new l9(context);
        l9Var.getImageReceiver().f21233z1 = false;
        ui.b0(this.currentAccount).c2(l9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f17568b.addView(l9Var, ha.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131744118, null));
        r6.V(textView, k6.f28240y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.f17568b.addView(textView, ha.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        k41 k41Var;
        if (i7 == qs.f25050r3 && (p41Var = this.f17567a) != null && (k41Var = p41Var.f36781f3) != null) {
            k41Var.O(true);
        }
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.f17567a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = x1.b(this.currentAccount).c();
        this.f17571f = c10;
        this.h = TextUtils.equals(c10, this.f17572n);
        getNotificationCenter().c(this, qs.f25050r3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.f25050r3);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
