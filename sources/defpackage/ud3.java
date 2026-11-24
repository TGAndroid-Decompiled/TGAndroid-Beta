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
public final class ud3 extends LinearLayout implements vlb {
    public int E;
    public final smb a;
    public u46 b;
    public final gf2 c;
    public final p09 d;
    public final xib e;
    public final xib f;
    public int h;
    public final byte n;
    public byte r;
    public Boolean s;
    public bmb w;
    public boolean x;
    public fg0 y;

    public ud3(Context context, d dVar, int i) {
        super(context);
        int i2;
        u46 u46Var;
        this.b = null;
        this.h = -1;
        this.s = null;
        this.n = i;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, qoe.c(-2.0f, -1));
        int currentAccount = dVar.getCurrentAccount();
        if (i != 0 && i != -1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        gf2 gf2Var = new gf2(currentAccount, 0L, null, i2);
        this.c = gf2Var;
        smb smbVar = new smb(getContext(), null, (byte) 5);
        this.a = smbVar;
        smbVar.setAdapter(gf2Var);
        smbVar.setSelectorDrawableColor(0);
        smbVar.setClipChildren(false);
        smbVar.setClipToPadding(false);
        smbVar.setHasFixedSize(true);
        smbVar.setItemAnimator(null);
        smbVar.setNestedScrollingEnabled(false);
        b();
        smbVar.setFocusable(false);
        smbVar.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        smbVar.setOnItemClickListener(new k0(this, dVar, (byte) 11));
        tk4 tk4Var = new tk4(getContext(), null);
        tk4Var.setViewType(14);
        tk4Var.setVisibility(0);
        if (i != 0 && i != -1) {
            frameLayout.addView(tk4Var, qoe.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(smbVar, qoe.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(tk4Var, qoe.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(smbVar, qoe.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        smbVar.setEmptyView(tk4Var);
        smbVar.X1 = true;
        smbVar.Y1 = false;
        if (i == 0) {
            p09 p09Var = new p09(2131624235, gm.L(28.0f), gm.L(28.0f), true, null);
            this.d = p09Var;
            p09Var.h = true;
            p09Var.a0 = true;
            p09Var.j();
            xib xibVar = new xib(context);
            this.e = xibVar;
            int i3 = cmb.h6;
            fg0 f0 = cmb.f0(cmb.w0(null, i3, false), 2, -1);
            wmb M = anb.M(i3);
            xibVar.setBackground(f0);
            anb.j(xibVar, f0, null, M, null);
            addView(xibVar, qoe.c(-2.0f, -1));
            xib xibVar2 = new xib(context);
            this.f = xibVar2;
            xibVar2.o(2131232103, jb6.M0(2131745225, null), false);
            addView(xibVar2, qoe.c(-2.0f, -1));
            xibVar.setOnClickListener(new sd3(this, dVar, (byte) 0));
            p09Var.h = true;
            xibVar2.setOnClickListener(new k81(dVar, (byte) 28));
            if (!cmb.i1()) {
                p09Var.H(p09Var.e[0] - 1);
                xibVar.p(jb6.M0(2131745201, null), p09Var, true);
                xibVar.x += 2;
            } else {
                xibVar.p(jb6.M0(2131745200, null), p09Var, true);
                xibVar.x += 2;
            }
        }
        if (!hs6.d0(dVar.getCurrentAccount()).B0.isEmpty()) {
            ArrayList arrayList = new ArrayList(hs6.d0(dVar.getCurrentAccount()).B0);
            if (i == 0) {
                tz3 tz3Var = new tz3(dVar.getCurrentAccount());
                tz3Var.e = "🎨";
                tz3Var.c = fnb.d("🎨");
                tz3Var.d = TLRPC.ChatTheme.ofEmoticon(tz3Var.e);
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i4 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i5 = 99;
                String str = "Blue";
                if (string != null && cmb.O0(string) != null) {
                    if (i4 == -1) {
                        i4 = cmb.O0(string).g0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    bmb O0 = cmb.O0(string);
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
                if (string2 != null && cmb.O0(string2) != null) {
                    if (i6 == -1) {
                        i6 = cmb.O0(str).g0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    bmb O02 = cmb.O0(string2);
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
                sz3 sz3Var = new sz3();
                sz3Var.a = cmb.O0(str);
                sz3Var.e = i5;
                tz3Var.f.add(sz3Var);
                tz3Var.f.add(null);
                sz3 sz3Var2 = new sz3();
                sz3Var2.a = cmb.O0(str2);
                sz3Var2.e = i6;
                tz3Var.f.add(sz3Var2);
                tz3Var.f.add(null);
                tz3Var.m(dVar.getCurrentAccount());
                hf2 hf2Var = new hf2(tz3Var);
                hf2Var.c = cmb.i1() ? 0 : 2;
                arrayList.add(hf2Var);
            }
            gf2Var.d = arrayList;
            gf2Var.f();
        }
        a();
        c();
        updateColors();
        int i7 = this.h;
        if (i7 >= 0 && (u46Var = this.b) != null) {
            u46Var.g1(i7, gm.L(16.0f));
        }
    }

    public final void a() {
        ArrayList arrayList;
        byte b;
        byte b2;
        this.w = cmb.I;
        this.x = cmb.i1();
        byte b3 = 2;
        byte b4 = this.n;
        if (b4 != 0 && b4 != -1) {
            if (cmb.I.k().equals("Blue")) {
                this.r = (byte) 0;
            } else if (cmb.I.k().equals("Day")) {
                this.r = (byte) 1;
            } else if (cmb.I.k().equals("Night")) {
                this.r = (byte) 2;
            } else if (cmb.I.k().equals("Dark Blue")) {
                this.r = (byte) 3;
            } else {
                if (cmb.i1() && ((b2 = this.r) == 2 || b2 == 3)) {
                    this.r = (byte) 0;
                }
                if (!cmb.i1() && ((b = this.r) == 0 || b == 1)) {
                    this.r = (byte) 2;
                }
            }
        } else {
            if (cmb.i1()) {
                b3 = 0;
            }
            this.r = b3;
        }
        gf2 gf2Var = this.c;
        if (gf2Var.d != null) {
            int i = 0;
            while (true) {
                int size = gf2Var.d.size();
                arrayList = gf2Var.d;
                if (i >= size) {
                    break;
                }
                ((hf2) arrayList.get(i)).c = this.r;
                i++;
            }
            gf2Var.l(0, arrayList.size());
        }
        c();
    }

    public final void b() {
        boolean z;
        int i;
        Point point = gm.q;
        if (point.y > point.x) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.s;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        smb smbVar = this.a;
        byte b = this.n;
        if (b != 0 && b != -1) {
            if (z) {
                i = 3;
            } else {
                i = 9;
            }
            u46 u46Var = this.b;
            if (u46Var instanceof q55) {
                ((q55) u46Var).x1(i);
            } else {
                smbVar.setHasFixedSize(false);
                getContext();
                q55 q55Var = new q55(i);
                q55Var.O = new td3((byte) 0);
                this.b = q55Var;
                smbVar.setLayoutManager(q55Var);
            }
        } else if (this.b == null) {
            getContext();
            u46 u46Var2 = new u46(0, false);
            this.b = u46Var2;
            smbVar.setLayoutManager(u46Var2);
        }
        this.s = Boolean.valueOf(z);
    }

    public final void c() {
        boolean z;
        gf2 gf2Var = this.c;
        if (gf2Var.d == null) {
            return;
        }
        this.h = -1;
        int i = 0;
        while (true) {
            if (i >= gf2Var.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((sz3) ((hf2) gf2Var.d.get(i)).a.f.get(this.r)).b;
            bmb i2 = ((hf2) gf2Var.d.get(i)).a.i(this.r);
            if (tL_theme != null) {
                if (cmb.I.a.equals(cmb.q0(tL_theme.settings.get(((sz3) ((hf2) gf2Var.d.get(i)).a.f.get(this.r)).d)))) {
                    LongSparseArray longSparseArray = cmb.I.d0;
                    if (longSparseArray == null) {
                        this.h = i;
                        break;
                    }
                    amb ambVar = (amb) longSparseArray.get(tL_theme.id);
                    if (ambVar != null && ambVar.a == cmb.I.Z) {
                        this.h = i;
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                if (i2 != null) {
                    if (cmb.I.a.equals(i2.k())) {
                        if (((sz3) ((hf2) gf2Var.d.get(i)).a.f.get(this.r)).e == cmb.I.Z) {
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
            this.h = gf2Var.d.size() - 1;
        }
        for (int i3 = 0; i3 < gf2Var.d.size(); i3++) {
            hf2 hf2Var = (hf2) gf2Var.d.get(i3);
            if (i3 == this.h) {
                z = true;
            } else {
                z = false;
            }
            hf2Var.d = z;
        }
        gf2Var.E(this.h);
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
        bmb bmbVar;
        p09 p09Var;
        int i;
        int i2;
        if (this.c != null && (bmbVar = this.w) != null && (bmbVar != cmb.I || this.x != cmb.i1())) {
            a();
            if (this.e != null && (p09Var = this.d) != null) {
                if (!p09Var.l0) {
                    p09 p09Var2 = this.d;
                    if (cmb.i1()) {
                        i2 = 0;
                    } else {
                        i2 = this.d.e[0] - 1;
                    }
                    p09Var2.H(i2);
                }
                xib xibVar = this.e;
                if (cmb.i1()) {
                    i = 2131745200;
                } else {
                    i = 2131745201;
                }
                xibVar.p(jb6.M0(i, null), this.d, true);
                this.e.x += 2;
            }
        }
        byte b = this.n;
        if (b == 0 || b == -1) {
            p09 p09Var3 = this.d;
            if (p09Var3 != null) {
                p09Var3.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.p6, false), PorterDuff.Mode.SRC_IN));
            }
            xib xibVar2 = this.e;
            if (xibVar2 != null) {
                cmb.F1(xibVar2.getBackground(), cmb.w0(null, cmb.h6, false), true);
                this.e.g(-1, cmb.p6);
            }
            if (this.f != null) {
                int w0 = cmb.w0(null, cmb.c6, false);
                int w02 = cmb.w0(null, cmb.h6, false);
                fg0 fg0Var = this.y;
                if (wi8.A(fg0Var) && this.f.getBackground() == fg0Var && fg0Var.getNumberOfLayers() > 0 && (fg0Var.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) fg0Var.getDrawable(0)).setColor(w0);
                    if (w02 != this.E) {
                        this.E = w02;
                        fg0Var.setColor(ColorStateList.valueOf(w02));
                    }
                } else {
                    xib xibVar3 = this.f;
                    fg0 g0 = cmb.g0(w0, w02);
                    this.y = g0;
                    xibVar3.setBackground(g0);
                    this.E = w02;
                }
                xib xibVar4 = this.f;
                int i3 = cmb.p6;
                xibVar4.g(i3, i3);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
