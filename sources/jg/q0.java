package jg;

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
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.y9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fg1;
import org.telegram.ui.ht;
import org.telegram.ui.wn;
public final class q0 implements Runnable {
    public final int f15812a = 2;
    public final Object f15813b;
    public final Object f15814c;
    public final boolean d;
    public final Object e;
    public final Object f15815f;
    public final Object h;
    public final TLObject f15816n;

    public q0(File file, ArrayList arrayList, r2 r2Var, wn wnVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f15815f = file;
        this.e = arrayList;
        this.f15813b = r2Var;
        this.f15814c = wnVar;
        this.h = document;
        this.d = z10;
        this.f15816n = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        TLRPC.User user;
        int i10;
        String formatString;
        int i11 = this.f15812a;
        boolean z10 = this.d;
        TLObject tLObject = this.f15816n;
        Object obj = this.e;
        Object obj2 = this.h;
        Object obj3 = this.f15814c;
        Object obj4 = this.f15813b;
        Object obj5 = this.f15815f;
        switch (i11) {
            case 0:
                t0.V((t0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.d, (TLRPC.User) tLObject);
                return;
            case 1:
                ((SendMessagesHelper) obj5).lambda$performSendMessageRequestMulti$76((TLRPC.TL_error) obj4, (TLObject) obj3, this.d, (ArrayList) obj, (ArrayList) obj2, this.f15816n);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                r2 r2Var = (r2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj5).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.v1().N2(r2Var.getParentActivity(), null, r2Var.getResourceProvider());
                PhotoViewer.v1().j2(arrayList2, 0, 11, false, new Object(), (wn) obj3);
                PhotoViewer v12 = PhotoViewer.v1();
                if (z10) {
                    document = document2;
                } else {
                    document = null;
                }
                v12.Z0(document2, document, false, null);
                ht o10 = ht.o();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                o10.T = tL_messages_stickerSet;
                return;
            case 3:
                fg1.e0((fg1) obj5, (TLRPC.TL_error) obj4, this.d, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                return;
            default:
                yh.k kVar = (yh.k) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user2 = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i12 = kVar.f52675k;
                ArrayList arrayList3 = kVar.e;
                r2 r2Var2 = kVar.f52672g;
                if (r2Var2 != null && r2Var2.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i12).loadFullChat(tL_updates.chats.get(0).f22028id, 0, true);
                        }
                        int i13 = 0;
                        while (true) {
                            if (i13 < arrayList3.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i13)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList3.remove(i13);
                                } else {
                                    i13++;
                                }
                            }
                        }
                        yh.f fVar = kVar.f52671f;
                        yh.k kVar2 = fVar.f52652c;
                        int i14 = 0;
                        while (true) {
                            arrayList = kVar2.f52670c;
                            if (i14 < arrayList.size()) {
                                user = user2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i14)).user_id != tL_chatInviteImporter.user_id) {
                                    i14++;
                                    user2 = user;
                                }
                            } else {
                                user = user2;
                                i14 = -1;
                            }
                        }
                        if (i14 >= 0) {
                            arrayList.remove(i14);
                            fVar.u((!fVar.f52652c.B ? 1 : 0) + i14);
                            if (arrayList.isEmpty()) {
                                fVar.u(1);
                            }
                        }
                        kVar.f(kVar.f52684t, false, true);
                        if (z10) {
                            cc ccVar = new cc(r2Var2.getParentActivity(), r2Var2.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            y9 y9Var = ccVar.f27121a;
                            y9Var.setRoundRadius(dp);
                            TLRPC.User user3 = user;
                            y9Var.f(user3, new j9(0, user3));
                            String firstName = UserObject.getFirstName(user3);
                            if (kVar.f52668a) {
                                formatString = LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName);
                            } else {
                                formatString = LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            ccVar.f27122b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                qc.g(r2Var2, ccVar, 2750).j();
                            } else {
                                qc.f(kVar.h, ccVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.z l4 = r2Var2.getActionBar().l();
                        if (TextUtils.isEmpty(kVar.f52684t) && kVar.f52676l) {
                            org.telegram.ui.ActionBar.w0 j10 = l4.j(0);
                            if (arrayList3.isEmpty()) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            j10.setVisibility(i10);
                            return;
                        }
                        return;
                    }
                    g5.e0(i12, tL_error, r2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
        }
    }

    public q0(t0 t0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f15815f = t0Var;
        this.f15813b = tL_error;
        this.f15814c = tLObject;
        this.h = iArr;
        this.e = arrayList;
        this.d = z10;
        this.f15816n = user;
    }

    public q0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f15815f = sendMessagesHelper;
        this.f15813b = tL_error;
        this.f15814c = tLObject;
        this.d = z10;
        this.e = arrayList;
        this.h = arrayList2;
        this.f15816n = tLObject2;
    }

    public q0(fg1 fg1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f15815f = fg1Var;
        this.f15813b = tL_error;
        this.d = z10;
        this.f15814c = tLObject;
        this.h = bArr;
        this.e = str;
        this.f15816n = passwordinputsettings;
    }

    public q0(yh.k kVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f15815f = kVar;
        this.f15813b = tL_error;
        this.f15814c = tLObject;
        this.h = tL_chatInviteImporter;
        this.d = z10;
        this.f15816n = user;
        this.e = tL_messages_hideChatJoinRequest;
    }
}
