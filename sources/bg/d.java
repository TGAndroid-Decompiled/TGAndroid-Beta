package bg;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import gh.n7;
import gh.u5;
import ih.i4;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kh.a8;
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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.b4;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.zj;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.cn;
import org.telegram.ui.co0;
import org.telegram.ui.cp;
import org.telegram.ui.dp;
import org.telegram.ui.ei1;
import org.telegram.ui.hm0;
import org.telegram.ui.im;
import org.telegram.ui.jm0;
import org.telegram.ui.o50;
import org.telegram.ui.on;
import org.telegram.ui.qn;
import org.telegram.ui.r5;
import org.telegram.ui.rd;
import org.telegram.ui.t60;
import org.telegram.ui.vo;
import org.telegram.ui.wm0;
import org.telegram.ui.wq;
import org.telegram.ui.ye0;
import org.telegram.ui.yg;
import org.telegram.ui.z11;
import org.telegram.ui.zk0;
import qh.a4;
import qh.l3;
public final class d implements Runnable {
    public final int f1723a;
    public final boolean f1724b;
    public final Object f1725c;
    public final Object d;
    public final Object f1726e;

    public d(ih.f3 f3Var, View view, hg.r0 r0Var, boolean z10, boolean z11) {
        this.f1723a = 2;
        this.f1725c = f3Var;
        this.d = view;
        this.f1726e = r0Var;
        this.f1724b = z10;
    }

    @Override
    public final void run() {
        String string;
        int i9;
        String string2;
        int i10;
        boolean z10;
        int i11;
        Bitmap.CompressFormat compressFormat;
        String[] split;
        int i12;
        int i13;
        int i14;
        b6 b6Var;
        fh.l2 l2Var;
        int i15;
        int i16;
        boolean z11;
        byte[] bArr;
        byte[] bArr2;
        Boolean bool = null;
        r13 = null;
        byte[] bArr3 = null;
        r13 = null;
        String str = null;
        String str2 = null;
        boolean z12 = true;
        switch (this.f1723a) {
            case 0:
                oc ocVar = (oc) this.f1725c;
                boolean z13 = this.f1724b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                b6 b6Var2 = (b6) this.f1726e;
                int i17 = R.raw.star_premium_2;
                if (z13) {
                    string = LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated);
                } else {
                    string = LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                }
                if (z13) {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = R.string.BoostingCheckStatistic;
                    } else {
                        i10 = R.string.BoostingCheckStatisticGroup;
                    }
                    string2 = LocaleController.getString(i10);
                } else {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i9 = R.string.BoostingCheckGiftsStatistic;
                    } else {
                        i9 = R.string.BoostingCheckGiftsStatisticGroup;
                    }
                    string2 = LocaleController.getString(i9);
                }
                gc M = ocVar.M(string, AndroidUtilities.replaceSingleTag(string2, f6.Gi, 0, new l(chat), b6Var2), i17);
                M.f28737j = 5000;
                M.j();
                return;
            case 1:
                n7 n7Var = (n7) this.f1725c;
                TLObject tLObject = (TLObject) this.f1726e;
                boolean z14 = this.f1724b;
                ArrayList arrayList = n7Var.f8625l;
                int i18 = n7Var.f8616a;
                if (((int[]) this.d)[0] == n7Var.f8626m) {
                    n7Var.f8622i = false;
                    n7Var.f8626m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i18).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i18).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z14) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        n7Var.f8624k = tL_payments_savedStarGifts.next_offset;
                        n7Var.f8627n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        n7Var.h = bool;
                        if (arrayList.size() <= n7Var.f8627n && n7Var.f8624k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f8623j = z10;
                    } else {
                        n7Var.f8623j = true;
                    }
                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(n7Var.f8617b), n7Var);
                    return;
                }
                return;
            case 2:
                ih.f3 f3Var = (ih.f3) this.f1725c;
                hg.r0 r0Var = (hg.r0) this.f1726e;
                boolean z15 = this.f1724b;
                i4 i4Var = f3Var.f11412a;
                y4.a0(i4Var.f11609y2, 1, i4Var.f11604x1, new ih.e3(f3Var, z15, r0Var, (View) this.d));
                return;
            case 3:
                kh.u1 u1Var = (kh.u1) this.f1725c;
                TLObject tLObject2 = (TLObject) this.d;
                String str3 = (String) this.f1726e;
                boolean z16 = this.f1724b;
                kh.w1 w1Var = u1Var.f16135s;
                if (u1Var.f16134r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        kh.n2 n2Var = w1Var.f16233r;
                        ArrayList arrayList2 = w1Var.f16232n;
                        i11 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                        MessagesStorage.getInstance(i11).saveBotCache(str3, messages_botresults);
                        u1Var.h = messages_botresults.next_offset;
                        if (z16) {
                            arrayList2.clear();
                        }
                        arrayList2.size();
                        arrayList2.addAll(messages_botresults.results);
                        u1Var.l();
                    }
                    w1Var.d.c(false);
                    u1Var.f16134r = false;
                    return;
                }
                return;
            case 4:
                a8 a8Var = (a8) this.f1725c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z17 = this.f1724b;
                Runnable runnable = (Runnable) this.f1726e;
                a8Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(a8Var.Z0);
                    if (z17) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e10) {
                    FileLog.e((Throwable) e10, false);
                    if (z17) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(a8Var.Z0));
                        } catch (Exception e11) {
                            FileLog.e((Throwable) e11, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 5:
                of.f0 f0Var = (of.f0) this.f1725c;
                boolean z18 = this.f1724b;
                v3 v3Var = (v3) this.d;
                of.c0 c0Var = (of.c0) this.f1726e;
                if (!z18) {
                    f0Var.f19288c = c0Var;
                    v3Var.setRightText(f0Var.H(c0Var));
                    v3Var.setRightTextMargin(6);
                    f0Var.E.clear();
                    f0Var.d = true;
                    f0Var.l();
                    f0Var.Q();
                    return;
                }
                return;
            case 6:
                ((CameraController) this.f1725c).lambda$initCamera$3(this.f1724b, (Exception) this.d, (Runnable) this.f1726e);
                return;
            case 7:
                String[] strArr = (String[]) this.f1725c;
                e6 e6Var = (e6) this.d;
                boolean z19 = this.f1724b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.f1726e;
                try {
                    f6.f23049g0 = f6.ql.get(f6.f23054g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        f6.f23067h0 = strArr[0];
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String absolutePath = new File(filesDirFixed, Utilities.MD5(f6.f23067h0) + ".wp").getAbsolutePath();
                        try {
                            String str4 = e6Var.f22910c;
                            if (str4 != null && !str4.equals(absolutePath)) {
                                new File(e6Var.f22910c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        e6Var.f22910c = absolutePath;
                        Uri parse = Uri.parse(f6.f23067h0);
                        e6Var.f22913e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i19 = 0; i19 < split.length; i19++) {
                                if ("blur".equals(split[i19])) {
                                    e6Var.h = true;
                                } else if ("motion".equals(split[i19])) {
                                    e6Var.f22917n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        e6Var.f22921x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                e6Var.f22918r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    e6Var.f22919s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    e6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    e6Var.f22920w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                e6Var.f22921x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        try {
                            if (e6Var.f22910c != null) {
                                new File(e6Var.f22910c).delete();
                            }
                        } catch (Exception unused4) {
                        }
                        e6Var.f22910c = null;
                        f6.f23067h0 = null;
                    }
                    if (!z19 && f6.M == null) {
                        f6.K = e6Var;
                        if (f6.I != f6.J) {
                            z12 = false;
                        }
                        if (z12) {
                            f6.T = 2000;
                            f6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new d2(21), 2100L);
                        }
                    }
                    f6.I = e6Var;
                    f6.n1(false, false);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (f6.M == null && !f6.Q) {
                    MessagesController.getInstance(e6Var.A).saveTheme(e6Var, e6Var.k(false), z19, false);
                }
                pVar.run();
                return;
            case 8:
                qn.T((qn) this.f1725c, (String) this.d, (MessageObject) this.f1726e, this.f1724b);
                return;
            case 9:
                cn cnVar = (cn) this.f1725c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z20 = this.f1724b;
                MessageObject messageObject = (MessageObject) this.f1726e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i20 = R.string.SuggestedMessageAcceptInfo;
                qn qnVar = cnVar.f37236a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, qnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                gf.a m10 = gf.a.m(message.suggested_post.price);
                if (m10.f7747a == gf.b.f7750b) {
                    i12 = qnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i12 = qnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z20) {
                    m10 = gf.a.i((m10.f7748b / 1000) * i12, m10.f7747a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z20) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), mh.l.F0(i12))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z20) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), gh.t0.o(message.suggested_post.schedule_date), mh.l.F0(i12))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), gh.t0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i21 = R.string.SuggestedMessageAcceptInfo3;
                i13 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, Long.valueOf(MessagesController.getInstance(i13).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                gc[] gcVarArr = new gc[1];
                r5 r5Var = new r5(gcVarArr, 4);
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                String string3 = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i14 = R.string.Next;
                } else {
                    i14 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.c2 v02 = y4.v0(qnVar, string3, spannableStringBuilder, LocaleController.getString(i14), false, new o0(cnVar, message, c2VarArr, messageObject, r5Var, 27));
                c2VarArr[0] = v02;
                v02.setOnDismissListener(r5Var);
                if (z20 && m10.f7747a == gf.b.f7749a) {
                    bb a2 = cb.a(qnVar.getParentActivity());
                    b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
                    gc G = new oc(a2, b6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f28737j = 60000;
                    G.k(true);
                    gcVarArr[0] = G;
                    return;
                }
                return;
            case 10:
                on onVar = (on) this.f1725c;
                onVar.j((b4) this.d, (TLRPC.WallPaper) this.f1726e, this.f1724b);
                onVar.g(onVar.f41206n);
                im imVar = onVar.R.T0;
                if (imVar != null && (l2Var = imVar.H) != null) {
                    l2Var.invalidate();
                    return;
                }
                return;
            case 11:
                vo voVar = (vo) this.f1725c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.f1726e;
                boolean z21 = this.f1724b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject3;
                    voVar.f43536h0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = voVar.U;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z21) {
                        if (voVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(voVar.getParentActivity());
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            voVar.showDialog(alertDialog$Builder.f22702a);
                        } else {
                            return;
                        }
                    }
                }
                e80 e80Var = voVar.C;
                if (e80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = voVar.f43536h0;
                    if (tL_chatInviteExported2 != null) {
                        str2 = tL_chatInviteExported2.link;
                    }
                    e80Var.setLink(str2);
                    voVar.C.c(voVar.f43536h0, voVar.V);
                    return;
                }
                return;
            case 12:
                dp dpVar = (dp) this.f1725c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z22 = this.f1724b;
                chat2.join_to_send = z22;
                dpVar.f37576x.d.getMessagesController().toggleChatJoinToSend(chat2.f22380id, z22, new u5(dpVar, z22, chat2, 13), new rd(26, dpVar, (s70) this.f1726e));
                return;
            case 13:
                dp dpVar2 = (dp) this.f1725c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                boolean z23 = this.f1724b;
                chat3.join_request = z23;
                dpVar2.f37576x.d.getMessagesController().toggleChatJoinRequest(chat3.f22380id, z23, new cp(dpVar2, 0), new rd(25, dpVar2, (r70) this.f1726e));
                return;
            case 14:
                boolean z24 = this.f1724b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.f1725c;
                boolean[] zArr = (boolean[]) this.f1726e;
                if (z24 && ChatObject.isChannel(chat4)) {
                    View d = alertDialog$Builder2.f22702a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            if (ChatObject.isChannelAndNotMegaGroup(chat4)) {
                                i15 = R.string.ChannelDelete;
                            } else {
                                i15 = R.string.DeleteMega;
                            }
                            textView.setText(LocaleController.getString(i15));
                            return;
                        } else if (chat4.monoforum) {
                            textView.setText(LocaleController.getString(R.string.LeaveConversationMenu));
                            return;
                        } else if (chat4.megagroup) {
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
            case 15:
                ek ekVar = (ek) this.f1725c;
                boolean z25 = this.f1724b;
                ArrayList arrayList3 = (ArrayList) this.f1726e;
                ekVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new wq(21, ekVar, new ArrayList()));
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
                int i22 = i16 + 1;
                String[] strArr2 = new String[i22];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList4 = new ArrayList();
                if (!z25) {
                    for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                        zj zjVar = (zj) arrayList3.get(i23);
                        File file = zjVar.f35321f;
                        if (file != null && !file.isDirectory()) {
                            int i24 = 0;
                            while (true) {
                                if (i24 < i22) {
                                    String str5 = strArr2[i24];
                                    String str6 = zjVar.f35318b;
                                    if (str6 != null) {
                                        z11 = str6.toLowerCase().contains(str5);
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList4.add(zjVar);
                                    } else {
                                        i24++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new wq(21, ekVar, arrayList4));
                return;
            case 16:
                p70.t((p70) this.f1725c, (TLRPC.TL_error) this.d, this.f1724b, (TLRPC.TL_messages_importChatInvite) this.f1726e);
                return;
            case 17:
                TLObject tLObject4 = (TLObject) this.d;
                boolean z26 = this.f1724b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f1726e;
                cx0 cx0Var = ((rw0) this.f1725c).f32296a;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z26) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject4, 0, null, false, false);
                    } else {
                        cx0Var.O = tL_messages_stickerSet;
                        cx0Var.s0();
                        cx0Var.A0();
                    }
                }
                c2Var.dismiss();
                return;
            case 18:
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f1725c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z27 = this.f1724b;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.f1726e;
                if (f3Var2 != null && !f3Var2.isDismissed()) {
                    f3Var2.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z27) {
                        AndroidUtilities.runOnUIThread(new yg(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (c2Var2 != null && c2Var2.isShowing()) {
                    c2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z27) {
                        AndroidUtilities.runOnUIThread(new yg(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                o50 o50Var = (o50) this.f1725c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.f1726e;
                boolean z28 = this.f1724b;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        o50Var.u1(null, tL_chatInviteExported3.link, true, z28);
                        return;
                    }
                }
                return;
            case 20:
                t60 t60Var = (t60) this.f1725c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f1726e;
                boolean z29 = this.f1724b;
                if (tL_error2 == null) {
                    t60Var.f42873f = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (z29) {
                        if (t60Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(t60Var.getParentActivity());
                            alertDialog$Builder3.f22702a.P = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            t60Var.showDialog(alertDialog$Builder3.f22702a);
                        } else {
                            return;
                        }
                    }
                }
                t60Var.f42872e = false;
                t60Var.f42869a.l();
                return;
            case 21:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.f1726e;
                boolean z30 = this.f1724b;
                wm0 wm0Var = ((jm0) this.f1725c).f39531e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    wm0Var.F = password;
                    TwoStepVerificationActivity.l0(password);
                    wm0Var.B1(z30);
                    return;
                }
                return;
            case 22:
                jm0 jm0Var = (jm0) this.f1725c;
                String str7 = (String) this.f1726e;
                boolean z31 = this.f1724b;
                wm0 wm0Var2 = jm0Var.f39531e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    wm0Var2.Y0 = tL_secureSecretSettings.secure_secret;
                    wm0Var2.X0 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        wm0Var2.f44150a1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str7), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        wm0Var2.f44150a1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        AndroidUtilities.runOnUIThread(new d(jm0Var, passwordsettings, z31, bArr2, 23));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new zk0(jm0Var, 4));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = wm0Var2.F.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        wm0Var2.f44150a1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    wm0Var2.Y0 = null;
                    wm0Var2.X0 = 0L;
                }
                bArr2 = bArr;
                AndroidUtilities.runOnUIThread(new d(jm0Var, passwordsettings, z31, bArr2, 23));
                return;
            case 23:
                jm0 jm0Var2 = (jm0) this.f1725c;
                boolean z32 = this.f1724b;
                byte[] bArr6 = (byte[]) this.f1726e;
                wm0 wm0Var3 = jm0Var2.f39531e;
                wm0Var3.Z0 = ((TL_account.passwordSettings) this.d).email;
                if (z32) {
                    wm0Var3.f44150a1 = wm0Var3.L0;
                }
                byte[] bArr7 = wm0Var3.Y0;
                byte[] bArr8 = wm0Var3.f44150a1;
                if (bArr7 != null && bArr7.length == 32) {
                    byte[] bArr9 = new byte[32];
                    System.arraycopy(bArr8, 0, bArr9, 0, 32);
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(bArr8, 32, bArr10, 0, 16);
                    byte[] bArr11 = new byte[32];
                    System.arraycopy(bArr7, 0, bArr11, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr11, bArr9, bArr10, 0, 32, 0, 0);
                    bArr3 = bArr11;
                }
                if (wm0.Z0(bArr3, Long.valueOf(wm0Var3.X0)) && bArr6.length != 0 && wm0Var3.X0 != 0) {
                    if (wm0Var3.f44154c == 0) {
                        ConnectionsManager.getInstance(wm0.s0(wm0Var3)).sendRequest(new TL_account.getAllSecureValues(), new hm0(jm0Var2, 0));
                        return;
                    } else {
                        jm0Var2.a();
                        return;
                    }
                } else if (z32) {
                    UserConfig.getInstance(wm0.r0(wm0Var3)).resetSavedPassword();
                    wm0Var3.J0 = 0;
                    wm0Var3.R1();
                    return;
                } else {
                    TL_account.authorizationForm authorizationform = wm0Var3.f44204y;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        wm0Var3.f44204y.errors.clear();
                    }
                    byte[] bArr12 = wm0Var3.Y0;
                    if (bArr12 != null && bArr12.length != 0) {
                        jm0Var2.b();
                        return;
                    } else {
                        Utilities.globalQueue.postRunnable(new ye0(jm0Var2, jm0Var2.f39529b, jm0Var2.d, 12));
                        return;
                    }
                }
            case 24:
                co0 co0Var = (co0) this.f1725c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.f1726e;
                boolean z33 = this.f1724b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject8;
                    co0Var.W = password2;
                    TwoStepVerificationActivity.l0(password2);
                    co0Var.z0(z33);
                    return;
                }
                return;
            case 25:
                z11.V((z11) this.f1725c, this.f1724b, (b4) this.d, (a5) this.f1726e);
                return;
            case 26:
                ag1.b0((ag1) this.f1725c, (TLRPC.TL_error) this.d, (TLObject) this.f1726e, this.f1724b);
                return;
            case 27:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                boolean z34 = this.f1724b;
                l3 l3Var = (l3) this.f1726e;
                String trim = ((EditTextBoldCursor) this.f1725c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    a4.k(o2Var, z34, new ei1(9, l3Var, trim));
                    return;
                }
                return;
            default:
                xf.q0 q0Var = (xf.q0) this.f1725c;
                boolean z35 = this.f1724b;
                q0Var.f49314f.f(new xf.n0(q0Var, (a6.a) this.d, 0));
                q0Var.f49314f.f(new xf.n0(q0Var, (a6.a) this.f1726e, 0));
                q0Var.E = z35;
                return;
        }
    }

    public d(Object obj, Object obj2, Object obj3, boolean z10, int i9) {
        this.f1723a = i9;
        this.f1725c = obj;
        this.d = obj2;
        this.f1726e = obj3;
        this.f1724b = z10;
    }

    public d(Object obj, Object obj2, boolean z10, Object obj3, int i9) {
        this.f1723a = i9;
        this.f1725c = obj;
        this.d = obj2;
        this.f1724b = z10;
        this.f1726e = obj3;
    }

    public d(Object obj, boolean z10, Object obj2, Object obj3, int i9) {
        this.f1723a = i9;
        this.f1725c = obj;
        this.f1724b = z10;
        this.d = obj2;
        this.f1726e = obj3;
    }

    public d(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f1723a = 14;
        this.f1724b = z10;
        this.d = chat;
        this.f1725c = alertDialog$Builder;
        this.f1726e = zArr;
    }
}
