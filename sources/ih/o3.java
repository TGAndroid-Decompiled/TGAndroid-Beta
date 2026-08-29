package ih;

import java.util.HashMap;
import jh.k7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o3 implements Runnable {
    public final int f9311a;
    public final boolean f9312b;
    public final Object f9313c;
    public final Object d;
    public final Object f9314e;
    public final Object f9315f;
    public final Object h;
    public final Object f9316n;
    public final Object f9317r;
    public final Object f9318s;

    public o3(p3 p3Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, org.telegram.ui.ActionBar.g1 g1Var5, boolean z10, org.telegram.ui.ActionBar.g1 g1Var6, org.telegram.ui.ActionBar.g1 g1Var7) {
        this.f9311a = 0;
        this.f9313c = p3Var;
        this.d = g1Var;
        this.f9314e = g1Var2;
        this.f9315f = g1Var3;
        this.h = g1Var4;
        this.f9316n = g1Var5;
        this.f9312b = z10;
        this.f9317r = g1Var6;
        this.f9318s = g1Var7;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f9311a) {
            case 0:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.f9314e;
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.f9315f;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var5 = (org.telegram.ui.ActionBar.g1) this.f9316n;
                org.telegram.ui.ActionBar.g1 g1Var6 = (org.telegram.ui.ActionBar.g1) this.f9317r;
                org.telegram.ui.ActionBar.g1 g1Var7 = (org.telegram.ui.ActionBar.g1) this.f9318s;
                k7 k7Var = ((p3) this.f9313c).f9326c.U;
                if (k7Var.f12381e) {
                    i10 = R.string.Gift2FilterSortByValue;
                } else {
                    i10 = R.string.Gift2FilterSortByDate;
                }
                String string = LocaleController.getString(i10);
                if (k7Var.f12381e) {
                    i11 = R.drawable.menu_sort_value;
                } else {
                    i11 = R.drawable.menu_sort_date;
                }
                g1Var.g(string, i11, null);
                g1Var2.setChecked(TLObject.hasFlag(k7Var.f12383g, 1));
                g1Var3.setChecked(TLObject.hasFlag(k7Var.f12383g, 2));
                g1Var4.setChecked(TLObject.hasFlag(k7Var.f12383g, 4));
                g1Var5.setChecked(TLObject.hasFlag(k7Var.f12383g, 8));
                if (this.f9312b) {
                    g1Var6.setChecked(TLObject.hasFlag(k7Var.f12383g, 256));
                    g1Var7.setChecked(TLObject.hasFlag(k7Var.f12383g, 512));
                    return;
                }
                return;
            case 1:
                ((SendMessagesHelper) this.f9313c).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.d, (TLRPC.Message) this.f9314e, (TLObject) this.f9315f, (MessageObject) this.h, (String) this.f9316n, (HashMap) this.f9317r, this.f9312b, (TLRPC.TL_messages_addPollAnswer) this.f9318s);
                return;
            case 2:
                ((SendMessagesHelper) this.f9313c).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.d, (TLRPC.Message) this.f9314e, (TLObject) this.f9315f, (MessageObject) this.h, (String) this.f9316n, (HashMap) this.f9317r, this.f9312b, (TLRPC.TL_messages_editMessage) this.f9318s);
                return;
            case 3:
                ((SendMessagesHelper) this.f9313c).lambda$performSendMessageRequest$100(this.f9312b, (TLRPC.TL_error) this.d, (TLRPC.Message) this.f9314e, (TLObject) this.f9315f, (MessageObject) this.h, (HashMap) this.f9316n, (String) this.f9317r, (TLObject) this.f9318s);
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var8 = (org.telegram.ui.ActionBar.g1) this.d;
                k7 k7Var2 = (k7) this.f9313c;
                org.telegram.ui.ActionBar.g1 g1Var9 = (org.telegram.ui.ActionBar.g1) this.f9314e;
                org.telegram.ui.ActionBar.g1 g1Var10 = (org.telegram.ui.ActionBar.g1) this.f9315f;
                org.telegram.ui.ActionBar.g1 g1Var11 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var12 = (org.telegram.ui.ActionBar.g1) this.f9316n;
                org.telegram.ui.ActionBar.g1 g1Var13 = (org.telegram.ui.ActionBar.g1) this.f9317r;
                org.telegram.ui.ActionBar.g1 g1Var14 = (org.telegram.ui.ActionBar.g1) this.f9318s;
                if (g1Var8 != null) {
                    if (k7Var2.f12381e) {
                        i12 = R.string.Gift2FilterSortByValue;
                    } else {
                        i12 = R.string.Gift2FilterSortByDate;
                    }
                    String string2 = LocaleController.getString(i12);
                    if (k7Var2.f12381e) {
                        i13 = R.drawable.menu_sort_value;
                    } else {
                        i13 = R.drawable.menu_sort_date;
                    }
                    g1Var8.g(string2, i13, null);
                }
                g1Var9.setChecked(TLObject.hasFlag(k7Var2.f12383g, 1));
                g1Var10.setChecked(TLObject.hasFlag(k7Var2.f12383g, 2));
                g1Var11.setChecked(TLObject.hasFlag(k7Var2.f12383g, 4));
                g1Var12.setChecked(TLObject.hasFlag(k7Var2.f12383g, 8));
                if (this.f9312b) {
                    g1Var13.setChecked(TLObject.hasFlag(k7Var2.f12383g, 256));
                    g1Var14.setChecked(TLObject.hasFlag(k7Var2.f12383g, 512));
                    return;
                }
                return;
        }
    }

    public o3(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f9311a = i10;
        this.f9313c = sendMessagesHelper;
        this.d = tL_error;
        this.f9314e = message;
        this.f9315f = tLObject;
        this.h = messageObject;
        this.f9316n = str;
        this.f9317r = hashMap;
        this.f9312b = z10;
        this.f9318s = tLMethod;
    }

    public o3(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f9311a = 3;
        this.f9313c = sendMessagesHelper;
        this.f9312b = z10;
        this.d = tL_error;
        this.f9314e = message;
        this.f9315f = tLObject;
        this.h = messageObject;
        this.f9316n = hashMap;
        this.f9317r = str;
        this.f9318s = tLObject2;
    }

    public o3(org.telegram.ui.ActionBar.g1 g1Var, k7 k7Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, org.telegram.ui.ActionBar.g1 g1Var5, boolean z10, org.telegram.ui.ActionBar.g1 g1Var6, org.telegram.ui.ActionBar.g1 g1Var7) {
        this.f9311a = 4;
        this.d = g1Var;
        this.f9313c = k7Var;
        this.f9314e = g1Var2;
        this.f9315f = g1Var3;
        this.h = g1Var4;
        this.f9316n = g1Var5;
        this.f9312b = z10;
        this.f9317r = g1Var6;
        this.f9318s = g1Var7;
    }
}
