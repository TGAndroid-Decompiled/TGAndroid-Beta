package cg;

import hh.t7;
import hh.u7;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.pg;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lq;

public final class c0 implements RequestDelegate {

    public final int f2621a;

    public final long f2622b;

    public final Object f2623c;
    public final Object d;

    public c0(t7 t7Var, MessagesController messagesController, long j10) {
        this.f2621a = 2;
        this.d = t7Var;
        this.f2623c = messagesController;
        this.f2622b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f2621a;
        long j10 = this.f2622b;
        Object obj = this.d;
        Object obj2 = this.f2623c;
        switch (i10) {
            case 0:
                MessagesController messagesController = (MessagesController) obj2;
                e2 e2Var = (e2) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putChats(tL_contacts_found.chats, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < tL_contacts_found.chats.size(); i11++) {
                        TLRPC.Chat chat = tL_contacts_found.chats.get(i11);
                        TLRPC.InputPeer inputPeer = MessagesController.getInputPeer(chat);
                        if (chat.f22380id != j10 && ChatObject.isBoostSupported(chat)) {
                            arrayList.add(inputPeer);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new a1.e(20, e2Var, arrayList));
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new hh.e2((u7) obj2, (Object) tLObject, this.f2622b, obj, 4));
                break;
            case 2:
                t7 t7Var = (t7) obj;
                t7Var.getClass();
                AndroidUtilities.runOnUIThread(new gh.k1(t7Var, tLObject, (MessagesController) obj2, tL_error, this.f2622b, 6));
                break;
            case 3:
                jh.d1 d1Var = (jh.d1) obj2;
                int[] iArr = (int[]) obj;
                int i12 = d1Var.f13177e;
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
                            while (i14 < size) {
                                TLRPC.GroupCallParticipant groupCallParticipant = arrayList3.get(i14);
                                i14++;
                                TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                if (groupCallParticipant2.source == i13) {
                                    arrayList2.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i13));
                                }
                                break;
                            }
                        }
                        d1Var.A.onMediaDescriptionAvailable(j10, (VoIPService.RequestedParticipant[]) arrayList2.toArray(new VoIPService.RequestedParticipant[0]));
                        break;
                    }
                }
                break;
            case 4:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f2622b, (Runnable) obj, tLObject, tL_error);
                break;
            case 5:
                final wi0 wi0Var = (wi0) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                int i15 = wi0Var.f34220f;
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
                    final lg0 lg0Var = new lg0(5, wi0Var, arrayList7);
                    if (ChatObject.isChannel(chat2)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i15).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i15).getInputChannel(chat2.f22380id);
                        final int i18 = 0;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i18) {
                                    case 0:
                                        final int i19 = 0;
                                        final wi0 wi0Var2 = wi0Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final lg0 lg0Var2 = lg0Var;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i19) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i20 = 0; i20 < tL_channels_channelParticipants.users.size(); i20++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i20);
                                                                MessagesController.getInstance(wi0Var2.f34220f).putUser(user, false);
                                                                int iIndexOf = arrayList8.indexOf(Long.valueOf(user.f22527id));
                                                                if (!user.self && iIndexOf >= 0) {
                                                                    arrayList9.add(new vi0(((Integer) arrayList10.get(iIndexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        lg0Var2.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i21 = 0; i21 < tL_messages_chatFull.users.size(); i21++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                MessagesController.getInstance(wi0Var2.f34220f).putUser(user2, false);
                                                                int iIndexOf2 = arrayList8.indexOf(Long.valueOf(user2.f22527id));
                                                                if (!user2.self && iIndexOf2 >= 0) {
                                                                    arrayList9.add(new vi0(((Integer) arrayList10.get(iIndexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        lg0Var2.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i20 = 1;
                                        final wi0 wi0Var3 = wi0Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final lg0 lg0Var3 = lg0Var;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i21 = 0; i21 < tL_channels_channelParticipants.users.size(); i21++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                MessagesController.getInstance(wi0Var3.f34220f).putUser(user, false);
                                                                int iIndexOf = arrayList11.indexOf(Long.valueOf(user.f22527id));
                                                                if (!user.self && iIndexOf >= 0) {
                                                                    arrayList12.add(new vi0(((Integer) arrayList13.get(iIndexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        lg0Var3.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i22 = 0; i22 < tL_messages_chatFull.users.size(); i22++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i22);
                                                                MessagesController.getInstance(wi0Var3.f34220f).putUser(user2, false);
                                                                int iIndexOf2 = arrayList11.indexOf(Long.valueOf(user2.f22527id));
                                                                if (!user2.self && iIndexOf2 >= 0) {
                                                                    arrayList12.add(new vi0(((Integer) arrayList13.get(iIndexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        lg0Var3.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                    } else {
                        TLRPC.TL_messages_getFullChat tL_messages_getFullChat = new TLRPC.TL_messages_getFullChat();
                        tL_messages_getFullChat.chat_id = chat2.f22380id;
                        final int i19 = 1;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i19) {
                                    case 0:
                                        final int i110 = 0;
                                        final wi0 wi0Var2 = wi0Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final lg0 lg0Var2 = lg0Var;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i110) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i21 = 0; i21 < tL_channels_channelParticipants.users.size(); i21++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                MessagesController.getInstance(wi0Var2.f34220f).putUser(user, false);
                                                                int iIndexOf = arrayList8.indexOf(Long.valueOf(user.f22527id));
                                                                if (!user.self && iIndexOf >= 0) {
                                                                    arrayList9.add(new vi0(((Integer) arrayList10.get(iIndexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        lg0Var2.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i22 = 0; i22 < tL_messages_chatFull.users.size(); i22++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i22);
                                                                MessagesController.getInstance(wi0Var2.f34220f).putUser(user2, false);
                                                                int iIndexOf2 = arrayList8.indexOf(Long.valueOf(user2.f22527id));
                                                                if (!user2.self && iIndexOf2 >= 0) {
                                                                    arrayList9.add(new vi0(((Integer) arrayList10.get(iIndexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        lg0Var2.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i20 = 1;
                                        final wi0 wi0Var3 = wi0Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final lg0 lg0Var3 = lg0Var;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i21 = 0; i21 < tL_channels_channelParticipants.users.size(); i21++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                MessagesController.getInstance(wi0Var3.f34220f).putUser(user, false);
                                                                int iIndexOf = arrayList11.indexOf(Long.valueOf(user.f22527id));
                                                                if (!user.self && iIndexOf >= 0) {
                                                                    arrayList12.add(new vi0(((Integer) arrayList13.get(iIndexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        lg0Var3.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i22 = 0; i22 < tL_messages_chatFull.users.size(); i22++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i22);
                                                                MessagesController.getInstance(wi0Var3.f34220f).putUser(user2, false);
                                                                int iIndexOf2 = arrayList11.indexOf(Long.valueOf(user2.f22527id));
                                                                if (!user2.self && iIndexOf2 >= 0) {
                                                                    arrayList12.add(new vi0(((Integer) arrayList13.get(iIndexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        lg0Var3.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                    }
                }
                break;
            default:
                Pattern pattern = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new pg(tLObject, (MessagesController) obj2, this.f2622b, (lq) obj, 9));
                break;
        }
    }

    public c0(Object obj, long j10, Object obj2, int i10) {
        this.f2621a = i10;
        this.f2623c = obj;
        this.f2622b = j10;
        this.d = obj2;
    }

    public c0(jh.d1 d1Var, int[] iArr, long j10) {
        this.f2621a = 3;
        this.f2623c = d1Var;
        this.d = iArr;
        this.f2622b = j10;
    }
}
