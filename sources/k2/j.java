package k2;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f13355a;
    public final ArrayList f13356b;
    public float f13357c;
    public float d;
    public float f13358e;
    public float f13359f;
    public float f13360g;
    public float h;
    public float f13361i;
    public final Matrix f13362j;
    public String f13363k;

    public j() {
        this.f13355a = new Matrix();
        this.f13356b = new ArrayList();
        this.f13357c = 0.0f;
        this.d = 0.0f;
        this.f13358e = 0.0f;
        this.f13359f = 1.0f;
        this.f13360g = 1.0f;
        this.h = 0.0f;
        this.f13361i = 0.0f;
        this.f13362j = new Matrix();
        this.f13363k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13356b;
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
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f13356b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f13362j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f13358e);
        matrix.postScale(this.f13359f, this.f13360g);
        matrix.postRotate(this.f13357c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f13361i + this.f13358e);
    }

    public String getGroupName() {
        return this.f13363k;
    }

    public Matrix getLocalMatrix() {
        return this.f13362j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f13358e;
    }

    public float getRotation() {
        return this.f13357c;
    }

    public float getScaleX() {
        return this.f13359f;
    }

    public float getScaleY() {
        return this.f13360g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f13361i;
    }

    public void setPivotX(float f9) {
        if (f9 != this.d) {
            this.d = f9;
            c();
        }
    }

    public void setPivotY(float f9) {
        if (f9 != this.f13358e) {
            this.f13358e = f9;
            c();
        }
    }

    public void setRotation(float f9) {
        if (f9 != this.f13357c) {
            this.f13357c = f9;
            c();
        }
    }

    public void setScaleX(float f9) {
        if (f9 != this.f13359f) {
            this.f13359f = f9;
            c();
        }
    }

    public void setScaleY(float f9) {
        if (f9 != this.f13360g) {
            this.f13360g = f9;
            c();
        }
    }

    public void setTranslateX(float f9) {
        if (f9 != this.h) {
            this.h = f9;
            c();
        }
    }

    public void setTranslateY(float f9) {
        if (f9 != this.f13361i) {
            this.f13361i = f9;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f13355a = new Matrix();
        this.f13356b = new ArrayList();
        this.f13357c = 0.0f;
        this.d = 0.0f;
        this.f13358e = 0.0f;
        this.f13359f = 1.0f;
        this.f13360g = 1.0f;
        this.h = 0.0f;
        this.f13361i = 0.0f;
        Matrix matrix = new Matrix();
        this.f13362j = matrix;
        this.f13363k = null;
        this.f13357c = jVar.f13357c;
        this.d = jVar.d;
        this.f13358e = jVar.f13358e;
        this.f13359f = jVar.f13359f;
        this.f13360g = jVar.f13360g;
        this.h = jVar.h;
        this.f13361i = jVar.f13361i;
        String str = jVar.f13363k;
        this.f13363k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f13362j);
        ArrayList arrayList = jVar.f13356b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f13356b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f13346e = 0.0f;
                    lVar2.f13348g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f13349i = 0.0f;
                    lVar2.f13350j = 1.0f;
                    lVar2.f13351k = 0.0f;
                    lVar2.f13352l = Paint.Cap.BUTT;
                    lVar2.f13353m = Paint.Join.MITER;
                    lVar2.f13354n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.f13346e = iVar.f13346e;
                    lVar2.f13348g = iVar.f13348g;
                    lVar2.f13347f = iVar.f13347f;
                    lVar2.f13366c = iVar.f13366c;
                    lVar2.h = iVar.h;
                    lVar2.f13349i = iVar.f13349i;
                    lVar2.f13350j = iVar.f13350j;
                    lVar2.f13351k = iVar.f13351k;
                    lVar2.f13352l = iVar.f13352l;
                    lVar2.f13353m = iVar.f13353m;
                    lVar2.f13354n = iVar.f13354n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f13356b.add(lVar);
                Object obj2 = lVar.f13365b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
