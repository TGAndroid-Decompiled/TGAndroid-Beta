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
public final class va7 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public va7(dx dxVar, int i, int[] iArr, int[] iArr2) {
        this.a = (byte) 6;
        this.c = dxVar;
        this.b = i;
        this.d = iArr2;
    }

    @Override
    public final void run() {
        int i;
        UndoView undoView = null;
        switch (this.a) {
            case 0:
                ad7 ad7Var = (ad7) this.c;
                int i2 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.d;
                try {
                    long j = message.id;
                    if (k27.a4(message)) {
                        i2 = 5;
                    } else if (k27.c5(message)) {
                        i2 = 9;
                    }
                    SQLiteDatabase sQLiteDatabase = ad7Var.b;
                    if (i2 == 9) {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE welcome_messages SET send_state = 2 WHERE mid = " + j + " AND dialog_id = " + k27.B0(message)).stepThis().dispose();
                        return;
                    } else if (i2 == 5) {
                        Locale locale2 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE quick_replies_messages SET send_state = 2 WHERE mid = " + j + " AND topic_id = " + k27.H1(ad7Var.currentAccount, message)).stepThis().dispose();
                        return;
                    } else if (i2 == 1) {
                        Locale locale3 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE scheduled_messages_v2 SET send_state = 2 WHERE mid = " + j + " AND uid = " + k27.B0(message)).stepThis().dispose();
                        return;
                    } else {
                        Locale locale4 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE messages_v2 SET send_state = 2 WHERE mid = " + j + " AND uid = " + k27.B0(message)).stepThis().dispose();
                        ad7Var.b.executeFast("UPDATE messages_topics SET send_state = 2 WHERE mid = " + j + " AND uid = " + k27.B0(message)).stepThis().dispose();
                        return;
                    }
                } catch (Exception e) {
                    ad7Var.n(e, true);
                    return;
                }
            case 1:
                int i3 = this.b;
                Context context = (Context) this.c;
                fx0[] fx0VarArr = (fx0[]) this.d;
                String str = na7.q1(i3).k4.Z2.f;
                if (!str.startsWith("http://") && !str.startsWith("https://")) {
                    str = "https://".concat(str);
                }
                d01.t(context, str);
                fx0VarArr[0].dismiss();
                return;
            case 2:
                ((int[]) this.c)[0] = this.b;
                ((s67) this.d).run();
                return;
            case 3:
                o oVar = (o) this.c;
                int i4 = this.b;
                HashMap hashMap = new HashMap(oVar.v0[0].c.x);
                ArrayList arrayList = new ArrayList(oVar.v0[0].c.y);
                oVar.X0 = null;
                Utilities.g.c(new i57(oVar, arrayList, hashMap, (String) this.d, i4, (byte) 4));
                return;
            case 4:
                o oVar2 = (o) this.c;
                int i5 = this.b;
                vt vtVar = (vt) this.d;
                if (oVar2.J0 == i5 && oVar2.H0 != 0) {
                    ConnectionsManager.getInstance(oVar2.Y).cancelRequest(oVar2.H0, false);
                    oVar2.H0 = 0;
                }
                if (oVar2.O0 == vtVar) {
                    oVar2.O0 = null;
                    return;
                }
                return;
            case 5:
                int i6 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                na7.q1(i6).a4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(i6).c(-((TLRPC.Chat) this.d).id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 6:
                dx dxVar = (dx) this.c;
                dxVar.L = this.b;
                dxVar.K = (int[]) this.d;
                dxVar.N.d0();
                return;
            case 7:
                int[] iArr = (int[]) this.c;
                int i7 = this.b;
                gk7[] gk7VarArr = (gk7[]) this.d;
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(i7).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (gk7VarArr[0] != null) {
                    kk7.f(i7).n(gk7VarArr[0], 59);
                    gk7VarArr[0] = null;
                    return;
                }
                return;
            case 8:
                j41 j41Var = (j41) this.c;
                j41Var.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                kk7.f(j41Var.a).k(125, new Object[0]);
                return;
            case 9:
                int i8 = this.b;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.c);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                rgc.g(LaunchActivity.H1, i8, tL_inputGroupCallSlug, false, null, null);
                ((fx0[]) this.d)[0].dismiss();
                return;
            case 10:
                ((CameraView) this.c).lambda$createCamera$11(this.b, (SurfaceTexture) this.d);
                return;
            case 11:
                ((CameraView) this.c).lambda$createCamera$10((CameraView.CameraGLThread) this.d, this.b);
                return;
            case 12:
                int i9 = this.b;
                py pyVar = (py) this.d;
                ((mu1) this.c).A0.x0(0, i9, null);
                if (!gl.F3(pyVar)) {
                    pyVar.clearFocus();
                    pyVar.requestFocus();
                }
                gl.e3(new qn1(pyVar, (byte) 0), 100L);
                return;
            case 13:
                int i10 = this.b;
                k27 messageObject = ((uk1) this.d).getMessageObject();
                mu1 mu1Var = ((qs1) this.c).a.R;
                int e1 = messageObject.e1();
                if (k27.B0(messageObject.k) == mu1Var.d7) {
                    i = 1;
                } else {
                    i = 0;
                }
                mu1Var.J(i10, e1, i, 0, true, true);
                return;
            case 14:
                s12 s12Var = (s12) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i11 = this.b;
                if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                    s12Var.y = tL_webViewResultUrl.query_id;
                    s12Var.n.q(i11, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    gl.d3(s12Var.V);
                    return;
                }
                return;
            case 15:
                hmc.L0(this.b, (wjb) this.d, ((r32) this.c).getContext());
                return;
            case 16:
                k62 k62Var = (k62) this.c;
                int i12 = this.b;
                View view = (View) this.d;
                k62Var.W = 0;
                k62Var.V = i12;
                if (view instanceof wgb) {
                    k62Var.U((wgb) view, true);
                    return;
                } else {
                    k62Var.r.g(k62Var.J0);
                    return;
                }
            case 17:
                c82 c82Var = (c82) this.c;
                gm gmVar = (gm) this.d;
                int i13 = this.b;
                Editable text = c82Var.h.getText();
                int spanStart = text.getSpanStart(gmVar);
                int spanEnd = text.getSpanEnd(gmVar);
                int i14 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    c82Var.h.getText().delete(spanStart, spanEnd);
                    z72 z72Var = c82Var.h;
                    z72Var.setSelection(Math.min(i13 - i14, z72Var.getText().length()));
                    return;
                }
                return;
            case 18:
                int i15 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                cj3 cj3Var = ((bi3) this.c).k0;
                ArrayList arrayList2 = cj3Var.T1;
                if (arrayList2 != null && i15 >= 0 && i15 < arrayList2.size()) {
                    cj3Var.T1.add(i15, dialog);
                    cj3Var.f0[0].b(true);
                    return;
                }
                return;
            case 19:
                aj3 aj3Var = (aj3) this.c;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.d;
                int i16 = this.b;
                bj3 bj3Var = aj3Var.h;
                cj3 cj3Var2 = aj3Var.i;
                cj3Var2.U1 = true;
                cj3Var2.getMessagesController().b(0, i16, dialog2.id);
                cj3Var2.U1 = false;
                ArrayList U0 = cj3Var2.getMessagesController().U0(0);
                int indexOf = U0.indexOf(dialog2);
                if (indexOf >= 0) {
                    ArrayList U02 = cj3Var2.getMessagesController().U0(1);
                    if (!U02.isEmpty() || indexOf != 1) {
                        cj3Var2.Q4(true, true);
                        bj3Var.y.D();
                        bj3Var.b(true);
                        cj3Var2.G2();
                    }
                    if (U02.isEmpty()) {
                        U0.remove(0);
                        if (indexOf == 1) {
                            cj3Var2.Q4(true, true);
                            bj3Var.b(true);
                            cj3Var2.G2();
                            return;
                        }
                        if (!cj3Var2.T1.isEmpty()) {
                            cj3Var2.T1.remove(0);
                        }
                        bj3Var.y.D();
                        bj3Var.b(true);
                        return;
                    }
                    return;
                }
                bj3Var.b(false);
                return;
            case 20:
                mt9 mt9Var = (mt9) this.c;
                int i17 = this.b;
                String str2 = (String) this.d;
                int i18 = mt9Var.t0;
                mt9Var.r = null;
                if (i17 == mt9Var.e0) {
                    if (mt9Var.n >= 0) {
                        ConnectionsManager.getInstance(i18).cancelRequest(mt9Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 1;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    mt9Var.n = ConnectionsManager.getInstance(i18).sendRequest(tL_channels_searchPosts, new b97(mt9Var, i17, str2, (byte) 4));
                    return;
                }
                return;
            case 21:
                int i19 = this.b;
                int[] iArr2 = (int[]) this.c;
                xm3 xm3Var = (xm3) this.d;
                kk7 f = kk7.f(i19);
                for (int i20 : iArr2) {
                    f.n(xm3Var, i20);
                }
                return;
            case 22:
                up3 up3Var = (up3) this.c;
                int i21 = this.b;
                ArrayList arrayList3 = up3Var.H;
                TLRPC.Document F0 = ((k27) this.d).F0();
                for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                    TLRPC.Document F02 = ((k27) arrayList3.get(i22)).F0();
                    if (F02 == null || (F0 != null && F02.id == F0.id)) {
                        arrayList3.remove(i22);
                        up3Var.getNotificationCenter().k(307, new Object[0]);
                        if (i21 == 0) {
                            kk7.e().k(295, 1, k96.a0("MessageNotFound", null, 2131748360, new Object[0]));
                            return;
                        } else if (i21 == -1) {
                            LaunchActivity.E(2);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                return;
            case 23:
                vf6 vf6Var = (vf6) this.d;
                int i23 = this.b;
                d dVar = ((ex3) this.c).U2.m1;
                if (dVar instanceof mu1) {
                    mu1 mu1Var2 = (mu1) dVar;
                    mu1Var2.Z5();
                    undoView = mu1Var2.N3;
                } else if (dVar instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) dVar).M;
                }
                UndoView undoView2 = undoView;
                if (undoView2 != null) {
                    if (vf6Var.m() == 1) {
                        undoView2.m(Integer.valueOf(i23), 53, ((TLRPC.Dialog) vf6Var.n(0)).id);
                        return;
                    } else {
                        undoView2.k(0L, 53, Integer.valueOf(i23), Integer.valueOf(vf6Var.m()), null, null);
                        return;
                    }
                }
                return;
            case 24:
                q04 q04Var = (q04) this.c;
                hd[] hdVarArr = (hd[]) this.d;
                int i24 = this.b;
                hd hdVar = hdVarArr[0];
                if (hdVar != null) {
                    hdVar.setOnCancelListener(new xs0(q04Var, i24, (byte) 5));
                    hdVarArr[0].show();
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
                dVar2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new b97(dVar2, i25, (p8c) this.d, (byte) 6));
                return;
            case 28:
                ((View) this.d).postOnAnimation(new sm3((o04) this.c, this.b, (byte) 7));
                return;
            default:
                int i26 = this.b;
                p15 p15Var = ((o15) this.c).c;
                if (p15Var.c((buc) this.d, i26)) {
                    p15Var.f("invalid streaming JSON");
                    return;
                }
                return;
        }
    }

    public va7(int i, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public va7(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public va7(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
