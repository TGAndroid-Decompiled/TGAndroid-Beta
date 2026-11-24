package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rb5 extends x7c {
    public final qb5 N1;
    public int O1;
    public final TLRPC.Chat P1;
    public final TLRPC.ChatFull Q1;
    public final ArrayList R1;
    public final ArrayList S1;
    public boolean T1;
    public final vf6 U1;
    public final vf6 V1;
    public boolean W1;
    public boolean X1;
    public final vf6 Y1;
    public final HashSet Z1;
    public n45 a2;
    public boolean b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;

    public rb5(Context context, int i, TLRPC.Chat chat, TLRPC.ChatFull chatFull, vf6 vf6Var, HashSet hashSet) {
        super(i, null, context);
        this.R1 = new ArrayList();
        this.S1 = new ArrayList();
        this.U1 = new vf6();
        this.V1 = new vf6();
        this.q0 = (byte) 75;
        this.P1 = chat;
        this.Q1 = chatFull;
        this.Y1 = vf6Var;
        this.Z1 = hashSet;
        this.n1.setOnItemClickListener(new bf4(this, (byte) 5));
        qb5 qb5Var = new qb5(this, context);
        this.N1 = qb5Var;
        this.o1 = qb5Var;
        ns9 ns9Var = this.n1;
        nb5 nb5Var = new nb5(this, context);
        this.p1 = nb5Var;
        ns9Var.setAdapter(nb5Var);
        if (!this.W1) {
            this.T1 = false;
            N0();
        }
        O0();
        H0(0.0f);
    }

    @Override
    public final void E0(MotionEvent motionEvent, l7 l7Var) {
        h75 h75Var = this.a2.a;
        if (!h75Var.q2) {
            if (motionEvent.getX() > l7Var.getLeft() && motionEvent.getX() < l7Var.getRight() && motionEvent.getY() > l7Var.getTop() && motionEvent.getY() < l7Var.getBottom()) {
                h75Var.k1(h75Var.y3, null, l7Var, true);
            } else {
                h75Var.k1(h75Var.y3, null, l7Var, false);
            }
        }
    }

    @Override
    public final void G0(String str) {
        qb5 qb5Var = this.N1;
        zr9 zr9Var = qb5Var.d;
        rb5 rb5Var = qb5Var.x;
        ob5 ob5Var = qb5Var.e;
        if (ob5Var != null) {
            gl.r(ob5Var);
            qb5Var.e = null;
        }
        zr9Var.f(null, null);
        TLRPC.Chat chat = rb5Var.P1;
        ns9 ns9Var = rb5Var.n1;
        zr9Var.g(null, true, false, true, false, chat.id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            rb5Var.t1.e(true, true);
            ns9Var.X1 = false;
            ns9Var.Y1 = false;
            qb5Var.f();
            ns9Var.X1 = true;
            ns9Var.Y1 = false;
            qb5Var.h = true;
            int i = qb5Var.n + 1;
            qb5Var.n = i;
            ob5 ob5Var2 = new ob5(qb5Var, str, i, (byte) 0);
            qb5Var.e = ob5Var2;
            gl.e3(ob5Var2, 300L);
            w39 adapter = ns9Var.getAdapter();
            n39 n39Var = rb5Var.o1;
            if (adapter != n39Var) {
                ns9Var.setAdapter(n39Var);
                return;
            }
            return;
        }
        qb5Var.n = -1;
    }

    @Override
    public final void K0() {
        this.C1 = bkb.Fh;
        this.D1 = bkb.Ug;
        this.E1 = bkb.Vg;
        this.F1 = bkb.jh;
        this.G1 = bkb.dh;
        this.H1 = bkb.eh;
        this.I1 = bkb.bh;
        this.J1 = bkb.hh;
        this.K1 = bkb.ch;
    }

    public final void M0() {
        if (!this.b2) {
            return;
        }
        ArrayList arrayList = qu2.r(this.a).f0;
        ArrayList arrayList2 = this.S1;
        arrayList2.addAll(arrayList);
        long j = y6c.h(this.a).n;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i);
            if (tLObject instanceof TLRPC.TL_contact) {
                long j2 = ((TLRPC.TL_contact) tLObject).user_id;
                if (j2 == j || this.Y1.h(j2) >= 0 || this.Z1.contains(Long.valueOf(j2))) {
                    arrayList2.remove(i);
                    i--;
                    size--;
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new st2(na7.q1(this.a), ConnectionsManager.getInstance(this.a).getCurrentTime(), (byte) 2));
    }

    public final void N0() {
        vf6 vf6Var;
        TLRPC.Chat chat = this.P1;
        boolean T = hc2.T(chat);
        TLRPC.ChatFull chatFull = this.Q1;
        if (!T) {
            this.W1 = false;
            ArrayList arrayList = this.R1;
            arrayList.clear();
            this.S1.clear();
            vf6 vf6Var2 = this.U1;
            vf6Var2.b();
            this.V1.b();
            if (chatFull != null) {
                long j = y6c.h(this.a).n;
                int size = chatFull.participants.participants.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i);
                    long j2 = chatParticipant.user_id;
                    if (j2 != j && ((vf6Var = this.Y1) == null || vf6Var.h(j2) < 0)) {
                        TLRPC.User V1 = na7.q1(this.a).V1(Long.valueOf(chatParticipant.user_id));
                        if (!l7c.y(V1) && !V1.bot) {
                            arrayList.add(chatParticipant);
                            vf6Var2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.b2 = true;
                    M0();
                }
            }
            O0();
            n39 n39Var = this.p1;
            if (n39Var != null) {
                n39Var.f();
                return;
            }
            return;
        }
        this.W1 = true;
        zya zyaVar = this.t1;
        if (zyaVar != null) {
            zyaVar.e(true, false);
        }
        n39 n39Var2 = this.p1;
        if (n39Var2 != null) {
            n39Var2.f();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = na7.g1(chat);
        if (chatFull != null && chatFull.participants_count <= 200) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        } else if (!this.T1) {
            this.O1 = 2;
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
            this.T1 = true;
            N0();
        } else {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_getParticipants, new rv3(this, tL_channels_getParticipants, (byte) 11));
    }

    public final void O0() {
        this.c2 = -1;
        this.e2 = -1;
        this.f2 = -1;
        this.g2 = -1;
        this.h2 = -1;
        this.i2 = -1;
        this.j2 = -1;
        this.d2 = -1;
        boolean z = true;
        this.l2 = 1;
        TLRPC.Chat chat = this.P1;
        if (hc2.t0(chat) || hc2.y(3, chat)) {
            int i = this.l2;
            this.l2 = i + 1;
            this.c2 = i;
        }
        if (!this.W1 || this.X1) {
            ArrayList arrayList = this.S1;
            if (!arrayList.isEmpty()) {
                int i2 = this.l2;
                int i3 = i2 + 1;
                this.l2 = i3;
                this.g2 = i2;
                this.h2 = i3;
                int size = arrayList.size() + i3;
                this.l2 = size;
                this.i2 = size;
            } else {
                z = false;
            }
            ArrayList arrayList2 = this.R1;
            if (!arrayList2.isEmpty()) {
                if (z) {
                    int i4 = this.l2;
                    this.l2 = i4 + 1;
                    this.j2 = i4;
                }
                int i5 = this.l2;
                this.e2 = i5;
                int size2 = arrayList2.size() + i5;
                this.l2 = size2;
                this.f2 = size2;
            }
        }
        if (this.W1) {
            int i6 = this.l2;
            this.l2 = i6 + 1;
            this.k2 = i6;
        }
        int i7 = this.l2;
        this.l2 = i7 + 1;
        this.d2 = i7;
    }
}
