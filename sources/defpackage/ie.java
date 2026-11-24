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
public final class ie implements m7, fn7, z29, ts2, ed, tz7, f39, yz8, gj, zw5, ub0, wi3, b42, vc7 {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ie(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void a(String str) {
        mu1 mu1Var = (mu1) this.b;
        eq0 eq0Var = (eq0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = k96.D0().y.getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !qa9.b0().contains(str))) {
            eq0Var.setOnClickListener(new og(mu1Var, str, language, charSequence, eq0Var, (byte) 4));
        } else {
            eq0Var.setClickable(false);
        }
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        e72 e72Var = (e72) this.b;
        lk0 lk0Var = (lk0) this.c;
        x02 x02Var = (x02) this.d;
        ye9 ye9Var = e72Var.r;
        if (messageMedia != null && messageMedia.geo != null) {
            ld9 ld9Var = ye9Var.R3;
            if (ld9Var != null) {
                ld9Var.d();
            }
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) lk0Var.b;
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                pageblockmap.w = 600;
                pageblockmap.h = 400;
            }
            ld9 ld9Var2 = ye9Var.R3;
            if (ld9Var2 != null) {
                ld9Var2.h();
            }
            e72Var.Z(true);
            x02Var.a(true);
            ye9Var.post(new v62(e72Var, lk0Var, (byte) 0));
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
                jw0 jw0Var = (jw0) obj3;
                gr7 gr7Var = (gr7) obj2;
                String str = (String) obj;
                if (i != 3) {
                    gr7Var.dismiss();
                }
                jw0Var.d.E.D(str, ls6.C(i).toLowerCase(Locale.ROOT), false);
                return;
            default:
                gr7 gr7Var2 = (gr7) obj3;
                s12 s12Var = (s12) obj2;
                String str2 = (String) obj;
                if (i != 3) {
                    gr7Var2.dismiss();
                }
                s12Var.getWebViewContainer().D(str2, ls6.C(i).toLowerCase(Locale.ROOT), false);
                return;
        }
    }

    @Override
    public final void d(fi0 fi0Var) {
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
        int i = fi0Var.a;
        if (i == 0) {
            valueOf = "OK";
        } else {
            valueOf = Integer.valueOf(i);
        }
        sb.append(valueOf);
        sb.append(" ");
        de9.s(fi0Var.c, sb);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final boolean mo8e(float f, float f2, int i, final View view) {
        String str;
        int i2;
        final z61 z61Var = (z61) this.b;
        o39 o39Var = (o39) this.c;
        d dVar = (d) this.d;
        o71 o71Var = z61Var.f;
        a71 a71Var = (a71) o39Var.getAdapter();
        final h71 h71Var = (h71) a71Var.e.get(i);
        if (!(view instanceof f71) && !(view instanceof qfa)) {
            d71 d71Var = o71Var.G;
            if (d71Var != null) {
                d71Var.i(h71Var.c, h71Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(o71Var.getContext(), null);
        if (view instanceof qfa) {
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232425, k96.M0(2131752636, null), false, null).setOnClickListener(new og(z61Var, h71Var, a71Var, o39Var, view, (byte) 2));
            str = null;
        } else if (((f71) view).b.getChildAt(0) instanceof eba) {
            str = null;
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232303, k96.M0(2131747027, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    byte b = r4;
                    View view3 = view;
                    h71 h71Var2 = h71Var;
                    z61 z61Var2 = z61Var;
                    switch (b) {
                        case 0:
                            z61Var2.f.b(h71Var2.d, (f71) view3);
                            m8 m8Var = z61Var2.a;
                            if (m8Var != null) {
                                m8Var.d(true);
                                return;
                            }
                            return;
                        default:
                            z61Var2.f.b(h71Var2.d, (f71) view3);
                            m8 m8Var2 = z61Var2.a;
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
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232425, k96.M0(2131752636, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    byte b = r4;
                    View view3 = view;
                    h71 h71Var2 = h71Var;
                    z61 z61Var2 = z61Var;
                    switch (b) {
                        case 0:
                            z61Var2.f.b(h71Var2.d, (f71) view3);
                            m8 m8Var = z61Var2.a;
                            if (m8Var != null) {
                                m8Var.d(true);
                                return;
                            }
                            return;
                        default:
                            z61Var2.f.b(h71Var2.d, (f71) view3);
                            m8 m8Var2 = z61Var2.a;
                            if (m8Var2 != null) {
                                m8Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        u61 u61Var = h71Var.d;
        if (u61Var.b != 0 && u61Var.g != 0) {
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232427, k96.M0(2131743310, str), false, null).setOnClickListener(new b0(z61Var, h71Var, dVar, (byte) 12));
        }
        if (!o71Var.h.j.contains(h71Var.d)) {
            i2 = 2131745480;
        } else {
            i2 = 2131751446;
        }
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232362, k96.M0(i2, str), false, null).setOnClickListener(new t(z61Var, h71Var, (byte) 28));
        z61Var.a = ij.N(dVar, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f, (int) f2);
        o71Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public final void h(int i) {
        gj gjVar = (gj) this.b;
        boolean[] zArr = (boolean[]) this.c;
        i4d i4dVar = (i4d) this.d;
        if (i == 1) {
            gjVar.s(2147483646, 0, zArr[0]);
            ((fx0) i4dVar.a).y0.run();
        }
    }

    @Override
    public final void i(hn7 hn7Var, int i) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                ij.g(null, null, 0L, 0L, 0, (hn7) obj3, (ni) obj2, (oi) obj);
                return;
            default:
                ij.g(null, null, 0L, 0L, 0, (hn7) obj3, (ei) obj2, (gi) obj);
                return;
        }
    }

    @Override
    public final void j(cc0 cc0Var) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        wt1 wt1Var = (wt1) this.b;
        switch (b) {
            case 15:
                gb2 gb2Var = (gb2) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                int ordinal = cc0Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                wt1Var.a.sa(user);
                                return;
                            }
                            return;
                        }
                        wt1Var.d(user);
                        return;
                    }
                    wt1Var.i(gb2Var, user);
                    return;
                }
                wt1Var.k(user, false);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                gb2 gb2Var2 = (gb2) obj;
                int ordinal2 = cc0Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                wt1Var.a.qa(chat);
                                return;
                            }
                            return;
                        }
                        wt1Var.a(chat);
                        return;
                    }
                    wt1Var.h(gb2Var2, chat, 0, false);
                    return;
                }
                wt1Var.j(chat);
                return;
        }
    }

    @Override
    public final void k(a09 a09Var, int i) {
        int i2;
        FrameLayout frameLayout = (FrameLayout) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        int[] iArr = (int[]) this.d;
        if (frameLayout != null) {
            int measuredWidth = frameLayout.getMeasuredWidth();
            int measuredHeight = frameLayout.getMeasuredHeight();
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(a09Var.getMeasuredWidth(), 1073741824), 0);
            i2 = frameLayout.getMeasuredHeight() + gl.L(8.0f);
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i2 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], de9.w(52.0f, i2, i), true);
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
        int i3 = ChatActivityEnterView.r7;
        mu1 mu1Var = chatActivityEnterView.F3;
        TLRPC.Message message = ((k27) this.c).k;
        long j = message.from_id.user_id;
        long j2 = message.via_bot_id;
        if (j2 != 0) {
            j = j2;
        }
        TLRPC.User V1 = na7.q1(chatActivityEnterView.S.a).V1(Long.valueOf(j));
        if (V1 == null) {
            cj3Var.finishFragment();
            return true;
        }
        long j3 = ((zc7) arrayList.get(0)).a;
        hq6 d0 = hq6.d0(chatActivityEnterView.R);
        d0.T1(j3, 0L, "@" + l7c.p(V1) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, null, null, 0L, true, false, null);
        if (j3 != chatActivityEnterView.G3) {
            if (!cf3.B(j3)) {
                Bundle bundle = new Bundle();
                if (cf3.D(j3)) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                if (na7.q1(chatActivityEnterView.S.a).A(bundle, cj3Var, null, null)) {
                    if (mu1Var.presentFragment(new mu1(bundle), true)) {
                        if (!gl.O1()) {
                            mu1Var.removeSelfFromStack();
                        }
                    } else {
                        cj3Var.finishFragment();
                        return true;
                    }
                }
                return true;
            }
            cj3Var.finishFragment();
            return true;
        }
        cj3Var.finishFragment();
        return true;
    }

    @Override
    public final int run() {
        d dVar = (d) this.b;
        String str = (String) this.c;
        o39 o39Var = (o39) this.d;
        int i = -1;
        try {
            Field declaredField = dVar.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            i = declaredField.getInt(dVar);
            ((t26) o39Var.getLayoutManager()).g1(i, gl.L(60.0f));
            declaredField.setAccessible(false);
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        TL_stars.StarsAmount starsAmount;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 11:
                mu1 mu1Var = (mu1) obj3;
                mu1Var.getClass();
                mu1Var.ob((TLRPC.BotInlineResult) obj2, z, i, ((Long) obj).longValue());
                return;
            case 13:
                ((mu1) obj3).n9((f27) obj2, (k27) obj, i, i2);
                return;
            case 14:
                mu1 mu1Var2 = (mu1) obj3;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) obj2;
                k27 k27Var = (k27) obj;
                if (z) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    nj m = nj.m(starsAmount);
                    long j = i;
                    TLRPC.SuggestedPost suggestedPost2 = new TLRPC.SuggestedPost();
                    if (m != null && !m.l()) {
                        suggestedPost2.price = m.q();
                    }
                    if (j > 0) {
                        suggestedPost2.schedule_date = (int) j;
                        suggestedPost2.flags |= 1;
                    }
                    if (k27Var != null && k27Var.k != null) {
                        mu1Var2.getMessagesController().e(k27Var, suggestedPost2);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                c42 c42Var = (c42) obj3;
                c42Var.o0.b((TLRPC.TL_messageMediaGeo) obj2, c42Var.p0, z, i, ((Long) obj).longValue());
                c42Var.b.a(true);
                return;
            default:
                k62 k62Var = (k62) obj3;
                k62Var.k0.a((TLRPC.TL_messageMediaToDo) obj2, null, null, null, z, i, ((Long) obj).longValue());
                k62Var.b.a(true);
                return;
        }
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        String str = null;
        switch (this.a) {
            case 5:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                pt0 pt0Var = (pt0) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                pt0Var.a(bool, bool);
                return;
            case 6:
                boolean[] zArr2 = (boolean[]) this.c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.b;
                gt3 gt3Var = (gt3) this.d;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.confirm(gt3Var.getText().toString());
                    return;
                }
                return;
            case 8:
                ((boolean[]) this.c)[0] = true;
                ((p8c) this.b).a(Boolean.FALSE);
                ((hd[]) this.d)[0].dismiss();
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                k27 k27Var = (k27) this.c;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.d;
                int i2 = ChatActivityEnterView.r7;
                Activity activity2 = chatActivityEnterView.E3;
                if (activity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    activity2.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                    chatActivityEnterView.Y3 = k27Var;
                    chatActivityEnterView.Z3 = keyboardButtonProto;
                    return;
                }
                z3a.B(chatActivityEnterView.R).n0(k27Var, keyboardButtonProto);
                return;
            case 20:
                x02 x02Var = (x02) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int i3 = x02Var.G3;
                if (tL_attachMenuBot != null) {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = na7.q1(i3).o1(user);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_toggleBotInAttachMenu, new pl(x02Var, tL_attachMenuBot, (byte) 18), 66);
                    return;
                }
                hq6.d0(i3).O1(user.id);
                return;
            case 22:
                r32 r32Var = (r32) this.b;
                p32 p32Var = (p32) this.c;
                ag2 ag2Var = (ag2) this.d;
                TextView textView = r32Var.V;
                if (p32Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i4 = -r32Var.w0;
                    r32Var.w0 = i4;
                    gl.A3(i4, p32Var, null);
                    return;
                }
                String trim = p32Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                r32Var.t0 = str;
                r32Var.u0 = !ag2Var.b();
                if (TextUtils.isEmpty(r32Var.t0)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(r32Var.t0);
                    textView.setVisibility(0);
                }
                r32Var.k0();
                hdVar.dismiss();
                r32Var.Y();
                return;
            case 25:
                View view = (View) this.c;
                view.setTag(null);
                ((k62) this.b).X(view, (le8) this.d, false);
                return;
            case 27:
                c92 c92Var = (c92) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                View view2 = (View) this.d;
                f92 f92Var = c92Var.a.i3;
                if (tL_username.editable) {
                    if (f92Var.s0 == null) {
                        f92Var.s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = f92Var.Y;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z = tL_username.active;
                    tL_channels_toggleUsername.active = !z;
                    f92Var.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new ji1(c92Var, tL_channels_toggleUsername, tL_username, z, (byte) 2));
                    f92Var.Q.add(tL_username.username);
                    ((ie1) view2).setLoading(true);
                }
                f92Var.a0();
                return;
            default:
                x92 x92Var = (x92) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                if (((TLRPC.ChatFull) this.c).hidden_prehistory) {
                    x92Var.getMessagesController().h5(chat2.id, false);
                }
                x92Var.c0(chat2, null);
                return;
        }
    }

    public ie(boolean[] zArr, Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = zArr;
        this.b = obj;
        this.d = obj2;
    }

    @Override
    public final void f() {
    }

    @Override
    public final void g(float f) {
    }

    @Override
    public final void run(long j) {
        ((zc2) this.b).j0((TLRPC.TL_inputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j);
    }
}
