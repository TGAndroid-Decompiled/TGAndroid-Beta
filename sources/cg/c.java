package cg;

import ag.l3;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import hh.m7;
import hh.t5;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import jh.d3;
import jh.e3;
import jh.e4;
import lh.z7;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.y4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ah;
import org.telegram.ui.bf0;
import org.telegram.ui.di1;
import org.telegram.ui.dn;
import org.telegram.ui.do0;
import org.telegram.ui.ep;
import org.telegram.ui.fp;
import org.telegram.ui.im0;
import org.telegram.ui.jm;
import org.telegram.ui.km0;
import org.telegram.ui.pn;
import org.telegram.ui.rd;
import org.telegram.ui.rn;
import org.telegram.ui.s5;
import org.telegram.ui.s50;
import org.telegram.ui.w60;
import org.telegram.ui.xm0;
import org.telegram.ui.xo;
import org.telegram.ui.y11;
import org.telegram.ui.yq;
import org.telegram.ui.zf1;
import org.telegram.ui.zk0;
import rh.m3;

public final class c implements Runnable {

    public final int f2617a;

    public final boolean f2618b;

    public final Object f2619c;
    public final Object d;

    public final Object f2620e;

    public c(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f2617a = i10;
        this.f2619c = obj;
        this.d = obj2;
        this.f2620e = obj3;
        this.f2618b = z10;
    }

    @Override
    public final void run() {
        String[] strArrSplit;
        ag.s0 s0Var;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i10 = 13;
        int i11 = 3;
        int i12 = 10;
        int i13 = 21;
        int i14 = 4;
        bArr = null;
        byte[] bArr4 = null;
        str = null;
        String str = null;
        boolean z10 = true;
        int i15 = 0;
        switch (this.f2617a) {
            case 0:
                mc mcVar = (mc) this.f2619c;
                boolean z11 = this.f2618b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                c6 c6Var = (c6) this.f2620e;
                int i16 = R.raw.star_premium_2;
                ec ecVarM = mcVar.M(z11 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated), AndroidUtilities.replaceSingleTag(z11 ? LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup) : LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup), g6.Gi, 0, new i(chat), c6Var), i16);
                ecVarM.f28020j = 5000;
                ecVarM.j();
                break;
            case 1:
                m7 m7Var = (m7) this.f2619c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.f2620e;
                boolean z12 = this.f2618b;
                ArrayList arrayList = m7Var.f9753l;
                int i17 = m7Var.f9744a;
                if (iArr[0] == m7Var.f9754m) {
                    m7Var.f9750i = false;
                    m7Var.f9754m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i17).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i17).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z12) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        m7Var.f9752k = tL_payments_savedStarGifts.next_offset;
                        m7Var.f9755n = tL_payments_savedStarGifts.count;
                        m7Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        m7Var.f9751j = arrayList.size() > m7Var.f9755n || m7Var.f9752k == null;
                    } else {
                        m7Var.f9751j = true;
                    }
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(m7Var.f9745b), m7Var);
                    break;
                }
                break;
            case 2:
                e3 e3Var = (e3) this.f2619c;
                View view = (View) this.d;
                ig.q0 q0Var = (ig.q0) this.f2620e;
                boolean z13 = this.f2618b;
                e4 e4Var = e3Var.f13218a;
                y4.a0(e4Var.f13296y2, 1, e4Var.f13291x1, new d3(e3Var, z13, q0Var, view));
                break;
            case 3:
                lh.s1 s1Var = (lh.s1) this.f2619c;
                TLObject tLObject2 = (TLObject) this.d;
                String str2 = (String) this.f2620e;
                boolean z14 = this.f2618b;
                lh.u1 u1Var = s1Var.f16720s;
                if (s1Var.f16719r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        lh.l2 l2Var = u1Var.f16901r;
                        ArrayList arrayList2 = u1Var.f16900n;
                        MessagesStorage.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).saveBotCache(str2, messages_botresults);
                        s1Var.h = messages_botresults.next_offset;
                        if (z14) {
                            arrayList2.clear();
                        }
                        arrayList2.size();
                        arrayList2.addAll(messages_botresults.results);
                        s1Var.l();
                    }
                    u1Var.d.c(false);
                    s1Var.f16719r = false;
                    break;
                }
                break;
            case 4:
                z7 z7Var = (z7) this.f2619c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z15 = this.f2618b;
                Runnable runnable = (Runnable) this.f2620e;
                z7Var.getClass();
                try {
                    bitmap.compress(z15 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(z7Var.Z0));
                } catch (Exception e9) {
                    FileLog.e((Throwable) e9, false);
                    if (z15) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(z7Var.Z0));
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                break;
            case 5:
                ((CameraController) this.f2619c).lambda$initCamera$3(this.f2618b, (Exception) this.d, (Runnable) this.f2620e);
                break;
            case 6:
                String[] strArr = (String[]) this.f2619c;
                f6 f6Var = (f6) this.d;
                boolean z16 = this.f2618b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.f2620e;
                try {
                    g6.f23102g0 = g6.ql.get(g6.f23107g5, -1);
                    int i18 = 20;
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (f6Var.f22945c != null) {
                                new File(f6Var.f22945c).delete();
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        f6Var.f22945c = null;
                        g6.f23119h0 = null;
                    } else {
                        g6.f23119h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(g6.f23119h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = f6Var.f22945c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(f6Var.f22945c).delete();
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                        f6Var.f22945c = absolutePath;
                        try {
                            Uri uri = Uri.parse(g6.f23119h0);
                            f6Var.f22948e = uri.getQueryParameter("slug");
                            String queryParameter = uri.getQueryParameter("mode");
                            if (queryParameter != null && (strArrSplit = queryParameter.toLowerCase().split(" ")) != null && strArrSplit.length > 0) {
                                for (int i19 = 0; i19 < strArrSplit.length; i19++) {
                                    if ("blur".equals(strArrSplit[i19])) {
                                        f6Var.h = true;
                                    } else if ("motion".equals(strArrSplit[i19])) {
                                        f6Var.f22952n = true;
                                    }
                                }
                            }
                            Utilities.parseInt((CharSequence) uri.getQueryParameter("intensity")).getClass();
                            f6Var.f22956x = 45;
                            try {
                                String queryParameter2 = uri.getQueryParameter("bg_color");
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
                                break;
                            } catch (Exception unused3) {
                            }
                            try {
                                String queryParameter3 = uri.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    f6Var.f22956x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                }
                                break;
                            } catch (Exception unused4) {
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                    if (!z16 && g6.M == null) {
                        g6.K = f6Var;
                        if (g6.I != g6.J) {
                            z10 = false;
                        }
                        if (z10) {
                            g6.T = 2000;
                            g6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new l3(i18), 2100L);
                        }
                    }
                    g6.I = f6Var;
                    g6.n1(false, false);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (g6.M == null && !g6.Q) {
                    MessagesController.getInstance(f6Var.A).saveTheme(f6Var, f6Var.k(false), z16, false);
                }
                pVar.run();
                break;
            case 7:
                rn.U((rn) this.f2619c, (String) this.d, (MessageObject) this.f2620e, this.f2618b);
                break;
            case 8:
                dn dnVar = (dn) this.f2619c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z17 = this.f2618b;
                MessageObject messageObject = (MessageObject) this.f2620e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i20 = R.string.SuggestedMessageAcceptInfo;
                rn rnVar = dnVar.f37446a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, rnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                hf.a aVarM = hf.a.m(message.suggested_post.price);
                int i21 = aVarM.f8919a == hf.b.f8922b ? rnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : rnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z17) {
                    aVarM = hf.a.i((aVarM.f8920b / 1000) * ((long) i21), aVarM.f8919a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z17) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, aVarM.f(), nh.k.G0(i21))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, aVarM.f())));
                    }
                } else if (z17) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, aVarM.f(), hh.t0.p(message.suggested_post.schedule_date), nh.k.G0(i21))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, aVarM.f(), hh.t0.p(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfo3, Long.valueOf(MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                ec[] ecVarArr = new ec[1];
                s5 s5Var = new s5(ecVarArr, 4);
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                org.telegram.ui.ActionBar.b2 b2VarV0 = y4.v0(rnVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new k0(dnVar, message, b2VarArr, messageObject, s5Var, 26));
                b2VarArr[0] = b2VarV0;
                b2VarV0.setOnDismissListener(s5Var);
                if (z17 && aVarM.f8919a == hf.b.f8921a) {
                    ec ecVarG = new mc(ab.a(rnVar.getParentActivity()), ((org.telegram.ui.ActionBar.n2) rnVar).resourceProvider).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    ecVarG.f28020j = 60000;
                    ecVarG.k(true);
                    ecVarArr[0] = ecVarG;
                    break;
                }
                break;
            case 9:
                pn pnVar = (pn) this.f2619c;
                pnVar.j((b4) this.d, (TLRPC.WallPaper) this.f2620e, this.f2618b);
                pnVar.g(pnVar.f41396n);
                jm jmVar = pnVar.R.T0;
                if (jmVar != null && (s0Var = jmVar.H) != null) {
                    s0Var.invalidate();
                    break;
                }
                break;
            case 10:
                xo xoVar = (xo) this.f2619c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.f2620e;
                boolean z18 = this.f2618b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject3;
                    xoVar.f44560h0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = xoVar.U;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z18) {
                        if (xoVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xoVar.getParentActivity());
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            xoVar.showDialog(alertDialog$Builder.f22702a);
                        }
                    }
                }
                i80 i80Var = xoVar.C;
                if (i80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xoVar.f44560h0;
                    i80Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    xoVar.C.c(xoVar.f44560h0, xoVar.V);
                }
                break;
            case 11:
                fp fpVar = (fp) this.f2619c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z19 = this.f2618b;
                w70 w70Var = (w70) this.f2620e;
                chat2.join_to_send = z19;
                fpVar.f38179x.d.getMessagesController().toggleChatJoinToSend(chat2.f22380id, z19, new t5(fpVar, z19, chat2, i10), new rd(26, fpVar, w70Var));
                break;
            case 12:
                fp fpVar2 = (fp) this.f2619c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                boolean z20 = this.f2618b;
                v70 v70Var = (v70) this.f2620e;
                chat3.join_request = z20;
                fpVar2.f38179x.d.getMessagesController().toggleChatJoinRequest(chat3.f22380id, z20, new ep(fpVar2, i15), new rd(25, fpVar2, v70Var));
                break;
            case 13:
                boolean z21 = this.f2618b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.f2619c;
                boolean[] zArr = (boolean[]) this.f2620e;
                if (z21 && ChatObject.isChannel(chat4)) {
                    View viewD = alertDialog$Builder2.f22702a.d(-1);
                    if (viewD instanceof TextView) {
                        TextView textView = (TextView) viewD;
                        if (zArr[0]) {
                            textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat4) ? R.string.ChannelDelete : R.string.DeleteMega));
                        } else if (chat4.monoforum) {
                            textView.setText(LocaleController.getString(R.string.LeaveConversationMenu));
                        } else if (chat4.megagroup) {
                            textView.setText(LocaleController.getString(R.string.LeaveMega));
                        } else {
                            textView.setText(LocaleController.getString(R.string.LeaveChannel));
                        }
                    }
                    break;
                }
                break;
            case 14:
                ak akVar = (ak) this.f2619c;
                String str4 = (String) this.d;
                boolean z22 = this.f2618b;
                ArrayList arrayList3 = (ArrayList) this.f2620e;
                akVar.getClass();
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new yq(i13, akVar, new ArrayList()));
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str = translitString;
                    }
                    int i22 = (str != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i22];
                    strArr2[0] = lowerCase;
                    if (str != null) {
                        strArr2[1] = str;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    if (!z22) {
                        for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                            vj vjVar = (vj) arrayList3.get(i23);
                            File file = vjVar.f33431f;
                            if (file != null && !file.isDirectory()) {
                                for (int i24 = 0; i24 < i22; i24++) {
                                    String str5 = strArr2[i24];
                                    String str6 = vjVar.f33428b;
                                    if (str6 != null ? str6.toLowerCase().contains(str5) : false) {
                                        arrayList4.add(vjVar);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new yq(i13, akVar, arrayList4));
                }
                break;
            case 15:
                t70.u((t70) this.f2619c, (TLRPC.TL_error) this.d, this.f2618b, (TLRPC.TL_messages_importChatInvite) this.f2620e);
                break;
            case 16:
                tw0 tw0Var = (tw0) this.f2619c;
                TLObject tLObject4 = (TLObject) this.d;
                boolean z23 = this.f2618b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f2620e;
                ex0 ex0Var = tw0Var.f32903a;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z23) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject4, 0, null, false, false);
                    } else {
                        ex0Var.O = tL_messages_stickerSet;
                        ex0Var.t0();
                        ex0Var.B0();
                    }
                }
                b2Var.dismiss();
                break;
            case 17:
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.f2619c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z24 = this.f2618b;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f2620e;
                if (e3Var2 != null && !e3Var2.isDismissed()) {
                    e3Var2.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z24) {
                        AndroidUtilities.runOnUIThread(new ah(i11, editTextBoldCursor));
                    }
                    break;
                } else if (b2Var2 != null && b2Var2.isShowing()) {
                    b2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z24) {
                        AndroidUtilities.runOnUIThread(new ah(i14, editTextBoldCursor));
                    }
                    break;
                }
                break;
            case 18:
                s50 s50Var = (s50) this.f2619c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.f2620e;
                boolean z25 = this.f2618b;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                    } else {
                        s50Var.u1(null, tL_chatInviteExported3.link, true, z25);
                    }
                }
                break;
            case 19:
                w60 w60Var = (w60) this.f2619c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f2620e;
                boolean z26 = this.f2618b;
                if (tL_error2 == null) {
                    w60Var.f43627f = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (z26) {
                        if (w60Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(w60Var.getParentActivity());
                            alertDialog$Builder3.f22702a.P = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            w60Var.showDialog(alertDialog$Builder3.f22702a);
                        }
                    }
                }
                w60Var.f43626e = false;
                w60Var.f43623a.l();
                break;
            case 20:
                km0 km0Var = (km0) this.f2619c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.f2620e;
                boolean z27 = this.f2618b;
                xm0 xm0Var = km0Var.f39810e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    xm0Var.F = password;
                    TwoStepVerificationActivity.m0(password);
                    xm0Var.B1(z27);
                }
                break;
            case 21:
                km0 km0Var2 = (km0) this.f2619c;
                TLObject tLObject8 = (TLObject) this.d;
                String str7 = (String) this.f2620e;
                boolean z28 = this.f2618b;
                xm0 xm0Var2 = km0Var2.f39810e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject8;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    xm0Var2.Y0 = tL_secureSecretSettings.secure_secret;
                    xm0Var2.X0 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        xm0Var2.f44481a1 = Utilities.computeSHA512(bArr3, AndroidUtilities.getStringBytes(str7), bArr3);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        xm0Var2.f44481a1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr5;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new zk0(km0Var2, i14));
                    } else {
                        bArr3 = new byte[0];
                    }
                    bArr2 = bArr3;
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = xm0Var2.F.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100001 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr6 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100001.salt;
                        xm0Var2.f44481a1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100001.salt);
                        bArr = bArr6;
                    } else {
                        bArr = new byte[0];
                    }
                    xm0Var2.Y0 = null;
                    xm0Var2.X0 = 0L;
                    bArr2 = bArr;
                }
                AndroidUtilities.runOnUIThread(new c(km0Var2, passwordsettings, z28, bArr2, 22));
                break;
            case 22:
                km0 km0Var3 = (km0) this.f2619c;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) this.d;
                boolean z29 = this.f2618b;
                byte[] bArr7 = (byte[]) this.f2620e;
                xm0 xm0Var3 = km0Var3.f39810e;
                xm0Var3.Z0 = passwordsettings2.email;
                if (z29) {
                    xm0Var3.f44481a1 = xm0Var3.L0;
                }
                byte[] bArr8 = xm0Var3.Y0;
                byte[] bArr9 = xm0Var3.f44481a1;
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
                if (!xm0.Z0(bArr4, Long.valueOf(xm0Var3.X0)) || bArr7.length == 0 || xm0Var3.X0 == 0) {
                    if (z29) {
                        UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var3).currentAccount).resetSavedPassword();
                        xm0Var3.J0 = 0;
                        xm0Var3.R1();
                    } else {
                        TL_account.authorizationForm authorizationform = xm0Var3.f44535y;
                        if (authorizationform != null) {
                            authorizationform.values.clear();
                            xm0Var3.f44535y.errors.clear();
                        }
                        byte[] bArr13 = xm0Var3.Y0;
                        if (bArr13 == null || bArr13.length == 0) {
                            Utilities.globalQueue.postRunnable(new bf0(km0Var3, km0Var3.f39808b, km0Var3.d, 12));
                        } else {
                            km0Var3.b();
                        }
                    }
                } else if (xm0Var3.f44485c == 0) {
                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var3).currentAccount).sendRequest(new TL_account.getAllSecureValues(), new im0(km0Var3, i15));
                } else {
                    km0Var3.a();
                }
                break;
            case 23:
                do0 do0Var = (do0) this.f2619c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.f2620e;
                boolean z30 = this.f2618b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject9;
                    do0Var.W = password2;
                    TwoStepVerificationActivity.m0(password2);
                    do0Var.A0(z30);
                }
                break;
            case 24:
                y11.W((y11) this.f2619c, this.f2618b, (b4) this.d, (a5) this.f2620e);
                break;
            case 25:
                zf1.c0((zf1) this.f2619c, (TLRPC.TL_error) this.d, (TLObject) this.f2620e, this.f2618b);
                break;
            case 26:
                pf.z zVar = (pf.z) this.f2619c;
                boolean z31 = this.f2618b;
                s3 s3Var = (s3) this.d;
                pf.w wVar = (pf.w) this.f2620e;
                if (!z31) {
                    zVar.f45981c = wVar;
                    s3Var.setRightText(zVar.H(wVar));
                    s3Var.setRightTextMargin(6);
                    zVar.E.clear();
                    zVar.d = true;
                    zVar.l();
                    zVar.Q();
                    break;
                }
                break;
            case 27:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f2619c;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                boolean z32 = this.f2618b;
                m3 m3Var = (m3) this.f2620e;
                String strTrim = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    rh.b4.k(n2Var, z32, new di1(i12, m3Var, strTrim));
                    break;
                }
                break;
            default:
                yf.p0 p0Var = (yf.p0) this.f2619c;
                b6.a aVar = (b6.a) this.d;
                b6.a aVar2 = (b6.a) this.f2620e;
                boolean z33 = this.f2618b;
                p0Var.f50015f.f(new yf.n0(p0Var, aVar, i15));
                p0Var.f50015f.f(new yf.n0(p0Var, aVar2, i15));
                p0Var.E = z33;
                break;
        }
    }

    public c(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f2617a = i10;
        this.f2619c = obj;
        this.d = obj2;
        this.f2618b = z10;
        this.f2620e = obj3;
    }

    public c(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f2617a = i10;
        this.f2619c = obj;
        this.f2618b = z10;
        this.d = obj2;
        this.f2620e = obj3;
    }

    public c(e3 e3Var, View view, ig.q0 q0Var, boolean z10, boolean z11) {
        this.f2617a = 2;
        this.f2619c = e3Var;
        this.d = view;
        this.f2620e = q0Var;
        this.f2618b = z10;
    }

    public c(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f2617a = 13;
        this.f2618b = z10;
        this.d = chat;
        this.f2619c = alertDialog$Builder;
        this.f2620e = zArr;
    }
}
