package f2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnFailureListener;
import g7.c9;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.y1;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.mc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cf1;
import org.telegram.ui.t01;

public final class c implements OnFailureListener, m4.h, bo, m3.l, m3.m, r4.g {

    public final int f5629a;

    public long f5630b;

    public Object f5631c;

    public c(long j10, Object obj, int i10) {
        this.f5629a = i10;
        this.f5630b = j10;
        this.f5631c = obj;
    }

    @Override
    public void A() {
        ((m3.m) this.f5631c).A();
    }

    @Override
    public boolean B() {
        return true;
    }

    @Override
    public m3.w C(int i10, int i11) {
        return ((m3.m) this.f5631c).C(i10, i11);
    }

    public void D() {
        if (((c) this.f5631c) == null) {
            this.f5631c = new c(0);
        }
    }

    @Override
    public long E() {
        return 0L;
    }

    @Override
    public long F(long j10) {
        return ((m3.f) this.f5631c).f17599a;
    }

    @Override
    public long G(long j10, long j11) {
        return ((m3.f) this.f5631c).f17599a;
    }

    public void H(hc.a aVar) {
        this.f5630b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f5630b + ")");
        ((List) this.f5631c).add(aVar);
        thread.start();
    }

    public boolean I(int i10) {
        if (i10 < 64) {
            return (this.f5630b & (1 << i10)) != 0;
        }
        D();
        return ((c) this.f5631c).I(i10 - 64);
    }

    public void J(int i10, boolean z10) {
        if (i10 >= 64) {
            D();
            ((c) this.f5631c).J(i10 - 64, z10);
            return;
        }
        long j10 = this.f5630b;
        boolean z11 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i10) - 1;
        this.f5630b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            M(i10);
        } else {
            x(i10);
        }
        if (z11 || ((c) this.f5631c) != null) {
            D();
            ((c) this.f5631c).J(0, z11);
        }
    }

    public boolean K(int i10) {
        if (i10 >= 64) {
            D();
            return ((c) this.f5631c).K(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f5630b;
        boolean z10 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.f5630b = j12;
        long j13 = j10 - 1;
        this.f5630b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        c cVar = (c) this.f5631c;
        if (cVar != null) {
            if (cVar.I(0)) {
                M(63);
            }
            ((c) this.f5631c).K(0);
        }
        return z10;
    }

    public void L() {
        this.f5630b = 0L;
        c cVar = (c) this.f5631c;
        if (cVar != null) {
            cVar.L();
        }
    }

    public void M(int i10) {
        if (i10 < 64) {
            this.f5630b |= 1 << i10;
        } else {
            D();
            ((c) this.f5631c).M(i10 - 64);
        }
    }

    public void N(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f5631c) == null) {
            this.f5631c = exc;
            this.f5630b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f5630b) {
            Exception exc2 = (Exception) this.f5631c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f5631c;
            this.f5631c = null;
            throw exc3;
        }
    }

    @Override
    public long a(long j10) {
        return ((m3.f) this.f5631c).f17602e[(int) j10] - this.f5630b;
    }

    @Override
    public void b(int i10, int i11, byte[] bArr) {
        ((m3.l) this.f5631c).b(i10, i11, bArr);
    }

    @Override
    public int c(long j10) {
        return this.f5630b > j10 ? 0 : -1;
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((m3.l) this.f5631c).d(bArr, 0, i11, z10);
    }

    @Override
    public int e(int i10, int i11, byte[] bArr) {
        return ((m3.l) this.f5631c).e(i10, i11, bArr);
    }

    @Override
    public long f(int i10) {
        d5.a.f(i10 == 0);
        return this.f5630b;
    }

    @Override
    public boolean g(byte[] bArr, int i10, int i11, boolean z10) {
        return ((m3.l) this.f5631c).g(bArr, i10, i11, z10);
    }

    @Override
    public long getLength() {
        return ((m3.l) this.f5631c).getLength() - this.f5630b;
    }

    @Override
    public long getPosition() {
        return ((m3.l) this.f5631c).getPosition() - this.f5630b;
    }

    @Override
    public List h(long j10) {
        if (j10 >= this.f5630b) {
            return (p8.z) this.f5631c;
        }
        p8.x xVar = p8.z.f45604b;
        return p8.l0.f45555e;
    }

    @Override
    public long i() {
        return ((m3.l) this.f5631c).i() - this.f5630b;
    }

    @Override
    public void j(int i10) {
        ((m3.l) this.f5631c).j(i10);
    }

    @Override
    public void k() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f5630b);
        cf1 cf1Var = new cf1(bundle);
        cf1Var.d = new ArrayList();
        cf1Var.f37080e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f5631c;
        cf1Var.f37080e = profileActivity.f35948d5;
        profileActivity.presentFragment(cf1Var);
    }

    @Override
    public long l(long j10, long j11) {
        return ((m3.f) this.f5631c).d[(int) j10];
    }

    @Override
    public void m() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5631c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f5630b, profileActivity.f35937c1);
        profileActivity.getNotificationsController().muteDialog(this.f5630b, profileActivity.f35937c1, z10);
        if (profileActivity.fragmentView != null) {
            mc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public void n(m3.t tVar) {
        ((m3.m) this.f5631c).n(new r3.c(this, tVar));
    }

    @Override
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5631c;
        long j10 = this.f5630b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f35937c1);
            profileActivity.presentFragment(new t01(bundle, profileActivity.f36067v0));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        switch (this.f5629a) {
            case 1:
                ((c9) this.f5631c).f6435b.set(this.f5630b);
                break;
            case 2:
            case 4:
            default:
                int statusCode = exc instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exc).getStatusCode() : 13;
                long j10 = this.f5630b;
                Iterator it = ((o5.h) ((j9.a) this.f5631c).d).f19333c.d.iterator();
                while (it.hasNext()) {
                    ((r5.p) it.next()).b(j10, statusCode, null);
                }
                break;
            case 3:
                ((c9) this.f5631c).f6435b.set(this.f5630b);
                break;
            case 5:
                ((c9) this.f5631c).f6435b.set(this.f5630b);
                break;
        }
    }

    @Override
    public int p() {
        return 1;
    }

    @Override
    public void q() {
        ((m3.l) this.f5631c).q();
    }

    @Override
    public long r(long j10, long j11) {
        return 0L;
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((m3.l) this.f5631c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((m3.l) this.f5631c).readFully(bArr, i10, i11);
    }

    @Override
    public long s(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public int skip(int i10) {
        return ((m3.l) this.f5631c).skip(i10);
    }

    @Override
    public void t(int i10) {
        ((m3.l) this.f5631c).t(i10);
    }

    public String toString() {
        switch (this.f5629a) {
            case 0:
                if (((c) this.f5631c) == null) {
                    return Long.toBinaryString(this.f5630b);
                }
                return ((c) this.f5631c).toString() + "xx" + Long.toBinaryString(this.f5630b);
            default:
                return super.toString();
        }
    }

    @Override
    public void u() {
        ProfileActivity profileActivity = (ProfileActivity) this.f5631c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((n2) profileActivity).currentAccount);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.f5630b;
        boolean z10 = notificationsSettings.getBoolean(y1.j(j10, profileActivity.f35937c1, sb2), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean(y1.j(j10, profileActivity.f35937c1, new StringBuilder("sound_enabled_")), z11).apply();
        if (mc.a(profileActivity)) {
            mc.S(z10 ? 1 : 0, profileActivity, profileActivity.f36067v0).j();
        }
    }

    @Override
    public void v(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f5631c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f5630b, profileActivity.f35937c1)) {
                m();
            }
            if (mc.a(profileActivity)) {
                mc.z(profileActivity, 4, i10, profileActivity.f36067v0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.f5630b, profileActivity.f35937c1, i10);
        if (mc.a(profileActivity)) {
            mc.z(profileActivity, 5, i10, profileActivity.f36067v0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override
    public n4.j w(long j10) {
        m3.f fVar = (m3.f) this.f5631c;
        int i10 = (int) j10;
        return new n4.j(fVar.f17601c[i10], fVar.f17600b[i10], null);
    }

    public void x(int i10) {
        if (i10 < 64) {
            this.f5630b &= ~(1 << i10);
            return;
        }
        c cVar = (c) this.f5631c;
        if (cVar != null) {
            cVar.x(i10 - 64);
        }
    }

    @Override
    public long y(long j10, long j11) {
        return d5.g0.e(((m3.f) this.f5631c).f17602e, j10 + this.f5630b, true);
    }

    public int z(int i10) {
        c cVar = (c) this.f5631c;
        if (cVar == null) {
            return i10 >= 64 ? Long.bitCount(this.f5630b) : Long.bitCount(this.f5630b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f5630b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f5630b) + cVar.z(i10 - 64);
    }

    public c(Object obj, long j10, int i10) {
        this.f5629a = i10;
        this.f5631c = obj;
        this.f5630b = j10;
    }

    public c(m3.l lVar, long j10) {
        this.f5629a = 10;
        this.f5631c = lVar;
        d5.a.f(lVar.getPosition() >= j10);
        this.f5630b = j10;
    }

    public c(int i10) {
        this.f5629a = i10;
        switch (i10) {
            case 2:
                this.f5631c = DesugarCollections.synchronizedList(new ArrayList());
                break;
            case 3:
            default:
                this.f5630b = 0L;
                break;
            case 4:
                break;
        }
    }

    @Override
    public void dismiss() {
    }
}
