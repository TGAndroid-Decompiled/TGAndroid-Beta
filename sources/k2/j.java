package k2;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f10365a;
    public final ArrayList f10366b;
    public float f10367c;
    public float d;
    public float f10368e;
    public float f10369f;
    public float f10370g;
    public float h;
    public float f10371i;
    public final Matrix f10372j;
    public String f10373k;

    public j() {
        this.f10365a = new Matrix();
        this.f10366b = new ArrayList();
        this.f10367c = 0.0f;
        this.d = 0.0f;
        this.f10368e = 0.0f;
        this.f10369f = 1.0f;
        this.f10370g = 1.0f;
        this.h = 0.0f;
        this.f10371i = 0.0f;
        this.f10372j = new Matrix();
        this.f10373k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f10366b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i10)).a()) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final boolean b(int[] iArr) {
        int i10 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f10366b;
            if (i10 < arrayList.size()) {
                z4 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z4;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f10372j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f10368e);
        matrix.postScale(this.f10369f, this.f10370g);
        matrix.postRotate(this.f10367c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f10371i + this.f10368e);
    }

    public String getGroupName() {
        return this.f10373k;
    }

    public Matrix getLocalMatrix() {
        return this.f10372j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f10368e;
    }

    public float getRotation() {
        return this.f10367c;
    }

    public float getScaleX() {
        return this.f10369f;
    }

    public float getScaleY() {
        return this.f10370g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f10371i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.d) {
            this.d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f10368e) {
            this.f10368e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f10367c) {
            this.f10367c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f10369f) {
            this.f10369f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f10370g) {
            this.f10370g = f10;
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
        if (f10 != this.f10371i) {
            this.f10371i = f10;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f10365a = new Matrix();
        this.f10366b = new ArrayList();
        this.f10367c = 0.0f;
        this.d = 0.0f;
        this.f10368e = 0.0f;
        this.f10369f = 1.0f;
        this.f10370g = 1.0f;
        this.h = 0.0f;
        this.f10371i = 0.0f;
        Matrix matrix = new Matrix();
        this.f10372j = matrix;
        this.f10373k = null;
        this.f10367c = jVar.f10367c;
        this.d = jVar.d;
        this.f10368e = jVar.f10368e;
        this.f10369f = jVar.f10369f;
        this.f10370g = jVar.f10370g;
        this.h = jVar.h;
        this.f10371i = jVar.f10371i;
        String str = jVar.f10373k;
        this.f10373k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f10372j);
        ArrayList arrayList = jVar.f10366b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f10366b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f10356e = 0.0f;
                    lVar2.f10358g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f10359i = 0.0f;
                    lVar2.f10360j = 1.0f;
                    lVar2.f10361k = 0.0f;
                    lVar2.f10362l = Paint.Cap.BUTT;
                    lVar2.f10363m = Paint.Join.MITER;
                    lVar2.f10364n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.f10356e = iVar.f10356e;
                    lVar2.f10358g = iVar.f10358g;
                    lVar2.f10357f = iVar.f10357f;
                    lVar2.f10376c = iVar.f10376c;
                    lVar2.h = iVar.h;
                    lVar2.f10359i = iVar.f10359i;
                    lVar2.f10360j = iVar.f10360j;
                    lVar2.f10361k = iVar.f10361k;
                    lVar2.f10362l = iVar.f10362l;
                    lVar2.f10363m = iVar.f10363m;
                    lVar2.f10364n = iVar.f10364n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f10366b.add(lVar);
                Object obj2 = lVar.f10375b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
