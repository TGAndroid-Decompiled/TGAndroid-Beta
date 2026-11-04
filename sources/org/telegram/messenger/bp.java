package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class bp {
    public final int f21864a;
    public final long f21865b;
    public final ArrayList f21866c = new ArrayList();
    public int d;
    public boolean f21867e;
    public boolean f21868f;

    public bp(int i3, long j10) {
        this.f21864a = i3;
        this.f21865b = j10;
    }

    public final TLRPC.Document a() {
        zi ziVar;
        ArrayList arrayList = this.f21866c;
        if (arrayList.isEmpty() || (ziVar = (zi) arrayList.get(0)) == null) {
            return null;
        }
        return ziVar.F0();
    }

    public final void b() {
        if (!this.f21868f && !this.f21867e) {
            this.f21868f = true;
            TLRPC.TL_getSavedMusic tL_getSavedMusic = new TLRPC.TL_getSavedMusic();
            int i3 = this.f21864a;
            tL_getSavedMusic.f27055id = hp.s1(i3).o1(this.f21865b);
            tL_getSavedMusic.offset = this.f21866c.size();
            tL_getSavedMusic.limit = 30;
            ConnectionsManager.getInstance(i3).sendRequest(tL_getSavedMusic, new s1(this, 6));
        }
    }

    public final void c(int i3, int i10) {
        zi ziVar;
        TLRPC.Document F0;
        TLRPC.Document a10 = a();
        ArrayList arrayList = this.f21866c;
        zi ziVar2 = (zi) arrayList.get(i3);
        arrayList.set(i3, (zi) arrayList.get(i10));
        arrayList.set(i10, ziVar2);
        if (a() != a10) {
            e();
        }
        if (i10 == 0) {
            ziVar = null;
        } else {
            ziVar = (zi) arrayList.get(i10 - 1);
        }
        TLRPC.Document F02 = ziVar2.F0();
        if (ziVar == null) {
            F0 = null;
        } else {
            F0 = ziVar.F0();
        }
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        if (F02 == null) {
            return;
        }
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f27029id = tL_inputDocument;
        tL_inputDocument.f27013id = F02.f27007id;
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
            tL_inputDocument2.f27013id = F0.f27007id;
            tL_inputDocument2.access_hash = F0.access_hash;
            byte[] bArr2 = F0.file_reference;
            tL_inputDocument2.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument2.file_reference = new byte[0];
            }
        }
        tL_account_saveMusic.unsave = false;
        ConnectionsManager.getInstance(this.f21864a).sendRequest(tL_account_saveMusic, null);
    }

    public final zi d(TLRPC.Document document) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f27022id = az.p();
        int i3 = this.f21864a;
        hp s12 = hp.s1(i3);
        long j10 = this.f21865b;
        tL_message.peer_id = s12.z1(j10);
        tL_message.from_id = hp.s1(i3).z1(j10);
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.document = document;
        zi ziVar = new zi(i3, tL_message, false, false);
        ziVar.K(true);
        return ziVar;
    }

    public final void e() {
        TLRPC.Document a10 = a();
        int i3 = this.f21864a;
        hp s12 = hp.s1(i3);
        long j10 = this.f21865b;
        TLRPC.UserFull b22 = s12.b2(j10);
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
        qr.a0(i3).j2(b22, false);
        h10.i(i3).v(true);
        hs.f(i3).k(hs.V3, Long.valueOf(j10));
    }
}
