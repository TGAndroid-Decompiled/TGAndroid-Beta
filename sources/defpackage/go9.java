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
public final class go9 implements RequestDelegate {
    public final byte a;
    public final Object b;

    public go9(Object obj, byte b) {
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
                oo9 oo9Var = (oo9) obj;
                int i2 = oo9Var.e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    oc7.r1(i2).d4(groupcall.users, false);
                    oc7.r1(i2).X3(groupcall.chats, false);
                    if (oo9Var.P != null && !oo9Var.w) {
                        while (true) {
                            if (i < groupcall.participants.size()) {
                                if (pg3.n(groupcall.participants.get(i).peer) == oo9Var.b) {
                                    oo9Var.y = groupcall.participants.get(i);
                                } else {
                                    i++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant = oo9Var.y;
                        if (groupCallParticipant != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                            NativeInstance nativeInstance = oo9Var.P;
                            String str = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] J = oo9.J(tL_groupCallParticipantVideo);
                            oo9Var.K(J);
                            nativeInstance.addIncomingVideoOutput(2, str, J, oo9Var.Q, pg3.n(oo9Var.y.peer));
                            gm.c3(new il9(oo9Var, oo9Var.y.video.endpoint, (byte) 7));
                            return;
                        }
                        gm.c3(new ho9(oo9Var, (byte) 1));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                gm.c3(new il9((zz9) obj, tLObject, (byte) 22));
                return;
            case 2:
                gm.c3(new hw9((bga) obj, tL_error, tLObject, (byte) 9));
                return;
            case 3:
                gm.c3(new e6a(tLObject, (eg9) obj, (byte) 27));
                return;
            case 4:
                gm.c3(new e6a((ava) obj, tLObject, (byte) 29));
                return;
            case 5:
                eya eyaVar = (eya) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    cf7.Y(eyaVar.m1).g1(new ArrayList(Arrays.asList(eyaVar.F1.k)), true, true, true, 0, false, 0, 0L);
                    return;
                }
                return;
            case 6:
                gm.c3(new b2b((StickersActivity) obj, (byte) 1));
                return;
            case 7:
                gm.c3(new hw9((x2b) obj, tL_error, tLObject, (byte) 28));
                return;
            case 8:
                gm.c3(new uva((sw1) obj, tL_error, (byte) 7));
                return;
            case 9:
                gm.c3(new nsa((m7b) obj, (byte) 13));
                return;
            case 10:
                gm.c3(new uva((u3b) obj, tLObject, (byte) 8));
                return;
            case 11:
                gm.c3(new uva((v3b) obj, tLObject, (byte) 10));
                return;
            case 12:
                gm.c3(new uva((g6b) obj, tLObject, (byte) 26));
                return;
            case 13:
                gm.c3(new uva((u6b) obj, tLObject, (byte) 27));
                return;
            case 14:
                avb avbVar = (avb) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < tL_messages_inactiveChats.chats.size(); i3++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i3);
                        int currentTime = (avbVar.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i3).intValue()) / 86400;
                        if (currentTime < 30) {
                            G = jb6.G(currentTime, "Days", new Object[0]);
                        } else if (currentTime < 365) {
                            G = jb6.G(currentTime / 30, "Months", new Object[0]);
                        } else {
                            G = jb6.G(currentTime / 365, "Years", new Object[0]);
                        }
                        if (sd2.n0(chat)) {
                            arrayList.add(jb6.a0("InactiveChatSignature", null, 2131748968, jb6.G(chat.participants_count, "Members", new Object[0]), G));
                        } else if (sd2.T(chat)) {
                            arrayList.add(jb6.a0("InactiveChannelSignature", null, 2131748969, G));
                        } else {
                            arrayList.add(jb6.a0("InactiveChatSignature", null, 2131748968, jb6.G(chat.participants_count, "Members", new Object[0]), G));
                        }
                    }
                    gm.c3(new j2b(avbVar, arrayList, tL_messages_inactiveChats, (byte) 20));
                    return;
                }
                return;
            case 15:
                qwb qwbVar = (qwb) obj;
                if (tLObject != null) {
                    qwbVar.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    qwbVar.getClass();
                    return;
                }
            case 16:
                mzb mzbVar = (mzb) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    oc7.r1(mzbVar.e).T3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        gm.d3(new b7b(mzbVar, updates, (byte) 23), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                gm.c3(new b7b((s1c) obj, tLObject, (byte) 26));
                return;
            case 18:
                c4c c4cVar = (c4c) obj;
                c4cVar.getClass();
                gm.c3(new j2b(c4cVar, tL_error, tLObject, (byte) 24));
                return;
            case 19:
                int i4 = UndoView.j0;
                gm.c3(new x4c((UndoView) obj, tLObject, (byte) 4));
                return;
            case 20:
                z8c z8cVar = (z8c) obj;
                z8cVar.getClass();
                gm.c3(new x4c(z8cVar, tLObject, (byte) 6));
                return;
            case 21:
                d9c d9cVar = (d9c) obj;
                d9cVar.getClass();
                gm.c3(new x4c(d9cVar, tLObject, (byte) 7));
                return;
            case 22:
                gm.c3(new x4c((t9c) obj, tLObject, (byte) 8));
                return;
            case 23:
                ((VideoAds) obj).lambda$load$1(tLObject, tL_error);
                return;
            case 24:
                VoIPService.lambda$updateServerConfig$103((SharedPreferences) obj, tLObject, tL_error);
                return;
            case 25:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.getClass();
                gm.c3(new cpc(wallpapersListActivity, (byte) 8));
                return;
            case 26:
                qtc qtcVar = (qtc) obj;
                if (tLObject != null) {
                    gm.c3(new ptc(qtcVar, tLObject, (byte) 0));
                    return;
                }
                return;
            case 27:
                gm.c3(new ptc((bvc) obj, tLObject, (byte) 5));
                return;
            default:
                gm.c3(new ptc(tLObject, (vxc) obj));
                return;
        }
    }
}
