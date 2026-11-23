package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class e20 extends TLObject {
    public static final int C = 0;
    public MediaCodecPlayer B;
    public int f23661a;
    public boolean f23662b;
    public boolean f23663c;
    public String d;
    public float f23664e = 1.0f;
    public long f23665f = 0;
    public boolean f23666i = true;
    public float f23667j;
    public float f23668k;
    public int f23669l;
    public int f23670m;
    public long f23671o;
    public hi.u f23672r;
    public FloatBuffer f23673s;
    public FloatBuffer f23674t;
    public org.telegram.ui.Components.c6 f23675u;
    public float v;
    public SurfaceTexture f23676z;

    public static ArrayList a(hi.c7 c7Var) {
        if (c7Var != null && c7Var.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < c7Var.T.size(); i7++) {
                hi.c7 c7Var2 = (hi.c7) c7Var.T.get(i7);
                ?? tLObject = new TLObject();
                tLObject.f23664e = 1.0f;
                tLObject.f23665f = 0L;
                tLObject.f23666i = true;
                tLObject.f23662b = c7Var2.K;
                tLObject.f23663c = c7Var2.Y;
                tLObject.d = c7Var2.L.getAbsolutePath();
                tLObject.f23664e = c7Var2.P;
                tLObject.f23666i = c7Var2.U;
                tLObject.f23665f = c7Var2.X;
                tLObject.f23667j = c7Var2.V;
                tLObject.f23668k = c7Var2.W;
                tLObject.f23669l = c7Var2.f14362k0;
                tLObject.f23670m = c7Var2.f14364l0;
                tLObject.f23671o = c7Var2.f14356h0;
                tLObject.f23672r = (hi.u) c7Var.S.f15591e.get(i7);
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
        this.f23661a = readInt32;
        boolean z13 = false;
        if ((readInt32 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23662b = z11;
        if ((readInt32 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f23666i = z12;
        if ((readInt32 & 4) != 0) {
            z13 = true;
        }
        this.f23663c = z13;
        this.d = inputSerializedData.readString(z10);
        this.f23664e = inputSerializedData.readFloat(z10);
        this.f23665f = inputSerializedData.readInt64(z10);
        this.f23667j = inputSerializedData.readFloat(z10);
        this.f23668k = inputSerializedData.readFloat(z10);
        this.f23669l = inputSerializedData.readInt32(z10);
        this.f23670m = inputSerializedData.readInt32(z10);
        this.f23671o = inputSerializedData.readInt64(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        int i10;
        int i11;
        if (this.f23662b) {
            i7 = this.f23661a | 1;
        } else {
            i7 = this.f23661a & (-2);
        }
        this.f23661a = i7;
        if (this.f23666i) {
            i10 = i7 | 2;
        } else {
            i10 = i7 & (-3);
        }
        this.f23661a = i10;
        if (this.f23663c) {
            i11 = i10 | 4;
        } else {
            i11 = i10 & (-5);
        }
        this.f23661a = i11;
        outputSerializedData.writeInt32(i11);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.f23664e);
        outputSerializedData.writeInt64(this.f23665f);
        outputSerializedData.writeFloat(this.f23667j);
        outputSerializedData.writeFloat(this.f23668k);
        outputSerializedData.writeInt32(this.f23669l);
        outputSerializedData.writeInt32(this.f23670m);
        outputSerializedData.writeInt64(this.f23671o);
    }
}
