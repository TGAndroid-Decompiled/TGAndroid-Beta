package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class lqb extends c79 {
    public final Context c;
    public final ArrayList d;
    public final boolean e;
    public final pqb f;

    public lqb(pqb pqbVar, Context context) {
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
        r47 r47Var;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        this.f = pqbVar;
        byte b = pqbVar.b;
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
            if (pqbVar.L1 >= 0) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                if (pqbVar.D1 instanceof yvc) {
                    tL_message.message = ob6.M0(2131753740, null);
                } else {
                    tL_message.message = ob6.M0(2131753732, null);
                }
                tL_message.date = currentTimeMillis - 3540;
                tL_message.dialog_id = 1L;
                tL_message.flags = 259;
                tL_message.id = 1;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.out = true;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                i24 = ((e) pqbVar).currentAccount;
                tL_peerUser.user_id = yac.h(i24).e();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                i25 = ((e) pqbVar).currentAccount;
                tL_peerUser2.user_id = yac.h(i25).e();
                i26 = ((e) pqbVar).currentAccount;
                r47 r47Var2 = new r47(i26, tL_message, true, false);
                r47Var2.T = 1L;
                r47Var2.S1 = false;
                arrayList.add(r47Var2);
            }
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            if (pqbVar.L1 < 0) {
                chat = pqbVar.getMessagesController().M0(Long.valueOf(-pqbVar.L1));
            } else {
                chat = null;
            }
            if (chat != null) {
                tL_message2.message = ob6.M0(2131752430, null);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                tL_message3.message = ob6.M0(2131752428, null);
                i23 = ((e) pqbVar).currentAccount;
                r47 r47Var3 = new r47(i23, tL_message3, true, false);
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message2.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = chat.id;
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message2.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = chat.id;
                r47Var = r47Var3;
            } else {
                if (pqbVar.L1 != 0) {
                    tL_message2.message = ob6.M0(2131753739, null);
                } else if (pqbVar.D1 instanceof yvc) {
                    tL_message2.message = ob6.M0(2131753741, null);
                } else {
                    tL_message2.message = ob6.M0(2131753733, null);
                }
                tL_message2.from_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_message2.peer_id = tL_peerUser3;
                i18 = ((e) pqbVar).currentAccount;
                tL_peerUser3.user_id = yac.h(i18).e();
                r47Var = null;
            }
            int i28 = currentTimeMillis - 3540;
            tL_message2.date = i28;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = 265;
            tL_message2.id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            i19 = ((e) pqbVar).currentAccount;
            r47 r47Var4 = new r47(i19, tL_message2, r47Var, true, false);
            if (r47Var != null) {
                r47Var4.D0 = ob6.M0(2131752429, null);
            }
            r47Var4.T = 1L;
            r47Var4.S1 = false;
            arrayList.add(r47Var4);
            if (pqbVar.L1 != 0 && pqbVar.s0 == null) {
                TLRPC.User X1 = pqbVar.getMessagesController().X1(Long.valueOf(pqbVar.L1));
                TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                tL_message4.message = "";
                i20 = ((e) pqbVar).currentAccount;
                r47 r47Var5 = new r47(i20, tL_message4, true, false);
                r47Var5.T = 1L;
                r47Var5.U = 5;
                arrayList.add(r47Var5);
                TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
                if (X1 != null) {
                    tL_message5.message = ob6.a0(null, null, 2131752208, lbc.k(X1, true));
                } else {
                    tL_message5.message = ob6.M0(2131752431, null);
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
                i21 = ((e) pqbVar).currentAccount;
                tL_peerUser4.user_id = yac.h(i21).e();
                i22 = ((e) pqbVar).currentAccount;
                r47 r47Var6 = new r47(i22, tL_message5, true, false);
                r47Var6.T = 1L;
                r47Var6.S1 = false;
                r47Var6.U = 1;
                arrayList.add(r47Var6);
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
            tL_documentAttributeFilename.file_name = ob6.M0(2131748007, null).concat(".mp3");
            tL_message6.media.document.attributes.add(tL_documentAttributeFilename);
            int i29 = currentTimeMillis - 3540;
            tL_message6.date = i29;
            tL_message6.dialog_id = 1L;
            tL_message6.flags = 259;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message6.from_id = tL_peerUser5;
            tL_peerUser5.user_id = yac.h(yac.t0).e();
            tL_message6.id = 1;
            tL_message6.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message6.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            r47 r47Var7 = new r47(yac.t0, tL_message6, true, false);
            boolean z3 = f11.a;
            TLRPC.TL_message tL_message7 = new TLRPC.TL_message();
            String M0 = ob6.M0(2131748010, null);
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
            tL_peerUser7.user_id = yac.h(yac.t0).e();
            tL_message7.id = 1;
            tL_message7.media = new TLRPC.TL_messageMediaEmpty();
            tL_message7.out = true;
            TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
            tL_message7.peer_id = tL_peerUser8;
            tL_peerUser8.user_id = 0L;
            r47 r47Var8 = new r47(yac.t0, tL_message7, true, false);
            r47Var8.S1 = false;
            r47Var8.T = 1L;
            arrayList.add(r47Var8);
            TLRPC.TL_message tL_message8 = new TLRPC.TL_message();
            tL_message8.message = ob6.M0(2131748011, null);
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
            tL_peerUser9.user_id = yac.h(yac.t0).e();
            r47 r47Var9 = new r47(yac.t0, tL_message8, true, false);
            r47Var9.D0 = ob6.M0(2131748009, null);
            r47Var8.D0 = "Test User";
            r47Var9.T = 1L;
            r47Var9.S1 = false;
            r47Var9.C = r47Var7;
            r47Var8.C = r47Var9;
            arrayList.add(r47Var9);
            arrayList.add(r47Var7);
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
            i17 = ((e) pqbVar).currentAccount;
            r47 r47Var10 = new r47(i17, tL_message9, true, false);
            r47Var10.i0 = 1;
            r47Var10.b0 = 0.3f;
            r47Var10.E0 = true;
            arrayList.add(r47Var10);
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
            i13 = ((e) pqbVar).currentAccount;
            uc7.s1(i13).j4(arrayList2, true);
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
            i14 = ((e) pqbVar).currentAccount;
            arrayList.add(new r47(i14, tL_message10, true, false));
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
            i15 = ((e) pqbVar).currentAccount;
            arrayList.add(new r47(i15, tL_message11, true, false));
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
            i16 = ((e) pqbVar).currentAccount;
            arrayList.add(new r47(i16, tL_message12, true, false));
        } else {
            TLRPC.TL_message tL_message13 = new TLRPC.TL_message();
            tL_message13.message = ob6.M0(2131743808, null);
            int i31 = currentTimeMillis - 3540;
            tL_message13.date = i31;
            tL_message13.dialog_id = 1L;
            tL_message13.flags = 259;
            TLRPC.TL_peerUser tL_peerUser14 = new TLRPC.TL_peerUser();
            tL_message13.from_id = tL_peerUser14;
            i = ((e) pqbVar).currentAccount;
            tL_peerUser14.user_id = yac.h(i).e();
            tL_message13.id = 1;
            tL_message13.media = new TLRPC.TL_messageMediaEmpty();
            tL_message13.out = true;
            TLRPC.TL_peerUser tL_peerUser15 = new TLRPC.TL_peerUser();
            tL_message13.peer_id = tL_peerUser15;
            tL_peerUser15.user_id = 0L;
            i2 = ((e) pqbVar).currentAccount;
            r47 r47Var11 = new r47(i2, tL_message13, true, false);
            TLRPC.TL_message tL_message14 = new TLRPC.TL_message();
            tL_message14.message = ob6.M0(2131743807, null);
            tL_message14.date = currentTimeMillis - 2640;
            tL_message14.dialog_id = 1L;
            tL_message14.flags = 259;
            TLRPC.TL_peerUser tL_peerUser16 = new TLRPC.TL_peerUser();
            tL_message14.from_id = tL_peerUser16;
            i3 = ((e) pqbVar).currentAccount;
            tL_peerUser16.user_id = yac.h(i3).e();
            tL_message14.id = 1;
            tL_message14.media = new TLRPC.TL_messageMediaEmpty();
            tL_message14.out = true;
            TLRPC.TL_peerUser tL_peerUser17 = new TLRPC.TL_peerUser();
            tL_message14.peer_id = tL_peerUser17;
            tL_peerUser17.user_id = 0L;
            i4 = ((e) pqbVar).currentAccount;
            arrayList.add(new r47(i4, tL_message14, true, false));
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
            tL_documentAttributeAudio2.performer = ob6.M0(2131743803, null);
            tL_documentAttributeAudio2.title = ob6.M0(2131743802, null);
            tL_message15.media.document.attributes.add(tL_documentAttributeAudio2);
            tL_message15.out = false;
            TLRPC.TL_peerUser tL_peerUser18 = new TLRPC.TL_peerUser();
            tL_message15.peer_id = tL_peerUser18;
            i5 = ((e) pqbVar).currentAccount;
            tL_peerUser18.user_id = yac.h(i5).e();
            i6 = ((e) pqbVar).currentAccount;
            arrayList.add(new r47(i6, tL_message15, true, false));
            TLRPC.TL_message tL_message16 = new TLRPC.TL_message();
            tL_message16.message = ob6.M0(2131743806, null);
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
            i7 = ((e) pqbVar).currentAccount;
            tL_peerUser19.user_id = yac.h(i7).e();
            i8 = ((e) pqbVar).currentAccount;
            r47 r47Var12 = new r47(i8, tL_message16, true, false);
            r47Var12.D0 = ob6.M0(2131743805, null);
            r47Var12.C = r47Var11;
            arrayList.add(r47Var12);
            TLRPC.TL_message tL_message17 = new TLRPC.TL_message();
            tL_message17.date = currentTimeMillis - 3480;
            tL_message17.dialog_id = 1L;
            tL_message17.flags = 259;
            TLRPC.TL_peerUser tL_peerUser20 = new TLRPC.TL_peerUser();
            tL_message17.from_id = tL_peerUser20;
            i9 = ((e) pqbVar).currentAccount;
            tL_peerUser20.user_id = yac.h(i9).e();
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
            i10 = ((e) pqbVar).currentAccount;
            r47 r47Var13 = new r47(i10, tL_message17, true, false);
            r47Var13.i0 = 1;
            r47Var13.b0 = 0.3f;
            r47Var13.E0 = true;
            arrayList.add(r47Var13);
            arrayList.add(r47Var11);
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
            tL_message18.message = ob6.M0(2131743804, null);
            tL_message18.out = false;
            TLRPC.TL_peerUser tL_peerUser22 = new TLRPC.TL_peerUser();
            tL_message18.peer_id = tL_peerUser22;
            i11 = ((e) pqbVar).currentAccount;
            tL_peerUser22.user_id = yac.h(i11).e();
            i12 = ((e) pqbVar).currentAccount;
            r47 r47Var14 = new r47(i12, tL_message18, true, false);
            r47Var14.E0 = true;
            arrayList.add(r47Var14);
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        return false;
    }

    public final boolean E() {
        pqb pqbVar = this.f;
        byte b = pqbVar.b;
        if (pqbVar.B0 == null || b != 1 || pqbVar.n != 3 || pqbVar.w.g == 0) {
            if (pqbVar.A0 != null) {
                if (b != 2 && (b != 1 || pqbVar.n != 2)) {
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
                return ((r47) arrayList.get(i)).U;
            }
            return 4;
        }
        return 4;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = f89Var.f;
        if (i2 != 2 && i2 != 3) {
            if (E()) {
                i--;
            }
            ArrayList arrayList = this.d;
            r47 r47Var = (r47) arrayList.get(i);
            View view = f89Var.a;
            boolean z4 = view instanceof wb2;
            pqb pqbVar = this.f;
            if (z4) {
                wb2 wb2Var = (wb2) view;
                boolean z5 = false;
                wb2Var.f6 = false;
                int i3 = i - 1;
                int d = d(i3);
                int i4 = i + 1;
                int d2 = d(i4);
                if (!(r47Var.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == f89Var.f) {
                    r47 r47Var2 = (r47) arrayList.get(i3);
                    if (r47Var2.O3() == r47Var.O3() && Math.abs(r47Var2.k.date - r47Var.k.date) <= 300) {
                        z = true;
                        if (d2 != f89Var.f && i4 < arrayList.size()) {
                            r47 r47Var3 = (r47) arrayList.get(i4);
                            if (!(r47Var3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && r47Var3.O3() == r47Var.O3() && Math.abs(r47Var3.k.date - r47Var.k.date) <= 300) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z2 = z3;
                        } else {
                            z2 = false;
                        }
                        if (!this.e || pqbVar.L1 < 0) {
                            z5 = true;
                        }
                        wb2Var.f6 = z5;
                        wb2Var.setFullyDraw(true);
                        wb2Var.z3(r47Var, null, z, z2, false, false);
                    }
                }
                z = false;
                if (d2 != f89Var.f) {
                }
                z2 = false;
                if (!this.e) {
                }
                z5 = true;
                wb2Var.f6 = z5;
                wb2Var.setFullyDraw(true);
                wb2Var.z3(r47Var, null, z, z2, false, false);
            } else if (view instanceof dl1) {
                dl1 dl1Var = (dl1) view;
                dl1Var.setMessageObject(r47Var);
                dl1Var.setAlpha(1.0f);
                pqbVar.X0();
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        ir8 ir8Var;
        wb2 wb2Var;
        int i2;
        pqb pqbVar = this.f;
        if (i == 0) {
            i2 = ((e) pqbVar).currentAccount;
            wb2 wb2Var2 = new wb2(this.c, i2, false, null, new gd(this, (byte) 4));
            wb2Var2.setDelegate(new z6f((byte) 27));
            wb2Var = wb2Var2;
        } else {
            Context context = this.c;
            if (i == 1) {
                dl1 dl1Var = new dl1(pqbVar.a, context, false);
                dl1Var.setDelegate(new faf((byte) 27));
                wb2Var = dl1Var;
            } else {
                if (i == 2) {
                    if (pqbVar.A0.getParent() != null) {
                        ((ViewGroup) pqbVar.A0.getParent()).removeView(pqbVar.A0);
                    }
                    ir8Var = new ir8(context, (byte) 15);
                    ir8Var.addView(pqbVar.A0, tre.e(-1, 76, 17));
                } else if (i == 5) {
                    wb2Var = new t62(pqbVar.getParentActivity(), (byte) 28);
                } else {
                    if (pqbVar.B0.getParent() != null) {
                        ((ViewGroup) pqbVar.B0.getParent()).removeView(pqbVar.B0);
                    }
                    ir8Var = new ir8(context, (byte) 16);
                    ir8Var.addView(pqbVar.B0, tre.e(-1, 76, 17));
                }
                wb2Var = ir8Var;
            }
        }
        return qu6.h(wb2Var, wb2Var, -1, -2);
    }
}
