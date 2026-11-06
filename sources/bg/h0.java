package bg;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m50;
import org.telegram.ui.an;
import org.telegram.ui.oy0;
public final class h0 implements Runnable {
    public final int f3290a = 1;
    public final long f3291b;
    public final Object f3292c;
    public final Object d;
    public final Object f3293e;
    public final Object f3294f;
    public final Object h;
    public final Object f3295n;

    public h0(long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f3293e = conferenceCall;
        this.f3294f = getgroupcallchainblocks;
        this.f3291b = j3;
        this.f3292c = tLObject;
        this.d = tL_error;
        this.h = atomicBoolean;
        this.f3295n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize x10;
        an anVar;
        TLRPC.FileLocation[] fileLocationArr;
        boolean z9;
        final boolean z10;
        int i7;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        int i10 = this.f3290a;
        long j3 = this.f3291b;
        Object obj = this.f3295n;
        Object obj2 = this.f3293e;
        Object obj3 = this.h;
        Object obj4 = this.f3294f;
        Object obj5 = this.d;
        Object obj6 = this.f3292c;
        switch (i10) {
            case 0:
                an anVar2 = (an) obj2;
                TLObject tLObject = (TLObject) obj6;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) obj4;
                String str = (String) obj;
                TLRPC.FileLocation[] fileLocationArr3 = (TLRPC.FileLocation[]) obj3;
                if (((TLRPC.TL_error) obj5) == null) {
                    TLRPC.User a22 = anVar2.getMessagesController().a2(Long.valueOf(anVar2.getUserConfig().e()));
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
                    a22.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f26976id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 != null && fileLocationArr2[0] != null) {
                        w7.G(anVar2.getCurrentAccount());
                        File K = w7.K(w10, null, true, true);
                        w7.G(anVar2.getCurrentAccount());
                        w7.K(fileLocationArr2[0], null, true, true).renameTo(K);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr2[0].volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(fileLocationArr2[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        anVar = anVar2;
                        fileLocationArr = fileLocationArr3;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        z9 = true;
                        gc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), hc.m(anVar.getCurrentAccount(), 1, a22));
                    } else {
                        anVar = anVar2;
                        fileLocationArr = fileLocationArr3;
                        z9 = true;
                    }
                    if (x10 != null && str != null) {
                        w7.G(anVar.getCurrentAccount());
                        new File(str).renameTo(w7.K(x10, "mp4", z9, z9));
                    } else if (w11 != null && fileLocationArr[0] != null) {
                        w7.G(anVar.getCurrentAccount());
                        File K2 = w7.K(w11, null, true, true);
                        w7.G(anVar.getCurrentAccount());
                        w7.K(fileLocationArr[0], null, true, true).renameTo(K2);
                    }
                    anVar.getMessagesController().U0(a22.f27101id);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(a22);
                    anVar.getMessagesStorage().m1(arrayList2, null, false, true);
                    TLRPC.UserFull b22 = anVar.getMessagesController().b2(j3);
                    b22.profile_photo = tL_photos_photo.photo;
                    anVar.getMessagesStorage().j2(b22, false);
                    an anVar3 = anVar;
                    org.telegram.ui.Components.hc.a0(anVar3).V(Collections.singletonList(a22), org.telegram.messenger.g0.X2(hd.M0(2131754219, null)), org.telegram.messenger.g0.U2(hd.M0(2131754220, null), new j0(j3, anVar3)), null).j();
                    return;
                }
                return;
            case 1:
                ((ConferenceCall) obj2).lambda$poll$7((TL_phone.getGroupCallChainBlocks) obj4, this.f3291b, (TLObject) obj6, (TLRPC.TL_error) obj5, (AtomicBoolean) obj3, (AtomicInteger) obj);
                return;
            case 2:
                m50 m50Var = (m50) obj5;
                ((u1) obj2).c(400L);
                m50.M0((Context) obj6, m50Var.f28612a, -j3, ((TLRPC.TL_chatInviteExported) obj4).subscription_pricing, (TLRPC.TL_chatInviteImporter) obj3, (TLRPC.ChannelParticipant) obj, m50Var.I0);
                return;
            case 3:
                final l11 l11Var = (l11) obj5;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj2;
                z0 z0Var = (z0) obj6;
                final k60 k60Var = (k60) obj4;
                final TLRPC.User user = (TLRPC.User) obj3;
                final TLRPC.Chat chat = (TLRPC.Chat) obj;
                if ((channelParticipant instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant.banned_rights) != null && tL_chatBannedRights.view_messages) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z0Var.setVisibility(0);
                if (z10) {
                    i7 = 2131743913;
                } else {
                    i7 = 2131753726;
                }
                z0Var.setText(hd.M0(i7, null));
                final long j10 = this.f3291b;
                z0Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        l11 l11Var2 = l11.this;
                        int i11 = l11Var2.f35485e;
                        k60Var.u();
                        boolean z11 = z10;
                        TLRPC.User user2 = user;
                        if (!z11) {
                            org.telegram.messenger.qp.s1(i11).g0(j10, user2, null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = org.telegram.messenger.qp.n1(user2);
                        tL_channels_editBanned.channel = org.telegram.messenger.qp.i1(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new x1(l11Var2, 14));
                    }
                });
                return;
            default:
                Activity activity = (Activity) obj5;
                f6 f6Var = (f6) obj4;
                oy0 oy0Var = new oy0(activity, f6Var, this.f3291b, (byte[]) obj3);
                oy0Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) obj6));
                oy0Var.f48575r1 = new ab.b0((an) obj2, activity, f6Var, (ij) obj, 10);
                oy0Var.show();
                return;
        }
    }

    public h0(TLObject tLObject, Activity activity, f6 f6Var, long j3, byte[] bArr, an anVar, ij ijVar) {
        this.f3292c = tLObject;
        this.d = activity;
        this.f3294f = f6Var;
        this.f3291b = j3;
        this.h = bArr;
        this.f3293e = anVar;
        this.f3295n = ijVar;
    }

    public h0(TLRPC.TL_error tL_error, an anVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.d = tL_error;
        this.f3293e = anVar;
        this.f3292c = tLObject;
        this.f3294f = fileLocationArr;
        this.f3295n = str;
        this.h = fileLocationArr2;
        this.f3291b = j3;
    }

    public h0(m50 m50Var, u1 u1Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = m50Var;
        this.f3293e = u1Var;
        this.f3292c = context;
        this.f3291b = j3;
        this.f3294f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f3295n = channelParticipant;
    }

    public h0(l11 l11Var, TLRPC.ChannelParticipant channelParticipant, z0 z0Var, k60 k60Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = l11Var;
        this.f3293e = channelParticipant;
        this.f3292c = z0Var;
        this.f3294f = k60Var;
        this.f3291b = j3;
        this.h = user;
        this.f3295n = chat;
    }
}
