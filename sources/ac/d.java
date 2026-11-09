package ac;

import a8.r7;
import a8.wa;
import a8.x7;
import ab.b0;
import android.graphics.Bitmap;
import android.support.v4.media.session.a0;
import android.view.View;
import android.view.animation.Interpolator;
import c8.ce;
import c8.db;
import c8.eb;
import c8.fg;
import c8.g;
import c8.gg;
import c8.oa;
import c8.pa;
import c8.re;
import c8.ta;
import c8.tf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import q6.m;
import r0.l0;
import r0.m0;
public final class d implements tf {
    public long f1018a;
    public boolean f1019b;
    public final Object f1020c;
    public Object d;
    public Object f1021e;
    public final Object f1022f;

    public d(f fVar, long j3, eb ebVar, boolean z9, ub.a aVar, gg ggVar) {
        this.f1020c = fVar;
        this.f1018a = j3;
        this.d = ebVar;
        this.f1019b = z9;
        this.f1021e = aVar;
        this.f1022f = ggVar;
    }

    public void a() {
        if (!this.f1019b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f1020c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((l0) obj).b();
        }
        this.f1019b = false;
    }

    public void b() {
        View view;
        if (this.f1019b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f1020c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            l0 l0Var = (l0) obj;
            long j3 = this.f1018a;
            if (j3 >= 0) {
                l0Var.c(j3);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.f54215a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.f1021e) != null) {
                l0Var.d((i) this.f1022f);
            }
            View view2 = (View) l0Var.f54215a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f1019b = true;
    }

    @Override
    public wa zza() {
        int i7;
        oa oaVar;
        f fVar = (f) this.f1020c;
        long j3 = this.f1018a;
        boolean z9 = this.f1019b;
        ub.a aVar = (ub.a) this.f1021e;
        gg ggVar = (gg) this.f1022f;
        r7 r7Var = new r7(3, (byte) 0);
        a0 a0Var = new a0(17, false);
        a0Var.f1763b = Long.valueOf(j3 & Long.MAX_VALUE);
        a0Var.f1764c = (eb) this.d;
        a0Var.d = Boolean.valueOf(z9);
        r7Var.f614b = new ta(a0Var);
        int i10 = aVar.f56505e;
        f.f1027l.getClass();
        int i11 = aVar.f56505e;
        if (i11 == -1) {
            Bitmap bitmap = aVar.f56502a;
            m.g(bitmap);
            i7 = bitmap.getAllocationByteCount();
        } else if (i11 != 17 && i11 != 842094169) {
            if (i11 != 35) {
                i7 = 0;
            } else {
                m.g(null);
                throw null;
            }
        } else {
            m.g(null);
            throw null;
        }
        wf.b bVar = new wf.b(8, false);
        if (i10 != -1) {
            if (i10 != 35) {
                if (i10 != 842094169) {
                    if (i10 != 16) {
                        if (i10 != 17) {
                            oaVar = oa.UNKNOWN_FORMAT;
                        } else {
                            oaVar = oa.NV21;
                        }
                    } else {
                        oaVar = oa.NV16;
                    }
                } else {
                    oaVar = oa.YV12;
                }
            } else {
                oaVar = oa.YUV_420_888;
            }
        } else {
            oaVar = oa.BITMAP;
        }
        bVar.f57667b = oaVar;
        bVar.f57668c = Integer.valueOf(i7 & Integer.MAX_VALUE);
        r7Var.f615c = new pa(bVar);
        r7Var.d = fVar.f1028e.a();
        if (ggVar != null) {
            List list = ggVar.d;
            g gVar = c8.i.f5709b;
            Object[] array = list.toArray();
            int length = array.length;
            x7.a(length, array);
            r7Var.f617f = c8.i.m(length, array);
            List<fg> list2 = ggVar.f5688a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i12 = 0;
                for (fg fgVar : list2) {
                    b0 b0Var = new b0(2, false);
                    b0Var.f907b = Integer.valueOf(fgVar.f5669c & Integer.MAX_VALUE);
                    b0Var.f908c = Integer.valueOf(fgVar.d & Integer.MAX_VALUE);
                    b0Var.d = Integer.valueOf(fgVar.f5670e & Integer.MAX_VALUE);
                    b0Var.f909e = Integer.valueOf(fgVar.f5671f & Integer.MAX_VALUE);
                    re reVar = new re(b0Var);
                    int i13 = i12 + 1;
                    int length2 = objArr.length;
                    if (length2 < i13) {
                        int i14 = length2 + (length2 >> 1) + 1;
                        if (i14 < i13) {
                            int highestOneBit = Integer.highestOneBit(i12);
                            i14 = highestOneBit + highestOneBit;
                        }
                        if (i14 < 0) {
                            i14 = Integer.MAX_VALUE;
                        }
                        objArr = Arrays.copyOf(objArr, i14);
                    }
                    objArr[i12] = reVar;
                    i12 = i13;
                }
                r7Var.f616e = c8.i.m(i12, objArr);
            }
        }
        ga.d dVar = new ga.d(1);
        dVar.d = db.TYPE_THIN;
        dVar.h = new ce(r7Var);
        return new wa(dVar, 0);
    }

    public d() {
        this.f1018a = -1L;
        this.f1022f = new i(this);
        this.f1020c = new ArrayList();
    }
}
