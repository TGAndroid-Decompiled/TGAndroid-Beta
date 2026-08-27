package gh;

import hh.m7;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class u3 implements Runnable {

    public final int f7555a;

    public final boolean f7556b;

    public final Object f7557c;
    public final Object d;

    public final Object f7558e;

    public final Object f7559f;
    public final Object h;

    public final Object f7560n;

    public final Object f7561r;

    public final Object f7562s;

    public u3(v3 v3Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, org.telegram.ui.ActionBar.f1 f1Var3, org.telegram.ui.ActionBar.f1 f1Var4, org.telegram.ui.ActionBar.f1 f1Var5, boolean z10, org.telegram.ui.ActionBar.f1 f1Var6, org.telegram.ui.ActionBar.f1 f1Var7) {
        this.f7555a = 0;
        this.f7557c = v3Var;
        this.d = f1Var;
        this.f7558e = f1Var2;
        this.f7559f = f1Var3;
        this.h = f1Var4;
        this.f7560n = f1Var5;
        this.f7556b = z10;
        this.f7561r = f1Var6;
        this.f7562s = f1Var7;
    }

    @Override
    public final void run() {
        switch (this.f7555a) {
            case 0:
                v3 v3Var = (v3) this.f7557c;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.f7558e;
                org.telegram.ui.ActionBar.f1 f1Var3 = (org.telegram.ui.ActionBar.f1) this.f7559f;
                org.telegram.ui.ActionBar.f1 f1Var4 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var5 = (org.telegram.ui.ActionBar.f1) this.f7560n;
                org.telegram.ui.ActionBar.f1 f1Var6 = (org.telegram.ui.ActionBar.f1) this.f7561r;
                org.telegram.ui.ActionBar.f1 f1Var7 = (org.telegram.ui.ActionBar.f1) this.f7562s;
                m7 m7Var = v3Var.f7592c.U;
                f1Var.g(LocaleController.getString(m7Var.f9747e ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), m7Var.f9747e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                f1Var2.setChecked(TLObject.hasFlag(m7Var.f9749g, 1));
                f1Var3.setChecked(TLObject.hasFlag(m7Var.f9749g, 2));
                f1Var4.setChecked(TLObject.hasFlag(m7Var.f9749g, 4));
                f1Var5.setChecked(TLObject.hasFlag(m7Var.f9749g, 8));
                if (this.f7556b) {
                    f1Var6.setChecked(TLObject.hasFlag(m7Var.f9749g, 256));
                    f1Var7.setChecked(TLObject.hasFlag(m7Var.f9749g, 512));
                }
                break;
            case 1:
                ((SendMessagesHelper) this.f7557c).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.d, (TLRPC.Message) this.f7558e, (TLObject) this.f7559f, (MessageObject) this.h, (String) this.f7560n, (HashMap) this.f7561r, this.f7556b, (TLRPC.TL_messages_addPollAnswer) this.f7562s);
                break;
            case 2:
                ((SendMessagesHelper) this.f7557c).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.d, (TLRPC.Message) this.f7558e, (TLObject) this.f7559f, (MessageObject) this.h, (String) this.f7560n, (HashMap) this.f7561r, this.f7556b, (TLRPC.TL_messages_editMessage) this.f7562s);
                break;
            case 3:
                ((SendMessagesHelper) this.f7557c).lambda$performSendMessageRequest$100(this.f7556b, (TLRPC.TL_error) this.d, (TLRPC.Message) this.f7558e, (TLObject) this.f7559f, (MessageObject) this.h, (HashMap) this.f7560n, (String) this.f7561r, (TLObject) this.f7562s);
                break;
            default:
                org.telegram.ui.ActionBar.f1 f1Var8 = (org.telegram.ui.ActionBar.f1) this.d;
                m7 m7Var2 = (m7) this.f7557c;
                org.telegram.ui.ActionBar.f1 f1Var9 = (org.telegram.ui.ActionBar.f1) this.f7558e;
                org.telegram.ui.ActionBar.f1 f1Var10 = (org.telegram.ui.ActionBar.f1) this.f7559f;
                org.telegram.ui.ActionBar.f1 f1Var11 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var12 = (org.telegram.ui.ActionBar.f1) this.f7560n;
                org.telegram.ui.ActionBar.f1 f1Var13 = (org.telegram.ui.ActionBar.f1) this.f7561r;
                org.telegram.ui.ActionBar.f1 f1Var14 = (org.telegram.ui.ActionBar.f1) this.f7562s;
                if (f1Var8 != null) {
                    f1Var8.g(LocaleController.getString(m7Var2.f9747e ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), m7Var2.f9747e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                f1Var9.setChecked(TLObject.hasFlag(m7Var2.f9749g, 1));
                f1Var10.setChecked(TLObject.hasFlag(m7Var2.f9749g, 2));
                f1Var11.setChecked(TLObject.hasFlag(m7Var2.f9749g, 4));
                f1Var12.setChecked(TLObject.hasFlag(m7Var2.f9749g, 8));
                if (this.f7556b) {
                    f1Var13.setChecked(TLObject.hasFlag(m7Var2.f9749g, 256));
                    f1Var14.setChecked(TLObject.hasFlag(m7Var2.f9749g, 512));
                }
                break;
        }
    }

    public u3(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap map, boolean z10, TLMethod tLMethod, int i10) {
        this.f7555a = i10;
        this.f7557c = sendMessagesHelper;
        this.d = tL_error;
        this.f7558e = message;
        this.f7559f = tLObject;
        this.h = messageObject;
        this.f7560n = str;
        this.f7561r = map;
        this.f7556b = z10;
        this.f7562s = tLMethod;
    }

    public u3(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap map, String str, TLObject tLObject2) {
        this.f7555a = 3;
        this.f7557c = sendMessagesHelper;
        this.f7556b = z10;
        this.d = tL_error;
        this.f7558e = message;
        this.f7559f = tLObject;
        this.h = messageObject;
        this.f7560n = map;
        this.f7561r = str;
        this.f7562s = tLObject2;
    }

    public u3(org.telegram.ui.ActionBar.f1 f1Var, m7 m7Var, org.telegram.ui.ActionBar.f1 f1Var2, org.telegram.ui.ActionBar.f1 f1Var3, org.telegram.ui.ActionBar.f1 f1Var4, org.telegram.ui.ActionBar.f1 f1Var5, boolean z10, org.telegram.ui.ActionBar.f1 f1Var6, org.telegram.ui.ActionBar.f1 f1Var7) {
        this.f7555a = 4;
        this.d = f1Var;
        this.f7557c = m7Var;
        this.f7558e = f1Var2;
        this.f7559f = f1Var3;
        this.h = f1Var4;
        this.f7560n = f1Var5;
        this.f7556b = z10;
        this.f7561r = f1Var6;
        this.f7562s = f1Var7;
    }
}
