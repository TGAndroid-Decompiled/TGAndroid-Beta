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
public abstract class t76 implements gk7 {
    public static t76 N;
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

    public t76(Context context, int i, TL_stories.StoryItem storyItem, long j, int i2, boolean z, TLRPC.InputGroupCall inputGroupCall, boolean z2) {
        this.d = context;
        this.e = i;
        this.f = inputGroupCall;
        this.a = storyItem;
        this.b = j;
        this.c = i2;
        this.h = z;
        this.n = z2;
        fa4.b("[LivePlayer] setup to call " + inputGroupCall.id);
        kk7.f(i).a(this, kk7.w2);
    }

    public static t76 g(Context context, int i, TL_stories.StoryItem storyItem, long j, int i2, boolean z, TLRPC.InputGroupCall inputGroupCall, boolean z2, boolean z3) {
        t76 nm9Var;
        if (z && !z2) {
            nm9Var = new t76(context, i, storyItem, j, i2, true, inputGroupCall, false);
            um9.Z.add(nm9Var);
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else {
            nm9Var = new nm9(context, i, storyItem, j, i2, z, inputGroupCall, z2, z3);
        }
        nm9Var.n();
        return nm9Var;
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
        ConnectionsManager.getInstance(this.e).sendRequest(checkgroupcall, new p76(this, i, (byte) 1));
    }

    public final void B() {
        this.K = null;
        if (this.w) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f;
        ConnectionsManager.getInstance(this.e).sendRequest(getgroupcall, new s76(this, (byte) 3));
    }

    public final void C(boolean z) {
        if (!this.w && this.r != z) {
            if (this.n && z) {
                return;
            }
            this.r = z;
            kk7.f(this.e).k(kk7.F2, Long.valueOf(j()));
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
                    gl.r(runnable);
                    this.J = null;
                }
                Runnable runnable2 = this.K;
                if (runnable2 != null) {
                    gl.r(runnable2);
                    this.K = null;
                    return;
                }
                return;
            }
            if (runnable != null) {
                gl.r(runnable);
            }
            r76 r76Var = new r76(this, (byte) 6);
            this.J = r76Var;
            gl.d3(r76Var, 4000L);
            Runnable runnable3 = this.K;
            if (runnable3 != null) {
                gl.r(runnable3);
            }
            r76 r76Var2 = new r76(this, (byte) 7);
            this.K = r76Var2;
            if (o()) {
                i = 5000;
            } else {
                i = 20000;
            }
            gl.d3(r76Var2, i);
        }
    }

    public final void F(float f) {
        xa8 xa8Var;
        float l = Utilities.l(f);
        x76 x76Var = x76.E;
        if (x76Var != null && x76Var.b == this && (xa8Var = x76Var.a) != null && xa8Var.e() && x76Var.a.c != 0) {
            x76 x76Var2 = x76.E;
            l = (x76Var2 == null || !x76Var2.y) ? 1.0f : 0.0f;
        }
        fa4.b("setVolume(" + l + ")");
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
        tL_updateStory.peer = na7.q1(i).w1(this.b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.id = this.c;
        na7.q1(i).M1().b0(tL_updateStory);
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
        if (i == kk7.w2) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.b == longValue) {
                apb.a(this.s, groupCall);
                this.s = groupCall;
                kk7.f(this.e).k(kk7.F2, Long.valueOf(groupCall.id));
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
            kk7.f(i).n(this, kk7.w2);
            fa4.b("[LivePlayer] destroyed");
            if (this.x) {
                TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                leavegroupcall.call = this.f;
                leavegroupcall.source = this.E;
                ConnectionsManager.getInstance(i).sendRequest(leavegroupcall, new s76(this, (byte) 1));
            }
            t();
            if (N == this) {
                N = null;
                kk7.f(i).k(kk7.F2, Long.valueOf(j()));
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
            if (y6c.h(i2).e() == j) {
                return true;
            }
            return false;
        }
        return hc2.w(14, na7.q1(i2).K0(Long.valueOf(-j)));
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
        tL_inputPeerUser.user_id = y6c.h(j5.a(this.e).a).e();
        ConnectionsManager.getInstance(this.e).sendRequest(joingroupcall, new p76(this, i, (byte) 0));
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
