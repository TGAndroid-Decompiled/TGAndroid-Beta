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
import c8.ma;
import di.r9;
import fi.l5;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.cx;
import org.telegram.ui.ww;
import org.telegram.ui.y91;
public final class l1 implements ww, org.telegram.ui.ActionBar.q1, ResultCallback, qi.m {
    public final int f18795a;
    public final int f18796b;
    public final long f18797c;
    public final Object d;
    public final Object f18798e;

    public l1(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f18795a = i10;
        this.d = obj;
        this.f18797c = j3;
        this.f18798e = obj2;
        this.f18796b = i7;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean P(cx cxVar) {
        return false;
    }

    @Override
    public void a(ji.l lVar) {
        boolean z10;
        qi.i iVar = (qi.i) this.d;
        long j3 = this.f18797c;
        qi.f fVar = (qi.f) this.f18798e;
        int i7 = this.f18796b;
        synchronized (qi.j.d) {
            try {
                Spannable spannable = (Spannable) iVar.f56230a.get();
                if (spannable != null && iVar.f56231b.get(Long.valueOf(j3)) == fVar) {
                    if ((spannable instanceof qi.d) && !((qi.d) spannable).f56220a) {
                        qi.j.a(spannable, i7, (com.google.android.gms.internal.play_billing.s0) lVar.f17979b);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.messenger.g0.g3(new org.telegram.messenger.voip.p(iVar, j3, fVar, i7, z10, lVar));
                }
            } finally {
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f18795a;
        Object obj = this.f18798e;
        int i11 = this.f18796b;
        long j3 = this.f18797c;
        Object obj2 = this.d;
        switch (i10) {
            case 1:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = np.u1(i11).q1(j3);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new b2(i11, 0), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                ls.f(i11).k(302, new Object[0]);
                si.d0(i11).n2(si.f26807f2, j3);
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
                        TLRPC.User c22 = np.u1(i11).c2(Long.valueOf(j3));
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
                        TLRPC.User c23 = np.u1(i11).c2(Long.valueOf(k10.i(i11).e()));
                        if (c23 != null) {
                            c23.first_name = updateprofile.first_name;
                            c23.last_name = updateprofile.last_name;
                        }
                        k10.i(i11).v(true);
                        ls.f(i11).k(46, new Object[0]);
                        ls.f(i11).k(2, 1);
                        ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new l5(18));
                        ls.e().k(295, 3, Long.valueOf(j3));
                    } else {
                        long j10 = -j3;
                        TLRPC.Chat O0 = np.u1(i11).O0(Long.valueOf(j10));
                        String obj5 = editText.getText().toString();
                        String str3 = O0.title;
                        if (str3 != null && str3.equals(obj5)) {
                            t1Var.dismiss();
                            return;
                        }
                        O0.title = obj5;
                        ls.f(i11).k(2, 16);
                        np.u1(i11).C(j10, obj5, null);
                        ls.e().k(295, 3, Long.valueOf(j3));
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
        k01 k01Var = (k01) this.d;
        mp mpVar = (mp) this.f18798e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f18797c) {
            Drawable drawable = mpVar.f37593b;
            if (drawable instanceof cb0) {
                cb0 cb0Var = (cb0) drawable;
                if (this.f18796b >= 0) {
                    i7 = 100;
                } else {
                    i7 = -100;
                }
                cb0Var.s(i7, k01.e((Bitmap) pair.second));
                cb0Var.t(k01Var.M);
            }
            k01Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        int i11;
        String str;
        String str2;
        TLRPC.User user;
        TLRPC.Chat chat;
        ?? r42;
        TLRPC.User user2;
        int i12;
        cx cxVar2 = (cx) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.f18798e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j3 = ((tr) arrayList.get(0)).f27073a;
        Activity parentActivity = cxVar2.getParentActivity();
        final int i13 = this.f18796b;
        final bi.v3 v3Var = new bi.v3(y91Var, cxVar2, j3, i13);
        if (parentActivity == null) {
            return true;
        }
        np u12 = np.u1(i13);
        final long j10 = this.f18797c;
        u12.c2(Long.valueOf(j10));
        int i14 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i14 >= 0) {
            TLRPC.User c22 = np.u1(i13).c2(Long.valueOf(j3));
            str2 = p10.l(c22);
            i11 = i14;
            if (c22.bot_verification_icon == botVerifierSettings.icon) {
                o1.a(parentActivity, i13, j10, j3, botVerifierSettings, v3Var);
                return true;
            }
            v3Var = v3Var;
            r42 = 1;
            chat = null;
            user = c22;
            user2 = c22;
        } else {
            i11 = i14;
            TLRPC.Chat O0 = np.u1(i13).O0(Long.valueOf(-j3));
            if (O0 == null) {
                str = "";
            } else {
                str = O0.title;
            }
            str2 = str;
            if (O0.bot_verification_icon == botVerifierSettings.icon) {
                o1.a(parentActivity, i13, j10, j3, botVerifierSettings, v3Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = O0;
            r42 = 1;
            user2 = O0;
        }
        final org.telegram.ui.ActionBar.w2 j11 = o10.j(parentActivity, r42, r42, null);
        LinearLayout f10 = org.telegram.messenger.f3.f(parentActivity, r42);
        TLRPC.User user3 = user;
        TLRPC.Chat chat2 = chat;
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        int i15 = m6.Ti;
        ShapeDrawable e02 = m6.e0(L, L2, m6.x0(null, i15, false));
        p6 M = t6.M(i15);
        frameLayout.setBackground(e02);
        t6.j(frameLayout, e02, M, null, null);
        q9 q9Var = new q9(parentActivity);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        b9 b9Var = new b9((h6) null);
        b9Var.l(user2);
        q9Var.f(user2, b9Var);
        frameLayout.addView(q9Var, ma.e(28, 28, 51));
        q9 q9Var2 = new q9(parentActivity);
        q9Var2.setEmojiColorFilter(new PorterDuffColorFilter(m6.x0(null, m6.f29795z9, false), PorterDuff.Mode.SRC_IN));
        int i16 = 3;
        q9Var2.setAnimatedEmojiDrawable(p5.m(i13, botVerifierSettings.icon, null, 3));
        frameLayout.addView(q9Var2, ma.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        m5 m5Var = new m5(parentActivity);
        t6.X(m5Var, m6.f29489j5, null);
        m5Var.setTextSize(13);
        m5Var.setEllipsizeByGradient(true);
        m5Var.l(str2, false);
        m5Var.setWidthWrapContent(true);
        frameLayout.addView(m5Var, ma.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        f10.addView(frameLayout, ma.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i17 = m6.G6;
        t6.U(textView, i17, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (p10.u(user3)) {
            textView.setText(hd.N0(2131752916, null));
        } else if (user3 != null) {
            textView.setText(hd.N0(2131752909, null));
        } else if (org.telegram.messenger.v3.V(chat2)) {
            textView.setText(hd.N0(2131752915, null));
        } else {
            textView.setText(hd.N0(2131752911, null));
        }
        textView.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView, ma.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        t6.U(textView2, i17, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        ls.i(textView2);
        textView2.setText(j6.m(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131752910, str2)), textView2.getPaint().getFontMetricsInt(), false, null, 0));
        f10.addView(textView2, ma.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i18 = np.u1(i13).f25905m6;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final yb0 yb0Var = new yb0(parentActivity, null);
        yb0Var.setForceForceUseCenter(true);
        yb0Var.setText(hd.N0(2131752914, null));
        yb0Var.setLeftPadding(org.telegram.messenger.g0.L(2.0f));
        t6.U(editTextBoldCursor, i17, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        t6.C(editTextBoldCursor, m6.f29537lg, null);
        t6.l(editTextBoldCursor, 36, m6.f29554mg, null);
        if (hd.f24444a0) {
            i16 = 5;
        }
        editTextBoldCursor.setGravity(i16);
        editTextBoldCursor.setOnFocusChangeListener(new r9(yb0Var, editTextBoldCursor, 1));
        yb0Var.e(editTextBoldCursor);
        yb0Var.addView(editTextBoldCursor, ma.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        f10.addView(yb0Var, ma.o(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.k3());
        editTextBoldCursor.addTextChangedListener(new n1(editTextBoldCursor, i18, yb0Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            yb0Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            t6.U(textView3, m6.B6, null);
            textView3.setTextSize(1, 12.0f);
            if (i11 >= 0) {
                i12 = 2131752913;
            } else {
                i12 = 2131752912;
            }
            textView3.setText(hd.N0(i12, null));
            textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(27.0f));
            f10.addView(textView3, ma.c(-2.0f, -1));
        } else {
            f10.addView(new View(parentActivity), ma.c(12.0f, -1));
        }
        final hi.e eVar = new hi.e(parentActivity, null, true);
        eVar.i(textView.getText(), false, true);
        f10.addView(eVar, ma.o(-1, 48));
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
                    yb0 yb0Var2 = yb0Var;
                    yb0Var2.a(1.0f);
                    org.telegram.messenger.g0.E3(-6.0f, yb0Var2, null);
                    return;
                }
                eVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i19 = i13;
                setcustomverification.bot = np.u1(i19).q1(j10);
                setcustomverification.peer = np.u1(i19).l1(j3);
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
                ConnectionsManager.getInstance(i19).sendRequest(setcustomverification, new bi.q1(eVar2, j11, v3Var, 13));
            }
        });
        j11.Q0 = true;
        j11.R0 = true;
        j11.show();
        return true;
    }

    public l1(int i7, long j3, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f18795a = 1;
        this.f18796b = i7;
        this.f18797c = j3;
        this.d = tL_attachMenuBot;
        this.f18798e = runnable;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public l1(EditText editText, long j3, int i7, EditText editText2) {
        this.f18795a = 2;
        this.d = editText;
        this.f18797c = j3;
        this.f18796b = i7;
        this.f18798e = editText2;
    }

    public l1(cx cxVar, int i7, long j3, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.f18795a = 0;
        this.d = cxVar;
        this.f18796b = i7;
        this.f18797c = j3;
        this.f18798e = botVerifierSettings;
    }
}
