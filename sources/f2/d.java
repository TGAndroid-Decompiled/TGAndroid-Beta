package f2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnFailureListener;
import f7.d9;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.oc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s01;
public final class d implements OnFailureListener, m4.h, eo, m3.l, m3.m, r4.f {
    public final int f5336a;
    public long f5337b;
    public Object f5338c;

    public d(long j10, Object obj, int i9) {
        this.f5336a = i9;
        this.f5337b = j10;
        this.f5338c = obj;
    }

    @Override
    public void A(int i9) {
        ProfileActivity profileActivity = (ProfileActivity) this.f5338c;
        if (i9 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f5337b, profileActivity.f35934c1)) {
                p();
            }
            if (oc.a(profileActivity)) {
                oc.z(profileActivity, 4, i9, profileActivity.f36064v0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f5337b, profileActivity.f35934c1, i9);
        if (oc.a(profileActivity)) {
            oc.z(profileActivity, 5, i9, profileActivity.f36064v0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void B() {
        ((m3.m) this.f5338c).B();
    }

    @Override
    public long C(long j10, long j11) {
        return ((m3.f) this.f5338c).f17223a;
    }

    public void D(int i9) {
        if (i9 >= 64) {
            d dVar = (d) this.f5338c;
            if (dVar != null) {
                dVar.D(i9 - 64);
                return;
            }
            return;
        }
        this.f5337b &= ~(1 << i9);
    }

    public int E(int i9) {
        d dVar = (d) this.f5338c;
        if (dVar == null) {
            if (i9 >= 64) {
                return Long.bitCount(this.f5337b);
            }
            return Long.bitCount(this.f5337b & ((1 << i9) - 1));
        } else if (i9 < 64) {
            return Long.bitCount(this.f5337b & ((1 << i9) - 1));
        } else {
            return Long.bitCount(this.f5337b) + dVar.E(i9 - 64);
        }
    }

    public void F() {
        if (((d) this.f5338c) == null) {
            this.f5338c = new d(0);
        }
    }

    public void G(gc.a aVar) {
        this.f5337b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f5337b + ")");
        ((List) this.f5338c).add(aVar);
        thread.start();
    }

    public boolean H(int i9) {
        if (i9 >= 64) {
            F();
            return ((d) this.f5338c).H(i9 - 64);
        } else if ((this.f5337b & (1 << i9)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public m3.w I(int i9, int i10) {
        return ((m3.m) this.f5338c).I(i9, i10);
    }

    public void J(int i9, boolean z10) {
        boolean z11;
        if (i9 >= 64) {
            F();
            ((d) this.f5338c).J(i9 - 64, z10);
            return;
        }
        long j10 = this.f5337b;
        if ((Long.MIN_VALUE & j10) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j11 = (1 << i9) - 1;
        this.f5337b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            M(i9);
        } else {
            D(i9);
        }
        if (!z11 && ((d) this.f5338c) == null) {
            return;
        }
        F();
        ((d) this.f5338c).J(0, z11);
    }

    public boolean K(int i9) {
        boolean z10;
        if (i9 >= 64) {
            F();
            return ((d) this.f5338c).K(i9 - 64);
        }
        long j10 = 1 << i9;
        long j11 = this.f5337b;
        if ((j11 & j10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = j11 & (~j10);
        this.f5337b = j12;
        long j13 = j10 - 1;
        this.f5337b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        d dVar = (d) this.f5338c;
        if (dVar != null) {
            if (dVar.H(0)) {
                M(63);
            }
            ((d) this.f5338c).K(0);
        }
        return z10;
    }

    public void L() {
        this.f5337b = 0L;
        d dVar = (d) this.f5338c;
        if (dVar != null) {
            dVar.L();
        }
    }

    public void M(int i9) {
        if (i9 >= 64) {
            F();
            ((d) this.f5338c).M(i9 - 64);
            return;
        }
        this.f5337b |= 1 << i9;
    }

    public void N(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f5338c) == null) {
            this.f5338c = exc;
            this.f5337b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f5337b) {
            Exception exc2 = (Exception) this.f5338c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f5338c;
            this.f5338c = null;
            throw exc3;
        }
    }

    @Override
    public long a(long j10) {
        return ((m3.f) this.f5338c).f17226e[(int) j10] - this.f5337b;
    }

    @Override
    public int b(long j10) {
        if (this.f5337b > j10) {
            return 0;
        }
        return -1;
    }

    @Override
    public void c(int i9, int i10, byte[] bArr) {
        ((m3.l) this.f5338c).c(i9, i10, bArr);
    }

    @Override
    public boolean d(byte[] bArr, int i9, int i10, boolean z10) {
        return ((m3.l) this.f5338c).d(bArr, 0, i10, z10);
    }

    @Override
    public int e(int i9, int i10, byte[] bArr) {
        return ((m3.l) this.f5338c).e(i9, i10, bArr);
    }

    @Override
    public long f(long j10, long j11) {
        return ((m3.f) this.f5338c).d[(int) j10];
    }

    @Override
    public boolean g(byte[] bArr, int i9, int i10, boolean z10) {
        return ((m3.l) this.f5338c).g(bArr, i9, i10, z10);
    }

    @Override
    public long getLength() {
        return ((m3.l) this.f5338c).getLength() - this.f5337b;
    }

    @Override
    public long getPosition() {
        return ((m3.l) this.f5338c).getPosition() - this.f5337b;
    }

    @Override
    public long h(int i9) {
        boolean z10;
        if (i9 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        return this.f5337b;
    }

    @Override
    public long i(long j10, long j11) {
        return 0L;
    }

    @Override
    public long j(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public long k() {
        return ((m3.l) this.f5338c).k() - this.f5337b;
    }

    @Override
    public n4.j l(long j10) {
        m3.f fVar = (m3.f) this.f5338c;
        int i9 = (int) j10;
        return new n4.j(fVar.f17225c[i9], fVar.f17224b[i9], null);
    }

    @Override
    public List m(long j10) {
        if (j10 >= this.f5337b) {
            return (o8.z) this.f5338c;
        }
        o8.x xVar = o8.z.f19105b;
        return o8.l0.f19056e;
    }

    @Override
    public void n(int i9) {
        ((m3.l) this.f5338c).n(i9);
    }

    @Override
    public void o() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f5337b);
        ?? o2Var = new o2(bundle);
        o2Var.d = new ArrayList();
        o2Var.f37533e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f5338c;
        o2Var.f37533e = profileActivity.f35945d5;
        profileActivity.presentFragment((o2) o2Var);
    }

    @Override
    public void onFailure(Exception exc) {
        int i9;
        switch (this.f5336a) {
            case 1:
                ((d9) this.f5338c).f5644b.set(this.f5337b);
                return;
            case 2:
            case 4:
            default:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i9 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i9 = 13;
                }
                long j10 = this.f5337b;
                for (q5.p pVar : ((o5.h) ((j4.c) this.f5338c).d).f18986c.d) {
                    pVar.b(j10, i9, null);
                }
                return;
            case 3:
                ((d9) this.f5338c).f5644b.set(this.f5337b);
                return;
            case 5:
                ((d9) this.f5338c).f5644b.set(this.f5337b);
                return;
        }
    }

    @Override
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5338c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f5337b, profileActivity.f35934c1);
        profileActivity.getNotificationsController().muteDialog(this.f5337b, profileActivity.f35934c1, z10);
        if (profileActivity.fragmentView != null) {
            oc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public long q(long j10, long j11) {
        return d5.f0.e(((m3.f) this.f5338c).f17226e, j10 + this.f5337b, true);
    }

    @Override
    public int r() {
        return 1;
    }

    @Override
    public int read(byte[] bArr, int i9, int i10) {
        return ((m3.l) this.f5338c).read(bArr, i9, i10);
    }

    @Override
    public void readFully(byte[] bArr, int i9, int i10) {
        ((m3.l) this.f5338c).readFully(bArr, i9, i10);
    }

    @Override
    public void s() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5338c;
        long j10 = this.f5337b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f35934c1);
            profileActivity.presentFragment(new s01(bundle, profileActivity.f36064v0));
        }
    }

    @Override
    public int skip(int i9) {
        return ((m3.l) this.f5338c).skip(i9);
    }

    @Override
    public void t() {
        ((m3.l) this.f5338c).t();
    }

    public String toString() {
        switch (this.f5336a) {
            case 0:
                if (((d) this.f5338c) == null) {
                    return Long.toBinaryString(this.f5337b);
                }
                return ((d) this.f5338c).toString() + "xx" + Long.toBinaryString(this.f5337b);
            default:
                return super.toString();
        }
    }

    @Override
    public void u(int i9) {
        ((m3.l) this.f5338c).u(i9);
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public void w() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5338c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.c1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.f5337b;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.l0.i(j10, profileActivity.f35934c1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.l0.i(j10, profileActivity.f35934c1, new StringBuilder("sound_enabled_")), z11).apply();
        if (oc.a(profileActivity)) {
            oc.S(z10 ? 1 : 0, profileActivity, profileActivity.f36064v0).j();
        }
    }

    @Override
    public long x() {
        return 0L;
    }

    @Override
    public void y(m3.t tVar) {
        ((m3.m) this.f5338c).y(new r3.c(this, tVar));
    }

    @Override
    public long z(long j10) {
        return ((m3.f) this.f5338c).f17223a;
    }

    public d(Object obj, long j10, int i9) {
        this.f5336a = i9;
        this.f5338c = obj;
        this.f5337b = j10;
    }

    public d(m3.l lVar, long j10) {
        this.f5336a = 10;
        this.f5338c = lVar;
        d5.a.f(lVar.getPosition() >= j10);
        this.f5337b = j10;
    }

    public d(int i9) {
        this.f5336a = i9;
        switch (i9) {
            case 2:
                this.f5338c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            case 3:
            default:
                this.f5337b = 0L;
                return;
            case 4:
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
