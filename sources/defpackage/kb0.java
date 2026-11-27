package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
public final class kb0 extends d79 {
    public final ArrayList f3;
    public final int g3;
    public int h3;
    public final kr i3;
    public jb0 j3;
    public final ob0 k3;

    public kb0(ob0 ob0Var, Activity activity) {
        super(activity, null);
        this.k3 = ob0Var;
        this.f3 = new ArrayList();
        this.g3 = 200;
        this.h3 = -1;
        x46 x46Var = new x46();
        x46Var.i1(0);
        setLayoutManager(x46Var);
        for (int i = 0; i < 7; i++) {
            ?? obj = new Object();
            int i2 = this.g3;
            this.g3 = i2 + 1;
            obj.a = i2;
            int[] iArr = ob0.d0[i];
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
            int[] iArr2 = ob0.e0[i3];
            obj2.c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.e = 0;
            obj2.f = 0;
            obj2.b = true;
            this.f3.add(obj2);
        }
        setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        setClipToPadding(false);
        this.g1 = true;
        setOnItemClickListener(new u(this, (byte) 6));
        kr krVar = new kr(this, (byte) 1);
        this.i3 = krVar;
        setAdapter(krVar);
        setOverScrollMode(1);
    }

    public final void A1(jb0 jb0Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3;
            if (i < arrayList.size()) {
                if (((jb0) arrayList.get(i)).equals(jb0Var)) {
                    this.h3 = ((jb0) arrayList.get(i)).a;
                    break;
                }
                i++;
            } else {
                this.j3 = jb0Var;
                this.h3 = 1;
                break;
            }
        }
        this.i3.f();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) / this.i3.b();
        ob0 ob0Var = this.k3;
        ob0Var.Q = size;
        if (size < hl.L(39.0f)) {
            ob0Var.Q = hl.L(39.0f);
        } else if (ob0Var.Q > hl.L(150.0f)) {
            ob0Var.Q = hl.L(48.0f);
        }
        super.onMeasure(i, i2);
    }
}
