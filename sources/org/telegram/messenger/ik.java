package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ik implements Runnable {
    public final int f16680a;
    public final Object f16681b;
    public final Object f16682c;
    public final Object d;
    public final Object e;
    public final Object f16683f;
    public final Object h;
    public final Object f16684n;
    public final boolean f16685r;
    public final Object f16686s;

    public ik(Object obj, Object obj2, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, org.telegram.ui.ActionBar.e1 e1Var3, org.telegram.ui.ActionBar.e1 e1Var4, boolean z10, org.telegram.ui.ActionBar.e1 e1Var5, org.telegram.ui.ActionBar.e1 e1Var6, int i10) {
        this.f16680a = i10;
        this.f16681b = obj;
        this.f16682c = obj2;
        this.d = e1Var;
        this.e = e1Var2;
        this.f16683f = e1Var3;
        this.h = e1Var4;
        this.f16685r = z10;
        this.f16684n = e1Var5;
        this.f16686s = e1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f16680a) {
            case 0:
                ((SendMessagesHelper) this.f16681b).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.f16682c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16683f, (String) this.h, (HashMap) this.f16684n, this.f16685r, (TLRPC.TL_messages_addPollAnswer) this.f16686s);
                return;
            case 1:
                ((SendMessagesHelper) this.f16681b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f16682c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16683f, (String) this.h, (HashMap) this.f16684n, this.f16685r, (TLRPC.TL_messages_editMessage) this.f16686s);
                return;
            case 2:
                ((SendMessagesHelper) this.f16681b).lambda$performSendMessageRequest$100(this.f16685r, (TLRPC.TL_error) this.f16682c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16683f, (HashMap) this.f16684n, (String) this.h, (TLObject) this.f16686s);
                return;
            case 3:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f16681b;
                yh.k5 k5Var = (yh.k5) this.f16682c;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var3 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var4 = (org.telegram.ui.ActionBar.e1) this.f16683f;
                org.telegram.ui.ActionBar.e1 e1Var5 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var6 = (org.telegram.ui.ActionBar.e1) this.f16684n;
                org.telegram.ui.ActionBar.e1 e1Var7 = (org.telegram.ui.ActionBar.e1) this.f16686s;
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
                e1Var2.setChecked(TLObject.hasFlag(k5Var.f47608g, 1));
                e1Var3.setChecked(TLObject.hasFlag(k5Var.f47608g, 2));
                e1Var4.setChecked(TLObject.hasFlag(k5Var.f47608g, 4));
                e1Var5.setChecked(TLObject.hasFlag(k5Var.f47608g, 8));
                if (this.f16685r) {
                    e1Var6.setChecked(TLObject.hasFlag(k5Var.f47608g, 256));
                    e1Var7.setChecked(TLObject.hasFlag(k5Var.f47608g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var8 = (org.telegram.ui.ActionBar.e1) this.f16682c;
                org.telegram.ui.ActionBar.e1 e1Var9 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var10 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var11 = (org.telegram.ui.ActionBar.e1) this.f16683f;
                org.telegram.ui.ActionBar.e1 e1Var12 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var13 = (org.telegram.ui.ActionBar.e1) this.f16684n;
                org.telegram.ui.ActionBar.e1 e1Var14 = (org.telegram.ui.ActionBar.e1) this.f16686s;
                yh.k5 k5Var2 = ((xh.j4) this.f16681b).f46227c.Y;
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
                e1Var9.setChecked(TLObject.hasFlag(k5Var2.f47608g, 1));
                e1Var10.setChecked(TLObject.hasFlag(k5Var2.f47608g, 2));
                e1Var11.setChecked(TLObject.hasFlag(k5Var2.f47608g, 4));
                e1Var12.setChecked(TLObject.hasFlag(k5Var2.f47608g, 8));
                if (this.f16685r) {
                    e1Var13.setChecked(TLObject.hasFlag(k5Var2.f47608g, 256));
                    e1Var14.setChecked(TLObject.hasFlag(k5Var2.f47608g, 512));
                    return;
                }
                return;
        }
    }

    public ik(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f16680a = i10;
        this.f16681b = sendMessagesHelper;
        this.f16682c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16683f = messageObject;
        this.h = str;
        this.f16684n = hashMap;
        this.f16685r = z10;
        this.f16686s = tLMethod;
    }

    public ik(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f16680a = 2;
        this.f16681b = sendMessagesHelper;
        this.f16685r = z10;
        this.f16682c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16683f = messageObject;
        this.f16684n = hashMap;
        this.h = str;
        this.f16686s = tLObject2;
    }
}
