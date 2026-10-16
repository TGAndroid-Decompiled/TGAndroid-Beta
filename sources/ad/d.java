package ad;

import android.content.SharedPreferences;
import android.os.Bundle;
import c3.b0;
import c3.g0;
import c3.i0;
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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c21;
import v7.u6;
import v7.z8;
import z7.xf;
public final class d implements p, q, OnFailureListener, l2.h, bp {
    public final int f505a;
    public long f506b;
    public Object f507c;

    public d(long j10, Object obj, int i10) {
        this.f505a = i10;
        this.f506b = j10;
        this.f507c = obj;
    }

    public int A(int i10) {
        d dVar = (d) this.f507c;
        if (dVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f506b);
            }
            return Long.bitCount(this.f506b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f506b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f506b) + dVar.A(i10 - 64);
        }
    }

    public void B() {
        if (((d) this.f507c) == null) {
            this.f507c = new d(7);
        }
    }

    public void C(a aVar) {
        this.f506b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f506b + ")");
        ((List) this.f507c).add(aVar);
        thread.start();
    }

    @Override
    public void D() {
        ((q) this.f507c).D();
    }

    public boolean E(int i10) {
        if (i10 >= 64) {
            B();
            return ((d) this.f507c).E(i10 - 64);
        } else if ((this.f506b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void F(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            B();
            ((d) this.f507c).F(i10 - 64, z10);
            return;
        }
        long j10 = this.f506b;
        if ((Long.MIN_VALUE & j10) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j11 = (1 << i10) - 1;
        this.f506b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            I(i10);
        } else {
            z(i10);
        }
        if (!z11 && ((d) this.f507c) == null) {
            return;
        }
        B();
        ((d) this.f507c).F(0, z11);
    }

    public boolean G(int i10) {
        boolean z10;
        if (i10 >= 64) {
            B();
            return ((d) this.f507c).G(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f506b;
        if ((j11 & j10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = j11 & (~j10);
        this.f506b = j12;
        long j13 = j10 - 1;
        this.f506b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        d dVar = (d) this.f507c;
        if (dVar != null) {
            if (dVar.E(0)) {
                I(63);
            }
            ((d) this.f507c).G(0);
        }
        return z10;
    }

    public void H() {
        this.f506b = 0L;
        d dVar = (d) this.f507c;
        if (dVar != null) {
            dVar.H();
        }
    }

    public void I(int i10) {
        if (i10 >= 64) {
            B();
            ((d) this.f507c).I(i10 - 64);
            return;
        }
        this.f506b |= 1 << i10;
    }

    @Override
    public void K(b0 b0Var) {
        ((q) this.f507c).K(new g0(this, b0Var, b0Var));
    }

    @Override
    public i0 W(int i10, int i11) {
        return ((q) this.f507c).W(i10, i11);
    }

    @Override
    public long a(long j10) {
        return ((c3.j) this.f507c).e[(int) j10] - this.f506b;
    }

    @Override
    public void b(int i10, int i11, byte[] bArr) {
        ((p) this.f507c).b(i10, i11, bArr);
    }

    @Override
    public long c(long j10, long j11) {
        return ((c3.j) this.f507c).d[(int) j10];
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((p) this.f507c).d(bArr, 0, i11, z10);
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
    public int g(int i10, int i11, byte[] bArr) {
        return ((p) this.f507c).g(i10, i11, bArr);
    }

    @Override
    public long getLength() {
        return ((p) this.f507c).getLength() - this.f506b;
    }

    @Override
    public long getPosition() {
        return ((p) this.f507c).getPosition() - this.f506b;
    }

    @Override
    public m2.j h(long j10) {
        c3.j jVar = (c3.j) this.f507c;
        int i10 = (int) j10;
        return new m2.j(jVar.f4258c[i10], jVar.f4257b[i10], null);
    }

    @Override
    public boolean i(int i10, boolean z10) {
        return ((p) this.f507c).i(i10, true);
    }

    @Override
    public boolean j(byte[] bArr, int i10, int i11, boolean z10) {
        return ((p) this.f507c).j(bArr, i10, i11, z10);
    }

    @Override
    public long k() {
        return ((p) this.f507c).k() - this.f506b;
    }

    @Override
    public void l(int i10) {
        ((p) this.f507c).l(i10);
    }

    @Override
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f506b);
        ?? m2Var = new m2(bundle);
        m2Var.d = new ArrayList();
        m2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f507c;
        m2Var.e = profileActivity.f32287h5;
        profileActivity.presentFragment((m2) m2Var);
    }

    @Override
    public long n(long j10, long j11) {
        return m0.f(((c3.j) this.f507c).e, j10 + this.f506b, true);
    }

    @Override
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.f507c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f506b, profileActivity.f32276g1);
        profileActivity.getNotificationsController().muteDialog(this.f506b, profileActivity.f32276g1, z10);
        if (profileActivity.fragmentView != null) {
            zc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f505a) {
            case 3:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j10 = this.f506b;
                for (o oVar : ((e6.h) ((androidx.biometric.e) this.f507c).d).f8494c.d) {
                    oVar.b(j10, i10, null);
                }
                return;
            case 8:
                ((z8) this.f507c).f46859b.set(this.f506b);
                return;
            case 9:
                ((z8) this.f507c).f46859b.set(this.f506b);
                return;
            default:
                ((AtomicLong) ((xf) this.f507c).f49869b).set(this.f506b);
                return;
        }
    }

    @Override
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.f507c;
        long j10 = this.f506b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f32276g1);
            profileActivity.presentFragment(new c21(bundle, profileActivity.f32405z0));
        }
    }

    @Override
    public void q() {
        ((p) this.f507c).q();
    }

    @Override
    public void r(int i10) {
        ((p) this.f507c).r(i10);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((p) this.f507c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((p) this.f507c).readFully(bArr, i10, i11);
    }

    @Override
    public boolean s() {
        return true;
    }

    @Override
    public int skip(int i10) {
        return ((p) this.f507c).skip(i10);
    }

    @Override
    public void t() {
        ProfileActivity profileActivity = (ProfileActivity) this.f507c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.f506b;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.g0.i(j10, profileActivity.f32276g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.g0.i(j10, profileActivity.f32276g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (zc.a(profileActivity)) {
            zc.S(z10 ? 1 : 0, profileActivity, profileActivity.f32405z0).j();
        }
    }

    public String toString() {
        switch (this.f505a) {
            case 7:
                if (((d) this.f507c) == null) {
                    return Long.toBinaryString(this.f506b);
                }
                return ((d) this.f507c).toString() + "xx" + Long.toBinaryString(this.f506b);
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
        return ((p) this.f507c).v(i10, true);
    }

    @Override
    public long w(long j10) {
        return ((c3.j) this.f507c).f4256a;
    }

    @Override
    public long x(long j10, long j11) {
        return ((c3.j) this.f507c).f4256a;
    }

    @Override
    public void y(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f507c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f506b, profileActivity.f32276g1)) {
                o();
            }
            if (zc.a(profileActivity)) {
                zc.z(profileActivity, 4, i10, profileActivity.f32405z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f506b, profileActivity.f32276g1, i10);
        if (zc.a(profileActivity)) {
            zc.z(profileActivity, 5, i10, profileActivity.f32405z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public void z(int i10) {
        if (i10 >= 64) {
            d dVar = (d) this.f507c;
            if (dVar != null) {
                dVar.z(i10 - 64);
                return;
            }
            return;
        }
        this.f506b &= ~(1 << i10);
    }

    public d(Object obj, long j10, int i10) {
        this.f505a = i10;
        this.f507c = obj;
        this.f506b = j10;
    }

    public d(p pVar, long j10) {
        this.f505a = 1;
        this.f507c = pVar;
        u6.g(pVar.getPosition() >= j10);
        this.f506b = j10;
    }

    public d(int i10) {
        this.f505a = i10;
        switch (i10) {
            case 7:
                this.f506b = 0L;
                return;
            default:
                this.f507c = DesugarCollections.synchronizedList(new ArrayList());
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
