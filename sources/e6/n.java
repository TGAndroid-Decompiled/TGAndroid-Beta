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
import org.telegram.messenger.l0;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.w11;
import v7.a9;
import x7.d7;
public final class n implements OnFailureListener, c3.p, c3.q, l2.h, oo {
    public final int f8029a;
    public long f8030b;
    public Object f8031c;

    public n(long j3, Object obj, int i10) {
        this.f8029a = i10;
        this.f8030b = j3;
        this.f8031c = obj;
    }

    public void A(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            x();
            ((n) this.f8031c).A(i10 - 64, z10);
            return;
        }
        long j3 = this.f8030b;
        if ((Long.MIN_VALUE & j3) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f8030b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            D(i10);
        } else {
            v(i10);
        }
        if (!z11 && ((n) this.f8031c) == null) {
            return;
        }
        x();
        ((n) this.f8031c).A(0, z11);
    }

    public boolean B(int i10) {
        boolean z10;
        if (i10 >= 64) {
            x();
            return ((n) this.f8031c).B(i10 - 64);
        }
        long j3 = 1 << i10;
        long j10 = this.f8030b;
        if ((j10 & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j3);
        this.f8030b = j11;
        long j12 = j3 - 1;
        this.f8030b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        n nVar = (n) this.f8031c;
        if (nVar != null) {
            if (nVar.z(0)) {
                D(63);
            }
            ((n) this.f8031c).B(0);
        }
        return z10;
    }

    public void C() {
        this.f8030b = 0L;
        n nVar = (n) this.f8031c;
        if (nVar != null) {
            nVar.C();
        }
    }

    public void D(int i10) {
        if (i10 >= 64) {
            x();
            ((n) this.f8031c).D(i10 - 64);
            return;
        }
        this.f8030b |= 1 << i10;
    }

    @Override
    public boolean F() {
        return true;
    }

    @Override
    public long M() {
        return 0L;
    }

    @Override
    public long P(long j3) {
        return ((c3.j) this.f8031c).f3775a;
    }

    @Override
    public long Q(long j3, long j10) {
        return ((c3.j) this.f8031c).f3775a;
    }

    @Override
    public void X1(b0 b0Var) {
        ((c3.q) this.f8031c).X1(new k3.d(this, b0Var, b0Var));
    }

    @Override
    public h0 Z1(int i10, int i11) {
        return ((c3.q) this.f8031c).Z1(i10, i11);
    }

    @Override
    public void a(int i10, int i11, byte[] bArr) {
        ((c3.p) this.f8031c).a(i10, i11, bArr);
    }

    @Override
    public long b(long j3) {
        return ((c3.j) this.f8031c).e[(int) j3] - this.f8030b;
    }

    @Override
    public long c(long j3, long j10) {
        return ((c3.j) this.f8031c).d[(int) j3];
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8031c).d(bArr, 0, i11, z10);
    }

    @Override
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override
    public int f(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.f8031c).f(i10, i11, bArr);
    }

    @Override
    public void f1() {
        ((c3.q) this.f8031c).f1();
    }

    @Override
    public boolean g(int i10, boolean z10) {
        return ((c3.p) this.f8031c).g(i10, true);
    }

    @Override
    public long getLength() {
        return ((c3.p) this.f8031c).getLength() - this.f8030b;
    }

    @Override
    public long getPosition() {
        return ((c3.p) this.f8031c).getPosition() - this.f8030b;
    }

    @Override
    public boolean h(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8031c).h(bArr, i10, i11, z10);
    }

    @Override
    public long i() {
        return ((c3.p) this.f8031c).i() - this.f8030b;
    }

    @Override
    public void j(int i10) {
        ((c3.p) this.f8031c).j(i10);
    }

    @Override
    public void k() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f8030b);
        ?? n2Var = new n2(bundle);
        n2Var.d = new ArrayList();
        n2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f8031c;
        n2Var.e = profileActivity.f31600h5;
        profileActivity.presentFragment((n2) n2Var);
    }

    @Override
    public long l(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public m2.j m(long j3) {
        c3.j jVar = (c3.j) this.f8031c;
        int i10 = (int) j3;
        return new m2.j(jVar.f3777c[i10], jVar.f3776b[i10], null);
    }

    @Override
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8031c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f8030b, profileActivity.f31589g1);
        profileActivity.getNotificationsController().muteDialog(this.f8030b, profileActivity.f31589g1, z10);
        if (profileActivity.fragmentView != null) {
            xc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8031c;
        long j3 = this.f8030b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f31589g1);
            profileActivity.presentFragment(new w11(bundle, profileActivity.f31717z0));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f8029a) {
            case 0:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j3 = this.f8030b;
                for (g6.o oVar : ((h) ((aa.a) this.f8031c).d).f8015c.d) {
                    oVar.b(j3, i10, null);
                }
                return;
            case 7:
                ((a9) this.f8031c).f44234b.set(this.f8030b);
                return;
            case 8:
                ((AtomicLong) ((d7) this.f8031c).f45703b).set(this.f8030b);
                return;
            default:
                ((a9) this.f8031c).f44234b.set(this.f8030b);
                return;
        }
    }

    @Override
    public void p() {
        ((c3.p) this.f8031c).p();
    }

    @Override
    public void q(int i10) {
        ((c3.p) this.f8031c).q(i10);
    }

    @Override
    public void r() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8031c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f8030b;
        boolean z10 = notificationsSettings.getBoolean(l0.h(j3, profileActivity.f31589g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(l0.h(j3, profileActivity.f31589g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (xc.a(profileActivity)) {
            xc.S(z10 ? 1 : 0, profileActivity, profileActivity.f31717z0).j();
        }
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.f8031c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.f8031c).readFully(bArr, i10, i11);
    }

    @Override
    public boolean s(int i10, boolean z10) {
        return ((c3.p) this.f8031c).s(i10, true);
    }

    @Override
    public int skip(int i10) {
        return ((c3.p) this.f8031c).skip(i10);
    }

    @Override
    public long t(long j3, long j10) {
        return d0.e(((c3.j) this.f8031c).e, j3 + this.f8030b, true);
    }

    public String toString() {
        switch (this.f8029a) {
            case 6:
                if (((n) this.f8031c) == null) {
                    return Long.toBinaryString(this.f8030b);
                }
                return ((n) this.f8031c).toString() + "xx" + Long.toBinaryString(this.f8030b);
            default:
                return super.toString();
        }
    }

    @Override
    public void u(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f8031c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f8030b, profileActivity.f31589g1)) {
                n();
            }
            if (xc.a(profileActivity)) {
                xc.z(profileActivity, 4, i10, profileActivity.f31717z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f8030b, profileActivity.f31589g1, i10);
        if (xc.a(profileActivity)) {
            xc.z(profileActivity, 5, i10, profileActivity.f31717z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public void v(int i10) {
        if (i10 >= 64) {
            n nVar = (n) this.f8031c;
            if (nVar != null) {
                nVar.v(i10 - 64);
                return;
            }
            return;
        }
        this.f8030b &= ~(1 << i10);
    }

    public int w(int i10) {
        n nVar = (n) this.f8031c;
        if (nVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f8030b);
            }
            return Long.bitCount(this.f8030b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f8030b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f8030b) + nVar.w(i10 - 64);
        }
    }

    public void x() {
        if (((n) this.f8031c) == null) {
            this.f8031c = new n(6);
        }
    }

    public void y(yc.a aVar) {
        this.f8030b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f8030b + ")");
        ((List) this.f8031c).add(aVar);
        thread.start();
    }

    public boolean z(int i10) {
        if (i10 >= 64) {
            x();
            return ((n) this.f8031c).z(i10 - 64);
        } else if ((this.f8030b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public n(Object obj, long j3, int i10) {
        this.f8029a = i10;
        this.f8031c = obj;
        this.f8030b = j3;
    }

    public n(c3.p pVar, long j3) {
        this.f8029a = 2;
        this.f8031c = pVar;
        e2.d.b(pVar.getPosition() >= j3);
        this.f8030b = j3;
    }

    public n(int i10) {
        this.f8029a = i10;
        switch (i10) {
            case 9:
                this.f8031c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f8030b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
