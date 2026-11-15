package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class xe extends TLObject {
    public Matrix B;
    public boolean C;
    public float f27489a;
    public float f27490b;
    public float d;
    public int f27494i;
    public int f27495j;
    public int f27496k;
    public boolean f27497l;
    public float f27498m;
    public float f27499o;
    public Matrix f27500r;
    public int f27501s;
    public int f27502t;
    public boolean f27503u;
    public float v;
    public int f27504z;
    public float f27491c = 1.0f;
    public float f27492e = 1.0f;
    public float f27493f = 1.0f;

    public final xe clone() {
        xe xeVar = new xe();
        xeVar.f27489a = this.f27489a;
        xeVar.f27490b = this.f27490b;
        xeVar.f27491c = this.f27491c;
        xeVar.d = this.d;
        xeVar.f27492e = this.f27492e;
        xeVar.f27493f = this.f27493f;
        xeVar.f27494i = this.f27494i;
        xeVar.f27495j = this.f27495j;
        xeVar.f27496k = this.f27496k;
        xeVar.f27497l = this.f27497l;
        xeVar.f27498m = this.f27498m;
        xeVar.f27499o = this.f27499o;
        xeVar.f27500r = this.f27500r;
        xeVar.f27501s = this.f27501s;
        xeVar.f27502t = this.f27502t;
        xeVar.f27503u = this.f27503u;
        xeVar.v = this.v;
        xeVar.f27504z = this.f27504z;
        xeVar.C = this.C;
        xeVar.B = this.B;
        return xeVar;
    }

    public final boolean b() {
        Matrix matrix = this.f27500r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.f27492e == 1.0f && this.f27493f == 1.0f && this.f27491c == 1.0f && this.d == 0.0f && this.f27494i == 0 && this.f27495j == 0 && this.f27496k == 0 && !this.f27497l && this.f27498m == 0.0f && this.f27499o == 0.0f && this.f27501s == 0 && this.f27502t == 0 && !this.f27503u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f27489a = inputSerializedData.readFloat(z10);
        this.f27490b = inputSerializedData.readFloat(z10);
        this.f27491c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.f27492e = inputSerializedData.readFloat(z10);
        this.f27493f = inputSerializedData.readFloat(z10);
        this.f27494i = inputSerializedData.readInt32(z10);
        this.f27495j = inputSerializedData.readInt32(z10);
        this.f27496k = inputSerializedData.readInt32(z10);
        this.f27497l = inputSerializedData.readBool(z10);
        this.f27498m = inputSerializedData.readFloat(z10);
        this.f27499o = inputSerializedData.readFloat(z10);
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            fArr[i7] = inputSerializedData.readFloat(z10);
        }
        Matrix matrix = new Matrix();
        this.f27500r = matrix;
        matrix.setValues(fArr);
        this.f27501s = inputSerializedData.readInt32(z10);
        this.f27502t = inputSerializedData.readInt32(z10);
        this.f27503u = inputSerializedData.readBool(z10);
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
        this.f27504z = inputSerializedData.readInt32(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f27489a);
        outputSerializedData.writeFloat(this.f27490b);
        outputSerializedData.writeFloat(this.f27491c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f27492e);
        outputSerializedData.writeFloat(this.f27493f);
        outputSerializedData.writeInt32(this.f27494i);
        outputSerializedData.writeInt32(this.f27495j);
        outputSerializedData.writeInt32(this.f27496k);
        outputSerializedData.writeBool(this.f27497l);
        outputSerializedData.writeFloat(this.f27498m);
        outputSerializedData.writeFloat(this.f27499o);
        float[] fArr = new float[9];
        Matrix matrix = this.f27500r;
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
        outputSerializedData.writeInt32(this.f27501s);
        outputSerializedData.writeInt32(this.f27502t);
        outputSerializedData.writeBool(this.f27503u);
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
        outputSerializedData.writeInt32(this.f27504z);
    }
}
