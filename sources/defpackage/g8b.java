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
public final class g8b implements qac {
    public final byte a;
    public final v9b b;

    public g8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    @Override
    public final void a(Object obj) {
        boolean z;
        String str;
        lqb lqbVar;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        r8b r8bVar;
        int contentHeight;
        float L;
        byte b = this.a;
        float f = 1.0f;
        float f2 = 0.0f;
        cx8 cx8Var = null;
        int i2 = 0;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                rk4 rk4Var = v9bVar.s;
                float floatValue = ((Float) obj).floatValue();
                rk4Var.o = floatValue;
                rk4Var.n = rk4.f(floatValue);
                rk4Var.g();
                return;
            case 1:
                rk4 rk4Var2 = v9bVar.s;
                rk4Var2.p = ((Float) obj).floatValue();
                rk4Var2.i();
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                g6b g6bVar = v9bVar.L1;
                if (g6bVar != null) {
                    gm.w2(g6bVar.g0);
                    v9bVar.L1.g0 = bitmap;
                    a8b a8bVar = v9bVar.r0;
                    if (a8bVar != null) {
                        a8bVar.O0(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                g6b g6bVar2 = (g6b) obj;
                v9bVar.V(g6bVar2, false);
                int i3 = v9bVar.c;
                h4b N1 = oc7.r1(i3).N1();
                vh6 vh6Var = N1.e;
                int i4 = N1.a;
                ArrayList arrayList = N1.h;
                ArrayList arrayList2 = N1.g;
                g4b g4bVar = new g4b(N1, g6bVar2);
                boolean z5 = g6bVar2.g;
                long j = g4bVar.K;
                if (z5) {
                    HashMap hashMap = (HashMap) vh6Var.f(j);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        vh6Var.k(hashMap, j);
                    }
                    hashMap.put(Integer.valueOf(g6bVar2.f), g4bVar);
                } else {
                    N1.c(j, g4bVar, N1.b, false);
                }
                N1.c(j, g4bVar, N1.c, true);
                if (j != z8c.h(i4).n) {
                    int i5 = 0;
                    while (true) {
                        if (i5 < arrayList2.size()) {
                            if (pg3.n(((TL_stories.PeerStories) arrayList2.get(i5)).peer) == j) {
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
                                if (pg3.n(((TL_stories.PeerStories) arrayList.get(i6)).peer) == j) {
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
                        tL_peerStories.peer = oc7.r1(i4).x1(j);
                        N1.d0(j, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        N1.Q(j);
                    }
                }
                g4bVar.d();
                nm7.f(i4).k(329, new Object[0]);
                if (g6bVar2.c && !g6bVar2.g) {
                    oc7.r1(i3).N1().w.b(g6bVar2);
                }
                if (g6bVar2.e1 != 0) {
                    ConnectionsManager.getInstance(g6bVar2.a).cancelRequest(g6bVar2.e1, true);
                    return;
                }
                return;
            case 4:
                cx8 cx8Var2 = (cx8) obj;
                if (v9bVar.D0 != null) {
                    ms9 ms9Var = v9bVar.E0;
                    if (cx8Var2 == null) {
                        str = null;
                    } else {
                        str = cx8Var2.a;
                    }
                    ms9Var.setLink(str);
                    j9b j9bVar = v9bVar.B0;
                    if (j9bVar != null) {
                        dx8 dx8Var = j9bVar.c;
                        if (v9bVar.E0.E) {
                            cx8Var = (cx8) v9bVar.D0.d;
                        }
                        dx8Var.c(cx8Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                Integer num = (Integer) obj;
                g6b g6bVar3 = v9bVar.L1;
                if (g6bVar3 != null) {
                    g6bVar3.I0 = num.intValue();
                    oc7.d1().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 6:
                r63 r63Var = v9bVar.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                m21 m21Var = new n21(v9bVar.b, new oz((byte) 14)).a;
                WindowManager.LayoutParams layout = m21Var.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = v9bVar.r.getWidth();
                    layout.y = (int) (v9bVar.r.getY() + gm.L(56.0f));
                    n21 n21Var = m21Var.a;
                    n21Var.getWindow().setAttributes(n21Var.b);
                }
                m21Var.setTouchable(true);
                new c41(m21Var, r63Var).G(2131624021, 3, gm.N2(jb6.G(intValue, "StoryPeriodPremium", new Object[0]), cmb.Wc, 0, new f8b(v9bVar, (byte) 28), r63Var)).k(true);
                return;
            case 7:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (lqbVar = v9bVar.a1) != null && lqbVar.Q) {
                    lqbVar.Q = false;
                    if (lqbVar.F && lqbVar.h == null) {
                        lqbVar.H = true;
                        fqb fqbVar = lqbVar.a;
                        if (fqbVar != null) {
                            fqbVar.h1(true);
                        }
                    }
                }
                v9bVar.Y0.x(2, bool.booleanValue());
                v9bVar.Z0.clearAnimation();
                ViewPropertyAnimator animate = v9bVar.Z0.animate();
                if (bool.booleanValue()) {
                    f = 0.0f;
                }
                wi8.s(animate, f, 120L);
                u31 u31Var = u31.x;
                if (u31Var != null && u31Var.a == 2) {
                    u31Var.l();
                    return;
                }
                return;
            case 8:
                v9bVar.i();
                v9bVar.j();
                v9bVar.f((Runnable) obj);
                return;
            case 9:
                sl2 sl2Var = (sl2) obj;
                j9b j9bVar2 = v9bVar.B0;
                v9bVar.A0 = sl2Var;
                j9bVar2.o(sl2Var);
                v9bVar.J0.setSelected(sl2Var);
                a9b a9bVar = v9bVar.C0;
                if (a9bVar != null) {
                    a9bVar.recordHevc = !v9bVar.B0.i();
                }
                v9bVar.H0.setDrawable(new tl2(sl2Var, false));
                v9bVar.b0(v9bVar.I0, v9bVar.J0.e, true);
                j49 j49Var = v9bVar.P0;
                if (v9bVar.B0.i()) {
                    f2 = v9bVar.B0.getFilledProgress();
                }
                j49Var.e(true, f2);
                wt4 wt4Var = v9bVar.N0;
                if (wt4Var != null) {
                    wt4Var.setMultipleOnClick(v9bVar.B0.i());
                    v9bVar.N0.setMaxCount(Math.min(10, sl2.b() - v9bVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 10:
                v9bVar.P = true;
                v9bVar.o(true);
                gm.d3(new mo0((qac) obj, (byte) 13), 210L);
                return;
            case 11:
                Integer num2 = (Integer) obj;
                if (!v9bVar.Q1 && !v9bVar.R1) {
                    int intValue2 = num2.intValue();
                    v9bVar.P1 = intValue2;
                    q0a q0aVar = v9bVar.p0;
                    if (intValue2 == -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    q0aVar.a(z2, true);
                    if (v9bVar.P1 == 1 && !v9bVar.J0.e) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    v9bVar.h0(z3, true);
                    v9bVar.R0.a(num2.intValue());
                    j49 j49Var2 = v9bVar.P0;
                    if (num2.intValue() == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    j49Var2.o0 = -1.0f;
                    j49Var2.p0 = z4;
                    j49Var2.invalidate();
                    if (num2.intValue() == -1) {
                        a9b a9bVar2 = v9bVar.C0;
                        if (a9bVar2 != null && a9bVar2.isDual()) {
                            v9bVar.C0.toggleDual();
                        }
                        hg5 hg5Var = v9bVar.m1;
                        if (hg5Var != null) {
                            hg5Var.f(true);
                        }
                        hg5 hg5Var2 = v9bVar.n1;
                        if (hg5Var2 != null) {
                            hg5Var2.f(true);
                        }
                        hg5 hg5Var3 = v9bVar.X0;
                        if (hg5Var3 != null) {
                            hg5Var3.f(true);
                        }
                        v9bVar.B0.o(null);
                        v9bVar.B0.b();
                        v9bVar.J0.setSelected((sl2) null);
                        a9b a9bVar3 = v9bVar.C0;
                        if (a9bVar3 != null) {
                            a9bVar3.recordHevc = !v9bVar.B0.i();
                        }
                    }
                    v9bVar.J0.a(false, true);
                    v9bVar.l0(true);
                    return;
                }
                return;
            case 12:
                Float f3 = (Float) obj;
                j49 j49Var3 = v9bVar.P0;
                j49Var3.o0 = f3.floatValue();
                j49Var3.invalidate();
                j49 j49Var4 = v9bVar.P0;
                int i7 = 8;
                if (f3.floatValue() <= -1.0f) {
                    i = 8;
                } else {
                    i = 0;
                }
                j49Var4.setVisibility(i);
                v9bVar.P0.setAlpha(Utilities.l(f3.floatValue() + 1.0f));
                b61 b61Var = v9bVar.Q0;
                if (f3.floatValue() < 0.0f) {
                    i7 = 0;
                }
                b61Var.setVisibility(i7);
                v9bVar.Q0.setAlpha(gm.x1(f3.floatValue(), 0.0f, -1.0f));
                v9bVar.Q0.setScaleX(gm.R1(0.8f, 1.0f, gm.x1(f3.floatValue(), 0.0f, -1.0f)));
                v9bVar.Q0.setScaleY(gm.R1(0.8f, 1.0f, gm.x1(f3.floatValue(), 0.0f, -1.0f)));
                v9bVar.Q0.setTranslationY(gm.U1(gm.x1(f3.floatValue(), 0.0f, -1.0f), gm.L(12.0f), 0));
                if (f3.floatValue() < 0.0f) {
                    v9bVar.c(false);
                    return;
                }
                return;
            case 13:
                Integer num3 = (Integer) obj;
                if (v9bVar.L1 != null) {
                    l9b l9bVar = v9bVar.d1;
                    if (!l9bVar.O1) {
                        l9bVar.clearFocus();
                        if (num3.intValue() == 5) {
                            v9bVar.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            v9bVar.k0(0, false, true);
                            z8b z8bVar = v9bVar.w1;
                            if (z8bVar != null) {
                                z8bVar.C0 = false;
                                z8bVar.R0(0);
                                z8bVar.D0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            v9bVar.k0(0, false, true);
                            z8b z8bVar2 = v9bVar.w1;
                            if (z8bVar2 != null) {
                                z8bVar2.R0(2);
                                z8bVar2.f2 = true;
                                z8bVar2.l0(true);
                                v9bVar.w1.C0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            v9bVar.s();
                            v9bVar.F();
                            z8b z8bVar3 = v9bVar.w1;
                            if (z8bVar3 != null) {
                                z8bVar3.R0(1);
                                z8bVar3.z0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            v9bVar.k0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            v9bVar.k0(3, false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 14:
                Integer num4 = (Integer) obj;
                FrameLayout frameLayout = v9bVar.Z0;
                if (frameLayout != null) {
                    if (v9bVar.h0 == 2) {
                        L = gm.L(68.0f);
                    } else {
                        L = gm.L(64.0f) + (-(gm.L(12.0f) + v9bVar.d1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(L);
                }
                r8b r8bVar2 = v9bVar.e1;
                if (r8bVar2 != null) {
                    int i8 = -(gm.L(24.0f) + v9bVar.d1.getEditTextHeight());
                    lqb lqbVar2 = v9bVar.a1;
                    if (lqbVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = lqbVar2.getContentHeight() - gm.L(5.0f);
                    }
                    r8bVar2.setTranslationY(i8 - contentHeight);
                }
                u31 u31Var2 = u31.x;
                if (u31Var2 != null && u31Var2.a == 2) {
                    u31Var2.l();
                }
                if (v9bVar.d1.p0 && (r8bVar = v9bVar.e1) != null) {
                    r8bVar.c(false, true);
                    return;
                }
                return;
            case 15:
                y7b y7bVar = (y7b) obj;
                g6b g6bVar4 = v9bVar.L1;
                if (g6bVar4 != null) {
                    g6bVar4.E0 = y7bVar;
                }
                ArrayList arrayList3 = v9bVar.I1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i2 < size) {
                        Object obj2 = arrayList3.get(i2);
                        i2++;
                        ((g6b) obj2).E0 = y7bVar;
                    }
                    return;
                }
                return;
            case 16:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                g6b g6bVar5 = v9bVar.L1;
                if (g6bVar5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    g6bVar5.v0 = inputPeer;
                    ArrayList arrayList4 = v9bVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i2 < size2) {
                            Object obj3 = arrayList4.get(i2);
                            i2++;
                            ((g6b) obj3).v0 = v9bVar.L1.v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                HashSet hashSet = (HashSet) obj;
                g6b g6bVar6 = v9bVar.L1;
                if (g6bVar6 != null) {
                    g6bVar6.w0 = hashSet;
                    ArrayList arrayList5 = v9bVar.I1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i2 < size3) {
                            Object obj4 = arrayList5.get(i2);
                            i2++;
                            ((g6b) obj4).w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                Bitmap bitmap2 = (Bitmap) obj;
                g6b g6bVar7 = v9bVar.L1;
                if (g6bVar7 != null) {
                    Bitmap bitmap3 = g6bVar7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    v9bVar.L1.g0 = bitmap2;
                    a8b a8bVar2 = v9bVar.r0;
                    if (a8bVar2 != null) {
                        a8bVar2.O0(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                v9bVar.z0 = (y7b) obj;
                return;
            case 20:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                q0a q0aVar2 = v9bVar.p0;
                v9bVar.y0 = inputPeer2;
                q0aVar2.set(inputPeer2);
                return;
            default:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                q0a q0aVar3 = v9bVar.p0;
                v9bVar.y0 = inputPeer3;
                q0aVar3.set(inputPeer3);
                return;
        }
    }
}
