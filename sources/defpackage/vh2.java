package defpackage;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class vh2 implements d73, id2, zn9, t84, u84, OnFailureListener {
    public final byte a;
    public long b;
    public Object c;

    public vh2(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                return;
            case 3:
            default:
                this.b = 0L;
                return;
            case 4:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                return;
        }
    }

    public final void A() {
        this.b = 0L;
        vh2 vh2Var = (vh2) this.c;
        if (vh2Var != null) {
            vh2Var.A();
        }
    }

    @Override
    public final void B() {
        ((u84) this.c).B();
    }

    public final void C(int i) {
        if (i >= 64) {
            q();
            ((vh2) this.c).C(i - 64);
            return;
        }
        this.b |= 1 << i;
    }

    @Override
    public final long J(long j, long j2) {
        return hac.f(((oi2) this.c).e, j + this.b, true);
    }

    @Override
    public final boolean T() {
        return true;
    }

    @Override
    public final long V() {
        return 0L;
    }

    @Override
    public final long X(long j) {
        return ((oi2) this.c).a;
    }

    public final void a(int i) {
        if (i >= 64) {
            vh2 vh2Var = (vh2) this.c;
            if (vh2Var != null) {
                vh2Var.a(i - 64);
                return;
            }
            return;
        }
        this.b &= ~(1 << i);
    }

    @Override
    public final void b(int i, int i2, byte[] bArr) {
        ((vb3) this.c).d(bArr, i, i2, false);
    }

    @Override
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        return ((vb3) this.c).c(bArr, 0, i2, z);
    }

    @Override
    public final yzb c0(int i, int i2) {
        return ((u84) this.c).c0(i, i2);
    }

    @Override
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        return ((vb3) this.c).d(bArr, i, i2, z);
    }

    @Override
    public final long e(long j) {
        return ((oi2) this.c).e[(int) j] - this.b;
    }

    @Override
    public final long e0(long j, long j2) {
        return ((oi2) this.c).a;
    }

    @Override
    public final long f() {
        return ((vb3) this.c).f() - this.b;
    }

    @Override
    public final void f0(ix9 ix9Var) {
        ((u84) this.c).f0(new fya(this, ix9Var, ix9Var));
    }

    @Override
    public final void g(int i) {
        ((vb3) this.c).a(i, false);
    }

    @Override
    public final long getLength() {
        return ((vb3) this.c).c - this.b;
    }

    @Override
    public final long getPosition() {
        return ((vb3) this.c).d - this.b;
    }

    @Override
    public final void h() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        ?? dVar = new d(bundle);
        dVar.d = new ArrayList();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        dVar.e = profileActivity.s5;
        profileActivity.presentFragment((d) dVar);
    }

    @Override
    public final void i() {
        ((vb3) this.c).f = 0;
    }

    @Override
    public final long j(long j, long j2) {
        return ((oi2) this.c).d[(int) j];
    }

    @Override
    public final void k(int i) {
        ((vb3) this.c).m(i, false);
    }

    @Override
    public final void l(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((om9) this.c).q(true, byteBuffer, bufferInfo, -this.b);
    }

    @Override
    public final long m(long j, long j2) {
        return 0L;
    }

    public final int n(int i) {
        vh2 vh2Var = (vh2) this.c;
        if (vh2Var == null) {
            long j = this.b;
            if (i >= 64) {
                return Long.bitCount(j);
            }
            return Long.bitCount(j & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.b & ((1 << i) - 1));
        } else {
            return Long.bitCount(this.b) + vh2Var.n(i - 64);
        }
    }

    @Override
    public final void o(MediaFormat mediaFormat) {
        ((om9) this.c).n(mediaFormat, true);
    }

    @Override
    public final void onFailure(Exception exc) {
        int i;
        switch (this.a) {
            case 9:
                if (exc instanceof ap) {
                    i = ((ap) exc).getStatusCode();
                } else {
                    i = 13;
                }
                long j = this.b;
                for (wbd wbdVar : ((k89) ((wm9) this.c).d).c.d) {
                    wbdVar.b(j, i, null);
                }
                return;
            case 10:
                ((b0f) this.c).b.set(this.b);
                return;
            case 11:
                ((b0f) this.c).b.set(this.b);
                return;
            default:
                ((AtomicLong) ((rhb) this.c).c).set(this.b);
                return;
        }
    }

    @Override
    public final void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z = !profileActivity.getMessagesController().o2(this.b, profileActivity.g1, null);
        profileActivity.getNotificationsController().G(this.b, profileActivity.g1, z);
        if (profileActivity.fragmentView != null) {
            c41.A(profileActivity, z, null).j();
        }
        profileActivity.S3();
        profileActivity.e4(true);
    }

    public final void q() {
        if (((vh2) this.c) == null) {
            this.c = new vh2((byte) 0);
        }
    }

    @Override
    public final void r() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j = this.b;
        if (j != 0) {
            Bundle k = kt6.k(j, "dialog_id");
            k.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new st8(k, profileActivity.A0));
        }
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        return ((vb3) this.c).read(bArr, i, i2);
    }

    @Override
    public final void readFully(byte[] bArr, int i, int i2) {
        ((vb3) this.c).c(bArr, i, i2, false);
    }

    @Override
    public final void s() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        SharedPreferences sharedPreferences = oc7.r1(ProfileActivity.G0(profileActivity)).W3;
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j = this.b;
        sb.append(lo7.p(j, profileActivity.g1, false));
        boolean z = sharedPreferences.getBoolean(sb.toString(), true);
        boolean z2 = !z ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + lo7.p(j, profileActivity.g1, false), z2).apply();
        if (c41.a(profileActivity)) {
            c41.S(z ? 1 : 0, profileActivity.A0, profileActivity).j();
        }
    }

    @Override
    public final void t(int i) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i == 0) {
            if (profileActivity.getMessagesController().o2(this.b, profileActivity.g1, null)) {
                p();
            }
            if (c41.a(profileActivity)) {
                c41.z(profileActivity, 4, i, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.e7;
        profileActivity.getNotificationsController().H(this.b, i, profileActivity.g1);
        if (c41.a(profileActivity)) {
            c41.z(profileActivity, 5, i, profileActivity.A0).j();
        }
        profileActivity.S3();
        profileActivity.e4(true);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                if (((vh2) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((vh2) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override
    public final long u(long j, long j2) {
        return -9223372036854775807L;
    }

    public final void v(ak7 ak7Var) {
        this.b++;
        Thread thread = new Thread(ak7Var);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(ak7Var);
        thread.start();
    }

    @Override
    public final b19 w(long j) {
        oi2 oi2Var = (oi2) this.c;
        int i = (int) j;
        return new b19(oi2Var.c[i], null, oi2Var.b[i]);
    }

    public final boolean x(int i) {
        if (i >= 64) {
            q();
            return ((vh2) this.c).x(i - 64);
        } else if ((this.b & (1 << i)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void y(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            q();
            ((vh2) this.c).y(i - 64, z);
            return;
        }
        long j = this.b;
        if ((Long.MIN_VALUE & j) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = (1 << i) - 1;
        this.b = (j & j2) | ((j & (~j2)) << 1);
        if (z) {
            C(i);
        } else {
            a(i);
        }
        if (!z2 && ((vh2) this.c) == null) {
            return;
        }
        q();
        ((vh2) this.c).y(0, z2);
    }

    public final boolean z(int i) {
        boolean z;
        if (i >= 64) {
            q();
            return ((vh2) this.c).z(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight(j3 & (~j4), 1);
        vh2 vh2Var = (vh2) this.c;
        if (vh2Var != null) {
            if (vh2Var.x(0)) {
                C(63);
            }
            ((vh2) this.c).z(0);
        }
        return z;
    }

    @Override
    public final void dismiss() {
    }

    public vh2(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    public vh2(vb3 vb3Var, long j) {
        this.a = (byte) 7;
        this.c = vb3Var;
        jte.f(vb3Var.d >= j);
        this.b = j;
    }

    public vh2(long j, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = obj;
    }
}
