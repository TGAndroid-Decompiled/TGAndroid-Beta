package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.RadioButton;
public class l5c extends ka {
    public mf0 F;
    public i5c J;
    public i5c K;
    public int L;
    public boolean M;
    public i8c N;
    public boolean O;
    public final o39 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public boolean s;
    public i8c w;
    public final wjb x;
    public boolean r = true;
    public final ArrayList y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public boolean G = false;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final fd P = new fd(this, (byte) 5);

    public l5c(o39 o39Var, Context context, int i, int i2, boolean z, i8c i8cVar, wjb wjbVar) {
        this.d = o39Var;
        this.e = context;
        this.f = i;
        this.h = i2;
        this.n = z;
        this.w = i8cVar;
        this.x = wjbVar;
        O(false);
    }

    public static boolean K(int i) {
        if (i >= 10000) {
            b4c G = c4c.G(i);
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
    public boolean D(s49 s49Var) {
        int i = s49Var.f;
        c4c G = G(s49Var.b());
        if (i >= 10000) {
            b4c G2 = c4c.G(i);
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
                i5c i5cVar = (i5c) arrayList.get(i);
                this.N.a(Integer.valueOf(i), new ArrayList(this.E.subList(i5cVar.a, i5cVar.b + 1)));
                this.M = false;
            }
        }
    }

    public final c4c G(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.E;
            if (i < arrayList.size()) {
                return (c4c) arrayList.get(i);
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
                i5c i5cVar = (i5c) arrayList.get(i2);
                if (i >= i5cVar.a && i <= i5cVar.b) {
                    return i2;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i) {
        return bkb.v0(i, this.x);
    }

    public final boolean J(int i) {
        c4c G = G(i);
        c4c G2 = G(i + 1);
        if (G != null && !G.j && G2 != null && K(G2.a) == K(G.a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        i5c i5cVar = this.K;
        if (i5cVar != null) {
            i5cVar.b = Math.max(0, this.E.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.K = obj;
        obj.a = this.E.size();
        i5c i5cVar = this.K;
        i5cVar.b = -1;
        ArrayList arrayList = this.I;
        arrayList.add(i5cVar);
        return arrayList.size() - 1;
    }

    public final boolean N(int i) {
        if (this.r) {
            o39 o39Var = this.d;
            if (o39Var == null || !o39Var.c1() || !o39Var.getSectionsDrawBackground()) {
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
        o39 o39Var = this.d;
        if (o39Var != null && o39Var.d0()) {
            o39Var.post(new k08((byte) 24, this, z));
        } else {
            Q(z);
        }
    }

    public final void P(s49 s49Var) {
        int i;
        View view = s49Var.a;
        if (view instanceof tjb) {
            ((tjb) view).updateColors();
            Object tag = view.getTag(2131296712);
            int i2 = zkb.b;
            if (N(s49Var.f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i2)) {
                if (this.n) {
                    i = bkb.g5;
                } else {
                    i = bkb.c6;
                }
                view.setBackgroundColor(I(i));
            }
            view.setTag(2131296712, Integer.valueOf(i2));
        }
    }

    public final void Q(boolean z) {
        o39 o39Var = this.d;
        if (o39Var == null || !o39Var.d0()) {
            ArrayList arrayList = this.y;
            arrayList.clear();
            ArrayList arrayList2 = this.E;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.J = null;
            this.H.clear();
            this.I.clear();
            i8c i8cVar = this.w;
            if (i8cVar != null) {
                i8cVar.a(arrayList2, this);
                S();
                if (z) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(s49 s49Var, boolean z) {
        if (s49Var != null) {
            View view = s49Var.a;
            int i = s49Var.f;
            if (i >= 10000) {
                b4c G = c4c.G(i);
                if (G != null) {
                    G.a(this.d, view, G(s49Var.b()));
                }
            } else if (i != 16) {
            } else {
                ((jx8) view).setReorder(z);
            }
        }
    }

    public final void S() {
        o39 o39Var = this.d;
        if (o39Var != null) {
            ArrayList arrayList = o39Var.L2;
            if (arrayList == null) {
                o39Var.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.H;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                i5c i5cVar = (i5c) obj;
                o39Var.L2.add(Long.valueOf(gl.u2(i5cVar.a, i5cVar.b)));
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
        i8c i8cVar = this.w;
        if (i8cVar != null) {
            i8cVar.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        i5c i5cVar = this.J;
        if (i5cVar != null) {
            i5cVar.b = Math.max(0, (this.E.size() + (this.G ? 1 : 0)) - 1);
            i5c i5cVar2 = this.J;
            if (i5cVar2.a == i5cVar2.b) {
                this.H.remove(i5cVar2);
            }
            this.J = null;
        }
    }

    public final void V() {
        ?? obj = new Object();
        this.J = obj;
        obj.a = this.E.size() + (this.G ? 1 : 0);
        i5c i5cVar = this.J;
        i5cVar.b = -1;
        this.H.add(i5cVar);
    }

    @Override
    public final int b() {
        return this.E.size();
    }

    @Override
    public final int d(int i) {
        c4c G = G(i);
        if (G == null) {
            return 0;
        }
        return G.a;
    }

    @Override
    public void t(defpackage.s49 r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5c.t(s49, int):void");
    }

    @Override
    public s49 x(ViewGroup viewGroup, int i) {
        int i2;
        View frameLayout;
        pi4 ld5Var;
        View ld5Var2;
        View vl7Var;
        boolean z;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        int i7;
        ld5 ld5Var3;
        boolean z2 = this.n;
        if (z2) {
            i2 = bkb.g5;
        } else {
            i2 = bkb.c6;
        }
        o39 o39Var = this.d;
        wjb wjbVar = this.x;
        Context context = this.e;
        if (i >= 10000) {
            b4c G = c4c.G(i);
            if (G != null) {
                ld5Var = G.d(context, o39Var, this.f, wjbVar);
            } else {
                ld5Var = new View(context);
            }
        } else {
            int i8 = 3;
            int i9 = 8;
            boolean z3 = true;
            switch (i) {
                case -5:
                    frameLayout = new FrameLayout(context);
                    frameLayout.setTag(-33024);
                    ld5Var = frameLayout;
                    break;
                case -4:
                case -1:
                    frameLayout = new ar8(context, (byte) 19);
                    if (i == -4) {
                        frameLayout.setTag(-33024);
                    }
                    ld5Var = frameLayout;
                    break;
                case -3:
                    ?? frameLayout2 = new FrameLayout(context);
                    frameLayout2.a = 0;
                    ld5Var = frameLayout2;
                    break;
                case -2:
                    ld5Var = new ar8(context, (byte) 20);
                    break;
                case 0:
                    if (z2) {
                        ld5Var = new ld5(this.e, bkb.K6, 21, 15, 0, false, false, this.x);
                        break;
                    } else {
                        ld5Var = new ld5(context, wjbVar);
                        break;
                    }
                case 1:
                    ld5Var2 = new ld5(this.e, bkb.F6, 17, 15, false, this.x);
                    ld5Var = ld5Var2;
                    break;
                case 2:
                    ld5Var = new otb(context, wjbVar);
                    break;
                case 3:
                    wgb wgbVar = new wgb(context, wjbVar);
                    wgbVar.setCompactLayout(this.s);
                    ld5Var = wgbVar;
                    break;
                case 4:
                case 9:
                    ahb ahbVar = new ahb(context, wjbVar);
                    if (i == 9) {
                        ahbVar.setDrawCheckRipple(true);
                        ahbVar.d(bkb.f6, bkb.N6, bkb.O6, bkb.P6, bkb.Q6);
                        ahbVar.setTypeface(gl.o());
                        ahbVar.setHeight(56);
                    }
                    ld5Var = ahbVar;
                    break;
                case 5:
                case 6:
                    if (i == 6) {
                        z = true;
                    } else {
                        z = false;
                    }
                    vl7Var = new vl7(this.e, 21, 60, z, this.x);
                    ld5Var = vl7Var;
                    break;
                case 7:
                case 8:
                default:
                    ld5Var = new mhb(context, wjbVar);
                    break;
                case 10:
                    ?? frameLayout3 = new FrameLayout(context);
                    frameLayout3.f = 23;
                    TextView textView = new TextView(context);
                    frameLayout3.b = textView;
                    zkb.X(textView, bkb.F6, null);
                    ug8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    if (k96.a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView.setGravity(i3 | 16);
                    boolean z4 = k96.a0;
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
                    frameLayout3.addView(textView, nme.d(-1, -1.0f, i10, f, 0.0f, f2, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout3.c = textView2;
                    zkb.X(textView2, bkb.H6, null);
                    ug8.w(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    if (k96.a0) {
                        i5 = 3;
                    } else {
                        i5 = 5;
                    }
                    textView2.setGravity(i5 | 16);
                    textView2.setVisibility(8);
                    if (k96.a0) {
                        i6 = 3;
                    } else {
                        i6 = 5;
                    }
                    frameLayout3.addView(textView2, nme.d(-2, -1.0f, i6 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout3.d = radioButton;
                    radioButton.setSize(gl.L(20.0f));
                    zkb.O(radioButton, bkb.f7, bkb.g7, null);
                    if (!k96.a0) {
                        i8 = 5;
                    }
                    frameLayout3.addView(radioButton, nme.d(22, 22.0f, i8 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout3.b();
                    frameLayout3.setHorizontalPadding(21);
                    ld5Var = frameLayout3;
                    break;
                case 11:
                case 12:
                    if (i != 12) {
                        i8 = 0;
                    }
                    v6c v6cVar = new v6c(context, 6, i8, false);
                    v6cVar.setSelfAsSavedMessages(true);
                    ld5Var = v6cVar;
                    break;
                case 13:
                    ld5Var2 = new v6c(6, 0, null, this.e, false, true);
                    ld5Var = ld5Var2;
                    break;
                case 14:
                    ld5Var = new fja(context, wjbVar);
                    break;
                case 15:
                    ld5Var = new ija(context, wjbVar);
                    break;
                case 16:
                    if (this.N == null) {
                        z3 = false;
                    }
                    ld5Var = new jx8(wjbVar, context, z3);
                    break;
                case 17:
                    ld5Var = new ix8(context, wjbVar);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.F == null) {
                        this.F = new mf0((wjb) null);
                    }
                    vl7Var = new sxa(this.e, this.f, i - 18, this.F, this.h);
                    ld5Var = vl7Var;
                    break;
                case 24:
                    ld5Var = new xi1(context, wjbVar);
                    break;
                case 25:
                    ld5Var = new yi1(context, wjbVar);
                    break;
                case 26:
                    ld5 ld5Var4 = new ld5(this.e, bkb.F6, 23, 20, 0, false, false, this.x);
                    ld5Var4.setTextSize(20.0f);
                    ld5Var3 = ld5Var4;
                    ld5Var = ld5Var3;
                    break;
                case 27:
                    x5b x5bVar = new x5b(context, wjbVar);
                    x5bVar.d(false, false);
                    ld5Var = x5bVar;
                    break;
                case 28:
                    frameLayout = new View(context);
                    frameLayout.setTag(-33024);
                    ld5Var = frameLayout;
                    break;
                case 29:
                    ld5Var = new d41(context, wjbVar);
                    break;
                case 30:
                    ld5Var = new aib(context, wjbVar);
                    break;
                case 31:
                    if (o39Var != null && o39Var.c1()) {
                        l35 l35Var = new l35(28, wjbVar, context);
                        l35Var.setNoBackground(true);
                        ld5Var = l35Var;
                        break;
                    } else {
                        ld5Var = new l35(context, wjbVar);
                        break;
                    }
                    break;
                case 32:
                    ld5Var = new rr8(context, null);
                    break;
                case 33:
                    ld5Var = new ue3(context, true);
                    break;
                case 34:
                    pi4 pi4Var = new pi4(context, wjbVar);
                    pi4Var.setIsSingleCell(true);
                    ld5Var = pi4Var;
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
                        ag2 ag2Var = new ag2(this.e, i7, 21, true, this.x);
                        ag2Var.getCheckBoxRound().b(bkb.U6, bkb.f7, bkb.j7);
                        ld5Var3 = ag2Var;
                        ld5Var = ld5Var3;
                        break;
                    }
                    i7 = i9;
                    ag2 ag2Var2 = new ag2(this.e, i7, 21, true, this.x);
                    ag2Var2.getCheckBoxRound().b(bkb.U6, bkb.f7, bkb.j7);
                    ld5Var3 = ag2Var2;
                    ld5Var = ld5Var3;
                case 38:
                    ld5Var = new rk2(context, wjbVar);
                    break;
                case 39:
                case 40:
                    ld5Var = new zgb(context);
                    break;
                case 42:
                    ld5Var3 = new ld5(this.e, bkb.K6, 21, 15, 0, false, true, this.x);
                    ld5Var = ld5Var3;
                    break;
                case 43:
                    ld5Var = new uib(0, wjbVar, context);
                    break;
                case 44:
                    ld5Var = new uy8(context, false);
                    break;
            }
        }
        if (N(i)) {
            zkb.h(i2, this.P, ld5Var);
        }
        return new s49(ld5Var);
    }

    @Override
    public void y(s49 s49Var) {
        R(s49Var, this.O);
        P(s49Var);
    }
}
