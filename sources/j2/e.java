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
public final class e implements m, d9.e, i5.g, z, e1 {
    public final int f12575a;

    public e(int i10) {
        this.f12575a = i10;
    }

    public static AudioDeviceInfo d(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static boolean f(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override
    public Object apply(Object obj) {
        return i0.z(Integer.valueOf(((v2.h) obj).f44149a));
    }

    @Override
    public void c(q qVar, int i10) {
        switch (this.f12575a) {
            case 25:
                qVar.getClass();
                return;
            case 26:
                qVar.b(i10);
                return;
            default:
                qVar.getClass();
                return;
        }
    }

    @Override
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.f12575a) {
            case 28:
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
        switch (this.f12575a) {
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
            case 6:
                bVar.getClass();
                return;
            default:
                bVar.getClass();
                return;
        }
    }

    public e(a aVar, float f7) {
        this.f12575a = 7;
    }

    public e(a aVar, int i10) {
        this.f12575a = 5;
    }

    public e(a aVar, k0 k0Var, int i10) {
        this.f12575a = 6;
    }

    public e(a aVar, Object obj, int i10) {
        this.f12575a = i10;
    }

    public e(a aVar, boolean z10) {
        this.f12575a = 3;
    }

    public e(Object obj, int i10) {
        this.f12575a = i10;
    }

    public e(String str, int i10, int i11, n nVar) {
        this.f12575a = 29;
    }

    @Override
    public void a(Exception exc) {
    }
}
