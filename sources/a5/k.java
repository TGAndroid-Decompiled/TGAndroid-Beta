package a5;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class k extends l {
    public final Matrix f230a;
    public final ArrayList f231b;
    public float f232c;
    public float d;
    public float f233e;
    public float f234f;
    public float f235g;
    public float h;
    public float f236i;
    public final Matrix f237j;
    public String f238k;

    public k() {
        this.f230a = new Matrix();
        this.f231b = new ArrayList();
        this.f232c = 0.0f;
        this.d = 0.0f;
        this.f233e = 0.0f;
        this.f234f = 1.0f;
        this.f235g = 1.0f;
        this.h = 0.0f;
        this.f236i = 0.0f;
        this.f237j = new Matrix();
        this.f238k = null;
    }

    @Override
    public final boolean a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f231b;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i7)).a()) {
                return true;
            }
            i7++;
        }
    }

    @Override
    public final boolean b(int[] iArr) {
        int i7 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.f231b;
            if (i7 < arrayList.size()) {
                z9 |= ((l) arrayList.get(i7)).b(iArr);
                i7++;
            } else {
                return z9;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f237j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f233e);
        matrix.postScale(this.f234f, this.f235g);
        matrix.postRotate(this.f232c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f236i + this.f233e);
    }

    public String getGroupName() {
        return this.f238k;
    }

    public Matrix getLocalMatrix() {
        return this.f237j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f233e;
    }

    public float getRotation() {
        return this.f232c;
    }

    public float getScaleX() {
        return this.f234f;
    }

    public float getScaleY() {
        return this.f235g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f236i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.d) {
            this.d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f233e) {
            this.f233e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f232c) {
            this.f232c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f234f) {
            this.f234f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f235g) {
            this.f235g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.h) {
            this.h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f236i) {
            this.f236i = f10;
            c();
        }
    }

    public k(k kVar, a0.f fVar) {
        m mVar;
        this.f230a = new Matrix();
        this.f231b = new ArrayList();
        this.f232c = 0.0f;
        this.d = 0.0f;
        this.f233e = 0.0f;
        this.f234f = 1.0f;
        this.f235g = 1.0f;
        this.h = 0.0f;
        this.f236i = 0.0f;
        Matrix matrix = new Matrix();
        this.f237j = matrix;
        this.f238k = null;
        this.f232c = kVar.f232c;
        this.d = kVar.d;
        this.f233e = kVar.f233e;
        this.f234f = kVar.f234f;
        this.f235g = kVar.f235g;
        this.h = kVar.h;
        this.f236i = kVar.f236i;
        String str = kVar.f238k;
        this.f238k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(kVar.f237j);
        ArrayList arrayList = kVar.f231b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Object obj = arrayList.get(i7);
            if (obj instanceof k) {
                this.f231b.add(new k((k) obj, fVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    ?? mVar2 = new m(jVar);
                    mVar2.f221e = 0.0f;
                    mVar2.f223g = 1.0f;
                    mVar2.h = 1.0f;
                    mVar2.f224i = 0.0f;
                    mVar2.f225j = 1.0f;
                    mVar2.f226k = 0.0f;
                    mVar2.f227l = Paint.Cap.BUTT;
                    mVar2.f228m = Paint.Join.MITER;
                    mVar2.f229n = 4.0f;
                    mVar2.d = jVar.d;
                    mVar2.f221e = jVar.f221e;
                    mVar2.f223g = jVar.f223g;
                    mVar2.f222f = jVar.f222f;
                    mVar2.f241c = jVar.f241c;
                    mVar2.h = jVar.h;
                    mVar2.f224i = jVar.f224i;
                    mVar2.f225j = jVar.f225j;
                    mVar2.f226k = jVar.f226k;
                    mVar2.f227l = jVar.f227l;
                    mVar2.f228m = jVar.f228m;
                    mVar2.f229n = jVar.f229n;
                    mVar = mVar2;
                } else if (obj instanceof i) {
                    mVar = new m((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f231b.add(mVar);
                Object obj2 = mVar.f240b;
                if (obj2 != null) {
                    fVar.put(obj2, mVar);
                }
            }
        }
    }
}
