package defpackage;

import android.content.Context;
public class po0 extends gg0 {
    public static final int w = 0;
    public byte s;

    public po0(Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.d.setTypeface(gm.o());
    }

    @Override
    public final boolean b() {
        return !(this instanceof qo0);
    }

    @Override
    public void d() {
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        float f3;
        float f4;
        int i4 = 3;
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        this.c.setLayoutParams(qoe.d(40, 40.0f, i | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z = jb6.a0;
        if (z) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i5 = i2 | 16;
        if (z) {
            f = 20.0f;
        } else {
            f = 109.0f;
        }
        if (z) {
            f2 = 109.0f;
        } else {
            f2 = 20.0f;
        }
        this.d.setLayoutParams(qoe.d(-1, -2.0f, i5, f, 0.0f, f2, 0.0f));
        boolean z2 = jb6.a0;
        if (z2) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i6 = i3 | 16;
        if (z2) {
            f3 = 20.0f;
        } else {
            f3 = 109.0f;
        }
        if (z2) {
            f4 = 109.0f;
        } else {
            f4 = 20.0f;
        }
        this.e.setLayoutParams(qoe.d(-1, -2.0f, i6, f3, 0.0f, f4, 0.0f));
        if (jb6.a0) {
            i4 = 5;
        }
        this.f.setLayoutParams(qoe.d(22, 22.0f, i4 | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.s;
    }
}
