package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e;
public final class vn8 extends e implements fn7 {
    public final boolean E;
    public d79 a;
    public x46 b;
    public un8 c;
    public b34 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public final boolean y;

    public vn8() {
        super(null);
        this.E = true;
        this.y = true;
    }

    public final void Y(Long l, View view) {
        boolean z;
        boolean z2;
        if (getParentActivity() == null) {
            return;
        }
        fu5 I = fu5.I(this, view);
        int i = 0;
        I.X(new ColorDrawable(aob.w0(null, aob.d6, false)));
        boolean z3 = this.E;
        if (z3) {
            z = true;
        } else {
            z = false;
        }
        I.k(0, ob6.M0(2131743566, null), new h68(this, l, (byte) 26), z);
        if (!z3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            i = 2131232420;
        }
        I.l(i, new pg6(this, l), ob6.M0(2131746048, null), z2, true);
        I.Y = 190;
        I.a0();
    }

    public final void Z() {
        this.e = 0;
        this.f = -1;
        this.n = -1;
        this.h = -1;
        this.x = -1;
        if (!this.y || getMessagesController().y0 >= 0) {
            int i = this.e;
            int i2 = i + 1;
            this.e = i2;
            this.f = i;
            boolean z = this.E;
            if (z) {
                this.e = i + 2;
                this.h = i2;
                int size = getMessagesController().x0.size();
                if (size != 0) {
                    if (z) {
                        int i3 = this.e;
                        this.e = i3 + 1;
                        this.n = i3;
                    }
                    int i4 = this.e;
                    this.r = i4;
                    int i5 = i4 + size;
                    this.s = i5;
                    int i6 = i5 + 1;
                    this.e = i6;
                    this.w = i5;
                    if (!z) {
                        this.e = i5 + 2;
                        this.x = i6;
                    }
                } else {
                    this.n = -1;
                    this.r = -1;
                    this.s = -1;
                    this.w = -1;
                    this.x = -1;
                }
            } else {
                throw null;
            }
        }
        un8 un8Var = this.c;
        if (un8Var != null) {
            un8Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.v6));
        hashSet.add(Integer.valueOf(aob.u6));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        jla jlaVar = this.simpleActionBar;
        int i = 2;
        boolean z = this.E;
        if (z) {
            jlaVar.setTitle(ob6.M0(2131753674, null));
        } else if (z) {
            jlaVar.setTitle(ob6.M0(2131750694, null));
        } else {
            jlaVar.setTitle(ob6.M0(2131748044, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        b34 b34Var = new b34(context, null);
        this.d = b34Var;
        if (z) {
            b34Var.setText(ob6.M0(2131747970, null));
        } else {
            b34Var.setText(ob6.M0(2131747954, null));
        }
        d79 d79Var = new d79(context, null);
        this.a = d79Var;
        d79Var.s1();
        this.a.setItemSelectorColorProvider(new tn8(this));
        this.a.setSectionsDrawBackground(true);
        this.a.setEmptyView(this.d);
        d79 d79Var2 = this.a;
        x46 x46Var = new x46(1, false);
        this.b = x46Var;
        d79Var2.setLayoutManager(x46Var);
        this.a.setVerticalScrollBarEnabled(false);
        d79 d79Var3 = this.a;
        un8 un8Var = new un8(this, context);
        this.c = un8Var;
        d79Var3.setAdapter(un8Var);
        d79 d79Var4 = this.a;
        if (ob6.a0) {
            i = 1;
        }
        d79Var4.setVerticalScrollbarPosition(i);
        frameLayout.addView(this.a, tre.c(-1.0f, -1));
        frameLayout.addView(this.d, tre.c(-1.0f, -1));
        this.a.setOnItemClickListener(new zg4(this, (byte) 25));
        this.a.setOnItemLongClickListener(new tn8(this));
        if (z) {
            this.a.setOnScrollListener(new e98(this, (byte) 6));
            int i2 = getMessagesController().y0;
            b34 b34Var2 = this.d;
            if (i2 < 0) {
                b34Var2.b();
            } else {
                b34Var2.c();
            }
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        d79 d79Var;
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = uc7.r5;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (d79Var = this.a) != null) {
                int childCount = d79Var.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.a.getChildAt(i4);
                    if (childAt instanceof lj6) {
                        ((lj6) childAt).d(intValue);
                    }
                }
            }
        } else if (i == jn7.g0) {
            this.d.c();
            Z();
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        da2 da2Var = new da2(this, (byte) 6);
        arrayList.add(new apb(this.a, 16, new Class[]{lj6.class, ij6.class, mf5.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
        arrayList.add(new apb(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        arrayList.add(new apb(this.a, 0, new Class[]{lj6.class}, new String[]{"statusColor"}, (Drawable[]) null, da2Var, aob.y6));
        arrayList.add(new apb(this.a, 0, new Class[]{lj6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, da2Var, aob.n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        jn7.f(this.currentAccount).b(this, 2);
        if (this.E) {
            jn7.f(this.currentAccount).b(this, jn7.g0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, 2);
        if (this.E) {
            jn7.f(this.currentAccount).n(this, jn7.g0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        un8 un8Var = this.c;
        if (un8Var != null) {
            un8Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            b34 b34Var = this.d;
            if (b34Var != null) {
                b34Var.setProgressBarColor(aob.w0(null, aob.h6, false));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
