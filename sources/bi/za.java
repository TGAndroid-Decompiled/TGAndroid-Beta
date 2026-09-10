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
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dd0;
import org.telegram.ui.eo;
import org.telegram.ui.iy;
import org.telegram.ui.sf1;
import org.telegram.ui.wy;
import org.telegram.ui.z60;
public final class za implements MessagesStorage.StringCallback, m4.g1, ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.c5, dd0, MessagesStorage.BooleanCallback, g2.g, org.telegram.ui.ActionBar.c2, z60, s5.e, RequestDelegateTimestamp {
    public final int f4018a;
    public final long f4019b;
    public final Object f4020c;

    public za(long j3, l5.i iVar) {
        this.f4018a = 11;
        this.f4019b = j3;
        this.f4020c = iVar;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        boolean G1;
        yi yiVar = (yi) this.f4020c;
        qi qiVar = yiVar.f29427y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f29378j0;
        long j3 = this.f4019b;
        if (qiVar != chatAttachAlertPhotoLayout && qiVar != yiVar.f29398q0) {
            if (!qiVar.I(i10, z10, i11, yiVar.s1(), j3)) {
                yiVar.A2 = true;
                yiVar.dismiss();
            }
            G1 = false;
        } else {
            G1 = yiVar.G1(i10, z10, i11, yiVar.s1(), j3);
        }
        of ofVar = yiVar.f29372h0;
        if (ofVar != null) {
            ofVar.h(!G1);
            yiVar.f29372h0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.i iVar = (l5.i) this.f4020c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f4019b));
        String str = iVar.f12793a;
        i5.d dVar = iVar.f12795c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f12793a);
            contentValues.put("priority", Integer.valueOf(v5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        int i12 = this.f4018a;
        Object obj = this.f4020c;
        switch (i12) {
            case 4:
                float[] fArr = FragmentContextView.M0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f4019b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f4019b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
        }
    }

    @Override
    public g2.h createDataSource() {
        return new o71(((t71) this.f4020c).h.createDataSource(), this.f4019b);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.oe oeVar = (org.telegram.ui.oe) this.f4020c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            oeVar.onComplete(new Pair(Long.valueOf(this.f4019b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f4018a) {
            case 7:
                ao0 ao0Var = ((wy) this.f4020c).C0.f23713b0;
                a0.i iVar = ao0Var.f8057x0;
                long j3 = this.f4019b;
                fg.g0 g0Var = (fg.g0) iVar.f(j3);
                if (g0Var != null) {
                    ao0Var.f8057x0.l(j3);
                    ao0Var.f8051t0.remove(g0Var);
                    ao0Var.f8053v0.remove(g0Var);
                    ao0Var.f8052u0.remove(g0Var);
                    ao0Var.l();
                    MessagesStorage.getInstance(ao0Var.f8050s0).getStorageQueue().postRunnable(new fg.q(ao0Var, j3, 0));
                    return;
                }
                return;
            default:
                ((iy) this.f4020c).f33812a.getMediaDataController().removePeer(this.f4019b);
                return;
        }
    }

    @Override
    public Object i(m4.b0 b0Var, m4.r rVar, int i10) {
        return b0Var.q(rVar, e9.i0.z((b2.k0) this.f4020c), 0, this.f4019b);
    }

    @Override
    public void k(int i10, ArrayList arrayList) {
        sf1 sf1Var = (sf1) this.f4020c;
        org.telegram.ui.ActionBar.p2 p2Var = sf1Var.f36673b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = p2Var.getMessagesController();
            f0 f0Var = new f0(13);
            long j3 = this.f4019b;
            messagesController.addUserToChat(j3, (TLRPC.User) arrayList.get(i11), i10, null, p2Var, false, f0Var, null, new di.v3(sf1Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        zh.t0 t0Var = (zh.t0) this.f4020c;
        if (tL_error == null) {
            if (t0Var.E == null || t0Var.f48885w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new c5(t0Var, 6));
            }
            if (t0Var.G == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                t0Var.G = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(t0Var.e).getPeer(t0Var.f48879b);
                t0Var.G.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                t0Var.G.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = t0Var.G;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = t0Var.E;
                NativeInstance.SsrcGroup[] d = zh.t0.d(tL_groupCallParticipantVideo);
                t0Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, t0Var.H, DialogObject.getPeerDialogId(t0Var.G.peer));
            }
        }
        NativeInstance nativeInstance2 = t0Var.E;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f4019b, r0);
        }
    }

    public za(Object obj, long j3, int i10) {
        this.f4018a = i10;
        this.f4020c = obj;
        this.f4019b = j3;
    }

    @Override
    public void run(String str) {
        kb kbVar = (kb) this.f4020c;
        kbVar.W.i1().r(this.f4019b, str, new ta(kbVar, 2));
    }

    @Override
    public void run(boolean z10) {
        eo eoVar = ((k31) this.f4020c).h;
        if (com.google.android.gms.internal.vision.e2.u(eoVar)) {
            eoVar.qa(this.f4019b, false);
        }
    }

    @Override
    public void j(TLRPC.User user) {
    }
}
