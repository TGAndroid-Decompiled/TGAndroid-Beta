package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class mmb extends n39 {
    public final Context c;
    public final ArrayList d;
    public final boolean e;
    public final qmb f;

    public mmb(qmb qmbVar, Context context) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        TLRPC.Chat chat;
        int i18;
        k27 k27Var;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        this.f = qmbVar;
        byte b = qmbVar.b;
        if (b == 0 && Utilities.b.nextInt(100) <= 1) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int i27 = currentTimeMillis - 3600;
        if (b == 2) {
            if (qmbVar.L1 >= 0) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                if (qmbVar.D1 instanceof krc) {
                    tL_message.message = k96.M0(2131753744, null);
                } else {
                    tL_message.message = k96.M0(2131753736, null);
                }
                tL_message.date = currentTimeMillis - 3540;
                tL_message.dialog_id = 1L;
                tL_message.flags = 259;
                tL_message.id = 1;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.out = true;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                i24 = ((d) qmbVar).currentAccount;
                tL_peerUser.user_id = y6c.h(i24).e();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                i25 = ((d) qmbVar).currentAccount;
                tL_peerUser2.user_id = y6c.h(i25).e();
                i26 = ((d) qmbVar).currentAccount;
                k27 k27Var2 = new k27(i26, tL_message, true, false);
                k27Var2.T = 1L;
                k27Var2.S1 = false;
                arrayList.add(k27Var2);
            }
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            if (qmbVar.L1 < 0) {
                chat = qmbVar.getMessagesController().K0(Long.valueOf(-qmbVar.L1));
            } else {
                chat = null;
            }
            if (chat != null) {
                tL_message2.message = k96.M0(2131752444, null);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                tL_message3.message = k96.M0(2131752442, null);
                i23 = ((d) qmbVar).currentAccount;
                k27 k27Var3 = new k27(i23, tL_message3, true, false);
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message2.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = chat.id;
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message2.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = chat.id;
                k27Var = k27Var3;
            } else {
                if (qmbVar.L1 != 0) {
                    tL_message2.message = k96.M0(2131753743, null);
                } else if (qmbVar.D1 instanceof krc) {
                    tL_message2.message = k96.M0(2131753745, null);
                } else {
                    tL_message2.message = k96.M0(2131753737, null);
                }
                tL_message2.from_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_message2.peer_id = tL_peerUser3;
                i18 = ((d) qmbVar).currentAccount;
                tL_peerUser3.user_id = y6c.h(i18).e();
                k27Var = null;
            }
            int i28 = currentTimeMillis - 3540;
            tL_message2.date = i28;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = 265;
            tL_message2.id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            i19 = ((d) qmbVar).currentAccount;
            k27 k27Var4 = new k27(i19, tL_message2, k27Var, true, false);
            if (k27Var != null) {
                k27Var4.D0 = k96.M0(2131752443, null);
            }
            k27Var4.T = 1L;
            k27Var4.S1 = false;
            arrayList.add(k27Var4);
            if (qmbVar.L1 != 0 && qmbVar.s0 == null) {
                TLRPC.User V1 = qmbVar.getMessagesController().V1(Long.valueOf(qmbVar.L1));
                TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                tL_message4.message = "";
                i20 = ((d) qmbVar).currentAccount;
                k27 k27Var5 = new k27(i20, tL_message4, true, false);
                k27Var5.T = 1L;
                k27Var5.U = 5;
                arrayList.add(k27Var5);
                TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
                if (V1 != null) {
                    tL_message5.message = k96.a0(null, null, 2131752231, l7c.k(V1, true));
                } else {
                    tL_message5.message = k96.M0(2131752445, null);
                }
                tL_message5.date = i28;
                tL_message5.dialog_id = 1L;
                tL_message5.flags = 265;
                tL_message5.from_id = new TLRPC.TL_peerUser();
                tL_message5.id = 1;
                tL_message5.media = new TLRPC.TL_messageMediaEmpty();
                tL_message5.out = false;
                TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                tL_message5.peer_id = tL_peerUser4;
                i21 = ((d) qmbVar).currentAccount;
                tL_peerUser4.user_id = y6c.h(i21).e();
                i22 = ((d) qmbVar).currentAccount;
                k27 k27Var6 = new k27(i22, tL_message5, true, false);
                k27Var6.T = 1L;
                k27Var6.S1 = false;
                k27Var6.U = 1;
                arrayList.add(k27Var6);
                return;
            }
            return;
        }
        boolean z2 = z;
        if (b == 1) {
            TLRPC.TL_message tL_message6 = new TLRPC.TL_message();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message6.media = tL_messageMediaDocument;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            TLRPC.Document document = tL_message6.media.document;
            document.mime_type = "audio/mp3";
            document.file_reference = new byte[0];
            document.id = -2147483648L;
            document.size = 2621440L;
            document.dc_id = Integer.MIN_VALUE;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = k96.M0(2131748061, null).concat(".mp3");
            tL_message6.media.document.attributes.add(tL_documentAttributeFilename);
            int i29 = currentTimeMillis - 3540;
            tL_message6.date = i29;
            tL_message6.dialog_id = 1L;
            tL_message6.flags = 259;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message6.from_id = tL_peerUser5;
            tL_peerUser5.user_id = y6c.h(y6c.t0).e();
            tL_message6.id = 1;
            tL_message6.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message6.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            k27 k27Var7 = new k27(y6c.t0, tL_message6, true, false);
            boolean z3 = w01.a;
            TLRPC.TL_message tL_message7 = new TLRPC.TL_message();
            String M0 = k96.M0(2131748064, null);
            StringBuilder sb = new StringBuilder(M0);
            int indexOf = M0.indexOf(42);
            int lastIndexOf = M0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                sb.replace(lastIndexOf, lastIndexOf + 1, "");
                sb.replace(indexOf, indexOf + 1, "");
                TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                tL_messageEntityTextUrl.offset = indexOf;
                tL_messageEntityTextUrl.length = (lastIndexOf - indexOf) - 1;
                tL_messageEntityTextUrl.url = "https://telegram.org";
                tL_message7.entities.add(tL_messageEntityTextUrl);
            }
            tL_message7.message = sb.toString();
            tL_message7.date = currentTimeMillis - 2640;
            tL_message7.dialog_id = 1L;
            tL_message7.flags = 259;
            TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
            tL_message7.from_id = tL_peerUser7;
            tL_peerUser7.user_id = y6c.h(y6c.t0).e();
            tL_message7.id = 1;
            tL_message7.media = new TLRPC.TL_messageMediaEmpty();
            tL_message7.out = true;
            TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
            tL_message7.peer_id = tL_peerUser8;
            tL_peerUser8.user_id = 0L;
            k27 k27Var8 = new k27(y6c.t0, tL_message7, true, false);
            k27Var8.S1 = false;
            k27Var8.T = 1L;
            arrayList.add(k27Var8);
            TLRPC.TL_message tL_message8 = new TLRPC.TL_message();
            tL_message8.message = k96.M0(2131748065, null);
            tL_message8.date = i29;
            tL_message8.dialog_id = 1L;
            tL_message8.flags = 265;
            tL_message8.from_id = new TLRPC.TL_peerUser();
            tL_message8.id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message8.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 16;
            tL_messageReplyHeader.reply_to_msg_id = 5;
            tL_message8.media = new TLRPC.TL_messageMediaEmpty();
            tL_message8.out = false;
            TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
            tL_message8.peer_id = tL_peerUser9;
            tL_peerUser9.user_id = y6c.h(y6c.t0).e();
            k27 k27Var9 = new k27(y6c.t0, tL_message8, true, false);
            k27Var9.D0 = k96.M0(2131748063, null);
            k27Var8.D0 = "Test User";
            k27Var9.T = 1L;
            k27Var9.S1 = false;
            k27Var9.C = k27Var7;
            k27Var8.C = k27Var9;
            arrayList.add(k27Var9);
            arrayList.add(k27Var7);
            TLRPC.TL_message tL_message9 = new TLRPC.TL_message();
            tL_message9.date = currentTimeMillis - 3480;
            tL_message9.dialog_id = 1L;
            tL_message9.flags = 259;
            tL_message9.out = false;
            tL_message9.from_id = new TLRPC.TL_peerUser();
            tL_message9.id = 1;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
            tL_message9.media = tL_messageMediaDocument2;
            tL_messageMediaDocument2.flags |= 3;
            tL_messageMediaDocument2.document = new TLRPC.TL_document();
            TLRPC.Document document2 = tL_message9.media.document;
            document2.mime_type = "audio/ogg";
            document2.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.flags = 1028;
            tL_documentAttributeAudio.duration = 3.0d;
            tL_documentAttributeAudio.voice = true;
            tL_documentAttributeAudio.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
            tL_message9.media.document.attributes.add(tL_documentAttributeAudio);
            tL_message9.out = true;
            TLRPC.TL_peerUser tL_peerUser10 = new TLRPC.TL_peerUser();
            tL_message9.peer_id = tL_peerUser10;
            tL_peerUser10.user_id = 0L;
            i17 = ((d) qmbVar).currentAccount;
            k27 k27Var10 = new k27(i17, tL_message9, true, false);
            k27Var10.i0 = 1;
            k27Var10.b0 = 0.3f;
            k27Var10.E0 = true;
            arrayList.add(k27Var10);
        } else if (z2) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            tL_user.id = 2147483647L;
            tL_user.first_name = "Me";
            TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
            tL_user2.id = 2147483646L;
            tL_user2.first_name = "Serj";
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(tL_user);
            arrayList2.add(tL_user2);
            i13 = ((d) qmbVar).currentAccount;
            na7.q1(i13).b4(arrayList2, true);
            TLRPC.TL_message tL_message10 = new TLRPC.TL_message();
            tL_message10.message = "Guess why Half-Life 3 was never released.";
            int i30 = currentTimeMillis - 2640;
            tL_message10.date = i30;
            tL_message10.dialog_id = -1L;
            tL_message10.flags = 259;
            tL_message10.id = 2147483646;
            tL_message10.media = new TLRPC.TL_messageMediaEmpty();
            tL_message10.out = false;
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_message10.peer_id = tL_peerChat;
            tL_peerChat.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser11 = new TLRPC.TL_peerUser();
            tL_message10.from_id = tL_peerUser11;
            tL_peerUser11.user_id = tL_user2.id;
            i14 = ((d) qmbVar).currentAccount;
            arrayList.add(new k27(i14, tL_message10, true, false));
            TLRPC.TL_message tL_message11 = new TLRPC.TL_message();
            tL_message11.message = "No.\nAnd every unnecessary ping of the dev delays the release for 10 days.\nEvery request for ETA delays the release for 2 weeks.";
            tL_message11.date = i30;
            tL_message11.dialog_id = -1L;
            tL_message11.flags = 259;
            tL_message11.id = 1;
            tL_message11.media = new TLRPC.TL_messageMediaEmpty();
            tL_message11.out = false;
            TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
            tL_message11.peer_id = tL_peerChat2;
            tL_peerChat2.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser12 = new TLRPC.TL_peerUser();
            tL_message11.from_id = tL_peerUser12;
            tL_peerUser12.user_id = tL_user2.id;
            i15 = ((d) qmbVar).currentAccount;
            arrayList.add(new k27(i15, tL_message11, true, false));
            TLRPC.TL_message tL_message12 = new TLRPC.TL_message();
            tL_message12.message = "Is source code for Android coming anytime soon?";
            tL_message12.date = currentTimeMillis - 3000;
            tL_message12.dialog_id = -1L;
            tL_message12.flags = 259;
            tL_message12.id = 1;
            tL_message12.media = new TLRPC.TL_messageMediaEmpty();
            tL_message12.out = false;
            TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
            tL_message12.peer_id = tL_peerChat3;
            tL_peerChat3.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser13 = new TLRPC.TL_peerUser();
            tL_message12.from_id = tL_peerUser13;
            tL_peerUser13.user_id = tL_user.id;
            i16 = ((d) qmbVar).currentAccount;
            arrayList.add(new k27(i16, tL_message12, true, false));
        } else {
            TLRPC.TL_message tL_message13 = new TLRPC.TL_message();
            tL_message13.message = k96.M0(2131743914, null);
            int i31 = currentTimeMillis - 3540;
            tL_message13.date = i31;
            tL_message13.dialog_id = 1L;
            tL_message13.flags = 259;
            TLRPC.TL_peerUser tL_peerUser14 = new TLRPC.TL_peerUser();
            tL_message13.from_id = tL_peerUser14;
            i = ((d) qmbVar).currentAccount;
            tL_peerUser14.user_id = y6c.h(i).e();
            tL_message13.id = 1;
            tL_message13.media = new TLRPC.TL_messageMediaEmpty();
            tL_message13.out = true;
            TLRPC.TL_peerUser tL_peerUser15 = new TLRPC.TL_peerUser();
            tL_message13.peer_id = tL_peerUser15;
            tL_peerUser15.user_id = 0L;
            i2 = ((d) qmbVar).currentAccount;
            k27 k27Var11 = new k27(i2, tL_message13, true, false);
            TLRPC.TL_message tL_message14 = new TLRPC.TL_message();
            tL_message14.message = k96.M0(2131743913, null);
            tL_message14.date = currentTimeMillis - 2640;
            tL_message14.dialog_id = 1L;
            tL_message14.flags = 259;
            TLRPC.TL_peerUser tL_peerUser16 = new TLRPC.TL_peerUser();
            tL_message14.from_id = tL_peerUser16;
            i3 = ((d) qmbVar).currentAccount;
            tL_peerUser16.user_id = y6c.h(i3).e();
            tL_message14.id = 1;
            tL_message14.media = new TLRPC.TL_messageMediaEmpty();
            tL_message14.out = true;
            TLRPC.TL_peerUser tL_peerUser17 = new TLRPC.TL_peerUser();
            tL_message14.peer_id = tL_peerUser17;
            tL_peerUser17.user_id = 0L;
            i4 = ((d) qmbVar).currentAccount;
            arrayList.add(new k27(i4, tL_message14, true, false));
            TLRPC.TL_message tL_message15 = new TLRPC.TL_message();
            tL_message15.date = currentTimeMillis - 3470;
            tL_message15.dialog_id = 1L;
            tL_message15.flags = 259;
            tL_message15.from_id = new TLRPC.TL_peerUser();
            tL_message15.id = 5;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
            tL_message15.media = tL_messageMediaDocument3;
            tL_messageMediaDocument3.flags |= 3;
            tL_messageMediaDocument3.document = new TLRPC.TL_document();
            TLRPC.Document document3 = tL_message15.media.document;
            document3.mime_type = "audio/mp4";
            document3.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio2.duration = 243.0d;
            tL_documentAttributeAudio2.performer = k96.M0(2131743909, null);
            tL_documentAttributeAudio2.title = k96.M0(2131743908, null);
            tL_message15.media.document.attributes.add(tL_documentAttributeAudio2);
            tL_message15.out = false;
            TLRPC.TL_peerUser tL_peerUser18 = new TLRPC.TL_peerUser();
            tL_message15.peer_id = tL_peerUser18;
            i5 = ((d) qmbVar).currentAccount;
            tL_peerUser18.user_id = y6c.h(i5).e();
            i6 = ((d) qmbVar).currentAccount;
            arrayList.add(new k27(i6, tL_message15, true, false));
            TLRPC.TL_message tL_message16 = new TLRPC.TL_message();
            tL_message16.message = k96.M0(2131743912, null);
            tL_message16.date = i31;
            tL_message16.dialog_id = 1L;
            tL_message16.flags = 265;
            tL_message16.from_id = new TLRPC.TL_peerUser();
            tL_message16.id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
            tL_message16.reply_to = tL_messageReplyHeader2;
            tL_messageReplyHeader2.flags |= 16;
            tL_messageReplyHeader2.reply_to_msg_id = 5;
            tL_message16.media = new TLRPC.TL_messageMediaEmpty();
            tL_message16.out = false;
            TLRPC.TL_peerUser tL_peerUser19 = new TLRPC.TL_peerUser();
            tL_message16.peer_id = tL_peerUser19;
            i7 = ((d) qmbVar).currentAccount;
            tL_peerUser19.user_id = y6c.h(i7).e();
            i8 = ((d) qmbVar).currentAccount;
            k27 k27Var12 = new k27(i8, tL_message16, true, false);
            k27Var12.D0 = k96.M0(2131743911, null);
            k27Var12.C = k27Var11;
            arrayList.add(k27Var12);
            TLRPC.TL_message tL_message17 = new TLRPC.TL_message();
            tL_message17.date = currentTimeMillis - 3480;
            tL_message17.dialog_id = 1L;
            tL_message17.flags = 259;
            TLRPC.TL_peerUser tL_peerUser20 = new TLRPC.TL_peerUser();
            tL_message17.from_id = tL_peerUser20;
            i9 = ((d) qmbVar).currentAccount;
            tL_peerUser20.user_id = y6c.h(i9).e();
            tL_message17.id = 1;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
            tL_message17.media = tL_messageMediaDocument4;
            tL_messageMediaDocument4.flags |= 3;
            tL_messageMediaDocument4.document = new TLRPC.TL_document();
            TLRPC.Document document4 = tL_message17.media.document;
            document4.mime_type = "audio/ogg";
            document4.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio3 = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio3.flags = 1028;
            tL_documentAttributeAudio3.duration = 3.0d;
            tL_documentAttributeAudio3.voice = true;
            tL_documentAttributeAudio3.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
            tL_message17.media.document.attributes.add(tL_documentAttributeAudio3);
            tL_message17.out = true;
            TLRPC.TL_peerUser tL_peerUser21 = new TLRPC.TL_peerUser();
            tL_message17.peer_id = tL_peerUser21;
            tL_peerUser21.user_id = 0L;
            i10 = ((d) qmbVar).currentAccount;
            k27 k27Var13 = new k27(i10, tL_message17, true, false);
            k27Var13.i0 = 1;
            k27Var13.b0 = 0.3f;
            k27Var13.E0 = true;
            arrayList.add(k27Var13);
            arrayList.add(k27Var11);
            TLRPC.TL_message tL_message18 = new TLRPC.TL_message();
            tL_message18.date = currentTimeMillis - 3590;
            tL_message18.dialog_id = 1L;
            tL_message18.flags = 257;
            tL_message18.from_id = new TLRPC.TL_peerUser();
            tL_message18.id = 1;
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
            tL_message18.media = tL_messageMediaPhoto;
            tL_messageMediaPhoto.flags |= 3;
            tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
            TLRPC.Photo photo = tL_message18.media.photo;
            photo.file_reference = new byte[0];
            photo.has_stickers = false;
            photo.id = 1L;
            photo.access_hash = 0L;
            photo.date = i27;
            TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
            tL_photoSize.size = 0;
            tL_photoSize.w = 500;
            tL_photoSize.h = 302;
            tL_photoSize.type = "s";
            tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
            tL_message18.media.photo.sizes.add(tL_photoSize);
            tL_message18.message = k96.M0(2131743910, null);
            tL_message18.out = false;
            TLRPC.TL_peerUser tL_peerUser22 = new TLRPC.TL_peerUser();
            tL_message18.peer_id = tL_peerUser22;
            i11 = ((d) qmbVar).currentAccount;
            tL_peerUser22.user_id = y6c.h(i11).e();
            i12 = ((d) qmbVar).currentAccount;
            k27 k27Var14 = new k27(i12, tL_message18, true, false);
            k27Var14.E0 = true;
            arrayList.add(k27Var14);
        }
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    public final boolean E() {
        qmb qmbVar = this.f;
        byte b = qmbVar.b;
        if (qmbVar.B0 == null || b != 1 || qmbVar.n != 3 || qmbVar.w.g == 0) {
            if (qmbVar.A0 != null) {
                if (b != 2 && (b != 1 || qmbVar.n != 2)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int b() {
        int size = this.d.size();
        if (E()) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int d(int i) {
        if (E()) {
            if (i == 0) {
                if (this.f.n == 3) {
                    return 3;
                }
                return 2;
            }
            i--;
        }
        if (i >= 0) {
            ArrayList arrayList = this.d;
            if (i < arrayList.size()) {
                return ((k27) arrayList.get(i)).U;
            }
            return 4;
        }
        return 4;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = s49Var.f;
        if (i2 != 2 && i2 != 3) {
            if (E()) {
                i--;
            }
            ArrayList arrayList = this.d;
            k27 k27Var = (k27) arrayList.get(i);
            View view = s49Var.a;
            boolean z4 = view instanceof gb2;
            qmb qmbVar = this.f;
            if (z4) {
                gb2 gb2Var = (gb2) view;
                boolean z5 = false;
                gb2Var.f6 = false;
                int i3 = i - 1;
                int d = d(i3);
                int i4 = i + 1;
                int d2 = d(i4);
                if (!(k27Var.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == s49Var.f) {
                    k27 k27Var2 = (k27) arrayList.get(i3);
                    if (k27Var2.O3() == k27Var.O3() && Math.abs(k27Var2.k.date - k27Var.k.date) <= 300) {
                        z = true;
                        if (d2 != s49Var.f && i4 < arrayList.size()) {
                            k27 k27Var3 = (k27) arrayList.get(i4);
                            if (!(k27Var3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && k27Var3.O3() == k27Var.O3() && Math.abs(k27Var3.k.date - k27Var.k.date) <= 300) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z2 = z3;
                        } else {
                            z2 = false;
                        }
                        if (!this.e || qmbVar.L1 < 0) {
                            z5 = true;
                        }
                        gb2Var.f6 = z5;
                        gb2Var.setFullyDraw(true);
                        gb2Var.z3(k27Var, null, z, z2, false, false);
                    }
                }
                z = false;
                if (d2 != s49Var.f) {
                }
                z2 = false;
                if (!this.e) {
                }
                z5 = true;
                gb2Var.f6 = z5;
                gb2Var.setFullyDraw(true);
                gb2Var.z3(k27Var, null, z, z2, false, false);
            } else if (view instanceof uk1) {
                uk1 uk1Var = (uk1) view;
                uk1Var.setMessageObject(k27Var);
                uk1Var.setAlpha(1.0f);
                qmbVar.W0();
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        ar8 ar8Var;
        gb2 gb2Var;
        int i2;
        qmb qmbVar = this.f;
        if (i == 0) {
            i2 = ((d) qmbVar).currentAccount;
            gb2 gb2Var2 = new gb2(this.c, i2, false, null, new fd(this, (byte) 4));
            gb2Var2.setDelegate(new i2f((byte) 27));
            gb2Var = gb2Var2;
        } else {
            Context context = this.c;
            if (i == 1) {
                uk1 uk1Var = new uk1(qmbVar.a, context, false);
                uk1Var.setDelegate(new o5f((byte) 27));
                gb2Var = uk1Var;
            } else {
                if (i == 2) {
                    if (qmbVar.A0.getParent() != null) {
                        ((ViewGroup) qmbVar.A0.getParent()).removeView(qmbVar.A0);
                    }
                    ar8Var = new ar8(context, (byte) 14);
                    ar8Var.addView(qmbVar.A0, nme.e(-1, 76, 17));
                } else if (i == 5) {
                    gb2Var = new d62(qmbVar.getParentActivity(), (byte) 28);
                } else {
                    if (qmbVar.B0.getParent() != null) {
                        ((ViewGroup) qmbVar.B0.getParent()).removeView(qmbVar.B0);
                    }
                    ar8Var = new ar8(context, (byte) 15);
                    ar8Var.addView(qmbVar.B0, nme.e(-1, 76, 17));
                }
                gb2Var = ar8Var;
            }
        }
        return ls6.h(gb2Var, gb2Var, -1, -2);
    }
}
