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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.kf;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.x21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.dd0;
import org.telegram.ui.gy;
import org.telegram.ui.of1;
import org.telegram.ui.uy;
import org.telegram.ui.z60;
public final class z1 implements RequestDelegateTimestamp, MessagesStorage.StringCallback, m4.f1, ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.b5, dd0, MessagesStorage.BooleanCallback, g2.g, org.telegram.ui.ActionBar.a2, z60, s5.e {
    public final int f1773a;
    public final long f1774b;
    public final Object f1775c;

    public z1(long j3, l5.i iVar) {
        this.f1773a = 12;
        this.f1774b = j3;
        this.f1775c = iVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean G1;
        vi viVar = (vi) this.f1775c;
        ni niVar = viVar.f28808y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f28759j0;
        long j3 = this.f1774b;
        if (niVar != chatAttachAlertPhotoLayout && niVar != viVar.f28779q0) {
            if (!niVar.I(i10, z10, i11, viVar.s1(), j3)) {
                viVar.A2 = true;
                viVar.dismiss();
            }
            G1 = false;
        } else {
            G1 = viVar.G1(i10, z10, i11, viVar.s1(), j3);
        }
        kf kfVar = viVar.f28753h0;
        if (kfVar != null) {
            kfVar.h(!G1);
            viVar.f28753h0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.i iVar = (l5.i) this.f1775c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1774b));
        String str = iVar.f13895a;
        i5.d dVar = iVar.f13897c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f13895a);
            contentValues.put("priority", Integer.valueOf(v5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        int i12 = this.f1773a;
        Object obj = this.f1775c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.O0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f1774b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f1774b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
        }
    }

    @Override
    public g2.h createDataSource() {
        return new b71(((g71) this.f1775c).h.createDataSource(), this.f1774b);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.x5 x5Var = (org.telegram.ui.x5) this.f1775c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            x5Var.onComplete(new Pair(Long.valueOf(this.f1774b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f1773a) {
            case 8:
                rn0 rn0Var = ((uy) this.f1775c).C0.f30284b0;
                a0.i iVar = rn0Var.f9787x0;
                long j3 = this.f1774b;
                gg.h0 h0Var = (gg.h0) iVar.f(j3);
                if (h0Var != null) {
                    rn0Var.f9787x0.l(j3);
                    rn0Var.f9781t0.remove(h0Var);
                    rn0Var.f9783v0.remove(h0Var);
                    rn0Var.f9782u0.remove(h0Var);
                    rn0Var.l();
                    MessagesStorage.getInstance(rn0Var.f9780s0).getStorageQueue().postRunnable(new gg.q(rn0Var, j3, 0));
                    return;
                }
                return;
            default:
                ((gy) this.f1775c).f33965a.getMediaDataController().removePeer(this.f1774b);
                return;
        }
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        return a0Var.q(rVar, e9.i0.z((b2.k0) this.f1775c), 0, this.f1774b);
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        of1 of1Var = (of1) this.f1775c;
        org.telegram.ui.ActionBar.n2 n2Var = of1Var.f36215b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = n2Var.getMessagesController();
            f fVar = new f(18);
            long j3 = this.f1774b;
            messagesController.addUserToChat(j3, (TLRPC.User) arrayList.get(i11), i10, null, n2Var, false, fVar, null, new ei.s3(of1Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
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
        d2 d2Var = (d2) this.f1775c;
        if (tL_error == null) {
            if (d2Var.E == null || d2Var.f692w) {
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
                tL_groupCallParticipant.peer = MessagesController.getInstance(d2Var.e).getPeer(d2Var.f686b);
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
            nativeInstance2.onRequestTimeComplete(this.f1774b, r0);
        }
    }

    public z1(Object obj, long j3, int i10) {
        this.f1773a = i10;
        this.f1775c = obj;
        this.f1774b = j3;
    }

    @Override
    public void run(String str) {
        ci.ba baVar = (ci.ba) this.f1775c;
        baVar.W.i1().r(this.f1774b, str, new ci.q9(baVar, 2));
    }

    @Override
    public void run(boolean z10) {
        bo boVar = ((x21) this.f1775c).h;
        if (com.google.android.gms.internal.vision.e2.u(boVar)) {
            boVar.qa(this.f1774b, false);
        }
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
