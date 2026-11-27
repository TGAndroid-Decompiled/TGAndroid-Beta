package defpackage;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class hc9 implements ncc {
    public final byte a;
    public final nd9 b;
    public final q9c[] c;

    public hc9(nd9 nd9Var, q9c[] q9cVarArr, byte b) {
        this.a = b;
        this.b = nd9Var;
        this.c = q9cVarArr;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        byte b = this.a;
        q9c[] q9cVarArr = this.c;
        nd9 nd9Var = this.b;
        b8c b8cVar = (b8c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        switch (b) {
            case 0:
                nd9Var.getClass();
                int i = ((TL_stars.starGiftAttributeBackdrop) b8cVar.H).backdrop_id;
                ed9 ed9Var = nd9Var.e;
                boolean contains = ed9Var.l.contains(Integer.valueOf(i));
                HashSet hashSet = ed9Var.l;
                if (!contains) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = ed9Var.h;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj3 = arrayList.get(i2);
                            i2++;
                            int i3 = ((TL_stars.starGiftAttributeBackdrop) obj3).backdrop_id;
                            if (i3 != i) {
                                hashSet.add(Integer.valueOf(i3));
                            }
                        }
                    } else {
                        hashSet.add(Integer.valueOf(i));
                    }
                } else {
                    hashSet.remove(Integer.valueOf(i));
                }
                ed9Var.p();
                q9c q9cVar = q9cVarArr[0];
                if (q9cVar != null) {
                    q9cVar.g3.O(true);
                    return;
                }
                return;
            case 1:
                nd9Var.getClass();
                long j = ((TL_stars.starGiftAttributeModel) b8cVar.H).document.id;
                ed9 ed9Var2 = nd9Var.e;
                boolean contains2 = ed9Var2.k.contains(Long.valueOf(j));
                HashSet hashSet2 = ed9Var2.k;
                if (!contains2) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = ed9Var2.g;
                        int size2 = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj4 = arrayList2.get(i4);
                            i4++;
                            long j2 = ((TL_stars.starGiftAttributeModel) obj4).document.id;
                            if (j2 != j) {
                                hashSet2.add(Long.valueOf(j2));
                            }
                        }
                    } else {
                        hashSet2.add(Long.valueOf(j));
                    }
                } else {
                    hashSet2.remove(Long.valueOf(j));
                }
                ed9Var2.p();
                q9c q9cVar2 = q9cVarArr[0];
                if (q9cVar2 != null) {
                    q9cVar2.g3.O(true);
                    return;
                }
                return;
            case 2:
                nd9Var.k0(q9cVarArr, b8cVar, view);
                return;
            default:
                nd9Var.getClass();
                long j3 = ((TL_stars.starGiftAttributePattern) b8cVar.H).document.id;
                ed9 ed9Var3 = nd9Var.e;
                boolean contains3 = ed9Var3.m.contains(Long.valueOf(j3));
                HashSet hashSet3 = ed9Var3.m;
                if (!contains3) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = ed9Var3.i;
                        int size3 = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Object obj5 = arrayList3.get(i5);
                            i5++;
                            long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                            if (j4 != j3) {
                                hashSet3.add(Long.valueOf(j4));
                            }
                        }
                    } else {
                        hashSet3.add(Long.valueOf(j3));
                    }
                } else {
                    hashSet3.remove(Long.valueOf(j3));
                }
                ed9Var3.p();
                q9c q9cVar3 = q9cVarArr[0];
                if (q9cVar3 != null) {
                    q9cVar3.g3.O(true);
                    return;
                }
                return;
        }
    }
}
