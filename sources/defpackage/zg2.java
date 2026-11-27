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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class zg2 implements j63, nc2, op9, f84, g84, OnFailureListener {
    public final byte a;
    public long b;
    public Object c;

    public zg2(byte b) {
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
        zg2 zg2Var = (zg2) this.c;
        if (zg2Var != null) {
            zg2Var.A();
        }
    }

    public final void B(int i) {
        if (i >= 64) {
            t();
            ((zg2) this.c).B(i - 64);
            return;
        }
        this.b |= 1 << i;
    }

    @Override
    public final void D() {
        ((g84) this.c).D();
    }

    @Override
    public final long I(long j, long j2) {
        return gcc.f(((sh2) this.c).e, j + this.b, true);
    }

    @Override
    public final boolean R() {
        return true;
    }

    @Override
    public final long V() {
        return 0L;
    }

    @Override
    public final long Y(long j) {
        return ((sh2) this.c).a;
    }

    public final void a(int i) {
        if (i >= 64) {
            zg2 zg2Var = (zg2) this.c;
            if (zg2Var != null) {
                zg2Var.a(i - 64);
                return;
            }
            return;
        }
        this.b &= ~(1 << i);
    }

    @Override
    public final long a0(long j, long j2) {
        return ((sh2) this.c).a;
    }

    @Override
    public final void b(int i, int i2, byte[] bArr) {
        ((cb3) this.c).d(bArr, i, i2, false);
    }

    @Override
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        return ((cb3) this.c).c(bArr, 0, i2, z);
    }

    @Override
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        return ((cb3) this.c).d(bArr, i, i2, z);
    }

    @Override
    public final long e() {
        return ((cb3) this.c).e() - this.b;
    }

    @Override
    public final x1c e0(int i, int i2) {
        return ((g84) this.c).e0(i, i2);
    }

    @Override
    public final long f(long j) {
        return ((sh2) this.c).e[(int) j] - this.b;
    }

    @Override
    public final void g(int i) {
        ((cb3) this.c).a(i, false);
    }

    @Override
    public final long getLength() {
        return ((cb3) this.c).c - this.b;
    }

    @Override
    public final long getPosition() {
        return ((cb3) this.c).d - this.b;
    }

    @Override
    public final void h() {
        ((cb3) this.c).f = 0;
    }

    @Override
    public final void i() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        ?? eVar = new e(bundle);
        eVar.d = new ArrayList();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        eVar.e = profileActivity.n5;
        profileActivity.presentFragment((e) eVar);
    }

    @Override
    public final long j(long j, long j2) {
        return ((sh2) this.c).d[(int) j];
    }

    @Override
    public final void k(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((bo9) this.c).q(true, byteBuffer, bufferInfo, -this.b);
    }

    @Override
    public final void l() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z = !profileActivity.getMessagesController().p2(this.b, profileActivity.g1, null);
        profileActivity.getNotificationsController().G(this.b, profileActivity.g1, z);
        if (profileActivity.fragmentView != null) {
            d31.A(profileActivity, z, null).j();
        }
        profileActivity.P3();
        profileActivity.b4(true);
    }

    @Override
    public final void m() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j = this.b;
        if (j != 0) {
            Bundle k = qu6.k(j, "dialog_id");
            k.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new zu8(k, profileActivity.A0));
        }
    }

    @Override
    public final void m0(zy9 zy9Var) {
        ((g84) this.c).m0(new f0b(this, zy9Var, zy9Var));
    }

    @Override
    public final void n(int i) {
        ((cb3) this.c).l(i, false);
    }

    @Override
    public final void o(MediaFormat mediaFormat) {
        ((bo9) this.c).n(mediaFormat, true);
    }

    @Override
    public final void onFailure(Exception exc) {
        int i;
        switch (this.a) {
            case 9:
                if (exc instanceof ao) {
                    i = ((ao) exc).getStatusCode();
                } else {
                    i = 13;
                }
                long j = this.b;
                for (ned nedVar : ((v99) ((ko9) this.c).d).c.d) {
                    nedVar.b(j, i, null);
                }
                return;
            case 10:
                ((q2f) this.c).b.set(this.b);
                return;
            case 11:
                ((q2f) this.c).b.set(this.b);
                return;
            default:
                ((AtomicLong) ((zhc) this.c).c).set(this.b);
                return;
        }
    }

    @Override
    public final void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        SharedPreferences sharedPreferences = uc7.s1(ProfileActivity.V0(profileActivity)).X3;
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j = this.b;
        sb.append(ip7.p(j, profileActivity.g1, false));
        boolean z = sharedPreferences.getBoolean(sb.toString(), true);
        boolean z2 = !z ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + ip7.p(j, profileActivity.g1, false), z2).apply();
        if (d31.a(profileActivity)) {
            d31.S(z ? 1 : 0, profileActivity.A0, profileActivity).j();
        }
    }

    @Override
    public final void q(int i) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i == 0) {
            if (profileActivity.getMessagesController().p2(this.b, profileActivity.g1, null)) {
                l();
            }
            if (d31.a(profileActivity)) {
                d31.z(profileActivity, 4, i, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.Z6;
        profileActivity.getNotificationsController().H(this.b, i, profileActivity.g1);
        if (d31.a(profileActivity)) {
            d31.z(profileActivity, 5, i, profileActivity.A0).j();
        }
        profileActivity.P3();
        profileActivity.b4(true);
    }

    @Override
    public final long r(long j, long j2) {
        return 0L;
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        return ((cb3) this.c).read(bArr, i, i2);
    }

    @Override
    public final void readFully(byte[] bArr, int i, int i2) {
        ((cb3) this.c).c(bArr, i, i2, false);
    }

    public final int s(int i) {
        zg2 zg2Var = (zg2) this.c;
        if (zg2Var == null) {
            long j = this.b;
            if (i >= 64) {
                return Long.bitCount(j);
            }
            return Long.bitCount(j & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.b & ((1 << i) - 1));
        } else {
            return Long.bitCount(this.b) + zg2Var.s(i - 64);
        }
    }

    public final void t() {
        if (((zg2) this.c) == null) {
            this.c = new zg2((byte) 0);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                if (((zg2) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((zg2) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public final void u(hk7 hk7Var) {
        this.b++;
        Thread thread = new Thread(hk7Var);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(hk7Var);
        thread.start();
    }

    @Override
    public final long v(long j, long j2) {
        return -9223372036854775807L;
    }

    public final boolean w(int i) {
        if (i >= 64) {
            t();
            return ((zg2) this.c).w(i - 64);
        } else if ((this.b & (1 << i)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void x(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            t();
            ((zg2) this.c).x(i - 64, z);
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
            B(i);
        } else {
            a(i);
        }
        if (!z2 && ((zg2) this.c) == null) {
            return;
        }
        t();
        ((zg2) this.c).x(0, z2);
    }

    public final boolean y(int i) {
        boolean z;
        if (i >= 64) {
            t();
            return ((zg2) this.c).y(i - 64);
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
        zg2 zg2Var = (zg2) this.c;
        if (zg2Var != null) {
            if (zg2Var.w(0)) {
                B(63);
            }
            ((zg2) this.c).y(0);
        }
        return z;
    }

    @Override
    public final n29 z(long j) {
        sh2 sh2Var = (sh2) this.c;
        int i = (int) j;
        return new n29(sh2Var.c[i], sh2Var.b[i], null);
    }

    @Override
    public final void dismiss() {
    }

    public zg2(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    public zg2(cb3 cb3Var, long j) {
        this.a = (byte) 7;
        this.c = cb3Var;
        yve.f(cb3Var.d >= j);
        this.b = j;
    }

    public zg2(long j, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = obj;
    }
}
