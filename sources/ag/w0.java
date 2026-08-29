package ag;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import jh.k7;
import jh.r5;
import lh.c3;
import lh.d3;
import lh.d4;
import nh.o7;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.z2;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a21;
import org.telegram.ui.bo0;
import org.telegram.ui.cg1;
import org.telegram.ui.fi1;
import org.telegram.ui.fm0;
import org.telegram.ui.fn;
import org.telegram.ui.fp;
import org.telegram.ui.gp;
import org.telegram.ui.hm0;
import org.telegram.ui.km;
import org.telegram.ui.r50;
import org.telegram.ui.rn;
import org.telegram.ui.s5;
import org.telegram.ui.tn;
import org.telegram.ui.v60;
import org.telegram.ui.vf;
import org.telegram.ui.vk0;
import org.telegram.ui.vm0;
import org.telegram.ui.xe0;
import org.telegram.ui.xg;
import org.telegram.ui.yo;
import th.m3;
public final class w0 implements Runnable {
    public final int f690a;
    public final boolean f691b;
    public final Object f692c;
    public final Object d;
    public final Object f693e;

    public w0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f690a = i10;
        this.f692c = obj;
        this.d = obj2;
        this.f693e = obj3;
        this.f691b = z10;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        boolean z10;
        int i12;
        Bitmap.CompressFormat compressFormat;
        String[] split;
        int i13;
        char c3;
        kf.a aVar;
        int i14;
        int i15;
        c6 c6Var;
        cg.h0 h0Var;
        int i16;
        int i17;
        boolean z11;
        byte[] bArr;
        byte[] bArr2;
        Boolean bool = null;
        r14 = null;
        byte[] bArr3 = null;
        r14 = null;
        String str = null;
        String str2 = null;
        boolean z12 = true;
        switch (this.f690a) {
            case 0:
                f1 f1Var = (f1) this.f692c;
                boolean z13 = this.f691b;
                f1Var.f473f.f(new c1(f1Var, (j2) this.d, 0));
                f1Var.f473f.f(new c1(f1Var, (j2) this.f693e, 0));
                f1Var.E = z13;
                return;
            case 1:
                tc tcVar = (tc) this.f692c;
                boolean z14 = this.f691b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                c6 c6Var2 = (c6) this.f693e;
                int i18 = R.raw.star_premium_2;
                if (z14) {
                    string = LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated);
                } else {
                    string = LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                }
                if (z14) {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = R.string.BoostingCheckStatistic;
                    } else {
                        i11 = R.string.BoostingCheckStatisticGroup;
                    }
                    string2 = LocaleController.getString(i11);
                } else {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = R.string.BoostingCheckGiftsStatistic;
                    } else {
                        i10 = R.string.BoostingCheckGiftsStatisticGroup;
                    }
                    string2 = LocaleController.getString(i10);
                }
                mc M = tcVar.M(string, AndroidUtilities.replaceSingleTag(string2, g6.Gi, 0, new eg.i(chat), c6Var2), i18);
                M.f30652j = 5000;
                M.j();
                return;
            case 2:
                k7 k7Var = (k7) this.f692c;
                TLObject tLObject = (TLObject) this.f693e;
                boolean z15 = this.f691b;
                ArrayList arrayList = k7Var.f12387l;
                int i19 = k7Var.f12378a;
                if (((int[]) this.d)[0] == k7Var.f12388m) {
                    k7Var.f12384i = false;
                    k7Var.f12388m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i19).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i19).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z15) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        k7Var.f12386k = tL_payments_savedStarGifts.next_offset;
                        k7Var.f12389n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        k7Var.h = bool;
                        if (arrayList.size() <= k7Var.f12389n && k7Var.f12386k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        k7Var.f12385j = z10;
                    } else {
                        k7Var.f12385j = true;
                    }
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(k7Var.f12379b), k7Var);
                    return;
                }
                return;
            case 3:
                d3 d3Var = (d3) this.f692c;
                kg.q0 q0Var = (kg.q0) this.f693e;
                boolean z16 = this.f691b;
                d4 d4Var = d3Var.f15467a;
                c5.a0(d4Var.f15545y2, 1, d4Var.f15540x1, new c3(d3Var, z16, q0Var, (View) this.d));
                return;
            case 4:
                nh.r1 r1Var = (nh.r1) this.f692c;
                TLObject tLObject2 = (TLObject) this.d;
                String str3 = (String) this.f693e;
                boolean z17 = this.f691b;
                nh.t1 t1Var = r1Var.f18505s;
                if (r1Var.f18504r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        nh.k2 k2Var = t1Var.f18584r;
                        ArrayList arrayList2 = t1Var.f18583n;
                        i12 = ((f3) k2Var).currentAccount;
                        MessagesStorage.getInstance(i12).saveBotCache(str3, messages_botresults);
                        r1Var.h = messages_botresults.next_offset;
                        if (z17) {
                            arrayList2.clear();
                        }
                        arrayList2.size();
                        arrayList2.addAll(messages_botresults.results);
                        r1Var.l();
                    }
                    t1Var.d.c(false);
                    r1Var.f18504r = false;
                    return;
                }
                return;
            case 5:
                o7 o7Var = (o7) this.f692c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z18 = this.f691b;
                Runnable runnable = (Runnable) this.f693e;
                o7Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(o7Var.Z0);
                    if (z18) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e10) {
                    FileLog.e((Throwable) e10, false);
                    if (z18) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(o7Var.Z0));
                        } catch (Exception e11) {
                            FileLog.e((Throwable) e11, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 6:
                ((CameraController) this.f692c).lambda$initCamera$3(this.f691b, (Exception) this.d, (Runnable) this.f693e);
                return;
            case 7:
                String[] strArr = (String[]) this.f692c;
                f6 f6Var = (f6) this.d;
                boolean z19 = this.f691b;
                org.telegram.ui.ActionBar.q qVar = (org.telegram.ui.ActionBar.q) this.f693e;
                try {
                    g6.f23111g0 = g6.ql.get(g6.f23116g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        g6.f23128h0 = strArr[0];
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String absolutePath = new File(filesDirFixed, Utilities.MD5(g6.f23128h0) + ".wp").getAbsolutePath();
                        try {
                            String str4 = f6Var.f22945c;
                            if (str4 != null && !str4.equals(absolutePath)) {
                                new File(f6Var.f22945c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        f6Var.f22945c = absolutePath;
                        Uri parse = Uri.parse(g6.f23128h0);
                        f6Var.f22948e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i20 = 0; i20 < split.length; i20++) {
                                if ("blur".equals(split[i20])) {
                                    f6Var.h = true;
                                } else if ("motion".equals(split[i20])) {
                                    f6Var.f22952n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        f6Var.f22956x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                f6Var.f22953r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    f6Var.f22954s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    f6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    f6Var.f22955w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                f6Var.f22956x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        try {
                            if (f6Var.f22945c != null) {
                                new File(f6Var.f22945c).delete();
                            }
                        } catch (Exception unused4) {
                        }
                        f6Var.f22945c = null;
                        g6.f23128h0 = null;
                    }
                    if (!z19 && g6.M == null) {
                        g6.K = f6Var;
                        if (g6.I != g6.J) {
                            z12 = false;
                        }
                        if (z12) {
                            g6.T = 2000;
                            g6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new o0(23), 2100L);
                        }
                    }
                    g6.I = f6Var;
                    g6.n1(false, false);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (g6.M == null && !g6.Q) {
                    MessagesController.getInstance(f6Var.A).saveTheme(f6Var, f6Var.k(false), z19, false);
                }
                qVar.run();
                return;
            case 8:
                tn.U((tn) this.f692c, (String) this.d, (MessageObject) this.f693e, this.f691b);
                return;
            case 9:
                fn fnVar = (fn) this.f692c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z20 = this.f691b;
                MessageObject messageObject = (MessageObject) this.f693e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i21 = R.string.SuggestedMessageAcceptInfo;
                tn tnVar = fnVar.f38212a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, tnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                kf.a m10 = kf.a.m(message.suggested_post.price);
                if (m10.f13633a == kf.b.f13636b) {
                    i13 = tnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i13 = tnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z20) {
                    c3 = 0;
                    m10 = kf.a.i((m10.f13634b / 1000) * i13, m10.f13633a);
                } else {
                    c3 = 0;
                }
                kf.a aVar2 = m10;
                if (message.suggested_post.schedule_date == 0) {
                    if (z20) {
                        int i22 = R.string.SuggestedMessageAcceptInfoAnytimeAdmin2;
                        String f9 = aVar2.f();
                        String G0 = ph.j.G0(i13);
                        Object[] objArr = new Object[2];
                        objArr[c3] = f9;
                        objArr[1] = G0;
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i22, objArr)));
                    } else {
                        int i23 = R.string.SuggestedMessageAcceptInfoAnytimeUser2;
                        Object[] objArr2 = new Object[1];
                        objArr2[c3] = aVar2.f();
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i23, objArr2)));
                    }
                    aVar = aVar2;
                } else if (z20) {
                    int i24 = R.string.SuggestedMessageAcceptInfoAdmin2;
                    String f10 = aVar2.f();
                    aVar = aVar2;
                    String o10 = jh.s0.o(message.suggested_post.schedule_date);
                    String G02 = ph.j.G0(i13);
                    Object[] objArr3 = new Object[3];
                    objArr3[c3] = f10;
                    objArr3[1] = o10;
                    objArr3[2] = G02;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i24, objArr3)));
                } else {
                    aVar = aVar2;
                    int i25 = R.string.SuggestedMessageAcceptInfoUser2;
                    String f11 = aVar.f();
                    String o11 = jh.s0.o(message.suggested_post.schedule_date);
                    Object[] objArr4 = new Object[2];
                    objArr4[c3] = f11;
                    objArr4[1] = o11;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i25, objArr4)));
                }
                spannableStringBuilder.append(' ');
                int i26 = R.string.SuggestedMessageAcceptInfo3;
                i14 = ((o2) tnVar).currentAccount;
                Object[] objArr5 = new Object[1];
                objArr5[c3] = Long.valueOf(MessagesController.getInstance(i14).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS));
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i26, objArr5)));
                mc[] mcVarArr = new mc[1];
                s5 s5Var = new s5(mcVarArr, 4);
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                String string3 = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i15 = R.string.Next;
                } else {
                    i15 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.c2 v02 = c5.v0(tnVar, string3, spannableStringBuilder, LocaleController.getString(i15), false, new eg.k0(fnVar, message, c2VarArr, messageObject, s5Var, 26));
                c2VarArr[c3] = v02;
                v02.setOnDismissListener(s5Var);
                if (z20 && aVar.f13633a == kf.b.f13635a) {
                    gb a2 = hb.a(tnVar.getParentActivity());
                    c6Var = ((o2) tnVar).resourceProvider;
                    mc G = new tc(a2, c6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f30652j = 60000;
                    G.k(true);
                    mcVarArr[c3] = G;
                    return;
                }
                return;
            case 10:
                rn rnVar = (rn) this.f692c;
                rnVar.j((b4) this.d, (TLRPC.WallPaper) this.f693e, this.f691b);
                rnVar.g(rnVar.f42157n);
                km kmVar = rnVar.R.T0;
                if (kmVar != null && (h0Var = kmVar.H) != null) {
                    h0Var.invalidate();
                    return;
                }
                return;
            case 11:
                yo yoVar = (yo) this.f692c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.f693e;
                boolean z21 = this.f691b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject3;
                    yoVar.f44927h0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = yoVar.U;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z21) {
                        if (yoVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yoVar.getParentActivity());
                            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            yoVar.showDialog(alertDialog$Builder.f22714a);
                        } else {
                            return;
                        }
                    }
                }
                r80 r80Var = yoVar.C;
                if (r80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = yoVar.f44927h0;
                    if (tL_chatInviteExported2 != null) {
                        str2 = tL_chatInviteExported2.link;
                    }
                    r80Var.setLink(str2);
                    yoVar.C.c(yoVar.f44927h0, yoVar.V);
                    return;
                }
                return;
            case 12:
                gp gpVar = (gp) this.f692c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z22 = this.f691b;
                chat2.join_to_send = z22;
                gpVar.f38646x.d.getMessagesController().toggleChatJoinToSend(chat2.f22392id, z22, new r5(gpVar, z22, chat2, 13), new vf(23, gpVar, (f80) this.f693e));
                return;
            case 13:
                gp gpVar2 = (gp) this.f692c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                boolean z23 = this.f691b;
                chat3.join_request = z23;
                gpVar2.f38646x.d.getMessagesController().toggleChatJoinRequest(chat3.f22392id, z23, new fp(gpVar2, 0), new vf(22, gpVar2, (e80) this.f693e));
                return;
            case 14:
                boolean z24 = this.f691b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.f692c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.f693e;
                if (z24 && ChatObject.isChannel(chat4)) {
                    View d = alertDialog$Builder2.f22714a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            if (ChatObject.isChannelAndNotMegaGroup(chat4)) {
                                i16 = R.string.ChannelDelete;
                            } else {
                                i16 = R.string.DeleteMega;
                            }
                            textView.setText(LocaleController.getString(i16));
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
                ik ikVar = (ik) this.f692c;
                boolean z25 = this.f691b;
                ArrayList arrayList3 = (ArrayList) this.f693e;
                ikVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new z2(18, ikVar, new ArrayList()));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                    str = translitString;
                }
                if (str != null) {
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                int i27 = i17 + 1;
                String[] strArr2 = new String[i27];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList4 = new ArrayList();
                if (!z25) {
                    for (int i28 = 0; i28 < arrayList3.size(); i28++) {
                        ck ckVar = (ck) arrayList3.get(i28);
                        File file = ckVar.f27500f;
                        if (file != null && !file.isDirectory()) {
                            int i29 = 0;
                            while (true) {
                                if (i29 < i27) {
                                    String str5 = strArr2[i29];
                                    String str6 = ckVar.f27497b;
                                    if (str6 != null) {
                                        z11 = str6.toLowerCase().contains(str5);
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList4.add(ckVar);
                                    } else {
                                        i29++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new z2(18, ikVar, arrayList4));
                return;
            case 16:
                c80.t((c80) this.f692c, (TLRPC.TL_error) this.d, this.f691b, (TLRPC.TL_messages_importChatInvite) this.f693e);
                return;
            case 17:
                TLObject tLObject4 = (TLObject) this.d;
                boolean z26 = this.f691b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f693e;
                nx0 nx0Var = ((cx0) this.f692c).f27583a;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z26) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject4, 0, null, false, false);
                    } else {
                        nx0Var.O = tL_messages_stickerSet;
                        nx0Var.t0();
                        nx0Var.B0();
                    }
                }
                c2Var.dismiss();
                return;
            case 18:
                f3 f3Var = (f3) this.f692c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z27 = this.f691b;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.f693e;
                if (f3Var != null && !f3Var.isDismissed()) {
                    f3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z27) {
                        AndroidUtilities.runOnUIThread(new xg(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (c2Var2 != null && c2Var2.isShowing()) {
                    c2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z27) {
                        AndroidUtilities.runOnUIThread(new xg(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                r50 r50Var = (r50) this.f692c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.f693e;
                boolean z28 = this.f691b;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        r50Var.u1(null, tL_chatInviteExported3.link, true, z28);
                        return;
                    }
                }
                return;
            case 20:
                v60 v60Var = (v60) this.f692c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f693e;
                boolean z29 = this.f691b;
                if (tL_error2 == null) {
                    v60Var.f43443f = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (z29) {
                        if (v60Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(v60Var.getParentActivity());
                            alertDialog$Builder3.f22714a.P = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f22714a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            v60Var.showDialog(alertDialog$Builder3.f22714a);
                        } else {
                            return;
                        }
                    }
                }
                v60Var.f43442e = false;
                v60Var.f43439a.l();
                return;
            case 21:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.f693e;
                boolean z30 = this.f691b;
                vm0 vm0Var = ((hm0) this.f692c).f38964e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    vm0Var.F = password;
                    TwoStepVerificationActivity.m0(password);
                    vm0Var.B1(z30);
                    return;
                }
                return;
            case 22:
                hm0 hm0Var = (hm0) this.f692c;
                String str7 = (String) this.f693e;
                boolean z31 = this.f691b;
                vm0 vm0Var2 = hm0Var.f38964e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    vm0Var2.Y0 = tL_secureSecretSettings.secure_secret;
                    vm0Var2.X0 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        vm0Var2.f43624a1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str7), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        vm0Var2.f43624a1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        AndroidUtilities.runOnUIThread(new w0(hm0Var, passwordsettings, z31, bArr2, 23));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new vk0(hm0Var, 4));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = vm0Var2.F.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        vm0Var2.f43624a1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    vm0Var2.Y0 = null;
                    vm0Var2.X0 = 0L;
                }
                bArr2 = bArr;
                AndroidUtilities.runOnUIThread(new w0(hm0Var, passwordsettings, z31, bArr2, 23));
                return;
            case 23:
                hm0 hm0Var2 = (hm0) this.f692c;
                boolean z32 = this.f691b;
                byte[] bArr6 = (byte[]) this.f693e;
                vm0 vm0Var3 = hm0Var2.f38964e;
                vm0Var3.Z0 = ((TL_account.passwordSettings) this.d).email;
                if (z32) {
                    vm0Var3.f43624a1 = vm0Var3.L0;
                }
                byte[] bArr7 = vm0Var3.Y0;
                byte[] bArr8 = vm0Var3.f43624a1;
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
                if (vm0.Z0(bArr3, Long.valueOf(vm0Var3.X0)) && bArr6.length != 0 && vm0Var3.X0 != 0) {
                    if (vm0Var3.f43628c == 0) {
                        ConnectionsManager.getInstance(vm0.t0(vm0Var3)).sendRequest(new TL_account.getAllSecureValues(), new fm0(hm0Var2, 0));
                        return;
                    } else {
                        hm0Var2.a();
                        return;
                    }
                } else if (z32) {
                    UserConfig.getInstance(vm0.s0(vm0Var3)).resetSavedPassword();
                    vm0Var3.J0 = 0;
                    vm0Var3.R1();
                    return;
                } else {
                    TL_account.authorizationForm authorizationform = vm0Var3.f43678y;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        vm0Var3.f43678y.errors.clear();
                    }
                    byte[] bArr12 = vm0Var3.Y0;
                    if (bArr12 != null && bArr12.length != 0) {
                        hm0Var2.b();
                        return;
                    } else {
                        Utilities.globalQueue.postRunnable(new xe0(hm0Var2, hm0Var2.f38962b, hm0Var2.d, 12));
                        return;
                    }
                }
            case 24:
                bo0 bo0Var = (bo0) this.f692c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.f693e;
                boolean z33 = this.f691b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject8;
                    bo0Var.W = password2;
                    TwoStepVerificationActivity.m0(password2);
                    bo0Var.A0(z33);
                    return;
                }
                return;
            case 25:
                a21.W((a21) this.f692c, this.f691b, (b4) this.d, (a5) this.f693e);
                return;
            case 26:
                cg1.c0((cg1) this.f692c, (TLRPC.TL_error) this.d, (TLObject) this.f693e, this.f691b);
                return;
            case 27:
                rf.a0 a0Var = (rf.a0) this.f692c;
                boolean z34 = this.f691b;
                s3 s3Var = (s3) this.d;
                rf.x xVar = (rf.x) this.f693e;
                if (!z34) {
                    a0Var.f47140c = xVar;
                    s3Var.setRightText(a0Var.H(xVar));
                    s3Var.setRightTextMargin(6);
                    a0Var.E.clear();
                    a0Var.d = true;
                    a0Var.l();
                    a0Var.Q();
                    return;
                }
                return;
            default:
                o2 o2Var = (o2) this.d;
                boolean z35 = this.f691b;
                m3 m3Var = (m3) this.f693e;
                String trim = ((EditTextBoldCursor) this.f692c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    th.b4.k(o2Var, z35, new fi1(12, m3Var, trim));
                    return;
                }
                return;
        }
    }

    public w0(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f690a = i10;
        this.f692c = obj;
        this.d = obj2;
        this.f691b = z10;
        this.f693e = obj3;
    }

    public w0(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f690a = i10;
        this.f692c = obj;
        this.f691b = z10;
        this.d = obj2;
        this.f693e = obj3;
    }

    public w0(d3 d3Var, View view, kg.q0 q0Var, boolean z10, boolean z11) {
        this.f690a = 3;
        this.f692c = d3Var;
        this.d = view;
        this.f693e = q0Var;
        this.f691b = z10;
    }

    public w0(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f690a = 14;
        this.f691b = z10;
        this.f692c = chat;
        this.d = alertDialog$Builder;
        this.f693e = zArr;
    }
}
