package di;

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
import org.telegram.ui.eo;
import org.telegram.ui.fg0;
import org.telegram.ui.ig1;
import org.telegram.ui.qy;
import org.telegram.ui.wy;
import xh.o7;
import xh.v5;
public final class f1 implements View.OnClickListener {
    public final int f6621a = 0;
    public final long f6622b;
    public final int f6623c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f6624f;
    public final Object h;

    public f1(s1 s1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, org.telegram.tgnet.g gVar, int i10, long j3, org.telegram.ui.web.t tVar) {
        this.d = s1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f6624f = gVar;
        this.f6623c = i10;
        this.f6622b = j3;
        this.h = tVar;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        yf.a aVar;
        switch (this.f6621a) {
            case 0:
                final s1 s1Var = (s1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final org.telegram.tgnet.g gVar = (org.telegram.tgnet.g) this.f6624f;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.h;
                final org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    s1Var.f6893b0 = true;
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
                            org.telegram.ui.web.t tVar2 = tVar;
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
                            tVar = tVar2;
                        }
                    }
                    org.telegram.ui.web.t tVar3 = tVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    q1 q1Var = new q1(s1Var, bundle, gVar);
                    final int i11 = this.f6623c;
                    final long j3 = this.f6622b;
                    q1Var.C2 = new qy() {
                        @Override
                        public final boolean A() {
                            return false;
                        }

                        @Override
                        public final boolean J(wy wyVar) {
                            return false;
                        }

                        @Override
                        public final boolean v(wy wyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, boolean z11, int i12, int i13, ig1 ig1Var) {
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
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f17193id);
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
                            s1 s1Var2 = s1.this;
                            if (!s1Var2.f6894c0) {
                                s1Var2.f6894c0 = true;
                                if (arrayList3.size() > 0) {
                                    str = null;
                                } else {
                                    str = "USER_DECLINED";
                                }
                                gVar.run(str, arrayList3);
                            }
                            if (ig1Var != null) {
                                ig1Var.finishFragment();
                                wyVar.removeSelfFromStack();
                                return true;
                            }
                            wyVar.finishFragment();
                            return true;
                        }
                    };
                    U.presentFragment(q1Var);
                    s1Var.dismiss();
                    tVar3.run();
                    return;
                }
                return;
            case 1:
                fg0 fg0Var = (fg0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f6624f;
                String str3 = (String) this.h;
                bi.d dVar = fg0Var.f32813b;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f6622b;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f6623c;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject p5 = n3.p(null, false);
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
                xh.e0 e0Var = (xh.e0) this.d;
                Context context = (Context) this.e;
                f6 f6Var = (f6) this.f6624f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (e0Var.f45359s.W) {
                    int i12 = this.f6623c;
                    if (MessagesController.getInstance(i12).isFrozen()) {
                        org.telegram.ui.b.b(i12);
                        return;
                    }
                    v5 x10 = v5.x(i12, e0Var.H.f46926a);
                    if (x10.e) {
                        aVar = yf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!e0Var.f45355c && (aVar == null || aVar.f46927b < e0Var.H.f46927b)) {
                        yf.a aVar2 = e0Var.H;
                        yf.b bVar = aVar2.f46926a;
                        if (bVar == yf.b.f46928a) {
                            long a2 = aVar2.a();
                            long j10 = this.f6622b;
                            new o7(context, f6Var, a2, 13, mg.d.h(i12, j10), null, j10).show();
                            return;
                        } else if (bVar == yf.b.f46929b) {
                            new ci.i(context, f6Var, aVar2, true, null).show();
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

    public f1(fg0 fg0Var, String str, long j3, String str2, String str3, int i10) {
        this.d = fg0Var;
        this.e = str;
        this.f6622b = j3;
        this.f6624f = str2;
        this.h = str3;
        this.f6623c = i10;
    }

    public f1(xh.e0 e0Var, eo eoVar, int i10, Context context, f6 f6Var, long j3, Utilities.Callback callback) {
        this.d = e0Var;
        this.f6623c = i10;
        this.e = context;
        this.f6624f = f6Var;
        this.f6622b = j3;
        this.h = callback;
    }
}
