package di;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.fz;
import org.telegram.messenger.gf;
import org.telegram.messenger.gz;
import org.telegram.messenger.ow;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.qg;
public final class v2 implements bi {
    public final i4 f9864a;

    public v2(i4 i4Var) {
        this.f9864a = i4Var;
    }

    @Override
    public final void F0() {
        this.f9864a.K1.L();
    }

    @Override
    public final boolean G1() {
        return false;
    }

    @Override
    public final void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        org.telegram.messenger.c accountInstance;
        CharSequence charSequence2;
        boolean z11;
        i4 i4Var = this.f9864a;
        TL_stories.StoryItem storyItem = i4Var.f9213x1.f9038a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = i4Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            long j11 = i4Var.f9164k1;
            org.telegram.messenger.p5 p5Var = gz.I;
            new Thread(new ow(null, arrayList, j11, accountInstance, charSequence2, false, null, null, null, null, z9, i7, i10, storyItem, null, j3, z10, j10, null)).start();
            if (j10 <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            i4Var.i0(z11);
        }
    }

    @Override
    public final void c0(qg qgVar) {
        qs.f(this.f9864a.f9168l2).d(qgVar);
    }

    @Override
    public final boolean f0() {
        return this.f9864a.L0();
    }

    @Override
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        TL_stories.StoryItem storyItem;
        boolean z13;
        boolean z14;
        org.telegram.messenger.c accountInstance;
        boolean z15;
        boolean z16;
        String str;
        String str2;
        i4 i4Var = this.f9864a;
        if (i4Var.f9192s0.m0 && (storyItem = i4Var.f9213x1.f9038a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i7 != 8 && i7 != 7 && (i7 != 4 || i4Var.f9190r2.f32932a2.getSelectedPhotos().isEmpty())) {
                u2 u2Var = i4Var.f9190r2;
                if (u2Var != null) {
                    u2Var.L(i7);
                    return;
                }
                return;
            }
            boolean z17 = true;
            if (i7 != 8) {
                i4Var.f9190r2.a(true);
            }
            HashMap<Object, Object> selectedPhotos = i4Var.f9190r2.f32932a2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = i4Var.f9190r2.f32932a2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int i12 = 0;
                int i13 = 0;
                while (i13 < Math.ceil(selectedPhotos.size() / 10.0f)) {
                    int i14 = i13 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i14);
                    ArrayList arrayList = new ArrayList();
                    for (int i15 = i12; i15 < min; i15++) {
                        int i16 = i14 + i15;
                        if (i16 < selectedPhotosOrder.size()) {
                            gf gfVar = (gf) selectedPhotos.get(selectedPhotosOrder.get(i16));
                            ?? obj = new Object();
                            boolean z18 = gfVar.f26845b;
                            if (!z18 && (str2 = gfVar.h) != null) {
                                obj.f22512c = str2;
                            } else {
                                String str3 = gfVar.I;
                                if (str3 != null) {
                                    obj.f22512c = str3;
                                }
                            }
                            obj.f22513e = gfVar.f26846c;
                            obj.f22514f = gfVar.f26849g;
                            obj.f22522o = z18;
                            CharSequence charSequence = gfVar.f26844a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f22516i = gfVar.f26855n;
                            obj.f22517j = gfVar.f26859r;
                            obj.h = gfVar.f26864x;
                            obj.f22518k = gfVar.f26860s;
                            obj.f22525r = gfVar.L;
                            obj.f22527t = gz.h(gfVar.f26844a);
                            obj.f22528u = gfVar.M;
                            arrayList.add(obj);
                            gfVar.e();
                        }
                    }
                    if (i13 == 0) {
                        z14 = ((fz) arrayList.get(i12)).f22527t;
                    } else {
                        z14 = i12;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = i4Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    int i17 = i12;
                    long j11 = i4Var.f9164k1;
                    if (i7 != 4 && !z12) {
                        z15 = true;
                        z16 = i17;
                    } else {
                        z15 = true;
                        z16 = 1;
                    }
                    gz.X(accountInstance, arrayList, j11, null, null, storyItem, null, z16, z9, null, null, z10, i10, i11, z14, null, null, 0L, false, 0L, i4Var.K1.getSendMonoForumPeerId(), i4Var.K1.getSendMessageSuggestionParams(), null, false);
                    i13++;
                    z17 = true;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i12 = i17;
                }
                boolean z19 = z17;
                int i18 = i12;
                i4Var.K1.setFieldText("");
                if (j10 <= 0) {
                    z13 = z19;
                } else {
                    z13 = i18;
                }
                i4Var.i0(z13);
            }
        }
    }

    @Override
    public final void M0(Object obj) {
    }

    @Override
    public final void Y0(TLRPC.User user) {
    }

    @Override
    public final void t0() {
    }
}
