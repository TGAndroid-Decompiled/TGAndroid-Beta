package gg;

import ag.n0;
import ag.r2;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import cg.w1;
import gh.d4;
import gh.i0;
import gh.j3;
import gh.t3;
import gh.v;
import hh.e7;
import hh.fa;
import hh.m5;
import hh.m6;
import hh.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jh.c5;
import jh.e4;
import jh.i9;
import jh.m4;
import jh.x3;
import lh.h5;
import lh.i3;
import lh.ib;
import lh.l3;
import lh.o9;
import lh.p3;
import lh.s;
import lh.va;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.ce;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.q;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.v2;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.ye;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.rn;
import yf.r0;
import yf.x;

public final class f implements View.OnClickListener {

    public final int f7088a;

    public final Object f7089b;

    public final Object f7090c;
    public final Object d;

    public f(Object obj, Object obj2, Object obj3, int i10) {
        this.f7088a = i10;
        this.f7089b = obj;
        this.f7090c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        yh yhVar;
        boolean zG1;
        ye yeVar;
        fb0 fb0Var;
        int i10 = 5;
        int i11 = 4;
        CharSequence charSequenceCoerceToText = null;
        final int i12 = 0;
        switch (this.f7088a) {
            case 0:
                ((l) this.f7089b).a(view, (HashSet) this.f7090c, (Runnable) this.d);
                break;
            case 1:
                gh.f fVar = (gh.f) this.f7089b;
                new v((Context) this.f7090c, null, null, (GiftAuctionController.Auction) this.d).show();
                fVar.dismiss();
                break;
            case 2:
                v.R((v) this.f7089b, (boolean[]) this.f7090c, (c6) this.d);
                break;
            case 3:
                i0.R((i0) this.f7089b, (Context) this.f7090c, (c6) this.d);
                break;
            case 4:
                i0.P((i0) this.f7089b, (boolean[]) this.f7090c, (c6) this.d);
                break;
            case 5:
                t3 t3Var = (t3) this.f7089b;
                b70 b70Var = (b70) this.f7090c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.d;
                b70Var.u();
                wq0 wq0Var = t3Var.f7533a;
                j3 j3Var = new j3(t3Var, savedStarGift, i12);
                HashMap map = d4.P;
                wq0Var.h(null, j3Var);
                break;
            case 6:
                o0 o0Var = (o0) this.f7089b;
                Context context = (Context) this.f7090c;
                c6 c6Var = (c6) this.d;
                if (o0Var.f9805i0.f8919a == hf.b.f8921a) {
                    new fa(context, c6Var).show();
                }
                break;
            case 7:
                m6 m6Var = (m6) this.f7089b;
                final e3 e3Var = (e3) this.f7090c;
                final lh.d dVar = (lh.d) this.d;
                e3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                m6Var.run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i12) {
                            case 0:
                                boolean zBooleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                                if (!zBooleanValue) {
                                    final int i13 = 0;
                                    final lh.d dVar2 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    e3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    e3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                } else {
                                    e3Var2.dismiss();
                                }
                                break;
                            default:
                                boolean zBooleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var3 = e3Var;
                                if (!zBooleanValue2) {
                                    final int i14 = 1;
                                    final lh.d dVar3 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    e3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    e3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                } else {
                                    e3Var3.dismiss();
                                }
                                break;
                        }
                    }
                });
                break;
            case 8:
                e7 e7Var = (e7) this.f7089b;
                final e3 e3Var2 = (e3) this.f7090c;
                final lh.d dVar2 = (lh.d) this.d;
                e3Var2.setCanDismissWithSwipe(false);
                final int i13 = 1;
                dVar2.setLoading(true);
                e7Var.run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i13) {
                            case 0:
                                boolean zBooleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var3 = e3Var2;
                                if (!zBooleanValue) {
                                    final int i14 = 0;
                                    final lh.d dVar3 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    e3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    e3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                } else {
                                    e3Var3.dismiss();
                                }
                                break;
                            default:
                                boolean zBooleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var4 = e3Var2;
                                if (!zBooleanValue2) {
                                    final int i15 = 1;
                                    final lh.d dVar4 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i15) {
                                                case 0:
                                                    e3Var4.setCanDismissWithSwipe(false);
                                                    dVar4.setLoading(false);
                                                    break;
                                                default:
                                                    e3Var4.setCanDismissWithSwipe(false);
                                                    dVar4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                } else {
                                    e3Var4.dismiss();
                                }
                                break;
                        }
                    }
                });
                break;
            case 9:
                n0 n0Var = (n0) this.f7089b;
                long[] jArr = (long[]) this.f7090c;
                e3 e3Var3 = (e3) this.d;
                n0Var.run(Long.valueOf(jArr[0]));
                e3Var3.dismiss();
                break;
            case 10:
                x3 x3Var = (x3) this.f7089b;
                o9 o9Var = (o9) this.f7090c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                e4 e4Var = x3Var.f14128l;
                e4Var.F0(o9Var, storyItem);
                x3 x3Var2 = e4Var.f13261p1;
                if (x3Var2 != null) {
                    x3Var2.a();
                }
                break;
            case 11:
                x3 x3Var3 = (x3) this.f7089b;
                f1 f1Var = (f1) this.f7090c;
                i9 i9Var = (i9) this.d;
                f1Var.performHapticFeedback(3);
                mc mcVarX = mc.X();
                if (mcVarX != null) {
                    mcVarX.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new m5(23, x3Var3, i9Var))).j();
                }
                break;
            case 12:
                m4 m4Var = (m4) this.f7089b;
                ArrayList arrayList = (ArrayList) this.f7090c;
                b70 b70Var2 = (b70) this.d;
                r2 r2Var = new r2(m4Var, i10);
                c5 c5Var = m4Var.f13655b;
                new cv(r2Var, c5Var.getContext(), c5Var.f13157s, arrayList).show();
                b70Var2.u();
                break;
            case 13:
                ib ibVar = (ib) this.f7089b;
                FrameLayout frameLayout = (FrameLayout) this.f7090c;
                jh.b bVar = (jh.b) this.d;
                b70 b70Var3 = ibVar.R0;
                if (b70Var3 == null || !b70Var3.D()) {
                    lh.o oVar = new lh.o(ibVar, i12);
                    boolean zIsPremium = UserConfig.getInstance(ibVar.Q).isPremium();
                    lh.o oVar2 = zIsPremium ? null : new lh.o(ibVar, 1);
                    b70 b70VarF = b70.F(frameLayout, bVar, ibVar.P0);
                    ibVar.R0 = b70VarF;
                    b70VarF.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    ibVar.R0.k();
                    int i14 = 0;
                    while (true) {
                        int[] iArr = s.M1;
                        if (i14 >= 4) {
                            b70 b70Var4 = ibVar.R0;
                            b70Var4.f26992s = 0;
                            b70Var4.Z();
                        } else {
                            int i15 = iArr[i14];
                            b70 b70Var5 = ibVar.R0;
                            String string = i15 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i15 / 3600, new Object[0]);
                            int i16 = g6.E8;
                            b70Var5.b(0, null, string, i16, i16, new w1(oVar, i15, 7));
                            b70Var5.M((zIsPremium || i15 == 86400 || i15 == Integer.MAX_VALUE) ? null : new w1(oVar2, i15, 8));
                            if (ibVar.T0 == i14) {
                                ibVar.R0.L();
                            }
                            i14++;
                        }
                    }
                }
                break;
            case 14:
                i3 i3Var = (i3) this.f7089b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f7090c;
                l3 l3Var = (l3) this.d;
                p3 p3Var = i3Var.f16106c;
                ArrayList arrayList2 = p3Var.f16513d0;
                if (arrayList2.contains(photoEntry)) {
                    arrayList2.remove(photoEntry);
                } else if (arrayList2.size() + 1 > p3Var.N) {
                    int i17 = -p3Var.J;
                    p3Var.J = i17;
                    AndroidUtilities.shakeViewSpring(l3Var, i17);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                } else {
                    arrayList2.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(p3Var.d);
                p3Var.j();
                break;
            case 15:
                va vaVar = (va) this.f7089b;
                Context context2 = (Context) this.f7090c;
                r0 r0Var = (r0) this.d;
                if (!vaVar.f16002x1) {
                    Runnable runnable = vaVar.G1;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    x xVar = new x(context2, vaVar.C1);
                    vaVar.P1 = xVar;
                    xVar.m(vaVar.f16000w1.f50034a, 2);
                    xVar.f50116n = new h5(vaVar, r0Var);
                    xVar.h = new cg.n0(i11, vaVar, r0Var);
                    xVar.show();
                }
                break;
            case 16:
                q.P((q) this.f7089b, (TL_aicompose.AiComposeTone) this.f7090c, (c6) this.d);
                break;
            case 17:
                boolean[] zArr = (boolean[]) this.f7089b;
                x4 x4Var = (x4) this.f7090c;
                z2 z2Var = (z2) this.d;
                zArr[0] = false;
                x4Var.I(-1, 0, true);
                z2Var.f23994a.dismissRunnable.run();
                break;
            case 18:
                b2[] b2VarArr = (b2[]) this.f7089b;
                Runnable runnable2 = (Runnable) this.d;
                v4 v4Var = (v4) this.f7090c;
                b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnDismissListener(null);
                }
                runnable2.run();
                v4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                break;
            case 19:
                ArrayList arrayList3 = (ArrayList) this.f7089b;
                Runnable runnable3 = (Runnable) this.d;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f7090c;
                SharedConfig.setSecretMapPreviewType(((Integer) arrayList3.get(((Integer) view.getTag()).intValue())).intValue());
                runnable3.run();
                alertDialog$Builder.f22702a.H0.run();
                break;
            case 20:
                ((a8) this.f7089b).f26657n.B0((org.telegram.ui.Cells.x) this.f7090c, (MessageObject) this.d);
                break;
            case 21:
                gi giVar = (gi) this.f7089b;
                n2 n2Var = (n2) this.f7090c;
                c6 c6Var2 = (c6) this.d;
                n2 n2Var2 = giVar.f28635b0;
                int i18 = giVar.F1;
                rh rhVar = giVar.E0;
                ye yeVar2 = giVar.f28642d0;
                long jK = yeVar2 != null ? yeVar2.k() : 0L;
                giVar.J0 = jK;
                rhVar.setEffect(jK);
                giVar.forceKeyboardOnDismiss();
                if (giVar.G - giVar.H >= 0) {
                    if (giVar.D1 == null && (n2Var2 instanceof rn)) {
                        rn rnVar = (rn) n2Var2;
                        if (rnVar.c()) {
                            y4.M(giVar.getContext(), rnVar.a(), new d3.e(giVar, jK, i11), c6Var2);
                        } else {
                            yhVar = giVar.f28696u0;
                            zG1 = yhVar == giVar.f28650f0 ? giVar.G1(0, true, 0, giVar.s1(), jK) : giVar.G1(0, true, 0, giVar.s1(), jK);
                            yeVar = giVar.f28642d0;
                            if (yeVar != null) {
                                yeVar.h(!zG1);
                                giVar.f28642d0 = null;
                            }
                        }
                    } else {
                        yhVar = giVar.f28696u0;
                        if (yhVar == giVar.f28650f0 && yhVar != giVar.m0) {
                            if (!yhVar.I(0, true, 0, giVar.s1(), jK)) {
                                giVar.f28705w2 = true;
                                giVar.dismiss();
                            }
                            zG1 = false;
                        }
                        yeVar = giVar.f28642d0;
                        if (yeVar != null) {
                            yeVar.h(!zG1);
                            giVar.f28642d0 = null;
                        }
                    }
                    giVar.H1(false, false);
                } else {
                    AndroidUtilities.shakeView(giVar.f28689s);
                    AndroidUtilities.shakeView(giVar.v);
                    try {
                        rhVar.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && MessagesController.getInstance(i18).captionLengthLimitPremium > giVar.H) {
                        giVar.O1(n2Var);
                    }
                    ye yeVar3 = giVar.f28642d0;
                    if (yeVar3 != null) {
                        yeVar3.h(false);
                        giVar.f28642d0 = null;
                    }
                }
                break;
            case 22:
                gi giVar2 = (gi) this.f7089b;
                MessageObject messageObject = (MessageObject) this.f7090c;
                fb0 fb0Var2 = (fb0) this.d;
                giVar2.H1(!giVar2.Y, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z10 = giVar2.Y;
                message.invert_media = z10;
                fb0Var2.a(!z10, true);
                giVar2.f28642d0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar2.f28650f0;
                if (chatAttachAlertPhotoLayout != null && (fb0Var = chatAttachAlertPhotoLayout.Z0) != null) {
                    fb0Var.a(!giVar2.Y, true);
                }
                giVar2.f28642d0.n(!giVar2.Y);
                break;
            case 23:
                ar arVar = (ar) this.f7089b;
                Utilities.Callback callback = (Utilities.Callback) this.f7090c;
                lh.d dVar3 = (lh.d) this.d;
                callback.run(new we.d(new lp(dVar3, i11), new xq(i12, arVar, dVar3)));
                break;
            case 24:
                yq yqVar = (yq) this.f7089b;
                Context context3 = (Context) this.f7090c;
                v8 v8Var = (v8) this.d;
                yqVar.getClass();
                AndroidUtilities.addToClipboard(v8Var.f25814a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                }
                break;
            case 25:
                lt ltVar = (lt) this.f7089b;
                hh.o oVar3 = (hh.o) this.f7090c;
                cg.j jVar = (cg.j) this.d;
                try {
                    charSequenceCoerceToText = ((ClipboardManager) ltVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ltVar.getContext());
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (charSequenceCoerceToText != null) {
                    oVar3.setText(charSequenceCoerceToText);
                    oVar3.setSelection(0, oVar3.getText().length());
                }
                jVar.run();
                break;
            case 26:
                tt ttVar = (tt) this.f7089b;
                zu0 zu0Var = (zu0) this.f7090c;
                c6 c6Var3 = (c6) this.d;
                ot otVar = ttVar.f32875a;
                ce ceVar = ttVar.f32876b;
                if (ceVar.isEnabled() && ceVar.getAlpha() >= 0.5f) {
                    p1 p1Var = ttVar.G;
                    if (p1Var == null || !p1Var.f23711f) {
                        if (ttVar.f32880n) {
                            otVar.hideActionMode();
                            b70 b70Var6 = new b70(zu0Var, c6Var3, ceVar, false, false, true);
                            b70Var6.X = AndroidUtilities.dp(280.0f);
                            otVar.extendActionMode(null, new ba0(b70Var6, new v2(otVar, i11), otVar.getOnPremiumMenuLockClickListener()));
                            b70Var6.U = true;
                            b70Var6.Z();
                        } else if (!ttVar.f32878e) {
                            ttVar.x(1);
                            boolean zIsFocused = otVar.isFocused();
                            ttVar.d.F(otVar.length() > 0, false);
                            otVar.requestFocus();
                            if (!zIsFocused) {
                                otVar.setSelection(otVar.length());
                            }
                        } else {
                            if (ttVar.f32884x) {
                                ttVar.k(true);
                                ttVar.f32884x = false;
                                ttVar.p();
                            }
                            ttVar.v();
                        }
                    }
                    break;
                }
                break;
            case 27:
                b20 b20Var = (b20) this.f7089b;
                Context context4 = (Context) this.f7090c;
                n2 n2Var3 = (n2) this.d;
                b20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context4);
                alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new vu(b20Var, i10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                n2Var3.showDialog(alertDialog$Builder2.f22702a);
                break;
            case 28:
                i80 i80Var = (i80) this.f7089b;
                e3 e3Var4 = (e3) this.f7090c;
                n2 n2Var4 = (n2) this.d;
                try {
                    if (i80Var.f29270b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", i80Var.f29270b));
                        if (e3Var4 == null || e3Var4.getContainer() == null) {
                            mc.j(n2Var4).j();
                        } else {
                            new mc(e3Var4.getContainer(), null).k(false).j();
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            default:
                ab0 ab0Var = (ab0) this.f7089b;
                fb0 fb0Var3 = (fb0) this.f7090c;
                fb0 fb0Var4 = (fb0) this.d;
                gb0 gb0Var = ab0Var.V;
                MessagePreviewParams messagePreviewParams = gb0Var.d;
                boolean z11 = messagePreviewParams.hideCaption;
                boolean z12 = !z11;
                messagePreviewParams.hideCaption = z12;
                if (z11) {
                    if (gb0Var.f28589x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    gb0Var.f28589x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    gb0Var.f28589x = true;
                }
                fb0Var3.a(z12, true);
                fb0Var4.a(messagePreviewParams.hideForwardSendersName, true);
                ab0Var.h();
                ab0Var.k(true);
                break;
        }
    }

    public f(Object obj, Runnable runnable, Object obj2, int i10) {
        this.f7088a = i10;
        this.f7089b = obj;
        this.d = runnable;
        this.f7090c = obj2;
    }
}
