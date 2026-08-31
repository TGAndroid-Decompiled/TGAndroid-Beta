package hg;

import java.util.ArrayList;
import java.util.regex.Pattern;
import mh.s7;
import mh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.di;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sq;
public final class c0 implements RequestDelegate {
    public final int f7428a;
    public final long f7429b;
    public final Object f7430c;
    public final Object d;

    public c0(Object obj, long j10, Object obj2, int i10) {
        this.f7428a = i10;
        this.f7430c = obj;
        this.f7429b = j10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f7428a;
        long j10 = this.f7429b;
        Object obj = this.d;
        Object obj2 = this.f7430c;
        switch (i10) {
            case 0:
                MessagesController messagesController = (MessagesController) obj2;
                b2 b2Var = (b2) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putChats(tL_contacts_found.chats, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < tL_contacts_found.chats.size(); i11++) {
                        TLRPC.Chat chat = tL_contacts_found.chats.get(i11);
                        TLRPC.InputPeer inputPeer = MessagesController.getInputPeer(chat);
                        if (chat.f20843id != j10 && ChatObject.isBoostSupported(chat)) {
                            arrayList.add(inputPeer);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new gf.c(5, b2Var, arrayList));
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mh.b2((t7) obj2, (Object) tLObject, this.f7429b, (Object) ((Utilities.Callback) obj), 4));
                return;
            case 2:
                s7 s7Var = (s7) obj;
                s7Var.getClass();
                AndroidUtilities.runOnUIThread(new lh.g1(s7Var, tLObject, (MessagesController) obj2, tL_error, this.f7429b, 6));
                return;
            case 3:
                oh.e1 e1Var = (oh.e1) obj2;
                int[] iArr = (int[]) obj;
                int i12 = e1Var.f17005e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    MessagesController.getInstance(i12).putUsers(groupparticipants.users, false);
                    MessagesController.getInstance(i12).putChats(groupparticipants.chats, false);
                    if (e1Var.B != null) {
                        UserConfig.getInstance(i12).getClientUserId();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 : iArr) {
                            ArrayList<TLRPC.GroupCallParticipant> arrayList3 = groupparticipants.participants;
                            int size = arrayList3.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 < size) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList3.get(i14);
                                    i14++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i13) {
                                        arrayList2.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i13));
                                    }
                                }
                            }
                        }
                        e1Var.B.onMediaDescriptionAvailable(j10, (VoIPService.RequestedParticipant[]) arrayList2.toArray(new VoIPService.RequestedParticipant[0]));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f7429b, (Runnable) obj, tLObject, tL_error);
                return;
            case 5:
                final qj0 qj0Var = (qj0) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                int i15 = qj0Var.f30404f;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList4 = new ArrayList();
                    final ArrayList arrayList5 = new ArrayList();
                    ArrayList<T> arrayList6 = ((Vector) tLObject).objects;
                    int size2 = arrayList6.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj3 = arrayList6.get(i16);
                        i16++;
                        if (obj3 instanceof Long) {
                            Long l10 = (Long) obj3;
                            if (j10 != l10.longValue()) {
                                arrayList4.add(l10);
                                arrayList5.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            long j11 = tL_readParticipantDate.user_id;
                            int i17 = tL_readParticipantDate.date;
                            if (j10 != j11) {
                                arrayList4.add(Long.valueOf(j11));
                                arrayList5.add(Integer.valueOf(i17));
                            }
                        }
                    }
                    arrayList4.add(Long.valueOf(j10));
                    arrayList5.add(0);
                    final ArrayList arrayList7 = new ArrayList();
                    final a90 a90Var = new a90(10, qj0Var, arrayList7);
                    if (ChatObject.isChannel(chat2)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i15).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i15).getInputChannel(chat2.f20843id);
                        ConnectionsManager.getInstance(i15).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r6) {
                                    case 0:
                                        final qj0 qj0Var2 = qj0Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final a90 a90Var2 = a90Var;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i18 = 0; i18 < tL_channels_channelParticipants.users.size(); i18++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i18);
                                                                MessagesController.getInstance(qj0Var2.f30404f).putUser(user, false);
                                                                int indexOf = arrayList8.indexOf(Long.valueOf(user.f20990id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList9.add(new pj0(((Integer) arrayList10.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        a90Var2.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                                MessagesController.getInstance(qj0Var2.f30404f).putUser(user2, false);
                                                                int indexOf2 = arrayList8.indexOf(Long.valueOf(user2.f20990id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList9.add(new pj0(((Integer) arrayList10.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        a90Var2.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final qj0 qj0Var3 = qj0Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final a90 a90Var3 = a90Var;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i18 = 0; i18 < tL_channels_channelParticipants.users.size(); i18++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i18);
                                                                MessagesController.getInstance(qj0Var3.f30404f).putUser(user, false);
                                                                int indexOf = arrayList11.indexOf(Long.valueOf(user.f20990id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList12.add(new pj0(((Integer) arrayList13.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        a90Var3.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                                MessagesController.getInstance(qj0Var3.f30404f).putUser(user2, false);
                                                                int indexOf2 = arrayList11.indexOf(Long.valueOf(user2.f20990id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList12.add(new pj0(((Integer) arrayList13.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        a90Var3.run();
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
                    tL_messages_getFullChat.chat_id = chat2.f20843id;
                    ConnectionsManager.getInstance(i15).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r6) {
                                case 0:
                                    final qj0 qj0Var2 = qj0Var;
                                    final ArrayList arrayList8 = arrayList4;
                                    final ArrayList arrayList9 = arrayList7;
                                    final ArrayList arrayList10 = arrayList5;
                                    final a90 a90Var2 = a90Var;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i18 = 0; i18 < tL_channels_channelParticipants.users.size(); i18++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i18);
                                                            MessagesController.getInstance(qj0Var2.f30404f).putUser(user, false);
                                                            int indexOf = arrayList8.indexOf(Long.valueOf(user.f20990id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList9.add(new pj0(((Integer) arrayList10.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    a90Var2.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                            MessagesController.getInstance(qj0Var2.f30404f).putUser(user2, false);
                                                            int indexOf2 = arrayList8.indexOf(Long.valueOf(user2.f20990id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList9.add(new pj0(((Integer) arrayList10.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    a90Var2.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final qj0 qj0Var3 = qj0Var;
                                    final ArrayList arrayList11 = arrayList4;
                                    final ArrayList arrayList12 = arrayList7;
                                    final ArrayList arrayList13 = arrayList5;
                                    final a90 a90Var3 = a90Var;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i18 = 0; i18 < tL_channels_channelParticipants.users.size(); i18++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i18);
                                                            MessagesController.getInstance(qj0Var3.f30404f).putUser(user, false);
                                                            int indexOf = arrayList11.indexOf(Long.valueOf(user.f20990id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList12.add(new pj0(((Integer) arrayList13.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    a90Var3.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                            MessagesController.getInstance(qj0Var3.f30404f).putUser(user2, false);
                                                            int indexOf2 = arrayList11.indexOf(Long.valueOf(user2.f20990id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList12.add(new pj0(((Integer) arrayList13.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    a90Var3.run();
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
            default:
                Pattern pattern = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new di(tLObject, (MessagesController) obj2, this.f7429b, (sq) obj, 8));
                return;
        }
    }

    public c0(s7 s7Var, MessagesController messagesController, long j10) {
        this.f7428a = 2;
        this.d = s7Var;
        this.f7430c = messagesController;
        this.f7429b = j10;
    }

    public c0(oh.e1 e1Var, int[] iArr, long j10) {
        this.f7428a = 3;
        this.f7430c = e1Var;
        this.d = iArr;
        this.f7429b = j10;
    }
}
