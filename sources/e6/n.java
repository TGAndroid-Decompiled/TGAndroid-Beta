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
    public final int f8030a;
    public long f8031b;
    public Object f8032c;

    public n(long j3, Object obj, int i10) {
        this.f8030a = i10;
        this.f8031b = j3;
        this.f8032c = obj;
    }

    public void A() {
        if (((n) this.f8032c) == null) {
            this.f8032c = new n(6);
        }
    }

    public void B(yc.a aVar) {
        this.f8031b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f8031b + ")");
        ((List) this.f8032c).add(aVar);
        thread.start();
    }

    public boolean C(int i10) {
        if (i10 >= 64) {
            A();
            return ((n) this.f8032c).C(i10 - 64);
        } else if ((this.f8031b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void D(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            A();
            ((n) this.f8032c).D(i10 - 64, z10);
            return;
        }
        long j3 = this.f8031b;
        if ((Long.MIN_VALUE & j3) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f8031b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            H(i10);
        } else {
            x(i10);
        }
        if (!z11 && ((n) this.f8032c) == null) {
            return;
        }
        A();
        ((n) this.f8032c).D(0, z11);
    }

    @Override
    public long E(long j3, long j10) {
        return ((c3.j) this.f8032c).f3776a;
    }

    public boolean F(int i10) {
        boolean z10;
        if (i10 >= 64) {
            A();
            return ((n) this.f8032c).F(i10 - 64);
        }
        long j3 = 1 << i10;
        long j10 = this.f8031b;
        if ((j10 & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j3);
        this.f8031b = j11;
        long j12 = j3 - 1;
        this.f8031b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        n nVar = (n) this.f8032c;
        if (nVar != null) {
            if (nVar.C(0)) {
                H(63);
            }
            ((n) this.f8032c).F(0);
        }
        return z10;
    }

    public void G() {
        this.f8031b = 0L;
        n nVar = (n) this.f8032c;
        if (nVar != null) {
            nVar.G();
        }
    }

    public void H(int i10) {
        if (i10 >= 64) {
            A();
            ((n) this.f8032c).H(i10 - 64);
            return;
        }
        this.f8031b |= 1 << i10;
    }

    @Override
    public void X1(b0 b0Var) {
        ((c3.q) this.f8032c).X1(new k3.d(this, b0Var, b0Var));
    }

    @Override
    public h0 Z1(int i10, int i11) {
        return ((c3.q) this.f8032c).Z1(i10, i11);
    }

    @Override
    public void a(int i10, int i11, byte[] bArr) {
        ((c3.p) this.f8032c).a(i10, i11, bArr);
    }

    @Override
    public long b(long j3) {
        return ((c3.j) this.f8032c).e[(int) j3] - this.f8031b;
    }

    @Override
    public long c(long j3, long j10) {
        return ((c3.j) this.f8032c).d[(int) j3];
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8032c).d(bArr, 0, i11, z10);
    }

    @Override
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override
    public int f(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.f8032c).f(i10, i11, bArr);
    }

    @Override
    public void f1() {
        ((c3.q) this.f8032c).f1();
    }

    @Override
    public long g(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public long getLength() {
        return ((c3.p) this.f8032c).getLength() - this.f8031b;
    }

    @Override
    public long getPosition() {
        return ((c3.p) this.f8032c).getPosition() - this.f8031b;
    }

    @Override
    public boolean h(int i10, boolean z10) {
        return ((c3.p) this.f8032c).h(i10, true);
    }

    @Override
    public boolean i(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8032c).i(bArr, i10, i11, z10);
    }

    @Override
    public long j() {
        return ((c3.p) this.f8032c).j() - this.f8031b;
    }

    @Override
    public m2.j k(long j3) {
        c3.j jVar = (c3.j) this.f8032c;
        int i10 = (int) j3;
        return new m2.j(jVar.f3778c[i10], jVar.f3777b[i10], null);
    }

    @Override
    public void l(int i10) {
        ((c3.p) this.f8032c).l(i10);
    }

    @Override
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f8031b);
        ?? n2Var = new n2(bundle);
        n2Var.d = new ArrayList();
        n2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f8032c;
        n2Var.e = profileActivity.f31579h5;
        profileActivity.presentFragment((n2) n2Var);
    }

    @Override
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8032c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f8031b, profileActivity.f31568g1);
        profileActivity.getNotificationsController().muteDialog(this.f8031b, profileActivity.f31568g1, z10);
        if (profileActivity.fragmentView != null) {
            xc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8032c;
        long j3 = this.f8031b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f31568g1);
            profileActivity.presentFragment(new w11(bundle, profileActivity.f31696z0));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f8030a) {
            case 0:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j3 = this.f8031b;
                for (g6.o oVar : ((h) ((aa.a) this.f8032c).d).f8016c.d) {
                    oVar.b(j3, i10, null);
                }
                return;
            case 7:
                ((a9) this.f8032c).f44212b.set(this.f8031b);
                return;
            case 8:
                ((AtomicLong) ((d7) this.f8032c).f45682b).set(this.f8031b);
                return;
            default:
                ((a9) this.f8032c).f44212b.set(this.f8031b);
                return;
        }
    }

    @Override
    public void p() {
        ((c3.p) this.f8032c).p();
    }

    @Override
    public void q(int i10) {
        ((c3.p) this.f8032c).q(i10);
    }

    @Override
    public void r() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8032c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f8031b;
        boolean z10 = notificationsSettings.getBoolean(l0.h(j3, profileActivity.f31568g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(l0.h(j3, profileActivity.f31568g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (xc.a(profileActivity)) {
            xc.S(z10 ? 1 : 0, profileActivity, profileActivity.f31696z0).j();
        }
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.f8032c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.f8032c).readFully(bArr, i10, i11);
    }

    @Override
    public long s(long j3, long j10) {
        return d0.e(((c3.j) this.f8032c).e, j3 + this.f8031b, true);
    }

    @Override
    public int skip(int i10) {
        return ((c3.p) this.f8032c).skip(i10);
    }

    @Override
    public boolean t(int i10, boolean z10) {
        return ((c3.p) this.f8032c).t(i10, true);
    }

    public String toString() {
        switch (this.f8030a) {
            case 6:
                if (((n) this.f8032c) == null) {
                    return Long.toBinaryString(this.f8031b);
                }
                return ((n) this.f8032c).toString() + "xx" + Long.toBinaryString(this.f8031b);
            default:
                return super.toString();
        }
    }

    @Override
    public void u(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f8032c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f8031b, profileActivity.f31568g1)) {
                n();
            }
            if (xc.a(profileActivity)) {
                xc.z(profileActivity, 4, i10, profileActivity.f31696z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f8031b, profileActivity.f31568g1, i10);
        if (xc.a(profileActivity)) {
            xc.z(profileActivity, 5, i10, profileActivity.f31696z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public long w() {
        return 0L;
    }

    public void x(int i10) {
        if (i10 >= 64) {
            n nVar = (n) this.f8032c;
            if (nVar != null) {
                nVar.x(i10 - 64);
                return;
            }
            return;
        }
        this.f8031b &= ~(1 << i10);
    }

    public int y(int i10) {
        n nVar = (n) this.f8032c;
        if (nVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f8031b);
            }
            return Long.bitCount(this.f8031b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f8031b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f8031b) + nVar.y(i10 - 64);
        }
    }

    @Override
    public long z(long j3) {
        return ((c3.j) this.f8032c).f3776a;
    }

    public n(Object obj, long j3, int i10) {
        this.f8030a = i10;
        this.f8032c = obj;
        this.f8031b = j3;
    }

    public n(c3.p pVar, long j3) {
        this.f8030a = 2;
        this.f8032c = pVar;
        e2.d.b(pVar.getPosition() >= j3);
        this.f8031b = j3;
    }

    public n(int i10) {
        this.f8030a = i10;
        switch (i10) {
            case 9:
                this.f8032c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f8031b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
