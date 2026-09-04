package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kk implements Runnable {
    public final int f18201a;
    public final Object f18202b;
    public final Object f18203c;
    public final Object d;
    public final Object f18204e;
    public final Object f18205f;
    public final Object h;
    public final Object f18206n;
    public final boolean f18207r;
    public final Object f18208s;

    public kk(Object obj, Object obj2, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, org.telegram.ui.ActionBar.f1 f1Var3, org.telegram.ui.ActionBar.f1 f1Var4, boolean z10, org.telegram.ui.ActionBar.f1 f1Var5, org.telegram.ui.ActionBar.f1 f1Var6, int i10) {
        this.f18201a = i10;
        this.f18202b = obj;
        this.f18203c = obj2;
        this.d = f1Var;
        this.f18204e = f1Var2;
        this.f18205f = f1Var3;
        this.h = f1Var4;
        this.f18207r = z10;
        this.f18206n = f1Var5;
        this.f18208s = f1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f18201a) {
            case 0:
                ((SendMessagesHelper) this.f18202b).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.f18203c, (TLRPC.Message) this.d, (TLObject) this.f18204e, (MessageObject) this.f18205f, (String) this.h, (HashMap) this.f18206n, this.f18207r, (TLRPC.TL_messages_addPollAnswer) this.f18208s);
                return;
            case 1:
                ((SendMessagesHelper) this.f18202b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f18203c, (TLRPC.Message) this.d, (TLObject) this.f18204e, (MessageObject) this.f18205f, (String) this.h, (HashMap) this.f18206n, this.f18207r, (TLRPC.TL_messages_editMessage) this.f18208s);
                return;
            case 2:
                ((SendMessagesHelper) this.f18202b).lambda$performSendMessageRequest$100(this.f18207r, (TLRPC.TL_error) this.f18203c, (TLRPC.Message) this.d, (TLObject) this.f18204e, (MessageObject) this.f18205f, (HashMap) this.f18206n, (String) this.h, (TLObject) this.f18208s);
                return;
            case 3:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f18202b;
                zh.j5 j5Var = (zh.j5) this.f18203c;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var3 = (org.telegram.ui.ActionBar.f1) this.f18204e;
                org.telegram.ui.ActionBar.f1 f1Var4 = (org.telegram.ui.ActionBar.f1) this.f18205f;
                org.telegram.ui.ActionBar.f1 f1Var5 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var6 = (org.telegram.ui.ActionBar.f1) this.f18206n;
                org.telegram.ui.ActionBar.f1 f1Var7 = (org.telegram.ui.ActionBar.f1) this.f18208s;
                if (f1Var != null) {
                    if (j5Var.f52095e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (j5Var.f52095e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    f1Var.g(string, i11, null);
                }
                f1Var2.setChecked(TLObject.hasFlag(j5Var.f52097g, 1));
                f1Var3.setChecked(TLObject.hasFlag(j5Var.f52097g, 2));
                f1Var4.setChecked(TLObject.hasFlag(j5Var.f52097g, 4));
                f1Var5.setChecked(TLObject.hasFlag(j5Var.f52097g, 8));
                if (this.f18207r) {
                    f1Var6.setChecked(TLObject.hasFlag(j5Var.f52097g, 256));
                    f1Var7.setChecked(TLObject.hasFlag(j5Var.f52097g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var8 = (org.telegram.ui.ActionBar.f1) this.f18203c;
                org.telegram.ui.ActionBar.f1 f1Var9 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var10 = (org.telegram.ui.ActionBar.f1) this.f18204e;
                org.telegram.ui.ActionBar.f1 f1Var11 = (org.telegram.ui.ActionBar.f1) this.f18205f;
                org.telegram.ui.ActionBar.f1 f1Var12 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var13 = (org.telegram.ui.ActionBar.f1) this.f18206n;
                org.telegram.ui.ActionBar.f1 f1Var14 = (org.telegram.ui.ActionBar.f1) this.f18208s;
                zh.j5 j5Var2 = ((yh.h4) this.f18202b).f50331c.Y;
                if (j5Var2.f52095e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (j5Var2.f52095e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                f1Var8.g(string2, i13, null);
                f1Var9.setChecked(TLObject.hasFlag(j5Var2.f52097g, 1));
                f1Var10.setChecked(TLObject.hasFlag(j5Var2.f52097g, 2));
                f1Var11.setChecked(TLObject.hasFlag(j5Var2.f52097g, 4));
                f1Var12.setChecked(TLObject.hasFlag(j5Var2.f52097g, 8));
                if (this.f18207r) {
                    f1Var13.setChecked(TLObject.hasFlag(j5Var2.f52097g, 256));
                    f1Var14.setChecked(TLObject.hasFlag(j5Var2.f52097g, 512));
                    return;
                }
                return;
        }
    }

    public kk(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f18201a = i10;
        this.f18202b = sendMessagesHelper;
        this.f18203c = tL_error;
        this.d = message;
        this.f18204e = tLObject;
        this.f18205f = messageObject;
        this.h = str;
        this.f18206n = hashMap;
        this.f18207r = z10;
        this.f18208s = tLMethod;
    }

    public kk(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f18201a = 2;
        this.f18202b = sendMessagesHelper;
        this.f18207r = z10;
        this.f18203c = tL_error;
        this.d = message;
        this.f18204e = tLObject;
        this.f18205f = messageObject;
        this.f18206n = hashMap;
        this.h = str;
        this.f18208s = tLObject2;
    }
}
