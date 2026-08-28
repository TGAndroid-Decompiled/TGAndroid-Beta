package gh;

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
import org.telegram.ui.dy;
import org.telegram.ui.of0;
import org.telegram.ui.qn;
import org.telegram.ui.we1;
import org.telegram.ui.wx;
public final class q0 implements View.OnClickListener {
    public final int f8736a = 0;
    public final int f8737b;
    public final long f8738c;
    public final KeyEvent.Callback d;
    public final Object f8739e;
    public final Object f8740f;
    public final Object h;

    public q0(t0 t0Var, qn qnVar, int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, Utilities.Callback callback) {
        this.d = t0Var;
        this.f8737b = i9;
        this.f8739e = context;
        this.f8740f = b6Var;
        this.f8738c = j10;
        this.h = callback;
    }

    @Override
    public final void onClick(View view) {
        gf.a aVar;
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        switch (this.f8736a) {
            case 0:
                t0 t0Var = (t0) this.d;
                Context context = (Context) this.f8739e;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f8740f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (t0Var.f8901s.S) {
                    int i9 = this.f8737b;
                    if (MessagesController.getInstance(i9).isFrozen()) {
                        org.telegram.ui.b.b(i9);
                        return;
                    }
                    v7 x10 = v7.x(i9, t0Var.D.f7747a);
                    if (x10.f9048e) {
                        aVar = gf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!t0Var.f8896c && (aVar == null || aVar.f7748b < t0Var.D.f7748b)) {
                        gf.a aVar2 = t0Var.D;
                        gf.b bVar = aVar2.f7747a;
                        if (bVar == gf.b.f7749a) {
                            long a2 = aVar2.a();
                            long j10 = this.f8738c;
                            new ea(context, b6Var, a2, 13, vf.c.h(i9, j10), null, j10).show();
                            return;
                        } else if (bVar == gf.b.f7750b) {
                            new lh.f(context, b6Var, aVar2, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    callback.run(MessageSuggestionParams.of(t0Var.D, t0Var.E));
                    t0Var.dismiss();
                    return;
                }
                return;
            case 1:
                final mh.l1 l1Var = (mh.l1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.f8739e;
                final bg.y0 y0Var = (bg.y0) this.f8740f;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.h;
                final org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    l1Var.X = true;
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
                    mh.j1 j1Var = new mh.j1(l1Var, bundle, y0Var);
                    final int i11 = this.f8737b;
                    final long j11 = this.f8738c;
                    j1Var.f37752y2 = new wx() {
                        @Override
                        public final boolean C() {
                            return false;
                        }

                        @Override
                        public final boolean I(dy dyVar) {
                            return false;
                        }

                        @Override
                        public final boolean v(dy dyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, boolean z11, int i12, int i13, we1 we1Var) {
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
                                long j12 = topicKey.dialogId;
                                long j13 = topicKey.topicId;
                                if (!DialogObject.isEncryptedDialog(j12)) {
                                    int i15 = i11;
                                    if (j13 != 0 && (findTopic = MessagesController.getInstance(i15).getTopicsController().findTopic(-j12, j13)) != null && (message = findTopic.topicStartMessage) != null) {
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
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f22378id);
                                    hashMap.put("bot", "" + j11);
                                    long j14 = j12;
                                    MessageObject messageObject3 = messageObject;
                                    SendMessagesHelper.prepareSendingBotContextResult(U, AccountInstance.getInstance(i15), tL_messages_preparedInlineMessage4.result, hashMap, j14, messageObject3, messageObject, null, null, z11, i12, 0, null, 0L, 0L);
                                    if (charSequence != null) {
                                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i15);
                                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j14, messageObject3, messageObject3, null, true, null, null, null, true, 0, 0, null, false);
                                        j14 = j14;
                                        sendMessagesHelper.sendMessage(of2);
                                    }
                                    arrayList3.add(Long.valueOf(j14));
                                    i14 = i14;
                                    z12 = false;
                                }
                            }
                            l1 l1Var2 = l1.this;
                            if (!l1Var2.Y) {
                                l1Var2.Y = true;
                                if (arrayList3.size() > 0) {
                                    str = null;
                                } else {
                                    str = "USER_DECLINED";
                                }
                                y0Var.run(str, arrayList3);
                            }
                            if (we1Var != null) {
                                we1Var.finishFragment();
                                dyVar.removeSelfFromStack();
                                return true;
                            }
                            dyVar.finishFragment();
                            return true;
                        }
                    };
                    U.presentFragment(j1Var);
                    l1Var.dismiss();
                    tVar3.run();
                    return;
                }
                return;
            default:
                of0 of0Var = (of0) this.d;
                String str = (String) this.f8739e;
                String str2 = (String) this.f8740f;
                String str3 = (String) this.h;
                kh.d dVar = of0Var.f41140b;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f8738c;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f8737b;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject p6 = mh.c3.p(null, false);
                    if (p6 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = p6.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    of0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.y9(of0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
        }
    }

    public q0(mh.l1 l1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, bg.y0 y0Var, int i9, long j10, org.telegram.ui.web.t tVar) {
        this.d = l1Var;
        this.f8739e = tL_messages_preparedInlineMessage;
        this.f8740f = y0Var;
        this.f8737b = i9;
        this.f8738c = j10;
        this.h = tVar;
    }

    public q0(of0 of0Var, String str, long j10, String str2, String str3, int i9) {
        this.d = of0Var;
        this.f8739e = str;
        this.f8738c = j10;
        this.f8740f = str2;
        this.h = str3;
        this.f8737b = i9;
    }
}
