package k;

import android.graphics.Bitmap;
import android.support.v4.media.session.a0;
import android.view.View;
import android.view.animation.Interpolator;
import b8.af;
import b8.cb;
import b8.gg;
import b8.k1;
import b8.ke;
import b8.kg;
import b8.lb;
import b8.le;
import b8.nb;
import b8.xa;
import b8.xg;
import b8.ya;
import b8.yg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import r0.l0;
import r0.m0;
public final class j implements gg {
    public long f16429a;
    public boolean f16430b;
    public final Object f16431c;
    public Object d;
    public Object f16432e;
    public final Object f16433f;

    public j(xb.d dVar, long j10, nb nbVar, boolean z10, rb.a aVar, yg ygVar) {
        this.f16431c = dVar;
        this.f16429a = j10;
        this.d = nbVar;
        this.f16430b = z10;
        this.f16432e = aVar;
        this.f16433f = ygVar;
    }

    public void a() {
        if (!this.f16430b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f16431c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((l0) obj).b();
        }
        this.f16430b = false;
    }

    public void b() {
        View view;
        if (this.f16430b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f16431c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            l0 l0Var = (l0) obj;
            long j10 = this.f16429a;
            if (j10 >= 0) {
                l0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.f54027a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.f16432e) != null) {
                l0Var.d((i) this.f16433f);
            }
            View view2 = (View) l0Var.f54027a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f16430b = true;
    }

    @Override
    public kg zza() {
        int i3;
        xa xaVar;
        xb.d dVar = (xb.d) this.f16431c;
        long j10 = this.f16429a;
        boolean z10 = this.f16430b;
        rb.a aVar = (rb.a) this.f16432e;
        yg ygVar = (yg) this.f16433f;
        ke keVar = new ke(0);
        a0 a0Var = new a0(9, false);
        a0Var.f1186b = Long.valueOf(j10 & Long.MAX_VALUE);
        a0Var.f1187c = (nb) this.d;
        a0Var.d = Boolean.valueOf(z10);
        keVar.f2716b = new cb(a0Var);
        int i10 = aVar.f54471e;
        xb.d.f58600l.getClass();
        int i11 = aVar.f54471e;
        if (i11 == -1) {
            Bitmap bitmap = aVar.f54468a;
            p6.m.g(bitmap);
            i3 = bitmap.getAllocationByteCount();
        } else if (i11 != 17 && i11 != 842094169) {
            if (i11 != 35) {
                i3 = 0;
            } else {
                p6.m.g(null);
                throw null;
            }
        } else {
            p6.m.g(null);
            throw null;
        }
        ?? obj = new Object();
        if (i10 != -1) {
            if (i10 != 35) {
                if (i10 != 842094169) {
                    if (i10 != 16) {
                        if (i10 != 17) {
                            xaVar = xa.UNKNOWN_FORMAT;
                        } else {
                            xaVar = xa.NV21;
                        }
                    } else {
                        xaVar = xa.NV16;
                    }
                } else {
                    xaVar = xa.YV12;
                }
            } else {
                xaVar = xa.YUV_420_888;
            }
        } else {
            xaVar = xa.BITMAP;
        }
        obj.f55094a = xaVar;
        obj.f55095b = Integer.valueOf(i3 & Integer.MAX_VALUE);
        keVar.f2717c = new ya(obj);
        keVar.d = dVar.f58601e.a();
        if (ygVar != null) {
            List list = ygVar.d;
            b8.j jVar = b8.l.f2724b;
            Object[] array = list.toArray();
            int length = array.length;
            k1.a(length, array);
            keVar.f2719f = b8.l.m(length, array);
            List<xg> list2 = ygVar.f3149a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i12 = 0;
                for (xg xgVar : list2) {
                    ui.f fVar = new ui.f(2, false);
                    fVar.f56390b = Integer.valueOf(xgVar.f3132c & Integer.MAX_VALUE);
                    fVar.f56391c = Integer.valueOf(xgVar.d & Integer.MAX_VALUE);
                    fVar.d = Integer.valueOf(xgVar.f3133e & Integer.MAX_VALUE);
                    fVar.f56392e = Integer.valueOf(xgVar.f3134f & Integer.MAX_VALUE);
                    af afVar = new af(fVar);
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
                    objArr[i12] = afVar;
                    i12 = i13;
                }
                keVar.f2718e = b8.l.m(i12, objArr);
            }
        }
        fa.f fVar2 = new fa.f(1);
        fVar2.d = lb.TYPE_THIN;
        fVar2.h = new le(keVar);
        return new kg(fVar2, 0);
    }

    public j() {
        this.f16429a = -1L;
        this.f16433f = new i(this);
        this.f16431c = new ArrayList();
    }
}
