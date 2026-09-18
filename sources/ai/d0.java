package ai;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kf;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.xp;
import org.telegram.ui.al;
import org.telegram.ui.bo;
import org.telegram.ui.cu0;
import org.telegram.ui.g70;
public final class d0 implements View.OnClickListener {
    public final int f682a;
    public final Object f683b;
    public final Object f684c;
    public final Object d;

    public d0(Object obj, Object obj2, Object obj3, int i10) {
        this.f682a = i10;
        this.f683b = obj;
        this.f684c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        ci.o oVar;
        String formatPluralString;
        n8 n8Var;
        boolean z10;
        Runnable runnable;
        long j3;
        boolean z11;
        kf kfVar;
        boolean z12;
        boolean G1;
        ub0 ub0Var;
        CharSequence charSequence;
        View view2;
        String string;
        switch (this.f682a) {
            case 0:
                ((y1) this.f683b).run(Long.valueOf(((long[]) this.f684c)[0]));
                ((org.telegram.ui.ActionBar.g3) this.d).dismiss();
                return;
            case 1:
                f6 f6Var = ((w5) this.f683b).f1658l;
                f6Var.F0((ci.ga) this.f684c, (TL_stories.StoryItem) this.d);
                w5 w5Var = f6Var.f854t1;
                if (w5Var != null) {
                    w5Var.a();
                    return;
                }
                return;
            case 2:
                w5 w5Var2 = (w5) this.f683b;
                jc jcVar = (jc) this.d;
                ((org.telegram.ui.ActionBar.g1) this.f684c).performHapticFeedback(3);
                vc X = vc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.e(12, w5Var2, jcVar))).j();
                    return;
                }
                return;
            case 3:
                s6 s6Var = (s6) this.f683b;
                y3 y3Var = new y3(s6Var, 1);
                j7 j7Var = s6Var.f1507b;
                new sv(y3Var, j7Var.getContext(), j7Var.f1053s, (ArrayList) this.f684c).show();
                ((n70) this.d).u();
                return;
            case 4:
                ci.ec ecVar = (ci.ec) this.f683b;
                FrameLayout frameLayout = (FrameLayout) this.f684c;
                d dVar = (d) this.d;
                n70 n70Var = ecVar.V0;
                if (n70Var == null || !n70Var.D()) {
                    ci.o oVar2 = new ci.o(ecVar, 0);
                    boolean isPremium = UserConfig.getInstance(ecVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new ci.o(ecVar, 1);
                    }
                    n70 F = n70.F(frameLayout, dVar, ecVar.T0);
                    ecVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    ecVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ci.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            n70 n70Var2 = ecVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.j6.E8;
                            n70Var2.b(0, null, str, i12, i12, new n8(oVar2, i11, 2));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                n8Var = new n8(oVar, i11, 3);
                            } else {
                                n8Var = null;
                            }
                            n70Var2.M(n8Var);
                            if (ecVar.X0 == i10) {
                                ecVar.V0.L();
                            }
                            i10++;
                        } else {
                            n70 n70Var3 = ecVar.V0;
                            n70Var3.f26387s = 0;
                            n70Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 5:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f684c;
                ci.s3 s3Var = (ci.s3) this.d;
                ci.x3 x3Var = ((ci.p3) this.f683b).f5304c;
                ArrayList arrayList = x3Var.f5744h0;
                if (arrayList.contains(photoEntry)) {
                    arrayList.remove(photoEntry);
                } else if (arrayList.size() + 1 > x3Var.R) {
                    int i13 = -x3Var.N;
                    x3Var.N = i13;
                    AndroidUtilities.shakeViewSpring(s3Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                } else {
                    arrayList.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(x3Var.d);
                x3Var.j();
                return;
            case 6:
                ci.qb qbVar = (ci.qb) this.f683b;
                Context context = (Context) this.f684c;
                pg.s0 s0Var = (pg.s0) this.d;
                if (qbVar.B1) {
                    pg.x xVar = new pg.x(context, qbVar.G1);
                    qbVar.T1 = xVar;
                    xVar.m(qbVar.A1.f40997a, 2);
                    xVar.f41066n = new ci.s5(qbVar, s0Var);
                    xVar.h = new ci.l5(0, qbVar, s0Var);
                    xVar.show();
                    return;
                }
                Runnable runnable2 = qbVar.K1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 7:
                hg.e eVar = (hg.e) this.f683b;
                n70 F2 = n70.F(((bo) this.f684c).getLayoutContainer(), (org.telegram.ui.ActionBar.f6) this.d, eVar.f10260n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new hg.d(eVar, 1), true);
                F2.E();
                if (eVar.f10264x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new hg.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f26387s = 0;
                F2.Z();
                return;
            case 8:
                hg.l0.S((hg.l0) this.f683b, (TL_account.TL_connectedBot) this.f684c, (id) this.d);
                return;
            case 9:
                hi.b bVar = (hi.b) this.f683b;
                Utilities.Callback callback = (Utilities.Callback) this.f684c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z13 = bVar.Y;
                if (chat != null && !ChatObject.canAddChatToCommunity(chat)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.P(callback, z13, z10);
                return;
            case 10:
                ((m.p3) this.f683b).a();
                ((ii.d6) this.f684c).D((ii.o0) this.d);
                return;
            case 11:
                org.telegram.ui.Components.q.P((org.telegram.ui.Components.q) this.f683b, (TL_aicompose.AiComposeTone) this.f684c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 12:
                ((boolean[]) this.f683b)[0] = false;
                ((org.telegram.ui.Components.b5) this.f684c).J(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.b3) this.d).f18471a.dismissRunnable;
                runnable.run();
                return;
            case 13:
                Runnable runnable3 = (Runnable) this.f684c;
                org.telegram.ui.Components.z4 z4Var = (org.telegram.ui.Components.z4) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = ((org.telegram.ui.ActionBar.c2[]) this.f683b)[0];
                if (c2Var != null) {
                    c2Var.setOnDismissListener(null);
                }
                runnable3.run();
                z4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 14:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f683b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f684c).run();
                ((AlertDialog$Builder) this.d).f18447a.L0.run();
                return;
            case 15:
                ((org.telegram.ui.Components.g8) this.f683b).f24114n.B0((org.telegram.ui.Cells.x) this.f684c, (MessageObject) this.d);
                return;
            case 16:
                vi viVar = (vi) this.f683b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f684c;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = viVar.f28745f0;
                int i14 = viVar.J1;
                fi fiVar = viVar.I0;
                kf kfVar2 = viVar.f28751h0;
                if (kfVar2 != null) {
                    j3 = kfVar2.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                viVar.N0 = j10;
                fiVar.setEffect(j10);
                viVar.forceKeyboardOnDismiss();
                if (viVar.K - viVar.L < 0) {
                    AndroidUtilities.shakeView(viVar.f28784s);
                    AndroidUtilities.shakeView(viVar.v);
                    try {
                        fiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > viVar.L) {
                        viVar.O1(o2Var);
                    }
                    kf kfVar3 = viVar.f28751h0;
                    if (kfVar3 != null) {
                        kfVar3.h(false);
                        viVar.f28751h0 = null;
                        return;
                    }
                    return;
                }
                if (viVar.H1 == null && (o2Var2 instanceof bo)) {
                    bo boVar = (bo) o2Var2;
                    if (boVar.c()) {
                        org.telegram.ui.Components.c5.M(viVar.getContext(), boVar.a(), new z1(viVar, j10, 4), f6Var2);
                        z11 = false;
                        viVar.H1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                ni niVar = viVar.f28806y0;
                if (niVar != viVar.f28757j0 && niVar != viVar.f28777q0) {
                    if (!niVar.I(0, true, 0, viVar.s1(), j10)) {
                        viVar.A2 = true;
                        viVar.dismiss();
                    }
                    kfVar = null;
                    G1 = false;
                    z12 = true;
                } else {
                    kfVar = null;
                    z12 = true;
                    G1 = viVar.G1(0, true, 0, viVar.s1(), j10);
                }
                kf kfVar4 = viVar.f28751h0;
                if (kfVar4 != null) {
                    kfVar4.h(G1 ^ z12);
                    viVar.f28751h0 = kfVar;
                }
                viVar.H1(z11, z11);
                return;
            case 17:
                vi viVar2 = (vi) this.f683b;
                MessageObject messageObject = (MessageObject) this.f684c;
                viVar2.H1(!viVar2.f28735c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = viVar2.f28735c0;
                message.invert_media = z14;
                ((ub0) this.d).a(!z14, true);
                viVar2.f28751h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar2.f28757j0;
                if (chatAttachAlertPhotoLayout != null && (ub0Var = chatAttachAlertPhotoLayout.f21923d1) != null) {
                    ub0Var.a(!viVar2.f28735c0, true);
                }
                viVar2.f28751h0.n(!viVar2.f28735c0);
                return;
            case 18:
                ci.d dVar2 = (ci.d) this.d;
                ((Utilities.Callback) this.f684c).run(new nf.e(new xp(dVar2, 4), new oh(18, (mr) this.f683b, dVar2)));
                return;
            case 19:
                Context context2 = (Context) this.f684c;
                ((kr) this.f683b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.c9) this.d).f19891a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 20:
                bu buVar = (bu) this.f683b;
                fi.o oVar3 = (fi.o) this.f684c;
                ci.u1 u1Var = (ci.u1) this.d;
                try {
                    charSequence = ((ClipboardManager) buVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(buVar.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    oVar3.setText(charSequence);
                    oVar3.setSelection(0, oVar3.getText().length());
                }
                u1Var.run();
                return;
            case 21:
                ju juVar = (ju) this.f683b;
                qv0 qv0Var = (qv0) this.f684c;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.d;
                eu euVar = juVar.f25433a;
                hg.k kVar = juVar.f25434b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.q1 q1Var = juVar.K;
                    if (q1Var == null || !q1Var.f19512f) {
                        boolean z15 = true;
                        if (juVar.f25437n) {
                            euVar.hideActionMode();
                            n70 n70Var4 = new n70(qv0Var, f6Var3, kVar, false, false, true);
                            n70Var4.X = AndroidUtilities.dp(280.0f);
                            euVar.extendActionMode(null, new oa0(n70Var4, new org.telegram.ui.Components.x2(euVar, 4), euVar.getOnPremiumMenuLockClickListener()));
                            n70Var4.U = true;
                            n70Var4.Z();
                            return;
                        } else if (!juVar.e) {
                            juVar.x(1);
                            boolean isFocused = euVar.isFocused();
                            fu fuVar = juVar.d;
                            if (euVar.length() <= 0) {
                                z15 = false;
                            }
                            fuVar.B(z15, false);
                            euVar.requestFocus();
                            if (!isFocused) {
                                euVar.setSelection(euVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (juVar.f25441x) {
                                juVar.k(true);
                                juVar.f25441x = false;
                                juVar.p();
                            }
                            juVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 22:
                n20 n20Var = (n20) this.f683b;
                n20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f684c);
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f18447a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new lv(n20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.o2) this.d).showDialog(alertDialog$Builder.f18447a);
                return;
            case 23:
                v80 v80Var = (v80) this.f683b;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.d;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.f684c;
                try {
                    if (v80Var.f28651b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", v80Var.f28651b));
                        if (g3Var != null && g3Var.getContainer() != null) {
                            new vc(g3Var.getContainer(), null).k(false).j();
                        } else {
                            vc.j(o2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 24:
                pb0 pb0Var = (pb0) this.f683b;
                ub0 ub0Var2 = (ub0) this.f684c;
                ub0 ub0Var3 = (ub0) this.d;
                vb0 vb0Var = pb0Var.f26991c0;
                MessagePreviewParams messagePreviewParams = vb0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        vb0Var.f28682x = true;
                    }
                } else {
                    if (vb0Var.f28682x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    vb0Var.f28682x = false;
                }
                ub0Var2.a(z17, true);
                ub0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                pb0Var.h();
                pb0Var.k(true);
                return;
            case 25:
                ae0.n((ae0) this.f683b, (TLRPC.ChatFull) this.f684c, (g70) this.d);
                return;
            case 26:
                kf0 kf0Var = (kf0) this.f683b;
                Context context3 = (Context) this.f684c;
                org.telegram.ui.ActionBar.f6 f6Var4 = (org.telegram.ui.ActionBar.f6) this.d;
                if (kf0Var.h == null) {
                    ci.b4 b4Var = new ci.b4(context3, f6Var4, LocaleController.getString(R.string.VideoChooseCover), kf0Var.f25627f);
                    kf0Var.h = b4Var;
                    b4Var.setOnDismissListener(new bc0(kf0Var, 8));
                    kf0Var.h.f4390f = kf0Var.f25628n;
                }
                kf0Var.h.show();
                return;
            case 27:
                u31 u31Var = (u31) this.f683b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                w31 w31Var = u31Var.h;
                Runnable runnable4 = ((Runnable[]) this.f684c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = w31Var.v;
                v31 v31Var = w31Var.I;
                if (!TextUtils.equals(str2, localeInfo.pluralLangCode)) {
                    View view3 = v31Var.d;
                    if (view3 == w31Var.E || view3 == w31Var.f29516r) {
                        w31Var.f29518w = w31Var.v;
                    }
                    s31 s31Var = u31Var.e;
                    String str3 = localeInfo.pluralLangCode;
                    w31Var.v = str3;
                    s31Var.setText(w31.y(w31.E(str3, null, null)));
                    if (w31Var.h != null) {
                        view2 = w31Var.f29515n;
                    } else {
                        view2 = w31Var.f29520y;
                    }
                    v31Var.D(view2);
                    w31.I(w31Var.v);
                    w31Var.M();
                    return;
                }
                return;
            case 28:
                al alVar = (al) this.f683b;
                TranslateController translateController = (TranslateController) this.f684c;
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.d;
                long j11 = alVar.f26323b;
                translateController.setHideTranslateDialog(j11, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(alVar.f26322a).getChat(Long.valueOf(-j11));
                if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat2 != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                vc.a0(alVar.f26324c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new br0(13, alVar, translateController)).j();
                o1Var.d(true);
                return;
            default:
                cu0 cu0Var = (cu0) this.f683b;
                Context context4 = (Context) this.f684c;
                Bitmap bitmap = (Bitmap) this.d;
                if (cu0Var.L1) {
                    pg.x xVar2 = new pg.x(context4, cu0Var.Q1);
                    xVar2.m(cu0Var.K1.f40997a, 2);
                    xVar2.f41066n = new qg.w(cu0Var, bitmap);
                    xVar2.h = new qg.m(cu0Var, 1);
                    xVar2.show();
                    return;
                }
                Runnable runnable5 = cu0Var.U1;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
        }
    }

    public d0(v80 v80Var, org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f682a = 23;
        this.f683b = v80Var;
        this.d = g3Var;
        this.f684c = o2Var;
    }
}
