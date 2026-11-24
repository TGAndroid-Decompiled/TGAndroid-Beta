package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class ilb {
    public final View a;
    public final ArrayList b;
    public final Runnable c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f;
    public float g;

    public ilb(View view, Runnable runnable) {
        this.g = 1.0f;
        this.a = view;
        this.b = null;
        this.c = null;
        this.d = runnable;
        this.e = null;
        this.f = null;
    }

    public ilb(ArrayList arrayList, co1 co1Var) {
        this.g = 1.0f;
        this.a = null;
        this.b = arrayList;
        this.c = null;
        this.d = co1Var;
        this.e = null;
        this.f = null;
    }

    public ilb(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.g = 1.0f;
        this.a = null;
        this.b = null;
        this.c = runnable;
        this.d = runnable2;
        this.f = matrix;
        this.e = bitmap;
    }
}
