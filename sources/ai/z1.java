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
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.xi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;
import org.telegram.ui.gf1;
import org.telegram.ui.qy;
import org.telegram.ui.u60;
import org.telegram.ui.wn;
import org.telegram.ui.xc0;
public final class z1 implements RequestDelegateTimestamp, MessagesStorage.StringCallback, m4.z0, ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.d5, xc0, MessagesStorage.BooleanCallback, g2.g, org.telegram.ui.ActionBar.z1, u60, s5.f {
    public final int f1777a;
    public final long f1778b;
    public final Object f1779c;

    public z1(long j3, l5.i iVar) {
        this.f1777a = 12;
        this.f1778b = j3;
        this.f1779c = iVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean G1;
        xi xiVar = (xi) this.f1779c;
        pi piVar = xiVar.f30331y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.f30282j0;
        long j3 = this.f1778b;
        if (piVar != chatAttachAlertPhotoLayout && piVar != xiVar.f30302q0) {
            if (!piVar.I(i10, z10, i11, xiVar.s1(), j3)) {
                xiVar.A2 = true;
                xiVar.dismiss();
            }
            G1 = false;
        } else {
            G1 = xiVar.G1(i10, z10, i11, xiVar.s1(), j3);
        }
        of ofVar = xiVar.f30276h0;
        if (ofVar != null) {
            ofVar.h(!G1);
            xiVar.f30276h0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.i iVar = (l5.i) this.f1779c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1778b));
        String str = iVar.f14135a;
        i5.d dVar = iVar.f14137c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f14135a);
            contentValues.put("priority", Integer.valueOf(v5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        int i12 = this.f1777a;
        Object obj = this.f1779c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.P0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f1778b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f1778b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
        }
    }

    @Override
    public g2.h createDataSource() {
        return new q71(((v71) this.f1779c).h.createDataSource(), this.f1778b);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.o oVar = (org.telegram.ui.o) this.f1779c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            oVar.onComplete(new Pair(Long.valueOf(this.f1778b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f1777a) {
            case 8:
                ho0 ho0Var = ((qy) this.f1779c).C0.f27136b0;
                a0.i iVar = ho0Var.f9784x0;
                long j3 = this.f1778b;
                gg.h0 h0Var = (gg.h0) iVar.f(j3);
                if (h0Var != null) {
                    ho0Var.f9784x0.l(j3);
                    ho0Var.f9778t0.remove(h0Var);
                    ho0Var.f9780v0.remove(h0Var);
                    ho0Var.f9779u0.remove(h0Var);
                    ho0Var.l();
                    MessagesStorage.getInstance(ho0Var.f9777s0).getStorageQueue().postRunnable(new gg.q(ho0Var, j3, 0));
                    return;
                }
                return;
            default:
                ((cy) this.f1779c).f32895a.getMediaDataController().removePeer(this.f1778b);
                return;
        }
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        return a0Var.q(rVar, e9.i0.z((b2.k0) this.f1779c), 0, this.f1778b);
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        gf1 gf1Var = (gf1) this.f1779c;
        org.telegram.ui.ActionBar.m2 m2Var = gf1Var.f34073b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = m2Var.getMessagesController();
            f fVar = new f(18);
            long j3 = this.f1778b;
            messagesController.addUserToChat(j3, (TLRPC.User) arrayList.get(i11), i10, null, m2Var, false, fVar, null, new ei.s3(gf1Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
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
        d2 d2Var = (d2) this.f1779c;
        if (tL_error == null) {
            if (d2Var.E == null || d2Var.f701w) {
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
                tL_groupCallParticipant.peer = MessagesController.getInstance(d2Var.e).getPeer(d2Var.f695b);
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
            nativeInstance2.onRequestTimeComplete(this.f1778b, r0);
        }
    }

    public z1(Object obj, long j3, int i10) {
        this.f1777a = i10;
        this.f1779c = obj;
        this.f1778b = j3;
    }

    @Override
    public void run(String str) {
        ci.y9 y9Var = (ci.y9) this.f1779c;
        y9Var.W.i1().r(this.f1778b, str, new ci.n9(y9Var, 2));
    }

    @Override
    public void run(boolean z10) {
        wn wnVar = ((n31) this.f1779c).h;
        if (com.google.android.gms.internal.vision.e2.u(wnVar)) {
            wnVar.qa(this.f1778b, false);
        }
    }

    @Override
    public void g(TLRPC.User user) {
    }
}
