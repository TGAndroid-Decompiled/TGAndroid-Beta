package jh;

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
import org.telegram.ui.Components.ag;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cz0;
import org.telegram.ui.dq;
import org.telegram.ui.dz0;
import org.telegram.ui.fy;
import org.telegram.ui.r50;
public final class i implements Runnable {
    public final int f12223a = 0;
    public final long f12224b;
    public final boolean f12225c;
    public final Object d;
    public final Object f12226e;
    public final Object f12227f;
    public final Object h;

    public i(q qVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.f12226e = qVar;
        this.f12227f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.f12225c = z10;
        this.f12224b = j10;
    }

    @Override
    public final void run() {
        SpannableStringBuilder replaceTags;
        org.telegram.ui.Components.y5 y5Var;
        int i10 = this.f12223a;
        long j10 = this.f12224b;
        boolean z10 = this.f12225c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f12227f;
        Object obj4 = this.f12226e;
        switch (i10) {
            case 0:
                q qVar = (q) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    qVar.h0(this.f12225c, this.f12224b, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                lh.d4 d4Var = (lh.d4) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                lh.s6 storiesController = messagesController.getStoriesController();
                final long j11 = this.f12224b;
                final boolean z11 = this.f12225c;
                storiesController.i0(j11, z11, false);
                oc.i iVar = new oc.i(4);
                iVar.f19483b = new Runnable() {
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
                iVar.f19484c = new Runnable() {
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
                mc V = new tc(d4Var.Z0, d4Var.f15539x0).V(Arrays.asList(tLObject2), replaceTags, null, iVar);
                V.f30645a = 2;
                V.k(true);
                return;
            case 2:
                lh.s6 s6Var = (lh.s6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                f5.d dVar = (f5.d) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            MessagesController messagesController2 = MessagesController.getInstance(s6Var.f16218a);
                            ChannelBoostsController boostsController = messagesController2.getBoostsController();
                            long j12 = this.f12224b;
                            boostsController.getBoostsStats(j12, new w1(s6Var, dVar, messagesController2, j12));
                            return;
                        }
                        dVar.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (z10 && R != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, c6Var);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                            c2Var.N = string;
                            c2Var.P = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            j7.l1.C(R.string.OK, alertDialog$Builder, null);
                        }
                        dVar.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                        if (z10 && R2 != null) {
                            R2.showDialog(new cg.p1(R2, 14, true));
                        }
                        dVar.accept(Boolean.FALSE);
                        return;
                    } else {
                        tc X = tc.X();
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
                ChatActivityEnterView chatActivityEnterView = ((ag) obj4).f26766a;
                if (editTextBoldCursor != null) {
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
                            if (document != null) {
                                y5Var = new org.telegram.ui.Components.y5(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                y5Var = new org.telegram.ui.Components.y5(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z10) {
                                y5Var.fromEmojiKeyboard = true;
                            }
                            y5Var.cacheType = org.telegram.ui.Components.p5.g();
                            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                            editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                            editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        chatActivityEnterView.N2 = 0;
                        return;
                    } catch (Throwable th2) {
                        chatActivityEnterView.N2 = 0;
                        throw th2;
                    }
                }
                return;
            case 4:
                r50.y((r50) obj4, (org.telegram.ui.ActionBar.c2[]) obj2, this.f12225c, (TLRPC.TL_error) obj3, this.f12224b, (TL_phone.inviteToGroupCall) obj);
                return;
            default:
                dz0 dz0Var = (dz0) obj4;
                ProfileActivity profileActivity = dz0Var.f37655b;
                dq dqVar = new dq(profileActivity.f35986a1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                dqVar.T0 = new cz0(dz0Var, (fy) obj);
                profileActivity.presentFragment(dqVar);
                return;
        }
    }

    public i(lh.d4 d4Var, MessagesController messagesController, long j10, boolean z10, String str, TLObject tLObject) {
        this.f12226e = d4Var;
        this.f12227f = messagesController;
        this.f12224b = j10;
        this.f12225c = z10;
        this.h = str;
        this.d = tLObject;
    }

    public i(lh.s6 s6Var, TLRPC.TL_error tL_error, boolean z10, long j10, f5.d dVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f12226e = s6Var;
        this.f12227f = tL_error;
        this.f12225c = z10;
        this.f12224b = j10;
        this.d = dVar;
        this.h = c6Var;
    }

    public i(ag agVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.f12226e = agVar;
        this.f12227f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.f12224b = j10;
        this.f12225c = z10;
    }

    public i(r50 r50Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.f12226e = r50Var;
        this.d = c2VarArr;
        this.f12225c = z10;
        this.f12227f = tL_error;
        this.f12224b = j10;
        this.h = invitetogroupcall;
    }

    public i(dz0 dz0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, fy fyVar) {
        this.f12226e = dz0Var;
        this.f12224b = j10;
        this.f12227f = tL_chatAdminRights;
        this.d = str;
        this.f12225c = z10;
        this.h = fyVar;
    }
}
