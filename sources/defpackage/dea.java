package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dea extends c79 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final zh6 e = new zh6();
    public final kea f;

    public dea(kea keaVar, Context context) {
        this.f = keaVar;
        this.c = context;
        E();
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f != 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        zh6 zh6Var = this.e;
        zh6Var.b();
        kea keaVar = this.f;
        long j = yac.h(keaVar.a).n;
        if (keaVar.U1) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.id = Long.MAX_VALUE;
            arrayList.add(dialog);
            zh6Var.k(dialog.id, dialog);
        }
        if (!uc7.s1(keaVar.a).E.isEmpty()) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) uc7.s1(keaVar.a).E.get(0);
            arrayList.add(dialog2);
            zh6Var.k(dialog2.id, dialog2);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = uc7.s1(keaVar.a).y;
        for (int i = 0; i < arrayList3.size(); i++) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) arrayList3.get(i);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j2 = dialog3.id;
                if (j2 != j && !wf3.B(j2)) {
                    if (wf3.D(dialog3.id)) {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        zh6Var.k(dialog3.id, dialog3);
                    } else {
                        TLRPC.Chat M0 = uc7.s1(keaVar.a).M0(Long.valueOf(-dialog3.id));
                        if (M0 != null && !xc2.r0(M0) && ((!M0.gigagroup || xc2.N(M0)) && (!xc2.T(M0) || M0.creator || (((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages) || M0.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            zh6Var.k(dialog3.id, dialog3);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        zu1 zu1Var = keaVar.a2;
        if (zu1Var != null) {
            int i2 = zu1Var.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) c00.g(1, arrayList));
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
    public final void t(defpackage.f89 r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dea.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        float f;
        kea keaVar = this.f;
        Context context = this.c;
        if (i != 0) {
            view = new View(context);
            if (keaVar.c2 && keaVar.j2[1] != null) {
                f = 109.0f;
            } else {
                f = 56.0f;
            }
            view.setLayoutParams(new r79(-1, hl.L(f)));
        } else {
            bea beaVar = new bea(this, context, keaVar.J0);
            beaVar.setLayoutParams(new r79(-1, hl.L(100.0f)));
            view = beaVar;
        }
        return new f89(view);
    }
}
