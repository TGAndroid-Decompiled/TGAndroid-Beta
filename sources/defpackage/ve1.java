package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ve1 extends e {
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public static final Paint K = new Paint(1);
    public pe1 E;
    public re1 F;
    public ue1 G;
    public te1 H;
    public nla a;
    public d79 b;
    public oe1 c;
    public boolean d;
    public int e;
    public String f;
    public z21 h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final ArrayList w;
    public final ArrayList x;
    public final long y;

    public ve1(Bundle bundle) {
        super(bundle);
        this.r = "";
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        if (bundle != null) {
            this.y = bundle.getLong("bot_id");
        }
    }

    public static int Y(ve1 ve1Var) {
        return ve1Var.currentAccount;
    }

    public static int a0(ve1 ve1Var) {
        return ve1Var.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public final boolean b0(String str) {
        int i;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        te1 te1Var = this.H;
        if (te1Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i = 0;
            } else {
                i = 8;
            }
            te1Var.setVisibility(i);
            ue1 ue1Var = this.G;
            if (ue1Var != null) {
                int i2 = ue1.f;
                ue1Var.a();
            }
        }
        z21 z21Var = this.h;
        if (z21Var != null) {
            hl.r(z21Var);
            this.h = null;
            this.f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
                    if (i3 == 0 && charAt >= '0' && charAt <= '9') {
                        te1 te1Var2 = this.H;
                        if (te1Var2 != null) {
                            te1Var2.setText(ob6.M0(2131743307, null));
                            te1 te1Var3 = this.H;
                            int i4 = aob.p7;
                            te1Var3.setTag(Integer.valueOf(i4));
                            yob.X(this.H, i4, null);
                            ue1 ue1Var2 = this.G;
                            if (ue1Var2 != null) {
                                int i5 = ue1.f;
                                ue1Var2.a();
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        te1 te1Var4 = this.H;
                        if (te1Var4 != null) {
                            te1Var4.setText(ob6.M0(2131743311, null));
                            te1 te1Var5 = this.H;
                            int i6 = aob.p7;
                            te1Var5.setTag(Integer.valueOf(i6));
                            yob.X(this.H, i6, null);
                            ue1 ue1Var3 = this.G;
                            if (ue1Var3 != null) {
                                int i7 = ue1.f;
                                ue1Var3.a();
                                return false;
                            }
                        }
                    }
                }
            } else {
                te1 te1Var6 = this.H;
                if (te1Var6 != null) {
                    te1Var6.setText(ob6.M0(2131743311, null));
                    te1 te1Var7 = this.H;
                    int i8 = aob.p7;
                    te1Var7.setTag(Integer.valueOf(i8));
                    yob.X(this.H, i8, null);
                    ue1 ue1Var4 = this.G;
                    if (ue1Var4 != null) {
                        int i9 = ue1.f;
                        ue1Var4.a();
                        return false;
                    }
                }
            }
            return false;
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                te1 te1Var8 = this.H;
                if (te1Var8 != null) {
                    te1Var8.setText(ob6.M0(2131743310, null));
                    te1 te1Var9 = this.H;
                    int i10 = aob.p7;
                    te1Var9.setTag(Integer.valueOf(i10));
                    yob.X(this.H, i10, null);
                    ue1 ue1Var5 = this.G;
                    if (ue1Var5 != null) {
                        int i11 = ue1.f;
                        ue1Var5.a();
                        return false;
                    }
                }
            } else {
                String str2 = d0().username;
                if (str2 == null) {
                    str2 = "";
                }
                boolean equals = str.equals(str2);
                te1 te1Var10 = this.H;
                if (equals) {
                    if (te1Var10 != null) {
                        te1Var10.setText(ob6.a0("UsernameAvailable", null, 2131743322, str));
                        te1 te1Var11 = this.H;
                        int i12 = aob.w6;
                        te1Var11.setTag(Integer.valueOf(i12));
                        yob.X(this.H, i12, null);
                        ue1 ue1Var6 = this.G;
                        if (ue1Var6 != null) {
                            int i13 = ue1.f;
                            ue1Var6.a();
                        }
                    }
                    return true;
                }
                if (te1Var10 != null) {
                    te1Var10.setText(ob6.M0(2131743321, null));
                    te1 te1Var12 = this.H;
                    int i14 = aob.F6;
                    te1Var12.setTag(Integer.valueOf(i14));
                    yob.X(this.H, i14, null);
                    ue1 ue1Var7 = this.G;
                    if (ue1Var7 != null) {
                        int i15 = ue1.f;
                        ue1Var7.a();
                    }
                }
                this.f = str;
                z21 z21Var2 = new z21(this, str, (byte) 17);
                this.h = z21Var2;
                hl.d3(z21Var2, 300L);
                return true;
            }
        } else {
            te1 te1Var13 = this.H;
            if (te1Var13 != null) {
                te1Var13.setText(ob6.M0(2131743309, null));
                te1 te1Var14 = this.H;
                int i16 = aob.p7;
                te1Var14.setTag(Integer.valueOf(i16));
                yob.X(this.H, i16, null);
                ue1 ue1Var8 = this.G;
                if (ue1Var8 != null) {
                    int i17 = ue1.f;
                    ue1Var8.a();
                }
            }
        }
        return false;
    }

    public final void c0(boolean z) {
        pe1 pe1Var = this.E;
        if (pe1Var != null) {
            if (!pe1Var.a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.E.a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.E.a.requestFocus();
            if (z) {
                hl.E3(this.E.a);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String str;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131743329, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 19));
        this.a = this.simpleActionBar.u(ob6.M0(2131745674, null));
        TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(e0()));
        if (X1 == null) {
            X1 = d0();
        }
        if (X1 != null) {
            this.r = null;
            if (X1.usernames != null) {
                int i = 0;
                while (true) {
                    if (i >= X1.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = X1.usernames.get(i);
                    if (tL_username != null && tL_username.editable) {
                        this.r = tL_username.username;
                        break;
                    }
                    i++;
                }
            }
            String str2 = this.r;
            if (str2 == null && (str = X1.username) != null) {
                this.r = str;
                str2 = str;
            }
            if (str2 == null) {
                this.r = "";
            }
            this.s.clear();
            ArrayList arrayList = this.w;
            arrayList.clear();
            for (int i2 = 0; i2 < X1.usernames.size(); i2++) {
                if (X1.usernames.get(i2).active) {
                    arrayList.add(X1.usernames.get(i2));
                }
            }
            for (int i3 = 0; i3 < X1.usernames.size(); i3++) {
                if (!X1.usernames.get(i3).active) {
                    arrayList.add(X1.usernames.get(i3));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setLayoutManager(new x46());
        d79 d79Var2 = this.b;
        oe1 oe1Var = new oe1(this);
        this.c = oe1Var;
        d79Var2.setAdapter(oe1Var);
        yob.J(this.b, aob.i6, getResourceProvider());
        this.b.setSectionsDrawBackground(true);
        new lu5(new s10(this, (byte) 2)).h(this.b);
        ((FrameLayout) this.fragmentView).addView(this.b, tre.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new q8((byte) 23));
        this.b.setOnItemClickListener(new me1(this));
        hl.d3(new fv0(this, (byte) 23), 40L);
        return this.fragmentView;
    }

    public final TLRPC.User d0() {
        long j = this.y;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.currentAccount;
        if (i != 0) {
            return uc7.s1(i2).X1(Long.valueOf(j));
        }
        return yac.h(i2).f();
    }

    public final long e0() {
        long j = this.y;
        if (j != 0) {
            return j;
        }
        return yac.h(this.currentAccount).e();
    }

    public final void f0(String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        this.e = ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkusername, new fn0(this, str, checkusername, (byte) 11), 2);
    }

    public final void g0(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(id idVar, TLRPC.User user) {
        try {
            idVar.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        uc7.s1(this.currentAccount).j4(arrayList, false);
        kf7.a0(this.currentAccount).n1(arrayList, null, false, true);
        yac.h(this.currentAccount).u(true);
        finishFragment();
    }

    public final void i0(id idVar, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            idVar.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        jj.c0(this.currentAccount, tL_error, this, updateusername, new Object[0]);
        l0();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.y != 0) {
            finishFragment();
            return;
        }
        if (this.r.startsWith("@")) {
            this.r = this.r.substring(1);
        }
        if (!this.r.isEmpty() && !b0(this.r)) {
            l0();
            return;
        }
        TLRPC.User d0 = d0();
        if (getParentActivity() != null && d0 != null) {
            String p = lbc.p(d0);
            if (p == null) {
                p = "";
            }
            if (p.equals(this.r)) {
                finishFragment();
                return;
            }
            id idVar = new id(3, null, getParentActivity());
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = this.r;
            jn7 f = jn7.f(this.currentAccount);
            int i = uc7.s5;
            f.k(2, 1);
            int sendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateusername, new fn0(this, idVar, updateusername, (byte) 10), 2);
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(sendRequest, this.classGuid);
            idVar.setOnCancelListener(new gt0(this, sendRequest, (byte) 1));
            idVar.show();
        }
    }

    public final void k0() {
        ArrayList arrayList;
        ArrayList arrayList2;
        TL_bots.reorderUsernames reorderusernames;
        if (!this.d) {
            return;
        }
        this.d = false;
        ArrayList<String> arrayList3 = new ArrayList<>();
        int i = 0;
        while (true) {
            arrayList = this.s;
            if (i >= arrayList.size()) {
                break;
            }
            if (((TLRPC.TL_username) arrayList.get(i)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList.get(i)).username);
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            arrayList2 = this.w;
            if (i2 >= arrayList2.size()) {
                break;
            }
            if (((TLRPC.TL_username) arrayList2.get(i2)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList2.get(i2)).username);
            }
            i2++;
        }
        long j = this.y;
        if (j == 0) {
            TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
            reorderusernames2.order = arrayList3;
            reorderusernames = reorderusernames2;
        } else {
            TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
            reorderusernames3.bot = uc7.s1(this.currentAccount).o1(j);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        getConnectionsManager().sendRequest(reorderusernames, new xe2((byte) 0));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(e0()));
        X1.usernames = arrayList4;
        uc7.s1(this.currentAccount).i4(X1, false, true);
    }

    public final void l0() {
        if (this.b == null) {
            return;
        }
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if ((childAt instanceof mf5) && i == 0) {
                hl.B3(((mf5) childAt).getTextView());
            } else if (childAt instanceof ue1) {
                hl.B3(childAt);
            } else if (childAt instanceof pe1) {
                pe1 pe1Var = (pe1) childAt;
                hl.B3(pe1Var.a);
                hl.B3(pe1Var.b);
            }
        }
        yw0.APP_ERROR.a();
    }

    public final void m0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve1.m0(int, boolean, boolean):void");
    }

    public final void n0(TLRPC.TL_username tL_username, boolean z, boolean z2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.w;
            if (i < arrayList.size()) {
                if (arrayList.get(i) == tL_username) {
                    m0(i + 4, z, z2);
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!uc7.e1().getBoolean("view_animations", true)) {
            c0(false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            c0(false);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
