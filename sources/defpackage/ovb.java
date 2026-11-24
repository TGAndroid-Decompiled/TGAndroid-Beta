package defpackage;

import android.opengl.Matrix;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class ovb implements lv8 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    public ovb(Set set, qt qtVar, String str, String str2, ija ijaVar) {
        Set unmodifiableSet;
        if (set == null) {
            unmodifiableSet = Collections.EMPTY_SET;
        } else {
            unmodifiableSet = DesugarCollections.unmodifiableSet(set);
        }
        this.a = unmodifiableSet;
        qt qtVar2 = qtVar == null ? Collections.EMPTY_MAP : qtVar;
        this.c = qtVar2;
        this.d = str;
        this.e = str2;
        this.f = ijaVar == null ? ija.a : ijaVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = qtVar2.values().iterator();
        if (!it.hasNext()) {
            this.b = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw kt6.l(it);
    }

    public final void a(int i, int i2, float f, float f2, boolean z, float[] fArr) {
        float f3;
        float f4;
        float[] fArr2 = (float[]) this.d;
        float[] fArr3 = (float[]) this.c;
        float[] fArr4 = (float[]) this.b;
        float[] fArr5 = (float[]) this.a;
        float f5 = (i - i2) / 0.3902439f;
        if (f5 <= 0.0f || f5 > i) {
            f5 = i;
        }
        Matrix.perspectiveM(fArr5, 0, (float) Math.toDegrees(Math.atan(0.09100712590841677d * (i2 / Math.max(1.0f, f5 / 1.64f))) * 2.0d), i / Math.max(1, i2), 0.1f, 20.0f);
        Matrix.setLookAtM(fArr4, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f2, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM(fArr2, 0, fArr4, 0, fArr3, 0);
        Matrix.multiplyMM((float[]) this.e, 0, fArr5, 0, fArr2, 0);
        if (z) {
            f3 = 0.0125f;
            f4 = 1.0f;
        } else {
            f3 = -0.0125f;
            f4 = -1.0f;
        }
        float f6 = -f4;
        b(f3, 0.618561f, f4, i, i2, fArr, 0);
        b(f3, 0.618561f, f6, i, i2, fArr, 2);
        b(f3, -0.593561f, f6, i, i2, fArr, 4);
        b(f3, -0.593561f, f4, i, i2, fArr, 6);
    }

    public final float b(float f, float f2, float f3, int i, int i2, float[] fArr, int i3) {
        float[] fArr2 = (float[]) this.f;
        fArr2[0] = f;
        fArr2[1] = f2;
        fArr2[2] = f3;
        fArr2[3] = 1.0f;
        float[] fArr3 = (float[]) this.h;
        Matrix.multiplyMV(fArr3, 0, (float[]) this.e, 0, fArr2, 0);
        float f4 = 1.0f / fArr3[3];
        fArr[i3] = b10.w(fArr3[0], f4, 0.5f, 0.5f) * i;
        fArr[i3 + 1] = aq1.v(fArr3[1], f4, 0.5f, 0.5f) * i2;
        return fArr3[2] * f4;
    }

    @Override
    public final Object mo8get() {
        return new hia((l9a) ((lv8) this.a).mo8get(), (j8a) ((lv8) this.b).mo8get(), (i8a) ((lv8) this.c).mo8get(), (tpb) ((lv8) this.d).mo8get(), (h83) ((lv8) this.e).mo8get(), (zm8) ((lv8) this.f).mo8get(), (cy2) ((lq5) this.h).a);
    }

    public ovb() {
        this.a = new float[16];
        this.b = new float[16];
        this.c = new float[16];
        this.d = new float[16];
        this.e = new float[16];
        this.f = new float[4];
        this.h = new float[4];
    }
}
