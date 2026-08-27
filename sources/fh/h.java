package fh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.y8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.kt;
import org.telegram.ui.rn;
import org.telegram.ui.zf1;
import qf.m0;

public final class h implements Runnable {

    public final int f6124a = 0;

    public final Object f6125b;

    public final Object f6126c;
    public final boolean d;

    public final Object f6127e;

    public final Object f6128f;
    public final Object h;

    public final Object f6129n;

    public h(v vVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f6127e = vVar;
        this.f6125b = tL_error;
        this.f6126c = tLObject;
        this.f6128f = tL_chatInviteImporter;
        this.d = z10;
        this.h = user;
        this.f6129n = tL_messages_hideChatJoinRequest;
    }

    @Override
    public final void run() {
        n nVar;
        v vVar;
        int i10;
        ArrayList arrayList;
        TLRPC.User user;
        qb qbVar;
        String firstName;
        String string;
        int i11 = this.f6124a;
        boolean z10 = this.d;
        Object obj = this.h;
        Object obj2 = this.f6129n;
        Object obj3 = this.f6128f;
        Object obj4 = this.f6126c;
        Object obj5 = this.f6125b;
        Object obj6 = this.f6127e;
        switch (i11) {
            case 0:
                v vVar2 = (v) obj6;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj2;
                int i12 = vVar2.f6181k;
                ArrayList arrayList2 = vVar2.f6176e;
                n2 n2Var = vVar2.f6178g;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    if (tL_error != null) {
                        y4.f0(i12, tL_error, n2Var, tL_messages_hideChatJoinRequest, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i12).loadFullChat(tL_updates.chats.get(0).f22380id, 0, true);
                        }
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            if (((TLRPC.TL_chatInviteImporter) arrayList2.get(i13)).user_id == tL_chatInviteImporter.user_id) {
                                arrayList2.remove(i13);
                                nVar = vVar2.f6177f;
                                vVar = nVar.f6146c;
                                i10 = 0;
                                while (true) {
                                    arrayList = vVar.f6175c;
                                    if (i10 < arrayList.size()) {
                                        user = user2;
                                        if (((TLRPC.TL_chatInviteImporter) arrayList.get(i10)).user_id == tL_chatInviteImporter.user_id) {
                                            i10++;
                                            user2 = user;
                                        }
                                    } else {
                                        user = user2;
                                        i10 = -1;
                                    }
                                }
                                if (i10 >= 0) {
                                    arrayList.remove(i10);
                                    nVar.u((!nVar.f6146c.B ? 1 : 0) + i10);
                                    if (arrayList.isEmpty()) {
                                        nVar.u(1);
                                    }
                                }
                                vVar2.f(vVar2.f6190t, false, true);
                                if (z10) {
                                    qbVar = new qb(n2Var.getParentActivity(), n2Var.getResourceProvider());
                                    int iDp = AndroidUtilities.dp(15.0f);
                                    n9 n9Var = qbVar.f31861a;
                                    n9Var.setRoundRadius(iDp);
                                    TLRPC.User user3 = user;
                                    n9Var.e(user3, new y8(0, user3));
                                    firstName = UserObject.getFirstName(user3);
                                    if (vVar2.f6173a) {
                                        string = LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName);
                                    } else {
                                        string = LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                                    }
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                                    int iIndexOf = string.indexOf(firstName);
                                    spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), iIndexOf, firstName.length() + iIndexOf, 18);
                                    qbVar.f31862b.setText(spannableStringBuilder);
                                    if (arrayList2.isEmpty()) {
                                        ec.g(n2Var, qbVar, 2750).j();
                                    } else {
                                        ec.f(vVar2.h, qbVar, 2750).j();
                                    }
                                }
                                z zVarN = n2Var.getActionBar().n();
                                if (!TextUtils.isEmpty(vVar2.f6190t) && vVar2.f6182l) {
                                    zVarN.k(0).setVisibility(arrayList2.isEmpty() ? 8 : 0);
                                    break;
                                }
                            }
                        }
                        nVar = vVar2.f6177f;
                        vVar = nVar.f6146c;
                        i10 = 0;
                        while (true) {
                            arrayList = vVar.f6175c;
                            if (i10 < arrayList.size()) {
                                user = user2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i10)).user_id == tL_chatInviteImporter.user_id) {
                                    i10++;
                                    user2 = user;
                                }
                            } else {
                                user = user2;
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            arrayList.remove(i10);
                            nVar.u((!nVar.f6146c.B ? 1 : 0) + i10);
                            if (arrayList.isEmpty()) {
                                nVar.u(1);
                            }
                        }
                        vVar2.f(vVar2.f6190t, false, true);
                        if (z10) {
                            qbVar = new qb(n2Var.getParentActivity(), n2Var.getResourceProvider());
                            int iDp2 = AndroidUtilities.dp(15.0f);
                            n9 n9Var2 = qbVar.f31861a;
                            n9Var2.setRoundRadius(iDp2);
                            TLRPC.User user4 = user;
                            n9Var2.e(user4, new y8(0, user4));
                            firstName = UserObject.getFirstName(user4);
                            if (vVar2.f6173a) {
                                string = LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName);
                            } else {
                                string = LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            }
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
                            int iIndexOf2 = string.indexOf(firstName);
                            spannableStringBuilder2.setSpan(new k41(AndroidUtilities.bold()), iIndexOf2, firstName.length() + iIndexOf2, 18);
                            qbVar.f31862b.setText(spannableStringBuilder2);
                            if (arrayList2.isEmpty()) {
                                ec.g(n2Var, qbVar, 2750).j();
                            } else {
                                ec.f(vVar2.h, qbVar, 2750).j();
                            }
                        }
                        z zVarN2 = n2Var.getActionBar().n();
                        if (!TextUtils.isEmpty(vVar2.f6190t)) {
                        }
                    }
                }
                break;
            case 1:
                ((SendMessagesHelper) obj6).lambda$performSendMessageRequestMulti$73((TLRPC.TL_error) obj5, (TLObject) obj4, this.d, (ArrayList) obj3, (ArrayList) obj, (TLObject) obj2);
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) obj5;
                n2 n2Var2 = (n2) obj4;
                TLRPC.Document document = (TLRPC.Document) obj;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj6).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.t1().K2(n2Var2.getParentActivity(), null, n2Var2.getResourceProvider());
                PhotoViewer.t1().f2(arrayList3, 0, 11, false, new uw0(), (rn) obj3);
                PhotoViewer.t1().X0(document, z10 ? document : null, false, null);
                kt ktVarQ = kt.q();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                ktVarQ.T = tL_messages_stickerSet;
                break;
            case 3:
                zf1.d0((zf1) obj6, (TLRPC.TL_error) obj5, this.d, (TLObject) obj4, (byte[]) obj3, (String) obj, (TL_account.passwordInputSettings) obj2);
                break;
            default:
                m0.U((m0) obj6, (TLRPC.TL_error) obj5, (TLObject) obj4, (int[]) obj3, (ArrayList) obj2, this.d, (TLRPC.User) obj);
                break;
        }
    }

    public h(File file, ArrayList arrayList, n2 n2Var, rn rnVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f6127e = file;
        this.f6125b = arrayList;
        this.f6126c = n2Var;
        this.f6128f = rnVar;
        this.h = document;
        this.d = z10;
        this.f6129n = tL_messages_stickerSet;
    }

    public h(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f6127e = sendMessagesHelper;
        this.f6125b = tL_error;
        this.f6126c = tLObject;
        this.d = z10;
        this.f6128f = arrayList;
        this.h = arrayList2;
        this.f6129n = tLObject2;
    }

    public h(zf1 zf1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f6127e = zf1Var;
        this.f6125b = tL_error;
        this.d = z10;
        this.f6126c = tLObject;
        this.f6128f = bArr;
        this.h = str;
        this.f6129n = passwordinputsettings;
    }

    public h(m0 m0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f6127e = m0Var;
        this.f6125b = tL_error;
        this.f6126c = tLObject;
        this.f6128f = iArr;
        this.f6129n = arrayList;
        this.d = z10;
        this.h = user;
    }
}
