package defpackage;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class ao6 extends TLObject {
    public Matrix B;
    public boolean C;
    public float a;
    public float b;
    public float d;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public float m;
    public float o;
    public Matrix r;
    public int s;
    public int t;
    public boolean u;
    public float v;
    public int z;
    public float c = 1.0f;
    public float e = 1.0f;
    public float f = 1.0f;

    public final ao6 clone() {
        ao6 ao6Var = new ao6();
        ao6Var.a = this.a;
        ao6Var.b = this.b;
        ao6Var.c = this.c;
        ao6Var.d = this.d;
        ao6Var.e = this.e;
        ao6Var.f = this.f;
        ao6Var.i = this.i;
        ao6Var.j = this.j;
        ao6Var.k = this.k;
        ao6Var.l = this.l;
        ao6Var.m = this.m;
        ao6Var.o = this.o;
        ao6Var.r = this.r;
        ao6Var.s = this.s;
        ao6Var.t = this.t;
        ao6Var.u = this.u;
        ao6Var.v = this.v;
        ao6Var.z = this.z;
        ao6Var.C = this.C;
        ao6Var.B = this.B;
        return ao6Var;
    }

    public final boolean b() {
        Matrix matrix = this.r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.e == 1.0f && this.f == 1.0f && this.c == 1.0f && this.d == 0.0f && this.i == 0 && this.j == 0 && this.k == 0 && !this.l && this.m == 0.0f && this.o == 0.0f && this.s == 0 && this.t == 0 && !this.u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        this.a = inputSerializedData.readFloat(z);
        this.b = inputSerializedData.readFloat(z);
        this.c = inputSerializedData.readFloat(z);
        this.d = inputSerializedData.readFloat(z);
        this.e = inputSerializedData.readFloat(z);
        this.f = inputSerializedData.readFloat(z);
        this.i = inputSerializedData.readInt32(z);
        this.j = inputSerializedData.readInt32(z);
        this.k = inputSerializedData.readInt32(z);
        this.l = inputSerializedData.readBool(z);
        this.m = inputSerializedData.readFloat(z);
        this.o = inputSerializedData.readFloat(z);
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            fArr[i] = inputSerializedData.readFloat(z);
        }
        Matrix matrix = new Matrix();
        this.r = matrix;
        matrix.setValues(fArr);
        this.s = inputSerializedData.readInt32(z);
        this.t = inputSerializedData.readInt32(z);
        this.u = inputSerializedData.readBool(z);
        this.v = inputSerializedData.readFloat(z);
        if (inputSerializedData.readInt32(z) == 178403937) {
            for (int i2 = 0; i2 < 9; i2++) {
                fArr[i2] = inputSerializedData.readFloat(z);
            }
            Matrix matrix2 = new Matrix();
            this.B = matrix2;
            matrix2.setValues(fArr);
        }
        this.C = inputSerializedData.readBool(z);
        this.z = inputSerializedData.readInt32(z);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.a);
        outputSerializedData.writeFloat(this.b);
        outputSerializedData.writeFloat(this.c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.e);
        outputSerializedData.writeFloat(this.f);
        outputSerializedData.writeInt32(this.i);
        outputSerializedData.writeInt32(this.j);
        outputSerializedData.writeInt32(this.k);
        outputSerializedData.writeBool(this.l);
        outputSerializedData.writeFloat(this.m);
        outputSerializedData.writeFloat(this.o);
        float[] fArr = new float[9];
        Matrix matrix = this.r;
        if (matrix != null) {
            matrix.getValues(fArr);
        } else {
            for (int i = 0; i < 9; i++) {
                fArr[i] = 0.0f;
            }
        }
        for (int i2 = 0; i2 < 9; i2++) {
            outputSerializedData.writeFloat(fArr[i2]);
        }
        outputSerializedData.writeInt32(this.s);
        outputSerializedData.writeInt32(this.t);
        outputSerializedData.writeBool(this.u);
        outputSerializedData.writeFloat(this.v);
        if (this.B == null) {
            outputSerializedData.writeInt32(1450380236);
        } else {
            outputSerializedData.writeInt32(178403937);
            this.B.getValues(fArr);
            for (int i3 = 0; i3 < 9; i3++) {
                outputSerializedData.writeFloat(fArr[i3]);
            }
        }
        outputSerializedData.writeBool(this.C);
        outputSerializedData.writeInt32(this.z);
    }
}
