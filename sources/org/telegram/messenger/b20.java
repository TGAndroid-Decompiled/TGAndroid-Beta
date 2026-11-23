package org.telegram.messenger;

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
public final class b20 {
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
    public org.telegram.ui.Components.b6 K;
    public boolean L;
    public Canvas M;
    public TL_stories.MediaArea N;
    public TLRPC.MessageMedia O;
    public hi.kc P;
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
    public byte f23124a;
    public tg.m0 f23125a0;
    public byte f23126b;
    public float f23127c;
    public float d;
    public float f23128e;
    public float f23129f;
    public float f23130g;
    public float h;
    public float f23131i;
    public String f23132j;
    public ArrayList f23133k;
    public int f23134l;
    public int f23135m;
    public sg.a0 f23136n;
    public String f23137o;
    public int f23138p;
    public int f23139q;
    public int f23140r;
    public float f23141s;
    public String f23142t;
    public we f23143u;
    public float v;
    public float f23144w;
    public float f23145x;
    public float f23146y;
    public float f23147z;

    public b20() {
        this.f23132j = "";
        this.f23133k = new ArrayList();
        this.f23142t = "";
        this.v = 1.0f;
    }

    public final b20 a() {
        b20 b20Var = new b20();
        b20Var.f23124a = this.f23124a;
        b20Var.f23126b = this.f23126b;
        b20Var.f23127c = this.f23127c;
        b20Var.d = this.d;
        b20Var.f23128e = this.f23128e;
        b20Var.f23129f = this.f23129f;
        b20Var.f23130g = this.f23130g;
        b20Var.f23131i = this.f23131i;
        b20Var.f23132j = this.f23132j;
        if (this.f23133k != null) {
            ArrayList arrayList = new ArrayList();
            b20Var.f23133k = arrayList;
            arrayList.addAll(this.f23133k);
        }
        b20Var.f23134l = this.f23134l;
        b20Var.f23135m = this.f23135m;
        b20Var.f23136n = this.f23136n;
        b20Var.f23137o = this.f23137o;
        b20Var.f23138p = this.f23138p;
        b20Var.f23139q = this.f23139q;
        b20Var.f23140r = this.f23140r;
        b20Var.f23141s = this.f23141s;
        b20Var.v = this.v;
        b20Var.f23144w = this.f23144w;
        b20Var.f23145x = this.f23145x;
        b20Var.f23146y = this.f23146y;
        b20Var.f23147z = this.f23147z;
        b20Var.B = this.B;
        b20Var.C = this.C;
        b20Var.D = this.D;
        b20Var.E = this.E;
        b20Var.F = this.F;
        b20Var.G = this.G;
        b20Var.I = this.I;
        b20Var.J = this.J;
        b20Var.K = this.K;
        b20Var.M = this.M;
        b20Var.N = this.N;
        b20Var.O = this.O;
        b20Var.Q = this.Q;
        b20Var.Y = this.Y;
        b20Var.Z = this.Z;
        b20Var.R = this.R;
        b20Var.U = this.U;
        b20Var.S = this.S;
        b20Var.T = this.T;
        b20Var.V = this.V;
        b20Var.W = this.W;
        b20Var.X = this.X;
        b20Var.f23125a0 = this.f23125a0;
        b20Var.P = this.P;
        return b20Var;
    }

    public final void b(AbstractSerializedData abstractSerializedData, boolean z10) {
        String str;
        int i7;
        abstractSerializedData.writeByte(this.f23124a);
        abstractSerializedData.writeByte(this.f23126b);
        abstractSerializedData.writeFloat(this.f23127c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.f23128e);
        abstractSerializedData.writeFloat(this.f23129f);
        abstractSerializedData.writeFloat(this.f23130g);
        abstractSerializedData.writeString(this.f23132j);
        abstractSerializedData.writeInt32(this.f23133k.size());
        for (int i10 = 0; i10 < this.f23133k.size(); i10++) {
            ((a20) this.f23133k.get(i10)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.f23134l);
        abstractSerializedData.writeInt32(this.f23135m);
        abstractSerializedData.writeInt32(this.f23139q);
        abstractSerializedData.writeInt32(this.f23140r);
        abstractSerializedData.writeInt32(this.f23138p);
        sg.a0 a0Var = this.f23136n;
        if (a0Var == null) {
            str = this.f23137o;
            if (str == null) {
                str = "";
            }
        } else {
            str = a0Var.f57278a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.f23144w);
        abstractSerializedData.writeFloat(this.f23145x);
        abstractSerializedData.writeFloat(this.f23146y);
        abstractSerializedData.writeFloat(this.f23147z);
        if (z10) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b10 = this.f23124a;
        if (b10 == 3) {
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
        } else if (b10 == 7) {
            abstractSerializedData.writeFloat(this.Q);
            this.N.serializeToStream(abstractSerializedData);
            this.f23125a0.serializeToStream(abstractSerializedData);
        } else if (b10 == 4) {
            this.N.serializeToStream(abstractSerializedData);
        } else if (b10 == 5) {
            abstractSerializedData.writeInt64(this.R);
            abstractSerializedData.writeInt64(this.S);
            abstractSerializedData.writeInt64(this.T);
            abstractSerializedData.writeInt64(this.U);
        } else if (b10 == 11) {
            abstractSerializedData.writeInt64(this.V);
            abstractSerializedData.writeInt64(this.W);
            int[] iArr = this.X;
            if (iArr != null && iArr.length <= 4096) {
                i7 = iArr.length;
            } else {
                i7 = 0;
            }
            abstractSerializedData.writeInt32(i7);
            for (int i11 = 0; i11 < i7; i11++) {
                abstractSerializedData.writeInt32(this.X[i11]);
            }
        } else if (b10 == 2) {
            abstractSerializedData.writeString(this.f23142t);
            we weVar = this.f23143u;
            if (weVar != null) {
                weVar.serializeToStream(abstractSerializedData);
            } else {
                abstractSerializedData.writeInt32(1450380236);
            }
        } else if (b10 == 8) {
            if (this.P == null) {
                abstractSerializedData.writeInt32(-559038737);
                return;
            }
            abstractSerializedData.writeInt32(132805945);
            this.P.serializeToStream(abstractSerializedData);
        }
    }

    public b20(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
        sg.a0 a0Var;
        int readInt32;
        this.f23132j = "";
        this.f23133k = new ArrayList();
        this.f23142t = "";
        this.v = 1.0f;
        this.f23124a = abstractSerializedData.readByte(z11);
        this.f23126b = abstractSerializedData.readByte(z11);
        this.f23127c = abstractSerializedData.readFloat(z11);
        this.d = abstractSerializedData.readFloat(z11);
        this.f23128e = abstractSerializedData.readFloat(z11);
        this.f23129f = abstractSerializedData.readFloat(z11);
        this.f23130g = abstractSerializedData.readFloat(z11);
        this.f23132j = abstractSerializedData.readString(z11);
        int readInt322 = abstractSerializedData.readInt32(z11);
        for (int i7 = 0; i7 < readInt322; i7++) {
            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
            abstractSerializedData.readInt32(z11);
            tL_messageEntityCustomEmoji.readParams(abstractSerializedData, z11);
            this.f23133k.add(tL_messageEntityCustomEmoji);
        }
        this.f23134l = abstractSerializedData.readInt32(z11);
        this.f23135m = abstractSerializedData.readInt32(z11);
        this.f23139q = abstractSerializedData.readInt32(z11);
        this.f23140r = abstractSerializedData.readInt32(z11);
        this.f23138p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.f23137o = readString;
        sg.a0 a0Var2 = sg.a0.f57274e;
        tg.m0 m0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = sg.a0.c();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                a0Var = (sg.a0) c10.get(i10);
                if (a0Var != null && TextUtils.equals(readString, a0Var.f57278a)) {
                    break;
                }
            }
        }
        a0Var = null;
        this.f23136n = a0Var;
        this.v = abstractSerializedData.readFloat(z11);
        this.f23144w = abstractSerializedData.readFloat(z11);
        this.f23145x = abstractSerializedData.readFloat(z11);
        this.f23146y = abstractSerializedData.readFloat(z11);
        this.f23147z = abstractSerializedData.readFloat(z11);
        if (z10) {
            int readInt323 = abstractSerializedData.readInt32(z11);
            if (readInt323 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt323, z11);
            }
        }
        byte b10 = this.f23124a;
        if (b10 == 3) {
            this.Q = abstractSerializedData.readFloat(z11);
            this.N = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            this.O = TLRPC.MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            if (abstractSerializedData.remaining() <= 0 || abstractSerializedData.readInt32(z11) != -559038737) {
                return;
            }
            String readString2 = abstractSerializedData.readString(z11);
            TLRPC.MessageMedia messageMedia = this.O;
            if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
                ((TLRPC.TL_messageMediaVenue) messageMedia).emoji = readString2;
            }
        } else if (b10 == 7) {
            this.Q = abstractSerializedData.readFloat(z11);
            this.N = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            int readInt324 = abstractSerializedData.readInt32(z11);
            if (-625858389 != readInt324) {
                int i11 = tg.m0.f58071j;
            } else {
                m0Var = new tg.m0();
            }
            this.f23125a0 = (tg.m0) TLObject.TLdeserialize(tg.m0.class, m0Var, abstractSerializedData, readInt324, z11);
        } else if (b10 == 4) {
            this.N = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
        } else if (b10 == 5) {
            this.R = abstractSerializedData.readInt64(z11);
            this.S = abstractSerializedData.readInt64(z11);
            this.T = abstractSerializedData.readInt64(z11);
            this.U = abstractSerializedData.readInt64(z11);
        } else if (b10 == 11 || b10 == 10) {
            this.V = abstractSerializedData.readInt64(z11);
            this.W = abstractSerializedData.readInt64(z11);
            if (this.f23124a == 11 && (readInt32 = abstractSerializedData.readInt32(z11)) > 0 && readInt32 <= 4096) {
                this.X = new int[readInt32];
                for (int i12 = 0; i12 < readInt32; i12++) {
                    this.X[i12] = abstractSerializedData.readInt32(z11);
                }
            }
            this.f23124a = (byte) 11;
        } else if (b10 == 2) {
            this.f23142t = abstractSerializedData.readString(z11);
            if (abstractSerializedData.readInt32(z11) == 1151577037) {
                we weVar = new we();
                this.f23143u = weVar;
                weVar.readParams(abstractSerializedData, z11);
            }
        } else if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            ?? tLObject = new TLObject();
            tLObject.f14802a = abstractSerializedData.readDouble(false);
            tLObject.f14803b = abstractSerializedData.readDouble(false);
            tLObject.f14804c = abstractSerializedData.readString(false);
            tLObject.d = abstractSerializedData.readFloat(false);
            this.P = tLObject;
        }
    }
}
