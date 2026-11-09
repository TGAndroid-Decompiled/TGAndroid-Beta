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
    public byte f22813a;
    public byte f22814b;
    public float f22815c;
    public float d;
    public float f22816e;
    public float f22817f;
    public float f22818g;
    public float h;
    public float f22819i;
    public String f22820j;
    public ArrayList f22821k;
    public int f22822l;
    public int f22823m;
    public sg.b0 f22824n;
    public String f22825o;
    public int f22826p;
    public int f22827q;
    public int f22828r;
    public float f22829s;
    public String f22830t;
    public ye f22831u;
    public float v;
    public float f22832w;
    public float f22833x;
    public float f22834y;
    public float f22835z;

    public h20() {
        this.f22820j = "";
        this.f22821k = new ArrayList();
        this.f22830t = "";
        this.v = 1.0f;
    }

    public final h20 a() {
        h20 h20Var = new h20();
        h20Var.f22813a = this.f22813a;
        h20Var.f22814b = this.f22814b;
        h20Var.f22815c = this.f22815c;
        h20Var.d = this.d;
        h20Var.f22816e = this.f22816e;
        h20Var.f22817f = this.f22817f;
        h20Var.f22818g = this.f22818g;
        h20Var.f22819i = this.f22819i;
        h20Var.f22820j = this.f22820j;
        if (this.f22821k != null) {
            ArrayList arrayList = new ArrayList();
            h20Var.f22821k = arrayList;
            arrayList.addAll(this.f22821k);
        }
        h20Var.f22822l = this.f22822l;
        h20Var.f22823m = this.f22823m;
        h20Var.f22824n = this.f22824n;
        h20Var.f22825o = this.f22825o;
        h20Var.f22826p = this.f22826p;
        h20Var.f22827q = this.f22827q;
        h20Var.f22828r = this.f22828r;
        h20Var.f22829s = this.f22829s;
        h20Var.v = this.v;
        h20Var.f22832w = this.f22832w;
        h20Var.f22833x = this.f22833x;
        h20Var.f22834y = this.f22834y;
        h20Var.f22835z = this.f22835z;
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
        abstractSerializedData.writeByte(this.f22813a);
        abstractSerializedData.writeByte(this.f22814b);
        abstractSerializedData.writeFloat(this.f22815c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.f22816e);
        abstractSerializedData.writeFloat(this.f22817f);
        abstractSerializedData.writeFloat(this.f22818g);
        abstractSerializedData.writeString(this.f22820j);
        abstractSerializedData.writeInt32(this.f22821k.size());
        for (int i7 = 0; i7 < this.f22821k.size(); i7++) {
            ((g20) this.f22821k.get(i7)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.f22822l);
        abstractSerializedData.writeInt32(this.f22823m);
        abstractSerializedData.writeInt32(this.f22827q);
        abstractSerializedData.writeInt32(this.f22828r);
        abstractSerializedData.writeInt32(this.f22826p);
        sg.b0 b0Var = this.f22824n;
        if (b0Var == null) {
            str = this.f22825o;
            if (str == null) {
                str = "";
            }
        } else {
            str = b0Var.f55030a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.f22832w);
        abstractSerializedData.writeFloat(this.f22833x);
        abstractSerializedData.writeFloat(this.f22834y);
        abstractSerializedData.writeFloat(this.f22835z);
        if (z9) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b10 = this.f22813a;
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
            abstractSerializedData.writeString(this.f22830t);
            ye yeVar = this.f22831u;
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
        this.f22820j = "";
        this.f22821k = new ArrayList();
        this.f22830t = "";
        this.v = 1.0f;
        this.f22813a = abstractSerializedData.readByte(z10);
        this.f22814b = abstractSerializedData.readByte(z10);
        this.f22815c = abstractSerializedData.readFloat(z10);
        this.d = abstractSerializedData.readFloat(z10);
        this.f22816e = abstractSerializedData.readFloat(z10);
        this.f22817f = abstractSerializedData.readFloat(z10);
        this.f22818g = abstractSerializedData.readFloat(z10);
        this.f22820j = abstractSerializedData.readString(z10);
        int readInt32 = abstractSerializedData.readInt32(z10);
        for (int i7 = 0; i7 < readInt32; i7++) {
            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
            abstractSerializedData.readInt32(z10);
            tL_messageEntityCustomEmoji.readParams(abstractSerializedData, z10);
            this.f22821k.add(tL_messageEntityCustomEmoji);
        }
        this.f22822l = abstractSerializedData.readInt32(z10);
        this.f22823m = abstractSerializedData.readInt32(z10);
        this.f22827q = abstractSerializedData.readInt32(z10);
        this.f22828r = abstractSerializedData.readInt32(z10);
        this.f22826p = abstractSerializedData.readInt32(z10);
        String readString = abstractSerializedData.readString(z10);
        this.f22825o = readString;
        sg.b0 b0Var2 = sg.b0.f55026e;
        tg.h0 h0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = sg.b0.c();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                b0Var = (sg.b0) c10.get(i10);
                if (b0Var != null && TextUtils.equals(readString, b0Var.f55030a)) {
                    break;
                }
            }
        }
        b0Var = null;
        this.f22824n = b0Var;
        this.v = abstractSerializedData.readFloat(z10);
        this.f22832w = abstractSerializedData.readFloat(z10);
        this.f22833x = abstractSerializedData.readFloat(z10);
        this.f22834y = abstractSerializedData.readFloat(z10);
        this.f22835z = abstractSerializedData.readFloat(z10);
        if (z9) {
            int readInt322 = abstractSerializedData.readInt32(z10);
            if (readInt322 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z10);
            }
        }
        byte b10 = this.f22813a;
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
                int i11 = tg.h0.f55719j;
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
            this.f22830t = abstractSerializedData.readString(z10);
            if (abstractSerializedData.readInt32(z10) == 1151577037) {
                ye yeVar = new ye();
                this.f22831u = yeVar;
                yeVar.readParams(abstractSerializedData, z10);
            }
        } else if (b10 == 8 && abstractSerializedData.readInt32(z10) == 132805945) {
            ?? tLObject = new TLObject();
            tLObject.f12820a = abstractSerializedData.readDouble(false);
            tLObject.f12821b = abstractSerializedData.readDouble(false);
            tLObject.f12822c = abstractSerializedData.readString(false);
            tLObject.d = abstractSerializedData.readFloat(false);
            this.O = tLObject;
        }
    }
}
