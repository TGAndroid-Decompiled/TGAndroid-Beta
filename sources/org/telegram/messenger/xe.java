package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class xe extends TLObject {
    public Matrix B;
    public boolean C;
    public float f27488a;
    public float f27489b;
    public float d;
    public int f27493i;
    public int f27494j;
    public int f27495k;
    public boolean f27496l;
    public float f27497m;
    public float f27498o;
    public Matrix f27499r;
    public int f27500s;
    public int f27501t;
    public boolean f27502u;
    public float v;
    public int f27503z;
    public float f27490c = 1.0f;
    public float f27491e = 1.0f;
    public float f27492f = 1.0f;

    public final xe clone() {
        xe xeVar = new xe();
        xeVar.f27488a = this.f27488a;
        xeVar.f27489b = this.f27489b;
        xeVar.f27490c = this.f27490c;
        xeVar.d = this.d;
        xeVar.f27491e = this.f27491e;
        xeVar.f27492f = this.f27492f;
        xeVar.f27493i = this.f27493i;
        xeVar.f27494j = this.f27494j;
        xeVar.f27495k = this.f27495k;
        xeVar.f27496l = this.f27496l;
        xeVar.f27497m = this.f27497m;
        xeVar.f27498o = this.f27498o;
        xeVar.f27499r = this.f27499r;
        xeVar.f27500s = this.f27500s;
        xeVar.f27501t = this.f27501t;
        xeVar.f27502u = this.f27502u;
        xeVar.v = this.v;
        xeVar.f27503z = this.f27503z;
        xeVar.C = this.C;
        xeVar.B = this.B;
        return xeVar;
    }

    public final boolean b() {
        Matrix matrix = this.f27499r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.f27491e == 1.0f && this.f27492f == 1.0f && this.f27490c == 1.0f && this.d == 0.0f && this.f27493i == 0 && this.f27494j == 0 && this.f27495k == 0 && !this.f27496l && this.f27497m == 0.0f && this.f27498o == 0.0f && this.f27500s == 0 && this.f27501t == 0 && !this.f27502u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f27488a = inputSerializedData.readFloat(z10);
        this.f27489b = inputSerializedData.readFloat(z10);
        this.f27490c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.f27491e = inputSerializedData.readFloat(z10);
        this.f27492f = inputSerializedData.readFloat(z10);
        this.f27493i = inputSerializedData.readInt32(z10);
        this.f27494j = inputSerializedData.readInt32(z10);
        this.f27495k = inputSerializedData.readInt32(z10);
        this.f27496l = inputSerializedData.readBool(z10);
        this.f27497m = inputSerializedData.readFloat(z10);
        this.f27498o = inputSerializedData.readFloat(z10);
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            fArr[i7] = inputSerializedData.readFloat(z10);
        }
        Matrix matrix = new Matrix();
        this.f27499r = matrix;
        matrix.setValues(fArr);
        this.f27500s = inputSerializedData.readInt32(z10);
        this.f27501t = inputSerializedData.readInt32(z10);
        this.f27502u = inputSerializedData.readBool(z10);
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
        this.f27503z = inputSerializedData.readInt32(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f27488a);
        outputSerializedData.writeFloat(this.f27489b);
        outputSerializedData.writeFloat(this.f27490c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f27491e);
        outputSerializedData.writeFloat(this.f27492f);
        outputSerializedData.writeInt32(this.f27493i);
        outputSerializedData.writeInt32(this.f27494j);
        outputSerializedData.writeInt32(this.f27495k);
        outputSerializedData.writeBool(this.f27496l);
        outputSerializedData.writeFloat(this.f27497m);
        outputSerializedData.writeFloat(this.f27498o);
        float[] fArr = new float[9];
        Matrix matrix = this.f27499r;
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
        outputSerializedData.writeInt32(this.f27500s);
        outputSerializedData.writeInt32(this.f27501t);
        outputSerializedData.writeBool(this.f27502u);
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
        outputSerializedData.writeInt32(this.f27503z);
    }
}
