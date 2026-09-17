package hg;

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
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.u9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bo;
import org.telegram.ui.ih1;
import org.telegram.ui.ut;
public final class r0 implements Runnable {
    public final int f10397a = 0;
    public final Object f10398b;
    public final Object f10399c;
    public final boolean d;
    public final Object e;
    public final Object f10400f;
    public final Object h;
    public final TLObject f10401n;

    public r0(u0 u0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f10400f = u0Var;
        this.f10398b = tL_error;
        this.f10399c = tLObject;
        this.h = iArr;
        this.e = arrayList;
        this.d = z10;
        this.f10401n = user;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        TLRPC.User user;
        int i10;
        String formatString;
        int i11 = this.f10397a;
        boolean z10 = this.d;
        TLObject tLObject = this.f10401n;
        Object obj = this.e;
        Object obj2 = this.h;
        Object obj3 = this.f10399c;
        Object obj4 = this.f10398b;
        Object obj5 = this.f10400f;
        switch (i11) {
            case 0:
                u0.U((u0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.d, (TLRPC.User) tLObject);
                return;
            case 1:
                ((SendMessagesHelper) obj5).lambda$performSendMessageRequestMulti$73((TLRPC.TL_error) obj4, (TLObject) obj3, this.d, (ArrayList) obj, (ArrayList) obj2, this.f10401n);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                o2 o2Var = (o2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj5).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.t1().K2(o2Var.getParentActivity(), null, o2Var.getResourceProvider());
                PhotoViewer.t1().f2(arrayList2, 0, 11, false, new Object(), (bo) obj3);
                PhotoViewer t12 = PhotoViewer.t1();
                if (z10) {
                    document = document2;
                } else {
                    document = null;
                }
                t12.X0(document2, document, false, null);
                ut q6 = ut.q();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                q6.T = tL_messages_stickerSet;
                return;
            case 3:
                ih1.d0((ih1) obj5, (TLRPC.TL_error) obj4, this.d, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                return;
            default:
                wh.n nVar = (wh.n) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user2 = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i12 = nVar.f45141k;
                ArrayList arrayList3 = nVar.e;
                o2 o2Var2 = nVar.f45138g;
                if (o2Var2 != null && o2Var2.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i12).loadFullChat(tL_updates.chats.get(0).f18121id, 0, true);
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
                        wh.g gVar = nVar.f45137f;
                        wh.n nVar2 = gVar.f45113c;
                        int i14 = 0;
                        while (true) {
                            arrayList = nVar2.f45136c;
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
                            gVar.u((!gVar.f45113c.B ? 1 : 0) + i14);
                            if (arrayList.isEmpty()) {
                                gVar.u(1);
                            }
                        }
                        nVar.f(nVar.f45150t, false, true);
                        if (z10) {
                            ac acVar = new ac(o2Var2.getParentActivity(), o2Var2.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            u9 u9Var = acVar.f22366a;
                            u9Var.setRoundRadius(dp);
                            TLRPC.User user3 = user;
                            u9Var.e(user3, new f9(0, user3));
                            String firstName = UserObject.getFirstName(user3);
                            if (nVar.f45134a) {
                                formatString = LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName);
                            } else {
                                formatString = LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            acVar.f22367b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                oc.g(o2Var2, acVar, 2750).j();
                            } else {
                                oc.f(nVar.h, acVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.a0 n10 = o2Var2.getActionBar().n();
                        if (TextUtils.isEmpty(nVar.f45150t) && nVar.f45142l) {
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
                    c5.f0(i12, tL_error, o2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
        }
    }

    public r0(File file, ArrayList arrayList, o2 o2Var, bo boVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f10400f = file;
        this.e = arrayList;
        this.f10398b = o2Var;
        this.f10399c = boVar;
        this.h = document;
        this.d = z10;
        this.f10401n = tL_messages_stickerSet;
    }

    public r0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f10400f = sendMessagesHelper;
        this.f10398b = tL_error;
        this.f10399c = tLObject;
        this.d = z10;
        this.e = arrayList;
        this.h = arrayList2;
        this.f10401n = tLObject2;
    }

    public r0(ih1 ih1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f10400f = ih1Var;
        this.f10398b = tL_error;
        this.d = z10;
        this.f10399c = tLObject;
        this.h = bArr;
        this.e = str;
        this.f10401n = passwordinputsettings;
    }

    public r0(wh.n nVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f10400f = nVar;
        this.f10398b = tL_error;
        this.f10399c = tLObject;
        this.h = tL_chatInviteImporter;
        this.d = z10;
        this.f10401n = user;
        this.e = tL_messages_hideChatJoinRequest;
    }
}
