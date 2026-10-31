package c3;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import li.a1;
import org.telegram.messenger.ot;
import org.telegram.messenger.vp;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.fo;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uy0;
import v7.t6;
import v7.y8;
public final class g0 implements p, q, OnFailureListener, l2.i, a1, fo {
    public final int f3649a;
    public long f3650b;
    public Object f3651c;

    public g0(long j10, Object obj, int i10) {
        this.f3649a = i10;
        this.f3650b = j10;
        this.f3651c = obj;
    }

    @Override
    public long A(long j10, long j11) {
        return ((j) this.f3651c).f3657a;
    }

    public int B(int i10) {
        g0 g0Var = (g0) this.f3651c;
        if (g0Var == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f3650b);
            }
            return Long.bitCount(this.f3650b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f3650b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f3650b) + g0Var.B(i10 - 64);
        }
    }

    public void C() {
        if (((g0) this.f3651c) == null) {
            this.f3651c = new g0(7);
        }
    }

    public void D(sc.a aVar) {
        this.f3650b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f3650b + ")");
        ((List) this.f3651c).add(aVar);
        thread.start();
    }

    @Override
    public void E(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f3651c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().q2(this.f3650b, profileActivity.f33811f1, null)) {
                v();
            }
            if (cc.a(profileActivity)) {
                cc.z(profileActivity, 4, i10, profileActivity.f33950z0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.R6;
        profileActivity.getNotificationsController().H(this.f3650b, i10, profileActivity.f33811f1);
        if (cc.a(profileActivity)) {
            cc.z(profileActivity, 5, i10, profileActivity.f33950z0).j();
        }
        profileActivity.u5();
        profileActivity.E5(true);
    }

    public boolean F(int i10) {
        if (i10 >= 64) {
            C();
            return ((g0) this.f3651c).F(i10 - 64);
        } else if ((this.f3650b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void G(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            C();
            ((g0) this.f3651c).G(i10 - 64, z10);
            return;
        }
        long j10 = this.f3650b;
        if ((Long.MIN_VALUE & j10) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j11 = (1 << i10) - 1;
        this.f3650b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            J(i10);
        } else {
            w(i10);
        }
        if (!z11 && ((g0) this.f3651c) == null) {
            return;
        }
        C();
        ((g0) this.f3651c).G(0, z11);
    }

    @Override
    public void G1(b0 b0Var) {
        ((q) this.f3651c).G1(new h0(this, b0Var, b0Var));
    }

    public boolean H(int i10) {
        boolean z10;
        if (i10 >= 64) {
            C();
            return ((g0) this.f3651c).H(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f3650b;
        if ((j11 & j10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = j11 & (~j10);
        this.f3650b = j12;
        long j13 = j10 - 1;
        this.f3650b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        g0 g0Var = (g0) this.f3651c;
        if (g0Var != null) {
            if (g0Var.F(0)) {
                J(63);
            }
            ((g0) this.f3651c).H(0);
        }
        return z10;
    }

    public void I() {
        this.f3650b = 0L;
        g0 g0Var = (g0) this.f3651c;
        if (g0Var != null) {
            g0Var.I();
        }
    }

    @Override
    public k0 I1(int i10, int i11) {
        return ((q) this.f3651c).I1(i10, i11);
    }

    public void J(int i10) {
        if (i10 >= 64) {
            C();
            ((g0) this.f3651c).J(i10 - 64);
            return;
        }
        this.f3650b |= 1 << i10;
    }

    @Override
    public void Q0() {
        ((q) this.f3651c).Q0();
    }

    @Override
    public long a(long j10) {
        return ((j) this.f3651c).e[(int) j10] - this.f3650b;
    }

    @Override
    public void b(int i10, int i11, byte[] bArr) {
        ((p) this.f3651c).b(i10, i11, bArr);
    }

    @Override
    public long c(long j10, long j11) {
        return ((j) this.f3651c).d[(int) j10];
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((p) this.f3651c).d(bArr, 0, i11, z10);
    }

    @Override
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override
    public long f(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public m2.j g(long j10) {
        j jVar = (j) this.f3651c;
        int i10 = (int) j10;
        return new m2.j(jVar.f3659c[i10], null, jVar.f3658b[i10]);
    }

    @Override
    public long getLength() {
        return ((p) this.f3651c).getLength() - this.f3650b;
    }

    @Override
    public long getPosition() {
        return ((p) this.f3651c).getPosition() - this.f3650b;
    }

    @Override
    public int h(int i10, int i11, byte[] bArr) {
        return ((p) this.f3651c).h(i10, i11, bArr);
    }

    @Override
    public boolean i(int i10, boolean z10) {
        return ((p) this.f3651c).i(i10, true);
    }

    @Override
    public boolean j(byte[] bArr, int i10, int i11, boolean z10) {
        return ((p) this.f3651c).j(bArr, i10, i11, z10);
    }

    @Override
    public long k() {
        return ((p) this.f3651c).k() - this.f3650b;
    }

    @Override
    public void l(int i10) {
        ((p) this.f3651c).l(i10);
    }

    @Override
    public void m() {
        ((p) this.f3651c).m();
    }

    @Override
    public void n() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f3650b);
        ?? k2Var = new k2(bundle);
        k2Var.d = new ArrayList();
        k2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f3651c;
        k2Var.e = profileActivity.f33829h5;
        profileActivity.presentFragment((k2) k2Var);
    }

    @Override
    public long o(long j10, long j11) {
        return e2.l0.f(((j) this.f3651c).e, j10 + this.f3650b, true);
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f3649a) {
            case 2:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j10 = this.f3650b;
                for (g6.o oVar : ((e6.h) ((android.support.v4.media.session.a0) this.f3651c).d).f6287c.d) {
                    oVar.b(j10, i10, null);
                }
                return;
            case 9:
                ((y8) this.f3651c).f50659b.set(this.f3650b);
                return;
            case 10:
                ((AtomicLong) ((u9.b) this.f3651c).f50195c).set(this.f3650b);
                return;
            default:
                ((y8) this.f3651c).f50659b.set(this.f3650b);
                return;
        }
    }

    @Override
    public void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((li.z) this.f3651c).q(true, byteBuffer, bufferInfo, -this.f3650b);
    }

    @Override
    public void q(int i10) {
        ((p) this.f3651c).q(i10);
    }

    @Override
    public boolean r(int i10, boolean z10) {
        return ((p) this.f3651c).r(i10, true);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((p) this.f3651c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((p) this.f3651c).readFully(bArr, i10, i11);
    }

    @Override
    public void s(MediaFormat mediaFormat) {
        ((li.z) this.f3651c).n(mediaFormat, true);
    }

    @Override
    public int skip(int i10) {
        return ((p) this.f3651c).skip(i10);
    }

    @Override
    public boolean t() {
        return true;
    }

    public String toString() {
        switch (this.f3649a) {
            case 7:
                if (((g0) this.f3651c) == null) {
                    return Long.toBinaryString(this.f3650b);
                }
                return ((g0) this.f3651c).toString() + "xx" + Long.toBinaryString(this.f3650b);
            default:
                return super.toString();
        }
    }

    @Override
    public long u() {
        return 0L;
    }

    @Override
    public void v() {
        ProfileActivity profileActivity = (ProfileActivity) this.f3651c;
        boolean z10 = !profileActivity.getMessagesController().q2(this.f3650b, profileActivity.f33811f1, null);
        profileActivity.getNotificationsController().G(this.f3650b, profileActivity.f33811f1, z10);
        if (profileActivity.fragmentView != null) {
            cc.A(profileActivity, z10, null).j();
        }
        profileActivity.u5();
        profileActivity.E5(true);
    }

    public void w(int i10) {
        if (i10 >= 64) {
            g0 g0Var = (g0) this.f3651c;
            if (g0Var != null) {
                g0Var.w(i10 - 64);
                return;
            }
            return;
        }
        this.f3650b &= ~(1 << i10);
    }

    @Override
    public void x() {
        ProfileActivity profileActivity = (ProfileActivity) this.f3651c;
        long j10 = this.f3650b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f33811f1);
            profileActivity.presentFragment(new uy0(bundle, profileActivity.f33950z0));
        }
    }

    @Override
    public void y() {
        ProfileActivity profileActivity = (ProfileActivity) this.f3651c;
        SharedPreferences sharedPreferences = vp.r1(ProfileActivity.j1(profileActivity)).e7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.f3650b;
        sb2.append(ot.v(j10, profileActivity.f33811f1, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + ot.v(j10, profileActivity.f33811f1, false), z11).apply();
        if (cc.a(profileActivity)) {
            cc.S(z10 ? 1 : 0, profileActivity, profileActivity.f33950z0).j();
        }
    }

    @Override
    public long z(long j10) {
        return ((j) this.f3651c).f3657a;
    }

    public g0(Object obj, long j10, int i10) {
        this.f3649a = i10;
        this.f3651c = obj;
        this.f3650b = j10;
    }

    public g0(p pVar, long j10) {
        this.f3649a = 0;
        this.f3651c = pVar;
        t6.f(pVar.getPosition() >= j10);
        this.f3650b = j10;
    }

    public g0(int i10) {
        this.f3649a = i10;
        switch (i10) {
            case 8:
                this.f3651c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f3650b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
