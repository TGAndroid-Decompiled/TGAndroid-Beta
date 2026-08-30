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
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.qc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e11;
public final class c implements OnFailureListener, ko, r4.h, v4.f, r3.l, r3.m {
    public final int f5669a;
    public long f5670b;
    public Object f5671c;

    public c(long j10, Object obj, int i10) {
        this.f5669a = i10;
        this.f5670b = j10;
        this.f5671c = obj;
    }

    public void A() {
        if (((c) this.f5671c) == null) {
            this.f5671c = new c(0);
        }
    }

    public void B(kc.a aVar) {
        this.f5670b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f5670b + ")");
        ((List) this.f5671c).add(aVar);
        thread.start();
    }

    public boolean C(int i10) {
        if (i10 >= 64) {
            A();
            return ((c) this.f5671c).C(i10 - 64);
        } else if ((this.f5670b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void D(int i10, boolean z4) {
        boolean z10;
        if (i10 >= 64) {
            A();
            ((c) this.f5671c).D(i10 - 64, z4);
            return;
        }
        long j10 = this.f5670b;
        if ((Long.MIN_VALUE & j10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = (1 << i10) - 1;
        this.f5670b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z4) {
            G(i10);
        } else {
            y(i10);
        }
        if (!z10 && ((c) this.f5671c) == null) {
            return;
        }
        A();
        ((c) this.f5671c).D(0, z10);
    }

    public boolean E(int i10) {
        boolean z4;
        if (i10 >= 64) {
            A();
            return ((c) this.f5671c).E(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f5670b;
        if ((j11 & j10) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        long j12 = j11 & (~j10);
        this.f5670b = j12;
        long j13 = j10 - 1;
        this.f5670b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        c cVar = (c) this.f5671c;
        if (cVar != null) {
            if (cVar.C(0)) {
                G(63);
            }
            ((c) this.f5671c).E(0);
        }
        return z4;
    }

    public void F() {
        this.f5670b = 0L;
        c cVar = (c) this.f5671c;
        if (cVar != null) {
            cVar.F();
        }
    }

    public void G(int i10) {
        if (i10 >= 64) {
            A();
            ((c) this.f5671c).G(i10 - 64);
            return;
        }
        this.f5670b |= 1 << i10;
    }

    public void H(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f5671c) == null) {
            this.f5671c = exc;
            this.f5670b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f5670b) {
            Exception exc2 = (Exception) this.f5671c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f5671c;
            this.f5671c = null;
            throw exc3;
        }
    }

    @Override
    public long S() {
        return 0L;
    }

    @Override
    public long U(long j10) {
        return ((r3.f) this.f5671c).f43211a;
    }

    @Override
    public long W(long j10, long j11) {
        return ((r3.f) this.f5671c).f43211a;
    }

    @Override
    public long a(long j10) {
        return ((r3.f) this.f5671c).e[(int) j10] - this.f5670b;
    }

    @Override
    public int b(long j10) {
        if (this.f5670b > j10) {
            return 0;
        }
        return -1;
    }

    @Override
    public void c(int i10, int i11, byte[] bArr) {
        ((r3.l) this.f5671c).c(i10, i11, bArr);
    }

    @Override
    public r3.v c2(int i10, int i11) {
        return ((r3.m) this.f5671c).c2(i10, i11);
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z4) {
        return ((r3.l) this.f5671c).d(bArr, 0, i11, z4);
    }

    @Override
    public long e(long j10, long j11) {
        return ((r3.f) this.f5671c).d[(int) j10];
    }

    @Override
    public int f(int i10, int i11, byte[] bArr) {
        return ((r3.l) this.f5671c).f(i10, i11, bArr);
    }

    @Override
    public void f1() {
        ((r3.m) this.f5671c).f1();
    }

    @Override
    public long g(int i10) {
        boolean z4;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        return this.f5670b;
    }

    @Override
    public void g2(r3.s sVar) {
        ((r3.m) this.f5671c).g2(new w3.c(this, sVar));
    }

    @Override
    public long getLength() {
        return ((r3.l) this.f5671c).getLength() - this.f5670b;
    }

    @Override
    public long getPosition() {
        return ((r3.l) this.f5671c).getPosition() - this.f5670b;
    }

    @Override
    public boolean h(byte[] bArr, int i10, int i11, boolean z4) {
        return ((r3.l) this.f5671c).h(bArr, i10, i11, z4);
    }

    @Override
    public long i() {
        return ((r3.l) this.f5671c).i() - this.f5670b;
    }

    @Override
    public long j(long j10, long j11) {
        return 0L;
    }

    @Override
    public long k(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public s4.j l(long j10) {
        r3.f fVar = (r3.f) this.f5671c;
        int i10 = (int) j10;
        return new s4.j(fVar.f43213c[i10], fVar.f43212b[i10], null);
    }

    @Override
    public List m(long j10) {
        if (j10 >= this.f5670b) {
            return (s8.v) this.f5671c;
        }
        s8.t tVar = s8.v.f44157b;
        return s8.i0.e;
    }

    @Override
    public void n(int i10) {
        ((r3.l) this.f5671c).n(i10);
    }

    @Override
    public void o() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f5670b);
        ?? p2Var = new p2(bundle);
        p2Var.d = new ArrayList();
        p2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f5671c;
        p2Var.e = profileActivity.f32062e5;
        profileActivity.presentFragment((p2) p2Var);
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f5669a) {
            case 1:
                ((d9) this.f5671c).f8977b.set(this.f5670b);
                return;
            case 2:
            case 3:
            default:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j10 = this.f5670b;
                for (u5.p pVar : ((s5.h) ((s5.m) this.f5671c).d).f44074c.d) {
                    pVar.b(j10, i10, null);
                }
                return;
            case 4:
                ((d9) this.f5671c).f8977b.set(this.f5670b);
                return;
            case 5:
                ((d9) this.f5671c).f8977b.set(this.f5670b);
                return;
        }
    }

    @Override
    public int p() {
        return 1;
    }

    @Override
    public long q(long j10, long j11) {
        return h5.d0.e(((r3.f) this.f5671c).e, j10 + this.f5670b, true);
    }

    @Override
    public void r() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5671c;
        boolean z4 = !profileActivity.getMessagesController().isDialogMuted(this.f5670b, profileActivity.f32051d1);
        profileActivity.getNotificationsController().muteDialog(this.f5670b, profileActivity.f32051d1, z4);
        if (profileActivity.fragmentView != null) {
            qc.A(profileActivity, z4, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((r3.l) this.f5671c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((r3.l) this.f5671c).readFully(bArr, i10, i11);
    }

    @Override
    public void s() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5671c;
        long j10 = this.f5670b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f32051d1);
            profileActivity.presentFragment(new e11(bundle, profileActivity.f32181w0));
        }
    }

    @Override
    public int skip(int i10) {
        return ((r3.l) this.f5671c).skip(i10);
    }

    @Override
    public void t() {
        ((r3.l) this.f5671c).t();
    }

    public String toString() {
        switch (this.f5669a) {
            case 0:
                if (((c) this.f5671c) == null) {
                    return Long.toBinaryString(this.f5670b);
                }
                return ((c) this.f5671c).toString() + "xx" + Long.toBinaryString(this.f5670b);
            default:
                return super.toString();
        }
    }

    @Override
    public void u(int i10) {
        ((r3.l) this.f5671c).u(i10);
    }

    @Override
    public void v() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5671c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j10 = this.f5670b;
        boolean z4 = notificationsSettings.getBoolean(y3.i(j10, profileActivity.f32051d1, sb), true);
        boolean z10 = !z4 ? 1 : 0;
        notificationsSettings.edit().putBoolean(y3.i(j10, profileActivity.f32051d1, new StringBuilder("sound_enabled_")), z10).apply();
        if (qc.a(profileActivity)) {
            qc.S(z4 ? 1 : 0, profileActivity, profileActivity.f32181w0).j();
        }
    }

    @Override
    public boolean w() {
        return true;
    }

    @Override
    public void x(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f5671c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f5670b, profileActivity.f32051d1)) {
                r();
            }
            if (qc.a(profileActivity)) {
                qc.z(profileActivity, 4, i10, profileActivity.f32181w0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f5670b, profileActivity.f32051d1, i10);
        if (qc.a(profileActivity)) {
            qc.z(profileActivity, 5, i10, profileActivity.f32181w0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public void y(int i10) {
        if (i10 >= 64) {
            c cVar = (c) this.f5671c;
            if (cVar != null) {
                cVar.y(i10 - 64);
                return;
            }
            return;
        }
        this.f5670b &= ~(1 << i10);
    }

    public int z(int i10) {
        c cVar = (c) this.f5671c;
        if (cVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f5670b);
            }
            return Long.bitCount(this.f5670b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f5670b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f5670b) + cVar.z(i10 - 64);
        }
    }

    public c(Object obj, long j10, int i10) {
        this.f5669a = i10;
        this.f5671c = obj;
        this.f5670b = j10;
    }

    public c(r3.l lVar, long j10) {
        this.f5669a = 11;
        this.f5671c = lVar;
        h5.a.f(lVar.getPosition() >= j10);
        this.f5670b = j10;
    }

    public c(int i10) {
        this.f5669a = i10;
        switch (i10) {
            case 2:
                this.f5671c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            case 3:
                return;
            default:
                this.f5670b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
