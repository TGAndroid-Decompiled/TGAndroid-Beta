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
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qo;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.jx0;
public final class va implements OnFailureListener, f3.p, f3.q, o2.i, qo, zi.x0 {
    public final int f692a;
    public long f693b;
    public Object f694c;

    public va(long j3, Object obj, int i7) {
        this.f692a = i7;
        this.f693b = j3;
        this.f694c = obj;
    }

    @Override
    public void A(MediaFormat mediaFormat) {
        ((zi.x) this.f694c).n(mediaFormat, true);
    }

    @Override
    public void B(int i7) {
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        if (i7 == 0) {
            if (profileActivity.getMessagesController().u2(this.f693b, profileActivity.f43596g1, null)) {
                s();
            }
            if (lc.a(profileActivity)) {
                lc.z(profileActivity, 4, i7, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.Z6;
        profileActivity.getNotificationsController().H(this.f693b, i7, profileActivity.f43596g1);
        if (lc.a(profileActivity)) {
            lc.z(profileActivity, 5, i7, profileActivity.A0).j();
        }
        profileActivity.y5();
        profileActivity.J5(true);
    }

    public void C(int i7) {
        if (i7 >= 64) {
            va vaVar = (va) this.f694c;
            if (vaVar != null) {
                vaVar.C(i7 - 64);
                return;
            }
            return;
        }
        this.f693b &= ~(1 << i7);
    }

    public int D(int i7) {
        va vaVar = (va) this.f694c;
        if (vaVar == null) {
            if (i7 >= 64) {
                return Long.bitCount(this.f693b);
            }
            return Long.bitCount(this.f693b & ((1 << i7) - 1));
        } else if (i7 < 64) {
            return Long.bitCount(this.f693b & ((1 << i7) - 1));
        } else {
            return Long.bitCount(this.f693b) + vaVar.D(i7 - 64);
        }
    }

    public void E() {
        if (((va) this.f694c) == null) {
            this.f694c = new va(8);
        }
    }

    public void F(yc.a aVar) {
        this.f693b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f693b + ")");
        ((List) this.f694c).add(aVar);
        thread.start();
    }

    public boolean G(int i7) {
        if (i7 >= 64) {
            E();
            return ((va) this.f694c).G(i7 - 64);
        } else if ((this.f693b & (1 << i7)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void H(int i7, boolean z10) {
        boolean z11;
        if (i7 >= 64) {
            E();
            ((va) this.f694c).H(i7 - 64, z10);
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
            K(i7);
        } else {
            C(i7);
        }
        if (!z11 && ((va) this.f694c) == null) {
            return;
        }
        E();
        ((va) this.f694c).H(0, z11);
    }

    public boolean I(int i7) {
        boolean z10;
        if (i7 >= 64) {
            E();
            return ((va) this.f694c).I(i7 - 64);
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
            if (vaVar.G(0)) {
                K(63);
            }
            ((va) this.f694c).I(0);
        }
        return z10;
    }

    public void J() {
        this.f693b = 0L;
        va vaVar = (va) this.f694c;
        if (vaVar != null) {
            vaVar.J();
        }
    }

    public void K(int i7) {
        if (i7 >= 64) {
            E();
            ((va) this.f694c).K(i7 - 64);
            return;
        }
        this.f693b |= 1 << i7;
    }

    @Override
    public long a(long j3) {
        return ((f3.j) this.f694c).f11196e[(int) j3] - this.f693b;
    }

    @Override
    public void b(int i7, int i10, byte[] bArr) {
        ((f3.p) this.f694c).b(i7, i10, bArr);
    }

    @Override
    public boolean c(byte[] bArr, int i7, int i10, boolean z10) {
        return ((f3.p) this.f694c).c(bArr, 0, i10, z10);
    }

    @Override
    public int d(int i7, int i10, byte[] bArr) {
        return ((f3.p) this.f694c).d(i7, i10, bArr);
    }

    @Override
    public void d1() {
        ((f3.q) this.f694c).d1();
    }

    @Override
    public f3.i0 d2(int i7, int i10) {
        return ((f3.q) this.f694c).d2(i7, i10);
    }

    @Override
    public long e(long j3, long j10) {
        return ((f3.j) this.f694c).d[(int) j3];
    }

    @Override
    public boolean f(int i7, boolean z10) {
        return ((f3.p) this.f694c).f(i7, true);
    }

    @Override
    public boolean g(byte[] bArr, int i7, int i10, boolean z10) {
        return ((f3.p) this.f694c).g(bArr, i7, i10, z10);
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
    public long h(long j3, long j10) {
        return 0L;
    }

    @Override
    public long i(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public void j(f3.b0 b0Var) {
        ((f3.q) this.f694c).j(new f3.g0(this, b0Var, b0Var));
    }

    @Override
    public p2.j k(long j3) {
        f3.j jVar = (f3.j) this.f694c;
        int i7 = (int) j3;
        return new p2.j(jVar.f11195c[i7], null, jVar.f11194b[i7]);
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
    public void n() {
        ((f3.p) this.f694c).n();
    }

    @Override
    public long o(long j3, long j10) {
        return h2.l0.f(((f3.j) this.f694c).f11196e, j3 + this.f693b, true);
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
                ((AtomicLong) ((tg.y) this.f694c).f58221c).set(this.f693b);
                return;
            case 4:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i7 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i7 = 13;
                }
                long j3 = this.f693b;
                for (j6.p pVar : ((h6.h) ((h6.m) this.f694c).d).f13950c.d) {
                    pVar.b(j3, i7, null);
                }
                return;
        }
    }

    @Override
    public void p() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f693b);
        ?? g2Var = new org.telegram.ui.ActionBar.g2(bundle);
        g2Var.d = new ArrayList();
        g2Var.f47217e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        g2Var.f47217e = profileActivity.f43646n5;
        profileActivity.presentFragment((org.telegram.ui.ActionBar.g2) g2Var);
    }

    @Override
    public void q(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((zi.x) this.f694c).q(true, byteBuffer, bufferInfo, -this.f693b);
    }

    @Override
    public void r(int i7) {
        ((f3.p) this.f694c).r(i7);
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
    public void s() {
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        boolean z10 = !profileActivity.getMessagesController().u2(this.f693b, profileActivity.f43596g1, null);
        profileActivity.getNotificationsController().G(this.f693b, profileActivity.f43596g1, z10);
        if (profileActivity.fragmentView != null) {
            lc.A(profileActivity, z10, null).j();
        }
        profileActivity.y5();
        profileActivity.J5(true);
    }

    @Override
    public int skip(int i7) {
        return ((f3.p) this.f694c).skip(i7);
    }

    @Override
    public boolean t() {
        return true;
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
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        long j3 = this.f693b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f43596g1);
            profileActivity.presentFragment(new jx0(bundle, profileActivity.A0));
        }
    }

    @Override
    public long v() {
        return 0L;
    }

    @Override
    public void w() {
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        SharedPreferences sharedPreferences = mp.u1(ProfileActivity.k1(profileActivity)).f25686g7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f693b;
        sb2.append(xs.v(j3, profileActivity.f43596g1, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + xs.v(j3, profileActivity.f43596g1, false), z11).apply();
        if (lc.a(profileActivity)) {
            lc.S(z10 ? 1 : 0, profileActivity, profileActivity.A0).j();
        }
    }

    @Override
    public boolean x(int i7, boolean z10) {
        return ((f3.p) this.f694c).x(i7, true);
    }

    @Override
    public long y(long j3) {
        return ((f3.j) this.f694c).f11193a;
    }

    @Override
    public long z(long j3, long j10) {
        return ((f3.j) this.f694c).f11193a;
    }

    public va(Object obj, long j3, int i7) {
        this.f692a = i7;
        this.f694c = obj;
        this.f693b = j3;
    }

    public va(f3.p pVar, long j3) {
        this.f692a = 2;
        this.f694c = pVar;
        la.f(pVar.getPosition() >= j3);
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
