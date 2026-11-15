package di;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.lj;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.kd0;
import org.telegram.ui.sw;
import org.telegram.ui.u91;
import org.telegram.ui.yw;
public final class r0 implements View.OnClickListener {
    public final int f9306a = 0;
    public final int f9307b;
    public final long f9308c;
    public final KeyEvent.Callback d;
    public final Object f9309e;
    public final Object f9310f;
    public final Object h;

    public r0(s0 s0Var, an anVar, int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, z10 z10Var) {
        this.d = s0Var;
        this.f9307b = i7;
        this.f9309e = context;
        this.f9310f = e6Var;
        this.f9308c = j3;
        this.h = z10Var;
    }

    @Override
    public final void onClick(View view) {
        cg.a aVar;
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        switch (this.f9306a) {
            case 0:
                s0 s0Var = (s0) this.d;
                Context context = (Context) this.f9309e;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f9310f;
                z10 z10Var = (z10) this.h;
                if (s0Var.f9371u1.f14056d0) {
                    int i7 = this.f9307b;
                    if (np.s1(i7).v2()) {
                        org.telegram.ui.b.b(i7);
                        return;
                    }
                    v8 x10 = v8.x(i7, s0Var.C1.f4985a);
                    if (x10.f9601e) {
                        aVar = cg.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!s0Var.n1 && (aVar == null || aVar.f4986b < s0Var.C1.f4986b)) {
                        cg.a aVar2 = s0Var.C1;
                        cg.b bVar = aVar2.f4985a;
                        if (bVar == cg.b.f4987a) {
                            long a10 = aVar2.a();
                            long j3 = this.f9308c;
                            new cb(context, e6Var, a10, 13, qg.c.h(i7, j3), null, j3).show();
                            return;
                        } else if (bVar == cg.b.f4988b) {
                            new ii.e(context, e6Var, aVar2, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    z10Var.a(new lj(s0Var.C1, s0Var.D1));
                    s0Var.dismiss();
                    return;
                }
                return;
            case 1:
                final ki.j1 j1Var = (ki.j1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.f9309e;
                final bi.h0 h0Var = (bi.h0) this.f9310f;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.h;
                final org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    j1Var.X1 = true;
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
                    ki.h1 h1Var = new ki.h1(j1Var, bundle, h0Var);
                    final int i11 = this.f9307b;
                    final long j10 = this.f9308c;
                    h1Var.E2 = new sw() {
                        @Override
                        public final boolean H() {
                            return false;
                        }

                        @Override
                        public final boolean P(yw ywVar) {
                            return false;
                        }

                        @Override
                        public final boolean y(yw ywVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i12, int i13, u91 u91Var) {
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
                                gj gjVar = null;
                                if (i14 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i14);
                                i14++;
                                ur urVar = (ur) obj;
                                long j11 = urVar.f26860a;
                                long j12 = urVar.f26861b;
                                if (!m5.C(j11)) {
                                    int i15 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                                    int i16 = i11;
                                    if (i15 != 0 && (f10 = np.s1(i16).f25383r7.f(-j11, j12)) != null && (message = f10.topicStartMessage) != null) {
                                        gjVar = new gj(i16, message, false, false);
                                        gjVar.f23836p = true;
                                    }
                                    gj gjVar2 = gjVar;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f28049id);
                                    hashMap.put("bot", "" + j10);
                                    ez.S(i12, j11, 0L, 0L, hashMap, org.telegram.messenger.c.a(i16), gjVar2, gjVar2, null, tL_messages_preparedInlineMessage4.result, null, T, null, z12);
                                    if (charSequence != null) {
                                        ez.C(i16).r0(cz.b(charSequence.toString(), j11, gjVar2, gjVar2, null, true, null, null, null, true, 0, 0, null, false));
                                    }
                                    arrayList3.add(Long.valueOf(j11));
                                }
                            }
                            j1 j1Var2 = j1.this;
                            if (!j1Var2.Y1) {
                                j1Var2.Y1 = true;
                                if (arrayList3.size() <= 0) {
                                    str = "USER_DECLINED";
                                }
                                h0Var.a(str, arrayList3);
                            }
                            if (u91Var != null) {
                                u91Var.finishFragment();
                                ywVar.removeSelfFromStack();
                                return true;
                            }
                            ywVar.finishFragment();
                            return true;
                        }
                    };
                    T.presentFragment(h1Var);
                    j1Var.dismiss();
                    qVar3.run();
                    return;
                }
                return;
            default:
                kd0 kd0Var = (kd0) this.d;
                String str = (String) this.f9309e;
                String str2 = (String) this.f9310f;
                String str3 = (String) this.h;
                hi.d dVar = kd0Var.f48680b;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f9308c;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f9307b;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject u10 = ki.x2.u(null, false);
                    if (u10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    kd0Var.f48687w.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.z9(kd0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
        }
    }

    public r0(ki.j1 j1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, bi.h0 h0Var, int i7, long j3, org.telegram.ui.web.q qVar) {
        this.d = j1Var;
        this.f9309e = tL_messages_preparedInlineMessage;
        this.f9310f = h0Var;
        this.f9307b = i7;
        this.f9308c = j3;
        this.h = qVar;
    }

    public r0(kd0 kd0Var, String str, long j3, String str2, String str3, int i7) {
        this.d = kd0Var;
        this.f9309e = str;
        this.f9308c = j3;
        this.f9310f = str2;
        this.h = str3;
        this.f9307b = i7;
    }
}
