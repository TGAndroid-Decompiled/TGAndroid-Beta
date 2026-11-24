package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.Wallet.c;
public final class pf6 extends d {
    public s20 a;
    public o39 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;

    public final void Y(int i) {
        Integer num = null;
        if (i == this.c) {
            int i2 = 0;
            for (int i3 = 3; i3 >= 0; i3--) {
                if (!y6c.h(i3).o()) {
                    i2++;
                    if (num == null) {
                        num = Integer.valueOf(i3);
                    }
                }
            }
            if (!y6c.n()) {
                i2--;
            }
            if (i2 > 0 && num != null) {
                presentFragment(new mf6(num.intValue()));
            } else if (!y6c.n()) {
                showDialog(new h26(7, this.currentAccount, null, getParentActivity(), this));
            }
        } else if (i == this.d) {
            presentFragment(PasscodeActivity.m0());
        } else if (i == this.e) {
            presentFragment(new r61());
        } else if (i == this.f) {
            presentFragment(new u8(3));
        } else if (i == this.h) {
            showDialog(ij.R(this, null));
        } else if (i == this.r && getParentActivity() != null) {
            hd hdVar = new hd(3, null, getParentActivity());
            hdVar.q(500L);
            int i4 = this.currentAccount;
            kz5 kz5Var = new kz5(this, hdVar, (byte) 28);
            c[] cVarArr = c.R;
            if (!na7.q1(i4).k4.n0.f) {
                kz5Var.run();
            } else {
                gl.d3(new sm3(i4, kz5Var, (byte) 9));
            }
        }
    }

    public final void Z(defpackage.hd r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf6.Z(hd):void");
    }

    public final void a0() {
        na7.q1(this.currentAccount).B3(1);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.o7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131748549, null));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 6));
        this.a = new s20(this, context, (byte) 7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new t26(1, false));
        frameLayout.addView(this.b, nme.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new of6(this));
        this.b.r1();
        this.b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        up3.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.w = 1;
        if (y6c.c() < 4) {
            int i = this.w;
            this.w = i + 1;
            this.c = i;
        } else {
            this.c = -1;
        }
        if (gba.r.length() <= 0) {
            int i2 = this.w;
            this.w = i2 + 1;
            this.d = i2;
        } else {
            this.d = -1;
        }
        int i3 = this.w;
        this.e = i3;
        this.f = i3 + 1;
        this.h = i3 + 2;
        this.n = i3 + 3;
        this.r = i3 + 4;
        this.w = i3 + 6;
        this.s = i3 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.a;
        if (s20Var != null) {
            s20Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
