package hh;

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
import org.telegram.ui.rn;

public final class v6 implements Runnable {

    public final int f10237a = 1;

    public final int f10238b;

    public final long f10239c;
    public final Object d;

    public final Object f10240e;

    public final Object f10241f;
    public final Object h;

    public v6(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f10238b = i10;
        this.d = context;
        this.f10239c = j10;
        this.f10240e = connectedbotstarref;
        this.f10241f = e3Var;
        this.h = c6Var;
    }

    @Override
    public final void run() throws Throwable {
        long j10;
        switch (this.f10237a) {
            case 0:
                h3.x xVar = (h3.x) this.d;
                ArrayList arrayList = (ArrayList) this.f10240e;
                int i10 = this.f10238b;
                long j11 = this.f10239c;
                xVar.mo18run(arrayList, Integer.valueOf(i10), Long.valueOf(j11), (ArrayList) this.f10241f, (ArrayList) this.h);
                break;
            case 1:
                int i11 = this.f10238b;
                Context context = (Context) this.d;
                long j12 = this.f10239c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f10240e;
                c0.g(i11).f(context, j12, connectedbotstarref.bot_id, new nh.g3(i11, j12, context, connectedbotstarref, (org.telegram.ui.ActionBar.e3) this.f10241f, (org.telegram.ui.ActionBar.c6) this.h));
                break;
            case 2:
                ((TopicsController) this.d).lambda$loadTopics$5((TLRPC.TL_messages_forumTopics) this.f10240e, this.f10239c, (TLRPC.TL_messages_forumTopics) this.f10241f, (a0.h) this.h, this.f10238b);
                break;
            case 3:
                org.telegram.ui.Cells.c6.a((org.telegram.ui.Cells.c6) this.d, (TLObject) this.f10241f, (MessagesStorage) this.h, this.f10239c, this.f10238b, (ArrayList) this.f10240e);
                break;
            case 4:
                TLObject tLObject = (TLObject) this.d;
                int i12 = this.f10238b;
                lh.d dVar = (lh.d) this.f10240e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f10241f;
                long j13 = this.f10239c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLRPC.GroupCall groupCall = null;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i12).putUsers(updates.users, false);
                    MessagesController.getInstance(i12).putChats(updates.chats, false);
                    ArrayList arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
                    int size = arrayListFindUpdates.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = arrayListFindUpdates.get(i13);
                        i13++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.stageQueue.postRunnable(new org.telegram.tgnet.g(i12, updates, 1));
                    if (groupCall == null || LaunchActivity.C1 == null) {
                        dVar.setLoading(false);
                    } else {
                        e3Var.dismiss();
                        SendMessagesHelper.getInstance(i12).sendMessage(SendMessagesHelper.SendMessageParams.of(groupCall.invite_link, j13));
                        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                        if (n2VarU != null) {
                            if (n2VarU instanceof rn) {
                                rn rnVar = (rn) n2VarU;
                                if (rnVar.a() == j13 && rnVar.N3 == 0) {
                                }
                            }
                            n2VarU.presentFragment(rn.R9(j13));
                        }
                    }
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    MessagesController.getInstance(i12).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i12).putChats(groupcall.chats, false);
                    if (LaunchActivity.C1 == null) {
                        dVar.setLoading(false);
                    } else {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall.f22397id = groupCall2.f22390id;
                        tL_inputGroupCall.access_hash = groupCall2.access_hash;
                        e3Var.dismiss();
                        org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, i12, tL_inputGroupCall, false, groupcall.call, null);
                        SendMessagesHelper.getInstance(i12).sendMessage(SendMessagesHelper.SendMessageParams.of(groupcall.call.invite_link, j13));
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.pa.t(e3Var.topBulletinContainer, null, tL_error, false);
                }
                break;
            default:
                final rh0 rh0Var = (rh0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f10240e;
                TLObject tLObject2 = (TLObject) this.f10241f;
                long j14 = this.f10239c;
                final int i14 = this.f10238b;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 == null && (tLObject2 instanceof Vector)) {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    long j15 = j14;
                    final HashMap map = new HashMap();
                    final ArrayList arrayList4 = new ArrayList();
                    int size2 = vector.objects.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj2 = vector.objects.get(i15);
                        if (obj2 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj2;
                            int i16 = tL_readParticipantDate.date;
                            j10 = j15;
                            long j16 = tL_readParticipantDate.user_id;
                            Long lValueOf = Long.valueOf(j16);
                            if (j10 != j16) {
                                MessagesController.getInstance(i14).getUser(lValueOf);
                                arrayList4.add(new Pair(lValueOf, Integer.valueOf(i16)));
                                arrayList2.add(lValueOf);
                            }
                        } else {
                            j10 = j15;
                            if (obj2 instanceof Long) {
                                Long l10 = (Long) obj2;
                                if (j10 != l10.longValue()) {
                                    if (l10.longValue() > 0) {
                                        MessagesController.getInstance(i14).getUser(l10);
                                        arrayList4.add(new Pair(l10, 0));
                                        arrayList2.add(l10);
                                    } else {
                                        MessagesController.getInstance(i14).getChat(Long.valueOf(-l10.longValue()));
                                        arrayList4.add(new Pair(l10, 0));
                                        arrayList3.add(l10);
                                    }
                                }
                            }
                        }
                        i15++;
                        j15 = j10;
                    }
                    if (arrayList2.isEmpty()) {
                        for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                            Pair pair = (Pair) arrayList4.get(i17);
                            rh0Var.f41933a.add((Long) pair.first);
                            rh0Var.f41934b.add((Integer) pair.second);
                            rh0Var.f41935c.add((TLObject) map.get(pair.first));
                        }
                        rh0Var.b();
                    } else if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i14).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i14).getInputChannel(chat.f22380id);
                        final int i18 = 0;
                        ConnectionsManager.getInstance(i14).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i18) {
                                    case 0:
                                        final int i19 = 0;
                                        final rh0 rh0Var2 = rh0Var;
                                        final int i20 = i14;
                                        final HashMap map2 = map;
                                        final ArrayList arrayList5 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i19) {
                                                    case 0:
                                                        rh0 rh0Var3 = rh0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            rh0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i21 = 0;
                                                            int i22 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap map3 = map2;
                                                                if (i22 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i22);
                                                                    MessagesController.getInstance(i20).putUser(user, false);
                                                                    map3.put(Long.valueOf(user.f22527id), user);
                                                                    i22++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i21 < arrayList6.size()) {
                                                                            Pair pair2 = (Pair) arrayList6.get(i21);
                                                                            rh0Var3.f41933a.add((Long) pair2.first);
                                                                            rh0Var3.f41934b.add((Integer) pair2.second);
                                                                            rh0Var3.f41935c.add((TLObject) map3.get(pair2.first));
                                                                            i21++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var3.b();
                                                        break;
                                                    default:
                                                        rh0 rh0Var4 = rh0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            rh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i23 = 0;
                                                            int i24 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap map4 = map2;
                                                                if (i24 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i24);
                                                                    MessagesController.getInstance(i20).putUser(user2, false);
                                                                    map4.put(Long.valueOf(user2.f22527id), user2);
                                                                    i24++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i23 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i23);
                                                                            rh0Var4.f41933a.add((Long) pair3.first);
                                                                            rh0Var4.f41934b.add((Integer) pair3.second);
                                                                            rh0Var4.f41935c.add((TLObject) map4.get(pair3.first));
                                                                            i23++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var4.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i21 = 1;
                                        final rh0 rh0Var3 = rh0Var;
                                        final int i22 = i14;
                                        final HashMap map3 = map;
                                        final ArrayList arrayList6 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i21) {
                                                    case 0:
                                                        rh0 rh0Var4 = rh0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            rh0Var4.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i23 = 0;
                                                            int i24 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap map4 = map3;
                                                                if (i24 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i24);
                                                                    MessagesController.getInstance(i22).putUser(user, false);
                                                                    map4.put(Long.valueOf(user.f22527id), user);
                                                                    i24++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i23 < arrayList7.size()) {
                                                                            Pair pair2 = (Pair) arrayList7.get(i23);
                                                                            rh0Var4.f41933a.add((Long) pair2.first);
                                                                            rh0Var4.f41934b.add((Integer) pair2.second);
                                                                            rh0Var4.f41935c.add((TLObject) map4.get(pair2.first));
                                                                            i23++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var4.b();
                                                        break;
                                                    default:
                                                        rh0 rh0Var5 = rh0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            rh0Var5.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i25 = 0;
                                                            int i26 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap map5 = map3;
                                                                if (i26 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i26);
                                                                    MessagesController.getInstance(i22).putUser(user2, false);
                                                                    map5.put(Long.valueOf(user2.f22527id), user2);
                                                                    i26++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList8 = arrayList6;
                                                                        if (i25 < arrayList8.size()) {
                                                                            Pair pair3 = (Pair) arrayList8.get(i25);
                                                                            rh0Var5.f41933a.add((Long) pair3.first);
                                                                            rh0Var5.f41934b.add((Integer) pair3.second);
                                                                            rh0Var5.f41935c.add((TLObject) map5.get(pair3.first));
                                                                            i25++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var5.b();
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
                        tL_messages_getFullChat.chat_id = chat.f22380id;
                        final int i19 = 1;
                        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i19) {
                                    case 0:
                                        final int i110 = 0;
                                        final rh0 rh0Var2 = rh0Var;
                                        final int i20 = i14;
                                        final HashMap map2 = map;
                                        final ArrayList arrayList5 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i110) {
                                                    case 0:
                                                        rh0 rh0Var4 = rh0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            rh0Var4.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i23 = 0;
                                                            int i24 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap map4 = map2;
                                                                if (i24 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i24);
                                                                    MessagesController.getInstance(i20).putUser(user, false);
                                                                    map4.put(Long.valueOf(user.f22527id), user);
                                                                    i24++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i23 < arrayList7.size()) {
                                                                            Pair pair2 = (Pair) arrayList7.get(i23);
                                                                            rh0Var4.f41933a.add((Long) pair2.first);
                                                                            rh0Var4.f41934b.add((Integer) pair2.second);
                                                                            rh0Var4.f41935c.add((TLObject) map4.get(pair2.first));
                                                                            i23++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var4.b();
                                                        break;
                                                    default:
                                                        rh0 rh0Var5 = rh0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            rh0Var5.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i25 = 0;
                                                            int i26 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap map5 = map2;
                                                                if (i26 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i26);
                                                                    MessagesController.getInstance(i20).putUser(user2, false);
                                                                    map5.put(Long.valueOf(user2.f22527id), user2);
                                                                    i26++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList8 = arrayList5;
                                                                        if (i25 < arrayList8.size()) {
                                                                            Pair pair3 = (Pair) arrayList8.get(i25);
                                                                            rh0Var5.f41933a.add((Long) pair3.first);
                                                                            rh0Var5.f41934b.add((Integer) pair3.second);
                                                                            rh0Var5.f41935c.add((TLObject) map5.get(pair3.first));
                                                                            i25++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var5.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i21 = 1;
                                        final rh0 rh0Var3 = rh0Var;
                                        final int i22 = i14;
                                        final HashMap map3 = map;
                                        final ArrayList arrayList6 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i21) {
                                                    case 0:
                                                        rh0 rh0Var4 = rh0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            rh0Var4.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i23 = 0;
                                                            int i24 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap map4 = map3;
                                                                if (i24 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i24);
                                                                    MessagesController.getInstance(i22).putUser(user, false);
                                                                    map4.put(Long.valueOf(user.f22527id), user);
                                                                    i24++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i23 < arrayList7.size()) {
                                                                            Pair pair2 = (Pair) arrayList7.get(i23);
                                                                            rh0Var4.f41933a.add((Long) pair2.first);
                                                                            rh0Var4.f41934b.add((Integer) pair2.second);
                                                                            rh0Var4.f41935c.add((TLObject) map4.get(pair2.first));
                                                                            i23++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var4.b();
                                                        break;
                                                    default:
                                                        rh0 rh0Var5 = rh0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            rh0Var5.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i25 = 0;
                                                            int i26 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap map5 = map3;
                                                                if (i26 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i26);
                                                                    MessagesController.getInstance(i22).putUser(user2, false);
                                                                    map5.put(Long.valueOf(user2.f22527id), user2);
                                                                    i26++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList8 = arrayList6;
                                                                        if (i25 < arrayList8.size()) {
                                                                            Pair pair3 = (Pair) arrayList8.get(i25);
                                                                            rh0Var5.f41933a.add((Long) pair3.first);
                                                                            rh0Var5.f41934b.add((Integer) pair3.second);
                                                                            rh0Var5.f41935c.add((TLObject) map5.get(pair3.first));
                                                                            i25++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        rh0Var5.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                    }
                } else {
                    rh0Var.b();
                }
                break;
        }
    }

    public v6(h3.x xVar, ArrayList arrayList, int i10, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.d = xVar;
        this.f10240e = arrayList;
        this.f10238b = i10;
        this.f10239c = j10;
        this.f10241f = arrayList2;
        this.h = arrayList3;
    }

    public v6(TopicsController topicsController, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i10) {
        this.d = topicsController;
        this.f10240e = tL_messages_forumTopics;
        this.f10239c = j10;
        this.f10241f = tL_messages_forumTopics2;
        this.h = hVar;
        this.f10238b = i10;
    }

    public v6(TLObject tLObject, int i10, lh.d dVar, org.telegram.ui.ActionBar.e3 e3Var, long j10, TLRPC.TL_error tL_error) {
        this.d = tLObject;
        this.f10238b = i10;
        this.f10240e = dVar;
        this.f10241f = e3Var;
        this.f10239c = j10;
        this.h = tL_error;
    }

    public v6(org.telegram.ui.Cells.c6 c6Var, TLObject tLObject, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = c6Var;
        this.f10241f = tLObject;
        this.h = messagesStorage;
        this.f10239c = j10;
        this.f10238b = i10;
        this.f10240e = arrayList;
    }

    public v6(rh0 rh0Var, TLRPC.TL_error tL_error, TLObject tLObject, long j10, int i10, TLRPC.Chat chat) {
        this.d = rh0Var;
        this.f10240e = tL_error;
        this.f10241f = tLObject;
        this.f10239c = j10;
        this.f10238b = i10;
        this.h = chat;
    }
}
