package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class l9c extends m9c {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public l9c(l9c l9cVar, ps psVar) {
        n9c n9cVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = l9cVar.c;
        this.d = l9cVar.d;
        this.e = l9cVar.e;
        this.f = l9cVar.f;
        this.g = l9cVar.g;
        this.h = l9cVar.h;
        this.i = l9cVar.i;
        String str = l9cVar.k;
        this.k = str;
        if (str != null) {
            psVar.put(str, this);
        }
        matrix.set(l9cVar.j);
        ArrayList arrayList = l9cVar.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof l9c) {
                this.b.add(new l9c((l9c) obj, psVar));
            } else {
                if (obj instanceof k9c) {
                    k9c k9cVar = (k9c) obj;
                    ?? n9cVar2 = new n9c(k9cVar);
                    n9cVar2.e = 0.0f;
                    n9cVar2.g = 1.0f;
                    n9cVar2.h = 1.0f;
                    n9cVar2.i = 0.0f;
                    n9cVar2.j = 1.0f;
                    n9cVar2.k = 0.0f;
                    n9cVar2.l = Paint.Cap.BUTT;
                    n9cVar2.m = Paint.Join.MITER;
                    n9cVar2.n = 4.0f;
                    n9cVar2.d = k9cVar.d;
                    n9cVar2.e = k9cVar.e;
                    n9cVar2.g = k9cVar.g;
                    n9cVar2.f = k9cVar.f;
                    n9cVar2.c = k9cVar.c;
                    n9cVar2.h = k9cVar.h;
                    n9cVar2.i = k9cVar.i;
                    n9cVar2.j = k9cVar.j;
                    n9cVar2.k = k9cVar.k;
                    n9cVar2.l = k9cVar.l;
                    n9cVar2.m = k9cVar.m;
                    n9cVar2.n = k9cVar.n;
                    n9cVar = n9cVar2;
                } else if (obj instanceof j9c) {
                    n9cVar = new n9c((j9c) obj);
                } else {
                    sc8.j("Unknown object in the tree!");
                    throw null;
                }
                this.b.add(n9cVar);
                Object obj2 = n9cVar.b;
                if (obj2 != null) {
                    psVar.put(obj2, n9cVar);
                }
            }
        }
    }

    @Override
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((m9c) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                z |= ((m9c) arrayList.get(i)).b(iArr);
                i++;
            } else {
                return z;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public l9c() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
