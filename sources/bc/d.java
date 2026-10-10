package bc;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.firebase.messaging.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.q3;
import n6.l;
import org.telegram.ui.ActionBar.b5;
import r0.l0;
import r0.m0;
import v7.k;
import w7.g9;
import z7.ee;
import z7.fb;
import z7.g;
import z7.gb;
import z7.hg;
import z7.ig;
import z7.qa;
import z7.ra;
import z7.te;
import z7.va;
import z7.vf;
public final class d implements vf {
    public long f3849a;
    public boolean f3850b;
    public final Object f3851c;
    public Object d;
    public Object f3852e;
    public final Object f3853f;

    public d(f fVar, long j3, gb gbVar, boolean z10, vb.a aVar, ig igVar) {
        this.f3851c = fVar;
        this.f3849a = j3;
        this.d = gbVar;
        this.f3850b = z10;
        this.f3852e = aVar;
        this.f3853f = igVar;
    }

    public void a() {
        if (!this.f3850b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f3851c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l0) obj).b();
        }
        this.f3850b = false;
    }

    public void b() {
        View view;
        if (this.f3850b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f3851c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            long j3 = this.f3849a;
            if (j3 >= 0) {
                l0Var.c(j3);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.f46822a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.f3852e) != null) {
                l0Var.d((i) this.f3853f);
            }
            View view2 = (View) l0Var.f46822a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f3850b = true;
    }

    @Override
    public a5.a zza() {
        int i10;
        qa qaVar;
        f fVar = (f) this.f3851c;
        long j3 = this.f3849a;
        boolean z10 = this.f3850b;
        vb.a aVar = (vb.a) this.f3852e;
        ig igVar = (ig) this.f3853f;
        ?? obj = new Object();
        k kVar = new k(17, false);
        kVar.f49290b = Long.valueOf(j3 & Long.MAX_VALUE);
        kVar.f49291c = (gb) this.d;
        kVar.d = Boolean.valueOf(z10);
        obj.f6065a = new va(kVar);
        int i11 = aVar.f49562e;
        f.f3858l.getClass();
        int i12 = aVar.f49562e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f49559a;
            l.h(bitmap);
            i10 = bitmap.getAllocationByteCount();
        } else if (i12 != 17 && i12 != 842094169) {
            if (i12 != 35) {
                i10 = 0;
            } else {
                l.h(null);
                throw null;
            }
        } else {
            l.h(null);
            throw null;
        }
        b5 b5Var = new b5(25, (byte) 0);
        if (i11 != -1) {
            if (i11 != 35) {
                if (i11 != 842094169) {
                    if (i11 != 16) {
                        if (i11 != 17) {
                            qaVar = qa.UNKNOWN_FORMAT;
                        } else {
                            qaVar = qa.NV21;
                        }
                    } else {
                        qaVar = qa.NV16;
                    }
                } else {
                    qaVar = qa.YV12;
                }
            } else {
                qaVar = qa.YUV_420_888;
            }
        } else {
            qaVar = qa.BITMAP;
        }
        b5Var.f20465b = qaVar;
        b5Var.f20466c = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f6066b = new ra(b5Var);
        obj.f6067c = fVar.f3859e.a();
        if (igVar != null) {
            List list = igVar.d;
            g gVar = z7.i.f53950b;
            Object[] array = list.toArray();
            int length = array.length;
            g9.a(length, array);
            obj.f6068e = z7.i.r(length, array);
            List<hg> list2 = igVar.f53967a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (hg hgVar : list2) {
                    s sVar = new s(14, false);
                    sVar.f7971b = Integer.valueOf(hgVar.f53947c & Integer.MAX_VALUE);
                    sVar.f7972c = Integer.valueOf(hgVar.d & Integer.MAX_VALUE);
                    sVar.d = Integer.valueOf(hgVar.f53948e & Integer.MAX_VALUE);
                    sVar.f7973e = Integer.valueOf(hgVar.f53949f & Integer.MAX_VALUE);
                    te teVar = new te(sVar);
                    int i14 = i13 + 1;
                    int length2 = objArr.length;
                    if (length2 < i14) {
                        int i15 = length2 + (length2 >> 1) + 1;
                        if (i15 < i14) {
                            int highestOneBit = Integer.highestOneBit(i13);
                            i15 = highestOneBit + highestOneBit;
                        }
                        if (i15 < 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        objArr = Arrays.copyOf(objArr, i15);
                    }
                    objArr[i13] = teVar;
                    i13 = i14;
                }
                obj.d = z7.i.r(i13, objArr);
            }
        }
        ?? obj2 = new Object();
        obj2.f15801c = fb.TYPE_THIN;
        obj2.f15803f = new ee(obj);
        return new a5.a((q3) obj2, 0);
    }

    public d() {
        this.f3849a = -1L;
        this.f3853f = new i(this);
        this.f3851c = new ArrayList();
    }
}
