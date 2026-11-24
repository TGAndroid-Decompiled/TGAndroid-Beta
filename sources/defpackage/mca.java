package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mca extends q59 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final vh6 e = new vh6();
    public final tca f;

    public mca(tca tcaVar, Context context) {
        this.f = tcaVar;
        this.c = context;
        E();
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f != 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        vh6 vh6Var = this.e;
        vh6Var.b();
        tca tcaVar = this.f;
        long j = z8c.h(tcaVar.a).n;
        if (tcaVar.U1) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.id = Long.MAX_VALUE;
            arrayList.add(dialog);
            vh6Var.k(dialog, dialog.id);
        }
        if (!oc7.r1(tcaVar.a).E.isEmpty()) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) oc7.r1(tcaVar.a).E.get(0);
            arrayList.add(dialog2);
            vh6Var.k(dialog2, dialog2.id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = oc7.r1(tcaVar.a).y;
        for (int i = 0; i < arrayList3.size(); i++) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) arrayList3.get(i);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j2 = dialog3.id;
                if (j2 != j && !pg3.B(j2)) {
                    if (pg3.D(dialog3.id)) {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        vh6Var.k(dialog3, dialog3.id);
                    } else {
                        TLRPC.Chat L0 = oc7.r1(tcaVar.a).L0(Long.valueOf(-dialog3.id));
                        if (L0 != null && !sd2.r0(L0) && ((!L0.gigagroup || sd2.N(L0)) && (!sd2.T(L0) || L0.creator || (((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_messages) || L0.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            vh6Var.k(dialog3, dialog3.id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        yv1 yv1Var = tcaVar.a2;
        if (yv1Var != null) {
            int i2 = yv1Var.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) b10.f(1, arrayList));
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
    public final void t(defpackage.u69 r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mca.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        float f;
        tca tcaVar = this.f;
        Context context = this.c;
        if (i != 0) {
            view = new View(context);
            if (tcaVar.c2 && tcaVar.j2[1] != null) {
                f = 109.0f;
            } else {
                f = 56.0f;
            }
            view.setLayoutParams(new g69(-1, gm.L(f)));
        } else {
            kca kcaVar = new kca(this, context, tcaVar.J0);
            kcaVar.setLayoutParams(new g69(-1, gm.L(100.0f)));
            view = kcaVar;
        }
        return new u69(view);
    }
}
