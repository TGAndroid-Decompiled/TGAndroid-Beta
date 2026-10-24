package ai;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kf;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.rv;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yv;
import org.telegram.ui.p60;
import org.telegram.ui.sn;
public final class v0 implements View.OnClickListener {
    public final int f2284a;
    public final Object f2285b;
    public final Object f2286c;
    public final Object d;

    public v0(Object obj, Object obj2, Object obj3, int i10) {
        this.f2284a = i10;
        this.f2285b = obj;
        this.f2286c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        ei.o oVar;
        String formatPluralString;
        ah.g gVar;
        boolean z10;
        Runnable runnable;
        long j10;
        boolean z11;
        boolean z12;
        kf kfVar;
        boolean N1;
        oc0 oc0Var;
        CharSequence charSequence;
        switch (this.f2284a) {
            case 0:
                Context context = (Context) this.f2286c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                if (((b1) this.f2285b).f1010n0.f631a == ag.b.f633a) {
                    new ed(context, g6Var).show();
                    return;
                }
                return;
            case 1:
                final org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f2286c;
                final ei.d dVar = (ei.d) this.d;
                h3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((w8) this.f2285b).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                                if (booleanValue) {
                                    h3Var2.dismiss();
                                    return;
                                }
                                final ei.d dVar2 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                h3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                            default:
                                                h3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var3 = h3Var;
                                if (booleanValue2) {
                                    h3Var3.dismiss();
                                    return;
                                }
                                final ei.d dVar3 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                h3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                h3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                        }
                    }
                });
                return;
            case 2:
                final org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) this.f2286c;
                final ei.d dVar2 = (ei.d) this.d;
                h3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((o9) this.f2285b).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var22 = h3Var2;
                                if (booleanValue) {
                                    h3Var22.dismiss();
                                    return;
                                }
                                final ei.d dVar22 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                h3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                            default:
                                                h3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var3 = h3Var2;
                                if (booleanValue2) {
                                    h3Var3.dismiss();
                                    return;
                                }
                                final ei.d dVar3 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                h3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                h3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                        }
                    }
                });
                return;
            case 3:
                ((ci.f2) this.f2285b).run(Long.valueOf(((long[]) this.f2286c)[0]));
                ((org.telegram.ui.ActionBar.h3) this.d).dismiss();
                return;
            case 4:
                ci.p4 p4Var = ((ci.g4) this.f2285b).f5359l;
                p4Var.E0((ei.p9) this.f2286c, (TL_stories.StoryItem) this.d);
                ci.g4 g4Var = p4Var.f5708t1;
                if (g4Var != null) {
                    g4Var.a();
                    return;
                }
                return;
            case 5:
                ci.g4 g4Var2 = (ci.g4) this.f2285b;
                ci.z9 z9Var = (ci.z9) this.d;
                ((org.telegram.ui.ActionBar.e1) this.f2286c).performHapticFeedback(3);
                org.telegram.ui.Components.vc X = org.telegram.ui.Components.vc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new qa(16, g4Var2, z9Var))).j();
                    return;
                }
                return;
            case 6:
                ci.c5 c5Var = (ci.c5) this.f2285b;
                a5 a5Var = new a5(c5Var, 2);
                ci.t5 t5Var = c5Var.f5221b;
                new yv(a5Var, t5Var.getContext(), t5Var.f5959s, (ArrayList) this.f2286c).show();
                ((h80) this.d).u();
                return;
            case 7:
                ei.lb lbVar = (ei.lb) this.f2285b;
                FrameLayout frameLayout = (FrameLayout) this.f2286c;
                ci.b bVar = (ci.b) this.d;
                h80 h80Var = lbVar.V0;
                if (h80Var == null || !h80Var.D()) {
                    ei.o oVar2 = new ei.o(lbVar, 0);
                    boolean isPremium = UserConfig.getInstance(lbVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new ei.o(lbVar, 1);
                    }
                    h80 F = h80.F(frameLayout, bVar, lbVar.T0);
                    lbVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    lbVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ei.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            h80 h80Var2 = lbVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.k6.E8;
                            h80Var2.b(0, null, str, i12, i12, new ah.g(oVar2, i11, 5));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                gVar = new ah.g(oVar, i11, 6);
                            } else {
                                gVar = null;
                            }
                            h80Var2.M(gVar);
                            if (lbVar.X0 == i10) {
                                lbVar.V0.L();
                            }
                            i10++;
                        } else {
                            h80 h80Var3 = lbVar.V0;
                            h80Var3.f26929s = 0;
                            h80Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 8:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f2286c;
                ei.m3 m3Var = (ei.m3) this.d;
                ei.q3 q3Var = ((ei.j3) this.f2285b).f9254c;
                ArrayList arrayList = q3Var.f9648h0;
                if (arrayList.contains(photoEntry)) {
                    arrayList.remove(photoEntry);
                } else if (arrayList.size() + 1 > q3Var.R) {
                    int i13 = -q3Var.N;
                    q3Var.N = i13;
                    AndroidUtilities.shakeViewSpring(m3Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                } else {
                    arrayList.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(q3Var.d);
                q3Var.j();
                return;
            case 9:
                ei.xa xaVar = (ei.xa) this.f2285b;
                Context context2 = (Context) this.f2286c;
                qg.u0 u0Var = (qg.u0) this.d;
                if (xaVar.B1) {
                    qg.y yVar = new qg.y(context2, xaVar.G1);
                    xaVar.T1 = yVar;
                    yVar.m(xaVar.A1.f45065a, 2);
                    yVar.f45129n = new ei.h5(xaVar, u0Var);
                    yVar.h = new c8(2, xaVar, u0Var);
                    yVar.show();
                    return;
                }
                Runnable runnable2 = xaVar.K1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 10:
                ig.e eVar = (ig.e) this.f2285b;
                h80 F2 = h80.F(((sn) this.f2286c).getLayoutContainer(), (org.telegram.ui.ActionBar.g6) this.d, eVar.f12901n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new ig.d(eVar, 1), true);
                F2.E();
                if (eVar.f12905x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new ig.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f26929s = 0;
                F2.Z();
                return;
            case 11:
                ig.j0.S((ig.j0) this.f2285b, (TL_account.TL_connectedBot) this.f2286c, (org.telegram.ui.Components.c2) this.d);
                return;
            case 12:
                ji.a aVar = (ji.a) this.f2285b;
                Utilities.Callback callback = (Utilities.Callback) this.f2286c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z13 = aVar.Y;
                if (chat != null && !ChatObject.canAddChatToCommunity(chat)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.P(callback, z13, z10);
                return;
            case 13:
                ((m.s3) this.f2285b).a();
                ((ki.c6) this.f2286c).C((ki.n0) this.d);
                return;
            case 14:
                org.telegram.ui.Components.q.P((org.telegram.ui.Components.q) this.f2285b, (TL_aicompose.AiComposeTone) this.f2286c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 15:
                ((boolean[]) this.f2285b)[0] = false;
                ((org.telegram.ui.Components.b5) this.f2286c).C(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.b3) this.d).f20729a.dismissRunnable;
                runnable.run();
                return;
            case 16:
                Runnable runnable3 = (Runnable) this.f2286c;
                org.telegram.ui.Components.z4 z4Var = (org.telegram.ui.Components.z4) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = ((org.telegram.ui.ActionBar.c2[]) this.f2285b)[0];
                if (c2Var != null) {
                    c2Var.setOnDismissListener(null);
                }
                runnable3.run();
                z4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 17:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f2285b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f2286c).run();
                ((AlertDialog$Builder) this.d).f20679a.N0.run();
                return;
            case 18:
                ((org.telegram.ui.Components.h8) this.f2285b).f26897n.I0((org.telegram.ui.Cells.w) this.f2286c, (MessageObject) this.d);
                return;
            case 19:
                ri riVar = (ri) this.f2285b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f2286c;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = riVar.f30146f0;
                int i14 = riVar.M1;
                ci ciVar = riVar.L0;
                kf kfVar2 = riVar.f30152h0;
                if (kfVar2 != null) {
                    j10 = kfVar2.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                riVar.Q0 = j11;
                ciVar.setEffect(j11);
                riVar.forceKeyboardOnDismiss();
                if (riVar.K - riVar.L < 0) {
                    AndroidUtilities.shakeView(riVar.f30185s);
                    AndroidUtilities.shakeView(riVar.v);
                    try {
                        ciVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > riVar.L) {
                        riVar.W1(o2Var);
                    }
                    kf kfVar3 = riVar.f30152h0;
                    if (kfVar3 != null) {
                        kfVar3.g(false);
                        riVar.f30152h0 = null;
                        return;
                    }
                    return;
                }
                if (riVar.K1 == null && (o2Var2 instanceof sn)) {
                    sn snVar = (sn) o2Var2;
                    if (snVar.c()) {
                        org.telegram.ui.Components.d5.L(riVar.getContext(), snVar.a(), new ci.d1(riVar, j11, 4), g6Var2);
                        z11 = false;
                        riVar.O1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                ji jiVar = riVar.B0;
                if (jiVar != riVar.f30158j0 && jiVar != riVar.f30178q0) {
                    if (!jiVar.K(0, true, 0, riVar.x1(), j11)) {
                        riVar.G2 = true;
                        riVar.dismiss();
                    }
                    N1 = false;
                    z12 = true;
                    kfVar = null;
                } else {
                    z12 = true;
                    kfVar = null;
                    N1 = riVar.N1(0, true, 0, riVar.x1(), j11);
                }
                kf kfVar4 = riVar.f30152h0;
                if (kfVar4 != null) {
                    kfVar4.g(N1 ^ z12);
                    riVar.f30152h0 = kfVar;
                }
                riVar.O1(z11, z11);
                return;
            case 20:
                ri riVar2 = (ri) this.f2285b;
                MessageObject messageObject = (MessageObject) this.f2286c;
                riVar2.O1(!riVar2.f30136c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = riVar2.f30136c0;
                message.invert_media = z14;
                ((oc0) this.d).a(!z14, true);
                riVar2.f30152h0.e(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = riVar2.f30158j0;
                if (chatAttachAlertPhotoLayout != null && (oc0Var = chatAttachAlertPhotoLayout.f24235d1) != null) {
                    oc0Var.a(!riVar2.f30136c0, true);
                }
                riVar2.f30152h0.m(!riVar2.f30136c0);
                return;
            case 21:
                ei.d dVar3 = (ei.d) this.d;
                ((Utilities.Callback) this.f2286c).run(new pf.c(new xp(dVar3, 5), new org.telegram.ui.Components.ce(25, (vr) this.f2285b, dVar3)));
                return;
            case 22:
                Context context3 = (Context) this.f2286c;
                ((tr) this.f2285b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.c9) this.d).f22216a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 23:
                gu guVar = (gu) this.f2285b;
                t tVar = (t) this.f2286c;
                ei.s1 s1Var = (ei.s1) this.d;
                try {
                    charSequence = ((ClipboardManager) guVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(guVar.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    tVar.setText(charSequence);
                    tVar.setSelection(0, tVar.getText().length());
                }
                s1Var.run();
                return;
            case 24:
                ou ouVar = (ou) this.f2285b;
                nw0 nw0Var = (nw0) this.f2286c;
                org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) this.d;
                ju juVar = ouVar.f29381a;
                ig.k kVar = ouVar.f29382b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.o1 o1Var = ouVar.K;
                    if (o1Var == null || !o1Var.f21722f) {
                        boolean z15 = true;
                        if (ouVar.f29385n) {
                            juVar.hideActionMode();
                            h80 h80Var4 = new h80(nw0Var, g6Var3, kVar, false, false, true);
                            h80Var4.X = AndroidUtilities.dp(280.0f);
                            juVar.extendActionMode(null, new ib0(h80Var4, new org.telegram.ui.Components.x2(juVar, 4), juVar.getOnPremiumMenuLockClickListener()));
                            h80Var4.U = true;
                            h80Var4.Z();
                            return;
                        } else if (!ouVar.e) {
                            ouVar.x(1);
                            boolean isFocused = juVar.isFocused();
                            ku kuVar = ouVar.d;
                            if (juVar.length() <= 0) {
                                z15 = false;
                            }
                            kuVar.C(z15, false);
                            juVar.requestFocus();
                            if (!isFocused) {
                                juVar.setSelection(juVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (ouVar.f29389x) {
                                ouVar.k(true);
                                ouVar.f29389x = false;
                                ouVar.p();
                            }
                            ouVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 25:
                u20 u20Var = (u20) this.f2285b;
                u20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f2286c);
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f20679a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new rv(u20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.o2) this.d).showDialog(alertDialog$Builder.f20679a);
                return;
            case 26:
                p90 p90Var = (p90) this.f2285b;
                org.telegram.ui.ActionBar.h3 h3Var3 = (org.telegram.ui.ActionBar.h3) this.f2286c;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.d;
                try {
                    if (p90Var.f29517b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", p90Var.f29517b));
                        if (h3Var3 != null && h3Var3.getContainer() != null) {
                            new org.telegram.ui.Components.vc(h3Var3.getContainer(), null).k(false).j();
                        } else {
                            org.telegram.ui.Components.vc.j(o2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 27:
                jc0 jc0Var = (jc0) this.f2285b;
                oc0 oc0Var2 = (oc0) this.f2286c;
                oc0 oc0Var3 = (oc0) this.d;
                pc0 pc0Var = jc0Var.f27674c0;
                MessagePreviewParams messagePreviewParams = pc0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        pc0Var.f29545x = true;
                    }
                } else {
                    if (pc0Var.f29545x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    pc0Var.f29545x = false;
                }
                oc0Var2.a(z17, true);
                oc0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                jc0Var.i();
                jc0Var.l(true);
                return;
            case 28:
                ve0.n((ve0) this.f2285b, (TLRPC.ChatFull) this.f2286c, (p60) this.d);
                return;
            default:
                hg0 hg0Var = (hg0) this.f2285b;
                Context context4 = (Context) this.f2286c;
                org.telegram.ui.ActionBar.g6 g6Var4 = (org.telegram.ui.ActionBar.g6) this.d;
                if (hg0Var.h == null) {
                    ei.u3 u3Var = new ei.u3(context4, g6Var4, LocaleController.getString(R.string.VideoChooseCover), hg0Var.f27030f);
                    hg0Var.h = u3Var;
                    u3Var.setOnDismissListener(new wb0(hg0Var, 9));
                    hg0Var.h.f9903f = hg0Var.f27031n;
                }
                hg0Var.h.show();
                return;
        }
    }
}
