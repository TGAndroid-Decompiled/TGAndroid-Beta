package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class i20 extends TLObject {
    public static final int C = 0;
    public MediaCodecPlayer B;
    public int f23020a;
    public boolean f23021b;
    public boolean f23022c;
    public String d;
    public float f23023e = 1.0f;
    public long f23024f = 0;
    public boolean f23025i = true;
    public float f23026j;
    public float f23027k;
    public int f23028l;
    public int f23029m;
    public long f23030o;
    public fi.s f23031r;
    public FloatBuffer f23032s;
    public FloatBuffer f23033t;
    public org.telegram.ui.Components.v5 f23034u;
    public float v;
    public SurfaceTexture f23035z;

    public static ArrayList a(fi.e7 e7Var) {
        if (e7Var != null && e7Var.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < e7Var.T.size(); i7++) {
                fi.e7 e7Var2 = (fi.e7) e7Var.T.get(i7);
                ?? tLObject = new TLObject();
                tLObject.f23023e = 1.0f;
                tLObject.f23024f = 0L;
                tLObject.f23025i = true;
                tLObject.f23021b = e7Var2.K;
                tLObject.f23022c = e7Var2.Y;
                tLObject.d = e7Var2.L.getAbsolutePath();
                tLObject.f23023e = e7Var2.P;
                tLObject.f23025i = e7Var2.U;
                tLObject.f23024f = e7Var2.X;
                tLObject.f23026j = e7Var2.V;
                tLObject.f23027k = e7Var2.W;
                tLObject.f23028l = e7Var2.f11900k0;
                tLObject.f23029m = e7Var2.f11902l0;
                tLObject.f23030o = e7Var2.f11894h0;
                tLObject.f23031r = (fi.s) e7Var.S.f12828e.get(i7);
                arrayList.add(tLObject);
            }
            return arrayList;
        }
        return null;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        boolean z10;
        boolean z11;
        int readInt32 = inputSerializedData.readInt32(z9);
        this.f23020a = readInt32;
        boolean z12 = false;
        if ((readInt32 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23021b = z10;
        if ((readInt32 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23025i = z11;
        if ((readInt32 & 4) != 0) {
            z12 = true;
        }
        this.f23022c = z12;
        this.d = inputSerializedData.readString(z9);
        this.f23023e = inputSerializedData.readFloat(z9);
        this.f23024f = inputSerializedData.readInt64(z9);
        this.f23026j = inputSerializedData.readFloat(z9);
        this.f23027k = inputSerializedData.readFloat(z9);
        this.f23028l = inputSerializedData.readInt32(z9);
        this.f23029m = inputSerializedData.readInt32(z9);
        this.f23030o = inputSerializedData.readInt64(z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        int i10;
        int i11;
        if (this.f23021b) {
            i7 = this.f23020a | 1;
        } else {
            i7 = this.f23020a & (-2);
        }
        this.f23020a = i7;
        if (this.f23025i) {
            i10 = i7 | 2;
        } else {
            i10 = i7 & (-3);
        }
        this.f23020a = i10;
        if (this.f23022c) {
            i11 = i10 | 4;
        } else {
            i11 = i10 & (-5);
        }
        this.f23020a = i11;
        outputSerializedData.writeInt32(i11);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.f23023e);
        outputSerializedData.writeInt64(this.f23024f);
        outputSerializedData.writeFloat(this.f23026j);
        outputSerializedData.writeFloat(this.f23027k);
        outputSerializedData.writeInt32(this.f23028l);
        outputSerializedData.writeInt32(this.f23029m);
        outputSerializedData.writeInt64(this.f23030o);
    }
}
