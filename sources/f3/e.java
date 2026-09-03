package f3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import g5.l;
import g5.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import ng.w;
import oh.e1;
import oh.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.j5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.w21;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ay;
import org.telegram.ui.cf1;
import org.telegram.ui.py;
import org.telegram.ui.u60;
import org.telegram.ui.wc0;
import org.telegram.ui.xn;
import org.telegram.ui.ze1;
import qh.p7;
import qh.w7;
import uf.n;
import uf.y;
public final class e implements f, RequestDelegateTimestamp, ImageReceiver.ImageReceiverDelegate, y4, wc0, MessagesStorage.BooleanCallback, l, c2, u60, MessagesStorage.StringCallback {
    public final int f5976a;
    public final long f5977b;
    public final Object f5978c;

    public e(long j10, y2.i iVar) {
        this.f5976a = 0;
        this.f5977b = j10;
        this.f5978c = iVar;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        boolean G1;
        mi miVar = (mi) this.f5978c;
        ei eiVar = miVar.f29118v0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.f29072g0;
        long j10 = this.f5977b;
        if (eiVar != chatAttachAlertPhotoLayout && eiVar != miVar.f29092n0) {
            if (!eiVar.H(i10, z4, i11, miVar.s1(), j10)) {
                miVar.f29128x2 = true;
                miVar.dismiss();
            }
            G1 = false;
        } else {
            G1 = miVar.G1(i10, z4, i11, miVar.s1(), j10);
        }
        cf cfVar = miVar.f29065e0;
        if (cfVar != null) {
            cfVar.h(!G1);
            miVar.f29065e0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        y2.i iVar = (y2.i) this.f5978c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f5977b));
        String str = iVar.f50730a;
        v2.d dVar = iVar.f50732c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(i3.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f50730a);
            contentValues.put("priority", Integer.valueOf(i3.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public m createDataSource() {
        return new e71(((j71) this.f5978c).h.createDataSource(), this.f5977b);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        int i12 = this.f5976a;
        Object obj = this.f5978c;
        switch (i12) {
            case 4:
                float[] fArr = FragmentContextView.J0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f5977b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.f34134y1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f5977b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        w wVar = (w) this.f5978c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z4 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            wVar.onComplete(new Pair(Long.valueOf(this.f5977b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        cf1 cf1Var = (cf1) this.f5978c;
        p2 p2Var = cf1Var.f35788b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = p2Var.getMessagesController();
            ag.f fVar = new ag.f(23);
            long j10 = this.f5977b;
            messagesController.addUserToChat(j10, (TLRPC.User) arrayList.get(i11), i10, null, p2Var, false, fVar, null, new ze1(cf1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f5976a) {
            case 7:
                wn0 wn0Var = ((py) this.f5978c).f40276z0.V;
                a0.h hVar = wn0Var.f48812u0;
                long j10 = this.f5977b;
                y yVar = (y) hVar.f(j10);
                if (yVar != null) {
                    wn0Var.f48812u0.l(j10);
                    wn0Var.f48806q0.remove(yVar);
                    wn0Var.f48810s0.remove(yVar);
                    wn0Var.f48808r0.remove(yVar);
                    wn0Var.l();
                    MessagesStorage.getInstance(wn0Var.f48805p0).getStorageQueue().postRunnable(new n(wn0Var, j10, 0));
                    return;
                }
                return;
            default:
                ((ay) this.f5978c).f35273a.getMediaDataController().removePeer(this.f5977b);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        e1 e1Var = (e1) this.f5978c;
        if (tL_error == null) {
            if (e1Var.B == null || e1Var.f17012w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new z0(e1Var, 5));
            }
            if (e1Var.D == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                e1Var.D = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(e1Var.f17007e).getPeer(e1Var.f17005b);
                e1Var.D.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                e1Var.D.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = e1Var.D;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = e1Var.B;
                NativeInstance.SsrcGroup[] d = e1.d(tL_groupCallParticipantVideo);
                e1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, e1Var.E, DialogObject.getPeerDialogId(e1Var.D.peer));
            }
        }
        NativeInstance nativeInstance2 = e1Var.B;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f5977b, r0);
        }
    }

    public e(Object obj, long j10, int i10) {
        this.f5976a = i10;
        this.f5978c = obj;
        this.f5977b = j10;
    }

    @Override
    public void run(String str) {
        w7 w7Var = (w7) this.f5978c;
        w7Var.T.i1().r(this.f5977b, str, new p7(w7Var, 2));
    }

    @Override
    public void run(boolean z4) {
        xn xnVar = ((w21) this.f5978c).h;
        if (e2.c.s(xnVar)) {
            xnVar.qa(this.f5977b, false);
        }
    }

    @Override
    public void h(TLRPC.User user) {
    }
}
