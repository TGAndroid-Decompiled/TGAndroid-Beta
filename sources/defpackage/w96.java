package defpackage;

import android.content.Context;
import android.media.AudioManager;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
public abstract class w96 implements fn7 {
    public static w96 N;
    public int E;
    public volatile boolean F;
    public volatile boolean G;
    public boolean I;
    public Runnable J;
    public Runnable K;
    public ArrayList L;
    public ArrayList M;
    public final TL_stories.StoryItem a;
    public final long b;
    public final int c;
    public final Context d;
    public final int e;
    public final TLRPC.InputGroupCall f;
    public final boolean h;
    public boolean n;
    public TLRPC.GroupCall s;
    public boolean x;
    public TLRPC.GroupCallParticipant y;
    public boolean r = false;
    public boolean w = false;
    public float H = 1.0f;

    public w96(Context context, int i, TL_stories.StoryItem storyItem, long j, int i2, boolean z, TLRPC.InputGroupCall inputGroupCall, boolean z2) {
        this.d = context;
        this.e = i;
        this.f = inputGroupCall;
        this.a = storyItem;
        this.b = j;
        this.c = i2;
        this.h = z;
        this.n = z2;
        cc4.b("[LivePlayer] setup to call " + inputGroupCall.id);
        jn7.f(i).a(this, jn7.x2);
    }

    public static w96 g(Context context, int i, TL_stories.StoryItem storyItem, long j, int i2, boolean z, TLRPC.InputGroupCall inputGroupCall, boolean z2, boolean z3) {
        w96 dq9Var;
        if (z && !z2) {
            dq9Var = new w96(context, i, storyItem, j, i2, true, inputGroupCall, false);
            kq9.Z.add(dq9Var);
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else {
            dq9Var = new dq9(context, i, storyItem, j, i2, z, inputGroupCall, z2, z3);
        }
        dq9Var.n();
        return dq9Var;
    }

    public final void A() {
        this.J = null;
        if (this.w) {
            return;
        }
        z(a.o());
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.f;
        int i = this.E;
        checkgroupcall.sources.add(Integer.valueOf(i));
        ConnectionsManager.getInstance(this.e).sendRequest(checkgroupcall, new v96(this, i, (byte) 0));
    }

    public final void B() {
        this.K = null;
        if (this.w) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f;
        ConnectionsManager.getInstance(this.e).sendRequest(getgroupcall, new t96(this, (byte) 1));
    }

    public final void C(boolean z) {
        if (!this.w && this.r != z) {
            if (this.n && z) {
                return;
            }
            this.r = z;
            jn7.f(this.e).k(jn7.G2, Long.valueOf(j()));
        }
    }

    public final void E(boolean z) {
        int i;
        if (this.w) {
            z = false;
        }
        if (this.I != z) {
            this.I = z;
            Runnable runnable = this.J;
            if (!z) {
                if (runnable != null) {
                    hl.r(runnable);
                    this.J = null;
                }
                Runnable runnable2 = this.K;
                if (runnable2 != null) {
                    hl.r(runnable2);
                    this.K = null;
                    return;
                }
                return;
            }
            if (runnable != null) {
                hl.r(runnable);
            }
            u96 u96Var = new u96(this, (byte) 1);
            this.J = u96Var;
            hl.d3(u96Var, 4000L);
            Runnable runnable3 = this.K;
            if (runnable3 != null) {
                hl.r(runnable3);
            }
            u96 u96Var2 = new u96(this, (byte) 2);
            this.K = u96Var2;
            if (o()) {
                i = 5000;
            } else {
                i = 20000;
            }
            hl.d3(u96Var2, i);
        }
    }

    public final void F(float f) {
        me8 me8Var;
        float l = Utilities.l(f);
        ba6 ba6Var = ba6.E;
        if (ba6Var != null && ba6Var.b == this && (me8Var = ba6Var.a) != null && me8Var.f() && ba6Var.a.c != 0) {
            ba6 ba6Var2 = ba6.E;
            l = (ba6Var2 == null || !ba6Var2.y) ? 1.0f : 0.0f;
        }
        cc4.b("setVolume(" + l + ")");
        if (Math.abs(l - this.H) >= 0.01f) {
            this.H = l;
            if (this.w) {
                return;
            }
            a();
        }
    }

    public final void G() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        int i = this.e;
        tL_updateStory.peer = uc7.s1(i).y1(this.b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.id = this.c;
        uc7.s1(i).O1().b0(tL_updateStory);
        h();
    }

    public abstract void a();

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public abstract void d();

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.x2) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.b == longValue) {
                atb.a(this.s, groupCall);
                this.s = groupCall;
                jn7.f(this.e).k(jn7.G2, Long.valueOf(groupCall.id));
            }
        }
    }

    public final boolean e() {
        if (this.s == null || o()) {
            return false;
        }
        return !this.s.messages_enabled;
    }

    public final void h() {
        if (!this.w) {
            this.w = true;
            E(false);
            int i = this.e;
            jn7.f(i).n(this, jn7.x2);
            cc4.b("[LivePlayer] destroyed");
            if (this.x) {
                TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                leavegroupcall.call = this.f;
                leavegroupcall.source = this.E;
                ConnectionsManager.getInstance(i).sendRequest(leavegroupcall, new t96(this, (byte) 3));
            }
            t();
            if (N == this) {
                N = null;
                jn7.f(i).k(jn7.G2, Long.valueOf(j()));
            }
        }
    }

    public final boolean i(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.f;
        if (inputGroupCall2 != inputGroupCall && inputGroupCall2.id != inputGroupCall.id) {
            return false;
        }
        return true;
    }

    public final long j() {
        TLRPC.GroupCall groupCall = this.s;
        if (groupCall != null) {
            return groupCall.id;
        }
        TLRPC.InputGroupCall inputGroupCall = this.f;
        if (inputGroupCall != null) {
            return inputGroupCall.id;
        }
        return 0L;
    }

    public final int k() {
        TLRPC.GroupCall groupCall = this.s;
        if (groupCall == null || (groupCall.flags & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return groupCall.stream_dc_id;
    }

    public final TLRPC.Peer l() {
        TLRPC.GroupCall groupCall = this.s;
        if (groupCall == null) {
            return null;
        }
        return groupCall.default_send_as;
    }

    public final long m() {
        TLRPC.GroupCall groupCall = this.s;
        if (groupCall == null) {
            return 0L;
        }
        return groupCall.send_paid_messages_stars;
    }

    public void n() {
        if (this.w) {
            return;
        }
        int nextInt = (Utilities.b.nextInt() & Integer.MAX_VALUE) | 1;
        s(nextInt, "{\"fingerprints\": [], \"ufrag\": \"\", \"pwd\": \"\", \"ssrc\": " + nextInt + ", \"ssrc-groups\": []}");
    }

    public final boolean o() {
        TLRPC.GroupCall groupCall = this.s;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        long j = this.b;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.e;
        if (i >= 0) {
            if (yac.h(i2).e() == j) {
                return true;
            }
            return false;
        }
        return xc2.w(14, uc7.s1(i2).M0(Long.valueOf(-j)));
    }

    public final boolean p() {
        if (!this.w && this.r) {
            return true;
        }
        return false;
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public final void s(int i, String str) {
        this.E = i;
        this.F = true;
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        boolean z = !this.n;
        joingroupcall.muted = z;
        joingroupcall.video_stopped = z;
        joingroupcall.call = this.f;
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        joingroupcall.join_as = tL_inputPeerUser;
        tL_inputPeerUser.user_id = yac.h(k5.a(this.e).a).e();
        ConnectionsManager.getInstance(this.e).sendRequest(joingroupcall, new v96(this, i, (byte) 1));
    }

    public abstract void t();

    public abstract void x();

    public abstract void y(TLRPC.TL_dataJSON tL_dataJSON, boolean z);

    public abstract void z(boolean z);

    public void H() {
    }

    public void f() {
    }

    public void u() {
    }

    public void v() {
    }

    public void D(boolean z) {
    }

    public void w(TLRPC.TL_error tL_error) {
    }
}
