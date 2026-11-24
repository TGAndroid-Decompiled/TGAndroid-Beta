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
                new jh8(42, (wjb) obj, ((a1) obj2).getContext()).show();
                return;
            case 1:
                final r0 r0Var = (r0) obj2;
                final wjb wjbVar = (wjb) obj;
                it3 it3Var = r0Var.W1;
                it3 it3Var2 = r0Var.V1;
                wf2 wf2Var = r0Var.Y1;
                u41 u41Var = r0Var.b2;
                if (!u41Var.R) {
                    if (!u41Var.e0) {
                        if (r0Var.c2 == null) {
                            r0Var.Y0();
                            return;
                        }
                        return;
                    }
                    u41Var.setLoading(true);
                    if (r0Var.e2 != null) {
                        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                        updatetone.flags |= 1;
                        updatetone.display_author = wf2Var.a.q;
                        updatetone.tone = TL_aicompose.InputAiComposeTone.from(r0Var.e2);
                        updatetone.flags |= 2;
                        updatetone.emoji_id = r0Var.c2.longValue();
                        updatetone.flags |= 4;
                        updatetone.title = it3Var2.getText().toString();
                        updatetone.flags |= 8;
                        updatetone.prompt = it3Var.getText().toString();
                        ConnectionsManager.getInstance(r0Var.a).sendRequestTyped(updatetone, new hc((byte) 0), new i8c() {
                            @Override
                            public final void a(Object obj3, Object obj4) {
                                byte b2 = r3;
                                wjb wjbVar2 = wjbVar;
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
                                            ug8.u(r0Var2.a2, wjbVar2, tL_error, false);
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
                                                a1.q1(new u21(frameLayout, wjbVar2), r0Var2.a);
                                                return;
                                            } else {
                                                ug8.u(frameLayout, wjbVar2, tL_error, false);
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
                    createtone.display_author = wf2Var.a.q;
                    createtone.emoji_id = r0Var.c2.longValue();
                    createtone.title = it3Var2.getText().toString();
                    createtone.prompt = it3Var.getText().toString();
                    ConnectionsManager.getInstance(r0Var.a).sendRequestTyped(createtone, new hc((byte) 0), new i8c() {
                        @Override
                        public final void a(Object obj3, Object obj4) {
                            byte b2 = r3;
                            wjb wjbVar2 = wjbVar;
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
                                        ug8.u(r0Var2.a2, wjbVar2, tL_error, false);
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
                                            a1.q1(new u21(frameLayout, wjbVar2), r0Var2.a);
                                            return;
                                        } else {
                                            ug8.u(frameLayout, wjbVar2, tL_error, false);
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
                ((p8c) obj2).a((TL_aicompose.AiComposeTone) obj);
                return;
            case 3:
                o5 o5Var = (o5) obj2;
                long n = cf3.n(((TL_stars.TL_StarGiftAuctionAcquiredGift) obj).peer);
                o5Var.dismiss();
                d S = LaunchActivity.S();
                if (S != null && !l7c.C(n)) {
                    Bundle bundle = new Bundle();
                    if (n > 0) {
                        bundle.putLong("user_id", n);
                        if (n == y6c.h(o5Var.a).e()) {
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
                    rf4 filter = q7Var.getFilter();
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
                ((gt) obj).run();
                ebVar.x.g3.O(true);
                return;
            case 7:
                ((bc) obj2).F0((Context) obj);
                return;
            case 8:
                hd hdVar = (hd) obj2;
                if (!((zc) obj).a) {
                    ed edVar = hdVar.n0;
                    if (edVar != null) {
                        edVar.u(hdVar, -1);
                    }
                    if (hdVar.k0) {
                        hdVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                hd hdVar2 = (hd) obj2;
                if (!((zc) obj).a) {
                    ed edVar2 = hdVar2.p0;
                    if (edVar2 != null) {
                        edVar2.u(hdVar2, -2);
                    }
                    if (hdVar2.k0) {
                        hdVar2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                hd hdVar3 = (hd) obj2;
                if (!((zc) obj).a) {
                    ed edVar3 = hdVar3.t0;
                    if (edVar3 != null) {
                        edVar3.u(hdVar3, -2);
                    }
                    if (hdVar3.k0) {
                        hdVar3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                hd hdVar4 = (hd) obj2;
                if (!((zc) obj).a) {
                    gf9 gf9Var = hdVar4.r0;
                    if (gf9Var != null) {
                        gf9Var.u(hdVar4, -2);
                    }
                    if (hdVar4.k0) {
                        hdVar4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                r7 r7Var3 = (r7) obj2;
                fj fjVar = (fj) obj;
                r7Var3.U(null, null);
                r7Var3.O(fjVar.d, false);
                r7Var3.setupPopupRadialSelectors(fjVar.f);
                r7Var3.I(fjVar.e);
                return;
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                boolean z3 = !zArr[0];
                zArr[0] = z3;
                ((ag2) view).c(z3, true);
                ((rg) obj).run();
                return;
            case 14:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.M0.run();
                ((k63) obj).onClick(null, intValue);
                return;
            case 15:
                ((fx0) ((i4d) obj2).a).y0.run();
                ((p8c) obj).a(null);
                return;
            case 16:
                ((boolean[]) obj2)[0] = true;
                ((rw0) obj).run();
                return;
            case 17:
                o oVar = (o) obj2;
                Activity activity = (Activity) obj;
                sw swVar = oVar.L;
                if (!oVar.i0.B0) {
                    m mVar = oVar.v0[0];
                    if (mVar.e()) {
                        if (mVar.getWebView() != null && !oVar.i0.a0) {
                            if (oVar.j0 != null) {
                                cv0 webView = mVar.getWebView();
                                if (webView != null) {
                                    str = webView.getTitle();
                                    str2 = webView.getUrl();
                                } else {
                                    str = null;
                                    str2 = null;
                                }
                                String r = hv0.r(str2);
                                eb ebVar2 = oVar.j0;
                                if (webView != null) {
                                    bitmap = webView.getFavicon();
                                } else {
                                    bitmap = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = k96.M0(2131742663, null);
                                }
                                if (TextUtils.isEmpty(r)) {
                                    str3 = "about:blank";
                                } else {
                                    str3 = r;
                                }
                                gt gtVar = new gt(oVar, r, (byte) 0);
                                ht htVar = new ht(oVar, mVar, activity, (byte) 0);
                                ws wsVar = new ws(oVar, (byte) 1);
                                ws wsVar2 = new ws(oVar, (byte) 2);
                                b0 b0Var = new b0(oVar, r, mVar, (byte) 6);
                                va vaVar = ebVar2.x;
                                ImageView imageView = ebVar2.f;
                                if (bitmap == null) {
                                    imageView.setImageResource(2131232199);
                                    imageView.setColorFilter(new PorterDuffColorFilter(ebVar2.I, PorterDuff.Mode.SRC_IN));
                                    r8 = 0;
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(ebVar2.getContext().getResources(), bitmap));
                                    r8 = 0;
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = ebVar2.r;
                                textView.setText(vu3.m(str, textView.getPaint().getFontMetricsInt(), false, r8, 0));
                                try {
                                    try {
                                        Uri parse = Uri.parse(str3);
                                        str3 = d01.w(parse, r8, r8, d01.a(parse.getHost()), r8);
                                    } catch (Exception e) {
                                        fa4.g(e, false);
                                    }
                                    str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e2) {
                                    fa4.g(e2, true);
                                    str4 = str3;
                                }
                                TextView textView2 = ebVar2.s;
                                i4 = 0;
                                textView2.setText(vu3.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                                ebVar2.M = htVar;
                                ebVar2.N = wsVar;
                                ebVar2.O = wsVar2;
                                ebVar2.e.setOnClickListener(new t(ebVar2, gtVar, (byte) 6));
                                ebVar2.n.setOnClickListener(b0Var);
                                ebVar2.b = false;
                                ebVar2.setInput(null);
                                vaVar.g3.O(true);
                                vaVar.w0(0);
                            }
                            wt wtVar = oVar.i0;
                            x0 x0Var = new x0(mVar, activity, (byte) 2);
                            ps0 ps0Var = wtVar.c0;
                            ps0Var.setText("");
                            ps0Var.setSelection(i4, ps0Var.getText().length());
                            ps0Var.setScrollX(i4);
                            wtVar.w0 = x0Var;
                            wtVar.k(true);
                            return;
                        }
                        return;
                    } else if (swVar != null) {
                        xja xjaVar = new xja(activity);
                        xjaVar.a = 1;
                        xjaVar.s = -gl.L(32.0f);
                        mVar.d.v0(xjaVar);
                        return;
                    } else {
                        mVar.b.z0(0);
                        return;
                    }
                }
                return;
            case 18:
                eu euVar = (eu) obj2;
                vg5 vg5Var = (vg5) obj;
                if (euVar.h == 0) {
                    euVar.a(1, true);
                    int i5 = ((o) vg5Var).Y;
                    TLRPC.Chat chat = vg5Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = na7.g1(chat);
                    ConnectionsManager.getInstance(i5).sendRequestTyped(tL_channels_joinChannel, new e(euVar, i5, tL_channels_joinChannel, chat, (byte) 2));
                    return;
                }
                return;
            case 19:
                i20 i20Var = (i20) obj2;
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
                if (currentTimeMillis - i20Var.J2 > 300) {
                    int i8 = na7.d1().getInt("speedhint", 0) + 1;
                    if (i8 > 2) {
                        i8 = -10;
                    }
                    na7.d1().edit().putInt("speedhint", i8).apply();
                    if (i8 >= 0 && i20Var.b != null) {
                        ?? ke5Var = new ke5(5, null, i20Var.getContext(), false);
                        i20Var.I2 = ke5Var;
                        ke5Var.setExtraTranslationY(gl.L(6.0f));
                        i20Var.I2.setText(k96.M0(2131745032, null));
                        i20Var.x1.addView(i20Var.I2, nme.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        i20Var.I2.c(i20Var.O1);
                    }
                }
                i20Var.J2 = currentTimeMillis;
                return;
            case 20:
                ((cs5) obj).u();
                ((i20) obj2).J0(6);
                return;
            case 21:
                cj6 cj6Var = (cj6) obj;
                i20 i20Var2 = (i20) ((z10) obj2).G;
                int i9 = i20Var2.a;
                LaunchActivity launchActivity = i20Var2.z2;
                ArrayList arrayList = (ArrayList) na7.q1(i9).w.get(0);
                if (arrayList != null) {
                    i = arrayList.size();
                } else {
                    i = 0;
                }
                if (i > 10 && !TextUtils.isEmpty(cj6Var.getText().toString())) {
                    String charSequence = cj6Var.getText().toString();
                    if (launchActivity.N().getLastFragment() instanceof cj3) {
                        cj3 cj3Var = (cj3) launchActivity.N().getLastFragment();
                        ArrayList arrayList2 = (ArrayList) cj3Var.getMessagesController().w.get(0);
                        if (arrayList2 != null) {
                            i2 = arrayList2.size();
                        } else {
                            i2 = 0;
                        }
                        if (!cj3Var.n2 && (i2 > 10 || cj3Var.L)) {
                            if (!cj3Var.l2) {
                                cj3Var.y = 3;
                                cj3Var.Y.r.setText(charSequence);
                                cj3Var.Y.r.setSelection(charSequence.length());
                            } else {
                                cj3Var.Y.r.setText(charSequence);
                                cj3Var.Y.r.setSelection(charSequence.length());
                                hi3 hi3Var = cj3Var.D0;
                                if (hi3Var != null && (N = hi3Var.N(3)) >= 0 && cj3Var.D0.getTabsView().getCurrentTabId() != N) {
                                    cj3Var.D0.getTabsView().e(N, N);
                                }
                            }
                            i20Var2.dismiss();
                            return;
                        }
                    }
                    cj3 cj3Var2 = new cj3(null);
                    cj3Var2.p2 = charSequence;
                    cj3Var2.y = 3;
                    launchActivity.u0(cj3Var2, false, false);
                    i20Var2.dismiss();
                    return;
                }
                return;
            case 22:
                mb0 mb0Var = (mb0) obj2;
                ((boolean[]) obj)[0] = true;
                mb0Var.K.z1(mb0Var.Z);
                mb0Var.T.dismiss();
                return;
            case 23:
                bc0 bc0Var = (bc0) obj2;
                bc0Var.b(false);
                bc0Var.e.j((cc0) obj);
                return;
            case 24:
                ((ss0) obj2).q0((Context) obj, view);
                return;
            case 25:
                ow0 ow0Var = (ow0) obj2;
                lp0 lp0Var = (lp0) obj;
                if (lp0Var.c()) {
                    lp0Var.a();
                } else {
                    File file = lp0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = lp0Var.d;
                        gl.s2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                    }
                }
                cs5 cs5Var = ow0Var.P0;
                if (cs5Var != null) {
                    cs5Var.u();
                    ow0Var.P0 = null;
                    return;
                }
                return;
            case 26:
                gl.g(((TL_account.TL_businessChatLink) obj2).link);
                u21.b0((mu1) obj).k(false).j();
                return;
            case 27:
                ((r61) ((p61) obj2).f).v0((ag2) obj);
                return;
            case 28:
                z61 z61Var = (z61) obj2;
                h71 h71Var = (h71) obj;
                d71 d71Var = z61Var.f.G;
                if (d71Var != null) {
                    d71Var.i(h71Var.c, h71Var.d, true);
                }
                m8 m8Var = z61Var.a;
                if (m8Var != null) {
                    m8Var.d(true);
                    return;
                }
                return;
            default:
                z81 z81Var = (z81) obj2;
                w81 w81Var = (w81) obj;
                ArrayList arrayList3 = w81Var.b;
                if (arrayList3.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList3.get(0);
                    TLRPC.UserFull W1 = z81Var.getMessagesController().W1(user.id);
                    z81Var.L = user;
                    boolean z4 = w81Var.e;
                    if (!z4 && (W1 == null || !W1.video_calls_available)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    rgc.m(user, z4, z2, z81Var.getParentActivity(), null, z81Var.getAccountInstance());
                    return;
                }
                boolean z5 = w81Var.e;
                HashSet hashSet = new HashSet();
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList3.get(i10);
                    i10++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) w81Var.c.get(0)).id;
                hd hdVar5 = new hd(3, null, z81Var.getParentActivity());
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = z81Var.getMessagesController().k4.w3.f();
                hdVar5.setOnCancelListener(new g81(z81Var, z81Var.getConnectionsManager().sendRequest(getgroupcall, new f81(z81Var, hdVar5, hashSet, tL_inputGroupCallInviteMessage, z5, (byte) 1)), (byte) 1));
                hdVar5.q(600L);
                return;
        }
    }
}
