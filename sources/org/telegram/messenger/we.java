package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class we extends TLObject {
    public Matrix B;
    public boolean C;
    public float f27768a;
    public float f27769b;
    public float d;
    public int f27773i;
    public int f27774j;
    public int f27775k;
    public boolean f27776l;
    public float f27777m;
    public float f27778o;
    public Matrix f27779r;
    public int f27780s;
    public int f27781t;
    public boolean f27782u;
    public float v;
    public int f27783z;
    public float f27770c = 1.0f;
    public float f27771e = 1.0f;
    public float f27772f = 1.0f;

    public final we clone() {
        we weVar = new we();
        weVar.f27768a = this.f27768a;
        weVar.f27769b = this.f27769b;
        weVar.f27770c = this.f27770c;
        weVar.d = this.d;
        weVar.f27771e = this.f27771e;
        weVar.f27772f = this.f27772f;
        weVar.f27773i = this.f27773i;
        weVar.f27774j = this.f27774j;
        weVar.f27775k = this.f27775k;
        weVar.f27776l = this.f27776l;
        weVar.f27777m = this.f27777m;
        weVar.f27778o = this.f27778o;
        weVar.f27779r = this.f27779r;
        weVar.f27780s = this.f27780s;
        weVar.f27781t = this.f27781t;
        weVar.f27782u = this.f27782u;
        weVar.v = this.v;
        weVar.f27783z = this.f27783z;
        weVar.C = this.C;
        weVar.B = this.B;
        return weVar;
    }

    public final boolean b() {
        Matrix matrix = this.f27779r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.f27771e == 1.0f && this.f27772f == 1.0f && this.f27770c == 1.0f && this.d == 0.0f && this.f27773i == 0 && this.f27774j == 0 && this.f27775k == 0 && !this.f27776l && this.f27777m == 0.0f && this.f27778o == 0.0f && this.f27780s == 0 && this.f27781t == 0 && !this.f27782u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f27768a = inputSerializedData.readFloat(z10);
        this.f27769b = inputSerializedData.readFloat(z10);
        this.f27770c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.f27771e = inputSerializedData.readFloat(z10);
        this.f27772f = inputSerializedData.readFloat(z10);
        this.f27773i = inputSerializedData.readInt32(z10);
        this.f27774j = inputSerializedData.readInt32(z10);
        this.f27775k = inputSerializedData.readInt32(z10);
        this.f27776l = inputSerializedData.readBool(z10);
        this.f27777m = inputSerializedData.readFloat(z10);
        this.f27778o = inputSerializedData.readFloat(z10);
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            fArr[i7] = inputSerializedData.readFloat(z10);
        }
        Matrix matrix = new Matrix();
        this.f27779r = matrix;
        matrix.setValues(fArr);
        this.f27780s = inputSerializedData.readInt32(z10);
        this.f27781t = inputSerializedData.readInt32(z10);
        this.f27782u = inputSerializedData.readBool(z10);
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
        this.f27783z = inputSerializedData.readInt32(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f27768a);
        outputSerializedData.writeFloat(this.f27769b);
        outputSerializedData.writeFloat(this.f27770c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f27771e);
        outputSerializedData.writeFloat(this.f27772f);
        outputSerializedData.writeInt32(this.f27773i);
        outputSerializedData.writeInt32(this.f27774j);
        outputSerializedData.writeInt32(this.f27775k);
        outputSerializedData.writeBool(this.f27776l);
        outputSerializedData.writeFloat(this.f27777m);
        outputSerializedData.writeFloat(this.f27778o);
        float[] fArr = new float[9];
        Matrix matrix = this.f27779r;
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
        outputSerializedData.writeInt32(this.f27780s);
        outputSerializedData.writeInt32(this.f27781t);
        outputSerializedData.writeBool(this.f27782u);
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
        outputSerializedData.writeInt32(this.f27783z);
    }
}
