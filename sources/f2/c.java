package f2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.DesugarCollections;
import j7.d9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.qc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k11;
public final class c implements OnFailureListener, mo, r4.h, v4.f, r3.l, r3.m {
    public final int f5738a;
    public long f5739b;
    public Object f5740c;

    public c(long j10, Object obj, int i10) {
        this.f5738a = i10;
        this.f5739b = j10;
        this.f5740c = obj;
    }

    @Override
    public boolean A() {
        return true;
    }

    public void B(kc.a aVar) {
        this.f5739b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f5739b + ")");
        ((List) this.f5740c).add(aVar);
        thread.start();
    }

    @Override
    public long C() {
        return 0L;
    }

    public boolean D(int i10) {
        if (i10 >= 64) {
            z();
            return ((c) this.f5740c).D(i10 - 64);
        } else if ((this.f5739b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void E(int i10, boolean z4) {
        boolean z10;
        if (i10 >= 64) {
            z();
            ((c) this.f5740c).E(i10 - 64, z4);
            return;
        }
        long j10 = this.f5739b;
        if ((Long.MIN_VALUE & j10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = (1 << i10) - 1;
        this.f5739b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z4) {
            J(i10);
        } else {
            w(i10);
        }
        if (!z10 && ((c) this.f5740c) == null) {
            return;
        }
        z();
        ((c) this.f5740c).E(0, z10);
    }

    @Override
    public long F(long j10) {
        return ((r3.f) this.f5740c).f46574a;
    }

    public boolean G(int i10) {
        boolean z4;
        if (i10 >= 64) {
            z();
            return ((c) this.f5740c).G(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f5739b;
        if ((j11 & j10) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        long j12 = j11 & (~j10);
        this.f5739b = j12;
        long j13 = j10 - 1;
        this.f5739b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        c cVar = (c) this.f5740c;
        if (cVar != null) {
            if (cVar.D(0)) {
                J(63);
            }
            ((c) this.f5740c).G(0);
        }
        return z4;
    }

    public void H() {
        this.f5739b = 0L;
        c cVar = (c) this.f5740c;
        if (cVar != null) {
            cVar.H();
        }
    }

    @Override
    public long I(long j10, long j11) {
        return ((r3.f) this.f5740c).f46574a;
    }

    public void J(int i10) {
        if (i10 >= 64) {
            z();
            ((c) this.f5740c).J(i10 - 64);
            return;
        }
        this.f5739b |= 1 << i10;
    }

    public void K(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f5740c) == null) {
            this.f5740c = exc;
            this.f5739b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f5739b) {
            Exception exc2 = (Exception) this.f5740c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f5740c;
            this.f5740c = null;
            throw exc3;
        }
    }

    @Override
    public long a(long j10) {
        return ((r3.f) this.f5740c).f46577e[(int) j10] - this.f5739b;
    }

    @Override
    public void b(int i10, int i11, byte[] bArr) {
        ((r3.l) this.f5740c).b(i10, i11, bArr);
    }

    @Override
    public boolean c(byte[] bArr, int i10, int i11, boolean z4) {
        return ((r3.l) this.f5740c).c(bArr, 0, i11, z4);
    }

    @Override
    public int d(long j10) {
        if (this.f5739b > j10) {
            return 0;
        }
        return -1;
    }

    @Override
    public int e(int i10, int i11, byte[] bArr) {
        return ((r3.l) this.f5740c).e(i10, i11, bArr);
    }

    @Override
    public boolean f(byte[] bArr, int i10, int i11, boolean z4) {
        return ((r3.l) this.f5740c).f(bArr, i10, i11, z4);
    }

    @Override
    public long g() {
        return ((r3.l) this.f5740c).g() - this.f5739b;
    }

    @Override
    public long getLength() {
        return ((r3.l) this.f5740c).getLength() - this.f5739b;
    }

    @Override
    public long getPosition() {
        return ((r3.l) this.f5740c).getPosition() - this.f5739b;
    }

    @Override
    public long h(long j10, long j11) {
        return ((r3.f) this.f5740c).d[(int) j10];
    }

    @Override
    public void i(int i10) {
        ((r3.l) this.f5740c).i(i10);
    }

    @Override
    public void i1() {
        ((r3.m) this.f5740c).i1();
    }

    @Override
    public r3.v i2(int i10, int i11) {
        return ((r3.m) this.f5740c).i2(i10, i11);
    }

    @Override
    public void j() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f5739b);
        ?? p2Var = new p2(bundle);
        p2Var.d = new ArrayList();
        p2Var.f43618e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f5740c;
        p2Var.f43618e = profileActivity.f34595e5;
        profileActivity.presentFragment((p2) p2Var);
    }

    @Override
    public void k() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5740c;
        boolean z4 = !profileActivity.getMessagesController().isDialogMuted(this.f5739b, profileActivity.f34583d1);
        profileActivity.getNotificationsController().muteDialog(this.f5739b, profileActivity.f34583d1, z4);
        if (profileActivity.fragmentView != null) {
            qc.A(profileActivity, z4, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public long l(int i10) {
        boolean z4;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        return this.f5739b;
    }

    @Override
    public long m(long j10, long j11) {
        return 0L;
    }

    @Override
    public void m2(r3.s sVar) {
        ((r3.m) this.f5740c).m2(new w3.c(this, sVar));
    }

    @Override
    public long n(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5740c;
        long j10 = this.f5739b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f34583d1);
            profileActivity.presentFragment(new k11(bundle, profileActivity.f34714w0));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f5738a) {
            case 1:
                ((d9) this.f5740c).f9589b.set(this.f5739b);
                return;
            case 2:
            case 3:
            default:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j10 = this.f5739b;
                for (u5.p pVar : ((s5.h) ((s5.m) this.f5740c).d).f47078c.d) {
                    pVar.b(j10, i10, null);
                }
                return;
            case 4:
                ((d9) this.f5740c).f9589b.set(this.f5739b);
                return;
            case 5:
                ((d9) this.f5740c).f9589b.set(this.f5739b);
                return;
        }
    }

    @Override
    public s4.j p(long j10) {
        r3.f fVar = (r3.f) this.f5740c;
        int i10 = (int) j10;
        return new s4.j(fVar.f46576c[i10], fVar.f46575b[i10], null);
    }

    @Override
    public List q(long j10) {
        if (j10 >= this.f5739b) {
            return (s8.v) this.f5740c;
        }
        s8.t tVar = s8.v.f47174b;
        return s8.i0.f47139e;
    }

    @Override
    public void r() {
        ((r3.l) this.f5740c).r();
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((r3.l) this.f5740c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((r3.l) this.f5740c).readFully(bArr, i10, i11);
    }

    @Override
    public void s(int i10) {
        ((r3.l) this.f5740c).s(i10);
    }

    @Override
    public int skip(int i10) {
        return ((r3.l) this.f5740c).skip(i10);
    }

    @Override
    public long t(long j10, long j11) {
        return h5.d0.e(((r3.f) this.f5740c).f46577e, j10 + this.f5739b, true);
    }

    public String toString() {
        switch (this.f5738a) {
            case 0:
                if (((c) this.f5740c) == null) {
                    return Long.toBinaryString(this.f5739b);
                }
                return ((c) this.f5740c).toString() + "xx" + Long.toBinaryString(this.f5739b);
            default:
                return super.toString();
        }
    }

    @Override
    public void u() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5740c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j10 = this.f5739b;
        boolean z4 = notificationsSettings.getBoolean(y3.i(j10, profileActivity.f34583d1, sb), true);
        boolean z10 = !z4 ? 1 : 0;
        notificationsSettings.edit().putBoolean(y3.i(j10, profileActivity.f34583d1, new StringBuilder("sound_enabled_")), z10).apply();
        if (qc.a(profileActivity)) {
            qc.S(z4 ? 1 : 0, profileActivity, profileActivity.f34714w0).j();
        }
    }

    @Override
    public void v(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f5740c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f5739b, profileActivity.f34583d1)) {
                k();
            }
            if (qc.a(profileActivity)) {
                qc.z(profileActivity, 4, i10, profileActivity.f34714w0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f5739b, profileActivity.f34583d1, i10);
        if (qc.a(profileActivity)) {
            qc.z(profileActivity, 5, i10, profileActivity.f34714w0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public void w(int i10) {
        if (i10 >= 64) {
            c cVar = (c) this.f5740c;
            if (cVar != null) {
                cVar.w(i10 - 64);
                return;
            }
            return;
        }
        this.f5739b &= ~(1 << i10);
    }

    @Override
    public int x() {
        return 1;
    }

    public int y(int i10) {
        c cVar = (c) this.f5740c;
        if (cVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f5739b);
            }
            return Long.bitCount(this.f5739b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f5739b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f5739b) + cVar.y(i10 - 64);
        }
    }

    public void z() {
        if (((c) this.f5740c) == null) {
            this.f5740c = new c(0);
        }
    }

    public c(Object obj, long j10, int i10) {
        this.f5738a = i10;
        this.f5740c = obj;
        this.f5739b = j10;
    }

    public c(r3.l lVar, long j10) {
        this.f5738a = 11;
        this.f5740c = lVar;
        h5.a.f(lVar.getPosition() >= j10);
        this.f5739b = j10;
    }

    public c(int i10) {
        this.f5738a = i10;
        switch (i10) {
            case 2:
                this.f5740c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            case 3:
                return;
            default:
                this.f5739b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
