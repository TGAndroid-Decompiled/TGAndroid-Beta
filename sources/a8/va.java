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
import org.telegram.messenger.at;
import org.telegram.messenger.np;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ho;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fx0;
public final class va implements OnFailureListener, f3.p, f3.q, o2.i, ho, zi.y0 {
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
            r();
            ((va) this.f694c).A(i7 - 64);
            return;
        }
        this.f693b |= 1 << i7;
    }

    @Override
    public long D(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public p2.j E(long j3) {
        f3.j jVar = (f3.j) this.f694c;
        int i7 = (int) j3;
        return new p2.j(jVar.f10847c[i7], null, jVar.f10846b[i7]);
    }

    @Override
    public void F() {
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        long j3 = this.f693b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f43109g1);
            profileActivity.presentFragment(new fx0(bundle, profileActivity.A0));
        }
    }

    @Override
    public void J() {
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        SharedPreferences sharedPreferences = np.s1(ProfileActivity.k1(profileActivity)).f25270e7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f693b;
        sb2.append(at.v(j3, profileActivity.f43109g1, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + at.v(j3, profileActivity.f43109g1, false), z11).apply();
        if (cc.a(profileActivity)) {
            cc.S(z10 ? 1 : 0, profileActivity, profileActivity.A0).j();
        }
    }

    @Override
    public long L(long j3, long j10) {
        return h2.l0.f(((f3.j) this.f694c).f10848e, j3 + this.f693b, true);
    }

    @Override
    public void R(int i7) {
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        if (i7 == 0) {
            if (profileActivity.getMessagesController().r2(this.f693b, profileActivity.f43109g1, null)) {
                u();
            }
            if (cc.a(profileActivity)) {
                cc.z(profileActivity, 4, i7, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.X6;
        profileActivity.getNotificationsController().H(this.f693b, i7, profileActivity.f43109g1);
        if (cc.a(profileActivity)) {
            cc.z(profileActivity, 5, i7, profileActivity.A0).j();
        }
        profileActivity.x5();
        profileActivity.I5(true);
    }

    @Override
    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((zi.y) this.f694c).q(true, byteBuffer, bufferInfo, -this.f693b);
    }

    @Override
    public long b(long j3) {
        return ((f3.j) this.f694c).f10848e[(int) j3] - this.f693b;
    }

    @Override
    public void c(int i7, int i10, byte[] bArr) {
        ((f3.p) this.f694c).c(i7, i10, bArr);
    }

    @Override
    public boolean d(byte[] bArr, int i7, int i10, boolean z10) {
        return ((f3.p) this.f694c).d(bArr, 0, i10, z10);
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
    public int e(int i7, int i10, byte[] bArr) {
        return ((f3.p) this.f694c).e(i7, i10, bArr);
    }

    @Override
    public void f(f3.b0 b0Var) {
        ((f3.q) this.f694c).f(new f3.g0(this, b0Var, b0Var));
    }

    @Override
    public boolean g(int i7, boolean z10) {
        return ((f3.p) this.f694c).g(i7, true);
    }

    @Override
    public boolean g0() {
        return true;
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
    public boolean h(byte[] bArr, int i7, int i10, boolean z10) {
        return ((f3.p) this.f694c).h(bArr, i7, i10, z10);
    }

    @Override
    public long i(long j3, long j10) {
        return ((f3.j) this.f694c).d[(int) j3];
    }

    @Override
    public long j() {
        return ((f3.p) this.f694c).j() - this.f693b;
    }

    @Override
    public void k(int i7) {
        ((f3.p) this.f694c).k(i7);
    }

    @Override
    public long k0() {
        return 0L;
    }

    @Override
    public void l() {
        ((f3.p) this.f694c).l();
    }

    @Override
    public void m(int i7) {
        ((f3.p) this.f694c).m(i7);
    }

    @Override
    public boolean n(int i7, boolean z10) {
        return ((f3.p) this.f694c).n(i7, true);
    }

    @Override
    public void o(MediaFormat mediaFormat) {
        ((zi.y) this.f694c).n(mediaFormat, true);
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
                ((AtomicLong) ((tg.x) this.f694c).f57597c).set(this.f693b);
                return;
            case 4:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i7 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i7 = 13;
                }
                long j3 = this.f693b;
                for (j6.p pVar : ((h6.h) ((h6.m) this.f694c).d).f13609c.d) {
                    pVar.b(j3, i7, null);
                }
                return;
        }
    }

    public void p(int i7) {
        if (i7 >= 64) {
            va vaVar = (va) this.f694c;
            if (vaVar != null) {
                vaVar.p(i7 - 64);
                return;
            }
            return;
        }
        this.f693b &= ~(1 << i7);
    }

    public int q(int i7) {
        va vaVar = (va) this.f694c;
        if (vaVar == null) {
            if (i7 >= 64) {
                return Long.bitCount(this.f693b);
            }
            return Long.bitCount(this.f693b & ((1 << i7) - 1));
        } else if (i7 < 64) {
            return Long.bitCount(this.f693b & ((1 << i7) - 1));
        } else {
            return Long.bitCount(this.f693b) + vaVar.q(i7 - 64);
        }
    }

    public void r() {
        if (((va) this.f694c) == null) {
            this.f694c = new va(8);
        }
    }

    @Override
    public int read(byte[] bArr, int i7, int i10) {
        return ((f3.p) this.f694c).read(bArr, i7, i10);
    }

    @Override
    public void readFully(byte[] bArr, int i7, int i10) {
        ((f3.p) this.f694c).readFully(bArr, i7, i10);
    }

    public void s(yc.a aVar) {
        this.f693b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f693b + ")");
        ((List) this.f694c).add(aVar);
        thread.start();
    }

    @Override
    public int skip(int i7) {
        return ((f3.p) this.f694c).skip(i7);
    }

    @Override
    public void t() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f693b);
        ?? e2Var = new org.telegram.ui.ActionBar.e2(bundle);
        e2Var.d = new ArrayList();
        e2Var.f44983e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f694c;
        e2Var.f44983e = profileActivity.f43146l5;
        profileActivity.presentFragment((org.telegram.ui.ActionBar.e2) e2Var);
    }

    @Override
    public long t0(long j3) {
        return ((f3.j) this.f694c).f10845a;
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
        boolean z10 = !profileActivity.getMessagesController().r2(this.f693b, profileActivity.f43109g1, null);
        profileActivity.getNotificationsController().G(this.f693b, profileActivity.f43109g1, z10);
        if (profileActivity.fragmentView != null) {
            cc.A(profileActivity, z10, null).j();
        }
        profileActivity.x5();
        profileActivity.I5(true);
    }

    public boolean v(int i7) {
        if (i7 >= 64) {
            r();
            return ((va) this.f694c).v(i7 - 64);
        } else if ((this.f693b & (1 << i7)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public long v0(long j3, long j10) {
        return ((f3.j) this.f694c).f10845a;
    }

    public void w(int i7, boolean z10) {
        boolean z11;
        if (i7 >= 64) {
            r();
            ((va) this.f694c).w(i7 - 64, z10);
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
            A(i7);
        } else {
            p(i7);
        }
        if (!z11 && ((va) this.f694c) == null) {
            return;
        }
        r();
        ((va) this.f694c).w(0, z11);
    }

    public boolean x(int i7) {
        boolean z10;
        if (i7 >= 64) {
            r();
            return ((va) this.f694c).x(i7 - 64);
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
            if (vaVar.v(0)) {
                A(63);
            }
            ((va) this.f694c).x(0);
        }
        return z10;
    }

    @Override
    public long y(long j3, long j10) {
        return 0L;
    }

    public void z() {
        this.f693b = 0L;
        va vaVar = (va) this.f694c;
        if (vaVar != null) {
            vaVar.z();
        }
    }

    public va(Object obj, long j3, int i7) {
        this.f692a = i7;
        this.f694c = obj;
        this.f693b = j3;
    }

    public va(f3.p pVar, long j3) {
        this.f692a = 2;
        this.f694c = pVar;
        ja.f(pVar.getPosition() >= j3);
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
