package bi;

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
public final class ub implements Utilities.Callback {
    public final int f3737a;
    public final ce f3738b;

    public ub(ce ceVar, int i10) {
        this.f3737a = i10;
        this.f3738b = ceVar;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        float f7;
        me meVar;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        oc ocVar;
        int contentHeight;
        float dp;
        switch (this.f3737a) {
            case 0:
                m3 m3Var = this.f3738b.f2487s;
                m3Var.f3088p = ((Float) obj).floatValue();
                m3Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                ce ceVar = this.f3738b;
                r9 r9Var = ceVar.K1;
                if (r9Var != null) {
                    AndroidUtilities.recycleBitmap(r9Var.f3575g0);
                    ceVar.K1.f3575g0 = bitmap;
                    rb rbVar = ceVar.f2480q0;
                    if (rbVar != null) {
                        rbVar.n1(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                r9 r9Var2 = (r9) obj;
                ce ceVar2 = this.f3738b;
                ceVar2.W(r9Var2, false);
                int i11 = ceVar2.f2437c;
                zh.i5 storiesController = MessagesController.getInstance(i11).getStoriesController();
                a0.i iVar = storiesController.e;
                int i12 = storiesController.f48499a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f48503g;
                zh.h5 h5Var = new zh.h5(storiesController, r9Var2);
                boolean z14 = r9Var2.f3574g;
                long j3 = h5Var.J;
                if (z14) {
                    HashMap hashMap = (HashMap) iVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        iVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(r9Var2.f3572f), h5Var);
                } else {
                    storiesController.d(j3, h5Var, storiesController.f48500b, false);
                }
                storiesController.d(j3, h5Var, storiesController.f48501c, true);
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
                h5Var.d();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (r9Var2.f3565c && !r9Var2.f3574g) {
                    MessagesController.getInstance(i11).getStoriesController().f48517w.b(r9Var2);
                }
                if (r9Var2.f3571e1 != 0) {
                    ConnectionsManager.getInstance(r9Var2.f3559a).cancelRequest(r9Var2.f3571e1, true);
                    return;
                }
                return;
            case 3:
                g8 g8Var = (g8) obj;
                ce ceVar3 = this.f3738b;
                if (ceVar3.C0 != null) {
                    x8 x8Var = ceVar3.D0;
                    g8 g8Var2 = null;
                    if (g8Var == null) {
                        str = null;
                    } else {
                        str = g8Var.f2750a;
                    }
                    x8Var.setLink(str);
                    md mdVar = ceVar3.A0;
                    if (mdVar != null) {
                        h8 h8Var = mdVar.f2908c;
                        if (ceVar3.D0.f3929y) {
                            g8Var2 = ceVar3.C0.d;
                        }
                        h8Var.b(g8Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                r9 r9Var3 = this.f3738b.K1;
                if (r9Var3 != null) {
                    r9Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                ce ceVar4 = this.f3738b;
                zh.b bVar = ceVar4.f2430a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.kb(ceVar4.f2433b, new fa(1)).f24689a;
                WindowManager.LayoutParams layout = jbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = ceVar4.f2483r.getWidth();
                    layout.y = (int) (ceVar4.f2483r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.kb kbVar = jbVar.f24337a;
                    kbVar.getWindow().setAttributes(kbVar.f24690b);
                }
                jbVar.setTouchable(true);
                new org.telegram.ui.Components.wc(jbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.j6.gc, 0, new tb(ceVar4, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ce ceVar5 = this.f3738b;
                if (booleanValue && (meVar = ceVar5.Z0) != null && meVar.P) {
                    meVar.P = false;
                    if (meVar.E && meVar.h == null) {
                        meVar.G = true;
                        ge geVar = meVar.f3148a;
                        if (geVar != null) {
                            geVar.S(true);
                        }
                    }
                }
                ceVar5.X0.x(2, bool.booleanValue());
                ceVar5.Y0.clearAnimation();
                ViewPropertyAnimator animate = ceVar5.Y0.animate();
                if (bool.booleanValue()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(120L).start();
                org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f26074w;
                if (pcVar != null && pcVar.f26075a == 2) {
                    pcVar.l();
                    return;
                }
                return;
            case 7:
                ce ceVar6 = this.f3738b;
                ceVar6.l();
                ceVar6.m();
                ceVar6.i((Runnable) obj);
                return;
            case 8:
                x xVar = (x) obj;
                ce ceVar7 = this.f3738b;
                md mdVar2 = ceVar7.A0;
                ceVar7.f2512z0 = xVar;
                mdVar2.o(xVar);
                ceVar7.I0.setSelected(xVar);
                bd bdVar = ceVar7.B0;
                if (bdVar != null) {
                    bdVar.recordHevc = !ceVar7.A0.j();
                }
                ceVar7.G0.setDrawable(new y(xVar, false));
                ceVar7.c0(ceVar7.H0, ceVar7.I0.e, true);
                m8 m8Var = ceVar7.O0;
                if (ceVar7.A0.j()) {
                    f10 = ceVar7.A0.getFilledProgress();
                } else {
                    f10 = 0.0f;
                }
                m8Var.e(f10, true);
                xc xcVar = ceVar7.M0;
                if (xcVar != null) {
                    xcVar.setMultipleOnClick(ceVar7.A0.j());
                    ceVar7.M0.setMaxCount(Math.min(10, x.b() - ceVar7.A0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                ce ceVar8 = this.f3738b;
                ceVar8.O = true;
                ceVar8.q(true);
                AndroidUtilities.runOnUIThread(new jc(0, (Utilities.Callback) obj), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                ce ceVar9 = this.f3738b;
                if (!ceVar9.P1 && !ceVar9.Q1) {
                    int intValue2 = num2.intValue();
                    ceVar9.O1 = intValue2;
                    j9 j9Var = ceVar9.f2474o0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j9Var.a(z11, true);
                    if (ceVar9.O1 == 1 && !ceVar9.I0.e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ceVar9.i0(z12, true);
                    ceVar9.Q0.a(num2.intValue());
                    m8 m8Var2 = ceVar9.O0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m8Var2.f3121n0 = -1.0f;
                    m8Var2.f3122o0 = z13;
                    m8Var2.invalidate();
                    if (num2.intValue() == -1) {
                        bd bdVar2 = ceVar9.B0;
                        if (bdVar2 != null && bdVar2.isDual()) {
                            ceVar9.B0.toggleDual();
                        }
                        x4 x4Var = ceVar9.l1;
                        if (x4Var != null) {
                            x4Var.e(true);
                        }
                        x4 x4Var2 = ceVar9.f2468m1;
                        if (x4Var2 != null) {
                            x4Var2.e(true);
                        }
                        x4 x4Var3 = ceVar9.W0;
                        if (x4Var3 != null) {
                            x4Var3.e(true);
                        }
                        ceVar9.A0.o(null);
                        ceVar9.A0.e();
                        ceVar9.I0.setSelected((x) null);
                        bd bdVar3 = ceVar9.B0;
                        if (bdVar3 != null) {
                            bdVar3.recordHevc = !ceVar9.A0.j();
                        }
                    }
                    ceVar9.I0.a(false, true);
                    ceVar9.m0(true);
                    return;
                }
                return;
            case 11:
                Float f11 = (Float) obj;
                ce ceVar10 = this.f3738b;
                m8 m8Var3 = ceVar10.O0;
                m8Var3.f3121n0 = f11.floatValue();
                m8Var3.invalidate();
                m8 m8Var4 = ceVar10.O0;
                int i15 = 8;
                if (f11.floatValue() <= -1.0f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                m8Var4.setVisibility(i10);
                ceVar10.O0.setAlpha(Utilities.clamp01(f11.floatValue() + 1.0f));
                d dVar = ceVar10.P0;
                if (f11.floatValue() < 0.0f) {
                    i15 = 0;
                }
                dVar.setVisibility(i15);
                ceVar10.P0.setAlpha(AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f));
                ceVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                ceVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                ceVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                if (f11.floatValue() < 0.0f) {
                    ceVar10.f(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                ce ceVar11 = this.f3738b;
                if (ceVar11.K1 != null) {
                    qd qdVar = ceVar11.f2439c1;
                    if (!qdVar.O1) {
                        qdVar.clearFocus();
                        if (num3.intValue() == 5) {
                            ceVar11.X();
                            return;
                        } else if (num3.intValue() == 0) {
                            ceVar11.l0(0, false, true);
                            ad adVar = ceVar11.f2498v1;
                            if (adVar != null) {
                                adVar.M0 = false;
                                adVar.R0(0);
                                adVar.D0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            ceVar11.l0(0, false, true);
                            ad adVar2 = ceVar11.f2498v1;
                            if (adVar2 != null) {
                                adVar2.R0(2);
                                adVar2.f3521l2 = true;
                                adVar2.o0(true);
                                ceVar11.f2498v1.M0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            ceVar11.u();
                            ceVar11.H();
                            ad adVar3 = ceVar11.f2498v1;
                            if (adVar3 != null) {
                                adVar3.R0(1);
                                adVar3.A0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            ceVar11.l0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            ceVar11.l0(3, false, true);
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
                ce ceVar12 = this.f3738b;
                FrameLayout frameLayout = ceVar12.Y0;
                if (frameLayout != null) {
                    if (ceVar12.f2451g0 == 2) {
                        dp = AndroidUtilities.dp(68.0f);
                    } else {
                        dp = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + ceVar12.f2439c1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(dp);
                }
                oc ocVar2 = ceVar12.f2442d1;
                if (ocVar2 != null) {
                    int i16 = -(AndroidUtilities.dp(24.0f) + ceVar12.f2439c1.getEditTextHeight());
                    me meVar2 = ceVar12.Z0;
                    if (meVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = meVar2.getContentHeight() - AndroidUtilities.dp(5.0f);
                    }
                    ocVar2.setTranslationY(i16 - contentHeight);
                }
                org.telegram.ui.Components.pc pcVar2 = org.telegram.ui.Components.pc.f26074w;
                if (pcVar2 != null && pcVar2.f26075a == 2) {
                    pcVar2.l();
                }
                if (ceVar12.f2439c1.f3279p0 && (ocVar = ceVar12.f2442d1) != null) {
                    ocVar.c(false, true);
                    return;
                }
                return;
            case 14:
                pb pbVar = (pb) obj;
                ce ceVar13 = this.f3738b;
                r9 r9Var4 = ceVar13.K1;
                if (r9Var4 != null) {
                    r9Var4.E0 = pbVar;
                }
                ArrayList arrayList3 = ceVar13.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj2 = arrayList3.get(i17);
                        i17++;
                        ((r9) obj2).E0 = pbVar;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                ce ceVar14 = this.f3738b;
                r9 r9Var5 = ceVar14.K1;
                if (r9Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    r9Var5.f3602v0 = inputPeer;
                    ArrayList arrayList4 = ceVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj3 = arrayList4.get(i18);
                            i18++;
                            ((r9) obj3).f3602v0 = ceVar14.K1.f3602v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                ce ceVar15 = this.f3738b;
                r9 r9Var6 = ceVar15.K1;
                if (r9Var6 != null) {
                    r9Var6.f3604w0 = hashSet;
                    ArrayList arrayList5 = ceVar15.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj4 = arrayList5.get(i19);
                            i19++;
                            ((r9) obj4).f3604w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                ce ceVar16 = this.f3738b;
                r9 r9Var7 = ceVar16.K1;
                if (r9Var7 != null) {
                    Bitmap bitmap3 = r9Var7.f3575g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    ceVar16.K1.f3575g0 = bitmap2;
                    rb rbVar2 = ceVar16.f2480q0;
                    if (rbVar2 != null) {
                        rbVar2.n1(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.f3738b.f2509y0 = (pb) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                ce ceVar17 = this.f3738b;
                j9 j9Var2 = ceVar17.f2474o0;
                ceVar17.f2505x0 = inputPeer2;
                j9Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                ce ceVar18 = this.f3738b;
                j9 j9Var3 = ceVar18.f2474o0;
                ceVar18.f2505x0 = inputPeer3;
                j9Var3.set(inputPeer3);
                return;
            default:
                m3 m3Var2 = this.f3738b.f2487s;
                float floatValue = ((Float) obj).floatValue();
                m3Var2.f3087o = floatValue;
                m3Var2.f3086n = m3.f(floatValue);
                m3Var2.g();
                return;
        }
    }
}
