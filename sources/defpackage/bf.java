package defpackage;

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
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bf implements ed, wi3, gj8, jnb, ResultCallback {
    public final byte a;
    public final int b;
    public final long c;
    public final Object d;
    public final Object e;

    public bf(int i, long j, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.a = (byte) 2;
        this.b = i;
        this.c = j;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override
    public final boolean F() {
        return false;
    }

    @Override
    public final void a(wk4 wk4Var) {
        boolean z;
        pj2 pj2Var = (pj2) this.d;
        long j = this.c;
        mj2 mj2Var = (mj2) this.e;
        int i = this.b;
        synchronized (qj2.d) {
            Spannable spannable = (Spannable) pj2Var.a.get();
            if (spannable != null && pj2Var.b.get(Long.valueOf(j)) == mj2Var) {
                if ((spannable instanceof kj2) && !((kj2) spannable).a) {
                    qj2.a(spannable, i, (f06) wk4Var.b);
                    z = true;
                } else {
                    z = false;
                }
                gl.d3(new gj2(pj2Var, j, mj2Var, i, z, wk4Var));
            }
        }
    }

    @Override
    public final void onComplete(Object obj) {
        int i;
        anb anbVar = (anb) this.d;
        wd2 wd2Var = (wd2) this.e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.c) {
            Drawable drawable = wd2Var.b;
            if (drawable instanceof ye7) {
                ye7 ye7Var = (ye7) drawable;
                if (this.b >= 0) {
                    i = 100;
                } else {
                    i = -100;
                }
                ye7Var.r(i, anb.e((Bitmap) pair.second));
                ye7Var.s(anbVar.M);
            }
            anbVar.invalidate();
        }
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        boolean z3;
        Activity activity;
        String str;
        String str2;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.User user2;
        int i3;
        cj3 cj3Var2 = (cj3) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j = ((zc7) arrayList.get(0)).a;
        Activity parentActivity = cj3Var2.getParentActivity();
        final int i4 = this.b;
        final it0 it0Var = new it0(qvbVar, cj3Var2, j, i4);
        if (parentActivity == null) {
            return true;
        }
        na7 q1 = na7.q1(i4);
        final long j2 = this.c;
        q1.V1(Long.valueOf(j2));
        int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i5 >= 0) {
            TLRPC.User V1 = na7.q1(i4).V1(Long.valueOf(j));
            str2 = l7c.l(V1);
            z3 = true;
            if (V1.bot_verification_icon == botVerifierSettings.icon) {
                nt0.a(parentActivity, i4, j2, j, botVerifierSettings, it0Var);
                return true;
            }
            activity = parentActivity;
            user = V1;
            chat = null;
            user2 = V1;
        } else {
            z3 = true;
            activity = parentActivity;
            TLRPC.Chat K0 = na7.q1(i4).K0(Long.valueOf(-j));
            if (K0 == null) {
                str = "";
            } else {
                str = K0.title;
            }
            str2 = str;
            if (K0.bot_verification_icon == botVerifierSettings.icon) {
                nt0.a(activity, i4, j2, j, botVerifierSettings, it0Var);
                return true;
            }
            i4 = i4;
            chat = K0;
            user = null;
            user2 = K0;
        }
        boolean z4 = z3;
        final fx0 i6 = ug8.i(activity, z4, z4 ? 1 : 0, null);
        LinearLayout m = ir2.m(activity, z4 ? 1 : 0);
        TLRPC.User user3 = user;
        TLRPC.Chat chat2 = chat;
        m.setPadding(gl.L(16.0f), gl.L(20.0f), gl.L(16.0f), gl.L(8.0f));
        m.setClipChildren(false);
        m.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = gl.L(28.0f);
        int L2 = gl.L(28.0f);
        int i7 = bkb.Si;
        ShapeDrawable c0 = bkb.c0(L, L2, bkb.w0(null, i7, false));
        vkb M = zkb.M(i7);
        frameLayout.setBackground(c0);
        zkb.j(frameLayout, c0, M, null, null);
        be0 be0Var = new be0(activity);
        be0Var.setRoundRadius(gl.L(28.0f));
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(user2);
        be0Var.f(user2, pb0Var);
        frameLayout.addView(be0Var, nme.e(28, 28, 51));
        be0 be0Var2 = new be0(activity);
        be0Var2.setEmojiColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.y9, false), PorterDuff.Mode.SRC_IN));
        int i8 = 3;
        be0Var2.setAnimatedEmojiDrawable(vl.m(i4, botVerifierSettings.icon, null, 3));
        frameLayout.addView(be0Var2, nme.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        jia jiaVar = new jia(activity);
        zkb.W(jiaVar, bkb.i5, null);
        jiaVar.setTextSize(13);
        jiaVar.setEllipsizeByGradient(true);
        jiaVar.l(str2, false);
        jiaVar.setWidthWrapContent(true);
        frameLayout.addView(jiaVar, nme.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        m.addView(frameLayout, nme.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(activity);
        int i9 = bkb.F6;
        zkb.X(textView, i9, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (l7c.u(user3)) {
            textView.setText(k96.M0(2131752916, null));
        } else if (user3 != null) {
            textView.setText(k96.M0(2131752909, null));
        } else if (hc2.V(chat2)) {
            textView.setText(k96.M0(2131752915, null));
        } else {
            textView.setText(k96.M0(2131752911, null));
        }
        textView.setTypeface(gl.o());
        m.addView(textView, nme.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(activity);
        zkb.X(textView2, i9, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        kk7.i(textView2);
        textView2.setText(vu3.m(gl.T2(k96.a0(null, null, 2131752910, str2)), textView2.getPaint().getFontMetricsInt(), false, null, 0));
        m.addView(textView2, nme.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int f = na7.q1(i4).k4.F2.f();
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        final er7 er7Var = new er7(activity, null);
        er7Var.setForceForceUseCenter(true);
        er7Var.setText(k96.M0(2131752914, null));
        er7Var.setLeftPadding(gl.L(2.0f));
        zkb.X(editTextBoldCursor, i9, null);
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        zkb.C(editTextBoldCursor, bkb.kg, null);
        zkb.l(editTextBoldCursor, 36, bkb.lg, null);
        if (k96.a0) {
            i8 = 5;
        }
        editTextBoldCursor.setGravity(i8);
        editTextBoldCursor.setOnFocusChangeListener(new jt0(er7Var, editTextBoldCursor, (byte) 0));
        er7Var.e(editTextBoldCursor);
        er7Var.addView(editTextBoldCursor, nme.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        m.addView(er7Var, nme.o(-1, -2));
        editTextBoldCursor.addTextChangedListener(new fi());
        editTextBoldCursor.addTextChangedListener(new mt0(editTextBoldCursor, f, er7Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            er7Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(activity);
            zkb.X(textView3, bkb.A6, null);
            textView3.setTextSize(1, 12.0f);
            if (i5 >= 0) {
                i3 = 2131752913;
            } else {
                i3 = 2131752912;
            }
            textView3.setText(k96.M0(i3, null));
            textView3.setPadding(gl.L(14.0f), gl.L(7.0f), gl.L(14.0f), gl.L(27.0f));
            m.addView(textView3, nme.c(-2.0f, -1));
        } else {
            m.addView(new View(activity), nme.c(12.0f, -1));
        }
        final u41 u41Var = new u41(null, activity, true);
        u41Var.i(textView.getText(), false, true);
        m.addView(u41Var, nme.o(-1, 48));
        i6.O = m;
        u41Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                u41 u41Var2 = u41.this;
                if (u41Var2.R) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z5 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z5 && editTextBoldCursor2.getText().length() > f) {
                    er7 er7Var2 = er7Var;
                    er7Var2.a(1.0f);
                    gl.B3(-6.0f, er7Var2, null);
                    return;
                }
                u41Var2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags |= 1;
                int i10 = i4;
                setcustomverification.bot = na7.q1(i10).m1(j2);
                setcustomverification.peer = na7.q1(i10).h1(j);
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
                ConnectionsManager.getInstance(i10).sendRequest(setcustomverification, new en0(u41Var2, i6, it0Var, (byte) 6));
            }
        });
        i6.Q0 = true;
        i6.R0 = true;
        i6.show();
        return true;
    }

    @Override
    public final void run() {
        fk6 fk6Var = (fk6) this.d;
        fk6Var.e1.set(((q93) fk6Var.c1).m(this.c, this.b, (ByteBuffer) this.e));
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        long j = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                EditText editText = (EditText) obj2;
                EditText editText2 = (EditText) obj;
                if (editText.getText() != null) {
                    if (j > 0) {
                        TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(j));
                        String obj3 = editText.getText().toString();
                        String obj4 = editText2.getText().toString();
                        String str = V1.first_name;
                        String str2 = V1.last_name;
                        if (str == null) {
                            str = "";
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str.equals(obj3) && str2.equals(obj4)) {
                            hdVar.dismiss();
                            return;
                        }
                        TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                        updateprofile.flags = 3;
                        updateprofile.first_name = obj3;
                        V1.first_name = obj3;
                        updateprofile.last_name = obj4;
                        V1.last_name = obj4;
                        TLRPC.User V12 = na7.q1(i2).V1(Long.valueOf(y6c.h(i2).e()));
                        if (V12 != null) {
                            V12.first_name = updateprofile.first_name;
                            V12.last_name = updateprofile.last_name;
                        }
                        y6c.h(i2).u(true);
                        kk7.f(i2).k(46, new Object[0]);
                        kk7.f(i2).k(2, 1);
                        ConnectionsManager.getInstance(i2).sendRequest(updateprofile, new ce2((byte) 0));
                        kk7.e().k(295, 3, Long.valueOf(j));
                    } else {
                        long j2 = -j;
                        TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(j2));
                        String obj5 = editText.getText().toString();
                        String str3 = K0.title;
                        if (str3 != null && str3.equals(obj5)) {
                            hdVar.dismiss();
                            return;
                        }
                        K0.title = obj5;
                        kk7.f(i2).k(2, 16);
                        na7.q1(i2).y(j2, obj5, null);
                        kk7.e().k(295, 3, Long.valueOf(j));
                    }
                    hdVar.dismiss();
                    return;
                }
                return;
            default:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = na7.q1(i2).m1(j);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_toggleBotInAttachMenu, new vv0(i2, (byte) 0), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                kk7.f(i2).k(302, new Object[0]);
                hq6.d0(i2).k2(hq6.f2 ? 1 : 0, j);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
    }

    public bf(cj3 cj3Var, int i, long j, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.a = (byte) 1;
        this.d = cj3Var;
        this.b = i;
        this.c = j;
        this.e = botVerifierSettings;
    }

    public bf(fk6 fk6Var, ByteBuffer byteBuffer, long j, int i) {
        this.a = (byte) 4;
        this.d = fk6Var;
        this.e = byteBuffer;
        this.c = j;
        this.b = i;
    }

    public bf(EditText editText, long j, int i, EditText editText2) {
        this.a = (byte) 0;
        this.d = editText;
        this.c = j;
        this.b = i;
        this.e = editText2;
    }

    public bf(Object obj, long j, Object obj2, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.e = obj2;
        this.b = i;
    }

    @Override
    public final void onError(Throwable th) {
    }
}
