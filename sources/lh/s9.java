package lh;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLRPC;

public final class s9 implements Runnable {

    public final int f16739a;

    public final sb f16740b;

    public s9(sb sbVar, int i10) {
        this.f16739a = i10;
        this.f16740b = sbVar;
    }

    @Override
    public final void run() {
        int i10;
        char c10;
        ArrayList arrayList;
        hb hbVar;
        rb rbVar;
        int i11 = this.f16739a;
        int i12 = 2;
        int i13 = 1;
        sb sbVar = this.f16740b;
        switch (i11) {
            case 0:
                sbVar.r();
                break;
            case 1:
                if (sbVar.f16792p2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", sbVar.f16800s.f16638o).putFloat("frontflash_intensity", sbVar.f16800s.f16639p).apply();
                }
                sbVar.f16800s.e(0.0f, 240L, null);
                sbVar.A0.setSelected(false);
                break;
            case 2:
                sbVar.m();
                sbVar.S1 = false;
                int i14 = sbVar.f16749c;
                if (sbVar.G1 == null) {
                    sbVar.q(true);
                } else {
                    sbVar.y();
                    t9 t9Var = new t9(sbVar, i12);
                    if (sbVar.D1 == null) {
                        z7 z7Var = sbVar.G1;
                        if (!z7Var.K || z7Var.v() || z7Var.f17209g) {
                            i10 = i14;
                            c10 = 0;
                            arrayList = null;
                        } else {
                            long j10 = z7Var.f17211h0;
                            if (j10 <= 0 || z7Var.f17221n) {
                                i10 = i14;
                                c10 = 0;
                                arrayList = null;
                            } else {
                                long j11 = (long) ((z7Var.f17194a0 - z7Var.Z) * j10);
                                if (j11 < 68999) {
                                    i10 = i14;
                                    arrayList = null;
                                    c10 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    z7Var.f17194a0 = (59000.0f / z7Var.f17211h0) + z7Var.Z;
                                    arrayList.add(z7Var);
                                    long j12 = 59000;
                                    long j13 = 59000;
                                    while (true) {
                                        c10 = 0;
                                        if (j13 < j11) {
                                            long jMin = Math.min(j12, j11 - j13);
                                            if (jMin >= 1000) {
                                                long j14 = j12;
                                                z7 z7VarG = z7Var.g();
                                                float f10 = z7Var.Z;
                                                float f11 = z7Var.f17211h0;
                                                z7VarG.Z = (j13 / f11) + f10;
                                                z7VarG.f17194a0 = ((jMin + j13) / f11) + z7Var.Z;
                                                z7VarG.C0 = "";
                                                j13 += j14;
                                                arrayList.add(z7VarG);
                                                j12 = j14;
                                                i14 = i14;
                                            }
                                        }
                                    }
                                    i10 = i14;
                                }
                            }
                        }
                        sbVar.D1 = arrayList;
                        if (arrayList != null) {
                            sbVar.E1 = new ArrayList();
                            sbVar.F1 = new ArrayList();
                            for (int iF = 0; iF < sbVar.D1.size(); iF = i0.a.f(iF, iF, 1, sbVar.F1)) {
                                sbVar.E1.add(Integer.valueOf(iF));
                            }
                        }
                    } else {
                        i10 = i14;
                        c10 = 0;
                    }
                    if (sbVar.D1 != null) {
                        ArrayList arrayList2 = sbVar.F1;
                        int size = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj = arrayList2.get(i15);
                            i15++;
                            Integer num = (Integer) obj;
                            if (sbVar.E1.contains(num)) {
                                z7 z7Var2 = (z7) sbVar.D1.get(num.intValue());
                                z7 z7Var3 = sbVar.G1;
                                if (z7Var3 == z7Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[c10] = sbVar.Y0.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[c10] = sbVar.G1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    z7 z7Var4 = sbVar.G1;
                                    z7Var4.f17216k = (TextUtils.equals(z7Var4.C0, charSequenceArr[c10]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                                    sbVar.G1.C0 = new SpannableString(sbVar.Y0.getText());
                                } else if (z7Var2.C0 == null) {
                                    z7Var3.f17216k = false;
                                    z7Var3.C0 = new SpannableString("");
                                }
                                t9Var.run(z7Var2);
                                c10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {sbVar.Y0.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(new CharSequence[]{sbVar.G1.C0}, true) : new ArrayList<>();
                        z7 z7Var5 = sbVar.G1;
                        z7Var5.f17216k = (TextUtils.equals(z7Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        sbVar.G1.C0 = new SpannableString(sbVar.Y0.getText());
                        t9Var.run(sbVar.G1);
                    }
                    long peerDialogId = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = sbVar.G1.f17237v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        peerDialogId = DialogObject.getPeerDialogId(inputPeer);
                    }
                    sbVar.G1 = null;
                    sbVar.v = true;
                    sbVar.f16813w = peerDialogId;
                    sbVar.f16820x2 = true;
                    sbVar.o();
                    cg.b2 b2Var = new cg.b2(sbVar, peerDialogId, 10);
                    jb jbVar = sbVar.f16817x;
                    if (jbVar != null) {
                        jbVar.b(peerDialogId, b2Var);
                    } else {
                        b2Var.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                }
                break;
            case 3:
                sbVar.Z(false);
                break;
            case 4:
                z7 z7Var6 = sbVar.G1;
                if (z7Var6 != null) {
                    z7Var6.f17243y0 = !z7Var6.f17243y0;
                    hb hbVar2 = sbVar.T0;
                    if (hbVar2 != null) {
                        hbVar2.u(z7Var6);
                    }
                    va vaVar = sbVar.f16798r1;
                    if (vaVar != null && vaVar.N0 != null) {
                        for (int i16 = 0; i16 < sbVar.f16798r1.N0.getChildCount(); i16++) {
                            View childAt = sbVar.f16798r1.N0.getChildAt(i16);
                            if (childAt instanceof zf.e1) {
                                ((zf.e1) childAt).setupTheme(sbVar.G1);
                            }
                        }
                    }
                    sbVar.o0(true);
                    break;
                }
                break;
            case 5:
                sbVar.q(true);
                break;
            case 6:
                sbVar.d = true;
                sbVar.v = false;
                if (sbVar.F == 1) {
                    sbVar.f16753d0.setAlpha(1.0f);
                    sbVar.f16753d0.setTranslationX(0.0f);
                    sbVar.f16753d0.setTranslationY(0.0f);
                    sbVar.f16757e0.setAlpha(1.0f);
                    sbVar.f16764g0.setAlpha(1.0f);
                    sbVar.f16783n.setBackgroundColor(-16777216);
                    if (sbVar.f16746b0 == 2) {
                        sbVar.f16794q1.setAlpha(1.0f);
                    }
                }
                s9 s9Var = sbVar.f16806t2;
                if (s9Var != null) {
                    s9Var.run();
                    sbVar.f16806t2 = null;
                } else {
                    sbVar.P();
                }
                z7 z7Var7 = sbVar.G1;
                if (z7Var7 != null && z7Var7.f17221n) {
                    sbVar.u();
                    sbVar.H();
                    sbVar.s();
                    break;
                } else if (z7Var7 != null && z7Var7.f17235u) {
                    if (z7Var7.K) {
                        sbVar.T0.t(z7Var7, null, 0L);
                    }
                    sbVar.s();
                    break;
                }
                break;
            case 7:
                sbVar.g(1.0f, true, new s9(sbVar, 6));
                break;
            case 8:
                sbVar.f16814w0.setCameraThumb(sbVar.A());
                wa waVar = sbVar.f16818x0;
                if (waVar != null) {
                    waVar.destroy(true, null);
                    AndroidUtilities.removeFromParent(sbVar.f16818x0);
                    gb gbVar = sbVar.f16814w0;
                    if (gbVar != null) {
                        gbVar.setCameraView(null);
                    }
                    sbVar.f16818x0 = null;
                }
                break;
            case 9:
                sbVar.f16814w0.setCameraThumb(sbVar.A());
                break;
            case 10:
                if (sbVar.f16746b0 == 1) {
                    sbVar.l0(2, false, true);
                    break;
                }
                break;
            case 11:
                ka kaVar = sbVar.Z0;
                if (kaVar != null) {
                    int i17 = -(AndroidUtilities.dp(24.0f) + sbVar.Y0.getEditTextHeight());
                    cc ccVar = sbVar.V0;
                    kaVar.setTranslationY(i17 - (ccVar != null ? ccVar.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                }
                break;
            case 12:
                gb gbVar2 = sbVar.f16814w0;
                if (gbVar2 != null) {
                    gbVar2.f15893c.a(sbVar.f16825z0.f16127y ? sbVar.f16822y0.d : null);
                }
                break;
            case 13:
                sbVar.m0(true);
                break;
            case 14:
                sbVar.s();
                break;
            case 15:
                ib ibVar = sbVar.Y0;
                if (ibVar != null) {
                    ibVar.m();
                }
                break;
            case 16:
                if (sbVar.f16750c0 == -1 && sbVar.f16746b0 == 1) {
                    ib ibVar2 = sbVar.Y0;
                    if (!ibVar2.f16345l0 && !ibVar2.K1) {
                        cc ccVar2 = sbVar.V0;
                        if (!ccVar2.L) {
                            ka kaVar2 = sbVar.Z0;
                            if (kaVar2.I) {
                                kaVar2.c(false, true);
                            } else {
                                sbVar.l0(0, false, true);
                                va vaVar2 = sbVar.f16798r1;
                                if (vaVar2 != null) {
                                    vaVar2.R0(2);
                                    vaVar2.f15972h2 = true;
                                    vaVar2.o0(true);
                                    sbVar.f16798r1.I0 = true;
                                }
                            }
                            break;
                        } else {
                            ccVar2.L = false;
                            if (ccVar2.A && ccVar2.h == null) {
                                ccVar2.C = true;
                                wb wbVar = ccVar2.f15764a;
                                if (wbVar != null) {
                                    wbVar.j1(true);
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 17:
                sbVar.J1 = true;
                sbVar.X0.setShareEnabled(false);
                u0 u0Var = sbVar.f16744a1;
                u0Var.getClass();
                u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                sbVar.f16814w0.setCameraThumb(sbVar.A());
                break;
            case 19:
                rb rbVar2 = sbVar.f16783n;
                jh.b bVar = sbVar.f16742a;
                new org.telegram.ui.Components.mc(rbVar2, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.g6.gc, 0, new s9(sbVar, 27), bVar)).k(true);
                break;
            case 20:
                q9 q9Var = sbVar.m0;
                if (q9Var != null) {
                    q9Var.dismiss();
                }
                sbVar.K(2, true);
                break;
            case 21:
                sbVar.l0(-1, false, true);
                break;
            case 22:
                sbVar.l0(-1, false, true);
                break;
            case 23:
                sbVar.d = false;
                AndroidUtilities.unlockOrientation(sbVar.f16745b);
                if (sbVar.f16818x0 != null) {
                    if (sbVar.M1) {
                        CameraController.getInstance().stopVideoRecording(sbVar.f16818x0.getCameraSession(), false);
                    }
                    sbVar.v(false);
                }
                hb hbVar3 = sbVar.T0;
                if (hbVar3 != null) {
                    hbVar3.set(null);
                }
                sbVar.z();
                sbVar.y();
                File file = sbVar.C1;
                if (file != null && !sbVar.v) {
                    try {
                        file.delete();
                        break;
                    } catch (Exception unused) {
                    }
                }
                sbVar.C1 = null;
                AndroidUtilities.runOnUIThread(new s9(sbVar, 28), 16L);
                nb nbVar = sbVar.B;
                if (nbVar != null) {
                    nbVar.f(false);
                }
                if (sbVar.f16806t2 != null) {
                    sbVar.f16806t2 = null;
                }
                sbVar.f16769h2 = null;
                sb sbVar2 = sb.B2;
                if (sbVar2 != null) {
                    sbVar2.q(false);
                }
                sb.B2 = null;
                rb rbVar3 = sbVar.f16783n;
                if (rbVar3 != null) {
                    org.telegram.ui.Components.ec.h(rbVar3);
                }
                ag.p1 p1Var = sbVar.f16767h0;
                if (p1Var != null) {
                    org.telegram.ui.Components.ec.h(p1Var);
                }
                gb gbVar3 = sbVar.f16814w0;
                if (gbVar3 != null) {
                    gbVar3.e();
                }
                break;
            case 24:
                if (!sbVar.G1.f17197b0 && sbVar.m0 != null && (hbVar = sbVar.T0) != null) {
                    hbVar.h(new t9(sbVar, i13), hbVar, sbVar.f16802s1, sbVar.f16811v1);
                }
                sbVar.K(1, true);
                break;
            case 25:
                sbVar.j0(false);
                sbVar.a2 = null;
                break;
            case 26:
                sbVar.j0(false);
                sbVar.a2 = null;
                break;
            case 27:
                sbVar.T();
                break;
            default:
                WindowManager windowManager = sbVar.f16760f;
                if (windowManager != null && (rbVar = sbVar.f16783n) != null && rbVar.getParent() != null) {
                    windowManager.removeView(sbVar.f16783n);
                    break;
                }
                break;
        }
    }
}
