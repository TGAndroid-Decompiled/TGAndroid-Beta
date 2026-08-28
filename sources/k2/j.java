package k2;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f14543a;
    public final ArrayList f14544b;
    public float f14545c;
    public float d;
    public float f14546e;
    public float f14547f;
    public float f14548g;
    public float h;
    public float f14549i;
    public final Matrix f14550j;
    public String f14551k;

    public j() {
        this.f14543a = new Matrix();
        this.f14544b = new ArrayList();
        this.f14545c = 0.0f;
        this.d = 0.0f;
        this.f14546e = 0.0f;
        this.f14547f = 1.0f;
        this.f14548g = 1.0f;
        this.h = 0.0f;
        this.f14549i = 0.0f;
        this.f14550j = new Matrix();
        this.f14551k = null;
    }

    @Override
    public final boolean a() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f14544b;
            if (i9 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i9)).a()) {
                return true;
            }
            i9++;
        }
    }

    @Override
    public final boolean b(int[] iArr) {
        int i9 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f14544b;
            if (i9 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i9)).b(iArr);
                i9++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f14550j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f14546e);
        matrix.postScale(this.f14547f, this.f14548g);
        matrix.postRotate(this.f14545c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f14549i + this.f14546e);
    }

    public String getGroupName() {
        return this.f14551k;
    }

    public Matrix getLocalMatrix() {
        return this.f14550j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f14546e;
    }

    public float getRotation() {
        return this.f14545c;
    }

    public float getScaleX() {
        return this.f14547f;
    }

    public float getScaleY() {
        return this.f14548g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f14549i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.d) {
            this.d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f14546e) {
            this.f14546e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f14545c) {
            this.f14545c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f14547f) {
            this.f14547f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f14548g) {
            this.f14548g = f10;
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
        if (f10 != this.f14549i) {
            this.f14549i = f10;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f14543a = new Matrix();
        this.f14544b = new ArrayList();
        this.f14545c = 0.0f;
        this.d = 0.0f;
        this.f14546e = 0.0f;
        this.f14547f = 1.0f;
        this.f14548g = 1.0f;
        this.h = 0.0f;
        this.f14549i = 0.0f;
        Matrix matrix = new Matrix();
        this.f14550j = matrix;
        this.f14551k = null;
        this.f14545c = jVar.f14545c;
        this.d = jVar.d;
        this.f14546e = jVar.f14546e;
        this.f14547f = jVar.f14547f;
        this.f14548g = jVar.f14548g;
        this.h = jVar.h;
        this.f14549i = jVar.f14549i;
        String str = jVar.f14551k;
        this.f14551k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f14550j);
        ArrayList arrayList = jVar.f14544b;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            Object obj = arrayList.get(i9);
            if (obj instanceof j) {
                this.f14544b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f14534e = 0.0f;
                    lVar2.f14536g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f14537i = 0.0f;
                    lVar2.f14538j = 1.0f;
                    lVar2.f14539k = 0.0f;
                    lVar2.f14540l = Paint.Cap.BUTT;
                    lVar2.f14541m = Paint.Join.MITER;
                    lVar2.f14542n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.f14534e = iVar.f14534e;
                    lVar2.f14536g = iVar.f14536g;
                    lVar2.f14535f = iVar.f14535f;
                    lVar2.f14554c = iVar.f14554c;
                    lVar2.h = iVar.h;
                    lVar2.f14537i = iVar.f14537i;
                    lVar2.f14538j = iVar.f14538j;
                    lVar2.f14539k = iVar.f14539k;
                    lVar2.f14540l = iVar.f14540l;
                    lVar2.f14541m = iVar.f14541m;
                    lVar2.f14542n = iVar.f14542n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f14544b.add(lVar);
                Object obj2 = lVar.f14553b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
