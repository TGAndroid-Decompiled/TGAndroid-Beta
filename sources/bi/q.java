package bi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.g41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.bl;
import org.telegram.ui.e70;
import org.telegram.ui.eo;
import org.telegram.ui.zt0;
public final class q implements View.OnClickListener {
    public final int f3426a;
    public final Object f3427b;
    public final Object f3428c;
    public final Object d;

    public q(Object obj, Object obj2, Object obj3, int i10) {
        this.f3426a = i10;
        this.f3427b = obj;
        this.f3428c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        r rVar;
        String formatPluralString;
        s sVar;
        boolean z10;
        Runnable runnable;
        long j3;
        boolean z11;
        of ofVar;
        boolean z12;
        boolean G1;
        dc0 dc0Var;
        CharSequence charSequence;
        View view2;
        String string;
        switch (this.f3426a) {
            case 0:
                qd qdVar = (qd) this.f3427b;
                FrameLayout frameLayout = (FrameLayout) this.f3428c;
                zh.b bVar = (zh.b) this.d;
                w70 w70Var = qdVar.V0;
                if (w70Var == null || !w70Var.D()) {
                    r rVar2 = new r(qdVar, 0);
                    boolean isPremium = UserConfig.getInstance(qdVar.U).isPremium();
                    if (isPremium) {
                        rVar = null;
                    } else {
                        rVar = new r(qdVar, 1);
                    }
                    w70 F = w70.F(frameLayout, bVar, qdVar.T0);
                    qdVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    qdVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = v.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            w70 w70Var2 = qdVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.j6.E8;
                            w70Var2.b(0, null, str, i12, i12, new s(rVar2, i11, 0));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                sVar = new s(rVar, i11, 1);
                            } else {
                                sVar = null;
                            }
                            w70Var2.M(sVar);
                            if (qdVar.X0 == i10) {
                                qdVar.V0.L();
                            }
                            i10++;
                        } else {
                            w70 w70Var3 = qdVar.V0;
                            w70Var3.f28701s = 0;
                            w70Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 1:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f3428c;
                j4 j4Var = (j4) this.d;
                p4 p4Var = ((g4) this.f3427b).f2742c;
                ArrayList arrayList = p4Var.f3379h0;
                if (arrayList.contains(photoEntry)) {
                    arrayList.remove(photoEntry);
                } else if (arrayList.size() + 1 > p4Var.R) {
                    int i13 = -p4Var.N;
                    p4Var.N = i13;
                    AndroidUtilities.shakeViewSpring(j4Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                } else {
                    arrayList.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(p4Var.d);
                p4Var.j();
                return;
            case 2:
                ad adVar = (ad) this.f3427b;
                Context context = (Context) this.f3428c;
                og.x0 x0Var = (og.x0) this.d;
                if (adVar.B1) {
                    og.a0 a0Var = new og.a0(context, adVar.G1);
                    adVar.T1 = a0Var;
                    a0Var.m(adVar.A1.f14534a, 2);
                    a0Var.f14320n = new q6(adVar, x0Var);
                    a0Var.h = new h6(0, adVar, x0Var);
                    a0Var.show();
                    return;
                }
                Runnable runnable2 = adVar.K1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 3:
                gg.e eVar = (gg.e) this.f3427b;
                w70 F2 = w70.F(((eo) this.f3428c).getLayoutContainer(), (org.telegram.ui.ActionBar.f6) this.d, eVar.f8853n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new gg.d(eVar, 1), true);
                F2.E();
                if (eVar.f8857x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new gg.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f28701s = 0;
                F2.Z();
                return;
            case 4:
                gg.p0.S((gg.p0) this.f3427b, (TL_account.TL_connectedBot) this.f3428c, (org.telegram.ui.Components.zd) this.d);
                return;
            case 5:
                gi.b bVar2 = (gi.b) this.f3427b;
                Utilities.Callback callback = (Utilities.Callback) this.f3428c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z13 = bVar2.Y;
                if (chat != null && !ChatObject.canAddChatToCommunity(chat)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar2.P(callback, z13, z10);
                return;
            case 6:
                ((m.r3) this.f3427b).a();
                ((hi.g6) this.f3428c).D((hi.p0) this.d);
                return;
            case 7:
                org.telegram.ui.Components.r.P((org.telegram.ui.Components.r) this.f3427b, (TL_aicompose.AiComposeTone) this.f3428c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 8:
                ((boolean[]) this.f3427b)[0] = false;
                ((org.telegram.ui.Components.c5) this.f3428c).I(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.c3) this.d).f17571a.dismissRunnable;
                runnable.run();
                return;
            case 9:
                Runnable runnable3 = (Runnable) this.f3428c;
                org.telegram.ui.Components.a5 a5Var = (org.telegram.ui.Components.a5) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = ((org.telegram.ui.ActionBar.d2[]) this.f3427b)[0];
                if (d2Var != null) {
                    d2Var.setOnDismissListener(null);
                }
                runnable3.run();
                a5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 10:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f3427b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f3428c).run();
                ((AlertDialog$Builder) this.d).f17528a.L0.run();
                return;
            case 11:
                ((org.telegram.ui.Components.i8) this.f3427b).f23923n.B0((org.telegram.ui.Cells.x) this.f3428c, (MessageObject) this.d);
                return;
            case 12:
                yi yiVar = (yi) this.f3427b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f3428c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = yiVar.f29366f0;
                int i14 = yiVar.J1;
                ii iiVar = yiVar.I0;
                of ofVar2 = yiVar.f29372h0;
                if (ofVar2 != null) {
                    j3 = ofVar2.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                yiVar.N0 = j10;
                iiVar.setEffect(j10);
                yiVar.forceKeyboardOnDismiss();
                if (yiVar.K - yiVar.L < 0) {
                    AndroidUtilities.shakeView(yiVar.f29405s);
                    AndroidUtilities.shakeView(yiVar.v);
                    try {
                        iiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > yiVar.L) {
                        yiVar.O1(p2Var);
                    }
                    of ofVar3 = yiVar.f29372h0;
                    if (ofVar3 != null) {
                        ofVar3.h(false);
                        yiVar.f29372h0 = null;
                        return;
                    }
                    return;
                }
                if (yiVar.H1 == null && (p2Var2 instanceof eo)) {
                    eo eoVar = (eo) p2Var2;
                    if (eoVar.c()) {
                        org.telegram.ui.Components.d5.M(yiVar.getContext(), eoVar.a(), new za(yiVar, j10, 3), f6Var);
                        z11 = false;
                        yiVar.H1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                qi qiVar = yiVar.f29427y0;
                if (qiVar != yiVar.f29378j0 && qiVar != yiVar.f29398q0) {
                    if (!qiVar.I(0, true, 0, yiVar.s1(), j10)) {
                        yiVar.A2 = true;
                        yiVar.dismiss();
                    }
                    ofVar = null;
                    G1 = false;
                    z12 = true;
                } else {
                    ofVar = null;
                    z12 = true;
                    G1 = yiVar.G1(0, true, 0, yiVar.s1(), j10);
                }
                of ofVar4 = yiVar.f29372h0;
                if (ofVar4 != null) {
                    ofVar4.h(G1 ^ z12);
                    yiVar.f29372h0 = ofVar;
                }
                yiVar.H1(z11, z11);
                return;
            case 13:
                yi yiVar2 = (yi) this.f3427b;
                MessageObject messageObject = (MessageObject) this.f3428c;
                yiVar2.H1(!yiVar2.f29356c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = yiVar2.f29356c0;
                message.invert_media = z14;
                ((dc0) this.d).a(!z14, true);
                yiVar2.f29372h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar2.f29378j0;
                if (chatAttachAlertPhotoLayout != null && (dc0Var = chatAttachAlertPhotoLayout.f20995d1) != null) {
                    dc0Var.a(!yiVar2.f29356c0, true);
                }
                yiVar2.f29372h0.n(!yiVar2.f29356c0);
                return;
            case 14:
                d dVar = (d) this.d;
                ((Utilities.Callback) this.f3428c).run(new nf.e(new dq(dVar, 4), new org.telegram.ui.Components.ee(21, (sr) this.f3427b, dVar)));
                return;
            case 15:
                Context context2 = (Context) this.f3428c;
                ((qr) this.f3427b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.d9) this.d).f19011a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 16:
                fu fuVar = (fu) this.f3427b;
                ei.o oVar = (ei.o) this.f3428c;
                e2 e2Var = (e2) this.d;
                try {
                    charSequence = ((ClipboardManager) fuVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(fuVar.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    oVar.setText(charSequence);
                    oVar.setSelection(0, oVar.getText().length());
                }
                e2Var.run();
                return;
            case 17:
                nu nuVar = (nu) this.f3427b;
                aw0 aw0Var = (aw0) this.f3428c;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.d;
                iu iuVar = nuVar.f25595a;
                gg.k kVar = nuVar.f25596b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.r1 r1Var = nuVar.K;
                    if (r1Var == null || !r1Var.f18596f) {
                        boolean z15 = true;
                        if (nuVar.f25599n) {
                            iuVar.hideActionMode();
                            w70 w70Var4 = new w70(aw0Var, f6Var2, kVar, false, false, true);
                            w70Var4.X = AndroidUtilities.dp(280.0f);
                            iuVar.extendActionMode(null, new ya0(w70Var4, new org.telegram.ui.Components.y2(iuVar, 4), iuVar.getOnPremiumMenuLockClickListener()));
                            w70Var4.U = true;
                            w70Var4.Z();
                            return;
                        } else if (!nuVar.e) {
                            nuVar.x(1);
                            boolean isFocused = iuVar.isFocused();
                            ju juVar = nuVar.d;
                            if (iuVar.length() <= 0) {
                                z15 = false;
                            }
                            juVar.E(z15, false);
                            iuVar.requestFocus();
                            if (!isFocused) {
                                iuVar.setSelection(iuVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (nuVar.f25603x) {
                                nuVar.k(true);
                                nuVar.f25603x = false;
                                nuVar.p();
                            }
                            nuVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                w20 w20Var = (w20) this.f3427b;
                w20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f3428c);
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new pv(w20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.p2) this.d).showDialog(alertDialog$Builder.f17528a);
                return;
            case 19:
                f90 f90Var = (f90) this.f3427b;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f3428c;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) this.d;
                try {
                    if (f90Var.f22948b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f90Var.f22948b));
                        if (h3Var != null && h3Var.getContainer() != null) {
                            new org.telegram.ui.Components.wc(h3Var.getContainer(), null).k(false).j();
                        } else {
                            org.telegram.ui.Components.wc.j(p2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 20:
                yb0 yb0Var = (yb0) this.f3427b;
                dc0 dc0Var2 = (dc0) this.f3428c;
                dc0 dc0Var3 = (dc0) this.d;
                ec0 ec0Var = yb0Var.f29295c0;
                MessagePreviewParams messagePreviewParams = ec0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        ec0Var.f22669x = true;
                    }
                } else {
                    if (ec0Var.f22669x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    ec0Var.f22669x = false;
                }
                dc0Var2.a(z17, true);
                dc0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                yb0Var.h();
                yb0Var.k(true);
                return;
            case 21:
                je0.n((je0) this.f3427b, (TLRPC.ChatFull) this.f3428c, (e70) this.d);
                return;
            case 22:
                tf0 tf0Var = (tf0) this.f3427b;
                Context context3 = (Context) this.f3428c;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.d;
                if (tf0Var.h == null) {
                    t4 t4Var = new t4(context3, f6Var3, LocaleController.getString(R.string.VideoChooseCover), tf0Var.f27405f);
                    tf0Var.h = t4Var;
                    t4Var.setOnDismissListener(new kc0(tf0Var, 8));
                    tf0Var.h.f3676f = tf0Var.f27406n;
                }
                tf0Var.h.show();
                return;
            case 23:
                g41 g41Var = (g41) this.f3427b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                i41 i41Var = g41Var.h;
                Runnable runnable4 = ((Runnable[]) this.f3428c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = i41Var.v;
                h41 h41Var = i41Var.I;
                if (!TextUtils.equals(str2, localeInfo.pluralLangCode)) {
                    View view3 = h41Var.d;
                    if (view3 == i41Var.E || view3 == i41Var.f23898r) {
                        i41Var.f23900w = i41Var.v;
                    }
                    e41 e41Var = g41Var.e;
                    String str3 = localeInfo.pluralLangCode;
                    i41Var.v = str3;
                    e41Var.setText(i41.y(i41.D(str3, null, null)));
                    if (i41Var.h != null) {
                        view2 = i41Var.f23897n;
                    } else {
                        view2 = i41Var.f23902y;
                    }
                    h41Var.D(view2);
                    i41.I(i41Var.v);
                    i41Var.M();
                    return;
                }
                return;
            case 24:
                bl blVar = (bl) this.f3427b;
                TranslateController translateController = (TranslateController) this.f3428c;
                org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.d;
                long j11 = blVar.f29586b;
                translateController.setHideTranslateDialog(j11, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(blVar.f29585a).getChat(Long.valueOf(-j11));
                if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat2 != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                org.telegram.ui.Components.wc.a0(blVar.f29587c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new yo0(16, blVar, translateController)).j();
                p1Var.d(true);
                return;
            case 25:
                zt0 zt0Var = (zt0) this.f3427b;
                Context context4 = (Context) this.f3428c;
                Bitmap bitmap = (Bitmap) this.d;
                if (zt0Var.L1) {
                    og.a0 a0Var2 = new og.a0(context4, zt0Var.Q1);
                    a0Var2.m(zt0Var.K1.f14534a, 2);
                    a0Var2.f14320n = new pg.v(zt0Var, bitmap);
                    a0Var2.h = new pg.m(zt0Var, 1);
                    a0Var2.show();
                    return;
                }
                Runnable runnable5 = zt0Var.U1;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            case 26:
                ((wg.h) this.f3427b).a(view, (HashSet) this.f3428c, (Runnable) this.d);
                return;
            case 27:
                new wh.m((Context) this.f3428c, null, null, (GiftAuctionController.Auction) this.d).show();
                ((wh.e) this.f3427b).dismiss();
                return;
            case 28:
                wh.m.R((wh.m) this.f3427b, (boolean[]) this.f3428c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            default:
                wh.w.R((wh.w) this.f3427b, (Context) this.f3428c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
        }
    }
}
