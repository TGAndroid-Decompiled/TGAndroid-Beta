package di;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.gi0;
public final class s3 implements Runnable {
    public final int f6898a;
    public final long f6899b;
    public final int f6900c;
    public final Object d;
    public final Object e;
    public final Object f6901f;
    public final Object h;

    public s3(int i10, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.h3 h3Var, f6 f6Var) {
        this.f6898a = 0;
        this.f6900c = i10;
        this.d = context;
        this.f6899b = j3;
        this.e = connectedbotstarref;
        this.f6901f = h3Var;
        this.h = f6Var;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f6898a) {
            case 0:
                int i10 = this.f6900c;
                Context context = (Context) this.d;
                long j10 = this.f6899b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.e;
                xh.p.g(i10).f(context, j10, connectedbotstarref.bot_id, new v3(i10, j10, context, connectedbotstarref, (org.telegram.ui.ActionBar.h3) this.f6901f, (f6) this.h));
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$5((TLRPC.TL_messages_forumTopics) this.e, this.f6899b, (TLRPC.TL_messages_forumTopics) this.f6901f, (a0.i) this.h, this.f6900c);
                return;
            case 2:
                h6.a((h6) this.d, (TLObject) this.e, (MessagesStorage) this.f6901f, this.f6899b, this.f6900c, (ArrayList) this.h);
                return;
            case 3:
                TLObject tLObject = (TLObject) this.d;
                int i11 = this.f6900c;
                bi.d dVar = (bi.d) this.e;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f6901f;
                long j11 = this.f6899b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLRPC.GroupCall groupCall = null;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i11).putUsers(updates.users, false);
                    MessagesController.getInstance(i11).putChats(updates.chats, false);
                    ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
                    int size = findUpdates.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = findUpdates.get(i12);
                        i12++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.stageQueue.postRunnable(new org.telegram.tgnet.k(i11, updates, 1));
                    if (groupCall != null && LaunchActivity.G1 != null) {
                        h3Var.dismiss();
                        SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupCall.invite_link, j11));
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            if (U instanceof eo) {
                                eo eoVar = (eo) U;
                                if (eoVar.a() == j11 && eoVar.R3 == 0) {
                                    return;
                                }
                            }
                            U.presentFragment(eo.R9(j11));
                            return;
                        }
                        return;
                    }
                    dVar.setLoading(false);
                    return;
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    MessagesController.getInstance(i11).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i11).putChats(groupcall.chats, false);
                    if (LaunchActivity.G1 == null) {
                        dVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall.f17212id = groupCall2.f17205id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    h3Var.dismiss();
                    org.telegram.ui.Components.voip.e2.g(LaunchActivity.G1, i11, tL_inputGroupCall, false, groupcall.call, null);
                    SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupcall.call.invite_link, j11));
                    return;
                } else if (tL_error != null) {
                    r6.q(h3Var.topBulletinContainer, null, tL_error, false);
                    return;
                } else {
                    return;
                }
            case 4:
                final gi0 gi0Var = (gi0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.f6901f;
                long j12 = this.f6899b;
                final int i13 = this.f6900c;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 == null && (tLObject2 instanceof Vector)) {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long j13 = j12;
                    final HashMap hashMap = new HashMap();
                    final ArrayList arrayList3 = new ArrayList();
                    int size2 = vector.objects.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = vector.objects.get(i14);
                        if (obj2 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj2;
                            int i15 = tL_readParticipantDate.date;
                            j3 = j13;
                            long j14 = tL_readParticipantDate.user_id;
                            Long valueOf = Long.valueOf(j14);
                            if (j3 != j14) {
                                MessagesController.getInstance(i13).getUser(valueOf);
                                arrayList3.add(new Pair(valueOf, Integer.valueOf(i15)));
                                arrayList.add(valueOf);
                            }
                        } else {
                            j3 = j13;
                            if (obj2 instanceof Long) {
                                Long l4 = (Long) obj2;
                                if (j3 != l4.longValue()) {
                                    if (l4.longValue() > 0) {
                                        MessagesController.getInstance(i13).getUser(l4);
                                        arrayList3.add(new Pair(l4, 0));
                                        arrayList.add(l4);
                                    } else {
                                        MessagesController.getInstance(i13).getChat(Long.valueOf(-l4.longValue()));
                                        arrayList3.add(new Pair(l4, 0));
                                        arrayList2.add(l4);
                                    }
                                }
                            }
                        }
                        i14++;
                        j13 = j3;
                    }
                    if (arrayList.isEmpty()) {
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            Pair pair = (Pair) arrayList3.get(i16);
                            gi0Var.f33108a.add((Long) pair.first);
                            gi0Var.f33109b.add((Integer) pair.second);
                            gi0Var.f33110c.add((TLObject) hashMap.get(pair.first));
                        }
                        gi0Var.b();
                        return;
                    } else if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i13).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i13).getInputChannel(chat.f17195id);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final gi0 gi0Var2 = gi0Var;
                                        final int i17 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        gi0 gi0Var3 = gi0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            gi0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i18 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap3 = hashMap2;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i17).putUser(user, false);
                                                                    hashMap3.put(Long.valueOf(user.f17342id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList5 = arrayList4;
                                                                        if (i18 < arrayList5.size()) {
                                                                            Pair pair2 = (Pair) arrayList5.get(i18);
                                                                            gi0Var3.f33108a.add((Long) pair2.first);
                                                                            gi0Var3.f33109b.add((Integer) pair2.second);
                                                                            gi0Var3.f33110c.add((TLObject) hashMap3.get(pair2.first));
                                                                            i18++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        gi0Var3.b();
                                                        return;
                                                    default:
                                                        gi0 gi0Var4 = gi0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            gi0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i17).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f17342id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            gi0Var4.f33108a.add((Long) pair3.first);
                                                                            gi0Var4.f33109b.add((Integer) pair3.second);
                                                                            gi0Var4.f33110c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        gi0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final gi0 gi0Var3 = gi0Var;
                                        final int i18 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        gi0 gi0Var32 = gi0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            gi0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i18).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f17342id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i182 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i182);
                                                                            gi0Var32.f33108a.add((Long) pair2.first);
                                                                            gi0Var32.f33109b.add((Integer) pair2.second);
                                                                            gi0Var32.f33110c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        gi0Var32.b();
                                                        return;
                                                    default:
                                                        gi0 gi0Var4 = gi0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            gi0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i18).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f17342id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            gi0Var4.f33108a.add((Long) pair3.first);
                                                                            gi0Var4.f33109b.add((Integer) pair3.second);
                                                                            gi0Var4.f33110c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        gi0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        TLRPC.TL_messages_getFullChat tL_messages_getFullChat = new TLRPC.TL_messages_getFullChat();
                        tL_messages_getFullChat.chat_id = chat.f17195id;
                        ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final gi0 gi0Var2 = gi0Var;
                                        final int i17 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        gi0 gi0Var32 = gi0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            gi0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap2;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i17).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f17342id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList4;
                                                                        if (i182 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i182);
                                                                            gi0Var32.f33108a.add((Long) pair2.first);
                                                                            gi0Var32.f33109b.add((Integer) pair2.second);
                                                                            gi0Var32.f33110c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        gi0Var32.b();
                                                        return;
                                                    default:
                                                        gi0 gi0Var4 = gi0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            gi0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i17).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f17342id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            gi0Var4.f33108a.add((Long) pair3.first);
                                                                            gi0Var4.f33109b.add((Integer) pair3.second);
                                                                            gi0Var4.f33110c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        gi0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final gi0 gi0Var3 = gi0Var;
                                        final int i18 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        gi0 gi0Var32 = gi0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            gi0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i18).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f17342id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i182 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i182);
                                                                            gi0Var32.f33108a.add((Long) pair2.first);
                                                                            gi0Var32.f33109b.add((Integer) pair2.second);
                                                                            gi0Var32.f33110c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        gi0Var32.b();
                                                        return;
                                                    default:
                                                        gi0 gi0Var4 = gi0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            gi0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i18).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f17342id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            gi0Var4.f33108a.add((Long) pair3.first);
                                                                            gi0Var4.f33109b.add((Integer) pair3.second);
                                                                            gi0Var4.f33110c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        gi0Var4.b();
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
                }
                gi0Var.b();
                return;
            default:
                th.e eVar = (th.e) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                int i17 = this.f6900c;
                long j15 = this.f6899b;
                eVar.mo17run(arrayList4, Integer.valueOf(i17), Long.valueOf(j15), (ArrayList) this.f6901f, (ArrayList) this.h);
                return;
        }
    }

    public s3(Object obj, TLObject tLObject, Object obj2, long j3, int i10, Object obj3, int i11) {
        this.f6898a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f6901f = obj2;
        this.f6899b = j3;
        this.f6900c = i10;
        this.h = obj3;
    }

    public s3(TopicsController topicsController, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.i iVar, int i10) {
        this.f6898a = 1;
        this.d = topicsController;
        this.e = tL_messages_forumTopics;
        this.f6899b = j3;
        this.f6901f = tL_messages_forumTopics2;
        this.h = iVar;
        this.f6900c = i10;
    }

    public s3(TLObject tLObject, int i10, bi.d dVar, org.telegram.ui.ActionBar.h3 h3Var, long j3, TLRPC.TL_error tL_error) {
        this.f6898a = 3;
        this.d = tLObject;
        this.f6900c = i10;
        this.e = dVar;
        this.f6901f = h3Var;
        this.f6899b = j3;
        this.h = tL_error;
    }

    public s3(th.e eVar, ArrayList arrayList, int i10, long j3, ArrayList arrayList2, ArrayList arrayList3) {
        this.f6898a = 5;
        this.d = eVar;
        this.e = arrayList;
        this.f6900c = i10;
        this.f6899b = j3;
        this.f6901f = arrayList2;
        this.h = arrayList3;
    }
}
