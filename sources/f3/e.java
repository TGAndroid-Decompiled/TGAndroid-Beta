package f3;

import ag.o0;
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
import kg.w;
import lh.d1;
import lh.y0;
import nh.p8;
import nh.y8;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.m21;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fe1;
import org.telegram.ui.fy;
import org.telegram.ui.h60;
import org.telegram.ui.ie1;
import org.telegram.ui.mc0;
import org.telegram.ui.qx;
import org.telegram.ui.tn;
import rf.o;
import rf.z;
public final class e implements f, RequestDelegateTimestamp, MessagesStorage.StringCallback, ImageReceiver.ImageReceiverDelegate, b5, mc0, MessagesStorage.BooleanCallback, l, b2, h60 {
    public final int f6532a;
    public final long f6533b;
    public final Object f6534c;

    public e(long j10, y2.i iVar) {
        this.f6532a = 0;
        this.f6533b = j10;
        this.f6534c = iVar;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        boolean G1;
        ni niVar = (ni) this.f6534c;
        fi fiVar = niVar.f31051u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f31005f0;
        long j10 = this.f6533b;
        if (fiVar != chatAttachAlertPhotoLayout && fiVar != niVar.m0) {
            if (!fiVar.H(i10, z10, i11, niVar.s1(), j10)) {
                niVar.f31060w2 = true;
                niVar.dismiss();
            }
            G1 = false;
        } else {
            G1 = niVar.G1(i10, z10, i11, niVar.s1(), j10);
        }
        ff ffVar = niVar.f30997d0;
        if (ffVar != null) {
            ffVar.h(!G1);
            niVar.f30997d0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        y2.i iVar = (y2.i) this.f6534c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f6533b));
        String str = iVar.f50187a;
        v2.d dVar = iVar.f50189c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(i3.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f50187a);
            contentValues.put("priority", Integer.valueOf(i3.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public m createDataSource() {
        return new s61(((x61) this.f6534c).h.createDataSource(), this.f6533b);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        int i12 = this.f6532a;
        Object obj = this.f6534c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.I0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f6533b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.f35560x1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f6533b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        w wVar = (w) this.f6534c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            wVar.onComplete(new Pair(Long.valueOf(this.f6533b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f6532a) {
            case 8:
                mn0 mn0Var = ((fy) this.f6534c).f38377y0.U;
                a0.h hVar = mn0Var.f47162t0;
                long j10 = this.f6533b;
                z zVar = (z) hVar.f(j10);
                if (zVar != null) {
                    mn0Var.f47162t0.l(j10);
                    mn0Var.f47156p0.remove(zVar);
                    mn0Var.f47159r0.remove(zVar);
                    mn0Var.f47157q0.remove(zVar);
                    mn0Var.l();
                    MessagesStorage.getInstance(mn0Var.f47155o0).getStorageQueue().postRunnable(new o(mn0Var, j10, 0));
                    return;
                }
                return;
            default:
                ((qx) this.f6534c).f41793a.getMediaDataController().removePeer(this.f6533b);
                return;
        }
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        ie1 ie1Var = (ie1) this.f6534c;
        o2 o2Var = ie1Var.f39228b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = o2Var.getMessagesController();
            o0 o0Var = new o0(25);
            long j10 = this.f6533b;
            messagesController.addUserToChat(j10, (TLRPC.User) arrayList.get(i11), i10, null, o2Var, false, o0Var, null, new fe1(ie1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
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
        d1 d1Var = (d1) this.f6534c;
        if (tL_error == null) {
            if (d1Var.A == null || d1Var.f15461w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new y0(d1Var, 5));
            }
            if (d1Var.C == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                d1Var.C = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(d1Var.f15456e).getPeer(d1Var.f15454b);
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
                NativeInstance.SsrcGroup[] d = d1.d(tL_groupCallParticipantVideo);
                d1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, d1Var.D, DialogObject.getPeerDialogId(d1Var.C.peer));
            }
        }
        NativeInstance nativeInstance2 = d1Var.A;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f6533b, r0);
        }
    }

    public e(Object obj, long j10, int i10) {
        this.f6532a = i10;
        this.f6534c = obj;
        this.f6533b = j10;
    }

    @Override
    public void run(String str) {
        y8 y8Var = (y8) this.f6534c;
        y8Var.S.i1().r(this.f6533b, str, new p8(y8Var, 2));
    }

    @Override
    public void run(boolean z10) {
        tn tnVar = ((m21) this.f6534c).h;
        if (com.google.android.recaptcha.internal.a.u(tnVar)) {
            tnVar.qa(this.f6533b, false);
        }
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
