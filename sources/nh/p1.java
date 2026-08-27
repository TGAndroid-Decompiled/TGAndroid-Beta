package nh;

import android.app.Activity;
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
import h7.z5;
import hh.p8;
import java.util.ArrayList;
import jh.m5;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.zo;
import org.telegram.ui.gy;
import org.telegram.ui.we1;
import org.telegram.ui.zx;

public final class p1 implements zx, org.telegram.ui.ActionBar.a2, ResultCallback {

    public final int f18867a = 1;

    public final int f18868b;

    public final long f18869c;
    public final Object d;

    public final Object f18870e;

    public p1(int i10, long j10, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f18868b = i10;
        this.f18869c = j10;
        this.d = tL_attachMenuBot;
        this.f18870e = runnable;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(gy gyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.f18867a;
        Object obj = this.f18870e;
        int i12 = this.f18868b;
        long j10 = this.f18869c;
        Object obj2 = this.d;
        int i13 = 0;
        switch (i11) {
            case 1:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(j10);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new j2(i12, i13), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
                MediaDataController.getInstance(i12).uninstallShortcut(j10, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                EditText editText = (EditText) obj2;
                EditText editText2 = (EditText) obj;
                if (editText.getText() != null) {
                    if (j10 <= 0) {
                        long j11 = -j10;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j11));
                        String string = editText.getText().toString();
                        String str = chat.title;
                        if (str != null && str.equals(string)) {
                            b2Var.dismiss();
                        } else {
                            chat.title = string;
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
                            MessagesController.getInstance(i12).changeChatTitle(j11, string);
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                        }
                    } else {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                        String string2 = editText.getText().toString();
                        String string3 = editText2.getText().toString();
                        String str2 = user.first_name;
                        String str3 = user.last_name;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (str2.equals(string2) && str3.equals(string3)) {
                            b2Var.dismiss();
                        } else {
                            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                            updateprofile.flags = 3;
                            updateprofile.first_name = string2;
                            user.first_name = string2;
                            updateprofile.last_name = string3;
                            user.last_name = string3;
                            TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(UserConfig.getInstance(i12).getClientUserId()));
                            if (user2 != null) {
                                user2.first_name = updateprofile.first_name;
                                user2.last_name = updateprofile.last_name;
                            }
                            UserConfig.getInstance(i12).saveConfig(true);
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                            ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new m5(9));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                        }
                    }
                    b2Var.dismiss();
                    break;
                }
                break;
        }
    }

    @Override
    public void onComplete(Object obj) {
        b11 b11Var = (b11) this.d;
        zo zoVar = (zo) this.f18870e;
        Pair pair = (Pair) obj;
        if (pair == null || ((Long) pair.first).longValue() != this.f18869c) {
            return;
        }
        Drawable drawable = zoVar.f35317b;
        if (drawable instanceof nb0) {
            nb0 nb0Var = (nb0) drawable;
            nb0Var.t(b11.e((Bitmap) pair.second), this.f18868b >= 0 ? 100 : -100);
            nb0Var.u(b11Var.H);
        }
        b11Var.invalidate();
    }

    @Override
    public void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        Activity activity;
        String forcedFirstName;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLObject tLObject;
        int i12;
        gy gyVar2 = (gy) this.d;
        final TL_bots.botVerifierSettings botverifiersettings = (TL_bots.botVerifierSettings) this.f18870e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Activity parentActivity = gyVar2.getParentActivity();
        final int i13 = this.f18868b;
        q1 q1Var = new q1(we1Var, gyVar2, j10, i13);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i13);
        final long j11 = this.f18869c;
        messagesController.getUser(Long.valueOf(j11));
        if (j10 >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j10));
            forcedFirstName = UserObject.getForcedFirstName(user2);
            if (user2.bot_verification_icon == botverifiersettings.icon) {
                u1.a(parentActivity, i13, j11, j10, botverifiersettings, q1Var);
                return true;
            }
            activity = parentActivity;
            user = user2;
            chat = null;
            tLObject = user2;
        } else {
            activity = parentActivity;
            TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(-j10));
            forcedFirstName = chat2 == null ? "" : chat2.title;
            if (chat2.bot_verification_icon == botverifiersettings.icon) {
                u1.a(activity, i13, j11, j10, botverifiersettings, q1Var);
                return true;
            }
            q1Var = q1Var;
            chat = chat2;
            user = null;
            tLObject = chat2;
        }
        TLRPC.User user3 = user;
        final org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(activity, null, true, false);
        e3Var.fixNavigationBar();
        LinearLayout linearLayoutF = org.telegram.messenger.y1.f(activity, 1);
        TLRPC.Chat chat3 = chat;
        linearLayoutF.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayoutF.setClipChildren(false);
        linearLayoutF.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(g6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), g6.w0(null, g6.ci, false)));
        n9 n9Var = new n9(activity);
        n9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        y8 y8Var = new y8((c6) null);
        y8Var.p(tLObject);
        n9Var.e(tLObject, y8Var);
        frameLayout.addView(n9Var, z5.e(28, 28, 51));
        n9 n9Var2 = new n9(activity);
        n9Var2.setEmojiColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.f23444z9, false), PorterDuff.Mode.SRC_IN));
        final q1 q1Var2 = q1Var;
        n9Var2.setAnimatedEmojiDrawable(k5.n(i13, botverifiersettings.icon, null, 3));
        frameLayout.addView(n9Var2, z5.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        h5 h5Var = new h5(activity);
        h5Var.setTextColor(g6.w0(null, g6.f23161j5, false));
        h5Var.setTextSize(13);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(forcedFirstName, false);
        h5Var.setWidthWrapContent(true);
        frameLayout.addView(h5Var, z5.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        linearLayoutF.addView(frameLayout, z5.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(activity);
        int i14 = g6.G6;
        textView.setTextColor(g6.w0(null, i14, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (UserObject.isBot(user3)) {
            textView.setText(LocaleController.getString(R.string.BotVerifyBotTitle));
        } else if (user3 != null) {
            textView.setText(LocaleController.getString(R.string.BotVerifyUserTitle));
        } else if (ChatObject.isChannelAndNotMegaGroup(chat3)) {
            textView.setText(LocaleController.getString(R.string.BotVerifyChannelTitle));
        } else {
            textView.setText(LocaleController.getString(R.string.BotVerifyGroupTitle));
        }
        textView.setTypeface(AndroidUtilities.bold());
        linearLayoutF.addView(textView, z5.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(g6.w0(null, i14, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, forcedFirstName)), textView2.getPaint().getFontMetricsInt(), false));
        linearLayoutF.addView(textView2, z5.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i15 = MessagesController.getInstance(i13).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        final jc0 jc0Var = new jc0(activity, null);
        jc0Var.setForceForceUseCenter(true);
        jc0Var.setText(LocaleController.getString(R.string.BotVerifyDescription));
        jc0Var.setLeftPadding(AndroidUtilities.dp(2.0f));
        editTextBoldCursor.setTextColor(g6.w0(null, i14, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(g6.w0(null, g6.f23366uf, false));
        editTextBoldCursor.setHandlesColor(g6.w0(null, g6.f23382vf, false));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new p8(jc0Var, editTextBoldCursor, 1));
        jc0Var.e(editTextBoldCursor);
        jc0Var.addView(editTextBoldCursor, z5.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        linearLayoutF.addView(jc0Var, z5.n(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.f3());
        editTextBoldCursor.addTextChangedListener(new t1(editTextBoldCursor, i15, jc0Var));
        if (!TextUtils.isEmpty(botverifiersettings.custom_description)) {
            editTextBoldCursor.setText(botverifiersettings.custom_description);
            if (!botverifiersettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botverifiersettings.can_modify_custom_description) {
            jc0Var.setVisibility(8);
        }
        if (botverifiersettings.can_modify_custom_description) {
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(g6.w0(null, g6.B6, false));
            textView3.setTextSize(1, 12.0f);
            textView3.setPadding(pa.c(14.0f, j10 >= 0 ? R.string.BotVerifyDescriptionInfo : R.string.BotVerifyDescriptionInfoChat, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i12 = -1;
            linearLayoutF.addView(textView3, z5.c(-2.0f, -1));
        } else {
            i12 = -1;
            linearLayoutF.addView(new View(activity), z5.c(12.0f, -1));
        }
        final lh.d dVar = new lh.d(activity, null, true);
        dVar.g(textView.getText(), false, true);
        linearLayoutF.addView(dVar, z5.n(i12, 48));
        e3Var.customView = linearLayoutF;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                lh.d dVar2 = dVar;
                if (dVar2.J) {
                    return;
                }
                TL_bots.botVerifierSettings botverifiersettings2 = botverifiersettings;
                boolean z12 = botverifiersettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z12 && editTextBoldCursor2.getText().length() > i15) {
                    jc0 jc0Var2 = jc0Var;
                    jc0Var2.a(1.0f);
                    AndroidUtilities.shakeViewSpring(jc0Var2, -6.0f);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i16 = i13;
                setcustomverification.bot = MessagesController.getInstance(i16).getInputUser(j11);
                setcustomverification.peer = MessagesController.getInstance(i16).getInputPeer(j10);
                if (botverifiersettings2.can_modify_custom_description) {
                    setcustomverification.custom_description = editTextBoldCursor2.getText().toString();
                } else {
                    setcustomverification.custom_description = botverifiersettings2.custom_description;
                }
                if (!TextUtils.isEmpty(setcustomverification.custom_description)) {
                    setcustomverification.flags |= 4;
                }
                ConnectionsManager.getInstance(i16).sendRequest(setcustomverification, new cg.y(dVar2, e3Var, q1Var2, 13));
            }
        });
        e3Var.smoothKeyboardAnimationEnabled = true;
        e3Var.smoothKeyboardByBottom = true;
        e3Var.show();
        return true;
    }

    public p1(EditText editText, long j10, int i10, EditText editText2) {
        this.d = editText;
        this.f18869c = j10;
        this.f18868b = i10;
        this.f18870e = editText2;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public p1(b11 b11Var, long j10, zo zoVar, int i10) {
        this.d = b11Var;
        this.f18869c = j10;
        this.f18870e = zoVar;
        this.f18868b = i10;
    }

    public p1(gy gyVar, int i10, long j10, TL_bots.botVerifierSettings botverifiersettings) {
        this.d = gyVar;
        this.f18868b = i10;
        this.f18869c = j10;
        this.f18870e = botverifiersettings;
    }
}
