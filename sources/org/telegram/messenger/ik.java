package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ik implements Runnable {
    public final int f16673a;
    public final Object f16674b;
    public final Object f16675c;
    public final Object d;
    public final Object e;
    public final Object f16676f;
    public final Object h;
    public final Object f16677n;
    public final boolean f16678r;
    public final Object f16679s;

    public ik(Object obj, Object obj2, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, boolean z10, org.telegram.ui.ActionBar.g1 g1Var5, org.telegram.ui.ActionBar.g1 g1Var6, int i10) {
        this.f16673a = i10;
        this.f16674b = obj;
        this.f16675c = obj2;
        this.d = g1Var;
        this.e = g1Var2;
        this.f16676f = g1Var3;
        this.h = g1Var4;
        this.f16678r = z10;
        this.f16677n = g1Var5;
        this.f16679s = g1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f16673a) {
            case 0:
                ((SendMessagesHelper) this.f16674b).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.f16675c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16676f, (String) this.h, (HashMap) this.f16677n, this.f16678r, (TLRPC.TL_messages_addPollAnswer) this.f16679s);
                return;
            case 1:
                ((SendMessagesHelper) this.f16674b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f16675c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16676f, (String) this.h, (HashMap) this.f16677n, this.f16678r, (TLRPC.TL_messages_editMessage) this.f16679s);
                return;
            case 2:
                ((SendMessagesHelper) this.f16674b).lambda$performSendMessageRequest$100(this.f16678r, (TLRPC.TL_error) this.f16675c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16676f, (HashMap) this.f16677n, (String) this.h, (TLObject) this.f16679s);
                return;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f16674b;
                yh.k5 k5Var = (yh.k5) this.f16675c;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.f16676f;
                org.telegram.ui.ActionBar.g1 g1Var5 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var6 = (org.telegram.ui.ActionBar.g1) this.f16677n;
                org.telegram.ui.ActionBar.g1 g1Var7 = (org.telegram.ui.ActionBar.g1) this.f16679s;
                if (g1Var != null) {
                    if (k5Var.e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (k5Var.e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    g1Var.g(string, i11, null);
                }
                g1Var2.setChecked(TLObject.hasFlag(k5Var.f47662g, 1));
                g1Var3.setChecked(TLObject.hasFlag(k5Var.f47662g, 2));
                g1Var4.setChecked(TLObject.hasFlag(k5Var.f47662g, 4));
                g1Var5.setChecked(TLObject.hasFlag(k5Var.f47662g, 8));
                if (this.f16678r) {
                    g1Var6.setChecked(TLObject.hasFlag(k5Var.f47662g, 256));
                    g1Var7.setChecked(TLObject.hasFlag(k5Var.f47662g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var8 = (org.telegram.ui.ActionBar.g1) this.f16675c;
                org.telegram.ui.ActionBar.g1 g1Var9 = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var10 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var11 = (org.telegram.ui.ActionBar.g1) this.f16676f;
                org.telegram.ui.ActionBar.g1 g1Var12 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var13 = (org.telegram.ui.ActionBar.g1) this.f16677n;
                org.telegram.ui.ActionBar.g1 g1Var14 = (org.telegram.ui.ActionBar.g1) this.f16679s;
                yh.k5 k5Var2 = ((xh.k4) this.f16674b).f46322c.Y;
                if (k5Var2.e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (k5Var2.e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                g1Var8.g(string2, i13, null);
                g1Var9.setChecked(TLObject.hasFlag(k5Var2.f47662g, 1));
                g1Var10.setChecked(TLObject.hasFlag(k5Var2.f47662g, 2));
                g1Var11.setChecked(TLObject.hasFlag(k5Var2.f47662g, 4));
                g1Var12.setChecked(TLObject.hasFlag(k5Var2.f47662g, 8));
                if (this.f16678r) {
                    g1Var13.setChecked(TLObject.hasFlag(k5Var2.f47662g, 256));
                    g1Var14.setChecked(TLObject.hasFlag(k5Var2.f47662g, 512));
                    return;
                }
                return;
        }
    }

    public ik(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f16673a = i10;
        this.f16674b = sendMessagesHelper;
        this.f16675c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16676f = messageObject;
        this.h = str;
        this.f16677n = hashMap;
        this.f16678r = z10;
        this.f16679s = tLMethod;
    }

    public ik(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f16673a = 2;
        this.f16674b = sendMessagesHelper;
        this.f16678r = z10;
        this.f16675c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16676f = messageObject;
        this.f16677n = hashMap;
        this.h = str;
        this.f16679s = tLObject2;
    }
}
