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
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.xr;
import org.telegram.ui.n60;
import org.telegram.ui.sn;
public final class v0 implements View.OnClickListener {
    public final int f2283a;
    public final Object f2284b;
    public final Object f2285c;
    public final Object d;

    public v0(Object obj, Object obj2, Object obj3, int i10) {
        this.f2283a = i10;
        this.f2284b = obj;
        this.f2285c = obj2;
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
        boolean J1;
        nc0 nc0Var;
        CharSequence charSequence;
        switch (this.f2283a) {
            case 0:
                Context context = (Context) this.f2285c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                if (((b1) this.f2284b).m0.f631a == ag.c.f635a) {
                    new dd(context, d6Var).show();
                    return;
                }
                return;
            case 1:
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f2285c;
                final ei.d dVar = (ei.d) this.d;
                f3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((v8) this.f2284b).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                                if (booleanValue) {
                                    f3Var2.dismiss();
                                    return;
                                }
                                final ei.d dVar2 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                            default:
                                                f3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var3 = f3Var;
                                if (booleanValue2) {
                                    f3Var3.dismiss();
                                    return;
                                }
                                final ei.d dVar3 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                f3Var3.setCanDismissWithSwipe(false);
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
                final org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f2285c;
                final ei.d dVar2 = (ei.d) this.d;
                f3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((n9) this.f2284b).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var22 = f3Var2;
                                if (booleanValue) {
                                    f3Var22.dismiss();
                                    return;
                                }
                                final ei.d dVar22 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                            default:
                                                f3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var3 = f3Var2;
                                if (booleanValue2) {
                                    f3Var3.dismiss();
                                    return;
                                }
                                final ei.d dVar3 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                f3Var3.setCanDismissWithSwipe(false);
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
                ((ci.f2) this.f2284b).run(Long.valueOf(((long[]) this.f2285c)[0]));
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                return;
            case 4:
                ci.p4 p4Var = ((ci.g4) this.f2284b).f5357l;
                p4Var.F0((ei.p9) this.f2285c, (TL_stories.StoryItem) this.d);
                ci.g4 g4Var = p4Var.f5704t1;
                if (g4Var != null) {
                    g4Var.a();
                    return;
                }
                return;
            case 5:
                ci.g4 g4Var2 = (ci.g4) this.f2284b;
                ci.z9 z9Var = (ci.z9) this.d;
                ((org.telegram.ui.ActionBar.e1) this.f2285c).performHapticFeedback(3);
                org.telegram.ui.Components.xc X = org.telegram.ui.Components.xc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new pa(16, g4Var2, z9Var))).j();
                    return;
                }
                return;
            case 6:
                ci.c5 c5Var = (ci.c5) this.f2284b;
                z4 z4Var = new z4(c5Var, 2);
                ci.t5 t5Var = c5Var.f5219b;
                new aw(z4Var, t5Var.getContext(), t5Var.f5953s, (ArrayList) this.f2285c).show();
                ((i80) this.d).u();
                return;
            case 7:
                ei.lb lbVar = (ei.lb) this.f2284b;
                FrameLayout frameLayout = (FrameLayout) this.f2285c;
                ci.b bVar = (ci.b) this.d;
                i80 i80Var = lbVar.V0;
                if (i80Var == null || !i80Var.D()) {
                    ei.o oVar2 = new ei.o(lbVar, 0);
                    boolean isPremium = UserConfig.getInstance(lbVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new ei.o(lbVar, 1);
                    }
                    i80 F = i80.F(frameLayout, bVar, lbVar.T0);
                    lbVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    lbVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ei.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            i80 i80Var2 = lbVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.h6.E8;
                            i80Var2.b(0, null, str, i12, i12, new ah.g(oVar2, i11, 5));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                gVar = new ah.g(oVar, i11, 6);
                            } else {
                                gVar = null;
                            }
                            i80Var2.M(gVar);
                            if (lbVar.X0 == i10) {
                                lbVar.V0.L();
                            }
                            i10++;
                        } else {
                            i80 i80Var3 = lbVar.V0;
                            i80Var3.f27134s = 0;
                            i80Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 8:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f2285c;
                ei.m3 m3Var = (ei.m3) this.d;
                ei.q3 q3Var = ((ei.j3) this.f2284b).f9244c;
                ArrayList arrayList = q3Var.f9633h0;
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
                ei.xa xaVar = (ei.xa) this.f2284b;
                Context context2 = (Context) this.f2285c;
                qg.u0 u0Var = (qg.u0) this.d;
                if (xaVar.B1) {
                    qg.x xVar = new qg.x(context2, xaVar.G1);
                    xaVar.T1 = xVar;
                    xVar.n(xaVar.A1.f44645a, 2);
                    xVar.f44697n = new ei.h5(xaVar, u0Var);
                    xVar.h = new b8(2, xaVar, u0Var);
                    xVar.show();
                    return;
                }
                Runnable runnable2 = xaVar.K1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 10:
                ig.e eVar = (ig.e) this.f2284b;
                i80 F2 = i80.F(((sn) this.f2285c).getLayoutContainer(), (org.telegram.ui.ActionBar.d6) this.d, eVar.f12871n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new ig.d(eVar, 1), true);
                F2.E();
                if (eVar.f12875x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new ig.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f27134s = 0;
                F2.Z();
                return;
            case 11:
                ig.k0.T((ig.k0) this.f2284b, (TL_account.TL_connectedBot) this.f2285c, (org.telegram.ui.Components.e2) this.d);
                return;
            case 12:
                ji.a aVar = (ji.a) this.f2284b;
                Utilities.Callback callback = (Utilities.Callback) this.f2285c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z13 = aVar.Y;
                if (chat != null && !ChatObject.canAddChatToCommunity(chat)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.Q(callback, z13, z10);
                return;
            case 13:
                ((m.s3) this.f2284b).a();
                ((ki.c6) this.f2285c).D((ki.n0) this.d);
                return;
            case 14:
                org.telegram.ui.Components.q.Q((org.telegram.ui.Components.q) this.f2284b, (TL_aicompose.AiComposeTone) this.f2285c, (org.telegram.ui.ActionBar.d6) this.d);
                return;
            case 15:
                ((boolean[]) this.f2284b)[0] = false;
                ((org.telegram.ui.Components.e5) this.f2285c).C(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f20609a.dismissRunnable;
                runnable.run();
                return;
            case 16:
                Runnable runnable3 = (Runnable) this.f2285c;
                org.telegram.ui.Components.c5 c5Var2 = (org.telegram.ui.Components.c5) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f2284b)[0];
                if (b2Var != null) {
                    b2Var.setOnDismissListener(null);
                }
                runnable3.run();
                c5Var2.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 17:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f2284b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f2285c).run();
                ((AlertDialog$Builder) this.d).f20601a.L0.run();
                return;
            case 18:
                ((org.telegram.ui.Components.j8) this.f2284b).f27440n.C0((org.telegram.ui.Cells.x) this.f2285c, (MessageObject) this.d);
                return;
            case 19:
                ti tiVar = (ti) this.f2284b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f2285c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f30574f0;
                int i14 = tiVar.M1;
                ei eiVar = tiVar.L0;
                mf mfVar2 = tiVar.f30580h0;
                if (mfVar2 != null) {
                    j10 = mfVar2.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                tiVar.Q0 = j11;
                eiVar.setEffect(j11);
                tiVar.forceKeyboardOnDismiss();
                if (tiVar.K - tiVar.L < 0) {
                    AndroidUtilities.shakeView(tiVar.f30613s);
                    AndroidUtilities.shakeView(tiVar.v);
                    try {
                        eiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > tiVar.L) {
                        tiVar.S1(n2Var);
                    }
                    mf mfVar3 = tiVar.f30580h0;
                    if (mfVar3 != null) {
                        mfVar3.h(false);
                        tiVar.f30580h0 = null;
                        return;
                    }
                    return;
                }
                if (tiVar.K1 == null && (n2Var2 instanceof sn)) {
                    sn snVar = (sn) n2Var2;
                    if (snVar.c()) {
                        org.telegram.ui.Components.f5.L(tiVar.getContext(), snVar.a(), new ci.d1(tiVar, j11, 4), d6Var2);
                        z11 = false;
                        tiVar.K1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                li liVar = tiVar.B0;
                if (liVar != tiVar.f30586j0 && liVar != tiVar.f30606q0) {
                    if (!liVar.K(0, true, 0, tiVar.u1(), j11)) {
                        tiVar.D2 = true;
                        tiVar.dismiss();
                    }
                    J1 = false;
                    z12 = true;
                    mfVar = null;
                } else {
                    z12 = true;
                    mfVar = null;
                    J1 = tiVar.J1(0, true, 0, tiVar.u1(), j11);
                }
                mf mfVar4 = tiVar.f30580h0;
                if (mfVar4 != null) {
                    mfVar4.h(J1 ^ z12);
                    tiVar.f30580h0 = mfVar;
                }
                tiVar.K1(z11, z11);
                return;
            case 20:
                ti tiVar2 = (ti) this.f2284b;
                MessageObject messageObject = (MessageObject) this.f2285c;
                tiVar2.K1(!tiVar2.f30564c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = tiVar2.f30564c0;
                message.invert_media = z14;
                ((nc0) this.d).a(!z14, true);
                tiVar2.f30580h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar2.f30586j0;
                if (chatAttachAlertPhotoLayout != null && (nc0Var = chatAttachAlertPhotoLayout.f24085d1) != null) {
                    nc0Var.a(!tiVar2.f30564c0, true);
                }
                tiVar2.f30580h0.n(!tiVar2.f30564c0);
                return;
            case 21:
                ei.d dVar3 = (ei.d) this.d;
                ((Utilities.Callback) this.f2285c).run(new pf.c(new hq(dVar3, 4), new org.telegram.ui.Components.ee(25, (xr) this.f2284b, dVar3)));
                return;
            case 22:
                Context context3 = (Context) this.f2285c;
                ((vr) this.f2284b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.b9) this.d).f22055a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 23:
                iu iuVar = (iu) this.f2284b;
                t tVar = (t) this.f2285c;
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
                qu quVar = (qu) this.f2284b;
                jw0 jw0Var = (jw0) this.f2285c;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.d;
                lu luVar = quVar.f29742a;
                ig.k kVar = quVar.f29743b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.o1 o1Var = quVar.K;
                    if (o1Var == null || !o1Var.f21632f) {
                        boolean z15 = true;
                        if (quVar.f29746n) {
                            luVar.hideActionMode();
                            i80 i80Var4 = new i80(jw0Var, d6Var3, kVar, false, false, true);
                            i80Var4.X = AndroidUtilities.dp(280.0f);
                            luVar.extendActionMode(null, new jb0(i80Var4, new org.telegram.ui.Components.z2(luVar, 4), luVar.getOnPremiumMenuLockClickListener()));
                            i80Var4.U = true;
                            i80Var4.Z();
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
                            if (quVar.f29750x) {
                                quVar.k(true);
                                quVar.f29750x = false;
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
                w20 w20Var = (w20) this.f2284b;
                w20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f2285c);
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f20601a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new tv(w20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.n2) this.d).showDialog(alertDialog$Builder.f20601a);
                return;
            case 26:
                q90 q90Var = (q90) this.f2284b;
                org.telegram.ui.ActionBar.f3 f3Var3 = (org.telegram.ui.ActionBar.f3) this.f2285c;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.d;
                try {
                    if (q90Var.f29597b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", q90Var.f29597b));
                        if (f3Var3 != null && f3Var3.getContainer() != null) {
                            new org.telegram.ui.Components.xc(f3Var3.getContainer(), null).k(false).j();
                        } else {
                            org.telegram.ui.Components.xc.j(n2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 27:
                ic0 ic0Var = (ic0) this.f2284b;
                nc0 nc0Var2 = (nc0) this.f2285c;
                nc0 nc0Var3 = (nc0) this.d;
                oc0 oc0Var = ic0Var.f27185c0;
                MessagePreviewParams messagePreviewParams = oc0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        oc0Var.f28929x = true;
                    }
                } else {
                    if (oc0Var.f28929x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    oc0Var.f28929x = false;
                }
                nc0Var2.a(z17, true);
                nc0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                ic0Var.i();
                ic0Var.l(true);
                return;
            case 28:
                te0.o((te0) this.f2284b, (TLRPC.ChatFull) this.f2285c, (n60) this.d);
                return;
            default:
                dg0 dg0Var = (dg0) this.f2284b;
                Context context4 = (Context) this.f2285c;
                org.telegram.ui.ActionBar.d6 d6Var4 = (org.telegram.ui.ActionBar.d6) this.d;
                if (dg0Var.h == null) {
                    ei.u3 u3Var = new ei.u3(context4, d6Var4, LocaleController.getString(R.string.VideoChooseCover), dg0Var.f25586f);
                    dg0Var.h = u3Var;
                    u3Var.setOnDismissListener(new rc0(dg0Var, 8));
                    dg0Var.h.f9888f = dg0Var.f25587n;
                }
                dg0Var.h.show();
                return;
        }
    }
}
