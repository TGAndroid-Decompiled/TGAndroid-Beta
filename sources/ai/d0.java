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
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.jw;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.nd;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.y41;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.al;
import org.telegram.ui.au0;
import org.telegram.ui.c70;
import org.telegram.ui.zn;
public final class d0 implements View.OnClickListener {
    public final int f800a;
    public final Object f801b;
    public final Object f802c;
    public final Object d;

    public d0(Object obj, Object obj2, Object obj3, int i10) {
        this.f800a = i10;
        this.f801b = obj;
        this.f802c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        ci.o oVar;
        String formatPluralString;
        p8 p8Var;
        boolean z10;
        Runnable runnable;
        long j3;
        boolean z11;
        boolean z12;
        pf pfVar;
        boolean J1;
        uc0 uc0Var;
        CharSequence charSequence;
        View view2;
        String string;
        switch (this.f800a) {
            case 0:
                ((g3) this.f801b).run(Long.valueOf(((long[]) this.f802c)[0]));
                ((org.telegram.ui.ActionBar.e3) this.d).dismiss();
                return;
            case 1:
                f6 f6Var = ((w5) this.f801b).f1860l;
                f6Var.F0((ci.da) this.f802c, (TL_stories.StoryItem) this.d);
                w5 w5Var = f6Var.f1006t1;
                if (w5Var != null) {
                    w5Var.a();
                    return;
                }
                return;
            case 2:
                w5 w5Var2 = (w5) this.f801b;
                kc kcVar = (kc) this.d;
                ((org.telegram.ui.ActionBar.e1) this.f802c).performHapticFeedback(3);
                ad X = ad.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.f(12, w5Var2, kcVar))).j();
                    return;
                }
                return;
            case 3:
                t6 t6Var = (t6) this.f801b;
                z3 z3Var = new z3(t6Var, 1);
                l7 l7Var = t6Var.f1737b;
                new jw(z3Var, l7Var.getContext(), l7Var.f1341s, (ArrayList) this.f802c).show();
                ((p80) this.d).u();
                return;
            case 4:
                ci.bc bcVar = (ci.bc) this.f801b;
                FrameLayout frameLayout = (FrameLayout) this.f802c;
                d dVar = (d) this.d;
                p80 p80Var = bcVar.V0;
                if (p80Var == null || !p80Var.D()) {
                    ci.o oVar2 = new ci.o(bcVar, 0);
                    boolean isPremium = UserConfig.getInstance(bcVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new ci.o(bcVar, 1);
                    }
                    p80 F = p80.F(frameLayout, dVar, bcVar.T0);
                    bcVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    bcVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ci.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            p80 p80Var2 = bcVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.h6.E8;
                            p80Var2.b(0, null, str, i12, i12, new p8(oVar2, i11, 2));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                p8Var = new p8(oVar, i11, 3);
                            } else {
                                p8Var = null;
                            }
                            p80Var2.M(p8Var);
                            if (bcVar.X0 == i10) {
                                bcVar.V0.L();
                            }
                            i10++;
                        } else {
                            p80 p80Var3 = bcVar.V0;
                            p80Var3.f29779s = 0;
                            p80Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 5:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f802c;
                ci.q3 q3Var = (ci.q3) this.d;
                ci.v3 v3Var = ((ci.n3) this.f801b).f5631c;
                ArrayList arrayList = v3Var.f6139h0;
                if (arrayList.contains(photoEntry)) {
                    arrayList.remove(photoEntry);
                } else if (arrayList.size() + 1 > v3Var.R) {
                    int i13 = -v3Var.N;
                    v3Var.N = i13;
                    AndroidUtilities.shakeViewSpring(q3Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                } else {
                    arrayList.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(v3Var.d);
                v3Var.j();
                return;
            case 6:
                ci.nb nbVar = (ci.nb) this.f801b;
                Context context = (Context) this.f802c;
                pg.u0 u0Var = (pg.u0) this.d;
                if (nbVar.B1) {
                    pg.x xVar = new pg.x(context, nbVar.G1);
                    nbVar.T1 = xVar;
                    xVar.o(nbVar.A1.f45846a, 2);
                    xVar.f45905n = new ci.q5(nbVar, u0Var);
                    xVar.h = new ci.j5(0, nbVar, u0Var);
                    xVar.show();
                    return;
                }
                Runnable runnable2 = nbVar.K1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 7:
                hg.f fVar = (hg.f) this.f801b;
                p80 F2 = p80.F(((zn) this.f802c).getLayoutContainer(), (org.telegram.ui.ActionBar.d6) this.d, fVar.f11221n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new hg.e(fVar, 1), true);
                F2.E();
                if (fVar.f11225x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new hg.e(fVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f29779s = 0;
                F2.Z();
                return;
            case 8:
                hg.l0.T((hg.l0) this.f801b, (TL_account.TL_connectedBot) this.f802c, (nd) this.d);
                return;
            case 9:
                hi.b bVar = (hi.b) this.f801b;
                Utilities.Callback callback = (Utilities.Callback) this.f802c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z13 = bVar.Y;
                if (chat != null && !ChatObject.canAddChatToCommunity(chat)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.Q(callback, z13, z10);
                return;
            case 10:
                ((m.q3) this.f801b).a();
                ((ii.f6) this.f802c).D((ii.o0) this.d);
                return;
            case 11:
                org.telegram.ui.Components.q.Q((org.telegram.ui.Components.q) this.f801b, (TL_aicompose.AiComposeTone) this.f802c, (org.telegram.ui.ActionBar.d6) this.d);
                return;
            case 12:
                ((boolean[]) this.f801b)[0] = false;
                ((org.telegram.ui.Components.f5) this.f802c).J(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.z2) this.d).f21746a.dismissRunnable;
                runnable.run();
                return;
            case 13:
                Runnable runnable3 = (Runnable) this.f802c;
                org.telegram.ui.Components.d5 d5Var = (org.telegram.ui.Components.d5) this.d;
                org.telegram.ui.ActionBar.a2 a2Var = ((org.telegram.ui.ActionBar.a2[]) this.f801b)[0];
                if (a2Var != null) {
                    a2Var.setOnDismissListener(null);
                }
                runnable3.run();
                d5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 14:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f801b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f802c).run();
                ((AlertDialog$Builder) this.d).f20404a.L0.run();
                return;
            case 15:
                ((org.telegram.ui.Components.k8) this.f801b).f27981n.C0((org.telegram.ui.Cells.x) this.f802c, (MessageObject) this.d);
                return;
            case 16:
                yi yiVar = (yi) this.f801b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f802c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = yiVar.f33289f0;
                int i14 = yiVar.M1;
                ii iiVar = yiVar.L0;
                pf pfVar2 = yiVar.f33295h0;
                if (pfVar2 != null) {
                    j3 = pfVar2.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                yiVar.Q0 = j10;
                iiVar.setEffect(j10);
                yiVar.forceKeyboardOnDismiss();
                if (yiVar.K - yiVar.L < 0) {
                    AndroidUtilities.shakeView(yiVar.f33328s);
                    AndroidUtilities.shakeView(yiVar.v);
                    try {
                        iiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > yiVar.L) {
                        yiVar.S1(m2Var);
                    }
                    pf pfVar3 = yiVar.f33295h0;
                    if (pfVar3 != null) {
                        pfVar3.h(false);
                        yiVar.f33295h0 = null;
                        return;
                    }
                    return;
                }
                if (yiVar.K1 == null && (m2Var2 instanceof zn)) {
                    zn znVar = (zn) m2Var2;
                    if (znVar.c()) {
                        org.telegram.ui.Components.g5.L(yiVar.getContext(), znVar.a(), new z1(yiVar, j10, 4), d6Var);
                        z11 = false;
                        yiVar.K1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                qi qiVar = yiVar.B0;
                if (qiVar != yiVar.f33301j0 && qiVar != yiVar.f33321q0) {
                    if (!qiVar.K(0, true, 0, yiVar.u1(), j10)) {
                        yiVar.D2 = true;
                        yiVar.dismiss();
                    }
                    J1 = false;
                    z12 = true;
                    pfVar = null;
                } else {
                    z12 = true;
                    pfVar = null;
                    J1 = yiVar.J1(0, true, 0, yiVar.u1(), j10);
                }
                pf pfVar4 = yiVar.f33295h0;
                if (pfVar4 != null) {
                    pfVar4.h(J1 ^ z12);
                    yiVar.f33295h0 = pfVar;
                }
                yiVar.K1(z11, z11);
                return;
            case 17:
                yi yiVar2 = (yi) this.f801b;
                MessageObject messageObject = (MessageObject) this.f802c;
                yiVar2.K1(!yiVar2.f33278c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = yiVar2.f33278c0;
                message.invert_media = z14;
                ((uc0) this.d).a(!z14, true);
                yiVar2.f33295h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar2.f33301j0;
                if (chatAttachAlertPhotoLayout != null && (uc0Var = chatAttachAlertPhotoLayout.f24061d1) != null) {
                    uc0Var.a(!yiVar2.f33278c0, true);
                }
                yiVar2.f33295h0.n(!yiVar2.f33278c0);
                return;
            case 18:
                ci.d dVar2 = (ci.d) this.d;
                ((Utilities.Callback) this.f802c).run(new of.e(new nq(dVar2, 4), new wc(29, (es) this.f801b, dVar2)));
                return;
            case 19:
                Context context2 = (Context) this.f802c;
                ((cs) this.f801b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.c9) this.d).f21959a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 20:
                su suVar = (su) this.f801b;
                fi.o oVar3 = (fi.o) this.f802c;
                ci.t1 t1Var = (ci.t1) this.d;
                try {
                    charSequence = ((ClipboardManager) suVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(suVar.getContext());
                } catch (Exception e7) {
                    FileLog.e(e7);
                    charSequence = null;
                }
                if (charSequence != null) {
                    oVar3.setText(charSequence);
                    oVar3.setSelection(0, oVar3.getText().length());
                }
                t1Var.run();
                return;
            case 21:
                av avVar = (av) this.f801b;
                tw0 tw0Var = (tw0) this.f802c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                vu vuVar = avVar.f24679a;
                hg.l lVar = avVar.f24680b;
                if (lVar.isEnabled() && lVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.o1 o1Var = avVar.K;
                    if (o1Var == null || !o1Var.f21448f) {
                        boolean z15 = true;
                        if (avVar.f24684n) {
                            vuVar.hideActionMode();
                            p80 p80Var4 = new p80(tw0Var, d6Var2, lVar, false, false, true);
                            p80Var4.X = AndroidUtilities.dp(280.0f);
                            vuVar.extendActionMode(null, new qb0(p80Var4, new org.telegram.ui.Components.a3(vuVar, 4), vuVar.getOnPremiumMenuLockClickListener()));
                            p80Var4.U = true;
                            p80Var4.Z();
                            return;
                        } else if (!avVar.f24682e) {
                            avVar.x(1);
                            boolean isFocused = vuVar.isFocused();
                            wu wuVar = avVar.d;
                            if (vuVar.length() <= 0) {
                                z15 = false;
                            }
                            wuVar.D(z15, false);
                            vuVar.requestFocus();
                            if (!isFocused) {
                                vuVar.setSelection(vuVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (avVar.f24688x) {
                                avVar.k(true);
                                avVar.f24688x = false;
                                avVar.p();
                            }
                            avVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 22:
                f30 f30Var = (f30) this.f801b;
                f30Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f802c);
                alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f20404a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new cw(f30Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.m2) this.d).showDialog(alertDialog$Builder.f20404a);
                return;
            case 23:
                x90 x90Var = (x90) this.f801b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) this.f802c;
                try {
                    if (x90Var.f32913b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", x90Var.f32913b));
                        if (e3Var != null && e3Var.getContainer() != null) {
                            new ad(e3Var.getContainer(), null).k(false).j();
                        } else {
                            ad.j(m2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 24:
                pc0 pc0Var = (pc0) this.f801b;
                uc0 uc0Var2 = (uc0) this.f802c;
                uc0 uc0Var3 = (uc0) this.d;
                vc0 vc0Var = pc0Var.f29848c0;
                MessagePreviewParams messagePreviewParams = vc0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        vc0Var.f31860x = true;
                    }
                } else {
                    if (vc0Var.f31860x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    vc0Var.f31860x = false;
                }
                uc0Var2.a(z17, true);
                uc0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                pc0Var.h();
                pc0Var.k(true);
                return;
            case 25:
                cf0.p((cf0) this.f801b, (TLRPC.ChatFull) this.f802c, (c70) this.d);
                return;
            case 26:
                mg0 mg0Var = (mg0) this.f801b;
                Context context3 = (Context) this.f802c;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.d;
                if (mg0Var.h == null) {
                    ci.z3 z3Var2 = new ci.z3(context3, d6Var3, LocaleController.getString(R.string.VideoChooseCover), mg0Var.f28853f);
                    mg0Var.h = z3Var2;
                    z3Var2.setOnDismissListener(new yc0(mg0Var, 9));
                    mg0Var.h.f6418f = mg0Var.f28854n;
                }
                mg0Var.h.show();
                return;
            case 27:
                a51 a51Var = (a51) this.f801b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                c51 c51Var = a51Var.f24513n;
                Runnable runnable4 = ((Runnable[]) this.f802c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = c51Var.v;
                b51 b51Var = c51Var.I;
                if (!TextUtils.equals(str2, localeInfo.pluralLangCode)) {
                    View view3 = b51Var.d;
                    if (view3 == c51Var.E || view3 == c51Var.f25234r) {
                        c51Var.f25236w = c51Var.v;
                    }
                    y41 y41Var = a51Var.f24511e;
                    String str3 = localeInfo.pluralLangCode;
                    c51Var.v = str3;
                    y41Var.setText(c51.B(c51.F(str3, null, null)));
                    if (c51Var.h != null) {
                        view2 = c51Var.f25233n;
                    } else {
                        view2 = c51Var.f25238y;
                    }
                    b51Var.D(view2);
                    c51.J(c51Var.v);
                    c51Var.N();
                    return;
                }
                return;
            case 28:
                al alVar = (al) this.f801b;
                TranslateController translateController = (TranslateController) this.f802c;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.d;
                long j11 = alVar.f31074b;
                translateController.setHideTranslateDialog(j11, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(alVar.f31073a).getChat(Long.valueOf(-j11));
                if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat2 != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                ad.a0(alVar.f31075c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new ei0(23, alVar, translateController)).j();
                m1Var.d(true);
                return;
            default:
                au0 au0Var = (au0) this.f801b;
                Context context4 = (Context) this.f802c;
                Bitmap bitmap = (Bitmap) this.d;
                if (au0Var.L1) {
                    pg.x xVar2 = new pg.x(context4, au0Var.Q1);
                    xVar2.o(au0Var.K1.f45846a, 2);
                    xVar2.f45905n = new qg.v(au0Var, bitmap);
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

    public d0(x90 x90Var, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f800a = 23;
        this.f801b = x90Var;
        this.d = e3Var;
        this.f802c = m2Var;
    }
}
