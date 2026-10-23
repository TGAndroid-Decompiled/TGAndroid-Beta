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
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.xr;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.zp;
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
        mf mfVar;
        boolean N1;
        qc0 qc0Var;
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
                org.telegram.ui.Components.xc X = org.telegram.ui.Components.xc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new qa(16, g4Var2, z9Var))).j();
                    return;
                }
                return;
            case 6:
                ci.c5 c5Var = (ci.c5) this.f2285b;
                a5 a5Var = new a5(c5Var, 2);
                ci.t5 t5Var = c5Var.f5221b;
                new aw(a5Var, t5Var.getContext(), t5Var.f5959s, (ArrayList) this.f2286c).show();
                ((j80) this.d).u();
                return;
            case 7:
                ei.lb lbVar = (ei.lb) this.f2285b;
                FrameLayout frameLayout = (FrameLayout) this.f2286c;
                ci.b bVar = (ci.b) this.d;
                j80 j80Var = lbVar.V0;
                if (j80Var == null || !j80Var.D()) {
                    ei.o oVar2 = new ei.o(lbVar, 0);
                    boolean isPremium = UserConfig.getInstance(lbVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new ei.o(lbVar, 1);
                    }
                    j80 F = j80.F(frameLayout, bVar, lbVar.T0);
                    lbVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    lbVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ei.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            j80 j80Var2 = lbVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.k6.E8;
                            j80Var2.b(0, null, str, i12, i12, new ah.g(oVar2, i11, 5));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                gVar = new ah.g(oVar, i11, 6);
                            } else {
                                gVar = null;
                            }
                            j80Var2.M(gVar);
                            if (lbVar.X0 == i10) {
                                lbVar.V0.L();
                            }
                            i10++;
                        } else {
                            j80 j80Var3 = lbVar.V0;
                            j80Var3.f27580s = 0;
                            j80Var3.Z();
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
                    yVar.m(xaVar.A1.f45066a, 2);
                    yVar.f45130n = new ei.h5(xaVar, u0Var);
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
                j80 F2 = j80.F(((sn) this.f2286c).getLayoutContainer(), (org.telegram.ui.ActionBar.g6) this.d, eVar.f12901n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new ig.d(eVar, 1), true);
                F2.E();
                if (eVar.f12905x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new ig.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f27580s = 0;
                F2.Z();
                return;
            case 11:
                ig.j0.S((ig.j0) this.f2285b, (TL_account.TL_connectedBot) this.f2286c, (org.telegram.ui.Components.d2) this.d);
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
                ((org.telegram.ui.Components.d5) this.f2286c).C(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.b3) this.d).f20728a.dismissRunnable;
                runnable.run();
                return;
            case 16:
                Runnable runnable3 = (Runnable) this.f2286c;
                org.telegram.ui.Components.b5 b5Var = (org.telegram.ui.Components.b5) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = ((org.telegram.ui.ActionBar.c2[]) this.f2285b)[0];
                if (c2Var != null) {
                    c2Var.setOnDismissListener(null);
                }
                runnable3.run();
                b5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 17:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f2285b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f2286c).run();
                ((AlertDialog$Builder) this.d).f20678a.N0.run();
                return;
            case 18:
                ((org.telegram.ui.Components.j8) this.f2285b).f27548n.I0((org.telegram.ui.Cells.w) this.f2286c, (MessageObject) this.d);
                return;
            case 19:
                ti tiVar = (ti) this.f2285b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f2286c;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = tiVar.f30730f0;
                int i14 = tiVar.M1;
                ei eiVar = tiVar.L0;
                mf mfVar2 = tiVar.f30736h0;
                if (mfVar2 != null) {
                    j10 = mfVar2.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                tiVar.Q0 = j11;
                eiVar.setEffect(j11);
                tiVar.forceKeyboardOnDismiss();
                if (tiVar.K - tiVar.L < 0) {
                    AndroidUtilities.shakeView(tiVar.f30769s);
                    AndroidUtilities.shakeView(tiVar.v);
                    try {
                        eiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > tiVar.L) {
                        tiVar.W1(o2Var);
                    }
                    mf mfVar3 = tiVar.f30736h0;
                    if (mfVar3 != null) {
                        mfVar3.g(false);
                        tiVar.f30736h0 = null;
                        return;
                    }
                    return;
                }
                if (tiVar.K1 == null && (o2Var2 instanceof sn)) {
                    sn snVar = (sn) o2Var2;
                    if (snVar.c()) {
                        org.telegram.ui.Components.f5.M(tiVar.getContext(), snVar.a(), new ci.d1(tiVar, j11, 4), g6Var2);
                        z11 = false;
                        tiVar.O1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                li liVar = tiVar.B0;
                if (liVar != tiVar.f30742j0 && liVar != tiVar.f30762q0) {
                    if (!liVar.K(0, true, 0, tiVar.x1(), j11)) {
                        tiVar.G2 = true;
                        tiVar.dismiss();
                    }
                    N1 = false;
                    z12 = true;
                    mfVar = null;
                } else {
                    z12 = true;
                    mfVar = null;
                    N1 = tiVar.N1(0, true, 0, tiVar.x1(), j11);
                }
                mf mfVar4 = tiVar.f30736h0;
                if (mfVar4 != null) {
                    mfVar4.g(N1 ^ z12);
                    tiVar.f30736h0 = mfVar;
                }
                tiVar.O1(z11, z11);
                return;
            case 20:
                ti tiVar2 = (ti) this.f2285b;
                MessageObject messageObject = (MessageObject) this.f2286c;
                tiVar2.O1(!tiVar2.f30720c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = tiVar2.f30720c0;
                message.invert_media = z14;
                ((qc0) this.d).a(!z14, true);
                tiVar2.f30736h0.e(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar2.f30742j0;
                if (chatAttachAlertPhotoLayout != null && (qc0Var = chatAttachAlertPhotoLayout.f24234d1) != null) {
                    qc0Var.a(!tiVar2.f30720c0, true);
                }
                tiVar2.f30736h0.m(!tiVar2.f30720c0);
                return;
            case 21:
                ei.d dVar3 = (ei.d) this.d;
                ((Utilities.Callback) this.f2286c).run(new pf.c(new zp(dVar3, 5), new org.telegram.ui.Components.ee(25, (xr) this.f2285b, dVar3)));
                return;
            case 22:
                Context context3 = (Context) this.f2286c;
                ((vr) this.f2285b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.c9) this.d).f22215a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 23:
                iu iuVar = (iu) this.f2285b;
                t tVar = (t) this.f2286c;
                ei.s1 s1Var = (ei.s1) this.d;
                try {
                    charSequence = ((ClipboardManager) iuVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(iuVar.getContext());
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
                qu quVar = (qu) this.f2285b;
                ow0 ow0Var = (ow0) this.f2286c;
                org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) this.d;
                lu luVar = quVar.f29989a;
                ig.k kVar = quVar.f29990b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.o1 o1Var = quVar.K;
                    if (o1Var == null || !o1Var.f21721f) {
                        boolean z15 = true;
                        if (quVar.f29993n) {
                            luVar.hideActionMode();
                            j80 j80Var4 = new j80(ow0Var, g6Var3, kVar, false, false, true);
                            j80Var4.X = AndroidUtilities.dp(280.0f);
                            luVar.extendActionMode(null, new kb0(j80Var4, new org.telegram.ui.Components.y2(luVar, 4), luVar.getOnPremiumMenuLockClickListener()));
                            j80Var4.U = true;
                            j80Var4.Z();
                            return;
                        } else if (!quVar.e) {
                            quVar.x(1);
                            boolean isFocused = luVar.isFocused();
                            mu muVar = quVar.d;
                            if (luVar.length() <= 0) {
                                z15 = false;
                            }
                            muVar.C(z15, false);
                            luVar.requestFocus();
                            if (!isFocused) {
                                luVar.setSelection(luVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (quVar.f29997x) {
                                quVar.k(true);
                                quVar.f29997x = false;
                                quVar.p();
                            }
                            quVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 25:
                w20 w20Var = (w20) this.f2285b;
                w20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f2286c);
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f20678a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new tv(w20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.o2) this.d).showDialog(alertDialog$Builder.f20678a);
                return;
            case 26:
                r90 r90Var = (r90) this.f2285b;
                org.telegram.ui.ActionBar.h3 h3Var3 = (org.telegram.ui.ActionBar.h3) this.f2286c;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.d;
                try {
                    if (r90Var.f30124b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", r90Var.f30124b));
                        if (h3Var3 != null && h3Var3.getContainer() != null) {
                            new org.telegram.ui.Components.xc(h3Var3.getContainer(), null).k(false).j();
                        } else {
                            org.telegram.ui.Components.xc.j(o2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 27:
                lc0 lc0Var = (lc0) this.f2285b;
                qc0 qc0Var2 = (qc0) this.f2286c;
                qc0 qc0Var3 = (qc0) this.d;
                rc0 rc0Var = lc0Var.f28340c0;
                MessagePreviewParams messagePreviewParams = rc0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        rc0Var.f30151x = true;
                    }
                } else {
                    if (rc0Var.f30151x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    rc0Var.f30151x = false;
                }
                qc0Var2.a(z17, true);
                qc0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                lc0Var.i();
                lc0Var.l(true);
                return;
            case 28:
                xe0.n((xe0) this.f2285b, (TLRPC.ChatFull) this.f2286c, (p60) this.d);
                return;
            default:
                ig0 ig0Var = (ig0) this.f2285b;
                Context context4 = (Context) this.f2286c;
                org.telegram.ui.ActionBar.g6 g6Var4 = (org.telegram.ui.ActionBar.g6) this.d;
                if (ig0Var.h == null) {
                    ei.u3 u3Var = new ei.u3(context4, g6Var4, LocaleController.getString(R.string.VideoChooseCover), ig0Var.f27316f);
                    ig0Var.h = u3Var;
                    u3Var.setOnDismissListener(new yb0(ig0Var, 9));
                    ig0Var.h.f9903f = ig0Var.f27317n;
                }
                ig0Var.h.show();
                return;
        }
    }
}
