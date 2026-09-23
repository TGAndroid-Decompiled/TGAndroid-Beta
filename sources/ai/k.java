package ai;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.h80;
import org.telegram.ui.c10;
import org.telegram.ui.f60;
import org.telegram.ui.i50;
import org.telegram.ui.jk;
import org.telegram.ui.nh1;
import org.telegram.ui.xn;
public final class k implements t9, nh1, m4.a1, e2.h, org.telegram.ui.ActionBar.a2, yf.m, MessagesController.ErrorDelegate, vh.l {
    public final int f1115a;
    public final boolean f1116b;
    public final Object f1117c;

    public k(int i10, Object obj, boolean z10) {
        this.f1115a = i10;
        this.f1117c = obj;
        this.f1116b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f1115a) {
            case 1:
                hg.c0 c0Var = (hg.c0) this.f1117c;
                ArrayList arrayList2 = c0Var.f10217k;
                ArrayList arrayList3 = c0Var.f10216j;
                int i11 = 0;
                if (this.f1116b) {
                    c0Var.f10213f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    c0Var.f10214g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                c0Var.e.run();
                return;
            default:
                c10 c10Var = (c10) this.f1117c;
                LongSparseIntArray longSparseIntArray = c10Var.H;
                c10Var.f32228y = i10;
                if (this.f1116b) {
                    c10Var.o0(c10Var.F, arrayList, true);
                    c10Var.F = arrayList;
                    for (int i12 = 0; i12 < c10Var.F.size(); i12++) {
                        c10Var.G.remove(c10Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !c10Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    c10Var.o0(c10Var.G, arrayList, false);
                    c10Var.G = arrayList;
                    for (int i15 = 0; i15 < c10Var.G.size(); i15++) {
                        Long l4 = (Long) c10Var.G.get(i15);
                        c10Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                c10Var.j0();
                c10Var.i0(false);
                c10Var.w0();
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        ((m4.f1) obj).K0((b2.e) this.f1117c, this.f1116b);
    }

    @Override
    public void b(boolean z10) {
        b0 b0Var = (b0) this.f1117c;
        if (!this.f1116b && z10) {
            boolean z11 = true;
            if (b0Var.f546b != 1) {
                z11 = false;
            }
            l9 l9Var = b0Var.f567s;
            if (z11) {
                if (!l9Var.f1213z) {
                    return;
                }
            } else if (!l9Var.f1204p) {
                return;
            }
            l9Var.Q(z11);
        }
    }

    @Override
    public void e(long j3) {
        org.telegram.ui.Components.o6 o6Var = ((org.telegram.ui.Cells.t1) this.f1117c).f21260w4;
        if (o6Var != null) {
            o6Var.q(LocaleController.formatPollEndTime((int) j3, this.f1116b), true, true);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f1115a) {
            case 5:
                org.telegram.ui.z6.V((org.telegram.ui.z6) this.f1117c, this.f1116b);
                return;
            case 6:
            default:
                f60 f60Var = ((i50) this.f1117c).f34029b;
                f60Var.f33099a1.toggleRecord(null, 0);
                UndoView k12 = f60Var.k1();
                if (this.f1116b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                k12.j(i11, 0L, null);
                return;
            case 7:
                xn xnVar = (xn) this.f1117c;
                jk jkVar = xnVar.Y;
                if (jkVar != null) {
                    if (this.f1116b) {
                        xnVar.finishFragment();
                        return;
                    } else {
                        jkVar.B();
                        return;
                    }
                }
                return;
            case 8:
                Activity activity = (Activity) this.f1117c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.f1116b && sf.c.a(activity) == -2) {
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
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int l02;
        long J0;
        int l03;
        long J02;
        switch (this.f1115a) {
            case 2:
                e9.a1 z10 = e9.i0.z((b2.k0) this.f1117c);
                boolean z11 = this.f1116b;
                if (z11) {
                    l02 = -1;
                } else {
                    l02 = a0Var.f14454t.l0();
                }
                if (z11) {
                    J0 = -9223372036854775807L;
                } else {
                    J0 = a0Var.f14454t.J0();
                }
                return a0Var.q(rVar, z10, l02, J0);
            default:
                List list = (List) this.f1117c;
                boolean z12 = this.f1116b;
                if (z12) {
                    l03 = -1;
                } else {
                    l03 = a0Var.f14454t.l0();
                }
                if (z12) {
                    J02 = -9223372036854775807L;
                } else {
                    J02 = a0Var.f14454t.J0();
                }
                return a0Var.q(rVar, list, l03, J02);
        }
    }

    @Override
    public void j(vh.h hVar, float f7, float f10) {
        vh.o oVar = (vh.o) this.f1117c;
        if (!oVar.d && this.f1116b) {
            hVar.f44367q = new vh.n(oVar, 0);
            float sqrt = (float) Math.sqrt(Math.pow(oVar.getHeight(), 2.0d) + Math.pow(oVar.getWidth(), 2.0d));
            ArrayList arrayList = oVar.f44402b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((vh.h) obj).j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        h80 h80Var = (h80) this.f1117c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            h80Var.setOnDismissListener(new c80(0, h80Var, this.f1116b));
        }
        h80Var.dismiss();
        return false;
    }
}
