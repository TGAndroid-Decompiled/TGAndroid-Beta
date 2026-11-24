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
public final class ph6 extends d {
    public s30 a;
    public r59 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;

    public final void Z(int i) {
        Integer num = null;
        if (i == this.c) {
            int i2 = 0;
            for (int i3 = 3; i3 >= 0; i3--) {
                if (!z8c.h(i3).o()) {
                    i2++;
                    if (num == null) {
                        num = Integer.valueOf(i3);
                    }
                }
            }
            if (!z8c.n()) {
                i2--;
            }
            if (i2 > 0 && num != null) {
                presentFragment(new mh6(num.intValue()));
            } else if (!z8c.n()) {
                showDialog(new i46(7, this.currentAccount, null, getParentActivity(), this));
            }
        } else if (i == this.d) {
            presentFragment(PasscodeActivity.n0());
        } else if (i == this.e) {
            presentFragment(new y71());
        } else if (i == this.f) {
            presentFragment(new u8(3));
        } else if (i == this.h) {
            showDialog(ik.R(this, null));
        } else if (i == this.r && getParentActivity() != null) {
            he heVar = new he(3, null, getParentActivity());
            heVar.q(500L);
            int i4 = this.currentAccount;
            k16 k16Var = new k16(this, heVar, (byte) 29);
            c[] cVarArr = c.R;
            if (!oc7.r1(i4).l4.n0.f) {
                k16Var.run();
            } else {
                gm.c3(new bm3(i4, k16Var, (byte) 11));
            }
        }
    }

    public final void a0(defpackage.he r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ph6.a0(he):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.o7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public final void b0() {
        oc7.r1(this.currentAccount).E3(1);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131748498, null));
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 7));
        this.a = new s30(this, context, (byte) 7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new u46(1, false));
        frameLayout.addView(this.b, qoe.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new oh6(this));
        this.b.r1();
        this.b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
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
        er3.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.w = 1;
        if (z8c.c() < 4) {
            int i = this.w;
            this.w = i + 1;
            this.c = i;
        } else {
            this.c = -1;
        }
        if (gda.r.length() <= 0) {
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
        s30 s30Var = this.a;
        if (s30Var != null) {
            s30Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
