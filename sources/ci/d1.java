package ci;

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
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.kf;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.ge1;
import org.telegram.ui.k60;
import org.telegram.ui.mc0;
import org.telegram.ui.px;
import org.telegram.ui.sn;
public final class d1 implements RequestDelegateTimestamp, MessagesStorage.StringCallback, m4.g1, ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.b5, mc0, MessagesStorage.BooleanCallback, g2.g, org.telegram.ui.ActionBar.z1, k60, s5.e {
    public final int f5248a;
    public final long f5249b;
    public final Object f5250c;

    public d1(long j10, l5.i iVar) {
        this.f5248a = 13;
        this.f5249b = j10;
        this.f5250c = iVar;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        boolean N1;
        ri riVar = (ri) this.f5250c;
        ji jiVar = riVar.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = riVar.f30158j0;
        long j10 = this.f5249b;
        if (jiVar != chatAttachAlertPhotoLayout && jiVar != riVar.f30178q0) {
            if (!jiVar.K(i10, z10, i11, riVar.x1(), j10)) {
                riVar.G2 = true;
                riVar.dismiss();
            }
            N1 = false;
        } else {
            N1 = riVar.N1(i10, z10, i11, riVar.x1(), j10);
        }
        kf kfVar = riVar.f30152h0;
        if (kfVar != null) {
            kfVar.g(!N1);
            riVar.f30152h0 = null;
        }
    }

    @Override
    public Object a(m4.f0 f0Var, m4.v vVar, int i10) {
        return f0Var.q(vVar, e9.n0.y((b2.o0) this.f5250c), 0, this.f5249b);
    }

    @Override
    public Object apply(Object obj) {
        l5.i iVar = (l5.i) this.f5250c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f5249b));
        String str = iVar.f15983a;
        i5.d dVar = iVar.f15985c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f15983a);
            contentValues.put("priority", Integer.valueOf(v5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        int i12 = this.f5248a;
        Object obj = this.f5250c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.W0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f5249b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f5249b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
        }
    }

    @Override
    public g2.h createDataSource() {
        return new e81(((j81) this.f5250c).h.createDataSource(), this.f5249b);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        m4.w0 w0Var = (m4.w0) this.f5250c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            w0Var.onComplete(new Pair(Long.valueOf(this.f5249b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f5248a) {
            case 8:
                ro0 ro0Var = ((ey) this.f5250c).C0.f33303b0;
                a0.h hVar = ro0Var.f11928x0;
                long j10 = this.f5249b;
                hg.g0 g0Var = (hg.g0) hVar.f(j10);
                if (g0Var != null) {
                    ro0Var.f11928x0.l(j10);
                    ro0Var.f11922t0.remove(g0Var);
                    ro0Var.f11924v0.remove(g0Var);
                    ro0Var.f11923u0.remove(g0Var);
                    ro0Var.l();
                    MessagesStorage.getInstance(ro0Var.f11921s0).getStorageQueue().postRunnable(new ai.v3(ro0Var, j10, 10));
                    return;
                }
                return;
            default:
                ((px) this.f5250c).f40644a.getMediaDataController().removePeer(this.f5249b);
                return;
        }
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        ge1 ge1Var = (ge1) this.f5250c;
        org.telegram.ui.ActionBar.o2 o2Var = ge1Var.f37552b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = o2Var.getMessagesController();
            ah.j jVar = new ah.j(23);
            long j10 = this.f5249b;
            messagesController.addUserToChat(j10, (TLRPC.User) arrayList.get(i11), i10, null, o2Var, false, jVar, null, new gi.i3(ge1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.n5.b(this, imageReceiver);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        h1 h1Var = (h1) this.f5250c;
        if (tL_error == null) {
            if (h1Var.E == null || h1Var.f5386w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new b1(h1Var, 5));
            }
            if (h1Var.G == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                h1Var.G = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(h1Var.e).getPeer(h1Var.f5380b);
                h1Var.G.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                h1Var.G.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = h1Var.G;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = h1Var.E;
                NativeInstance.SsrcGroup[] d = h1.d(tL_groupCallParticipantVideo);
                h1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, h1Var.H, DialogObject.getPeerDialogId(h1Var.G.peer));
            }
        }
        NativeInstance nativeInstance2 = h1Var.E;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f5249b, r0);
        }
    }

    public d1(Object obj, long j10, int i10) {
        this.f5248a = i10;
        this.f5250c = obj;
        this.f5249b = j10;
    }

    @Override
    public void run(String str) {
        ei.k9 k9Var = (ei.k9) this.f5250c;
        k9Var.W.j1().r(this.f5249b, str, new ei.b9(k9Var, 2));
    }

    @Override
    public void run(boolean z10) {
        sn snVar = ((v31) this.f5250c).h;
        if (com.google.android.gms.internal.play_billing.k3.s(snVar)) {
            snVar.va(this.f5249b, false);
        }
    }

    @Override
    public void h(TLRPC.User user) {
    }
}
