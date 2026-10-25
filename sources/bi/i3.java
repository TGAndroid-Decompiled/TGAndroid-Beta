package bi;

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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.t90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nq;
public final class i3 implements RequestDelegate {
    public final int f4822a;
    public final long f4823b;
    public final Object f4824c;
    public final Object d;

    public i3(Object obj, long j10, Object obj2, int i10) {
        this.f4822a = i10;
        this.f4824c = obj;
        this.f4823b = j10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f4822a;
        long j10 = this.f4823b;
        Object obj = this.d;
        Object obj2 = this.f4824c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a0((h7) obj2, (qf.c) obj, tLObject, this.f4823b, tL_error, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new y2((ca) obj2, (Object) tLObject, this.f4823b, (Object) ((Utilities.Callback) obj), 4));
                return;
            case 2:
                aa aaVar = (aa) obj2;
                aaVar.getClass();
                AndroidUtilities.runOnUIThread(new a0(aaVar, tLObject, (MessagesController) obj, tL_error, this.f4823b));
                return;
            case 3:
                di.h1 h1Var = (di.h1) obj2;
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
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f4823b, (Runnable) obj, tLObject, tL_error);
                return;
            case 5:
                final fk0 fk0Var = (fk0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i14 = fk0Var.f28218f;
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
                    final t90 t90Var = new t90(9, fk0Var, arrayList6);
                    if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i14).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i14).getInputChannel(chat.f22027id);
                        ConnectionsManager.getInstance(i14).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r6) {
                                    case 0:
                                        final fk0 fk0Var2 = fk0Var;
                                        final ArrayList arrayList7 = arrayList3;
                                        final ArrayList arrayList8 = arrayList6;
                                        final ArrayList arrayList9 = arrayList4;
                                        final t90 t90Var2 = t90Var;
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
                                                                MessagesController.getInstance(fk0Var2.f28218f).putUser(user, false);
                                                                int indexOf = arrayList7.indexOf(Long.valueOf(user.f22174id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList8.add(new ek0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        t90Var2.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                                MessagesController.getInstance(fk0Var2.f28218f).putUser(user2, false);
                                                                int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f22174id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList8.add(new ek0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        t90Var2.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final fk0 fk0Var3 = fk0Var;
                                        final ArrayList arrayList10 = arrayList3;
                                        final ArrayList arrayList11 = arrayList6;
                                        final ArrayList arrayList12 = arrayList4;
                                        final t90 t90Var3 = t90Var;
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
                                                                MessagesController.getInstance(fk0Var3.f28218f).putUser(user, false);
                                                                int indexOf = arrayList10.indexOf(Long.valueOf(user.f22174id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList11.add(new ek0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        t90Var3.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                                MessagesController.getInstance(fk0Var3.f28218f).putUser(user2, false);
                                                                int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f22174id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList11.add(new ek0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        t90Var3.run();
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
                    tL_messages_getFullChat.chat_id = chat.f22027id;
                    ConnectionsManager.getInstance(i14).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r6) {
                                case 0:
                                    final fk0 fk0Var2 = fk0Var;
                                    final ArrayList arrayList7 = arrayList3;
                                    final ArrayList arrayList8 = arrayList6;
                                    final ArrayList arrayList9 = arrayList4;
                                    final t90 t90Var2 = t90Var;
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
                                                            MessagesController.getInstance(fk0Var2.f28218f).putUser(user, false);
                                                            int indexOf = arrayList7.indexOf(Long.valueOf(user.f22174id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList8.add(new ek0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    t90Var2.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                            MessagesController.getInstance(fk0Var2.f28218f).putUser(user2, false);
                                                            int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f22174id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList8.add(new ek0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    t90Var2.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final fk0 fk0Var3 = fk0Var;
                                    final ArrayList arrayList10 = arrayList3;
                                    final ArrayList arrayList11 = arrayList6;
                                    final ArrayList arrayList12 = arrayList4;
                                    final t90 t90Var3 = t90Var;
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
                                                            MessagesController.getInstance(fk0Var3.f28218f).putUser(user, false);
                                                            int indexOf = arrayList10.indexOf(Long.valueOf(user.f22174id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList11.add(new ek0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    t90Var3.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                            MessagesController.getInstance(fk0Var3.f28218f).putUser(user2, false);
                                                            int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f22174id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList11.add(new ek0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    t90Var3.run();
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
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new y2(tLObject, (MessagesController) obj2, this.f4823b, (nq) obj, 21));
                return;
            default:
                MessagesController messagesController = (MessagesController) obj2;
                vg.w0 w0Var = (vg.w0) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putChats(tL_contacts_found.chats, false);
                    ArrayList arrayList7 = new ArrayList();
                    for (int i17 = 0; i17 < tL_contacts_found.chats.size(); i17++) {
                        TLRPC.Chat chat2 = tL_contacts_found.chats.get(i17);
                        TLRPC.InputPeer inputPeer = MessagesController.getInputPeer(chat2);
                        if (chat2.f22027id != j10 && ChatObject.isBoostSupported(chat2)) {
                            arrayList7.add(inputPeer);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new sg.u(19, w0Var, arrayList7));
                    return;
                }
                return;
        }
    }

    public i3(Object obj, Object obj2, long j10, int i10) {
        this.f4822a = i10;
        this.f4824c = obj;
        this.d = obj2;
        this.f4823b = j10;
    }
}
