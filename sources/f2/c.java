package f2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnFailureListener;
import h7.b9;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.t01;
public final class c implements OnFailureListener, o4.i, io, o3.l, o3.m, t4.f {
    public final int f6281a;
    public long f6282b;
    public Object f6283c;

    public c(long j10, Object obj, int i10) {
        this.f6281a = i10;
        this.f6282b = j10;
        this.f6283c = obj;
    }

    public int A(int i10) {
        c cVar = (c) this.f6283c;
        if (cVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f6282b);
            }
            return Long.bitCount(this.f6282b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f6282b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f6282b) + cVar.A(i10 - 64);
        }
    }

    public void B() {
        if (((c) this.f6283c) == null) {
            this.f6283c = new c(0);
        }
    }

    public void C(ic.a aVar) {
        this.f6282b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f6282b + ")");
        ((List) this.f6283c).add(aVar);
        thread.start();
    }

    public boolean D(int i10) {
        if (i10 >= 64) {
            B();
            return ((c) this.f6283c).D(i10 - 64);
        } else if ((this.f6282b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void D1(o3.t tVar) {
        ((o3.m) this.f6283c).D1(new t3.c(this, tVar));
    }

    public void E(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            B();
            ((c) this.f6283c).E(i10 - 64, z10);
            return;
        }
        long j10 = this.f6282b;
        if ((Long.MIN_VALUE & j10) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j11 = (1 << i10) - 1;
        this.f6282b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            J(i10);
        } else {
            x(i10);
        }
        if (!z11 && ((c) this.f6283c) == null) {
            return;
        }
        B();
        ((c) this.f6283c).E(0, z11);
    }

    @Override
    public long F(long j10) {
        return ((o3.f) this.f6283c).f19082a;
    }

    public boolean G(int i10) {
        boolean z10;
        if (i10 >= 64) {
            B();
            return ((c) this.f6283c).G(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f6282b;
        if ((j11 & j10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = j11 & (~j10);
        this.f6282b = j12;
        long j13 = j10 - 1;
        this.f6282b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        c cVar = (c) this.f6283c;
        if (cVar != null) {
            if (cVar.D(0)) {
                J(63);
            }
            ((c) this.f6283c).G(0);
        }
        return z10;
    }

    @Override
    public long H(long j10, long j11) {
        return ((o3.f) this.f6283c).f19082a;
    }

    public void I() {
        this.f6282b = 0L;
        c cVar = (c) this.f6283c;
        if (cVar != null) {
            cVar.I();
        }
    }

    public void J(int i10) {
        if (i10 >= 64) {
            B();
            ((c) this.f6283c).J(i10 - 64);
            return;
        }
        this.f6282b |= 1 << i10;
    }

    public void K(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f6283c) == null) {
            this.f6283c = exc;
            this.f6282b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f6282b) {
            Exception exc2 = (Exception) this.f6283c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f6283c;
            this.f6283c = null;
            throw exc3;
        }
    }

    @Override
    public o3.w Z1(int i10, int i11) {
        return ((o3.m) this.f6283c).Z1(i10, i11);
    }

    @Override
    public void a(int i10, int i11, byte[] bArr) {
        ((o3.l) this.f6283c).a(i10, i11, bArr);
    }

    @Override
    public long b(long j10) {
        return ((o3.f) this.f6283c).f19085e[(int) j10] - this.f6282b;
    }

    @Override
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return ((o3.l) this.f6283c).c(bArr, 0, i11, z10);
    }

    @Override
    public int d(int i10, int i11, byte[] bArr) {
        return ((o3.l) this.f6283c).d(i10, i11, bArr);
    }

    @Override
    public int e(long j10) {
        if (this.f6282b > j10) {
            return 0;
        }
        return -1;
    }

    @Override
    public void e1() {
        ((o3.m) this.f6283c).e1();
    }

    @Override
    public boolean f(byte[] bArr, int i10, int i11, boolean z10) {
        return ((o3.l) this.f6283c).f(bArr, i10, i11, z10);
    }

    @Override
    public long g(long j10, long j11) {
        return ((o3.f) this.f6283c).d[(int) j10];
    }

    @Override
    public long getLength() {
        return ((o3.l) this.f6283c).getLength() - this.f6282b;
    }

    @Override
    public long getPosition() {
        return ((o3.l) this.f6283c).getPosition() - this.f6282b;
    }

    @Override
    public long h() {
        return ((o3.l) this.f6283c).h() - this.f6282b;
    }

    @Override
    public void i(int i10) {
        ((o3.l) this.f6283c).i(i10);
    }

    @Override
    public void j() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f6282b);
        ?? o2Var = new o2(bundle);
        o2Var.d = new ArrayList();
        o2Var.f38146e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f6283c;
        o2Var.f38146e = profileActivity.f36010d5;
        profileActivity.presentFragment((o2) o2Var);
    }

    @Override
    public void k() {
        ProfileActivity profileActivity = (ProfileActivity) this.f6283c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f6282b, profileActivity.f36001c1);
        profileActivity.getNotificationsController().muteDialog(this.f6282b, profileActivity.f36001c1, z10);
        if (profileActivity.fragmentView != null) {
            tc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void l() {
        ProfileActivity profileActivity = (ProfileActivity) this.f6283c;
        long j10 = this.f6282b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f36001c1);
            profileActivity.presentFragment(new t01(bundle, profileActivity.f36129v0));
        }
    }

    @Override
    public long m(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        return this.f6282b;
    }

    @Override
    public long n(long j10, long j11) {
        return 0L;
    }

    @Override
    public long o(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f6281a) {
            case 1:
                ((b9) this.f6283c).f7568b.set(this.f6282b);
                return;
            case 2:
            case 4:
            default:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j10 = this.f6282b;
                for (s5.p pVar : ((q5.h) ((l3.g0) this.f6283c).d).f46393c.d) {
                    pVar.b(j10, i10, null);
                }
                return;
            case 3:
                ((b9) this.f6283c).f7568b.set(this.f6282b);
                return;
            case 5:
                ((b9) this.f6283c).f7568b.set(this.f6282b);
                return;
        }
    }

    @Override
    public p4.j p(long j10) {
        o3.f fVar = (o3.f) this.f6283c;
        int i10 = (int) j10;
        return new p4.j(fVar.f19084c[i10], fVar.f19083b[i10], null);
    }

    @Override
    public List q(long j10) {
        if (j10 >= this.f6282b) {
            return (q8.z) this.f6283c;
        }
        q8.x xVar = q8.z.f46511b;
        return q8.l0.f46462e;
    }

    @Override
    public long r(long j10, long j11) {
        return f5.d0.e(((o3.f) this.f6283c).f19085e, j10 + this.f6282b, true);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((o3.l) this.f6283c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((o3.l) this.f6283c).readFully(bArr, i10, i11);
    }

    @Override
    public void s() {
        ((o3.l) this.f6283c).s();
    }

    @Override
    public int skip(int i10) {
        return ((o3.l) this.f6283c).skip(i10);
    }

    @Override
    public void t(int i10) {
        ((o3.l) this.f6283c).t(i10);
    }

    public String toString() {
        switch (this.f6281a) {
            case 0:
                if (((c) this.f6283c) == null) {
                    return Long.toBinaryString(this.f6282b);
                }
                return ((c) this.f6283c).toString() + "xx" + Long.toBinaryString(this.f6282b);
            default:
                return super.toString();
        }
    }

    @Override
    public void u() {
        ProfileActivity profileActivity = (ProfileActivity) this.f6283c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.f6282b;
        boolean z10 = notificationsSettings.getBoolean(x3.j(j10, profileActivity.f36001c1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(x3.j(j10, profileActivity.f36001c1, new StringBuilder("sound_enabled_")), z11).apply();
        if (tc.a(profileActivity)) {
            tc.S(z10 ? 1 : 0, profileActivity, profileActivity.f36129v0).j();
        }
    }

    @Override
    public int v() {
        return 1;
    }

    @Override
    public void w(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f6283c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f6282b, profileActivity.f36001c1)) {
                k();
            }
            if (tc.a(profileActivity)) {
                tc.z(profileActivity, 4, i10, profileActivity.f36129v0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f6282b, profileActivity.f36001c1, i10);
        if (tc.a(profileActivity)) {
            tc.z(profileActivity, 5, i10, profileActivity.f36129v0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public void x(int i10) {
        if (i10 >= 64) {
            c cVar = (c) this.f6283c;
            if (cVar != null) {
                cVar.x(i10 - 64);
                return;
            }
            return;
        }
        this.f6282b &= ~(1 << i10);
    }

    @Override
    public boolean y() {
        return true;
    }

    @Override
    public long z() {
        return 0L;
    }

    public c(Object obj, long j10, int i10) {
        this.f6281a = i10;
        this.f6283c = obj;
        this.f6282b = j10;
    }

    public c(o3.l lVar, long j10) {
        this.f6281a = 10;
        this.f6283c = lVar;
        f5.a.f(lVar.getPosition() >= j10);
        this.f6282b = j10;
    }

    public c(int i10) {
        this.f6281a = i10;
        switch (i10) {
            case 2:
                this.f6283c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            case 3:
            default:
                this.f6282b = 0L;
                return;
            case 4:
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
