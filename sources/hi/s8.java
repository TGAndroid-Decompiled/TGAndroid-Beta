package hi;

import android.graphics.Bitmap;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class s8 implements x10 {
    public final int f15377a;
    public final sa f15378b;

    public s8(sa saVar, int i7) {
        this.f15377a = i7;
        this.f15378b = saVar;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        String str;
        cb cbVar;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        l9 l9Var;
        int contentHeight;
        float L;
        int i10 = this.f15377a;
        float f10 = 1.0f;
        float f11 = 0.0f;
        x5 x5Var = null;
        int i11 = 0;
        sa saVar = this.f15378b;
        switch (i10) {
            case 0:
                n2 n2Var = saVar.f15438s;
                n2Var.f15083p = ((Float) obj).floatValue();
                n2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                c7 c7Var = saVar.L1;
                if (c7Var != null) {
                    org.telegram.messenger.g0.z2(c7Var.f14352g0);
                    saVar.L1.f14352g0 = bitmap;
                    p8 p8Var = saVar.f15435r0;
                    if (p8Var != null) {
                        p8Var.U0(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                c7 c7Var2 = (c7) obj;
                saVar.V(c7Var2, false);
                int i12 = saVar.f15389c;
                fi.p6 R1 = mp.u1(i12).R1();
                a0.h hVar = R1.f12425e;
                int i13 = R1.f12422a;
                ArrayList arrayList = R1.h;
                ArrayList arrayList2 = R1.f12427g;
                fi.o6 o6Var = new fi.o6(R1, c7Var2);
                boolean z14 = c7Var2.f14351g;
                long j3 = o6Var.K;
                if (z14) {
                    HashMap hashMap = (HashMap) hVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(c7Var2.f14349f), o6Var);
                } else {
                    R1.d(j3, o6Var, R1.f12423b, false);
                }
                R1.d(j3, o6Var, R1.f12424c, true);
                if (j3 != j10.i(i13).f24817n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList2.size()) {
                            if (org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList2.get(i14)).peer) == j3) {
                                arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i14));
                                z10 = true;
                            } else {
                                i14++;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    if (!z10) {
                        int i15 = 0;
                        while (true) {
                            if (i15 < arrayList.size()) {
                                if (org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(i15)).peer) == j3) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i15));
                                    z10 = true;
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                    if (!z10) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = mp.u1(i13).B1(j3);
                        R1.e0(j3, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        R1.R(j3);
                    }
                }
                o6Var.d();
                ks.f(i13).k(327, new Object[0]);
                if (c7Var2.f14341c && !c7Var2.f14351g) {
                    mp.u1(i12).R1().f12441w.b(c7Var2);
                }
                if (c7Var2.f14348e1 != 0) {
                    ConnectionsManager.getInstance(c7Var2.f14335a).cancelRequest(c7Var2.f14348e1, true);
                    return;
                }
                return;
            case 3:
                x5 x5Var2 = (x5) obj;
                if (saVar.D0 != null) {
                    n6 n6Var = saVar.E0;
                    if (x5Var2 == null) {
                        str = null;
                    } else {
                        str = x5Var2.f15747a;
                    }
                    n6Var.setLink(str);
                    fa faVar = saVar.B0;
                    if (faVar != null) {
                        y5 y5Var = faVar.f14666c;
                        if (saVar.E0.E) {
                            x5Var = saVar.D0.d;
                        }
                        y5Var.a(x5Var);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                c7 c7Var3 = saVar.L1;
                if (c7Var3 != null) {
                    c7Var3.I0 = num.intValue();
                    mp.g1().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                fi.b bVar = saVar.f15381a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.bb bbVar = new org.telegram.ui.Components.cb(saVar.f15385b, new bi.t(2)).f34145a;
                WindowManager.LayoutParams layout = bbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = saVar.f15434r.getWidth();
                    layout.y = (int) (saVar.f15434r.getY() + org.telegram.messenger.g0.L(56.0f));
                    org.telegram.ui.Components.cb cbVar2 = bbVar.f33826a;
                    cbVar2.getWindow().setAttributes(cbVar2.f34146b);
                }
                bbVar.setTouchable(true);
                new lc(bbVar, bVar).G(2131624021, 3, org.telegram.messenger.g0.R2(gd.G(intValue, "StoryPeriodPremium", new Object[0]), org.telegram.ui.ActionBar.m6.Xc, 0, new r8(saVar, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (cbVar = saVar.f15383a1) != null && cbVar.Q) {
                    cbVar.Q = false;
                    if (cbVar.F && cbVar.h == null) {
                        cbVar.H = true;
                        wa waVar = cbVar.f14394a;
                        if (waVar != null) {
                            waVar.h1(true);
                        }
                    }
                }
                saVar.Y0.x(2, bool.booleanValue());
                saVar.Z0.clearAnimation();
                ViewPropertyAnimator animate = saVar.Z0.animate();
                if (bool.booleanValue()) {
                    f10 = 0.0f;
                }
                n10.n(animate, f10, 120L);
                gc gcVar = gc.f35500w;
                if (gcVar != null && gcVar.f35501a == 2) {
                    gcVar.l();
                    return;
                }
                return;
            case 7:
                saVar.k();
                saVar.l();
                saVar.h((Runnable) obj);
                return;
            case 8:
                v vVar = (v) obj;
                fa faVar2 = saVar.B0;
                saVar.A0 = vVar;
                faVar2.o(vVar);
                saVar.J0.setSelected(vVar);
                v9 v9Var = saVar.C0;
                if (v9Var != null) {
                    v9Var.recordHevc = !saVar.B0.j();
                }
                saVar.H0.setDrawable(new w(vVar, false));
                saVar.b0(saVar.I0, saVar.J0.f14205e, true);
                d6 d6Var = saVar.P0;
                if (saVar.B0.j()) {
                    f11 = saVar.B0.getFilledProgress();
                }
                d6Var.e(true, f11);
                g3 g3Var = saVar.N0;
                if (g3Var != null) {
                    g3Var.setMultipleOnClick(saVar.B0.j());
                    saVar.N0.setMaxCount(Math.min(10, v.b() - saVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                saVar.P = true;
                saVar.p(true);
                org.telegram.messenger.g0.h3(new h9((x10) obj, 0), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                if (!saVar.Q1 && !saVar.R1) {
                    int intValue2 = num2.intValue();
                    saVar.P1 = intValue2;
                    v6 v6Var = saVar.f15428p0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v6Var.a(z11, true);
                    if (saVar.P1 == 1 && !saVar.J0.f14205e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    saVar.h0(z12, true);
                    saVar.R0.a(num2.intValue());
                    d6 d6Var2 = saVar.P0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    d6Var2.f14528o0 = -1.0f;
                    d6Var2.f14529p0 = z13;
                    d6Var2.invalidate();
                    if (num2.intValue() == -1) {
                        v9 v9Var2 = saVar.C0;
                        if (v9Var2 != null && v9Var2.isDual()) {
                            saVar.C0.toggleDual();
                        }
                        l3 l3Var = saVar.f15420m1;
                        if (l3Var != null) {
                            l3Var.f(true);
                        }
                        l3 l3Var2 = saVar.n1;
                        if (l3Var2 != null) {
                            l3Var2.f(true);
                        }
                        l3 l3Var3 = saVar.X0;
                        if (l3Var3 != null) {
                            l3Var3.f(true);
                        }
                        saVar.B0.o(null);
                        saVar.B0.c();
                        saVar.J0.setSelected((v) null);
                        v9 v9Var3 = saVar.C0;
                        if (v9Var3 != null) {
                            v9Var3.recordHevc = !saVar.B0.j();
                        }
                    }
                    saVar.J0.a(false, true);
                    saVar.l0(true);
                    return;
                }
                return;
            case 11:
                Float f12 = (Float) obj;
                d6 d6Var3 = saVar.P0;
                d6Var3.f14528o0 = f12.floatValue();
                d6Var3.invalidate();
                d6 d6Var4 = saVar.P0;
                int i16 = 8;
                if (f12.floatValue() <= -1.0f) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                d6Var4.setVisibility(i7);
                saVar.P0.setAlpha(Utilities.l(f12.floatValue() + 1.0f));
                e eVar = saVar.Q0;
                if (f12.floatValue() < 0.0f) {
                    i16 = 0;
                }
                eVar.setVisibility(i16);
                saVar.Q0.setAlpha(org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f));
                saVar.Q0.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f)));
                saVar.Q0.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f)));
                saVar.Q0.setTranslationY(org.telegram.messenger.g0.W1(org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f), org.telegram.messenger.g0.L(12.0f), 0));
                if (f12.floatValue() < 0.0f) {
                    saVar.e(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                if (saVar.L1 != null) {
                    ia iaVar = saVar.f15394d1;
                    if (!iaVar.O1) {
                        iaVar.clearFocus();
                        if (num3.intValue() == 5) {
                            saVar.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            saVar.k0(0, false, true);
                            u9 u9Var = saVar.f15453w1;
                            if (u9Var != null) {
                                u9Var.f14907w0 = false;
                                u9Var.O0(0);
                                u9Var.A0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            saVar.k0(0, false, true);
                            u9 u9Var2 = saVar.f15453w1;
                            if (u9Var2 != null) {
                                u9Var2.O0(2);
                                u9Var2.V1 = true;
                                u9Var2.l0(true);
                                saVar.f15453w1.f14907w0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            saVar.t();
                            saVar.G();
                            u9 u9Var3 = saVar.f15453w1;
                            if (u9Var3 != null) {
                                u9Var3.O0(1);
                                u9Var3.x0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            saVar.k0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            saVar.k0(3, false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 13:
                Integer num4 = (Integer) obj;
                FrameLayout frameLayout = saVar.Z0;
                if (frameLayout != null) {
                    if (saVar.f15406h0 == 2) {
                        L = org.telegram.messenger.g0.L(68.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + saVar.f15394d1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(L);
                }
                l9 l9Var2 = saVar.f15397e1;
                if (l9Var2 != null) {
                    int i17 = -(org.telegram.messenger.g0.L(24.0f) + saVar.f15394d1.getEditTextHeight());
                    cb cbVar3 = saVar.f15383a1;
                    if (cbVar3 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = cbVar3.getContentHeight() - org.telegram.messenger.g0.L(5.0f);
                    }
                    l9Var2.setTranslationY(i17 - contentHeight);
                }
                gc gcVar2 = gc.f35500w;
                if (gcVar2 != null && gcVar2.f35501a == 2) {
                    gcVar2.l();
                }
                if (saVar.f15394d1.f15159p0 && (l9Var = saVar.f15397e1) != null) {
                    l9Var.c(false, true);
                    return;
                }
                return;
            case 14:
                n8 n8Var = (n8) obj;
                c7 c7Var4 = saVar.L1;
                if (c7Var4 != null) {
                    c7Var4.E0 = n8Var;
                }
                ArrayList arrayList3 = saVar.I1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        ((c7) obj2).E0 = n8Var;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                c7 c7Var5 = saVar.L1;
                if (c7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    c7Var5.f14379v0 = inputPeer;
                    ArrayList arrayList4 = saVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i11 < size2) {
                            Object obj3 = arrayList4.get(i11);
                            i11++;
                            ((c7) obj3).f14379v0 = saVar.L1.f14379v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                c7 c7Var6 = saVar.L1;
                if (c7Var6 != null) {
                    c7Var6.f14381w0 = hashSet;
                    ArrayList arrayList5 = saVar.I1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i11 < size3) {
                            Object obj4 = arrayList5.get(i11);
                            i11++;
                            ((c7) obj4).f14381w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                c7 c7Var7 = saVar.L1;
                if (c7Var7 != null) {
                    Bitmap bitmap3 = c7Var7.f14352g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    saVar.L1.f14352g0 = bitmap2;
                    p8 p8Var2 = saVar.f15435r0;
                    if (p8Var2 != null) {
                        p8Var2.U0(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                saVar.f15463z0 = (n8) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                v6 v6Var2 = saVar.f15428p0;
                saVar.f15460y0 = inputPeer2;
                v6Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                v6 v6Var3 = saVar.f15428p0;
                saVar.f15460y0 = inputPeer3;
                v6Var3.set(inputPeer3);
                return;
            default:
                n2 n2Var2 = saVar.f15438s;
                float floatValue = ((Float) obj).floatValue();
                n2Var2.f15082o = floatValue;
                n2Var2.f15081n = n2.f(floatValue);
                n2Var2.g();
                return;
        }
    }
}
