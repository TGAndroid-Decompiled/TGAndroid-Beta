package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;
public final class mec {
    public boolean A;
    public TLRPC.Document B;
    public Object C;
    public RLottieNative D;
    public float E;
    public float F;
    public Bitmap G;
    public Matrix H;
    public View I;
    public Canvas J;
    public lm K;
    public boolean L;
    public Canvas M;
    public TL_stories.MediaArea N;
    public TLRPC.MessageMedia O;
    public vwc P;
    public float Q;
    public long R;
    public long S;
    public long T;
    public long U;
    public long V;
    public long W;
    public int[] X;
    public int Y;
    public int Z;
    public byte a;
    public g66 a0;
    public byte b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public String j;
    public ArrayList k;
    public int l;
    public int m;
    public xv7 n;
    public String o;
    public int p;
    public int q;
    public int r;
    public float s;
    public String t;
    public fo6 u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public mec(AbstractSerializedData abstractSerializedData, boolean z, boolean z2) {
        xv7 xv7Var;
        int readInt32;
        this.j = "";
        this.k = new ArrayList();
        this.t = "";
        this.v = 1.0f;
        this.a = abstractSerializedData.readByte(z2);
        this.b = abstractSerializedData.readByte(z2);
        this.c = abstractSerializedData.readFloat(z2);
        this.d = abstractSerializedData.readFloat(z2);
        this.e = abstractSerializedData.readFloat(z2);
        this.f = abstractSerializedData.readFloat(z2);
        this.g = abstractSerializedData.readFloat(z2);
        this.j = abstractSerializedData.readString(z2);
        int readInt322 = abstractSerializedData.readInt32(z2);
        for (int i = 0; i < readInt322; i++) {
            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
            abstractSerializedData.readInt32(z2);
            tL_messageEntityCustomEmoji.readParams(abstractSerializedData, z2);
            this.k.add(tL_messageEntityCustomEmoji);
        }
        this.l = abstractSerializedData.readInt32(z2);
        this.m = abstractSerializedData.readInt32(z2);
        this.q = abstractSerializedData.readInt32(z2);
        this.r = abstractSerializedData.readInt32(z2);
        this.p = abstractSerializedData.readInt32(z2);
        String readString = abstractSerializedData.readString(z2);
        this.o = readString;
        xv7 xv7Var2 = xv7.e;
        g66 g66Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List a = xv7.a();
            for (int i2 = 0; i2 < a.size(); i2++) {
                xv7Var = (xv7) a.get(i2);
                if (xv7Var != null && TextUtils.equals(readString, xv7Var.a)) {
                    break;
                }
            }
        }
        xv7Var = null;
        this.n = xv7Var;
        this.v = abstractSerializedData.readFloat(z2);
        this.w = abstractSerializedData.readFloat(z2);
        this.x = abstractSerializedData.readFloat(z2);
        this.y = abstractSerializedData.readFloat(z2);
        this.z = abstractSerializedData.readFloat(z2);
        if (z) {
            int readInt323 = abstractSerializedData.readInt32(z2);
            if (readInt323 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt323, z2);
            }
        }
        byte b = this.a;
        if (b == 3) {
            this.Q = abstractSerializedData.readFloat(z2);
            this.N = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z2), z2);
            this.O = TLRPC.MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z2), z2);
            if (abstractSerializedData.remaining() > 0 && abstractSerializedData.readInt32(z2) == -559038737) {
                String readString2 = abstractSerializedData.readString(z2);
                TLRPC.MessageMedia messageMedia = this.O;
                if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
                    ((TLRPC.TL_messageMediaVenue) messageMedia).emoji = readString2;
                }
            }
        } else if (b == 7) {
            this.Q = abstractSerializedData.readFloat(z2);
            this.N = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z2), z2);
            int readInt324 = abstractSerializedData.readInt32(z2);
            if (-625858389 != readInt324) {
                int i3 = g66.j;
            } else {
                g66Var = new g66();
            }
            this.a0 = (g66) TLObject.TLdeserialize(g66.class, g66Var, abstractSerializedData, readInt324, z2);
        } else if (b == 4) {
            this.N = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z2), z2);
        } else if (b == 5) {
            this.R = abstractSerializedData.readInt64(z2);
            this.S = abstractSerializedData.readInt64(z2);
            this.T = abstractSerializedData.readInt64(z2);
            this.U = abstractSerializedData.readInt64(z2);
        } else if (b != 11 && b != 10) {
            if (b == 2) {
                this.t = abstractSerializedData.readString(z2);
                if (abstractSerializedData.readInt32(z2) == 1151577037) {
                    fo6 fo6Var = new fo6();
                    this.u = fo6Var;
                    fo6Var.readParams(abstractSerializedData, z2);
                }
            } else if (b == 8 && abstractSerializedData.readInt32(z2) == 132805945) {
                ?? tLObject = new TLObject();
                tLObject.a = abstractSerializedData.readDouble(false);
                tLObject.b = abstractSerializedData.readDouble(false);
                tLObject.c = abstractSerializedData.readString(false);
                tLObject.d = abstractSerializedData.readFloat(false);
                this.P = tLObject;
            }
        } else {
            this.V = abstractSerializedData.readInt64(z2);
            this.W = abstractSerializedData.readInt64(z2);
            if (this.a == 11 && (readInt32 = abstractSerializedData.readInt32(z2)) > 0 && readInt32 <= 4096) {
                this.X = new int[readInt32];
                for (int i4 = 0; i4 < readInt32; i4++) {
                    this.X[i4] = abstractSerializedData.readInt32(z2);
                }
            }
            this.a = (byte) 11;
        }
    }

    public final mec a() {
        mec mecVar = new mec();
        mecVar.a = this.a;
        mecVar.b = this.b;
        mecVar.c = this.c;
        mecVar.d = this.d;
        mecVar.e = this.e;
        mecVar.f = this.f;
        mecVar.g = this.g;
        mecVar.i = this.i;
        mecVar.j = this.j;
        if (this.k != null) {
            ArrayList arrayList = new ArrayList();
            mecVar.k = arrayList;
            arrayList.addAll(this.k);
        }
        mecVar.l = this.l;
        mecVar.m = this.m;
        mecVar.n = this.n;
        mecVar.o = this.o;
        mecVar.p = this.p;
        mecVar.q = this.q;
        mecVar.r = this.r;
        mecVar.s = this.s;
        mecVar.v = this.v;
        mecVar.w = this.w;
        mecVar.x = this.x;
        mecVar.y = this.y;
        mecVar.z = this.z;
        mecVar.B = this.B;
        mecVar.C = this.C;
        mecVar.D = this.D;
        mecVar.E = this.E;
        mecVar.F = this.F;
        mecVar.G = this.G;
        mecVar.I = this.I;
        mecVar.J = this.J;
        mecVar.K = this.K;
        mecVar.M = this.M;
        mecVar.N = this.N;
        mecVar.O = this.O;
        mecVar.Q = this.Q;
        mecVar.Y = this.Y;
        mecVar.Z = this.Z;
        mecVar.R = this.R;
        mecVar.U = this.U;
        mecVar.S = this.S;
        mecVar.T = this.T;
        mecVar.V = this.V;
        mecVar.W = this.W;
        mecVar.X = this.X;
        mecVar.a0 = this.a0;
        mecVar.P = this.P;
        return mecVar;
    }

    public final void b(AbstractSerializedData abstractSerializedData, boolean z) {
        String str;
        int i;
        abstractSerializedData.writeByte(this.a);
        abstractSerializedData.writeByte(this.b);
        abstractSerializedData.writeFloat(this.c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.e);
        abstractSerializedData.writeFloat(this.f);
        abstractSerializedData.writeFloat(this.g);
        abstractSerializedData.writeString(this.j);
        abstractSerializedData.writeInt32(this.k.size());
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            ((lec) this.k.get(i2)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.l);
        abstractSerializedData.writeInt32(this.m);
        abstractSerializedData.writeInt32(this.q);
        abstractSerializedData.writeInt32(this.r);
        abstractSerializedData.writeInt32(this.p);
        xv7 xv7Var = this.n;
        if (xv7Var == null) {
            str = this.o;
            if (str == null) {
                str = "";
            }
        } else {
            str = xv7Var.a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.w);
        abstractSerializedData.writeFloat(this.x);
        abstractSerializedData.writeFloat(this.y);
        abstractSerializedData.writeFloat(this.z);
        if (z) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b = this.a;
        if (b == 3) {
            abstractSerializedData.writeFloat(this.Q);
            this.N.serializeToStream(abstractSerializedData);
            TLRPC.MessageMedia messageMedia = this.O;
            if (messageMedia.provider == null) {
                messageMedia.provider = "";
            }
            if (messageMedia.venue_id == null) {
                messageMedia.venue_id = "";
            }
            if (messageMedia.venue_type == null) {
                messageMedia.venue_type = "";
            }
            messageMedia.serializeToStream(abstractSerializedData);
            TLRPC.MessageMedia messageMedia2 = this.O;
            if ((messageMedia2 instanceof TLRPC.TL_messageMediaVenue) && ((TLRPC.TL_messageMediaVenue) messageMedia2).emoji != null) {
                abstractSerializedData.writeInt32(-559038737);
                abstractSerializedData.writeString(((TLRPC.TL_messageMediaVenue) this.O).emoji);
                return;
            }
            abstractSerializedData.writeInt32(1450380236);
        } else if (b == 7) {
            abstractSerializedData.writeFloat(this.Q);
            this.N.serializeToStream(abstractSerializedData);
            this.a0.serializeToStream(abstractSerializedData);
        } else if (b == 4) {
            this.N.serializeToStream(abstractSerializedData);
        } else if (b == 5) {
            abstractSerializedData.writeInt64(this.R);
            abstractSerializedData.writeInt64(this.S);
            abstractSerializedData.writeInt64(this.T);
            abstractSerializedData.writeInt64(this.U);
        } else if (b == 11) {
            abstractSerializedData.writeInt64(this.V);
            abstractSerializedData.writeInt64(this.W);
            int[] iArr = this.X;
            if (iArr != null && iArr.length <= 4096) {
                i = iArr.length;
            } else {
                i = 0;
            }
            abstractSerializedData.writeInt32(i);
            for (int i3 = 0; i3 < i; i3++) {
                abstractSerializedData.writeInt32(this.X[i3]);
            }
        } else if (b == 2) {
            abstractSerializedData.writeString(this.t);
            fo6 fo6Var = this.u;
            if (fo6Var != null) {
                fo6Var.serializeToStream(abstractSerializedData);
            } else {
                abstractSerializedData.writeInt32(1450380236);
            }
        } else if (b == 8) {
            if (this.P == null) {
                abstractSerializedData.writeInt32(-559038737);
                return;
            }
            abstractSerializedData.writeInt32(132805945);
            this.P.serializeToStream(abstractSerializedData);
        }
    }

    public mec() {
        this.j = "";
        this.k = new ArrayList();
        this.t = "";
        this.v = 1.0f;
    }
}
