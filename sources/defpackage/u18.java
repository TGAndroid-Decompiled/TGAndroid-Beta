package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class u18 implements v02 {
    public final y28 a;

    public u18(y28 y28Var) {
        this.a = y28Var;
    }

    @Override
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        TL_stories.StoryItem storyItem;
        boolean z5;
        boolean z6;
        j5 accountInstance;
        int i4;
        String str;
        String str2;
        y28 y28Var = this.a;
        if (y28Var.z0.n0 && (storyItem = y28Var.E1.a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i != 8 && i != 7 && (i != 4 || y28Var.y2.d2.getSelectedPhotos().isEmpty())) {
                x31 x31Var = y28Var.y2;
                if (x31Var != null) {
                    x31Var.J(i);
                    return;
                }
                return;
            }
            boolean z7 = true;
            if (i != 8) {
                y28Var.y2.a(true);
            }
            HashMap<Object, Object> selectedPhotos = y28Var.y2.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = y28Var.y2.d2.getSelectedPhotosOrder();
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
                            jm6 jm6Var = (jm6) selectedPhotos.get(selectedPhotosOrder.get(i9));
                            ?? obj = new Object();
                            boolean z8 = jm6Var.b;
                            if (!z8 && (str2 = jm6Var.h) != null) {
                                obj.c = str2;
                            } else {
                                String str3 = jm6Var.I;
                                if (str3 != null) {
                                    obj.c = str3;
                                }
                            }
                            obj.e = jm6Var.c;
                            obj.f = jm6Var.g;
                            obj.o = z8;
                            CharSequence charSequence = jm6Var.a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.i = jm6Var.n;
                            obj.j = jm6Var.r;
                            obj.h = jm6Var.x;
                            obj.k = jm6Var.s;
                            obj.r = jm6Var.L;
                            obj.t = z3a.h(jm6Var.a);
                            obj.u = jm6Var.M;
                            arrayList.add(obj);
                            jm6Var.e();
                        }
                    }
                    if (i6 == 0) {
                        z6 = ((y3a) arrayList.get(i5)).t;
                    } else {
                        z6 = i5;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = y28Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    boolean z9 = i5;
                    long j3 = y28Var.r1;
                    if (i != 4 && !z4) {
                        i4 = z9 ? 1 : 0;
                    } else {
                        i4 = z9 ? 1 : 0;
                        z9 = 1;
                    }
                    z3a.W(accountInstance, arrayList, j3, null, null, storyItem, null, z9, z, null, null, z2, i2, i3, z6, null, null, 0L, false, 0L, y28Var.R1.getSendMonoForumPeerId(), y28Var.R1.getSendMessageSuggestionParams(), null, false);
                    i6++;
                    z7 = true;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i5 = i4;
                }
                boolean z10 = z7;
                int i10 = i5;
                y28Var.R1.setFieldText("");
                if (j2 <= 0) {
                    z5 = z10;
                } else {
                    z5 = i10;
                }
                y28Var.a0(z5);
            }
        }
    }

    @Override
    public final void I0() {
        this.a.R1.S();
    }

    @Override
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        j5 accountInstance;
        Editable editable2;
        boolean z3;
        y28 y28Var = this.a;
        TL_stories.StoryItem storyItem = y28Var.E1.a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = y28Var.getAccountInstance();
            if (editable != null) {
                editable2 = editable;
            } else {
                editable2 = null;
            }
            long j3 = y28Var.r1;
            co3 co3Var = z3a.J;
            new Thread(new p1a(null, arrayList, j3, accountInstance, editable2, false, null, null, null, null, z, i, i2, storyItem, null, j, z2, j2, null)).start();
            if (j2 <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            y28Var.a0(z3);
        }
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final boolean f0() {
        return this.a.G0();
    }

    @Override
    public final void z2(vq0 vq0Var) {
        kk7.f(this.a.s2).d(vq0Var);
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void P0(Object obj) {
    }

    @Override
    public final void g1(TLRPC.User user) {
    }
}
