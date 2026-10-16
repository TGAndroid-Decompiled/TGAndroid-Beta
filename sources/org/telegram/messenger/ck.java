package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ck implements Runnable {
    public final int f16716a;
    public final Object f16717b;
    public final Object f16718c;
    public final Object d;
    public final Object e;
    public final Object f16719f;
    public final Object h;
    public final Object f16720n;
    public final boolean f16721r;
    public final Object f16722s;

    public ck(Object obj, Object obj2, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, org.telegram.ui.ActionBar.e1 e1Var3, org.telegram.ui.ActionBar.e1 e1Var4, boolean z10, org.telegram.ui.ActionBar.e1 e1Var5, org.telegram.ui.ActionBar.e1 e1Var6, int i10) {
        this.f16716a = i10;
        this.f16717b = obj;
        this.f16718c = obj2;
        this.d = e1Var;
        this.e = e1Var2;
        this.f16719f = e1Var3;
        this.h = e1Var4;
        this.f16721r = z10;
        this.f16720n = e1Var5;
        this.f16722s = e1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f16716a) {
            case 0:
                ((SendMessagesHelper) this.f16717b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f16718c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16719f, (String) this.h, (HashMap) this.f16720n, this.f16721r, (TLRPC.TL_messages_addPollAnswer) this.f16722s);
                return;
            case 1:
                ((SendMessagesHelper) this.f16717b).lambda$performSendMessageRequest$92((TLRPC.TL_error) this.f16718c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16719f, (String) this.h, (HashMap) this.f16720n, this.f16721r, (TLRPC.TL_messages_editMessage) this.f16722s);
                return;
            case 2:
                ((SendMessagesHelper) this.f16717b).lambda$performSendMessageRequest$103(this.f16721r, (TLRPC.TL_error) this.f16718c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16719f, (HashMap) this.f16720n, (String) this.h, (TLObject) this.f16722s);
                return;
            case 3:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f16717b;
                zh.f5 f5Var = (zh.f5) this.f16718c;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var3 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var4 = (org.telegram.ui.ActionBar.e1) this.f16719f;
                org.telegram.ui.ActionBar.e1 e1Var5 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var6 = (org.telegram.ui.ActionBar.e1) this.f16720n;
                org.telegram.ui.ActionBar.e1 e1Var7 = (org.telegram.ui.ActionBar.e1) this.f16722s;
                if (e1Var != null) {
                    if (f5Var.e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (f5Var.e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    e1Var.g(string, i11, null);
                }
                e1Var2.setChecked(TLObject.hasFlag(f5Var.f50506g, 1));
                e1Var3.setChecked(TLObject.hasFlag(f5Var.f50506g, 2));
                e1Var4.setChecked(TLObject.hasFlag(f5Var.f50506g, 4));
                e1Var5.setChecked(TLObject.hasFlag(f5Var.f50506g, 8));
                if (this.f16721r) {
                    e1Var6.setChecked(TLObject.hasFlag(f5Var.f50506g, 256));
                    e1Var7.setChecked(TLObject.hasFlag(f5Var.f50506g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var8 = (org.telegram.ui.ActionBar.e1) this.f16718c;
                org.telegram.ui.ActionBar.e1 e1Var9 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var10 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var11 = (org.telegram.ui.ActionBar.e1) this.f16719f;
                org.telegram.ui.ActionBar.e1 e1Var12 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var13 = (org.telegram.ui.ActionBar.e1) this.f16720n;
                org.telegram.ui.ActionBar.e1 e1Var14 = (org.telegram.ui.ActionBar.e1) this.f16722s;
                zh.f5 f5Var2 = ((yh.h4) this.f16717b).f48915c.Y;
                if (f5Var2.e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (f5Var2.e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                e1Var8.g(string2, i13, null);
                e1Var9.setChecked(TLObject.hasFlag(f5Var2.f50506g, 1));
                e1Var10.setChecked(TLObject.hasFlag(f5Var2.f50506g, 2));
                e1Var11.setChecked(TLObject.hasFlag(f5Var2.f50506g, 4));
                e1Var12.setChecked(TLObject.hasFlag(f5Var2.f50506g, 8));
                if (this.f16721r) {
                    e1Var13.setChecked(TLObject.hasFlag(f5Var2.f50506g, 256));
                    e1Var14.setChecked(TLObject.hasFlag(f5Var2.f50506g, 512));
                    return;
                }
                return;
        }
    }

    public ck(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f16716a = i10;
        this.f16717b = sendMessagesHelper;
        this.f16718c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16719f = messageObject;
        this.h = str;
        this.f16720n = hashMap;
        this.f16721r = z10;
        this.f16722s = tLMethod;
    }

    public ck(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f16716a = 2;
        this.f16717b = sendMessagesHelper;
        this.f16721r = z10;
        this.f16718c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16719f = messageObject;
        this.f16720n = hashMap;
        this.h = str;
        this.f16722s = tLObject2;
    }
}
