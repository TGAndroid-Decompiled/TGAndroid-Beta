package k2;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

public final class j extends k {

    public final Matrix f14364a;

    public final ArrayList f14365b;

    public float f14366c;
    public float d;

    public float f14367e;

    public float f14368f;

    public float f14369g;
    public float h;

    public float f14370i;

    public final Matrix f14371j;

    public String f14372k;

    public j() {
        this.f14364a = new Matrix();
        this.f14365b = new ArrayList();
        this.f14366c = 0.0f;
        this.d = 0.0f;
        this.f14367e = 0.0f;
        this.f14368f = 1.0f;
        this.f14369g = 1.0f;
        this.h = 0.0f;
        this.f14370i = 0.0f;
        this.f14371j = new Matrix();
        this.f14372k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14365b;
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
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f14365b;
            if (i10 >= arrayList.size()) {
                return zB;
            }
            zB |= ((k) arrayList.get(i10)).b(iArr);
            i10++;
        }
    }

    public final void c() {
        Matrix matrix = this.f14371j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f14367e);
        matrix.postScale(this.f14368f, this.f14369g);
        matrix.postRotate(this.f14366c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f14370i + this.f14367e);
    }

    public String getGroupName() {
        return this.f14372k;
    }

    public Matrix getLocalMatrix() {
        return this.f14371j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f14367e;
    }

    public float getRotation() {
        return this.f14366c;
    }

    public float getScaleX() {
        return this.f14368f;
    }

    public float getScaleY() {
        return this.f14369g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f14370i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.d) {
            this.d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f14367e) {
            this.f14367e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f14366c) {
            this.f14366c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f14368f) {
            this.f14368f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f14369g) {
            this.f14369g = f10;
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
        if (f10 != this.f14370i) {
            this.f14370i = f10;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l hVar;
        this.f14364a = new Matrix();
        this.f14365b = new ArrayList();
        this.f14366c = 0.0f;
        this.d = 0.0f;
        this.f14367e = 0.0f;
        this.f14368f = 1.0f;
        this.f14369g = 1.0f;
        this.h = 0.0f;
        this.f14370i = 0.0f;
        Matrix matrix = new Matrix();
        this.f14371j = matrix;
        this.f14372k = null;
        this.f14366c = jVar.f14366c;
        this.d = jVar.d;
        this.f14367e = jVar.f14367e;
        this.f14368f = jVar.f14368f;
        this.f14369g = jVar.f14369g;
        this.h = jVar.h;
        this.f14370i = jVar.f14370i;
        String str = jVar.f14372k;
        this.f14372k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f14371j);
        ArrayList arrayList = jVar.f14365b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f14365b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f14355e = 0.0f;
                    iVar2.f14357g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.f14358i = 0.0f;
                    iVar2.f14359j = 1.0f;
                    iVar2.f14360k = 0.0f;
                    iVar2.f14361l = Paint.Cap.BUTT;
                    iVar2.f14362m = Paint.Join.MITER;
                    iVar2.f14363n = 4.0f;
                    iVar2.d = iVar.d;
                    iVar2.f14355e = iVar.f14355e;
                    iVar2.f14357g = iVar.f14357g;
                    iVar2.f14356f = iVar.f14356f;
                    iVar2.f14375c = iVar.f14375c;
                    iVar2.h = iVar.h;
                    iVar2.f14358i = iVar.f14358i;
                    iVar2.f14359j = iVar.f14359j;
                    iVar2.f14360k = iVar.f14360k;
                    iVar2.f14361l = iVar.f14361l;
                    iVar2.f14362m = iVar.f14362m;
                    iVar2.f14363n = iVar.f14363n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f14365b.add(hVar);
                Object obj2 = hVar.f14374b;
                if (obj2 != null) {
                    fVar.put(obj2, hVar);
                }
            }
        }
    }
}
