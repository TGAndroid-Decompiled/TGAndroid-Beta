package hi;

import android.graphics.Bitmap;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.xb;
public final class t8 implements z10 {
    public final int f15156a;
    public final sa f15157b;

    public t8(sa saVar, int i7) {
        this.f15156a = i7;
        this.f15157b = saVar;
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
        int i10 = this.f15156a;
        float f10 = 1.0f;
        float f11 = 0.0f;
        z5 z5Var = null;
        int i11 = 0;
        sa saVar = this.f15157b;
        switch (i10) {
            case 0:
                n2 n2Var = saVar.f15092s;
                n2Var.f14752p = ((Float) obj).floatValue();
                n2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                d7 d7Var = saVar.L1;
                if (d7Var != null) {
                    org.telegram.messenger.g0.z2(d7Var.f14140g0);
                    saVar.L1.f14140g0 = bitmap;
                    q8 q8Var = saVar.f15089r0;
                    if (q8Var != null) {
                        q8Var.T0(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                d7 d7Var2 = (d7) obj;
                saVar.V(d7Var2, false);
                int i12 = saVar.f15043c;
                fi.s6 P1 = np.s1(i12).P1();
                a0.h hVar = P1.f12322e;
                int i13 = P1.f12319a;
                ArrayList arrayList = P1.h;
                ArrayList arrayList2 = P1.f12324g;
                fi.r6 r6Var = new fi.r6(P1, d7Var2);
                boolean z14 = d7Var2.f14139g;
                long j3 = r6Var.K;
                if (z14) {
                    HashMap hashMap = (HashMap) hVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(d7Var2.f14137f), r6Var);
                } else {
                    P1.d(j3, r6Var, P1.f12320b, false);
                }
                P1.d(j3, r6Var, P1.f12321c, true);
                if (j3 != m10.i(i13).f24959n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList2.size()) {
                            if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i14)).peer) == j3) {
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
                                if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i15)).peer) == j3) {
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
                        tL_peerStories.peer = np.s1(i13).z1(j3);
                        P1.e0(j3, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        P1.R(j3);
                    }
                }
                r6Var.d();
                ns.f(i13).k(324, new Object[0]);
                if (d7Var2.f14129c && !d7Var2.f14139g) {
                    np.s1(i12).P1().f12338w.b(d7Var2);
                }
                if (d7Var2.f14136e1 != 0) {
                    ConnectionsManager.getInstance(d7Var2.f14123a).cancelRequest(d7Var2.f14136e1, true);
                    return;
                }
                return;
            case 3:
                z5 z5Var2 = (z5) obj;
                if (saVar.D0 != null) {
                    p6 p6Var = saVar.E0;
                    if (z5Var2 == null) {
                        str = null;
                    } else {
                        str = z5Var2.f15503a;
                    }
                    p6Var.setLink(str);
                    fa faVar = saVar.B0;
                    if (faVar != null) {
                        a6 a6Var = faVar.f14196c;
                        if (saVar.E0.E) {
                            z5Var = saVar.D0.d;
                        }
                        a6Var.a(z5Var);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                d7 d7Var3 = saVar.L1;
                if (d7Var3 != null) {
                    d7Var3.I0 = num.intValue();
                    np.e1().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                fi.b bVar = saVar.f15035a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.sa saVar2 = new org.telegram.ui.Components.ta(saVar.f15039b, new bi.t(2)).f39616a;
                WindowManager.LayoutParams layout = saVar2.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = saVar.f15088r.getWidth();
                    layout.y = (int) (saVar.f15088r.getY() + org.telegram.messenger.g0.L(56.0f));
                    org.telegram.ui.Components.ta taVar = saVar2.f39261a;
                    taVar.getWindow().setAttributes(taVar.f39617b);
                }
                saVar2.setTouchable(true);
                new cc(saVar2, bVar).G(2131624021, 3, org.telegram.messenger.g0.S2(hd.G(intValue, "StoryPeriodPremium", new Object[0]), org.telegram.ui.ActionBar.j6.Xc, 0, new s8(saVar, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (cbVar = saVar.f15037a1) != null && cbVar.Q) {
                    cbVar.Q = false;
                    if (cbVar.F && cbVar.h == null) {
                        cbVar.H = true;
                        wa waVar = cbVar.f13990a;
                        if (waVar != null) {
                            waVar.S(true);
                        }
                    }
                }
                saVar.Y0.x(2, bool.booleanValue());
                saVar.Z0.clearAnimation();
                ViewPropertyAnimator animate = saVar.Z0.animate();
                if (bool.booleanValue()) {
                    f10 = 0.0f;
                }
                i20.m(animate, f10, 120L);
                xb xbVar = xb.f41627w;
                if (xbVar != null && xbVar.f41628a == 2) {
                    xbVar.l();
                    return;
                }
                return;
            case 7:
                saVar.k();
                saVar.l();
                saVar.h((Runnable) obj);
                return;
            case 8:
                t tVar = (t) obj;
                fa faVar2 = saVar.B0;
                saVar.A0 = tVar;
                faVar2.o(tVar);
                saVar.J0.setSelected(tVar);
                v9 v9Var = saVar.C0;
                if (v9Var != null) {
                    v9Var.recordHevc = !saVar.B0.j();
                }
                saVar.H0.setDrawable(new u(tVar, false));
                saVar.b0(saVar.I0, saVar.J0.f15403e, true);
                f6 f6Var = saVar.P0;
                if (saVar.B0.j()) {
                    f11 = saVar.B0.getFilledProgress();
                }
                f6Var.e(true, f11);
                g3 g3Var = saVar.N0;
                if (g3Var != null) {
                    g3Var.setMultipleOnClick(saVar.B0.j());
                    saVar.N0.setMaxCount(Math.min(10, t.b() - saVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                saVar.P = true;
                saVar.p(true);
                org.telegram.messenger.g0.i3(new h9((z10) obj, 0), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                if (!saVar.Q1 && !saVar.R1) {
                    int intValue2 = num2.intValue();
                    saVar.P1 = intValue2;
                    w6 w6Var = saVar.f15082p0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    w6Var.a(z11, true);
                    if (saVar.P1 == 1 && !saVar.J0.f15403e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    saVar.h0(z12, true);
                    saVar.R0.a(num2.intValue());
                    f6 f6Var2 = saVar.P0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    f6Var2.f14294o0 = -1.0f;
                    f6Var2.f14295p0 = z13;
                    f6Var2.invalidate();
                    if (num2.intValue() == -1) {
                        v9 v9Var2 = saVar.C0;
                        if (v9Var2 != null && v9Var2.isDual()) {
                            saVar.C0.toggleDual();
                        }
                        l3 l3Var = saVar.f15074m1;
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
                        saVar.J0.setSelected((t) null);
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
                f6 f6Var3 = saVar.P0;
                f6Var3.f14294o0 = f12.floatValue();
                f6Var3.invalidate();
                f6 f6Var4 = saVar.P0;
                int i16 = 8;
                if (f12.floatValue() <= -1.0f) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                f6Var4.setVisibility(i7);
                saVar.P0.setAlpha(Utilities.l(f12.floatValue() + 1.0f));
                d dVar = saVar.Q0;
                if (f12.floatValue() < 0.0f) {
                    i16 = 0;
                }
                dVar.setVisibility(i16);
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
                    ia iaVar = saVar.f15048d1;
                    if (!iaVar.O1) {
                        iaVar.clearFocus();
                        if (num3.intValue() == 5) {
                            saVar.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            saVar.k0(0, false, true);
                            u9 u9Var = saVar.f15107w1;
                            if (u9Var != null) {
                                u9Var.f14696w0 = false;
                                u9Var.O0(0);
                                u9Var.A0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            saVar.k0(0, false, true);
                            u9 u9Var2 = saVar.f15107w1;
                            if (u9Var2 != null) {
                                u9Var2.O0(2);
                                u9Var2.V1 = true;
                                u9Var2.l0(true);
                                saVar.f15107w1.f14696w0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            saVar.t();
                            saVar.G();
                            u9 u9Var3 = saVar.f15107w1;
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
                    if (saVar.f15060h0 == 2) {
                        L = org.telegram.messenger.g0.L(68.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + saVar.f15048d1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(L);
                }
                l9 l9Var2 = saVar.f15051e1;
                if (l9Var2 != null) {
                    int i17 = -(org.telegram.messenger.g0.L(24.0f) + saVar.f15048d1.getEditTextHeight());
                    cb cbVar2 = saVar.f15037a1;
                    if (cbVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = cbVar2.getContentHeight() - org.telegram.messenger.g0.L(5.0f);
                    }
                    l9Var2.setTranslationY(i17 - contentHeight);
                }
                xb xbVar2 = xb.f41627w;
                if (xbVar2 != null && xbVar2.f41628a == 2) {
                    xbVar2.l();
                }
                if (saVar.f15048d1.f14634p0 && (l9Var = saVar.f15051e1) != null) {
                    l9Var.c(false, true);
                    return;
                }
                return;
            case 14:
                o8 o8Var = (o8) obj;
                d7 d7Var4 = saVar.L1;
                if (d7Var4 != null) {
                    d7Var4.E0 = o8Var;
                }
                ArrayList arrayList3 = saVar.I1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        ((d7) obj2).E0 = o8Var;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                d7 d7Var5 = saVar.L1;
                if (d7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    d7Var5.f14167v0 = inputPeer;
                    ArrayList arrayList4 = saVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i11 < size2) {
                            Object obj3 = arrayList4.get(i11);
                            i11++;
                            ((d7) obj3).f14167v0 = saVar.L1.f14167v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                d7 d7Var6 = saVar.L1;
                if (d7Var6 != null) {
                    d7Var6.f14169w0 = hashSet;
                    ArrayList arrayList5 = saVar.I1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i11 < size3) {
                            Object obj4 = arrayList5.get(i11);
                            i11++;
                            ((d7) obj4).f14169w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                d7 d7Var7 = saVar.L1;
                if (d7Var7 != null) {
                    Bitmap bitmap3 = d7Var7.f14140g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    saVar.L1.f14140g0 = bitmap2;
                    q8 q8Var2 = saVar.f15089r0;
                    if (q8Var2 != null) {
                        q8Var2.T0(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                saVar.f15117z0 = (o8) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                w6 w6Var2 = saVar.f15082p0;
                saVar.f15114y0 = inputPeer2;
                w6Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                w6 w6Var3 = saVar.f15082p0;
                saVar.f15114y0 = inputPeer3;
                w6Var3.set(inputPeer3);
                return;
            default:
                n2 n2Var2 = saVar.f15092s;
                float floatValue = ((Float) obj).floatValue();
                n2Var2.f14751o = floatValue;
                n2Var2.f14750n = n2.f(floatValue);
                n2Var2.g();
                return;
        }
    }
}
