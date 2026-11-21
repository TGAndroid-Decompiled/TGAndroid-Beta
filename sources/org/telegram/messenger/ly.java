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
    public final long f25483a;
    public ArrayList f25484b;
    public TLObject f25485c;
    public TLObject d;
    public int f25486e;
    public String f25487f;
    public TLRPC.PhotoSize f25488g;
    public TLObject h;
    public TLRPC.PhotoSize f25489i;
    public TLRPC.InputFile f25490j;
    public boolean f25491k;
    public String f25492l;
    public fj f25493m;
    public TLRPC.EncryptedChat f25494n;
    public e20 f25495o;
    public boolean f25496p;
    public boolean f25497q;
    public boolean f25498r;
    public boolean[] f25499s;
    public TLRPC.InputMedia f25500t;
    public ArrayList f25501u;
    public ArrayList v;
    public ArrayList f25502w;
    public ArrayList f25503x;
    public ArrayList f25504y;
    public ArrayList f25505z;

    public ly(zy zyVar, long j3) {
        this.L = zyVar;
        this.f25483a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ly lyVar, boolean z10) {
        ?? obj = new Object();
        obj.f25886a = tLObject;
        obj.f25888c = arrayList;
        obj.f25889e = arrayList2;
        obj.f25891g = lyVar;
        obj.f25890f = arrayList3;
        obj.f25892i = z10;
        if (this.f25484b == null) {
            this.f25484b = new ArrayList();
        }
        this.f25484b.add(obj);
    }

    public final void b(long j3) {
        this.f25486e = 4;
        this.F = j3;
        this.f25503x = new ArrayList();
        this.f25505z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f25504y = new ArrayList();
        this.E = new HashMap();
        this.f25501u = new ArrayList();
        this.v = new ArrayList();
        this.f25502w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i7 = this.f25486e;
        int i10 = ks.M;
        zy zyVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.f25503x.size(); i11++) {
                fj fjVar = (fj) this.f25503x.get(i11);
                zyVar.getMessagesStorage().N0(fjVar.f24022r1 ? 1 : 0, fjVar.f23993k);
                TLRPC.Message message = fjVar.f23993k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                zyVar.getNotificationCenter().k(i10, Integer.valueOf(fjVar.e1()));
                zyVar.d0(fjVar.e1());
                zyVar.j0(fjVar.e1(), this.H);
            }
            zyVar.f28413a.remove("group_" + this.F);
        } else {
            tr messagesStorage = zyVar.getMessagesStorage();
            fj fjVar2 = this.f25493m;
            messagesStorage.N0(fjVar2.f24022r1 ? 1 : 0, fjVar2.f23993k);
            TLRPC.Message message2 = this.f25493m.f23993k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            zyVar.getNotificationCenter().k(i10, Integer.valueOf(this.f25493m.e1()));
            zyVar.d0(this.f25493m.e1());
            zyVar.j0(this.f25493m.e1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f25484b;
        if (arrayList != null) {
            int i7 = this.f25486e;
            if (i7 == 4 || i7 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    my myVar = (my) this.f25484b.get(i10);
                    TLObject tLObject = myVar.f25886a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    zy zyVar = this.L;
                    if (z10) {
                        zyVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) myVar.f25886a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        zyVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, myVar.f25888c, myVar.f25889e, myVar.f25890f, myVar.f25891g, myVar.f25892i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                zyVar.P(tL_messages_sendMedia, myVar.f25888c, myVar.f25889e, myVar.f25890f, myVar.f25891g, myVar.f25892i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                zyVar.P(tL_messages_sendMedia2, myVar.f25888c, myVar.f25889e, myVar.f25890f, myVar.f25891g, myVar.f25892i);
                            }
                        }
                        zyVar.N(tLObject, myVar.f25887b, myVar.d, myVar.f25891g, myVar.h, null, myVar.f25892i);
                    }
                }
                this.f25484b = null;
            }
        }
    }
}
