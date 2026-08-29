package hh;

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
import org.telegram.ui.ActionBar.a0;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.yb;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cg1;
import org.telegram.ui.ht;
import org.telegram.ui.tn;
import sf.l0;
public final class h implements Runnable {
    public final int f8071a = 0;
    public final Object f8072b;
    public final Object f8073c;
    public final boolean d;
    public final Object f8074e;
    public final Object f8075f;
    public final Object h;
    public final Object f8076n;

    public h(v vVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f8074e = vVar;
        this.f8072b = tL_error;
        this.f8073c = tLObject;
        this.f8075f = tL_chatInviteImporter;
        this.d = z10;
        this.h = user;
        this.f8076n = tL_messages_hideChatJoinRequest;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        TLRPC.User user;
        int i10;
        String formatString;
        TLRPC.Document document;
        int i11 = this.f8071a;
        boolean z10 = this.d;
        Object obj = this.h;
        Object obj2 = this.f8076n;
        Object obj3 = this.f8075f;
        Object obj4 = this.f8073c;
        Object obj5 = this.f8072b;
        Object obj6 = this.f8074e;
        switch (i11) {
            case 0:
                v vVar = (v) obj6;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj2;
                int i12 = vVar.f8128k;
                ArrayList arrayList2 = vVar.f8123e;
                o2 o2Var = vVar.f8125g;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i12).loadFullChat(tL_updates.chats.get(0).f22392id, 0, true);
                        }
                        int i13 = 0;
                        while (true) {
                            if (i13 < arrayList2.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList2.get(i13)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList2.remove(i13);
                                } else {
                                    i13++;
                                }
                            }
                        }
                        n nVar = vVar.f8124f;
                        v vVar2 = nVar.f8093c;
                        int i14 = 0;
                        while (true) {
                            arrayList = vVar2.f8122c;
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
                            nVar.u((!nVar.f8093c.B ? 1 : 0) + i14);
                            if (arrayList.isEmpty()) {
                                nVar.u(1);
                            }
                        }
                        vVar.f(vVar.f8137t, false, true);
                        if (z10) {
                            yb ybVar = new yb(o2Var.getParentActivity(), o2Var.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            t9 t9Var = ybVar.f35010a;
                            t9Var.setRoundRadius(dp);
                            TLRPC.User user3 = user;
                            t9Var.e(user3, new e9(0, user3));
                            String firstName = UserObject.getFirstName(user3);
                            if (vVar.f8120a) {
                                formatString = LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName);
                            } else {
                                formatString = LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            ybVar.f35011b.setText(spannableStringBuilder);
                            if (arrayList2.isEmpty()) {
                                mc.g(o2Var, ybVar, 2750).j();
                            } else {
                                mc.f(vVar.h, ybVar, 2750).j();
                            }
                        }
                        a0 n10 = o2Var.getActionBar().n();
                        if (TextUtils.isEmpty(vVar.f8137t) && vVar.f8129l) {
                            w0 k9 = n10.k(0);
                            if (arrayList2.isEmpty()) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            k9.setVisibility(i10);
                            return;
                        }
                        return;
                    }
                    c5.f0(i12, tL_error, o2Var, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
            case 1:
                ((SendMessagesHelper) obj6).lambda$performSendMessageRequestMulti$73((TLRPC.TL_error) obj5, (TLObject) obj4, this.d, (ArrayList) obj3, (ArrayList) obj, (TLObject) obj2);
                return;
            case 2:
                ArrayList arrayList3 = (ArrayList) obj5;
                o2 o2Var2 = (o2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj6).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.t1().K2(o2Var2.getParentActivity(), null, o2Var2.getResourceProvider());
                PhotoViewer.t1().f2(arrayList3, 0, 11, false, new Object(), (tn) obj3);
                PhotoViewer t12 = PhotoViewer.t1();
                if (z10) {
                    document = document2;
                } else {
                    document = null;
                }
                t12.X0(document2, document, false, null);
                ht q6 = ht.q();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                q6.T = tL_messages_stickerSet;
                return;
            case 3:
                cg1.d0((cg1) obj6, (TLRPC.TL_error) obj5, this.d, (TLObject) obj4, (byte[]) obj3, (String) obj, (TL_account.passwordInputSettings) obj2);
                return;
            default:
                l0.U((l0) obj6, (TLRPC.TL_error) obj5, (TLObject) obj4, (int[]) obj3, (ArrayList) obj2, this.d, (TLRPC.User) obj);
                return;
        }
    }

    public h(File file, ArrayList arrayList, o2 o2Var, tn tnVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f8074e = file;
        this.f8072b = arrayList;
        this.f8073c = o2Var;
        this.f8075f = tnVar;
        this.h = document;
        this.d = z10;
        this.f8076n = tL_messages_stickerSet;
    }

    public h(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f8074e = sendMessagesHelper;
        this.f8072b = tL_error;
        this.f8073c = tLObject;
        this.d = z10;
        this.f8075f = arrayList;
        this.h = arrayList2;
        this.f8076n = tLObject2;
    }

    public h(cg1 cg1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f8074e = cg1Var;
        this.f8072b = tL_error;
        this.d = z10;
        this.f8073c = tLObject;
        this.f8075f = bArr;
        this.h = str;
        this.f8076n = passwordinputsettings;
    }

    public h(l0 l0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f8074e = l0Var;
        this.f8072b = tL_error;
        this.f8073c = tLObject;
        this.f8075f = iArr;
        this.f8076n = arrayList;
        this.d = z10;
        this.h = user;
    }
}
