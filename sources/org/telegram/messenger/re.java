package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class re extends TLObject {
    public Matrix B;
    public boolean C;
    public float f25110a;
    public float f25111b;
    public float d;
    public int f25115i;
    public int f25116j;
    public int f25117k;
    public boolean f25118l;
    public float f25119m;
    public float f25120o;
    public Matrix f25121r;
    public int f25122s;
    public int f25123t;
    public boolean f25124u;
    public float v;
    public int f25125z;
    public float f25112c = 1.0f;
    public float f25113e = 1.0f;
    public float f25114f = 1.0f;

    public final re clone() {
        re reVar = new re();
        reVar.f25110a = this.f25110a;
        reVar.f25111b = this.f25111b;
        reVar.f25112c = this.f25112c;
        reVar.d = this.d;
        reVar.f25113e = this.f25113e;
        reVar.f25114f = this.f25114f;
        reVar.f25115i = this.f25115i;
        reVar.f25116j = this.f25116j;
        reVar.f25117k = this.f25117k;
        reVar.f25118l = this.f25118l;
        reVar.f25119m = this.f25119m;
        reVar.f25120o = this.f25120o;
        reVar.f25121r = this.f25121r;
        reVar.f25122s = this.f25122s;
        reVar.f25123t = this.f25123t;
        reVar.f25124u = this.f25124u;
        reVar.v = this.v;
        reVar.f25125z = this.f25125z;
        reVar.C = this.C;
        reVar.B = this.B;
        return reVar;
    }

    public final boolean b() {
        Matrix matrix = this.f25121r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.f25113e == 1.0f && this.f25114f == 1.0f && this.f25112c == 1.0f && this.d == 0.0f && this.f25115i == 0 && this.f25116j == 0 && this.f25117k == 0 && !this.f25118l && this.f25119m == 0.0f && this.f25120o == 0.0f && this.f25122s == 0 && this.f25123t == 0 && !this.f25124u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f25110a = inputSerializedData.readFloat(z10);
        this.f25111b = inputSerializedData.readFloat(z10);
        this.f25112c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.f25113e = inputSerializedData.readFloat(z10);
        this.f25114f = inputSerializedData.readFloat(z10);
        this.f25115i = inputSerializedData.readInt32(z10);
        this.f25116j = inputSerializedData.readInt32(z10);
        this.f25117k = inputSerializedData.readInt32(z10);
        this.f25118l = inputSerializedData.readBool(z10);
        this.f25119m = inputSerializedData.readFloat(z10);
        this.f25120o = inputSerializedData.readFloat(z10);
        float[] fArr = new float[9];
        for (int i3 = 0; i3 < 9; i3++) {
            fArr[i3] = inputSerializedData.readFloat(z10);
        }
        Matrix matrix = new Matrix();
        this.f25121r = matrix;
        matrix.setValues(fArr);
        this.f25122s = inputSerializedData.readInt32(z10);
        this.f25123t = inputSerializedData.readInt32(z10);
        this.f25124u = inputSerializedData.readBool(z10);
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
        this.f25125z = inputSerializedData.readInt32(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f25110a);
        outputSerializedData.writeFloat(this.f25111b);
        outputSerializedData.writeFloat(this.f25112c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f25113e);
        outputSerializedData.writeFloat(this.f25114f);
        outputSerializedData.writeInt32(this.f25115i);
        outputSerializedData.writeInt32(this.f25116j);
        outputSerializedData.writeInt32(this.f25117k);
        outputSerializedData.writeBool(this.f25118l);
        outputSerializedData.writeFloat(this.f25119m);
        outputSerializedData.writeFloat(this.f25120o);
        float[] fArr = new float[9];
        Matrix matrix = this.f25121r;
        if (matrix != null) {
            matrix.getValues(fArr);
        } else {
            for (int i3 = 0; i3 < 9; i3++) {
                fArr[i3] = 0.0f;
            }
        }
        for (int i10 = 0; i10 < 9; i10++) {
            outputSerializedData.writeFloat(fArr[i10]);
        }
        outputSerializedData.writeInt32(this.f25122s);
        outputSerializedData.writeInt32(this.f25123t);
        outputSerializedData.writeBool(this.f25124u);
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
        outputSerializedData.writeInt32(this.f25125z);
    }
}
