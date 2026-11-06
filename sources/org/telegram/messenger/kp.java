package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class kp {
    public final int f23739a;
    public final long f23740b;
    public final ArrayList f23741c = new ArrayList();
    public int d;
    public boolean f23742e;
    public boolean f23743f;

    public kp(int i7, long j3) {
        this.f23739a = i7;
        this.f23740b = j3;
    }

    public final TLRPC.Document a() {
        ij ijVar;
        ArrayList arrayList = this.f23741c;
        if (arrayList.isEmpty() || (ijVar = (ij) arrayList.get(0)) == null) {
            return null;
        }
        return ijVar.F0();
    }

    public final void b() {
        if (!this.f23743f && !this.f23742e) {
            this.f23743f = true;
            TLRPC.TL_getSavedMusic tL_getSavedMusic = new TLRPC.TL_getSavedMusic();
            int i7 = this.f23739a;
            tL_getSavedMusic.f27007id = qp.s1(i7).o1(this.f23740b);
            tL_getSavedMusic.offset = this.f23741c.size();
            tL_getSavedMusic.limit = 30;
            ConnectionsManager.getInstance(i7).sendRequest(tL_getSavedMusic, new s1(this, 6));
        }
    }

    public final void c(int i7, int i10) {
        ij ijVar;
        TLRPC.Document F0;
        TLRPC.Document a10 = a();
        ArrayList arrayList = this.f23741c;
        ij ijVar2 = (ij) arrayList.get(i7);
        arrayList.set(i7, (ij) arrayList.get(i10));
        arrayList.set(i10, ijVar2);
        if (a() != a10) {
            e();
        }
        if (i10 == 0) {
            ijVar = null;
        } else {
            ijVar = (ij) arrayList.get(i10 - 1);
        }
        TLRPC.Document F02 = ijVar2.F0();
        if (ijVar == null) {
            F0 = null;
        } else {
            F0 = ijVar.F0();
        }
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        if (F02 == null) {
            return;
        }
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f26981id = tL_inputDocument;
        tL_inputDocument.f26965id = F02.f26959id;
        tL_inputDocument.access_hash = F02.access_hash;
        byte[] bArr = F02.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        if (F0 != null) {
            tL_account_saveMusic.flags |= 2;
            TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.after_id = tL_inputDocument2;
            tL_inputDocument2.f26965id = F0.f26959id;
            tL_inputDocument2.access_hash = F0.access_hash;
            byte[] bArr2 = F0.file_reference;
            tL_inputDocument2.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument2.file_reference = new byte[0];
            }
        }
        tL_account_saveMusic.unsave = false;
        ConnectionsManager.getInstance(this.f23739a).sendRequest(tL_account_saveMusic, null);
    }

    public final ij d(TLRPC.Document document) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f26974id = iz.p();
        int i7 = this.f23739a;
        qp s12 = qp.s1(i7);
        long j3 = this.f23740b;
        tL_message.peer_id = s12.z1(j3);
        tL_message.from_id = qp.s1(i7).z1(j3);
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.document = document;
        ij ijVar = new ij(i7, tL_message, false, false);
        ijVar.K(true);
        return ijVar;
    }

    public final void e() {
        TLRPC.Document a10 = a();
        int i7 = this.f23739a;
        qp s12 = qp.s1(i7);
        long j3 = this.f23740b;
        TLRPC.UserFull b22 = s12.b2(j3);
        if (b22 == null) {
            return;
        }
        if (a10 == null) {
            b22.flags2 &= -2097153;
            b22.saved_music = null;
        } else {
            b22.flags2 |= 2097152;
            b22.saved_music = a10;
        }
        yr.a0(i7).j2(b22, false);
        p10.i(i7).v(true);
        qs.f(i7).k(qs.V3, Long.valueOf(j3));
    }
}
