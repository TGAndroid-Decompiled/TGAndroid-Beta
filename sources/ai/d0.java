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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.fe;
import org.telegram.ui.Components.g41;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zp;
import org.telegram.ui.c70;
import org.telegram.ui.vt0;
import org.telegram.ui.xn;
import org.telegram.ui.yk;
public final class d0 implements View.OnClickListener {
    public final int f691a;
    public final Object f692b;
    public final Object f693c;
    public final Object d;

    public d0(Object obj, Object obj2, Object obj3, int i10) {
        this.f691a = i10;
        this.f692b = obj;
        this.f693c = obj2;
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
        nf nfVar;
        boolean z12;
        boolean D1;
        fc0 fc0Var;
        CharSequence charSequence;
        View view2;
        String string;
        switch (this.f691a) {
            case 0:
                ((f3) this.f692b).run(Long.valueOf(((long[]) this.f693c)[0]));
                ((org.telegram.ui.ActionBar.g3) this.d).dismiss();
                return;
            case 1:
                e6 e6Var = ((v5) this.f692b).f1614l;
                e6Var.F0((ci.ca) this.f693c, (TL_stories.StoryItem) this.d);
                v5 v5Var = e6Var.f830t1;
                if (v5Var != null) {
                    v5Var.a();
                    return;
                }
                return;
            case 2:
                v5 v5Var2 = (v5) this.f692b;
                jc jcVar = (jc) this.d;
                ((org.telegram.ui.ActionBar.g1) this.f693c).performHapticFeedback(3);
                xc X = xc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.e(12, v5Var2, jcVar))).j();
                    return;
                }
                return;
            case 3:
                s6 s6Var = (s6) this.f692b;
                y3 y3Var = new y3(s6Var, 1);
                k7 k7Var = s6Var.f1499b;
                new uv(y3Var, k7Var.getContext(), k7Var.f1136s, (ArrayList) this.f693c).show();
                ((a80) this.d).u();
                return;
            case 4:
                ci.ac acVar = (ci.ac) this.f692b;
                FrameLayout frameLayout = (FrameLayout) this.f693c;
                d dVar = (d) this.d;
                a80 a80Var = acVar.V0;
                if (a80Var == null || !a80Var.D()) {
                    ci.o oVar2 = new ci.o(acVar, 0);
                    boolean isPremium = UserConfig.getInstance(acVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new ci.o(acVar, 1);
                    }
                    a80 F = a80.F(frameLayout, dVar, acVar.T0);
                    acVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    acVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ci.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            a80 a80Var2 = acVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.i6.E8;
                            a80Var2.b(0, null, str, i12, i12, new o8(oVar2, i11, 2));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                o8Var = new o8(oVar, i11, 3);
                            } else {
                                o8Var = null;
                            }
                            a80Var2.M(o8Var);
                            if (acVar.X0 == i10) {
                                acVar.V0.L();
                            }
                            i10++;
                        } else {
                            a80 a80Var3 = acVar.V0;
                            a80Var3.f22606s = 0;
                            a80Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 5:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f693c;
                ci.r3 r3Var = (ci.r3) this.d;
                ci.w3 w3Var = ((ci.o3) this.f692b).f5248c;
                ArrayList arrayList = w3Var.f5774h0;
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
                ci.mb mbVar = (ci.mb) this.f692b;
                Context context = (Context) this.f693c;
                pg.u0 u0Var = (pg.u0) this.d;
                if (mbVar.B1) {
                    pg.x xVar = new pg.x(context, mbVar.G1);
                    mbVar.T1 = xVar;
                    xVar.m(mbVar.A1.f41263a, 2);
                    xVar.f41306n = new ci.r5(mbVar, u0Var);
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
                hg.e eVar = (hg.e) this.f692b;
                a80 F2 = a80.F(((xn) this.f693c).getLayoutContainer(), (org.telegram.ui.ActionBar.e6) this.d, eVar.f10248n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new hg.d(eVar, 1), true);
                F2.E();
                if (eVar.f10252x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new hg.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f22606s = 0;
                F2.Z();
                return;
            case 8:
                hg.l0.S((hg.l0) this.f692b, (TL_account.TL_connectedBot) this.f693c, (kd) this.d);
                return;
            case 9:
                hi.b bVar = (hi.b) this.f692b;
                Utilities.Callback callback = (Utilities.Callback) this.f693c;
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
                ((m.p3) this.f692b).a();
                ((ii.e6) this.f693c).D((ii.o0) this.d);
                return;
            case 11:
                org.telegram.ui.Components.q.P((org.telegram.ui.Components.q) this.f692b, (TL_aicompose.AiComposeTone) this.f693c, (org.telegram.ui.ActionBar.e6) this.d);
                return;
            case 12:
                ((boolean[]) this.f692b)[0] = false;
                ((org.telegram.ui.Components.d5) this.f693c).J(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.b3) this.d).f18683a.dismissRunnable;
                runnable.run();
                return;
            case 13:
                Runnable runnable3 = (Runnable) this.f693c;
                org.telegram.ui.Components.b5 b5Var = (org.telegram.ui.Components.b5) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = ((org.telegram.ui.ActionBar.c2[]) this.f692b)[0];
                if (c2Var != null) {
                    c2Var.setOnDismissListener(null);
                }
                runnable3.run();
                b5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 14:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f692b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f693c).run();
                ((AlertDialog$Builder) this.d).f18655a.L0.run();
                return;
            case 15:
                ((org.telegram.ui.Components.i8) this.f692b).f25041n.B0((org.telegram.ui.Cells.x) this.f693c, (MessageObject) this.d);
                return;
            case 16:
                wi wiVar = (wi) this.f692b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f693c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = wiVar.f29962f0;
                int i14 = wiVar.J1;
                di diVar = wiVar.I0;
                nf nfVar2 = wiVar.f29968h0;
                if (nfVar2 != null) {
                    j3 = nfVar2.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                wiVar.N0 = j10;
                diVar.setEffect(j10);
                wiVar.forceKeyboardOnDismiss();
                if (wiVar.K - wiVar.L < 0) {
                    AndroidUtilities.shakeView(wiVar.f30001s);
                    AndroidUtilities.shakeView(wiVar.v);
                    try {
                        diVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > wiVar.L) {
                        wiVar.L1(o2Var);
                    }
                    nf nfVar3 = wiVar.f29968h0;
                    if (nfVar3 != null) {
                        nfVar3.h(false);
                        wiVar.f29968h0 = null;
                        return;
                    }
                    return;
                }
                if (wiVar.H1 == null && (o2Var2 instanceof xn)) {
                    xn xnVar = (xn) o2Var2;
                    if (xnVar.c()) {
                        org.telegram.ui.Components.e5.M(wiVar.getContext(), xnVar.a(), new z1(wiVar, j10, 4), e6Var2);
                        z11 = false;
                        wiVar.E1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                oi oiVar = wiVar.f30023y0;
                if (oiVar != wiVar.f29974j0 && oiVar != wiVar.f29994q0) {
                    if (!oiVar.I(0, true, 0, wiVar.p1(), j10)) {
                        wiVar.A2 = true;
                        wiVar.dismiss();
                    }
                    nfVar = null;
                    D1 = false;
                    z12 = true;
                } else {
                    nfVar = null;
                    z12 = true;
                    D1 = wiVar.D1(0, true, 0, wiVar.p1(), j10);
                }
                nf nfVar4 = wiVar.f29968h0;
                if (nfVar4 != null) {
                    nfVar4.h(D1 ^ z12);
                    wiVar.f29968h0 = nfVar;
                }
                wiVar.E1(z11, z11);
                return;
            case 17:
                wi wiVar2 = (wi) this.f692b;
                MessageObject messageObject = (MessageObject) this.f693c;
                wiVar2.E1(!wiVar2.f29952c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = wiVar2.f29952c0;
                message.invert_media = z14;
                ((fc0) this.d).a(!z14, true);
                wiVar2.f29968h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar2.f29974j0;
                if (chatAttachAlertPhotoLayout != null && (fc0Var = chatAttachAlertPhotoLayout.f22135d1) != null) {
                    fc0Var.a(!wiVar2.f29952c0, true);
                }
                wiVar2.f29968h0.n(!wiVar2.f29952c0);
                return;
            case 18:
                ci.d dVar2 = (ci.d) this.d;
                ((Utilities.Callback) this.f693c).run(new nf.e(new zp(dVar2, 4), new fe(20, (or) this.f692b, dVar2)));
                return;
            case 19:
                Context context2 = (Context) this.f693c;
                ((mr) this.f692b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.c9) this.d).f20108a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 20:
                du duVar = (du) this.f692b;
                fi.o oVar3 = (fi.o) this.f693c;
                ci.u1 u1Var = (ci.u1) this.d;
                try {
                    charSequence = ((ClipboardManager) duVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(duVar.getContext());
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
                lu luVar = (lu) this.f692b;
                cw0 cw0Var = (cw0) this.f693c;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) this.d;
                gu guVar = luVar.f26144a;
                hg.k kVar = luVar.f26145b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.q1 q1Var = luVar.K;
                    if (q1Var == null || !q1Var.f19722f) {
                        boolean z15 = true;
                        if (luVar.f26148n) {
                            guVar.hideActionMode();
                            a80 a80Var4 = new a80(cw0Var, e6Var3, kVar, false, false, true);
                            a80Var4.X = AndroidUtilities.dp(280.0f);
                            guVar.extendActionMode(null, new bb0(a80Var4, new org.telegram.ui.Components.y2(guVar, 4), guVar.getOnPremiumMenuLockClickListener()));
                            a80Var4.U = true;
                            a80Var4.Z();
                            return;
                        } else if (!luVar.e) {
                            luVar.x(1);
                            boolean isFocused = guVar.isFocused();
                            hu huVar = luVar.d;
                            if (guVar.length() <= 0) {
                                z15 = false;
                            }
                            huVar.B(z15, false);
                            guVar.requestFocus();
                            if (!isFocused) {
                                guVar.setSelection(guVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (luVar.f26152x) {
                                luVar.k(true);
                                luVar.f26152x = false;
                                luVar.p();
                            }
                            luVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 22:
                q20 q20Var = (q20) this.f692b;
                q20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f693c);
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f18655a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new nv(q20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.o2) this.d).showDialog(alertDialog$Builder.f18655a);
                return;
            case 23:
                i90 i90Var = (i90) this.f692b;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.d;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.f693c;
                try {
                    if (i90Var.f25056b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", i90Var.f25056b));
                        if (g3Var != null && g3Var.getContainer() != null) {
                            new xc(g3Var.getContainer(), null).k(false).j();
                        } else {
                            xc.j(o2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 24:
                ac0 ac0Var = (ac0) this.f692b;
                fc0 fc0Var2 = (fc0) this.f693c;
                fc0 fc0Var3 = (fc0) this.d;
                gc0 gc0Var = ac0Var.f22650c0;
                MessagePreviewParams messagePreviewParams = gc0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        gc0Var.f24548x = true;
                    }
                } else {
                    if (gc0Var.f24548x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    gc0Var.f24548x = false;
                }
                fc0Var2.a(z17, true);
                fc0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                ac0Var.h();
                ac0Var.k(true);
                return;
            case 25:
                ke0.n((ke0) this.f692b, (TLRPC.ChatFull) this.f693c, (c70) this.d);
                return;
            case 26:
                uf0 uf0Var = (uf0) this.f692b;
                Context context3 = (Context) this.f693c;
                org.telegram.ui.ActionBar.e6 e6Var4 = (org.telegram.ui.ActionBar.e6) this.d;
                if (uf0Var.h == null) {
                    ci.a4 a4Var = new ci.a4(context3, e6Var4, LocaleController.getString(R.string.VideoChooseCover), uf0Var.f28872f);
                    uf0Var.h = a4Var;
                    a4Var.setOnDismissListener(new jc0(uf0Var, 9));
                    uf0Var.h.f4343f = uf0Var.f28873n;
                }
                uf0Var.h.show();
                return;
            case 27:
                i41 i41Var = (i41) this.f692b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                k41 k41Var = i41Var.h;
                Runnable runnable4 = ((Runnable[]) this.f693c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = k41Var.v;
                j41 j41Var = k41Var.I;
                if (!TextUtils.equals(str2, localeInfo.pluralLangCode)) {
                    View view3 = j41Var.d;
                    if (view3 == k41Var.E || view3 == k41Var.f25626r) {
                        k41Var.f25628w = k41Var.v;
                    }
                    g41 g41Var = i41Var.e;
                    String str3 = localeInfo.pluralLangCode;
                    k41Var.v = str3;
                    g41Var.setText(k41.y(k41.E(str3, null, null)));
                    if (k41Var.h != null) {
                        view2 = k41Var.f25625n;
                    } else {
                        view2 = k41Var.f25630y;
                    }
                    j41Var.D(view2);
                    k41.I(k41Var.v);
                    k41Var.M();
                    return;
                }
                return;
            case 28:
                yk ykVar = (yk) this.f692b;
                TranslateController translateController = (TranslateController) this.f693c;
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.d;
                long j11 = ykVar.f22902b;
                translateController.setHideTranslateDialog(j11, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(ykVar.f22901a).getChat(Long.valueOf(-j11));
                if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat2 != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                xc.a0(ykVar.f22903c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new dp0(15, ykVar, translateController)).j();
                o1Var.d(true);
                return;
            default:
                vt0 vt0Var = (vt0) this.f692b;
                Context context4 = (Context) this.f693c;
                Bitmap bitmap = (Bitmap) this.d;
                if (vt0Var.L1) {
                    pg.x xVar2 = new pg.x(context4, vt0Var.Q1);
                    xVar2.m(vt0Var.K1.f41263a, 2);
                    xVar2.f41306n = new qg.v(vt0Var, bitmap);
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

    public d0(i90 i90Var, org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f691a = 23;
        this.f692b = i90Var;
        this.d = g3Var;
        this.f693c = o2Var;
    }
}
