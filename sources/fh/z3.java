package fh;

import gh.n7;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z3 implements Runnable {
    public final int f6912a;
    public final boolean f6913b;
    public final Object f6914c;
    public final Object d;
    public final Object f6915e;
    public final Object f6916f;
    public final Object h;
    public final Object f6917n;
    public final Object f6918r;
    public final Object f6919s;

    public z3(a4 a4Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, org.telegram.ui.ActionBar.g1 g1Var5, boolean z10, org.telegram.ui.ActionBar.g1 g1Var6, org.telegram.ui.ActionBar.g1 g1Var7) {
        this.f6912a = 0;
        this.f6914c = a4Var;
        this.d = g1Var;
        this.f6915e = g1Var2;
        this.f6916f = g1Var3;
        this.h = g1Var4;
        this.f6917n = g1Var5;
        this.f6913b = z10;
        this.f6918r = g1Var6;
        this.f6919s = g1Var7;
    }

    @Override
    public final void run() {
        int i9;
        int i10;
        int i11;
        int i12;
        switch (this.f6912a) {
            case 0:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.f6915e;
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.f6916f;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var5 = (org.telegram.ui.ActionBar.g1) this.f6917n;
                org.telegram.ui.ActionBar.g1 g1Var6 = (org.telegram.ui.ActionBar.g1) this.f6918r;
                org.telegram.ui.ActionBar.g1 g1Var7 = (org.telegram.ui.ActionBar.g1) this.f6919s;
                n7 n7Var = ((a4) this.f6914c).f6355c.U;
                if (n7Var.f8619e) {
                    i9 = R.string.Gift2FilterSortByValue;
                } else {
                    i9 = R.string.Gift2FilterSortByDate;
                }
                String string = LocaleController.getString(i9);
                if (n7Var.f8619e) {
                    i10 = R.drawable.menu_sort_value;
                } else {
                    i10 = R.drawable.menu_sort_date;
                }
                g1Var.g(string, i10, null);
                g1Var2.setChecked(TLObject.hasFlag(n7Var.f8621g, 1));
                g1Var3.setChecked(TLObject.hasFlag(n7Var.f8621g, 2));
                g1Var4.setChecked(TLObject.hasFlag(n7Var.f8621g, 4));
                g1Var5.setChecked(TLObject.hasFlag(n7Var.f8621g, 8));
                if (this.f6913b) {
                    g1Var6.setChecked(TLObject.hasFlag(n7Var.f8621g, 256));
                    g1Var7.setChecked(TLObject.hasFlag(n7Var.f8621g, 512));
                    return;
                }
                return;
            case 1:
                ((SendMessagesHelper) this.f6914c).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.d, (TLRPC.Message) this.f6915e, (TLObject) this.f6916f, (MessageObject) this.h, (String) this.f6917n, (HashMap) this.f6918r, this.f6913b, (TLRPC.TL_messages_addPollAnswer) this.f6919s);
                return;
            case 2:
                ((SendMessagesHelper) this.f6914c).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.d, (TLRPC.Message) this.f6915e, (TLObject) this.f6916f, (MessageObject) this.h, (String) this.f6917n, (HashMap) this.f6918r, this.f6913b, (TLRPC.TL_messages_editMessage) this.f6919s);
                return;
            case 3:
                ((SendMessagesHelper) this.f6914c).lambda$performSendMessageRequest$100(this.f6913b, (TLRPC.TL_error) this.d, (TLRPC.Message) this.f6915e, (TLObject) this.f6916f, (MessageObject) this.h, (HashMap) this.f6917n, (String) this.f6918r, (TLObject) this.f6919s);
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var8 = (org.telegram.ui.ActionBar.g1) this.d;
                n7 n7Var2 = (n7) this.f6914c;
                org.telegram.ui.ActionBar.g1 g1Var9 = (org.telegram.ui.ActionBar.g1) this.f6915e;
                org.telegram.ui.ActionBar.g1 g1Var10 = (org.telegram.ui.ActionBar.g1) this.f6916f;
                org.telegram.ui.ActionBar.g1 g1Var11 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var12 = (org.telegram.ui.ActionBar.g1) this.f6917n;
                org.telegram.ui.ActionBar.g1 g1Var13 = (org.telegram.ui.ActionBar.g1) this.f6918r;
                org.telegram.ui.ActionBar.g1 g1Var14 = (org.telegram.ui.ActionBar.g1) this.f6919s;
                if (g1Var8 != null) {
                    if (n7Var2.f8619e) {
                        i11 = R.string.Gift2FilterSortByValue;
                    } else {
                        i11 = R.string.Gift2FilterSortByDate;
                    }
                    String string2 = LocaleController.getString(i11);
                    if (n7Var2.f8619e) {
                        i12 = R.drawable.menu_sort_value;
                    } else {
                        i12 = R.drawable.menu_sort_date;
                    }
                    g1Var8.g(string2, i12, null);
                }
                g1Var9.setChecked(TLObject.hasFlag(n7Var2.f8621g, 1));
                g1Var10.setChecked(TLObject.hasFlag(n7Var2.f8621g, 2));
                g1Var11.setChecked(TLObject.hasFlag(n7Var2.f8621g, 4));
                g1Var12.setChecked(TLObject.hasFlag(n7Var2.f8621g, 8));
                if (this.f6913b) {
                    g1Var13.setChecked(TLObject.hasFlag(n7Var2.f8621g, 256));
                    g1Var14.setChecked(TLObject.hasFlag(n7Var2.f8621g, 512));
                    return;
                }
                return;
        }
    }

    public z3(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i9) {
        this.f6912a = i9;
        this.f6914c = sendMessagesHelper;
        this.d = tL_error;
        this.f6915e = message;
        this.f6916f = tLObject;
        this.h = messageObject;
        this.f6917n = str;
        this.f6918r = hashMap;
        this.f6913b = z10;
        this.f6919s = tLMethod;
    }

    public z3(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f6912a = 3;
        this.f6914c = sendMessagesHelper;
        this.f6913b = z10;
        this.d = tL_error;
        this.f6915e = message;
        this.f6916f = tLObject;
        this.h = messageObject;
        this.f6917n = hashMap;
        this.f6918r = str;
        this.f6919s = tLObject2;
    }

    public z3(org.telegram.ui.ActionBar.g1 g1Var, n7 n7Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, org.telegram.ui.ActionBar.g1 g1Var5, boolean z10, org.telegram.ui.ActionBar.g1 g1Var6, org.telegram.ui.ActionBar.g1 g1Var7) {
        this.f6912a = 4;
        this.d = g1Var;
        this.f6914c = n7Var;
        this.f6915e = g1Var2;
        this.f6916f = g1Var3;
        this.h = g1Var4;
        this.f6917n = g1Var5;
        this.f6913b = z10;
        this.f6918r = g1Var6;
        this.f6919s = g1Var7;
    }
}
