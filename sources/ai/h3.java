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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.i01;
import org.telegram.ui.j01;
import org.telegram.ui.k60;
import org.telegram.ui.pq;
import org.telegram.ui.wy;
public final class h3 implements Runnable {
    public final int f939a = 0;
    public final boolean f940b;
    public final long f941c;
    public final Object d;
    public final Object e;
    public final Object f942f;
    public final Object h;

    public h3(f6 f6Var, MessagesController messagesController, long j3, boolean z10, String str, TLObject tLObject) {
        this.d = f6Var;
        this.e = messagesController;
        this.f941c = j3;
        this.f940b = z10;
        this.f942f = str;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        SpannableStringBuilder replaceTags;
        org.telegram.ui.Components.x5 x5Var;
        int i10 = this.f939a;
        long j3 = this.f941c;
        boolean z10 = this.f940b;
        Object obj = this.f942f;
        Object obj2 = this.h;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                f6 f6Var = (f6) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject = (TLObject) obj2;
                l9 storiesController = messagesController.getStoriesController();
                final long j10 = this.f941c;
                final boolean z11 = this.f940b;
                storiesController.i0(j10, z11, false);
                o0.a aVar = new o0.a(3, (byte) 0);
                aVar.f15310b = new Runnable() {
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
                aVar.f15311c = new Runnable() {
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
                org.telegram.ui.Components.oc V = new vc(f6Var.f807d1, f6Var.B0).V(Arrays.asList(tLObject), replaceTags, null, aVar);
                V.f26699a = 2;
                V.k(true);
                return;
            case 1:
                l9 l9Var = (l9) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                e2.h hVar = (e2.h) obj;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj2;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            MessagesController messagesController2 = MessagesController.getInstance(l9Var.f1193a);
                            ChannelBoostsController boostsController = messagesController2.getBoostsController();
                            long j11 = this.f941c;
                            boostsController.getBoostsStats(j11, new l(l9Var, hVar, messagesController2, j11, 1));
                            return;
                        }
                        hVar.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (z10 && R != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                            c2Var.R = string;
                            c2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            hg.k0.A(R.string.OK, alertDialog$Builder, null);
                        }
                        hVar.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                        if (z10 && R2 != null) {
                            R2.showDialog(new rg.x0(R2, 14, true));
                        }
                        hVar.accept(Boolean.FALSE);
                        return;
                    } else {
                        vc X = vc.X();
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
                ChatActivityEnterView chatActivityEnterView = ((fg) obj4).f23911a;
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
                                x5Var = new org.telegram.ui.Components.x5(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                x5Var = new org.telegram.ui.Components.x5(j3, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z10) {
                                x5Var.fromEmojiKeyboard = true;
                            }
                            x5Var.cacheType = org.telegram.ui.Components.o5.g();
                            spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
                            editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                            editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e) {
                            FileLog.e(e);
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
                k60.y((k60) obj4, (org.telegram.ui.ActionBar.c2[]) obj3, this.f940b, (TLRPC.TL_error) obj, this.f941c, (TL_phone.inviteToGroupCall) obj2);
                return;
            case 4:
                j01 j01Var = (j01) obj4;
                ProfileActivity profileActivity = j01Var.f34748b;
                pq pqVar = new pq(profileActivity.f31286e1, -j3, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj, 2, true, !z10, null);
                pqVar.X0 = new i01(j01Var, (wy) obj2);
                profileActivity.presentFragment(pqVar);
                return;
            default:
                yh.g gVar = (yh.g) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    gVar.h0(this.f940b, this.f941c, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
        }
    }

    public h3(l9 l9Var, TLRPC.TL_error tL_error, boolean z10, long j3, e2.h hVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = l9Var;
        this.e = tL_error;
        this.f940b = z10;
        this.f941c = j3;
        this.f942f = hVar;
        this.h = f6Var;
    }

    public h3(fg fgVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j3, boolean z10) {
        this.d = fgVar;
        this.e = editTextBoldCursor;
        this.f942f = str;
        this.h = document;
        this.f941c = j3;
        this.f940b = z10;
    }

    public h3(k60 k60Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = k60Var;
        this.e = c2VarArr;
        this.f940b = z10;
        this.f942f = tL_error;
        this.f941c = j3;
        this.h = invitetogroupcall;
    }

    public h3(j01 j01Var, long j3, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, wy wyVar) {
        this.d = j01Var;
        this.f941c = j3;
        this.e = tL_chatAdminRights;
        this.f942f = str;
        this.f940b = z10;
        this.h = wyVar;
    }

    public h3(yh.g gVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = gVar;
        this.e = tL_error;
        this.h = tLObject;
        this.f942f = twoStepVerificationActivity;
        this.f940b = z10;
        this.f941c = j3;
    }
}
