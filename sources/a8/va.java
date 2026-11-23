package a8;

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
import org.telegram.messenger.mp;
import org.telegram.messenger.xs;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.no;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hx0;
public final class va implements OnFailureListener, f3.p, f3.q, o2.i, no, zi.x0 {
    public final int f692a;
    public long f693b;
    public Object f694c;

    public va(long j3, Object obj, int i7) {
        this.f692a = i7;
        this.f693b = j3;
        this.f694c = obj;
    }

    public void A(int i7) {
        if (i7 >= 64) {
            va vaVar = (va) this.f694c;
            if (vaVar != null) {
                vaVar.A(i7 - 64);
                return;
            }
            return;
        }
        this.f693b &= ~(1 << i7);
    }

    public int B(int i7) {
        va vaVar = (va) this.f694c;
        if (vaVar == null) {
            if (i7 >= 64) {
                return Long.bitCount(this.f693b);
            }
            return Long.bitCount(this.f693b & ((1 << i7) - 1));
        } else if (i7 < 64) {
            return Long.bitCount(this.f693b & ((1 << i7) - 1));
        } else {
            return Long.bitCount(this.f693b) + vaVar.B(i7 - 64);
        }
    }

    public void C() {
        if (((va) this.f694c) == null) {
            this.f694c = new va(8);
        }
    }

    public void D(yc.a aVar) {
        this.f693b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f693b + ")");
        ((List) this.f694c).add(aVar);
        thread.start();
    }

    public boolean E(int i7) {
        if (i7 >= 64) {
            C();
            return ((va) this.f694c).E(i7 - 64);
        } else if ((this.f693b & (1 << i7)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void F(int i7, boolean z10) {
        boolean z11;
        if (i7 >= 64) {
            C();
            ((va) this.f694c).F(i7 - 64, z10);
            return;
        }
        long j3 = this.f693b;
        if ((Long.MIN_VALUE & j3) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i7) - 1;
        this.f693b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            I(i7);
        } else {
            A(i7);
        }
        if (!z11 && ((va) this.f694c) == null) {
            return;
        }
        C();
        ((va) this.f694c).F(0, z11);
    }

    public boolean G(int i7) {
        boolean z10;
        if (i7 >= 64) {
            C();
            return ((va) this.f694c).G(i7 - 64);
        }
        long j3 = 1 << i7;
        long j10 = this.f693b;
        if ((j10 & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j3);
        this.f693b = j11;
        long j12 = j3 - 1;
        this.f693b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        va vaVar = (va) this.f694c;
        if (vaVar != null) {
            if (vaVar.E(0)) {
                I(63);
            }
            ((va) this.f694c).G(0);
        }
        return z10;
    }

    public void H() {
        this.f693b = 0L;
        va vaVar = (va) this.f694c;
        if (vaVar != null) {
            vaVar.H();
        }
    }

    public void I(int i7) {
        if (i7 >= 64) {
            C();
            ((va) this.f694c).I(i7 - 64);
            return;
        }
        this.f693b |= 1 << i7;
    }

    @Override
    public void J() {
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        SharedPreferences sharedPreferences = mp.u1(ProfileActivity.k1(profileActivity)).f25753g7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f693b;
        sb2.append(xs.v(j3, profileActivity.f43681g1, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + xs.v(j3, profileActivity.f43681g1, false), z11).apply();
        if (kc.a(profileActivity)) {
            kc.S(z10 ? 1 : 0, profileActivity, profileActivity.A0).j();
        }
    }

    @Override
    public void Q(int i7) {
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        if (i7 == 0) {
            if (profileActivity.getMessagesController().u2(this.f693b, profileActivity.f43681g1, null)) {
                v();
            }
            if (kc.a(profileActivity)) {
                kc.z(profileActivity, 4, i7, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.Z6;
        profileActivity.getNotificationsController().H(this.f693b, i7, profileActivity.f43681g1);
        if (kc.a(profileActivity)) {
            kc.z(profileActivity, 5, i7, profileActivity.A0).j();
        }
        profileActivity.y5();
        profileActivity.J5(true);
    }

    @Override
    public void Z0() {
        ((f3.q) this.f694c).Z0();
    }

    @Override
    public long a(long j3) {
        return ((f3.j) this.f694c).f11166e[(int) j3] - this.f693b;
    }

    @Override
    public void b(int i7, int i10, byte[] bArr) {
        ((f3.p) this.f694c).b(i7, i10, bArr);
    }

    @Override
    public long c(long j3, long j10) {
        return ((f3.j) this.f694c).d[(int) j3];
    }

    @Override
    public boolean d(byte[] bArr, int i7, int i10, boolean z10) {
        return ((f3.p) this.f694c).d(bArr, 0, i10, z10);
    }

    @Override
    public f3.j0 d2(int i7, int i10) {
        return ((f3.q) this.f694c).d2(i7, i10);
    }

    @Override
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override
    public long f(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public p2.j g(long j3) {
        f3.j jVar = (f3.j) this.f694c;
        int i7 = (int) j3;
        return new p2.j(jVar.f11165c[i7], null, jVar.f11164b[i7]);
    }

    @Override
    public long getLength() {
        return ((f3.p) this.f694c).getLength() - this.f693b;
    }

    @Override
    public long getPosition() {
        return ((f3.p) this.f694c).getPosition() - this.f693b;
    }

    @Override
    public void h(f3.c0 c0Var) {
        ((f3.q) this.f694c).h(new f3.h0(this, c0Var, c0Var));
    }

    @Override
    public int i(int i7, int i10, byte[] bArr) {
        return ((f3.p) this.f694c).i(i7, i10, bArr);
    }

    @Override
    public boolean j(int i7, boolean z10) {
        return ((f3.p) this.f694c).j(i7, true);
    }

    @Override
    public boolean k(byte[] bArr, int i7, int i10, boolean z10) {
        return ((f3.p) this.f694c).k(bArr, i7, i10, z10);
    }

    @Override
    public long l() {
        return ((f3.p) this.f694c).l() - this.f693b;
    }

    @Override
    public void m(int i7) {
        ((f3.p) this.f694c).m(i7);
    }

    @Override
    public long n(long j3, long j10) {
        return h2.l0.f(((f3.j) this.f694c).f11166e, j3 + this.f693b, true);
    }

    @Override
    public void o() {
        ((f3.p) this.f694c).o();
    }

    @Override
    public void onFailure(Exception exc) {
        int i7;
        switch (this.f692a) {
            case 0:
                ((wa) this.f694c).f705b.set(this.f693b);
                return;
            case 1:
                ((wa) this.f694c).f705b.set(this.f693b);
                return;
            case 2:
            case 3:
            default:
                ((AtomicLong) ((t1.a) this.f694c).f57642c).set(this.f693b);
                return;
            case 4:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i7 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i7 = 13;
                }
                long j3 = this.f693b;
                for (j6.p pVar : ((h6.h) ((h6.m) this.f694c).d).f13916c.d) {
                    pVar.b(j3, i7, null);
                }
                return;
        }
    }

    @Override
    public void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((zi.x) this.f694c).q(true, byteBuffer, bufferInfo, -this.f693b);
    }

    @Override
    public void q(int i7) {
        ((f3.p) this.f694c).q(i7);
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public int read(byte[] bArr, int i7, int i10) {
        return ((f3.p) this.f694c).read(bArr, i7, i10);
    }

    @Override
    public void readFully(byte[] bArr, int i7, int i10) {
        ((f3.p) this.f694c).readFully(bArr, i7, i10);
    }

    @Override
    public long s() {
        return 0L;
    }

    @Override
    public int skip(int i7) {
        return ((f3.p) this.f694c).skip(i7);
    }

    @Override
    public boolean t(int i7, boolean z10) {
        return ((f3.p) this.f694c).t(i7, true);
    }

    public String toString() {
        switch (this.f692a) {
            case 8:
                if (((va) this.f694c) == null) {
                    return Long.toBinaryString(this.f693b);
                }
                return ((va) this.f694c).toString() + "xx" + Long.toBinaryString(this.f693b);
            default:
                return super.toString();
        }
    }

    @Override
    public void u() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f693b);
        ?? g2Var = new org.telegram.ui.ActionBar.g2(bundle);
        g2Var.d = new ArrayList();
        g2Var.f46755e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        g2Var.f46755e = profileActivity.f43731n5;
        profileActivity.presentFragment((org.telegram.ui.ActionBar.g2) g2Var);
    }

    @Override
    public void v() {
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        boolean z10 = !profileActivity.getMessagesController().u2(this.f693b, profileActivity.f43681g1, null);
        profileActivity.getNotificationsController().G(this.f693b, profileActivity.f43681g1, z10);
        if (profileActivity.fragmentView != null) {
            kc.A(profileActivity, z10, null).j();
        }
        profileActivity.y5();
        profileActivity.J5(true);
    }

    @Override
    public void w(MediaFormat mediaFormat) {
        ((zi.x) this.f694c).n(mediaFormat, true);
    }

    @Override
    public long x(long j3) {
        return ((f3.j) this.f694c).f11163a;
    }

    @Override
    public void y() {
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        long j3 = this.f693b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f43681g1);
            profileActivity.presentFragment(new hx0(bundle, profileActivity.A0));
        }
    }

    @Override
    public long z(long j3, long j10) {
        return ((f3.j) this.f694c).f11163a;
    }

    public va(Object obj, long j3, int i7) {
        this.f692a = i7;
        this.f694c = obj;
        this.f693b = j3;
    }

    public va(f3.p pVar, long j3) {
        this.f692a = 2;
        this.f694c = pVar;
        ma.f(pVar.getPosition() >= j3);
        this.f693b = j3;
    }

    public va(int i7) {
        this.f692a = i7;
        switch (i7) {
            case 10:
                this.f694c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f693b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
