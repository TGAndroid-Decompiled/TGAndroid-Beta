package ig;

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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.u9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ag1;
import org.telegram.ui.ht;
import org.telegram.ui.sn;
public final class q0 implements Runnable {
    public final int f13026a = 0;
    public final Object f13027b;
    public final Object f13028c;
    public final boolean d;
    public final Object e;
    public final Object f13029f;
    public final Object h;
    public final TLObject f13030n;

    public q0(s0 s0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f13029f = s0Var;
        this.f13027b = tL_error;
        this.f13028c = tLObject;
        this.h = iArr;
        this.e = arrayList;
        this.d = z10;
        this.f13030n = user;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        TLRPC.User user;
        int i10;
        String formatString;
        int i11 = this.f13026a;
        boolean z10 = this.d;
        TLObject tLObject = this.f13030n;
        Object obj = this.e;
        Object obj2 = this.h;
        Object obj3 = this.f13028c;
        Object obj4 = this.f13027b;
        Object obj5 = this.f13029f;
        switch (i11) {
            case 0:
                s0.U((s0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.d, (TLRPC.User) tLObject);
                return;
            case 1:
                ((SendMessagesHelper) obj5).lambda$performSendMessageRequestMulti$76((TLRPC.TL_error) obj4, (TLObject) obj3, this.d, (ArrayList) obj, (ArrayList) obj2, this.f13030n);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                o2 o2Var = (o2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj5).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.u1().M2(o2Var.getParentActivity(), null, o2Var.getResourceProvider());
                PhotoViewer.u1().i2(arrayList2, 0, 11, false, new Object(), (sn) obj3);
                PhotoViewer u12 = PhotoViewer.u1();
                if (z10) {
                    document = document2;
                } else {
                    document = null;
                }
                u12.Z0(document2, document, false, null);
                ht o10 = ht.o();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                o10.T = tL_messages_stickerSet;
                return;
            case 3:
                ag1.d0((ag1) obj5, (TLRPC.TL_error) obj4, this.d, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                return;
            default:
                xh.k kVar = (xh.k) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user2 = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i12 = kVar.f50313k;
                ArrayList arrayList3 = kVar.e;
                o2 o2Var2 = kVar.f50310g;
                if (o2Var2 != null && o2Var2.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i12).loadFullChat(tL_updates.chats.get(0).f20344id, 0, true);
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
                        xh.f fVar = kVar.f50309f;
                        xh.k kVar2 = fVar.f50290c;
                        int i14 = 0;
                        while (true) {
                            arrayList = kVar2.f50308c;
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
                            fVar.u((!fVar.f50290c.B ? 1 : 0) + i14);
                            if (arrayList.isEmpty()) {
                                fVar.u(1);
                            }
                        }
                        kVar.f(kVar.f50322t, false, true);
                        if (z10) {
                            ac acVar = new ac(o2Var2.getParentActivity(), o2Var2.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            u9 u9Var = acVar.f24708a;
                            u9Var.setRoundRadius(dp);
                            TLRPC.User user3 = user;
                            u9Var.e(user3, new f9(0, user3));
                            String firstName = UserObject.getFirstName(user3);
                            if (kVar.f50306a) {
                                formatString = LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName);
                            } else {
                                formatString = LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new i61(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            acVar.f24709b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                oc.g(o2Var2, acVar, 2750).j();
                            } else {
                                oc.f(kVar.h, acVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.y m10 = o2Var2.getActionBar().m();
                        if (TextUtils.isEmpty(kVar.f50322t) && kVar.f50314l) {
                            org.telegram.ui.ActionBar.u0 k10 = m10.k(0);
                            if (arrayList3.isEmpty()) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            k10.setVisibility(i10);
                            return;
                        }
                        return;
                    }
                    d5.e0(i12, tL_error, o2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
        }
    }

    public q0(File file, ArrayList arrayList, o2 o2Var, sn snVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f13029f = file;
        this.e = arrayList;
        this.f13027b = o2Var;
        this.f13028c = snVar;
        this.h = document;
        this.d = z10;
        this.f13030n = tL_messages_stickerSet;
    }

    public q0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f13029f = sendMessagesHelper;
        this.f13027b = tL_error;
        this.f13028c = tLObject;
        this.d = z10;
        this.e = arrayList;
        this.h = arrayList2;
        this.f13030n = tLObject2;
    }

    public q0(ag1 ag1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f13029f = ag1Var;
        this.f13027b = tL_error;
        this.d = z10;
        this.f13028c = tLObject;
        this.h = bArr;
        this.e = str;
        this.f13030n = passwordinputsettings;
    }

    public q0(xh.k kVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f13029f = kVar;
        this.f13027b = tL_error;
        this.f13028c = tLObject;
        this.h = tL_chatInviteImporter;
        this.d = z10;
        this.f13030n = user;
        this.e = tL_messages_hideChatJoinRequest;
    }
}
