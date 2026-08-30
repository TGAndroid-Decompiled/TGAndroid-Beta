package lh;

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
import org.telegram.ui.iy;
import org.telegram.ui.kf1;
import org.telegram.ui.oy;
import org.telegram.ui.wf0;
import org.telegram.ui.xn;
public final class p0 implements View.OnClickListener {
    public final int f12902a = 0;
    public final long f12903b;
    public final int f12904c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f12905f;
    public final Object h;

    public p0(s0 s0Var, xn xnVar, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, Utilities.Callback callback) {
        this.d = s0Var;
        this.f12904c = i10;
        this.e = context;
        this.f12905f = f6Var;
        this.f12903b = j10;
        this.h = callback;
    }

    @Override
    public final void onClick(View view) {
        mf.a aVar;
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        switch (this.f12902a) {
            case 0:
                s0 s0Var = (s0) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f12905f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (s0Var.f13054s.T) {
                    int i10 = this.f12904c;
                    if (MessagesController.getInstance(i10).isFrozen()) {
                        org.telegram.ui.c.b(i10);
                        return;
                    }
                    t7 x10 = t7.x(i10, s0Var.E.f13928a);
                    if (x10.e) {
                        aVar = mf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!s0Var.f13050c && (aVar == null || aVar.f13929b < s0Var.E.f13929b)) {
                        mf.a aVar2 = s0Var.E;
                        mf.b bVar = aVar2.f13928a;
                        if (bVar == mf.b.f13930a) {
                            long a2 = aVar2.a();
                            long j10 = this.f12903b;
                            new z9(context, f6Var, a2, 13, ag.f.h(i10, j10), null, j10).show();
                            return;
                        } else if (bVar == mf.b.f13931b) {
                            new qh.f(context, f6Var, aVar2, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    callback.run(MessageSuggestionParams.of(s0Var.E, s0Var.F));
                    s0Var.dismiss();
                    return;
                }
                return;
            case 1:
                wf0 wf0Var = (wf0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f12905f;
                String str3 = (String) this.h;
                ph.d dVar = wf0Var.f39726b;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f12903b;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f12904c;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject p10 = rh.q2.p(null, false);
                    if (p10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = p10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    wf0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.ba(wf0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
            default:
                final rh.f1 f1Var = (rh.f1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final dh.v vVar = (dh.v) this.f12905f;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.h;
                final org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    f1Var.Y = true;
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
                    rh.d1 d1Var = new rh.d1(f1Var, bundle, vVar);
                    final int i12 = this.f12904c;
                    final long j11 = this.f12903b;
                    d1Var.f37131z2 = new iy() {
                        @Override
                        public final boolean C() {
                            return false;
                        }

                        @Override
                        public final boolean K(oy oyVar) {
                            return false;
                        }

                        @Override
                        public final boolean w(oy oyVar, ArrayList arrayList2, CharSequence charSequence, boolean z4, boolean z10, int i13, int i14, kf1 kf1Var) {
                            String str4;
                            MessageObject messageObject;
                            TLRPC.TL_forumTopic findTopic;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            boolean z11 = false;
                            int i15 = 0;
                            while (i15 < size2) {
                                Object obj = arrayList2.get(i15);
                                i15++;
                                MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) obj;
                                long j12 = topicKey.dialogId;
                                long j13 = topicKey.topicId;
                                if (!DialogObject.isEncryptedDialog(j12)) {
                                    int i16 = i12;
                                    if (j13 != 0 && (findTopic = MessagesController.getInstance(i16).getTopicsController().findTopic(-j12, j13)) != null && (message = findTopic.topicStartMessage) != null) {
                                        MessageObject messageObject2 = new MessageObject(i16, message, z11, z11);
                                        messageObject2.isTopicMainMessage = true;
                                        messageObject = messageObject2;
                                    } else {
                                        messageObject = null;
                                    }
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f19182id);
                                    hashMap.put("bot", "" + j11);
                                    long j14 = j12;
                                    MessageObject messageObject3 = messageObject;
                                    SendMessagesHelper.prepareSendingBotContextResult(U, AccountInstance.getInstance(i16), tL_messages_preparedInlineMessage4.result, hashMap, j14, messageObject3, messageObject, null, null, z10, i13, 0, null, 0L, 0L);
                                    if (charSequence != null) {
                                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i16);
                                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j14, messageObject3, messageObject3, null, true, null, null, null, true, 0, 0, null, false);
                                        j14 = j14;
                                        sendMessagesHelper.sendMessage(of2);
                                    }
                                    arrayList3.add(Long.valueOf(j14));
                                    i15 = i15;
                                    z11 = false;
                                }
                            }
                            f1 f1Var2 = f1.this;
                            if (!f1Var2.Z) {
                                f1Var2.Z = true;
                                if (arrayList3.size() > 0) {
                                    str4 = null;
                                } else {
                                    str4 = "USER_DECLINED";
                                }
                                vVar.run(str4, arrayList3);
                            }
                            if (kf1Var != null) {
                                kf1Var.finishFragment();
                                oyVar.removeSelfFromStack();
                                return true;
                            }
                            oyVar.finishFragment();
                            return true;
                        }
                    };
                    U.presentFragment(d1Var);
                    f1Var.dismiss();
                    uVar3.run();
                    return;
                }
                return;
        }
    }

    public p0(wf0 wf0Var, String str, long j10, String str2, String str3, int i10) {
        this.d = wf0Var;
        this.e = str;
        this.f12903b = j10;
        this.f12905f = str2;
        this.h = str3;
        this.f12904c = i10;
    }

    public p0(rh.f1 f1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, dh.v vVar, int i10, long j10, org.telegram.ui.web.u uVar) {
        this.d = f1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f12905f = vVar;
        this.f12904c = i10;
        this.f12903b = j10;
        this.h = uVar;
    }
}
