package bi;

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
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.so;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.xr;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.zr;
import org.telegram.ui.r60;
import org.telegram.ui.un;
public final class w0 implements View.OnClickListener {
    public final int f5587a;
    public final Object f5588b;
    public final Object f5589c;
    public final Object d;

    public w0(Object obj, Object obj2, Object obj3, int i10) {
        this.f5587a = i10;
        this.f5588b = obj;
        this.f5589c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        fi.o oVar;
        String formatPluralString;
        ag.r0 r0Var;
        boolean z10;
        Runnable runnable;
        long j10;
        boolean z11;
        boolean z12;
        mf mfVar;
        boolean M1;
        mc0 mc0Var;
        CharSequence charSequence;
        switch (this.f5587a) {
            case 0:
                Context context = (Context) this.f5589c;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.d;
                if (((b1) this.f5588b).f4318n0.f3978a == bg.b.f3980a) {
                    new uc(context, u6Var).show();
                    return;
                }
                return;
            case 1:
                final org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f5589c;
                final fi.d dVar = (fi.d) this.d;
                k3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((r8) this.f5588b).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.k3 k3Var2 = k3Var;
                                if (booleanValue) {
                                    k3Var2.dismiss();
                                    return;
                                }
                                final fi.d dVar2 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                            default:
                                                k3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.k3 k3Var3 = k3Var;
                                if (booleanValue2) {
                                    k3Var3.dismiss();
                                    return;
                                }
                                final fi.d dVar3 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                k3Var3.setCanDismissWithSwipe(false);
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
                final org.telegram.ui.ActionBar.k3 k3Var2 = (org.telegram.ui.ActionBar.k3) this.f5589c;
                final fi.d dVar2 = (fi.d) this.d;
                k3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((j9) this.f5588b).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.k3 k3Var22 = k3Var2;
                                if (booleanValue) {
                                    k3Var22.dismiss();
                                    return;
                                }
                                final fi.d dVar22 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                            default:
                                                k3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.k3 k3Var3 = k3Var2;
                                if (booleanValue2) {
                                    k3Var3.dismiss();
                                    return;
                                }
                                final fi.d dVar3 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                k3Var3.setCanDismissWithSwipe(false);
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
                ((di.f2) this.f5588b).run(Long.valueOf(((long[]) this.f5589c)[0]));
                ((org.telegram.ui.ActionBar.k3) this.d).dismiss();
                return;
            case 4:
                di.q4 q4Var = ((di.h4) this.f5588b).f8626l;
                q4Var.D0((fi.l9) this.f5589c, (TL_stories.StoryItem) this.d);
                di.h4 h4Var = q4Var.f8988i1;
                if (h4Var != null) {
                    h4Var.a();
                    return;
                }
                return;
            case 5:
                di.h4 h4Var2 = (di.h4) this.f5588b;
                di.y9 y9Var = (di.y9) this.d;
                ((org.telegram.ui.ActionBar.g1) this.f5589c).performHapticFeedback(3);
                org.telegram.ui.Components.wc Y = org.telegram.ui.Components.wc.Y();
                if (Y != null) {
                    Y.R(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new di.b4(0, h4Var2, y9Var))).j();
                    return;
                }
                return;
            case 6:
                di.c5 c5Var = (di.c5) this.f5588b;
                v4 v4Var = new v4(c5Var, 2);
                di.t5 t5Var = c5Var.f8456b;
                new aw(v4Var, t5Var.getContext(), t5Var.f9197s, (ArrayList) this.f5589c).show();
                ((k80) this.d).u();
                return;
            case 7:
                fi.ib ibVar = (fi.ib) this.f5588b;
                FrameLayout frameLayout = (FrameLayout) this.f5589c;
                di.b bVar = (di.b) this.d;
                k80 k80Var = ibVar.V0;
                if (k80Var == null || !k80Var.D()) {
                    fi.o oVar2 = new fi.o(ibVar, 0);
                    boolean isPremium = UserConfig.getInstance(ibVar.U).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new fi.o(ibVar, 1);
                    }
                    k80 F = k80.F(frameLayout, bVar, ibVar.T0);
                    ibVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    ibVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = fi.r.Q1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            k80 k80Var2 = ibVar.V0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = org.telegram.ui.ActionBar.y6.E8;
                            k80Var2.b(0, null, str, i12, i12, new ag.r0(oVar2, i11, 6));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                r0Var = new ag.r0(oVar, i11, 7);
                            } else {
                                r0Var = null;
                            }
                            k80Var2.M(r0Var);
                            if (ibVar.X0 == i10) {
                                ibVar.V0.L();
                            }
                            i10++;
                        } else {
                            k80 k80Var3 = ibVar.V0;
                            k80Var3.f29866s = 0;
                            k80Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 8:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f5589c;
                fi.k3 k3Var3 = (fi.k3) this.d;
                fi.o3 o3Var = ((fi.h3) this.f5588b).f10948c;
                ArrayList arrayList = o3Var.f11347h0;
                if (arrayList.contains(photoEntry)) {
                    arrayList.remove(photoEntry);
                } else if (arrayList.size() + 1 > o3Var.R) {
                    int i13 = -o3Var.N;
                    o3Var.N = i13;
                    AndroidUtilities.shakeViewSpring(k3Var3, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                } else {
                    arrayList.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(o3Var.d);
                o3Var.j();
                return;
            case 9:
                fi.ta taVar = (fi.ta) this.f5588b;
                Context context2 = (Context) this.f5589c;
                rg.s0 s0Var = (rg.s0) this.d;
                if (taVar.f10809q1) {
                    rg.y yVar = new rg.y(context2, taVar.f10819v1);
                    taVar.I1 = yVar;
                    yVar.m(taVar.f10807p1.f47522a, 2);
                    yVar.f47594n = new fi.g5(taVar, s0Var);
                    yVar.h = new y7(2, taVar, s0Var);
                    yVar.show();
                    return;
                }
                Runnable runnable2 = taVar.f10827z1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 10:
                jg.e eVar = (jg.e) this.f5588b;
                k80 F2 = k80.F(((un) this.f5589c).getLayoutContainer(), (org.telegram.ui.ActionBar.u6) this.d, eVar.f15683n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new jg.d(eVar, 1), true);
                F2.E();
                if (eVar.f15687x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new jg.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.f29866s = 0;
                F2.Z();
                return;
            case 11:
                jg.k0.S((jg.k0) this.f5588b, (TL_account.TL_connectedBot) this.f5589c, (org.telegram.ui.Components.h2) this.d);
                return;
            case 12:
                ki.a aVar = (ki.a) this.f5588b;
                Utilities.Callback callback = (Utilities.Callback) this.f5589c;
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
                ((m.r3) this.f5588b).a();
                ((li.d6) this.f5589c).C((li.m0) this.d);
                return;
            case 14:
                org.telegram.ui.Components.q.P((org.telegram.ui.Components.q) this.f5588b, (TL_aicompose.AiComposeTone) this.f5589c, (org.telegram.ui.ActionBar.u6) this.d);
                return;
            case 15:
                ((boolean[]) this.f5588b)[0] = false;
                ((org.telegram.ui.Components.e5) this.f5589c).G(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.e3) this.d).f22599a.dismissRunnable;
                runnable.run();
                return;
            case 16:
                Runnable runnable3 = (Runnable) this.f5589c;
                org.telegram.ui.Components.c5 c5Var2 = (org.telegram.ui.Components.c5) this.d;
                org.telegram.ui.ActionBar.e2 e2Var = ((org.telegram.ui.ActionBar.e2[]) this.f5588b)[0];
                if (e2Var != null) {
                    e2Var.setOnDismissListener(null);
                }
                runnable3.run();
                c5Var2.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 17:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f5588b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f5589c).run();
                ((AlertDialog$Builder) this.d).f22366a.N0.run();
                return;
            case 18:
                ((org.telegram.ui.Components.l8) this.f5588b).f30100n.I0((org.telegram.ui.Cells.w) this.f5589c, (MessageObject) this.d);
                return;
            case 19:
                ti tiVar = (ti) this.f5588b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f5589c;
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) this.d;
                org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f33018f0;
                int i14 = tiVar.M1;
                bi biVar = tiVar.L0;
                mf mfVar2 = tiVar.f33024h0;
                if (mfVar2 != null) {
                    j10 = mfVar2.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                tiVar.Q0 = j11;
                biVar.setEffect(j11);
                tiVar.forceKeyboardOnDismiss();
                if (tiVar.K - tiVar.L < 0) {
                    AndroidUtilities.shakeView(tiVar.f33057s);
                    AndroidUtilities.shakeView(tiVar.v);
                    try {
                        biVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > tiVar.L) {
                        tiVar.V1(r2Var);
                    }
                    mf mfVar3 = tiVar.f33024h0;
                    if (mfVar3 != null) {
                        mfVar3.g(false);
                        tiVar.f33024h0 = null;
                        return;
                    }
                    return;
                }
                if (tiVar.K1 == null && (r2Var2 instanceof un)) {
                    un unVar = (un) r2Var2;
                    if (unVar.c()) {
                        org.telegram.ui.Components.g5.L(tiVar.getContext(), unVar.a(), new di.d1(tiVar, j11, 4), u6Var2);
                        z11 = false;
                        tiVar.N1(z11, z11);
                        return;
                    }
                }
                z11 = false;
                li liVar = tiVar.B0;
                if (liVar != tiVar.f33030j0 && liVar != tiVar.f33050q0) {
                    if (!liVar.K(0, true, 0, tiVar.w1(), j11)) {
                        tiVar.G2 = true;
                        tiVar.dismiss();
                    }
                    M1 = false;
                    z12 = true;
                    mfVar = null;
                } else {
                    z12 = true;
                    mfVar = null;
                    M1 = tiVar.M1(0, true, 0, tiVar.w1(), j11);
                }
                mf mfVar4 = tiVar.f33024h0;
                if (mfVar4 != null) {
                    mfVar4.g(M1 ^ z12);
                    tiVar.f33024h0 = mfVar;
                }
                tiVar.N1(z11, z11);
                return;
            case 20:
                ti tiVar2 = (ti) this.f5588b;
                MessageObject messageObject = (MessageObject) this.f5589c;
                tiVar2.N1(!tiVar2.f33008c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z14 = tiVar2.f33008c0;
                message.invert_media = z14;
                ((mc0) this.d).a(!z14, true);
                tiVar2.f33024h0.e(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar2.f33030j0;
                if (chatAttachAlertPhotoLayout != null && (mc0Var = chatAttachAlertPhotoLayout.f26025d1) != null) {
                    mc0Var.a(!tiVar2.f33008c0, true);
                }
                tiVar2.f33024h0.m(!tiVar2.f33008c0);
                return;
            case 21:
                fi.d dVar3 = (fi.d) this.d;
                ((Utilities.Callback) this.f5589c).run(new qf.c(new bq(dVar3, 5), new so(5, (zr) this.f5588b, dVar3)));
                return;
            case 22:
                Context context3 = (Context) this.f5589c;
                ((xr) this.f5588b).getClass();
                AndroidUtilities.addToClipboard(((org.telegram.ui.Cells.g9) this.d).f24170a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 23:
                ju juVar = (ju) this.f5588b;
                t tVar = (t) this.f5589c;
                fi.r1 r1Var = (fi.r1) this.d;
                try {
                    charSequence = ((ClipboardManager) juVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(juVar.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    tVar.setText(charSequence);
                    tVar.setSelection(0, tVar.getText().length());
                }
                r1Var.run();
                return;
            case 24:
                ru ruVar = (ru) this.f5588b;
                vw0 vw0Var = (vw0) this.f5589c;
                org.telegram.ui.ActionBar.u6 u6Var3 = (org.telegram.ui.ActionBar.u6) this.d;
                mu muVar = ruVar.f32323a;
                jg.l lVar = ruVar.f32324b;
                if (lVar.isEnabled() && lVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.q1 q1Var = ruVar.K;
                    if (q1Var == null || !q1Var.f22965f) {
                        boolean z15 = true;
                        if (ruVar.f32327n) {
                            muVar.hideActionMode();
                            k80 k80Var4 = new k80(vw0Var, u6Var3, lVar, false, false, true);
                            k80Var4.X = AndroidUtilities.dp(280.0f);
                            muVar.extendActionMode(null, new hb0(k80Var4, new org.telegram.ui.Components.b3(muVar, 4), muVar.getOnPremiumMenuLockClickListener()));
                            k80Var4.U = true;
                            k80Var4.Z();
                            return;
                        } else if (!ruVar.e) {
                            ruVar.x(1);
                            boolean isFocused = muVar.isFocused();
                            nu nuVar = ruVar.d;
                            if (muVar.length() <= 0) {
                                z15 = false;
                            }
                            nuVar.C(z15, false);
                            muVar.requestFocus();
                            if (!isFocused) {
                                muVar.setSelection(muVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (ruVar.f32331x) {
                                ruVar.k(true);
                                ruVar.f32331x = false;
                                ruVar.p();
                            }
                            ruVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 25:
                y20 y20Var = (y20) this.f5588b;
                y20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f5589c);
                alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f22366a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new tv(y20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.r2) this.d).showDialog(alertDialog$Builder.f22366a);
                return;
            case 26:
                r90 r90Var = (r90) this.f5588b;
                org.telegram.ui.ActionBar.k3 k3Var4 = (org.telegram.ui.ActionBar.k3) this.f5589c;
                org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) this.d;
                try {
                    if (r90Var.f32169b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", r90Var.f32169b));
                        if (k3Var4 != null && k3Var4.getContainer() != null) {
                            new org.telegram.ui.Components.wc(k3Var4.getContainer(), null).k(false).j();
                        } else {
                            org.telegram.ui.Components.wc.j(r2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 27:
                hc0 hc0Var = (hc0) this.f5588b;
                mc0 mc0Var2 = (mc0) this.f5589c;
                mc0 mc0Var3 = (mc0) this.d;
                nc0 nc0Var = hc0Var.f28917c0;
                MessagePreviewParams messagePreviewParams = nc0Var.d;
                boolean z16 = messagePreviewParams.hideCaption;
                boolean z17 = !z16;
                messagePreviewParams.hideCaption = z17;
                if (!z16) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        nc0Var.f30962x = true;
                    }
                } else {
                    if (nc0Var.f30962x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    nc0Var.f30962x = false;
                }
                mc0Var2.a(z17, true);
                mc0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                hc0Var.i();
                hc0Var.l(true);
                return;
            case 28:
                te0.n((te0) this.f5588b, (TLRPC.ChatFull) this.f5589c, (r60) this.d);
                return;
            default:
                fg0 fg0Var = (fg0) this.f5588b;
                Context context4 = (Context) this.f5589c;
                org.telegram.ui.ActionBar.u6 u6Var4 = (org.telegram.ui.ActionBar.u6) this.d;
                if (fg0Var.h == null) {
                    fi.s3 s3Var = new fi.s3(context4, u6Var4, LocaleController.getString(R.string.VideoChooseCover), fg0Var.f28184f);
                    fg0Var.h = s3Var;
                    s3Var.setOnDismissListener(new wa0(fg0Var, 10));
                    fg0Var.h.f11583f = fg0Var.f28185n;
                }
                fg0Var.h.show();
                return;
        }
    }
}
