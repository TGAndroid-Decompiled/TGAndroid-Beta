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
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.be;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yc;
import org.telegram.ui.d70;
import org.telegram.ui.vt0;
import org.telegram.ui.wk;
import org.telegram.ui.yn;
public final class d0 implements View.OnClickListener {
    public final int f747a;
    public final Object f748b;
    public final Object f749c;
    public final Object d;

    public d0(Object obj, Object obj2, Object obj3, int i10) {
        this.f747a = i10;
        this.f748b = obj;
        this.f749c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        ci.o oVar;
        String formatPluralString;
        o8 o8Var;
        boolean z10;
        Runnable runnable;
        long j3;
        boolean z11;
        of ofVar;
        boolean z12;
        boolean D1;
        hc0 hc0Var;
        CharSequence charSequence;
        View view2;
        String string;
        switch (this.f747a) {
            case 0:
                ((f3) this.f748b).run(Long.valueOf(((long[]) this.f749c)[0]));
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                return;
            case 1:
                e6 e6Var = ((v5) this.f748b).f1756l;
                e6Var.F0((ci.ca) this.f749c, (TL_stories.StoryItem) this.d);
                v5 v5Var = e6Var.f895t1;
                if (v5Var != null) {
                    v5Var.a();
                    return;
                }
                return;
            case 2:
                v5 v5Var2 = (v5) this.f748b;
                jc jcVar = (jc) this.d;
                ((org.telegram.ui.ActionBar.f1) this.f749c).performHapticFeedback(3);
                yc X = yc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.e(12, v5Var2, jcVar))).j();
                    return;
                }
                return;
            case 3:
                s6 s6Var = (s6) this.f748b;
                y3 y3Var = new y3(s6Var, 1);
                k7 k7Var = s6Var.f1630b;
                new wv(y3Var, k7Var.getContext(), k7Var.f1222s, (ArrayList) this.f749c).show();
                ((b80) this.d).u();
                return;
            case 4:
                ci.ac acVar = (ci.ac) this.f748b;
                FrameLayout frameLayout = (FrameLayout) this.f749c;
                d dVar = (d) this.d;
                b80 b80Var = acVar.V0;
                if (b80Var == null || !b80Var.D()) {
                    ci.o oVar2 = new ci.o(acVar, 0);
                    boolean isPremium = UserConfig.getInstance(acVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new ci.o(acVar, 1);
                    }
                    b80 F = b80.F(frameLayout, dVar, acVar.T0);
                    acVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    acVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ci.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            b80 b80Var2 = acVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.i6.E8;
                            b80Var2.b(0, null, str, i12, i12, new o8(oVar2, i11, 2));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                o8Var = new o8(oVar, i11, 3);
                            } else {
                                o8Var = null;
                            }
                            b80Var2.M(o8Var);
                            if (acVar.X0 == i10) {
                                acVar.V0.L();
                            }
                            i10++;
                        } else {
                            b80 b80Var3 = acVar.V0;
                            b80Var3.f24844s = 0;
                            b80Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 5:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f749c;
                ci.r3 r3Var = (ci.r3) this.d;
                ci.w3 w3Var = ((ci.o3) this.f748b).f5650c;
                ArrayList arrayList = w3Var.f6219h0;
                if (arrayList.contains(photoEntry)) {
                    arrayList.remove(photoEntry);
                } else if (arrayList.size() + 1 > w3Var.R) {
                    int i13 = -w3Var.N;
                    w3Var.N = i13;
                    AndroidUtilities.shakeViewSpring(r3Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                } else {
                    arrayList.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(w3Var.d);
                w3Var.j();
                return;
            case 6:
                ci.mb mbVar = (ci.mb) this.f748b;
                Context context = (Context) this.f749c;
                pg.u0 u0Var = (pg.u0) this.d;
                if (mbVar.B1) {
                    pg.x xVar = new pg.x(context, mbVar.G1);
                    mbVar.T1 = xVar;
                    xVar.m(mbVar.A1.f44630a, 2);
                    xVar.f44678n = new ci.r5(mbVar, u0Var);
                    xVar.h = new ci.k5(0, mbVar, u0Var);
                    xVar.show();
                    return;
                }
                Runnable runnable2 = mbVar.K1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 7:
                hg.e eVar = (hg.e) this.f748b;
                b80 F2 = b80.F(((yn) this.f749c).getLayoutContainer(), (org.telegram.ui.ActionBar.d6) this.d, eVar.f11158n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new hg.d(eVar, 1), true);
                F2.E();
                if (eVar.f11162x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new hg.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f24844s = 0;
                F2.Z();
                return;
            case 8:
                hg.l0.Q((hg.l0) this.f748b, (TL_account.TL_connectedBot) this.f749c, (ld) this.d);
                return;
            case 9:
                hi.b bVar = (hi.b) this.f748b;
                Utilities.Callback callback = (Utilities.Callback) this.f749c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z13 = bVar.Y;
                if (chat != null && !ChatObject.canAddChatToCommunity(chat)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.N(callback, z13, z10);
                return;
            case 10:
                ((m.p3) this.f748b).a();
                ((ii.f6) this.f749c).D((ii.o0) this.d);
                return;
            case 11:
                org.telegram.ui.Components.q.N((org.telegram.ui.Components.q) this.f748b, (TL_aicompose.AiComposeTone) this.f749c, (org.telegram.ui.ActionBar.d6) this.d);
                return;
            case 12:
                ((boolean[]) this.f748b)[0] = false;
                ((org.telegram.ui.Components.d5) this.f749c).K(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f20373a.dismissRunnable;
                runnable.run();
                return;
            case 13:
                Runnable runnable3 = (Runnable) this.f749c;
                org.telegram.ui.Components.b5 b5Var = (org.telegram.ui.Components.b5) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f748b)[0];
                if (b2Var != null) {
                    b2Var.setOnDismissListener(null);
                }
                runnable3.run();
                b5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 14:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f748b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f749c).run();
                ((AlertDialog$Builder) this.d).f20367a.L0.run();
                return;
            case 15:
                ((org.telegram.ui.Components.i8) this.f748b).f27329n.B0((org.telegram.ui.Cells.x) this.f749c, (MessageObject) this.d);
                return;
            case 16:
                xi xiVar = (xi) this.f748b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f749c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = xiVar.f32812f0;
                int i14 = xiVar.J1;
                ei eiVar = xiVar.I0;
                of ofVar2 = xiVar.f32818h0;
                if (ofVar2 != null) {
                    j3 = ofVar2.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                xiVar.N0 = j10;
                eiVar.setEffect(j10);
                xiVar.forceKeyboardOnDismiss();
                if (xiVar.K - xiVar.L < 0) {
                    AndroidUtilities.shakeView(xiVar.f32851s);
                    AndroidUtilities.shakeView(xiVar.v);
                    try {
                        eiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > xiVar.L) {
                        xiVar.L1(n2Var);
                    }
                    of ofVar3 = xiVar.f32818h0;
                    if (ofVar3 != null) {
                        ofVar3.h(false);
                        xiVar.f32818h0 = null;
                        return;
                    }
                    return;
                }
                if (xiVar.H1 == null && (n2Var2 instanceof yn)) {
                    yn ynVar = (yn) n2Var2;
                    if (ynVar.c()) {
                        org.telegram.ui.Components.e5.M(xiVar.getContext(), ynVar.a(), new z1(xiVar, j10, 4), d6Var);
                        z11 = false;
                        xiVar.E1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                pi piVar = xiVar.f32873y0;
                if (piVar != xiVar.f32824j0 && piVar != xiVar.f32844q0) {
                    if (!piVar.G(0, true, 0, xiVar.p1(), j10)) {
                        xiVar.A2 = true;
                        xiVar.dismiss();
                    }
                    ofVar = null;
                    D1 = false;
                    z12 = true;
                } else {
                    ofVar = null;
                    z12 = true;
                    D1 = xiVar.D1(0, true, 0, xiVar.p1(), j10);
                }
                of ofVar4 = xiVar.f32818h0;
                if (ofVar4 != null) {
                    ofVar4.h(D1 ^ z12);
                    xiVar.f32818h0 = ofVar;
                }
                xiVar.E1(z11, z11);
                return;
            case 17:
                xi xiVar2 = (xi) this.f748b;
                MessageObject messageObject = (MessageObject) this.f749c;
                xiVar2.E1(!xiVar2.f32801c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = xiVar2.f32801c0;
                message.invert_media = z14;
                ((hc0) this.d).a(!z14, true);
                xiVar2.f32818h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar2.f32824j0;
                if (chatAttachAlertPhotoLayout != null && (hc0Var = chatAttachAlertPhotoLayout.f24029d1) != null) {
                    hc0Var.a(!xiVar2.f32801c0, true);
                }
                xiVar2.f32818h0.n(!xiVar2.f32801c0);
                return;
            case 18:
                ci.d dVar2 = (ci.d) this.d;
                ((Utilities.Callback) this.f749c).run(new nf.e(new aq(dVar2, 4), new be(22, (pr) this.f748b, dVar2)));
                return;
            case 19:
                Context context2 = (Context) this.f749c;
                ((nr) this.f748b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.c9) this.d).f21887a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 20:
                eu euVar = (eu) this.f748b;
                fi.o oVar3 = (fi.o) this.f749c;
                ci.u1 u1Var = (ci.u1) this.d;
                try {
                    charSequence = ((ClipboardManager) euVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(euVar.getContext());
                } catch (Exception e7) {
                    FileLog.e(e7);
                    charSequence = null;
                }
                if (charSequence != null) {
                    oVar3.setText(charSequence);
                    oVar3.setSelection(0, oVar3.getText().length());
                }
                u1Var.run();
                return;
            case 21:
                mu muVar = (mu) this.f748b;
                lw0 lw0Var = (lw0) this.f749c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                hu huVar = muVar.f28704a;
                hg.k kVar = muVar.f28705b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.p1 p1Var = muVar.K;
                    if (p1Var == null || !p1Var.f21448f) {
                        boolean z15 = true;
                        if (muVar.f28709n) {
                            huVar.hideActionMode();
                            b80 b80Var4 = new b80(lw0Var, d6Var2, kVar, false, false, true);
                            b80Var4.X = AndroidUtilities.dp(280.0f);
                            huVar.extendActionMode(null, new cb0(b80Var4, new org.telegram.ui.Components.y2(huVar, 4), huVar.getOnPremiumMenuLockClickListener()));
                            b80Var4.U = true;
                            b80Var4.Z();
                            return;
                        } else if (!muVar.f28707e) {
                            muVar.x(1);
                            boolean isFocused = huVar.isFocused();
                            iu iuVar = muVar.d;
                            if (huVar.length() <= 0) {
                                z15 = false;
                            }
                            iuVar.B(z15, false);
                            huVar.requestFocus();
                            if (!isFocused) {
                                huVar.setSelection(huVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (muVar.f28713x) {
                                muVar.k(true);
                                muVar.f28713x = false;
                                muVar.p();
                            }
                            muVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 22:
                r20 r20Var = (r20) this.f748b;
                r20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f749c);
                alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f20367a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new pv(r20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.n2) this.d).showDialog(alertDialog$Builder.f20367a);
                return;
            case 23:
                j90 j90Var = (j90) this.f748b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.f749c;
                try {
                    if (j90Var.f27684b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", j90Var.f27684b));
                        if (f3Var != null && f3Var.getContainer() != null) {
                            new yc(f3Var.getContainer(), null).k(false).j();
                        } else {
                            yc.j(n2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 24:
                cc0 cc0Var = (cc0) this.f748b;
                hc0 hc0Var2 = (hc0) this.f749c;
                hc0 hc0Var3 = (hc0) this.d;
                ic0 ic0Var = cc0Var.f25320c0;
                MessagePreviewParams messagePreviewParams = ic0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        ic0Var.f27364x = true;
                    }
                } else {
                    if (ic0Var.f27364x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    ic0Var.f27364x = false;
                }
                hc0Var2.a(z17, true);
                hc0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                cc0Var.h();
                cc0Var.k(true);
                return;
            case 25:
                me0.n((me0) this.f748b, (TLRPC.ChatFull) this.f749c, (d70) this.d);
                return;
            case 26:
                wf0 wf0Var = (wf0) this.f748b;
                Context context3 = (Context) this.f749c;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.d;
                if (wf0Var.h == null) {
                    ci.a4 a4Var = new ci.a4(context3, d6Var3, LocaleController.getString(R.string.VideoChooseCover), wf0Var.f32528f);
                    wf0Var.h = a4Var;
                    a4Var.setOnDismissListener(new lc0(wf0Var, 9));
                    wf0Var.h.f4694f = wf0Var.f32529n;
                }
                wf0Var.h.show();
                return;
            case 27:
                r41 r41Var = (r41) this.f748b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                t41 t41Var = r41Var.h;
                Runnable runnable4 = ((Runnable[]) this.f749c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = t41Var.v;
                s41 s41Var = t41Var.I;
                if (!TextUtils.equals(str2, localeInfo.pluralLangCode)) {
                    View view3 = s41Var.d;
                    if (view3 == t41Var.E || view3 == t41Var.f30963r) {
                        t41Var.f30965w = t41Var.v;
                    }
                    p41 p41Var = r41Var.f30268e;
                    String str3 = localeInfo.pluralLangCode;
                    t41Var.v = str3;
                    p41Var.setText(t41.y(t41.C(str3, null, null)));
                    if (t41Var.h != null) {
                        view2 = t41Var.f30962n;
                    } else {
                        view2 = t41Var.f30967y;
                    }
                    s41Var.D(view2);
                    t41.G(t41Var.v);
                    t41Var.K();
                    return;
                }
                return;
            case 28:
                wk wkVar = (wk) this.f748b;
                TranslateController translateController = (TranslateController) this.f749c;
                org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.d;
                long j11 = wkVar.f27957b;
                translateController.setHideTranslateDialog(j11, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(wkVar.f27956a).getChat(Long.valueOf(-j11));
                if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat2 != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                yc.a0(wkVar.f27958c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new uo0(17, wkVar, translateController)).j();
                n1Var.d(true);
                return;
            default:
                vt0 vt0Var = (vt0) this.f748b;
                Context context4 = (Context) this.f749c;
                Bitmap bitmap = (Bitmap) this.d;
                if (vt0Var.L1) {
                    pg.x xVar2 = new pg.x(context4, vt0Var.Q1);
                    xVar2.m(vt0Var.K1.f44630a, 2);
                    xVar2.f44678n = new qg.v(vt0Var, bitmap);
                    xVar2.h = new qg.m(vt0Var, 1);
                    xVar2.show();
                    return;
                }
                Runnable runnable5 = vt0Var.U1;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
        }
    }

    public d0(j90 j90Var, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f747a = 23;
        this.f748b = j90Var;
        this.d = f3Var;
        this.f749c = n2Var;
    }
}
