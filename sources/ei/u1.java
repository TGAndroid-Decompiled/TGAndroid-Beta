package ei;

import ai.t5;
import ai.v7;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f31;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.y9;
import org.telegram.ui.hg1;
import org.telegram.ui.py;
import org.telegram.ui.vy;
import w7.w5;
public final class u1 implements py, org.telegram.ui.ActionBar.z1, ki.n, ResultCallback {
    public final int f9386a;
    public final int f9387b;
    public final long f9388c;
    public final Object d;
    public final Object f9389e;

    public u1(int i10, long j3, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f9386a = 1;
        this.f9387b = i10;
        this.f9388c = j3;
        this.d = tL_attachMenuBot;
        this.f9389e = runnable;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean K(vy vyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11 = this.f9386a;
        Object obj = this.f9389e;
        int i12 = this.f9387b;
        long j3 = this.f9388c;
        Object obj2 = this.d;
        switch (i11) {
            case 1:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(j3);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new q2(i12, 0), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
                MediaDataController.getInstance(i12).uninstallShortcut(j3, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                EditText editText = (EditText) obj2;
                EditText editText2 = (EditText) obj;
                if (editText.getText() != null) {
                    if (j3 > 0) {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j3));
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
                            a2Var.dismiss();
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
                        ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new v7(12));
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j3));
                    } else {
                        long j10 = -j3;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j10));
                        String obj5 = editText.getText().toString();
                        String str3 = chat.title;
                        if (str3 != null && str3.equals(obj5)) {
                            a2Var.dismiss();
                            return;
                        }
                        chat.title = obj5;
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
                        MessagesController.getInstance(i12).changeChatTitle(j10, obj5);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j3));
                    }
                    a2Var.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void k(n4.y yVar) {
        boolean z10;
        ki.j jVar = (ki.j) this.d;
        long j3 = this.f9388c;
        ki.g gVar = (ki.g) this.f9389e;
        int i10 = this.f9387b;
        synchronized (ki.k.d) {
            try {
                Spannable spannable = (Spannable) jVar.f14891a.get();
                if (spannable != null && jVar.f14892b.get(Long.valueOf(j3)) == gVar) {
                    if ((spannable instanceof ki.e) && !((ki.e) spannable).f14881a) {
                        ki.k.a(spannable, i10, (com.google.android.gms.internal.play_billing.s0) yVar.f16363b);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AndroidUtilities.runOnUIThread(new ki.a(jVar, j3, gVar, i10, z10, yVar));
                }
            } finally {
            }
        }
    }

    @Override
    public void onComplete(Object obj) {
        int i10;
        f31 f31Var = (f31) this.d;
        dq dqVar = (dq) this.f9389e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f9388c) {
            Drawable drawable = dqVar.f25450b;
            if (drawable instanceof gd0) {
                gd0 gd0Var = (gd0) drawable;
                if (this.f9387b >= 0) {
                    i10 = 100;
                } else {
                    i10 = -100;
                }
                gd0Var.t(f31.e((Bitmap) pair.second), i10);
                gd0Var.u(f31Var.L);
            }
            f31Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.m.a(this, th2);
    }

    @Override
    public boolean w(vy vyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, hg1 hg1Var) {
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
        vy vyVar2 = (vy) this.d;
        final TL_bots.botVerifierSettings botverifiersettings = (TL_bots.botVerifierSettings) this.f9389e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Activity parentActivity = vyVar2.getParentActivity();
        final int i16 = this.f9387b;
        v1 v1Var = new v1(hg1Var, vyVar2, j3, i16);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i16);
        final long j10 = this.f9388c;
        messagesController.getUser(Long.valueOf(j10));
        int i17 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i17 >= 0) {
            TLRPC.User user3 = MessagesController.getInstance(i16).getUser(Long.valueOf(j3));
            str2 = UserObject.getForcedFirstName(user3);
            i12 = i17;
            if (user3.bot_verification_icon == botverifiersettings.icon) {
                a2.a(parentActivity, i16, j10, j3, botverifiersettings, v1Var);
                return true;
            }
            v1Var = v1Var;
            z12 = true;
            chat = null;
            user = user3;
            user2 = user3;
        } else {
            i12 = i17;
            TLRPC.Chat chat2 = MessagesController.getInstance(i16).getChat(Long.valueOf(-j3));
            if (chat2 == null) {
                str = "";
            } else {
                str = chat2.title;
            }
            str2 = str;
            z12 = true;
            if (chat2.bot_verification_icon == botverifiersettings.icon) {
                a2.a(parentActivity, i16, j10, j3, botverifiersettings, v1Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = chat2;
            user2 = chat2;
        }
        boolean z13 = z12;
        final org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(z13 ? 1 : 0, parentActivity, (c6) null, z13);
        e3Var.fixNavigationBar();
        LinearLayout f7 = org.telegram.messenger.v0.f(parentActivity, z13 ? 1 : 0);
        TLRPC.User user4 = user;
        TLRPC.Chat chat3 = chat;
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setBackground(h6.d0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), h6.x0(null, h6.f20553ci, false)));
        y9 y9Var = new y9(parentActivity);
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        j9 j9Var = new j9((c6) null);
        j9Var.p(user2);
        y9Var.e(user2, j9Var);
        frameLayout.addView(y9Var, w5.e(28, 28, 51));
        y9 y9Var2 = new y9(parentActivity);
        y9Var2.setEmojiColorFilter(new PorterDuffColorFilter(h6.x0(null, h6.f20967z9, false), PorterDuff.Mode.SRC_IN));
        final v1 v1Var2 = v1Var;
        y9Var2.setAnimatedEmojiDrawable(s5.n(i16, botverifiersettings.icon, null, 3));
        frameLayout.addView(y9Var2, w5.a(20.0f, 34.0f, 0.0f, 0.0f, 0.0f, 20, 19));
        h5 h5Var = new h5(parentActivity);
        h5Var.setTextColor(h6.x0(null, h6.f20668j5, false));
        h5Var.setTextSize(13);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(str2, false);
        h5Var.setWidthWrapContent(true);
        frameLayout.addView(h5Var, w5.a(-2.0f, 57.0f, 0.0f, 10.0f, 0.0f, -2, 19));
        f7.addView(frameLayout, w5.t(-2, -2, 1, 16, 0, 16, 0));
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
        f7.addView(textView, w5.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(h6.x0(null, i18, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, str2)), textView2.getPaint().getFontMetricsInt(), false));
        f7.addView(textView2, w5.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i19 = MessagesController.getInstance(i16).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final de0 de0Var = new de0(parentActivity, null);
        de0Var.setForceForceUseCenter(true);
        de0Var.setText(LocaleController.getString(R.string.BotVerifyDescription));
        de0Var.setLeftPadding(AndroidUtilities.dp(2.0f));
        editTextBoldCursor.setTextColor(h6.x0(null, i18, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(h6.x0(null, h6.f20884uf, false));
        editTextBoldCursor.setHandlesColor(h6.x0(null, h6.f20901vf, false));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        editTextBoldCursor.setGravity(i13);
        editTextBoldCursor.setOnFocusChangeListener(new w1(de0Var, editTextBoldCursor, 0));
        de0Var.e(editTextBoldCursor);
        de0Var.addView(editTextBoldCursor, w5.a(-2.0f, 12.0f, 4.0f, 12.0f, 4.0f, -1, 48));
        f7.addView(de0Var, w5.n(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.i3());
        editTextBoldCursor.addTextChangedListener(new z1(editTextBoldCursor, i19, de0Var));
        if (!TextUtils.isEmpty(botverifiersettings.custom_description)) {
            editTextBoldCursor.setText(botverifiersettings.custom_description);
            if (!botverifiersettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botverifiersettings.can_modify_custom_description) {
            de0Var.setVisibility(8);
        }
        if (botverifiersettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextColor(h6.x0(null, h6.B6, false));
            textView3.setTextSize(1, 12.0f);
            if (i12 >= 0) {
                i15 = R.string.BotVerifyDescriptionInfo;
            } else {
                i15 = R.string.BotVerifyDescriptionInfoChat;
            }
            textView3.setPadding(org.telegram.ui.Cells.c1.b(14.0f, i15, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i14 = -1;
            f7.addView(textView3, w5.d(-2.0f, -1));
        } else {
            i14 = -1;
            f7.addView(new View(parentActivity), w5.d(12.0f, -1));
        }
        final ci.d dVar = new ci.d(parentActivity, null, true);
        dVar.g(textView.getText(), false, true);
        f7.addView(dVar, w5.n(i14, 48));
        e3Var.customView = f7;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ci.d dVar2 = ci.d.this;
                if (dVar2.N) {
                    return;
                }
                TL_bots.botVerifierSettings botverifiersettings2 = botverifiersettings;
                boolean z14 = botverifiersettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z14 && editTextBoldCursor2.getText().length() > i19) {
                    de0 de0Var2 = de0Var;
                    de0Var2.a(1.0f);
                    AndroidUtilities.shakeViewSpring(de0Var2, -6.0f);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i20 = i16;
                setcustomverification.bot = MessagesController.getInstance(i20).getInputUser(j10);
                setcustomverification.peer = MessagesController.getInstance(i20).getInputPeer(j3);
                if (botverifiersettings2.can_modify_custom_description) {
                    setcustomverification.custom_description = editTextBoldCursor2.getText().toString();
                } else {
                    setcustomverification.custom_description = botverifiersettings2.custom_description;
                }
                if (!TextUtils.isEmpty(setcustomverification.custom_description)) {
                    setcustomverification.flags |= 4;
                }
                ConnectionsManager.getInstance(i20).sendRequest(setcustomverification, new t5(dVar2, e3Var, v1Var2, 2));
            }
        });
        e3Var.smoothKeyboardAnimationEnabled = true;
        e3Var.smoothKeyboardByBottom = true;
        e3Var.show();
        return true;
    }

    public u1(EditText editText, long j3, int i10, EditText editText2) {
        this.f9386a = 3;
        this.d = editText;
        this.f9388c = j3;
        this.f9387b = i10;
        this.f9389e = editText2;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.m.b(this, tL_error);
    }

    public u1(Object obj, long j3, Object obj2, int i10, int i11) {
        this.f9386a = i11;
        this.d = obj;
        this.f9388c = j3;
        this.f9389e = obj2;
        this.f9387b = i10;
    }

    public u1(vy vyVar, int i10, long j3, TL_bots.botVerifierSettings botverifiersettings) {
        this.f9386a = 0;
        this.d = vyVar;
        this.f9387b = i10;
        this.f9388c = j3;
        this.f9389e = botverifiersettings;
    }
}
