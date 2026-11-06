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
public final class h20 {
    public boolean A;
    public TLRPC.Document B;
    public Object C;
    public RLottieNative D;
    public float E;
    public float F;
    public Bitmap G;
    public Matrix H;
    public View I;
    public org.telegram.ui.Components.v5 J;
    public boolean K;
    public Canvas L;
    public TL_stories.MediaArea M;
    public TLRPC.MessageMedia N;
    public fi.sb O;
    public float P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public tg.h0 W;
    public byte f22807a;
    public byte f22808b;
    public float f22809c;
    public float d;
    public float f22810e;
    public float f22811f;
    public float f22812g;
    public float h;
    public float f22813i;
    public String f22814j;
    public ArrayList f22815k;
    public int f22816l;
    public int f22817m;
    public sg.b0 f22818n;
    public String f22819o;
    public int f22820p;
    public int f22821q;
    public int f22822r;
    public float f22823s;
    public String f22824t;
    public ye f22825u;
    public float v;
    public float f22826w;
    public float f22827x;
    public float f22828y;
    public float f22829z;

    public h20() {
        this.f22814j = "";
        this.f22815k = new ArrayList();
        this.f22824t = "";
        this.v = 1.0f;
    }

    public final h20 a() {
        h20 h20Var = new h20();
        h20Var.f22807a = this.f22807a;
        h20Var.f22808b = this.f22808b;
        h20Var.f22809c = this.f22809c;
        h20Var.d = this.d;
        h20Var.f22810e = this.f22810e;
        h20Var.f22811f = this.f22811f;
        h20Var.f22812g = this.f22812g;
        h20Var.f22813i = this.f22813i;
        h20Var.f22814j = this.f22814j;
        if (this.f22815k != null) {
            ArrayList arrayList = new ArrayList();
            h20Var.f22815k = arrayList;
            arrayList.addAll(this.f22815k);
        }
        h20Var.f22816l = this.f22816l;
        h20Var.f22817m = this.f22817m;
        h20Var.f22818n = this.f22818n;
        h20Var.f22819o = this.f22819o;
        h20Var.f22820p = this.f22820p;
        h20Var.f22821q = this.f22821q;
        h20Var.f22822r = this.f22822r;
        h20Var.f22823s = this.f22823s;
        h20Var.v = this.v;
        h20Var.f22826w = this.f22826w;
        h20Var.f22827x = this.f22827x;
        h20Var.f22828y = this.f22828y;
        h20Var.f22829z = this.f22829z;
        h20Var.B = this.B;
        h20Var.C = this.C;
        h20Var.D = this.D;
        h20Var.E = this.E;
        h20Var.F = this.F;
        h20Var.G = this.G;
        h20Var.I = this.I;
        h20Var.J = this.J;
        h20Var.L = this.L;
        h20Var.M = this.M;
        h20Var.N = this.N;
        h20Var.P = this.P;
        h20Var.U = this.U;
        h20Var.V = this.V;
        h20Var.Q = this.Q;
        h20Var.T = this.T;
        h20Var.R = this.R;
        h20Var.S = this.S;
        h20Var.W = this.W;
        h20Var.O = this.O;
        return h20Var;
    }

    public final void b(AbstractSerializedData abstractSerializedData, boolean z9) {
        String str;
        abstractSerializedData.writeByte(this.f22807a);
        abstractSerializedData.writeByte(this.f22808b);
        abstractSerializedData.writeFloat(this.f22809c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.f22810e);
        abstractSerializedData.writeFloat(this.f22811f);
        abstractSerializedData.writeFloat(this.f22812g);
        abstractSerializedData.writeString(this.f22814j);
        abstractSerializedData.writeInt32(this.f22815k.size());
        for (int i7 = 0; i7 < this.f22815k.size(); i7++) {
            ((g20) this.f22815k.get(i7)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.f22816l);
        abstractSerializedData.writeInt32(this.f22817m);
        abstractSerializedData.writeInt32(this.f22821q);
        abstractSerializedData.writeInt32(this.f22822r);
        abstractSerializedData.writeInt32(this.f22820p);
        sg.b0 b0Var = this.f22818n;
        if (b0Var == null) {
            str = this.f22819o;
            if (str == null) {
                str = "";
            }
        } else {
            str = b0Var.f54925a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.f22826w);
        abstractSerializedData.writeFloat(this.f22827x);
        abstractSerializedData.writeFloat(this.f22828y);
        abstractSerializedData.writeFloat(this.f22829z);
        if (z9) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b10 = this.f22807a;
        if (b10 == 3) {
            abstractSerializedData.writeFloat(this.P);
            this.M.serializeToStream(abstractSerializedData);
            TLRPC.MessageMedia messageMedia = this.N;
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
            TLRPC.MessageMedia messageMedia2 = this.N;
            if ((messageMedia2 instanceof TLRPC.TL_messageMediaVenue) && ((TLRPC.TL_messageMediaVenue) messageMedia2).emoji != null) {
                abstractSerializedData.writeInt32(-559038737);
                abstractSerializedData.writeString(((TLRPC.TL_messageMediaVenue) this.N).emoji);
                return;
            }
            abstractSerializedData.writeInt32(1450380236);
        } else if (b10 == 7) {
            abstractSerializedData.writeFloat(this.P);
            this.M.serializeToStream(abstractSerializedData);
            this.W.serializeToStream(abstractSerializedData);
        } else if (b10 == 4) {
            this.M.serializeToStream(abstractSerializedData);
        } else if (b10 == 5) {
            abstractSerializedData.writeInt64(this.Q);
            abstractSerializedData.writeInt64(this.R);
            abstractSerializedData.writeInt64(this.S);
            abstractSerializedData.writeInt64(this.T);
        } else if (b10 == 2) {
            abstractSerializedData.writeString(this.f22824t);
            ye yeVar = this.f22825u;
            if (yeVar != null) {
                yeVar.serializeToStream(abstractSerializedData);
            } else {
                abstractSerializedData.writeInt32(1450380236);
            }
        } else if (b10 == 8) {
            if (this.O == null) {
                abstractSerializedData.writeInt32(-559038737);
                return;
            }
            abstractSerializedData.writeInt32(132805945);
            this.O.serializeToStream(abstractSerializedData);
        }
    }

    public h20(AbstractSerializedData abstractSerializedData, boolean z9, boolean z10) {
        sg.b0 b0Var;
        this.f22814j = "";
        this.f22815k = new ArrayList();
        this.f22824t = "";
        this.v = 1.0f;
        this.f22807a = abstractSerializedData.readByte(z10);
        this.f22808b = abstractSerializedData.readByte(z10);
        this.f22809c = abstractSerializedData.readFloat(z10);
        this.d = abstractSerializedData.readFloat(z10);
        this.f22810e = abstractSerializedData.readFloat(z10);
        this.f22811f = abstractSerializedData.readFloat(z10);
        this.f22812g = abstractSerializedData.readFloat(z10);
        this.f22814j = abstractSerializedData.readString(z10);
        int readInt32 = abstractSerializedData.readInt32(z10);
        for (int i7 = 0; i7 < readInt32; i7++) {
            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
            abstractSerializedData.readInt32(z10);
            tL_messageEntityCustomEmoji.readParams(abstractSerializedData, z10);
            this.f22815k.add(tL_messageEntityCustomEmoji);
        }
        this.f22816l = abstractSerializedData.readInt32(z10);
        this.f22817m = abstractSerializedData.readInt32(z10);
        this.f22821q = abstractSerializedData.readInt32(z10);
        this.f22822r = abstractSerializedData.readInt32(z10);
        this.f22820p = abstractSerializedData.readInt32(z10);
        String readString = abstractSerializedData.readString(z10);
        this.f22819o = readString;
        sg.b0 b0Var2 = sg.b0.f54921e;
        tg.h0 h0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = sg.b0.c();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                b0Var = (sg.b0) c10.get(i10);
                if (b0Var != null && TextUtils.equals(readString, b0Var.f54925a)) {
                    break;
                }
            }
        }
        b0Var = null;
        this.f22818n = b0Var;
        this.v = abstractSerializedData.readFloat(z10);
        this.f22826w = abstractSerializedData.readFloat(z10);
        this.f22827x = abstractSerializedData.readFloat(z10);
        this.f22828y = abstractSerializedData.readFloat(z10);
        this.f22829z = abstractSerializedData.readFloat(z10);
        if (z9) {
            int readInt322 = abstractSerializedData.readInt32(z10);
            if (readInt322 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z10);
            }
        }
        byte b10 = this.f22807a;
        if (b10 == 3) {
            this.P = abstractSerializedData.readFloat(z10);
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z10), z10);
            this.N = TLRPC.MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z10), z10);
            if (abstractSerializedData.remaining() <= 0 || abstractSerializedData.readInt32(z10) != -559038737) {
                return;
            }
            String readString2 = abstractSerializedData.readString(z10);
            TLRPC.MessageMedia messageMedia = this.N;
            if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
                ((TLRPC.TL_messageMediaVenue) messageMedia).emoji = readString2;
            }
        } else if (b10 == 7) {
            this.P = abstractSerializedData.readFloat(z10);
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z10), z10);
            int readInt323 = abstractSerializedData.readInt32(z10);
            if (-625858389 != readInt323) {
                int i11 = tg.h0.f55614j;
            } else {
                h0Var = new tg.h0();
            }
            this.W = (tg.h0) TLObject.TLdeserialize(tg.h0.class, h0Var, abstractSerializedData, readInt323, z10);
        } else if (b10 == 4) {
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z10), z10);
        } else if (b10 == 5) {
            this.Q = abstractSerializedData.readInt64(z10);
            this.R = abstractSerializedData.readInt64(z10);
            this.S = abstractSerializedData.readInt64(z10);
            this.T = abstractSerializedData.readInt64(z10);
        } else if (b10 == 2) {
            this.f22824t = abstractSerializedData.readString(z10);
            if (abstractSerializedData.readInt32(z10) == 1151577037) {
                ye yeVar = new ye();
                this.f22825u = yeVar;
                yeVar.readParams(abstractSerializedData, z10);
            }
        } else if (b10 == 8 && abstractSerializedData.readInt32(z10) == 132805945) {
            ?? tLObject = new TLObject();
            tLObject.f12821a = abstractSerializedData.readDouble(false);
            tLObject.f12822b = abstractSerializedData.readDouble(false);
            tLObject.f12823c = abstractSerializedData.readString(false);
            tLObject.d = abstractSerializedData.readFloat(false);
            this.O = tLObject;
        }
    }
}
