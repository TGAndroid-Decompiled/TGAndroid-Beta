package jh;

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
import org.telegram.ui.fe1;
import org.telegram.ui.oh0;
import org.telegram.ui.th;
import org.telegram.ui.tn;
public final class t6 implements Runnable {
    public final int f12849a = 5;
    public final long f12850b;
    public final int f12851c;
    public final Object d;
    public final Object f12852e;
    public final Object f12853f;
    public final Object h;

    public t6(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f12851c = i10;
        this.d = context;
        this.f12850b = j10;
        this.f12852e = connectedbotstarref;
        this.f12853f = f3Var;
        this.h = c6Var;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f12849a) {
            case 0:
                eg.n nVar = (eg.n) this.d;
                ArrayList arrayList = (ArrayList) this.f12852e;
                int i10 = this.f12851c;
                long j11 = this.f12850b;
                nVar.mo19run(arrayList, Integer.valueOf(i10), Long.valueOf(j11), (ArrayList) this.f12853f, (ArrayList) this.h);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$5((TLRPC.TL_messages_forumTopics) this.f12852e, this.f12850b, (TLRPC.TL_messages_forumTopics) this.f12853f, (a0.h) this.h, this.f12851c);
                return;
            case 2:
                org.telegram.ui.Cells.d6.a((org.telegram.ui.Cells.d6) this.d, (TLObject) this.f12853f, (MessagesStorage) this.h, this.f12850b, this.f12851c, (ArrayList) this.f12852e);
                return;
            case 3:
                TLObject tLObject = (TLObject) this.d;
                int i11 = this.f12851c;
                nh.d dVar = (nh.d) this.f12852e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f12853f;
                long j12 = this.f12850b;
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
                    if (groupCall != null && LaunchActivity.C1 != null) {
                        f3Var.dismiss();
                        SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupCall.invite_link, j12));
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            if (U instanceof tn) {
                                tn tnVar = (tn) U;
                                if (tnVar.a() == j12 && tnVar.N3 == 0) {
                                    return;
                                }
                            }
                            U.presentFragment(tn.R9(j12));
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
                    if (LaunchActivity.C1 == null) {
                        dVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall.f22409id = groupCall2.f22402id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    f3Var.dismiss();
                    org.telegram.ui.Components.voip.h2.h(LaunchActivity.C1, i11, tL_inputGroupCall, false, groupcall.call, null);
                    SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupcall.call.invite_link, j12));
                    return;
                } else if (tL_error != null) {
                    th.t(f3Var.topBulletinContainer, null, tL_error, false);
                    return;
                } else {
                    return;
                }
            case 4:
                final oh0 oh0Var = (oh0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f12852e;
                TLObject tLObject2 = (TLObject) this.f12853f;
                long j13 = this.f12850b;
                final int i13 = this.f12851c;
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
                            oh0Var.f41127a.add((Long) pair.first);
                            oh0Var.f41128b.add((Integer) pair.second);
                            oh0Var.f41129c.add((TLObject) hashMap.get(pair.first));
                        }
                        oh0Var.b();
                        return;
                    } else if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i13).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i13).getInputChannel(chat.f22392id);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final oh0 oh0Var2 = oh0Var;
                                        final int i17 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList5 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        oh0 oh0Var3 = oh0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            oh0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i18 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap3 = hashMap2;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i17).putUser(user, false);
                                                                    hashMap3.put(Long.valueOf(user.f22539id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i18 < arrayList6.size()) {
                                                                            Pair pair2 = (Pair) arrayList6.get(i18);
                                                                            oh0Var3.f41127a.add((Long) pair2.first);
                                                                            oh0Var3.f41128b.add((Integer) pair2.second);
                                                                            oh0Var3.f41129c.add((TLObject) hashMap3.get(pair2.first));
                                                                            i18++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        oh0Var3.b();
                                                        return;
                                                    default:
                                                        oh0 oh0Var4 = oh0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            oh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i17).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f22539id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i20 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i20);
                                                                            oh0Var4.f41127a.add((Long) pair3.first);
                                                                            oh0Var4.f41128b.add((Integer) pair3.second);
                                                                            oh0Var4.f41129c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        oh0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final oh0 oh0Var3 = oh0Var;
                                        final int i18 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList6 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        oh0 oh0Var32 = oh0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            oh0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i18).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f22539id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList6;
                                                                        if (i182 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i182);
                                                                            oh0Var32.f41127a.add((Long) pair2.first);
                                                                            oh0Var32.f41128b.add((Integer) pair2.second);
                                                                            oh0Var32.f41129c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        oh0Var32.b();
                                                        return;
                                                    default:
                                                        oh0 oh0Var4 = oh0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            oh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i18).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f22539id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i20 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i20);
                                                                            oh0Var4.f41127a.add((Long) pair3.first);
                                                                            oh0Var4.f41128b.add((Integer) pair3.second);
                                                                            oh0Var4.f41129c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        oh0Var4.b();
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
                        tL_messages_getFullChat.chat_id = chat.f22392id;
                        ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final oh0 oh0Var2 = oh0Var;
                                        final int i17 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList5 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        oh0 oh0Var32 = oh0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            oh0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap2;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i17).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f22539id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList5;
                                                                        if (i182 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i182);
                                                                            oh0Var32.f41127a.add((Long) pair2.first);
                                                                            oh0Var32.f41128b.add((Integer) pair2.second);
                                                                            oh0Var32.f41129c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        oh0Var32.b();
                                                        return;
                                                    default:
                                                        oh0 oh0Var4 = oh0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            oh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i17).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f22539id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i20 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i20);
                                                                            oh0Var4.f41127a.add((Long) pair3.first);
                                                                            oh0Var4.f41128b.add((Integer) pair3.second);
                                                                            oh0Var4.f41129c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        oh0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final oh0 oh0Var3 = oh0Var;
                                        final int i18 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList6 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        oh0 oh0Var32 = oh0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            oh0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i182 = 0;
                                                            int i19 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i19 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                    MessagesController.getInstance(i18).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.f22539id), user);
                                                                    i19++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList6;
                                                                        if (i182 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i182);
                                                                            oh0Var32.f41127a.add((Long) pair2.first);
                                                                            oh0Var32.f41128b.add((Integer) pair2.second);
                                                                            oh0Var32.f41129c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i182++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        oh0Var32.b();
                                                        return;
                                                    default:
                                                        oh0 oh0Var4 = oh0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            oh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i21 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                    MessagesController.getInstance(i18).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.f22539id), user2);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i20 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i20);
                                                                            oh0Var4.f41127a.add((Long) pair3.first);
                                                                            oh0Var4.f41128b.add((Integer) pair3.second);
                                                                            oh0Var4.f41129c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        oh0Var4.b();
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
                oh0Var.b();
                return;
            default:
                int i17 = this.f12851c;
                Context context = (Context) this.d;
                long j16 = this.f12850b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f12852e;
                b0.g(i17).f(context, j16, connectedbotstarref.bot_id, new fe1(i17, j16, context, connectedbotstarref, (org.telegram.ui.ActionBar.f3) this.f12853f, (org.telegram.ui.ActionBar.c6) this.h));
                return;
        }
    }

    public t6(eg.n nVar, ArrayList arrayList, int i10, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.d = nVar;
        this.f12852e = arrayList;
        this.f12851c = i10;
        this.f12850b = j10;
        this.f12853f = arrayList2;
        this.h = arrayList3;
    }

    public t6(TopicsController topicsController, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i10) {
        this.d = topicsController;
        this.f12852e = tL_messages_forumTopics;
        this.f12850b = j10;
        this.f12853f = tL_messages_forumTopics2;
        this.h = hVar;
        this.f12851c = i10;
    }

    public t6(TLObject tLObject, int i10, nh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j10, TLRPC.TL_error tL_error) {
        this.d = tLObject;
        this.f12851c = i10;
        this.f12852e = dVar;
        this.f12853f = f3Var;
        this.f12850b = j10;
        this.h = tL_error;
    }

    public t6(org.telegram.ui.Cells.d6 d6Var, TLObject tLObject, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = d6Var;
        this.f12853f = tLObject;
        this.h = messagesStorage;
        this.f12850b = j10;
        this.f12851c = i10;
        this.f12852e = arrayList;
    }

    public t6(oh0 oh0Var, TLRPC.TL_error tL_error, TLObject tLObject, long j10, int i10, TLRPC.Chat chat) {
        this.d = oh0Var;
        this.f12852e = tL_error;
        this.f12853f = tLObject;
        this.f12850b = j10;
        this.f12851c = i10;
        this.h = chat;
    }
}
