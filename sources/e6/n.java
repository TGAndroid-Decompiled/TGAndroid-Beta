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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p11;
import v7.z8;
public final class n implements OnFailureListener, c3.p, c3.q, l2.i, ro {
    public final int f8694a;
    public long f8695b;
    public Object f8696c;

    public n(long j3, Object obj, int i10) {
        this.f8694a = i10;
        this.f8695b = j3;
        this.f8696c = obj;
    }

    public boolean A(int i10) {
        boolean z10;
        if (i10 >= 64) {
            w();
            return ((n) this.f8696c).A(i10 - 64);
        }
        long j3 = 1 << i10;
        long j10 = this.f8695b;
        if ((j10 & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j3);
        this.f8695b = j11;
        long j12 = j3 - 1;
        this.f8695b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        n nVar = (n) this.f8696c;
        if (nVar != null) {
            if (nVar.y(0)) {
                C(63);
            }
            ((n) this.f8696c).A(0);
        }
        return z10;
    }

    public void B() {
        this.f8695b = 0L;
        n nVar = (n) this.f8696c;
        if (nVar != null) {
            nVar.B();
        }
    }

    public void C(int i10) {
        if (i10 >= 64) {
            w();
            ((n) this.f8696c).C(i10 - 64);
            return;
        }
        this.f8695b |= 1 << i10;
    }

    @Override
    public long H(long j3, long j10) {
        return d0.e(((c3.j) this.f8696c).f4079e, j3 + this.f8695b, true);
    }

    @Override
    public void X1(b0 b0Var) {
        ((c3.q) this.f8696c).X1(new k3.d(this, b0Var, b0Var));
    }

    @Override
    public h0 Z1(int i10, int i11) {
        return ((c3.q) this.f8696c).Z1(i10, i11);
    }

    @Override
    public long a(long j3) {
        return ((c3.j) this.f8696c).f4079e[(int) j3] - this.f8695b;
    }

    @Override
    public void b(int i10, int i11, byte[] bArr) {
        ((c3.p) this.f8696c).b(i10, i11, bArr);
    }

    @Override
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8696c).c(bArr, 0, i11, z10);
    }

    @Override
    public int d(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.f8696c).d(i10, i11, bArr);
    }

    @Override
    public boolean e(int i10, boolean z10) {
        return ((c3.p) this.f8696c).e(i10, true);
    }

    @Override
    public boolean e0() {
        return true;
    }

    @Override
    public void e1() {
        ((c3.q) this.f8696c).e1();
    }

    @Override
    public boolean f(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8696c).f(bArr, i10, i11, z10);
    }

    @Override
    public long g() {
        return ((c3.p) this.f8696c).g() - this.f8695b;
    }

    @Override
    public long getLength() {
        return ((c3.p) this.f8696c).getLength() - this.f8695b;
    }

    @Override
    public long getPosition() {
        return ((c3.p) this.f8696c).getPosition() - this.f8695b;
    }

    @Override
    public void h(int i10) {
        ((c3.p) this.f8696c).h(i10);
    }

    @Override
    public long i(long j3, long j10) {
        return ((c3.j) this.f8696c).d[(int) j3];
    }

    @Override
    public void j() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f8695b);
        ?? n2Var = new n2(bundle);
        n2Var.d = new ArrayList();
        n2Var.f35455e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f8696c;
        n2Var.f35455e = profileActivity.f34279h5;
        profileActivity.presentFragment((n2) n2Var);
    }

    @Override
    public long j0() {
        return 0L;
    }

    @Override
    public void k() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8696c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f8695b, profileActivity.f34268g1);
        profileActivity.getNotificationsController().muteDialog(this.f8695b, profileActivity.f34268g1, z10);
        if (profileActivity.fragmentView != null) {
            yc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void l() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8696c;
        long j3 = this.f8695b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f34268g1);
            profileActivity.presentFragment(new p11(bundle, profileActivity.f34396z0));
        }
    }

    @Override
    public void m() {
        ((c3.p) this.f8696c).m();
    }

    @Override
    public long n(long j3, long j10) {
        return 0L;
    }

    @Override
    public void o(int i10) {
        ((c3.p) this.f8696c).o(i10);
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f8694a) {
            case 0:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j3 = this.f8695b;
                for (g6.o oVar : ((h) ((aa.a) this.f8696c).d).f8679c.d) {
                    oVar.b(j3, i10, null);
                }
                return;
            case 7:
                ((z8) this.f8696c).f48177b.set(this.f8695b);
                return;
            case 8:
                ((AtomicLong) ((o0.a) this.f8696c).f16938c).set(this.f8695b);
                return;
            default:
                ((z8) this.f8696c).f48177b.set(this.f8695b);
                return;
        }
    }

    @Override
    public long p(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public long p0(long j3) {
        return ((c3.j) this.f8696c).f4076a;
    }

    @Override
    public m2.j q(long j3) {
        c3.j jVar = (c3.j) this.f8696c;
        int i10 = (int) j3;
        return new m2.j(jVar.f4078c[i10], jVar.f4077b[i10], null);
    }

    @Override
    public long q0(long j3, long j10) {
        return ((c3.j) this.f8696c).f4076a;
    }

    @Override
    public void r() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8696c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f8695b;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.q.i(j3, profileActivity.f34268g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.q.i(j3, profileActivity.f34268g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (yc.a(profileActivity)) {
            yc.S(z10 ? 1 : 0, profileActivity, profileActivity.f34396z0).j();
        }
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.f8696c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.f8696c).readFully(bArr, i10, i11);
    }

    @Override
    public boolean s(int i10, boolean z10) {
        return ((c3.p) this.f8696c).s(i10, true);
    }

    @Override
    public int skip(int i10) {
        return ((c3.p) this.f8696c).skip(i10);
    }

    @Override
    public void t(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f8696c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f8695b, profileActivity.f34268g1)) {
                k();
            }
            if (yc.a(profileActivity)) {
                yc.z(profileActivity, 4, i10, profileActivity.f34396z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f8695b, profileActivity.f34268g1, i10);
        if (yc.a(profileActivity)) {
            yc.z(profileActivity, 5, i10, profileActivity.f34396z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public String toString() {
        switch (this.f8694a) {
            case 6:
                if (((n) this.f8696c) == null) {
                    return Long.toBinaryString(this.f8695b);
                }
                return ((n) this.f8696c).toString() + "xx" + Long.toBinaryString(this.f8695b);
            default:
                return super.toString();
        }
    }

    public void u(int i10) {
        if (i10 >= 64) {
            n nVar = (n) this.f8696c;
            if (nVar != null) {
                nVar.u(i10 - 64);
                return;
            }
            return;
        }
        this.f8695b &= ~(1 << i10);
    }

    public int v(int i10) {
        n nVar = (n) this.f8696c;
        if (nVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f8695b);
            }
            return Long.bitCount(this.f8695b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f8695b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f8695b) + nVar.v(i10 - 64);
        }
    }

    public void w() {
        if (((n) this.f8696c) == null) {
            this.f8696c = new n(6);
        }
    }

    public void x(yc.a aVar) {
        this.f8695b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f8695b + ")");
        ((List) this.f8696c).add(aVar);
        thread.start();
    }

    public boolean y(int i10) {
        if (i10 >= 64) {
            w();
            return ((n) this.f8696c).y(i10 - 64);
        } else if ((this.f8695b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void z(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            w();
            ((n) this.f8696c).z(i10 - 64, z10);
            return;
        }
        long j3 = this.f8695b;
        if ((Long.MIN_VALUE & j3) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f8695b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            C(i10);
        } else {
            u(i10);
        }
        if (!z11 && ((n) this.f8696c) == null) {
            return;
        }
        w();
        ((n) this.f8696c).z(0, z11);
    }

    public n(Object obj, long j3, int i10) {
        this.f8694a = i10;
        this.f8696c = obj;
        this.f8695b = j3;
    }

    public n(c3.p pVar, long j3) {
        this.f8694a = 2;
        this.f8696c = pVar;
        e2.d.b(pVar.getPosition() >= j3);
        this.f8695b = j3;
    }

    public n(int i10) {
        this.f8694a = i10;
        switch (i10) {
            case 9:
                this.f8696c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f8695b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
