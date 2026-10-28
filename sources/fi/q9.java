package fi;

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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wc;
public final class q9 implements Utilities.Callback {
    public final int f11501a;
    public final sb f11502b;

    public q9(sb sbVar, int i10) {
        this.f11501a = i10;
        this.f11502b = sbVar;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        float f7;
        cc ccVar;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        ia iaVar;
        int contentHeight;
        float dp;
        switch (this.f11501a) {
            case 0:
                q2 q2Var = this.f11502b.f11661s;
                q2Var.f11476p = ((Float) obj).floatValue();
                q2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                sb sbVar = this.f11502b;
                w7 w7Var = sbVar.K1;
                if (w7Var != null) {
                    AndroidUtilities.recycleBitmap(w7Var.f11903g0);
                    sbVar.K1.f11903g0 = bitmap;
                    n9 n9Var = sbVar.f11654q0;
                    if (n9Var != null) {
                        n9Var.o1(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                w7 w7Var2 = (w7) obj;
                sb sbVar2 = this.f11502b;
                sbVar2.V(w7Var2, false);
                int i11 = sbVar2.f11611c;
                di.h7 storiesController = MessagesController.getInstance(i11).getStoriesController();
                a0.h hVar = storiesController.e;
                int i12 = storiesController.f8629a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f8633g;
                di.g7 g7Var = new di.g7(storiesController, w7Var2);
                boolean z14 = w7Var2.f11902g;
                long j10 = g7Var.J;
                if (z14) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(w7Var2.f11900f), g7Var);
                } else {
                    storiesController.d(j10, g7Var, storiesController.f8630b, false);
                }
                storiesController.d(j10, g7Var, storiesController.f8631c, true);
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
                        storiesController.e0(j10, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        storiesController.R(j10);
                    }
                }
                g7Var.d();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (w7Var2.f11893c && !w7Var2.f11902g) {
                    MessagesController.getInstance(i11).getStoriesController().f8647w.b(w7Var2);
                }
                if (w7Var2.f11899e1 != 0) {
                    ConnectionsManager.getInstance(w7Var2.f11887a).cancelRequest(w7Var2.f11899e1, true);
                    return;
                }
                return;
            case 3:
                q6 q6Var = (q6) obj;
                sb sbVar3 = this.f11502b;
                if (sbVar3.C0 != null) {
                    g7 g7Var2 = sbVar3.D0;
                    q6 q6Var2 = null;
                    if (q6Var == null) {
                        str = null;
                    } else {
                        str = q6Var.f11485a;
                    }
                    g7Var2.setLink(str);
                    fb fbVar = sbVar3.A0;
                    if (fbVar != null) {
                        r6 r6Var = fbVar.f10745c;
                        if (sbVar3.D0.f10916y) {
                            q6Var2 = sbVar3.C0.d;
                        }
                        r6Var.a(q6Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                w7 w7Var3 = this.f11502b.K1;
                if (w7Var3 != null) {
                    w7Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                sb sbVar4 = this.f11502b;
                di.b bVar = sbVar4.f11604a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.lb(sbVar4.f11607b, new k8(1)).f30218a;
                WindowManager.LayoutParams layout = kbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = sbVar4.f11657r.getWidth();
                    layout.y = (int) (sbVar4.f11657r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.lb lbVar = kbVar.f29921a;
                    lbVar.getWindow().setAttributes(lbVar.f30219b);
                }
                kbVar.setTouchable(true);
                new wc(kbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.y6.gc, 0, new p9(sbVar4, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                sb sbVar5 = this.f11502b;
                if (booleanValue && (ccVar = sbVar5.Z0) != null && ccVar.P) {
                    ccVar.P = false;
                    if (ccVar.E && ccVar.h == null) {
                        ccVar.G = true;
                        wb wbVar = ccVar.f10621a;
                        if (wbVar != null) {
                            wbVar.A(true);
                        }
                    }
                }
                sbVar5.X0.x(2, bool.booleanValue());
                sbVar5.Y0.clearAnimation();
                ViewPropertyAnimator animate = sbVar5.Y0.animate();
                if (bool.booleanValue()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                wh.p(animate, f7, 120L);
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31854x;
                if (qcVar != null && qcVar.f31855a == 2) {
                    qcVar.l();
                    return;
                }
                return;
            case 7:
                sb sbVar6 = this.f11502b;
                sbVar6.k();
                sbVar6.l();
                sbVar6.h((Runnable) obj);
                return;
            case 8:
                t tVar = (t) obj;
                sb sbVar7 = this.f11502b;
                fb fbVar2 = sbVar7.A0;
                sbVar7.f11686z0 = tVar;
                fbVar2.o(tVar);
                sbVar7.I0.setSelected(tVar);
                va vaVar = sbVar7.B0;
                if (vaVar != null) {
                    vaVar.recordHevc = !sbVar7.A0.j();
                }
                sbVar7.G0.setDrawable(new u(tVar, false));
                sbVar7.b0(sbVar7.H0, sbVar7.I0.e, true);
                w6 w6Var = sbVar7.O0;
                if (sbVar7.A0.j()) {
                    f10 = sbVar7.A0.getFilledProgress();
                } else {
                    f10 = 0.0f;
                }
                w6Var.e(f10, true);
                qa qaVar = sbVar7.M0;
                if (qaVar != null) {
                    qaVar.setMultipleOnClick(sbVar7.A0.j());
                    sbVar7.M0.setMaxCount(Math.min(10, t.b() - sbVar7.A0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                sb sbVar8 = this.f11502b;
                sbVar8.O = true;
                sbVar8.p(true);
                AndroidUtilities.runOnUIThread(new ea(0, (Utilities.Callback) obj), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                sb sbVar9 = this.f11502b;
                if (!sbVar9.P1 && !sbVar9.Q1) {
                    int intValue2 = num2.intValue();
                    sbVar9.O1 = intValue2;
                    p7 p7Var = sbVar9.f11648o0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p7Var.a(z11, true);
                    if (sbVar9.O1 == 1 && !sbVar9.I0.e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    sbVar9.h0(z12, true);
                    sbVar9.Q0.a(num2.intValue());
                    w6 w6Var2 = sbVar9.O0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    w6Var2.f11869n0 = -1.0f;
                    w6Var2.f11870o0 = z13;
                    w6Var2.invalidate();
                    if (num2.intValue() == -1) {
                        va vaVar2 = sbVar9.B0;
                        if (vaVar2 != null && vaVar2.isDual()) {
                            sbVar9.B0.toggleDual();
                        }
                        v3 v3Var = sbVar9.l1;
                        if (v3Var != null) {
                            v3Var.e(true);
                        }
                        v3 v3Var2 = sbVar9.f11642m1;
                        if (v3Var2 != null) {
                            v3Var2.e(true);
                        }
                        v3 v3Var3 = sbVar9.W0;
                        if (v3Var3 != null) {
                            v3Var3.e(true);
                        }
                        sbVar9.A0.o(null);
                        sbVar9.A0.e();
                        sbVar9.I0.setSelected((t) null);
                        va vaVar3 = sbVar9.B0;
                        if (vaVar3 != null) {
                            vaVar3.recordHevc = !sbVar9.A0.j();
                        }
                    }
                    sbVar9.I0.a(false, true);
                    sbVar9.l0(true);
                    return;
                }
                return;
            case 11:
                Float f11 = (Float) obj;
                sb sbVar10 = this.f11502b;
                w6 w6Var3 = sbVar10.O0;
                w6Var3.f11869n0 = f11.floatValue();
                w6Var3.invalidate();
                w6 w6Var4 = sbVar10.O0;
                int i15 = 8;
                if (f11.floatValue() <= -1.0f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                w6Var4.setVisibility(i10);
                sbVar10.O0.setAlpha(Utilities.clamp01(f11.floatValue() + 1.0f));
                d dVar = sbVar10.P0;
                if (f11.floatValue() < 0.0f) {
                    i15 = 0;
                }
                dVar.setVisibility(i15);
                sbVar10.P0.setAlpha(AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f));
                sbVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                sbVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                sbVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                if (f11.floatValue() < 0.0f) {
                    sbVar10.e(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                sb sbVar11 = this.f11502b;
                if (sbVar11.K1 != null) {
                    ib ibVar = sbVar11.f11613c1;
                    if (!ibVar.O1) {
                        ibVar.clearFocus();
                        if (num3.intValue() == 5) {
                            sbVar11.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            sbVar11.k0(0, false, true);
                            ta taVar = sbVar11.f11672v1;
                            if (taVar != null) {
                                taVar.B0 = false;
                                taVar.O0(0);
                                taVar.A0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            sbVar11.k0(0, false, true);
                            ta taVar2 = sbVar11.f11672v1;
                            if (taVar2 != null) {
                                taVar2.O0(2);
                                taVar2.a2 = true;
                                taVar2.l0(true);
                                sbVar11.f11672v1.B0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            sbVar11.t();
                            sbVar11.G();
                            ta taVar3 = sbVar11.f11672v1;
                            if (taVar3 != null) {
                                taVar3.O0(1);
                                taVar3.x0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            sbVar11.k0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            sbVar11.k0(3, false, true);
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
                sb sbVar12 = this.f11502b;
                FrameLayout frameLayout = sbVar12.Y0;
                if (frameLayout != null) {
                    if (sbVar12.f11625g0 == 2) {
                        dp = AndroidUtilities.dp(68.0f);
                    } else {
                        dp = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + sbVar12.f11613c1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(dp);
                }
                ia iaVar2 = sbVar12.f11616d1;
                if (iaVar2 != null) {
                    int i16 = -(AndroidUtilities.dp(24.0f) + sbVar12.f11613c1.getEditTextHeight());
                    cc ccVar2 = sbVar12.Z0;
                    if (ccVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = ccVar2.getContentHeight() - AndroidUtilities.dp(5.0f);
                    }
                    iaVar2.setTranslationY(i16 - contentHeight);
                }
                org.telegram.ui.Components.qc qcVar2 = org.telegram.ui.Components.qc.f31854x;
                if (qcVar2 != null && qcVar2.f31855a == 2) {
                    qcVar2.l();
                }
                if (sbVar12.f11613c1.f11209p0 && (iaVar = sbVar12.f11616d1) != null) {
                    iaVar.c(false, true);
                    return;
                }
                return;
            case 14:
                l9 l9Var = (l9) obj;
                sb sbVar13 = this.f11502b;
                w7 w7Var4 = sbVar13.K1;
                if (w7Var4 != null) {
                    w7Var4.E0 = l9Var;
                }
                ArrayList arrayList3 = sbVar13.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj2 = arrayList3.get(i17);
                        i17++;
                        ((w7) obj2).E0 = l9Var;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                sb sbVar14 = this.f11502b;
                w7 w7Var5 = sbVar14.K1;
                if (w7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    w7Var5.f11930v0 = inputPeer;
                    ArrayList arrayList4 = sbVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj3 = arrayList4.get(i18);
                            i18++;
                            ((w7) obj3).f11930v0 = sbVar14.K1.f11930v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                sb sbVar15 = this.f11502b;
                w7 w7Var6 = sbVar15.K1;
                if (w7Var6 != null) {
                    w7Var6.f11932w0 = hashSet;
                    ArrayList arrayList5 = sbVar15.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj4 = arrayList5.get(i19);
                            i19++;
                            ((w7) obj4).f11932w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                sb sbVar16 = this.f11502b;
                w7 w7Var7 = sbVar16.K1;
                if (w7Var7 != null) {
                    Bitmap bitmap3 = w7Var7.f11903g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    sbVar16.K1.f11903g0 = bitmap2;
                    n9 n9Var2 = sbVar16.f11654q0;
                    if (n9Var2 != null) {
                        n9Var2.o1(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.f11502b.f11683y0 = (l9) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                sb sbVar17 = this.f11502b;
                p7 p7Var2 = sbVar17.f11648o0;
                sbVar17.f11679x0 = inputPeer2;
                p7Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                sb sbVar18 = this.f11502b;
                p7 p7Var3 = sbVar18.f11648o0;
                sbVar18.f11679x0 = inputPeer3;
                p7Var3.set(inputPeer3);
                return;
            default:
                q2 q2Var2 = this.f11502b.f11661s;
                float floatValue = ((Float) obj).floatValue();
                q2Var2.f11475o = floatValue;
                q2Var2.f11474n = q2.f(floatValue);
                q2Var2.g();
                return;
        }
    }
}
