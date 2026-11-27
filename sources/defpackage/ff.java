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
public final class ff implements fd, oj3, tm8, jrb, ResultCallback {
    public final byte a;
    public final int b;
    public final long c;
    public final Object d;
    public final Object e;

    public ff(int i, long j, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.a = (byte) 2;
        this.b = i;
        this.c = j;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void f(um4 um4Var) {
        boolean z;
        lk2 lk2Var = (lk2) this.d;
        long j = this.c;
        ik2 ik2Var = (ik2) this.e;
        int i = this.b;
        synchronized (mk2.d) {
            Spannable spannable = (Spannable) lk2Var.a.get();
            if (spannable != null && lk2Var.b.get(Long.valueOf(j)) == ik2Var) {
                if ((spannable instanceof gk2) && !((gk2) spannable).a) {
                    mk2.a(spannable, i, (j26) um4Var.b);
                    z = true;
                } else {
                    z = false;
                }
                hl.c3(new ck2(lk2Var, j, ik2Var, i, z, um4Var));
            }
        }
    }

    @Override
    public final void onComplete(Object obj) {
        int i;
        zqb zqbVar = (zqb) this.d;
        ne2 ne2Var = (ne2) this.e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.c) {
            Drawable drawable = ne2Var.b;
            if (drawable instanceof hh7) {
                hh7 hh7Var = (hh7) drawable;
                if (this.b >= 0) {
                    i = 100;
                } else {
                    i = -100;
                }
                hh7Var.r(i, zqb.e((Bitmap) pair.second));
                hh7Var.s(zqbVar.M);
            }
            zqbVar.invalidate();
        }
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        boolean z3;
        Activity activity;
        String str;
        String str2;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.User user2;
        int i3;
        uj3 uj3Var2 = (uj3) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j = ((if7) arrayList.get(0)).a;
        Activity parentActivity = uj3Var2.getParentActivity();
        final int i4 = this.b;
        final qt0 qt0Var = new qt0(tzbVar, uj3Var2, j, i4);
        if (parentActivity == null) {
            return true;
        }
        uc7 s1 = uc7.s1(i4);
        final long j2 = this.c;
        s1.X1(Long.valueOf(j2));
        int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i5 >= 0) {
            TLRPC.User X1 = uc7.s1(i4).X1(Long.valueOf(j));
            str2 = lbc.l(X1);
            z3 = true;
            if (X1.bot_verification_icon == botVerifierSettings.icon) {
                vt0.a(parentActivity, i4, j2, j, botVerifierSettings, qt0Var);
                return true;
            }
            activity = parentActivity;
            user = X1;
            chat = null;
            user2 = X1;
        } else {
            z3 = true;
            activity = parentActivity;
            TLRPC.Chat M0 = uc7.s1(i4).M0(Long.valueOf(-j));
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            str2 = str;
            if (M0.bot_verification_icon == botVerifierSettings.icon) {
                vt0.a(activity, i4, j2, j, botVerifierSettings, qt0Var);
                return true;
            }
            i4 = i4;
            chat = M0;
            user = null;
            user2 = M0;
        }
        boolean z4 = z3;
        final nx0 i6 = ik8.i(activity, z4, z4 ? 1 : 0, null);
        LinearLayout m = bs2.m(activity, z4 ? 1 : 0);
        TLRPC.User user3 = user;
        TLRPC.Chat chat2 = chat;
        m.setPadding(hl.L(16.0f), hl.L(20.0f), hl.L(16.0f), hl.L(8.0f));
        m.setClipChildren(false);
        m.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = hl.L(28.0f);
        int L2 = hl.L(28.0f);
        int i7 = aob.Ti;
        ShapeDrawable c0 = aob.c0(L, L2, aob.w0(null, i7, false));
        uob M = yob.M(i7);
        frameLayout.setBackground(c0);
        yob.j(frameLayout, c0, M, null, null);
        de0 de0Var = new de0(activity);
        de0Var.setRoundRadius(hl.L(28.0f));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(user2);
        de0Var.f(user2, rb0Var);
        frameLayout.addView(de0Var, tre.e(28, 28, 51));
        de0 de0Var2 = new de0(activity);
        de0Var2.setEmojiColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.z9, false), PorterDuff.Mode.SRC_IN));
        int i8 = 3;
        de0Var2.setAnimatedEmojiDrawable(wl.m(i4, botVerifierSettings.icon, null, 3));
        frameLayout.addView(de0Var2, tre.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        ema emaVar = new ema(activity);
        yob.W(emaVar, aob.j5, null);
        emaVar.setTextSize(13);
        emaVar.setEllipsizeByGradient(true);
        emaVar.l(str2, false);
        emaVar.setWidthWrapContent(true);
        frameLayout.addView(emaVar, tre.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        m.addView(frameLayout, tre.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(activity);
        int i9 = aob.G6;
        yob.X(textView, i9, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (lbc.v(user3)) {
            textView.setText(ob6.M0(2131752909, null));
        } else if (user3 != null) {
            textView.setText(ob6.M0(2131752902, null));
        } else if (xc2.V(chat2)) {
            textView.setText(ob6.M0(2131752908, null));
        } else {
            textView.setText(ob6.M0(2131752904, null));
        }
        textView.setTypeface(hl.o());
        m.addView(textView, tre.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(activity);
        yob.X(textView2, i9, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        jn7.i(textView2);
        textView2.setText(pv3.m(hl.S2(ob6.a0(null, null, 2131752903, str2)), textView2.getPaint().getFontMetricsInt(), false, null, 0));
        m.addView(textView2, tre.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int f = uc7.s1(i4).k4.N2.f();
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        final lu7 lu7Var = new lu7(activity, null);
        lu7Var.setForceForceUseCenter(true);
        lu7Var.setText(ob6.M0(2131752907, null));
        lu7Var.setLeftPadding(hl.L(2.0f));
        yob.X(editTextBoldCursor, i9, null);
        editTextBoldCursor.setCursorSize(hl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        yob.C(editTextBoldCursor, aob.lg, null);
        yob.l(editTextBoldCursor, 36, aob.mg, null);
        if (ob6.a0) {
            i8 = 5;
        }
        editTextBoldCursor.setGravity(i8);
        editTextBoldCursor.setOnFocusChangeListener(new rt0(lu7Var, editTextBoldCursor, (byte) 0));
        lu7Var.e(editTextBoldCursor);
        lu7Var.addView(editTextBoldCursor, tre.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        m.addView(lu7Var, tre.o(-1, -2));
        editTextBoldCursor.addTextChangedListener(new gi());
        editTextBoldCursor.addTextChangedListener(new ut0(editTextBoldCursor, f, lu7Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            lu7Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(activity);
            yob.X(textView3, aob.B6, null);
            textView3.setTextSize(1, 12.0f);
            if (i5 >= 0) {
                i3 = 2131752906;
            } else {
                i3 = 2131752905;
            }
            textView3.setText(ob6.M0(i3, null));
            textView3.setPadding(hl.L(14.0f), hl.L(7.0f), hl.L(14.0f), hl.L(27.0f));
            m.addView(textView3, tre.c(-2.0f, -1));
        } else {
            m.addView(new View(activity), tre.c(12.0f, -1));
        }
        final c51 c51Var = new c51(null, activity, true);
        c51Var.i(textView.getText(), false, true);
        m.addView(c51Var, tre.o(-1, 48));
        i6.O = m;
        c51Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                c51 c51Var2 = c51.this;
                if (c51Var2.R) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z5 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z5 && editTextBoldCursor2.getText().length() > f) {
                    lu7 lu7Var2 = lu7Var;
                    lu7Var2.a(1.0f);
                    hl.A3(-6.0f, lu7Var2, null);
                    return;
                }
                c51Var2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags |= 1;
                int i10 = i4;
                setcustomverification.bot = uc7.s1(i10).o1(j2);
                setcustomverification.peer = uc7.s1(i10).j1(j);
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
                ConnectionsManager.getInstance(i10).sendRequest(setcustomverification, new fn0(c51Var2, i6, qt0Var, (byte) 6));
            }
        });
        i6.Q0 = true;
        i6.R0 = true;
        i6.show();
        return true;
    }

    @Override
    public final void run() {
        km6 km6Var = (km6) this.d;
        km6Var.e1.set(((ja3) km6Var.c1).m(this.c, this.b, (ByteBuffer) this.e));
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    @Override
    public final void w(id idVar, int i) {
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
                        TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(j));
                        String obj3 = editText.getText().toString();
                        String obj4 = editText2.getText().toString();
                        String str = X1.first_name;
                        String str2 = X1.last_name;
                        if (str == null) {
                            str = "";
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str.equals(obj3) && str2.equals(obj4)) {
                            idVar.dismiss();
                            return;
                        }
                        TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                        updateprofile.flags = 3;
                        updateprofile.first_name = obj3;
                        X1.first_name = obj3;
                        updateprofile.last_name = obj4;
                        X1.last_name = obj4;
                        TLRPC.User X12 = uc7.s1(i2).X1(Long.valueOf(yac.h(i2).e()));
                        if (X12 != null) {
                            X12.first_name = updateprofile.first_name;
                            X12.last_name = updateprofile.last_name;
                        }
                        yac.h(i2).u(true);
                        jn7.f(i2).k(47, new Object[0]);
                        jn7.f(i2).k(2, 1);
                        ConnectionsManager.getInstance(i2).sendRequest(updateprofile, new xe2((byte) 0));
                        jn7.e().k(296, 3, Long.valueOf(j));
                    } else {
                        long j2 = -j;
                        TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(j2));
                        String obj5 = editText.getText().toString();
                        String str3 = M0.title;
                        if (str3 != null && str3.equals(obj5)) {
                            idVar.dismiss();
                            return;
                        }
                        M0.title = obj5;
                        jn7.f(i2).k(2, 16);
                        uc7.s1(i2).A(j2, obj5, null);
                        jn7.e().k(296, 3, Long.valueOf(j));
                    }
                    idVar.dismiss();
                    return;
                }
                return;
            default:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = uc7.s1(i2).o1(j);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_toggleBotInAttachMenu, new fw0(i2, (byte) 0), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                jn7.f(i2).k(303, new Object[0]);
                ls6.d0(i2).k2(ls6.f2 ? 1 : 0, j);
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

    public ff(uj3 uj3Var, int i, long j, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.a = (byte) 1;
        this.d = uj3Var;
        this.b = i;
        this.c = j;
        this.e = botVerifierSettings;
    }

    public ff(km6 km6Var, ByteBuffer byteBuffer, long j, int i) {
        this.a = (byte) 4;
        this.d = km6Var;
        this.e = byteBuffer;
        this.c = j;
        this.b = i;
    }

    public ff(EditText editText, long j, int i, EditText editText2) {
        this.a = (byte) 0;
        this.d = editText;
        this.c = j;
        this.b = i;
        this.e = editText2;
    }

    public ff(Object obj, long j, Object obj2, int i, byte b) {
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
