package li;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.ti;
public final class r1 implements ek {
    public final ti f17440a;
    public final b2 f17441b;

    public r1(b2 b2Var, ti tiVar) {
        this.f17441b = b2Var;
        this.f17440a = tiVar;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        b2 b2Var = this.f17441b;
        if (!isEmpty) {
            b2Var.P.i2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            v3 v3Var = b2Var.P;
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            v3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                v3Var.j2(document, str2);
            }
        }
        this.f17440a.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f17441b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void P() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
