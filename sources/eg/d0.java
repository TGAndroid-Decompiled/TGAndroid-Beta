package eg;

import java.util.ArrayList;
import java.util.regex.Pattern;
import jh.r7;
import jh.s7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sg;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lq;
public final class d0 implements RequestDelegate {
    public final int f5960a;
    public final long f5961b;
    public final Object f5962c;
    public final Object d;

    public d0(Object obj, long j10, Object obj2, int i10) {
        this.f5960a = i10;
        this.f5962c = obj;
        this.f5961b = j10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f5960a;
        long j10 = this.f5961b;
        Object obj = this.d;
        Object obj2 = this.f5962c;
        switch (i10) {
            case 0:
                MessagesController messagesController = (MessagesController) obj2;
                c2 c2Var = (c2) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putChats(tL_contacts_found.chats, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < tL_contacts_found.chats.size(); i11++) {
                        TLRPC.Chat chat = tL_contacts_found.chats.get(i11);
                        TLRPC.InputPeer inputPeer = MessagesController.getInputPeer(chat);
                        if (chat.f22392id != j10 && ChatObject.isBoostSupported(chat)) {
                            arrayList.add(inputPeer);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ef.c(3, c2Var, arrayList));
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new jh.c2((s7) obj2, (Object) tLObject, this.f5961b, (Object) ((Utilities.Callback) obj), 4));
                return;
            case 2:
                r7 r7Var = (r7) obj;
                r7Var.getClass();
                AndroidUtilities.runOnUIThread(new ih.h1(r7Var, tLObject, (MessagesController) obj2, tL_error, this.f5961b, 6));
                return;
            case 3:
                lh.d1 d1Var = (lh.d1) obj2;
                int[] iArr = (int[]) obj;
                int i12 = d1Var.f15456e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    MessagesController.getInstance(i12).putUsers(groupparticipants.users, false);
                    MessagesController.getInstance(i12).putChats(groupparticipants.chats, false);
                    if (d1Var.A != null) {
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
                        d1Var.A.onMediaDescriptionAvailable(j10, (VoIPService.RequestedParticipant[]) arrayList2.toArray(new VoIPService.RequestedParticipant[0]));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f5961b, (Runnable) obj, tLObject, tL_error);
                return;
            case 5:
                final fj0 fj0Var = (fj0) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                int i15 = fj0Var.f28415f;
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
                    final ii0 ii0Var = new ii0(2, fj0Var, arrayList7);
                    if (ChatObject.isChannel(chat2)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i15).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i15).getInputChannel(chat2.f22392id);
                        ConnectionsManager.getInstance(i15).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r6) {
                                    case 0:
                                        final fj0 fj0Var2 = fj0Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final ii0 ii0Var2 = ii0Var;
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
                                                                MessagesController.getInstance(fj0Var2.f28415f).putUser(user, false);
                                                                int indexOf = arrayList8.indexOf(Long.valueOf(user.f22539id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList9.add(new ej0(((Integer) arrayList10.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        ii0Var2.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                                MessagesController.getInstance(fj0Var2.f28415f).putUser(user2, false);
                                                                int indexOf2 = arrayList8.indexOf(Long.valueOf(user2.f22539id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList9.add(new ej0(((Integer) arrayList10.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        ii0Var2.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final fj0 fj0Var3 = fj0Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final ii0 ii0Var3 = ii0Var;
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
                                                                MessagesController.getInstance(fj0Var3.f28415f).putUser(user, false);
                                                                int indexOf = arrayList11.indexOf(Long.valueOf(user.f22539id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList12.add(new ej0(((Integer) arrayList13.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        ii0Var3.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                                MessagesController.getInstance(fj0Var3.f28415f).putUser(user2, false);
                                                                int indexOf2 = arrayList11.indexOf(Long.valueOf(user2.f22539id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList12.add(new ej0(((Integer) arrayList13.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        ii0Var3.run();
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
                    tL_messages_getFullChat.chat_id = chat2.f22392id;
                    ConnectionsManager.getInstance(i15).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r6) {
                                case 0:
                                    final fj0 fj0Var2 = fj0Var;
                                    final ArrayList arrayList8 = arrayList4;
                                    final ArrayList arrayList9 = arrayList7;
                                    final ArrayList arrayList10 = arrayList5;
                                    final ii0 ii0Var2 = ii0Var;
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
                                                            MessagesController.getInstance(fj0Var2.f28415f).putUser(user, false);
                                                            int indexOf = arrayList8.indexOf(Long.valueOf(user.f22539id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList9.add(new ej0(((Integer) arrayList10.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    ii0Var2.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                            MessagesController.getInstance(fj0Var2.f28415f).putUser(user2, false);
                                                            int indexOf2 = arrayList8.indexOf(Long.valueOf(user2.f22539id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList9.add(new ej0(((Integer) arrayList10.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    ii0Var2.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final fj0 fj0Var3 = fj0Var;
                                    final ArrayList arrayList11 = arrayList4;
                                    final ArrayList arrayList12 = arrayList7;
                                    final ArrayList arrayList13 = arrayList5;
                                    final ii0 ii0Var3 = ii0Var;
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
                                                            MessagesController.getInstance(fj0Var3.f28415f).putUser(user, false);
                                                            int indexOf = arrayList11.indexOf(Long.valueOf(user.f22539id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList12.add(new ej0(((Integer) arrayList13.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    ii0Var3.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                            MessagesController.getInstance(fj0Var3.f28415f).putUser(user2, false);
                                                            int indexOf2 = arrayList11.indexOf(Long.valueOf(user2.f22539id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList12.add(new ej0(((Integer) arrayList13.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    ii0Var3.run();
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
                Pattern pattern = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new sg(tLObject, (MessagesController) obj2, this.f5961b, (lq) obj, 9));
                return;
        }
    }

    public d0(r7 r7Var, MessagesController messagesController, long j10) {
        this.f5960a = 2;
        this.d = r7Var;
        this.f5962c = messagesController;
        this.f5961b = j10;
    }

    public d0(lh.d1 d1Var, int[] iArr, long j10) {
        this.f5960a = 3;
        this.f5962c = d1Var;
        this.d = iArr;
        this.f5961b = j10;
    }
}
