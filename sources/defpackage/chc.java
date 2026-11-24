package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
public final class chc implements rgf {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public chc() {
        this.a = -1L;
        this.f = new bhc(this);
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
            ((ahc) obj).b();
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
            ahc ahcVar = (ahc) obj;
            long j = this.a;
            if (j >= 0) {
                ahcVar.c(j);
            }
            BaseInterpolator baseInterpolator = (BaseInterpolator) this.d;
            if (baseInterpolator != null && (view = (View) ahcVar.a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (((ehc) this.e) != null) {
                ahcVar.d((bhc) this.f);
            }
            View view2 = (View) ahcVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.b = true;
    }

    @Override
    public final ry zza() {
        long j = this.a;
        boolean z = this.b;
        uhf uhfVar = (uhf) this.f;
        sm2 sm2Var = new sm2((byte) 24, false);
        uqd uqdVar = new uqd((byte) 9);
        uqdVar.b = Long.valueOf(j & Long.MAX_VALUE);
        uqdVar.c = (o7f) this.d;
        uqdVar.d = Boolean.valueOf(z);
        sm2Var.b = new c6f(uqdVar);
        yoe.l.getClass();
        Bitmap bitmap = ((gq5) this.e).a;
        ite.h(bitmap);
        int allocationByteCount = bitmap.getAllocationByteCount();
        rhb rhbVar = new rhb((byte) 21, false);
        rhbVar.b = o5f.BITMAP;
        rhbVar.c = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        sm2Var.c = new r5f(rhbVar);
        sm2Var.d = ((yoe) this.c).e.a();
        if (uhfVar != null) {
            ArrayList arrayList = uhfVar.d;
            mbd mbdVar = ccd.f;
            Object[] array = arrayList.toArray();
            int length = array.length;
            j2f.a(length, array);
            sm2Var.f = ccd.m(length, array);
            ArrayList arrayList2 = uhfVar.a;
            if (!arrayList2.isEmpty()) {
                Object[] objArr = new Object[4];
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    shf shfVar = (shf) obj;
                    xvc xvcVar = new xvc((byte) 20, false);
                    xvcVar.b = Integer.valueOf(shfVar.c & Integer.MAX_VALUE);
                    xvcVar.c = Integer.valueOf(shfVar.d & Integer.MAX_VALUE);
                    xvcVar.d = Integer.valueOf(shfVar.e & Integer.MAX_VALUE);
                    xvcVar.e = Integer.valueOf(shfVar.f & Integer.MAX_VALUE);
                    mef mefVar = new mef(xvcVar);
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
                    objArr[i] = mefVar;
                    i = i3;
                }
                sm2Var.e = ccd.m(i, objArr);
            }
        }
        ?? obj2 = new Object();
        obj2.c = x6f.TYPE_THIN;
        obj2.f = new kdf(sm2Var);
        return new ry((ovb) obj2, 0);
    }

    public chc(yoe yoeVar, long j, o7f o7fVar, boolean z, gq5 gq5Var, uhf uhfVar) {
        this.c = yoeVar;
        this.a = j;
        this.d = o7fVar;
        this.b = z;
        this.e = gq5Var;
        this.f = uhfVar;
    }
}
