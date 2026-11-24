package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class i72 implements g22 {
    public final d a;
    public final qac b;
    public final e51 c;

    public i72(e51 e51Var, qac qacVar, d dVar) {
        this.a = dVar;
        this.b = qacVar;
        this.c = e51Var;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        e51 e51Var = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = e51Var.d2;
        qac qacVar = this.b;
        if (i == 15) {
            d dVar = this.a;
            ik.d0(dVar.getContext(), dVar.getResourceProvider(), null, null, new h72(qacVar, (byte) 0), null);
        } else if (i == 7 || i == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                ?? obj2 = new Object();
                String str = null;
                if (obj instanceof jo6) {
                    jo6 jo6Var = (jo6) obj;
                    String str2 = jo6Var.h;
                    if (str2 != null) {
                        obj2.c = str2;
                    } else {
                        obj2.c = jo6Var.I;
                    }
                    obj2.e = jo6Var.c;
                    obj2.f = jo6Var.g;
                    obj2.k = jo6Var.s;
                    obj2.p = jo6Var.d();
                    obj2.z = jo6Var.m;
                    obj2.q = true;
                    obj2.o = jo6Var.b;
                    CharSequence charSequence = jo6Var.a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.i = jo6Var.n;
                    obj2.j = jo6Var.r;
                    obj2.h = jo6Var.x;
                    obj2.v = jo6Var.S;
                    obj2.y = jo6Var;
                } else if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    String str3 = no6Var.h;
                    if (str3 != null) {
                        obj2.c = str3;
                    } else {
                        obj2.l = no6Var;
                    }
                    obj2.e = no6Var.c;
                    obj2.f = no6Var.g;
                    obj2.k = no6Var.s;
                    CharSequence charSequence2 = no6Var.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.i = no6Var.n;
                    obj2.j = no6Var.r;
                    obj2.h = no6Var.x;
                    TLRPC.BotInlineResult botInlineResult = no6Var.N;
                    if (botInlineResult != null && no6Var.H) {
                        obj2.m = botInlineResult;
                        obj2.n = no6Var.O;
                    }
                    System.currentTimeMillis();
                }
                qacVar.a(new rf8(obj2));
            }
        }
        e51Var.a(true);
    }

    @Override
    public final boolean K0() {
        return false;
    }

    @Override
    public final void a1(vr0 vr0Var) {
        nm7.f(this.a.getCurrentAccount()).d(vr0Var);
    }

    @Override
    public final void I() {
    }

    @Override
    public final void b0() {
    }

    @Override
    public final void f0(Object obj) {
    }

    @Override
    public final void z0(TLRPC.User user) {
    }

    @Override
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
