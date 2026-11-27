package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.WallpapersListActivity;
public final class yp9 implements RequestDelegate {
    public final byte a;
    public final Object b;

    public yp9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        String G;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                dq9 dq9Var = (dq9) obj;
                int i2 = dq9Var.e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    uc7.s1(i2).j4(groupcall.users, false);
                    uc7.s1(i2).c4(groupcall.chats, false);
                    if (dq9Var.P != null && !dq9Var.w) {
                        while (true) {
                            if (i < groupcall.participants.size()) {
                                if (wf3.n(groupcall.participants.get(i).peer) == dq9Var.b) {
                                    dq9Var.y = groupcall.participants.get(i);
                                } else {
                                    i++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant = dq9Var.y;
                        if (groupCallParticipant != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                            NativeInstance nativeInstance = dq9Var.P;
                            String str = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] J = dq9.J(tL_groupCallParticipantVideo);
                            dq9Var.K(J);
                            nativeInstance.addIncomingVideoOutput(2, str, J, dq9Var.Q, wf3.n(dq9Var.y.peer));
                            hl.c3(new en9(dq9Var, dq9Var.y.video.endpoint, (byte) 5));
                            return;
                        }
                        hl.c3(new xp9(dq9Var, (byte) 2));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                hl.c3(new en9((r1a) obj, tLObject, (byte) 19));
                return;
            case 2:
                hl.c3(new jr9((sha) obj, tL_error, tLObject, (byte) 15));
                return;
            case 3:
                hl.c3(new ida(tLObject, (sh9) obj));
                return;
            case 4:
                hl.c3(new ida((axa) obj, tLObject, (byte) 24));
                return;
            case 5:
                e0b e0bVar = (e0b) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    jf7.Y(e0bVar.m1).g1(new ArrayList(Arrays.asList(e0bVar.F1.k)), true, true, true, 0, false, 0, 0L);
                    return;
                }
                return;
            case 6:
                hl.c3(new x3b((StickersActivity) obj, (byte) 1));
                return;
            case 7:
                hl.c3(new pwa((s4b) obj, tL_error, tLObject, (byte) 5));
                return;
            case 8:
                hl.c3(new z3b((wv1) obj, tL_error, (byte) 2));
                return;
            case 9:
                hl.c3(new uoa((i9b) obj, (byte) 22));
                return;
            case 10:
                hl.c3(new z3b((p5b) obj, tLObject, (byte) 3));
                return;
            case 11:
                hl.c3(new z3b((q5b) obj, tLObject, (byte) 5));
                return;
            case 12:
                hl.c3(new z3b((c8b) obj, tLObject, (byte) 21));
                return;
            case 13:
                hl.c3(new z3b((r8b) obj, tLObject, (byte) 22));
                return;
            case 14:
                axb axbVar = (axb) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < tL_messages_inactiveChats.chats.size(); i3++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i3);
                        int currentTime = (axbVar.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i3).intValue()) / 86400;
                        if (currentTime < 30) {
                            G = ob6.G(currentTime, "Days", new Object[0]);
                        } else if (currentTime < 365) {
                            G = ob6.G(currentTime / 30, "Months", new Object[0]);
                        } else {
                            G = ob6.G(currentTime / 365, "Years", new Object[0]);
                        }
                        if (xc2.n0(chat)) {
                            arrayList.add(ob6.a0("InactiveChatSignature", null, 2131748965, ob6.G(chat.participants_count, "Members", new Object[0]), G));
                        } else if (xc2.T(chat)) {
                            arrayList.add(ob6.a0("InactiveChannelSignature", null, 2131748966, G));
                        } else {
                            arrayList.add(ob6.a0("InactiveChatSignature", null, 2131748965, ob6.G(chat.participants_count, "Members", new Object[0]), G));
                        }
                    }
                    hl.c3(new pwa(axbVar, arrayList, tL_messages_inactiveChats, (byte) 26));
                    return;
                }
                return;
            case 15:
                qyb qybVar = (qyb) obj;
                if (tLObject != null) {
                    qybVar.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    qybVar.getClass();
                    return;
                }
            case 16:
                l1c l1cVar = (l1c) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    uc7.s1(l1cVar.e).Y3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        hl.d3(new bcb(l1cVar, updates, (byte) 18), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                hl.c3(new bcb((r3c) obj, tLObject, (byte) 21));
                return;
            case 18:
                c6c c6cVar = (c6c) obj;
                c6cVar.getClass();
                hl.c3(new b6c(c6cVar, tL_error, tLObject, (byte) 0));
                return;
            case 19:
                int i4 = UndoView.j0;
                hl.c3(new bcb((UndoView) obj, tLObject, (byte) 29));
                return;
            case 20:
                yac yacVar = (yac) obj;
                yacVar.getClass();
                hl.c3(new g9c(yacVar, tLObject, (byte) 1));
                return;
            case 21:
                cbc cbcVar = (cbc) obj;
                cbcVar.getClass();
                hl.c3(new g9c(cbcVar, tLObject, (byte) 2));
                return;
            case 22:
                hl.c3(new g9c((sbc) obj, tLObject, (byte) 3));
                return;
            case 23:
                ((VideoAds) obj).lambda$load$1(tLObject, tL_error);
                return;
            case 24:
                VoIPService.lambda$updateServerConfig$104((SharedPreferences) obj, tLObject, tL_error);
                return;
            case 25:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.getClass();
                hl.c3(new olc(wallpapersListActivity, (byte) 17));
                return;
            case 26:
                cwc cwcVar = (cwc) obj;
                if (tLObject != null) {
                    hl.c3(new vlc(cwcVar, tLObject, (byte) 27));
                    return;
                }
                return;
            case 27:
                hl.c3(new cxc((pxc) obj, (Object) tLObject, (byte) 2));
                return;
            default:
                hl.c3(new cxc(tLObject, (j0d) obj, (byte) 13));
                return;
        }
    }
}
