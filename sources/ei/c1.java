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
import org.telegram.ui.eg0;
import org.telegram.ui.eg1;
import org.telegram.ui.my;
import org.telegram.ui.sy;
import org.telegram.ui.zn;
import yh.e7;
import yh.n5;
public final class c1 implements View.OnClickListener {
    public final int f8986a = 0;
    public final long f8987b;
    public final int f8988c;
    public final KeyEvent.Callback d;
    public final Object f8989e;
    public final Object f8990f;
    public final Object h;

    public c1(p1 p1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, org.telegram.tgnet.e eVar, int i10, long j3, org.telegram.ui.web.s sVar) {
        this.d = p1Var;
        this.f8989e = tL_messages_preparedInlineMessage;
        this.f8990f = eVar;
        this.f8988c = i10;
        this.f8987b = j3;
        this.h = sVar;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        zf.a aVar;
        switch (this.f8986a) {
            case 0:
                final p1 p1Var = (p1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.f8989e;
                final org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f8990f;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.h;
                final org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.f9281b0 = true;
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
                            sVar = sVar2;
                        }
                    }
                    org.telegram.ui.web.s sVar3 = sVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    n1 n1Var = new n1(p1Var, bundle, eVar);
                    final int i11 = this.f8988c;
                    final long j3 = this.f8987b;
                    n1Var.C2 = new my() {
                        @Override
                        public final boolean C() {
                            return false;
                        }

                        @Override
                        public final boolean K(sy syVar) {
                            return false;
                        }

                        @Override
                        public final boolean w(sy syVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i12, int i13, eg1 eg1Var) {
                            String str;
                            TLRPC.TL_forumTopic findTopic;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i14 = 0;
                            while (true) {
                                str = null;
                                r5 = null;
                                r5 = null;
                                MessageObject messageObject = null;
                                if (i14 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i14);
                                i14++;
                                MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) obj;
                                long j10 = topicKey.dialogId;
                                long j11 = topicKey.topicId;
                                if (!DialogObject.isEncryptedDialog(j10)) {
                                    int i15 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                    int i16 = i11;
                                    if (i15 != 0 && (findTopic = MessagesController.getInstance(i16).getTopicsController().findTopic(-j10, j11)) != null && (message = findTopic.topicStartMessage) != null) {
                                        messageObject = new MessageObject(i16, message, false, false);
                                        messageObject.isTopicMainMessage = true;
                                    }
                                    MessageObject messageObject2 = messageObject;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f20066id);
                                    hashMap.put("bot", "" + j3);
                                    long j12 = j10;
                                    SendMessagesHelper.prepareSendingBotContextResult(U, AccountInstance.getInstance(i16), tL_messages_preparedInlineMessage4.result, hashMap, j12, messageObject2, messageObject2, null, null, z12, i12, 0, null, 0L, 0L);
                                    if (charSequence != null) {
                                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i16);
                                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j12, messageObject2, messageObject2, null, true, null, null, null, true, 0, 0, null, false);
                                        j12 = j12;
                                        sendMessagesHelper.sendMessage(of2);
                                    }
                                    arrayList3.add(Long.valueOf(j12));
                                }
                            }
                            p1 p1Var2 = p1.this;
                            if (!p1Var2.f9282c0) {
                                p1Var2.f9282c0 = true;
                                if (arrayList3.size() <= 0) {
                                    str = "USER_DECLINED";
                                }
                                eVar.run(str, arrayList3);
                            }
                            if (eg1Var != null) {
                                eg1Var.finishFragment();
                                syVar.removeSelfFromStack();
                                return true;
                            }
                            syVar.finishFragment();
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
                eg0 eg0Var = (eg0) this.d;
                String str = (String) this.f8989e;
                String str2 = (String) this.f8990f;
                String str3 = (String) this.h;
                ci.d dVar = eg0Var.f37337b;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f8987b;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f8988c;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject q6 = k3.q(null, false);
                    if (q6 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = q6.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    eg0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new aa(eg0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
            default:
                yh.c0 c0Var = (yh.c0) this.d;
                Context context = (Context) this.f8989e;
                d6 d6Var = (d6) this.f8990f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (c0Var.f52451s.W) {
                    int i12 = this.f8988c;
                    if (MessagesController.getInstance(i12).isFrozen()) {
                        org.telegram.ui.b.b(i12);
                        return;
                    }
                    n5 x10 = n5.x(i12, c0Var.H.f54562a);
                    if (x10.f53034e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!c0Var.f52446c && (aVar == null || aVar.f54563b < c0Var.H.f54563b)) {
                        zf.a aVar2 = c0Var.H;
                        zf.b bVar = aVar2.f54562a;
                        if (bVar == zf.b.f54564a) {
                            long a2 = aVar2.a();
                            long j10 = this.f8987b;
                            new e7(context, d6Var, a2, 13, ng.d.h(i12, j10), null, j10).show();
                            return;
                        } else if (bVar == zf.b.f54565b) {
                            new di.h(context, d6Var, aVar2, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    callback.run(MessageSuggestionParams.of(c0Var.H, c0Var.I));
                    c0Var.dismiss();
                    return;
                }
                return;
        }
    }

    public c1(eg0 eg0Var, String str, long j3, String str2, String str3, int i10) {
        this.d = eg0Var;
        this.f8989e = str;
        this.f8987b = j3;
        this.f8990f = str2;
        this.h = str3;
        this.f8988c = i10;
    }

    public c1(yh.c0 c0Var, zn znVar, int i10, Context context, d6 d6Var, long j3, Utilities.Callback callback) {
        this.d = c0Var;
        this.f8988c = i10;
        this.f8989e = context;
        this.f8990f = d6Var;
        this.f8987b = j3;
        this.h = callback;
    }
}
