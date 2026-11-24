package defpackage;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class xa9 implements oac {
    public final byte a;
    public final zb9 b;
    public final q7c[] c;

    public xa9(zb9 zb9Var, q7c[] q7cVarArr, byte b) {
        this.a = b;
        this.b = zb9Var;
        this.c = q7cVarArr;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        byte b = this.a;
        q7c[] q7cVarArr = this.c;
        zb9 zb9Var = this.b;
        c6c c6cVar = (c6c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        zb9Var.getClass();
        switch (b) {
            case 0:
                long j = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                qb9 qb9Var = zb9Var.d;
                boolean contains = qb9Var.l.contains(Long.valueOf(j));
                HashSet hashSet = qb9Var.l;
                if (!contains) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = qb9Var.h;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj3 = arrayList.get(i);
                            i++;
                            long j2 = ((TL_stars.starGiftAttributePattern) obj3).document.id;
                            if (j2 != j) {
                                hashSet.add(Long.valueOf(j2));
                            }
                        }
                    } else {
                        hashSet.add(Long.valueOf(j));
                    }
                } else {
                    hashSet.remove(Long.valueOf(j));
                }
                qb9Var.m();
                q7c q7cVar = q7cVarArr[0];
                if (q7cVar != null) {
                    q7cVar.g3.O(true);
                    return;
                }
                return;
            case 1:
                int i2 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                qb9 qb9Var2 = zb9Var.d;
                boolean contains2 = qb9Var2.k.contains(Integer.valueOf(i2));
                HashSet hashSet2 = qb9Var2.k;
                if (!contains2) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = qb9Var2.g;
                        int size2 = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj4 = arrayList2.get(i3);
                            i3++;
                            int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                            if (i4 != i2) {
                                hashSet2.add(Integer.valueOf(i4));
                            }
                        }
                    } else {
                        hashSet2.add(Integer.valueOf(i2));
                    }
                } else {
                    hashSet2.remove(Integer.valueOf(i2));
                }
                qb9Var2.m();
                q7c q7cVar2 = q7cVarArr[0];
                if (q7cVar2 != null) {
                    q7cVar2.g3.O(true);
                    return;
                }
                return;
            default:
                long j3 = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                qb9 qb9Var3 = zb9Var.d;
                boolean contains3 = qb9Var3.j.contains(Long.valueOf(j3));
                HashSet hashSet3 = qb9Var3.j;
                if (!contains3) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = qb9Var3.f;
                        int size3 = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Object obj5 = arrayList3.get(i5);
                            i5++;
                            long j4 = ((TL_stars.starGiftAttributeModel) obj5).document.id;
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
                qb9Var3.m();
                q7c q7cVar3 = q7cVarArr[0];
                if (q7cVar3 != null) {
                    q7cVar3.g3.O(true);
                    return;
                }
                return;
        }
    }
}
