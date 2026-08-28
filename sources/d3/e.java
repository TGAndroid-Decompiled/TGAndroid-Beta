package d3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import bg.d2;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.m;
import ih.a1;
import ih.f1;
import ih.v3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import kh.d9;
import kh.n9;
import mh.h3;
import of.e0;
import of.p;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.g5;
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
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.x4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy;
import org.telegram.ui.f60;
import org.telegram.ui.fe1;
import org.telegram.ui.kc0;
import org.telegram.ui.ox;
import org.telegram.ui.qn;
public final class e implements f, RequestDelegateTimestamp, MessagesStorage.StringCallback, ImageReceiver.ImageReceiverDelegate, x4, kc0, MessagesStorage.BooleanCallback, l, b2, f60 {
    public final int f4295a;
    public final long f4296b;
    public final Object f4297c;

    public e(long j10, w2.i iVar) {
        this.f4295a = 0;
        this.f4296b = j10;
        this.f4297c = iVar;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        boolean G1;
        ki kiVar = (ki) this.f4297c;
        ci ciVar = kiVar.f30160u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f30114f0;
        long j10 = this.f4296b;
        if (ciVar != chatAttachAlertPhotoLayout && ciVar != kiVar.m0) {
            if (!ciVar.H(i9, z10, i10, kiVar.s1(), j10)) {
                kiVar.f30169w2 = true;
                kiVar.dismiss();
            }
            G1 = false;
        } else {
            G1 = kiVar.G1(i9, z10, i10, kiVar.s1(), j10);
        }
        cf cfVar = kiVar.f30106d0;
        if (cfVar != null) {
            cfVar.h(!G1);
            kiVar.f30106d0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        w2.i iVar = (w2.i) this.f4297c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f4296b));
        String str = iVar.f48454a;
        t2.d dVar = iVar.f48456c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(g3.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f48454a);
            contentValues.put("priority", Integer.valueOf(g3.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public m createDataSource() {
        return new f61(((k61) this.f4297c).h.createDataSource(), this.f4296b);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        int i11 = this.f4295a;
        Object obj = this.f4297c;
        switch (i11) {
            case 5:
                float[] fArr = FragmentContextView.I0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f4296b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.f35493x1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f4296b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        v3 v3Var = (v3) this.f4297c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            v3Var.onComplete(new Pair(Long.valueOf(this.f4296b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        g5.a(this, i9, str, drawable);
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f4295a) {
            case 8:
                an0 an0Var = ((dy) this.f4297c).f37750y0.U;
                a0.h hVar = an0Var.f19310t0;
                long j10 = this.f4296b;
                e0 e0Var = (e0) hVar.f(j10);
                if (e0Var != null) {
                    an0Var.f19310t0.l(j10);
                    an0Var.f19304p0.remove(e0Var);
                    an0Var.f19307r0.remove(e0Var);
                    an0Var.f19305q0.remove(e0Var);
                    an0Var.l();
                    MessagesStorage.getInstance(an0Var.f19303o0).getStorageQueue().postRunnable(new p(an0Var, j10, 0));
                    return;
                }
                return;
            default:
                ((ox) this.f4297c).f41259a.getMediaDataController().removePeer(this.f4296b);
                return;
        }
    }

    @Override
    public void j(int i9, ArrayList arrayList) {
        fe1 fe1Var = (fe1) this.f4297c;
        o2 o2Var = fe1Var.f38246b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            MessagesController messagesController = o2Var.getMessagesController();
            d2 d2Var = new d2(23);
            long j10 = this.f4296b;
            messagesController.addUserToChat(j10, (TLRPC.User) arrayList.get(i10), i9, null, o2Var, false, d2Var, null, new h3(fe1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        g5.b(this, imageReceiver);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        f1 f1Var = (f1) this.f4297c;
        if (tL_error == null) {
            if (f1Var.A == null || f1Var.f11406w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i9 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new a1(f1Var, 5));
            }
            if (f1Var.C == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                f1Var.C = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(f1Var.f11401e).getPeer(f1Var.f11399b);
                f1Var.C.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i9 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i9);
                    i9++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                f1Var.C.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = f1Var.C;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = f1Var.A;
                NativeInstance.SsrcGroup[] d = f1.d(tL_groupCallParticipantVideo);
                f1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, f1Var.D, DialogObject.getPeerDialogId(f1Var.C.peer));
            }
        }
        NativeInstance nativeInstance2 = f1Var.A;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f4296b, r0);
        }
    }

    public e(Object obj, long j10, int i9) {
        this.f4295a = i9;
        this.f4297c = obj;
        this.f4296b = j10;
    }

    @Override
    public void run(String str) {
        n9 n9Var = (n9) this.f4297c;
        n9Var.S.i1().r(this.f4296b, str, new d9(n9Var, 2));
    }

    @Override
    public void run(boolean z10) {
        qn qnVar = ((b21) this.f4297c).h;
        if (e2.c.v(qnVar)) {
            qnVar.qa(this.f4296b, false);
        }
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
