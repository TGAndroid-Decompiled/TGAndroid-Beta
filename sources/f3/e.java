package f3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import cg.n0;
import g5.l;
import g5.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import mg.w;
import nh.e1;
import nh.z0;
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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.w21;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oy;
import org.telegram.ui.re1;
import org.telegram.ui.t60;
import org.telegram.ui.ue1;
import org.telegram.ui.vc0;
import org.telegram.ui.xn;
import org.telegram.ui.zx;
import ph.s7;
import ph.z7;
import tf.n;
import tf.y;
public final class e implements f, RequestDelegateTimestamp, ImageReceiver.ImageReceiverDelegate, y4, vc0, MessagesStorage.BooleanCallback, l, c2, t60, MessagesStorage.StringCallback {
    public final int f5880a;
    public final long f5881b;
    public final Object f5882c;

    public e(long j10, y2.i iVar) {
        this.f5880a = 0;
        this.f5881b = j10;
        this.f5882c = iVar;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        boolean G1;
        li liVar = (li) this.f5882c;
        di diVar = liVar.f26748v0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26702g0;
        long j10 = this.f5881b;
        if (diVar != chatAttachAlertPhotoLayout && diVar != liVar.f26722n0) {
            if (!diVar.H(i10, z4, i11, liVar.s1(), j10)) {
                liVar.f26758x2 = true;
                liVar.dismiss();
            }
            G1 = false;
        } else {
            G1 = liVar.G1(i10, z4, i11, liVar.s1(), j10);
        }
        cf cfVar = liVar.f26695e0;
        if (cfVar != null) {
            cfVar.h(!G1);
            liVar.f26695e0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        y2.i iVar = (y2.i) this.f5882c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f5881b));
        String str = iVar.f47014a;
        v2.d dVar = iVar.f47016c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(i3.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f47014a);
            contentValues.put("priority", Integer.valueOf(i3.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public m createDataSource() {
        return new d71(((i71) this.f5882c).h.createDataSource(), this.f5881b);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        int i12 = this.f5880a;
        Object obj = this.f5882c;
        switch (i12) {
            case 4:
                float[] fArr = FragmentContextView.J0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f5881b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.f31612y1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f5881b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        w wVar = (w) this.f5882c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z4 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            wVar.onComplete(new Pair(Long.valueOf(this.f5881b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override
    public void i(d2 d2Var, int i10) {
        switch (this.f5880a) {
            case 7:
                wn0 wn0Var = ((oy) this.f5882c).f37129z0.V;
                a0.h hVar = wn0Var.f44915u0;
                long j10 = this.f5881b;
                y yVar = (y) hVar.f(j10);
                if (yVar != null) {
                    wn0Var.f44915u0.l(j10);
                    wn0Var.f44909q0.remove(yVar);
                    wn0Var.f44913s0.remove(yVar);
                    wn0Var.f44911r0.remove(yVar);
                    wn0Var.l();
                    MessagesStorage.getInstance(wn0Var.f44908p0).getStorageQueue().postRunnable(new n(wn0Var, j10, 0));
                    return;
                }
                return;
            default:
                ((zx) this.f5882c).f40873a.getMediaDataController().removePeer(this.f5881b);
                return;
        }
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        ue1 ue1Var = (ue1) this.f5882c;
        p2 p2Var = ue1Var.f38924b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = p2Var.getMessagesController();
            n0 n0Var = new n0(21);
            long j10 = this.f5881b;
            messagesController.addUserToChat(j10, (TLRPC.User) arrayList.get(i11), i10, null, p2Var, false, n0Var, null, new re1(ue1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        e1 e1Var = (e1) this.f5882c;
        if (tL_error == null) {
            if (e1Var.B == null || e1Var.f15299w) {
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
                tL_groupCallParticipant.peer = MessagesController.getInstance(e1Var.e).getPeer(e1Var.f15293b);
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
            nativeInstance2.onRequestTimeComplete(this.f5881b, r0);
        }
    }

    public e(Object obj, long j10, int i10) {
        this.f5880a = i10;
        this.f5882c = obj;
        this.f5881b = j10;
    }

    @Override
    public void run(String str) {
        z7 z7Var = (z7) this.f5882c;
        z7Var.T.i1().r(this.f5881b, str, new s7(z7Var, 2));
    }

    @Override
    public void run(boolean z4) {
        xn xnVar = ((w21) this.f5882c).h;
        if (e2.c.s(xnVar)) {
            xnVar.qa(this.f5881b, false);
        }
    }

    @Override
    public void h(TLRPC.User user) {
    }
}
