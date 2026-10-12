package ad;

import android.content.SharedPreferences;
import android.os.Bundle;
import c3.b0;
import c3.g0;
import c3.i0;
import c3.p;
import c3.q;
import com.google.android.gms.tasks.OnFailureListener;
import e2.m0;
import g6.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c21;
import v7.u6;
import v7.z8;
public final class d implements p, q, OnFailureListener, l2.i, bp {
    public final int f501a;
    public long f502b;
    public Object f503c;

    public d(long j10, Object obj, int i10) {
        this.f501a = i10;
        this.f502b = j10;
        this.f503c = obj;
    }

    public int A(int i10) {
        d dVar = (d) this.f503c;
        if (dVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f502b);
            }
            return Long.bitCount(this.f502b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f502b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f502b) + dVar.A(i10 - 64);
        }
    }

    public void B() {
        if (((d) this.f503c) == null) {
            this.f503c = new d(7);
        }
    }

    public void C(a aVar) {
        this.f502b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f502b + ")");
        ((List) this.f503c).add(aVar);
        thread.start();
    }

    @Override
    public void D() {
        ((q) this.f503c).D();
    }

    public boolean E(int i10) {
        if (i10 >= 64) {
            B();
            return ((d) this.f503c).E(i10 - 64);
        } else if ((this.f502b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void F(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            B();
            ((d) this.f503c).F(i10 - 64, z10);
            return;
        }
        long j10 = this.f502b;
        if ((Long.MIN_VALUE & j10) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j11 = (1 << i10) - 1;
        this.f502b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            I(i10);
        } else {
            z(i10);
        }
        if (!z11 && ((d) this.f503c) == null) {
            return;
        }
        B();
        ((d) this.f503c).F(0, z11);
    }

    public boolean G(int i10) {
        boolean z10;
        if (i10 >= 64) {
            B();
            return ((d) this.f503c).G(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f502b;
        if ((j11 & j10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = j11 & (~j10);
        this.f502b = j12;
        long j13 = j10 - 1;
        this.f502b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        d dVar = (d) this.f503c;
        if (dVar != null) {
            if (dVar.E(0)) {
                I(63);
            }
            ((d) this.f503c).G(0);
        }
        return z10;
    }

    public void H() {
        this.f502b = 0L;
        d dVar = (d) this.f503c;
        if (dVar != null) {
            dVar.H();
        }
    }

    public void I(int i10) {
        if (i10 >= 64) {
            B();
            ((d) this.f503c).I(i10 - 64);
            return;
        }
        this.f502b |= 1 << i10;
    }

    @Override
    public void K(b0 b0Var) {
        ((q) this.f503c).K(new g0(this, b0Var, b0Var));
    }

    @Override
    public void a(int i10, int i11, byte[] bArr) {
        ((p) this.f503c).a(i10, i11, bArr);
    }

    @Override
    public i0 a0(int i10, int i11) {
        return ((q) this.f503c).a0(i10, i11);
    }

    @Override
    public long b(long j10) {
        return ((c3.j) this.f503c).e[(int) j10] - this.f502b;
    }

    @Override
    public long c(long j10, long j11) {
        return ((c3.j) this.f503c).d[(int) j10];
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((p) this.f503c).d(bArr, 0, i11, z10);
    }

    @Override
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override
    public int f(int i10, int i11, byte[] bArr) {
        return ((p) this.f503c).f(i10, i11, bArr);
    }

    @Override
    public boolean g(int i10, boolean z10) {
        return ((p) this.f503c).g(i10, true);
    }

    @Override
    public long getLength() {
        return ((p) this.f503c).getLength() - this.f502b;
    }

    @Override
    public long getPosition() {
        return ((p) this.f503c).getPosition() - this.f502b;
    }

    @Override
    public long h(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public m2.j i(long j10) {
        c3.j jVar = (c3.j) this.f503c;
        int i10 = (int) j10;
        return new m2.j(jVar.f4254c[i10], jVar.f4253b[i10], null);
    }

    @Override
    public boolean j(byte[] bArr, int i10, int i11, boolean z10) {
        return ((p) this.f503c).j(bArr, i10, i11, z10);
    }

    @Override
    public long k() {
        return ((p) this.f503c).k() - this.f502b;
    }

    @Override
    public void l(int i10) {
        ((p) this.f503c).l(i10);
    }

    @Override
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f502b);
        ?? m2Var = new m2(bundle);
        m2Var.d = new ArrayList();
        m2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f503c;
        m2Var.e = profileActivity.f32585h5;
        profileActivity.presentFragment((m2) m2Var);
    }

    @Override
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.f503c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f502b, profileActivity.f32574g1);
        profileActivity.getNotificationsController().muteDialog(this.f502b, profileActivity.f32574g1, z10);
        if (profileActivity.fragmentView != null) {
            zc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public long o(long j10, long j11) {
        return m0.f(((c3.j) this.f503c).e, j10 + this.f502b, true);
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f501a) {
            case 3:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j10 = this.f502b;
                for (o oVar : ((e6.h) ((androidx.biometric.e) this.f503c).d).f8491c.d) {
                    oVar.b(j10, i10, null);
                }
                return;
            case 8:
                ((z8) this.f503c).f46859b.set(this.f502b);
                return;
            case 9:
                ((z8) this.f503c).f46859b.set(this.f502b);
                return;
            default:
                ((AtomicLong) ((n6.o) this.f503c).f16132c).set(this.f502b);
                return;
        }
    }

    @Override
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.f503c;
        long j10 = this.f502b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f32574g1);
            profileActivity.presentFragment(new c21(bundle, profileActivity.f32703z0));
        }
    }

    @Override
    public void q() {
        ((p) this.f503c).q();
    }

    @Override
    public void r(int i10) {
        ((p) this.f503c).r(i10);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((p) this.f503c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((p) this.f503c).readFully(bArr, i10, i11);
    }

    @Override
    public void s() {
        ProfileActivity profileActivity = (ProfileActivity) this.f503c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.f502b;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.q.j(j10, profileActivity.f32574g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.q.j(j10, profileActivity.f32574g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (zc.a(profileActivity)) {
            zc.S(z10 ? 1 : 0, profileActivity, profileActivity.f32703z0).j();
        }
    }

    @Override
    public int skip(int i10) {
        return ((p) this.f503c).skip(i10);
    }

    @Override
    public boolean t() {
        return true;
    }

    public String toString() {
        switch (this.f501a) {
            case 7:
                if (((d) this.f503c) == null) {
                    return Long.toBinaryString(this.f502b);
                }
                return ((d) this.f503c).toString() + "xx" + Long.toBinaryString(this.f502b);
            default:
                return super.toString();
        }
    }

    @Override
    public long u() {
        return 0L;
    }

    @Override
    public boolean v(int i10, boolean z10) {
        return ((p) this.f503c).v(i10, true);
    }

    @Override
    public long w(long j10) {
        return ((c3.j) this.f503c).f4252a;
    }

    @Override
    public long x(long j10, long j11) {
        return ((c3.j) this.f503c).f4252a;
    }

    @Override
    public void y(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f503c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f502b, profileActivity.f32574g1)) {
                n();
            }
            if (zc.a(profileActivity)) {
                zc.z(profileActivity, 4, i10, profileActivity.f32703z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f502b, profileActivity.f32574g1, i10);
        if (zc.a(profileActivity)) {
            zc.z(profileActivity, 5, i10, profileActivity.f32703z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public void z(int i10) {
        if (i10 >= 64) {
            d dVar = (d) this.f503c;
            if (dVar != null) {
                dVar.z(i10 - 64);
                return;
            }
            return;
        }
        this.f502b &= ~(1 << i10);
    }

    public d(Object obj, long j10, int i10) {
        this.f501a = i10;
        this.f503c = obj;
        this.f502b = j10;
    }

    public d(p pVar, long j10) {
        this.f501a = 1;
        this.f503c = pVar;
        u6.g(pVar.getPosition() >= j10);
        this.f502b = j10;
    }

    public d(int i10) {
        this.f501a = i10;
        switch (i10) {
            case 7:
                this.f502b = 0L;
                return;
            default:
                this.f503c = DesugarCollections.synchronizedList(new ArrayList());
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
