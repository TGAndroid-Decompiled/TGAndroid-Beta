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
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e70;
import org.telegram.ui.fo;
import org.telegram.ui.id0;
import org.telegram.ui.ky;
import org.telegram.ui.vf1;
import org.telegram.ui.yy;
public final class p1 implements RequestDelegateTimestamp, MessagesStorage.StringCallback, m4.h1, ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.f5, id0, MessagesStorage.BooleanCallback, g2.g, org.telegram.ui.ActionBar.z1, e70, s5.e {
    public final int f3453a;
    public final long f3454b;
    public final Object f3455c;

    public p1(long j10, l5.i iVar) {
        this.f3453a = 13;
        this.f3454b = j10;
        this.f3455c = iVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean J1;
        vi viVar = (vi) this.f3455c;
        ni niVar = viVar.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f30013j0;
        long j10 = this.f3454b;
        if (niVar != chatAttachAlertPhotoLayout && niVar != viVar.f30033q0) {
            if (!niVar.K(i10, z10, i11, viVar.u1(), j10)) {
                viVar.D2 = true;
                viVar.dismiss();
            }
            J1 = false;
        } else {
            J1 = viVar.J1(i10, z10, i11, viVar.u1(), j10);
        }
        of ofVar = viVar.f30007h0;
        if (ofVar != null) {
            ofVar.h(!J1);
            viVar.f30007h0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.i iVar = (l5.i) this.f3455c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f3454b));
        String str = iVar.f14580a;
        i5.d dVar = iVar.f14582c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f14580a);
            contentValues.put("priority", Integer.valueOf(v5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        int i12 = this.f3453a;
        Object obj = this.f3455c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.Q0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f3454b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f3454b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
                return;
        }
    }

    @Override
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        return f0Var.q(wVar, e9.n0.y((b2.p0) this.f3455c), 0, this.f3454b);
    }

    @Override
    public g2.h createDataSource() {
        return new c81(((h81) this.f3455c).h.createDataSource(), this.f3454b);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        m4.z0 z0Var = (m4.z0) this.f3455c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            z0Var.onComplete(new Pair(Long.valueOf(this.f3454b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f3453a) {
            case 8:
                so0 so0Var = ((yy) this.f3455c).C0.f31915b0;
                a0.h hVar = so0Var.f10593x0;
                long j10 = this.f3454b;
                hg.g0 g0Var = (hg.g0) hVar.f(j10);
                if (g0Var != null) {
                    so0Var.f10593x0.l(j10);
                    so0Var.f10587t0.remove(g0Var);
                    so0Var.f10589v0.remove(g0Var);
                    so0Var.f10588u0.remove(g0Var);
                    so0Var.l();
                    MessagesStorage.getInstance(so0Var.f10586s0).getStorageQueue().postRunnable(new g(so0Var, j10, 10));
                    return;
                }
                return;
            default:
                ((ky) this.f3455c).f37777a.getMediaDataController().removePeer(this.f3454b);
                return;
        }
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        vf1 vf1Var = (vf1) this.f3455c;
        org.telegram.ui.ActionBar.m2 m2Var = vf1Var.f40985b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = m2Var.getMessagesController();
            ah.j jVar = new ah.j(19);
            long j10 = this.f3454b;
            messagesController.addUserToChat(j10, (TLRPC.User) arrayList.get(i11), i10, null, m2Var, false, jVar, null, new fi.t3(vf1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
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
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        t1 t1Var = (t1) this.f3455c;
        if (tL_error == null) {
            if (t1Var.E == null || t1Var.f3727w) {
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
                tL_groupCallParticipant.peer = MessagesController.getInstance(t1Var.e).getPeer(t1Var.f3721b);
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
            nativeInstance2.onRequestTimeComplete(this.f3454b, r0);
        }
    }

    public p1(Object obj, long j10, int i10) {
        this.f3453a = i10;
        this.f3455c = obj;
        this.f3454b = j10;
    }

    @Override
    public void run(String str) {
        di.x9 x9Var = (di.x9) this.f3455c;
        x9Var.W.j1().r(this.f3454b, str, new di.m9(x9Var, 2));
    }

    @Override
    public void run(boolean z10) {
        fo foVar = ((y31) this.f3455c).h;
        if (com.google.android.gms.internal.play_billing.k3.s(foVar)) {
            foVar.va(this.f3454b, false);
        }
    }

    @Override
    public void h(TLRPC.User user) {
    }
}
