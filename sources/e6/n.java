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
import org.telegram.messenger.f0;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p11;
import v7.z8;
public final class n implements OnFailureListener, c3.p, c3.q, l2.i, ro {
    public final int f8693a;
    public long f8694b;
    public Object f8695c;

    public n(long j3, Object obj, int i10) {
        this.f8693a = i10;
        this.f8694b = j3;
        this.f8695c = obj;
    }

    public boolean A(int i10) {
        boolean z10;
        if (i10 >= 64) {
            w();
            return ((n) this.f8695c).A(i10 - 64);
        }
        long j3 = 1 << i10;
        long j10 = this.f8694b;
        if ((j10 & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j3);
        this.f8694b = j11;
        long j12 = j3 - 1;
        this.f8694b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        n nVar = (n) this.f8695c;
        if (nVar != null) {
            if (nVar.y(0)) {
                C(63);
            }
            ((n) this.f8695c).A(0);
        }
        return z10;
    }

    public void B() {
        this.f8694b = 0L;
        n nVar = (n) this.f8695c;
        if (nVar != null) {
            nVar.B();
        }
    }

    public void C(int i10) {
        if (i10 >= 64) {
            w();
            ((n) this.f8695c).C(i10 - 64);
            return;
        }
        this.f8694b |= 1 << i10;
    }

    @Override
    public long H(long j3, long j10) {
        return d0.e(((c3.j) this.f8695c).f4078e, j3 + this.f8694b, true);
    }

    @Override
    public void X1(b0 b0Var) {
        ((c3.q) this.f8695c).X1(new k3.d(this, b0Var, b0Var));
    }

    @Override
    public h0 Z1(int i10, int i11) {
        return ((c3.q) this.f8695c).Z1(i10, i11);
    }

    @Override
    public long a(long j3) {
        return ((c3.j) this.f8695c).f4078e[(int) j3] - this.f8694b;
    }

    @Override
    public void b(int i10, int i11, byte[] bArr) {
        ((c3.p) this.f8695c).b(i10, i11, bArr);
    }

    @Override
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8695c).c(bArr, 0, i11, z10);
    }

    @Override
    public int d(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.f8695c).d(i10, i11, bArr);
    }

    @Override
    public boolean e(int i10, boolean z10) {
        return ((c3.p) this.f8695c).e(i10, true);
    }

    @Override
    public boolean e0() {
        return true;
    }

    @Override
    public void e1() {
        ((c3.q) this.f8695c).e1();
    }

    @Override
    public boolean f(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8695c).f(bArr, i10, i11, z10);
    }

    @Override
    public long g() {
        return ((c3.p) this.f8695c).g() - this.f8694b;
    }

    @Override
    public long getLength() {
        return ((c3.p) this.f8695c).getLength() - this.f8694b;
    }

    @Override
    public long getPosition() {
        return ((c3.p) this.f8695c).getPosition() - this.f8694b;
    }

    @Override
    public void h(int i10) {
        ((c3.p) this.f8695c).h(i10);
    }

    @Override
    public long i(long j3, long j10) {
        return ((c3.j) this.f8695c).d[(int) j3];
    }

    @Override
    public void j() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f8694b);
        ?? n2Var = new n2(bundle);
        n2Var.d = new ArrayList();
        n2Var.f36022e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f8695c;
        n2Var.f36022e = profileActivity.f34259h5;
        profileActivity.presentFragment((n2) n2Var);
    }

    @Override
    public long j0() {
        return 0L;
    }

    @Override
    public void k() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8695c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f8694b, profileActivity.f34248g1);
        profileActivity.getNotificationsController().muteDialog(this.f8694b, profileActivity.f34248g1, z10);
        if (profileActivity.fragmentView != null) {
            yc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void l() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8695c;
        long j3 = this.f8694b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f34248g1);
            profileActivity.presentFragment(new p11(bundle, profileActivity.f34376z0));
        }
    }

    @Override
    public void m() {
        ((c3.p) this.f8695c).m();
    }

    @Override
    public long n(long j3, long j10) {
        return 0L;
    }

    @Override
    public void o(int i10) {
        ((c3.p) this.f8695c).o(i10);
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f8693a) {
            case 0:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j3 = this.f8694b;
                for (g6.o oVar : ((h) ((aa.a) this.f8695c).d).f8678c.d) {
                    oVar.b(j3, i10, null);
                }
                return;
            case 7:
                ((z8) this.f8695c).f48161b.set(this.f8694b);
                return;
            case 8:
                ((AtomicLong) ((o0.a) this.f8695c).f16928c).set(this.f8694b);
                return;
            default:
                ((z8) this.f8695c).f48161b.set(this.f8694b);
                return;
        }
    }

    @Override
    public long p(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public long p0(long j3) {
        return ((c3.j) this.f8695c).f4075a;
    }

    @Override
    public m2.j q(long j3) {
        c3.j jVar = (c3.j) this.f8695c;
        int i10 = (int) j3;
        return new m2.j(jVar.f4077c[i10], jVar.f4076b[i10], null);
    }

    @Override
    public long q0(long j3, long j10) {
        return ((c3.j) this.f8695c).f4075a;
    }

    @Override
    public void r() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8695c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f8694b;
        boolean z10 = notificationsSettings.getBoolean(f0.i(j3, profileActivity.f34248g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(f0.i(j3, profileActivity.f34248g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (yc.a(profileActivity)) {
            yc.S(z10 ? 1 : 0, profileActivity, profileActivity.f34376z0).j();
        }
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.f8695c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.f8695c).readFully(bArr, i10, i11);
    }

    @Override
    public boolean s(int i10, boolean z10) {
        return ((c3.p) this.f8695c).s(i10, true);
    }

    @Override
    public int skip(int i10) {
        return ((c3.p) this.f8695c).skip(i10);
    }

    @Override
    public void t(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f8695c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f8694b, profileActivity.f34248g1)) {
                k();
            }
            if (yc.a(profileActivity)) {
                yc.z(profileActivity, 4, i10, profileActivity.f34376z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f8694b, profileActivity.f34248g1, i10);
        if (yc.a(profileActivity)) {
            yc.z(profileActivity, 5, i10, profileActivity.f34376z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public String toString() {
        switch (this.f8693a) {
            case 6:
                if (((n) this.f8695c) == null) {
                    return Long.toBinaryString(this.f8694b);
                }
                return ((n) this.f8695c).toString() + "xx" + Long.toBinaryString(this.f8694b);
            default:
                return super.toString();
        }
    }

    public void u(int i10) {
        if (i10 >= 64) {
            n nVar = (n) this.f8695c;
            if (nVar != null) {
                nVar.u(i10 - 64);
                return;
            }
            return;
        }
        this.f8694b &= ~(1 << i10);
    }

    public int v(int i10) {
        n nVar = (n) this.f8695c;
        if (nVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f8694b);
            }
            return Long.bitCount(this.f8694b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f8694b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f8694b) + nVar.v(i10 - 64);
        }
    }

    public void w() {
        if (((n) this.f8695c) == null) {
            this.f8695c = new n(6);
        }
    }

    public void x(yc.a aVar) {
        this.f8694b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f8694b + ")");
        ((List) this.f8695c).add(aVar);
        thread.start();
    }

    public boolean y(int i10) {
        if (i10 >= 64) {
            w();
            return ((n) this.f8695c).y(i10 - 64);
        } else if ((this.f8694b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void z(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            w();
            ((n) this.f8695c).z(i10 - 64, z10);
            return;
        }
        long j3 = this.f8694b;
        if ((Long.MIN_VALUE & j3) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f8694b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            C(i10);
        } else {
            u(i10);
        }
        if (!z11 && ((n) this.f8695c) == null) {
            return;
        }
        w();
        ((n) this.f8695c).z(0, z11);
    }

    public n(Object obj, long j3, int i10) {
        this.f8693a = i10;
        this.f8695c = obj;
        this.f8694b = j3;
    }

    public n(c3.p pVar, long j3) {
        this.f8693a = 2;
        this.f8695c = pVar;
        e2.d.b(pVar.getPosition() >= j3);
        this.f8694b = j3;
    }

    public n(int i10) {
        this.f8693a = i10;
        switch (i10) {
            case 9:
                this.f8695c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f8694b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
