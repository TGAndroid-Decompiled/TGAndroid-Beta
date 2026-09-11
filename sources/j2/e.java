package j2;

import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import b2.k0;
import e2.m;
import e9.i0;
import java.util.List;
import m4.a0;
import m4.d1;
import m4.e1;
import m4.j1;
import m4.n;
import m4.p1;
import m4.q;
import m4.r;
import m4.z;
import v7.l8;
public final class e implements m, d9.e, i5.g, z, e1, d1 {
    public final int f13175a;

    public e(int i10) {
        this.f13175a = i10;
    }

    public static AudioDeviceInfo d(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static boolean g(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override
    public void a(j1 j1Var, r rVar, List list) {
        switch (this.f13175a) {
            case 28:
                j1Var.v0(list);
                return;
            default:
                j1Var.v0(list);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        return i0.z(Integer.valueOf(((v2.h) obj).f47309a));
    }

    @Override
    public void e(q qVar, int i10) {
        switch (this.f13175a) {
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
        switch (this.f13175a) {
            case 23:
                a0Var.getClass();
                throw new ClassCastException();
            case 24:
                a0Var.getClass();
                throw new ClassCastException();
            case 25:
                return a0Var.n(rVar);
            case 26:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                ob.a aVar = a0Var.f15829e;
                a0Var.s(rVar);
                aVar.getClass();
                return l8.b(new p1(-6));
        }
    }

    @Override
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f13175a) {
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
            default:
                bVar.getClass();
                return;
        }
    }

    public e(int i10, Object obj, Object obj2) {
        this.f13175a = i10;
    }

    public e(a aVar, float f7) {
        this.f13175a = 5;
    }

    public e(a aVar, int i10) {
        this.f13175a = 3;
    }

    public e(a aVar, k0 k0Var, int i10) {
        this.f13175a = 4;
    }

    public e(a aVar, boolean z10) {
        this.f13175a = 1;
    }

    public e(Object obj, int i10) {
        this.f13175a = i10;
    }

    public e(String str, int i10, int i11, n nVar) {
        this.f13175a = 24;
    }

    @Override
    public void c(Exception exc) {
    }
}
