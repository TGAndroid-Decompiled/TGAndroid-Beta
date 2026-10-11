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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.jg;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dc0;
import org.telegram.ui.e01;
import org.telegram.ui.f01;
import org.telegram.ui.g60;
import org.telegram.ui.nq;
import org.telegram.ui.sy;
public final class i3 implements Runnable {
    public final int f1130a = 0;
    public final boolean f1131b;
    public final long f1132c;
    public final Object d;
    public final Object f1133e;
    public final Object f1134f;
    public final Object h;

    public i3(f6 f6Var, MessagesController messagesController, long j3, boolean z10, String str, TLObject tLObject) {
        this.d = f6Var;
        this.f1133e = messagesController;
        this.f1132c = j3;
        this.f1131b = z10;
        this.f1134f = str;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        SpannableStringBuilder replaceTags;
        org.telegram.ui.Components.b6 b6Var;
        int i10 = this.f1130a;
        long j3 = this.f1132c;
        boolean z10 = this.f1131b;
        Object obj = this.f1134f;
        Object obj2 = this.h;
        Object obj3 = this.f1133e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                f6 f6Var = (f6) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject = (TLObject) obj2;
                m9 storiesController = messagesController.getStoriesController();
                final long j10 = this.f1132c;
                final boolean z11 = this.f1131b;
                storiesController.i0(j10, z11, false);
                n6.k kVar = new n6.k(5);
                kVar.f16729b = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                messagesController.getStoriesController().i0(j10, !z11, false);
                                return;
                            default:
                                messagesController.getStoriesController().i0(j10, z11, true);
                                return;
                        }
                    }
                };
                kVar.f16730c = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                messagesController.getStoriesController().i0(j10, !z11, false);
                                return;
                            default:
                                messagesController.getStoriesController().i0(j10, z11, true);
                                return;
                        }
                    }
                };
                if (!z11) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10)));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10)));
                }
                org.telegram.ui.Components.sc V = new ad(f6Var.f959d1, f6Var.B0).V(Arrays.asList(tLObject), replaceTags, null, kVar);
                V.f30704a = 2;
                V.k(true);
                return;
            case 1:
                m9 m9Var = (m9) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            MessagesController messagesController2 = MessagesController.getInstance(m9Var.f1406a);
                            ChannelBoostsController boostsController = messagesController2.getBoostsController();
                            long j11 = this.f1132c;
                            boostsController.getBoostsStats(j11, new l(m9Var, callback, messagesController2, j11, 1));
                            return;
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (z10 && R != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, d6Var);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                            a2Var.R = string;
                            a2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                        if (z10 && R2 != null) {
                            R2.showDialog(new rg.y0(R2, 14, true));
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else {
                        ad X = ad.X();
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
                ChatActivityEnterView chatActivityEnterView = ((jg) obj4).f27679a;
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
                                b6Var = new org.telegram.ui.Components.b6(j3, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z10) {
                                b6Var.fromEmojiKeyboard = true;
                            }
                            b6Var.cacheType = org.telegram.ui.Components.s5.g();
                            spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
                            editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                            editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
                g60.B((g60) obj4, (org.telegram.ui.ActionBar.a2[]) obj3, this.f1131b, (TLRPC.TL_error) obj, this.f1132c, (TL_phone.inviteToGroupCall) obj2);
                return;
            case 4:
                dc0 dc0Var = (dc0) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                int i11 = dc0Var.f36976b;
                dc0Var.c();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                    if (user != null) {
                        org.telegram.ui.Wallet.l8 l8Var = new org.telegram.ui.Wallet.l8(user);
                        l8Var.f35249r = j3;
                        l8Var.f35233d0 = str3;
                        l8Var.f35235e0 = z10;
                        l8Var.f35232c0 = true;
                        dc0Var.u(l8Var, false);
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    dc0.d().f0(tL_error2, false);
                    return;
                } else {
                    return;
                }
            case 5:
                f01 f01Var = (f01) obj4;
                ProfileActivity profileActivity = f01Var.f37499b;
                nq nqVar = new nq(profileActivity.f34271e1, -j3, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj, 2, true, !z10, null);
                nqVar.X0 = new e01(f01Var, (sy) obj2);
                profileActivity.presentFragment(nqVar);
                return;
            default:
                yh.g gVar = (yh.g) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject3;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    gVar.h0(this.f1131b, this.f1132c, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
        }
    }

    public i3(m9 m9Var, TLRPC.TL_error tL_error, boolean z10, long j3, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = m9Var;
        this.f1133e = tL_error;
        this.f1131b = z10;
        this.f1132c = j3;
        this.f1134f = callback;
        this.h = d6Var;
    }

    public i3(jg jgVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j3, boolean z10) {
        this.d = jgVar;
        this.f1133e = editTextBoldCursor;
        this.f1134f = str;
        this.h = document;
        this.f1132c = j3;
        this.f1131b = z10;
    }

    public i3(g60 g60Var, org.telegram.ui.ActionBar.a2[] a2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = g60Var;
        this.f1133e = a2VarArr;
        this.f1131b = z10;
        this.f1134f = tL_error;
        this.f1132c = j3;
        this.h = invitetogroupcall;
    }

    public i3(dc0 dc0Var, TLObject tLObject, long j3, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.d = dc0Var;
        this.h = tLObject;
        this.f1132c = j3;
        this.f1134f = str;
        this.f1131b = z10;
        this.f1133e = tL_error;
    }

    public i3(f01 f01Var, long j3, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, sy syVar) {
        this.d = f01Var;
        this.f1132c = j3;
        this.f1133e = tL_chatAdminRights;
        this.f1134f = str;
        this.f1131b = z10;
        this.h = syVar;
    }

    public i3(yh.g gVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = gVar;
        this.f1133e = tL_error;
        this.h = tLObject;
        this.f1134f = twoStepVerificationActivity;
        this.f1131b = z10;
        this.f1132c = j3;
    }
}
