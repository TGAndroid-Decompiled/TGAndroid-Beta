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
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ic0;
import org.telegram.ui.l01;
import org.telegram.ui.m01;
import org.telegram.ui.n60;
import org.telegram.ui.tq;
import org.telegram.ui.yy;
public final class x2 implements Runnable {
    public final int f3950a = 0;
    public final boolean f3951b;
    public final long f3952c;
    public final Object d;
    public final Object e;
    public final Object f3953f;
    public final Object h;

    public x2(q5 q5Var, MessagesController messagesController, long j10, boolean z10, String str, TLObject tLObject) {
        this.d = q5Var;
        this.e = messagesController;
        this.f3952c = j10;
        this.f3951b = z10;
        this.f3953f = str;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        SpannableStringBuilder replaceTags;
        org.telegram.ui.Components.b6 b6Var;
        int i10 = this.f3950a;
        long j10 = this.f3952c;
        boolean z10 = this.f3951b;
        Object obj = this.f3953f;
        Object obj2 = this.h;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                q5 q5Var = (q5) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject = (TLObject) obj2;
                x8 storiesController = messagesController.getStoriesController();
                final long j11 = this.f3952c;
                final boolean z11 = this.f3951b;
                storiesController.i0(j11, z11, false);
                n3.b bVar = new n3.b(6, false);
                bVar.f15703b = new Runnable() {
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
                bVar.f15704c = new Runnable() {
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
                sc V = new zc(q5Var.f3519d1, q5Var.B0).V(Arrays.asList(tLObject), replaceTags, null, bVar);
                V.f28799a = 2;
                V.k(true);
                return;
            case 1:
                x8 x8Var = (x8) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            MessagesController messagesController2 = MessagesController.getInstance(x8Var.f3966a);
                            ChannelBoostsController boostsController = messagesController2.getBoostsController();
                            long j12 = this.f3952c;
                            boostsController.getBoostsStats(j12, new i(x8Var, callback, messagesController2, j12, 1));
                            return;
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (z10 && R != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, c6Var);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                            a2Var.R = string;
                            a2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                        if (z10 && R2 != null) {
                            R2.showDialog(new sg.y0(R2, 14, true));
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else {
                        zc X = zc.X();
                        if (X != null) {
                            X.f0(tL_error, false);
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    }
                }
                callback.run(Boolean.TRUE);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                ChatActivityEnterView chatActivityEnterView = ((ig) obj4).f25637a;
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
                                b6Var = new org.telegram.ui.Components.b6(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                b6Var = new org.telegram.ui.Components.b6(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z10) {
                                b6Var.fromEmojiKeyboard = true;
                            }
                            b6Var.cacheType = org.telegram.ui.Components.s5.g();
                            spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
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
            case 3:
                n60.B((n60) obj4, (org.telegram.ui.ActionBar.a2[]) obj3, this.f3951b, (TLRPC.TL_error) obj, this.f3952c, (TL_phone.inviteToGroupCall) obj2);
                return;
            case 4:
                ic0 ic0Var = (ic0) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                int i11 = ic0Var.f36776b;
                ic0Var.c();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                    if (user != null) {
                        org.telegram.ui.Wallet.j8 j8Var = new org.telegram.ui.Wallet.j8(user);
                        j8Var.f33084r = j10;
                        j8Var.f33069d0 = str3;
                        j8Var.f33070e0 = z10;
                        j8Var.f33068c0 = true;
                        ic0Var.u(j8Var, false);
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    ic0.d().f0(tL_error2, false);
                    return;
                } else {
                    return;
                }
            case 5:
                m01 m01Var = (m01) obj4;
                ProfileActivity profileActivity = m01Var.f37880b;
                tq tqVar = new tq(profileActivity.f32261e1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj, 2, true, !z10, null);
                tqVar.X0 = new l01(m01Var, (yy) obj2);
                profileActivity.presentFragment(tqVar);
                return;
            default:
                zh.g gVar = (zh.g) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject3;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    gVar.h0(this.f3951b, this.f3952c, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
        }
    }

    public x2(x8 x8Var, TLRPC.TL_error tL_error, boolean z10, long j10, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = x8Var;
        this.e = tL_error;
        this.f3951b = z10;
        this.f3952c = j10;
        this.f3953f = callback;
        this.h = c6Var;
    }

    public x2(ig igVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.d = igVar;
        this.e = editTextBoldCursor;
        this.f3953f = str;
        this.h = document;
        this.f3952c = j10;
        this.f3951b = z10;
    }

    public x2(n60 n60Var, org.telegram.ui.ActionBar.a2[] a2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = n60Var;
        this.e = a2VarArr;
        this.f3951b = z10;
        this.f3953f = tL_error;
        this.f3952c = j10;
        this.h = invitetogroupcall;
    }

    public x2(ic0 ic0Var, TLObject tLObject, long j10, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.d = ic0Var;
        this.h = tLObject;
        this.f3952c = j10;
        this.f3953f = str;
        this.f3951b = z10;
        this.e = tL_error;
    }

    public x2(m01 m01Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, yy yyVar) {
        this.d = m01Var;
        this.f3952c = j10;
        this.e = tL_chatAdminRights;
        this.f3953f = str;
        this.f3951b = z10;
        this.h = yyVar;
    }

    public x2(zh.g gVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.d = gVar;
        this.e = tL_error;
        this.h = tLObject;
        this.f3953f = twoStepVerificationActivity;
        this.f3951b = z10;
        this.f3952c = j10;
    }
}
