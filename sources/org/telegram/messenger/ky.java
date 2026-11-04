package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ky {
    public ArrayList A;
    public ArrayList B;
    public ArrayList C;
    public ArrayList D;
    public HashMap E;
    public long F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public Object K;
    public final yy L;
    public final long f23891a;
    public ArrayList f23892b;
    public TLObject f23893c;
    public TLObject d;
    public int f23894e;
    public String f23895f;
    public TLRPC.PhotoSize f23896g;
    public TLObject h;
    public TLRPC.PhotoSize f23897i;
    public TLRPC.InputFile f23898j;
    public boolean f23899k;
    public String f23900l;
    public zi f23901m;
    public TLRPC.EncryptedChat f23902n;
    public b20 f23903o;
    public boolean f23904p;
    public boolean f23905q;
    public boolean f23906r;
    public boolean[] f23907s;
    public TLRPC.InputMedia f23908t;
    public ArrayList f23909u;
    public ArrayList v;
    public ArrayList f23910w;
    public ArrayList f23911x;
    public ArrayList f23912y;
    public ArrayList f23913z;

    public ky(yy yyVar, long j10) {
        this.L = yyVar;
        this.f23891a = j10;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ky kyVar, boolean z10) {
        ?? obj = new Object();
        obj.f24141a = tLObject;
        obj.f24143c = arrayList;
        obj.f24144e = arrayList2;
        obj.f24146g = kyVar;
        obj.f24145f = arrayList3;
        obj.f24147i = z10;
        if (this.f23892b == null) {
            this.f23892b = new ArrayList();
        }
        this.f23892b.add(obj);
    }

    public final void b(long j10) {
        this.f23894e = 4;
        this.F = j10;
        this.f23911x = new ArrayList();
        this.f23913z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f23912y = new ArrayList();
        this.E = new HashMap();
        this.f23909u = new ArrayList();
        this.v = new ArrayList();
        this.f23910w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i3 = this.f23894e;
        int i10 = hs.M;
        yy yyVar = this.L;
        if (i3 == 4) {
            for (int i11 = 0; i11 < this.f23911x.size(); i11++) {
                zi ziVar = (zi) this.f23911x.get(i11);
                yyVar.getMessagesStorage().N0(ziVar.f26887p1 ? 1 : 0, ziVar.f26868k);
                TLRPC.Message message = ziVar.f26868k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                yyVar.getNotificationCenter().k(i10, Integer.valueOf(ziVar.f1()));
                yyVar.d0(ziVar.f1());
                yyVar.j0(ziVar.f1(), this.H);
            }
            yyVar.f26678a.remove("group_" + this.F);
        } else {
            qr messagesStorage = yyVar.getMessagesStorage();
            zi ziVar2 = this.f23901m;
            messagesStorage.N0(ziVar2.f26887p1 ? 1 : 0, ziVar2.f26868k);
            TLRPC.Message message2 = this.f23901m.f26868k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            yyVar.getNotificationCenter().k(i10, Integer.valueOf(this.f23901m.f1()));
            yyVar.d0(this.f23901m.f1());
            yyVar.j0(this.f23901m.f1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f23892b;
        if (arrayList != null) {
            int i3 = this.f23894e;
            if (i3 == 4 || i3 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ly lyVar = (ly) this.f23892b.get(i10);
                    TLObject tLObject = lyVar.f24141a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    yy yyVar = this.L;
                    if (z10) {
                        yyVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) lyVar.f24141a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        yyVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, lyVar.f24143c, lyVar.f24144e, lyVar.f24145f, lyVar.f24146g, lyVar.f24147i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                yyVar.P(tL_messages_sendMedia, lyVar.f24143c, lyVar.f24144e, lyVar.f24145f, lyVar.f24146g, lyVar.f24147i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                yyVar.P(tL_messages_sendMedia2, lyVar.f24143c, lyVar.f24144e, lyVar.f24145f, lyVar.f24146g, lyVar.f24147i);
                            }
                        }
                        yyVar.N(tLObject, lyVar.f24142b, lyVar.d, lyVar.f24146g, lyVar.h, null, lyVar.f24147i);
                    }
                }
                this.f23892b = null;
            }
        }
    }
}
