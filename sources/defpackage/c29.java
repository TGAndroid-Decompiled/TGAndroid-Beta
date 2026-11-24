package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c29 extends FrameLayout {
    public a29 E;
    public b29 F;
    public b29 G;
    public z19 H;
    public final ArrayList I;
    public final ArrayList J;
    public j37 K;
    public final ylb L;
    public int a;
    public final int b;
    public final k47 c;
    public final TLRPC.Reaction d;
    public final u19 e;
    public final v19 f;
    public final x19 h;
    public final ArrayList n;
    public final LongSparseArray r;
    public String s;
    public boolean w;
    public boolean x;
    public boolean y;

    public c29(Context context, ylb ylbVar, int i, k47 k47Var, TLRPC.ReactionCount reactionCount, boolean z) {
        super(context);
        TLRPC.Reaction reaction;
        int i2;
        this.n = new ArrayList();
        this.r = new LongSparseArray();
        this.y = true;
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        this.J = new ArrayList();
        this.b = i;
        this.c = k47Var;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.L = ylbVar;
        if (reactionCount == null) {
            i2 = 6;
        } else {
            i2 = reactionCount.count;
        }
        this.a = i2;
        u19 u19Var = new u19(this, context, ylbVar);
        this.e = u19Var;
        u46 u46Var = new u46();
        u19Var.setLayoutManager(u46Var);
        if (Build.VERSION.SDK_INT >= 29) {
            u19Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(cmb.w0(null, cmb.h6, false)));
        }
        v19 v19Var = new v19(this, i, context, ylbVar, z);
        this.f = v19Var;
        u19Var.setAdapter(v19Var);
        u19Var.setOnItemClickListener(new s19(this, (byte) 0));
        u19Var.setOnItemLongClickListener(new h68(this, (byte) 23));
        u19Var.j(new w19(this, u46Var));
        u19Var.setVerticalScrollBarEnabled(true);
        u19Var.setAlpha(0.0f);
        addView(u19Var, qoe.c(-1.0f, -1));
        x19 x19Var = new x19(this, context, ylbVar);
        this.h = x19Var;
        x19Var.e(cmb.F8, cmb.h6, -1);
        x19Var.setIsSingleCell(true);
        x19Var.setItemsCount(this.a);
        addView(x19Var, qoe.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !oc7.r1(i).H3()) {
            arrayList.clear();
            arrayList.add(k39.d(reaction));
            e();
        }
        x19Var.setViewType(arrayList.isEmpty() ? 16 : 23);
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void b(TLObject tLObject) {
        ArrayList arrayList;
        if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
            TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
            int i = this.b;
            oc7.r1(i).d4(tL_messages_messageReactionsList.users, false);
            oc7.r1(i).X3(tL_messages_messageReactionsList.chats, false);
            HashSet hashSet = new HashSet();
            int i2 = 0;
            while (true) {
                int size = tL_messages_messageReactionsList.reactions.size();
                arrayList = this.n;
                if (i2 >= size) {
                    break;
                }
                arrayList.add(tL_messages_messageReactionsList.reactions.get(i2));
                long B1 = k47.B1(tL_messages_messageReactionsList.reactions.get(i2).peer_id);
                LongSparseArray longSparseArray = this.r;
                ArrayList arrayList2 = (ArrayList) longSparseArray.get(B1);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                int i3 = 0;
                while (i3 < arrayList2.size()) {
                    if (((TLRPC.MessagePeerReaction) arrayList2.get(i3)).reaction == null) {
                        arrayList2.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                k39 d = k39.d(tL_messages_messageReactionsList.reactions.get(i2).reaction);
                if (d.g != 0) {
                    hashSet.add(d);
                }
                arrayList2.add(tL_messages_messageReactionsList.reactions.get(i2));
                longSparseArray.put(B1, arrayList2);
                i2++;
            }
            if (this.d == null) {
                ArrayList arrayList3 = this.I;
                arrayList3.clear();
                arrayList3.addAll(hashSet);
                e();
            }
            Collections.sort(arrayList, Comparator$CC.comparingInt(new mn((byte) 12)));
            this.f.f();
            if (!this.x) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(d53.f);
                duration.addUpdateListener(new fx7(this, (byte) 26));
                duration.addListener(new s38(this, (byte) 28));
                duration.start();
                f();
                this.x = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            this.s = str;
            if (str == null) {
                this.y = false;
            }
            this.w = false;
            return;
        }
        this.w = false;
    }

    public final void c() {
        this.w = true;
        int i = this.b;
        oc7 r1 = oc7.r1(i);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        k47 k47Var = this.c;
        tL_messages_getMessageReactionsList.peer = r1.i1(k47.B0(k47Var.k));
        tL_messages_getMessageReactionsList.id = k47Var.e1();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags |= 1;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReactionsList, new r15(this, (byte) 25), 64);
    }

    public final void d(List list) {
        ArrayList arrayList = this.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                o19 o19Var = (o19) it.next();
                TLObject tLObject = o19Var.a;
                if (o19Var.c > 0) {
                    int i = 0;
                    while (true) {
                        if (i < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && k47.B1(messagePeerReaction.peer_id) == o19Var.b) {
                                messagePeerReaction.date = o19Var.c;
                                messagePeerReaction.dateIsSeen = true;
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            o19 o19Var2 = (o19) it2.next();
            long j = o19Var2.b;
            TLObject tLObject2 = o19Var2.a;
            LongSparseArray longSparseArray = this.r;
            if (((ArrayList) longSparseArray.get(j)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).id;
                }
                tL_messagePeerReaction.date = o19Var2.c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(k47.B1(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new mn((byte) 11)));
        this.f.f();
        f();
    }

    public final void e() {
        int i;
        ArrayList arrayList = this.J;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            ArrayList arrayList3 = this.I;
            int size = arrayList3.size();
            i = this.b;
            if (i2 >= size) {
                break;
            }
            TLRPC.InputStickerSet i1 = k47.i1(vm.e(i, ((k39) arrayList3.get(i2)).g));
            if (i1 != null && !hashSet.contains(Long.valueOf(i1.id))) {
                arrayList2.add(i1);
                hashSet.add(Long.valueOf(i1.id));
            }
            i2++;
        }
        if (oc7.r1(i).H3()) {
            return;
        }
        arrayList.addAll(arrayList2);
        j37 j37Var = new j37(this.b, 1, this.L, getContext(), arrayList2);
        this.K = j37Var;
        j37Var.L = false;
    }

    public final void f() {
        if (this.E != null) {
            int size = this.n.size();
            if (size == 0) {
                size = this.a;
            }
            int L = gm.L(size * 50);
            j37 j37Var = this.K;
            if (j37Var != null) {
                L = hg9.v(8.0f, j37Var.getMeasuredHeight(), L);
            }
            u19 u19Var = this.e;
            if (u19Var.getMeasuredHeight() != 0) {
                L = Math.min(u19Var.getMeasuredHeight(), L);
            }
            this.E.f(this, L);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.x && !this.w) {
            c();
        }
    }

    public void setPredictiveCount(int i) {
        this.a = i;
        this.h.setItemsCount(i);
    }
}
