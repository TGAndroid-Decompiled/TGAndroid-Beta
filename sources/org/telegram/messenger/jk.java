package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jk implements Runnable {
    public final int f18129a;
    public final Object f18130b;
    public final Object f18131c;
    public final Object d;
    public final Object f18132e;
    public final Object f18133f;
    public final Object h;
    public final Object f18134n;
    public final boolean f18135r;
    public final Object f18136s;

    public jk(Object obj, Object obj2, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, org.telegram.ui.ActionBar.f1 f1Var3, org.telegram.ui.ActionBar.f1 f1Var4, boolean z10, org.telegram.ui.ActionBar.f1 f1Var5, org.telegram.ui.ActionBar.f1 f1Var6, int i10) {
        this.f18129a = i10;
        this.f18130b = obj;
        this.f18131c = obj2;
        this.d = f1Var;
        this.f18132e = f1Var2;
        this.f18133f = f1Var3;
        this.h = f1Var4;
        this.f18135r = z10;
        this.f18134n = f1Var5;
        this.f18136s = f1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f18129a) {
            case 0:
                ((SendMessagesHelper) this.f18130b).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.f18131c, (TLRPC.Message) this.d, (TLObject) this.f18132e, (MessageObject) this.f18133f, (String) this.h, (HashMap) this.f18134n, this.f18135r, (TLRPC.TL_messages_addPollAnswer) this.f18136s);
                return;
            case 1:
                ((SendMessagesHelper) this.f18130b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f18131c, (TLRPC.Message) this.d, (TLObject) this.f18132e, (MessageObject) this.f18133f, (String) this.h, (HashMap) this.f18134n, this.f18135r, (TLRPC.TL_messages_editMessage) this.f18136s);
                return;
            case 2:
                ((SendMessagesHelper) this.f18130b).lambda$performSendMessageRequest$100(this.f18135r, (TLRPC.TL_error) this.f18131c, (TLRPC.Message) this.d, (TLObject) this.f18132e, (MessageObject) this.f18133f, (HashMap) this.f18134n, (String) this.h, (TLObject) this.f18136s);
                return;
            case 3:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f18130b;
                zh.j5 j5Var = (zh.j5) this.f18131c;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var3 = (org.telegram.ui.ActionBar.f1) this.f18132e;
                org.telegram.ui.ActionBar.f1 f1Var4 = (org.telegram.ui.ActionBar.f1) this.f18133f;
                org.telegram.ui.ActionBar.f1 f1Var5 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var6 = (org.telegram.ui.ActionBar.f1) this.f18134n;
                org.telegram.ui.ActionBar.f1 f1Var7 = (org.telegram.ui.ActionBar.f1) this.f18136s;
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
                if (this.f18135r) {
                    f1Var6.setChecked(TLObject.hasFlag(j5Var.f52097g, 256));
                    f1Var7.setChecked(TLObject.hasFlag(j5Var.f52097g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var8 = (org.telegram.ui.ActionBar.f1) this.f18131c;
                org.telegram.ui.ActionBar.f1 f1Var9 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var10 = (org.telegram.ui.ActionBar.f1) this.f18132e;
                org.telegram.ui.ActionBar.f1 f1Var11 = (org.telegram.ui.ActionBar.f1) this.f18133f;
                org.telegram.ui.ActionBar.f1 f1Var12 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var13 = (org.telegram.ui.ActionBar.f1) this.f18134n;
                org.telegram.ui.ActionBar.f1 f1Var14 = (org.telegram.ui.ActionBar.f1) this.f18136s;
                zh.j5 j5Var2 = ((yh.h4) this.f18130b).f50331c.Y;
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
                if (this.f18135r) {
                    f1Var13.setChecked(TLObject.hasFlag(j5Var2.f52097g, 256));
                    f1Var14.setChecked(TLObject.hasFlag(j5Var2.f52097g, 512));
                    return;
                }
                return;
        }
    }

    public jk(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f18129a = i10;
        this.f18130b = sendMessagesHelper;
        this.f18131c = tL_error;
        this.d = message;
        this.f18132e = tLObject;
        this.f18133f = messageObject;
        this.h = str;
        this.f18134n = hashMap;
        this.f18135r = z10;
        this.f18136s = tLMethod;
    }

    public jk(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f18129a = 2;
        this.f18130b = sendMessagesHelper;
        this.f18135r = z10;
        this.f18131c = tL_error;
        this.d = message;
        this.f18132e = tLObject;
        this.f18133f = messageObject;
        this.f18134n = hashMap;
        this.h = str;
        this.f18136s = tLObject2;
    }
}
