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
import c8.na;
import di.r9;
import fi.l5;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.messenger.sr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.za0;
import org.telegram.ui.bx;
import org.telegram.ui.vw;
import org.telegram.ui.w91;
public final class l1 implements vw, org.telegram.ui.ActionBar.q1, ResultCallback, qi.m {
    public final int f18864a;
    public final int f18865b;
    public final long f18866c;
    public final Object d;
    public final Object f18867e;

    public l1(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f18864a = i10;
        this.d = obj;
        this.f18866c = j3;
        this.f18867e = obj2;
        this.f18865b = i7;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public boolean O(bx bxVar) {
        return false;
    }

    @Override
    public void d(j6.k kVar) {
        boolean z10;
        qi.i iVar = (qi.i) this.d;
        long j3 = this.f18866c;
        qi.f fVar = (qi.f) this.f18867e;
        int i7 = this.f18865b;
        synchronized (qi.j.d) {
            try {
                Spannable spannable = (Spannable) iVar.f56308a.get();
                if (spannable != null && iVar.f56309b.get(Long.valueOf(j3)) == fVar) {
                    if ((spannable instanceof qi.d) && !((qi.d) spannable).f56298a) {
                        qi.j.a(spannable, i7, (com.google.android.gms.internal.play_billing.s0) kVar.f17343b);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.messenger.g0.g3(new org.telegram.messenger.voip.p(iVar, j3, fVar, i7, z10, kVar));
                }
            } finally {
            }
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f18864a;
        Object obj = this.f18867e;
        int i11 = this.f18865b;
        long j3 = this.f18866c;
        Object obj2 = this.d;
        switch (i10) {
            case 1:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = mp.u1(i11).q1(j3);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new b2(i11, 0), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                ks.f(i11).k(302, new Object[0]);
                ri.d0(i11).n2(ri.f26694f2, j3);
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
                        TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(j3));
                        String obj3 = editText.getText().toString();
                        String obj4 = editText2.getText().toString();
                        String str = c22.first_name;
                        String str2 = c22.last_name;
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
                        c22.first_name = obj3;
                        updateprofile.last_name = obj4;
                        c22.last_name = obj4;
                        TLRPC.User c23 = mp.u1(i11).c2(Long.valueOf(i10.i(i11).e()));
                        if (c23 != null) {
                            c23.first_name = updateprofile.first_name;
                            c23.last_name = updateprofile.last_name;
                        }
                        i10.i(i11).v(true);
                        ks.f(i11).k(46, new Object[0]);
                        ks.f(i11).k(2, 1);
                        ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new l5(18));
                        ks.e().k(295, 3, Long.valueOf(j3));
                    } else {
                        long j10 = -j3;
                        TLRPC.Chat O0 = mp.u1(i11).O0(Long.valueOf(j10));
                        String obj5 = editText.getText().toString();
                        String str3 = O0.title;
                        if (str3 != null && str3.equals(obj5)) {
                            t1Var.dismiss();
                            return;
                        }
                        O0.title = obj5;
                        ks.f(i11).k(2, 16);
                        mp.u1(i11).C(j10, obj5, null);
                        ks.e().k(295, 3, Long.valueOf(j3));
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
        j01 j01Var = (j01) this.d;
        jp jpVar = (jp) this.f18867e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f18866c) {
            Drawable drawable = jpVar.f36473b;
            if (drawable instanceof za0) {
                za0 za0Var = (za0) drawable;
                if (this.f18865b >= 0) {
                    i7 = 100;
                } else {
                    i7 = -100;
                }
                za0Var.s(i7, j01.e((Bitmap) pair.second));
                za0Var.t(j01Var.M);
            }
            j01Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        int i11;
        String str;
        String str2;
        TLRPC.User user;
        TLRPC.Chat chat;
        ?? r42;
        TLRPC.User user2;
        int i12;
        bx bxVar2 = (bx) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.f18867e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j3 = ((sr) arrayList.get(0)).f26946a;
        Activity parentActivity = bxVar2.getParentActivity();
        final int i13 = this.f18865b;
        final bi.x3 x3Var = new bi.x3(w91Var, bxVar2, j3, i13);
        if (parentActivity == null) {
            return true;
        }
        mp u12 = mp.u1(i13);
        final long j10 = this.f18866c;
        u12.c2(Long.valueOf(j10));
        int i14 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i14 >= 0) {
            TLRPC.User c22 = mp.u1(i13).c2(Long.valueOf(j3));
            str2 = n10.l(c22);
            i11 = i14;
            if (c22.bot_verification_icon == botVerifierSettings.icon) {
                o1.a(parentActivity, i13, j10, j3, botVerifierSettings, x3Var);
                return true;
            }
            x3Var = x3Var;
            r42 = 1;
            chat = null;
            user = c22;
            user2 = c22;
        } else {
            i11 = i14;
            TLRPC.Chat O0 = mp.u1(i13).O0(Long.valueOf(-j3));
            if (O0 == null) {
                str = "";
            } else {
                str = O0.title;
            }
            str2 = str;
            if (O0.bot_verification_icon == botVerifierSettings.icon) {
                o1.a(parentActivity, i13, j10, j3, botVerifierSettings, x3Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = O0;
            r42 = 1;
            user2 = O0;
        }
        final org.telegram.ui.ActionBar.w2 j11 = m10.j(parentActivity, r42, r42, null);
        LinearLayout f10 = org.telegram.messenger.f3.f(parentActivity, r42);
        TLRPC.User user3 = user;
        TLRPC.Chat chat2 = chat;
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        int i15 = n6.Ti;
        ShapeDrawable e02 = n6.e0(L, L2, n6.x0(null, i15, false));
        q6 M = u6.M(i15);
        frameLayout.setBackground(e02);
        u6.j(frameLayout, e02, M, null, null);
        p9 p9Var = new p9(parentActivity);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        a9 a9Var = new a9((i6) null);
        a9Var.l(user2);
        p9Var.f(user2, a9Var);
        frameLayout.addView(p9Var, na.e(28, 28, 51));
        p9 p9Var2 = new p9(parentActivity);
        p9Var2.setEmojiColorFilter(new PorterDuffColorFilter(n6.x0(null, n6.f29865z9, false), PorterDuff.Mode.SRC_IN));
        int i16 = 3;
        p9Var2.setAnimatedEmojiDrawable(o5.m(i13, botVerifierSettings.icon, null, 3));
        frameLayout.addView(p9Var2, na.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        n5 n5Var = new n5(parentActivity);
        u6.X(n5Var, n6.f29559j5, null);
        n5Var.setTextSize(13);
        n5Var.setEllipsizeByGradient(true);
        n5Var.l(str2, false);
        n5Var.setWidthWrapContent(true);
        frameLayout.addView(n5Var, na.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        f10.addView(frameLayout, na.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i17 = n6.G6;
        u6.U(textView, i17, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (n10.u(user3)) {
            textView.setText(gd.N0(2131752916, null));
        } else if (user3 != null) {
            textView.setText(gd.N0(2131752909, null));
        } else if (org.telegram.messenger.v3.V(chat2)) {
            textView.setText(gd.N0(2131752915, null));
        } else {
            textView.setText(gd.N0(2131752911, null));
        }
        textView.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView, na.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        u6.U(textView2, i17, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        ks.i(textView2);
        textView2.setText(j6.m(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752910, str2)), textView2.getPaint().getFontMetricsInt(), false, null, 0));
        f10.addView(textView2, na.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i18 = mp.u1(i13).f25801m6;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final vb0 vb0Var = new vb0(parentActivity, null);
        vb0Var.setForceForceUseCenter(true);
        vb0Var.setText(gd.N0(2131752914, null));
        vb0Var.setLeftPadding(org.telegram.messenger.g0.L(2.0f));
        u6.U(editTextBoldCursor, i17, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        u6.C(editTextBoldCursor, n6.f29607lg, null);
        u6.l(editTextBoldCursor, 36, n6.f29624mg, null);
        if (gd.f24314a0) {
            i16 = 5;
        }
        editTextBoldCursor.setGravity(i16);
        editTextBoldCursor.setOnFocusChangeListener(new r9(vb0Var, editTextBoldCursor, 1));
        vb0Var.e(editTextBoldCursor);
        vb0Var.addView(editTextBoldCursor, na.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        f10.addView(vb0Var, na.o(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.k3());
        editTextBoldCursor.addTextChangedListener(new n1(editTextBoldCursor, i18, vb0Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            vb0Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            u6.U(textView3, n6.B6, null);
            textView3.setTextSize(1, 12.0f);
            if (i11 >= 0) {
                i12 = 2131752913;
            } else {
                i12 = 2131752912;
            }
            textView3.setText(gd.N0(i12, null));
            textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(27.0f));
            f10.addView(textView3, na.c(-2.0f, -1));
        } else {
            f10.addView(new View(parentActivity), na.c(12.0f, -1));
        }
        final hi.e eVar = new hi.e(parentActivity, null, true);
        eVar.i(textView.getText(), false, true);
        f10.addView(eVar, na.o(-1, 48));
        j11.O = f10;
        eVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                hi.e eVar2 = hi.e.this;
                if (eVar2.R) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z12 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z12 && editTextBoldCursor2.getText().length() > i18) {
                    vb0 vb0Var2 = vb0Var;
                    vb0Var2.a(1.0f);
                    org.telegram.messenger.g0.E3(-6.0f, vb0Var2, null);
                    return;
                }
                eVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i19 = i13;
                setcustomverification.bot = mp.u1(i19).q1(j10);
                setcustomverification.peer = mp.u1(i19).l1(j3);
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
                ConnectionsManager.getInstance(i19).sendRequest(setcustomverification, new bi.q1(eVar2, j11, x3Var, 13));
            }
        });
        j11.Q0 = true;
        j11.R0 = true;
        j11.show();
        return true;
    }

    public l1(int i7, long j3, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f18864a = 1;
        this.f18865b = i7;
        this.f18866c = j3;
        this.d = tL_attachMenuBot;
        this.f18867e = runnable;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    public l1(EditText editText, long j3, int i7, EditText editText2) {
        this.f18864a = 2;
        this.d = editText;
        this.f18866c = j3;
        this.f18865b = i7;
        this.f18867e = editText2;
    }

    public l1(bx bxVar, int i7, long j3, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.f18864a = 0;
        this.d = bxVar;
        this.f18865b = i7;
        this.f18866c = j3;
        this.f18867e = botVerifierSettings;
    }
}
