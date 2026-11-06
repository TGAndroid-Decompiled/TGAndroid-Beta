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
    public int f23022a;
    public boolean f23023b;
    public boolean f23024c;
    public String d;
    public float f23025e = 1.0f;
    public long f23026f = 0;
    public boolean f23027i = true;
    public float f23028j;
    public float f23029k;
    public int f23030l;
    public int f23031m;
    public long f23032o;
    public fi.s f23033r;
    public FloatBuffer f23034s;
    public FloatBuffer f23035t;
    public org.telegram.ui.Components.v5 f23036u;
    public float v;
    public SurfaceTexture f23037z;

    public static ArrayList a(fi.e7 e7Var) {
        if (e7Var != null && e7Var.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < e7Var.T.size(); i7++) {
                fi.e7 e7Var2 = (fi.e7) e7Var.T.get(i7);
                ?? tLObject = new TLObject();
                tLObject.f23025e = 1.0f;
                tLObject.f23026f = 0L;
                tLObject.f23027i = true;
                tLObject.f23023b = e7Var2.K;
                tLObject.f23024c = e7Var2.Y;
                tLObject.d = e7Var2.L.getAbsolutePath();
                tLObject.f23025e = e7Var2.P;
                tLObject.f23027i = e7Var2.U;
                tLObject.f23026f = e7Var2.X;
                tLObject.f23028j = e7Var2.V;
                tLObject.f23029k = e7Var2.W;
                tLObject.f23030l = e7Var2.f11900k0;
                tLObject.f23031m = e7Var2.f11902l0;
                tLObject.f23032o = e7Var2.f11894h0;
                tLObject.f23033r = (fi.s) e7Var.S.f12828e.get(i7);
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
        this.f23022a = readInt32;
        boolean z12 = false;
        if ((readInt32 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23023b = z10;
        if ((readInt32 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23027i = z11;
        if ((readInt32 & 4) != 0) {
            z12 = true;
        }
        this.f23024c = z12;
        this.d = inputSerializedData.readString(z9);
        this.f23025e = inputSerializedData.readFloat(z9);
        this.f23026f = inputSerializedData.readInt64(z9);
        this.f23028j = inputSerializedData.readFloat(z9);
        this.f23029k = inputSerializedData.readFloat(z9);
        this.f23030l = inputSerializedData.readInt32(z9);
        this.f23031m = inputSerializedData.readInt32(z9);
        this.f23032o = inputSerializedData.readInt64(z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        int i10;
        int i11;
        if (this.f23023b) {
            i7 = this.f23022a | 1;
        } else {
            i7 = this.f23022a & (-2);
        }
        this.f23022a = i7;
        if (this.f23027i) {
            i10 = i7 | 2;
        } else {
            i10 = i7 & (-3);
        }
        this.f23022a = i10;
        if (this.f23024c) {
            i11 = i10 | 4;
        } else {
            i11 = i10 & (-5);
        }
        this.f23022a = i11;
        outputSerializedData.writeInt32(i11);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.f23025e);
        outputSerializedData.writeInt64(this.f23026f);
        outputSerializedData.writeFloat(this.f23028j);
        outputSerializedData.writeFloat(this.f23029k);
        outputSerializedData.writeInt32(this.f23030l);
        outputSerializedData.writeInt32(this.f23031m);
        outputSerializedData.writeInt64(this.f23032o);
    }
}
