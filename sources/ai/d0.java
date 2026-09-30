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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.md;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.vv;
import org.telegram.ui.Components.xf0;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.st0;
import org.telegram.ui.wk;
import org.telegram.ui.wn;
import org.telegram.ui.z60;
public final class d0 implements View.OnClickListener {
    public final int f688a;
    public final Object f689b;
    public final Object f690c;
    public final Object d;

    public d0(Object obj, Object obj2, Object obj3, int i10) {
        this.f688a = i10;
        this.f689b = obj;
        this.f690c = obj2;
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
        boolean G1;
        hc0 hc0Var;
        CharSequence charSequence;
        View view2;
        String string;
        switch (this.f688a) {
            case 0:
                ((f3) this.f689b).run(Long.valueOf(((long[]) this.f690c)[0]));
                ((org.telegram.ui.ActionBar.e3) this.d).dismiss();
                return;
            case 1:
                e6 e6Var = ((v5) this.f689b).f1617l;
                e6Var.F0((ci.da) this.f690c, (TL_stories.StoryItem) this.d);
                v5 v5Var = e6Var.f827t1;
                if (v5Var != null) {
                    v5Var.a();
                    return;
                }
                return;
            case 2:
                v5 v5Var2 = (v5) this.f689b;
                jc jcVar = (jc) this.d;
                ((org.telegram.ui.ActionBar.e1) this.f690c).performHapticFeedback(3);
                yc X = yc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.e(12, v5Var2, jcVar))).j();
                    return;
                }
                return;
            case 3:
                s6 s6Var = (s6) this.f689b;
                y3 y3Var = new y3(s6Var, 1);
                k7 k7Var = s6Var.f1502b;
                new vv(y3Var, k7Var.getContext(), k7Var.f1136s, (ArrayList) this.f690c).show();
                ((b80) this.d).u();
                return;
            case 4:
                ci.bc bcVar = (ci.bc) this.f689b;
                FrameLayout frameLayout = (FrameLayout) this.f690c;
                d dVar = (d) this.d;
                b80 b80Var = bcVar.V0;
                if (b80Var == null || !b80Var.D()) {
                    ci.o oVar2 = new ci.o(bcVar, 0);
                    boolean isPremium = UserConfig.getInstance(bcVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new ci.o(bcVar, 1);
                    }
                    b80 F = b80.F(frameLayout, dVar, bcVar.T0);
                    bcVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    bcVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ci.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            b80 b80Var2 = bcVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.h6.E8;
                            b80Var2.b(0, null, str, i12, i12, new o8(oVar2, i11, 2));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                o8Var = new o8(oVar, i11, 3);
                            } else {
                                o8Var = null;
                            }
                            b80Var2.M(o8Var);
                            if (bcVar.X0 == i10) {
                                bcVar.V0.L();
                            }
                            i10++;
                        } else {
                            b80 b80Var3 = bcVar.V0;
                            b80Var3.f22872s = 0;
                            b80Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 5:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f690c;
                ci.r3 r3Var = (ci.r3) this.d;
                ci.w3 w3Var = ((ci.o3) this.f689b).f5245c;
                ArrayList arrayList = w3Var.f5727h0;
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
                ci.nb nbVar = (ci.nb) this.f689b;
                Context context = (Context) this.f690c;
                pg.u0 u0Var = (pg.u0) this.d;
                if (nbVar.B1) {
                    pg.x xVar = new pg.x(context, nbVar.G1);
                    nbVar.T1 = xVar;
                    xVar.m(nbVar.A1.f41364a, 2);
                    xVar.f41407n = new ci.r5(nbVar, u0Var);
                    xVar.h = new ci.k5(0, nbVar, u0Var);
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
                hg.f fVar = (hg.f) this.f689b;
                b80 F2 = b80.F(((wn) this.f690c).getLayoutContainer(), (org.telegram.ui.ActionBar.d6) this.d, fVar.f10264n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new hg.e(fVar, 1), true);
                F2.E();
                if (fVar.f10268x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new hg.e(fVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f22872s = 0;
                F2.Z();
                return;
            case 8:
                hg.m0.S((hg.m0) this.f689b, (TL_account.TL_connectedBot) this.f690c, (md) this.d);
                return;
            case 9:
                hi.b bVar = (hi.b) this.f689b;
                Utilities.Callback callback = (Utilities.Callback) this.f690c;
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
                ((m.p3) this.f689b).a();
                ((ii.e6) this.f690c).D((ii.o0) this.d);
                return;
            case 11:
                org.telegram.ui.Components.q.P((org.telegram.ui.Components.q) this.f689b, (TL_aicompose.AiComposeTone) this.f690c, (org.telegram.ui.ActionBar.d6) this.d);
                return;
            case 12:
                ((boolean[]) this.f689b)[0] = false;
                ((org.telegram.ui.Components.d5) this.f690c).J(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.z2) this.d).f19966a.dismissRunnable;
                runnable.run();
                return;
            case 13:
                Runnable runnable3 = (Runnable) this.f690c;
                org.telegram.ui.Components.b5 b5Var = (org.telegram.ui.Components.b5) this.d;
                org.telegram.ui.ActionBar.a2 a2Var = ((org.telegram.ui.ActionBar.a2[]) this.f689b)[0];
                if (a2Var != null) {
                    a2Var.setOnDismissListener(null);
                }
                runnable3.run();
                b5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 14:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f689b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f690c).run();
                ((AlertDialog$Builder) this.d).f18678a.L0.run();
                return;
            case 15:
                ((org.telegram.ui.Components.i8) this.f689b).f25036n.B0((org.telegram.ui.Cells.x) this.f690c, (MessageObject) this.d);
                return;
            case 16:
                xi xiVar = (xi) this.f689b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f690c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = xiVar.f30270f0;
                int i14 = xiVar.J1;
                hi hiVar = xiVar.I0;
                of ofVar2 = xiVar.f30276h0;
                if (ofVar2 != null) {
                    j3 = ofVar2.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                xiVar.N0 = j10;
                hiVar.setEffect(j10);
                xiVar.forceKeyboardOnDismiss();
                if (xiVar.K - xiVar.L < 0) {
                    AndroidUtilities.shakeView(xiVar.f30309s);
                    AndroidUtilities.shakeView(xiVar.v);
                    try {
                        hiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > xiVar.L) {
                        xiVar.O1(m2Var);
                    }
                    of ofVar3 = xiVar.f30276h0;
                    if (ofVar3 != null) {
                        ofVar3.h(false);
                        xiVar.f30276h0 = null;
                        return;
                    }
                    return;
                }
                if (xiVar.H1 == null && (m2Var2 instanceof wn)) {
                    wn wnVar = (wn) m2Var2;
                    if (wnVar.c()) {
                        org.telegram.ui.Components.e5.M(xiVar.getContext(), wnVar.a(), new z1(xiVar, j10, 4), d6Var);
                        z11 = false;
                        xiVar.H1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                pi piVar = xiVar.f30331y0;
                if (piVar != xiVar.f30282j0 && piVar != xiVar.f30302q0) {
                    if (!piVar.I(0, true, 0, xiVar.s1(), j10)) {
                        xiVar.A2 = true;
                        xiVar.dismiss();
                    }
                    ofVar = null;
                    G1 = false;
                    z12 = true;
                } else {
                    ofVar = null;
                    z12 = true;
                    G1 = xiVar.G1(0, true, 0, xiVar.s1(), j10);
                }
                of ofVar4 = xiVar.f30276h0;
                if (ofVar4 != null) {
                    ofVar4.h(G1 ^ z12);
                    xiVar.f30276h0 = ofVar;
                }
                xiVar.H1(z11, z11);
                return;
            case 17:
                xi xiVar2 = (xi) this.f689b;
                MessageObject messageObject = (MessageObject) this.f690c;
                xiVar2.H1(!xiVar2.f30260c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = xiVar2.f30260c0;
                message.invert_media = z14;
                ((hc0) this.d).a(!z14, true);
                xiVar2.f30276h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar2.f30282j0;
                if (chatAttachAlertPhotoLayout != null && (hc0Var = chatAttachAlertPhotoLayout.f22154d1) != null) {
                    hc0Var.a(!xiVar2.f30260c0, true);
                }
                xiVar2.f30276h0.n(!xiVar2.f30260c0);
                return;
            case 18:
                ci.d dVar2 = (ci.d) this.d;
                ((Utilities.Callback) this.f690c).run(new nf.e(new aq(dVar2, 4), new ld(23, (pr) this.f689b, dVar2)));
                return;
            case 19:
                Context context2 = (Context) this.f690c;
                ((nr) this.f689b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.c9) this.d).f20123a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 20:
                eu euVar = (eu) this.f689b;
                fi.o oVar3 = (fi.o) this.f690c;
                ci.u1 u1Var = (ci.u1) this.d;
                try {
                    charSequence = ((ClipboardManager) euVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(euVar.getContext());
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
                mu muVar = (mu) this.f689b;
                dw0 dw0Var = (dw0) this.f690c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                hu huVar = muVar.f26381a;
                hg.l lVar = muVar.f26382b;
                if (lVar.isEnabled() && lVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.o1 o1Var = muVar.K;
                    if (o1Var == null || !o1Var.f19689f) {
                        boolean z15 = true;
                        if (muVar.f26385n) {
                            huVar.hideActionMode();
                            b80 b80Var4 = new b80(dw0Var, d6Var2, lVar, false, false, true);
                            b80Var4.X = AndroidUtilities.dp(280.0f);
                            huVar.extendActionMode(null, new db0(b80Var4, new org.telegram.ui.Components.y2(huVar, 4), huVar.getOnPremiumMenuLockClickListener()));
                            b80Var4.U = true;
                            b80Var4.Z();
                            return;
                        } else if (!muVar.e) {
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
                            if (muVar.f26389x) {
                                muVar.k(true);
                                muVar.f26389x = false;
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
                r20 r20Var = (r20) this.f689b;
                r20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f690c);
                alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f18678a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new ov(r20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.m2) this.d).showDialog(alertDialog$Builder.f18678a);
                return;
            case 23:
                j90 j90Var = (j90) this.f689b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) this.f690c;
                try {
                    if (j90Var.f25371b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", j90Var.f25371b));
                        if (e3Var != null && e3Var.getContainer() != null) {
                            new yc(e3Var.getContainer(), null).k(false).j();
                        } else {
                            yc.j(m2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 24:
                cc0 cc0Var = (cc0) this.f689b;
                hc0 hc0Var2 = (hc0) this.f690c;
                hc0 hc0Var3 = (hc0) this.d;
                ic0 ic0Var = cc0Var.f23264c0;
                MessagePreviewParams messagePreviewParams = ic0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        ic0Var.f25079x = true;
                    }
                } else {
                    if (ic0Var.f25079x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    ic0Var.f25079x = false;
                }
                hc0Var2.a(z17, true);
                hc0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                cc0Var.h();
                cc0Var.k(true);
                return;
            case 25:
                ne0.n((ne0) this.f689b, (TLRPC.ChatFull) this.f690c, (z60) this.d);
                return;
            case 26:
                xf0 xf0Var = (xf0) this.f689b;
                Context context3 = (Context) this.f690c;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.d;
                if (xf0Var.h == null) {
                    ci.a4 a4Var = new ci.a4(context3, d6Var3, LocaleController.getString(R.string.VideoChooseCover), xf0Var.f30242f);
                    xf0Var.h = a4Var;
                    a4Var.setOnDismissListener(new lc0(xf0Var, 9));
                    xf0Var.h.f4348f = xf0Var.f30243n;
                }
                xf0Var.h.show();
                return;
            case 27:
                j41 j41Var = (j41) this.f689b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                l41 l41Var = j41Var.h;
                Runnable runnable4 = ((Runnable[]) this.f690c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = l41Var.v;
                k41 k41Var = l41Var.I;
                if (!TextUtils.equals(str2, localeInfo.pluralLangCode)) {
                    View view3 = k41Var.d;
                    if (view3 == l41Var.E || view3 == l41Var.f25908r) {
                        l41Var.f25910w = l41Var.v;
                    }
                    h41 h41Var = j41Var.e;
                    String str3 = localeInfo.pluralLangCode;
                    l41Var.v = str3;
                    h41Var.setText(l41.y(l41.E(str3, null, null)));
                    if (l41Var.h != null) {
                        view2 = l41Var.f25907n;
                    } else {
                        view2 = l41Var.f25912y;
                    }
                    k41Var.D(view2);
                    l41.I(l41Var.v);
                    l41Var.M();
                    return;
                }
                return;
            case 28:
                wk wkVar = (wk) this.f689b;
                TranslateController translateController = (TranslateController) this.f690c;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.d;
                long j11 = wkVar.f23161b;
                translateController.setHideTranslateDialog(j11, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(wkVar.f23160a).getChat(Long.valueOf(-j11));
                if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat2 != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                yc.a0(wkVar.f23162c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new zn0(18, wkVar, translateController)).j();
                m1Var.d(true);
                return;
            default:
                st0 st0Var = (st0) this.f689b;
                Context context4 = (Context) this.f690c;
                Bitmap bitmap = (Bitmap) this.d;
                if (st0Var.L1) {
                    pg.x xVar2 = new pg.x(context4, st0Var.Q1);
                    xVar2.m(st0Var.K1.f41364a, 2);
                    xVar2.f41407n = new qg.w(st0Var, bitmap);
                    xVar2.h = new qg.m(st0Var, 1);
                    xVar2.show();
                    return;
                }
                Runnable runnable5 = st0Var.U1;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
        }
    }

    public d0(j90 j90Var, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f688a = 23;
        this.f689b = j90Var;
        this.d = e3Var;
        this.f690c = m2Var;
    }
}
