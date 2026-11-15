package fi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.dz;
import org.telegram.messenger.ez;
import org.telegram.messenger.ff;
import org.telegram.messenger.mw;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.vg;
public final class q2 implements ii {
    public final b4 f12223a;

    public q2(b4 b4Var) {
        this.f12223a = b4Var;
    }

    @Override
    public final void K0() {
        this.f12223a.L1.S();
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
        b4 b4Var = this.f12223a;
        TL_stories.StoryItem storyItem = b4Var.f11543y1.f12579a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = b4Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            long j11 = b4Var.l1;
            org.telegram.messenger.p5 p5Var = ez.J;
            new Thread(new mw(null, arrayList, j11, accountInstance, charSequence2, false, null, null, null, null, z10, i7, i10, storyItem, null, j3, z11, j10, null)).start();
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            b4Var.i0(z12);
        }
    }

    @Override
    public final void d0(vg vgVar) {
        ns.f(this.f12223a.f11497m2).d(vgVar);
    }

    @Override
    public final boolean g0() {
        return this.f12223a.L0();
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
        b4 b4Var = this.f12223a;
        if (b4Var.f11522t0.f11860n0 && (storyItem = b4Var.f11543y1.f12579a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i7 != 8 && i7 != 7 && (i7 != 4 || b4Var.f11520s2.f36435e2.getSelectedPhotos().isEmpty())) {
                p2 p2Var = b4Var.f11520s2;
                if (p2Var != null) {
                    p2Var.M(i7);
                    return;
                }
                return;
            }
            boolean z18 = true;
            if (i7 != 8) {
                b4Var.f11520s2.a(true);
            }
            HashMap<Object, Object> selectedPhotos = b4Var.f11520s2.f36435e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = b4Var.f11520s2.f36435e2.getSelectedPhotosOrder();
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
                            boolean z19 = ffVar.f27710b;
                            if (!z19 && (str2 = ffVar.h) != null) {
                                obj.f23196c = str2;
                            } else {
                                String str3 = ffVar.I;
                                if (str3 != null) {
                                    obj.f23196c = str3;
                                }
                            }
                            obj.f23197e = ffVar.f27711c;
                            obj.f23198f = ffVar.f27714g;
                            obj.f23206o = z19;
                            CharSequence charSequence = ffVar.f27709a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f23200i = ffVar.f27720n;
                            obj.f23201j = ffVar.f27724r;
                            obj.h = ffVar.f27729x;
                            obj.f23202k = ffVar.f27725s;
                            obj.f23209r = ffVar.L;
                            obj.f23211t = ez.h(ffVar.f27709a);
                            obj.f23212u = ffVar.M;
                            arrayList.add(obj);
                            ffVar.e();
                        }
                    }
                    if (i13 == 0) {
                        z15 = ((dz) arrayList.get(i12)).f23211t;
                    } else {
                        z15 = i12;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = b4Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    int i17 = i12;
                    long j11 = b4Var.l1;
                    if (i7 != 4 && !z13) {
                        z16 = true;
                        z17 = i17;
                    } else {
                        z16 = true;
                        z17 = 1;
                    }
                    ez.X(accountInstance, arrayList, j11, null, null, storyItem, null, z17, z10, null, null, z11, i10, i11, z15, null, null, 0L, false, 0L, b4Var.L1.getSendMonoForumPeerId(), b4Var.L1.getSendMessageSuggestionParams(), null, false);
                    i13++;
                    z18 = true;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i12 = i17;
                }
                boolean z20 = z18;
                int i18 = i12;
                b4Var.L1.setFieldText("");
                if (j10 <= 0) {
                    z14 = z20;
                } else {
                    z14 = i18;
                }
                b4Var.i0(z14);
            }
        }
    }

    @Override
    public final void R0(Object obj) {
    }

    @Override
    public final void h1(TLRPC.User user) {
    }

    @Override
    public final void v0() {
    }
}
