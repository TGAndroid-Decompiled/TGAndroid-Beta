package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class hjb {
    public final View a;
    public final ArrayList b;
    public final Runnable c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f;
    public float g;

    public hjb(View view, Runnable runnable) {
        this.g = 1.0f;
        this.a = view;
        this.b = null;
        this.c = null;
        this.d = runnable;
        this.e = null;
        this.f = null;
    }

    public hjb(ArrayList arrayList, jn1 jn1Var) {
        this.g = 1.0f;
        this.a = null;
        this.b = arrayList;
        this.c = null;
        this.d = jn1Var;
        this.e = null;
        this.f = null;
    }

    public hjb(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.g = 1.0f;
        this.a = null;
        this.b = null;
        this.c = runnable;
        this.d = runnable2;
        this.f = matrix;
        this.e = bitmap;
    }
}
