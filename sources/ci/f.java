package ci;

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
import org.telegram.ui.Components.w80;
import org.telegram.ui.hk;
import org.telegram.ui.kg1;
import org.telegram.ui.p00;
import org.telegram.ui.s50;
import org.telegram.ui.sn;
import org.telegram.ui.v40;
public final class f implements q7, kg1, m4.g1, e2.j, org.telegram.ui.ActionBar.a2, zf.m, MessagesController.ErrorDelegate, wh.k {
    public final int f5375a;
    public final boolean f5376b;
    public final Object f5377c;

    public f(int i10, Object obj, boolean z10) {
        this.f5375a = i10;
        this.f5377c = obj;
        this.f5376b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f5375a) {
            case 1:
                ig.a0 a0Var = (ig.a0) this.f5377c;
                ArrayList arrayList2 = a0Var.f12821k;
                ArrayList arrayList3 = a0Var.f12820j;
                int i11 = 0;
                if (this.f5376b) {
                    a0Var.f12817f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    a0Var.f12818g = i10;
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
                p00 p00Var = (p00) this.f5377c;
                LongSparseIntArray longSparseIntArray = p00Var.H;
                p00Var.f39929y = i10;
                if (this.f5376b) {
                    p00Var.o0(p00Var.F, arrayList, true);
                    p00Var.F = arrayList;
                    for (int i12 = 0; i12 < p00Var.F.size(); i12++) {
                        p00Var.G.remove(p00Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !p00Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    p00Var.o0(p00Var.G, arrayList, false);
                    p00Var.G = arrayList;
                    for (int i15 = 0; i15 < p00Var.G.size(); i15++) {
                        Long l4 = (Long) p00Var.G.get(i15);
                        p00Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                p00Var.j0();
                p00Var.i0(false);
                p00Var.w0();
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        ((m4.m1) obj).N0((b2.f) this.f5377c, this.f5376b);
    }

    @Override
    public void b(boolean z10) {
        r rVar = (r) this.f5377c;
        if (!this.f5376b && z10) {
            boolean z11 = true;
            if (rVar.f5870b != 1) {
                z11 = false;
            }
            i7 i7Var = rVar.f5891s;
            if (z11) {
                if (!i7Var.f5514z) {
                    return;
                }
            } else if (!i7Var.f5505p) {
                return;
            }
            i7Var.Q(z11);
        }
    }

    @Override
    public Object e(m4.f0 f0Var, m4.v vVar, int i10) {
        int n02;
        long M0;
        int n03;
        long M02;
        switch (this.f5375a) {
            case 2:
                e9.x1 y3 = e9.n0.y((b2.o0) this.f5377c);
                boolean z10 = this.f5376b;
                if (z10) {
                    n02 = -1;
                } else {
                    n02 = f0Var.f16528t.n0();
                }
                int i11 = n02;
                if (z10) {
                    M0 = -9223372036854775807L;
                } else {
                    M0 = f0Var.f16528t.M0();
                }
                return f0Var.q(vVar, y3, i11, M0);
            default:
                List list = (List) this.f5377c;
                boolean z11 = this.f5376b;
                if (z11) {
                    n03 = -1;
                } else {
                    n03 = f0Var.f16528t.n0();
                }
                int i12 = n03;
                if (z11) {
                    M02 = -9223372036854775807L;
                } else {
                    M02 = f0Var.f16528t.M0();
                }
                return f0Var.q(vVar, list, i12, M02);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f5375a) {
            case 5:
                org.telegram.ui.c7.V((org.telegram.ui.c7) this.f5377c, this.f5376b);
                return;
            case 6:
            default:
                s50 s50Var = ((v40) this.f5377c).f42118b;
                s50Var.f40913a1.toggleRecord(null, 0);
                UndoView l1 = s50Var.l1();
                if (this.f5376b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                l1.j(i11, 0L, null);
                return;
            case 7:
                sn snVar = (sn) this.f5377c;
                hk hkVar = snVar.Y;
                if (hkVar != null) {
                    if (this.f5376b) {
                        snVar.finishFragment();
                        return;
                    } else {
                        hkVar.z();
                        return;
                    }
                }
                return;
            case 8:
                Activity activity = (Activity) this.f5377c;
                if (activity != null) {
                    if (this.f5376b && uf.b.a(activity) == -2) {
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
    public void i(long j10) {
        org.telegram.ui.Components.p6 p6Var = ((org.telegram.ui.Cells.u1) this.f5377c).f23528w4;
        if (p6Var != null) {
            p6Var.t(LocaleController.formatPollEndTime((int) j10, this.f5376b), true, true);
        }
    }

    @Override
    public void o(wh.g gVar, float f7, float f10) {
        wh.n nVar = (wh.n) this.f5377c;
        if (!nVar.d && !nVar.e && !nVar.f49119f && this.f5376b) {
            nVar.c(f7, f10);
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        a90 a90Var = (a90) this.f5377c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            a90Var.setOnDismissListener(new w80(0, a90Var, this.f5376b));
        }
        a90Var.dismiss();
        return false;
    }
}
