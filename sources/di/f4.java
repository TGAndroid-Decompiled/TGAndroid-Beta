package di;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.g31;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.an;
import org.telegram.ui.bn;
import org.telegram.ui.cn;
import org.telegram.ui.ct;
import org.telegram.ui.eh0;
import org.telegram.ui.g40;
import org.telegram.ui.hw;
import org.telegram.ui.kb1;
import org.telegram.ui.ky0;
import org.telegram.ui.ly0;
import org.telegram.ui.mb1;
import org.telegram.ui.mj;
import org.telegram.ui.my0;
import org.telegram.ui.n91;
import org.telegram.ui.nm;
import org.telegram.ui.p91;
import org.telegram.ui.q91;
import org.telegram.ui.u91;
import org.telegram.ui.uv;
import org.telegram.ui.yw;
import org.telegram.ui.zz;
public final class f4 extends n61 {
    public final int f8530a;
    public final Object f8531b;
    public final Object f8532c;

    public f4(int i7, Context context, Object obj) {
        this.f8530a = i7;
        this.f8532c = obj;
        this.f8531b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        k4 k4Var;
        fi.c6 c6Var;
        org.telegram.ui.ActionBar.e2 e2Var;
        int i11 = this.f8530a;
        Object obj = this.f8532c;
        switch (i11) {
            case 0:
                c6 c6Var2 = (c6) obj;
                if (i10 == 0) {
                    c6.i1(c6Var2, false);
                    bi.b2 b2Var = c6Var2.Y1;
                    if (b2Var != null) {
                        k4Var = b2Var.U1;
                    } else {
                        return;
                    }
                } else if (i10 == 2) {
                    c6.i1(c6Var2, true);
                    bi.b2 b2Var2 = c6Var2.Z1;
                    if (b2Var2 != null) {
                        k4Var = b2Var2.U1;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                org.telegram.messenger.g0.E2(k4Var);
                frameLayout.addView(k4Var);
                return;
            case 1:
                vp0 vp0Var = (vp0) obj;
                gi.m mVar = (gi.m) view;
                if (i7 == 0) {
                    c6Var = vp0Var.f13355e;
                } else {
                    c6Var = (fi.c6) vp0Var.f13356f.get(i7 - 1);
                }
                c6Var.H(null);
                mVar.setList(c6Var);
                mVar.setVisibleHeight(vp0Var.f13360w);
                return;
            case 2:
                if (view instanceof cn) {
                    ((cn) view).f46216a.rd(((an) obj).J3);
                }
                WeakHashMap weakHashMap = r0.i0.f55671a;
                r0.y.c(view);
                return;
            case 3:
                hw hwVar = (hw) obj;
                hwVar.O(view, i7, hwVar.N0, true);
                return;
            case 4:
                return;
            case 5:
                ((ly0) view).a(i10);
                return;
            case 6:
                return;
            case 7:
                q91 q91Var = (q91) obj;
                q91Var.K(view, i7, q91Var.f50522e0, true);
                return;
            case 8:
                mb1 mb1Var = (mb1) obj;
                SparseArray sparseArray = mb1Var.f49203a;
                kb1 kb1Var = (kb1) sparseArray.get(i7);
                if (kb1Var != null) {
                    e2Var = kb1Var.f48666a;
                } else {
                    org.telegram.ui.ActionBar.e2 a02 = mb1Var.a0(i7);
                    kb1 kb1Var2 = new kb1(a02);
                    sparseArray.put(i7, kb1Var2);
                    e2Var = a02;
                    kb1Var = kb1Var2;
                }
                if (!kb1Var.f48667b) {
                    e2Var.onFragmentCreate();
                    kb1Var.f48667b = true;
                }
                e2Var.setParentLayout(mb1Var.getParentLayout());
                e2Var.setSimpleMenuOverlayHost(mb1Var);
                if (e2Var.getFragmentView() == null) {
                    e2Var.performCreateView((Context) this.f8531b);
                    e2Var.setTitleOverlayText(mb1Var.f49208n, mb1Var.f49209r, mb1Var.f49210s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = e2Var.getFragmentView();
                org.telegram.messenger.g0.E2(fragmentView);
                if (!e2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, c8.ja.c(-1.0f, -1));
                if (e2Var.getActionBar() != null && e2Var.getActionBar().L) {
                    org.telegram.messenger.g0.E2(e2Var.getActionBar());
                    frameLayout2.addView(e2Var.getActionBar());
                }
                WeakHashMap weakHashMap2 = r0.i0.f55671a;
                r0.y.c(frameLayout2);
                mb1Var.checkSystemBarColors();
                mb1Var.Z();
                return;
            case 9:
                org.telegram.ui.Wallet.y5.Z0((u41) view, false);
                return;
            default:
                return;
        }
    }

    @Override
    public final View d(int i7) {
        k4 k4Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i13;
        switch (this.f8530a) {
            case 0:
                c6 c6Var = (c6) this.f8532c;
                if (i7 == 0) {
                    c6.i1(c6Var, false);
                    bi.b2 b2Var = c6Var.Y1;
                    if (b2Var != null) {
                        k4Var = b2Var.U1;
                        org.telegram.messenger.g0.E2(k4Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f8531b);
                        frameLayout.addView(k4Var, c8.ja.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i7 == 1) {
                    k4Var = c6Var.U1;
                } else {
                    if (i7 == 2) {
                        c6.i1(c6Var, true);
                        bi.b2 b2Var2 = c6Var.Z1;
                        if (b2Var2 != null) {
                            k4Var = b2Var2.U1;
                        }
                    }
                    return null;
                }
                org.telegram.messenger.g0.E2(k4Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f8531b);
                frameLayout2.addView(k4Var, c8.ja.e(-1, -1, 119));
                return frameLayout2;
            case 1:
                return new gi.m((vp0) this.f8532c, (Context) this.f8531b);
            case 2:
                Context context = (Context) this.f8531b;
                an anVar = (an) this.f8532c;
                if (i7 == 0) {
                    return new nm(anVar, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i7);
                bundle.putString("searchHashtag", anVar.J3);
                mj mjVar = new mj(context, anVar.getParentLayout(), bundle, 0);
                mjVar.h = false;
                bn bnVar = mjVar.f46216a;
                bnVar.N.f58445a = anVar.N;
                bnVar.ya = anVar.Aa;
                bnVar.f45452za = anVar;
                bnVar.f45286m9 = new org.telegram.ui.f(this, 12);
                return mjVar;
            case 3:
                hw hwVar = (hw) this.f8532c;
                yw ywVar = hwVar.M0;
                if (i7 == 1) {
                    return hwVar.f36045a0;
                }
                if (i7 == 3) {
                    return hwVar.f36054i0;
                }
                if (i7 == 4) {
                    return hwVar.f36058n0;
                }
                if (i7 == 5) {
                    return hwVar.f36065u0;
                }
                if (i7 == 2) {
                    il0 il0Var = new il0(hwVar.K0, ywVar);
                    hwVar.J0 = il0Var;
                    il0Var.b(hwVar.X0, hwVar.Y0, false);
                    hwVar.J0.f35652b.setClipToPadding(false);
                    hwVar.J0.f35652b.j(new hm0(this, 0));
                    hwVar.J0.f35652b.D0(new wa0(hwVar, 22));
                    hwVar.J0.setUiCallback(hwVar);
                    return hwVar.J0;
                } else if (i7 == 6) {
                    return hwVar.f36063s0;
                } else {
                    zz zzVar = new zz(ywVar);
                    zzVar.setChatPreviewDelegate(hwVar.S0);
                    zzVar.setUiCallback(hwVar);
                    zzVar.j(hwVar.X0, hwVar.Y0, false);
                    dh.c cVar = hwVar.f36046a1;
                    if (cVar != null) {
                        zzVar.setBlurredBackgroundDrawableFactory(cVar);
                    }
                    ct ctVar = zzVar.f54075b;
                    ctVar.setClipToPadding(false);
                    ctVar.j(new hm0(this, 1));
                    ctVar.D0(new wa0(hwVar, 22));
                    return zzVar;
                }
            case 4:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f8531b);
                frameLayout3.setOnClickListener(new g40(this, 24));
                return frameLayout3;
            case 5:
                return new ly0((my0) this.f8532c, (Context) this.f8531b);
            case 6:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f8531b);
                frameLayout4.setOnClickListener(new ky0(this, 9));
                return frameLayout4;
            case 7:
                q91 q91Var = (q91) this.f8532c;
                u91 u91Var = q91Var.f50539w0;
                if (i7 == 1) {
                    return q91Var.W;
                }
                if (i7 == 2) {
                    i10 = ((org.telegram.ui.ActionBar.e2) u91Var).currentAccount;
                    il0 il0Var2 = new il0(i10, u91Var);
                    il0Var2.f35652b.j(new p91(0));
                    il0Var2.setUiCallback(q91Var);
                    return il0Var2;
                }
                zz zzVar2 = new zz(u91Var);
                zzVar2.setChatPreviewDelegate(q91Var.f50537u0);
                zzVar2.setUiCallback(q91Var);
                zzVar2.f54075b.j(new p91(1));
                return zzVar2;
            case 8:
                return new eh0((Context) this.f8531b, 15);
            case 9:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.f8532c;
                u41[] u41VarArr = y5Var.f44749s0;
                u41 u41Var = u41VarArr[i7];
                if (u41Var == null) {
                    Context context2 = (Context) this.f8531b;
                    i11 = ((org.telegram.ui.ActionBar.e2) y5Var).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.e2) y5Var).classGuid;
                    org.telegram.ui.Components.o oVar = new org.telegram.ui.Components.o(this, i7, 2);
                    org.telegram.ui.Wallet.h4 h4Var = new org.telegram.ui.Wallet.h4(y5Var);
                    org.telegram.ui.Wallet.h4 h4Var2 = new org.telegram.ui.Wallet.h4(y5Var);
                    e6Var = ((org.telegram.ui.ActionBar.e2) y5Var).resourceProvider;
                    if (i7 == 1) {
                        i13 = 3;
                    } else {
                        i13 = -1;
                    }
                    bi.y4 y4Var = new bi.y4(context2, i11, i12, false, oVar, h4Var, h4Var2, e6Var, i13, 1);
                    if (i7 == 1) {
                        y4Var.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(12.0f));
                    }
                    y4Var.setFocusableInTouchMode(false);
                    y4Var.setClipChildren(false);
                    y4Var.setClipToPadding(false);
                    if (i7 == 0) {
                        y4Var.r1();
                    } else {
                        y4Var.setSelectorType(9);
                        y4Var.setSelectorDrawableColor(0);
                    }
                    y4Var.f39895g3.f38201r = false;
                    y4Var.j(new g31(this, i7));
                    u41VarArr[i7] = y4Var;
                    return y4Var;
                }
                return u41Var;
            default:
                if (i7 == 0) {
                    return ((wg.y) this.f8531b).f29682b;
                }
                return ((wg.u0) this.f8532c).f29682b;
        }
    }

    @Override
    public final int e() {
        switch (this.f8530a) {
            case 0:
                c6 c6Var = (c6) this.f8532c;
                return (c6Var.I1(true) ? 1 : 0) + (c6Var.I1(false) ? 1 : 0) + 1;
            case 1:
                return ((vp0) this.f8532c).f13356f.size() + 1;
            case 2:
                return 3;
            case 3:
                return ((ArrayList) this.f8531b).size();
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
                return 2;
            case 7:
                return ((ArrayList) this.f8531b).size();
            case 8:
                ((mb1) this.f8532c).getClass();
                return 4;
            case 9:
                if (((org.telegram.ui.Wallet.y5) this.f8532c).f44735g0) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    @Override
    public int f(int i7) {
        switch (this.f8530a) {
            case 1:
                if (i7 == 0) {
                    return 0;
                }
                return ((fi.c6) ((vp0) this.f8532c).f13356f.get(i7 - 1)).E.hashCode();
            default:
                return i7;
        }
    }

    @Override
    public CharSequence g(int i7) {
        int i10;
        int i11 = this.f8530a;
        Object obj = this.f8531b;
        switch (i11) {
            case 1:
                if (i7 == 0) {
                    return hd.M0(2131746710, null);
                }
                return p21.P0(((fi.c6) ((vp0) this.f8532c).f13356f.get(i7 - 1)).E);
            case 2:
                if (i7 != 1) {
                    if (i7 != 2) {
                        return hd.M0(2131745709, null);
                    }
                    return hd.M0(2131745712, null);
                }
                return hd.M0(2131745738, null);
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                if (((im0) arrayList.get(i7)).f35668a == 0) {
                    return hd.M0(2131745823, null);
                }
                if (((im0) arrayList.get(i7)).f35668a == 1) {
                    return hd.M0(2131752258, null);
                }
                if (((im0) arrayList.get(i7)).f35668a == 4) {
                    return hd.M0(2131754178, null);
                }
                if (((im0) arrayList.get(i7)).f35668a == 6) {
                    return hd.M0(2131745733, null);
                }
                if (((im0) arrayList.get(i7)).f35668a == 2) {
                    return hd.M0(2131751343, null);
                }
                if (((im0) arrayList.get(i7)).f35668a == 5) {
                    return hd.M0(2131746584, null);
                }
                jg.o0 o0Var = jg.q0.f17237k3[((im0) arrayList.get(i7)).f35669b];
                String str = o0Var.f17221c;
                if (str != null) {
                    return str;
                }
                return hd.M0(o0Var.f17220b, null);
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                return super.g(i7);
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((n91) arrayList2.get(i7)).f49526a == 0) {
                    return hd.M0(2131745756, null);
                }
                if (((n91) arrayList2.get(i7)).f49526a == 1) {
                    return hd.M0(2131751343, null);
                }
                jg.o0 o0Var2 = jg.q0.f17237k3[((n91) arrayList2.get(i7)).f49527b];
                String str2 = o0Var2.f17221c;
                if (str2 != null) {
                    return str2;
                }
                return hd.M0(o0Var2.f17220b, null);
            case 9:
                if (i7 == 0) {
                    i10 = 2131742982;
                } else {
                    i10 = 2131743170;
                }
                return hd.M0(i10, null);
        }
    }

    @Override
    public int h(int i7) {
        switch (this.f8530a) {
            case 0:
                return (i7 - (((c6) this.f8532c).I1(false) ? 1 : 0)) + 1;
            case 1:
            case 4:
            case 6:
            case 8:
            default:
                return super.h(i7);
            case 2:
                return i7;
            case 3:
                ArrayList arrayList = (ArrayList) this.f8531b;
                if (((im0) arrayList.get(i7)).f35668a == 0) {
                    return 1;
                }
                if (((im0) arrayList.get(i7)).f35668a == 1) {
                    return 3;
                }
                if (((im0) arrayList.get(i7)).f35668a == 4) {
                    return 4;
                }
                if (((im0) arrayList.get(i7)).f35668a == 2) {
                    return 2;
                }
                if (((im0) arrayList.get(i7)).f35668a == 5) {
                    return 5;
                }
                if (((im0) arrayList.get(i7)).f35668a == 6) {
                    return 6;
                }
                return ((im0) arrayList.get(i7)).f35668a + i7;
            case 5:
                if (i7 == 0) {
                    return 0;
                }
                return 1;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.f8531b;
                if (((n91) arrayList2.get(i7)).f49526a == 0) {
                    return 1;
                }
                if (((n91) arrayList2.get(i7)).f49526a == 1) {
                    return 2;
                }
                return ((n91) arrayList2.get(i7)).f49526a + i7;
            case 9:
            case 10:
                return i7;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f8531b;
        arrayList.clear();
        arrayList.add(new im0(0));
        hw hwVar = (hw) this.f8532c;
        if (hwVar.W0 == 0) {
            if (hwVar.f36064t0) {
                arrayList.add(new im0(5));
            }
            arrayList.add(new im0(1));
            arrayList.add(new im0(4));
            arrayList.add(new im0(6));
            if (!hwVar.R0) {
                im0 im0Var = new im0(3);
                im0Var.f35669b = 0;
                arrayList.add(im0Var);
                uv uvVar = hwVar.f47835e1.H3;
                if (uvVar == null || !uvVar.c()) {
                    arrayList.add(new im0(2));
                }
                im0 im0Var2 = new im0(3);
                im0Var2.f35669b = 1;
                arrayList.add(im0Var2);
                im0 im0Var3 = new im0(3);
                im0Var3.f35669b = 2;
                arrayList.add(im0Var3);
                im0 im0Var4 = new im0(3);
                im0Var4.f35669b = 3;
                arrayList.add(im0Var4);
                im0 im0Var5 = new im0(3);
                im0Var5.f35669b = 4;
                arrayList.add(im0Var5);
            }
        }
    }

    public f4(hw hwVar) {
        this.f8530a = 3;
        this.f8532c = hwVar;
        this.f8531b = new ArrayList();
        l();
    }

    public f4(q91 q91Var) {
        this.f8530a = 7;
        this.f8532c = q91Var;
        ArrayList arrayList = new ArrayList();
        this.f8531b = arrayList;
        arrayList.add(new n91(0));
        n91 n91Var = new n91(2);
        n91Var.f49527b = 0;
        arrayList.add(n91Var);
        n91 n91Var2 = new n91(2);
        n91Var2.f49527b = 1;
        arrayList.add(n91Var2);
        n91 n91Var3 = new n91(2);
        n91Var3.f49527b = 2;
        arrayList.add(n91Var3);
        n91 n91Var4 = new n91(2);
        n91Var4.f49527b = 3;
        arrayList.add(n91Var4);
        n91 n91Var5 = new n91(2);
        n91Var5.f49527b = 4;
        arrayList.add(n91Var5);
    }

    public f4(wg.y yVar, wg.u0 u0Var) {
        this.f8530a = 10;
        this.f8531b = yVar;
        this.f8532c = u0Var;
    }

    private final void i(View view, int i7, int i10) {
    }

    private final void j(View view, int i7, int i10) {
    }

    private final void k(View view, int i7, int i10) {
    }
}
