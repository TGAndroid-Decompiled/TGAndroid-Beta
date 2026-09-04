package bi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import di.fc;
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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.rv;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.t31;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zt;
import org.telegram.ui.co;
import org.telegram.ui.f70;
import org.telegram.ui.zk;
import org.telegram.ui.zt0;
public final class x implements View.OnClickListener {
    public final int f3969a;
    public final Object f3970b;
    public final Object f3971c;
    public final Object d;

    public x(Object obj, Object obj2, Object obj3, int i10) {
        this.f3969a = i10;
        this.f3970b = obj;
        this.f3971c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        di.o oVar;
        String formatPluralString;
        ah.g gVar;
        boolean z10;
        Runnable runnable;
        long j3;
        boolean z11;
        nf nfVar;
        boolean z12;
        boolean G1;
        vb0 vb0Var;
        CharSequence charSequence;
        View view2;
        String string;
        switch (this.f3969a) {
            case 0:
                ((o1) this.f3970b).run(Long.valueOf(((long[]) this.f3971c)[0]));
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                return;
            case 1:
                o5 o5Var = ((f5) this.f3970b).f2972l;
                o5Var.F0((di.ga) this.f3971c, (TL_stories.StoryItem) this.d);
                f5 f5Var = o5Var.f3460t1;
                if (f5Var != null) {
                    f5Var.a();
                    return;
                }
                return;
            case 2:
                f5 f5Var2 = (f5) this.f3970b;
                pb pbVar = (pb) this.d;
                ((org.telegram.ui.ActionBar.f1) this.f3971c).performHapticFeedback(3);
                yc X = yc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.e(21, f5Var2, pbVar))).j();
                    return;
                }
                return;
            case 3:
                b6 b6Var = (b6) this.f3970b;
                l3 l3Var = new l3(b6Var, 1);
                s6 s6Var = b6Var.f2799b;
                new rv(l3Var, s6Var.getContext(), s6Var.f3697s, (ArrayList) this.f3971c).show();
                ((n70) this.d).u();
                return;
            case 4:
                fc fcVar = (fc) this.f3970b;
                FrameLayout frameLayout = (FrameLayout) this.f3971c;
                b bVar = (b) this.d;
                n70 n70Var = fcVar.V0;
                if (n70Var == null || !n70Var.D()) {
                    di.o oVar2 = new di.o(fcVar, 0);
                    boolean isPremium = UserConfig.getInstance(fcVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new di.o(fcVar, 1);
                    }
                    n70 F = n70.F(frameLayout, bVar, fcVar.T0);
                    fcVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    fcVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = di.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            n70 n70Var2 = fcVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.j6.E8;
                            n70Var2.b(0, null, str, i12, i12, new ah.g(oVar2, i11, 3));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                gVar = new ah.g(oVar, i11, 4);
                            } else {
                                gVar = null;
                            }
                            n70Var2.M(gVar);
                            if (fcVar.X0 == i10) {
                                fcVar.V0.L();
                            }
                            i10++;
                        } else {
                            n70 n70Var3 = fcVar.V0;
                            n70Var3.f28660s = 0;
                            n70Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 5:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f3971c;
                di.s3 s3Var = (di.s3) this.d;
                di.x3 x3Var = ((di.p3) this.f3970b).f7823c;
                ArrayList arrayList = x3Var.f8374h0;
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
                di.rb rbVar = (di.rb) this.f3970b;
                Context context = (Context) this.f3971c;
                qg.s0 s0Var = (qg.s0) this.d;
                if (rbVar.B1) {
                    qg.x xVar = new qg.x(context, rbVar.G1);
                    rbVar.T1 = xVar;
                    xVar.m(rbVar.A1.f44541a, 2);
                    xVar.f44620n = new di.s5(rbVar, s0Var);
                    xVar.h = new di.l5(0, rbVar, s0Var);
                    xVar.show();
                    return;
                }
                Runnable runnable2 = rbVar.K1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 7:
                ig.e eVar = (ig.e) this.f3970b;
                n70 F2 = n70.F(((co) this.f3971c).getLayoutContainer(), (org.telegram.ui.ActionBar.f6) this.d, eVar.f12035n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new ig.d(eVar, 1), true);
                F2.E();
                if (eVar.f12039x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new ig.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f28660s = 0;
                F2.Z();
                return;
            case 8:
                ig.k0.S((ig.k0) this.f3970b, (TL_account.TL_connectedBot) this.f3971c, (org.telegram.ui.Components.m8) this.d);
                return;
            case 9:
                ii.b bVar2 = (ii.b) this.f3970b;
                Utilities.Callback callback = (Utilities.Callback) this.f3971c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z13 = bVar2.Y;
                if (chat != null && !ChatObject.canAddChatToCommunity(chat)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar2.P(callback, z13, z10);
                return;
            case 10:
                ((m.p3) this.f3970b).a();
                ((ji.g6) this.f3971c).D((ji.n0) this.d);
                return;
            case 11:
                org.telegram.ui.Components.r.P((org.telegram.ui.Components.r) this.f3970b, (TL_aicompose.AiComposeTone) this.f3971c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 12:
                ((boolean[]) this.f3970b)[0] = false;
                ((org.telegram.ui.Components.d5) this.f3971c).J(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f20204a.dismissRunnable;
                runnable.run();
                return;
            case 13:
                Runnable runnable3 = (Runnable) this.f3971c;
                org.telegram.ui.Components.b5 b5Var = (org.telegram.ui.Components.b5) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f3970b)[0];
                if (b2Var != null) {
                    b2Var.setOnDismissListener(null);
                }
                runnable3.run();
                b5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 14:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f3970b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f3971c).run();
                ((AlertDialog$Builder) this.d).f20198a.L0.run();
                return;
            case 15:
                ((org.telegram.ui.Components.j8) this.f3970b).f27376n.B0((org.telegram.ui.Cells.x) this.f3971c, (MessageObject) this.d);
                return;
            case 16:
                vi viVar = (vi) this.f3970b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f3971c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f31279f0;
                int i14 = viVar.J1;
                fi fiVar = viVar.I0;
                nf nfVar2 = viVar.f31285h0;
                if (nfVar2 != null) {
                    j3 = nfVar2.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                viVar.N0 = j10;
                fiVar.setEffect(j10);
                viVar.forceKeyboardOnDismiss();
                if (viVar.K - viVar.L < 0) {
                    AndroidUtilities.shakeView(viVar.f31318s);
                    AndroidUtilities.shakeView(viVar.v);
                    try {
                        fiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > viVar.L) {
                        viVar.O1(n2Var);
                    }
                    nf nfVar3 = viVar.f31285h0;
                    if (nfVar3 != null) {
                        nfVar3.h(false);
                        viVar.f31285h0 = null;
                        return;
                    }
                    return;
                }
                if (viVar.H1 == null && (n2Var2 instanceof co)) {
                    co coVar = (co) n2Var2;
                    if (coVar.c()) {
                        org.telegram.ui.Components.e5.M(viVar.getContext(), coVar.a(), new p1(viVar, j10, 4), f6Var);
                        z11 = false;
                        viVar.H1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                ni niVar = viVar.f31340y0;
                if (niVar != viVar.f31291j0 && niVar != viVar.f31311q0) {
                    if (!niVar.I(0, true, 0, viVar.s1(), j10)) {
                        viVar.A2 = true;
                        viVar.dismiss();
                    }
                    nfVar = null;
                    G1 = false;
                    z12 = true;
                } else {
                    nfVar = null;
                    z12 = true;
                    G1 = viVar.G1(0, true, 0, viVar.s1(), j10);
                }
                nf nfVar4 = viVar.f31285h0;
                if (nfVar4 != null) {
                    nfVar4.h(G1 ^ z12);
                    viVar.f31285h0 = nfVar;
                }
                viVar.H1(z11, z11);
                return;
            case 17:
                vi viVar2 = (vi) this.f3970b;
                MessageObject messageObject = (MessageObject) this.f3971c;
                viVar2.H1(!viVar2.f31268c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = viVar2.f31268c0;
                message.invert_media = z14;
                ((vb0) this.d).a(!z14, true);
                viVar2.f31285h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar2.f31291j0;
                if (chatAttachAlertPhotoLayout != null && (vb0Var = chatAttachAlertPhotoLayout.f23843d1) != null) {
                    vb0Var.a(!viVar2.f31268c0, true);
                }
                viVar2.f31285h0.n(!viVar2.f31268c0);
                return;
            case 18:
                di.d dVar = (di.d) this.d;
                ((Utilities.Callback) this.f3971c).run(new of.e(new wp(dVar, 4), new uc(24, (lr) this.f3970b, dVar)));
                return;
            case 19:
                Context context2 = (Context) this.f3971c;
                ((jr) this.f3970b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.c9) this.d).f21704a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 20:
                zt ztVar = (zt) this.f3970b;
                gi.o oVar3 = (gi.o) this.f3971c;
                di.u1 u1Var = (di.u1) this.d;
                try {
                    charSequence = ((ClipboardManager) ztVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ztVar.getContext());
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
                hu huVar = (hu) this.f3970b;
                ov0 ov0Var = (ov0) this.f3971c;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.d;
                cu cuVar = huVar.f26847a;
                ig.k kVar = huVar.f26848b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.p1 p1Var = huVar.K;
                    if (p1Var == null || !p1Var.f21280f) {
                        boolean z15 = true;
                        if (huVar.f26852n) {
                            cuVar.hideActionMode();
                            n70 n70Var4 = new n70(ov0Var, f6Var2, kVar, false, false, true);
                            n70Var4.X = AndroidUtilities.dp(280.0f);
                            cuVar.extendActionMode(null, new pa0(n70Var4, new org.telegram.ui.Components.y2(cuVar, 4), cuVar.getOnPremiumMenuLockClickListener()));
                            n70Var4.U = true;
                            n70Var4.Z();
                            return;
                        } else if (!huVar.f26850e) {
                            huVar.x(1);
                            boolean isFocused = cuVar.isFocused();
                            du duVar = huVar.d;
                            if (cuVar.length() <= 0) {
                                z15 = false;
                            }
                            duVar.F(z15, false);
                            cuVar.requestFocus();
                            if (!isFocused) {
                                cuVar.setSelection(cuVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (huVar.f26856x) {
                                huVar.k(true);
                                huVar.f26856x = false;
                                huVar.p();
                            }
                            huVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 22:
                n20 n20Var = (n20) this.f3970b;
                n20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f3971c);
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f20198a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new kv(n20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.n2) this.d).showDialog(alertDialog$Builder.f20198a);
                return;
            case 23:
                w80 w80Var = (w80) this.f3970b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.f3971c;
                try {
                    if (w80Var.f32200b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", w80Var.f32200b));
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
                qb0 qb0Var = (qb0) this.f3970b;
                vb0 vb0Var2 = (vb0) this.f3971c;
                vb0 vb0Var3 = (vb0) this.d;
                wb0 wb0Var = qb0Var.f29662c0;
                MessagePreviewParams messagePreviewParams = wb0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        wb0Var.f32233x = true;
                    }
                } else {
                    if (wb0Var.f32233x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    wb0Var.f32233x = false;
                }
                vb0Var2.a(z17, true);
                vb0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                qb0Var.h();
                qb0Var.k(true);
                return;
            case 25:
                ae0.n((ae0) this.f3970b, (TLRPC.ChatFull) this.f3971c, (f70) this.d);
                return;
            case 26:
                kf0 kf0Var = (kf0) this.f3970b;
                Context context3 = (Context) this.f3971c;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.d;
                if (kf0Var.h == null) {
                    di.b4 b4Var = new di.b4(context3, f6Var3, LocaleController.getString(R.string.VideoChooseCover), kf0Var.f27818f);
                    kf0Var.h = b4Var;
                    b4Var.setOnDismissListener(new cc0(kf0Var, 8));
                    kf0Var.h.f6945f = kf0Var.f27819n;
                }
                kf0Var.h.show();
                return;
            case 27:
                s31 s31Var = (s31) this.f3970b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                u31 u31Var = s31Var.h;
                Runnable runnable4 = ((Runnable[]) this.f3971c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = u31Var.v;
                t31 t31Var = u31Var.I;
                if (!TextUtils.equals(str2, localeInfo.pluralLangCode)) {
                    View view3 = t31Var.d;
                    if (view3 == u31Var.E || view3 == u31Var.f30794r) {
                        u31Var.f30796w = u31Var.v;
                    }
                    q31 q31Var = s31Var.f30184e;
                    String str3 = localeInfo.pluralLangCode;
                    u31Var.v = str3;
                    q31Var.setText(u31.y(u31.D(str3, null, null)));
                    if (u31Var.h != null) {
                        view2 = u31Var.f30793n;
                    } else {
                        view2 = u31Var.f30798y;
                    }
                    t31Var.D(view2);
                    u31.I(u31Var.v);
                    u31Var.M();
                    return;
                }
                return;
            case 28:
                zk zkVar = (zk) this.f3970b;
                TranslateController translateController = (TranslateController) this.f3971c;
                org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.d;
                long j11 = zkVar.f28051b;
                translateController.setHideTranslateDialog(j11, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(zkVar.f28050a).getChat(Long.valueOf(-j11));
                if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat2 != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                yc.a0(zkVar.f28052c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new jn0(19, zkVar, translateController)).j();
                n1Var.d(true);
                return;
            default:
                zt0 zt0Var = (zt0) this.f3970b;
                Context context4 = (Context) this.f3971c;
                Bitmap bitmap = (Bitmap) this.d;
                if (zt0Var.L1) {
                    qg.x xVar2 = new qg.x(context4, zt0Var.Q1);
                    xVar2.m(zt0Var.K1.f44541a, 2);
                    xVar2.f44620n = new rg.w(zt0Var, bitmap);
                    xVar2.h = new rg.n(zt0Var, 1);
                    xVar2.show();
                    return;
                }
                Runnable runnable5 = zt0Var.U1;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
        }
    }

    public x(w80 w80Var, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f3969a = 23;
        this.f3970b = w80Var;
        this.d = f3Var;
        this.f3971c = n2Var;
    }
}
