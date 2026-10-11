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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.t70;
import org.telegram.ui.b41;
import org.telegram.ui.ke;
import org.telegram.ui.t31;
import org.telegram.ui.zn;
public final class e implements Runnable {
    public final int f19575a = 0;
    public final long f19576b;
    public final Object f19577c;
    public final Object d;
    public final Object f19578e;
    public final Object f19579f;
    public final Object h;
    public final Object f19580n;

    public e(long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f19577c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f19576b = j3;
        this.f19578e = tLObject;
        this.f19579f = tL_error;
        this.h = atomicBoolean;
        this.f19580n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z10;
        switch (this.f19575a) {
            case 0:
                ((ConferenceCall) this.f19577c).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.d, this.f19576b, (TLObject) this.f19578e, (TLRPC.TL_error) this.f19579f, (AtomicBoolean) this.h, (AtomicInteger) this.f19580n);
                return;
            case 1:
                t70.p((t70) this.f19577c, (a2) this.d, (Context) this.f19578e, this.f19576b, (TLRPC.TL_chatInviteExported) this.f19579f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f19580n);
                return;
            case 2:
                Activity activity = (Activity) this.f19577c;
                d6 d6Var = (d6) this.d;
                byte[] bArr = (byte[]) this.f19579f;
                MessageObject messageObject = (MessageObject) this.f19580n;
                b41 b41Var = new b41(activity, d6Var, this.f19576b, bArr);
                b41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f19578e));
                b41Var.f36298s = new t31((zn) this.h, activity, d6Var, messageObject);
                b41Var.show();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19579f;
                zn znVar = (zn) this.f19577c;
                TLObject tLObject = (TLObject) this.f19578e;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
                String str = (String) this.h;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f19580n;
                if (tL_error == null) {
                    TLRPC.User user = znVar.getMessagesController().getUser(Long.valueOf(znVar.getUserConfig().getClientUserId()));
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20092id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String o9 = a1.g.o(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(o9, a1.g.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(znVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    znVar.getMessagesController().getDialogPhotos(user.f20215id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    znVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = znVar.getMessagesController();
                    long j3 = this.f19576b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j3);
                    userFull.profile_photo = tL_photos_photo.photo;
                    znVar.getMessagesStorage().updateUserInfo(userFull, false);
                    ad.a0(znVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new ke(j3, znVar)), null).j();
                    return;
                }
                return;
        }
    }

    public e(TLObject tLObject, Activity activity, d6 d6Var, long j3, byte[] bArr, zn znVar, MessageObject messageObject) {
        this.f19578e = tLObject;
        this.f19577c = activity;
        this.d = d6Var;
        this.f19576b = j3;
        this.f19579f = bArr;
        this.h = znVar;
        this.f19580n = messageObject;
    }

    public e(TLRPC.TL_error tL_error, zn znVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f19579f = tL_error;
        this.f19577c = znVar;
        this.f19578e = tLObject;
        this.d = fileLocationArr;
        this.h = str;
        this.f19580n = fileLocationArr2;
        this.f19576b = j3;
    }

    public e(t70 t70Var, a2 a2Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.f19577c = t70Var;
        this.d = a2Var;
        this.f19578e = context;
        this.f19576b = j3;
        this.f19579f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f19580n = channelParticipant;
    }
}
