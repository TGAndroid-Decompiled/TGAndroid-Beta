package defpackage;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class v89 implements n8c {
    public final byte a;
    public final z99 b;
    public final q5c[] c;

    public v89(z99 z99Var, q5c[] q5cVarArr, byte b) {
        this.a = b;
        this.b = z99Var;
        this.c = q5cVarArr;
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        byte b = this.a;
        q5c[] q5cVarArr = this.c;
        z99 z99Var = this.b;
        c4c c4cVar = (c4c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        z99Var.getClass();
        switch (b) {
            case 0:
                long j = ((TL_stars.starGiftAttributePattern) c4cVar.H).document.id;
                q99 q99Var = z99Var.d;
                boolean contains = q99Var.l.contains(Long.valueOf(j));
                HashSet hashSet = q99Var.l;
                if (!contains) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = q99Var.h;
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
                q99Var.m();
                q5c q5cVar = q5cVarArr[0];
                if (q5cVar != null) {
                    q5cVar.g3.O(true);
                    return;
                }
                return;
            case 1:
                int i2 = ((TL_stars.starGiftAttributeBackdrop) c4cVar.H).backdrop_id;
                q99 q99Var2 = z99Var.d;
                boolean contains2 = q99Var2.k.contains(Integer.valueOf(i2));
                HashSet hashSet2 = q99Var2.k;
                if (!contains2) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = q99Var2.g;
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
                q99Var2.m();
                q5c q5cVar2 = q5cVarArr[0];
                if (q5cVar2 != null) {
                    q5cVar2.g3.O(true);
                    return;
                }
                return;
            default:
                long j3 = ((TL_stars.starGiftAttributeModel) c4cVar.H).document.id;
                q99 q99Var3 = z99Var.d;
                boolean contains3 = q99Var3.j.contains(Long.valueOf(j3));
                HashSet hashSet3 = q99Var3.j;
                if (!contains3) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = q99Var3.f;
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
                q99Var3.m();
                q5c q5cVar3 = q5cVarArr[0];
                if (q5cVar3 != null) {
                    q5cVar3.g3.O(true);
                    return;
                }
                return;
        }
    }
}
