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
public final class hg2 implements r53, xb2, zl9, k74, l74, OnFailureListener {
    public final byte a;
    public long b;
    public Object c;

    public hg2(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.b = 0L;
                return;
        }
    }

    public final boolean A(int i) {
        boolean z;
        if (i >= 64) {
            t();
            return ((hg2) this.c).A(i - 64);
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
        hg2 hg2Var = (hg2) this.c;
        if (hg2Var != null) {
            if (hg2Var.x(0)) {
                D(63);
            }
            ((hg2) this.c).A(0);
        }
        return z;
    }

    public final void B() {
        this.b = 0L;
        hg2 hg2Var = (hg2) this.c;
        if (hg2Var != null) {
            hg2Var.B();
        }
    }

    @Override
    public final long C(long j, long j2) {
        return g8c.f(((ah2) this.c).e, j + this.b, true);
    }

    public final void D(int i) {
        if (i >= 64) {
            t();
            ((hg2) this.c).D(i - 64);
            return;
        }
        this.b |= 1 << i;
    }

    @Override
    public final wxb S(int i, int i2) {
        return ((l74) this.c).S(i, i2);
    }

    @Override
    public final boolean V() {
        return true;
    }

    @Override
    public final void a() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        ?? dVar = new d(bundle);
        dVar.d = new ArrayList();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        dVar.e = profileActivity.n5;
        profileActivity.presentFragment((d) dVar);
    }

    @Override
    public final void b(int i, int i2, byte[] bArr) {
        ((ja3) this.c).d(bArr, i, i2, false);
    }

    @Override
    public final long b0() {
        return 0L;
    }

    @Override
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        return ((ja3) this.c).c(bArr, 0, i2, z);
    }

    @Override
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        return ((ja3) this.c).d(bArr, i, i2, z);
    }

    @Override
    public final long e(long j) {
        return ((ah2) this.c).e[(int) j] - this.b;
    }

    @Override
    public final long f() {
        return ((ja3) this.c).f() - this.b;
    }

    @Override
    public final long f0(long j) {
        return ((ah2) this.c).a;
    }

    @Override
    public final void g(int i) {
        ((ja3) this.c).a(i, false);
    }

    @Override
    public final void g0(fv9 fv9Var) {
        ((l74) this.c).g0(new cwa(this, fv9Var, fv9Var));
    }

    @Override
    public final long getLength() {
        return ((ja3) this.c).c - this.b;
    }

    @Override
    public final long getPosition() {
        return ((ja3) this.c).d - this.b;
    }

    @Override
    public final void h() {
        ((ja3) this.c).f = 0;
    }

    @Override
    public final long h0(long j, long j2) {
        return ((ah2) this.c).a;
    }

    @Override
    public final void i() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z = !profileActivity.getMessagesController().n2(this.b, profileActivity.g1, null);
        profileActivity.getNotificationsController().G(this.b, profileActivity.g1, z);
        if (profileActivity.fragmentView != null) {
            u21.A(profileActivity, z, null).j();
        }
        profileActivity.O3();
        profileActivity.a4(true);
    }

    @Override
    public final void j(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((nk9) this.c).q(true, byteBuffer, bufferInfo, -this.b);
    }

    @Override
    public final long k(long j, long j2) {
        return ((ah2) this.c).d[(int) j];
    }

    @Override
    public final void l() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j = this.b;
        if (j != 0) {
            Bundle k = ls6.k(j, "dialog_id");
            k.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new pr8(k, profileActivity.A0));
        }
    }

    @Override
    public final void m(int i) {
        ((ja3) this.c).l(i, false);
    }

    @Override
    public final void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        SharedPreferences sharedPreferences = na7.q1(ProfileActivity.E0(profileActivity)).W3;
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j = this.b;
        sb.append(im7.p(j, profileActivity.g1, false));
        boolean z = sharedPreferences.getBoolean(sb.toString(), true);
        boolean z2 = !z ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + im7.p(j, profileActivity.g1, false), z2).apply();
        if (u21.a(profileActivity)) {
            u21.S(z ? 1 : 0, profileActivity.A0, profileActivity).j();
        }
    }

    @Override
    public final void o(MediaFormat mediaFormat) {
        ((nk9) this.c).n(mediaFormat, true);
    }

    @Override
    public final void onFailure(Exception exc) {
        int i;
        switch (this.a) {
            case 8:
                if (exc instanceof zn) {
                    i = ((zn) exc).getStatusCode();
                } else {
                    i = 13;
                }
                long j = this.b;
                for (u9d u9dVar : ((i69) ((vk9) this.c).d).c.d) {
                    u9dVar.b(j, i, null);
                }
                return;
            case 9:
                ((zxe) this.c).b.set(this.b);
                return;
            case 10:
                ((zxe) this.c).b.set(this.b);
                return;
            default:
                ((AtomicLong) ((aec) this.c).c).set(this.b);
                return;
        }
    }

    @Override
    public final void p(int i) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i == 0) {
            if (profileActivity.getMessagesController().n2(this.b, profileActivity.g1, null)) {
                i();
            }
            if (u21.a(profileActivity)) {
                u21.z(profileActivity, 4, i, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.Z6;
        profileActivity.getNotificationsController().H(this.b, i, profileActivity.g1);
        if (u21.a(profileActivity)) {
            u21.z(profileActivity, 5, i, profileActivity.A0).j();
        }
        profileActivity.O3();
        profileActivity.a4(true);
    }

    public final void q(int i) {
        if (i >= 64) {
            hg2 hg2Var = (hg2) this.c;
            if (hg2Var != null) {
                hg2Var.q(i - 64);
                return;
            }
            return;
        }
        this.b &= ~(1 << i);
    }

    @Override
    public final long r(long j, long j2) {
        return 0L;
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        return ((ja3) this.c).read(bArr, i, i2);
    }

    @Override
    public final void readFully(byte[] bArr, int i, int i2) {
        ((ja3) this.c).c(bArr, i, i2, false);
    }

    public final int s(int i) {
        hg2 hg2Var = (hg2) this.c;
        if (hg2Var == null) {
            long j = this.b;
            if (i >= 64) {
                return Long.bitCount(j);
            }
            return Long.bitCount(j & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.b & ((1 << i) - 1));
        } else {
            return Long.bitCount(this.b) + hg2Var.s(i - 64);
        }
    }

    public final void t() {
        if (((hg2) this.c) == null) {
            this.c = new hg2((byte) 0);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                if (((hg2) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((hg2) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public final void u(xh7 xh7Var) {
        this.b++;
        Thread thread = new Thread(xh7Var);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(xh7Var);
        thread.start();
    }

    @Override
    public final long v(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override
    public final az8 w(long j) {
        ah2 ah2Var = (ah2) this.c;
        int i = (int) j;
        return new az8(ah2Var.c[i], null, ah2Var.b[i]);
    }

    public final boolean x(int i) {
        if (i >= 64) {
            t();
            return ((hg2) this.c).x(i - 64);
        } else if ((this.b & (1 << i)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void y(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            t();
            ((hg2) this.c).y(i - 64, z);
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
            D(i);
        } else {
            q(i);
        }
        if (!z2 && ((hg2) this.c) == null) {
            return;
        }
        t();
        ((hg2) this.c).y(0, z2);
    }

    @Override
    public final void z() {
        ((l74) this.c).z();
    }

    @Override
    public final void dismiss() {
    }

    public hg2(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    public hg2(ja3 ja3Var, long j) {
        this.a = (byte) 6;
        this.c = ja3Var;
        gre.f(ja3Var.d >= j);
        this.b = j;
    }

    public hg2(long j, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = obj;
    }
}
