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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p11;
import v7.a9;
public final class n implements OnFailureListener, c3.p, c3.q, l2.h, qo {
    public final int f8014a;
    public long f8015b;
    public Object f8016c;

    public n(long j3, Object obj, int i10) {
        this.f8014a = i10;
        this.f8015b = j3;
        this.f8016c = obj;
    }

    @Override
    public long A(long j3, long j10) {
        return ((c3.j) this.f8016c).f3770a;
    }

    public void B() {
        if (((n) this.f8016c) == null) {
            this.f8016c = new n(6);
        }
    }

    public void C(yc.a aVar) {
        this.f8015b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f8015b + ")");
        ((List) this.f8016c).add(aVar);
        thread.start();
    }

    public boolean D(int i10) {
        if (i10 >= 64) {
            B();
            return ((n) this.f8016c).D(i10 - 64);
        } else if ((this.f8015b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void E(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            B();
            ((n) this.f8016c).E(i10 - 64, z10);
            return;
        }
        long j3 = this.f8015b;
        if ((Long.MIN_VALUE & j3) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f8015b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            H(i10);
        } else {
            x(i10);
        }
        if (!z11 && ((n) this.f8016c) == null) {
            return;
        }
        B();
        ((n) this.f8016c).E(0, z11);
    }

    public boolean F(int i10) {
        boolean z10;
        if (i10 >= 64) {
            B();
            return ((n) this.f8016c).F(i10 - 64);
        }
        long j3 = 1 << i10;
        long j10 = this.f8015b;
        if ((j10 & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j3);
        this.f8015b = j11;
        long j12 = j3 - 1;
        this.f8015b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        n nVar = (n) this.f8016c;
        if (nVar != null) {
            if (nVar.D(0)) {
                H(63);
            }
            ((n) this.f8016c).F(0);
        }
        return z10;
    }

    public void G() {
        this.f8015b = 0L;
        n nVar = (n) this.f8016c;
        if (nVar != null) {
            nVar.G();
        }
    }

    public void H(int i10) {
        if (i10 >= 64) {
            B();
            ((n) this.f8016c).H(i10 - 64);
            return;
        }
        this.f8015b |= 1 << i10;
    }

    @Override
    public void X1(b0 b0Var) {
        ((c3.q) this.f8016c).X1(new k3.d(this, b0Var, b0Var));
    }

    @Override
    public h0 Z1(int i10, int i11) {
        return ((c3.q) this.f8016c).Z1(i10, i11);
    }

    @Override
    public void a(int i10, int i11, byte[] bArr) {
        ((c3.p) this.f8016c).a(i10, i11, bArr);
    }

    @Override
    public long b(long j3) {
        return ((c3.j) this.f8016c).e[(int) j3] - this.f8015b;
    }

    @Override
    public long c(long j3, long j10) {
        return ((c3.j) this.f8016c).d[(int) j3];
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8016c).d(bArr, 0, i11, z10);
    }

    @Override
    public int e(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.f8016c).e(i10, i11, bArr);
    }

    @Override
    public void e1() {
        ((c3.q) this.f8016c).e1();
    }

    @Override
    public long f(long j3, long j10) {
        return 0L;
    }

    @Override
    public boolean g(int i10, boolean z10) {
        return ((c3.p) this.f8016c).g(i10, true);
    }

    @Override
    public long getLength() {
        return ((c3.p) this.f8016c).getLength() - this.f8015b;
    }

    @Override
    public long getPosition() {
        return ((c3.p) this.f8016c).getPosition() - this.f8015b;
    }

    @Override
    public boolean h(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8016c).h(bArr, i10, i11, z10);
    }

    @Override
    public long i() {
        return ((c3.p) this.f8016c).i() - this.f8015b;
    }

    @Override
    public long j(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public m2.j k(long j3) {
        c3.j jVar = (c3.j) this.f8016c;
        int i10 = (int) j3;
        return new m2.j(jVar.f3772c[i10], jVar.f3771b[i10], null);
    }

    @Override
    public void l(int i10) {
        ((c3.p) this.f8016c).l(i10);
    }

    @Override
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f8015b);
        ?? o2Var = new o2(bundle);
        o2Var.d = new ArrayList();
        o2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f8016c;
        o2Var.e = profileActivity.f31583h5;
        profileActivity.presentFragment((o2) o2Var);
    }

    @Override
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8016c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f8015b, profileActivity.f31572g1);
        profileActivity.getNotificationsController().muteDialog(this.f8015b, profileActivity.f31572g1, z10);
        if (profileActivity.fragmentView != null) {
            xc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public long o(long j3, long j10) {
        return d0.e(((c3.j) this.f8016c).e, j3 + this.f8015b, true);
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f8014a) {
            case 0:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j3 = this.f8015b;
                for (g6.o oVar : ((h) ((aa.a) this.f8016c).d).f8000c.d) {
                    oVar.b(j3, i10, null);
                }
                return;
            case 7:
                ((a9) this.f8016c).f44242b.set(this.f8015b);
                return;
            case 8:
                ((AtomicLong) ((o0.a) this.f8016c).f15520c).set(this.f8015b);
                return;
            default:
                ((a9) this.f8016c).f44242b.set(this.f8015b);
                return;
        }
    }

    @Override
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8016c;
        long j3 = this.f8015b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f31572g1);
            profileActivity.presentFragment(new p11(bundle, profileActivity.f31700z0));
        }
    }

    @Override
    public void q() {
        ((c3.p) this.f8016c).q();
    }

    @Override
    public void r(int i10) {
        ((c3.p) this.f8016c).r(i10);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.f8016c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.f8016c).readFully(bArr, i10, i11);
    }

    @Override
    public void s() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8016c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f8015b;
        boolean z10 = notificationsSettings.getBoolean(l0.h(j3, profileActivity.f31572g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(l0.h(j3, profileActivity.f31572g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (xc.a(profileActivity)) {
            xc.S(z10 ? 1 : 0, profileActivity, profileActivity.f31700z0).j();
        }
    }

    @Override
    public int skip(int i10) {
        return ((c3.p) this.f8016c).skip(i10);
    }

    @Override
    public boolean t(int i10, boolean z10) {
        return ((c3.p) this.f8016c).t(i10, true);
    }

    public String toString() {
        switch (this.f8014a) {
            case 6:
                if (((n) this.f8016c) == null) {
                    return Long.toBinaryString(this.f8015b);
                }
                return ((n) this.f8016c).toString() + "xx" + Long.toBinaryString(this.f8015b);
            default:
                return super.toString();
        }
    }

    @Override
    public void u(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f8016c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f8015b, profileActivity.f31572g1)) {
                n();
            }
            if (xc.a(profileActivity)) {
                xc.z(profileActivity, 4, i10, profileActivity.f31700z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f8015b, profileActivity.f31572g1, i10);
        if (xc.a(profileActivity)) {
            xc.z(profileActivity, 5, i10, profileActivity.f31700z0).j();
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
            n nVar = (n) this.f8016c;
            if (nVar != null) {
                nVar.x(i10 - 64);
                return;
            }
            return;
        }
        this.f8015b &= ~(1 << i10);
    }

    public int y(int i10) {
        n nVar = (n) this.f8016c;
        if (nVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f8015b);
            }
            return Long.bitCount(this.f8015b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f8015b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f8015b) + nVar.y(i10 - 64);
        }
    }

    @Override
    public long z(long j3) {
        return ((c3.j) this.f8016c).f3770a;
    }

    public n(Object obj, long j3, int i10) {
        this.f8014a = i10;
        this.f8016c = obj;
        this.f8015b = j3;
    }

    public n(c3.p pVar, long j3) {
        this.f8014a = 2;
        this.f8016c = pVar;
        e2.d.b(pVar.getPosition() >= j3);
        this.f8015b = j3;
    }

    public n(int i10) {
        this.f8014a = i10;
        switch (i10) {
            case 9:
                this.f8016c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f8015b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
