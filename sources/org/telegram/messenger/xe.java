package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class xe extends TLObject {
    public Matrix B;
    public boolean C;
    public float f27874a;
    public float f27875b;
    public float d;
    public int f27879i;
    public int f27880j;
    public int f27881k;
    public boolean f27882l;
    public float f27883m;
    public float f27884o;
    public Matrix f27885r;
    public int f27886s;
    public int f27887t;
    public boolean f27888u;
    public float v;
    public int f27889z;
    public float f27876c = 1.0f;
    public float f27877e = 1.0f;
    public float f27878f = 1.0f;

    public final xe clone() {
        xe xeVar = new xe();
        xeVar.f27874a = this.f27874a;
        xeVar.f27875b = this.f27875b;
        xeVar.f27876c = this.f27876c;
        xeVar.d = this.d;
        xeVar.f27877e = this.f27877e;
        xeVar.f27878f = this.f27878f;
        xeVar.f27879i = this.f27879i;
        xeVar.f27880j = this.f27880j;
        xeVar.f27881k = this.f27881k;
        xeVar.f27882l = this.f27882l;
        xeVar.f27883m = this.f27883m;
        xeVar.f27884o = this.f27884o;
        xeVar.f27885r = this.f27885r;
        xeVar.f27886s = this.f27886s;
        xeVar.f27887t = this.f27887t;
        xeVar.f27888u = this.f27888u;
        xeVar.v = this.v;
        xeVar.f27889z = this.f27889z;
        xeVar.C = this.C;
        xeVar.B = this.B;
        return xeVar;
    }

    public final boolean b() {
        Matrix matrix = this.f27885r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.f27877e == 1.0f && this.f27878f == 1.0f && this.f27876c == 1.0f && this.d == 0.0f && this.f27879i == 0 && this.f27880j == 0 && this.f27881k == 0 && !this.f27882l && this.f27883m == 0.0f && this.f27884o == 0.0f && this.f27886s == 0 && this.f27887t == 0 && !this.f27888u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f27874a = inputSerializedData.readFloat(z10);
        this.f27875b = inputSerializedData.readFloat(z10);
        this.f27876c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.f27877e = inputSerializedData.readFloat(z10);
        this.f27878f = inputSerializedData.readFloat(z10);
        this.f27879i = inputSerializedData.readInt32(z10);
        this.f27880j = inputSerializedData.readInt32(z10);
        this.f27881k = inputSerializedData.readInt32(z10);
        this.f27882l = inputSerializedData.readBool(z10);
        this.f27883m = inputSerializedData.readFloat(z10);
        this.f27884o = inputSerializedData.readFloat(z10);
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            fArr[i7] = inputSerializedData.readFloat(z10);
        }
        Matrix matrix = new Matrix();
        this.f27885r = matrix;
        matrix.setValues(fArr);
        this.f27886s = inputSerializedData.readInt32(z10);
        this.f27887t = inputSerializedData.readInt32(z10);
        this.f27888u = inputSerializedData.readBool(z10);
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
        this.f27889z = inputSerializedData.readInt32(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f27874a);
        outputSerializedData.writeFloat(this.f27875b);
        outputSerializedData.writeFloat(this.f27876c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f27877e);
        outputSerializedData.writeFloat(this.f27878f);
        outputSerializedData.writeInt32(this.f27879i);
        outputSerializedData.writeInt32(this.f27880j);
        outputSerializedData.writeInt32(this.f27881k);
        outputSerializedData.writeBool(this.f27882l);
        outputSerializedData.writeFloat(this.f27883m);
        outputSerializedData.writeFloat(this.f27884o);
        float[] fArr = new float[9];
        Matrix matrix = this.f27885r;
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
        outputSerializedData.writeInt32(this.f27886s);
        outputSerializedData.writeInt32(this.f27887t);
        outputSerializedData.writeBool(this.f27888u);
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
        outputSerializedData.writeInt32(this.f27889z);
    }
}
