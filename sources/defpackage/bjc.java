package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
public final class bjc implements gjf {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public bjc() {
        this.a = -1L;
        this.f = new ajc(this);
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
            ((zic) obj).b();
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
            zic zicVar = (zic) obj;
            long j = this.a;
            if (j >= 0) {
                zicVar.c(j);
            }
            BaseInterpolator baseInterpolator = (BaseInterpolator) this.d;
            if (baseInterpolator != null && (view = (View) zicVar.a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (((djc) this.e) != null) {
                zicVar.d((ajc) this.f);
            }
            View view2 = (View) zicVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.b = true;
    }

    @Override
    public final rx zza() {
        long j = this.a;
        boolean z = this.b;
        jkf jkfVar = (jkf) this.f;
        am2 am2Var = new am2((byte) 23, false);
        htd htdVar = new htd((byte) 9);
        htdVar.b = Long.valueOf(j & Long.MAX_VALUE);
        htdVar.c = (daf) this.d;
        htdVar.d = Boolean.valueOf(z);
        am2Var.b = new r8f(htdVar);
        mre.l.getClass();
        Bitmap bitmap = ((jq5) this.e).a;
        xve.h(bitmap);
        int allocationByteCount = bitmap.getAllocationByteCount();
        zhc zhcVar = new zhc((byte) 19, false);
        zhcVar.b = d8f.BITMAP;
        zhcVar.c = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        am2Var.c = new g8f(zhcVar);
        am2Var.d = ((mre) this.c).e.a();
        if (jkfVar != null) {
            ArrayList arrayList = jkfVar.d;
            ded dedVar = ted.f;
            Object[] array = arrayList.toArray();
            int length = array.length;
            z4f.a(length, array);
            am2Var.f = ted.m(length, array);
            ArrayList arrayList2 = jkfVar.a;
            if (!arrayList2.isEmpty()) {
                Object[] objArr = new Object[4];
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    hkf hkfVar = (hkf) obj;
                    lyc lycVar = new lyc((byte) 20, false);
                    lycVar.b = Integer.valueOf(hkfVar.c & Integer.MAX_VALUE);
                    lycVar.c = Integer.valueOf(hkfVar.d & Integer.MAX_VALUE);
                    lycVar.d = Integer.valueOf(hkfVar.e & Integer.MAX_VALUE);
                    lycVar.e = Integer.valueOf(hkfVar.f & Integer.MAX_VALUE);
                    bhf bhfVar = new bhf(lycVar);
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
                    objArr[i] = bhfVar;
                    i = i3;
                }
                am2Var.e = ted.m(i, objArr);
            }
        }
        ?? obj2 = new Object();
        obj2.c = m9f.TYPE_THIN;
        obj2.f = new zff(am2Var);
        return new rx((oxb) obj2, 0);
    }

    public bjc(mre mreVar, long j, daf dafVar, boolean z, jq5 jq5Var, jkf jkfVar) {
        this.c = mreVar;
        this.a = j;
        this.d = dafVar;
        this.b = z;
        this.e = jq5Var;
        this.f = jkfVar;
    }
}
