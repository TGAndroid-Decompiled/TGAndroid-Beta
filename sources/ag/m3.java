package ag;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import w7.b6;
public final class m3 extends org.telegram.ui.ActionBar.k2 implements us {
    public u51 f641a;
    public LinearLayout f642b;
    public e0 f643c;
    public boolean d;
    public String e;
    public String f644f;
    public boolean h;
    public String f645n;

    public static void Y(m3 m3Var, a51 a51Var, View view) {
        if (a51Var.d == -1) {
            boolean z10 = m3Var.h;
            m3Var.h = !z10;
            if (!z10) {
                String str = m3Var.f644f;
                m3Var.f645n = str;
                e0 e0Var = m3Var.f643c;
                if (e0Var != null) {
                    e0Var.a(str);
                }
            }
            ((t8) view).setChecked(m3Var.h);
            m3Var.f641a.f30819f3.O(true);
        } else if (view.isEnabled()) {
            n3 b10 = n3.b(m3Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = a51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    m3Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(a51Var.d)).f19933id;
                    m3Var.f645n = str2;
                    e0 e0Var2 = m3Var.f643c;
                    if (e0Var2 != null) {
                        e0Var2.a(str2);
                    }
                    if (m3Var.d) {
                        m3Var.simpleActionBar.j(true);
                    }
                    m3Var.f641a.f30819f3.O(true);
                }
            }
        }
    }

    public static void Z(m3 m3Var, ArrayList arrayList, p51 p51Var) {
        boolean z10;
        boolean z11;
        if (m3Var.d && !TextUtils.isEmpty(m3Var.e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        n3 b10 = n3.b(m3Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            p51Var.V();
            String L0 = cd.L0(2131744145, null);
            a51 a51Var = new a51(9);
            a51Var.d = -1;
            a51Var.f24292l = L0;
            a51Var.L(m3Var.h);
            arrayList.add(a51Var);
            p51Var.U();
            arrayList.add(a51.C(cd.a0(null, null, 2131744144, b10.d(m3Var.f645n, true))));
        }
        p51Var.V();
        if (!z10) {
            arrayList.add(a51.u(cd.L0(2131744143, null)));
        }
        boolean z12 = true;
        int i10 = 0;
        while (true) {
            b10.g();
            if (i10 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i10);
            CharSequence e = n3.e(tL_timezone, false);
            if (z10) {
                String replace = org.telegram.messenger.i0.N3(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = org.telegram.messenger.i0.N3(m3Var.e).toLowerCase();
                if (sc.e.y(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = org.telegram.messenger.i0.w1(e, m3Var.e, m3Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = n3.f(tL_timezone);
            a51 a51Var2 = new a51(10);
            a51Var2.d = i10;
            a51Var2.f24292l = e;
            a51Var2.f24294n = f7;
            a51Var2.L(TextUtils.equals(tL_timezone.f19933id, m3Var.f645n));
            if (m3Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            a51Var2.f24288g = z11;
            arrayList.add(a51Var2);
            z12 = false;
            i10++;
        }
        p51Var.U();
        if (z12) {
            arrayList.add(a51.m(m3Var.f642b));
        } else {
            arrayList.add(a51.C(null));
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(cd.L0(2131744141, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 8));
        p5 b10 = this.simpleActionBar.o().b(1, 2131232485);
        b10.N();
        b10.B0 = new l3(this, 0);
        b10.setSearchFieldHint(cd.L0(2131745853, null));
        FrameLayout frameLayout = new FrameLayout(context);
        u51 u51Var = new u51(this, new a(this, 8), new a1.c(this, 5), null);
        this.f641a = u51Var;
        u51Var.r1();
        this.f641a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f641a, b6.c(-1.0f, -1));
        this.f641a.setOnScrollListener(new u(this, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f642b = linearLayout;
        linearLayout.setOrientation(1);
        this.f642b.setMinimumHeight(org.telegram.messenger.i0.L(500.0f));
        g9 g9Var = new g9(context);
        g9Var.getImageReceiver().f14424z1 = false;
        ui.b0(this.currentAccount).c2(g9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f642b.addView(g9Var, b6.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(cd.L0(2131744142, null));
        a7.V(textView, t6.f21311y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.f642b.addView(textView, b6.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u51 u51Var;
        p51 p51Var;
        if (i10 == zs.f19680r3 && (u51Var = this.f641a) != null && (p51Var = u51Var.f30819f3) != null) {
            p51Var.O(true);
        }
    }

    @Override
    public final tk0 getListViewForSimpleGlass() {
        return this.f641a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = n3.b(this.currentAccount).c();
        this.f644f = c10;
        this.h = TextUtils.equals(c10, this.f645n);
        getNotificationCenter().c(this, zs.f19680r3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, zs.f19680r3);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
