package gg;

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
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.q80;
import org.telegram.ui.ai1;
import org.telegram.ui.eo;
import org.telegram.ui.h10;
import org.telegram.ui.j60;
import org.telegram.ui.m50;
import org.telegram.ui.ok;
import org.telegram.ui.y6;
import zh.i5;
import zh.r5;
public final class d0 implements ai1, m4.g1, org.telegram.ui.ActionBar.c2, xf.m, MessagesController.ErrorDelegate, uh.l, r5 {
    public final int f8839a;
    public final boolean f8840b;
    public final Object f8841c;

    public d0(int i10, Object obj, boolean z10) {
        this.f8839a = i10;
        this.f8841c = obj;
        this.f8840b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f8839a) {
            case 0:
                e0 e0Var = (e0) this.f8841c;
                ArrayList arrayList2 = e0Var.f8866k;
                ArrayList arrayList3 = e0Var.f8865j;
                int i11 = 0;
                if (this.f8840b) {
                    e0Var.f8862f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    e0Var.f8863g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                e0Var.e.run();
                return;
            default:
                h10 h10Var = (h10) this.f8841c;
                LongSparseIntArray longSparseIntArray = h10Var.H;
                h10Var.f33241y = i10;
                if (this.f8840b) {
                    h10Var.o0(h10Var.F, arrayList, true);
                    h10Var.F = arrayList;
                    for (int i12 = 0; i12 < h10Var.F.size(); i12++) {
                        h10Var.G.remove(h10Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !h10Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    h10Var.o0(h10Var.G, arrayList, false);
                    h10Var.G = arrayList;
                    for (int i15 = 0; i15 < h10Var.G.size(); i15++) {
                        Long l4 = (Long) h10Var.G.get(i15);
                        h10Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                h10Var.j0();
                h10Var.i0(false);
                h10Var.w0();
                return;
        }
    }

    @Override
    public void b(boolean z10) {
        zh.l lVar = (zh.l) this.f8841c;
        if (!this.f8840b && z10) {
            boolean z11 = true;
            if (lVar.f48598b != 1) {
                z11 = false;
            }
            i5 i5Var = lVar.f48619s;
            if (z11) {
                if (!i5Var.f48520z) {
                    return;
                }
            } else if (!i5Var.f48511p) {
                return;
            }
            i5Var.Q(z11);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        switch (this.f8839a) {
            case 3:
                y6.V((y6) this.f8841c, this.f8840b);
                return;
            case 4:
            default:
                j60 j60Var = ((m50) this.f8841c).f34847b;
                j60Var.f33936a1.toggleRecord(null, 0);
                UndoView k12 = j60Var.k1();
                if (this.f8840b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                k12.j(i11, 0L, null);
                return;
            case 5:
                eo eoVar = (eo) this.f8841c;
                ok okVar = eoVar.Y;
                if (okVar != null) {
                    if (this.f8840b) {
                        eoVar.finishFragment();
                        return;
                    } else {
                        okVar.A();
                        return;
                    }
                }
                return;
            case 6:
                Activity activity = (Activity) this.f8841c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.f8840b && sf.c.a(activity) == -2) {
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
    public void h(long j3) {
        n6 n6Var = ((org.telegram.ui.Cells.t1) this.f8841c).f20371w4;
        if (n6Var != null) {
            n6Var.q(LocaleController.formatPollEndTime((int) j3, this.f8840b), true, true);
        }
    }

    @Override
    public Object i(m4.b0 b0Var, m4.r rVar, int i10) {
        int l02;
        long J0;
        int l03;
        long J02;
        switch (this.f8839a) {
            case 1:
                e9.a1 z10 = e9.i0.z((b2.k0) this.f8841c);
                boolean z11 = this.f8840b;
                if (z11) {
                    l02 = -1;
                } else {
                    l02 = b0Var.f13307t.l0();
                }
                if (z11) {
                    J0 = -9223372036854775807L;
                } else {
                    J0 = b0Var.f13307t.J0();
                }
                return b0Var.q(rVar, z10, l02, J0);
            default:
                List list = (List) this.f8841c;
                boolean z12 = this.f8840b;
                if (z12) {
                    l03 = -1;
                } else {
                    l03 = b0Var.f13307t.l0();
                }
                if (z12) {
                    J02 = -9223372036854775807L;
                } else {
                    J02 = b0Var.f13307t.J0();
                }
                return b0Var.q(rVar, list, l03, J02);
        }
    }

    @Override
    public void l(uh.h hVar, float f7, float f10) {
        uh.o oVar = (uh.o) this.f8841c;
        if (!oVar.d && this.f8840b) {
            hVar.f42785q = new uh.n(oVar, 0);
            float sqrt = (float) Math.sqrt(Math.pow(oVar.getHeight(), 2.0d) + Math.pow(oVar.getWidth(), 2.0d));
            ArrayList arrayList = oVar.f42820b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((uh.h) obj).j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        q80 q80Var = (q80) this.f8841c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            q80Var.setOnDismissListener(new k80(0, q80Var, this.f8840b));
        }
        q80Var.dismiss();
        return false;
    }
}
