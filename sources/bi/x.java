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
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.xv;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yr;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.el;
import org.telegram.ui.fo;
import org.telegram.ui.hu0;
import org.telegram.ui.j70;
public final class x implements View.OnClickListener {
    public final int f3939a;
    public final Object f3940b;
    public final Object f3941c;
    public final Object d;

    public x(Object obj, Object obj2, Object obj3, int i10) {
        this.f3939a = i10;
        this.f3940b = obj;
        this.f3941c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        di.o oVar;
        String formatPluralString;
        ah.g gVar;
        boolean z10;
        Runnable runnable;
        long j10;
        boolean z11;
        boolean z12;
        of ofVar;
        boolean J1;
        uc0 uc0Var;
        CharSequence charSequence;
        View view2;
        String string;
        switch (this.f3939a) {
            case 0:
                ((u2) this.f3940b).run(Long.valueOf(((long[]) this.f3941c)[0]));
                ((org.telegram.ui.ActionBar.e3) this.d).dismiss();
                return;
            case 1:
                q5 q5Var = ((h5) this.f3940b).f3122l;
                q5Var.F0((di.ca) this.f3941c, (TL_stories.StoryItem) this.d);
                h5 h5Var = q5Var.f3563t1;
                if (h5Var != null) {
                    h5Var.a();
                    return;
                }
                return;
            case 2:
                h5 h5Var2 = (h5) this.f3940b;
                sb sbVar = (sb) this.d;
                ((org.telegram.ui.ActionBar.e1) this.f3941c).performHapticFeedback(3);
                zc X = zc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.f(23, h5Var2, sbVar))).j();
                    return;
                }
                return;
            case 3:
                e6 e6Var = (e6) this.f3940b;
                o3 o3Var = new o3(e6Var, 1);
                w6 w6Var = e6Var.f2987b;
                new ew(o3Var, w6Var.getContext(), w6Var.f3906s, (ArrayList) this.f3941c).show();
                ((m80) this.d).u();
                return;
            case 4:
                di.ac acVar = (di.ac) this.f3940b;
                FrameLayout frameLayout = (FrameLayout) this.f3941c;
                b bVar = (b) this.d;
                m80 m80Var = acVar.V0;
                if (m80Var == null || !m80Var.D()) {
                    di.o oVar2 = new di.o(acVar, 0);
                    boolean isPremium = UserConfig.getInstance(acVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new di.o(acVar, 1);
                    }
                    m80 F = m80.F(frameLayout, bVar, acVar.T0);
                    acVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    acVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = di.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            m80 m80Var2 = acVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.g6.E8;
                            m80Var2.b(0, null, str, i12, i12, new ah.g(oVar2, i11, 3));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                gVar = new ah.g(oVar, i11, 4);
                            } else {
                                gVar = null;
                            }
                            m80Var2.M(gVar);
                            if (acVar.X0 == i10) {
                                acVar.V0.L();
                            }
                            i10++;
                        } else {
                            m80 m80Var3 = acVar.V0;
                            m80Var3.f27298s = 0;
                            m80Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 5:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f3941c;
                di.q3 q3Var = (di.q3) this.d;
                di.v3 v3Var = ((di.n3) this.f3940b).f7451c;
                ArrayList arrayList = v3Var.f7988h0;
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
                di.mb mbVar = (di.mb) this.f3940b;
                Context context = (Context) this.f3941c;
                qg.s0 s0Var = (qg.s0) this.d;
                if (mbVar.B1) {
                    qg.x xVar = new qg.x(context, mbVar.G1);
                    mbVar.T1 = xVar;
                    xVar.n(mbVar.A1.f43543a, 2);
                    xVar.f43612n = new di.q5(mbVar, s0Var);
                    xVar.h = new di.j5(0, mbVar, s0Var);
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
                ig.e eVar = (ig.e) this.f3940b;
                m80 F2 = m80.F(((fo) this.f3941c).getLayoutContainer(), (org.telegram.ui.ActionBar.c6) this.d, eVar.f11473n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new ig.d(eVar, 1), true);
                F2.E();
                if (eVar.f11477x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new ig.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f27298s = 0;
                F2.Z();
                return;
            case 8:
                ig.k0.T((ig.k0) this.f3940b, (TL_account.TL_connectedBot) this.f3941c, (org.telegram.ui.Components.o8) this.d);
                return;
            case 9:
                ii.b bVar2 = (ii.b) this.f3940b;
                Utilities.Callback callback = (Utilities.Callback) this.f3941c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z13 = bVar2.Y;
                if (chat != null && !ChatObject.canAddChatToCommunity(chat)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar2.Q(callback, z13, z10);
                return;
            case 10:
                ((m.q3) this.f3940b).a();
                ((ji.i6) this.f3941c).D((ji.n0) this.d);
                return;
            case 11:
                org.telegram.ui.Components.q.Q((org.telegram.ui.Components.q) this.f3940b, (TL_aicompose.AiComposeTone) this.f3941c, (org.telegram.ui.ActionBar.c6) this.d);
                return;
            case 12:
                ((boolean[]) this.f3940b)[0] = false;
                ((org.telegram.ui.Components.f5) this.f3941c).J(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.z2) this.d).f20838a.dismissRunnable;
                runnable.run();
                return;
            case 13:
                Runnable runnable3 = (Runnable) this.f3941c;
                org.telegram.ui.Components.d5 d5Var = (org.telegram.ui.Components.d5) this.d;
                org.telegram.ui.ActionBar.a2 a2Var = ((org.telegram.ui.ActionBar.a2[]) this.f3940b)[0];
                if (a2Var != null) {
                    a2Var.setOnDismissListener(null);
                }
                runnable3.run();
                d5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 14:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f3940b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f3941c).run();
                ((AlertDialog$Builder) this.d).f19548a.L0.run();
                return;
            case 15:
                ((org.telegram.ui.Components.l8) this.f3940b).f26975n.C0((org.telegram.ui.Cells.x) this.f3941c, (MessageObject) this.d);
                return;
            case 16:
                vi viVar = (vi) this.f3940b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f3941c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f30001f0;
                int i14 = viVar.M1;
                fi fiVar = viVar.L0;
                of ofVar2 = viVar.f30007h0;
                if (ofVar2 != null) {
                    j10 = ofVar2.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                viVar.Q0 = j11;
                fiVar.setEffect(j11);
                viVar.forceKeyboardOnDismiss();
                if (viVar.K - viVar.L < 0) {
                    AndroidUtilities.shakeView(viVar.f30040s);
                    AndroidUtilities.shakeView(viVar.v);
                    try {
                        fiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > viVar.L) {
                        viVar.S1(m2Var);
                    }
                    of ofVar3 = viVar.f30007h0;
                    if (ofVar3 != null) {
                        ofVar3.h(false);
                        viVar.f30007h0 = null;
                        return;
                    }
                    return;
                }
                if (viVar.K1 == null && (m2Var2 instanceof fo)) {
                    fo foVar = (fo) m2Var2;
                    if (foVar.c()) {
                        org.telegram.ui.Components.g5.L(viVar.getContext(), foVar.a(), new p1(viVar, j11, 4), c6Var);
                        z11 = false;
                        viVar.K1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                ni niVar = viVar.B0;
                if (niVar != viVar.f30013j0 && niVar != viVar.f30033q0) {
                    if (!niVar.K(0, true, 0, viVar.u1(), j11)) {
                        viVar.D2 = true;
                        viVar.dismiss();
                    }
                    J1 = false;
                    z12 = true;
                    ofVar = null;
                } else {
                    z12 = true;
                    ofVar = null;
                    J1 = viVar.J1(0, true, 0, viVar.u1(), j11);
                }
                of ofVar4 = viVar.f30007h0;
                if (ofVar4 != null) {
                    ofVar4.h(J1 ^ z12);
                    viVar.f30007h0 = ofVar;
                }
                viVar.K1(z11, z11);
                return;
            case 17:
                vi viVar2 = (vi) this.f3940b;
                MessageObject messageObject = (MessageObject) this.f3941c;
                viVar2.K1(!viVar2.f29991c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = viVar2.f29991c0;
                message.invert_media = z14;
                ((uc0) this.d).a(!z14, true);
                viVar2.f30007h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar2.f30013j0;
                if (chatAttachAlertPhotoLayout != null && (uc0Var = chatAttachAlertPhotoLayout.f23030d1) != null) {
                    uc0Var.a(!viVar2.f29991c0, true);
                }
                viVar2.f30007h0.n(!viVar2.f29991c0);
                return;
            case 18:
                di.d dVar = (di.d) this.d;
                ((Utilities.Callback) this.f3941c).run(new pf.c(new kq(dVar, 4), new sk(11, (as) this.f3940b, dVar)));
                return;
            case 19:
                Context context2 = (Context) this.f3941c;
                ((yr) this.f3940b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.c9) this.d).f21034a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 20:
                nu nuVar = (nu) this.f3940b;
                gi.o oVar3 = (gi.o) this.f3941c;
                di.t1 t1Var = (di.t1) this.d;
                try {
                    charSequence = ((ClipboardManager) nuVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(nuVar.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    oVar3.setText(charSequence);
                    oVar3.setSelection(0, oVar3.getText().length());
                }
                t1Var.run();
                return;
            case 21:
                vu vuVar = (vu) this.f3940b;
                ow0 ow0Var = (ow0) this.f3941c;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.d;
                qu quVar = vuVar.f30649a;
                ig.k kVar = vuVar.f30650b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.o1 o1Var = vuVar.K;
                    if (o1Var == null || !o1Var.f20558f) {
                        boolean z15 = true;
                        if (vuVar.f30653n) {
                            quVar.hideActionMode();
                            m80 m80Var4 = new m80(ow0Var, c6Var2, kVar, false, false, true);
                            m80Var4.X = AndroidUtilities.dp(280.0f);
                            quVar.extendActionMode(null, new pb0(m80Var4, new org.telegram.ui.Components.a3(quVar, 4), quVar.getOnPremiumMenuLockClickListener()));
                            m80Var4.U = true;
                            m80Var4.Z();
                            return;
                        } else if (!vuVar.e) {
                            vuVar.x(1);
                            boolean isFocused = quVar.isFocused();
                            ru ruVar = vuVar.d;
                            if (quVar.length() <= 0) {
                                z15 = false;
                            }
                            ruVar.D(z15, false);
                            quVar.requestFocus();
                            if (!isFocused) {
                                quVar.setSelection(quVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (vuVar.f30657x) {
                                vuVar.k(true);
                                vuVar.f30657x = false;
                                vuVar.p();
                            }
                            vuVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 22:
                a30 a30Var = (a30) this.f3940b;
                a30Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f3941c);
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f19548a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new xv(a30Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.m2) this.d).showDialog(alertDialog$Builder.f19548a);
                return;
            case 23:
                w90 w90Var = (w90) this.f3940b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) this.f3941c;
                try {
                    if (w90Var.f30827b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", w90Var.f30827b));
                        if (e3Var != null && e3Var.getContainer() != null) {
                            new zc(e3Var.getContainer(), null).k(false).j();
                        } else {
                            zc.j(m2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 24:
                pc0 pc0Var = (pc0) this.f3940b;
                uc0 uc0Var2 = (uc0) this.f3941c;
                uc0 uc0Var3 = (uc0) this.d;
                vc0 vc0Var = pc0Var.f28286c0;
                MessagePreviewParams messagePreviewParams = vc0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        vc0Var.f29941x = true;
                    }
                } else {
                    if (vc0Var.f29941x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    vc0Var.f29941x = false;
                }
                uc0Var2.a(z17, true);
                uc0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                pc0Var.h();
                pc0Var.k(true);
                return;
            case 25:
                ze0.o((ze0) this.f3940b, (TLRPC.ChatFull) this.f3941c, (j70) this.d);
                return;
            case 26:
                jg0 jg0Var = (jg0) this.f3940b;
                Context context3 = (Context) this.f3941c;
                org.telegram.ui.ActionBar.c6 c6Var3 = (org.telegram.ui.ActionBar.c6) this.d;
                if (jg0Var.h == null) {
                    di.z3 z3Var = new di.z3(context3, c6Var3, LocaleController.getString(R.string.VideoChooseCover), jg0Var.f26356f);
                    jg0Var.h = z3Var;
                    z3Var.setOnDismissListener(new yc0(jg0Var, 9));
                    jg0Var.h.f8178f = jg0Var.f26357n;
                }
                jg0Var.h.show();
                return;
            case 27:
                v41 v41Var = (v41) this.f3940b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                x41 x41Var = v41Var.f29891n;
                Runnable runnable4 = ((Runnable[]) this.f3941c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = x41Var.v;
                w41 w41Var = x41Var.I;
                if (!TextUtils.equals(str2, localeInfo.pluralLangCode)) {
                    View view3 = w41Var.d;
                    if (view3 == x41Var.E || view3 == x41Var.f31164r) {
                        x41Var.f31166w = x41Var.v;
                    }
                    t41 t41Var = v41Var.e;
                    String str3 = localeInfo.pluralLangCode;
                    x41Var.v = str3;
                    t41Var.setText(x41.A(x41.F(str3, null, null)));
                    if (x41Var.h != null) {
                        view2 = x41Var.f31163n;
                    } else {
                        view2 = x41Var.f31168y;
                    }
                    w41Var.D(view2);
                    x41.J(x41Var.v);
                    x41Var.N();
                    return;
                }
                return;
            case 28:
                el elVar = (el) this.f3940b;
                TranslateController translateController = (TranslateController) this.f3941c;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.d;
                long j12 = elVar.f27849b;
                translateController.setHideTranslateDialog(j12, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(elVar.f27848a).getChat(Long.valueOf(-j12));
                if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat2 != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                zc.a0(elVar.f27850c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new k31(5, elVar, translateController)).j();
                m1Var.d(true);
                return;
            default:
                hu0 hu0Var = (hu0) this.f3940b;
                Context context4 = (Context) this.f3941c;
                Bitmap bitmap = (Bitmap) this.d;
                if (hu0Var.L1) {
                    qg.x xVar2 = new qg.x(context4, hu0Var.Q1);
                    xVar2.n(hu0Var.K1.f43543a, 2);
                    xVar2.f43612n = new rg.v(hu0Var, bitmap);
                    xVar2.h = new rg.m(hu0Var, 1);
                    xVar2.show();
                    return;
                }
                Runnable runnable5 = hu0Var.U1;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
        }
    }

    public x(w90 w90Var, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f3939a = 23;
        this.f3940b = w90Var;
        this.d = e3Var;
        this.f3941c = m2Var;
    }
}
