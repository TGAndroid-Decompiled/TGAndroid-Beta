package ci;

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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ha implements Utilities.Callback {
    public final int f5140a;
    public final kc f5141b;

    public ha(kc kcVar, int i10) {
        this.f5140a = i10;
        this.f5141b = kcVar;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        float f7;
        vc vcVar;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        bb bbVar;
        int contentHeight;
        float dp;
        switch (this.f5140a) {
            case 0:
                x2 x2Var = this.f5141b.f5432s;
                x2Var.f6278p = ((Float) obj).floatValue();
                x2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                kc kcVar = this.f5141b;
                k8 k8Var = kcVar.K1;
                if (k8Var != null) {
                    AndroidUtilities.recycleBitmap(k8Var.f5327g0);
                    kcVar.K1.f5327g0 = bitmap;
                    ea eaVar = kcVar.f5425q0;
                    if (eaVar != null) {
                        eaVar.n1(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                k8 k8Var2 = (k8) obj;
                kc kcVar2 = this.f5141b;
                kcVar2.W(k8Var2, false);
                int i11 = kcVar2.f5381c;
                ai.l9 storiesController = MessagesController.getInstance(i11).getStoriesController();
                a0.i iVar = storiesController.f1293e;
                int i12 = storiesController.f1290a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f1295g;
                ai.k9 k9Var = new ai.k9(storiesController, k8Var2);
                boolean z14 = k8Var2.f5326g;
                long j3 = k9Var.J;
                if (z14) {
                    HashMap hashMap = (HashMap) iVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        iVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(k8Var2.f5324f), k9Var);
                } else {
                    storiesController.d(j3, k9Var, storiesController.f1291b, false);
                }
                storiesController.d(j3, k9Var, storiesController.f1292c, true);
                if (j3 != UserConfig.getInstance(i12).clientUserId) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList2.size()) {
                            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i13)).peer) == j3) {
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
                                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer) == j3) {
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
                        tL_peerStories.peer = MessagesController.getInstance(i12).getPeer(j3);
                        storiesController.b0(j3, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        storiesController.O(j3);
                    }
                }
                k9Var.d();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (k8Var2.f5316c && !k8Var2.f5326g) {
                    MessagesController.getInstance(i11).getStoriesController().f1309w.b(k8Var2);
                }
                if (k8Var2.f5323e1 != 0) {
                    ConnectionsManager.getInstance(k8Var2.f5310a).cancelRequest(k8Var2.f5323e1, true);
                    return;
                }
                return;
            case 3:
                d7 d7Var = (d7) obj;
                kc kcVar3 = this.f5141b;
                if (kcVar3.C0 != null) {
                    t7 t7Var = kcVar3.D0;
                    d7 d7Var2 = null;
                    if (d7Var == null) {
                        str = null;
                    } else {
                        str = d7Var.f4911a;
                    }
                    t7Var.setLink(str);
                    xb xbVar = kcVar3.A0;
                    if (xbVar != null) {
                        e7 e7Var = xbVar.f4943c;
                        if (kcVar3.D0.f5997y) {
                            d7Var2 = kcVar3.C0.d;
                        }
                        e7Var.b(d7Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                k8 k8Var3 = this.f5141b.K1;
                if (k8Var3 != null) {
                    k8Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                kc kcVar4 = this.f5141b;
                ai.d dVar = kcVar4.f5374a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.lb lbVar = new org.telegram.ui.Components.mb(kcVar4.f5377b, new z8(1)).f28650a;
                WindowManager.LayoutParams layout = lbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = kcVar4.f5428r.getWidth();
                    layout.y = (int) (kcVar4.f5428r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.mb mbVar = lbVar.f28434a;
                    mbVar.getWindow().setAttributes(mbVar.f28651b);
                }
                lbVar.setTouchable(true);
                new org.telegram.ui.Components.yc(lbVar, dVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.i6.gc, 0, new ga(kcVar4, 27), dVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                kc kcVar5 = this.f5141b;
                if (booleanValue && (vcVar = kcVar5.Z0) != null && vcVar.P) {
                    vcVar.P = false;
                    if (vcVar.E && vcVar.h == null) {
                        vcVar.G = true;
                        oc ocVar = vcVar.f6135a;
                        if (ocVar != null) {
                            ocVar.X(true);
                        }
                    }
                }
                kcVar5.X0.x(2, bool.booleanValue());
                kcVar5.Y0.clearAnimation();
                ViewPropertyAnimator animate = kcVar5.Y0.animate();
                if (bool.booleanValue()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                bi.q(animate, f7, 120L);
                org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.f30419w;
                if (rcVar != null && rcVar.f30420a == 2) {
                    rcVar.l();
                    return;
                }
                return;
            case 7:
                kc kcVar6 = this.f5141b;
                kcVar6.l();
                kcVar6.m();
                kcVar6.i((Runnable) obj);
                return;
            case 8:
                t tVar = (t) obj;
                kc kcVar7 = this.f5141b;
                xb xbVar2 = kcVar7.A0;
                kcVar7.f5457z0 = tVar;
                xbVar2.o(tVar);
                kcVar7.I0.setSelected(tVar);
                nb nbVar = kcVar7.B0;
                if (nbVar != null) {
                    nbVar.recordHevc = !kcVar7.A0.j();
                }
                kcVar7.G0.setDrawable(new u(tVar, false));
                kcVar7.c0(kcVar7.H0, kcVar7.I0.f6327e, true);
                j7 j7Var = kcVar7.O0;
                if (kcVar7.A0.j()) {
                    f10 = kcVar7.A0.getFilledProgress();
                } else {
                    f10 = 0.0f;
                }
                j7Var.e(f10, true);
                jb jbVar = kcVar7.M0;
                if (jbVar != null) {
                    jbVar.setMultipleOnClick(kcVar7.A0.j());
                    kcVar7.M0.setMaxCount(Math.min(10, t.b() - kcVar7.A0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                kc kcVar8 = this.f5141b;
                kcVar8.O = true;
                kcVar8.q(true);
                AndroidUtilities.runOnUIThread(new wa(0, (Utilities.Callback) obj), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                kc kcVar9 = this.f5141b;
                if (!kcVar9.P1 && !kcVar9.Q1) {
                    int intValue2 = num2.intValue();
                    kcVar9.O1 = intValue2;
                    d8 d8Var = kcVar9.f5419o0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    d8Var.a(z11, true);
                    if (kcVar9.O1 == 1 && !kcVar9.I0.f6327e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    kcVar9.i0(z12, true);
                    kcVar9.Q0.a(num2.intValue());
                    j7 j7Var2 = kcVar9.O0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    j7Var2.f5234n0 = -1.0f;
                    j7Var2.f5235o0 = z13;
                    j7Var2.invalidate();
                    if (num2.intValue() == -1) {
                        nb nbVar2 = kcVar9.B0;
                        if (nbVar2 != null && nbVar2.isDual()) {
                            kcVar9.B0.toggleDual();
                        }
                        e4 e4Var = kcVar9.l1;
                        if (e4Var != null) {
                            e4Var.e(true);
                        }
                        e4 e4Var2 = kcVar9.f5413m1;
                        if (e4Var2 != null) {
                            e4Var2.e(true);
                        }
                        e4 e4Var3 = kcVar9.W0;
                        if (e4Var3 != null) {
                            e4Var3.e(true);
                        }
                        kcVar9.A0.o(null);
                        kcVar9.A0.e();
                        kcVar9.I0.setSelected((t) null);
                        nb nbVar3 = kcVar9.B0;
                        if (nbVar3 != null) {
                            nbVar3.recordHevc = !kcVar9.A0.j();
                        }
                    }
                    kcVar9.I0.a(false, true);
                    kcVar9.m0(true);
                    return;
                }
                return;
            case 11:
                Float f11 = (Float) obj;
                kc kcVar10 = this.f5141b;
                j7 j7Var3 = kcVar10.O0;
                j7Var3.f5234n0 = f11.floatValue();
                j7Var3.invalidate();
                j7 j7Var4 = kcVar10.O0;
                int i15 = 8;
                if (f11.floatValue() <= -1.0f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                j7Var4.setVisibility(i10);
                kcVar10.O0.setAlpha(Utilities.clamp01(f11.floatValue() + 1.0f));
                d dVar2 = kcVar10.P0;
                if (f11.floatValue() < 0.0f) {
                    i15 = 0;
                }
                dVar2.setVisibility(i15);
                kcVar10.P0.setAlpha(AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f));
                kcVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                kcVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                kcVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                if (f11.floatValue() < 0.0f) {
                    kcVar10.f(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                kc kcVar11 = this.f5141b;
                if (kcVar11.K1 != null) {
                    ac acVar = kcVar11.f5383c1;
                    if (!acVar.O1) {
                        acVar.clearFocus();
                        if (num3.intValue() == 5) {
                            kcVar11.X();
                            return;
                        } else if (num3.intValue() == 0) {
                            kcVar11.l0(0, false, true);
                            mb mbVar2 = kcVar11.f5443v1;
                            if (mbVar2 != null) {
                                mbVar2.M0 = false;
                                mbVar2.R0(0);
                                mbVar2.D0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            kcVar11.l0(0, false, true);
                            mb mbVar3 = kcVar11.f5443v1;
                            if (mbVar3 != null) {
                                mbVar3.R0(2);
                                mbVar3.f5767l2 = true;
                                mbVar3.o0(true);
                                kcVar11.f5443v1.M0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            kcVar11.u();
                            kcVar11.H();
                            mb mbVar4 = kcVar11.f5443v1;
                            if (mbVar4 != null) {
                                mbVar4.R0(1);
                                mbVar4.A0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            kcVar11.l0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            kcVar11.l0(3, false, true);
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
                kc kcVar12 = this.f5141b;
                FrameLayout frameLayout = kcVar12.Y0;
                if (frameLayout != null) {
                    if (kcVar12.f5396g0 == 2) {
                        dp = AndroidUtilities.dp(68.0f);
                    } else {
                        dp = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + kcVar12.f5383c1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(dp);
                }
                bb bbVar2 = kcVar12.f5386d1;
                if (bbVar2 != null) {
                    int i16 = -(AndroidUtilities.dp(24.0f) + kcVar12.f5383c1.getEditTextHeight());
                    vc vcVar2 = kcVar12.Z0;
                    if (vcVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = vcVar2.getContentHeight() - AndroidUtilities.dp(5.0f);
                    }
                    bbVar2.setTranslationY(i16 - contentHeight);
                }
                org.telegram.ui.Components.rc rcVar2 = org.telegram.ui.Components.rc.f30419w;
                if (rcVar2 != null && rcVar2.f30420a == 2) {
                    rcVar2.l();
                }
                if (kcVar12.f5383c1.f5529p0 && (bbVar = kcVar12.f5386d1) != null) {
                    bbVar.c(false, true);
                    return;
                }
                return;
            case 14:
                ca caVar = (ca) obj;
                kc kcVar13 = this.f5141b;
                k8 k8Var4 = kcVar13.K1;
                if (k8Var4 != null) {
                    k8Var4.E0 = caVar;
                }
                ArrayList arrayList3 = kcVar13.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj2 = arrayList3.get(i17);
                        i17++;
                        ((k8) obj2).E0 = caVar;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                kc kcVar14 = this.f5141b;
                k8 k8Var5 = kcVar14.K1;
                if (k8Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    k8Var5.f5354v0 = inputPeer;
                    ArrayList arrayList4 = kcVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj3 = arrayList4.get(i18);
                            i18++;
                            ((k8) obj3).f5354v0 = kcVar14.K1.f5354v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                kc kcVar15 = this.f5141b;
                k8 k8Var6 = kcVar15.K1;
                if (k8Var6 != null) {
                    k8Var6.f5356w0 = hashSet;
                    ArrayList arrayList5 = kcVar15.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj4 = arrayList5.get(i19);
                            i19++;
                            ((k8) obj4).f5356w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                kc kcVar16 = this.f5141b;
                k8 k8Var7 = kcVar16.K1;
                if (k8Var7 != null) {
                    Bitmap bitmap3 = k8Var7.f5327g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    kcVar16.K1.f5327g0 = bitmap2;
                    ea eaVar2 = kcVar16.f5425q0;
                    if (eaVar2 != null) {
                        eaVar2.n1(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.f5141b.f5454y0 = (ca) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                kc kcVar17 = this.f5141b;
                d8 d8Var2 = kcVar17.f5419o0;
                kcVar17.f5450x0 = inputPeer2;
                d8Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                kc kcVar18 = this.f5141b;
                d8 d8Var3 = kcVar18.f5419o0;
                kcVar18.f5450x0 = inputPeer3;
                d8Var3.set(inputPeer3);
                return;
            default:
                x2 x2Var2 = this.f5141b.f5432s;
                float floatValue = ((Float) obj).floatValue();
                x2Var2.f6277o = floatValue;
                x2Var2.f6276n = x2.f(floatValue);
                x2Var2.g();
                return;
        }
    }
}
