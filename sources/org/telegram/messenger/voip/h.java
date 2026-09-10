package org.telegram.messenger.voip;

import bi.ua;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.x1;
import org.telegram.ui.ya0;
import org.telegram.ui.zq;
import xh.u5;
import xh.v5;
public final class h implements RequestDelegate {
    public final int f16728a;
    public final long f16729b;
    public final Object f16730c;
    public final Object d;

    public h(Object obj, long j3, Object obj2, int i10) {
        this.f16728a = i10;
        this.f16730c = obj;
        this.f16729b = j3;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16728a;
        long j3 = this.f16729b;
        Object obj = this.d;
        Object obj2 = this.f16730c;
        switch (i10) {
            case 0:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f16729b, (Runnable) obj, tLObject, tL_error);
                return;
            case 1:
                final pj0 pj0Var = (pj0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i11 = pj0Var.f26146f;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList = new ArrayList();
                    final ArrayList arrayList2 = new ArrayList();
                    ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        if (obj3 instanceof Long) {
                            Long l4 = (Long) obj3;
                            if (j3 != l4.longValue()) {
                                arrayList.add(l4);
                                arrayList2.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            long j10 = tL_readParticipantDate.user_id;
                            int i13 = tL_readParticipantDate.date;
                            if (j3 != j10) {
                                arrayList.add(Long.valueOf(j10));
                                arrayList2.add(Integer.valueOf(i13));
                            }
                        }
                    }
                    arrayList.add(Long.valueOf(j3));
                    arrayList2.add(0);
                    final ArrayList arrayList4 = new ArrayList();
                    final hy hyVar = new hy(26, pj0Var, arrayList4);
                    if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i11).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i11).getInputChannel(chat.f17195id);
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r6) {
                                    case 0:
                                        final pj0 pj0Var2 = pj0Var;
                                        final ArrayList arrayList5 = arrayList;
                                        final ArrayList arrayList6 = arrayList4;
                                        final ArrayList arrayList7 = arrayList2;
                                        final hy hyVar2 = hyVar;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i14 = 0; i14 < tL_channels_channelParticipants.users.size(); i14++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i14);
                                                                MessagesController.getInstance(pj0Var2.f26146f).putUser(user, false);
                                                                int indexOf = arrayList5.indexOf(Long.valueOf(user.f17342id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList6.add(new oj0(((Integer) arrayList7.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        hyVar2.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i15 = 0; i15 < tL_messages_chatFull.users.size(); i15++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i15);
                                                                MessagesController.getInstance(pj0Var2.f26146f).putUser(user2, false);
                                                                int indexOf2 = arrayList5.indexOf(Long.valueOf(user2.f17342id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList6.add(new oj0(((Integer) arrayList7.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        hyVar2.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final pj0 pj0Var3 = pj0Var;
                                        final ArrayList arrayList8 = arrayList;
                                        final ArrayList arrayList9 = arrayList4;
                                        final ArrayList arrayList10 = arrayList2;
                                        final hy hyVar3 = hyVar;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i14 = 0; i14 < tL_channels_channelParticipants.users.size(); i14++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i14);
                                                                MessagesController.getInstance(pj0Var3.f26146f).putUser(user, false);
                                                                int indexOf = arrayList8.indexOf(Long.valueOf(user.f17342id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList9.add(new oj0(((Integer) arrayList10.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        hyVar3.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i15 = 0; i15 < tL_messages_chatFull.users.size(); i15++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i15);
                                                                MessagesController.getInstance(pj0Var3.f26146f).putUser(user2, false);
                                                                int indexOf2 = arrayList8.indexOf(Long.valueOf(user2.f17342id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList9.add(new oj0(((Integer) arrayList10.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        hyVar3.run();
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
                    tL_messages_getFullChat.chat_id = chat.f17195id;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r6) {
                                case 0:
                                    final pj0 pj0Var2 = pj0Var;
                                    final ArrayList arrayList5 = arrayList;
                                    final ArrayList arrayList6 = arrayList4;
                                    final ArrayList arrayList7 = arrayList2;
                                    final hy hyVar2 = hyVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i14 = 0; i14 < tL_channels_channelParticipants.users.size(); i14++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i14);
                                                            MessagesController.getInstance(pj0Var2.f26146f).putUser(user, false);
                                                            int indexOf = arrayList5.indexOf(Long.valueOf(user.f17342id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList6.add(new oj0(((Integer) arrayList7.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    hyVar2.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i15 = 0; i15 < tL_messages_chatFull.users.size(); i15++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i15);
                                                            MessagesController.getInstance(pj0Var2.f26146f).putUser(user2, false);
                                                            int indexOf2 = arrayList5.indexOf(Long.valueOf(user2.f17342id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList6.add(new oj0(((Integer) arrayList7.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    hyVar2.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final pj0 pj0Var3 = pj0Var;
                                    final ArrayList arrayList8 = arrayList;
                                    final ArrayList arrayList9 = arrayList4;
                                    final ArrayList arrayList10 = arrayList2;
                                    final hy hyVar3 = hyVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i14 = 0; i14 < tL_channels_channelParticipants.users.size(); i14++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i14);
                                                            MessagesController.getInstance(pj0Var3.f26146f).putUser(user, false);
                                                            int indexOf = arrayList8.indexOf(Long.valueOf(user.f17342id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList9.add(new oj0(((Integer) arrayList10.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    hyVar3.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i15 = 0; i15 < tL_messages_chatFull.users.size(); i15++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i15);
                                                            MessagesController.getInstance(pj0Var3.f26146f).putUser(user2, false);
                                                            int indexOf2 = arrayList8.indexOf(Long.valueOf(user2.f17342id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList9.add(new oj0(((Integer) arrayList10.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    hyVar3.run();
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
            case 2:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new ua(tLObject, (MessagesController) obj2, this.f16729b, (zq) obj, 29, false));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) obj2;
                sg.y0 y0Var = (sg.y0) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putChats(tL_contacts_found.chats, false);
                    ArrayList arrayList5 = new ArrayList();
                    for (int i14 = 0; i14 < tL_contacts_found.chats.size(); i14++) {
                        TLRPC.Chat chat2 = tL_contacts_found.chats.get(i14);
                        TLRPC.InputPeer inputPeer = MessagesController.getInputPeer(chat2);
                        if (chat2.f17195id != j3 && ChatObject.isBoostSupported(chat2)) {
                            arrayList5.add(inputPeer);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new x1(18, y0Var, arrayList5));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ya0((v5) obj2, tLObject, this.f16729b, (Utilities.Callback) obj, 6));
                return;
            case 5:
                u5 u5Var = (u5) obj2;
                u5Var.getClass();
                AndroidUtilities.runOnUIThread(new g(u5Var, tLObject, (MessagesController) obj, tL_error, this.f16729b));
                return;
            default:
                zh.t0 t0Var = (zh.t0) obj2;
                int[] iArr = (int[]) obj;
                int i15 = t0Var.e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    MessagesController.getInstance(i15).putUsers(groupparticipants.users, false);
                    MessagesController.getInstance(i15).putChats(groupparticipants.chats, false);
                    if (t0Var.E != null) {
                        UserConfig.getInstance(i15).getClientUserId();
                        ArrayList arrayList6 = new ArrayList();
                        for (int i16 : iArr) {
                            ArrayList<TLRPC.GroupCallParticipant> arrayList7 = groupparticipants.participants;
                            int size2 = arrayList7.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 < size2) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList7.get(i17);
                                    i17++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i16) {
                                        arrayList6.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i16));
                                    }
                                }
                            }
                        }
                        t0Var.E.onMediaDescriptionAvailable(j3, (VoIPService.RequestedParticipant[]) arrayList6.toArray(new VoIPService.RequestedParticipant[0]));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public h(Object obj, Object obj2, long j3, int i10) {
        this.f16728a = i10;
        this.f16730c = obj;
        this.d = obj2;
        this.f16729b = j3;
    }
}
