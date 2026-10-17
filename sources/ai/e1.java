package ai;

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
import org.telegram.ui.ey;
import org.telegram.ui.of0;
import org.telegram.ui.sn;
import org.telegram.ui.te1;
import org.telegram.ui.xx;
public final class e1 implements View.OnClickListener {
    public final int f1191a = 0;
    public final int f1192b;
    public final long f1193c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f1194f;
    public final Object h;

    public e1(h1 h1Var, sn snVar, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, Utilities.Callback callback) {
        this.d = h1Var;
        this.f1192b = i10;
        this.e = context;
        this.f1194f = d6Var;
        this.f1193c = j10;
        this.h = callback;
    }

    @Override
    public final void onClick(View view) {
        ag.a aVar;
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        switch (this.f1191a) {
            case 0:
                h1 h1Var = (h1) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f1194f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (h1Var.f1410s.W) {
                    int i10 = this.f1192b;
                    if (MessagesController.getInstance(i10).isFrozen()) {
                        org.telegram.ui.b.b(i10);
                        return;
                    }
                    fa x10 = fa.x(i10, h1Var.H.f631a);
                    if (x10.e) {
                        aVar = ag.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!h1Var.f1406c && (aVar == null || aVar.f632b < h1Var.H.f632b)) {
                        ag.a aVar2 = h1Var.H;
                        ag.c cVar = aVar2.f631a;
                        if (cVar == ag.c.f635a) {
                            long a2 = aVar2.a();
                            long j10 = this.f1193c;
                            new bd(context, d6Var, a2, 13, og.d.h(i10, j10), null, j10).show();
                            return;
                        } else if (cVar == ag.c.f636b) {
                            new fi.f(context, d6Var, aVar2, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    callback.run(MessageSuggestionParams.of(h1Var.H, h1Var.I));
                    h1Var.dismiss();
                    return;
                }
                return;
            case 1:
                final gi.l1 l1Var = (gi.l1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final s0 s0Var = (s0) this.f1194f;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.h;
                final org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    l1Var.f11316b0 = true;
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
                    gi.j1 j1Var = new gi.j1(l1Var, bundle, s0Var);
                    final int i12 = this.f1192b;
                    final long j11 = this.f1193c;
                    j1Var.C2 = new xx() {
                        @Override
                        public final boolean D() {
                            return false;
                        }

                        @Override
                        public final boolean K(ey eyVar) {
                            return false;
                        }

                        @Override
                        public final boolean w(ey eyVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i13, int i14, te1 te1Var) {
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
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f20270id);
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
                            l1 l1Var2 = l1.this;
                            if (!l1Var2.f11317c0) {
                                l1Var2.f11317c0 = true;
                                if (arrayList3.size() <= 0) {
                                    str = "USER_DECLINED";
                                }
                                s0Var.run(str, arrayList3);
                            }
                            if (te1Var != null) {
                                te1Var.finishFragment();
                                eyVar.removeSelfFromStack();
                                return true;
                            }
                            eyVar.finishFragment();
                            return true;
                        }
                    };
                    U.presentFragment(j1Var);
                    l1Var.dismiss();
                    sVar3.run();
                    return;
                }
                return;
            default:
                of0 of0Var = (of0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f1194f;
                String str3 = (String) this.h;
                ei.d dVar = of0Var.f39764b;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f1193c;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f1192b;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject q6 = gi.d3.q(null, false);
                    if (q6 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = q6.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    of0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.ea(of0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
        }
    }

    public e1(gi.l1 l1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, s0 s0Var, int i10, long j10, org.telegram.ui.web.s sVar) {
        this.d = l1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f1194f = s0Var;
        this.f1192b = i10;
        this.f1193c = j10;
        this.h = sVar;
    }

    public e1(of0 of0Var, String str, long j10, String str2, String str3, int i10) {
        this.d = of0Var;
        this.e = str;
        this.f1193c = j10;
        this.f1194f = str2;
        this.h = str3;
        this.f1192b = i10;
    }
}
