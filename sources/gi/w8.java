package gi;

import android.graphics.Bitmap;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
public final class w8 implements u10 {
    public final int f13805a;
    public final va f13806b;

    public w8(va vaVar, int i3) {
        this.f13805a = i3;
        this.f13806b = vaVar;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        String str;
        fb fbVar;
        boolean z11;
        boolean z12;
        boolean z13;
        int i3;
        o9 o9Var;
        int contentHeight;
        float L;
        int i10 = this.f13805a;
        float f10 = 1.0f;
        float f11 = 0.0f;
        a6 a6Var = null;
        int i11 = 0;
        va vaVar = this.f13806b;
        switch (i10) {
            case 0:
                n2 n2Var = vaVar.f13755s;
                n2Var.f13293p = ((Float) obj).floatValue();
                n2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                f7 f7Var = vaVar.L1;
                if (f7Var != null) {
                    org.telegram.messenger.g0.z2(f7Var.f12719g0);
                    vaVar.L1.f12719g0 = bitmap;
                    t8 t8Var = vaVar.f13752r0;
                    if (t8Var != null) {
                        t8Var.T0(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                f7 f7Var2 = (f7) obj;
                vaVar.V(f7Var2, false);
                int i12 = vaVar.f13706c;
                ei.z6 P1 = hp.s1(i12).P1();
                a0.h hVar = P1.f11277e;
                int i13 = P1.f11274a;
                ArrayList arrayList = P1.h;
                ArrayList arrayList2 = P1.f11279g;
                ei.y6 y6Var = new ei.y6(P1, f7Var2);
                boolean z14 = f7Var2.f12718g;
                long j10 = y6Var.K;
                if (z14) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(f7Var2.f12716f), y6Var);
                } else {
                    P1.d(j10, y6Var, P1.f11275b, false);
                }
                P1.d(j10, y6Var, P1.f11276c, true);
                if (j10 != h10.i(i13).f22848n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList2.size()) {
                            if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i14)).peer) == j10) {
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
                                if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i15)).peer) == j10) {
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
                        tL_peerStories.peer = hp.s1(i13).z1(j10);
                        P1.e0(j10, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        P1.R(j10);
                    }
                }
                y6Var.d();
                hs.f(i13).k(324, new Object[0]);
                if (f7Var2.f12708c && !f7Var2.f12718g) {
                    hp.s1(i12).P1().f11293w.b(f7Var2);
                }
                if (f7Var2.f12715e1 != 0) {
                    ConnectionsManager.getInstance(f7Var2.f12702a).cancelRequest(f7Var2.f12715e1, true);
                    return;
                }
                return;
            case 3:
                a6 a6Var2 = (a6) obj;
                if (vaVar.D0 != null) {
                    r6 r6Var = vaVar.E0;
                    if (a6Var2 == null) {
                        str = null;
                    } else {
                        str = a6Var2.f12390a;
                    }
                    r6Var.setLink(str);
                    ia iaVar = vaVar.B0;
                    if (iaVar != null) {
                        b6 b6Var = iaVar.f12621c;
                        if (vaVar.E0.E) {
                            a6Var = vaVar.D0.d;
                        }
                        b6Var.a(a6Var);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                f7 f7Var3 = vaVar.L1;
                if (f7Var3 != null) {
                    f7Var3.I0 = num.intValue();
                    hp.e1().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                ei.b bVar = vaVar.f13698a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.va vaVar2 = new org.telegram.ui.Components.wa(vaVar.f13702b, new ai.y(2)).f39976a;
                WindowManager.LayoutParams layout = vaVar2.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = vaVar.f13751r.getWidth();
                    layout.y = (int) (vaVar.f13751r.getY() + org.telegram.messenger.g0.L(56.0f));
                    org.telegram.ui.Components.wa waVar = vaVar2.f39056a;
                    waVar.getWindow().setAttributes(waVar.f39977b);
                }
                vaVar2.setTouchable(true);
                new fc(vaVar2, bVar).G(2131624020, 3, org.telegram.messenger.g0.S2(bd.G(intValue, "StoryPeriodPremium", new Object[0]), org.telegram.ui.ActionBar.k6.Uc, 0, new v8(vaVar, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (fbVar = vaVar.f13700a1) != null && fbVar.Q) {
                    fbVar.Q = false;
                    if (fbVar.F && fbVar.h == null) {
                        fbVar.H = true;
                        za zaVar = fbVar.f12758a;
                        if (zaVar != null) {
                            zaVar.M(true);
                        }
                    }
                }
                vaVar.Y0.x(2, bool.booleanValue());
                vaVar.Z0.clearAnimation();
                ViewPropertyAnimator animate = vaVar.Z0.animate();
                if (bool.booleanValue()) {
                    f10 = 0.0f;
                }
                org.telegram.messenger.camera.q.k(animate, f10, 120L);
                ac acVar = ac.f31784w;
                if (acVar != null && acVar.f31785a == 2) {
                    acVar.l();
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
                ia iaVar2 = vaVar.B0;
                vaVar.A0 = tVar;
                iaVar2.o(tVar);
                vaVar.J0.setSelected(tVar);
                y9 y9Var = vaVar.C0;
                if (y9Var != null) {
                    y9Var.recordHevc = !vaVar.B0.j();
                }
                vaVar.H0.setDrawable(new u(tVar, false));
                vaVar.b0(vaVar.I0, vaVar.J0.f13878e, true);
                h6 h6Var = vaVar.P0;
                if (vaVar.B0.j()) {
                    f11 = vaVar.B0.getFilledProgress();
                }
                h6Var.e(true, f11);
                g3 g3Var = vaVar.N0;
                if (g3Var != null) {
                    g3Var.setMultipleOnClick(vaVar.B0.j());
                    vaVar.N0.setMaxCount(Math.min(10, t.b() - vaVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                vaVar.P = true;
                vaVar.p(true);
                org.telegram.messenger.g0.i3(new k9((u10) obj, 0), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                if (!vaVar.Q1 && !vaVar.R1) {
                    int intValue2 = num2.intValue();
                    vaVar.P1 = intValue2;
                    y6 y6Var2 = vaVar.f13745p0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    y6Var2.a(z11, true);
                    if (vaVar.P1 == 1 && !vaVar.J0.f13878e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    vaVar.h0(z12, true);
                    vaVar.R0.a(num2.intValue());
                    h6 h6Var2 = vaVar.P0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    h6Var2.f12902o0 = -1.0f;
                    h6Var2.f12903p0 = z13;
                    h6Var2.invalidate();
                    if (num2.intValue() == -1) {
                        y9 y9Var2 = vaVar.C0;
                        if (y9Var2 != null && y9Var2.isDual()) {
                            vaVar.C0.toggleDual();
                        }
                        l3 l3Var = vaVar.m1;
                        if (l3Var != null) {
                            l3Var.f(true);
                        }
                        l3 l3Var2 = vaVar.f13740n1;
                        if (l3Var2 != null) {
                            l3Var2.f(true);
                        }
                        l3 l3Var3 = vaVar.X0;
                        if (l3Var3 != null) {
                            l3Var3.f(true);
                        }
                        vaVar.B0.o(null);
                        vaVar.B0.c();
                        vaVar.J0.setSelected((t) null);
                        y9 y9Var3 = vaVar.C0;
                        if (y9Var3 != null) {
                            y9Var3.recordHevc = !vaVar.B0.j();
                        }
                    }
                    vaVar.J0.a(false, true);
                    vaVar.l0(true);
                    return;
                }
                return;
            case 11:
                Float f12 = (Float) obj;
                h6 h6Var3 = vaVar.P0;
                h6Var3.f12902o0 = f12.floatValue();
                h6Var3.invalidate();
                h6 h6Var4 = vaVar.P0;
                int i16 = 8;
                if (f12.floatValue() <= -1.0f) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                h6Var4.setVisibility(i3);
                vaVar.P0.setAlpha(Utilities.l(f12.floatValue() + 1.0f));
                d dVar = vaVar.Q0;
                if (f12.floatValue() < 0.0f) {
                    i16 = 0;
                }
                dVar.setVisibility(i16);
                vaVar.Q0.setAlpha(org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f));
                vaVar.Q0.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f)));
                vaVar.Q0.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f)));
                vaVar.Q0.setTranslationY(org.telegram.messenger.g0.W1(org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f), org.telegram.messenger.g0.L(12.0f), 0));
                if (f12.floatValue() < 0.0f) {
                    vaVar.e(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                if (vaVar.L1 != null) {
                    la laVar = vaVar.f13710d1;
                    if (!laVar.O1) {
                        laVar.clearFocus();
                        if (num3.intValue() == 5) {
                            vaVar.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            vaVar.k0(0, false, true);
                            x9 x9Var = vaVar.f13770w1;
                            if (x9Var != null) {
                                x9Var.f13235w0 = false;
                                x9Var.O0(0);
                                x9Var.A0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            vaVar.k0(0, false, true);
                            x9 x9Var2 = vaVar.f13770w1;
                            if (x9Var2 != null) {
                                x9Var2.O0(2);
                                x9Var2.V1 = true;
                                x9Var2.l0(true);
                                vaVar.f13770w1.f13235w0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            vaVar.t();
                            vaVar.G();
                            x9 x9Var3 = vaVar.f13770w1;
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
                FrameLayout frameLayout = vaVar.Z0;
                if (frameLayout != null) {
                    if (vaVar.f13723h0 == 2) {
                        L = org.telegram.messenger.g0.L(68.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + vaVar.f13710d1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(L);
                }
                o9 o9Var2 = vaVar.f13714e1;
                if (o9Var2 != null) {
                    int i17 = -(org.telegram.messenger.g0.L(24.0f) + vaVar.f13710d1.getEditTextHeight());
                    fb fbVar2 = vaVar.f13700a1;
                    if (fbVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = fbVar2.getContentHeight() - org.telegram.messenger.g0.L(5.0f);
                    }
                    o9Var2.setTranslationY(i17 - contentHeight);
                }
                ac acVar2 = ac.f31784w;
                if (acVar2 != null && acVar2.f31785a == 2) {
                    acVar2.l();
                }
                if (vaVar.f13710d1.f13155p0 && (o9Var = vaVar.f13714e1) != null) {
                    o9Var.c(false, true);
                    return;
                }
                return;
            case 14:
                r8 r8Var = (r8) obj;
                f7 f7Var4 = vaVar.L1;
                if (f7Var4 != null) {
                    f7Var4.E0 = r8Var;
                }
                ArrayList arrayList3 = vaVar.I1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        ((f7) obj2).E0 = r8Var;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                f7 f7Var5 = vaVar.L1;
                if (f7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    f7Var5.f12746v0 = inputPeer;
                    ArrayList arrayList4 = vaVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i11 < size2) {
                            Object obj3 = arrayList4.get(i11);
                            i11++;
                            ((f7) obj3).f12746v0 = vaVar.L1.f12746v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                f7 f7Var6 = vaVar.L1;
                if (f7Var6 != null) {
                    f7Var6.f12748w0 = hashSet;
                    ArrayList arrayList5 = vaVar.I1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i11 < size3) {
                            Object obj4 = arrayList5.get(i11);
                            i11++;
                            ((f7) obj4).f12748w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                f7 f7Var7 = vaVar.L1;
                if (f7Var7 != null) {
                    Bitmap bitmap3 = f7Var7.f12719g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    vaVar.L1.f12719g0 = bitmap2;
                    t8 t8Var2 = vaVar.f13752r0;
                    if (t8Var2 != null) {
                        t8Var2.T0(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                vaVar.f13780z0 = (r8) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                y6 y6Var3 = vaVar.f13745p0;
                vaVar.f13777y0 = inputPeer2;
                y6Var3.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                y6 y6Var4 = vaVar.f13745p0;
                vaVar.f13777y0 = inputPeer3;
                y6Var4.set(inputPeer3);
                return;
            default:
                n2 n2Var2 = vaVar.f13755s;
                float floatValue = ((Float) obj).floatValue();
                n2Var2.f13292o = floatValue;
                n2Var2.f13291n = n2.f(floatValue);
                n2Var2.g();
                return;
        }
    }
}
