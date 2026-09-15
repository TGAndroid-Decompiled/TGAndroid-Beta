package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kk implements Runnable {
    public final int f16612a;
    public final Object f16613b;
    public final Object f16614c;
    public final Object d;
    public final Object e;
    public final Object f16615f;
    public final Object h;
    public final Object f16616n;
    public final boolean f16617r;
    public final Object f16618s;

    public kk(Object obj, Object obj2, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, org.telegram.ui.ActionBar.f1 f1Var3, org.telegram.ui.ActionBar.f1 f1Var4, boolean z10, org.telegram.ui.ActionBar.f1 f1Var5, org.telegram.ui.ActionBar.f1 f1Var6, int i10) {
        this.f16612a = i10;
        this.f16613b = obj;
        this.f16614c = obj2;
        this.d = f1Var;
        this.e = f1Var2;
        this.f16615f = f1Var3;
        this.h = f1Var4;
        this.f16617r = z10;
        this.f16616n = f1Var5;
        this.f16618s = f1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f16612a) {
            case 0:
                ((SendMessagesHelper) this.f16613b).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.f16614c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16615f, (String) this.h, (HashMap) this.f16616n, this.f16617r, (TLRPC.TL_messages_addPollAnswer) this.f16618s);
                return;
            case 1:
                ((SendMessagesHelper) this.f16613b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f16614c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16615f, (String) this.h, (HashMap) this.f16616n, this.f16617r, (TLRPC.TL_messages_editMessage) this.f16618s);
                return;
            case 2:
                ((SendMessagesHelper) this.f16613b).lambda$performSendMessageRequest$100(this.f16617r, (TLRPC.TL_error) this.f16614c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16615f, (HashMap) this.f16616n, (String) this.h, (TLObject) this.f16618s);
                return;
            case 3:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f16613b;
                yh.n5 n5Var = (yh.n5) this.f16614c;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var3 = (org.telegram.ui.ActionBar.f1) this.e;
                org.telegram.ui.ActionBar.f1 f1Var4 = (org.telegram.ui.ActionBar.f1) this.f16615f;
                org.telegram.ui.ActionBar.f1 f1Var5 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var6 = (org.telegram.ui.ActionBar.f1) this.f16616n;
                org.telegram.ui.ActionBar.f1 f1Var7 = (org.telegram.ui.ActionBar.f1) this.f16618s;
                if (f1Var != null) {
                    if (n5Var.e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (n5Var.e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    f1Var.g(string, i11, null);
                }
                f1Var2.setChecked(TLObject.hasFlag(n5Var.f47494g, 1));
                f1Var3.setChecked(TLObject.hasFlag(n5Var.f47494g, 2));
                f1Var4.setChecked(TLObject.hasFlag(n5Var.f47494g, 4));
                f1Var5.setChecked(TLObject.hasFlag(n5Var.f47494g, 8));
                if (this.f16617r) {
                    f1Var6.setChecked(TLObject.hasFlag(n5Var.f47494g, 256));
                    f1Var7.setChecked(TLObject.hasFlag(n5Var.f47494g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var8 = (org.telegram.ui.ActionBar.f1) this.f16614c;
                org.telegram.ui.ActionBar.f1 f1Var9 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var10 = (org.telegram.ui.ActionBar.f1) this.e;
                org.telegram.ui.ActionBar.f1 f1Var11 = (org.telegram.ui.ActionBar.f1) this.f16615f;
                org.telegram.ui.ActionBar.f1 f1Var12 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var13 = (org.telegram.ui.ActionBar.f1) this.f16616n;
                org.telegram.ui.ActionBar.f1 f1Var14 = (org.telegram.ui.ActionBar.f1) this.f16618s;
                yh.n5 n5Var2 = ((xh.i4) this.f16613b).f45929c.Y;
                if (n5Var2.e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (n5Var2.e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                f1Var8.g(string2, i13, null);
                f1Var9.setChecked(TLObject.hasFlag(n5Var2.f47494g, 1));
                f1Var10.setChecked(TLObject.hasFlag(n5Var2.f47494g, 2));
                f1Var11.setChecked(TLObject.hasFlag(n5Var2.f47494g, 4));
                f1Var12.setChecked(TLObject.hasFlag(n5Var2.f47494g, 8));
                if (this.f16617r) {
                    f1Var13.setChecked(TLObject.hasFlag(n5Var2.f47494g, 256));
                    f1Var14.setChecked(TLObject.hasFlag(n5Var2.f47494g, 512));
                    return;
                }
                return;
        }
    }

    public kk(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f16612a = i10;
        this.f16613b = sendMessagesHelper;
        this.f16614c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16615f = messageObject;
        this.h = str;
        this.f16616n = hashMap;
        this.f16617r = z10;
        this.f16618s = tLMethod;
    }

    public kk(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f16612a = 2;
        this.f16613b = sendMessagesHelper;
        this.f16617r = z10;
        this.f16614c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16615f = messageObject;
        this.f16616n = hashMap;
        this.h = str;
        this.f16618s = tLObject2;
    }
}
