package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
public final class vd2 extends n39 {
    public final wjb c;
    public ArrayList d;
    public WeakReference e;
    public final int h;
    public final boolean n;
    public final long r;
    public int f = -1;
    public final HashMap s = new HashMap();
    public final HashMap w = new HashMap();

    public vd2(int i, long j, wjb wjbVar, int i2) {
        this.n = i2;
        this.r = j;
        this.c = wjbVar;
        this.h = i;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    public final void E(int i) {
        anb anbVar;
        int i2 = this.f;
        if (i2 == i) {
            return;
        }
        if (i2 >= 0) {
            g(i2);
            WeakReference weakReference = this.e;
            if (weakReference == null) {
                anbVar = null;
            } else {
                anbVar = (anb) weakReference.get();
            }
            if (anbVar != null) {
                anbVar.setSelected(false);
            }
        }
        this.f = i;
        g(i);
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final void t(defpackage.s49 r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd2.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        return new s49(new anb(this.h, this.n ? 1 : 0, this.c, context));
    }
}
