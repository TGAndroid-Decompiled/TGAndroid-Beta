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
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ha implements Utilities.Callback {
    public final int f7013a;
    public final kc f7014b;

    public ha(kc kcVar, int i10) {
        this.f7013a = i10;
        this.f7014b = kcVar;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        float f7;
        uc ucVar;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        bb bbVar;
        int contentHeight;
        float dp;
        switch (this.f7013a) {
            case 0:
                w2 w2Var = this.f7014b.f7294s;
                w2Var.f8042p = ((Float) obj).floatValue();
                w2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                kc kcVar = this.f7014b;
                k8 k8Var = kcVar.K1;
                if (k8Var != null) {
                    AndroidUtilities.recycleBitmap(k8Var.f7191g0);
                    kcVar.K1.f7191g0 = bitmap;
                    ea eaVar = kcVar.f7287q0;
                    if (eaVar != null) {
                        eaVar.o1(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                k8 k8Var2 = (k8) obj;
                kc kcVar2 = this.f7014b;
                kcVar2.V(k8Var2, false);
                int i11 = kcVar2.f7244c;
                bi.x8 storiesController = MessagesController.getInstance(i11).getStoriesController();
                a0.h hVar = storiesController.e;
                int i12 = storiesController.f3966a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f3970g;
                bi.w8 w8Var = new bi.w8(storiesController, k8Var2);
                boolean z14 = k8Var2.f7190g;
                long j10 = w8Var.J;
                if (z14) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(k8Var2.f7188f), w8Var);
                } else {
                    storiesController.d(j10, w8Var, storiesController.f3967b, false);
                }
                storiesController.d(j10, w8Var, storiesController.f3968c, true);
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
                w8Var.d();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (k8Var2.f7181c && !k8Var2.f7190g) {
                    MessagesController.getInstance(i11).getStoriesController().f3984w.b(k8Var2);
                }
                if (k8Var2.f7187e1 != 0) {
                    ConnectionsManager.getInstance(k8Var2.f7175a).cancelRequest(k8Var2.f7187e1, true);
                    return;
                }
                return;
            case 3:
                c7 c7Var = (c7) obj;
                kc kcVar3 = this.f7014b;
                if (kcVar3.C0 != null) {
                    s7 s7Var = kcVar3.D0;
                    c7 c7Var2 = null;
                    if (c7Var == null) {
                        str = null;
                    } else {
                        str = c7Var.f6711a;
                    }
                    s7Var.setLink(str);
                    xb xbVar = kcVar3.A0;
                    if (xbVar != null) {
                        d7 d7Var = xbVar.f6861c;
                        if (kcVar3.D0.f7784y) {
                            c7Var2 = kcVar3.C0.d;
                        }
                        d7Var.a(c7Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                k8 k8Var3 = this.f7014b.K1;
                if (k8Var3 != null) {
                    k8Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                kc kcVar4 = this.f7014b;
                bi.b bVar = kcVar4.f7237a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.nb(kcVar4.f7240b, new z8(1)).f27336a;
                WindowManager.LayoutParams layout = mbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = kcVar4.f7290r.getWidth();
                    layout.y = (int) (kcVar4.f7290r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.nb nbVar = mbVar.f27063a;
                    nbVar.getWindow().setAttributes(nbVar.f27337b);
                }
                mbVar.setTouchable(true);
                new org.telegram.ui.Components.zc(mbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.g6.f19660gc, 0, new ga(kcVar4, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                kc kcVar5 = this.f7014b;
                if (booleanValue && (ucVar = kcVar5.Z0) != null && ucVar.P) {
                    ucVar.P = false;
                    if (ucVar.E && ucVar.h == null) {
                        ucVar.G = true;
                        oc ocVar = ucVar.f7911a;
                        if (ocVar != null) {
                            ocVar.N(true);
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
                sk.s(animate, f7, 120L);
                org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f28798w;
                if (scVar != null && scVar.f28799a == 2) {
                    scVar.l();
                    return;
                }
                return;
            case 7:
                kc kcVar6 = this.f7014b;
                kcVar6.k();
                kcVar6.l();
                kcVar6.h((Runnable) obj);
                return;
            case 8:
                t tVar = (t) obj;
                kc kcVar7 = this.f7014b;
                xb xbVar2 = kcVar7.A0;
                kcVar7.f7319z0 = tVar;
                xbVar2.o(tVar);
                kcVar7.I0.setSelected(tVar);
                nb nbVar2 = kcVar7.B0;
                if (nbVar2 != null) {
                    nbVar2.recordHevc = !kcVar7.A0.j();
                }
                kcVar7.G0.setDrawable(new u(tVar, false));
                kcVar7.b0(kcVar7.H0, kcVar7.I0.e, true);
                i7 i7Var = kcVar7.O0;
                if (kcVar7.A0.j()) {
                    f10 = kcVar7.A0.getFilledProgress();
                } else {
                    f10 = 0.0f;
                }
                i7Var.e(f10, true);
                jb jbVar = kcVar7.M0;
                if (jbVar != null) {
                    jbVar.setMultipleOnClick(kcVar7.A0.j());
                    kcVar7.M0.setMaxCount(Math.min(10, t.b() - kcVar7.A0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                kc kcVar8 = this.f7014b;
                kcVar8.O = true;
                kcVar8.p(true);
                AndroidUtilities.runOnUIThread(new wa(0, (Utilities.Callback) obj), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                kc kcVar9 = this.f7014b;
                if (!kcVar9.P1 && !kcVar9.Q1) {
                    int intValue2 = num2.intValue();
                    kcVar9.O1 = intValue2;
                    d8 d8Var = kcVar9.f7281o0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    d8Var.a(z11, true);
                    if (kcVar9.O1 == 1 && !kcVar9.I0.e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    kcVar9.h0(z12, true);
                    kcVar9.Q0.a(num2.intValue());
                    i7 i7Var2 = kcVar9.O0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i7Var2.f7065n0 = -1.0f;
                    i7Var2.f7066o0 = z13;
                    i7Var2.invalidate();
                    if (num2.intValue() == -1) {
                        nb nbVar3 = kcVar9.B0;
                        if (nbVar3 != null && nbVar3.isDual()) {
                            kcVar9.B0.toggleDual();
                        }
                        d4 d4Var = kcVar9.l1;
                        if (d4Var != null) {
                            d4Var.e(true);
                        }
                        d4 d4Var2 = kcVar9.f7275m1;
                        if (d4Var2 != null) {
                            d4Var2.e(true);
                        }
                        d4 d4Var3 = kcVar9.W0;
                        if (d4Var3 != null) {
                            d4Var3.e(true);
                        }
                        kcVar9.A0.o(null);
                        kcVar9.A0.e();
                        kcVar9.I0.setSelected((t) null);
                        nb nbVar4 = kcVar9.B0;
                        if (nbVar4 != null) {
                            nbVar4.recordHevc = !kcVar9.A0.j();
                        }
                    }
                    kcVar9.I0.a(false, true);
                    kcVar9.l0(true);
                    return;
                }
                return;
            case 11:
                Float f11 = (Float) obj;
                kc kcVar10 = this.f7014b;
                i7 i7Var3 = kcVar10.O0;
                i7Var3.f7065n0 = f11.floatValue();
                i7Var3.invalidate();
                i7 i7Var4 = kcVar10.O0;
                int i15 = 8;
                if (f11.floatValue() <= -1.0f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                i7Var4.setVisibility(i10);
                kcVar10.O0.setAlpha(Utilities.clamp01(f11.floatValue() + 1.0f));
                d dVar = kcVar10.P0;
                if (f11.floatValue() < 0.0f) {
                    i15 = 0;
                }
                dVar.setVisibility(i15);
                kcVar10.P0.setAlpha(AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f));
                kcVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                kcVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                kcVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                if (f11.floatValue() < 0.0f) {
                    kcVar10.e(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                kc kcVar11 = this.f7014b;
                if (kcVar11.K1 != null) {
                    ac acVar = kcVar11.f7246c1;
                    if (!acVar.O1) {
                        acVar.clearFocus();
                        if (num3.intValue() == 5) {
                            kcVar11.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            kcVar11.k0(0, false, true);
                            mb mbVar2 = kcVar11.f7305v1;
                            if (mbVar2 != null) {
                                mbVar2.M0 = false;
                                mbVar2.Q0(0);
                                mbVar2.C0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            kcVar11.k0(0, false, true);
                            mb mbVar3 = kcVar11.f7305v1;
                            if (mbVar3 != null) {
                                mbVar3.Q0(2);
                                mbVar3.f7536l2 = true;
                                mbVar3.n0(true);
                                kcVar11.f7305v1.M0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            kcVar11.t();
                            kcVar11.G();
                            mb mbVar4 = kcVar11.f7305v1;
                            if (mbVar4 != null) {
                                mbVar4.Q0(1);
                                mbVar4.z0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            kcVar11.k0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            kcVar11.k0(3, false, true);
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
                kc kcVar12 = this.f7014b;
                FrameLayout frameLayout = kcVar12.Y0;
                if (frameLayout != null) {
                    if (kcVar12.f7258g0 == 2) {
                        dp = AndroidUtilities.dp(68.0f);
                    } else {
                        dp = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + kcVar12.f7246c1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(dp);
                }
                bb bbVar2 = kcVar12.f7249d1;
                if (bbVar2 != null) {
                    int i16 = -(AndroidUtilities.dp(24.0f) + kcVar12.f7246c1.getEditTextHeight());
                    uc ucVar2 = kcVar12.Z0;
                    if (ucVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = ucVar2.getContentHeight() - AndroidUtilities.dp(5.0f);
                    }
                    bbVar2.setTranslationY(i16 - contentHeight);
                }
                org.telegram.ui.Components.sc scVar2 = org.telegram.ui.Components.sc.f28798w;
                if (scVar2 != null && scVar2.f28799a == 2) {
                    scVar2.l();
                }
                if (kcVar12.f7246c1.f7396p0 && (bbVar = kcVar12.f7249d1) != null) {
                    bbVar.c(false, true);
                    return;
                }
                return;
            case 14:
                ca caVar = (ca) obj;
                kc kcVar13 = this.f7014b;
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
                kc kcVar14 = this.f7014b;
                k8 k8Var5 = kcVar14.K1;
                if (k8Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    k8Var5.f7218v0 = inputPeer;
                    ArrayList arrayList4 = kcVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj3 = arrayList4.get(i18);
                            i18++;
                            ((k8) obj3).f7218v0 = kcVar14.K1.f7218v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                kc kcVar15 = this.f7014b;
                k8 k8Var6 = kcVar15.K1;
                if (k8Var6 != null) {
                    k8Var6.f7220w0 = hashSet;
                    ArrayList arrayList5 = kcVar15.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj4 = arrayList5.get(i19);
                            i19++;
                            ((k8) obj4).f7220w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                kc kcVar16 = this.f7014b;
                k8 k8Var7 = kcVar16.K1;
                if (k8Var7 != null) {
                    Bitmap bitmap3 = k8Var7.f7191g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    kcVar16.K1.f7191g0 = bitmap2;
                    ea eaVar2 = kcVar16.f7287q0;
                    if (eaVar2 != null) {
                        eaVar2.o1(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.f7014b.f7316y0 = (ca) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                kc kcVar17 = this.f7014b;
                d8 d8Var2 = kcVar17.f7281o0;
                kcVar17.f7312x0 = inputPeer2;
                d8Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                kc kcVar18 = this.f7014b;
                d8 d8Var3 = kcVar18.f7281o0;
                kcVar18.f7312x0 = inputPeer3;
                d8Var3.set(inputPeer3);
                return;
            default:
                w2 w2Var2 = this.f7014b.f7294s;
                float floatValue = ((Float) obj).floatValue();
                w2Var2.f8041o = floatValue;
                w2Var2.f8040n = w2.f(floatValue);
                w2Var2.g();
                return;
        }
    }
}
