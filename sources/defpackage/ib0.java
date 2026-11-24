package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
public final class ib0 extends o39 {
    public final ArrayList f3;
    public final int g3;
    public int h3;
    public final jr i3;
    public hb0 j3;
    public final mb0 k3;

    public ib0(mb0 mb0Var, Activity activity) {
        super(activity, null);
        this.k3 = mb0Var;
        this.f3 = new ArrayList();
        this.g3 = 200;
        this.h3 = -1;
        t26 t26Var = new t26();
        t26Var.i1(0);
        setLayoutManager(t26Var);
        for (int i = 0; i < 7; i++) {
            ?? obj = new Object();
            int i2 = this.g3;
            this.g3 = i2 + 1;
            obj.a = i2;
            int[] iArr = mb0.d0[i];
            obj.c = iArr[0];
            obj.d = iArr[1];
            obj.e = iArr[2];
            obj.f = iArr[3];
            this.f3.add(obj);
        }
        for (int i3 = 0; i3 < 30; i3++) {
            ?? obj2 = new Object();
            int i4 = this.g3;
            this.g3 = i4 + 1;
            obj2.a = i4;
            int[] iArr2 = mb0.e0[i3];
            obj2.c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.e = 0;
            obj2.f = 0;
            obj2.b = true;
            this.f3.add(obj2);
        }
        setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        setClipToPadding(false);
        this.g1 = true;
        setOnItemClickListener(new u(this, (byte) 6));
        jr jrVar = new jr(this, (byte) 1);
        this.i3 = jrVar;
        setAdapter(jrVar);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) / this.i3.b();
        mb0 mb0Var = this.k3;
        mb0Var.Q = size;
        if (size < gl.L(39.0f)) {
            mb0Var.Q = gl.L(39.0f);
        } else if (mb0Var.Q > gl.L(150.0f)) {
            mb0Var.Q = gl.L(48.0f);
        }
        super.onMeasure(i, i2);
    }

    public final void z1(hb0 hb0Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3;
            if (i < arrayList.size()) {
                if (((hb0) arrayList.get(i)).equals(hb0Var)) {
                    this.h3 = ((hb0) arrayList.get(i)).a;
                    break;
                }
                i++;
            } else {
                this.j3 = hb0Var;
                this.h3 = 1;
                break;
            }
        }
        this.i3.f();
    }
}
