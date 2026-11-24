package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class vob extends d implements gk7 {
    public q5c a;
    public LinearLayout b;
    public x15 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public final void Y(ArrayList arrayList, l5c l5cVar) {
        boolean z;
        boolean z2;
        if (this.d && !TextUtils.isEmpty(this.e)) {
            z = true;
        } else {
            z = false;
        }
        wob b = wob.b(this.currentAccount);
        ArrayList arrayList2 = b.d;
        if (!z) {
            l5cVar.V();
            String M0 = k96.M0(2131743879, null);
            c4c c4cVar = new c4c(9);
            c4cVar.d = -1;
            c4cVar.m = M0;
            c4cVar.L(this.h);
            arrayList.add(c4cVar);
            l5cVar.U();
            arrayList.add(c4c.C(k96.a0(null, null, 2131743878, b.d(this.n, true))));
        }
        l5cVar.V();
        if (!z) {
            oo1.o(2131743877, null, arrayList);
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
            CharSequence e = wob.e(tL_timezone, false);
            if (z) {
                String replace = gl.J3(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = gl.J3(this.e).toLowerCase();
                if (de9.t(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = gl.u1(e, this.e, this.resourceProvider);
                } else {
                    i++;
                }
            }
            String f = wob.f(tL_timezone);
            c4c c4cVar2 = new c4c(10);
            c4cVar2.d = i;
            c4cVar2.m = e;
            c4cVar2.o = f;
            c4cVar2.L(TextUtils.equals(tL_timezone.id, this.n));
            if (this.h && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            c4cVar2.g = z2;
            arrayList.add(c4cVar2);
            z3 = false;
            i++;
        }
        l5cVar.U();
        if (z3) {
            arrayList.add(c4c.m(this.b));
        } else {
            arrayList.add(c4c.C(null));
        }
    }

    public final void Z(c4c c4cVar, View view) {
        if (c4cVar.d == -1) {
            boolean z = this.h;
            this.h = !z;
            if (!z) {
                String str = this.f;
                this.n = str;
                x15 x15Var = this.c;
                if (x15Var != null) {
                    x15Var.a(str);
                }
            }
            ((ahb) view).setChecked(this.h);
            this.a.g3.O(true);
        } else if (view.isEnabled()) {
            wob b = wob.b(this.currentAccount);
            ArrayList arrayList = b.d;
            int i = c4cVar.d;
            if (i >= 0) {
                b.g();
                if (i < arrayList.size()) {
                    b.g();
                    this.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(c4cVar.d)).id;
                    this.n = str2;
                    x15 x15Var2 = this.c;
                    if (x15Var2 != null) {
                        x15Var2.a(str2);
                    }
                    if (this.d) {
                        this.simpleActionBar.n(true);
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
        this.simpleActionBar.setTitle(k96.M0(2131743875, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 19));
        xha a = this.simpleActionBar.t().a(1, 2131232491);
        a.N();
        a.C0 = new q10(this, (byte) 22);
        a.setSearchFieldHint(k96.M0(2131745644, null));
        FrameLayout frameLayout = new FrameLayout(context);
        q5c q5cVar = new q5c(this, new n4b(this, (byte) 6), new hza(this, (byte) 16), null);
        this.a = q5cVar;
        q5cVar.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        this.a.setOnScrollListener(new vdb(this, (byte) 2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(gl.L(500.0f));
        be0 be0Var = new be0(context);
        be0Var.getImageReceiver().A1 = false;
        hq6.d0(this.currentAccount).e2(be0Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(be0Var, nme.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131743876, null));
        zkb.X(textView, bkb.x6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.b.addView(textView, nme.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q5c q5cVar;
        l5c l5cVar;
        if (i == kk7.s3 && (q5cVar = this.a) != null && (l5cVar = q5cVar.g3) != null) {
            l5cVar.O(true);
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c = wob.b(this.currentAccount).c();
        this.f = c;
        this.h = TextUtils.equals(c, this.n);
        getNotificationCenter().b(this, kk7.s3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.s3);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
