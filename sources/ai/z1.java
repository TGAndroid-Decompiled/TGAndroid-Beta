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
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cd0;
import org.telegram.ui.fy;
import org.telegram.ui.pf1;
import org.telegram.ui.ty;
import org.telegram.ui.x60;
import org.telegram.ui.zn;
public final class z1 implements RequestDelegateTimestamp, MessagesStorage.StringCallback, m4.a1, ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.f5, cd0, MessagesStorage.BooleanCallback, g2.g, org.telegram.ui.ActionBar.a2, x60, s5.e {
    public final int f1997a;
    public final long f1998b;
    public final Object f1999c;

    public z1(long j3, l5.i iVar) {
        this.f1997a = 13;
        this.f1998b = j3;
        this.f1999c = iVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean J1;
        yi yiVar = (yi) this.f1999c;
        qi qiVar = yiVar.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f33240j0;
        long j3 = this.f1998b;
        if (qiVar != chatAttachAlertPhotoLayout && qiVar != yiVar.f33260q0) {
            if (!qiVar.K(i10, z10, i11, yiVar.u1(), j3)) {
                yiVar.D2 = true;
                yiVar.dismiss();
            }
            J1 = false;
        } else {
            J1 = yiVar.J1(i10, z10, i11, yiVar.u1(), j3);
        }
        pf pfVar = yiVar.f33234h0;
        if (pfVar != null) {
            pfVar.h(!J1);
            yiVar.f33234h0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.i iVar = (l5.i) this.f1999c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1998b));
        String str = iVar.f15411a;
        i5.d dVar = iVar.f15413c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f15411a);
            contentValues.put("priority", Integer.valueOf(v5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        int i12 = this.f1997a;
        Object obj = this.f1999c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.Q0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f1998b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f1998b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
                return;
        }
    }

    @Override
    public g2.h createDataSource() {
        return new f81(((k81) this.f1999c).h.createDataSource(), this.f1998b);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.o oVar = (org.telegram.ui.o) this.f1999c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            oVar.onComplete(new Pair(Long.valueOf(this.f1998b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f1997a) {
            case 8:
                wo0 wo0Var = ((ty) this.f1999c).C0.f25766b0;
                a0.i iVar = wo0Var.f10645x0;
                long j3 = this.f1998b;
                gg.g0 g0Var = (gg.g0) iVar.f(j3);
                if (g0Var != null) {
                    wo0Var.f10645x0.l(j3);
                    wo0Var.f10639t0.remove(g0Var);
                    wo0Var.f10641v0.remove(g0Var);
                    wo0Var.f10640u0.remove(g0Var);
                    wo0Var.l();
                    MessagesStorage.getInstance(wo0Var.f10638s0).getStorageQueue().postRunnable(new j(wo0Var, j3, 10));
                    return;
                }
                return;
            default:
                ((fy) this.f1999c).f37715a.getMediaDataController().removePeer(this.f1998b);
                return;
        }
    }

    @Override
    public Object h(m4.b0 b0Var, m4.r rVar, int i10) {
        return b0Var.q(rVar, e9.i0.z((b2.k0) this.f1999c), 0, this.f1998b);
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        pf1 pf1Var = (pf1) this.f1999c;
        org.telegram.ui.ActionBar.n2 n2Var = pf1Var.f40791b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = n2Var.getMessagesController();
            f fVar = new f(18);
            long j3 = this.f1998b;
            messagesController.addUserToChat(j3, (TLRPC.User) arrayList.get(i11), i10, null, n2Var, false, fVar, null, new ei.s3(pf1Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        d2 d2Var = (d2) this.f1999c;
        if (tL_error == null) {
            if (d2Var.E == null || d2Var.f814w) {
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
                tL_groupCallParticipant.peer = MessagesController.getInstance(d2Var.f809e).getPeer(d2Var.f807b);
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
            nativeInstance2.onRequestTimeComplete(this.f1998b, r0);
        }
    }

    public z1(Object obj, long j3, int i10) {
        this.f1997a = i10;
        this.f1999c = obj;
        this.f1998b = j3;
    }

    @Override
    public void run(String str) {
        ci.y9 y9Var = (ci.y9) this.f1999c;
        y9Var.W.j1().r(this.f1998b, str, new ci.n9(y9Var, 2));
    }

    @Override
    public void run(boolean z10) {
        zn znVar = ((c41) this.f1999c).h;
        if (com.google.android.gms.internal.vision.e2.t(znVar)) {
            znVar.va(this.f1998b, false);
        }
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
