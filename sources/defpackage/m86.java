package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
public final class m86 extends d {
    public FrameLayout a;
    public r59 b;
    public u46 c;
    public o93 d;
    public u31 e;
    public int f;
    public final sk3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public m86() {
        super(null);
        this.h = new sk3(this, (byte) 23);
        this.n = new boolean[3];
        this.r = new ArrayList();
        this.s = new ArrayList();
    }

    public final int Z(int i) {
        if (i == 3) {
            return 0;
        }
        if (i == 28700) {
            return 1;
        }
        if (i == this.f) {
            return 2;
        }
        return -1;
    }

    public final void a0(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i2 < arrayList.size()) {
                if (((g86) arrayList.get(i2)).e == i) {
                    this.b.f1(new ji(this, i2, (byte) 11), 700, true);
                    return;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b0(int i) {
        int Z = Z(i);
        if (Z == -1) {
            return;
        }
        this.n[Z] = true;
        d0();
        c0();
    }

    public final void c0() {
        String a0;
        ArrayList arrayList = this.r;
        arrayList.clear();
        ArrayList arrayList2 = this.s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new g86(1, 0, 0, 0, null));
        if (e86.c() <= 0) {
            a0 = jb6.M0(2131748628, null);
        } else if (e86.c() >= 100) {
            a0 = jb6.M0(2131748627, null);
        } else {
            a0 = jb6.a0(null, null, 2131748629, String.format("%d%%", Integer.valueOf(e86.c())));
        }
        arrayList2.add(new g86(2, 0, 0, 0, a0));
        arrayList2.add(new g86(0, 0, 0, 0, jb6.M0(2131748605, null)));
        arrayList2.add(g86.c(2131232044, 3, jb6.M0(2131748607, null)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(g86.b(1, jb6.M0(2131748619, null)));
            arrayList2.add(g86.b(2, jb6.M0(2131748621, null)));
        }
        arrayList2.add(g86.c(2131232042, 28700, jb6.M0(2131748612, null)));
        if (zArr[1]) {
            arrayList2.add(g86.b(16388, jb6.M0(2131748619, null)));
            arrayList2.add(g86.b(8200, jb6.M0(2131748618, null)));
            arrayList2.add(g86.b(4112, jb6.M0(2131748621, null)));
        }
        arrayList2.add(g86.c(2131232022, this.f, jb6.M0(2131748613, null)));
        if (zArr[2]) {
            arrayList2.add(g86.b(32, jb6.N0("LiteOptionsBackground")));
            if (!gm.O1()) {
                arrayList2.add(g86.b(64, jb6.N0("LiteOptionsTopics")));
            }
            arrayList2.add(g86.b(128, jb6.N0("LiteOptionsSpoiler")));
            if (gda.o() < 1) {
                boolean z = e21.a;
            } else {
                arrayList2.add(g86.b(256, jb6.N0("LiteOptionsBlur2")));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (gda.o() < 1) {
                    boolean z2 = e21.a;
                } else {
                    arrayList2.add(g86.b(262144, jb6.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(g86.b(32768, jb6.N0("LiteOptionsScale")));
            if (jlb.c()) {
                arrayList2.add(g86.b(65536, jb6.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(g86.c(2131232026, 512, jb6.M0(2131748614, null)));
        arrayList2.add(g86.c(2131232046, 1024, jb6.M0(2131748617, null)));
        arrayList2.add(g86.c(2131232033, 2048, jb6.M0(2131748620, null)));
        arrayList2.add(g86.c(2131232544, 131072, jb6.M0(2131748610, null)));
        arrayList2.add(new g86(2, 0, 0, 0, ""));
        arrayList2.add(new g86(5, 0, 0, 1, jb6.M0(2131748603, null)));
        arrayList2.add(new g86(2, 0, 0, 0, jb6.N0("LiteSmoothTransitionsInfo")));
        this.d.E(arrayList, arrayList2);
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131746801, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 4));
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231245);
        }
        this.a = new FrameLayout(context);
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        r59 r59Var2 = this.b;
        u46 u46Var = new u46();
        this.c = u46Var;
        r59Var2.setLayoutManager(u46Var);
        r59 r59Var3 = this.b;
        o93 o93Var = new o93(this, (byte) 1);
        this.d = o93Var;
        r59Var3.setAdapter(o93Var);
        this.b.setSectionsDrawBackground(true);
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.b.setItemAnimator(sc3Var);
        this.a.addView(this.b, qoe.c(-1.0f, -1));
        this.b.setOnItemClickListener(new wx4(this, (byte) 26));
        this.fragmentView = this.a;
        if (gm.O1()) {
            i = 360864;
        } else {
            i = 360928;
        }
        this.f = i;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        boolean z;
        float f;
        if (this.b != null) {
            for (int i = 0; i < this.b.getChildCount(); i++) {
                View childAt = this.b.getChildAt(i);
                if (childAt != null) {
                    this.b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.s;
                        if (R < arrayList.size()) {
                            g86 g86Var = (g86) arrayList.get(R);
                            int i2 = g86Var.a;
                            if (i2 != 3 && i2 != 4) {
                                if (i2 == 1) {
                                    ((k86) childAt).a();
                                }
                            } else {
                                l86 l86Var = (l86) childAt;
                                ImageView imageView = l86Var.e;
                                m86 m86Var = l86Var.E;
                                int i3 = g86Var.e;
                                if (i2 == 3) {
                                    if (Integer.bitCount(i3) > 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    l86Var.w = z;
                                    if (z) {
                                        l86Var.c(g86Var, true);
                                        int Z = m86Var.Z(i3);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (Z >= 0 && m86Var.n[Z]) {
                                            f = 180.0f;
                                        } else {
                                            f = 0.0f;
                                        }
                                        wi8.t(animate.rotation(f), d53.h, 240L);
                                    }
                                    l86Var.f.c(e86.e(i3), true);
                                } else {
                                    l86Var.h.a(e86.e(i3), true);
                                }
                                l86Var.b(e86.f(), true);
                            }
                        }
                    }
                }
            }
            if (this.e != null && !e86.f()) {
                this.e.b();
                this.e = null;
            }
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = e86.n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        e86.a(this.h);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        e86.k();
        vm.t();
        cmb.s1(true);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
