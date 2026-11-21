package bg;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;
import org.telegram.ui.qy0;
public final class i0 implements Runnable {
    public final int f3280a = 1;
    public final long f3281b;
    public final Object f3282c;
    public final Object d;
    public final Object f3283e;
    public final Object f3284f;
    public final Object h;
    public final Object f3285n;

    public i0(long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f3283e = conferenceCall;
        this.f3284f = getgroupcallchainblocks;
        this.f3281b = j3;
        this.f3282c = tLObject;
        this.d = tL_error;
        this.h = atomicBoolean;
        this.f3285n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize x10;
        bn bnVar;
        TLRPC.FileLocation[] fileLocationArr;
        boolean z10;
        final boolean z11;
        int i7;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        int i10 = this.f3280a;
        long j3 = this.f3281b;
        Object obj = this.f3285n;
        Object obj2 = this.f3283e;
        Object obj3 = this.h;
        Object obj4 = this.f3284f;
        Object obj5 = this.d;
        Object obj6 = this.f3282c;
        switch (i10) {
            case 0:
                bn bnVar2 = (bn) obj2;
                TLObject tLObject = (TLObject) obj6;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) obj4;
                String str = (String) obj;
                TLRPC.FileLocation[] fileLocationArr3 = (TLRPC.FileLocation[]) obj3;
                if (((TLRPC.TL_error) obj5) == null) {
                    TLRPC.User c22 = bnVar2.getMessagesController().c2(Long.valueOf(bnVar2.getUserConfig().e()));
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w10 = w7.w(arrayList, 150, false, null, false);
                    TLRPC.PhotoSize w11 = w7.w(arrayList, 800, false, null, false);
                    if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                        x10 = null;
                    } else {
                        x10 = w7.x(1000, tL_photos_photo.photo.video_sizes);
                    }
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    c22.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f28455id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 != null && fileLocationArr2[0] != null) {
                        w7.G(bnVar2.getCurrentAccount());
                        File J = w7.J(w10, null, true, true);
                        w7.G(bnVar2.getCurrentAccount());
                        w7.J(fileLocationArr2[0], null, true, true).renameTo(J);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr2[0].volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(fileLocationArr2[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        bnVar = bnVar2;
                        fileLocationArr = fileLocationArr3;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ec.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), fc.m(bnVar.getCurrentAccount(), 1, c22));
                    } else {
                        bnVar = bnVar2;
                        fileLocationArr = fileLocationArr3;
                        z10 = true;
                    }
                    if (x10 != null && str != null) {
                        w7.G(bnVar.getCurrentAccount());
                        new File(str).renameTo(w7.J(x10, "mp4", z10, z10));
                    } else if (w11 != null && fileLocationArr[0] != null) {
                        w7.G(bnVar.getCurrentAccount());
                        File J2 = w7.J(w11, null, true, true);
                        w7.G(bnVar.getCurrentAccount());
                        w7.J(fileLocationArr[0], null, true, true).renameTo(J2);
                    }
                    bnVar.getMessagesController().W0(c22.f28580id);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c22);
                    bnVar.getMessagesStorage().m1(arrayList2, null, false, true);
                    TLRPC.UserFull d2 = bnVar.getMessagesController().d2(j3);
                    d2.profile_photo = tL_photos_photo.photo;
                    bnVar.getMessagesStorage().j2(d2, false);
                    bn bnVar3 = bnVar;
                    lc.b0(bnVar3).V(Collections.singletonList(c22), org.telegram.messenger.g0.W2(gd.N0(2131754216, null)), org.telegram.messenger.g0.T2(gd.N0(2131754217, null), new k0(j3, bnVar3)), null).j();
                    return;
                }
                return;
            case 1:
                ((ConferenceCall) obj2).lambda$poll$7((TL_phone.getGroupCallChainBlocks) obj4, this.f3281b, (TLObject) obj6, (TLRPC.TL_error) obj5, (AtomicBoolean) obj3, (AtomicInteger) obj);
                return;
            case 2:
                a60 a60Var = (a60) obj5;
                ((t1) obj2).c(400L);
                a60.N0((Context) obj6, a60Var.f30170a, -j3, ((TLRPC.TL_chatInviteExported) obj4).subscription_pricing, (TLRPC.TL_chatInviteImporter) obj3, (TLRPC.ChannelParticipant) obj, a60Var.J0);
                return;
            case 3:
                final b21 b21Var = (b21) obj5;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj2;
                y0 y0Var = (y0) obj6;
                final a70 a70Var = (a70) obj4;
                final TLRPC.User user = (TLRPC.User) obj3;
                final TLRPC.Chat chat = (TLRPC.Chat) obj;
                if ((channelParticipant instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant.banned_rights) != null && tL_chatBannedRights.view_messages) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                y0Var.setVisibility(0);
                if (z11) {
                    i7 = 2131743669;
                } else {
                    i7 = 2131753723;
                }
                y0Var.setText(gd.N0(i7, null));
                final long j10 = this.f3281b;
                y0Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        b21 b21Var2 = b21.this;
                        int i11 = b21Var2.f33710e;
                        a70Var.v();
                        boolean z12 = z11;
                        TLRPC.User user2 = user;
                        if (!z12) {
                            org.telegram.messenger.mp.u1(i11).g0(j10, user2, null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = org.telegram.messenger.mp.p1(user2);
                        tL_channels_editBanned.channel = org.telegram.messenger.mp.k1(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new f2(b21Var2, 14));
                    }
                });
                return;
            default:
                Activity activity = (Activity) obj5;
                h6 h6Var = (h6) obj4;
                qy0 qy0Var = new qy0(activity, h6Var, this.f3281b, (byte[]) obj3);
                qy0Var.O0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) obj6));
                qy0Var.f51399v1 = new xi.e((bn) obj2, activity, h6Var, (fj) obj);
                qy0Var.show();
                return;
        }
    }

    public i0(TLObject tLObject, Activity activity, h6 h6Var, long j3, byte[] bArr, bn bnVar, fj fjVar) {
        this.f3282c = tLObject;
        this.d = activity;
        this.f3284f = h6Var;
        this.f3281b = j3;
        this.h = bArr;
        this.f3283e = bnVar;
        this.f3285n = fjVar;
    }

    public i0(TLRPC.TL_error tL_error, bn bnVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.d = tL_error;
        this.f3283e = bnVar;
        this.f3282c = tLObject;
        this.f3284f = fileLocationArr;
        this.f3285n = str;
        this.h = fileLocationArr2;
        this.f3281b = j3;
    }

    public i0(a60 a60Var, t1 t1Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = a60Var;
        this.f3283e = t1Var;
        this.f3282c = context;
        this.f3281b = j3;
        this.f3284f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f3285n = channelParticipant;
    }

    public i0(b21 b21Var, TLRPC.ChannelParticipant channelParticipant, y0 y0Var, a70 a70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = b21Var;
        this.f3283e = channelParticipant;
        this.f3282c = y0Var;
        this.f3284f = a70Var;
        this.f3281b = j3;
        this.h = user;
        this.f3285n = chat;
    }
}
