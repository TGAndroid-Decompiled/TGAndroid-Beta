package bg;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jh.c7;
import jh.k6;
import jh.z9;
import lh.c5;
import lh.i9;
import lh.m4;
import nh.c9;
import nh.ja;
import nh.wa;
import nh.y4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.je;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.z4;
import org.telegram.ui.tn;
import org.telegram.ui.ws0;
public final class q implements View.OnClickListener {
    public final int f2459a;
    public final Object f2460b;
    public final Object f2461c;
    public final Object d;

    public q(Object obj, Object obj2, Object obj3, int i10) {
        this.f2459a = i10;
        this.f2460b = obj;
        this.f2461c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        nh.o oVar;
        String formatPluralString;
        f fVar;
        Runnable runnable;
        long j10;
        boolean G1;
        qb0 qb0Var;
        CharSequence charSequence = null;
        boolean z10 = true;
        switch (this.f2459a) {
            case 0:
                ws0 ws0Var = (ws0) this.f2460b;
                Context context = (Context) this.f2461c;
                Bitmap bitmap = (Bitmap) this.d;
                if (ws0Var.H1) {
                    ag.f0 f0Var = new ag.f0(context, ws0Var.M1);
                    f0Var.m(ws0Var.G1.f571a, 2);
                    f0Var.f467n = new j0(ws0Var, bitmap);
                    f0Var.h = new p(ws0Var, 1);
                    f0Var.show();
                    return;
                }
                Runnable runnable2 = ws0Var.Q1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 1:
                ((ig.k) this.f2460b).a(view, (HashSet) this.f2461c, (Runnable) this.d);
                return;
            case 2:
                new ih.t((Context) this.f2461c, null, null, (GiftAuctionController.Auction) this.d).show();
                ((ih.f) this.f2460b).dismiss();
                return;
            case 3:
                ih.t.R((ih.t) this.f2460b, (boolean[]) this.f2461c, (c6) this.d);
                return;
            case 4:
                ih.g0.R((ih.g0) this.f2460b, (Context) this.f2461c, (c6) this.d);
                return;
            case 5:
                ih.g0.P((ih.g0) this.f2460b, (boolean[]) this.f2461c, (c6) this.d);
                return;
            case 6:
                ih.n3 n3Var = (ih.n3) this.f2460b;
                ((j70) this.f2461c).u();
                gr0 gr0Var = n3Var.f9293a;
                ih.d3 d3Var = new ih.d3(n3Var, (TL_stars.SavedStarGift) this.d, 0);
                HashMap hashMap = ih.x3.P;
                gr0Var.h(null, d3Var);
                return;
            case 7:
                Context context2 = (Context) this.f2461c;
                c6 c6Var = (c6) this.d;
                if (((jh.n0) this.f2460b).f12490i0.f13633a == kf.b.f13635a) {
                    new z9(context2, c6Var).show();
                    return;
                }
                return;
            case 8:
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f2461c;
                final nh.d dVar = (nh.d) this.d;
                f3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((k6) this.f2460b).run(new Utilities.Callback() {
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
                                final nh.d dVar2 = dVar;
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
                                final nh.d dVar3 = dVar;
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
            case 9:
                final org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f2461c;
                final nh.d dVar2 = (nh.d) this.d;
                f3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((c7) this.f2460b).run(new Utilities.Callback() {
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
                                final nh.d dVar22 = dVar2;
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
                                final nh.d dVar3 = dVar2;
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
            case 10:
                ((ag.i0) this.f2460b).run(Long.valueOf(((long[]) this.f2461c)[0]));
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                return;
            case 11:
                lh.d4 d4Var = ((lh.w3) this.f2460b).f16362l;
                d4Var.F0((c9) this.f2461c, (TL_stories.StoryItem) this.d);
                lh.w3 w3Var = d4Var.f15510p1;
                if (w3Var != null) {
                    w3Var.a();
                    return;
                }
                return;
            case 12:
                lh.w3 w3Var2 = (lh.w3) this.f2460b;
                i9 i9Var = (i9) this.d;
                ((org.telegram.ui.ActionBar.g1) this.f2461c).performHapticFeedback(3);
                tc X = tc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new lh.r3(0, w3Var2, i9Var))).j();
                    return;
                }
                return;
            case 13:
                m4 m4Var = (m4) this.f2460b;
                cg.z1 z1Var = new cg.z1(m4Var, 5);
                c5 c5Var = m4Var.f15925b;
                new jv(z1Var, c5Var.getContext(), c5Var.f15439s, (ArrayList) this.f2461c).show();
                ((j70) this.d).u();
                return;
            case 14:
                wa waVar = (wa) this.f2460b;
                FrameLayout frameLayout = (FrameLayout) this.f2461c;
                lh.b bVar = (lh.b) this.d;
                j70 j70Var = waVar.R0;
                if (j70Var == null || !j70Var.D()) {
                    nh.o oVar2 = new nh.o(waVar, 0);
                    boolean isPremium = UserConfig.getInstance(waVar.Q).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new nh.o(waVar, 1);
                    }
                    j70 F = j70.F(frameLayout, bVar, waVar.P0);
                    waVar.R0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    waVar.R0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = nh.r.M1;
                        if (i10 < 4) {
                            int i11 = iArr[i10];
                            j70 j70Var2 = waVar.R0;
                            if (i11 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i12 = g6.E8;
                            j70Var2.b(0, null, str, i12, i12, new f(oVar2, i11, 10));
                            if (!isPremium && i11 != 86400 && i11 != Integer.MAX_VALUE) {
                                fVar = new f(oVar, i11, 11);
                            } else {
                                fVar = null;
                            }
                            j70Var2.M(fVar);
                            if (waVar.T0 == i10) {
                                waVar.R0.L();
                            }
                            i10++;
                        } else {
                            j70 j70Var3 = waVar.R0;
                            j70Var3.f29600s = 0;
                            j70Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 15:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f2461c;
                nh.j3 j3Var = (nh.j3) this.d;
                nh.n3 n3Var2 = ((nh.g3) this.f2460b).f17692c;
                ArrayList arrayList = n3Var2.f18173d0;
                if (arrayList.contains(photoEntry)) {
                    arrayList.remove(photoEntry);
                } else if (arrayList.size() + 1 > n3Var2.N) {
                    int i13 = -n3Var2.J;
                    n3Var2.J = i13;
                    AndroidUtilities.shakeViewSpring(j3Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                } else {
                    arrayList.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(n3Var2.d);
                n3Var2.j();
                return;
            case 16:
                ja jaVar = (ja) this.f2460b;
                Context context3 = (Context) this.f2461c;
                ag.h1 h1Var = (ag.h1) this.d;
                if (jaVar.f18667x1) {
                    ag.f0 f0Var2 = new ag.f0(context3, jaVar.C1);
                    jaVar.P1 = f0Var2;
                    f0Var2.m(jaVar.f18665w1.f571a, 2);
                    f0Var2.f467n = new y4(jaVar, h1Var);
                    f0Var2.h = new eg.n0(4, jaVar, h1Var);
                    f0Var2.show();
                    return;
                }
                Runnable runnable3 = jaVar.G1;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.s.P((org.telegram.ui.Components.s) this.f2460b, (TL_aicompose.AiComposeTone) this.f2461c, (c6) this.d);
                return;
            case 18:
                ((boolean[]) this.f2460b)[0] = false;
                ((b5) this.f2461c).I(-1, 0, true);
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f22729a.dismissRunnable;
                runnable.run();
                return;
            case 19:
                Runnable runnable4 = (Runnable) this.f2461c;
                z4 z4Var = (z4) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = ((org.telegram.ui.ActionBar.c2[]) this.f2460b)[0];
                if (c2Var != null) {
                    c2Var.setOnDismissListener(null);
                }
                runnable4.run();
                z4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 20:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f2460b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f2461c).run();
                ((AlertDialog$Builder) this.d).f22714a.H0.run();
                return;
            case 21:
                ((f8) this.f2460b).f28348n.B0((org.telegram.ui.Cells.x) this.f2461c, (MessageObject) this.d);
                return;
            case 22:
                ni niVar = (ni) this.f2460b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f2461c;
                c6 c6Var2 = (c6) this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = niVar.f30990b0;
                int i14 = niVar.F1;
                yh yhVar = niVar.E0;
                ff ffVar = niVar.f30997d0;
                if (ffVar != null) {
                    j10 = ffVar.k();
                } else {
                    j10 = 0;
                }
                niVar.J0 = j10;
                yhVar.setEffect(j10);
                niVar.forceKeyboardOnDismiss();
                if (niVar.G - niVar.H < 0) {
                    AndroidUtilities.shakeView(niVar.f31044s);
                    AndroidUtilities.shakeView(niVar.v);
                    try {
                        yhVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > niVar.H) {
                        niVar.O1(o2Var);
                    }
                    ff ffVar2 = niVar.f30997d0;
                    if (ffVar2 != null) {
                        ffVar2.h(false);
                        niVar.f30997d0 = null;
                        return;
                    }
                    return;
                }
                if (niVar.D1 == null && (o2Var2 instanceof tn)) {
                    tn tnVar = (tn) o2Var2;
                    if (tnVar.c()) {
                        org.telegram.ui.Components.c5.M(niVar.getContext(), tnVar.a(), new f3.e(niVar, j10, 4), c6Var2);
                        niVar.H1(false, false);
                        return;
                    }
                }
                fi fiVar = niVar.f31051u0;
                if (fiVar != niVar.f31005f0 && fiVar != niVar.m0) {
                    if (!fiVar.H(0, true, 0, niVar.s1(), j10)) {
                        niVar.f31060w2 = true;
                        niVar.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = niVar.G1(0, true, 0, niVar.s1(), j10);
                }
                ff ffVar3 = niVar.f30997d0;
                if (ffVar3 != null) {
                    ffVar3.h(!G1);
                    niVar.f30997d0 = null;
                }
                niVar.H1(false, false);
                return;
            case 23:
                ni niVar2 = (ni) this.f2460b;
                MessageObject messageObject = (MessageObject) this.f2461c;
                niVar2.H1(!niVar2.Y, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z11 = niVar2.Y;
                message.invert_media = z11;
                ((qb0) this.d).a(!z11, true);
                niVar2.f30997d0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar2.f31005f0;
                if (chatAttachAlertPhotoLayout != null && (qb0Var = chatAttachAlertPhotoLayout.Z0) != null) {
                    qb0Var.a(!niVar2.Y, true);
                }
                niVar2.f30997d0.n(!niVar2.Y);
                return;
            case 24:
                nh.d dVar3 = (nh.d) this.d;
                ((Utilities.Callback) this.f2461c).run(new ye.c(new rp(dVar3, 4), new org.telegram.ui.Components.z2(27, (fr) this.f2460b, dVar3)));
                return;
            case 25:
                Context context4 = (Context) this.f2461c;
                ((dr) this.f2460b).getClass();
                AndroidUtilities.addToClipboard(((w8) this.d).f25875a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context4, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 26:
                st stVar = (st) this.f2460b;
                jh.m mVar = (jh.m) this.f2461c;
                eg.j jVar = (eg.j) this.d;
                try {
                    charSequence = ((ClipboardManager) stVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(stVar.getContext());
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (charSequence != null) {
                    mVar.setText(charSequence);
                    mVar.setSelection(0, mVar.getText().length());
                }
                jVar.run();
                return;
            case 27:
                au auVar = (au) this.f2460b;
                hv0 hv0Var = (hv0) this.f2461c;
                c6 c6Var3 = (c6) this.d;
                vt vtVar = auVar.f26882a;
                je jeVar = auVar.f26883b;
                if (jeVar.isEnabled() && jeVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.q1 q1Var = auVar.G;
                    if (q1Var == null || !q1Var.f23740f) {
                        if (auVar.f26887n) {
                            vtVar.hideActionMode();
                            j70 j70Var4 = new j70(hv0Var, c6Var3, jeVar, false, false, true);
                            j70Var4.X = AndroidUtilities.dp(280.0f);
                            vtVar.extendActionMode(null, new la0(j70Var4, new org.telegram.ui.Components.y2(vtVar, 4), vtVar.getOnPremiumMenuLockClickListener()));
                            j70Var4.U = true;
                            j70Var4.Z();
                            return;
                        } else if (!auVar.f26885e) {
                            auVar.x(1);
                            boolean isFocused = vtVar.isFocused();
                            wt wtVar = auVar.d;
                            if (vtVar.length() <= 0) {
                                z10 = false;
                            }
                            wtVar.E(z10, false);
                            vtVar.requestFocus();
                            if (!isFocused) {
                                vtVar.setSelection(vtVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (auVar.f26891x) {
                                auVar.k(true);
                                auVar.f26891x = false;
                                auVar.p();
                            }
                            auVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 28:
                j20 j20Var = (j20) this.f2460b;
                j20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f2461c);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new cv(j20Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((org.telegram.ui.ActionBar.o2) this.d).showDialog(alertDialog$Builder.f22714a);
                return;
            default:
                r80 r80Var = (r80) this.f2460b;
                org.telegram.ui.ActionBar.f3 f3Var3 = (org.telegram.ui.ActionBar.f3) this.f2461c;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.d;
                try {
                    if (r80Var.f32232b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", r80Var.f32232b));
                        if (f3Var3 != null && f3Var3.getContainer() != null) {
                            new tc(f3Var3.getContainer(), null).k(false).j();
                        } else {
                            tc.j(o2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
