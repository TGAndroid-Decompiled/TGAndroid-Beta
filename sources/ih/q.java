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
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.j6;
import org.telegram.ui.c10;
import org.telegram.ui.d7;
import org.telegram.ui.e60;
import org.telegram.ui.i50;
import org.telegram.ui.jh1;
import org.telegram.ui.lk;
import org.telegram.ui.zn;
import uf.v;
public final class q implements o, b7, c2, kf.o, MessagesController.ErrorDelegate, jh1 {
    public final int f7630a;
    public final boolean f7631b;
    public final Object f7632c;

    public q(int i10, Object obj, boolean z4) {
        this.f7630a = i10;
        this.f7632c = obj;
        this.f7631b = z4;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f7630a) {
            case 7:
                c10 c10Var = (c10) this.f7632c;
                LongSparseIntArray longSparseIntArray = c10Var.E;
                c10Var.f32985y = i10;
                if (this.f7631b) {
                    c10Var.o0(c10Var.C, arrayList, true);
                    c10Var.C = arrayList;
                    for (int i11 = 0; i11 < c10Var.C.size(); i11++) {
                        c10Var.D.remove(c10Var.C.get(i11));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !c10Var.C.contains(valueOf)) {
                            arrayList2.add(valueOf);
                        }
                    }
                    int size2 = arrayList2.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList2.get(i13)).longValue());
                    }
                } else {
                    c10Var.o0(c10Var.D, arrayList, false);
                    c10Var.D = arrayList;
                    for (int i14 = 0; i14 < c10Var.D.size(); i14++) {
                        Long l10 = (Long) c10Var.D.get(i14);
                        c10Var.C.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                c10Var.j0();
                c10Var.i0(false);
                c10Var.w0();
                return;
            default:
                v vVar = (v) this.f7632c;
                ArrayList arrayList3 = vVar.f45519k;
                ArrayList arrayList4 = vVar.f45518j;
                int i15 = 0;
                if (this.f7631b) {
                    vVar.f45515f = i10;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    while (i15 < arrayList4.size()) {
                        arrayList3.remove(arrayList4.get(i15));
                        i15++;
                    }
                } else {
                    vVar.f45516g = i10;
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
        nh.q qVar = (nh.q) this.f7632c;
        if (!this.f7631b && z4) {
            boolean z10 = true;
            if (qVar.f15737b != 1) {
                z10 = false;
            }
            t6 t6Var = qVar.f15758s;
            if (z10) {
                if (!t6Var.f15918z) {
                    return;
                }
            } else if (!t6Var.f15909p) {
                return;
            }
            t6Var.Q(z10);
        }
    }

    @Override
    public void e(long j10) {
        j6 j6Var = ((s1) this.f7632c).f22180t4;
        if (j6Var != null) {
            j6Var.q(LocaleController.formatPollEndTime((int) j10, this.f7631b), true, true);
        }
    }

    @Override
    public void l(d2 d2Var, int i10) {
        int i11;
        switch (this.f7630a) {
            case 2:
                d7.V((d7) this.f7632c, this.f7631b);
                return;
            case 3:
            default:
                e60 e60Var = ((i50) this.f7632c).f34803b;
                e60Var.X0.toggleRecord(null, 0);
                UndoView k12 = e60Var.k1();
                if (this.f7631b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                k12.j(i11, 0L, null);
                return;
            case 4:
                zn znVar = (zn) this.f7632c;
                lk lkVar = znVar.V;
                if (lkVar != null) {
                    if (this.f7631b) {
                        znVar.finishFragment();
                        return;
                    } else {
                        lkVar.B();
                        return;
                    }
                }
                return;
            case 5:
                Activity activity = (Activity) this.f7632c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.f7631b && ef.d.a(activity) == -2) {
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
        s sVar = (s) this.f7632c;
        if (!sVar.d && this.f7631b) {
            kVar.f7598q = new r(sVar, 0);
            float sqrt = (float) Math.sqrt(Math.pow(sVar.getHeight(), 2.0d) + Math.pow(sVar.getWidth(), 2.0d));
            ArrayList arrayList = sVar.f7636b;
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
        i80 i80Var = (i80) this.f7632c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            i80Var.setOnDismissListener(new e80(0, i80Var, this.f7631b));
        }
        i80Var.dismiss();
        return false;
    }
}
