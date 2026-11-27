package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.Wallet.c;
public final class th6 extends e {
    public t20 a;
    public d79 b;
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
                if (!yac.h(i3).o()) {
                    i2++;
                    if (num == null) {
                        num = Integer.valueOf(i3);
                    }
                }
            }
            if (!yac.n()) {
                i2--;
            }
            if (i2 > 0 && num != null) {
                presentFragment(new qh6(num.intValue()));
            } else if (!yac.n()) {
                showDialog(new l46(7, this.currentAccount, null, getParentActivity(), this));
            }
        } else if (i == this.d) {
            presentFragment(PasscodeActivity.m0());
        } else if (i == this.e) {
            presentFragment(new z61());
        } else if (i == this.f) {
            presentFragment(new v8(3));
        } else if (i == this.h) {
            showDialog(jj.R(this, null));
        } else if (i == this.r && getParentActivity() != null) {
            id idVar = new id(3, null, getParentActivity());
            idVar.q(500L);
            int i4 = this.currentAccount;
            z56 z56Var = new z56(this, idVar, (byte) 25);
            c[] cVarArr = c.T;
            if (!uc7.s1(i4).k4.v0.f) {
                z56Var.run();
            } else {
                hl.c3(new hl3(i4, z56Var, (byte) 11));
            }
        }
    }

    public final void Z(defpackage.id r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th6.Z(id):void");
    }

    public final void a0() {
        uc7.s1(this.currentAccount).J3(1);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.p7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131748495, null));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 7));
        this.a = new t20(this, context, (byte) 7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new x46(1, false));
        frameLayout.addView(this.b, tre.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new sh6(this));
        this.b.s1();
        this.b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
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
        lq3.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.w = 1;
        if (yac.c() < 4) {
            int i = this.w;
            this.w = i + 1;
            this.c = i;
        } else {
            this.c = -1;
        }
        if (xea.r.length() <= 0) {
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
        t20 t20Var = this.a;
        if (t20Var != null) {
            t20Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
