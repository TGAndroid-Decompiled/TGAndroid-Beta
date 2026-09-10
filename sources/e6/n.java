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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.a2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c21;
import v7.z8;
public final class n implements OnFailureListener, c3.p, c3.q, l2.j, to {
    public final int f7330a;
    public long f7331b;
    public Object f7332c;

    public n(long j3, Object obj, int i10) {
        this.f7330a = i10;
        this.f7331b = j3;
        this.f7332c = obj;
    }

    public void A(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            x();
            ((n) this.f7332c).A(i10 - 64, z10);
            return;
        }
        long j3 = this.f7331b;
        if ((Long.MIN_VALUE & j3) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f7331b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            F(i10);
        } else {
            u(i10);
        }
        if (!z11 && ((n) this.f7332c) == null) {
            return;
        }
        x();
        ((n) this.f7332c).A(0, z11);
    }

    @Override
    public void B() {
        ((c3.q) this.f7332c).B();
    }

    public boolean C(int i10) {
        boolean z10;
        if (i10 >= 64) {
            x();
            return ((n) this.f7332c).C(i10 - 64);
        }
        long j3 = 1 << i10;
        long j10 = this.f7331b;
        if ((j10 & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j3);
        this.f7331b = j11;
        long j12 = j3 - 1;
        this.f7331b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        n nVar = (n) this.f7332c;
        if (nVar != null) {
            if (nVar.z(0)) {
                F(63);
            }
            ((n) this.f7332c).C(0);
        }
        return z10;
    }

    public void D() {
        this.f7331b = 0L;
        n nVar = (n) this.f7332c;
        if (nVar != null) {
            nVar.D();
        }
    }

    @Override
    public boolean E() {
        return true;
    }

    public void F(int i10) {
        if (i10 >= 64) {
            x();
            ((n) this.f7332c).F(i10 - 64);
            return;
        }
        this.f7331b |= 1 << i10;
    }

    @Override
    public void G(b0 b0Var) {
        ((c3.q) this.f7332c).G(new k3.d(this, b0Var, b0Var));
    }

    @Override
    public h0 I(int i10, int i11) {
        return ((c3.q) this.f7332c).I(i10, i11);
    }

    @Override
    public long J() {
        return 0L;
    }

    @Override
    public long K(long j3) {
        return ((c3.j) this.f7332c).f4190a;
    }

    @Override
    public long M(long j3, long j10) {
        return ((c3.j) this.f7332c).f4190a;
    }

    @Override
    public long a(long j3) {
        return ((c3.j) this.f7332c).e[(int) j3] - this.f7331b;
    }

    @Override
    public void b(int i10, int i11, byte[] bArr) {
        ((c3.p) this.f7332c).b(i10, i11, bArr);
    }

    @Override
    public long c(long j3, long j10) {
        return ((c3.j) this.f7332c).d[(int) j3];
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f7332c).d(bArr, 0, i11, z10);
    }

    @Override
    public int e(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.f7332c).e(i10, i11, bArr);
    }

    @Override
    public boolean f(int i10, boolean z10) {
        return ((c3.p) this.f7332c).f(i10, true);
    }

    @Override
    public boolean g(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f7332c).g(bArr, i10, i11, z10);
    }

    @Override
    public long getLength() {
        return ((c3.p) this.f7332c).getLength() - this.f7331b;
    }

    @Override
    public long getPosition() {
        return ((c3.p) this.f7332c).getPosition() - this.f7331b;
    }

    @Override
    public long h() {
        return ((c3.p) this.f7332c).h() - this.f7331b;
    }

    @Override
    public long i(long j3, long j10) {
        return 0L;
    }

    @Override
    public void j(int i10) {
        ((c3.p) this.f7332c).j(i10);
    }

    @Override
    public long k(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public void l() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f7331b);
        ?? p2Var = new p2(bundle);
        p2Var.d = new ArrayList();
        p2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f7332c;
        p2Var.e = profileActivity.f30407h5;
        profileActivity.presentFragment((p2) p2Var);
    }

    @Override
    public m2.j m(long j3) {
        c3.j jVar = (c3.j) this.f7332c;
        int i10 = (int) j3;
        return new m2.j(jVar.f4192c[i10], jVar.f4191b[i10], null);
    }

    @Override
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.f7332c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f7331b, profileActivity.f30396g1);
        profileActivity.getNotificationsController().muteDialog(this.f7331b, profileActivity.f30396g1, z10);
        if (profileActivity.fragmentView != null) {
            wc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.f7332c;
        long j3 = this.f7331b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f30396g1);
            profileActivity.presentFragment(new c21(bundle, profileActivity.f30524z0));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f7330a) {
            case 0:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j3 = this.f7331b;
                for (g6.o oVar : ((h) ((aa.a) this.f7332c).d).f7316c.d) {
                    oVar.b(j3, i10, null);
                }
                return;
            case 7:
                ((z8) this.f7332c).f43222b.set(this.f7331b);
                return;
            case 8:
                ((z8) this.f7332c).f43222b.set(this.f7331b);
                return;
            default:
                ((z8) this.f7332c).f43222b.set(this.f7331b);
                return;
        }
    }

    @Override
    public void p() {
        ((c3.p) this.f7332c).p();
    }

    @Override
    public void q(int i10) {
        ((c3.p) this.f7332c).q(i10);
    }

    @Override
    public void r() {
        ProfileActivity profileActivity = (ProfileActivity) this.f7332c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f7331b;
        boolean z10 = notificationsSettings.getBoolean(a2.i(j3, profileActivity.f30396g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(a2.i(j3, profileActivity.f30396g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (wc.a(profileActivity)) {
            wc.S(z10 ? 1 : 0, profileActivity, profileActivity.f30524z0).j();
        }
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.f7332c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.f7332c).readFully(bArr, i10, i11);
    }

    @Override
    public boolean s(int i10, boolean z10) {
        return ((c3.p) this.f7332c).s(i10, true);
    }

    @Override
    public int skip(int i10) {
        return ((c3.p) this.f7332c).skip(i10);
    }

    @Override
    public void t(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f7332c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f7331b, profileActivity.f30396g1)) {
                n();
            }
            if (wc.a(profileActivity)) {
                wc.z(profileActivity, 4, i10, profileActivity.f30524z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f7331b, profileActivity.f30396g1, i10);
        if (wc.a(profileActivity)) {
            wc.z(profileActivity, 5, i10, profileActivity.f30524z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public String toString() {
        switch (this.f7330a) {
            case 6:
                if (((n) this.f7332c) == null) {
                    return Long.toBinaryString(this.f7331b);
                }
                return ((n) this.f7332c).toString() + "xx" + Long.toBinaryString(this.f7331b);
            default:
                return super.toString();
        }
    }

    public void u(int i10) {
        if (i10 >= 64) {
            n nVar = (n) this.f7332c;
            if (nVar != null) {
                nVar.u(i10 - 64);
                return;
            }
            return;
        }
        this.f7331b &= ~(1 << i10);
    }

    public int v(int i10) {
        n nVar = (n) this.f7332c;
        if (nVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f7331b);
            }
            return Long.bitCount(this.f7331b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f7331b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f7331b) + nVar.v(i10 - 64);
        }
    }

    @Override
    public long w(long j3, long j10) {
        return d0.e(((c3.j) this.f7332c).e, j3 + this.f7331b, true);
    }

    public void x() {
        if (((n) this.f7332c) == null) {
            this.f7332c = new n(6);
        }
    }

    public void y(yc.a aVar) {
        this.f7331b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f7331b + ")");
        ((List) this.f7332c).add(aVar);
        thread.start();
    }

    public boolean z(int i10) {
        if (i10 >= 64) {
            x();
            return ((n) this.f7332c).z(i10 - 64);
        } else if ((this.f7331b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public n(Object obj, long j3, int i10) {
        this.f7330a = i10;
        this.f7332c = obj;
        this.f7331b = j3;
    }

    public n(c3.p pVar, long j3) {
        this.f7330a = 2;
        this.f7332c = pVar;
        e2.d.b(pVar.getPosition() >= j3);
        this.f7331b = j3;
    }

    public n(int i10) {
        this.f7330a = i10;
        switch (i10) {
            case 9:
                this.f7332c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f7331b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
