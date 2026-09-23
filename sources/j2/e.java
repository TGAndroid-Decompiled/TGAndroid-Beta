package j2;

import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import b2.k0;
import e2.m;
import e9.i0;
import m4.a0;
import m4.a1;
import m4.f1;
import m4.n;
import m4.q;
import m4.r;
import m4.z;
public final class e implements m, d9.e, i5.g, z, a1, e2.h {
    public final int f12563a;

    public e(int i10) {
        this.f12563a = i10;
    }

    public static AudioDeviceInfo b(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static boolean e(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override
    public void accept(Object obj) {
        f1 f1Var = (f1) obj;
        switch (this.f12563a) {
            case 25:
                f1Var.e();
                return;
            case 26:
                f1Var.e0();
                return;
            case 27:
                f1Var.z0();
                return;
            default:
                f1Var.G0();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        return i0.z(Integer.valueOf(((v2.h) obj).f43800a));
    }

    @Override
    public void d(q qVar, int i10) {
        switch (this.f12563a) {
            case 20:
                qVar.getClass();
                return;
            case 21:
                qVar.b(i10);
                return;
            default:
                qVar.getClass();
                return;
        }
    }

    @Override
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.f12563a) {
            case 23:
                a0Var.getClass();
                throw new ClassCastException();
            case 24:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                return a0Var.n(rVar);
        }
    }

    @Override
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f12563a) {
            case 0:
                bVar.getClass();
                return;
            case 1:
                bVar.getClass();
                return;
            case 2:
                bVar.getClass();
                return;
            case 3:
                bVar.getClass();
                return;
            case 4:
                bVar.getClass();
                return;
            case 5:
                bVar.getClass();
                return;
            default:
                bVar.getClass();
                return;
        }
    }

    public e(int i10, Object obj, Object obj2) {
        this.f12563a = i10;
    }

    public e(a aVar, float f7) {
        this.f12563a = 6;
    }

    public e(a aVar, int i10) {
        this.f12563a = 4;
    }

    public e(a aVar, k0 k0Var, int i10) {
        this.f12563a = 5;
    }

    public e(a aVar, boolean z10) {
        this.f12563a = 2;
    }

    public e(Object obj, int i10) {
        this.f12563a = i10;
    }

    public e(String str, int i10, int i11, n nVar) {
        this.f12563a = 24;
    }

    @Override
    public void a(Exception exc) {
    }
}
