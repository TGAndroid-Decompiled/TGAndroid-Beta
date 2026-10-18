package ai;

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
import org.telegram.ui.dq;
import org.telegram.ui.ey;
import org.telegram.ui.kb0;
import org.telegram.ui.kz0;
import org.telegram.ui.lz0;
import org.telegram.ui.s50;
public final class m implements Runnable {
    public final int f1799a = 0;
    public final long f1800b;
    public final boolean f1801c;
    public final Object d;
    public final Object e;
    public final Object f1802f;
    public final Object h;

    public m(x xVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.e = xVar;
        this.f1802f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.f1801c = z10;
        this.f1800b = j10;
    }

    @Override
    public final void run() {
        SpannableStringBuilder replaceTags;
        org.telegram.ui.Components.a6 a6Var;
        int i10 = this.f1799a;
        long j10 = this.f1800b;
        boolean z10 = this.f1801c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f1802f;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                x xVar = (x) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    xVar.h0(this.f1801c, this.f1800b, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                ci.q4 q4Var = (ci.q4) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                ci.i7 storiesController = messagesController.getStoriesController();
                final long j11 = this.f1800b;
                final boolean z11 = this.f1801c;
                storiesController.i0(j11, z11, false);
                n2.e eVar = new n2.e(7, false);
                eVar.f17042b = new Runnable() {
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
                eVar.f17043c = new Runnable() {
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
                org.telegram.ui.Components.qc V = new org.telegram.ui.Components.xc(q4Var.f5776d1, q4Var.B0).V(Arrays.asList(tLObject2), replaceTags, null, eVar);
                V.f29639a = 2;
                V.k(true);
                return;
            case 2:
                ci.i7 i7Var = (ci.i7) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            MessagesController messagesController2 = MessagesController.getInstance(i7Var.f5494a);
                            ChannelBoostsController boostsController = messagesController2.getBoostsController();
                            long j12 = this.f1800b;
                            boostsController.getBoostsStats(j12, new w2(i7Var, callback, messagesController2, j12, 2));
                            return;
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (z10 && R != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, d6Var);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                            b2Var.R = string;
                            b2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                        if (z10 && R2 != null) {
                            R2.showDialog(new sg.x0(R2, 14, true));
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else {
                        org.telegram.ui.Components.xc X = org.telegram.ui.Components.xc.X();
                        if (X != null) {
                            X.f0(tL_error, false);
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
                ChatActivityEnterView chatActivityEnterView = ((gg) obj4).f26568a;
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
                                a6Var = new org.telegram.ui.Components.a6(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                a6Var = new org.telegram.ui.Components.a6(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z10) {
                                a6Var.fromEmojiKeyboard = true;
                            }
                            a6Var.cacheType = org.telegram.ui.Components.r5.g();
                            spannableString.setSpan(a6Var, 0, spannableString.length(), 33);
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
                s50.A((s50) obj4, (org.telegram.ui.ActionBar.b2[]) obj2, this.f1801c, (TLRPC.TL_error) obj3, this.f1800b, (TL_phone.inviteToGroupCall) obj);
                return;
            case 5:
                kb0 kb0Var = (kb0) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                int i11 = kb0Var.f38469b;
                kb0Var.c();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                    if (user != null) {
                        org.telegram.ui.Wallet.o9 o9Var = new org.telegram.ui.Wallet.o9(user);
                        o9Var.f34707r = j10;
                        o9Var.f34692d0 = str3;
                        o9Var.f34693e0 = z10;
                        o9Var.f34691c0 = true;
                        kb0Var.u(o9Var, false);
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    kb0.d().f0(tL_error2, false);
                    return;
                } else {
                    return;
                }
            default:
                lz0 lz0Var = (lz0) obj4;
                ProfileActivity profileActivity = lz0Var.f38990b;
                dq dqVar = new dq(profileActivity.f33614f1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                dqVar.X0 = new kz0(lz0Var, (ey) obj);
                profileActivity.presentFragment(dqVar);
                return;
        }
    }

    public m(ci.q4 q4Var, MessagesController messagesController, long j10, boolean z10, String str, TLObject tLObject) {
        this.e = q4Var;
        this.f1802f = messagesController;
        this.f1800b = j10;
        this.f1801c = z10;
        this.h = str;
        this.d = tLObject;
    }

    public m(ci.i7 i7Var, TLRPC.TL_error tL_error, boolean z10, long j10, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = i7Var;
        this.f1802f = tL_error;
        this.f1801c = z10;
        this.f1800b = j10;
        this.d = callback;
        this.h = d6Var;
    }

    public m(gg ggVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.e = ggVar;
        this.f1802f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.f1800b = j10;
        this.f1801c = z10;
    }

    public m(s50 s50Var, org.telegram.ui.ActionBar.b2[] b2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.e = s50Var;
        this.d = b2VarArr;
        this.f1801c = z10;
        this.f1802f = tL_error;
        this.f1800b = j10;
        this.h = invitetogroupcall;
    }

    public m(kb0 kb0Var, TLObject tLObject, long j10, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.e = kb0Var;
        this.d = tLObject;
        this.f1800b = j10;
        this.h = str;
        this.f1801c = z10;
        this.f1802f = tL_error;
    }

    public m(lz0 lz0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, ey eyVar) {
        this.e = lz0Var;
        this.f1800b = j10;
        this.f1802f = tL_chatAdminRights;
        this.d = str;
        this.f1801c = z10;
        this.h = eyVar;
    }
}
