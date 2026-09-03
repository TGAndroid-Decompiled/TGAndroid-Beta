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
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.qc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l11;
public final class c implements OnFailureListener, jo, r4.h, v4.f, r3.l, r3.m {
    public final int f5658a;
    public long f5659b;
    public Object f5660c;

    public c(long j10, Object obj, int i10) {
        this.f5658a = i10;
        this.f5659b = j10;
        this.f5660c = obj;
    }

    public void A() {
        this.f5659b = 0L;
        c cVar = (c) this.f5660c;
        if (cVar != null) {
            cVar.A();
        }
    }

    public void B(int i10) {
        if (i10 >= 64) {
            v();
            ((c) this.f5660c).B(i10 - 64);
            return;
        }
        this.f5659b |= 1 << i10;
    }

    public void C(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f5660c) == null) {
            this.f5660c = exc;
            this.f5659b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f5659b) {
            Exception exc2 = (Exception) this.f5660c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f5660c;
            this.f5660c = null;
            throw exc3;
        }
    }

    @Override
    public long G(long j10, long j11) {
        return 0L;
    }

    @Override
    public long K(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public long N1(long j10) {
        return ((r3.f) this.f5660c).f43235a;
    }

    @Override
    public long P1(long j10, long j11) {
        return ((r3.f) this.f5660c).f43235a;
    }

    @Override
    public s4.j V(long j10) {
        r3.f fVar = (r3.f) this.f5660c;
        int i10 = (int) j10;
        return new s4.j(fVar.f43237c[i10], fVar.f43236b[i10], null);
    }

    @Override
    public long a(long j10) {
        return ((r3.f) this.f5660c).e[(int) j10] - this.f5659b;
    }

    @Override
    public void b(int i10, int i11, byte[] bArr) {
        ((r3.l) this.f5660c).b(i10, i11, bArr);
    }

    @Override
    public boolean c(byte[] bArr, int i10, int i11, boolean z4) {
        return ((r3.l) this.f5660c).c(bArr, 0, i11, z4);
    }

    @Override
    public int d(int i10, int i11, byte[] bArr) {
        return ((r3.l) this.f5660c).d(i10, i11, bArr);
    }

    @Override
    public r3.v d2(int i10, int i11) {
        return ((r3.m) this.f5660c).d2(i10, i11);
    }

    @Override
    public int e(long j10) {
        if (this.f5659b > j10) {
            return 0;
        }
        return -1;
    }

    @Override
    public boolean f(byte[] bArr, int i10, int i11, boolean z4) {
        return ((r3.l) this.f5660c).f(bArr, i10, i11, z4);
    }

    @Override
    public long g() {
        return ((r3.l) this.f5660c).g() - this.f5659b;
    }

    @Override
    public long getLength() {
        return ((r3.l) this.f5660c).getLength() - this.f5659b;
    }

    @Override
    public long getPosition() {
        return ((r3.l) this.f5660c).getPosition() - this.f5659b;
    }

    @Override
    public long h(int i10) {
        boolean z4;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        return this.f5659b;
    }

    @Override
    public void h2(r3.s sVar) {
        ((r3.m) this.f5660c).h2(new w3.c(this, sVar));
    }

    @Override
    public void i(int i10) {
        ((r3.l) this.f5660c).i(i10);
    }

    @Override
    public void j() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f5659b);
        ?? p2Var = new p2(bundle);
        p2Var.d = new ArrayList();
        p2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f5660c;
        p2Var.e = profileActivity.f32036e5;
        profileActivity.presentFragment((p2) p2Var);
    }

    @Override
    public void j1() {
        ((r3.m) this.f5660c).j1();
    }

    @Override
    public void k() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5660c;
        boolean z4 = !profileActivity.getMessagesController().isDialogMuted(this.f5659b, profileActivity.f32025d1);
        profileActivity.getNotificationsController().muteDialog(this.f5659b, profileActivity.f32025d1, z4);
        if (profileActivity.fragmentView != null) {
            qc.A(profileActivity, z4, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void l() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5660c;
        long j10 = this.f5659b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f32025d1);
            profileActivity.presentFragment(new l11(bundle, profileActivity.f32155w0));
        }
    }

    @Override
    public void m() {
        ((r3.l) this.f5660c).m();
    }

    @Override
    public void n(int i10) {
        ((r3.l) this.f5660c).n(i10);
    }

    @Override
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5660c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j10 = this.f5659b;
        boolean z4 = notificationsSettings.getBoolean(y3.i(j10, profileActivity.f32025d1, sb), true);
        boolean z10 = !z4 ? 1 : 0;
        notificationsSettings.edit().putBoolean(y3.i(j10, profileActivity.f32025d1, new StringBuilder("sound_enabled_")), z10).apply();
        if (qc.a(profileActivity)) {
            qc.S(z4 ? 1 : 0, profileActivity, profileActivity.f32155w0).j();
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f5658a) {
            case 1:
                ((d9) this.f5660c).f8959b.set(this.f5659b);
                return;
            case 2:
            case 3:
            default:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j10 = this.f5659b;
                for (u5.p pVar : ((s5.h) ((s5.m) this.f5660c).d).f44139c.d) {
                    pVar.b(j10, i10, null);
                }
                return;
            case 4:
                ((d9) this.f5660c).f8959b.set(this.f5659b);
                return;
            case 5:
                ((d9) this.f5660c).f8959b.set(this.f5659b);
                return;
        }
    }

    @Override
    public long p(long j10, long j11) {
        return ((r3.f) this.f5660c).d[(int) j10];
    }

    @Override
    public List q(long j10) {
        if (j10 >= this.f5659b) {
            return (s8.v) this.f5660c;
        }
        s8.t tVar = s8.v.f44222b;
        return s8.i0.e;
    }

    @Override
    public boolean q1() {
        return true;
    }

    @Override
    public int r() {
        return 1;
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((r3.l) this.f5660c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((r3.l) this.f5660c).readFully(bArr, i10, i11);
    }

    @Override
    public void s(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f5660c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f5659b, profileActivity.f32025d1)) {
                k();
            }
            if (qc.a(profileActivity)) {
                qc.z(profileActivity, 4, i10, profileActivity.f32155w0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f5659b, profileActivity.f32025d1, i10);
        if (qc.a(profileActivity)) {
            qc.z(profileActivity, 5, i10, profileActivity.f32155w0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public int skip(int i10) {
        return ((r3.l) this.f5660c).skip(i10);
    }

    public void t(int i10) {
        if (i10 >= 64) {
            c cVar = (c) this.f5660c;
            if (cVar != null) {
                cVar.t(i10 - 64);
                return;
            }
            return;
        }
        this.f5659b &= ~(1 << i10);
    }

    public String toString() {
        switch (this.f5658a) {
            case 0:
                if (((c) this.f5660c) == null) {
                    return Long.toBinaryString(this.f5659b);
                }
                return ((c) this.f5660c).toString() + "xx" + Long.toBinaryString(this.f5659b);
            default:
                return super.toString();
        }
    }

    public int u(int i10) {
        c cVar = (c) this.f5660c;
        if (cVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f5659b);
            }
            return Long.bitCount(this.f5659b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f5659b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f5659b) + cVar.u(i10 - 64);
        }
    }

    @Override
    public long u0(long j10, long j11) {
        return h5.d0.e(((r3.f) this.f5660c).e, j10 + this.f5659b, true);
    }

    public void v() {
        if (((c) this.f5660c) == null) {
            this.f5660c = new c(0);
        }
    }

    public void w(kc.a aVar) {
        this.f5659b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f5659b + ")");
        ((List) this.f5660c).add(aVar);
        thread.start();
    }

    public boolean x(int i10) {
        if (i10 >= 64) {
            v();
            return ((c) this.f5660c).x(i10 - 64);
        } else if ((this.f5659b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public long x1() {
        return 0L;
    }

    public void y(int i10, boolean z4) {
        boolean z10;
        if (i10 >= 64) {
            v();
            ((c) this.f5660c).y(i10 - 64, z4);
            return;
        }
        long j10 = this.f5659b;
        if ((Long.MIN_VALUE & j10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = (1 << i10) - 1;
        this.f5659b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z4) {
            B(i10);
        } else {
            t(i10);
        }
        if (!z10 && ((c) this.f5660c) == null) {
            return;
        }
        v();
        ((c) this.f5660c).y(0, z10);
    }

    public boolean z(int i10) {
        boolean z4;
        if (i10 >= 64) {
            v();
            return ((c) this.f5660c).z(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f5659b;
        if ((j11 & j10) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        long j12 = j11 & (~j10);
        this.f5659b = j12;
        long j13 = j10 - 1;
        this.f5659b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        c cVar = (c) this.f5660c;
        if (cVar != null) {
            if (cVar.x(0)) {
                B(63);
            }
            ((c) this.f5660c).z(0);
        }
        return z4;
    }

    public c(Object obj, long j10, int i10) {
        this.f5658a = i10;
        this.f5660c = obj;
        this.f5659b = j10;
    }

    public c(r3.l lVar, long j10) {
        this.f5658a = 11;
        this.f5660c = lVar;
        h5.a.f(lVar.getPosition() >= j10);
        this.f5659b = j10;
    }

    public c(int i10) {
        this.f5658a = i10;
        switch (i10) {
            case 2:
                this.f5660c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            case 3:
                return;
            default:
                this.f5659b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
