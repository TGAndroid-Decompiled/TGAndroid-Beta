package hi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.yi;
public final class v1 implements kk {
    public final yi f9906a;
    public final g2 f9907b;

    public v1(g2 g2Var, yi yiVar) {
        this.f9907b = g2Var;
        this.f9906a = yiVar;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        g2 g2Var = this.f9907b;
        if (!isEmpty) {
            g2Var.P.b2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            z3 z3Var = g2Var.P;
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            z3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                z3Var.c2(document, str2);
            }
        }
        this.f9906a.dismiss(true);
    }

    @Override
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f9907b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
    }
}
