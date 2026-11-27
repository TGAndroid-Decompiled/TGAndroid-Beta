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
public final class o implements fd, RequestTimeDelegate, es, s69, wic, z28, bf7, b7c, lz0, pz0, RequestDelegateTimestamp {
    public final byte a;
    public final Object b;
    public final Object c;

    public o(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void A(boolean z) {
        rr0 rr0Var = (rr0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        zu1 i0 = rr0Var.i0();
        if (i0 != null) {
            i0.removeSelfFromStack();
        }
        rr0Var.finishFragment();
        rr0Var.getNotificationCenter().k(jn7.K2, Long.valueOf(rr0Var.a), user, null, Boolean.valueOf(z));
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final void a(View view, RectF rectF) {
        ((jl0) this.b).i(rectF.left, rectF.top);
        View view2 = (View) ((WeakReference) this.c).get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public final void b(oz0 oz0Var) {
        String str;
        int i;
        oz0 oz0Var2;
        qz0 qz0Var = (qz0) this.b;
        pz0 pz0Var = (pz0) this.c;
        if (oz0Var.a == 0 && qz0Var.b == 0) {
            int i2 = oz0Var.c;
            if (i2 > 0) {
                str = NativeInstance.probeListenerAudio(oz0Var.b, i2);
            } else {
                str = null;
            }
            if (str == null) {
                oz0Var2 = new oz0(oz0Var.a, oz0Var.b, oz0Var.c, oz0Var.d, 0, oz0Var.f);
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
                oz0Var2 = new oz0(oz0Var.a, oz0Var.b, oz0Var.c, oz0Var.d, Math.max(i, 0), hashMap);
            }
            pz0Var.b(oz0Var2);
            return;
        }
        pz0Var.b(oz0Var);
    }

    @Override
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 21:
                tn0 tn0Var = (tn0) obj2;
                tn0 tn0Var2 = (tn0) obj;
                if (i == 1) {
                    tn0Var.a(null);
                    return;
                } else if (i != 3) {
                    tn0Var2.a(null);
                    return;
                } else {
                    return;
                }
            default:
                pcc pccVar = (pcc) obj2;
                pcc pccVar2 = (pcc) obj;
                if (i == 1) {
                    pccVar.a(null);
                    return;
                } else if (i != 3) {
                    pccVar2.a(null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void cancel() {
        ((g01) this.b).b.removeCallbacks((a30) this.c);
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        float f3;
        org.telegram.ui.o oVar = (org.telegram.ui.o) this.b;
        m mVar = (m) this.c;
        if (oVar.L == null || i - 1 >= 0) {
            amb ambVar = oVar.Q0;
            if (ambVar != null) {
                boolean w = ambVar.w();
                amb ambVar2 = oVar.Q0;
                if (w) {
                    ambVar2.e(false);
                    return;
                }
                ambVar2.e(false);
            }
            ex adapter = mVar.getAdapter();
            if ((view instanceof nw) && adapter.F != null) {
                nw nwVar = (nw) view;
                if (oVar.I0 == 0) {
                    if ((!nwVar.c || f >= view.getMeasuredWidth() / 2) && !nwVar.d) {
                        TLObject c2 = uc7.s1(oVar.Y).c2("previews");
                        if (c2 instanceof TLRPC.TL_user) {
                            oVar.N(adapter.F.id, (TLRPC.User) c2);
                            return;
                        }
                        int i2 = yac.t0;
                        long j = adapter.F.id;
                        oVar.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        oVar.I0 = ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new nt(oVar, i2, j));
                    }
                }
            } else if (i >= 0 && i < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i);
                TL_iv.PageBlock w2 = org.telegram.ui.o.w(pageBlock);
                if (w2 instanceof uw) {
                    w2 = ((uw) w2).b;
                }
                if (w2 instanceof TL_iv.pageBlockChannel) {
                    uc7.s1(oVar.Y).H3(xc2.K(((TL_iv.pageBlockChannel) w2).channel, false), oVar.N, 2, null);
                    oVar.l(false, true);
                } else if (w2 instanceof ax) {
                    ax axVar = (ax) w2;
                    oVar.O(axVar.a.articles.get(axVar.b).url, null, null);
                } else if (w2 instanceof TL_iv.pageBlockDetails) {
                    View v = org.telegram.ui.o.v(view);
                    if (v instanceof pu) {
                        oVar.d = null;
                        oVar.f = null;
                        if (adapter.e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) w2;
                            pageblockdetails.open = !pageblockdetails.open;
                            int b = adapter.b();
                            adapter.M();
                            int abs = Math.abs(adapter.b() - b);
                            pu puVar = (pu) v;
                            AnimatedArrowDrawable animatedArrowDrawable = puVar.f;
                            if (pageblockdetails.open) {
                                f3 = 0.0f;
                            } else {
                                f3 = 1.0f;
                            }
                            animatedArrowDrawable.a(f3);
                            puVar.invalidate();
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
        ((at0) this.b).o0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j) {
        ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList;
        i01 i01Var = (i01) this.b;
        dz0 dz0Var = (dz0) this.c;
        long j2 = 0;
        if (tLObject instanceof TL_phone.groupCallStreamChannels) {
            arrayList = ((TL_phone.groupCallStreamChannels) tLObject).channels;
            if (!arrayList.isEmpty() && arrayList.get(0).last_timestamp_ms > 0) {
                j2 = arrayList.get(0).last_timestamp_ms + 1000;
            }
        } else {
            arrayList = null;
        }
        i01Var.e.execute(new ba7(i01Var, arrayList, dz0Var, j2, (byte) 3));
    }

    @Override
    public final void w(id idVar, int i) {
        String str;
        byte b = this.a;
        int i2 = 3600;
        boolean z = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                b1 b1Var = (b1) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                l01 g = idVar.g(-1, true, true);
                g.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(b1Var.a).sendRequestTyped(deletetone, new ic((byte) 0), new p(b1Var, g, tL_aiComposeTone, (byte) 0));
                return;
            case 1:
                ((an) obj2).A(((boolean[]) obj)[0]);
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
                mb6 F0 = ob6.D0().F0(c00.i(str, str2));
                mb6 mb6Var = F0;
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
                        mb6Var = obj3;
                    } else {
                        obj3.d = "unofficial";
                        mb6Var = obj3;
                    }
                }
                ob6.D0().c(mb6Var, true, false, false, true, yac.t0, null);
                launchActivity.y0(true);
                return;
            case 3:
                q72 q72Var = (q72) obj2;
                boolean[] zArr = (boolean[]) obj;
                boolean z3 = zArr[0];
                boolean z4 = zArr[1];
                uj3 uj3Var = (uj3) q72Var.b;
                ArrayList arrayList = (ArrayList) q72Var.c;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Long l = (Long) arrayList.get(i3);
                    long longValue = l.longValue();
                    if (z3) {
                        uj3Var.getMessagesController().z4(longValue, uj3Var.getMessagesController().X1(l), null, null, false);
                    }
                    if (z4) {
                        uj3Var.getMessagesController().V(0, longValue, true);
                    }
                    uj3Var.getMessagesController().u(longValue);
                }
                uj3Var.A3(false);
                return;
            case 4:
                idVar.dismiss();
                ((y0) obj2).a(((EditText) obj).getText().toString());
                return;
            case 5:
                SharedPreferences.Editor edit = uc7.s1(yac.t0).W3.edit();
                edit.remove("color_" + ((String) obj2));
                edit.commit();
                ((Runnable) obj).run();
                return;
            case 6:
                ((AtomicBoolean) obj2).set(true);
                ((pt2) obj).accept(Boolean.FALSE);
                return;
            case 7:
                df7 df7Var = (df7) obj;
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
                df7Var.a(i2);
                return;
            case 8:
                ni niVar = (ni) obj2;
                pcc pccVar = (pcc) obj;
                String trim = niVar.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    z = jj.a.matcher(trim.trim()).matches();
                }
                if (!z) {
                    hl.z3(niVar);
                    return;
                }
                pccVar.a(trim);
                idVar.dismiss();
                return;
            case 9:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) obj2;
                int i5 = encryptedChat.ttl;
                int value = ((hq7) obj).getValue();
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
                    wx9.i(yac.t0).z(encryptedChat, null);
                    jf7 Y = jf7.Y(yac.t0);
                    Y.a.c(new id7(Y, encryptedChat, (byte) 0));
                    return;
                }
                return;
            case 10:
                ((bf7) obj2).A(((boolean[]) obj)[0]);
                return;
            case 11:
                ((SharedPreferences) obj2).edit().putBoolean("proxycheckstatusip", true).apply();
                ((es6) obj).run();
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
                uy uyVar = (uy) obj2;
                qy qyVar = (qy) obj;
                try {
                    int parseInt = Integer.parseInt(qyVar.getText().toString().trim());
                    uyVar.c1(parseInt);
                    uyVar.X1.setValue(parseInt);
                    idVar.dismiss();
                    return;
                } catch (Throwable th) {
                    hl.z3(qyVar);
                    cc4.g(th, true);
                    return;
                }
            case 16:
                idVar.dismiss();
                ((x60) obj2).a0((View) obj, true);
                return;
            case 18:
                ((dm0) obj2).i0((HashSet) obj);
                return;
            case 19:
                ((AtomicBoolean) obj2).set(true);
                ((o2a) obj).run();
                return;
            case 20:
                ((tn0) obj2).a((TLRPC.TL_premiumGiftCodeOption) obj);
                return;
            case 25:
                rv0 rv0Var = (rv0) obj2;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = uc7.s1(rv0Var.N).q1(rv0Var.V);
                ConnectionsManager.getInstance(rv0Var.N).sendRequest(allowsendmessage, new fn0(rv0Var, (String[]) obj, idVar, (byte) 8));
                return;
        }
    }

    @Override
    public final void run(long j) {
        hl.c3(new ue2((boolean[]) this.b, j, (y41[]) this.c, (byte) 10));
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
