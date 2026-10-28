package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bk implements Runnable {
    public final int f19733a;
    public final Object f19734b;
    public final Object f19735c;
    public final Object d;
    public final Object e;
    public final Object f19736f;
    public final Object h;
    public final Object f19737n;
    public final boolean f19738r;
    public final Object f19739s;

    public bk(Object obj, Object obj2, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, boolean z10, org.telegram.ui.ActionBar.g1 g1Var5, org.telegram.ui.ActionBar.g1 g1Var6, int i10) {
        this.f19733a = i10;
        this.f19734b = obj;
        this.f19735c = obj2;
        this.d = g1Var;
        this.e = g1Var2;
        this.f19736f = g1Var3;
        this.h = g1Var4;
        this.f19738r = z10;
        this.f19737n = g1Var5;
        this.f19739s = g1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f19733a) {
            case 0:
                ((SendMessagesHelper) this.f19734b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f19735c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f19736f, (String) this.h, (HashMap) this.f19737n, this.f19738r, (TLRPC.TL_messages_addPollAnswer) this.f19739s);
                return;
            case 1:
                ((SendMessagesHelper) this.f19734b).lambda$performSendMessageRequest$92((TLRPC.TL_error) this.f19735c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f19736f, (String) this.h, (HashMap) this.f19737n, this.f19738r, (TLRPC.TL_messages_editMessage) this.f19739s);
                return;
            case 2:
                ((SendMessagesHelper) this.f19734b).lambda$performSendMessageRequest$103(this.f19738r, (TLRPC.TL_error) this.f19735c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f19736f, (HashMap) this.f19737n, (String) this.h, (TLObject) this.f19739s);
                return;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f19734b;
                bi.t9 t9Var = (bi.t9) this.f19735c;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.f19736f;
                org.telegram.ui.ActionBar.g1 g1Var5 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var6 = (org.telegram.ui.ActionBar.g1) this.f19737n;
                org.telegram.ui.ActionBar.g1 g1Var7 = (org.telegram.ui.ActionBar.g1) this.f19739s;
                if (g1Var != null) {
                    if (t9Var.e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (t9Var.e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    g1Var.j(string, i11, null);
                }
                g1Var2.setChecked(TLObject.hasFlag(t9Var.f5467g, 1));
                g1Var3.setChecked(TLObject.hasFlag(t9Var.f5467g, 2));
                g1Var4.setChecked(TLObject.hasFlag(t9Var.f5467g, 4));
                g1Var5.setChecked(TLObject.hasFlag(t9Var.f5467g, 8));
                if (this.f19738r) {
                    g1Var6.setChecked(TLObject.hasFlag(t9Var.f5467g, 256));
                    g1Var7.setChecked(TLObject.hasFlag(t9Var.f5467g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var8 = (org.telegram.ui.ActionBar.g1) this.f19735c;
                org.telegram.ui.ActionBar.g1 g1Var9 = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var10 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var11 = (org.telegram.ui.ActionBar.g1) this.f19736f;
                org.telegram.ui.ActionBar.g1 g1Var12 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var13 = (org.telegram.ui.ActionBar.g1) this.f19737n;
                org.telegram.ui.ActionBar.g1 g1Var14 = (org.telegram.ui.ActionBar.g1) this.f19739s;
                bi.t9 t9Var2 = ((zh.i4) this.f19734b).f53107c.Y;
                if (t9Var2.e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (t9Var2.e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                g1Var8.j(string2, i13, null);
                g1Var9.setChecked(TLObject.hasFlag(t9Var2.f5467g, 1));
                g1Var10.setChecked(TLObject.hasFlag(t9Var2.f5467g, 2));
                g1Var11.setChecked(TLObject.hasFlag(t9Var2.f5467g, 4));
                g1Var12.setChecked(TLObject.hasFlag(t9Var2.f5467g, 8));
                if (this.f19738r) {
                    g1Var13.setChecked(TLObject.hasFlag(t9Var2.f5467g, 256));
                    g1Var14.setChecked(TLObject.hasFlag(t9Var2.f5467g, 512));
                    return;
                }
                return;
        }
    }

    public bk(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f19733a = i10;
        this.f19734b = sendMessagesHelper;
        this.f19735c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f19736f = messageObject;
        this.h = str;
        this.f19737n = hashMap;
        this.f19738r = z10;
        this.f19739s = tLMethod;
    }

    public bk(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f19733a = 2;
        this.f19734b = sendMessagesHelper;
        this.f19738r = z10;
        this.f19735c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f19736f = messageObject;
        this.f19737n = hashMap;
        this.h = str;
        this.f19739s = tLObject2;
    }
}
