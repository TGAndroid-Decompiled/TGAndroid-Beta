package eh;

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
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ag1;
import org.telegram.ui.ht;
import org.telegram.ui.qn;
import pf.m0;
public final class h implements Runnable {
    public final int f5193a = 0;
    public final Object f5194b;
    public final Object f5195c;
    public final boolean d;
    public final Object f5196e;
    public final Object f5197f;
    public final Object h;
    public final Object f5198n;

    public h(x xVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f5196e = xVar;
        this.f5194b = tL_error;
        this.f5195c = tLObject;
        this.f5197f = tL_chatInviteImporter;
        this.d = z10;
        this.h = user;
        this.f5198n = tL_messages_hideChatJoinRequest;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        TLRPC.User user;
        int i9;
        String formatString;
        TLRPC.Document document;
        int i10 = this.f5193a;
        boolean z10 = this.d;
        Object obj = this.h;
        Object obj2 = this.f5198n;
        Object obj3 = this.f5197f;
        Object obj4 = this.f5195c;
        Object obj5 = this.f5194b;
        Object obj6 = this.f5196e;
        switch (i10) {
            case 0:
                x xVar = (x) obj6;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj2;
                int i11 = xVar.f5254k;
                ArrayList arrayList2 = xVar.f5249e;
                o2 o2Var = xVar.f5251g;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i11).loadFullChat(tL_updates.chats.get(0).f22380id, 0, true);
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList2.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList2.get(i12)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList2.remove(i12);
                                } else {
                                    i12++;
                                }
                            }
                        }
                        p pVar = xVar.f5250f;
                        x xVar2 = pVar.f5219c;
                        int i13 = 0;
                        while (true) {
                            arrayList = xVar2.f5248c;
                            if (i13 < arrayList.size()) {
                                user = user2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i13)).user_id != tL_chatInviteImporter.user_id) {
                                    i13++;
                                    user2 = user;
                                }
                            } else {
                                user = user2;
                                i13 = -1;
                            }
                        }
                        if (i13 >= 0) {
                            arrayList.remove(i13);
                            pVar.u((!pVar.f5219c.B ? 1 : 0) + i13);
                            if (arrayList.isEmpty()) {
                                pVar.u(1);
                            }
                        }
                        xVar.f(xVar.f5263t, false, true);
                        if (z10) {
                            sb sbVar = new sb(o2Var.getParentActivity(), o2Var.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            o9 o9Var = sbVar.f32417a;
                            o9Var.setRoundRadius(dp);
                            TLRPC.User user3 = user;
                            o9Var.e(user3, new z8(0, user3));
                            String firstName = UserObject.getFirstName(user3);
                            if (xVar.f5246a) {
                                formatString = LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName);
                            } else {
                                formatString = LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            sbVar.f32418b.setText(spannableStringBuilder);
                            if (arrayList2.isEmpty()) {
                                gc.g(o2Var, sbVar, 2750).j();
                            } else {
                                gc.f(xVar.h, sbVar, 2750).j();
                            }
                        }
                        z n10 = o2Var.getActionBar().n();
                        if (TextUtils.isEmpty(xVar.f5263t) && xVar.f5255l) {
                            w0 k10 = n10.k(0);
                            if (arrayList2.isEmpty()) {
                                i9 = 8;
                            } else {
                                i9 = 0;
                            }
                            k10.setVisibility(i9);
                            return;
                        }
                        return;
                    }
                    y4.f0(i11, tL_error, o2Var, tL_messages_hideChatJoinRequest, new Object[0]);
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
                PhotoViewer.t1().f2(arrayList3, 0, 11, false, new Object(), (qn) obj3);
                PhotoViewer t12 = PhotoViewer.t1();
                if (z10) {
                    document = document2;
                } else {
                    document = null;
                }
                t12.X0(document2, document, false, null);
                ht q10 = ht.q();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                q10.T = tL_messages_stickerSet;
                return;
            case 3:
                ag1.c0((ag1) obj6, (TLRPC.TL_error) obj5, this.d, (TLObject) obj4, (byte[]) obj3, (String) obj, (TL_account.passwordInputSettings) obj2);
                return;
            default:
                m0.T((m0) obj6, (TLRPC.TL_error) obj5, (TLObject) obj4, (int[]) obj3, (ArrayList) obj2, this.d, (TLRPC.User) obj);
                return;
        }
    }

    public h(File file, ArrayList arrayList, o2 o2Var, qn qnVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f5196e = file;
        this.f5194b = arrayList;
        this.f5195c = o2Var;
        this.f5197f = qnVar;
        this.h = document;
        this.d = z10;
        this.f5198n = tL_messages_stickerSet;
    }

    public h(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f5196e = sendMessagesHelper;
        this.f5194b = tL_error;
        this.f5195c = tLObject;
        this.d = z10;
        this.f5197f = arrayList;
        this.h = arrayList2;
        this.f5198n = tLObject2;
    }

    public h(ag1 ag1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f5196e = ag1Var;
        this.f5194b = tL_error;
        this.d = z10;
        this.f5195c = tLObject;
        this.f5197f = bArr;
        this.h = str;
        this.f5198n = passwordinputsettings;
    }

    public h(m0 m0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f5196e = m0Var;
        this.f5194b = tL_error;
        this.f5195c = tLObject;
        this.f5197f = iArr;
        this.f5198n = arrayList;
        this.d = z10;
        this.h = user;
    }
}
