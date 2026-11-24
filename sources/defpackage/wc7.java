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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.o;
public final class wc7 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public wc7(ey eyVar, int i, int[] iArr, int[] iArr2) {
        this.a = (byte) 6;
        this.c = eyVar;
        this.b = i;
        this.d = iArr2;
    }

    @Override
    public final void run() {
        int i;
        UndoView undoView = null;
        switch (this.a) {
            case 0:
                cf7 cf7Var = (cf7) this.c;
                int i2 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.d;
                try {
                    long j = message.id;
                    if (k47.a4(message)) {
                        i2 = 5;
                    } else if (k47.c5(message)) {
                        i2 = 9;
                    }
                    SQLiteDatabase sQLiteDatabase = cf7Var.b;
                    if (i2 == 9) {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE welcome_messages SET send_state = 2 WHERE mid = " + j + " AND dialog_id = " + k47.B0(message)).stepThis().dispose();
                        return;
                    } else if (i2 == 5) {
                        Locale locale2 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE quick_replies_messages SET send_state = 2 WHERE mid = " + j + " AND topic_id = " + k47.H1(cf7Var.currentAccount, message)).stepThis().dispose();
                        return;
                    } else if (i2 == 1) {
                        Locale locale3 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE scheduled_messages_v2 SET send_state = 2 WHERE mid = " + j + " AND uid = " + k47.B0(message)).stepThis().dispose();
                        return;
                    } else {
                        Locale locale4 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE messages_v2 SET send_state = 2 WHERE mid = " + j + " AND uid = " + k47.B0(message)).stepThis().dispose();
                        cf7Var.b.executeFast("UPDATE messages_topics SET send_state = 2 WHERE mid = " + j + " AND uid = " + k47.B0(message)).stepThis().dispose();
                        return;
                    }
                } catch (Exception e) {
                    cf7Var.n(e, true);
                    return;
                }
            case 1:
                int i3 = this.b;
                Context context = (Context) this.c;
                my0[] my0VarArr = (my0[]) this.d;
                String str = oc7.r1(i3).l4.Z2.f;
                if (!str.startsWith("http://") && !str.startsWith("https://")) {
                    str = "https://".concat(str);
                }
                l11.u(context, str);
                my0VarArr[0].dismiss();
                return;
            case 2:
                ((int[]) this.c)[0] = this.b;
                ((l97) this.d).run();
                return;
            case 3:
                o oVar = (o) this.c;
                int i4 = this.b;
                HashMap hashMap = new HashMap(oVar.v0[0].c.x);
                ArrayList arrayList = new ArrayList(oVar.v0[0].c.y);
                oVar.X0 = null;
                Utilities.g.c(new i77(oVar, arrayList, hashMap, (String) this.d, i4, (byte) 4));
                return;
            case 4:
                o oVar2 = (o) this.c;
                int i5 = this.b;
                vu vuVar = (vu) this.d;
                if (oVar2.J0 == i5 && oVar2.H0 != 0) {
                    ConnectionsManager.getInstance(oVar2.Y).cancelRequest(oVar2.H0, false);
                    oVar2.H0 = 0;
                }
                if (oVar2.O0 == vuVar) {
                    oVar2.O0 = null;
                    return;
                }
                return;
            case 5:
                int i6 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                oc7.r1(i6).d4(tL_chatInviteJoinResultWebView.users, false);
                br0.b(i6).c(-((TLRPC.Chat) this.d).id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 6:
                ey eyVar = (ey) this.c;
                eyVar.L = this.b;
                eyVar.K = (int[]) this.d;
                eyVar.N.d0();
                return;
            case 7:
                int[] iArr = (int[]) this.c;
                int i7 = this.b;
                jm7[] jm7VarArr = (jm7[]) this.d;
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(i7).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (jm7VarArr[0] != null) {
                    nm7.f(i7).n(jm7VarArr[0], 60);
                    jm7VarArr[0] = null;
                    return;
                }
                return;
            case 8:
                q51 q51Var = (q51) this.c;
                q51Var.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                nm7.f(q51Var.a).k(126, new Object[0]);
                return;
            case 9:
                int i8 = this.b;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.c);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                sic.g(LaunchActivity.H1, i8, tL_inputGroupCallSlug, false, null, null);
                ((my0[]) this.d)[0].dismiss();
                return;
            case 10:
                ((CameraView) this.c).lambda$createCamera$11(this.b, (SurfaceTexture) this.d);
                return;
            case 11:
                ((CameraView) this.c).lambda$createCamera$10((CameraView.CameraGLThread) this.d, this.b);
                return;
            case 12:
                int i9 = this.b;
                pz pzVar = (pz) this.d;
                ((yv1) this.c).A0.x0(0, i9, null);
                if (!gm.E3(pzVar)) {
                    pzVar.clearFocus();
                    pzVar.requestFocus();
                }
                gm.d3(new zo1(pzVar, (byte) 0), 100L);
                return;
            case 13:
                int i10 = this.b;
                k47 messageObject = ((cm1) this.d).getMessageObject();
                yv1 yv1Var = ((cu1) this.c).a.R;
                int e1 = messageObject.e1();
                if (k47.B0(messageObject.k) == yv1Var.d7) {
                    i = 1;
                } else {
                    i = 0;
                }
                yv1Var.J(i10, e1, i, 0, true, true);
                return;
            case 14:
                e32 e32Var = (e32) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i11 = this.b;
                if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                    e32Var.y = tL_webViewResultUrl.query_id;
                    e32Var.n.q(i11, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    gm.c3(e32Var.V);
                    return;
                }
                return;
            case 15:
                goc.M0(this.b, (ylb) this.d, ((c52) this.c).getContext());
                return;
            case 16:
                v72 v72Var = (v72) this.c;
                int i12 = this.b;
                View view = (View) this.d;
                v72Var.W = 0;
                v72Var.V = i12;
                if (view instanceof xib) {
                    v72Var.T((xib) view, true);
                    return;
                } else {
                    v72Var.r.g(v72Var.J0);
                    return;
                }
            case 17:
                n92 n92Var = (n92) this.c;
                gn gnVar = (gn) this.d;
                int i13 = this.b;
                Editable text = n92Var.h.getText();
                int spanStart = text.getSpanStart(gnVar);
                int spanEnd = text.getSpanEnd(gnVar);
                int i14 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    n92Var.h.getText().delete(spanStart, spanEnd);
                    k92 k92Var = n92Var.h;
                    k92Var.setSelection(Math.min(i13 - i14, k92Var.getText().length()));
                    return;
                }
                return;
            case 18:
                int i15 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                nk3 nk3Var = ((nj3) this.c).k0;
                ArrayList arrayList2 = nk3Var.T1;
                if (arrayList2 != null && i15 >= 0 && i15 < arrayList2.size()) {
                    nk3Var.T1.add(i15, dialog);
                    nk3Var.f0[0].b(true);
                    return;
                }
                return;
            case 19:
                lk3 lk3Var = (lk3) this.c;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.d;
                int i16 = this.b;
                mk3 mk3Var = lk3Var.h;
                nk3 nk3Var2 = lk3Var.i;
                nk3Var2.U1 = true;
                nk3Var2.getMessagesController().b(0, i16, dialog2.id);
                nk3Var2.U1 = false;
                ArrayList V0 = nk3Var2.getMessagesController().V0(0);
                int indexOf = V0.indexOf(dialog2);
                if (indexOf >= 0) {
                    ArrayList V02 = nk3Var2.getMessagesController().V0(1);
                    if (!V02.isEmpty() || indexOf != 1) {
                        nk3Var2.U4(true, true);
                        mk3Var.y.D();
                        mk3Var.b(true);
                        nk3Var2.I2();
                    }
                    if (V02.isEmpty()) {
                        V0.remove(0);
                        if (indexOf == 1) {
                            nk3Var2.U4(true, true);
                            mk3Var.b(true);
                            nk3Var2.I2();
                            return;
                        }
                        if (!nk3Var2.T1.isEmpty()) {
                            nk3Var2.T1.remove(0);
                        }
                        mk3Var.y.D();
                        mk3Var.b(true);
                        return;
                    }
                    return;
                }
                mk3Var.b(false);
                return;
            case 20:
                ov9 ov9Var = (ov9) this.c;
                int i17 = this.b;
                String str2 = (String) this.d;
                int i18 = ov9Var.t0;
                ov9Var.r = null;
                if (i17 == ov9Var.e0) {
                    if (ov9Var.n >= 0) {
                        ConnectionsManager.getInstance(i18).cancelRequest(ov9Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 1;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    ov9Var.n = ConnectionsManager.getInstance(i18).sendRequest(tL_channels_searchPosts, new cb7(ov9Var, i17, str2, (byte) 4));
                    return;
                }
                return;
            case 21:
                int i19 = this.b;
                int[] iArr2 = (int[]) this.c;
                ho3 ho3Var = (ho3) this.d;
                nm7 f = nm7.f(i19);
                for (int i20 : iArr2) {
                    f.n(ho3Var, i20);
                }
                return;
            case 22:
                er3 er3Var = (er3) this.c;
                int i21 = this.b;
                ArrayList arrayList3 = er3Var.H;
                TLRPC.Document F0 = ((k47) this.d).F0();
                for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                    TLRPC.Document F02 = ((k47) arrayList3.get(i22)).F0();
                    if (F02 == null || (F0 != null && F02.id == F0.id)) {
                        arrayList3.remove(i22);
                        er3Var.getNotificationCenter().k(309, new Object[0]);
                        if (i21 == 0) {
                            nm7.e().k(297, 1, jb6.a0("MessageNotFound", null, 2131748309, new Object[0]));
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
                vh6 vh6Var = (vh6) this.d;
                int i23 = this.b;
                d dVar = ((py3) this.c).U2.m1;
                if (dVar instanceof yv1) {
                    yv1 yv1Var2 = (yv1) dVar;
                    yv1Var2.i6();
                    undoView = yv1Var2.N3;
                } else if (dVar instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) dVar).M;
                }
                UndoView undoView2 = undoView;
                if (undoView2 != null) {
                    if (vh6Var.m() == 1) {
                        undoView2.m(Integer.valueOf(i23), 53, ((TLRPC.Dialog) vh6Var.n(0)).id);
                        return;
                    } else {
                        undoView2.k(0L, 53, Integer.valueOf(i23), Integer.valueOf(vh6Var.m()), null, null);
                        return;
                    }
                }
                return;
            case 24:
                b24 b24Var = (b24) this.c;
                he[] heVarArr = (he[]) this.d;
                int i24 = this.b;
                he heVar = heVarArr[0];
                if (heVar != null) {
                    heVar.setOnCancelListener(new fu0(b24Var, i24, (byte) 5));
                    heVarArr[0].show();
                    return;
                }
                return;
            case 25:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.c, (String) this.d, this.b);
                return;
            case 26:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.c, (short[]) this.d, this.b);
                return;
            case 27:
                int i25 = this.b;
                d dVar2 = (d) this.c;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i25;
                dVar2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new cb7(dVar2, i25, (qac) this.d, (byte) 7));
                return;
            case 28:
                ((View) this.d).postOnAnimation(new bm3((z14) this.c, this.b, (byte) 9));
                return;
            default:
                int i26 = this.b;
                p35 p35Var = ((o35) this.c).c;
                if (p35Var.c((cwc) this.d, i26)) {
                    p35Var.f("invalid streaming JSON");
                    return;
                }
                return;
        }
    }

    public wc7(int i, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public wc7(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public wc7(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
