package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hp {
    public final int f24520a;
    public final long f24521b;
    public final ArrayList f24522c = new ArrayList();
    public int d;
    public boolean f24523e;
    public boolean f24524f;

    public hp(int i7, long j3) {
        this.f24520a = i7;
        this.f24521b = j3;
    }

    public final TLRPC.Document a() {
        gj gjVar;
        ArrayList arrayList = this.f24522c;
        if (arrayList.isEmpty() || (gjVar = (gj) arrayList.get(0)) == null) {
            return null;
        }
        return gjVar.F0();
    }

    public final void b() {
        if (!this.f24524f && !this.f24523e) {
            this.f24524f = true;
            TLRPC.TL_getSavedMusic tL_getSavedMusic = new TLRPC.TL_getSavedMusic();
            int i7 = this.f24520a;
            tL_getSavedMusic.f28488id = np.u1(i7).q1(this.f24521b);
            tL_getSavedMusic.offset = this.f24522c.size();
            tL_getSavedMusic.limit = 30;
            ConnectionsManager.getInstance(i7).sendRequest(tL_getSavedMusic, new s1(this, 6));
        }
    }

    public final void c(int i7, int i10) {
        gj gjVar;
        TLRPC.Document F0;
        TLRPC.Document a10 = a();
        ArrayList arrayList = this.f24522c;
        gj gjVar2 = (gj) arrayList.get(i7);
        arrayList.set(i7, (gj) arrayList.get(i10));
        arrayList.set(i10, gjVar2);
        if (a() != a10) {
            e();
        }
        if (i10 == 0) {
            gjVar = null;
        } else {
            gjVar = (gj) arrayList.get(i10 - 1);
        }
        TLRPC.Document F02 = gjVar2.F0();
        if (gjVar == null) {
            F0 = null;
        } else {
            F0 = gjVar.F0();
        }
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        if (F02 == null) {
            return;
        }
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f28462id = tL_inputDocument;
        tL_inputDocument.f28446id = F02.f28440id;
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
            tL_inputDocument2.f28446id = F0.f28440id;
            tL_inputDocument2.access_hash = F0.access_hash;
            byte[] bArr2 = F0.file_reference;
            tL_inputDocument2.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument2.file_reference = new byte[0];
            }
        }
        tL_account_saveMusic.unsave = false;
        ConnectionsManager.getInstance(this.f24520a).sendRequest(tL_account_saveMusic, null);
    }

    public final gj d(TLRPC.Document document) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28455id = cz.p();
        int i7 = this.f24520a;
        np u12 = np.u1(i7);
        long j3 = this.f24521b;
        tL_message.peer_id = u12.B1(j3);
        tL_message.from_id = np.u1(i7).B1(j3);
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.document = document;
        gj gjVar = new gj(i7, tL_message, false, false);
        gjVar.K(true);
        return gjVar;
    }

    public final void e() {
        TLRPC.Document a10 = a();
        int i7 = this.f24520a;
        np u12 = np.u1(i7);
        long j3 = this.f24521b;
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
        ur.a0(i7).j2(d2, false);
        k10.i(i7).v(true);
        ls.f(i7).k(ls.Y3, Long.valueOf(j3));
    }
}
