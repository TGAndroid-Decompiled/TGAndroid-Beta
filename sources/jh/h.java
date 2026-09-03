package jh;

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
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.rt;
import org.telegram.ui.wg1;
import org.telegram.ui.zn;
import uf.l0;
public final class h implements Runnable {
    public final int f9417a = 2;
    public final Object f9418b;
    public final Object f9419c;
    public final boolean d;
    public final Object e;
    public final Object f9420f;
    public final Object h;
    public final Object f9421n;

    public h(File file, ArrayList arrayList, p2 p2Var, zn znVar, TLRPC.Document document, boolean z4, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.e = file;
        this.f9418b = arrayList;
        this.f9419c = p2Var;
        this.f9420f = znVar;
        this.h = document;
        this.d = z4;
        this.f9421n = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        TLRPC.User user;
        int i10;
        String formatString;
        TLRPC.Document document;
        int i11 = this.f9417a;
        boolean z4 = this.d;
        Object obj = this.h;
        Object obj2 = this.f9421n;
        Object obj3 = this.f9420f;
        Object obj4 = this.f9419c;
        Object obj5 = this.f9418b;
        Object obj6 = this.e;
        switch (i11) {
            case 0:
                v vVar = (v) obj6;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj2;
                int i12 = vVar.f9467k;
                ArrayList arrayList2 = vVar.e;
                p2 p2Var = vVar.f9464g;
                if (p2Var != null && p2Var.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i12).loadFullChat(tL_updates.chats.get(0).f19159id, 0, true);
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
                        n nVar = vVar.f9463f;
                        v vVar2 = nVar.f9436c;
                        int i14 = 0;
                        while (true) {
                            arrayList = vVar2.f9462c;
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
                            nVar.u((!nVar.f9436c.B ? 1 : 0) + i14);
                            if (arrayList.isEmpty()) {
                                nVar.u(1);
                            }
                        }
                        vVar.f(vVar.f9476t, false, true);
                        if (z4) {
                            ub ubVar = new ub(p2Var.getParentActivity(), p2Var.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            p9 p9Var = ubVar.f29167a;
                            p9Var.setRoundRadius(dp);
                            TLRPC.User user3 = user;
                            p9Var.e(user3, new z8(0, user3));
                            String firstName = UserObject.getFirstName(user3);
                            if (vVar.f9460a) {
                                formatString = LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName);
                            } else {
                                formatString = LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            ubVar.f29168b.setText(spannableStringBuilder);
                            if (arrayList2.isEmpty()) {
                                ic.g(p2Var, ubVar, 2750).j();
                            } else {
                                ic.f(vVar.h, ubVar, 2750).j();
                            }
                        }
                        z n10 = p2Var.getActionBar().n();
                        if (TextUtils.isEmpty(vVar.f9476t) && vVar.f9468l) {
                            w0 k10 = n10.k(0);
                            if (arrayList2.isEmpty()) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            k10.setVisibility(i10);
                            return;
                        }
                        return;
                    }
                    z4.f0(i12, tL_error, p2Var, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
            case 1:
                ((SendMessagesHelper) obj6).lambda$performSendMessageRequestMulti$73((TLRPC.TL_error) obj5, (TLObject) obj4, this.d, (ArrayList) obj3, (ArrayList) obj, (TLObject) obj2);
                return;
            case 2:
                ArrayList arrayList3 = (ArrayList) obj5;
                p2 p2Var2 = (p2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj6).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.t1().K2(p2Var2.getParentActivity(), null, p2Var2.getResourceProvider());
                PhotoViewer.t1().f2(arrayList3, 0, 11, false, new Object(), (zn) obj3);
                PhotoViewer t12 = PhotoViewer.t1();
                if (z4) {
                    document = document2;
                } else {
                    document = null;
                }
                t12.Y0(document2, document, false, null);
                rt q10 = rt.q();
                if (!z4) {
                    tL_messages_stickerSet = null;
                }
                q10.T = tL_messages_stickerSet;
                return;
            case 3:
                wg1.d0((wg1) obj6, (TLRPC.TL_error) obj5, this.d, (TLObject) obj4, (byte[]) obj3, (String) obj, (TL_account.passwordInputSettings) obj2);
                return;
            default:
                l0.U((l0) obj6, (TLRPC.TL_error) obj5, (TLObject) obj4, (int[]) obj3, (ArrayList) obj2, this.d, (TLRPC.User) obj);
                return;
        }
    }

    public h(v vVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z4, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.e = vVar;
        this.f9418b = tL_error;
        this.f9419c = tLObject;
        this.f9420f = tL_chatInviteImporter;
        this.d = z4;
        this.h = user;
        this.f9421n = tL_messages_hideChatJoinRequest;
    }

    public h(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.e = sendMessagesHelper;
        this.f9418b = tL_error;
        this.f9419c = tLObject;
        this.d = z4;
        this.f9420f = arrayList;
        this.h = arrayList2;
        this.f9421n = tLObject2;
    }

    public h(wg1 wg1Var, TLRPC.TL_error tL_error, boolean z4, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.e = wg1Var;
        this.f9418b = tL_error;
        this.d = z4;
        this.f9419c = tLObject;
        this.f9420f = bArr;
        this.h = str;
        this.f9421n = passwordinputsettings;
    }

    public h(l0 l0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z4, TLRPC.User user) {
        this.e = l0Var;
        this.f9418b = tL_error;
        this.f9419c = tLObject;
        this.f9420f = iArr;
        this.f9421n = arrayList;
        this.d = z4;
        this.h = user;
    }
}
