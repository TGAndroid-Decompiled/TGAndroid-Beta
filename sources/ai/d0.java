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
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.t31;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yp;
import org.telegram.ui.b70;
import org.telegram.ui.tt0;
import org.telegram.ui.wk;
import org.telegram.ui.xn;
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
        mf mfVar;
        boolean z12;
        boolean G1;
        tb0 tb0Var;
        CharSequence charSequence;
        View view2;
        String string;
        switch (this.f688a) {
            case 0:
                ((f3) this.f689b).run(Long.valueOf(((long[]) this.f690c)[0]));
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                return;
            case 1:
                e6 e6Var = ((v5) this.f689b).f1612l;
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
                ((org.telegram.ui.ActionBar.f1) this.f690c).performHapticFeedback(3);
                xc X = xc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.e(12, v5Var2, jcVar))).j();
                    return;
                }
                return;
            case 3:
                s6 s6Var = (s6) this.f689b;
                y3 y3Var = new y3(s6Var, 1);
                k7 k7Var = s6Var.f1497b;
                new tv(y3Var, k7Var.getContext(), k7Var.f1134s, (ArrayList) this.f690c).show();
                ((o70) this.d).u();
                return;
            case 4:
                ci.bc bcVar = (ci.bc) this.f689b;
                FrameLayout frameLayout = (FrameLayout) this.f690c;
                d dVar = (d) this.d;
                o70 o70Var = bcVar.V0;
                if (o70Var == null || !o70Var.D()) {
                    ci.o oVar2 = new ci.o(bcVar, 0);
                    boolean isPremium = UserConfig.getInstance(bcVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new ci.o(bcVar, 1);
                    }
                    o70 F = o70.F(frameLayout, dVar, bcVar.T0);
                    bcVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    bcVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ci.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            o70 o70Var2 = bcVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.h6.E8;
                            o70Var2.b(0, null, str, i12, i12, new o8(oVar2, i11, 2));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                o8Var = new o8(oVar, i11, 3);
                            } else {
                                o8Var = null;
                            }
                            o70Var2.M(o8Var);
                            if (bcVar.X0 == i10) {
                                bcVar.V0.L();
                            }
                            i10++;
                        } else {
                            o70 o70Var3 = bcVar.V0;
                            o70Var3.f26669s = 0;
                            o70Var3.Z();
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
                ci.w3 w3Var = ((ci.o3) this.f689b).f5238c;
                ArrayList arrayList = w3Var.f5715h0;
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
                pg.t0 t0Var = (pg.t0) this.d;
                if (nbVar.B1) {
                    pg.x xVar = new pg.x(context, nbVar.G1);
                    nbVar.T1 = xVar;
                    xVar.m(nbVar.A1.f40927a, 2);
                    xVar.f40991n = new ci.r5(nbVar, t0Var);
                    xVar.h = new ci.k5(0, nbVar, t0Var);
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
                o70 F2 = o70.F(((xn) this.f690c).getLayoutContainer(), (org.telegram.ui.ActionBar.d6) this.d, fVar.f10250n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new hg.e(fVar, 1), true);
                F2.E();
                if (fVar.f10254x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new hg.e(fVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f26669s = 0;
                F2.Z();
                return;
            case 8:
                hg.m0.S((hg.m0) this.f689b, (TL_account.TL_connectedBot) this.f690c, (kd) this.d);
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
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f18414a.dismissRunnable;
                runnable.run();
                return;
            case 13:
                Runnable runnable3 = (Runnable) this.f690c;
                org.telegram.ui.Components.b5 b5Var = (org.telegram.ui.Components.b5) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f689b)[0];
                if (b2Var != null) {
                    b2Var.setOnDismissListener(null);
                }
                runnable3.run();
                b5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 14:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f689b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f690c).run();
                ((AlertDialog$Builder) this.d).f18409a.L0.run();
                return;
            case 15:
                ((org.telegram.ui.Components.i8) this.f689b).f24898n.B0((org.telegram.ui.Cells.x) this.f690c, (MessageObject) this.d);
                return;
            case 16:
                wi wiVar = (wi) this.f689b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f690c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = wiVar.f29665f0;
                int i14 = wiVar.J1;
                gi giVar = wiVar.I0;
                mf mfVar2 = wiVar.f29671h0;
                if (mfVar2 != null) {
                    j3 = mfVar2.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                wiVar.N0 = j10;
                giVar.setEffect(j10);
                wiVar.forceKeyboardOnDismiss();
                if (wiVar.K - wiVar.L < 0) {
                    AndroidUtilities.shakeView(wiVar.f29704s);
                    AndroidUtilities.shakeView(wiVar.v);
                    try {
                        giVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > wiVar.L) {
                        wiVar.O1(n2Var);
                    }
                    mf mfVar3 = wiVar.f29671h0;
                    if (mfVar3 != null) {
                        mfVar3.h(false);
                        wiVar.f29671h0 = null;
                        return;
                    }
                    return;
                }
                if (wiVar.H1 == null && (n2Var2 instanceof xn)) {
                    xn xnVar = (xn) n2Var2;
                    if (xnVar.c()) {
                        org.telegram.ui.Components.e5.M(wiVar.getContext(), xnVar.a(), new z1(wiVar, j10, 4), d6Var);
                        z11 = false;
                        wiVar.H1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                oi oiVar = wiVar.f29726y0;
                if (oiVar != wiVar.f29677j0 && oiVar != wiVar.f29697q0) {
                    if (!oiVar.I(0, true, 0, wiVar.s1(), j10)) {
                        wiVar.A2 = true;
                        wiVar.dismiss();
                    }
                    mfVar = null;
                    G1 = false;
                    z12 = true;
                } else {
                    mfVar = null;
                    z12 = true;
                    G1 = wiVar.G1(0, true, 0, wiVar.s1(), j10);
                }
                mf mfVar4 = wiVar.f29671h0;
                if (mfVar4 != null) {
                    mfVar4.h(G1 ^ z12);
                    wiVar.f29671h0 = mfVar;
                }
                wiVar.H1(z11, z11);
                return;
            case 17:
                wi wiVar2 = (wi) this.f689b;
                MessageObject messageObject = (MessageObject) this.f690c;
                wiVar2.H1(!wiVar2.f29655c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = wiVar2.f29655c0;
                message.invert_media = z14;
                ((tb0) this.d).a(!z14, true);
                wiVar2.f29671h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar2.f29677j0;
                if (chatAttachAlertPhotoLayout != null && (tb0Var = chatAttachAlertPhotoLayout.f21881d1) != null) {
                    tb0Var.a(!wiVar2.f29655c0, true);
                }
                wiVar2.f29671h0.n(!wiVar2.f29655c0);
                return;
            case 18:
                ci.d dVar2 = (ci.d) this.d;
                ((Utilities.Callback) this.f690c).run(new nf.e(new yp(dVar2, 4), new ph(18, (nr) this.f689b, dVar2)));
                return;
            case 19:
                Context context2 = (Context) this.f690c;
                ((lr) this.f689b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.d9) this.d).f19880a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 20:
                cu cuVar = (cu) this.f689b;
                fi.o oVar3 = (fi.o) this.f690c;
                ci.u1 u1Var = (ci.u1) this.d;
                try {
                    charSequence = ((ClipboardManager) cuVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(cuVar.getContext());
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
                ku kuVar = (ku) this.f689b;
                pv0 pv0Var = (pv0) this.f690c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                fu fuVar = kuVar.f25693a;
                hg.l lVar = kuVar.f25694b;
                if (lVar.isEnabled() && lVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.p1 p1Var = kuVar.K;
                    if (p1Var == null || !p1Var.f19445f) {
                        boolean z15 = true;
                        if (kuVar.f25697n) {
                            fuVar.hideActionMode();
                            o70 o70Var4 = new o70(pv0Var, d6Var2, lVar, false, false, true);
                            o70Var4.X = AndroidUtilities.dp(280.0f);
                            fuVar.extendActionMode(null, new pa0(o70Var4, new org.telegram.ui.Components.x2(fuVar, 4), fuVar.getOnPremiumMenuLockClickListener()));
                            o70Var4.U = true;
                            o70Var4.Z();
                            return;
                        } else if (!kuVar.e) {
                            kuVar.x(1);
                            boolean isFocused = fuVar.isFocused();
                            gu guVar = kuVar.d;
                            if (fuVar.length() <= 0) {
                                z15 = false;
                            }
                            guVar.B(z15, false);
                            fuVar.requestFocus();
                            if (!isFocused) {
                                fuVar.setSelection(fuVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (kuVar.f25701x) {
                                kuVar.k(true);
                                kuVar.f25701x = false;
                                kuVar.p();
                            }
                            kuVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 22:
                o20 o20Var = (o20) this.f689b;
                o20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f690c);
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f18409a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new mv(o20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.n2) this.d).showDialog(alertDialog$Builder.f18409a);
                return;
            case 23:
                w80 w80Var = (w80) this.f689b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.f690c;
                try {
                    if (w80Var.f29568b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", w80Var.f29568b));
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
                ob0 ob0Var = (ob0) this.f689b;
                tb0 tb0Var2 = (tb0) this.f690c;
                tb0 tb0Var3 = (tb0) this.d;
                ub0 ub0Var = ob0Var.f26708c0;
                MessagePreviewParams messagePreviewParams = ub0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        ub0Var.f28456x = true;
                    }
                } else {
                    if (ub0Var.f28456x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    ub0Var.f28456x = false;
                }
                tb0Var2.a(z17, true);
                tb0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                ob0Var.h();
                ob0Var.k(true);
                return;
            case 25:
                ae0.n((ae0) this.f689b, (TLRPC.ChatFull) this.f690c, (b70) this.d);
                return;
            case 26:
                kf0 kf0Var = (kf0) this.f689b;
                Context context3 = (Context) this.f690c;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.d;
                if (kf0Var.h == null) {
                    ci.a4 a4Var = new ci.a4(context3, d6Var3, LocaleController.getString(R.string.VideoChooseCover), kf0Var.f25593f);
                    kf0Var.h = a4Var;
                    a4Var.setOnDismissListener(new ac0(kf0Var, 8));
                    kf0Var.h.f4341f = kf0Var.f25594n;
                }
                kf0Var.h.show();
                return;
            case 27:
                s31 s31Var = (s31) this.f689b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                u31 u31Var = s31Var.h;
                Runnable runnable4 = ((Runnable[]) this.f690c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = u31Var.v;
                t31 t31Var = u31Var.I;
                if (!TextUtils.equals(str2, localeInfo.pluralLangCode)) {
                    View view3 = t31Var.d;
                    if (view3 == u31Var.E || view3 == u31Var.f28405r) {
                        u31Var.f28407w = u31Var.v;
                    }
                    q31 q31Var = s31Var.e;
                    String str3 = localeInfo.pluralLangCode;
                    u31Var.v = str3;
                    q31Var.setText(u31.y(u31.E(str3, null, null)));
                    if (u31Var.h != null) {
                        view2 = u31Var.f28404n;
                    } else {
                        view2 = u31Var.f28409y;
                    }
                    t31Var.D(view2);
                    u31.I(u31Var.v);
                    u31Var.M();
                    return;
                }
                return;
            case 28:
                wk wkVar = (wk) this.f689b;
                TranslateController translateController = (TranslateController) this.f690c;
                org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.d;
                long j11 = wkVar.f25807b;
                translateController.setHideTranslateDialog(j11, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(wkVar.f25806a).getChat(Long.valueOf(-j11));
                if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat2 != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                xc.a0(wkVar.f25808c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new ar0(13, wkVar, translateController)).j();
                n1Var.d(true);
                return;
            default:
                tt0 tt0Var = (tt0) this.f689b;
                Context context4 = (Context) this.f690c;
                Bitmap bitmap = (Bitmap) this.d;
                if (tt0Var.L1) {
                    pg.x xVar2 = new pg.x(context4, tt0Var.Q1);
                    xVar2.m(tt0Var.K1.f40927a, 2);
                    xVar2.f40991n = new qg.w(tt0Var, bitmap);
                    xVar2.h = new qg.m(tt0Var, 1);
                    xVar2.show();
                    return;
                }
                Runnable runnable5 = tt0Var.U1;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
        }
    }

    public d0(w80 w80Var, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f688a = 23;
        this.f689b = w80Var;
        this.d = f3Var;
        this.f690c = n2Var;
    }
}
