package cg;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.i50;
import org.telegram.ui.ey0;
import org.telegram.ui.wm;
public final class g0 implements Runnable {
    public final int f4655a = 1;
    public final long f4656b;
    public final Object f4657c;
    public final Object d;
    public final Object f4658e;
    public final Object f4659f;
    public final Object h;
    public final Object f4660n;

    public g0(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f4658e = conferenceCall;
        this.f4659f = getgroupcallchainblocks;
        this.f4656b = j10;
        this.f4657c = tLObject;
        this.d = tL_error;
        this.h = atomicBoolean;
        this.f4660n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize x10;
        wm wmVar;
        TLRPC.FileLocation[] fileLocationArr;
        boolean z10;
        final boolean z11;
        int i3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        int i10 = this.f4655a;
        long j10 = this.f4656b;
        Object obj = this.f4660n;
        Object obj2 = this.f4658e;
        Object obj3 = this.h;
        Object obj4 = this.f4659f;
        Object obj5 = this.d;
        Object obj6 = this.f4657c;
        switch (i10) {
            case 0:
                wm wmVar2 = (wm) obj2;
                TLObject tLObject = (TLObject) obj6;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) obj4;
                String str = (String) obj;
                TLRPC.FileLocation[] fileLocationArr3 = (TLRPC.FileLocation[]) obj3;
                if (((TLRPC.TL_error) obj5) == null) {
                    TLRPC.User a22 = wmVar2.getMessagesController().a2(Long.valueOf(wmVar2.getUserConfig().e()));
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f27025id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 != null && fileLocationArr2[0] != null) {
                        w7.G(wmVar2.getCurrentAccount());
                        File K = w7.K(w10, null, true, true);
                        w7.G(wmVar2.getCurrentAccount());
                        w7.K(fileLocationArr2[0], null, true, true).renameTo(K);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr2[0].volume_id);
                        sb2.append("_");
                        String o10 = a1.g.o(fileLocationArr2[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        wmVar = wmVar2;
                        fileLocationArr = fileLocationArr3;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        zb.D().S(o10, a1.g.o(w10.location.local_id, "@50_50", sb3), ac.m(wmVar.getCurrentAccount(), 1, a22));
                    } else {
                        wmVar = wmVar2;
                        fileLocationArr = fileLocationArr3;
                        z10 = true;
                    }
                    if (x10 != null && str != null) {
                        w7.G(wmVar.getCurrentAccount());
                        new File(str).renameTo(w7.K(x10, "mp4", z10, z10));
                    } else if (w11 != null && fileLocationArr[0] != null) {
                        w7.G(wmVar.getCurrentAccount());
                        File K2 = w7.K(w11, null, true, true);
                        w7.G(wmVar.getCurrentAccount());
                        w7.K(fileLocationArr[0], null, true, true).renameTo(K2);
                    }
                    wmVar.getMessagesController().U0(a22.f27150id);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(a22);
                    wmVar.getMessagesStorage().m1(arrayList2, null, false, true);
                    TLRPC.UserFull b22 = wmVar.getMessagesController().b2(j10);
                    b22.profile_photo = tL_photos_photo.photo;
                    wmVar.getMessagesStorage().j2(b22, false);
                    wm wmVar3 = wmVar;
                    fc.a0(wmVar3).V(Collections.singletonList(a22), org.telegram.messenger.g0.X2(bd.M0(2131754219, null)), org.telegram.messenger.g0.U2(bd.M0(2131754220, null), new i0(j10, wmVar3)), null).j();
                    return;
                }
                return;
            case 1:
                ((ConferenceCall) obj2).lambda$poll$7((TL_phone.getGroupCallChainBlocks) obj4, this.f4656b, (TLObject) obj6, (TLRPC.TL_error) obj5, (AtomicBoolean) obj3, (AtomicInteger) obj);
                return;
            case 2:
                i50 i50Var = (i50) obj5;
                ((s1) obj2).c(400L);
                i50.M0((Context) obj6, i50Var.f28583a, -j10, ((TLRPC.TL_chatInviteExported) obj4).subscription_pricing, (TLRPC.TL_chatInviteImporter) obj3, (TLRPC.ChannelParticipant) obj, i50Var.J0);
                return;
            case 3:
                final g11 g11Var = (g11) obj5;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj2;
                y0 y0Var = (y0) obj6;
                final f60 f60Var = (f60) obj4;
                final TLRPC.User user = (TLRPC.User) obj3;
                final TLRPC.Chat chat = (TLRPC.Chat) obj;
                if ((channelParticipant instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant.banned_rights) != null && tL_chatBannedRights.view_messages) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                y0Var.setVisibility(0);
                if (z11) {
                    i3 = 2131743922;
                } else {
                    i3 = 2131753726;
                }
                y0Var.setText(bd.M0(i3, null));
                final long j11 = this.f4656b;
                y0Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        g11 g11Var2 = g11.this;
                        int i11 = g11Var2.f33925e;
                        f60Var.u();
                        boolean z12 = z11;
                        TLRPC.User user2 = user;
                        if (!z12) {
                            org.telegram.messenger.hp.s1(i11).g0(j11, user2, null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = org.telegram.messenger.hp.n1(user2);
                        tL_channels_editBanned.channel = org.telegram.messenger.hp.i1(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new w1(g11Var2, 14));
                    }
                });
                return;
            default:
                Activity activity = (Activity) obj5;
                e6 e6Var = (e6) obj4;
                ey0 ey0Var = new ey0(activity, e6Var, this.f4656b, (byte[]) obj3);
                ey0Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) obj6));
                ey0Var.f45100s1 = new za.p((wm) obj2, activity, e6Var, (zi) obj);
                ey0Var.show();
                return;
        }
    }

    public g0(TLObject tLObject, Activity activity, e6 e6Var, long j10, byte[] bArr, wm wmVar, zi ziVar) {
        this.f4657c = tLObject;
        this.d = activity;
        this.f4659f = e6Var;
        this.f4656b = j10;
        this.h = bArr;
        this.f4658e = wmVar;
        this.f4660n = ziVar;
    }

    public g0(TLRPC.TL_error tL_error, wm wmVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.d = tL_error;
        this.f4658e = wmVar;
        this.f4657c = tLObject;
        this.f4659f = fileLocationArr;
        this.f4660n = str;
        this.h = fileLocationArr2;
        this.f4656b = j10;
    }

    public g0(i50 i50Var, s1 s1Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = i50Var;
        this.f4658e = s1Var;
        this.f4657c = context;
        this.f4656b = j10;
        this.f4659f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f4660n = channelParticipant;
    }

    public g0(g11 g11Var, TLRPC.ChannelParticipant channelParticipant, y0 y0Var, f60 f60Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.d = g11Var;
        this.f4658e = channelParticipant;
        this.f4657c = y0Var;
        this.f4659f = f60Var;
        this.f4656b = j10;
        this.h = user;
        this.f4660n = chat;
    }
}
