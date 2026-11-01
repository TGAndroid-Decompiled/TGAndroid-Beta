package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dz {
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
    public final rz L;
    public final long f15463a;
    public ArrayList f15464b;
    public TLObject f15465c;
    public TLObject d;
    public int e;
    public String f15466f;
    public TLRPC.PhotoSize f15467g;
    public TLObject h;
    public TLRPC.PhotoSize f15468i;
    public TLRPC.InputFile f15469j;
    public boolean f15470k;
    public String f15471l;
    public kj f15472m;
    public TLRPC.EncryptedChat f15473n;
    public y20 f15474o;
    public boolean f15475p;
    public boolean f15476q;
    public boolean f15477r;
    public boolean[] f15478s;
    public TLRPC.InputMedia f15479t;
    public ArrayList f15480u;
    public ArrayList v;
    public ArrayList f15481w;
    public ArrayList f15482x;
    public ArrayList f15483y;
    public ArrayList f15484z;

    public dz(rz rzVar, long j10) {
        this.L = rzVar;
        this.f15463a = j10;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, dz dzVar, boolean z10) {
        ?? obj = new Object();
        obj.f15664a = tLObject;
        obj.f15666c = arrayList;
        obj.e = arrayList2;
        obj.f15668g = dzVar;
        obj.f15667f = arrayList3;
        obj.f15669i = z10;
        if (this.f15464b == null) {
            this.f15464b = new ArrayList();
        }
        this.f15464b.add(obj);
    }

    public final void b(long j10) {
        this.e = 4;
        this.F = j10;
        this.f15482x = new ArrayList();
        this.f15484z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f15483y = new ArrayList();
        this.E = new HashMap();
        this.f15480u = new ArrayList();
        this.v = new ArrayList();
        this.f15481w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i10 = this.e;
        int i11 = at.M;
        rz rzVar = this.L;
        if (i10 == 4) {
            for (int i12 = 0; i12 < this.f15482x.size(); i12++) {
                kj kjVar = (kj) this.f15482x.get(i12);
                rzVar.getMessagesStorage().N0(kjVar.f16710p1 ? 1 : 0, kjVar.f16690k);
                TLRPC.Message message = kjVar.f16690k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                rzVar.getNotificationCenter().k(i11, Integer.valueOf(kjVar.f1()));
                rzVar.d0(kjVar.f1());
                rzVar.j0(kjVar.f1(), this.H);
            }
            rzVar.f18004a.remove("group_" + this.F);
        } else {
            is messagesStorage = rzVar.getMessagesStorage();
            kj kjVar2 = this.f15472m;
            messagesStorage.N0(kjVar2.f16710p1 ? 1 : 0, kjVar2.f16690k);
            TLRPC.Message message2 = this.f15472m.f16690k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            rzVar.getNotificationCenter().k(i11, Integer.valueOf(this.f15472m.f1()));
            rzVar.d0(this.f15472m.f1());
            rzVar.j0(this.f15472m.f1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f15464b;
        if (arrayList != null) {
            int i10 = this.e;
            if (i10 == 4 || i10 == 0) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ez ezVar = (ez) this.f15464b.get(i11);
                    TLObject tLObject = ezVar.f15664a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    rz rzVar = this.L;
                    if (z10) {
                        rzVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) ezVar.f15664a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        rzVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, ezVar.f15666c, ezVar.e, ezVar.f15667f, ezVar.f15668g, ezVar.f15669i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                rzVar.P(tL_messages_sendMedia, ezVar.f15666c, ezVar.e, ezVar.f15667f, ezVar.f15668g, ezVar.f15669i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                rzVar.P(tL_messages_sendMedia2, ezVar.f15666c, ezVar.e, ezVar.f15667f, ezVar.f15668g, ezVar.f15669i);
                            }
                        }
                        rzVar.N(tLObject, ezVar.f15665b, ezVar.d, ezVar.f15668g, ezVar.h, null, ezVar.f15669i);
                    }
                }
                this.f15464b = null;
            }
        }
    }
}
