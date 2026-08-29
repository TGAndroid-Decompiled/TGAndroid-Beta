package k;

import ag.j2;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.firebase.messaging.s;
import i7.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l3.g0;
import l7.ee;
import l7.fb;
import l7.gb;
import l7.hg;
import l7.ig;
import l7.qa;
import l7.ra;
import l7.te;
import l7.va;
import l7.vf;
import m.s3;
import r0.m0;
import r0.n0;
public final class j implements vf {
    public long f13239a;
    public boolean f13240b;
    public final Object f13241c;
    public Object d;
    public Object f13242e;
    public final Object f13243f;

    public j(lb.e eVar, long j10, gb gbVar, boolean z10, fb.a aVar, ig igVar) {
        this.f13241c = eVar;
        this.f13239a = j10;
        this.d = gbVar;
        this.f13240b = z10;
        this.f13242e = aVar;
        this.f13243f = igVar;
    }

    public void a() {
        if (!this.f13240b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f13241c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m0) obj).b();
        }
        this.f13240b = false;
    }

    public void b() {
        View view;
        if (this.f13240b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f13241c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m0 m0Var = (m0) obj;
            long j10 = this.f13239a;
            if (j10 >= 0) {
                m0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) m0Var.f46841a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((n0) this.f13242e) != null) {
                m0Var.d((i) this.f13243f);
            }
            View view2 = (View) m0Var.f46841a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f13240b = true;
    }

    @Override
    public j2 zza() {
        int i10;
        qa qaVar;
        lb.e eVar = (lb.e) this.f13241c;
        long j10 = this.f13239a;
        boolean z10 = this.f13240b;
        fb.a aVar = (fb.a) this.f13242e;
        ig igVar = (ig) this.f13243f;
        ?? obj = new Object();
        g0 g0Var = new g0(5, false);
        g0Var.f14096b = Long.valueOf(j10 & Long.MAX_VALUE);
        g0Var.f14097c = (gb) this.d;
        g0Var.d = Boolean.valueOf(z10);
        obj.f211a = new va(g0Var);
        int i11 = aVar.f6702e;
        lb.e.f15153l.getClass();
        int i12 = aVar.f6702e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f6699a;
            z5.l.h(bitmap);
            i10 = bitmap.getAllocationByteCount();
        } else if (i12 != 17 && i12 != 842094169) {
            if (i12 != 35) {
                i10 = 0;
            } else {
                z5.l.h(null);
                throw null;
            }
        } else {
            z5.l.h(null);
            throw null;
        }
        g9.l lVar = new g9.l(17, (byte) 0);
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
        lVar.f7168b = qaVar;
        lVar.f7169c = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f212b = new ra(lVar);
        obj.f213c = eVar.f15154e.a();
        if (igVar != null) {
            List list = igVar.d;
            l7.g gVar = l7.i.f14820b;
            Object[] array = list.toArray();
            int length = array.length;
            o.a(length, array);
            obj.f214e = l7.i.r(length, array);
            List<hg> list2 = igVar.f14837a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (hg hgVar : list2) {
                    s sVar = new s(18, false);
                    sVar.f5185b = Integer.valueOf(hgVar.f14817c & Integer.MAX_VALUE);
                    sVar.f5186c = Integer.valueOf(hgVar.d & Integer.MAX_VALUE);
                    sVar.d = Integer.valueOf(hgVar.f14818e & Integer.MAX_VALUE);
                    sVar.f5187e = Integer.valueOf(hgVar.f14819f & Integer.MAX_VALUE);
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
                obj.d = l7.i.r(i13, objArr);
            }
        }
        ?? obj2 = new Object();
        obj2.f16690c = fb.TYPE_THIN;
        obj2.f16692f = new ee(obj);
        return new j2((s3) obj2, 0);
    }

    public j() {
        this.f13239a = -1L;
        this.f13243f = new i(this);
        this.f13241c = new ArrayList();
    }
}
