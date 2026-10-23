package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xj implements Runnable {
    public final int f20102a;
    public final Object f20103b;
    public final Object f20104c;
    public final Object d;
    public final Object e;
    public final Object f20105f;
    public final Object h;
    public final Object f20106n;
    public final boolean f20107r;
    public final Object f20108s;

    public xj(Object obj, Object obj2, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, org.telegram.ui.ActionBar.e1 e1Var3, org.telegram.ui.ActionBar.e1 e1Var4, boolean z10, org.telegram.ui.ActionBar.e1 e1Var5, org.telegram.ui.ActionBar.e1 e1Var6, int i10) {
        this.f20102a = i10;
        this.f20103b = obj;
        this.f20104c = obj2;
        this.d = e1Var;
        this.e = e1Var2;
        this.f20105f = e1Var3;
        this.h = e1Var4;
        this.f20107r = z10;
        this.f20106n = e1Var5;
        this.f20108s = e1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f20102a) {
            case 0:
                ((SendMessagesHelper) this.f20103b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f20104c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f20105f, (String) this.h, (HashMap) this.f20106n, this.f20107r, (TLRPC.TL_messages_addPollAnswer) this.f20108s);
                return;
            case 1:
                ((SendMessagesHelper) this.f20103b).lambda$performSendMessageRequest$92((TLRPC.TL_error) this.f20104c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f20105f, (String) this.h, (HashMap) this.f20106n, this.f20107r, (TLRPC.TL_messages_editMessage) this.f20108s);
                return;
            case 2:
                ((SendMessagesHelper) this.f20103b).lambda$performSendMessageRequest$103(this.f20107r, (TLRPC.TL_error) this.f20104c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f20105f, (HashMap) this.f20106n, (String) this.h, (TLObject) this.f20108s);
                return;
            case 3:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f20103b;
                ai.y9 y9Var = (ai.y9) this.f20104c;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var3 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var4 = (org.telegram.ui.ActionBar.e1) this.f20105f;
                org.telegram.ui.ActionBar.e1 e1Var5 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var6 = (org.telegram.ui.ActionBar.e1) this.f20106n;
                org.telegram.ui.ActionBar.e1 e1Var7 = (org.telegram.ui.ActionBar.e1) this.f20108s;
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
                if (this.f20107r) {
                    e1Var6.setChecked(TLObject.hasFlag(y9Var.f2500g, 256));
                    e1Var7.setChecked(TLObject.hasFlag(y9Var.f2500g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var8 = (org.telegram.ui.ActionBar.e1) this.f20104c;
                org.telegram.ui.ActionBar.e1 e1Var9 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var10 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var11 = (org.telegram.ui.ActionBar.e1) this.f20105f;
                org.telegram.ui.ActionBar.e1 e1Var12 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var13 = (org.telegram.ui.ActionBar.e1) this.f20106n;
                org.telegram.ui.ActionBar.e1 e1Var14 = (org.telegram.ui.ActionBar.e1) this.f20108s;
                ai.y9 y9Var2 = ((yh.h4) this.f20103b).f50296c.Y;
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
                if (this.f20107r) {
                    e1Var13.setChecked(TLObject.hasFlag(y9Var2.f2500g, 256));
                    e1Var14.setChecked(TLObject.hasFlag(y9Var2.f2500g, 512));
                    return;
                }
                return;
        }
    }

    public xj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f20102a = i10;
        this.f20103b = sendMessagesHelper;
        this.f20104c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f20105f = messageObject;
        this.h = str;
        this.f20106n = hashMap;
        this.f20107r = z10;
        this.f20108s = tLMethod;
    }

    public xj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f20102a = 2;
        this.f20103b = sendMessagesHelper;
        this.f20107r = z10;
        this.f20104c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f20105f = messageObject;
        this.f20106n = hashMap;
        this.h = str;
        this.f20108s = tLObject2;
    }
}
