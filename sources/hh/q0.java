package hh;

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
import org.telegram.ui.gy;
import org.telegram.ui.rf0;
import org.telegram.ui.rn;
import org.telegram.ui.we1;
import org.telegram.ui.zx;

public final class q0 implements View.OnClickListener {

    public final int f9888a = 0;

    public final int f9889b;

    public final long f9890c;
    public final KeyEvent.Callback d;

    public final Object f9891e;

    public final Object f9892f;
    public final Object h;

    public q0(t0 t0Var, rn rnVar, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, Utilities.Callback callback) {
        this.d = t0Var;
        this.f9889b = i10;
        this.f9891e = context;
        this.f9892f = c6Var;
        this.f9890c = j10;
        this.h = callback;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        switch (this.f9888a) {
            case 0:
                t0 t0Var = (t0) this.d;
                Context context = (Context) this.f9891e;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f9892f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (t0Var.f10043s.S) {
                    int i10 = this.f9889b;
                    if (!MessagesController.getInstance(i10).isFrozen()) {
                        u7 u7VarX = u7.x(i10, t0Var.D.f8919a);
                        hf.a aVarL = u7VarX.f10154e ? hf.a.l(u7VarX.p()) : null;
                        if (!t0Var.f10038c && (aVarL == null || aVarL.f8920b < t0Var.D.f8920b)) {
                            hf.a aVar = t0Var.D;
                            hf.b bVar = aVar.f8919a;
                            if (bVar == hf.b.f8921a) {
                                long jA = aVar.a();
                                long j10 = this.f9890c;
                                new ea(context, c6Var, jA, 13, wf.c.h(i10, j10), null, j10).show();
                            } else if (bVar == hf.b.f8922b) {
                                new mh.f(context, c6Var, aVar, true, null).show();
                            }
                        } else {
                            callback.run(MessageSuggestionParams.of(t0Var.D, t0Var.E));
                            t0Var.dismiss();
                        }
                    } else {
                        org.telegram.ui.b.b(i10);
                    }
                    break;
                }
                break;
            case 1:
                final nh.k1 k1Var = (nh.k1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.f9891e;
                final cg.u0 u0Var = (cg.u0) this.f9892f;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.h;
                final org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    k1Var.X = true;
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
                    nh.i1 i1Var = new nh.i1(k1Var, bundle, u0Var);
                    final int i12 = this.f9889b;
                    final long j11 = this.f9890c;
                    i1Var.f38621y2 = new zx() {
                        @Override
                        public final boolean D() {
                            return false;
                        }

                        @Override
                        public final boolean K(gy gyVar) {
                            return false;
                        }

                        @Override
                        public final boolean w(gy gyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, boolean z11, int i13, int i14, we1 we1Var) {
                            MessageObject messageObject;
                            TLRPC.TL_forumTopic tL_forumTopicFindTopic;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            boolean z12 = false;
                            int i15 = 0;
                            while (i15 < size2) {
                                Object obj = arrayList2.get(i15);
                                i15++;
                                MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) obj;
                                long j12 = topicKey.dialogId;
                                long j13 = topicKey.topicId;
                                if (!DialogObject.isEncryptedDialog(j12)) {
                                    int i16 = i12;
                                    if (j13 == 0 || (tL_forumTopicFindTopic = MessagesController.getInstance(i16).getTopicsController().findTopic(-j12, j13)) == null || (message = tL_forumTopicFindTopic.topicStartMessage) == null) {
                                        messageObject = null;
                                    } else {
                                        MessageObject messageObject2 = new MessageObject(i16, message, z12, z12);
                                        messageObject2.isTopicMainMessage = true;
                                        messageObject = messageObject2;
                                    }
                                    HashMap map = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    map.put("query_id", sb2.toString());
                                    map.put("id", "" + tL_messages_preparedInlineMessage4.result.f22378id);
                                    map.put("bot", "" + j11);
                                    long j14 = j12;
                                    MessageObject messageObject3 = messageObject;
                                    SendMessagesHelper.prepareSendingBotContextResult(n2VarU, AccountInstance.getInstance(i16), tL_messages_preparedInlineMessage4.result, map, j14, messageObject3, messageObject, null, null, z11, i13, 0, null, 0L, 0L);
                                    if (charSequence != null) {
                                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i16);
                                        SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j14, messageObject3, messageObject3, null, true, null, null, null, true, 0, 0, null, false);
                                        j14 = j14;
                                        sendMessagesHelper.sendMessage(sendMessageParamsOf);
                                    }
                                    arrayList3.add(Long.valueOf(j14));
                                    i15 = i15;
                                    z12 = false;
                                }
                            }
                            k1 k1Var2 = k1Var;
                            if (!k1Var2.Y) {
                                k1Var2.Y = true;
                                u0Var.run(arrayList3.size() > 0 ? null : "USER_DECLINED", arrayList3);
                            }
                            if (we1Var == null) {
                                gyVar.finishFragment();
                                return true;
                            }
                            we1Var.finishFragment();
                            gyVar.removeSelfFromStack();
                            return true;
                        }
                    };
                    n2VarU.presentFragment(i1Var);
                    k1Var.dismiss();
                    uVar3.run();
                    break;
                }
                break;
            default:
                rf0 rf0Var = (rf0) this.d;
                String str = (String) this.f9891e;
                String str2 = (String) this.f9892f;
                String str3 = (String) this.h;
                lh.d dVar = rf0Var.f41919b;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f9890c;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f9889b;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject jSONObjectP = nh.b3.p(null, false);
                    if (jSONObjectP != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = jSONObjectP.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    rf0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.z9(rf0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    break;
                }
                break;
        }
    }

    public q0(nh.k1 k1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, cg.u0 u0Var, int i10, long j10, org.telegram.ui.web.u uVar) {
        this.d = k1Var;
        this.f9891e = tL_messages_preparedInlineMessage;
        this.f9892f = u0Var;
        this.f9889b = i10;
        this.f9890c = j10;
        this.h = uVar;
    }

    public q0(rf0 rf0Var, String str, long j10, String str2, String str3, int i10) {
        this.d = rf0Var;
        this.f9891e = str;
        this.f9890c = j10;
        this.f9892f = str2;
        this.h = str3;
        this.f9889b = i10;
    }
}
