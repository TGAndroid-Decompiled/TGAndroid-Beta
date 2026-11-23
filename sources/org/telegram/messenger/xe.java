package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class xe extends TLObject {
    public Matrix B;
    public boolean C;
    public float f27838a;
    public float f27839b;
    public float d;
    public int f27843i;
    public int f27844j;
    public int f27845k;
    public boolean f27846l;
    public float f27847m;
    public float f27848o;
    public Matrix f27849r;
    public int f27850s;
    public int f27851t;
    public boolean f27852u;
    public float v;
    public int f27853z;
    public float f27840c = 1.0f;
    public float f27841e = 1.0f;
    public float f27842f = 1.0f;

    public final xe clone() {
        xe xeVar = new xe();
        xeVar.f27838a = this.f27838a;
        xeVar.f27839b = this.f27839b;
        xeVar.f27840c = this.f27840c;
        xeVar.d = this.d;
        xeVar.f27841e = this.f27841e;
        xeVar.f27842f = this.f27842f;
        xeVar.f27843i = this.f27843i;
        xeVar.f27844j = this.f27844j;
        xeVar.f27845k = this.f27845k;
        xeVar.f27846l = this.f27846l;
        xeVar.f27847m = this.f27847m;
        xeVar.f27848o = this.f27848o;
        xeVar.f27849r = this.f27849r;
        xeVar.f27850s = this.f27850s;
        xeVar.f27851t = this.f27851t;
        xeVar.f27852u = this.f27852u;
        xeVar.v = this.v;
        xeVar.f27853z = this.f27853z;
        xeVar.C = this.C;
        xeVar.B = this.B;
        return xeVar;
    }

    public final boolean b() {
        Matrix matrix = this.f27849r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.f27841e == 1.0f && this.f27842f == 1.0f && this.f27840c == 1.0f && this.d == 0.0f && this.f27843i == 0 && this.f27844j == 0 && this.f27845k == 0 && !this.f27846l && this.f27847m == 0.0f && this.f27848o == 0.0f && this.f27850s == 0 && this.f27851t == 0 && !this.f27852u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f27838a = inputSerializedData.readFloat(z10);
        this.f27839b = inputSerializedData.readFloat(z10);
        this.f27840c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.f27841e = inputSerializedData.readFloat(z10);
        this.f27842f = inputSerializedData.readFloat(z10);
        this.f27843i = inputSerializedData.readInt32(z10);
        this.f27844j = inputSerializedData.readInt32(z10);
        this.f27845k = inputSerializedData.readInt32(z10);
        this.f27846l = inputSerializedData.readBool(z10);
        this.f27847m = inputSerializedData.readFloat(z10);
        this.f27848o = inputSerializedData.readFloat(z10);
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            fArr[i7] = inputSerializedData.readFloat(z10);
        }
        Matrix matrix = new Matrix();
        this.f27849r = matrix;
        matrix.setValues(fArr);
        this.f27850s = inputSerializedData.readInt32(z10);
        this.f27851t = inputSerializedData.readInt32(z10);
        this.f27852u = inputSerializedData.readBool(z10);
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
        this.f27853z = inputSerializedData.readInt32(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f27838a);
        outputSerializedData.writeFloat(this.f27839b);
        outputSerializedData.writeFloat(this.f27840c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f27841e);
        outputSerializedData.writeFloat(this.f27842f);
        outputSerializedData.writeInt32(this.f27843i);
        outputSerializedData.writeInt32(this.f27844j);
        outputSerializedData.writeInt32(this.f27845k);
        outputSerializedData.writeBool(this.f27846l);
        outputSerializedData.writeFloat(this.f27847m);
        outputSerializedData.writeFloat(this.f27848o);
        float[] fArr = new float[9];
        Matrix matrix = this.f27849r;
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
        outputSerializedData.writeInt32(this.f27850s);
        outputSerializedData.writeInt32(this.f27851t);
        outputSerializedData.writeBool(this.f27852u);
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
        outputSerializedData.writeInt32(this.f27853z);
    }
}
