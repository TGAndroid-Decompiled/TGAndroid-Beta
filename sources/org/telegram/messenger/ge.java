package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.pr;
public final class ge implements Runnable {
    public final int f17949a = 0;
    public final int f17950b;
    public final Object f17951c;
    public final Collection d;
    public final Object f17952e;
    public final Object f17953f;
    public final Object h;
    public final Object f17954n;
    public final Object f17955r;
    public final Object f17956s;
    public final Object v;

    public ge(MessagesController messagesController, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, TLRPC.messages_Dialogs messages_dialogs, ArrayList arrayList4, a0.i iVar, a0.i iVar2, Runnable runnable) {
        this.f17951c = messagesController;
        this.f17950b = i10;
        this.d = arrayList;
        this.f17952e = arrayList2;
        this.f17953f = arrayList3;
        this.f17954n = messages_dialogs;
        this.h = arrayList4;
        this.f17955r = iVar;
        this.f17956s = iVar2;
        this.v = runnable;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f17949a) {
            case 0:
                ((MessagesController) this.f17951c).lambda$processLoadedDialogFilters$22(this.f17950b, (ArrayList) this.d, (ArrayList) this.f17952e, (ArrayList) this.f17953f, (TLRPC.messages_Dialogs) this.f17954n, (ArrayList) this.h, (a0.i) this.f17955r, (a0.i) this.f17956s, (Runnable) this.v);
                return;
            default:
                int[] iArr = (int[]) this.f17952e;
                String[] strArr = (String[]) this.f17953f;
                String[] strArr2 = (String[]) this.h;
                ci.d dVar = (ci.d) this.f17954n;
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) this.f17955r;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f17956s;
                int[] iArr2 = (int[]) this.v;
                String charSequence = ((org.telegram.ui.Cells.j3) this.f17951c).getText().toString();
                StringBuilder v = a1.g.v(charSequence);
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
                v.append(str);
                String sb2 = v.toString();
                int length = sb2.length();
                int i10 = this.f17950b;
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
                    e9Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21037q7, e6Var));
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
                    e9Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21037q7, e6Var));
                    int i12 = -iArr2[0];
                    iArr2[0] = i12;
                    AndroidUtilities.shakeViewSpring(e9Var, i12);
                    return;
                } else if (!TextUtils.equals(strArr2[0], sb2)) {
                    strArr2[0] = sb2;
                    strArr[0] = null;
                    e9Var.setText(LocaleController.getString(R.string.UsernameChecking));
                    e9Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.B6, e6Var));
                    TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                    checkusername.username = sb2;
                    dVar.setLoading(true);
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequestTyped(checkusername, new Object(), new pr(dVar, strArr2, strArr, sb2, e9Var, e6Var, iArr2, 0));
                    return;
                } else {
                    return;
                }
        }
    }

    public ge(org.telegram.ui.Cells.j3 j3Var, Set set, int[] iArr, int i10, String[] strArr, String[] strArr2, ci.d dVar, org.telegram.ui.Cells.e9 e9Var, org.telegram.ui.ActionBar.e6 e6Var, int[] iArr2) {
        this.f17951c = j3Var;
        this.d = set;
        this.f17952e = iArr;
        this.f17950b = i10;
        this.f17953f = strArr;
        this.h = strArr2;
        this.f17954n = dVar;
        this.f17955r = e9Var;
        this.f17956s = e6Var;
        this.v = iArr2;
    }
}
