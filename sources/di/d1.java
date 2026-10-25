package di;

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
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;
import org.telegram.ui.kc0;
import org.telegram.ui.ke1;
import org.telegram.ui.lx;
import org.telegram.ui.m60;
import org.telegram.ui.un;
public final class d1 implements RequestDelegateTimestamp, MessagesStorage.StringCallback, m4.h1, ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.e5, kc0, MessagesStorage.BooleanCallback, g2.g, org.telegram.ui.ActionBar.b2, m60, t5.e {
    public final int f8480a;
    public final long f8481b;
    public final Object f8482c;

    public d1(long j10, m5.i iVar) {
        this.f8480a = 13;
        this.f8481b = j10;
        this.f8482c = iVar;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        boolean M1;
        ti tiVar = (ti) this.f8482c;
        li liVar = tiVar.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f33030j0;
        long j10 = this.f8481b;
        if (liVar != chatAttachAlertPhotoLayout && liVar != tiVar.f33050q0) {
            if (!liVar.K(i10, z10, i11, tiVar.w1(), j10)) {
                tiVar.G2 = true;
                tiVar.dismiss();
            }
            M1 = false;
        } else {
            M1 = tiVar.M1(i10, z10, i11, tiVar.w1(), j10);
        }
        mf mfVar = tiVar.f33024h0;
        if (mfVar != null) {
            mfVar.g(!M1);
            tiVar.f33024h0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        m5.i iVar = (m5.i) this.f8482c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f8481b));
        String str = iVar.f18333a;
        j5.d dVar = iVar.f18335c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(w5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f18333a);
            contentValues.put("priority", Integer.valueOf(w5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        return f0Var.q(wVar, f9.i0.y((b2.p0) this.f8482c), 0, this.f8481b);
    }

    @Override
    public g2.h createDataSource() {
        return new n81(((s81) this.f8482c).h.createDataSource(), this.f8481b);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        int i12 = this.f8480a;
        Object obj = this.f8482c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.W0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f8481b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f8481b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        m4.s0 s0Var = (m4.s0) this.f8482c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            s0Var.onComplete(new Pair(Long.valueOf(this.f8481b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override
    public void f(int i10, ArrayList arrayList) {
        ke1 ke1Var = (ke1) this.f8482c;
        org.telegram.ui.ActionBar.r2 r2Var = ke1Var.f40924b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = r2Var.getMessagesController();
            ag.c cVar = new ag.c(25);
            long j10 = this.f8481b;
            messagesController.addUserToChat(j10, (TLRPC.User) arrayList.get(i11), i10, null, r2Var, false, cVar, null, new hi.r3(ke1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f8480a) {
            case 8:
                wo0 wo0Var = ((cy) this.f8482c).C0.f27934d0;
                a0.h hVar = wo0Var.f14101x0;
                long j10 = this.f8481b;
                ig.h0 h0Var = (ig.h0) hVar.f(j10);
                if (h0Var != null) {
                    wo0Var.f14101x0.l(j10);
                    wo0Var.f14095t0.remove(h0Var);
                    wo0Var.f14097v0.remove(h0Var);
                    wo0Var.f14096u0.remove(h0Var);
                    wo0Var.l();
                    MessagesStorage.getInstance(wo0Var.f14094s0).getStorageQueue().postRunnable(new bi.r3(wo0Var, j10, 10));
                    return;
                }
                return;
            default:
                ((lx) this.f8482c).f41384a.getMediaDataController().removePeer(this.f8481b);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.o5.b(this, imageReceiver);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        h1 h1Var = (h1) this.f8482c;
        if (tL_error == null) {
            if (h1Var.E == null || h1Var.f8611w) {
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
                tL_groupCallParticipant.peer = MessagesController.getInstance(h1Var.e).getPeer(h1Var.f8605b);
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
            nativeInstance2.onRequestTimeComplete(this.f8481b, r0);
        }
    }

    public d1(Object obj, long j10, int i10) {
        this.f8480a = i10;
        this.f8482c = obj;
        this.f8481b = j10;
    }

    @Override
    public void run(String str) {
        fi.g9 g9Var = (fi.g9) this.f8482c;
        g9Var.W.j1().r(this.f8481b, str, new fi.x8(g9Var, 2));
    }

    @Override
    public void run(boolean z10) {
        un unVar = ((e41) this.f8482c).h;
        if (c3.h0.t(unVar)) {
            unVar.Aa(this.f8481b, false);
        }
    }

    @Override
    public void e(TLRPC.User user) {
    }
}
