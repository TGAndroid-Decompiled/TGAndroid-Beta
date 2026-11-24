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
public final class m66 extends d {
    public FrameLayout a;
    public o39 b;
    public t26 c;
    public c83 d;
    public m21 e;
    public int f;
    public final hj3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public m66() {
        super(null);
        this.h = new hj3(this, (byte) 23);
        this.n = new boolean[3];
        this.r = new ArrayList();
        this.s = new ArrayList();
    }

    public final int Y(int i) {
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

    public final void Z(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i2 < arrayList.size()) {
                if (((g66) arrayList.get(i2)).e == i) {
                    this.b.f1(new jh(this, i2, (byte) 11), 700, true);
                    return;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void a0(int i) {
        int Y = Y(i);
        if (Y == -1) {
            return;
        }
        this.n[Y] = true;
        c0();
        b0();
    }

    public final void b0() {
        String a0;
        ArrayList arrayList = this.r;
        arrayList.clear();
        ArrayList arrayList2 = this.s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new g66(1, 0, 0, 0, null));
        if (e66.c() <= 0) {
            a0 = k96.M0(2131748679, null);
        } else if (e66.c() >= 100) {
            a0 = k96.M0(2131748678, null);
        } else {
            a0 = k96.a0(null, null, 2131748680, String.format("%d%%", Integer.valueOf(e66.c())));
        }
        arrayList2.add(new g66(2, 0, 0, 0, a0));
        arrayList2.add(new g66(0, 0, 0, 0, k96.M0(2131748656, null)));
        arrayList2.add(g66.c(2131232043, 3, k96.M0(2131748658, null)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(g66.b(1, k96.M0(2131748670, null)));
            arrayList2.add(g66.b(2, k96.M0(2131748672, null)));
        }
        arrayList2.add(g66.c(2131232041, 28700, k96.M0(2131748663, null)));
        if (zArr[1]) {
            arrayList2.add(g66.b(16388, k96.M0(2131748670, null)));
            arrayList2.add(g66.b(8200, k96.M0(2131748669, null)));
            arrayList2.add(g66.b(4112, k96.M0(2131748672, null)));
        }
        arrayList2.add(g66.c(2131232021, this.f, k96.M0(2131748664, null)));
        if (zArr[2]) {
            arrayList2.add(g66.b(32, k96.N0("LiteOptionsBackground")));
            if (!gl.O1()) {
                arrayList2.add(g66.b(64, k96.N0("LiteOptionsTopics")));
            }
            arrayList2.add(g66.b(128, k96.N0("LiteOptionsSpoiler")));
            if (gba.o() < 1) {
                boolean z = w01.a;
            } else {
                arrayList2.add(g66.b(256, k96.N0("LiteOptionsBlur2")));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (gba.o() < 1) {
                    boolean z2 = w01.a;
                } else {
                    arrayList2.add(g66.b(262144, k96.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(g66.b(32768, k96.N0("LiteOptionsScale")));
            if (ijb.c()) {
                arrayList2.add(g66.b(65536, k96.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(g66.c(2131232025, 512, k96.M0(2131748665, null)));
        arrayList2.add(g66.c(2131232045, 1024, k96.M0(2131748668, null)));
        arrayList2.add(g66.c(2131232032, 2048, k96.M0(2131748671, null)));
        arrayList2.add(g66.c(2131232532, 131072, k96.M0(2131748661, null)));
        arrayList2.add(new g66(2, 0, 0, 0, ""));
        arrayList2.add(new g66(5, 0, 0, 1, k96.M0(2131748654, null)));
        arrayList2.add(new g66(2, 0, 0, 0, k96.N0("LiteSmoothTransitionsInfo")));
        this.d.E(arrayList, arrayList2);
    }

    public final void c0() {
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
                            g66 g66Var = (g66) arrayList.get(R);
                            int i2 = g66Var.a;
                            if (i2 != 3 && i2 != 4) {
                                if (i2 == 1) {
                                    ((k66) childAt).a();
                                }
                            } else {
                                l66 l66Var = (l66) childAt;
                                ImageView imageView = l66Var.e;
                                m66 m66Var = l66Var.E;
                                int i3 = g66Var.e;
                                if (i2 == 3) {
                                    if (Integer.bitCount(i3) > 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    l66Var.w = z;
                                    if (z) {
                                        l66Var.c(g66Var, true);
                                        int Y = m66Var.Y(i3);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (Y >= 0 && m66Var.n[Y]) {
                                            f = 180.0f;
                                        } else {
                                            f = 0.0f;
                                        }
                                        ug8.t(animate.rotation(f), s33.h, 240L);
                                    }
                                    l66Var.f.c(e66.e(i3), true);
                                } else {
                                    l66Var.h.a(e66.e(i3), true);
                                }
                                l66Var.b(e66.f(), true);
                            }
                        }
                    }
                }
            }
            if (this.e != null && !e66.f()) {
                this.e.b();
                this.e = null;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131746875, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 3));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.a = new FrameLayout(context);
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        o39 o39Var2 = this.b;
        t26 t26Var = new t26();
        this.c = t26Var;
        o39Var2.setLayoutManager(t26Var);
        o39 o39Var3 = this.b;
        c83 c83Var = new c83(this, (byte) 1);
        this.d = c83Var;
        o39Var3.setAdapter(c83Var);
        this.b.setSectionsDrawBackground(true);
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.b.setItemAnimator(gb3Var);
        this.a.addView(this.b, nme.c(-1.0f, -1));
        this.b.setOnItemClickListener(new ry4(this, (byte) 23));
        this.fragmentView = this.a;
        if (gl.O1()) {
            i = 360864;
        } else {
            i = 360928;
        }
        this.f = i;
        b0();
        return this.fragmentView;
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = e66.n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        e66.a(this.h);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        e66.k();
        vl.t();
        bkb.s1(true);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
