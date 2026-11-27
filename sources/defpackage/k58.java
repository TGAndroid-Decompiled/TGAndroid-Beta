package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class k58 implements l12 {
    public final o68 a;

    public k58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override
    public final boolean E0() {
        return false;
    }

    @Override
    public final void O0(vq0 vq0Var) {
        jn7.f(this.a.m2).d(vq0Var);
    }

    @Override
    public final void V() {
        this.a.L1.U();
    }

    @Override
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        k5 accountInstance;
        Editable editable2;
        boolean z3;
        o68 o68Var = this.a;
        TL_stories.StoryItem storyItem = o68Var.y1.a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = o68Var.getAccountInstance();
            if (editable != null) {
                editable2 = editable;
            } else {
                editable2 = null;
            }
            long j3 = o68Var.l1;
            to3 to3Var = r7a.J;
            new Thread(new o5a(null, arrayList, j3, accountInstance, editable2, false, null, null, null, null, z, i, i2, storyItem, null, j, z2, j2, null)).start();
            if (j2 <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            o68Var.a0(z3);
        }
    }

    @Override
    public final boolean o() {
        return this.a.G0();
    }

    @Override
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        TL_stories.StoryItem storyItem;
        boolean z5;
        boolean z6;
        k5 accountInstance;
        int i4;
        String str;
        String str2;
        o68 o68Var = this.a;
        if (o68Var.t0.n0 && (storyItem = o68Var.y1.a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i != 8 && i != 7 && (i != 4 || o68Var.s2.d2.getSelectedPhotos().isEmpty())) {
                f41 f41Var = o68Var.s2;
                if (f41Var != null) {
                    f41Var.I(i);
                    return;
                }
                return;
            }
            boolean z7 = true;
            if (i != 8) {
                o68Var.s2.a(true);
            }
            HashMap<Object, Object> selectedPhotos = o68Var.s2.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = o68Var.s2.d2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int i5 = 0;
                int i6 = 0;
                while (i6 < Math.ceil(selectedPhotos.size() / 10.0f)) {
                    int i7 = i6 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i7);
                    ArrayList arrayList = new ArrayList();
                    for (int i8 = i5; i8 < min; i8++) {
                        int i9 = i7 + i8;
                        if (i9 < selectedPhotosOrder.size()) {
                            no6 no6Var = (no6) selectedPhotos.get(selectedPhotosOrder.get(i9));
                            ?? obj = new Object();
                            boolean z8 = no6Var.b;
                            if (!z8 && (str2 = no6Var.h) != null) {
                                obj.c = str2;
                            } else {
                                String str3 = no6Var.I;
                                if (str3 != null) {
                                    obj.c = str3;
                                }
                            }
                            obj.e = no6Var.c;
                            obj.f = no6Var.g;
                            obj.o = z8;
                            CharSequence charSequence = no6Var.a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.i = no6Var.n;
                            obj.j = no6Var.r;
                            obj.h = no6Var.x;
                            obj.k = no6Var.s;
                            obj.r = no6Var.L;
                            obj.t = r7a.h(no6Var.a);
                            obj.u = no6Var.M;
                            arrayList.add(obj);
                            no6Var.e();
                        }
                    }
                    if (i6 == 0) {
                        z6 = ((q7a) arrayList.get(i5)).t;
                    } else {
                        z6 = i5;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = o68Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    boolean z9 = i5;
                    long j3 = o68Var.l1;
                    if (i != 4 && !z4) {
                        i4 = z9 ? 1 : 0;
                    } else {
                        i4 = z9 ? 1 : 0;
                        z9 = 1;
                    }
                    r7a.W(accountInstance, arrayList, j3, null, null, storyItem, null, z9, z, null, null, z2, i2, i3, z6, null, null, 0L, false, 0L, o68Var.L1.getSendMonoForumPeerId(), o68Var.L1.getSendMessageSuggestionParams(), null, false);
                    i6++;
                    z7 = true;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i5 = i4;
                }
                boolean z10 = z7;
                int i10 = i5;
                o68Var.L1.setFieldText("");
                if (j2 <= 0) {
                    z5 = z10;
                } else {
                    z5 = i10;
                }
                o68Var.a0(z5);
            }
        }
    }

    @Override
    public final void R() {
    }

    @Override
    public final void e0(Object obj) {
    }

    @Override
    public final void i0(TLRPC.User user) {
    }
}
