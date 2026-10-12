package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk implements Runnable {
    public final int f17624a;
    public final Object f17625b;
    public final Object f17626c;
    public final Object d;
    public final Object f17627e;
    public final Object f17628f;
    public final Object h;
    public final Object f17629n;
    public final boolean f17630r;
    public final Object f17631s;

    public fk(Object obj, Object obj2, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, org.telegram.ui.ActionBar.e1 e1Var3, org.telegram.ui.ActionBar.e1 e1Var4, boolean z10, org.telegram.ui.ActionBar.e1 e1Var5, org.telegram.ui.ActionBar.e1 e1Var6, int i10) {
        this.f17624a = i10;
        this.f17625b = obj;
        this.f17626c = obj2;
        this.d = e1Var;
        this.f17627e = e1Var2;
        this.f17628f = e1Var3;
        this.h = e1Var4;
        this.f17630r = z10;
        this.f17629n = e1Var5;
        this.f17631s = e1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f17624a) {
            case 0:
                ((SendMessagesHelper) this.f17625b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f17626c, (TLRPC.Message) this.d, (TLObject) this.f17627e, (MessageObject) this.f17628f, (String) this.h, (HashMap) this.f17629n, this.f17630r, (TLRPC.TL_messages_addPollAnswer) this.f17631s);
                return;
            case 1:
                ((SendMessagesHelper) this.f17625b).lambda$performSendMessageRequest$92((TLRPC.TL_error) this.f17626c, (TLRPC.Message) this.d, (TLObject) this.f17627e, (MessageObject) this.f17628f, (String) this.h, (HashMap) this.f17629n, this.f17630r, (TLRPC.TL_messages_editMessage) this.f17631s);
                return;
            case 2:
                ((SendMessagesHelper) this.f17625b).lambda$performSendMessageRequest$103(this.f17630r, (TLRPC.TL_error) this.f17626c, (TLRPC.Message) this.d, (TLObject) this.f17627e, (MessageObject) this.f17628f, (HashMap) this.f17629n, (String) this.h, (TLObject) this.f17631s);
                return;
            case 3:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f17625b;
                yh.f5 f5Var = (yh.f5) this.f17626c;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var3 = (org.telegram.ui.ActionBar.e1) this.f17627e;
                org.telegram.ui.ActionBar.e1 e1Var4 = (org.telegram.ui.ActionBar.e1) this.f17628f;
                org.telegram.ui.ActionBar.e1 e1Var5 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var6 = (org.telegram.ui.ActionBar.e1) this.f17629n;
                org.telegram.ui.ActionBar.e1 e1Var7 = (org.telegram.ui.ActionBar.e1) this.f17631s;
                if (e1Var != null) {
                    if (f5Var.f52737e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (f5Var.f52737e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    e1Var.g(string, i11, null);
                }
                e1Var2.setChecked(TLObject.hasFlag(f5Var.f52739g, 1));
                e1Var3.setChecked(TLObject.hasFlag(f5Var.f52739g, 2));
                e1Var4.setChecked(TLObject.hasFlag(f5Var.f52739g, 4));
                e1Var5.setChecked(TLObject.hasFlag(f5Var.f52739g, 8));
                if (this.f17630r) {
                    e1Var6.setChecked(TLObject.hasFlag(f5Var.f52739g, 256));
                    e1Var7.setChecked(TLObject.hasFlag(f5Var.f52739g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var8 = (org.telegram.ui.ActionBar.e1) this.f17626c;
                org.telegram.ui.ActionBar.e1 e1Var9 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var10 = (org.telegram.ui.ActionBar.e1) this.f17627e;
                org.telegram.ui.ActionBar.e1 e1Var11 = (org.telegram.ui.ActionBar.e1) this.f17628f;
                org.telegram.ui.ActionBar.e1 e1Var12 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var13 = (org.telegram.ui.ActionBar.e1) this.f17629n;
                org.telegram.ui.ActionBar.e1 e1Var14 = (org.telegram.ui.ActionBar.e1) this.f17631s;
                yh.f5 f5Var2 = ((xh.i4) this.f17625b).f51534c.Y;
                if (f5Var2.f52737e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (f5Var2.f52737e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                e1Var8.g(string2, i13, null);
                e1Var9.setChecked(TLObject.hasFlag(f5Var2.f52739g, 1));
                e1Var10.setChecked(TLObject.hasFlag(f5Var2.f52739g, 2));
                e1Var11.setChecked(TLObject.hasFlag(f5Var2.f52739g, 4));
                e1Var12.setChecked(TLObject.hasFlag(f5Var2.f52739g, 8));
                if (this.f17630r) {
                    e1Var13.setChecked(TLObject.hasFlag(f5Var2.f52739g, 256));
                    e1Var14.setChecked(TLObject.hasFlag(f5Var2.f52739g, 512));
                    return;
                }
                return;
        }
    }

    public fk(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f17624a = i10;
        this.f17625b = sendMessagesHelper;
        this.f17626c = tL_error;
        this.d = message;
        this.f17627e = tLObject;
        this.f17628f = messageObject;
        this.h = str;
        this.f17629n = hashMap;
        this.f17630r = z10;
        this.f17631s = tLMethod;
    }

    public fk(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f17624a = 2;
        this.f17625b = sendMessagesHelper;
        this.f17630r = z10;
        this.f17626c = tL_error;
        this.d = message;
        this.f17627e = tLObject;
        this.f17628f = messageObject;
        this.f17629n = hashMap;
        this.h = str;
        this.f17631s = tLObject2;
    }
}
