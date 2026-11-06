package a8;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.dt;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.xn;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gx0;
public final class ua implements OnFailureListener, f3.p, f3.q, o2.i, xn, wi.w0 {
    public final int f678a;
    public long f679b;
    public Object f680c;

    public ua(long j3, Object obj, int i7) {
        this.f678a = i7;
        this.f679b = j3;
        this.f680c = obj;
    }

    public void A(int i7) {
        if (i7 >= 64) {
            ua uaVar = (ua) this.f680c;
            if (uaVar != null) {
                uaVar.A(i7 - 64);
                return;
            }
            return;
        }
        this.f679b &= ~(1 << i7);
    }

    public int B(int i7) {
        ua uaVar = (ua) this.f680c;
        if (uaVar == null) {
            if (i7 >= 64) {
                return Long.bitCount(this.f679b);
            }
            return Long.bitCount(this.f679b & ((1 << i7) - 1));
        } else if (i7 < 64) {
            return Long.bitCount(this.f679b & ((1 << i7) - 1));
        } else {
            return Long.bitCount(this.f679b) + uaVar.B(i7 - 64);
        }
    }

    public void C() {
        if (((ua) this.f680c) == null) {
            this.f680c = new ua(8);
        }
    }

    public void D(yc.a aVar) {
        this.f679b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f679b + ")");
        ((List) this.f680c).add(aVar);
        thread.start();
    }

    public boolean E(int i7) {
        if (i7 >= 64) {
            C();
            return ((ua) this.f680c).E(i7 - 64);
        } else if ((this.f679b & (1 << i7)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void F(int i7, boolean z9) {
        boolean z10;
        if (i7 >= 64) {
            C();
            ((ua) this.f680c).F(i7 - 64, z9);
            return;
        }
        long j3 = this.f679b;
        if ((Long.MIN_VALUE & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = (1 << i7) - 1;
        this.f679b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z9) {
            I(i7);
        } else {
            A(i7);
        }
        if (!z10 && ((ua) this.f680c) == null) {
            return;
        }
        C();
        ((ua) this.f680c).F(0, z10);
    }

    public boolean G(int i7) {
        boolean z9;
        if (i7 >= 64) {
            C();
            return ((ua) this.f680c).G(i7 - 64);
        }
        long j3 = 1 << i7;
        long j10 = this.f679b;
        if ((j10 & j3) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        long j11 = j10 & (~j3);
        this.f679b = j11;
        long j12 = j3 - 1;
        this.f679b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        ua uaVar = (ua) this.f680c;
        if (uaVar != null) {
            if (uaVar.E(0)) {
                I(63);
            }
            ((ua) this.f680c).G(0);
        }
        return z9;
    }

    public void H() {
        this.f679b = 0L;
        ua uaVar = (ua) this.f680c;
        if (uaVar != null) {
            uaVar.H();
        }
    }

    public void I(int i7) {
        if (i7 >= 64) {
            C();
            ((ua) this.f680c).I(i7 - 64);
            return;
        }
        this.f679b |= 1 << i7;
    }

    @Override
    public void L() {
        ProfileActivity profileActivity = (ProfileActivity) this.f680c;
        SharedPreferences sharedPreferences = qp.s1(ProfileActivity.k1(profileActivity)).f24757d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.f679b;
        sb2.append(dt.v(j3, profileActivity.f41727f1, false));
        boolean z9 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z10 = !z9 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + dt.v(j3, profileActivity.f41727f1, false), z10).apply();
        if (hc.a(profileActivity)) {
            hc.S(z9 ? 1 : 0, profileActivity, profileActivity.f41865z0).j();
        }
    }

    @Override
    public f3.j0 O1(int i7, int i10) {
        return ((f3.q) this.f680c).O1(i7, i10);
    }

    @Override
    public void R(int i7) {
        ProfileActivity profileActivity = (ProfileActivity) this.f680c;
        if (i7 == 0) {
            if (profileActivity.getMessagesController().r2(this.f679b, profileActivity.f41727f1, null)) {
                p();
            }
            if (hc.a(profileActivity)) {
                hc.z(profileActivity, 4, i7, profileActivity.f41865z0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.S6;
        profileActivity.getNotificationsController().H(this.f679b, i7, profileActivity.f41727f1);
        if (hc.a(profileActivity)) {
            hc.z(profileActivity, 5, i7, profileActivity.f41865z0).j();
        }
        profileActivity.v5();
        profileActivity.F5(true);
    }

    @Override
    public void U0() {
        ((f3.q) this.f680c).U0();
    }

    @Override
    public long a(long j3) {
        return ((f3.j) this.f680c).f11041e[(int) j3] - this.f679b;
    }

    @Override
    public void b(int i7, int i10, byte[] bArr) {
        ((f3.p) this.f680c).b(i7, i10, bArr);
    }

    @Override
    public boolean c(byte[] bArr, int i7, int i10, boolean z9) {
        return ((f3.p) this.f680c).c(bArr, 0, i10, z9);
    }

    @Override
    public long d(long j3, long j10) {
        return ((f3.j) this.f680c).d[(int) j3];
    }

    @Override
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override
    public void f(f3.c0 c0Var) {
        ((f3.q) this.f680c).f(new f3.h0(this, c0Var, c0Var));
    }

    @Override
    public long g(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public long getLength() {
        return ((f3.p) this.f680c).getLength() - this.f679b;
    }

    @Override
    public long getPosition() {
        return ((f3.p) this.f680c).getPosition() - this.f679b;
    }

    @Override
    public p2.j h(long j3) {
        f3.j jVar = (f3.j) this.f680c;
        int i7 = (int) j3;
        return new p2.j(jVar.f11040c[i7], null, jVar.f11039b[i7]);
    }

    @Override
    public int i(int i7, int i10, byte[] bArr) {
        return ((f3.p) this.f680c).i(i7, i10, bArr);
    }

    @Override
    public boolean j(int i7, boolean z9) {
        return ((f3.p) this.f680c).j(i7, true);
    }

    @Override
    public boolean k(byte[] bArr, int i7, int i10, boolean z9) {
        return ((f3.p) this.f680c).k(bArr, i7, i10, z9);
    }

    @Override
    public long l() {
        return ((f3.p) this.f680c).l() - this.f679b;
    }

    @Override
    public void m(int i7) {
        ((f3.p) this.f680c).m(i7);
    }

    @Override
    public void n() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f679b);
        ?? f2Var = new org.telegram.ui.ActionBar.f2(bundle);
        f2Var.d = new ArrayList();
        f2Var.f44239e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.f680c;
        f2Var.f44239e = profileActivity.f41745h5;
        profileActivity.presentFragment((org.telegram.ui.ActionBar.f2) f2Var);
    }

    @Override
    public long o(long j3, long j10) {
        return h2.m0.f(((f3.j) this.f680c).f11041e, j3 + this.f679b, true);
    }

    @Override
    public void onFailure(Exception exc) {
        int i7;
        switch (this.f678a) {
            case 0:
                ((va) this.f680c).f689b.set(this.f679b);
                return;
            case 1:
                ((va) this.f680c).f689b.set(this.f679b);
                return;
            case 2:
            case 3:
            default:
                ((va) this.f680c).f689b.set(this.f679b);
                return;
            case 4:
                if (exc instanceof com.google.android.gms.common.api.f) {
                    i7 = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                } else {
                    i7 = 13;
                }
                long j3 = this.f679b;
                for (j6.o oVar : ((h6.h) ((h6.m) this.f680c).d).f14249c.d) {
                    oVar.b(j3, i7, null);
                }
                return;
        }
    }

    @Override
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.f680c;
        boolean z9 = !profileActivity.getMessagesController().r2(this.f679b, profileActivity.f41727f1, null);
        profileActivity.getNotificationsController().G(this.f679b, profileActivity.f41727f1, z9);
        if (profileActivity.fragmentView != null) {
            hc.A(profileActivity, z9, null).j();
        }
        profileActivity.v5();
        profileActivity.F5(true);
    }

    @Override
    public void q() {
        ((f3.p) this.f680c).q();
    }

    @Override
    public void r(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((wi.x) this.f680c).q(true, byteBuffer, bufferInfo, -this.f679b);
    }

    @Override
    public int read(byte[] bArr, int i7, int i10) {
        return ((f3.p) this.f680c).read(bArr, i7, i10);
    }

    @Override
    public void readFully(byte[] bArr, int i7, int i10) {
        ((f3.p) this.f680c).readFully(bArr, i7, i10);
    }

    @Override
    public void s(int i7) {
        ((f3.p) this.f680c).s(i7);
    }

    @Override
    public int skip(int i7) {
        return ((f3.p) this.f680c).skip(i7);
    }

    @Override
    public boolean t() {
        return true;
    }

    public String toString() {
        switch (this.f678a) {
            case 8:
                if (((ua) this.f680c) == null) {
                    return Long.toBinaryString(this.f679b);
                }
                return ((ua) this.f680c).toString() + "xx" + Long.toBinaryString(this.f679b);
            default:
                return super.toString();
        }
    }

    @Override
    public long u() {
        return 0L;
    }

    @Override
    public boolean v(int i7, boolean z9) {
        return ((f3.p) this.f680c).v(i7, true);
    }

    @Override
    public void w(MediaFormat mediaFormat) {
        ((wi.x) this.f680c).n(mediaFormat, true);
    }

    @Override
    public long x(long j3) {
        return ((f3.j) this.f680c).f11038a;
    }

    @Override
    public void y() {
        ProfileActivity profileActivity = (ProfileActivity) this.f680c;
        long j3 = this.f679b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f41727f1);
            profileActivity.presentFragment(new gx0(bundle, profileActivity.f41865z0));
        }
    }

    @Override
    public long z(long j3, long j10) {
        return ((f3.j) this.f680c).f11038a;
    }

    public ua(Object obj, long j3, int i7) {
        this.f678a = i7;
        this.f680c = obj;
        this.f679b = j3;
    }

    public ua(f3.p pVar, long j3) {
        this.f678a = 2;
        this.f680c = pVar;
        ia.f(pVar.getPosition() >= j3);
        this.f679b = j3;
    }

    public ua(int i7) {
        this.f678a = i7;
        switch (i7) {
            case 11:
                this.f680c = DesugarCollections.synchronizedList(new ArrayList());
                return;
            default:
                this.f679b = 0L;
                return;
        }
    }

    @Override
    public void dismiss() {
    }
}
