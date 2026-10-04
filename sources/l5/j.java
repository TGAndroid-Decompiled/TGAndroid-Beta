package l5;

import android.content.Context;
import android.os.Build;
import b2.r0;
import e2.d0;
import n4.y;
import n7.z0;
public final class j implements r2.k {
    public Context f15348a;

    public j(Context context) {
        this.f15348a = context;
    }

    public k a() {
        Context context = this.f15348a;
        if (context != null) {
            ?? obj = new Object();
            obj.f15349a = n5.a.a(n.f15356a);
            e.a aVar = new e.a(context);
            obj.f15350b = aVar;
            obj.f15351c = n5.a.a(new y(26, aVar, new l2.g(aVar, 3)));
            e.a aVar2 = obj.f15350b;
            obj.d = new l2.g(aVar2, 19);
            fd.a a2 = n5.a.a(new o0.a(16, obj.d, n5.a.a(new n2.c(aVar2, 19))));
            obj.f15352e = a2;
            qb.b bVar = new qb.b(19);
            e.a aVar3 = obj.f15350b;
            la.h hVar = new la.h(aVar3, a2, bVar, 21);
            fd.a aVar4 = obj.f15349a;
            fd.a aVar5 = obj.f15351c;
            cf.c cVar = new cf.c(aVar4, aVar5, hVar, a2, a2);
            ?? obj2 = new Object();
            obj2.f15849a = aVar3;
            obj2.f15850b = aVar5;
            obj2.f15851c = a2;
            obj2.d = hVar;
            obj2.f15852e = aVar4;
            obj2.f15853f = a2;
            obj2.h = a2;
            ?? obj3 = new Object();
            obj3.f45526a = aVar4;
            obj3.f45527b = a2;
            obj3.f45528c = hVar;
            obj3.d = a2;
            obj.f15353f = n5.a.a(new aa.a(cVar, obj2, obj3, false, 29));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    @Override
    public r2.l v(com.google.firebase.messaging.n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (i10 >= 31 || ((context = this.f15348a) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int h = r0.h(((b2.s) nVar.f7906c).f3564r);
            e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.G(h));
            return new z0(14, new r2.b(h, 0), new r2.b(h, 1)).v(nVar);
        }
        return new rb.a(20).v(nVar);
    }
}
