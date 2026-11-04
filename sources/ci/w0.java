package ci;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.ej;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.pr;
import org.telegram.messenger.u10;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.id0;
import org.telegram.ui.m91;
import org.telegram.ui.nw;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
public final class w0 implements View.OnClickListener {
    public final int f6225a = 0;
    public final int f6226b;
    public final long f6227c;
    public final KeyEvent.Callback d;
    public final Object f6228e;
    public final Object f6229f;
    public final Object h;

    public w0(x0 x0Var, wm wmVar, int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, u10 u10Var) {
        this.d = x0Var;
        this.f6226b = i3;
        this.f6228e = context;
        this.f6229f = e6Var;
        this.f6227c = j10;
        this.h = u10Var;
    }

    @Override
    public final void onClick(View view) {
        dg.a aVar;
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        switch (this.f6225a) {
            case 0:
                x0 x0Var = (x0) this.d;
                Context context = (Context) this.f6228e;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f6229f;
                u10 u10Var = (u10) this.h;
                if (x0Var.f6316r1.f12517d0) {
                    int i3 = this.f6226b;
                    if (hp.s1(i3).v2()) {
                        org.telegram.ui.b.b(i3);
                        return;
                    }
                    e9 x10 = e9.x(i3, x0Var.f6324z1.f8923a);
                    if (x10.f5032e) {
                        aVar = dg.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!x0Var.k1 && (aVar == null || aVar.f8924b < x0Var.f6324z1.f8924b)) {
                        dg.a aVar2 = x0Var.f6324z1;
                        dg.b bVar = aVar2.f8923a;
                        if (bVar == dg.b.f8925a) {
                            long a10 = aVar2.a();
                            long j10 = this.f6227c;
                            new mb(context, e6Var, a10, 13, rg.c.h(i3, j10), null, j10).show();
                            return;
                        } else if (bVar == dg.b.f8926b) {
                            new hi.f(context, e6Var, aVar2, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    u10Var.a(new ej(x0Var.f6324z1, x0Var.A1));
                    x0Var.dismiss();
                    return;
                }
                return;
            case 1:
                final ii.j1 j1Var = (ii.j1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.f6228e;
                final ai.n0 n0Var = (ai.n0) this.f6229f;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.h;
                final org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    j1Var.U1 = true;
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
                            org.telegram.ui.web.r rVar2 = rVar;
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
                            rVar = rVar2;
                        }
                    }
                    org.telegram.ui.web.r rVar3 = rVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    ii.h1 h1Var = new ii.h1(j1Var, bundle, n0Var);
                    final int i11 = this.f6226b;
                    final long j11 = this.f6227c;
                    h1Var.D2 = new nw() {
                        @Override
                        public final boolean G() {
                            return false;
                        }

                        @Override
                        public final boolean N(uw uwVar) {
                            return false;
                        }

                        @Override
                        public final boolean y(uw uwVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i12, int i13, m91 m91Var) {
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
                                zi ziVar = null;
                                if (i14 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i14);
                                i14++;
                                pr prVar = (pr) obj;
                                long j12 = prVar.f24797a;
                                long j13 = prVar.f24798b;
                                if (!m5.C(j12)) {
                                    int i15 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                                    int i16 = i11;
                                    if (i15 != 0 && (f10 = hp.s1(i16).f23102q7.f(-j12, j13)) != null && (message = f10.topicStartMessage) != null) {
                                        ziVar = new zi(i16, message, false, false);
                                        ziVar.f26885p = true;
                                    }
                                    zi ziVar2 = ziVar;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f26999id);
                                    hashMap.put("bot", "" + j11);
                                    yy.S(i12, j12, 0L, 0L, hashMap, org.telegram.messenger.c.a(i16), ziVar2, ziVar2, null, tL_messages_preparedInlineMessage4.result, null, T, null, z12);
                                    if (charSequence != null) {
                                        yy.C(i16).r0(wy.b(charSequence.toString(), j12, ziVar2, ziVar2, null, true, null, null, null, true, 0, 0, null, false));
                                    }
                                    arrayList3.add(Long.valueOf(j12));
                                }
                            }
                            j1 j1Var2 = j1.this;
                            if (!j1Var2.V1) {
                                j1Var2.V1 = true;
                                if (arrayList3.size() <= 0) {
                                    str = "USER_DECLINED";
                                }
                                n0Var.a(str, arrayList3);
                            }
                            if (m91Var != null) {
                                m91Var.finishFragment();
                                uwVar.removeSelfFromStack();
                                return true;
                            }
                            uwVar.finishFragment();
                            return true;
                        }
                    };
                    T.presentFragment(h1Var);
                    j1Var.dismiss();
                    rVar3.run();
                    return;
                }
                return;
            default:
                id0 id0Var = (id0) this.d;
                String str = (String) this.f6228e;
                String str2 = (String) this.f6229f;
                String str3 = (String) this.h;
                gi.d dVar = id0Var.f46245b;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f6227c;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f6226b;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject u10 = ii.a3.u(null, false);
                    if (u10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    id0Var.f46252w.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.y9(id0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
        }
    }

    public w0(ii.j1 j1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, ai.n0 n0Var, int i3, long j10, org.telegram.ui.web.r rVar) {
        this.d = j1Var;
        this.f6228e = tL_messages_preparedInlineMessage;
        this.f6229f = n0Var;
        this.f6226b = i3;
        this.f6227c = j10;
        this.h = rVar;
    }

    public w0(id0 id0Var, String str, long j10, String str2, String str3, int i3) {
        this.d = id0Var;
        this.f6228e = str;
        this.f6227c = j10;
        this.f6229f = str2;
        this.h = str3;
        this.f6226b = i3;
    }
}
