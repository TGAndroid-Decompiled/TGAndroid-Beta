package nh;

import android.graphics.Bitmap;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
public final class h9 implements Utilities.Callback {
    public final int f17856a;
    public final gb f17857b;

    public h9(gb gbVar, int i10) {
        this.f17856a = i10;
        this.f17857b = gbVar;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        float f9;
        qb qbVar;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        y9 y9Var;
        int contentHeight;
        float dp;
        switch (this.f17856a) {
            case 0:
                p2 p2Var = this.f17857b.f17794s;
                p2Var.f18343p = ((Float) obj).floatValue();
                p2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                gb gbVar = this.f17857b;
                o7 o7Var = gbVar.G1;
                if (o7Var != null) {
                    AndroidUtilities.recycleBitmap(o7Var.f18271g0);
                    gbVar.G1.f18271g0 = bitmap;
                    e9 e9Var = gbVar.m0;
                    if (e9Var != null) {
                        e9Var.n1(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                o7 o7Var2 = (o7) obj;
                gb gbVar2 = this.f17857b;
                gbVar2.W(o7Var2, false);
                int i11 = gbVar2.f17743c;
                lh.s6 storiesController = MessagesController.getInstance(i11).getStoriesController();
                a0.h hVar = storiesController.f16221e;
                int i12 = storiesController.f16218a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f16223g;
                lh.r6 r6Var = new lh.r6(storiesController, o7Var2);
                boolean z14 = o7Var2.f18270g;
                long j10 = r6Var.F;
                if (z14) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(o7Var2.f18268f), r6Var);
                } else {
                    storiesController.d(j10, r6Var, storiesController.f16219b, false);
                }
                storiesController.d(j10, r6Var, storiesController.f16220c, true);
                if (j10 != UserConfig.getInstance(i12).clientUserId) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList2.size()) {
                            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i13)).peer) == j10) {
                                arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i13));
                                z10 = true;
                            } else {
                                i13++;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    if (!z10) {
                        int i14 = 0;
                        while (true) {
                            if (i14 < arrayList.size()) {
                                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer) == j10) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i14));
                                    z10 = true;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    if (!z10) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = MessagesController.getInstance(i12).getPeer(j10);
                        storiesController.b0(j10, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        storiesController.O(j10);
                    }
                }
                r6Var.d();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (o7Var2.f18260c && !o7Var2.f18270g) {
                    MessagesController.getInstance(i11).getStoriesController().f16237w.c(o7Var2);
                }
                if (o7Var2.f18267e1 != 0) {
                    ConnectionsManager.getInstance(o7Var2.f18254a).cancelRequest(o7Var2.f18267e1, true);
                    return;
                }
                return;
            case 3:
                h6 h6Var = (h6) obj;
                gb gbVar3 = this.f17857b;
                if (gbVar3.f17816y0 != null) {
                    y6 y6Var = gbVar3.f17819z0;
                    h6 h6Var2 = null;
                    if (h6Var == null) {
                        str = null;
                    } else {
                        str = h6Var.f17844a;
                    }
                    y6Var.setLink(str);
                    ua uaVar = gbVar3.f17808w0;
                    if (uaVar != null) {
                        i6 i6Var = uaVar.f17560c;
                        if (gbVar3.f17819z0.f18889y) {
                            h6Var2 = gbVar3.f17816y0.d;
                        }
                        i6Var.a(h6Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                o7 o7Var3 = this.f17857b.G1;
                if (o7Var3 != null) {
                    o7Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                gb gbVar4 = this.f17857b;
                lh.b bVar = gbVar4.f17736a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.gb gbVar5 = new org.telegram.ui.Components.hb(gbVar4.f17739b, new eg.x(5)).f29158a;
                WindowManager.LayoutParams layout = gbVar5.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = gbVar4.f17790r.getWidth();
                    layout.y = (int) (gbVar4.f17790r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.hb hbVar = gbVar5.f28863a;
                    hbVar.getWindow().setAttributes(hbVar.f29159b);
                }
                gbVar5.setTouchable(true);
                new tc(gbVar5, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.g6.gc, 0, new g9(gbVar4, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                gb gbVar6 = this.f17857b;
                if (booleanValue && (qbVar = gbVar6.V0) != null && qbVar.L) {
                    qbVar.L = false;
                    if (qbVar.A && qbVar.h == null) {
                        qbVar.C = true;
                        kb kbVar = qbVar.f18413a;
                        if (kbVar != null) {
                            kbVar.d1(true);
                        }
                    }
                }
                gbVar6.T0.x(2, bool.booleanValue());
                gbVar6.U0.clearAnimation();
                ViewPropertyAnimator animate = gbVar6.U0.animate();
                if (bool.booleanValue()) {
                    f9 = 0.0f;
                } else {
                    f9 = 1.0f;
                }
                animate.alpha(f9).setDuration(120L).start();
                mc mcVar = mc.f30644w;
                if (mcVar != null && mcVar.f30645a == 2) {
                    mcVar.l();
                    return;
                }
                return;
            case 7:
                gb gbVar7 = this.f17857b;
                gbVar7.l();
                gbVar7.m();
                gbVar7.i((Runnable) obj);
                return;
            case 8:
                t tVar = (t) obj;
                gb gbVar8 = this.f17857b;
                ua uaVar2 = gbVar8.f17808w0;
                gbVar8.f17804v0 = tVar;
                uaVar2.o(tVar);
                gbVar8.E0.setSelected(tVar);
                ka kaVar = gbVar8.f17812x0;
                if (kaVar != null) {
                    kaVar.recordHevc = !gbVar8.f17808w0.j();
                }
                gbVar8.C0.setDrawable(new u(tVar, false));
                gbVar8.c0(gbVar8.D0, gbVar8.E0.f18848e, true);
                o6 o6Var = gbVar8.K0;
                if (gbVar8.f17808w0.j()) {
                    f10 = gbVar8.f17808w0.getFilledProgress();
                } else {
                    f10 = 0.0f;
                }
                o6Var.e(f10, true);
                ga gaVar = gbVar8.I0;
                if (gaVar != null) {
                    gaVar.setMultipleOnClick(gbVar8.f17808w0.j());
                    gbVar8.I0.setMaxCount(Math.min(10, t.b() - gbVar8.f17808w0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                gb gbVar9 = this.f17857b;
                gbVar9.K = true;
                gbVar9.q(true);
                AndroidUtilities.runOnUIThread(new eg.o0(3, (Utilities.Callback) obj), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                gb gbVar10 = this.f17857b;
                if (!gbVar10.L1 && !gbVar10.M1) {
                    int intValue2 = num2.intValue();
                    gbVar10.K1 = intValue2;
                    h7 h7Var = gbVar10.f17770k0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h7Var.a(z11, true);
                    if (gbVar10.K1 == 1 && !gbVar10.E0.f18848e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    gbVar10.i0(z12, true);
                    gbVar10.M0.a(num2.intValue());
                    o6 o6Var2 = gbVar10.K0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    o6Var2.f18232j0 = -1.0f;
                    o6Var2.f18233k0 = z13;
                    o6Var2.invalidate();
                    if (num2.intValue() == -1) {
                        ka kaVar2 = gbVar10.f17812x0;
                        if (kaVar2 != null && kaVar2.isDual()) {
                            gbVar10.f17812x0.toggleDual();
                        }
                        t3 t3Var = gbVar10.f17762h1;
                        if (t3Var != null) {
                            t3Var.e(true);
                        }
                        t3 t3Var2 = gbVar10.f17765i1;
                        if (t3Var2 != null) {
                            t3Var2.e(true);
                        }
                        t3 t3Var3 = gbVar10.S0;
                        if (t3Var3 != null) {
                            t3Var3.e(true);
                        }
                        gbVar10.f17808w0.o(null);
                        gbVar10.f17808w0.e();
                        gbVar10.E0.setSelected((t) null);
                        ka kaVar3 = gbVar10.f17812x0;
                        if (kaVar3 != null) {
                            kaVar3.recordHevc = !gbVar10.f17808w0.j();
                        }
                    }
                    gbVar10.E0.a(false, true);
                    gbVar10.m0(true);
                    return;
                }
                return;
            case 11:
                Float f11 = (Float) obj;
                gb gbVar11 = this.f17857b;
                o6 o6Var3 = gbVar11.K0;
                o6Var3.f18232j0 = f11.floatValue();
                o6Var3.invalidate();
                o6 o6Var4 = gbVar11.K0;
                int i15 = 8;
                if (f11.floatValue() <= -1.0f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                o6Var4.setVisibility(i10);
                gbVar11.K0.setAlpha(Utilities.clamp01(f11.floatValue() + 1.0f));
                d dVar = gbVar11.L0;
                if (f11.floatValue() < 0.0f) {
                    i15 = 0;
                }
                dVar.setVisibility(i15);
                gbVar11.L0.setAlpha(AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f));
                gbVar11.L0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                gbVar11.L0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                gbVar11.L0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                if (f11.floatValue() < 0.0f) {
                    gbVar11.f(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                gb gbVar12 = this.f17857b;
                if (gbVar12.G1 != null) {
                    wa waVar = gbVar12.Y0;
                    if (!waVar.K1) {
                        waVar.clearFocus();
                        if (num3.intValue() == 5) {
                            gbVar12.X();
                            return;
                        } else if (num3.intValue() == 0) {
                            gbVar12.l0(0, false, true);
                            ja jaVar = gbVar12.f17792r1;
                            if (jaVar != null) {
                                jaVar.I0 = false;
                                jaVar.R0(0);
                                jaVar.D0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            gbVar12.l0(0, false, true);
                            ja jaVar2 = gbVar12.f17792r1;
                            if (jaVar2 != null) {
                                jaVar2.R0(2);
                                jaVar2.f18637h2 = true;
                                jaVar2.o0(true);
                                gbVar12.f17792r1.I0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            gbVar12.u();
                            gbVar12.H();
                            ja jaVar3 = gbVar12.f17792r1;
                            if (jaVar3 != null) {
                                jaVar3.R0(1);
                                jaVar3.A0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            gbVar12.l0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            gbVar12.l0(3, false, true);
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
                gb gbVar13 = this.f17857b;
                FrameLayout frameLayout = gbVar13.U0;
                if (frameLayout != null) {
                    if (gbVar13.f17744c0 == 2) {
                        dp = AndroidUtilities.dp(68.0f);
                    } else {
                        dp = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + gbVar13.Y0.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(dp);
                }
                y9 y9Var2 = gbVar13.Z0;
                if (y9Var2 != null) {
                    int i16 = -(AndroidUtilities.dp(24.0f) + gbVar13.Y0.getEditTextHeight());
                    qb qbVar2 = gbVar13.V0;
                    if (qbVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = qbVar2.getContentHeight() - AndroidUtilities.dp(5.0f);
                    }
                    y9Var2.setTranslationY(i16 - contentHeight);
                }
                mc mcVar2 = mc.f30644w;
                if (mcVar2 != null && mcVar2.f30645a == 2) {
                    mcVar2.l();
                }
                if (gbVar13.Y0.f18083l0 && (y9Var = gbVar13.Z0) != null) {
                    y9Var.c(false, true);
                    return;
                }
                return;
            case 14:
                c9 c9Var = (c9) obj;
                gb gbVar14 = this.f17857b;
                o7 o7Var4 = gbVar14.G1;
                if (o7Var4 != null) {
                    o7Var4.E0 = c9Var;
                }
                ArrayList arrayList3 = gbVar14.D1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj2 = arrayList3.get(i17);
                        i17++;
                        ((o7) obj2).E0 = c9Var;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                gb gbVar15 = this.f17857b;
                o7 o7Var5 = gbVar15.G1;
                if (o7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    o7Var5.f18298v0 = inputPeer;
                    ArrayList arrayList4 = gbVar15.D1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj3 = arrayList4.get(i18);
                            i18++;
                            ((o7) obj3).f18298v0 = gbVar15.G1.f18298v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                gb gbVar16 = this.f17857b;
                o7 o7Var6 = gbVar16.G1;
                if (o7Var6 != null) {
                    o7Var6.f18300w0 = hashSet;
                    ArrayList arrayList5 = gbVar16.D1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj4 = arrayList5.get(i19);
                            i19++;
                            ((o7) obj4).f18300w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                gb gbVar17 = this.f17857b;
                o7 o7Var7 = gbVar17.G1;
                if (o7Var7 != null) {
                    Bitmap bitmap3 = o7Var7.f18271g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    gbVar17.G1.f18271g0 = bitmap2;
                    e9 e9Var2 = gbVar17.m0;
                    if (e9Var2 != null) {
                        e9Var2.n1(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.f17857b.f17801u0 = (c9) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                gb gbVar18 = this.f17857b;
                h7 h7Var2 = gbVar18.f17770k0;
                gbVar18.f17798t0 = inputPeer2;
                h7Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                gb gbVar19 = this.f17857b;
                h7 h7Var3 = gbVar19.f17770k0;
                gbVar19.f17798t0 = inputPeer3;
                h7Var3.set(inputPeer3);
                return;
            default:
                p2 p2Var2 = this.f17857b.f17794s;
                float floatValue = ((Float) obj).floatValue();
                p2Var2.f18342o = floatValue;
                p2Var2.f18341n = p2.f(floatValue);
                p2Var2.g();
                return;
        }
    }
}
