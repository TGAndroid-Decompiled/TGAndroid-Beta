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
public final class o3 implements Runnable {
    public final int f10735a;
    public final boolean f10736b;
    public final Object f10737c;
    public final Object d;
    public final Object e;
    public final Object f10738f;
    public final Object h;
    public final Object f10739n;
    public final Object f10740r;
    public final Object f10741s;

    public o3(p3 p3Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, org.telegram.ui.ActionBar.g1 g1Var5, boolean z4, org.telegram.ui.ActionBar.g1 g1Var6, org.telegram.ui.ActionBar.g1 g1Var7) {
        this.f10735a = 0;
        this.f10737c = p3Var;
        this.d = g1Var;
        this.e = g1Var2;
        this.f10738f = g1Var3;
        this.h = g1Var4;
        this.f10739n = g1Var5;
        this.f10736b = z4;
        this.f10740r = g1Var6;
        this.f10741s = g1Var7;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f10735a) {
            case 0:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.f10738f;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var5 = (org.telegram.ui.ActionBar.g1) this.f10739n;
                org.telegram.ui.ActionBar.g1 g1Var6 = (org.telegram.ui.ActionBar.g1) this.f10740r;
                org.telegram.ui.ActionBar.g1 g1Var7 = (org.telegram.ui.ActionBar.g1) this.f10741s;
                l7 l7Var = ((p3) this.f10737c).f10749c.V;
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
                g1Var2.setChecked(TLObject.hasFlag(l7Var.f12768g, 1));
                g1Var3.setChecked(TLObject.hasFlag(l7Var.f12768g, 2));
                g1Var4.setChecked(TLObject.hasFlag(l7Var.f12768g, 4));
                g1Var5.setChecked(TLObject.hasFlag(l7Var.f12768g, 8));
                if (this.f10736b) {
                    g1Var6.setChecked(TLObject.hasFlag(l7Var.f12768g, 256));
                    g1Var7.setChecked(TLObject.hasFlag(l7Var.f12768g, 512));
                    return;
                }
                return;
            case 1:
                ((SendMessagesHelper) this.f10737c).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.d, (TLRPC.Message) this.e, (TLObject) this.f10738f, (MessageObject) this.h, (String) this.f10739n, (HashMap) this.f10740r, this.f10736b, (TLRPC.TL_messages_addPollAnswer) this.f10741s);
                return;
            case 2:
                ((SendMessagesHelper) this.f10737c).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.d, (TLRPC.Message) this.e, (TLObject) this.f10738f, (MessageObject) this.h, (String) this.f10739n, (HashMap) this.f10740r, this.f10736b, (TLRPC.TL_messages_editMessage) this.f10741s);
                return;
            case 3:
                ((SendMessagesHelper) this.f10737c).lambda$performSendMessageRequest$100(this.f10736b, (TLRPC.TL_error) this.d, (TLRPC.Message) this.e, (TLObject) this.f10738f, (MessageObject) this.h, (HashMap) this.f10739n, (String) this.f10740r, (TLObject) this.f10741s);
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var8 = (org.telegram.ui.ActionBar.g1) this.d;
                l7 l7Var2 = (l7) this.f10737c;
                org.telegram.ui.ActionBar.g1 g1Var9 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var10 = (org.telegram.ui.ActionBar.g1) this.f10738f;
                org.telegram.ui.ActionBar.g1 g1Var11 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var12 = (org.telegram.ui.ActionBar.g1) this.f10739n;
                org.telegram.ui.ActionBar.g1 g1Var13 = (org.telegram.ui.ActionBar.g1) this.f10740r;
                org.telegram.ui.ActionBar.g1 g1Var14 = (org.telegram.ui.ActionBar.g1) this.f10741s;
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
                g1Var9.setChecked(TLObject.hasFlag(l7Var2.f12768g, 1));
                g1Var10.setChecked(TLObject.hasFlag(l7Var2.f12768g, 2));
                g1Var11.setChecked(TLObject.hasFlag(l7Var2.f12768g, 4));
                g1Var12.setChecked(TLObject.hasFlag(l7Var2.f12768g, 8));
                if (this.f10736b) {
                    g1Var13.setChecked(TLObject.hasFlag(l7Var2.f12768g, 256));
                    g1Var14.setChecked(TLObject.hasFlag(l7Var2.f12768g, 512));
                    return;
                }
                return;
        }
    }

    public o3(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z4, TLMethod tLMethod, int i10) {
        this.f10735a = i10;
        this.f10737c = sendMessagesHelper;
        this.d = tL_error;
        this.e = message;
        this.f10738f = tLObject;
        this.h = messageObject;
        this.f10739n = str;
        this.f10740r = hashMap;
        this.f10736b = z4;
        this.f10741s = tLMethod;
    }

    public o3(SendMessagesHelper sendMessagesHelper, boolean z4, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f10735a = 3;
        this.f10737c = sendMessagesHelper;
        this.f10736b = z4;
        this.d = tL_error;
        this.e = message;
        this.f10738f = tLObject;
        this.h = messageObject;
        this.f10739n = hashMap;
        this.f10740r = str;
        this.f10741s = tLObject2;
    }

    public o3(org.telegram.ui.ActionBar.g1 g1Var, l7 l7Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, org.telegram.ui.ActionBar.g1 g1Var5, boolean z4, org.telegram.ui.ActionBar.g1 g1Var6, org.telegram.ui.ActionBar.g1 g1Var7) {
        this.f10735a = 4;
        this.d = g1Var;
        this.f10737c = l7Var;
        this.e = g1Var2;
        this.f10738f = g1Var3;
        this.h = g1Var4;
        this.f10739n = g1Var5;
        this.f10736b = z4;
        this.f10740r = g1Var6;
        this.f10741s = g1Var7;
    }
}
