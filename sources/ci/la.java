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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class la implements Utilities.Callback {
    public final int f4976a;
    public final oc f4977b;

    public la(oc ocVar, int i10) {
        this.f4976a = i10;
        this.f4977b = ocVar;
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
        switch (this.f4976a) {
            case 0:
                y2 y2Var = this.f4977b.f5258s;
                y2Var.f5815p = ((Float) obj).floatValue();
                y2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                oc ocVar = this.f4977b;
                o8 o8Var = ocVar.K1;
                if (o8Var != null) {
                    AndroidUtilities.recycleBitmap(o8Var.f5155g0);
                    ocVar.K1.f5155g0 = bitmap;
                    ia iaVar = ocVar.f5251q0;
                    if (iaVar != null) {
                        iaVar.n1(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                o8 o8Var2 = (o8) obj;
                oc ocVar2 = this.f4977b;
                ocVar2.W(o8Var2, false);
                int i11 = ocVar2.f5208c;
                ai.l9 storiesController = MessagesController.getInstance(i11).getStoriesController();
                a0.i iVar = storiesController.e;
                int i12 = storiesController.f1190a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f1194g;
                ai.k9 k9Var = new ai.k9(storiesController, o8Var2);
                boolean z14 = o8Var2.f5154g;
                long j3 = k9Var.J;
                if (z14) {
                    HashMap hashMap = (HashMap) iVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        iVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(o8Var2.f5152f), k9Var);
                } else {
                    storiesController.d(j3, k9Var, storiesController.f1191b, false);
                }
                storiesController.d(j3, k9Var, storiesController.f1192c, true);
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
                if (o8Var2.f5145c && !o8Var2.f5154g) {
                    MessagesController.getInstance(i11).getStoriesController().f1208w.b(o8Var2);
                }
                if (o8Var2.f5151e1 != 0) {
                    ConnectionsManager.getInstance(o8Var2.f5139a).cancelRequest(o8Var2.f5151e1, true);
                    return;
                }
                return;
            case 3:
                f7 f7Var = (f7) obj;
                oc ocVar3 = this.f4977b;
                if (ocVar3.C0 != null) {
                    w7 w7Var = ocVar3.D0;
                    f7 f7Var2 = null;
                    if (f7Var == null) {
                        str = null;
                    } else {
                        str = f7Var.f4659a;
                    }
                    w7Var.setLink(str);
                    bc bcVar = ocVar3.A0;
                    if (bcVar != null) {
                        g7 g7Var = bcVar.f4555c;
                        if (ocVar3.D0.f5707y) {
                            f7Var2 = ocVar3.C0.d;
                        }
                        g7Var.b(f7Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                o8 o8Var3 = this.f4977b.K1;
                if (o8Var3 != null) {
                    o8Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                oc ocVar4 = this.f4977b;
                ai.d dVar = ocVar4.f5201a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.jb(ocVar4.f5204b, new d9(1)).f25273a;
                WindowManager.LayoutParams layout = ibVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = ocVar4.f5254r.getWidth();
                    layout.y = (int) (ocVar4.f5254r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.jb jbVar = ibVar.f24994a;
                    jbVar.getWindow().setAttributes(jbVar.f25274b);
                }
                ibVar.setTouchable(true);
                new org.telegram.ui.Components.vc(ibVar, dVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.i6.gc, 0, new ka(ocVar4, 27), dVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                oc ocVar5 = this.f4977b;
                if (booleanValue && (zcVar = ocVar5.Z0) != null && zcVar.P) {
                    zcVar.P = false;
                    if (zcVar.E && zcVar.h == null) {
                        zcVar.G = true;
                        sc scVar = zcVar.f5880a;
                        if (scVar != null) {
                            scVar.Q(true);
                        }
                    }
                }
                ocVar5.X0.x(2, bool.booleanValue());
                ocVar5.Y0.clearAnimation();
                ViewPropertyAnimator animate = ocVar5.Y0.animate();
                if (bool.booleanValue()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(120L).start();
                org.telegram.ui.Components.oc ocVar6 = org.telegram.ui.Components.oc.f26744w;
                if (ocVar6 != null && ocVar6.f26745a == 2) {
                    ocVar6.l();
                    return;
                }
                return;
            case 7:
                oc ocVar7 = this.f4977b;
                ocVar7.l();
                ocVar7.m();
                ocVar7.i((Runnable) obj);
                return;
            case 8:
                t tVar = (t) obj;
                oc ocVar8 = this.f4977b;
                bc bcVar2 = ocVar8.A0;
                ocVar8.f5283z0 = tVar;
                bcVar2.o(tVar);
                ocVar8.I0.setSelected(tVar);
                rb rbVar = ocVar8.B0;
                if (rbVar != null) {
                    rbVar.recordHevc = !ocVar8.A0.j();
                }
                ocVar8.G0.setDrawable(new u(tVar, false));
                ocVar8.c0(ocVar8.H0, ocVar8.I0.e, true);
                l7 l7Var = ocVar8.O0;
                if (ocVar8.A0.j()) {
                    f10 = ocVar8.A0.getFilledProgress();
                } else {
                    f10 = 0.0f;
                }
                l7Var.e(f10, true);
                nb nbVar = ocVar8.M0;
                if (nbVar != null) {
                    nbVar.setMultipleOnClick(ocVar8.A0.j());
                    ocVar8.M0.setMaxCount(Math.min(10, t.b() - ocVar8.A0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                oc ocVar9 = this.f4977b;
                ocVar9.O = true;
                ocVar9.q(true);
                AndroidUtilities.runOnUIThread(new ab(0, (Utilities.Callback) obj), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                oc ocVar10 = this.f4977b;
                if (!ocVar10.P1 && !ocVar10.Q1) {
                    int intValue2 = num2.intValue();
                    ocVar10.O1 = intValue2;
                    h8 h8Var = ocVar10.f5245o0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h8Var.a(z11, true);
                    if (ocVar10.O1 == 1 && !ocVar10.I0.e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ocVar10.i0(z12, true);
                    ocVar10.Q0.a(num2.intValue());
                    l7 l7Var2 = ocVar10.O0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    l7Var2.f4954n0 = -1.0f;
                    l7Var2.f4955o0 = z13;
                    l7Var2.invalidate();
                    if (num2.intValue() == -1) {
                        rb rbVar2 = ocVar10.B0;
                        if (rbVar2 != null && rbVar2.isDual()) {
                            ocVar10.B0.toggleDual();
                        }
                        f4 f4Var = ocVar10.l1;
                        if (f4Var != null) {
                            f4Var.e(true);
                        }
                        f4 f4Var2 = ocVar10.f5239m1;
                        if (f4Var2 != null) {
                            f4Var2.e(true);
                        }
                        f4 f4Var3 = ocVar10.W0;
                        if (f4Var3 != null) {
                            f4Var3.e(true);
                        }
                        ocVar10.A0.o(null);
                        ocVar10.A0.e();
                        ocVar10.I0.setSelected((t) null);
                        rb rbVar3 = ocVar10.B0;
                        if (rbVar3 != null) {
                            rbVar3.recordHevc = !ocVar10.A0.j();
                        }
                    }
                    ocVar10.I0.a(false, true);
                    ocVar10.m0(true);
                    return;
                }
                return;
            case 11:
                Float f11 = (Float) obj;
                oc ocVar11 = this.f4977b;
                l7 l7Var3 = ocVar11.O0;
                l7Var3.f4954n0 = f11.floatValue();
                l7Var3.invalidate();
                l7 l7Var4 = ocVar11.O0;
                int i15 = 8;
                if (f11.floatValue() <= -1.0f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                l7Var4.setVisibility(i10);
                ocVar11.O0.setAlpha(Utilities.clamp01(f11.floatValue() + 1.0f));
                d dVar2 = ocVar11.P0;
                if (f11.floatValue() < 0.0f) {
                    i15 = 0;
                }
                dVar2.setVisibility(i15);
                ocVar11.P0.setAlpha(AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f));
                ocVar11.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                ocVar11.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                ocVar11.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                if (f11.floatValue() < 0.0f) {
                    ocVar11.f(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                oc ocVar12 = this.f4977b;
                if (ocVar12.K1 != null) {
                    ec ecVar = ocVar12.f5210c1;
                    if (!ecVar.O1) {
                        ecVar.clearFocus();
                        if (num3.intValue() == 5) {
                            ocVar12.X();
                            return;
                        } else if (num3.intValue() == 0) {
                            ocVar12.l0(0, false, true);
                            qb qbVar = ocVar12.f5269v1;
                            if (qbVar != null) {
                                qbVar.M0 = false;
                                qbVar.R0(0);
                                qbVar.D0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            ocVar12.l0(0, false, true);
                            qb qbVar2 = ocVar12.f5269v1;
                            if (qbVar2 != null) {
                                qbVar2.R0(2);
                                qbVar2.f5427l2 = true;
                                qbVar2.o0(true);
                                ocVar12.f5269v1.M0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            ocVar12.u();
                            ocVar12.H();
                            qb qbVar3 = ocVar12.f5269v1;
                            if (qbVar3 != null) {
                                qbVar3.R0(1);
                                qbVar3.A0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            ocVar12.l0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            ocVar12.l0(3, false, true);
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
                oc ocVar13 = this.f4977b;
                FrameLayout frameLayout = ocVar13.Y0;
                if (frameLayout != null) {
                    if (ocVar13.f5222g0 == 2) {
                        dp = AndroidUtilities.dp(68.0f);
                    } else {
                        dp = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + ocVar13.f5210c1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(dp);
                }
                fb fbVar2 = ocVar13.f5213d1;
                if (fbVar2 != null) {
                    int i16 = -(AndroidUtilities.dp(24.0f) + ocVar13.f5210c1.getEditTextHeight());
                    zc zcVar2 = ocVar13.Z0;
                    if (zcVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = zcVar2.getContentHeight() - AndroidUtilities.dp(5.0f);
                    }
                    fbVar2.setTranslationY(i16 - contentHeight);
                }
                org.telegram.ui.Components.oc ocVar14 = org.telegram.ui.Components.oc.f26744w;
                if (ocVar14 != null && ocVar14.f26745a == 2) {
                    ocVar14.l();
                }
                if (ocVar13.f5210c1.f5003p0 && (fbVar = ocVar13.f5213d1) != null) {
                    fbVar.c(false, true);
                    return;
                }
                return;
            case 14:
                ga gaVar = (ga) obj;
                oc ocVar15 = this.f4977b;
                o8 o8Var4 = ocVar15.K1;
                if (o8Var4 != null) {
                    o8Var4.E0 = gaVar;
                }
                ArrayList arrayList3 = ocVar15.H1;
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
                oc ocVar16 = this.f4977b;
                o8 o8Var5 = ocVar16.K1;
                if (o8Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    o8Var5.f5182v0 = inputPeer;
                    ArrayList arrayList4 = ocVar16.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj3 = arrayList4.get(i18);
                            i18++;
                            ((o8) obj3).f5182v0 = ocVar16.K1.f5182v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                oc ocVar17 = this.f4977b;
                o8 o8Var6 = ocVar17.K1;
                if (o8Var6 != null) {
                    o8Var6.f5184w0 = hashSet;
                    ArrayList arrayList5 = ocVar17.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj4 = arrayList5.get(i19);
                            i19++;
                            ((o8) obj4).f5184w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                oc ocVar18 = this.f4977b;
                o8 o8Var7 = ocVar18.K1;
                if (o8Var7 != null) {
                    Bitmap bitmap3 = o8Var7.f5155g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    ocVar18.K1.f5155g0 = bitmap2;
                    ia iaVar2 = ocVar18.f5251q0;
                    if (iaVar2 != null) {
                        iaVar2.n1(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.f4977b.f5280y0 = (ga) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                oc ocVar19 = this.f4977b;
                h8 h8Var2 = ocVar19.f5245o0;
                ocVar19.f5276x0 = inputPeer2;
                h8Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                oc ocVar20 = this.f4977b;
                h8 h8Var3 = ocVar20.f5245o0;
                ocVar20.f5276x0 = inputPeer3;
                h8Var3.set(inputPeer3);
                return;
            default:
                y2 y2Var2 = this.f4977b.f5258s;
                float floatValue = ((Float) obj).floatValue();
                y2Var2.f5814o = floatValue;
                y2Var2.f5813n = y2.f(floatValue);
                y2Var2.g();
                return;
        }
    }
}
