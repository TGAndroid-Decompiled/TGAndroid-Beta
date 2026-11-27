package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class vsb extends e implements fn7 {
    public q9c a;
    public LinearLayout b;
    public v35 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public final void Y(ArrayList arrayList, l9c l9cVar) {
        boolean z;
        boolean z2;
        if (this.d && !TextUtils.isEmpty(this.e)) {
            z = true;
        } else {
            z = false;
        }
        wsb b = wsb.b(this.currentAccount);
        ArrayList arrayList2 = b.d;
        if (!z) {
            l9cVar.V();
            String M0 = ob6.M0(2131743773, null);
            b8c b8cVar = new b8c(9);
            b8cVar.d = -1;
            b8cVar.m = M0;
            b8cVar.L(this.h);
            arrayList.add(b8cVar);
            l9cVar.U();
            arrayList.add(b8c.C(ob6.a0(null, null, 2131743772, b.d(this.n, true))));
        }
        l9cVar.V();
        if (!z) {
            bp1.o(2131743771, null, arrayList);
        }
        boolean z3 = true;
        int i = 0;
        while (true) {
            b.g();
            if (i >= arrayList2.size()) {
                break;
            }
            b.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i);
            CharSequence e = wsb.e(tL_timezone, false);
            if (z) {
                String replace = hl.I3(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = hl.I3(this.e).toLowerCase();
                if (uh9.t(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = hl.u1(e, this.e, this.resourceProvider);
                } else {
                    i++;
                }
            }
            String f = wsb.f(tL_timezone);
            b8c b8cVar2 = new b8c(10);
            b8cVar2.d = i;
            b8cVar2.m = e;
            b8cVar2.o = f;
            b8cVar2.L(TextUtils.equals(tL_timezone.id, this.n));
            if (this.h && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            b8cVar2.g = z2;
            arrayList.add(b8cVar2);
            z3 = false;
            i++;
        }
        l9cVar.U();
        if (z3) {
            arrayList.add(b8c.m(this.b));
        } else {
            arrayList.add(b8c.C(null));
        }
    }

    public final void Z(b8c b8cVar, View view) {
        if (b8cVar.d == -1) {
            boolean z = this.h;
            this.h = !z;
            if (!z) {
                String str = this.f;
                this.n = str;
                v35 v35Var = this.c;
                if (v35Var != null) {
                    v35Var.a(str);
                }
            }
            ((wkb) view).setChecked(this.h);
            this.a.g3.O(true);
        } else if (view.isEnabled()) {
            wsb b = wsb.b(this.currentAccount);
            ArrayList arrayList = b.d;
            int i = b8cVar.d;
            if (i >= 0) {
                b.g();
                if (i < arrayList.size()) {
                    b.g();
                    this.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(b8cVar.d)).id;
                    this.n = str2;
                    v35 v35Var2 = this.c;
                    if (v35Var2 != null) {
                        v35Var2.a(str2);
                    }
                    if (this.d) {
                        this.simpleActionBar.o(true);
                    }
                    this.a.g3.O(true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131743769, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 21));
        sla a = this.simpleActionBar.v().a(1, 2131232502);
        a.N();
        a.C0 = new r10(this, (byte) 23);
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        FrameLayout frameLayout = new FrameLayout(context);
        q9c q9cVar = new q9c(this, new l8b(this, (byte) 6), new hja(this, (byte) 29), null);
        this.a = q9cVar;
        q9cVar.s1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, tre.c(-1.0f, -1));
        this.a.setOnScrollListener(new qhb(this, (byte) 2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(hl.L(500.0f));
        de0 de0Var = new de0(context);
        de0Var.getImageReceiver().A1 = false;
        ls6.d0(this.currentAccount).e2(de0Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(de0Var, tre.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131743770, null));
        yob.X(textView, aob.y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.b.addView(textView, tre.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q9c q9cVar;
        l9c l9cVar;
        if (i == jn7.t3 && (q9cVar = this.a) != null && (l9cVar = q9cVar.g3) != null) {
            l9cVar.O(true);
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c = wsb.b(this.currentAccount).c();
        this.f = c;
        this.h = TextUtils.equals(c, this.n);
        getNotificationCenter().b(this, jn7.t3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.t3);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
