package bg;

import gh.u7;
import gh.v7;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.lg;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jq;
public final class f0 implements RequestDelegate {
    public final int f1751a;
    public final long f1752b;
    public final Object f1753c;
    public final Object d;

    public f0(u7 u7Var, MessagesController messagesController, long j10) {
        this.f1751a = 2;
        this.d = u7Var;
        this.f1753c = messagesController;
        this.f1752b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f1751a;
        long j10 = this.f1752b;
        Object obj = this.d;
        Object obj2 = this.f1753c;
        switch (i9) {
            case 0:
                MessagesController messagesController = (MessagesController) obj2;
                l2 l2Var = (l2) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putChats(tL_contacts_found.chats, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.chats.size(); i10++) {
                        TLRPC.Chat chat = tL_contacts_found.chats.get(i10);
                        TLRPC.InputPeer inputPeer = MessagesController.getInputPeer(chat);
                        if (chat.f22380id != j10 && ChatObject.isBoostSupported(chat)) {
                            arrayList.add(inputPeer);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new a1.e(10, l2Var, arrayList));
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gh.e2((v7) obj2, (Object) tLObject, this.f1752b, (Object) ((Utilities.Callback) obj), 4));
                return;
            case 2:
                u7 u7Var = (u7) obj;
                u7Var.getClass();
                AndroidUtilities.runOnUIThread(new fh.m1(u7Var, tLObject, (MessagesController) obj2, tL_error, this.f1752b, 6));
                return;
            case 3:
                ih.f1 f1Var = (ih.f1) obj2;
                int[] iArr = (int[]) obj;
                int i11 = f1Var.f11401e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    MessagesController.getInstance(i11).putUsers(groupparticipants.users, false);
                    MessagesController.getInstance(i11).putChats(groupparticipants.chats, false);
                    if (f1Var.A != null) {
                        UserConfig.getInstance(i11).getClientUserId();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 : iArr) {
                            ArrayList<TLRPC.GroupCallParticipant> arrayList3 = groupparticipants.participants;
                            int size = arrayList3.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList3.get(i13);
                                    i13++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i12) {
                                        arrayList2.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i12));
                                    }
                                }
                            }
                        }
                        f1Var.A.onMediaDescriptionAvailable(j10, (VoIPService.RequestedParticipant[]) arrayList2.toArray(new VoIPService.RequestedParticipant[0]));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f1752b, (Runnable) obj, tLObject, tL_error);
                return;
            case 5:
                final ui0 ui0Var = (ui0) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                int i14 = ui0Var.f33036f;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList4 = new ArrayList();
                    final ArrayList arrayList5 = new ArrayList();
                    ArrayList<T> arrayList6 = ((Vector) tLObject).objects;
                    int size2 = arrayList6.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj3 = arrayList6.get(i15);
                        i15++;
                        if (obj3 instanceof Long) {
                            Long l10 = (Long) obj3;
                            if (j10 != l10.longValue()) {
                                arrayList4.add(l10);
                                arrayList5.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            long j11 = tL_readParticipantDate.user_id;
                            int i16 = tL_readParticipantDate.date;
                            if (j10 != j11) {
                                arrayList4.add(Long.valueOf(j11));
                                arrayList5.add(Integer.valueOf(i16));
                            }
                        }
                    }
                    arrayList4.add(Long.valueOf(j10));
                    arrayList5.add(0);
                    final ArrayList arrayList7 = new ArrayList();
                    final jg0 jg0Var = new jg0(5, ui0Var, arrayList7);
                    if (ChatObject.isChannel(chat2)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i14).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i14).getInputChannel(chat2.f22380id);
                        ConnectionsManager.getInstance(i14).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r6) {
                                    case 0:
                                        final ui0 ui0Var2 = ui0Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final jg0 jg0Var2 = jg0Var;
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
                                                                MessagesController.getInstance(ui0Var2.f33036f).putUser(user, false);
                                                                int indexOf = arrayList8.indexOf(Long.valueOf(user.f22527id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList9.add(new ti0(((Integer) arrayList10.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        jg0Var2.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                                MessagesController.getInstance(ui0Var2.f33036f).putUser(user2, false);
                                                                int indexOf2 = arrayList8.indexOf(Long.valueOf(user2.f22527id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList9.add(new ti0(((Integer) arrayList10.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        jg0Var2.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final ui0 ui0Var3 = ui0Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final jg0 jg0Var3 = jg0Var;
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
                                                                MessagesController.getInstance(ui0Var3.f33036f).putUser(user, false);
                                                                int indexOf = arrayList11.indexOf(Long.valueOf(user.f22527id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList12.add(new ti0(((Integer) arrayList13.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        jg0Var3.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                                MessagesController.getInstance(ui0Var3.f33036f).putUser(user2, false);
                                                                int indexOf2 = arrayList11.indexOf(Long.valueOf(user2.f22527id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList12.add(new ti0(((Integer) arrayList13.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        jg0Var3.run();
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
                    tL_messages_getFullChat.chat_id = chat2.f22380id;
                    ConnectionsManager.getInstance(i14).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r6) {
                                case 0:
                                    final ui0 ui0Var2 = ui0Var;
                                    final ArrayList arrayList8 = arrayList4;
                                    final ArrayList arrayList9 = arrayList7;
                                    final ArrayList arrayList10 = arrayList5;
                                    final jg0 jg0Var2 = jg0Var;
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
                                                            MessagesController.getInstance(ui0Var2.f33036f).putUser(user, false);
                                                            int indexOf = arrayList8.indexOf(Long.valueOf(user.f22527id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList9.add(new ti0(((Integer) arrayList10.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    jg0Var2.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                            MessagesController.getInstance(ui0Var2.f33036f).putUser(user2, false);
                                                            int indexOf2 = arrayList8.indexOf(Long.valueOf(user2.f22527id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList9.add(new ti0(((Integer) arrayList10.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    jg0Var2.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final ui0 ui0Var3 = ui0Var;
                                    final ArrayList arrayList11 = arrayList4;
                                    final ArrayList arrayList12 = arrayList7;
                                    final ArrayList arrayList13 = arrayList5;
                                    final jg0 jg0Var3 = jg0Var;
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
                                                            MessagesController.getInstance(ui0Var3.f33036f).putUser(user, false);
                                                            int indexOf = arrayList11.indexOf(Long.valueOf(user.f22527id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList12.add(new ti0(((Integer) arrayList13.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    jg0Var3.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                            MessagesController.getInstance(ui0Var3.f33036f).putUser(user2, false);
                                                            int indexOf2 = arrayList11.indexOf(Long.valueOf(user2.f22527id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList12.add(new ti0(((Integer) arrayList13.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    jg0Var3.run();
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
                Pattern pattern = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new lg(tLObject, (MessagesController) obj2, this.f1752b, (jq) obj, 9));
                return;
        }
    }

    public f0(ih.f1 f1Var, int[] iArr, long j10) {
        this.f1751a = 3;
        this.f1753c = f1Var;
        this.d = iArr;
        this.f1752b = j10;
    }

    public f0(Object obj, long j10, Object obj2, int i9) {
        this.f1751a = i9;
        this.f1753c = obj;
        this.f1752b = j10;
        this.d = obj2;
    }
}
