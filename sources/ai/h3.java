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
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a01;
import org.telegram.ui.h60;
import org.telegram.ui.mq;
import org.telegram.ui.uy;
import org.telegram.ui.zz0;
public final class h3 implements Runnable {
    public final int f1016a = 0;
    public final boolean f1017b;
    public final long f1018c;
    public final Object d;
    public final Object f1019e;
    public final Object f1020f;
    public final Object h;

    public h3(e6 e6Var, MessagesController messagesController, long j3, boolean z10, String str, TLObject tLObject) {
        this.d = e6Var;
        this.f1019e = messagesController;
        this.f1018c = j3;
        this.f1017b = z10;
        this.f1020f = str;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        SpannableStringBuilder replaceTags;
        org.telegram.ui.Components.z5 z5Var;
        int i10 = this.f1016a;
        long j3 = this.f1018c;
        boolean z10 = this.f1017b;
        Object obj = this.f1020f;
        Object obj2 = this.h;
        Object obj3 = this.f1019e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                e6 e6Var = (e6) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject = (TLObject) obj2;
                l9 storiesController = messagesController.getStoriesController();
                final long j10 = this.f1018c;
                final boolean z11 = this.f1017b;
                storiesController.i0(j10, z11, false);
                o0.a aVar = new o0.a(3, (byte) 0);
                aVar.f16927b = new Runnable() {
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
                aVar.f16928c = new Runnable() {
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
                org.telegram.ui.Components.rc V = new yc(e6Var.f848d1, e6Var.B0).V(Arrays.asList(tLObject), replaceTags, null, aVar);
                V.f30331a = 2;
                V.k(true);
                return;
            case 1:
                l9 l9Var = (l9) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            MessagesController messagesController2 = MessagesController.getInstance(l9Var.f1290a);
                            ChannelBoostsController boostsController = messagesController2.getBoostsController();
                            long j11 = this.f1018c;
                            boostsController.getBoostsStats(j11, new l(l9Var, callback, messagesController2, j11, 1));
                            return;
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (z10 && R != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, d6Var);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
                            b2Var.R = string;
                            b2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                        if (z10 && R2 != null) {
                            R2.showDialog(new rg.y0(R2, 14, true));
                        }
                        callback.run(Boolean.FALSE);
                        return;
                    } else {
                        yc X = yc.X();
                        if (X != null) {
                            X.d0(tL_error, false);
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
                ChatActivityEnterView chatActivityEnterView = ((ig) obj4).f27400a;
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
                                z5Var = new org.telegram.ui.Components.z5(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                z5Var = new org.telegram.ui.Components.z5(j3, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z10) {
                                z5Var.fromEmojiKeyboard = true;
                            }
                            z5Var.cacheType = org.telegram.ui.Components.q5.g();
                            spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
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
                h60.y((h60) obj4, (org.telegram.ui.ActionBar.b2[]) obj3, this.f1017b, (TLRPC.TL_error) obj, this.f1018c, (TL_phone.inviteToGroupCall) obj2);
                return;
            case 4:
                a01 a01Var = (a01) obj4;
                ProfileActivity profileActivity = a01Var.f34622b;
                mq mqVar = new mq(profileActivity.f34233e1, -j3, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj, 2, true, !z10, null);
                mqVar.X0 = new zz0(a01Var, (uy) obj2);
                profileActivity.presentFragment(mqVar);
                return;
            default:
                yh.g gVar = (yh.g) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    gVar.h0(this.f1017b, this.f1018c, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
        }
    }

    public h3(l9 l9Var, TLRPC.TL_error tL_error, boolean z10, long j3, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = l9Var;
        this.f1019e = tL_error;
        this.f1017b = z10;
        this.f1018c = j3;
        this.f1020f = callback;
        this.h = d6Var;
    }

    public h3(ig igVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j3, boolean z10) {
        this.d = igVar;
        this.f1019e = editTextBoldCursor;
        this.f1020f = str;
        this.h = document;
        this.f1018c = j3;
        this.f1017b = z10;
    }

    public h3(h60 h60Var, org.telegram.ui.ActionBar.b2[] b2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = h60Var;
        this.f1019e = b2VarArr;
        this.f1017b = z10;
        this.f1020f = tL_error;
        this.f1018c = j3;
        this.h = invitetogroupcall;
    }

    public h3(a01 a01Var, long j3, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, uy uyVar) {
        this.d = a01Var;
        this.f1018c = j3;
        this.f1019e = tL_chatAdminRights;
        this.f1020f = str;
        this.f1017b = z10;
        this.h = uyVar;
    }

    public h3(yh.g gVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = gVar;
        this.f1019e = tL_error;
        this.h = tLObject;
        this.f1020f = twoStepVerificationActivity;
        this.f1017b = z10;
        this.f1018c = j3;
    }
}
