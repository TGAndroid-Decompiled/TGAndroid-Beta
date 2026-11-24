package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class hc3 extends LinearLayout implements tjb {
    public int E;
    public final rkb a;
    public t26 b;
    public final vd2 c;
    public final oy8 d;
    public final wgb e;
    public final wgb f;
    public int h;
    public final byte n;
    public byte r;
    public Boolean s;
    public akb w;
    public boolean x;
    public ff0 y;

    public hc3(Context context, d dVar, int i) {
        super(context);
        int i2;
        t26 t26Var;
        this.b = null;
        this.h = -1;
        this.s = null;
        this.n = i;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, nme.c(-2.0f, -1));
        int currentAccount = dVar.getCurrentAccount();
        if (i != 0 && i != -1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        vd2 vd2Var = new vd2(currentAccount, 0L, null, i2);
        this.c = vd2Var;
        rkb rkbVar = new rkb(getContext(), null, (byte) 5);
        this.a = rkbVar;
        rkbVar.setAdapter(vd2Var);
        rkbVar.setSelectorDrawableColor(0);
        rkbVar.setClipChildren(false);
        rkbVar.setClipToPadding(false);
        rkbVar.setHasFixedSize(true);
        rkbVar.setItemAnimator(null);
        rkbVar.setNestedScrollingEnabled(false);
        b();
        rkbVar.setFocusable(false);
        rkbVar.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        rkbVar.setOnItemClickListener(new k0(this, dVar, (byte) 11));
        pi4 pi4Var = new pi4(getContext(), null);
        pi4Var.setViewType(14);
        pi4Var.setVisibility(0);
        if (i != 0 && i != -1) {
            frameLayout.addView(pi4Var, nme.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(rkbVar, nme.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(pi4Var, nme.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(rkbVar, nme.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        rkbVar.setEmptyView(pi4Var);
        rkbVar.X1 = true;
        rkbVar.Y1 = false;
        if (i == 0) {
            oy8 oy8Var = new oy8(2131624235, gl.L(28.0f), gl.L(28.0f), true, null);
            this.d = oy8Var;
            oy8Var.h = true;
            oy8Var.a0 = true;
            oy8Var.j();
            wgb wgbVar = new wgb(context);
            this.e = wgbVar;
            int i3 = bkb.h6;
            ff0 f0 = bkb.f0(bkb.w0(null, i3, false), 2, -1);
            vkb M = zkb.M(i3);
            wgbVar.setBackground(f0);
            zkb.j(wgbVar, f0, null, M, null);
            addView(wgbVar, nme.c(-2.0f, -1));
            wgb wgbVar2 = new wgb(context);
            this.f = wgbVar2;
            wgbVar2.o(2131232102, k96.M0(2131745299, null), false);
            addView(wgbVar2, nme.c(-2.0f, -1));
            wgbVar.setOnClickListener(new fc3(this, dVar, (byte) 0));
            oy8Var.h = true;
            wgbVar2.setOnClickListener(new x91(dVar, (byte) 25));
            if (!bkb.i1()) {
                oy8Var.H(oy8Var.e[0] - 1);
                wgbVar.p(k96.M0(2131745275, null), oy8Var, true);
                wgbVar.x += 2;
            } else {
                wgbVar.p(k96.M0(2131745274, null), oy8Var, true);
                wgbVar.x += 2;
            }
        }
        if (!hq6.d0(dVar.getCurrentAccount()).B0.isEmpty()) {
            ArrayList arrayList = new ArrayList(hq6.d0(dVar.getCurrentAccount()).B0);
            if (i == 0) {
                jy3 jy3Var = new jy3(dVar.getCurrentAccount());
                jy3Var.e = "🎨";
                jy3Var.c = elb.d("🎨");
                jy3Var.d = TLRPC.ChatTheme.ofEmoticon(jy3Var.e);
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i4 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i5 = 99;
                String str = "Blue";
                if (string != null && bkb.O0(string) != null) {
                    if (i4 == -1) {
                        i4 = bkb.O0(string).g0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    akb O0 = bkb.O0(string);
                    if (O0 == null) {
                        i4 = 99;
                        string = "Blue";
                    } else {
                        i4 = O0.Z;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                }
                if (i4 != -1) {
                    str = string;
                    i5 = i4;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i6 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 != null && bkb.O0(string2) != null) {
                    if (i6 == -1) {
                        i6 = bkb.O0(str).g0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    akb O02 = bkb.O0(string2);
                    if (O02 == null) {
                        i6 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i6 = O02.Z;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                }
                if (i6 == -1) {
                    i6 = 0;
                } else {
                    str2 = string2;
                }
                iy3 iy3Var = new iy3();
                iy3Var.a = bkb.O0(str);
                iy3Var.e = i5;
                jy3Var.f.add(iy3Var);
                jy3Var.f.add(null);
                iy3 iy3Var2 = new iy3();
                iy3Var2.a = bkb.O0(str2);
                iy3Var2.e = i6;
                jy3Var.f.add(iy3Var2);
                jy3Var.f.add(null);
                jy3Var.m(dVar.getCurrentAccount());
                wd2 wd2Var = new wd2(jy3Var);
                wd2Var.c = bkb.i1() ? 0 : 2;
                arrayList.add(wd2Var);
            }
            vd2Var.d = arrayList;
            vd2Var.f();
        }
        a();
        c();
        updateColors();
        int i7 = this.h;
        if (i7 >= 0 && (t26Var = this.b) != null) {
            t26Var.g1(i7, gl.L(16.0f));
        }
    }

    public final void a() {
        ArrayList arrayList;
        byte b;
        byte b2;
        this.w = bkb.I;
        this.x = bkb.i1();
        byte b3 = 2;
        byte b4 = this.n;
        if (b4 != 0 && b4 != -1) {
            if (bkb.I.k().equals("Blue")) {
                this.r = (byte) 0;
            } else if (bkb.I.k().equals("Day")) {
                this.r = (byte) 1;
            } else if (bkb.I.k().equals("Night")) {
                this.r = (byte) 2;
            } else if (bkb.I.k().equals("Dark Blue")) {
                this.r = (byte) 3;
            } else {
                if (bkb.i1() && ((b2 = this.r) == 2 || b2 == 3)) {
                    this.r = (byte) 0;
                }
                if (!bkb.i1() && ((b = this.r) == 0 || b == 1)) {
                    this.r = (byte) 2;
                }
            }
        } else {
            if (bkb.i1()) {
                b3 = 0;
            }
            this.r = b3;
        }
        vd2 vd2Var = this.c;
        if (vd2Var.d != null) {
            int i = 0;
            while (true) {
                int size = vd2Var.d.size();
                arrayList = vd2Var.d;
                if (i >= size) {
                    break;
                }
                ((wd2) arrayList.get(i)).c = this.r;
                i++;
            }
            vd2Var.l(0, arrayList.size());
        }
        c();
    }

    public final void b() {
        boolean z;
        int i;
        Point point = gl.q;
        if (point.y > point.x) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.s;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        rkb rkbVar = this.a;
        byte b = this.n;
        if (b != 0 && b != -1) {
            if (z) {
                i = 3;
            } else {
                i = 9;
            }
            t26 t26Var = this.b;
            if (t26Var instanceof r35) {
                ((r35) t26Var).x1(i);
            } else {
                rkbVar.setHasFixedSize(false);
                getContext();
                r35 r35Var = new r35(i);
                r35Var.O = new gc3((byte) 0);
                this.b = r35Var;
                rkbVar.setLayoutManager(r35Var);
            }
        } else if (this.b == null) {
            getContext();
            t26 t26Var2 = new t26(0, false);
            this.b = t26Var2;
            rkbVar.setLayoutManager(t26Var2);
        }
        this.s = Boolean.valueOf(z);
    }

    public final void c() {
        boolean z;
        vd2 vd2Var = this.c;
        if (vd2Var.d == null) {
            return;
        }
        this.h = -1;
        int i = 0;
        while (true) {
            if (i >= vd2Var.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((iy3) ((wd2) vd2Var.d.get(i)).a.f.get(this.r)).b;
            akb i2 = ((wd2) vd2Var.d.get(i)).a.i(this.r);
            if (tL_theme != null) {
                if (bkb.I.a.equals(bkb.q0(tL_theme.settings.get(((iy3) ((wd2) vd2Var.d.get(i)).a.f.get(this.r)).d)))) {
                    LongSparseArray longSparseArray = bkb.I.d0;
                    if (longSparseArray == null) {
                        this.h = i;
                        break;
                    }
                    zjb zjbVar = (zjb) longSparseArray.get(tL_theme.id);
                    if (zjbVar != null && zjbVar.a == bkb.I.Z) {
                        this.h = i;
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                if (i2 != null) {
                    if (bkb.I.a.equals(i2.k())) {
                        if (((iy3) ((wd2) vd2Var.d.get(i)).a.f.get(this.r)).e == bkb.I.Z) {
                            this.h = i;
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i++;
            }
        }
        if (this.h == -1 && this.n != 3) {
            this.h = vd2Var.d.size() - 1;
        }
        for (int i3 = 0; i3 < vd2Var.d.size(); i3++) {
            wd2 wd2Var = (wd2) vd2Var.d.get(i3);
            if (i3 == this.h) {
                z = true;
            } else {
                z = false;
            }
            wd2Var.d = z;
        }
        vd2Var.E(this.h);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        b();
        super.onMeasure(i, i2);
    }

    @Override
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        updateColors();
    }

    @Override
    public final void updateColors() {
        akb akbVar;
        oy8 oy8Var;
        int i;
        int i2;
        if (this.c != null && (akbVar = this.w) != null && (akbVar != bkb.I || this.x != bkb.i1())) {
            a();
            if (this.e != null && (oy8Var = this.d) != null) {
                if (!oy8Var.l0) {
                    oy8 oy8Var2 = this.d;
                    if (bkb.i1()) {
                        i2 = 0;
                    } else {
                        i2 = this.d.e[0] - 1;
                    }
                    oy8Var2.H(i2);
                }
                wgb wgbVar = this.e;
                if (bkb.i1()) {
                    i = 2131745274;
                } else {
                    i = 2131745275;
                }
                wgbVar.p(k96.M0(i, null), this.d, true);
                this.e.x += 2;
            }
        }
        byte b = this.n;
        if (b == 0 || b == -1) {
            oy8 oy8Var3 = this.d;
            if (oy8Var3 != null) {
                oy8Var3.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.p6, false), PorterDuff.Mode.SRC_IN));
            }
            wgb wgbVar2 = this.e;
            if (wgbVar2 != null) {
                bkb.F1(wgbVar2.getBackground(), bkb.w0(null, bkb.h6, false), true);
                this.e.g(-1, bkb.p6);
            }
            if (this.f != null) {
                int w0 = bkb.w0(null, bkb.c6, false);
                int w02 = bkb.w0(null, bkb.h6, false);
                ff0 ff0Var = this.y;
                if (ug8.A(ff0Var) && this.f.getBackground() == ff0Var && ff0Var.getNumberOfLayers() > 0 && (ff0Var.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) ff0Var.getDrawable(0)).setColor(w0);
                    if (w02 != this.E) {
                        this.E = w02;
                        ff0Var.setColor(ColorStateList.valueOf(w02));
                    }
                } else {
                    wgb wgbVar3 = this.f;
                    ff0 g0 = bkb.g0(w0, w02);
                    this.y = g0;
                    wgbVar3.setBackground(g0);
                    this.E = w02;
                }
                wgb wgbVar4 = this.f;
                int i3 = bkb.p6;
                wgbVar4.g(i3, i3);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
