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
import org.telegram.ui.ActionBar.e;
public final class ad3 extends LinearLayout implements snb {
    public int E;
    public final qob a;
    public x46 b;
    public final me2 c;
    public final b29 d;
    public final skb e;
    public final skb f;
    public int h;
    public final byte n;
    public byte r;
    public Boolean s;
    public znb w;
    public boolean x;
    public hf0 y;

    public ad3(Context context, e eVar, int i) {
        super(context);
        int i2;
        x46 x46Var;
        this.b = null;
        this.h = -1;
        this.s = null;
        this.n = i;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, tre.c(-2.0f, -1));
        int currentAccount = eVar.getCurrentAccount();
        if (i != 0 && i != -1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        me2 me2Var = new me2(currentAccount, 0L, null, i2);
        this.c = me2Var;
        qob qobVar = new qob(getContext(), null, (byte) 5);
        this.a = qobVar;
        qobVar.setAdapter(me2Var);
        qobVar.setSelectorDrawableColor(0);
        qobVar.setClipChildren(false);
        qobVar.setClipToPadding(false);
        qobVar.setHasFixedSize(true);
        qobVar.setItemAnimator(null);
        qobVar.setNestedScrollingEnabled(false);
        b();
        qobVar.setFocusable(false);
        qobVar.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        qobVar.setOnItemClickListener(new l0(this, eVar, (byte) 11));
        tk4 tk4Var = new tk4(getContext(), null);
        tk4Var.setViewType(14);
        tk4Var.setVisibility(0);
        if (i != 0 && i != -1) {
            frameLayout.addView(tk4Var, tre.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(qobVar, tre.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(tk4Var, tre.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(qobVar, tre.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        qobVar.setEmptyView(tk4Var);
        qobVar.X1 = true;
        qobVar.Y1 = false;
        if (i == 0) {
            b29 b29Var = new b29(2131624235, hl.L(28.0f), hl.L(28.0f), true, null);
            this.d = b29Var;
            b29Var.h = true;
            b29Var.a0 = true;
            b29Var.j();
            skb skbVar = new skb(context);
            this.e = skbVar;
            int i3 = aob.i6;
            hf0 f0 = aob.f0(aob.w0(null, i3, false), 2, -1);
            uob M = yob.M(i3);
            skbVar.setBackground(f0);
            yob.j(skbVar, f0, null, M, null);
            addView(skbVar, tre.c(-2.0f, -1));
            skb skbVar2 = new skb(context);
            this.f = skbVar2;
            skbVar2.o(2131232102, ob6.M0(2131745219, null), false);
            addView(skbVar2, tre.c(-2.0f, -1));
            skbVar.setOnClickListener(new yc3(this, eVar, (byte) 0));
            b29Var.h = true;
            skbVar2.setOnClickListener(new r81(eVar, (byte) 27));
            if (!aob.i1()) {
                b29Var.H(b29Var.e[0] - 1);
                skbVar.p(ob6.M0(2131745195, null), b29Var, true);
                skbVar.x += 2;
            } else {
                skbVar.p(ob6.M0(2131745194, null), b29Var, true);
                skbVar.x += 2;
            }
        }
        if (!ls6.d0(eVar.getCurrentAccount()).B0.isEmpty()) {
            ArrayList arrayList = new ArrayList(ls6.d0(eVar.getCurrentAccount()).B0);
            if (i == 0) {
                ez3 ez3Var = new ez3(eVar.getCurrentAccount());
                ez3Var.e = "🎨";
                ez3Var.c = dpb.d("🎨");
                ez3Var.d = TLRPC.ChatTheme.ofEmoticon(ez3Var.e);
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i4 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i5 = 99;
                String str = "Blue";
                if (string != null && aob.O0(string) != null) {
                    if (i4 == -1) {
                        i4 = aob.O0(string).g0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    znb O0 = aob.O0(string);
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
                if (string2 != null && aob.O0(string2) != null) {
                    if (i6 == -1) {
                        i6 = aob.O0(str).g0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    znb O02 = aob.O0(string2);
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
                dz3 dz3Var = new dz3();
                dz3Var.a = aob.O0(str);
                dz3Var.e = i5;
                ez3Var.f.add(dz3Var);
                ez3Var.f.add(null);
                dz3 dz3Var2 = new dz3();
                dz3Var2.a = aob.O0(str2);
                dz3Var2.e = i6;
                ez3Var.f.add(dz3Var2);
                ez3Var.f.add(null);
                ez3Var.m(eVar.getCurrentAccount());
                ne2 ne2Var = new ne2(ez3Var);
                ne2Var.c = aob.i1() ? 0 : 2;
                arrayList.add(ne2Var);
            }
            me2Var.d = arrayList;
            me2Var.f();
        }
        a();
        c();
        updateColors();
        int i7 = this.h;
        if (i7 >= 0 && (x46Var = this.b) != null) {
            x46Var.g1(i7, hl.L(16.0f));
        }
    }

    public final void a() {
        ArrayList arrayList;
        byte b;
        byte b2;
        this.w = aob.I;
        this.x = aob.i1();
        byte b3 = 2;
        byte b4 = this.n;
        if (b4 != 0 && b4 != -1) {
            if (aob.I.k().equals("Blue")) {
                this.r = (byte) 0;
            } else if (aob.I.k().equals("Day")) {
                this.r = (byte) 1;
            } else if (aob.I.k().equals("Night")) {
                this.r = (byte) 2;
            } else if (aob.I.k().equals("Dark Blue")) {
                this.r = (byte) 3;
            } else {
                if (aob.i1() && ((b2 = this.r) == 2 || b2 == 3)) {
                    this.r = (byte) 0;
                }
                if (!aob.i1() && ((b = this.r) == 0 || b == 1)) {
                    this.r = (byte) 2;
                }
            }
        } else {
            if (aob.i1()) {
                b3 = 0;
            }
            this.r = b3;
        }
        me2 me2Var = this.c;
        if (me2Var.d != null) {
            int i = 0;
            while (true) {
                int size = me2Var.d.size();
                arrayList = me2Var.d;
                if (i >= size) {
                    break;
                }
                ((ne2) arrayList.get(i)).c = this.r;
                i++;
            }
            me2Var.l(0, arrayList.size());
        }
        c();
    }

    public final void b() {
        boolean z;
        int i;
        Point point = hl.q;
        if (point.y > point.x) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.s;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        qob qobVar = this.a;
        byte b = this.n;
        if (b != 0 && b != -1) {
            if (z) {
                i = 3;
            } else {
                i = 9;
            }
            x46 x46Var = this.b;
            if (x46Var instanceof u55) {
                ((u55) x46Var).x1(i);
            } else {
                qobVar.setHasFixedSize(false);
                getContext();
                u55 u55Var = new u55(i);
                u55Var.O = new zc3((byte) 0);
                this.b = u55Var;
                qobVar.setLayoutManager(u55Var);
            }
        } else if (this.b == null) {
            getContext();
            x46 x46Var2 = new x46(0, false);
            this.b = x46Var2;
            qobVar.setLayoutManager(x46Var2);
        }
        this.s = Boolean.valueOf(z);
    }

    public final void c() {
        boolean z;
        me2 me2Var = this.c;
        if (me2Var.d == null) {
            return;
        }
        this.h = -1;
        int i = 0;
        while (true) {
            if (i >= me2Var.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((dz3) ((ne2) me2Var.d.get(i)).a.f.get(this.r)).b;
            znb i2 = ((ne2) me2Var.d.get(i)).a.i(this.r);
            if (tL_theme != null) {
                if (aob.I.a.equals(aob.q0(tL_theme.settings.get(((dz3) ((ne2) me2Var.d.get(i)).a.f.get(this.r)).d)))) {
                    LongSparseArray longSparseArray = aob.I.d0;
                    if (longSparseArray == null) {
                        this.h = i;
                        break;
                    }
                    ynb ynbVar = (ynb) longSparseArray.get(tL_theme.id);
                    if (ynbVar != null && ynbVar.a == aob.I.Z) {
                        this.h = i;
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                if (i2 != null) {
                    if (aob.I.a.equals(i2.k())) {
                        if (((dz3) ((ne2) me2Var.d.get(i)).a.f.get(this.r)).e == aob.I.Z) {
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
            this.h = me2Var.d.size() - 1;
        }
        for (int i3 = 0; i3 < me2Var.d.size(); i3++) {
            ne2 ne2Var = (ne2) me2Var.d.get(i3);
            if (i3 == this.h) {
                z = true;
            } else {
                z = false;
            }
            ne2Var.d = z;
        }
        me2Var.E(this.h);
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
        znb znbVar;
        b29 b29Var;
        int i;
        int i2;
        if (this.c != null && (znbVar = this.w) != null && (znbVar != aob.I || this.x != aob.i1())) {
            a();
            if (this.e != null && (b29Var = this.d) != null) {
                if (!b29Var.l0) {
                    b29 b29Var2 = this.d;
                    if (aob.i1()) {
                        i2 = 0;
                    } else {
                        i2 = this.d.e[0] - 1;
                    }
                    b29Var2.H(i2);
                }
                skb skbVar = this.e;
                if (aob.i1()) {
                    i = 2131745194;
                } else {
                    i = 2131745195;
                }
                skbVar.p(ob6.M0(i, null), this.d, true);
                this.e.x += 2;
            }
        }
        byte b = this.n;
        if (b == 0 || b == -1) {
            b29 b29Var3 = this.d;
            if (b29Var3 != null) {
                b29Var3.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.q6, false), PorterDuff.Mode.SRC_IN));
            }
            skb skbVar2 = this.e;
            if (skbVar2 != null) {
                aob.F1(skbVar2.getBackground(), aob.w0(null, aob.i6, false), true);
                this.e.g(-1, aob.q6);
            }
            if (this.f != null) {
                int w0 = aob.w0(null, aob.d6, false);
                int w02 = aob.w0(null, aob.i6, false);
                hf0 hf0Var = this.y;
                if (ik8.A(hf0Var) && this.f.getBackground() == hf0Var && hf0Var.getNumberOfLayers() > 0 && (hf0Var.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) hf0Var.getDrawable(0)).setColor(w0);
                    if (w02 != this.E) {
                        this.E = w02;
                        hf0Var.setColor(ColorStateList.valueOf(w02));
                    }
                } else {
                    skb skbVar3 = this.f;
                    hf0 g0 = aob.g0(w0, w02);
                    this.y = g0;
                    skbVar3.setBackground(g0);
                    this.E = w02;
                }
                skb skbVar4 = this.f;
                int i3 = aob.q6;
                skbVar4.g(i3, i3);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
