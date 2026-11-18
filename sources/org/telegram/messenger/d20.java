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
    public int f23468a;
    public boolean f23469b;
    public boolean f23470c;
    public String d;
    public float f23471e = 1.0f;
    public long f23472f = 0;
    public boolean f23473i = true;
    public float f23474j;
    public float f23475k;
    public int f23476l;
    public int f23477m;
    public long f23478o;
    public hi.t f23479r;
    public FloatBuffer f23480s;
    public FloatBuffer f23481t;
    public org.telegram.ui.Components.b6 f23482u;
    public float v;
    public SurfaceTexture f23483z;

    public static ArrayList a(hi.d7 d7Var) {
        if (d7Var != null && d7Var.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < d7Var.T.size(); i7++) {
                hi.d7 d7Var2 = (hi.d7) d7Var.T.get(i7);
                ?? tLObject = new TLObject();
                tLObject.f23471e = 1.0f;
                tLObject.f23472f = 0L;
                tLObject.f23473i = true;
                tLObject.f23469b = d7Var2.K;
                tLObject.f23470c = d7Var2.Y;
                tLObject.d = d7Var2.L.getAbsolutePath();
                tLObject.f23471e = d7Var2.P;
                tLObject.f23473i = d7Var2.U;
                tLObject.f23472f = d7Var2.X;
                tLObject.f23474j = d7Var2.V;
                tLObject.f23475k = d7Var2.W;
                tLObject.f23476l = d7Var2.f14412k0;
                tLObject.f23477m = d7Var2.f14414l0;
                tLObject.f23478o = d7Var2.f14406h0;
                tLObject.f23479r = (hi.t) d7Var.S.f15512e.get(i7);
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
        this.f23468a = readInt32;
        boolean z13 = false;
        if ((readInt32 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23469b = z11;
        if ((readInt32 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f23473i = z12;
        if ((readInt32 & 4) != 0) {
            z13 = true;
        }
        this.f23470c = z13;
        this.d = inputSerializedData.readString(z10);
        this.f23471e = inputSerializedData.readFloat(z10);
        this.f23472f = inputSerializedData.readInt64(z10);
        this.f23474j = inputSerializedData.readFloat(z10);
        this.f23475k = inputSerializedData.readFloat(z10);
        this.f23476l = inputSerializedData.readInt32(z10);
        this.f23477m = inputSerializedData.readInt32(z10);
        this.f23478o = inputSerializedData.readInt64(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        int i10;
        int i11;
        if (this.f23469b) {
            i7 = this.f23468a | 1;
        } else {
            i7 = this.f23468a & (-2);
        }
        this.f23468a = i7;
        if (this.f23473i) {
            i10 = i7 | 2;
        } else {
            i10 = i7 & (-3);
        }
        this.f23468a = i10;
        if (this.f23470c) {
            i11 = i10 | 4;
        } else {
            i11 = i10 & (-5);
        }
        this.f23468a = i11;
        outputSerializedData.writeInt32(i11);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.f23471e);
        outputSerializedData.writeInt64(this.f23472f);
        outputSerializedData.writeFloat(this.f23474j);
        outputSerializedData.writeFloat(this.f23475k);
        outputSerializedData.writeInt32(this.f23476l);
        outputSerializedData.writeInt32(this.f23477m);
        outputSerializedData.writeInt64(this.f23478o);
    }
}
