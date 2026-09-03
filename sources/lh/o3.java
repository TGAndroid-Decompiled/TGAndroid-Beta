package lh;

import java.util.HashMap;
import mh.l7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o3 implements Runnable {
    public final int f12878a;
    public final boolean f12879b;
    public final Object f12880c;
    public final Object d;
    public final Object f12881e;
    public final Object f12882f;
    public final Object h;
    public final Object f12883n;
    public final Object f12884r;
    public final Object f12885s;

    public o3(p3 p3Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, org.telegram.ui.ActionBar.g1 g1Var5, boolean z4, org.telegram.ui.ActionBar.g1 g1Var6, org.telegram.ui.ActionBar.g1 g1Var7) {
        this.f12878a = 0;
        this.f12880c = p3Var;
        this.d = g1Var;
        this.f12881e = g1Var2;
        this.f12882f = g1Var3;
        this.h = g1Var4;
        this.f12883n = g1Var5;
        this.f12879b = z4;
        this.f12884r = g1Var6;
        this.f12885s = g1Var7;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f12878a) {
            case 0:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.f12881e;
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.f12882f;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var5 = (org.telegram.ui.ActionBar.g1) this.f12883n;
                org.telegram.ui.ActionBar.g1 g1Var6 = (org.telegram.ui.ActionBar.g1) this.f12884r;
                org.telegram.ui.ActionBar.g1 g1Var7 = (org.telegram.ui.ActionBar.g1) this.f12885s;
                l7 l7Var = ((p3) this.f12880c).f12895c.V;
                if (l7Var.f14401e) {
                    i10 = R.string.Gift2FilterSortByValue;
                } else {
                    i10 = R.string.Gift2FilterSortByDate;
                }
                String string = LocaleController.getString(i10);
                if (l7Var.f14401e) {
                    i11 = R.drawable.menu_sort_value;
                } else {
                    i11 = R.drawable.menu_sort_date;
                }
                g1Var.g(string, i11, null);
                g1Var2.setChecked(TLObject.hasFlag(l7Var.f14403g, 1));
                g1Var3.setChecked(TLObject.hasFlag(l7Var.f14403g, 2));
                g1Var4.setChecked(TLObject.hasFlag(l7Var.f14403g, 4));
                g1Var5.setChecked(TLObject.hasFlag(l7Var.f14403g, 8));
                if (this.f12879b) {
                    g1Var6.setChecked(TLObject.hasFlag(l7Var.f14403g, 256));
                    g1Var7.setChecked(TLObject.hasFlag(l7Var.f14403g, 512));
                    return;
                }
                return;
            case 1:
                ((SendMessagesHelper) this.f12880c).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.d, (TLRPC.Message) this.f12881e, (TLObject) this.f12882f, (MessageObject) this.h, (String) this.f12883n, (HashMap) this.f12884r, this.f12879b, (TLRPC.TL_messages_addPollAnswer) this.f12885s);
                return;
            case 2:
                ((SendMessagesHelper) this.f12880c).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.d, (TLRPC.Message) this.f12881e, (TLObject) this.f12882f, (MessageObject) this.h, (String) this.f12883n, (HashMap) this.f12884r, this.f12879b, (TLRPC.TL_messages_editMessage) this.f12885s);
                return;
            case 3:
                ((SendMessagesHelper) this.f12880c).lambda$performSendMessageRequest$100(this.f12879b, (TLRPC.TL_error) this.d, (TLRPC.Message) this.f12881e, (TLObject) this.f12882f, (MessageObject) this.h, (HashMap) this.f12883n, (String) this.f12884r, (TLObject) this.f12885s);
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var8 = (org.telegram.ui.ActionBar.g1) this.d;
                l7 l7Var2 = (l7) this.f12880c;
                org.telegram.ui.ActionBar.g1 g1Var9 = (org.telegram.ui.ActionBar.g1) this.f12881e;
                org.telegram.ui.ActionBar.g1 g1Var10 = (org.telegram.ui.ActionBar.g1) this.f12882f;
                org.telegram.ui.ActionBar.g1 g1Var11 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var12 = (org.telegram.ui.ActionBar.g1) this.f12883n;
                org.telegram.ui.ActionBar.g1 g1Var13 = (org.telegram.ui.ActionBar.g1) this.f12884r;
                org.telegram.ui.ActionBar.g1 g1Var14 = (org.telegram.ui.ActionBar.g1) this.f12885s;
                if (g1Var8 != null) {
                    if (l7Var2.f14401e) {
                        i12 = R.string.Gift2FilterSortByValue;
                    } else {
                        i12 = R.string.Gift2FilterSortByDate;
                    }
                    String string2 = LocaleController.getString(i12);
                    if (l7Var2.f14401e) {
                        i13 = R.drawable.menu_sort_value;
                    } else {
                        i13 = R.drawable.menu_sort_date;
                    }
                    g1Var8.g(string2, i13, null);
                }
                g1Var9.setChecked(TLObject.hasFlag(l7Var2.f14403g, 1));
                g1Var10.setChecked(TLObject.hasFlag(l7Var2.f14403g, 2));
                g1Var11.setChecked(TLObject.hasFlag(l7Var2.f14403g, 4));
                g1Var12.setChecked(TLObject.hasFlag(l7Var2.f14403g, 8));
                if (this.f12879b) {
                    g1Var13.setChecked(TLObject.hasFlag(l7Var2.f14403g, 256));
                    g1Var14.setChecked(TLObject.hasFlag(l7Var2.f14403g, 512));
                    return;
                }
                return;
        }
    }

    public o3(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z4, TLMethod tLMethod, int i10) {
        this.f12878a = i10;
        this.f12880c = sendMessagesHelper;
        this.d = tL_error;
        this.f12881e = message;
        this.f12882f = tLObject;
        this.h = messageObject;
        this.f12883n = str;
        this.f12884r = hashMap;
        this.f12879b = z4;
        this.f12885s = tLMethod;
    }

    public o3(SendMessagesHelper sendMessagesHelper, boolean z4, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f12878a = 3;
        this.f12880c = sendMessagesHelper;
        this.f12879b = z4;
        this.d = tL_error;
        this.f12881e = message;
        this.f12882f = tLObject;
        this.h = messageObject;
        this.f12883n = hashMap;
        this.f12884r = str;
        this.f12885s = tLObject2;
    }

    public o3(org.telegram.ui.ActionBar.g1 g1Var, l7 l7Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, org.telegram.ui.ActionBar.g1 g1Var5, boolean z4, org.telegram.ui.ActionBar.g1 g1Var6, org.telegram.ui.ActionBar.g1 g1Var7) {
        this.f12878a = 4;
        this.d = g1Var;
        this.f12880c = l7Var;
        this.f12881e = g1Var2;
        this.f12882f = g1Var3;
        this.h = g1Var4;
        this.f12883n = g1Var5;
        this.f12879b = z4;
        this.f12884r = g1Var6;
        this.f12885s = g1Var7;
    }
}
