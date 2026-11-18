package org.telegram.messenger;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.gi0;
import org.telegram.ui.ml0;
import org.telegram.ui.oa1;
public final class hx implements RequestDelegate {
    public final int f24517a = 2;
    public final zy f24518b;
    public final Object f24519c;
    public final fj d;
    public final String f24520e;
    public final Object f24521f;
    public final boolean f24522g;
    public final Object h;
    public final Object f24523i;
    public final Object f24524j;
    public final boolean f24525k;
    public final Object f24526l;

    public hx(zy zyVar, String str, List list, boolean z10, fj fjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.bn bnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f24518b = zyVar;
        this.f24520e = str;
        this.f24526l = list;
        this.f24522g = z10;
        this.d = fjVar;
        this.f24519c = keyboardButtonProto;
        this.f24521f = bnVar;
        this.h = twoStepVerificationActivity;
        this.f24523i = tLObjectArr;
        this.f24524j = inputCheckPasswordSRP;
        this.f24525k = z11;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i7;
        boolean z10;
        int i10 = this.f24517a;
        Object obj = this.f24524j;
        Object obj2 = this.h;
        Object obj3 = this.f24521f;
        Object obj4 = this.f24519c;
        Object obj5 = this.f24526l;
        switch (i10) {
            case 0:
                g0.g3(new px(this.f24518b, tLObject, (TLRPC.TL_messages_addPollAnswer) obj5, (TLObject) obj4, this.d, this.f24520e, (ly) obj3, this.f24522g, (ly) obj2, this.f24523i, (HashMap) obj, this.f24525k));
                return;
            case 1:
                final TLObject tLObject2 = (TLObject) obj4;
                final ly lyVar = (ly) obj3;
                final ly lyVar2 = (ly) obj2;
                final HashMap hashMap = (HashMap) obj;
                TLRPC.Message message = (TLRPC.Message) obj5;
                final zy zyVar = this.f24518b;
                final fj fjVar = this.d;
                final String str = this.f24520e;
                final boolean z11 = this.f24522g;
                final Object obj6 = this.f24523i;
                final boolean z12 = this.f24525k;
                if (tL_error == null || ((!((z10 = tLObject2 instanceof TLRPC.TL_messages_sendMedia)) && !(tLObject2 instanceof TL_ephemeral.TL_sendMessage) && !(tLObject2 instanceof TLRPC.TL_messages_editMessage) && !(tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) || !r8.r(tL_error.text))) {
                    i7 = 1;
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null && r8.r(str2)) {
                        i7 = 1;
                        if (str2.endsWith("COVER_EXPIRED")) {
                            if (z10) {
                                TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject2).media;
                                if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = (TLRPC.TL_inputMediaUploadedDocument) inputMedia;
                                    tL_inputMediaUploadedDocument.video_cover = null;
                                    tL_inputMediaUploadedDocument.flags &= -65;
                                } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                                    tL_inputMediaDocument.video_cover = null;
                                    tL_inputMediaDocument.flags &= -9;
                                } else if (inputMedia instanceof TLRPC.TL_inputMediaDocumentExternal) {
                                    TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal = (TLRPC.TL_inputMediaDocumentExternal) inputMedia;
                                    tL_inputMediaDocumentExternal.video_cover = null;
                                    tL_inputMediaDocumentExternal.flags &= -5;
                                }
                                zyVar.O(tLObject2, fjVar, str, lyVar, z11, lyVar2, obj6, hashMap, z12);
                                return;
                            } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                                TLRPC.InputMedia inputMedia2 = ((TL_ephemeral.TL_sendMessage) tLObject2).media;
                                if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia2;
                                    tL_inputMediaUploadedDocument2.video_cover = null;
                                    tL_inputMediaUploadedDocument2.flags &= -65;
                                } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                                    tL_inputMediaDocument2.video_cover = null;
                                    tL_inputMediaDocument2.flags &= -9;
                                } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocumentExternal) {
                                    TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal2 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia2;
                                    tL_inputMediaDocumentExternal2.video_cover = null;
                                    tL_inputMediaDocumentExternal2.flags &= -5;
                                }
                                zyVar.O(tLObject2, fjVar, str, lyVar, z11, lyVar2, obj6, hashMap, z12);
                                return;
                            } else if (tLObject2 instanceof TLRPC.TL_messages_editMessage) {
                                TLRPC.InputMedia inputMedia3 = ((TLRPC.TL_messages_editMessage) tLObject2).media;
                                if (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument3 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia3;
                                    tL_inputMediaUploadedDocument3.video_cover = null;
                                    tL_inputMediaUploadedDocument3.flags &= -65;
                                } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                                    tL_inputMediaDocument3.video_cover = null;
                                    tL_inputMediaDocument3.flags &= -9;
                                } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocumentExternal) {
                                    TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal3 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia3;
                                    tL_inputMediaDocumentExternal3.video_cover = null;
                                    tL_inputMediaDocumentExternal3.flags &= -5;
                                }
                                zyVar.O(tLObject2, fjVar, str, lyVar, z11, lyVar2, obj6, hashMap, z12);
                                return;
                            } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                                TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media;
                                if (inputMedia4 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument4 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia4;
                                    tL_inputMediaUploadedDocument4.video_cover = null;
                                    tL_inputMediaUploadedDocument4.flags &= -65;
                                } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                                    tL_inputMediaDocument4.video_cover = null;
                                    tL_inputMediaDocument4.flags &= -9;
                                } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocumentExternal) {
                                    TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal4 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia4;
                                    tL_inputMediaDocumentExternal4.video_cover = null;
                                    tL_inputMediaDocumentExternal4.flags &= -5;
                                }
                                zyVar.O(tLObject2, fjVar, str, lyVar, z11, lyVar2, obj6, hashMap, z12);
                                return;
                            }
                        }
                    } else {
                        i7 = 1;
                    }
                    if (obj6 != null) {
                        r8 fileRefController = zyVar.getFileRefController();
                        Boolean valueOf = Boolean.valueOf(z11);
                        Boolean valueOf2 = Boolean.valueOf(z12);
                        Object[] objArr = new Object[7];
                        objArr[0] = tLObject2;
                        objArr[i7] = fjVar;
                        objArr[2] = str;
                        objArr[3] = lyVar;
                        objArr[4] = valueOf;
                        objArr[5] = lyVar2;
                        objArr[6] = valueOf2;
                        fileRefController.u(objArr, obj6);
                        return;
                    } else if (lyVar2 != null) {
                        g0.g3(new in(zyVar, message, z12, tLObject2, lyVar2, 4));
                        return;
                    }
                }
                if (tL_error != null && (tLObject2 instanceof TLRPC.TL_messages_sendMedia)) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                    if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaStakeDice) {
                        if ("GAME_HASH_INVALID".equalsIgnoreCase(tL_error.text)) {
                            zyVar.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new d3.b(i7), new q10() {
                                @Override
                                public final void a(Object obj7, Object obj8) {
                                    TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj7;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj8;
                                    zy zyVar2 = zy.this;
                                    zyVar2.getClass();
                                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                                        String str3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).game_hash;
                                        TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                                        TLRPC.InputMedia inputMedia5 = tL_messages_sendMedia2.media;
                                        if (inputMedia5 instanceof TLRPC.TL_inputMediaStakeDice) {
                                            ((TLRPC.TL_inputMediaStakeDice) inputMedia5).game_hash = str3;
                                        }
                                        zyVar2.O(tL_messages_sendMedia2, fjVar, str, lyVar, z11, lyVar2, obj6, hashMap, z12);
                                    }
                                }
                            });
                            return;
                        } else if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) tL_messages_sendMedia.media;
                            org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                            if (T != null) {
                                g0.g3(new px(zyVar, T, tL_inputMediaStakeDice, tLObject2, fjVar, str, lyVar, z11, lyVar2, obj6, hashMap, z12));
                                return;
                            }
                            z12 = z12;
                        }
                    }
                }
                if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                    g0.g3(new nx(zyVar, tL_error, message, tLObject, fjVar, str, hashMap, z12, tLObject2));
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messages_editMessage) {
                    g0.g3(new sx(zyVar, tL_error, message, tLObject, fjVar, str, hashMap, z12, tLObject2));
                    return;
                } else {
                    g0.g3(new sx(zyVar, z12, tL_error, message, tLObject, fjVar, hashMap, str, tLObject2));
                    return;
                }
            default:
                final List list = (List) obj5;
                final TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) obj4;
                final org.telegram.ui.bn bnVar = (org.telegram.ui.bn) obj3;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                final TLObject[] tLObjectArr = (TLObject[]) this.f24523i;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj;
                final zy zyVar2 = this.f24518b;
                final String str3 = this.f24520e;
                final boolean z13 = this.f24522g;
                final fj fjVar2 = this.d;
                final boolean z14 = this.f24525k;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i11;
                        int i12;
                        int L;
                        int i13;
                        int i14;
                        int L2;
                        int i15;
                        int i16;
                        int i17;
                        fj fjVar3;
                        boolean z15;
                        String str4;
                        boolean z16;
                        boolean z17;
                        org.telegram.ui.Components.ah ahVar;
                        final zy zyVar3 = zy.this;
                        String str5 = str3;
                        List list2 = list;
                        boolean z18 = z13;
                        TLObject tLObject3 = tLObject;
                        final fj fjVar4 = fjVar2;
                        final TL_keyboard.KeyboardButtonProto keyboardButtonProto2 = keyboardButtonProto;
                        final org.telegram.ui.bn bnVar2 = bnVar;
                        final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        TLObject[] tLObjectArr2 = tLObjectArr;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                        final boolean z19 = z14;
                        zyVar3.f28393r.remove(str5);
                        list2.remove(str5);
                        if (z18 && tLObject3 == null) {
                            zyVar3.n0(false, fjVar4, keyboardButtonProto2, null, null, bnVar2);
                            return;
                        }
                        TLRPC.TL_game tL_game = null;
                        if (tLObject3 != null) {
                            if (twoStepVerificationActivity2 != null) {
                                twoStepVerificationActivity2.t0();
                                twoStepVerificationActivity2.finishFragment();
                            }
                            long Z0 = fjVar4.Z0();
                            long j3 = fjVar4.f23968k.via_bot_id;
                            if (j3 != 0) {
                                Z0 = j3;
                            }
                            if (Z0 > 0) {
                                TLRPC.User c22 = zyVar3.getMessagesController().c2(Long.valueOf(Z0));
                                if (c22 != null) {
                                    str4 = i5.m(0, c22.first_name, c22.last_name);
                                } else {
                                    str4 = null;
                                }
                                fjVar3 = fjVar4;
                                z15 = z18;
                            } else {
                                fjVar3 = fjVar4;
                                z15 = z18;
                                TLRPC.Chat O0 = zyVar3.getMessagesController().O0(Long.valueOf(-Z0));
                                if (O0 != null) {
                                    str4 = O0.title;
                                } else {
                                    str4 = null;
                                }
                            }
                            if (str4 == null) {
                                str4 = "bot";
                            }
                            TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) cg.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
                            if (tL_inlineButtonTypeUrlAuth != null) {
                                if (tLObject3 instanceof TLRPC.TL_urlAuthResultRequest) {
                                    gi0.b(false, zyVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultRequest) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultAccepted) {
                                    gi0.b(false, zyVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultAccepted) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultDefault) {
                                    org.telegram.ui.Components.b5.n0(bnVar2, tL_inlineButtonTypeUrlAuth.url, false, true);
                                }
                            } else if (cg.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                                    di.x8.y(zyVar3.currentAccount, false).W(fjVar3, ((TLRPC.TL_payments_getPaymentForm) tLObjectArr2[0]).invoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, new qw(zyVar3, str5, list2, 0), new fi.e(5));
                                    return;
                                }
                                fj fjVar5 = fjVar3;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                                    zyVar3.getMessagesController().f4(paymentForm.users, false);
                                    bnVar2.presentFragment(new ml0(paymentForm, fjVar5, null, bnVar2));
                                } else if (tLObject3 instanceof TLRPC.TL_payments_paymentReceiptStars) {
                                    Context context = LaunchActivity.H1;
                                    if (context == null) {
                                        context = t0.f26915b;
                                    }
                                    di.pb.n1(context, zyVar3.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject3, null);
                                } else if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                                    bnVar2.presentFragment(new ml0((TLRPC.PaymentReceipt) tLObject3));
                                }
                            } else {
                                fj fjVar6 = fjVar3;
                                TLRPC.TL_messages_botCallbackAnswer tL_messages_botCallbackAnswer = (TLRPC.TL_messages_botCallbackAnswer) tLObject3;
                                TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) cg.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                if (!z15 && tL_messages_botCallbackAnswer.cache_time != 0 && (tL_inlineButtonTypeCallback == null || !tL_inlineButtonTypeCallback.requires_password)) {
                                    zyVar3.getMessagesStorage().v1(str5, tL_messages_botCallbackAnswer);
                                }
                                String str6 = tL_messages_botCallbackAnswer.message;
                                if (str6 != null) {
                                    if (tL_messages_botCallbackAnswer.alert) {
                                        if (bnVar2.getParentActivity() != null) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bnVar2.getParentActivity());
                                            alertDialog$Builder.f28746a.S = str4;
                                            alertDialog$Builder.k(gd.M0(2131747638, null), null);
                                            String str7 = tL_messages_botCallbackAnswer.message;
                                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                                            u1Var.U = str7;
                                            bnVar2.showDialog(u1Var);
                                            return;
                                        }
                                        return;
                                    }
                                    if (bnVar2.f45964c3 == null && bnVar2.f45948b1 != null && bnVar2.getParentActivity() != null) {
                                        FrameLayout frameLayout = new FrameLayout(bnVar2.getParentActivity());
                                        bnVar2.f45964c3 = frameLayout;
                                        bnVar2.f45948b1.addView(frameLayout, c8.ma.o(-1, 48));
                                        bnVar2.f45948b1.i(11, bnVar2.f45964c3);
                                        bnVar2.f45948b1.h(bnVar2.f45964c3);
                                        TextView textView = new TextView(bnVar2.getParentActivity());
                                        bnVar2.f45991e3 = textView;
                                        textView.setTextSize(1, 14.0f);
                                        org.telegram.ui.ActionBar.u6.U(bnVar2.f45991e3, org.telegram.ui.ActionBar.n6.We, bnVar2.getResourceProvider());
                                        bnVar2.f45991e3.setTypeface(g0.o());
                                        bnVar2.f45991e3.setSingleLine(true);
                                        TextView textView2 = bnVar2.f45991e3;
                                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                        textView2.setEllipsize(truncateAt);
                                        bnVar2.f45991e3.setMaxLines(1);
                                        bnVar2.f45964c3.addView(bnVar2.f45991e3, c8.ma.d(-2, -2.0f, 51, 8.0f, 5.0f, 8.0f, 0.0f));
                                        TextView textView3 = new TextView(bnVar2.getParentActivity());
                                        bnVar2.f46005f3 = textView3;
                                        textView3.setTextSize(1, 14.0f);
                                        org.telegram.ui.ActionBar.u6.U(bnVar2.f46005f3, org.telegram.ui.ActionBar.n6.Xe, bnVar2.getResourceProvider());
                                        bnVar2.f46005f3.setSingleLine(true);
                                        bnVar2.f46005f3.setEllipsize(truncateAt);
                                        bnVar2.f46005f3.setMaxLines(1);
                                        bnVar2.f45964c3.addView(bnVar2.f46005f3, c8.ma.d(-2, -2.0f, 51, 8.0f, 23.0f, 8.0f, 0.0f));
                                    }
                                    FrameLayout frameLayout2 = bnVar2.f45964c3;
                                    if (frameLayout2 != null && (ahVar = bnVar2.f45948b1) != null) {
                                        ahVar.j(frameLayout2, true, true);
                                        bnVar2.f45991e3.setText(str4);
                                        bnVar2.f46005f3.setText(j6.m(str6.replace('\n', ' '), bnVar2.f46005f3.getPaint().getFontMetricsInt(), false, null, 0));
                                        org.telegram.ui.yj yjVar = bnVar2.f45977d3;
                                        if (yjVar != null) {
                                            g0.r(yjVar);
                                        }
                                        org.telegram.ui.yj yjVar2 = new org.telegram.ui.yj(bnVar2, 1);
                                        bnVar2.f45977d3 = yjVar2;
                                        g0.h3(yjVar2, 3000L);
                                    }
                                } else if (tL_messages_botCallbackAnswer.url != null && bnVar2.getParentActivity() != null) {
                                    TLRPC.User c23 = zyVar3.getMessagesController().c2(Long.valueOf(Z0));
                                    if (c23 != null && c23.verified) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (cg.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                        TLRPC.MessageMedia messageMedia = fjVar6.f23968k.media;
                                        if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                            tL_game = messageMedia.game;
                                        }
                                        if (tL_game != null) {
                                            String str8 = tL_messages_botCallbackAnswer.url;
                                            if (!z16 && f3.w("askgame_", Z0, mp.u1(zyVar3.currentAccount).f25660g7, true)) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            bnVar2.tc(tL_game, fjVar6, str8, z17, Z0);
                                            return;
                                        }
                                        return;
                                    }
                                    org.telegram.ui.Components.b5.n0(bnVar2, tL_messages_botCallbackAnswer.url, false, false);
                                }
                            }
                        } else if (tL_error2 != null && bnVar2.getParentActivity() != null) {
                            if ("PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                if (inputCheckPasswordSRP2 == null) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bnVar2.getParentActivity());
                                    alertDialog$Builder2.f28746a.S = gd.M0(2131753008, null);
                                    alertDialog$Builder2.f28746a.U = g0.W2(gd.a0("BotOwnershipTransferReadyAlertText", null, 2131753005, new Object[0]));
                                    alertDialog$Builder2.k(gd.M0(2131753006, null), new org.telegram.ui.ActionBar.r1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i18) {
                                            final TwoStepVerificationActivity twoStepVerificationActivity3 = new TwoStepVerificationActivity();
                                            final fj fjVar7 = fjVar4;
                                            final zy zyVar4 = zy.this;
                                            final TL_keyboard.KeyboardButtonProto keyboardButtonProto3 = keyboardButtonProto2;
                                            final org.telegram.ui.bn bnVar3 = bnVar2;
                                            final boolean z20 = z19;
                                            oa1 oa1Var = new oa1() {
                                                @Override
                                                public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
                                                    zyVar4.n0(z20, fjVar7, keyboardButtonProto3, tL_inputCheckPasswordSRP, twoStepVerificationActivity3, bnVar3);
                                                }
                                            };
                                            twoStepVerificationActivity3.f43872a0 = 0;
                                            twoStepVerificationActivity3.f43876c0 = oa1Var;
                                            bnVar3.presentFragment(twoStepVerificationActivity3);
                                        }
                                    });
                                    alertDialog$Builder2.h(gd.M0(2131752578, null), null);
                                    bnVar2.showDialog(alertDialog$Builder2.f28746a);
                                }
                            } else if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                                if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                    ConnectionsManager.getInstance(zyVar3.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                                        @Override
                                        public final void run(TLObject tLObject4, TLRPC.TL_error tL_error3) {
                                            g0.g3(new ah(zyVar3, tL_error3, tLObject4, twoStepVerificationActivity2, z19, fjVar4, keyboardButtonProto2, bnVar2));
                                        }
                                    }, 8);
                                } else if (twoStepVerificationActivity2 != null) {
                                    twoStepVerificationActivity2.t0();
                                    twoStepVerificationActivity2.finishFragment();
                                }
                            } else {
                                if (twoStepVerificationActivity2 != null) {
                                    twoStepVerificationActivity2.t0();
                                }
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bnVar2.getParentActivity());
                                alertDialog$Builder3.f28746a.S = gd.M0(2131751286, null);
                                LinearLayout linearLayout = new LinearLayout(bnVar2.getParentActivity());
                                linearLayout.setPadding(g0.L(24.0f), g0.L(2.0f), g0.L(24.0f), 0);
                                linearLayout.setOrientation(1);
                                alertDialog$Builder3.o(linearLayout);
                                TextView textView4 = new TextView(bnVar2.getParentActivity());
                                int i18 = org.telegram.ui.ActionBar.n6.f29504j5;
                                org.telegram.ui.ActionBar.u6.U(textView4, i18, null);
                                textView4.setTextSize(1, 16.0f);
                                if (gd.f24216a0) {
                                    i11 = 5;
                                } else {
                                    i11 = 3;
                                }
                                textView4.setGravity(i11 | 48);
                                f3.q("BotOwnershipTransferAlertText", null, 2131753007, new Object[0], textView4);
                                linearLayout.addView(textView4, c8.ma.o(-1, -2));
                                LinearLayout linearLayout2 = new LinearLayout(bnVar2.getParentActivity());
                                linearLayout2.setOrientation(0);
                                linearLayout.addView(linearLayout2, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                ImageView imageView = new ImageView(bnVar2.getParentActivity());
                                imageView.setImageResource(2131231624);
                                if (gd.f24216a0) {
                                    i12 = g0.L(11.0f);
                                } else {
                                    i12 = 0;
                                }
                                int L3 = g0.L(9.0f);
                                if (gd.f24216a0) {
                                    L = 0;
                                } else {
                                    L = g0.L(11.0f);
                                }
                                imageView.setPadding(i12, L3, L, 0);
                                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                org.telegram.ui.ActionBar.u6.s(imageView, i18, null, mode);
                                TextView textView5 = new TextView(bnVar2.getParentActivity());
                                org.telegram.ui.ActionBar.u6.U(textView5, i18, null);
                                textView5.setTextSize(1, 16.0f);
                                if (gd.f24216a0) {
                                    i13 = 5;
                                } else {
                                    i13 = 3;
                                }
                                textView5.setGravity(i13 | 48);
                                textView5.setText(g0.W2(gd.M0(2131751289, null)));
                                if (gd.f24216a0) {
                                    linearLayout2.addView(textView5, c8.ma.o(-1, -2));
                                    linearLayout2.addView(imageView, c8.ma.r(-2, -2, 5));
                                } else {
                                    linearLayout2.addView(imageView, c8.ma.o(-2, -2));
                                    linearLayout2.addView(textView5, c8.ma.o(-1, -2));
                                }
                                LinearLayout linearLayout3 = new LinearLayout(bnVar2.getParentActivity());
                                linearLayout3.setOrientation(0);
                                linearLayout.addView(linearLayout3, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                ImageView imageView2 = new ImageView(bnVar2.getParentActivity());
                                imageView2.setImageResource(2131231624);
                                if (gd.f24216a0) {
                                    i14 = g0.L(11.0f);
                                } else {
                                    i14 = 0;
                                }
                                int L4 = g0.L(9.0f);
                                if (gd.f24216a0) {
                                    L2 = 0;
                                } else {
                                    L2 = g0.L(11.0f);
                                }
                                imageView2.setPadding(i14, L4, L2, 0);
                                org.telegram.ui.ActionBar.u6.s(imageView2, i18, null, mode);
                                TextView textView6 = new TextView(bnVar2.getParentActivity());
                                org.telegram.ui.ActionBar.u6.U(textView6, i18, null);
                                textView6.setTextSize(1, 16.0f);
                                if (gd.f24216a0) {
                                    i15 = 5;
                                } else {
                                    i15 = 3;
                                }
                                textView6.setGravity(i15 | 48);
                                textView6.setText(g0.W2(gd.M0(2131751288, null)));
                                if (gd.f24216a0) {
                                    linearLayout3.addView(textView6, c8.ma.o(-1, -2));
                                    i16 = 5;
                                    linearLayout3.addView(imageView2, c8.ma.r(-2, -2, 5));
                                } else {
                                    i16 = 5;
                                    linearLayout3.addView(imageView2, c8.ma.o(-2, -2));
                                    linearLayout3.addView(textView6, c8.ma.o(-1, -2));
                                }
                                if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                    alertDialog$Builder3.k(gd.M0(2131751280, null), new j1(bnVar2, 17));
                                    alertDialog$Builder3.h(gd.M0(2131752578, null), null);
                                } else {
                                    TextView textView7 = new TextView(bnVar2.getParentActivity());
                                    org.telegram.ui.ActionBar.u6.U(textView7, i18, null);
                                    textView7.setTextSize(1, 16.0f);
                                    if (gd.f24216a0) {
                                        i17 = i16;
                                    } else {
                                        i17 = 3;
                                    }
                                    f3.k(textView7, i17 | 48, null, 2131751287);
                                    linearLayout.addView(textView7, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                    alertDialog$Builder3.h(gd.M0(2131747638, null), null);
                                }
                                bnVar2.showDialog(alertDialog$Builder3.f28746a);
                            }
                        }
                    }
                });
                return;
        }
    }

    public hx(zy zyVar, TLObject tLObject, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f24518b = zyVar;
        this.f24519c = tLObject;
        this.d = fjVar;
        this.f24520e = str;
        this.f24521f = lyVar;
        this.f24522g = z10;
        this.h = lyVar2;
        this.f24523i = obj;
        this.f24524j = hashMap;
        this.f24525k = z11;
        this.f24526l = message;
    }

    public hx(zy zyVar, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f24518b = zyVar;
        this.f24526l = tL_messages_addPollAnswer;
        this.f24519c = tLObject;
        this.d = fjVar;
        this.f24520e = str;
        this.f24521f = lyVar;
        this.f24522g = z10;
        this.h = lyVar2;
        this.f24523i = obj;
        this.f24524j = hashMap;
        this.f24525k = z11;
    }
}
