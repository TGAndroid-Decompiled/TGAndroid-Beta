package dh;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import ih.d7;
import ih.v6;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.p70;
import org.telegram.ui.ak;
import org.telegram.ui.n00;
import org.telegram.ui.ng1;
import org.telegram.ui.o50;
import org.telegram.ui.qn;
import org.telegram.ui.r40;
import org.telegram.ui.y6;
import pf.x;
public final class s implements q, d7, b2, ff.p, MessagesController.ErrorDelegate, ng1 {
    public final int f4662a;
    public final boolean f4663b;
    public final Object f4664c;

    public s(int i9, Object obj, boolean z10) {
        this.f4662a = i9;
        this.f4664c = obj;
        this.f4663b = z10;
    }

    @Override
    public void a(int i9, ArrayList arrayList) {
        switch (this.f4662a) {
            case 7:
                n00 n00Var = (n00) this.f4664c;
                LongSparseIntArray longSparseIntArray = n00Var.D;
                n00Var.f40574y = i9;
                if (this.f4663b) {
                    n00Var.n0(n00Var.B, arrayList, true);
                    n00Var.B = arrayList;
                    for (int i10 = 0; i10 < n00Var.B.size(); i10++) {
                        n00Var.C.remove(n00Var.B.get(i10));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        long keyAt = longSparseIntArray.keyAt(i11);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !n00Var.B.contains(valueOf)) {
                            arrayList2.add(valueOf);
                        }
                    }
                    int size2 = arrayList2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        longSparseIntArray.delete(((Long) arrayList2.get(i12)).longValue());
                    }
                } else {
                    n00Var.n0(n00Var.C, arrayList, false);
                    n00Var.C = arrayList;
                    for (int i13 = 0; i13 < n00Var.C.size(); i13++) {
                        Long l10 = (Long) n00Var.C.get(i13);
                        n00Var.B.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                n00Var.i0();
                n00Var.h0(false);
                n00Var.v0();
                return;
            default:
                x xVar = (x) this.f4664c;
                ArrayList arrayList3 = xVar.f45821k;
                ArrayList arrayList4 = xVar.f45820j;
                int i14 = 0;
                if (this.f4663b) {
                    xVar.f45817f = i9;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    while (i14 < arrayList4.size()) {
                        arrayList3.remove(arrayList4.get(i14));
                        i14++;
                    }
                } else {
                    xVar.f45818g = i9;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i14 < arrayList3.size()) {
                        arrayList4.remove(arrayList3.get(i14));
                        i14++;
                    }
                }
                xVar.f45816e.run();
                return;
        }
    }

    @Override
    public void d(boolean z10) {
        ih.r rVar = (ih.r) this.f4664c;
        if (!this.f4663b && z10) {
            boolean z11 = true;
            if (rVar.f12020b != 1) {
                z11 = false;
            }
            v6 v6Var = rVar.f12042s;
            if (z11) {
                if (!v6Var.f12258z) {
                    return;
                }
            } else if (!v6Var.f12249p) {
                return;
            }
            v6Var.Q(z11);
        }
    }

    @Override
    public void e(l lVar, float f10, float f11) {
        u uVar = (u) this.f4664c;
        if (!uVar.d && this.f4663b) {
            lVar.f4627q = new t(uVar, 0);
            float sqrt = (float) Math.sqrt(Math.pow(uVar.getHeight(), 2.0d) + Math.pow(uVar.getWidth(), 2.0d));
            ArrayList arrayList = uVar.f4668b;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((l) obj).j(f10, f11, sqrt, false);
            }
        }
    }

    @Override
    public void f(c2 c2Var, int i9) {
        int i10;
        switch (this.f4662a) {
            case 2:
                y6.U((y6) this.f4664c, this.f4663b);
                return;
            case 3:
            default:
                o50 o50Var = ((r40) this.f4664c).f42265b;
                o50Var.W0.toggleRecord(null, 0);
                UndoView k12 = o50Var.k1();
                if (this.f4663b) {
                    i10 = 101;
                } else {
                    i10 = 40;
                }
                k12.j(i10, 0L, null);
                return;
            case 4:
                qn qnVar = (qn) this.f4664c;
                ak akVar = qnVar.U;
                if (akVar != null) {
                    if (this.f4663b) {
                        qnVar.finishFragment();
                        return;
                    } else {
                        akVar.A();
                        return;
                    }
                }
                return;
            case 5:
                Activity activity = (Activity) this.f4664c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.f4663b && af.d.a(activity) == -2) {
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
    public void h(long j10) {
        i6 i6Var = ((t1) this.f4664c).f25560s4;
        if (i6Var != null) {
            i6Var.q(LocaleController.formatPollEndTime((int) j10, this.f4663b), true, true);
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        p70 p70Var = (p70) this.f4664c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            p70Var.setOnDismissListener(new l70(0, p70Var, this.f4663b));
        }
        p70Var.dismiss();
        return false;
    }
}
