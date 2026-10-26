package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.af1;
import org.telegram.ui.cy;
import org.telegram.ui.of0;
import org.telegram.ui.un;
import org.telegram.ui.ux;
public final class d1 implements View.OnClickListener {
    public final int f4479a = 0;
    public final int f4480b;
    public final long f4481c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f4482f;
    public final Object h;

    public d1(g1 g1Var, un unVar, int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, Utilities.Callback callback) {
        this.d = g1Var;
        this.f4480b = i10;
        this.e = context;
        this.f4482f = u6Var;
        this.f4481c = j10;
        this.h = callback;
    }

    @Override
    public final void onClick(View view) {
        bg.a aVar;
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        switch (this.f4479a) {
            case 0:
                g1 g1Var = (g1) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.f4482f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (g1Var.f4638s.f10687c0) {
                    int i10 = this.f4480b;
                    if (MessagesController.getInstance(i10).isFrozen()) {
                        org.telegram.ui.b.b(i10);
                        return;
                    }
                    ca x9 = ca.x(i10, g1Var.H.f3978a);
                    if (x9.e) {
                        aVar = bg.a.l(x9.p());
                    } else {
                        aVar = null;
                    }
                    if (!g1Var.f4634c && (aVar == null || aVar.f3979b < g1Var.H.f3979b)) {
                        bg.a aVar2 = g1Var.H;
                        bg.b bVar = aVar2.f3978a;
                        if (bVar == bg.b.f3980a) {
                            long a2 = aVar2.a();
                            long j10 = this.f4481c;
                            new tc(context, u6Var, a2, 13, pg.d.h(i10, j10), null, j10).show();
                            return;
                        } else if (bVar == bg.b.f3981b) {
                            new gi.g(context, u6Var, aVar2, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    callback.run(MessageSuggestionParams.of(g1Var.H, g1Var.I));
                    g1Var.dismiss();
                    return;
                }
                return;
            case 1:
                final hi.s1 s1Var = (hi.s1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final t0 t0Var = (t0) this.f4482f;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.h;
                final org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    s1Var.f13262b0 = true;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 1);
                    if (!tL_messages_preparedInlineMessage2.peer_types.isEmpty()) {
                        int i11 = 0;
                        bundle.putBoolean("allowGroups", false);
                        bundle.putBoolean("allowMegagroups", false);
                        bundle.putBoolean("allowLegacyGroups", false);
                        bundle.putBoolean("allowUsers", false);
                        bundle.putBoolean("allowChannels", false);
                        bundle.putBoolean("allowBots", false);
                        ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_messages_preparedInlineMessage2.peer_types;
                        int size = arrayList.size();
                        while (i11 < size) {
                            TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                            i11++;
                            TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                            org.telegram.ui.web.t tVar2 = tVar;
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
                            tVar = tVar2;
                        }
                    }
                    org.telegram.ui.web.t tVar3 = tVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    hi.q1 q1Var = new hi.q1(s1Var, bundle, t0Var);
                    final int i12 = this.f4480b;
                    final long j11 = this.f4481c;
                    q1Var.C2 = new ux() {
                        @Override
                        public final boolean C() {
                            return false;
                        }

                        @Override
                        public final boolean K(cy cyVar) {
                            return false;
                        }

                        @Override
                        public final boolean v(cy cyVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i13, int i14, af1 af1Var) {
                            String str;
                            TLRPC.TL_forumTopic findTopic;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i15 = 0;
                            while (true) {
                                str = null;
                                r5 = null;
                                r5 = null;
                                MessageObject messageObject = null;
                                if (i15 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i15);
                                i15++;
                                MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) obj;
                                long j12 = topicKey.dialogId;
                                long j13 = topicKey.topicId;
                                if (!DialogObject.isEncryptedDialog(j12)) {
                                    int i16 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                                    int i17 = i12;
                                    if (i16 != 0 && (findTopic = MessagesController.getInstance(i17).getTopicsController().findTopic(-j12, j13)) != null && (message = findTopic.topicStartMessage) != null) {
                                        messageObject = new MessageObject(i17, message, false, false);
                                        messageObject.isTopicMainMessage = true;
                                    }
                                    MessageObject messageObject2 = messageObject;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f22025id);
                                    hashMap.put("bot", "" + j11);
                                    long j14 = j12;
                                    SendMessagesHelper.prepareSendingBotContextResult(U, AccountInstance.getInstance(i17), tL_messages_preparedInlineMessage4.result, hashMap, j14, messageObject2, messageObject2, null, null, z12, i13, 0, null, 0L, 0L);
                                    if (charSequence != null) {
                                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i17);
                                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j14, messageObject2, messageObject2, null, true, null, null, null, true, 0, 0, null, false);
                                        j14 = j14;
                                        sendMessagesHelper.sendMessage(of2);
                                    }
                                    arrayList3.add(Long.valueOf(j14));
                                }
                            }
                            s1 s1Var2 = s1.this;
                            if (!s1Var2.f13263c0) {
                                s1Var2.f13263c0 = true;
                                if (arrayList3.size() <= 0) {
                                    str = "USER_DECLINED";
                                }
                                t0Var.run(str, arrayList3);
                            }
                            if (af1Var != null) {
                                af1Var.finishFragment();
                                cyVar.removeSelfFromStack();
                                return true;
                            }
                            cyVar.finishFragment();
                            return true;
                        }
                    };
                    U.presentFragment(q1Var);
                    s1Var.dismiss();
                    tVar3.run();
                    return;
                }
                return;
            default:
                of0 of0Var = (of0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f4482f;
                String str3 = (String) this.h;
                fi.d dVar = of0Var.f42177b;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f4481c;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f4480b;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject q5 = hi.m3.q(null, false);
                    if (q5 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = q5.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    of0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.ea(of0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
        }
    }

    public d1(hi.s1 s1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, t0 t0Var, int i10, long j10, org.telegram.ui.web.t tVar) {
        this.d = s1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f4482f = t0Var;
        this.f4480b = i10;
        this.f4481c = j10;
        this.h = tVar;
    }

    public d1(of0 of0Var, String str, long j10, String str2, String str3, int i10) {
        this.d = of0Var;
        this.e = str;
        this.f4481c = j10;
        this.f4482f = str2;
        this.h = str3;
        this.f4480b = i10;
    }
}
