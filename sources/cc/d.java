package cc;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.s3;
import n6.l;
import r0.l0;
import r0.m0;
import w7.f9;
import z7.g;
import z7.ge;
import z7.hb;
import z7.ib;
import z7.jg;
import z7.kg;
import z7.sa;
import z7.ta;
import z7.ve;
import z7.xa;
import z7.xf;
public final class d implements xf {
    public long f5089a;
    public boolean f5090b;
    public final Object f5091c;
    public Object d;
    public Object e;
    public final Object f5092f;

    public d(f fVar, long j10, ib ibVar, boolean z10, wb.a aVar, kg kgVar) {
        this.f5091c = fVar;
        this.f5089a = j10;
        this.d = ibVar;
        this.f5090b = z10;
        this.e = aVar;
        this.f5092f = kgVar;
    }

    public void a() {
        if (!this.f5090b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f5091c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l0) obj).b();
        }
        this.f5090b = false;
    }

    public void b() {
        View view;
        if (this.f5090b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f5091c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            long j10 = this.f5089a;
            if (j10 >= 0) {
                l0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.f44854a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.e) != null) {
                l0Var.d((i) this.f5092f);
            }
            View view2 = (View) l0Var.f44854a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f5090b = true;
    }

    @Override
    public a5.a zza() {
        int i10;
        sa saVar;
        f fVar = (f) this.f5091c;
        long j10 = this.f5089a;
        boolean z10 = this.f5090b;
        wb.a aVar = (wb.a) this.e;
        kg kgVar = (kg) this.f5092f;
        ?? obj = new Object();
        u2.c cVar = new u2.c(18, false);
        cVar.f47282b = Long.valueOf(j10 & Long.MAX_VALUE);
        cVar.f47283c = (ib) this.d;
        cVar.d = Boolean.valueOf(z10);
        obj.f6883b = new xa(cVar);
        int i11 = aVar.e;
        f.f5097l.getClass();
        int i12 = aVar.e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f48919a;
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
        ?? obj2 = new Object();
        if (i11 != -1) {
            if (i11 != 35) {
                if (i11 != 842094169) {
                    if (i11 != 16) {
                        if (i11 != 17) {
                            saVar = sa.UNKNOWN_FORMAT;
                        } else {
                            saVar = sa.NV21;
                        }
                    } else {
                        saVar = sa.NV16;
                    }
                } else {
                    saVar = sa.YV12;
                }
            } else {
                saVar = sa.YUV_420_888;
            }
        } else {
            saVar = sa.BITMAP;
        }
        obj2.f51173a = saVar;
        obj2.f51174b = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f6884c = new ta(obj2);
        obj.f6882a = fVar.e.a();
        if (kgVar != null) {
            List list = kgVar.d;
            g gVar = z7.i.f50918b;
            Object[] array = list.toArray();
            int length = array.length;
            f9.a(length, array);
            obj.e = z7.i.q(length, array);
            List<jg> list2 = kgVar.f51100a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (jg jgVar : list2) {
                    ?? obj3 = new Object();
                    obj3.f44777a = Integer.valueOf(jgVar.f51082c & Integer.MAX_VALUE);
                    obj3.f44778b = Integer.valueOf(jgVar.d & Integer.MAX_VALUE);
                    obj3.f44779c = Integer.valueOf(jgVar.e & Integer.MAX_VALUE);
                    obj3.d = Integer.valueOf(jgVar.f51083f & Integer.MAX_VALUE);
                    ve veVar = new ve(obj3);
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
                    objArr[i13] = veVar;
                    i13 = i14;
                }
                obj.d = z7.i.q(i13, objArr);
            }
        }
        ?? obj4 = new Object();
        obj4.f16330c = hb.TYPE_THIN;
        obj4.f16331f = new ge(obj);
        return new a5.a((s3) obj4, 0);
    }

    public d() {
        this.f5089a = -1L;
        this.f5092f = new i(this);
        this.f5091c = new ArrayList();
    }
}
