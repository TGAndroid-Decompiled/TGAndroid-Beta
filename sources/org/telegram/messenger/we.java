package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class we extends TLObject {
    public Matrix B;
    public boolean C;
    public float f27676a;
    public float f27677b;
    public float d;
    public int f27681i;
    public int f27682j;
    public int f27683k;
    public boolean f27684l;
    public float f27685m;
    public float f27686o;
    public Matrix f27687r;
    public int f27688s;
    public int f27689t;
    public boolean f27690u;
    public float v;
    public int f27691z;
    public float f27678c = 1.0f;
    public float f27679e = 1.0f;
    public float f27680f = 1.0f;

    public final we clone() {
        we weVar = new we();
        weVar.f27676a = this.f27676a;
        weVar.f27677b = this.f27677b;
        weVar.f27678c = this.f27678c;
        weVar.d = this.d;
        weVar.f27679e = this.f27679e;
        weVar.f27680f = this.f27680f;
        weVar.f27681i = this.f27681i;
        weVar.f27682j = this.f27682j;
        weVar.f27683k = this.f27683k;
        weVar.f27684l = this.f27684l;
        weVar.f27685m = this.f27685m;
        weVar.f27686o = this.f27686o;
        weVar.f27687r = this.f27687r;
        weVar.f27688s = this.f27688s;
        weVar.f27689t = this.f27689t;
        weVar.f27690u = this.f27690u;
        weVar.v = this.v;
        weVar.f27691z = this.f27691z;
        weVar.C = this.C;
        weVar.B = this.B;
        return weVar;
    }

    public final boolean b() {
        Matrix matrix = this.f27687r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.f27679e == 1.0f && this.f27680f == 1.0f && this.f27678c == 1.0f && this.d == 0.0f && this.f27681i == 0 && this.f27682j == 0 && this.f27683k == 0 && !this.f27684l && this.f27685m == 0.0f && this.f27686o == 0.0f && this.f27688s == 0 && this.f27689t == 0 && !this.f27690u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f27676a = inputSerializedData.readFloat(z10);
        this.f27677b = inputSerializedData.readFloat(z10);
        this.f27678c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.f27679e = inputSerializedData.readFloat(z10);
        this.f27680f = inputSerializedData.readFloat(z10);
        this.f27681i = inputSerializedData.readInt32(z10);
        this.f27682j = inputSerializedData.readInt32(z10);
        this.f27683k = inputSerializedData.readInt32(z10);
        this.f27684l = inputSerializedData.readBool(z10);
        this.f27685m = inputSerializedData.readFloat(z10);
        this.f27686o = inputSerializedData.readFloat(z10);
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            fArr[i7] = inputSerializedData.readFloat(z10);
        }
        Matrix matrix = new Matrix();
        this.f27687r = matrix;
        matrix.setValues(fArr);
        this.f27688s = inputSerializedData.readInt32(z10);
        this.f27689t = inputSerializedData.readInt32(z10);
        this.f27690u = inputSerializedData.readBool(z10);
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
        this.f27691z = inputSerializedData.readInt32(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f27676a);
        outputSerializedData.writeFloat(this.f27677b);
        outputSerializedData.writeFloat(this.f27678c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f27679e);
        outputSerializedData.writeFloat(this.f27680f);
        outputSerializedData.writeInt32(this.f27681i);
        outputSerializedData.writeInt32(this.f27682j);
        outputSerializedData.writeInt32(this.f27683k);
        outputSerializedData.writeBool(this.f27684l);
        outputSerializedData.writeFloat(this.f27685m);
        outputSerializedData.writeFloat(this.f27686o);
        float[] fArr = new float[9];
        Matrix matrix = this.f27687r;
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
        outputSerializedData.writeInt32(this.f27688s);
        outputSerializedData.writeInt32(this.f27689t);
        outputSerializedData.writeBool(this.f27690u);
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
        outputSerializedData.writeInt32(this.f27691z);
    }
}
