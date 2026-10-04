package ii;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.xi;
public final class u1 implements ik {
    public final xi f12681a;
    public final e2 f12682b;

    public u1(e2 e2Var, xi xiVar) {
        this.f12682b = e2Var;
        this.f12681a = xiVar;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        e2 e2Var = this.f12682b;
        if (!isEmpty) {
            e2Var.P.e2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            x3 x3Var = e2Var.P;
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            x3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                x3Var.f2(document, str2);
            }
        }
        this.f12681a.dismiss(true);
    }

    @Override
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f12682b.startActivityForResult(intent, 21);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void M() {
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
    }
}
