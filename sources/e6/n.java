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
import n6.t;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ep;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.v11;
import x7.ga;
public final class n implements OnFailureListener, c3.p, c3.q, l2.i, ep {
    public final int f8688a;
    public long f8689b;
    public Object f8690c;

    public n(long j3, Object obj, int i10) {
        this.f8688a = i10;
        this.f8689b = j3;
        this.f8690c = obj;
    }

    public int A(int i10) {
        n nVar = (n) this.f8690c;
        if (nVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f8689b);
            }
            return Long.bitCount(this.f8689b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f8689b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f8689b) + nVar.A(i10 - 64);
        }
    }

    public void B() {
        if (((n) this.f8690c) == null) {
            this.f8690c = new n(6);
        }
    }

    public void C(zc.a aVar) {
        this.f8689b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f8689b + ")");
        ((List) this.f8690c).add(aVar);
        thread.start();
    }

    public boolean D(int i10) {
        if (i10 >= 64) {
            B();
            return ((n) this.f8690c).D(i10 - 64);
        } else if ((this.f8689b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void E(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            B();
            ((n) this.f8690c).E(i10 - 64, z10);
            return;
        }
        long j3 = this.f8689b;
        if ((Long.MIN_VALUE & j3) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f8689b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            H(i10);
        } else {
            z(i10);
        }
        if (!z11 && ((n) this.f8690c) == null) {
            return;
        }
        B();
        ((n) this.f8690c).E(0, z11);
    }

    public boolean F(int i10) {
        boolean z10;
        if (i10 >= 64) {
            B();
            return ((n) this.f8690c).F(i10 - 64);
        }
        long j3 = 1 << i10;
        long j10 = this.f8689b;
        if ((j10 & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j3);
        this.f8689b = j11;
        long j12 = j3 - 1;
        this.f8689b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        n nVar = (n) this.f8690c;
        if (nVar != null) {
            if (nVar.D(0)) {
                H(63);
            }
            ((n) this.f8690c).F(0);
        }
        return z10;
    }

    public void G() {
        this.f8689b = 0L;
        n nVar = (n) this.f8690c;
        if (nVar != null) {
            nVar.G();
        }
    }

    public void H(int i10) {
        if (i10 >= 64) {
            B();
            ((n) this.f8690c).H(i10 - 64);
            return;
        }
        this.f8689b |= 1 << i10;
    }

    @Override
    public void a(int i10, int i11, byte[] bArr) {
        ((c3.p) this.f8690c).a(i10, i11, bArr);
    }

    @Override
    public long b(long j3) {
        return ((c3.j) this.f8690c).f4128e[(int) j3] - this.f8689b;
    }

    @Override
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8690c).c(bArr, 0, i11, z10);
    }

    @Override
    public long d(long j3, long j10) {
        return ((c3.j) this.f8690c).d[(int) j3];
    }

    @Override
    public void d2(b0 b0Var) {
        ((c3.q) this.f8690c).d2(new k3.d(this, b0Var, b0Var));
    }

    @Override
    public int e(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.f8690c).e(i10, i11, bArr);
    }

    @Override
    public long f(long j3, long j10) {
        return 0L;
    }

    @Override
    public h0 f2(int i10, int i11) {
        return ((c3.q) this.f8690c).f2(i10, i11);
    }

    @Override
    public boolean g(int i10, boolean z10) {
        return ((c3.p) this.f8690c).g(i10, true);
    }

    @Override
    public long getLength() {
        return ((c3.p) this.f8690c).getLength() - this.f8689b;
    }

    @Override
    public long getPosition() {
        return ((c3.p) this.f8690c).getPosition() - this.f8689b;
    }

    @Override
    public boolean h(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f8690c).h(bArr, i10, i11, z10);
    }

    @Override
    public long i(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public long j() {
        return ((c3.p) this.f8690c).j() - this.f8689b;
    }

    @Override
    public m2.j k(long j3) {
        c3.j jVar = (c3.j) this.f8690c;
        int i10 = (int) j3;
        return new m2.j(jVar.f4127c[i10], jVar.f4126b[i10], null);
    }

    @Override
    public void k1() {
        ((c3.q) this.f8690c).k1();
    }

    @Override
    public void l(int i10) {
        ((c3.p) this.f8690c).l(i10);
    }

    @Override
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f8689b);
        ?? n2Var = new n2(bundle);
        n2Var.d = new ArrayList();
        n2Var.f39575e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f8690c;
        n2Var.f39575e = profileActivity.f34269h5;
        profileActivity.presentFragment((n2) n2Var);
    }

    @Override
    public long n(long j3, long j10) {
        return d0.e(((c3.j) this.f8690c).f4128e, j3 + this.f8689b, true);
    }

    @Override
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8690c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f8689b, profileActivity.f34258g1);
        profileActivity.getNotificationsController().muteDialog(this.f8689b, profileActivity.f34258g1, z10);
        if (profileActivity.fragmentView != null) {
            ad.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f8688a) {
            case 0:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j3 = this.f8689b;
                for (g6.o oVar : ((h) ((aa.a) this.f8690c).d).f8673c.d) {
                    oVar.b(j3, i10, null);
                }
                return;
            case 7:
                ((AtomicLong) ((t) this.f8690c).f16718c).set(this.f8689b);
                return;
            case 8:
                ((ga) this.f8690c).f50784b.set(this.f8689b);
                return;
            default:
                ((ga) this.f8690c).f50784b.set(this.f8689b);
                return;
        }
    }

    @Override
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8690c;
        long j3 = this.f8689b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f34258g1);
            profileActivity.presentFragment(new v11(bundle, profileActivity.f34386z0));
        }
    }

    @Override
    public void q() {
        ((c3.p) this.f8690c).q();
    }

    @Override
    public void r(int i10) {
        ((c3.p) this.f8690c).r(i10);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.f8690c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.f8690c).readFully(bArr, i10, i11);
    }

    @Override
    public void s() {
        ProfileActivity profileActivity = (ProfileActivity) this.f8690c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f8689b;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.q.i(j3, profileActivity.f34258g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.q.i(j3, profileActivity.f34258g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (ad.a(profileActivity)) {
            ad.S(z10 ? 1 : 0, profileActivity, profileActivity.f34386z0).j();
        }
    }

    @Override
    public int skip(int i10) {
        return ((c3.p) this.f8690c).skip(i10);
    }

    @Override
    public boolean t() {
        return true;
    }

    public String toString() {
        switch (this.f8688a) {
            case 6:
                if (((n) this.f8690c) == null) {
                    return Long.toBinaryString(this.f8689b);
                }
                return ((n) this.f8690c).toString() + "xx" + Long.toBinaryString(this.f8689b);
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
        return ((c3.p) this.f8690c).v(i10, true);
    }

    @Override
    public long w(long j3) {
        return ((c3.j) this.f8690c).f4125a;
    }

    @Override
    public void x(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f8690c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f8689b, profileActivity.f34258g1)) {
                o();
            }
            if (ad.a(profileActivity)) {
                ad.z(profileActivity, 4, i10, profileActivity.f34386z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f8689b, profileActivity.f34258g1, i10);
        if (ad.a(profileActivity)) {
            ad.z(profileActivity, 5, i10, profileActivity.f34386z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public long y(long j3, long j10) {
        return ((c3.j) this.f8690c).f4125a;
    }

    public void z(int i10) {
        if (i10 >= 64) {
            n nVar = (n) this.f8690c;
            if (nVar != null) {
                nVar.z(i10 - 64);
                return;
            }
            return;
        }
        this.f8689b &= ~(1 << i10);
    }

    public n(Object obj, long j3, int i10) {
        this.f8688a = i10;
        this.f8690c = obj;
        this.f8689b = j3;
    }

    public n(c3.p pVar, long j3) {
        this.f8688a = 2;
        this.f8690c = pVar;
        e2.d.b(pVar.getPosition() >= j3);
        this.f8689b = j3;
    }

    public n(int i10) {
        this.f8688a = i10;
        switch (i10) {
            case 10:
                this.f8690c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f8689b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
