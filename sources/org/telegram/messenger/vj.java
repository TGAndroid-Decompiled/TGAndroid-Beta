package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vj implements Runnable {
    public final int f19813a;
    public final Object f19814b;
    public final Object f19815c;
    public final Object d;
    public final Object e;
    public final Object f19816f;
    public final Object h;
    public final Object f19817n;
    public final boolean f19818r;
    public final Object f19819s;

    public vj(Object obj, Object obj2, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, org.telegram.ui.ActionBar.e1 e1Var3, org.telegram.ui.ActionBar.e1 e1Var4, boolean z10, org.telegram.ui.ActionBar.e1 e1Var5, org.telegram.ui.ActionBar.e1 e1Var6, int i10) {
        this.f19813a = i10;
        this.f19814b = obj;
        this.f19815c = obj2;
        this.d = e1Var;
        this.e = e1Var2;
        this.f19816f = e1Var3;
        this.h = e1Var4;
        this.f19818r = z10;
        this.f19817n = e1Var5;
        this.f19819s = e1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f19813a) {
            case 0:
                ((SendMessagesHelper) this.f19814b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f19815c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f19816f, (String) this.h, (HashMap) this.f19817n, this.f19818r, (TLRPC.TL_messages_addPollAnswer) this.f19819s);
                return;
            case 1:
                ((SendMessagesHelper) this.f19814b).lambda$performSendMessageRequest$92((TLRPC.TL_error) this.f19815c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f19816f, (String) this.h, (HashMap) this.f19817n, this.f19818r, (TLRPC.TL_messages_editMessage) this.f19819s);
                return;
            case 2:
                ((SendMessagesHelper) this.f19814b).lambda$performSendMessageRequest$103(this.f19818r, (TLRPC.TL_error) this.f19815c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f19816f, (HashMap) this.f19817n, (String) this.h, (TLObject) this.f19819s);
                return;
            case 3:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f19814b;
                ai.y9 y9Var = (ai.y9) this.f19815c;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var3 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var4 = (org.telegram.ui.ActionBar.e1) this.f19816f;
                org.telegram.ui.ActionBar.e1 e1Var5 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var6 = (org.telegram.ui.ActionBar.e1) this.f19817n;
                org.telegram.ui.ActionBar.e1 e1Var7 = (org.telegram.ui.ActionBar.e1) this.f19819s;
                if (e1Var != null) {
                    if (y9Var.e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (y9Var.e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    e1Var.g(string, i11, null);
                }
                e1Var2.setChecked(TLObject.hasFlag(y9Var.f2495g, 1));
                e1Var3.setChecked(TLObject.hasFlag(y9Var.f2495g, 2));
                e1Var4.setChecked(TLObject.hasFlag(y9Var.f2495g, 4));
                e1Var5.setChecked(TLObject.hasFlag(y9Var.f2495g, 8));
                if (this.f19818r) {
                    e1Var6.setChecked(TLObject.hasFlag(y9Var.f2495g, 256));
                    e1Var7.setChecked(TLObject.hasFlag(y9Var.f2495g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var8 = (org.telegram.ui.ActionBar.e1) this.f19815c;
                org.telegram.ui.ActionBar.e1 e1Var9 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var10 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var11 = (org.telegram.ui.ActionBar.e1) this.f19816f;
                org.telegram.ui.ActionBar.e1 e1Var12 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var13 = (org.telegram.ui.ActionBar.e1) this.f19817n;
                org.telegram.ui.ActionBar.e1 e1Var14 = (org.telegram.ui.ActionBar.e1) this.f19819s;
                ai.y9 y9Var2 = ((yh.h4) this.f19814b).f50285c.Y;
                if (y9Var2.e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (y9Var2.e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                e1Var8.g(string2, i13, null);
                e1Var9.setChecked(TLObject.hasFlag(y9Var2.f2495g, 1));
                e1Var10.setChecked(TLObject.hasFlag(y9Var2.f2495g, 2));
                e1Var11.setChecked(TLObject.hasFlag(y9Var2.f2495g, 4));
                e1Var12.setChecked(TLObject.hasFlag(y9Var2.f2495g, 8));
                if (this.f19818r) {
                    e1Var13.setChecked(TLObject.hasFlag(y9Var2.f2495g, 256));
                    e1Var14.setChecked(TLObject.hasFlag(y9Var2.f2495g, 512));
                    return;
                }
                return;
        }
    }

    public vj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f19813a = i10;
        this.f19814b = sendMessagesHelper;
        this.f19815c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f19816f = messageObject;
        this.h = str;
        this.f19817n = hashMap;
        this.f19818r = z10;
        this.f19819s = tLMethod;
    }

    public vj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f19813a = 2;
        this.f19814b = sendMessagesHelper;
        this.f19818r = z10;
        this.f19815c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f19816f = messageObject;
        this.f19817n = hashMap;
        this.h = str;
        this.f19819s = tLObject2;
    }
}
