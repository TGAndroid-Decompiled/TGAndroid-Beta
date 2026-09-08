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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.co;
import org.telegram.ui.hh1;
import org.telegram.ui.st;
public final class q0 implements Runnable {
    public final int f12209a = 0;
    public final Object f12210b;
    public final Object f12211c;
    public final boolean d;
    public final Object f12212e;
    public final Object f12213f;
    public final Object h;
    public final TLObject f12214n;

    public q0(u0 u0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f12213f = u0Var;
        this.f12210b = tL_error;
        this.f12211c = tLObject;
        this.h = iArr;
        this.f12212e = arrayList;
        this.d = z10;
        this.f12214n = user;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        TLRPC.User user;
        int i10;
        String formatString;
        int i11 = this.f12209a;
        boolean z10 = this.d;
        TLObject tLObject = this.f12214n;
        Object obj = this.f12212e;
        Object obj2 = this.h;
        Object obj3 = this.f12211c;
        Object obj4 = this.f12210b;
        Object obj5 = this.f12213f;
        switch (i11) {
            case 0:
                u0.U((u0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.d, (TLRPC.User) tLObject);
                return;
            case 1:
                ((SendMessagesHelper) obj5).lambda$performSendMessageRequestMulti$73((TLRPC.TL_error) obj4, (TLObject) obj3, this.d, (ArrayList) obj, (ArrayList) obj2, this.f12214n);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                n2 n2Var = (n2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj5).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.t1().K2(n2Var.getParentActivity(), null, n2Var.getResourceProvider());
                PhotoViewer.t1().f2(arrayList2, 0, 11, false, new Object(), (co) obj3);
                PhotoViewer t12 = PhotoViewer.t1();
                if (z10) {
                    document = document2;
                } else {
                    document = null;
                }
                t12.X0(document2, document, false, null);
                st q6 = st.q();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                q6.T = tL_messages_stickerSet;
                return;
            case 3:
                hh1.d0((hh1) obj5, (TLRPC.TL_error) obj4, this.d, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                return;
            default:
                xh.n nVar = (xh.n) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user2 = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i12 = nVar.f49479k;
                ArrayList arrayList3 = nVar.f49474e;
                n2 n2Var2 = nVar.f49476g;
                if (n2Var2 != null && n2Var2.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i12).loadFullChat(tL_updates.chats.get(0).f19896id, 0, true);
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
                        xh.g gVar = nVar.f49475f;
                        xh.n nVar2 = gVar.f49447c;
                        int i14 = 0;
                        while (true) {
                            arrayList = nVar2.f49473c;
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
                            gVar.u((!gVar.f49447c.B ? 1 : 0) + i14);
                            if (arrayList.isEmpty()) {
                                gVar.u(1);
                            }
                        }
                        nVar.f(nVar.f49488t, false, true);
                        if (z10) {
                            cc ccVar = new cc(n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            x9 x9Var = ccVar.f24992a;
                            x9Var.setRoundRadius(dp);
                            TLRPC.User user3 = user;
                            x9Var.e(user3, new i9(0, user3));
                            String firstName = UserObject.getFirstName(user3);
                            if (nVar.f49471a) {
                                formatString = LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName);
                            } else {
                                formatString = LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            ccVar.f24993b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                qc.g(n2Var2, ccVar, 2750).j();
                            } else {
                                qc.f(nVar.h, ccVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.z n10 = n2Var2.getActionBar().n();
                        if (TextUtils.isEmpty(nVar.f49488t) && nVar.f49480l) {
                            org.telegram.ui.ActionBar.v0 k10 = n10.k(0);
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
                    e5.f0(i12, tL_error, n2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
        }
    }

    public q0(File file, ArrayList arrayList, n2 n2Var, co coVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f12213f = file;
        this.f12212e = arrayList;
        this.f12210b = n2Var;
        this.f12211c = coVar;
        this.h = document;
        this.d = z10;
        this.f12214n = tL_messages_stickerSet;
    }

    public q0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f12213f = sendMessagesHelper;
        this.f12210b = tL_error;
        this.f12211c = tLObject;
        this.d = z10;
        this.f12212e = arrayList;
        this.h = arrayList2;
        this.f12214n = tLObject2;
    }

    public q0(hh1 hh1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f12213f = hh1Var;
        this.f12210b = tL_error;
        this.d = z10;
        this.f12211c = tLObject;
        this.h = bArr;
        this.f12212e = str;
        this.f12214n = passwordinputsettings;
    }

    public q0(xh.n nVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f12213f = nVar;
        this.f12210b = tL_error;
        this.f12211c = tLObject;
        this.h = tL_chatInviteImporter;
        this.d = z10;
        this.f12214n = user;
        this.f12212e = tL_messages_hideChatJoinRequest;
    }
}
