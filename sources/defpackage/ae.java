package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class ae implements RequestDelegate {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ae(int i, kv1 kv1Var, d dVar, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = (byte) 7;
        this.b = i;
        this.c = kv1Var;
        this.e = dVar;
        this.d = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        long j;
        boolean z;
        long j2;
        long j3;
        String str2;
        boolean z2;
        byte b = this.a;
        int i = this.b;
        boolean z3 = false;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                hd hdVar = (hd) obj2;
                d dVar = (d) obj;
                if (tL_error == null) {
                    gl.d3(new i57(sharedPreferences, (TLRPC.TL_help_support) tLObject, hdVar, this.b, dVar, (byte) 2));
                    return;
                } else {
                    gl.d3(new tc(hdVar, (byte) 2));
                    return;
                }
            case 1:
                gl.d3(new kf((vg5) obj3, (dx) obj2, tL_error, tLObject, this.b, (eu) obj, (byte) 1));
                return;
            case 2:
                gl.d3(new kf((hv0) obj3, tLObject, this.b, (cv0) obj2, (ev0) obj, tL_error, (byte) 3));
                return;
            case 3:
                gl.d3(new i57((sd3) obj3, tLObject, (TLRPC.InputPeer) obj2, this.b, (int[]) obj, (byte) 11));
                return;
            case 4:
                String str3 = LaunchActivity.C1;
                gl.e3(new i57((LaunchActivity) obj3, tLObject, (Uri) obj, this.b, (hd) obj2, (byte) 15), 2L);
                return;
            case 5:
                hq6 hq6Var = (hq6) obj3;
                String str4 = (String) obj2;
                String str5 = (String) obj;
                if (tLObject != null) {
                    TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) tLObject;
                    if (i != -1 && !tL_emojiKeywordsDifference.lang_code.equals(str4)) {
                        hq6Var.getMessagesStorage().a.c(new wo6(hq6Var, str5, (byte) 0));
                        return;
                    }
                    hq6Var.getMessagesStorage().a.c(new lo6(hq6Var, tL_emojiKeywordsDifference, str5, (byte) 2));
                    gl.d3(new un6(hq6Var, (byte) 10));
                    return;
                }
                gl.d3(new wo6(hq6Var, str5, (byte) 1));
                return;
            case 6:
                na7 na7Var = (na7) obj3;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                int i2 = na7Var.p2;
                int i3 = this.b;
                if (i3 == i2) {
                    String str8 = "proxy_dialog";
                    if (tLObject instanceof TLRPC.TL_help_promoDataEmpty) {
                        na7Var.m2 = ((TLRPC.TL_help_promoDataEmpty) tLObject).expires;
                        gl.d3(new f67(na7Var, (byte) 20));
                        z = true;
                        str = "proxy_dialog";
                        j = 0;
                    } else if (!(tLObject instanceof TLRPC.TL_help_promoData)) {
                        str = "proxy_dialog";
                        j = 0;
                        na7Var.m2 = na7Var.getConnectionsManager().getCurrentTime() + 3600;
                        z = true;
                    } else {
                        TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) tLObject;
                        TLRPC.Peer peer = tL_help_promoData.peer;
                        if (peer == null) {
                            str2 = "proxy_dialog";
                            j3 = 0;
                            j2 = 0;
                        } else {
                            j2 = 0;
                            j3 = peer.user_id;
                            if (j3 != 0) {
                                str2 = "proxy_dialog";
                            } else {
                                long j4 = peer.chat_id;
                                if (j4 == 0) {
                                    str2 = "proxy_dialog";
                                    j3 = -peer.channel_id;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < tL_help_promoData.chats.size()) {
                                            TLRPC.Chat chat = tL_help_promoData.chats.get(i4);
                                            if (chat.id == tL_help_promoData.peer.channel_id) {
                                                if (chat.kicked || chat.restricted) {
                                                    z3 = true;
                                                }
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    z3 = false;
                                } else {
                                    j3 = -j4;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < tL_help_promoData.chats.size()) {
                                            TLRPC.Chat chat2 = tL_help_promoData.chats.get(i5);
                                            str2 = str8;
                                            if (chat2.id == tL_help_promoData.peer.chat_id) {
                                                if (chat2.kicked || chat2.restricted) {
                                                    z2 = true;
                                                }
                                            } else {
                                                i5++;
                                                str8 = str2;
                                            }
                                        } else {
                                            str2 = str8;
                                        }
                                    }
                                    z2 = false;
                                    z3 = z2;
                                }
                            }
                        }
                        na7Var.s2 = j3;
                        if (tL_help_promoData.proxy) {
                            na7Var.t2 = 0;
                        } else if (!TextUtils.isEmpty(tL_help_promoData.psa_type)) {
                            na7Var.t2 = 1;
                            na7Var.v2 = tL_help_promoData.psa_type;
                        } else {
                            na7Var.t2 = 2;
                        }
                        na7Var.w2 = tb4.o(str6, str7);
                        na7Var.u2 = tL_help_promoData.psa_message;
                        na7Var.m2 = tL_help_promoData.expires;
                        SharedPreferences.Editor edit = na7.c1().edit();
                        str = str2;
                        edit.putLong(str, na7Var.s2);
                        edit.putString("proxyDialogAddress", na7Var.w2);
                        edit.putInt("promo_dialog_type", na7Var.t2);
                        String str9 = na7Var.u2;
                        if (str9 != null) {
                            edit.putString("promo_psa_message", str9);
                        } else {
                            edit.remove("promo_psa_message");
                        }
                        String str10 = na7Var.v2;
                        if (str10 != null) {
                            edit.putString("promo_psa_type", str10);
                        } else {
                            edit.remove("promo_psa_type");
                        }
                        edit.putInt("nextPromoInfoCheckTime", na7Var.m2);
                        edit.commit();
                        gl.d3(new t67(na7Var, tL_help_promoData, (byte) 7));
                        if (!z3) {
                            j = j2;
                            gl.d3(new o57(na7Var, j3, tL_help_promoData, i3, (byte) 9));
                        } else {
                            j = j2;
                        }
                        z = z3;
                    }
                    if (z) {
                        na7Var.s2 = j;
                        na7.c1().edit().putLong(str, na7Var.s2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", na7Var.m2).commit();
                        na7Var.o2 = 0;
                        na7Var.n2 = false;
                        gl.d3(new c87(na7Var, (byte) 16));
                        return;
                    }
                    return;
                }
                return;
            case 7:
                kv1 kv1Var = (kv1) obj3;
                d dVar2 = (d) obj;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj2;
                if (tLObject instanceof TLRPC.Updates) {
                    na7.q1(i).Q3((TLRPC.Updates) tLObject, false);
                    gl.d3(kv1Var);
                    return;
                } else if (tL_error != null) {
                    gl.d3(new q76(i, tL_error, dVar2, tL_payments_assignPlayMarketTransaction));
                    return;
                } else {
                    return;
                }
            case 8:
                gl.d3(new i57(tLObject, (boolean[]) obj3, (p8c) obj2, this.b, (TL_account.updateEmojiStatus) obj, (byte) 23));
                return;
            case 9:
                nfa nfaVar = (nfa) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                gl.d3(new wh0((hd[]) obj2, (byte) 10));
                int i6 = this.b;
                if (tL_error == null) {
                    na7.q1(i6).Q3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    gl.d3(new ica(nfaVar, i6, tL_error, tL_messages_editMessage, (byte) 0));
                    return;
                }
            default:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                vt0 vt0Var = (vt0) obj;
                if (tL_error != null && ab4.r(tL_error.text) && obj3 != null) {
                    ab4.n(i).u(new Object[]{tL_messages_getAttachedStickers, vt0Var}, obj3);
                    return;
                } else {
                    vt0Var.run(tLObject, tL_error);
                    return;
                }
        }
    }

    public ae(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public ae(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public ae(LaunchActivity launchActivity, Uri uri, int i, hd hdVar) {
        this.a = (byte) 4;
        this.c = launchActivity;
        this.e = uri;
        this.b = i;
        this.d = hdVar;
    }
}
