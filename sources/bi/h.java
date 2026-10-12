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
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.g90;
import org.telegram.ui.ci1;
import org.telegram.ui.fo;
import org.telegram.ui.l10;
import org.telegram.ui.n60;
import org.telegram.ui.q50;
import org.telegram.ui.sk;
public final class h implements f9, ci1, m4.h1, e2.j, org.telegram.ui.ActionBar.z1, zf.n, MessagesController.ErrorDelegate, wh.k {
    public final int f3102a;
    public final boolean f3103b;
    public final Object f3104c;

    public h(int i10, Object obj, boolean z10) {
        this.f3102a = i10;
        this.f3104c = obj;
        this.f3103b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f3102a) {
            case 1:
                ig.a0 a0Var = (ig.a0) this.f3104c;
                ArrayList arrayList2 = a0Var.f11428k;
                ArrayList arrayList3 = a0Var.f11427j;
                int i11 = 0;
                if (this.f3103b) {
                    a0Var.f11424f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    a0Var.f11425g = i10;
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
                l10 l10Var = (l10) this.f3104c;
                LongSparseIntArray longSparseIntArray = l10Var.H;
                l10Var.f37813y = i10;
                if (this.f3103b) {
                    l10Var.o0(l10Var.F, arrayList, true);
                    l10Var.F = arrayList;
                    for (int i12 = 0; i12 < l10Var.F.size(); i12++) {
                        l10Var.G.remove(l10Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !l10Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    l10Var.o0(l10Var.G, arrayList, false);
                    l10Var.G = arrayList;
                    for (int i15 = 0; i15 < l10Var.G.size(); i15++) {
                        Long l4 = (Long) l10Var.G.get(i15);
                        l10Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                l10Var.j0();
                l10Var.i0(false);
                l10Var.w0();
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        ((m4.n1) obj).N0((b2.f) this.f3104c, this.f3103b);
    }

    @Override
    public void b(boolean z10) {
        v vVar = (v) this.f3104c;
        if (!this.f3103b && z10) {
            boolean z11 = true;
            if (vVar.f3813b != 1) {
                z11 = false;
            }
            x8 x8Var = vVar.f3834s;
            if (z11) {
                if (!x8Var.f3983z) {
                    return;
                }
            } else if (!x8Var.f3974p) {
                return;
            }
            x8Var.Q(z11);
        }
    }

    @Override
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        int n02;
        long M0;
        int n03;
        long M02;
        switch (this.f3102a) {
            case 2:
                e9.x1 y3 = e9.n0.y((b2.p0) this.f3104c);
                boolean z10 = this.f3103b;
                if (z10) {
                    n02 = -1;
                } else {
                    n02 = f0Var.f15440t.n0();
                }
                int i11 = n02;
                if (z10) {
                    M0 = -9223372036854775807L;
                } else {
                    M0 = f0Var.f15440t.M0();
                }
                return f0Var.q(wVar, y3, i11, M0);
            default:
                List list = (List) this.f3104c;
                boolean z11 = this.f3103b;
                if (z11) {
                    n03 = -1;
                } else {
                    n03 = f0Var.f15440t.n0();
                }
                int i12 = n03;
                if (z11) {
                    M02 = -9223372036854775807L;
                } else {
                    M02 = f0Var.f15440t.M0();
                }
                return f0Var.q(wVar, list, i12, M02);
        }
    }

    @Override
    public void e(long j10) {
        org.telegram.ui.Components.r6 r6Var = ((org.telegram.ui.Cells.u1) this.f3104c).f22455w4;
        if (r6Var != null) {
            r6Var.t(LocaleController.formatPollEndTime((int) j10, this.f3103b), true, true);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        switch (this.f3102a) {
            case 5:
                org.telegram.ui.d7.V((org.telegram.ui.d7) this.f3104c, this.f3103b);
                return;
            case 6:
            default:
                n60 n60Var = ((q50) this.f3104c).f39344b;
                n60Var.f38442a1.toggleRecord(null, 0);
                UndoView l1 = n60Var.l1();
                if (this.f3103b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                l1.j(i11, 0L, null);
                return;
            case 7:
                fo foVar = (fo) this.f3104c;
                sk skVar = foVar.Y;
                if (skVar != null) {
                    if (this.f3103b) {
                        foVar.finishFragment();
                        return;
                    } else {
                        skVar.z();
                        return;
                    }
                }
                return;
            case 8:
                Activity activity = (Activity) this.f3104c;
                if (activity != null) {
                    if (this.f3103b && uf.b.a(activity) == -2) {
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
        wh.n nVar = (wh.n) this.f3104c;
        if (!nVar.d && !nVar.e && !nVar.f47711f && this.f3103b) {
            nVar.c(f7, f10);
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        g90 g90Var = (g90) this.f3104c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            g90Var.setOnDismissListener(new b90(0, g90Var, this.f3103b));
        }
        g90Var.dismiss();
        return false;
    }
}
