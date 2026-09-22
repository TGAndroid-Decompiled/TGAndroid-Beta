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
import org.telegram.messenger.y0;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.vc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.x11;
import v7.z8;
public final class n implements OnFailureListener, c3.p, c3.q, l2.h, oo {
    public final int f8027a;
    public long f8028b;
    public Object f8029c;

    public n(long j3, Object obj, int i10) {
        this.f8027a = i10;
        this.f8028b = j3;
        this.f8029c = obj;
    }

    public void A(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            x();
            ((n) this.f8029c).A(i10 - 64, z10);
            return;
        }
        long j3 = this.f8028b;
        if ((Long.MIN_VALUE & j3) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f8028b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            D(i10);
        } else {
            u(i10);
        }
        if (!z11 && ((n) this.f8029c) == null) {
            return;
        }
        x();
        ((n) this.f8029c).A(0, z11);
    }

    public boolean B(int i10) {
        boolean z10;
        if (i10 >= 64) {
            x();
            return ((n) this.f8029c).B(i10 - 64);
        }
        long j3 = 1 << i10;
        long j10 = this.f8028b;
        if ((j10 & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j3);
        this.f8028b = j11;
        long j12 = j3 - 1;
        this.f8028b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        n nVar = (n) this.f8029c;
        if (nVar != null) {
            if (nVar.z(0)) {
                D(63);
            }
            ((n) this.f8029c).B(0);
        }
        return z10;
    }

    public void C() {
        this.f8028b = 0L;
        n nVar = (n) this.f8029c;
        if (nVar != null) {
            nVar.C();
        }
    }

    public void D(int i10) {
        if (i10 >= 64) {
            x();
            ((n) this.f8029c).D(i10 - 64);
            return;
        }
        this.f8028b |= 1 << i10;
    }

    @Override
    public boolean H() {
        return true;
    }

    @Override
    public long M() {
        return 0L;
    }

    @Override
    public long P(long j3) {
        return ((c3.j) this.f8029c).f3773a;
    }

    @Override
    public long S(long j3, long j10) {
        return ((c3.j) this.f8029c).f3773a;
    }

    @Override
    public void X1(b0 b0Var) {
        ((c3.q) this.f8029c).X1(new k3.d(this, b0Var, b0Var));
    }

    @Override
    public h0 Z1(int i10, int i11) {
        return ((c3.q) this.f8029c).Z1(i10, i11);
    }

    @Override
    public void a(int i10, int i11, byte[] bArr) {
        ((c3.p) this.f8029c).a(i10, i11, bArr);
    }

    @Override
    public long b(long j3) {
        return ((c3.j) this.f8029c).e[(int) j3] - this.f8028b;
    }

    @Override
    public long c(long j3, long j10) {
        return ((c3.j) this.f8029c).d[(int) j3];
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8029c).d(bArr, 0, i11, z10);
    }

    @Override
    public int e(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.f8029c).e(i10, i11, bArr);
    }

    @Override
    public void e1() {
        ((c3.q) this.f8029c).e1();
    }

    @Override
    public long f(long j3, long j10) {
        return 0L;
    }

    @Override
    public boolean g(int i10, boolean z10) {
        return ((c3.p) this.f8029c).g(i10, true);
    }

    @Override
    public long getLength() {
        return ((c3.p) this.f8029c).getLength() - this.f8028b;
    }

    @Override
    public long getPosition() {
        return ((c3.p) this.f8029c).getPosition() - this.f8028b;
    }

    @Override
    public boolean h(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8029c).h(bArr, i10, i11, z10);
    }

    @Override
    public long i() {
        return ((c3.p) this.f8029c).i() - this.f8028b;
    }

    @Override
    public long j(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public void k(int i10) {
        ((c3.p) this.f8029c).k(i10);
    }

    @Override
    public void l() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f8028b);
        ?? n2Var = new n2(bundle);
        n2Var.d = new ArrayList();
        n2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f8029c;
        n2Var.e = profileActivity.f31292h5;
        profileActivity.presentFragment((n2) n2Var);
    }

    @Override
    public m2.j m(long j3) {
        c3.j jVar = (c3.j) this.f8029c;
        int i10 = (int) j3;
        return new m2.j(jVar.f3775c[i10], jVar.f3774b[i10], null);
    }

    @Override
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8029c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f8028b, profileActivity.f31281g1);
        profileActivity.getNotificationsController().muteDialog(this.f8028b, profileActivity.f31281g1, z10);
        if (profileActivity.fragmentView != null) {
            vc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8029c;
        long j3 = this.f8028b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f31281g1);
            profileActivity.presentFragment(new x11(bundle, profileActivity.f31409z0));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f8027a) {
            case 0:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j3 = this.f8028b;
                for (g6.o oVar : ((h) ((aa.a) this.f8029c).d).f8013c.d) {
                    oVar.b(j3, i10, null);
                }
                return;
            case 7:
                ((z8) this.f8029c).f44198b.set(this.f8028b);
                return;
            case 8:
                ((AtomicLong) ((o0.a) this.f8029c).f15299c).set(this.f8028b);
                return;
            default:
                ((z8) this.f8029c).f44198b.set(this.f8028b);
                return;
        }
    }

    @Override
    public void p() {
        ((c3.p) this.f8029c).p();
    }

    @Override
    public void q(int i10) {
        ((c3.p) this.f8029c).q(i10);
    }

    @Override
    public void r() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8029c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f8028b;
        boolean z10 = notificationsSettings.getBoolean(y0.i(j3, profileActivity.f31281g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(y0.i(j3, profileActivity.f31281g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (vc.a(profileActivity)) {
            vc.S(z10 ? 1 : 0, profileActivity, profileActivity.f31409z0).j();
        }
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.f8029c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.f8029c).readFully(bArr, i10, i11);
    }

    @Override
    public boolean s(int i10, boolean z10) {
        return ((c3.p) this.f8029c).s(i10, true);
    }

    @Override
    public int skip(int i10) {
        return ((c3.p) this.f8029c).skip(i10);
    }

    @Override
    public void t(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f8029c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f8028b, profileActivity.f31281g1)) {
                n();
            }
            if (vc.a(profileActivity)) {
                vc.z(profileActivity, 4, i10, profileActivity.f31409z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f8028b, profileActivity.f31281g1, i10);
        if (vc.a(profileActivity)) {
            vc.z(profileActivity, 5, i10, profileActivity.f31409z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public String toString() {
        switch (this.f8027a) {
            case 6:
                if (((n) this.f8029c) == null) {
                    return Long.toBinaryString(this.f8028b);
                }
                return ((n) this.f8029c).toString() + "xx" + Long.toBinaryString(this.f8028b);
            default:
                return super.toString();
        }
    }

    public void u(int i10) {
        if (i10 >= 64) {
            n nVar = (n) this.f8029c;
            if (nVar != null) {
                nVar.u(i10 - 64);
                return;
            }
            return;
        }
        this.f8028b &= ~(1 << i10);
    }

    @Override
    public long v(long j3, long j10) {
        return d0.e(((c3.j) this.f8029c).e, j3 + this.f8028b, true);
    }

    public int w(int i10) {
        n nVar = (n) this.f8029c;
        if (nVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f8028b);
            }
            return Long.bitCount(this.f8028b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f8028b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f8028b) + nVar.w(i10 - 64);
        }
    }

    public void x() {
        if (((n) this.f8029c) == null) {
            this.f8029c = new n(6);
        }
    }

    public void y(yc.a aVar) {
        this.f8028b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f8028b + ")");
        ((List) this.f8029c).add(aVar);
        thread.start();
    }

    public boolean z(int i10) {
        if (i10 >= 64) {
            x();
            return ((n) this.f8029c).z(i10 - 64);
        } else if ((this.f8028b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public n(Object obj, long j3, int i10) {
        this.f8027a = i10;
        this.f8029c = obj;
        this.f8028b = j3;
    }

    public n(c3.p pVar, long j3) {
        this.f8027a = 2;
        this.f8029c = pVar;
        e2.d.b(pVar.getPosition() >= j3);
        this.f8028b = j3;
    }

    public n(int i10) {
        this.f8027a = i10;
        switch (i10) {
            case 9:
                this.f8029c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f8028b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
