package di;

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
public final class la implements Utilities.Callback {
    public final int f7577a;
    public final pc f7578b;

    public la(pc pcVar, int i10) {
        this.f7577a = i10;
        this.f7578b = pcVar;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        float f7;
        zc zcVar;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        fb fbVar;
        int contentHeight;
        float dp;
        switch (this.f7577a) {
            case 0:
                y2 y2Var = this.f7578b.f7899s;
                y2Var.f8461p = ((Float) obj).floatValue();
                y2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                pc pcVar = this.f7578b;
                o8 o8Var = pcVar.K1;
                if (o8Var != null) {
                    AndroidUtilities.recycleBitmap(o8Var.f7757g0);
                    pcVar.K1.f7757g0 = bitmap;
                    ia iaVar = pcVar.f7892q0;
                    if (iaVar != null) {
                        iaVar.n1(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                o8 o8Var2 = (o8) obj;
                pc pcVar2 = this.f7578b;
                pcVar2.W(o8Var2, false);
                int i11 = pcVar2.f7848c;
                bi.u8 storiesController = MessagesController.getInstance(i11).getStoriesController();
                a0.i iVar = storiesController.f3808e;
                int i12 = storiesController.f3805a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f3810g;
                bi.t8 t8Var = new bi.t8(storiesController, o8Var2);
                boolean z14 = o8Var2.f7756g;
                long j3 = t8Var.J;
                if (z14) {
                    HashMap hashMap = (HashMap) iVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        iVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(o8Var2.f7754f), t8Var);
                } else {
                    storiesController.d(j3, t8Var, storiesController.f3806b, false);
                }
                storiesController.d(j3, t8Var, storiesController.f3807c, true);
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
                t8Var.d();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (o8Var2.f7746c && !o8Var2.f7756g) {
                    MessagesController.getInstance(i11).getStoriesController().f3824w.b(o8Var2);
                }
                if (o8Var2.f7753e1 != 0) {
                    ConnectionsManager.getInstance(o8Var2.f7740a).cancelRequest(o8Var2.f7753e1, true);
                    return;
                }
                return;
            case 3:
                f7 f7Var = (f7) obj;
                pc pcVar3 = this.f7578b;
                if (pcVar3.C0 != null) {
                    w7 w7Var = pcVar3.D0;
                    f7 f7Var2 = null;
                    if (f7Var == null) {
                        str = null;
                    } else {
                        str = f7Var.f7234a;
                    }
                    w7Var.setLink(str);
                    cc ccVar = pcVar3.A0;
                    if (ccVar != null) {
                        g7 g7Var = ccVar.f7123c;
                        if (pcVar3.D0.f8344y) {
                            f7Var2 = pcVar3.C0.d;
                        }
                        g7Var.b(f7Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                o8 o8Var3 = this.f7578b.K1;
                if (o8Var3 != null) {
                    o8Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                pc pcVar4 = this.f7578b;
                bi.b bVar = pcVar4.f7841a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.lb(pcVar4.f7844b, new c9(1)).f28128a;
                WindowManager.LayoutParams layout = kbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = pcVar4.f7895r.getWidth();
                    layout.y = (int) (pcVar4.f7895r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.lb lbVar = kbVar.f27795a;
                    lbVar.getWindow().setAttributes(lbVar.f28129b);
                }
                kbVar.setTouchable(true);
                new org.telegram.ui.Components.yc(kbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.j6.gc, 0, new ka(pcVar4, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                pc pcVar5 = this.f7578b;
                if (booleanValue && (zcVar = pcVar5.Z0) != null && zcVar.P) {
                    zcVar.P = false;
                    if (zcVar.E && zcVar.h == null) {
                        zcVar.G = true;
                        tc tcVar = zcVar.f8535a;
                        if (tcVar != null) {
                            tcVar.J(true);
                        }
                    }
                }
                pcVar5.X0.x(2, bool.booleanValue());
                pcVar5.Y0.clearAnimation();
                ViewPropertyAnimator animate = pcVar5.Y0.animate();
                if (bool.booleanValue()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(120L).start();
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29671w;
                if (qcVar != null && qcVar.f29672a == 2) {
                    qcVar.l();
                    return;
                }
                return;
            case 7:
                pc pcVar6 = this.f7578b;
                pcVar6.l();
                pcVar6.m();
                pcVar6.i((Runnable) obj);
                return;
            case 8:
                t tVar = (t) obj;
                pc pcVar7 = this.f7578b;
                cc ccVar2 = pcVar7.A0;
                pcVar7.f7924z0 = tVar;
                ccVar2.o(tVar);
                pcVar7.I0.setSelected(tVar);
                sb sbVar = pcVar7.B0;
                if (sbVar != null) {
                    sbVar.recordHevc = !pcVar7.A0.j();
                }
                pcVar7.G0.setDrawable(new u(tVar, false));
                pcVar7.c0(pcVar7.H0, pcVar7.I0.f8443e, true);
                l7 l7Var = pcVar7.O0;
                if (pcVar7.A0.j()) {
                    f10 = pcVar7.A0.getFilledProgress();
                } else {
                    f10 = 0.0f;
                }
                l7Var.e(f10, true);
                ob obVar = pcVar7.M0;
                if (obVar != null) {
                    obVar.setMultipleOnClick(pcVar7.A0.j());
                    pcVar7.M0.setMaxCount(Math.min(10, t.b() - pcVar7.A0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                pc pcVar8 = this.f7578b;
                pcVar8.O = true;
                pcVar8.q(true);
                AndroidUtilities.runOnUIThread(new ab(0, (Utilities.Callback) obj), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                pc pcVar9 = this.f7578b;
                if (!pcVar9.P1 && !pcVar9.Q1) {
                    int intValue2 = num2.intValue();
                    pcVar9.O1 = intValue2;
                    h8 h8Var = pcVar9.f7886o0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h8Var.a(z11, true);
                    if (pcVar9.O1 == 1 && !pcVar9.I0.f8443e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    pcVar9.i0(z12, true);
                    pcVar9.Q0.a(num2.intValue());
                    l7 l7Var2 = pcVar9.O0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    l7Var2.f7552n0 = -1.0f;
                    l7Var2.f7553o0 = z13;
                    l7Var2.invalidate();
                    if (num2.intValue() == -1) {
                        sb sbVar2 = pcVar9.B0;
                        if (sbVar2 != null && sbVar2.isDual()) {
                            pcVar9.B0.toggleDual();
                        }
                        f4 f4Var = pcVar9.l1;
                        if (f4Var != null) {
                            f4Var.e(true);
                        }
                        f4 f4Var2 = pcVar9.f7880m1;
                        if (f4Var2 != null) {
                            f4Var2.e(true);
                        }
                        f4 f4Var3 = pcVar9.W0;
                        if (f4Var3 != null) {
                            f4Var3.e(true);
                        }
                        pcVar9.A0.o(null);
                        pcVar9.A0.e();
                        pcVar9.I0.setSelected((t) null);
                        sb sbVar3 = pcVar9.B0;
                        if (sbVar3 != null) {
                            sbVar3.recordHevc = !pcVar9.A0.j();
                        }
                    }
                    pcVar9.I0.a(false, true);
                    pcVar9.m0(true);
                    return;
                }
                return;
            case 11:
                Float f11 = (Float) obj;
                pc pcVar10 = this.f7578b;
                l7 l7Var3 = pcVar10.O0;
                l7Var3.f7552n0 = f11.floatValue();
                l7Var3.invalidate();
                l7 l7Var4 = pcVar10.O0;
                int i15 = 8;
                if (f11.floatValue() <= -1.0f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                l7Var4.setVisibility(i10);
                pcVar10.O0.setAlpha(Utilities.clamp01(f11.floatValue() + 1.0f));
                d dVar = pcVar10.P0;
                if (f11.floatValue() < 0.0f) {
                    i15 = 0;
                }
                dVar.setVisibility(i15);
                pcVar10.P0.setAlpha(AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f));
                pcVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                pcVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                pcVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                if (f11.floatValue() < 0.0f) {
                    pcVar10.f(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                pc pcVar11 = this.f7578b;
                if (pcVar11.K1 != null) {
                    fc fcVar = pcVar11.f7850c1;
                    if (!fcVar.O1) {
                        fcVar.clearFocus();
                        if (num3.intValue() == 5) {
                            pcVar11.X();
                            return;
                        } else if (num3.intValue() == 0) {
                            pcVar11.l0(0, false, true);
                            rb rbVar = pcVar11.f7910v1;
                            if (rbVar != null) {
                                rbVar.M0 = false;
                                rbVar.R0(0);
                                rbVar.D0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            pcVar11.l0(0, false, true);
                            rb rbVar2 = pcVar11.f7910v1;
                            if (rbVar2 != null) {
                                rbVar2.R0(2);
                                rbVar2.f7974l2 = true;
                                rbVar2.o0(true);
                                pcVar11.f7910v1.M0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            pcVar11.u();
                            pcVar11.H();
                            rb rbVar3 = pcVar11.f7910v1;
                            if (rbVar3 != null) {
                                rbVar3.R0(1);
                                rbVar3.A0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            pcVar11.l0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            pcVar11.l0(3, false, true);
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
                pc pcVar12 = this.f7578b;
                FrameLayout frameLayout = pcVar12.Y0;
                if (frameLayout != null) {
                    if (pcVar12.f7863g0 == 2) {
                        dp = AndroidUtilities.dp(68.0f);
                    } else {
                        dp = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + pcVar12.f7850c1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(dp);
                }
                fb fbVar2 = pcVar12.f7853d1;
                if (fbVar2 != null) {
                    int i16 = -(AndroidUtilities.dp(24.0f) + pcVar12.f7850c1.getEditTextHeight());
                    zc zcVar2 = pcVar12.Z0;
                    if (zcVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = zcVar2.getContentHeight() - AndroidUtilities.dp(5.0f);
                    }
                    fbVar2.setTranslationY(i16 - contentHeight);
                }
                org.telegram.ui.Components.qc qcVar2 = org.telegram.ui.Components.qc.f29671w;
                if (qcVar2 != null && qcVar2.f29672a == 2) {
                    qcVar2.l();
                }
                if (pcVar12.f7850c1.f7604p0 && (fbVar = pcVar12.f7853d1) != null) {
                    fbVar.c(false, true);
                    return;
                }
                return;
            case 14:
                ga gaVar = (ga) obj;
                pc pcVar13 = this.f7578b;
                o8 o8Var4 = pcVar13.K1;
                if (o8Var4 != null) {
                    o8Var4.E0 = gaVar;
                }
                ArrayList arrayList3 = pcVar13.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj2 = arrayList3.get(i17);
                        i17++;
                        ((o8) obj2).E0 = gaVar;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                pc pcVar14 = this.f7578b;
                o8 o8Var5 = pcVar14.K1;
                if (o8Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    o8Var5.f7784v0 = inputPeer;
                    ArrayList arrayList4 = pcVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj3 = arrayList4.get(i18);
                            i18++;
                            ((o8) obj3).f7784v0 = pcVar14.K1.f7784v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                pc pcVar15 = this.f7578b;
                o8 o8Var6 = pcVar15.K1;
                if (o8Var6 != null) {
                    o8Var6.f7786w0 = hashSet;
                    ArrayList arrayList5 = pcVar15.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj4 = arrayList5.get(i19);
                            i19++;
                            ((o8) obj4).f7786w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                pc pcVar16 = this.f7578b;
                o8 o8Var7 = pcVar16.K1;
                if (o8Var7 != null) {
                    Bitmap bitmap3 = o8Var7.f7757g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    pcVar16.K1.f7757g0 = bitmap2;
                    ia iaVar2 = pcVar16.f7892q0;
                    if (iaVar2 != null) {
                        iaVar2.n1(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.f7578b.f7921y0 = (ga) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                pc pcVar17 = this.f7578b;
                h8 h8Var2 = pcVar17.f7886o0;
                pcVar17.f7917x0 = inputPeer2;
                h8Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                pc pcVar18 = this.f7578b;
                h8 h8Var3 = pcVar18.f7886o0;
                pcVar18.f7917x0 = inputPeer3;
                h8Var3.set(inputPeer3);
                return;
            default:
                y2 y2Var2 = this.f7578b.f7899s;
                float floatValue = ((Float) obj).floatValue();
                y2Var2.f8460o = floatValue;
                y2Var2.f8459n = y2.f(floatValue);
                y2Var2.g();
                return;
        }
    }
}
