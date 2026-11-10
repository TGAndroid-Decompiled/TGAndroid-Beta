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
    public int f23024a;
    public boolean f23025b;
    public boolean f23026c;
    public String d;
    public float f23027e = 1.0f;
    public long f23028f = 0;
    public boolean f23029i = true;
    public float f23030j;
    public float f23031k;
    public int f23032l;
    public int f23033m;
    public long f23034o;
    public fi.s f23035r;
    public FloatBuffer f23036s;
    public FloatBuffer f23037t;
    public org.telegram.ui.Components.u5 f23038u;
    public float v;
    public SurfaceTexture f23039z;

    public static ArrayList a(fi.e7 e7Var) {
        if (e7Var != null && e7Var.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < e7Var.T.size(); i7++) {
                fi.e7 e7Var2 = (fi.e7) e7Var.T.get(i7);
                ?? tLObject = new TLObject();
                tLObject.f23027e = 1.0f;
                tLObject.f23028f = 0L;
                tLObject.f23029i = true;
                tLObject.f23025b = e7Var2.K;
                tLObject.f23026c = e7Var2.Y;
                tLObject.d = e7Var2.L.getAbsolutePath();
                tLObject.f23027e = e7Var2.P;
                tLObject.f23029i = e7Var2.U;
                tLObject.f23028f = e7Var2.X;
                tLObject.f23030j = e7Var2.V;
                tLObject.f23031k = e7Var2.W;
                tLObject.f23032l = e7Var2.f11904k0;
                tLObject.f23033m = e7Var2.f11906l0;
                tLObject.f23034o = e7Var2.f11898h0;
                tLObject.f23035r = (fi.s) e7Var.S.f12828e.get(i7);
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
        this.f23024a = readInt32;
        boolean z12 = false;
        if ((readInt32 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23025b = z10;
        if ((readInt32 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23029i = z11;
        if ((readInt32 & 4) != 0) {
            z12 = true;
        }
        this.f23026c = z12;
        this.d = inputSerializedData.readString(z9);
        this.f23027e = inputSerializedData.readFloat(z9);
        this.f23028f = inputSerializedData.readInt64(z9);
        this.f23030j = inputSerializedData.readFloat(z9);
        this.f23031k = inputSerializedData.readFloat(z9);
        this.f23032l = inputSerializedData.readInt32(z9);
        this.f23033m = inputSerializedData.readInt32(z9);
        this.f23034o = inputSerializedData.readInt64(z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        int i10;
        int i11;
        if (this.f23025b) {
            i7 = this.f23024a | 1;
        } else {
            i7 = this.f23024a & (-2);
        }
        this.f23024a = i7;
        if (this.f23029i) {
            i10 = i7 | 2;
        } else {
            i10 = i7 & (-3);
        }
        this.f23024a = i10;
        if (this.f23026c) {
            i11 = i10 | 4;
        } else {
            i11 = i10 & (-5);
        }
        this.f23024a = i11;
        outputSerializedData.writeInt32(i11);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.f23027e);
        outputSerializedData.writeInt64(this.f23028f);
        outputSerializedData.writeFloat(this.f23030j);
        outputSerializedData.writeFloat(this.f23031k);
        outputSerializedData.writeInt32(this.f23032l);
        outputSerializedData.writeInt32(this.f23033m);
        outputSerializedData.writeInt64(this.f23034o);
    }
}
