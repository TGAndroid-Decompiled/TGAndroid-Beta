package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class mbc extends nbc {
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

    public mbc(mbc mbcVar, qt qtVar) {
        obc obcVar;
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
        this.c = mbcVar.c;
        this.d = mbcVar.d;
        this.e = mbcVar.e;
        this.f = mbcVar.f;
        this.g = mbcVar.g;
        this.h = mbcVar.h;
        this.i = mbcVar.i;
        String str = mbcVar.k;
        this.k = str;
        if (str != null) {
            qtVar.put(str, this);
        }
        matrix.set(mbcVar.j);
        ArrayList arrayList = mbcVar.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof mbc) {
                this.b.add(new mbc((mbc) obj, qtVar));
            } else {
                if (obj instanceof lbc) {
                    lbc lbcVar = (lbc) obj;
                    ?? obcVar2 = new obc(lbcVar);
                    obcVar2.e = 0.0f;
                    obcVar2.g = 1.0f;
                    obcVar2.h = 1.0f;
                    obcVar2.i = 0.0f;
                    obcVar2.j = 1.0f;
                    obcVar2.k = 0.0f;
                    obcVar2.l = Paint.Cap.BUTT;
                    obcVar2.m = Paint.Join.MITER;
                    obcVar2.n = 4.0f;
                    obcVar2.d = lbcVar.d;
                    obcVar2.e = lbcVar.e;
                    obcVar2.g = lbcVar.g;
                    obcVar2.f = lbcVar.f;
                    obcVar2.c = lbcVar.c;
                    obcVar2.h = lbcVar.h;
                    obcVar2.i = lbcVar.i;
                    obcVar2.j = lbcVar.j;
                    obcVar2.k = lbcVar.k;
                    obcVar2.l = lbcVar.l;
                    obcVar2.m = lbcVar.m;
                    obcVar2.n = lbcVar.n;
                    obcVar = obcVar2;
                } else if (obj instanceof kbc) {
                    obcVar = new obc((kbc) obj);
                } else {
                    dq9.m("Unknown object in the tree!");
                    throw null;
                }
                this.b.add(obcVar);
                Object obj2 = obcVar.b;
                if (obj2 != null) {
                    qtVar.put(obj2, obcVar);
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
            if (((nbc) arrayList.get(i)).a()) {
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
                z |= ((nbc) arrayList.get(i)).b(iArr);
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

    public mbc() {
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
