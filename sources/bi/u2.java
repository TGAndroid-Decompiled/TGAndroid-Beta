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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.h01;
import org.telegram.ui.i01;
import org.telegram.ui.j60;
import org.telegram.ui.qq;
import org.telegram.ui.uy;
public final class u2 implements Runnable {
    public final int f3786a = 0;
    public final boolean f3787b;
    public final long f3788c;
    public final Object d;
    public final Object f3789e;
    public final Object f3790f;
    public final Object h;

    public u2(o5 o5Var, MessagesController messagesController, long j3, boolean z10, String str, TLObject tLObject) {
        this.d = o5Var;
        this.f3789e = messagesController;
        this.f3788c = j3;
        this.f3787b = z10;
        this.f3790f = str;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        SpannableStringBuilder replaceTags;
        org.telegram.ui.Components.z5 z5Var;
        int i10 = this.f3786a;
        long j3 = this.f3788c;
        boolean z10 = this.f3787b;
        Object obj = this.f3790f;
        Object obj2 = this.h;
        Object obj3 = this.f3789e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                o5 o5Var = (o5) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject = (TLObject) obj2;
                u8 storiesController = messagesController.getStoriesController();
                final long j10 = this.f3788c;
                final boolean z11 = this.f3787b;
                storiesController.i0(j10, z11, false);
                o0.a aVar = new o0.a(3, (byte) 0);
                aVar.f16769b = new Runnable() {
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
                aVar.f16770c = new Runnable() {
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
                qc V = new yc(o5Var.f3413d1, o5Var.B0).V(Arrays.asList(tLObject), replaceTags, null, aVar);
                V.f29672a = 2;
                V.k(true);
                return;
            case 1:
                u8 u8Var = (u8) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                e2.h hVar = (e2.h) obj;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            MessagesController messagesController2 = MessagesController.getInstance(u8Var.f3805a);
                            ChannelBoostsController boostsController = messagesController2.getBoostsController();
                            long j11 = this.f3788c;
                            boostsController.getBoostsStats(j11, new i(u8Var, hVar, messagesController2, j11, 1));
                            return;
                        }
                        hVar.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (z10 && R != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, f6Var);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                            b2Var.R = string;
                            b2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            i2.g.B(R.string.OK, alertDialog$Builder, null);
                        }
                        hVar.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                        if (z10 && R2 != null) {
                            R2.showDialog(new sg.a1(R2, 14, true));
                        }
                        hVar.accept(Boolean.FALSE);
                        return;
                    } else {
                        yc X = yc.X();
                        if (X != null) {
                            X.d0(tL_error, false);
                        }
                        hVar.accept(Boolean.FALSE);
                        return;
                    }
                }
                hVar.accept(Boolean.TRUE);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                ChatActivityEnterView chatActivityEnterView = ((hg) obj4).f26730a;
                if (editTextBoldCursor != null) {
                    int selectionEnd = editTextBoldCursor.getSelectionEnd();
                    if (selectionEnd < 0) {
                        selectionEnd = 0;
                    }
                    try {
                        try {
                            chatActivityEnterView.R2 = 2;
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
                        chatActivityEnterView.R2 = 0;
                        return;
                    } catch (Throwable th2) {
                        chatActivityEnterView.R2 = 0;
                        throw th2;
                    }
                }
                return;
            case 3:
                j60.y((j60) obj4, (org.telegram.ui.ActionBar.b2[]) obj3, this.f3787b, (TLRPC.TL_error) obj, this.f3788c, (TL_phone.inviteToGroupCall) obj2);
                return;
            case 4:
                i01 i01Var = (i01) obj4;
                ProfileActivity profileActivity = i01Var.f37149b;
                qq qqVar = new qq(profileActivity.f33888e1, -j3, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj, 2, true, !z10, null);
                qqVar.X0 = new h01(i01Var, (uy) obj2);
                profileActivity.presentFragment(qqVar);
                return;
            default:
                zh.g gVar = (zh.g) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    gVar.h0(this.f3787b, this.f3788c, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
        }
    }

    public u2(u8 u8Var, TLRPC.TL_error tL_error, boolean z10, long j3, e2.h hVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = u8Var;
        this.f3789e = tL_error;
        this.f3787b = z10;
        this.f3788c = j3;
        this.f3790f = hVar;
        this.h = f6Var;
    }

    public u2(hg hgVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j3, boolean z10) {
        this.d = hgVar;
        this.f3789e = editTextBoldCursor;
        this.f3790f = str;
        this.h = document;
        this.f3788c = j3;
        this.f3787b = z10;
    }

    public u2(j60 j60Var, org.telegram.ui.ActionBar.b2[] b2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = j60Var;
        this.f3789e = b2VarArr;
        this.f3787b = z10;
        this.f3790f = tL_error;
        this.f3788c = j3;
        this.h = invitetogroupcall;
    }

    public u2(i01 i01Var, long j3, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, uy uyVar) {
        this.d = i01Var;
        this.f3788c = j3;
        this.f3789e = tL_chatAdminRights;
        this.f3790f = str;
        this.f3787b = z10;
        this.h = uyVar;
    }

    public u2(zh.g gVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = gVar;
        this.f3789e = tL_error;
        this.h = tLObject;
        this.f3790f = twoStepVerificationActivity;
        this.f3787b = z10;
        this.f3788c = j3;
    }
}
