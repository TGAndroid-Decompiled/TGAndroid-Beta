package gi;

import ai.ib;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.d6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.u21;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.ey;
import org.telegram.ui.xe1;
import org.telegram.ui.xx;
import w7.z5;
public final class q1 implements xx, org.telegram.ui.ActionBar.z1, mi.n, ResultCallback {
    public final int f11417a;
    public final int f11418b;
    public final long f11419c;
    public final Object d;
    public final Object e;

    public q1(int i10, long j10, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f11417a = 1;
        this.f11418b = i10;
        this.f11419c = j10;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(ey eyVar) {
        return false;
    }

    @Override
    public void d(mi.q qVar) {
        boolean z10;
        mi.j jVar = (mi.j) this.d;
        long j10 = this.f11419c;
        mi.g gVar = (mi.g) this.e;
        int i10 = this.f11418b;
        synchronized (mi.k.d) {
            try {
                Spannable spannable = (Spannable) jVar.f17022a.get();
                if (spannable != null && jVar.f17023b.get(Long.valueOf(j10)) == gVar) {
                    if ((spannable instanceof mi.e) && !((mi.e) spannable).f17012a) {
                        mi.k.a(spannable, i10, (com.google.android.gms.internal.play_billing.s0) qVar.f17036b);
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
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11 = this.f11417a;
        Object obj = this.e;
        int i12 = this.f11418b;
        long j10 = this.f11419c;
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
                            c2Var.dismiss();
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
                        ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new d6(12));
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                    } else {
                        long j11 = -j10;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j11));
                        String obj5 = editText.getText().toString();
                        String str3 = chat.title;
                        if (str3 != null && str3.equals(obj5)) {
                            c2Var.dismiss();
                            return;
                        }
                        chat.title = obj5;
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
                        MessagesController.getInstance(i12).changeChatTitle(j11, obj5);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                    }
                    c2Var.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        int i10;
        u21 u21Var = (u21) this.d;
        tp tpVar = (tp) this.e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f11419c) {
            Drawable drawable = tpVar.f30872b;
            if (drawable instanceof wc0) {
                wc0 wc0Var = (wc0) drawable;
                if (this.f11418b >= 0) {
                    i10 = 100;
                } else {
                    i10 = -100;
                }
                wc0Var.s(u21.e((Bitmap) pair.second), i10);
                wc0Var.t(u21Var.L);
            }
            u21Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, xe1 xe1Var) {
        int i12;
        String str;
        String str2;
        boolean z12;
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.User user2;
        int i13;
        ey eyVar2 = (ey) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Activity parentActivity = eyVar2.getParentActivity();
        final int i14 = this.f11418b;
        final r1 r1Var = new r1(xe1Var, eyVar2, j10, i14);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i14);
        final long j11 = this.f11419c;
        messagesController.getUser(Long.valueOf(j11));
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i15 >= 0) {
            TLRPC.User user3 = MessagesController.getInstance(i14).getUser(Long.valueOf(j10));
            str2 = UserObject.getForcedFirstName(user3);
            i12 = i15;
            if (user3.bot_verification_icon == botVerifierSettings.icon) {
                v1.a(parentActivity, i14, j11, j10, botVerifierSettings, r1Var);
                return true;
            }
            r1Var = r1Var;
            z12 = true;
            chat = null;
            user = user3;
            user2 = user3;
        } else {
            i12 = i15;
            TLRPC.Chat chat2 = MessagesController.getInstance(i14).getChat(Long.valueOf(-j10));
            if (chat2 == null) {
                str = "";
            } else {
                str = chat2.title;
            }
            str2 = str;
            z12 = true;
            if (chat2.bot_verification_icon == botVerifierSettings.icon) {
                v1.a(parentActivity, i14, j11, j10, botVerifierSettings, r1Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = chat2;
            user2 = chat2;
        }
        boolean z13 = z12;
        final org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(z13 ? 1 : 0, parentActivity, (g6) null, z13);
        h3Var.fixNavigationBar();
        LinearLayout f7 = org.telegram.messenger.v0.f(parentActivity, z13 ? 1 : 0);
        TLRPC.User user4 = user;
        TLRPC.Chat chat3 = chat;
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        int dp = AndroidUtilities.dp(28.0f);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i16 = k6.f21177ci;
        ShapeDrawable d02 = k6.d0(dp, dp2, k6.x0(null, i16, false));
        n6 O = r6.O(i16);
        frameLayout.setBackground(d02);
        r6.k(frameLayout, d02, O, null, null);
        u9 u9Var = new u9(parentActivity);
        u9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        f9 f9Var = new f9((g6) null);
        f9Var.p(user2);
        u9Var.e(user2, f9Var);
        frameLayout.addView(u9Var, z5.e(28, 28, 51));
        u9 u9Var2 = new u9(parentActivity);
        u9Var2.setEmojiColorFilter(new PorterDuffColorFilter(k6.x0(null, k6.f21592z9, false), PorterDuff.Mode.SRC_IN));
        int i17 = 3;
        u9Var2.setAnimatedEmojiDrawable(p5.n(i14, botVerifierSettings.icon, null, 3));
        frameLayout.addView(u9Var2, z5.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        n5 n5Var = new n5(parentActivity);
        r6.Z(n5Var, k6.f21290j5, null);
        n5Var.setTextSize(13);
        n5Var.setEllipsizeByGradient(true);
        n5Var.l(str2, false);
        n5Var.setWidthWrapContent(true);
        frameLayout.addView(n5Var, z5.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        f7.addView(frameLayout, z5.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i18 = k6.G6;
        r6.W(textView, i18, null);
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
        f7.addView(textView, z5.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        r6.W(textView2, i18, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, str2)), textView2.getPaint().getFontMetricsInt(), false));
        f7.addView(textView2, z5.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i19 = MessagesController.getInstance(i14).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final td0 td0Var = new td0(parentActivity, null);
        td0Var.setForceForceUseCenter(true);
        td0Var.setText(LocaleController.getString(R.string.BotVerifyDescription));
        td0Var.setLeftPadding(AndroidUtilities.dp(2.0f));
        r6.W(editTextBoldCursor, i18, null);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        r6.E(editTextBoldCursor, k6.f21508uf, null);
        r6.m(editTextBoldCursor, 36, k6.f21526vf, null);
        if (LocaleController.isRTL) {
            i17 = 5;
        }
        editTextBoldCursor.setGravity(i17);
        editTextBoldCursor.setOnFocusChangeListener(new ib(td0Var, editTextBoldCursor, 1));
        td0Var.e(editTextBoldCursor);
        td0Var.addView(editTextBoldCursor, z5.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        f7.addView(td0Var, z5.n(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.g3());
        editTextBoldCursor.addTextChangedListener(new u1(editTextBoldCursor, i19, td0Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            td0Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            r6.W(textView3, k6.B6, null);
            textView3.setTextSize(1, 12.0f);
            if (i12 >= 0) {
                i13 = R.string.BotVerifyDescriptionInfo;
            } else {
                i13 = R.string.BotVerifyDescriptionInfoChat;
            }
            textView3.setPadding(org.telegram.ui.Cells.b1.e(14.0f, i13, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            f7.addView(textView3, z5.c(-2.0f, -1));
        } else {
            f7.addView(new View(parentActivity), z5.c(12.0f, -1));
        }
        final ei.d dVar = new ei.d(parentActivity, null, true);
        dVar.i(textView.getText(), false, true);
        f7.addView(dVar, z5.n(-1, 48));
        h3Var.customView = f7;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ei.d dVar2 = ei.d.this;
                if (dVar2.Q) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z14 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z14 && editTextBoldCursor2.getText().length() > i19) {
                    td0 td0Var2 = td0Var;
                    td0Var2.a(1.0f);
                    AndroidUtilities.shakeViewSpring(td0Var2, -6.0f);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i20 = i14;
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
                ConnectionsManager.getInstance(i20).sendRequest(setcustomverification, new ai.j2(dVar2, h3Var, r1Var, 7));
            }
        });
        h3Var.smoothKeyboardAnimationEnabled = true;
        h3Var.smoothKeyboardByBottom = true;
        h3Var.show();
        return true;
    }

    public q1(EditText editText, long j10, int i10, EditText editText2) {
        this.f11417a = 3;
        this.d = editText;
        this.f11419c = j10;
        this.f11418b = i10;
        this.e = editText2;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public q1(Object obj, long j10, Object obj2, int i10, int i11) {
        this.f11417a = i11;
        this.d = obj;
        this.f11419c = j10;
        this.e = obj2;
        this.f11418b = i10;
    }

    public q1(ey eyVar, int i10, long j10, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.f11417a = 0;
        this.d = eyVar;
        this.f11418b = i10;
        this.f11419c = j10;
        this.e = botVerifierSettings;
    }
}
