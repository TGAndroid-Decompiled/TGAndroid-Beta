package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.RadioButton;
public class l9c extends la {
    public of0 F;
    public i9c J;
    public i9c K;
    public int L;
    public boolean M;
    public icc N;
    public boolean O;
    public final d79 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public boolean s;
    public icc w;
    public final vnb x;
    public boolean r = true;
    public final ArrayList y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public boolean G = false;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final gd P = new gd(this, (byte) 5);

    public l9c(d79 d79Var, Context context, int i, int i2, boolean z, icc iccVar, vnb vnbVar) {
        this.d = d79Var;
        this.e = context;
        this.f = i;
        this.h = i2;
        this.n = z;
        this.w = iccVar;
        this.x = vnbVar;
        O(false);
    }

    public static boolean K(int i) {
        if (i >= 10000) {
            a8c G = b8c.G(i);
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
    public boolean D(f89 f89Var) {
        int i = f89Var.f;
        b8c G = G(f89Var.b());
        if (i >= 10000) {
            a8c G2 = b8c.G(i);
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
                i9c i9cVar = (i9c) arrayList.get(i);
                this.N.a(Integer.valueOf(i), new ArrayList(this.E.subList(i9cVar.a, i9cVar.b + 1)));
                this.M = false;
            }
        }
    }

    public final b8c G(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.E;
            if (i < arrayList.size()) {
                return (b8c) arrayList.get(i);
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
                i9c i9cVar = (i9c) arrayList.get(i2);
                if (i >= i9cVar.a && i <= i9cVar.b) {
                    return i2;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i) {
        return aob.v0(i, this.x);
    }

    public final boolean J(int i) {
        b8c G = G(i);
        b8c G2 = G(i + 1);
        if (G != null && !G.j && G2 != null && K(G2.a) == K(G.a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        i9c i9cVar = this.K;
        if (i9cVar != null) {
            i9cVar.b = Math.max(0, this.E.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.K = obj;
        obj.a = this.E.size();
        i9c i9cVar = this.K;
        i9cVar.b = -1;
        ArrayList arrayList = this.I;
        arrayList.add(i9cVar);
        return arrayList.size() - 1;
    }

    public final boolean N(int i) {
        if (this.r) {
            d79 d79Var = this.d;
            if (d79Var == null || !d79Var.d1() || !d79Var.getSectionsDrawBackground()) {
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
        d79 d79Var = this.d;
        if (d79Var != null && d79Var.e0()) {
            d79Var.post(new q38((byte) 24, this, z));
        } else {
            Q(z);
        }
    }

    public final void P(f89 f89Var) {
        int i;
        View view = f89Var.a;
        if (view instanceof snb) {
            ((snb) view).updateColors();
            Object tag = view.getTag(2131296712);
            int i2 = yob.b;
            if (N(f89Var.f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i2)) {
                if (this.n) {
                    i = aob.h5;
                } else {
                    i = aob.d6;
                }
                view.setBackgroundColor(I(i));
            }
            view.setTag(2131296712, Integer.valueOf(i2));
        }
    }

    public final void Q(boolean z) {
        d79 d79Var = this.d;
        if (d79Var == null || !d79Var.e0()) {
            ArrayList arrayList = this.y;
            arrayList.clear();
            ArrayList arrayList2 = this.E;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.J = null;
            this.H.clear();
            this.I.clear();
            icc iccVar = this.w;
            if (iccVar != null) {
                iccVar.a(arrayList2, this);
                S();
                if (z) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(f89 f89Var, boolean z) {
        if (f89Var != null) {
            View view = f89Var.a;
            int i = f89Var.f;
            if (i >= 10000) {
                a8c G = b8c.G(i);
                if (G != null) {
                    G.a(this.d, view, G(f89Var.b()));
                }
            } else if (i != 16) {
            } else {
                ((w09) view).setReorder(z);
            }
        }
    }

    public final void S() {
        d79 d79Var = this.d;
        if (d79Var != null) {
            ArrayList arrayList = d79Var.L2;
            if (arrayList == null) {
                d79Var.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.H;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                i9c i9cVar = (i9c) obj;
                d79Var.L2.add(Long.valueOf(hl.u2(i9cVar.a, i9cVar.b)));
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
        icc iccVar = this.w;
        if (iccVar != null) {
            iccVar.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        i9c i9cVar = this.J;
        if (i9cVar != null) {
            i9cVar.b = Math.max(0, (this.E.size() + (this.G ? 1 : 0)) - 1);
            i9c i9cVar2 = this.J;
            if (i9cVar2.a == i9cVar2.b) {
                this.H.remove(i9cVar2);
            }
            this.J = null;
        }
    }

    public final void V() {
        ?? obj = new Object();
        this.J = obj;
        obj.a = this.E.size() + (this.G ? 1 : 0);
        i9c i9cVar = this.J;
        i9cVar.b = -1;
        this.H.add(i9cVar);
    }

    @Override
    public final int b() {
        return this.E.size();
    }

    @Override
    public final int d(int i) {
        b8c G = G(i);
        if (G == null) {
            return 0;
        }
        return G.a;
    }

    @Override
    public void t(defpackage.f89 r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9c.t(f89, int):void");
    }

    @Override
    public f89 x(ViewGroup viewGroup, int i) {
        int i2;
        View frameLayout;
        tk4 mf5Var;
        View mf5Var2;
        wkb wkbVar;
        boolean z;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        sg2 sg2Var;
        int i7;
        boolean z2 = this.n;
        if (z2) {
            i2 = aob.h5;
        } else {
            i2 = aob.d6;
        }
        d79 d79Var = this.d;
        vnb vnbVar = this.x;
        Context context = this.e;
        if (i >= 10000) {
            a8c G = b8c.G(i);
            if (G != null) {
                mf5Var = G.d(context, d79Var, this.f, vnbVar);
            } else {
                mf5Var = new View(context);
            }
        } else {
            int i8 = 3;
            int i9 = 8;
            boolean z3 = true;
            switch (i) {
                case -5:
                    frameLayout = new FrameLayout(context);
                    frameLayout.setTag(-33024);
                    mf5Var = frameLayout;
                    break;
                case -4:
                case -1:
                    frameLayout = new ir8(context, (byte) 20);
                    if (i == -4) {
                        frameLayout.setTag(-33024);
                    }
                    mf5Var = frameLayout;
                    break;
                case -3:
                    ?? frameLayout2 = new FrameLayout(context);
                    frameLayout2.a = 0;
                    mf5Var = frameLayout2;
                    break;
                case -2:
                    mf5Var = new ir8(context, (byte) 21);
                    break;
                case 0:
                    if (z2) {
                        mf5Var = new mf5(this.e, aob.L6, 21, 15, 0, false, false, this.x);
                        break;
                    } else {
                        mf5Var = new mf5(context, vnbVar);
                        break;
                    }
                case 1:
                    mf5Var2 = new mf5(this.e, aob.G6, 17, 15, false, this.x);
                    mf5Var = mf5Var2;
                    break;
                case 2:
                    mf5Var = new pxb(context, vnbVar);
                    break;
                case 3:
                    skb skbVar = new skb(context, vnbVar);
                    skbVar.setCompactLayout(this.s);
                    mf5Var = skbVar;
                    break;
                case 4:
                case 9:
                    wkb wkbVar2 = new wkb(context, vnbVar);
                    if (i == 9) {
                        wkbVar2.setDrawCheckRipple(true);
                        wkbVar = wkbVar2;
                        wkbVar.d(aob.g6, aob.O6, aob.P6, aob.Q6, aob.R6);
                        wkbVar.setTypeface(hl.o());
                        wkbVar.setHeight(56);
                    } else {
                        wkbVar = wkbVar2;
                    }
                    mf5Var = wkbVar;
                    break;
                case 5:
                case 6:
                    if (i == 6) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mf5Var = new uo7(this.e, 21, 60, z, this.x);
                    break;
                case 7:
                case 8:
                default:
                    mf5Var = new ilb(context, vnbVar);
                    break;
                case 10:
                    ?? frameLayout3 = new FrameLayout(context);
                    frameLayout3.f = 23;
                    TextView textView = new TextView(context);
                    frameLayout3.b = textView;
                    yob.X(textView, aob.G6, null);
                    ik8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    if (ob6.a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView.setGravity(i3 | 16);
                    boolean z4 = ob6.a0;
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
                    frameLayout3.addView(textView, tre.d(-1, -1.0f, i10, f, 0.0f, f2, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout3.c = textView2;
                    yob.X(textView2, aob.I6, null);
                    ik8.w(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    if (ob6.a0) {
                        i5 = 3;
                    } else {
                        i5 = 5;
                    }
                    textView2.setGravity(i5 | 16);
                    textView2.setVisibility(8);
                    if (ob6.a0) {
                        i6 = 3;
                    } else {
                        i6 = 5;
                    }
                    frameLayout3.addView(textView2, tre.d(-2, -1.0f, i6 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout3.d = radioButton;
                    radioButton.setSize(hl.L(20.0f));
                    yob.O(radioButton, aob.g7, aob.h7, null);
                    if (!ob6.a0) {
                        i8 = 5;
                    }
                    frameLayout3.addView(radioButton, tre.d(22, 22.0f, i8 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout3.b();
                    frameLayout3.setHorizontalPadding(21);
                    mf5Var = frameLayout3;
                    break;
                case 11:
                case 12:
                    if (i != 12) {
                        i8 = 0;
                    }
                    vac vacVar = new vac(context, 6, i8, false);
                    vacVar.setSelfAsSavedMessages(true);
                    mf5Var = vacVar;
                    break;
                case 13:
                    mf5Var2 = new vac(6, 0, null, this.e, false, true);
                    mf5Var = mf5Var2;
                    break;
                case 14:
                    mf5Var = new zma(context, vnbVar);
                    break;
                case 15:
                    mf5Var = new bna(context, vnbVar);
                    break;
                case 16:
                    if (this.N == null) {
                        z3 = false;
                    }
                    mf5Var = new w09(vnbVar, context, z3);
                    break;
                case 17:
                    mf5Var = new v09(context, vnbVar);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.F == null) {
                        this.F = new of0((vnb) null);
                    }
                    sg2Var = new u1b(this.e, this.f, i - 18, this.F, this.h);
                    mf5Var = sg2Var;
                    break;
                case 24:
                    mf5Var = new gj1(context, vnbVar);
                    break;
                case 25:
                    mf5Var = new hj1(context, vnbVar);
                    break;
                case 26:
                    mf5 mf5Var3 = new mf5(this.e, aob.G6, 23, 20, 0, false, false, this.x);
                    mf5Var3.setTextSize(20.0f);
                    mf5Var = mf5Var3;
                    break;
                case 27:
                    v9b v9bVar = new v9b(context, vnbVar);
                    v9bVar.d(false, false);
                    mf5Var = v9bVar;
                    break;
                case 28:
                    frameLayout = new View(context);
                    frameLayout.setTag(-33024);
                    mf5Var = frameLayout;
                    break;
                case 29:
                    mf5Var = new l41(context, vnbVar);
                    break;
                case 30:
                    mf5Var = new wlb(context, vnbVar);
                    break;
                case 31:
                    if (d79Var != null && d79Var.d1()) {
                        p55 p55Var = new p55(28, vnbVar, context);
                        p55Var.setNoBackground(true);
                        mf5Var = p55Var;
                        break;
                    } else {
                        mf5Var = new p55(context, vnbVar);
                        break;
                    }
                case 32:
                    mf5Var = new bv8(context, null);
                    break;
                case 33:
                    mf5Var = new of3(context, true);
                    break;
                case 34:
                    tk4 tk4Var = new tk4(context, vnbVar);
                    tk4Var.setIsSingleCell(true);
                    mf5Var = tk4Var;
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
                        sg2 sg2Var2 = new sg2(this.e, i7, 21, true, this.x);
                        sg2Var2.getCheckBoxRound().b(aob.V6, aob.g7, aob.k7);
                        sg2Var = sg2Var2;
                        mf5Var = sg2Var;
                        break;
                    }
                    i7 = i9;
                    sg2 sg2Var22 = new sg2(this.e, i7, 21, true, this.x);
                    sg2Var22.getCheckBoxRound().b(aob.V6, aob.g7, aob.k7);
                    sg2Var = sg2Var22;
                    mf5Var = sg2Var;
                case 38:
                    mf5Var = new ll2(context, vnbVar);
                    break;
                case 39:
                case 40:
                    mf5Var = new vkb(context);
                    break;
                case 42:
                    mf5Var = new mf5(this.e, aob.L6, 21, 15, 0, false, true, this.x);
                    break;
                case 43:
                    mf5Var = new qmb(0, vnbVar, context);
                    break;
                case 44:
                    mf5Var = new h29(context, false);
                    break;
            }
        }
        if (N(i)) {
            yob.h(i2, this.P, mf5Var);
        }
        return new f89(mf5Var);
    }

    @Override
    public void y(f89 f89Var) {
        R(f89Var, this.O);
        P(f89Var);
    }
}
