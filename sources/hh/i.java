package hh;

import android.text.SpannableString;
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
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cz0;
import org.telegram.ui.dq;
import org.telegram.ui.dz0;
import org.telegram.ui.gy;
import org.telegram.ui.s50;

public final class i implements Runnable {

    public final int f9427a = 0;

    public final long f9428b;

    public final boolean f9429c;
    public final Object d;

    public final Object f9430e;

    public final Object f9431f;
    public final Object h;

    public i(r rVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.f9430e = rVar;
        this.f9431f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.f9429c = z10;
        this.f9428b = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f9427a;
        long j10 = this.f9428b;
        int i11 = 2;
        boolean z10 = this.f9429c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f9431f;
        Object obj4 = this.f9430e;
        switch (i10) {
            case 0:
                r rVar = (r) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    rVar.h0(this.f9429c, this.f9428b, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                jh.e4 e4Var = (jh.e4) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                jh.s6 storiesController = messagesController.getStoriesController();
                final long j11 = this.f9428b;
                final boolean z11 = this.f9429c;
                storiesController.i0(j11, z11, false);
                org.telegram.ui.i6 i6Var = new org.telegram.ui.i6(i11);
                final int i12 = 0;
                i6Var.f38984b = new Runnable() {
                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                messagesController.getStoriesController().i0(j11, !z11, false);
                                break;
                            default:
                                messagesController.getStoriesController().i0(j11, z11, true);
                                break;
                        }
                    }
                };
                final int i13 = 1;
                i6Var.f38985c = new Runnable() {
                    @Override
                    public final void run() {
                        switch (i13) {
                            case 0:
                                messagesController.getStoriesController().i0(j11, !z11, false);
                                break;
                            default:
                                messagesController.getStoriesController().i0(j11, z11, true);
                                break;
                        }
                    }
                };
                ec ecVarV = new mc(e4Var.Z0, e4Var.f13290x0).V(Arrays.asList(tLObject2), !z11 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10))), null, i6Var);
                ecVarV.f28013a = 2;
                ecVarV.k(true);
                return;
            case 2:
                jh.s6 s6Var = (jh.s6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                d5.d dVar = (d5.d) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                if (tL_error == null) {
                    dVar.accept(Boolean.TRUE);
                    return;
                }
                if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                    if (!z10) {
                        dVar.accept(Boolean.FALSE);
                        return;
                    }
                    MessagesController messagesController2 = MessagesController.getInstance(s6Var.f13955a);
                    ChannelBoostsController boostsController = messagesController2.getBoostsController();
                    long j12 = this.f9428b;
                    boostsController.getBoostsStats(j12, new y1(s6Var, dVar, messagesController2, j12));
                    return;
                }
                if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                    org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                    if (z10 && n2VarR != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2VarR.getContext(), 0, c6Var);
                        String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.N = string;
                        b2Var.P = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                        i0.a.C(R.string.OK, alertDialog$Builder, null);
                    }
                    dVar.accept(Boolean.FALSE);
                    return;
                }
                if (!tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                    mc mcVarX = mc.X();
                    if (mcVarX != null) {
                        mcVarX.d0(tL_error, false);
                    }
                    dVar.accept(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2VarR2 = LaunchActivity.R();
                if (z10 && n2VarR2 != null) {
                    n2VarR2.showDialog(new ag.g2(n2VarR2, 14, true));
                }
                dVar.accept(Boolean.FALSE);
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((tf) obj4).f32761a;
                if (editTextBoldCursor == null) {
                    return;
                }
                int selectionEnd = editTextBoldCursor.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                try {
                    try {
                        chatActivityEnterView.N2 = 2;
                        if (str2 == null) {
                            str2 = "😀";
                        }
                        SpannableString spannableString = new SpannableString(str2);
                        org.telegram.ui.Components.t5 t5Var = document != null ? new org.telegram.ui.Components.t5(document, editTextBoldCursor.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.t5(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                        if (!z10) {
                            t5Var.fromEmojiKeyboard = true;
                        }
                        t5Var.cacheType = org.telegram.ui.Components.k5.g();
                        spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
                        editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                        editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        break;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        break;
                    }
                    return;
                } finally {
                    chatActivityEnterView.N2 = 0;
                }
            case 4:
                s50.z((s50) obj4, (org.telegram.ui.ActionBar.b2[]) obj2, this.f9429c, (TLRPC.TL_error) obj3, this.f9428b, (TL_phone.inviteToGroupCall) obj);
                return;
            default:
                dz0 dz0Var = (dz0) obj4;
                ProfileActivity profileActivity = dz0Var.f37574b;
                dq dqVar = new dq(profileActivity.f35923a1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                dqVar.T0 = new cz0(dz0Var, (gy) obj);
                profileActivity.presentFragment(dqVar);
                return;
        }
    }

    public i(jh.e4 e4Var, MessagesController messagesController, long j10, boolean z10, String str, TLObject tLObject) {
        this.f9430e = e4Var;
        this.f9431f = messagesController;
        this.f9428b = j10;
        this.f9429c = z10;
        this.h = str;
        this.d = tLObject;
    }

    public i(jh.s6 s6Var, TLRPC.TL_error tL_error, boolean z10, long j10, d5.d dVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f9430e = s6Var;
        this.f9431f = tL_error;
        this.f9429c = z10;
        this.f9428b = j10;
        this.d = dVar;
        this.h = c6Var;
    }

    public i(tf tfVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.f9430e = tfVar;
        this.f9431f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.f9428b = j10;
        this.f9429c = z10;
    }

    public i(s50 s50Var, org.telegram.ui.ActionBar.b2[] b2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.f9430e = s50Var;
        this.d = b2VarArr;
        this.f9429c = z10;
        this.f9431f = tL_error;
        this.f9428b = j10;
        this.h = invitetogroupcall;
    }

    public i(dz0 dz0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, gy gyVar) {
        this.f9430e = dz0Var;
        this.f9428b = j10;
        this.f9431f = tL_chatAdminRights;
        this.d = str;
        this.f9429c = z10;
        this.h = gyVar;
    }
}
