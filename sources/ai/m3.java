package ai;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.yt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jq;
public final class m3 implements RequestDelegate {
    public final int f1810a;
    public final long f1811b;
    public final Object f1812c;
    public final Object d;

    public m3(Object obj, long j10, Object obj2, int i10) {
        this.f1810a = i10;
        this.f1812c = obj;
        this.f1811b = j10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f1810a;
        long j10 = this.f1811b;
        Object obj = this.d;
        Object obj2 = this.f1812c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new z((l7) obj2, (pf.c) obj, tLObject, this.f1811b, tL_error, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new c3((ga) obj2, (Object) tLObject, this.f1811b, (Object) ((Utilities.Callback) obj), 4));
                return;
            case 2:
                fa faVar = (fa) obj2;
                faVar.getClass();
                AndroidUtilities.runOnUIThread(new z(faVar, tLObject, (MessagesController) obj, tL_error, this.f1811b));
                return;
            case 3:
                ci.h1 h1Var = (ci.h1) obj2;
                int[] iArr = (int[]) obj;
                int i11 = h1Var.e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    MessagesController.getInstance(i11).putUsers(groupparticipants.users, false);
                    MessagesController.getInstance(i11).putChats(groupparticipants.chats, false);
                    if (h1Var.E != null) {
                        UserConfig.getInstance(i11).getClientUserId();
                        ArrayList arrayList = new ArrayList();
                        for (int i12 : iArr) {
                            ArrayList<TLRPC.GroupCallParticipant> arrayList2 = groupparticipants.participants;
                            int size = arrayList2.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList2.get(i13);
                                    i13++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i12) {
                                        arrayList.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i12));
                                    }
                                }
                            }
                        }
                        h1Var.E.onMediaDescriptionAvailable(j10, (VoIPService.RequestedParticipant[]) arrayList.toArray(new VoIPService.RequestedParticipant[0]));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f1811b, (Runnable) obj, tLObject, tL_error);
                return;
            case 5:
                final ck0 ck0Var = (ck0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i14 = ck0Var.f25225f;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList3 = new ArrayList();
                    final ArrayList arrayList4 = new ArrayList();
                    ArrayList<T> arrayList5 = ((Vector) tLObject).objects;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj3 = arrayList5.get(i15);
                        i15++;
                        if (obj3 instanceof Long) {
                            Long l4 = (Long) obj3;
                            if (j10 != l4.longValue()) {
                                arrayList3.add(l4);
                                arrayList4.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            long j11 = tL_readParticipantDate.user_id;
                            int i16 = tL_readParticipantDate.date;
                            if (j10 != j11) {
                                arrayList3.add(Long.valueOf(j11));
                                arrayList4.add(Integer.valueOf(i16));
                            }
                        }
                    }
                    arrayList3.add(Long.valueOf(j10));
                    arrayList4.add(0);
                    final ArrayList arrayList6 = new ArrayList();
                    final yt ytVar = new yt(29, ck0Var, arrayList6);
                    if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i14).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i14).getInputChannel(chat.f20273id);
                        ConnectionsManager.getInstance(i14).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r6) {
                                    case 0:
                                        final ck0 ck0Var2 = ck0Var;
                                        final ArrayList arrayList7 = arrayList3;
                                        final ArrayList arrayList8 = arrayList6;
                                        final ArrayList arrayList9 = arrayList4;
                                        final yt ytVar2 = ytVar;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i17 = 0; i17 < tL_channels_channelParticipants.users.size(); i17++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i17);
                                                                MessagesController.getInstance(ck0Var2.f25225f).putUser(user, false);
                                                                int indexOf = arrayList7.indexOf(Long.valueOf(user.f20420id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList8.add(new bk0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        ytVar2.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                                MessagesController.getInstance(ck0Var2.f25225f).putUser(user2, false);
                                                                int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f20420id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList8.add(new bk0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        ytVar2.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final ck0 ck0Var3 = ck0Var;
                                        final ArrayList arrayList10 = arrayList3;
                                        final ArrayList arrayList11 = arrayList6;
                                        final ArrayList arrayList12 = arrayList4;
                                        final yt ytVar3 = ytVar;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i17 = 0; i17 < tL_channels_channelParticipants.users.size(); i17++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i17);
                                                                MessagesController.getInstance(ck0Var3.f25225f).putUser(user, false);
                                                                int indexOf = arrayList10.indexOf(Long.valueOf(user.f20420id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList11.add(new bk0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        ytVar3.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                                MessagesController.getInstance(ck0Var3.f25225f).putUser(user2, false);
                                                                int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f20420id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList11.add(new bk0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        ytVar3.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    TLRPC.TL_messages_getFullChat tL_messages_getFullChat = new TLRPC.TL_messages_getFullChat();
                    tL_messages_getFullChat.chat_id = chat.f20273id;
                    ConnectionsManager.getInstance(i14).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r6) {
                                case 0:
                                    final ck0 ck0Var2 = ck0Var;
                                    final ArrayList arrayList7 = arrayList3;
                                    final ArrayList arrayList8 = arrayList6;
                                    final ArrayList arrayList9 = arrayList4;
                                    final yt ytVar2 = ytVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i17 = 0; i17 < tL_channels_channelParticipants.users.size(); i17++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i17);
                                                            MessagesController.getInstance(ck0Var2.f25225f).putUser(user, false);
                                                            int indexOf = arrayList7.indexOf(Long.valueOf(user.f20420id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList8.add(new bk0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    ytVar2.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                            MessagesController.getInstance(ck0Var2.f25225f).putUser(user2, false);
                                                            int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f20420id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList8.add(new bk0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    ytVar2.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final ck0 ck0Var3 = ck0Var;
                                    final ArrayList arrayList10 = arrayList3;
                                    final ArrayList arrayList11 = arrayList6;
                                    final ArrayList arrayList12 = arrayList4;
                                    final yt ytVar3 = ytVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i17 = 0; i17 < tL_channels_channelParticipants.users.size(); i17++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i17);
                                                            MessagesController.getInstance(ck0Var3.f25225f).putUser(user, false);
                                                            int indexOf = arrayList10.indexOf(Long.valueOf(user.f20420id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList11.add(new bk0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    ytVar3.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                            MessagesController.getInstance(ck0Var3.f25225f).putUser(user2, false);
                                                            int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f20420id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList11.add(new bk0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    ytVar3.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 6:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new c3(tLObject, (MessagesController) obj2, this.f1811b, (jq) obj, 21));
                return;
            default:
                MessagesController messagesController = (MessagesController) obj2;
                ug.v0 v0Var = (ug.v0) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putChats(tL_contacts_found.chats, false);
                    ArrayList arrayList7 = new ArrayList();
                    for (int i17 = 0; i17 < tL_contacts_found.chats.size(); i17++) {
                        TLRPC.Chat chat2 = tL_contacts_found.chats.get(i17);
                        TLRPC.InputPeer inputPeer = MessagesController.getInputPeer(chat2);
                        if (chat2.f20273id != j10 && ChatObject.isBoostSupported(chat2)) {
                            arrayList7.add(inputPeer);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new uf.c(1, v0Var, arrayList7));
                    return;
                }
                return;
        }
    }

    public m3(Object obj, Object obj2, long j10, int i10) {
        this.f1810a = i10;
        this.f1812c = obj;
        this.d = obj2;
        this.f1811b = j10;
    }
}
