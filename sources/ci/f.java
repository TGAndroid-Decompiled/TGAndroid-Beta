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
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.z80;
import org.telegram.ui.gk;
import org.telegram.ui.ng1;
import org.telegram.ui.q00;
import org.telegram.ui.sn;
import org.telegram.ui.u50;
import org.telegram.ui.w40;
public final class f implements p7, ng1, m4.g1, e2.j, org.telegram.ui.ActionBar.z1, zf.m, MessagesController.ErrorDelegate, wh.k {
    public final int f5310a;
    public final boolean f5311b;
    public final Object f5312c;

    public f(int i10, Object obj, boolean z10) {
        this.f5310a = i10;
        this.f5312c = obj;
        this.f5311b = z10;
    }

    @Override
    public Object a(m4.f0 f0Var, m4.v vVar, int i10) {
        int n02;
        long M0;
        int n03;
        long M02;
        switch (this.f5310a) {
            case 2:
                e9.x1 y3 = e9.n0.y((b2.o0) this.f5312c);
                boolean z10 = this.f5311b;
                if (z10) {
                    n02 = -1;
                } else {
                    n02 = f0Var.f16597t.n0();
                }
                int i11 = n02;
                if (z10) {
                    M0 = -9223372036854775807L;
                } else {
                    M0 = f0Var.f16597t.M0();
                }
                return f0Var.q(vVar, y3, i11, M0);
            default:
                List list = (List) this.f5312c;
                boolean z11 = this.f5311b;
                if (z11) {
                    n03 = -1;
                } else {
                    n03 = f0Var.f16597t.n0();
                }
                int i12 = n03;
                if (z11) {
                    M02 = -9223372036854775807L;
                } else {
                    M02 = f0Var.f16597t.M0();
                }
                return f0Var.q(vVar, list, i12, M02);
        }
    }

    @Override
    public void accept(Object obj) {
        ((m4.m1) obj).N0((b2.f) this.f5312c, this.f5311b);
    }

    @Override
    public void b(boolean z10) {
        r rVar = (r) this.f5312c;
        if (!this.f5311b && z10) {
            boolean z11 = true;
            if (rVar.f5813b != 1) {
                z11 = false;
            }
            h7 h7Var = rVar.f5834s;
            if (z11) {
                if (!h7Var.f5420z) {
                    return;
                }
            } else if (!h7Var.f5411p) {
                return;
            }
            h7Var.Q(z11);
        }
    }

    @Override
    public void d(int i10, ArrayList arrayList) {
        switch (this.f5310a) {
            case 1:
                ig.a0 a0Var = (ig.a0) this.f5312c;
                ArrayList arrayList2 = a0Var.f12849k;
                ArrayList arrayList3 = a0Var.f12848j;
                int i11 = 0;
                if (this.f5311b) {
                    a0Var.f12845f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    a0Var.f12846g = i10;
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
                q00 q00Var = (q00) this.f5312c;
                LongSparseIntArray longSparseIntArray = q00Var.H;
                q00Var.f40680y = i10;
                if (this.f5311b) {
                    q00Var.o0(q00Var.F, arrayList, true);
                    q00Var.F = arrayList;
                    for (int i12 = 0; i12 < q00Var.F.size(); i12++) {
                        q00Var.G.remove(q00Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !q00Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    q00Var.o0(q00Var.G, arrayList, false);
                    q00Var.G = arrayList;
                    for (int i15 = 0; i15 < q00Var.G.size(); i15++) {
                        Long l4 = (Long) q00Var.G.get(i15);
                        q00Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                q00Var.j0();
                q00Var.i0(false);
                q00Var.w0();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        switch (this.f5310a) {
            case 5:
                org.telegram.ui.c7.V((org.telegram.ui.c7) this.f5312c, this.f5311b);
                return;
            case 6:
            default:
                u50 u50Var = ((w40) this.f5312c).f42898b;
                u50Var.f42217a1.toggleRecord(null, 0);
                UndoView k12 = u50Var.k1();
                if (this.f5311b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                k12.j(i11, 0L, null);
                return;
            case 7:
                sn snVar = (sn) this.f5312c;
                gk gkVar = snVar.Y;
                if (gkVar != null) {
                    if (this.f5311b) {
                        snVar.finishFragment();
                        return;
                    } else {
                        gkVar.y();
                        return;
                    }
                }
                return;
            case 8:
                Activity activity = (Activity) this.f5312c;
                if (activity != null) {
                    if (this.f5311b && uf.b.a(activity) == -2) {
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
        org.telegram.ui.Components.n6 n6Var = ((org.telegram.ui.Cells.t1) this.f5312c).f23627w4;
        if (n6Var != null) {
            n6Var.t(LocaleController.formatPollEndTime((int) j10, this.f5311b), true, true);
        }
    }

    @Override
    public void l(wh.g gVar, float f7, float f10) {
        wh.n nVar = (wh.n) this.f5312c;
        if (!nVar.d && !nVar.e && !nVar.f49548f && this.f5311b) {
            nVar.c(f7, f10);
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        z80 z80Var = (z80) this.f5312c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            z80Var.setOnDismissListener(new v80(0, z80Var, this.f5311b));
        }
        z80Var.dismiss();
        return false;
    }
}
