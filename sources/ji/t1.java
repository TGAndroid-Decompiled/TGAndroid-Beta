package ji;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.vi;
public final class t1 implements gk {
    public final vi f13526a;
    public final d2 f13527b;

    public t1(d2 d2Var, vi viVar) {
        this.f13527b = d2Var;
        this.f13526a = viVar;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        d2 d2Var = this.f13527b;
        if (!isEmpty) {
            d2Var.P.d2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            x3 x3Var = d2Var.P;
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
                x3Var.e2(document, str2);
            }
        }
        this.f13526a.dismiss(true);
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f13527b.startActivityForResult(intent, 21);
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
