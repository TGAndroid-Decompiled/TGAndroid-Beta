package hi;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.gb;
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
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.y9;
import org.telegram.ui.cf1;
import org.telegram.ui.ey;
import org.telegram.ui.xx;
public final class x1 implements xx, org.telegram.ui.ActionBar.b2, ni.n {
    public final int f13355a;
    public final long f13356b;
    public final Object f13357c;
    public final Object d;

    public x1(int i10, long j10, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f13355a = i10;
        this.f13356b = j10;
        this.f13357c = tL_attachMenuBot;
        this.d = runnable;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(ey eyVar) {
        return false;
    }

    @Override
    public void a(m4.c cVar) {
        boolean z10;
        ni.j jVar = (ni.j) this.f13357c;
        long j10 = this.f13356b;
        ni.g gVar = (ni.g) this.d;
        int i10 = this.f13355a;
        synchronized (ni.k.d) {
            try {
                Spannable spannable = (Spannable) jVar.f18884a.get();
                if (spannable != null && jVar.f18885b.get(Long.valueOf(j10)) == gVar) {
                    if ((spannable instanceof ni.e) && !((ni.e) spannable).f18874a) {
                        ni.k.a(spannable, i10, (com.google.android.gms.internal.play_billing.s0) cVar.f18008b);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AndroidUtilities.runOnUIThread(new ni.a(jVar, j10, gVar, i10, z10, cVar));
                }
            } finally {
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        Runnable runnable = (Runnable) this.d;
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        int i11 = this.f13355a;
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f13356b;
        tL_messages_toggleBotInAttachMenu.bot = messagesController.getInputUser(j10);
        tL_messages_toggleBotInAttachMenu.enabled = false;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new s2(i11, 0), 66);
        ((TLRPC.TL_attachMenuBot) this.f13357c).show_in_side_menu = false;
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
        MediaDataController.getInstance(i11).uninstallShortcut(j10, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        int i12;
        String str;
        String str2;
        boolean z12;
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.User user2;
        int i13;
        ey eyVar2 = (ey) this.f13357c;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Activity parentActivity = eyVar2.getParentActivity();
        final int i14 = this.f13355a;
        final y1 y1Var = new y1(cf1Var, eyVar2, j10, i14);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i14);
        final long j11 = this.f13356b;
        messagesController.getUser(Long.valueOf(j11));
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i15 >= 0) {
            TLRPC.User user3 = MessagesController.getInstance(i14).getUser(Long.valueOf(j10));
            str2 = UserObject.getForcedFirstName(user3);
            i12 = i15;
            if (user3.bot_verification_icon == botVerifierSettings.icon) {
                c2.a(parentActivity, i14, j11, j10, botVerifierSettings, y1Var);
                return true;
            }
            y1Var = y1Var;
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
                c2.a(parentActivity, i14, j11, j10, botVerifierSettings, y1Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = chat2;
            user2 = chat2;
        }
        boolean z13 = z12;
        final org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(z13 ? 1 : 0, parentActivity, (u6) null, z13);
        k3Var.fixNavigationBar();
        LinearLayout f7 = org.telegram.messenger.t.f(parentActivity, z13 ? 1 : 0);
        TLRPC.User user4 = user;
        TLRPC.Chat chat3 = chat;
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        int dp = AndroidUtilities.dp(28.0f);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i16 = y6.f23350ci;
        ShapeDrawable d02 = y6.d0(dp, dp2, y6.x0(null, i16, false));
        b7 N = f7.N(i16);
        frameLayout.setBackground(d02);
        f7.k(frameLayout, d02, N, null, null);
        y9 y9Var = new y9(parentActivity);
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        j9 j9Var = new j9((u6) null);
        j9Var.p(user2);
        y9Var.f(user2, j9Var);
        frameLayout.addView(y9Var, kb1.i(28, 28, 51));
        y9 y9Var2 = new y9(parentActivity);
        y9Var2.setEmojiColorFilter(new PorterDuffColorFilter(y6.x0(null, y6.f23771z9, false), PorterDuff.Mode.SRC_IN));
        int i17 = 3;
        y9Var2.setAnimatedEmojiDrawable(t5.n(i14, botVerifierSettings.icon, null, 3));
        frameLayout.addView(y9Var2, kb1.h(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        b6 b6Var = new b6(parentActivity);
        f7.Y(b6Var, y6.f23465j5, null);
        b6Var.setTextSize(13);
        b6Var.setEllipsizeByGradient(true);
        b6Var.l(str2, false);
        b6Var.setWidthWrapContent(true);
        frameLayout.addView(b6Var, kb1.h(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        f7.addView(frameLayout, kb1.x(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i18 = y6.G6;
        f7.V(textView, i18, null);
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
        f7.addView(textView, kb1.o(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        f7.V(textView2, i18, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, str2)), textView2.getPaint().getFontMetricsInt(), false));
        f7.addView(textView2, kb1.o(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i19 = MessagesController.getInstance(i14).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final sd0 sd0Var = new sd0(parentActivity, null);
        sd0Var.setForceForceUseCenter(true);
        sd0Var.setText(LocaleController.getString(R.string.BotVerifyDescription));
        sd0Var.setLeftPadding(AndroidUtilities.dp(2.0f));
        f7.V(editTextBoldCursor, i18, null);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        f7.D(editTextBoldCursor, y6.f23683uf, null);
        f7.m(editTextBoldCursor, 36, y6.f23701vf, null);
        if (LocaleController.isRTL) {
            i17 = 5;
        }
        editTextBoldCursor.setGravity(i17);
        editTextBoldCursor.setOnFocusChangeListener(new gb(sd0Var, editTextBoldCursor, 1));
        sd0Var.e(editTextBoldCursor);
        sd0Var.addView(editTextBoldCursor, kb1.h(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        f7.addView(sd0Var, kb1.r(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.f3());
        editTextBoldCursor.addTextChangedListener(new b2(editTextBoldCursor, i19, sd0Var));
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
            f7.V(textView3, y6.B6, null);
            textView3.setTextSize(1, 12.0f);
            if (i12 >= 0) {
                i13 = R.string.BotVerifyDescriptionInfo;
            } else {
                i13 = R.string.BotVerifyDescriptionInfoChat;
            }
            textView3.setPadding(org.telegram.ui.d3.h(14.0f, i13, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            f7.addView(textView3, kb1.g(-2.0f, -1));
        } else {
            f7.addView(new View(parentActivity), kb1.g(12.0f, -1));
        }
        final fi.d dVar = new fi.d(parentActivity, null, true);
        dVar.i(textView.getText(), false, true);
        f7.addView(dVar, kb1.r(-1, 48));
        k3Var.customView = f7;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                fi.d dVar2 = fi.d.this;
                if (dVar2.Q) {
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
                ConnectionsManager.getInstance(i20).sendRequest(setcustomverification, new bi.h2(dVar2, k3Var, y1Var, 7));
            }
        });
        k3Var.smoothKeyboardAnimationEnabled = true;
        k3Var.smoothKeyboardByBottom = true;
        k3Var.show();
        return true;
    }

    public x1(ni.j jVar, long j10, ni.g gVar, int i10) {
        this.f13357c = jVar;
        this.f13356b = j10;
        this.d = gVar;
        this.f13355a = i10;
    }

    public x1(ey eyVar, int i10, long j10, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.f13357c = eyVar;
        this.f13355a = i10;
        this.f13356b = j10;
        this.d = botVerifierSettings;
    }
}
