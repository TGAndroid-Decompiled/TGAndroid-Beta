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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ih1;
import org.telegram.ui.rt;
import org.telegram.ui.zn;
public final class r0 implements Runnable {
    public final int f11360a = 0;
    public final Object f11361b;
    public final Object f11362c;
    public final boolean d;
    public final Object f11363e;
    public final Object f11364f;
    public final Object h;
    public final TLObject f11365n;

    public r0(u0 u0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f11364f = u0Var;
        this.f11361b = tL_error;
        this.f11362c = tLObject;
        this.h = iArr;
        this.f11363e = arrayList;
        this.d = z10;
        this.f11365n = user;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        TLRPC.User user;
        int i10;
        String formatString;
        int i11 = this.f11360a;
        boolean z10 = this.d;
        TLObject tLObject = this.f11365n;
        Object obj = this.f11363e;
        Object obj2 = this.h;
        Object obj3 = this.f11362c;
        Object obj4 = this.f11361b;
        Object obj5 = this.f11364f;
        switch (i11) {
            case 0:
                u0.U((u0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.d, (TLRPC.User) tLObject);
                return;
            case 1:
                ((SendMessagesHelper) obj5).lambda$performSendMessageRequestMulti$76((TLRPC.TL_error) obj4, (TLObject) obj3, this.d, (ArrayList) obj, (ArrayList) obj2, this.f11365n);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                n2 n2Var = (n2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj5).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.t1().K2(n2Var.getParentActivity(), null, n2Var.getResourceProvider());
                PhotoViewer.t1().g2(arrayList2, 0, 11, false, new Object(), (zn) obj3);
                PhotoViewer t12 = PhotoViewer.t1();
                if (z10) {
                    document = document2;
                } else {
                    document = null;
                }
                t12.Y0(document2, document, false, null);
                rt q6 = rt.q();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                q6.T = tL_messages_stickerSet;
                return;
            case 3:
                ih1.d0((ih1) obj5, (TLRPC.TL_error) obj4, this.d, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                return;
            default:
                wh.l lVar = (wh.l) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user2 = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i12 = lVar.f50480k;
                ArrayList arrayList3 = lVar.f50475e;
                n2 n2Var2 = lVar.f50477g;
                if (n2Var2 != null && n2Var2.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i12).loadFullChat(tL_updates.chats.get(0).f20042id, 0, true);
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
                        wh.g gVar = lVar.f50476f;
                        wh.l lVar2 = gVar.f50454c;
                        int i14 = 0;
                        while (true) {
                            arrayList = lVar2.f50474c;
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
                            gVar.u((!gVar.f50454c.B ? 1 : 0) + i14);
                            if (arrayList.isEmpty()) {
                                gVar.u(1);
                            }
                        }
                        lVar.f(lVar.f50489t, false, true);
                        if (z10) {
                            fc fcVar = new fc(n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            y9 y9Var = fcVar.f26385a;
                            y9Var.setRoundRadius(dp);
                            TLRPC.User user3 = user;
                            y9Var.e(user3, new j9(0, user3));
                            String firstName = UserObject.getFirstName(user3);
                            if (lVar.f50472a) {
                                formatString = LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName);
                            } else {
                                formatString = LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new n61(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            fcVar.f26386b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                tc.g(n2Var2, fcVar, 2750).j();
                            } else {
                                tc.f(lVar.h, fcVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.z o9 = n2Var2.getActionBar().o();
                        if (TextUtils.isEmpty(lVar.f50489t) && lVar.f50481l) {
                            org.telegram.ui.ActionBar.v0 k10 = o9.k(0);
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
                    g5.e0(i12, tL_error, n2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
        }
    }

    public r0(File file, ArrayList arrayList, n2 n2Var, zn znVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f11364f = file;
        this.f11363e = arrayList;
        this.f11361b = n2Var;
        this.f11362c = znVar;
        this.h = document;
        this.d = z10;
        this.f11365n = tL_messages_stickerSet;
    }

    public r0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f11364f = sendMessagesHelper;
        this.f11361b = tL_error;
        this.f11362c = tLObject;
        this.d = z10;
        this.f11363e = arrayList;
        this.h = arrayList2;
        this.f11365n = tLObject2;
    }

    public r0(ih1 ih1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f11364f = ih1Var;
        this.f11361b = tL_error;
        this.d = z10;
        this.f11362c = tLObject;
        this.h = bArr;
        this.f11363e = str;
        this.f11365n = passwordinputsettings;
    }

    public r0(wh.l lVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f11364f = lVar;
        this.f11361b = tL_error;
        this.f11362c = tLObject;
        this.h = tL_chatInviteImporter;
        this.d = z10;
        this.f11365n = user;
        this.f11363e = tL_messages_hideChatJoinRequest;
    }
}
