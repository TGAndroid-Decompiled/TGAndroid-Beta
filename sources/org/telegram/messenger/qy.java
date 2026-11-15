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
    public final long f26147a;
    public ArrayList f26148b;
    public TLObject f26149c;
    public TLObject d;
    public int f26150e;
    public String f26151f;
    public TLRPC.PhotoSize f26152g;
    public TLObject h;
    public TLRPC.PhotoSize f26153i;
    public TLRPC.InputFile f26154j;
    public boolean f26155k;
    public String f26156l;
    public gj f26157m;
    public TLRPC.EncryptedChat f26158n;
    public g20 f26159o;
    public boolean f26160p;
    public boolean f26161q;
    public boolean f26162r;
    public boolean[] f26163s;
    public TLRPC.InputMedia f26164t;
    public ArrayList f26165u;
    public ArrayList v;
    public ArrayList f26166w;
    public ArrayList f26167x;
    public ArrayList f26168y;
    public ArrayList f26169z;

    public qy(ez ezVar, long j3) {
        this.L = ezVar;
        this.f26147a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, qy qyVar, boolean z10) {
        ?? obj = new Object();
        obj.f26374a = tLObject;
        obj.f26376c = arrayList;
        obj.f26377e = arrayList2;
        obj.f26379g = qyVar;
        obj.f26378f = arrayList3;
        obj.f26380i = z10;
        if (this.f26148b == null) {
            this.f26148b = new ArrayList();
        }
        this.f26148b.add(obj);
    }

    public final void b(long j3) {
        this.f26150e = 4;
        this.F = j3;
        this.f26167x = new ArrayList();
        this.f26169z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f26168y = new ArrayList();
        this.E = new HashMap();
        this.f26165u = new ArrayList();
        this.v = new ArrayList();
        this.f26166w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i7 = this.f26150e;
        int i10 = ns.M;
        ez ezVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.f26167x.size(); i11++) {
                gj gjVar = (gj) this.f26167x.get(i11);
                ezVar.getMessagesStorage().N0(gjVar.f23846r1 ? 1 : 0, gjVar.f23817k);
                TLRPC.Message message = gjVar.f23817k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                ezVar.getNotificationCenter().k(i10, Integer.valueOf(gjVar.e1()));
                ezVar.d0(gjVar.e1());
                ezVar.j0(gjVar.e1(), this.H);
            }
            ezVar.f23386a.remove("group_" + this.F);
        } else {
            vr messagesStorage = ezVar.getMessagesStorage();
            gj gjVar2 = this.f26157m;
            messagesStorage.N0(gjVar2.f23846r1 ? 1 : 0, gjVar2.f23817k);
            TLRPC.Message message2 = this.f26157m.f23817k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            ezVar.getNotificationCenter().k(i10, Integer.valueOf(this.f26157m.e1()));
            ezVar.d0(this.f26157m.e1());
            ezVar.j0(this.f26157m.e1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f26148b;
        if (arrayList != null) {
            int i7 = this.f26150e;
            if (i7 == 4 || i7 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ry ryVar = (ry) this.f26148b.get(i10);
                    TLObject tLObject = ryVar.f26374a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    ez ezVar = this.L;
                    if (z10) {
                        ezVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) ryVar.f26374a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        ezVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, ryVar.f26376c, ryVar.f26377e, ryVar.f26378f, ryVar.f26379g, ryVar.f26380i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                ezVar.P(tL_messages_sendMedia, ryVar.f26376c, ryVar.f26377e, ryVar.f26378f, ryVar.f26379g, ryVar.f26380i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                ezVar.P(tL_messages_sendMedia2, ryVar.f26376c, ryVar.f26377e, ryVar.f26378f, ryVar.f26379g, ryVar.f26380i);
                            }
                        }
                        ezVar.N(tLObject, ryVar.f26375b, ryVar.d, ryVar.f26379g, ryVar.h, null, ryVar.f26380i);
                    }
                }
                this.f26148b = null;
            }
        }
    }
}
