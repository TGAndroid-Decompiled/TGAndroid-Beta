package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.WallpapersListActivity;
public final class wx9 implements RequestDelegate {
    public final byte a;
    public final Object b;

    public wx9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gl.c3(new tj9((yx9) obj, tLObject, (byte) 20));
                return;
            case 1:
                gl.c3(new q3a((Object) ((bea) obj), tL_error, tLObject, (byte) 6));
                return;
            case 2:
                gl.c3(new t7a(tLObject, (ae9) obj, (byte) 25));
                return;
            case 3:
                gl.c3(new t7a((xsa) obj, tLObject, (byte) 27));
                return;
            case 4:
                bwa bwaVar = (bwa) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    ad7.Y(bwaVar.m1).g1(new ArrayList(Arrays.asList(bwaVar.F1.k)), true, true, true, 0, false, 0, 0L);
                    return;
                }
                return;
            case 5:
                gl.c3(new a0b((StickersActivity) obj, (byte) 1));
                return;
            case 6:
                gl.c3(new q3a((Object) ((u0b) obj), tL_error, tLObject, (byte) 25));
                return;
            case 7:
                gl.c3(new iya((gv1) obj, tL_error, (byte) 5));
                return;
            case 8:
                gl.c3(new kya((l5b) obj, (byte) 5));
                return;
            case 9:
                gl.c3(new iya((t1b) obj, tLObject, (byte) 6));
                return;
            case 10:
                gl.c3(new iya((u1b) obj, tLObject, (byte) 8));
                return;
            case 11:
                gl.c3(new iya((f4b) obj, tLObject, (byte) 24));
                return;
            case 12:
                gl.c3(new iya((t4b) obj, tLObject, (byte) 25));
                return;
            case 13:
                zsb zsbVar = (zsb) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < tL_messages_inactiveChats.chats.size(); i++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i);
                        int currentTime = (zsbVar.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                        if (currentTime < 30) {
                            G = k96.G(currentTime, "Days", new Object[0]);
                        } else if (currentTime < 365) {
                            G = k96.G(currentTime / 30, "Months", new Object[0]);
                        } else {
                            G = k96.G(currentTime / 365, "Years", new Object[0]);
                        }
                        if (hc2.n0(chat)) {
                            arrayList.add(k96.a0("InactiveChatSignature", null, 2131749019, k96.G(chat.participants_count, "Members", new Object[0]), G));
                        } else if (hc2.T(chat)) {
                            arrayList.add(k96.a0("InactiveChannelSignature", null, 2131749020, G));
                        } else {
                            arrayList.add(k96.a0("InactiveChatSignature", null, 2131749019, k96.G(chat.participants_count, "Members", new Object[0]), G));
                        }
                    }
                    gl.c3(new r1b(zsbVar, arrayList, tL_messages_inactiveChats, (byte) 17));
                    return;
                }
                return;
            case 14:
                pub pubVar = (pub) obj;
                if (tLObject != null) {
                    pubVar.getMessagesController().R3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    pubVar.getClass();
                    return;
                }
            case 15:
                kxb kxbVar = (kxb) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    na7.q1(kxbVar.e).R3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        gl.d3(new a5b(kxbVar, updates, (byte) 21), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                gl.c3(new a5b((rzb) obj, tLObject, (byte) 24));
                return;
            case 17:
                c2c c2cVar = (c2c) obj;
                c2cVar.getClass();
                gl.c3(new r1b(c2cVar, tL_error, tLObject, (byte) 21));
                return;
            case 18:
                int i2 = UndoView.j0;
                gl.c3(new l3c((UndoView) obj, tLObject, (byte) 2));
                return;
            case 19:
                y6c y6cVar = (y6c) obj;
                y6cVar.getClass();
                gl.c3(new l3c(y6cVar, tLObject, (byte) 4));
                return;
            case 20:
                c7c c7cVar = (c7c) obj;
                c7cVar.getClass();
                gl.c3(new l3c(c7cVar, tLObject, (byte) 5));
                return;
            case 21:
                gl.c3(new l3c((s7c) obj, tLObject, (byte) 6));
                return;
            case 22:
                ((VideoAds) obj).lambda$load$1(tLObject, tL_error);
                return;
            case 23:
                VoIPService.lambda$updateServerConfig$103((SharedPreferences) obj, tLObject, tL_error);
                return;
            case 24:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.getClass();
                gl.c3(new frc(wallpapersListActivity, (byte) 0));
                return;
            case 25:
                orc orcVar = (orc) obj;
                if (tLObject != null) {
                    gl.c3(new mhc(orcVar, tLObject, (byte) 28));
                    return;
                }
                return;
            default:
                gl.c3(new isc((atc) obj, (Object) tLObject, (byte) 3));
                return;
        }
    }
}
