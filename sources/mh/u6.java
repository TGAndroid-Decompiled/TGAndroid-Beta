package mh;

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
import org.telegram.ui.te1;
import org.telegram.ui.xh0;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
public final class u6 implements Runnable {
    public final int f14889a = 5;
    public final long f14890b;
    public final int f14891c;
    public final Object d;
    public final Object f14892e;
    public final Object f14893f;
    public final Object h;

    public u6(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f14891c = i10;
        this.d = context;
        this.f14890b = j10;
        this.f14892e = connectedbotstarref;
        this.f14893f = h3Var;
        this.h = g6Var;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f14889a) {
            case 0:
                m5 m5Var = (m5) this.d;
                ArrayList arrayList = (ArrayList) this.f14892e;
                int i10 = this.f14891c;
                long j11 = this.f14890b;
                m5Var.mo27run(arrayList, Integer.valueOf(i10), Long.valueOf(j11), (ArrayList) this.f14893f, (ArrayList) this.h);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$5((TLRPC.TL_messages_forumTopics) this.f14892e, this.f14890b, (TLRPC.TL_messages_forumTopics) this.f14893f, (a0.h) this.h, this.f14891c);
                return;
            case 2:
                org.telegram.ui.Cells.f6.a((org.telegram.ui.Cells.f6) this.d, (TLObject) this.f14893f, (MessagesStorage) this.h, this.f14890b, this.f14891c, (ArrayList) this.f14892e);
                return;
            case 3:
                TLObject tLObject = (TLObject) this.d;
                int i11 = this.f14891c;
                qh.d dVar = (qh.d) this.f14892e;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f14893f;
                long j12 = this.f14890b;
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
                    if (groupCall != null && LaunchActivity.D1 != null) {
                        h3Var.dismiss();
                        SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupCall.invite_link, j12));
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            if (U instanceof xn) {
                                xn xnVar = (xn) U;
                                if (xnVar.a() == j12 && xnVar.O3 == 0) {
                                    return;
                                }
                            }
                            U.presentFragment(xn.R9(j12));
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
                    if (LaunchActivity.D1 == null) {
                        dVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall.f20860id = groupCall2.f20853id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    h3Var.dismiss();
                    org.telegram.ui.Components.voip.g2.h(LaunchActivity.D1, i11, tL_inputGroupCall, false, groupcall.call, null);
                    SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupcall.call.invite_link, j12));
                    return;
                } else if (tL_error != null) {
                    yh.u(h3Var.topBulletinContainer, null, tL_error, false);
                    return;
                } else {
                    return;
                }
            case 4:
                final xh0 xh0Var = (xh0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f14892e;
                TLObject tLObject2 = (TLObject) this.f14893f;
                long j13 = this.f14890b;
                final int i13 = this.f14891c;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 == null && (tLObject2 instanceof Vector)) {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    long j14 = j13;
                    final HashMap hashMap = new HashMap();
                    final ArrayList arrayList4 = new ArrayList();
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
                                arrayList4.add(new Pair(valueOf, Integer.valueOf(i15)));
                                arrayList2.add(valueOf);
                            }
                        } else {
                            j10 = j14;
                            if (obj2 instanceof Long) {
                                Long l10 = (Long) obj2;
                                if (j10 != l10.longValue()) {
                                    if (l10.longValue() > 0) {
                                        MessagesController.getInstance(i13).getUser(l10);
                                        arrayList4.add(new Pair(l10, 0));
                                        arrayList2.add(l10);
                                    } else {
                                        MessagesController.getInstance(i13).getChat(Long.valueOf(-l10.longValue()));
                                        arrayList4.add(new Pair(l10, 0));
                                        arrayList3.add(l10);
                                    }
                                }
                            }
                        }
                        i14++;
                        j14 = j10;
                    }
                    if (arrayList2.isEmpty()) {
                        for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                            Pair pair = (Pair) arrayList4.get(i16);
                            xh0Var.f43067a.add((Long) pair.first);
                            xh0Var.f43068b.add((Integer) pair.second);
                            xh0Var.f43069c.add((TLObject) hashMap.get(pair.first));
                        }
                        xh0Var.b();
                        return;
                    } else if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i13).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i13).getInputChannel(chat.f20843id);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final xh0 xh0Var2 = xh0Var;
                                        final int i17 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList5 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        xh0 xh0Var3 = xh0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            xh0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i18 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap3 = hashMap2;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i17).putUser(user, false);
                                                                    hashMap3.put(Long.valueOf(user.f20990id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i18 < arrayList6.size()) {
                                                                            Pair pair2 = (Pair) arrayList6.get(i18);
                                                                            xh0Var3.f43067a.add((Long) pair2.first);
                                                                            xh0Var3.f43068b.add((Integer) pair2.second);
                                                                            xh0Var3.f43069c.add((TLObject) hashMap3.get(pair2.first));
                                                                            i18++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        xh0Var3.b();
                                                        return;
                                                    default:
                                                        xh0 xh0Var4 = xh0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            xh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i17).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f20990id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i20 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i20);
                                                                            xh0Var4.f43067a.add((Long) pair3.first);
                                                                            xh0Var4.f43068b.add((Integer) pair3.second);
                                                                            xh0Var4.f43069c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        xh0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final xh0 xh0Var3 = xh0Var;
                                        final int i18 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList6 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        xh0 xh0Var32 = xh0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            xh0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i18).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f20990id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList6;
                                                                        if (i182 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i182);
                                                                            xh0Var32.f43067a.add((Long) pair2.first);
                                                                            xh0Var32.f43068b.add((Integer) pair2.second);
                                                                            xh0Var32.f43069c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        xh0Var32.b();
                                                        return;
                                                    default:
                                                        xh0 xh0Var4 = xh0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            xh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i18).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f20990id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i20 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i20);
                                                                            xh0Var4.f43067a.add((Long) pair3.first);
                                                                            xh0Var4.f43068b.add((Integer) pair3.second);
                                                                            xh0Var4.f43069c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        xh0Var4.b();
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
                        tL_messages_getFullChat.chat_id = chat.f20843id;
                        ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final xh0 xh0Var2 = xh0Var;
                                        final int i17 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList5 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        xh0 xh0Var32 = xh0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            xh0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap2;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i17).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f20990id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList5;
                                                                        if (i182 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i182);
                                                                            xh0Var32.f43067a.add((Long) pair2.first);
                                                                            xh0Var32.f43068b.add((Integer) pair2.second);
                                                                            xh0Var32.f43069c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        xh0Var32.b();
                                                        return;
                                                    default:
                                                        xh0 xh0Var4 = xh0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            xh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i17).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f20990id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i20 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i20);
                                                                            xh0Var4.f43067a.add((Long) pair3.first);
                                                                            xh0Var4.f43068b.add((Integer) pair3.second);
                                                                            xh0Var4.f43069c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        xh0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final xh0 xh0Var3 = xh0Var;
                                        final int i18 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList6 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        xh0 xh0Var32 = xh0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            xh0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i18).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f20990id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList6;
                                                                        if (i182 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i182);
                                                                            xh0Var32.f43067a.add((Long) pair2.first);
                                                                            xh0Var32.f43068b.add((Integer) pair2.second);
                                                                            xh0Var32.f43069c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        xh0Var32.b();
                                                        return;
                                                    default:
                                                        xh0 xh0Var4 = xh0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            xh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i18).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f20990id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i20 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i20);
                                                                            xh0Var4.f43067a.add((Long) pair3.first);
                                                                            xh0Var4.f43068b.add((Integer) pair3.second);
                                                                            xh0Var4.f43069c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        xh0Var4.b();
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
                xh0Var.b();
                return;
            default:
                int i17 = this.f14891c;
                Context context = (Context) this.d;
                long j16 = this.f14890b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f14892e;
                a0.g(i17).f(context, j16, connectedbotstarref.bot_id, new te1(i17, j16, context, connectedbotstarref, (org.telegram.ui.ActionBar.h3) this.f14893f, (org.telegram.ui.ActionBar.g6) this.h));
                return;
        }
    }

    public u6(m5 m5Var, ArrayList arrayList, int i10, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.d = m5Var;
        this.f14892e = arrayList;
        this.f14891c = i10;
        this.f14890b = j10;
        this.f14893f = arrayList2;
        this.h = arrayList3;
    }

    public u6(TopicsController topicsController, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i10) {
        this.d = topicsController;
        this.f14892e = tL_messages_forumTopics;
        this.f14890b = j10;
        this.f14893f = tL_messages_forumTopics2;
        this.h = hVar;
        this.f14891c = i10;
    }

    public u6(TLObject tLObject, int i10, qh.d dVar, org.telegram.ui.ActionBar.h3 h3Var, long j10, TLRPC.TL_error tL_error) {
        this.d = tLObject;
        this.f14891c = i10;
        this.f14892e = dVar;
        this.f14893f = h3Var;
        this.f14890b = j10;
        this.h = tL_error;
    }

    public u6(org.telegram.ui.Cells.f6 f6Var, TLObject tLObject, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = f6Var;
        this.f14893f = tLObject;
        this.h = messagesStorage;
        this.f14890b = j10;
        this.f14891c = i10;
        this.f14892e = arrayList;
    }

    public u6(xh0 xh0Var, TLRPC.TL_error tL_error, TLObject tLObject, long j10, int i10, TLRPC.Chat chat) {
        this.d = xh0Var;
        this.f14892e = tL_error;
        this.f14893f = tLObject;
        this.f14890b = j10;
        this.f14891c = i10;
        this.h = chat;
    }
}
