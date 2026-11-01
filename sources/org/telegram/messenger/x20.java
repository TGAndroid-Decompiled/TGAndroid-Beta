package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class x20 extends TLObject {
    public static final int C = 0;
    public MediaCodecPlayer B;
    public int f19380a;
    public boolean f19381b;
    public boolean f19382c;
    public String d;
    public float e = 1.0f;
    public long f19383f = 0;
    public boolean f19384i = true;
    public float f19385j;
    public float f19386k;
    public int f19387l;
    public int f19388m;
    public long f19389o;
    public vh.q f19390r;
    public FloatBuffer f19391s;
    public FloatBuffer f19392t;
    public org.telegram.ui.Components.s5 f19393u;
    public float v;
    public SurfaceTexture f19394z;

    public static ArrayList a(vh.n5 n5Var) {
        if (n5Var != null && n5Var.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < n5Var.T.size(); i10++) {
                vh.n5 n5Var2 = (vh.n5) n5Var.T.get(i10);
                ?? tLObject = new TLObject();
                tLObject.e = 1.0f;
                tLObject.f19383f = 0L;
                tLObject.f19384i = true;
                tLObject.f19381b = n5Var2.K;
                tLObject.f19382c = n5Var2.Y;
                tLObject.d = n5Var2.L.getAbsolutePath();
                tLObject.e = n5Var2.P;
                tLObject.f19384i = n5Var2.U;
                tLObject.f19383f = n5Var2.X;
                tLObject.f19385j = n5Var2.V;
                tLObject.f19386k = n5Var2.W;
                tLObject.f19387l = n5Var2.f51552k0;
                tLObject.f19388m = n5Var2.f51554l0;
                tLObject.f19389o = n5Var2.f51546h0;
                tLObject.f19390r = (vh.q) n5Var.S.e.get(i10);
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
        this.f19380a = readInt32;
        boolean z13 = false;
        if ((readInt32 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f19381b = z11;
        if ((readInt32 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f19384i = z12;
        if ((readInt32 & 4) != 0) {
            z13 = true;
        }
        this.f19382c = z13;
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readFloat(z10);
        this.f19383f = inputSerializedData.readInt64(z10);
        this.f19385j = inputSerializedData.readFloat(z10);
        this.f19386k = inputSerializedData.readFloat(z10);
        this.f19387l = inputSerializedData.readInt32(z10);
        this.f19388m = inputSerializedData.readInt32(z10);
        this.f19389o = inputSerializedData.readInt64(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i10;
        int i11;
        int i12;
        if (this.f19381b) {
            i10 = this.f19380a | 1;
        } else {
            i10 = this.f19380a & (-2);
        }
        this.f19380a = i10;
        if (this.f19384i) {
            i11 = i10 | 2;
        } else {
            i11 = i10 & (-3);
        }
        this.f19380a = i11;
        if (this.f19382c) {
            i12 = i11 | 4;
        } else {
            i12 = i11 & (-5);
        }
        this.f19380a = i12;
        outputSerializedData.writeInt32(i12);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.e);
        outputSerializedData.writeInt64(this.f19383f);
        outputSerializedData.writeFloat(this.f19385j);
        outputSerializedData.writeFloat(this.f19386k);
        outputSerializedData.writeInt32(this.f19387l);
        outputSerializedData.writeInt32(this.f19388m);
        outputSerializedData.writeInt64(this.f19389o);
    }
}
