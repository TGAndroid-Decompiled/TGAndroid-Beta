package ii;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.xi;
public final class o implements ik {
    public final xi f11531a;
    public final r f11532b;

    public o(r rVar, xi xiVar) {
        this.f11532b = rVar;
        this.f11531a = xiVar;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        String str2;
        x3 x3Var = this.f11532b.f11586r;
        if (!arrayList.isEmpty()) {
            x3Var.e2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
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
        this.f11531a.dismiss(true);
    }

    @Override
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f11532b.f27362b.f30270f0.startActivityForResult(intent, 21);
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
