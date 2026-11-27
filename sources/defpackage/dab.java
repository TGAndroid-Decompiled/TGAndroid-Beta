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
    public final rbb b;

    public dab(rbb rbbVar, byte b) {
        this.a = b;
        this.b = rbbVar;
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
        nab nabVar;
        int contentHeight;
        float L;
        byte b = this.a;
        float f = 1.0f;
        float f2 = 0.0f;
        my8 my8Var = null;
        int i2 = 0;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                c8b c8bVar = rbbVar.L1;
                if (c8bVar != null) {
                    hl.w2(c8bVar.g0);
                    rbbVar.L1.g0 = bitmap;
                    w9b w9bVar = rbbVar.r0;
                    if (w9bVar != null) {
                        w9bVar.P0(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c8b c8bVar2 = (c8b) obj;
                rbbVar.V(c8bVar2, false);
                int i3 = rbbVar.c;
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
                if (rbbVar.D0 != null) {
                    du9 du9Var = rbbVar.E0;
                    if (my8Var2 == null) {
                        str = null;
                    } else {
                        str = my8Var2.a;
                    }
                    du9Var.setLink(str);
                    fbb fbbVar = rbbVar.B0;
                    if (fbbVar != null) {
                        ny8 ny8Var = fbbVar.c;
                        if (rbbVar.E0.E) {
                            my8Var = (my8) rbbVar.D0.d;
                        }
                        ny8Var.c(my8Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Integer num = (Integer) obj;
                c8b c8bVar3 = rbbVar.L1;
                if (c8bVar3 != null) {
                    c8bVar3.I0 = num.intValue();
                    uc7.e1().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 4:
                x53 x53Var = rbbVar.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                n11 n11Var = new o11(rbbVar.b, new py((byte) 14)).a;
                WindowManager.LayoutParams layout = n11Var.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = rbbVar.r.getWidth();
                    layout.y = (int) (rbbVar.r.getY() + hl.L(56.0f));
                    o11 o11Var = n11Var.a;
                    o11Var.getWindow().setAttributes(o11Var.b);
                }
                n11Var.setTouchable(true);
                new d31(n11Var, x53Var).G(2131624021, 3, hl.N2(ob6.G(intValue, "StoryPeriodPremium", new Object[0]), aob.Xc, 0, new bab(rbbVar, (byte) 26), x53Var)).k(true);
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (ksbVar = rbbVar.a1) != null && ksbVar.Q) {
                    ksbVar.Q = false;
                    if (ksbVar.F && ksbVar.h == null) {
                        ksbVar.H = true;
                        esb esbVar = ksbVar.a;
                        if (esbVar != null) {
                            esbVar.e1(true);
                        }
                    }
                }
                rbbVar.Y0.x(2, bool.booleanValue());
                rbbVar.Z0.clearAnimation();
                ViewPropertyAnimator animate = rbbVar.Z0.animate();
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
                rbbVar.i();
                rbbVar.j();
                rbbVar.f((Runnable) obj);
                return;
            case 7:
                al2 al2Var = (al2) obj;
                fbb fbbVar2 = rbbVar.B0;
                rbbVar.A0 = al2Var;
                fbbVar2.o(al2Var);
                rbbVar.J0.setSelected(al2Var);
                wab wabVar = rbbVar.C0;
                if (wabVar != null) {
                    wabVar.recordHevc = !rbbVar.B0.i();
                }
                rbbVar.H0.setDrawable(new bl2(al2Var, false));
                rbbVar.b0(rbbVar.I0, rbbVar.J0.e, true);
                u59 u59Var = rbbVar.P0;
                if (rbbVar.B0.i()) {
                    f2 = rbbVar.B0.getFilledProgress();
                }
                u59Var.e(true, f2);
                zt4 zt4Var = rbbVar.N0;
                if (zt4Var != null) {
                    zt4Var.setMultipleOnClick(rbbVar.B0.i());
                    rbbVar.N0.setMaxCount(Math.min(10, al2.b() - rbbVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                rbbVar.P = true;
                rbbVar.o(true);
                hl.d3(new jn0((pcc) obj, (byte) 14), 210L);
                return;
            case 9:
                Integer num2 = (Integer) obj;
                if (!rbbVar.Q1 && !rbbVar.R1) {
                    int intValue2 = num2.intValue();
                    rbbVar.P1 = intValue2;
                    i2a i2aVar = rbbVar.p0;
                    if (intValue2 == -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    i2aVar.a(z2, true);
                    if (rbbVar.P1 == 1 && !rbbVar.J0.e) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    rbbVar.h0(z3, true);
                    rbbVar.R0.a(num2.intValue());
                    u59 u59Var2 = rbbVar.P0;
                    if (num2.intValue() == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    u59Var2.o0 = -1.0f;
                    u59Var2.p0 = z4;
                    u59Var2.invalidate();
                    if (num2.intValue() == -1) {
                        wab wabVar2 = rbbVar.C0;
                        if (wabVar2 != null && wabVar2.isDual()) {
                            rbbVar.C0.toggleDual();
                        }
                        kg5 kg5Var = rbbVar.m1;
                        if (kg5Var != null) {
                            kg5Var.f(true);
                        }
                        kg5 kg5Var2 = rbbVar.n1;
                        if (kg5Var2 != null) {
                            kg5Var2.f(true);
                        }
                        kg5 kg5Var3 = rbbVar.X0;
                        if (kg5Var3 != null) {
                            kg5Var3.f(true);
                        }
                        rbbVar.B0.o(null);
                        rbbVar.B0.b();
                        rbbVar.J0.setSelected((al2) null);
                        wab wabVar3 = rbbVar.C0;
                        if (wabVar3 != null) {
                            wabVar3.recordHevc = !rbbVar.B0.i();
                        }
                    }
                    rbbVar.J0.a(false, true);
                    rbbVar.l0(true);
                    return;
                }
                return;
            case 10:
                Float f3 = (Float) obj;
                u59 u59Var3 = rbbVar.P0;
                u59Var3.o0 = f3.floatValue();
                u59Var3.invalidate();
                u59 u59Var4 = rbbVar.P0;
                int i7 = 8;
                if (f3.floatValue() <= -1.0f) {
                    i = 8;
                } else {
                    i = 0;
                }
                u59Var4.setVisibility(i);
                rbbVar.P0.setAlpha(Utilities.l(f3.floatValue() + 1.0f));
                c51 c51Var = rbbVar.Q0;
                if (f3.floatValue() < 0.0f) {
                    i7 = 0;
                }
                c51Var.setVisibility(i7);
                rbbVar.Q0.setAlpha(hl.x1(f3.floatValue(), 0.0f, -1.0f));
                rbbVar.Q0.setScaleX(hl.R1(0.8f, 1.0f, hl.x1(f3.floatValue(), 0.0f, -1.0f)));
                rbbVar.Q0.setScaleY(hl.R1(0.8f, 1.0f, hl.x1(f3.floatValue(), 0.0f, -1.0f)));
                rbbVar.Q0.setTranslationY(hl.U1(hl.x1(f3.floatValue(), 0.0f, -1.0f), hl.L(12.0f), 0));
                if (f3.floatValue() < 0.0f) {
                    rbbVar.c(false);
                    return;
                }
                return;
            case 11:
                Integer num3 = (Integer) obj;
                if (rbbVar.L1 != null) {
                    hbb hbbVar = rbbVar.d1;
                    if (!hbbVar.O1) {
                        hbbVar.clearFocus();
                        if (num3.intValue() == 5) {
                            rbbVar.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            rbbVar.k0(0, false, true);
                            vab vabVar = rbbVar.w1;
                            if (vabVar != null) {
                                vabVar.w0 = false;
                                vabVar.Q0(0);
                                vabVar.C0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            rbbVar.k0(0, false, true);
                            vab vabVar2 = rbbVar.w1;
                            if (vabVar2 != null) {
                                vabVar2.Q0(2);
                                vabVar2.Z1 = true;
                                vabVar2.l0(true);
                                rbbVar.w1.w0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            rbbVar.s();
                            rbbVar.F();
                            vab vabVar3 = rbbVar.w1;
                            if (vabVar3 != null) {
                                vabVar3.Q0(1);
                                vabVar3.z0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            rbbVar.k0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            rbbVar.k0(3, false, true);
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
                FrameLayout frameLayout = rbbVar.Z0;
                if (frameLayout != null) {
                    if (rbbVar.h0 == 2) {
                        L = hl.L(68.0f);
                    } else {
                        L = hl.L(64.0f) + (-(hl.L(12.0f) + rbbVar.d1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(L);
                }
                nab nabVar2 = rbbVar.e1;
                if (nabVar2 != null) {
                    int i8 = -(hl.L(24.0f) + rbbVar.d1.getEditTextHeight());
                    ksb ksbVar2 = rbbVar.a1;
                    if (ksbVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = ksbVar2.getContentHeight() - hl.L(5.0f);
                    }
                    nabVar2.setTranslationY(i8 - contentHeight);
                }
                v21 v21Var2 = v21.x;
                if (v21Var2 != null && v21Var2.a == 2) {
                    v21Var2.l();
                }
                if (rbbVar.d1.p0 && (nabVar = rbbVar.e1) != null) {
                    nabVar.c(false, true);
                    return;
                }
                return;
            case 13:
                u9b u9bVar = (u9b) obj;
                c8b c8bVar4 = rbbVar.L1;
                if (c8bVar4 != null) {
                    c8bVar4.E0 = u9bVar;
                }
                ArrayList arrayList3 = rbbVar.I1;
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
                c8b c8bVar5 = rbbVar.L1;
                if (c8bVar5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    c8bVar5.v0 = inputPeer;
                    ArrayList arrayList4 = rbbVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i2 < size2) {
                            Object obj3 = arrayList4.get(i2);
                            i2++;
                            ((c8b) obj3).v0 = rbbVar.L1.v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                HashSet hashSet = (HashSet) obj;
                c8b c8bVar6 = rbbVar.L1;
                if (c8bVar6 != null) {
                    c8bVar6.w0 = hashSet;
                    ArrayList arrayList5 = rbbVar.I1;
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
                c8b c8bVar7 = rbbVar.L1;
                if (c8bVar7 != null) {
                    Bitmap bitmap3 = c8bVar7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    rbbVar.L1.g0 = bitmap2;
                    w9b w9bVar2 = rbbVar.r0;
                    if (w9bVar2 != null) {
                        w9bVar2.P0(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                rbbVar.z0 = (u9b) obj;
                return;
            case 18:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                i2a i2aVar2 = rbbVar.p0;
                rbbVar.y0 = inputPeer2;
                i2aVar2.set(inputPeer2);
                return;
            case 19:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                i2a i2aVar3 = rbbVar.p0;
                rbbVar.y0 = inputPeer3;
                i2aVar3.set(inputPeer3);
                return;
            case 20:
                rk4 rk4Var = rbbVar.s;
                float floatValue = ((Float) obj).floatValue();
                rk4Var.o = floatValue;
                rk4Var.n = rk4.f(floatValue);
                rk4Var.g();
                return;
            default:
                rk4 rk4Var2 = rbbVar.s;
                rk4Var2.p = ((Float) obj).floatValue();
                rk4Var2.i();
                return;
        }
    }
}
