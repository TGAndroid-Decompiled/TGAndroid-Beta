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
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.r80;
import org.telegram.ui.f10;
import org.telegram.ui.i60;
import org.telegram.ui.l50;
import org.telegram.ui.mk;
import org.telegram.ui.uh1;
import org.telegram.ui.zn;
public final class k implements t9, uh1, m4.e1, org.telegram.ui.ActionBar.a2, yf.m, MessagesController.ErrorDelegate, vh.k {
    public final int f1121a;
    public final boolean f1122b;
    public final Object f1123c;

    public k(int i10, Object obj, boolean z10) {
        this.f1121a = i10;
        this.f1123c = obj;
        this.f1122b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f1121a) {
            case 1:
                hg.a0 a0Var = (hg.a0) this.f1123c;
                ArrayList arrayList2 = a0Var.f10217k;
                ArrayList arrayList3 = a0Var.f10216j;
                int i11 = 0;
                if (this.f1122b) {
                    a0Var.f10213f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    a0Var.f10214g = i10;
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
                f10 f10Var = (f10) this.f1123c;
                LongSparseIntArray longSparseIntArray = f10Var.H;
                f10Var.f33468y = i10;
                if (this.f1122b) {
                    f10Var.o0(f10Var.F, arrayList, true);
                    f10Var.F = arrayList;
                    for (int i12 = 0; i12 < f10Var.F.size(); i12++) {
                        f10Var.G.remove(f10Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !f10Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    f10Var.o0(f10Var.G, arrayList, false);
                    f10Var.G = arrayList;
                    for (int i15 = 0; i15 < f10Var.G.size(); i15++) {
                        Long l4 = (Long) f10Var.G.get(i15);
                        f10Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                f10Var.j0();
                f10Var.i0(false);
                f10Var.w0();
                return;
        }
    }

    @Override
    public void b(boolean z10) {
        b0 b0Var = (b0) this.f1123c;
        if (!this.f1122b && z10) {
            boolean z11 = true;
            if (b0Var.f539b != 1) {
                z11 = false;
            }
            l9 l9Var = b0Var.f560s;
            if (z11) {
                if (!l9Var.f1211z) {
                    return;
                }
            } else if (!l9Var.f1202p) {
                return;
            }
            l9Var.Q(z11);
        }
    }

    @Override
    public void e(long j3) {
        org.telegram.ui.Components.n6 n6Var = ((org.telegram.ui.Cells.u1) this.f1123c).f21558w4;
        if (n6Var != null) {
            n6Var.q(LocaleController.formatPollEndTime((int) j3, this.f1122b), true, true);
        }
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int l02;
        long J0;
        int l03;
        long J02;
        switch (this.f1121a) {
            case 2:
                e9.a1 z10 = e9.i0.z((b2.k0) this.f1123c);
                boolean z11 = this.f1122b;
                if (z11) {
                    l02 = -1;
                } else {
                    l02 = a0Var.f14702t.l0();
                }
                if (z11) {
                    J0 = -9223372036854775807L;
                } else {
                    J0 = a0Var.f14702t.J0();
                }
                return a0Var.q(rVar, z10, l02, J0);
            default:
                List list = (List) this.f1123c;
                boolean z12 = this.f1122b;
                if (z12) {
                    l03 = -1;
                } else {
                    l03 = a0Var.f14702t.l0();
                }
                if (z12) {
                    J02 = -9223372036854775807L;
                } else {
                    J02 = a0Var.f14702t.J0();
                }
                return a0Var.q(rVar, list, l03, J02);
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f1121a) {
            case 4:
                org.telegram.ui.z6.Y((org.telegram.ui.z6) this.f1123c, this.f1122b);
                return;
            case 5:
            default:
                i60 i60Var = ((l50) this.f1123c).f35324b;
                i60Var.f34380a1.toggleRecord(null, 0);
                UndoView k12 = i60Var.k1();
                if (this.f1122b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                k12.j(i11, 0L, null);
                return;
            case 6:
                zn znVar = (zn) this.f1123c;
                mk mkVar = znVar.Y;
                if (mkVar != null) {
                    if (this.f1122b) {
                        znVar.finishFragment();
                        return;
                    } else {
                        mkVar.A();
                        return;
                    }
                }
                return;
            case 7:
                Activity activity = (Activity) this.f1123c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.f1122b && sf.c.a(activity) == -2) {
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
    public void l(vh.g gVar, float f7, float f10) {
        vh.n nVar = (vh.n) this.f1123c;
        if (!nVar.d && this.f1122b) {
            gVar.f44735q = new vh.m(nVar, 0);
            float sqrt = (float) Math.sqrt(Math.pow(nVar.getHeight(), 2.0d) + Math.pow(nVar.getWidth(), 2.0d));
            ArrayList arrayList = nVar.f44770b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((vh.g) obj).j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        r80 r80Var = (r80) this.f1123c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            r80Var.setOnDismissListener(new m80(0, r80Var, this.f1122b));
        }
        r80Var.dismiss();
        return false;
    }
}
