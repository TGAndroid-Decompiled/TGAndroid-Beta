package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class maa extends n39 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final vf6 e = new vf6();
    public final taa f;

    public maa(taa taaVar, Context context) {
        this.f = taaVar;
        this.c = context;
        E();
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f != 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        vf6 vf6Var = this.e;
        vf6Var.b();
        taa taaVar = this.f;
        long j = y6c.h(taaVar.a).n;
        if (taaVar.U1) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.id = Long.MAX_VALUE;
            arrayList.add(dialog);
            vf6Var.k(dialog, dialog.id);
        }
        if (!na7.q1(taaVar.a).E.isEmpty()) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) na7.q1(taaVar.a).E.get(0);
            arrayList.add(dialog2);
            vf6Var.k(dialog2, dialog2.id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = na7.q1(taaVar.a).y;
        for (int i = 0; i < arrayList3.size(); i++) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) arrayList3.get(i);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j2 = dialog3.id;
                if (j2 != j && !cf3.B(j2)) {
                    if (cf3.D(dialog3.id)) {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        vf6Var.k(dialog3, dialog3.id);
                    } else {
                        TLRPC.Chat K0 = na7.q1(taaVar.a).K0(Long.valueOf(-dialog3.id));
                        if (K0 != null && !hc2.r0(K0) && ((!K0.gigagroup || hc2.N(K0)) && (!hc2.T(K0) || K0.creator || (((tL_chatAdminRights = K0.admin_rights) != null && tL_chatAdminRights.post_messages) || K0.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            vf6Var.k(dialog3, dialog3.id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        mu1 mu1Var = taaVar.a2;
        if (mu1Var != null) {
            int i2 = mu1Var.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) b00.f(1, arrayList));
                    }
                }
            } else {
                ArrayList arrayList4 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList4);
            }
        }
        f();
    }

    @Override
    public final int b() {
        int size = this.d.size();
        if (size != 0) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(defpackage.s49 r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.maa.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        float f;
        taa taaVar = this.f;
        Context context = this.c;
        if (i != 0) {
            view = new View(context);
            if (taaVar.c2 && taaVar.j2[1] != null) {
                f = 109.0f;
            } else {
                f = 56.0f;
            }
            view.setLayoutParams(new e49(-1, gl.L(f)));
        } else {
            kaa kaaVar = new kaa(this, context, taaVar.J0);
            kaaVar.setLayoutParams(new e49(-1, gl.L(100.0f)));
            view = kaaVar;
        }
        return new s49(view);
    }
}
