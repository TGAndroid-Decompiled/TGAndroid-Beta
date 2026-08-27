package lh;

import android.graphics.Bitmap;
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

public final class t9 implements Utilities.Callback {

    public final int f16876a;

    public final sb f16877b;

    public t9(sb sbVar, int i10) {
        this.f16876a = i10;
        this.f16877b = sbVar;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        cc ccVar;
        ka kaVar;
        switch (this.f16876a) {
            case 0:
                r2 r2Var = this.f16877b.f16800s;
                r2Var.f16639p = ((Float) obj).floatValue();
                r2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                sb sbVar = this.f16877b;
                z7 z7Var = sbVar.G1;
                if (z7Var != null) {
                    AndroidUtilities.recycleBitmap(z7Var.f17210g0);
                    sbVar.G1.f17210g0 = bitmap;
                    q9 q9Var = sbVar.m0;
                    if (q9Var != null) {
                        q9Var.n1(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                z7 z7Var2 = (z7) obj;
                sb sbVar2 = this.f16877b;
                sbVar2.W(z7Var2, false);
                int i10 = sbVar2.f16749c;
                jh.s6 storiesController = MessagesController.getInstance(i10).getStoriesController();
                a0.h hVar = storiesController.f13958e;
                int i11 = storiesController.f13955a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.f13960g;
                jh.r6 r6Var = new jh.r6(storiesController, z7Var2);
                boolean z11 = z7Var2.f17209g;
                long j10 = r6Var.F;
                if (z11) {
                    HashMap map = (HashMap) hVar.f(j10);
                    if (map == null) {
                        map = new HashMap();
                        hVar.k(map, j10);
                    }
                    map.put(Integer.valueOf(z7Var2.f17207f), r6Var);
                } else {
                    storiesController.d(j10, r6Var, storiesController.f13956b, false);
                }
                storiesController.d(j10, r6Var, storiesController.f13957c, true);
                if (j10 != UserConfig.getInstance(i11).clientUserId) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            z10 = false;
                        } else if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i12)).peer) == j10) {
                            arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i12));
                            z10 = true;
                        } else {
                            i12++;
                        }
                    }
                    if (!z10) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i13)).peer) == j10) {
                                arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i13));
                                z10 = true;
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
                r6Var.d();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (z7Var2.f17199c && !z7Var2.f17209g) {
                    MessagesController.getInstance(i10).getStoriesController().f13974w.c(z7Var2);
                }
                if (z7Var2.f17206e1 != 0) {
                    ConnectionsManager.getInstance(z7Var2.f17193a).cancelRequest(z7Var2.f17206e1, true);
                }
                break;
            case 3:
                s6 s6Var = (s6) obj;
                sb sbVar3 = this.f16877b;
                if (sbVar3.f16822y0 != null) {
                    sbVar3.f16825z0.setLink(s6Var == null ? null : s6Var.f16727a);
                    gb gbVar = sbVar3.f16814w0;
                    if (gbVar != null) {
                        gbVar.f15893c.a(sbVar3.f16825z0.f16127y ? sbVar3.f16822y0.d : null);
                    }
                    break;
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                z7 z7Var3 = this.f16877b.G1;
                if (z7Var3 != null) {
                    z7Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                }
                break;
            case 5:
                sb sbVar4 = this.f16877b;
                jh.b bVar = sbVar4.f16742a;
                int iIntValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.za zaVar = new org.telegram.ui.Components.ab(sbVar4.f16745b, new cg.w(5)).f26710a;
                WindowManager.LayoutParams layout = zaVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = sbVar4.f16796r.getWidth();
                    layout.y = (int) (sbVar4.f16796r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.ab abVar = zaVar.f35216a;
                    abVar.getWindow().setAttributes(abVar.f26711b);
                }
                zaVar.setTouchable(true);
                new org.telegram.ui.Components.mc(zaVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", iIntValue, new Object[0]), org.telegram.ui.ActionBar.g6.gc, 0, new s9(sbVar4, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                sb sbVar5 = this.f16877b;
                if (zBooleanValue && (ccVar = sbVar5.V0) != null && ccVar.L) {
                    ccVar.L = false;
                    if (ccVar.A && ccVar.h == null) {
                        ccVar.C = true;
                        wb wbVar = ccVar.f15764a;
                        if (wbVar != null) {
                            wbVar.j1(true);
                        }
                    }
                }
                sbVar5.T0.x(2, bool.booleanValue());
                sbVar5.U0.clearAnimation();
                sbVar5.U0.animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).setDuration(120L).start();
                org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
                if (ecVar != null && ecVar.f28013a == 2) {
                    ecVar.l();
                    break;
                }
                break;
            case 7:
                sb sbVar6 = this.f16877b;
                sbVar6.l();
                sbVar6.m();
                sbVar6.i((Runnable) obj);
                break;
            case 8:
                u uVar = (u) obj;
                sb sbVar7 = this.f16877b;
                gb gbVar2 = sbVar7.f16814w0;
                sbVar7.f16810v0 = uVar;
                gbVar2.o(uVar);
                sbVar7.E0.setSelected(uVar);
                wa waVar = sbVar7.f16818x0;
                if (waVar != null) {
                    waVar.recordHevc = !sbVar7.f16814w0.j();
                }
                sbVar7.C0.setDrawable(new v(uVar, false));
                sbVar7.c0(sbVar7.D0, sbVar7.E0.f17137e, true);
                sbVar7.K0.e(sbVar7.f16814w0.j() ? sbVar7.f16814w0.getFilledProgress() : 0.0f, true);
                sa saVar = sbVar7.I0;
                if (saVar != null) {
                    saVar.setMultipleOnClick(sbVar7.f16814w0.j());
                    sbVar7.I0.setMaxCount(Math.min(10, u.b() - sbVar7.f16814w0.getFilledCount()));
                }
                break;
            case 9:
                sb sbVar8 = this.f16877b;
                sbVar8.K = true;
                sbVar8.q(true);
                AndroidUtilities.runOnUIThread(new cg.o0(3, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                sb sbVar9 = this.f16877b;
                if (!sbVar9.L1 && !sbVar9.M1) {
                    int iIntValue2 = num2.intValue();
                    sbVar9.K1 = iIntValue2;
                    sbVar9.f16776k0.a(iIntValue2 == -1, true);
                    sbVar9.i0(sbVar9.K1 == 1 && !sbVar9.E0.f17137e, true);
                    sbVar9.M0.a(num2.intValue());
                    y6 y6Var = sbVar9.K0;
                    boolean z12 = num2.intValue() == 1;
                    y6Var.f17098j0 = -1.0f;
                    y6Var.f17099k0 = z12;
                    y6Var.invalidate();
                    if (num2.intValue() == -1) {
                        wa waVar2 = sbVar9.f16818x0;
                        if (waVar2 != null && waVar2.isDual()) {
                            sbVar9.f16818x0.toggleDual();
                        }
                        w3 w3Var = sbVar9.f16768h1;
                        if (w3Var != null) {
                            w3Var.e(true);
                        }
                        w3 w3Var2 = sbVar9.f16771i1;
                        if (w3Var2 != null) {
                            w3Var2.e(true);
                        }
                        w3 w3Var3 = sbVar9.S0;
                        if (w3Var3 != null) {
                            w3Var3.e(true);
                        }
                        sbVar9.f16814w0.o(null);
                        sbVar9.f16814w0.e();
                        sbVar9.E0.setSelected((u) null);
                        wa waVar3 = sbVar9.f16818x0;
                        if (waVar3 != null) {
                            waVar3.recordHevc = !sbVar9.f16814w0.j();
                        }
                    }
                    sbVar9.E0.a(false, true);
                    sbVar9.m0(true);
                    break;
                }
                break;
            case 11:
                Float f10 = (Float) obj;
                sb sbVar10 = this.f16877b;
                y6 y6Var2 = sbVar10.K0;
                y6Var2.f17098j0 = f10.floatValue();
                y6Var2.invalidate();
                sbVar10.K0.setVisibility(f10.floatValue() <= -1.0f ? 8 : 0);
                sbVar10.K0.setAlpha(Utilities.clamp01(f10.floatValue() + 1.0f));
                sbVar10.L0.setVisibility(f10.floatValue() < 0.0f ? 0 : 8);
                sbVar10.L0.setAlpha(AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f));
                sbVar10.L0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                sbVar10.L0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                sbVar10.L0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                if (f10.floatValue() < 0.0f) {
                    sbVar10.f(false);
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                sb sbVar11 = this.f16877b;
                if (sbVar11.G1 != null) {
                    ib ibVar = sbVar11.Y0;
                    if (!ibVar.K1) {
                        ibVar.clearFocus();
                        if (num3.intValue() == 5) {
                            sbVar11.X();
                        } else if (num3.intValue() == 0) {
                            sbVar11.l0(0, false, true);
                            va vaVar = sbVar11.f16798r1;
                            if (vaVar != null) {
                                vaVar.I0 = false;
                                vaVar.R0(0);
                                vaVar.D0(null, true);
                            }
                        } else if (num3.intValue() == 1) {
                            sbVar11.l0(0, false, true);
                            va vaVar2 = sbVar11.f16798r1;
                            if (vaVar2 != null) {
                                vaVar2.R0(2);
                                vaVar2.f15972h2 = true;
                                vaVar2.o0(true);
                                sbVar11.f16798r1.I0 = true;
                            }
                        } else if (num3.intValue() == 2) {
                            sbVar11.u();
                            sbVar11.H();
                            va vaVar3 = sbVar11.f16798r1;
                            if (vaVar3 != null) {
                                vaVar3.R0(1);
                                vaVar3.A0();
                            }
                        } else if (num3.intValue() == 4) {
                            sbVar11.l0(1, false, true);
                        } else if (num3.intValue() == 3) {
                            sbVar11.l0(3, false, true);
                        }
                        break;
                    }
                }
                break;
            case 13:
                sb sbVar12 = this.f16877b;
                FrameLayout frameLayout = sbVar12.U0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(sbVar12.f16750c0 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + sbVar12.Y0.getEditTextHeight())));
                }
                ka kaVar2 = sbVar12.Z0;
                if (kaVar2 != null) {
                    int i14 = -(AndroidUtilities.dp(24.0f) + sbVar12.Y0.getEditTextHeight());
                    cc ccVar2 = sbVar12.V0;
                    kaVar2.setTranslationY(i14 - (ccVar2 == null ? 0 : ccVar2.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                org.telegram.ui.Components.ec ecVar2 = org.telegram.ui.Components.ec.f28012w;
                if (ecVar2 != null && ecVar2.f28013a == 2) {
                    ecVar2.l();
                }
                if (sbVar12.Y0.f16345l0 && (kaVar = sbVar12.Z0) != null) {
                    kaVar.c(false, true);
                    break;
                }
                break;
            case 14:
                o9 o9Var = (o9) obj;
                sb sbVar13 = this.f16877b;
                z7 z7Var4 = sbVar13.G1;
                if (z7Var4 != null) {
                    z7Var4.E0 = o9Var;
                }
                ArrayList arrayList3 = sbVar13.D1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList3.get(i15);
                        i15++;
                        ((z7) obj2).E0 = o9Var;
                    }
                }
                break;
            case 15:
                TLRPC.InputPeer tL_inputPeerSelf = (TLRPC.InputPeer) obj;
                sb sbVar14 = this.f16877b;
                z7 z7Var5 = sbVar14.G1;
                if (z7Var5 != null) {
                    if (tL_inputPeerSelf == null) {
                        tL_inputPeerSelf = new TLRPC.TL_inputPeerSelf();
                    }
                    z7Var5.f17237v0 = tL_inputPeerSelf;
                    ArrayList arrayList4 = sbVar14.D1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj3 = arrayList4.get(i16);
                            i16++;
                            ((z7) obj3).f17237v0 = sbVar14.G1.f17237v0;
                        }
                    }
                    break;
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                sb sbVar15 = this.f16877b;
                z7 z7Var6 = sbVar15.G1;
                if (z7Var6 != null) {
                    z7Var6.f17239w0 = hashSet;
                    ArrayList arrayList5 = sbVar15.D1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj4 = arrayList5.get(i17);
                            i17++;
                            ((z7) obj4).f17239w0 = hashSet;
                        }
                    }
                    break;
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                sb sbVar16 = this.f16877b;
                z7 z7Var7 = sbVar16.G1;
                if (z7Var7 != null) {
                    Bitmap bitmap3 = z7Var7.f17210g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    sbVar16.G1.f17210g0 = bitmap2;
                    q9 q9Var2 = sbVar16.m0;
                    if (q9Var2 != null) {
                        q9Var2.n1(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                this.f16877b.f16807u0 = (o9) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                sb sbVar17 = this.f16877b;
                s7 s7Var = sbVar17.f16776k0;
                sbVar17.f16804t0 = inputPeer;
                s7Var.set(inputPeer);
                break;
            case 20:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                sb sbVar18 = this.f16877b;
                s7 s7Var2 = sbVar18.f16776k0;
                sbVar18.f16804t0 = inputPeer2;
                s7Var2.set(inputPeer2);
                break;
            default:
                r2 r2Var2 = this.f16877b.f16800s;
                float fFloatValue = ((Float) obj).floatValue();
                r2Var2.f16638o = fFloatValue;
                r2Var2.f16637n = r2.f(fFloatValue);
                r2Var2.g();
                break;
        }
    }
}
