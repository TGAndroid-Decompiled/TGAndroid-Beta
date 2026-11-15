package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qy {
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
    public final ez L;
    public final long f26155a;
    public ArrayList f26156b;
    public TLObject f26157c;
    public TLObject d;
    public int f26158e;
    public String f26159f;
    public TLRPC.PhotoSize f26160g;
    public TLObject h;
    public TLRPC.PhotoSize f26161i;
    public TLRPC.InputFile f26162j;
    public boolean f26163k;
    public String f26164l;
    public gj f26165m;
    public TLRPC.EncryptedChat f26166n;
    public g20 f26167o;
    public boolean f26168p;
    public boolean f26169q;
    public boolean f26170r;
    public boolean[] f26171s;
    public TLRPC.InputMedia f26172t;
    public ArrayList f26173u;
    public ArrayList v;
    public ArrayList f26174w;
    public ArrayList f26175x;
    public ArrayList f26176y;
    public ArrayList f26177z;

    public qy(ez ezVar, long j3) {
        this.L = ezVar;
        this.f26155a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, qy qyVar, boolean z10) {
        ?? obj = new Object();
        obj.f26384a = tLObject;
        obj.f26386c = arrayList;
        obj.f26387e = arrayList2;
        obj.f26389g = qyVar;
        obj.f26388f = arrayList3;
        obj.f26390i = z10;
        if (this.f26156b == null) {
            this.f26156b = new ArrayList();
        }
        this.f26156b.add(obj);
    }

    public final void b(long j3) {
        this.f26158e = 4;
        this.F = j3;
        this.f26175x = new ArrayList();
        this.f26177z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f26176y = new ArrayList();
        this.E = new HashMap();
        this.f26173u = new ArrayList();
        this.v = new ArrayList();
        this.f26174w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i7 = this.f26158e;
        int i10 = ns.M;
        ez ezVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.f26175x.size(); i11++) {
                gj gjVar = (gj) this.f26175x.get(i11);
                ezVar.getMessagesStorage().N0(gjVar.f23848r1 ? 1 : 0, gjVar.f23819k);
                TLRPC.Message message = gjVar.f23819k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                ezVar.getNotificationCenter().k(i10, Integer.valueOf(gjVar.e1()));
                ezVar.d0(gjVar.e1());
                ezVar.j0(gjVar.e1(), this.H);
            }
            ezVar.f23389a.remove("group_" + this.F);
        } else {
            vr messagesStorage = ezVar.getMessagesStorage();
            gj gjVar2 = this.f26165m;
            messagesStorage.N0(gjVar2.f23848r1 ? 1 : 0, gjVar2.f23819k);
            TLRPC.Message message2 = this.f26165m.f23819k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            ezVar.getNotificationCenter().k(i10, Integer.valueOf(this.f26165m.e1()));
            ezVar.d0(this.f26165m.e1());
            ezVar.j0(this.f26165m.e1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f26156b;
        if (arrayList != null) {
            int i7 = this.f26158e;
            if (i7 == 4 || i7 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ry ryVar = (ry) this.f26156b.get(i10);
                    TLObject tLObject = ryVar.f26384a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    ez ezVar = this.L;
                    if (z10) {
                        ezVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) ryVar.f26384a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        ezVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, ryVar.f26386c, ryVar.f26387e, ryVar.f26388f, ryVar.f26389g, ryVar.f26390i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                ezVar.P(tL_messages_sendMedia, ryVar.f26386c, ryVar.f26387e, ryVar.f26388f, ryVar.f26389g, ryVar.f26390i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                ezVar.P(tL_messages_sendMedia2, ryVar.f26386c, ryVar.f26387e, ryVar.f26388f, ryVar.f26389g, ryVar.f26390i);
                            }
                        }
                        ezVar.N(tLObject, ryVar.f26385b, ryVar.d, ryVar.f26389g, ryVar.h, null, ryVar.f26390i);
                    }
                }
                this.f26156b = null;
            }
        }
    }
}
