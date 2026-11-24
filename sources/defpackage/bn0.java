package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.d;
public final class bn0 extends oec {
    public final byte a;
    public final Object b;
    public final Object c;

    public bn0(mvb mvbVar) {
        this.a = (byte) 8;
        this.c = mvbVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new jvb(0));
        jvb jvbVar = new jvb(2);
        jvbVar.b = (byte) 0;
        arrayList.add(jvbVar);
        jvb jvbVar2 = new jvb(2);
        jvbVar2.b = (byte) 1;
        arrayList.add(jvbVar2);
        jvb jvbVar3 = new jvb(2);
        jvbVar3.b = (byte) 2;
        arrayList.add(jvbVar3);
        jvb jvbVar4 = new jvb(2);
        jvbVar4.b = (byte) 3;
        arrayList.add(jvbVar4);
        jvb jvbVar5 = new jvb(2);
        jvbVar5.b = (byte) 4;
        arrayList.add(jvbVar5);
    }

    @Override
    public final void b(View view, int i, int i2) {
        s1b s1bVar;
        hv4 hv4Var;
        d dVar;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return;
            case 1:
                gr0 gr0Var = (gr0) view;
                kca kcaVar = (kca) obj;
                if (i == 0) {
                    s1bVar = kcaVar.e;
                } else {
                    s1bVar = (s1b) kcaVar.f.get(i - 1);
                }
                s1bVar.H(null);
                gr0Var.setList(s1bVar);
                gr0Var.setVisibleHeight(kcaVar.w);
                return;
            case 2:
                if (view instanceof uu1) {
                    ((uu1) view).a.dd(((mu1) obj).J3);
                }
                WeakHashMap weakHashMap = jdc.a;
                zcc.c(view);
                return;
            case 3:
                return;
            case 4:
                ((a89) view).a(i2);
                return;
            case 5:
                hi3 hi3Var = (hi3) obj;
                hi3Var.P(view, i, hi3Var.N0, true);
                return;
            case 6:
                vqa vqaVar = (vqa) obj;
                if (i2 == 0) {
                    vqaVar.r2(false);
                    hv4Var = vqaVar.X1;
                    if (hv4Var == null) {
                        return;
                    }
                } else if (i2 == 2) {
                    vqaVar.r2(true);
                    hv4Var = vqaVar.Y1;
                    if (hv4Var == null) {
                        return;
                    }
                } else {
                    return;
                }
                jo0 jo0Var = hv4Var.T1;
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                gl.B2(jo0Var);
                frameLayout.addView(jo0Var);
                return;
            case 7:
                return;
            case 8:
                mvb mvbVar = (mvb) obj;
                mvbVar.M(view, i, mvbVar.e0, true);
                return;
            case 9:
                jec jecVar = (jec) obj;
                SparseArray sparseArray = jecVar.a;
                hec hecVar = (hec) sparseArray.get(i);
                if (hecVar != null) {
                    dVar = hecVar.a;
                } else {
                    d Z = jecVar.Z(i);
                    hec hecVar2 = new hec(Z);
                    sparseArray.put(i, hecVar2);
                    dVar = Z;
                    hecVar = hecVar2;
                }
                if (!hecVar.b) {
                    dVar.onFragmentCreate();
                    hecVar.b = true;
                }
                dVar.setParentLayout(jecVar.getParentLayout());
                dVar.setSimpleMenuOverlayHost(jecVar);
                if (dVar.getFragmentView() == null) {
                    dVar.performCreateView((Context) this.b);
                    dVar.setTitleOverlayText(jecVar.n, jecVar.r, jecVar.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = dVar.getFragmentView();
                gl.B2(fragmentView);
                if (!dVar.hasOwnBackground() && fragmentView.getBackground() == null) {
                    zkb.h(bkb.c6, null, fragmentView);
                }
                frameLayout2.addView(fragmentView, nme.c(-1.0f, -1));
                if (dVar.getActionBar() != null && dVar.getActionBar().L) {
                    gl.B2(dVar.getActionBar());
                    frameLayout2.addView(dVar.getActionBar());
                }
                WeakHashMap weakHashMap2 = jdc.a;
                zcc.c(frameLayout2);
                jecVar.checkSystemBarColors();
                jecVar.Y();
                return;
            default:
                hmc.c1((q5c) view, false);
                return;
        }
    }

    @Override
    public final View d(int i) {
        jo0 jo0Var;
        af4 af4Var;
        int i2;
        int i3;
        int i4;
        wjb wjbVar;
        int i5;
        qw4 qw4Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    return ((ao0) obj2).b;
                }
                return ((zy9) obj).b;
            case 1:
                return new gr0((kca) obj, (Context) obj2);
            case 2:
                Context context = (Context) obj2;
                mu1 mu1Var = (mu1) obj;
                if (i == 0) {
                    return new yt1(mu1Var, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i);
                bundle.putString("searchHashtag", mu1Var.J3);
                wq1 wq1Var = new wq1(context, mu1Var.getParentLayout(), bundle, (byte) 0);
                wq1Var.h = false;
                tu1 tu1Var = wq1Var.a;
                tu1Var.N.a = mu1Var.N;
                tu1Var.za = mu1Var.Ba;
                tu1Var.Aa = mu1Var;
                tu1Var.n9 = new lj9(this, (byte) 16);
                return wq1Var;
            case 3:
                FrameLayout frameLayout = new FrameLayout((Activity) obj2);
                frameLayout.setOnClickListener(new fr7(this, (byte) 21));
                return frameLayout;
            case 4:
                return new a89((b89) obj, (Context) obj2);
            case 5:
                hi3 hi3Var = (hi3) obj;
                cj3 cj3Var = hi3Var.M0;
                if (i == 1) {
                    return hi3Var.a0;
                }
                if (i == 3) {
                    return hi3Var.i0;
                }
                if (i == 4) {
                    return hi3Var.n0;
                }
                if (i == 5) {
                    return hi3Var.u0;
                }
                if (i == 2) {
                    hs9 hs9Var = new hs9(hi3Var.K0, cj3Var);
                    hi3Var.J0 = hs9Var;
                    hs9Var.b(hi3Var.X0, hi3Var.Y0, false);
                    hi3Var.J0.b.setClipToPadding(false);
                    hi3Var.J0.b.j(new rt9(this, (byte) 0));
                    hi3Var.J0.b.E0(new zk9(hi3Var, (byte) 13));
                    hi3Var.J0.setUiCallback(hi3Var);
                    return hi3Var.J0;
                } else if (i == 6) {
                    return hi3Var.s0;
                } else {
                    af4 af4Var2 = new af4(cj3Var);
                    af4Var2.setChatPreviewDelegate(hi3Var.S0);
                    af4Var2.setUiCallback(hi3Var);
                    af4Var2.j(hi3Var.X0, hi3Var.Y0, false);
                    kl0 kl0Var = hi3Var.a1;
                    if (kl0Var != null) {
                        af4Var2.setBlurredBackgroundDrawableFactory(kl0Var);
                    }
                    fu fuVar = af4Var2.b;
                    fuVar.setClipToPadding(false);
                    fuVar.j(new rt9(this, (byte) 1));
                    fuVar.E0(new zk9(hi3Var, (byte) 13));
                    return af4Var2;
                }
            case 6:
                vqa vqaVar = (vqa) obj;
                if (i == 0) {
                    vqaVar.r2(false);
                    hv4 hv4Var = vqaVar.X1;
                    if (hv4Var != null) {
                        jo0Var = hv4Var.T1;
                        gl.B2(jo0Var);
                        FrameLayout frameLayout2 = new FrameLayout((Context) obj2);
                        frameLayout2.addView(jo0Var, nme.e(-1, -1, 119));
                        return frameLayout2;
                    }
                    return null;
                }
                if (i == 1) {
                    jo0Var = vqaVar.T1;
                } else {
                    if (i == 2) {
                        vqaVar.r2(true);
                        hv4 hv4Var2 = vqaVar.Y1;
                        if (hv4Var2 != null) {
                            jo0Var = hv4Var2.T1;
                        }
                    }
                    return null;
                }
                gl.B2(jo0Var);
                FrameLayout frameLayout22 = new FrameLayout((Context) obj2);
                frameLayout22.addView(jo0Var, nme.e(-1, -1, 119));
                return frameLayout22;
            case 7:
                FrameLayout frameLayout3 = new FrameLayout((Activity) obj2);
                frameLayout3.setOnClickListener(new bna(this, (byte) 20));
                return frameLayout3;
            case 8:
                mvb mvbVar = (mvb) obj;
                qvb qvbVar = mvbVar.w0;
                if (i == 1) {
                    return mvbVar.W;
                }
                if (i == 2) {
                    i2 = ((d) qvbVar).currentAccount;
                    hs9 hs9Var2 = new hs9(i2, qvbVar);
                    hs9Var2.b.j(new lvb((byte) 0));
                    hs9Var2.setUiCallback(mvbVar);
                    af4Var = hs9Var2;
                } else {
                    af4 af4Var3 = new af4(qvbVar);
                    af4Var3.setChatPreviewDelegate(mvbVar.u0);
                    af4Var3.setUiCallback(mvbVar);
                    af4Var3.b.j(new lvb((byte) 1));
                    af4Var = af4Var3;
                }
                return af4Var;
            case 9:
                return new ar8((Context) obj2, (byte) 21);
            default:
                hmc hmcVar = (hmc) obj;
                q5c[] q5cVarArr = hmcVar.u0;
                q5c q5cVar = q5cVarArr[i];
                if (q5cVar == null) {
                    Context context2 = (Context) obj2;
                    i3 = ((d) hmcVar).currentAccount;
                    i4 = ((d) hmcVar).classGuid;
                    c0 c0Var = new c0(this, i, (byte) 1);
                    pkc pkcVar = new pkc(hmcVar);
                    pkc pkcVar2 = new pkc(hmcVar);
                    wjbVar = ((d) hmcVar).resourceProvider;
                    if (i == 1) {
                        i5 = 3;
                    } else {
                        i5 = -1;
                    }
                    i24 i24Var = new i24(context2, i3, i4, false, c0Var, pkcVar, pkcVar2, wjbVar, i5, 1);
                    q5cVarArr[i] = i24Var;
                    hmcVar.d1(i);
                    qw4Var = ((d) hmcVar).glassEngine;
                    qw4Var.b(i24Var);
                    i24Var.setFocusableInTouchMode(false);
                    i24Var.setClipChildren(false);
                    i24Var.setClipToPadding(false);
                    if (i == 0) {
                        i24Var.r1();
                    } else {
                        i24Var.setSelectorType(9);
                        i24Var.setSelectorDrawableColor(0);
                    }
                    i24Var.g3.r = false;
                    i24Var.j(new m1c(this, i));
                    q5cVarArr[i] = i24Var;
                    return i24Var;
                }
                return q5cVar;
        }
    }

    @Override
    public final int e() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return 2;
            case 1:
                return ((kca) obj2).f.size() + 1;
            case 2:
                return 3;
            case 3:
                return 2;
            case 4:
                return 5;
            case 5:
                return ((ArrayList) obj).size();
            case 6:
                vqa vqaVar = (vqa) obj2;
                return (vqaVar.B1(true) ? 1 : 0) + (vqaVar.B1(false) ? 1 : 0) + 1;
            case 7:
                return 2;
            case 8:
                return ((ArrayList) obj).size();
            case 9:
                return 4;
            default:
                if (!((hmc) obj2).g0) {
                    return 1;
                }
                return 2;
        }
    }

    @Override
    public final int f(int i) {
        switch (this.a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                return ((s1b) ((kca) this.c).f.get(i - 1)).E.hashCode();
            default:
                return i;
        }
    }

    @Override
    public final CharSequence g(int i) {
        int i2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                if (i == 0) {
                    return k96.M0(2131746517, null);
                }
                return rzb.K0(((s1b) ((kca) this.c).f.get(i - 1)).E);
            case 2:
                if (i != 1) {
                    if (i != 2) {
                        return k96.M0(2131745517, null);
                    }
                    return k96.M0(2131745520, null);
                }
                return k96.M0(2131745546, null);
            case 5:
                ArrayList arrayList = (ArrayList) obj;
                if (((st9) arrayList.get(i)).a == 0) {
                    return k96.M0(2131745631, null);
                }
                if (((st9) arrayList.get(i)).a == 1) {
                    return k96.M0(2131752246, null);
                }
                if (((st9) arrayList.get(i)).a == 4) {
                    return k96.M0(2131754175, null);
                }
                if (((st9) arrayList.get(i)).a == 6) {
                    return k96.M0(2131745541, null);
                }
                if (((st9) arrayList.get(i)).a == 2) {
                    return k96.M0(2131751331, null);
                }
                if (((st9) arrayList.get(i)).a == 5) {
                    return k96.M0(2131746391, null);
                }
                rf4 rf4Var = tf4.k3[((st9) arrayList.get(i)).b];
                String str = rf4Var.c;
                if (str != null) {
                    return str;
                }
                return k96.M0(rf4Var.b, null);
            case 8:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((jvb) arrayList2.get(i)).a == 0) {
                    return k96.M0(2131745564, null);
                }
                if (((jvb) arrayList2.get(i)).a == 1) {
                    return k96.M0(2131751331, null);
                }
                rf4 rf4Var2 = tf4.k3[((jvb) arrayList2.get(i)).b];
                String str2 = rf4Var2.c;
                if (str2 != null) {
                    return str2;
                }
                return k96.M0(rf4Var2.b, null);
            case 10:
                if (i == 0) {
                    i2 = 2131742719;
                } else {
                    i2 = 2131742927;
                }
                return k96.M0(i2, null);
            default:
                return super.g(i);
        }
    }

    @Override
    public final int h(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 2:
                return i;
            case 1:
            case 3:
            case 7:
            case 9:
            default:
                return super.h(i);
            case 4:
                if (i == 0) {
                    return 0;
                }
                return 1;
            case 5:
                ArrayList arrayList = (ArrayList) obj;
                if (((st9) arrayList.get(i)).a == 0) {
                    return 1;
                }
                if (((st9) arrayList.get(i)).a == 1) {
                    return 3;
                }
                if (((st9) arrayList.get(i)).a == 4) {
                    return 4;
                }
                if (((st9) arrayList.get(i)).a == 2) {
                    return 2;
                }
                if (((st9) arrayList.get(i)).a == 5) {
                    return 5;
                }
                if (((st9) arrayList.get(i)).a == 6) {
                    return 6;
                }
                return ((st9) arrayList.get(i)).a + i;
            case 6:
                return (i - (((vqa) this.c).B1(false) ? 1 : 0)) + 1;
            case 8:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((jvb) arrayList2.get(i)).a == 0) {
                    return 1;
                }
                if (((jvb) arrayList2.get(i)).a == 1) {
                    return 2;
                }
                return ((jvb) arrayList2.get(i)).a + i;
            case 10:
                return i;
        }
    }

    public final void l() {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        arrayList.add(new st9(0));
        hi3 hi3Var = (hi3) this.c;
        if (hi3Var.W0 == 0) {
            if (hi3Var.t0) {
                arrayList.add(new st9(5));
            }
            arrayList.add(new st9(1));
            arrayList.add(new st9(4));
            arrayList.add(new st9(6));
            if (!hi3Var.R0) {
                st9 st9Var = new st9(3);
                st9Var.b = (byte) 0;
                arrayList.add(st9Var);
                rh3 rh3Var = hi3Var.d1.H3;
                if (rh3Var == null || !rh3Var.c()) {
                    arrayList.add(new st9(2));
                }
                st9 st9Var2 = new st9(3);
                st9Var2.b = (byte) 1;
                arrayList.add(st9Var2);
                st9 st9Var3 = new st9(3);
                st9Var3.b = (byte) 2;
                arrayList.add(st9Var3);
                st9 st9Var4 = new st9(3);
                st9Var4.b = (byte) 3;
                arrayList.add(st9Var4);
                st9 st9Var5 = new st9(3);
                st9Var5.b = (byte) 4;
                arrayList.add(st9Var5);
            }
        }
    }

    private final void i(View view, int i, int i2) {
    }

    private final void j(View view, int i, int i2) {
    }

    private final void k(View view, int i, int i2) {
    }

    public bn0(ao0 ao0Var, zy9 zy9Var) {
        this.a = (byte) 0;
        this.b = ao0Var;
        this.c = zy9Var;
    }

    public bn0(hi3 hi3Var) {
        this.a = (byte) 5;
        this.c = hi3Var;
        this.b = new ArrayList();
        l();
    }

    public bn0(byte b, Context context, Object obj) {
        this.a = b;
        this.c = obj;
        this.b = context;
    }
}
