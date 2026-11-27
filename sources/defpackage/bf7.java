package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.o;
public final class bf7 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public bf7(ex exVar, int i, int[] iArr, int[] iArr2) {
        this.a = (byte) 6;
        this.c = exVar;
        this.b = i;
        this.d = iArr2;
    }

    @Override
    public final void run() {
        int i;
        UndoView undoView = null;
        switch (this.a) {
            case 0:
                kf7 kf7Var = (kf7) this.c;
                int i2 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.d;
                try {
                    long j = message.id;
                    if (r47.a4(message)) {
                        i2 = 5;
                    } else if (r47.c5(message)) {
                        i2 = 9;
                    }
                    SQLiteDatabase sQLiteDatabase = kf7Var.b;
                    if (i2 == 9) {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE welcome_messages SET send_state = 2 WHERE mid = " + j + " AND dialog_id = " + r47.B0(message)).stepThis().dispose();
                        return;
                    } else if (i2 == 5) {
                        Locale locale2 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE quick_replies_messages SET send_state = 2 WHERE mid = " + j + " AND topic_id = " + r47.H1(kf7Var.currentAccount, message)).stepThis().dispose();
                        return;
                    } else if (i2 == 1) {
                        Locale locale3 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE scheduled_messages_v2 SET send_state = 2 WHERE mid = " + j + " AND uid = " + r47.B0(message)).stepThis().dispose();
                        return;
                    } else {
                        Locale locale4 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE messages_v2 SET send_state = 2 WHERE mid = " + j + " AND uid = " + r47.B0(message)).stepThis().dispose();
                        kf7Var.b.executeFast("UPDATE messages_topics SET send_state = 2 WHERE mid = " + j + " AND uid = " + r47.B0(message)).stepThis().dispose();
                        return;
                    }
                } catch (Exception e) {
                    kf7Var.p(e, true);
                    return;
                }
            case 1:
                int i3 = this.b;
                Context context = (Context) this.c;
                nx0[] nx0VarArr = (nx0[]) this.d;
                String str = uc7.s1(i3).l4.h3.f;
                if (!str.startsWith("http://") && !str.startsWith("https://")) {
                    str = "https://".concat(str);
                }
                m01.u(context, str);
                nx0VarArr[0].dismiss();
                return;
            case 2:
                ((int[]) this.c)[0] = this.b;
                ((o97) this.d).run();
                return;
            case 3:
                o oVar = (o) this.c;
                int i4 = this.b;
                HashMap hashMap = new HashMap(oVar.v0[0].c.x);
                ArrayList arrayList = new ArrayList(oVar.v0[0].c.y);
                oVar.X0 = null;
                Utilities.g.c(new l77(oVar, arrayList, hashMap, (String) this.d, i4, (byte) 4));
                return;
            case 4:
                int i5 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                uc7.s1(i5).j4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(i5).c(-((TLRPC.Chat) this.d).id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 5:
                o oVar2 = (o) this.c;
                int i6 = this.b;
                wt wtVar = (wt) this.d;
                if (oVar2.J0 == i6 && oVar2.H0 != 0) {
                    ConnectionsManager.getInstance(oVar2.Y).cancelRequest(oVar2.H0, false);
                    oVar2.H0 = 0;
                }
                if (oVar2.O0 == wtVar) {
                    oVar2.O0 = null;
                    return;
                }
                return;
            case 6:
                ex exVar = (ex) this.c;
                exVar.L = this.b;
                exVar.K = (int[]) this.d;
                exVar.N.d0();
                return;
            case 7:
                int[] iArr = (int[]) this.c;
                int i7 = this.b;
                fn7[] fn7VarArr = (fn7[]) this.d;
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(i7).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (fn7VarArr[0] != null) {
                    jn7.f(i7).n(fn7VarArr[0], 60);
                    fn7VarArr[0] = null;
                    return;
                }
                return;
            case 8:
                r41 r41Var = (r41) this.c;
                r41Var.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                jn7.f(r41Var.a).k(126, new Object[0]);
                return;
            case 9:
                int i8 = this.b;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.c);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                xkc.g(LaunchActivity.H1, i8, tL_inputGroupCallSlug, false, null, null);
                ((nx0[]) this.d)[0].dismiss();
                return;
            case 10:
                ((CameraView) this.c).lambda$createCamera$11(this.b, (SurfaceTexture) this.d);
                return;
            case 11:
                ((CameraView) this.c).lambda$createCamera$10((CameraView.CameraGLThread) this.d, this.b);
                return;
            case 12:
                int i9 = this.b;
                qy qyVar = (qy) this.d;
                ((zu1) this.c).A0.y0(0, i9, null);
                if (!hl.E3(qyVar)) {
                    qyVar.clearFocus();
                    qyVar.requestFocus();
                }
                hl.d3(new lo1(qyVar, (byte) 0), 100L);
                return;
            case 13:
                int i10 = this.b;
                r47 messageObject = ((dl1) this.d).getMessageObject();
                zu1 zu1Var = ((dt1) this.c).a.R;
                int e1 = messageObject.e1();
                if (r47.B0(messageObject.k) == zu1Var.d7) {
                    i = 1;
                } else {
                    i = 0;
                }
                zu1Var.J(i10, e1, i, 0, true, true);
                return;
            case 14:
                j22 j22Var = (j22) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i11 = this.b;
                if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                    j22Var.y = tL_webViewResultUrl.query_id;
                    j22Var.n.q(i11, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    hl.c3(j22Var.V);
                    return;
                }
                return;
            case 15:
                uqc.L0(this.b, (vnb) this.d, ((h42) this.c).getContext());
                return;
            case 16:
                a72 a72Var = (a72) this.c;
                int i12 = this.b;
                View view = (View) this.d;
                a72Var.W = 0;
                a72Var.V = i12;
                if (view instanceof skb) {
                    a72Var.T((skb) view, true);
                    return;
                } else {
                    a72Var.r.g(a72Var.J0);
                    return;
                }
            case 17:
                t82 t82Var = (t82) this.c;
                hm hmVar = (hm) this.d;
                int i13 = this.b;
                Editable text = t82Var.h.getText();
                int spanStart = text.getSpanStart(hmVar);
                int spanEnd = text.getSpanEnd(hmVar);
                int i14 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    t82Var.h.getText().delete(spanStart, spanEnd);
                    q82 q82Var = t82Var.h;
                    q82Var.setSelection(Math.min(i13 - i14, q82Var.getText().length()));
                    return;
                }
                return;
            case 18:
                int i15 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                uj3 uj3Var = ((vi3) this.c).k0;
                ArrayList arrayList2 = uj3Var.T1;
                if (arrayList2 != null && i15 >= 0 && i15 < arrayList2.size()) {
                    uj3Var.T1.add(i15, dialog);
                    uj3Var.f0[0].b(true);
                    return;
                }
                return;
            case 19:
                sj3 sj3Var = (sj3) this.c;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.d;
                int i16 = this.b;
                tj3 tj3Var = sj3Var.h;
                uj3 uj3Var2 = sj3Var.i;
                uj3Var2.U1 = true;
                uj3Var2.getMessagesController().b(0, i16, dialog2.id);
                uj3Var2.U1 = false;
                ArrayList W0 = uj3Var2.getMessagesController().W0(0);
                int indexOf = W0.indexOf(dialog2);
                if (indexOf >= 0) {
                    ArrayList W02 = uj3Var2.getMessagesController().W0(1);
                    if (!W02.isEmpty() || indexOf != 1) {
                        uj3Var2.U4(true, true);
                        tj3Var.y.D();
                        tj3Var.b(true);
                        uj3Var2.I2();
                    }
                    if (W02.isEmpty()) {
                        W0.remove(0);
                        if (indexOf == 1) {
                            uj3Var2.U4(true, true);
                            tj3Var.b(true);
                            uj3Var2.I2();
                            return;
                        }
                        if (!uj3Var2.T1.isEmpty()) {
                            uj3Var2.T1.remove(0);
                        }
                        tj3Var.y.D();
                        tj3Var.b(true);
                        return;
                    }
                    return;
                }
                tj3Var.b(false);
                return;
            case 20:
                gx9 gx9Var = (gx9) this.c;
                int i17 = this.b;
                String str2 = (String) this.d;
                int i18 = gx9Var.t0;
                gx9Var.r = null;
                if (i17 == gx9Var.e0) {
                    if (gx9Var.n >= 0) {
                        ConnectionsManager.getInstance(i18).cancelRequest(gx9Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 1;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    gx9Var.n = ConnectionsManager.getInstance(i18).sendRequest(tL_channels_searchPosts, new hb7(gx9Var, i17, str2, (byte) 4));
                    return;
                }
                return;
            case 21:
                int i19 = this.b;
                int[] iArr2 = (int[]) this.c;
                on3 on3Var = (on3) this.d;
                jn7 f = jn7.f(i19);
                for (int i20 : iArr2) {
                    f.n(on3Var, i20);
                }
                return;
            case 22:
                lq3 lq3Var = (lq3) this.c;
                int i21 = this.b;
                ArrayList arrayList3 = lq3Var.H;
                TLRPC.Document F0 = ((r47) this.d).F0();
                for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                    TLRPC.Document F02 = ((r47) arrayList3.get(i22)).F0();
                    if (F02 == null || (F0 != null && F02.id == F0.id)) {
                        arrayList3.remove(i22);
                        lq3Var.getNotificationCenter().k(308, new Object[0]);
                        if (i21 == 0) {
                            jn7.e().k(296, 1, ob6.a0("MessageNotFound", null, 2131748306, new Object[0]));
                            return;
                        } else if (i21 == -1) {
                            LaunchActivity.F(2);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                return;
            case 23:
                zh6 zh6Var = (zh6) this.d;
                int i23 = this.b;
                e eVar = ((ay3) this.c).U2.m1;
                if (eVar instanceof zu1) {
                    zu1 zu1Var2 = (zu1) eVar;
                    zu1Var2.i6();
                    undoView = zu1Var2.N3;
                } else if (eVar instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) eVar).M;
                }
                UndoView undoView2 = undoView;
                if (undoView2 != null) {
                    if (zh6Var.m() == 1) {
                        undoView2.m(((TLRPC.Dialog) zh6Var.n(0)).id, Integer.valueOf(i23), 53);
                        return;
                    } else {
                        undoView2.k(0L, 53, Integer.valueOf(i23), Integer.valueOf(zh6Var.m()), null, null);
                        return;
                    }
                }
                return;
            case 24:
                l14 l14Var = (l14) this.c;
                id[] idVarArr = (id[]) this.d;
                int i24 = this.b;
                id idVar = idVarArr[0];
                if (idVar != null) {
                    idVar.setOnCancelListener(new gt0(l14Var, i24, (byte) 5));
                    idVarArr[0].show();
                    return;
                }
                return;
            case 25:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.c, (String) this.d, this.b);
                return;
            case 26:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.c, (short[]) this.d, this.b);
                return;
            case 27:
                int i25 = this.b;
                e eVar2 = (e) this.c;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i25;
                eVar2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new hb7(eVar2, i25, (pcc) this.d, (byte) 7));
                return;
            case 28:
                ((View) this.d).postOnAnimation(new hl3((j14) this.c, this.b, (byte) 9));
                return;
            default:
                int i26 = this.b;
                t35 t35Var = ((s35) this.c).c;
                if (t35Var.c((ryc) this.d, i26)) {
                    t35Var.f("invalid streaming JSON");
                    return;
                }
                return;
        }
    }

    public bf7(int i, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public bf7(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public bf7(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
