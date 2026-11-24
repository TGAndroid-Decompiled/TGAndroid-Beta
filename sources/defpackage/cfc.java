package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
public final class cfc implements qef {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public cfc() {
        this.a = -1L;
        this.f = new bfc(this);
        this.c = new ArrayList();
    }

    public final void a() {
        if (!this.b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((afc) obj).b();
        }
        this.b = false;
    }

    public final void b() {
        View view;
        if (this.b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            afc afcVar = (afc) obj;
            long j = this.a;
            if (j >= 0) {
                afcVar.c(j);
            }
            BaseInterpolator baseInterpolator = (BaseInterpolator) this.d;
            if (baseInterpolator != null && (view = (View) afcVar.a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (((efc) this.e) != null) {
                afcVar.d((bfc) this.f);
            }
            View view2 = (View) afcVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.b = true;
    }

    @Override
    public final qx zza() {
        long j = this.a;
        boolean z = this.b;
        tff tffVar = (tff) this.f;
        gl2 gl2Var = new gl2((byte) 23, false);
        rod rodVar = new rod((byte) 9);
        rodVar.b = Long.valueOf(j & Long.MAX_VALUE);
        rodVar.c = (m5f) this.d;
        rodVar.d = Boolean.valueOf(z);
        gl2Var.b = new a4f(rodVar);
        vme.l.getClass();
        Bitmap bitmap = ((go5) this.e).a;
        fre.h(bitmap);
        int allocationByteCount = bitmap.getAllocationByteCount();
        aec aecVar = new aec((byte) 19, false);
        aecVar.b = m3f.BITMAP;
        aecVar.c = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        gl2Var.c = new p3f(aecVar);
        gl2Var.d = ((vme) this.c).e.a();
        if (tffVar != null) {
            ArrayList arrayList = tffVar.d;
            k9d k9dVar = aad.f;
            Object[] array = arrayList.toArray();
            int length = array.length;
            h0f.a(length, array);
            gl2Var.f = aad.m(length, array);
            ArrayList arrayList2 = tffVar.a;
            if (!arrayList2.isEmpty()) {
                Object[] objArr = new Object[4];
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    rff rffVar = (rff) obj;
                    c5a c5aVar = new c5a((byte) 20, false);
                    c5aVar.b = Integer.valueOf(rffVar.c & Integer.MAX_VALUE);
                    c5aVar.c = Integer.valueOf(rffVar.d & Integer.MAX_VALUE);
                    c5aVar.d = Integer.valueOf(rffVar.e & Integer.MAX_VALUE);
                    c5aVar.e = Integer.valueOf(rffVar.f & Integer.MAX_VALUE);
                    lcf lcfVar = new lcf(c5aVar);
                    int i3 = i + 1;
                    int length2 = objArr.length;
                    if (length2 < i3) {
                        int i4 = length2 + (length2 >> 1) + 1;
                        if (i4 < i3) {
                            i4 = Integer.highestOneBit(i) << 1;
                        }
                        if (i4 < 0) {
                            i4 = Integer.MAX_VALUE;
                        }
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    objArr[i] = lcfVar;
                    i = i3;
                }
                gl2Var.e = aad.m(i, objArr);
            }
        }
        ?? obj2 = new Object();
        obj2.c = v4f.TYPE_THIN;
        obj2.f = new jbf(gl2Var);
        return new qx((ntb) obj2, 0);
    }

    public cfc(vme vmeVar, long j, m5f m5fVar, boolean z, go5 go5Var, tff tffVar) {
        this.c = vmeVar;
        this.a = j;
        this.d = m5fVar;
        this.b = z;
        this.e = go5Var;
        this.f = tffVar;
    }
}
