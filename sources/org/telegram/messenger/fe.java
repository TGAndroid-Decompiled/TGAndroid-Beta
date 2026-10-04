package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class fe implements Runnable {
    public final int f17855a = 0;
    public final int f17856b;
    public final Object f17857c;
    public final Collection d;
    public final Object f17858e;
    public final Object f17859f;
    public final Object h;
    public final Object f17860n;
    public final Object f17861r;
    public final Object f17862s;
    public final Object v;

    public fe(MessagesController messagesController, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, TLRPC.messages_Dialogs messages_dialogs, ArrayList arrayList4, a0.i iVar, a0.i iVar2, Runnable runnable) {
        this.f17857c = messagesController;
        this.f17856b = i10;
        this.d = arrayList;
        this.f17858e = arrayList2;
        this.f17859f = arrayList3;
        this.f17860n = messages_dialogs;
        this.h = arrayList4;
        this.f17861r = iVar;
        this.f17862s = iVar2;
        this.v = runnable;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f17855a) {
            case 0:
                ((MessagesController) this.f17857c).lambda$processLoadedDialogFilters$22(this.f17856b, (ArrayList) this.d, (ArrayList) this.f17858e, (ArrayList) this.f17859f, (TLRPC.messages_Dialogs) this.f17860n, (ArrayList) this.h, (a0.i) this.f17861r, (a0.i) this.f17862s, (Runnable) this.v);
                return;
            default:
                int[] iArr = (int[]) this.f17858e;
                final String[] strArr = (String[]) this.f17859f;
                final String[] strArr2 = (String[]) this.h;
                final ci.d dVar = (ci.d) this.f17860n;
                final org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) this.f17861r;
                final org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f17862s;
                final int[] iArr2 = (int[]) this.v;
                String charSequence = ((org.telegram.ui.Cells.j3) this.f17857c).getText().toString();
                StringBuilder u10 = a4.a.u(charSequence);
                Iterator it = ((Set) this.d).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (charSequence.endsWith((String) it.next())) {
                            str = "";
                        }
                    } else {
                        str = "bot";
                    }
                }
                u10.append(str);
                final String sb2 = u10.toString();
                int length = sb2.length();
                int i10 = this.f17856b;
                if (length < 4) {
                    if (iArr[0] >= 0) {
                        ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                        iArr[0] = -1;
                    }
                    strArr2[0] = null;
                    strArr[0] = null;
                    dVar.setLoading(false);
                    dVar.setEnabled(false);
                    e9Var.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    e9Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21058q7, d6Var));
                    int i11 = -iArr2[0];
                    iArr2[0] = i11;
                    AndroidUtilities.shakeViewSpring(e9Var, i11);
                    return;
                } else if (sb2.length() > 32) {
                    if (iArr[0] >= 0) {
                        ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                        iArr[0] = -1;
                    }
                    strArr2[0] = null;
                    strArr[0] = null;
                    dVar.setLoading(false);
                    dVar.setEnabled(false);
                    e9Var.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    e9Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21058q7, d6Var));
                    int i12 = -iArr2[0];
                    iArr2[0] = i12;
                    AndroidUtilities.shakeViewSpring(e9Var, i12);
                    return;
                } else if (!TextUtils.equals(strArr2[0], sb2)) {
                    strArr2[0] = sb2;
                    strArr[0] = null;
                    e9Var.setText(LocaleController.getString(R.string.UsernameChecking));
                    e9Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B6, d6Var));
                    TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                    checkusername.username = sb2;
                    dVar.setLoading(true);
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequestTyped(checkusername, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            ci.d dVar2 = ci.d.this;
                            dVar2.setLoading(false);
                            strArr2[0] = null;
                            boolean z10 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                            String[] strArr3 = strArr;
                            org.telegram.ui.Cells.e9 e9Var2 = e9Var;
                            org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                            if (z10) {
                                String str2 = sb2;
                                strArr3[0] = str2;
                                dVar2.setEnabled(true);
                                e9Var2.setText(LocaleController.formatString(R.string.UsernameAvailable, t8.b.i("@", str2)));
                                e9Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21170w6, d6Var2));
                                return;
                            }
                            strArr3[0] = null;
                            dVar2.setEnabled(false);
                            e9Var2.setText(LocaleController.getString(R.string.UsernameInUse));
                            e9Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21058q7, d6Var2));
                            int[] iArr3 = iArr2;
                            int i13 = -iArr3[0];
                            iArr3[0] = i13;
                            AndroidUtilities.shakeViewSpring(e9Var2, i13);
                        }
                    });
                    return;
                } else {
                    return;
                }
        }
    }

    public fe(org.telegram.ui.Cells.j3 j3Var, Set set, int[] iArr, int i10, String[] strArr, String[] strArr2, ci.d dVar, org.telegram.ui.Cells.e9 e9Var, org.telegram.ui.ActionBar.d6 d6Var, int[] iArr2) {
        this.f17857c = j3Var;
        this.d = set;
        this.f17858e = iArr;
        this.f17856b = i10;
        this.f17859f = strArr;
        this.h = strArr2;
        this.f17860n = dVar;
        this.f17861r = e9Var;
        this.f17862s = d6Var;
        this.v = iArr2;
    }
}
