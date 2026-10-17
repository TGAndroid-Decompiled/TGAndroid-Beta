package ad;

import android.content.SharedPreferences;
import android.os.Bundle;
import c3.c0;
import c3.h0;
import c3.j0;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yo;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b11;
import v7.u6;
import v7.z8;
import z7.ra;
public final class d implements p, q, OnFailureListener, l2.i, yo {
    public final int f504a;
    public long f505b;
    public Object f506c;

    public d(long j10, Object obj, int i10) {
        this.f504a = i10;
        this.f505b = j10;
        this.f506c = obj;
    }

    public int A(int i10) {
        d dVar = (d) this.f506c;
        if (dVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f505b);
            }
            return Long.bitCount(this.f505b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f505b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f505b) + dVar.A(i10 - 64);
        }
    }

    public void B() {
        if (((d) this.f506c) == null) {
            this.f506c = new d(7);
        }
    }

    public void C(a aVar) {
        this.f505b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f505b + ")");
        ((List) this.f506c).add(aVar);
        thread.start();
    }

    public boolean D(int i10) {
        if (i10 >= 64) {
            B();
            return ((d) this.f506c).D(i10 - 64);
        } else if ((this.f505b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void E(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            B();
            ((d) this.f506c).E(i10 - 64, z10);
            return;
        }
        long j10 = this.f505b;
        if ((Long.MIN_VALUE & j10) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j11 = (1 << i10) - 1;
        this.f505b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            I(i10);
        } else {
            z(i10);
        }
        if (!z11 && ((d) this.f506c) == null) {
            return;
        }
        B();
        ((d) this.f506c).E(0, z11);
    }

    public boolean F(int i10) {
        boolean z10;
        if (i10 >= 64) {
            B();
            return ((d) this.f506c).F(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f505b;
        if ((j11 & j10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = j11 & (~j10);
        this.f505b = j12;
        long j13 = j10 - 1;
        this.f505b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        d dVar = (d) this.f506c;
        if (dVar != null) {
            if (dVar.D(0)) {
                I(63);
            }
            ((d) this.f506c).F(0);
        }
        return z10;
    }

    public void G() {
        this.f505b = 0L;
        d dVar = (d) this.f506c;
        if (dVar != null) {
            dVar.G();
        }
    }

    @Override
    public void H() {
        ((q) this.f506c).H();
    }

    public void I(int i10) {
        if (i10 >= 64) {
            B();
            ((d) this.f506c).I(i10 - 64);
            return;
        }
        this.f505b |= 1 << i10;
    }

    @Override
    public long a(long j10) {
        return ((c3.j) this.f506c).e[(int) j10] - this.f505b;
    }

    @Override
    public void b(int i10, int i11, byte[] bArr) {
        ((p) this.f506c).b(i10, i11, bArr);
    }

    @Override
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return ((p) this.f506c).c(bArr, 0, i11, z10);
    }

    @Override
    public long d(long j10, long j11) {
        return ((c3.j) this.f506c).d[(int) j10];
    }

    @Override
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override
    public long f(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public m2.j g(long j10) {
        c3.j jVar = (c3.j) this.f506c;
        int i10 = (int) j10;
        return new m2.j(jVar.f4633c[i10], jVar.f4632b[i10], null);
    }

    @Override
    public void g0(c0 c0Var) {
        ((q) this.f506c).g0(new h0(this, c0Var, c0Var));
    }

    @Override
    public long getLength() {
        return ((p) this.f506c).getLength() - this.f505b;
    }

    @Override
    public long getPosition() {
        return ((p) this.f506c).getPosition() - this.f505b;
    }

    @Override
    public int h(int i10, int i11, byte[] bArr) {
        return ((p) this.f506c).h(i10, i11, bArr);
    }

    @Override
    public boolean i(int i10, boolean z10) {
        return ((p) this.f506c).i(i10, true);
    }

    @Override
    public boolean j(byte[] bArr, int i10, int i11, boolean z10) {
        return ((p) this.f506c).j(bArr, i10, i11, z10);
    }

    @Override
    public j0 j0(int i10, int i11) {
        return ((q) this.f506c).j0(i10, i11);
    }

    @Override
    public long k() {
        return ((p) this.f506c).k() - this.f505b;
    }

    @Override
    public void l(int i10) {
        ((p) this.f506c).l(i10);
    }

    @Override
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f505b);
        ?? n2Var = new n2(bundle);
        n2Var.d = new ArrayList();
        n2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f506c;
        n2Var.e = profileActivity.f33639j5;
        profileActivity.presentFragment((n2) n2Var);
    }

    @Override
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.f506c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f505b, profileActivity.f33621h1);
        profileActivity.getNotificationsController().muteDialog(this.f505b, profileActivity.f33621h1, z10);
        if (profileActivity.fragmentView != null) {
            xc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public long o(long j10, long j11) {
        return m0.f(((c3.j) this.f506c).e, j10 + this.f505b, true);
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f504a) {
            case 3:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j10 = this.f505b;
                for (o oVar : ((e6.h) ((androidx.biometric.e) this.f506c).d).f8373c.d) {
                    oVar.b(j10, i10, null);
                }
                return;
            case 8:
                ((z8) this.f506c).f48266b.set(this.f505b);
                return;
            case 9:
                ((z8) this.f506c).f48266b.set(this.f505b);
                return;
            default:
                ((AtomicLong) ((ra) this.f506c).f51174b).set(this.f505b);
                return;
        }
    }

    @Override
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.f506c;
        long j10 = this.f505b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f33621h1);
            profileActivity.presentFragment(new b11(bundle, profileActivity.A0));
        }
    }

    @Override
    public void q() {
        ((p) this.f506c).q();
    }

    @Override
    public void r(int i10) {
        ((p) this.f506c).r(i10);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((p) this.f506c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((p) this.f506c).readFully(bArr, i10, i11);
    }

    @Override
    public boolean s() {
        return true;
    }

    @Override
    public int skip(int i10) {
        return ((p) this.f506c).skip(i10);
    }

    @Override
    public void t() {
        ProfileActivity profileActivity = (ProfileActivity) this.f506c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.f505b;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.q.i(j10, profileActivity.f33621h1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.q.i(j10, profileActivity.f33621h1, new StringBuilder("sound_enabled_")), z11).apply();
        if (xc.a(profileActivity)) {
            xc.S(z10 ? 1 : 0, profileActivity, profileActivity.A0).j();
        }
    }

    public String toString() {
        switch (this.f504a) {
            case 7:
                if (((d) this.f506c) == null) {
                    return Long.toBinaryString(this.f505b);
                }
                return ((d) this.f506c).toString() + "xx" + Long.toBinaryString(this.f505b);
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
        return ((p) this.f506c).v(i10, true);
    }

    @Override
    public long w(long j10) {
        return ((c3.j) this.f506c).f4631a;
    }

    @Override
    public long x(long j10, long j11) {
        return ((c3.j) this.f506c).f4631a;
    }

    @Override
    public void y(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f506c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f505b, profileActivity.f33621h1)) {
                n();
            }
            if (xc.a(profileActivity)) {
                xc.z(profileActivity, 4, i10, profileActivity.A0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f505b, profileActivity.f33621h1, i10);
        if (xc.a(profileActivity)) {
            xc.z(profileActivity, 5, i10, profileActivity.A0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public void z(int i10) {
        if (i10 >= 64) {
            d dVar = (d) this.f506c;
            if (dVar != null) {
                dVar.z(i10 - 64);
                return;
            }
            return;
        }
        this.f505b &= ~(1 << i10);
    }

    public d(Object obj, long j10, int i10) {
        this.f504a = i10;
        this.f506c = obj;
        this.f505b = j10;
    }

    public d(p pVar, long j10) {
        this.f504a = 1;
        this.f506c = pVar;
        u6.g(pVar.getPosition() >= j10);
        this.f505b = j10;
    }

    public d(int i10) {
        this.f504a = i10;
        switch (i10) {
            case 7:
                this.f505b = 0L;
                return;
            default:
                this.f506c = DesugarCollections.synchronizedList(new ArrayList());
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
