package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class f20 extends TLObject {
    public static final int C = 0;
    public MediaCodecPlayer B;
    public int f23422a;
    public boolean f23423b;
    public boolean f23424c;
    public String d;
    public float f23425e = 1.0f;
    public long f23426f = 0;
    public boolean f23427i = true;
    public float f23428j;
    public float f23429k;
    public int f23430l;
    public int f23431m;
    public long f23432o;
    public hi.s f23433r;
    public FloatBuffer f23434s;
    public FloatBuffer f23435t;
    public org.telegram.ui.Components.t5 f23436u;
    public float v;
    public SurfaceTexture f23437z;

    public static ArrayList a(hi.d7 d7Var) {
        if (d7Var != null && d7Var.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < d7Var.T.size(); i7++) {
                hi.d7 d7Var2 = (hi.d7) d7Var.T.get(i7);
                ?? tLObject = new TLObject();
                tLObject.f23425e = 1.0f;
                tLObject.f23426f = 0L;
                tLObject.f23427i = true;
                tLObject.f23423b = d7Var2.K;
                tLObject.f23424c = d7Var2.Y;
                tLObject.d = d7Var2.L.getAbsolutePath();
                tLObject.f23425e = d7Var2.P;
                tLObject.f23427i = d7Var2.U;
                tLObject.f23426f = d7Var2.X;
                tLObject.f23428j = d7Var2.V;
                tLObject.f23429k = d7Var2.W;
                tLObject.f23430l = d7Var2.f14147k0;
                tLObject.f23431m = d7Var2.f14149l0;
                tLObject.f23432o = d7Var2.f14141h0;
                tLObject.f23433r = (hi.s) d7Var.S.f15124e.get(i7);
                arrayList.add(tLObject);
            }
            return arrayList;
        }
        return null;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        boolean z12;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f23422a = readInt32;
        boolean z13 = false;
        if ((readInt32 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23423b = z11;
        if ((readInt32 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f23427i = z12;
        if ((readInt32 & 4) != 0) {
            z13 = true;
        }
        this.f23424c = z13;
        this.d = inputSerializedData.readString(z10);
        this.f23425e = inputSerializedData.readFloat(z10);
        this.f23426f = inputSerializedData.readInt64(z10);
        this.f23428j = inputSerializedData.readFloat(z10);
        this.f23429k = inputSerializedData.readFloat(z10);
        this.f23430l = inputSerializedData.readInt32(z10);
        this.f23431m = inputSerializedData.readInt32(z10);
        this.f23432o = inputSerializedData.readInt64(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        int i10;
        int i11;
        if (this.f23423b) {
            i7 = this.f23422a | 1;
        } else {
            i7 = this.f23422a & (-2);
        }
        this.f23422a = i7;
        if (this.f23427i) {
            i10 = i7 | 2;
        } else {
            i10 = i7 & (-3);
        }
        this.f23422a = i10;
        if (this.f23424c) {
            i11 = i10 | 4;
        } else {
            i11 = i10 & (-5);
        }
        this.f23422a = i11;
        outputSerializedData.writeInt32(i11);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.f23425e);
        outputSerializedData.writeInt64(this.f23426f);
        outputSerializedData.writeFloat(this.f23428j);
        outputSerializedData.writeFloat(this.f23429k);
        outputSerializedData.writeInt32(this.f23430l);
        outputSerializedData.writeInt32(this.f23431m);
        outputSerializedData.writeInt64(this.f23432o);
    }
}
