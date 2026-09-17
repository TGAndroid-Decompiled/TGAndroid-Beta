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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.kf;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.y21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b70;
import org.telegram.ui.bo;
import org.telegram.ui.fd0;
import org.telegram.ui.iy;
import org.telegram.ui.pf1;
import org.telegram.ui.wy;
public final class z1 implements RequestDelegateTimestamp, MessagesStorage.StringCallback, m4.f1, ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.b5, fd0, MessagesStorage.BooleanCallback, g2.g, org.telegram.ui.ActionBar.b2, b70, s5.e {
    public final int f1776a;
    public final long f1777b;
    public final Object f1778c;

    public z1(long j3, l5.i iVar) {
        this.f1776a = 12;
        this.f1777b = j3;
        this.f1778c = iVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean G1;
        vi viVar = (vi) this.f1778c;
        ni niVar = viVar.f28803y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f28754j0;
        long j3 = this.f1777b;
        if (niVar != chatAttachAlertPhotoLayout && niVar != viVar.f28774q0) {
            if (!niVar.I(i10, z10, i11, viVar.s1(), j3)) {
                viVar.A2 = true;
                viVar.dismiss();
            }
            G1 = false;
        } else {
            G1 = viVar.G1(i10, z10, i11, viVar.s1(), j3);
        }
        kf kfVar = viVar.f28748h0;
        if (kfVar != null) {
            kfVar.h(!G1);
            viVar.f28748h0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.i iVar = (l5.i) this.f1778c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1777b));
        String str = iVar.f13907a;
        i5.d dVar = iVar.f13909c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f13907a);
            contentValues.put("priority", Integer.valueOf(v5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        int i12 = this.f1776a;
        Object obj = this.f1778c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.M0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f1777b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f1777b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
        }
    }

    @Override
    public g2.h createDataSource() {
        return new c71(((h71) this.f1778c).h.createDataSource(), this.f1777b);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.x5 x5Var = (org.telegram.ui.x5) this.f1778c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            x5Var.onComplete(new Pair(Long.valueOf(this.f1777b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f1776a) {
            case 8:
                sn0 sn0Var = ((wy) this.f1778c).C0.f30548c0;
                a0.i iVar = sn0Var.f9791x0;
                long j3 = this.f1777b;
                gg.h0 h0Var = (gg.h0) iVar.f(j3);
                if (h0Var != null) {
                    sn0Var.f9791x0.l(j3);
                    sn0Var.f9785t0.remove(h0Var);
                    sn0Var.f9787v0.remove(h0Var);
                    sn0Var.f9786u0.remove(h0Var);
                    sn0Var.l();
                    MessagesStorage.getInstance(sn0Var.f9784s0).getStorageQueue().postRunnable(new gg.q(sn0Var, j3, 0));
                    return;
                }
                return;
            default:
                ((iy) this.f1778c).f34705a.getMediaDataController().removePeer(this.f1777b);
                return;
        }
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        return a0Var.q(rVar, e9.i0.z((b2.k0) this.f1778c), 0, this.f1777b);
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        pf1 pf1Var = (pf1) this.f1778c;
        org.telegram.ui.ActionBar.o2 o2Var = pf1Var.f36620b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = o2Var.getMessagesController();
            f fVar = new f(18);
            long j3 = this.f1777b;
            messagesController.addUserToChat(j3, (TLRPC.User) arrayList.get(i11), i10, null, o2Var, false, fVar, null, new ei.s3(pf1Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
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
        d2 d2Var = (d2) this.f1778c;
        if (tL_error == null) {
            if (d2Var.E == null || d2Var.f695w) {
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
                tL_groupCallParticipant.peer = MessagesController.getInstance(d2Var.e).getPeer(d2Var.f689b);
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
            nativeInstance2.onRequestTimeComplete(this.f1777b, r0);
        }
    }

    public z1(Object obj, long j3, int i10) {
        this.f1776a = i10;
        this.f1778c = obj;
        this.f1777b = j3;
    }

    @Override
    public void run(String str) {
        ci.ba baVar = (ci.ba) this.f1778c;
        baVar.W.i1().r(this.f1777b, str, new ci.q9(baVar, 2));
    }

    @Override
    public void run(boolean z10) {
        bo boVar = ((y21) this.f1778c).h;
        if (com.google.android.gms.internal.vision.e2.u(boVar)) {
            boVar.qa(this.f1777b, false);
        }
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
