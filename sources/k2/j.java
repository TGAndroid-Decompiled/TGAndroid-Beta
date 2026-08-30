package k2;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f9654a;
    public final ArrayList f9655b;
    public float f9656c;
    public float d;
    public float e;
    public float f9657f;
    public float f9658g;
    public float h;
    public float f9659i;
    public final Matrix f9660j;
    public String f9661k;

    public j() {
        this.f9654a = new Matrix();
        this.f9655b = new ArrayList();
        this.f9656c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f9657f = 1.0f;
        this.f9658g = 1.0f;
        this.h = 0.0f;
        this.f9659i = 0.0f;
        this.f9660j = new Matrix();
        this.f9661k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9655b;
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
            ArrayList arrayList = this.f9655b;
            if (i10 < arrayList.size()) {
                z4 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z4;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f9660j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f9657f, this.f9658g);
        matrix.postRotate(this.f9656c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f9659i + this.e);
    }

    public String getGroupName() {
        return this.f9661k;
    }

    public Matrix getLocalMatrix() {
        return this.f9660j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f9656c;
    }

    public float getScaleX() {
        return this.f9657f;
    }

    public float getScaleY() {
        return this.f9658g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f9659i;
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
        if (f10 != this.f9656c) {
            this.f9656c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f9657f) {
            this.f9657f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f9658g) {
            this.f9658g = f10;
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
        if (f10 != this.f9659i) {
            this.f9659i = f10;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f9654a = new Matrix();
        this.f9655b = new ArrayList();
        this.f9656c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f9657f = 1.0f;
        this.f9658g = 1.0f;
        this.h = 0.0f;
        this.f9659i = 0.0f;
        Matrix matrix = new Matrix();
        this.f9660j = matrix;
        this.f9661k = null;
        this.f9656c = jVar.f9656c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f9657f = jVar.f9657f;
        this.f9658g = jVar.f9658g;
        this.h = jVar.h;
        this.f9659i = jVar.f9659i;
        String str = jVar.f9661k;
        this.f9661k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f9660j);
        ArrayList arrayList = jVar.f9655b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f9655b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f9647g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f9648i = 0.0f;
                    lVar2.f9649j = 1.0f;
                    lVar2.f9650k = 0.0f;
                    lVar2.f9651l = Paint.Cap.BUTT;
                    lVar2.f9652m = Paint.Join.MITER;
                    lVar2.f9653n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f9647g = iVar.f9647g;
                    lVar2.f9646f = iVar.f9646f;
                    lVar2.f9664c = iVar.f9664c;
                    lVar2.h = iVar.h;
                    lVar2.f9648i = iVar.f9648i;
                    lVar2.f9649j = iVar.f9649j;
                    lVar2.f9650k = iVar.f9650k;
                    lVar2.f9651l = iVar.f9651l;
                    lVar2.f9652m = iVar.f9652m;
                    lVar2.f9653n = iVar.f9653n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f9655b.add(lVar);
                Object obj2 = lVar.f9663b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
