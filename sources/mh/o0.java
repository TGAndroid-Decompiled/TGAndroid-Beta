package mh;

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
import org.telegram.ui.jy;
import org.telegram.ui.py;
import org.telegram.ui.sf1;
import org.telegram.ui.xf0;
import org.telegram.ui.xn;
public final class o0 implements View.OnClickListener {
    public final int f14506a = 0;
    public final long f14507b;
    public final int f14508c;
    public final KeyEvent.Callback d;
    public final Object f14509e;
    public final Object f14510f;
    public final Object h;

    public o0(r0 r0Var, xn xnVar, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, Utilities.Callback callback) {
        this.d = r0Var;
        this.f14508c = i10;
        this.f14509e = context;
        this.f14510f = g6Var;
        this.f14507b = j10;
        this.h = callback;
    }

    @Override
    public final void onClick(View view) {
        mf.a aVar;
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        switch (this.f14506a) {
            case 0:
                r0 r0Var = (r0) this.d;
                Context context = (Context) this.f14509e;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f14510f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (r0Var.f14661s.T) {
                    int i10 = this.f14508c;
                    if (MessagesController.getInstance(i10).isFrozen()) {
                        org.telegram.ui.c.b(i10);
                        return;
                    }
                    t7 x10 = t7.x(i10, r0Var.E.f13651a);
                    if (x10.f14833e) {
                        aVar = mf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!r0Var.f14656c && (aVar == null || aVar.f13652b < r0Var.E.f13652b)) {
                        mf.a aVar2 = r0Var.E;
                        mf.b bVar = aVar2.f13651a;
                        if (bVar == mf.b.f13653a) {
                            long a2 = aVar2.a();
                            long j10 = this.f14507b;
                            new z9(context, g6Var, a2, 13, bg.e.h(i10, j10), null, j10).show();
                            return;
                        } else if (bVar == mf.b.f13654b) {
                            new rh.f(context, g6Var, aVar2, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    callback.run(MessageSuggestionParams.of(r0Var.E, r0Var.F));
                    r0Var.dismiss();
                    return;
                }
                return;
            case 1:
                xf0 xf0Var = (xf0) this.d;
                String str = (String) this.f14509e;
                String str2 = (String) this.f14510f;
                String str3 = (String) this.h;
                qh.d dVar = xf0Var.f43026b;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f14507b;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f14508c;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject p10 = sh.p2.p(null, false);
                    if (p10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = p10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    xf0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.ba(xf0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
            default:
                final sh.e1 e1Var = (sh.e1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.f14509e;
                final eh.w wVar = (eh.w) this.f14510f;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.h;
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
                    sh.c1 c1Var = new sh.c1(e1Var, bundle, wVar);
                    final int i12 = this.f14508c;
                    final long j11 = this.f14507b;
                    c1Var.f40278z2 = new jy() {
                        @Override
                        public final boolean C() {
                            return false;
                        }

                        @Override
                        public final boolean J(py pyVar) {
                            return false;
                        }

                        @Override
                        public final boolean v(py pyVar, ArrayList arrayList2, CharSequence charSequence, boolean z4, boolean z10, int i13, int i14, sf1 sf1Var) {
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
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f20843id);
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
                                wVar.run(str4, arrayList3);
                            }
                            if (sf1Var != null) {
                                sf1Var.finishFragment();
                                pyVar.removeSelfFromStack();
                                return true;
                            }
                            pyVar.finishFragment();
                            return true;
                        }
                    };
                    U.presentFragment(c1Var);
                    e1Var.dismiss();
                    uVar3.run();
                    return;
                }
                return;
        }
    }

    public o0(xf0 xf0Var, String str, long j10, String str2, String str3, int i10) {
        this.d = xf0Var;
        this.f14509e = str;
        this.f14507b = j10;
        this.f14510f = str2;
        this.h = str3;
        this.f14508c = i10;
    }

    public o0(sh.e1 e1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, eh.w wVar, int i10, long j10, org.telegram.ui.web.u uVar) {
        this.d = e1Var;
        this.f14509e = tL_messages_preparedInlineMessage;
        this.f14510f = wVar;
        this.f14508c = i10;
        this.f14507b = j10;
        this.h = uVar;
    }
}
