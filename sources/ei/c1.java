package ei;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aa;
import org.telegram.ui.ag0;
import org.telegram.ui.ly;
import org.telegram.ui.ry;
import org.telegram.ui.wf1;
import org.telegram.ui.xn;
import yh.l7;
import yh.t5;
public final class c1 implements View.OnClickListener {
    public final int f8261a = 0;
    public final long f8262b;
    public final int f8263c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f8264f;
    public final Object h;

    public c1(p1 p1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, org.telegram.tgnet.e eVar, int i10, long j3, org.telegram.ui.web.s sVar) {
        this.d = p1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f8264f = eVar;
        this.f8263c = i10;
        this.f8262b = j3;
        this.h = sVar;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        zf.a aVar;
        switch (this.f8261a) {
            case 0:
                final p1 p1Var = (p1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f8264f;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.h;
                final org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.f8520b0 = true;
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
                            org.telegram.ui.web.s sVar2 = sVar;
                            if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                bundle.putBoolean("allowUsers", true);
                                tL_messages_preparedInlineMessage = tL_messages_preparedInlineMessage2;
                            } else {
                                tL_messages_preparedInlineMessage = tL_messages_preparedInlineMessage2;
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
                            sVar = sVar2;
                        }
                    }
                    org.telegram.ui.web.s sVar3 = sVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    n1 n1Var = new n1(p1Var, bundle, eVar);
                    final int i11 = this.f8263c;
                    final long j3 = this.f8262b;
                    n1Var.C2 = new ly() {
                        @Override
                        public final boolean A() {
                            return false;
                        }

                        @Override
                        public final boolean K(ry ryVar) {
                            return false;
                        }

                        @Override
                        public final boolean u(ry ryVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, boolean z11, int i12, int i13, wf1 wf1Var) {
                            String str;
                            MessageObject messageObject;
                            TLRPC.TL_forumTopic findTopic;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            boolean z12 = false;
                            int i14 = 0;
                            while (i14 < size2) {
                                Object obj = arrayList2.get(i14);
                                i14++;
                                MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) obj;
                                long j10 = topicKey.dialogId;
                                long j11 = topicKey.topicId;
                                if (!DialogObject.isEncryptedDialog(j10)) {
                                    int i15 = i11;
                                    if (j11 != 0 && (findTopic = MessagesController.getInstance(i15).getTopicsController().findTopic(-j10, j11)) != null && (message = findTopic.topicStartMessage) != null) {
                                        MessageObject messageObject2 = new MessageObject(i15, message, z12, z12);
                                        messageObject2.isTopicMainMessage = true;
                                        messageObject = messageObject2;
                                    } else {
                                        messageObject = null;
                                    }
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f18081id);
                                    hashMap.put("bot", "" + j3);
                                    long j12 = j10;
                                    MessageObject messageObject3 = messageObject;
                                    SendMessagesHelper.prepareSendingBotContextResult(U, AccountInstance.getInstance(i15), tL_messages_preparedInlineMessage4.result, hashMap, j12, messageObject3, messageObject, null, null, z11, i12, 0, null, 0L, 0L);
                                    if (charSequence != null) {
                                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i15);
                                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j12, messageObject3, messageObject3, null, true, null, null, null, true, 0, 0, null, false);
                                        j12 = j12;
                                        sendMessagesHelper.sendMessage(of2);
                                    }
                                    arrayList3.add(Long.valueOf(j12));
                                    i14 = i14;
                                    z12 = false;
                                }
                            }
                            p1 p1Var2 = p1.this;
                            if (!p1Var2.f8521c0) {
                                p1Var2.f8521c0 = true;
                                if (arrayList3.size() > 0) {
                                    str = null;
                                } else {
                                    str = "USER_DECLINED";
                                }
                                eVar.run(str, arrayList3);
                            }
                            if (wf1Var != null) {
                                wf1Var.finishFragment();
                                ryVar.removeSelfFromStack();
                                return true;
                            }
                            ryVar.finishFragment();
                            return true;
                        }
                    };
                    U.presentFragment(n1Var);
                    p1Var.dismiss();
                    sVar3.run();
                    return;
                }
                return;
            case 1:
                ag0 ag0Var = (ag0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f8264f;
                String str3 = (String) this.h;
                ci.d dVar = ag0Var.f31786b;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f8262b;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f8263c;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject p5 = k3.p(null, false);
                    if (p5 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = p5.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    ag0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new aa(ag0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
            default:
                yh.e0 e0Var = (yh.e0) this.d;
                Context context = (Context) this.e;
                d6 d6Var = (d6) this.f8264f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (e0Var.f47007s.W) {
                    int i12 = this.f8263c;
                    if (MessagesController.getInstance(i12).isFrozen()) {
                        org.telegram.ui.b.b(i12);
                        return;
                    }
                    t5 x10 = t5.x(i12, e0Var.H.f48896a);
                    if (x10.e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!e0Var.f47003c && (aVar == null || aVar.f48897b < e0Var.H.f48897b)) {
                        zf.a aVar2 = e0Var.H;
                        zf.b bVar = aVar2.f48896a;
                        if (bVar == zf.b.f48898a) {
                            long a2 = aVar2.a();
                            long j10 = this.f8262b;
                            new l7(context, d6Var, a2, 13, ng.d.h(i12, j10), null, j10).show();
                            return;
                        } else if (bVar == zf.b.f48899b) {
                            new di.h(context, d6Var, aVar2, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    callback.run(MessageSuggestionParams.of(e0Var.H, e0Var.I));
                    e0Var.dismiss();
                    return;
                }
                return;
        }
    }

    public c1(ag0 ag0Var, String str, long j3, String str2, String str3, int i10) {
        this.d = ag0Var;
        this.e = str;
        this.f8262b = j3;
        this.f8264f = str2;
        this.h = str3;
        this.f8263c = i10;
    }

    public c1(yh.e0 e0Var, xn xnVar, int i10, Context context, d6 d6Var, long j3, Utilities.Callback callback) {
        this.d = e0Var;
        this.f8263c = i10;
        this.e = context;
        this.f8264f = d6Var;
        this.f8262b = j3;
        this.h = callback;
    }
}
