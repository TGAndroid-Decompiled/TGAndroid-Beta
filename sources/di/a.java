package di;

import ag.c3;
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
import com.google.android.gms.internal.play_billing.s0;
import java.util.ArrayList;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.i20;
import org.telegram.messenger.k6;
import org.telegram.messenger.m5;
import org.telegram.messenger.vi;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.l3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.g51;
import org.telegram.ui.nb1;
import org.telegram.ui.tx;
import org.telegram.ui.zx;
import w7.b6;
import xh.h1;
import xh.k1;
import xh.l1;
public final class a implements p, u1, ResultCallback, tx {
    public final int f5950a;
    public final long f5951b;
    public final int f5952c;
    public final Object d;
    public final Object e;

    public a(int i10, int i11, long j10, Object obj, Object obj2) {
        this.f5950a = i11;
        this.d = obj;
        this.f5951b = j10;
        this.e = obj2;
        this.f5952c = i10;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean O(zx zxVar) {
        return false;
    }

    @Override
    public void g(n4.q qVar) {
        boolean z10;
        k kVar = (k) this.d;
        long j10 = this.f5951b;
        h hVar = (h) this.e;
        int i10 = this.f5952c;
        synchronized (l.d) {
            try {
                Spannable spannable = (Spannable) kVar.f5971a.get();
                if (spannable != null && kVar.f5972b.get(Long.valueOf(j10)) == hVar) {
                    if ((spannable instanceof f) && !((f) spannable).f5961a) {
                        l.a(spannable, i10, (s0) qVar.f13527a);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i0.g3(new b(kVar, j10, hVar, i10, z10, qVar));
                }
            } finally {
            }
        }
    }

    @Override
    public void h(x1 x1Var, int i10) {
        int i11 = this.f5950a;
        Object obj = this.e;
        Object obj2 = this.d;
        long j10 = this.f5951b;
        int i12 = this.f5952c;
        switch (i11) {
            case 1:
                EditText editText = (EditText) obj2;
                EditText editText2 = (EditText) obj;
                if (editText.getText() != null) {
                    if (j10 > 0) {
                        TLRPC.User Z1 = wp.r1(i12).Z1(Long.valueOf(j10));
                        String obj3 = editText.getText().toString();
                        String obj4 = editText2.getText().toString();
                        String str = Z1.first_name;
                        String str2 = Z1.last_name;
                        if (str == null) {
                            str = "";
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str.equals(obj3) && str2.equals(obj4)) {
                            x1Var.dismiss();
                            return;
                        }
                        TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                        updateprofile.flags = 3;
                        updateprofile.first_name = obj3;
                        Z1.first_name = obj3;
                        updateprofile.last_name = obj4;
                        Z1.last_name = obj4;
                        TLRPC.User Z12 = wp.r1(i12).Z1(Long.valueOf(e20.i(i12).e()));
                        if (Z12 != null) {
                            Z12.first_name = updateprofile.first_name;
                            Z12.last_name = updateprofile.last_name;
                        }
                        e20.i(i12).v(true);
                        at.f(i12).k(46, new Object[0]);
                        at.f(i12).k(2, 1);
                        ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new c3(13));
                        at.e().k(292, 3, Long.valueOf(j10));
                    } else {
                        long j11 = -j10;
                        TLRPC.Chat L0 = wp.r1(i12).L0(Long.valueOf(j11));
                        String obj5 = editText.getText().toString();
                        String str3 = L0.title;
                        if (str3 != null && str3.equals(obj5)) {
                            x1Var.dismiss();
                            return;
                        }
                        L0.title = obj5;
                        at.f(i12).k(2, 16);
                        wp.r1(i12).C(j11, obj5, null);
                        at.e().k(292, 3, Long.valueOf(j10));
                    }
                    x1Var.dismiss();
                    return;
                }
                return;
            default:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = wp.r1(i12).n1(j10);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.voip.q(i12, 6), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                at.f(i12).k(299, new Object[0]);
                vi.b0(i12).i2(vi.f18630c2, j10);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        int i10;
        f11 f11Var = (f11) this.d;
        cp cpVar = (cp) this.e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f5951b) {
            Drawable drawable = cpVar.f25198b;
            if (drawable instanceof jb0) {
                jb0 jb0Var = (jb0) drawable;
                if (this.f5952c >= 0) {
                    i10 = 100;
                } else {
                    i10 = -100;
                }
                jb0Var.s(f11.e((Bitmap) pair.second), i10);
                jb0Var.t(f11Var.L);
            }
            f11Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        int i12;
        String str;
        TLRPC.User user;
        TLRPC.Chat chat;
        ?? r42;
        TLRPC.User user2;
        zx zxVar2 = (zx) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j10 = ((hs) arrayList.get(0)).f16109a;
        Activity parentActivity = zxVar2.getParentActivity();
        final int i13 = this.f5952c;
        final h1 h1Var = new h1(nb1Var, zxVar2, j10, i13);
        if (parentActivity == null) {
            return true;
        }
        wp r12 = wp.r1(i13);
        final long j11 = this.f5951b;
        r12.Z1(Long.valueOf(j11));
        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i14 >= 0) {
            TLRPC.User Z1 = wp.r1(i13).Z1(Long.valueOf(j10));
            str = i20.k(Z1);
            i12 = i14;
            if (Z1.bot_verification_icon == botVerifierSettings.icon) {
                l1.a(parentActivity, i13, j11, j10, botVerifierSettings, h1Var);
                return true;
            }
            h1Var = h1Var;
            r42 = 1;
            chat = null;
            user = Z1;
            user2 = Z1;
        } else {
            i12 = i14;
            TLRPC.Chat L0 = wp.r1(i13).L0(Long.valueOf(-j10));
            str = L0 == null ? "" : L0.title;
            if (L0.bot_verification_icon == botVerifierSettings.icon) {
                l1.a(parentActivity, i13, j11, j10, botVerifierSettings, h1Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = L0;
            r42 = 1;
            user2 = L0;
        }
        final z2 h = a30.h(parentActivity, r42, r42, null);
        LinearLayout e = m5.e(parentActivity, r42);
        TLRPC.User user3 = user;
        TLRPC.Chat chat2 = chat;
        e.setPadding(i0.L(16.0f), i0.L(20.0f), i0.L(16.0f), i0.L(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        int L = i0.L(28.0f);
        int L2 = i0.L(28.0f);
        int i15 = t6.Qi;
        ShapeDrawable e02 = t6.e0(L, L2, t6.x0(null, i15, false));
        w6 N = a7.N(i15);
        frameLayout.setBackground(e02);
        a7.k(frameLayout, e02, N, null, null);
        g9 g9Var = new g9(parentActivity);
        g9Var.setRoundRadius(i0.L(28.0f));
        r8 r8Var = new r8((p6) null);
        r8Var.l(user2);
        g9Var.e(user2, r8Var);
        frameLayout.addView(g9Var, b6.e(28, 28, 51));
        g9 g9Var2 = new g9(parentActivity);
        g9Var2.setEmojiColorFilter(new PorterDuffColorFilter(t6.x0(null, t6.f21334z9, false), PorterDuff.Mode.SRC_IN));
        g9Var2.setAnimatedEmojiDrawable(f5.m(i13, botVerifierSettings.icon, null, 3));
        frameLayout.addView(g9Var2, b6.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        u5 u5Var = new u5(parentActivity);
        a7.Y(u5Var, t6.f21038j5, null);
        u5Var.setTextSize(13);
        u5Var.setEllipsizeByGradient(true);
        u5Var.l(str, false);
        u5Var.setWidthWrapContent(true);
        frameLayout.addView(u5Var, b6.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        e.addView(frameLayout, b6.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i16 = t6.G6;
        a7.V(textView, i16, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (i20.t(user3)) {
            textView.setText(dd.L0(2131752928, null));
        } else if (user3 != null) {
            textView.setText(dd.L0(2131752921, null));
        } else if (w3.V(chat2)) {
            textView.setText(dd.L0(2131752927, null));
        } else {
            textView.setText(dd.L0(2131752923, null));
        }
        textView.setTypeface(i0.o());
        e.addView(textView, b6.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        a7.V(textView2, i16, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        at.i(textView2);
        textView2.setText(k6.m(i0.W2(dd.a0(null, null, 2131752922, str)), textView2.getPaint().getFontMetricsInt(), false, null, 0));
        e.addView(textView2, b6.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i17 = wp.r1(i13).f19173k6;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final ec0 ec0Var = new ec0(parentActivity, null);
        ec0Var.setForceForceUseCenter(true);
        ec0Var.setText(dd.L0(2131752926, null));
        ec0Var.setLeftPadding(i0.L(2.0f));
        a7.V(editTextBoldCursor, i16, null);
        editTextBoldCursor.setCursorSize(i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        a7.D(editTextBoldCursor, t6.f21029ig, null);
        a7.m(editTextBoldCursor, 36, t6.f21049jg, null);
        editTextBoldCursor.setGravity(dd.X ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new g51(ec0Var, editTextBoldCursor, 2));
        ec0Var.e(editTextBoldCursor);
        ec0Var.addView(editTextBoldCursor, b6.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        e.addView(ec0Var, b6.o(-1, -2));
        editTextBoldCursor.addTextChangedListener(new l3());
        editTextBoldCursor.addTextChangedListener(new k1(editTextBoldCursor, i17, ec0Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            ec0Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            a7.V(textView3, t6.B6, null);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(dd.L0(i12 >= 0 ? 2131752925 : 2131752924, null));
            textView3.setPadding(i0.L(14.0f), i0.L(7.0f), i0.L(14.0f), i0.L(27.0f));
            e.addView(textView3, b6.c(-2.0f, -1));
        } else {
            e.addView(new View(parentActivity), b6.c(12.0f, -1));
        }
        final vh.d dVar = new vh.d(parentActivity, null, true);
        dVar.i(textView.getText(), false, true);
        e.addView(dVar, b6.o(-1, 48));
        h.N = e;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                vh.d dVar2 = vh.d.this;
                if (dVar2.Q) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z12 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z12 && editTextBoldCursor2.getText().length() > i17) {
                    ec0 ec0Var2 = ec0Var;
                    ec0Var2.a(1.0f);
                    org.telegram.messenger.i0.F3(-6.0f, ec0Var2, null);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i18 = i13;
                setcustomverification.bot = wp.r1(i18).n1(j11);
                setcustomverification.peer = wp.r1(i18).i1(j10);
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
                ConnectionsManager.getInstance(i18).sendRequest(setcustomverification, new ag.p0(dVar2, h, h1Var, 25));
            }
        });
        h.P0 = true;
        h.Q0 = true;
        h.show();
        return true;
    }

    public a(int i10, long j10, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f5950a = 4;
        this.f5952c = i10;
        this.f5951b = j10;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    public a(EditText editText, long j10, int i10, EditText editText2) {
        this.f5950a = 1;
        this.d = editText;
        this.f5951b = j10;
        this.f5952c = i10;
        this.e = editText2;
    }

    public a(zx zxVar, int i10, long j10, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.f5950a = 3;
        this.d = zxVar;
        this.f5952c = i10;
        this.f5951b = j10;
        this.e = botVerifierSettings;
    }
}
