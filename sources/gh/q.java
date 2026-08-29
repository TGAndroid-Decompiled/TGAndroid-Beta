package gh;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import lh.a7;
import lh.s6;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.y70;
import org.telegram.ui.dk;
import org.telegram.ui.p00;
import org.telegram.ui.pg1;
import org.telegram.ui.r50;
import org.telegram.ui.tn;
import org.telegram.ui.u40;
import org.telegram.ui.x6;
import sf.w;
public final class q implements o, a7, b2, jf.o, MessagesController.ErrorDelegate, pg1 {
    public final int f7450a;
    public final boolean f7451b;
    public final Object f7452c;

    public q(int i10, Object obj, boolean z10) {
        this.f7450a = i10;
        this.f7452c = obj;
        this.f7451b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f7450a) {
            case 7:
                p00 p00Var = (p00) this.f7452c;
                LongSparseIntArray longSparseIntArray = p00Var.D;
                p00Var.f41270y = i10;
                if (this.f7451b) {
                    p00Var.o0(p00Var.B, arrayList, true);
                    p00Var.B = arrayList;
                    for (int i11 = 0; i11 < p00Var.B.size(); i11++) {
                        p00Var.C.remove(p00Var.B.get(i11));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !p00Var.B.contains(valueOf)) {
                            arrayList2.add(valueOf);
                        }
                    }
                    int size2 = arrayList2.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList2.get(i13)).longValue());
                    }
                } else {
                    p00Var.o0(p00Var.C, arrayList, false);
                    p00Var.C = arrayList;
                    for (int i14 = 0; i14 < p00Var.C.size(); i14++) {
                        Long l10 = (Long) p00Var.C.get(i14);
                        p00Var.B.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                p00Var.j0();
                p00Var.i0(false);
                p00Var.w0();
                return;
            default:
                w wVar = (w) this.f7452c;
                ArrayList arrayList3 = wVar.f47993k;
                ArrayList arrayList4 = wVar.f47992j;
                int i15 = 0;
                if (this.f7451b) {
                    wVar.f47989f = i10;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    while (i15 < arrayList4.size()) {
                        arrayList3.remove(arrayList4.get(i15));
                        i15++;
                    }
                } else {
                    wVar.f47990g = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i15 < arrayList3.size()) {
                        arrayList4.remove(arrayList3.get(i15));
                        i15++;
                    }
                }
                wVar.f47988e.run();
                return;
        }
    }

    @Override
    public void d(boolean z10) {
        lh.p pVar = (lh.p) this.f7452c;
        if (!this.f7451b && z10) {
            boolean z11 = true;
            if (pVar.f16044b != 1) {
                z11 = false;
            }
            s6 s6Var = pVar.f16066s;
            if (z11) {
                if (!s6Var.f16240z) {
                    return;
                }
            } else if (!s6Var.f16231p) {
                return;
            }
            s6Var.Q(z11);
        }
    }

    @Override
    public void e(long j10) {
        n6 n6Var = ((s1) this.f7452c).f25523s4;
        if (n6Var != null) {
            n6Var.q(LocaleController.formatPollEndTime((int) j10, this.f7451b), true, true);
        }
    }

    @Override
    public void g(c2 c2Var, int i10) {
        int i11;
        switch (this.f7450a) {
            case 2:
                x6.V((x6) this.f7452c, this.f7451b);
                return;
            case 3:
            default:
                r50 r50Var = ((u40) this.f7452c).f43179b;
                r50Var.W0.toggleRecord(null, 0);
                UndoView k12 = r50Var.k1();
                if (this.f7451b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                k12.j(i11, 0L, null);
                return;
            case 4:
                tn tnVar = (tn) this.f7452c;
                dk dkVar = tnVar.U;
                if (dkVar != null) {
                    if (this.f7451b) {
                        tnVar.finishFragment();
                        return;
                    } else {
                        dkVar.B();
                        return;
                    }
                }
                return;
            case 5:
                Activity activity = (Activity) this.f7452c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.f7451b && df.d.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    try {
                        activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                        return;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void m(k kVar, float f9, float f10) {
        s sVar = (s) this.f7452c;
        if (!sVar.d && this.f7451b) {
            kVar.f7417q = new r(sVar, 0);
            float sqrt = (float) Math.sqrt(Math.pow(sVar.getHeight(), 2.0d) + Math.pow(sVar.getWidth(), 2.0d));
            ArrayList arrayList = sVar.f7456b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((k) obj).j(f9, f10, sqrt, false);
            }
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        c80 c80Var = (c80) this.f7452c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            c80Var.setOnDismissListener(new y70(0, c80Var, this.f7451b));
        }
        c80Var.dismiss();
        return false;
    }
}
