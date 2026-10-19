package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uj implements Runnable {
    public final int f19686a;
    public final Object f19687b;
    public final Object f19688c;
    public final Object d;
    public final Object e;
    public final Object f19689f;
    public final Object h;
    public final Object f19690n;
    public final boolean f19691r;
    public final Object f19692s;

    public uj(Object obj, Object obj2, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, org.telegram.ui.ActionBar.e1 e1Var3, org.telegram.ui.ActionBar.e1 e1Var4, boolean z10, org.telegram.ui.ActionBar.e1 e1Var5, org.telegram.ui.ActionBar.e1 e1Var6, int i10) {
        this.f19686a = i10;
        this.f19687b = obj;
        this.f19688c = obj2;
        this.d = e1Var;
        this.e = e1Var2;
        this.f19689f = e1Var3;
        this.h = e1Var4;
        this.f19691r = z10;
        this.f19690n = e1Var5;
        this.f19692s = e1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f19686a) {
            case 0:
                ((SendMessagesHelper) this.f19687b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f19688c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f19689f, (String) this.h, (HashMap) this.f19690n, this.f19691r, (TLRPC.TL_messages_addPollAnswer) this.f19692s);
                return;
            case 1:
                ((SendMessagesHelper) this.f19687b).lambda$performSendMessageRequest$92((TLRPC.TL_error) this.f19688c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f19689f, (String) this.h, (HashMap) this.f19690n, this.f19691r, (TLRPC.TL_messages_editMessage) this.f19692s);
                return;
            case 2:
                ((SendMessagesHelper) this.f19687b).lambda$performSendMessageRequest$103(this.f19691r, (TLRPC.TL_error) this.f19688c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f19689f, (HashMap) this.f19690n, (String) this.h, (TLObject) this.f19692s);
                return;
            case 3:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f19687b;
                ai.y9 y9Var = (ai.y9) this.f19688c;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var3 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var4 = (org.telegram.ui.ActionBar.e1) this.f19689f;
                org.telegram.ui.ActionBar.e1 e1Var5 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var6 = (org.telegram.ui.ActionBar.e1) this.f19690n;
                org.telegram.ui.ActionBar.e1 e1Var7 = (org.telegram.ui.ActionBar.e1) this.f19692s;
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
                e1Var2.setChecked(TLObject.hasFlag(y9Var.f2500g, 1));
                e1Var3.setChecked(TLObject.hasFlag(y9Var.f2500g, 2));
                e1Var4.setChecked(TLObject.hasFlag(y9Var.f2500g, 4));
                e1Var5.setChecked(TLObject.hasFlag(y9Var.f2500g, 8));
                if (this.f19691r) {
                    e1Var6.setChecked(TLObject.hasFlag(y9Var.f2500g, 256));
                    e1Var7.setChecked(TLObject.hasFlag(y9Var.f2500g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var8 = (org.telegram.ui.ActionBar.e1) this.f19688c;
                org.telegram.ui.ActionBar.e1 e1Var9 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var10 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var11 = (org.telegram.ui.ActionBar.e1) this.f19689f;
                org.telegram.ui.ActionBar.e1 e1Var12 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var13 = (org.telegram.ui.ActionBar.e1) this.f19690n;
                org.telegram.ui.ActionBar.e1 e1Var14 = (org.telegram.ui.ActionBar.e1) this.f19692s;
                ai.y9 y9Var2 = ((yh.h4) this.f19687b).f50287c.Y;
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
                e1Var9.setChecked(TLObject.hasFlag(y9Var2.f2500g, 1));
                e1Var10.setChecked(TLObject.hasFlag(y9Var2.f2500g, 2));
                e1Var11.setChecked(TLObject.hasFlag(y9Var2.f2500g, 4));
                e1Var12.setChecked(TLObject.hasFlag(y9Var2.f2500g, 8));
                if (this.f19691r) {
                    e1Var13.setChecked(TLObject.hasFlag(y9Var2.f2500g, 256));
                    e1Var14.setChecked(TLObject.hasFlag(y9Var2.f2500g, 512));
                    return;
                }
                return;
        }
    }

    public uj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f19686a = i10;
        this.f19687b = sendMessagesHelper;
        this.f19688c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f19689f = messageObject;
        this.h = str;
        this.f19690n = hashMap;
        this.f19691r = z10;
        this.f19692s = tLMethod;
    }

    public uj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f19686a = 2;
        this.f19687b = sendMessagesHelper;
        this.f19691r = z10;
        this.f19688c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f19689f = messageObject;
        this.f19690n = hashMap;
        this.h = str;
        this.f19692s = tLObject2;
    }
}
