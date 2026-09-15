package org.telegram.messenger.voip;

import android.app.Activity;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.vc;
import org.telegram.ui.b41;
import org.telegram.ui.bo;
import org.telegram.ui.ke;
import org.telegram.ui.t31;
public final class e implements Runnable {
    public final int f17636a = 0;
    public final long f17637b;
    public final Object f17638c;
    public final Object d;
    public final Object e;
    public final Object f17639f;
    public final Object h;
    public final Object f17640n;

    public e(long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f17638c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f17637b = j3;
        this.e = tLObject;
        this.f17639f = tL_error;
        this.h = atomicBoolean;
        this.f17640n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z10;
        switch (this.f17636a) {
            case 0:
                ((ConferenceCall) this.f17638c).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.d, this.f17637b, (TLObject) this.e, (TLRPC.TL_error) this.f17639f, (AtomicBoolean) this.h, (AtomicInteger) this.f17640n);
                return;
            case 1:
                r60.n((r60) this.f17638c, (b2) this.d, (Context) this.e, this.f17637b, (TLRPC.TL_chatInviteExported) this.f17639f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f17640n);
                return;
            case 2:
                Activity activity = (Activity) this.f17638c;
                e6 e6Var = (e6) this.d;
                byte[] bArr = (byte[]) this.f17639f;
                MessageObject messageObject = (MessageObject) this.f17640n;
                b41 b41Var = new b41(activity, e6Var, this.f17637b, bArr);
                b41Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.e));
                b41Var.f32049s = new t31((bo) this.h, activity, e6Var, messageObject);
                b41Var.show();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17639f;
                bo boVar = (bo) this.f17638c;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
                String str = (String) this.h;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f17640n;
                if (tL_error == null) {
                    TLRPC.User user = boVar.getMessagesController().getUser(Long.valueOf(boVar.getUserConfig().getClientUserId()));
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
                    if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                        closestVideoSizeWithSize = null;
                    } else {
                        closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
                    }
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f18136id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(boVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(boVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String n10 = a4.a.n(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(boVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(boVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(boVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(boVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    boVar.getMessagesController().getDialogPhotos(user.f18259id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    boVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = boVar.getMessagesController();
                    long j3 = this.f17637b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j3);
                    userFull.profile_photo = tL_photos_photo.photo;
                    boVar.getMessagesStorage().updateUserInfo(userFull, false);
                    vc.a0(boVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new ke(j3, boVar)), null).j();
                    return;
                }
                return;
        }
    }

    public e(TLObject tLObject, Activity activity, e6 e6Var, long j3, byte[] bArr, bo boVar, MessageObject messageObject) {
        this.e = tLObject;
        this.f17638c = activity;
        this.d = e6Var;
        this.f17637b = j3;
        this.f17639f = bArr;
        this.h = boVar;
        this.f17640n = messageObject;
    }

    public e(TLRPC.TL_error tL_error, bo boVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f17639f = tL_error;
        this.f17638c = boVar;
        this.e = tLObject;
        this.d = fileLocationArr;
        this.h = str;
        this.f17640n = fileLocationArr2;
        this.f17637b = j3;
    }

    public e(r60 r60Var, b2 b2Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.f17638c = r60Var;
        this.d = b2Var;
        this.e = context;
        this.f17637b = j3;
        this.f17639f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f17640n = channelParticipant;
    }
}
