package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.TwoStepVerificationActivity;
public final class jf implements m7, jp7, c59, eu2, ee, w18, i59, a29, gk, zy5, uc0, hk3, m52, xe7 {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public jf(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void a(String str) {
        yv1 yv1Var = (yv1) this.b;
        er0 er0Var = (er0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = jb6.D0().y.getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !qc9.c0().contains(str))) {
            er0Var.setOnClickListener(new oh(yv1Var, str, language, charSequence, er0Var, (byte) 4));
        } else {
            er0Var.setClickable(false);
        }
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        p82 p82Var = (p82) this.b;
        ll0 ll0Var = (ll0) this.c;
        i22 i22Var = (i22) this.d;
        ch9 ch9Var = p82Var.r;
        if (messageMedia != null && messageMedia.geo != null) {
            of9 of9Var = ch9Var.R3;
            if (of9Var != null) {
                of9Var.d();
            }
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) ll0Var.b;
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                pageblockmap.w = 600;
                pageblockmap.h = 400;
            }
            of9 of9Var2 = ch9Var.R3;
            if (of9Var2 != null) {
                of9Var2.h();
            }
            p82Var.Z(true);
            i22Var.a(true);
            ch9Var.post(new g82(p82Var, ll0Var, (byte) 0));
        }
    }

    @Override
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 7:
                rx0 rx0Var = (rx0) obj3;
                ht7 ht7Var = (ht7) obj2;
                String str = (String) obj;
                if (i != 3) {
                    ht7Var.dismiss();
                }
                rx0Var.d.E.D(str, kt6.C(i).toLowerCase(Locale.ROOT), false);
                return;
            default:
                ht7 ht7Var2 = (ht7) obj3;
                e32 e32Var = (e32) obj2;
                String str2 = (String) obj;
                if (i != 3) {
                    ht7Var2.dismiss();
                }
                e32Var.getWebViewContainer().D(str2, kt6.C(i).toLowerCase(Locale.ROOT), false);
                return;
        }
    }

    @Override
    public final boolean mo14d(float f, float f2, int i, final View view) {
        String str;
        int i2;
        final g81 g81Var = (g81) this.b;
        r59 r59Var = (r59) this.c;
        d dVar = (d) this.d;
        w81 w81Var = g81Var.f;
        h81 h81Var = (h81) r59Var.getAdapter();
        final p81 p81Var = (p81) h81Var.e.get(i);
        if (!(view instanceof n81) && !(view instanceof sha)) {
            l81 l81Var = w81Var.G;
            if (l81Var != null) {
                l81Var.h(p81Var.c, p81Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(w81Var.getContext(), null);
        if (view instanceof sha) {
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232426, jb6.M0(2131752601, null), false, null).setOnClickListener(new oh(g81Var, p81Var, h81Var, r59Var, view, (byte) 2));
            str = null;
        } else if (((n81) view).b.getChildAt(0) instanceof eda) {
            str = null;
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232304, jb6.M0(2131746953, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    byte b = r4;
                    View view3 = view;
                    p81 p81Var2 = p81Var;
                    g81 g81Var2 = g81Var;
                    switch (b) {
                        case 0:
                            g81Var2.f.b(p81Var2.d, (n81) view3);
                            m8 m8Var = g81Var2.a;
                            if (m8Var != null) {
                                m8Var.d(true);
                                return;
                            }
                            return;
                        default:
                            g81Var2.f.b(p81Var2.d, (n81) view3);
                            m8 m8Var2 = g81Var2.a;
                            if (m8Var2 != null) {
                                m8Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            str = null;
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232426, jb6.M0(2131752601, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    byte b = r4;
                    View view3 = view;
                    p81 p81Var2 = p81Var;
                    g81 g81Var2 = g81Var;
                    switch (b) {
                        case 0:
                            g81Var2.f.b(p81Var2.d, (n81) view3);
                            m8 m8Var = g81Var2.a;
                            if (m8Var != null) {
                                m8Var.d(true);
                                return;
                            }
                            return;
                        default:
                            g81Var2.f.b(p81Var2.d, (n81) view3);
                            m8 m8Var2 = g81Var2.a;
                            if (m8Var2 != null) {
                                m8Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        b81 b81Var = p81Var.d;
        if (b81Var.b != 0 && b81Var.g != 0) {
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232428, jb6.M0(2131743236, str), false, null).setOnClickListener(new b0(g81Var, p81Var, dVar, (byte) 12));
        }
        if (!w81Var.h.j.contains(p81Var.d)) {
            i2 = 2131745406;
        } else {
            i2 = 2131751395;
        }
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232363, jb6.M0(i2, str), false, null).setOnClickListener(new t(g81Var, p81Var, (byte) 28));
        g81Var.a = ik.N(dVar, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f, (int) f2);
        w81Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public final void e(fj0 fj0Var) {
        Object valueOf;
        Purchase purchase = (Purchase) this.c;
        Runnable runnable = (Runnable) this.d;
        StringBuilder sb = new StringBuilder("BillingController consumeGiftPurchase ");
        sb.append((TLRPC.InputStorePaymentPurpose) this.b);
        sb.append(" ");
        sb.append(purchase.a());
        sb.append(" ");
        sb.append(purchase.b());
        sb.append(" done: ");
        int i = fj0Var.a;
        if (i == 0) {
            valueOf = "OK";
        } else {
            valueOf = Integer.valueOf(i);
        }
        sb.append(valueOf);
        sb.append(" ");
        hg9.r(fj0Var.c, sb);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void f(c29 c29Var, int i) {
        int i2;
        FrameLayout frameLayout = (FrameLayout) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        int[] iArr = (int[]) this.d;
        if (frameLayout != null) {
            int measuredWidth = frameLayout.getMeasuredWidth();
            int measuredHeight = frameLayout.getMeasuredHeight();
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(c29Var.getMeasuredWidth(), 1073741824), 0);
            i2 = frameLayout.getMeasuredHeight() + gm.L(8.0f);
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i2 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], hg9.v(52.0f, i2, i), true);
    }

    @Override
    public final void g(lp7 lp7Var, int i) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                ik.g(null, null, 0L, 0L, 0, (lp7) obj3, (nj) obj2, (oj) obj);
                return;
            default:
                ik.g(null, null, 0L, 0L, 0, (lp7) obj3, (ej) obj2, (gj) obj);
                return;
        }
    }

    @Override
    public final void h(int i) {
        gk gkVar = (gk) this.b;
        boolean[] zArr = (boolean[]) this.c;
        k6d k6dVar = (k6d) this.d;
        if (i == 1) {
            gkVar.y(2147483646, 0, zArr[0]);
            ((my0) k6dVar.b).y0.run();
        }
    }

    @Override
    public final void j(cd0 cd0Var) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        iv1 iv1Var = (iv1) this.b;
        switch (b) {
            case 15:
                rc2 rc2Var = (rc2) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                int ordinal = cd0Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                iv1Var.a.Ca(user);
                                return;
                            }
                            return;
                        }
                        iv1Var.d(user);
                        return;
                    }
                    iv1Var.l(rc2Var, user);
                    return;
                }
                iv1Var.o(user, false);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                rc2 rc2Var2 = (rc2) obj;
                int ordinal2 = cd0Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                iv1Var.a.Aa(chat);
                                return;
                            }
                            return;
                        }
                        iv1Var.a(chat);
                        return;
                    }
                    iv1Var.j(rc2Var2, chat, 0, false);
                    return;
                }
                iv1Var.n(chat);
                return;
        }
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
        int i3 = ChatActivityEnterView.z7;
        yv1 yv1Var = chatActivityEnterView.F3;
        TLRPC.Message message = ((k47) this.c).k;
        long j = message.from_id.user_id;
        long j2 = message.via_bot_id;
        if (j2 != 0) {
            j = j2;
        }
        TLRPC.User W1 = oc7.r1(chatActivityEnterView.S.a).W1(Long.valueOf(j));
        if (W1 == null) {
            nk3Var.finishFragment();
            return true;
        }
        long j3 = ((bf7) arrayList.get(0)).a;
        hs6 d0 = hs6.d0(chatActivityEnterView.R);
        d0.T1(j3, 0L, "@" + m9c.p(W1) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, null, null, 0L, true, false, null);
        if (j3 != chatActivityEnterView.G3) {
            if (!pg3.B(j3)) {
                Bundle bundle = new Bundle();
                if (pg3.D(j3)) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                if (oc7.r1(chatActivityEnterView.S.a).A(bundle, nk3Var, null, null)) {
                    if (yv1Var.presentFragment(new yv1(bundle), true)) {
                        if (!gm.O1()) {
                            yv1Var.removeSelfFromStack();
                        }
                    } else {
                        nk3Var.finishFragment();
                        return true;
                    }
                }
                return true;
            }
            nk3Var.finishFragment();
            return true;
        }
        nk3Var.finishFragment();
        return true;
    }

    @Override
    public final void r(he heVar, int i) {
        String str = null;
        switch (this.a) {
            case 5:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                yu0 yu0Var = (yu0) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                yu0Var.a(bool, bool);
                return;
            case 6:
                boolean[] zArr2 = (boolean[]) this.c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.b;
                qu3 qu3Var = (qu3) this.d;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.confirm(qu3Var.getText().toString());
                    return;
                }
                return;
            case 8:
                ((boolean[]) this.c)[0] = true;
                ((qac) this.b).a(Boolean.FALSE);
                ((he[]) this.d)[0].dismiss();
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                k47 k47Var = (k47) this.c;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.d;
                int i2 = ChatActivityEnterView.z7;
                Activity activity2 = chatActivityEnterView.E3;
                if (activity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    activity2.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                    chatActivityEnterView.Y3 = k47Var;
                    chatActivityEnterView.Z3 = keyboardButtonProto;
                    return;
                }
                a6a.B(chatActivityEnterView.R).n0(k47Var, keyboardButtonProto);
                return;
            case 20:
                i22 i22Var = (i22) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int i3 = i22Var.G3;
                if (tL_attachMenuBot != null) {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = oc7.r1(i3).p1(user);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_toggleBotInAttachMenu, new pm(i22Var, tL_attachMenuBot, (byte) 18), 66);
                    return;
                }
                hs6.d0(i3).O1(user.id);
                return;
            case 22:
                c52 c52Var = (c52) this.b;
                a52 a52Var = (a52) this.c;
                oh2 oh2Var = (oh2) this.d;
                TextView textView = c52Var.V;
                if (a52Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i4 = -c52Var.w0;
                    c52Var.w0 = i4;
                    gm.A3(i4, a52Var, null);
                    return;
                }
                String trim = a52Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                c52Var.t0 = str;
                c52Var.u0 = !oh2Var.b();
                if (TextUtils.isEmpty(c52Var.t0)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(c52Var.t0);
                    textView.setVisibility(0);
                }
                c52Var.k0();
                heVar.dismiss();
                c52Var.Y();
                return;
            case 25:
                View view = (View) this.c;
                view.setTag(null);
                ((v72) this.b).X(view, (ng8) this.d, false);
                return;
            case 27:
                na2 na2Var = (na2) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                View view2 = (View) this.d;
                qa2 qa2Var = na2Var.a.i3;
                if (tL_username.editable) {
                    if (qa2Var.s0 == null) {
                        qa2Var.s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = qa2Var.Y;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z = tL_username.active;
                    tL_channels_toggleUsername.active = !z;
                    qa2Var.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new rj1(na2Var, tL_channels_toggleUsername, tL_username, z, (byte) 2));
                    qa2Var.Q.add(tL_username.username);
                    ((qf1) view2).setLoading(true);
                }
                qa2Var.b0();
                return;
            default:
                ib2 ib2Var = (ib2) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                if (((TLRPC.ChatFull) this.c).hidden_prehistory) {
                    ib2Var.getMessagesController().j5(chat2.id, false);
                }
                ib2Var.d0(chat2, null);
                return;
        }
    }

    @Override
    public final int run() {
        d dVar = (d) this.b;
        String str = (String) this.c;
        r59 r59Var = (r59) this.d;
        int i = -1;
        try {
            Field declaredField = dVar.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            i = declaredField.getInt(dVar);
            ((u46) r59Var.getLayoutManager()).g1(i, gm.L(60.0f));
            declaredField.setAccessible(false);
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        TL_stars.StarsAmount starsAmount;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 11:
                yv1 yv1Var = (yv1) obj3;
                yv1Var.getClass();
                yv1Var.yb((TLRPC.BotInlineResult) obj2, z, i, ((Long) obj).longValue());
                return;
            case 13:
                ((yv1) obj3).x9((f47) obj2, (k47) obj, i, i2);
                return;
            case 14:
                yv1 yv1Var2 = (yv1) obj3;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) obj2;
                k47 k47Var = (k47) obj;
                if (z) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    nk m = nk.m(starsAmount);
                    long j = i;
                    TLRPC.SuggestedPost suggestedPost2 = new TLRPC.SuggestedPost();
                    if (m != null && !m.l()) {
                        suggestedPost2.price = m.q();
                    }
                    if (j > 0) {
                        suggestedPost2.schedule_date = (int) j;
                        suggestedPost2.flags |= 1;
                    }
                    if (k47Var != null && k47Var.k != null) {
                        yv1Var2.getMessagesController().e(k47Var, suggestedPost2);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                n52 n52Var = (n52) obj3;
                n52Var.o0.b((TLRPC.TL_messageMediaGeo) obj2, n52Var.p0, z, i, ((Long) obj).longValue());
                n52Var.b.a(true);
                return;
            default:
                v72 v72Var = (v72) obj3;
                v72Var.k0.a((TLRPC.TL_messageMediaToDo) obj2, null, null, null, z, i, ((Long) obj).longValue());
                v72Var.b.a(true);
                return;
        }
    }

    public jf(boolean[] zArr, Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = zArr;
        this.b = obj;
        this.d = obj2;
    }

    @Override
    public final void i() {
    }

    @Override
    public final void k(float f) {
    }

    @Override
    public final void run(long j) {
        ((ke2) this.b).k0((TLRPC.TL_inputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j);
    }
}
