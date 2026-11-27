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
public final class o39 extends FrameLayout {
    public m39 E;
    public n39 F;
    public n39 G;
    public l39 H;
    public final ArrayList I;
    public final ArrayList J;
    public q37 K;
    public final vnb L;
    public int a;
    public final int b;
    public final r47 c;
    public final TLRPC.Reaction d;
    public final g39 e;
    public final h39 f;
    public final j39 h;
    public final ArrayList n;
    public final LongSparseArray r;
    public String s;
    public boolean w;
    public boolean x;
    public boolean y;

    public o39(Context context, vnb vnbVar, int i, r47 r47Var, TLRPC.ReactionCount reactionCount, boolean z) {
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
        this.c = r47Var;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.L = vnbVar;
        if (reactionCount == null) {
            i2 = 6;
        } else {
            i2 = reactionCount.count;
        }
        this.a = i2;
        g39 g39Var = new g39(this, context, vnbVar);
        this.e = g39Var;
        x46 x46Var = new x46();
        g39Var.setLayoutManager(x46Var);
        if (Build.VERSION.SDK_INT >= 29) {
            g39Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(aob.w0(null, aob.i6, false)));
        }
        h39 h39Var = new h39(this, i, context, vnbVar, z);
        this.f = h39Var;
        g39Var.setAdapter(h39Var);
        g39Var.setOnItemClickListener(new zg4(this, (byte) 29));
        g39Var.setOnItemLongClickListener(new jz7(this, (byte) 26));
        g39Var.j(new i39(this, x46Var));
        g39Var.setVerticalScrollBarEnabled(true);
        g39Var.setAlpha(0.0f);
        addView(g39Var, tre.c(-1.0f, -1));
        j39 j39Var = new j39(this, context, vnbVar);
        this.h = j39Var;
        j39Var.e(aob.G8, aob.i6, -1);
        j39Var.setIsSingleCell(true);
        j39Var.setItemsCount(this.a);
        addView(j39Var, tre.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !uc7.s1(i).M3()) {
            arrayList.clear();
            arrayList.add(w49.d(reaction));
            e();
        }
        if (arrayList.isEmpty()) {
            i3 = 16;
        } else {
            i3 = 23;
        }
        j39Var.setViewType(i3);
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
            uc7.s1(i).j4(tL_messages_messageReactionsList.users, false);
            uc7.s1(i).c4(tL_messages_messageReactionsList.chats, false);
            HashSet hashSet = new HashSet();
            int i2 = 0;
            while (true) {
                int size = tL_messages_messageReactionsList.reactions.size();
                arrayList = this.n;
                if (i2 >= size) {
                    break;
                }
                arrayList.add(tL_messages_messageReactionsList.reactions.get(i2));
                long B1 = r47.B1(tL_messages_messageReactionsList.reactions.get(i2).peer_id);
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
                w49 d = w49.d(tL_messages_messageReactionsList.reactions.get(i2).reaction);
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
            Collections.sort(arrayList, Comparator$CC.comparingInt(new nm((byte) 12)));
            this.f.f();
            if (!this.x) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(k43.f);
                duration.addUpdateListener(new pv7(this, (byte) 27));
                duration.addListener(new n88(this, (byte) 25));
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
        uc7 s1 = uc7.s1(i);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        r47 r47Var = this.c;
        tL_messages_getMessageReactionsList.peer = s1.j1(r47.B0(r47Var.k));
        tL_messages_getMessageReactionsList.id = r47Var.e1();
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
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReactionsList, new w15(this, (byte) 25), 64);
    }

    public final void d(List list) {
        ArrayList arrayList = this.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b39 b39Var = (b39) it.next();
                TLObject tLObject = b39Var.a;
                if (b39Var.c > 0) {
                    int i = 0;
                    while (true) {
                        if (i < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && r47.B1(messagePeerReaction.peer_id) == b39Var.b) {
                                messagePeerReaction.date = b39Var.c;
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
            b39 b39Var2 = (b39) it2.next();
            long j = b39Var2.b;
            TLObject tLObject2 = b39Var2.a;
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
                tL_messagePeerReaction.date = b39Var2.c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(r47.B1(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new nm((byte) 11)));
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
            TLRPC.InputStickerSet i1 = r47.i1(wl.e(i, ((w49) arrayList3.get(i2)).g));
            if (i1 != null && !hashSet.contains(Long.valueOf(i1.id))) {
                arrayList2.add(i1);
                hashSet.add(Long.valueOf(i1.id));
            }
            i2++;
        }
        if (uc7.s1(i).M3()) {
            return;
        }
        arrayList.addAll(arrayList2);
        q37 q37Var = new q37(this.b, 1, this.L, getContext(), arrayList2);
        this.K = q37Var;
        q37Var.L = false;
    }

    public final void f() {
        if (this.E != null) {
            int size = this.n.size();
            if (size == 0) {
                size = this.a;
            }
            int L = hl.L(size * 50);
            q37 q37Var = this.K;
            if (q37Var != null) {
                L = uh9.w(8.0f, q37Var.getMeasuredHeight(), L);
            }
            g39 g39Var = this.e;
            if (g39Var.getMeasuredHeight() != 0) {
                L = Math.min(g39Var.getMeasuredHeight(), L);
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
