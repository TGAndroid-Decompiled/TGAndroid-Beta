package d3;

import ag.l3;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import jh.d1;
import jh.y0;
import jh.z1;
import lh.a9;
import lh.k9;
import nh.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.i5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.ye;
import org.telegram.ui.Components.yh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ge1;
import org.telegram.ui.gy;
import org.telegram.ui.j60;
import org.telegram.ui.oc0;
import org.telegram.ui.rn;
import org.telegram.ui.rx;
import pf.n;
import pf.y;

public final class e implements f, RequestDelegateTimestamp, MessagesStorage.StringCallback, ImageReceiver.ImageReceiverDelegate, x4, oc0, MessagesStorage.BooleanCallback, l, a2, j60 {

    public final int f4737a;

    public final long f4738b;

    public final Object f4739c;

    public e(long j10, w2.i iVar) {
        this.f4737a = 0;
        this.f4738b = j10;
        this.f4739c = iVar;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        boolean zG1;
        gi giVar = (gi) this.f4739c;
        yh yhVar = giVar.f28696u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f28650f0;
        long j10 = this.f4738b;
        if (yhVar == chatAttachAlertPhotoLayout || yhVar == giVar.m0) {
            zG1 = giVar.G1(i10, z10, i11, giVar.s1(), j10);
        } else {
            if (!yhVar.I(i10, z10, i11, giVar.s1(), j10)) {
                giVar.f28705w2 = true;
                giVar.dismiss();
            }
            zG1 = false;
        }
        ye yeVar = giVar.f28642d0;
        if (yeVar != null) {
            yeVar.h(!zG1);
            giVar.f28642d0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        w2.i iVar = (w2.i) this.f4739c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f4738b));
        String str = iVar.f48957a;
        t2.d dVar = iVar.f48959c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(g3.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f48957a);
            contentValues.put("priority", Integer.valueOf(g3.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public m createDataSource() {
        return new h61(((m61) this.f4739c).h.createDataSource(), this.f4738b);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        int i12 = this.f4737a;
        Object obj = this.f4739c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.I0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f4738b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
                break;
            default:
                Pattern pattern = LaunchActivity.f35496x1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f4738b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
                break;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        z1 z1Var = (z1) this.f4739c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z10 || bitmapSafe == null) {
            return;
        }
        Bitmap bitmap = bitmapSafe.bitmap;
        if (bitmap == null) {
            Drawable drawable = bitmapSafe.drawable;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        z1Var.onComplete(new Pair(Long.valueOf(this.f4738b), bitmap));
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f4737a) {
            case 8:
                cn0 cn0Var = ((gy) this.f4739c).f38619y0.U;
                a0.h hVar = cn0Var.f46003t0;
                long j10 = this.f4738b;
                y yVar = (y) hVar.f(j10);
                if (yVar != null) {
                    cn0Var.f46003t0.l(j10);
                    cn0Var.f45997p0.remove(yVar);
                    cn0Var.f46000r0.remove(yVar);
                    cn0Var.f45998q0.remove(yVar);
                    cn0Var.l();
                    MessagesStorage.getInstance(cn0Var.f45996o0).getStorageQueue().postRunnable(new n(cn0Var, j10, 0));
                    break;
                }
                break;
            default:
                ((rx) this.f4739c).f42355a.getMediaDataController().removePeer(this.f4738b);
                break;
        }
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        ge1 ge1Var = (ge1) this.f4739c;
        n2 n2Var = ge1Var.f38398b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i11);
            MessagesController messagesController = n2Var.getMessagesController();
            l3 l3Var = new l3(22);
            long j10 = this.f4738b;
            messagesController.addUserToChat(j10, user, i10, null, n2Var, false, l3Var, null, new g3(ge1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        d1 d1Var = (d1) this.f4739c;
        long j11 = 0;
        if (tL_error == null) {
            if (d1Var.A == null || d1Var.f13182w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            j11 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new y0(d1Var, 5));
            }
            if (d1Var.C == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                d1Var.C = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(d1Var.f13177e).getPeer(d1Var.f13175b);
                d1Var.C.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                d1Var.C.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = d1Var.C;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = d1Var.A;
                NativeInstance.SsrcGroup[] ssrcGroupArrD = d1.d(tL_groupCallParticipantVideo);
                d1Var.r(ssrcGroupArrD);
                nativeInstance.addIncomingVideoOutput(2, "unified", ssrcGroupArrD, d1Var.D, DialogObject.getPeerDialogId(d1Var.C.peer));
            }
        }
        NativeInstance nativeInstance2 = d1Var.A;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f4738b, j11);
        }
    }

    public e(Object obj, long j10, int i10) {
        this.f4737a = i10;
        this.f4739c = obj;
        this.f4738b = j10;
    }

    @Override
    public void run(String str) {
        k9 k9Var = (k9) this.f4739c;
        k9Var.S.i1().r(this.f4738b, str, new a9(k9Var, 2));
    }

    @Override
    public void run(boolean z10) {
        rn rnVar = ((d21) this.f4739c).h;
        if (com.google.android.recaptcha.internal.a.u(rnVar)) {
            rnVar.qa(this.f4738b, false);
        }
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
