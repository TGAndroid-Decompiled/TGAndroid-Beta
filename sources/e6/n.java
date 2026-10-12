package e6;

import android.content.SharedPreferences;
import android.os.Bundle;
import c3.b0;
import c3.h0;
import com.google.android.gms.tasks.OnFailureListener;
import e2.d0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.v0;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.x11;
import x7.ga;
public final class n implements OnFailureListener, c3.p, c3.q, l2.i, gp {
    public final int f8685a;
    public long f8686b;
    public Object f8687c;

    public n(long j3, Object obj, int i10) {
        this.f8685a = i10;
        this.f8686b = j3;
        this.f8687c = obj;
    }

    public boolean A(int i10) {
        boolean z10;
        if (i10 >= 64) {
            w();
            return ((n) this.f8687c).A(i10 - 64);
        }
        long j3 = 1 << i10;
        long j10 = this.f8686b;
        if ((j10 & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j3);
        this.f8686b = j11;
        long j12 = j3 - 1;
        this.f8686b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        n nVar = (n) this.f8687c;
        if (nVar != null) {
            if (nVar.y(0)) {
                D(63);
            }
            ((n) this.f8687c).A(0);
        }
        return z10;
    }

    public void B() {
        this.f8686b = 0L;
        n nVar = (n) this.f8687c;
        if (nVar != null) {
            nVar.B();
        }
    }

    @Override
    public long C(long j3, long j10) {
        return d0.e(((c3.j) this.f8687c).f4127e, j3 + this.f8686b, true);
    }

    public void D(int i10) {
        if (i10 >= 64) {
            w();
            ((n) this.f8687c).D(i10 - 64);
            return;
        }
        this.f8686b |= 1 << i10;
    }

    @Override
    public boolean T() {
        return true;
    }

    @Override
    public long Y() {
        return 0L;
    }

    @Override
    public long a(long j3) {
        return ((c3.j) this.f8687c).f4127e[(int) j3] - this.f8686b;
    }

    @Override
    public void b(int i10, int i11, byte[] bArr) {
        ((c3.p) this.f8687c).b(i10, i11, bArr);
    }

    @Override
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8687c).c(bArr, 0, i11, z10);
    }

    @Override
    public long c0(long j3) {
        return ((c3.j) this.f8687c).f4124a;
    }

    @Override
    public int d(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.f8687c).d(i10, i11, bArr);
    }

    @Override
    public long d0(long j3, long j10) {
        return ((c3.j) this.f8687c).f4124a;
    }

    @Override
    public void d2(b0 b0Var) {
        ((c3.q) this.f8687c).d2(new k3.d(this, b0Var, b0Var));
    }

    @Override
    public boolean e(int i10, boolean z10) {
        return ((c3.p) this.f8687c).e(i10, true);
    }

    @Override
    public boolean f(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8687c).f(bArr, i10, i11, z10);
    }

    @Override
    public h0 f2(int i10, int i11) {
        return ((c3.q) this.f8687c).f2(i10, i11);
    }

    @Override
    public long g() {
        return ((c3.p) this.f8687c).g() - this.f8686b;
    }

    @Override
    public long getLength() {
        return ((c3.p) this.f8687c).getLength() - this.f8686b;
    }

    @Override
    public long getPosition() {
        return ((c3.p) this.f8687c).getPosition() - this.f8686b;
    }

    @Override
    public void h(int i10) {
        ((c3.p) this.f8687c).h(i10);
    }

    @Override
    public long i(long j3, long j10) {
        return ((c3.j) this.f8687c).d[(int) j3];
    }

    @Override
    public void j() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f8686b);
        ?? m2Var = new m2(bundle);
        m2Var.d = new ArrayList();
        m2Var.f40412e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f8687c;
        m2Var.f40412e = profileActivity.f34106h5;
        profileActivity.presentFragment((m2) m2Var);
    }

    @Override
    public void k() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8687c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f8686b, profileActivity.f34095g1);
        profileActivity.getNotificationsController().muteDialog(this.f8686b, profileActivity.f34095g1, z10);
        if (profileActivity.fragmentView != null) {
            zc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void k1() {
        ((c3.q) this.f8687c).k1();
    }

    @Override
    public void l() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8687c;
        long j3 = this.f8686b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f34095g1);
            profileActivity.presentFragment(new x11(bundle, profileActivity.f34223z0));
        }
    }

    @Override
    public void m() {
        ((c3.p) this.f8687c).m();
    }

    @Override
    public long n(long j3, long j10) {
        return 0L;
    }

    @Override
    public void o(int i10) {
        ((c3.p) this.f8687c).o(i10);
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f8685a) {
            case 0:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j3 = this.f8686b;
                for (g6.o oVar : ((h) ((aa.a) this.f8687c).d).f8670c.d) {
                    oVar.b(j3, i10, null);
                }
                return;
            case 7:
                ((AtomicLong) ((n6.k) this.f8687c).f16433c).set(this.f8686b);
                return;
            case 8:
                ((ga) this.f8687c).f51015b.set(this.f8686b);
                return;
            default:
                ((ga) this.f8687c).f51015b.set(this.f8686b);
                return;
        }
    }

    @Override
    public long p(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public void q() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8687c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f8686b;
        boolean z10 = notificationsSettings.getBoolean(v0.i(j3, profileActivity.f34095g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(v0.i(j3, profileActivity.f34095g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (zc.a(profileActivity)) {
            zc.S(z10 ? 1 : 0, profileActivity, profileActivity.f34223z0).j();
        }
    }

    @Override
    public m2.j r(long j3) {
        c3.j jVar = (c3.j) this.f8687c;
        int i10 = (int) j3;
        return new m2.j(jVar.f4126c[i10], jVar.f4125b[i10], null);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.f8687c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.f8687c).readFully(bArr, i10, i11);
    }

    @Override
    public boolean s(int i10, boolean z10) {
        return ((c3.p) this.f8687c).s(i10, true);
    }

    @Override
    public int skip(int i10) {
        return ((c3.p) this.f8687c).skip(i10);
    }

    @Override
    public void t(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f8687c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f8686b, profileActivity.f34095g1)) {
                k();
            }
            if (zc.a(profileActivity)) {
                zc.z(profileActivity, 4, i10, profileActivity.f34223z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f8686b, profileActivity.f34095g1, i10);
        if (zc.a(profileActivity)) {
            zc.z(profileActivity, 5, i10, profileActivity.f34223z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public String toString() {
        switch (this.f8685a) {
            case 6:
                if (((n) this.f8687c) == null) {
                    return Long.toBinaryString(this.f8686b);
                }
                return ((n) this.f8687c).toString() + "xx" + Long.toBinaryString(this.f8686b);
            default:
                return super.toString();
        }
    }

    public void u(int i10) {
        if (i10 >= 64) {
            n nVar = (n) this.f8687c;
            if (nVar != null) {
                nVar.u(i10 - 64);
                return;
            }
            return;
        }
        this.f8686b &= ~(1 << i10);
    }

    public int v(int i10) {
        n nVar = (n) this.f8687c;
        if (nVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f8686b);
            }
            return Long.bitCount(this.f8686b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f8686b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f8686b) + nVar.v(i10 - 64);
        }
    }

    public void w() {
        if (((n) this.f8687c) == null) {
            this.f8687c = new n(6);
        }
    }

    public void x(zc.a aVar) {
        this.f8686b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f8686b + ")");
        ((List) this.f8687c).add(aVar);
        thread.start();
    }

    public boolean y(int i10) {
        if (i10 >= 64) {
            w();
            return ((n) this.f8687c).y(i10 - 64);
        } else if ((this.f8686b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void z(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            w();
            ((n) this.f8687c).z(i10 - 64, z10);
            return;
        }
        long j3 = this.f8686b;
        if ((Long.MIN_VALUE & j3) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f8686b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            D(i10);
        } else {
            u(i10);
        }
        if (!z11 && ((n) this.f8687c) == null) {
            return;
        }
        w();
        ((n) this.f8687c).z(0, z11);
    }

    public n(Object obj, long j3, int i10) {
        this.f8685a = i10;
        this.f8687c = obj;
        this.f8686b = j3;
    }

    public n(c3.p pVar, long j3) {
        this.f8685a = 2;
        this.f8687c = pVar;
        e2.d.b(pVar.getPosition() >= j3);
        this.f8686b = j3;
    }

    public n(int i10) {
        this.f8685a = i10;
        switch (i10) {
            case 10:
                this.f8687c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f8686b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
