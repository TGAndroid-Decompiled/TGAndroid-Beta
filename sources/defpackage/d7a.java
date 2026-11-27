package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d7a {
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
    public final r7a L;
    public final long a;
    public ArrayList b;
    public TLObject c;
    public TLObject d;
    public byte e;
    public String f;
    public TLRPC.PhotoSize g;
    public TLObject h;
    public TLRPC.PhotoSize i;
    public TLRPC.InputFile j;
    public boolean k;
    public String l;
    public r47 m;
    public TLRPC.EncryptedChat n;
    public oec o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean[] s;
    public TLRPC.InputMedia t;
    public ArrayList u;
    public ArrayList v;
    public ArrayList w;
    public ArrayList x;
    public ArrayList y;
    public ArrayList z;

    public d7a(r7a r7aVar, long j) {
        this.L = r7aVar;
        this.a = j;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, d7a d7aVar, boolean z) {
        ?? obj = new Object();
        obj.a = tLObject;
        obj.c = arrayList;
        obj.e = arrayList2;
        obj.g = d7aVar;
        obj.f = arrayList3;
        obj.i = z;
        ArrayList arrayList4 = this.b;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            this.b = arrayList4;
        }
        arrayList4.add(obj);
    }

    public final void b(long j) {
        this.e = (byte) 4;
        this.F = j;
        this.x = new ArrayList();
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.y = new ArrayList();
        this.E = new HashMap();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        byte b = this.e;
        int i = jn7.L;
        r7a r7aVar = this.L;
        if (b == 4) {
            for (int i2 = 0; i2 < this.x.size(); i2++) {
                r47 r47Var = (r47) this.x.get(i2);
                r7aVar.getMessagesStorage().N0(r47Var.r1 ? 1 : 0, r47Var.k);
                TLRPC.Message message = r47Var.k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                r7aVar.getNotificationCenter().k(i, Integer.valueOf(r47Var.e1()));
                r7aVar.c0(r47Var.e1());
                r7aVar.i0(r47Var.e1(), this.H);
            }
            r7aVar.a.remove("group_" + this.F);
        } else {
            kf7 messagesStorage = r7aVar.getMessagesStorage();
            r47 r47Var2 = this.m;
            messagesStorage.N0(r47Var2.r1 ? 1 : 0, r47Var2.k);
            TLRPC.Message message2 = this.m.k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            r7aVar.getNotificationCenter().k(i, Integer.valueOf(this.m.e1()));
            r7aVar.c0(this.m.e1());
            r7aVar.i0(this.m.e1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            byte b = this.e;
            if (b == 4 || b == 0) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    e7a e7aVar = (e7a) this.b.get(i);
                    TLObject tLObject = e7aVar.a;
                    boolean z = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    r7a r7aVar = this.L;
                    if (z) {
                        r7aVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) e7aVar.a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        r7aVar.O((TLRPC.TL_messages_sendMultiMedia) tLObject, e7aVar.c, e7aVar.e, e7aVar.f, e7aVar.g, e7aVar.i);
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                r7aVar.O(tL_messages_sendMedia, e7aVar.c, e7aVar.e, e7aVar.f, e7aVar.g, e7aVar.i);
                            } else {
                                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                                if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                    r7aVar.O(tL_messages_sendMedia2, e7aVar.c, e7aVar.e, e7aVar.f, e7aVar.g, e7aVar.i);
                                }
                            }
                        }
                        r7aVar.M(tLObject, e7aVar.b, e7aVar.d, e7aVar.g, e7aVar.h, null, e7aVar.i);
                    }
                }
                this.b = null;
            }
        }
    }
}
