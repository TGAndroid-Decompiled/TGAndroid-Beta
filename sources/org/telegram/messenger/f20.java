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
    public int f23419a;
    public boolean f23420b;
    public boolean f23421c;
    public String d;
    public float f23422e = 1.0f;
    public long f23423f = 0;
    public boolean f23424i = true;
    public float f23425j;
    public float f23426k;
    public int f23427l;
    public int f23428m;
    public long f23429o;
    public hi.s f23430r;
    public FloatBuffer f23431s;
    public FloatBuffer f23432t;
    public org.telegram.ui.Components.t5 f23433u;
    public float v;
    public SurfaceTexture f23434z;

    public static ArrayList a(hi.d7 d7Var) {
        if (d7Var != null && d7Var.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < d7Var.T.size(); i7++) {
                hi.d7 d7Var2 = (hi.d7) d7Var.T.get(i7);
                ?? tLObject = new TLObject();
                tLObject.f23422e = 1.0f;
                tLObject.f23423f = 0L;
                tLObject.f23424i = true;
                tLObject.f23420b = d7Var2.K;
                tLObject.f23421c = d7Var2.Y;
                tLObject.d = d7Var2.L.getAbsolutePath();
                tLObject.f23422e = d7Var2.P;
                tLObject.f23424i = d7Var2.U;
                tLObject.f23423f = d7Var2.X;
                tLObject.f23425j = d7Var2.V;
                tLObject.f23426k = d7Var2.W;
                tLObject.f23427l = d7Var2.f14147k0;
                tLObject.f23428m = d7Var2.f14149l0;
                tLObject.f23429o = d7Var2.f14141h0;
                tLObject.f23430r = (hi.s) d7Var.S.f15124e.get(i7);
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
        this.f23419a = readInt32;
        boolean z13 = false;
        if ((readInt32 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23420b = z11;
        if ((readInt32 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f23424i = z12;
        if ((readInt32 & 4) != 0) {
            z13 = true;
        }
        this.f23421c = z13;
        this.d = inputSerializedData.readString(z10);
        this.f23422e = inputSerializedData.readFloat(z10);
        this.f23423f = inputSerializedData.readInt64(z10);
        this.f23425j = inputSerializedData.readFloat(z10);
        this.f23426k = inputSerializedData.readFloat(z10);
        this.f23427l = inputSerializedData.readInt32(z10);
        this.f23428m = inputSerializedData.readInt32(z10);
        this.f23429o = inputSerializedData.readInt64(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        int i10;
        int i11;
        if (this.f23420b) {
            i7 = this.f23419a | 1;
        } else {
            i7 = this.f23419a & (-2);
        }
        this.f23419a = i7;
        if (this.f23424i) {
            i10 = i7 | 2;
        } else {
            i10 = i7 & (-3);
        }
        this.f23419a = i10;
        if (this.f23421c) {
            i11 = i10 | 4;
        } else {
            i11 = i10 & (-5);
        }
        this.f23419a = i11;
        outputSerializedData.writeInt32(i11);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.f23422e);
        outputSerializedData.writeInt64(this.f23423f);
        outputSerializedData.writeFloat(this.f23425j);
        outputSerializedData.writeFloat(this.f23426k);
        outputSerializedData.writeInt32(this.f23427l);
        outputSerializedData.writeInt32(this.f23428m);
        outputSerializedData.writeInt64(this.f23429o);
    }
}
