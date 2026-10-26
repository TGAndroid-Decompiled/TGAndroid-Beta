package bi;

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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rh0;
import org.telegram.ui.un;
public final class a9 implements Runnable {
    public final int f4266a = 1;
    public final int f4267b;
    public final long f4268c;
    public final Object d;
    public final Object e;
    public final Object f4269f;
    public final Object h;

    public a9(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f4267b = i10;
        this.d = context;
        this.f4268c = j10;
        this.e = connectedbotstarref;
        this.f4269f = k3Var;
        this.h = u6Var;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f4266a) {
            case 0:
                ((a1.c) this.d).mo5run((ArrayList) this.e, Integer.valueOf(this.f4267b), Long.valueOf(this.f4268c), (ArrayList) this.f4269f, (ArrayList) this.h);
                return;
            case 1:
                int i10 = this.f4267b;
                Context context = (Context) this.d;
                long j11 = this.f4268c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.e;
                m0.g(i10).f(context, j11, connectedbotstarref.bot_id, new hi.r3(i10, j11, context, connectedbotstarref, (org.telegram.ui.ActionBar.k3) this.f4269f, (org.telegram.ui.ActionBar.u6) this.h));
                return;
            case 2:
                ((TopicsController) this.d).lambda$loadTopics$5((TLRPC.TL_messages_forumTopics) this.e, this.f4268c, (TLRPC.TL_messages_forumTopics) this.f4269f, (a0.h) this.h, this.f4267b);
                return;
            case 3:
                org.telegram.ui.Cells.k6.a((org.telegram.ui.Cells.k6) this.d, (TLObject) this.f4269f, (MessagesStorage) this.h, this.f4268c, this.f4267b, (ArrayList) this.e);
                return;
            case 4:
                TLObject tLObject = (TLObject) this.d;
                int i11 = this.f4267b;
                fi.d dVar = (fi.d) this.e;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f4269f;
                long j12 = this.f4268c;
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
                    Utilities.stageQueue.postRunnable(new org.telegram.tgnet.g(i11, updates, 1));
                    if (groupCall != null && LaunchActivity.I1 != null) {
                        k3Var.dismiss();
                        SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupCall.invite_link, j12));
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            if (U instanceof un) {
                                un unVar = (un) U;
                                if (unVar.a() == j12 && unVar.f44224d4 == 0) {
                                    return;
                                }
                            }
                            U.presentFragment(un.ba(j12));
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
                    if (LaunchActivity.I1 == null) {
                        dVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall.f22044id = groupCall2.f22037id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    k3Var.dismiss();
                    org.telegram.ui.Components.voip.g2.g(LaunchActivity.I1, i11, tL_inputGroupCall, false, groupcall.call, null);
                    SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupcall.call.invite_link, j12));
                    return;
                } else if (tL_error != null) {
                    org.telegram.ui.d3.t(k3Var.topBulletinContainer, null, tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                final rh0 rh0Var = (rh0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.f4269f;
                long j13 = this.f4268c;
                final int i13 = this.f4267b;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 == null && (tLObject2 instanceof Vector)) {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long j14 = j13;
                    final HashMap hashMap = new HashMap();
                    final ArrayList arrayList3 = new ArrayList();
                    int size2 = vector.objects.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = vector.objects.get(i14);
                        if (obj2 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj2;
                            int i15 = tL_readParticipantDate.date;
                            j10 = j14;
                            long j15 = tL_readParticipantDate.user_id;
                            Long valueOf = Long.valueOf(j15);
                            if (j10 != j15) {
                                MessagesController.getInstance(i13).getUser(valueOf);
                                arrayList3.add(new Pair(valueOf, Integer.valueOf(i15)));
                                arrayList.add(valueOf);
                            }
                        } else {
                            j10 = j14;
                            if (obj2 instanceof Long) {
                                Long l4 = (Long) obj2;
                                if (j10 != l4.longValue()) {
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
                        j14 = j10;
                    }
                    if (arrayList.isEmpty()) {
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            Pair pair = (Pair) arrayList3.get(i16);
                            rh0Var.f43161a.add((Long) pair.first);
                            rh0Var.f43162b.add((Integer) pair.second);
                            rh0Var.f43163c.add((TLObject) hashMap.get(pair.first));
                        }
                        rh0Var.b();
                        return;
                    } else if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i13).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i13).getInputChannel(chat.f22027id);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final rh0 rh0Var2 = rh0Var;
                                        final int i17 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        rh0 rh0Var3 = rh0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            rh0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i18 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap3 = hashMap2;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i17).putUser(user, false);
                                                                    hashMap3.put(Long.valueOf(user.f22176id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList5 = arrayList4;
                                                                        if (i18 < arrayList5.size()) {
                                                                            Pair pair2 = (Pair) arrayList5.get(i18);
                                                                            rh0Var3.f43161a.add((Long) pair2.first);
                                                                            rh0Var3.f43162b.add((Integer) pair2.second);
                                                                            rh0Var3.f43163c.add((TLObject) hashMap3.get(pair2.first));
                                                                            i18++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var3.b();
                                                        return;
                                                    default:
                                                        rh0 rh0Var4 = rh0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            rh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i17).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f22176id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            rh0Var4.f43161a.add((Long) pair3.first);
                                                                            rh0Var4.f43162b.add((Integer) pair3.second);
                                                                            rh0Var4.f43163c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final rh0 rh0Var3 = rh0Var;
                                        final int i18 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        rh0 rh0Var32 = rh0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            rh0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i18).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f22176id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i182 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i182);
                                                                            rh0Var32.f43161a.add((Long) pair2.first);
                                                                            rh0Var32.f43162b.add((Integer) pair2.second);
                                                                            rh0Var32.f43163c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var32.b();
                                                        return;
                                                    default:
                                                        rh0 rh0Var4 = rh0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            rh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i18).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f22176id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            rh0Var4.f43161a.add((Long) pair3.first);
                                                                            rh0Var4.f43162b.add((Integer) pair3.second);
                                                                            rh0Var4.f43163c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var4.b();
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
                        tL_messages_getFullChat.chat_id = chat.f22027id;
                        ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final rh0 rh0Var2 = rh0Var;
                                        final int i17 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        rh0 rh0Var32 = rh0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            rh0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap2;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i17).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f22176id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList4;
                                                                        if (i182 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i182);
                                                                            rh0Var32.f43161a.add((Long) pair2.first);
                                                                            rh0Var32.f43162b.add((Integer) pair2.second);
                                                                            rh0Var32.f43163c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var32.b();
                                                        return;
                                                    default:
                                                        rh0 rh0Var4 = rh0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            rh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i17).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f22176id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            rh0Var4.f43161a.add((Long) pair3.first);
                                                                            rh0Var4.f43162b.add((Integer) pair3.second);
                                                                            rh0Var4.f43163c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final rh0 rh0Var3 = rh0Var;
                                        final int i18 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        rh0 rh0Var32 = rh0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            rh0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i18).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f22176id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i182 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i182);
                                                                            rh0Var32.f43161a.add((Long) pair2.first);
                                                                            rh0Var32.f43162b.add((Integer) pair2.second);
                                                                            rh0Var32.f43163c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var32.b();
                                                        return;
                                                    default:
                                                        rh0 rh0Var4 = rh0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            rh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i18).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f22176id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            rh0Var4.f43161a.add((Long) pair3.first);
                                                                            rh0Var4.f43162b.add((Integer) pair3.second);
                                                                            rh0Var4.f43163c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var4.b();
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
                rh0Var.b();
                return;
        }
    }

    public a9(a1.c cVar, ArrayList arrayList, int i10, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.d = cVar;
        this.e = arrayList;
        this.f4267b = i10;
        this.f4268c = j10;
        this.f4269f = arrayList2;
        this.h = arrayList3;
    }

    public a9(TopicsController topicsController, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i10) {
        this.d = topicsController;
        this.e = tL_messages_forumTopics;
        this.f4268c = j10;
        this.f4269f = tL_messages_forumTopics2;
        this.h = hVar;
        this.f4267b = i10;
    }

    public a9(TLObject tLObject, int i10, fi.d dVar, org.telegram.ui.ActionBar.k3 k3Var, long j10, TLRPC.TL_error tL_error) {
        this.d = tLObject;
        this.f4267b = i10;
        this.e = dVar;
        this.f4269f = k3Var;
        this.f4268c = j10;
        this.h = tL_error;
    }

    public a9(org.telegram.ui.Cells.k6 k6Var, TLObject tLObject, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = k6Var;
        this.f4269f = tLObject;
        this.h = messagesStorage;
        this.f4268c = j10;
        this.f4267b = i10;
        this.e = arrayList;
    }

    public a9(rh0 rh0Var, TLRPC.TL_error tL_error, TLObject tLObject, long j10, int i10, TLRPC.Chat chat) {
        this.d = rh0Var;
        this.e = tL_error;
        this.f4269f = tLObject;
        this.f4268c = j10;
        this.f4267b = i10;
        this.h = chat;
    }
}
