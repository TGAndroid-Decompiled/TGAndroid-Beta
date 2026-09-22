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
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.Components.za0;
import org.telegram.ui.au0;
import org.telegram.ui.e70;
import org.telegram.ui.zk;
import org.telegram.ui.zn;
public final class d0 implements View.OnClickListener {
    public final int f679a;
    public final Object f680b;
    public final Object f681c;
    public final Object d;

    public d0(Object obj, Object obj2, Object obj3, int i10) {
        this.f679a = i10;
        this.f680b = obj;
        this.f681c = obj2;
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
        mf mfVar;
        boolean z12;
        boolean G1;
        fc0 fc0Var;
        CharSequence charSequence;
        View view2;
        String string;
        switch (this.f679a) {
            case 0:
                ((y1) this.f680b).run(Long.valueOf(((long[]) this.f681c)[0]));
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                return;
            case 1:
                f6 f6Var = ((w5) this.f680b).f1655l;
                f6Var.F0((ci.ga) this.f681c, (TL_stories.StoryItem) this.d);
                w5 w5Var = f6Var.f851t1;
                if (w5Var != null) {
                    w5Var.a();
                    return;
                }
                return;
            case 2:
                w5 w5Var2 = (w5) this.f680b;
                jc jcVar = (jc) this.d;
                ((org.telegram.ui.ActionBar.f1) this.f681c).performHapticFeedback(3);
                xc X = xc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.e(12, w5Var2, jcVar))).j();
                    return;
                }
                return;
            case 3:
                s6 s6Var = (s6) this.f680b;
                y3 y3Var = new y3(s6Var, 1);
                j7 j7Var = s6Var.f1504b;
                new tv(y3Var, j7Var.getContext(), j7Var.f1050s, (ArrayList) this.f681c).show();
                ((y70) this.d).u();
                return;
            case 4:
                ci.ec ecVar = (ci.ec) this.f680b;
                FrameLayout frameLayout = (FrameLayout) this.f681c;
                d dVar = (d) this.d;
                y70 y70Var = ecVar.V0;
                if (y70Var == null || !y70Var.D()) {
                    ci.o oVar2 = new ci.o(ecVar, 0);
                    boolean isPremium = UserConfig.getInstance(ecVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new ci.o(ecVar, 1);
                    }
                    y70 F = y70.F(frameLayout, dVar, ecVar.T0);
                    ecVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    ecVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ci.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            y70 y70Var2 = ecVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.j6.E8;
                            y70Var2.b(0, null, str, i12, i12, new n8(oVar2, i11, 2));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                n8Var = new n8(oVar, i11, 3);
                            } else {
                                n8Var = null;
                            }
                            y70Var2.M(n8Var);
                            if (ecVar.X0 == i10) {
                                ecVar.V0.L();
                            }
                            i10++;
                        } else {
                            y70 y70Var3 = ecVar.V0;
                            y70Var3.f30568s = 0;
                            y70Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 5:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f681c;
                ci.s3 s3Var = (ci.s3) this.d;
                ci.x3 x3Var = ((ci.p3) this.f680b).f5303c;
                ArrayList arrayList = x3Var.f5743h0;
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
                ci.qb qbVar = (ci.qb) this.f680b;
                Context context = (Context) this.f681c;
                pg.u0 u0Var = (pg.u0) this.d;
                if (qbVar.B1) {
                    pg.x xVar = new pg.x(context, qbVar.G1);
                    qbVar.T1 = xVar;
                    xVar.m(qbVar.A1.f41314a, 2);
                    xVar.f41357n = new ci.s5(qbVar, u0Var);
                    xVar.h = new ci.l5(0, qbVar, u0Var);
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
                hg.e eVar = (hg.e) this.f680b;
                y70 F2 = y70.F(((zn) this.f681c).getLayoutContainer(), (org.telegram.ui.ActionBar.f6) this.d, eVar.f10261n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new hg.d(eVar, 1), true);
                F2.E();
                if (eVar.f10265x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new hg.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f30568s = 0;
                F2.Z();
                return;
            case 8:
                hg.l0.S((hg.l0) this.f680b, (TL_account.TL_connectedBot) this.f681c, (kd) this.d);
                return;
            case 9:
                hi.b bVar = (hi.b) this.f680b;
                Utilities.Callback callback = (Utilities.Callback) this.f681c;
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
                ((m.p3) this.f680b).a();
                ((ii.d6) this.f681c).D((ii.o0) this.d);
                return;
            case 11:
                org.telegram.ui.Components.q.P((org.telegram.ui.Components.q) this.f680b, (TL_aicompose.AiComposeTone) this.f681c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 12:
                ((boolean[]) this.f680b)[0] = false;
                ((org.telegram.ui.Components.c5) this.f681c).J(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f18674a.dismissRunnable;
                runnable.run();
                return;
            case 13:
                Runnable runnable3 = (Runnable) this.f681c;
                org.telegram.ui.Components.a5 a5Var = (org.telegram.ui.Components.a5) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f680b)[0];
                if (b2Var != null) {
                    b2Var.setOnDismissListener(null);
                }
                runnable3.run();
                a5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 14:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f680b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f681c).run();
                ((AlertDialog$Builder) this.d).f18669a.L0.run();
                return;
            case 15:
                ((org.telegram.ui.Components.h8) this.f680b).f24710n.B0((org.telegram.ui.Cells.x) this.f681c, (MessageObject) this.d);
                return;
            case 16:
                vi viVar = (vi) this.f680b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f681c;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f29096f0;
                int i14 = viVar.J1;
                fi fiVar = viVar.I0;
                mf mfVar2 = viVar.f29102h0;
                if (mfVar2 != null) {
                    j3 = mfVar2.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                viVar.N0 = j10;
                fiVar.setEffect(j10);
                viVar.forceKeyboardOnDismiss();
                if (viVar.K - viVar.L < 0) {
                    AndroidUtilities.shakeView(viVar.f29135s);
                    AndroidUtilities.shakeView(viVar.v);
                    try {
                        fiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > viVar.L) {
                        viVar.O1(n2Var);
                    }
                    mf mfVar3 = viVar.f29102h0;
                    if (mfVar3 != null) {
                        mfVar3.h(false);
                        viVar.f29102h0 = null;
                        return;
                    }
                    return;
                }
                if (viVar.H1 == null && (n2Var2 instanceof zn)) {
                    zn znVar = (zn) n2Var2;
                    if (znVar.c()) {
                        org.telegram.ui.Components.d5.M(viVar.getContext(), znVar.a(), new z1(viVar, j10, 4), f6Var2);
                        z11 = false;
                        viVar.H1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                ni niVar = viVar.f29157y0;
                if (niVar != viVar.f29108j0 && niVar != viVar.f29128q0) {
                    if (!niVar.I(0, true, 0, viVar.s1(), j10)) {
                        viVar.A2 = true;
                        viVar.dismiss();
                    }
                    mfVar = null;
                    G1 = false;
                    z12 = true;
                } else {
                    mfVar = null;
                    z12 = true;
                    G1 = viVar.G1(0, true, 0, viVar.s1(), j10);
                }
                mf mfVar4 = viVar.f29102h0;
                if (mfVar4 != null) {
                    mfVar4.h(G1 ^ z12);
                    viVar.f29102h0 = mfVar;
                }
                viVar.H1(z11, z11);
                return;
            case 17:
                vi viVar2 = (vi) this.f680b;
                MessageObject messageObject = (MessageObject) this.f681c;
                viVar2.H1(!viVar2.f29086c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = viVar2.f29086c0;
                message.invert_media = z14;
                ((fc0) this.d).a(!z14, true);
                viVar2.f29102h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar2.f29108j0;
                if (chatAttachAlertPhotoLayout != null && (fc0Var = chatAttachAlertPhotoLayout.f22147d1) != null) {
                    fc0Var.a(!viVar2.f29086c0, true);
                }
                viVar2.f29102h0.n(!viVar2.f29086c0);
                return;
            case 18:
                ci.d dVar2 = (ci.d) this.d;
                ((Utilities.Callback) this.f681c).run(new nf.e(new xp(dVar2, 4), new tc(24, (mr) this.f680b, dVar2)));
                return;
            case 19:
                Context context2 = (Context) this.f681c;
                ((kr) this.f680b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.d9) this.d).f20155a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 20:
                bu buVar = (bu) this.f680b;
                fi.o oVar3 = (fi.o) this.f681c;
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
                ju juVar = (ju) this.f680b;
                cw0 cw0Var = (cw0) this.f681c;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.d;
                eu euVar = juVar.f25458a;
                hg.k kVar = juVar.f25459b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.p1 p1Var = juVar.K;
                    if (p1Var == null || !p1Var.f19718f) {
                        boolean z15 = true;
                        if (juVar.f25462n) {
                            euVar.hideActionMode();
                            y70 y70Var4 = new y70(cw0Var, f6Var3, kVar, false, false, true);
                            y70Var4.X = AndroidUtilities.dp(280.0f);
                            euVar.extendActionMode(null, new za0(y70Var4, new org.telegram.ui.Components.x2(euVar, 4), euVar.getOnPremiumMenuLockClickListener()));
                            y70Var4.U = true;
                            y70Var4.Z();
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
                            if (juVar.f25466x) {
                                juVar.k(true);
                                juVar.f25466x = false;
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
                n20 n20Var = (n20) this.f680b;
                n20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f681c);
                alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f18669a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new mv(n20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.n2) this.d).showDialog(alertDialog$Builder.f18669a);
                return;
            case 23:
                g90 g90Var = (g90) this.f680b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.f681c;
                try {
                    if (g90Var.f24470b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", g90Var.f24470b));
                        if (f3Var != null && f3Var.getContainer() != null) {
                            new xc(f3Var.getContainer(), null).k(false).j();
                        } else {
                            xc.j(n2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 24:
                ac0 ac0Var = (ac0) this.f680b;
                fc0 fc0Var2 = (fc0) this.f681c;
                fc0 fc0Var3 = (fc0) this.d;
                gc0 gc0Var = ac0Var.f22625c0;
                MessagePreviewParams messagePreviewParams = gc0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        gc0Var.f24502x = true;
                    }
                } else {
                    if (gc0Var.f24502x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    gc0Var.f24502x = false;
                }
                fc0Var2.a(z17, true);
                fc0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                ac0Var.h();
                ac0Var.k(true);
                return;
            case 25:
                le0.n((le0) this.f680b, (TLRPC.ChatFull) this.f681c, (e70) this.d);
                return;
            case 26:
                vf0 vf0Var = (vf0) this.f680b;
                Context context3 = (Context) this.f681c;
                org.telegram.ui.ActionBar.f6 f6Var4 = (org.telegram.ui.ActionBar.f6) this.d;
                if (vf0Var.h == null) {
                    ci.b4 b4Var = new ci.b4(context3, f6Var4, LocaleController.getString(R.string.VideoChooseCover), vf0Var.f29067f);
                    vf0Var.h = b4Var;
                    b4Var.setOnDismissListener(new jc0(vf0Var, 9));
                    vf0Var.h.f4389f = vf0Var.f29068n;
                }
                vf0Var.h.show();
                return;
            case 27:
                j41 j41Var = (j41) this.f680b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                l41 l41Var = j41Var.h;
                Runnable runnable4 = ((Runnable[]) this.f681c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = l41Var.v;
                k41 k41Var = l41Var.I;
                if (!TextUtils.equals(str2, localeInfo.pluralLangCode)) {
                    View view3 = k41Var.d;
                    if (view3 == l41Var.E || view3 == l41Var.f25991r) {
                        l41Var.f25993w = l41Var.v;
                    }
                    h41 h41Var = j41Var.e;
                    String str3 = localeInfo.pluralLangCode;
                    l41Var.v = str3;
                    h41Var.setText(l41.y(l41.D(str3, null, null)));
                    if (l41Var.h != null) {
                        view2 = l41Var.f25990n;
                    } else {
                        view2 = l41Var.f25995y;
                    }
                    k41Var.D(view2);
                    l41.I(l41Var.v);
                    l41Var.M();
                    return;
                }
                return;
            case 28:
                zk zkVar = (zk) this.f680b;
                TranslateController translateController = (TranslateController) this.f681c;
                org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.d;
                long j11 = zkVar.f23181b;
                translateController.setHideTranslateDialog(j11, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(zkVar.f23180a).getChat(Long.valueOf(-j11));
                if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat2 != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                xc.a0(zkVar.f23182c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new yn0(19, zkVar, translateController)).j();
                n1Var.d(true);
                return;
            default:
                au0 au0Var = (au0) this.f680b;
                Context context4 = (Context) this.f681c;
                Bitmap bitmap = (Bitmap) this.d;
                if (au0Var.L1) {
                    pg.x xVar2 = new pg.x(context4, au0Var.Q1);
                    xVar2.m(au0Var.K1.f41314a, 2);
                    xVar2.f41357n = new qg.w(au0Var, bitmap);
                    xVar2.h = new qg.m(au0Var, 1);
                    xVar2.show();
                    return;
                }
                Runnable runnable5 = au0Var.U1;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
        }
    }

    public d0(g90 g90Var, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f679a = 23;
        this.f680b = g90Var;
        this.d = f3Var;
        this.f681c = n2Var;
    }
}
