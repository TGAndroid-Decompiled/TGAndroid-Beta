package ai;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.si;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dd0;
import org.telegram.ui.eo;
import org.telegram.ui.hy;
import org.telegram.ui.rf1;
import org.telegram.ui.vy;
import org.telegram.ui.z60;
public final class z1 implements RequestDelegateTimestamp, MessagesStorage.StringCallback, m4.b1, ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.f5, dd0, MessagesStorage.BooleanCallback, g2.g, org.telegram.ui.ActionBar.z1, z60, s5.e {
    public final int f1995a;
    public final long f1996b;
    public final Object f1997c;

    public z1(long j3, l5.i iVar) {
        this.f1995a = 13;
        this.f1996b = j3;
        this.f1997c = iVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean J1;
        aj ajVar = (aj) this.f1997c;
        si siVar = ajVar.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ajVar.f24354j0;
        long j3 = this.f1996b;
        if (siVar != chatAttachAlertPhotoLayout && siVar != ajVar.f24374q0) {
            if (!siVar.K(i10, z10, i11, ajVar.u1(), j3)) {
                ajVar.D2 = true;
                ajVar.dismiss();
            }
            J1 = false;
        } else {
            J1 = ajVar.J1(i10, z10, i11, ajVar.u1(), j3);
        }
        rf rfVar = ajVar.f24348h0;
        if (rfVar != null) {
            rfVar.h(!J1);
            ajVar.f24348h0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.i iVar = (l5.i) this.f1997c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1996b));
        String str = iVar.f15159a;
        i5.d dVar = iVar.f15161c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f15159a);
            contentValues.put("priority", Integer.valueOf(v5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        int i12 = this.f1995a;
        Object obj = this.f1997c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.Q0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f1996b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f1996b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
        }
    }

    @Override
    public g2.h createDataSource() {
        return new l81(((q81) this.f1997c).h.createDataSource(), this.f1996b);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.o oVar = (org.telegram.ui.o) this.f1997c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            oVar.onComplete(new Pair(Long.valueOf(this.f1996b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f1995a) {
            case 8:
                cp0 cp0Var = ((vy) this.f1997c).C0.f27591b0;
                a0.i iVar = cp0Var.f10643x0;
                long j3 = this.f1996b;
                gg.g0 g0Var = (gg.g0) iVar.f(j3);
                if (g0Var != null) {
                    cp0Var.f10643x0.l(j3);
                    cp0Var.f10637t0.remove(g0Var);
                    cp0Var.f10639v0.remove(g0Var);
                    cp0Var.f10638u0.remove(g0Var);
                    cp0Var.l();
                    MessagesStorage.getInstance(cp0Var.f10636s0).getStorageQueue().postRunnable(new j(cp0Var, j3, 10));
                    return;
                }
                return;
            default:
                ((hy) this.f1997c).f38559a.getMediaDataController().removePeer(this.f1996b);
                return;
        }
    }

    @Override
    public Object h(m4.c0 c0Var, m4.r rVar, int i10) {
        return c0Var.q(rVar, e9.i0.z((b2.k0) this.f1997c), 0, this.f1996b);
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        rf1 rf1Var = (rf1) this.f1997c;
        org.telegram.ui.ActionBar.m2 m2Var = rf1Var.f41630b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = m2Var.getMessagesController();
            f fVar = new f(18);
            long j3 = this.f1996b;
            messagesController.addUserToChat(j3, (TLRPC.User) arrayList.get(i11), i10, null, m2Var, false, fVar, null, new ei.s3(rf1Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        d2 d2Var = (d2) this.f1997c;
        if (tL_error == null) {
            if (d2Var.E == null || d2Var.f812w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new t1(d2Var, 5));
            }
            if (d2Var.G == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                d2Var.G = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(d2Var.f807e).getPeer(d2Var.f805b);
                d2Var.G.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                d2Var.G.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = d2Var.G;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = d2Var.E;
                NativeInstance.SsrcGroup[] d = d2.d(tL_groupCallParticipantVideo);
                d2Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, d2Var.H, DialogObject.getPeerDialogId(d2Var.G.peer));
            }
        }
        NativeInstance nativeInstance2 = d2Var.E;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f1996b, r0);
        }
    }

    public z1(Object obj, long j3, int i10) {
        this.f1995a = i10;
        this.f1997c = obj;
        this.f1996b = j3;
    }

    @Override
    public void run(String str) {
        ci.y9 y9Var = (ci.y9) this.f1997c;
        y9Var.W.j1().r(this.f1996b, str, new ci.n9(y9Var, 2));
    }

    @Override
    public void run(boolean z10) {
        eo eoVar = ((h41) this.f1997c).h;
        if (com.google.android.gms.internal.vision.e2.t(eoVar)) {
            eoVar.va(this.f1996b, false);
        }
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
