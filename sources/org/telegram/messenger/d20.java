package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class d20 extends TLObject {
    public static final int C = 0;
    public MediaCodecPlayer B;
    public int f23493a;
    public boolean f23494b;
    public boolean f23495c;
    public String d;
    public float f23496e = 1.0f;
    public long f23497f = 0;
    public boolean f23498i = true;
    public float f23499j;
    public float f23500k;
    public int f23501l;
    public int f23502m;
    public long f23503o;
    public hi.u f23504r;
    public FloatBuffer f23505s;
    public FloatBuffer f23506t;
    public org.telegram.ui.Components.c6 f23507u;
    public float v;
    public SurfaceTexture f23508z;

    public static ArrayList a(hi.c7 c7Var) {
        if (c7Var != null && c7Var.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < c7Var.T.size(); i7++) {
                hi.c7 c7Var2 = (hi.c7) c7Var.T.get(i7);
                ?? tLObject = new TLObject();
                tLObject.f23496e = 1.0f;
                tLObject.f23497f = 0L;
                tLObject.f23498i = true;
                tLObject.f23494b = c7Var2.K;
                tLObject.f23495c = c7Var2.Y;
                tLObject.d = c7Var2.L.getAbsolutePath();
                tLObject.f23496e = c7Var2.P;
                tLObject.f23498i = c7Var2.U;
                tLObject.f23497f = c7Var2.X;
                tLObject.f23499j = c7Var2.V;
                tLObject.f23500k = c7Var2.W;
                tLObject.f23501l = c7Var2.f14359k0;
                tLObject.f23502m = c7Var2.f14361l0;
                tLObject.f23503o = c7Var2.f14353h0;
                tLObject.f23504r = (hi.u) c7Var.S.f15588e.get(i7);
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
        this.f23493a = readInt32;
        boolean z13 = false;
        if ((readInt32 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23494b = z11;
        if ((readInt32 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f23498i = z12;
        if ((readInt32 & 4) != 0) {
            z13 = true;
        }
        this.f23495c = z13;
        this.d = inputSerializedData.readString(z10);
        this.f23496e = inputSerializedData.readFloat(z10);
        this.f23497f = inputSerializedData.readInt64(z10);
        this.f23499j = inputSerializedData.readFloat(z10);
        this.f23500k = inputSerializedData.readFloat(z10);
        this.f23501l = inputSerializedData.readInt32(z10);
        this.f23502m = inputSerializedData.readInt32(z10);
        this.f23503o = inputSerializedData.readInt64(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        int i10;
        int i11;
        if (this.f23494b) {
            i7 = this.f23493a | 1;
        } else {
            i7 = this.f23493a & (-2);
        }
        this.f23493a = i7;
        if (this.f23498i) {
            i10 = i7 | 2;
        } else {
            i10 = i7 & (-3);
        }
        this.f23493a = i10;
        if (this.f23495c) {
            i11 = i10 | 4;
        } else {
            i11 = i10 & (-5);
        }
        this.f23493a = i11;
        outputSerializedData.writeInt32(i11);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.f23496e);
        outputSerializedData.writeInt64(this.f23497f);
        outputSerializedData.writeFloat(this.f23499j);
        outputSerializedData.writeFloat(this.f23500k);
        outputSerializedData.writeInt32(this.f23501l);
        outputSerializedData.writeInt32(this.f23502m);
        outputSerializedData.writeInt64(this.f23503o);
    }
}
