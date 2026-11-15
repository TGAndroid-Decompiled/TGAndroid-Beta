package ki;

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
import c8.ja;
import di.o9;
import fi.m5;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.t8;
import org.telegram.ui.sw;
import org.telegram.ui.u91;
import org.telegram.ui.yw;
public final class o1 implements sw, org.telegram.ui.ActionBar.q1, ResultCallback, qi.m {
    public final int f18473a;
    public final int f18474b;
    public final long f18475c;
    public final Object d;
    public final Object f18476e;

    public o1(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f18473a = i10;
        this.d = obj;
        this.f18475c = j3;
        this.f18476e = obj2;
        this.f18474b = i7;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean P(yw ywVar) {
        return false;
    }

    @Override
    public void a(ji.j jVar) {
        boolean z10;
        qi.i iVar = (qi.i) this.d;
        long j3 = this.f18475c;
        qi.f fVar = (qi.f) this.f18476e;
        int i7 = this.f18474b;
        synchronized (qi.j.d) {
            try {
                Spannable spannable = (Spannable) iVar.f55611a.get();
                if (spannable != null && iVar.f55612b.get(Long.valueOf(j3)) == fVar) {
                    if ((spannable instanceof qi.d) && !((qi.d) spannable).f55601a) {
                        qi.j.a(spannable, i7, (com.google.android.gms.internal.play_billing.s0) jVar.f17555b);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.p(iVar, j3, fVar, i7, z10, jVar));
                }
            } finally {
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f18473a;
        Object obj = this.f18476e;
        int i11 = this.f18474b;
        long j3 = this.f18475c;
        Object obj2 = this.d;
        switch (i10) {
            case 1:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = np.s1(i11).o1(j3);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new g2(i11, 0), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                ns.f(i11).k(299, new Object[0]);
                si.b0(i11).i2(si.d2, j3);
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
                        TLRPC.User a22 = np.s1(i11).a2(Long.valueOf(j3));
                        String obj3 = editText.getText().toString();
                        String obj4 = editText2.getText().toString();
                        String str = a22.first_name;
                        String str2 = a22.last_name;
                        if (str == null) {
                            str = "";
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str.equals(obj3) && str2.equals(obj4)) {
                            t1Var.dismiss();
                            return;
                        }
                        TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                        updateprofile.flags = 3;
                        updateprofile.first_name = obj3;
                        a22.first_name = obj3;
                        updateprofile.last_name = obj4;
                        a22.last_name = obj4;
                        TLRPC.User a23 = np.s1(i11).a2(Long.valueOf(m10.i(i11).e()));
                        if (a23 != null) {
                            a23.first_name = updateprofile.first_name;
                            a23.last_name = updateprofile.last_name;
                        }
                        m10.i(i11).v(true);
                        ns.f(i11).k(46, new Object[0]);
                        ns.f(i11).k(2, 1);
                        ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new m5(18));
                        ns.e().k(292, 3, Long.valueOf(j3));
                    } else {
                        long j10 = -j3;
                        TLRPC.Chat M0 = np.s1(i11).M0(Long.valueOf(j10));
                        String obj5 = editText.getText().toString();
                        String str3 = M0.title;
                        if (str3 != null && str3.equals(obj5)) {
                            t1Var.dismiss();
                            return;
                        }
                        M0.title = obj5;
                        ns.f(i11).k(2, 16);
                        np.s1(i11).C(j10, obj5, null);
                        ns.e().k(292, 3, Long.valueOf(j3));
                    }
                    t1Var.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        int i7;
        b01 b01Var = (b01) this.d;
        dp dpVar = (dp) this.f18476e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f18475c) {
            Drawable drawable = dpVar.f34023b;
            if (drawable instanceof ra0) {
                ra0 ra0Var = (ra0) drawable;
                if (this.f18474b >= 0) {
                    i7 = 100;
                } else {
                    i7 = -100;
                }
                ra0Var.s(i7, b01.e((Bitmap) pair.second));
                ra0Var.t(b01Var.M);
            }
            b01Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        int i11;
        String str;
        String str2;
        TLRPC.User user;
        TLRPC.Chat chat;
        ?? r42;
        TLRPC.User user2;
        int i12;
        yw ywVar2 = (yw) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.f18476e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j3 = ((ur) arrayList.get(0)).f26860a;
        Activity parentActivity = ywVar2.getParentActivity();
        final int i13 = this.f18474b;
        final p1 p1Var = new p1(u91Var, ywVar2, j3, i13);
        if (parentActivity == null) {
            return true;
        }
        np s12 = np.s1(i13);
        final long j10 = this.f18475c;
        s12.a2(Long.valueOf(j10));
        int i14 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i14 >= 0) {
            TLRPC.User a22 = np.s1(i13).a2(Long.valueOf(j3));
            str2 = q10.k(a22);
            i11 = i14;
            if (a22.bot_verification_icon == botVerifierSettings.icon) {
                t1.a(parentActivity, i13, j10, j3, botVerifierSettings, p1Var);
                return true;
            }
            p1Var = p1Var;
            r42 = 1;
            chat = null;
            user = a22;
            user2 = a22;
        } else {
            i11 = i14;
            TLRPC.Chat M0 = np.s1(i13).M0(Long.valueOf(-j3));
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            str2 = str;
            if (M0.bot_verification_icon == botVerifierSettings.icon) {
                t1.a(parentActivity, i13, j10, j3, botVerifierSettings, p1Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = M0;
            r42 = 1;
            user2 = M0;
        }
        final org.telegram.ui.ActionBar.u2 i15 = i20.i(parentActivity, r42, r42, null);
        LinearLayout e10 = k5.e(parentActivity, r42);
        TLRPC.User user3 = user;
        TLRPC.Chat chat2 = chat;
        e10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        e10.setClipChildren(false);
        e10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        int i16 = j6.Ti;
        ShapeDrawable e02 = j6.e0(L, L2, j6.x0(null, i16, false));
        m6 M = q6.M(i16);
        frameLayout.setBackground(e02);
        q6.j(frameLayout, e02, M, null, null);
        i9 i9Var = new i9(parentActivity);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        t8 t8Var = new t8((e6) null);
        t8Var.l(user2);
        i9Var.f(user2, t8Var);
        frameLayout.addView(i9Var, ja.e(28, 28, 51));
        i9 i9Var2 = new i9(parentActivity);
        i9Var2.setEmojiColorFilter(new PorterDuffColorFilter(j6.x0(null, j6.f29263z9, false), PorterDuff.Mode.SRC_IN));
        int i17 = 3;
        i9Var2.setAnimatedEmojiDrawable(g5.m(i13, botVerifierSettings.icon, null, 3));
        frameLayout.addView(i9Var2, ja.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        j5 j5Var = new j5(parentActivity);
        q6.X(j5Var, j6.f28957j5, null);
        j5Var.setTextSize(13);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(str2, false);
        j5Var.setWidthWrapContent(true);
        frameLayout.addView(j5Var, ja.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        e10.addView(frameLayout, ja.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i18 = j6.G6;
        q6.U(textView, i18, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (q10.t(user3)) {
            textView.setText(hd.M0(2131752928, null));
        } else if (user3 != null) {
            textView.setText(hd.M0(2131752921, null));
        } else if (org.telegram.messenger.t3.V(chat2)) {
            textView.setText(hd.M0(2131752927, null));
        } else {
            textView.setText(hd.M0(2131752923, null));
        }
        textView.setTypeface(org.telegram.messenger.g0.o());
        e10.addView(textView, ja.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        q6.U(textView2, i18, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        ns.i(textView2);
        textView2.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752922, str2)), textView2.getPaint().getFontMetricsInt(), false, null, 0));
        e10.addView(textView2, ja.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i19 = np.s1(i13).f25321k6;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final mb0 mb0Var = new mb0(parentActivity, null);
        mb0Var.setForceForceUseCenter(true);
        mb0Var.setText(hd.M0(2131752926, null));
        mb0Var.setLeftPadding(org.telegram.messenger.g0.L(2.0f));
        q6.U(editTextBoldCursor, i18, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        q6.C(editTextBoldCursor, j6.f29005lg, null);
        q6.l(editTextBoldCursor, 36, j6.f29022mg, null);
        if (hd.f24101a0) {
            i17 = 5;
        }
        editTextBoldCursor.setGravity(i17);
        editTextBoldCursor.setOnFocusChangeListener(new o9(mb0Var, editTextBoldCursor, 1));
        mb0Var.e(editTextBoldCursor);
        mb0Var.addView(editTextBoldCursor, ja.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        e10.addView(mb0Var, ja.o(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.j3());
        editTextBoldCursor.addTextChangedListener(new s1(editTextBoldCursor, i19, mb0Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            mb0Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            q6.U(textView3, j6.B6, null);
            textView3.setTextSize(1, 12.0f);
            if (i11 >= 0) {
                i12 = 2131752925;
            } else {
                i12 = 2131752924;
            }
            textView3.setText(hd.M0(i12, null));
            textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(27.0f));
            e10.addView(textView3, ja.c(-2.0f, -1));
        } else {
            e10.addView(new View(parentActivity), ja.c(12.0f, -1));
        }
        final hi.d dVar = new hi.d(parentActivity, null, true);
        dVar.i(textView.getText(), false, true);
        e10.addView(dVar, ja.o(-1, 48));
        i15.O = e10;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                hi.d dVar2 = hi.d.this;
                if (dVar2.R) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z12 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z12 && editTextBoldCursor2.getText().length() > i19) {
                    mb0 mb0Var2 = mb0Var;
                    mb0Var2.a(1.0f);
                    org.telegram.messenger.g0.F3(-6.0f, mb0Var2, null);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i20 = i13;
                setcustomverification.bot = np.s1(i20).o1(j10);
                setcustomverification.peer = np.s1(i20).j1(j3);
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
                ConnectionsManager.getInstance(i20).sendRequest(setcustomverification, new bi.j6(dVar2, i15, p1Var, 11));
            }
        });
        i15.Q0 = true;
        i15.R0 = true;
        i15.show();
        return true;
    }

    public o1(int i7, long j3, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f18473a = 1;
        this.f18474b = i7;
        this.f18475c = j3;
        this.d = tL_attachMenuBot;
        this.f18476e = runnable;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public o1(EditText editText, long j3, int i7, EditText editText2) {
        this.f18473a = 2;
        this.d = editText;
        this.f18475c = j3;
        this.f18474b = i7;
        this.f18476e = editText2;
    }

    public o1(yw ywVar, int i7, long j3, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.f18473a = 0;
        this.d = ywVar;
        this.f18474b = i7;
        this.f18475c = j3;
        this.f18476e = botVerifierSettings;
    }
}
