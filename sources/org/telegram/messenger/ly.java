package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ly {
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
    public final zy L;
    public final long f25574a;
    public ArrayList f25575b;
    public TLObject f25576c;
    public TLObject d;
    public int f25577e;
    public String f25578f;
    public TLRPC.PhotoSize f25579g;
    public TLObject h;
    public TLRPC.PhotoSize f25580i;
    public TLRPC.InputFile f25581j;
    public boolean f25582k;
    public String f25583l;
    public fj f25584m;
    public TLRPC.EncryptedChat f25585n;
    public d20 f25586o;
    public boolean f25587p;
    public boolean f25588q;
    public boolean f25589r;
    public boolean[] f25590s;
    public TLRPC.InputMedia f25591t;
    public ArrayList f25592u;
    public ArrayList v;
    public ArrayList f25593w;
    public ArrayList f25594x;
    public ArrayList f25595y;
    public ArrayList f25596z;

    public ly(zy zyVar, long j3) {
        this.L = zyVar;
        this.f25574a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ly lyVar, boolean z10) {
        ?? obj = new Object();
        obj.f25953a = tLObject;
        obj.f25955c = arrayList;
        obj.f25956e = arrayList2;
        obj.f25958g = lyVar;
        obj.f25957f = arrayList3;
        obj.f25959i = z10;
        if (this.f25575b == null) {
            this.f25575b = new ArrayList();
        }
        this.f25575b.add(obj);
    }

    public final void b(long j3) {
        this.f25577e = 4;
        this.F = j3;
        this.f25594x = new ArrayList();
        this.f25596z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f25595y = new ArrayList();
        this.E = new HashMap();
        this.f25592u = new ArrayList();
        this.v = new ArrayList();
        this.f25593w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i7 = this.f25577e;
        int i10 = ks.M;
        zy zyVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.f25594x.size(); i11++) {
                fj fjVar = (fj) this.f25594x.get(i11);
                zyVar.getMessagesStorage().N0(fjVar.f24102r1 ? 1 : 0, fjVar.f24073k);
                TLRPC.Message message = fjVar.f24073k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                zyVar.getNotificationCenter().k(i10, Integer.valueOf(fjVar.e1()));
                zyVar.d0(fjVar.e1());
                zyVar.j0(fjVar.e1(), this.H);
            }
            zyVar.f28477a.remove("group_" + this.F);
        } else {
            tr messagesStorage = zyVar.getMessagesStorage();
            fj fjVar2 = this.f25584m;
            messagesStorage.N0(fjVar2.f24102r1 ? 1 : 0, fjVar2.f24073k);
            TLRPC.Message message2 = this.f25584m.f24073k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            zyVar.getNotificationCenter().k(i10, Integer.valueOf(this.f25584m.e1()));
            zyVar.d0(this.f25584m.e1());
            zyVar.j0(this.f25584m.e1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f25575b;
        if (arrayList != null) {
            int i7 = this.f25577e;
            if (i7 == 4 || i7 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    my myVar = (my) this.f25575b.get(i10);
                    TLObject tLObject = myVar.f25953a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    zy zyVar = this.L;
                    if (z10) {
                        zyVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) myVar.f25953a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        zyVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, myVar.f25955c, myVar.f25956e, myVar.f25957f, myVar.f25958g, myVar.f25959i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                zyVar.P(tL_messages_sendMedia, myVar.f25955c, myVar.f25956e, myVar.f25957f, myVar.f25958g, myVar.f25959i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                zyVar.P(tL_messages_sendMedia2, myVar.f25955c, myVar.f25956e, myVar.f25957f, myVar.f25958g, myVar.f25959i);
                            }
                        }
                        zyVar.N(tLObject, myVar.f25954b, myVar.d, myVar.f25958g, myVar.h, null, myVar.f25959i);
                    }
                }
                this.f25575b = null;
            }
        }
    }
}
