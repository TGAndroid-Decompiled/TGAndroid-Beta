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
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Components.zp;
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
        nf nfVar;
        boolean z12;
        boolean G1;
        fc0 fc0Var;
        CharSequence charSequence;
        View view2;
        String string;
        switch (this.f688a) {
            case 0:
                ((f3) this.f689b).run(Long.valueOf(((long[]) this.f690c)[0]));
                ((org.telegram.ui.ActionBar.e3) this.d).dismiss();
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
                ((org.telegram.ui.ActionBar.e1) this.f690c).performHapticFeedback(3);
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
                new uv(y3Var, k7Var.getContext(), k7Var.f1134s, (ArrayList) this.f690c).show();
                ((z70) this.d).u();
                return;
            case 4:
                ci.bc bcVar = (ci.bc) this.f689b;
                FrameLayout frameLayout = (FrameLayout) this.f690c;
                d dVar = (d) this.d;
                z70 z70Var = bcVar.V0;
                if (z70Var == null || !z70Var.D()) {
                    ci.o oVar2 = new ci.o(bcVar, 0);
                    boolean isPremium = UserConfig.getInstance(bcVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new ci.o(bcVar, 1);
                    }
                    z70 F = z70.F(frameLayout, dVar, bcVar.T0);
                    bcVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    bcVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ci.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            z70 z70Var2 = bcVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.h6.E8;
                            z70Var2.b(0, null, str, i12, i12, new o8(oVar2, i11, 2));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                o8Var = new o8(oVar, i11, 3);
                            } else {
                                o8Var = null;
                            }
                            z70Var2.M(o8Var);
                            if (bcVar.X0 == i10) {
                                bcVar.V0.L();
                            }
                            i10++;
                        } else {
                            z70 z70Var3 = bcVar.V0;
                            z70Var3.f30839s = 0;
                            z70Var3.Z();
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
                pg.u0 u0Var = (pg.u0) this.d;
                if (nbVar.B1) {
                    pg.x xVar = new pg.x(context, nbVar.G1);
                    nbVar.T1 = xVar;
                    xVar.m(nbVar.A1.f41264a, 2);
                    xVar.f41307n = new ci.r5(nbVar, u0Var);
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
                z70 F2 = z70.F(((wn) this.f690c).getLayoutContainer(), (org.telegram.ui.ActionBar.d6) this.d, fVar.f10250n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new hg.e(fVar, 1), true);
                F2.E();
                if (fVar.f10254x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new hg.e(fVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f30839s = 0;
                F2.Z();
                return;
            case 8:
                hg.m0.S((hg.m0) this.f689b, (TL_account.TL_connectedBot) this.f690c, (ld) this.d);
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
                runnable = ((org.telegram.ui.ActionBar.z2) this.d).f19949a.dismissRunnable;
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
                ((AlertDialog$Builder) this.d).f18661a.L0.run();
                return;
            case 15:
                ((org.telegram.ui.Components.i8) this.f689b).f24996n.B0((org.telegram.ui.Cells.x) this.f690c, (MessageObject) this.d);
                return;
            case 16:
                wi wiVar = (wi) this.f689b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f690c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = wiVar.f30020f0;
                int i14 = wiVar.J1;
                gi giVar = wiVar.I0;
                nf nfVar2 = wiVar.f30026h0;
                if (nfVar2 != null) {
                    j3 = nfVar2.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                wiVar.N0 = j10;
                giVar.setEffect(j10);
                wiVar.forceKeyboardOnDismiss();
                if (wiVar.K - wiVar.L < 0) {
                    AndroidUtilities.shakeView(wiVar.f30059s);
                    AndroidUtilities.shakeView(wiVar.v);
                    try {
                        giVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > wiVar.L) {
                        wiVar.O1(m2Var);
                    }
                    nf nfVar3 = wiVar.f30026h0;
                    if (nfVar3 != null) {
                        nfVar3.h(false);
                        wiVar.f30026h0 = null;
                        return;
                    }
                    return;
                }
                if (wiVar.H1 == null && (m2Var2 instanceof wn)) {
                    wn wnVar = (wn) m2Var2;
                    if (wnVar.c()) {
                        org.telegram.ui.Components.e5.M(wiVar.getContext(), wnVar.a(), new z1(wiVar, j10, 4), d6Var);
                        z11 = false;
                        wiVar.H1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                oi oiVar = wiVar.f30081y0;
                if (oiVar != wiVar.f30032j0 && oiVar != wiVar.f30052q0) {
                    if (!oiVar.I(0, true, 0, wiVar.s1(), j10)) {
                        wiVar.A2 = true;
                        wiVar.dismiss();
                    }
                    nfVar = null;
                    G1 = false;
                    z12 = true;
                } else {
                    nfVar = null;
                    z12 = true;
                    G1 = wiVar.G1(0, true, 0, wiVar.s1(), j10);
                }
                nf nfVar4 = wiVar.f30026h0;
                if (nfVar4 != null) {
                    nfVar4.h(G1 ^ z12);
                    wiVar.f30026h0 = nfVar;
                }
                wiVar.H1(z11, z11);
                return;
            case 17:
                wi wiVar2 = (wi) this.f689b;
                MessageObject messageObject = (MessageObject) this.f690c;
                wiVar2.H1(!wiVar2.f30010c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = wiVar2.f30010c0;
                message.invert_media = z14;
                ((fc0) this.d).a(!z14, true);
                wiVar2.f30026h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar2.f30032j0;
                if (chatAttachAlertPhotoLayout != null && (fc0Var = chatAttachAlertPhotoLayout.f22132d1) != null) {
                    fc0Var.a(!wiVar2.f30010c0, true);
                }
                wiVar2.f30026h0.n(!wiVar2.f30010c0);
                return;
            case 18:
                ci.d dVar2 = (ci.d) this.d;
                ((Utilities.Callback) this.f690c).run(new nf.e(new zp(dVar2, 4), new kd(23, (or) this.f689b, dVar2)));
                return;
            case 19:
                Context context2 = (Context) this.f690c;
                ((mr) this.f689b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.c9) this.d).f20106a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 20:
                du duVar = (du) this.f689b;
                fi.o oVar3 = (fi.o) this.f690c;
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
                lu luVar = (lu) this.f689b;
                bw0 bw0Var = (bw0) this.f690c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                gu guVar = luVar.f26172a;
                hg.l lVar = luVar.f26173b;
                if (lVar.isEnabled() && lVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.o1 o1Var = luVar.K;
                    if (o1Var == null || !o1Var.f19672f) {
                        boolean z15 = true;
                        if (luVar.f26176n) {
                            guVar.hideActionMode();
                            z70 z70Var4 = new z70(bw0Var, d6Var2, lVar, false, false, true);
                            z70Var4.X = AndroidUtilities.dp(280.0f);
                            guVar.extendActionMode(null, new bb0(z70Var4, new org.telegram.ui.Components.y2(guVar, 4), guVar.getOnPremiumMenuLockClickListener()));
                            z70Var4.U = true;
                            z70Var4.Z();
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
                            if (luVar.f26180x) {
                                luVar.k(true);
                                luVar.f26180x = false;
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
                p20 p20Var = (p20) this.f689b;
                p20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f690c);
                alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f18661a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new nv(p20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.m2) this.d).showDialog(alertDialog$Builder.f18661a);
                return;
            case 23:
                h90 h90Var = (h90) this.f689b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) this.f690c;
                try {
                    if (h90Var.f24727b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", h90Var.f24727b));
                        if (e3Var != null && e3Var.getContainer() != null) {
                            new xc(e3Var.getContainer(), null).k(false).j();
                        } else {
                            xc.j(m2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 24:
                ac0 ac0Var = (ac0) this.f689b;
                fc0 fc0Var2 = (fc0) this.f690c;
                fc0 fc0Var3 = (fc0) this.d;
                gc0 gc0Var = ac0Var.f22606c0;
                MessagePreviewParams messagePreviewParams = gc0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        gc0Var.f24470x = true;
                    }
                } else {
                    if (gc0Var.f24470x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    gc0Var.f24470x = false;
                }
                fc0Var2.a(z17, true);
                fc0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                ac0Var.h();
                ac0Var.k(true);
                return;
            case 25:
                le0.n((le0) this.f689b, (TLRPC.ChatFull) this.f690c, (z60) this.d);
                return;
            case 26:
                vf0 vf0Var = (vf0) this.f689b;
                Context context3 = (Context) this.f690c;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.d;
                if (vf0Var.h == null) {
                    ci.a4 a4Var = new ci.a4(context3, d6Var3, LocaleController.getString(R.string.VideoChooseCover), vf0Var.f29075f);
                    vf0Var.h = a4Var;
                    a4Var.setOnDismissListener(new jc0(vf0Var, 9));
                    vf0Var.h.f4341f = vf0Var.f29076n;
                }
                vf0Var.h.show();
                return;
            case 27:
                h41 h41Var = (h41) this.f689b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                j41 j41Var = h41Var.h;
                Runnable runnable4 = ((Runnable[]) this.f690c)[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = j41Var.v;
                i41 i41Var = j41Var.I;
                if (!TextUtils.equals(str2, localeInfo.pluralLangCode)) {
                    View view3 = i41Var.d;
                    if (view3 == j41Var.E || view3 == j41Var.f25257r) {
                        j41Var.f25259w = j41Var.v;
                    }
                    f41 f41Var = h41Var.e;
                    String str3 = localeInfo.pluralLangCode;
                    j41Var.v = str3;
                    f41Var.setText(j41.y(j41.E(str3, null, null)));
                    if (j41Var.h != null) {
                        view2 = j41Var.f25256n;
                    } else {
                        view2 = j41Var.f25261y;
                    }
                    i41Var.D(view2);
                    j41.I(j41Var.v);
                    j41Var.M();
                    return;
                }
                return;
            case 28:
                wk wkVar = (wk) this.f689b;
                TranslateController translateController = (TranslateController) this.f690c;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.d;
                long j11 = wkVar.f22537b;
                translateController.setHideTranslateDialog(j11, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(wkVar.f22536a).getChat(Long.valueOf(-j11));
                if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat2 != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                xc.a0(wkVar.f22538c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new xn0(18, wkVar, translateController)).j();
                m1Var.d(true);
                return;
            default:
                st0 st0Var = (st0) this.f689b;
                Context context4 = (Context) this.f690c;
                Bitmap bitmap = (Bitmap) this.d;
                if (st0Var.L1) {
                    pg.x xVar2 = new pg.x(context4, st0Var.Q1);
                    xVar2.m(st0Var.K1.f41264a, 2);
                    xVar2.f41307n = new qg.w(st0Var, bitmap);
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

    public d0(h90 h90Var, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f688a = 23;
        this.f689b = h90Var;
        this.d = e3Var;
        this.f690c = m2Var;
    }
}
