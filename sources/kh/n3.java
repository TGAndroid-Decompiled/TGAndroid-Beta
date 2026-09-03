package kh;

import java.util.HashMap;
import lh.l7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n3 implements Runnable {
    public final int f10834a;
    public final boolean f10835b;
    public final Object f10836c;
    public final Object d;
    public final Object e;
    public final Object f10837f;
    public final Object h;
    public final Object f10838n;
    public final Object f10839r;
    public final Object f10840s;

    public n3(o3 o3Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, org.telegram.ui.ActionBar.g1 g1Var5, boolean z4, org.telegram.ui.ActionBar.g1 g1Var6, org.telegram.ui.ActionBar.g1 g1Var7) {
        this.f10834a = 0;
        this.f10836c = o3Var;
        this.d = g1Var;
        this.e = g1Var2;
        this.f10837f = g1Var3;
        this.h = g1Var4;
        this.f10838n = g1Var5;
        this.f10835b = z4;
        this.f10839r = g1Var6;
        this.f10840s = g1Var7;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f10834a) {
            case 0:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.f10837f;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var5 = (org.telegram.ui.ActionBar.g1) this.f10838n;
                org.telegram.ui.ActionBar.g1 g1Var6 = (org.telegram.ui.ActionBar.g1) this.f10839r;
                org.telegram.ui.ActionBar.g1 g1Var7 = (org.telegram.ui.ActionBar.g1) this.f10840s;
                l7 l7Var = ((o3) this.f10836c).f10848c.V;
                if (l7Var.e) {
                    i10 = R.string.Gift2FilterSortByValue;
                } else {
                    i10 = R.string.Gift2FilterSortByDate;
                }
                String string = LocaleController.getString(i10);
                if (l7Var.e) {
                    i11 = R.drawable.menu_sort_value;
                } else {
                    i11 = R.drawable.menu_sort_date;
                }
                g1Var.g(string, i11, null);
                g1Var2.setChecked(TLObject.hasFlag(l7Var.f12752g, 1));
                g1Var3.setChecked(TLObject.hasFlag(l7Var.f12752g, 2));
                g1Var4.setChecked(TLObject.hasFlag(l7Var.f12752g, 4));
                g1Var5.setChecked(TLObject.hasFlag(l7Var.f12752g, 8));
                if (this.f10835b) {
                    g1Var6.setChecked(TLObject.hasFlag(l7Var.f12752g, 256));
                    g1Var7.setChecked(TLObject.hasFlag(l7Var.f12752g, 512));
                    return;
                }
                return;
            case 1:
                ((SendMessagesHelper) this.f10836c).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.d, (TLRPC.Message) this.e, (TLObject) this.f10837f, (MessageObject) this.h, (String) this.f10838n, (HashMap) this.f10839r, this.f10835b, (TLRPC.TL_messages_addPollAnswer) this.f10840s);
                return;
            case 2:
                ((SendMessagesHelper) this.f10836c).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.d, (TLRPC.Message) this.e, (TLObject) this.f10837f, (MessageObject) this.h, (String) this.f10838n, (HashMap) this.f10839r, this.f10835b, (TLRPC.TL_messages_editMessage) this.f10840s);
                return;
            case 3:
                ((SendMessagesHelper) this.f10836c).lambda$performSendMessageRequest$100(this.f10835b, (TLRPC.TL_error) this.d, (TLRPC.Message) this.e, (TLObject) this.f10837f, (MessageObject) this.h, (HashMap) this.f10838n, (String) this.f10839r, (TLObject) this.f10840s);
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var8 = (org.telegram.ui.ActionBar.g1) this.d;
                l7 l7Var2 = (l7) this.f10836c;
                org.telegram.ui.ActionBar.g1 g1Var9 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var10 = (org.telegram.ui.ActionBar.g1) this.f10837f;
                org.telegram.ui.ActionBar.g1 g1Var11 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var12 = (org.telegram.ui.ActionBar.g1) this.f10838n;
                org.telegram.ui.ActionBar.g1 g1Var13 = (org.telegram.ui.ActionBar.g1) this.f10839r;
                org.telegram.ui.ActionBar.g1 g1Var14 = (org.telegram.ui.ActionBar.g1) this.f10840s;
                if (g1Var8 != null) {
                    if (l7Var2.e) {
                        i12 = R.string.Gift2FilterSortByValue;
                    } else {
                        i12 = R.string.Gift2FilterSortByDate;
                    }
                    String string2 = LocaleController.getString(i12);
                    if (l7Var2.e) {
                        i13 = R.drawable.menu_sort_value;
                    } else {
                        i13 = R.drawable.menu_sort_date;
                    }
                    g1Var8.g(string2, i13, null);
                }
                g1Var9.setChecked(TLObject.hasFlag(l7Var2.f12752g, 1));
                g1Var10.setChecked(TLObject.hasFlag(l7Var2.f12752g, 2));
                g1Var11.setChecked(TLObject.hasFlag(l7Var2.f12752g, 4));
                g1Var12.setChecked(TLObject.hasFlag(l7Var2.f12752g, 8));
                if (this.f10835b) {
                    g1Var13.setChecked(TLObject.hasFlag(l7Var2.f12752g, 256));
                    g1Var14.setChecked(TLObject.hasFlag(l7Var2.f12752g, 512));
                    return;
                }
                return;
        }
    }

    public n3(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z4, TLMethod tLMethod, int i10) {
        this.f10834a = i10;
        this.f10836c = sendMessagesHelper;
        this.d = tL_error;
        this.e = message;
        this.f10837f = tLObject;
        this.h = messageObject;
        this.f10838n = str;
        this.f10839r = hashMap;
        this.f10835b = z4;
        this.f10840s = tLMethod;
    }

    public n3(SendMessagesHelper sendMessagesHelper, boolean z4, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f10834a = 3;
        this.f10836c = sendMessagesHelper;
        this.f10835b = z4;
        this.d = tL_error;
        this.e = message;
        this.f10837f = tLObject;
        this.h = messageObject;
        this.f10838n = hashMap;
        this.f10839r = str;
        this.f10840s = tLObject2;
    }

    public n3(org.telegram.ui.ActionBar.g1 g1Var, l7 l7Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, org.telegram.ui.ActionBar.g1 g1Var5, boolean z4, org.telegram.ui.ActionBar.g1 g1Var6, org.telegram.ui.ActionBar.g1 g1Var7) {
        this.f10834a = 4;
        this.d = g1Var;
        this.f10836c = l7Var;
        this.e = g1Var2;
        this.f10837f = g1Var3;
        this.h = g1Var4;
        this.f10838n = g1Var5;
        this.f10835b = z4;
        this.f10839r = g1Var6;
        this.f10840s = g1Var7;
    }
}
