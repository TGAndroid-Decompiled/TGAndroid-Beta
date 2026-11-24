package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class jc7 {
    public final int a;
    public final long b;
    public final ArrayList c = new ArrayList();
    public int d;
    public boolean e;
    public boolean f;

    public jc7(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final TLRPC.Document a() {
        k47 k47Var;
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty() || (k47Var = (k47) arrayList.get(0)) == null) {
            return null;
        }
        return k47Var.F0();
    }

    public final void b() {
        if (!this.f && !this.e) {
            this.f = true;
            TLRPC.TL_getSavedMusic tL_getSavedMusic = new TLRPC.TL_getSavedMusic();
            int i = this.a;
            tL_getSavedMusic.id = oc7.r1(i).n1(this.b);
            tL_getSavedMusic.offset = this.c.size();
            tL_getSavedMusic.limit = 30;
            ConnectionsManager.getInstance(i).sendRequest(tL_getSavedMusic, new r15(this, (byte) 14));
        }
    }

    public final void c(int i, int i2) {
        k47 k47Var;
        TLRPC.Document F0;
        TLRPC.Document a = a();
        ArrayList arrayList = this.c;
        k47 k47Var2 = (k47) arrayList.get(i);
        arrayList.set(i, (k47) arrayList.get(i2));
        arrayList.set(i2, k47Var2);
        if (a() != a) {
            e();
        }
        if (i2 == 0) {
            k47Var = null;
        } else {
            k47Var = (k47) arrayList.get(i2 - 1);
        }
        TLRPC.Document F02 = k47Var2.F0();
        if (k47Var == null) {
            F0 = null;
        } else {
            F0 = k47Var.F0();
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

    public final k47 d(TLRPC.Document document) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = gda.p();
        int i = this.a;
        oc7 r1 = oc7.r1(i);
        long j = this.b;
        tL_message.peer_id = r1.x1(j);
        tL_message.from_id = oc7.r1(i).x1(j);
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.document = document;
        k47 k47Var = new k47(i, tL_message, false, false);
        k47Var.K(true);
        return k47Var;
    }

    public final void e() {
        TLRPC.Document a = a();
        int i = this.a;
        oc7 r1 = oc7.r1(i);
        long j = this.b;
        TLRPC.UserFull X1 = r1.X1(j);
        if (X1 == null) {
            return;
        }
        int i2 = X1.flags2;
        if (a == null) {
            X1.flags2 = i2 & (-2097153);
            X1.saved_music = null;
        } else {
            X1.flags2 = i2 | 2097152;
            X1.saved_music = a;
        }
        cf7.Y(i).g2(X1, false);
        z8c.h(i).u(true);
        nm7.f(i).k(nm7.Y3, Long.valueOf(j));
    }
}
