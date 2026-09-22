package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kk implements Runnable {
    public final int f16609a;
    public final Object f16610b;
    public final Object f16611c;
    public final Object d;
    public final Object e;
    public final Object f16612f;
    public final Object h;
    public final Object f16613n;
    public final boolean f16614r;
    public final Object f16615s;

    public kk(Object obj, Object obj2, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, org.telegram.ui.ActionBar.f1 f1Var3, org.telegram.ui.ActionBar.f1 f1Var4, boolean z10, org.telegram.ui.ActionBar.f1 f1Var5, org.telegram.ui.ActionBar.f1 f1Var6, int i10) {
        this.f16609a = i10;
        this.f16610b = obj;
        this.f16611c = obj2;
        this.d = f1Var;
        this.e = f1Var2;
        this.f16612f = f1Var3;
        this.h = f1Var4;
        this.f16614r = z10;
        this.f16613n = f1Var5;
        this.f16615s = f1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f16609a) {
            case 0:
                ((SendMessagesHelper) this.f16610b).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.f16611c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16612f, (String) this.h, (HashMap) this.f16613n, this.f16614r, (TLRPC.TL_messages_addPollAnswer) this.f16615s);
                return;
            case 1:
                ((SendMessagesHelper) this.f16610b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f16611c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16612f, (String) this.h, (HashMap) this.f16613n, this.f16614r, (TLRPC.TL_messages_editMessage) this.f16615s);
                return;
            case 2:
                ((SendMessagesHelper) this.f16610b).lambda$performSendMessageRequest$100(this.f16614r, (TLRPC.TL_error) this.f16611c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16612f, (HashMap) this.f16613n, (String) this.h, (TLObject) this.f16615s);
                return;
            case 3:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f16610b;
                yh.m5 m5Var = (yh.m5) this.f16611c;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var3 = (org.telegram.ui.ActionBar.f1) this.e;
                org.telegram.ui.ActionBar.f1 f1Var4 = (org.telegram.ui.ActionBar.f1) this.f16612f;
                org.telegram.ui.ActionBar.f1 f1Var5 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var6 = (org.telegram.ui.ActionBar.f1) this.f16613n;
                org.telegram.ui.ActionBar.f1 f1Var7 = (org.telegram.ui.ActionBar.f1) this.f16615s;
                if (f1Var != null) {
                    if (m5Var.e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (m5Var.e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    f1Var.g(string, i11, null);
                }
                f1Var2.setChecked(TLObject.hasFlag(m5Var.f47402g, 1));
                f1Var3.setChecked(TLObject.hasFlag(m5Var.f47402g, 2));
                f1Var4.setChecked(TLObject.hasFlag(m5Var.f47402g, 4));
                f1Var5.setChecked(TLObject.hasFlag(m5Var.f47402g, 8));
                if (this.f16614r) {
                    f1Var6.setChecked(TLObject.hasFlag(m5Var.f47402g, 256));
                    f1Var7.setChecked(TLObject.hasFlag(m5Var.f47402g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var8 = (org.telegram.ui.ActionBar.f1) this.f16611c;
                org.telegram.ui.ActionBar.f1 f1Var9 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var10 = (org.telegram.ui.ActionBar.f1) this.e;
                org.telegram.ui.ActionBar.f1 f1Var11 = (org.telegram.ui.ActionBar.f1) this.f16612f;
                org.telegram.ui.ActionBar.f1 f1Var12 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var13 = (org.telegram.ui.ActionBar.f1) this.f16613n;
                org.telegram.ui.ActionBar.f1 f1Var14 = (org.telegram.ui.ActionBar.f1) this.f16615s;
                yh.m5 m5Var2 = ((xh.i4) this.f16610b).f45925c.Y;
                if (m5Var2.e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (m5Var2.e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                f1Var8.g(string2, i13, null);
                f1Var9.setChecked(TLObject.hasFlag(m5Var2.f47402g, 1));
                f1Var10.setChecked(TLObject.hasFlag(m5Var2.f47402g, 2));
                f1Var11.setChecked(TLObject.hasFlag(m5Var2.f47402g, 4));
                f1Var12.setChecked(TLObject.hasFlag(m5Var2.f47402g, 8));
                if (this.f16614r) {
                    f1Var13.setChecked(TLObject.hasFlag(m5Var2.f47402g, 256));
                    f1Var14.setChecked(TLObject.hasFlag(m5Var2.f47402g, 512));
                    return;
                }
                return;
        }
    }

    public kk(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f16609a = i10;
        this.f16610b = sendMessagesHelper;
        this.f16611c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16612f = messageObject;
        this.h = str;
        this.f16613n = hashMap;
        this.f16614r = z10;
        this.f16615s = tLMethod;
    }

    public kk(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f16609a = 2;
        this.f16610b = sendMessagesHelper;
        this.f16614r = z10;
        this.f16611c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16612f = messageObject;
        this.f16613n = hashMap;
        this.h = str;
        this.f16615s = tLObject2;
    }
}
