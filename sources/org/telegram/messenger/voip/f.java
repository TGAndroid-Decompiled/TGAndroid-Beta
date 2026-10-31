package org.telegram.messenger.voip;

import android.app.Activity;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.cc;
import org.telegram.ui.c01;
import org.telegram.ui.un;
public final class f implements Runnable {
    public final int f18636a = 0;
    public final long f18637b;
    public final Object f18638c;
    public final Object d;
    public final Object e;
    public final Object f18639f;
    public final Object h;
    public final Object f18640n;

    public f(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f18638c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f18637b = j10;
        this.e = tLObject;
        this.f18639f = tL_error;
        this.h = atomicBoolean;
        this.f18640n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize x10;
        TLRPC.TL_photos_photo tL_photos_photo;
        un unVar;
        int i10 = this.f18636a;
        long j10 = this.f18637b;
        Object obj = this.f18640n;
        Object obj2 = this.h;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.f18638c;
        Object obj6 = this.f18639f;
        switch (i10) {
            case 0:
                ((ConferenceCall) obj5).lambda$poll$7((TL_phone.getGroupCallChainBlocks) obj3, this.f18637b, (TLObject) obj4, (TLRPC.TL_error) obj6, (AtomicBoolean) obj2, (AtomicInteger) obj);
                return;
            case 1:
                c60 c60Var = (c60) obj5;
                ((x1) obj3).c(400L);
                c60.M0((Context) obj4, c60Var.f21583a, -j10, ((TLRPC.TL_chatInviteExported) obj6).subscription_pricing, (TLRPC.TL_chatInviteImporter) obj2, (TLRPC.ChannelParticipant) obj, c60Var.I0);
                return;
            case 2:
                Activity activity = (Activity) obj5;
                p6 p6Var = (p6) obj3;
                c01 c01Var = new c01(activity, p6Var, this.f18637b, (byte[]) obj6);
                c01Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) obj4));
                c01Var.f36359r1 = new xa.n((un) obj2, activity, p6Var, (jj) obj);
                c01Var.show();
                return;
            default:
                un unVar2 = (un) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) obj3;
                String str = (String) obj2;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) obj;
                if (((TLRPC.TL_error) obj6) == null) {
                    TLRPC.User Z1 = unVar2.getMessagesController().Z1(Long.valueOf(unVar2.getUserConfig().e()));
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject;
                    ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo2.photo.sizes;
                    TLRPC.PhotoSize w9 = b8.w(arrayList, 150, false, null, false);
                    TLRPC.PhotoSize w10 = b8.w(arrayList, 800, false, null, false);
                    if (tL_photos_photo2.photo.video_sizes.isEmpty()) {
                        x10 = null;
                    } else {
                        x10 = b8.x(1000, tL_photos_photo2.photo.video_sizes);
                    }
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    Z1.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo2.photo.f19817id;
                    if (w9 != null) {
                        tL_userProfilePhoto.photo_small = w9.location;
                    }
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_big = w10.location;
                    }
                    boolean z10 = true;
                    if (w9 != null && fileLocationArr[0] != null) {
                        b8.G(unVar2.getCurrentAccount());
                        File K = b8.K(w9, null, true, true);
                        b8.G(unVar2.getCurrentAccount());
                        b8.K(fileLocationArr[0], null, true, true).renameTo(K);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String p5 = a1.g.p(sb2, fileLocationArr[0].local_id, "@50_50");
                        StringBuilder sb3 = new StringBuilder();
                        tL_photos_photo = tL_photos_photo2;
                        unVar = unVar2;
                        sb3.append(w9.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        hc.D().S(p5, a1.g.p(sb3, w9.location.local_id, "@50_50"), ic.m(unVar.getCurrentAccount(), 1, Z1));
                    } else {
                        tL_photos_photo = tL_photos_photo2;
                        unVar = unVar2;
                    }
                    if (x10 != null && str != null) {
                        b8.G(unVar.getCurrentAccount());
                        new File(str).renameTo(b8.K(x10, "mp4", z10, z10));
                    } else if (w10 != null && fileLocationArr2[0] != null) {
                        b8.G(unVar.getCurrentAccount());
                        File K2 = b8.K(w10, null, true, true);
                        b8.G(unVar.getCurrentAccount());
                        b8.K(fileLocationArr2[0], null, true, true).renameTo(K2);
                    }
                    unVar.getMessagesController().T0(Z1.f19942id);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(Z1);
                    unVar.getMessagesStorage().m1(arrayList2, null, false, true);
                    TLRPC.UserFull a2 = unVar.getMessagesController().a2(j10);
                    a2.profile_photo = tL_photos_photo.photo;
                    unVar.getMessagesStorage().j2(a2, false);
                    un unVar3 = unVar;
                    cc.a0(unVar3).V(Collections.singletonList(Z1), org.telegram.messenger.i0.W2(cd.L0(2131754219, null)), org.telegram.messenger.i0.T2(cd.L0(2131754220, null), new mg.t0(j10, unVar3)), null).j();
                    return;
                }
                return;
        }
    }

    public f(TLObject tLObject, Activity activity, p6 p6Var, long j10, byte[] bArr, un unVar, jj jjVar) {
        this.e = tLObject;
        this.f18638c = activity;
        this.d = p6Var;
        this.f18637b = j10;
        this.f18639f = bArr;
        this.h = unVar;
        this.f18640n = jjVar;
    }

    public f(TLRPC.TL_error tL_error, un unVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f18639f = tL_error;
        this.f18638c = unVar;
        this.e = tLObject;
        this.d = fileLocationArr;
        this.h = str;
        this.f18640n = fileLocationArr2;
        this.f18637b = j10;
    }

    public f(c60 c60Var, x1 x1Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.f18638c = c60Var;
        this.d = x1Var;
        this.e = context;
        this.f18637b = j10;
        this.f18639f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f18640n = channelParticipant;
    }
}
