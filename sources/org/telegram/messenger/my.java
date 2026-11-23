package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class my {
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
    public final az L;
    public final long f25625a;
    public ArrayList f25626b;
    public TLObject f25627c;
    public TLObject d;
    public int f25628e;
    public String f25629f;
    public TLRPC.PhotoSize f25630g;
    public TLObject h;
    public TLRPC.PhotoSize f25631i;
    public TLRPC.InputFile f25632j;
    public boolean f25633k;
    public String f25634l;
    public gj f25635m;
    public TLRPC.EncryptedChat f25636n;
    public f20 f25637o;
    public boolean f25638p;
    public boolean f25639q;
    public boolean f25640r;
    public boolean[] f25641s;
    public TLRPC.InputMedia f25642t;
    public ArrayList f25643u;
    public ArrayList v;
    public ArrayList f25644w;
    public ArrayList f25645x;
    public ArrayList f25646y;
    public ArrayList f25647z;

    public my(az azVar, long j3) {
        this.L = azVar;
        this.f25625a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, my myVar, boolean z10) {
        ?? obj = new Object();
        obj.f26021a = tLObject;
        obj.f26023c = arrayList;
        obj.f26024e = arrayList2;
        obj.f26026g = myVar;
        obj.f26025f = arrayList3;
        obj.f26027i = z10;
        if (this.f25626b == null) {
            this.f25626b = new ArrayList();
        }
        this.f25626b.add(obj);
    }

    public final void b(long j3) {
        this.f25628e = 4;
        this.F = j3;
        this.f25645x = new ArrayList();
        this.f25647z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f25646y = new ArrayList();
        this.E = new HashMap();
        this.f25643u = new ArrayList();
        this.v = new ArrayList();
        this.f25644w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i7 = this.f25628e;
        int i10 = ls.M;
        az azVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.f25645x.size(); i11++) {
                gj gjVar = (gj) this.f25645x.get(i11);
                azVar.getMessagesStorage().N0(gjVar.f24206r1 ? 1 : 0, gjVar.f24177k);
                TLRPC.Message message = gjVar.f24177k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                azVar.getNotificationCenter().k(i10, Integer.valueOf(gjVar.e1()));
                azVar.d0(gjVar.e1());
                azVar.j0(gjVar.e1(), this.H);
            }
            azVar.f22968a.remove("group_" + this.F);
        } else {
            ur messagesStorage = azVar.getMessagesStorage();
            gj gjVar2 = this.f25635m;
            messagesStorage.N0(gjVar2.f24206r1 ? 1 : 0, gjVar2.f24177k);
            TLRPC.Message message2 = this.f25635m.f24177k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            azVar.getNotificationCenter().k(i10, Integer.valueOf(this.f25635m.e1()));
            azVar.d0(this.f25635m.e1());
            azVar.j0(this.f25635m.e1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f25626b;
        if (arrayList != null) {
            int i7 = this.f25628e;
            if (i7 == 4 || i7 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ny nyVar = (ny) this.f25626b.get(i10);
                    TLObject tLObject = nyVar.f26021a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    az azVar = this.L;
                    if (z10) {
                        azVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) nyVar.f26021a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        azVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, nyVar.f26023c, nyVar.f26024e, nyVar.f26025f, nyVar.f26026g, nyVar.f26027i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                azVar.P(tL_messages_sendMedia, nyVar.f26023c, nyVar.f26024e, nyVar.f26025f, nyVar.f26026g, nyVar.f26027i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                azVar.P(tL_messages_sendMedia2, nyVar.f26023c, nyVar.f26024e, nyVar.f26025f, nyVar.f26026g, nyVar.f26027i);
                            }
                        }
                        azVar.N(tLObject, nyVar.f26022b, nyVar.d, nyVar.f26026g, nyVar.h, null, nyVar.f26027i);
                    }
                }
                this.f25626b = null;
            }
        }
    }
}
