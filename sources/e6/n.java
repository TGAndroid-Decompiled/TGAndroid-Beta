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
import org.telegram.messenger.w1;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.y11;
import v7.z8;
public final class n implements OnFailureListener, c3.p, c3.q, l2.h, no {
    public final int f8893a;
    public long f8894b;
    public Object f8895c;

    public n(long j3, Object obj, int i10) {
        this.f8893a = i10;
        this.f8894b = j3;
        this.f8895c = obj;
    }

    public int A(int i10) {
        n nVar = (n) this.f8895c;
        if (nVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f8894b);
            }
            return Long.bitCount(this.f8894b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f8894b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f8894b) + nVar.A(i10 - 64);
        }
    }

    public void B() {
        if (((n) this.f8895c) == null) {
            this.f8895c = new n(6);
        }
    }

    public void C(yc.a aVar) {
        this.f8894b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f8894b + ")");
        ((List) this.f8895c).add(aVar);
        thread.start();
    }

    public boolean D(int i10) {
        if (i10 >= 64) {
            B();
            return ((n) this.f8895c).D(i10 - 64);
        } else if ((this.f8894b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void E(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            B();
            ((n) this.f8895c).E(i10 - 64, z10);
            return;
        }
        long j3 = this.f8894b;
        if ((Long.MIN_VALUE & j3) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f8894b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            H(i10);
        } else {
            z(i10);
        }
        if (!z11 && ((n) this.f8895c) == null) {
            return;
        }
        B();
        ((n) this.f8895c).E(0, z11);
    }

    public boolean F(int i10) {
        boolean z10;
        if (i10 >= 64) {
            B();
            return ((n) this.f8895c).F(i10 - 64);
        }
        long j3 = 1 << i10;
        long j10 = this.f8894b;
        if ((j10 & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j3);
        this.f8894b = j11;
        long j12 = j3 - 1;
        this.f8894b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        n nVar = (n) this.f8895c;
        if (nVar != null) {
            if (nVar.D(0)) {
                H(63);
            }
            ((n) this.f8895c).F(0);
        }
        return z10;
    }

    public void G() {
        this.f8894b = 0L;
        n nVar = (n) this.f8895c;
        if (nVar != null) {
            nVar.G();
        }
    }

    public void H(int i10) {
        if (i10 >= 64) {
            B();
            ((n) this.f8895c).H(i10 - 64);
            return;
        }
        this.f8894b |= 1 << i10;
    }

    @Override
    public void P1(b0 b0Var) {
        ((c3.q) this.f8895c).P1(new k3.d(this, b0Var, b0Var));
    }

    @Override
    public h0 R1(int i10, int i11) {
        return ((c3.q) this.f8895c).R1(i10, i11);
    }

    @Override
    public void Z0() {
        ((c3.q) this.f8895c).Z0();
    }

    @Override
    public long a(long j3) {
        return ((c3.j) this.f8895c).f4273e[(int) j3] - this.f8894b;
    }

    @Override
    public void b(int i10, int i11, byte[] bArr) {
        ((c3.p) this.f8895c).b(i10, i11, bArr);
    }

    @Override
    public long c(long j3, long j10) {
        return ((c3.j) this.f8895c).d[(int) j3];
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8895c).d(bArr, 0, i11, z10);
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
    public m2.j g(long j3) {
        c3.j jVar = (c3.j) this.f8895c;
        int i10 = (int) j3;
        return new m2.j(jVar.f4272c[i10], jVar.f4271b[i10], null);
    }

    @Override
    public long getLength() {
        return ((c3.p) this.f8895c).getLength() - this.f8894b;
    }

    @Override
    public long getPosition() {
        return ((c3.p) this.f8895c).getPosition() - this.f8894b;
    }

    @Override
    public int h(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.f8895c).h(i10, i11, bArr);
    }

    @Override
    public boolean i(int i10, boolean z10) {
        return ((c3.p) this.f8895c).i(i10, true);
    }

    @Override
    public boolean j(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8895c).j(bArr, i10, i11, z10);
    }

    @Override
    public long k() {
        return ((c3.p) this.f8895c).k() - this.f8894b;
    }

    @Override
    public void l(int i10) {
        ((c3.p) this.f8895c).l(i10);
    }

    @Override
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f8894b);
        ?? n2Var = new n2(bundle);
        n2Var.d = new ArrayList();
        n2Var.f38066e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f8895c;
        n2Var.f38066e = profileActivity.f33914h5;
        profileActivity.presentFragment((n2) n2Var);
    }

    @Override
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8895c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f8894b, profileActivity.f33903g1);
        profileActivity.getNotificationsController().muteDialog(this.f8894b, profileActivity.f33903g1, z10);
        if (profileActivity.fragmentView != null) {
            yc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public long o(long j3, long j10) {
        return d0.e(((c3.j) this.f8895c).f4273e, j3 + this.f8894b, true);
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f8893a) {
            case 0:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j3 = this.f8894b;
                for (g6.o oVar : ((h) ((aa.a) this.f8895c).d).f8878c.d) {
                    oVar.b(j3, i10, null);
                }
                return;
            case 7:
                ((z8) this.f8895c).f47681b.set(this.f8894b);
                return;
            case 8:
                ((AtomicLong) ((o0.a) this.f8895c).f16770c).set(this.f8894b);
                return;
            default:
                ((z8) this.f8895c).f47681b.set(this.f8894b);
                return;
        }
    }

    @Override
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8895c;
        long j3 = this.f8894b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f33903g1);
            profileActivity.presentFragment(new y11(bundle, profileActivity.f34031z0));
        }
    }

    @Override
    public void q() {
        ((c3.p) this.f8895c).q();
    }

    @Override
    public void r(int i10) {
        ((c3.p) this.f8895c).r(i10);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.f8895c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.f8895c).readFully(bArr, i10, i11);
    }

    @Override
    public void s() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8895c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f8894b;
        boolean z10 = notificationsSettings.getBoolean(w1.i(j3, profileActivity.f33903g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(w1.i(j3, profileActivity.f33903g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (yc.a(profileActivity)) {
            yc.S(z10 ? 1 : 0, profileActivity, profileActivity.f34031z0).j();
        }
    }

    @Override
    public int skip(int i10) {
        return ((c3.p) this.f8895c).skip(i10);
    }

    @Override
    public boolean t() {
        return true;
    }

    public String toString() {
        switch (this.f8893a) {
            case 6:
                if (((n) this.f8895c) == null) {
                    return Long.toBinaryString(this.f8894b);
                }
                return ((n) this.f8895c).toString() + "xx" + Long.toBinaryString(this.f8894b);
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
        return ((c3.p) this.f8895c).v(i10, true);
    }

    @Override
    public long w(long j3) {
        return ((c3.j) this.f8895c).f4270a;
    }

    @Override
    public void x(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f8895c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f8894b, profileActivity.f33903g1)) {
                n();
            }
            if (yc.a(profileActivity)) {
                yc.z(profileActivity, 4, i10, profileActivity.f34031z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f8894b, profileActivity.f33903g1, i10);
        if (yc.a(profileActivity)) {
            yc.z(profileActivity, 5, i10, profileActivity.f34031z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public long y(long j3, long j10) {
        return ((c3.j) this.f8895c).f4270a;
    }

    public void z(int i10) {
        if (i10 >= 64) {
            n nVar = (n) this.f8895c;
            if (nVar != null) {
                nVar.z(i10 - 64);
                return;
            }
            return;
        }
        this.f8894b &= ~(1 << i10);
    }

    public n(Object obj, long j3, int i10) {
        this.f8893a = i10;
        this.f8895c = obj;
        this.f8894b = j3;
    }

    public n(c3.p pVar, long j3) {
        this.f8893a = 2;
        this.f8895c = pVar;
        e2.d.b(pVar.getPosition() >= j3);
        this.f8894b = j3;
    }

    public n(int i10) {
        this.f8893a = i10;
        switch (i10) {
            case 9:
                this.f8895c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f8894b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
