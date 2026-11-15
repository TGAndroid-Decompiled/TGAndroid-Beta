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
public final class e20 {
    public boolean A;
    public TLRPC.Document B;
    public Object C;
    public RLottieNative D;
    public float E;
    public float F;
    public Bitmap G;
    public Matrix H;
    public View I;
    public org.telegram.ui.Components.t5 J;
    public boolean K;
    public Canvas L;
    public TL_stories.MediaArea M;
    public TLRPC.MessageMedia N;
    public hi.pb O;
    public float P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public tg.h0 W;
    public byte f23224a;
    public byte f23225b;
    public float f23226c;
    public float d;
    public float f23227e;
    public float f23228f;
    public float f23229g;
    public float h;
    public float f23230i;
    public String f23231j;
    public ArrayList f23232k;
    public int f23233l;
    public int f23234m;
    public sg.a0 f23235n;
    public String f23236o;
    public int f23237p;
    public int f23238q;
    public int f23239r;
    public float f23240s;
    public String f23241t;
    public xe f23242u;
    public float v;
    public float f23243w;
    public float f23244x;
    public float f23245y;
    public float f23246z;

    public e20() {
        this.f23231j = "";
        this.f23232k = new ArrayList();
        this.f23241t = "";
        this.v = 1.0f;
    }

    public final e20 a() {
        e20 e20Var = new e20();
        e20Var.f23224a = this.f23224a;
        e20Var.f23225b = this.f23225b;
        e20Var.f23226c = this.f23226c;
        e20Var.d = this.d;
        e20Var.f23227e = this.f23227e;
        e20Var.f23228f = this.f23228f;
        e20Var.f23229g = this.f23229g;
        e20Var.f23230i = this.f23230i;
        e20Var.f23231j = this.f23231j;
        if (this.f23232k != null) {
            ArrayList arrayList = new ArrayList();
            e20Var.f23232k = arrayList;
            arrayList.addAll(this.f23232k);
        }
        e20Var.f23233l = this.f23233l;
        e20Var.f23234m = this.f23234m;
        e20Var.f23235n = this.f23235n;
        e20Var.f23236o = this.f23236o;
        e20Var.f23237p = this.f23237p;
        e20Var.f23238q = this.f23238q;
        e20Var.f23239r = this.f23239r;
        e20Var.f23240s = this.f23240s;
        e20Var.v = this.v;
        e20Var.f23243w = this.f23243w;
        e20Var.f23244x = this.f23244x;
        e20Var.f23245y = this.f23245y;
        e20Var.f23246z = this.f23246z;
        e20Var.B = this.B;
        e20Var.C = this.C;
        e20Var.D = this.D;
        e20Var.E = this.E;
        e20Var.F = this.F;
        e20Var.G = this.G;
        e20Var.I = this.I;
        e20Var.J = this.J;
        e20Var.L = this.L;
        e20Var.M = this.M;
        e20Var.N = this.N;
        e20Var.P = this.P;
        e20Var.U = this.U;
        e20Var.V = this.V;
        e20Var.Q = this.Q;
        e20Var.T = this.T;
        e20Var.R = this.R;
        e20Var.S = this.S;
        e20Var.W = this.W;
        e20Var.O = this.O;
        return e20Var;
    }

    public final void b(AbstractSerializedData abstractSerializedData, boolean z10) {
        String str;
        abstractSerializedData.writeByte(this.f23224a);
        abstractSerializedData.writeByte(this.f23225b);
        abstractSerializedData.writeFloat(this.f23226c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.f23227e);
        abstractSerializedData.writeFloat(this.f23228f);
        abstractSerializedData.writeFloat(this.f23229g);
        abstractSerializedData.writeString(this.f23231j);
        abstractSerializedData.writeInt32(this.f23232k.size());
        for (int i7 = 0; i7 < this.f23232k.size(); i7++) {
            ((d20) this.f23232k.get(i7)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.f23233l);
        abstractSerializedData.writeInt32(this.f23234m);
        abstractSerializedData.writeInt32(this.f23238q);
        abstractSerializedData.writeInt32(this.f23239r);
        abstractSerializedData.writeInt32(this.f23237p);
        sg.a0 a0Var = this.f23235n;
        if (a0Var == null) {
            str = this.f23236o;
            if (str == null) {
                str = "";
            }
        } else {
            str = a0Var.f56580a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.f23243w);
        abstractSerializedData.writeFloat(this.f23244x);
        abstractSerializedData.writeFloat(this.f23245y);
        abstractSerializedData.writeFloat(this.f23246z);
        if (z10) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b10 = this.f23224a;
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
            abstractSerializedData.writeString(this.f23241t);
            xe xeVar = this.f23242u;
            if (xeVar != null) {
                xeVar.serializeToStream(abstractSerializedData);
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

    public e20(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
        sg.a0 a0Var;
        this.f23231j = "";
        this.f23232k = new ArrayList();
        this.f23241t = "";
        this.v = 1.0f;
        this.f23224a = abstractSerializedData.readByte(z11);
        this.f23225b = abstractSerializedData.readByte(z11);
        this.f23226c = abstractSerializedData.readFloat(z11);
        this.d = abstractSerializedData.readFloat(z11);
        this.f23227e = abstractSerializedData.readFloat(z11);
        this.f23228f = abstractSerializedData.readFloat(z11);
        this.f23229g = abstractSerializedData.readFloat(z11);
        this.f23231j = abstractSerializedData.readString(z11);
        int readInt32 = abstractSerializedData.readInt32(z11);
        for (int i7 = 0; i7 < readInt32; i7++) {
            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
            abstractSerializedData.readInt32(z11);
            tL_messageEntityCustomEmoji.readParams(abstractSerializedData, z11);
            this.f23232k.add(tL_messageEntityCustomEmoji);
        }
        this.f23233l = abstractSerializedData.readInt32(z11);
        this.f23234m = abstractSerializedData.readInt32(z11);
        this.f23238q = abstractSerializedData.readInt32(z11);
        this.f23239r = abstractSerializedData.readInt32(z11);
        this.f23237p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.f23236o = readString;
        sg.a0 a0Var2 = sg.a0.f56576e;
        tg.h0 h0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = sg.a0.c();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                a0Var = (sg.a0) c10.get(i10);
                if (a0Var != null && TextUtils.equals(readString, a0Var.f56580a)) {
                    break;
                }
            }
        }
        a0Var = null;
        this.f23235n = a0Var;
        this.v = abstractSerializedData.readFloat(z11);
        this.f23243w = abstractSerializedData.readFloat(z11);
        this.f23244x = abstractSerializedData.readFloat(z11);
        this.f23245y = abstractSerializedData.readFloat(z11);
        this.f23246z = abstractSerializedData.readFloat(z11);
        if (z10) {
            int readInt322 = abstractSerializedData.readInt32(z11);
            if (readInt322 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z11);
            }
        }
        byte b10 = this.f23224a;
        if (b10 == 3) {
            this.P = abstractSerializedData.readFloat(z11);
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            this.N = TLRPC.MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            if (abstractSerializedData.remaining() <= 0 || abstractSerializedData.readInt32(z11) != -559038737) {
                return;
            }
            String readString2 = abstractSerializedData.readString(z11);
            TLRPC.MessageMedia messageMedia = this.N;
            if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
                ((TLRPC.TL_messageMediaVenue) messageMedia).emoji = readString2;
            }
        } else if (b10 == 7) {
            this.P = abstractSerializedData.readFloat(z11);
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            int readInt323 = abstractSerializedData.readInt32(z11);
            if (-625858389 != readInt323) {
                int i11 = tg.h0.f57315j;
            } else {
                h0Var = new tg.h0();
            }
            this.W = (tg.h0) TLObject.TLdeserialize(tg.h0.class, h0Var, abstractSerializedData, readInt323, z11);
        } else if (b10 == 4) {
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
        } else if (b10 == 5) {
            this.Q = abstractSerializedData.readInt64(z11);
            this.R = abstractSerializedData.readInt64(z11);
            this.S = abstractSerializedData.readInt64(z11);
            this.T = abstractSerializedData.readInt64(z11);
        } else if (b10 == 2) {
            this.f23241t = abstractSerializedData.readString(z11);
            if (abstractSerializedData.readInt32(z11) == 1151577037) {
                xe xeVar = new xe();
                this.f23242u = xeVar;
                xeVar.readParams(abstractSerializedData, z11);
            }
        } else if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            ?? tLObject = new TLObject();
            tLObject.f14883a = abstractSerializedData.readDouble(false);
            tLObject.f14884b = abstractSerializedData.readDouble(false);
            tLObject.f14885c = abstractSerializedData.readString(false);
            tLObject.d = abstractSerializedData.readFloat(false);
            this.O = tLObject;
        }
    }
}
