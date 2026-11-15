package di;

import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tp;
public final class o2 implements RequestDelegate {
    public final int f9132a;
    public final long f9133b;
    public final Object f9134c;
    public final Object d;

    public o2(Object obj, long j3, Object obj2, int i7) {
        this.f9132a = i7;
        this.f9134c = obj;
        this.f9133b = j3;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f9132a;
        long j3 = this.f9133b;
        Object obj = this.d;
        Object obj2 = this.f9134c;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.r1((c6) obj2, (vf.b) obj, tLObject, this.f9133b, tL_error, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new f2((u8) obj2, (Object) tLObject, this.f9133b, (Object) ((z10) obj), 7));
                return;
            case 2:
                s8 s8Var = (s8) obj2;
                s8Var.getClass();
                org.telegram.messenger.g0.h3(new bi.r1(s8Var, tLObject, (np) obj, tL_error, this.f9133b, 7));
                return;
            case 3:
                fi.e1 e1Var = (fi.e1) obj2;
                int[] iArr = (int[]) obj;
                int i10 = e1Var.f11656e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    np.s1(i10).Y3(groupparticipants.users, false);
                    np.s1(i10).S3(groupparticipants.chats, false);
                    if (e1Var.F != null) {
                        m10.i(i10).e();
                        ArrayList arrayList = new ArrayList();
                        for (int i11 : iArr) {
                            ArrayList<TLRPC.GroupCallParticipant> arrayList2 = groupparticipants.participants;
                            int size = arrayList2.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 < size) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList2.get(i12);
                                    i12++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i11) {
                                        arrayList.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i11));
                                    }
                                }
                            }
                        }
                        e1Var.F.onMediaDescriptionAvailable(j3, (VoIPService.RequestedParticipant[]) arrayList.toArray(new VoIPService.RequestedParticipant[0]));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f9133b, (Runnable) obj, tLObject, tL_error);
                return;
            case 5:
                final lh0 lh0Var = (lh0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i13 = lh0Var.f36807f;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList3 = new ArrayList();
                    final ArrayList arrayList4 = new ArrayList();
                    ArrayList<T> arrayList5 = ((Vector) tLObject).objects;
                    int size2 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj3 = arrayList5.get(i14);
                        i14++;
                        if (obj3 instanceof Long) {
                            Long l10 = (Long) obj3;
                            if (j3 != l10.longValue()) {
                                arrayList3.add(l10);
                                arrayList4.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            long j10 = tL_readParticipantDate.user_id;
                            int i15 = tL_readParticipantDate.date;
                            if (j3 != j10) {
                                arrayList3.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i15));
                            }
                        }
                    }
                    arrayList3.add(Long.valueOf(j3));
                    arrayList4.add(0);
                    final ArrayList arrayList6 = new ArrayList();
                    final hh0 hh0Var = new hh0(0, lh0Var, arrayList6);
                    if (org.telegram.messenger.t3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = np.s1(i13).f25372q3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = np.s1(i13).h1(chat.f28051id);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r6) {
                                    case 0:
                                        final lh0 lh0Var2 = lh0Var;
                                        final ArrayList arrayList7 = arrayList3;
                                        final ArrayList arrayList8 = arrayList6;
                                        final ArrayList arrayList9 = arrayList4;
                                        final hh0 hh0Var2 = hh0Var;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i16 = 0; i16 < tL_channels_channelParticipants.users.size(); i16++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i16);
                                                                org.telegram.messenger.np.s1(lh0Var2.f36807f).X3(user, false, false);
                                                                int indexOf = arrayList7.indexOf(Long.valueOf(user.f28200id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList8.add(new kh0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        hh0Var2.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                                org.telegram.messenger.np.s1(lh0Var2.f36807f).X3(user2, false, false);
                                                                int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f28200id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList8.add(new kh0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        hh0Var2.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final lh0 lh0Var3 = lh0Var;
                                        final ArrayList arrayList10 = arrayList3;
                                        final ArrayList arrayList11 = arrayList6;
                                        final ArrayList arrayList12 = arrayList4;
                                        final hh0 hh0Var3 = hh0Var;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i16 = 0; i16 < tL_channels_channelParticipants.users.size(); i16++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i16);
                                                                org.telegram.messenger.np.s1(lh0Var3.f36807f).X3(user, false, false);
                                                                int indexOf = arrayList10.indexOf(Long.valueOf(user.f28200id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList11.add(new kh0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        hh0Var3.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                                org.telegram.messenger.np.s1(lh0Var3.f36807f).X3(user2, false, false);
                                                                int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f28200id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList11.add(new kh0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        hh0Var3.run();
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
                    tL_messages_getFullChat.chat_id = chat.f28051id;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r6) {
                                case 0:
                                    final lh0 lh0Var2 = lh0Var;
                                    final ArrayList arrayList7 = arrayList3;
                                    final ArrayList arrayList8 = arrayList6;
                                    final ArrayList arrayList9 = arrayList4;
                                    final hh0 hh0Var2 = hh0Var;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i16 = 0; i16 < tL_channels_channelParticipants.users.size(); i16++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i16);
                                                            org.telegram.messenger.np.s1(lh0Var2.f36807f).X3(user, false, false);
                                                            int indexOf = arrayList7.indexOf(Long.valueOf(user.f28200id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList8.add(new kh0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    hh0Var2.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                            org.telegram.messenger.np.s1(lh0Var2.f36807f).X3(user2, false, false);
                                                            int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f28200id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList8.add(new kh0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    hh0Var2.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final lh0 lh0Var3 = lh0Var;
                                    final ArrayList arrayList10 = arrayList3;
                                    final ArrayList arrayList11 = arrayList6;
                                    final ArrayList arrayList12 = arrayList4;
                                    final hh0 hh0Var3 = hh0Var;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i16 = 0; i16 < tL_channels_channelParticipants.users.size(); i16++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i16);
                                                            org.telegram.messenger.np.s1(lh0Var3.f36807f).X3(user, false, false);
                                                            int indexOf = arrayList10.indexOf(Long.valueOf(user.f28200id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList11.add(new kh0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    hh0Var3.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                            org.telegram.messenger.np.s1(lh0Var3.f36807f).X3(user2, false, false);
                                                            int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f28200id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList11.add(new kh0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    hh0Var3.run();
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
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new f2(tLObject, (np) obj2, this.f9133b, (tp) obj, 21));
                return;
            default:
                np npVar = (np) obj2;
                wg.r0 r0Var = (wg.r0) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    npVar.S3(tL_contacts_found.chats, false);
                    ArrayList arrayList7 = new ArrayList();
                    for (int i16 = 0; i16 < tL_contacts_found.chats.size(); i16++) {
                        TLRPC.Chat chat2 = tL_contacts_found.chats.get(i16);
                        TLRPC.InputPeer l1 = np.l1(chat2);
                        if (chat2.f28051id != j3 && org.telegram.messenger.t3.R(chat2)) {
                            arrayList7.add(l1);
                        }
                    }
                    org.telegram.messenger.g0.h3(new ug.t1(5, r0Var, arrayList7));
                    return;
                }
                return;
        }
    }

    public o2(Object obj, Object obj2, long j3, int i7) {
        this.f9132a = i7;
        this.f9134c = obj;
        this.d = obj2;
        this.f9133b = j3;
    }
}
