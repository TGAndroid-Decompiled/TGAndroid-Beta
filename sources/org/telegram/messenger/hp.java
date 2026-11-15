package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hp {
    public final int f24200a;
    public final long f24201b;
    public final ArrayList f24202c = new ArrayList();
    public int d;
    public boolean f24203e;
    public boolean f24204f;

    public hp(int i7, long j3) {
        this.f24200a = i7;
        this.f24201b = j3;
    }

    public final TLRPC.Document a() {
        gj gjVar;
        ArrayList arrayList = this.f24202c;
        if (arrayList.isEmpty() || (gjVar = (gj) arrayList.get(0)) == null) {
            return null;
        }
        return gjVar.F0();
    }

    public final void b() {
        if (!this.f24204f && !this.f24203e) {
            this.f24204f = true;
            TLRPC.TL_getSavedMusic tL_getSavedMusic = new TLRPC.TL_getSavedMusic();
            int i7 = this.f24200a;
            tL_getSavedMusic.f28105id = np.s1(i7).o1(this.f24201b);
            tL_getSavedMusic.offset = this.f24202c.size();
            tL_getSavedMusic.limit = 30;
            ConnectionsManager.getInstance(i7).sendRequest(tL_getSavedMusic, new s1(this, 6));
        }
    }

    public final void c(int i7, int i10) {
        gj gjVar;
        TLRPC.Document F0;
        TLRPC.Document a10 = a();
        ArrayList arrayList = this.f24202c;
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
        tL_account_saveMusic.f28079id = tL_inputDocument;
        tL_inputDocument.f28063id = F02.f28057id;
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
            tL_inputDocument2.f28063id = F0.f28057id;
            tL_inputDocument2.access_hash = F0.access_hash;
            byte[] bArr2 = F0.file_reference;
            tL_inputDocument2.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument2.file_reference = new byte[0];
            }
        }
        tL_account_saveMusic.unsave = false;
        ConnectionsManager.getInstance(this.f24200a).sendRequest(tL_account_saveMusic, null);
    }

    public final gj d(TLRPC.Document document) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28072id = gz.p();
        int i7 = this.f24200a;
        np s12 = np.s1(i7);
        long j3 = this.f24201b;
        tL_message.peer_id = s12.z1(j3);
        tL_message.from_id = np.s1(i7).z1(j3);
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.document = document;
        gj gjVar = new gj(i7, tL_message, false, false);
        gjVar.K(true);
        return gjVar;
    }

    public final void e() {
        TLRPC.Document a10 = a();
        int i7 = this.f24200a;
        np s12 = np.s1(i7);
        long j3 = this.f24201b;
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
        vr.a0(i7).j2(b22, false);
        m10.i(i7).v(true);
        ns.f(i7).k(ns.V3, Long.valueOf(j3));
    }
}
