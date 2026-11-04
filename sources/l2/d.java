package l2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.media.AudioDescriptor;
import android.os.SystemClock;
import com.google.firebase.FirebaseCommonRegistrar;
import g2.p;
import g9.i0;
import m2.h0;
import m2.n;
import m2.n0;
import m2.o0;
import m2.p0;
import m2.s0;
import m2.x;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s1;
public final class d implements p, p1, f9.k, k5.g, bb.d {
    public final int f17688a;

    public d(int i3) {
        this.f17688a = i3;
    }

    public static AudioDescriptor d(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override
    public String a(Context context) {
        switch (this.f17688a) {
            case 28:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                return "";
            default:
                return FirebaseCommonRegistrar.a(context);
        }
    }

    @Override
    public Object apply(Object obj) {
        return i0.u(Integer.valueOf(((x2.i) obj).f58159a));
    }

    @Override
    public void g(s1 s1Var, int i3) {
        switch (this.f17688a) {
            case 14:
                s1Var.dismiss();
                return;
            default:
                s1Var.dismiss();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        long j10;
        x xVar;
        switch (this.f17688a) {
            case 0:
                ((b) obj).getClass();
                return;
            case 1:
                ((b) obj).getClass();
                return;
            case 2:
                ((b) obj).getClass();
                return;
            case 3:
                ((b) obj).getClass();
                return;
            case 4:
                ((b) obj).getClass();
                return;
            case 5:
                ((b) obj).getClass();
                return;
            case 6:
                ((b) obj).getClass();
                return;
            case 7:
                ((b) obj).getClass();
                return;
            case 8:
                ((b) obj).getClass();
                return;
            case 9:
                ((b) obj).getClass();
                return;
            case 10:
                ((b) obj).getClass();
                return;
            case 11:
                ((b) obj).getClass();
                return;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                x xVar2 = ((n0) obj).f18953a.f18993n;
                if (xVar2 != null) {
                    xVar2.G();
                    return;
                }
                return;
            case 18:
                o0 o0Var = (o0) obj;
                s0 s0Var = o0Var.f18955b;
                if (o0Var.equals(s0Var.f18989j) && s0Var.f18993n != null) {
                    p0 p0Var = s0Var.f18995p;
                    int i3 = p0Var.f18960b;
                    if (i3 != -1) {
                        long j11 = ((n) p0Var.f18962e).f18948f / i3;
                        h0 h0Var = s0Var.f18999t;
                        h0Var.getClass();
                        j10 = g2.n0.Y(h0Var.f18866a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    s0Var.f18993n.e0(g2.n0.h0(j10), ((n) s0Var.f18995p.f18962e).f18948f, SystemClock.elapsedRealtime() - s0Var.W);
                    return;
                }
                return;
            case 19:
                o0 o0Var2 = (o0) obj;
                o0Var2.getClass();
                s0.f18979c0.getAndDecrement();
                x xVar3 = o0Var2.f18955b.f18993n;
                if (xVar3 != 0) {
                    int i10 = o0Var2.f18954a.f18944a;
                    xVar3.v(new Object());
                    return;
                }
                return;
            case 20:
                o0 o0Var3 = (o0) obj;
                s0 s0Var2 = o0Var3.f18955b;
                if (o0Var3.equals(s0Var2.f18989j) && (xVar = s0Var2.f18993n) != null && s0Var2.O) {
                    xVar.Z();
                    return;
                }
                return;
            case 21:
                o0 o0Var4 = (o0) obj;
                s0 s0Var3 = o0Var4.f18955b;
                if (o0Var4.equals(s0Var3.f18989j) && s0Var3.M) {
                    s0Var3.N = true;
                    return;
                }
                return;
        }
    }

    public d(a aVar) {
        this.f17688a = 4;
    }

    public d(a aVar, float f10) {
        this.f17688a = 11;
    }

    public d(a aVar, int i3) {
        this.f17688a = 9;
    }

    public d(a aVar, long j10) {
        this.f17688a = 2;
    }

    public d(a aVar, d2.n0 n0Var, int i3) {
        this.f17688a = 10;
    }

    public d(a aVar, Object obj, int i3) {
        this.f17688a = i3;
    }

    public d(a aVar, boolean z10) {
        this.f17688a = 6;
    }

    @Override
    public void b(Exception exc) {
    }
}
