package cg;

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
import lh.l7;
import lh.r5;
import nh.d3;
import nh.d4;
import nh.e3;
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
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e4;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c60;
import org.telegram.ui.ch;
import org.telegram.ui.dn0;
import org.telegram.ui.dp;
import org.telegram.ui.el0;
import org.telegram.ui.g70;
import org.telegram.ui.hf0;
import org.telegram.ui.hp;
import org.telegram.ui.jn;
import org.telegram.ui.jo0;
import org.telegram.ui.lp;
import org.telegram.ui.m21;
import org.telegram.ui.mp;
import org.telegram.ui.nm0;
import org.telegram.ui.og1;
import org.telegram.ui.pm;
import org.telegram.ui.pm0;
import org.telegram.ui.v5;
import org.telegram.ui.vn;
import org.telegram.ui.xn;
import ph.u6;
import vh.o3;
public final class u0 implements Runnable {
    public final int f2537a;
    public final boolean f2538b;
    public final Object f2539c;
    public final Object d;
    public final Object e;

    public u0(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.f2537a = i10;
        this.f2539c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2538b = z4;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        char c3;
        boolean z4;
        boolean z10;
        String[] split;
        int i12;
        char c10;
        char c11;
        int i13;
        int i14;
        f6 f6Var;
        eg.h0 h0Var;
        int i15;
        int i16;
        boolean z11;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i17;
        Bitmap.CompressFormat compressFormat;
        Boolean bool = null;
        r13 = null;
        byte[] bArr4 = null;
        r13 = null;
        String str = null;
        String str2 = null;
        switch (this.f2537a) {
            case 0:
                d1 d1Var = (d1) this.f2539c;
                boolean z12 = this.f2538b;
                d1Var.f2337f.f(new a1(d1Var, (b4.e0) this.d, 0));
                d1Var.f2337f.f(new a1(d1Var, (b4.e0) this.e, 0));
                d1Var.E = z12;
                return;
            case 1:
                qc qcVar = (qc) this.f2539c;
                boolean z13 = this.f2538b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                f6 f6Var2 = (f6) this.e;
                int i18 = R.raw.star_premium_2;
                if (z13) {
                    string = LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated);
                } else {
                    string = LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                }
                if (z13) {
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
                ic M = qcVar.M(string, AndroidUtilities.replaceSingleTag(string2, j6.Gi, 0, new gg.i(chat), f6Var2), i18);
                M.f25672j = 5000;
                M.j();
                return;
            case 2:
                l7 l7Var = (l7) this.f2539c;
                TLObject tLObject = (TLObject) this.e;
                boolean z14 = this.f2538b;
                ArrayList arrayList = l7Var.f12772l;
                int i19 = l7Var.f12764a;
                if (((int[]) this.d)[0] == l7Var.f12773m) {
                    l7Var.f12769i = false;
                    l7Var.f12773m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i19).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i19).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z14) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        l7Var.f12771k = tL_payments_savedStarGifts.next_offset;
                        l7Var.f12774n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        l7Var.h = bool;
                        if (arrayList.size() <= l7Var.f12774n && l7Var.f12771k != null) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        l7Var.f12770j = z4;
                        c3 = 1;
                    } else {
                        c3 = 1;
                        l7Var.f12770j = true;
                    }
                    NotificationCenter notificationCenter = NotificationCenter.getInstance(i19);
                    int i20 = NotificationCenter.starUserGiftsLoaded;
                    Object[] objArr = new Object[2];
                    objArr[0] = Long.valueOf(l7Var.f12765b);
                    objArr[c3] = l7Var;
                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i20, objArr);
                    return;
                }
                return;
            case 3:
                e3 e3Var = (e3) this.f2539c;
                mg.q0 q0Var = (mg.q0) this.e;
                boolean z15 = this.f2538b;
                d4 d4Var = e3Var.f15305a;
                z4.a0(d4Var.f15263z2, 1, d4Var.f15258y1, new d3(e3Var, z15, q0Var, (View) this.d));
                return;
            case 4:
                ((CameraController) this.f2539c).lambda$initCamera$3(this.f2538b, (Exception) this.d, (Runnable) this.e);
                return;
            case 5:
                String[] strArr = (String[]) this.f2539c;
                i6 i6Var = (i6) this.d;
                boolean z16 = this.f2538b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    j6.f19954g0 = j6.ql.get(j6.f19959g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        j6.f19972h0 = strArr[0];
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String absolutePath = new File(filesDirFixed, Utilities.MD5(j6.f19972h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = i6Var.f19809c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(i6Var.f19809c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        i6Var.f19809c = absolutePath;
                        Uri parse = Uri.parse(j6.f19972h0);
                        i6Var.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i21 = 0; i21 < split.length; i21++) {
                                if ("blur".equals(split[i21])) {
                                    i6Var.h = true;
                                } else if ("motion".equals(split[i21])) {
                                    i6Var.f19816n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        i6Var.f19820x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                i6Var.f19817r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    i6Var.f19818s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    i6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    i6Var.f19819w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                i6Var.f19820x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        try {
                            if (i6Var.f19809c != null) {
                                new File(i6Var.f19809c).delete();
                            }
                        } catch (Exception unused4) {
                        }
                        i6Var.f19809c = null;
                        j6.f19972h0 = null;
                    }
                    if (!z16 && j6.M == null) {
                        j6.K = i6Var;
                        if (j6.I == j6.J) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            j6.T = 2000;
                            j6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new n0(19), 2100L);
                        }
                    }
                    j6.I = i6Var;
                    j6.n1(false, false);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (j6.M == null && !j6.Q) {
                    MessagesController.getInstance(i6Var.B).saveTheme(i6Var, i6Var.k(false), z16, false);
                }
                pVar.run();
                return;
            case 6:
                xn.U((xn) this.f2539c, (String) this.d, (MessageObject) this.e, this.f2538b);
                return;
            case 7:
                jn jnVar = (jn) this.f2539c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z17 = this.f2538b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i22 = R.string.SuggestedMessageAcceptInfo;
                xn xnVar = jnVar.f35381a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i22, xnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                mf.a m9 = mf.a.m(message.suggested_post.price);
                if (m9.f13928a == mf.b.f13931b) {
                    i12 = xnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i12 = xnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z17) {
                    c10 = 0;
                    c11 = 1;
                    m9 = mf.a.i((m9.f13929b / 1000) * i12, m9.f13928a);
                } else {
                    c10 = 0;
                    c11 = 1;
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z17) {
                        int i23 = R.string.SuggestedMessageAcceptInfoAnytimeAdmin2;
                        String f10 = m9.f();
                        String G0 = rh.k.G0(i12);
                        Object[] objArr2 = new Object[2];
                        objArr2[c10] = f10;
                        objArr2[c11] = G0;
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i23, objArr2)));
                    } else {
                        int i24 = R.string.SuggestedMessageAcceptInfoAnytimeUser2;
                        Object[] objArr3 = new Object[1];
                        objArr3[c10] = m9.f();
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i24, objArr3)));
                    }
                } else if (z17) {
                    int i25 = R.string.SuggestedMessageAcceptInfoAdmin2;
                    String f11 = m9.f();
                    String o10 = lh.s0.o(message.suggested_post.schedule_date);
                    String G02 = rh.k.G0(i12);
                    Object[] objArr4 = new Object[3];
                    objArr4[c10] = f11;
                    objArr4[1] = o10;
                    objArr4[2] = G02;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i25, objArr4)));
                } else {
                    int i26 = R.string.SuggestedMessageAcceptInfoUser2;
                    String f12 = m9.f();
                    String o11 = lh.s0.o(message.suggested_post.schedule_date);
                    Object[] objArr5 = new Object[2];
                    objArr5[c10] = f12;
                    objArr5[1] = o11;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i26, objArr5)));
                }
                spannableStringBuilder.append(' ');
                int i27 = R.string.SuggestedMessageAcceptInfo3;
                i13 = ((p2) xnVar).currentAccount;
                Object[] objArr6 = new Object[1];
                objArr6[c10] = Long.valueOf(MessagesController.getInstance(i13).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS));
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i27, objArr6)));
                ic[] icVarArr = new ic[1];
                v5 v5Var = new v5(icVarArr, 4);
                org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
                String string3 = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i14 = R.string.Next;
                } else {
                    i14 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.d2 v02 = z4.v0(xnVar, string3, spannableStringBuilder, LocaleController.getString(i14), false, new gg.j0(jnVar, message, d2VarArr, messageObject, v5Var, 24));
                d2VarArr[c10] = v02;
                v02.setOnDismissListener(v5Var);
                if (z17 && m9.f13928a == mf.b.f13930a) {
                    bb a2 = cb.a(xnVar.getParentActivity());
                    f6Var = ((p2) xnVar).resourceProvider;
                    ic G = new qc(a2, f6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f25672j = 60000;
                    G.k(true);
                    icVarArr[c10] = G;
                    return;
                }
                return;
            case 8:
                vn vnVar = (vn) this.f2539c;
                vnVar.j((e4) this.d, (TLRPC.WallPaper) this.e, this.f2538b);
                vnVar.g(vnVar.f39219n);
                pm pmVar = vnVar.S.U0;
                if (pmVar != null && (h0Var = pmVar.I) != null) {
                    h0Var.invalidate();
                    return;
                }
                return;
            case 9:
                dp dpVar = (dp) this.f2539c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z18 = this.f2538b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    dpVar.f33758i0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = dpVar.V;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z18) {
                        if (dpVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dpVar.getParentActivity());
                            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            dpVar.showDialog(alertDialog$Builder.f19503a);
                        } else {
                            return;
                        }
                    }
                }
                x80 x80Var = dpVar.D;
                if (x80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = dpVar.f33758i0;
                    if (tL_chatInviteExported2 != null) {
                        str2 = tL_chatInviteExported2.link;
                    }
                    x80Var.setLink(str2);
                    dpVar.D.c(dpVar.f33758i0, dpVar.W);
                    return;
                }
                return;
            case 10:
                mp mpVar = (mp) this.f2539c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z19 = this.f2538b;
                chat2.join_to_send = z19;
                mpVar.f36365x.d.getMessagesController().toggleChatJoinToSend(chat2.f19184id, z19, new r5(mpVar, z19, chat2, 11), new hp(2, mpVar, (l80) this.e));
                return;
            case 11:
                mp mpVar2 = (mp) this.f2539c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                boolean z20 = this.f2538b;
                chat3.join_request = z20;
                mpVar2.f36365x.d.getMessagesController().toggleChatJoinRequest(chat3.f19184id, z20, new lp(mpVar2, 0), new hp(1, mpVar2, (k80) this.e));
                return;
            case 12:
                boolean z21 = this.f2538b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.f2539c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z21 && ChatObject.isChannel(chat4)) {
                    View d = alertDialog$Builder2.f19503a.d(-1);
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
            case 13:
                gk gkVar = (gk) this.f2539c;
                boolean z22 = this.f2538b;
                ArrayList arrayList2 = (ArrayList) this.e;
                gkVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new hp(27, gkVar, new ArrayList()));
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
                int i28 = i16 + 1;
                String[] strArr2 = new String[i28];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList3 = new ArrayList();
                if (!z22) {
                    for (int i29 = 0; i29 < arrayList2.size(); i29++) {
                        ak akVar = (ak) arrayList2.get(i29);
                        File file = akVar.f23415f;
                        if (file != null && !file.isDirectory()) {
                            int i30 = 0;
                            while (true) {
                                if (i30 < i28) {
                                    String str4 = strArr2[i30];
                                    String str5 = akVar.f23413b;
                                    if (str5 != null) {
                                        z11 = str5.toLowerCase().contains(str4);
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList3.add(akVar);
                                    } else {
                                        i30++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new hp(27, gkVar, arrayList3));
                return;
            case 14:
                h80.t((h80) this.f2539c, (TLRPC.TL_error) this.d, this.f2538b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 15:
                TLObject tLObject3 = (TLObject) this.d;
                boolean z23 = this.f2538b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                xx0 xx0Var = ((lx0) this.f2539c).f26894a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z23) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        xx0Var.P = tL_messages_stickerSet;
                        xx0Var.t0();
                        xx0Var.B0();
                    }
                }
                d2Var.dismiss();
                return;
            case 16:
                g3 g3Var = (g3) this.f2539c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z24 = this.f2538b;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                if (g3Var != null && !g3Var.isDismissed()) {
                    g3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z24) {
                        AndroidUtilities.runOnUIThread(new ch(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (d2Var2 != null && d2Var2.isShowing()) {
                    d2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z24) {
                        AndroidUtilities.runOnUIThread(new ch(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 17:
                c60 c60Var = (c60) this.f2539c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z25 = this.f2538b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        c60Var.u1(null, tL_chatInviteExported3.link, true, z25);
                        return;
                    }
                }
                return;
            case 18:
                g70 g70Var = (g70) this.f2539c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z26 = this.f2538b;
                if (tL_error2 == null) {
                    g70Var.f34463f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z26) {
                        if (g70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g70Var.getParentActivity());
                            alertDialog$Builder3.f19503a.Q = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f19503a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            g70Var.showDialog(alertDialog$Builder3.f19503a);
                        } else {
                            return;
                        }
                    }
                }
                g70Var.e = false;
                g70Var.f34460a.l();
                return;
            case 19:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z27 = this.f2538b;
                dn0 dn0Var = ((pm0) this.f2539c).e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    dn0Var.G = password;
                    TwoStepVerificationActivity.m0(password);
                    dn0Var.B1(z27);
                    return;
                }
                return;
            case 20:
                pm0 pm0Var = (pm0) this.f2539c;
                String str6 = (String) this.e;
                boolean z28 = this.f2538b;
                dn0 dn0Var2 = pm0Var.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    dn0Var2.Z0 = tL_secureSecretSettings.secure_secret;
                    dn0Var2.Y0 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        dn0Var2.f33687b1 = Utilities.computeSHA512(bArr3, AndroidUtilities.getStringBytes(str6), bArr3);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        dn0Var2.f33687b1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr5;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new el0(pm0Var, 4));
                        return;
                    } else {
                        bArr3 = new byte[0];
                    }
                    bArr2 = bArr3;
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = dn0Var2.G.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr6 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        dn0Var2.f33687b1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr6;
                    } else {
                        bArr = new byte[0];
                    }
                    dn0Var2.Z0 = null;
                    dn0Var2.Y0 = 0L;
                    bArr2 = bArr;
                }
                AndroidUtilities.runOnUIThread(new u0(pm0Var, passwordsettings, z28, bArr2, 21));
                return;
            case 21:
                pm0 pm0Var2 = (pm0) this.f2539c;
                boolean z29 = this.f2538b;
                byte[] bArr7 = (byte[]) this.e;
                dn0 dn0Var3 = pm0Var2.e;
                dn0Var3.f33684a1 = ((TL_account.passwordSettings) this.d).email;
                if (z29) {
                    dn0Var3.f33687b1 = dn0Var3.M0;
                }
                byte[] bArr8 = dn0Var3.Z0;
                byte[] bArr9 = dn0Var3.f33687b1;
                if (bArr8 != null && bArr8.length == 32) {
                    byte[] bArr10 = new byte[32];
                    System.arraycopy(bArr9, 0, bArr10, 0, 32);
                    byte[] bArr11 = new byte[16];
                    System.arraycopy(bArr9, 32, bArr11, 0, 16);
                    byte[] bArr12 = new byte[32];
                    System.arraycopy(bArr8, 0, bArr12, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr12, bArr10, bArr11, 0, 32, 0, 0);
                    bArr4 = bArr12;
                }
                if (dn0.Z0(bArr4, Long.valueOf(dn0Var3.Y0)) && bArr7.length != 0 && dn0Var3.Y0 != 0) {
                    if (dn0Var3.f33688c == 0) {
                        ConnectionsManager.getInstance(dn0.t0(dn0Var3)).sendRequest(new TL_account.getAllSecureValues(), new nm0(pm0Var2, 0));
                        return;
                    } else {
                        pm0Var2.a();
                        return;
                    }
                } else if (z29) {
                    UserConfig.getInstance(dn0.s0(dn0Var3)).resetSavedPassword();
                    dn0Var3.K0 = 0;
                    dn0Var3.R1();
                    return;
                } else {
                    TL_account.authorizationForm authorizationform = dn0Var3.f33737y;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        dn0Var3.f33737y.errors.clear();
                    }
                    byte[] bArr13 = dn0Var3.Z0;
                    if (bArr13 != null && bArr13.length != 0) {
                        pm0Var2.b();
                        return;
                    } else {
                        Utilities.globalQueue.postRunnable(new hf0(pm0Var2, pm0Var2.f37376b, pm0Var2.d, 12));
                        return;
                    }
                }
            case 22:
                jo0 jo0Var = (jo0) this.f2539c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z30 = this.f2538b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    jo0Var.X = password2;
                    TwoStepVerificationActivity.m0(password2);
                    jo0Var.A0(z30);
                    return;
                }
                return;
            case 23:
                m21.W((m21) this.f2539c, this.f2538b, (e4) this.d, (d5) this.e);
                return;
            case 24:
                og1.c0((og1) this.f2539c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.f2538b);
                return;
            case 25:
                ph.g1 g1Var = (ph.g1) this.f2539c;
                TLObject tLObject8 = (TLObject) this.d;
                String str7 = (String) this.e;
                boolean z31 = this.f2538b;
                ph.i1 i1Var = g1Var.f41677s;
                if (g1Var.f41676r) {
                    if (tLObject8 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject8;
                        ph.y1 y1Var = i1Var.f41737r;
                        ArrayList arrayList4 = i1Var.f41736n;
                        i17 = ((g3) y1Var).currentAccount;
                        MessagesStorage.getInstance(i17).saveBotCache(str7, messages_botresults);
                        g1Var.h = messages_botresults.next_offset;
                        if (z31) {
                            arrayList4.clear();
                        }
                        arrayList4.size();
                        arrayList4.addAll(messages_botresults.results);
                        g1Var.l();
                    }
                    i1Var.d.c(false);
                    g1Var.f41676r = false;
                    return;
                }
                return;
            case 26:
                u6 u6Var = (u6) this.f2539c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z32 = this.f2538b;
                Runnable runnable = (Runnable) this.e;
                u6Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(u6Var.Z0);
                    if (z32) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e6) {
                    FileLog.e((Throwable) e6, false);
                    if (z32) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(u6Var.Z0));
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 27:
                tf.z zVar = (tf.z) this.f2539c;
                boolean z33 = this.f2538b;
                u3 u3Var = (u3) this.d;
                tf.w wVar = (tf.w) this.e;
                if (!z33) {
                    zVar.f44893c = wVar;
                    u3Var.setRightText(zVar.H(wVar));
                    u3Var.setRightTextMargin(6);
                    zVar.F.clear();
                    zVar.d = true;
                    zVar.l();
                    zVar.Q();
                    return;
                }
                return;
            default:
                p2 p2Var = (p2) this.d;
                boolean z34 = this.f2538b;
                o3 o3Var = (o3) this.e;
                String trim = ((EditTextBoldCursor) this.f2539c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    vh.d4.k(p2Var, z34, new org.telegram.ui.web.m(13, o3Var, trim));
                    return;
                }
                return;
        }
    }

    public u0(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
        this.f2537a = i10;
        this.f2539c = obj;
        this.d = obj2;
        this.f2538b = z4;
        this.e = obj3;
    }

    public u0(Object obj, boolean z4, Object obj2, Object obj3, int i10) {
        this.f2537a = i10;
        this.f2539c = obj;
        this.f2538b = z4;
        this.d = obj2;
        this.e = obj3;
    }

    public u0(e3 e3Var, View view, mg.q0 q0Var, boolean z4, boolean z10) {
        this.f2537a = 3;
        this.f2539c = e3Var;
        this.d = view;
        this.e = q0Var;
        this.f2538b = z4;
    }

    public u0(boolean z4, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f2537a = 12;
        this.f2538b = z4;
        this.f2539c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
