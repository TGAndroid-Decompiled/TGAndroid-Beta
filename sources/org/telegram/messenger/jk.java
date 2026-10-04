package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jk implements Runnable {
    public final int f18291a;
    public final Object f18292b;
    public final Object f18293c;
    public final Object d;
    public final Object f18294e;
    public final Object f18295f;
    public final Object h;
    public final Object f18296n;
    public final boolean f18297r;
    public final Object f18298s;

    public jk(Object obj, Object obj2, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, org.telegram.ui.ActionBar.f1 f1Var3, org.telegram.ui.ActionBar.f1 f1Var4, boolean z10, org.telegram.ui.ActionBar.f1 f1Var5, org.telegram.ui.ActionBar.f1 f1Var6, int i10) {
        this.f18291a = i10;
        this.f18292b = obj;
        this.f18293c = obj2;
        this.d = f1Var;
        this.f18294e = f1Var2;
        this.f18295f = f1Var3;
        this.h = f1Var4;
        this.f18297r = z10;
        this.f18296n = f1Var5;
        this.f18298s = f1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f18291a) {
            case 0:
                ((SendMessagesHelper) this.f18292b).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.f18293c, (TLRPC.Message) this.d, (TLObject) this.f18294e, (MessageObject) this.f18295f, (String) this.h, (HashMap) this.f18296n, this.f18297r, (TLRPC.TL_messages_addPollAnswer) this.f18298s);
                return;
            case 1:
                ((SendMessagesHelper) this.f18292b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f18293c, (TLRPC.Message) this.d, (TLObject) this.f18294e, (MessageObject) this.f18295f, (String) this.h, (HashMap) this.f18296n, this.f18297r, (TLRPC.TL_messages_editMessage) this.f18298s);
                return;
            case 2:
                ((SendMessagesHelper) this.f18292b).lambda$performSendMessageRequest$100(this.f18297r, (TLRPC.TL_error) this.f18293c, (TLRPC.Message) this.d, (TLObject) this.f18294e, (MessageObject) this.f18295f, (HashMap) this.f18296n, (String) this.h, (TLObject) this.f18298s);
                return;
            case 3:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f18292b;
                yh.k5 k5Var = (yh.k5) this.f18293c;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var3 = (org.telegram.ui.ActionBar.f1) this.f18294e;
                org.telegram.ui.ActionBar.f1 f1Var4 = (org.telegram.ui.ActionBar.f1) this.f18295f;
                org.telegram.ui.ActionBar.f1 f1Var5 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var6 = (org.telegram.ui.ActionBar.f1) this.f18296n;
                org.telegram.ui.ActionBar.f1 f1Var7 = (org.telegram.ui.ActionBar.f1) this.f18298s;
                if (f1Var != null) {
                    if (k5Var.f51527e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (k5Var.f51527e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    f1Var.g(string, i11, null);
                }
                f1Var2.setChecked(TLObject.hasFlag(k5Var.f51529g, 1));
                f1Var3.setChecked(TLObject.hasFlag(k5Var.f51529g, 2));
                f1Var4.setChecked(TLObject.hasFlag(k5Var.f51529g, 4));
                f1Var5.setChecked(TLObject.hasFlag(k5Var.f51529g, 8));
                if (this.f18297r) {
                    f1Var6.setChecked(TLObject.hasFlag(k5Var.f51529g, 256));
                    f1Var7.setChecked(TLObject.hasFlag(k5Var.f51529g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var8 = (org.telegram.ui.ActionBar.f1) this.f18293c;
                org.telegram.ui.ActionBar.f1 f1Var9 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var10 = (org.telegram.ui.ActionBar.f1) this.f18294e;
                org.telegram.ui.ActionBar.f1 f1Var11 = (org.telegram.ui.ActionBar.f1) this.f18295f;
                org.telegram.ui.ActionBar.f1 f1Var12 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var13 = (org.telegram.ui.ActionBar.f1) this.f18296n;
                org.telegram.ui.ActionBar.f1 f1Var14 = (org.telegram.ui.ActionBar.f1) this.f18298s;
                yh.k5 k5Var2 = ((xh.j4) this.f18292b).f50045c.Y;
                if (k5Var2.f51527e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (k5Var2.f51527e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                f1Var8.g(string2, i13, null);
                f1Var9.setChecked(TLObject.hasFlag(k5Var2.f51529g, 1));
                f1Var10.setChecked(TLObject.hasFlag(k5Var2.f51529g, 2));
                f1Var11.setChecked(TLObject.hasFlag(k5Var2.f51529g, 4));
                f1Var12.setChecked(TLObject.hasFlag(k5Var2.f51529g, 8));
                if (this.f18297r) {
                    f1Var13.setChecked(TLObject.hasFlag(k5Var2.f51529g, 256));
                    f1Var14.setChecked(TLObject.hasFlag(k5Var2.f51529g, 512));
                    return;
                }
                return;
        }
    }

    public jk(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f18291a = i10;
        this.f18292b = sendMessagesHelper;
        this.f18293c = tL_error;
        this.d = message;
        this.f18294e = tLObject;
        this.f18295f = messageObject;
        this.h = str;
        this.f18296n = hashMap;
        this.f18297r = z10;
        this.f18298s = tLMethod;
    }

    public jk(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f18291a = 2;
        this.f18292b = sendMessagesHelper;
        this.f18297r = z10;
        this.f18293c = tL_error;
        this.d = message;
        this.f18294e = tLObject;
        this.f18295f = messageObject;
        this.f18296n = hashMap;
        this.h = str;
        this.f18298s = tLObject2;
    }
}
