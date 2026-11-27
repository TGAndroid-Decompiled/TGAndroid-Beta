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
public final class sd5 extends xbc {
    public final rd5 N1;
    public int O1;
    public final TLRPC.Chat P1;
    public final TLRPC.ChatFull Q1;
    public final ArrayList R1;
    public final ArrayList S1;
    public boolean T1;
    public final zh6 U1;
    public final zh6 V1;
    public boolean W1;
    public boolean X1;
    public final zh6 Y1;
    public final HashSet Z1;
    public p65 a2;
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

    public sd5(Context context, int i, TLRPC.Chat chat, TLRPC.ChatFull chatFull, zh6 zh6Var, HashSet hashSet) {
        super(i, null, context);
        this.R1 = new ArrayList();
        this.S1 = new ArrayList();
        this.U1 = new zh6();
        this.V1 = new zh6();
        this.q0 = (byte) 75;
        this.P1 = chat;
        this.Q1 = chatFull;
        this.Y1 = zh6Var;
        this.Z1 = hashSet;
        this.n1.setOnItemClickListener(new zg4(this, (byte) 5));
        rd5 rd5Var = new rd5(this, context);
        this.N1 = rd5Var;
        this.o1 = rd5Var;
        gw9 gw9Var = this.n1;
        od5 od5Var = new od5(this, context);
        this.p1 = od5Var;
        gw9Var.setAdapter(od5Var);
        if (!this.W1) {
            this.T1 = false;
            O0();
        }
        P0();
        I0(0.0f);
    }

    @Override
    public final void F0(MotionEvent motionEvent, m7 m7Var) {
        j95 j95Var = this.a2.a;
        if (!j95Var.q2) {
            if (motionEvent.getX() > m7Var.getLeft() && motionEvent.getX() < m7Var.getRight() && motionEvent.getY() > m7Var.getTop() && motionEvent.getY() < m7Var.getBottom()) {
                j95Var.l1(j95Var.y3, null, m7Var, true);
            } else {
                j95Var.l1(j95Var.y3, null, m7Var, false);
            }
        }
    }

    @Override
    public final void H0(String str) {
        rd5 rd5Var = this.N1;
        sv9 sv9Var = rd5Var.d;
        sd5 sd5Var = rd5Var.x;
        pd5 pd5Var = rd5Var.e;
        if (pd5Var != null) {
            hl.r(pd5Var);
            rd5Var.e = null;
        }
        sv9Var.f(null, null);
        TLRPC.Chat chat = sd5Var.P1;
        gw9 gw9Var = sd5Var.n1;
        sv9Var.g(null, true, false, true, false, chat.id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            sd5Var.t1.e(true, true);
            gw9Var.X1 = false;
            gw9Var.Y1 = false;
            rd5Var.f();
            gw9Var.X1 = true;
            gw9Var.Y1 = false;
            rd5Var.h = true;
            int i = rd5Var.n + 1;
            rd5Var.n = i;
            pd5 pd5Var2 = new pd5(rd5Var, str, i, (byte) 0);
            rd5Var.e = pd5Var2;
            hl.d3(pd5Var2, 300L);
            j79 adapter = gw9Var.getAdapter();
            c79 c79Var = sd5Var.o1;
            if (adapter != c79Var) {
                gw9Var.setAdapter(c79Var);
                return;
            }
            return;
        }
        rd5Var.n = -1;
    }

    @Override
    public final void L0() {
        this.C1 = aob.Gh;
        this.D1 = aob.Vg;
        this.E1 = aob.Wg;
        this.F1 = aob.kh;
        this.G1 = aob.eh;
        this.H1 = aob.fh;
        this.I1 = aob.ch;
        this.J1 = aob.ih;
        this.K1 = aob.dh;
    }

    public final void N0() {
        if (!this.b2) {
            return;
        }
        ArrayList arrayList = lv2.r(this.a).f0;
        ArrayList arrayList2 = this.S1;
        arrayList2.addAll(arrayList);
        long j = yac.h(this.a).n;
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
        Collections.sort(arrayList2, new mu2(uc7.s1(this.a), ConnectionsManager.getInstance(this.a).getCurrentTime(), (byte) 2));
    }

    public final void O0() {
        zh6 zh6Var;
        TLRPC.Chat chat = this.P1;
        boolean T = xc2.T(chat);
        TLRPC.ChatFull chatFull = this.Q1;
        if (!T) {
            this.W1 = false;
            ArrayList arrayList = this.R1;
            arrayList.clear();
            this.S1.clear();
            zh6 zh6Var2 = this.U1;
            zh6Var2.b();
            this.V1.b();
            if (chatFull != null) {
                long j = yac.h(this.a).n;
                int size = chatFull.participants.participants.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i);
                    long j2 = chatParticipant.user_id;
                    if (j2 != j && ((zh6Var = this.Y1) == null || zh6Var.h(j2) < 0)) {
                        TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(chatParticipant.user_id));
                        if (!lbc.z(X1) && !X1.bot) {
                            arrayList.add(chatParticipant);
                            zh6Var2.k(chatParticipant.user_id, chatParticipant);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.b2 = true;
                    N0();
                }
            }
            P0();
            c79 c79Var = this.p1;
            if (c79Var != null) {
                c79Var.f();
                return;
            }
            return;
        }
        this.W1 = true;
        z2b z2bVar = this.t1;
        if (z2bVar != null) {
            z2bVar.e(true, false);
        }
        c79 c79Var2 = this.p1;
        if (c79Var2 != null) {
            c79Var2.f();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = uc7.i1(chat);
        if (chatFull != null && chatFull.participants_count <= 200) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        } else if (!this.T1) {
            this.O1 = 2;
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
            this.T1 = true;
            O0();
        } else {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_getParticipants, new mw3(this, tL_channels_getParticipants, (byte) 11));
    }

    public final void P0() {
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
        if (xc2.t0(chat) || xc2.y(3, chat)) {
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
