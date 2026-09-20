package ei;

import ai.t5;
import ai.t7;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.v9;
import org.telegram.ui.fg1;
import org.telegram.ui.oy;
import org.telegram.ui.uy;
import w7.y5;
public final class u1 implements oy, org.telegram.ui.ActionBar.a2, ResultCallback {
    public final int f8643a = 1;
    public final int f8644b;
    public final long f8645c;
    public final Object d;
    public final Object e;

    public u1(int i10, long j3, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f8644b = i10;
        this.f8645c = j3;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.f8643a;
        Object obj = this.e;
        int i12 = this.f8644b;
        long j3 = this.f8645c;
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
                        ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new t7(12));
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j3));
                    } else {
                        long j10 = -j3;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j10));
                        String obj5 = editText.getText().toString();
                        String str3 = chat.title;
                        if (str3 != null && str3.equals(obj5)) {
                            b2Var.dismiss();
                            return;
                        }
                        chat.title = obj5;
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
                        MessagesController.getInstance(i12).changeChatTitle(j10, obj5);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j3));
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
        i21 i21Var = (i21) this.d;
        lp lpVar = (lp) this.e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f8645c) {
            Drawable drawable = lpVar.f26220b;
            if (drawable instanceof kc0) {
                kc0 kc0Var = (kc0) drawable;
                if (this.f8644b >= 0) {
                    i10 = 100;
                } else {
                    i10 = -100;
                }
                kc0Var.t(i21.e((Bitmap) pair.second), i10);
                kc0Var.u(i21Var.L);
            }
            i21Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        Activity activity;
        String str;
        String str2;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.User user2;
        int i12;
        int i13;
        int i14;
        uy uyVar2 = (uy) this.d;
        final TL_bots.botVerifierSettings botverifiersettings = (TL_bots.botVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Activity parentActivity = uyVar2.getParentActivity();
        final int i15 = this.f8644b;
        v1 v1Var = new v1(fg1Var, uyVar2, j3, i15);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i15);
        final long j10 = this.f8645c;
        messagesController.getUser(Long.valueOf(j10));
        int i16 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i16 >= 0) {
            TLRPC.User user3 = MessagesController.getInstance(i15).getUser(Long.valueOf(j3));
            str2 = UserObject.getForcedFirstName(user3);
            if (user3.bot_verification_icon == botverifiersettings.icon) {
                a2.a(parentActivity, i15, j10, j3, botverifiersettings, v1Var);
                return true;
            }
            activity = parentActivity;
            user = user3;
            chat = null;
            user2 = user3;
        } else {
            activity = parentActivity;
            TLRPC.Chat chat2 = MessagesController.getInstance(i15).getChat(Long.valueOf(-j3));
            if (chat2 == null) {
                str = "";
            } else {
                str = chat2.title;
            }
            str2 = str;
            if (chat2.bot_verification_icon == botverifiersettings.icon) {
                a2.a(activity, i15, j10, j3, botverifiersettings, v1Var);
                return true;
            }
            v1Var = v1Var;
            chat = chat2;
            user = null;
            user2 = chat2;
        }
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, (f6) null, true);
        f3Var.fixNavigationBar();
        LinearLayout e = org.telegram.messenger.l0.e(activity, 1);
        TLRPC.User user4 = user;
        TLRPC.Chat chat3 = chat;
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(j6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), j6.w0(null, j6.f19087ci, false)));
        v9 v9Var = new v9(activity);
        v9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        g9 g9Var = new g9((f6) null);
        g9Var.p(user2);
        v9Var.e(user2, g9Var);
        frameLayout.addView(v9Var, y5.e(28, 28, 51));
        v9 v9Var2 = new v9(activity);
        v9Var2.setEmojiColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.f19499z9, false), PorterDuff.Mode.SRC_IN));
        final v1 v1Var2 = v1Var;
        v9Var2.setAnimatedEmojiDrawable(p5.n(i15, botverifiersettings.icon, null, 3));
        frameLayout.addView(v9Var2, y5.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        j5 j5Var = new j5(activity);
        j5Var.setTextColor(j6.w0(null, j6.f19201j5, false));
        j5Var.setTextSize(13);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(str2, false);
        j5Var.setWidthWrapContent(true);
        frameLayout.addView(j5Var, y5.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        e.addView(frameLayout, y5.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(activity);
        int i17 = j6.G6;
        textView.setTextColor(j6.w0(null, i17, false));
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
        e.addView(textView, y5.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(j6.w0(null, i17, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, str2)), textView2.getPaint().getFontMetricsInt(), false));
        e.addView(textView2, y5.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i18 = MessagesController.getInstance(i15).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        final hd0 hd0Var = new hd0(activity, null);
        hd0Var.setForceForceUseCenter(true);
        hd0Var.setText(LocaleController.getString(R.string.BotVerifyDescription));
        hd0Var.setLeftPadding(AndroidUtilities.dp(2.0f));
        editTextBoldCursor.setTextColor(j6.w0(null, i17, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(j6.w0(null, j6.f19416uf, false));
        editTextBoldCursor.setHandlesColor(j6.w0(null, j6.f19433vf, false));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        editTextBoldCursor.setGravity(i12);
        editTextBoldCursor.setOnFocusChangeListener(new w1(hd0Var, editTextBoldCursor, 0));
        hd0Var.e(editTextBoldCursor);
        hd0Var.addView(editTextBoldCursor, y5.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        e.addView(hd0Var, y5.n(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.j3());
        editTextBoldCursor.addTextChangedListener(new z1(editTextBoldCursor, i18, hd0Var));
        if (!TextUtils.isEmpty(botverifiersettings.custom_description)) {
            editTextBoldCursor.setText(botverifiersettings.custom_description);
            if (!botverifiersettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botverifiersettings.can_modify_custom_description) {
            hd0Var.setVisibility(8);
        }
        if (botverifiersettings.can_modify_custom_description) {
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(j6.w0(null, j6.B6, false));
            textView3.setTextSize(1, 12.0f);
            if (i16 >= 0) {
                i14 = R.string.BotVerifyDescriptionInfo;
            } else {
                i14 = R.string.BotVerifyDescriptionInfoChat;
            }
            textView3.setPadding(org.telegram.ui.Cells.c1.c(14.0f, i14, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i13 = -1;
            e.addView(textView3, y5.c(-2.0f, -1));
        } else {
            i13 = -1;
            e.addView(new View(activity), y5.c(12.0f, -1));
        }
        final ci.d dVar = new ci.d(activity, null, true);
        dVar.g(textView.getText(), false, true);
        e.addView(dVar, y5.n(i13, 48));
        f3Var.customView = e;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ci.d dVar2 = ci.d.this;
                if (dVar2.N) {
                    return;
                }
                TL_bots.botVerifierSettings botverifiersettings2 = botverifiersettings;
                boolean z12 = botverifiersettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z12 && editTextBoldCursor2.getText().length() > i18) {
                    hd0 hd0Var2 = hd0Var;
                    hd0Var2.a(1.0f);
                    AndroidUtilities.shakeViewSpring(hd0Var2, -6.0f);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i19 = i15;
                setcustomverification.bot = MessagesController.getInstance(i19).getInputUser(j10);
                setcustomverification.peer = MessagesController.getInstance(i19).getInputPeer(j3);
                if (botverifiersettings2.can_modify_custom_description) {
                    setcustomverification.custom_description = editTextBoldCursor2.getText().toString();
                } else {
                    setcustomverification.custom_description = botverifiersettings2.custom_description;
                }
                if (!TextUtils.isEmpty(setcustomverification.custom_description)) {
                    setcustomverification.flags |= 4;
                }
                ConnectionsManager.getInstance(i19).sendRequest(setcustomverification, new t5(dVar2, f3Var, v1Var2, 2));
            }
        });
        f3Var.smoothKeyboardAnimationEnabled = true;
        f3Var.smoothKeyboardByBottom = true;
        f3Var.show();
        return true;
    }

    public u1(EditText editText, long j3, int i10, EditText editText2) {
        this.d = editText;
        this.f8645c = j3;
        this.f8644b = i10;
        this.e = editText2;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    public u1(i21 i21Var, long j3, lp lpVar, int i10) {
        this.d = i21Var;
        this.f8645c = j3;
        this.e = lpVar;
        this.f8644b = i10;
    }

    public u1(uy uyVar, int i10, long j3, TL_bots.botVerifierSettings botverifiersettings) {
        this.d = uyVar;
        this.f8644b = i10;
        this.f8645c = j3;
        this.e = botverifiersettings;
    }
}
