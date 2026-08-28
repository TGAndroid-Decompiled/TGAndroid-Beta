package fg;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import bg.c2;
import bg.i1;
import bg.r0;
import fh.j4;
import fh.k0;
import fh.o3;
import fh.x;
import fh.y3;
import gh.f7;
import gh.fa;
import gh.n6;
import gh.o0;
import h3.g0;
import ih.b4;
import ih.g5;
import ih.i4;
import ih.m9;
import ih.q4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kh.i5;
import kh.j3;
import kh.m3;
import kh.mb;
import kh.q3;
import kh.r9;
import kh.s;
import kh.ya;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
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
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.q;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.v2;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.zq;
import org.telegram.ui.qn;
import xf.s0;
public final class f implements View.OnClickListener {
    public final int f6288a;
    public final Object f6289b;
    public final Object f6290c;
    public final Object d;

    public f(Object obj, Object obj2, Object obj3, int i9) {
        this.f6288a = i9;
        this.f6289b = obj;
        this.f6290c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        kh.o oVar;
        String formatPluralString;
        c2 c2Var;
        Runnable runnable;
        long j10;
        boolean G1;
        bb0 bb0Var;
        CharSequence charSequence = null;
        boolean z10 = true;
        switch (this.f6288a) {
            case 0:
                ((m) this.f6289b).a(view, (HashSet) this.f6290c, (Runnable) this.d);
                return;
            case 1:
                new x((Context) this.f6290c, null, null, (GiftAuctionController.Auction) this.d).show();
                ((fh.f) this.f6289b).dismiss();
                return;
            case 2:
                x.Q((x) this.f6289b, (boolean[]) this.f6290c, (b6) this.d);
                return;
            case 3:
                k0.Q((k0) this.f6289b, (Context) this.f6290c, (b6) this.d);
                return;
            case 4:
                k0.O((k0) this.f6289b, (boolean[]) this.f6290c, (b6) this.d);
                return;
            case 5:
                y3 y3Var = (y3) this.f6289b;
                ((x60) this.f6290c).u();
                vq0 vq0Var = y3Var.f6880a;
                o3 o3Var = new o3(y3Var, (TL_stars.SavedStarGift) this.d, 0);
                HashMap hashMap = j4.P;
                vq0Var.h(null, o3Var);
                return;
            case 6:
                Context context = (Context) this.f6290c;
                b6 b6Var = (b6) this.d;
                if (((o0) this.f6289b).f8649i0.f7747a == gf.b.f7749a) {
                    new fa(context, b6Var).show();
                    return;
                }
                return;
            case 7:
                final f3 f3Var = (f3) this.f6290c;
                final kh.d dVar = (kh.d) this.d;
                f3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((n6) this.f6289b).run(new Utilities.Callback() {
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
                                final kh.d dVar2 = dVar;
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
                                final kh.d dVar3 = dVar;
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
            case 8:
                final f3 f3Var2 = (f3) this.f6290c;
                final kh.d dVar2 = (kh.d) this.d;
                f3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((f7) this.f6289b).run(new Utilities.Callback() {
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
                                final kh.d dVar22 = dVar2;
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
                                final kh.d dVar3 = dVar2;
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
                ((bg.i) this.f6289b).run(Long.valueOf(((long[]) this.f6290c)[0]));
                ((f3) this.d).dismiss();
                return;
            case 10:
                i4 i4Var = ((b4) this.f6289b).f11268l;
                i4Var.F0((r9) this.f6290c, (TL_stories.StoryItem) this.d);
                b4 b4Var = i4Var.f11574p1;
                if (b4Var != null) {
                    b4Var.a();
                    return;
                }
                return;
            case 11:
                b4 b4Var2 = (b4) this.f6289b;
                m9 m9Var = (m9) this.d;
                ((g1) this.f6290c).performHapticFeedback(3);
                oc X = oc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new g0(14, b4Var2, m9Var))).j();
                    return;
                }
                return;
            case 12:
                q4 q4Var = (q4) this.f6289b;
                i1 i1Var = new i1(q4Var, 4);
                g5 g5Var = q4Var.f12001b;
                new dv(i1Var, g5Var.getContext(), g5Var.f11482s, (ArrayList) this.f6290c).show();
                ((x60) this.d).u();
                return;
            case 13:
                mb mbVar = (mb) this.f6289b;
                FrameLayout frameLayout = (FrameLayout) this.f6290c;
                ih.b bVar = (ih.b) this.d;
                x60 x60Var = mbVar.R0;
                if (x60Var == null || !x60Var.D()) {
                    kh.o oVar2 = new kh.o(mbVar, 0);
                    boolean isPremium = UserConfig.getInstance(mbVar.Q).isPremium();
                    if (isPremium) {
                        oVar = null;
                    } else {
                        oVar = new kh.o(mbVar, 1);
                    }
                    x60 F = x60.F(frameLayout, bVar, mbVar.P0);
                    mbVar.R0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    mbVar.R0.k();
                    int i9 = 0;
                    while (true) {
                        int[] iArr = s.M1;
                        if (i9 < 4) {
                            int i10 = iArr[i9];
                            x60 x60Var2 = mbVar.R0;
                            if (i10 == Integer.MAX_VALUE) {
                                formatPluralString = LocaleController.getString("StoryPeriodKeep");
                            } else {
                                formatPluralString = LocaleController.formatPluralString("Hours", i10 / 3600, new Object[0]);
                            }
                            String str = formatPluralString;
                            int i11 = f6.E8;
                            x60Var2.b(0, null, str, i11, i11, new c2(oVar2, i10, 7));
                            if (!isPremium && i10 != 86400 && i10 != Integer.MAX_VALUE) {
                                c2Var = new c2(oVar, i10, 8);
                            } else {
                                c2Var = null;
                            }
                            x60Var2.M(c2Var);
                            if (mbVar.T0 == i9) {
                                mbVar.R0.L();
                            }
                            i9++;
                        } else {
                            x60 x60Var3 = mbVar.R0;
                            x60Var3.f34580s = 0;
                            x60Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 14:
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f6290c;
                m3 m3Var = (m3) this.d;
                q3 q3Var = ((j3) this.f6289b).f15460c;
                ArrayList arrayList = q3Var.f15864d0;
                if (arrayList.contains(photoEntry)) {
                    arrayList.remove(photoEntry);
                } else if (arrayList.size() + 1 > q3Var.N) {
                    int i12 = -q3Var.J;
                    q3Var.J = i12;
                    AndroidUtilities.shakeViewSpring(m3Var, i12);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                } else {
                    arrayList.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(q3Var.d);
                q3Var.j();
                return;
            case 15:
                ya yaVar = (ya) this.f6289b;
                Context context2 = (Context) this.f6290c;
                s0 s0Var = (s0) this.d;
                if (yaVar.f15312x1) {
                    xf.x xVar = new xf.x(context2, yaVar.C1);
                    yaVar.P1 = xVar;
                    xVar.m(yaVar.f15310w1.f49333a, 2);
                    xVar.f49412n = new i5(yaVar, s0Var);
                    xVar.h = new r0(4, yaVar, s0Var);
                    xVar.show();
                    return;
                }
                Runnable runnable2 = yaVar.G1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 16:
                q.O((q) this.f6289b, (TL_aicompose.AiComposeTone) this.f6290c, (b6) this.d);
                return;
            case 17:
                ((boolean[]) this.f6289b)[0] = false;
                ((x4) this.f6290c).B(-1, 0, true);
                runnable = ((a3) this.d).f22713a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                Runnable runnable3 = (Runnable) this.d;
                v4 v4Var = (v4) this.f6290c;
                org.telegram.ui.ActionBar.c2 c2Var2 = ((org.telegram.ui.ActionBar.c2[]) this.f6289b)[0];
                if (c2Var2 != null) {
                    c2Var2.setOnDismissListener(null);
                }
                runnable3.run();
                v4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 19:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f6289b).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.d).run();
                ((AlertDialog$Builder) this.f6290c).f22702a.H0.run();
                return;
            case 20:
                ((b8) this.f6289b).f27070n.A0((org.telegram.ui.Cells.x) this.f6290c, (MessageObject) this.d);
                return;
            case 21:
                ki kiVar = (ki) this.f6289b;
                o2 o2Var = (o2) this.f6290c;
                b6 b6Var2 = (b6) this.d;
                o2 o2Var2 = kiVar.f30099b0;
                int i13 = kiVar.F1;
                vh vhVar = kiVar.E0;
                cf cfVar = kiVar.f30106d0;
                if (cfVar != null) {
                    j10 = cfVar.k();
                } else {
                    j10 = 0;
                }
                kiVar.J0 = j10;
                vhVar.setEffect(j10);
                kiVar.forceKeyboardOnDismiss();
                if (kiVar.G - kiVar.H < 0) {
                    AndroidUtilities.shakeView(kiVar.f30153s);
                    AndroidUtilities.shakeView(kiVar.v);
                    try {
                        vhVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i13).premiumFeaturesBlocked() && MessagesController.getInstance(i13).captionLengthLimitPremium > kiVar.H) {
                        kiVar.O1(o2Var);
                    }
                    cf cfVar2 = kiVar.f30106d0;
                    if (cfVar2 != null) {
                        cfVar2.h(false);
                        kiVar.f30106d0 = null;
                        return;
                    }
                    return;
                }
                if (kiVar.D1 == null && (o2Var2 instanceof qn)) {
                    qn qnVar = (qn) o2Var2;
                    if (qnVar.c()) {
                        y4.M(kiVar.getContext(), qnVar.a(), new d3.e(kiVar, j10, 4), b6Var2);
                        kiVar.H1(false, false);
                        return;
                    }
                }
                ci ciVar = kiVar.f30160u0;
                if (ciVar != kiVar.f30114f0 && ciVar != kiVar.m0) {
                    if (!ciVar.H(0, true, 0, kiVar.s1(), j10)) {
                        kiVar.f30169w2 = true;
                        kiVar.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = kiVar.G1(0, true, 0, kiVar.s1(), j10);
                }
                cf cfVar3 = kiVar.f30106d0;
                if (cfVar3 != null) {
                    cfVar3.h(!G1);
                    kiVar.f30106d0 = null;
                }
                kiVar.H1(false, false);
                return;
            case 22:
                ki kiVar2 = (ki) this.f6289b;
                MessageObject messageObject = (MessageObject) this.f6290c;
                kiVar2.H1(!kiVar2.Y, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z11 = kiVar2.Y;
                message.invert_media = z11;
                ((bb0) this.d).a(!z11, true);
                kiVar2.f30106d0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar2.f30114f0;
                if (chatAttachAlertPhotoLayout != null && (bb0Var = chatAttachAlertPhotoLayout.Z0) != null) {
                    bb0Var.a(!kiVar2.Y, true);
                }
                kiVar2.f30106d0.n(!kiVar2.Y);
                return;
            case 23:
                kh.d dVar3 = (kh.d) this.d;
                ((Utilities.Callback) this.f6290c).run(new ve.d(new np(dVar3, 4), new zq(0, (cr) this.f6289b, dVar3)));
                return;
            case 24:
                Context context3 = (Context) this.f6290c;
                ((ar) this.f6289b).getClass();
                AndroidUtilities.addToClipboard(((z8) this.d).f26035a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 25:
                mt mtVar = (mt) this.f6289b;
                gh.o oVar3 = (gh.o) this.f6290c;
                bg.m mVar = (bg.m) this.d;
                try {
                    charSequence = ((ClipboardManager) mtVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(mtVar.getContext());
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (charSequence != null) {
                    oVar3.setText(charSequence);
                    oVar3.setSelection(0, oVar3.getText().length());
                }
                mVar.run();
                return;
            case 26:
                ut utVar = (ut) this.f6289b;
                xu0 xu0Var = (xu0) this.f6290c;
                b6 b6Var3 = (b6) this.d;
                pt ptVar = utVar.f33121a;
                ge geVar = utVar.f33122b;
                if (geVar.isEnabled() && geVar.getAlpha() >= 0.5f) {
                    q1 q1Var = utVar.G;
                    if (q1Var == null || !q1Var.f23718f) {
                        if (utVar.f33126n) {
                            ptVar.hideActionMode();
                            x60 x60Var4 = new x60(xu0Var, b6Var3, geVar, false, false, true);
                            x60Var4.X = AndroidUtilities.dp(280.0f);
                            ptVar.extendActionMode(null, new x90(x60Var4, new v2(ptVar, 4), ptVar.getOnPremiumMenuLockClickListener()));
                            x60Var4.U = true;
                            x60Var4.Z();
                            return;
                        } else if (!utVar.f33124e) {
                            utVar.x(1);
                            boolean isFocused = ptVar.isFocused();
                            qt qtVar = utVar.d;
                            if (ptVar.length() <= 0) {
                                z10 = false;
                            }
                            qtVar.E(z10, false);
                            ptVar.requestFocus();
                            if (!isFocused) {
                                ptVar.setSelection(ptVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (utVar.f33130x) {
                                utVar.k(true);
                                utVar.f33130x = false;
                                utVar.p();
                            }
                            utVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 27:
                y10 y10Var = (y10) this.f6289b;
                y10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f6290c);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new wu(y10Var, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ((o2) this.d).showDialog(alertDialog$Builder.f22702a);
                return;
            case 28:
                e80 e80Var = (e80) this.f6289b;
                f3 f3Var3 = (f3) this.f6290c;
                o2 o2Var3 = (o2) this.d;
                try {
                    if (e80Var.f27968b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", e80Var.f27968b));
                        if (f3Var3 != null && f3Var3.getContainer() != null) {
                            new oc(f3Var3.getContainer(), null).k(false).j();
                        } else {
                            oc.j(o2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            default:
                wa0 wa0Var = (wa0) this.f6289b;
                bb0 bb0Var2 = (bb0) this.f6290c;
                bb0 bb0Var3 = (bb0) this.d;
                cb0 cb0Var = wa0Var.V;
                MessagePreviewParams messagePreviewParams = cb0Var.d;
                boolean z12 = messagePreviewParams.hideCaption;
                boolean z13 = !z12;
                messagePreviewParams.hideCaption = z13;
                if (!z12) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        cb0Var.f27463x = true;
                    }
                } else {
                    if (cb0Var.f27463x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    cb0Var.f27463x = false;
                }
                bb0Var2.a(z13, true);
                bb0Var3.a(messagePreviewParams.hideForwardSendersName, true);
                wa0Var.h();
                wa0Var.k(true);
                return;
        }
    }

    public f(Object obj, Runnable runnable, Object obj2, int i9) {
        this.f6288a = i9;
        this.f6289b = obj;
        this.d = runnable;
        this.f6290c = obj2;
    }
}
