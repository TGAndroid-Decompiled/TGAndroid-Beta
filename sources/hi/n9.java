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
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class n9 implements w10 {
    public final int f15050a;
    public final nb f15051b;

    public n9(nb nbVar, int i7) {
        this.f15050a = i7;
        this.f15051b = nbVar;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        String str;
        xb xbVar;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        ga gaVar;
        int contentHeight;
        float L;
        int i10 = this.f15050a;
        h6 h6Var = null;
        float f10 = 1.0f;
        float f11 = 0.0f;
        int i11 = 0;
        nb nbVar = this.f15051b;
        switch (i10) {
            case 0:
                w2 w2Var = nbVar.f15111s;
                w2Var.f15666p = ((Float) obj).floatValue();
                w2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                x7 x7Var = nbVar.L1;
                if (x7Var != null) {
                    org.telegram.messenger.g0.z2(x7Var.f15750g0);
                    nbVar.L1.f15750g0 = bitmap;
                    k9 k9Var = nbVar.f15108r0;
                    if (k9Var != null) {
                        k9Var.U0(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                x7 x7Var2 = (x7) obj;
                nbVar.V(x7Var2, false);
                int i12 = nbVar.f15062c;
                fi.p6 R1 = mp.u1(i12).R1();
                a0.h hVar = R1.f12390e;
                int i13 = R1.f12387a;
                ArrayList arrayList = R1.h;
                ArrayList arrayList2 = R1.f12392g;
                fi.o6 o6Var = new fi.o6(R1, x7Var2);
                boolean z14 = x7Var2.f15749g;
                long j3 = o6Var.K;
                if (z14) {
                    HashMap hashMap = (HashMap) hVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(x7Var2.f15747f), o6Var);
                } else {
                    R1.d(j3, o6Var, R1.f12388b, false);
                }
                R1.d(j3, o6Var, R1.f12389c, true);
                if (j3 != i10.i(i13).f24656n) {
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
                if (x7Var2.f15739c && !x7Var2.f15749g) {
                    mp.u1(i12).R1().f12406w.b(x7Var2);
                }
                if (x7Var2.f15746e1 != 0) {
                    ConnectionsManager.getInstance(x7Var2.f15733a).cancelRequest(x7Var2.f15746e1, true);
                    return;
                }
                return;
            case 3:
                h6 h6Var2 = (h6) obj;
                if (nbVar.D0 != null) {
                    x6 x6Var = nbVar.E0;
                    if (h6Var2 == null) {
                        str = null;
                    } else {
                        str = h6Var2.f14583a;
                    }
                    x6Var.setLink(str);
                    ab abVar = nbVar.B0;
                    if (abVar != null) {
                        i6 i6Var = abVar.f14968c;
                        if (nbVar.E0.E) {
                            h6Var = nbVar.D0.d;
                        }
                        i6Var.a(h6Var);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                x7 x7Var3 = nbVar.L1;
                if (x7Var3 != null) {
                    x7Var3.I0 = num.intValue();
                    mp.g1().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                fi.b bVar = nbVar.f15054a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.ab abVar2 = new org.telegram.ui.Components.bb(nbVar.f15058b, new bi.t(2)).f33724a;
                WindowManager.LayoutParams layout = abVar2.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = nbVar.f15107r.getWidth();
                    layout.y = (int) (nbVar.f15107r.getY() + org.telegram.messenger.g0.L(56.0f));
                    org.telegram.ui.Components.bb bbVar = abVar2.f33452a;
                    bbVar.getWindow().setAttributes(bbVar.f33725b);
                }
                abVar2.setTouchable(true);
                new org.telegram.ui.Components.kc(abVar2, bVar).G(2131624021, 3, org.telegram.messenger.g0.R2(gd.G(intValue, "StoryPeriodPremium", new Object[0]), org.telegram.ui.ActionBar.n6.Xc, 0, new m9(nbVar, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (xbVar = nbVar.f15056a1) != null && xbVar.Q) {
                    xbVar.Q = false;
                    if (xbVar.F && xbVar.h == null) {
                        xbVar.H = true;
                        rb rbVar = xbVar.f15792a;
                        if (rbVar != null) {
                            rbVar.X(true);
                        }
                    }
                }
                nbVar.Y0.x(2, bool.booleanValue());
                nbVar.Z0.clearAnimation();
                ViewPropertyAnimator animate = nbVar.Z0.animate();
                if (bool.booleanValue()) {
                    f10 = 0.0f;
                }
                m10.n(animate, f10, 120L);
                org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.f35083w;
                if (fcVar != null && fcVar.f35084a == 2) {
                    fcVar.l();
                    return;
                }
                return;
            case 7:
                nbVar.k();
                nbVar.l();
                nbVar.h((Runnable) obj);
                return;
            case 8:
                c0 c0Var = (c0) obj;
                ab abVar3 = nbVar.B0;
                nbVar.A0 = c0Var;
                abVar3.o(c0Var);
                nbVar.J0.setSelected(c0Var);
                qa qaVar = nbVar.C0;
                if (qaVar != null) {
                    qaVar.recordHevc = !nbVar.B0.j();
                }
                nbVar.H0.setDrawable(new d0(c0Var, false));
                nbVar.b0(nbVar.I0, nbVar.J0.f14570e, true);
                n6 n6Var = nbVar.P0;
                if (nbVar.B0.j()) {
                    f11 = nbVar.B0.getFilledProgress();
                }
                n6Var.e(true, f11);
                p3 p3Var = nbVar.N0;
                if (p3Var != null) {
                    p3Var.setMultipleOnClick(nbVar.B0.j());
                    nbVar.N0.setMaxCount(Math.min(10, c0.b() - nbVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                nbVar.P = true;
                nbVar.p(true);
                org.telegram.messenger.g0.h3(new ca((w10) obj, 0), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                if (!nbVar.Q1 && !nbVar.R1) {
                    int intValue2 = num2.intValue();
                    nbVar.P1 = intValue2;
                    f7 f7Var = nbVar.f15101p0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f7Var.a(z11, true);
                    if (nbVar.P1 == 1 && !nbVar.J0.f14570e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    nbVar.h0(z12, true);
                    nbVar.R0.a(num2.intValue());
                    n6 n6Var2 = nbVar.P0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    n6Var2.f15032o0 = -1.0f;
                    n6Var2.f15033p0 = z13;
                    n6Var2.invalidate();
                    if (num2.intValue() == -1) {
                        qa qaVar2 = nbVar.C0;
                        if (qaVar2 != null && qaVar2.isDual()) {
                            nbVar.C0.toggleDual();
                        }
                        u3 u3Var = nbVar.f15093m1;
                        if (u3Var != null) {
                            u3Var.f(true);
                        }
                        u3 u3Var2 = nbVar.n1;
                        if (u3Var2 != null) {
                            u3Var2.f(true);
                        }
                        u3 u3Var3 = nbVar.X0;
                        if (u3Var3 != null) {
                            u3Var3.f(true);
                        }
                        nbVar.B0.o(null);
                        nbVar.B0.c();
                        nbVar.J0.setSelected((c0) null);
                        qa qaVar3 = nbVar.C0;
                        if (qaVar3 != null) {
                            qaVar3.recordHevc = !nbVar.B0.j();
                        }
                    }
                    nbVar.J0.a(false, true);
                    nbVar.l0(true);
                    return;
                }
                return;
            case 11:
                Float f12 = (Float) obj;
                n6 n6Var3 = nbVar.P0;
                n6Var3.f15032o0 = f12.floatValue();
                n6Var3.invalidate();
                n6 n6Var4 = nbVar.P0;
                int i16 = 8;
                if (f12.floatValue() <= -1.0f) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                n6Var4.setVisibility(i7);
                nbVar.P0.setAlpha(Utilities.l(f12.floatValue() + 1.0f));
                e eVar = nbVar.Q0;
                if (f12.floatValue() < 0.0f) {
                    i16 = 0;
                }
                eVar.setVisibility(i16);
                nbVar.Q0.setAlpha(org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f));
                nbVar.Q0.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f)));
                nbVar.Q0.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f)));
                nbVar.Q0.setTranslationY(org.telegram.messenger.g0.W1(org.telegram.messenger.g0.z1(f12.floatValue(), 0.0f, -1.0f), org.telegram.messenger.g0.L(12.0f), 0));
                if (f12.floatValue() < 0.0f) {
                    nbVar.e(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                if (nbVar.L1 != null) {
                    db dbVar = nbVar.f15067d1;
                    if (!dbVar.O1) {
                        dbVar.clearFocus();
                        if (num3.intValue() == 5) {
                            nbVar.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            nbVar.k0(0, false, true);
                            pa paVar = nbVar.f15126w1;
                            if (paVar != null) {
                                paVar.f15596w0 = false;
                                paVar.R0(0);
                                paVar.C0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            nbVar.k0(0, false, true);
                            pa paVar2 = nbVar.f15126w1;
                            if (paVar2 != null) {
                                paVar2.R0(2);
                                paVar2.Z1 = true;
                                paVar2.n0(true);
                                nbVar.f15126w1.f15596w0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            nbVar.t();
                            nbVar.G();
                            pa paVar3 = nbVar.f15126w1;
                            if (paVar3 != null) {
                                paVar3.R0(1);
                                paVar3.z0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            nbVar.k0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            nbVar.k0(3, false, true);
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
                FrameLayout frameLayout = nbVar.Z0;
                if (frameLayout != null) {
                    if (nbVar.f15079h0 == 2) {
                        L = org.telegram.messenger.g0.L(68.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + nbVar.f15067d1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(L);
                }
                ga gaVar2 = nbVar.f15070e1;
                if (gaVar2 != null) {
                    int i17 = -(org.telegram.messenger.g0.L(24.0f) + nbVar.f15067d1.getEditTextHeight());
                    xb xbVar2 = nbVar.f15056a1;
                    if (xbVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = xbVar2.getContentHeight() - org.telegram.messenger.g0.L(5.0f);
                    }
                    gaVar2.setTranslationY(i17 - contentHeight);
                }
                org.telegram.ui.Components.fc fcVar2 = org.telegram.ui.Components.fc.f35083w;
                if (fcVar2 != null && fcVar2.f35084a == 2) {
                    fcVar2.l();
                }
                if (nbVar.f15067d1.f14947p0 && (gaVar = nbVar.f15070e1) != null) {
                    gaVar.c(false, true);
                    return;
                }
                return;
            case 14:
                i9 i9Var = (i9) obj;
                x7 x7Var4 = nbVar.L1;
                if (x7Var4 != null) {
                    x7Var4.E0 = i9Var;
                }
                ArrayList arrayList3 = nbVar.I1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        ((x7) obj2).E0 = i9Var;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                x7 x7Var5 = nbVar.L1;
                if (x7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    x7Var5.f15777v0 = inputPeer;
                    ArrayList arrayList4 = nbVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i11 < size2) {
                            Object obj3 = arrayList4.get(i11);
                            i11++;
                            ((x7) obj3).f15777v0 = nbVar.L1.f15777v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                x7 x7Var6 = nbVar.L1;
                if (x7Var6 != null) {
                    x7Var6.f15779w0 = hashSet;
                    ArrayList arrayList5 = nbVar.I1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i11 < size3) {
                            Object obj4 = arrayList5.get(i11);
                            i11++;
                            ((x7) obj4).f15779w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                x7 x7Var7 = nbVar.L1;
                if (x7Var7 != null) {
                    Bitmap bitmap3 = x7Var7.f15750g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    nbVar.L1.f15750g0 = bitmap2;
                    k9 k9Var2 = nbVar.f15108r0;
                    if (k9Var2 != null) {
                        k9Var2.U0(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                nbVar.f15136z0 = (i9) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                f7 f7Var2 = nbVar.f15101p0;
                nbVar.f15133y0 = inputPeer2;
                f7Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                f7 f7Var3 = nbVar.f15101p0;
                nbVar.f15133y0 = inputPeer3;
                f7Var3.set(inputPeer3);
                return;
            default:
                w2 w2Var2 = nbVar.f15111s;
                float floatValue = ((Float) obj).floatValue();
                w2Var2.f15665o = floatValue;
                w2Var2.f15664n = w2.f(floatValue);
                w2Var2.g();
                return;
        }
    }
}
