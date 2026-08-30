package lh;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c60;
import org.telegram.ui.jq;
import org.telegram.ui.nz0;
import org.telegram.ui.oy;
import org.telegram.ui.oz0;
public final class j implements Runnable {
    public final int f12630a = 0;
    public final long f12631b;
    public final boolean f12632c;
    public final Object d;
    public final Object e;
    public final Object f12633f;
    public final Object h;

    public j(q qVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z4, long j10) {
        this.e = qVar;
        this.f12633f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.f12632c = z4;
        this.f12631b = j10;
    }

    @Override
    public final void run() {
        SpannableStringBuilder replaceTags;
        org.telegram.ui.Components.u5 u5Var;
        int i10 = this.f12630a;
        long j10 = this.f12631b;
        boolean z4 = this.f12632c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f12633f;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                q qVar = (q) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    qVar.h0(this.f12632c, this.f12631b, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                nh.d4 d4Var = (nh.d4) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                nh.t6 storiesController = messagesController.getStoriesController();
                final long j11 = this.f12631b;
                final boolean z10 = this.f12632c;
                storiesController.i0(j11, z10, false);
                n7.qa qaVar = new n7.qa(11);
                qaVar.f14702b = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                messagesController.getStoriesController().i0(j11, !z10, false);
                                return;
                            default:
                                messagesController.getStoriesController().i0(j11, z10, true);
                                return;
                        }
                    }
                };
                qaVar.f14703c = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                messagesController.getStoriesController().i0(j11, !z10, false);
                                return;
                            default:
                                messagesController.getStoriesController().i0(j11, z10, true);
                                return;
                        }
                    }
                };
                if (!z10) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10)));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10)));
                }
                ic V = new qc(d4Var.f15182a1, d4Var.f15257y0).V(Arrays.asList(tLObject2), replaceTags, null, qaVar);
                V.f25666a = 2;
                V.k(true);
                return;
            case 2:
                nh.t6 t6Var = (nh.t6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                h5.d dVar = (h5.d) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z4) {
                            MessagesController messagesController2 = MessagesController.getInstance(t6Var.f15917a);
                            ChannelBoostsController boostsController = messagesController2.getBoostsController();
                            long j12 = this.f12631b;
                            boostsController.getBoostsStats(j12, new w1(t6Var, dVar, messagesController2, j12));
                            return;
                        }
                        dVar.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (z4 && R != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, f6Var);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                            d2Var.O = string;
                            d2Var.Q = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            kh.a2.C(R.string.OK, alertDialog$Builder, null);
                        }
                        dVar.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                        if (z4 && R2 != null) {
                            R2.showDialog(new eg.o1(R2, 14, true));
                        }
                        dVar.accept(Boolean.FALSE);
                        return;
                    } else {
                        qc X = qc.X();
                        if (X != null) {
                            X.d0(tL_error, false);
                        }
                        dVar.accept(Boolean.FALSE);
                        return;
                    }
                }
                dVar.accept(Boolean.TRUE);
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((xf) obj4).f30668a;
                if (editTextBoldCursor != null) {
                    int selectionEnd = editTextBoldCursor.getSelectionEnd();
                    if (selectionEnd < 0) {
                        selectionEnd = 0;
                    }
                    try {
                        try {
                            chatActivityEnterView.O2 = 2;
                            if (str2 == null) {
                                str2 = "😀";
                            }
                            SpannableString spannableString = new SpannableString(str2);
                            if (document != null) {
                                u5Var = new org.telegram.ui.Components.u5(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                u5Var = new org.telegram.ui.Components.u5(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z4) {
                                u5Var.fromEmojiKeyboard = true;
                            }
                            u5Var.cacheType = org.telegram.ui.Components.l5.g();
                            spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
                            editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                            editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        chatActivityEnterView.O2 = 0;
                        return;
                    } catch (Throwable th2) {
                        chatActivityEnterView.O2 = 0;
                        throw th2;
                    }
                }
                return;
            case 4:
                c60.y((c60) obj4, (org.telegram.ui.ActionBar.d2[]) obj2, this.f12632c, (TLRPC.TL_error) obj3, this.f12631b, (TL_phone.inviteToGroupCall) obj);
                return;
            default:
                oz0 oz0Var = (oz0) obj4;
                ProfileActivity profileActivity = oz0Var.f37135b;
                jq jqVar = new jq(profileActivity.f32037b1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z4, null);
                jqVar.U0 = new nz0(oz0Var, (oy) obj);
                profileActivity.presentFragment(jqVar);
                return;
        }
    }

    public j(nh.d4 d4Var, MessagesController messagesController, long j10, boolean z4, String str, TLObject tLObject) {
        this.e = d4Var;
        this.f12633f = messagesController;
        this.f12631b = j10;
        this.f12632c = z4;
        this.h = str;
        this.d = tLObject;
    }

    public j(nh.t6 t6Var, TLRPC.TL_error tL_error, boolean z4, long j10, h5.d dVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = t6Var;
        this.f12633f = tL_error;
        this.f12632c = z4;
        this.f12631b = j10;
        this.d = dVar;
        this.h = f6Var;
    }

    public j(xf xfVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z4) {
        this.e = xfVar;
        this.f12633f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.f12631b = j10;
        this.f12632c = z4;
    }

    public j(c60 c60Var, org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z4, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.e = c60Var;
        this.d = d2VarArr;
        this.f12632c = z4;
        this.f12633f = tL_error;
        this.f12631b = j10;
        this.h = invitetogroupcall;
    }

    public j(oz0 oz0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z4, oy oyVar) {
        this.e = oz0Var;
        this.f12631b = j10;
        this.f12633f = tL_chatAdminRights;
        this.d = str;
        this.f12632c = z4;
        this.h = oyVar;
    }
}
