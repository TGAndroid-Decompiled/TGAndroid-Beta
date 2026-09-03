package mh;

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
import org.telegram.ui.d60;
import org.telegram.ui.kq;
import org.telegram.ui.py;
import org.telegram.ui.uz0;
import org.telegram.ui.vz0;
public final class i implements Runnable {
    public final int f14195a = 0;
    public final long f14196b;
    public final boolean f14197c;
    public final Object d;
    public final Object f14198e;
    public final Object f14199f;
    public final Object h;

    public i(p pVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z4, long j10) {
        this.f14198e = pVar;
        this.f14199f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.f14197c = z4;
        this.f14196b = j10;
    }

    @Override
    public final void run() {
        SpannableStringBuilder replaceTags;
        org.telegram.ui.Components.u5 u5Var;
        int i10 = this.f14195a;
        long j10 = this.f14196b;
        boolean z4 = this.f14197c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f14199f;
        Object obj4 = this.f14198e;
        switch (i10) {
            case 0:
                p pVar = (p) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    pVar.h0(this.f14197c, this.f14196b, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                oh.f4 f4Var = (oh.f4) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                oh.t6 storiesController = messagesController.getStoriesController();
                final long j11 = this.f14196b;
                final boolean z10 = this.f14197c;
                storiesController.i0(j11, z10, false);
                n7.qa qaVar = new n7.qa(11);
                qaVar.f15701b = new Runnable() {
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
                qaVar.f15702c = new Runnable() {
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
                ic V = new qc(f4Var.f17054a1, f4Var.f17129y0).V(Arrays.asList(tLObject2), replaceTags, null, qaVar);
                V.f27771a = 2;
                V.k(true);
                return;
            case 2:
                oh.t6 t6Var = (oh.t6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                h5.d dVar = (h5.d) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z4) {
                            MessagesController messagesController2 = MessagesController.getInstance(t6Var.f17772a);
                            ChannelBoostsController boostsController = messagesController2.getBoostsController();
                            long j12 = this.f14196b;
                            boostsController.getBoostsStats(j12, new v1(t6Var, dVar, messagesController2, j12));
                            return;
                        }
                        dVar.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (z4 && R != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, g6Var);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                            d2Var.O = string;
                            d2Var.Q = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            l.d.C(R.string.OK, alertDialog$Builder, null);
                        }
                        dVar.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                        if (z4 && R2 != null) {
                            R2.showDialog(new fg.n1(R2, 14, true));
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
                ChatActivityEnterView chatActivityEnterView = ((xf) obj4).f33052a;
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
                        } catch (Exception e6) {
                            FileLog.e(e6);
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
                d60.y((d60) obj4, (org.telegram.ui.ActionBar.d2[]) obj2, this.f14197c, (TLRPC.TL_error) obj3, this.f14196b, (TL_phone.inviteToGroupCall) obj);
                return;
            default:
                vz0 vz0Var = (vz0) obj4;
                ProfileActivity profileActivity = vz0Var.f42235b;
                kq kqVar = new kq(profileActivity.f34569b1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z4, null);
                kqVar.U0 = new uz0(vz0Var, (py) obj);
                profileActivity.presentFragment(kqVar);
                return;
        }
    }

    public i(oh.f4 f4Var, MessagesController messagesController, long j10, boolean z4, String str, TLObject tLObject) {
        this.f14198e = f4Var;
        this.f14199f = messagesController;
        this.f14196b = j10;
        this.f14197c = z4;
        this.h = str;
        this.d = tLObject;
    }

    public i(oh.t6 t6Var, TLRPC.TL_error tL_error, boolean z4, long j10, h5.d dVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f14198e = t6Var;
        this.f14199f = tL_error;
        this.f14197c = z4;
        this.f14196b = j10;
        this.d = dVar;
        this.h = g6Var;
    }

    public i(xf xfVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z4) {
        this.f14198e = xfVar;
        this.f14199f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.f14196b = j10;
        this.f14197c = z4;
    }

    public i(d60 d60Var, org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z4, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.f14198e = d60Var;
        this.d = d2VarArr;
        this.f14197c = z4;
        this.f14199f = tL_error;
        this.f14196b = j10;
        this.h = invitetogroupcall;
    }

    public i(vz0 vz0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z4, py pyVar) {
        this.f14198e = vz0Var;
        this.f14196b = j10;
        this.f14199f = tL_chatAdminRights;
        this.d = str;
        this.f14197c = z4;
        this.h = pyVar;
    }
}
