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
    public int f23029a;
    public boolean f23030b;
    public boolean f23031c;
    public String d;
    public float f23032e = 1.0f;
    public long f23033f = 0;
    public boolean f23034i = true;
    public float f23035j;
    public float f23036k;
    public int f23037l;
    public int f23038m;
    public long f23039o;
    public fi.s f23040r;
    public FloatBuffer f23041s;
    public FloatBuffer f23042t;
    public org.telegram.ui.Components.v5 f23043u;
    public float v;
    public SurfaceTexture f23044z;

    public static ArrayList a(fi.e7 e7Var) {
        if (e7Var != null && e7Var.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < e7Var.T.size(); i7++) {
                fi.e7 e7Var2 = (fi.e7) e7Var.T.get(i7);
                ?? tLObject = new TLObject();
                tLObject.f23032e = 1.0f;
                tLObject.f23033f = 0L;
                tLObject.f23034i = true;
                tLObject.f23030b = e7Var2.K;
                tLObject.f23031c = e7Var2.Y;
                tLObject.d = e7Var2.L.getAbsolutePath();
                tLObject.f23032e = e7Var2.P;
                tLObject.f23034i = e7Var2.U;
                tLObject.f23033f = e7Var2.X;
                tLObject.f23035j = e7Var2.V;
                tLObject.f23036k = e7Var2.W;
                tLObject.f23037l = e7Var2.f11900k0;
                tLObject.f23038m = e7Var2.f11902l0;
                tLObject.f23039o = e7Var2.f11894h0;
                tLObject.f23040r = (fi.s) e7Var.S.f12828e.get(i7);
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
        this.f23029a = readInt32;
        boolean z12 = false;
        if ((readInt32 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23030b = z10;
        if ((readInt32 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23034i = z11;
        if ((readInt32 & 4) != 0) {
            z12 = true;
        }
        this.f23031c = z12;
        this.d = inputSerializedData.readString(z9);
        this.f23032e = inputSerializedData.readFloat(z9);
        this.f23033f = inputSerializedData.readInt64(z9);
        this.f23035j = inputSerializedData.readFloat(z9);
        this.f23036k = inputSerializedData.readFloat(z9);
        this.f23037l = inputSerializedData.readInt32(z9);
        this.f23038m = inputSerializedData.readInt32(z9);
        this.f23039o = inputSerializedData.readInt64(z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        int i10;
        int i11;
        if (this.f23030b) {
            i7 = this.f23029a | 1;
        } else {
            i7 = this.f23029a & (-2);
        }
        this.f23029a = i7;
        if (this.f23034i) {
            i10 = i7 | 2;
        } else {
            i10 = i7 & (-3);
        }
        this.f23029a = i10;
        if (this.f23031c) {
            i11 = i10 | 4;
        } else {
            i11 = i10 & (-5);
        }
        this.f23029a = i11;
        outputSerializedData.writeInt32(i11);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.f23032e);
        outputSerializedData.writeInt64(this.f23033f);
        outputSerializedData.writeFloat(this.f23035j);
        outputSerializedData.writeFloat(this.f23036k);
        outputSerializedData.writeInt32(this.f23037l);
        outputSerializedData.writeInt32(this.f23038m);
        outputSerializedData.writeInt64(this.f23039o);
    }
}
