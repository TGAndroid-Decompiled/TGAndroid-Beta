package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kk implements Runnable {
    public final int f16621a;
    public final Object f16622b;
    public final Object f16623c;
    public final Object d;
    public final Object e;
    public final Object f16624f;
    public final Object h;
    public final Object f16625n;
    public final boolean f16626r;
    public final Object f16627s;

    public kk(Object obj, Object obj2, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, boolean z10, org.telegram.ui.ActionBar.g1 g1Var5, org.telegram.ui.ActionBar.g1 g1Var6, int i10) {
        this.f16621a = i10;
        this.f16622b = obj;
        this.f16623c = obj2;
        this.d = g1Var;
        this.e = g1Var2;
        this.f16624f = g1Var3;
        this.h = g1Var4;
        this.f16626r = z10;
        this.f16625n = g1Var5;
        this.f16627s = g1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f16621a) {
            case 0:
                ((SendMessagesHelper) this.f16622b).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.f16623c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16624f, (String) this.h, (HashMap) this.f16625n, this.f16626r, (TLRPC.TL_messages_addPollAnswer) this.f16627s);
                return;
            case 1:
                ((SendMessagesHelper) this.f16622b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f16623c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16624f, (String) this.h, (HashMap) this.f16625n, this.f16626r, (TLRPC.TL_messages_editMessage) this.f16627s);
                return;
            case 2:
                ((SendMessagesHelper) this.f16622b).lambda$performSendMessageRequest$100(this.f16626r, (TLRPC.TL_error) this.f16623c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f16624f, (HashMap) this.f16625n, (String) this.h, (TLObject) this.f16627s);
                return;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f16622b;
                yh.n5 n5Var = (yh.n5) this.f16623c;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.f16624f;
                org.telegram.ui.ActionBar.g1 g1Var5 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var6 = (org.telegram.ui.ActionBar.g1) this.f16625n;
                org.telegram.ui.ActionBar.g1 g1Var7 = (org.telegram.ui.ActionBar.g1) this.f16627s;
                if (g1Var != null) {
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
                    g1Var.g(string, i11, null);
                }
                g1Var2.setChecked(TLObject.hasFlag(n5Var.f47517g, 1));
                g1Var3.setChecked(TLObject.hasFlag(n5Var.f47517g, 2));
                g1Var4.setChecked(TLObject.hasFlag(n5Var.f47517g, 4));
                g1Var5.setChecked(TLObject.hasFlag(n5Var.f47517g, 8));
                if (this.f16626r) {
                    g1Var6.setChecked(TLObject.hasFlag(n5Var.f47517g, 256));
                    g1Var7.setChecked(TLObject.hasFlag(n5Var.f47517g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var8 = (org.telegram.ui.ActionBar.g1) this.f16623c;
                org.telegram.ui.ActionBar.g1 g1Var9 = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var10 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var11 = (org.telegram.ui.ActionBar.g1) this.f16624f;
                org.telegram.ui.ActionBar.g1 g1Var12 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var13 = (org.telegram.ui.ActionBar.g1) this.f16625n;
                org.telegram.ui.ActionBar.g1 g1Var14 = (org.telegram.ui.ActionBar.g1) this.f16627s;
                yh.n5 n5Var2 = ((xh.i4) this.f16622b).f45952c.Y;
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
                g1Var8.g(string2, i13, null);
                g1Var9.setChecked(TLObject.hasFlag(n5Var2.f47517g, 1));
                g1Var10.setChecked(TLObject.hasFlag(n5Var2.f47517g, 2));
                g1Var11.setChecked(TLObject.hasFlag(n5Var2.f47517g, 4));
                g1Var12.setChecked(TLObject.hasFlag(n5Var2.f47517g, 8));
                if (this.f16626r) {
                    g1Var13.setChecked(TLObject.hasFlag(n5Var2.f47517g, 256));
                    g1Var14.setChecked(TLObject.hasFlag(n5Var2.f47517g, 512));
                    return;
                }
                return;
        }
    }

    public kk(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f16621a = i10;
        this.f16622b = sendMessagesHelper;
        this.f16623c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16624f = messageObject;
        this.h = str;
        this.f16625n = hashMap;
        this.f16626r = z10;
        this.f16627s = tLMethod;
    }

    public kk(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f16621a = 2;
        this.f16622b = sendMessagesHelper;
        this.f16626r = z10;
        this.f16623c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f16624f = messageObject;
        this.f16625n = hashMap;
        this.h = str;
        this.f16627s = tLObject2;
    }
}
