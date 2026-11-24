package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.RadioButton;
public class l7c extends ka {
    public mg0 F;
    public i7c J;
    public i7c K;
    public int L;
    public boolean M;
    public jac N;
    public boolean O;
    public final r59 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public boolean s;
    public jac w;
    public final ylb x;
    public boolean r = true;
    public final ArrayList y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public boolean G = false;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final fe P = new fe(this, (byte) 5);

    public l7c(r59 r59Var, Context context, int i, int i2, boolean z, jac jacVar, ylb ylbVar) {
        this.d = r59Var;
        this.e = context;
        this.f = i;
        this.h = i2;
        this.n = z;
        this.w = jacVar;
        this.x = ylbVar;
        O(false);
    }

    public static boolean K(int i) {
        if (i >= 10000) {
            b6c G = c6c.G(i);
            if (G == null || !G.g()) {
                return false;
            }
            return true;
        } else if (i != 7 && i != 8 && i != 38 && i != 31 && i != -4 && i != 28 && i != 2 && i != -2) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean D(u69 u69Var) {
        int i = u69Var.f;
        c6c G = G(u69Var.b());
        if (i >= 10000) {
            b6c G2 = c6c.G(i);
            if (G2 == null || !G2.f()) {
                return false;
            }
        } else if (i != 3 && i != 5 && i != 6 && i != 30 && i != 4 && i != 10 && i != 44 && i != 11 && i != 12 && i != 17 && i != 16 && i != 29 && i != 25 && i != 27 && i != 32 && i != 33 && i != 35 && i != 36 && i != 37 && i != 41 && i != 39 && i != 40 && i != 38) {
            return false;
        }
        if (G != null && !G.g) {
            return false;
        }
        return true;
    }

    public final void F(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.I;
            if (i < arrayList.size()) {
                i7c i7cVar = (i7c) arrayList.get(i);
                this.N.a(Integer.valueOf(i), new ArrayList(this.E.subList(i7cVar.a, i7cVar.b + 1)));
                this.M = false;
            }
        }
    }

    public final c6c G(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.E;
            if (i < arrayList.size()) {
                return (c6c) arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    public final int H(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i2 < arrayList.size()) {
                i7c i7cVar = (i7c) arrayList.get(i2);
                if (i >= i7cVar.a && i <= i7cVar.b) {
                    return i2;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i) {
        return cmb.v0(i, this.x);
    }

    public final boolean J(int i) {
        c6c G = G(i);
        c6c G2 = G(i + 1);
        if (G != null && !G.j && G2 != null && K(G2.a) == K(G.a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        i7c i7cVar = this.K;
        if (i7cVar != null) {
            i7cVar.b = Math.max(0, this.E.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.K = obj;
        obj.a = this.E.size();
        i7c i7cVar = this.K;
        i7cVar.b = -1;
        ArrayList arrayList = this.I;
        arrayList.add(i7cVar);
        return arrayList.size() - 1;
    }

    public final boolean N(int i) {
        if (this.r) {
            r59 r59Var = this.d;
            if (r59Var == null || !r59Var.c1() || !r59Var.getSectionsDrawBackground()) {
                if (i < 10000) {
                    switch (i) {
                        case -5:
                        case -3:
                        case 0:
                        case 1:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                            return true;
                        case -4:
                        case -2:
                        case -1:
                        case 2:
                        case 7:
                        case 8:
                        case 26:
                        case 31:
                        case 38:
                        default:
                            return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public void O(boolean z) {
        r59 r59Var = this.d;
        if (r59Var != null && r59Var.d0()) {
            r59Var.post(new n28((byte) 24, this, z));
        } else {
            Q(z);
        }
    }

    public final void P(u69 u69Var) {
        int i;
        View view = u69Var.a;
        if (view instanceof vlb) {
            ((vlb) view).updateColors();
            Object tag = view.getTag(2131296712);
            int i2 = anb.b;
            if (N(u69Var.f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i2)) {
                if (this.n) {
                    i = cmb.g5;
                } else {
                    i = cmb.c6;
                }
                view.setBackgroundColor(I(i));
            }
            view.setTag(2131296712, Integer.valueOf(i2));
        }
    }

    public final void Q(boolean z) {
        r59 r59Var = this.d;
        if (r59Var == null || !r59Var.d0()) {
            ArrayList arrayList = this.y;
            arrayList.clear();
            ArrayList arrayList2 = this.E;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.J = null;
            this.H.clear();
            this.I.clear();
            jac jacVar = this.w;
            if (jacVar != null) {
                jacVar.a(arrayList2, this);
                S();
                if (z) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(u69 u69Var, boolean z) {
        if (u69Var != null) {
            View view = u69Var.a;
            int i = u69Var.f;
            if (i >= 10000) {
                b6c G = c6c.G(i);
                if (G != null) {
                    G.a(this.d, view, G(u69Var.b()));
                }
            } else if (i != 16) {
            } else {
                ((kz8) view).setReorder(z);
            }
        }
    }

    public final void S() {
        r59 r59Var = this.d;
        if (r59Var != null) {
            ArrayList arrayList = r59Var.L2;
            if (arrayList == null) {
                r59Var.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.H;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                i7c i7cVar = (i7c) obj;
                r59Var.L2.add(Long.valueOf(gm.u2(i7cVar.a, i7cVar.b)));
            }
        }
    }

    public final void T() {
        ArrayList arrayList = this.y;
        arrayList.clear();
        ArrayList arrayList2 = this.E;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.H.clear();
        this.I.clear();
        jac jacVar = this.w;
        if (jacVar != null) {
            jacVar.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        i7c i7cVar = this.J;
        if (i7cVar != null) {
            i7cVar.b = Math.max(0, (this.E.size() + (this.G ? 1 : 0)) - 1);
            i7c i7cVar2 = this.J;
            if (i7cVar2.a == i7cVar2.b) {
                this.H.remove(i7cVar2);
            }
            this.J = null;
        }
    }

    public final void V() {
        ?? obj = new Object();
        this.J = obj;
        obj.a = this.E.size() + (this.G ? 1 : 0);
        i7c i7cVar = this.J;
        i7cVar.b = -1;
        this.H.add(i7cVar);
    }

    @Override
    public final int b() {
        return this.E.size();
    }

    @Override
    public final int d(int i) {
        c6c G = G(i);
        if (G == null) {
            return 0;
        }
        return G.a;
    }

    @Override
    public void t(defpackage.u69 r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l7c.t(u69, int):void");
    }

    @Override
    public u69 x(ViewGroup viewGroup, int i) {
        int i2;
        View frameLayout;
        tk4 jf5Var;
        View jf5Var2;
        View yn7Var;
        boolean z;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        int i7;
        jf5 jf5Var3;
        boolean z2 = this.n;
        if (z2) {
            i2 = cmb.g5;
        } else {
            i2 = cmb.c6;
        }
        r59 r59Var = this.d;
        ylb ylbVar = this.x;
        Context context = this.e;
        if (i >= 10000) {
            b6c G = c6c.G(i);
            if (G != null) {
                jf5Var = G.d(context, r59Var, this.f, ylbVar);
            } else {
                jf5Var = new View(context);
            }
        } else {
            int i8 = 3;
            int i9 = 8;
            boolean z3 = true;
            switch (i) {
                case -5:
                    frameLayout = new FrameLayout(context);
                    frameLayout.setTag(-33024);
                    jf5Var = frameLayout;
                    break;
                case -4:
                case -1:
                    frameLayout = new ct8(context, (byte) 19);
                    if (i == -4) {
                        frameLayout.setTag(-33024);
                    }
                    jf5Var = frameLayout;
                    break;
                case -3:
                    ?? frameLayout2 = new FrameLayout(context);
                    frameLayout2.a = 0;
                    jf5Var = frameLayout2;
                    break;
                case -2:
                    jf5Var = new ct8(context, (byte) 20);
                    break;
                case 0:
                    if (z2) {
                        jf5Var = new jf5(this.e, cmb.K6, 21, 15, 0, false, false, this.x);
                        break;
                    } else {
                        jf5Var = new jf5(context, ylbVar);
                        break;
                    }
                case 1:
                    jf5Var2 = new jf5(this.e, cmb.F6, 17, 15, false, this.x);
                    jf5Var = jf5Var2;
                    break;
                case 2:
                    jf5Var = new pvb(context, ylbVar);
                    break;
                case 3:
                    xib xibVar = new xib(context, ylbVar);
                    xibVar.setCompactLayout(this.s);
                    jf5Var = xibVar;
                    break;
                case 4:
                case 9:
                    bjb bjbVar = new bjb(context, ylbVar);
                    if (i == 9) {
                        bjbVar.setDrawCheckRipple(true);
                        bjbVar.d(cmb.f6, cmb.N6, cmb.O6, cmb.P6, cmb.Q6);
                        bjbVar.setTypeface(gm.o());
                        bjbVar.setHeight(56);
                    }
                    jf5Var = bjbVar;
                    break;
                case 5:
                case 6:
                    if (i == 6) {
                        z = true;
                    } else {
                        z = false;
                    }
                    yn7Var = new yn7(this.e, 21, 60, z, this.x);
                    jf5Var = yn7Var;
                    break;
                case 7:
                case 8:
                default:
                    jf5Var = new njb(context, ylbVar);
                    break;
                case 10:
                    ?? frameLayout3 = new FrameLayout(context);
                    frameLayout3.f = 23;
                    TextView textView = new TextView(context);
                    frameLayout3.b = textView;
                    anb.X(textView, cmb.F6, null);
                    wi8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    if (jb6.a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView.setGravity(i3 | 16);
                    boolean z4 = jb6.a0;
                    if (z4) {
                        i4 = 5;
                    } else {
                        i4 = 3;
                    }
                    int i10 = i4 | 48;
                    if (z4) {
                        f = 61.0f;
                    } else {
                        f = 23.0f;
                    }
                    if (z4) {
                        f2 = 23.0f;
                    } else {
                        f2 = 61.0f;
                    }
                    frameLayout3.addView(textView, qoe.d(-1, -1.0f, i10, f, 0.0f, f2, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout3.c = textView2;
                    anb.X(textView2, cmb.H6, null);
                    wi8.w(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    if (jb6.a0) {
                        i5 = 3;
                    } else {
                        i5 = 5;
                    }
                    textView2.setGravity(i5 | 16);
                    textView2.setVisibility(8);
                    if (jb6.a0) {
                        i6 = 3;
                    } else {
                        i6 = 5;
                    }
                    frameLayout3.addView(textView2, qoe.d(-2, -1.0f, i6 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout3.d = radioButton;
                    radioButton.setSize(gm.L(20.0f));
                    anb.O(radioButton, cmb.f7, cmb.g7, null);
                    if (!jb6.a0) {
                        i8 = 5;
                    }
                    frameLayout3.addView(radioButton, qoe.d(22, 22.0f, i8 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout3.b();
                    frameLayout3.setHorizontalPadding(21);
                    jf5Var = frameLayout3;
                    break;
                case 11:
                case 12:
                    if (i != 12) {
                        i8 = 0;
                    }
                    w8c w8cVar = new w8c(context, 6, i8, false);
                    w8cVar.setSelfAsSavedMessages(true);
                    jf5Var = w8cVar;
                    break;
                case 13:
                    jf5Var2 = new w8c(6, 0, null, this.e, false, true);
                    jf5Var = jf5Var2;
                    break;
                case 14:
                    jf5Var = new hla(context, ylbVar);
                    break;
                case 15:
                    jf5Var = new jla(context, ylbVar);
                    break;
                case 16:
                    if (this.N == null) {
                        z3 = false;
                    }
                    jf5Var = new kz8(ylbVar, context, z3);
                    break;
                case 17:
                    jf5Var = new jz8(context, ylbVar);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.F == null) {
                        this.F = new mg0((ylb) null);
                    }
                    yn7Var = new vza(this.e, this.f, i - 18, this.F, this.h);
                    jf5Var = yn7Var;
                    break;
                case 24:
                    jf5Var = new gk1(context, ylbVar);
                    break;
                case 25:
                    jf5Var = new hk1(context, ylbVar);
                    break;
                case 26:
                    jf5 jf5Var4 = new jf5(this.e, cmb.F6, 23, 20, 0, false, false, this.x);
                    jf5Var4.setTextSize(20.0f);
                    jf5Var3 = jf5Var4;
                    jf5Var = jf5Var3;
                    break;
                case 27:
                    z7b z7bVar = new z7b(context, ylbVar);
                    z7bVar.d(false, false);
                    jf5Var = z7bVar;
                    break;
                case 28:
                    frameLayout = new View(context);
                    frameLayout.setTag(-33024);
                    jf5Var = frameLayout;
                    break;
                case 29:
                    jf5Var = new k51(context, ylbVar);
                    break;
                case 30:
                    jf5Var = new ckb(context, ylbVar);
                    break;
                case 31:
                    if (r59Var != null && r59Var.c1()) {
                        l55 l55Var = new l55(28, ylbVar, context);
                        l55Var.setNoBackground(true);
                        jf5Var = l55Var;
                        break;
                    } else {
                        jf5Var = new l55(context, ylbVar);
                        break;
                    }
                    break;
                case 32:
                    jf5Var = new ut8(context, null);
                    break;
                case 33:
                    jf5Var = new hg3(context, true);
                    break;
                case 34:
                    tk4 tk4Var = new tk4(context, ylbVar);
                    tk4Var.setIsSingleCell(true);
                    jf5Var = tk4Var;
                    break;
                case 35:
                case 36:
                case 37:
                case 41:
                    if (i == 35) {
                        i9 = 4;
                    } else {
                        if (i == 36) {
                            i7 = 6;
                        } else if (i == 37) {
                            i9 = 7;
                        } else if (i != 41) {
                            i7 = 0;
                        }
                        oh2 oh2Var = new oh2(this.e, i7, 21, true, this.x);
                        oh2Var.getCheckBoxRound().b(cmb.U6, cmb.f7, cmb.j7);
                        jf5Var3 = oh2Var;
                        jf5Var = jf5Var3;
                        break;
                    }
                    i7 = i9;
                    oh2 oh2Var2 = new oh2(this.e, i7, 21, true, this.x);
                    oh2Var2.getCheckBoxRound().b(cmb.U6, cmb.f7, cmb.j7);
                    jf5Var3 = oh2Var2;
                    jf5Var = jf5Var3;
                case 38:
                    jf5Var = new dm2(context, ylbVar);
                    break;
                case 39:
                case 40:
                    jf5Var = new ajb(context);
                    break;
                case 42:
                    jf5Var3 = new jf5(this.e, cmb.K6, 21, 15, 0, false, true, this.x);
                    jf5Var = jf5Var3;
                    break;
                case 43:
                    jf5Var = new vkb(0, ylbVar, context);
                    break;
                case 44:
                    jf5Var = new v09(context, false);
                    break;
            }
        }
        if (N(i)) {
            anb.h(i2, this.P, jf5Var);
        }
        return new u69(jf5Var);
    }

    @Override
    public void y(u69 u69Var) {
        R(u69Var, this.O);
        P(u69Var);
    }
}
