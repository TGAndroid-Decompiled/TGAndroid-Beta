package eg;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import mh.aa;
import mh.d7;
import mh.k6;
import oh.e5;
import oh.f4;
import oh.i9;
import oh.o4;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.w4;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ht0;
import org.telegram.ui.xn;
import org.telegram.ui.z60;
import qh.b8;
public final class o implements View.OnClickListener {
    public final int f5383a;
    public final Object f5384b;
    public final Object f5385c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f5383a = i10;
        this.f5384b = obj;
        this.f5385c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        long j10;
        boolean G1;
        xb0 xb0Var;
        CharSequence charSequence = null;
        boolean z4 = true;
        switch (this.f5383a) {
            case 0:
                ht0 ht0Var = (ht0) this.f5384b;
                Context context = (Context) this.f5385c;
                Bitmap bitmap = (Bitmap) this.d;
                if (ht0Var.I1) {
                    dg.e0 e0Var = new dg.e0(context, ht0Var.N1);
                    e0Var.m(ht0Var.H1.f4524a, 2);
                    e0Var.f4506n = new g0(ht0Var, bitmap);
                    e0Var.h = new n(ht0Var, 1);
                    e0Var.show();
                    return;
                }
                Runnable runnable2 = ht0Var.R1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 1:
                ((lg.k) this.f5384b).a(view, (HashSet) this.f5385c, (Runnable) this.d);
                return;
            case 2:
                new lh.s((Context) this.f5385c, null, null, (GiftAuctionController.Auction) this.d).show();
                ((lh.f) this.f5384b).dismiss();
                return;
            case 3:
                lh.s.R((lh.s) this.f5384b, (boolean[]) this.f5385c, (g6) this.d);
                return;
            case 4:
                lh.f0.R((lh.f0) this.f5384b, (Context) this.f5385c, (g6) this.d);
                return;
            case 5:
                lh.f0.P((lh.f0) this.f5384b, (boolean[]) this.f5385c, (g6) this.d);
                return;
            case 6:
                lh.n3 n3Var = (lh.n3) this.f5384b;
                ((q70) this.f5385c).u();
                pr0 pr0Var = n3Var.f12860a;
                lh.d3 d3Var = new lh.d3(n3Var, (TL_stars.SavedStarGift) this.d, 0);
                HashMap hashMap = lh.x3.Q;
                pr0Var.h(null, d3Var);
                return;
            case 7:
                Context context2 = (Context) this.f5385c;
                g6 g6Var = (g6) this.d;
                if (((mh.m0) this.f5384b).f14431j0.f13649a == mf.b.f13651a) {
                    new aa(context2, g6Var).show();
                    return;
                }
                return;
            case 8:
                final org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f5385c;
                final qh.d dVar = (qh.d) this.d;
                h3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((k6) this.f5384b).run(new Utilities.Callback() {
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
                                final qh.d dVar2 = dVar;
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
                                final qh.d dVar3 = dVar;
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
            case 9:
                final org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) this.f5385c;
                final qh.d dVar2 = (qh.d) this.d;
                h3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((d7) this.f5384b).run(new Utilities.Callback() {
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
                                final qh.d dVar22 = dVar2;
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
                                final qh.d dVar3 = dVar2;
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
            case 10:
                ((dg.h0) this.f5384b).run(Long.valueOf(((long[]) this.f5385c)[0]));
                ((org.telegram.ui.ActionBar.h3) this.d).dismiss();
                return;
            case 11:
                f4 f4Var = ((oh.y3) this.f5384b).f17950l;
                f4Var.F0((b8) this.f5385c, (TL_stories.StoryItem) this.d);
                oh.y3 y3Var = f4Var.f17098q1;
                if (y3Var != null) {
                    y3Var.a();
                    return;
                }
                return;
            case 12:
                oh.y3 y3Var2 = (oh.y3) this.f5384b;
                i9 i9Var = (i9) this.d;
                ((org.telegram.ui.ActionBar.g1) this.f5385c).performHapticFeedback(3);
                qc X = qc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new oh.z1(2, y3Var2, i9Var))).j();
                    return;
                }
                return;
            case 13:
                o4 o4Var = (o4) this.f5384b;
                fg.x1 x1Var = new fg.x1(o4Var, 5);
                e5 e5Var = o4Var.f17550b;
                new ov(x1Var, e5Var.getContext(), e5Var.f17032s, (ArrayList) this.f5385c).show();
                ((q70) this.d).u();
                return;
            case 14:
                org.telegram.ui.Components.r.P((org.telegram.ui.Components.r) this.f5384b, (TL_aicompose.AiComposeTone) this.f5385c, (g6) this.d);
                return;
            case 15:
                ((boolean[]) this.f5384b)[0] = false;
                ((y4) this.f5385c).I(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.c3) this.d).f21207a.dismissRunnable;
                runnable.run();
                return;
            case 16:
                Runnable runnable3 = (Runnable) this.f5385c;
                w4 w4Var = (w4) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = ((org.telegram.ui.ActionBar.d2[]) this.f5384b)[0];
                if (d2Var != null) {
                    d2Var.setOnDismissListener(null);
                }
                runnable3.run();
                w4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 17:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f5384b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f5385c).run();
                ((AlertDialog$Builder) this.d).f21166a.I0.run();
                return;
            case 18:
                ((org.telegram.ui.Components.b8) this.f5384b).f25516n.B0((org.telegram.ui.Cells.x) this.f5385c, (MessageObject) this.d);
                return;
            case 19:
                mi miVar = (mi) this.f5384b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f5385c;
                g6 g6Var2 = (g6) this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = miVar.f29040c0;
                int i10 = miVar.G1;
                vh vhVar = miVar.F0;
                cf cfVar = miVar.f29047e0;
                if (cfVar != null) {
                    j10 = cfVar.k();
                } else {
                    j10 = 0;
                }
                miVar.K0 = j10;
                vhVar.setEffect(j10);
                miVar.forceKeyboardOnDismiss();
                if (miVar.H - miVar.I < 0) {
                    AndroidUtilities.shakeView(miVar.f29090s);
                    AndroidUtilities.shakeView(miVar.v);
                    try {
                        vhVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > miVar.I) {
                        miVar.O1(p2Var);
                    }
                    cf cfVar2 = miVar.f29047e0;
                    if (cfVar2 != null) {
                        cfVar2.h(false);
                        miVar.f29047e0 = null;
                        return;
                    }
                    return;
                }
                if (miVar.E1 == null && (p2Var2 instanceof xn)) {
                    xn xnVar = (xn) p2Var2;
                    if (xnVar.c()) {
                        z4.M(miVar.getContext(), xnVar.a(), new f3.e(miVar, j10, 3), g6Var2);
                        miVar.H1(false, false);
                        return;
                    }
                }
                ei eiVar = miVar.f29100v0;
                if (eiVar != miVar.f29054g0 && eiVar != miVar.f29074n0) {
                    if (!eiVar.H(0, true, 0, miVar.s1(), j10)) {
                        miVar.f29110x2 = true;
                        miVar.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = miVar.G1(0, true, 0, miVar.s1(), j10);
                }
                cf cfVar3 = miVar.f29047e0;
                if (cfVar3 != null) {
                    cfVar3.h(!G1);
                    miVar.f29047e0 = null;
                }
                miVar.H1(false, false);
                return;
            case 20:
                mi miVar2 = (mi) this.f5384b;
                MessageObject messageObject = (MessageObject) this.f5385c;
                miVar2.H1(!miVar2.Z, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z10 = miVar2.Z;
                message.invert_media = z10;
                ((xb0) this.d).a(!z10, true);
                miVar2.f29047e0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar2.f29054g0;
                if (chatAttachAlertPhotoLayout != null && (xb0Var = chatAttachAlertPhotoLayout.f24742a1) != null) {
                    xb0Var.a(!miVar2.Z, true);
                }
                miVar2.f29047e0.n(!miVar2.Z);
                return;
            case 21:
                qh.d dVar3 = (qh.d) this.d;
                ((Utilities.Callback) this.f5385c).run(new af.f(new xp(dVar3, 4), new gm(5, (lr) this.f5384b, dVar3)));
                return;
            case 22:
                Context context3 = (Context) this.f5385c;
                ((jr) this.f5384b).getClass();
                AndroidUtilities.addToClipboard(((y8) this.d).f24450a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 23:
                xt xtVar = (xt) this.f5384b;
                mh.m mVar = (mh.m) this.f5385c;
                hg.j jVar = (hg.j) this.d;
                try {
                    charSequence = ((ClipboardManager) xtVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xtVar.getContext());
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (charSequence != null) {
                    mVar.setText(charSequence);
                    mVar.setSelection(0, mVar.getText().length());
                }
                jVar.run();
                return;
            case 24:
                fu fuVar = (fu) this.f5384b;
                qv0 qv0Var = (qv0) this.f5385c;
                g6 g6Var3 = (g6) this.d;
                au auVar = fuVar.f27001a;
                ge geVar = fuVar.f27002b;
                if (geVar.isEnabled() && geVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.r1 r1Var = fuVar.H;
                    if (r1Var == null || !r1Var.f22254f) {
                        if (fuVar.f27006n) {
                            auVar.hideActionMode();
                            q70 q70Var = new q70(qv0Var, g6Var3, geVar, false, false, true);
                            q70Var.X = AndroidUtilities.dp(280.0f);
                            auVar.extendActionMode(null, new sa0(q70Var, new org.telegram.ui.Components.v2(auVar, 4), auVar.getOnPremiumMenuLockClickListener()));
                            q70Var.U = true;
                            q70Var.Z();
                            return;
                        } else if (!fuVar.f27004e) {
                            fuVar.x(1);
                            boolean isFocused = auVar.isFocused();
                            bu buVar = fuVar.d;
                            if (auVar.length() <= 0) {
                                z4 = false;
                            }
                            buVar.E(z4, false);
                            auVar.requestFocus();
                            if (!isFocused) {
                                auVar.setSelection(auVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (fuVar.f27010x) {
                                fuVar.k(true);
                                fuVar.f27010x = false;
                                fuVar.p();
                            }
                            fuVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 25:
                p20 p20Var = (p20) this.f5384b;
                p20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f5385c);
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new hv(p20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.p2) this.d).showDialog(alertDialog$Builder.f21166a);
                return;
            case 26:
                y80 y80Var = (y80) this.f5384b;
                org.telegram.ui.ActionBar.h3 h3Var3 = (org.telegram.ui.ActionBar.h3) this.f5385c;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) this.d;
                try {
                    if (y80Var.f33405b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", y80Var.f33405b));
                        if (h3Var3 != null && h3Var3.getContainer() != null) {
                            new qc(h3Var3.getContainer(), null).k(false).j();
                        } else {
                            qc.j(p2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 27:
                sb0 sb0Var = (sb0) this.f5384b;
                xb0 xb0Var2 = (xb0) this.f5385c;
                xb0 xb0Var3 = (xb0) this.d;
                yb0 yb0Var = sb0Var.W;
                MessagePreviewParams messagePreviewParams = yb0Var.d;
                boolean z11 = messagePreviewParams.hideCaption;
                boolean z12 = !z11;
                messagePreviewParams.hideCaption = z12;
                if (!z11) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        yb0Var.f33441x = true;
                    }
                } else {
                    if (yb0Var.f33441x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    yb0Var.f33441x = false;
                }
                xb0Var2.a(z12, true);
                xb0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                sb0Var.h();
                sb0Var.k(true);
                return;
            case 28:
                fe0.n((fe0) this.f5384b, (TLRPC.ChatFull) this.f5385c, (z60) this.d);
                return;
            default:
                qf0 qf0Var = (qf0) this.f5384b;
                Context context4 = (Context) this.f5385c;
                g6 g6Var4 = (g6) this.d;
                if (qf0Var.h == null) {
                    qh.d3 d3Var2 = new qh.d3(context4, g6Var4, LocaleController.getString(R.string.VideoChooseCover), qf0Var.f30388f);
                    qf0Var.h = d3Var2;
                    d3Var2.setOnDismissListener(new ec0(qf0Var, 8));
                    qf0Var.h.f45201f = qf0Var.f30389n;
                }
                qf0Var.h.show();
                return;
        }
    }
}
