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
public final class pd5 extends y9c {
    public final od5 N1;
    public int O1;
    public final TLRPC.Chat P1;
    public final TLRPC.ChatFull Q1;
    public final ArrayList R1;
    public final ArrayList S1;
    public boolean T1;
    public final vh6 U1;
    public final vh6 V1;
    public boolean W1;
    public boolean X1;
    public final vh6 Y1;
    public final HashSet Z1;
    public l65 a2;
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

    public pd5(Context context, int i, TLRPC.Chat chat, TLRPC.ChatFull chatFull, vh6 vh6Var, HashSet hashSet) {
        super(i, null, context);
        this.R1 = new ArrayList();
        this.S1 = new ArrayList();
        this.U1 = new vh6();
        this.V1 = new vh6();
        this.q0 = (byte) 75;
        this.P1 = chat;
        this.Q1 = chatFull;
        this.Y1 = vh6Var;
        this.Z1 = hashSet;
        this.n1.setOnItemClickListener(new kg4(this, (byte) 6));
        od5 od5Var = new od5(this, context);
        this.N1 = od5Var;
        this.o1 = od5Var;
        pu9 pu9Var = this.n1;
        ld5 ld5Var = new ld5(this, context);
        this.p1 = ld5Var;
        pu9Var.setAdapter(ld5Var);
        if (!this.W1) {
            this.T1 = false;
            N0();
        }
        O0();
        H0(0.0f);
    }

    @Override
    public final void E0(MotionEvent motionEvent, l7 l7Var) {
        g95 g95Var = this.a2.a;
        if (!g95Var.q2) {
            if (motionEvent.getX() > l7Var.getLeft() && motionEvent.getX() < l7Var.getRight() && motionEvent.getY() > l7Var.getTop() && motionEvent.getY() < l7Var.getBottom()) {
                g95Var.k1(g95Var.y3, null, l7Var, true);
            } else {
                g95Var.k1(g95Var.y3, null, l7Var, false);
            }
        }
    }

    @Override
    public final void G0(String str) {
        od5 od5Var = this.N1;
        bu9 bu9Var = od5Var.d;
        pd5 pd5Var = od5Var.x;
        md5 md5Var = od5Var.e;
        if (md5Var != null) {
            gm.r(md5Var);
            od5Var.e = null;
        }
        bu9Var.f(null, null);
        TLRPC.Chat chat = pd5Var.P1;
        pu9 pu9Var = pd5Var.n1;
        bu9Var.g(null, true, false, true, false, chat.id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            pd5Var.t1.e(true, true);
            pu9Var.X1 = false;
            pu9Var.Y1 = false;
            od5Var.f();
            pu9Var.X1 = true;
            pu9Var.Y1 = false;
            od5Var.h = true;
            int i = od5Var.n + 1;
            od5Var.n = i;
            md5 md5Var2 = new md5(od5Var, str, i, (byte) 0);
            od5Var.e = md5Var2;
            gm.d3(md5Var2, 300L);
            y59 adapter = pu9Var.getAdapter();
            q59 q59Var = pd5Var.o1;
            if (adapter != q59Var) {
                pu9Var.setAdapter(q59Var);
                return;
            }
            return;
        }
        od5Var.n = -1;
    }

    @Override
    public final void K0() {
        this.C1 = cmb.Fh;
        this.D1 = cmb.Ug;
        this.E1 = cmb.Vg;
        this.F1 = cmb.jh;
        this.G1 = cmb.dh;
        this.H1 = cmb.eh;
        this.I1 = cmb.bh;
        this.J1 = cmb.hh;
        this.K1 = cmb.ch;
    }

    public final void M0() {
        if (!this.b2) {
            return;
        }
        ArrayList arrayList = bw2.r(this.a).f0;
        ArrayList arrayList2 = this.S1;
        arrayList2.addAll(arrayList);
        long j = z8c.h(this.a).n;
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
        Collections.sort(arrayList2, new dv2(oc7.r1(this.a), ConnectionsManager.getInstance(this.a).getCurrentTime(), (byte) 2));
    }

    public final void N0() {
        vh6 vh6Var;
        TLRPC.Chat chat = this.P1;
        boolean T = sd2.T(chat);
        TLRPC.ChatFull chatFull = this.Q1;
        if (!T) {
            this.W1 = false;
            ArrayList arrayList = this.R1;
            arrayList.clear();
            this.S1.clear();
            vh6 vh6Var2 = this.U1;
            vh6Var2.b();
            this.V1.b();
            if (chatFull != null) {
                long j = z8c.h(this.a).n;
                int size = chatFull.participants.participants.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i);
                    long j2 = chatParticipant.user_id;
                    if (j2 != j && ((vh6Var = this.Y1) == null || vh6Var.h(j2) < 0)) {
                        TLRPC.User W1 = oc7.r1(this.a).W1(Long.valueOf(chatParticipant.user_id));
                        if (!m9c.z(W1) && !W1.bot) {
                            arrayList.add(chatParticipant);
                            vh6Var2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.b2 = true;
                    M0();
                }
            }
            O0();
            q59 q59Var = this.p1;
            if (q59Var != null) {
                q59Var.f();
                return;
            }
            return;
        }
        this.W1 = true;
        a1b a1bVar = this.t1;
        if (a1bVar != null) {
            a1bVar.e(true, false);
        }
        q59 q59Var2 = this.p1;
        if (q59Var2 != null) {
            q59Var2.f();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = oc7.h1(chat);
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_getParticipants, new cx3(this, tL_channels_getParticipants, (byte) 11));
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
        if (sd2.t0(chat) || sd2.y(3, chat)) {
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
