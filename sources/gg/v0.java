package gg;

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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.eo;
import org.telegram.ui.mh1;
import org.telegram.ui.tt;
public final class v0 implements Runnable {
    public final int f9054a = 0;
    public final Object f9055b;
    public final Object f9056c;
    public final boolean d;
    public final Object e;
    public final Object f9057f;
    public final Object h;
    public final TLObject f9058n;

    public v0(y0 y0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f9057f = y0Var;
        this.f9055b = tL_error;
        this.f9056c = tLObject;
        this.h = iArr;
        this.e = arrayList;
        this.d = z10;
        this.f9058n = user;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        TLRPC.User user;
        int i10;
        String formatString;
        int i11 = this.f9054a;
        boolean z10 = this.d;
        TLObject tLObject = this.f9058n;
        Object obj = this.e;
        Object obj2 = this.h;
        Object obj3 = this.f9056c;
        Object obj4 = this.f9055b;
        Object obj5 = this.f9057f;
        switch (i11) {
            case 0:
                y0.U((y0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.d, (TLRPC.User) tLObject);
                return;
            case 1:
                ((SendMessagesHelper) obj5).lambda$performSendMessageRequestMulti$73((TLRPC.TL_error) obj4, (TLObject) obj3, this.d, (ArrayList) obj, (ArrayList) obj2, this.f9058n);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                p2 p2Var = (p2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj5).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.t1().K2(p2Var.getParentActivity(), null, p2Var.getResourceProvider());
                PhotoViewer.t1().f2(arrayList2, 0, 11, false, new Object(), (eo) obj3);
                PhotoViewer t12 = PhotoViewer.t1();
                if (z10) {
                    document = document2;
                } else {
                    document = null;
                }
                t12.X0(document2, document, false, null);
                tt q6 = tt.q();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                q6.T = tL_messages_stickerSet;
                return;
            case 3:
                mh1.d0((mh1) obj5, (TLRPC.TL_error) obj4, this.d, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                return;
            default:
                vh.p pVar = (vh.p) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user2 = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i12 = pVar.f43405k;
                ArrayList arrayList3 = pVar.e;
                p2 p2Var2 = pVar.f43402g;
                if (p2Var2 != null && p2Var2.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i12).loadFullChat(tL_updates.chats.get(0).f17195id, 0, true);
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
                        vh.i iVar = pVar.f43401f;
                        vh.p pVar2 = iVar.f43377c;
                        int i14 = 0;
                        while (true) {
                            arrayList = pVar2.f43400c;
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
                            iVar.u((!iVar.f43377c.B ? 1 : 0) + i14);
                            if (arrayList.isEmpty()) {
                                iVar.u(1);
                            }
                        }
                        pVar.f(pVar.f43414t, false, true);
                        if (z10) {
                            bc bcVar = new bc(p2Var2.getParentActivity(), p2Var2.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            w9 w9Var = bcVar.f21797a;
                            w9Var.setRoundRadius(dp);
                            TLRPC.User user3 = user;
                            w9Var.e(user3, new g9(0, user3));
                            String firstName = UserObject.getFirstName(user3);
                            if (pVar.f43398a) {
                                formatString = LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName);
                            } else {
                                formatString = LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            bcVar.f21798b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                pc.g(p2Var2, bcVar, 2750).j();
                            } else {
                                pc.f(pVar.h, bcVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.z n10 = p2Var2.getActionBar().n();
                        if (TextUtils.isEmpty(pVar.f43414t) && pVar.f43406l) {
                            org.telegram.ui.ActionBar.w0 k10 = n10.k(0);
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
                    d5.f0(i12, tL_error, p2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
        }
    }

    public v0(File file, ArrayList arrayList, p2 p2Var, eo eoVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f9057f = file;
        this.e = arrayList;
        this.f9055b = p2Var;
        this.f9056c = eoVar;
        this.h = document;
        this.d = z10;
        this.f9058n = tL_messages_stickerSet;
    }

    public v0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f9057f = sendMessagesHelper;
        this.f9055b = tL_error;
        this.f9056c = tLObject;
        this.d = z10;
        this.e = arrayList;
        this.h = arrayList2;
        this.f9058n = tLObject2;
    }

    public v0(mh1 mh1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f9057f = mh1Var;
        this.f9055b = tL_error;
        this.d = z10;
        this.f9056c = tLObject;
        this.h = bArr;
        this.e = str;
        this.f9058n = passwordinputsettings;
    }

    public v0(vh.p pVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f9057f = pVar;
        this.f9055b = tL_error;
        this.f9056c = tLObject;
        this.h = tL_chatInviteImporter;
        this.d = z10;
        this.f9058n = user;
        this.e = tL_messages_hideChatJoinRequest;
    }
}
