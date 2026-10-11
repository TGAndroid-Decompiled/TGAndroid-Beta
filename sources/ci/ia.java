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
import org.telegram.messenger.ai;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ia implements Utilities.Callback {
    public final int f5208a;
    public final lc f5209b;

    public ia(lc lcVar, int i10) {
        this.f5208a = i10;
        this.f5209b = lcVar;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        float f7;
        wc wcVar;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        cb cbVar;
        int contentHeight;
        float dp;
        switch (this.f5208a) {
            case 0:
                w2 w2Var = this.f5209b.f5515s;
                w2Var.f6195p = ((Float) obj).floatValue();
                w2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                lc lcVar = this.f5209b;
                l8 l8Var = lcVar.K1;
                if (l8Var != null) {
                    AndroidUtilities.recycleBitmap(l8Var.f5410g0);
                    lcVar.K1.f5410g0 = bitmap;
                    fa faVar = lcVar.f5508q0;
                    if (faVar != null) {
                        faVar.o1(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                l8 l8Var2 = (l8) obj;
                lc lcVar2 = this.f5209b;
                lcVar2.V(l8Var2, false);
                int i11 = lcVar2.f5464c;
                ai.m9 storiesController = MessagesController.getInstance(i11).getStoriesController();
                a0.i iVar = storiesController.f1409e;
                int i12 = storiesController.f1406a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f1411g;
                ai.l9 l9Var = new ai.l9(storiesController, l8Var2);
                boolean z14 = l8Var2.f5409g;
                long j3 = l9Var.J;
                if (z14) {
                    HashMap hashMap = (HashMap) iVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        iVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(l8Var2.f5407f), l9Var);
                } else {
                    storiesController.d(j3, l9Var, storiesController.f1407b, false);
                }
                storiesController.d(j3, l9Var, storiesController.f1408c, true);
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
                l9Var.d();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (l8Var2.f5399c && !l8Var2.f5409g) {
                    MessagesController.getInstance(i11).getStoriesController().f1425w.b(l8Var2);
                }
                if (l8Var2.f5406e1 != 0) {
                    ConnectionsManager.getInstance(l8Var2.f5393a).cancelRequest(l8Var2.f5406e1, true);
                    return;
                }
                return;
            case 3:
                d7 d7Var = (d7) obj;
                lc lcVar3 = this.f5209b;
                if (lcVar3.C0 != null) {
                    t7 t7Var = lcVar3.D0;
                    d7 d7Var2 = null;
                    if (d7Var == null) {
                        str = null;
                    } else {
                        str = d7Var.f4942a;
                    }
                    t7Var.setLink(str);
                    yb ybVar = lcVar3.A0;
                    if (ybVar != null) {
                        e7 e7Var = ybVar.f4992c;
                        if (lcVar3.D0.f6019y) {
                            d7Var2 = lcVar3.C0.d;
                        }
                        e7Var.b(d7Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                l8 l8Var3 = this.f5209b.K1;
                if (l8Var3 != null) {
                    l8Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                lc lcVar4 = this.f5209b;
                ai.d dVar = lcVar4.f5457a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.nb(lcVar4.f5460b, new a9(1)).f29140a;
                WindowManager.LayoutParams layout = mbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = lcVar4.f5511r.getWidth();
                    layout.y = (int) (lcVar4.f5511r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.nb nbVar = mbVar.f28828a;
                    nbVar.getWindow().setAttributes(nbVar.f29141b);
                }
                mbVar.setTouchable(true);
                new org.telegram.ui.Components.ad(mbVar, dVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.h6.gc, 0, new ha(lcVar4, 27), dVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                lc lcVar5 = this.f5209b;
                if (booleanValue && (wcVar = lcVar5.Z0) != null && wcVar.P) {
                    wcVar.P = false;
                    if (wcVar.E && wcVar.h == null) {
                        wcVar.G = true;
                        pc pcVar = wcVar.f6226a;
                        if (pcVar != null) {
                            pcVar.C(true);
                        }
                    }
                }
                lcVar5.X0.x(2, bool.booleanValue());
                lcVar5.Y0.clearAnimation();
                ViewPropertyAnimator animate = lcVar5.Y0.animate();
                if (bool.booleanValue()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                ai.s(animate, f7, 120L);
                org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30825w;
                if (scVar != null && scVar.f30826a == 2) {
                    scVar.l();
                    return;
                }
                return;
            case 7:
                lc lcVar6 = this.f5209b;
                lcVar6.k();
                lcVar6.l();
                lcVar6.h((Runnable) obj);
                return;
            case 8:
                t tVar = (t) obj;
                lc lcVar7 = this.f5209b;
                yb ybVar2 = lcVar7.A0;
                lcVar7.f5540z0 = tVar;
                ybVar2.o(tVar);
                lcVar7.I0.setSelected(tVar);
                ob obVar = lcVar7.B0;
                if (obVar != null) {
                    obVar.recordHevc = !lcVar7.A0.j();
                }
                lcVar7.G0.setDrawable(new u(tVar, false));
                lcVar7.b0(lcVar7.H0, lcVar7.I0.f6335e, true);
                j7 j7Var = lcVar7.O0;
                if (lcVar7.A0.j()) {
                    f10 = lcVar7.A0.getFilledProgress();
                } else {
                    f10 = 0.0f;
                }
                j7Var.e(f10, true);
                kb kbVar = lcVar7.M0;
                if (kbVar != null) {
                    kbVar.setMultipleOnClick(lcVar7.A0.j());
                    lcVar7.M0.setMaxCount(Math.min(10, t.b() - lcVar7.A0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                lc lcVar8 = this.f5209b;
                lcVar8.O = true;
                lcVar8.p(true);
                AndroidUtilities.runOnUIThread(new xa(0, (Utilities.Callback) obj), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                lc lcVar9 = this.f5209b;
                if (!lcVar9.P1 && !lcVar9.Q1) {
                    int intValue2 = num2.intValue();
                    lcVar9.O1 = intValue2;
                    e8 e8Var = lcVar9.f5502o0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e8Var.a(z11, true);
                    if (lcVar9.O1 == 1 && !lcVar9.I0.f6335e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    lcVar9.h0(z12, true);
                    lcVar9.Q0.a(num2.intValue());
                    j7 j7Var2 = lcVar9.O0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    j7Var2.f5267n0 = -1.0f;
                    j7Var2.f5268o0 = z13;
                    j7Var2.invalidate();
                    if (num2.intValue() == -1) {
                        ob obVar2 = lcVar9.B0;
                        if (obVar2 != null && obVar2.isDual()) {
                            lcVar9.B0.toggleDual();
                        }
                        d4 d4Var = lcVar9.l1;
                        if (d4Var != null) {
                            d4Var.e(true);
                        }
                        d4 d4Var2 = lcVar9.f5496m1;
                        if (d4Var2 != null) {
                            d4Var2.e(true);
                        }
                        d4 d4Var3 = lcVar9.W0;
                        if (d4Var3 != null) {
                            d4Var3.e(true);
                        }
                        lcVar9.A0.o(null);
                        lcVar9.A0.e();
                        lcVar9.I0.setSelected((t) null);
                        ob obVar3 = lcVar9.B0;
                        if (obVar3 != null) {
                            obVar3.recordHevc = !lcVar9.A0.j();
                        }
                    }
                    lcVar9.I0.a(false, true);
                    lcVar9.l0(true);
                    return;
                }
                return;
            case 11:
                Float f11 = (Float) obj;
                lc lcVar10 = this.f5209b;
                j7 j7Var3 = lcVar10.O0;
                j7Var3.f5267n0 = f11.floatValue();
                j7Var3.invalidate();
                j7 j7Var4 = lcVar10.O0;
                int i15 = 8;
                if (f11.floatValue() <= -1.0f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                j7Var4.setVisibility(i10);
                lcVar10.O0.setAlpha(Utilities.clamp01(f11.floatValue() + 1.0f));
                d dVar2 = lcVar10.P0;
                if (f11.floatValue() < 0.0f) {
                    i15 = 0;
                }
                dVar2.setVisibility(i15);
                lcVar10.P0.setAlpha(AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f));
                lcVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                lcVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                lcVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                if (f11.floatValue() < 0.0f) {
                    lcVar10.e(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                lc lcVar11 = this.f5209b;
                if (lcVar11.K1 != null) {
                    bc bcVar = lcVar11.f5466c1;
                    if (!bcVar.O1) {
                        bcVar.clearFocus();
                        if (num3.intValue() == 5) {
                            lcVar11.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            lcVar11.k0(0, false, true);
                            nb nbVar2 = lcVar11.f5526v1;
                            if (nbVar2 != null) {
                                nbVar2.M0 = false;
                                nbVar2.Q0(0);
                                nbVar2.C0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            lcVar11.k0(0, false, true);
                            nb nbVar3 = lcVar11.f5526v1;
                            if (nbVar3 != null) {
                                nbVar3.Q0(2);
                                nbVar3.f5810l2 = true;
                                nbVar3.n0(true);
                                lcVar11.f5526v1.M0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            lcVar11.t();
                            lcVar11.G();
                            nb nbVar4 = lcVar11.f5526v1;
                            if (nbVar4 != null) {
                                nbVar4.Q0(1);
                                nbVar4.z0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            lcVar11.k0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            lcVar11.k0(3, false, true);
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
                lc lcVar12 = this.f5209b;
                FrameLayout frameLayout = lcVar12.Y0;
                if (frameLayout != null) {
                    if (lcVar12.f5479g0 == 2) {
                        dp = AndroidUtilities.dp(68.0f);
                    } else {
                        dp = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + lcVar12.f5466c1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(dp);
                }
                cb cbVar2 = lcVar12.f5469d1;
                if (cbVar2 != null) {
                    int i16 = -(AndroidUtilities.dp(24.0f) + lcVar12.f5466c1.getEditTextHeight());
                    wc wcVar2 = lcVar12.Z0;
                    if (wcVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = wcVar2.getContentHeight() - AndroidUtilities.dp(5.0f);
                    }
                    cbVar2.setTranslationY(i16 - contentHeight);
                }
                org.telegram.ui.Components.sc scVar2 = org.telegram.ui.Components.sc.f30825w;
                if (scVar2 != null && scVar2.f30826a == 2) {
                    scVar2.l();
                }
                if (lcVar12.f5466c1.f5565p0 && (cbVar = lcVar12.f5469d1) != null) {
                    cbVar.c(false, true);
                    return;
                }
                return;
            case 14:
                da daVar = (da) obj;
                lc lcVar13 = this.f5209b;
                l8 l8Var4 = lcVar13.K1;
                if (l8Var4 != null) {
                    l8Var4.E0 = daVar;
                }
                ArrayList arrayList3 = lcVar13.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj2 = arrayList3.get(i17);
                        i17++;
                        ((l8) obj2).E0 = daVar;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                lc lcVar14 = this.f5209b;
                l8 l8Var5 = lcVar14.K1;
                if (l8Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    l8Var5.f5437v0 = inputPeer;
                    ArrayList arrayList4 = lcVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj3 = arrayList4.get(i18);
                            i18++;
                            ((l8) obj3).f5437v0 = lcVar14.K1.f5437v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                lc lcVar15 = this.f5209b;
                l8 l8Var6 = lcVar15.K1;
                if (l8Var6 != null) {
                    l8Var6.f5439w0 = hashSet;
                    ArrayList arrayList5 = lcVar15.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj4 = arrayList5.get(i19);
                            i19++;
                            ((l8) obj4).f5439w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                lc lcVar16 = this.f5209b;
                l8 l8Var7 = lcVar16.K1;
                if (l8Var7 != null) {
                    Bitmap bitmap3 = l8Var7.f5410g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    lcVar16.K1.f5410g0 = bitmap2;
                    fa faVar2 = lcVar16.f5508q0;
                    if (faVar2 != null) {
                        faVar2.o1(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.f5209b.f5537y0 = (da) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                lc lcVar17 = this.f5209b;
                e8 e8Var2 = lcVar17.f5502o0;
                lcVar17.f5533x0 = inputPeer2;
                e8Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                lc lcVar18 = this.f5209b;
                e8 e8Var3 = lcVar18.f5502o0;
                lcVar18.f5533x0 = inputPeer3;
                e8Var3.set(inputPeer3);
                return;
            default:
                w2 w2Var2 = this.f5209b.f5515s;
                float floatValue = ((Float) obj).floatValue();
                w2Var2.f6194o = floatValue;
                w2Var2.f6193n = w2.f(floatValue);
                w2Var2.g();
                return;
        }
    }
}
