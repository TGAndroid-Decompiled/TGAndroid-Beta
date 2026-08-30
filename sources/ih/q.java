package ih;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import nh.b7;
import nh.t6;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.j6;
import org.telegram.ui.b10;
import org.telegram.ui.bh1;
import org.telegram.ui.c60;
import org.telegram.ui.g50;
import org.telegram.ui.jk;
import org.telegram.ui.xn;
import uf.v;
public final class q implements o, b7, c2, lf.o, MessagesController.ErrorDelegate, bh1 {
    public final int f7648a;
    public final boolean f7649b;
    public final Object f7650c;

    public q(int i10, Object obj, boolean z4) {
        this.f7648a = i10;
        this.f7650c = obj;
        this.f7649b = z4;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f7648a) {
            case 7:
                b10 b10Var = (b10) this.f7650c;
                LongSparseIntArray longSparseIntArray = b10Var.E;
                b10Var.f32768y = i10;
                if (this.f7649b) {
                    b10Var.o0(b10Var.C, arrayList, true);
                    b10Var.C = arrayList;
                    for (int i11 = 0; i11 < b10Var.C.size(); i11++) {
                        b10Var.D.remove(b10Var.C.get(i11));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !b10Var.C.contains(valueOf)) {
                            arrayList2.add(valueOf);
                        }
                    }
                    int size2 = arrayList2.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList2.get(i13)).longValue());
                    }
                } else {
                    b10Var.o0(b10Var.D, arrayList, false);
                    b10Var.D = arrayList;
                    for (int i14 = 0; i14 < b10Var.D.size(); i14++) {
                        Long l10 = (Long) b10Var.D.get(i14);
                        b10Var.C.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                b10Var.j0();
                b10Var.i0(false);
                b10Var.w0();
                return;
            default:
                v vVar = (v) this.f7650c;
                ArrayList arrayList3 = vVar.f45462k;
                ArrayList arrayList4 = vVar.f45461j;
                int i15 = 0;
                if (this.f7649b) {
                    vVar.f45458f = i10;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    while (i15 < arrayList4.size()) {
                        arrayList3.remove(arrayList4.get(i15));
                        i15++;
                    }
                } else {
                    vVar.f45459g = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i15 < arrayList3.size()) {
                        arrayList4.remove(arrayList3.get(i15));
                        i15++;
                    }
                }
                vVar.e.run();
                return;
        }
    }

    @Override
    public void b(boolean z4) {
        nh.q qVar = (nh.q) this.f7650c;
        if (!this.f7649b && z4) {
            boolean z10 = true;
            if (qVar.f15757b != 1) {
                z10 = false;
            }
            t6 t6Var = qVar.f15778s;
            if (z10) {
                if (!t6Var.f15938z) {
                    return;
                }
            } else if (!t6Var.f15929p) {
                return;
            }
            t6Var.Q(z10);
        }
    }

    @Override
    public void d(long j10) {
        j6 j6Var = ((t1) this.f7650c).f22243t4;
        if (j6Var != null) {
            j6Var.q(LocaleController.formatPollEndTime((int) j10, this.f7649b), true, true);
        }
    }

    @Override
    public void i(d2 d2Var, int i10) {
        int i11;
        switch (this.f7648a) {
            case 2:
                org.telegram.ui.b7.V((org.telegram.ui.b7) this.f7650c, this.f7649b);
                return;
            case 3:
            default:
                c60 c60Var = ((g50) this.f7650c).f34449b;
                c60Var.X0.toggleRecord(null, 0);
                UndoView k12 = c60Var.k1();
                if (this.f7649b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                k12.j(i11, 0L, null);
                return;
            case 4:
                xn xnVar = (xn) this.f7650c;
                jk jkVar = xnVar.V;
                if (jkVar != null) {
                    if (this.f7649b) {
                        xnVar.finishFragment();
                        return;
                    } else {
                        jkVar.B();
                        return;
                    }
                }
                return;
            case 5:
                Activity activity = (Activity) this.f7650c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.f7649b && ff.d.a(activity) == -2) {
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
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void o(k kVar, float f10, float f11) {
        s sVar = (s) this.f7650c;
        if (!sVar.d && this.f7649b) {
            kVar.f7616q = new r(sVar, 0);
            float sqrt = (float) Math.sqrt(Math.pow(sVar.getHeight(), 2.0d) + Math.pow(sVar.getWidth(), 2.0d));
            ArrayList arrayList = sVar.f7654b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((k) obj).j(f10, f11, sqrt, false);
            }
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        h80 h80Var = (h80) this.f7650c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            h80Var.setOnDismissListener(new d80(0, h80Var, this.f7649b));
        }
        h80Var.dismiss();
        return false;
    }
}
