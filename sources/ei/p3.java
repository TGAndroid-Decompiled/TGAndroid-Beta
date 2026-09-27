package ei;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ci0;
import org.telegram.ui.xn;
public final class p3 implements Runnable {
    public final int f8527a;
    public final long f8528b;
    public final int f8529c;
    public final Object d;
    public final Object e;
    public final Object f8530f;
    public final Object h;

    public p3(int i10, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.g3 g3Var, e6 e6Var) {
        this.f8527a = 0;
        this.f8529c = i10;
        this.d = context;
        this.f8528b = j3;
        this.e = connectedbotstarref;
        this.f8530f = g3Var;
        this.h = e6Var;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f8527a) {
            case 0:
                int i10 = this.f8529c;
                Context context = (Context) this.d;
                long j10 = this.f8528b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.e;
                yh.o.g(i10).f(context, j10, connectedbotstarref.bot_id, new s3(i10, j10, context, connectedbotstarref, (org.telegram.ui.ActionBar.g3) this.f8530f, (e6) this.h));
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$5((TLRPC.TL_messages_forumTopics) this.e, this.f8528b, (TLRPC.TL_messages_forumTopics) this.f8530f, (a0.i) this.h, this.f8529c);
                return;
            case 2:
                g6.a((g6) this.d, (TLObject) this.e, (MessagesStorage) this.f8530f, this.f8528b, this.f8529c, (ArrayList) this.h);
                return;
            case 3:
                TLObject tLObject = (TLObject) this.d;
                int i11 = this.f8529c;
                ci.d dVar = (ci.d) this.e;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f8530f;
                long j11 = this.f8528b;
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
                        g3Var.dismiss();
                        SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupCall.invite_link, j11));
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            if (U instanceof xn) {
                                xn xnVar = (xn) U;
                                if (xnVar.a() == j11 && xnVar.R3 == 0) {
                                    return;
                                }
                            }
                            U.presentFragment(xn.R9(j11));
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
                    tL_inputGroupCall.f18346id = groupCall2.f18339id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    g3Var.dismiss();
                    org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, i11, tL_inputGroupCall, false, groupcall.call, null);
                    SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupcall.call.invite_link, j11));
                    return;
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.c1.s(g3Var.topBulletinContainer, null, tL_error, false);
                    return;
                } else {
                    return;
                }
            case 4:
                final ci0 ci0Var = (ci0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.f8530f;
                long j12 = this.f8528b;
                final int i13 = this.f8529c;
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
                            ci0Var.f32726a.add((Long) pair.first);
                            ci0Var.f32727b.add((Integer) pair.second);
                            ci0Var.f32728c.add((TLObject) hashMap.get(pair.first));
                        }
                        ci0Var.b();
                        return;
                    } else if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i13).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i13).getInputChannel(chat.f18329id);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final ci0 ci0Var2 = ci0Var;
                                        final int i17 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        ci0 ci0Var3 = ci0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            ci0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i18 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap3 = hashMap2;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i17).putUser(user, false);
                                                                    hashMap3.put(Long.valueOf(user.f18476id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList5 = arrayList4;
                                                                        if (i18 < arrayList5.size()) {
                                                                            Pair pair2 = (Pair) arrayList5.get(i18);
                                                                            ci0Var3.f32726a.add((Long) pair2.first);
                                                                            ci0Var3.f32727b.add((Integer) pair2.second);
                                                                            ci0Var3.f32728c.add((TLObject) hashMap3.get(pair2.first));
                                                                            i18++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ci0Var3.b();
                                                        return;
                                                    default:
                                                        ci0 ci0Var4 = ci0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            ci0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i17).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f18476id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            ci0Var4.f32726a.add((Long) pair3.first);
                                                                            ci0Var4.f32727b.add((Integer) pair3.second);
                                                                            ci0Var4.f32728c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ci0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final ci0 ci0Var3 = ci0Var;
                                        final int i18 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        ci0 ci0Var32 = ci0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            ci0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i18).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f18476id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i182 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i182);
                                                                            ci0Var32.f32726a.add((Long) pair2.first);
                                                                            ci0Var32.f32727b.add((Integer) pair2.second);
                                                                            ci0Var32.f32728c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ci0Var32.b();
                                                        return;
                                                    default:
                                                        ci0 ci0Var4 = ci0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            ci0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i18).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f18476id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            ci0Var4.f32726a.add((Long) pair3.first);
                                                                            ci0Var4.f32727b.add((Integer) pair3.second);
                                                                            ci0Var4.f32728c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ci0Var4.b();
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
                        tL_messages_getFullChat.chat_id = chat.f18329id;
                        ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final ci0 ci0Var2 = ci0Var;
                                        final int i17 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        ci0 ci0Var32 = ci0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            ci0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap2;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i17).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f18476id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList4;
                                                                        if (i182 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i182);
                                                                            ci0Var32.f32726a.add((Long) pair2.first);
                                                                            ci0Var32.f32727b.add((Integer) pair2.second);
                                                                            ci0Var32.f32728c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ci0Var32.b();
                                                        return;
                                                    default:
                                                        ci0 ci0Var4 = ci0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            ci0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i17).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f18476id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            ci0Var4.f32726a.add((Long) pair3.first);
                                                                            ci0Var4.f32727b.add((Integer) pair3.second);
                                                                            ci0Var4.f32728c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ci0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final ci0 ci0Var3 = ci0Var;
                                        final int i18 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        ci0 ci0Var32 = ci0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            ci0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i18).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f18476id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i182 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i182);
                                                                            ci0Var32.f32726a.add((Long) pair2.first);
                                                                            ci0Var32.f32727b.add((Integer) pair2.second);
                                                                            ci0Var32.f32728c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ci0Var32.b();
                                                        return;
                                                    default:
                                                        ci0 ci0Var4 = ci0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            ci0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i18).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f18476id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i20);
                                                                            ci0Var4.f32726a.add((Long) pair3.first);
                                                                            ci0Var4.f32727b.add((Integer) pair3.second);
                                                                            ci0Var4.f32728c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ci0Var4.b();
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
                ci0Var.b();
                return;
            default:
                r5.d dVar2 = (r5.d) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                int i17 = this.f8529c;
                long j15 = this.f8528b;
                dVar2.mo17run(arrayList4, Integer.valueOf(i17), Long.valueOf(j15), (ArrayList) this.f8530f, (ArrayList) this.h);
                return;
        }
    }

    public p3(Object obj, TLObject tLObject, Object obj2, long j3, int i10, Object obj3, int i11) {
        this.f8527a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f8530f = obj2;
        this.f8528b = j3;
        this.f8529c = i10;
        this.h = obj3;
    }

    public p3(TopicsController topicsController, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.i iVar, int i10) {
        this.f8527a = 1;
        this.d = topicsController;
        this.e = tL_messages_forumTopics;
        this.f8528b = j3;
        this.f8530f = tL_messages_forumTopics2;
        this.h = iVar;
        this.f8529c = i10;
    }

    public p3(TLObject tLObject, int i10, ci.d dVar, org.telegram.ui.ActionBar.g3 g3Var, long j3, TLRPC.TL_error tL_error) {
        this.f8527a = 3;
        this.d = tLObject;
        this.f8529c = i10;
        this.e = dVar;
        this.f8530f = g3Var;
        this.f8528b = j3;
        this.h = tL_error;
    }

    public p3(r5.d dVar, ArrayList arrayList, int i10, long j3, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8527a = 5;
        this.d = dVar;
        this.e = arrayList;
        this.f8529c = i10;
        this.f8528b = j3;
        this.f8530f = arrayList2;
        this.h = arrayList3;
    }
}
