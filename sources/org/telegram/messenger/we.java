package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class we extends TLObject {
    public Matrix B;
    public boolean C;
    public float f27674a;
    public float f27675b;
    public float d;
    public int f27679i;
    public int f27680j;
    public int f27681k;
    public boolean f27682l;
    public float f27683m;
    public float f27684o;
    public Matrix f27685r;
    public int f27686s;
    public int f27687t;
    public boolean f27688u;
    public float v;
    public int f27689z;
    public float f27676c = 1.0f;
    public float f27677e = 1.0f;
    public float f27678f = 1.0f;

    public final we clone() {
        we weVar = new we();
        weVar.f27674a = this.f27674a;
        weVar.f27675b = this.f27675b;
        weVar.f27676c = this.f27676c;
        weVar.d = this.d;
        weVar.f27677e = this.f27677e;
        weVar.f27678f = this.f27678f;
        weVar.f27679i = this.f27679i;
        weVar.f27680j = this.f27680j;
        weVar.f27681k = this.f27681k;
        weVar.f27682l = this.f27682l;
        weVar.f27683m = this.f27683m;
        weVar.f27684o = this.f27684o;
        weVar.f27685r = this.f27685r;
        weVar.f27686s = this.f27686s;
        weVar.f27687t = this.f27687t;
        weVar.f27688u = this.f27688u;
        weVar.v = this.v;
        weVar.f27689z = this.f27689z;
        weVar.C = this.C;
        weVar.B = this.B;
        return weVar;
    }

    public final boolean b() {
        Matrix matrix = this.f27685r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.f27677e == 1.0f && this.f27678f == 1.0f && this.f27676c == 1.0f && this.d == 0.0f && this.f27679i == 0 && this.f27680j == 0 && this.f27681k == 0 && !this.f27682l && this.f27683m == 0.0f && this.f27684o == 0.0f && this.f27686s == 0 && this.f27687t == 0 && !this.f27688u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f27674a = inputSerializedData.readFloat(z10);
        this.f27675b = inputSerializedData.readFloat(z10);
        this.f27676c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.f27677e = inputSerializedData.readFloat(z10);
        this.f27678f = inputSerializedData.readFloat(z10);
        this.f27679i = inputSerializedData.readInt32(z10);
        this.f27680j = inputSerializedData.readInt32(z10);
        this.f27681k = inputSerializedData.readInt32(z10);
        this.f27682l = inputSerializedData.readBool(z10);
        this.f27683m = inputSerializedData.readFloat(z10);
        this.f27684o = inputSerializedData.readFloat(z10);
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            fArr[i7] = inputSerializedData.readFloat(z10);
        }
        Matrix matrix = new Matrix();
        this.f27685r = matrix;
        matrix.setValues(fArr);
        this.f27686s = inputSerializedData.readInt32(z10);
        this.f27687t = inputSerializedData.readInt32(z10);
        this.f27688u = inputSerializedData.readBool(z10);
        this.v = inputSerializedData.readFloat(z10);
        if (inputSerializedData.readInt32(z10) == 178403937) {
            for (int i10 = 0; i10 < 9; i10++) {
                fArr[i10] = inputSerializedData.readFloat(z10);
            }
            Matrix matrix2 = new Matrix();
            this.B = matrix2;
            matrix2.setValues(fArr);
        }
        this.C = inputSerializedData.readBool(z10);
        this.f27689z = inputSerializedData.readInt32(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f27674a);
        outputSerializedData.writeFloat(this.f27675b);
        outputSerializedData.writeFloat(this.f27676c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f27677e);
        outputSerializedData.writeFloat(this.f27678f);
        outputSerializedData.writeInt32(this.f27679i);
        outputSerializedData.writeInt32(this.f27680j);
        outputSerializedData.writeInt32(this.f27681k);
        outputSerializedData.writeBool(this.f27682l);
        outputSerializedData.writeFloat(this.f27683m);
        outputSerializedData.writeFloat(this.f27684o);
        float[] fArr = new float[9];
        Matrix matrix = this.f27685r;
        if (matrix != null) {
            matrix.getValues(fArr);
        } else {
            for (int i7 = 0; i7 < 9; i7++) {
                fArr[i7] = 0.0f;
            }
        }
        for (int i10 = 0; i10 < 9; i10++) {
            outputSerializedData.writeFloat(fArr[i10]);
        }
        outputSerializedData.writeInt32(this.f27686s);
        outputSerializedData.writeInt32(this.f27687t);
        outputSerializedData.writeBool(this.f27688u);
        outputSerializedData.writeFloat(this.v);
        if (this.B == null) {
            outputSerializedData.writeInt32(1450380236);
        } else {
            outputSerializedData.writeInt32(178403937);
            this.B.getValues(fArr);
            for (int i11 = 0; i11 < 9; i11++) {
                outputSerializedData.writeFloat(fArr[i11]);
            }
        }
        outputSerializedData.writeBool(this.C);
        outputSerializedData.writeInt32(this.f27689z);
    }
}
