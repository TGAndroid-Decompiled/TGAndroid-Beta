package defpackage;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.m;
public final class o implements ee, RequestTimeDelegate, dt, g59, xgc, w18, ue7, c5c, k01, o01, RequestDelegateTimestamp {
    public final byte a;
    public final Object b;
    public final Object c;

    public o(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void a(View view, RectF rectF) {
        ((im0) this.b).i(rectF.left, rectF.top);
        View view2 = (View) ((WeakReference) this.c).get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public final void b(n01 n01Var) {
        String str;
        int i;
        n01 n01Var2;
        p01 p01Var = (p01) this.b;
        o01 o01Var = (o01) this.c;
        if (n01Var.a == 0 && p01Var.b == 0) {
            int i2 = n01Var.c;
            if (i2 > 0) {
                str = NativeInstance.probeListenerAudio(n01Var.b, i2);
            } else {
                str = null;
            }
            if (str == null) {
                n01Var2 = new n01(n01Var.a, n01Var.b, n01Var.c, n01Var.d, 0, n01Var.f);
            } else {
                String[] split = str.split("\n");
                try {
                    i = Integer.parseInt(split[0]);
                } catch (NumberFormatException unused) {
                    i = 0;
                }
                HashMap hashMap = new HashMap();
                for (int i3 = 1; i3 < split.length; i3++) {
                    int lastIndexOf = split[i3].lastIndexOf(61);
                    if (lastIndexOf > 0) {
                        try {
                            hashMap.put(split[i3].substring(0, lastIndexOf), Integer.valueOf(Integer.parseInt(split[i3].substring(lastIndexOf + 1))));
                        } catch (NumberFormatException unused2) {
                        }
                    }
                }
                n01Var2 = new n01(n01Var.a, n01Var.b, n01Var.c, n01Var.d, Math.max(i, 0), hashMap);
            }
            o01Var.b(n01Var2);
            return;
        }
        o01Var.b(n01Var);
    }

    @Override
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 21:
                to0 to0Var = (to0) obj2;
                to0 to0Var2 = (to0) obj;
                if (i == 1) {
                    to0Var.a(null);
                    return;
                } else if (i != 3) {
                    to0Var2.a(null);
                    return;
                } else {
                    return;
                }
            default:
                qac qacVar = (qac) obj2;
                qac qacVar2 = (qac) obj;
                if (i == 1) {
                    qacVar.a(null);
                    return;
                } else if (i != 3) {
                    qacVar2.a(null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void cancel() {
        ((f11) this.b).b.removeCallbacks((x30) this.c);
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        float f3;
        org.telegram.ui.o oVar = (org.telegram.ui.o) this.b;
        m mVar = (m) this.c;
        if (oVar.L == null || i - 1 >= 0) {
            gkb gkbVar = oVar.Q0;
            if (gkbVar != null) {
                boolean w = gkbVar.w();
                gkb gkbVar2 = oVar.Q0;
                if (w) {
                    gkbVar2.e(false);
                    return;
                }
                gkbVar2.e(false);
            }
            ey adapter = mVar.getAdapter();
            if ((view instanceof mx) && adapter.F != null) {
                mx mxVar = (mx) view;
                if (oVar.I0 == 0) {
                    if ((!mxVar.c || f >= view.getMeasuredWidth() / 2) && !mxVar.d) {
                        TLObject b2 = oc7.r1(oVar.Y).b2("previews");
                        if (b2 instanceof TLRPC.TL_user) {
                            oVar.N(adapter.F.id, (TLRPC.User) b2);
                            return;
                        }
                        int i2 = z8c.t0;
                        long j = adapter.F.id;
                        oVar.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        oVar.I0 = ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new ju(oVar, i2, j));
                    }
                }
            } else if (i >= 0 && i < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i);
                TL_iv.PageBlock w2 = org.telegram.ui.o.w(pageBlock);
                if (w2 instanceof tx) {
                    w2 = ((tx) w2).b;
                }
                if (w2 instanceof TL_iv.pageBlockChannel) {
                    oc7.r1(oVar.Y).C3(sd2.K(((TL_iv.pageBlockChannel) w2).channel, false), oVar.N, 2, null);
                    oVar.l(false, true);
                } else if (w2 instanceof zx) {
                    zx zxVar = (zx) w2;
                    oVar.O(zxVar.a.articles.get(zxVar.b).url, null, null);
                } else if (w2 instanceof TL_iv.pageBlockDetails) {
                    View v = org.telegram.ui.o.v(view);
                    if (v instanceof ov) {
                        oVar.d = null;
                        oVar.f = null;
                        if (adapter.e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) w2;
                            pageblockdetails.open = !pageblockdetails.open;
                            int b = adapter.b();
                            adapter.M();
                            int abs = Math.abs(adapter.b() - b);
                            ov ovVar = (ov) v;
                            AnimatedArrowDrawable animatedArrowDrawable = ovVar.f;
                            if (pageblockdetails.open) {
                                f3 = 0.0f;
                            } else {
                                f3 = 1.0f;
                            }
                            animatedArrowDrawable.a(f3);
                            ovVar.invalidate();
                            if (abs != 0) {
                                int i3 = i + 1;
                                if (pageblockdetails.open) {
                                    adapter.p(i3, abs);
                                } else {
                                    adapter.q(i3, abs);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((au0) this.b).p0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override
    public final void r(he heVar, int i) {
        String str;
        byte b = this.a;
        int i2 = 3600;
        boolean z = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                a1 a1Var = (a1) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                k11 g = heVar.g(-1, true, true);
                g.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(a1Var.a).sendRequestTyped(deletetone, new kc((byte) 0), new p(a1Var, g, tL_aiComposeTone, (byte) 0));
                return;
            case 1:
                ((zn) obj2).z(((boolean[]) obj)[0]);
                return;
            case 2:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) obj2;
                LaunchActivity launchActivity = (LaunchActivity) obj;
                boolean z2 = tL_langPackLanguage.official;
                String str2 = tL_langPackLanguage.lang_code;
                if (z2) {
                    str = "remote_";
                } else {
                    str = "unofficial_";
                }
                hb6 F0 = jb6.D0().F0(b10.h(str, str2));
                hb6 hb6Var = F0;
                if (F0 == null) {
                    ?? obj3 = new Object();
                    obj3.a = tL_langPackLanguage.native_name;
                    obj3.b = tL_langPackLanguage.name;
                    obj3.c = tL_langPackLanguage.lang_code;
                    obj3.e = tL_langPackLanguage.base_lang_code;
                    obj3.f = tL_langPackLanguage.plural_code;
                    obj3.g = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        obj3.d = "remote";
                        hb6Var = obj3;
                    } else {
                        obj3.d = "unofficial";
                        hb6Var = obj3;
                    }
                }
                jb6.D0().c(hb6Var, true, false, false, true, z8c.t0, null);
                launchActivity.y0(true);
                return;
            case 3:
                x92 x92Var = (x92) obj2;
                boolean[] zArr = (boolean[]) obj;
                boolean z3 = zArr[0];
                boolean z4 = zArr[1];
                nk3 nk3Var = (nk3) x92Var.b;
                ArrayList arrayList = (ArrayList) x92Var.c;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Long l = (Long) arrayList.get(i3);
                    long longValue = l.longValue();
                    if (z3) {
                        nk3Var.getMessagesController().t4(longValue, nk3Var.getMessagesController().W1(l), null, null, false);
                    }
                    if (z4) {
                        nk3Var.getMessagesController().T(0, longValue, true);
                    }
                    nk3Var.getMessagesController().t(longValue);
                }
                nk3Var.A3(false);
                return;
            case 4:
                heVar.dismiss();
                ((x0) obj2).a(((EditText) obj).getText().toString());
                return;
            case 5:
                we7 we7Var = (we7) obj;
                int i4 = ((int[]) obj2)[0];
                if (i4 == 0) {
                    i2 = 900;
                } else if (i4 != 1) {
                    if (i4 == 2) {
                        i2 = 28800;
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                }
                we7Var.a(i2);
                return;
            case 6:
                ((AtomicBoolean) obj2).set(true);
                ((gu2) obj).accept(Boolean.FALSE);
                return;
            case 7:
                mj mjVar = (mj) obj2;
                qac qacVar = (qac) obj;
                String trim = mjVar.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    z = ik.a.matcher(trim.trim()).matches();
                }
                if (!z) {
                    gm.z3(mjVar);
                    return;
                }
                qacVar.a(trim);
                heVar.dismiss();
                return;
            case 8:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) obj2;
                int i5 = encryptedChat.ttl;
                int value = ((lp7) obj).getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i5 != encryptedChat.ttl) {
                    dw9.i(z8c.t0).z(encryptedChat, null);
                    cf7 Y = cf7.Y(z8c.t0);
                    Y.a.c(new gd7(Y, encryptedChat, (byte) 0));
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = oc7.r1(z8c.t0).W3.edit();
                edit.remove("color_" + ((String) obj2));
                edit.commit();
                ((Runnable) obj).run();
                return;
            case 10:
                ((ue7) obj2).z(((boolean[]) obj)[0]);
                return;
            case 11:
                ((SharedPreferences) obj2).edit().putBoolean("proxycheckstatusip", true).apply();
                ((op6) obj).run();
                return;
            case 12:
            case 13:
            case 14:
            case 17:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                boolean[] zArr2 = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 15:
                tz tzVar = (tz) obj2;
                pz pzVar = (pz) obj;
                try {
                    int parseInt = Integer.parseInt(pzVar.getText().toString().trim());
                    tzVar.b1(parseInt);
                    tzVar.X1.setValue(parseInt);
                    heVar.dismiss();
                    return;
                } catch (Throwable th) {
                    gm.z3(pzVar);
                    fc4.g(th, true);
                    return;
                }
            case 16:
                heVar.dismiss();
                ((v70) obj2).b0((View) obj, true);
                return;
            case 18:
                ((dn0) obj2).j0((HashSet) obj);
                return;
            case 19:
                ((AtomicBoolean) obj2).set(true);
                ((w0a) obj).run();
                return;
            case 20:
                ((to0) obj2).a((TLRPC.TL_premiumGiftCodeOption) obj);
                return;
            case 25:
                qw0 qw0Var = (qw0) obj2;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = oc7.r1(qw0Var.N).p1(qw0Var.V);
                ConnectionsManager.getInstance(qw0Var.N).sendRequest(allowsendmessage, new eo0(qw0Var, (String[]) obj, heVar, (byte) 8));
                return;
        }
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j) {
        ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList;
        h11 h11Var = (h11) this.b;
        c01 c01Var = (c01) this.c;
        long j2 = 0;
        if (tLObject instanceof TL_phone.groupCallStreamChannels) {
            arrayList = ((TL_phone.groupCallStreamChannels) tLObject).channels;
            if (!arrayList.isEmpty() && arrayList.get(0).last_timestamp_ms > 0) {
                j2 = arrayList.get(0).last_timestamp_ms + 1000;
            }
        } else {
            arrayList = null;
        }
        h11Var.e.execute(new p97(h11Var, arrayList, c01Var, j2, (byte) 3));
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    @Override
    public final void z(boolean z) {
        rs0 rs0Var = (rs0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        yv1 j0 = rs0Var.j0();
        if (j0 != null) {
            j0.removeSelfFromStack();
        }
        rs0Var.finishFragment();
        rs0Var.getNotificationCenter().k(nm7.K2, Long.valueOf(rs0Var.a), user, null, Boolean.valueOf(z));
    }

    @Override
    public final void run(long j) {
        gm.c3(new of2((boolean[]) this.b, j, (x51[]) this.c, (byte) 10));
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
