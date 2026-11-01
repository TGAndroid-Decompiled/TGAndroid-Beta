package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class qp {
    public final int f17802a;
    public final long f17803b;
    public final ArrayList f17804c = new ArrayList();
    public int d;
    public boolean e;
    public boolean f17805f;

    public qp(int i10, long j10) {
        this.f17802a = i10;
        this.f17803b = j10;
    }

    public final TLRPC.Document a() {
        kj kjVar;
        ArrayList arrayList = this.f17804c;
        if (arrayList.isEmpty() || (kjVar = (kj) arrayList.get(0)) == null) {
            return null;
        }
        return kjVar.F0();
    }

    public final void b() {
        if (!this.f17805f && !this.e) {
            this.f17805f = true;
            TLRPC.TL_getSavedMusic tL_getSavedMusic = new TLRPC.TL_getSavedMusic();
            int i10 = this.f17802a;
            tL_getSavedMusic.f19848id = wp.r1(i10).n1(this.f17803b);
            tL_getSavedMusic.offset = this.f17804c.size();
            tL_getSavedMusic.limit = 30;
            ConnectionsManager.getInstance(i10).sendRequest(tL_getSavedMusic, new v1(this, 6));
        }
    }

    public final void c(int i10, int i11) {
        kj kjVar;
        TLRPC.Document F0;
        TLRPC.Document a2 = a();
        ArrayList arrayList = this.f17804c;
        kj kjVar2 = (kj) arrayList.get(i10);
        arrayList.set(i10, (kj) arrayList.get(i11));
        arrayList.set(i11, kjVar2);
        if (a() != a2) {
            e();
        }
        if (i11 == 0) {
            kjVar = null;
        } else {
            kjVar = (kj) arrayList.get(i11 - 1);
        }
        TLRPC.Document F02 = kjVar2.F0();
        if (kjVar == null) {
            F0 = null;
        } else {
            F0 = kjVar.F0();
        }
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        if (F02 == null) {
            return;
        }
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f19822id = tL_inputDocument;
        tL_inputDocument.f19806id = F02.f19800id;
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
            tL_inputDocument2.f19806id = F0.f19800id;
            tL_inputDocument2.access_hash = F0.access_hash;
            byte[] bArr2 = F0.file_reference;
            tL_inputDocument2.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument2.file_reference = new byte[0];
            }
        }
        tL_account_saveMusic.unsave = false;
        ConnectionsManager.getInstance(this.f17802a).sendRequest(tL_account_saveMusic, null);
    }

    public final kj d(TLRPC.Document document) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19815id = uz.p();
        int i10 = this.f17802a;
        wp r12 = wp.r1(i10);
        long j10 = this.f17803b;
        tL_message.peer_id = r12.y1(j10);
        tL_message.from_id = wp.r1(i10).y1(j10);
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.document = document;
        kj kjVar = new kj(i10, tL_message, false, false);
        kjVar.K(true);
        return kjVar;
    }

    public final void e() {
        TLRPC.Document a2 = a();
        int i10 = this.f17802a;
        wp r12 = wp.r1(i10);
        long j10 = this.f17803b;
        TLRPC.UserFull a22 = r12.a2(j10);
        if (a22 == null) {
            return;
        }
        if (a2 == null) {
            a22.flags2 &= -2097153;
            a22.saved_music = null;
        } else {
            a22.flags2 |= 2097152;
            a22.saved_music = a2;
        }
        is.a0(i10).j2(a22, false);
        e20.i(i10).v(true);
        at.f(i10).k(at.V3, Long.valueOf(j10));
    }
}
