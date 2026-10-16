package ji;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.vi;
public final class o implements gk {
    public final vi f13438a;
    public final r f13439b;

    public o(r rVar, vi viVar) {
        this.f13439b = rVar;
        this.f13438a = viVar;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2;
        x3 x3Var = this.f13439b.f13486r;
        if (!arrayList.isEmpty()) {
            x3Var.d2((String) arrayList.get(0));
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
                x3Var.e2(document, str2);
            }
        }
        this.f13438a.dismiss(true);
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f13439b.f27360b.f29672f0.startActivityForResult(intent, 21);
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
