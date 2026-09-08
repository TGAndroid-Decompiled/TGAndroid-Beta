package fi;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aa;
import org.telegram.ui.co;
import org.telegram.ui.eg1;
import org.telegram.ui.fg0;
import org.telegram.ui.oy;
import org.telegram.ui.uy;
import zh.k7;
import zh.s5;
public final class c1 implements View.OnClickListener {
    public final int f9614a = 0;
    public final long f9615b;
    public final int f9616c;
    public final KeyEvent.Callback d;
    public final Object f9617e;
    public final Object f9618f;
    public final Object h;

    public c1(p1 p1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, org.telegram.tgnet.e eVar, int i10, long j3, org.telegram.ui.web.u uVar) {
        this.d = p1Var;
        this.f9617e = tL_messages_preparedInlineMessage;
        this.f9618f = eVar;
        this.f9616c = i10;
        this.f9615b = j3;
        this.h = uVar;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        zf.a aVar;
        switch (this.f9614a) {
            case 0:
                final p1 p1Var = (p1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.f9617e;
                final org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f9618f;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.h;
                final org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.f9908b0 = true;
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
                            org.telegram.ui.web.u uVar2 = uVar;
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
                            uVar = uVar2;
                        }
                    }
                    org.telegram.ui.web.u uVar3 = uVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    n1 n1Var = new n1(p1Var, bundle, eVar);
                    final int i11 = this.f9616c;
                    final long j3 = this.f9615b;
                    n1Var.C2 = new oy() {
                        @Override
                        public final boolean B() {
                            return false;
                        }

                        @Override
                        public final boolean K(uy uyVar) {
                            return false;
                        }

                        @Override
                        public final boolean u(uy uyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, boolean z11, int i12, int i13, eg1 eg1Var) {
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
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f19894id);
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
                            if (!p1Var2.f9909c0) {
                                p1Var2.f9909c0 = true;
                                if (arrayList3.size() > 0) {
                                    str = null;
                                } else {
                                    str = "USER_DECLINED";
                                }
                                eVar.run(str, arrayList3);
                            }
                            if (eg1Var != null) {
                                eg1Var.finishFragment();
                                uyVar.removeSelfFromStack();
                                return true;
                            }
                            uyVar.finishFragment();
                            return true;
                        }
                    };
                    U.presentFragment(n1Var);
                    p1Var.dismiss();
                    uVar3.run();
                    return;
                }
                return;
            case 1:
                fg0 fg0Var = (fg0) this.d;
                String str = (String) this.f9617e;
                String str2 = (String) this.f9618f;
                String str3 = (String) this.h;
                di.d dVar = fg0Var.f36423b;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f9615b;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f9616c;
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
                    fg0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new aa(fg0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
            default:
                zh.e0 e0Var = (zh.e0) this.d;
                Context context = (Context) this.f9617e;
                f6 f6Var = (f6) this.f9618f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (e0Var.f51843s.W) {
                    int i12 = this.f9616c;
                    if (MessagesController.getInstance(i12).isFrozen()) {
                        org.telegram.ui.b.b(i12);
                        return;
                    }
                    s5 x10 = s5.x(i12, e0Var.H.f51653a);
                    if (x10.f52600e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!e0Var.f51838c && (aVar == null || aVar.f51654b < e0Var.H.f51654b)) {
                        zf.a aVar2 = e0Var.H;
                        zf.b bVar = aVar2.f51653a;
                        if (bVar == zf.b.f51655a) {
                            long a2 = aVar2.a();
                            long j10 = this.f9615b;
                            new k7(context, f6Var, a2, 13, og.d.h(i12, j10), null, j10).show();
                            return;
                        } else if (bVar == zf.b.f51656b) {
                            new ei.h(context, f6Var, aVar2, true, null).show();
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

    public c1(fg0 fg0Var, String str, long j3, String str2, String str3, int i10) {
        this.d = fg0Var;
        this.f9617e = str;
        this.f9615b = j3;
        this.f9618f = str2;
        this.h = str3;
        this.f9616c = i10;
    }

    public c1(zh.e0 e0Var, co coVar, int i10, Context context, f6 f6Var, long j3, Utilities.Callback callback) {
        this.d = e0Var;
        this.f9616c = i10;
        this.f9617e = context;
        this.f9618f = f6Var;
        this.f9615b = j3;
        this.h = callback;
    }
}
