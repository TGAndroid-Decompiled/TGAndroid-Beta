package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class t implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public t(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        String str;
        String str2;
        Bitmap bitmap;
        String str3;
        ?? r8;
        String str4;
        int i;
        int i2;
        int N;
        boolean z2;
        byte b = this.a;
        int i3 = -1;
        int i4 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                new kj8(42, (ylb) obj, ((a1) obj2).getContext()).show();
                return;
            case 1:
                final r0 r0Var = (r0) obj2;
                final ylb ylbVar = (ylb) obj;
                su3 su3Var = r0Var.W1;
                su3 su3Var2 = r0Var.V1;
                jh2 jh2Var = r0Var.Y1;
                b61 b61Var = r0Var.b2;
                if (!b61Var.R) {
                    if (!b61Var.e0) {
                        if (r0Var.c2 == null) {
                            r0Var.Y0();
                            return;
                        }
                        return;
                    }
                    b61Var.setLoading(true);
                    if (r0Var.e2 != null) {
                        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                        updatetone.flags |= 1;
                        updatetone.display_author = jh2Var.a.q;
                        updatetone.tone = TL_aicompose.InputAiComposeTone.from(r0Var.e2);
                        updatetone.flags |= 2;
                        updatetone.emoji_id = r0Var.c2.longValue();
                        updatetone.flags |= 4;
                        updatetone.title = su3Var2.getText().toString();
                        updatetone.flags |= 8;
                        updatetone.prompt = su3Var.getText().toString();
                        ConnectionsManager.getInstance(r0Var.a).sendRequestTyped(updatetone, new kc((byte) 0), new jac() {
                            @Override
                            public final void a(Object obj3, Object obj4) {
                                byte b2 = r3;
                                ylb ylbVar2 = ylbVar;
                                r0 r0Var2 = r0Var;
                                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                                switch (b2) {
                                    case 0:
                                        r0Var2.b2.setLoading(false);
                                        if (aiComposeTone != null) {
                                            h hVar = r0Var2.g2;
                                            if (hVar != null) {
                                                hVar.a(aiComposeTone);
                                            }
                                            r0Var2.dismiss();
                                            return;
                                        } else if (tL_error != null) {
                                            wi8.u(r0Var2.a2, ylbVar2, tL_error, false);
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        r0Var2.b2.setLoading(false);
                                        if (aiComposeTone != null) {
                                            r0Var2.dismiss();
                                            h hVar2 = r0Var2.f2;
                                            if (hVar2 != null) {
                                                hVar2.a(aiComposeTone);
                                                return;
                                            }
                                            return;
                                        } else if (tL_error != null) {
                                            boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                            FrameLayout frameLayout = r0Var2.a2;
                                            if (equalsIgnoreCase) {
                                                a1.q1(new c41(frameLayout, ylbVar2), r0Var2.a);
                                                return;
                                            } else {
                                                wi8.u(frameLayout, ylbVar2, tL_error, false);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                }
                            }
                        });
                        return;
                    }
                    TL_aicompose.createTone createtone = new TL_aicompose.createTone();
                    createtone.display_author = jh2Var.a.q;
                    createtone.emoji_id = r0Var.c2.longValue();
                    createtone.title = su3Var2.getText().toString();
                    createtone.prompt = su3Var.getText().toString();
                    ConnectionsManager.getInstance(r0Var.a).sendRequestTyped(createtone, new kc((byte) 0), new jac() {
                        @Override
                        public final void a(Object obj3, Object obj4) {
                            byte b2 = r3;
                            ylb ylbVar2 = ylbVar;
                            r0 r0Var2 = r0Var;
                            TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                            switch (b2) {
                                case 0:
                                    r0Var2.b2.setLoading(false);
                                    if (aiComposeTone != null) {
                                        h hVar = r0Var2.g2;
                                        if (hVar != null) {
                                            hVar.a(aiComposeTone);
                                        }
                                        r0Var2.dismiss();
                                        return;
                                    } else if (tL_error != null) {
                                        wi8.u(r0Var2.a2, ylbVar2, tL_error, false);
                                        return;
                                    } else {
                                        return;
                                    }
                                default:
                                    r0Var2.b2.setLoading(false);
                                    if (aiComposeTone != null) {
                                        r0Var2.dismiss();
                                        h hVar2 = r0Var2.f2;
                                        if (hVar2 != null) {
                                            hVar2.a(aiComposeTone);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error != null) {
                                        boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                        FrameLayout frameLayout = r0Var2.a2;
                                        if (equalsIgnoreCase) {
                                            a1.q1(new c41(frameLayout, ylbVar2), r0Var2.a);
                                            return;
                                        } else {
                                            wi8.u(frameLayout, ylbVar2, tL_error, false);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                            }
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((qac) obj2).a((TL_aicompose.AiComposeTone) obj);
                return;
            case 3:
                o5 o5Var = (o5) obj2;
                long n = pg3.n(((TL_stars.TL_StarGiftAuctionAcquiredGift) obj).peer);
                o5Var.dismiss();
                d S = LaunchActivity.S();
                if (S != null && !m9c.C(n)) {
                    Bundle bundle = new Bundle();
                    if (n > 0) {
                        bundle.putLong("user_id", n);
                        if (n == z8c.h(o5Var.a).e()) {
                            z = true;
                            bundle.putBoolean("my_profile", true);
                        } else {
                            z = true;
                        }
                    } else {
                        z = true;
                        bundle.putLong("chat_id", -n);
                    }
                    bundle.putBoolean("open_gifts", z);
                    S.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 4:
                r7 r7Var = (r7) obj2;
                q7 q7Var = (q7) obj;
                int indexOf = r7Var.h0.indexOf(q7Var.getFilter());
                if (r7Var.i0 != indexOf) {
                    r7Var.i0 = indexOf;
                    r7Var.E();
                    return;
                } else if (q7Var.getFilter().h) {
                    if (!q7Var.a.f) {
                        q7Var.setSelectedForDelete(true);
                        return;
                    }
                    sh4 filter = q7Var.getFilter();
                    r7Var.J(filter);
                    n7 n7Var = r7Var.I;
                    if (n7Var != null) {
                        n7Var.j(filter);
                        r7Var.I.l(r7Var.e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 5:
                p7 p7Var = (p7) obj2;
                r7 r7Var2 = (r7) obj;
                if (r7Var2.y() && p7Var.f) {
                    if (!r7Var2.U) {
                        r7Var2.U = true;
                        r7Var2.r();
                    } else {
                        return;
                    }
                }
                r6 r6Var = r7Var2.c;
                if (r6Var != null) {
                    r6Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
                m7 m7Var = r7Var2.Q;
                if (m7Var != null) {
                    m7Var.h(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 6:
                eb ebVar = (eb) obj2;
                ebVar.b = true;
                ((hu) obj).run();
                ebVar.x.g3.O(true);
                return;
            case 7:
                ((bc) obj2).G0((Context) obj);
                return;
            case 8:
                he heVar = (he) obj2;
                if (!((zd) obj).a) {
                    ee eeVar = heVar.n0;
                    if (eeVar != null) {
                        eeVar.r(heVar, -1);
                    }
                    if (heVar.k0) {
                        heVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                he heVar2 = (he) obj2;
                if (!((zd) obj).a) {
                    ee eeVar2 = heVar2.p0;
                    if (eeVar2 != null) {
                        eeVar2.r(heVar2, -2);
                    }
                    if (heVar2.k0) {
                        heVar2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                he heVar3 = (he) obj2;
                if (!((zd) obj).a) {
                    ee eeVar3 = heVar3.t0;
                    if (eeVar3 != null) {
                        eeVar3.r(heVar3, -2);
                    }
                    if (heVar3.k0) {
                        heVar3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                he heVar4 = (he) obj2;
                if (!((zd) obj).a) {
                    kh9 kh9Var = heVar4.r0;
                    if (kh9Var != null) {
                        kh9Var.r(heVar4, -2);
                    }
                    if (heVar4.k0) {
                        heVar4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                r7 r7Var3 = (r7) obj2;
                fk fkVar = (fk) obj;
                r7Var3.U(null, null);
                r7Var3.O(fkVar.d, false);
                r7Var3.setupPopupRadialSelectors(fkVar.f);
                r7Var3.I(fkVar.e);
                return;
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                boolean z3 = !zArr[0];
                zArr[0] = z3;
                ((oh2) view).c(z3, true);
                ((rh) obj).run();
                return;
            case 14:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.M0.run();
                ((w73) obj).onClick(null, intValue);
                return;
            case 15:
                ((my0) ((k6d) obj2).b).y0.run();
                ((qac) obj).a(null);
                return;
            case 16:
                ((boolean[]) obj2)[0] = true;
                ((zx0) obj).run();
                return;
            case 17:
                o oVar = (o) obj2;
                Activity activity = (Activity) obj;
                sx sxVar = oVar.L;
                if (!oVar.i0.B0) {
                    m mVar = oVar.v0[0];
                    if (mVar.e()) {
                        if (mVar.getWebView() != null && !oVar.i0.a0) {
                            if (oVar.j0 != null) {
                                mw0 webView = mVar.getWebView();
                                if (webView != null) {
                                    str = webView.getTitle();
                                    str2 = webView.getUrl();
                                } else {
                                    str = null;
                                    str2 = null;
                                }
                                String r = qw0.r(str2);
                                eb ebVar2 = oVar.j0;
                                if (webView != null) {
                                    bitmap = webView.getFavicon();
                                } else {
                                    bitmap = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = jb6.M0(2131742589, null);
                                }
                                if (TextUtils.isEmpty(r)) {
                                    str3 = "about:blank";
                                } else {
                                    str3 = r;
                                }
                                hu huVar = new hu(oVar, r, (byte) 0);
                                iu iuVar = new iu(oVar, mVar, activity, (byte) 0);
                                xt xtVar = new xt(oVar, (byte) 1);
                                xt xtVar2 = new xt(oVar, (byte) 2);
                                b0 b0Var = new b0(oVar, r, mVar, (byte) 6);
                                va vaVar = ebVar2.x;
                                ImageView imageView = ebVar2.f;
                                if (bitmap == null) {
                                    imageView.setImageResource(2131232200);
                                    imageView.setColorFilter(new PorterDuffColorFilter(ebVar2.I, PorterDuff.Mode.SRC_IN));
                                    r8 = 0;
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(ebVar2.getContext().getResources(), bitmap));
                                    r8 = 0;
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = ebVar2.r;
                                textView.setText(gw3.m(str, textView.getPaint().getFontMetricsInt(), false, r8, 0));
                                try {
                                    try {
                                        Uri parse = Uri.parse(str3);
                                        str3 = l11.x(parse, r8, r8, l11.a(parse.getHost()), r8);
                                    } catch (Exception e) {
                                        fc4.g(e, false);
                                    }
                                    str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e2) {
                                    fc4.g(e2, true);
                                    str4 = str3;
                                }
                                TextView textView2 = ebVar2.s;
                                i4 = 0;
                                textView2.setText(gw3.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                                ebVar2.M = iuVar;
                                ebVar2.N = xtVar;
                                ebVar2.O = xtVar2;
                                ebVar2.e.setOnClickListener(new t(ebVar2, huVar, (byte) 6));
                                ebVar2.n.setOnClickListener(b0Var);
                                ebVar2.b = false;
                                ebVar2.setInput(null);
                                vaVar.g3.O(true);
                                vaVar.w0(0);
                            }
                            wu wuVar = oVar.i0;
                            x0 x0Var = new x0(mVar, activity, (byte) 3);
                            vc vcVar = wuVar.c0;
                            vcVar.setText("");
                            vcVar.setSelection(i4, vcVar.getText().length());
                            vcVar.setScrollX(i4);
                            wuVar.w0 = x0Var;
                            wuVar.k(true);
                            return;
                        }
                        return;
                    } else if (sxVar != null) {
                        yla ylaVar = new yla(activity);
                        ylaVar.a = 1;
                        ylaVar.s = -gm.L(32.0f);
                        mVar.d.v0(ylaVar);
                        return;
                    } else {
                        mVar.b.z0(0);
                        return;
                    }
                }
                return;
            case 18:
                ev evVar = (ev) obj2;
                ui5 ui5Var = (ui5) obj;
                if (evVar.h == 0) {
                    evVar.a(1, true);
                    int i5 = ((o) ui5Var).Y;
                    TLRPC.Chat chat = ui5Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = oc7.h1(chat);
                    ConnectionsManager.getInstance(i5).sendRequestTyped(tL_channels_joinChannel, new e(evVar, i5, tL_channels_joinChannel, chat, (byte) 2));
                    return;
                }
                return;
            case 19:
                i30 i30Var = (i30) obj2;
                float[] fArr = (float[]) obj;
                float f = MediaController.w().r0;
                int i6 = 0;
                while (true) {
                    if (i6 < 3) {
                        if (f - 0.1f <= fArr[i6]) {
                            i3 = i6;
                        } else {
                            i6++;
                        }
                    }
                }
                int i7 = i3 + 1;
                if (i7 >= 3) {
                    i7 = 0;
                }
                MediaController.w().l0(true, fArr[i7]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - i30Var.J2 > 300) {
                    int i8 = oc7.e1().getInt("speedhint", 0) + 1;
                    if (i8 > 2) {
                        i8 = -10;
                    }
                    oc7.e1().edit().putInt("speedhint", i8).apply();
                    if (i8 >= 0 && i30Var.b != null) {
                        ?? ig5Var = new ig5(5, null, i30Var.getContext(), false);
                        i30Var.I2 = ig5Var;
                        ig5Var.setExtraTranslationY(gm.L(6.0f));
                        i30Var.I2.setText(jb6.M0(2131744958, null));
                        i30Var.x1.addView(i30Var.I2, qoe.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        i30Var.I2.c(i30Var.O1);
                    }
                }
                i30Var.J2 = currentTimeMillis;
                return;
            case 20:
                ((bu5) obj).u();
                ((i30) obj2).J0(6);
                return;
            case 21:
                fl6 fl6Var = (fl6) obj;
                i30 i30Var2 = (i30) ((z20) obj2).G;
                int i9 = i30Var2.a;
                LaunchActivity launchActivity = i30Var2.z2;
                ArrayList arrayList = (ArrayList) oc7.r1(i9).w.get(0);
                if (arrayList != null) {
                    i = arrayList.size();
                } else {
                    i = 0;
                }
                if (i > 10 && !TextUtils.isEmpty(fl6Var.getText().toString())) {
                    String charSequence = fl6Var.getText().toString();
                    if (launchActivity.N().getLastFragment() instanceof nk3) {
                        nk3 nk3Var = (nk3) launchActivity.N().getLastFragment();
                        ArrayList arrayList2 = (ArrayList) nk3Var.getMessagesController().w.get(0);
                        if (arrayList2 != null) {
                            i2 = arrayList2.size();
                        } else {
                            i2 = 0;
                        }
                        if (!nk3Var.n2 && (i2 > 10 || nk3Var.L)) {
                            if (!nk3Var.l2) {
                                nk3Var.y = 3;
                                nk3Var.Y.r.setText(charSequence);
                                nk3Var.Y.r.setSelection(charSequence.length());
                            } else {
                                nk3Var.Y.r.setText(charSequence);
                                nk3Var.Y.r.setSelection(charSequence.length());
                                sj3 sj3Var = nk3Var.D0;
                                if (sj3Var != null && (N = sj3Var.N(3)) >= 0 && nk3Var.D0.getTabsView().getCurrentTabId() != N) {
                                    nk3Var.D0.getTabsView().e(N, N);
                                }
                            }
                            i30Var2.dismiss();
                            return;
                        }
                    }
                    nk3 nk3Var2 = new nk3(null);
                    nk3Var2.p2 = charSequence;
                    nk3Var2.y = 3;
                    launchActivity.u0(nk3Var2, false, false);
                    i30Var2.dismiss();
                    return;
                }
                return;
            case 22:
                mc0 mc0Var = (mc0) obj2;
                ((boolean[]) obj)[0] = true;
                mc0Var.K.z1(mc0Var.Z);
                mc0Var.T.dismiss();
                return;
            case 23:
                bd0 bd0Var = (bd0) obj2;
                bd0Var.b(false);
                bd0Var.e.j((cd0) obj);
                return;
            case 24:
                ((au0) obj2).r0((Context) obj, view);
                return;
            case 25:
                wx0 wx0Var = (wx0) obj2;
                lq0 lq0Var = (lq0) obj;
                if (lq0Var.c()) {
                    lq0Var.a();
                } else {
                    File file = lq0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = lq0Var.d;
                        gm.s2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                    }
                }
                bu5 bu5Var = wx0Var.P0;
                if (bu5Var != null) {
                    bu5Var.u();
                    wx0Var.P0 = null;
                    return;
                }
                return;
            case 26:
                gm.g(((TL_account.TL_businessChatLink) obj2).link);
                c41.b0((yv1) obj).k(false).j();
                return;
            case 27:
                ((y71) ((w71) obj2).f).w0((oh2) obj);
                return;
            case 28:
                g81 g81Var = (g81) obj2;
                p81 p81Var = (p81) obj;
                l81 l81Var = g81Var.f.G;
                if (l81Var != null) {
                    l81Var.h(p81Var.c, p81Var.d, true);
                }
                m8 m8Var = g81Var.a;
                if (m8Var != null) {
                    m8Var.d(true);
                    return;
                }
                return;
            default:
                ia1 ia1Var = (ia1) obj2;
                fa1 fa1Var = (fa1) obj;
                ArrayList arrayList3 = fa1Var.b;
                if (arrayList3.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList3.get(0);
                    TLRPC.UserFull X1 = ia1Var.getMessagesController().X1(user.id);
                    ia1Var.L = user;
                    boolean z4 = fa1Var.e;
                    if (!z4 && (X1 == null || !X1.video_calls_available)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    sic.m(user, z4, z2, ia1Var.getParentActivity(), null, ia1Var.getAccountInstance());
                    return;
                }
                boolean z5 = fa1Var.e;
                HashSet hashSet = new HashSet();
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList3.get(i10);
                    i10++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) fa1Var.c.get(0)).id;
                he heVar5 = new he(3, null, ia1Var.getParentActivity());
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = ia1Var.getMessagesController().l4.w3.f();
                heVar5.setOnCancelListener(new p91(ia1Var, ia1Var.getConnectionsManager().sendRequest(getgroupcall, new o91(ia1Var, heVar5, hashSet, tL_inputGroupCallInviteMessage, z5, (byte) 1)), (byte) 1));
                heVar5.q(600L);
                return;
        }
    }
}
