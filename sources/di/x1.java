package di;

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
import bi.wa;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ig1;
import org.telegram.ui.qy;
import org.telegram.ui.wy;
import w7.a6;
public final class x1 implements qy, org.telegram.ui.ActionBar.c2, ResultCallback {
    public final int f6996a = 1;
    public final int f6997b;
    public final long f6998c;
    public final Object d;
    public final Object e;

    public x1(int i10, long j3, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f6997b = i10;
        this.f6998c = j3;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean J(wy wyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = this.f6996a;
        Object obj = this.e;
        int i12 = this.f6997b;
        long j3 = this.f6998c;
        Object obj2 = this.d;
        switch (i11) {
            case 1:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(j3);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new t2(i12, 0), 66);
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
                            d2Var.dismiss();
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
                        ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new bi.g1(8));
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j3));
                    } else {
                        long j10 = -j3;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j10));
                        String obj5 = editText.getText().toString();
                        String str3 = chat.title;
                        if (str3 != null && str3.equals(obj5)) {
                            d2Var.dismiss();
                            return;
                        }
                        chat.title = obj5;
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
                        MessagesController.getInstance(i12).changeChatTitle(j10, obj5);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j3));
                    }
                    d2Var.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        int i10;
        i21 i21Var = (i21) this.d;
        rp rpVar = (rp) this.e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f6998c) {
            Drawable drawable = rpVar.f26734b;
            if (drawable instanceof lc0) {
                lc0 lc0Var = (lc0) drawable;
                if (this.f6997b >= 0) {
                    i10 = 100;
                } else {
                    i10 = -100;
                }
                lc0Var.t(i21.e((Bitmap) pair.second), i10);
                lc0Var.u(i21Var.L);
            }
            i21Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.o.a(this, th2);
    }

    @Override
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        Activity activity;
        String str;
        String str2;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.User user2;
        int i12;
        int i13;
        int i14;
        wy wyVar2 = (wy) this.d;
        final TL_bots.botVerifierSettings botverifiersettings = (TL_bots.botVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Activity parentActivity = wyVar2.getParentActivity();
        final int i15 = this.f6997b;
        y1 y1Var = new y1(ig1Var, wyVar2, j3, i15);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i15);
        final long j10 = this.f6998c;
        messagesController.getUser(Long.valueOf(j10));
        int i16 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i16 >= 0) {
            TLRPC.User user3 = MessagesController.getInstance(i15).getUser(Long.valueOf(j3));
            str2 = UserObject.getForcedFirstName(user3);
            if (user3.bot_verification_icon == botverifiersettings.icon) {
                d2.a(parentActivity, i15, j10, j3, botverifiersettings, y1Var);
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
                d2.a(activity, i15, j10, j3, botverifiersettings, y1Var);
                return true;
            }
            y1Var = y1Var;
            chat = chat2;
            user = null;
            user2 = chat2;
        }
        final org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) activity, (f6) null, true);
        h3Var.fixNavigationBar();
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        TLRPC.User user4 = user;
        TLRPC.Chat chat3 = chat;
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(j6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), j6.w0(null, j6.f17921ci, false)));
        w9 w9Var = new w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        g9 g9Var = new g9((f6) null);
        g9Var.p(user2);
        w9Var.e(user2, g9Var);
        frameLayout.addView(w9Var, a6.e(28, 28, 51));
        w9 w9Var2 = new w9(activity);
        w9Var2.setEmojiColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.f18328z9, false), PorterDuff.Mode.SRC_IN));
        final y1 y1Var2 = y1Var;
        w9Var2.setAnimatedEmojiDrawable(p5.n(i15, botverifiersettings.icon, null, 3));
        frameLayout.addView(w9Var2, a6.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        l5 l5Var = new l5(activity);
        l5Var.setTextColor(j6.w0(null, j6.f18034j5, false));
        l5Var.setTextSize(13);
        l5Var.setEllipsizeByGradient(true);
        l5Var.l(str2, false);
        l5Var.setWidthWrapContent(true);
        frameLayout.addView(l5Var, a6.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        f7.addView(frameLayout, a6.t(-2, -2, 1, 16, 0, 16, 0));
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
        f7.addView(textView, a6.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(j6.w0(null, i17, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, str2)), textView2.getPaint().getFontMetricsInt(), false));
        f7.addView(textView2, a6.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
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
        editTextBoldCursor.setHighlightColor(j6.w0(null, j6.f18245uf, false));
        editTextBoldCursor.setHandlesColor(j6.w0(null, j6.vf, false));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        editTextBoldCursor.setGravity(i12);
        editTextBoldCursor.setOnFocusChangeListener(new z1(hd0Var, editTextBoldCursor, 0));
        hd0Var.e(editTextBoldCursor);
        hd0Var.addView(editTextBoldCursor, a6.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        f7.addView(hd0Var, a6.n(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.h3());
        editTextBoldCursor.addTextChangedListener(new c2(editTextBoldCursor, i18, hd0Var));
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
            textView3.setPadding(r6.b(14.0f, i14, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i13 = -1;
            f7.addView(textView3, a6.c(-2.0f, -1));
        } else {
            i13 = -1;
            f7.addView(new View(activity), a6.c(12.0f, -1));
        }
        final bi.d dVar = new bi.d(activity, null, true);
        dVar.g(textView.getText(), false, true);
        f7.addView(dVar, a6.n(i13, 48));
        h3Var.customView = f7;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                bi.d dVar2 = bi.d.this;
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
                ConnectionsManager.getInstance(i19).sendRequest(setcustomverification, new wa(dVar2, h3Var, y1Var2, 1));
            }
        });
        h3Var.smoothKeyboardAnimationEnabled = true;
        h3Var.smoothKeyboardByBottom = true;
        h3Var.show();
        return true;
    }

    public x1(EditText editText, long j3, int i10, EditText editText2) {
        this.d = editText;
        this.f6998c = j3;
        this.f6997b = i10;
        this.e = editText2;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.o.b(this, tL_error);
    }

    public x1(i21 i21Var, long j3, rp rpVar, int i10) {
        this.d = i21Var;
        this.f6998c = j3;
        this.e = rpVar;
        this.f6997b = i10;
    }

    public x1(wy wyVar, int i10, long j3, TL_bots.botVerifierSettings botverifiersettings) {
        this.d = wyVar;
        this.f6997b = i10;
        this.f6998c = j3;
        this.e = botverifiersettings;
    }
}
