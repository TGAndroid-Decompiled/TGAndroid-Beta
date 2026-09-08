package bi;

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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a70;
import org.telegram.ui.co;
import org.telegram.ui.dd0;
import org.telegram.ui.gy;
import org.telegram.ui.of1;
import org.telegram.ui.uy;
public final class p1 implements RequestDelegateTimestamp, MessagesStorage.StringCallback, m4.e1, ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.d5, dd0, MessagesStorage.BooleanCallback, g2.g, org.telegram.ui.ActionBar.a2, a70, s5.e {
    public final int f3520a;
    public final long f3521b;
    public final Object f3522c;

    public p1(long j3, l5.i iVar) {
        this.f3520a = 12;
        this.f3521b = j3;
        this.f3522c = iVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean G1;
        vi viVar = (vi) this.f3522c;
        ni niVar = viVar.f31367y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f31318j0;
        long j3 = this.f3521b;
        if (niVar != chatAttachAlertPhotoLayout && niVar != viVar.f31338q0) {
            if (!niVar.I(i10, z10, i11, viVar.s1(), j3)) {
                viVar.A2 = true;
                viVar.dismiss();
            }
            G1 = false;
        } else {
            G1 = viVar.G1(i10, z10, i11, viVar.s1(), j3);
        }
        nf nfVar = viVar.f31312h0;
        if (nfVar != null) {
            nfVar.h(!G1);
            viVar.f31312h0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.i iVar = (l5.i) this.f3522c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f3521b));
        String str = iVar.f15310a;
        i5.d dVar = iVar.f15312c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f15310a);
            contentValues.put("priority", Integer.valueOf(v5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        int i12 = this.f3520a;
        Object obj = this.f3522c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.M0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f3521b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f3521b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
        }
    }

    @Override
    public g2.h createDataSource() {
        return new b71(((g71) this.f3522c).h.createDataSource(), this.f3521b);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.f3522c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            m4Var.onComplete(new Pair(Long.valueOf(this.f3521b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f3520a) {
            case 8:
                rn0 rn0Var = ((uy) this.f3522c).C0.f32977b0;
                a0.i iVar = rn0Var.f11126x0;
                long j3 = this.f3521b;
                hg.h0 h0Var = (hg.h0) iVar.f(j3);
                if (h0Var != null) {
                    rn0Var.f11126x0.l(j3);
                    rn0Var.f11120t0.remove(h0Var);
                    rn0Var.f11122v0.remove(h0Var);
                    rn0Var.f11121u0.remove(h0Var);
                    rn0Var.l();
                    MessagesStorage.getInstance(rn0Var.f11119s0).getStorageQueue().postRunnable(new hg.q(rn0Var, j3, 0));
                    return;
                }
                return;
            default:
                ((gy) this.f3522c).f36837a.getMediaDataController().removePeer(this.f3521b);
                return;
        }
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        return a0Var.q(rVar, e9.i0.z((b2.k0) this.f3522c), 0, this.f3521b);
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        of1 of1Var = (of1) this.f3522c;
        org.telegram.ui.ActionBar.n2 n2Var = of1Var.f39264b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = n2Var.getMessagesController();
            ah.j jVar = new ah.j(19);
            long j3 = this.f3521b;
            messagesController.addUserToChat(j3, (TLRPC.User) arrayList.get(i11), i10, null, n2Var, false, jVar, null, new fi.s3(of1Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        t1 t1Var = (t1) this.f3522c;
        if (tL_error == null) {
            if (t1Var.E == null || t1Var.f3750w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new k1(t1Var, 5));
            }
            if (t1Var.G == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                t1Var.G = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(t1Var.f3745e).getPeer(t1Var.f3743b);
                t1Var.G.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                t1Var.G.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = t1Var.G;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = t1Var.E;
                NativeInstance.SsrcGroup[] d = t1.d(tL_groupCallParticipantVideo);
                t1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, t1Var.H, DialogObject.getPeerDialogId(t1Var.G.peer));
            }
        }
        NativeInstance nativeInstance2 = t1Var.E;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f3521b, r0);
        }
    }

    public p1(Object obj, long j3, int i10) {
        this.f3520a = i10;
        this.f3522c = obj;
        this.f3521b = j3;
    }

    @Override
    public void run(String str) {
        di.ba baVar = (di.ba) this.f3522c;
        baVar.W.i1().r(this.f3521b, str, new di.p9(baVar, 2));
    }

    @Override
    public void run(boolean z10) {
        co coVar = ((w21) this.f3522c).h;
        if (com.google.android.gms.internal.vision.e2.u(coVar)) {
            coVar.qa(this.f3521b, false);
        }
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
