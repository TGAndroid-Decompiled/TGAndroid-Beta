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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n11;
import v7.a9;
public final class n implements OnFailureListener, c3.p, c3.q, l2.h, po {
    public final int f8012a;
    public long f8013b;
    public Object f8014c;

    public n(long j3, Object obj, int i10) {
        this.f8012a = i10;
        this.f8013b = j3;
        this.f8014c = obj;
    }

    @Override
    public long A(long j3, long j10) {
        return ((c3.j) this.f8014c).f3768a;
    }

    public void B() {
        if (((n) this.f8014c) == null) {
            this.f8014c = new n(6);
        }
    }

    public void C(yc.a aVar) {
        this.f8013b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f8013b + ")");
        ((List) this.f8014c).add(aVar);
        thread.start();
    }

    public boolean D(int i10) {
        if (i10 >= 64) {
            B();
            return ((n) this.f8014c).D(i10 - 64);
        } else if ((this.f8013b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void E(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            B();
            ((n) this.f8014c).E(i10 - 64, z10);
            return;
        }
        long j3 = this.f8013b;
        if ((Long.MIN_VALUE & j3) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f8013b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            H(i10);
        } else {
            v(i10);
        }
        if (!z11 && ((n) this.f8014c) == null) {
            return;
        }
        B();
        ((n) this.f8014c).E(0, z11);
    }

    public boolean F(int i10) {
        boolean z10;
        if (i10 >= 64) {
            B();
            return ((n) this.f8014c).F(i10 - 64);
        }
        long j3 = 1 << i10;
        long j10 = this.f8013b;
        if ((j10 & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j3);
        this.f8013b = j11;
        long j12 = j3 - 1;
        this.f8013b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        n nVar = (n) this.f8014c;
        if (nVar != null) {
            if (nVar.D(0)) {
                H(63);
            }
            ((n) this.f8014c).F(0);
        }
        return z10;
    }

    public void G() {
        this.f8013b = 0L;
        n nVar = (n) this.f8014c;
        if (nVar != null) {
            nVar.G();
        }
    }

    public void H(int i10) {
        if (i10 >= 64) {
            B();
            ((n) this.f8014c).H(i10 - 64);
            return;
        }
        this.f8013b |= 1 << i10;
    }

    @Override
    public void X1(b0 b0Var) {
        ((c3.q) this.f8014c).X1(new k3.d(this, b0Var, b0Var));
    }

    @Override
    public h0 Z1(int i10, int i11) {
        return ((c3.q) this.f8014c).Z1(i10, i11);
    }

    @Override
    public void a(int i10, int i11, byte[] bArr) {
        ((c3.p) this.f8014c).a(i10, i11, bArr);
    }

    @Override
    public long b(long j3) {
        return ((c3.j) this.f8014c).e[(int) j3] - this.f8013b;
    }

    @Override
    public long c(long j3, long j10) {
        return ((c3.j) this.f8014c).d[(int) j3];
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8014c).d(bArr, 0, i11, z10);
    }

    @Override
    public int e(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.f8014c).e(i10, i11, bArr);
    }

    @Override
    public void e1() {
        ((c3.q) this.f8014c).e1();
    }

    @Override
    public long f(long j3, long j10) {
        return 0L;
    }

    @Override
    public boolean g(int i10, boolean z10) {
        return ((c3.p) this.f8014c).g(i10, true);
    }

    @Override
    public long getLength() {
        return ((c3.p) this.f8014c).getLength() - this.f8013b;
    }

    @Override
    public long getPosition() {
        return ((c3.p) this.f8014c).getPosition() - this.f8013b;
    }

    @Override
    public boolean h(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8014c).h(bArr, i10, i11, z10);
    }

    @Override
    public long i() {
        return ((c3.p) this.f8014c).i() - this.f8013b;
    }

    @Override
    public long j(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public m2.j k(long j3) {
        c3.j jVar = (c3.j) this.f8014c;
        int i10 = (int) j3;
        return new m2.j(jVar.f3770c[i10], jVar.f3769b[i10], null);
    }

    @Override
    public void l(int i10) {
        ((c3.p) this.f8014c).l(i10);
    }

    @Override
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f8013b);
        ?? m2Var = new m2(bundle);
        m2Var.d = new ArrayList();
        m2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f8014c;
        m2Var.e = profileActivity.f31567h5;
        profileActivity.presentFragment((m2) m2Var);
    }

    @Override
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8014c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f8013b, profileActivity.f31556g1);
        profileActivity.getNotificationsController().muteDialog(this.f8013b, profileActivity.f31556g1, z10);
        if (profileActivity.fragmentView != null) {
            yc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8014c;
        long j3 = this.f8013b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f31556g1);
            profileActivity.presentFragment(new n11(bundle, profileActivity.f31684z0));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f8012a) {
            case 0:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j3 = this.f8013b;
                for (g6.o oVar : ((h) ((aa.a) this.f8014c).d).f7998c.d) {
                    oVar.b(j3, i10, null);
                }
                return;
            case 7:
                ((a9) this.f8014c).f44182b.set(this.f8013b);
                return;
            case 8:
                ((AtomicLong) ((o0.a) this.f8014c).f15468c).set(this.f8013b);
                return;
            default:
                ((a9) this.f8014c).f44182b.set(this.f8013b);
                return;
        }
    }

    @Override
    public void p() {
        ((c3.p) this.f8014c).p();
    }

    @Override
    public void q(int i10) {
        ((c3.p) this.f8014c).q(i10);
    }

    @Override
    public void r() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8014c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f8013b;
        boolean z10 = notificationsSettings.getBoolean(f0.i(j3, profileActivity.f31556g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(f0.i(j3, profileActivity.f31556g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (yc.a(profileActivity)) {
            yc.S(z10 ? 1 : 0, profileActivity, profileActivity.f31684z0).j();
        }
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.f8014c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.f8014c).readFully(bArr, i10, i11);
    }

    @Override
    public long s(long j3, long j10) {
        return d0.e(((c3.j) this.f8014c).e, j3 + this.f8013b, true);
    }

    @Override
    public int skip(int i10) {
        return ((c3.p) this.f8014c).skip(i10);
    }

    @Override
    public boolean t(int i10, boolean z10) {
        return ((c3.p) this.f8014c).t(i10, true);
    }

    public String toString() {
        switch (this.f8012a) {
            case 6:
                if (((n) this.f8014c) == null) {
                    return Long.toBinaryString(this.f8013b);
                }
                return ((n) this.f8014c).toString() + "xx" + Long.toBinaryString(this.f8013b);
            default:
                return super.toString();
        }
    }

    @Override
    public void u(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f8014c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f8013b, profileActivity.f31556g1)) {
                n();
            }
            if (yc.a(profileActivity)) {
                yc.z(profileActivity, 4, i10, profileActivity.f31684z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f8013b, profileActivity.f31556g1, i10);
        if (yc.a(profileActivity)) {
            yc.z(profileActivity, 5, i10, profileActivity.f31684z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public void v(int i10) {
        if (i10 >= 64) {
            n nVar = (n) this.f8014c;
            if (nVar != null) {
                nVar.v(i10 - 64);
                return;
            }
            return;
        }
        this.f8013b &= ~(1 << i10);
    }

    @Override
    public boolean w() {
        return true;
    }

    public int x(int i10) {
        n nVar = (n) this.f8014c;
        if (nVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f8013b);
            }
            return Long.bitCount(this.f8013b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f8013b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f8013b) + nVar.x(i10 - 64);
        }
    }

    @Override
    public long y() {
        return 0L;
    }

    @Override
    public long z(long j3) {
        return ((c3.j) this.f8014c).f3768a;
    }

    public n(Object obj, long j3, int i10) {
        this.f8012a = i10;
        this.f8014c = obj;
        this.f8013b = j3;
    }

    public n(c3.p pVar, long j3) {
        this.f8012a = 2;
        this.f8014c = pVar;
        e2.d.b(pVar.getPosition() >= j3);
        this.f8013b = j3;
    }

    public n(int i10) {
        this.f8012a = i10;
        switch (i10) {
            case 9:
                this.f8014c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f8013b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
