package j2;

import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import e9.i0;
import java.util.List;
import m4.a0;
import m4.b0;
import m4.f1;
import m4.g1;
import m4.l1;
import m4.n;
import m4.q;
import m4.r;
import m4.r1;
import v7.o8;
public final class h implements d9.e, i5.g, a0, g1, f1 {
    public final int f11479a;

    public h(int i10) {
        this.f11479a = i10;
    }

    public static AudioDeviceInfo c(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static boolean f(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override
    public void a(l1 l1Var, r rVar, List list) {
        switch (this.f11479a) {
            case 21:
                l1Var.v0(list);
                return;
            default:
                l1Var.v0(list);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        return i0.z(Integer.valueOf(((v2.h) obj).f42871a));
    }

    @Override
    public void d(q qVar, int i10) {
        switch (this.f11479a) {
            case 13:
                qVar.getClass();
                return;
            case 14:
                qVar.b(i10);
                return;
            default:
                qVar.getClass();
                return;
        }
    }

    @Override
    public Object i(b0 b0Var, r rVar, int i10) {
        switch (this.f11479a) {
            case 16:
                b0Var.getClass();
                throw new ClassCastException();
            case 17:
                b0Var.getClass();
                throw new ClassCastException();
            case 18:
                return b0Var.n(rVar);
            case 19:
                b0Var.getClass();
                throw new ClassCastException();
            case 20:
                na.d dVar = b0Var.e;
                b0Var.s(rVar);
                dVar.getClass();
                return o8.b(new r1(-6));
            case 21:
            case 22:
            default:
                na.d dVar2 = b0Var.e;
                b0Var.s(rVar);
                dVar2.getClass();
                return o8.b(new r1(-6));
            case 23:
                b0Var.getClass();
                throw new ClassCastException();
            case 24:
                b0Var.getClass();
                throw new ClassCastException();
            case 25:
                b0Var.getClass();
                throw new ClassCastException();
            case 26:
                b0Var.getClass();
                throw new ClassCastException();
        }
    }

    public h(int i10, Object obj, Object obj2) {
        this.f11479a = i10;
    }

    public h(Object obj, int i10) {
        this.f11479a = i10;
    }

    public h(String str, int i10, int i11, n nVar, int i12) {
        this.f11479a = i12;
    }

    @Override
    public void b(Exception exc) {
    }
}
