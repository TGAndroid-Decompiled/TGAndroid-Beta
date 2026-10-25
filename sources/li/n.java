package li;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.ti;
public final class n implements ek {
    public final ti f17365a;
    public final q f17366b;

    public n(q qVar, ti tiVar) {
        this.f17366b = qVar;
        this.f17365a = tiVar;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2;
        v3 v3Var = this.f17366b.f17418r;
        if (!arrayList.isEmpty()) {
            v3Var.i2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
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
        this.f17365a.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f17366b.f30213b.f33018f0.startActivityForResult(intent, 21);
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
