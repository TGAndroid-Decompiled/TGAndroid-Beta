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
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.fv;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.w4;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.zt;
import org.telegram.ui.ft0;
import org.telegram.ui.xn;
import org.telegram.ui.y60;
import ph.d8;
public final class p implements View.OnClickListener {
    public final int f4715a;
    public final Object f4716b;
    public final Object f4717c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i10) {
        this.f4715a = i10;
        this.f4716b = obj;
        this.f4717c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        long j10;
        boolean G1;
        vb0 vb0Var;
        CharSequence charSequence = null;
        boolean z4 = true;
        switch (this.f4715a) {
            case 0:
                ft0 ft0Var = (ft0) this.f4716b;
                Context context = (Context) this.f4717c;
                Bitmap bitmap = (Bitmap) this.d;
                if (ft0Var.I1) {
                    cg.e0 e0Var = new cg.e0(context, ft0Var.N1);
                    e0Var.m(ft0Var.H1.f2401a, 2);
                    e0Var.f2363n = new i0(ft0Var, bitmap);
                    e0Var.h = new o(ft0Var, 1);
                    e0Var.show();
                    return;
                }
                Runnable runnable2 = ft0Var.R1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 1:
                ((kg.k) this.f4716b).a(view, (HashSet) this.f4717c, (Runnable) this.d);
                return;
            case 2:
                new kh.s((Context) this.f4717c, null, null, (GiftAuctionController.Auction) this.d).show();
                ((kh.f) this.f4716b).dismiss();
                return;
            case 3:
                kh.s.R((kh.s) this.f4716b, (boolean[]) this.f4717c, (f6) this.d);
                return;
            case 4:
                kh.f0.R((kh.f0) this.f4716b, (Context) this.f4717c, (f6) this.d);
                return;
            case 5:
                kh.f0.P((kh.f0) this.f4716b, (boolean[]) this.f4717c, (f6) this.d);
                return;
            case 6:
                kh.n3 n3Var = (kh.n3) this.f4716b;
                ((o70) this.f4717c).u();
                or0 or0Var = n3Var.f10719a;
                kh.d3 d3Var = new kh.d3(n3Var, (TL_stars.SavedStarGift) this.d, 0);
                HashMap hashMap = kh.x3.Q;
                or0Var.h(null, d3Var);
                return;
            case 7:
                Context context2 = (Context) this.f4717c;
                f6 f6Var = (f6) this.d;
                if (((lh.n0) this.f4716b).f12820j0.f13928a == mf.b.f13930a) {
                    new aa(context2, f6Var).show();
                    return;
                }
                return;
            case 8:
                final org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f4717c;
                final ph.d dVar = (ph.d) this.d;
                g3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((k6) this.f4716b).run(new Utilities.Callback() {
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
                final org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) this.f4717c;
                final ph.d dVar2 = (ph.d) this.d;
                g3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((d7) this.f4716b).run(new Utilities.Callback() {
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
                ((cg.h0) this.f4716b).run(Long.valueOf(((long[]) this.f4717c)[0]));
                ((org.telegram.ui.ActionBar.g3) this.d).dismiss();
                return;
            case 11:
                d4 d4Var = ((nh.w3) this.f4716b).f16027l;
                d4Var.F0((d8) this.f4717c, (TL_stories.StoryItem) this.d);
                nh.w3 w3Var = d4Var.f15228q1;
                if (w3Var != null) {
                    w3Var.a();
                    return;
                }
                return;
            case 12:
                nh.w3 w3Var2 = (nh.w3) this.f4716b;
                i9 i9Var = (i9) this.d;
                ((org.telegram.ui.ActionBar.g1) this.f4717c).performHapticFeedback(3);
                qc X = qc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new lh.n2(29, w3Var2, i9Var))).j();
                    return;
                }
                return;
            case 13:
                m4 m4Var = (m4) this.f4716b;
                eg.y1 y1Var = new eg.y1(m4Var, 5);
                d5 d5Var = m4Var.f15607b;
                new mv(y1Var, d5Var.getContext(), d5Var.f15271s, (ArrayList) this.f4717c).show();
                ((o70) this.d).u();
                return;
            case 14:
                org.telegram.ui.Components.r.P((org.telegram.ui.Components.r) this.f4716b, (TL_aicompose.AiComposeTone) this.f4717c, (f6) this.d);
                return;
            case 15:
                ((boolean[]) this.f4716b)[0] = false;
                ((y4) this.f4717c).J(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.b3) this.d).f19525a.dismissRunnable;
                runnable.run();
                return;
            case 16:
                Runnable runnable3 = (Runnable) this.f4717c;
                w4 w4Var = (w4) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = ((org.telegram.ui.ActionBar.d2[]) this.f4716b)[0];
                if (d2Var != null) {
                    d2Var.setOnDismissListener(null);
                }
                runnable3.run();
                w4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 17:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f4716b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f4717c).run();
                ((AlertDialog$Builder) this.d).f19503a.I0.run();
                return;
            case 18:
                ((b8) this.f4716b).f23591n.B0((org.telegram.ui.Cells.x) this.f4717c, (MessageObject) this.d);
                return;
            case 19:
                li liVar = (li) this.f4716b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f4717c;
                f6 f6Var2 = (f6) this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = liVar.f26689c0;
                int i10 = liVar.G1;
                vh vhVar = liVar.F0;
                cf cfVar = liVar.f26695e0;
                if (cfVar != null) {
                    j10 = cfVar.k();
                } else {
                    j10 = 0;
                }
                liVar.K0 = j10;
                vhVar.setEffect(j10);
                liVar.forceKeyboardOnDismiss();
                if (liVar.H - liVar.I < 0) {
                    AndroidUtilities.shakeView(liVar.f26738s);
                    AndroidUtilities.shakeView(liVar.v);
                    try {
                        vhVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > liVar.I) {
                        liVar.O1(p2Var);
                    }
                    cf cfVar2 = liVar.f26695e0;
                    if (cfVar2 != null) {
                        cfVar2.h(false);
                        liVar.f26695e0 = null;
                        return;
                    }
                    return;
                }
                if (liVar.E1 == null && (p2Var2 instanceof xn)) {
                    xn xnVar = (xn) p2Var2;
                    if (xnVar.c()) {
                        z4.M(liVar.getContext(), xnVar.a(), new f3.e(liVar, j10, 3), f6Var2);
                        liVar.H1(false, false);
                        return;
                    }
                }
                di diVar = liVar.f26748v0;
                if (diVar != liVar.f26702g0 && diVar != liVar.f26722n0) {
                    if (!diVar.H(0, true, 0, liVar.s1(), j10)) {
                        liVar.f26758x2 = true;
                        liVar.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = liVar.G1(0, true, 0, liVar.s1(), j10);
                }
                cf cfVar3 = liVar.f26695e0;
                if (cfVar3 != null) {
                    cfVar3.h(!G1);
                    liVar.f26695e0 = null;
                }
                liVar.H1(false, false);
                return;
            case 20:
                li liVar2 = (li) this.f4716b;
                MessageObject messageObject = (MessageObject) this.f4717c;
                liVar2.H1(!liVar2.Z, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z10 = liVar2.Z;
                message.invert_media = z10;
                ((vb0) this.d).a(!z10, true);
                liVar2.f26695e0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar2.f26702g0;
                if (chatAttachAlertPhotoLayout != null && (vb0Var = chatAttachAlertPhotoLayout.f22900a1) != null) {
                    vb0Var.a(!liVar2.Z, true);
                }
                liVar2.f26695e0.n(!liVar2.Z);
                return;
            case 21:
                ph.d dVar3 = (ph.d) this.d;
                ((Utilities.Callback) this.f4717c).run(new af.f(new vp(dVar3, 4), new il(6, (jr) this.f4716b, dVar3)));
                return;
            case 22:
                Context context3 = (Context) this.f4717c;
                ((hr) this.f4716b).getClass();
                AndroidUtilities.addToClipboard(((y8) this.d).f22622a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 23:
                vt vtVar = (vt) this.f4716b;
                lh.n nVar = (lh.n) this.f4717c;
                gg.j jVar = (gg.j) this.d;
                try {
                    charSequence = ((ClipboardManager) vtVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(vtVar.getContext());
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
                du duVar = (du) this.f4716b;
                qv0 qv0Var = (qv0) this.f4717c;
                f6 f6Var3 = (f6) this.d;
                yt ytVar = duVar.f24367a;
                ge geVar = duVar.f24368b;
                if (geVar.isEnabled() && geVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.r1 r1Var = duVar.H;
                    if (r1Var == null || !r1Var.f20547f) {
                        if (duVar.f24371n) {
                            ytVar.hideActionMode();
                            o70 o70Var = new o70(qv0Var, f6Var3, geVar, false, false, true);
                            o70Var.X = AndroidUtilities.dp(280.0f);
                            ytVar.extendActionMode(null, new qa0(o70Var, new org.telegram.ui.Components.v2(ytVar, 4), ytVar.getOnPremiumMenuLockClickListener()));
                            o70Var.U = true;
                            o70Var.Z();
                            return;
                        } else if (!duVar.e) {
                            duVar.x(1);
                            boolean isFocused = ytVar.isFocused();
                            zt ztVar = duVar.d;
                            if (ytVar.length() <= 0) {
                                z4 = false;
                            }
                            ztVar.E(z4, false);
                            ytVar.requestFocus();
                            if (!isFocused) {
                                ytVar.setSelection(ytVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (duVar.f24375x) {
                                duVar.k(true);
                                duVar.f24375x = false;
                                duVar.p();
                            }
                            duVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 25:
                o20 o20Var = (o20) this.f4716b;
                o20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f4717c);
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f19503a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new fv(o20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.p2) this.d).showDialog(alertDialog$Builder.f19503a);
                return;
            case 26:
                x80 x80Var = (x80) this.f4716b;
                org.telegram.ui.ActionBar.g3 g3Var3 = (org.telegram.ui.ActionBar.g3) this.f4717c;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) this.d;
                try {
                    if (x80Var.f30604b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", x80Var.f30604b));
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
                qb0 qb0Var = (qb0) this.f4716b;
                vb0 vb0Var2 = (vb0) this.f4717c;
                vb0 vb0Var3 = (vb0) this.d;
                wb0 wb0Var = qb0Var.W;
                MessagePreviewParams messagePreviewParams = wb0Var.d;
                boolean z11 = messagePreviewParams.hideCaption;
                boolean z12 = !z11;
                messagePreviewParams.hideCaption = z12;
                if (!z11) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        wb0Var.f30293x = true;
                    }
                } else {
                    if (wb0Var.f30293x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    wb0Var.f30293x = false;
                }
                vb0Var2.a(z12, true);
                vb0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                qb0Var.h();
                qb0Var.k(true);
                return;
            case 28:
                de0.n((de0) this.f4716b, (TLRPC.ChatFull) this.f4717c, (y60) this.d);
                return;
            default:
                of0 of0Var = (of0) this.f4716b;
                Context context4 = (Context) this.f4717c;
                f6 f6Var4 = (f6) this.d;
                if (of0Var.h == null) {
                    ph.d3 d3Var2 = new ph.d3(context4, f6Var4, LocaleController.getString(R.string.VideoChooseCover), of0Var.f27558f);
                    of0Var.h = d3Var2;
                    d3Var2.setOnDismissListener(new cc0(of0Var, 8));
                    of0Var.h.f41439f = of0Var.f27559n;
                }
                of0Var.h.show();
                return;
        }
    }
}
