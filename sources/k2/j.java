package k2;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f9635a;
    public final ArrayList f9636b;
    public float f9637c;
    public float d;
    public float e;
    public float f9638f;
    public float f9639g;
    public float h;
    public float f9640i;
    public final Matrix f9641j;
    public String f9642k;

    public j() {
        this.f9635a = new Matrix();
        this.f9636b = new ArrayList();
        this.f9637c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f9638f = 1.0f;
        this.f9639g = 1.0f;
        this.h = 0.0f;
        this.f9640i = 0.0f;
        this.f9641j = new Matrix();
        this.f9642k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9636b;
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
            ArrayList arrayList = this.f9636b;
            if (i10 < arrayList.size()) {
                z4 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z4;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f9641j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f9638f, this.f9639g);
        matrix.postRotate(this.f9637c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f9640i + this.e);
    }

    public String getGroupName() {
        return this.f9642k;
    }

    public Matrix getLocalMatrix() {
        return this.f9641j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f9637c;
    }

    public float getScaleX() {
        return this.f9638f;
    }

    public float getScaleY() {
        return this.f9639g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f9640i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.d) {
            this.d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.e) {
            this.e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f9637c) {
            this.f9637c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f9638f) {
            this.f9638f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f9639g) {
            this.f9639g = f10;
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
        if (f10 != this.f9640i) {
            this.f9640i = f10;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f9635a = new Matrix();
        this.f9636b = new ArrayList();
        this.f9637c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f9638f = 1.0f;
        this.f9639g = 1.0f;
        this.h = 0.0f;
        this.f9640i = 0.0f;
        Matrix matrix = new Matrix();
        this.f9641j = matrix;
        this.f9642k = null;
        this.f9637c = jVar.f9637c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f9638f = jVar.f9638f;
        this.f9639g = jVar.f9639g;
        this.h = jVar.h;
        this.f9640i = jVar.f9640i;
        String str = jVar.f9642k;
        this.f9642k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f9641j);
        ArrayList arrayList = jVar.f9636b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f9636b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f9628g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f9629i = 0.0f;
                    lVar2.f9630j = 1.0f;
                    lVar2.f9631k = 0.0f;
                    lVar2.f9632l = Paint.Cap.BUTT;
                    lVar2.f9633m = Paint.Join.MITER;
                    lVar2.f9634n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f9628g = iVar.f9628g;
                    lVar2.f9627f = iVar.f9627f;
                    lVar2.f9645c = iVar.f9645c;
                    lVar2.h = iVar.h;
                    lVar2.f9629i = iVar.f9629i;
                    lVar2.f9630j = iVar.f9630j;
                    lVar2.f9631k = iVar.f9631k;
                    lVar2.f9632l = iVar.f9632l;
                    lVar2.f9633m = iVar.f9633m;
                    lVar2.f9634n = iVar.f9634n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f9636b.add(lVar);
                Object obj2 = lVar.f9644b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
