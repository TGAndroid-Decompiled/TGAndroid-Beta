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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
import org.telegram.ui.e41;
import org.telegram.ui.le;
import org.telegram.ui.w31;
public final class e implements Runnable {
    public final int f19353a = 0;
    public final long f19354b;
    public final Object f19355c;
    public final Object d;
    public final Object f19356e;
    public final Object f19357f;
    public final Object h;
    public final Object f19358n;

    public e(long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f19355c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f19354b = j3;
        this.f19356e = tLObject;
        this.f19357f = tL_error;
        this.h = atomicBoolean;
        this.f19358n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z10;
        switch (this.f19353a) {
            case 0:
                ((ConferenceCall) this.f19355c).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.d, this.f19354b, (TLObject) this.f19356e, (TLRPC.TL_error) this.f19357f, (AtomicBoolean) this.h, (AtomicInteger) this.f19358n);
                return;
            case 1:
                r60.n((r60) this.f19355c, (b2) this.d, (Context) this.f19356e, this.f19354b, (TLRPC.TL_chatInviteExported) this.f19357f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f19358n);
                return;
            case 2:
                Activity activity = (Activity) this.f19355c;
                f6 f6Var = (f6) this.d;
                byte[] bArr = (byte[]) this.f19357f;
                MessageObject messageObject = (MessageObject) this.f19358n;
                e41 e41Var = new e41(activity, f6Var, this.f19354b, bArr);
                e41Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f19356e));
                e41Var.f35930s = new w31((co) this.h, activity, f6Var, messageObject);
                e41Var.show();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19357f;
                co coVar = (co) this.f19355c;
                TLObject tLObject = (TLObject) this.f19356e;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
                String str = (String) this.h;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f19358n;
                if (tL_error == null) {
                    TLRPC.User user = coVar.getMessagesController().getUser(Long.valueOf(coVar.getUserConfig().getClientUserId()));
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f19893id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(coVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(coVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String n10 = a4.a.n(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(coVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(coVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(coVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(coVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    coVar.getMessagesController().getDialogPhotos(user.f20016id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    coVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = coVar.getMessagesController();
                    long j3 = this.f19354b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j3);
                    userFull.profile_photo = tL_photos_photo.photo;
                    coVar.getMessagesStorage().updateUserInfo(userFull, false);
                    yc.a0(coVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new le(j3, coVar)), null).j();
                    return;
                }
                return;
        }
    }

    public e(TLObject tLObject, Activity activity, f6 f6Var, long j3, byte[] bArr, co coVar, MessageObject messageObject) {
        this.f19356e = tLObject;
        this.f19355c = activity;
        this.d = f6Var;
        this.f19354b = j3;
        this.f19357f = bArr;
        this.h = coVar;
        this.f19358n = messageObject;
    }

    public e(TLRPC.TL_error tL_error, co coVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f19357f = tL_error;
        this.f19355c = coVar;
        this.f19356e = tLObject;
        this.d = fileLocationArr;
        this.h = str;
        this.f19358n = fileLocationArr2;
        this.f19354b = j3;
    }

    public e(r60 r60Var, b2 b2Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.f19355c = r60Var;
        this.d = b2Var;
        this.f19356e = context;
        this.f19354b = j3;
        this.f19357f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f19358n = channelParticipant;
    }
}
