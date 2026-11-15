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
import org.telegram.ui.di0;
import org.telegram.ui.ka1;
import org.telegram.ui.kl0;
public final class mx implements RequestDelegate {
    public final int f25115a = 2;
    public final ez f25116b;
    public final Object f25117c;
    public final gj d;
    public final String f25118e;
    public final Object f25119f;
    public final boolean f25120g;
    public final Object h;
    public final Object f25121i;
    public final Object f25122j;
    public final boolean f25123k;
    public final Object f25124l;

    public mx(ez ezVar, String str, List list, boolean z10, gj gjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.an anVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f25116b = ezVar;
        this.f25118e = str;
        this.f25124l = list;
        this.f25120g = z10;
        this.d = gjVar;
        this.f25117c = keyboardButtonProto;
        this.f25119f = anVar;
        this.h = twoStepVerificationActivity;
        this.f25121i = tLObjectArr;
        this.f25122j = inputCheckPasswordSRP;
        this.f25123k = z11;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i7;
        boolean z10;
        int i10 = this.f25115a;
        Object obj = this.f25122j;
        Object obj2 = this.h;
        Object obj3 = this.f25119f;
        Object obj4 = this.f25117c;
        Object obj5 = this.f25124l;
        switch (i10) {
            case 0:
                g0.h3(new ux(this.f25116b, tLObject, (TLRPC.TL_messages_addPollAnswer) obj5, (TLObject) obj4, this.d, this.f25118e, (qy) obj3, this.f25120g, (qy) obj2, this.f25121i, (HashMap) obj, this.f25123k));
                return;
            case 1:
                final TLObject tLObject2 = (TLObject) obj4;
                final qy qyVar = (qy) obj3;
                final qy qyVar2 = (qy) obj2;
                final HashMap hashMap = (HashMap) obj;
                TLRPC.Message message = (TLRPC.Message) obj5;
                final ez ezVar = this.f25116b;
                final gj gjVar = this.d;
                final String str = this.f25118e;
                final boolean z11 = this.f25120g;
                final Object obj6 = this.f25121i;
                final boolean z12 = this.f25123k;
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
                                ezVar.O(tLObject2, gjVar, str, qyVar, z11, qyVar2, obj6, hashMap, z12);
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
                                ezVar.O(tLObject2, gjVar, str, qyVar, z11, qyVar2, obj6, hashMap, z12);
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
                                ezVar.O(tLObject2, gjVar, str, qyVar, z11, qyVar2, obj6, hashMap, z12);
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
                                ezVar.O(tLObject2, gjVar, str, qyVar, z11, qyVar2, obj6, hashMap, z12);
                                return;
                            }
                        }
                    } else {
                        i7 = 1;
                    }
                    if (obj6 != null) {
                        r8 fileRefController = ezVar.getFileRefController();
                        Boolean valueOf = Boolean.valueOf(z11);
                        Boolean valueOf2 = Boolean.valueOf(z12);
                        Object[] objArr = new Object[7];
                        objArr[0] = tLObject2;
                        objArr[i7] = gjVar;
                        objArr[2] = str;
                        objArr[3] = qyVar;
                        objArr[4] = valueOf;
                        objArr[5] = qyVar2;
                        objArr[6] = valueOf2;
                        fileRefController.u(objArr, obj6);
                        return;
                    } else if (qyVar2 != null) {
                        g0.h3(new in(ezVar, message, z12, tLObject2, qyVar2, 4));
                        return;
                    }
                }
                if (tL_error != null && (tLObject2 instanceof TLRPC.TL_messages_sendMedia)) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                    if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaStakeDice) {
                        if ("GAME_HASH_INVALID".equalsIgnoreCase(tL_error.text)) {
                            ezVar.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new d3.b(i7), new s10() {
                                @Override
                                public final void a(Object obj7, Object obj8) {
                                    TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj7;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj8;
                                    ez ezVar2 = ez.this;
                                    ezVar2.getClass();
                                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                                        String str3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).game_hash;
                                        TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                                        TLRPC.InputMedia inputMedia5 = tL_messages_sendMedia2.media;
                                        if (inputMedia5 instanceof TLRPC.TL_inputMediaStakeDice) {
                                            ((TLRPC.TL_inputMediaStakeDice) inputMedia5).game_hash = str3;
                                        }
                                        ezVar2.O(tL_messages_sendMedia2, gjVar, str, qyVar, z11, qyVar2, obj6, hashMap, z12);
                                    }
                                }
                            });
                            return;
                        } else if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) tL_messages_sendMedia.media;
                            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                            if (T != null) {
                                g0.h3(new ux(ezVar, T, tL_inputMediaStakeDice, tLObject2, gjVar, str, qyVar, z11, qyVar2, obj6, hashMap, z12));
                                return;
                            }
                            z12 = z12;
                        }
                    }
                }
                if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                    g0.h3(new sx(ezVar, tL_error, message, tLObject, gjVar, str, hashMap, z12, tLObject2));
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messages_editMessage) {
                    g0.h3(new xx(ezVar, tL_error, message, tLObject, gjVar, str, hashMap, z12, tLObject2));
                    return;
                } else {
                    g0.h3(new xx(ezVar, z12, tL_error, message, tLObject, gjVar, hashMap, str, tLObject2));
                    return;
                }
            default:
                final List list = (List) obj5;
                final TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) obj4;
                final org.telegram.ui.an anVar = (org.telegram.ui.an) obj3;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                final TLObject[] tLObjectArr = (TLObject[]) this.f25121i;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj;
                final ez ezVar2 = this.f25116b;
                final String str3 = this.f25118e;
                final boolean z13 = this.f25120g;
                final gj gjVar2 = this.d;
                final boolean z14 = this.f25123k;
                g0.h3(new Runnable() {
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
                        gj gjVar3;
                        boolean z15;
                        String str4;
                        boolean z16;
                        boolean z17;
                        org.telegram.ui.Components.rg rgVar;
                        final ez ezVar3 = ez.this;
                        String str5 = str3;
                        List list2 = list;
                        boolean z18 = z13;
                        TLObject tLObject3 = tLObject;
                        final gj gjVar4 = gjVar2;
                        final TL_keyboard.KeyboardButtonProto keyboardButtonProto2 = keyboardButtonProto;
                        final org.telegram.ui.an anVar2 = anVar;
                        final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        TLObject[] tLObjectArr2 = tLObjectArr;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                        final boolean z19 = z14;
                        ezVar3.f23395r.remove(str5);
                        list2.remove(str5);
                        if (z18 && tLObject3 == null) {
                            ezVar3.n0(false, gjVar4, keyboardButtonProto2, null, null, anVar2);
                            return;
                        }
                        TLRPC.TL_game tL_game = null;
                        if (tLObject3 != null) {
                            if (twoStepVerificationActivity2 != null) {
                                twoStepVerificationActivity2.t0();
                                twoStepVerificationActivity2.finishFragment();
                            }
                            long Z0 = gjVar4.Z0();
                            long j3 = gjVar4.f23819k.via_bot_id;
                            if (j3 != 0) {
                                Z0 = j3;
                            }
                            if (Z0 > 0) {
                                TLRPC.User a22 = ezVar3.getMessagesController().a2(Long.valueOf(Z0));
                                if (a22 != null) {
                                    str4 = g5.m(0, a22.first_name, a22.last_name);
                                } else {
                                    str4 = null;
                                }
                                gjVar3 = gjVar4;
                                z15 = z18;
                            } else {
                                gjVar3 = gjVar4;
                                z15 = z18;
                                TLRPC.Chat M0 = ezVar3.getMessagesController().M0(Long.valueOf(-Z0));
                                if (M0 != null) {
                                    str4 = M0.title;
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
                                    di0.b(false, ezVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultRequest) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultAccepted) {
                                    di0.b(false, ezVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultAccepted) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultDefault) {
                                    org.telegram.ui.Components.t4.n0(anVar2, tL_inlineButtonTypeUrlAuth.url, false, true);
                                }
                            } else if (cg.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                                    di.u8.y(ezVar3.currentAccount, false).X(gjVar3, ((TLRPC.TL_payments_getPaymentForm) tLObjectArr2[0]).invoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, new vw(ezVar3, str5, list2, 0), new fi.e(5));
                                    return;
                                }
                                gj gjVar5 = gjVar3;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                                    ezVar3.getMessagesController().Y3(paymentForm.users, false);
                                    anVar2.presentFragment(new kl0(paymentForm, gjVar5, null, anVar2));
                                } else if (tLObject3 instanceof TLRPC.TL_payments_paymentReceiptStars) {
                                    Context context = LaunchActivity.H1;
                                    if (context == null) {
                                        context = t0.f26609b;
                                    }
                                    di.lb.m1(context, ezVar3.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject3, null);
                                } else if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                                    anVar2.presentFragment(new kl0((TLRPC.PaymentReceipt) tLObject3));
                                }
                            } else {
                                gj gjVar6 = gjVar3;
                                TLRPC.TL_messages_botCallbackAnswer tL_messages_botCallbackAnswer = (TLRPC.TL_messages_botCallbackAnswer) tLObject3;
                                TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) cg.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                if (!z15 && tL_messages_botCallbackAnswer.cache_time != 0 && (tL_inlineButtonTypeCallback == null || !tL_inlineButtonTypeCallback.requires_password)) {
                                    ezVar3.getMessagesStorage().v1(str5, tL_messages_botCallbackAnswer);
                                }
                                String str6 = tL_messages_botCallbackAnswer.message;
                                if (str6 != null) {
                                    if (tL_messages_botCallbackAnswer.alert) {
                                        if (anVar2.getParentActivity() != null) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(anVar2.getParentActivity());
                                            alertDialog$Builder.f28392a.S = str4;
                                            alertDialog$Builder.k(hd.M0(2131747831, null), null);
                                            String str7 = tL_messages_botCallbackAnswer.message;
                                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                            t1Var.U = str7;
                                            anVar2.showDialog(t1Var);
                                            return;
                                        }
                                        return;
                                    }
                                    if (anVar2.f45149c3 == null && anVar2.f45133b1 != null && anVar2.getParentActivity() != null) {
                                        FrameLayout frameLayout = new FrameLayout(anVar2.getParentActivity());
                                        anVar2.f45149c3 = frameLayout;
                                        anVar2.f45133b1.addView(frameLayout, c8.ja.o(-1, 48));
                                        anVar2.f45133b1.h(11, anVar2.f45149c3);
                                        anVar2.f45133b1.g(anVar2.f45149c3);
                                        TextView textView = new TextView(anVar2.getParentActivity());
                                        anVar2.f45176e3 = textView;
                                        textView.setTextSize(1, 14.0f);
                                        org.telegram.ui.ActionBar.q6.U(anVar2.f45176e3, org.telegram.ui.ActionBar.j6.We, anVar2.getResourceProvider());
                                        anVar2.f45176e3.setTypeface(g0.o());
                                        anVar2.f45176e3.setSingleLine(true);
                                        TextView textView2 = anVar2.f45176e3;
                                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                        textView2.setEllipsize(truncateAt);
                                        anVar2.f45176e3.setMaxLines(1);
                                        anVar2.f45149c3.addView(anVar2.f45176e3, c8.ja.d(-2, -2.0f, 51, 8.0f, 5.0f, 8.0f, 0.0f));
                                        TextView textView3 = new TextView(anVar2.getParentActivity());
                                        anVar2.f45190f3 = textView3;
                                        textView3.setTextSize(1, 14.0f);
                                        org.telegram.ui.ActionBar.q6.U(anVar2.f45190f3, org.telegram.ui.ActionBar.j6.Xe, anVar2.getResourceProvider());
                                        anVar2.f45190f3.setSingleLine(true);
                                        anVar2.f45190f3.setEllipsize(truncateAt);
                                        anVar2.f45190f3.setMaxLines(1);
                                        anVar2.f45149c3.addView(anVar2.f45190f3, c8.ja.d(-2, -2.0f, 51, 8.0f, 23.0f, 8.0f, 0.0f));
                                    }
                                    FrameLayout frameLayout2 = anVar2.f45149c3;
                                    if (frameLayout2 != null && (rgVar = anVar2.f45133b1) != null) {
                                        rgVar.i(frameLayout2, true, true);
                                        anVar2.f45176e3.setText(str4);
                                        anVar2.f45190f3.setText(j6.m(str6.replace('\n', ' '), anVar2.f45190f3.getPaint().getFontMetricsInt(), false, null, 0));
                                        org.telegram.ui.xj xjVar = anVar2.f45162d3;
                                        if (xjVar != null) {
                                            g0.r(xjVar);
                                        }
                                        org.telegram.ui.xj xjVar2 = new org.telegram.ui.xj(anVar2, 1);
                                        anVar2.f45162d3 = xjVar2;
                                        g0.i3(xjVar2, 3000L);
                                    }
                                } else if (tL_messages_botCallbackAnswer.url != null && anVar2.getParentActivity() != null) {
                                    TLRPC.User a23 = ezVar3.getMessagesController().a2(Long.valueOf(Z0));
                                    if (a23 != null && a23.verified) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (cg.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                        TLRPC.MessageMedia messageMedia = gjVar6.f23819k.media;
                                        if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                            tL_game = messageMedia.game;
                                        }
                                        if (tL_game != null) {
                                            String str8 = tL_messages_botCallbackAnswer.url;
                                            if (!z16 && k5.w("askgame_", Z0, np.s1(ezVar3.currentAccount).f25273e7, true)) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            anVar2.tc(tL_game, gjVar6, str8, z17, Z0);
                                            return;
                                        }
                                        return;
                                    }
                                    org.telegram.ui.Components.t4.n0(anVar2, tL_messages_botCallbackAnswer.url, false, false);
                                }
                            }
                        } else if (tL_error2 != null && anVar2.getParentActivity() != null) {
                            if ("PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                if (inputCheckPasswordSRP2 == null) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(anVar2.getParentActivity());
                                    alertDialog$Builder2.f28392a.S = hd.M0(2131753019, null);
                                    alertDialog$Builder2.f28392a.U = g0.X2(hd.a0("BotOwnershipTransferReadyAlertText", null, 2131753016, new Object[0]));
                                    alertDialog$Builder2.k(hd.M0(2131753017, null), new org.telegram.ui.ActionBar.q1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i18) {
                                            final TwoStepVerificationActivity twoStepVerificationActivity3 = new TwoStepVerificationActivity();
                                            final gj gjVar7 = gjVar4;
                                            final ez ezVar4 = ez.this;
                                            final TL_keyboard.KeyboardButtonProto keyboardButtonProto3 = keyboardButtonProto2;
                                            final org.telegram.ui.an anVar3 = anVar2;
                                            final boolean z20 = z19;
                                            ka1 ka1Var = new ka1() {
                                                @Override
                                                public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
                                                    ezVar4.n0(z20, gjVar7, keyboardButtonProto3, tL_inputCheckPasswordSRP, twoStepVerificationActivity3, anVar3);
                                                }
                                            };
                                            twoStepVerificationActivity3.f43426a0 = 0;
                                            twoStepVerificationActivity3.f43430c0 = ka1Var;
                                            anVar3.presentFragment(twoStepVerificationActivity3);
                                        }
                                    });
                                    alertDialog$Builder2.h(hd.M0(2131752589, null), null);
                                    anVar2.showDialog(alertDialog$Builder2.f28392a);
                                }
                            } else if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                                if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                    ConnectionsManager.getInstance(ezVar3.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                                        @Override
                                        public final void run(TLObject tLObject4, TLRPC.TL_error tL_error3) {
                                            g0.h3(new yg(ezVar3, tL_error3, tLObject4, twoStepVerificationActivity2, z19, gjVar4, keyboardButtonProto2, anVar2));
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
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(anVar2.getParentActivity());
                                alertDialog$Builder3.f28392a.S = hd.M0(2131751297, null);
                                LinearLayout linearLayout = new LinearLayout(anVar2.getParentActivity());
                                linearLayout.setPadding(g0.L(24.0f), g0.L(2.0f), g0.L(24.0f), 0);
                                linearLayout.setOrientation(1);
                                alertDialog$Builder3.o(linearLayout);
                                TextView textView4 = new TextView(anVar2.getParentActivity());
                                int i18 = org.telegram.ui.ActionBar.j6.f28957j5;
                                org.telegram.ui.ActionBar.q6.U(textView4, i18, null);
                                textView4.setTextSize(1, 16.0f);
                                if (hd.f24104a0) {
                                    i11 = 5;
                                } else {
                                    i11 = 3;
                                }
                                textView4.setGravity(i11 | 48);
                                k5.q("BotOwnershipTransferAlertText", null, 2131753018, new Object[0], textView4);
                                linearLayout.addView(textView4, c8.ja.o(-1, -2));
                                LinearLayout linearLayout2 = new LinearLayout(anVar2.getParentActivity());
                                linearLayout2.setOrientation(0);
                                linearLayout.addView(linearLayout2, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                ImageView imageView = new ImageView(anVar2.getParentActivity());
                                imageView.setImageResource(2131231623);
                                if (hd.f24104a0) {
                                    i12 = g0.L(11.0f);
                                } else {
                                    i12 = 0;
                                }
                                int L3 = g0.L(9.0f);
                                if (hd.f24104a0) {
                                    L = 0;
                                } else {
                                    L = g0.L(11.0f);
                                }
                                imageView.setPadding(i12, L3, L, 0);
                                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                org.telegram.ui.ActionBar.q6.s(imageView, i18, null, mode);
                                TextView textView5 = new TextView(anVar2.getParentActivity());
                                org.telegram.ui.ActionBar.q6.U(textView5, i18, null);
                                textView5.setTextSize(1, 16.0f);
                                if (hd.f24104a0) {
                                    i13 = 5;
                                } else {
                                    i13 = 3;
                                }
                                textView5.setGravity(i13 | 48);
                                textView5.setText(g0.X2(hd.M0(2131751300, null)));
                                if (hd.f24104a0) {
                                    linearLayout2.addView(textView5, c8.ja.o(-1, -2));
                                    linearLayout2.addView(imageView, c8.ja.r(-2, -2, 5));
                                } else {
                                    linearLayout2.addView(imageView, c8.ja.o(-2, -2));
                                    linearLayout2.addView(textView5, c8.ja.o(-1, -2));
                                }
                                LinearLayout linearLayout3 = new LinearLayout(anVar2.getParentActivity());
                                linearLayout3.setOrientation(0);
                                linearLayout.addView(linearLayout3, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                ImageView imageView2 = new ImageView(anVar2.getParentActivity());
                                imageView2.setImageResource(2131231623);
                                if (hd.f24104a0) {
                                    i14 = g0.L(11.0f);
                                } else {
                                    i14 = 0;
                                }
                                int L4 = g0.L(9.0f);
                                if (hd.f24104a0) {
                                    L2 = 0;
                                } else {
                                    L2 = g0.L(11.0f);
                                }
                                imageView2.setPadding(i14, L4, L2, 0);
                                org.telegram.ui.ActionBar.q6.s(imageView2, i18, null, mode);
                                TextView textView6 = new TextView(anVar2.getParentActivity());
                                org.telegram.ui.ActionBar.q6.U(textView6, i18, null);
                                textView6.setTextSize(1, 16.0f);
                                if (hd.f24104a0) {
                                    i15 = 5;
                                } else {
                                    i15 = 3;
                                }
                                textView6.setGravity(i15 | 48);
                                textView6.setText(g0.X2(hd.M0(2131751299, null)));
                                if (hd.f24104a0) {
                                    linearLayout3.addView(textView6, c8.ja.o(-1, -2));
                                    i16 = 5;
                                    linearLayout3.addView(imageView2, c8.ja.r(-2, -2, 5));
                                } else {
                                    i16 = 5;
                                    linearLayout3.addView(imageView2, c8.ja.o(-2, -2));
                                    linearLayout3.addView(textView6, c8.ja.o(-1, -2));
                                }
                                if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                    alertDialog$Builder3.k(hd.M0(2131751291, null), new j1(anVar2, 16));
                                    alertDialog$Builder3.h(hd.M0(2131752589, null), null);
                                } else {
                                    TextView textView7 = new TextView(anVar2.getParentActivity());
                                    org.telegram.ui.ActionBar.q6.U(textView7, i18, null);
                                    textView7.setTextSize(1, 16.0f);
                                    if (hd.f24104a0) {
                                        i17 = i16;
                                    } else {
                                        i17 = 3;
                                    }
                                    k5.l(textView7, i17 | 48, null, 2131751298);
                                    linearLayout.addView(textView7, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                    alertDialog$Builder3.h(hd.M0(2131747831, null), null);
                                }
                                anVar2.showDialog(alertDialog$Builder3.f28392a);
                            }
                        }
                    }
                });
                return;
        }
    }

    public mx(ez ezVar, TLObject tLObject, gj gjVar, String str, qy qyVar, boolean z10, qy qyVar2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f25116b = ezVar;
        this.f25117c = tLObject;
        this.d = gjVar;
        this.f25118e = str;
        this.f25119f = qyVar;
        this.f25120g = z10;
        this.h = qyVar2;
        this.f25121i = obj;
        this.f25122j = hashMap;
        this.f25123k = z11;
        this.f25124l = message;
    }

    public mx(ez ezVar, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, gj gjVar, String str, qy qyVar, boolean z10, qy qyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f25116b = ezVar;
        this.f25124l = tL_messages_addPollAnswer;
        this.f25117c = tLObject;
        this.d = gjVar;
        this.f25118e = str;
        this.f25119f = qyVar;
        this.f25120g = z10;
        this.h = qyVar2;
        this.f25121i = obj;
        this.f25122j = hashMap;
        this.f25123k = z11;
    }
}
