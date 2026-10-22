package ei;

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
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xc;
public final class u9 implements Utilities.Callback {
    public final int f9912a;
    public final vb f9913b;

    public u9(vb vbVar, int i10) {
        this.f9912a = i10;
        this.f9913b = vbVar;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        float f7;
        gc gcVar;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        ma maVar;
        int contentHeight;
        float dp;
        switch (this.f9912a) {
            case 0:
                s2 s2Var = this.f9913b.f10004s;
                s2Var.f9778p = ((Float) obj).floatValue();
                s2Var.i();
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                vb vbVar = this.f9913b;
                a8 a8Var = vbVar.K1;
                if (a8Var != null) {
                    AndroidUtilities.recycleBitmap(a8Var.f8710g0);
                    vbVar.K1.f8710g0 = bitmap;
                    r9 r9Var = vbVar.f9997q0;
                    if (r9Var != null) {
                        r9Var.o1(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                a8 a8Var2 = (a8) obj;
                vb vbVar2 = this.f9913b;
                vbVar2.V(a8Var2, false);
                int i11 = vbVar2.f9954c;
                ci.i7 storiesController = MessagesController.getInstance(i11).getStoriesController();
                a0.h hVar = storiesController.e;
                int i12 = storiesController.f5491a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f5495g;
                ci.h7 h7Var = new ci.h7(storiesController, a8Var2);
                boolean z14 = a8Var2.f8709g;
                long j10 = h7Var.J;
                if (z14) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(a8Var2.f8707f), h7Var);
                } else {
                    storiesController.d(j10, h7Var, storiesController.f5492b, false);
                }
                storiesController.d(j10, h7Var, storiesController.f5493c, true);
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
                h7Var.d();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (a8Var2.f8700c && !a8Var2.f8709g) {
                    MessagesController.getInstance(i11).getStoriesController().f5509w.b(a8Var2);
                }
                if (a8Var2.f8706e1 != 0) {
                    ConnectionsManager.getInstance(a8Var2.f8694a).cancelRequest(a8Var2.f8706e1, true);
                    return;
                }
                return;
            case 3:
                t6 t6Var = (t6) obj;
                vb vbVar3 = this.f9913b;
                if (vbVar3.C0 != null) {
                    j7 j7Var = vbVar3.D0;
                    t6 t6Var2 = null;
                    if (t6Var == null) {
                        str = null;
                    } else {
                        str = t6Var.f9851a;
                    }
                    j7Var.setLink(str);
                    ib ibVar = vbVar3.A0;
                    if (ibVar != null) {
                        u6 u6Var = ibVar.f8920c;
                        if (vbVar3.D0.f9266y) {
                            t6Var2 = vbVar3.C0.d;
                        }
                        u6Var.a(t6Var2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Integer num = (Integer) obj;
                a8 a8Var3 = this.f9913b.K1;
                if (a8Var3 != null) {
                    a8Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    return;
                }
                return;
            case 5:
                vb vbVar4 = this.f9913b;
                ci.b bVar = vbVar4.f9947a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.lb(vbVar4.f9950b, new o8(1)).f28132a;
                WindowManager.LayoutParams layout = kbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = vbVar4.f10000r.getWidth();
                    layout.y = (int) (vbVar4.f10000r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.lb lbVar = kbVar.f27835a;
                    lbVar.getWindow().setAttributes(lbVar.f28133b);
                }
                kbVar.setTouchable(true);
                new xc(kbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.h6.f21052gc, 0, new t9(vbVar4, 27), bVar)).k(true);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                vb vbVar5 = this.f9913b;
                if (booleanValue && (gcVar = vbVar5.Z0) != null && gcVar.P) {
                    gcVar.P = false;
                    if (gcVar.E && gcVar.h == null) {
                        gcVar.G = true;
                        zb zbVar = gcVar.f9079a;
                        if (zbVar != null) {
                            zbVar.D(true);
                        }
                    }
                }
                vbVar5.X0.x(2, bool.booleanValue());
                vbVar5.Y0.clearAnimation();
                ViewPropertyAnimator animate = vbVar5.Y0.animate();
                if (bool.booleanValue()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                ok.s(animate, f7, 120L);
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29527w;
                if (qcVar != null && qcVar.f29528a == 2) {
                    qcVar.l();
                    return;
                }
                return;
            case 7:
                vb vbVar6 = this.f9913b;
                vbVar6.k();
                vbVar6.l();
                vbVar6.h((Runnable) obj);
                return;
            case 8:
                t tVar = (t) obj;
                vb vbVar7 = this.f9913b;
                ib ibVar2 = vbVar7.A0;
                vbVar7.f10029z0 = tVar;
                ibVar2.o(tVar);
                vbVar7.I0.setSelected(tVar);
                ya yaVar = vbVar7.B0;
                if (yaVar != null) {
                    yaVar.recordHevc = !vbVar7.A0.j();
                }
                vbVar7.G0.setDrawable(new u(tVar, false));
                vbVar7.b0(vbVar7.H0, vbVar7.I0.e, true);
                z6 z6Var = vbVar7.O0;
                if (vbVar7.A0.j()) {
                    f10 = vbVar7.A0.getFilledProgress();
                } else {
                    f10 = 0.0f;
                }
                z6Var.e(f10, true);
                ua uaVar = vbVar7.M0;
                if (uaVar != null) {
                    uaVar.setMultipleOnClick(vbVar7.A0.j());
                    vbVar7.M0.setMaxCount(Math.min(10, t.b() - vbVar7.A0.getFilledCount()));
                    return;
                }
                return;
            case 9:
                vb vbVar8 = this.f9913b;
                vbVar8.O = true;
                vbVar8.p(true);
                AndroidUtilities.runOnUIThread(new ia(0, (Utilities.Callback) obj), 210L);
                return;
            case 10:
                Integer num2 = (Integer) obj;
                vb vbVar9 = this.f9913b;
                if (!vbVar9.P1 && !vbVar9.Q1) {
                    int intValue2 = num2.intValue();
                    vbVar9.O1 = intValue2;
                    t7 t7Var = vbVar9.f9991o0;
                    if (intValue2 == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t7Var.a(z11, true);
                    if (vbVar9.O1 == 1 && !vbVar9.I0.e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    vbVar9.h0(z12, true);
                    vbVar9.Q0.a(num2.intValue());
                    z6 z6Var2 = vbVar9.O0;
                    if (num2.intValue() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z6Var2.f10222n0 = -1.0f;
                    z6Var2.f10223o0 = z13;
                    z6Var2.invalidate();
                    if (num2.intValue() == -1) {
                        ya yaVar2 = vbVar9.B0;
                        if (yaVar2 != null && yaVar2.isDual()) {
                            vbVar9.B0.toggleDual();
                        }
                        x3 x3Var = vbVar9.l1;
                        if (x3Var != null) {
                            x3Var.e(true);
                        }
                        x3 x3Var2 = vbVar9.f9985m1;
                        if (x3Var2 != null) {
                            x3Var2.e(true);
                        }
                        x3 x3Var3 = vbVar9.W0;
                        if (x3Var3 != null) {
                            x3Var3.e(true);
                        }
                        vbVar9.A0.o(null);
                        vbVar9.A0.e();
                        vbVar9.I0.setSelected((t) null);
                        ya yaVar3 = vbVar9.B0;
                        if (yaVar3 != null) {
                            yaVar3.recordHevc = !vbVar9.A0.j();
                        }
                    }
                    vbVar9.I0.a(false, true);
                    vbVar9.l0(true);
                    return;
                }
                return;
            case 11:
                Float f11 = (Float) obj;
                vb vbVar10 = this.f9913b;
                z6 z6Var3 = vbVar10.O0;
                z6Var3.f10222n0 = f11.floatValue();
                z6Var3.invalidate();
                z6 z6Var4 = vbVar10.O0;
                int i15 = 8;
                if (f11.floatValue() <= -1.0f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                z6Var4.setVisibility(i10);
                vbVar10.O0.setAlpha(Utilities.clamp01(f11.floatValue() + 1.0f));
                d dVar = vbVar10.P0;
                if (f11.floatValue() < 0.0f) {
                    i15 = 0;
                }
                dVar.setVisibility(i15);
                vbVar10.P0.setAlpha(AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f));
                vbVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                vbVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                vbVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f11.floatValue(), 0.0f, -1.0f)));
                if (f11.floatValue() < 0.0f) {
                    vbVar10.e(false);
                    return;
                }
                return;
            case 12:
                Integer num3 = (Integer) obj;
                vb vbVar11 = this.f9913b;
                if (vbVar11.K1 != null) {
                    lb lbVar2 = vbVar11.f9956c1;
                    if (!lbVar2.O1) {
                        lbVar2.clearFocus();
                        if (num3.intValue() == 5) {
                            vbVar11.W();
                            return;
                        } else if (num3.intValue() == 0) {
                            vbVar11.k0(0, false, true);
                            xa xaVar = vbVar11.f10015v1;
                            if (xaVar != null) {
                                xaVar.M0 = false;
                                xaVar.Q0(0);
                                xaVar.C0(null, true);
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 1) {
                            vbVar11.k0(0, false, true);
                            xa xaVar2 = vbVar11.f10015v1;
                            if (xaVar2 != null) {
                                xaVar2.Q0(2);
                                xaVar2.f9020l2 = true;
                                xaVar2.n0(true);
                                vbVar11.f10015v1.M0 = true;
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 2) {
                            vbVar11.t();
                            vbVar11.G();
                            xa xaVar3 = vbVar11.f10015v1;
                            if (xaVar3 != null) {
                                xaVar3.Q0(1);
                                xaVar3.z0();
                                return;
                            }
                            return;
                        } else if (num3.intValue() == 4) {
                            vbVar11.k0(1, false, true);
                            return;
                        } else if (num3.intValue() == 3) {
                            vbVar11.k0(3, false, true);
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
                vb vbVar12 = this.f9913b;
                FrameLayout frameLayout = vbVar12.Y0;
                if (frameLayout != null) {
                    if (vbVar12.f9968g0 == 2) {
                        dp = AndroidUtilities.dp(68.0f);
                    } else {
                        dp = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + vbVar12.f9956c1.getEditTextHeight()));
                    }
                    frameLayout.setTranslationY(dp);
                }
                ma maVar2 = vbVar12.f9959d1;
                if (maVar2 != null) {
                    int i16 = -(AndroidUtilities.dp(24.0f) + vbVar12.f9956c1.getEditTextHeight());
                    gc gcVar2 = vbVar12.Z0;
                    if (gcVar2 == null) {
                        contentHeight = 0;
                    } else {
                        contentHeight = gcVar2.getContentHeight() - AndroidUtilities.dp(5.0f);
                    }
                    maVar2.setTranslationY(i16 - contentHeight);
                }
                org.telegram.ui.Components.qc qcVar2 = org.telegram.ui.Components.qc.f29527w;
                if (qcVar2 != null && qcVar2.f29528a == 2) {
                    qcVar2.l();
                }
                if (vbVar12.f9956c1.f9410p0 && (maVar = vbVar12.f9959d1) != null) {
                    maVar.c(false, true);
                    return;
                }
                return;
            case 14:
                p9 p9Var = (p9) obj;
                vb vbVar13 = this.f9913b;
                a8 a8Var4 = vbVar13.K1;
                if (a8Var4 != null) {
                    a8Var4.E0 = p9Var;
                }
                ArrayList arrayList3 = vbVar13.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj2 = arrayList3.get(i17);
                        i17++;
                        ((a8) obj2).E0 = p9Var;
                    }
                    return;
                }
                return;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                vb vbVar14 = this.f9913b;
                a8 a8Var5 = vbVar14.K1;
                if (a8Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    a8Var5.f8737v0 = inputPeer;
                    ArrayList arrayList4 = vbVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj3 = arrayList4.get(i18);
                            i18++;
                            ((a8) obj3).f8737v0 = vbVar14.K1.f8737v0;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                HashSet hashSet = (HashSet) obj;
                vb vbVar15 = this.f9913b;
                a8 a8Var6 = vbVar15.K1;
                if (a8Var6 != null) {
                    a8Var6.f8739w0 = hashSet;
                    ArrayList arrayList5 = vbVar15.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj4 = arrayList5.get(i19);
                            i19++;
                            ((a8) obj4).f8739w0 = hashSet;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                vb vbVar16 = this.f9913b;
                a8 a8Var7 = vbVar16.K1;
                if (a8Var7 != null) {
                    Bitmap bitmap3 = a8Var7.f8710g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    vbVar16.K1.f8710g0 = bitmap2;
                    r9 r9Var2 = vbVar16.f9997q0;
                    if (r9Var2 != null) {
                        r9Var2.o1(bitmap2);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.f9913b.f10026y0 = (p9) obj;
                return;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                vb vbVar17 = this.f9913b;
                t7 t7Var2 = vbVar17.f9991o0;
                vbVar17.f10022x0 = inputPeer2;
                t7Var2.set(inputPeer2);
                return;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                vb vbVar18 = this.f9913b;
                t7 t7Var3 = vbVar18.f9991o0;
                vbVar18.f10022x0 = inputPeer3;
                t7Var3.set(inputPeer3);
                return;
            default:
                s2 s2Var2 = this.f9913b.f10004s;
                float floatValue = ((Float) obj).floatValue();
                s2Var2.f9777o = floatValue;
                s2Var2.f9776n = s2.f(floatValue);
                s2Var2.g();
                return;
        }
    }
}
