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
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.ny;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xq;
public final class u1 implements RequestDelegate {
    public final int f1565a;
    public final long f1566b;
    public final Object f1567c;
    public final Object d;

    public u1(Object obj, long j3, Object obj2, int i10) {
        this.f1565a = i10;
        this.f1567c = obj;
        this.f1566b = j3;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f1565a;
        long j3 = this.f1566b;
        Object obj = this.d;
        Object obj2 = this.f1567c;
        switch (i10) {
            case 0:
                d2 d2Var = (d2) obj2;
                int[] iArr = (int[]) obj;
                int i11 = d2Var.e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    MessagesController.getInstance(i11).putUsers(groupparticipants.users, false);
                    MessagesController.getInstance(i11).putChats(groupparticipants.chats, false);
                    if (d2Var.E != null) {
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
                        d2Var.E.onMediaDescriptionAvailable(j3, (VoIPService.RequestedParticipant[]) arrayList.toArray(new VoIPService.RequestedParticipant[0]));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f1566b, (Runnable) obj, tLObject, tL_error);
                return;
            case 2:
                final gj0 gj0Var = (gj0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i14 = gj0Var.f24260f;
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
                            if (j3 != l4.longValue()) {
                                arrayList3.add(l4);
                                arrayList4.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            long j10 = tL_readParticipantDate.user_id;
                            int i16 = tL_readParticipantDate.date;
                            if (j3 != j10) {
                                arrayList3.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i16));
                            }
                        }
                    }
                    arrayList3.add(Long.valueOf(j3));
                    arrayList4.add(0);
                    final ArrayList arrayList6 = new ArrayList();
                    final ny nyVar = new ny(23, gj0Var, arrayList6);
                    if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i14).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i14).getInputChannel(chat.f18121id);
                        ConnectionsManager.getInstance(i14).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r6) {
                                    case 0:
                                        final gj0 gj0Var2 = gj0Var;
                                        final ArrayList arrayList7 = arrayList3;
                                        final ArrayList arrayList8 = arrayList6;
                                        final ArrayList arrayList9 = arrayList4;
                                        final ny nyVar2 = nyVar;
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
                                                                MessagesController.getInstance(gj0Var2.f24260f).putUser(user, false);
                                                                int indexOf = arrayList7.indexOf(Long.valueOf(user.f18268id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList8.add(new fj0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        nyVar2.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                                MessagesController.getInstance(gj0Var2.f24260f).putUser(user2, false);
                                                                int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f18268id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList8.add(new fj0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        nyVar2.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final gj0 gj0Var3 = gj0Var;
                                        final ArrayList arrayList10 = arrayList3;
                                        final ArrayList arrayList11 = arrayList6;
                                        final ArrayList arrayList12 = arrayList4;
                                        final ny nyVar3 = nyVar;
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
                                                                MessagesController.getInstance(gj0Var3.f24260f).putUser(user, false);
                                                                int indexOf = arrayList10.indexOf(Long.valueOf(user.f18268id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList11.add(new fj0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        nyVar3.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                                MessagesController.getInstance(gj0Var3.f24260f).putUser(user2, false);
                                                                int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f18268id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList11.add(new fj0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        nyVar3.run();
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
                    tL_messages_getFullChat.chat_id = chat.f18121id;
                    ConnectionsManager.getInstance(i14).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r6) {
                                case 0:
                                    final gj0 gj0Var2 = gj0Var;
                                    final ArrayList arrayList7 = arrayList3;
                                    final ArrayList arrayList8 = arrayList6;
                                    final ArrayList arrayList9 = arrayList4;
                                    final ny nyVar2 = nyVar;
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
                                                            MessagesController.getInstance(gj0Var2.f24260f).putUser(user, false);
                                                            int indexOf = arrayList7.indexOf(Long.valueOf(user.f18268id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList8.add(new fj0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    nyVar2.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                            MessagesController.getInstance(gj0Var2.f24260f).putUser(user2, false);
                                                            int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f18268id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList8.add(new fj0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    nyVar2.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final gj0 gj0Var3 = gj0Var;
                                    final ArrayList arrayList10 = arrayList3;
                                    final ArrayList arrayList11 = arrayList6;
                                    final ArrayList arrayList12 = arrayList4;
                                    final ny nyVar3 = nyVar;
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
                                                            MessagesController.getInstance(gj0Var3.f24260f).putUser(user, false);
                                                            int indexOf = arrayList10.indexOf(Long.valueOf(user.f18268id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList11.add(new fj0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    nyVar3.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                            MessagesController.getInstance(gj0Var3.f24260f).putUser(user2, false);
                                                            int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f18268id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList11.add(new fj0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    nyVar3.run();
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
            case 3:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new k21(tLObject, (MessagesController) obj2, this.f1566b, (xq) obj, 3));
                return;
            case 4:
                MessagesController messagesController = (MessagesController) obj2;
                tg.x0 x0Var = (tg.x0) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putChats(tL_contacts_found.chats, false);
                    ArrayList arrayList7 = new ArrayList();
                    for (int i17 = 0; i17 < tL_contacts_found.chats.size(); i17++) {
                        TLRPC.Chat chat2 = tL_contacts_found.chats.get(i17);
                        TLRPC.InputPeer inputPeer = MessagesController.getInputPeer(chat2);
                        if (chat2.f18121id != j3 && ChatObject.isBoostSupported(chat2)) {
                            arrayList7.add(inputPeer);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new p2.b(17, x0Var, arrayList7));
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new k21((yh.v5) obj2, tLObject, this.f1566b, (Utilities.Callback) obj, 10));
                return;
            default:
                yh.u5 u5Var = (yh.u5) obj2;
                u5Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(u5Var, tLObject, (MessagesController) obj, tL_error, this.f1566b));
                return;
        }
    }

    public u1(Object obj, Object obj2, long j3, int i10) {
        this.f1565a = i10;
        this.f1567c = obj;
        this.d = obj2;
        this.f1566b = j3;
    }
}
