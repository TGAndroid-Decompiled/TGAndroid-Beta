package ad;

import android.content.SharedPreferences;
import android.os.Bundle;
import c3.e0;
import c3.j0;
import c3.l0;
import c3.r;
import c3.s;
import com.google.android.gms.tasks.OnFailureListener;
import e2.m0;
import g6.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.v0;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wo;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c11;
import v7.u6;
import v7.z8;
import z7.xf;
public final class d implements r, s, OnFailureListener, l2.i, wo {
    public final int f503a;
    public long f504b;
    public Object f505c;

    public d(long j10, Object obj, int i10) {
        this.f503a = i10;
        this.f504b = j10;
        this.f505c = obj;
    }

    @Override
    public long A(long j10) {
        return ((c3.j) this.f505c).f4631a;
    }

    @Override
    public long B(long j10, long j11) {
        return ((c3.j) this.f505c).f4631a;
    }

    @Override
    public void C() {
        ((s) this.f505c).C();
    }

    public void D(a aVar) {
        this.f504b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f504b + ")");
        ((List) this.f505c).add(aVar);
        thread.start();
    }

    public boolean E(int i10) {
        if (i10 >= 64) {
            z();
            return ((d) this.f505c).E(i10 - 64);
        } else if ((this.f504b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void F(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            z();
            ((d) this.f505c).F(i10 - 64, z10);
            return;
        }
        long j10 = this.f504b;
        if ((Long.MIN_VALUE & j10) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j11 = (1 << i10) - 1;
        this.f504b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            I(i10);
        } else {
            x(i10);
        }
        if (!z11 && ((d) this.f505c) == null) {
            return;
        }
        z();
        ((d) this.f505c).F(0, z11);
    }

    public boolean G(int i10) {
        boolean z10;
        if (i10 >= 64) {
            z();
            return ((d) this.f505c).G(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f504b;
        if ((j11 & j10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = j11 & (~j10);
        this.f504b = j12;
        long j13 = j10 - 1;
        this.f504b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        d dVar = (d) this.f505c;
        if (dVar != null) {
            if (dVar.E(0)) {
                I(63);
            }
            ((d) this.f505c).G(0);
        }
        return z10;
    }

    public void H() {
        this.f504b = 0L;
        d dVar = (d) this.f505c;
        if (dVar != null) {
            dVar.H();
        }
    }

    public void I(int i10) {
        if (i10 >= 64) {
            z();
            ((d) this.f505c).I(i10 - 64);
            return;
        }
        this.f504b |= 1 << i10;
    }

    @Override
    public void a(int i10, int i11, byte[] bArr) {
        ((r) this.f505c).a(i10, i11, bArr);
    }

    @Override
    public long b(long j10) {
        return ((c3.j) this.f505c).e[(int) j10] - this.f504b;
    }

    @Override
    public long c(long j10, long j11) {
        return ((c3.j) this.f505c).d[(int) j10];
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((r) this.f505c).d(bArr, 0, i11, z10);
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
        c3.j jVar = (c3.j) this.f505c;
        int i10 = (int) j10;
        return new m2.j(jVar.f4633c[i10], jVar.f4632b[i10], null);
    }

    @Override
    public void g0(e0 e0Var) {
        ((s) this.f505c).g0(new j0(this, e0Var, e0Var));
    }

    @Override
    public long getLength() {
        return ((r) this.f505c).getLength() - this.f504b;
    }

    @Override
    public long getPosition() {
        return ((r) this.f505c).getPosition() - this.f504b;
    }

    @Override
    public int h(int i10, int i11, byte[] bArr) {
        return ((r) this.f505c).h(i10, i11, bArr);
    }

    @Override
    public boolean i(int i10, boolean z10) {
        return ((r) this.f505c).i(i10, true);
    }

    @Override
    public boolean j(byte[] bArr, int i10, int i11, boolean z10) {
        return ((r) this.f505c).j(bArr, i10, i11, z10);
    }

    @Override
    public l0 j0(int i10, int i11) {
        return ((s) this.f505c).j0(i10, i11);
    }

    @Override
    public long k() {
        return ((r) this.f505c).k() - this.f504b;
    }

    @Override
    public void l(int i10) {
        ((r) this.f505c).l(i10);
    }

    @Override
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f504b);
        ?? o2Var = new o2(bundle);
        o2Var.d = new ArrayList();
        o2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f505c;
        o2Var.e = profileActivity.f33955j5;
        profileActivity.presentFragment((o2) o2Var);
    }

    @Override
    public long n(long j10, long j11) {
        return m0.f(((c3.j) this.f505c).e, j10 + this.f504b, true);
    }

    @Override
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.f505c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f504b, profileActivity.f33937h1);
        profileActivity.getNotificationsController().muteDialog(this.f504b, profileActivity.f33937h1, z10);
        if (profileActivity.fragmentView != null) {
            vc.A(profileActivity, z10, null).j();
        }
        profileActivity.e5();
        profileActivity.k5(true);
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f503a) {
            case 3:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j10 = this.f504b;
                for (o oVar : ((e6.h) ((androidx.biometric.e) this.f505c).d).f8378c.d) {
                    oVar.b(j10, i10, null);
                }
                return;
            case 8:
                ((z8) this.f505c).f48692b.set(this.f504b);
                return;
            case 9:
                ((z8) this.f505c).f48692b.set(this.f504b);
                return;
            default:
                ((AtomicLong) ((xf) this.f505c).f51723b).set(this.f504b);
                return;
        }
    }

    @Override
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.f505c;
        long j10 = this.f504b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f33937h1);
            profileActivity.presentFragment(new c11(bundle, profileActivity.A0));
        }
    }

    @Override
    public void q() {
        ((r) this.f505c).q();
    }

    @Override
    public void r(int i10) {
        ((r) this.f505c).r(i10);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((r) this.f505c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((r) this.f505c).readFully(bArr, i10, i11);
    }

    @Override
    public boolean s() {
        return true;
    }

    @Override
    public int skip(int i10) {
        return ((r) this.f505c).skip(i10);
    }

    @Override
    public void t() {
        ProfileActivity profileActivity = (ProfileActivity) this.f505c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.f504b;
        boolean z10 = notificationsSettings.getBoolean(v0.i(j10, profileActivity.f33937h1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(v0.i(j10, profileActivity.f33937h1, new StringBuilder("sound_enabled_")), z11).apply();
        if (vc.a(profileActivity)) {
            vc.S(z10 ? 1 : 0, profileActivity, profileActivity.A0).j();
        }
    }

    public String toString() {
        switch (this.f503a) {
            case 7:
                if (((d) this.f505c) == null) {
                    return Long.toBinaryString(this.f504b);
                }
                return ((d) this.f505c).toString() + "xx" + Long.toBinaryString(this.f504b);
            default:
                return super.toString();
        }
    }

    @Override
    public boolean u(int i10, boolean z10) {
        return ((r) this.f505c).u(i10, true);
    }

    @Override
    public void v(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f505c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f504b, profileActivity.f33937h1)) {
                o();
            }
            if (vc.a(profileActivity)) {
                vc.z(profileActivity, 4, i10, profileActivity.A0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f504b, profileActivity.f33937h1, i10);
        if (vc.a(profileActivity)) {
            vc.z(profileActivity, 5, i10, profileActivity.A0).j();
        }
        profileActivity.e5();
        profileActivity.k5(true);
    }

    @Override
    public long w() {
        return 0L;
    }

    public void x(int i10) {
        if (i10 >= 64) {
            d dVar = (d) this.f505c;
            if (dVar != null) {
                dVar.x(i10 - 64);
                return;
            }
            return;
        }
        this.f504b &= ~(1 << i10);
    }

    public int y(int i10) {
        d dVar = (d) this.f505c;
        if (dVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f504b);
            }
            return Long.bitCount(this.f504b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f504b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f504b) + dVar.y(i10 - 64);
        }
    }

    public void z() {
        if (((d) this.f505c) == null) {
            this.f505c = new d(7);
        }
    }

    public d(Object obj, long j10, int i10) {
        this.f503a = i10;
        this.f505c = obj;
        this.f504b = j10;
    }

    public d(r rVar, long j10) {
        this.f503a = 1;
        this.f505c = rVar;
        u6.g(rVar.getPosition() >= j10);
        this.f504b = j10;
    }

    public d(int i10) {
        this.f503a = i10;
        switch (i10) {
            case 7:
                this.f504b = 0L;
                return;
            default:
                this.f505c = DesugarCollections.synchronizedList(new ArrayList());
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
