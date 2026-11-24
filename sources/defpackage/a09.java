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
public final class a09 extends FrameLayout {
    public yz8 E;
    public zz8 F;
    public zz8 G;
    public xz8 H;
    public final ArrayList I;
    public final ArrayList J;
    public j17 K;
    public final wjb L;
    public int a;
    public final int b;
    public final k27 c;
    public final TLRPC.Reaction d;
    public final sz8 e;
    public final tz8 f;
    public final vz8 h;
    public final ArrayList n;
    public final LongSparseArray r;
    public String s;
    public boolean w;
    public boolean x;
    public boolean y;

    public a09(Context context, wjb wjbVar, int i, k27 k27Var, TLRPC.ReactionCount reactionCount, boolean z) {
        super(context);
        TLRPC.Reaction reaction;
        int i2;
        int i3;
        this.n = new ArrayList();
        this.r = new LongSparseArray();
        this.y = true;
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        this.J = new ArrayList();
        this.b = i;
        this.c = k27Var;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.L = wjbVar;
        if (reactionCount == null) {
            i2 = 6;
        } else {
            i2 = reactionCount.count;
        }
        this.a = i2;
        sz8 sz8Var = new sz8(this, context, wjbVar);
        this.e = sz8Var;
        t26 t26Var = new t26();
        sz8Var.setLayoutManager(t26Var);
        if (Build.VERSION.SDK_INT >= 29) {
            sz8Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(bkb.w0(null, bkb.h6, false)));
        }
        tz8 tz8Var = new tz8(this, i, context, wjbVar, z);
        this.f = tz8Var;
        sz8Var.setAdapter(tz8Var);
        sz8Var.setOnItemClickListener(new bf4(this, (byte) 29));
        sz8Var.setOnItemLongClickListener(new k88(this, (byte) 19));
        sz8Var.j(new uz8(this, t26Var));
        sz8Var.setVerticalScrollBarEnabled(true);
        sz8Var.setAlpha(0.0f);
        addView(sz8Var, nme.c(-1.0f, -1));
        vz8 vz8Var = new vz8(this, context, wjbVar);
        this.h = vz8Var;
        vz8Var.e(bkb.F8, bkb.h6, -1);
        vz8Var.setIsSingleCell(true);
        vz8Var.setItemsCount(this.a);
        addView(vz8Var, nme.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !na7.q1(i).E3()) {
            arrayList.clear();
            arrayList.add(h19.d(reaction));
            e();
        }
        if (arrayList.isEmpty()) {
            i3 = 16;
        } else {
            i3 = 23;
        }
        vz8Var.setViewType(i3);
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
            na7.q1(i).a4(tL_messages_messageReactionsList.users, false);
            na7.q1(i).U3(tL_messages_messageReactionsList.chats, false);
            HashSet hashSet = new HashSet();
            int i2 = 0;
            while (true) {
                int size = tL_messages_messageReactionsList.reactions.size();
                arrayList = this.n;
                if (i2 >= size) {
                    break;
                }
                arrayList.add(tL_messages_messageReactionsList.reactions.get(i2));
                long B1 = k27.B1(tL_messages_messageReactionsList.reactions.get(i2).peer_id);
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
                h19 d = h19.d(tL_messages_messageReactionsList.reactions.get(i2).reaction);
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
            Collections.sort(arrayList, Comparator$CC.comparingInt(new mm((byte) 12)));
            this.f.f();
            if (!this.x) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(s33.f);
                duration.addUpdateListener(new u28(this, (byte) 24));
                duration.addListener(new l48(this, (byte) 26));
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
        na7 q1 = na7.q1(i);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        k27 k27Var = this.c;
        tL_messages_getMessageReactionsList.peer = q1.h1(k27.B0(k27Var.k));
        tL_messages_getMessageReactionsList.id = k27Var.e1();
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
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReactionsList, new n35(this, (byte) 24), 64);
    }

    public final void d(List list) {
        ArrayList arrayList = this.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                nz8 nz8Var = (nz8) it.next();
                TLObject tLObject = nz8Var.a;
                if (nz8Var.c > 0) {
                    int i = 0;
                    while (true) {
                        if (i < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && k27.B1(messagePeerReaction.peer_id) == nz8Var.b) {
                                messagePeerReaction.date = nz8Var.c;
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
            nz8 nz8Var2 = (nz8) it2.next();
            long j = nz8Var2.b;
            TLObject tLObject2 = nz8Var2.a;
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
                tL_messagePeerReaction.date = nz8Var2.c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(k27.B1(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new mm((byte) 11)));
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
            TLRPC.InputStickerSet i1 = k27.i1(vl.e(i, ((h19) arrayList3.get(i2)).g));
            if (i1 != null && !hashSet.contains(Long.valueOf(i1.id))) {
                arrayList2.add(i1);
                hashSet.add(Long.valueOf(i1.id));
            }
            i2++;
        }
        if (na7.q1(i).E3()) {
            return;
        }
        arrayList.addAll(arrayList2);
        j17 j17Var = new j17(this.b, 1, this.L, getContext(), arrayList2);
        this.K = j17Var;
        j17Var.L = false;
    }

    public final void f() {
        if (this.E != null) {
            int size = this.n.size();
            if (size == 0) {
                size = this.a;
            }
            int L = gl.L(size * 50);
            j17 j17Var = this.K;
            if (j17Var != null) {
                L = de9.w(8.0f, j17Var.getMeasuredHeight(), L);
            }
            sz8 sz8Var = this.e;
            if (sz8Var.getMeasuredHeight() != 0) {
                L = Math.min(sz8Var.getMeasuredHeight(), L);
            }
            this.E.k(this, L);
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
