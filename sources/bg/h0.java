package bg;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.p50;
import org.telegram.ui.an;
import org.telegram.ui.my0;
public final class h0 implements Runnable {
    public final int f3245a = 1;
    public final long f3246b;
    public final Object f3247c;
    public final Object d;
    public final Object f3248e;
    public final Object f3249f;
    public final Object h;
    public final Object f3250n;

    public h0(long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f3248e = conferenceCall;
        this.f3249f = getgroupcallchainblocks;
        this.f3246b = j3;
        this.f3247c = tLObject;
        this.d = tL_error;
        this.h = atomicBoolean;
        this.f3250n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize x10;
        an anVar;
        TLRPC.FileLocation[] fileLocationArr;
        boolean z10;
        final boolean z11;
        int i7;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        int i10 = this.f3245a;
        long j3 = this.f3246b;
        Object obj = this.f3250n;
        Object obj2 = this.f3248e;
        Object obj3 = this.h;
        Object obj4 = this.f3249f;
        Object obj5 = this.d;
        Object obj6 = this.f3247c;
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f28075id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 != null && fileLocationArr2[0] != null) {
                        w7.G(anVar2.getCurrentAccount());
                        File J = w7.J(w10, null, true, true);
                        w7.G(anVar2.getCurrentAccount());
                        w7.J(fileLocationArr2[0], null, true, true).renameTo(J);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr2[0].volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(fileLocationArr2[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        anVar = anVar2;
                        fileLocationArr = fileLocationArr3;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        fc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), gc.m(anVar.getCurrentAccount(), 1, a22));
                    } else {
                        anVar = anVar2;
                        fileLocationArr = fileLocationArr3;
                        z10 = true;
                    }
                    if (x10 != null && str != null) {
                        w7.G(anVar.getCurrentAccount());
                        new File(str).renameTo(w7.J(x10, "mp4", z10, z10));
                    } else if (w11 != null && fileLocationArr[0] != null) {
                        w7.G(anVar.getCurrentAccount());
                        File J2 = w7.J(w11, null, true, true);
                        w7.G(anVar.getCurrentAccount());
                        w7.J(fileLocationArr[0], null, true, true).renameTo(J2);
                    }
                    anVar.getMessagesController().U0(a22.f28200id);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(a22);
                    anVar.getMessagesStorage().m1(arrayList2, null, false, true);
                    TLRPC.UserFull b22 = anVar.getMessagesController().b2(j3);
                    b22.profile_photo = tL_photos_photo.photo;
                    anVar.getMessagesStorage().j2(b22, false);
                    an anVar3 = anVar;
                    cc.a0(anVar3).V(Collections.singletonList(a22), org.telegram.messenger.g0.X2(hd.M0(2131754219, null)), org.telegram.messenger.g0.U2(hd.M0(2131754220, null), new j0(j3, anVar3)), null).j();
                    return;
                }
                return;
            case 1:
                ((ConferenceCall) obj2).lambda$poll$7((TL_phone.getGroupCallChainBlocks) obj4, this.f3246b, (TLObject) obj6, (TLRPC.TL_error) obj5, (AtomicBoolean) obj3, (AtomicInteger) obj);
                return;
            case 2:
                p50 p50Var = (p50) obj5;
                ((t1) obj2).c(400L);
                p50.M0((Context) obj6, p50Var.f29679a, -j3, ((TLRPC.TL_chatInviteExported) obj4).subscription_pricing, (TLRPC.TL_chatInviteImporter) obj3, (TLRPC.ChannelParticipant) obj, p50Var.J0);
                return;
            case 3:
                final p11 p11Var = (p11) obj5;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj2;
                z0 z0Var = (z0) obj6;
                final m60 m60Var = (m60) obj4;
                final TLRPC.User user = (TLRPC.User) obj3;
                final TLRPC.Chat chat = (TLRPC.Chat) obj;
                if ((channelParticipant instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant.banned_rights) != null && tL_chatBannedRights.view_messages) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z0Var.setVisibility(0);
                if (z11) {
                    i7 = 2131743912;
                } else {
                    i7 = 2131753726;
                }
                z0Var.setText(hd.M0(i7, null));
                final long j10 = this.f3246b;
                z0Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        p11 p11Var2 = p11.this;
                        int i11 = p11Var2.f38152e;
                        m60Var.u();
                        boolean z12 = z11;
                        TLRPC.User user2 = user;
                        if (!z12) {
                            org.telegram.messenger.np.s1(i11).g0(j10, user2, null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = org.telegram.messenger.np.n1(user2);
                        tL_channels_editBanned.channel = org.telegram.messenger.np.i1(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new v1(p11Var2, 14));
                    }
                });
                return;
            default:
                Activity activity = (Activity) obj5;
                e6 e6Var = (e6) obj4;
                my0 my0Var = new my0(activity, e6Var, this.f3246b, (byte[]) obj3);
                my0Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) obj6));
                my0Var.f49349v1 = new xi.e((an) obj2, activity, e6Var, (gj) obj);
                my0Var.show();
                return;
        }
    }

    public h0(TLObject tLObject, Activity activity, e6 e6Var, long j3, byte[] bArr, an anVar, gj gjVar) {
        this.f3247c = tLObject;
        this.d = activity;
        this.f3249f = e6Var;
        this.f3246b = j3;
        this.h = bArr;
        this.f3248e = anVar;
        this.f3250n = gjVar;
    }

    public h0(TLRPC.TL_error tL_error, an anVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.d = tL_error;
        this.f3248e = anVar;
        this.f3247c = tLObject;
        this.f3249f = fileLocationArr;
        this.f3250n = str;
        this.h = fileLocationArr2;
        this.f3246b = j3;
    }

    public h0(p50 p50Var, t1 t1Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = p50Var;
        this.f3248e = t1Var;
        this.f3247c = context;
        this.f3246b = j3;
        this.f3249f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f3250n = channelParticipant;
    }

    public h0(p11 p11Var, TLRPC.ChannelParticipant channelParticipant, z0 z0Var, m60 m60Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = p11Var;
        this.f3248e = channelParticipant;
        this.f3247c = z0Var;
        this.f3249f = m60Var;
        this.f3246b = j3;
        this.h = user;
        this.f3250n = chat;
    }
}
