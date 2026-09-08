package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kk implements Runnable {
    public final int f18228a;
    public final Object f18229b;
    public final Object f18230c;
    public final Object d;
    public final Object f18231e;
    public final Object f18232f;
    public final Object h;
    public final Object f18233n;
    public final boolean f18234r;
    public final Object f18235s;

    public kk(Object obj, Object obj2, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, org.telegram.ui.ActionBar.f1 f1Var3, org.telegram.ui.ActionBar.f1 f1Var4, boolean z10, org.telegram.ui.ActionBar.f1 f1Var5, org.telegram.ui.ActionBar.f1 f1Var6, int i10) {
        this.f18228a = i10;
        this.f18229b = obj;
        this.f18230c = obj2;
        this.d = f1Var;
        this.f18231e = f1Var2;
        this.f18232f = f1Var3;
        this.h = f1Var4;
        this.f18234r = z10;
        this.f18233n = f1Var5;
        this.f18235s = f1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f18228a) {
            case 0:
                ((SendMessagesHelper) this.f18229b).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.f18230c, (TLRPC.Message) this.d, (TLObject) this.f18231e, (MessageObject) this.f18232f, (String) this.h, (HashMap) this.f18233n, this.f18234r, (TLRPC.TL_messages_addPollAnswer) this.f18235s);
                return;
            case 1:
                ((SendMessagesHelper) this.f18229b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f18230c, (TLRPC.Message) this.d, (TLObject) this.f18231e, (MessageObject) this.f18232f, (String) this.h, (HashMap) this.f18233n, this.f18234r, (TLRPC.TL_messages_editMessage) this.f18235s);
                return;
            case 2:
                ((SendMessagesHelper) this.f18229b).lambda$performSendMessageRequest$100(this.f18234r, (TLRPC.TL_error) this.f18230c, (TLRPC.Message) this.d, (TLObject) this.f18231e, (MessageObject) this.f18232f, (HashMap) this.f18233n, (String) this.h, (TLObject) this.f18235s);
                return;
            case 3:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f18229b;
                zh.j5 j5Var = (zh.j5) this.f18230c;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var3 = (org.telegram.ui.ActionBar.f1) this.f18231e;
                org.telegram.ui.ActionBar.f1 f1Var4 = (org.telegram.ui.ActionBar.f1) this.f18232f;
                org.telegram.ui.ActionBar.f1 f1Var5 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var6 = (org.telegram.ui.ActionBar.f1) this.f18233n;
                org.telegram.ui.ActionBar.f1 f1Var7 = (org.telegram.ui.ActionBar.f1) this.f18235s;
                if (f1Var != null) {
                    if (j5Var.f52126e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (j5Var.f52126e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    f1Var.g(string, i11, null);
                }
                f1Var2.setChecked(TLObject.hasFlag(j5Var.f52128g, 1));
                f1Var3.setChecked(TLObject.hasFlag(j5Var.f52128g, 2));
                f1Var4.setChecked(TLObject.hasFlag(j5Var.f52128g, 4));
                f1Var5.setChecked(TLObject.hasFlag(j5Var.f52128g, 8));
                if (this.f18234r) {
                    f1Var6.setChecked(TLObject.hasFlag(j5Var.f52128g, 256));
                    f1Var7.setChecked(TLObject.hasFlag(j5Var.f52128g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var8 = (org.telegram.ui.ActionBar.f1) this.f18230c;
                org.telegram.ui.ActionBar.f1 f1Var9 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var10 = (org.telegram.ui.ActionBar.f1) this.f18231e;
                org.telegram.ui.ActionBar.f1 f1Var11 = (org.telegram.ui.ActionBar.f1) this.f18232f;
                org.telegram.ui.ActionBar.f1 f1Var12 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var13 = (org.telegram.ui.ActionBar.f1) this.f18233n;
                org.telegram.ui.ActionBar.f1 f1Var14 = (org.telegram.ui.ActionBar.f1) this.f18235s;
                zh.j5 j5Var2 = ((yh.h4) this.f18229b).f50360c.Y;
                if (j5Var2.f52126e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (j5Var2.f52126e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                f1Var8.g(string2, i13, null);
                f1Var9.setChecked(TLObject.hasFlag(j5Var2.f52128g, 1));
                f1Var10.setChecked(TLObject.hasFlag(j5Var2.f52128g, 2));
                f1Var11.setChecked(TLObject.hasFlag(j5Var2.f52128g, 4));
                f1Var12.setChecked(TLObject.hasFlag(j5Var2.f52128g, 8));
                if (this.f18234r) {
                    f1Var13.setChecked(TLObject.hasFlag(j5Var2.f52128g, 256));
                    f1Var14.setChecked(TLObject.hasFlag(j5Var2.f52128g, 512));
                    return;
                }
                return;
        }
    }

    public kk(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f18228a = i10;
        this.f18229b = sendMessagesHelper;
        this.f18230c = tL_error;
        this.d = message;
        this.f18231e = tLObject;
        this.f18232f = messageObject;
        this.h = str;
        this.f18233n = hashMap;
        this.f18234r = z10;
        this.f18235s = tLMethod;
    }

    public kk(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f18228a = 2;
        this.f18229b = sendMessagesHelper;
        this.f18234r = z10;
        this.f18230c = tL_error;
        this.d = message;
        this.f18231e = tLObject;
        this.f18232f = messageObject;
        this.f18233n = hashMap;
        this.h = str;
        this.f18235s = tLObject2;
    }
}
