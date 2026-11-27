package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
public final class me2 extends c79 {
    public final vnb c;
    public ArrayList d;
    public WeakReference e;
    public final int h;
    public final boolean n;
    public final long r;
    public int f = -1;
    public final HashMap s = new HashMap();
    public final HashMap w = new HashMap();

    public me2(int i, long j, vnb vnbVar, int i2) {
        this.n = i2;
        this.r = j;
        this.c = vnbVar;
        this.h = i;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return false;
    }

    public final void E(int i) {
        zqb zqbVar;
        int i2 = this.f;
        if (i2 == i) {
            return;
        }
        if (i2 >= 0) {
            g(i2);
            WeakReference weakReference = this.e;
            if (weakReference == null) {
                zqbVar = null;
            } else {
                zqbVar = (zqb) weakReference.get();
            }
            if (zqbVar != null) {
                zqbVar.setSelected(false);
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
    public final void t(defpackage.f89 r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me2.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        return new f89(new zqb(this.h, this.n ? 1 : 0, this.c, context));
    }
}
