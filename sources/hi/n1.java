package hi;

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
import bi.bb;
import c8.ha;
import di.v5;
import java.util.ArrayList;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.xr;
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
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.tw;
import org.telegram.ui.z91;
import org.telegram.ui.zw;
public final class n1 implements tw, org.telegram.ui.ActionBar.r1, ni.p, ResultCallback {
    public final int f14808a;
    public final int f14809b;
    public final long f14810c;
    public final Object d;
    public final Object f14811e;

    public n1(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f14808a = i10;
        this.d = obj;
        this.f14810c = j3;
        this.f14811e = obj2;
        this.f14809b = i7;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(zw zwVar) {
        return false;
    }

    @Override
    public void b(j2.n nVar) {
        boolean z9;
        ni.l lVar = (ni.l) this.d;
        long j3 = this.f14810c;
        ni.i iVar = (ni.i) this.f14811e;
        int i7 = this.f14809b;
        synchronized (ni.m.d) {
            try {
                Spannable spannable = (Spannable) lVar.f20638a.get();
                if (spannable != null && lVar.f20639b.get(Long.valueOf(j3)) == iVar) {
                    if ((spannable instanceof ni.g) && !((ni.g) spannable).f20628a) {
                        ni.m.a(spannable, i7, (com.google.android.gms.internal.play_billing.s0) nVar.f16456b);
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    org.telegram.messenger.g0.h3(new ni.b(lVar, j3, iVar, i7, z9, nVar));
                }
            } finally {
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f14808a;
        Object obj = this.f14811e;
        int i11 = this.f14809b;
        long j3 = this.f14810c;
        Object obj2 = this.d;
        switch (i10) {
            case 1:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = qp.s1(i11).o1(j3);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new g2(i11, 0), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                qs.f(i11).k(299, new Object[0]);
                ui.b0(i11).i2(ui.f25801c2, j3);
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
                        TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(j3));
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
                            u1Var.dismiss();
                            return;
                        }
                        TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                        updateprofile.flags = 3;
                        updateprofile.first_name = obj3;
                        a22.first_name = obj3;
                        updateprofile.last_name = obj4;
                        a22.last_name = obj4;
                        TLRPC.User a23 = qp.s1(i11).a2(Long.valueOf(p10.i(i11).e()));
                        if (a23 != null) {
                            a23.first_name = updateprofile.first_name;
                            a23.last_name = updateprofile.last_name;
                        }
                        p10.i(i11).v(true);
                        qs.f(i11).k(46, new Object[0]);
                        qs.f(i11).k(2, 1);
                        ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new v5(18));
                        qs.e().k(292, 3, Long.valueOf(j3));
                    } else {
                        long j10 = -j3;
                        TLRPC.Chat M0 = qp.s1(i11).M0(Long.valueOf(j10));
                        String obj5 = editText.getText().toString();
                        String str3 = M0.title;
                        if (str3 != null && str3.equals(obj5)) {
                            u1Var.dismiss();
                            return;
                        }
                        M0.title = obj5;
                        qs.f(i11).k(2, 16);
                        qp.s1(i11).C(j10, obj5, null);
                        qs.e().k(292, 3, Long.valueOf(j3));
                    }
                    u1Var.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        int i7;
        zz0 zz0Var = (zz0) this.d;
        uo uoVar = (uo) this.f14811e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f14810c) {
            Drawable drawable = uoVar.f38726b;
            if (drawable instanceof qa0) {
                qa0 qa0Var = (qa0) drawable;
                if (this.f14809b >= 0) {
                    i7 = 100;
                } else {
                    i7 = -100;
                }
                qa0Var.s(i7, zz0.e((Bitmap) pair.second));
                qa0Var.t(zz0Var.L);
            }
            zz0Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        int i11;
        String str;
        String str2;
        TLRPC.User user;
        TLRPC.Chat chat;
        ?? r42;
        TLRPC.User user2;
        int i12;
        zw zwVar2 = (zw) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.f14811e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j3 = ((xr) arrayList.get(0)).f26524a;
        Activity parentActivity = zwVar2.getParentActivity();
        final int i13 = this.f14809b;
        final o1 o1Var = new o1(z91Var, zwVar2, j3, i13);
        if (parentActivity == null) {
            return true;
        }
        qp s12 = qp.s1(i13);
        final long j10 = this.f14810c;
        s12.a2(Long.valueOf(j10));
        int i14 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i14 >= 0) {
            TLRPC.User a22 = qp.s1(i13).a2(Long.valueOf(j3));
            str2 = t10.k(a22);
            i11 = i14;
            if (a22.bot_verification_icon == botVerifierSettings.icon) {
                s1.a(parentActivity, i13, j10, j3, botVerifierSettings, o1Var);
                return true;
            }
            o1Var = o1Var;
            r42 = 1;
            chat = null;
            user = a22;
            user2 = a22;
        } else {
            i11 = i14;
            TLRPC.Chat M0 = qp.s1(i13).M0(Long.valueOf(-j3));
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            str2 = str;
            if (M0.bot_verification_icon == botVerifierSettings.icon) {
                s1.a(parentActivity, i13, j10, j3, botVerifierSettings, o1Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = M0;
            r42 = 1;
            user2 = M0;
        }
        final org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(parentActivity, r42, r42, null);
        LinearLayout e10 = k5.e(parentActivity, r42);
        TLRPC.User user3 = user;
        TLRPC.Chat chat2 = chat;
        e10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        e10.setClipChildren(false);
        e10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        int i15 = m6.Qi;
        ShapeDrawable e02 = m6.e0(L, L2, m6.x0(null, i15, false));
        p6 M = t6.M(i15);
        frameLayout.setBackground(e02);
        t6.j(frameLayout, e02, M, null, null);
        k9 k9Var = new k9(parentActivity);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        v8 v8Var = new v8((h6) null);
        v8Var.l(user2);
        k9Var.e(user2, v8Var);
        frameLayout.addView(k9Var, ha.e(28, 28, 51));
        k9 k9Var2 = new k9(parentActivity);
        k9Var2.setEmojiColorFilter(new PorterDuffColorFilter(m6.x0(null, m6.z9, false), PorterDuff.Mode.SRC_IN));
        int i16 = 3;
        k9Var2.setAnimatedEmojiDrawable(h5.m(i13, botVerifierSettings.icon, null, 3));
        frameLayout.addView(k9Var2, ha.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        m5 m5Var = new m5(parentActivity);
        t6.X(m5Var, m6.f27998j5, null);
        m5Var.setTextSize(13);
        m5Var.setEllipsizeByGradient(true);
        m5Var.l(str2, false);
        m5Var.setWidthWrapContent(true);
        frameLayout.addView(m5Var, ha.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        e10.addView(frameLayout, ha.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i17 = m6.G6;
        t6.U(textView, i17, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (t10.t(user3)) {
            textView.setText(id.M0(2131752928, null));
        } else if (user3 != null) {
            textView.setText(id.M0(2131752921, null));
        } else if (org.telegram.messenger.t3.V(chat2)) {
            textView.setText(id.M0(2131752927, null));
        } else {
            textView.setText(id.M0(2131752923, null));
        }
        textView.setTypeface(org.telegram.messenger.g0.o());
        e10.addView(textView, ha.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        t6.U(textView2, i17, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        qs.i(textView2);
        textView2.setText(i6.m(org.telegram.messenger.g0.X2(id.a0(null, null, 2131752922, str2)), textView2.getPaint().getFontMetricsInt(), false, null, 0));
        e10.addView(textView2, ha.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i18 = qp.s1(i13).f24820j6;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final lb0 lb0Var = new lb0(parentActivity, null);
        lb0Var.setForceForceUseCenter(true);
        lb0Var.setText(id.M0(2131752926, null));
        lb0Var.setLeftPadding(org.telegram.messenger.g0.L(2.0f));
        t6.U(editTextBoldCursor, i17, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        t6.C(editTextBoldCursor, m6.f27990ig, null);
        t6.l(editTextBoldCursor, 36, m6.f28009jg, null);
        if (id.f23161a0) {
            i16 = 5;
        }
        editTextBoldCursor.setGravity(i16);
        editTextBoldCursor.setOnFocusChangeListener(new bb(lb0Var, editTextBoldCursor, 1));
        lb0Var.e(editTextBoldCursor);
        lb0Var.addView(editTextBoldCursor, ha.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        e10.addView(lb0Var, ha.o(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.j3());
        editTextBoldCursor.addTextChangedListener(new r1(editTextBoldCursor, i18, lb0Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            lb0Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            t6.U(textView3, m6.B6, null);
            textView3.setTextSize(1, 12.0f);
            if (i11 >= 0) {
                i12 = 2131752925;
            } else {
                i12 = 2131752924;
            }
            textView3.setText(id.M0(i12, null));
            textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(27.0f));
            e10.addView(textView3, ha.c(-2.0f, -1));
        } else {
            e10.addView(new View(parentActivity), ha.c(12.0f, -1));
        }
        final fi.d dVar = new fi.d(parentActivity, null, true);
        dVar.i(textView.getText(), false, true);
        e10.addView(dVar, ha.o(-1, 48));
        h.N = e10;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                fi.d dVar2 = fi.d.this;
                if (dVar2.Q) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z11 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z11 && editTextBoldCursor2.getText().length() > i18) {
                    lb0 lb0Var2 = lb0Var;
                    lb0Var2.a(1.0f);
                    org.telegram.messenger.g0.G3(-6.0f, lb0Var2, null);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i19 = i13;
                setcustomverification.bot = qp.s1(i19).o1(j10);
                setcustomverification.peer = qp.s1(i19).j1(j3);
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
                ConnectionsManager.getInstance(i19).sendRequest(setcustomverification, new bi.f2(dVar2, h, o1Var, 7));
            }
        });
        h.P0 = true;
        h.Q0 = true;
        h.show();
        return true;
    }

    public n1(int i7, long j3, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f14808a = 1;
        this.f14809b = i7;
        this.f14810c = j3;
        this.d = tL_attachMenuBot;
        this.f14811e = runnable;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public n1(EditText editText, long j3, int i7, EditText editText2) {
        this.f14808a = 3;
        this.d = editText;
        this.f14810c = j3;
        this.f14809b = i7;
        this.f14811e = editText2;
    }

    public n1(zw zwVar, int i7, long j3, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.f14808a = 0;
        this.d = zwVar;
        this.f14809b = i7;
        this.f14810c = j3;
        this.f14811e = botVerifierSettings;
    }
}
