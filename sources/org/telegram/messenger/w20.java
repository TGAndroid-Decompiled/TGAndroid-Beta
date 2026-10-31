package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class w20 extends TLObject {
    public static final int C = 0;
    public MediaCodecPlayer B;
    public int f19045a;
    public boolean f19046b;
    public boolean f19047c;
    public String d;
    public float e = 1.0f;
    public long f19048f = 0;
    public boolean f19049i = true;
    public float f19050j;
    public float f19051k;
    public int f19052l;
    public int f19053m;
    public long f19054o;
    public vh.q f19055r;
    public FloatBuffer f19056s;
    public FloatBuffer f19057t;
    public org.telegram.ui.Components.s5 f19058u;
    public float v;
    public SurfaceTexture f19059z;

    public static ArrayList a(vh.n5 n5Var) {
        if (n5Var != null && n5Var.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < n5Var.T.size(); i10++) {
                vh.n5 n5Var2 = (vh.n5) n5Var.T.get(i10);
                ?? tLObject = new TLObject();
                tLObject.e = 1.0f;
                tLObject.f19048f = 0L;
                tLObject.f19049i = true;
                tLObject.f19046b = n5Var2.K;
                tLObject.f19047c = n5Var2.Y;
                tLObject.d = n5Var2.L.getAbsolutePath();
                tLObject.e = n5Var2.P;
                tLObject.f19049i = n5Var2.U;
                tLObject.f19048f = n5Var2.X;
                tLObject.f19050j = n5Var2.V;
                tLObject.f19051k = n5Var2.W;
                tLObject.f19052l = n5Var2.f51537k0;
                tLObject.f19053m = n5Var2.f51539l0;
                tLObject.f19054o = n5Var2.f51531h0;
                tLObject.f19055r = (vh.q) n5Var.S.e.get(i10);
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
        this.f19045a = readInt32;
        boolean z13 = false;
        if ((readInt32 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f19046b = z11;
        if ((readInt32 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f19049i = z12;
        if ((readInt32 & 4) != 0) {
            z13 = true;
        }
        this.f19047c = z13;
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readFloat(z10);
        this.f19048f = inputSerializedData.readInt64(z10);
        this.f19050j = inputSerializedData.readFloat(z10);
        this.f19051k = inputSerializedData.readFloat(z10);
        this.f19052l = inputSerializedData.readInt32(z10);
        this.f19053m = inputSerializedData.readInt32(z10);
        this.f19054o = inputSerializedData.readInt64(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i10;
        int i11;
        int i12;
        if (this.f19046b) {
            i10 = this.f19045a | 1;
        } else {
            i10 = this.f19045a & (-2);
        }
        this.f19045a = i10;
        if (this.f19049i) {
            i11 = i10 | 2;
        } else {
            i11 = i10 & (-3);
        }
        this.f19045a = i11;
        if (this.f19047c) {
            i12 = i11 | 4;
        } else {
            i12 = i11 & (-5);
        }
        this.f19045a = i12;
        outputSerializedData.writeInt32(i12);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.e);
        outputSerializedData.writeInt64(this.f19048f);
        outputSerializedData.writeFloat(this.f19050j);
        outputSerializedData.writeFloat(this.f19051k);
        outputSerializedData.writeInt32(this.f19052l);
        outputSerializedData.writeInt32(this.f19053m);
        outputSerializedData.writeInt64(this.f19054o);
    }
}
