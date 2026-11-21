package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class we extends TLObject {
    public Matrix B;
    public boolean C;
    public float f27702a;
    public float f27703b;
    public float d;
    public int f27707i;
    public int f27708j;
    public int f27709k;
    public boolean f27710l;
    public float f27711m;
    public float f27712o;
    public Matrix f27713r;
    public int f27714s;
    public int f27715t;
    public boolean f27716u;
    public float v;
    public int f27717z;
    public float f27704c = 1.0f;
    public float f27705e = 1.0f;
    public float f27706f = 1.0f;

    public final we clone() {
        we weVar = new we();
        weVar.f27702a = this.f27702a;
        weVar.f27703b = this.f27703b;
        weVar.f27704c = this.f27704c;
        weVar.d = this.d;
        weVar.f27705e = this.f27705e;
        weVar.f27706f = this.f27706f;
        weVar.f27707i = this.f27707i;
        weVar.f27708j = this.f27708j;
        weVar.f27709k = this.f27709k;
        weVar.f27710l = this.f27710l;
        weVar.f27711m = this.f27711m;
        weVar.f27712o = this.f27712o;
        weVar.f27713r = this.f27713r;
        weVar.f27714s = this.f27714s;
        weVar.f27715t = this.f27715t;
        weVar.f27716u = this.f27716u;
        weVar.v = this.v;
        weVar.f27717z = this.f27717z;
        weVar.C = this.C;
        weVar.B = this.B;
        return weVar;
    }

    public final boolean b() {
        Matrix matrix = this.f27713r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.f27705e == 1.0f && this.f27706f == 1.0f && this.f27704c == 1.0f && this.d == 0.0f && this.f27707i == 0 && this.f27708j == 0 && this.f27709k == 0 && !this.f27710l && this.f27711m == 0.0f && this.f27712o == 0.0f && this.f27714s == 0 && this.f27715t == 0 && !this.f27716u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f27702a = inputSerializedData.readFloat(z10);
        this.f27703b = inputSerializedData.readFloat(z10);
        this.f27704c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.f27705e = inputSerializedData.readFloat(z10);
        this.f27706f = inputSerializedData.readFloat(z10);
        this.f27707i = inputSerializedData.readInt32(z10);
        this.f27708j = inputSerializedData.readInt32(z10);
        this.f27709k = inputSerializedData.readInt32(z10);
        this.f27710l = inputSerializedData.readBool(z10);
        this.f27711m = inputSerializedData.readFloat(z10);
        this.f27712o = inputSerializedData.readFloat(z10);
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            fArr[i7] = inputSerializedData.readFloat(z10);
        }
        Matrix matrix = new Matrix();
        this.f27713r = matrix;
        matrix.setValues(fArr);
        this.f27714s = inputSerializedData.readInt32(z10);
        this.f27715t = inputSerializedData.readInt32(z10);
        this.f27716u = inputSerializedData.readBool(z10);
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
        this.f27717z = inputSerializedData.readInt32(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f27702a);
        outputSerializedData.writeFloat(this.f27703b);
        outputSerializedData.writeFloat(this.f27704c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f27705e);
        outputSerializedData.writeFloat(this.f27706f);
        outputSerializedData.writeInt32(this.f27707i);
        outputSerializedData.writeInt32(this.f27708j);
        outputSerializedData.writeInt32(this.f27709k);
        outputSerializedData.writeBool(this.f27710l);
        outputSerializedData.writeFloat(this.f27711m);
        outputSerializedData.writeFloat(this.f27712o);
        float[] fArr = new float[9];
        Matrix matrix = this.f27713r;
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
        outputSerializedData.writeInt32(this.f27714s);
        outputSerializedData.writeInt32(this.f27715t);
        outputSerializedData.writeBool(this.f27716u);
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
        outputSerializedData.writeInt32(this.f27717z);
    }
}
