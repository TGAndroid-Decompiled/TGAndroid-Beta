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
import org.telegram.ui.ky;
import org.telegram.ui.qy;
import org.telegram.ui.sf1;
import org.telegram.ui.yf0;
import org.telegram.ui.zn;
public final class p0 implements View.OnClickListener {
    public final int f12886a = 0;
    public final long f12887b;
    public final int f12888c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f12889f;
    public final Object h;

    public p0(s0 s0Var, zn znVar, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, Utilities.Callback callback) {
        this.d = s0Var;
        this.f12888c = i10;
        this.e = context;
        this.f12889f = f6Var;
        this.f12887b = j10;
        this.h = callback;
    }

    @Override
    public final void onClick(View view) {
        lf.a aVar;
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        switch (this.f12886a) {
            case 0:
                s0 s0Var = (s0) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f12889f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (s0Var.f13038s.T) {
                    int i10 = this.f12888c;
                    if (MessagesController.getInstance(i10).isFrozen()) {
                        org.telegram.ui.c.b(i10);
                        return;
                    }
                    t7 x10 = t7.x(i10, s0Var.E.f12054a);
                    if (x10.e) {
                        aVar = lf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!s0Var.f13034c && (aVar == null || aVar.f12055b < s0Var.E.f12055b)) {
                        lf.a aVar2 = s0Var.E;
                        lf.b bVar = aVar2.f12054a;
                        if (bVar == lf.b.f12056a) {
                            long a2 = aVar2.a();
                            long j10 = this.f12887b;
                            new z9(context, f6Var, a2, 13, ag.f.h(i10, j10), null, j10).show();
                            return;
                        } else if (bVar == lf.b.f12057b) {
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
                yf0 yf0Var = (yf0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f12889f;
                String str3 = (String) this.h;
                ph.d dVar = yf0Var.f40260b;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f12887b;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f12888c;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject p10 = rh.p2.p(null, false);
                    if (p10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = p10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    yf0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.da(yf0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
            default:
                final rh.e1 e1Var = (rh.e1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final kh.a0 a0Var = (kh.a0) this.f12889f;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.h;
                final org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    e1Var.Y = true;
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
                    rh.c1 c1Var = new rh.c1(e1Var, bundle, a0Var);
                    final int i12 = this.f12888c;
                    final long j11 = this.f12887b;
                    c1Var.f37649z2 = new ky() {
                        @Override
                        public final boolean C() {
                            return false;
                        }

                        @Override
                        public final boolean I(qy qyVar) {
                            return false;
                        }

                        @Override
                        public final boolean w(qy qyVar, ArrayList arrayList2, CharSequence charSequence, boolean z4, boolean z10, int i13, int i14, sf1 sf1Var) {
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
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f19157id);
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
                            e1 e1Var2 = e1.this;
                            if (!e1Var2.Z) {
                                e1Var2.Z = true;
                                if (arrayList3.size() > 0) {
                                    str4 = null;
                                } else {
                                    str4 = "USER_DECLINED";
                                }
                                a0Var.run(str4, arrayList3);
                            }
                            if (sf1Var != null) {
                                sf1Var.finishFragment();
                                qyVar.removeSelfFromStack();
                                return true;
                            }
                            qyVar.finishFragment();
                            return true;
                        }
                    };
                    U.presentFragment(c1Var);
                    e1Var.dismiss();
                    tVar3.run();
                    return;
                }
                return;
        }
    }

    public p0(yf0 yf0Var, String str, long j10, String str2, String str3, int i10) {
        this.d = yf0Var;
        this.e = str;
        this.f12887b = j10;
        this.f12889f = str2;
        this.h = str3;
        this.f12888c = i10;
    }

    public p0(rh.e1 e1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, kh.a0 a0Var, int i10, long j10, org.telegram.ui.web.t tVar) {
        this.d = e1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f12889f = a0Var;
        this.f12888c = i10;
        this.f12887b = j10;
        this.h = tVar;
    }
}
