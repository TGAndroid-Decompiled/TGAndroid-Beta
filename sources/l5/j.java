package l5;

import android.content.Context;
import android.os.Build;
import b2.v0;
import b2.w;
import e2.m0;
import ki.t1;
import m.g3;
public final class j implements r2.k {
    public Context f15922a;

    public j(Context context) {
        this.f15922a = context;
    }

    @Override
    public r2.l J(com.google.firebase.messaging.l lVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || ((context = this.f15922a) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int h = v0.h(((w) lVar.f7648c).f4132s);
            e2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + m0.I(h));
            r2.b bVar = new r2.b(h, 0);
            r2.b bVar2 = new r2.b(h, 1);
            ?? obj = new Object();
            obj.f2672b = bVar;
            obj.f2673c = bVar2;
            obj.f2671a = true;
            obj.f2671a = true;
            return obj.J(lVar);
        }
        return new sb.a(20).J(lVar);
    }

    public k a() {
        Context context = this.f15922a;
        if (context != null) {
            ?? obj = new Object();
            obj.f15923a = n5.a.a(n.f15929a);
            k0.b bVar = new k0.b(context, 8);
            obj.f15924b = bVar;
            obj.f15925c = n5.a.a(new n4.s(29, bVar, new t1(bVar, 6)));
            k0.b bVar2 = obj.f15924b;
            obj.d = new l2.f(bVar2, 19);
            hd.a a2 = n5.a.a(new mi.q(21, obj.d, n5.a.a(new k0.b(bVar2, 27))));
            obj.e = a2;
            oa.d dVar = new oa.d(20);
            k0.b bVar3 = obj.f15924b;
            g3 g3Var = new g3(bVar3, a2, dVar, 21);
            hd.a aVar = obj.f15923a;
            hd.a aVar2 = obj.f15925c;
            ?? obj2 = new Object();
            obj2.f6882b = aVar;
            obj2.f6883c = aVar2;
            obj2.f6881a = g3Var;
            obj2.d = a2;
            obj2.e = a2;
            ?? obj3 = new Object();
            obj3.f16333a = bVar3;
            obj3.f16334b = aVar2;
            obj3.f16335c = a2;
            obj3.d = g3Var;
            obj3.e = aVar;
            obj3.f16336f = a2;
            obj3.h = a2;
            ?? obj4 = new Object();
            obj4.f44752a = aVar;
            obj4.f44753b = a2;
            obj4.f44754c = g3Var;
            obj4.d = a2;
            obj.f15926f = n5.a.a(new androidx.biometric.e(obj2, obj3, obj4, 29));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }
}
