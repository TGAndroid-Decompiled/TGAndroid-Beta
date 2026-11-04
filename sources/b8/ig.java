package b8;

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
import org.telegram.messenger.hp;
import org.telegram.messenger.us;
import org.telegram.ui.Components.wn;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yw0;
public final class ig implements OnFailureListener, e3.p, e3.q, n2.i, wn, wi.w0 {
    public final int f2681a;
    public long f2682b;
    public Object f2683c;

    public ig(long j10, Object obj, int i3) {
        this.f2681a = i3;
        this.f2682b = j10;
        this.f2683c = obj;
    }

    @Override
    public boolean A() {
        return true;
    }

    public void B() {
        if (((ig) this.f2683c) == null) {
            this.f2683c = new ig(7);
        }
    }

    @Override
    public long C() {
        return 0L;
    }

    public void D(vc.a aVar) {
        this.f2682b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f2682b + ")");
        ((List) this.f2683c).add(aVar);
        thread.start();
    }

    public boolean E(int i3) {
        if (i3 >= 64) {
            B();
            return ((ig) this.f2683c).E(i3 - 64);
        } else if ((this.f2682b & (1 << i3)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void F(int i3, boolean z10) {
        boolean z11;
        if (i3 >= 64) {
            B();
            ((ig) this.f2683c).F(i3 - 64, z10);
            return;
        }
        long j10 = this.f2682b;
        if ((Long.MIN_VALUE & j10) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j11 = (1 << i3) - 1;
        this.f2682b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            J(i3);
        } else {
            a(i3);
        }
        if (!z11 && ((ig) this.f2683c) == null) {
            return;
        }
        B();
        ((ig) this.f2683c).F(0, z11);
    }

    public boolean G(int i3) {
        boolean z10;
        if (i3 >= 64) {
            B();
            return ((ig) this.f2683c).G(i3 - 64);
        }
        long j10 = 1 << i3;
        long j11 = this.f2682b;
        if ((j11 & j10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = j11 & (~j10);
        this.f2682b = j12;
        long j13 = j10 - 1;
        this.f2682b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        ig igVar = (ig) this.f2683c;
        if (igVar != null) {
            if (igVar.E(0)) {
                J(63);
            }
            ((ig) this.f2683c).G(0);
        }
        return z10;
    }

    @Override
    public long H(long j10) {
        return ((e3.j) this.f2683c).f9474a;
    }

    public void I() {
        this.f2682b = 0L;
        ig igVar = (ig) this.f2683c;
        if (igVar != null) {
            igVar.I();
        }
    }

    public void J(int i3) {
        if (i3 >= 64) {
            B();
            ((ig) this.f2683c).J(i3 - 64);
            return;
        }
        this.f2682b |= 1 << i3;
    }

    @Override
    public long K(long j10, long j11) {
        return ((e3.j) this.f2683c).f9474a;
    }

    @Override
    public void L() {
        ((e3.q) this.f2683c).L();
    }

    public void a(int i3) {
        if (i3 >= 64) {
            ig igVar = (ig) this.f2683c;
            if (igVar != null) {
                igVar.a(i3 - 64);
                return;
            }
            return;
        }
        this.f2682b &= ~(1 << i3);
    }

    @Override
    public long b(long j10) {
        return ((e3.j) this.f2683c).f9477e[(int) j10] - this.f2682b;
    }

    @Override
    public void c(int i3, int i10, byte[] bArr) {
        ((e3.p) this.f2683c).c(i3, i10, bArr);
    }

    @Override
    public boolean d(byte[] bArr, int i3, int i10, boolean z10) {
        return ((e3.p) this.f2683c).d(bArr, 0, i10, z10);
    }

    @Override
    public int e(int i3, int i10, byte[] bArr) {
        return ((e3.p) this.f2683c).e(i3, i10, bArr);
    }

    @Override
    public void f(e3.b0 b0Var) {
        ((e3.q) this.f2683c).f(new e3.g0(this, b0Var, b0Var));
    }

    @Override
    public boolean g(int i3, boolean z10) {
        return ((e3.p) this.f2683c).g(i3, true);
    }

    @Override
    public long getLength() {
        return ((e3.p) this.f2683c).getLength() - this.f2682b;
    }

    @Override
    public long getPosition() {
        return ((e3.p) this.f2683c).getPosition() - this.f2682b;
    }

    @Override
    public boolean h(byte[] bArr, int i3, int i10, boolean z10) {
        return ((e3.p) this.f2683c).h(bArr, i3, i10, z10);
    }

    @Override
    public long i(long j10, long j11) {
        return ((e3.j) this.f2683c).d[(int) j10];
    }

    @Override
    public e3.i0 i0(int i3, int i10) {
        return ((e3.q) this.f2683c).i0(i3, i10);
    }

    @Override
    public long j(long j10, long j11) {
        return 0L;
    }

    @Override
    public long k() {
        return ((e3.p) this.f2683c).k() - this.f2682b;
    }

    @Override
    public long l(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public o2.j m(long j10) {
        e3.j jVar = (e3.j) this.f2683c;
        int i3 = (int) j10;
        return new o2.j(jVar.f9476c[i3], null, jVar.f9475b[i3]);
    }

    @Override
    public void n(int i3) {
        ((e3.p) this.f2683c).n(i3);
    }

    @Override
    public void o() {
        ((e3.p) this.f2683c).o();
    }

    @Override
    public void onFailure(Exception exc) {
        int i3;
        switch (this.f2681a) {
            case 0:
                ((jg) this.f2683c).f2700b.set(this.f2682b);
                return;
            case 3:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i3 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i3 = 13;
                }
                long j10 = this.f2682b;
                for (i6.o oVar : ((g6.h) ((android.support.v4.media.session.a0) this.f2683c).d).f12009c.d) {
                    oVar.b(j10, i3, null);
                }
                return;
            case 10:
                ((jg) this.f2683c).f2700b.set(this.f2682b);
                return;
            default:
                ((jg) this.f2683c).f2700b.set(this.f2682b);
                return;
        }
    }

    @Override
    public void p() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f2682b);
        ?? d2Var = new org.telegram.ui.ActionBar.d2(bundle);
        d2Var.d = new ArrayList();
        d2Var.f49454e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f2683c;
        d2Var.f49454e = profileActivity.f41783i5;
        profileActivity.presentFragment((org.telegram.ui.ActionBar.d2) d2Var);
    }

    @Override
    public void q() {
        ProfileActivity profileActivity = (ProfileActivity) this.f2683c;
        boolean z10 = !profileActivity.getMessagesController().r2(this.f2682b, profileActivity.f41766g1, null);
        profileActivity.getNotificationsController().G(this.f2682b, profileActivity.f41766g1, z10);
        if (profileActivity.fragmentView != null) {
            org.telegram.ui.Components.fc.A(profileActivity, z10, null).j();
        }
        profileActivity.v5();
        profileActivity.F5(true);
    }

    @Override
    public void r(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((wi.w) this.f2683c).q(true, byteBuffer, bufferInfo, -this.f2682b);
    }

    @Override
    public int read(byte[] bArr, int i3, int i10) {
        return ((e3.p) this.f2683c).read(bArr, i3, i10);
    }

    @Override
    public void readFully(byte[] bArr, int i3, int i10) {
        ((e3.p) this.f2683c).readFully(bArr, i3, i10);
    }

    @Override
    public long s(long j10, long j11) {
        return g2.n0.f(((e3.j) this.f2683c).f9477e, j10 + this.f2682b, true);
    }

    @Override
    public int skip(int i3) {
        return ((e3.p) this.f2683c).skip(i3);
    }

    @Override
    public void t() {
        ProfileActivity profileActivity = (ProfileActivity) this.f2683c;
        long j10 = this.f2682b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f41766g1);
            profileActivity.presentFragment(new yw0(bundle, profileActivity.A0));
        }
    }

    public String toString() {
        switch (this.f2681a) {
            case 7:
                if (((ig) this.f2683c) == null) {
                    return Long.toBinaryString(this.f2682b);
                }
                return ((ig) this.f2683c).toString() + "xx" + Long.toBinaryString(this.f2682b);
            default:
                return super.toString();
        }
    }

    @Override
    public void u(int i3) {
        ((e3.p) this.f2683c).u(i3);
    }

    @Override
    public void v() {
        ProfileActivity profileActivity = (ProfileActivity) this.f2683c;
        SharedPreferences sharedPreferences = hp.s1(ProfileActivity.k1(profileActivity)).f22989d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.f2682b;
        sb2.append(us.v(j10, profileActivity.f41766g1, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + us.v(j10, profileActivity.f41766g1, false), z11).apply();
        if (org.telegram.ui.Components.fc.a(profileActivity)) {
            org.telegram.ui.Components.fc.S(z10 ? 1 : 0, profileActivity, profileActivity.A0).j();
        }
    }

    @Override
    public boolean w(int i3, boolean z10) {
        return ((e3.p) this.f2683c).w(i3, true);
    }

    @Override
    public void x(MediaFormat mediaFormat) {
        ((wi.w) this.f2683c).n(mediaFormat, true);
    }

    public int y(int i3) {
        ig igVar = (ig) this.f2683c;
        if (igVar == null) {
            if (i3 >= 64) {
                return Long.bitCount(this.f2682b);
            }
            return Long.bitCount(this.f2682b & ((1 << i3) - 1));
        } else if (i3 < 64) {
            return Long.bitCount(this.f2682b & ((1 << i3) - 1));
        } else {
            return Long.bitCount(this.f2682b) + igVar.y(i3 - 64);
        }
    }

    @Override
    public void z(int i3) {
        ProfileActivity profileActivity = (ProfileActivity) this.f2683c;
        if (i3 == 0) {
            if (profileActivity.getMessagesController().r2(this.f2682b, profileActivity.f41766g1, null)) {
                q();
            }
            if (org.telegram.ui.Components.fc.a(profileActivity)) {
                org.telegram.ui.Components.fc.z(profileActivity, 4, i3, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.T6;
        profileActivity.getNotificationsController().H(this.f2682b, i3, profileActivity.f41766g1);
        if (org.telegram.ui.Components.fc.a(profileActivity)) {
            org.telegram.ui.Components.fc.z(profileActivity, 5, i3, profileActivity.A0).j();
        }
        profileActivity.v5();
        profileActivity.F5(true);
    }

    public ig(Object obj, long j10, int i3) {
        this.f2681a = i3;
        this.f2683c = obj;
        this.f2682b = j10;
    }

    public ig(e3.p pVar, long j10) {
        this.f2681a = 1;
        this.f2683c = pVar;
        zb.f(pVar.getPosition() >= j10);
        this.f2682b = j10;
    }

    public ig(int i3) {
        this.f2681a = i3;
        switch (i3) {
            case 8:
                this.f2683c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f2682b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
