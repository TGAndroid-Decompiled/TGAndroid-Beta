package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.d;
public final class gk8 extends d implements gk7 {
    public final boolean E;
    public o39 a;
    public t26 b;
    public fk8 c;
    public g24 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public final boolean y;

    public gk8() {
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
        cs5 I = cs5.I(this, view);
        int i = 0;
        I.X(new ColorDrawable(bkb.w0(null, bkb.c6, false)));
        boolean z3 = this.E;
        if (z3) {
            z = true;
        } else {
            z = false;
        }
        I.k(0, k96.M0(2131743672, null), new h18(this, l, (byte) 28), z);
        if (!z3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            i = 2131232420;
        }
        I.l(i, new am6(this, l), k96.M0(2131746128, null), z2, true);
        I.V = 190;
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
        fk8 fk8Var = this.c;
        if (fk8Var != null) {
            fk8Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.u6));
        hashSet.add(Integer.valueOf(bkb.t6));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        pha phaVar = this.simpleActionBar;
        int i = 2;
        boolean z = this.E;
        if (z) {
            phaVar.setTitle(k96.M0(2131753678, null));
        } else if (z) {
            phaVar.setTitle(k96.M0(2131750717, null));
        } else {
            phaVar.setTitle(k96.M0(2131748098, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 29));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        g24 g24Var = new g24(context, null);
        this.d = g24Var;
        if (z) {
            g24Var.setText(k96.M0(2131748047, null));
        } else {
            g24Var.setText(k96.M0(2131748031, null));
        }
        o39 o39Var = new o39(context, null);
        this.a = o39Var;
        o39Var.r1();
        this.a.setItemSelectorColorProvider(new ek8(this));
        this.a.setSectionsDrawBackground(true);
        this.a.setEmptyView(this.d);
        o39 o39Var2 = this.a;
        t26 t26Var = new t26(1, false);
        this.b = t26Var;
        o39Var2.setLayoutManager(t26Var);
        this.a.setVerticalScrollBarEnabled(false);
        o39 o39Var3 = this.a;
        fk8 fk8Var = new fk8(this, context);
        this.c = fk8Var;
        o39Var3.setAdapter(fk8Var);
        o39 o39Var4 = this.a;
        if (k96.a0) {
            i = 1;
        }
        o39Var4.setVerticalScrollbarPosition(i);
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        frameLayout.addView(this.d, nme.c(-1.0f, -1));
        this.a.setOnItemClickListener(new bf4(this, (byte) 25));
        this.a.setOnItemLongClickListener(new ek8(this));
        if (z) {
            this.a.setOnScrollListener(new n58(this, (byte) 6));
            int i2 = getMessagesController().y0;
            g24 g24Var2 = this.d;
            if (i2 < 0) {
                g24Var2.b();
            } else {
                g24Var2.c();
            }
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        o39 o39Var;
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = na7.q5;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (o39Var = this.a) != null) {
                int childCount = o39Var.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.a.getChildAt(i4);
                    if (childAt instanceof gh6) {
                        ((gh6) childAt).d(intValue);
                    }
                }
            }
        } else if (i == kk7.f0) {
            this.d.c();
            Z();
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        o92 o92Var = new o92(this, (byte) 6);
        arrayList.add(new blb(this.a, 16, new Class[]{gh6.class, dh6.class, ld5.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        arrayList.add(new blb(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
        arrayList.add(new blb(this.a, 0, new Class[]{gh6.class}, new String[]{"statusColor"}, (Drawable[]) null, o92Var, bkb.x6));
        arrayList.add(new blb(this.a, 0, new Class[]{gh6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, o92Var, bkb.m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        kk7.f(this.currentAccount).b(this, 2);
        if (this.E) {
            kk7.f(this.currentAccount).b(this, kk7.f0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, 2);
        if (this.E) {
            kk7.f(this.currentAccount).n(this, kk7.f0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        fk8 fk8Var = this.c;
        if (fk8Var != null) {
            fk8Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            g24 g24Var = this.d;
            if (g24Var != null) {
                g24Var.setProgressBarColor(bkb.w0(null, bkb.g6, false));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
