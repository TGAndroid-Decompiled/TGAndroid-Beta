package dg;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import lh.aa;
import lh.d7;
import lh.k6;
import nh.d4;
import nh.d5;
import nh.i9;
import nh.m4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.w4;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.z4;
import org.telegram.ui.a70;
import org.telegram.ui.mt0;
import org.telegram.ui.zn;
import ph.c8;
public final class p implements View.OnClickListener {
    public final int f4721a;
    public final Object f4722b;
    public final Object f4723c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i10) {
        this.f4721a = i10;
        this.f4722b = obj;
        this.f4723c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        long j10;
        boolean G1;
        wb0 wb0Var;
        CharSequence charSequence = null;
        boolean z4 = true;
        switch (this.f4721a) {
            case 0:
                mt0 mt0Var = (mt0) this.f4722b;
                Context context = (Context) this.f4723c;
                Bitmap bitmap = (Bitmap) this.d;
                if (mt0Var.I1) {
                    cg.e0 e0Var = new cg.e0(context, mt0Var.N1);
                    e0Var.m(mt0Var.H1.f2384a, 2);
                    e0Var.f2346n = new i0(mt0Var, bitmap);
                    e0Var.h = new o(mt0Var, 1);
                    e0Var.show();
                    return;
                }
                Runnable runnable2 = mt0Var.R1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 1:
                ((kg.k) this.f4722b).a(view, (HashSet) this.f4723c, (Runnable) this.d);
                return;
            case 2:
                new kh.s((Context) this.f4723c, null, null, (GiftAuctionController.Auction) this.d).show();
                ((kh.f) this.f4722b).dismiss();
                return;
            case 3:
                kh.s.R((kh.s) this.f4722b, (boolean[]) this.f4723c, (f6) this.d);
                return;
            case 4:
                kh.f0.R((kh.f0) this.f4722b, (Context) this.f4723c, (f6) this.d);
                return;
            case 5:
                kh.f0.P((kh.f0) this.f4722b, (boolean[]) this.f4723c, (f6) this.d);
                return;
            case 6:
                kh.m3 m3Var = (kh.m3) this.f4722b;
                ((p70) this.f4723c).u();
                or0 or0Var = m3Var.f10817a;
                kh.c3 c3Var = new kh.c3(m3Var, (TL_stars.SavedStarGift) this.d, 0);
                HashMap hashMap = kh.w3.Q;
                or0Var.h(null, c3Var);
                return;
            case 7:
                Context context2 = (Context) this.f4723c;
                f6 f6Var = (f6) this.d;
                if (((lh.n0) this.f4722b).f12804j0.f12054a == lf.b.f12056a) {
                    new aa(context2, f6Var).show();
                    return;
                }
                return;
            case 8:
                final org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f4723c;
                final ph.d dVar = (ph.d) this.d;
                g3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((k6) this.f4722b).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
                                if (booleanValue) {
                                    g3Var2.dismiss();
                                    return;
                                }
                                final ph.d dVar2 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                g3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                            default:
                                                g3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var3 = g3Var;
                                if (booleanValue2) {
                                    g3Var3.dismiss();
                                    return;
                                }
                                final ph.d dVar3 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                g3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                g3Var3.setCanDismissWithSwipe(false);
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
            case 9:
                final org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) this.f4723c;
                final ph.d dVar2 = (ph.d) this.d;
                g3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((d7) this.f4722b).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var22 = g3Var2;
                                if (booleanValue) {
                                    g3Var22.dismiss();
                                    return;
                                }
                                final ph.d dVar22 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                g3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                            default:
                                                g3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var3 = g3Var2;
                                if (booleanValue2) {
                                    g3Var3.dismiss();
                                    return;
                                }
                                final ph.d dVar3 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                g3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                g3Var3.setCanDismissWithSwipe(false);
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
            case 10:
                ((cg.h0) this.f4722b).run(Long.valueOf(((long[]) this.f4723c)[0]));
                ((org.telegram.ui.ActionBar.g3) this.d).dismiss();
                return;
            case 11:
                d4 d4Var = ((nh.w3) this.f4722b).f16007l;
                d4Var.F0((c8) this.f4723c, (TL_stories.StoryItem) this.d);
                nh.w3 w3Var = d4Var.f15208q1;
                if (w3Var != null) {
                    w3Var.a();
                    return;
                }
                return;
            case 12:
                nh.w3 w3Var2 = (nh.w3) this.f4722b;
                i9 i9Var = (i9) this.d;
                ((org.telegram.ui.ActionBar.g1) this.f4723c).performHapticFeedback(3);
                qc X = qc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new lh.n2(29, w3Var2, i9Var))).j();
                    return;
                }
                return;
            case 13:
                m4 m4Var = (m4) this.f4722b;
                eg.y1 y1Var = new eg.y1(m4Var, 5);
                d5 d5Var = m4Var.f15587b;
                new lv(y1Var, d5Var.getContext(), d5Var.f15251s, (ArrayList) this.f4723c).show();
                ((p70) this.d).u();
                return;
            case 14:
                org.telegram.ui.Components.r.P((org.telegram.ui.Components.r) this.f4722b, (TL_aicompose.AiComposeTone) this.f4723c, (f6) this.d);
                return;
            case 15:
                ((boolean[]) this.f4722b)[0] = false;
                ((y4) this.f4723c).J(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.b3) this.d).f19500a.dismissRunnable;
                runnable.run();
                return;
            case 16:
                Runnable runnable3 = (Runnable) this.f4723c;
                w4 w4Var = (w4) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = ((org.telegram.ui.ActionBar.d2[]) this.f4722b)[0];
                if (d2Var != null) {
                    d2Var.setOnDismissListener(null);
                }
                runnable3.run();
                w4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 17:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f4722b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f4723c).run();
                ((AlertDialog$Builder) this.d).f19478a.I0.run();
                return;
            case 18:
                ((b8) this.f4722b).f23578n.B0((org.telegram.ui.Cells.x) this.f4723c, (MessageObject) this.d);
                return;
            case 19:
                li liVar = (li) this.f4722b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f4723c;
                f6 f6Var2 = (f6) this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = liVar.f26685c0;
                int i10 = liVar.G1;
                vh vhVar = liVar.F0;
                cf cfVar = liVar.f26691e0;
                if (cfVar != null) {
                    j10 = cfVar.k();
                } else {
                    j10 = 0;
                }
                liVar.K0 = j10;
                vhVar.setEffect(j10);
                liVar.forceKeyboardOnDismiss();
                if (liVar.H - liVar.I < 0) {
                    AndroidUtilities.shakeView(liVar.f26734s);
                    AndroidUtilities.shakeView(liVar.v);
                    try {
                        vhVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > liVar.I) {
                        liVar.O1(p2Var);
                    }
                    cf cfVar2 = liVar.f26691e0;
                    if (cfVar2 != null) {
                        cfVar2.h(false);
                        liVar.f26691e0 = null;
                        return;
                    }
                    return;
                }
                if (liVar.E1 == null && (p2Var2 instanceof zn)) {
                    zn znVar = (zn) p2Var2;
                    if (znVar.c()) {
                        z4.M(liVar.getContext(), znVar.a(), new f3.e(liVar, j10, 3), f6Var2);
                        liVar.H1(false, false);
                        return;
                    }
                }
                di diVar = liVar.f26744v0;
                if (diVar != liVar.f26698g0 && diVar != liVar.f26718n0) {
                    if (!diVar.H(0, true, 0, liVar.s1(), j10)) {
                        liVar.f26754x2 = true;
                        liVar.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = liVar.G1(0, true, 0, liVar.s1(), j10);
                }
                cf cfVar3 = liVar.f26691e0;
                if (cfVar3 != null) {
                    cfVar3.h(!G1);
                    liVar.f26691e0 = null;
                }
                liVar.H1(false, false);
                return;
            case 20:
                li liVar2 = (li) this.f4722b;
                MessageObject messageObject = (MessageObject) this.f4723c;
                liVar2.H1(!liVar2.Z, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z10 = liVar2.Z;
                message.invert_media = z10;
                ((wb0) this.d).a(!z10, true);
                liVar2.f26691e0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar2.f26698g0;
                if (chatAttachAlertPhotoLayout != null && (wb0Var = chatAttachAlertPhotoLayout.f22873a1) != null) {
                    wb0Var.a(!liVar2.Z, true);
                }
                liVar2.f26691e0.n(!liVar2.Z);
                return;
            case 21:
                ph.d dVar3 = (ph.d) this.d;
                ((Utilities.Callback) this.f4723c).run(new ze.c(new up(dVar3, 4), new em(5, (ir) this.f4722b, dVar3)));
                return;
            case 22:
                Context context3 = (Context) this.f4723c;
                ((gr) this.f4722b).getClass();
                AndroidUtilities.addToClipboard(((x8) this.d).f22552a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 23:
                ut utVar = (ut) this.f4722b;
                lh.n nVar = (lh.n) this.f4723c;
                gg.j jVar = (gg.j) this.d;
                try {
                    charSequence = ((ClipboardManager) utVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(utVar.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (charSequence != null) {
                    nVar.setText(charSequence);
                    nVar.setSelection(0, nVar.getText().length());
                }
                jVar.run();
                return;
            case 24:
                cu cuVar = (cu) this.f4722b;
                qv0 qv0Var = (qv0) this.f4723c;
                f6 f6Var3 = (f6) this.d;
                xt xtVar = cuVar.f24030a;
                ge geVar = cuVar.f24031b;
                if (geVar.isEnabled() && geVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.r1 r1Var = cuVar.H;
                    if (r1Var == null || !r1Var.f20522f) {
                        if (cuVar.f24034n) {
                            xtVar.hideActionMode();
                            p70 p70Var = new p70(qv0Var, f6Var3, geVar, false, false, true);
                            p70Var.X = AndroidUtilities.dp(280.0f);
                            xtVar.extendActionMode(null, new ra0(p70Var, new org.telegram.ui.Components.v2(xtVar, 4), xtVar.getOnPremiumMenuLockClickListener()));
                            p70Var.U = true;
                            p70Var.Z();
                            return;
                        } else if (!cuVar.e) {
                            cuVar.x(1);
                            boolean isFocused = xtVar.isFocused();
                            yt ytVar = cuVar.d;
                            if (xtVar.length() <= 0) {
                                z4 = false;
                            }
                            ytVar.E(z4, false);
                            xtVar.requestFocus();
                            if (!isFocused) {
                                xtVar.setSelection(xtVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (cuVar.f24038x) {
                                cuVar.k(true);
                                cuVar.f24038x = false;
                                cuVar.p();
                            }
                            cuVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 25:
                p20 p20Var = (p20) this.f4722b;
                p20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f4723c);
                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new ev(p20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.p2) this.d).showDialog(alertDialog$Builder.f19478a);
                return;
            case 26:
                x80 x80Var = (x80) this.f4722b;
                org.telegram.ui.ActionBar.g3 g3Var3 = (org.telegram.ui.ActionBar.g3) this.f4723c;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) this.d;
                try {
                    if (x80Var.f30534b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", x80Var.f30534b));
                        if (g3Var3 != null && g3Var3.getContainer() != null) {
                            new qc(g3Var3.getContainer(), null).k(false).j();
                        } else {
                            qc.j(p2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 27:
                rb0 rb0Var = (rb0) this.f4722b;
                wb0 wb0Var2 = (wb0) this.f4723c;
                wb0 wb0Var3 = (wb0) this.d;
                xb0 xb0Var = rb0Var.W;
                MessagePreviewParams messagePreviewParams = xb0Var.d;
                boolean z11 = messagePreviewParams.hideCaption;
                boolean z12 = !z11;
                messagePreviewParams.hideCaption = z12;
                if (!z11) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        xb0Var.f30581x = true;
                    }
                } else {
                    if (xb0Var.f30581x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    xb0Var.f30581x = false;
                }
                wb0Var2.a(z12, true);
                wb0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                rb0Var.h();
                rb0Var.k(true);
                return;
            case 28:
                ee0.n((ee0) this.f4722b, (TLRPC.ChatFull) this.f4723c, (a70) this.d);
                return;
            default:
                pf0 pf0Var = (pf0) this.f4722b;
                Context context4 = (Context) this.f4723c;
                f6 f6Var4 = (f6) this.d;
                if (pf0Var.h == null) {
                    ph.d3 d3Var = new ph.d3(context4, f6Var4, LocaleController.getString(R.string.VideoChooseCover), pf0Var.f27847f);
                    pf0Var.h = d3Var;
                    d3Var.setOnDismissListener(new dc0(pf0Var, 8));
                    pf0Var.h.f41489f = pf0Var.f27848n;
                }
                pf0Var.h.show();
                return;
        }
    }
}
