package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.nj;
import org.telegram.messenger.qp;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.nd0;
import org.telegram.ui.sw;
import org.telegram.ui.y91;
import org.telegram.ui.yw;
public final class d1 implements View.OnClickListener {
    public final int f3637a = 0;
    public final int f3638b;
    public final long f3639c;
    public final KeyEvent.Callback d;
    public final Object f3640e;
    public final Object f3641f;
    public final Object h;

    public d1(e1 e1Var, cn cnVar, int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j3, c20 c20Var) {
        this.d = e1Var;
        this.f3638b = i7;
        this.f3640e = context;
        this.f3641f = g6Var;
        this.f3639c = j3;
        this.h = c20Var;
    }

    @Override
    public final void onClick(View view) {
        cg.a aVar;
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z9;
        switch (this.f3637a) {
            case 0:
                e1 e1Var = (e1) this.d;
                Context context = (Context) this.f3640e;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f3641f;
                c20 c20Var = (c20) this.h;
                if (e1Var.f3740q1.f11752c0) {
                    int i7 = this.f3638b;
                    if (qp.s1(i7).v2()) {
                        org.telegram.ui.b.b(i7);
                        return;
                    }
                    ea x10 = ea.x(i7, e1Var.f3748y1.f6158a);
                    if (x10.f3810e) {
                        aVar = cg.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!e1Var.f3735j1 && (aVar == null || aVar.f6159b < e1Var.f3748y1.f6159b)) {
                        cg.a aVar2 = e1Var.f3748y1;
                        cg.b bVar = aVar2.f6158a;
                        if (bVar == cg.b.f6160a) {
                            long a10 = aVar2.a();
                            long j3 = this.f3639c;
                            new tc(context, g6Var, a10, 13, qg.d.h(i7, j3), null, j3).show();
                            return;
                        } else if (bVar == cg.b.f6161b) {
                            new gi.e(context, g6Var, aVar2, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    c20Var.a(new nj(e1Var.f3748y1, e1Var.f3749z1));
                    e1Var.dismiss();
                    return;
                }
                return;
            case 1:
                final hi.i1 i1Var = (hi.i1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.f3640e;
                final t0 t0Var = (t0) this.f3641f;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.h;
                final org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    i1Var.T1 = true;
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
                            org.telegram.ui.web.p pVar2 = pVar;
                            if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                z9 = true;
                                bundle.putBoolean("allowUsers", true);
                                tL_messages_preparedInlineMessage = tL_messages_preparedInlineMessage2;
                            } else {
                                tL_messages_preparedInlineMessage = tL_messages_preparedInlineMessage2;
                                z9 = true;
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
                            pVar = pVar2;
                        }
                    }
                    org.telegram.ui.web.p pVar3 = pVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    hi.g1 g1Var = new hi.g1(i1Var, bundle, t0Var);
                    final int i11 = this.f3638b;
                    final long j10 = this.f3639c;
                    g1Var.D2 = new sw() {
                        @Override
                        public final boolean G() {
                            return false;
                        }

                        @Override
                        public final boolean N(yw ywVar) {
                            return false;
                        }

                        @Override
                        public final boolean y(yw ywVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, boolean z11, int i12, int i13, y91 y91Var) {
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
                                ij ijVar = null;
                                if (i14 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i14);
                                i14++;
                                xr xrVar = (xr) obj;
                                long j11 = xrVar.f26520a;
                                long j12 = xrVar.f26521b;
                                if (!m5.C(j11)) {
                                    int i15 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                                    int i16 = i11;
                                    if (i15 != 0 && (f10 = qp.s1(i16).f24877q7.f(-j11, j12)) != null && (message = f10.topicStartMessage) != null) {
                                        ijVar = new ij(i16, message, false, false);
                                        ijVar.f23279p = true;
                                    }
                                    ij ijVar2 = ijVar;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f26954id);
                                    hashMap.put("bot", "" + j10);
                                    gz.S(i12, j11, 0L, 0L, hashMap, org.telegram.messenger.c.a(i16), ijVar2, ijVar2, null, tL_messages_preparedInlineMessage4.result, null, T, null, z11);
                                    if (charSequence != null) {
                                        gz.C(i16).r0(ez.b(charSequence.toString(), j11, ijVar2, ijVar2, null, true, null, null, null, true, 0, 0, null, false));
                                    }
                                    arrayList3.add(Long.valueOf(j11));
                                }
                            }
                            i1 i1Var2 = i1.this;
                            if (!i1Var2.U1) {
                                i1Var2.U1 = true;
                                if (arrayList3.size() <= 0) {
                                    str = "USER_DECLINED";
                                }
                                t0Var.a(str, arrayList3);
                            }
                            if (y91Var != null) {
                                y91Var.finishFragment();
                                ywVar.removeSelfFromStack();
                                return true;
                            }
                            ywVar.finishFragment();
                            return true;
                        }
                    };
                    T.presentFragment(g1Var);
                    i1Var.dismiss();
                    pVar3.run();
                    return;
                }
                return;
            default:
                nd0 nd0Var = (nd0) this.d;
                String str = (String) this.f3640e;
                String str2 = (String) this.f3641f;
                String str3 = (String) this.h;
                fi.d dVar = nd0Var.f48166b;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f3639c;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f3638b;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject u10 = hi.a3.u(null, false);
                    if (u10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    nd0Var.f48173w.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.z9(nd0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
        }
    }

    public d1(hi.i1 i1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, t0 t0Var, int i7, long j3, org.telegram.ui.web.p pVar) {
        this.d = i1Var;
        this.f3640e = tL_messages_preparedInlineMessage;
        this.f3641f = t0Var;
        this.f3638b = i7;
        this.f3639c = j3;
        this.h = pVar;
    }

    public d1(nd0 nd0Var, String str, long j3, String str2, String str3, int i7) {
        this.d = nd0Var;
        this.f3640e = str;
        this.f3639c = j3;
        this.f3641f = str2;
        this.h = str3;
        this.f3638b = i7;
    }
}
