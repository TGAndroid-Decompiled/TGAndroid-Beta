package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.md;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.zc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn0;
import org.telegram.ui.bo;
import org.telegram.ui.eo;
import org.telegram.ui.g31;
import org.telegram.ui.i60;
import org.telegram.ui.kh1;
import org.telegram.ui.lp;
import org.telegram.ui.n70;
import org.telegram.ui.nh;
import org.telegram.ui.oh;
import org.telegram.ui.pf0;
import org.telegram.ui.pn;
import org.telegram.ui.pn0;
import org.telegram.ui.sp;
import org.telegram.ui.tp;
import org.telegram.ui.uk0;
import org.telegram.ui.wm;
import org.telegram.ui.xo0;
import org.telegram.ui.zm0;
public final class t4 implements Runnable {
    public final int f1727a;
    public final boolean f1728b;
    public final Object f1729c;
    public final Object d;
    public final Object f1730e;

    public t4(v4 v4Var, View view, zg.n0 n0Var, boolean z10, boolean z11) {
        this.f1727a = 0;
        this.f1729c = v4Var;
        this.d = view;
        this.f1730e = n0Var;
        this.f1728b = z10;
    }

    private final void a() {
        byte[] bArr;
        bn0 bn0Var = (bn0) this.f1729c;
        boolean z10 = this.f1728b;
        byte[] bArr2 = (byte[]) this.f1730e;
        pn0 pn0Var = bn0Var.f36215e;
        pn0Var.f41011d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            pn0Var.f41014e1 = pn0Var.P0;
        }
        byte[] bArr3 = pn0Var.f41009c1;
        byte[] bArr4 = pn0Var.f41014e1;
        if (bArr3 != null && bArr3.length == 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, 32);
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 32, bArr6, 0, 16);
            bArr = new byte[32];
            System.arraycopy(bArr3, 0, bArr, 0, 32);
            Utilities.aesCbcEncryptionByteArraySafe(bArr, bArr5, bArr6, 0, 32, 0, 0);
        } else {
            bArr = null;
        }
        if (pn0.Y0(bArr, Long.valueOf(pn0Var.f41006b1)) && bArr2.length != 0 && pn0Var.f41006b1 != 0) {
            if (pn0Var.f41007c == 0) {
                ConnectionsManager.getInstance(pn0.s0(pn0Var)).sendRequest(new TL_account.getAllSecureValues(), new zm0(bn0Var, 0));
                return;
            }
            bn0Var.a();
        } else if (z10) {
            UserConfig.getInstance(pn0.r0(pn0Var)).resetSavedPassword();
            pn0Var.N0 = 0;
            pn0Var.Q1();
        } else {
            TL_account.authorizationForm authorizationform = pn0Var.f41057y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                pn0Var.f41057y.errors.clear();
            }
            byte[] bArr7 = pn0Var.f41009c1;
            if (bArr7 != null && bArr7.length != 0) {
                bn0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new pf0(bn0Var, bn0Var.f36213b, bn0Var.d, 12));
            }
        }
    }

    @Override
    public final void run() {
        int i10;
        Bitmap.CompressFormat compressFormat;
        int i11;
        int[] iArr;
        String[] split;
        int i12;
        eo eoVar;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.c6 c6Var;
        ci.bb bbVar;
        int i15;
        int i16;
        boolean z10;
        byte[] bArr;
        String str = null;
        boolean z11 = true;
        switch (this.f1727a) {
            case 0:
                v4 v4Var = (v4) this.f1729c;
                zg.n0 n0Var = (zg.n0) this.f1730e;
                boolean z12 = this.f1728b;
                f6 f6Var = v4Var.f1822a;
                org.telegram.ui.Components.g5.Z(f6Var.C2, 1, f6Var.B1, new u4(v4Var, z12, n0Var, (View) this.d));
                return;
            case 1:
                ci.v1 v1Var = (ci.v1) this.f1729c;
                TLObject tLObject = (TLObject) this.d;
                String str2 = (String) this.f1730e;
                boolean z13 = this.f1728b;
                ci.y1 y1Var = v1Var.f6124s;
                if (v1Var.f6123r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        ci.r2 r2Var = y1Var.f6344r;
                        ArrayList arrayList = y1Var.f6343n;
                        i10 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str2, messages_botresults);
                        v1Var.h = messages_botresults.next_offset;
                        if (z13) {
                            arrayList.clear();
                        }
                        arrayList.size();
                        arrayList.addAll(messages_botresults.results);
                        v1Var.l();
                    }
                    y1Var.d.c(false);
                    v1Var.f6123r = false;
                    return;
                }
                return;
            case 2:
                ci.l8 l8Var = (ci.l8) this.f1729c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z14 = this.f1728b;
                Runnable runnable = (Runnable) this.f1730e;
                l8Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(l8Var.Z0);
                    if (z14) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e7) {
                    FileLog.e((Throwable) e7, false);
                    if (z14) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(l8Var.Z0));
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 3:
                gg.h0 h0Var = (gg.h0) this.f1729c;
                boolean z15 = this.f1728b;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) this.d;
                gg.e0 e0Var = (gg.e0) this.f1730e;
                if (!z15) {
                    h0Var.f10615c = e0Var;
                    v3Var.setRightText(h0Var.H(e0Var));
                    v3Var.setRightTextMargin(6);
                    h0Var.I.clear();
                    h0Var.d = true;
                    h0Var.l();
                    h0Var.Q();
                    return;
                }
                return;
            case 4:
                boolean z16 = this.f1728b;
                i2.f0 f0Var = (i2.f0) this.d;
                j2.k kVar = (j2.k) this.f1730e;
                j2.i o9 = j2.i.o((Context) this.f1729c);
                if (o9 == null) {
                    e2.a.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z16) {
                    j2.f fVar = f0Var.f11681s;
                    fVar.getClass();
                    fVar.f13691f.a(o9);
                }
                LogSessionId q6 = o9.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.f13721b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
                boolean z17 = this.f1728b;
                ii.u3 u3Var = (ii.u3) this.f1730e;
                String trim = ((EditTextBoldCursor) this.f1729c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ii.k4.k(m2Var, z17, new ah.b(18, u3Var, trim));
                    return;
                }
                return;
            case 6:
                m4.c0 c0Var = (m4.c0) this.f1729c;
                boolean z18 = this.f1728b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.f1730e;
                m4.c1 c1Var = c0Var.f15737g;
                if (z18) {
                    m4.i1 i1Var = new m4.i1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v x10 = c1Var.f15756b.x(rVar);
                        if (x10 != null) {
                            i11 = x10.b(m4.c0.B).f15856n;
                        } else if (!c0Var.h(rVar)) {
                            v7.j8.b(new m4.m1(-100));
                        } else {
                            v7.j8.b(new m4.m1(0));
                            i11 = 0;
                        }
                        m4.q qVar = rVar.d;
                        if (qVar != null) {
                            qVar.d(i11, i1Var);
                        }
                    } catch (DeadObjectException unused) {
                        c1Var.f15756b.M(rVar);
                        v7.j8.b(new m4.m1(-100));
                    } catch (RemoteException e11) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e11);
                        v7.j8.b(new m4.m1(-1));
                    }
                }
                runnable2.run();
                c1Var.f15756b.n(rVar);
                return;
            case 7:
                boolean z19 = this.f1728b;
                m4.r rVar2 = (m4.r) this.f1730e;
                m4.c0 c0Var2 = ((m4.m0) ((androidx.activity.n) this.f1729c).d).f15906g;
                m4.g1 g1Var = c0Var2.f15749t;
                w7.r.b(g1Var, (m4.s) this.d);
                int d = g1Var.d();
                if (d == 1) {
                    if (g1Var.n0(2)) {
                        g1Var.b();
                    }
                } else if (d == 4 && g1Var.n0(4)) {
                    g1Var.H();
                }
                if (z19 && g1Var.n0(1)) {
                    g1Var.i();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i17 : new int[]{31, 2}) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(i17, true);
                }
                if (z19) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(1, true);
                }
                e2.d.g(!false);
                c0Var2.p(rVar2);
                return;
            case 8:
                ((CameraController) this.f1729c).lambda$initCamera$3(this.f1728b, (Exception) this.d, (Runnable) this.f1730e);
                return;
            case 9:
                String[] strArr = (String[]) this.f1729c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                boolean z20 = this.f1728b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.f1730e;
                try {
                    org.telegram.ui.ActionBar.h6.f20610g0 = org.telegram.ui.ActionBar.h6.tl.get(org.telegram.ui.ActionBar.h6.f20615g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.h6.f20626h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.h6.f20626h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = g6Var.f20433c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(g6Var.f20433c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        g6Var.f20433c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.h6.f20626h0);
                        g6Var.f20436e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i18 = 0; i18 < split.length; i18++) {
                                if ("blur".equals(split[i18])) {
                                    g6Var.h = true;
                                } else if ("motion".equals(split[i18])) {
                                    g6Var.f20444n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        g6Var.f20448x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                g6Var.f20445r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    g6Var.f20446s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    g6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    g6Var.f20447w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                g6Var.f20448x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (g6Var.f20433c != null) {
                                new File(g6Var.f20433c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        g6Var.f20433c = null;
                        org.telegram.ui.ActionBar.h6.f20626h0 = null;
                    }
                    if (!z20 && org.telegram.ui.ActionBar.h6.M == null) {
                        org.telegram.ui.ActionBar.h6.K = g6Var;
                        if (org.telegram.ui.ActionBar.h6.I != org.telegram.ui.ActionBar.h6.J) {
                            z11 = false;
                        }
                        if (z11) {
                            org.telegram.ui.ActionBar.h6.T = 2000;
                            org.telegram.ui.ActionBar.h6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new f(16), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.h6.I = g6Var;
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (org.telegram.ui.ActionBar.h6.M == null && !org.telegram.ui.ActionBar.h6.Q) {
                    MessagesController.getInstance(g6Var.E).saveTheme(g6Var, g6Var.k(false), z20, false);
                }
                pVar.run();
                return;
            case 10:
                eo.v0((eo) this.f1729c, (String) this.d, (MessageObject) this.f1730e, this.f1728b);
                return;
            case 11:
                pn pnVar = (pn) this.f1729c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z21 = this.f1728b;
                MessageObject messageObject = (MessageObject) this.f1730e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i19 = R.string.SuggestedMessageAcceptInfo;
                eo eoVar2 = pnVar.f41000a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i19, eoVar2.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                if (m10.f54673a == zf.b.f54676b) {
                    i12 = eoVar2.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i12 = eoVar2.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z21) {
                    eoVar = eoVar2;
                    m10 = zf.a.i((m10.f54674b / 1000) * i12, m10.f54673a);
                } else {
                    eoVar = eoVar2;
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z21) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), ei.l.H0(i12))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z21) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), yh.c0.q(message.suggested_post.schedule_date), ei.l.H0(i12))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), yh.c0.q(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i20 = R.string.SuggestedMessageAcceptInfo3;
                i13 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, Long.valueOf(MessagesController.getInstance(i13).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.sc[] scVarArr = new org.telegram.ui.Components.sc[1];
                org.telegram.ui.u5 u5Var = new org.telegram.ui.u5(scVarArr, 4);
                org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                String string = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i14 = R.string.Next;
                } else {
                    i14 = R.string.SuggestedPostPublish;
                }
                eo eoVar3 = eoVar;
                org.telegram.ui.ActionBar.a2 u02 = org.telegram.ui.Components.g5.u0(eoVar3, string, spannableStringBuilder, LocaleController.getString(i14), false, new n3(pnVar, message, a2VarArr, messageObject, u5Var, 18));
                a2VarArr[0] = u02;
                u02.setOnDismissListener(u5Var);
                if (z21 && m10.f54673a == zf.b.f54675a) {
                    org.telegram.ui.Components.mb a2 = org.telegram.ui.Components.nb.a(eoVar3.getParentActivity());
                    c6Var = ((org.telegram.ui.ActionBar.m2) eoVar3).resourceProvider;
                    org.telegram.ui.Components.sc G = new zc(a2, c6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f30536j = 60000;
                    G.k(true);
                    scVarArr[0] = G;
                    return;
                }
                return;
            case 12:
                bo boVar = (bo) this.f1729c;
                boVar.j((org.telegram.ui.ActionBar.b4) this.d, (TLRPC.WallPaper) this.f1730e, this.f1728b);
                boVar.g(boVar.f36221n);
                wm wmVar = boVar.V.X0;
                if (wmVar != null && (bbVar = wmVar.L) != null) {
                    bbVar.invalidate();
                    return;
                }
                return;
            case 13:
                lp lpVar = (lp) this.f1729c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.f1730e;
                boolean z22 = this.f1728b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    lpVar.f39816l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = lpVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z22) {
                        if (lpVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lpVar.getParentActivity());
                            alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            lpVar.showDialog(alertDialog$Builder.f20142a);
                        } else {
                            return;
                        }
                    }
                }
                ba0 ba0Var = lpVar.G;
                if (ba0Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = lpVar.f39816l0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    ba0Var.setLink(str);
                    lpVar.G.c(lpVar.f39816l0, lpVar.Z);
                    return;
                }
                return;
            case 14:
                tp tpVar = (tp) this.f1729c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z23 = this.f1728b;
                chat.join_to_send = z23;
                tpVar.f42263x.d.getMessagesController().toggleChatJoinToSend(chat.f19803id, z23, new ci.x0(tpVar, z23, chat, 15), new nh(19, tpVar, (p90) this.f1730e));
                return;
            case 15:
                tp tpVar2 = (tp) this.f1729c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z24 = this.f1728b;
                chat2.join_request = z24;
                tpVar2.f42263x.d.getMessagesController().toggleChatJoinRequest(chat2.f19803id, z24, new sp(tpVar2, 0), new nh(18, tpVar2, (o90) this.f1730e));
                return;
            case 16:
                boolean z25 = this.f1728b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f1729c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.f1730e;
                if (z25 && ChatObject.isChannel(chat3)) {
                    View d10 = alertDialog$Builder2.f20142a.d(-1);
                    if (d10 instanceof TextView) {
                        TextView textView = (TextView) d10;
                        if (zArr[0]) {
                            if (ChatObject.isChannelAndNotMegaGroup(chat3)) {
                                i15 = R.string.ChannelDelete;
                            } else {
                                i15 = R.string.DeleteMega;
                            }
                            textView.setText(LocaleController.getString(i15));
                            return;
                        } else if (chat3.monoforum) {
                            textView.setText(LocaleController.getString(R.string.LeaveConversationMenu));
                            return;
                        } else if (chat3.megagroup) {
                            textView.setText(LocaleController.getString(R.string.LeaveMega));
                            return;
                        } else {
                            textView.setText(LocaleController.getString(R.string.LeaveChannel));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 17:
                tk tkVar = (tk) this.f1729c;
                boolean z26 = this.f1728b;
                ArrayList arrayList2 = (ArrayList) this.f1730e;
                tkVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new md(16, tkVar, new ArrayList()));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                    str = translitString;
                }
                if (str != null) {
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                int i21 = i16 + 1;
                String[] strArr2 = new String[i21];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList3 = new ArrayList();
                if (!z26) {
                    for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                        ok okVar = (ok) arrayList2.get(i22);
                        File file = okVar.f29231f;
                        if (file != null && !file.isDirectory()) {
                            int i23 = 0;
                            while (true) {
                                if (i23 < i21) {
                                    String str4 = strArr2[i23];
                                    String str5 = okVar.f29228b;
                                    if (str5 != null) {
                                        z10 = str5.toLowerCase().contains(str4);
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        arrayList3.add(okVar);
                                    } else {
                                        i23++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new md(16, tkVar, arrayList3));
                return;
            case 18:
                m90.v((m90) this.f1729c, (TLRPC.TL_error) this.d, this.f1728b, (TLRPC.TL_messages_importChatInvite) this.f1730e);
                return;
            case 19:
                TLObject tLObject3 = (TLObject) this.d;
                boolean z27 = this.f1728b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f1730e;
                dz0 dz0Var = ((sy0) this.f1729c).f30705a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z27) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        dz0Var.S = tL_messages_stickerSet;
                        dz0Var.u0();
                        dz0Var.C0();
                    }
                }
                a2Var.dismiss();
                return;
            case 20:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f1729c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z28 = this.f1728b;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.f1730e;
                if (e3Var != null && !e3Var.isDismissed()) {
                    e3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z28) {
                        AndroidUtilities.runOnUIThread(new oh(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (a2Var2 != null && a2Var2.isShowing()) {
                    a2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z28) {
                        AndroidUtilities.runOnUIThread(new oh(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 21:
                i60 i60Var = (i60) this.f1729c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.f1730e;
                boolean z29 = this.f1728b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        i60Var.v1(null, tL_chatInviteExported3.link, true, z29);
                        return;
                    }
                }
                return;
            case 22:
                n70 n70Var = (n70) this.f1729c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.f1730e;
                boolean z30 = this.f1728b;
                if (tL_error2 == null) {
                    n70Var.f40249f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z30) {
                        if (n70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(n70Var.getParentActivity());
                            alertDialog$Builder3.f20142a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f20142a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            n70Var.showDialog(alertDialog$Builder3.f20142a);
                        } else {
                            return;
                        }
                    }
                }
                n70Var.f40248e = false;
                n70Var.f40245a.l();
                return;
            case 23:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f1730e;
                boolean z31 = this.f1728b;
                pn0 pn0Var = ((bn0) this.f1729c).f36215e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    pn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    pn0Var.A1(z31);
                    return;
                }
                return;
            case 24:
                bn0 bn0Var = (bn0) this.f1729c;
                String str6 = (String) this.f1730e;
                boolean z32 = this.f1728b;
                pn0 pn0Var2 = bn0Var.f36215e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    pn0Var2.f41009c1 = tL_secureSecretSettings.secure_secret;
                    pn0Var2.f41006b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        pn0Var2.f41014e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str6), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        pn0Var2.f41014e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr = bArr2;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new uk0(bn0Var, 5));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = pn0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        pn0Var2.f41014e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    pn0Var2.f41009c1 = null;
                    pn0Var2.f41006b1 = 0L;
                }
                AndroidUtilities.runOnUIThread(new t4(bn0Var, passwordsettings, z32, bArr, 25));
                return;
            case 25:
                a();
                return;
            case 26:
                xo0 xo0Var = (xo0) this.f1729c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.f1730e;
                boolean z33 = this.f1728b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    xo0Var.f44091a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    xo0Var.A0(z33);
                    return;
                }
                return;
            case 27:
                g31.V((g31) this.f1729c, this.f1728b, (org.telegram.ui.ActionBar.b4) this.d, (org.telegram.ui.ActionBar.a5) this.f1730e);
                return;
            case 28:
                kh1.c0((kh1) this.f1729c, (TLRPC.TL_error) this.d, (TLObject) this.f1730e, this.f1728b);
                return;
            default:
                pg.r0 r0Var = (pg.r0) this.f1729c;
                boolean z34 = this.f1728b;
                r0Var.f45637f.f(new pg.p0(r0Var, (a5.a) this.d, 0));
                r0Var.f45637f.f(new pg.p0(r0Var, (a5.a) this.f1730e, 0));
                r0Var.E = z34;
                return;
        }
    }

    public t4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f1727a = i10;
        this.f1729c = obj;
        this.d = obj2;
        this.f1730e = obj3;
        this.f1728b = z10;
    }

    public t4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f1727a = i10;
        this.f1729c = obj;
        this.d = obj2;
        this.f1728b = z10;
        this.f1730e = obj3;
    }

    public t4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f1727a = i10;
        this.f1729c = obj;
        this.f1728b = z10;
        this.d = obj2;
        this.f1730e = obj3;
    }

    public t4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f1727a = 16;
        this.f1728b = z10;
        this.f1729c = chat;
        this.d = alertDialog$Builder;
        this.f1730e = zArr;
    }
}
