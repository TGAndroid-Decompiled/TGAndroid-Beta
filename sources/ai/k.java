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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.i90;
import org.telegram.ui.f10;
import org.telegram.ui.g60;
import org.telegram.ui.j50;
import org.telegram.ui.ok;
import org.telegram.ui.wh1;
import org.telegram.ui.zn;
public final class k implements u9, wh1, m4.a1, e2.h, org.telegram.ui.ActionBar.a2, yf.m, MessagesController.ErrorDelegate, vh.k {
    public final int f1215a;
    public final boolean f1216b;
    public final Object f1217c;

    public k(int i10, Object obj, boolean z10) {
        this.f1215a = i10;
        this.f1217c = obj;
        this.f1216b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f1215a) {
            case 1:
                hg.b0 b0Var = (hg.b0) this.f1217c;
                ArrayList arrayList2 = b0Var.f11166k;
                ArrayList arrayList3 = b0Var.f11165j;
                int i11 = 0;
                if (this.f1216b) {
                    b0Var.f11162f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    b0Var.f11163g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                b0Var.f11161e.run();
                return;
            default:
                f10 f10Var = (f10) this.f1217c;
                LongSparseIntArray longSparseIntArray = f10Var.H;
                f10Var.f37422y = i10;
                if (this.f1216b) {
                    f10Var.o0(f10Var.F, arrayList, true);
                    f10Var.F = arrayList;
                    for (int i12 = 0; i12 < f10Var.F.size(); i12++) {
                        f10Var.G.remove(f10Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !f10Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    f10Var.o0(f10Var.G, arrayList, false);
                    f10Var.G = arrayList;
                    for (int i15 = 0; i15 < f10Var.G.size(); i15++) {
                        Long l4 = (Long) f10Var.G.get(i15);
                        f10Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                f10Var.j0();
                f10Var.i0(false);
                f10Var.w0();
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        ((m4.f1) obj).K0((b2.e) this.f1217c, this.f1216b);
    }

    @Override
    public void b(boolean z10) {
        b0 b0Var = (b0) this.f1217c;
        if (!this.f1216b && z10) {
            boolean z11 = true;
            if (b0Var.f662b != 1) {
                z11 = false;
            }
            m9 m9Var = b0Var.f684s;
            if (z11) {
                if (!m9Var.f1428z) {
                    return;
                }
            } else if (!m9Var.f1419p) {
                return;
            }
            m9Var.Q(z11);
        }
    }

    @Override
    public void e(long j3) {
        org.telegram.ui.Components.q6 q6Var = ((org.telegram.ui.Cells.u1) this.f1217c).f23425w4;
        if (q6Var != null) {
            q6Var.t(LocaleController.formatPollEndTime((int) j3, this.f1216b), true, true);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f1215a) {
            case 5:
                org.telegram.ui.y6.V((org.telegram.ui.y6) this.f1217c, this.f1216b);
                return;
            case 6:
            default:
                g60 g60Var = ((j50) this.f1217c).f38826b;
                g60Var.f37789a1.toggleRecord(null, 0);
                UndoView l1 = g60Var.l1();
                if (this.f1216b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                l1.j(i11, 0L, null);
                return;
            case 7:
                zn znVar = (zn) this.f1217c;
                ok okVar = znVar.Y;
                if (okVar != null) {
                    if (this.f1216b) {
                        znVar.finishFragment();
                        return;
                    } else {
                        okVar.z();
                        return;
                    }
                }
                return;
            case 8:
                Activity activity = (Activity) this.f1217c;
                if (activity != null) {
                    if (this.f1216b && tf.c.a(activity) == -2) {
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
    public Object h(m4.b0 b0Var, m4.r rVar, int i10) {
        int l02;
        long J0;
        int l03;
        long J02;
        switch (this.f1215a) {
            case 2:
                e9.a1 z10 = e9.i0.z((b2.k0) this.f1217c);
                boolean z11 = this.f1216b;
                if (z11) {
                    l02 = -1;
                } else {
                    l02 = b0Var.f15997t.l0();
                }
                int i11 = l02;
                if (z11) {
                    J0 = -9223372036854775807L;
                } else {
                    J0 = b0Var.f15997t.J0();
                }
                return b0Var.q(rVar, z10, i11, J0);
            default:
                List list = (List) this.f1217c;
                boolean z12 = this.f1216b;
                if (z12) {
                    l03 = -1;
                } else {
                    l03 = b0Var.f15997t.l0();
                }
                int i12 = l03;
                if (z12) {
                    J02 = -9223372036854775807L;
                } else {
                    J02 = b0Var.f15997t.J0();
                }
                return b0Var.q(rVar, list, i12, J02);
        }
    }

    @Override
    public void l(vh.g gVar, float f7, float f10) {
        vh.n nVar = (vh.n) this.f1217c;
        if (!nVar.d && !nVar.f49733e && !nVar.f49734f && this.f1216b) {
            nVar.c(f7, f10);
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        i90 i90Var = (i90) this.f1217c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            i90Var.setOnDismissListener(new d90(0, i90Var, this.f1216b));
        }
        i90Var.dismiss();
        return false;
    }
}
