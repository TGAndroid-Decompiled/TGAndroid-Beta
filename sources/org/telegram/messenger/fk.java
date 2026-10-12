package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk implements Runnable {
    public final int f17625a;
    public final Object f17626b;
    public final Object f17627c;
    public final Object d;
    public final Object f17628e;
    public final Object f17629f;
    public final Object h;
    public final Object f17630n;
    public final boolean f17631r;
    public final Object f17632s;

    public fk(Object obj, Object obj2, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, org.telegram.ui.ActionBar.e1 e1Var3, org.telegram.ui.ActionBar.e1 e1Var4, boolean z10, org.telegram.ui.ActionBar.e1 e1Var5, org.telegram.ui.ActionBar.e1 e1Var6, int i10) {
        this.f17625a = i10;
        this.f17626b = obj;
        this.f17627c = obj2;
        this.d = e1Var;
        this.f17628e = e1Var2;
        this.f17629f = e1Var3;
        this.h = e1Var4;
        this.f17631r = z10;
        this.f17630n = e1Var5;
        this.f17632s = e1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f17625a) {
            case 0:
                ((SendMessagesHelper) this.f17626b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f17627c, (TLRPC.Message) this.d, (TLObject) this.f17628e, (MessageObject) this.f17629f, (String) this.h, (HashMap) this.f17630n, this.f17631r, (TLRPC.TL_messages_addPollAnswer) this.f17632s);
                return;
            case 1:
                ((SendMessagesHelper) this.f17626b).lambda$performSendMessageRequest$92((TLRPC.TL_error) this.f17627c, (TLRPC.Message) this.d, (TLObject) this.f17628e, (MessageObject) this.f17629f, (String) this.h, (HashMap) this.f17630n, this.f17631r, (TLRPC.TL_messages_editMessage) this.f17632s);
                return;
            case 2:
                ((SendMessagesHelper) this.f17626b).lambda$performSendMessageRequest$103(this.f17631r, (TLRPC.TL_error) this.f17627c, (TLRPC.Message) this.d, (TLObject) this.f17628e, (MessageObject) this.f17629f, (HashMap) this.f17630n, (String) this.h, (TLObject) this.f17632s);
                return;
            case 3:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f17626b;
                yh.f5 f5Var = (yh.f5) this.f17627c;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var3 = (org.telegram.ui.ActionBar.e1) this.f17628e;
                org.telegram.ui.ActionBar.e1 e1Var4 = (org.telegram.ui.ActionBar.e1) this.f17629f;
                org.telegram.ui.ActionBar.e1 e1Var5 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var6 = (org.telegram.ui.ActionBar.e1) this.f17630n;
                org.telegram.ui.ActionBar.e1 e1Var7 = (org.telegram.ui.ActionBar.e1) this.f17632s;
                if (e1Var != null) {
                    if (f5Var.f52749e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (f5Var.f52749e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    e1Var.g(string, i11, null);
                }
                e1Var2.setChecked(TLObject.hasFlag(f5Var.f52751g, 1));
                e1Var3.setChecked(TLObject.hasFlag(f5Var.f52751g, 2));
                e1Var4.setChecked(TLObject.hasFlag(f5Var.f52751g, 4));
                e1Var5.setChecked(TLObject.hasFlag(f5Var.f52751g, 8));
                if (this.f17631r) {
                    e1Var6.setChecked(TLObject.hasFlag(f5Var.f52751g, 256));
                    e1Var7.setChecked(TLObject.hasFlag(f5Var.f52751g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var8 = (org.telegram.ui.ActionBar.e1) this.f17627c;
                org.telegram.ui.ActionBar.e1 e1Var9 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var10 = (org.telegram.ui.ActionBar.e1) this.f17628e;
                org.telegram.ui.ActionBar.e1 e1Var11 = (org.telegram.ui.ActionBar.e1) this.f17629f;
                org.telegram.ui.ActionBar.e1 e1Var12 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var13 = (org.telegram.ui.ActionBar.e1) this.f17630n;
                org.telegram.ui.ActionBar.e1 e1Var14 = (org.telegram.ui.ActionBar.e1) this.f17632s;
                yh.f5 f5Var2 = ((xh.i4) this.f17626b).f51542c.Y;
                if (f5Var2.f52749e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (f5Var2.f52749e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                e1Var8.g(string2, i13, null);
                e1Var9.setChecked(TLObject.hasFlag(f5Var2.f52751g, 1));
                e1Var10.setChecked(TLObject.hasFlag(f5Var2.f52751g, 2));
                e1Var11.setChecked(TLObject.hasFlag(f5Var2.f52751g, 4));
                e1Var12.setChecked(TLObject.hasFlag(f5Var2.f52751g, 8));
                if (this.f17631r) {
                    e1Var13.setChecked(TLObject.hasFlag(f5Var2.f52751g, 256));
                    e1Var14.setChecked(TLObject.hasFlag(f5Var2.f52751g, 512));
                    return;
                }
                return;
        }
    }

    public fk(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f17625a = i10;
        this.f17626b = sendMessagesHelper;
        this.f17627c = tL_error;
        this.d = message;
        this.f17628e = tLObject;
        this.f17629f = messageObject;
        this.h = str;
        this.f17630n = hashMap;
        this.f17631r = z10;
        this.f17632s = tLMethod;
    }

    public fk(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f17625a = 2;
        this.f17626b = sendMessagesHelper;
        this.f17631r = z10;
        this.f17627c = tL_error;
        this.d = message;
        this.f17628e = tLObject;
        this.f17629f = messageObject;
        this.f17630n = hashMap;
        this.h = str;
        this.f17632s = tLObject2;
    }
}
