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
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.o80;
import org.telegram.ui.f10;
import org.telegram.ui.i60;
import org.telegram.ui.l50;
import org.telegram.ui.lk;
import org.telegram.ui.uh1;
import org.telegram.ui.zn;
public final class k implements t9, uh1, m4.e1, org.telegram.ui.ActionBar.a2, yf.m, MessagesController.ErrorDelegate, vh.l {
    public final int f1124a;
    public final boolean f1125b;
    public final Object f1126c;

    public k(int i10, Object obj, boolean z10) {
        this.f1124a = i10;
        this.f1126c = obj;
        this.f1125b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f1124a) {
            case 1:
                hg.a0 a0Var = (hg.a0) this.f1126c;
                ArrayList arrayList2 = a0Var.f10217k;
                ArrayList arrayList3 = a0Var.f10216j;
                int i11 = 0;
                if (this.f1125b) {
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
                f10 f10Var = (f10) this.f1126c;
                LongSparseIntArray longSparseIntArray = f10Var.H;
                f10Var.f33443y = i10;
                if (this.f1125b) {
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
        b0 b0Var = (b0) this.f1126c;
        if (!this.f1125b && z10) {
            boolean z11 = true;
            if (b0Var.f542b != 1) {
                z11 = false;
            }
            l9 l9Var = b0Var.f563s;
            if (z11) {
                if (!l9Var.f1214z) {
                    return;
                }
            } else if (!l9Var.f1205p) {
                return;
            }
            l9Var.Q(z11);
        }
    }

    @Override
    public void e(long j3) {
        org.telegram.ui.Components.n6 n6Var = ((org.telegram.ui.Cells.u1) this.f1126c).f21543w4;
        if (n6Var != null) {
            n6Var.q(LocaleController.formatPollEndTime((int) j3, this.f1125b), true, true);
        }
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int l02;
        long J0;
        int l03;
        long J02;
        switch (this.f1124a) {
            case 2:
                e9.a1 z10 = e9.i0.z((b2.k0) this.f1126c);
                boolean z11 = this.f1125b;
                if (z11) {
                    l02 = -1;
                } else {
                    l02 = a0Var.f14687t.l0();
                }
                if (z11) {
                    J0 = -9223372036854775807L;
                } else {
                    J0 = a0Var.f14687t.J0();
                }
                return a0Var.q(rVar, z10, l02, J0);
            default:
                List list = (List) this.f1126c;
                boolean z12 = this.f1125b;
                if (z12) {
                    l03 = -1;
                } else {
                    l03 = a0Var.f14687t.l0();
                }
                if (z12) {
                    J02 = -9223372036854775807L;
                } else {
                    J02 = a0Var.f14687t.J0();
                }
                return a0Var.q(rVar, list, l03, J02);
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f1124a) {
            case 4:
                org.telegram.ui.z6.Y((org.telegram.ui.z6) this.f1126c, this.f1125b);
                return;
            case 5:
            default:
                i60 i60Var = ((l50) this.f1126c).f35306b;
                i60Var.f34360a1.toggleRecord(null, 0);
                UndoView k12 = i60Var.k1();
                if (this.f1125b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                k12.j(i11, 0L, null);
                return;
            case 6:
                zn znVar = (zn) this.f1126c;
                lk lkVar = znVar.Y;
                if (lkVar != null) {
                    if (this.f1125b) {
                        znVar.finishFragment();
                        return;
                    } else {
                        lkVar.A();
                        return;
                    }
                }
                return;
            case 7:
                Activity activity = (Activity) this.f1126c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.f1125b && sf.c.a(activity) == -2) {
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
    public void l(vh.h hVar, float f7, float f10) {
        vh.o oVar = (vh.o) this.f1126c;
        if (!oVar.d && this.f1125b) {
            hVar.f44714q = new vh.n(oVar, 0);
            float sqrt = (float) Math.sqrt(Math.pow(oVar.getHeight(), 2.0d) + Math.pow(oVar.getWidth(), 2.0d));
            ArrayList arrayList = oVar.f44749b;
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
        o80 o80Var = (o80) this.f1126c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            o80Var.setOnDismissListener(new j80(0, o80Var, this.f1125b));
        }
        o80Var.dismiss();
        return false;
    }
}
