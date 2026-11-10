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
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.pg;
public final class v2 implements ai {
    public final j4 f9862a;

    public v2(j4 j4Var) {
        this.f9862a = j4Var;
    }

    @Override
    public final void F0() {
        this.f9862a.K1.L();
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
        j4 j4Var = this.f9862a;
        TL_stories.StoryItem storyItem = j4Var.f9250x1.f9069a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = j4Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            long j11 = j4Var.f9201k1;
            org.telegram.messenger.p5 p5Var = gz.I;
            new Thread(new ow(null, arrayList, j11, accountInstance, charSequence2, false, null, null, null, null, z9, i7, i10, storyItem, null, j3, z10, j10, null)).start();
            if (j10 <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            j4Var.i0(z11);
        }
    }

    @Override
    public final void c0(pg pgVar) {
        qs.f(this.f9862a.f9205l2).d(pgVar);
    }

    @Override
    public final boolean f0() {
        return this.f9862a.L0();
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
        j4 j4Var = this.f9862a;
        if (j4Var.f9229s0.m0 && (storyItem = j4Var.f9250x1.f9069a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i7 != 8 && i7 != 7 && (i7 != 4 || j4Var.f9227r2.d2.getSelectedPhotos().isEmpty())) {
                u2 u2Var = j4Var.f9227r2;
                if (u2Var != null) {
                    u2Var.L(i7);
                    return;
                }
                return;
            }
            boolean z17 = true;
            if (i7 != 8) {
                j4Var.f9227r2.a(true);
            }
            HashMap<Object, Object> selectedPhotos = j4Var.f9227r2.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = j4Var.f9227r2.d2.getSelectedPhotosOrder();
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
                            boolean z18 = gfVar.f26849b;
                            if (!z18 && (str2 = gfVar.h) != null) {
                                obj.f22516c = str2;
                            } else {
                                String str3 = gfVar.I;
                                if (str3 != null) {
                                    obj.f22516c = str3;
                                }
                            }
                            obj.f22517e = gfVar.f26850c;
                            obj.f22518f = gfVar.f26853g;
                            obj.f22526o = z18;
                            CharSequence charSequence = gfVar.f26848a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f22520i = gfVar.f26859n;
                            obj.f22521j = gfVar.f26863r;
                            obj.h = gfVar.f26868x;
                            obj.f22522k = gfVar.f26864s;
                            obj.f22529r = gfVar.L;
                            obj.f22531t = gz.h(gfVar.f26848a);
                            obj.f22532u = gfVar.M;
                            arrayList.add(obj);
                            gfVar.e();
                        }
                    }
                    if (i13 == 0) {
                        z14 = ((fz) arrayList.get(i12)).f22531t;
                    } else {
                        z14 = i12;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = j4Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    int i17 = i12;
                    long j11 = j4Var.f9201k1;
                    if (i7 != 4 && !z12) {
                        z15 = true;
                        z16 = i17;
                    } else {
                        z15 = true;
                        z16 = 1;
                    }
                    gz.X(accountInstance, arrayList, j11, null, null, storyItem, null, z16, z9, null, null, z10, i10, i11, z14, null, null, 0L, false, 0L, j4Var.K1.getSendMonoForumPeerId(), j4Var.K1.getSendMessageSuggestionParams(), null, false);
                    i13++;
                    z17 = true;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i12 = i17;
                }
                boolean z19 = z17;
                int i18 = i12;
                j4Var.K1.setFieldText("");
                if (j10 <= 0) {
                    z13 = z19;
                } else {
                    z13 = i18;
                }
                j4Var.i0(z13);
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
