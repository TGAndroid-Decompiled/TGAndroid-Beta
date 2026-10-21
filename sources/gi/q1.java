package gi;

import ai.hb;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.e6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.r21;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.cy;
import org.telegram.ui.re1;
import org.telegram.ui.vx;
import w7.z5;
public final class q1 implements vx, org.telegram.ui.ActionBar.a2, mi.n, ResultCallback {
    public final int f11391a;
    public final int f11392b;
    public final long f11393c;
    public final Object d;
    public final Object e;

    public q1(int i10, long j10, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f11391a = 1;
        this.f11392b = i10;
        this.f11393c = j10;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(cy cyVar) {
        return false;
    }

    @Override
    public void a(mi.q qVar) {
        boolean z10;
        mi.j jVar = (mi.j) this.d;
        long j10 = this.f11393c;
        mi.g gVar = (mi.g) this.e;
        int i10 = this.f11392b;
        synchronized (mi.k.d) {
            try {
                Spannable spannable = (Spannable) jVar.f16959a.get();
                if (spannable != null && jVar.f16960b.get(Long.valueOf(j10)) == gVar) {
                    if ((spannable instanceof mi.e) && !((mi.e) spannable).f16949a) {
                        mi.k.a(spannable, i10, (com.google.android.gms.internal.play_billing.s0) qVar.f16973b);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AndroidUtilities.runOnUIThread(new mi.a(jVar, j10, gVar, i10, z10, qVar));
                }
            } finally {
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.f11391a;
        Object obj = this.e;
        int i12 = this.f11392b;
        long j10 = this.f11393c;
        Object obj2 = this.d;
        switch (i11) {
            case 1:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(j10);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new k2(i12, 0), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
                MediaDataController.getInstance(i12).uninstallShortcut(j10, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                EditText editText = (EditText) obj2;
                EditText editText2 = (EditText) obj;
                if (editText.getText() != null) {
                    if (j10 > 0) {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                        String obj3 = editText.getText().toString();
                        String obj4 = editText2.getText().toString();
                        String str = user.first_name;
                        String str2 = user.last_name;
                        if (str == null) {
                            str = "";
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str.equals(obj3) && str2.equals(obj4)) {
                            b2Var.dismiss();
                            return;
                        }
                        TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                        updateprofile.flags = 3;
                        updateprofile.first_name = obj3;
                        user.first_name = obj3;
                        updateprofile.last_name = obj4;
                        user.last_name = obj4;
                        TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(UserConfig.getInstance(i12).getClientUserId()));
                        if (user2 != null) {
                            user2.first_name = updateprofile.first_name;
                            user2.last_name = updateprofile.last_name;
                        }
                        UserConfig.getInstance(i12).saveConfig(true);
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                        ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new e6(12));
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                    } else {
                        long j11 = -j10;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j11));
                        String obj5 = editText.getText().toString();
                        String str3 = chat.title;
                        if (str3 != null && str3.equals(obj5)) {
                            b2Var.dismiss();
                            return;
                        }
                        chat.title = obj5;
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
                        MessagesController.getInstance(i12).changeChatTitle(j11, obj5);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                    }
                    b2Var.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        int i10;
        r21 r21Var = (r21) this.d;
        vp vpVar = (vp) this.e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f11393c) {
            Drawable drawable = vpVar.f31851b;
            if (drawable instanceof wc0) {
                wc0 wc0Var = (wc0) drawable;
                if (this.f11392b >= 0) {
                    i10 = 100;
                } else {
                    i10 = -100;
                }
                wc0Var.s(r21.e((Bitmap) pair.second), i10);
                wc0Var.t(r21Var.L);
            }
            r21Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public boolean w(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, re1 re1Var) {
        int i12;
        String str;
        String str2;
        boolean z12;
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.User user2;
        int i13;
        int i14;
        int i15;
        cy cyVar2 = (cy) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Activity parentActivity = cyVar2.getParentActivity();
        final int i16 = this.f11392b;
        r1 r1Var = new r1(re1Var, cyVar2, j10, i16);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i16);
        final long j11 = this.f11393c;
        messagesController.getUser(Long.valueOf(j11));
        int i17 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i17 >= 0) {
            TLRPC.User user3 = MessagesController.getInstance(i16).getUser(Long.valueOf(j10));
            str2 = UserObject.getForcedFirstName(user3);
            i12 = i17;
            if (user3.bot_verification_icon == botVerifierSettings.icon) {
                v1.a(parentActivity, i16, j11, j10, botVerifierSettings, r1Var);
                return true;
            }
            r1Var = r1Var;
            z12 = true;
            chat = null;
            user = user3;
            user2 = user3;
        } else {
            i12 = i17;
            TLRPC.Chat chat2 = MessagesController.getInstance(i16).getChat(Long.valueOf(-j10));
            if (chat2 == null) {
                str = "";
            } else {
                str = chat2.title;
            }
            str2 = str;
            z12 = true;
            if (chat2.bot_verification_icon == botVerifierSettings.icon) {
                v1.a(parentActivity, i16, j11, j10, botVerifierSettings, r1Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = chat2;
            user2 = chat2;
        }
        boolean z13 = z12;
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(z13 ? 1 : 0, parentActivity, (d6) null, z13);
        f3Var.fixNavigationBar();
        LinearLayout e = org.telegram.messenger.g0.e(parentActivity, z13 ? 1 : 0);
        TLRPC.User user4 = user;
        TLRPC.Chat chat3 = chat;
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setBackground(h6.d0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), h6.x0(null, h6.f20983ci, false)));
        w9 w9Var = new w9(parentActivity);
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        h9 h9Var = new h9((d6) null);
        h9Var.p(user2);
        w9Var.e(user2, h9Var);
        frameLayout.addView(w9Var, z5.e(28, 28, 51));
        w9 w9Var2 = new w9(parentActivity);
        w9Var2.setEmojiColorFilter(new PorterDuffColorFilter(h6.x0(null, h6.f21398z9, false), PorterDuff.Mode.SRC_IN));
        final r1 r1Var2 = r1Var;
        w9Var2.setAnimatedEmojiDrawable(r5.n(i16, botVerifierSettings.icon, null, 3));
        frameLayout.addView(w9Var2, z5.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        j5 j5Var = new j5(parentActivity);
        j5Var.setTextColor(h6.x0(null, h6.f21096j5, false));
        j5Var.setTextSize(13);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(str2, false);
        j5Var.setWidthWrapContent(true);
        frameLayout.addView(j5Var, z5.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        e.addView(frameLayout, z5.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i18 = h6.G6;
        textView.setTextColor(h6.x0(null, i18, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (UserObject.isBot(user4)) {
            textView.setText(LocaleController.getString(R.string.BotVerifyBotTitle));
        } else if (user4 != null) {
            textView.setText(LocaleController.getString(R.string.BotVerifyUserTitle));
        } else if (ChatObject.isChannelAndNotMegaGroup(chat3)) {
            textView.setText(LocaleController.getString(R.string.BotVerifyChannelTitle));
        } else {
            textView.setText(LocaleController.getString(R.string.BotVerifyGroupTitle));
        }
        textView.setTypeface(AndroidUtilities.bold());
        e.addView(textView, z5.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(h6.x0(null, i18, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, str2)), textView2.getPaint().getFontMetricsInt(), false));
        e.addView(textView2, z5.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i19 = MessagesController.getInstance(i16).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final sd0 sd0Var = new sd0(parentActivity, null);
        sd0Var.setForceForceUseCenter(true);
        sd0Var.setText(LocaleController.getString(R.string.BotVerifyDescription));
        sd0Var.setLeftPadding(AndroidUtilities.dp(2.0f));
        editTextBoldCursor.setTextColor(h6.x0(null, i18, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(h6.x0(null, h6.f21314uf, false));
        editTextBoldCursor.setHandlesColor(h6.x0(null, h6.f21332vf, false));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        editTextBoldCursor.setGravity(i13);
        editTextBoldCursor.setOnFocusChangeListener(new hb(sd0Var, editTextBoldCursor, 1));
        sd0Var.e(editTextBoldCursor);
        sd0Var.addView(editTextBoldCursor, z5.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        e.addView(sd0Var, z5.n(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.h3());
        editTextBoldCursor.addTextChangedListener(new u1(editTextBoldCursor, i19, sd0Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            sd0Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextColor(h6.x0(null, h6.B6, false));
            textView3.setTextSize(1, 12.0f);
            if (i12 >= 0) {
                i15 = R.string.BotVerifyDescriptionInfo;
            } else {
                i15 = R.string.BotVerifyDescriptionInfoChat;
            }
            textView3.setPadding(org.telegram.ui.Cells.c1.e(14.0f, i15, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i14 = -1;
            e.addView(textView3, z5.c(-2.0f, -1));
        } else {
            i14 = -1;
            e.addView(new View(parentActivity), z5.c(12.0f, -1));
        }
        final ei.d dVar = new ei.d(parentActivity, null, true);
        dVar.g(textView.getText(), false, true);
        e.addView(dVar, z5.n(i14, 48));
        f3Var.customView = e;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ei.d dVar2 = ei.d.this;
                if (dVar2.N) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z14 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z14 && editTextBoldCursor2.getText().length() > i19) {
                    sd0 sd0Var2 = sd0Var;
                    sd0Var2.a(1.0f);
                    AndroidUtilities.shakeViewSpring(sd0Var2, -6.0f);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i20 = i16;
                setcustomverification.bot = MessagesController.getInstance(i20).getInputUser(j11);
                setcustomverification.peer = MessagesController.getInstance(i20).getInputPeer(j10);
                if (botVerifierSettings2.can_modify_custom_description) {
                    String obj = editTextBoldCursor2.getText().toString();
                    if (!TextUtils.isEmpty(obj)) {
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        setcustomverification.custom_description = tL_textWithEntities2;
                        tL_textWithEntities2.text = obj;
                    }
                } else {
                    setcustomverification.custom_description = botVerifierSettings2.custom_description;
                }
                ConnectionsManager.getInstance(i20).sendRequest(setcustomverification, new ai.j2(dVar2, f3Var, r1Var2, 7));
            }
        });
        f3Var.smoothKeyboardAnimationEnabled = true;
        f3Var.smoothKeyboardByBottom = true;
        f3Var.show();
        return true;
    }

    public q1(EditText editText, long j10, int i10, EditText editText2) {
        this.f11391a = 3;
        this.d = editText;
        this.f11393c = j10;
        this.f11392b = i10;
        this.e = editText2;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public q1(Object obj, long j10, Object obj2, int i10, int i11) {
        this.f11391a = i11;
        this.d = obj;
        this.f11393c = j10;
        this.e = obj2;
        this.f11392b = i10;
    }

    public q1(cy cyVar, int i10, long j10, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.f11391a = 0;
        this.d = cyVar;
        this.f11392b = i10;
        this.f11393c = j10;
        this.e = botVerifierSettings;
    }
}
