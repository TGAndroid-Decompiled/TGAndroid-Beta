package di;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.fj;
import org.telegram.messenger.kj;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.sr;
import org.telegram.messenger.x10;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.ld0;
import org.telegram.ui.ww;
import org.telegram.ui.y91;
public final class q0 implements View.OnClickListener {
    public final int f9584a = 0;
    public final int f9585b;
    public final long f9586c;
    public final KeyEvent.Callback d;
    public final Object f9587e;
    public final Object f9588f;
    public final Object h;

    public q0(r0 r0Var, bn bnVar, int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, x10 x10Var) {
        this.d = r0Var;
        this.f9585b = i7;
        this.f9587e = context;
        this.f9588f = h6Var;
        this.f9586c = j3;
        this.h = x10Var;
    }

    @Override
    public final void onClick(View view) {
        cg.a aVar;
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        switch (this.f9584a) {
            case 0:
                r0 r0Var = (r0) this.d;
                Context context = (Context) this.f9587e;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f9588f;
                x10 x10Var = (x10) this.h;
                if (r0Var.f9644u1.f14564e0) {
                    int i7 = this.f9585b;
                    if (mp.u1(i7).A2()) {
                        org.telegram.ui.b.b(i7);
                        return;
                    }
                    y8 x10 = y8.x(i7, r0Var.C1.f5300a);
                    if (x10.f10085e) {
                        aVar = cg.a.m(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!r0Var.n1 && (aVar == null || aVar.f5301b < r0Var.C1.f5301b)) {
                        cg.a aVar2 = r0Var.C1;
                        cg.b bVar = aVar2.f5300a;
                        if (bVar == cg.b.f5302a) {
                            long a10 = aVar2.a();
                            long j3 = this.f9586c;
                            new fb(context, h6Var, a10, 13, qg.c.i(i7, j3), null, j3).show();
                            return;
                        } else if (bVar == cg.b.f5303b) {
                            new ii.s(context, h6Var, aVar2, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    x10Var.a(new kj(r0Var.C1, r0Var.D1));
                    r0Var.dismiss();
                    return;
                }
                return;
            case 1:
                final ki.g1 g1Var = (ki.g1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.f9587e;
                final bi.h0 h0Var = (bi.h0) this.f9588f;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.h;
                final org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    g1Var.X1 = true;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 1);
                    if (!tL_messages_preparedInlineMessage2.peer_types.isEmpty()) {
                        int i10 = 0;
                        bundle.putBoolean("allowGroups", false);
                        bundle.putBoolean("allowMegagroups", false);
                        bundle.putBoolean("allowLegacyGroups", false);
                        bundle.putBoolean("allowUsers", false);
                        bundle.putBoolean("allowChannels", false);
                        bundle.putBoolean("allowBots", false);
                        ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_messages_preparedInlineMessage2.peer_types;
                        int size = arrayList.size();
                        while (i10 < size) {
                            TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i10);
                            i10++;
                            TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                            org.telegram.ui.web.q qVar2 = qVar;
                            if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                z10 = true;
                                bundle.putBoolean("allowUsers", true);
                                tL_messages_preparedInlineMessage = tL_messages_preparedInlineMessage2;
                            } else {
                                tL_messages_preparedInlineMessage = tL_messages_preparedInlineMessage2;
                                z10 = true;
                                if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                    bundle.putBoolean("allowBots", true);
                                } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                    bundle.putBoolean("allowChannels", true);
                                } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                    bundle.putBoolean("allowLegacyGroups", true);
                                } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                    bundle.putBoolean("allowMegagroups", true);
                                }
                            }
                            tL_messages_preparedInlineMessage2 = tL_messages_preparedInlineMessage;
                            qVar = qVar2;
                        }
                    }
                    org.telegram.ui.web.q qVar3 = qVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    ki.e1 e1Var = new ki.e1(g1Var, bundle, h0Var);
                    final int i11 = this.f9585b;
                    final long j10 = this.f9586c;
                    e1Var.E2 = new ww() {
                        @Override
                        public final boolean G() {
                            return false;
                        }

                        @Override
                        public final boolean P(cx cxVar) {
                            return false;
                        }

                        @Override
                        public final boolean y(cx cxVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i12, int i13, y91 y91Var) {
                            String str;
                            TLRPC.TL_forumTopic f10;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i14 = 0;
                            while (true) {
                                str = null;
                                r5 = null;
                                r5 = null;
                                fj fjVar = null;
                                if (i14 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i14);
                                i14++;
                                sr srVar = (sr) obj;
                                long j11 = srVar.f26873a;
                                long j12 = srVar.f26874b;
                                if (!n5.C(j11)) {
                                    int i15 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                                    int i16 = i11;
                                    if (i15 != 0 && (f10 = mp.u1(i16).f25797t7.f(-j11, j12)) != null && (message = f10.topicStartMessage) != null) {
                                        fjVar = new fj(i16, message, false, false);
                                        fjVar.f24012p = true;
                                    }
                                    fj fjVar2 = fjVar;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f28429id);
                                    hashMap.put("bot", "" + j10);
                                    zy.S(i12, j11, 0L, 0L, hashMap, org.telegram.messenger.c.a(i16), fjVar2, fjVar2, null, tL_messages_preparedInlineMessage4.result, null, T, null, z12);
                                    if (charSequence != null) {
                                        zy.C(i16).r0(xy.b(charSequence.toString(), j11, fjVar2, fjVar2, null, true, null, null, null, true, 0, 0, null, false));
                                    }
                                    arrayList3.add(Long.valueOf(j11));
                                }
                            }
                            g1 g1Var2 = g1.this;
                            if (!g1Var2.Y1) {
                                g1Var2.Y1 = true;
                                if (arrayList3.size() <= 0) {
                                    str = "USER_DECLINED";
                                }
                                h0Var.a(str, arrayList3);
                            }
                            if (y91Var != null) {
                                y91Var.finishFragment();
                                cxVar.removeSelfFromStack();
                                return true;
                            }
                            cxVar.finishFragment();
                            return true;
                        }
                    };
                    T.presentFragment(e1Var);
                    g1Var.dismiss();
                    qVar3.run();
                    return;
                }
                return;
            default:
                ld0 ld0Var = (ld0) this.d;
                String str = (String) this.f9587e;
                String str2 = (String) this.f9588f;
                String str3 = (String) this.h;
                hi.e eVar = ld0Var.f49590b;
                if (!eVar.R) {
                    eVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f9586c;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f9585b;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject u10 = ki.s2.u(null, false);
                    if (u10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    ld0Var.f49597w.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.z9(ld0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
        }
    }

    public q0(ki.g1 g1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, bi.h0 h0Var, int i7, long j3, org.telegram.ui.web.q qVar) {
        this.d = g1Var;
        this.f9587e = tL_messages_preparedInlineMessage;
        this.f9588f = h0Var;
        this.f9585b = i7;
        this.f9586c = j3;
        this.h = qVar;
    }

    public q0(ld0 ld0Var, String str, long j3, String str2, String str3, int i7) {
        this.d = ld0Var;
        this.f9587e = str;
        this.f9586c = j3;
        this.f9588f = str2;
        this.h = str3;
        this.f9585b = i7;
    }
}
