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
public final class cg implements ee, hk3, jl8, kpb, ResultCallback {
    public final byte a;
    public final int b;
    public final long c;
    public final Object d;
    public final Object e;

    public cg(int i, long j, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
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
    public final void a(wm4 wm4Var) {
        boolean z;
        dl2 dl2Var = (dl2) this.d;
        long j = this.c;
        al2 al2Var = (al2) this.e;
        int i = this.b;
        synchronized (el2.d) {
            Spannable spannable = (Spannable) dl2Var.a.get();
            if (spannable != null && dl2Var.b.get(Long.valueOf(j)) == al2Var) {
                if ((spannable instanceof yk2) && !((yk2) spannable).a) {
                    el2.a(spannable, i, (f26) wm4Var.b);
                    z = true;
                } else {
                    z = false;
                }
                gm.c3(new uk2(dl2Var, j, al2Var, i, z, wm4Var));
            }
        }
    }

    @Override
    public final void onComplete(Object obj) {
        int i;
        bpb bpbVar = (bpb) this.d;
        hf2 hf2Var = (hf2) this.e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.c) {
            Drawable drawable = hf2Var.b;
            if (drawable instanceof ah7) {
                ah7 ah7Var = (ah7) drawable;
                if (this.b >= 0) {
                    i = 100;
                } else {
                    i = -100;
                }
                ah7Var.r(i, bpb.e((Bitmap) pair.second));
                ah7Var.s(bpbVar.M);
            }
            bpbVar.invalidate();
        }
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        boolean z3;
        Activity activity;
        String str;
        String str2;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.User user2;
        int i3;
        nk3 nk3Var2 = (nk3) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j = ((bf7) arrayList.get(0)).a;
        Activity parentActivity = nk3Var2.getParentActivity();
        final int i4 = this.b;
        final qu0 qu0Var = new qu0(sxbVar, nk3Var2, j, i4);
        if (parentActivity == null) {
            return true;
        }
        oc7 r1 = oc7.r1(i4);
        final long j2 = this.c;
        r1.W1(Long.valueOf(j2));
        int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i5 >= 0) {
            TLRPC.User W1 = oc7.r1(i4).W1(Long.valueOf(j));
            str2 = m9c.l(W1);
            z3 = true;
            if (W1.bot_verification_icon == botVerifierSettings.icon) {
                vu0.a(parentActivity, i4, j2, j, botVerifierSettings, qu0Var);
                return true;
            }
            activity = parentActivity;
            user = W1;
            chat = null;
            user2 = W1;
        } else {
            z3 = true;
            activity = parentActivity;
            TLRPC.Chat L0 = oc7.r1(i4).L0(Long.valueOf(-j));
            if (L0 == null) {
                str = "";
            } else {
                str = L0.title;
            }
            str2 = str;
            if (L0.bot_verification_icon == botVerifierSettings.icon) {
                vu0.a(activity, i4, j2, j, botVerifierSettings, qu0Var);
                return true;
            }
            i4 = i4;
            chat = L0;
            user = null;
            user2 = L0;
        }
        boolean z4 = z3;
        final my0 i6 = wi8.i(activity, z4, z4 ? 1 : 0, null);
        LinearLayout l = td4.l(activity, z4 ? 1 : 0);
        TLRPC.User user3 = user;
        TLRPC.Chat chat2 = chat;
        l.setPadding(gm.L(16.0f), gm.L(20.0f), gm.L(16.0f), gm.L(8.0f));
        l.setClipChildren(false);
        l.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = gm.L(28.0f);
        int L2 = gm.L(28.0f);
        int i7 = cmb.Si;
        ShapeDrawable c0 = cmb.c0(L, L2, cmb.w0(null, i7, false));
        wmb M = anb.M(i7);
        frameLayout.setBackground(c0);
        anb.j(frameLayout, c0, M, null, null);
        bf0 bf0Var = new bf0(activity);
        bf0Var.setRoundRadius(gm.L(28.0f));
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(user2);
        bf0Var.f(user2, pc0Var);
        frameLayout.addView(bf0Var, qoe.e(28, 28, 51));
        bf0 bf0Var2 = new bf0(activity);
        bf0Var2.setEmojiColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.y9, false), PorterDuff.Mode.SRC_IN));
        int i8 = 3;
        bf0Var2.setAnimatedEmojiDrawable(vm.m(i4, botVerifierSettings.icon, null, 3));
        frameLayout.addView(bf0Var2, qoe.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        lka lkaVar = new lka(activity);
        anb.W(lkaVar, cmb.i5, null);
        lkaVar.setTextSize(13);
        lkaVar.setEllipsizeByGradient(true);
        lkaVar.l(str2, false);
        lkaVar.setWidthWrapContent(true);
        frameLayout.addView(lkaVar, qoe.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        l.addView(frameLayout, qoe.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(activity);
        int i9 = cmb.F6;
        anb.X(textView, i9, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (m9c.v(user3)) {
            textView.setText(jb6.M0(2131752881, null));
        } else if (user3 != null) {
            textView.setText(jb6.M0(2131752874, null));
        } else if (sd2.V(chat2)) {
            textView.setText(jb6.M0(2131752880, null));
        } else {
            textView.setText(jb6.M0(2131752876, null));
        }
        textView.setTypeface(gm.o());
        l.addView(textView, qoe.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(activity);
        anb.X(textView2, i9, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        nm7.i(textView2);
        textView2.setText(gw3.m(gm.S2(jb6.a0(null, null, 2131752875, str2)), textView2.getPaint().getFontMetricsInt(), false, null, 0));
        l.addView(textView2, qoe.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int f = oc7.r1(i4).l4.F2.f();
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        final gt7 gt7Var = new gt7(activity, null);
        gt7Var.setForceForceUseCenter(true);
        gt7Var.setText(jb6.M0(2131752879, null));
        gt7Var.setLeftPadding(gm.L(2.0f));
        anb.X(editTextBoldCursor, i9, null);
        editTextBoldCursor.setCursorSize(gm.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        anb.C(editTextBoldCursor, cmb.kg, null);
        anb.l(editTextBoldCursor, 36, cmb.lg, null);
        if (jb6.a0) {
            i8 = 5;
        }
        editTextBoldCursor.setGravity(i8);
        editTextBoldCursor.setOnFocusChangeListener(new ru0(gt7Var, editTextBoldCursor, (byte) 0));
        gt7Var.e(editTextBoldCursor);
        gt7Var.addView(editTextBoldCursor, qoe.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        l.addView(gt7Var, qoe.o(-1, -2));
        editTextBoldCursor.addTextChangedListener(new fj());
        editTextBoldCursor.addTextChangedListener(new uu0(editTextBoldCursor, f, gt7Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            gt7Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(activity);
            anb.X(textView3, cmb.A6, null);
            textView3.setTextSize(1, 12.0f);
            if (i5 >= 0) {
                i3 = 2131752878;
            } else {
                i3 = 2131752877;
            }
            textView3.setText(jb6.M0(i3, null));
            textView3.setPadding(gm.L(14.0f), gm.L(7.0f), gm.L(14.0f), gm.L(27.0f));
            l.addView(textView3, qoe.c(-2.0f, -1));
        } else {
            l.addView(new View(activity), qoe.c(12.0f, -1));
        }
        final b61 b61Var = new b61(null, activity, true);
        b61Var.i(textView.getText(), false, true);
        l.addView(b61Var, qoe.o(-1, 48));
        i6.O = l;
        b61Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                b61 b61Var2 = b61.this;
                if (b61Var2.R) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z5 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z5 && editTextBoldCursor2.getText().length() > f) {
                    gt7 gt7Var2 = gt7Var;
                    gt7Var2.a(1.0f);
                    gm.A3(-6.0f, gt7Var2, null);
                    return;
                }
                b61Var2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags |= 1;
                int i10 = i4;
                setcustomverification.bot = oc7.r1(i10).n1(j2);
                setcustomverification.peer = oc7.r1(i10).i1(j);
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
                ConnectionsManager.getInstance(i10).sendRequest(setcustomverification, new eo0(b61Var2, i6, qu0Var, (byte) 6));
            }
        });
        i6.Q0 = true;
        i6.R0 = true;
        i6.show();
        return true;
    }

    @Override
    public final void r(he heVar, int i) {
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
                        TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(j));
                        String obj3 = editText.getText().toString();
                        String obj4 = editText2.getText().toString();
                        String str = W1.first_name;
                        String str2 = W1.last_name;
                        if (str == null) {
                            str = "";
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str.equals(obj3) && str2.equals(obj4)) {
                            heVar.dismiss();
                            return;
                        }
                        TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                        updateprofile.flags = 3;
                        updateprofile.first_name = obj3;
                        W1.first_name = obj3;
                        updateprofile.last_name = obj4;
                        W1.last_name = obj4;
                        TLRPC.User W12 = oc7.r1(i2).W1(Long.valueOf(z8c.h(i2).e()));
                        if (W12 != null) {
                            W12.first_name = updateprofile.first_name;
                            W12.last_name = updateprofile.last_name;
                        }
                        z8c.h(i2).u(true);
                        nm7.f(i2).k(47, new Object[0]);
                        nm7.f(i2).k(2, 1);
                        ConnectionsManager.getInstance(i2).sendRequest(updateprofile, new nf2((byte) 0));
                        nm7.e().k(297, 3, Long.valueOf(j));
                    } else {
                        long j2 = -j;
                        TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(j2));
                        String obj5 = editText.getText().toString();
                        String str3 = L0.title;
                        if (str3 != null && str3.equals(obj5)) {
                            heVar.dismiss();
                            return;
                        }
                        L0.title = obj5;
                        nm7.f(i2).k(2, 16);
                        oc7.r1(i2).y(j2, obj5, null);
                        nm7.e().k(297, 3, Long.valueOf(j));
                    }
                    heVar.dismiss();
                    return;
                }
                return;
            default:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = oc7.r1(i2).n1(j);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_toggleBotInAttachMenu, new dx0(i2, (byte) 0), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                nm7.f(i2).k(304, new Object[0]);
                hs6.d0(i2).k2(hs6.f2 ? 1 : 0, j);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void run() {
        im6 im6Var = (im6) this.d;
        im6Var.e1.set(((cb3) im6Var.c1).m(this.c, this.b, (ByteBuffer) this.e));
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
    }

    public cg(nk3 nk3Var, int i, long j, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.a = (byte) 1;
        this.d = nk3Var;
        this.b = i;
        this.c = j;
        this.e = botVerifierSettings;
    }

    public cg(im6 im6Var, ByteBuffer byteBuffer, long j, int i) {
        this.a = (byte) 4;
        this.d = im6Var;
        this.e = byteBuffer;
        this.c = j;
        this.b = i;
    }

    public cg(EditText editText, long j, int i, EditText editText2) {
        this.a = (byte) 0;
        this.d = editText;
        this.c = j;
        this.b = i;
        this.e = editText2;
    }

    public cg(Object obj, long j, Object obj2, int i, byte b) {
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
