package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class c20 extends TLObject {
    public static final int C = 0;
    public MediaCodecPlayer B;
    public int f23354a;
    public boolean f23355b;
    public boolean f23356c;
    public String d;
    public float f23357e = 1.0f;
    public long f23358f = 0;
    public boolean f23359i = true;
    public float f23360j;
    public float f23361k;
    public int f23362l;
    public int f23363m;
    public long f23364o;
    public hi.b0 f23365r;
    public FloatBuffer f23366s;
    public FloatBuffer f23367t;
    public org.telegram.ui.Components.b6 f23368u;
    public float v;
    public SurfaceTexture f23369z;

    public static ArrayList a(hi.x7 x7Var) {
        if (x7Var != null && x7Var.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < x7Var.T.size(); i7++) {
                hi.x7 x7Var2 = (hi.x7) x7Var.T.get(i7);
                ?? tLObject = new TLObject();
                tLObject.f23357e = 1.0f;
                tLObject.f23358f = 0L;
                tLObject.f23359i = true;
                tLObject.f23355b = x7Var2.K;
                tLObject.f23356c = x7Var2.Y;
                tLObject.d = x7Var2.L.getAbsolutePath();
                tLObject.f23357e = x7Var2.P;
                tLObject.f23359i = x7Var2.U;
                tLObject.f23358f = x7Var2.X;
                tLObject.f23360j = x7Var2.V;
                tLObject.f23361k = x7Var2.W;
                tLObject.f23362l = x7Var2.f15757k0;
                tLObject.f23363m = x7Var2.f15759l0;
                tLObject.f23364o = x7Var2.f15751h0;
                tLObject.f23365r = (hi.b0) x7Var.S.f14250e.get(i7);
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
        this.f23354a = readInt32;
        boolean z13 = false;
        if ((readInt32 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23355b = z11;
        if ((readInt32 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f23359i = z12;
        if ((readInt32 & 4) != 0) {
            z13 = true;
        }
        this.f23356c = z13;
        this.d = inputSerializedData.readString(z10);
        this.f23357e = inputSerializedData.readFloat(z10);
        this.f23358f = inputSerializedData.readInt64(z10);
        this.f23360j = inputSerializedData.readFloat(z10);
        this.f23361k = inputSerializedData.readFloat(z10);
        this.f23362l = inputSerializedData.readInt32(z10);
        this.f23363m = inputSerializedData.readInt32(z10);
        this.f23364o = inputSerializedData.readInt64(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        int i10;
        int i11;
        if (this.f23355b) {
            i7 = this.f23354a | 1;
        } else {
            i7 = this.f23354a & (-2);
        }
        this.f23354a = i7;
        if (this.f23359i) {
            i10 = i7 | 2;
        } else {
            i10 = i7 & (-3);
        }
        this.f23354a = i10;
        if (this.f23356c) {
            i11 = i10 | 4;
        } else {
            i11 = i10 & (-5);
        }
        this.f23354a = i11;
        outputSerializedData.writeInt32(i11);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.f23357e);
        outputSerializedData.writeInt64(this.f23358f);
        outputSerializedData.writeFloat(this.f23360j);
        outputSerializedData.writeFloat(this.f23361k);
        outputSerializedData.writeInt32(this.f23362l);
        outputSerializedData.writeInt32(this.f23363m);
        outputSerializedData.writeInt64(this.f23364o);
    }
}
