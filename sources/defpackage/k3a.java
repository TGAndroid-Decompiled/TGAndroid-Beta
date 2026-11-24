package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k3a {
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
    public final z3a L;
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
    public k27 m;
    public TLRPC.EncryptedChat n;
    public oac o;
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

    public k3a(z3a z3aVar, long j) {
        this.L = z3aVar;
        this.a = j;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, k3a k3aVar, boolean z) {
        ?? obj = new Object();
        obj.a = tLObject;
        obj.c = arrayList;
        obj.e = arrayList2;
        obj.g = k3aVar;
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
        int i = kk7.L;
        z3a z3aVar = this.L;
        if (b == 4) {
            for (int i2 = 0; i2 < this.x.size(); i2++) {
                k27 k27Var = (k27) this.x.get(i2);
                z3aVar.getMessagesStorage().K0(k27Var.r1 ? 1 : 0, k27Var.k);
                TLRPC.Message message = k27Var.k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                z3aVar.getNotificationCenter().k(i, Integer.valueOf(k27Var.e1()));
                z3aVar.c0(k27Var.e1());
                z3aVar.i0(k27Var.e1(), this.H);
            }
            z3aVar.a.remove("group_" + this.F);
        } else {
            ad7 messagesStorage = z3aVar.getMessagesStorage();
            k27 k27Var2 = this.m;
            messagesStorage.K0(k27Var2.r1 ? 1 : 0, k27Var2.k);
            TLRPC.Message message2 = this.m.k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            z3aVar.getNotificationCenter().k(i, Integer.valueOf(this.m.e1()));
            z3aVar.c0(this.m.e1());
            z3aVar.i0(this.m.e1(), this.H);
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
                    l3a l3aVar = (l3a) this.b.get(i);
                    TLObject tLObject = l3aVar.a;
                    boolean z = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    z3a z3aVar = this.L;
                    if (z) {
                        z3aVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) l3aVar.a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        z3aVar.O((TLRPC.TL_messages_sendMultiMedia) tLObject, l3aVar.c, l3aVar.e, l3aVar.f, l3aVar.g, l3aVar.i);
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                z3aVar.O(tL_messages_sendMedia, l3aVar.c, l3aVar.e, l3aVar.f, l3aVar.g, l3aVar.i);
                            } else {
                                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                                if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                    z3aVar.O(tL_messages_sendMedia2, l3aVar.c, l3aVar.e, l3aVar.f, l3aVar.g, l3aVar.i);
                                }
                            }
                        }
                        z3aVar.M(tLObject, l3aVar.b, l3aVar.d, l3aVar.g, l3aVar.h, null, l3aVar.i);
                    }
                }
                this.b = null;
            }
        }
    }
}
