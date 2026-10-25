package bi;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gg;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cy;
import org.telegram.ui.gq;
import org.telegram.ui.lb0;
import org.telegram.ui.qz0;
import org.telegram.ui.rz0;
import org.telegram.ui.v50;
public final class n implements Runnable {
    public final int f5114a = 0;
    public final long f5115b;
    public final boolean f5116c;
    public final Object d;
    public final Object e;
    public final Object f5117f;
    public final Object h;

    public n(y yVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.e = yVar;
        this.f5117f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.f5116c = z10;
        this.f5115b = j10;
    }

    @Override
    public final void run() {
        SpannableStringBuilder replaceTags;
        org.telegram.ui.Components.c6 c6Var;
        int i10 = this.f5114a;
        long j10 = this.f5115b;
        boolean z10 = this.f5116c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f5117f;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                y yVar = (y) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.n0(password);
                    yVar.q0(this.f5116c, this.f5115b, twoStepVerificationActivity.m0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                di.q4 q4Var = (di.q4) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                di.h7 storiesController = messagesController.getStoriesController();
                final long j11 = this.f5115b;
                final boolean z11 = this.f5116c;
                storiesController.i0(j11, z11, false);
                m4.c cVar = new m4.c(9, false);
                cVar.f18009b = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                messagesController.getStoriesController().i0(j11, !z11, false);
                                return;
                            default:
                                messagesController.getStoriesController().i0(j11, z11, true);
                                return;
                        }
                    }
                };
                cVar.f18010c = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                messagesController.getStoriesController().i0(j11, !z11, false);
                                return;
                            default:
                                messagesController.getStoriesController().i0(j11, z11, true);
                                return;
                        }
                    }
                };
                if (!z11) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10)));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10)));
                }
                org.telegram.ui.Components.qc W = new org.telegram.ui.Components.wc(q4Var.S0, q4Var.f9015q0).W(Arrays.asList(tLObject2), replaceTags, null, cVar);
                W.f31881a = 2;
                W.k(true);
                return;
            case 2:
                di.h7 h7Var = (di.h7) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            MessagesController messagesController2 = MessagesController.getInstance(h7Var.f8630a);
                            ChannelBoostsController boostsController = messagesController2.getBoostsController();
                            long j12 = this.f5115b;
                            boostsController.getBoostsStats(j12, new t2(h7Var, callback, messagesController2, j12, 2));
                            return;
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                        if (z10 && R != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, u6Var);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                            e2Var.R = string;
                            e2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                        if (z10 && R2 != null) {
                            R2.showDialog(new tg.y0(R2, 14, true));
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else {
                        org.telegram.ui.Components.wc Y = org.telegram.ui.Components.wc.Y();
                        if (Y != null) {
                            Y.g0(tL_error, false);
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    }
                }
                callback.run(Boolean.TRUE);
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((gg) obj4).f28564a;
                if (editTextBoldCursor != null) {
                    int selectionEnd = editTextBoldCursor.getSelectionEnd();
                    if (selectionEnd < 0) {
                        selectionEnd = 0;
                    }
                    try {
                        try {
                            chatActivityEnterView.S2 = 2;
                            if (str2 == null) {
                                str2 = "😀";
                            }
                            SpannableString spannableString = new SpannableString(str2);
                            if (document != null) {
                                c6Var = new org.telegram.ui.Components.c6(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                c6Var = new org.telegram.ui.Components.c6(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z10) {
                                c6Var.fromEmojiKeyboard = true;
                            }
                            c6Var.cacheType = org.telegram.ui.Components.t5.g();
                            spannableString.setSpan(c6Var, 0, spannableString.length(), 33);
                            editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                            editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        chatActivityEnterView.S2 = 0;
                        return;
                    } catch (Throwable th2) {
                        chatActivityEnterView.S2 = 0;
                        throw th2;
                    }
                }
                return;
            case 4:
                v50.y((v50) obj4, (org.telegram.ui.ActionBar.e2[]) obj2, this.f5116c, (TLRPC.TL_error) obj3, this.f5115b, (TL_phone.inviteToGroupCall) obj);
                return;
            case 5:
                lb0 lb0Var = (lb0) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                int i11 = lb0Var.f41236b;
                lb0Var.c();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                    if (user != null) {
                        org.telegram.ui.Wallet.i9 i9Var = new org.telegram.ui.Wallet.i9(user);
                        i9Var.f36708s = j10;
                        i9Var.f36695g0 = str3;
                        i9Var.f36696h0 = z10;
                        i9Var.f36694f0 = true;
                        lb0Var.u(i9Var, false);
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    lb0.d().g0(tL_error2, false);
                    return;
                } else {
                    return;
                }
            default:
                rz0 rz0Var = (rz0) obj4;
                ProfileActivity profileActivity = rz0Var.f43312b;
                gq gqVar = new gq(profileActivity.f35976e1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                gqVar.X0 = new qz0(rz0Var, (cy) obj);
                profileActivity.presentFragment(gqVar);
                return;
        }
    }

    public n(di.q4 q4Var, MessagesController messagesController, long j10, boolean z10, String str, TLObject tLObject) {
        this.e = q4Var;
        this.f5117f = messagesController;
        this.f5115b = j10;
        this.f5116c = z10;
        this.h = str;
        this.d = tLObject;
    }

    public n(di.h7 h7Var, TLRPC.TL_error tL_error, boolean z10, long j10, Utilities.Callback callback, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = h7Var;
        this.f5117f = tL_error;
        this.f5116c = z10;
        this.f5115b = j10;
        this.d = callback;
        this.h = u6Var;
    }

    public n(gg ggVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.e = ggVar;
        this.f5117f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.f5115b = j10;
        this.f5116c = z10;
    }

    public n(v50 v50Var, org.telegram.ui.ActionBar.e2[] e2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.e = v50Var;
        this.d = e2VarArr;
        this.f5116c = z10;
        this.f5117f = tL_error;
        this.f5115b = j10;
        this.h = invitetogroupcall;
    }

    public n(lb0 lb0Var, TLObject tLObject, long j10, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.e = lb0Var;
        this.d = tLObject;
        this.f5115b = j10;
        this.h = str;
        this.f5116c = z10;
        this.f5117f = tL_error;
    }

    public n(rz0 rz0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, cy cyVar) {
        this.e = rz0Var;
        this.f5115b = j10;
        this.f5117f = tL_chatAdminRights;
        this.d = str;
        this.f5116c = z10;
        this.h = cyVar;
    }
}
