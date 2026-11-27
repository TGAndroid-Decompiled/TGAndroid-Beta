package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pc7 {
    public final int a;
    public final long b;
    public final ArrayList c = new ArrayList();
    public int d;
    public boolean e;
    public boolean f;

    public pc7(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final TLRPC.Document a() {
        r47 r47Var;
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty() || (r47Var = (r47) arrayList.get(0)) == null) {
            return null;
        }
        return r47Var.F0();
    }

    public final void b() {
        if (!this.f && !this.e) {
            this.f = true;
            TLRPC.TL_getSavedMusic tL_getSavedMusic = new TLRPC.TL_getSavedMusic();
            int i = this.a;
            tL_getSavedMusic.id = uc7.s1(i).o1(this.b);
            tL_getSavedMusic.offset = this.c.size();
            tL_getSavedMusic.limit = 30;
            ConnectionsManager.getInstance(i).sendRequest(tL_getSavedMusic, new w15(this, (byte) 14));
        }
    }

    public final void c(int i, int i2) {
        r47 r47Var;
        TLRPC.Document F0;
        TLRPC.Document a = a();
        ArrayList arrayList = this.c;
        r47 r47Var2 = (r47) arrayList.get(i);
        arrayList.set(i, (r47) arrayList.get(i2));
        arrayList.set(i2, r47Var2);
        if (a() != a) {
            e();
        }
        if (i2 == 0) {
            r47Var = null;
        } else {
            r47Var = (r47) arrayList.get(i2 - 1);
        }
        TLRPC.Document F02 = r47Var2.F0();
        if (r47Var == null) {
            F0 = null;
        } else {
            F0 = r47Var.F0();
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

    public final r47 d(TLRPC.Document document) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = xea.p();
        int i = this.a;
        uc7 s1 = uc7.s1(i);
        long j = this.b;
        tL_message.peer_id = s1.y1(j);
        tL_message.from_id = uc7.s1(i).y1(j);
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.document = document;
        r47 r47Var = new r47(i, tL_message, false, false);
        r47Var.K(true);
        return r47Var;
    }

    public final void e() {
        TLRPC.Document a = a();
        int i = this.a;
        uc7 s1 = uc7.s1(i);
        long j = this.b;
        TLRPC.UserFull Y1 = s1.Y1(j);
        if (Y1 == null) {
            return;
        }
        int i2 = Y1.flags2;
        if (a == null) {
            Y1.flags2 = i2 & (-2097153);
            Y1.saved_music = null;
        } else {
            Y1.flags2 = i2 | 2097152;
            Y1.saved_music = a;
        }
        kf7.a0(i).l2(Y1, false);
        yac.h(i).u(true);
        jn7.f(i).k(jn7.Y3, Long.valueOf(j));
    }
}
