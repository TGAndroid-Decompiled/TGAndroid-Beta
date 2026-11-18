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
public final class c20 {
    public boolean A;
    public TLRPC.Document B;
    public Object C;
    public RLottieNative D;
    public float E;
    public float F;
    public Bitmap G;
    public Matrix H;
    public View I;
    public org.telegram.ui.Components.b6 J;
    public boolean K;
    public Canvas L;
    public TL_stories.MediaArea M;
    public TLRPC.MessageMedia N;
    public hi.qb O;
    public float P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public tg.h0 W;
    public byte f23229a;
    public byte f23230b;
    public float f23231c;
    public float d;
    public float f23232e;
    public float f23233f;
    public float f23234g;
    public float h;
    public float f23235i;
    public String f23236j;
    public ArrayList f23237k;
    public int f23238l;
    public int f23239m;
    public sg.a0 f23240n;
    public String f23241o;
    public int f23242p;
    public int f23243q;
    public int f23244r;
    public float f23245s;
    public String f23246t;
    public we f23247u;
    public float v;
    public float f23248w;
    public float f23249x;
    public float f23250y;
    public float f23251z;

    public c20() {
        this.f23236j = "";
        this.f23237k = new ArrayList();
        this.f23246t = "";
        this.v = 1.0f;
    }

    public final c20 a() {
        c20 c20Var = new c20();
        c20Var.f23229a = this.f23229a;
        c20Var.f23230b = this.f23230b;
        c20Var.f23231c = this.f23231c;
        c20Var.d = this.d;
        c20Var.f23232e = this.f23232e;
        c20Var.f23233f = this.f23233f;
        c20Var.f23234g = this.f23234g;
        c20Var.f23235i = this.f23235i;
        c20Var.f23236j = this.f23236j;
        if (this.f23237k != null) {
            ArrayList arrayList = new ArrayList();
            c20Var.f23237k = arrayList;
            arrayList.addAll(this.f23237k);
        }
        c20Var.f23238l = this.f23238l;
        c20Var.f23239m = this.f23239m;
        c20Var.f23240n = this.f23240n;
        c20Var.f23241o = this.f23241o;
        c20Var.f23242p = this.f23242p;
        c20Var.f23243q = this.f23243q;
        c20Var.f23244r = this.f23244r;
        c20Var.f23245s = this.f23245s;
        c20Var.v = this.v;
        c20Var.f23248w = this.f23248w;
        c20Var.f23249x = this.f23249x;
        c20Var.f23250y = this.f23250y;
        c20Var.f23251z = this.f23251z;
        c20Var.B = this.B;
        c20Var.C = this.C;
        c20Var.D = this.D;
        c20Var.E = this.E;
        c20Var.F = this.F;
        c20Var.G = this.G;
        c20Var.I = this.I;
        c20Var.J = this.J;
        c20Var.L = this.L;
        c20Var.M = this.M;
        c20Var.N = this.N;
        c20Var.P = this.P;
        c20Var.U = this.U;
        c20Var.V = this.V;
        c20Var.Q = this.Q;
        c20Var.T = this.T;
        c20Var.R = this.R;
        c20Var.S = this.S;
        c20Var.W = this.W;
        c20Var.O = this.O;
        return c20Var;
    }

    public final void b(AbstractSerializedData abstractSerializedData, boolean z10) {
        String str;
        abstractSerializedData.writeByte(this.f23229a);
        abstractSerializedData.writeByte(this.f23230b);
        abstractSerializedData.writeFloat(this.f23231c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.f23232e);
        abstractSerializedData.writeFloat(this.f23233f);
        abstractSerializedData.writeFloat(this.f23234g);
        abstractSerializedData.writeString(this.f23236j);
        abstractSerializedData.writeInt32(this.f23237k.size());
        for (int i7 = 0; i7 < this.f23237k.size(); i7++) {
            ((b20) this.f23237k.get(i7)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.f23238l);
        abstractSerializedData.writeInt32(this.f23239m);
        abstractSerializedData.writeInt32(this.f23243q);
        abstractSerializedData.writeInt32(this.f23244r);
        abstractSerializedData.writeInt32(this.f23242p);
        sg.a0 a0Var = this.f23240n;
        if (a0Var == null) {
            str = this.f23241o;
            if (str == null) {
                str = "";
            }
        } else {
            str = a0Var.f57154a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.f23248w);
        abstractSerializedData.writeFloat(this.f23249x);
        abstractSerializedData.writeFloat(this.f23250y);
        abstractSerializedData.writeFloat(this.f23251z);
        if (z10) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b10 = this.f23229a;
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
            abstractSerializedData.writeString(this.f23246t);
            we weVar = this.f23247u;
            if (weVar != null) {
                weVar.serializeToStream(abstractSerializedData);
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

    public c20(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
        sg.a0 a0Var;
        this.f23236j = "";
        this.f23237k = new ArrayList();
        this.f23246t = "";
        this.v = 1.0f;
        this.f23229a = abstractSerializedData.readByte(z11);
        this.f23230b = abstractSerializedData.readByte(z11);
        this.f23231c = abstractSerializedData.readFloat(z11);
        this.d = abstractSerializedData.readFloat(z11);
        this.f23232e = abstractSerializedData.readFloat(z11);
        this.f23233f = abstractSerializedData.readFloat(z11);
        this.f23234g = abstractSerializedData.readFloat(z11);
        this.f23236j = abstractSerializedData.readString(z11);
        int readInt32 = abstractSerializedData.readInt32(z11);
        for (int i7 = 0; i7 < readInt32; i7++) {
            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
            abstractSerializedData.readInt32(z11);
            tL_messageEntityCustomEmoji.readParams(abstractSerializedData, z11);
            this.f23237k.add(tL_messageEntityCustomEmoji);
        }
        this.f23238l = abstractSerializedData.readInt32(z11);
        this.f23239m = abstractSerializedData.readInt32(z11);
        this.f23243q = abstractSerializedData.readInt32(z11);
        this.f23244r = abstractSerializedData.readInt32(z11);
        this.f23242p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.f23241o = readString;
        sg.a0 a0Var2 = sg.a0.f57150e;
        tg.h0 h0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = sg.a0.c();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                a0Var = (sg.a0) c10.get(i10);
                if (a0Var != null && TextUtils.equals(readString, a0Var.f57154a)) {
                    break;
                }
            }
        }
        a0Var = null;
        this.f23240n = a0Var;
        this.v = abstractSerializedData.readFloat(z11);
        this.f23248w = abstractSerializedData.readFloat(z11);
        this.f23249x = abstractSerializedData.readFloat(z11);
        this.f23250y = abstractSerializedData.readFloat(z11);
        this.f23251z = abstractSerializedData.readFloat(z11);
        if (z10) {
            int readInt322 = abstractSerializedData.readInt32(z11);
            if (readInt322 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z11);
            }
        }
        byte b10 = this.f23229a;
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
                int i11 = tg.h0.f57891j;
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
            this.f23246t = abstractSerializedData.readString(z11);
            if (abstractSerializedData.readInt32(z11) == 1151577037) {
                we weVar = new we();
                this.f23247u = weVar;
                weVar.readParams(abstractSerializedData, z11);
            }
        } else if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            ?? tLObject = new TLObject();
            tLObject.f15295a = abstractSerializedData.readDouble(false);
            tLObject.f15296b = abstractSerializedData.readDouble(false);
            tLObject.f15297c = abstractSerializedData.readString(false);
            tLObject.d = abstractSerializedData.readFloat(false);
            this.O = tLObject;
        }
    }
}
