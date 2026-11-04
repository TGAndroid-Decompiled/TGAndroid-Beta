package ei;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hs;
import org.telegram.messenger.hw;
import org.telegram.messenger.xy;
import org.telegram.messenger.ye;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.zh;
public final class y2 implements zh {
    public final j4 f11227a;

    public y2(j4 j4Var) {
        this.f11227a = j4Var;
    }

    @Override
    public final boolean L1() {
        return false;
    }

    @Override
    public final void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
        org.telegram.messenger.c accountInstance;
        CharSequence charSequence2;
        boolean z12;
        j4 j4Var = this.f11227a;
        TL_stories.StoryItem storyItem = j4Var.f10527y1.f10358a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = j4Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            long j12 = j4Var.f10477l1;
            org.telegram.messenger.p5 p5Var = yy.J;
            new Thread(new hw(null, arrayList, j12, accountInstance, charSequence2, false, null, null, null, null, z10, i3, i10, storyItem, null, j10, z11, j11, null)).start();
            if (j11 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            j4Var.i0(z12);
        }
    }

    @Override
    public final void Y(ng ngVar) {
        hs.f(this.f11227a.f10480m2).d(ngVar);
    }

    @Override
    public final boolean g0() {
        return this.f11227a.L0();
    }

    @Override
    public final void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        TL_stories.StoryItem storyItem;
        boolean z14;
        boolean z15;
        org.telegram.messenger.c accountInstance;
        boolean z16;
        boolean z17;
        String str;
        String str2;
        j4 j4Var = this.f11227a;
        if (j4Var.f10506t0.f10937n0 && (storyItem = j4Var.f10527y1.f10358a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i3 != 8 && i3 != 7 && (i3 != 4 || j4Var.f10504s2.f32215b2.getSelectedPhotos().isEmpty())) {
                x2 x2Var = j4Var.f10504s2;
                if (x2Var != null) {
                    x2Var.L(i3);
                    return;
                }
                return;
            }
            boolean z18 = true;
            if (i3 != 8) {
                j4Var.f10504s2.a(true);
            }
            HashMap<Object, Object> selectedPhotos = j4Var.f10504s2.f32215b2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = j4Var.f10504s2.f32215b2.getSelectedPhotosOrder();
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
                            ye yeVar = (ye) selectedPhotos.get(selectedPhotosOrder.get(i16));
                            ?? obj = new Object();
                            boolean z19 = yeVar.f25310b;
                            if (!z19 && (str2 = yeVar.h) != null) {
                                obj.f26477c = str2;
                            } else {
                                String str3 = yeVar.I;
                                if (str3 != null) {
                                    obj.f26477c = str3;
                                }
                            }
                            obj.f26478e = yeVar.f25311c;
                            obj.f26479f = yeVar.f25314g;
                            obj.f26487o = z19;
                            CharSequence charSequence = yeVar.f25309a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f26481i = yeVar.f25320n;
                            obj.f26482j = yeVar.f25324r;
                            obj.h = yeVar.f25329x;
                            obj.f26483k = yeVar.f25325s;
                            obj.f26490r = yeVar.L;
                            obj.f26492t = yy.h(yeVar.f25309a);
                            obj.f26493u = yeVar.M;
                            arrayList.add(obj);
                            yeVar.e();
                        }
                    }
                    if (i13 == 0) {
                        z15 = ((xy) arrayList.get(i12)).f26492t;
                    } else {
                        z15 = i12;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = j4Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    int i17 = i12;
                    long j12 = j4Var.f10477l1;
                    if (i3 != 4 && !z13) {
                        z16 = true;
                        z17 = i17;
                    } else {
                        z16 = true;
                        z17 = 1;
                    }
                    yy.X(accountInstance, arrayList, j12, null, null, storyItem, null, z17, z10, null, null, z11, i10, i11, z15, null, null, 0L, false, 0L, j4Var.L1.getSendMonoForumPeerId(), j4Var.L1.getSendMessageSuggestionParams(), null, false);
                    i13++;
                    z18 = true;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i12 = i17;
                }
                boolean z20 = z18;
                int i18 = i12;
                j4Var.L1.setFieldText("");
                if (j11 <= 0) {
                    z14 = z20;
                } else {
                    z14 = i18;
                }
                j4Var.i0(z14);
            }
        }
    }

    @Override
    public final void v0() {
        this.f11227a.L1.L();
    }

    @Override
    public final void I0(Object obj) {
    }

    @Override
    public final void a1(TLRPC.User user) {
    }

    @Override
    public final void r0() {
    }
}
