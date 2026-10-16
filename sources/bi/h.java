package bi;

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
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.f90;
import org.telegram.ui.ci1;
import org.telegram.ui.fo;
import org.telegram.ui.k10;
import org.telegram.ui.n60;
import org.telegram.ui.q50;
import org.telegram.ui.sk;
public final class h implements f9, ci1, m4.g1, e2.j, org.telegram.ui.ActionBar.z1, zf.n, MessagesController.ErrorDelegate, wh.k {
    public final int f3106a;
    public final boolean f3107b;
    public final Object f3108c;

    public h(int i10, Object obj, boolean z10) {
        this.f3106a = i10;
        this.f3108c = obj;
        this.f3107b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f3106a) {
            case 1:
                ig.a0 a0Var = (ig.a0) this.f3108c;
                ArrayList arrayList2 = a0Var.f11432k;
                ArrayList arrayList3 = a0Var.f11431j;
                int i11 = 0;
                if (this.f3107b) {
                    a0Var.f11428f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    a0Var.f11429g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                a0Var.e.run();
                return;
            default:
                k10 k10Var = (k10) this.f3108c;
                LongSparseIntArray longSparseIntArray = k10Var.H;
                k10Var.f37207y = i10;
                if (this.f3107b) {
                    k10Var.o0(k10Var.F, arrayList, true);
                    k10Var.F = arrayList;
                    for (int i12 = 0; i12 < k10Var.F.size(); i12++) {
                        k10Var.G.remove(k10Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !k10Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    k10Var.o0(k10Var.G, arrayList, false);
                    k10Var.G = arrayList;
                    for (int i15 = 0; i15 < k10Var.G.size(); i15++) {
                        Long l4 = (Long) k10Var.G.get(i15);
                        k10Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                k10Var.j0();
                k10Var.i0(false);
                k10Var.w0();
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        ((m4.m1) obj).N0((b2.f) this.f3108c, this.f3107b);
    }

    @Override
    public void b(boolean z10) {
        v vVar = (v) this.f3108c;
        if (!this.f3107b && z10) {
            boolean z11 = true;
            if (vVar.f3817b != 1) {
                z11 = false;
            }
            x8 x8Var = vVar.f3838s;
            if (z11) {
                if (!x8Var.f3987z) {
                    return;
                }
            } else if (!x8Var.f3978p) {
                return;
            }
            x8Var.Q(z11);
        }
    }

    @Override
    public Object c(m4.e0 e0Var, m4.v vVar, int i10) {
        int n02;
        long M0;
        int n03;
        long M02;
        switch (this.f3106a) {
            case 2:
                e9.x1 y3 = e9.n0.y((b2.p0) this.f3108c);
                boolean z10 = this.f3107b;
                if (z10) {
                    n02 = -1;
                } else {
                    n02 = e0Var.f15170t.n0();
                }
                int i11 = n02;
                if (z10) {
                    M0 = -9223372036854775807L;
                } else {
                    M0 = e0Var.f15170t.M0();
                }
                return e0Var.q(vVar, y3, i11, M0);
            default:
                List list = (List) this.f3108c;
                boolean z11 = this.f3107b;
                if (z11) {
                    n03 = -1;
                } else {
                    n03 = e0Var.f15170t.n0();
                }
                int i12 = n03;
                if (z11) {
                    M02 = -9223372036854775807L;
                } else {
                    M02 = e0Var.f15170t.M0();
                }
                return e0Var.q(vVar, list, i12, M02);
        }
    }

    @Override
    public void e(long j10) {
        org.telegram.ui.Components.r6 r6Var = ((org.telegram.ui.Cells.u1) this.f3108c).f22164w4;
        if (r6Var != null) {
            r6Var.t(LocaleController.formatPollEndTime((int) j10, this.f3107b), true, true);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        switch (this.f3106a) {
            case 5:
                org.telegram.ui.d7.V((org.telegram.ui.d7) this.f3108c, this.f3107b);
                return;
            case 6:
            default:
                n60 n60Var = ((q50) this.f3108c).f39065b;
                n60Var.f38157a1.toggleRecord(null, 0);
                UndoView l1 = n60Var.l1();
                if (this.f3107b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                l1.j(i11, 0L, null);
                return;
            case 7:
                fo foVar = (fo) this.f3108c;
                sk skVar = foVar.Y;
                if (skVar != null) {
                    if (this.f3107b) {
                        foVar.finishFragment();
                        return;
                    } else {
                        skVar.z();
                        return;
                    }
                }
                return;
            case 8:
                Activity activity = (Activity) this.f3108c;
                if (activity != null) {
                    if (this.f3107b && uf.b.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    try {
                        activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void o(wh.g gVar, float f7, float f10) {
        wh.n nVar = (wh.n) this.f3108c;
        if (!nVar.d && !nVar.e && !nVar.f47710f && this.f3107b) {
            nVar.c(f7, f10);
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        f90 f90Var = (f90) this.f3108c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            f90Var.setOnDismissListener(new a90(0, f90Var, this.f3107b));
        }
        f90Var.dismiss();
        return false;
    }
}
