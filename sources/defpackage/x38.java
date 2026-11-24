package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class x38 implements g22 {
    public final a58 a;

    public x38(a58 a58Var) {
        this.a = a58Var;
    }

    @Override
    public final boolean B() {
        return this.a.G0();
    }

    @Override
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        TL_stories.StoryItem storyItem;
        boolean z5;
        boolean z6;
        j5 accountInstance;
        int i4;
        String str;
        String str2;
        a58 a58Var = this.a;
        if (a58Var.z0.n0 && (storyItem = a58Var.E1.a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i != 8 && i != 7 && (i != 4 || a58Var.y2.d2.getSelectedPhotos().isEmpty())) {
                e51 e51Var = a58Var.y2;
                if (e51Var != null) {
                    e51Var.I(i);
                    return;
                }
                return;
            }
            boolean z7 = true;
            if (i != 8) {
                a58Var.y2.a(true);
            }
            HashMap<Object, Object> selectedPhotos = a58Var.y2.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = a58Var.y2.d2.getSelectedPhotosOrder();
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
                            jo6 jo6Var = (jo6) selectedPhotos.get(selectedPhotosOrder.get(i9));
                            ?? obj = new Object();
                            boolean z8 = jo6Var.b;
                            if (!z8 && (str2 = jo6Var.h) != null) {
                                obj.c = str2;
                            } else {
                                String str3 = jo6Var.I;
                                if (str3 != null) {
                                    obj.c = str3;
                                }
                            }
                            obj.e = jo6Var.c;
                            obj.f = jo6Var.g;
                            obj.o = z8;
                            CharSequence charSequence = jo6Var.a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.i = jo6Var.n;
                            obj.j = jo6Var.r;
                            obj.h = jo6Var.x;
                            obj.k = jo6Var.s;
                            obj.r = jo6Var.L;
                            obj.t = a6a.h(jo6Var.a);
                            obj.u = jo6Var.M;
                            arrayList.add(obj);
                            jo6Var.e();
                        }
                    }
                    if (i6 == 0) {
                        z6 = ((z5a) arrayList.get(i5)).t;
                    } else {
                        z6 = i5;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = a58Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    boolean z9 = i5;
                    long j3 = a58Var.r1;
                    if (i != 4 && !z4) {
                        i4 = z9 ? 1 : 0;
                    } else {
                        i4 = z9 ? 1 : 0;
                        z9 = 1;
                    }
                    a6a.W(accountInstance, arrayList, j3, null, null, storyItem, null, z9, z, null, null, z2, i2, i3, z6, null, null, 0L, false, 0L, a58Var.R1.getSendMonoForumPeerId(), a58Var.R1.getSendMessageSuggestionParams(), null, false);
                    i6++;
                    z7 = true;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i5 = i4;
                }
                boolean z10 = z7;
                int i10 = i5;
                a58Var.R1.setFieldText("");
                if (j2 <= 0) {
                    z5 = z10;
                } else {
                    z5 = i10;
                }
                a58Var.a0(z5);
            }
        }
    }

    @Override
    public final boolean K0() {
        return false;
    }

    @Override
    public final void a1(vr0 vr0Var) {
        nm7.f(this.a.s2).d(vr0Var);
    }

    @Override
    public final void b0() {
        this.a.R1.R();
    }

    @Override
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        j5 accountInstance;
        Editable editable2;
        boolean z3;
        a58 a58Var = this.a;
        TL_stories.StoryItem storyItem = a58Var.E1.a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = a58Var.getAccountInstance();
            if (editable != null) {
                editable2 = editable;
            } else {
                editable2 = null;
            }
            long j3 = a58Var.r1;
            mp3 mp3Var = a6a.J;
            new Thread(new r3a(null, arrayList, j3, accountInstance, editable2, false, null, null, null, null, z, i, i2, storyItem, null, j, z2, j2, null)).start();
            if (j2 <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            a58Var.a0(z3);
        }
    }

    @Override
    public final void I() {
    }

    @Override
    public final void f0(Object obj) {
    }

    @Override
    public final void z0(TLRPC.User user) {
    }
}
