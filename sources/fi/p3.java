package fi;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import org.telegram.ui.ki0;
public final class p3 implements Runnable {
    public final int f9469a;
    public final long f9470b;
    public final int f9471c;
    public final Object d;
    public final Object e;
    public final Object f9472f;
    public final Object h;

    public p3(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.e3 e3Var, c6 c6Var) {
        this.f9469a = 0;
        this.f9471c = i10;
        this.d = context;
        this.f9470b = j10;
        this.e = connectedbotstarref;
        this.f9472f = e3Var;
        this.h = c6Var;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f9469a) {
            case 0:
                int i10 = this.f9471c;
                Context context = (Context) this.d;
                long j11 = this.f9470b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.e;
                zh.p.g(i10).f(context, j11, connectedbotstarref.bot_id, new t3(i10, j11, context, connectedbotstarref, (org.telegram.ui.ActionBar.e3) this.f9472f, (c6) this.h));
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$5((TLRPC.TL_messages_forumTopics) this.e, this.f9470b, (TLRPC.TL_messages_forumTopics) this.f9472f, (a0.h) this.h, this.f9471c);
                return;
            case 2:
                g6.a((g6) this.d, (TLObject) this.e, (MessagesStorage) this.f9472f, this.f9470b, this.f9471c, (ArrayList) this.h);
                return;
            case 3:
                TLObject tLObject = (TLObject) this.d;
                int i11 = this.f9471c;
                di.d dVar = (di.d) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f9472f;
                long j12 = this.f9470b;
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
                    Utilities.stageQueue.postRunnable(new org.telegram.tgnet.h(i11, updates, 1));
                    if (groupCall != null && LaunchActivity.G1 != null) {
                        e3Var.dismiss();
                        SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupCall.invite_link, j12));
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != null) {
                            if (U instanceof fo) {
                                fo foVar = (fo) U;
                                if (foVar.a() == j12 && foVar.R3 == 0) {
                                    return;
                                }
                            }
                            U.presentFragment(fo.W9(j12));
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
                    tL_inputGroupCall.f18933id = groupCall2.f18926id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    e3Var.dismiss();
                    org.telegram.ui.Components.voip.d2.g(LaunchActivity.G1, i11, tL_inputGroupCall, false, groupcall.call, null);
                    SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupcall.call.invite_link, j12));
                    return;
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.c1.p(e3Var.topBulletinContainer, null, tL_error, false);
                    return;
                } else {
                    return;
                }
            case 4:
                final ki0 ki0Var = (ki0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.f9472f;
                long j13 = this.f9470b;
                final int i13 = this.f9471c;
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
                            ki0Var.f37433a.add((Long) pair.first);
                            ki0Var.f37434b.add((Integer) pair.second);
                            ki0Var.f37435c.add((TLObject) hashMap.get(pair.first));
                        }
                        ki0Var.b();
                        return;
                    } else if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i13).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i13).getInputChannel(chat.f18916id);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final ki0 ki0Var2 = ki0Var;
                                        final int i17 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        ki0 ki0Var3 = ki0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            ki0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i18 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap3 = hashMap2;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i17).putUser(user, false);
                                                                    hashMap3.put(Long.valueOf(user.f19063id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList5 = arrayList4;
                                                                        if (i18 < arrayList5.size()) {
                                                                            Pair pair2 = (Pair) arrayList5.get(i18);
                                                                            ki0Var3.f37433a.add((Long) pair2.first);
                                                                            ki0Var3.f37434b.add((Integer) pair2.second);
                                                                            ki0Var3.f37435c.add((TLObject) hashMap3.get(pair2.first));
                                                                            i18++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ki0Var3.b();
                                                        return;
                                                    default:
                                                        ki0 ki0Var4 = ki0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            ki0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i17).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f19063id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            ki0Var4.f37433a.add((Long) pair3.first);
                                                                            ki0Var4.f37434b.add((Integer) pair3.second);
                                                                            ki0Var4.f37435c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ki0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final ki0 ki0Var3 = ki0Var;
                                        final int i18 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        ki0 ki0Var32 = ki0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            ki0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i18).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f19063id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i182 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i182);
                                                                            ki0Var32.f37433a.add((Long) pair2.first);
                                                                            ki0Var32.f37434b.add((Integer) pair2.second);
                                                                            ki0Var32.f37435c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ki0Var32.b();
                                                        return;
                                                    default:
                                                        ki0 ki0Var4 = ki0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            ki0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i18).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f19063id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            ki0Var4.f37433a.add((Long) pair3.first);
                                                                            ki0Var4.f37434b.add((Integer) pair3.second);
                                                                            ki0Var4.f37435c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ki0Var4.b();
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
                        tL_messages_getFullChat.chat_id = chat.f18916id;
                        ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final ki0 ki0Var2 = ki0Var;
                                        final int i17 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        ki0 ki0Var32 = ki0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            ki0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap2;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i17).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f19063id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList4;
                                                                        if (i182 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i182);
                                                                            ki0Var32.f37433a.add((Long) pair2.first);
                                                                            ki0Var32.f37434b.add((Integer) pair2.second);
                                                                            ki0Var32.f37435c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ki0Var32.b();
                                                        return;
                                                    default:
                                                        ki0 ki0Var4 = ki0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            ki0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i17).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f19063id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            ki0Var4.f37433a.add((Long) pair3.first);
                                                                            ki0Var4.f37434b.add((Integer) pair3.second);
                                                                            ki0Var4.f37435c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ki0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final ki0 ki0Var3 = ki0Var;
                                        final int i18 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        ki0 ki0Var32 = ki0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            ki0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i18).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f19063id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i182 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i182);
                                                                            ki0Var32.f37433a.add((Long) pair2.first);
                                                                            ki0Var32.f37434b.add((Integer) pair2.second);
                                                                            ki0Var32.f37435c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ki0Var32.b();
                                                        return;
                                                    default:
                                                        ki0 ki0Var4 = ki0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            ki0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i18).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f19063id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            ki0Var4.f37433a.add((Long) pair3.first);
                                                                            ki0Var4.f37434b.add((Integer) pair3.second);
                                                                            ki0Var4.f37435c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ki0Var4.b();
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
                ki0Var.b();
                return;
            default:
                ((rg.b0) this.d).mo16run((ArrayList) this.e, Integer.valueOf(this.f9471c), Long.valueOf(this.f9470b), (ArrayList) this.f9472f, (ArrayList) this.h);
                return;
        }
    }

    public p3(Object obj, TLObject tLObject, Object obj2, long j10, int i10, Object obj3, int i11) {
        this.f9469a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f9472f = obj2;
        this.f9470b = j10;
        this.f9471c = i10;
        this.h = obj3;
    }

    public p3(TopicsController topicsController, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i10) {
        this.f9469a = 1;
        this.d = topicsController;
        this.e = tL_messages_forumTopics;
        this.f9470b = j10;
        this.f9472f = tL_messages_forumTopics2;
        this.h = hVar;
        this.f9471c = i10;
    }

    public p3(TLObject tLObject, int i10, di.d dVar, org.telegram.ui.ActionBar.e3 e3Var, long j10, TLRPC.TL_error tL_error) {
        this.f9469a = 3;
        this.d = tLObject;
        this.f9471c = i10;
        this.e = dVar;
        this.f9472f = e3Var;
        this.f9470b = j10;
        this.h = tL_error;
    }

    public p3(rg.b0 b0Var, ArrayList arrayList, int i10, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f9469a = 5;
        this.d = b0Var;
        this.e = arrayList;
        this.f9471c = i10;
        this.f9470b = j10;
        this.f9472f = arrayList2;
        this.h = arrayList3;
    }
}
