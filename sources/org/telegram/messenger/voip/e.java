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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.f70;
import org.telegram.ui.Components.yc;
import org.telegram.ui.gg;
import org.telegram.ui.n31;
import org.telegram.ui.v31;
import org.telegram.ui.yn;
public final class e implements Runnable {
    public final int f19536a = 0;
    public final long f19537b;
    public final Object f19538c;
    public final Object d;
    public final Object f19539e;
    public final Object f19540f;
    public final Object h;
    public final Object f19541n;

    public e(long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f19538c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f19537b = j3;
        this.f19539e = tLObject;
        this.f19540f = tL_error;
        this.h = atomicBoolean;
        this.f19541n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z10;
        switch (this.f19536a) {
            case 0:
                ((ConferenceCall) this.f19538c).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.d, this.f19537b, (TLObject) this.f19539e, (TLRPC.TL_error) this.f19540f, (AtomicBoolean) this.h, (AtomicInteger) this.f19541n);
                return;
            case 1:
                f70.n((f70) this.f19538c, (b2) this.d, (Context) this.f19539e, this.f19537b, (TLRPC.TL_chatInviteExported) this.f19540f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f19541n);
                return;
            case 2:
                Activity activity = (Activity) this.f19538c;
                d6 d6Var = (d6) this.d;
                byte[] bArr = (byte[]) this.f19540f;
                MessageObject messageObject = (MessageObject) this.f19541n;
                v31 v31Var = new v31(activity, d6Var, this.f19537b, bArr);
                v31Var.M((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f19539e));
                v31Var.f41547s = new n31((yn) this.h, activity, d6Var, messageObject);
                v31Var.show();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19540f;
                yn ynVar = (yn) this.f19538c;
                TLObject tLObject = (TLObject) this.f19539e;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
                String str = (String) this.h;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f19541n;
                if (tL_error == null) {
                    TLRPC.User user = ynVar.getMessagesController().getUser(Long.valueOf(ynVar.getUserConfig().getClientUserId()));
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20061id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(ynVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(ynVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String n10 = a4.a.n(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(ynVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(ynVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(ynVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(ynVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    ynVar.getMessagesController().getDialogPhotos(user.f20184id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    ynVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = ynVar.getMessagesController();
                    long j3 = this.f19537b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j3);
                    userFull.profile_photo = tL_photos_photo.photo;
                    ynVar.getMessagesStorage().updateUserInfo(userFull, false);
                    yc.a0(ynVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new gg(j3, ynVar)), null).j();
                    return;
                }
                return;
        }
    }

    public e(TLObject tLObject, Activity activity, d6 d6Var, long j3, byte[] bArr, yn ynVar, MessageObject messageObject) {
        this.f19539e = tLObject;
        this.f19538c = activity;
        this.d = d6Var;
        this.f19537b = j3;
        this.f19540f = bArr;
        this.h = ynVar;
        this.f19541n = messageObject;
    }

    public e(TLRPC.TL_error tL_error, yn ynVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f19540f = tL_error;
        this.f19538c = ynVar;
        this.f19539e = tLObject;
        this.d = fileLocationArr;
        this.h = str;
        this.f19541n = fileLocationArr2;
        this.f19537b = j3;
    }

    public e(f70 f70Var, b2 b2Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.f19538c = f70Var;
        this.d = b2Var;
        this.f19539e = context;
        this.f19537b = j3;
        this.f19540f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f19541n = channelParticipant;
    }
}
