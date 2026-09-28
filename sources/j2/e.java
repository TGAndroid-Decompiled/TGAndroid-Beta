package j2;

import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import b2.k0;
import e2.m;
import e9.i0;
import m4.a0;
import m4.e1;
import m4.n;
import m4.q;
import m4.r;
import m4.z;
import m4.z0;
public final class e implements m, d9.e, i5.g, z, z0, e2.h {
    public final int f12563a;

    public e(int i10) {
        this.f12563a = i10;
    }

    public static AudioDeviceInfo d(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static boolean f(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override
    public void accept(Object obj) {
        e1 e1Var = (e1) obj;
        switch (this.f12563a) {
            case 27:
                e1Var.e();
                return;
            case 28:
                e1Var.e0();
                return;
            default:
                e1Var.z0();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        return i0.z(Integer.valueOf(((v2.h) obj).f44133a));
    }

    @Override
    public void c(q qVar, int i10) {
        switch (this.f12563a) {
            case 22:
                qVar.getClass();
                return;
            case 23:
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
            case 25:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                a0Var.getClass();
                throw new ClassCastException();
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

    public e(a aVar, float f7) {
        this.f12563a = 6;
    }

    public e(a aVar, int i10) {
        this.f12563a = 4;
    }

    public e(a aVar, k0 k0Var, int i10) {
        this.f12563a = 5;
    }

    public e(a aVar, Object obj, int i10) {
        this.f12563a = i10;
    }

    public e(a aVar, boolean z10) {
        this.f12563a = 2;
    }

    public e(Object obj, int i10) {
        this.f12563a = i10;
    }

    public e(String str, int i10, int i11, n nVar) {
        this.f12563a = 26;
    }

    @Override
    public void a(Exception exc) {
    }
}
