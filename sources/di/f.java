package di;

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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.y80;
import org.telegram.ui.hk;
import org.telegram.ui.o00;
import org.telegram.ui.og1;
import org.telegram.ui.un;
import org.telegram.ui.v50;
import org.telegram.ui.y40;
public final class f implements p7, og1, m4.h1, e2.j, org.telegram.ui.ActionBar.b2, ag.s, MessagesController.ErrorDelegate, xh.k {
    public final int f8542a;
    public final boolean f8543b;
    public final Object f8544c;

    public f(int i10, Object obj, boolean z10) {
        this.f8542a = i10;
        this.f8544c = obj;
        this.f8543b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f8542a) {
            case 1:
                jg.b0 b0Var = (jg.b0) this.f8544c;
                ArrayList arrayList2 = b0Var.f15636k;
                ArrayList arrayList3 = b0Var.f15635j;
                int i11 = 0;
                if (this.f8543b) {
                    b0Var.f15632f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    b0Var.f15633g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                b0Var.e.run();
                return;
            default:
                o00 o00Var = (o00) this.f8544c;
                LongSparseIntArray longSparseIntArray = o00Var.H;
                o00Var.f42063y = i10;
                if (this.f8543b) {
                    o00Var.q0(o00Var.F, arrayList, true);
                    o00Var.F = arrayList;
                    for (int i12 = 0; i12 < o00Var.F.size(); i12++) {
                        o00Var.G.remove(o00Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !o00Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    o00Var.q0(o00Var.G, arrayList, false);
                    o00Var.G = arrayList;
                    for (int i15 = 0; i15 < o00Var.G.size(); i15++) {
                        Long l4 = (Long) o00Var.G.get(i15);
                        o00Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                o00Var.l0();
                o00Var.k0(false);
                o00Var.y0();
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        ((m4.n1) obj).N0((b2.f) this.f8544c, this.f8543b);
    }

    @Override
    public void b(boolean z10) {
        r rVar = (r) this.f8544c;
        if (!this.f8543b && z10) {
            boolean z11 = true;
            if (rVar.f9073b != 1) {
                z11 = false;
            }
            h7 h7Var = rVar.f9094s;
            if (z11) {
                if (!h7Var.f8651z) {
                    return;
                }
            } else if (!h7Var.f8642p) {
                return;
            }
            h7Var.Q(z11);
        }
    }

    @Override
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        int n02;
        long M0;
        int n03;
        long M02;
        switch (this.f8542a) {
            case 2:
                f9.s1 y3 = f9.i0.y((b2.p0) this.f8544c);
                boolean z10 = this.f8543b;
                if (z10) {
                    n02 = -1;
                } else {
                    n02 = f0Var.f18057t.n0();
                }
                int i11 = n02;
                if (z10) {
                    M0 = -9223372036854775807L;
                } else {
                    M0 = f0Var.f18057t.M0();
                }
                return f0Var.q(wVar, y3, i11, M0);
            default:
                List list = (List) this.f8544c;
                boolean z11 = this.f8543b;
                if (z11) {
                    n03 = -1;
                } else {
                    n03 = f0Var.f18057t.n0();
                }
                int i12 = n03;
                if (z11) {
                    M02 = -9223372036854775807L;
                } else {
                    M02 = f0Var.f18057t.M0();
                }
                return f0Var.q(wVar, list, i12, M02);
        }
    }

    @Override
    public void f(long j10) {
        org.telegram.ui.Components.r6 r6Var = ((org.telegram.ui.Cells.s1) this.f8544c).f25332w4;
        if (r6Var != null) {
            r6Var.t(LocaleController.formatPollEndTime((int) j10, this.f8543b), true, true);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        switch (this.f8542a) {
            case 5:
                org.telegram.ui.c7.Z((org.telegram.ui.c7) this.f8544c, this.f8543b);
                return;
            case 6:
            default:
                v50 v50Var = ((y40) this.f8544c).f45954b;
                v50Var.f44610a1.toggleRecord(null, 0);
                UndoView k12 = v50Var.k1();
                if (this.f8543b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                k12.j(i11, 0L, null);
                return;
            case 7:
                un unVar = (un) this.f8544c;
                hk hkVar = unVar.Y;
                if (hkVar != null) {
                    if (this.f8543b) {
                        unVar.finishFragment();
                        return;
                    } else {
                        hkVar.x();
                        return;
                    }
                }
                return;
            case 8:
                Activity activity = (Activity) this.f8544c;
                if (activity != null) {
                    if (this.f8543b && vf.b.a(activity) == -2) {
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void o(xh.g gVar, float f7, float f10) {
        xh.n nVar = (xh.n) this.f8544c;
        if (!nVar.d && !nVar.e && !nVar.f51911f && this.f8543b) {
            nVar.c(f7, f10);
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        c90 c90Var = (c90) this.f8544c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            c90Var.setOnDismissListener(new y80(0, c90Var, this.f8543b));
        }
        c90Var.dismiss();
        return false;
    }
}
