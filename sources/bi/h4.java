package bi;

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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.zc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ap0;
import org.telegram.ui.cn0;
import org.telegram.ui.co;
import org.telegram.ui.en0;
import org.telegram.ui.fo;
import org.telegram.ui.jd;
import org.telegram.ui.l31;
import org.telegram.ui.n60;
import org.telegram.ui.np;
import org.telegram.ui.oh;
import org.telegram.ui.oh1;
import org.telegram.ui.qn;
import org.telegram.ui.s70;
import org.telegram.ui.sn0;
import org.telegram.ui.tf0;
import org.telegram.ui.up;
import org.telegram.ui.vp;
import org.telegram.ui.wp;
import org.telegram.ui.xk0;
import org.telegram.ui.xm;
public final class h4 implements Runnable {
    public final int f3117a;
    public final boolean f3118b;
    public final Object f3119c;
    public final Object d;
    public final Object e;

    public h4(j4 j4Var, View view, ah.i1 i1Var, boolean z10, boolean z11) {
        this.f3117a = 0;
        this.f3119c = j4Var;
        this.d = view;
        this.e = i1Var;
        this.f3118b = z10;
    }

    private final void a() {
        byte[] bArr;
        en0 en0Var = (en0) this.f3119c;
        boolean z10 = this.f3118b;
        byte[] bArr2 = (byte[]) this.e;
        sn0 sn0Var = en0Var.e;
        sn0Var.f39864d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            sn0Var.f39866e1 = sn0Var.P0;
        }
        byte[] bArr3 = sn0Var.f39862c1;
        byte[] bArr4 = sn0Var.f39866e1;
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
        if (sn0.Y0(bArr, Long.valueOf(sn0Var.f39859b1)) && bArr2.length != 0 && sn0Var.f39859b1 != 0) {
            if (sn0Var.f39860c == 0) {
                ConnectionsManager.getInstance(sn0.s0(sn0Var)).sendRequest(new TL_account.getAllSecureValues(), new cn0(en0Var, 0));
                return;
            }
            en0Var.a();
        } else if (z10) {
            UserConfig.getInstance(sn0.r0(sn0Var)).resetSavedPassword();
            sn0Var.N0 = 0;
            sn0Var.Q1();
        } else {
            TL_account.authorizationForm authorizationform = sn0Var.f39909y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                sn0Var.f39909y.errors.clear();
            }
            byte[] bArr7 = sn0Var.f39862c1;
            if (bArr7 != null && bArr7.length != 0) {
                en0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new tf0(en0Var, en0Var.f35339b, en0Var.d, 12));
            }
        }
    }

    private final void b() {
        qg.q0 q0Var = (qg.q0) this.f3119c;
        q0Var.f43266f.f(new qg.o0(q0Var, (a5.a) this.d, 0));
        q0Var.f43266f.f(new qg.o0(q0Var, (a5.a) this.e, 0));
        q0Var.E = this.f3118b;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap.CompressFormat compressFormat;
        int i11;
        boolean z10;
        String[] split;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.c6 c6Var;
        di.ab abVar;
        int i15;
        int i16;
        boolean z11;
        byte[] bArr;
        ri.r0 r0Var;
        boolean z12;
        File file;
        int i17;
        String str = null;
        switch (this.f3117a) {
            case 0:
                j4 j4Var = (j4) this.f3119c;
                ah.i1 i1Var = (ah.i1) this.e;
                boolean z13 = this.f3118b;
                q5 q5Var = j4Var.f3206a;
                org.telegram.ui.Components.g5.Z(q5Var.C2, 1, q5Var.B1, new i4(j4Var, z13, i1Var, (View) this.d));
                return;
            case 1:
                di.v1 v1Var = (di.v1) this.f3119c;
                TLObject tLObject = (TLObject) this.d;
                String str2 = (String) this.e;
                boolean z14 = this.f3118b;
                di.y1 y1Var = v1Var.f7978s;
                if (v1Var.f7977r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        di.r2 r2Var = y1Var.f8125r;
                        ArrayList arrayList = y1Var.f8124n;
                        i10 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str2, messages_botresults);
                        v1Var.h = messages_botresults.next_offset;
                        if (z14) {
                            arrayList.clear();
                        }
                        arrayList.size();
                        arrayList.addAll(messages_botresults.results);
                        v1Var.l();
                    }
                    y1Var.d.c(false);
                    v1Var.f7977r = false;
                    return;
                }
                return;
            case 2:
                di.k8 k8Var = (di.k8) this.f3119c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z15 = this.f3118b;
                Runnable runnable = (Runnable) this.e;
                k8Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(k8Var.Z0);
                    if (z15) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                    if (z15) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(k8Var.Z0));
                        } catch (Exception e7) {
                            FileLog.e((Throwable) e7, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 3:
                hg.h0 h0Var = (hg.h0) this.f3119c;
                boolean z16 = this.f3118b;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) this.d;
                hg.e0 e0Var = (hg.e0) this.e;
                if (!z16) {
                    h0Var.f10570c = e0Var;
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
                boolean z17 = this.f3118b;
                i2.h0 h0Var2 = (i2.h0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o10 = j2.i.o((Context) this.f3119c);
                if (o10 == null) {
                    e2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z17) {
                    j2.f fVar = h0Var2.f11016s;
                    fVar.getClass();
                    fVar.f12532f.a(o10);
                }
                LogSessionId q6 = o10.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.f12560b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
                boolean z18 = this.f3118b;
                ji.u3 u3Var = (ji.u3) this.e;
                String trim = ((EditTextBoldCursor) this.f3119c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ji.l4.k(m2Var, z18, new ah.h0(22, u3Var, trim));
                    return;
                }
                return;
            case 6:
                m4.e0 e0Var2 = (m4.e0) this.f3119c;
                boolean z19 = this.f3118b;
                m4.v vVar = (m4.v) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.i1 i1Var2 = e0Var2.f15158g;
                if (z19) {
                    m4.o1 o1Var = new m4.o1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v q10 = i1Var2.f15205b.q(vVar);
                        if (q10 != null) {
                            i11 = q10.b(m4.e0.B).f15289n;
                        } else if (!e0Var2.h(vVar)) {
                            v7.q8.b(new m4.s1(-100));
                        } else {
                            v7.q8.b(new m4.s1(0));
                            i11 = 0;
                        }
                        m4.u uVar = vVar.d;
                        if (uVar != null) {
                            uVar.e(i11, o1Var);
                        }
                    } catch (DeadObjectException unused) {
                        i1Var2.f15205b.C(vVar);
                        v7.q8.b(new m4.s1(-100));
                    } catch (RemoteException e10) {
                        e2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        v7.q8.b(new m4.s1(-1));
                    }
                }
                runnable2.run();
                i1Var2.f15205b.j(vVar);
                return;
            case 7:
                ((CameraController) this.f3119c).lambda$initCamera$3(this.f3118b, (Exception) this.d, (Runnable) this.e);
                return;
            case 8:
                String[] strArr = (String[]) this.f3119c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                boolean z20 = this.f3118b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    org.telegram.ui.ActionBar.g6.f19648g0 = org.telegram.ui.ActionBar.g6.tl.get(org.telegram.ui.ActionBar.g6.f19653g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.g6.f19667h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.g6.f19667h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = f6Var.f19495c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(f6Var.f19495c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        f6Var.f19495c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.g6.f19667h0);
                        f6Var.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i18 = 0; i18 < split.length; i18++) {
                                if ("blur".equals(split[i18])) {
                                    f6Var.h = true;
                                } else if ("motion".equals(split[i18])) {
                                    f6Var.f19505n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        f6Var.f19509x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                f6Var.f19506r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    f6Var.f19507s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    f6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    f6Var.f19508w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                f6Var.f19509x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (f6Var.f19495c != null) {
                                new File(f6Var.f19495c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        f6Var.f19495c = null;
                        org.telegram.ui.ActionBar.g6.f19667h0 = null;
                    }
                    if (!z20 && org.telegram.ui.ActionBar.g6.M == null) {
                        org.telegram.ui.ActionBar.g6.K = f6Var;
                        if (org.telegram.ui.ActionBar.g6.I == org.telegram.ui.ActionBar.g6.J) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            org.telegram.ui.ActionBar.g6.T = 2000;
                            org.telegram.ui.ActionBar.g6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ah.j(17), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.g6.I = f6Var;
                    org.telegram.ui.ActionBar.g6.o1(false, false);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (org.telegram.ui.ActionBar.g6.M == null && !org.telegram.ui.ActionBar.g6.Q) {
                    MessagesController.getInstance(f6Var.E).saveTheme(f6Var, f6Var.k(false), z20, false);
                }
                pVar.run();
                return;
            case 9:
                fo.v0((fo) this.f3119c, (String) this.d, (MessageObject) this.e, this.f3118b);
                return;
            case 10:
                qn qnVar = (qn) this.f3119c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z21 = this.f3118b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i19 = R.string.SuggestedMessageAcceptInfo;
                fo foVar = qnVar.f39190a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i19, foVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                ag.a m10 = ag.a.m(message.suggested_post.price);
                if (m10.f631a == ag.b.f634b) {
                    i12 = foVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i12 = foVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z21) {
                    m10 = ag.a.i((m10.f632b / 1000) * i12, m10.f631a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z21) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), fi.l.H0(i12))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z21) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), zh.d0.q(message.suggested_post.schedule_date), fi.l.H0(i12))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), zh.d0.q(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i20 = R.string.SuggestedMessageAcceptInfo3;
                i13 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, Long.valueOf(MessagesController.getInstance(i13).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                sc[] scVarArr = new sc[1];
                org.telegram.ui.v5 v5Var = new org.telegram.ui.v5(scVarArr, 4);
                org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                String string = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i14 = R.string.Next;
                } else {
                    i14 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.a2 u02 = org.telegram.ui.Components.g5.u0(foVar, string, spannableStringBuilder, LocaleController.getString(i14), false, new c3(qnVar, message, a2VarArr, messageObject, v5Var, 18));
                a2VarArr[0] = u02;
                u02.setOnDismissListener(v5Var);
                if (z21 && m10.f631a == ag.b.f633a) {
                    org.telegram.ui.Components.mb a2 = org.telegram.ui.Components.nb.a(foVar.getParentActivity());
                    c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
                    sc G = new zc(a2, c6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f28805j = 60000;
                    G.k(true);
                    scVarArr[0] = G;
                    return;
                }
                return;
            case 11:
                co coVar = (co) this.f3119c;
                coVar.j((org.telegram.ui.ActionBar.b4) this.d, (TLRPC.WallPaper) this.e, this.f3118b);
                coVar.g(coVar.f34741n);
                xm xmVar = coVar.V.X0;
                if (xmVar != null && (abVar = xmVar.L) != null) {
                    abVar.invalidate();
                    return;
                }
                return;
            case 12:
                np npVar = (np) this.f3119c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z22 = this.f3118b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    npVar.f38447l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = npVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z22) {
                        if (npVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(npVar.getParentActivity());
                            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            npVar.showDialog(alertDialog$Builder.f19248a);
                        } else {
                            return;
                        }
                    }
                }
                w90 w90Var = npVar.G;
                if (w90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = npVar.f38447l0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    w90Var.setLink(str);
                    npVar.G.c(npVar.f38447l0, npVar.Z);
                    return;
                }
                return;
            case 13:
                wp wpVar = (wp) this.f3119c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z23 = this.f3118b;
                chat.join_to_send = z23;
                wpVar.f41335x.d.getMessagesController().toggleChatJoinToSend(chat.f18916id, z23, new di.x0(wpVar, z23, chat, 15), new jd(28, wpVar, (j90) this.e));
                return;
            case 14:
                wp wpVar2 = (wp) this.f3119c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z24 = this.f3118b;
                chat2.join_request = z24;
                wpVar2.f41335x.d.getMessagesController().toggleChatJoinRequest(chat2.f18916id, z24, new up(wpVar2, 0), new jd(27, wpVar2, (i90) this.e));
                return;
            case 15:
                boolean z25 = this.f3118b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f3119c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z25 && ChatObject.isChannel(chat3)) {
                    View d = alertDialog$Builder2.f19248a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
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
            case 16:
                ok okVar = (ok) this.f3119c;
                boolean z26 = this.f3118b;
                ArrayList arrayList2 = (ArrayList) this.e;
                okVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new vp(24, okVar, new ArrayList()));
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
                        jk jkVar = (jk) arrayList2.get(i22);
                        File file2 = jkVar.f26069f;
                        if (file2 != null && !file2.isDirectory()) {
                            int i23 = 0;
                            while (true) {
                                if (i23 < i21) {
                                    String str4 = strArr2[i23];
                                    String str5 = jkVar.f26067b;
                                    if (str5 != null) {
                                        z11 = str5.toLowerCase().contains(str4);
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList3.add(jkVar);
                                    } else {
                                        i23++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new vp(24, okVar, arrayList3));
                return;
            case 17:
                f90.v((f90) this.f3119c, (TLRPC.TL_error) this.d, this.f3118b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 18:
                TLObject tLObject3 = (TLObject) this.d;
                boolean z27 = this.f3118b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.e;
                uy0 uy0Var = ((jy0) this.f3119c).f26157a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z27) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        uy0Var.S = tL_messages_stickerSet;
                        uy0Var.u0();
                        uy0Var.C0();
                    }
                }
                a2Var.dismiss();
                return;
            case 19:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f3119c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z28 = this.f3118b;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.e;
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
            case 20:
                n60 n60Var = (n60) this.f3119c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z29 = this.f3118b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        n60Var.v1(null, tL_chatInviteExported3.link, true, z29);
                        return;
                    }
                }
                return;
            case 21:
                s70 s70Var = (s70) this.f3119c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z30 = this.f3118b;
                if (tL_error2 == null) {
                    s70Var.f39708f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z30) {
                        if (s70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(s70Var.getParentActivity());
                            alertDialog$Builder3.f19248a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f19248a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            s70Var.showDialog(alertDialog$Builder3.f19248a);
                        } else {
                            return;
                        }
                    }
                }
                s70Var.e = false;
                s70Var.f39705a.l();
                return;
            case 22:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z31 = this.f3118b;
                sn0 sn0Var = ((en0) this.f3119c).e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    sn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    sn0Var.A1(z31);
                    return;
                }
                return;
            case 23:
                en0 en0Var = (en0) this.f3119c;
                String str6 = (String) this.e;
                boolean z32 = this.f3118b;
                sn0 sn0Var2 = en0Var.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    sn0Var2.f39862c1 = tL_secureSecretSettings.secure_secret;
                    sn0Var2.f39859b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        sn0Var2.f39866e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str6), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        sn0Var2.f39866e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr = bArr2;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new xk0(en0Var, 5));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = sn0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        sn0Var2.f39866e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    sn0Var2.f39862c1 = null;
                    sn0Var2.f39859b1 = 0L;
                }
                AndroidUtilities.runOnUIThread(new h4(en0Var, passwordsettings, z32, bArr, 24));
                return;
            case 24:
                a();
                return;
            case 25:
                ap0 ap0Var = (ap0) this.f3119c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z33 = this.f3118b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    ap0Var.f34008a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    ap0Var.A0(z33);
                    return;
                }
                return;
            case 26:
                l31.V((l31) this.f3119c, this.f3118b, (org.telegram.ui.ActionBar.b4) this.d, (org.telegram.ui.ActionBar.a5) this.e);
                return;
            case 27:
                oh1.c0((oh1) this.f3119c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.f3118b);
                return;
            case 28:
                b();
                return;
            default:
                ri.r0 r0Var2 = (ri.r0) this.f3119c;
                ri.v vVar2 = (ri.v) this.d;
                boolean z34 = this.f3118b;
                ri.n0 n0Var = (ri.n0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    vVar2.g();
                    File file3 = vVar2.f44751a;
                    long e12 = w7.m7.e(file3) / 1000;
                    ri.n nVar = r0Var2.f44684m;
                    StringBuilder sb2 = new StringBuilder("active output finalized: size=");
                    sb2.append(file3.length());
                    sb2.append(", durationMs=");
                    sb2.append(e12);
                    sb2.append(", elapsedMs=");
                    sb2.append(ri.r0.f(nanoTime));
                    nVar.b(sb2.toString());
                    r0Var2.g();
                    long j10 = r0Var2.f44686o;
                    if (e12 > j10) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    try {
                        if (z34 && !z12) {
                            r0Var2.f44682k.execute(new ri.e0(r0Var2, n0Var, vVar2.f44751a, e12, true));
                            return;
                        }
                        File file4 = vVar2.f44751a;
                        try {
                            long min = Math.min(j10, e12);
                            if (z12) {
                                i17 = 1;
                            } else {
                                i17 = 2;
                            }
                            try {
                                r0Var2.s(file4, 0L, min, z34, i17);
                                w7.m7.c(file4);
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                file = file4;
                                w7.m7.c(file);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            file = file4;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        r0Var = sb2;
                        r0Var.f44680i.post(new ri.c0(r0Var, e, 2));
                        return;
                    }
                } catch (Exception e14) {
                    e = e14;
                    r0Var = r0Var2;
                }
        }
    }

    public h4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f3117a = i10;
        this.f3119c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f3118b = z10;
    }

    public h4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f3117a = i10;
        this.f3119c = obj;
        this.d = obj2;
        this.f3118b = z10;
        this.e = obj3;
    }

    public h4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f3117a = i10;
        this.f3119c = obj;
        this.f3118b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public h4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f3117a = 15;
        this.f3118b = z10;
        this.f3119c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
