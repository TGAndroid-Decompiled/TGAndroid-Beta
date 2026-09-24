package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ik implements Runnable {
    public final int f16661a;
    public final Object f16662b;
    public final Object f16663c;
    public final Object d;
    public final Object e;
    public final Object f16664f;
    public final Object h;
    public final Object f16665n;
    public final boolean f16666r;
    public final Object f16667s;

    public ik(Object obj, Object obj2, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, org.telegram.ui.ActionBar.e1 e1Var3, org.telegram.ui.ActionBar.e1 e1Var4, boolean z10, org.telegram.ui.ActionBar.e1 e1Var5, org.telegram.ui.ActionBar.e1 e1Var6, int i10) {
        this.f16661a = i10;
        this.f16662b = obj;
        this.f16663c = obj2;
        this.d = e1Var;
        this.e = e1Var2;
        this.f16664f = e1Var3;
        this.h = e1Var4;
        this.f16666r = z10;
        this.f16665n = e1Var5;
        this.f16667s = e1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f16661a) {
            case 0:
                ((SendMessagesHelper) this.f16662b).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.f16663c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16664f, (String) this.h, (HashMap) this.f16665n, this.f16666r, (TLRPC.TL_messages_addPollAnswer) this.f16667s);
                return;
            case 1:
                ((SendMessagesHelper) this.f16662b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f16663c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16664f, (String) this.h, (HashMap) this.f16665n, this.f16666r, (TLRPC.TL_messages_editMessage) this.f16667s);
                return;
            case 2:
                ((SendMessagesHelper) this.f16662b).lambda$performSendMessageRequest$100(this.f16666r, (TLRPC.TL_error) this.f16663c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16664f, (HashMap) this.f16665n, (String) this.h, (TLObject) this.f16667s);
                return;
            case 3:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f16662b;
                yh.k5 k5Var = (yh.k5) this.f16663c;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var3 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var4 = (org.telegram.ui.ActionBar.e1) this.f16664f;
                org.telegram.ui.ActionBar.e1 e1Var5 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var6 = (org.telegram.ui.ActionBar.e1) this.f16665n;
                org.telegram.ui.ActionBar.e1 e1Var7 = (org.telegram.ui.ActionBar.e1) this.f16667s;
                if (e1Var != null) {
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
                    e1Var.g(string, i11, null);
                }
                e1Var2.setChecked(TLObject.hasFlag(k5Var.f47597g, 1));
                e1Var3.setChecked(TLObject.hasFlag(k5Var.f47597g, 2));
                e1Var4.setChecked(TLObject.hasFlag(k5Var.f47597g, 4));
                e1Var5.setChecked(TLObject.hasFlag(k5Var.f47597g, 8));
                if (this.f16666r) {
                    e1Var6.setChecked(TLObject.hasFlag(k5Var.f47597g, 256));
                    e1Var7.setChecked(TLObject.hasFlag(k5Var.f47597g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var8 = (org.telegram.ui.ActionBar.e1) this.f16663c;
                org.telegram.ui.ActionBar.e1 e1Var9 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var10 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var11 = (org.telegram.ui.ActionBar.e1) this.f16664f;
                org.telegram.ui.ActionBar.e1 e1Var12 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var13 = (org.telegram.ui.ActionBar.e1) this.f16665n;
                org.telegram.ui.ActionBar.e1 e1Var14 = (org.telegram.ui.ActionBar.e1) this.f16667s;
                yh.k5 k5Var2 = ((xh.j4) this.f16662b).f46213c.Y;
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
                e1Var8.g(string2, i13, null);
                e1Var9.setChecked(TLObject.hasFlag(k5Var2.f47597g, 1));
                e1Var10.setChecked(TLObject.hasFlag(k5Var2.f47597g, 2));
                e1Var11.setChecked(TLObject.hasFlag(k5Var2.f47597g, 4));
                e1Var12.setChecked(TLObject.hasFlag(k5Var2.f47597g, 8));
                if (this.f16666r) {
                    e1Var13.setChecked(TLObject.hasFlag(k5Var2.f47597g, 256));
                    e1Var14.setChecked(TLObject.hasFlag(k5Var2.f47597g, 512));
                    return;
                }
                return;
        }
    }

    public ik(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f16661a = i10;
        this.f16662b = sendMessagesHelper;
        this.f16663c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16664f = messageObject;
        this.h = str;
        this.f16665n = hashMap;
        this.f16666r = z10;
        this.f16667s = tLMethod;
    }

    public ik(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f16661a = 2;
        this.f16662b = sendMessagesHelper;
        this.f16666r = z10;
        this.f16663c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16664f = messageObject;
        this.f16665n = hashMap;
        this.h = str;
        this.f16667s = tLObject2;
    }
}
