package ki;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.ri;
public final class s1 implements ck {
    public final ri f15558a;
    public final d2 f15559b;

    public s1(d2 d2Var, ri riVar) {
        this.f15559b = d2Var;
        this.f15558a = riVar;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        d2 d2Var = this.f15559b;
        if (!isEmpty) {
            d2Var.P.i2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            w3 w3Var = d2Var.P;
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            w3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                w3Var.j2(document, str2);
            }
        }
        this.f15558a.dismiss(true);
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f15559b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
