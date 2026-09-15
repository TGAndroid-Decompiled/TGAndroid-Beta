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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.dg1;
import org.telegram.ui.oy;
import org.telegram.ui.uy;
import w7.x5;
public final class u1 implements oy, org.telegram.ui.ActionBar.a2, ResultCallback {
    public final int f8638a = 1;
    public final int f8639b;
    public final long f8640c;
    public final Object d;
    public final Object e;

    public u1(int i10, long j3, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f8639b = i10;
        this.f8640c = j3;
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.f8638a;
        Object obj = this.e;
        int i12 = this.f8639b;
        long j3 = this.f8640c;
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
        u11 u11Var = (u11) this.d;
        lp lpVar = (lp) this.e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f8640c) {
            Drawable drawable = lpVar.f25995b;
            if (drawable instanceof cc0) {
                cc0 cc0Var = (cc0) drawable;
                if (this.f8639b >= 0) {
                    i10 = 100;
                } else {
                    i10 = -100;
                }
                cc0Var.t(u11.e((Bitmap) pair.second), i10);
                cc0Var.u(u11Var.L);
            }
            u11Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, dg1 dg1Var) {
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
        final int i15 = this.f8639b;
        v1 v1Var = new v1(dg1Var, uyVar2, j3, i15);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i15);
        final long j10 = this.f8640c;
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
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, (e6) null, true);
        f3Var.fixNavigationBar();
        LinearLayout f7 = org.telegram.messenger.w1.f(activity, 1);
        TLRPC.User user4 = user;
        TLRPC.Chat chat3 = chat;
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(i6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), i6.w0(null, i6.f18829ci, false)));
        u9 u9Var = new u9(activity);
        u9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        f9 f9Var = new f9((e6) null);
        f9Var.p(user2);
        u9Var.e(user2, f9Var);
        frameLayout.addView(u9Var, x5.e(28, 28, 51));
        u9 u9Var2 = new u9(activity);
        u9Var2.setEmojiColorFilter(new PorterDuffColorFilter(i6.w0(null, i6.f19240z9, false), PorterDuff.Mode.SRC_IN));
        final v1 v1Var2 = v1Var;
        u9Var2.setAnimatedEmojiDrawable(o5.n(i15, botverifiersettings.icon, null, 3));
        frameLayout.addView(u9Var2, x5.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        j5 j5Var = new j5(activity);
        j5Var.setTextColor(i6.w0(null, i6.f18943j5, false));
        j5Var.setTextSize(13);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(str2, false);
        j5Var.setWidthWrapContent(true);
        frameLayout.addView(j5Var, x5.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        f7.addView(frameLayout, x5.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(activity);
        int i17 = i6.G6;
        textView.setTextColor(i6.w0(null, i17, false));
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
        f7.addView(textView, x5.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(i6.w0(null, i17, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, str2)), textView2.getPaint().getFontMetricsInt(), false));
        f7.addView(textView2, x5.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i18 = MessagesController.getInstance(i15).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        final yc0 yc0Var = new yc0(activity, null);
        yc0Var.setForceForceUseCenter(true);
        yc0Var.setText(LocaleController.getString(R.string.BotVerifyDescription));
        yc0Var.setLeftPadding(AndroidUtilities.dp(2.0f));
        editTextBoldCursor.setTextColor(i6.w0(null, i17, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(i6.w0(null, i6.f19157uf, false));
        editTextBoldCursor.setHandlesColor(i6.w0(null, i6.f19174vf, false));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        editTextBoldCursor.setGravity(i12);
        editTextBoldCursor.setOnFocusChangeListener(new w1(yc0Var, editTextBoldCursor, 0));
        yc0Var.e(editTextBoldCursor);
        yc0Var.addView(editTextBoldCursor, x5.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        f7.addView(yc0Var, x5.n(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.h3());
        editTextBoldCursor.addTextChangedListener(new z1(editTextBoldCursor, i18, yc0Var));
        if (!TextUtils.isEmpty(botverifiersettings.custom_description)) {
            editTextBoldCursor.setText(botverifiersettings.custom_description);
            if (!botverifiersettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botverifiersettings.can_modify_custom_description) {
            yc0Var.setVisibility(8);
        }
        if (botverifiersettings.can_modify_custom_description) {
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(i6.w0(null, i6.B6, false));
            textView3.setTextSize(1, 12.0f);
            if (i16 >= 0) {
                i14 = R.string.BotVerifyDescriptionInfo;
            } else {
                i14 = R.string.BotVerifyDescriptionInfoChat;
            }
            textView3.setPadding(p6.b(14.0f, i14, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i13 = -1;
            f7.addView(textView3, x5.c(-2.0f, -1));
        } else {
            i13 = -1;
            f7.addView(new View(activity), x5.c(12.0f, -1));
        }
        final ci.d dVar = new ci.d(activity, null, true);
        dVar.g(textView.getText(), false, true);
        f7.addView(dVar, x5.n(i13, 48));
        f3Var.customView = f7;
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
                    yc0 yc0Var2 = yc0Var;
                    yc0Var2.a(1.0f);
                    AndroidUtilities.shakeViewSpring(yc0Var2, -6.0f);
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
        this.f8640c = j3;
        this.f8639b = i10;
        this.e = editText2;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    public u1(u11 u11Var, long j3, lp lpVar, int i10) {
        this.d = u11Var;
        this.f8640c = j3;
        this.e = lpVar;
        this.f8639b = i10;
    }

    public u1(uy uyVar, int i10, long j3, TL_bots.botVerifierSettings botverifiersettings) {
        this.d = uyVar;
        this.f8639b = i10;
        this.f8640c = j3;
        this.e = botverifiersettings;
    }
}
