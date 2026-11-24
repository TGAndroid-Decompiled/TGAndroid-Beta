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
public final class km8 extends d implements jm7 {
    public final boolean E;
    public r59 a;
    public u46 b;
    public jm8 c;
    public r34 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public final boolean y;

    public km8() {
        super(null);
        this.E = true;
        this.y = true;
    }

    public final void Z(Long l, View view) {
        boolean z;
        boolean z2;
        if (getParentActivity() == null) {
            return;
        }
        bu5 I = bu5.I(this, view);
        int i = 0;
        I.X(new ColorDrawable(cmb.w0(null, cmb.c6, false)));
        boolean z3 = this.E;
        if (z3) {
            z = true;
        } else {
            z = false;
        }
        I.k(0, jb6.M0(2131743598, null), new a18(this, l, (byte) 29), z);
        if (!z3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            i = 2131232421;
        }
        I.l(i, new bo6(this, l), jb6.M0(2131746054, null), z2, true);
        I.V = 190;
        I.a0();
    }

    public final void a0() {
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
        jm8 jm8Var = this.c;
        if (jm8Var != null) {
            jm8Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.u6));
        hashSet.add(Integer.valueOf(cmb.t6));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        rja rjaVar = this.simpleActionBar;
        int i = 2;
        boolean z = this.E;
        if (z) {
            rjaVar.setTitle(jb6.M0(2131753646, null));
        } else if (z) {
            rjaVar.setTitle(jb6.M0(2131750666, null));
        } else {
            rjaVar.setTitle(jb6.M0(2131748047, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r34 r34Var = new r34(context, null);
        this.d = r34Var;
        if (z) {
            r34Var.setText(jb6.M0(2131747973, null));
        } else {
            r34Var.setText(jb6.M0(2131747957, null));
        }
        r59 r59Var = new r59(context, null);
        this.a = r59Var;
        r59Var.r1();
        this.a.setItemSelectorColorProvider(new hm8(this));
        this.a.setSectionsDrawBackground(true);
        this.a.setEmptyView(this.d);
        r59 r59Var2 = this.a;
        u46 u46Var = new u46(1, false);
        this.b = u46Var;
        r59Var2.setLayoutManager(u46Var);
        this.a.setVerticalScrollBarEnabled(false);
        r59 r59Var3 = this.a;
        jm8 jm8Var = new jm8(this, context);
        this.c = jm8Var;
        r59Var3.setAdapter(jm8Var);
        r59 r59Var4 = this.a;
        if (jb6.a0) {
            i = 1;
        }
        r59Var4.setVerticalScrollbarPosition(i);
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        frameLayout.addView(this.d, qoe.c(-1.0f, -1));
        this.a.setOnItemClickListener(new kg4(this, (byte) 26));
        this.a.setOnItemLongClickListener(new hm8(this));
        if (z) {
            this.a.setOnScrollListener(new so7(this, (byte) 7));
            int i2 = getMessagesController().y0;
            r34 r34Var2 = this.d;
            if (i2 < 0) {
                r34Var2.b();
            } else {
                r34Var2.c();
            }
        }
        a0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r59 r59Var;
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = oc7.s5;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (r59Var = this.a) != null) {
                int childCount = r59Var.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.a.getChildAt(i4);
                    if (childAt instanceof ij6) {
                        ((ij6) childAt).d(intValue);
                    }
                }
            }
        } else if (i == nm7.g0) {
            this.d.c();
            a0();
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        za2 za2Var = new za2(this, (byte) 6);
        arrayList.add(new cnb(this.a, 16, new Class[]{ij6.class, fj6.class, jf5.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        arrayList.add(new cnb(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        arrayList.add(new cnb(this.a, 0, new Class[]{ij6.class}, new String[]{"statusColor"}, (Drawable[]) null, za2Var, cmb.x6));
        arrayList.add(new cnb(this.a, 0, new Class[]{ij6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, za2Var, cmb.m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        nm7.f(this.currentAccount).b(this, 2);
        if (this.E) {
            nm7.f(this.currentAccount).b(this, nm7.g0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, 2);
        if (this.E) {
            nm7.f(this.currentAccount).n(this, nm7.g0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        jm8 jm8Var = this.c;
        if (jm8Var != null) {
            jm8Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            r34 r34Var = this.d;
            if (r34Var != null) {
                r34Var.setProgressBarColor(cmb.w0(null, cmb.g6, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
