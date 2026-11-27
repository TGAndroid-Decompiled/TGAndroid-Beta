package defpackage;

import android.graphics.Bitmap;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class dab implements pcc {
    public final byte a;
    public final sbb b;

    public dab(sbb sbbVar, byte b) {
        this.a = b;
        this.b = sbbVar;
    }

    @Override
    public final void a(Object obj) {
        boolean z;
        String str;
        ksb ksbVar;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        oab oabVar;
        int contentHeight;
        float L;
        byte b = this.a;
        float f = 1.0f;
        float f2 = 0.0f;
        my8 my8Var = null;
        int i2 = 0;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                c8b c8bVar = sbbVar.L1;
                if (c8bVar != null) {
                    hl.w2(c8bVar.g0);
                    sbbVar.L1.g0 = bitmap;
                    w9b w9bVar = sbbVar.r0;
                    if (w9bVar != null) {
                        w9bVar.P0(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c8b c8bVar2 = (c8b) obj;
                sbbVar.V(c8bVar2, false);
                int i3 = sbbVar.c;
                c6b O1 = uc7.s1(i3).O1();
                zh6 zh6Var = O1.e;
                int i4 = O1.a;
                ArrayList arrayList = O1.h;
                ArrayList arrayList2 = O1.g;
                b6b b6bVar = new b6b(O1, c8bVar2);
                boolean z5 = c8bVar2.g;
                long j = b6bVar.K;
                if (z5) {
                    HashMap hashMap = (HashMap) zh6Var.f(j);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        zh6Var.k(j, hashMap);
                    }
                    hashMap.put(Integer.valueOf(c8bVar2.f), b6bVar);
                } else {
                    O1.c(j, b6bVar, O1.b, false);
                }
                O1.c(j, b6bVar, O1.c, true);
                if (j != yac.h(i4).n) {
                    int i5 = 0;
                    while (true) {
                        if (i5 < arrayList2.size()) {
                            if (wf3.n(((TL_stories.PeerStories) arrayList2.get(i5)).peer) == j) {
                                arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i5));
                                z = true;
                            } else {
                                i5++;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (!z) {
                        int i6 = 0;
                        while (true) {
                            if (i6 < arrayList.size()) {
                                if (wf3.n(((TL_stories.PeerStories) arrayList.get(i6)).peer) == j) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i6));
                                    z = true;
                                } else {
                                    i6++;
                                }
                            }
                        }
                    }
                    if (!z) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = uc7.s1(i4).y1(j);
                        O1.d0(j, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        O1.Q(j);
                    }
                }
                b6bVar.d();
                jn7.f(i4).k(328, new Object[0]);
                if (c8bVar2.c && !c8bVar2.g) {
                    uc7.s1(i3).O1().w.b(c8bVar2);
                }
                if (c8bVar2.e1 != 0) {
                    ConnectionsManager.getInstance(c8bVar2.a).cancelRequest(c8bVar2.e1, true);
                    return;
                }
                return;
            case 2:
                my8 my8Var2 = (my8) obj;
                if (sbbVar.D0 != null) {
                    du9 du9Var = sbbVar.E0;
                    if (my8Var2 == null) {
                        str = null;
                    } else {
                        str = my8Var2.a;
                    }
                    du9Var.setLink(str);
                    gbb gbbVar = sbbVar.B0;
                    if (gbbVar != null) {
                        ny8 ny8Var = gbbVar.c;
                        if (sbbVar.E0.E) {
                            my8Var = (my8) sbbVar.D0.d;
                        }
                        ny8Var.c(my8Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Integer num = (Integer) obj;
                c8b c8bVar3 = sbbVar.L1;
                if (c8bVar3 != null) {
                    c8bVar3.I0 = num.intValue();
                    uc7.e1().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 4:
                x53 x53Var = sbbVar.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                n11 n11Var = new o11(sbbVar.b, new py((byte) 14)).a;
                WindowManager.LayoutParams layout = n11Var.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = sbbVar.r.getWidth();
                    layout.y = (int) (sbbVar.r.getY() + hl.L(56.0f));
                    o11 o11Var = n11Var.a;
                    o11Var.getWindow().setAttributes(o11Var.b);
                }
                n11Var.setTouchable(true);
                new d31(n11Var, x53Var).G(2131624021, 3, hl.N2(ob6.G(intValue, "StoryPeriodPremium", new Object[0]), aob.Xc, 0, new bab(sbbVar, (byte) 26), x53Var)).k(true);
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (ksbVar = sbbVar.a1) != null && ksbVar.Q) {
                    ksbVar.Q = false;
                    if (ksbVar.F && ksbVar.h == null) {
                        ksbVar.H = true;
                        esb esbVar = ksbVar.a;
                        if (esbVar != null) {
                            esbVar.e1(true);
                        }
                    }
                }
                sbbVar.Y0.x(2, bool.booleanValue());
                sbbVar.Z0.clearAnimation();
                ViewPropertyAnimator animate = sbbVar.Z0.animate();
                if (bool.booleanValue()) {
                    f = 0.0f;
                }
                ik8.s(animate, f, 120L);
                v21 v21Var = v21.x;
                if (v21Var != null && v21Var.a == 2) {
                    v21Var.l();
                    return;
                }
                return;
            case 6:
                sbbVar.i();
                sbbVar.j();
                sbbVar.f((Runnable) obj);
                return;
            case 7:
                al2 al2Var = (al2) obj;
                gbb gbbVar2 = sbbVar.B0;
                sbbVar.A0 = al2Var;
                gbbVar2.o(al2Var);
                sbbVar.J0.setSelected(al2Var);
                xab xabVar = sbbVar.C0;
                if (xabVar != null) {
                    xabVar.recordHevc = !sbbVar.B0.i();
                }
                sbbVar.H0.setDrawable(new bl2(al2Var, false));
                sbbVar.b0(sbbVar.I0, sbbVar.J0.e, true);
                u59 u59Var = sbbVar.P0;
                if (sbbVar.B0.i()) {
                    f2 = sbbVar.B0.getFilledProgress();
                }
                u59Var.e(true, f2);
                zt4 zt4Var = sbbVar.N0;
                if (zt4Var != null) {
                    zt4Var.setMultipleOnClick(sbbVar.B0.i());
                    sbbVar.N0.setMaxCount(Math.min(10, al2.b() - sbbVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                sbbVar.P = true;
                sbbVar.o(true);
                hl.d3(new jn0((pcc) obj, (byte) 14), 210L);
                return;
            case 9:
                Integer num2 = (Integer) obj;
                if (!sbbVar.Q1 && !sbbVar.R1) {
                    int intValue2 = num2.intValue();
                    sbbVar.P1 = intValue2;
                    i2a i2aVar = sbbVar.p0;
                    if (intValue2 == -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    i2aVar.a(z2, true);
                    if (sbbVar.P1 == 1 && !sbbVar.J0.e) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sbbVar.h0(z3, true);
                    sbbVar.R0.a(num2.intValue());
                    u59 u59Var2 = sbbVar.P0;
                    if (num2.intValue() == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    u59Var2.o0 = -1.0f;
                    u59Var2.p0 = z4;
                    u59Var2.invalidate();
                    if (num2.intValue() == -1) {
                        xab xabVar2 = sbbVar.C0;
                        if (xabVar2 != null && xabVar2.isDual()) {
                            sbbVar.C0.toggleDual();
                        }
                        kg5 kg5Var = sbbVar.m1;
                        if (kg5Var != null) {
                            kg5Var.f(true);
                        }
                        kg5 kg5Var2 = sbbVar.n1;
                        if (kg5Var2 != null) {
                            kg5Var2.f(true);
                        }
                        kg5 kg5Var3 = sbbVar.X0;
                        if (kg5Var3 != null) {
                            kg5Var3.f(true);
                        }
                        sbbVar.B0.o(null);
                        sbbVar.B0.b();
                        sbbVar.J0.setSelected((al2) null);
                        xab xabVar3 = sbbVar.C0;
                        if (xabVar3 != null) {
                            xabVar3.recordHevc = !sbbVar.B0.i();
                        }
                    }
                    sbbVar.J0.a(false, true);
                    sbbVar.l0(true);
                    return;
                }
                return;
            case 10:
                Float f3 = (Float) obj;
                u59 u59Var3 = sbbVar.P0;
                u59Var3.o0 = f3.floatValue();
                u59Var3.invalidate();
                u59 u59Var4 = sbbVar.P0;
                int i7 = 8;
                if (f3.floatValue() <= -1.0f) {
                    i = 8;
                } else {
                    i = 0;
                }
                u59Var4.setVisibility(i);
                sbbVar.P0.setAlpha(Utilities.l(f3.floatValue() + 1.0f));
                c51 c51Var = sbbVar.Q0;
                if (f3.floatValue() < 0.0f) {
                    i7 = 0;
                }
                c51Var.setVisibility(i7);
                sbbVar.Q0.setAlpha(hl.x1(f3.floatValue(), 0.0f, -1.0f));
                sbbVar.Q0.setScaleX(hl.R1(0.8f, 1.0f, hl.x1(f3.floatValue(), 0.0f, -1.0f)));
                sbbVar.Q0.setScaleY(hl.R1(0.8f, 1.0f, hl.x1(f3.floatValue(), 0.0f, -1.0f)));
                sbbVar.Q0.setTranslationY(hl.U1(hl.x1(f3.floatValue(), 0.0f, -1.0f), hl.L(12.0f), 0));
                if (f3.floatValue() < 0.0f) {
                    sbbVar.c(false);
                    return;
                }
                return;
            case 11:
                Integer num3 = (Integer) obj;
                if (sbbVar.L1 != null) {
                    ibb ibbVar = sbbVar.d1;
                    if (!ibbVar.O1) {
                        ibbVar.clearFocus();
                        if (num3.intValue() == 5) {
                            sbbVar.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            sbbVar.k0(0, false, true);
                            wab wabVar = sbbVar.w1;
                            if (wabVar != null) {
                                wabVar.w0 = false;
                                wabVar.Q0(0);
                                wabVar.C0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            sbbVar.k0(0, false, true);
                            wab wabVar2 = sbbVar.w1;
                            if (wabVar2 != null) {
                                wabVar2.Q0(2);
                                wabVar2.Z1 = true;
                                wabVar2.l0(true);
                                sbbVar.w1.w0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            sbbVar.s();
                            sbbVar.F();
                            wab wabVar3 = sbbVar.w1;
                            if (wabVar3 != null) {
                                wabVar3.Q0(1);
                                wabVar3.z0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            sbbVar.k0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            sbbVar.k0(3, false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 12:
                Integer num4 = (Integer) obj;
                FrameLayout frameLayout = sbbVar.Z0;
                if (frameLayout != null) {
                    if (sbbVar.h0 == 2) {
                        L = hl.L(68.0f);
                    } else {
                        L = hl.L(64.0f) + (-(hl.L(12.0f) + sbbVar.d1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(L);
                }
                oab oabVar2 = sbbVar.e1;
                if (oabVar2 != null) {
                    int i8 = -(hl.L(24.0f) + sbbVar.d1.getEditTextHeight());
                    ksb ksbVar2 = sbbVar.a1;
                    if (ksbVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = ksbVar2.getContentHeight() - hl.L(5.0f);
                    }
                    oabVar2.setTranslationY(i8 - contentHeight);
                }
                v21 v21Var2 = v21.x;
                if (v21Var2 != null && v21Var2.a == 2) {
                    v21Var2.l();
                }
                if (sbbVar.d1.p0 && (oabVar = sbbVar.e1) != null) {
                    oabVar.c(false, true);
                    return;
                }
                return;
            case 13:
                u9b u9bVar = (u9b) obj;
                c8b c8bVar4 = sbbVar.L1;
                if (c8bVar4 != null) {
                    c8bVar4.E0 = u9bVar;
                }
                ArrayList arrayList3 = sbbVar.I1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i2 < size) {
                        Object obj2 = arrayList3.get(i2);
                        i2++;
                        ((c8b) obj2).E0 = u9bVar;
                    }
                    return;
                }
                return;
            case 14:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                c8b c8bVar5 = sbbVar.L1;
                if (c8bVar5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    c8bVar5.v0 = inputPeer;
                    ArrayList arrayList4 = sbbVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i2 < size2) {
                            Object obj3 = arrayList4.get(i2);
                            i2++;
                            ((c8b) obj3).v0 = sbbVar.L1.v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                HashSet hashSet = (HashSet) obj;
                c8b c8bVar6 = sbbVar.L1;
                if (c8bVar6 != null) {
                    c8bVar6.w0 = hashSet;
                    ArrayList arrayList5 = sbbVar.I1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i2 < size3) {
                            Object obj4 = arrayList5.get(i2);
                            i2++;
                            ((c8b) obj4).w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                Bitmap bitmap2 = (Bitmap) obj;
                c8b c8bVar7 = sbbVar.L1;
                if (c8bVar7 != null) {
                    Bitmap bitmap3 = c8bVar7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    sbbVar.L1.g0 = bitmap2;
                    w9b w9bVar2 = sbbVar.r0;
                    if (w9bVar2 != null) {
                        w9bVar2.P0(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                sbbVar.z0 = (u9b) obj;
                return;
            case 18:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                i2a i2aVar2 = sbbVar.p0;
                sbbVar.y0 = inputPeer2;
                i2aVar2.set(inputPeer2);
                return;
            case 19:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                i2a i2aVar3 = sbbVar.p0;
                sbbVar.y0 = inputPeer3;
                i2aVar3.set(inputPeer3);
                return;
            case 20:
                rk4 rk4Var = sbbVar.s;
                float floatValue = ((Float) obj).floatValue();
                rk4Var.o = floatValue;
                rk4Var.n = rk4.f(floatValue);
                rk4Var.g();
                return;
            default:
                rk4 rk4Var2 = sbbVar.s;
                rk4Var2.p = ((Float) obj).floatValue();
                rk4Var2.i();
                return;
        }
    }
}
