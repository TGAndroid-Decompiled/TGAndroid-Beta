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
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.wi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ad0;
import org.telegram.ui.dy;
import org.telegram.ui.gf1;
import org.telegram.ui.ty;
import org.telegram.ui.x60;
import org.telegram.ui.xn;
public final class z1 implements RequestDelegateTimestamp, MessagesStorage.StringCallback, m4.z0, ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.d5, ad0, MessagesStorage.BooleanCallback, g2.g, org.telegram.ui.ActionBar.b2, x60, s5.f {
    public final int f1772a;
    public final long f1773b;
    public final Object f1774c;

    public z1(long j3, l5.i iVar) {
        this.f1772a = 12;
        this.f1773b = j3;
        this.f1774c = iVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean D1;
        wi wiVar = (wi) this.f1774c;
        oi oiVar = wiVar.f30023y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar.f29974j0;
        long j3 = this.f1773b;
        if (oiVar != chatAttachAlertPhotoLayout && oiVar != wiVar.f29994q0) {
            if (!oiVar.I(i10, z10, i11, wiVar.p1(), j3)) {
                wiVar.A2 = true;
                wiVar.dismiss();
            }
            D1 = false;
        } else {
            D1 = wiVar.D1(i10, z10, i11, wiVar.p1(), j3);
        }
        nf nfVar = wiVar.f29968h0;
        if (nfVar != null) {
            nfVar.h(!D1);
            wiVar.f29968h0 = null;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.i iVar = (l5.i) this.f1774c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1773b));
        String str = iVar.f14121a;
        i5.d dVar = iVar.f14123c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f14121a);
            contentValues.put("priority", Integer.valueOf(v5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        int i12 = this.f1772a;
        Object obj = this.f1774c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.P0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f1773b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f1773b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                return;
        }
    }

    @Override
    public g2.h createDataSource() {
        return new p71(((u71) this.f1774c).h.createDataSource(), this.f1773b);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.p pVar = (org.telegram.ui.p) this.f1774c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null) {
            Bitmap bitmap = bitmapSafe.bitmap;
            if (bitmap == null) {
                Drawable drawable = bitmapSafe.drawable;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            pVar.onComplete(new Pair(Long.valueOf(this.f1773b), bitmap));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f1772a) {
            case 8:
                fo0 fo0Var = ((ty) this.f1774c).C0.f26496c0;
                a0.i iVar = fo0Var.f9778x0;
                long j3 = this.f1773b;
                gg.h0 h0Var = (gg.h0) iVar.f(j3);
                if (h0Var != null) {
                    fo0Var.f9778x0.l(j3);
                    fo0Var.f9772t0.remove(h0Var);
                    fo0Var.f9774v0.remove(h0Var);
                    fo0Var.f9773u0.remove(h0Var);
                    fo0Var.l();
                    MessagesStorage.getInstance(fo0Var.f9771s0).getStorageQueue().postRunnable(new gg.q(fo0Var, j3, 0));
                    return;
                }
                return;
            default:
                ((dy) this.f1774c).f33063a.getMediaDataController().removePeer(this.f1773b);
                return;
        }
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        return a0Var.q(rVar, e9.i0.z((b2.k0) this.f1774c), 0, this.f1773b);
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        gf1 gf1Var = (gf1) this.f1774c;
        org.telegram.ui.ActionBar.o2 o2Var = gf1Var.f33921b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            MessagesController messagesController = o2Var.getMessagesController();
            f fVar = new f(18);
            long j3 = this.f1773b;
            messagesController.addUserToChat(j3, (TLRPC.User) arrayList.get(i11), i10, null, o2Var, false, fVar, null, new ei.s3(gf1Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
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
        d2 d2Var = (d2) this.f1774c;
        if (tL_error == null) {
            if (d2Var.E == null || d2Var.f704w) {
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
                tL_groupCallParticipant.peer = MessagesController.getInstance(d2Var.e).getPeer(d2Var.f698b);
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
            nativeInstance2.onRequestTimeComplete(this.f1773b, r0);
        }
    }

    public z1(Object obj, long j3, int i10) {
        this.f1772a = i10;
        this.f1774c = obj;
        this.f1773b = j3;
    }

    @Override
    public void run(String str) {
        ci.x9 x9Var = (ci.x9) this.f1774c;
        x9Var.W.i1().r(this.f1773b, str, new ci.m9(x9Var, 2));
    }

    @Override
    public void run(boolean z10) {
        xn xnVar = ((m31) this.f1774c).h;
        if (com.google.android.gms.internal.vision.e2.u(xnVar)) {
            xnVar.qa(this.f1773b, false);
        }
    }

    @Override
    public void c(TLRPC.User user) {
    }
}
