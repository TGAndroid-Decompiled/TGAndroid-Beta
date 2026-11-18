package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class gp {
    public final int f24289a;
    public final long f24290b;
    public final ArrayList f24291c = new ArrayList();
    public int d;
    public boolean f24292e;
    public boolean f24293f;

    public gp(int i7, long j3) {
        this.f24289a = i7;
        this.f24290b = j3;
    }

    public final TLRPC.Document a() {
        fj fjVar;
        ArrayList arrayList = this.f24291c;
        if (arrayList.isEmpty() || (fjVar = (fj) arrayList.get(0)) == null) {
            return null;
        }
        return fjVar.F0();
    }

    public final void b() {
        if (!this.f24293f && !this.f24292e) {
            this.f24293f = true;
            TLRPC.TL_getSavedMusic tL_getSavedMusic = new TLRPC.TL_getSavedMusic();
            int i7 = this.f24289a;
            tL_getSavedMusic.f28457id = mp.u1(i7).q1(this.f24290b);
            tL_getSavedMusic.offset = this.f24291c.size();
            tL_getSavedMusic.limit = 30;
            ConnectionsManager.getInstance(i7).sendRequest(tL_getSavedMusic, new s1(this, 6));
        }
    }

    public final void c(int i7, int i10) {
        fj fjVar;
        TLRPC.Document F0;
        TLRPC.Document a10 = a();
        ArrayList arrayList = this.f24291c;
        fj fjVar2 = (fj) arrayList.get(i7);
        arrayList.set(i7, (fj) arrayList.get(i10));
        arrayList.set(i10, fjVar2);
        if (a() != a10) {
            e();
        }
        if (i10 == 0) {
            fjVar = null;
        } else {
            fjVar = (fj) arrayList.get(i10 - 1);
        }
        TLRPC.Document F02 = fjVar2.F0();
        if (fjVar == null) {
            F0 = null;
        } else {
            F0 = fjVar.F0();
        }
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        if (F02 == null) {
            return;
        }
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f28431id = tL_inputDocument;
        tL_inputDocument.f28415id = F02.f28409id;
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
            tL_inputDocument2.f28415id = F0.f28409id;
            tL_inputDocument2.access_hash = F0.access_hash;
            byte[] bArr2 = F0.file_reference;
            tL_inputDocument2.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument2.file_reference = new byte[0];
            }
        }
        tL_account_saveMusic.unsave = false;
        ConnectionsManager.getInstance(this.f24289a).sendRequest(tL_account_saveMusic, null);
    }

    public final fj d(TLRPC.Document document) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28424id = bz.p();
        int i7 = this.f24289a;
        mp u12 = mp.u1(i7);
        long j3 = this.f24290b;
        tL_message.peer_id = u12.B1(j3);
        tL_message.from_id = mp.u1(i7).B1(j3);
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.document = document;
        fj fjVar = new fj(i7, tL_message, false, false);
        fjVar.K(true);
        return fjVar;
    }

    public final void e() {
        TLRPC.Document a10 = a();
        int i7 = this.f24289a;
        mp u12 = mp.u1(i7);
        long j3 = this.f24290b;
        TLRPC.UserFull d2 = u12.d2(j3);
        if (d2 == null) {
            return;
        }
        if (a10 == null) {
            d2.flags2 &= -2097153;
            d2.saved_music = null;
        } else {
            d2.flags2 |= 2097152;
            d2.saved_music = a10;
        }
        tr.a0(i7).j2(d2, false);
        j10.i(i7).v(true);
        ks.f(i7).k(ks.Y3, Long.valueOf(j3));
    }
}
