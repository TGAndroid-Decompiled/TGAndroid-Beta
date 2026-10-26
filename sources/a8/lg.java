package a8;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.ap;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h11;
public final class lg implements OnFailureListener, c3.p, c3.q, l2.h, ap {
    public final int f598a;
    public long f599b;
    public Object f600c;

    public lg(long j10, Object obj, int i10) {
        this.f598a = i10;
        this.f599b = j10;
        this.f600c = obj;
    }

    public void A(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            x();
            ((lg) this.f600c).A(i10 - 64, z10);
            return;
        }
        long j10 = this.f599b;
        if ((Long.MIN_VALUE & j10) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j11 = (1 << i10) - 1;
        this.f599b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            D(i10);
        } else {
            v(i10);
        }
        if (!z11 && ((lg) this.f600c) == null) {
            return;
        }
        x();
        ((lg) this.f600c).A(0, z11);
    }

    public boolean B(int i10) {
        boolean z10;
        if (i10 >= 64) {
            x();
            return ((lg) this.f600c).B(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f599b;
        if ((j11 & j10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = j11 & (~j10);
        this.f599b = j12;
        long j13 = j10 - 1;
        this.f599b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        lg lgVar = (lg) this.f600c;
        if (lgVar != null) {
            if (lgVar.z(0)) {
                D(63);
            }
            ((lg) this.f600c).B(0);
        }
        return z10;
    }

    public void C() {
        this.f599b = 0L;
        lg lgVar = (lg) this.f600c;
        if (lgVar != null) {
            lgVar.C();
        }
    }

    public void D(int i10) {
        if (i10 >= 64) {
            x();
            ((lg) this.f600c).D(i10 - 64);
            return;
        }
        this.f599b |= 1 << i10;
    }

    @Override
    public void D1(c3.b0 b0Var) {
        ((c3.q) this.f600c).D1(new c3.g0(this, b0Var, b0Var));
    }

    @Override
    public c3.j0 F1(int i10, int i11) {
        return ((c3.q) this.f600c).F1(i10, i11);
    }

    @Override
    public boolean N() {
        return true;
    }

    @Override
    public void Q0() {
        ((c3.q) this.f600c).Q0();
    }

    @Override
    public long R() {
        return 0L;
    }

    @Override
    public long V(long j10) {
        return ((c3.j) this.f600c).f6064a;
    }

    @Override
    public long W(long j10, long j11) {
        return ((c3.j) this.f600c).f6064a;
    }

    @Override
    public long a(long j10) {
        return ((c3.j) this.f600c).e[(int) j10] - this.f599b;
    }

    @Override
    public void b(int i10, int i11, byte[] bArr) {
        ((c3.p) this.f600c).b(i10, i11, bArr);
    }

    @Override
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f600c).c(bArr, 0, i11, z10);
    }

    @Override
    public int d(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.f600c).d(i10, i11, bArr);
    }

    @Override
    public long e(long j10, long j11) {
        return ((c3.j) this.f600c).d[(int) j10];
    }

    @Override
    public boolean f(int i10, boolean z10) {
        return ((c3.p) this.f600c).f(i10, true);
    }

    @Override
    public long g(long j10, long j11) {
        return 0L;
    }

    @Override
    public long getLength() {
        return ((c3.p) this.f600c).getLength() - this.f599b;
    }

    @Override
    public long getPosition() {
        return ((c3.p) this.f600c).getPosition() - this.f599b;
    }

    @Override
    public boolean h(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.f600c).h(bArr, i10, i11, z10);
    }

    @Override
    public long i() {
        return ((c3.p) this.f600c).i() - this.f599b;
    }

    @Override
    public void j(int i10) {
        ((c3.p) this.f600c).j(i10);
    }

    @Override
    public long k(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public m2.j l(long j10) {
        c3.j jVar = (c3.j) this.f600c;
        int i10 = (int) j10;
        return new m2.j(jVar.f6066c[i10], jVar.f6065b[i10], null);
    }

    @Override
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f599b);
        ?? r2Var = new org.telegram.ui.ActionBar.r2(bundle);
        r2Var.d = new ArrayList();
        r2Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f600c;
        r2Var.e = profileActivity.f36045n5;
        profileActivity.presentFragment((org.telegram.ui.ActionBar.r2) r2Var);
    }

    @Override
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.f600c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.f599b, profileActivity.f35994g1);
        profileActivity.getNotificationsController().muteDialog(this.f599b, profileActivity.f35994g1, z10);
        if (profileActivity.fragmentView != null) {
            org.telegram.ui.Components.wc.A(profileActivity, z10, null).j();
        }
        profileActivity.m5();
        profileActivity.r5(true);
    }

    @Override
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.f600c;
        long j10 = this.f599b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f35994g1);
            profileActivity.presentFragment(new h11(bundle, profileActivity.f36126z0));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10;
        switch (this.f598a) {
            case 0:
                ((mg) this.f600c).f618b.set(this.f599b);
                return;
            case 4:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i10 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i10 = 13;
                }
                long j10 = this.f599b;
                for (h6.o oVar : ((f6.h) ((h0) this.f600c).d).f10216c.d) {
                    oVar.b(j10, i10, null);
                }
                return;
            case 9:
                ((AtomicLong) ((m4.w1) this.f600c).f18294c).set(this.f599b);
                return;
            default:
                ((mg) this.f600c).f618b.set(this.f599b);
                return;
        }
    }

    @Override
    public void p() {
        ((c3.p) this.f600c).p();
    }

    @Override
    public void q(int i10) {
        ((c3.p) this.f600c).q(i10);
    }

    @Override
    public void r() {
        ProfileActivity profileActivity = (ProfileActivity) this.f600c;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ProfileActivity.f1(profileActivity));
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.f599b;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.t.j(j10, profileActivity.f35994g1, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.t.j(j10, profileActivity.f35994g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (org.telegram.ui.Components.wc.a(profileActivity)) {
            org.telegram.ui.Components.wc.T(z10 ? 1 : 0, profileActivity, profileActivity.f36126z0).j();
        }
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.f600c).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.f600c).readFully(bArr, i10, i11);
    }

    @Override
    public boolean s(int i10, boolean z10) {
        return ((c3.p) this.f600c).s(i10, true);
    }

    @Override
    public int skip(int i10) {
        return ((c3.p) this.f600c).skip(i10);
    }

    @Override
    public long t(long j10, long j11) {
        return e2.n0.f(((c3.j) this.f600c).e, j10 + this.f599b, true);
    }

    public String toString() {
        switch (this.f598a) {
            case 8:
                if (((lg) this.f600c) == null) {
                    return Long.toBinaryString(this.f599b);
                }
                return ((lg) this.f600c).toString() + "xx" + Long.toBinaryString(this.f599b);
            default:
                return super.toString();
        }
    }

    @Override
    public void u(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.f600c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.f599b, profileActivity.f35994g1)) {
                n();
            }
            if (org.telegram.ui.Components.wc.a(profileActivity)) {
                org.telegram.ui.Components.wc.z(profileActivity, 4, i10, profileActivity.f36126z0).j();
                return;
            }
            return;
        }
        int i11 = ProfileActivity.R6;
        profileActivity.getNotificationsController().muteUntil(this.f599b, profileActivity.f35994g1, i10);
        if (org.telegram.ui.Components.wc.a(profileActivity)) {
            org.telegram.ui.Components.wc.z(profileActivity, 5, i10, profileActivity.f36126z0).j();
        }
        profileActivity.m5();
        profileActivity.r5(true);
    }

    public void v(int i10) {
        if (i10 >= 64) {
            lg lgVar = (lg) this.f600c;
            if (lgVar != null) {
                lgVar.v(i10 - 64);
                return;
            }
            return;
        }
        this.f599b &= ~(1 << i10);
    }

    public int w(int i10) {
        lg lgVar = (lg) this.f600c;
        if (lgVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f599b);
            }
            return Long.bitCount(this.f599b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f599b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f599b) + lgVar.w(i10 - 64);
        }
    }

    public void x() {
        if (((lg) this.f600c) == null) {
            this.f600c = new lg(8);
        }
    }

    public void y(bd.a aVar) {
        this.f599b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f599b + ")");
        ((List) this.f600c).add(aVar);
        thread.start();
    }

    public boolean z(int i10) {
        if (i10 >= 64) {
            x();
            return ((lg) this.f600c).z(i10 - 64);
        } else if ((this.f599b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public lg(Object obj, long j10, int i10) {
        this.f598a = i10;
        this.f600c = obj;
        this.f599b = j10;
    }

    public lg(c3.p pVar, long j10) {
        this.f598a = 2;
        this.f600c = pVar;
        yb.g(pVar.getPosition() >= j10);
        this.f599b = j10;
    }

    public lg(int i10) {
        this.f598a = i10;
        switch (i10) {
            case 8:
                this.f599b = 0L;
                return;
            default:
                this.f600c = DesugarCollections.synchronizedList(new ArrayList());
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
