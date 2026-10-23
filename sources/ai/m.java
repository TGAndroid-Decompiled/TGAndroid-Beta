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
import org.telegram.ui.mz0;
import org.telegram.ui.nz0;
import org.telegram.ui.ob0;
import org.telegram.ui.u50;
public final class m implements Runnable {
    public final int f1794a = 0;
    public final long f1795b;
    public final boolean f1796c;
    public final Object d;
    public final Object e;
    public final Object f1797f;
    public final Object h;

    public m(x xVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.e = xVar;
        this.f1797f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.f1796c = z10;
        this.f1795b = j10;
    }

    @Override
    public final void run() {
        SpannableStringBuilder replaceTags;
        org.telegram.ui.Components.a6 a6Var;
        int i10 = this.f1794a;
        long j10 = this.f1795b;
        boolean z10 = this.f1796c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f1797f;
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
                    xVar.h0(this.f1796c, this.f1795b, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                ci.p4 p4Var = (ci.p4) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                ci.h7 storiesController = messagesController.getStoriesController();
                final long j11 = this.f1795b;
                final boolean z11 = this.f1796c;
                storiesController.i0(j11, z11, false);
                mi.q qVar = new mi.q(9, (byte) 0);
                qVar.f17036b = new Runnable() {
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
                qVar.f17037c = new Runnable() {
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
                org.telegram.ui.Components.qc V = new org.telegram.ui.Components.xc(p4Var.f5660d1, p4Var.B0).V(Arrays.asList(tLObject2), replaceTags, null, qVar);
                V.f29826a = 2;
                V.k(true);
                return;
            case 2:
                ci.h7 h7Var = (ci.h7) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            MessagesController messagesController2 = MessagesController.getInstance(h7Var.f5399a);
                            ChannelBoostsController boostsController = messagesController2.getBoostsController();
                            long j12 = this.f1795b;
                            boostsController.getBoostsStats(j12, new x2(h7Var, callback, messagesController2, j12, 2));
                            return;
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (z10 && R != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, g6Var);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                            c2Var.R = string;
                            c2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                        if (z10 && R2 != null) {
                            R2.showDialog(new sg.y0(R2, 14, true));
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
                ChatActivityEnterView chatActivityEnterView = ((gg) obj4).f26605a;
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
                u50.z((u50) obj4, (org.telegram.ui.ActionBar.c2[]) obj2, this.f1796c, (TLRPC.TL_error) obj3, this.f1795b, (TL_phone.inviteToGroupCall) obj);
                return;
            case 5:
                ob0 ob0Var = (ob0) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                int i11 = ob0Var.f40120b;
                ob0Var.c();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                    if (user != null) {
                        org.telegram.ui.Wallet.j9 j9Var = new org.telegram.ui.Wallet.j9(user);
                        j9Var.f34675r = j10;
                        j9Var.f34663f0 = str3;
                        j9Var.f34664g0 = z10;
                        j9Var.f34661e0 = true;
                        ob0Var.u(j9Var, false);
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    ob0.d().f0(tL_error2, false);
                    return;
                } else {
                    return;
                }
            default:
                nz0 nz0Var = (nz0) obj4;
                ProfileActivity profileActivity = nz0Var.f40016b;
                dq dqVar = new dq(profileActivity.f33921f1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                dqVar.Y0 = new mz0(nz0Var, (ey) obj);
                profileActivity.presentFragment(dqVar);
                return;
        }
    }

    public m(ci.p4 p4Var, MessagesController messagesController, long j10, boolean z10, String str, TLObject tLObject) {
        this.e = p4Var;
        this.f1797f = messagesController;
        this.f1795b = j10;
        this.f1796c = z10;
        this.h = str;
        this.d = tLObject;
    }

    public m(ci.h7 h7Var, TLRPC.TL_error tL_error, boolean z10, long j10, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = h7Var;
        this.f1797f = tL_error;
        this.f1796c = z10;
        this.f1795b = j10;
        this.d = callback;
        this.h = g6Var;
    }

    public m(gg ggVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.e = ggVar;
        this.f1797f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.f1795b = j10;
        this.f1796c = z10;
    }

    public m(u50 u50Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.e = u50Var;
        this.d = c2VarArr;
        this.f1796c = z10;
        this.f1797f = tL_error;
        this.f1795b = j10;
        this.h = invitetogroupcall;
    }

    public m(ob0 ob0Var, TLObject tLObject, long j10, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.e = ob0Var;
        this.d = tLObject;
        this.f1795b = j10;
        this.h = str;
        this.f1796c = z10;
        this.f1797f = tL_error;
    }

    public m(nz0 nz0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, ey eyVar) {
        this.e = nz0Var;
        this.f1795b = j10;
        this.f1797f = tL_chatAdminRights;
        this.d = str;
        this.f1796c = z10;
        this.h = eyVar;
    }
}
