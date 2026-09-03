package gg;

import java.util.ArrayList;
import java.util.regex.Pattern;
import lh.s7;
import lh.t7;
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
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.z80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tq;
public final class c0 implements RequestDelegate {
    public final int f6576a;
    public final long f6577b;
    public final Object f6578c;
    public final Object d;

    public c0(Object obj, long j10, Object obj2, int i10) {
        this.f6576a = i10;
        this.f6578c = obj;
        this.f6577b = j10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f6576a;
        long j10 = this.f6577b;
        Object obj = this.d;
        Object obj2 = this.f6578c;
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
                        if (chat.f19159id != j10 && ChatObject.isBoostSupported(chat)) {
                            arrayList.add(inputPeer);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ff.c(3, b2Var, arrayList));
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new lh.c2((t7) obj2, (Object) tLObject, this.f6577b, (Object) ((Utilities.Callback) obj), 4));
                return;
            case 2:
                s7 s7Var = (s7) obj;
                s7Var.getClass();
                AndroidUtilities.runOnUIThread(new kh.g1(s7Var, tLObject, (MessagesController) obj2, tL_error, this.f6577b, 6));
                return;
            case 3:
                nh.e1 e1Var = (nh.e1) obj2;
                int[] iArr = (int[]) obj;
                int i12 = e1Var.e;
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
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f6577b, (Runnable) obj, tLObject, tL_error);
                return;
            case 5:
                final oj0 oj0Var = (oj0) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                int i15 = oj0Var.f27579f;
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
                    final z80 z80Var = new z80(10, oj0Var, arrayList7);
                    if (ChatObject.isChannel(chat2)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i15).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i15).getInputChannel(chat2.f19159id);
                        ConnectionsManager.getInstance(i15).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r6) {
                                    case 0:
                                        final oj0 oj0Var2 = oj0Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final z80 z80Var2 = z80Var;
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
                                                                MessagesController.getInstance(oj0Var2.f27579f).putUser(user, false);
                                                                int indexOf = arrayList8.indexOf(Long.valueOf(user.f19306id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList9.add(new nj0(((Integer) arrayList10.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        z80Var2.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                                MessagesController.getInstance(oj0Var2.f27579f).putUser(user2, false);
                                                                int indexOf2 = arrayList8.indexOf(Long.valueOf(user2.f19306id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList9.add(new nj0(((Integer) arrayList10.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        z80Var2.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final oj0 oj0Var3 = oj0Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final z80 z80Var3 = z80Var;
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
                                                                MessagesController.getInstance(oj0Var3.f27579f).putUser(user, false);
                                                                int indexOf = arrayList11.indexOf(Long.valueOf(user.f19306id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList12.add(new nj0(((Integer) arrayList13.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        z80Var3.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                                MessagesController.getInstance(oj0Var3.f27579f).putUser(user2, false);
                                                                int indexOf2 = arrayList11.indexOf(Long.valueOf(user2.f19306id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList12.add(new nj0(((Integer) arrayList13.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        z80Var3.run();
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
                    tL_messages_getFullChat.chat_id = chat2.f19159id;
                    ConnectionsManager.getInstance(i15).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r6) {
                                case 0:
                                    final oj0 oj0Var2 = oj0Var;
                                    final ArrayList arrayList8 = arrayList4;
                                    final ArrayList arrayList9 = arrayList7;
                                    final ArrayList arrayList10 = arrayList5;
                                    final z80 z80Var2 = z80Var;
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
                                                            MessagesController.getInstance(oj0Var2.f27579f).putUser(user, false);
                                                            int indexOf = arrayList8.indexOf(Long.valueOf(user.f19306id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList9.add(new nj0(((Integer) arrayList10.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    z80Var2.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                            MessagesController.getInstance(oj0Var2.f27579f).putUser(user2, false);
                                                            int indexOf2 = arrayList8.indexOf(Long.valueOf(user2.f19306id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList9.add(new nj0(((Integer) arrayList10.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    z80Var2.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final oj0 oj0Var3 = oj0Var;
                                    final ArrayList arrayList11 = arrayList4;
                                    final ArrayList arrayList12 = arrayList7;
                                    final ArrayList arrayList13 = arrayList5;
                                    final z80 z80Var3 = z80Var;
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
                                                            MessagesController.getInstance(oj0Var3.f27579f).putUser(user, false);
                                                            int indexOf = arrayList11.indexOf(Long.valueOf(user.f19306id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList12.add(new nj0(((Integer) arrayList13.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    z80Var3.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                            MessagesController.getInstance(oj0Var3.f27579f).putUser(user2, false);
                                                            int indexOf2 = arrayList11.indexOf(Long.valueOf(user2.f19306id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList12.add(new nj0(((Integer) arrayList13.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    z80Var3.run();
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
                Pattern pattern = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new di(tLObject, (MessagesController) obj2, this.f6577b, (tq) obj, 8));
                return;
        }
    }

    public c0(s7 s7Var, MessagesController messagesController, long j10) {
        this.f6576a = 2;
        this.d = s7Var;
        this.f6578c = messagesController;
        this.f6577b = j10;
    }

    public c0(nh.e1 e1Var, int[] iArr, long j10) {
        this.f6576a = 3;
        this.f6578c = e1Var;
        this.d = iArr;
        this.f6577b = j10;
    }
}
