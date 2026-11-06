package fi;

import android.graphics.Bitmap;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
public final class v8 implements c20 {
    public final int f12930a;
    public final va f12931b;

    public v8(va vaVar, int i7) {
        this.f12930a = i7;
        this.f12931b = vaVar;
    }

    @Override
    public final void a(Object obj) {
        boolean z9;
        String str;
        fb fbVar;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        o9 o9Var;
        int contentHeight;
        float L;
        int i10 = this.f12930a;
        float f10 = 1.0f;
        float f11 = 0.0f;
        a6 a6Var = null;
        int i11 = 0;
        va vaVar = this.f12931b;
        switch (i10) {
            case 0:
                p2 p2Var = vaVar.f12991s;
                p2Var.f12587p = ((Float) obj).floatValue();
                p2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                e7 e7Var = vaVar.K1;
                if (e7Var != null) {
                    org.telegram.messenger.g0.z2(e7Var.f11893g0);
                    vaVar.K1.f11893g0 = bitmap;
                    s8 s8Var = vaVar.f12984q0;
                    if (s8Var != null) {
                        s8Var.T0(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                e7 e7Var2 = (e7) obj;
                vaVar.V(e7Var2, false);
                int i12 = vaVar.f12942c;
                di.y6 P1 = qp.s1(i12).P1();
                a0.h hVar = P1.f9966e;
                int i13 = P1.f9963a;
                ArrayList arrayList = P1.h;
                ArrayList arrayList2 = P1.f9968g;
                di.x6 x6Var = new di.x6(P1, e7Var2);
                boolean z13 = e7Var2.f11892g;
                long j3 = x6Var.J;
                if (z13) {
                    HashMap hashMap = (HashMap) hVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(e7Var2.f11890f), x6Var);
                } else {
                    P1.d(j3, x6Var, P1.f9964b, false);
                }
                P1.d(j3, x6Var, P1.f9965c, true);
                if (j3 != p10.i(i13).f24478n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList2.size()) {
                            if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i14)).peer) == j3) {
                                arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i14));
                                z9 = true;
                            } else {
                                i14++;
                            }
                        } else {
                            z9 = false;
                        }
                    }
                    if (!z9) {
                        int i15 = 0;
                        while (true) {
                            if (i15 < arrayList.size()) {
                                if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i15)).peer) == j3) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i15));
                                    z9 = true;
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                    if (!z9) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = qp.s1(i13).z1(j3);
                        P1.e0(j3, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        P1.R(j3);
                    }
                }
                x6Var.d();
                qs.f(i13).k(324, new Object[0]);
                if (e7Var2.f11882c && !e7Var2.f11892g) {
                    qp.s1(i12).P1().f9982w.b(e7Var2);
                }
                if (e7Var2.f11889e1 != 0) {
                    ConnectionsManager.getInstance(e7Var2.f11876a).cancelRequest(e7Var2.f11889e1, true);
                    return;
                }
                return;
            case 3:
                a6 a6Var2 = (a6) obj;
                if (vaVar.C0 != null) {
                    q6 q6Var = vaVar.D0;
                    if (a6Var2 == null) {
                        str = null;
                    } else {
                        str = a6Var2.f11606a;
                    }
                    q6Var.setLink(str);
                    ia iaVar = vaVar.A0;
                    if (iaVar != null) {
                        b6 b6Var = iaVar.f11826c;
                        if (vaVar.D0.D) {
                            a6Var = vaVar.C0.d;
                        }
                        b6Var.a(a6Var);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                e7 e7Var3 = vaVar.K1;
                if (e7Var3 != null) {
                    e7Var3.I0 = num.intValue();
                    qp.e1().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                di.b bVar = vaVar.f12934a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.wa waVar = new org.telegram.ui.Components.xa(vaVar.f12938b, new r7(1)).f40219a;
                WindowManager.LayoutParams layout = waVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = vaVar.f12987r.getWidth();
                    layout.y = (int) (vaVar.f12987r.getY() + org.telegram.messenger.g0.L(56.0f));
                    org.telegram.ui.Components.xa xaVar = waVar.f39938a;
                    xaVar.getWindow().setAttributes(xaVar.f40220b);
                }
                waVar.setTouchable(true);
                new hc(waVar, bVar).G(2131624020, 3, org.telegram.messenger.g0.S2(hd.G(intValue, "StoryPeriodPremium", new Object[0]), org.telegram.ui.ActionBar.k6.Uc, 0, new u8(vaVar, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (fbVar = vaVar.Z0) != null && fbVar.P) {
                    fbVar.P = false;
                    if (fbVar.E && fbVar.h == null) {
                        fbVar.G = true;
                        za zaVar = fbVar.f11993a;
                        if (zaVar != null) {
                            zaVar.K(true);
                        }
                    }
                }
                vaVar.X0.x(2, bool.booleanValue());
                vaVar.Y0.clearAnimation();
                ViewPropertyAnimator animate = vaVar.Y0.animate();
                if (bool.booleanValue()) {
                    f10 = 0.0f;
                }
                org.telegram.messenger.camera.q.k(animate, f10, 120L);
                cc ccVar = cc.f32515w;
                if (ccVar != null && ccVar.f32516a == 2) {
                    ccVar.l();
                    return;
                }
                return;
            case 7:
                vaVar.k();
                vaVar.l();
                vaVar.h((Runnable) obj);
                return;
            case 8:
                t tVar = (t) obj;
                ia iaVar2 = vaVar.A0;
                vaVar.f13016z0 = tVar;
                iaVar2.o(tVar);
                vaVar.I0.setSelected(tVar);
                y9 y9Var = vaVar.B0;
                if (y9Var != null) {
                    y9Var.recordHevc = !vaVar.A0.j();
                }
                vaVar.G0.setDrawable(new u(tVar, false));
                vaVar.b0(vaVar.H0, vaVar.I0.f13108e, true);
                g6 g6Var = vaVar.O0;
                if (vaVar.A0.j()) {
                    f11 = vaVar.A0.getFilledProgress();
                }
                g6Var.e(true, f11);
                i3 i3Var = vaVar.M0;
                if (i3Var != null) {
                    i3Var.setMultipleOnClick(vaVar.A0.j());
                    vaVar.M0.setMaxCount(Math.min(10, t.b() - vaVar.A0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                vaVar.O = true;
                vaVar.p(true);
                org.telegram.messenger.g0.i3(new k9((c20) obj, 0), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                if (!vaVar.P1 && !vaVar.Q1) {
                    int intValue2 = num2.intValue();
                    vaVar.O1 = intValue2;
                    x6 x6Var2 = vaVar.f12978o0;
                    if (intValue2 == -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x6Var2.a(z10, true);
                    if (vaVar.O1 == 1 && !vaVar.I0.f13108e) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    vaVar.h0(z11, true);
                    vaVar.Q0.a(num2.intValue());
                    g6 g6Var2 = vaVar.O0;
                    if (num2.intValue() == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    g6Var2.f12089n0 = -1.0f;
                    g6Var2.f12090o0 = z12;
                    g6Var2.invalidate();
                    if (num2.intValue() == -1) {
                        y9 y9Var2 = vaVar.B0;
                        if (y9Var2 != null && y9Var2.isDual()) {
                            vaVar.B0.toggleDual();
                        }
                        m3 m3Var = vaVar.l1;
                        if (m3Var != null) {
                            m3Var.f(true);
                        }
                        m3 m3Var2 = vaVar.f12973m1;
                        if (m3Var2 != null) {
                            m3Var2.f(true);
                        }
                        m3 m3Var3 = vaVar.W0;
                        if (m3Var3 != null) {
                            m3Var3.f(true);
                        }
                        vaVar.A0.o(null);
                        vaVar.A0.c();
                        vaVar.I0.setSelected((t) null);
                        y9 y9Var3 = vaVar.B0;
                        if (y9Var3 != null) {
                            y9Var3.recordHevc = !vaVar.A0.j();
                        }
                    }
                    vaVar.I0.a(false, true);
                    vaVar.l0(true);
                    return;
                }
                return;
            case 11:
                Float f12 = (Float) obj;
                g6 g6Var3 = vaVar.O0;
                g6Var3.f12089n0 = f12.floatValue();
                g6Var3.invalidate();
                g6 g6Var4 = vaVar.O0;
                int i16 = 8;
                if (f12.floatValue() <= -1.0f) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                g6Var4.setVisibility(i7);
                vaVar.O0.setAlpha(Utilities.l(f12.floatValue() + 1.0f));
                d dVar = vaVar.P0;
                if (f12.floatValue() < 0.0f) {
                    i16 = 0;
                }
                dVar.setVisibility(i16);
                vaVar.P0.setAlpha(org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f));
                vaVar.P0.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f)));
                vaVar.P0.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f)));
                vaVar.P0.setTranslationY(org.telegram.messenger.g0.W1(org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f), org.telegram.messenger.g0.L(12.0f), 0));
                if (f12.floatValue() < 0.0f) {
                    vaVar.e(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                if (vaVar.K1 != null) {
                    la laVar = vaVar.f12944c1;
                    if (!laVar.N1) {
                        laVar.clearFocus();
                        if (num3.intValue() == 5) {
                            vaVar.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            vaVar.k0(0, false, true);
                            x9 x9Var = vaVar.f13002v1;
                            if (x9Var != null) {
                                x9Var.f12551v0 = false;
                                x9Var.O0(0);
                                x9Var.A0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            vaVar.k0(0, false, true);
                            x9 x9Var2 = vaVar.f13002v1;
                            if (x9Var2 != null) {
                                x9Var2.O0(2);
                                x9Var2.U1 = true;
                                x9Var2.l0(true);
                                vaVar.f13002v1.f12551v0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            vaVar.t();
                            vaVar.G();
                            x9 x9Var3 = vaVar.f13002v1;
                            if (x9Var3 != null) {
                                x9Var3.O0(1);
                                x9Var3.x0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            vaVar.k0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            vaVar.k0(3, false, true);
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
                FrameLayout frameLayout = vaVar.Y0;
                if (frameLayout != null) {
                    if (vaVar.f12956g0 == 2) {
                        L = org.telegram.messenger.g0.L(68.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + vaVar.f12944c1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(L);
                }
                o9 o9Var2 = vaVar.f12947d1;
                if (o9Var2 != null) {
                    int i17 = -(org.telegram.messenger.g0.L(24.0f) + vaVar.f12944c1.getEditTextHeight());
                    fb fbVar2 = vaVar.Z0;
                    if (fbVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = fbVar2.getContentHeight() - org.telegram.messenger.g0.L(5.0f);
                    }
                    o9Var2.setTranslationY(i17 - contentHeight);
                }
                cc ccVar2 = cc.f32515w;
                if (ccVar2 != null && ccVar2.f32516a == 2) {
                    ccVar2.l();
                }
                if (vaVar.f12944c1.f12375o0 && (o9Var = vaVar.f12947d1) != null) {
                    o9Var.c(false, true);
                    return;
                }
                return;
            case 14:
                q8 q8Var = (q8) obj;
                e7 e7Var4 = vaVar.K1;
                if (e7Var4 != null) {
                    e7Var4.E0 = q8Var;
                }
                ArrayList arrayList3 = vaVar.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        ((e7) obj2).E0 = q8Var;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                e7 e7Var5 = vaVar.K1;
                if (e7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    e7Var5.f11920v0 = inputPeer;
                    ArrayList arrayList4 = vaVar.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i11 < size2) {
                            Object obj3 = arrayList4.get(i11);
                            i11++;
                            ((e7) obj3).f11920v0 = vaVar.K1.f11920v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                e7 e7Var6 = vaVar.K1;
                if (e7Var6 != null) {
                    e7Var6.f11922w0 = hashSet;
                    ArrayList arrayList5 = vaVar.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i11 < size3) {
                            Object obj4 = arrayList5.get(i11);
                            i11++;
                            ((e7) obj4).f11922w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                e7 e7Var7 = vaVar.K1;
                if (e7Var7 != null) {
                    Bitmap bitmap3 = e7Var7.f11893g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    vaVar.K1.f11893g0 = bitmap2;
                    s8 s8Var2 = vaVar.f12984q0;
                    if (s8Var2 != null) {
                        s8Var2.T0(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                vaVar.f13013y0 = (q8) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                x6 x6Var3 = vaVar.f12978o0;
                vaVar.f13009x0 = inputPeer2;
                x6Var3.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                x6 x6Var4 = vaVar.f12978o0;
                vaVar.f13009x0 = inputPeer3;
                x6Var4.set(inputPeer3);
                return;
            default:
                p2 p2Var2 = vaVar.f12991s;
                float floatValue = ((Float) obj).floatValue();
                p2Var2.f12586o = floatValue;
                p2Var2.f12585n = p2.f(floatValue);
                p2Var2.g();
                return;
        }
    }
}
