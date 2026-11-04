package ei;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.so;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ab1;
import org.telegram.ui.c30;
import org.telegram.ui.ez;
import org.telegram.ui.mj;
import org.telegram.ui.wm;
import org.telegram.ui.x30;
public final class f implements h7, ab1, o4.f1, g2.k, org.telegram.ui.ActionBar.p1, cg.o, so, yh.j, OnSuccessListener {
    public final int f10250a;
    public final boolean f10251b;
    public final Object f10252c;

    public f(int i3, Object obj, boolean z10) {
        this.f10250a = i3;
        this.f10252c = obj;
        this.f10251b = z10;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        x60 x60Var = (x60) this.f10252c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            x60Var.setOnDismissListener(new s60(0, x60Var, this.f10251b));
        }
        x60Var.dismiss();
        return false;
    }

    @Override
    public void accept(Object obj) {
        ((o4.l1) obj).A0((d2.f) this.f10252c, this.f10251b);
    }

    @Override
    public void c(boolean z10) {
        r rVar = (r) this.f10252c;
        if (!this.f10251b && z10) {
            boolean z11 = true;
            if (rVar.f10824b != 1) {
                z11 = false;
            }
            z6 z6Var = rVar.f10846s;
            if (z11) {
                if (!z6Var.f11296z) {
                    return;
                }
            } else if (!z6Var.f11287p) {
                return;
            }
            z6Var.T(z11);
        }
    }

    @Override
    public void e(int i3, ArrayList arrayList) {
        switch (this.f10250a) {
            case 1:
                lg.b0 b0Var = (lg.b0) this.f10252c;
                ArrayList arrayList2 = b0Var.f18234k;
                ArrayList arrayList3 = b0Var.f18233j;
                int i10 = 0;
                if (this.f10251b) {
                    b0Var.f18230f = i3;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i10 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i10));
                        i10++;
                    }
                } else {
                    b0Var.f18231g = i3;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i10 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i10));
                        i10++;
                    }
                }
                b0Var.f18229e.run();
                return;
            default:
                ez ezVar = (ez) this.f10252c;
                LongSparseIntArray longSparseIntArray = ezVar.I;
                ezVar.E = i3;
                if (this.f10251b) {
                    ezVar.u0(ezVar.G, arrayList, true);
                    ezVar.G = arrayList;
                    for (int i11 = 0; i11 < ezVar.G.size(); i11++) {
                        ezVar.H.remove(ezVar.G.get(i11));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!org.telegram.messenger.m5.C(keyAt) && !ezVar.G.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i13)).longValue());
                    }
                } else {
                    ezVar.u0(ezVar.H, arrayList, false);
                    ezVar.H = arrayList;
                    for (int i14 = 0; i14 < ezVar.H.size(); i14++) {
                        Long l10 = (Long) ezVar.H.get(i14);
                        ezVar.G.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                ezVar.p0();
                ezVar.o0(false);
                ezVar.C0();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10;
        switch (this.f10250a) {
            case 5:
                org.telegram.ui.z6.d0((org.telegram.ui.z6) this.f10252c, this.f10251b);
                return;
            case 6:
            default:
                x30 x30Var = ((c30) this.f10252c).f44213b;
                x30Var.S2.A(0, null);
                UndoView m1 = x30Var.m1();
                if (this.f10251b) {
                    i10 = 101;
                } else {
                    i10 = 40;
                }
                m1.j(i10, 0L, null);
                return;
            case 7:
                wm wmVar = (wm) this.f10252c;
                mj mjVar = wmVar.f51237a0;
                if (mjVar != null) {
                    if (this.f10251b) {
                        wmVar.finishFragment();
                        return;
                    } else {
                        mjVar.x();
                        return;
                    }
                }
                return;
            case 8:
                Activity activity = (Activity) this.f10252c;
                if (activity != null) {
                    if (this.f10251b && xf.b.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                    try {
                        activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void h(long j10) {
        org.telegram.ui.Components.g6 g6Var = ((org.telegram.ui.Cells.w1) this.f10252c).f30775a.f30150y3;
        if (g6Var != null) {
            g6Var.t(bd.M((int) j10, this.f10251b), true, true);
        }
    }

    @Override
    public Object i(o4.e0 e0Var, o4.v vVar, int i3) {
        int l02;
        long N0;
        int l03;
        long N02;
        switch (this.f10250a) {
            case 2:
                g9.s1 u10 = g9.i0.u((d2.n0) this.f10252c);
                boolean z10 = this.f10251b;
                if (z10) {
                    l02 = -1;
                } else {
                    l02 = e0Var.f20636t.l0();
                }
                int i10 = l02;
                if (z10) {
                    N0 = -9223372036854775807L;
                } else {
                    N0 = e0Var.f20636t.N0();
                }
                return e0Var.q(vVar, u10, i10, N0);
            default:
                List list = (List) this.f10252c;
                boolean z11 = this.f10251b;
                if (z11) {
                    l03 = -1;
                } else {
                    l03 = e0Var.f20636t.l0();
                }
                int i11 = l03;
                if (z11) {
                    N02 = -9223372036854775807L;
                } else {
                    N02 = e0Var.f20636t.N0();
                }
                return e0Var.q(vVar, list, i11, N02);
        }
    }

    @Override
    public void l(yh.f fVar, float f10, float f11) {
        yh.l lVar = (yh.l) this.f10252c;
        if (!lVar.d && !lVar.f59557e && !lVar.f59558f && this.f10251b) {
            lVar.c(f10, f11);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Void r32 = (Void) obj;
        SharedPreferences.Editor edit = x7.b7.a((Context) this.f10252c).edit();
        edit.putBoolean("proxy_retention", this.f10251b);
        edit.apply();
    }
}
