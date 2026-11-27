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
import org.telegram.ui.ActionBar.e;
public final class q86 extends e {
    public FrameLayout a;
    public d79 b;
    public x46 c;
    public v83 d;
    public v21 e;
    public int f;
    public final zj3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public q86() {
        super(null);
        this.h = new zj3(this, (byte) 23);
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
                if (((k86) arrayList.get(i2)).e == i) {
                    this.b.g1(new wg(this, i2, (byte) 11), 700, true);
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
        arrayList2.add(new k86(1, 0, 0, 0, null));
        if (i86.c() <= 0) {
            a0 = ob6.M0(2131748625, null);
        } else if (i86.c() >= 100) {
            a0 = ob6.M0(2131748624, null);
        } else {
            a0 = ob6.a0(null, null, 2131748626, String.format("%d%%", Integer.valueOf(i86.c())));
        }
        arrayList2.add(new k86(2, 0, 0, 0, a0));
        arrayList2.add(new k86(0, 0, 0, 0, ob6.M0(2131748602, null)));
        arrayList2.add(k86.c(2131232043, 3, ob6.M0(2131748604, null)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(k86.b(1, ob6.M0(2131748616, null)));
            arrayList2.add(k86.b(2, ob6.M0(2131748618, null)));
        }
        arrayList2.add(k86.c(2131232041, 28700, ob6.M0(2131748609, null)));
        if (zArr[1]) {
            arrayList2.add(k86.b(16388, ob6.M0(2131748616, null)));
            arrayList2.add(k86.b(8200, ob6.M0(2131748615, null)));
            arrayList2.add(k86.b(4112, ob6.M0(2131748618, null)));
        }
        arrayList2.add(k86.c(2131232021, this.f, ob6.M0(2131748610, null)));
        if (zArr[2]) {
            arrayList2.add(k86.b(32, ob6.N0("LiteOptionsBackground")));
            if (!hl.O1()) {
                arrayList2.add(k86.b(64, ob6.N0("LiteOptionsTopics")));
            }
            arrayList2.add(k86.b(128, ob6.N0("LiteOptionsSpoiler")));
            if (xea.o() < 1) {
                boolean z = f11.a;
            } else {
                arrayList2.add(k86.b(256, ob6.N0("LiteOptionsBlur2")));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (xea.o() < 1) {
                    boolean z2 = f11.a;
                } else {
                    arrayList2.add(k86.b(262144, ob6.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(k86.b(32768, ob6.N0("LiteOptionsScale")));
            if (hnb.c()) {
                arrayList2.add(k86.b(65536, ob6.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(k86.c(2131232025, 512, ob6.M0(2131748611, null)));
        arrayList2.add(k86.c(2131232045, 1024, ob6.M0(2131748614, null)));
        arrayList2.add(k86.c(2131232032, 2048, ob6.M0(2131748617, null)));
        arrayList2.add(k86.c(2131232543, 131072, ob6.M0(2131748607, null)));
        arrayList2.add(new k86(2, 0, 0, 0, ""));
        arrayList2.add(new k86(5, 0, 0, 1, ob6.M0(2131748600, null)));
        arrayList2.add(new k86(2, 0, 0, 0, ob6.N0("LiteSmoothTransitionsInfo")));
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
                    int S = RecyclerView.S(childAt);
                    if (S >= 0) {
                        ArrayList arrayList = this.s;
                        if (S < arrayList.size()) {
                            k86 k86Var = (k86) arrayList.get(S);
                            int i2 = k86Var.a;
                            if (i2 != 3 && i2 != 4) {
                                if (i2 == 1) {
                                    ((o86) childAt).a();
                                }
                            } else {
                                p86 p86Var = (p86) childAt;
                                ImageView imageView = p86Var.e;
                                q86 q86Var = p86Var.E;
                                int i3 = k86Var.e;
                                if (i2 == 3) {
                                    if (Integer.bitCount(i3) > 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    p86Var.w = z;
                                    if (z) {
                                        p86Var.c(k86Var, true);
                                        int Y = q86Var.Y(i3);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (Y >= 0 && q86Var.n[Y]) {
                                            f = 180.0f;
                                        } else {
                                            f = 0.0f;
                                        }
                                        ik8.t(animate.rotation(f), k43.h, 240L);
                                    }
                                    p86Var.f.c(i86.e(i3), true);
                                } else {
                                    p86Var.h.a(i86.e(i3), true);
                                }
                                p86Var.b(i86.f(), true);
                            }
                        }
                    }
                }
            }
            if (this.e != null && !i86.f()) {
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
        this.simpleActionBar.setTitle(ob6.M0(2131746795, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 4));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.a = new FrameLayout(context);
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        d79 d79Var2 = this.b;
        x46 x46Var = new x46();
        this.c = x46Var;
        d79Var2.setLayoutManager(x46Var);
        d79 d79Var3 = this.b;
        v83 v83Var = new v83(this, (byte) 1);
        this.d = v83Var;
        d79Var3.setAdapter(v83Var);
        this.b.setSectionsDrawBackground(true);
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.b.setItemAnimator(zb3Var);
        this.a.addView(this.b, tre.c(-1.0f, -1));
        this.b.setOnItemClickListener(new e05(this, (byte) 25));
        this.fragmentView = this.a;
        if (hl.O1()) {
            i = 360864;
        } else {
            i = 360928;
        }
        this.f = i;
        b0();
        return this.fragmentView;
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = i86.n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        i86.a(this.h);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        i86.k();
        wl.t();
        aob.s1(true);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
