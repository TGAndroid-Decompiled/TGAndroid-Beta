package ai;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.m90;
import org.telegram.ui.eo;
import org.telegram.ui.h10;
import org.telegram.ui.i60;
import org.telegram.ui.l50;
import org.telegram.ui.sk;
import org.telegram.ui.yh1;
public final class k implements u9, yh1, m4.b1, e2.h, org.telegram.ui.ActionBar.z1, yf.m, MessagesController.ErrorDelegate, vh.k {
    public final int f1213a;
    public final boolean f1214b;
    public final Object f1215c;

    public k(int i10, Object obj, boolean z10) {
        this.f1213a = i10;
        this.f1215c = obj;
        this.f1214b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f1213a) {
            case 1:
                hg.b0 b0Var = (hg.b0) this.f1215c;
                ArrayList arrayList2 = b0Var.f11164k;
                ArrayList arrayList3 = b0Var.f11163j;
                int i11 = 0;
                if (this.f1214b) {
                    b0Var.f11160f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    b0Var.f11161g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                b0Var.f11159e.run();
                return;
            default:
                h10 h10Var = (h10) this.f1215c;
                LongSparseIntArray longSparseIntArray = h10Var.H;
                h10Var.f38222y = i10;
                if (this.f1214b) {
                    h10Var.o0(h10Var.F, arrayList, true);
                    h10Var.F = arrayList;
                    for (int i12 = 0; i12 < h10Var.F.size(); i12++) {
                        h10Var.G.remove(h10Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !h10Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    h10Var.o0(h10Var.G, arrayList, false);
                    h10Var.G = arrayList;
                    for (int i15 = 0; i15 < h10Var.G.size(); i15++) {
                        Long l4 = (Long) h10Var.G.get(i15);
                        h10Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                h10Var.j0();
                h10Var.i0(false);
                h10Var.w0();
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        ((m4.g1) obj).K0((b2.e) this.f1215c, this.f1214b);
    }

    @Override
    public void b(boolean z10) {
        b0 b0Var = (b0) this.f1215c;
        if (!this.f1214b && z10) {
            boolean z11 = true;
            if (b0Var.f664b != 1) {
                z11 = false;
            }
            m9 m9Var = b0Var.f686s;
            if (z11) {
                if (!m9Var.f1426z) {
                    return;
                }
            } else if (!m9Var.f1417p) {
                return;
            }
            m9Var.Q(z11);
        }
    }

    @Override
    public void e(long j3) {
        org.telegram.ui.Components.q6 q6Var = ((org.telegram.ui.Cells.u1) this.f1215c).f23197w4;
        if (q6Var != null) {
            q6Var.t(LocaleController.formatPollEndTime((int) j3, this.f1214b), true, true);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        switch (this.f1213a) {
            case 5:
                org.telegram.ui.b7.V((org.telegram.ui.b7) this.f1215c, this.f1214b);
                return;
            case 6:
            default:
                i60 i60Var = ((l50) this.f1215c).f39646b;
                i60Var.f38678a1.toggleRecord(null, 0);
                UndoView l1 = i60Var.l1();
                if (this.f1214b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                l1.j(i11, 0L, null);
                return;
            case 7:
                eo eoVar = (eo) this.f1215c;
                sk skVar = eoVar.Y;
                if (skVar != null) {
                    if (this.f1214b) {
                        eoVar.finishFragment();
                        return;
                    } else {
                        skVar.D();
                        return;
                    }
                }
                return;
            case 8:
                Activity activity = (Activity) this.f1215c;
                if (activity != null) {
                    if (this.f1214b && tf.c.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    try {
                        activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public Object h(m4.c0 c0Var, m4.r rVar, int i10) {
        int m0;
        long J0;
        int m02;
        long J02;
        switch (this.f1213a) {
            case 2:
                e9.a1 z10 = e9.i0.z((b2.k0) this.f1215c);
                boolean z11 = this.f1214b;
                if (z11) {
                    m0 = -1;
                } else {
                    m0 = c0Var.f15748t.m0();
                }
                int i11 = m0;
                if (z11) {
                    J0 = -9223372036854775807L;
                } else {
                    J0 = c0Var.f15748t.J0();
                }
                return c0Var.q(rVar, z10, i11, J0);
            default:
                List list = (List) this.f1215c;
                boolean z12 = this.f1214b;
                if (z12) {
                    m02 = -1;
                } else {
                    m02 = c0Var.f15748t.m0();
                }
                int i12 = m02;
                if (z12) {
                    J02 = -9223372036854775807L;
                } else {
                    J02 = c0Var.f15748t.J0();
                }
                return c0Var.q(rVar, list, i12, J02);
        }
    }

    @Override
    public void l(vh.g gVar, float f7, float f10) {
        vh.n nVar = (vh.n) this.f1215c;
        if (!nVar.d && !nVar.f49961e && !nVar.f49962f && this.f1214b) {
            nVar.c(f7, f10);
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        m90 m90Var = (m90) this.f1215c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            m90Var.setOnDismissListener(new h90(0, m90Var, this.f1214b));
        }
        m90Var.dismiss();
        return false;
    }
}
