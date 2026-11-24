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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class me1 extends d {
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public static final Paint K = new Paint(1);
    public ge1 E;
    public ie1 F;
    public le1 G;
    public ke1 H;
    public sha a;
    public o39 b;
    public fe1 c;
    public boolean d;
    public int e;
    public String f;
    public q21 h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final ArrayList w;
    public final ArrayList x;
    public final long y;

    public me1(Bundle bundle) {
        super(bundle);
        this.r = "";
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        if (bundle != null) {
            this.y = bundle.getLong("bot_id");
        }
    }

    public static int Y(me1 me1Var) {
        return me1Var.currentAccount;
    }

    public static int Z(me1 me1Var) {
        return me1Var.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final boolean b0(String str) {
        int i;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        ke1 ke1Var = this.H;
        if (ke1Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i = 0;
            } else {
                i = 8;
            }
            ke1Var.setVisibility(i);
            le1 le1Var = this.G;
            if (le1Var != null) {
                int i2 = le1.f;
                le1Var.a();
            }
        }
        q21 q21Var = this.h;
        if (q21Var != null) {
            gl.r(q21Var);
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
                        ke1 ke1Var2 = this.H;
                        if (ke1Var2 != null) {
                            ke1Var2.setText(k96.M0(2131743413, null));
                            ke1 ke1Var3 = this.H;
                            int i4 = bkb.o7;
                            ke1Var3.setTag(Integer.valueOf(i4));
                            zkb.X(this.H, i4, null);
                            le1 le1Var2 = this.G;
                            if (le1Var2 != null) {
                                int i5 = le1.f;
                                le1Var2.a();
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        ke1 ke1Var4 = this.H;
                        if (ke1Var4 != null) {
                            ke1Var4.setText(k96.M0(2131743417, null));
                            ke1 ke1Var5 = this.H;
                            int i6 = bkb.o7;
                            ke1Var5.setTag(Integer.valueOf(i6));
                            zkb.X(this.H, i6, null);
                            le1 le1Var3 = this.G;
                            if (le1Var3 != null) {
                                int i7 = le1.f;
                                le1Var3.a();
                                return false;
                            }
                        }
                    }
                }
            } else {
                ke1 ke1Var6 = this.H;
                if (ke1Var6 != null) {
                    ke1Var6.setText(k96.M0(2131743417, null));
                    ke1 ke1Var7 = this.H;
                    int i8 = bkb.o7;
                    ke1Var7.setTag(Integer.valueOf(i8));
                    zkb.X(this.H, i8, null);
                    le1 le1Var4 = this.G;
                    if (le1Var4 != null) {
                        int i9 = le1.f;
                        le1Var4.a();
                        return false;
                    }
                }
            }
            return false;
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                ke1 ke1Var8 = this.H;
                if (ke1Var8 != null) {
                    ke1Var8.setText(k96.M0(2131743416, null));
                    ke1 ke1Var9 = this.H;
                    int i10 = bkb.o7;
                    ke1Var9.setTag(Integer.valueOf(i10));
                    zkb.X(this.H, i10, null);
                    le1 le1Var5 = this.G;
                    if (le1Var5 != null) {
                        int i11 = le1.f;
                        le1Var5.a();
                        return false;
                    }
                }
            } else {
                String str2 = d0().username;
                if (str2 == null) {
                    str2 = "";
                }
                boolean equals = str.equals(str2);
                ke1 ke1Var10 = this.H;
                if (equals) {
                    if (ke1Var10 != null) {
                        ke1Var10.setText(k96.a0("UsernameAvailable", null, 2131743428, str));
                        ke1 ke1Var11 = this.H;
                        int i12 = bkb.v6;
                        ke1Var11.setTag(Integer.valueOf(i12));
                        zkb.X(this.H, i12, null);
                        le1 le1Var6 = this.G;
                        if (le1Var6 != null) {
                            int i13 = le1.f;
                            le1Var6.a();
                        }
                    }
                    return true;
                }
                if (ke1Var10 != null) {
                    ke1Var10.setText(k96.M0(2131743427, null));
                    ke1 ke1Var12 = this.H;
                    int i14 = bkb.E6;
                    ke1Var12.setTag(Integer.valueOf(i14));
                    zkb.X(this.H, i14, null);
                    le1 le1Var7 = this.G;
                    if (le1Var7 != null) {
                        int i15 = le1.f;
                        le1Var7.a();
                    }
                }
                this.f = str;
                q21 q21Var2 = new q21(this, str, (byte) 17);
                this.h = q21Var2;
                gl.d3(q21Var2, 300L);
                return true;
            }
        } else {
            ke1 ke1Var13 = this.H;
            if (ke1Var13 != null) {
                ke1Var13.setText(k96.M0(2131743415, null));
                ke1 ke1Var14 = this.H;
                int i16 = bkb.o7;
                ke1Var14.setTag(Integer.valueOf(i16));
                zkb.X(this.H, i16, null);
                le1 le1Var8 = this.G;
                if (le1Var8 != null) {
                    int i17 = le1.f;
                    le1Var8.a();
                }
            }
        }
        return false;
    }

    public final void c0(boolean z) {
        ge1 ge1Var = this.E;
        if (ge1Var != null) {
            if (!ge1Var.a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.E.a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.E.a.requestFocus();
            if (z) {
                gl.E3(this.E.a);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String str;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131743435, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 18));
        this.a = this.simpleActionBar.s(k96.M0(2131745754, null));
        TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(e0()));
        if (V1 == null) {
            V1 = d0();
        }
        if (V1 != null) {
            this.r = null;
            if (V1.usernames != null) {
                int i = 0;
                while (true) {
                    if (i >= V1.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = V1.usernames.get(i);
                    if (tL_username != null && tL_username.editable) {
                        this.r = tL_username.username;
                        break;
                    }
                    i++;
                }
            }
            String str2 = this.r;
            if (str2 == null && (str = V1.username) != null) {
                this.r = str;
                str2 = str;
            }
            if (str2 == null) {
                this.r = "";
            }
            this.s.clear();
            ArrayList arrayList = this.w;
            arrayList.clear();
            for (int i2 = 0; i2 < V1.usernames.size(); i2++) {
                if (V1.usernames.get(i2).active) {
                    arrayList.add(V1.usernames.get(i2));
                }
            }
            for (int i3 = 0; i3 < V1.usernames.size(); i3++) {
                if (!V1.usernames.get(i3).active) {
                    arrayList.add(V1.usernames.get(i3));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setLayoutManager(new t26());
        o39 o39Var2 = this.b;
        fe1 fe1Var = new fe1(this);
        this.c = fe1Var;
        o39Var2.setAdapter(fe1Var);
        zkb.J(this.b, bkb.h6, getResourceProvider());
        this.b.setSectionsDrawBackground(true);
        new is5(new r10(this, (byte) 2)).h(this.b);
        ((FrameLayout) this.fragmentView).addView(this.b, nme.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new p8((byte) 23));
        this.b.setOnItemClickListener(new de1(this));
        gl.d3(new nv0(this, (byte) 20), 40L);
        return this.fragmentView;
    }

    public final TLRPC.User d0() {
        long j = this.y;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.currentAccount;
        if (i != 0) {
            return na7.q1(i2).V1(Long.valueOf(j));
        }
        return y6c.h(i2).f();
    }

    public final long e0() {
        long j = this.y;
        if (j != 0) {
            return j;
        }
        return y6c.h(this.currentAccount).e();
    }

    public final void f0(String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        this.e = ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkusername, new en0(this, str, checkusername, (byte) 11), 2);
    }

    public final void g0(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(hd hdVar, TLRPC.User user) {
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        na7.q1(this.currentAccount).b4(arrayList, false);
        ad7.Y(this.currentAccount).j1(arrayList, null, false, true);
        y6c.h(this.currentAccount).u(true);
        finishFragment();
    }

    public final void i0(hd hdVar, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        ij.c0(this.currentAccount, tL_error, this, updateusername, new Object[0]);
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
            String p = l7c.p(d0);
            if (p == null) {
                p = "";
            }
            if (p.equals(this.r)) {
                finishFragment();
                return;
            }
            hd hdVar = new hd(3, null, getParentActivity());
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = this.r;
            kk7 f = kk7.f(this.currentAccount);
            int i = na7.q5;
            f.k(2, 1);
            int sendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateusername, new en0(this, hdVar, updateusername, (byte) 10), 2);
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(sendRequest, this.classGuid);
            hdVar.setOnCancelListener(new xs0(this, sendRequest, (byte) 1));
            hdVar.show();
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
            reorderusernames3.bot = na7.q1(this.currentAccount).m1(j);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        getConnectionsManager().sendRequest(reorderusernames, new ce2((byte) 0));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(e0()));
        V1.usernames = arrayList4;
        na7.q1(this.currentAccount).a4(V1, false, true);
    }

    public final void l0() {
        if (this.b == null) {
            return;
        }
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if ((childAt instanceof ld5) && i == 0) {
                gl.B3(((ld5) childAt).getTextView());
            } else if (childAt instanceof le1) {
                gl.B3(childAt);
            } else if (childAt instanceof ge1) {
                ge1 ge1Var = (ge1) childAt;
                gl.B3(ge1Var.a);
                gl.B3(ge1Var.b);
            }
        }
        pw0.APP_ERROR.a();
    }

    public final void m0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me1.m0(int, boolean, boolean):void");
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
        if (!na7.c1().getBoolean("view_animations", true)) {
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
