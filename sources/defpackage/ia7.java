package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ia7 {
    public final int a;
    public final long b;
    public final ArrayList c = new ArrayList();
    public int d;
    public boolean e;
    public boolean f;

    public ia7(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final TLRPC.Document a() {
        k27 k27Var;
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty() || (k27Var = (k27) arrayList.get(0)) == null) {
            return null;
        }
        return k27Var.F0();
    }

    public final void b() {
        if (!this.f && !this.e) {
            this.f = true;
            TLRPC.TL_getSavedMusic tL_getSavedMusic = new TLRPC.TL_getSavedMusic();
            int i = this.a;
            tL_getSavedMusic.id = na7.q1(i).m1(this.b);
            tL_getSavedMusic.offset = this.c.size();
            tL_getSavedMusic.limit = 30;
            ConnectionsManager.getInstance(i).sendRequest(tL_getSavedMusic, new n35(this, (byte) 13));
        }
    }

    public final void c(int i, int i2) {
        k27 k27Var;
        TLRPC.Document F0;
        TLRPC.Document a = a();
        ArrayList arrayList = this.c;
        k27 k27Var2 = (k27) arrayList.get(i);
        arrayList.set(i, (k27) arrayList.get(i2));
        arrayList.set(i2, k27Var2);
        if (a() != a) {
            e();
        }
        if (i2 == 0) {
            k27Var = null;
        } else {
            k27Var = (k27) arrayList.get(i2 - 1);
        }
        TLRPC.Document F02 = k27Var2.F0();
        if (k27Var == null) {
            F0 = null;
        } else {
            F0 = k27Var.F0();
        }
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        if (F02 == null) {
            return;
        }
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.id = tL_inputDocument;
        tL_inputDocument.id = F02.id;
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
            tL_inputDocument2.id = F0.id;
            tL_inputDocument2.access_hash = F0.access_hash;
            byte[] bArr2 = F0.file_reference;
            tL_inputDocument2.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument2.file_reference = new byte[0];
            }
        }
        tL_account_saveMusic.unsave = false;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_account_saveMusic, null);
    }

    public final k27 d(TLRPC.Document document) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = gba.p();
        int i = this.a;
        na7 q1 = na7.q1(i);
        long j = this.b;
        tL_message.peer_id = q1.w1(j);
        tL_message.from_id = na7.q1(i).w1(j);
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.document = document;
        k27 k27Var = new k27(i, tL_message, false, false);
        k27Var.K(true);
        return k27Var;
    }

    public final void e() {
        TLRPC.Document a = a();
        int i = this.a;
        na7 q1 = na7.q1(i);
        long j = this.b;
        TLRPC.UserFull W1 = q1.W1(j);
        if (W1 == null) {
            return;
        }
        int i2 = W1.flags2;
        if (a == null) {
            W1.flags2 = i2 & (-2097153);
            W1.saved_music = null;
        } else {
            W1.flags2 = i2 | 2097152;
            W1.saved_music = a;
        }
        ad7.Y(i).g2(W1, false);
        y6c.h(i).u(true);
        kk7.f(i).k(kk7.X3, Long.valueOf(j));
    }
}
