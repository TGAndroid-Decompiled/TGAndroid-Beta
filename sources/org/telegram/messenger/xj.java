package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xj implements Runnable {
    public final int f20167a;
    public final Object f20168b;
    public final Object f20169c;
    public final Object d;
    public final Object e;
    public final Object f20170f;
    public final Object h;
    public final Object f20171n;
    public final boolean f20172r;
    public final Object f20173s;

    public xj(Object obj, Object obj2, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, org.telegram.ui.ActionBar.e1 e1Var3, org.telegram.ui.ActionBar.e1 e1Var4, boolean z10, org.telegram.ui.ActionBar.e1 e1Var5, org.telegram.ui.ActionBar.e1 e1Var6, int i10) {
        this.f20167a = i10;
        this.f20168b = obj;
        this.f20169c = obj2;
        this.d = e1Var;
        this.e = e1Var2;
        this.f20170f = e1Var3;
        this.h = e1Var4;
        this.f20172r = z10;
        this.f20171n = e1Var5;
        this.f20173s = e1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f20167a) {
            case 0:
                ((SendMessagesHelper) this.f20168b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f20169c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f20170f, (String) this.h, (HashMap) this.f20171n, this.f20172r, (TLRPC.TL_messages_addPollAnswer) this.f20173s);
                return;
            case 1:
                ((SendMessagesHelper) this.f20168b).lambda$performSendMessageRequest$92((TLRPC.TL_error) this.f20169c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f20170f, (String) this.h, (HashMap) this.f20171n, this.f20172r, (TLRPC.TL_messages_editMessage) this.f20173s);
                return;
            case 2:
                ((SendMessagesHelper) this.f20168b).lambda$performSendMessageRequest$103(this.f20172r, (TLRPC.TL_error) this.f20169c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f20170f, (HashMap) this.f20171n, (String) this.h, (TLObject) this.f20173s);
                return;
            case 3:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f20168b;
                ai.y9 y9Var = (ai.y9) this.f20169c;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var3 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var4 = (org.telegram.ui.ActionBar.e1) this.f20170f;
                org.telegram.ui.ActionBar.e1 e1Var5 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var6 = (org.telegram.ui.ActionBar.e1) this.f20171n;
                org.telegram.ui.ActionBar.e1 e1Var7 = (org.telegram.ui.ActionBar.e1) this.f20173s;
                if (e1Var != null) {
                    if (y9Var.e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (y9Var.e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    e1Var.j(string, i11, null);
                }
                e1Var2.setChecked(TLObject.hasFlag(y9Var.f2507g, 1));
                e1Var3.setChecked(TLObject.hasFlag(y9Var.f2507g, 2));
                e1Var4.setChecked(TLObject.hasFlag(y9Var.f2507g, 4));
                e1Var5.setChecked(TLObject.hasFlag(y9Var.f2507g, 8));
                if (this.f20172r) {
                    e1Var6.setChecked(TLObject.hasFlag(y9Var.f2507g, 256));
                    e1Var7.setChecked(TLObject.hasFlag(y9Var.f2507g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var8 = (org.telegram.ui.ActionBar.e1) this.f20169c;
                org.telegram.ui.ActionBar.e1 e1Var9 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var10 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var11 = (org.telegram.ui.ActionBar.e1) this.f20170f;
                org.telegram.ui.ActionBar.e1 e1Var12 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var13 = (org.telegram.ui.ActionBar.e1) this.f20171n;
                org.telegram.ui.ActionBar.e1 e1Var14 = (org.telegram.ui.ActionBar.e1) this.f20173s;
                ai.y9 y9Var2 = ((yh.h4) this.f20168b).f50748c.Y;
                if (y9Var2.e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (y9Var2.e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                e1Var8.j(string2, i13, null);
                e1Var9.setChecked(TLObject.hasFlag(y9Var2.f2507g, 1));
                e1Var10.setChecked(TLObject.hasFlag(y9Var2.f2507g, 2));
                e1Var11.setChecked(TLObject.hasFlag(y9Var2.f2507g, 4));
                e1Var12.setChecked(TLObject.hasFlag(y9Var2.f2507g, 8));
                if (this.f20172r) {
                    e1Var13.setChecked(TLObject.hasFlag(y9Var2.f2507g, 256));
                    e1Var14.setChecked(TLObject.hasFlag(y9Var2.f2507g, 512));
                    return;
                }
                return;
        }
    }

    public xj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f20167a = i10;
        this.f20168b = sendMessagesHelper;
        this.f20169c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f20170f = messageObject;
        this.h = str;
        this.f20171n = hashMap;
        this.f20172r = z10;
        this.f20173s = tLMethod;
    }

    public xj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f20167a = 2;
        this.f20168b = sendMessagesHelper;
        this.f20172r = z10;
        this.f20169c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f20170f = messageObject;
        this.f20171n = hashMap;
        this.h = str;
        this.f20173s = tLObject2;
    }
}
