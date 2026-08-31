package dg;

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
import mh.l7;
import mh.r5;
import oh.e3;
import oh.f3;
import oh.f4;
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
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ch;
import org.telegram.ui.d60;
import org.telegram.ui.ep;
import org.telegram.ui.fn0;
import org.telegram.ui.gl0;
import org.telegram.ui.h70;
import org.telegram.ui.if0;
import org.telegram.ui.jn;
import org.telegram.ui.lo0;
import org.telegram.ui.lp;
import org.telegram.ui.mp;
import org.telegram.ui.np;
import org.telegram.ui.o21;
import org.telegram.ui.pm;
import org.telegram.ui.pm0;
import org.telegram.ui.qg1;
import org.telegram.ui.rm0;
import org.telegram.ui.v5;
import org.telegram.ui.vn;
import org.telegram.ui.xn;
import qh.s6;
import wh.d4;
import wh.o3;
public final class t0 implements Runnable {
    public final int f4671a;
    public final boolean f4672b;
    public final Object f4673c;
    public final Object d;
    public final Object f4674e;

    public t0(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.f4671a = i10;
        this.f4673c = obj;
        this.d = obj2;
        this.f4674e = obj3;
        this.f4672b = z4;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        boolean z4;
        String[] split;
        int i12;
        int i13;
        int i14;
        g6 g6Var;
        fg.h0 h0Var;
        int i15;
        int i16;
        boolean z10;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i17;
        Bitmap.CompressFormat compressFormat;
        Boolean bool = null;
        r12 = null;
        byte[] bArr4 = null;
        r12 = null;
        String str = null;
        String str2 = null;
        boolean z11 = true;
        switch (this.f4671a) {
            case 0:
                c1 c1Var = (c1) this.f4673c;
                boolean z12 = this.f4672b;
                c1Var.f4455f.f(new z0(c1Var, (b4.e0) this.d, 0));
                c1Var.f4455f.f(new z0(c1Var, (b4.e0) this.f4674e, 0));
                c1Var.E = z12;
                return;
            case 1:
                qc qcVar = (qc) this.f4673c;
                boolean z13 = this.f4672b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                g6 g6Var2 = (g6) this.f4674e;
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
                ic M = qcVar.M(string, AndroidUtilities.replaceSingleTag(string2, k6.Gi, 0, new hg.i(chat), g6Var2), i18);
                M.f27745j = 5000;
                M.j();
                return;
            case 2:
                l7 l7Var = (l7) this.f4673c;
                TLObject tLObject = (TLObject) this.f4674e;
                boolean z14 = this.f4672b;
                ArrayList arrayList = l7Var.f14405l;
                int i19 = l7Var.f14396a;
                if (((int[]) this.d)[0] == l7Var.f14406m) {
                    l7Var.f14402i = false;
                    l7Var.f14406m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i19).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i19).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z14) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        l7Var.f14404k = tL_payments_savedStarGifts.next_offset;
                        l7Var.f14407n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        l7Var.h = bool;
                        if (arrayList.size() <= l7Var.f14407n && l7Var.f14404k != null) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        l7Var.f14403j = z4;
                    } else {
                        l7Var.f14403j = true;
                    }
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l7Var.f14397b), l7Var);
                    return;
                }
                return;
            case 3:
                f3 f3Var = (f3) this.f4673c;
                ng.q0 q0Var = (ng.q0) this.f4674e;
                boolean z15 = this.f4672b;
                f4 f4Var = f3Var.f17051a;
                z4.a0(f4Var.f17133z2, 1, f4Var.f17128y1, new e3(f3Var, z15, q0Var, (View) this.d));
                return;
            case 4:
                ((CameraController) this.f4673c).lambda$initCamera$3(this.f4672b, (Exception) this.d, (Runnable) this.f4674e);
                return;
            case 5:
                String[] strArr = (String[]) this.f4673c;
                j6 j6Var = (j6) this.d;
                boolean z16 = this.f4672b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.f4674e;
                try {
                    k6.f21708g0 = k6.ql.get(k6.f21713g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        k6.f21726h0 = strArr[0];
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String absolutePath = new File(filesDirFixed, Utilities.MD5(k6.f21726h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = j6Var.f21507c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(j6Var.f21507c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        j6Var.f21507c = absolutePath;
                        Uri parse = Uri.parse(k6.f21726h0);
                        j6Var.f21510e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i20 = 0; i20 < split.length; i20++) {
                                if ("blur".equals(split[i20])) {
                                    j6Var.h = true;
                                } else if ("motion".equals(split[i20])) {
                                    j6Var.f21515n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        j6Var.f21519x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                j6Var.f21516r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    j6Var.f21517s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    j6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    j6Var.f21518w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                j6Var.f21519x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        try {
                            if (j6Var.f21507c != null) {
                                new File(j6Var.f21507c).delete();
                            }
                        } catch (Exception unused4) {
                        }
                        j6Var.f21507c = null;
                        k6.f21726h0 = null;
                    }
                    if (!z16 && k6.M == null) {
                        k6.K = j6Var;
                        if (k6.I != k6.J) {
                            z11 = false;
                        }
                        if (z11) {
                            k6.T = 2000;
                            k6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ag.f(21), 2100L);
                        }
                    }
                    k6.I = j6Var;
                    k6.n1(false, false);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (k6.M == null && !k6.Q) {
                    MessagesController.getInstance(j6Var.B).saveTheme(j6Var, j6Var.k(false), z16, false);
                }
                pVar.run();
                return;
            case 6:
                xn.U((xn) this.f4673c, (String) this.d, (MessageObject) this.f4674e, this.f4672b);
                return;
            case 7:
                jn jnVar = (jn) this.f4673c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z17 = this.f4672b;
                MessageObject messageObject = (MessageObject) this.f4674e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i21 = R.string.SuggestedMessageAcceptInfo;
                xn xnVar = jnVar.f38188a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, xnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                mf.a m9 = mf.a.m(message.suggested_post.price);
                if (m9.f13649a == mf.b.f13652b) {
                    i12 = xnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i12 = xnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z17) {
                    m9 = mf.a.i((m9.f13650b / 1000) * i12, m9.f13649a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z17) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m9.f(), sh.j.G0(i12))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m9.f())));
                    }
                } else if (z17) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m9.f(), mh.r0.o(message.suggested_post.schedule_date), sh.j.G0(i12))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m9.f(), mh.r0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i22 = R.string.SuggestedMessageAcceptInfo3;
                i13 = ((p2) xnVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i22, Long.valueOf(MessagesController.getInstance(i13).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                ic[] icVarArr = new ic[1];
                v5 v5Var = new v5(icVarArr, 4);
                org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
                String string3 = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i14 = R.string.Next;
                } else {
                    i14 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.d2 v02 = z4.v0(xnVar, string3, spannableStringBuilder, LocaleController.getString(i14), false, new hg.j0(jnVar, message, d2VarArr, messageObject, v5Var, 24));
                d2VarArr[0] = v02;
                v02.setOnDismissListener(v5Var);
                if (z17 && m9.f13649a == mf.b.f13651a) {
                    bb a2 = cb.a(xnVar.getParentActivity());
                    g6Var = ((p2) xnVar).resourceProvider;
                    ic G = new qc(a2, g6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f27745j = 60000;
                    G.k(true);
                    icVarArr[0] = G;
                    return;
                }
                return;
            case 8:
                vn vnVar = (vn) this.f4673c;
                vnVar.j((org.telegram.ui.ActionBar.f4) this.d, (TLRPC.WallPaper) this.f4674e, this.f4672b);
                vnVar.g(vnVar.f42263n);
                pm pmVar = vnVar.S.U0;
                if (pmVar != null && (h0Var = pmVar.I) != null) {
                    h0Var.invalidate();
                    return;
                }
                return;
            case 9:
                ep epVar = (ep) this.f4673c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.f4674e;
                boolean z18 = this.f4672b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    epVar.f36642i0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = epVar.V;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z18) {
                        if (epVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(epVar.getParentActivity());
                            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            epVar.showDialog(alertDialog$Builder.f21166a);
                        } else {
                            return;
                        }
                    }
                }
                y80 y80Var = epVar.D;
                if (y80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = epVar.f36642i0;
                    if (tL_chatInviteExported2 != null) {
                        str2 = tL_chatInviteExported2.link;
                    }
                    y80Var.setLink(str2);
                    epVar.D.c(epVar.f36642i0, epVar.W);
                    return;
                }
                return;
            case 10:
                np npVar = (np) this.f4673c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z19 = this.f4672b;
                chat2.join_to_send = z19;
                npVar.f39500x.d.getMessagesController().toggleChatJoinToSend(chat2.f20843id, z19, new r5(npVar, z19, chat2, 11), new mp(1, npVar, (m80) this.f4674e));
                return;
            case 11:
                np npVar2 = (np) this.f4673c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                boolean z20 = this.f4672b;
                chat3.join_request = z20;
                npVar2.f39500x.d.getMessagesController().toggleChatJoinRequest(chat3.f20843id, z20, new lp(npVar2, 0), new mp(0, npVar2, (l80) this.f4674e));
                return;
            case 12:
                boolean z21 = this.f4672b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.f4673c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.f4674e;
                if (z21 && ChatObject.isChannel(chat4)) {
                    View d = alertDialog$Builder2.f21166a.d(-1);
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
                ik ikVar = (ik) this.f4673c;
                boolean z22 = this.f4672b;
                ArrayList arrayList2 = (ArrayList) this.f4674e;
                ikVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new mp(26, ikVar, new ArrayList()));
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
                int i23 = i16 + 1;
                String[] strArr2 = new String[i23];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList3 = new ArrayList();
                if (!z22) {
                    for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                        ck ckVar = (ck) arrayList2.get(i24);
                        File file = ckVar.f25993f;
                        if (file != null && !file.isDirectory()) {
                            int i25 = 0;
                            while (true) {
                                if (i25 < i23) {
                                    String str4 = strArr2[i25];
                                    String str5 = ckVar.f25990b;
                                    if (str5 != null) {
                                        z10 = str5.toLowerCase().contains(str4);
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        arrayList3.add(ckVar);
                                    } else {
                                        i25++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new mp(26, ikVar, arrayList3));
                return;
            case 14:
                j80.t((j80) this.f4673c, (TLRPC.TL_error) this.d, this.f4672b, (TLRPC.TL_messages_importChatInvite) this.f4674e);
                return;
            case 15:
                TLObject tLObject3 = (TLObject) this.d;
                boolean z23 = this.f4672b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f4674e;
                yx0 yx0Var = ((mx0) this.f4673c).f29261a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z23) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        yx0Var.P = tL_messages_stickerSet;
                        yx0Var.t0();
                        yx0Var.B0();
                    }
                }
                d2Var.dismiss();
                return;
            case 16:
                h3 h3Var = (h3) this.f4673c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z24 = this.f4672b;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.f4674e;
                if (h3Var != null && !h3Var.isDismissed()) {
                    h3Var.setFocusable(true);
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
                d60 d60Var = (d60) this.f4673c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.f4674e;
                boolean z25 = this.f4672b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        d60Var.u1(null, tL_chatInviteExported3.link, true, z25);
                        return;
                    }
                }
                return;
            case 18:
                h70 h70Var = (h70) this.f4673c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.f4674e;
                boolean z26 = this.f4672b;
                if (tL_error2 == null) {
                    h70Var.f37344f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z26) {
                        if (h70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h70Var.getParentActivity());
                            alertDialog$Builder3.f21166a.Q = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f21166a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            h70Var.showDialog(alertDialog$Builder3.f21166a);
                        } else {
                            return;
                        }
                    }
                }
                h70Var.f37343e = false;
                h70Var.f37340a.l();
                return;
            case 19:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f4674e;
                boolean z27 = this.f4672b;
                fn0 fn0Var = ((rm0) this.f4673c).f40996e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    fn0Var.G = password;
                    TwoStepVerificationActivity.m0(password);
                    fn0Var.B1(z27);
                    return;
                }
                return;
            case 20:
                rm0 rm0Var = (rm0) this.f4673c;
                String str6 = (String) this.f4674e;
                boolean z28 = this.f4672b;
                fn0 fn0Var2 = rm0Var.f40996e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    fn0Var2.Z0 = tL_secureSecretSettings.secure_secret;
                    fn0Var2.Y0 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        fn0Var2.f36922b1 = Utilities.computeSHA512(bArr3, AndroidUtilities.getStringBytes(str6), bArr3);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        fn0Var2.f36922b1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr5;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new gl0(rm0Var, 4));
                        return;
                    } else {
                        bArr3 = new byte[0];
                    }
                    bArr2 = bArr3;
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = fn0Var2.G.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr6 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        fn0Var2.f36922b1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr6;
                    } else {
                        bArr = new byte[0];
                    }
                    fn0Var2.Z0 = null;
                    fn0Var2.Y0 = 0L;
                    bArr2 = bArr;
                }
                AndroidUtilities.runOnUIThread(new t0(rm0Var, passwordsettings, z28, bArr2, 21));
                return;
            case 21:
                rm0 rm0Var2 = (rm0) this.f4673c;
                boolean z29 = this.f4672b;
                byte[] bArr7 = (byte[]) this.f4674e;
                fn0 fn0Var3 = rm0Var2.f40996e;
                fn0Var3.f36919a1 = ((TL_account.passwordSettings) this.d).email;
                if (z29) {
                    fn0Var3.f36922b1 = fn0Var3.M0;
                }
                byte[] bArr8 = fn0Var3.Z0;
                byte[] bArr9 = fn0Var3.f36922b1;
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
                if (fn0.Z0(bArr4, Long.valueOf(fn0Var3.Y0)) && bArr7.length != 0 && fn0Var3.Y0 != 0) {
                    if (fn0Var3.f36923c == 0) {
                        ConnectionsManager.getInstance(fn0.t0(fn0Var3)).sendRequest(new TL_account.getAllSecureValues(), new pm0(rm0Var2, 0));
                        return;
                    } else {
                        rm0Var2.a();
                        return;
                    }
                } else if (z29) {
                    UserConfig.getInstance(fn0.s0(fn0Var3)).resetSavedPassword();
                    fn0Var3.K0 = 0;
                    fn0Var3.R1();
                    return;
                } else {
                    TL_account.authorizationForm authorizationform = fn0Var3.f36973y;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        fn0Var3.f36973y.errors.clear();
                    }
                    byte[] bArr13 = fn0Var3.Z0;
                    if (bArr13 != null && bArr13.length != 0) {
                        rm0Var2.b();
                        return;
                    } else {
                        Utilities.globalQueue.postRunnable(new if0(rm0Var2, rm0Var2.f40994b, rm0Var2.d, 12));
                        return;
                    }
                }
            case 22:
                lo0 lo0Var = (lo0) this.f4673c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.f4674e;
                boolean z30 = this.f4672b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    lo0Var.X = password2;
                    TwoStepVerificationActivity.m0(password2);
                    lo0Var.A0(z30);
                    return;
                }
                return;
            case 23:
                o21.W((o21) this.f4673c, this.f4672b, (org.telegram.ui.ActionBar.f4) this.d, (e5) this.f4674e);
                return;
            case 24:
                qg1.c0((qg1) this.f4673c, (TLRPC.TL_error) this.d, (TLObject) this.f4674e, this.f4672b);
                return;
            case 25:
                qh.g1 g1Var = (qh.g1) this.f4673c;
                TLObject tLObject8 = (TLObject) this.d;
                String str7 = (String) this.f4674e;
                boolean z31 = this.f4672b;
                qh.i1 i1Var = g1Var.f45355s;
                if (g1Var.f45354r) {
                    if (tLObject8 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject8;
                        qh.y1 y1Var = i1Var.f45406r;
                        ArrayList arrayList4 = i1Var.f45405n;
                        i17 = ((h3) y1Var).currentAccount;
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
                    g1Var.f45354r = false;
                    return;
                }
                return;
            case 26:
                s6 s6Var = (s6) this.f4673c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z32 = this.f4672b;
                Runnable runnable = (Runnable) this.f4674e;
                s6Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(s6Var.Z0);
                    if (z32) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e10) {
                    FileLog.e((Throwable) e10, false);
                    if (z32) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(s6Var.Z0));
                        } catch (Exception e11) {
                            FileLog.e((Throwable) e11, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 27:
                uf.z zVar = (uf.z) this.f4673c;
                boolean z33 = this.f4672b;
                u3 u3Var = (u3) this.d;
                uf.w wVar = (uf.w) this.f4674e;
                if (!z33) {
                    zVar.f48753c = wVar;
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
                boolean z34 = this.f4672b;
                o3 o3Var = (o3) this.f4674e;
                String trim = ((EditTextBoldCursor) this.f4673c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    d4.k(p2Var, z34, new org.telegram.ui.web.m(13, o3Var, trim));
                    return;
                }
                return;
        }
    }

    public t0(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
        this.f4671a = i10;
        this.f4673c = obj;
        this.d = obj2;
        this.f4672b = z4;
        this.f4674e = obj3;
    }

    public t0(Object obj, boolean z4, Object obj2, Object obj3, int i10) {
        this.f4671a = i10;
        this.f4673c = obj;
        this.f4672b = z4;
        this.d = obj2;
        this.f4674e = obj3;
    }

    public t0(f3 f3Var, View view, ng.q0 q0Var, boolean z4, boolean z10) {
        this.f4671a = 3;
        this.f4673c = f3Var;
        this.d = view;
        this.f4674e = q0Var;
        this.f4672b = z4;
    }

    public t0(boolean z4, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f4671a = 12;
        this.f4672b = z4;
        this.f4673c = chat;
        this.d = alertDialog$Builder;
        this.f4674e = zArr;
    }
}
