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
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class t8 implements y10 {
    public final int f15383a;
    public final ta f15384b;

    public t8(ta taVar, int i7) {
        this.f15383a = i7;
        this.f15384b = taVar;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        String str;
        db dbVar;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        m9 m9Var;
        int contentHeight;
        float L;
        int i10 = this.f15383a;
        float f10 = 1.0f;
        float f11 = 0.0f;
        y5 y5Var = null;
        int i11 = 0;
        ta taVar = this.f15384b;
        switch (i10) {
            case 0:
                n2 n2Var = taVar.f15444s;
                n2Var.f15062p = ((Float) obj).floatValue();
                n2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                d7 d7Var = taVar.L1;
                if (d7Var != null) {
                    org.telegram.messenger.g0.z2(d7Var.f14379g0);
                    taVar.L1.f14379g0 = bitmap;
                    q8 q8Var = taVar.f15441r0;
                    if (q8Var != null) {
                        q8Var.U0(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                d7 d7Var2 = (d7) obj;
                taVar.V(d7Var2, false);
                int i12 = taVar.f15395c;
                fi.p6 R1 = np.u1(i12).R1();
                a0.h hVar = R1.f12380e;
                int i13 = R1.f12377a;
                ArrayList arrayList = R1.h;
                ArrayList arrayList2 = R1.f12382g;
                fi.o6 o6Var = new fi.o6(R1, d7Var2);
                boolean z14 = d7Var2.f14378g;
                long j3 = o6Var.K;
                if (z14) {
                    HashMap hashMap = (HashMap) hVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(d7Var2.f14376f), o6Var);
                } else {
                    R1.d(j3, o6Var, R1.f12378b, false);
                }
                R1.d(j3, o6Var, R1.f12379c, true);
                if (j3 != k10.i(i13).f24951n) {
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
                        tL_peerStories.peer = np.u1(i13).B1(j3);
                        R1.e0(j3, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        R1.R(j3);
                    }
                }
                o6Var.d();
                ls.f(i13).k(327, new Object[0]);
                if (d7Var2.f14368c && !d7Var2.f14378g) {
                    np.u1(i12).R1().f12396w.b(d7Var2);
                }
                if (d7Var2.f14375e1 != 0) {
                    ConnectionsManager.getInstance(d7Var2.f14362a).cancelRequest(d7Var2.f14375e1, true);
                    return;
                }
                return;
            case 3:
                y5 y5Var2 = (y5) obj;
                if (taVar.D0 != null) {
                    o6 o6Var2 = taVar.E0;
                    if (y5Var2 == null) {
                        str = null;
                    } else {
                        str = y5Var2.f15723a;
                    }
                    o6Var2.setLink(str);
                    ga gaVar = taVar.B0;
                    if (gaVar != null) {
                        z5 z5Var = gaVar.f14563c;
                        if (taVar.E0.E) {
                            y5Var = taVar.D0.d;
                        }
                        z5Var.a(y5Var);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                d7 d7Var3 = taVar.L1;
                if (d7Var3 != null) {
                    d7Var3.I0 = num.intValue();
                    np.g1().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                fi.b bVar = taVar.f15387a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.bb bbVar = new org.telegram.ui.Components.cb(taVar.f15391b, new bi.t(2)).f34103a;
                WindowManager.LayoutParams layout = bbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = taVar.f15440r.getWidth();
                    layout.y = (int) (taVar.f15440r.getY() + org.telegram.messenger.g0.L(56.0f));
                    org.telegram.ui.Components.cb cbVar = bbVar.f33796a;
                    cbVar.getWindow().setAttributes(cbVar.f34104b);
                }
                bbVar.setTouchable(true);
                new lc(bbVar, bVar).G(2131624021, 3, org.telegram.messenger.g0.R2(hd.G(intValue, "StoryPeriodPremium", new Object[0]), org.telegram.ui.ActionBar.m6.Xc, 0, new s8(taVar, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (dbVar = taVar.f15389a1) != null && dbVar.Q) {
                    dbVar.Q = false;
                    if (dbVar.F && dbVar.h == null) {
                        dbVar.H = true;
                        xa xaVar = dbVar.f14421a;
                        if (xaVar != null) {
                            xaVar.h1(true);
                        }
                    }
                }
                taVar.Y0.x(2, bool.booleanValue());
                taVar.Z0.clearAnimation();
                ViewPropertyAnimator animate = taVar.Z0.animate();
                if (bool.booleanValue()) {
                    f10 = 0.0f;
                }
                o10.n(animate, f10, 120L);
                gc gcVar = gc.f35481w;
                if (gcVar != null && gcVar.f35482a == 2) {
                    gcVar.l();
                    return;
                }
                return;
            case 7:
                taVar.k();
                taVar.l();
                taVar.h((Runnable) obj);
                return;
            case 8:
                t tVar = (t) obj;
                ga gaVar2 = taVar.B0;
                taVar.A0 = tVar;
                gaVar2.o(tVar);
                taVar.J0.setSelected(tVar);
                w9 w9Var = taVar.C0;
                if (w9Var != null) {
                    w9Var.recordHevc = !taVar.B0.j();
                }
                taVar.H0.setDrawable(new u(tVar, false));
                taVar.b0(taVar.I0, taVar.J0.f15704e, true);
                e6 e6Var = taVar.P0;
                if (taVar.B0.j()) {
                    f11 = taVar.B0.getFilledProgress();
                }
                e6Var.e(true, f11);
                g3 g3Var = taVar.N0;
                if (g3Var != null) {
                    g3Var.setMultipleOnClick(taVar.B0.j());
                    taVar.N0.setMaxCount(Math.min(10, t.b() - taVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                taVar.P = true;
                taVar.p(true);
                org.telegram.messenger.g0.h3(new i9((y10) obj, 0), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                if (!taVar.Q1 && !taVar.R1) {
                    int intValue2 = num2.intValue();
                    taVar.P1 = intValue2;
                    w6 w6Var = taVar.f15434p0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    w6Var.a(z11, true);
                    if (taVar.P1 == 1 && !taVar.J0.f15704e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    taVar.h0(z12, true);
                    taVar.R0.a(num2.intValue());
                    e6 e6Var2 = taVar.P0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    e6Var2.f14529o0 = -1.0f;
                    e6Var2.f14530p0 = z13;
                    e6Var2.invalidate();
                    if (num2.intValue() == -1) {
                        w9 w9Var2 = taVar.C0;
                        if (w9Var2 != null && w9Var2.isDual()) {
                            taVar.C0.toggleDual();
                        }
                        l3 l3Var = taVar.f15426m1;
                        if (l3Var != null) {
                            l3Var.f(true);
                        }
                        l3 l3Var2 = taVar.n1;
                        if (l3Var2 != null) {
                            l3Var2.f(true);
                        }
                        l3 l3Var3 = taVar.X0;
                        if (l3Var3 != null) {
                            l3Var3.f(true);
                        }
                        taVar.B0.o(null);
                        taVar.B0.c();
                        taVar.J0.setSelected((t) null);
                        w9 w9Var3 = taVar.C0;
                        if (w9Var3 != null) {
                            w9Var3.recordHevc = !taVar.B0.j();
                        }
                    }
                    taVar.J0.a(false, true);
                    taVar.l0(true);
                    return;
                }
                return;
            case 11:
                Float f12 = (Float) obj;
                e6 e6Var3 = taVar.P0;
                e6Var3.f14529o0 = f12.floatValue();
                e6Var3.invalidate();
                e6 e6Var4 = taVar.P0;
                int i16 = 8;
                if (f12.floatValue() <= -1.0f) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                e6Var4.setVisibility(i7);
                taVar.P0.setAlpha(Utilities.l(f12.floatValue() + 1.0f));
                d dVar = taVar.Q0;
                if (f12.floatValue() < 0.0f) {
                    i16 = 0;
                }
                dVar.setVisibility(i16);
                taVar.Q0.setAlpha(org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f));
                taVar.Q0.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f)));
                taVar.Q0.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f)));
                taVar.Q0.setTranslationY(org.telegram.messenger.g0.W1(org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f), org.telegram.messenger.g0.L(12.0f), 0));
                if (f12.floatValue() < 0.0f) {
                    taVar.e(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                if (taVar.L1 != null) {
                    ja jaVar = taVar.f15400d1;
                    if (!jaVar.O1) {
                        jaVar.clearFocus();
                        if (num3.intValue() == 5) {
                            taVar.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            taVar.k0(0, false, true);
                            v9 v9Var = taVar.f15459w1;
                            if (v9Var != null) {
                                v9Var.f14922w0 = false;
                                v9Var.O0(0);
                                v9Var.A0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            taVar.k0(0, false, true);
                            v9 v9Var2 = taVar.f15459w1;
                            if (v9Var2 != null) {
                                v9Var2.O0(2);
                                v9Var2.V1 = true;
                                v9Var2.l0(true);
                                taVar.f15459w1.f14922w0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            taVar.t();
                            taVar.G();
                            v9 v9Var3 = taVar.f15459w1;
                            if (v9Var3 != null) {
                                v9Var3.O0(1);
                                v9Var3.x0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            taVar.k0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            taVar.k0(3, false, true);
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
                FrameLayout frameLayout = taVar.Z0;
                if (frameLayout != null) {
                    if (taVar.f15412h0 == 2) {
                        L = org.telegram.messenger.g0.L(68.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + taVar.f15400d1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(L);
                }
                m9 m9Var2 = taVar.f15403e1;
                if (m9Var2 != null) {
                    int i17 = -(org.telegram.messenger.g0.L(24.0f) + taVar.f15400d1.getEditTextHeight());
                    db dbVar2 = taVar.f15389a1;
                    if (dbVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = dbVar2.getContentHeight() - org.telegram.messenger.g0.L(5.0f);
                    }
                    m9Var2.setTranslationY(i17 - contentHeight);
                }
                gc gcVar2 = gc.f35481w;
                if (gcVar2 != null && gcVar2.f35482a == 2) {
                    gcVar2.l();
                }
                if (taVar.f15400d1.f14982p0 && (m9Var = taVar.f15403e1) != null) {
                    m9Var.c(false, true);
                    return;
                }
                return;
            case 14:
                o8 o8Var = (o8) obj;
                d7 d7Var4 = taVar.L1;
                if (d7Var4 != null) {
                    d7Var4.E0 = o8Var;
                }
                ArrayList arrayList3 = taVar.I1;
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
                d7 d7Var5 = taVar.L1;
                if (d7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    d7Var5.f14406v0 = inputPeer;
                    ArrayList arrayList4 = taVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i11 < size2) {
                            Object obj3 = arrayList4.get(i11);
                            i11++;
                            ((d7) obj3).f14406v0 = taVar.L1.f14406v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                d7 d7Var6 = taVar.L1;
                if (d7Var6 != null) {
                    d7Var6.f14408w0 = hashSet;
                    ArrayList arrayList5 = taVar.I1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i11 < size3) {
                            Object obj4 = arrayList5.get(i11);
                            i11++;
                            ((d7) obj4).f14408w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                d7 d7Var7 = taVar.L1;
                if (d7Var7 != null) {
                    Bitmap bitmap3 = d7Var7.f14379g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    taVar.L1.f14379g0 = bitmap2;
                    q8 q8Var2 = taVar.f15441r0;
                    if (q8Var2 != null) {
                        q8Var2.U0(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                taVar.f15469z0 = (o8) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                w6 w6Var2 = taVar.f15434p0;
                taVar.f15466y0 = inputPeer2;
                w6Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                w6 w6Var3 = taVar.f15434p0;
                taVar.f15466y0 = inputPeer3;
                w6Var3.set(inputPeer3);
                return;
            default:
                n2 n2Var2 = taVar.f15444s;
                float floatValue = ((Float) obj).floatValue();
                n2Var2.f15061o = floatValue;
                n2Var2.f15060n = n2.f(floatValue);
                n2Var2.g();
                return;
        }
    }
}
