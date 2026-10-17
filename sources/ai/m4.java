package ai;

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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.c61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.gt;
import org.telegram.ui.sn;
import org.telegram.ui.xf1;
public final class m4 implements Runnable {
    public final int f1825a = 0;
    public final Object f1826b;
    public final TLObject f1827c;
    public final boolean d;
    public final Object e;
    public final Object f1828f;
    public final Object h;
    public final Object f1829n;

    public m4(k7 k7Var, TLRPC.TL_error tL_error, byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, Utilities.Callback callback, TLObject tLObject) {
        this.e = k7Var;
        this.f1826b = tL_error;
        this.f1828f = bArr;
        this.h = twoStepVerificationActivity;
        this.d = z10;
        this.f1829n = callback;
        this.f1827c = tLObject;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        int i10;
        int i11;
        String formatString;
        int i12 = this.f1825a;
        boolean z10 = this.d;
        TLObject tLObject = this.f1827c;
        Object obj = this.f1829n;
        Object obj2 = this.h;
        Object obj3 = this.f1828f;
        Object obj4 = this.f1826b;
        Object obj5 = this.e;
        switch (i12) {
            case 0:
                k7.f0((k7) obj5, (TLRPC.TL_error) obj4, (byte[]) obj3, (TwoStepVerificationActivity) obj2, this.d, (Utilities.Callback) obj, this.f1827c);
                return;
            case 1:
                ig.r0.U((ig.r0) obj5, (TLRPC.TL_error) obj4, this.f1827c, (int[]) obj3, (ArrayList) obj2, this.d, (TLRPC.User) obj);
                return;
            case 2:
                ((SendMessagesHelper) obj5).lambda$performSendMessageRequestMulti$76((TLRPC.TL_error) obj4, this.f1827c, this.d, (ArrayList) obj3, (ArrayList) obj2, (TLObject) obj);
                return;
            case 3:
                ArrayList arrayList2 = (ArrayList) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                TLRPC.Document document2 = (TLRPC.Document) obj;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj5).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.t1().K2(n2Var.getParentActivity(), null, n2Var.getResourceProvider());
                PhotoViewer.t1().g2(arrayList2, 0, 11, false, new Object(), (sn) obj2);
                PhotoViewer t12 = PhotoViewer.t1();
                if (z10) {
                    document = document2;
                } else {
                    document = null;
                }
                t12.Y0(document2, document, false, null);
                gt q6 = gt.q();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                q6.T = tL_messages_stickerSet;
                return;
            case 4:
                xf1.d0((xf1) obj5, (TLRPC.TL_error) obj4, this.d, this.f1827c, (byte[]) obj3, (String) obj2, (TL_account.passwordInputSettings) obj);
                return;
            default:
                xh.k kVar = (xh.k) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i13 = kVar.f49886k;
                ArrayList arrayList3 = kVar.e;
                org.telegram.ui.ActionBar.n2 n2Var2 = kVar.f49883g;
                if (n2Var2 != null && n2Var2.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i13).loadFullChat(tL_updates.chats.get(0).f20272id, 0, true);
                        }
                        int i14 = 0;
                        while (true) {
                            if (i14 < arrayList3.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i14)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList3.remove(i14);
                                } else {
                                    i14++;
                                }
                            }
                        }
                        xh.f fVar = kVar.f49882f;
                        xh.k kVar2 = fVar.f49863c;
                        int i15 = 0;
                        while (true) {
                            arrayList = kVar2.f49881c;
                            if (i15 < arrayList.size()) {
                                int i16 = i15;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i15)).user_id == tL_chatInviteImporter.user_id) {
                                    i10 = i16;
                                } else {
                                    i15 = i16 + 1;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            arrayList.remove(i10);
                            fVar.u((!fVar.f49863c.B ? 1 : 0) + i10);
                            if (arrayList.isEmpty()) {
                                fVar.u(1);
                            }
                        }
                        kVar.f(kVar.f49895t, false, true);
                        if (z10) {
                            org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            org.telegram.ui.Components.w9 w9Var = ccVar.f25188a;
                            w9Var.setRoundRadius(dp);
                            w9Var.e(user, new org.telegram.ui.Components.h9(0, user));
                            String firstName = UserObject.getFirstName(user);
                            if (kVar.f49879a) {
                                formatString = LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName);
                            } else {
                                formatString = LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new c61(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            ccVar.f25189b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                org.telegram.ui.Components.qc.g(n2Var2, ccVar, 2750).j();
                            } else {
                                org.telegram.ui.Components.qc.f(kVar.h, ccVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.y n10 = n2Var2.getActionBar().n();
                        if (TextUtils.isEmpty(kVar.f49895t) && kVar.f49887l) {
                            org.telegram.ui.ActionBar.u0 k10 = n10.k(0);
                            if (arrayList3.isEmpty()) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            k10.setVisibility(i11);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.f5.e0(i13, tL_error, n2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
        }
    }

    public m4(ig.r0 r0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.e = r0Var;
        this.f1826b = tL_error;
        this.f1827c = tLObject;
        this.f1828f = iArr;
        this.h = arrayList;
        this.d = z10;
        this.f1829n = user;
    }

    public m4(File file, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, sn snVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.e = file;
        this.f1826b = arrayList;
        this.f1828f = n2Var;
        this.h = snVar;
        this.f1829n = document;
        this.d = z10;
        this.f1827c = tL_messages_stickerSet;
    }

    public m4(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.e = sendMessagesHelper;
        this.f1826b = tL_error;
        this.f1827c = tLObject;
        this.d = z10;
        this.f1828f = arrayList;
        this.h = arrayList2;
        this.f1829n = tLObject2;
    }

    public m4(xf1 xf1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.e = xf1Var;
        this.f1826b = tL_error;
        this.d = z10;
        this.f1827c = tLObject;
        this.f1828f = bArr;
        this.h = str;
        this.f1829n = passwordinputsettings;
    }

    public m4(xh.k kVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.e = kVar;
        this.f1826b = tL_error;
        this.f1827c = tLObject;
        this.f1828f = tL_chatInviteImporter;
        this.d = z10;
        this.h = user;
        this.f1829n = tL_messages_hideChatJoinRequest;
    }
}
