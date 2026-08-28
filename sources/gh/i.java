package gh;

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
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.xf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bq;
import org.telegram.ui.cz0;
import org.telegram.ui.dy;
import org.telegram.ui.dz0;
import org.telegram.ui.o50;
public final class i implements Runnable {
    public final int f8263a = 0;
    public final long f8264b;
    public final boolean f8265c;
    public final Object d;
    public final Object f8266e;
    public final Object f8267f;
    public final Object h;

    public i(r rVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.f8266e = rVar;
        this.f8267f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.f8265c = z10;
        this.f8264b = j10;
    }

    @Override
    public final void run() {
        SpannableStringBuilder replaceTags;
        org.telegram.ui.Components.t5 t5Var;
        int i9 = this.f8263a;
        long j10 = this.f8264b;
        boolean z10 = this.f8265c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f8267f;
        Object obj4 = this.f8266e;
        switch (i9) {
            case 0:
                r rVar = (r) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.l0(password);
                    rVar.g0(this.f8265c, this.f8264b, twoStepVerificationActivity.k0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                ih.i4 i4Var = (ih.i4) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                ih.v6 storiesController = messagesController.getStoriesController();
                final long j11 = this.f8264b;
                final boolean z11 = this.f8265c;
                storiesController.i0(j11, z11, false);
                org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(1);
                e3Var.f24286b = new Runnable() {
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
                e3Var.f24287c = new Runnable() {
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
                gc V = new oc(i4Var.Z0, i4Var.f11603x0).V(Arrays.asList(tLObject2), replaceTags, null, e3Var);
                V.f28730a = 2;
                V.k(true);
                return;
            case 2:
                ih.v6 v6Var = (ih.v6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                d5.d dVar = (d5.d) obj2;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            MessagesController messagesController2 = MessagesController.getInstance(v6Var.f12236a);
                            ChannelBoostsController boostsController = messagesController2.getBoostsController();
                            long j12 = this.f8264b;
                            boostsController.getBoostsStats(j12, new y1(v6Var, dVar, messagesController2, j12));
                            return;
                        }
                        dVar.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (z10 && R != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, b6Var);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                            c2Var.N = string;
                            c2Var.P = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                        }
                        dVar.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                        if (z10 && R2 != null) {
                            R2.showDialog(new zf.x0(R2, 14, true));
                        }
                        dVar.accept(Boolean.FALSE);
                        return;
                    } else {
                        oc X = oc.X();
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
                ChatActivityEnterView chatActivityEnterView = ((xf) obj4).f34670a;
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
                                t5Var = new org.telegram.ui.Components.t5(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                t5Var = new org.telegram.ui.Components.t5(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z10) {
                                t5Var.fromEmojiKeyboard = true;
                            }
                            t5Var.cacheType = org.telegram.ui.Components.k5.g();
                            spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
                            editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                            editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        chatActivityEnterView.N2 = 0;
                        return;
                    } catch (Throwable th) {
                        chatActivityEnterView.N2 = 0;
                        throw th;
                    }
                }
                return;
            case 4:
                o50.y((o50) obj4, (org.telegram.ui.ActionBar.c2[]) obj2, this.f8265c, (TLRPC.TL_error) obj3, this.f8264b, (TL_phone.inviteToGroupCall) obj);
                return;
            default:
                dz0 dz0Var = (dz0) obj4;
                ProfileActivity profileActivity = dz0Var.f37761b;
                bq bqVar = new bq(profileActivity.f35920a1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                bqVar.T0 = new cz0(dz0Var, (dy) obj);
                profileActivity.presentFragment(bqVar);
                return;
        }
    }

    public i(ih.i4 i4Var, MessagesController messagesController, long j10, boolean z10, String str, TLObject tLObject) {
        this.f8266e = i4Var;
        this.f8267f = messagesController;
        this.f8264b = j10;
        this.f8265c = z10;
        this.h = str;
        this.d = tLObject;
    }

    public i(ih.v6 v6Var, TLRPC.TL_error tL_error, boolean z10, long j10, d5.d dVar, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f8266e = v6Var;
        this.f8267f = tL_error;
        this.f8265c = z10;
        this.f8264b = j10;
        this.d = dVar;
        this.h = b6Var;
    }

    public i(xf xfVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.f8266e = xfVar;
        this.f8267f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.f8264b = j10;
        this.f8265c = z10;
    }

    public i(o50 o50Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.f8266e = o50Var;
        this.d = c2VarArr;
        this.f8265c = z10;
        this.f8267f = tL_error;
        this.f8264b = j10;
        this.h = invitetogroupcall;
    }

    public i(dz0 dz0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, dy dyVar) {
        this.f8266e = dz0Var;
        this.f8264b = j10;
        this.f8267f = tL_chatAdminRights;
        this.d = str;
        this.f8265c = z10;
        this.h = dyVar;
    }
}
