package kh;

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
public final class w9 implements Utilities.Callback {
    public final int f16243a;
    public final wb f16244b;

    public w9(wb wbVar, int i9) {
        this.f16243a = i9;
        this.f16244b = wbVar;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        float f10;
        gc gcVar;
        float f11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i9;
        na naVar;
        int contentHeight;
        float dp;
        switch (this.f16243a) {
            case 0:
                s2 s2Var = this.f16244b.f16304s;
                s2Var.f16022p = ((Float) obj).floatValue();
                s2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                wb wbVar = this.f16244b;
                a8 a8Var = wbVar.G1;
                if (a8Var != null) {
                    AndroidUtilities.recycleBitmap(a8Var.f14918g0);
                    wbVar.G1.f14918g0 = bitmap;
                    t9 t9Var = wbVar.m0;
                    if (t9Var != null) {
                        t9Var.n1(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                a8 a8Var2 = (a8) obj;
                wb wbVar2 = this.f16244b;
                wbVar2.W(a8Var2, false);
                int i10 = wbVar2.f16253c;
                ih.v6 storiesController = MessagesController.getInstance(i10).getStoriesController();
                a0.h hVar = storiesController.f12239e;
                int i11 = storiesController.f12236a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f12241g;
                ih.u6 u6Var = new ih.u6(storiesController, a8Var2);
                boolean z14 = a8Var2.f14917g;
                long j10 = u6Var.F;
                if (z14) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(a8Var2.f14915f), u6Var);
                } else {
                    storiesController.d(j10, u6Var, storiesController.f12237b, false);
                }
                storiesController.d(j10, u6Var, storiesController.f12238c, true);
                if (j10 != UserConfig.getInstance(i11).clientUserId) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList2.size()) {
                            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i12)).peer) == j10) {
                                arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i12));
                                z10 = true;
                            } else {
                                i12++;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    if (!z10) {
                        int i13 = 0;
                        while (true) {
                            if (i13 < arrayList.size()) {
                                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i13)).peer) == j10) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i13));
                                    z10 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                    if (!z10) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = MessagesController.getInstance(i11).getPeer(j10);
                        storiesController.b0(j10, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        storiesController.O(j10);
                    }
                }
                u6Var.d();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (a8Var2.f14907c && !a8Var2.f14917g) {
                    MessagesController.getInstance(i10).getStoriesController().f12255w.c(a8Var2);
                }
                if (a8Var2.f14914e1 != 0) {
                    ConnectionsManager.getInstance(a8Var2.f14901a).cancelRequest(a8Var2.f14914e1, true);
                    return;
                }
                return;
            case 3:
                t6 t6Var = (t6) obj;
                wb wbVar3 = this.f16244b;
                if (wbVar3.f16326y0 != null) {
                    k7 k7Var = wbVar3.f16329z0;
                    t6 t6Var2 = null;
                    if (t6Var == null) {
                        str = null;
                    } else {
                        str = t6Var.f16089a;
                    }
                    k7Var.setLink(str);
                    jb jbVar = wbVar3.f16318w0;
                    if (jbVar != null) {
                        u6 u6Var2 = jbVar.f15198c;
                        if (wbVar3.f16329z0.f15538y) {
                            t6Var2 = wbVar3.f16326y0.d;
                        }
                        u6Var2.a(t6Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                a8 a8Var3 = this.f16244b.G1;
                if (a8Var3 != null) {
                    a8Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                wb wbVar4 = this.f16244b;
                ih.b bVar = wbVar4.f16246a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.bb bbVar = new org.telegram.ui.Components.cb(wbVar4.f16249b, new bg.z(5)).f27452a;
                WindowManager.LayoutParams layout = bbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = wbVar4.f16300r.getWidth();
                    layout.y = (int) (wbVar4.f16300r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.cb cbVar = bbVar.f27136a;
                    cbVar.getWindow().setAttributes(cbVar.f27453b);
                }
                bbVar.setTouchable(true);
                new org.telegram.ui.Components.oc(bbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.f6.f23061gc, 0, new v9(wbVar4, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                wb wbVar5 = this.f16244b;
                if (booleanValue && (gcVar = wbVar5.V0) != null && gcVar.L) {
                    gcVar.L = false;
                    if (gcVar.A && gcVar.h == null) {
                        gcVar.C = true;
                        ac acVar = gcVar.f15326a;
                        if (acVar != null) {
                            acVar.j1(true);
                        }
                    }
                }
                wbVar5.T0.x(2, bool.booleanValue());
                wbVar5.U0.clearAnimation();
                ViewPropertyAnimator animate = wbVar5.U0.animate();
                if (bool.booleanValue()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(120L).start();
                org.telegram.ui.Components.gc gcVar2 = org.telegram.ui.Components.gc.f28729w;
                if (gcVar2 != null && gcVar2.f28730a == 2) {
                    gcVar2.l();
                    return;
                }
                return;
            case 7:
                wb wbVar6 = this.f16244b;
                wbVar6.l();
                wbVar6.m();
                wbVar6.i((Runnable) obj);
                return;
            case 8:
                u uVar = (u) obj;
                wb wbVar7 = this.f16244b;
                jb jbVar2 = wbVar7.f16318w0;
                wbVar7.f16314v0 = uVar;
                jbVar2.o(uVar);
                wbVar7.E0.setSelected(uVar);
                za zaVar = wbVar7.f16322x0;
                if (zaVar != null) {
                    zaVar.recordHevc = !wbVar7.f16318w0.j();
                }
                wbVar7.C0.setDrawable(new v(uVar, false));
                wbVar7.c0(wbVar7.D0, wbVar7.E0.f16418e, true);
                z6 z6Var = wbVar7.K0;
                if (wbVar7.f16318w0.j()) {
                    f11 = wbVar7.f16318w0.getFilledProgress();
                } else {
                    f11 = 0.0f;
                }
                z6Var.e(f11, true);
                va vaVar = wbVar7.I0;
                if (vaVar != null) {
                    vaVar.setMultipleOnClick(wbVar7.f16318w0.j());
                    wbVar7.I0.setMaxCount(Math.min(10, u.b() - wbVar7.f16318w0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                wb wbVar8 = this.f16244b;
                wbVar8.K = true;
                wbVar8.q(true);
                AndroidUtilities.runOnUIThread(new bg.s0(3, (Utilities.Callback) obj), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                wb wbVar9 = this.f16244b;
                if (!wbVar9.L1 && !wbVar9.M1) {
                    int intValue2 = num2.intValue();
                    wbVar9.K1 = intValue2;
                    t7 t7Var = wbVar9.f16280k0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t7Var.a(z11, true);
                    if (wbVar9.K1 == 1 && !wbVar9.E0.f16418e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    wbVar9.i0(z12, true);
                    wbVar9.M0.a(num2.intValue());
                    z6 z6Var2 = wbVar9.K0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z6Var2.f16442j0 = -1.0f;
                    z6Var2.f16443k0 = z13;
                    z6Var2.invalidate();
                    if (num2.intValue() == -1) {
                        za zaVar2 = wbVar9.f16322x0;
                        if (zaVar2 != null && zaVar2.isDual()) {
                            wbVar9.f16322x0.toggleDual();
                        }
                        x3 x3Var = wbVar9.f16272h1;
                        if (x3Var != null) {
                            x3Var.e(true);
                        }
                        x3 x3Var2 = wbVar9.f16275i1;
                        if (x3Var2 != null) {
                            x3Var2.e(true);
                        }
                        x3 x3Var3 = wbVar9.S0;
                        if (x3Var3 != null) {
                            x3Var3.e(true);
                        }
                        wbVar9.f16318w0.o(null);
                        wbVar9.f16318w0.e();
                        wbVar9.E0.setSelected((u) null);
                        za zaVar3 = wbVar9.f16322x0;
                        if (zaVar3 != null) {
                            zaVar3.recordHevc = !wbVar9.f16318w0.j();
                        }
                    }
                    wbVar9.E0.a(false, true);
                    wbVar9.m0(true);
                    return;
                }
                return;
            case 11:
                Float f12 = (Float) obj;
                wb wbVar10 = this.f16244b;
                z6 z6Var3 = wbVar10.K0;
                z6Var3.f16442j0 = f12.floatValue();
                z6Var3.invalidate();
                z6 z6Var4 = wbVar10.K0;
                int i14 = 8;
                if (f12.floatValue() <= -1.0f) {
                    i9 = 8;
                } else {
                    i9 = 0;
                }
                z6Var4.setVisibility(i9);
                wbVar10.K0.setAlpha(Utilities.clamp01(f12.floatValue() + 1.0f));
                d dVar = wbVar10.L0;
                if (f12.floatValue() < 0.0f) {
                    i14 = 0;
                }
                dVar.setVisibility(i14);
                wbVar10.L0.setAlpha(AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f));
                wbVar10.L0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f)));
                wbVar10.L0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f)));
                wbVar10.L0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f12.floatValue(), 0.0f, -1.0f)));
                if (f12.floatValue() < 0.0f) {
                    wbVar10.f(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                wb wbVar11 = this.f16244b;
                if (wbVar11.G1 != null) {
                    mb mbVar = wbVar11.Y0;
                    if (!mbVar.K1) {
                        mbVar.clearFocus();
                        if (num3.intValue() == 5) {
                            wbVar11.X();
                            return;
                        } else if (num3.intValue() == 0) {
                            wbVar11.l0(0, false, true);
                            ya yaVar = wbVar11.f16302r1;
                            if (yaVar != null) {
                                yaVar.I0 = false;
                                yaVar.R0(0);
                                yaVar.D0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            wbVar11.l0(0, false, true);
                            ya yaVar2 = wbVar11.f16302r1;
                            if (yaVar2 != null) {
                                yaVar2.R0(2);
                                yaVar2.f15282h2 = true;
                                yaVar2.o0(true);
                                wbVar11.f16302r1.I0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            wbVar11.u();
                            wbVar11.H();
                            ya yaVar3 = wbVar11.f16302r1;
                            if (yaVar3 != null) {
                                yaVar3.R0(1);
                                yaVar3.A0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            wbVar11.l0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            wbVar11.l0(3, false, true);
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
                wb wbVar12 = this.f16244b;
                FrameLayout frameLayout = wbVar12.U0;
                if (frameLayout != null) {
                    if (wbVar12.f16254c0 == 2) {
                        dp = AndroidUtilities.dp(68.0f);
                    } else {
                        dp = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + wbVar12.Y0.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(dp);
                }
                na naVar2 = wbVar12.Z0;
                if (naVar2 != null) {
                    int i15 = -(AndroidUtilities.dp(24.0f) + wbVar12.Y0.getEditTextHeight());
                    gc gcVar3 = wbVar12.V0;
                    if (gcVar3 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = gcVar3.getContentHeight() - AndroidUtilities.dp(5.0f);
                    }
                    naVar2.setTranslationY(i15 - contentHeight);
                }
                org.telegram.ui.Components.gc gcVar4 = org.telegram.ui.Components.gc.f28729w;
                if (gcVar4 != null && gcVar4.f28730a == 2) {
                    gcVar4.l();
                }
                if (wbVar12.Y0.f15639l0 && (naVar = wbVar12.Z0) != null) {
                    naVar.c(false, true);
                    return;
                }
                return;
            case 14:
                r9 r9Var = (r9) obj;
                wb wbVar13 = this.f16244b;
                a8 a8Var4 = wbVar13.G1;
                if (a8Var4 != null) {
                    a8Var4.E0 = r9Var;
                }
                ArrayList arrayList3 = wbVar13.D1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj2 = arrayList3.get(i16);
                        i16++;
                        ((a8) obj2).E0 = r9Var;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                wb wbVar14 = this.f16244b;
                a8 a8Var5 = wbVar14.G1;
                if (a8Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    a8Var5.f14945v0 = inputPeer;
                    ArrayList arrayList4 = wbVar14.D1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            Object obj3 = arrayList4.get(i17);
                            i17++;
                            ((a8) obj3).f14945v0 = wbVar14.G1.f14945v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                wb wbVar15 = this.f16244b;
                a8 a8Var6 = wbVar15.G1;
                if (a8Var6 != null) {
                    a8Var6.f14947w0 = hashSet;
                    ArrayList arrayList5 = wbVar15.D1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i18 = 0;
                        while (i18 < size3) {
                            Object obj4 = arrayList5.get(i18);
                            i18++;
                            ((a8) obj4).f14947w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                wb wbVar16 = this.f16244b;
                a8 a8Var7 = wbVar16.G1;
                if (a8Var7 != null) {
                    Bitmap bitmap3 = a8Var7.f14918g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    wbVar16.G1.f14918g0 = bitmap2;
                    t9 t9Var2 = wbVar16.m0;
                    if (t9Var2 != null) {
                        t9Var2.n1(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.f16244b.f16311u0 = (r9) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                wb wbVar17 = this.f16244b;
                t7 t7Var2 = wbVar17.f16280k0;
                wbVar17.f16308t0 = inputPeer2;
                t7Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                wb wbVar18 = this.f16244b;
                t7 t7Var3 = wbVar18.f16280k0;
                wbVar18.f16308t0 = inputPeer3;
                t7Var3.set(inputPeer3);
                return;
            default:
                s2 s2Var2 = this.f16244b.f16304s;
                float floatValue = ((Float) obj).floatValue();
                s2Var2.f16021o = floatValue;
                s2Var2.f16020n = s2.f(floatValue);
                s2Var2.g();
                return;
        }
    }
}
