package fi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.az;
import org.telegram.messenger.ff;
import org.telegram.messenger.jw;
import org.telegram.messenger.ls;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.si;
public final class o2 implements si {
    public final z3 f12316a;

    public o2(z3 z3Var) {
        this.f12316a = z3Var;
    }

    @Override
    public final void K0() {
        this.f12316a.L1.U();
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        org.telegram.messenger.c accountInstance;
        CharSequence charSequence2;
        boolean z12;
        z3 z3Var = this.f12316a;
        TL_stories.StoryItem storyItem = z3Var.f12888y1.f12715a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = z3Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            long j11 = z3Var.l1;
            org.telegram.messenger.q5 q5Var = az.J;
            new Thread(new jw(null, arrayList, j11, accountInstance, charSequence2, false, null, null, null, null, z10, i7, i10, storyItem, null, j3, z11, j10, null)).start();
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            z3Var.i0(z12);
        }
    }

    @Override
    public final void f0(gh ghVar) {
        ls.f(this.f12316a.f12842m2).d(ghVar);
    }

    @Override
    public final boolean g0() {
        return this.f12316a.L0();
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        TL_stories.StoryItem storyItem;
        boolean z14;
        boolean z15;
        org.telegram.messenger.c accountInstance;
        boolean z16;
        boolean z17;
        String str;
        String str2;
        z3 z3Var = this.f12316a;
        if (z3Var.f12867t0.f11977n0 && (storyItem = z3Var.f12888y1.f12715a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i7 != 8 && i7 != 7 && (i7 != 4 || z3Var.f12865s2.f40363e2.getSelectedPhotos().isEmpty())) {
                n2 n2Var = z3Var.f12865s2;
                if (n2Var != null) {
                    n2Var.M(i7);
                    return;
                }
                return;
            }
            boolean z18 = true;
            if (i7 != 8) {
                z3Var.f12865s2.a(true);
            }
            HashMap<Object, Object> selectedPhotos = z3Var.f12865s2.f40363e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = z3Var.f12865s2.f40363e2.getSelectedPhotosOrder();
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
                            ff ffVar = (ff) selectedPhotos.get(selectedPhotosOrder.get(i16));
                            ?? obj = new Object();
                            boolean z19 = ffVar.f28023b;
                            if (!z19 && (str2 = ffVar.h) != null) {
                                obj.f28371c = str2;
                            } else {
                                String str3 = ffVar.I;
                                if (str3 != null) {
                                    obj.f28371c = str3;
                                }
                            }
                            obj.f28372e = ffVar.f28024c;
                            obj.f28373f = ffVar.f28027g;
                            obj.f28381o = z19;
                            CharSequence charSequence = ffVar.f28022a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f28375i = ffVar.f28033n;
                            obj.f28376j = ffVar.f28037r;
                            obj.h = ffVar.f28042x;
                            obj.f28377k = ffVar.f28038s;
                            obj.f28384r = ffVar.L;
                            obj.f28386t = az.h(ffVar.f28022a);
                            obj.f28387u = ffVar.M;
                            arrayList.add(obj);
                            ffVar.e();
                        }
                    }
                    if (i13 == 0) {
                        z15 = ((zy) arrayList.get(i12)).f28386t;
                    } else {
                        z15 = i12;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = z3Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    int i17 = i12;
                    long j11 = z3Var.l1;
                    if (i7 != 4 && !z13) {
                        z16 = true;
                        z17 = i17;
                    } else {
                        z16 = true;
                        z17 = 1;
                    }
                    az.X(accountInstance, arrayList, j11, null, null, storyItem, null, z17, z10, null, null, z11, i10, i11, z15, null, null, 0L, false, 0L, z3Var.L1.getSendMonoForumPeerId(), z3Var.L1.getSendMessageSuggestionParams(), null, false);
                    i13++;
                    z18 = true;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i12 = i17;
                }
                boolean z20 = z18;
                int i18 = i12;
                z3Var.L1.setFieldText("");
                if (j10 <= 0) {
                    z14 = z20;
                } else {
                    z14 = i18;
                }
                z3Var.i0(z14);
            }
        }
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void R0(Object obj) {
    }

    @Override
    public final void h1(TLRPC.User user) {
    }
}
